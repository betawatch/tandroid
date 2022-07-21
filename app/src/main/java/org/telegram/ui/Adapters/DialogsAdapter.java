package org.telegram.ui.Adapters;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Dialog;
import org.telegram.tgnet.TLRPC$RecentMeUrl;
import org.telegram.tgnet.TLRPC$TL_contact;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$UserStatus;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ArchiveHintCell;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Cells.DialogMeUrlCell;
import org.telegram.ui.Cells.DialogsEmptyCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Components.BlurredRecyclerView;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.PullForegroundDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.DialogsActivity;
/* loaded from: classes3.dex */
public class DialogsAdapter extends RecyclerListView.SelectionAdapter {
    private ArchiveHintCell archiveHintCell;
    private Drawable arrowDrawable;
    private int currentAccount;
    private int currentCount;
    private int dialogsCount;
    private boolean dialogsListFrozen;
    private int dialogsType;
    private int folderId;
    private boolean forceShowEmptyCell;
    private boolean forceUpdatingContacts;
    private boolean hasHints;
    private boolean isOnlySelect;
    private boolean isReordering;
    public int lastDialogsEmptyType = -1;
    private long lastSortTime;
    private Context mContext;
    private ArrayList<TLRPC$TL_contact> onlineContacts;
    private long openedDialogId;
    private DialogsActivity parentFragment;
    private DialogsPreloader preloader;
    private int prevContactsCount;
    private int prevDialogsCount;
    private PullForegroundDrawable pullForegroundDrawable;
    private ArrayList<Long> selectedDialogs;
    private boolean showArchiveHint;

