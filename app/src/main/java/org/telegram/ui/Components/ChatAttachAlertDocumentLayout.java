package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Property;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.MimeTypeMap;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.StringTokenizer;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ringtone.RingtoneDataStore;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputPeerEmpty;
import org.telegram.tgnet.TLRPC$TL_messages_search;
import org.telegram.tgnet.TLRPC$TL_messages_searchGlobal;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$messages_Messages;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Adapters.FiltersView;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.SharedDocumentCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.FilteredSearchView;
import org.telegram.ui.PhotoPickerActivity;
/* loaded from: classes3.dex */
public class ChatAttachAlertDocumentLayout extends ChatAttachAlert.AttachAlertLayout {
    private float additionalTranslationY;
    private boolean allowMusic;
    private LinearLayoutManager backgroundLayoutManager;
    private ListAdapter backgroundListAdapter;
    private RecyclerListView backgroundListView;
    private boolean canSelectOnlyImageFiles;
    private int currentAnimationType;
    private File currentDir;
    private DocumentSelectActivityDelegate delegate;
    private StickerEmptyView emptyView;
    private FiltersView filtersView;
    private AnimatorSet filtersViewAnimator;
    private boolean hasFiles;
    private boolean ignoreLayout;
    public boolean isSoundPicker;
    private LinearLayoutManager layoutManager;
    private ListAdapter listAdapter;
    ValueAnimator listAnimation;
    private RecyclerListView listView;
    private FlickerLoadingView loadingView;
    private boolean receiverRegistered;
    private boolean scrolling;
    private SearchAdapter searchAdapter;
    private ActionBarMenuItem searchItem;
    private boolean searching;
    private boolean sendPressed;
    private boolean sortByName;
    private ActionBarMenuItem sortItem;
    private HashMap<String, ListItem> selectedFiles = new HashMap<>();
    private ArrayList<String> selectedFilesOrder = new ArrayList<>();
    private HashMap<FilteredSearchView.MessageHashId, MessageObject> selectedMessages = new HashMap<>();
    private int maxSelectedFiles = -1;
    private BroadcastReceiver receiver = new AnonymousClass1();

    /* loaded from: classes3.dex */
    public interface DocumentSelectActivityDelegate {

        /* renamed from: org.telegram.ui.Components.ChatAttachAlertDocumentLayout$DocumentSelectActivityDelegate$-CC */
        /* loaded from: classes3.dex */
        public final /* synthetic */ class CC {
            public static void $default$didSelectPhotos(DocumentSelectActivityDelegate documentSelectActivityDelegate, ArrayList arrayList, boolean z, int i) {
            }

            public static void $default$startMusicSelectActivity(DocumentSelectActivityDelegate documentSelectActivityDelegate) {
            }
        }

        void didSelectFiles(ArrayList<String> arrayList, String str, ArrayList<MessageObject> arrayList2, boolean z, int i);

        void didSelectPhotos(ArrayList<SendMessagesHelper.SendingMediaInfo> arrayList, boolean z, int i);

        void startDocumentSelectActivity();

        void startMusicSelectActivity();
    }

