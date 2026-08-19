package org.telegram.ui;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatsWidgetProvider;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.ContactsWidgetProvider;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.GroupCreateUserCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackgroundGradientDrawable;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.ForegroundColorSpanThemable;
import org.telegram.ui.Components.InviteMembersBottomSheet;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.EditWidgetActivity;

/* loaded from: classes4.dex */
public class EditWidgetActivity extends BaseFragment {
    private int chatsEndRow;
    private int chatsStartRow;
    private int currentWidgetId;
    private EditWidgetActivityDelegate delegate;
    private int infoRow;
    private ItemTouchHelper itemTouchHelper;
    private ListAdapter listAdapter;
    private RecyclerListView listView;
    private ImageView previewImageView;
    private int previewRow;
    private int rowCount;
    private int selectChatsRow;
    private ArrayList selectedDialogs = new ArrayList();
    private WidgetPreviewCell widgetPreviewCell;
    private int widgetType;

    public interface EditWidgetActivityDelegate {
        void didSelectDialogs(ArrayList arrayList);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public class TouchHelperCallback extends ItemTouchHelper.Callback {
        private boolean moved;

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean isLongPressDragEnabled() {
            return false;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
        }

        public TouchHelperCallback() {
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getItemViewType() != 3) {
                return ItemTouchHelper.Callback.makeMovementFlags(0, 0);
            }
            return ItemTouchHelper.Callback.makeMovementFlags(3, 0);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            if (viewHolder.getItemViewType() != viewHolder2.getItemViewType()) {
                return false;
            }
            int adapterPosition = viewHolder.getAdapterPosition();
            int adapterPosition2 = viewHolder2.getAdapterPosition();
            if (EditWidgetActivity.this.listAdapter.swapElements(adapterPosition, adapterPosition2)) {
                ((GroupCreateUserCell) viewHolder.itemView).setDrawDivider(adapterPosition2 != EditWidgetActivity.this.chatsEndRow - 1);
                ((GroupCreateUserCell) viewHolder2.itemView).setDrawDivider(adapterPosition != EditWidgetActivity.this.chatsEndRow - 1);
                this.moved = true;
            }
            return true;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
            super.onChildDraw(canvas, recyclerView, viewHolder, f, f2, i, z);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
            if (i != 0) {
                EditWidgetActivity.this.listView.cancelClickRunnables(false);
                viewHolder.itemView.setPressed(true);
            } else if (this.moved) {
                if (EditWidgetActivity.this.widgetPreviewCell != null) {
                    EditWidgetActivity.this.widgetPreviewCell.updateDialogs();
                }
                this.moved = false;
            }
            super.onSelectedChanged(viewHolder, i);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            super.clearView(recyclerView, viewHolder);
            viewHolder.itemView.setPressed(false);
        }
    }