    public DialogsAdapter(DialogsActivity dialogsActivity, Context context, int i, int i2, boolean z, ArrayList<Long> arrayList, int i3) {
        this.mContext = context;
        this.parentFragment = dialogsActivity;
        this.dialogsType = i;
        this.folderId = i2;
        this.isOnlySelect = z;
        this.hasHints = i2 == 0 && i == 0 && !z;
        this.selectedDialogs = arrayList;
        this.currentAccount = i3;
        if (i2 == 1) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            this.showArchiveHint = globalMainSettings.getBoolean("archivehint", true);
            globalMainSettings.edit().putBoolean("archivehint", false).commit();
        }
        if (i2 == 0) {
            this.preloader = new DialogsPreloader();
        }
    }

    public void setOpenedDialogId(long j) {
        this.openedDialogId = j;
    }

    public void onReorderStateChanged(boolean z) {
        this.isReordering = z;
    }

    public int fixPosition(int i) {
        int i2;
        if (this.hasHints) {
            i -= MessagesController.getInstance(this.currentAccount).hintDialogs.size() + 2;
        }
        return (this.showArchiveHint || (i2 = this.dialogsType) == 11 || i2 == 13) ? i - 2 : i2 == 12 ? i - 1 : i;
    }

    public boolean isDataSetChanged() {
        int i = this.currentCount;
        return i != getItemCount() || i == 1;
    }

    public void setDialogsType(int i) {
        this.dialogsType = i;
        notifyDataSetChanged();
    }

    public int getDialogsType() {
        return this.dialogsType;
    }

    public int getDialogsCount() {
        return this.dialogsCount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        int i;
        int i2;
        int i3;
        int i4;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        int size = this.parentFragment.getDialogsArray(this.currentAccount, this.dialogsType, this.folderId, this.dialogsListFrozen).size();
        this.dialogsCount = size;
        boolean z = false;
        boolean z2 = true;
        if (!this.forceUpdatingContacts && !this.forceShowEmptyCell && (i3 = this.dialogsType) != 7 && i3 != 8 && i3 != 11 && size == 0 && ((i4 = this.folderId) != 0 || messagesController.isLoadingDialogs(i4) || !MessagesController.getInstance(this.currentAccount).isDialogsEndReached(this.folderId))) {
            this.onlineContacts = null;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("DialogsAdapter dialogsCount=" + this.dialogsCount + " dialogsType=" + this.dialogsType + " isLoadingDialogs=" + messagesController.isLoadingDialogs(this.folderId) + " isDialogsEndReached=" + MessagesController.getInstance(this.currentAccount).isDialogsEndReached(this.folderId));
            }
            if (this.folderId == 1 && this.showArchiveHint) {
                this.currentCount = 2;
                return 2;
            }
            this.currentCount = 0;
            return 0;
        } else if (this.dialogsCount == 0 && messagesController.isLoadingDialogs(this.folderId)) {
            this.currentCount = 0;
            return 0;
        } else {
            int i5 = this.dialogsCount;
            int i6 = this.dialogsType;
            if (i6 == 7 || i6 == 8 ? i5 == 0 : !(messagesController.isDialogsEndReached(this.folderId) && this.dialogsCount != 0)) {
                i5++;
            }
            if (this.hasHints) {
                i5 += messagesController.hintDialogs.size() + 2;
            } else if (this.dialogsType == 0 && (i2 = this.folderId) == 0 && messagesController.isDialogsEndReached(i2)) {
                if (ContactsController.getInstance(this.currentAccount).contacts.isEmpty() && !ContactsController.getInstance(this.currentAccount).doneLoadingContacts && !this.forceUpdatingContacts) {
                    this.onlineContacts = null;
                    if (BuildVars.LOGS_ENABLED) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("DialogsAdapter loadingContacts=");
                        if (!ContactsController.getInstance(this.currentAccount).contacts.isEmpty() || ContactsController.getInstance(this.currentAccount).doneLoadingContacts) {
                            z2 = false;
                        }
                        sb.append(z2);
                        sb.append("dialogsCount=");
                        sb.append(this.dialogsCount);
                        sb.append(" dialogsType=");
                        sb.append(this.dialogsType);
                        FileLog.d(sb.toString());
                    }
                    this.currentCount = 0;
                    return 0;
                } else if (messagesController.getAllFoldersDialogsCount() <= 10 && ContactsController.getInstance(this.currentAccount).doneLoadingContacts && !ContactsController.getInstance(this.currentAccount).contacts.isEmpty()) {
                    if (this.onlineContacts == null || this.prevDialogsCount != this.dialogsCount || this.prevContactsCount != ContactsController.getInstance(this.currentAccount).contacts.size()) {
                        ArrayList<TLRPC$TL_contact> arrayList = new ArrayList<>(ContactsController.getInstance(this.currentAccount).contacts);
                        this.onlineContacts = arrayList;
                        this.prevContactsCount = arrayList.size();
                        this.prevDialogsCount = messagesController.dialogs_dict.size();
                        long j = UserConfig.getInstance(this.currentAccount).clientUserId;
                        int size2 = this.onlineContacts.size();
                        int i7 = 0;
                        while (i7 < size2) {
                            long j2 = this.onlineContacts.get(i7).user_id;
                            if (j2 == j || messagesController.dialogs_dict.get(j2) != null) {
                                this.onlineContacts.remove(i7);
                                i7--;
                                size2--;
                            }
                            i7++;
                        }
                        if (this.onlineContacts.isEmpty()) {
                            this.onlineContacts = null;
                        }
                        sortOnlineContacts(false);
                        if (this.parentFragment.getContactsAlpha() == 0.0f) {
                            registerAdapterDataObserver(new AnonymousClass1());
                        }
                    }
                    ArrayList<TLRPC$TL_contact> arrayList2 = this.onlineContacts;
                    if (arrayList2 != null) {
                        i5 += arrayList2.size() + 2;
                        z = true;
                    }
                }
            }
            int i8 = this.folderId;
            if (i8 == 0 && !z && this.dialogsCount == 0 && this.forceUpdatingContacts) {
                i5 += 3;
            }
            if (i8 == 0 && this.onlineContacts != null && !z) {
                this.onlineContacts = null;
            }
            if (i8 == 1 && this.showArchiveHint) {
                i5 += 2;
            }
            if (i8 == 0 && (i = this.dialogsCount) != 0) {
                i5++;
                if (i > 10 && this.dialogsType == 0) {
                    i5++;
                }
            }
            int i9 = this.dialogsType;
            if (i9 == 11 || i9 == 13) {
                i5 += 2;
            } else if (i9 == 12) {
                i5++;
            }
            this.currentCount = i5;
            return i5;
        }
    }

    /* renamed from: org.telegram.ui.Adapters.DialogsAdapter$1 */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 extends RecyclerView.AdapterDataObserver {
        AnonymousClass1() {
            DialogsAdapter.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            DialogsAdapter.this.parentFragment.setContactsAlpha(0.0f);
            DialogsAdapter.this.parentFragment.animateContactsAlpha(1.0f);
            DialogsAdapter.this.unregisterAdapterDataObserver(this);
        }
    }

    public TLObject getItem(int i) {
        int i2;
        int i3;
        ArrayList<TLRPC$TL_contact> arrayList = this.onlineContacts;
        if (arrayList != null && ((i3 = this.dialogsCount) == 0 || i >= i3)) {
            int i4 = i3 == 0 ? i - 3 : i - (i3 + 2);
            if (i4 >= 0 && i4 < arrayList.size()) {
                return MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.onlineContacts.get(i4).user_id));
            }
            return null;
        }
        if (this.showArchiveHint || (i2 = this.dialogsType) == 11 || i2 == 13) {
            i -= 2;
        } else if (i2 == 12) {
            i--;
        }
        ArrayList<TLRPC$Dialog> dialogsArray = this.parentFragment.getDialogsArray(this.currentAccount, this.dialogsType, this.folderId, this.dialogsListFrozen);
        if (this.hasHints) {
            int size = MessagesController.getInstance(this.currentAccount).hintDialogs.size() + 2;
            if (i < size) {
                return MessagesController.getInstance(this.currentAccount).hintDialogs.get(i - 1);
            }
            i -= size;
        }
        if (i >= 0 && i < dialogsArray.size()) {
            return dialogsArray.get(i);
        }
        return null;
    }

    public void sortOnlineContacts(boolean z) {
        if (this.onlineContacts != null) {
            if (z && SystemClock.elapsedRealtime() - this.lastSortTime < 2000) {
                return;
            }
            this.lastSortTime = SystemClock.elapsedRealtime();
            try {
                int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                Collections.sort(this.onlineContacts, new DialogsAdapter$$ExternalSyntheticLambda3(MessagesController.getInstance(this.currentAccount), currentTime));
                if (!z) {
                    return;
                }
                notifyDataSetChanged();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0053 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005c A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ int lambda$sortOnlineContacts$0(MessagesController messagesController, int i, TLRPC$TL_contact tLRPC$TL_contact, TLRPC$TL_contact tLRPC$TL_contact2) {
        int i2;
        int i3;
        TLRPC$User user = messagesController.getUser(Long.valueOf(tLRPC$TL_contact2.user_id));
        TLRPC$User user2 = messagesController.getUser(Long.valueOf(tLRPC$TL_contact.user_id));
        if (user != null) {
            if (user.self) {
                i2 = i + 50000;
            } else {
                TLRPC$UserStatus tLRPC$UserStatus = user.status;
                if (tLRPC$UserStatus != null) {
                    i2 = tLRPC$UserStatus.expires;
                }
            }
            if (user2 != null) {
                if (user2.self) {
                    i3 = i + 50000;
                } else {
                    TLRPC$UserStatus tLRPC$UserStatus2 = user2.status;
                    if (tLRPC$UserStatus2 != null) {
                        i3 = tLRPC$UserStatus2.expires;
                    }
                }
                if (i2 <= 0 && i3 > 0) {
                    if (i2 > i3) {
                        return 1;
                    }
                    return i2 < i3 ? -1 : 0;
                } else if (i2 >= 0 && i3 < 0) {
                    if (i2 > i3) {
                        return 1;
                    }
                    return i2 < i3 ? -1 : 0;
                } else if ((i2 >= 0 && i3 > 0) || (i2 == 0 && i3 != 0)) {
                    return -1;
                } else {
                    return (i3 >= 0 || i2 != 0) ? 1 : 0;
                }
            }
            i3 = 0;
            if (i2 <= 0) {
            }
            if (i2 >= 0) {
            }
            if (i2 >= 0) {
            }
            if (i3 >= 0) {
            }
        }
        i2 = 0;
        if (user2 != null) {
        }
        i3 = 0;
        if (i2 <= 0) {
        }
        if (i2 >= 0) {
        }
        if (i2 >= 0) {
        }
        if (i3 >= 0) {
        }
    }

    public void setDialogsListFrozen(boolean z) {
        this.dialogsListFrozen = z;
    }

    public ViewPager getArchiveHintCellPager() {
        ArchiveHintCell archiveHintCell = this.archiveHintCell;
        if (archiveHintCell != null) {
            return archiveHintCell.getViewPager();
        }
        return null;
    }

    public void updateHasHints() {
        this.hasHints = this.folderId == 0 && this.dialogsType == 0 && !this.isOnlySelect && !MessagesController.getInstance(this.currentAccount).hintDialogs.isEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void notifyDataSetChanged() {
        updateHasHints();
        super.notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        if (view instanceof DialogCell) {
            DialogCell dialogCell = (DialogCell) view;
            dialogCell.onReorderStateChanged(this.isReordering, false);
            dialogCell.setDialogIndex(fixPosition(viewHolder.getAdapterPosition()));
            dialogCell.checkCurrentDialogIndex(this.dialogsListFrozen);
            dialogCell.setChecked(this.selectedDialogs.contains(Long.valueOf(dialogCell.getDialogId())), false);
        }
    }

    @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
    public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        int itemViewType = viewHolder.getItemViewType();
        return (itemViewType == 1 || itemViewType == 5 || itemViewType == 3 || itemViewType == 8 || itemViewType == 7 || itemViewType == 9 || itemViewType == 10 || itemViewType == 11 || itemViewType == 13) ? false : true;
    }

    public /* synthetic */ void lambda$onCreateViewHolder$1(View view) {
        MessagesController.getInstance(this.currentAccount).hintDialogs.clear();
        MessagesController.getGlobalMainSettings().edit().remove("installReferer").commit();
        notifyDataSetChanged();
    }

    /* renamed from: org.telegram.ui.Adapters.DialogsAdapter$2 */
    /* loaded from: classes3.dex */
    class AnonymousClass2 extends FrameLayout {
        AnonymousClass2(DialogsAdapter dialogsAdapter, Context context) {
            super(context);
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824));
        }
    }

    /* renamed from: org.telegram.ui.Adapters.DialogsAdapter$3 */
    /* loaded from: classes3.dex */
    class AnonymousClass3 extends TextInfoPrivacyCell {
        private long lastUpdateTime;
        private float moveProgress;
        private int movement;
        private int originalX;
        private int originalY;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(Context context) {
            super(context);
            DialogsAdapter.this = r1;
        }

        @Override // org.telegram.ui.Cells.TextInfoPrivacyCell
        protected void afterTextDraw() {
            if (DialogsAdapter.this.arrowDrawable != null) {
                Rect bounds = DialogsAdapter.this.arrowDrawable.getBounds();
                Drawable drawable = DialogsAdapter.this.arrowDrawable;
                int i = this.originalX;
                drawable.setBounds(i, this.originalY, bounds.width() + i, this.originalY + bounds.height());
            }
        }

        @Override // org.telegram.ui.Cells.TextInfoPrivacyCell
        protected void onTextDraw() {
            if (DialogsAdapter.this.arrowDrawable != null) {
                Rect bounds = DialogsAdapter.this.arrowDrawable.getBounds();
                int dp = (int) (this.moveProgress * AndroidUtilities.dp(3.0f));
                this.originalX = bounds.left;
                this.originalY = bounds.top;
                DialogsAdapter.this.arrowDrawable.setBounds(this.originalX + dp, this.originalY + AndroidUtilities.dp(1.0f), this.originalX + dp + bounds.width(), this.originalY + AndroidUtilities.dp(1.0f) + bounds.height());
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.lastUpdateTime;
                if (j > 17) {
                    j = 17;
                }
                this.lastUpdateTime = elapsedRealtime;
                if (this.movement == 0) {
                    float f = this.moveProgress + (((float) j) / 664.0f);
                    this.moveProgress = f;
                    if (f >= 1.0f) {
                        this.movement = 1;
                        this.moveProgress = 1.0f;
                    }
                } else {
                    float f2 = this.moveProgress - (((float) j) / 664.0f);
                    this.moveProgress = f2;
                    if (f2 <= 0.0f) {
                        this.movement = 0;
                        this.moveProgress = 0.0f;
                    }
                }
                getTextView().invalidate();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [org.telegram.ui.Cells.DialogMeUrlCell] */
    /* JADX WARN: Type inference failed for: r1v12, types: [org.telegram.ui.Cells.DialogsEmptyCell] */
    /* JADX WARN: Type inference failed for: r1v13, types: [org.telegram.ui.Cells.UserCell] */
    /* JADX WARN: Type inference failed for: r1v14, types: [android.view.View, org.telegram.ui.Cells.HeaderCell] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17, types: [org.telegram.ui.Cells.ArchiveHintCell] */
    /* JADX WARN: Type inference failed for: r1v18, types: [org.telegram.ui.Adapters.DialogsAdapter$LastEmptyView] */
    /* JADX WARN: Type inference failed for: r1v20, types: [android.view.View, org.telegram.ui.Cells.HeaderCell] */
    /* JADX WARN: Type inference failed for: r1v21, types: [org.telegram.ui.Cells.TextCell] */
    /* JADX WARN: Type inference failed for: r1v3, types: [org.telegram.ui.Cells.DialogCell] */
    /* JADX WARN: Type inference failed for: r1v4, types: [org.telegram.ui.Cells.ProfileSearchCell] */
    /* JADX WARN: Type inference failed for: r1v5, types: [org.telegram.ui.Components.FlickerLoadingView] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.widget.FrameLayout, org.telegram.ui.Cells.HeaderCell] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ?? r1;
        View view;
        switch (i) {
            case 0:
                if (this.dialogsType == 2) {
                    r1 = new ProfileSearchCell(this.mContext);
                    break;
                } else {
                    r1 = new DialogCell(this.parentFragment, this.mContext, true, false, this.currentAccount, null);
                    r1.setArchivedPullAnimation(this.pullForegroundDrawable);
                    r1.setPreloader(this.preloader);
                    break;
                }
            case 1:
            case 13:
                r1 = new FlickerLoadingView(this.mContext);
                r1.setIsSingleCell(true);
                int i2 = i == 13 ? 18 : 7;
                r1.setViewType(i2);
                if (i2 == 18) {
                    r1.setIgnoreHeightCheck(true);
                }
                if (i == 13) {
                    r1.setItemsCount((int) ((AndroidUtilities.displaySize.y * 0.5f) / AndroidUtilities.dp(64.0f)));
                    break;
                }
                break;
            case 2:
                r1 = new HeaderCell(this.mContext);
                r1.setText(LocaleController.getString("RecentlyViewed", 2131627927));
                TextView textView = new TextView(this.mContext);
                textView.setTextSize(1, 15.0f);
                textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
                textView.setTextColor(Theme.getColor("windowBackgroundWhiteBlueHeader"));
                textView.setText(LocaleController.getString("RecentlyViewedHide", 2131627928));
                int i3 = 3;
                textView.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
                if (!LocaleController.isRTL) {
                    i3 = 5;
                }
                r1.addView(textView, LayoutHelper.createFrame(-1, -1.0f, i3 | 48, 17.0f, 15.0f, 17.0f, 0.0f));
                textView.setOnClickListener(new DialogsAdapter$$ExternalSyntheticLambda0(this));
                break;
            case 3:
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this, this.mContext);
                anonymousClass2.setBackgroundColor(Theme.getColor("windowBackgroundGray"));
                View view2 = new View(this.mContext);
                view2.setBackgroundDrawable(Theme.getThemedDrawable(this.mContext, 2131165435, "windowBackgroundGrayShadow"));
                anonymousClass2.addView(view2, LayoutHelper.createFrame(-1, -1.0f));
                r1 = anonymousClass2;
                break;
            case 4:
                r1 = new DialogMeUrlCell(this.mContext);
                break;
            case 5:
                r1 = new DialogsEmptyCell(this.mContext);
                break;
            case 6:
                r1 = new UserCell(this.mContext, 8, 0, false);
                break;
            case 7:
                r1 = new HeaderCell(this.mContext);
                r1.setPadding(0, 0, 0, AndroidUtilities.dp(12.0f));
                break;
            case 8:
                view = new ShadowSectionCell(this.mContext);
                CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(Theme.getColor("windowBackgroundGray")), Theme.getThemedDrawable(this.mContext, 2131165435, "windowBackgroundGrayShadow"));
                combinedDrawable.setFullsize(true);
                view.setBackgroundDrawable(combinedDrawable);
                r1 = view;
                break;
            case 9:
                r1 = new ArchiveHintCell(this.mContext);
                this.archiveHintCell = r1;
                break;
            case 10:
                r1 = new LastEmptyView(this.mContext);
                break;
            case 11:
                view = new AnonymousClass3(this.mContext);
                CombinedDrawable combinedDrawable2 = new CombinedDrawable(new ColorDrawable(Theme.getColor("windowBackgroundGray")), Theme.getThemedDrawable(this.mContext, 2131165435, "windowBackgroundGrayShadow"));
                combinedDrawable2.setFullsize(true);
                view.setBackgroundDrawable(combinedDrawable2);
                r1 = view;
                break;
            case 12:
            default:
                r1 = new TextCell(this.mContext);
                break;
            case 14:
                r1 = new HeaderCell(this.mContext, "key_graySectionText", 16, 0, false);
                r1.setHeight(32);
                r1.setClickable(false);
                break;
        }
        r1.setLayoutParams(new RecyclerView.LayoutParams(-1, i == 5 ? -1 : -2));
        return new RecyclerListView.Holder(r1);
    }

    public int dialogsEmptyType() {
        int i = this.dialogsType;
        return (i == 7 || i == 8) ? MessagesController.getInstance(this.currentAccount).isDialogsEndReached(this.folderId) ? 2 : 3 : this.onlineContacts != null ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        TLRPC$Chat tLRPC$Chat;
        String str;
        TLRPC$Chat chat;
        int i2;
        int itemViewType = viewHolder.getItemViewType();
        String str2 = null;
        boolean z = false;
        if (itemViewType == 0) {
            TLRPC$Dialog tLRPC$Dialog = (TLRPC$Dialog) getItem(i);
            TLRPC$Dialog tLRPC$Dialog2 = (TLRPC$Dialog) getItem(i + 1);
            int i3 = this.dialogsType;
            if (i3 == 2) {
                ProfileSearchCell profileSearchCell = (ProfileSearchCell) viewHolder.itemView;
                long dialogId = profileSearchCell.getDialogId();
                if (tLRPC$Dialog.id != 0) {
                    TLRPC$Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-tLRPC$Dialog.id));
                    tLRPC$Chat = (chat2 == null || chat2.migrated_to == null || (chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(chat2.migrated_to.channel_id))) == null) ? chat2 : chat;
                } else {
                    tLRPC$Chat = null;
                }
                if (tLRPC$Chat != null) {
                    str2 = tLRPC$Chat.title;
                    if (ChatObject.isChannel(tLRPC$Chat) && !tLRPC$Chat.megagroup) {
                        int i4 = tLRPC$Chat.participants_count;
                        if (i4 != 0) {
                            str = LocaleController.formatPluralStringComma("Subscribers", i4);
                        } else if (TextUtils.isEmpty(tLRPC$Chat.username)) {
                            str = LocaleController.getString("ChannelPrivate", 2131624959).toLowerCase();
                        } else {
                            str = LocaleController.getString("ChannelPublic", 2131624962).toLowerCase();
                        }
                    } else {
                        int i5 = tLRPC$Chat.participants_count;
                        if (i5 != 0) {
                            str = LocaleController.formatPluralStringComma("Members", i5);
                        } else if (tLRPC$Chat.has_geo) {
                            str = LocaleController.getString("MegaLocation", 2131626632);
                        } else if (TextUtils.isEmpty(tLRPC$Chat.username)) {
                            str = LocaleController.getString("MegaPrivate", 2131626633).toLowerCase();
                        } else {
                            str = LocaleController.getString("MegaPublic", 2131626636).toLowerCase();
                        }
                    }
                } else {
                    str = "";
                }
                String str3 = str;
                String str4 = str2;
                profileSearchCell.useSeparator = tLRPC$Dialog2 != null;
                profileSearchCell.setData(tLRPC$Chat, null, str4, str3, false, false);
                boolean contains = this.selectedDialogs.contains(Long.valueOf(profileSearchCell.getDialogId()));
                if (dialogId == profileSearchCell.getDialogId()) {
                    z = true;
                }
                profileSearchCell.setChecked(contains, z);
            } else {
                DialogCell dialogCell = (DialogCell) viewHolder.itemView;
                dialogCell.useSeparator = tLRPC$Dialog2 != null;
                dialogCell.fullSeparator = tLRPC$Dialog.pinned && tLRPC$Dialog2 != null && !tLRPC$Dialog2.pinned;
                if (i3 == 0 && AndroidUtilities.isTablet()) {
                    dialogCell.setDialogSelected(tLRPC$Dialog.id == this.openedDialogId);
                }
                dialogCell.setChecked(this.selectedDialogs.contains(Long.valueOf(tLRPC$Dialog.id)), false);
                dialogCell.setDialog(tLRPC$Dialog, this.dialogsType, this.folderId);
                DialogsPreloader dialogsPreloader = this.preloader;
                if (dialogsPreloader != null && i < 10) {
                    dialogsPreloader.add(tLRPC$Dialog.id);
                }
            }
        } else if (itemViewType == 14) {
            HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
            headerCell.setTextSize(14.0f);
            headerCell.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText"));
            headerCell.setBackgroundColor(Theme.getColor("graySection"));
            int i6 = ((DialogsActivity.DialogsHeader) getItem(i)).headerType;
            if (i6 == 0) {
                headerCell.setText(LocaleController.getString("MyChannels", 2131626806));
            } else if (i6 == 1) {
                headerCell.setText(LocaleController.getString("MyGroups", 2131626807));
            } else if (i6 == 2) {
                headerCell.setText(LocaleController.getString("FilterGroups", 2131625903));
            }
        } else if (itemViewType == 4) {
            ((DialogMeUrlCell) viewHolder.itemView).setRecentMeUrl((TLRPC$RecentMeUrl) getItem(i));
        } else if (itemViewType == 5) {
            DialogsEmptyCell dialogsEmptyCell = (DialogsEmptyCell) viewHolder.itemView;
            int i7 = this.lastDialogsEmptyType;
            int dialogsEmptyType = dialogsEmptyType();
            this.lastDialogsEmptyType = dialogsEmptyType;
            dialogsEmptyCell.setType(dialogsEmptyType);
            int i8 = this.dialogsType;
            if (i8 != 7 && i8 != 8) {
                dialogsEmptyCell.setOnUtyanAnimationEndListener(new DialogsAdapter$$ExternalSyntheticLambda2(this));
                dialogsEmptyCell.setOnUtyanAnimationUpdateListener(new DialogsAdapter$$ExternalSyntheticLambda1(this));
                if (!dialogsEmptyCell.isUtyanAnimationTriggered() && this.dialogsCount == 0) {
                    this.parentFragment.setContactsAlpha(0.0f);
                    this.parentFragment.setScrollDisabled(true);
                }
                if (this.onlineContacts != null && i7 == 0) {
                    if (!dialogsEmptyCell.isUtyanAnimationTriggered()) {
                        dialogsEmptyCell.startUtyanCollapseAnimation(true);
                    }
                } else if (this.forceUpdatingContacts) {
                    if (this.dialogsCount == 0) {
                        dialogsEmptyCell.startUtyanCollapseAnimation(false);
                    }
                } else if (dialogsEmptyCell.isUtyanAnimationTriggered() && this.lastDialogsEmptyType == 0) {
                    dialogsEmptyCell.startUtyanExpandAnimation();
                }
            }
        } else if (itemViewType == 6) {
            ((UserCell) viewHolder.itemView).setData(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.onlineContacts.get(this.dialogsCount == 0 ? i - 3 : (i - i2) - 2).user_id)), null, null, 0);
        } else if (itemViewType == 7) {
            HeaderCell headerCell2 = (HeaderCell) viewHolder.itemView;
            int i9 = this.dialogsType;
            if (i9 != 11 && i9 != 12 && i9 != 13) {
                headerCell2.setText(LocaleController.getString((this.dialogsCount != 0 || !this.forceUpdatingContacts) ? 2131629351 : 2131625245));
            } else if (i == 0) {
                headerCell2.setText(LocaleController.getString("ImportHeader", 2131626238));
            } else {
                headerCell2.setText(LocaleController.getString("ImportHeaderContacts", 2131626239));
            }
        } else if (itemViewType == 11) {
            TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
            textInfoPrivacyCell.setText(LocaleController.getString("TapOnThePencil", 2131628603));
            if (this.arrowDrawable == null) {
                Drawable drawable = this.mContext.getResources().getDrawable(2131165260);
                this.arrowDrawable = drawable;
                drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor("windowBackgroundWhiteGrayText4"), PorterDuff.Mode.MULTIPLY));
            }
            TextView textView = textInfoPrivacyCell.getTextView();
            textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.arrowDrawable, (Drawable) null);
            textView.getLayoutParams().width = -2;
        } else if (itemViewType == 12) {
            TextCell textCell = (TextCell) viewHolder.itemView;
            textCell.setColors("windowBackgroundWhiteBlueText4", "windowBackgroundWhiteBlueText4");
            String string = LocaleController.getString("CreateGroupForImport", 2131625287);
            if (this.dialogsCount != 0) {
                z = true;
            }
            textCell.setTextAndIcon(string, 2131165752, z);
            textCell.setIsInDialogs();
            textCell.setOffsetFromImage(75);
        }
        if (i >= this.dialogsCount + 1) {
            viewHolder.itemView.setAlpha(1.0f);
        }
    }

    public /* synthetic */ void lambda$onBindViewHolder$2() {
        this.parentFragment.setScrollDisabled(false);
    }

    public /* synthetic */ void lambda$onBindViewHolder$3(Float f) {
        this.parentFragment.setContactsAlpha(f.floatValue());
    }

    public void setForceUpdatingContacts(boolean z) {
        this.forceUpdatingContacts = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        int i2;
        int i3 = this.dialogsCount;
        if (i3 != 0 || !this.forceUpdatingContacts) {
            if (this.onlineContacts != null) {
                if (i3 == 0) {
                    if (i == 0) {
                        return 5;
                    }
                    if (i == 1) {
                        return 8;
                    }
                    return i == 2 ? 7 : 6;
                } else if (i < i3) {
                    return 0;
                } else {
                    if (i == i3) {
                        return 8;
                    }
                    if (i == i3 + 1) {
                        return 7;
                    }
                    return i == this.currentCount - 1 ? 10 : 6;
                }
            } else if (this.hasHints) {
                int size = MessagesController.getInstance(this.currentAccount).hintDialogs.size();
                int i4 = size + 2;
                if (i < i4) {
                    if (i == 0) {
                        return 2;
                    }
                    return i == size + 1 ? 3 : 4;
                }
                i -= i4;
            } else {
                if (!this.showArchiveHint) {
                    int i5 = this.dialogsType;
                    if (i5 == 11 || i5 == 13) {
                        if (i == 0) {
                            return 7;
                        }
                        if (i == 1) {
                            return 12;
                        }
                    } else if (i5 == 12) {
                        if (i == 0) {
                            return 7;
                        }
                        i--;
                    }
                } else if (i == 0) {
                    return 9;
                } else {
                    if (i == 1) {
                        return 8;
                    }
                }
                i -= 2;
            }
        } else if (i == 0) {
            return 5;
        } else {
            if (i == 1) {
                return 8;
            }
            if (i == 2) {
                return 7;
            }
            if (i == 3) {
                return 13;
            }
        }
        int i6 = this.folderId;
        if (i6 == 0 && this.dialogsCount > 10 && i == this.currentCount - 2 && this.dialogsType == 0) {
            return 11;
        }
        int size2 = this.parentFragment.getDialogsArray(this.currentAccount, this.dialogsType, i6, this.dialogsListFrozen).size();
        if (i != size2) {
            if (i > size2) {
                return 10;
            }
            return (this.dialogsType != 2 || !(getItem(i) instanceof DialogsActivity.DialogsHeader)) ? 0 : 14;
        } else if (!this.forceShowEmptyCell && (i2 = this.dialogsType) != 7 && i2 != 8 && !MessagesController.getInstance(this.currentAccount).isDialogsEndReached(this.folderId)) {
            return 1;
        } else {
            return size2 == 0 ? 5 : 10;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void notifyItemMoved(int i, int i2) {
        char c = 0;
        ArrayList<TLRPC$Dialog> dialogsArray = this.parentFragment.getDialogsArray(this.currentAccount, this.dialogsType, this.folderId, false);
        int fixPosition = fixPosition(i);
        int fixPosition2 = fixPosition(i2);
        TLRPC$Dialog tLRPC$Dialog = dialogsArray.get(fixPosition);
        TLRPC$Dialog tLRPC$Dialog2 = dialogsArray.get(fixPosition2);
        int i3 = this.dialogsType;
        if (i3 == 7 || i3 == 8) {
            MessagesController.DialogFilter[] dialogFilterArr = MessagesController.getInstance(this.currentAccount).selectedDialogFilter;
            if (this.dialogsType == 8) {
                c = 1;
            }
            MessagesController.DialogFilter dialogFilter = dialogFilterArr[c];
            int i4 = dialogFilter.pinnedDialogs.get(tLRPC$Dialog.id);
            dialogFilter.pinnedDialogs.put(tLRPC$Dialog.id, dialogFilter.pinnedDialogs.get(tLRPC$Dialog2.id));
            dialogFilter.pinnedDialogs.put(tLRPC$Dialog2.id, i4);
        } else {
            int i5 = tLRPC$Dialog.pinnedNum;
            tLRPC$Dialog.pinnedNum = tLRPC$Dialog2.pinnedNum;
            tLRPC$Dialog2.pinnedNum = i5;
        }
        Collections.swap(dialogsArray, fixPosition, fixPosition2);
        super.notifyItemMoved(i, i2);
    }

    public void setArchivedPullDrawable(PullForegroundDrawable pullForegroundDrawable) {
        this.pullForegroundDrawable = pullForegroundDrawable;
    }

    public void didDatabaseCleared() {
        DialogsPreloader dialogsPreloader = this.preloader;
        if (dialogsPreloader != null) {
            dialogsPreloader.clear();
        }
    }

    public void resume() {
        DialogsPreloader dialogsPreloader = this.preloader;
        if (dialogsPreloader != null) {
            dialogsPreloader.resume();
        }
    }

    public void pause() {
        DialogsPreloader dialogsPreloader = this.preloader;
        if (dialogsPreloader != null) {
            dialogsPreloader.pause();
        }
    }

    /* loaded from: classes3.dex */
    public static class DialogsPreloader {
        int currentRequestCount;
        int networkRequestCount;
        boolean resumed;
        HashSet<Long> dialogsReadyMap = new HashSet<>();
        HashSet<Long> preloadedErrorMap = new HashSet<>();
        HashSet<Long> loadingDialogs = new HashSet<>();
        ArrayList<Long> preloadDialogsPool = new ArrayList<>();
        Runnable clearNetworkRequestCount = new DialogsAdapter$DialogsPreloader$$ExternalSyntheticLambda0(this);

        private boolean preloadIsAvilable() {
            return false;
        }

        public void updateList() {
        }

        public /* synthetic */ void lambda$new$0() {
            this.networkRequestCount = 0;
            start();
        }

        public void add(long j) {
            if (isReady(j) || this.preloadedErrorMap.contains(Long.valueOf(j)) || this.loadingDialogs.contains(Long.valueOf(j)) || this.preloadDialogsPool.contains(Long.valueOf(j))) {
                return;
            }
            this.preloadDialogsPool.add(Long.valueOf(j));
            start();
        }

        public void start() {
            if (!preloadIsAvilable() || !this.resumed || this.preloadDialogsPool.isEmpty() || this.currentRequestCount >= 4 || this.networkRequestCount > 6) {
                return;
            }
            long longValue = this.preloadDialogsPool.remove(0).longValue();
            this.currentRequestCount++;
            this.loadingDialogs.add(Long.valueOf(longValue));
            MessagesController.getInstance(UserConfig.selectedAccount).ensureMessagesLoaded(longValue, 0, new AnonymousClass1(longValue));
        }

        /* renamed from: org.telegram.ui.Adapters.DialogsAdapter$DialogsPreloader$1 */
        /* loaded from: classes3.dex */
        public class AnonymousClass1 implements MessagesController.MessagesLoadedCallback {
            final /* synthetic */ long val$dialog_id;

            AnonymousClass1(long j) {
                DialogsPreloader.this = r1;
                this.val$dialog_id = j;
            }

            @Override // org.telegram.messenger.MessagesController.MessagesLoadedCallback
            public void onMessagesLoaded(boolean z) {
                AndroidUtilities.runOnUIThread(new DialogsAdapter$DialogsPreloader$1$$ExternalSyntheticLambda1(this, z, this.val$dialog_id));
            }

            public /* synthetic */ void lambda$onMessagesLoaded$0(boolean z, long j) {
                DialogsPreloader dialogsPreloader;
                if (!z) {
                    DialogsPreloader dialogsPreloader2 = DialogsPreloader.this;
                    int i = dialogsPreloader2.networkRequestCount + 1;
                    dialogsPreloader2.networkRequestCount = i;
                    if (i >= 6) {
                        AndroidUtilities.cancelRunOnUIThread(dialogsPreloader2.clearNetworkRequestCount);
                        AndroidUtilities.runOnUIThread(DialogsPreloader.this.clearNetworkRequestCount, 60000L);
                    }
                }
                if (DialogsPreloader.this.loadingDialogs.remove(Long.valueOf(j))) {
                    DialogsPreloader.this.dialogsReadyMap.add(Long.valueOf(j));
                    DialogsPreloader.this.updateList();
                    dialogsPreloader.currentRequestCount--;
                    DialogsPreloader.this.start();
                }
            }

            @Override // org.telegram.messenger.MessagesController.MessagesLoadedCallback
            public void onError() {
                AndroidUtilities.runOnUIThread(new DialogsAdapter$DialogsPreloader$1$$ExternalSyntheticLambda0(this, this.val$dialog_id));
            }

            public /* synthetic */ void lambda$onError$1(long j) {
                DialogsPreloader dialogsPreloader;
                if (DialogsPreloader.this.loadingDialogs.remove(Long.valueOf(j))) {
                    DialogsPreloader.this.preloadedErrorMap.add(Long.valueOf(j));
                    dialogsPreloader.currentRequestCount--;
                    DialogsPreloader.this.start();
                }
            }
        }

        public boolean isReady(long j) {
            return this.dialogsReadyMap.contains(Long.valueOf(j));
        }

        public void remove(long j) {
            this.preloadDialogsPool.remove(Long.valueOf(j));
        }

        public void clear() {
            this.dialogsReadyMap.clear();
            this.preloadedErrorMap.clear();
            this.loadingDialogs.clear();
            this.preloadDialogsPool.clear();
            this.currentRequestCount = 0;
            this.networkRequestCount = 0;
            AndroidUtilities.cancelRunOnUIThread(this.clearNetworkRequestCount);
            updateList();
        }

        public void resume() {
            this.resumed = true;
            start();
        }

        public void pause() {
            this.resumed = false;
        }
    }

    public int getCurrentCount() {
        return this.currentCount;
    }

    public void setForceShowEmptyCell(boolean z) {
        this.forceShowEmptyCell = z;
    }

    /* loaded from: classes3.dex */
    public class LastEmptyView extends View {
        public boolean moving;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LastEmptyView(Context context) {
            super(context);
            DialogsAdapter.this = r1;
        }

        @Override // android.view.View
        protected void onMeasure(int i, int i2) {
            int size = DialogsAdapter.this.parentFragment.getDialogsArray(DialogsAdapter.this.currentAccount, DialogsAdapter.this.dialogsType, DialogsAdapter.this.folderId, DialogsAdapter.this.dialogsListFrozen).size();
            int i3 = 0;
            boolean z = DialogsAdapter.this.dialogsType == 0 && MessagesController.getInstance(DialogsAdapter.this.currentAccount).dialogs_dict.get(DialogObject.makeFolderDialogId(1)) != null;
            View view = (View) getParent();
            int i4 = view instanceof BlurredRecyclerView ? ((BlurredRecyclerView) view).blurTopPadding : 0;
            int paddingTop = view.getPaddingTop() - i4;
            if (size != 0 && (paddingTop != 0 || z)) {
                int size2 = View.MeasureSpec.getSize(i2);
                if (size2 == 0) {
                    size2 = view.getMeasuredHeight();
                }
                if (size2 == 0) {
                    size2 = (AndroidUtilities.displaySize.y - ActionBar.getCurrentActionBarHeight()) - (Build.VERSION.SDK_INT >= 21 ? AndroidUtilities.statusBarHeight : 0);
                }
                int i5 = size2 - i4;
                int dp = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f);
                int i6 = (size * dp) + (size - 1);
                if (DialogsAdapter.this.onlineContacts != null) {
                    i6 += (DialogsAdapter.this.onlineContacts.size() * AndroidUtilities.dp(58.0f)) + (DialogsAdapter.this.onlineContacts.size() - 1) + AndroidUtilities.dp(52.0f);
                }
                int i7 = z ? dp + 1 : 0;
                if (i6 < i5) {
                    int i8 = (i5 - i6) + i7;
                    if (paddingTop == 0 || (i8 = i8 - AndroidUtilities.statusBarHeight) >= 0) {
                        i3 = i8;
                    }
                } else {
                    int i9 = i6 - i5;
                    if (i9 < i7) {
                        int i10 = i7 - i9;
                        if (paddingTop != 0) {
                            i10 -= AndroidUtilities.statusBarHeight;
                        }
                        if (i10 >= 0) {
                            i3 = i10;
                        }
                    }
                }
            }
            setMeasuredDimension(View.MeasureSpec.getSize(i), i3);
        }
    }
}
