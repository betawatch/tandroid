package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$ChannelLocation;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$ChatParticipant;
import org.telegram.tgnet.TLRPC$ChatPhoto;
import org.telegram.tgnet.TLRPC$ChatReactions;
import org.telegram.tgnet.TLRPC$FileLocation;
import org.telegram.tgnet.TLRPC$InputFile;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$Photo;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$Reaction;
import org.telegram.tgnet.TLRPC$StickerSet;
import org.telegram.tgnet.TLRPC$TL_availableReaction;
import org.telegram.tgnet.TLRPC$TL_bots_setBotInfo;
import org.telegram.tgnet.TLRPC$TL_channelLocation;
import org.telegram.tgnet.TLRPC$TL_chatBannedRights;
import org.telegram.tgnet.TLRPC$TL_chatParticipantAdmin;
import org.telegram.tgnet.TLRPC$TL_chatParticipantCreator;
import org.telegram.tgnet.TLRPC$TL_chatReactionsNone;
import org.telegram.tgnet.TLRPC$TL_chatReactionsSome;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputPhotoEmpty;
import org.telegram.tgnet.TLRPC$TL_messages_exportedChatInvites;
import org.telegram.tgnet.TLRPC$TL_messages_getExportedChatInvites;
import org.telegram.tgnet.TLRPC$TL_photo;
import org.telegram.tgnet.TLRPC$TL_photos_updateProfilePhoto;
import org.telegram.tgnet.TLRPC$TL_photos_uploadProfilePhoto;
import org.telegram.tgnet.TLRPC$TL_reactionEmoji;
import org.telegram.tgnet.TLRPC$TL_userProfilePhoto;
import org.telegram.tgnet.TLRPC$TL_username;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$UserFull;
import org.telegram.tgnet.TLRPC$UserProfilePhoto;
import org.telegram.tgnet.TLRPC$VideoSize;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.RadioButtonCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextDetailCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.ChatEditActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EditTextEmoji;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LocationActivity;
import org.telegram.ui.PhotoViewer;
/* loaded from: classes3.dex */
public class ChatEditActivity extends BaseFragment implements ImageUpdater.ImageUpdaterDelegate, NotificationCenter.NotificationCenterDelegate {
    private TextCell adminCell;
    private TLRPC$ChatReactions availableReactions;
    private TLRPC$FileLocation avatar;
    private AnimatorSet avatarAnimation;
    private LinearLayout avatarContainer;
    private AvatarDrawable avatarDrawable;
    private BackupImageView avatarImage;
    private View avatarOverlay;
    private RadialProgressView avatarProgressView;
    private TextCell blockCell;
    private TextInfoPrivacyCell botInfoCell;
    RLottieDrawable cameraDrawable;
    private boolean canForum;
    private TextCell changeBotSettingsCell;
    private long chatId;
    private boolean createAfterUpload;
    private TLRPC$Chat currentChat;
    private TLRPC$User currentUser;
    private TextSettingsCell deleteCell;
    private FrameLayout deleteContainer;
    private ShadowSectionCell deleteInfoCell;
    private EditTextBoldCursor descriptionTextView;
    private View doneButton;
    private boolean donePressed;
    private TextCell editCommandsCell;
    private TextCell editIntroCell;
    private boolean forum;
    private TextCell forumsCell;
    private boolean hasUploadedPhoto;
    private TextCell historyCell;
    private boolean historyHidden;
    private ImageUpdater imageUpdater;
    private TLRPC$ChatFull info;
    private LinearLayout infoContainer;
    private ShadowSectionCell infoSectionCell;
    private TextCell inviteLinksCell;
    private boolean isChannel;
    private LinearLayout linearLayout;
    private TextCell linkedCell;
    private TextCell locationCell;
    private TextCell logCell;
    private TextCell memberRequestsCell;
    private TextCell membersCell;
    private EditTextEmoji nameTextView;
    private AlertDialog progressDialog;
    private PhotoViewer.PhotoViewerProvider provider;
    private TextCell publicLinkCell;
    private TextCell reactionsCell;
    private TextCell setAvatarCell;
    private LinearLayout settingsContainer;
    private TextInfoPrivacyCell settingsSectionCell;
    private ShadowSectionCell settingsTopSectionCell;
    private TextCell signCell;
    private boolean signMessages;
    private TextCell stickersCell;
    private FrameLayout stickersContainer;
    private TextInfoPrivacyCell stickersInfoCell;
    private TextCell typeCell;
    private LinearLayout typeEditContainer;
    private UndoView undoView;
    private ValueAnimator updateHistoryShowAnimator;
    private long userId;
    private TLRPC$UserFull userInfo;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$createView$2(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override // org.telegram.ui.Components.ImageUpdater.ImageUpdaterDelegate
    public /* synthetic */ boolean canFinishFragment() {
        return ImageUpdater.ImageUpdaterDelegate.-CC.$default$canFinishFragment(this);
    }

    @Override // org.telegram.ui.Components.ImageUpdater.ImageUpdaterDelegate
    public /* synthetic */ void didUploadFailed() {
        ImageUpdater.ImageUpdaterDelegate.-CC.$default$didUploadFailed(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class 1 extends PhotoViewer.EmptyPhotoViewerProvider {
        @Override // org.telegram.ui.PhotoViewer.EmptyPhotoViewerProvider, org.telegram.ui.PhotoViewer.PhotoViewerProvider
        public boolean canLoadMoreAvatars() {
            return false;
        }

        @Override // org.telegram.ui.PhotoViewer.EmptyPhotoViewerProvider, org.telegram.ui.PhotoViewer.PhotoViewerProvider
        public int getTotalImageCount() {
            return 1;
        }

        1() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
            if (r9 != null) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
            if (r9 != null) goto L15;
         */
        @Override // org.telegram.ui.PhotoViewer.EmptyPhotoViewerProvider, org.telegram.ui.PhotoViewer.PhotoViewerProvider
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC$FileLocation tLRPC$FileLocation, int i, boolean z) {
            TLRPC$FileLocation tLRPC$FileLocation2;
            if (tLRPC$FileLocation == null) {
                return null;
            }
            if (ChatEditActivity.this.currentUser != null) {
                TLRPC$User user = ChatEditActivity.this.userId == 0 ? null : ChatEditActivity.this.getMessagesController().getUser(Long.valueOf(ChatEditActivity.this.userId));
                if (user != null) {
                    TLRPC$UserProfilePhoto tLRPC$UserProfilePhoto = user.photo;
                    if (tLRPC$UserProfilePhoto != null) {
                        tLRPC$FileLocation2 = tLRPC$UserProfilePhoto.photo_big;
                    }
                }
                tLRPC$FileLocation2 = null;
            } else {
                TLRPC$Chat chat = ChatEditActivity.this.getMessagesController().getChat(Long.valueOf(ChatEditActivity.this.chatId));
                if (chat != null) {
                    TLRPC$ChatPhoto tLRPC$ChatPhoto = chat.photo;
                    if (tLRPC$ChatPhoto != null) {
                        tLRPC$FileLocation2 = tLRPC$ChatPhoto.photo_big;
                    }
                }
                tLRPC$FileLocation2 = null;
            }
            if (tLRPC$FileLocation2 != null && tLRPC$FileLocation2.local_id == tLRPC$FileLocation.local_id && tLRPC$FileLocation2.volume_id == tLRPC$FileLocation.volume_id && tLRPC$FileLocation2.dc_id == tLRPC$FileLocation.dc_id) {
                int[] iArr = new int[2];
                ChatEditActivity.this.avatarImage.getLocationInWindow(iArr);
                PhotoViewer.PlaceProviderObject placeProviderObject = new PhotoViewer.PlaceProviderObject();
                placeProviderObject.viewX = iArr[0];
                placeProviderObject.viewY = iArr[1] - (Build.VERSION.SDK_INT < 21 ? AndroidUtilities.statusBarHeight : 0);
                placeProviderObject.parentView = ChatEditActivity.this.avatarImage;
                placeProviderObject.imageReceiver = ChatEditActivity.this.avatarImage.getImageReceiver();
                placeProviderObject.dialogId = ChatEditActivity.this.userId != 0 ? ChatEditActivity.this.userId : -ChatEditActivity.this.chatId;
                placeProviderObject.thumb = placeProviderObject.imageReceiver.getBitmapSafe();
                placeProviderObject.size = -1L;
                placeProviderObject.radius = ChatEditActivity.this.avatarImage.getImageReceiver().getRoundRadius();
                placeProviderObject.scale = ChatEditActivity.this.avatarContainer.getScaleX();
                placeProviderObject.canEdit = true;
                return placeProviderObject;
            }
            return null;
        }

        @Override // org.telegram.ui.PhotoViewer.EmptyPhotoViewerProvider, org.telegram.ui.PhotoViewer.PhotoViewerProvider
        public void willHidePhotoViewer() {
            ChatEditActivity.this.avatarImage.getImageReceiver().setVisible(true, true);
        }

        @Override // org.telegram.ui.PhotoViewer.EmptyPhotoViewerProvider, org.telegram.ui.PhotoViewer.PhotoViewerProvider
        public void openPhotoForEdit(String str, String str2, boolean z) {
            ChatEditActivity.this.imageUpdater.openPhotoForEdit(str, str2, 0, z);
        }

        @Override // org.telegram.ui.PhotoViewer.EmptyPhotoViewerProvider, org.telegram.ui.PhotoViewer.PhotoViewerProvider
        public boolean onDeletePhoto(int i) {
            TLRPC$TL_photos_updateProfilePhoto tLRPC$TL_photos_updateProfilePhoto = new TLRPC$TL_photos_updateProfilePhoto();
            tLRPC$TL_photos_updateProfilePhoto.bot = ChatEditActivity.this.getMessagesController().getInputUser(ChatEditActivity.this.userId);
            tLRPC$TL_photos_updateProfilePhoto.flags |= 2;
            tLRPC$TL_photos_updateProfilePhoto.id = new TLRPC$TL_inputPhotoEmpty();
            ChatEditActivity.this.getConnectionsManager().sendRequest(tLRPC$TL_photos_updateProfilePhoto, new RequestDelegate() { // from class: org.telegram.ui.ChatEditActivity$1$$ExternalSyntheticLambda1
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    ChatEditActivity.1.this.lambda$onDeletePhoto$1(tLObject, tLRPC$TL_error);
                }
            });
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDeletePhoto$1(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ChatEditActivity$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ChatEditActivity.1.this.lambda$onDeletePhoto$0();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDeletePhoto$0() {
            ChatEditActivity.this.avatarImage.setImageDrawable(ChatEditActivity.this.avatarDrawable);
            ChatEditActivity.this.setAvatarCell.setTextAndIcon(LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), R.drawable.msg_addphoto, true);
            if (ChatEditActivity.this.currentUser != null) {
                ChatEditActivity.this.currentUser.photo = null;
                ChatEditActivity.this.getMessagesController().putUser(ChatEditActivity.this.currentUser, true);
            }
            ChatEditActivity.this.hasUploadedPhoto = true;
            ChatEditActivity chatEditActivity = ChatEditActivity.this;
            if (chatEditActivity.cameraDrawable == null) {
                int i = R.raw.camera_outline;
                chatEditActivity.cameraDrawable = new RLottieDrawable(i, "" + i, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            }
            ChatEditActivity.this.setAvatarCell.imageView.setTranslationX(-AndroidUtilities.dp(8.0f));
            ChatEditActivity.this.setAvatarCell.imageView.setAnimation(ChatEditActivity.this.cameraDrawable);
        }
    }

    public ChatEditActivity(Bundle bundle) {
        super(bundle);
        this.provider = new 1();
        this.avatarDrawable = new AvatarDrawable();
        this.chatId = bundle.getLong("chat_id", 0L);
        this.userId = bundle.getLong("user_id", 0L);
        if (this.chatId != 0) {
            TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
            this.imageUpdater = new ImageUpdater(true, (chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) ? 2 : 1, true);
            return;
        }
        this.imageUpdater = new ImageUpdater(false, 0, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0055, code lost:
        if (r0 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fd, code lost:
        if (java.lang.Math.max(r1 == null ? 0 : r1.participants_count, r0.participants_count) >= getMessagesController().forumUpgradeParticipantsMin) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0107, code lost:
        if (r0.linked_chat_id != 0) goto L39;
     */
    @Override // org.telegram.ui.ActionBar.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onFragmentCreate() {
        boolean z = true;
        if (this.chatId != 0) {
            TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
            this.currentChat = chat;
            if (chat == null) {
                TLRPC$Chat chatSync = MessagesStorage.getInstance(this.currentAccount).getChatSync(this.chatId);
                this.currentChat = chatSync;
                if (chatSync != null) {
                    getMessagesController().putChat(this.currentChat, true);
                    if (this.info == null) {
                        TLRPC$ChatFull loadChatInfo = MessagesStorage.getInstance(this.currentAccount).loadChatInfo(this.chatId, ChatObject.isChannel(this.currentChat), new CountDownLatch(1), false, false);
                        this.info = loadChatInfo;
                    }
                }
                return false;
            }
        } else {
            TLRPC$User user = this.userId == 0 ? null : getMessagesController().getUser(Long.valueOf(this.userId));
            this.currentUser = user;
            if (user == null) {
                TLRPC$User userSync = MessagesStorage.getInstance(this.currentAccount).getUserSync(this.userId);
                this.currentUser = userSync;
                if (userSync != null) {
                    getMessagesController().putUser(this.currentUser, true);
                    if (this.userInfo == null) {
                        HashSet<Long> hashSet = new HashSet<>();
                        hashSet.add(Long.valueOf(this.userId));
                        ArrayList<TLRPC$UserFull> loadUserInfos = MessagesStorage.getInstance(this.currentAccount).loadUserInfos(hashSet);
                        if (!loadUserInfos.isEmpty()) {
                            this.userInfo = loadUserInfos.get(0);
                        }
                    }
                }
                return false;
            }
        }
        TLRPC$Chat tLRPC$Chat = this.currentChat;
        if (tLRPC$Chat != null) {
            this.avatarDrawable.setInfo(5L, tLRPC$Chat.title, null);
            this.isChannel = ChatObject.isChannel(this.currentChat) && !this.currentChat.megagroup;
            TLRPC$Chat tLRPC$Chat2 = this.currentChat;
            this.signMessages = tLRPC$Chat2.signatures;
            boolean z2 = tLRPC$Chat2.forum;
            this.forum = z2;
            if (this.userId == 0) {
                if (!z2) {
                    TLRPC$ChatFull tLRPC$ChatFull = this.info;
                }
                TLRPC$ChatFull tLRPC$ChatFull2 = this.info;
                if (tLRPC$ChatFull2 != null) {
                }
                this.canForum = z;
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatAvailableReactionsUpdated);
            }
            z = false;
            this.canForum = z;
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatAvailableReactionsUpdated);
        } else {
            this.avatarDrawable.setInfo(5L, this.currentUser.first_name, null);
            this.isChannel = false;
            this.signMessages = false;
            this.forum = false;
            this.canForum = false;
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.userInfoDidLoad);
        }
        ImageUpdater imageUpdater = this.imageUpdater;
        imageUpdater.parentFragment = this;
        imageUpdater.setDelegate(this);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        if (this.info != null) {
            loadLinksCount();
        }
        return super.onFragmentCreate();
    }

    private void loadLinksCount() {
        TLRPC$TL_messages_getExportedChatInvites tLRPC$TL_messages_getExportedChatInvites = new TLRPC$TL_messages_getExportedChatInvites();
        tLRPC$TL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-this.chatId);
        tLRPC$TL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
        tLRPC$TL_messages_getExportedChatInvites.limit = 0;
        getConnectionsManager().sendRequest(tLRPC$TL_messages_getExportedChatInvites, new RequestDelegate() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda42
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ChatEditActivity.this.lambda$loadLinksCount$1(tLObject, tLRPC$TL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadLinksCount$1(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda38
            @Override // java.lang.Runnable
            public final void run() {
                ChatEditActivity.this.lambda$loadLinksCount$0(tLRPC$TL_error, tLObject);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadLinksCount$0(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        if (tLRPC$TL_error == null) {
            this.info.invitesCount = ((TLRPC$TL_messages_exportedChatInvites) tLObject).count;
            getMessagesStorage().saveChatLinksCount(this.chatId, this.info.invitesCount);
            updateFields(false, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null) {
            imageUpdater.clear();
        }
        if (this.currentChat != null) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatAvailableReactionsUpdated);
        } else {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.userInfoDidLoad);
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        EditTextEmoji editTextEmoji = this.nameTextView;
        if (editTextEmoji != null) {
            editTextEmoji.onDestroy();
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onResume() {
        super.onResume();
        EditTextEmoji editTextEmoji = this.nameTextView;
        if (editTextEmoji != null) {
            editTextEmoji.onResume();
            this.nameTextView.getEditText().requestFocus();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        updateFields(true, true);
        this.imageUpdater.onResume();
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onPause() {
        super.onPause();
        EditTextEmoji editTextEmoji = this.nameTextView;
        if (editTextEmoji != null) {
            editTextEmoji.onPause();
        }
        UndoView undoView = this.undoView;
        if (undoView != null) {
            undoView.hide(true, 0);
        }
        this.imageUpdater.onPause();
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onBecomeFullyHidden() {
        UndoView undoView = this.undoView;
        if (undoView != null) {
            undoView.hide(true, 0);
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void dismissCurrentDialog() {
        if (this.imageUpdater.dismissCurrentDialog(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean dismissDialogOnPause(Dialog dialog) {
        return this.imageUpdater.dismissDialogOnPause(dialog) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        this.imageUpdater.onRequestPermissionsResultFragment(i, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean onBackPressed() {
        EditTextEmoji editTextEmoji = this.nameTextView;
        if (editTextEmoji != null && editTextEmoji.isPopupShowing()) {
            this.nameTextView.hidePopup(true);
            return false;
        }
        return checkDiscard();
    }

    /* JADX WARN: Removed duplicated region for block: B:192:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x07d4  */
    @Override // org.telegram.ui.ActionBar.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View createView(final Context context) {
        TLRPC$ChatFull tLRPC$ChatFull;
        int i;
        TextCell textCell;
        TextCell textCell2;
        TLRPC$ChatFull tLRPC$ChatFull2;
        TLRPC$ChatFull tLRPC$ChatFull3;
        TLRPC$ChatFull tLRPC$ChatFull4;
        TLRPC$ChatFull tLRPC$ChatFull5;
        EditTextEmoji editTextEmoji = this.nameTextView;
        if (editTextEmoji != null) {
            editTextEmoji.onDestroy();
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() { // from class: org.telegram.ui.ChatEditActivity.2
            @Override // org.telegram.ui.ActionBar.ActionBar.ActionBarMenuOnItemClick
            public void onItemClick(int i2) {
                if (i2 == -1) {
                    if (ChatEditActivity.this.checkDiscard()) {
                        ChatEditActivity.this.finishFragment();
                    }
                } else if (i2 == 1) {
                    ChatEditActivity.this.processDone();
                }
            }
        });
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) { // from class: org.telegram.ui.ChatEditActivity.3
            private boolean ignoreLayout;

            @Override // android.widget.FrameLayout, android.view.View
            protected void onMeasure(int i2, int i3) {
                int size = View.MeasureSpec.getSize(i2);
                int size2 = View.MeasureSpec.getSize(i3);
                setMeasuredDimension(size, size2);
                int paddingTop = size2 - getPaddingTop();
                measureChildWithMargins(((BaseFragment) ChatEditActivity.this).actionBar, i2, 0, i3, 0);
                if (measureKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
                    this.ignoreLayout = true;
                    ChatEditActivity.this.nameTextView.hideEmojiView();
                    this.ignoreLayout = false;
                }
                int childCount = getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt != null && childAt.getVisibility() != 8 && childAt != ((BaseFragment) ChatEditActivity.this).actionBar) {
                        if (ChatEditActivity.this.nameTextView != null && ChatEditActivity.this.nameTextView.isPopupView(childAt)) {
                            if (AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
                                if (AndroidUtilities.isTablet()) {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), (paddingTop - AndroidUtilities.statusBarHeight) + getPaddingTop()), 1073741824));
                                } else {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((paddingTop - AndroidUtilities.statusBarHeight) + getPaddingTop(), 1073741824));
                                }
                            } else {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                            }
                        } else {
                            measureChildWithMargins(childAt, i2, 0, i3, 0);
                        }
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00a1  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x00bc  */
            @Override // org.telegram.ui.Components.SizeNotifierFrameLayout, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                int i6;
                int i7;
                int i8;
                int i9;
                int i10;
                int i11;
                int measuredHeight;
                int measuredHeight2;
                int childCount = getChildCount();
                int measureKeyboardHeight = measureKeyboardHeight();
                int emojiPadding = (measureKeyboardHeight > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) ? 0 : ChatEditActivity.this.nameTextView.getEmojiPadding();
                setBottomClip(emojiPadding);
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                        int measuredWidth = childAt.getMeasuredWidth();
                        int measuredHeight3 = childAt.getMeasuredHeight();
                        int i13 = layoutParams.gravity;
                        if (i13 == -1) {
                            i13 = 51;
                        }
                        int i14 = i13 & 7;
                        int i15 = i13 & 112;
                        int i16 = i14 & 7;
                        if (i16 == 1) {
                            i6 = (((i4 - i2) - measuredWidth) / 2) + layoutParams.leftMargin;
                            i7 = layoutParams.rightMargin;
                        } else if (i16 == 5) {
                            i6 = i4 - measuredWidth;
                            i7 = layoutParams.rightMargin;
                        } else {
                            i8 = layoutParams.leftMargin;
                            if (i15 == 16) {
                                if (i15 == 48) {
                                    i11 = layoutParams.topMargin + getPaddingTop();
                                } else if (i15 == 80) {
                                    i9 = ((i5 - emojiPadding) - i3) - measuredHeight3;
                                    i10 = layoutParams.bottomMargin;
                                } else {
                                    i11 = layoutParams.topMargin;
                                }
                                if (ChatEditActivity.this.nameTextView != null && ChatEditActivity.this.nameTextView.isPopupView(childAt)) {
                                    if (!AndroidUtilities.isTablet()) {
                                        measuredHeight = getMeasuredHeight();
                                        measuredHeight2 = childAt.getMeasuredHeight();
                                    } else {
                                        measuredHeight = getMeasuredHeight() + measureKeyboardHeight;
                                        measuredHeight2 = childAt.getMeasuredHeight();
                                    }
                                    i11 = measuredHeight - measuredHeight2;
                                }
                                childAt.layout(i8, i11, measuredWidth + i8, measuredHeight3 + i11);
                            } else {
                                i9 = ((((i5 - emojiPadding) - i3) - measuredHeight3) / 2) + layoutParams.topMargin;
                                i10 = layoutParams.bottomMargin;
                            }
                            i11 = i9 - i10;
                            if (ChatEditActivity.this.nameTextView != null) {
                                if (!AndroidUtilities.isTablet()) {
                                }
                                i11 = measuredHeight - measuredHeight2;
                            }
                            childAt.layout(i8, i11, measuredWidth + i8, measuredHeight3 + i11);
                        }
                        i8 = i6 - i7;
                        if (i15 == 16) {
                        }
                        i11 = i9 - i10;
                        if (ChatEditActivity.this.nameTextView != null) {
                        }
                        childAt.layout(i8, i11, measuredWidth + i8, measuredHeight3 + i11);
                    }
                }
                notifyHeightChanged();
            }

            @Override // android.view.View, android.view.ViewParent
            public void requestLayout() {
                if (this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }
        };
        sizeNotifierFrameLayout.setOnTouchListener(ChatEditActivity$$ExternalSyntheticLambda31.INSTANCE);
        this.fragmentView = sizeNotifierFrameLayout;
        int i2 = Theme.key_windowBackgroundGray;
        sizeNotifierFrameLayout.setBackgroundColor(Theme.getColor(i2));
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        sizeNotifierFrameLayout.addView(scrollView, LayoutHelper.createFrame(-1, -1.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.linearLayout = linearLayout;
        scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        this.actionBar.setTitle(LocaleController.getString("ChannelEdit", R.string.ChannelEdit));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.avatarContainer = linearLayout2;
        linearLayout2.setOrientation(1);
        LinearLayout linearLayout3 = this.avatarContainer;
        int i3 = Theme.key_windowBackgroundWhite;
        linearLayout3.setBackgroundColor(Theme.getColor(i3));
        linearLayout.addView(this.avatarContainer, LayoutHelper.createLinear(-1, -2));
        final FrameLayout frameLayout = new FrameLayout(context);
        this.avatarContainer.addView(frameLayout, LayoutHelper.createLinear(-1, -2));
        BackupImageView backupImageView = new BackupImageView(context) { // from class: org.telegram.ui.ChatEditActivity.4
            @Override // android.view.View
            public void invalidate() {
                if (ChatEditActivity.this.avatarOverlay != null) {
                    ChatEditActivity.this.avatarOverlay.invalidate();
                }
                super.invalidate();
            }

            @Override // android.view.View
            public void invalidate(int i4, int i5, int i6, int i7) {
                if (ChatEditActivity.this.avatarOverlay != null) {
                    ChatEditActivity.this.avatarOverlay.invalidate();
                }
                super.invalidate(i4, i5, i6, i7);
            }
        };
        this.avatarImage = backupImageView;
        backupImageView.setRoundRadius(this.forum ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(32.0f));
        if (this.currentUser != null || ChatObject.canChangeChatInfo(this.currentChat)) {
            BackupImageView backupImageView2 = this.avatarImage;
            boolean z = LocaleController.isRTL;
            frameLayout.addView(backupImageView2, LayoutHelper.createFrame(64, 64.0f, (z ? 5 : 3) | 48, z ? 0.0f : 16.0f, 12.0f, z ? 16.0f : 0.0f, 8.0f));
            final Paint paint = new Paint(1);
            paint.setColor(1426063360);
            View view = new View(context) { // from class: org.telegram.ui.ChatEditActivity.5
                @Override // android.view.View
                protected void onDraw(Canvas canvas) {
                    if (ChatEditActivity.this.avatarImage == null || !ChatEditActivity.this.avatarImage.getImageReceiver().hasNotThumb()) {
                        return;
                    }
                    paint.setAlpha((int) (ChatEditActivity.this.avatarImage.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
            };
            this.avatarOverlay = view;
            boolean z2 = LocaleController.isRTL;
            frameLayout.addView(view, LayoutHelper.createFrame(64, 64.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 16.0f, 12.0f, z2 ? 16.0f : 0.0f, 8.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context);
            this.avatarProgressView = radialProgressView;
            radialProgressView.setSize(AndroidUtilities.dp(30.0f));
            this.avatarProgressView.setProgressColor(-1);
            this.avatarProgressView.setNoProgress(false);
            RadialProgressView radialProgressView2 = this.avatarProgressView;
            boolean z3 = LocaleController.isRTL;
            frameLayout.addView(radialProgressView2, LayoutHelper.createFrame(64, 64.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : 16.0f, 12.0f, z3 ? 16.0f : 0.0f, 8.0f));
            showAvatarProgress(false, false);
            this.avatarContainer.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda25
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ChatEditActivity.this.lambda$createView$3(view2);
                }
            });
        } else {
            BackupImageView backupImageView3 = this.avatarImage;
            boolean z4 = LocaleController.isRTL;
            frameLayout.addView(backupImageView3, LayoutHelper.createFrame(64, 64.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : 16.0f, 12.0f, z4 ? 16.0f : 0.0f, 12.0f));
        }
        EditTextEmoji editTextEmoji2 = new EditTextEmoji(context, sizeNotifierFrameLayout, this, 0, false);
        this.nameTextView = editTextEmoji2;
        if (this.userId != 0) {
            editTextEmoji2.setHint(LocaleController.getString(R.string.BotName));
        } else if (this.isChannel) {
            editTextEmoji2.setHint(LocaleController.getString("EnterChannelName", R.string.EnterChannelName));
        } else {
            editTextEmoji2.setHint(LocaleController.getString("GroupName", R.string.GroupName));
        }
        EditTextEmoji editTextEmoji3 = this.nameTextView;
        TLRPC$Chat tLRPC$Chat = this.currentChat;
        editTextEmoji3.setEnabled(tLRPC$Chat != null || ChatObject.canChangeChatInfo(tLRPC$Chat));
        EditTextEmoji editTextEmoji4 = this.nameTextView;
        editTextEmoji4.setFocusable(editTextEmoji4.isEnabled());
        this.nameTextView.getEditText().addTextChangedListener(new TextWatcher() { // from class: org.telegram.ui.ChatEditActivity.6
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                ChatEditActivity.this.avatarDrawable.setInfo(5L, ChatEditActivity.this.nameTextView.getText().toString(), null);
                if (ChatEditActivity.this.avatarImage != null) {
                    ChatEditActivity.this.avatarImage.invalidate();
                }
            }
        });
        this.nameTextView.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        EditTextEmoji editTextEmoji5 = this.nameTextView;
        boolean z5 = LocaleController.isRTL;
        frameLayout.addView(editTextEmoji5, LayoutHelper.createFrame(-1, -2.0f, 16, z5 ? 5.0f : 96.0f, 0.0f, z5 ? 96.0f : 5.0f, 0.0f));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.settingsContainer = linearLayout4;
        linearLayout4.setOrientation(1);
        this.settingsContainer.setBackgroundColor(Theme.getColor(i3));
        linearLayout.addView(this.settingsContainer, LayoutHelper.createLinear(-1, -2));
        if (this.currentUser != null || ChatObject.canChangeChatInfo(this.currentChat)) {
            TextCell textCell3 = new TextCell(this, context) { // from class: org.telegram.ui.ChatEditActivity.7
                @Override // org.telegram.ui.Cells.TextCell, android.view.View
                protected void onDraw(Canvas canvas) {
                    canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
                }
            };
            this.setAvatarCell = textCell3;
            textCell3.setBackgroundDrawable(Theme.getSelectorDrawable(false));
            this.setAvatarCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
            this.setAvatarCell.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda14
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ChatEditActivity.this.lambda$createView$8(view2);
                }
            });
            this.settingsContainer.addView(this.setAvatarCell, LayoutHelper.createLinear(-1, -2));
        }
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.descriptionTextView = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        this.descriptionTextView.setHintTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteHintText));
        EditTextBoldCursor editTextBoldCursor2 = this.descriptionTextView;
        int i4 = Theme.key_windowBackgroundWhiteBlackText;
        editTextBoldCursor2.setTextColor(Theme.getColor(i4));
        this.descriptionTextView.setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
        this.descriptionTextView.setBackgroundDrawable(null);
        this.descriptionTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        this.descriptionTextView.setInputType(180225);
        this.descriptionTextView.setImeOptions(6);
        this.descriptionTextView.setEnabled(this.currentUser != null || ChatObject.canChangeChatInfo(this.currentChat));
        EditTextBoldCursor editTextBoldCursor3 = this.descriptionTextView;
        editTextBoldCursor3.setFocusable(editTextBoldCursor3.isEnabled());
        this.descriptionTextView.setFilters(new InputFilter[]{new InputFilter.LengthFilter(255)});
        this.descriptionTextView.setHint(LocaleController.getString("DescriptionOptionalPlaceholder", R.string.DescriptionOptionalPlaceholder));
        this.descriptionTextView.setCursorColor(Theme.getColor(i4));
        this.descriptionTextView.setCursorSize(AndroidUtilities.dp(20.0f));
        this.descriptionTextView.setCursorWidth(1.5f);
        if (this.descriptionTextView.isEnabled()) {
            this.settingsContainer.addView(this.descriptionTextView, LayoutHelper.createLinear(-1, -2, 23.0f, 15.0f, 23.0f, 9.0f));
        } else {
            this.settingsContainer.addView(this.descriptionTextView, LayoutHelper.createLinear(-1, -2, 23.0f, 12.0f, 23.0f, 6.0f));
        }
        this.descriptionTextView.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda32
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i5, KeyEvent keyEvent) {
                boolean lambda$createView$9;
                lambda$createView$9 = ChatEditActivity.this.lambda$createView$9(textView, i5, keyEvent);
                return lambda$createView$9;
            }
        });
        this.descriptionTextView.addTextChangedListener(new TextWatcher(this) { // from class: org.telegram.ui.ChatEditActivity.8
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
            }
        });
        ShadowSectionCell shadowSectionCell = new ShadowSectionCell(context);
        this.settingsTopSectionCell = shadowSectionCell;
        linearLayout.addView(shadowSectionCell, LayoutHelper.createLinear(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.typeEditContainer = linearLayout5;
        linearLayout5.setOrientation(1);
        linearLayout.addView(this.typeEditContainer, LayoutHelper.createLinear(-1, -2));
        TLRPC$Chat tLRPC$Chat2 = this.currentChat;
        if (tLRPC$Chat2 != null) {
            if (tLRPC$Chat2.megagroup && ((tLRPC$ChatFull5 = this.info) == null || tLRPC$ChatFull5.can_set_location)) {
                TextCell textCell4 = new TextCell(context);
                this.locationCell = textCell4;
                textCell4.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                this.typeEditContainer.addView(this.locationCell, LayoutHelper.createLinear(-1, -2));
                this.locationCell.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda13
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        ChatEditActivity.this.lambda$createView$11(view2);
                    }
                });
            }
            if (this.currentChat.creator && ((tLRPC$ChatFull4 = this.info) == null || tLRPC$ChatFull4.can_set_username)) {
                TextCell textCell5 = new TextCell(context);
                this.typeCell = textCell5;
                textCell5.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                this.typeEditContainer.addView(this.typeCell, LayoutHelper.createLinear(-1, -2));
                this.typeCell.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda15
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        ChatEditActivity.this.lambda$createView$12(view2);
                    }
                });
            }
            if (ChatObject.isChannel(this.currentChat) && ((this.isChannel && ChatObject.canUserDoAdminAction(this.currentChat, 1)) || (!this.isChannel && ChatObject.canUserDoAdminAction(this.currentChat, 0)))) {
                TextCell textCell6 = new TextCell(context);
                this.linkedCell = textCell6;
                textCell6.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                this.typeEditContainer.addView(this.linkedCell, LayoutHelper.createLinear(-1, -2));
                this.linkedCell.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda24
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        ChatEditActivity.this.lambda$createView$13(view2);
                    }
                });
            }
            if (!this.isChannel && ChatObject.canBlockUsers(this.currentChat) && (ChatObject.isChannel(this.currentChat) || this.currentChat.creator)) {
                TextCell textCell7 = new TextCell(context);
                this.historyCell = textCell7;
                textCell7.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                this.typeEditContainer.addView(this.historyCell, LayoutHelper.createLinear(-1, -2));
                this.historyCell.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda28
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        ChatEditActivity.this.lambda$createView$15(context, view2);
                    }
                });
            }
            if (this.isChannel) {
                TextCell textCell8 = new TextCell(context, 23, false, true, null);
                this.signCell = textCell8;
                textCell8.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                this.signCell.setTextAndCheckAndIcon(LocaleController.getString("ChannelSignMessages", R.string.ChannelSignMessages), this.signMessages, R.drawable.msg_signed, false);
                this.typeEditContainer.addView(this.signCell, LayoutHelper.createFrame(-1, -2.0f));
                this.signCell.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda10
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        ChatEditActivity.this.lambda$createView$16(view2);
                    }
                });
            } else if (this.currentChat.creator) {
                TextCell textCell9 = new TextCell(context, 23, false, true, null);
                this.forumsCell = textCell9;
                textCell9.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                this.forumsCell.setTextAndCheckAndIcon(LocaleController.getString("ChannelTopics", R.string.ChannelTopics), this.forum, R.drawable.msg_topics, false);
                this.forumsCell.getCheckBox().setIcon(this.canForum ? 0 : R.drawable.permission_locked);
                this.typeEditContainer.addView(this.forumsCell, LayoutHelper.createFrame(-1, -2.0f));
                this.forumsCell.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda29
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        ChatEditActivity.this.lambda$createView$17(frameLayout, view2);
                    }
                });
            }
        }
        ActionBarMenu createMenu = this.actionBar.createMenu();
        if (this.currentUser != null || ChatObject.canChangeChatInfo(this.currentChat) || this.signCell != null || this.historyCell != null) {
            ActionBarMenuItem addItemWithWidth = createMenu.addItemWithWidth(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f));
            this.doneButton = addItemWithWidth;
            addItemWithWidth.setContentDescription(LocaleController.getString("Done", R.string.Done));
        }
        if (this.locationCell != null || this.signCell != null || this.historyCell != null || this.typeCell != null || this.linkedCell != null || this.forumsCell != null) {
            this.settingsSectionCell = new TextInfoPrivacyCell(context);
            CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(getThemedColor(i2)), Theme.getThemedDrawable(context, R.drawable.greydivider, Theme.getColor(Theme.key_windowBackgroundGrayShadow, getResourceProvider())), 0, 0);
            combinedDrawable.setFullsize(true);
            this.settingsSectionCell.setBackground(combinedDrawable);
            linearLayout.addView(this.settingsSectionCell, LayoutHelper.createLinear(-1, -2));
            if (this.forumsCell != null) {
                this.settingsSectionCell.setText(LocaleController.getString("ForumToggleDescription", R.string.ForumToggleDescription));
            } else {
                this.settingsSectionCell.setText(LocaleController.getString("ChannelSignMessagesInfo", R.string.ChannelSignMessagesInfo));
            }
        }
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.infoContainer = linearLayout6;
        linearLayout6.setOrientation(1);
        this.infoContainer.setBackgroundColor(Theme.getColor(i3));
        linearLayout.addView(this.infoContainer, LayoutHelper.createLinear(-1, -2));
        if (this.currentChat != null) {
            TextCell textCell10 = new TextCell(context);
            this.blockCell = textCell10;
            textCell10.setBackground(Theme.getSelectorDrawable(false));
            TextCell textCell11 = this.blockCell;
            if (!ChatObject.isChannel(this.currentChat)) {
                TLRPC$Chat tLRPC$Chat3 = this.currentChat;
                if (!tLRPC$Chat3.creator && (!ChatObject.hasAdminRights(tLRPC$Chat3) || !ChatObject.canChangeChatInfo(this.currentChat))) {
                    i = 8;
                    textCell11.setVisibility(i);
                    this.blockCell.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda18
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            ChatEditActivity.this.lambda$createView$18(view2);
                        }
                    });
                    TextCell textCell12 = new TextCell(context);
                    this.inviteLinksCell = textCell12;
                    textCell12.setBackground(Theme.getSelectorDrawable(false));
                    this.inviteLinksCell.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda27
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            ChatEditActivity.this.lambda$createView$19(view2);
                        }
                    });
                    TextCell textCell13 = new TextCell(context);
                    this.reactionsCell = textCell13;
                    textCell13.setBackground(Theme.getSelectorDrawable(false));
                    this.reactionsCell.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda21
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            ChatEditActivity.this.lambda$createView$20(view2);
                        }
                    });
                    TextCell textCell14 = new TextCell(context);
                    this.adminCell = textCell14;
                    textCell14.setBackground(Theme.getSelectorDrawable(false));
                    this.adminCell.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda16
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            ChatEditActivity.this.lambda$createView$21(view2);
                        }
                    });
                    TextCell textCell15 = new TextCell(context);
                    this.membersCell = textCell15;
                    textCell15.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                    this.membersCell.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda11
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            ChatEditActivity.this.lambda$createView$22(view2);
                        }
                    });
                    if (!ChatObject.isChannelAndNotMegaGroup(this.currentChat)) {
                        TextCell textCell16 = new TextCell(context);
                        this.memberRequestsCell = textCell16;
                        textCell16.setBackground(Theme.getSelectorDrawable(false));
                        this.memberRequestsCell.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda20
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                ChatEditActivity.this.lambda$createView$23(view2);
                            }
                        });
                    }
                    if (!ChatObject.isChannel(this.currentChat) || this.currentChat.gigagroup) {
                        TextCell textCell17 = new TextCell(context);
                        this.logCell = textCell17;
                        textCell17.setTextAndIcon(LocaleController.getString("EventLog", R.string.EventLog), R.drawable.msg_log, false);
                        this.logCell.setBackground(Theme.getSelectorDrawable(false));
                        this.logCell.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda9
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                ChatEditActivity.this.lambda$createView$24(view2);
                            }
                        });
                    }
                    this.infoContainer.addView(this.reactionsCell, LayoutHelper.createLinear(-1, -2));
                    if (!this.isChannel && !this.currentChat.gigagroup) {
                        this.infoContainer.addView(this.blockCell, LayoutHelper.createLinear(-1, -2));
                    }
                    if (!this.isChannel) {
                        this.infoContainer.addView(this.inviteLinksCell, LayoutHelper.createLinear(-1, -2));
                    }
                    this.infoContainer.addView(this.adminCell, LayoutHelper.createLinear(-1, -2));
                    this.infoContainer.addView(this.membersCell, LayoutHelper.createLinear(-1, -2));
                    textCell = this.memberRequestsCell;
                    if (textCell != null && (tLRPC$ChatFull3 = this.info) != null && tLRPC$ChatFull3.requests_pending > 0) {
                        this.infoContainer.addView(textCell, LayoutHelper.createLinear(-1, -2));
                    }
                    if (this.isChannel) {
                        this.infoContainer.addView(this.inviteLinksCell, LayoutHelper.createLinear(-1, -2));
                    }
                    if (!this.isChannel || this.currentChat.gigagroup) {
                        this.infoContainer.addView(this.blockCell, LayoutHelper.createLinear(-1, -2));
                    }
                    if (this.isChannel && (tLRPC$ChatFull2 = this.info) != null && tLRPC$ChatFull2.can_set_stickers) {
                        FrameLayout frameLayout2 = new FrameLayout(context);
                        this.stickersContainer = frameLayout2;
                        frameLayout2.setBackgroundColor(Theme.getColor(i3));
                        linearLayout.addView(this.stickersContainer, LayoutHelper.createLinear(-1, -2));
                        TextCell textCell18 = new TextCell(context);
                        this.stickersCell = textCell18;
                        textCell18.setBackground(Theme.getSelectorDrawable(false));
                        this.stickersCell.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda19
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                ChatEditActivity.this.lambda$createView$25(view2);
                            }
                        });
                        this.stickersCell.setPrioritizeTitleOverValue(true);
                        this.stickersContainer.addView(this.stickersCell, LayoutHelper.createFrame(-1, -2.0f));
                        this.stickersCell.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda26
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                ChatEditActivity.this.lambda$createView$26(view2);
                            }
                        });
                    } else {
                        textCell2 = this.logCell;
                        if (textCell2 != null) {
                            this.infoContainer.addView(textCell2, LayoutHelper.createLinear(-1, -2));
                        }
                    }
                }
            }
            i = 0;
            textCell11.setVisibility(i);
            this.blockCell.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda18
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ChatEditActivity.this.lambda$createView$18(view2);
                }
            });
            TextCell textCell122 = new TextCell(context);
            this.inviteLinksCell = textCell122;
            textCell122.setBackground(Theme.getSelectorDrawable(false));
            this.inviteLinksCell.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda27
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ChatEditActivity.this.lambda$createView$19(view2);
                }
            });
            TextCell textCell132 = new TextCell(context);
            this.reactionsCell = textCell132;
            textCell132.setBackground(Theme.getSelectorDrawable(false));
            this.reactionsCell.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda21
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ChatEditActivity.this.lambda$createView$20(view2);
                }
            });
            TextCell textCell142 = new TextCell(context);
            this.adminCell = textCell142;
            textCell142.setBackground(Theme.getSelectorDrawable(false));
            this.adminCell.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda16
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ChatEditActivity.this.lambda$createView$21(view2);
                }
            });
            TextCell textCell152 = new TextCell(context);
            this.membersCell = textCell152;
            textCell152.setBackgroundDrawable(Theme.getSelectorDrawable(false));
            this.membersCell.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda11
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ChatEditActivity.this.lambda$createView$22(view2);
                }
            });
            if (!ChatObject.isChannelAndNotMegaGroup(this.currentChat)) {
            }
            if (!ChatObject.isChannel(this.currentChat)) {
            }
            TextCell textCell172 = new TextCell(context);
            this.logCell = textCell172;
            textCell172.setTextAndIcon(LocaleController.getString("EventLog", R.string.EventLog), R.drawable.msg_log, false);
            this.logCell.setBackground(Theme.getSelectorDrawable(false));
            this.logCell.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ChatEditActivity.this.lambda$createView$24(view2);
                }
            });
            this.infoContainer.addView(this.reactionsCell, LayoutHelper.createLinear(-1, -2));
            if (!this.isChannel) {
                this.infoContainer.addView(this.blockCell, LayoutHelper.createLinear(-1, -2));
            }
            if (!this.isChannel) {
            }
            this.infoContainer.addView(this.adminCell, LayoutHelper.createLinear(-1, -2));
            this.infoContainer.addView(this.membersCell, LayoutHelper.createLinear(-1, -2));
            textCell = this.memberRequestsCell;
            if (textCell != null) {
                this.infoContainer.addView(textCell, LayoutHelper.createLinear(-1, -2));
            }
            if (this.isChannel) {
            }
            if (!this.isChannel) {
            }
            this.infoContainer.addView(this.blockCell, LayoutHelper.createLinear(-1, -2));
            if (this.isChannel) {
            }
            textCell2 = this.logCell;
            if (textCell2 != null) {
            }
        }
        if (this.currentUser != null) {
            TextCell textCell19 = new TextCell(context);
            this.publicLinkCell = textCell19;
            textCell19.setBackground(Theme.getSelectorDrawable(false));
            this.publicLinkCell.setPrioritizeTitleOverValue(true);
            this.infoContainer.addView(this.publicLinkCell, LayoutHelper.createLinear(-1, -2));
            this.publicLinkCell.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda23
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ChatEditActivity.this.lambda$createView$27(view2);
                }
            });
            updatePublicLinksCount();
            TextCell textCell20 = new TextCell(context);
            this.editIntroCell = textCell20;
            textCell20.setBackground(Theme.getSelectorDrawable(false));
            this.editIntroCell.setTextAndIcon(LocaleController.getString(R.string.BotEditIntro), R.drawable.msg_log, true);
            this.infoContainer.addView(this.editIntroCell, LayoutHelper.createLinear(-1, -2));
            this.editIntroCell.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda22
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ChatEditActivity.this.lambda$createView$28(view2);
                }
            });
            TextCell textCell21 = new TextCell(context);
            this.editCommandsCell = textCell21;
            textCell21.setBackground(Theme.getSelectorDrawable(false));
            this.editCommandsCell.setTextAndIcon(LocaleController.getString(R.string.BotEditCommands), R.drawable.msg_media, true);
            this.infoContainer.addView(this.editCommandsCell, LayoutHelper.createLinear(-1, -2));
            this.editCommandsCell.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda17
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ChatEditActivity.this.lambda$createView$29(view2);
                }
            });
            TextCell textCell22 = new TextCell(context);
            this.changeBotSettingsCell = textCell22;
            textCell22.setBackground(Theme.getSelectorDrawable(false));
            this.changeBotSettingsCell.setTextAndIcon(LocaleController.getString(R.string.BotChangeSettings), R.drawable.msg_bot, true);
            this.infoContainer.addView(this.changeBotSettingsCell, LayoutHelper.createLinear(-1, -2));
            this.changeBotSettingsCell.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ChatEditActivity.this.lambda$createView$30(view2);
                }
            });
        }
        TLRPC$Chat tLRPC$Chat4 = this.currentChat;
        if (tLRPC$Chat4 != null) {
            if (!ChatObject.hasAdminRights(tLRPC$Chat4)) {
                this.infoContainer.setVisibility(8);
                this.settingsTopSectionCell.setVisibility(8);
            }
            if (this.stickersCell == null) {
                ShadowSectionCell shadowSectionCell2 = new ShadowSectionCell(context);
                this.infoSectionCell = shadowSectionCell2;
                linearLayout.addView(shadowSectionCell2, LayoutHelper.createLinear(-1, -2));
            }
            if (!this.isChannel && (tLRPC$ChatFull = this.info) != null && tLRPC$ChatFull.can_set_stickers) {
                TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context);
                this.stickersInfoCell = textInfoPrivacyCell;
                textInfoPrivacyCell.setText(LocaleController.getString(R.string.GroupStickersInfo));
                linearLayout.addView(this.stickersInfoCell, LayoutHelper.createLinear(-1, -2));
            }
        } else {
            this.botInfoCell = new TextInfoPrivacyCell(context);
            String string = LocaleController.getString(R.string.BotManageInfo);
            SpannableString valueOf = SpannableString.valueOf(string);
            int indexOf = string.indexOf("@BotFather");
            if (indexOf != -1) {
                valueOf.setSpan(new ClickableSpan(this) { // from class: org.telegram.ui.ChatEditActivity.9
                    @Override // android.text.style.ClickableSpan
                    public void onClick(View view2) {
                        Browser.openUrl(view2.getContext(), "https://t.me/BotFather");
                    }

                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public void updateDrawState(TextPaint textPaint) {
                        super.updateDrawState(textPaint);
                        textPaint.setUnderlineText(false);
                    }
                }, indexOf, indexOf + 10, 33);
            }
            this.botInfoCell.setBackground(Theme.getThemedDrawableByKey(getContext(), R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
            this.botInfoCell.setText(valueOf);
            linearLayout.addView(this.botInfoCell, LayoutHelper.createLinear(-1, -2));
        }
        if (this.currentUser == null && this.currentChat.creator) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.deleteContainer = frameLayout3;
            frameLayout3.setBackgroundColor(Theme.getColor(i3));
            linearLayout.addView(this.deleteContainer, LayoutHelper.createLinear(-1, -2));
            TextSettingsCell textSettingsCell = new TextSettingsCell(context);
            this.deleteCell = textSettingsCell;
            textSettingsCell.setTextColor(Theme.getColor(Theme.key_text_RedRegular));
            this.deleteCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
            if (this.currentUser != null) {
                this.deleteCell.setText(LocaleController.getString(R.string.DeleteBot), false);
            } else if (this.isChannel) {
                this.deleteCell.setText(LocaleController.getString("ChannelDelete", R.string.ChannelDelete), false);
            } else {
                this.deleteCell.setText(LocaleController.getString("DeleteAndExitButton", R.string.DeleteAndExitButton), false);
            }
            this.deleteContainer.addView(this.deleteCell, LayoutHelper.createFrame(-1, -2.0f));
            this.deleteCell.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda12
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ChatEditActivity.this.lambda$createView$32(view2);
                }
            });
            ShadowSectionCell shadowSectionCell3 = new ShadowSectionCell(context);
            this.deleteInfoCell = shadowSectionCell3;
            shadowSectionCell3.setBackground(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
            linearLayout.addView(this.deleteInfoCell, LayoutHelper.createLinear(-1, -2));
        }
        TextInfoPrivacyCell textInfoPrivacyCell2 = this.stickersInfoCell;
        if (textInfoPrivacyCell2 != null) {
            if (this.deleteInfoCell == null) {
                textInfoPrivacyCell2.setBackground(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
            } else {
                textInfoPrivacyCell2.setBackground(Theme.getThemedDrawableByKey(context, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
            }
        }
        UndoView undoView = new UndoView(context);
        this.undoView = undoView;
        sizeNotifierFrameLayout.addView(undoView, LayoutHelper.createFrame(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        EditTextEmoji editTextEmoji6 = this.nameTextView;
        TLRPC$User tLRPC$User = this.currentUser;
        editTextEmoji6.setText(Emoji.replaceEmoji(tLRPC$User != null ? ContactsController.formatName(tLRPC$User) : this.currentChat.title, this.nameTextView.getEditText().getPaint().getFontMetricsInt(), AndroidUtilities.dp(16.0f), true));
        EditTextEmoji editTextEmoji7 = this.nameTextView;
        editTextEmoji7.setSelection(editTextEmoji7.length());
        TLRPC$ChatFull tLRPC$ChatFull6 = this.info;
        if (tLRPC$ChatFull6 != null) {
            this.descriptionTextView.setText(tLRPC$ChatFull6.about);
        } else {
            TLRPC$UserFull tLRPC$UserFull = this.userInfo;
            if (tLRPC$UserFull != null) {
                this.descriptionTextView.setText(tLRPC$UserFull.about);
            }
        }
        setAvatar();
        updateFields(true, false);
        return this.fragmentView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$3(View view) {
        if (this.imageUpdater.isUploadingImage()) {
            return;
        }
        ImageLocation imageLocation = null;
        TLRPC$User user = this.userId == 0 ? null : getMessagesController().getUser(Long.valueOf(this.userId));
        if (user != null) {
            TLRPC$UserProfilePhoto tLRPC$UserProfilePhoto = user.photo;
            if (tLRPC$UserProfilePhoto == null || tLRPC$UserProfilePhoto.photo_big == null) {
                return;
            }
            PhotoViewer.getInstance().setParentActivity(this);
            TLRPC$UserProfilePhoto tLRPC$UserProfilePhoto2 = user.photo;
            int i = tLRPC$UserProfilePhoto2.dc_id;
            if (i != 0) {
                tLRPC$UserProfilePhoto2.photo_big.dc_id = i;
            }
            PhotoViewer.getInstance().openPhoto(user.photo.photo_big, this.provider);
            return;
        }
        TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
        TLRPC$ChatPhoto tLRPC$ChatPhoto = chat.photo;
        if (tLRPC$ChatPhoto == null || tLRPC$ChatPhoto.photo_big == null) {
            return;
        }
        PhotoViewer.getInstance().setParentActivity(this);
        TLRPC$ChatPhoto tLRPC$ChatPhoto2 = chat.photo;
        int i2 = tLRPC$ChatPhoto2.dc_id;
        if (i2 != 0) {
            tLRPC$ChatPhoto2.photo_big.dc_id = i2;
        }
        TLRPC$ChatFull tLRPC$ChatFull = this.info;
        if (tLRPC$ChatFull != null) {
            TLRPC$Photo tLRPC$Photo = tLRPC$ChatFull.chat_photo;
            if ((tLRPC$Photo instanceof TLRPC$TL_photo) && !tLRPC$Photo.video_sizes.isEmpty()) {
                imageLocation = ImageLocation.getForPhoto(this.info.chat_photo.video_sizes.get(0), this.info.chat_photo);
            }
        }
        PhotoViewer.getInstance().openPhotoWithVideo(chat.photo.photo_big, imageLocation, this.provider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$8(View view) {
        this.imageUpdater.openMenu(this.avatar != null, new Runnable() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda33
            @Override // java.lang.Runnable
            public final void run() {
                ChatEditActivity.this.lambda$createView$6();
            }
        }, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda7
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ChatEditActivity.this.lambda$createView$7(dialogInterface);
            }
        }, 0);
        this.cameraDrawable.setCurrentFrame(0);
        this.cameraDrawable.setCustomEndFrame(43);
        this.setAvatarCell.imageView.playAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$6() {
        this.avatar = null;
        if (this.userId == 0) {
            MessagesController.getInstance(this.currentAccount).changeChatAvatar(this.chatId, null, null, null, null, 0.0d, null, null, null, null);
        } else {
            TLRPC$TL_photos_updateProfilePhoto tLRPC$TL_photos_updateProfilePhoto = new TLRPC$TL_photos_updateProfilePhoto();
            tLRPC$TL_photos_updateProfilePhoto.bot = getMessagesController().getInputUser(this.userId);
            tLRPC$TL_photos_updateProfilePhoto.flags |= 2;
            tLRPC$TL_photos_updateProfilePhoto.id = new TLRPC$TL_inputPhotoEmpty();
            getConnectionsManager().sendRequest(tLRPC$TL_photos_updateProfilePhoto, new RequestDelegate() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda41
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    ChatEditActivity.this.lambda$createView$5(tLObject, tLRPC$TL_error);
                }
            });
        }
        showAvatarProgress(false, true);
        BackupImageView backupImageView = this.avatarImage;
        AvatarDrawable avatarDrawable = this.avatarDrawable;
        Object obj = this.currentUser;
        if (obj == null) {
            obj = this.currentChat;
        }
        backupImageView.setImage((ImageLocation) null, (String) null, avatarDrawable, obj);
        this.cameraDrawable.setCurrentFrame(0);
        this.setAvatarCell.imageView.playAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$5(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda34
            @Override // java.lang.Runnable
            public final void run() {
                ChatEditActivity.this.lambda$createView$4();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$4() {
        this.avatarImage.setImageDrawable(this.avatarDrawable);
        this.setAvatarCell.setTextAndIcon(LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), R.drawable.msg_addphoto, true);
        TLRPC$User tLRPC$User = this.currentUser;
        if (tLRPC$User != null) {
            tLRPC$User.photo = null;
            getMessagesController().putUser(this.currentUser, true);
        }
        this.hasUploadedPhoto = true;
        if (this.cameraDrawable == null) {
            int i = R.raw.camera_outline;
            this.cameraDrawable = new RLottieDrawable(i, "" + i, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
        }
        this.setAvatarCell.imageView.setTranslationX(-AndroidUtilities.dp(8.0f));
        this.setAvatarCell.imageView.setAnimation(this.cameraDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$7(DialogInterface dialogInterface) {
        if (!this.imageUpdater.isUploadingImage()) {
            this.cameraDrawable.setCustomEndFrame(86);
            this.setAvatarCell.imageView.playAnimation();
            return;
        }
        this.cameraDrawable.setCurrentFrame(0, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$createView$9(TextView textView, int i, KeyEvent keyEvent) {
        View view;
        if (i != 6 || (view = this.doneButton) == null) {
            return false;
        }
        view.performClick();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$11(View view) {
        if (AndroidUtilities.isMapsInstalled(this)) {
            LocationActivity locationActivity = new LocationActivity(4);
            locationActivity.setDialogId(-this.chatId);
            TLRPC$ChatFull tLRPC$ChatFull = this.info;
            if (tLRPC$ChatFull != null) {
                TLRPC$ChannelLocation tLRPC$ChannelLocation = tLRPC$ChatFull.location;
                if (tLRPC$ChannelLocation instanceof TLRPC$TL_channelLocation) {
                    locationActivity.setInitialLocation((TLRPC$TL_channelLocation) tLRPC$ChannelLocation);
                }
            }
            locationActivity.setDelegate(new LocationActivity.LocationActivityDelegate() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda46
                @Override // org.telegram.ui.LocationActivity.LocationActivityDelegate
                public final void didSelectLocation(TLRPC$MessageMedia tLRPC$MessageMedia, int i, boolean z, int i2) {
                    ChatEditActivity.this.lambda$createView$10(tLRPC$MessageMedia, i, z, i2);
                }
            });
            presentFragment(locationActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$10(TLRPC$MessageMedia tLRPC$MessageMedia, int i, boolean z, int i2) {
        TLRPC$TL_channelLocation tLRPC$TL_channelLocation = new TLRPC$TL_channelLocation();
        tLRPC$TL_channelLocation.address = tLRPC$MessageMedia.address;
        tLRPC$TL_channelLocation.geo_point = tLRPC$MessageMedia.geo;
        TLRPC$ChatFull tLRPC$ChatFull = this.info;
        tLRPC$ChatFull.location = tLRPC$TL_channelLocation;
        tLRPC$ChatFull.flags |= LiteMode.FLAG_CHAT_SCALE;
        updateFields(false, true);
        getMessagesController().loadFullChat(this.chatId, 0, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$12(View view) {
        long j = this.chatId;
        TextCell textCell = this.locationCell;
        ChatEditTypeActivity chatEditTypeActivity = new ChatEditTypeActivity(j, textCell != null && textCell.getVisibility() == 0);
        chatEditTypeActivity.setInfo(this.info);
        presentFragment(chatEditTypeActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$13(View view) {
        ChatLinkActivity chatLinkActivity = new ChatLinkActivity(this.chatId);
        chatLinkActivity.setInfo(this.info);
        presentFragment(chatLinkActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$15(Context context, View view) {
        final BottomSheet.Builder builder = new BottomSheet.Builder(context);
        builder.setApplyTopPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        HeaderCell headerCell = new HeaderCell(context, Theme.key_dialogTextBlue2, 23, 15, false);
        headerCell.setHeight(47);
        headerCell.setText(LocaleController.getString("ChatHistory", R.string.ChatHistory));
        linearLayout.addView(headerCell);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2));
        final RadioButtonCell[] radioButtonCellArr = new RadioButtonCell[2];
        for (int i = 0; i < 2; i++) {
            radioButtonCellArr[i] = new RadioButtonCell(context, true);
            radioButtonCellArr[i].setTag(Integer.valueOf(i));
            radioButtonCellArr[i].setBackgroundDrawable(Theme.getSelectorDrawable(false));
            if (i == 0) {
                radioButtonCellArr[i].setTextAndValue(LocaleController.getString("ChatHistoryVisible", R.string.ChatHistoryVisible), LocaleController.getString("ChatHistoryVisibleInfo", R.string.ChatHistoryVisibleInfo), true, !this.historyHidden);
            } else if (ChatObject.isChannel(this.currentChat)) {
                radioButtonCellArr[i].setTextAndValue(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo", R.string.ChatHistoryHiddenInfo), false, this.historyHidden);
            } else {
                radioButtonCellArr[i].setTextAndValue(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo2", R.string.ChatHistoryHiddenInfo2), false, this.historyHidden);
            }
            linearLayout2.addView(radioButtonCellArr[i], LayoutHelper.createLinear(-1, -2));
            radioButtonCellArr[i].setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ChatEditActivity.this.lambda$createView$14(radioButtonCellArr, builder, view2);
                }
            });
        }
        builder.setCustomView(linearLayout);
        showDialog(builder.create());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$14(RadioButtonCell[] radioButtonCellArr, BottomSheet.Builder builder, View view) {
        Integer num = (Integer) view.getTag();
        radioButtonCellArr[0].setChecked(num.intValue() == 0, true);
        radioButtonCellArr[1].setChecked(num.intValue() == 1, true);
        this.historyHidden = num.intValue() == 1;
        builder.getDismissRunnable().run();
        updateFields(true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$16(View view) {
        boolean z = !this.signMessages;
        this.signMessages = z;
        ((TextCell) view).setChecked(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$17(FrameLayout frameLayout, View view) {
        SpannableStringBuilder replaceTags;
        if (!this.canForum) {
            TLRPC$ChatFull tLRPC$ChatFull = this.info;
            if (tLRPC$ChatFull != null && tLRPC$ChatFull.linked_chat_id != 0) {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.getString("ChannelTopicsDiscussionForbidden", R.string.ChannelTopicsDiscussionForbidden));
            } else {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("ChannelTopicsForbidden", getMessagesController().forumUpgradeParticipantsMin, new Object[0]));
            }
            BulletinFactory.of(this).createSimpleBulletin(R.raw.topics, replaceTags).show();
            frameLayout.performHapticFeedback(3);
            return;
        }
        boolean z = !this.forum;
        this.forum = z;
        this.avatarImage.animateToRoundRadius(AndroidUtilities.dp(z ? 16.0f : 32.0f));
        ((TextCell) view).setChecked(this.forum);
        updateFields(false, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$18(View view) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.chatId);
        bundle.putInt("type", (this.isChannel || this.currentChat.gigagroup) ? 0 : 3);
        ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
        chatUsersActivity.setInfo(this.info);
        presentFragment(chatUsersActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$19(View view) {
        ManageLinksActivity manageLinksActivity = new ManageLinksActivity(this.chatId, 0L, 0);
        TLRPC$ChatFull tLRPC$ChatFull = this.info;
        manageLinksActivity.setInfo(tLRPC$ChatFull, tLRPC$ChatFull.exported_invite);
        presentFragment(manageLinksActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$20(View view) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.chatId);
        ChatReactionsEditActivity chatReactionsEditActivity = new ChatReactionsEditActivity(bundle);
        chatReactionsEditActivity.setInfo(this.info);
        presentFragment(chatReactionsEditActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$21(View view) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.chatId);
        bundle.putInt("type", 1);
        ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
        chatUsersActivity.setInfo(this.info);
        presentFragment(chatUsersActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$22(View view) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.chatId);
        bundle.putInt("type", 2);
        ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
        chatUsersActivity.setInfo(this.info);
        presentFragment(chatUsersActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$23(View view) {
        presentFragment(new MemberRequestsActivity(this.chatId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$24(View view) {
        presentFragment(new ChannelAdminLogActivity(this.currentChat));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$25(View view) {
        presentFragment(new ChannelAdminLogActivity(this.currentChat));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$26(View view) {
        GroupStickersActivity groupStickersActivity = new GroupStickersActivity(this.currentChat.id);
        groupStickersActivity.setInfo(this.info);
        presentFragment(groupStickersActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$27(View view) {
        Bundle bundle = new Bundle();
        bundle.putLong("bot_id", this.userId);
        presentFragment(new ChangeUsernameActivity(bundle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$28(View view) {
        Context context = view.getContext();
        Browser.openUrl(context, "https://t.me/BotFather?start=" + getActiveUsername(this.currentUser) + "-intro");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$29(View view) {
        Context context = view.getContext();
        Browser.openUrl(context, "https://t.me/BotFather?start=" + getActiveUsername(this.currentUser) + "-commands");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$30(View view) {
        Context context = view.getContext();
        Browser.openUrl(context, "https://t.me/BotFather?start=" + getActiveUsername(this.currentUser));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$32(View view) {
        AlertsCreator.createClearOrDeleteDialogAlert(this, false, true, false, this.currentChat, null, false, true, false, new MessagesStorage.BooleanCallback() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda39
            @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
            public final void run(boolean z) {
                ChatEditActivity.this.lambda$createView$31(z);
            }
        }, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$31(boolean z) {
        if (AndroidUtilities.isTablet()) {
            getNotificationCenter().postNotificationName(NotificationCenter.closeChats, Long.valueOf(-this.chatId));
        } else {
            getNotificationCenter().postNotificationName(NotificationCenter.closeChats, new Object[0]);
        }
        finishFragment();
        getNotificationCenter().postNotificationName(NotificationCenter.needDeleteDialog, Long.valueOf(-this.currentChat.id), null, this.currentChat, Boolean.valueOf(z));
    }

    private void updatePublicLinksCount() {
        if (this.publicLinkCell == null) {
            return;
        }
        if (this.currentUser.usernames.size() > 1) {
            Iterator<TLRPC$TL_username> it = this.currentUser.usernames.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (it.next().active) {
                    i++;
                }
            }
            this.publicLinkCell.setTextAndValueAndIcon(LocaleController.getString(R.string.BotPublicLinks), LocaleController.formatString(R.string.BotPublicLinksCount, Integer.valueOf(i), Integer.valueOf(this.currentUser.usernames.size())), R.drawable.msg_link2, true);
            return;
        }
        TextCell textCell = this.publicLinkCell;
        String string = LocaleController.getString(R.string.BotPublicLink);
        textCell.setTextAndValueAndIcon(string, "t.me/" + this.currentUser.username, R.drawable.msg_link2, true);
    }

    private String getActiveUsername(TLRPC$User tLRPC$User) {
        String str = tLRPC$User.username;
        if (str != null) {
            return str;
        }
        Iterator<TLRPC$TL_username> it = tLRPC$User.usernames.iterator();
        while (it.hasNext()) {
            TLRPC$TL_username next = it.next();
            if (next.active) {
                return next.username;
            }
        }
        return null;
    }

    private void setAvatar() {
        if (this.avatarImage == null || this.hasUploadedPhoto) {
            return;
        }
        TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
        TLRPC$User user = this.userId == 0 ? null : getMessagesController().getUser(Long.valueOf(this.userId));
        if (chat == null && user == null) {
            return;
        }
        this.currentUser = user;
        this.currentChat = chat;
        boolean z = false;
        if (user == null ? chat.photo != null : user.photo != null) {
            TLRPC$Chat tLRPC$Chat = user != null ? user : chat;
            this.avatar = user != null ? user.photo.photo_small : chat.photo.photo_small;
            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(tLRPC$Chat, 1);
            this.avatarImage.setForUserOrChat(tLRPC$Chat, this.avatarDrawable);
            if (forUserOrChat != null) {
                z = true;
            }
        } else {
            this.avatarImage.setImageDrawable(this.avatarDrawable);
        }
        if (this.setAvatarCell != null) {
            if (z || this.imageUpdater.isUploadingImage()) {
                this.setAvatarCell.setTextAndIcon(LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), R.drawable.msg_addphoto, true);
            } else {
                this.setAvatarCell.setTextAndIcon(LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), R.drawable.msg_addphoto, true);
            }
            if (this.cameraDrawable == null) {
                int i = R.raw.camera_outline;
                this.cameraDrawable = new RLottieDrawable(i, "" + i, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            }
            this.setAvatarCell.imageView.setTranslationX(-AndroidUtilities.dp(8.0f));
            this.setAvatarCell.imageView.setAnimation(this.cameraDrawable);
        }
        if (PhotoViewer.hasInstance() && PhotoViewer.getInstance().isVisible()) {
            PhotoViewer.getInstance().checkCurrentImageVisibility();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (java.lang.Math.max(r0 == null ? 0 : r0.participants_count, r6.currentChat.participants_count) >= getMessagesController().forumUpgradeParticipantsMin) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void updateCanForum() {
        boolean z;
        TextCell textCell;
        if (this.userId != 0) {
            this.canForum = false;
            return;
        }
        if (!this.forum) {
            TLRPC$ChatFull tLRPC$ChatFull = this.info;
        }
        TLRPC$ChatFull tLRPC$ChatFull2 = this.info;
        if (tLRPC$ChatFull2 == null || tLRPC$ChatFull2.linked_chat_id == 0) {
            z = true;
            this.canForum = z;
            textCell = this.forumsCell;
            if (textCell == null) {
                textCell.getCheckBox().setIcon(this.canForum ? 0 : R.drawable.permission_locked);
                return;
            }
            return;
        }
        z = false;
        this.canForum = z;
        textCell = this.forumsCell;
        if (textCell == null) {
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        EditTextBoldCursor editTextBoldCursor;
        boolean z = true;
        if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC$ChatFull tLRPC$ChatFull = (TLRPC$ChatFull) objArr[0];
            if (tLRPC$ChatFull.id == this.chatId) {
                if (this.info == null && (editTextBoldCursor = this.descriptionTextView) != null) {
                    editTextBoldCursor.setText(tLRPC$ChatFull.about);
                }
                boolean z2 = this.info == null;
                this.info = tLRPC$ChatFull;
                updateCanForum();
                if (ChatObject.isChannel(this.currentChat) && !this.info.hidden_prehistory) {
                    z = false;
                }
                this.historyHidden = z;
                updateFields(false, false);
                if (z2) {
                    loadLinksCount();
                }
            }
        } else if (i == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0) {
                setAvatar();
            }
            if ((intValue & MessagesController.UPDATE_MASK_NAME) != 0) {
                updatePublicLinksCount();
            }
        } else if (i == NotificationCenter.chatAvailableReactionsUpdated) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue == this.chatId) {
                TLRPC$ChatFull chatFull = getMessagesController().getChatFull(longValue);
                this.info = chatFull;
                if (chatFull != null) {
                    this.availableReactions = chatFull.available_reactions;
                }
                updateReactionsCell(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.ImageUpdater.ImageUpdaterDelegate
    public void onUploadProgressChanged(float f) {
        RadialProgressView radialProgressView = this.avatarProgressView;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f);
    }

    @Override // org.telegram.ui.Components.ImageUpdater.ImageUpdaterDelegate
    public void didStartUpload(boolean z) {
        RadialProgressView radialProgressView = this.avatarProgressView;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.ImageUpdater.ImageUpdaterDelegate
    public void didUploadPhoto(final TLRPC$InputFile tLRPC$InputFile, final TLRPC$InputFile tLRPC$InputFile2, final double d, final String str, final TLRPC$PhotoSize tLRPC$PhotoSize, final TLRPC$PhotoSize tLRPC$PhotoSize2, boolean z, final TLRPC$VideoSize tLRPC$VideoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda37
            @Override // java.lang.Runnable
            public final void run() {
                ChatEditActivity.this.lambda$didUploadPhoto$35(tLRPC$PhotoSize2, tLRPC$InputFile, tLRPC$InputFile2, tLRPC$VideoSize, tLRPC$PhotoSize, d, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$didUploadPhoto$35(TLRPC$PhotoSize tLRPC$PhotoSize, TLRPC$InputFile tLRPC$InputFile, TLRPC$InputFile tLRPC$InputFile2, TLRPC$VideoSize tLRPC$VideoSize, TLRPC$PhotoSize tLRPC$PhotoSize2, double d, String str) {
        TLRPC$FileLocation tLRPC$FileLocation = tLRPC$PhotoSize.location;
        this.avatar = tLRPC$FileLocation;
        if (tLRPC$InputFile != null || tLRPC$InputFile2 != null || tLRPC$VideoSize != null) {
            long j = 0;
            if (this.userId != 0) {
                TLRPC$User tLRPC$User = this.currentUser;
                if (tLRPC$User != null) {
                    tLRPC$User.photo = new TLRPC$TL_userProfilePhoto();
                    TLRPC$UserProfilePhoto tLRPC$UserProfilePhoto = this.currentUser.photo;
                    if (tLRPC$InputFile != null) {
                        j = tLRPC$InputFile.id;
                    } else if (tLRPC$InputFile2 != null) {
                        j = tLRPC$InputFile2.id;
                    }
                    tLRPC$UserProfilePhoto.photo_id = j;
                    tLRPC$UserProfilePhoto.photo_big = tLRPC$PhotoSize2.location;
                    tLRPC$UserProfilePhoto.photo_small = tLRPC$PhotoSize.location;
                    getMessagesController().putUser(this.currentUser, true);
                }
                TLRPC$TL_photos_uploadProfilePhoto tLRPC$TL_photos_uploadProfilePhoto = new TLRPC$TL_photos_uploadProfilePhoto();
                if (tLRPC$InputFile != null) {
                    tLRPC$TL_photos_uploadProfilePhoto.file = tLRPC$InputFile;
                    tLRPC$TL_photos_uploadProfilePhoto.flags |= 1;
                }
                if (tLRPC$InputFile2 != null) {
                    tLRPC$TL_photos_uploadProfilePhoto.video = tLRPC$InputFile2;
                    int i = tLRPC$TL_photos_uploadProfilePhoto.flags | 2;
                    tLRPC$TL_photos_uploadProfilePhoto.flags = i;
                    tLRPC$TL_photos_uploadProfilePhoto.video_start_ts = d;
                    tLRPC$TL_photos_uploadProfilePhoto.flags = i | 4;
                }
                if (tLRPC$VideoSize != null) {
                    tLRPC$TL_photos_uploadProfilePhoto.video_emoji_markup = tLRPC$VideoSize;
                    tLRPC$TL_photos_uploadProfilePhoto.flags |= 16;
                }
                tLRPC$TL_photos_uploadProfilePhoto.bot = getMessagesController().getInputUser(this.currentUser);
                tLRPC$TL_photos_uploadProfilePhoto.flags |= 32;
                getConnectionsManager().sendRequest(tLRPC$TL_photos_uploadProfilePhoto, new RequestDelegate() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda43
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        ChatEditActivity.this.lambda$didUploadPhoto$34(tLObject, tLRPC$TL_error);
                    }
                });
            } else {
                getMessagesController().changeChatAvatar(this.chatId, null, tLRPC$InputFile, tLRPC$InputFile2, tLRPC$VideoSize, d, str, tLRPC$PhotoSize.location, tLRPC$PhotoSize2.location, null);
            }
            if (this.createAfterUpload) {
                try {
                    AlertDialog alertDialog = this.progressDialog;
                    if (alertDialog != null && alertDialog.isShowing()) {
                        this.progressDialog.dismiss();
                        this.progressDialog = null;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                this.donePressed = false;
                this.doneButton.performClick();
            }
            showAvatarProgress(false, true);
            return;
        }
        BackupImageView backupImageView = this.avatarImage;
        ImageLocation forLocal = ImageLocation.getForLocal(tLRPC$FileLocation);
        AvatarDrawable avatarDrawable = this.avatarDrawable;
        Object obj = this.currentUser;
        if (obj == null) {
            obj = this.currentChat;
        }
        backupImageView.setImage(forLocal, "50_50", avatarDrawable, obj);
        this.setAvatarCell.setTextAndIcon(LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), R.drawable.msg_addphoto, true);
        if (this.cameraDrawable == null) {
            int i2 = R.raw.camera_outline;
            this.cameraDrawable = new RLottieDrawable(i2, "" + i2, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
        }
        this.setAvatarCell.imageView.setTranslationX(-AndroidUtilities.dp(8.0f));
        this.setAvatarCell.imageView.setAnimation(this.cameraDrawable);
        showAvatarProgress(true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$didUploadPhoto$34(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda35
            @Override // java.lang.Runnable
            public final void run() {
                ChatEditActivity.this.lambda$didUploadPhoto$33();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$didUploadPhoto$33() {
        this.hasUploadedPhoto = true;
        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
    }

    @Override // org.telegram.ui.Components.ImageUpdater.ImageUpdaterDelegate
    public String getInitialSearchString() {
        return this.nameTextView.getText().toString();
    }

    public void showConvertTooltip() {
        this.undoView.showWithAction(0L, 76, (Runnable) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkDiscard() {
        EditTextEmoji editTextEmoji;
        EditTextBoldCursor editTextBoldCursor;
        String str;
        EditTextBoldCursor editTextBoldCursor2;
        String str2;
        String str3 = "";
        if (this.userId != 0) {
            TLRPC$UserFull tLRPC$UserFull = this.userInfo;
            if (tLRPC$UserFull != null && (str2 = tLRPC$UserFull.about) != null) {
                str3 = str2;
            }
            EditTextEmoji editTextEmoji2 = this.nameTextView;
            if ((editTextEmoji2 == null || this.currentUser.first_name.equals(editTextEmoji2.getText().toString())) && ((editTextBoldCursor2 = this.descriptionTextView) == null || str3.equals(editTextBoldCursor2.getText().toString()))) {
                return true;
            }
            showDialog(new AlertDialog.Builder(getParentActivity()).setTitle(LocaleController.getString("UserRestrictionsApplyChanges", R.string.UserRestrictionsApplyChanges)).setMessage(LocaleController.getString(R.string.BotSettingsChangedAlert)).setPositiveButton(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda3
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ChatEditActivity.this.lambda$checkDiscard$36(dialogInterface, i);
                }
            }).setNegativeButton(LocaleController.getString("PassportDiscard", R.string.PassportDiscard), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda6
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ChatEditActivity.this.lambda$checkDiscard$37(dialogInterface, i);
                }
            }).create());
            return false;
        }
        TLRPC$ChatFull tLRPC$ChatFull = this.info;
        if (tLRPC$ChatFull != null && (str = tLRPC$ChatFull.about) != null) {
            str3 = str;
        }
        if ((tLRPC$ChatFull == null || !ChatObject.isChannel(this.currentChat) || this.info.hidden_prehistory == this.historyHidden) && (((editTextEmoji = this.nameTextView) == null || this.currentChat.title.equals(editTextEmoji.getText().toString())) && ((editTextBoldCursor = this.descriptionTextView) == null || str3.equals(editTextBoldCursor.getText().toString())))) {
            boolean z = this.signMessages;
            TLRPC$Chat tLRPC$Chat = this.currentChat;
            if (z == tLRPC$Chat.signatures && this.forum == tLRPC$Chat.forum) {
                return true;
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle(LocaleController.getString("UserRestrictionsApplyChanges", R.string.UserRestrictionsApplyChanges));
        if (this.isChannel) {
            builder.setMessage(LocaleController.getString("ChannelSettingsChangedAlert", R.string.ChannelSettingsChangedAlert));
        } else {
            builder.setMessage(LocaleController.getString("GroupSettingsChangedAlert", R.string.GroupSettingsChangedAlert));
        }
        builder.setPositiveButton(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ChatEditActivity.this.lambda$checkDiscard$38(dialogInterface, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString("PassportDiscard", R.string.PassportDiscard), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ChatEditActivity.this.lambda$checkDiscard$39(dialogInterface, i);
            }
        });
        showDialog(builder.create());
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkDiscard$36(DialogInterface dialogInterface, int i) {
        processDone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkDiscard$37(DialogInterface dialogInterface, int i) {
        finishFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkDiscard$38(DialogInterface dialogInterface, int i) {
        processDone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkDiscard$39(DialogInterface dialogInterface, int i) {
        finishFragment();
    }

    private int getAdminCount() {
        TLRPC$ChatFull tLRPC$ChatFull = this.info;
        if (tLRPC$ChatFull == null) {
            return 1;
        }
        int size = tLRPC$ChatFull.participants.participants.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            TLRPC$ChatParticipant tLRPC$ChatParticipant = this.info.participants.participants.get(i2);
            if ((tLRPC$ChatParticipant instanceof TLRPC$TL_chatParticipantAdmin) || (tLRPC$ChatParticipant instanceof TLRPC$TL_chatParticipantCreator)) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processDone() {
        EditTextEmoji editTextEmoji;
        String str;
        String str2;
        if (this.donePressed || (editTextEmoji = this.nameTextView) == null) {
            return;
        }
        if (editTextEmoji.length() == 0) {
            Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            AndroidUtilities.shakeView(this.nameTextView);
            return;
        }
        this.donePressed = true;
        String str3 = "";
        if (this.currentUser != null) {
            final TLRPC$TL_bots_setBotInfo tLRPC$TL_bots_setBotInfo = new TLRPC$TL_bots_setBotInfo();
            tLRPC$TL_bots_setBotInfo.bot = getMessagesController().getInputUser(this.currentUser);
            tLRPC$TL_bots_setBotInfo.flags |= 4;
            tLRPC$TL_bots_setBotInfo.lang_code = "";
            if (!this.currentUser.first_name.equals(this.nameTextView.getText().toString())) {
                tLRPC$TL_bots_setBotInfo.name = this.nameTextView.getText().toString();
                tLRPC$TL_bots_setBotInfo.flags |= 8;
            }
            TLRPC$UserFull tLRPC$UserFull = this.userInfo;
            if (tLRPC$UserFull != null && (str2 = tLRPC$UserFull.about) != null) {
                str3 = str2;
            }
            EditTextBoldCursor editTextBoldCursor = this.descriptionTextView;
            if (editTextBoldCursor != null && !str3.equals(editTextBoldCursor.getText().toString())) {
                tLRPC$TL_bots_setBotInfo.about = this.descriptionTextView.getText().toString();
                tLRPC$TL_bots_setBotInfo.flags = 1 | tLRPC$TL_bots_setBotInfo.flags;
            }
            this.progressDialog = new AlertDialog(getParentActivity(), 3);
            final int sendRequest = getConnectionsManager().sendRequest(tLRPC$TL_bots_setBotInfo, new RequestDelegate() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda44
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    ChatEditActivity.this.lambda$processDone$41(tLRPC$TL_bots_setBotInfo, tLObject, tLRPC$TL_error);
                }
            });
            this.progressDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda2
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    ChatEditActivity.this.lambda$processDone$42(sendRequest, dialogInterface);
                }
            });
            this.progressDialog.show();
        } else if (!ChatObject.isChannel(this.currentChat) && (!this.historyHidden || this.forum)) {
            getMessagesController().convertToMegaGroup(getParentActivity(), this.chatId, this, new MessagesStorage.LongCallback() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda40
                @Override // org.telegram.messenger.MessagesStorage.LongCallback
                public final void run(long j) {
                    ChatEditActivity.this.lambda$processDone$43(j);
                }
            });
        } else {
            if (this.info != null && ChatObject.isChannel(this.currentChat)) {
                TLRPC$ChatFull tLRPC$ChatFull = this.info;
                boolean z = tLRPC$ChatFull.hidden_prehistory;
                boolean z2 = this.historyHidden;
                if (z != z2) {
                    tLRPC$ChatFull.hidden_prehistory = z2;
                    getMessagesController().toggleChannelInvitesHistory(this.chatId, this.historyHidden);
                }
            }
            if (this.imageUpdater.isUploadingImage()) {
                this.createAfterUpload = true;
                AlertDialog alertDialog = new AlertDialog(getParentActivity(), 3);
                this.progressDialog = alertDialog;
                alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda1
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        ChatEditActivity.this.lambda$processDone$44(dialogInterface);
                    }
                });
                this.progressDialog.show();
                return;
            }
            if (!this.currentChat.title.equals(this.nameTextView.getText().toString())) {
                getMessagesController().changeChatTitle(this.chatId, this.nameTextView.getText().toString());
            }
            TLRPC$ChatFull tLRPC$ChatFull2 = this.info;
            if (tLRPC$ChatFull2 != null && (str = tLRPC$ChatFull2.about) != null) {
                str3 = str;
            }
            EditTextBoldCursor editTextBoldCursor2 = this.descriptionTextView;
            if (editTextBoldCursor2 != null && !str3.equals(editTextBoldCursor2.getText().toString())) {
                getMessagesController().updateChatAbout(this.chatId, this.descriptionTextView.getText().toString(), this.info);
            }
            boolean z3 = this.signMessages;
            TLRPC$Chat tLRPC$Chat = this.currentChat;
            if (z3 != tLRPC$Chat.signatures) {
                tLRPC$Chat.signatures = true;
                getMessagesController().toggleChannelSignatures(this.chatId, this.signMessages);
            }
            if (this.forum != this.currentChat.forum) {
                getMessagesController().toggleChannelForum(this.chatId, this.forum);
                List<BaseFragment> fragmentStack = getParentLayout().getFragmentStack();
                for (int i = 0; i < fragmentStack.size(); i++) {
                    if ((fragmentStack.get(i) instanceof ChatActivity) && ((ChatActivity) fragmentStack.get(i)).getArguments().getLong("chat_id") == this.chatId) {
                        getParentLayout().removeFragmentFromStack(i);
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.chatId);
                        getParentLayout().addFragmentToStack(new TopicsFragment(bundle), i);
                    }
                }
            }
            finishFragment();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processDone$41(TLRPC$TL_bots_setBotInfo tLRPC$TL_bots_setBotInfo, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        TLRPC$UserFull tLRPC$UserFull = this.userInfo;
        if (tLRPC$UserFull != null) {
            tLRPC$UserFull.about = tLRPC$TL_bots_setBotInfo.about;
            getMessagesStorage().updateUserInfo(this.userInfo, false);
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda36
            @Override // java.lang.Runnable
            public final void run() {
                ChatEditActivity.this.lambda$processDone$40();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processDone$40() {
        this.progressDialog.dismiss();
        finishFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processDone$42(int i, DialogInterface dialogInterface) {
        this.donePressed = false;
        this.progressDialog = null;
        getConnectionsManager().cancelRequest(i, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processDone$43(long j) {
        if (j == 0) {
            this.donePressed = false;
            return;
        }
        this.chatId = j;
        this.currentChat = getMessagesController().getChat(Long.valueOf(j));
        this.donePressed = false;
        TLRPC$ChatFull tLRPC$ChatFull = this.info;
        if (tLRPC$ChatFull != null) {
            tLRPC$ChatFull.hidden_prehistory = true;
        }
        processDone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processDone$44(DialogInterface dialogInterface) {
        this.createAfterUpload = false;
        this.progressDialog = null;
        this.donePressed = false;
    }

    private void showAvatarProgress(final boolean z, boolean z2) {
        if (this.avatarProgressView == null) {
            return;
        }
        AnimatorSet animatorSet = this.avatarAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.avatarAnimation = null;
        }
        if (z2) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.avatarAnimation = animatorSet2;
            if (z) {
                this.avatarProgressView.setVisibility(0);
                this.avatarOverlay.setVisibility(0);
                this.avatarAnimation.playTogether(ObjectAnimator.ofFloat(this.avatarProgressView, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(this.avatarOverlay, View.ALPHA, 1.0f));
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.avatarProgressView, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.avatarOverlay, View.ALPHA, 0.0f));
            }
            this.avatarAnimation.setDuration(180L);
            this.avatarAnimation.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.ChatEditActivity.10
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (ChatEditActivity.this.avatarAnimation == null || ChatEditActivity.this.avatarProgressView == null) {
                        return;
                    }
                    if (!z) {
                        ChatEditActivity.this.avatarProgressView.setVisibility(4);
                        ChatEditActivity.this.avatarOverlay.setVisibility(4);
                    }
                    ChatEditActivity.this.avatarAnimation = null;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    ChatEditActivity.this.avatarAnimation = null;
                }
            });
            this.avatarAnimation.start();
        } else if (z) {
            this.avatarProgressView.setAlpha(1.0f);
            this.avatarProgressView.setVisibility(0);
            this.avatarOverlay.setAlpha(1.0f);
            this.avatarOverlay.setVisibility(0);
        } else {
            this.avatarProgressView.setAlpha(0.0f);
            this.avatarProgressView.setVisibility(4);
            this.avatarOverlay.setAlpha(0.0f);
            this.avatarOverlay.setVisibility(4);
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onActivityResultFragment(int i, int i2, Intent intent) {
        this.imageUpdater.onActivityResult(i, i2, intent);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void saveSelfArgs(Bundle bundle) {
        String str;
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null && (str = imageUpdater.currentPicturePath) != null) {
            bundle.putString("path", str);
        }
        EditTextEmoji editTextEmoji = this.nameTextView;
        if (editTextEmoji != null) {
            String obj = editTextEmoji.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    public void setInfo(TLRPC$UserFull tLRPC$UserFull) {
        this.userInfo = tLRPC$UserFull;
        if (tLRPC$UserFull == null || this.currentUser != null) {
            return;
        }
        this.currentUser = this.userId == 0 ? null : getMessagesController().getUser(Long.valueOf(this.userId));
    }

    public void setInfo(TLRPC$ChatFull tLRPC$ChatFull) {
        this.info = tLRPC$ChatFull;
        if (tLRPC$ChatFull != null) {
            if (this.currentChat == null) {
                this.currentChat = getMessagesController().getChat(Long.valueOf(this.chatId));
            }
            this.historyHidden = !ChatObject.isChannel(this.currentChat) || this.info.hidden_prehistory;
            this.availableReactions = this.info.available_reactions;
        }
    }

    private void updateFields(boolean z, boolean z2) {
        int i;
        int i2;
        String str;
        TLRPC$ChatFull tLRPC$ChatFull;
        int i3;
        String str2;
        String string;
        TextCell textCell;
        TextCell textCell2;
        TextCell textCell3;
        TextCell textCell4;
        int i4;
        String str3;
        String format;
        TextCell textCell5;
        TextCell textCell6;
        TLRPC$ChatFull tLRPC$ChatFull2;
        TextCell textCell7;
        TextCell textCell8;
        TextCell textCell9;
        TLRPC$Chat chat;
        if (z && (chat = getMessagesController().getChat(Long.valueOf(this.chatId))) != null) {
            this.currentChat = chat;
        }
        boolean z3 = !ChatObject.isPublic(this.currentChat);
        TextInfoPrivacyCell textInfoPrivacyCell = this.settingsSectionCell;
        if (textInfoPrivacyCell != null) {
            textInfoPrivacyCell.setVisibility((this.signCell == null && this.typeCell == null && ((textCell7 = this.linkedCell) == null || textCell7.getVisibility() != 0) && (((textCell8 = this.historyCell) == null || textCell8.getVisibility() != 0) && ((textCell9 = this.locationCell) == null || textCell9.getVisibility() != 0))) ? 8 : 0);
        }
        TextCell textCell10 = this.logCell;
        if (textCell10 != null) {
            TLRPC$Chat tLRPC$Chat = this.currentChat;
            textCell10.setVisibility((!tLRPC$Chat.megagroup || tLRPC$Chat.gigagroup || ((tLRPC$ChatFull2 = this.info) != null && tLRPC$ChatFull2.participants_count > 200)) ? 0 : 8);
        }
        TextCell textCell11 = this.linkedCell;
        if (textCell11 != null) {
            TLRPC$ChatFull tLRPC$ChatFull3 = this.info;
            if (tLRPC$ChatFull3 == null || (!this.isChannel && tLRPC$ChatFull3.linked_chat_id == 0)) {
                textCell11.setVisibility(8);
            } else {
                textCell11.setVisibility(0);
                if (this.info.linked_chat_id == 0) {
                    this.linkedCell.setTextAndValueAndIcon(LocaleController.getString("Discussion", R.string.Discussion), LocaleController.getString("DiscussionInfoShort", R.string.DiscussionInfoShort), R.drawable.msg_discuss, true);
                } else {
                    TLRPC$Chat chat2 = getMessagesController().getChat(Long.valueOf(this.info.linked_chat_id));
                    if (chat2 == null) {
                        this.linkedCell.setVisibility(8);
                    } else if (this.isChannel) {
                        String publicUsername = ChatObject.getPublicUsername(chat2);
                        if (TextUtils.isEmpty(publicUsername)) {
                            this.linkedCell.setTextAndValueAndIcon(LocaleController.getString("Discussion", R.string.Discussion), chat2.title, R.drawable.msg_discuss, true);
                        } else {
                            this.linkedCell.setTextAndValueAndIcon(LocaleController.getString("Discussion", R.string.Discussion), "@" + publicUsername, R.drawable.msg_discuss, true);
                        }
                    } else {
                        String publicUsername2 = ChatObject.getPublicUsername(chat2);
                        if (TextUtils.isEmpty(publicUsername2)) {
                            TextCell textCell12 = this.linkedCell;
                            String string2 = LocaleController.getString("LinkedChannel", R.string.LinkedChannel);
                            String str4 = chat2.title;
                            int i5 = R.drawable.msg_channel;
                            TextCell textCell13 = this.forumsCell;
                            textCell12.setTextAndValueAndIcon(string2, str4, i5, textCell13 != null && textCell13.getVisibility() == 0);
                        } else {
                            TextCell textCell14 = this.linkedCell;
                            String string3 = LocaleController.getString("LinkedChannel", R.string.LinkedChannel);
                            String str5 = "@" + publicUsername2;
                            int i6 = R.drawable.msg_channel;
                            TextCell textCell15 = this.forumsCell;
                            textCell14.setTextAndValueAndIcon(string3, str5, i6, textCell15 != null && textCell15.getVisibility() == 0);
                        }
                    }
                }
            }
        }
        TextCell textCell16 = this.locationCell;
        if (textCell16 != null) {
            TLRPC$ChatFull tLRPC$ChatFull4 = this.info;
            if (tLRPC$ChatFull4 != null && tLRPC$ChatFull4.can_set_location) {
                textCell16.setVisibility(0);
                TLRPC$ChannelLocation tLRPC$ChannelLocation = this.info.location;
                if (tLRPC$ChannelLocation instanceof TLRPC$TL_channelLocation) {
                    this.locationCell.setTextAndValue(LocaleController.getString("AttachLocation", R.string.AttachLocation), ((TLRPC$TL_channelLocation) tLRPC$ChannelLocation).address, z2, true);
                } else {
                    this.locationCell.setTextAndValue(LocaleController.getString("AttachLocation", R.string.AttachLocation), "Unknown address", z2, true);
                }
            } else {
                textCell16.setVisibility(8);
            }
        }
        if (this.typeCell != null) {
            TLRPC$ChatFull tLRPC$ChatFull5 = this.info;
            if (tLRPC$ChatFull5 != null && (tLRPC$ChatFull5.location instanceof TLRPC$TL_channelLocation)) {
                if (z3) {
                    format = LocaleController.getString("TypeLocationGroupEdit", R.string.TypeLocationGroupEdit);
                } else {
                    format = String.format("https://" + getMessagesController().linkPrefix + "/%s", ChatObject.getPublicUsername(this.currentChat));
                }
                TextCell textCell17 = this.typeCell;
                String string4 = LocaleController.getString("TypeLocationGroup", R.string.TypeLocationGroup);
                int i7 = R.drawable.msg_channel;
                TextCell textCell18 = this.historyCell;
                textCell17.setTextAndValueAndIcon(string4, format, i7, (textCell18 != null && textCell18.getVisibility() == 0) || ((textCell5 = this.linkedCell) != null && textCell5.getVisibility() == 0) || ((textCell6 = this.forumsCell) != null && textCell6.getVisibility() == 0));
            } else {
                boolean z4 = this.currentChat.noforwards;
                if (this.isChannel) {
                    if (!z3) {
                        i4 = R.string.TypePublic;
                        str3 = "TypePublic";
                    } else if (z4) {
                        i4 = R.string.TypePrivateRestrictedForwards;
                        str3 = "TypePrivateRestrictedForwards";
                    } else {
                        i4 = R.string.TypePrivate;
                        str3 = "TypePrivate";
                    }
                    string = LocaleController.getString(str3, i4);
                } else {
                    if (!z3) {
                        i3 = R.string.TypePublicGroup;
                        str2 = "TypePublicGroup";
                    } else if (z4) {
                        i3 = R.string.TypePrivateGroupRestrictedForwards;
                        str2 = "TypePrivateGroupRestrictedForwards";
                    } else {
                        i3 = R.string.TypePrivateGroup;
                        str2 = "TypePrivateGroup";
                    }
                    string = LocaleController.getString(str2, i3);
                }
                if (this.isChannel) {
                    TextCell textCell19 = this.typeCell;
                    String string5 = LocaleController.getString("ChannelType", R.string.ChannelType);
                    int i8 = R.drawable.msg_channel;
                    TextCell textCell20 = this.historyCell;
                    textCell19.setTextAndValueAndIcon(string5, string, i8, (textCell20 != null && textCell20.getVisibility() == 0) || ((textCell3 = this.linkedCell) != null && textCell3.getVisibility() == 0) || ((textCell4 = this.forumsCell) != null && textCell4.getVisibility() == 0));
                } else {
                    TextCell textCell21 = this.typeCell;
                    String string6 = LocaleController.getString("GroupType", R.string.GroupType);
                    int i9 = R.drawable.msg_groups;
                    TextCell textCell22 = this.historyCell;
                    textCell21.setTextAndValueAndIcon(string6, string, i9, (textCell22 != null && textCell22.getVisibility() == 0) || ((textCell = this.linkedCell) != null && textCell.getVisibility() == 0) || ((textCell2 = this.forumsCell) != null && textCell2.getVisibility() == 0));
                }
            }
        }
        if (this.historyCell != null) {
            if (!this.historyHidden || this.forum) {
                i2 = R.string.ChatHistoryVisible;
                str = "ChatHistoryVisible";
            } else {
                i2 = R.string.ChatHistoryHidden;
                str = "ChatHistoryHidden";
            }
            this.historyCell.setTextAndValueAndIcon(LocaleController.getString("ChatHistoryShort", R.string.ChatHistoryShort), LocaleController.getString(str, i2), z2, R.drawable.msg_discuss, this.forumsCell != null);
            this.historyCell.setEnabled(!this.forum);
            updateHistoryShow(!this.forum && z3 && ((tLRPC$ChatFull = this.info) == null || tLRPC$ChatFull.linked_chat_id == 0) && (tLRPC$ChatFull == null || !(tLRPC$ChatFull.location instanceof TLRPC$TL_channelLocation)), z2);
        }
        TextCell textCell23 = this.membersCell;
        if (textCell23 != null) {
            if (this.info != null) {
                TextCell textCell24 = this.memberRequestsCell;
                if (textCell24 != null) {
                    if (textCell24.getParent() == null) {
                        this.infoContainer.addView(this.memberRequestsCell, this.infoContainer.indexOfChild(this.membersCell) + 1, LayoutHelper.createLinear(-1, -2));
                    }
                    this.memberRequestsCell.setVisibility(this.info.requests_pending > 0 ? 0 : 8);
                }
                if (this.isChannel) {
                    this.membersCell.setTextAndValueAndIcon(LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), String.format("%d", Integer.valueOf(this.info.participants_count)), R.drawable.msg_groups, true);
                    TextCell textCell25 = this.blockCell;
                    String string7 = LocaleController.getString("ChannelBlacklist", R.string.ChannelBlacklist);
                    TLRPC$ChatFull tLRPC$ChatFull6 = this.info;
                    String format2 = String.format("%d", Integer.valueOf(Math.max(tLRPC$ChatFull6.banned_count, tLRPC$ChatFull6.kicked_count)));
                    int i10 = R.drawable.msg_user_remove;
                    TextCell textCell26 = this.logCell;
                    textCell25.setTextAndValueAndIcon(string7, format2, i10, textCell26 != null && textCell26.getVisibility() == 0);
                } else {
                    if (ChatObject.isChannel(this.currentChat)) {
                        this.membersCell.setTextAndValueAndIcon(LocaleController.getString("ChannelMembers", R.string.ChannelMembers), String.format("%d", Integer.valueOf(this.info.participants_count)), R.drawable.msg_groups, true);
                    } else {
                        this.membersCell.setTextAndValueAndIcon(LocaleController.getString("ChannelMembers", R.string.ChannelMembers), String.format("%d", Integer.valueOf(this.info.participants.participants.size())), R.drawable.msg_groups, this.memberRequestsCell.getVisibility() == 0);
                    }
                    TLRPC$Chat tLRPC$Chat2 = this.currentChat;
                    if (tLRPC$Chat2.gigagroup) {
                        TextCell textCell27 = this.blockCell;
                        String string8 = LocaleController.getString("ChannelBlacklist", R.string.ChannelBlacklist);
                        TLRPC$ChatFull tLRPC$ChatFull7 = this.info;
                        String format3 = String.format("%d", Integer.valueOf(Math.max(tLRPC$ChatFull7.banned_count, tLRPC$ChatFull7.kicked_count)));
                        int i11 = R.drawable.msg_user_remove;
                        TextCell textCell28 = this.logCell;
                        textCell27.setTextAndValueAndIcon(string8, format3, i11, textCell28 != null && textCell28.getVisibility() == 0);
                    } else {
                        TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights = tLRPC$Chat2.default_banned_rights;
                        if (tLRPC$TL_chatBannedRights != null) {
                            i = (!tLRPC$TL_chatBannedRights.send_plain ? 1 : 0) + ChatUsersActivity.getSendMediaSelectedCount(tLRPC$TL_chatBannedRights);
                            TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights2 = this.currentChat.default_banned_rights;
                            if (!tLRPC$TL_chatBannedRights2.pin_messages) {
                                i++;
                            }
                            if (!tLRPC$TL_chatBannedRights2.invite_users) {
                                i++;
                            }
                            if (this.forum && !tLRPC$TL_chatBannedRights2.manage_topics) {
                                i++;
                            }
                            if (!tLRPC$TL_chatBannedRights2.change_info) {
                                i++;
                            }
                        } else {
                            i = this.forum ? 14 : 13;
                        }
                        TextCell textCell29 = this.blockCell;
                        String string9 = LocaleController.getString("ChannelPermissions", R.string.ChannelPermissions);
                        Object[] objArr = new Object[2];
                        objArr[0] = Integer.valueOf(i);
                        objArr[1] = Integer.valueOf(this.forum ? 14 : 13);
                        textCell29.setTextAndValueAndIcon(string9, String.format("%d/%d", objArr), z2, R.drawable.msg_permissions, true);
                    }
                    TextCell textCell30 = this.memberRequestsCell;
                    if (textCell30 != null) {
                        String string10 = LocaleController.getString("MemberRequests", R.string.MemberRequests);
                        String format4 = String.format("%d", Integer.valueOf(this.info.requests_pending));
                        int i12 = R.drawable.msg_requests;
                        TextCell textCell31 = this.logCell;
                        textCell30.setTextAndValueAndIcon(string10, format4, i12, textCell31 != null && textCell31.getVisibility() == 0);
                    }
                }
                TextCell textCell32 = this.adminCell;
                String string11 = LocaleController.getString("ChannelAdministrators", R.string.ChannelAdministrators);
                Object[] objArr2 = new Object[1];
                objArr2[0] = Integer.valueOf(ChatObject.isChannel(this.currentChat) ? this.info.admins_count : getAdminCount());
                textCell32.setTextAndValueAndIcon(string11, String.format("%d", objArr2), R.drawable.msg_admins, true);
            } else {
                if (this.isChannel) {
                    textCell23.setTextAndIcon(LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), R.drawable.msg_groups, true);
                    TextCell textCell33 = this.blockCell;
                    String string12 = LocaleController.getString("ChannelBlacklist", R.string.ChannelBlacklist);
                    int i13 = R.drawable.msg_chats_remove;
                    TextCell textCell34 = this.logCell;
                    textCell33.setTextAndIcon(string12, i13, textCell34 != null && textCell34.getVisibility() == 0);
                } else {
                    String string13 = LocaleController.getString("ChannelMembers", R.string.ChannelMembers);
                    int i14 = R.drawable.msg_groups;
                    TextCell textCell35 = this.logCell;
                    textCell23.setTextAndIcon(string13, i14, textCell35 != null && textCell35.getVisibility() == 0);
                    if (this.currentChat.gigagroup) {
                        TextCell textCell36 = this.blockCell;
                        String string14 = LocaleController.getString("ChannelBlacklist", R.string.ChannelBlacklist);
                        int i15 = R.drawable.msg_chats_remove;
                        TextCell textCell37 = this.logCell;
                        textCell36.setTextAndIcon(string14, i15, textCell37 != null && textCell37.getVisibility() == 0);
                    } else {
                        this.blockCell.setTextAndIcon(LocaleController.getString("ChannelPermissions", R.string.ChannelPermissions), R.drawable.msg_permissions, true);
                    }
                }
                this.adminCell.setTextAndIcon(LocaleController.getString("ChannelAdministrators", R.string.ChannelAdministrators), R.drawable.msg_admins, true);
            }
            this.reactionsCell.setVisibility(ChatObject.canChangeChatInfo(this.currentChat) ? 0 : 8);
            updateReactionsCell(z2);
            if (this.info == null || !ChatObject.canUserDoAdminAction(this.currentChat, 3) || (!z3 && this.currentChat.creator)) {
                this.inviteLinksCell.setVisibility(8);
            } else if (this.info.invitesCount > 0) {
                this.inviteLinksCell.setTextAndValueAndIcon(LocaleController.getString("InviteLinks", R.string.InviteLinks), Integer.toString(this.info.invitesCount), R.drawable.msg_link2, true);
            } else {
                this.inviteLinksCell.setTextAndValueAndIcon(LocaleController.getString("InviteLinks", R.string.InviteLinks), "1", R.drawable.msg_link2, true);
            }
        }
        TextCell textCell38 = this.stickersCell;
        if (textCell38 == null || this.info == null) {
            return;
        }
        String string15 = LocaleController.getString(R.string.GroupStickers);
        TLRPC$StickerSet tLRPC$StickerSet = this.info.stickerset;
        textCell38.setTextAndValueAndIcon(string15, tLRPC$StickerSet != null ? tLRPC$StickerSet.title : LocaleController.getString(R.string.Add), R.drawable.msg_sticker, false);
    }

    private void updateHistoryShow(final boolean z, boolean z2) {
        ValueAnimator valueAnimator = this.updateHistoryShowAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.historyCell.getAlpha() <= 0.0f && !z) {
            this.historyCell.setVisibility(8);
            return;
        }
        if (this.historyCell.getVisibility() == 0 && this.historyCell.getAlpha() >= 1.0f && z) {
            return;
        }
        final ArrayList arrayList = new ArrayList();
        boolean z3 = false;
        for (int i = 0; i < this.typeEditContainer.getChildCount(); i++) {
            if (!z3 && this.typeEditContainer.getChildAt(i) == this.historyCell) {
                z3 = true;
            } else if (z3) {
                arrayList.add(this.typeEditContainer.getChildAt(i));
            }
        }
        boolean z4 = false;
        for (int i2 = 0; i2 < this.linearLayout.getChildCount(); i2++) {
            if (!z4 && this.linearLayout.getChildAt(i2) == this.typeEditContainer) {
                z4 = true;
            } else if (z4) {
                arrayList.add(this.linearLayout.getChildAt(i2));
            }
        }
        if (this.historyCell.getVisibility() != 0) {
            this.historyCell.setAlpha(0.0f);
            TextCell textCell = this.historyCell;
            textCell.setTranslationY((-textCell.getHeight()) / 2.0f);
        }
        this.historyCell.setVisibility(0);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((View) arrayList.get(i3)).setTranslationY((-this.historyCell.getHeight()) * (1.0f - this.historyCell.getAlpha()));
        }
        if (z2) {
            float[] fArr = new float[2];
            fArr[0] = this.historyCell.getAlpha();
            fArr[1] = z ? 1.0f : 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            this.updateHistoryShowAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    ChatEditActivity.this.lambda$updateHistoryShow$45(arrayList, valueAnimator2);
                }
            });
            this.updateHistoryShowAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.ChatEditActivity.11
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    ChatEditActivity.this.historyCell.setVisibility(z ? 0 : 8);
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        ((View) arrayList.get(i4)).setTranslationY(0.0f);
                    }
                }
            });
            this.updateHistoryShowAnimator.setDuration(320L);
            this.updateHistoryShowAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.updateHistoryShowAnimator.start();
            return;
        }
        this.historyCell.setAlpha(z ? 1.0f : 0.0f);
        TextCell textCell2 = this.historyCell;
        textCell2.setTranslationY(((-textCell2.getHeight()) / 2.0f) * (z ? 0.0f : 1.0f));
        this.historyCell.setScaleY(((z ? 1.0f : 0.0f) * 0.8f) + 0.2f);
        this.historyCell.setVisibility(z ? 0 : 8);
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            ((View) arrayList.get(i4)).setTranslationY(0.0f);
        }
        this.updateHistoryShowAnimator = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateHistoryShow$45(ArrayList arrayList, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.historyCell.setAlpha(floatValue);
        TextCell textCell = this.historyCell;
        float f = 1.0f - floatValue;
        textCell.setTranslationY(((-textCell.getHeight()) / 2.0f) * f);
        this.historyCell.setScaleY((floatValue * 0.8f) + 0.2f);
        for (int i = 0; i < arrayList.size(); i++) {
            ((View) arrayList.get(i)).setTranslationY((-this.historyCell.getHeight()) * f);
        }
    }

    private void updateReactionsCell(boolean z) {
        String string;
        TLRPC$TL_availableReaction tLRPC$TL_availableReaction;
        TLRPC$ChatReactions tLRPC$ChatReactions = this.availableReactions;
        if (tLRPC$ChatReactions == null || (tLRPC$ChatReactions instanceof TLRPC$TL_chatReactionsNone)) {
            string = LocaleController.getString("ReactionsOff", R.string.ReactionsOff);
        } else if (tLRPC$ChatReactions instanceof TLRPC$TL_chatReactionsSome) {
            TLRPC$TL_chatReactionsSome tLRPC$TL_chatReactionsSome = (TLRPC$TL_chatReactionsSome) tLRPC$ChatReactions;
            int i = 0;
            for (int i2 = 0; i2 < tLRPC$TL_chatReactionsSome.reactions.size(); i2++) {
                TLRPC$Reaction tLRPC$Reaction = tLRPC$TL_chatReactionsSome.reactions.get(i2);
                if ((tLRPC$Reaction instanceof TLRPC$TL_reactionEmoji) && (tLRPC$TL_availableReaction = getMediaDataController().getReactionsMap().get(((TLRPC$TL_reactionEmoji) tLRPC$Reaction).emoticon)) != null && !tLRPC$TL_availableReaction.inactive) {
                    i++;
                }
            }
            int min = Math.min(getMediaDataController().getEnabledReactionsList().size(), i);
            if (min == 0) {
                string = LocaleController.getString("ReactionsOff", R.string.ReactionsOff);
            } else {
                string = LocaleController.formatString("ReactionsCount", R.string.ReactionsCount, Integer.valueOf(min), Integer.valueOf(getMediaDataController().getEnabledReactionsList().size()));
            }
        } else {
            string = LocaleController.getString("ReactionsAll", R.string.ReactionsAll);
        }
        this.reactionsCell.setTextAndValueAndIcon(LocaleController.getString("Reactions", R.string.Reactions), string, z, R.drawable.msg_reactions2, true);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() { // from class: org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda45
            @Override // org.telegram.ui.ActionBar.ThemeDescription.ThemeDescriptionDelegate
            public final void didSetColor() {
                ChatEditActivity.this.lambda$getThemeDescriptions$46();
            }

            @Override // org.telegram.ui.ActionBar.ThemeDescription.ThemeDescriptionDelegate
            public /* synthetic */ void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.-CC.$default$onAnimationProgress(this, f);
            }
        };
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
        TextCell textCell = this.setAvatarCell;
        int i = ThemeDescription.FLAG_SELECTOR;
        int i2 = Theme.key_listSelector;
        arrayList.add(new ThemeDescription(textCell, i, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.setAvatarCell, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueButton));
        arrayList.add(new ThemeDescription(this.setAvatarCell, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueIcon));
        arrayList.add(new ThemeDescription(this.membersCell, ThemeDescription.FLAG_SELECTOR, null, null, null, null, i2));
        int i3 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.membersCell, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        int i4 = Theme.key_windowBackgroundWhiteGrayIcon;
        arrayList.add(new ThemeDescription(this.membersCell, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.adminCell, ThemeDescription.FLAG_SELECTOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.adminCell, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        arrayList.add(new ThemeDescription(this.adminCell, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.inviteLinksCell, ThemeDescription.FLAG_SELECTOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.inviteLinksCell, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        arrayList.add(new ThemeDescription(this.inviteLinksCell, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        if (this.memberRequestsCell != null) {
            arrayList.add(new ThemeDescription(this.memberRequestsCell, ThemeDescription.FLAG_SELECTOR, null, null, null, null, i2));
            arrayList.add(new ThemeDescription(this.memberRequestsCell, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
            arrayList.add(new ThemeDescription(this.memberRequestsCell, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        }
        arrayList.add(new ThemeDescription(this.blockCell, ThemeDescription.FLAG_SELECTOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.blockCell, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        arrayList.add(new ThemeDescription(this.blockCell, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.logCell, ThemeDescription.FLAG_SELECTOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.logCell, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        arrayList.add(new ThemeDescription(this.logCell, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.typeCell, ThemeDescription.FLAG_SELECTOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.typeCell, 0, new Class[]{TextDetailCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        int i5 = Theme.key_windowBackgroundWhiteGrayText2;
        arrayList.add(new ThemeDescription(this.typeCell, 0, new Class[]{TextDetailCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i5));
        arrayList.add(new ThemeDescription(this.historyCell, ThemeDescription.FLAG_SELECTOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.historyCell, 0, new Class[]{TextDetailCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        arrayList.add(new ThemeDescription(this.historyCell, 0, new Class[]{TextDetailCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i5));
        arrayList.add(new ThemeDescription(this.locationCell, ThemeDescription.FLAG_SELECTOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.locationCell, 0, new Class[]{TextDetailCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        arrayList.add(new ThemeDescription(this.locationCell, 0, new Class[]{TextDetailCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i5));
        arrayList.add(new ThemeDescription(this.nameTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i3));
        EditTextEmoji editTextEmoji = this.nameTextView;
        int i6 = ThemeDescription.FLAG_HINTTEXTCOLOR;
        int i7 = Theme.key_windowBackgroundWhiteHintText;
        arrayList.add(new ThemeDescription(editTextEmoji, i6, null, null, null, null, i7));
        arrayList.add(new ThemeDescription(this.nameTextView, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, Theme.key_windowBackgroundWhiteInputField));
        arrayList.add(new ThemeDescription(this.nameTextView, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, Theme.key_windowBackgroundWhiteInputFieldActivated));
        arrayList.add(new ThemeDescription(this.descriptionTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.descriptionTextView, ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, i7));
        LinearLayout linearLayout = this.avatarContainer;
        int i8 = ThemeDescription.FLAG_BACKGROUND;
        int i9 = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(linearLayout, i8, null, null, null, null, i9));
        arrayList.add(new ThemeDescription(this.settingsContainer, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i9));
        arrayList.add(new ThemeDescription(this.typeEditContainer, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i9));
        arrayList.add(new ThemeDescription(this.deleteContainer, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i9));
        arrayList.add(new ThemeDescription(this.stickersContainer, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i9));
        arrayList.add(new ThemeDescription(this.infoContainer, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i9));
        int i10 = Theme.key_windowBackgroundGrayShadow;
        arrayList.add(new ThemeDescription(this.settingsTopSectionCell, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, i10));
        arrayList.add(new ThemeDescription(this.settingsSectionCell, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, i10));
        arrayList.add(new ThemeDescription(this.deleteInfoCell, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, i10));
        arrayList.add(new ThemeDescription(this.signCell, ThemeDescription.FLAG_SELECTOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.signCell, 0, new Class[]{TextCheckCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        arrayList.add(new ThemeDescription(this.signCell, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_switchTrack));
        arrayList.add(new ThemeDescription(this.signCell, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_switchTrackChecked));
        arrayList.add(new ThemeDescription(this.deleteCell, ThemeDescription.FLAG_SELECTOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.deleteCell, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_text_RedRegular));
        arrayList.add(new ThemeDescription(this.stickersCell, ThemeDescription.FLAG_SELECTOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.stickersCell, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        arrayList.add(new ThemeDescription(this.stickersInfoCell, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i10));
        arrayList.add(new ThemeDescription(this.stickersInfoCell, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText4));
        arrayList.add(new ThemeDescription(null, 0, null, null, Theme.avatarDrawables, themeDescriptionDelegate, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(this.undoView, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, Theme.key_undo_background));
        int i11 = Theme.key_undo_cancelColor;
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i11));
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i11));
        int i12 = Theme.key_undo_infoColor;
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i12));
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i12));
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i12));
        arrayList.add(new ThemeDescription(this.undoView, ThemeDescription.FLAG_IMAGECOLOR, new Class[]{UndoView.class}, new String[]{"leftImageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i12));
        arrayList.add(new ThemeDescription(this.reactionsCell, ThemeDescription.FLAG_SELECTOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.reactionsCell, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        arrayList.add(new ThemeDescription(this.reactionsCell, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getThemeDescriptions$46() {
        BackupImageView backupImageView = this.avatarImage;
        if (backupImageView != null) {
            backupImageView.invalidate();
        }
    }
}