    public class WidgetPreviewCell extends FrameLayout {
        private Drawable backgroundDrawable;
        private BackgroundGradientDrawable.Disposable backgroundGradientDisposable;
        private RectF bitmapRect;
        private ViewGroup[] cells;
        private Drawable oldBackgroundDrawable;
        private BackgroundGradientDrawable.Disposable oldBackgroundGradientDisposable;
        private Paint roundPaint;
        private Drawable shadowDrawable;

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchSetPressed(boolean z) {
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public WidgetPreviewCell(Context context) {
            super(context);
            this.roundPaint = new Paint(1);
            this.bitmapRect = new RectF();
            this.cells = new ViewGroup[2];
            int i = 0;
            setWillNotDraw(false);
            setPadding(0, AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, LayoutHelper.createFrame(-2, -2, 17));
            ChatActionCell chatActionCell = new ChatActionCell(context);
            chatActionCell.setCustomText(LocaleController.getString(R.string.WidgetPreview));
            linearLayout.addView(chatActionCell, LayoutHelper.createLinear(-2, -2, 17, 0, 0, 0, 4));
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(1);
            linearLayout2.setBackgroundResource(R.drawable.widget_bg);
            linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-2, -2, 17, 10, 0, 10, 0));
            EditWidgetActivity.this.previewImageView = new ImageView(context);
            if (EditWidgetActivity.this.widgetType == 0) {
                while (i < 2) {
                    this.cells[i] = (ViewGroup) EditWidgetActivity.this.getParentActivity().getLayoutInflater().inflate(R.layout.shortcut_widget_item, (ViewGroup) null);
                    linearLayout2.addView(this.cells[i], LayoutHelper.createLinear(-1, -2));
                    i++;
                }
                linearLayout2.addView(EditWidgetActivity.this.previewImageView, LayoutHelper.createLinear(NotificationCenter.starOptionsLoaded, NotificationCenter.screenshotTook, 17));
                EditWidgetActivity.this.previewImageView.setImageResource(R.drawable.chats_widget_preview);
            } else if (EditWidgetActivity.this.widgetType == 1) {
                while (i < 2) {
                    this.cells[i] = (ViewGroup) EditWidgetActivity.this.getParentActivity().getLayoutInflater().inflate(R.layout.contacts_widget_item, (ViewGroup) null);
                    linearLayout2.addView(this.cells[i], LayoutHelper.createLinear(NotificationCenter.screenshotTook, -2));
                    i++;
                }
                linearLayout2.addView(EditWidgetActivity.this.previewImageView, LayoutHelper.createLinear(NotificationCenter.screenshotTook, NotificationCenter.screenshotTook, 17));
                EditWidgetActivity.this.previewImageView.setImageResource(R.drawable.contacts_widget_preview);
            }
            updateDialogs();
            this.shadowDrawable = Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:116|(1:118)(2:127|(1:129)(8:130|(1:132)(1:133)|120|121|122|123|98|99))|119|120|121|122|123|98|99) */
        /* JADX WARN: Code restructure failed: missing block: B:125:0x03d2, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:126:0x03d3, code lost:
        
            org.telegram.messenger.FileLog.e(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:275:0x06cf, code lost:
        
            if (r9 == 2) goto L273;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0285, code lost:
        
            if ((r0 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChannelMigrateFrom) != false) goto L112;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:190:0x0545  */
        /* JADX WARN: Removed duplicated region for block: B:326:0x0883  */
        /* JADX WARN: Removed duplicated region for block: B:339:0x08cc  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0227  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0238  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0582  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x05d8  */
        /* JADX WARN: Type inference failed for: r0v116 */
        /* JADX WARN: Type inference failed for: r0v117, types: [org.telegram.tgnet.TLRPC$User] */
        /* JADX WARN: Type inference failed for: r0v297 */
        /* JADX WARN: Type inference failed for: r0v298 */
        /* JADX WARN: Type inference failed for: r0v299 */
        /* JADX WARN: Type inference failed for: r10v0 */
        /* JADX WARN: Type inference failed for: r10v27 */
        /* JADX WARN: Type inference failed for: r10v8, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r14v15 */
        /* JADX WARN: Type inference failed for: r14v16, types: [org.telegram.tgnet.TLRPC$Dialog] */
        /* JADX WARN: Type inference failed for: r14v17 */
        /* JADX WARN: Type inference failed for: r3v26 */
        /* JADX WARN: Type inference failed for: r3v8 */
        /* JADX WARN: Type inference failed for: r3v9, types: [org.telegram.messenger.MessageObject] */
        /* JADX WARN: Type inference failed for: r4v12 */
        /* JADX WARN: Type inference failed for: r4v13, types: [org.telegram.tgnet.TLRPC$Chat] */
        /* JADX WARN: Type inference failed for: r4v49 */
        /* JADX WARN: Type inference failed for: r4v50 */
        /* JADX WARN: Type inference failed for: r4v51 */
        /* JADX WARN: Type inference failed for: r5v34, types: [org.telegram.messenger.FileLoader] */
        /* JADX WARN: Type inference failed for: r5v40 */
        /* JADX WARN: Type inference failed for: r5v41, types: [org.telegram.tgnet.TLRPC$User] */
        /* JADX WARN: Type inference failed for: r5v49 */
        /* JADX WARN: Type inference failed for: r5v55, types: [org.telegram.ui.Components.AvatarDrawable] */
        /* JADX WARN: Type inference failed for: r8v28 */
        /* JADX WARN: Type inference failed for: r8v29, types: [org.telegram.tgnet.TLRPC$FileLocation] */
        /* JADX WARN: Type inference failed for: r8v30, types: [org.telegram.tgnet.TLObject] */
        /* JADX WARN: Type inference failed for: r8v42 */
        /* JADX WARN: Type inference failed for: r8v47, types: [org.telegram.tgnet.TLRPC$FileLocation] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void updateDialogs() {
            TLRPC.Dialog dialog;
            String str;
            TLRPC.FileLocation fileLocation;
            TLRPC.Chat chat;
            TLRPC.User user;
            Bitmap decodeFile;
            int i;
            AvatarDrawable avatarDrawable;
            String firstName;
            TLRPC.UserProfilePhoto userProfilePhoto;
            TLRPC.Dialog dialog2;
            ?? r14;
            float f;
            TLRPC.Chat chat2;
            String str2;
            ?? r8;
            ?? r4;
            ?? r0;
            Bitmap decodeFile2;
            char c;
            ?? r3;
            int i2;
            Object chat3;
            ?? r5;
            CharSequence charSequence;
            String str3;
            SpannableStringBuilder valueOf;
            char c2;
            int i3;
            String charSequence2;
            SpannableStringBuilder spannableStringBuilder;
            CharSequence charSequence3;
            CharSequence charSequence4;
            AvatarDrawable avatarDrawable2;
            TLRPC.UserProfilePhoto userProfilePhoto2;
            int i4 = 12;
            int i5 = 8;
            int i6 = 2;
            ?? r10 = 1;
            Bitmap bitmap = null;
            if (EditWidgetActivity.this.widgetType != 0) {
                if (EditWidgetActivity.this.widgetType == 1) {
                    int i7 = 2;
                    for (int i8 = 0; i8 < i7; i8++) {
                        int i9 = 0;
                        while (i9 < i7) {
                            int i10 = (i8 * 2) + i9;
                            if (!EditWidgetActivity.this.selectedDialogs.isEmpty()) {
                                if (i10 < EditWidgetActivity.this.selectedDialogs.size()) {
                                    dialog = (TLRPC.Dialog) EditWidgetActivity.this.getMessagesController().dialogs_dict.get(((Long) EditWidgetActivity.this.selectedDialogs.get(i10)).longValue());
                                    if (dialog == null) {
                                        dialog = new TLRPC.TL_dialog();
                                        dialog.id = ((Long) EditWidgetActivity.this.selectedDialogs.get(i10)).longValue();
                                    }
                                }
                                dialog = null;
                            } else {
                                if (i10 < EditWidgetActivity.this.getMediaDataController().hints.size()) {
                                    long j = EditWidgetActivity.this.getMediaDataController().hints.get(i10).peer.user_id;
                                    TLRPC.Dialog dialog3 = (TLRPC.Dialog) EditWidgetActivity.this.getMessagesController().dialogs_dict.get(j);
                                    if (dialog3 == null) {
                                        dialog3 = new TLRPC.TL_dialog();
                                        dialog3.id = j;
                                    }
                                    dialog = dialog3;
                                }
                                dialog = null;
                            }
                            if (dialog == null) {
                                this.cells[i8].findViewById(i9 == 0 ? R.id.contacts_widget_item1 : R.id.contacts_widget_item2).setVisibility(4);
                                i7 = i10 != 0 ? 2 : 2;
                                this.cells[i8].setVisibility(8);
                            } else {
                                this.cells[i8].findViewById(i9 == 0 ? R.id.contacts_widget_item1 : R.id.contacts_widget_item2).setVisibility(0);
                                i7 = 2;
                                if (i10 == 0 || i10 == 2) {
                                    this.cells[i8].setVisibility(0);
                                }
                                if (DialogObject.isUserDialog(dialog.id)) {
                                    user = EditWidgetActivity.this.getMessagesController().getUser(Long.valueOf(dialog.id));
                                    if (UserObject.isUserSelf(user)) {
                                        firstName = LocaleController.getString(R.string.SavedMessages);
                                    } else if (UserObject.isReplyUser(user)) {
                                        firstName = LocaleController.getString(R.string.RepliesTitle);
                                    } else if (UserObject.isDeleted(user)) {
                                        firstName = LocaleController.getString(R.string.HiddenName);
                                    } else {
                                        firstName = UserObject.getFirstName(user);
                                    }
                                    if (UserObject.isReplyUser(user) || UserObject.isUserSelf(user) || user == null || (userProfilePhoto = user.photo) == null || (fileLocation = userProfilePhoto.photo_small) == null || fileLocation.volume_id == 0 || fileLocation.local_id == 0) {
                                        str = firstName;
                                        chat = null;
                                        fileLocation = null;
                                    } else {
                                        str = firstName;
                                        chat = null;
                                    }
                                } else {
                                    TLRPC.Chat chat4 = EditWidgetActivity.this.getMessagesController().getChat(Long.valueOf(-dialog.id));
                                    String str4 = chat4.title;
                                    TLRPC.ChatPhoto chatPhoto = chat4.photo;
                                    if (chatPhoto != null && (fileLocation = chatPhoto.photo_small) != null) {
                                        if (fileLocation.volume_id != 0 && fileLocation.local_id != 0) {
                                            str = str4;
                                            chat = chat4;
                                            user = null;
                                        }
                                    }
                                    str = str4;
                                    fileLocation = null;
                                    chat = chat4;
                                    user = null;
                                }
                                ((TextView) this.cells[i8].findViewById(i9 == 0 ? R.id.contacts_widget_item_text1 : R.id.contacts_widget_item_text2)).setText(str);
                                if (fileLocation != null) {
                                    try {
                                        decodeFile = BitmapFactory.decodeFile(EditWidgetActivity.this.getFileLoader().getPathToAttach(fileLocation, true).toString());
                                    } catch (Throwable th) {
                                        th = th;
                                        FileLog.e(th);
                                        i = dialog.unread_count;
                                        if (i <= 0) {
                                        }
                                        i9++;
                                    }
                                } else {
                                    decodeFile = null;
                                }
                                int dp = AndroidUtilities.dp(48.0f);
                                Bitmap createBitmap = Bitmap.createBitmap(dp, dp, Bitmap.Config.ARGB_8888);
                                createBitmap.eraseColor(0);
                                Canvas canvas = new Canvas(createBitmap);
                                if (decodeFile == null) {
                                    if (user != null) {
                                        try {
                                            avatarDrawable = new AvatarDrawable(user);
                                            if (UserObject.isReplyUser(user)) {
                                                try {
                                                    avatarDrawable.setAvatarType(12);
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    FileLog.e(th);
                                                    i = dialog.unread_count;
                                                    if (i <= 0) {
                                                    }
                                                    i9++;
                                                }
                                            } else if (UserObject.isUserSelf(user)) {
                                                avatarDrawable.setAvatarType(1);
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            FileLog.e(th);
                                            i = dialog.unread_count;
                                            if (i <= 0) {
                                            }
                                            i9++;
                                        }
                                    } else {
                                        avatarDrawable = new AvatarDrawable(chat);
                                    }
                                    avatarDrawable.setBounds(0, 0, dp, dp);
                                    avatarDrawable.draw(canvas);
                                } else {
                                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                    BitmapShader bitmapShader = new BitmapShader(decodeFile, tileMode, tileMode);
                                    float width = dp / decodeFile.getWidth();
                                    canvas.save();
                                    canvas.scale(width, width);
                                    this.roundPaint.setShader(bitmapShader);
                                    try {
                                        this.bitmapRect.set(0.0f, 0.0f, decodeFile.getWidth(), decodeFile.getHeight());
                                        canvas.drawRoundRect(this.bitmapRect, decodeFile.getWidth(), decodeFile.getHeight(), this.roundPaint);
                                        canvas.restore();
                                    } catch (Throwable th4) {
                                        th = th4;
                                        FileLog.e(th);
                                        i = dialog.unread_count;
                                        if (i <= 0) {
                                        }
                                        i9++;
                                    }
                                }
                                try {
                                    canvas.setBitmap(null);
                                    ((ImageView) this.cells[i8].findViewById(i9 == 0 ? R.id.contacts_widget_item_avatar1 : R.id.contacts_widget_item_avatar2)).setImageBitmap(createBitmap);
                                } catch (Throwable th5) {
                                    th = th5;
                                    FileLog.e(th);
                                    i = dialog.unread_count;
                                    if (i <= 0) {
                                    }
                                    i9++;
                                }
                                i = dialog.unread_count;
                                if (i <= 0) {
                                    ((TextView) this.cells[i8].findViewById(i9 == 0 ? R.id.contacts_widget_item_badge1 : R.id.contacts_widget_item_badge2)).setText(i > 99 ? String.format("%d+", 99) : String.format("%d", Integer.valueOf(i)));
                                    this.cells[i8].findViewById(i9 == 0 ? R.id.contacts_widget_item_badge_bg1 : R.id.contacts_widget_item_badge_bg2).setVisibility(0);
                                } else {
                                    this.cells[i8].findViewById(i9 == 0 ? R.id.contacts_widget_item_badge_bg1 : R.id.contacts_widget_item_badge_bg2).setVisibility(8);
                                }
                            }
                            i9++;
                        }
                    }
                }
            } else {
                int i11 = 0;
                while (i11 < i6) {
                    if (!EditWidgetActivity.this.selectedDialogs.isEmpty()) {
                        if (i11 < EditWidgetActivity.this.selectedDialogs.size()) {
                            dialog2 = (TLRPC.Dialog) EditWidgetActivity.this.getMessagesController().dialogs_dict.get(((Long) EditWidgetActivity.this.selectedDialogs.get(i11)).longValue());
                            if (dialog2 == null) {
                                dialog2 = new TLRPC.TL_dialog();
                                dialog2.id = ((Long) EditWidgetActivity.this.selectedDialogs.get(i11)).longValue();
                            }
                            r14 = dialog2;
                        }
                        r14 = bitmap;
                    } else {
                        if (i11 < EditWidgetActivity.this.getMessagesController().dialogsServerOnly.size()) {
                            dialog2 = EditWidgetActivity.this.getMessagesController().dialogsServerOnly.get(i11);
                            r14 = dialog2;
                        }
                        r14 = bitmap;
                    }
                    if (r14 == 0) {
                        this.cells[i11].setVisibility(i5);
                        i2 = 1;
                    } else {
                        this.cells[i11].setVisibility(0);
                        if (DialogObject.isUserDialog(r14.id)) {
                            TLRPC.User user2 = EditWidgetActivity.this.getMessagesController().getUser(Long.valueOf(r14.id));
                            if (user2 != null) {
                                if (UserObject.isUserSelf(user2)) {
                                    str2 = LocaleController.getString(R.string.SavedMessages);
                                } else if (UserObject.isReplyUser(user2)) {
                                    str2 = LocaleController.getString(R.string.RepliesTitle);
                                } else if (UserObject.isDeleted(user2)) {
                                    str2 = LocaleController.getString(R.string.HiddenName);
                                } else {
                                    str2 = ContactsController.formatName(user2.first_name, user2.last_name);
                                }
                                if (UserObject.isReplyUser(user2) || UserObject.isUserSelf(user2) || (userProfilePhoto2 = user2.photo) == null || (r8 = userProfilePhoto2.photo_small) == null) {
                                    f = 48.0f;
                                } else {
                                    f = 48.0f;
                                    if (r8.volume_id != 0 && r8.local_id != 0) {
                                        r4 = bitmap;
                                        r0 = user2;
                                    }
                                }
                            } else {
                                f = 48.0f;
                                str2 = "";
                            }
                            Bitmap bitmap2 = bitmap;
                            r8 = bitmap2;
                            r0 = user2;
                            r4 = bitmap2;
                        } else {
                            f = 48.0f;
                            TLRPC.Chat chat5 = EditWidgetActivity.this.getMessagesController().getChat(Long.valueOf(-r14.id));
                            if (chat5 != null) {
                                str2 = chat5.title;
                                TLRPC.ChatPhoto chatPhoto2 = chat5.photo;
                                if (chatPhoto2 == null || (r8 = chatPhoto2.photo_small) == null || r8.volume_id == 0 || r8.local_id == 0) {
                                    chat2 = chat5;
                                } else {
                                    r4 = chat5;
                                    r0 = bitmap;
                                }
                            } else {
                                chat2 = chat5;
                                str2 = "";
                            }
                            Bitmap bitmap3 = bitmap;
                            r8 = bitmap3;
                            r0 = bitmap3;
                            r4 = chat2;
                        }
                        ((TextView) this.cells[i11].findViewById(R.id.shortcut_widget_item_text)).setText(str2);
                        if (r8 != null) {
                            try {
                                decodeFile2 = BitmapFactory.decodeFile(EditWidgetActivity.this.getFileLoader().getPathToAttach(r8, r10).toString());
                            } catch (Throwable th6) {
                                th = th6;
                                c = 1;
                                FileLog.e(th);
                                ArrayList arrayList = (ArrayList) EditWidgetActivity.this.getMessagesController().dialogMessage.get(r14.id);
                                if (arrayList != null) {
                                }
                                if (r3 != 0) {
                                }
                                if (r14.unread_count > 0) {
                                }
                                i2 = 1;
                                i11 += i2;
                                i4 = 12;
                                i5 = 8;
                                i6 = 2;
                                r10 = 1;
                                bitmap = null;
                            }
                        } else {
                            decodeFile2 = bitmap;
                        }
                        int dp2 = AndroidUtilities.dp(f);
                        Bitmap createBitmap2 = Bitmap.createBitmap(dp2, dp2, Bitmap.Config.ARGB_8888);
                        createBitmap2.eraseColor(0);
                        Canvas canvas2 = new Canvas(createBitmap2);
                        if (decodeFile2 == null) {
                            if (r0 != 0) {
                                ?? avatarDrawable3 = new AvatarDrawable((TLRPC.User) r0);
                                if (UserObject.isReplyUser((TLRPC.User) r0)) {
                                    avatarDrawable3.setAvatarType(i4);
                                    avatarDrawable2 = avatarDrawable3;
                                } else {
                                    avatarDrawable2 = avatarDrawable3;
                                    if (UserObject.isUserSelf(r0)) {
                                        avatarDrawable3.setAvatarType(r10);
                                        avatarDrawable2 = avatarDrawable3;
                                    }
                                }
                            } else {
                                avatarDrawable2 = new AvatarDrawable((TLRPC.Chat) r4);
                            }
                            avatarDrawable2.setBounds(0, 0, dp2, dp2);
                            avatarDrawable2.draw(canvas2);
                            c = 1;
                        } else {
                            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                            BitmapShader bitmapShader2 = new BitmapShader(decodeFile2, tileMode2, tileMode2);
                            if (this.roundPaint == null) {
                                this.roundPaint = new Paint((int) r10);
                                this.bitmapRect = new RectF();
                            }
                            float width2 = dp2 / decodeFile2.getWidth();
                            canvas2.save();
                            canvas2.scale(width2, width2);
                            this.roundPaint.setShader(bitmapShader2);
                            c = 1;
                            try {
                                this.bitmapRect.set(0.0f, 0.0f, decodeFile2.getWidth(), decodeFile2.getHeight());
                                canvas2.drawRoundRect(this.bitmapRect, decodeFile2.getWidth(), decodeFile2.getHeight(), this.roundPaint);
                                canvas2.restore();
                            } catch (Throwable th7) {
                                th = th7;
                                FileLog.e(th);
                                ArrayList arrayList2 = (ArrayList) EditWidgetActivity.this.getMessagesController().dialogMessage.get(r14.id);
                                if (arrayList2 != null) {
                                }
                                if (r3 != 0) {
                                }
                                if (r14.unread_count > 0) {
                                }
                                i2 = 1;
                                i11 += i2;
                                i4 = 12;
                                i5 = 8;
                                i6 = 2;
                                r10 = 1;
                                bitmap = null;
                            }
                        }
                        canvas2.setBitmap(bitmap);
                        ((ImageView) this.cells[i11].findViewById(R.id.shortcut_widget_item_avatar)).setImageBitmap(createBitmap2);
                        ArrayList arrayList22 = (ArrayList) EditWidgetActivity.this.getMessagesController().dialogMessage.get(r14.id);
                        r3 = (arrayList22 != null || arrayList22.size() <= 0) ? bitmap : (MessageObject) arrayList22.get(0);
                        if (r3 != 0) {
                            long fromChatId = r3.getFromChatId();
                            if (fromChatId > 0) {
                                r5 = EditWidgetActivity.this.getMessagesController().getUser(Long.valueOf(fromChatId));
                                chat3 = bitmap;
                            } else {
                                chat3 = EditWidgetActivity.this.getMessagesController().getChat(Long.valueOf(-fromChatId));
                                r5 = bitmap;
                            }
                            int color = getContext().getResources().getColor(R.color.widget_text);
                            if (r3.messageOwner instanceof TLRPC.TL_messageService) {
                                if (ChatObject.isChannel(r4)) {
                                    TLRPC.MessageAction messageAction = r3.messageOwner.action;
                                    charSequence4 = "";
                                    if (!(messageAction instanceof TLRPC.TL_messageActionHistoryClear)) {
                                        charSequence4 = "";
                                    }
                                    color = getContext().getResources().getColor(R.color.widget_action_text);
                                    charSequence3 = charSequence4;
                                }
                                charSequence4 = r3.messageText;
                                color = getContext().getResources().getColor(R.color.widget_action_text);
                                charSequence3 = charSequence4;
                            } else {
                                String str5 = "📎 ";
                                if (r4 != 0 && r4.id > 0 && chat3 == null && (!ChatObject.isChannel(r4) || ChatObject.isMegagroup(r4))) {
                                    if (r3.isOutOwner()) {
                                        str3 = LocaleController.getString(R.string.FromYou);
                                    } else if (r5 != 0) {
                                        str3 = UserObject.getFirstName(r5).replace("\n", "");
                                    } else {
                                        str3 = "DELETED";
                                    }
                                    String str6 = str3;
                                    CharSequence charSequence5 = r3.caption;
                                    try {
                                        if (charSequence5 != null) {
                                            String charSequence6 = charSequence5.toString();
                                            if (charSequence6.length() > 150) {
                                                charSequence6 = charSequence6.substring(0, 150);
                                            }
                                            if (r3.isVideo()) {
                                                str5 = "📹 ";
                                            } else if (r3.isVoice()) {
                                                str5 = "🎤 ";
                                            } else if (r3.isMusic()) {
                                                str5 = "🎧 ";
                                            } else if (r3.isPhoto()) {
                                                str5 = "🖼 ";
                                            }
                                            Object[] objArr = new Object[2];
                                            objArr[0] = str5 + charSequence6.replace('\n', ' ');
                                            objArr[c] = str6;
                                            valueOf = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr));
                                        } else if (r3.messageOwner.media != null && !r3.isMediaEmpty()) {
                                            color = getContext().getResources().getColor(R.color.widget_action_text);
                                            TLRPC.MessageMedia messageMedia = r3.messageOwner.media;
                                            if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                                c2 = 1;
                                                charSequence2 = String.format("📊 \u2068%s\u2069", ((TLRPC.TL_messageMediaPoll) messageMedia).poll.question.text);
                                            } else {
                                                c2 = 1;
                                                if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                                                    charSequence2 = String.format("🎮 \u2068%s\u2069", messageMedia.game.title);
                                                } else {
                                                    if (r3.type == 14) {
                                                        i3 = 2;
                                                        charSequence2 = String.format("🎧 \u2068%s - %s\u2069", r3.getMusicAuthor(), r3.getMusicTitle());
                                                    } else {
                                                        i3 = 2;
                                                        charSequence2 = r3.messageText.toString();
                                                    }
                                                    Object[] objArr2 = new Object[i3];
                                                    objArr2[0] = charSequence2.replace('\n', ' ');
                                                    objArr2[c2] = str6;
                                                    SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr2));
                                                    valueOf2.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_attachMessage), str6.length() + 2, valueOf2.length(), 33);
                                                    spannableStringBuilder = valueOf2;
                                                    spannableStringBuilder.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_nameMessage), 0, str6.length() + 1, 33);
                                                    charSequence3 = spannableStringBuilder;
                                                }
                                            }
                                            i3 = 2;
                                            Object[] objArr22 = new Object[i3];
                                            objArr22[0] = charSequence2.replace('\n', ' ');
                                            objArr22[c2] = str6;
                                            SpannableStringBuilder valueOf22 = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr22));
                                            valueOf22.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_attachMessage), str6.length() + 2, valueOf22.length(), 33);
                                            spannableStringBuilder = valueOf22;
                                            spannableStringBuilder.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_nameMessage), 0, str6.length() + 1, 33);
                                            charSequence3 = spannableStringBuilder;
                                        } else {
                                            String str7 = r3.messageOwner.message;
                                            if (str7 != null) {
                                                if (str7.length() > 150) {
                                                    str7 = str7.substring(0, 150);
                                                }
                                                valueOf = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", str7.replace('\n', ' ').trim(), str6));
                                            } else {
                                                valueOf = SpannableStringBuilder.valueOf("");
                                            }
                                        }
                                        spannableStringBuilder.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_nameMessage), 0, str6.length() + 1, 33);
                                        charSequence3 = spannableStringBuilder;
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        charSequence3 = spannableStringBuilder;
                                    }
                                    spannableStringBuilder = valueOf;
                                } else {
                                    TLRPC.MessageMedia messageMedia2 = r3.messageOwner.media;
                                    if ((messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) && (messageMedia2.photo instanceof TLRPC.TL_photoEmpty) && messageMedia2.ttl_seconds != 0) {
                                        charSequence3 = LocaleController.getString(R.string.AttachPhotoExpired);
                                    } else if ((messageMedia2 instanceof TLRPC.TL_messageMediaDocument) && (messageMedia2.document instanceof TLRPC.TL_documentEmpty) && messageMedia2.ttl_seconds != 0) {
                                        charSequence3 = LocaleController.getString(R.string.AttachVideoExpired);
                                    } else if (r3.caption != null) {
                                        if (r3.isVideo()) {
                                            str5 = "📹 ";
                                        } else if (r3.isVoice()) {
                                            str5 = "🎤 ";
                                        } else if (r3.isMusic()) {
                                            str5 = "🎧 ";
                                        } else if (r3.isPhoto()) {
                                            str5 = "🖼 ";
                                        }
                                        charSequence3 = str5 + ((Object) r3.caption);
                                    } else {
                                        if (messageMedia2 instanceof TLRPC.TL_messageMediaPoll) {
                                            charSequence = "📊 " + ((TLRPC.TL_messageMediaPoll) messageMedia2).poll.question.text;
                                        } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGame) {
                                            charSequence = "🎮 " + r3.messageOwner.media.game.title;
                                        } else if (r3.type == 14) {
                                            charSequence = String.format("🎧 %s - %s", r3.getMusicAuthor(), r3.getMusicTitle());
                                        } else {
                                            charSequence = r3.messageText;
                                            AndroidUtilities.highlightText(charSequence, r3.highlightedWords, (Theme.ResourcesProvider) null);
                                        }
                                        CharSequence charSequence7 = charSequence;
                                        charSequence3 = charSequence7;
                                        if (r3.messageOwner.media != null) {
                                            charSequence3 = charSequence7;
                                            if (!r3.isMediaEmpty()) {
                                                color = getContext().getResources().getColor(R.color.widget_action_text);
                                                charSequence3 = charSequence7;
                                            }
                                        }
                                    }
                                }
                            }
                            ((TextView) this.cells[i11].findViewById(R.id.shortcut_widget_item_time)).setText(LocaleController.stringForMessageListDate(r3.messageOwner.date));
                            ViewGroup viewGroup = this.cells[i11];
                            int i12 = R.id.shortcut_widget_item_message;
                            ((TextView) viewGroup.findViewById(i12)).setText(charSequence3.toString());
                            ((TextView) this.cells[i11].findViewById(i12)).setTextColor(color);
                        } else {
                            if (r14.last_message_date != 0) {
                                ((TextView) this.cells[i11].findViewById(R.id.shortcut_widget_item_time)).setText(LocaleController.stringForMessageListDate(r14.last_message_date));
                            } else {
                                ((TextView) this.cells[i11].findViewById(R.id.shortcut_widget_item_time)).setText("");
                            }
                            ((TextView) this.cells[i11].findViewById(R.id.shortcut_widget_item_message)).setText("");
                        }
                        if (r14.unread_count > 0) {
                            ViewGroup viewGroup2 = this.cells[i11];
                            int i13 = R.id.shortcut_widget_item_badge;
                            ((TextView) viewGroup2.findViewById(i13)).setText(String.format("%d", Integer.valueOf(r14.unread_count)));
                            this.cells[i11].findViewById(i13).setVisibility(0);
                            if (EditWidgetActivity.this.getMessagesController().isDialogMuted(r14.id, 0L)) {
                                this.cells[i11].findViewById(i13).setBackgroundResource(R.drawable.widget_counter_muted);
                            } else {
                                this.cells[i11].findViewById(i13).setBackgroundResource(R.drawable.widget_counter);
                            }
                        } else {
                            this.cells[i11].findViewById(R.id.shortcut_widget_item_badge).setVisibility(8);
                        }
                        i2 = 1;
                    }
                    i11 += i2;
                    i4 = 12;
                    i5 = 8;
                    i6 = 2;
                    r10 = 1;
                    bitmap = null;
                }
                ViewGroup viewGroup3 = this.cells[0];
                int i14 = R.id.shortcut_widget_item_divider;
                viewGroup3.findViewById(i14).setVisibility(this.cells[1].getVisibility());
                this.cells[1].findViewById(i14).setVisibility(8);
            }
            if (this.cells[0].getVisibility() == 0) {
                EditWidgetActivity.this.previewImageView.setVisibility(8);
            } else {
                EditWidgetActivity.this.previewImageView.setVisibility(0);
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(264.0f), TLObject.FLAG_30));
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            Drawable cachedWallpaperNonBlocking = Theme.getCachedWallpaperNonBlocking();
            if (cachedWallpaperNonBlocking != this.backgroundDrawable && cachedWallpaperNonBlocking != null) {
                if (Theme.isAnimatingColor()) {
                    this.oldBackgroundDrawable = this.backgroundDrawable;
                    this.oldBackgroundGradientDisposable = this.backgroundGradientDisposable;
                } else {
                    BackgroundGradientDrawable.Disposable disposable = this.backgroundGradientDisposable;
                    if (disposable != null) {
                        disposable.dispose();
                        this.backgroundGradientDisposable = null;
                    }
                }
                this.backgroundDrawable = cachedWallpaperNonBlocking;
            }
            float themeAnimationValue = ((BaseFragment) EditWidgetActivity.this).parentLayout.getThemeAnimationValue();
            int i = 0;
            while (i < 2) {
                Drawable drawable = i == 0 ? this.oldBackgroundDrawable : this.backgroundDrawable;
                if (drawable != null) {
                    if (i == 1 && this.oldBackgroundDrawable != null && ((BaseFragment) EditWidgetActivity.this).parentLayout != null) {
                        drawable.setAlpha((int) (255.0f * themeAnimationValue));
                    } else {
                        drawable.setAlpha(NotificationCenter.didReceiveSmsCode);
                    }
                    if ((drawable instanceof ColorDrawable) || (drawable instanceof GradientDrawable) || (drawable instanceof MotionBackgroundDrawable)) {
                        drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                        if (drawable instanceof BackgroundGradientDrawable) {
                            this.backgroundGradientDisposable = ((BackgroundGradientDrawable) drawable).drawExactBoundsSize(canvas, this);
                        } else {
                            drawable.draw(canvas);
                        }
                    } else if (drawable instanceof BitmapDrawable) {
                        if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                            canvas.save();
                            float f = 2.0f / AndroidUtilities.density;
                            canvas.scale(f, f);
                            drawable.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f), (int) Math.ceil(getMeasuredHeight() / f));
                        } else {
                            int measuredHeight = getMeasuredHeight();
                            float max = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), measuredHeight / drawable.getIntrinsicHeight());
                            int ceil = (int) Math.ceil(drawable.getIntrinsicWidth() * max);
                            int ceil2 = (int) Math.ceil(drawable.getIntrinsicHeight() * max);
                            int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                            int i2 = (measuredHeight - ceil2) / 2;
                            canvas.save();
                            canvas.clipRect(0, 0, ceil, getMeasuredHeight());
                            drawable.setBounds(measuredWidth, i2, ceil + measuredWidth, ceil2 + i2);
                        }
                        drawable.draw(canvas);
                        canvas.restore();
                    }
                    if (i == 0 && this.oldBackgroundDrawable != null && themeAnimationValue >= 1.0f) {
                        BackgroundGradientDrawable.Disposable disposable2 = this.oldBackgroundGradientDisposable;
                        if (disposable2 != null) {
                            disposable2.dispose();
                            this.oldBackgroundGradientDisposable = null;
                        }
                        this.oldBackgroundDrawable = null;
                        invalidate();
                    }
                }
                i++;
            }
            this.shadowDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.shadowDrawable.draw(canvas);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BackgroundGradientDrawable.Disposable disposable = this.backgroundGradientDisposable;
            if (disposable != null) {
                disposable.dispose();
                this.backgroundGradientDisposable = null;
            }
            BackgroundGradientDrawable.Disposable disposable2 = this.oldBackgroundGradientDisposable;
            if (disposable2 != null) {
                disposable2.dispose();
                this.oldBackgroundGradientDisposable = null;
            }
        }
    }

    public EditWidgetActivity(int i, int i2) {
        this.widgetType = i;
        this.currentWidgetId = i2;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>();
        ArrayList<TLRPC.Chat> arrayList2 = new ArrayList<>();
        getMessagesStorage().getWidgetDialogIds(this.currentWidgetId, this.widgetType, this.selectedDialogs, arrayList, arrayList2, true);
        getMessagesController().putUsers(arrayList, true);
        getMessagesController().putChats(arrayList2, true);
        updateRows();
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean onFragmentCreate() {
        DialogsActivity.loadDialogs(AccountInstance.getInstance(this.currentAccount));
        getMediaDataController().loadHints(true);
        return super.onFragmentCreate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateRows() {
        this.previewRow = 0;
        this.rowCount = 2;
        this.selectChatsRow = 1;
        if (this.selectedDialogs.isEmpty()) {
            this.chatsStartRow = -1;
            this.chatsEndRow = -1;
        } else {
            int i = this.rowCount;
            this.chatsStartRow = i;
            int size = i + this.selectedDialogs.size();
            this.rowCount = size;
            this.chatsEndRow = size;
        }
        int i2 = this.rowCount;
        this.rowCount = i2 + 1;
        this.infoRow = i2;
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
    }

    public void setDelegate(EditWidgetActivityDelegate editWidgetActivityDelegate) {
        this.delegate = editWidgetActivityDelegate;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public View createView(final Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null && iNavigationLayout.isLayersLayout()) {
            this.actionBar.setOccupyStatusBar(false);
        }
        if (this.widgetType == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.WidgetChats));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.WidgetShortcuts));
        }
        this.actionBar.createMenu().addItem(1, LocaleController.getString(R.string.Done).toUpperCase());
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() { // from class: org.telegram.ui.EditWidgetActivity.1
            @Override // org.telegram.ui.ActionBar.ActionBar.ActionBarMenuOnItemClick
            public void onItemClick(int i) {
                if (i == -1) {
                    if (EditWidgetActivity.this.delegate == null) {
                        EditWidgetActivity.this.finishActivity();
                        return;
                    } else {
                        EditWidgetActivity.this.finishFragment();
                        return;
                    }
                }
                if (i != 1 || EditWidgetActivity.this.getParentActivity() == null) {
                    return;
                }
                ArrayList<MessagesStorage.TopicKey> arrayList = new ArrayList<>();
                for (int i2 = 0; i2 < EditWidgetActivity.this.selectedDialogs.size(); i2++) {
                    arrayList.add(MessagesStorage.TopicKey.of(((Long) EditWidgetActivity.this.selectedDialogs.get(i2)).longValue(), 0L));
                }
                EditWidgetActivity.this.getMessagesStorage().putWidgetDialogs(EditWidgetActivity.this.currentWidgetId, arrayList);
                SharedPreferences.Editor edit = EditWidgetActivity.this.getParentActivity().getSharedPreferences("shortcut_widget", 0).edit();
                edit.putInt("account" + EditWidgetActivity.this.currentWidgetId, ((BaseFragment) EditWidgetActivity.this).currentAccount);
                edit.putInt(TeXSymbolParser.TYPE_ATTR + EditWidgetActivity.this.currentWidgetId, EditWidgetActivity.this.widgetType);
                edit.commit();
                AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(EditWidgetActivity.this.getParentActivity());
                if (EditWidgetActivity.this.widgetType == 0) {
                    ChatsWidgetProvider.updateWidget(EditWidgetActivity.this.getParentActivity(), appWidgetManager, EditWidgetActivity.this.currentWidgetId);
                } else {
                    ContactsWidgetProvider.updateWidget(EditWidgetActivity.this.getParentActivity(), appWidgetManager, EditWidgetActivity.this.currentWidgetId);
                }
                if (EditWidgetActivity.this.delegate != null) {
                    EditWidgetActivity.this.delegate.didSelectDialogs(EditWidgetActivity.this.selectedDialogs);
                } else {
                    EditWidgetActivity.this.finishActivity();
                }
            }
        });
        this.listAdapter = new ListAdapter(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        this.fragmentView = frameLayout;
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setAdapter(this.listAdapter);
        ((DefaultItemAnimator) this.listView.getItemAnimator()).setDelayAnimations(false);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new TouchHelperCallback());
        this.itemTouchHelper = itemTouchHelper;
        itemTouchHelper.attachToRecyclerView(this.listView);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() { // from class: org.telegram.ui.EditWidgetActivity$$ExternalSyntheticLambda1
            @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListener
            public final void onItemClick(View view, int i) {
                EditWidgetActivity.$r8$lambda$6qU1ajADFmSA_9tuzSTbH9AsNLg(EditWidgetActivity.this, context, view, i);
            }
        });
        this.listView.setOnItemLongClickListener(new 2());
        return this.fragmentView;
    }

    public static /* synthetic */ void $r8$lambda$6qU1ajADFmSA_9tuzSTbH9AsNLg(final EditWidgetActivity editWidgetActivity, Context context, View view, int i) {
        if (i == editWidgetActivity.selectChatsRow) {
            InviteMembersBottomSheet inviteMembersBottomSheet = new InviteMembersBottomSheet(context, editWidgetActivity.currentAccount, null, 0L, editWidgetActivity, null);
            inviteMembersBottomSheet.setDelegate(new InviteMembersBottomSheet.InviteMembersBottomSheetDelegate() { // from class: org.telegram.ui.EditWidgetActivity$$ExternalSyntheticLambda2
                @Override // org.telegram.ui.Components.InviteMembersBottomSheet.InviteMembersBottomSheetDelegate
                public final void didSelectDialogs(ArrayList arrayList) {
                    EditWidgetActivity.$r8$lambda$8Cgrp_sWPSj_GFCSMbKytBRfals(EditWidgetActivity.this, arrayList);
                }
            }, editWidgetActivity.selectedDialogs);
            inviteMembersBottomSheet.setSelectedContacts(editWidgetActivity.selectedDialogs);
            editWidgetActivity.showDialog(inviteMembersBottomSheet);
        }
    }