    public static /* synthetic */ boolean lambda$new$0(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override // org.telegram.ui.Components.ChatAttachAlert.AttachAlertLayout
    int needsActionBar() {
        return 1;
    }

    /* loaded from: classes3.dex */
    public static class ListItem {
        public String ext;
        public File file;
        public int icon;
        public String subtitle;
        public String thumb;
        public String title;

        private ListItem() {
            this.subtitle = "";
            this.ext = "";
        }

        /* synthetic */ ListItem(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public static class HistoryEntry {
        File dir;
        String title;

        private HistoryEntry() {
        }

        /* synthetic */ HistoryEntry(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    /* renamed from: org.telegram.ui.Components.ChatAttachAlertDocumentLayout$1 */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 extends BroadcastReceiver {
        AnonymousClass1() {
            ChatAttachAlertDocumentLayout.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ChatAttachAlertDocumentLayout$1$$ExternalSyntheticLambda0 chatAttachAlertDocumentLayout$1$$ExternalSyntheticLambda0 = new ChatAttachAlertDocumentLayout$1$$ExternalSyntheticLambda0(this);
            if ("android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                ChatAttachAlertDocumentLayout.this.listView.postDelayed(chatAttachAlertDocumentLayout$1$$ExternalSyntheticLambda0, 1000L);
            } else {
                chatAttachAlertDocumentLayout$1$$ExternalSyntheticLambda0.run();
            }
        }

        public /* synthetic */ void lambda$onReceive$0() {
            try {
                if (ChatAttachAlertDocumentLayout.this.currentDir == null) {
                    ChatAttachAlertDocumentLayout.this.listRoots();
                } else {
                    ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout = ChatAttachAlertDocumentLayout.this;
                    chatAttachAlertDocumentLayout.listFiles(chatAttachAlertDocumentLayout.currentDir);
                }
                ChatAttachAlertDocumentLayout.this.updateSearchButton();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public ChatAttachAlertDocumentLayout(ChatAttachAlert chatAttachAlert, Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(chatAttachAlert, context, resourcesProvider);
        this.receiverRegistered = false;
        this.listAdapter = new ListAdapter(context);
        this.allowMusic = i == 1;
        this.isSoundPicker = i == 2;
        this.sortByName = SharedConfig.sortFilesByName;
        loadRecentFiles();
        this.searching = false;
        if (!this.receiverRegistered) {
            this.receiverRegistered = true;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.MEDIA_BAD_REMOVAL");
            intentFilter.addAction("android.intent.action.MEDIA_CHECKING");
            intentFilter.addAction("android.intent.action.MEDIA_EJECT");
            intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
            intentFilter.addAction("android.intent.action.MEDIA_NOFS");
            intentFilter.addAction("android.intent.action.MEDIA_REMOVED");
            intentFilter.addAction("android.intent.action.MEDIA_SHARED");
            intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTABLE");
            intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
            intentFilter.addDataScheme("file");
            ApplicationLoader.applicationContext.registerReceiver(this.receiver, intentFilter);
        }
        ActionBarMenu createMenu = this.parentAlert.actionBar.createMenu();
        ActionBarMenuItem actionBarMenuItemSearchListener = createMenu.addItem(0, 2131165456).setIsSearchField(true).setActionBarMenuItemSearchListener(new AnonymousClass2());
        this.searchItem = actionBarMenuItemSearchListener;
        actionBarMenuItemSearchListener.setSearchFieldHint(LocaleController.getString("Search", 2131628155));
        this.searchItem.setContentDescription(LocaleController.getString("Search", 2131628155));
        EditTextBoldCursor searchField = this.searchItem.getSearchField();
        searchField.setTextColor(getThemedColor("dialogTextBlack"));
        searchField.setCursorColor(getThemedColor("dialogTextBlack"));
        searchField.setHintTextColor(getThemedColor("chat_messagePanelHint"));
        ActionBarMenuItem addItem = createMenu.addItem(6, this.sortByName ? 2131165696 : 2131165694);
        this.sortItem = addItem;
        addItem.setContentDescription(LocaleController.getString("AccDescrContactSorting", 2131623979));
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, resourcesProvider);
        this.loadingView = flickerLoadingView;
        addView(flickerLoadingView);
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(context, this.loadingView, 1, resourcesProvider);
        this.emptyView = anonymousClass3;
        addView(anonymousClass3, LayoutHelper.createFrame(-1, -1.0f));
        this.emptyView.setVisibility(8);
        this.emptyView.setOnTouchListener(ChatAttachAlertDocumentLayout$$ExternalSyntheticLambda1.INSTANCE);
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(context, resourcesProvider);
        this.backgroundListView = anonymousClass4;
        anonymousClass4.setSectionsType(2);
        this.backgroundListView.setVerticalScrollBarEnabled(false);
        RecyclerListView recyclerListView = this.backgroundListView;
        FillLastLinearLayoutManager fillLastLinearLayoutManager = new FillLastLinearLayoutManager(context, 1, false, AndroidUtilities.dp(56.0f), this.backgroundListView);
        this.backgroundLayoutManager = fillLastLinearLayoutManager;
        recyclerListView.setLayoutManager(fillLastLinearLayoutManager);
        this.backgroundListView.setClipToPadding(false);
        RecyclerListView recyclerListView2 = this.backgroundListView;
        ListAdapter listAdapter = new ListAdapter(context);
        this.backgroundListAdapter = listAdapter;
        recyclerListView2.setAdapter(listAdapter);
        this.backgroundListView.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        addView(this.backgroundListView, LayoutHelper.createFrame(-1, -1.0f));
        this.backgroundListView.setVisibility(8);
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(context, resourcesProvider);
        this.listView = anonymousClass5;
        anonymousClass5.setSectionsType(2);
        this.listView.setVerticalScrollBarEnabled(false);
        RecyclerListView recyclerListView3 = this.listView;
        AnonymousClass6 anonymousClass6 = new AnonymousClass6(context, 1, false, AndroidUtilities.dp(56.0f), this.listView);
        this.layoutManager = anonymousClass6;
        recyclerListView3.setLayoutManager(anonymousClass6);
        this.listView.setClipToPadding(false);
        this.listView.setAdapter(this.listAdapter);
        this.listView.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.searchAdapter = new SearchAdapter(context);
        this.listView.setOnScrollListener(new AnonymousClass7());
        this.listView.setOnItemClickListener(new ChatAttachAlertDocumentLayout$$ExternalSyntheticLambda4(this));
        this.listView.setOnItemLongClickListener(new ChatAttachAlertDocumentLayout$$ExternalSyntheticLambda6(this));
        FiltersView filtersView = new FiltersView(context, resourcesProvider);
        this.filtersView = filtersView;
        filtersView.setOnItemClickListener(new ChatAttachAlertDocumentLayout$$ExternalSyntheticLambda5(this));
        this.filtersView.setBackgroundColor(getThemedColor("dialogBackground"));
        addView(this.filtersView, LayoutHelper.createFrame(-1, -2, 48));
        this.filtersView.setTranslationY(-AndroidUtilities.dp(44.0f));
        this.filtersView.setVisibility(4);
        listRoots();
        updateSearchButton();
        updateEmptyView();
    }

    /* renamed from: org.telegram.ui.Components.ChatAttachAlertDocumentLayout$2 */
    /* loaded from: classes3.dex */
    public class AnonymousClass2 extends ActionBarMenuItem.ActionBarMenuItemSearchListener {
        AnonymousClass2() {
            ChatAttachAlertDocumentLayout.this = r1;
        }

        @Override // org.telegram.ui.ActionBar.ActionBarMenuItem.ActionBarMenuItemSearchListener
        public void onSearchExpand() {
            ChatAttachAlertDocumentLayout.this.searching = true;
            ChatAttachAlertDocumentLayout.this.sortItem.setVisibility(8);
            ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout = ChatAttachAlertDocumentLayout.this;
            chatAttachAlertDocumentLayout.parentAlert.makeFocusable(chatAttachAlertDocumentLayout.searchItem.getSearchField(), true);
        }

        @Override // org.telegram.ui.ActionBar.ActionBarMenuItem.ActionBarMenuItemSearchListener
        public void onSearchCollapse() {
            ChatAttachAlertDocumentLayout.this.searching = false;
            ChatAttachAlertDocumentLayout.this.sortItem.setVisibility(0);
            if (ChatAttachAlertDocumentLayout.this.listView.getAdapter() != ChatAttachAlertDocumentLayout.this.listAdapter) {
                ChatAttachAlertDocumentLayout.this.listView.setAdapter(ChatAttachAlertDocumentLayout.this.listAdapter);
            }
            ChatAttachAlertDocumentLayout.this.listAdapter.notifyDataSetChanged();
            ChatAttachAlertDocumentLayout.this.searchAdapter.search(null, true);
        }

        @Override // org.telegram.ui.ActionBar.ActionBarMenuItem.ActionBarMenuItemSearchListener
        public void onTextChanged(EditText editText) {
            ChatAttachAlertDocumentLayout.this.searchAdapter.search(editText.getText().toString(), false);
        }

        @Override // org.telegram.ui.ActionBar.ActionBarMenuItem.ActionBarMenuItemSearchListener
        public void onSearchFilterCleared(FiltersView.MediaFilterData mediaFilterData) {
            ChatAttachAlertDocumentLayout.this.searchAdapter.removeSearchFilter(mediaFilterData);
            ChatAttachAlertDocumentLayout.this.searchAdapter.search(ChatAttachAlertDocumentLayout.this.searchItem.getSearchField().getText().toString(), false);
            ChatAttachAlertDocumentLayout.this.searchAdapter.updateFiltersView(true, null, null, true);
        }
    }

    /* renamed from: org.telegram.ui.Components.ChatAttachAlertDocumentLayout$3 */
    /* loaded from: classes3.dex */
    public class AnonymousClass3 extends StickerEmptyView {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(Context context, View view, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context, view, i, resourcesProvider);
            ChatAttachAlertDocumentLayout.this = r1;
        }

        @Override // android.view.View
        public void setTranslationY(float f) {
            super.setTranslationY(f + ChatAttachAlertDocumentLayout.this.additionalTranslationY);
        }

        @Override // android.view.View
        public float getTranslationY() {
            return super.getTranslationY() - ChatAttachAlertDocumentLayout.this.additionalTranslationY;
        }
    }

    /* renamed from: org.telegram.ui.Components.ChatAttachAlertDocumentLayout$4 */
    /* loaded from: classes3.dex */
    public class AnonymousClass4 extends RecyclerListView {
        Paint paint = new Paint();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            ChatAttachAlertDocumentLayout.this = r1;
        }

        @Override // org.telegram.ui.Components.RecyclerListView, android.view.ViewGroup, android.view.View
        public void dispatchDraw(Canvas canvas) {
            if (ChatAttachAlertDocumentLayout.this.currentAnimationType == 2 && getChildCount() > 0) {
                float f = 2.14748365E9f;
                for (int i = 0; i < getChildCount(); i++) {
                    if (getChildAt(i).getY() < f) {
                        f = getChildAt(i).getY();
                    }
                }
                this.paint.setColor(Theme.getColor("dialogBackground"));
            }
            super.dispatchDraw(canvas);
        }

        @Override // org.telegram.ui.Components.RecyclerListView, androidx.recyclerview.widget.RecyclerView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (ChatAttachAlertDocumentLayout.this.currentAnimationType != 0) {
                return false;
            }
            return super.onTouchEvent(motionEvent);
        }
    }

    /* renamed from: org.telegram.ui.Components.ChatAttachAlertDocumentLayout$5 */
    /* loaded from: classes3.dex */
    public class AnonymousClass5 extends RecyclerListView {
        Paint paint = new Paint();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            ChatAttachAlertDocumentLayout.this = r1;
        }

        @Override // org.telegram.ui.Components.RecyclerListView, android.view.ViewGroup, android.view.View
        public void dispatchDraw(Canvas canvas) {
            if (ChatAttachAlertDocumentLayout.this.currentAnimationType == 1 && getChildCount() > 0) {
                float f = 2.14748365E9f;
                for (int i = 0; i < getChildCount(); i++) {
                    if (getChildAt(i).getY() < f) {
                        f = getChildAt(i).getY();
                    }
                }
                this.paint.setColor(Theme.getColor("dialogBackground"));
            }
            super.dispatchDraw(canvas);
        }
    }

    /* renamed from: org.telegram.ui.Components.ChatAttachAlertDocumentLayout$6 */
    /* loaded from: classes3.dex */
    public class AnonymousClass6 extends FillLastLinearLayoutManager {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass6(Context context, int i, boolean z, int i2, RecyclerView recyclerView) {
            super(context, i, z, i2, recyclerView);
            ChatAttachAlertDocumentLayout.this = r7;
        }

        /* renamed from: org.telegram.ui.Components.ChatAttachAlertDocumentLayout$6$1 */
        /* loaded from: classes3.dex */
        class AnonymousClass1 extends LinearSmoothScroller {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Context context) {
                super(context);
                AnonymousClass6.this = r1;
            }

            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public int calculateDyToMakeVisible(View view, int i) {
                return super.calculateDyToMakeVisible(view, i) - (ChatAttachAlertDocumentLayout.this.listView.getPaddingTop() - AndroidUtilities.dp(56.0f));
            }

            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public int calculateTimeForDeceleration(int i) {
                return super.calculateTimeForDeceleration(i) * 2;
            }
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(recyclerView.getContext());
            anonymousClass1.setTargetPosition(i);
            startSmoothScroll(anonymousClass1);
        }
    }

    /* renamed from: org.telegram.ui.Components.ChatAttachAlertDocumentLayout$7 */
    /* loaded from: classes3.dex */
    public class AnonymousClass7 extends RecyclerView.OnScrollListener {
        AnonymousClass7() {
            ChatAttachAlertDocumentLayout.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout = ChatAttachAlertDocumentLayout.this;
            chatAttachAlertDocumentLayout.parentAlert.updateLayout(chatAttachAlertDocumentLayout, true, i2);
            ChatAttachAlertDocumentLayout.this.updateEmptyViewPosition();
            if (ChatAttachAlertDocumentLayout.this.listView.getAdapter() == ChatAttachAlertDocumentLayout.this.searchAdapter) {
                int findFirstVisibleItemPosition = ChatAttachAlertDocumentLayout.this.layoutManager.findFirstVisibleItemPosition();
                int findLastVisibleItemPosition = ChatAttachAlertDocumentLayout.this.layoutManager.findLastVisibleItemPosition();
                int abs = Math.abs(findLastVisibleItemPosition - findFirstVisibleItemPosition) + 1;
                int itemCount = recyclerView.getAdapter().getItemCount();
                if (abs <= 0 || findLastVisibleItemPosition < itemCount - 10) {
                    return;
                }
                ChatAttachAlertDocumentLayout.this.searchAdapter.loadMore();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            RecyclerListView.Holder holder;
            boolean z = false;
            if (i == 0) {
                int dp = AndroidUtilities.dp(13.0f);
                int backgroundPaddingTop = ChatAttachAlertDocumentLayout.this.parentAlert.getBackgroundPaddingTop();
                if (((ChatAttachAlertDocumentLayout.this.parentAlert.scrollOffsetY[0] - backgroundPaddingTop) - dp) + backgroundPaddingTop < ActionBar.getCurrentActionBarHeight() && (holder = (RecyclerListView.Holder) ChatAttachAlertDocumentLayout.this.listView.findViewHolderForAdapterPosition(0)) != null && holder.itemView.getTop() > AndroidUtilities.dp(56.0f)) {
                    ChatAttachAlertDocumentLayout.this.listView.smoothScrollBy(0, holder.itemView.getTop() - AndroidUtilities.dp(56.0f));
                }
            }
            if (i == 1 && ChatAttachAlertDocumentLayout.this.searching && ChatAttachAlertDocumentLayout.this.listView.getAdapter() == ChatAttachAlertDocumentLayout.this.searchAdapter) {
                AndroidUtilities.hideKeyboard(ChatAttachAlertDocumentLayout.this.parentAlert.getCurrentFocus());
            }
            ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout = ChatAttachAlertDocumentLayout.this;
            if (i != 0) {
                z = true;
            }
            chatAttachAlertDocumentLayout.scrolling = z;
        }
    }

    public /* synthetic */ void lambda$new$1(View view, int i) {
        Object obj;
        int i2;
        RecyclerView.Adapter adapter = this.listView.getAdapter();
        ListAdapter listAdapter = this.listAdapter;
        if (adapter == listAdapter) {
            obj = listAdapter.getItem(i);
        } else {
            obj = this.searchAdapter.getItem(i);
        }
        if (obj instanceof ListItem) {
            ListItem listItem = (ListItem) obj;
            File file = listItem.file;
            boolean isExternalStorageManager = Build.VERSION.SDK_INT >= 30 ? Environment.isExternalStorageManager() : false;
            if (!BuildVars.NO_SCOPED_STORAGE && (((i2 = listItem.icon) == 2131165404 || i2 == 2131165402) && !isExternalStorageManager)) {
                this.delegate.startDocumentSelectActivity();
                return;
            }
            ChatActivity chatActivity = null;
            if (file == null) {
                int i3 = listItem.icon;
                if (i3 == 2131165401) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    BaseFragment baseFragment = this.parentAlert.baseFragment;
                    if (baseFragment instanceof ChatActivity) {
                        chatActivity = (ChatActivity) baseFragment;
                    }
                    ChatActivity chatActivity2 = chatActivity;
                    PhotoPickerActivity photoPickerActivity = new PhotoPickerActivity(0, MediaController.allMediaAlbumEntry, hashMap, arrayList, 0, chatActivity2 != null, chatActivity2, false);
                    photoPickerActivity.setDocumentsPicker(true);
                    photoPickerActivity.setDelegate(new AnonymousClass8(hashMap, arrayList));
                    photoPickerActivity.setMaxSelectedPhotos(this.maxSelectedFiles, false);
                    this.parentAlert.baseFragment.presentFragment(photoPickerActivity);
                    this.parentAlert.dismiss(true);
                    return;
                } else if (i3 == 2131165403) {
                    DocumentSelectActivityDelegate documentSelectActivityDelegate = this.delegate;
                    if (documentSelectActivityDelegate == null) {
                        return;
                    }
                    documentSelectActivityDelegate.startMusicSelectActivity();
                    return;
                } else {
                    int topForScroll = getTopForScroll();
                    prepareAnimation();
                    HistoryEntry historyEntry = (HistoryEntry) this.listAdapter.history.remove(this.listAdapter.history.size() - 1);
                    this.parentAlert.actionBar.setTitle(historyEntry.title);
                    File file2 = historyEntry.dir;
                    if (file2 != null) {
                        listFiles(file2);
                    } else {
                        listRoots();
                    }
                    updateSearchButton();
                    this.layoutManager.scrollToPositionWithOffset(0, topForScroll);
                    runAnimation(2);
                    return;
                }
            } else if (file.isDirectory()) {
                HistoryEntry historyEntry2 = new HistoryEntry(null);
                View childAt = this.listView.getChildAt(0);
                RecyclerView.ViewHolder findContainingViewHolder = this.listView.findContainingViewHolder(childAt);
                if (findContainingViewHolder == null) {
                    return;
                }
                findContainingViewHolder.getAdapterPosition();
                childAt.getTop();
                historyEntry2.dir = this.currentDir;
                historyEntry2.title = this.parentAlert.actionBar.getTitle();
                prepareAnimation();
                this.listAdapter.history.add(historyEntry2);
                if (listFiles(file)) {
                    runAnimation(1);
                    this.parentAlert.actionBar.setTitle(listItem.title);
                    return;
                }
                this.listAdapter.history.remove(historyEntry2);
                return;
            } else {
                onItemClick(view, listItem);
                return;
            }
        }
        onItemClick(view, obj);
    }

    /* renamed from: org.telegram.ui.Components.ChatAttachAlertDocumentLayout$8 */
    /* loaded from: classes3.dex */
    public class AnonymousClass8 implements PhotoPickerActivity.PhotoPickerActivityDelegate {
        final /* synthetic */ HashMap val$selectedPhotos;
        final /* synthetic */ ArrayList val$selectedPhotosOrder;

        @Override // org.telegram.ui.PhotoPickerActivity.PhotoPickerActivityDelegate
        public void onCaptionChanged(CharSequence charSequence) {
        }

        @Override // org.telegram.ui.PhotoPickerActivity.PhotoPickerActivityDelegate
        public void selectedPhotosChanged() {
        }

        AnonymousClass8(HashMap hashMap, ArrayList arrayList) {
            ChatAttachAlertDocumentLayout.this = r1;
            this.val$selectedPhotos = hashMap;
            this.val$selectedPhotosOrder = arrayList;
        }

        @Override // org.telegram.ui.PhotoPickerActivity.PhotoPickerActivityDelegate
        public void actionButtonPressed(boolean z, boolean z2, int i) {
            if (!z) {
                ChatAttachAlertDocumentLayout.this.sendSelectedPhotos(this.val$selectedPhotos, this.val$selectedPhotosOrder, z2, i);
            }
        }

        @Override // org.telegram.ui.PhotoPickerActivity.PhotoPickerActivityDelegate
        public void onOpenInPressed() {
            ChatAttachAlertDocumentLayout.this.delegate.startDocumentSelectActivity();
        }
    }

    public /* synthetic */ boolean lambda$new$2(View view, int i) {
        Object obj;
        RecyclerView.Adapter adapter = this.listView.getAdapter();
        ListAdapter listAdapter = this.listAdapter;
        if (adapter == listAdapter) {
            obj = listAdapter.getItem(i);
        } else {
            obj = this.searchAdapter.getItem(i);
        }
        return onItemClick(view, obj);
    }

    public /* synthetic */ void lambda$new$3(View view, int i) {
        this.filtersView.cancelClickRunnables(true);
        this.searchAdapter.addSearchFilter(this.filtersView.getFilterAt(i));
    }

    private void runAnimation(int i) {
        float f;
        ValueAnimator valueAnimator = this.listAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.currentAnimationType = i;
        int i2 = 0;
        while (true) {
            if (i2 >= getChildCount()) {
                i2 = 0;
                break;
            } else if (getChildAt(i2) == this.listView) {
                break;
            } else {
                i2++;
            }
        }
        if (i == 1) {
            f = AndroidUtilities.dp(150.0f);
            this.backgroundListView.setAlpha(1.0f);
            this.backgroundListView.setScaleX(1.0f);
            this.backgroundListView.setScaleY(1.0f);
            this.backgroundListView.setTranslationX(0.0f);
            removeView(this.backgroundListView);
            addView(this.backgroundListView, i2);
            this.backgroundListView.setVisibility(0);
            this.listView.setTranslationX(f);
            this.listView.setAlpha(0.0f);
            this.listAnimation = ValueAnimator.ofFloat(1.0f, 0.0f);
        } else {
            f = AndroidUtilities.dp(150.0f);
            this.listView.setAlpha(0.0f);
            this.listView.setScaleX(0.95f);
            this.listView.setScaleY(0.95f);
            this.backgroundListView.setScaleX(1.0f);
            this.backgroundListView.setScaleY(1.0f);
            this.backgroundListView.setTranslationX(0.0f);
            this.backgroundListView.setAlpha(1.0f);
            removeView(this.backgroundListView);
            addView(this.backgroundListView, i2 + 1);
            this.backgroundListView.setVisibility(0);
            this.listAnimation = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.listAnimation.addUpdateListener(new ChatAttachAlertDocumentLayout$$ExternalSyntheticLambda0(this, i, f));
        this.listAnimation.addListener(new AnonymousClass9());
        if (i == 1) {
            this.listAnimation.setDuration(220L);
        } else {
            this.listAnimation.setDuration(200L);
        }
        this.listAnimation.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.listAnimation.start();
    }

    public /* synthetic */ void lambda$runAnimation$4(int i, float f, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (i == 1) {
            this.listView.setTranslationX(f * floatValue);
            this.listView.setAlpha(1.0f - floatValue);
            this.listView.invalidate();
            this.backgroundListView.setAlpha(floatValue);
            float f2 = (floatValue * 0.05f) + 0.95f;
            this.backgroundListView.setScaleX(f2);
            this.backgroundListView.setScaleY(f2);
            return;
        }
        this.backgroundListView.setTranslationX(f * floatValue);
        this.backgroundListView.setAlpha(Math.max(0.0f, 1.0f - floatValue));
        this.backgroundListView.invalidate();
        this.listView.setAlpha(floatValue);
        float f3 = (floatValue * 0.05f) + 0.95f;
        this.listView.setScaleX(f3);
        this.listView.setScaleY(f3);
        this.backgroundListView.invalidate();
    }

    /* renamed from: org.telegram.ui.Components.ChatAttachAlertDocumentLayout$9 */
    /* loaded from: classes3.dex */
    public class AnonymousClass9 extends AnimatorListenerAdapter {
        AnonymousClass9() {
            ChatAttachAlertDocumentLayout.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            ChatAttachAlertDocumentLayout.this.backgroundListView.setVisibility(8);
            ChatAttachAlertDocumentLayout.this.currentAnimationType = 0;
            ChatAttachAlertDocumentLayout.this.listView.setAlpha(1.0f);
            ChatAttachAlertDocumentLayout.this.listView.setScaleX(1.0f);
            ChatAttachAlertDocumentLayout.this.listView.setScaleY(1.0f);
            ChatAttachAlertDocumentLayout.this.listView.setTranslationX(0.0f);
            ChatAttachAlertDocumentLayout.this.listView.invalidate();
        }
    }

    private void prepareAnimation() {
        View findViewByPosition;
        this.backgroundListAdapter.history.clear();
        this.backgroundListAdapter.history.addAll(this.listAdapter.history);
        this.backgroundListAdapter.items.clear();
        this.backgroundListAdapter.items.addAll(this.listAdapter.items);
        this.backgroundListAdapter.recentItems.clear();
        this.backgroundListAdapter.recentItems.addAll(this.listAdapter.recentItems);
        this.backgroundListAdapter.notifyDataSetChanged();
        this.backgroundListView.setVisibility(0);
        this.backgroundListView.setPadding(this.listView.getPaddingLeft(), this.listView.getPaddingTop(), this.listView.getPaddingRight(), this.listView.getPaddingBottom());
        int findFirstVisibleItemPosition = this.layoutManager.findFirstVisibleItemPosition();
        if (findFirstVisibleItemPosition < 0 || (findViewByPosition = this.layoutManager.findViewByPosition(findFirstVisibleItemPosition)) == null) {
            return;
        }
        this.backgroundLayoutManager.scrollToPositionWithOffset(findFirstVisibleItemPosition, findViewByPosition.getTop() - this.backgroundListView.getPaddingTop());
    }

    @Override // org.telegram.ui.Components.ChatAttachAlert.AttachAlertLayout
    void onDestroy() {
        try {
            if (this.receiverRegistered) {
                ApplicationLoader.applicationContext.unregisterReceiver(this.receiver);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.parentAlert.actionBar.closeSearchField();
        ActionBarMenu createMenu = this.parentAlert.actionBar.createMenu();
        createMenu.removeView(this.sortItem);
        createMenu.removeView(this.searchItem);
    }

    @Override // org.telegram.ui.Components.ChatAttachAlert.AttachAlertLayout
    void onMenuItemClick(int i) {
        if (i == 6) {
            SharedConfig.toggleSortFilesByName();
            this.sortByName = SharedConfig.sortFilesByName;
            sortRecentItems();
            sortFileItems();
            this.listAdapter.notifyDataSetChanged();
            this.sortItem.setIcon(this.sortByName ? 2131165696 : 2131165694);
        }
    }

    @Override // org.telegram.ui.Components.ChatAttachAlert.AttachAlertLayout
    public int getCurrentItemTop() {
        if (this.listView.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i = 0;
        View childAt = this.listView.getChildAt(0);
        RecyclerListView.Holder holder = (RecyclerListView.Holder) this.listView.findContainingViewHolder(childAt);
        int y = ((int) childAt.getY()) - AndroidUtilities.dp(8.0f);
        if (y > 0 && holder != null && holder.getAdapterPosition() == 0) {
            i = y;
        }
        if (y < 0 || holder == null || holder.getAdapterPosition() != 0) {
            y = i;
        }
        return y + AndroidUtilities.dp(13.0f);
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.parentAlert.getSheetContainer().invalidate();
    }

    @Override // org.telegram.ui.Components.ChatAttachAlert.AttachAlertLayout
    public int getListTopPadding() {
        return this.listView.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.ChatAttachAlert.AttachAlertLayout
    int getFirstOffset() {
        return getListTopPadding() + AndroidUtilities.dp(5.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    @Override // org.telegram.ui.Components.ChatAttachAlert.AttachAlertLayout
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void onPreMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.parentAlert.actionBar.isSearchFieldVisible() || this.parentAlert.sizeNotifierFrameLayout.measureKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
            i3 = AndroidUtilities.dp(56.0f);
            this.parentAlert.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                android.graphics.Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i4 = (int) (i2 / 3.5f);
                    i3 = i4 - AndroidUtilities.dp(1.0f);
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    this.parentAlert.setAllowNestedScroll(true);
                }
            }
            i4 = (i2 / 5) * 2;
            i3 = i4 - AndroidUtilities.dp(1.0f);
            if (i3 < 0) {
            }
            this.parentAlert.setAllowNestedScroll(true);
        }
        if (this.listView.getPaddingTop() != i3) {
            this.ignoreLayout = true;
            this.listView.setPadding(0, i3, 0, AndroidUtilities.dp(48.0f));
            this.ignoreLayout = false;
        }
        ((FrameLayout.LayoutParams) this.filtersView.getLayoutParams()).topMargin = ActionBar.getCurrentActionBarHeight();
    }

    @Override // org.telegram.ui.Components.ChatAttachAlert.AttachAlertLayout
    int getButtonsHideOffset() {
        return AndroidUtilities.dp(62.0f);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.ChatAttachAlert.AttachAlertLayout
    void scrollToTop() {
        this.listView.smoothScrollToPosition(0);
    }

    @Override // org.telegram.ui.Components.ChatAttachAlert.AttachAlertLayout
    public int getSelectedItemsCount() {
        return this.selectedFiles.size() + this.selectedMessages.size();
    }

    @Override // org.telegram.ui.Components.ChatAttachAlert.AttachAlertLayout
    void sendSelectedItems(boolean z, int i) {
        if ((this.selectedFiles.size() == 0 && this.selectedMessages.size() == 0) || this.delegate == null || this.sendPressed) {
            return;
        }
        this.sendPressed = true;
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        for (FilteredSearchView.MessageHashId messageHashId : this.selectedMessages.keySet()) {
            arrayList.add(this.selectedMessages.get(messageHashId));
        }
        this.delegate.didSelectFiles(new ArrayList<>(this.selectedFilesOrder), this.parentAlert.commentTextView.getText().toString(), arrayList, z, i);
        this.parentAlert.dismiss(true);
    }

    private boolean onItemClick(View view, Object obj) {
        boolean z;
        boolean z2 = false;
        if (obj instanceof ListItem) {
            ListItem listItem = (ListItem) obj;
            File file = listItem.file;
            if (file == null || file.isDirectory()) {
                return false;
            }
            String absolutePath = listItem.file.getAbsolutePath();
            if (this.selectedFiles.containsKey(absolutePath)) {
                this.selectedFiles.remove(absolutePath);
                this.selectedFilesOrder.remove(absolutePath);
                z = false;
            } else if (!listItem.file.canRead()) {
                showErrorBox(LocaleController.getString("AccessError", 2131624126));
                return false;
            } else if (this.canSelectOnlyImageFiles && listItem.thumb == null) {
                showErrorBox(LocaleController.formatString("PassportUploadNotImage", 2131627402, new Object[0]));
                return false;
            } else if ((listItem.file.length() > 2097152000 && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) || listItem.file.length() > 4194304000L) {
                ChatAttachAlert chatAttachAlert = this.parentAlert;
                LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(chatAttachAlert.baseFragment, chatAttachAlert.getContainer().getContext(), 6, UserConfig.selectedAccount);
                limitReachedBottomSheet.setVeryLargeFile(true);
                limitReachedBottomSheet.show();
                return false;
            } else {
                if (this.maxSelectedFiles >= 0) {
                    int size = this.selectedFiles.size();
                    int i = this.maxSelectedFiles;
                    if (size >= i) {
                        showErrorBox(LocaleController.formatString("PassportUploadMaxReached", 2131627401, LocaleController.formatPluralString("Files", i, new Object[0])));
                        return false;
                    }
                }
                if ((this.isSoundPicker && !isRingtone(listItem.file)) || listItem.file.length() == 0) {
                    return false;
                }
                this.selectedFiles.put(absolutePath, listItem);
                this.selectedFilesOrder.add(absolutePath);
                z = true;
            }
            this.scrolling = false;
        } else if (!(obj instanceof MessageObject)) {
            return false;
        } else {
            MessageObject messageObject = (MessageObject) obj;
            FilteredSearchView.MessageHashId messageHashId = new FilteredSearchView.MessageHashId(messageObject.getId(), messageObject.getDialogId());
            if (this.selectedMessages.containsKey(messageHashId)) {
                this.selectedMessages.remove(messageHashId);
            } else if (this.selectedMessages.size() >= 100) {
                return false;
            } else {
                this.selectedMessages.put(messageHashId, messageObject);
                z2 = true;
            }
            z = z2;
        }
        if (view instanceof SharedDocumentCell) {
            ((SharedDocumentCell) view).setChecked(z, true);
        }
        this.parentAlert.updateCountButton(z ? 1 : 2);
        return true;
    }

    public boolean isRingtone(File file) {
        int i;
        String fileExtension = FileLoader.getFileExtension(file);
        String mimeTypeFromExtension = fileExtension != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtension) : null;
        if (file.length() == 0 || mimeTypeFromExtension == null || !RingtoneDataStore.ringtoneSupportedMimeType.contains(mimeTypeFromExtension)) {
            BulletinFactory.of(this.parentAlert.getContainer(), null).createErrorBulletinSubtitle(LocaleController.formatString("InvalidFormatError", 2131626295, new Object[0]), LocaleController.formatString("ErrorInvalidRingtone", 2131625697, new Object[0]), null).show();
            return false;
        } else if (file.length() > MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax) {
            BulletinFactory.of(this.parentAlert.getContainer(), null).createErrorBulletinSubtitle(LocaleController.formatString("TooLargeError", 2131628738, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", 2131625698, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax / 1024)), null).show();
            return false;
        } else {
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(ApplicationLoader.applicationContext, Uri.fromFile(file));
                i = Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                i = Integer.MAX_VALUE;
            }
            if (i <= MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax * 1000) {
                return true;
            }
            BulletinFactory.of(this.parentAlert.getContainer(), null).createErrorBulletinSubtitle(LocaleController.formatString("TooLongError", 2131628739, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", 2131625696, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax)), null).show();
            return false;
        }
    }

    public void setMaxSelectedFiles(int i) {
        this.maxSelectedFiles = i;
    }

    public void setCanSelectOnlyImageFiles(boolean z) {
        this.canSelectOnlyImageFiles = z;
    }

    public void sendSelectedPhotos(HashMap<Object, Object> hashMap, ArrayList<Object> arrayList, boolean z, int i) {
        if (hashMap.isEmpty() || this.delegate == null || this.sendPressed) {
            return;
        }
        this.sendPressed = true;
        ArrayList<SendMessagesHelper.SendingMediaInfo> arrayList2 = new ArrayList<>();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = hashMap.get(arrayList.get(i2));
            SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
            arrayList2.add(sendingMediaInfo);
            if (obj instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                String str = photoEntry.imagePath;
                if (str != null) {
                    sendingMediaInfo.path = str;
                } else {
                    sendingMediaInfo.path = photoEntry.path;
                }
                sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                sendingMediaInfo.videoEditedInfo = photoEntry.editedInfo;
                sendingMediaInfo.isVideo = photoEntry.isVideo;
                CharSequence charSequence = photoEntry.caption;
                sendingMediaInfo.caption = charSequence != null ? charSequence.toString() : null;
                sendingMediaInfo.entities = photoEntry.entities;
                sendingMediaInfo.masks = photoEntry.stickers;
                sendingMediaInfo.ttl = photoEntry.ttl;
            }
        }
        this.delegate.didSelectPhotos(arrayList2, z, i);
    }

    public void loadRecentFiles() {
        try {
            if (this.isSoundPicker) {
                try {
                    Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "duration", "_size", "mime_type"}, "is_music != 0", null, "date_added DESC");
                    while (query.moveToNext()) {
                        File file = new File(query.getString(1));
                        long j = query.getLong(2);
                        long j2 = query.getLong(3);
                        String string = query.getString(4);
                        if (j <= MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax * 1000 && j2 <= MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax && (TextUtils.isEmpty(string) || "audio/mpeg".equals(string) || !"audio/mpeg4".equals(string))) {
                            ListItem listItem = new ListItem(null);
                            listItem.title = file.getName();
                            listItem.file = file;
                            String name = file.getName();
                            String[] split = name.split("\\.");
                            listItem.ext = split.length > 1 ? split[split.length - 1] : "?";
                            listItem.subtitle = AndroidUtilities.formatFileSize(file.length());
                            String lowerCase = name.toLowerCase();
                            if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                listItem.thumb = file.getAbsolutePath();
                            }
                            this.listAdapter.recentItems.add(listItem);
                        }
                    }
                    query.close();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else {
                checkDirectory(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
                sortRecentItems();
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    private void checkDirectory(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory() && file2.getName().equals("Telegram")) {
                    checkDirectory(file2);
                } else {
                    ListItem listItem = new ListItem(null);
                    listItem.title = file2.getName();
                    listItem.file = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    listItem.ext = split.length > 1 ? split[split.length - 1] : "?";
                    listItem.subtitle = AndroidUtilities.formatFileSize(file2.length());
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        listItem.thumb = file2.getAbsolutePath();
                    }
                    this.listAdapter.recentItems.add(listItem);
                }
            }
        }
    }

    private void sortRecentItems() {
        Collections.sort(this.listAdapter.recentItems, new ChatAttachAlertDocumentLayout$$ExternalSyntheticLambda3(this));
    }

    public /* synthetic */ int lambda$sortRecentItems$5(ListItem listItem, ListItem listItem2) {
        if (this.sortByName) {
            return listItem.file.getName().compareToIgnoreCase(listItem2.file.getName());
        }
        long lastModified = listItem.file.lastModified();
        long lastModified2 = listItem2.file.lastModified();
        if (lastModified == lastModified2) {
            return 0;
        }
        return lastModified > lastModified2 ? -1 : 1;
    }

    private void sortFileItems() {
        if (this.currentDir == null) {
            return;
        }
        Collections.sort(this.listAdapter.items, new ChatAttachAlertDocumentLayout$$ExternalSyntheticLambda2(this));
    }

    public /* synthetic */ int lambda$sortFileItems$6(ListItem listItem, ListItem listItem2) {
        File file = listItem.file;
        if (file == null) {
            return -1;
        }
        if (listItem2.file == null) {
            return 1;
        }
        boolean isDirectory = file.isDirectory();
        if (isDirectory != listItem2.file.isDirectory()) {
            return isDirectory ? -1 : 1;
        } else if (isDirectory || this.sortByName) {
            return listItem.file.getName().compareToIgnoreCase(listItem2.file.getName());
        } else {
            long lastModified = listItem.file.lastModified();
            long lastModified2 = listItem2.file.lastModified();
            if (lastModified == lastModified2) {
                return 0;
            }
            return lastModified > lastModified2 ? -1 : 1;
        }
    }

    @Override // org.telegram.ui.Components.ChatAttachAlert.AttachAlertLayout
    public void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
        SearchAdapter searchAdapter = this.searchAdapter;
        if (searchAdapter != null) {
            searchAdapter.notifyDataSetChanged();
        }
    }

    @Override // org.telegram.ui.Components.ChatAttachAlert.AttachAlertLayout
    void onShow(ChatAttachAlert.AttachAlertLayout attachAlertLayout) {
        this.selectedFiles.clear();
        this.selectedMessages.clear();
        this.searchAdapter.currentSearchFilters.clear();
        this.selectedFilesOrder.clear();
        this.listAdapter.history.clear();
        listRoots();
        updateSearchButton();
        updateEmptyView();
        this.parentAlert.actionBar.setTitle(LocaleController.getString("SelectFile", 2131628230));
        this.sortItem.setVisibility(0);
        this.layoutManager.scrollToPositionWithOffset(0, 0);
    }

    @Override // org.telegram.ui.Components.ChatAttachAlert.AttachAlertLayout
    public void onHide() {
        this.sortItem.setVisibility(8);
        this.searchItem.setVisibility(8);
    }

    public void updateEmptyViewPosition() {
        View childAt;
        if (this.emptyView.getVisibility() == 0 && (childAt = this.listView.getChildAt(0)) != null) {
            float translationY = this.emptyView.getTranslationY();
            this.additionalTranslationY = ((this.emptyView.getMeasuredHeight() - getMeasuredHeight()) + childAt.getTop()) / 2;
            this.emptyView.setTranslationY(translationY);
        }
    }

    public void updateEmptyView() {
        RecyclerView.Adapter adapter = this.listView.getAdapter();
        SearchAdapter searchAdapter = this.searchAdapter;
        int i = 0;
        boolean z = true;
        if (adapter != searchAdapter ? this.listAdapter.getItemCount() != 1 : !searchAdapter.searchResult.isEmpty() || !this.searchAdapter.sections.isEmpty()) {
            z = false;
        }
        StickerEmptyView stickerEmptyView = this.emptyView;
        if (!z) {
            i = 8;
        }
        stickerEmptyView.setVisibility(i);
        updateEmptyViewPosition();
    }

    public void updateSearchButton() {
        ActionBarMenuItem actionBarMenuItem = this.searchItem;
        if (actionBarMenuItem != null && !actionBarMenuItem.isSearchFieldVisible()) {
            this.searchItem.setVisibility((this.hasFiles || this.listAdapter.history.isEmpty()) ? 0 : 8);
        }
    }

    private int getTopForScroll() {
        View childAt = this.listView.getChildAt(0);
        RecyclerView.ViewHolder findContainingViewHolder = this.listView.findContainingViewHolder(childAt);
        int i = -this.listView.getPaddingTop();
        return (findContainingViewHolder == null || findContainingViewHolder.getAdapterPosition() != 0) ? i : i + childAt.getTop();
    }

    private boolean canClosePicker() {
        if (this.listAdapter.history.size() > 0) {
            prepareAnimation();
            HistoryEntry historyEntry = (HistoryEntry) this.listAdapter.history.remove(this.listAdapter.history.size() - 1);
            this.parentAlert.actionBar.setTitle(historyEntry.title);
            int topForScroll = getTopForScroll();
            File file = historyEntry.dir;
            if (file != null) {
                listFiles(file);
            } else {
                listRoots();
            }
            updateSearchButton();
            this.layoutManager.scrollToPositionWithOffset(0, topForScroll);
            runAnimation(2);
            return false;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ChatAttachAlert.AttachAlertLayout
    public boolean onBackPressed() {
        if (!canClosePicker()) {
            return true;
        }
        return super.onBackPressed();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        updateEmptyViewPosition();
    }

    public void setDelegate(DocumentSelectActivityDelegate documentSelectActivityDelegate) {
        this.delegate = documentSelectActivityDelegate;
    }

    public boolean listFiles(File file) {
        this.hasFiles = false;
        if (!file.canRead()) {
            if ((file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) || file.getAbsolutePath().startsWith("/sdcard") || file.getAbsolutePath().startsWith("/mnt/sdcard")) && !Environment.getExternalStorageState().equals("mounted") && !Environment.getExternalStorageState().equals("mounted_ro")) {
                this.currentDir = file;
                this.listAdapter.items.clear();
                Environment.getExternalStorageState();
                AndroidUtilities.clearDrawableAnimation(this.listView);
                this.scrolling = true;
                this.listAdapter.notifyDataSetChanged();
                return true;
            }
            showErrorBox(LocaleController.getString("AccessError", 2131624126));
            return false;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                showErrorBox(LocaleController.getString("UnknownError", 2131628800));
                return false;
            }
            this.currentDir = file;
            this.listAdapter.items.clear();
            for (File file2 : listFiles) {
                if (file2.getName().indexOf(46) != 0) {
                    ListItem listItem = new ListItem(null);
                    listItem.title = file2.getName();
                    listItem.file = file2;
                    if (file2.isDirectory()) {
                        listItem.icon = 2131165400;
                        listItem.subtitle = LocaleController.getString("Folder", 2131625951);
                    } else {
                        this.hasFiles = true;
                        String name = file2.getName();
                        String[] split = name.split("\\.");
                        listItem.ext = split.length > 1 ? split[split.length - 1] : "?";
                        listItem.subtitle = AndroidUtilities.formatFileSize(file2.length());
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            listItem.thumb = file2.getAbsolutePath();
                        }
                    }
                    this.listAdapter.items.add(listItem);
                }
            }
            ListItem listItem2 = new ListItem(null);
            listItem2.title = "..";
            if (this.listAdapter.history.size() > 0) {
                File file3 = ((HistoryEntry) this.listAdapter.history.get(this.listAdapter.history.size() - 1)).dir;
                if (file3 == null) {
                    listItem2.subtitle = LocaleController.getString("Folder", 2131625951);
                } else {
                    listItem2.subtitle = file3.toString();
                }
            } else {
                listItem2.subtitle = LocaleController.getString("Folder", 2131625951);
            }
            listItem2.icon = 2131165400;
            listItem2.file = null;
            this.listAdapter.items.add(0, listItem2);
            sortFileItems();
            updateSearchButton();
            AndroidUtilities.clearDrawableAnimation(this.listView);
            this.scrolling = true;
            int topForScroll = getTopForScroll();
            this.listAdapter.notifyDataSetChanged();
            this.layoutManager.scrollToPositionWithOffset(0, topForScroll);
            return true;
        } catch (Exception e) {
            showErrorBox(e.getLocalizedMessage());
            return false;
        }
    }

    private void showErrorBox(String str) {
        new AlertDialog.Builder(getContext(), this.resourcesProvider).setTitle(LocaleController.getString("AppName", 2131624384)).setMessage(str).setPositiveButton(LocaleController.getString("OK", 2131627127), null).show();
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x01a3 A[Catch: Exception -> 0x01c6, TRY_LEAVE, TryCatch #5 {Exception -> 0x01c6, blocks: (B:64:0x0192, B:66:0x01a3), top: B:95:0x0192 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0248 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void listRoots() {
        File file;
        Throwable th;
        BufferedReader bufferedReader;
        Exception e;
        int lastIndexOf;
        BufferedReader bufferedReader2 = null;
        this.currentDir = null;
        this.hasFiles = false;
        this.listAdapter.items.clear();
        HashSet hashSet = new HashSet();
        if (Build.VERSION.SDK_INT >= 30) {
            Environment.isExternalStorageManager();
        }
        String path = Environment.getExternalStorageDirectory().getPath();
        String externalStorageState = Environment.getExternalStorageState();
        if (externalStorageState.equals("mounted") || externalStorageState.equals("mounted_ro")) {
            ListItem listItem = new ListItem(null);
            if (Environment.isExternalStorageRemovable()) {
                listItem.title = LocaleController.getString("SdCard", 2131628154);
                listItem.icon = 2131165402;
                listItem.subtitle = LocaleController.getString("ExternalFolderInfo", 2131625832);
            } else {
                listItem.title = LocaleController.getString("InternalStorage", 2131626288);
                listItem.icon = 2131165404;
                listItem.subtitle = LocaleController.getString("InternalFolderInfo", 2131626287);
            }
            listItem.file = Environment.getExternalStorageDirectory();
            this.listAdapter.items.add(listItem);
            hashSet.add(path);
        }
        try {
            try {
                bufferedReader = new BufferedReader(new FileReader("/proc/mounts"));
                while (true) {
                    try {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            } else if (readLine.contains("vfat") || readLine.contains("/mnt")) {
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d(readLine);
                                }
                                StringTokenizer stringTokenizer = new StringTokenizer(readLine, " ");
                                stringTokenizer.nextToken();
                                String nextToken = stringTokenizer.nextToken();
                                if (!hashSet.contains(nextToken) && readLine.contains("/dev/block/vold") && !readLine.contains("/mnt/secure") && !readLine.contains("/mnt/asec") && !readLine.contains("/mnt/obb") && !readLine.contains("/dev/mapper") && !readLine.contains("tmpfs")) {
                                    if (!new File(nextToken).isDirectory() && (lastIndexOf = nextToken.lastIndexOf(47)) != -1) {
                                        String str = "/storage/" + nextToken.substring(lastIndexOf + 1);
                                        if (new File(str).isDirectory()) {
                                            nextToken = str;
                                        }
                                    }
                                    hashSet.add(nextToken);
                                    try {
                                        ListItem listItem2 = new ListItem(null);
                                        if (nextToken.toLowerCase().contains("sd")) {
                                            listItem2.title = LocaleController.getString("SdCard", 2131628154);
                                        } else {
                                            listItem2.title = LocaleController.getString("ExternalStorage", 2131625833);
                                        }
                                        listItem2.subtitle = LocaleController.getString("ExternalFolderInfo", 2131625832);
                                        listItem2.icon = 2131165402;
                                        listItem2.file = new File(nextToken);
                                        this.listAdapter.items.add(listItem2);
                                    } catch (Exception e2) {
                                        FileLog.e(e2);
                                    }
                                }
                            }
                        } catch (Exception e3) {
                            e = e3;
                            FileLog.e(e);
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            file = new File(ApplicationLoader.applicationContext.getExternalFilesDir(null), "Telegram");
                            if (file.exists()) {
                            }
                            if (!this.isSoundPicker) {
                            }
                            if (this.allowMusic) {
                            }
                            if (!this.listAdapter.recentItems.isEmpty()) {
                            }
                            AndroidUtilities.clearDrawableAnimation(this.listView);
                            this.scrolling = true;
                            this.listAdapter.notifyDataSetChanged();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader2 = bufferedReader;
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (Exception e4) {
                                FileLog.e(e4);
                            }
                        }
                        throw th;
                    }
                }
                bufferedReader.close();
            } catch (Exception e5) {
                FileLog.e(e5);
            }
        } catch (Exception e6) {
            e = e6;
            bufferedReader = null;
        } catch (Throwable th3) {
            th = th3;
            if (bufferedReader2 != null) {
            }
            throw th;
        }
        try {
            file = new File(ApplicationLoader.applicationContext.getExternalFilesDir(null), "Telegram");
            if (file.exists()) {
                ListItem listItem3 = new ListItem(null);
                listItem3.title = "Telegram";
                listItem3.subtitle = LocaleController.getString("AppFolderInfo", 2131624375);
                listItem3.icon = 2131165400;
                listItem3.file = file;
                this.listAdapter.items.add(listItem3);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (!this.isSoundPicker) {
            ListItem listItem4 = new ListItem(null);
            listItem4.title = LocaleController.getString("Gallery", 2131626092);
            listItem4.subtitle = LocaleController.getString("GalleryInfo", 2131626093);
            listItem4.icon = 2131165401;
            listItem4.file = null;
            this.listAdapter.items.add(listItem4);
        }
        if (this.allowMusic) {
            ListItem listItem5 = new ListItem(null);
            listItem5.title = LocaleController.getString("AttachMusic", 2131624512);
            listItem5.subtitle = LocaleController.getString("MusicInfo", 2131626796);
            listItem5.icon = 2131165403;
            listItem5.file = null;
            this.listAdapter.items.add(listItem5);
        }
        if (!this.listAdapter.recentItems.isEmpty()) {
            this.hasFiles = true;
        }
        AndroidUtilities.clearDrawableAnimation(this.listView);
        this.scrolling = true;
        this.listAdapter.notifyDataSetChanged();
    }

    /* loaded from: classes3.dex */
    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;
        private ArrayList<ListItem> items = new ArrayList<>();
        private ArrayList<HistoryEntry> history = new ArrayList<>();
        private ArrayList<ListItem> recentItems = new ArrayList<>();

        public ListAdapter(Context context) {
            ChatAttachAlertDocumentLayout.this = r1;
            this.mContext = context;
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            int size = this.items.size();
            if (this.history.isEmpty() && !this.recentItems.isEmpty()) {
                size += this.recentItems.size() + 2;
            }
            return size + 1;
        }

        public ListItem getItem(int i) {
            int size;
            int size2 = this.items.size();
            if (i < size2) {
                return this.items.get(i);
            }
            if (this.history.isEmpty() && !this.recentItems.isEmpty() && i != size2 && i != size2 + 1 && (size = i - (this.items.size() + 2)) < this.recentItems.size()) {
                return this.recentItems.get(size);
            }
            return null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            if (i == getItemCount() - 1) {
                return 3;
            }
            int size = this.items.size();
            if (i == size) {
                return 2;
            }
            return i == size + 1 ? 0 : 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            View view2;
            if (i != 0) {
                if (i == 1) {
                    view2 = new SharedDocumentCell(this.mContext, 1, ChatAttachAlertDocumentLayout.this.resourcesProvider);
                } else if (i == 2) {
                    view2 = new ShadowSectionCell(this.mContext);
                    CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(ChatAttachAlertDocumentLayout.this.getThemedColor("windowBackgroundGray")), Theme.getThemedDrawable(this.mContext, 2131165435, "windowBackgroundGrayShadow"));
                    combinedDrawable.setFullsize(true);
                    view2.setBackgroundDrawable(combinedDrawable);
                } else {
                    view = new View(this.mContext);
                }
                view = view2;
            } else {
                view = new HeaderCell(this.mContext, ChatAttachAlertDocumentLayout.this.resourcesProvider);
            }
            return new RecyclerListView.Holder(view);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                if (ChatAttachAlertDocumentLayout.this.sortByName) {
                    headerCell.setText(LocaleController.getString("RecentFilesAZ", 2131627922));
                } else {
                    headerCell.setText(LocaleController.getString("RecentFiles", 2131627921));
                }
            } else if (itemViewType != 1) {
            } else {
                ListItem item = getItem(i);
                SharedDocumentCell sharedDocumentCell = (SharedDocumentCell) viewHolder.itemView;
                int i2 = item.icon;
                if (i2 != 0) {
                    sharedDocumentCell.setTextAndValueAndTypeAndThumb(item.title, item.subtitle, null, null, i2, i != this.items.size() - 1);
                } else {
                    sharedDocumentCell.setTextAndValueAndTypeAndThumb(item.title, item.subtitle, item.ext.toUpperCase().substring(0, Math.min(item.ext.length(), 4)), item.thumb, 0, false);
                }
                if (item.file != null) {
                    sharedDocumentCell.setChecked(ChatAttachAlertDocumentLayout.this.selectedFiles.containsKey(item.file.toString()), !ChatAttachAlertDocumentLayout.this.scrolling);
                } else {
                    sharedDocumentCell.setChecked(false, !ChatAttachAlertDocumentLayout.this.scrolling);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void notifyDataSetChanged() {
            super.notifyDataSetChanged();
            ChatAttachAlertDocumentLayout.this.updateEmptyView();
        }
    }

    /* loaded from: classes3.dex */
    public class SearchAdapter extends RecyclerListView.SectionsAdapter {
        private String currentDataQuery;
        private long currentSearchDialogId;
        private FiltersView.MediaFilterData currentSearchFilter;
        private long currentSearchMaxDate;
        private long currentSearchMinDate;
        private boolean endReached;
        private boolean isLoading;
        private String lastMessagesSearchString;
        private String lastSearchFilterQueryString;
        private Runnable localSearchRunnable;
        private Context mContext;
        private int nextSearchRate;
        private int requestIndex;
        private Runnable searchRunnable;
        private ArrayList<ListItem> searchResult = new ArrayList<>();
        private final FilteredSearchView.MessageHashId messageHashIdTmp = new FilteredSearchView.MessageHashId(0, 0);
        private ArrayList<Object> localTipChats = new ArrayList<>();
        private ArrayList<FiltersView.DateData> localTipDates = new ArrayList<>();
        public ArrayList<MessageObject> messages = new ArrayList<>();
        public SparseArray<MessageObject> messagesById = new SparseArray<>();
        public ArrayList<String> sections = new ArrayList<>();
        public HashMap<String, ArrayList<MessageObject>> sectionArrays = new HashMap<>();
        private ArrayList<FiltersView.MediaFilterData> currentSearchFilters = new ArrayList<>();
        private int animationIndex = -1;
        private Runnable clearCurrentResultsRunnable = new AnonymousClass1();

        @Override // org.telegram.ui.Components.RecyclerListView.FastScrollAdapter
        public String getLetter(int i) {
            return null;
        }

        /* renamed from: org.telegram.ui.Components.ChatAttachAlertDocumentLayout$SearchAdapter$1 */
        /* loaded from: classes3.dex */
        public class AnonymousClass1 implements Runnable {
            AnonymousClass1() {
                SearchAdapter.this = r1;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (SearchAdapter.this.isLoading) {
                    SearchAdapter.this.messages.clear();
                    SearchAdapter.this.sections.clear();
                    SearchAdapter.this.sectionArrays.clear();
                    SearchAdapter.this.notifyDataSetChanged();
                }
            }
        }

        public SearchAdapter(Context context) {
            ChatAttachAlertDocumentLayout.this = r4;
            this.mContext = context;
        }

        public void search(String str, boolean z) {
            long j;
            Runnable runnable = this.localSearchRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.localSearchRunnable = null;
            }
            if (TextUtils.isEmpty(str)) {
                if (!this.searchResult.isEmpty()) {
                    this.searchResult.clear();
                }
                if (ChatAttachAlertDocumentLayout.this.listView.getAdapter() != ChatAttachAlertDocumentLayout.this.listAdapter) {
                    ChatAttachAlertDocumentLayout.this.listView.setAdapter(ChatAttachAlertDocumentLayout.this.listAdapter);
                }
                notifyDataSetChanged();
            } else {
                ChatAttachAlertDocumentLayout$SearchAdapter$$ExternalSyntheticLambda2 chatAttachAlertDocumentLayout$SearchAdapter$$ExternalSyntheticLambda2 = new ChatAttachAlertDocumentLayout$SearchAdapter$$ExternalSyntheticLambda2(this, str);
                this.localSearchRunnable = chatAttachAlertDocumentLayout$SearchAdapter$$ExternalSyntheticLambda2;
                AndroidUtilities.runOnUIThread(chatAttachAlertDocumentLayout$SearchAdapter$$ExternalSyntheticLambda2, 300L);
            }
            if (ChatAttachAlertDocumentLayout.this.canSelectOnlyImageFiles || !ChatAttachAlertDocumentLayout.this.listAdapter.history.isEmpty()) {
                return;
            }
            long j2 = 0;
            long j3 = 0;
            long j4 = 0;
            for (int i = 0; i < this.currentSearchFilters.size(); i++) {
                FiltersView.MediaFilterData mediaFilterData = this.currentSearchFilters.get(i);
                int i2 = mediaFilterData.filterType;
                if (i2 == 4) {
                    TLObject tLObject = mediaFilterData.chat;
                    if (tLObject instanceof TLRPC$User) {
                        j = ((TLRPC$User) tLObject).id;
                    } else if (tLObject instanceof TLRPC$Chat) {
                        j = -((TLRPC$Chat) tLObject).id;
                    }
                    j4 = j;
                } else if (i2 == 6) {
                    FiltersView.DateData dateData = mediaFilterData.dateData;
                    j2 = dateData.minDate;
                    j3 = dateData.maxDate;
                }
            }
            searchGlobal(j4, j2, j3, FiltersView.filters[2], str, z);
        }

        public /* synthetic */ void lambda$search$1(String str) {
            ArrayList arrayList = new ArrayList(ChatAttachAlertDocumentLayout.this.listAdapter.items);
            if (ChatAttachAlertDocumentLayout.this.listAdapter.history.isEmpty()) {
                arrayList.addAll(0, ChatAttachAlertDocumentLayout.this.listAdapter.recentItems);
            }
            Utilities.searchQueue.postRunnable(new ChatAttachAlertDocumentLayout$SearchAdapter$$ExternalSyntheticLambda3(this, str, !this.currentSearchFilters.isEmpty(), arrayList));
        }

        public /* synthetic */ void lambda$search$0(String str, boolean z, ArrayList arrayList) {
            String lowerCase = str.trim().toLowerCase();
            if (lowerCase.length() == 0) {
                updateSearchResults(new ArrayList<>(), str);
                return;
            }
            String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
            if (lowerCase.equals(translitString) || translitString.length() == 0) {
                translitString = null;
            }
            int i = (translitString != null ? 1 : 0) + 1;
            String[] strArr = new String[i];
            strArr[0] = lowerCase;
            if (translitString != null) {
                strArr[1] = translitString;
            }
            ArrayList<ListItem> arrayList2 = new ArrayList<>();
            if (!z) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ListItem listItem = (ListItem) arrayList.get(i2);
                    File file = listItem.file;
                    if (file != null && !file.isDirectory()) {
                        int i3 = 0;
                        while (true) {
                            if (i3 < i) {
                                String str2 = strArr[i3];
                                String str3 = listItem.title;
                                if (str3 != null ? str3.toLowerCase().contains(str2) : false) {
                                    arrayList2.add(listItem);
                                    break;
                                }
                                i3++;
                            }
                        }
                    }
                }
            }
            updateSearchResults(arrayList2, str);
        }

        public void loadMore() {
            FiltersView.MediaFilterData mediaFilterData;
            if (ChatAttachAlertDocumentLayout.this.searchAdapter.isLoading || ChatAttachAlertDocumentLayout.this.searchAdapter.endReached || (mediaFilterData = this.currentSearchFilter) == null) {
                return;
            }
            searchGlobal(this.currentSearchDialogId, this.currentSearchMinDate, this.currentSearchMaxDate, mediaFilterData, this.lastMessagesSearchString, false);
        }

        public void removeSearchFilter(FiltersView.MediaFilterData mediaFilterData) {
            this.currentSearchFilters.remove(mediaFilterData);
        }

        public void addSearchFilter(FiltersView.MediaFilterData mediaFilterData) {
            if (!this.currentSearchFilters.isEmpty()) {
                for (int i = 0; i < this.currentSearchFilters.size(); i++) {
                    if (mediaFilterData.isSameType(this.currentSearchFilters.get(i))) {
                        return;
                    }
                }
            }
            this.currentSearchFilters.add(mediaFilterData);
            ChatAttachAlertDocumentLayout.this.parentAlert.actionBar.setSearchFilter(mediaFilterData);
            ChatAttachAlertDocumentLayout.this.parentAlert.actionBar.setSearchFieldText("");
            updateFiltersView(true, null, null, true);
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0194  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void updateFiltersView(boolean z, ArrayList<Object> arrayList, ArrayList<FiltersView.DateData> arrayList2, boolean z2) {
            boolean z3;
            int i = 0;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            for (int i2 = 0; i2 < this.currentSearchFilters.size(); i2++) {
                if (this.currentSearchFilters.get(i2).isMedia()) {
                    z4 = true;
                } else if (this.currentSearchFilters.get(i2).filterType == 4) {
                    z5 = true;
                } else if (this.currentSearchFilters.get(i2).filterType == 6) {
                    z6 = true;
                }
            }
            boolean z7 = (arrayList != null && !arrayList.isEmpty()) || (arrayList2 != null && !arrayList2.isEmpty());
            Integer num = null;
            if ((z4 || z7 || !z) && z7) {
                if (arrayList == null || arrayList.isEmpty() || z5) {
                    arrayList = null;
                }
                if (arrayList2 == null || arrayList2.isEmpty() || z6) {
                    arrayList2 = null;
                }
                if (arrayList != null || arrayList2 != null) {
                    ChatAttachAlertDocumentLayout.this.filtersView.setUsersAndDates(arrayList, arrayList2, false);
                    z3 = true;
                    if (!z3) {
                        ChatAttachAlertDocumentLayout.this.filtersView.setUsersAndDates(null, null, false);
                    }
                    ChatAttachAlertDocumentLayout.this.filtersView.setEnabled(z3);
                    if (!z3 && ChatAttachAlertDocumentLayout.this.filtersView.getTag() != null) {
                        return;
                    }
                    if (z3 && ChatAttachAlertDocumentLayout.this.filtersView.getTag() == null) {
                        return;
                    }
                    FiltersView filtersView = ChatAttachAlertDocumentLayout.this.filtersView;
                    if (z3) {
                        num = 1;
                    }
                    filtersView.setTag(num);
                    if (ChatAttachAlertDocumentLayout.this.filtersViewAnimator != null) {
                        ChatAttachAlertDocumentLayout.this.filtersViewAnimator.cancel();
                    }
                    float f = 0.0f;
                    if (!z2) {
                        if (z3) {
                            ChatAttachAlertDocumentLayout.this.filtersView.setVisibility(0);
                        }
                        ChatAttachAlertDocumentLayout.this.filtersViewAnimator = new AnimatorSet();
                        AnimatorSet animatorSet = ChatAttachAlertDocumentLayout.this.filtersViewAnimator;
                        Animator[] animatorArr = new Animator[4];
                        RecyclerListView recyclerListView = ChatAttachAlertDocumentLayout.this.listView;
                        Property property = View.TRANSLATION_Y;
                        float[] fArr = new float[1];
                        fArr[0] = z3 ? AndroidUtilities.dp(44.0f) : 0.0f;
                        animatorArr[0] = ObjectAnimator.ofFloat(recyclerListView, property, fArr);
                        FiltersView filtersView2 = ChatAttachAlertDocumentLayout.this.filtersView;
                        Property property2 = View.TRANSLATION_Y;
                        float[] fArr2 = new float[1];
                        fArr2[0] = z3 ? 0.0f : -AndroidUtilities.dp(44.0f);
                        animatorArr[1] = ObjectAnimator.ofFloat(filtersView2, property2, fArr2);
                        FlickerLoadingView flickerLoadingView = ChatAttachAlertDocumentLayout.this.loadingView;
                        Property property3 = View.TRANSLATION_Y;
                        float[] fArr3 = new float[1];
                        fArr3[0] = z3 ? AndroidUtilities.dp(44.0f) : 0.0f;
                        animatorArr[2] = ObjectAnimator.ofFloat(flickerLoadingView, property3, fArr3);
                        StickerEmptyView stickerEmptyView = ChatAttachAlertDocumentLayout.this.emptyView;
                        Property property4 = View.TRANSLATION_Y;
                        float[] fArr4 = new float[1];
                        if (z3) {
                            f = AndroidUtilities.dp(44.0f);
                        }
                        fArr4[0] = f;
                        animatorArr[3] = ObjectAnimator.ofFloat(stickerEmptyView, property4, fArr4);
                        animatorSet.playTogether(animatorArr);
                        ChatAttachAlertDocumentLayout.this.filtersViewAnimator.addListener(new AnonymousClass2());
                        ChatAttachAlertDocumentLayout.this.filtersViewAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                        ChatAttachAlertDocumentLayout.this.filtersViewAnimator.setDuration(180L);
                        ChatAttachAlertDocumentLayout.this.filtersViewAnimator.start();
                        return;
                    }
                    ChatAttachAlertDocumentLayout.this.filtersView.getAdapter().notifyDataSetChanged();
                    ChatAttachAlertDocumentLayout.this.listView.setTranslationY(z3 ? AndroidUtilities.dp(44.0f) : 0.0f);
                    ChatAttachAlertDocumentLayout.this.filtersView.setTranslationY(z3 ? 0.0f : -AndroidUtilities.dp(44.0f));
                    ChatAttachAlertDocumentLayout.this.loadingView.setTranslationY(z3 ? AndroidUtilities.dp(44.0f) : 0.0f);
                    StickerEmptyView stickerEmptyView2 = ChatAttachAlertDocumentLayout.this.emptyView;
                    if (z3) {
                        f = AndroidUtilities.dp(44.0f);
                    }
                    stickerEmptyView2.setTranslationY(f);
                    FiltersView filtersView3 = ChatAttachAlertDocumentLayout.this.filtersView;
                    if (!z3) {
                        i = 4;
                    }
                    filtersView3.setVisibility(i);
                    return;
                }
            }
            z3 = false;
            if (!z3) {
            }
            ChatAttachAlertDocumentLayout.this.filtersView.setEnabled(z3);
            if (!z3) {
            }
            if (z3) {
            }
            FiltersView filtersView4 = ChatAttachAlertDocumentLayout.this.filtersView;
            if (z3) {
            }
            filtersView4.setTag(num);
            if (ChatAttachAlertDocumentLayout.this.filtersViewAnimator != null) {
            }
            float f2 = 0.0f;
            if (!z2) {
            }
        }

        /* renamed from: org.telegram.ui.Components.ChatAttachAlertDocumentLayout$SearchAdapter$2 */
        /* loaded from: classes3.dex */
        public class AnonymousClass2 extends AnimatorListenerAdapter {
            AnonymousClass2() {
                SearchAdapter.this = r1;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (ChatAttachAlertDocumentLayout.this.filtersView.getTag() == null) {
                    ChatAttachAlertDocumentLayout.this.filtersView.setVisibility(4);
                }
                ChatAttachAlertDocumentLayout.this.filtersViewAnimator = null;
            }
        }

        private void searchGlobal(long j, long j2, long j3, FiltersView.MediaFilterData mediaFilterData, String str, boolean z) {
            String format = String.format(Locale.ENGLISH, "%d%d%d%d%s", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(mediaFilterData.filterType), str);
            String str2 = this.lastSearchFilterQueryString;
            boolean z2 = str2 != null && str2.equals(format);
            boolean z3 = !z2 && z;
            if (j == this.currentSearchDialogId && this.currentSearchMinDate == j2) {
                int i = (this.currentSearchMaxDate > j3 ? 1 : (this.currentSearchMaxDate == j3 ? 0 : -1));
            }
            this.currentSearchFilter = mediaFilterData;
            this.currentSearchDialogId = j;
            this.currentSearchMinDate = j2;
            this.currentSearchMaxDate = j3;
            Runnable runnable = this.searchRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
            AndroidUtilities.cancelRunOnUIThread(this.clearCurrentResultsRunnable);
            if (!z2 || !z) {
                if (z3) {
                    this.messages.clear();
                    this.sections.clear();
                    this.sectionArrays.clear();
                    this.isLoading = true;
                    ChatAttachAlertDocumentLayout.this.emptyView.setVisibility(0);
                    notifyDataSetChanged();
                    this.requestIndex++;
                    if (ChatAttachAlertDocumentLayout.this.listView.getPinnedHeader() != null) {
                        ChatAttachAlertDocumentLayout.this.listView.getPinnedHeader().setAlpha(0.0f);
                    }
                    this.localTipChats.clear();
                    this.localTipDates.clear();
                }
                this.isLoading = true;
                notifyDataSetChanged();
                if (!z2) {
                    this.clearCurrentResultsRunnable.run();
                    ChatAttachAlertDocumentLayout.this.emptyView.showProgress(true, !z);
                }
                if (TextUtils.isEmpty(str)) {
                    this.localTipDates.clear();
                    this.localTipChats.clear();
                    updateFiltersView(false, null, null, true);
                    return;
                }
                int i2 = 1 + this.requestIndex;
                this.requestIndex = i2;
                ChatAttachAlertDocumentLayout$SearchAdapter$$ExternalSyntheticLambda1 chatAttachAlertDocumentLayout$SearchAdapter$$ExternalSyntheticLambda1 = new ChatAttachAlertDocumentLayout$SearchAdapter$$ExternalSyntheticLambda1(this, j, str, AccountInstance.getInstance(UserConfig.selectedAccount), j2, j3, z2, format, i2);
                this.searchRunnable = chatAttachAlertDocumentLayout$SearchAdapter$$ExternalSyntheticLambda1;
                AndroidUtilities.runOnUIThread(chatAttachAlertDocumentLayout$SearchAdapter$$ExternalSyntheticLambda1, (!z2 || this.messages.isEmpty()) ? 350L : 0L);
                ChatAttachAlertDocumentLayout.this.loadingView.setViewType(3);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ void lambda$searchGlobal$4(long j, String str, AccountInstance accountInstance, long j2, long j3, boolean z, String str2, int i) {
            long j4;
            TLRPC$TL_messages_searchGlobal tLRPC$TL_messages_searchGlobal;
            ArrayList<Object> arrayList = null;
            if (j != 0) {
                TLRPC$TL_messages_search tLRPC$TL_messages_search = new TLRPC$TL_messages_search();
                tLRPC$TL_messages_search.q = str;
                tLRPC$TL_messages_search.limit = 20;
                tLRPC$TL_messages_search.filter = this.currentSearchFilter.filter;
                tLRPC$TL_messages_search.peer = accountInstance.getMessagesController().getInputPeer(j);
                if (j2 > 0) {
                    tLRPC$TL_messages_search.min_date = (int) (j2 / 1000);
                }
                if (j3 > 0) {
                    tLRPC$TL_messages_search.max_date = (int) (j3 / 1000);
                }
                if (z && str.equals(this.lastMessagesSearchString) && !this.messages.isEmpty()) {
                    ArrayList<MessageObject> arrayList2 = this.messages;
                    tLRPC$TL_messages_search.offset_id = arrayList2.get(arrayList2.size() - 1).getId();
                    tLRPC$TL_messages_searchGlobal = tLRPC$TL_messages_search;
                } else {
                    tLRPC$TL_messages_search.offset_id = 0;
                    tLRPC$TL_messages_searchGlobal = tLRPC$TL_messages_search;
                }
            } else {
                if (!TextUtils.isEmpty(str)) {
                    arrayList = new ArrayList<>();
                    accountInstance.getMessagesStorage().localSearch(0, str, arrayList, new ArrayList<>(), new ArrayList<>(), -1);
                }
                TLRPC$TL_messages_searchGlobal tLRPC$TL_messages_searchGlobal2 = new TLRPC$TL_messages_searchGlobal();
                tLRPC$TL_messages_searchGlobal2.limit = 20;
                tLRPC$TL_messages_searchGlobal2.q = str;
                tLRPC$TL_messages_searchGlobal2.filter = this.currentSearchFilter.filter;
                if (j2 > 0) {
                    tLRPC$TL_messages_searchGlobal2.min_date = (int) (j2 / 1000);
                }
                if (j3 > 0) {
                    tLRPC$TL_messages_searchGlobal2.max_date = (int) (j3 / 1000);
                }
                if (z && str.equals(this.lastMessagesSearchString) && !this.messages.isEmpty()) {
                    ArrayList<MessageObject> arrayList3 = this.messages;
                    MessageObject messageObject = arrayList3.get(arrayList3.size() - 1);
                    tLRPC$TL_messages_searchGlobal2.offset_id = messageObject.getId();
                    tLRPC$TL_messages_searchGlobal2.offset_rate = this.nextSearchRate;
                    TLRPC$Peer tLRPC$Peer = messageObject.messageOwner.peer_id;
                    long j5 = tLRPC$Peer.channel_id;
                    if (j5 == 0) {
                        j5 = tLRPC$Peer.chat_id;
                        if (j5 == 0) {
                            j4 = tLRPC$Peer.user_id;
                            tLRPC$TL_messages_searchGlobal2.offset_peer = accountInstance.getMessagesController().getInputPeer(j4);
                            tLRPC$TL_messages_searchGlobal = tLRPC$TL_messages_searchGlobal2;
                        }
                    }
                    j4 = -j5;
                    tLRPC$TL_messages_searchGlobal2.offset_peer = accountInstance.getMessagesController().getInputPeer(j4);
                    tLRPC$TL_messages_searchGlobal = tLRPC$TL_messages_searchGlobal2;
                } else {
                    tLRPC$TL_messages_searchGlobal2.offset_rate = 0;
                    tLRPC$TL_messages_searchGlobal2.offset_id = 0;
                    tLRPC$TL_messages_searchGlobal2.offset_peer = new TLRPC$TL_inputPeerEmpty();
                    tLRPC$TL_messages_searchGlobal = tLRPC$TL_messages_searchGlobal2;
                }
            }
            TLRPC$TL_messages_searchGlobal tLRPC$TL_messages_searchGlobal3 = tLRPC$TL_messages_searchGlobal;
            ArrayList<Object> arrayList4 = arrayList;
            this.lastMessagesSearchString = str;
            this.lastSearchFilterQueryString = str2;
            ArrayList arrayList5 = new ArrayList();
            FiltersView.fillTipDates(this.lastMessagesSearchString, arrayList5);
            accountInstance.getConnectionsManager().sendRequest(tLRPC$TL_messages_searchGlobal3, new ChatAttachAlertDocumentLayout$SearchAdapter$$ExternalSyntheticLambda5(this, accountInstance, str, i, z, j, j2, arrayList4, arrayList5));
        }

        public /* synthetic */ void lambda$searchGlobal$3(AccountInstance accountInstance, String str, int i, boolean z, long j, long j2, ArrayList arrayList, ArrayList arrayList2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            ArrayList arrayList3 = new ArrayList();
            if (tLRPC$TL_error == null) {
                TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
                int size = tLRPC$messages_Messages.messages.size();
                for (int i2 = 0; i2 < size; i2++) {
                    MessageObject messageObject = new MessageObject(accountInstance.getCurrentAccount(), tLRPC$messages_Messages.messages.get(i2), false, true);
                    messageObject.setQuery(str);
                    arrayList3.add(messageObject);
                }
            }
            AndroidUtilities.runOnUIThread(new ChatAttachAlertDocumentLayout$SearchAdapter$$ExternalSyntheticLambda0(this, i, tLRPC$TL_error, tLObject, accountInstance, z, str, arrayList3, j, j2, arrayList, arrayList2));
        }

        public /* synthetic */ void lambda$searchGlobal$2(int i, TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, AccountInstance accountInstance, boolean z, String str, ArrayList arrayList, long j, long j2, ArrayList arrayList2, ArrayList arrayList3) {
            boolean z2;
            if (i != this.requestIndex) {
                return;
            }
            this.isLoading = false;
            if (tLRPC$TL_error != null) {
                ChatAttachAlertDocumentLayout.this.emptyView.title.setText(LocaleController.getString("SearchEmptyViewTitle2", 2131628168));
                ChatAttachAlertDocumentLayout.this.emptyView.subtitle.setVisibility(0);
                ChatAttachAlertDocumentLayout.this.emptyView.subtitle.setText(LocaleController.getString("SearchEmptyViewFilteredSubtitle2", 2131628161));
                ChatAttachAlertDocumentLayout.this.emptyView.showProgress(false, true);
                return;
            }
            ChatAttachAlertDocumentLayout.this.emptyView.showProgress(false);
            TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
            this.nextSearchRate = tLRPC$messages_Messages.next_rate;
            accountInstance.getMessagesStorage().putUsersAndChats(tLRPC$messages_Messages.users, tLRPC$messages_Messages.chats, true, true);
            accountInstance.getMessagesController().putUsers(tLRPC$messages_Messages.users, false);
            accountInstance.getMessagesController().putChats(tLRPC$messages_Messages.chats, false);
            if (!z) {
                this.messages.clear();
                this.messagesById.clear();
                this.sections.clear();
                this.sectionArrays.clear();
            }
            int i2 = tLRPC$messages_Messages.count;
            this.currentDataQuery = str;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i3);
                ArrayList<MessageObject> arrayList4 = this.sectionArrays.get(messageObject.monthKey);
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList<>();
                    this.sectionArrays.put(messageObject.monthKey, arrayList4);
                    this.sections.add(messageObject.monthKey);
                }
                arrayList4.add(messageObject);
                this.messages.add(messageObject);
                this.messagesById.put(messageObject.getId(), messageObject);
            }
            if (this.messages.size() > i2) {
                i2 = this.messages.size();
            }
            this.endReached = this.messages.size() >= i2;
            if (this.messages.isEmpty()) {
                if (!TextUtils.isEmpty(this.currentDataQuery) || j != 0 || j2 != 0) {
                    ChatAttachAlertDocumentLayout.this.emptyView.title.setText(LocaleController.getString("SearchEmptyViewTitle2", 2131628168));
                    ChatAttachAlertDocumentLayout.this.emptyView.subtitle.setVisibility(0);
                    ChatAttachAlertDocumentLayout.this.emptyView.subtitle.setText(LocaleController.getString("SearchEmptyViewFilteredSubtitle2", 2131628161));
                } else {
                    ChatAttachAlertDocumentLayout.this.emptyView.title.setText(LocaleController.getString("SearchEmptyViewTitle", 2131628167));
                    ChatAttachAlertDocumentLayout.this.emptyView.subtitle.setVisibility(0);
                    ChatAttachAlertDocumentLayout.this.emptyView.subtitle.setText(LocaleController.getString("SearchEmptyViewFilteredSubtitleFiles", 2131628162));
                }
            }
            if (!z) {
                this.localTipChats.clear();
                if (arrayList2 != null) {
                    this.localTipChats.addAll(arrayList2);
                }
                if (str.length() >= 3 && (LocaleController.getString("SavedMessages", 2131628140).toLowerCase().startsWith(str) || "saved messages".startsWith(str))) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= this.localTipChats.size()) {
                            z2 = false;
                            break;
                        } else if ((this.localTipChats.get(i4) instanceof TLRPC$User) && UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().id == ((TLRPC$User) this.localTipChats.get(i4)).id) {
                            z2 = true;
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (!z2) {
                        this.localTipChats.add(0, UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser());
                    }
                }
                this.localTipDates.clear();
                this.localTipDates.addAll(arrayList3);
                updateFiltersView(TextUtils.isEmpty(this.currentDataQuery), this.localTipChats, this.localTipDates, true);
            }
            View view = null;
            int i5 = -1;
            for (int i6 = 0; i6 < size; i6++) {
                View childAt = ChatAttachAlertDocumentLayout.this.listView.getChildAt(i6);
                if (childAt instanceof FlickerLoadingView) {
                    i5 = ChatAttachAlertDocumentLayout.this.listView.getChildAdapterPosition(childAt);
                    view = childAt;
                }
            }
            if (view != null) {
                ChatAttachAlertDocumentLayout.this.listView.removeView(view);
            }
            if ((ChatAttachAlertDocumentLayout.this.loadingView.getVisibility() == 0 && ChatAttachAlertDocumentLayout.this.listView.getChildCount() <= 1) || view != null) {
                ChatAttachAlertDocumentLayout.this.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass3(view, i5, accountInstance));
            }
            notifyDataSetChanged();
        }

        /* renamed from: org.telegram.ui.Components.ChatAttachAlertDocumentLayout$SearchAdapter$3 */
        /* loaded from: classes3.dex */
        public class AnonymousClass3 implements ViewTreeObserver.OnPreDrawListener {
            final /* synthetic */ AccountInstance val$accountInstance;
            final /* synthetic */ View val$finalProgressView;
            final /* synthetic */ int val$finalProgressViewPosition;

            AnonymousClass3(View view, int i, AccountInstance accountInstance) {
                SearchAdapter.this = r1;
                this.val$finalProgressView = view;
                this.val$finalProgressViewPosition = i;
                this.val$accountInstance = accountInstance;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                ChatAttachAlertDocumentLayout.this.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = ChatAttachAlertDocumentLayout.this.listView.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i = 0; i < childCount; i++) {
                    View childAt = ChatAttachAlertDocumentLayout.this.listView.getChildAt(i);
                    if (this.val$finalProgressView == null || ChatAttachAlertDocumentLayout.this.listView.getChildAdapterPosition(childAt) >= this.val$finalProgressViewPosition) {
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(ChatAttachAlertDocumentLayout.this.listView.getMeasuredHeight(), Math.max(0, childAt.getTop())) / ChatAttachAlertDocumentLayout.this.listView.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.addListener(new AnonymousClass1());
                SearchAdapter.this.animationIndex = this.val$accountInstance.getNotificationCenter().setAnimationInProgress(SearchAdapter.this.animationIndex, null);
                animatorSet.start();
                View view = this.val$finalProgressView;
                if (view != null && view.getParent() == null) {
                    ChatAttachAlertDocumentLayout.this.listView.addView(this.val$finalProgressView);
                    RecyclerView.LayoutManager layoutManager = ChatAttachAlertDocumentLayout.this.listView.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.ignoreView(this.val$finalProgressView);
                        View view2 = this.val$finalProgressView;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, View.ALPHA, view2.getAlpha(), 0.0f);
                        ofFloat2.addListener(new AnonymousClass2(layoutManager));
                        ofFloat2.start();
                    }
                }
                return true;
            }

            /* renamed from: org.telegram.ui.Components.ChatAttachAlertDocumentLayout$SearchAdapter$3$1 */
            /* loaded from: classes3.dex */
            class AnonymousClass1 extends AnimatorListenerAdapter {
                AnonymousClass1() {
                    AnonymousClass3.this = r1;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    AnonymousClass3.this.val$accountInstance.getNotificationCenter().onAnimationFinish(SearchAdapter.this.animationIndex);
                }
            }

            /* renamed from: org.telegram.ui.Components.ChatAttachAlertDocumentLayout$SearchAdapter$3$2 */
            /* loaded from: classes3.dex */
            class AnonymousClass2 extends AnimatorListenerAdapter {
                final /* synthetic */ RecyclerView.LayoutManager val$layoutManager;

                AnonymousClass2(RecyclerView.LayoutManager layoutManager) {
                    AnonymousClass3.this = r1;
                    this.val$layoutManager = layoutManager;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    AnonymousClass3.this.val$finalProgressView.setAlpha(1.0f);
                    this.val$layoutManager.stopIgnoringView(AnonymousClass3.this.val$finalProgressView);
                    ChatAttachAlertDocumentLayout.this.listView.removeView(AnonymousClass3.this.val$finalProgressView);
                }
            }
        }

        private void updateSearchResults(ArrayList<ListItem> arrayList, String str) {
            AndroidUtilities.runOnUIThread(new ChatAttachAlertDocumentLayout$SearchAdapter$$ExternalSyntheticLambda4(this, arrayList));
        }

        public /* synthetic */ void lambda$updateSearchResults$5(ArrayList arrayList) {
            if (ChatAttachAlertDocumentLayout.this.searching && ChatAttachAlertDocumentLayout.this.listView.getAdapter() != ChatAttachAlertDocumentLayout.this.searchAdapter) {
                ChatAttachAlertDocumentLayout.this.listView.setAdapter(ChatAttachAlertDocumentLayout.this.searchAdapter);
            }
            this.searchResult = arrayList;
            notifyDataSetChanged();
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SectionsAdapter
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder, int i, int i2) {
            int itemViewType = viewHolder.getItemViewType();
            return itemViewType == 1 || itemViewType == 4;
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SectionsAdapter
        public int getSectionCount() {
            if (!this.sections.isEmpty()) {
                return 2 + this.sections.size() + (!this.endReached ? 1 : 0);
            }
            return 2;
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SectionsAdapter
        public Object getItem(int i, int i2) {
            ArrayList<MessageObject> arrayList;
            if (i == 0) {
                if (i2 >= this.searchResult.size()) {
                    return null;
                }
                return this.searchResult.get(i2);
            }
            int i3 = i - 1;
            if (i3 >= this.sections.size() || (arrayList = this.sectionArrays.get(this.sections.get(i3))) == null) {
                return null;
            }
            return arrayList.get(i2 - ((i3 != 0 || !this.searchResult.isEmpty()) ? 1 : 0));
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SectionsAdapter
        public int getCountForSection(int i) {
            if (i == 0) {
                return this.searchResult.size();
            }
            int i2 = i - 1;
            int i3 = 1;
            if (i2 >= this.sections.size()) {
                return 1;
            }
            ArrayList<MessageObject> arrayList = this.sectionArrays.get(this.sections.get(i2));
            if (arrayList == null) {
                return 0;
            }
            int size = arrayList.size();
            if (i2 == 0 && this.searchResult.isEmpty()) {
                i3 = 0;
            }
            return size + i3;
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SectionsAdapter
        public View getSectionHeaderView(int i, View view) {
            String str;
            GraySectionCell graySectionCell = (GraySectionCell) view;
            if (graySectionCell == null) {
                graySectionCell = new GraySectionCell(this.mContext, ChatAttachAlertDocumentLayout.this.resourcesProvider);
                graySectionCell.setBackgroundColor(ChatAttachAlertDocumentLayout.this.getThemedColor("graySection") & (-218103809));
            }
            if (i == 0 || (i == 1 && this.searchResult.isEmpty())) {
                graySectionCell.setAlpha(0.0f);
                return graySectionCell;
            }
            int i2 = i - 1;
            if (i2 < this.sections.size()) {
                graySectionCell.setAlpha(1.0f);
                ArrayList<MessageObject> arrayList = this.sectionArrays.get(this.sections.get(i2));
                if (arrayList != null) {
                    MessageObject messageObject = arrayList.get(0);
                    if (i2 == 0 && !this.searchResult.isEmpty()) {
                        str = LocaleController.getString("GlobalSearch", 2131626126);
                    } else {
                        str = LocaleController.formatSectionDate(messageObject.messageOwner.date);
                    }
                    graySectionCell.setText(str);
                }
            }
            return view;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            GraySectionCell graySectionCell;
            if (i == 0) {
                graySectionCell = new GraySectionCell(this.mContext, ChatAttachAlertDocumentLayout.this.resourcesProvider);
            } else {
                int i2 = 2;
                if (i != 1) {
                    if (i == 2) {
                        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(this.mContext, ChatAttachAlertDocumentLayout.this.resourcesProvider);
                        flickerLoadingView.setViewType(3);
                        flickerLoadingView.setIsSingleCell(true);
                        graySectionCell = flickerLoadingView;
                    } else if (i != 4) {
                        graySectionCell = new View(this.mContext);
                    }
                }
                Context context = this.mContext;
                if (i == 1) {
                    i2 = 1;
                }
                SharedDocumentCell sharedDocumentCell = new SharedDocumentCell(context, i2, ChatAttachAlertDocumentLayout.this.resourcesProvider);
                sharedDocumentCell.setDrawDownloadIcon(false);
                graySectionCell = sharedDocumentCell;
            }
            graySectionCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(graySectionCell);
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SectionsAdapter
        public void onBindViewHolder(int i, int i2, RecyclerView.ViewHolder viewHolder) {
            String str;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 2 || itemViewType == 3) {
                return;
            }
            boolean z = false;
            if (itemViewType == 0) {
                int i3 = i - 1;
                ArrayList<MessageObject> arrayList = this.sectionArrays.get(this.sections.get(i3));
                if (arrayList == null) {
                    return;
                }
                MessageObject messageObject = arrayList.get(0);
                if (i3 == 0 && !this.searchResult.isEmpty()) {
                    str = LocaleController.getString("GlobalSearch", 2131626126);
                } else {
                    str = LocaleController.formatSectionDate(messageObject.messageOwner.date);
                }
                ((GraySectionCell) viewHolder.itemView).setText(str);
            } else if (itemViewType != 1 && itemViewType != 4) {
            } else {
                SharedDocumentCell sharedDocumentCell = (SharedDocumentCell) viewHolder.itemView;
                if (i == 0) {
                    ListItem listItem = (ListItem) getItem(i2);
                    SharedDocumentCell sharedDocumentCell2 = (SharedDocumentCell) viewHolder.itemView;
                    int i4 = listItem.icon;
                    if (i4 != 0) {
                        sharedDocumentCell2.setTextAndValueAndTypeAndThumb(listItem.title, listItem.subtitle, null, null, i4, false);
                    } else {
                        sharedDocumentCell2.setTextAndValueAndTypeAndThumb(listItem.title, listItem.subtitle, listItem.ext.toUpperCase().substring(0, Math.min(listItem.ext.length(), 4)), listItem.thumb, 0, false);
                    }
                    if (listItem.file != null) {
                        sharedDocumentCell2.setChecked(ChatAttachAlertDocumentLayout.this.selectedFiles.containsKey(listItem.file.toString()), !ChatAttachAlertDocumentLayout.this.scrolling);
                        return;
                    } else {
                        sharedDocumentCell2.setChecked(false, !ChatAttachAlertDocumentLayout.this.scrolling);
                        return;
                    }
                }
                int i5 = i - 1;
                if (i5 != 0 || !this.searchResult.isEmpty()) {
                    i2--;
                }
                ArrayList<MessageObject> arrayList2 = this.sectionArrays.get(this.sections.get(i5));
                if (arrayList2 == null) {
                    return;
                }
                MessageObject messageObject2 = arrayList2.get(i2);
                boolean z2 = sharedDocumentCell.getMessage() != null && sharedDocumentCell.getMessage().getId() == messageObject2.getId();
                if (i2 != arrayList2.size() - 1 || (i5 == this.sections.size() - 1 && this.isLoading)) {
                    z = true;
                }
                sharedDocumentCell.setDocument(messageObject2, z);
                sharedDocumentCell.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass4(sharedDocumentCell, messageObject2, z2));
            }
        }

        /* renamed from: org.telegram.ui.Components.ChatAttachAlertDocumentLayout$SearchAdapter$4 */
        /* loaded from: classes3.dex */
        class AnonymousClass4 implements ViewTreeObserver.OnPreDrawListener {
            final /* synthetic */ boolean val$animated;
            final /* synthetic */ MessageObject val$messageObject;
            final /* synthetic */ SharedDocumentCell val$sharedDocumentCell;

            AnonymousClass4(SharedDocumentCell sharedDocumentCell, MessageObject messageObject, boolean z) {
                SearchAdapter.this = r1;
                this.val$sharedDocumentCell = sharedDocumentCell;
                this.val$messageObject = messageObject;
                this.val$animated = z;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                this.val$sharedDocumentCell.getViewTreeObserver().removeOnPreDrawListener(this);
                if (ChatAttachAlertDocumentLayout.this.parentAlert.actionBar.isActionModeShowed()) {
                    SearchAdapter.this.messageHashIdTmp.set(this.val$messageObject.getId(), this.val$messageObject.getDialogId());
                    this.val$sharedDocumentCell.setChecked(ChatAttachAlertDocumentLayout.this.selectedMessages.containsKey(SearchAdapter.this.messageHashIdTmp), this.val$animated);
                    return true;
                }
                this.val$sharedDocumentCell.setChecked(false, this.val$animated);
                return true;
            }
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SectionsAdapter
        public int getItemViewType(int i, int i2) {
            if (i == 0) {
                return 1;
            }
            if (i == getSectionCount() - 1) {
                return 3;
            }
            int i3 = i - 1;
            if (i3 >= this.sections.size()) {
                return 2;
            }
            return ((i3 != 0 || !this.searchResult.isEmpty()) && i2 == 0) ? 0 : 4;
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SectionsAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        public void notifyDataSetChanged() {
            super.notifyDataSetChanged();
            ChatAttachAlertDocumentLayout.this.updateEmptyView();
        }

        @Override // org.telegram.ui.Components.RecyclerListView.FastScrollAdapter
        public void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            iArr[0] = 0;
            iArr[1] = 0;
        }
    }

    @Override // org.telegram.ui.Components.ChatAttachAlert.AttachAlertLayout
    ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.searchItem.getSearchField(), ThemeDescription.FLAG_CURSORCOLOR, null, null, null, null, "dialogTextBlack"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, "dialogScrollGlow"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, "windowBackgroundGrayShadow"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{ShadowSectionCell.class}, null, null, null, "windowBackgroundGray"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, "listSelectorSDK21"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, "divider"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{SharedDocumentCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{SharedDocumentCell.class}, new String[]{"dateTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText3"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKBOX, new Class[]{SharedDocumentCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "checkbox"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKBOXCHECK, new Class[]{SharedDocumentCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "checkboxCheck"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_IMAGECOLOR, new Class[]{SharedDocumentCell.class}, new String[]{"thumbImageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "files_folderIcon"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_IMAGECOLOR | ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{SharedDocumentCell.class}, new String[]{"thumbImageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "files_folderIconBackground"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{SharedDocumentCell.class}, new String[]{"extTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "files_iconText"));
        return arrayList;
    }
}