    public static /* synthetic */ void $r8$lambda$8Cgrp_sWPSj_GFCSMbKytBRfals(EditWidgetActivity editWidgetActivity, ArrayList arrayList) {
        editWidgetActivity.selectedDialogs.clear();
        editWidgetActivity.selectedDialogs.addAll(arrayList);
        editWidgetActivity.updateRows();
        WidgetPreviewCell widgetPreviewCell = editWidgetActivity.widgetPreviewCell;
        if (widgetPreviewCell != null) {
            widgetPreviewCell.updateDialogs();
        }
    }

    class 2 implements RecyclerListView.OnItemLongClickListenerExtended {
        private Rect rect = new Rect();

        @Override // org.telegram.ui.Components.RecyclerListView.OnItemLongClickListenerExtended
        public void onLongClickRelease() {
        }

        @Override // org.telegram.ui.Components.RecyclerListView.OnItemLongClickListenerExtended
        public void onMove(float f, float f2) {
        }

        2() {
        }

        @Override // org.telegram.ui.Components.RecyclerListView.OnItemLongClickListenerExtended
        public boolean onItemClick(View view, final int i, float f, float f2) {
            if (EditWidgetActivity.this.getParentActivity() != null && (view instanceof GroupCreateUserCell)) {
                ((ImageView) view.getTag(R.id.object_tag)).getHitRect(this.rect);
                if (!this.rect.contains((int) f, (int) f2)) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(EditWidgetActivity.this.getParentActivity());
                    builder.setItems(new CharSequence[]{LocaleController.getString(R.string.Delete)}, new DialogInterface.OnClickListener() { // from class: org.telegram.ui.EditWidgetActivity$2$$ExternalSyntheticLambda0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            EditWidgetActivity.2.$r8$lambda$PaGtWYwaIpQviWbJ40MtAlfQGDA(EditWidgetActivity.2.this, i, dialogInterface, i2);
                        }
                    });
                    EditWidgetActivity.this.showDialog(builder.create());
                    return true;
                }
            }
            return false;
        }

        public static /* synthetic */ void $r8$lambda$PaGtWYwaIpQviWbJ40MtAlfQGDA(2 r0, int i, DialogInterface dialogInterface, int i2) {
            if (i2 != 0) {
                r0.getClass();
                return;
            }
            EditWidgetActivity.this.selectedDialogs.remove(i - EditWidgetActivity.this.chatsStartRow);
            EditWidgetActivity.this.updateRows();
            if (EditWidgetActivity.this.widgetPreviewCell != null) {
                EditWidgetActivity.this.widgetPreviewCell.updateDialogs();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishActivity() {
        if (getParentActivity() == null) {
            return;
        }
        getParentActivity().finish();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.EditWidgetActivity$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                EditWidgetActivity.this.removeSelfFromStack();
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return EditWidgetActivity.this.rowCount;
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            return itemViewType == 1 || itemViewType == 3;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            FrameLayout frameLayout;
            if (i == 0) {
                FrameLayout textInfoPrivacyCell = new TextInfoPrivacyCell(this.mContext);
                textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                frameLayout = textInfoPrivacyCell;
            } else if (i == 1) {
                FrameLayout textCell = new TextCell(this.mContext);
                textCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                frameLayout = textCell;
            } else if (i == 2) {
                frameLayout = EditWidgetActivity.this.widgetPreviewCell = EditWidgetActivity.this.new WidgetPreviewCell(this.mContext);
            } else {
                final GroupCreateUserCell groupCreateUserCell = new GroupCreateUserCell(this.mContext, 0, 0, false);
                ImageView imageView = new ImageView(this.mContext);
                imageView.setImageResource(R.drawable.list_reorder);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                groupCreateUserCell.setTag(R.id.object_tag, imageView);
                groupCreateUserCell.addView(imageView, LayoutHelper.createFrame(40, -1.0f, (LocaleController.isRTL ? 3 : 5) | 16, 10.0f, 0.0f, 10.0f, 0.0f));
                imageView.setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.EditWidgetActivity$ListAdapter$$ExternalSyntheticLambda0
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        return EditWidgetActivity.ListAdapter.$r8$lambda$rclc1fCILNbWnC7IR4B40e_ii_U(EditWidgetActivity.ListAdapter.this, groupCreateUserCell, view, motionEvent);
                    }
                });
                imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chats_pinnedIcon), PorterDuff.Mode.MULTIPLY));
                frameLayout = groupCreateUserCell;
            }
            return new RecyclerListView.Holder(frameLayout);
        }

        public static /* synthetic */ boolean $r8$lambda$rclc1fCILNbWnC7IR4B40e_ii_U(ListAdapter listAdapter, GroupCreateUserCell groupCreateUserCell, View view, MotionEvent motionEvent) {
            listAdapter.getClass();
            if (motionEvent.getAction() != 0) {
                return false;
            }
            EditWidgetActivity.this.itemTouchHelper.startDrag(EditWidgetActivity.this.listView.getChildViewHolder(groupCreateUserCell));
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                if (i == EditWidgetActivity.this.infoRow) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (EditWidgetActivity.this.widgetType != 0) {
                        if (EditWidgetActivity.this.widgetType == 1) {
                            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EditWidgetContactsInfo));
                        }
                    } else {
                        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EditWidgetChatsInfo));
                    }
                    if (SharedConfig.passcodeHash.length() > 0) {
                        spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.WidgetPasscode2)));
                    }
                    textInfoPrivacyCell.setText(spannableStringBuilder);
                    return;
                }
                return;
            }
            if (itemViewType != 1) {
                if (itemViewType != 3) {
                    return;
                }
                GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) viewHolder.itemView;
                Long l = (Long) EditWidgetActivity.this.selectedDialogs.get(i - EditWidgetActivity.this.chatsStartRow);
                long longValue = l.longValue();
                if (DialogObject.isUserDialog(longValue)) {
                    groupCreateUserCell.setObject(EditWidgetActivity.this.getMessagesController().getUser(l), null, null, i != EditWidgetActivity.this.chatsEndRow - 1);
                    return;
                } else {
                    groupCreateUserCell.setObject(EditWidgetActivity.this.getMessagesController().getChat(Long.valueOf(-longValue)), null, null, i != EditWidgetActivity.this.chatsEndRow - 1);
                    return;
                }
            }
            TextCell textCell = (TextCell) viewHolder.itemView;
            textCell.setColors(-1, Theme.key_windowBackgroundWhiteBlueText4);
            Drawable drawable = this.mContext.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = this.mContext.getResources().getDrawable(R.drawable.poll_add_plus);
            int color = Theme.getColor(Theme.key_switchTrackChecked);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(color, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_checkboxCheck), mode));
            textCell.setTextAndIcon(LocaleController.getString(R.string.SelectChats), new CombinedDrawable(drawable, drawable2), EditWidgetActivity.this.chatsStartRow != -1);
            textCell.getImageView().setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 3 || itemViewType == 1) {
                viewHolder.itemView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            if (i == EditWidgetActivity.this.previewRow) {
                return 2;
            }
            if (i == EditWidgetActivity.this.selectChatsRow) {
                return 1;
            }
            return i == EditWidgetActivity.this.infoRow ? 0 : 3;
        }

        public boolean swapElements(int i, int i2) {
            int i3 = i - EditWidgetActivity.this.chatsStartRow;
            int i4 = i2 - EditWidgetActivity.this.chatsStartRow;
            int i5 = EditWidgetActivity.this.chatsEndRow - EditWidgetActivity.this.chatsStartRow;
            if (i3 < 0 || i4 < 0 || i3 >= i5 || i4 >= i5) {
                return false;
            }
            Long l = (Long) EditWidgetActivity.this.selectedDialogs.get(i3);
            EditWidgetActivity.this.selectedDialogs.set(i3, (Long) EditWidgetActivity.this.selectedDialogs.get(i4));
            EditWidgetActivity.this.selectedDialogs.set(i4, l);
            notifyItemMoved(i, i2);
            return true;
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean onBackPressed(boolean z) {
        if (this.delegate != null) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        finishActivity();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{TextCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundGray));
        ActionBar actionBar = this.actionBar;
        int i = ThemeDescription.FLAG_BACKGROUND;
        int i2 = Theme.key_actionBarDefault;
        arrayList.add(new ThemeDescription(actionBar, i, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SUBMENUBACKGROUND, null, null, null, null, Theme.key_actionBarDefaultSubmenuBackground));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SUBMENUITEM, null, null, null, null, Theme.key_actionBarDefaultSubmenuItem));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SUBMENUITEM | ThemeDescription.FLAG_IMAGECOLOR, null, null, null, null, Theme.key_actionBarDefaultSubmenuItemIcon));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, Theme.key_windowBackgroundGrayShadow));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText4));
        int i3 = Theme.key_windowBackgroundWhiteBlueText4;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        return arrayList;
    }
}
