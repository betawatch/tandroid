package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Property;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.collection.LongSparseArray;
import androidx.core.content.ContextCompat;
import androidx.core.util.Consumer;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BotForumHelper$$ExternalSyntheticLambda2;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.LoadingCell;
import org.telegram.ui.Cells.ManageChatTextCell;
import org.telegram.ui.Cells.ManageChatUserCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.SlideIntChooseView;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextCheckCell2;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.ChatRightsEditActivity;
import org.telegram.ui.ChatUsersActivity;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.GigagroupConvertAlert;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SlideChooseView;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.GroupCreateActivity;
import org.telegram.ui.bots.AffiliateProgramFragment;

/* loaded from: classes4.dex */
public class ChatUsersActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private int addNew2Row;
    private int addNewRow;
    private int addNewSectionRow;
    private int addUsersRow;
    private int antiSpamInfoRow;
    private int antiSpamRow;
    private boolean antiSpamToggleLoading;
    private int blockedEmptyRow;
    private int botEndRow;
    private int botHeaderRow;
    private int botStartRow;
    private ArrayList bots;
    private boolean botsEndReached;
    private LongSparseArray botsMap;
    private int changeInfoRow;
    private long chatId;
    private ArrayList contacts;
    private boolean contactsEndReached;
    private int contactsEndRow;
    private int contactsHeaderRow;
    private LongSparseArray contactsMap;
    private int contactsStartRow;
    private TLRPC.Chat currentChat;
    private TLRPC.TL_chatBannedRights defaultBannedRights;
    private int delayResults;
    private ChatUsersActivityDelegate delegate;
    private ActionBarMenuItem doneItem;
    private int dontRestrictBoostersInfoRow;
    private int dontRestrictBoostersRow;
    private int dontRestrictBoostersSliderRow;
    private int editTagRow;
    private int embedLinksRow;
    private StickerEmptyView emptyView;
    private boolean enablePrice;
    private boolean firstLoaded;
    private FlickerLoadingView flickerLoadingView;
    private int gigaConvertRow;
    private int gigaHeaderRow;
    private int gigaInfoRow;
    private int hideMembersInfoRow;
    private int hideMembersRow;
    private boolean hideMembersToggleLoading;
    private LongSparseArray ignoredUsers;
    private TLRPC.ChatFull info;
    private String initialBannedRights;
    private boolean initialEnablePrice;
    private boolean initialProfiles;
    private boolean initialSignatures;
    private int initialSlowmode;
    private long initialStarsPrice;
    private boolean isChannel;
    private boolean isEnabledNotRestrictBoosters;
    private boolean isForum;
    private LinearLayoutManager layoutManager;
    private RecyclerListView listView;
    private ListAdapter listViewAdapter;
    private int loadingHeaderRow;
    private int loadingProgressRow;
    private int loadingUserCellRow;
    private boolean loadingUsers;
    private int manageTopicsRow;
    private int membersHeaderRow;
    private boolean needOpenSearch;
    private int notRestrictBoosters;
    private boolean openTransitionStarted;
    private ArrayList participants;
    private int participantsDivider2Row;
    private int participantsDividerRow;
    private int participantsEndRow;
    private int participantsInfoRow;
    private LongSparseArray participantsMap;
    private int participantsStartRow;
    private int payInfoRow;
    private int payRow;
    private int permissionsSectionRow;
    private int pinMessagesRow;
    private int priceHeaderRow;
    private int priceInfoRow;
    private int priceRow;
    private boolean profiles;
    private View progressBar;
    private int recentActionsRow;
    private int removedUsersRow;
    private int restricted1SectionRow;
    private int rowCount;
    private ActionBarMenuItem searchItem;
    private SearchAdapter searchListViewAdapter;
    private boolean searching;
    private int selectType;
    private int selectedSlowmode;
    private int sendMediaEmbededLinksRow;
    private boolean sendMediaExpanded;
    private int sendMediaFilesRow;
    private int sendMediaMusicRow;
    private int sendMediaPhotosRow;
    private int sendMediaRow;
    private int sendMediaStickerGifsRow;
    private int sendMediaVideoMessagesRow;
    private int sendMediaVideosRow;
    private int sendMediaVoiceMessagesRow;
    private int sendMessagesRow;
    private int sendPollsRow;
    private int sendStickersRow;
    private int signMessagesInfoRow;
    private int signMessagesProfilesRow;
    private int signMessagesRow;
    private boolean signatures;
    private int slowmodeInfoRow;
    private int slowmodeRow;
    private int slowmodeSelectRow;
    private long starsPrice;
    private int tagsInfoRow;
    private int tagsRow;
    private boolean transfer;
    private int type;
    private UndoView undoView;

    public interface ChatUsersActivityDelegate {

        public abstract /* synthetic */ class -CC {
            public static void $default$didChangeOwner(ChatUsersActivityDelegate chatUsersActivityDelegate, TLRPC.User user) {
            }

            public static void $default$didKickParticipant(ChatUsersActivityDelegate chatUsersActivityDelegate, long j) {
            }

            public static void $default$didSelectUser(ChatUsersActivityDelegate chatUsersActivityDelegate, long j) {
            }
        }

        void didAddParticipantToList(long j, TLObject tLObject);

        void didChangeOwner(TLRPC.User user);

        void didKickParticipant(long j);

        void didSelectUser(long j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getSecondsForIndex(int i) {
        if (i == 1) {
            return 5;
        }
        if (i == 2) {
            return 10;
        }
        if (i == 3) {
            return 30;
        }
        if (i == 4) {
            return 60;
        }
        if (i == 5) {
            return NotificationCenter.onRequestPermissionResultReceived;
        }
        if (i == 6) {
            return 900;
        }
        return i == 7 ? 3600 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processDone$27() {
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean needDelayOpenAnimation() {
        return true;
    }

    public ChatUsersActivity(Bundle bundle) {
        super(bundle);
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.defaultBannedRights = new TLRPC.TL_chatBannedRights();
        this.participants = new ArrayList();
        this.bots = new ArrayList();
        this.contacts = new ArrayList();
        this.participantsMap = new LongSparseArray();
        this.botsMap = new LongSparseArray();
        this.contactsMap = new LongSparseArray();
        this.initialStarsPrice = 10L;
        this.starsPrice = 10L;
        this.chatId = this.arguments.getLong("chat_id");
        this.type = this.arguments.getInt("type");
        this.transfer = this.arguments.getBoolean("transfer");
        this.needOpenSearch = this.arguments.getBoolean("open_search");
        this.selectType = this.arguments.getInt("selectType");
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
        this.currentChat = chat;
        boolean z = false;
        if (chat != null && (tL_chatBannedRights = chat.default_banned_rights) != null) {
            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.defaultBannedRights;
            tL_chatBannedRights2.view_messages = tL_chatBannedRights.view_messages;
            tL_chatBannedRights2.send_stickers = tL_chatBannedRights.send_stickers;
            boolean z2 = tL_chatBannedRights.send_media;
            tL_chatBannedRights2.send_media = z2;
            tL_chatBannedRights2.embed_links = tL_chatBannedRights.embed_links;
            tL_chatBannedRights2.send_messages = tL_chatBannedRights.send_messages;
            tL_chatBannedRights2.send_games = tL_chatBannedRights.send_games;
            tL_chatBannedRights2.send_inline = tL_chatBannedRights.send_inline;
            tL_chatBannedRights2.send_gifs = tL_chatBannedRights.send_gifs;
            tL_chatBannedRights2.pin_messages = tL_chatBannedRights.pin_messages;
            tL_chatBannedRights2.edit_rank = tL_chatBannedRights.edit_rank;
            tL_chatBannedRights2.send_polls = tL_chatBannedRights.send_polls;
            tL_chatBannedRights2.invite_users = tL_chatBannedRights.invite_users;
            tL_chatBannedRights2.manage_topics = tL_chatBannedRights.manage_topics;
            tL_chatBannedRights2.change_info = tL_chatBannedRights.change_info;
            boolean z3 = tL_chatBannedRights.send_photos;
            tL_chatBannedRights2.send_photos = z3;
            boolean z4 = tL_chatBannedRights.send_videos;
            tL_chatBannedRights2.send_videos = z4;
            boolean z5 = tL_chatBannedRights.send_roundvideos;
            tL_chatBannedRights2.send_roundvideos = z5;
            boolean z6 = tL_chatBannedRights.send_audios;
            tL_chatBannedRights2.send_audios = z6;
            boolean z7 = tL_chatBannedRights.send_voices;
            tL_chatBannedRights2.send_voices = z7;
            boolean z8 = tL_chatBannedRights.send_docs;
            tL_chatBannedRights2.send_docs = z8;
            tL_chatBannedRights2.send_plain = tL_chatBannedRights.send_plain;
            if (!z2 && z8 && z7 && z6 && z5 && z4 && z3) {
                tL_chatBannedRights2.send_photos = false;
                tL_chatBannedRights2.send_videos = false;
                tL_chatBannedRights2.send_roundvideos = false;
                tL_chatBannedRights2.send_audios = false;
                tL_chatBannedRights2.send_voices = false;
                tL_chatBannedRights2.send_docs = false;
            }
        }
        this.initialBannedRights = ChatObject.getBannedRightsString(this.defaultBannedRights);
        if (ChatObject.isChannel(this.currentChat) && !this.currentChat.megagroup) {
            z = true;
        }
        this.isChannel = z;
        this.isForum = ChatObject.isForum(this.currentChat);
        TLRPC.Chat chat2 = this.currentChat;
        if (chat2 != null) {
            boolean z9 = chat2.signatures;
            this.signatures = z9;
            this.initialSignatures = z9;
            boolean z10 = chat2.signature_profiles;
            this.profiles = z10;
            this.initialProfiles = z10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x019c, code lost:
    
        if (org.telegram.messenger.ChatObject.canBlockUsers(r1) != false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x025c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void updateRows() {
        boolean z;
        boolean z2;
        TLRPC.ChatFull chatFull;
        boolean z3;
        TLRPC.ChatFull chatFull2;
        boolean z4;
        TLRPC.ChatFull chatFull3;
        TLRPC.Chat chat;
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.chatId));
        this.currentChat = chat2;
        if (chat2 == null) {
            return;
        }
        this.recentActionsRow = -1;
        this.antiSpamRow = -1;
        this.antiSpamInfoRow = -1;
        this.addNewRow = -1;
        this.addNew2Row = -1;
        this.hideMembersRow = -1;
        this.hideMembersInfoRow = -1;
        this.tagsRow = -1;
        this.tagsInfoRow = -1;
        this.addNewSectionRow = -1;
        this.restricted1SectionRow = -1;
        this.participantsStartRow = -1;
        this.participantsDividerRow = -1;
        this.participantsDivider2Row = -1;
        this.gigaInfoRow = -1;
        this.gigaConvertRow = -1;
        this.gigaHeaderRow = -1;
        this.participantsEndRow = -1;
        this.participantsInfoRow = -1;
        this.signMessagesRow = -1;
        this.signMessagesProfilesRow = -1;
        this.signMessagesInfoRow = -1;
        this.blockedEmptyRow = -1;
        this.permissionsSectionRow = -1;
        this.sendMessagesRow = -1;
        this.sendMediaRow = -1;
        this.sendStickersRow = -1;
        this.sendPollsRow = -1;
        this.embedLinksRow = -1;
        this.addUsersRow = -1;
        this.manageTopicsRow = -1;
        this.pinMessagesRow = -1;
        this.editTagRow = -1;
        this.changeInfoRow = -1;
        this.removedUsersRow = -1;
        this.contactsHeaderRow = -1;
        this.contactsStartRow = -1;
        this.contactsEndRow = -1;
        this.botHeaderRow = -1;
        this.botStartRow = -1;
        this.botEndRow = -1;
        this.membersHeaderRow = -1;
        this.slowmodeRow = -1;
        this.slowmodeSelectRow = -1;
        this.slowmodeInfoRow = -1;
        this.dontRestrictBoostersRow = -1;
        this.dontRestrictBoostersInfoRow = -1;
        this.dontRestrictBoostersSliderRow = -1;
        this.loadingProgressRow = -1;
        this.loadingUserCellRow = -1;
        this.loadingHeaderRow = -1;
        this.sendMediaPhotosRow = -1;
        this.sendMediaVideosRow = -1;
        this.sendMediaStickerGifsRow = -1;
        this.sendMediaMusicRow = -1;
        this.sendMediaFilesRow = -1;
        this.sendMediaVoiceMessagesRow = -1;
        this.sendMediaVideoMessagesRow = -1;
        this.sendMediaEmbededLinksRow = -1;
        this.payRow = -1;
        this.payInfoRow = -1;
        this.priceHeaderRow = -1;
        this.priceRow = -1;
        this.priceInfoRow = -1;
        this.rowCount = 0;
        int i = this.type;
        int i2 = 1;
        if (i == 3) {
            int i3 = this.rowCount;
            this.permissionsSectionRow = i3;
            this.sendMessagesRow = i3 + 1;
            int i4 = i3 + 3;
            this.rowCount = i4;
            this.sendMediaRow = i3 + 2;
            if (this.sendMediaExpanded) {
                this.sendMediaPhotosRow = i4;
                this.sendMediaVideosRow = i3 + 4;
                this.sendMediaStickerGifsRow = i3 + 5;
                this.sendMediaMusicRow = i3 + 6;
                this.sendMediaFilesRow = i3 + 7;
                this.sendMediaVoiceMessagesRow = i3 + 8;
                this.sendMediaVideoMessagesRow = i3 + 9;
                this.sendMediaEmbededLinksRow = i3 + 10;
                this.rowCount = i3 + 12;
                this.sendPollsRow = i3 + 11;
            }
            int i5 = this.rowCount;
            this.addUsersRow = i5;
            this.pinMessagesRow = i5 + 1;
            this.editTagRow = i5 + 2;
            int i6 = i5 + 4;
            this.rowCount = i6;
            this.changeInfoRow = i5 + 3;
            if (this.isForum) {
                this.rowCount = i5 + 5;
                this.manageTopicsRow = i6;
            }
            if (ChatObject.isChannel(this.currentChat)) {
                TLRPC.Chat chat3 = this.currentChat;
                if (chat3.creator && chat3.megagroup && !chat3.gigagroup) {
                    int i7 = chat3.participants_count;
                    TLRPC.ChatFull chatFull4 = this.info;
                    if (Math.max(i7, chatFull4 != null ? chatFull4.participants_count : 0) >= getMessagesController().maxMegagroupCount - 1000) {
                        int i8 = this.rowCount;
                        this.participantsDivider2Row = i8;
                        this.gigaHeaderRow = i8 + 1;
                        this.gigaConvertRow = i8 + 2;
                        this.rowCount = i8 + 4;
                        this.gigaInfoRow = i8 + 3;
                    }
                }
            }
            TLRPC.ChatFull chatFull5 = this.info;
            if (chatFull5 != null && chatFull5.paid_messages_available && ChatObject.canUserDoAction(this.currentChat, 2) && (ChatObject.isChannel(this.currentChat) || ((chat = this.currentChat) != null && chat.creator))) {
                if (this.participantsDivider2Row == -1) {
                    int i9 = this.rowCount;
                    this.rowCount = i9 + 1;
                    this.participantsDivider2Row = i9;
                }
                int i10 = this.rowCount;
                this.payRow = i10;
                int i11 = i10 + 2;
                this.rowCount = i11;
                this.payInfoRow = i10 + 1;
                if (this.enablePrice) {
                    this.priceHeaderRow = i11;
                    this.priceRow = i10 + 3;
                    this.rowCount = i10 + 5;
                    this.priceInfoRow = i10 + 4;
                }
            }
            if (ChatObject.isChannel(this.currentChat) || !this.currentChat.creator) {
                TLRPC.Chat chat4 = this.currentChat;
                if (chat4.megagroup) {
                    if (!chat4.gigagroup) {
                    }
                }
                if (isNotRestrictBoostersVisible()) {
                    if (this.participantsDivider2Row == -1) {
                        int i12 = this.rowCount;
                        this.rowCount = i12 + 1;
                        this.participantsDivider2Row = i12;
                    }
                    int i13 = this.rowCount;
                    int i14 = i13 + 1;
                    this.rowCount = i14;
                    this.dontRestrictBoostersRow = i13;
                    if (this.isEnabledNotRestrictBoosters) {
                        this.rowCount = i13 + 2;
                        this.dontRestrictBoostersSliderRow = i14;
                    }
                    int i15 = this.rowCount;
                    this.rowCount = i15 + 1;
                    this.dontRestrictBoostersInfoRow = i15;
                }
                if (ChatObject.isChannel(this.currentChat)) {
                    if (this.participantsDivider2Row == -1) {
                        int i16 = this.rowCount;
                        this.rowCount = i16 + 1;
                        this.participantsDivider2Row = i16;
                    }
                    int i17 = this.rowCount;
                    this.rowCount = i17 + 1;
                    this.removedUsersRow = i17;
                }
                if ((this.slowmodeInfoRow == -1 && this.gigaHeaderRow == -1) || this.removedUsersRow != -1) {
                    int i18 = this.rowCount;
                    this.rowCount = i18 + 1;
                    this.participantsDividerRow = i18;
                }
                if (ChatObject.canBlockUsers(this.currentChat) && getParticipantsCount() > 1 && (ChatObject.isChannel(this.currentChat) || this.currentChat.creator)) {
                    int i19 = this.rowCount;
                    this.rowCount = i19 + 1;
                    this.addNewRow = i19;
                }
                if (!this.loadingUsers && !(z4 = this.firstLoaded)) {
                    if (z4 || (chatFull3 = this.info) == null || chatFull3.banned_count <= 0) {
                        return;
                    }
                    int i20 = this.rowCount;
                    this.rowCount = i20 + 1;
                    this.loadingUserCellRow = i20;
                    return;
                }
                if (!this.participants.isEmpty()) {
                    int i21 = this.rowCount;
                    this.participantsStartRow = i21;
                    int size = i21 + this.participants.size();
                    this.rowCount = size;
                    this.participantsEndRow = size;
                }
                if (this.addNewRow == -1 || this.participantsStartRow != -1) {
                    int i22 = this.rowCount;
                    this.rowCount = i22 + 1;
                    this.addNewSectionRow = i22;
                    return;
                }
                return;
            }
            if (this.participantsDivider2Row == -1) {
                int i23 = this.rowCount;
                this.rowCount = i23 + 1;
                this.participantsDivider2Row = i23;
            }
            int i24 = this.rowCount;
            this.slowmodeRow = i24;
            this.slowmodeSelectRow = i24 + 1;
            this.rowCount = i24 + 3;
            this.slowmodeInfoRow = i24 + 2;
            if (isNotRestrictBoostersVisible()) {
            }
            if (ChatObject.isChannel(this.currentChat)) {
            }
            if (this.slowmodeInfoRow == -1) {
                int i182 = this.rowCount;
                this.rowCount = i182 + 1;
                this.participantsDividerRow = i182;
                if (ChatObject.canBlockUsers(this.currentChat)) {
                    int i192 = this.rowCount;
                    this.rowCount = i192 + 1;
                    this.addNewRow = i192;
                }
                if (!this.loadingUsers) {
                }
                if (!this.participants.isEmpty()) {
                }
                if (this.addNewRow == -1) {
                }
                int i222 = this.rowCount;
                this.rowCount = i222 + 1;
                this.addNewSectionRow = i222;
                return;
            }
            int i1822 = this.rowCount;
            this.rowCount = i1822 + 1;
            this.participantsDividerRow = i1822;
            if (ChatObject.canBlockUsers(this.currentChat)) {
            }
            if (!this.loadingUsers) {
            }
            if (!this.participants.isEmpty()) {
            }
            if (this.addNewRow == -1) {
            }
            int i2222 = this.rowCount;
            this.rowCount = i2222 + 1;
            this.addNewSectionRow = i2222;
            return;
        }
        if (i == 0) {
            if (ChatObject.canBlockUsers(this.currentChat)) {
                int i25 = this.rowCount;
                this.rowCount = i25 + 1;
                this.addNewRow = i25;
                if (!this.participants.isEmpty() || (this.loadingUsers && !this.firstLoaded && (chatFull2 = this.info) != null && chatFull2.kicked_count > 0)) {
                    int i26 = this.rowCount;
                    this.rowCount = i26 + 1;
                    this.participantsInfoRow = i26;
                }
            }
            if (this.loadingUsers && !(z3 = this.firstLoaded)) {
                if (z3) {
                    return;
                }
                int i27 = this.rowCount;
                this.restricted1SectionRow = i27;
                this.rowCount = i27 + 2;
                this.loadingUserCellRow = i27 + 1;
                return;
            }
            if (!this.participants.isEmpty()) {
                int i28 = this.rowCount;
                int i29 = i28 + 1;
                this.rowCount = i29;
                this.restricted1SectionRow = i28;
                this.participantsStartRow = i29;
                int size2 = i29 + this.participants.size();
                this.rowCount = size2;
                this.participantsEndRow = size2;
            }
            if (this.participantsStartRow != -1) {
                if (this.participantsInfoRow == -1) {
                    int i30 = this.rowCount;
                    this.rowCount = i30 + 1;
                    this.participantsInfoRow = i30;
                    return;
                } else {
                    int i31 = this.rowCount;
                    this.rowCount = i31 + 1;
                    this.addNewSectionRow = i31;
                    return;
                }
            }
            int i32 = this.rowCount;
            this.rowCount = i32 + 1;
            this.blockedEmptyRow = i32;
            return;
        }
        if (i == 1) {
            if (!this.transfer && ChatObject.isChannel(this.currentChat)) {
                TLRPC.Chat chat5 = this.currentChat;
                if (chat5.megagroup && !chat5.gigagroup && ((chatFull = this.info) == null || chatFull.participants_count <= 200 || (!this.isChannel && chatFull.can_set_stickers))) {
                    if (ChatObject.hasAdminRights(chat5)) {
                        int i33 = this.rowCount;
                        this.antiSpamRow = i33;
                        this.rowCount = i33 + 2;
                        this.antiSpamInfoRow = i33 + 1;
                    } else {
                        int i34 = this.rowCount;
                        this.rowCount = i34 + 1;
                        this.addNewSectionRow = i34;
                    }
                }
            }
            if (ChatObject.canAddAdmins(this.currentChat)) {
                int i35 = this.rowCount;
                this.rowCount = i35 + 1;
                this.addNewRow = i35;
            }
            if (!this.loadingUsers || (z2 = this.firstLoaded)) {
                if (!this.participants.isEmpty()) {
                    int i36 = this.rowCount;
                    this.participantsStartRow = i36;
                    int size3 = i36 + this.participants.size();
                    this.rowCount = size3;
                    this.participantsEndRow = size3;
                }
                int i37 = this.rowCount;
                this.rowCount = i37 + 1;
                this.participantsInfoRow = i37;
            } else if (!z2) {
                int i38 = this.rowCount;
                this.rowCount = i38 + 1;
                this.loadingUserCellRow = i38;
            }
            if (!this.transfer && ChatObject.isChannelAndNotMegaGroup(this.currentChat) && ChatObject.hasAdminRights(this.currentChat)) {
                int i39 = this.rowCount;
                int i40 = i39 + 1;
                this.rowCount = i40;
                this.signMessagesRow = i39;
                if (this.signatures) {
                    this.signMessagesProfilesRow = i40;
                    this.rowCount = i39 + 3;
                    this.signMessagesInfoRow = i39 + 2;
                    return;
                } else {
                    this.rowCount = i39 + 2;
                    this.signMessagesInfoRow = i40;
                    return;
                }
            }
            return;
        }
        if (i == 2) {
            if (ChatObject.isChannel(this.currentChat) && !ChatObject.isChannelAndNotMegaGroup(this.currentChat) && !this.needOpenSearch) {
                int i41 = this.rowCount;
                this.hideMembersRow = i41;
                this.rowCount = i41 + 2;
                this.hideMembersInfoRow = i41 + 1;
            }
            TLRPC.Chat chat6 = this.currentChat;
            if (chat6 != null && (chat6.creator || (ChatObject.hasAdminRights(chat6) && ChatObject.canChangeChatInfo(this.currentChat)))) {
                int i42 = this.rowCount;
                this.tagsRow = i42;
                this.rowCount = i42 + 2;
                this.tagsInfoRow = i42 + 1;
            }
            if (this.selectType == 0 && ChatObject.canAddUsers(this.currentChat)) {
                int i43 = this.rowCount;
                this.rowCount = i43 + 1;
                this.addNewRow = i43;
            }
            if (this.selectType == 0 && ChatObject.canUserDoAdminAction(this.currentChat, 3)) {
                int i44 = this.rowCount;
                this.rowCount = i44 + 1;
                this.addNew2Row = i44;
            }
            if (this.loadingUsers && !(z = this.firstLoaded)) {
                if (z) {
                    return;
                }
                if (this.selectType == 0) {
                    int i45 = this.rowCount;
                    this.rowCount = i45 + 1;
                    this.loadingHeaderRow = i45;
                }
                int i46 = this.rowCount;
                this.rowCount = i46 + 1;
                this.loadingUserCellRow = i46;
                return;
            }
            if (!this.contacts.isEmpty()) {
                int i47 = this.rowCount;
                int i48 = i47 + 1;
                this.rowCount = i48;
                this.contactsHeaderRow = i47;
                this.contactsStartRow = i48;
                int size4 = i48 + this.contacts.size();
                this.rowCount = size4;
                this.contactsEndRow = size4;
                r1 = 1;
            }
            if (this.bots.isEmpty()) {
                i2 = r1;
            } else {
                int i49 = this.rowCount;
                int i50 = i49 + 1;
                this.rowCount = i50;
                this.botHeaderRow = i49;
                this.botStartRow = i50;
                int size5 = i50 + this.bots.size();
                this.rowCount = size5;
                this.botEndRow = size5;
            }
            if (!this.participants.isEmpty()) {
                if (i2 != 0) {
                    int i51 = this.rowCount;
                    this.rowCount = i51 + 1;
                    this.membersHeaderRow = i51;
                }
                int i52 = this.rowCount;
                this.participantsStartRow = i52;
                int size6 = i52 + this.participants.size();
                this.rowCount = size6;
                this.participantsEndRow = size6;
            }
            int i53 = this.rowCount;
            if (i53 != 0) {
                this.rowCount = i53 + 1;
                this.participantsInfoRow = i53;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        loadChatParticipants(0, NotificationCenter.channelRecommendationsLoaded);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public View createView(Context context) {
        int i;
        boolean z = false;
        this.searching = false;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i2 = this.type;
        if (i2 == 3) {
            this.actionBar.setTitle(LocaleController.getString("ChannelPermissions", R.string.ChannelPermissions));
        } else if (i2 == 0) {
            this.actionBar.setTitle(LocaleController.getString("ChannelBlacklist", R.string.ChannelBlacklist));
        } else if (i2 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAdministrators));
        } else if (i2 == 2) {
            int i3 = this.selectType;
            if (i3 == 0) {
                if (this.isChannel) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.ChannelSubscribers));
                } else {
                    this.actionBar.setTitle(LocaleController.getString("ChannelMembers", R.string.ChannelMembers));
                }
            } else if (i3 == 1) {
                this.actionBar.setTitle(LocaleController.getString("ChannelAddAdmin", R.string.ChannelAddAdmin));
            } else if (i3 == 2) {
                this.actionBar.setTitle(LocaleController.getString("ChannelBlockUser", R.string.ChannelBlockUser));
            } else if (i3 == 3) {
                this.actionBar.setTitle(LocaleController.getString("ChannelAddException", R.string.ChannelAddException));
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() { // from class: org.telegram.ui.ChatUsersActivity.1
            @Override // org.telegram.ui.ActionBar.ActionBar.ActionBarMenuOnItemClick
            public void onItemClick(int i4) {
                if (i4 == -1) {
                    if (ChatUsersActivity.this.checkDiscard(true)) {
                        ChatUsersActivity.this.finishFragment();
                    }
                } else if (i4 == 1) {
                    ChatUsersActivity.this.processDone();
                }
            }
        });
        if (this.selectType != 0 || (i = this.type) == 2 || i == 0 || i == 3) {
            this.searchListViewAdapter = new SearchAdapter(context);
            ActionBarMenu createMenu = this.actionBar.createMenu();
            ActionBarMenuItem actionBarMenuItemSearchListener = createMenu.addItem(0, R.drawable.outline_header_search).setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() { // from class: org.telegram.ui.ChatUsersActivity.2
                @Override // org.telegram.ui.ActionBar.ActionBarMenuItem.ActionBarMenuItemSearchListener
                public void onSearchExpand() {
                    ChatUsersActivity.this.searching = true;
                    if (ChatUsersActivity.this.doneItem != null) {
                        ChatUsersActivity.this.doneItem.setVisibility(8);
                    }
                }

                @Override // org.telegram.ui.ActionBar.ActionBarMenuItem.ActionBarMenuItemSearchListener
                public void onSearchCollapse() {
                    ChatUsersActivity.this.searchListViewAdapter.searchUsers(null);
                    ChatUsersActivity.this.searching = false;
                    ChatUsersActivity.this.listView.setAnimateEmptyView(false, 0);
                    ChatUsersActivity.this.listView.setAdapter(ChatUsersActivity.this.listViewAdapter);
                    ChatUsersActivity.this.listViewAdapter.notifyDataSetChanged();
                    ChatUsersActivity.this.listView.setFastScrollVisible(true);
                    ChatUsersActivity.this.listView.setVerticalScrollBarEnabled(false);
                    if (ChatUsersActivity.this.doneItem != null) {
                        ChatUsersActivity.this.doneItem.setVisibility(0);
                    }
                }

                @Override // org.telegram.ui.ActionBar.ActionBarMenuItem.ActionBarMenuItemSearchListener
                public void onTextChanged(EditText editText) {
                    if (ChatUsersActivity.this.searchListViewAdapter == null) {
                        return;
                    }
                    String obj = editText.getText().toString();
                    int itemCount = ChatUsersActivity.this.listView.getAdapter() == null ? 0 : ChatUsersActivity.this.listView.getAdapter().getItemCount();
                    ChatUsersActivity.this.searchListViewAdapter.searchUsers(obj);
                    if (TextUtils.isEmpty(obj) && ChatUsersActivity.this.listView != null && ChatUsersActivity.this.listView.getAdapter() != ChatUsersActivity.this.listViewAdapter) {
                        ChatUsersActivity.this.listView.setAnimateEmptyView(false, 0);
                        ChatUsersActivity.this.listView.setAdapter(ChatUsersActivity.this.listViewAdapter);
                        if (itemCount == 0) {
                            ChatUsersActivity.this.showItemsAnimated(0);
                        }
                    }
                    ChatUsersActivity.this.progressBar.setVisibility(8);
                    ChatUsersActivity.this.flickerLoadingView.setVisibility(0);
                }
            });
            this.searchItem = actionBarMenuItemSearchListener;
            if (this.type == 0 && !this.firstLoaded) {
                actionBarMenuItemSearchListener.setVisibility(8);
            }
            if (this.type == 3) {
                this.searchItem.setSearchFieldHint(LocaleController.getString("ChannelSearchException", R.string.ChannelSearchException));
            } else {
                this.searchItem.setSearchFieldHint(LocaleController.getString("Search", R.string.Search));
            }
            if (!ChatObject.isChannel(this.currentChat) && !this.currentChat.creator) {
                this.searchItem.setVisibility(8);
            }
            if (this.type == 3) {
                this.doneItem = createMenu.addItemWithWidth(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f), LocaleController.getString("Done", R.string.Done));
            }
        } else if (i == 1 && ChatObject.isChannelAndNotMegaGroup(this.currentChat) && ChatObject.hasAdminRights(this.currentChat)) {
            this.doneItem = this.actionBar.createMenu().addItemWithWidth(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f), LocaleController.getString("Done", R.string.Done));
        }
        FrameLayout frameLayout = new FrameLayout(context) { // from class: org.telegram.ui.ChatUsersActivity.3
            @Override // android.view.ViewGroup, android.view.View
            protected void dispatchDraw(Canvas canvas) {
                canvas.drawColor(Theme.getColor(ChatUsersActivity.this.listView.getAdapter() == ChatUsersActivity.this.searchListViewAdapter ? Theme.key_windowBackgroundWhite : Theme.key_windowBackgroundGray));
                super.dispatchDraw(canvas);
            }
        };
        this.fragmentView = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context);
        this.flickerLoadingView = flickerLoadingView;
        flickerLoadingView.setViewType(6);
        this.flickerLoadingView.showDate(false);
        this.flickerLoadingView.setUseHeaderOffset(true);
        FlickerLoadingView flickerLoadingView2 = this.flickerLoadingView;
        int i4 = Theme.key_actionBarDefaultSubmenuBackground;
        int i5 = Theme.key_listSelector;
        flickerLoadingView2.setColors(i4, i5, i5);
        frameLayout2.addView(this.flickerLoadingView);
        RadialProgressView radialProgressView = new RadialProgressView(context);
        this.progressBar = radialProgressView;
        frameLayout2.addView(radialProgressView, LayoutHelper.createFrame(-2, -2, 17));
        this.flickerLoadingView.setVisibility(8);
        this.progressBar.setVisibility(8);
        StickerEmptyView stickerEmptyView = new StickerEmptyView(context, frameLayout2, 1);
        this.emptyView = stickerEmptyView;
        stickerEmptyView.title.setText(LocaleController.getString(R.string.NoResult));
        this.emptyView.subtitle.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
        this.emptyView.setVisibility(8);
        this.emptyView.setAnimateLayoutChange(true);
        this.emptyView.showProgress(true, false);
        frameLayout.addView(this.emptyView, LayoutHelper.createFrame(-1, -1.0f));
        this.emptyView.addView(frameLayout2, 0);
        RecyclerListView recyclerListView = new RecyclerListView(context) { // from class: org.telegram.ui.ChatUsersActivity.4
            @Override // android.view.View
            public void invalidate() {
                super.invalidate();
                View view = ChatUsersActivity.this.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
            }
        };
        this.listView = recyclerListView;
        recyclerListView.setSections();
        RecyclerListView recyclerListView2 = this.listView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, r2, z) { // from class: org.telegram.ui.ChatUsersActivity.5
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public int scrollVerticallyBy(int i6, RecyclerView.Recycler recycler, RecyclerView.State state) {
                if (!ChatUsersActivity.this.firstLoaded && ChatUsersActivity.this.type == 0 && ChatUsersActivity.this.participants.size() == 0) {
                    return 0;
                }
                return super.scrollVerticallyBy(i6, recycler, state);
            }
        };
        this.layoutManager = linearLayoutManager;
        recyclerListView2.setLayoutManager(linearLayoutManager);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() { // from class: org.telegram.ui.ChatUsersActivity.6
            AnimationNotificationsLocker notificationsLocker = new AnimationNotificationsLocker();

            @Override // androidx.recyclerview.widget.DefaultItemAnimator
            protected void onAllAnimationsDone() {
                super.onAllAnimationsDone();
                this.notificationsLocker.unlock();
            }

            @Override // androidx.recyclerview.widget.DefaultItemAnimator, androidx.recyclerview.widget.RecyclerView.ItemAnimator
            public void runPendingAnimations() {
                boolean isEmpty = this.mPendingRemovals.isEmpty();
                boolean isEmpty2 = this.mPendingMoves.isEmpty();
                boolean isEmpty3 = this.mPendingChanges.isEmpty();
                boolean isEmpty4 = this.mPendingAdditions.isEmpty();
                if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                    this.notificationsLocker.lock();
                }
                super.runPendingAnimations();
            }

            @Override // androidx.recyclerview.widget.DefaultItemAnimator
            protected void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                super.onMoveAnimationUpdate(viewHolder);
                ChatUsersActivity.this.listView.invalidate();
            }

            @Override // androidx.recyclerview.widget.DefaultItemAnimator
            protected void onChangeAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                super.onChangeAnimationUpdate(viewHolder);
                ChatUsersActivity.this.listView.invalidate();
            }
        };
        defaultItemAnimator.setDurations(420L);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setSupportsChangeAnimations(false);
        this.listView.setItemAnimator(defaultItemAnimator);
        this.listView.setAnimateEmptyView(true, 0);
        RecyclerListView recyclerListView3 = this.listView;
        ListAdapter listAdapter = new ListAdapter(context);
        this.listViewAdapter = listAdapter;
        recyclerListView3.setAdapter(listAdapter);
        this.listView.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.actionBar.setAdaptiveBackground(this.listView);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListenerExtended() { // from class: org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda6
            @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListenerExtended
            public /* synthetic */ boolean hasDoubleTap(View view, int i6) {
                return RecyclerListView.OnItemClickListenerExtended.-CC.$default$hasDoubleTap(this, view, i6);
            }

            @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListenerExtended
            public /* synthetic */ void onDoubleTap(View view, int i6, float f, float f2) {
                RecyclerListView.OnItemClickListenerExtended.-CC.$default$onDoubleTap(this, view, i6, f, f2);
            }

            @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListenerExtended
            public final void onItemClick(View view, int i6, float f, float f2) {
                ChatUsersActivity.this.lambda$createView$6(view, i6, f, f2);
            }
        });
        this.listView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() { // from class: org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda7
            @Override // org.telegram.ui.Components.RecyclerListView.OnItemLongClickListener
            public final boolean onItemClick(View view, int i6) {
                boolean lambda$createView$7;
                lambda$createView$7 = ChatUsersActivity.this.lambda$createView$7(view, i6);
                return lambda$createView$7;
            }
        });
        if (this.searchItem != null) {
            this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() { // from class: org.telegram.ui.ChatUsersActivity.12
                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView, int i6, int i7) {
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView, int i6) {
                    if (i6 == 1) {
                        AndroidUtilities.hideKeyboard(ChatUsersActivity.this.getParentActivity().getCurrentFocus());
                    }
                }
            });
        }
        UndoView undoView = new UndoView(context);
        this.undoView = undoView;
        frameLayout.addView(undoView, LayoutHelper.createFrame(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        updateRows();
        this.listView.setEmptyView(this.emptyView);
        this.listView.setAnimateEmptyView(false, 0);
        if (this.needOpenSearch) {
            this.searchItem.openSearch(false);
        }
        return this.fragmentView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$6(View view, int i, float f, float f2) {
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        View findViewByPosition;
        TLObject item;
        long j;
        final TLObject tLObject;
        String str;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z;
        boolean z2;
        boolean canBlockUsers;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        int i2 = 0;
        boolean z3 = this.listView.getAdapter() == this.listViewAdapter;
        if (i == this.signMessagesRow) {
            boolean z4 = !this.signatures;
            this.signatures = z4;
            ((TextCheckCell) view).setChecked(z4);
            AndroidUtilities.updateVisibleRows(this.listView);
            DiffCallback saveState = saveState();
            updateRows();
            updateListAnimated(saveState);
            this.listViewAdapter.notifyItemChanged(this.signMessagesInfoRow);
        } else if (i == this.signMessagesProfilesRow) {
            boolean z5 = !this.profiles;
            this.profiles = z5;
            ((TextCheckCell) view).setChecked(z5);
            AndroidUtilities.updateVisibleRows(this.listView);
            DiffCallback saveState2 = saveState();
            updateRows();
            updateListAnimated(saveState2);
            this.listViewAdapter.notifyItemChanged(this.signMessagesInfoRow);
        } else if (i == this.payRow) {
            boolean z6 = !this.enablePrice;
            this.enablePrice = z6;
            ((TextCheckCell) view).setChecked(z6);
            AndroidUtilities.updateVisibleRows(this.listView);
            DiffCallback saveState3 = saveState();
            updateRows();
            updateListAnimated(saveState3);
            this.listViewAdapter.notifyItemChanged(this.payRow);
        } else if (z3) {
            if (isExpandableSendMediaRow(i)) {
                CheckBoxCell checkBoxCell = (CheckBoxCell) view;
                if (i == this.sendMediaPhotosRow) {
                    this.defaultBannedRights.send_photos = !r8.send_photos;
                } else if (i == this.sendMediaVideosRow) {
                    this.defaultBannedRights.send_videos = !r8.send_videos;
                } else if (i == this.sendMediaStickerGifsRow) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights3 = this.defaultBannedRights;
                    boolean z7 = !tL_chatBannedRights3.send_stickers;
                    tL_chatBannedRights3.send_inline = z7;
                    tL_chatBannedRights3.send_gifs = z7;
                    tL_chatBannedRights3.send_games = z7;
                    tL_chatBannedRights3.send_stickers = z7;
                } else if (i == this.sendMediaMusicRow) {
                    this.defaultBannedRights.send_audios = !r8.send_audios;
                } else if (i == this.sendMediaFilesRow) {
                    this.defaultBannedRights.send_docs = !r8.send_docs;
                } else if (i == this.sendMediaVoiceMessagesRow) {
                    this.defaultBannedRights.send_voices = !r8.send_voices;
                } else if (i == this.sendMediaVideoMessagesRow) {
                    this.defaultBannedRights.send_roundvideos = !r8.send_roundvideos;
                } else if (i == this.sendMediaEmbededLinksRow) {
                    if (this.defaultBannedRights.send_plain && (findViewByPosition = this.layoutManager.findViewByPosition(this.sendMessagesRow)) != null) {
                        AndroidUtilities.shakeViewSpring(findViewByPosition);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        return;
                    } else {
                        this.defaultBannedRights.embed_links = !r8.embed_links;
                    }
                } else if (i == this.sendPollsRow) {
                    this.defaultBannedRights.send_polls = !r8.send_polls;
                }
                checkBoxCell.setChecked(!checkBoxCell.isChecked(), true);
                AndroidUtilities.updateVisibleRows(this.listView);
                DiffCallback saveState4 = saveState();
                updateRows();
                updateListAnimated(saveState4);
            } else if (i == this.dontRestrictBoostersRow) {
                TextCheckCell2 textCheckCell2 = (TextCheckCell2) view;
                boolean z8 = !textCheckCell2.isChecked();
                this.isEnabledNotRestrictBoosters = z8;
                textCheckCell2.setChecked(z8);
                AndroidUtilities.updateVisibleRows(this.listView);
                DiffCallback saveState5 = saveState();
                updateRows();
                updateListAnimated(saveState5);
            } else {
                if (i == this.addNewRow) {
                    int i3 = this.type;
                    if (i3 == 0 || i3 == 3) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.chatId);
                        bundle.putInt("type", 2);
                        bundle.putInt("selectType", this.type == 0 ? 2 : 3);
                        ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
                        chatUsersActivity.setInfo(this.info);
                        chatUsersActivity.setBannedRights(this.defaultBannedRights);
                        chatUsersActivity.setDelegate(new ChatUsersActivityDelegate() { // from class: org.telegram.ui.ChatUsersActivity.7
                            @Override // org.telegram.ui.ChatUsersActivity.ChatUsersActivityDelegate
                            public /* synthetic */ void didChangeOwner(TLRPC.User user) {
                                ChatUsersActivityDelegate.-CC.$default$didChangeOwner(this, user);
                            }

                            @Override // org.telegram.ui.ChatUsersActivity.ChatUsersActivityDelegate
                            public /* synthetic */ void didSelectUser(long j2) {
                                ChatUsersActivityDelegate.-CC.$default$didSelectUser(this, j2);
                            }

                            @Override // org.telegram.ui.ChatUsersActivity.ChatUsersActivityDelegate
                            public void didAddParticipantToList(long j2, TLObject tLObject2) {
                                if (ChatUsersActivity.this.participantsMap.get(j2) == null) {
                                    DiffCallback saveState6 = ChatUsersActivity.this.saveState();
                                    ChatUsersActivity.this.participants.add(tLObject2);
                                    ChatUsersActivity.this.participantsMap.put(j2, tLObject2);
                                    ChatUsersActivity chatUsersActivity2 = ChatUsersActivity.this;
                                    chatUsersActivity2.sortUsers(chatUsersActivity2.participants);
                                    ChatUsersActivity.this.updateListAnimated(saveState6);
                                }
                            }

                            @Override // org.telegram.ui.ChatUsersActivity.ChatUsersActivityDelegate
                            public void didKickParticipant(long j2) {
                                if (ChatUsersActivity.this.participantsMap.get(j2) == null) {
                                    DiffCallback saveState6 = ChatUsersActivity.this.saveState();
                                    TLRPC.TL_channelParticipantBanned tL_channelParticipantBanned = new TLRPC.TL_channelParticipantBanned();
                                    if (j2 > 0) {
                                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                        tL_channelParticipantBanned.peer = tL_peerUser;
                                        tL_peerUser.user_id = j2;
                                    } else {
                                        TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                        tL_channelParticipantBanned.peer = tL_peerChannel;
                                        tL_peerChannel.channel_id = -j2;
                                    }
                                    tL_channelParticipantBanned.date = ChatUsersActivity.this.getConnectionsManager().getCurrentTime();
                                    tL_channelParticipantBanned.kicked_by = ChatUsersActivity.this.getAccountInstance().getUserConfig().clientUserId;
                                    ChatUsersActivity.this.info.kicked_count++;
                                    ChatUsersActivity.this.participants.add(tL_channelParticipantBanned);
                                    ChatUsersActivity.this.participantsMap.put(j2, tL_channelParticipantBanned);
                                    ChatUsersActivity chatUsersActivity2 = ChatUsersActivity.this;
                                    chatUsersActivity2.sortUsers(chatUsersActivity2.participants);
                                    ChatUsersActivity.this.updateListAnimated(saveState6);
                                }
                            }
                        });
                        presentFragment(chatUsersActivity);
                        return;
                    }
                    if (i3 == 1) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", this.chatId);
                        bundle2.putInt("type", 2);
                        bundle2.putInt("selectType", 1);
                        ChatUsersActivity chatUsersActivity2 = new ChatUsersActivity(bundle2);
                        chatUsersActivity2.setDelegate(new 8());
                        chatUsersActivity2.setInfo(this.info);
                        presentFragment(chatUsersActivity2);
                        return;
                    }
                    if (i3 == 2) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putBoolean("addToGroup", true);
                        bundle3.putLong(this.isChannel ? "channelId" : "chatId", this.currentChat.id);
                        GroupCreateActivity groupCreateActivity = new GroupCreateActivity(bundle3);
                        groupCreateActivity.setInfo(this.info);
                        LongSparseArray longSparseArray = this.contactsMap;
                        groupCreateActivity.setIgnoreUsers((longSparseArray == null || longSparseArray.size() == 0) ? this.participantsMap : this.contactsMap);
                        groupCreateActivity.setDelegate2(new 9(groupCreateActivity));
                        presentFragment(groupCreateActivity);
                        return;
                    }
                    return;
                }
                if (i == this.recentActionsRow) {
                    presentFragment(new ChannelAdminLogActivity(this.currentChat));
                    return;
                }
                if (i == this.antiSpamRow) {
                    final TextCell textCell = (TextCell) view;
                    TLRPC.ChatFull chatFull3 = this.info;
                    if (chatFull3 != null && !chatFull3.antispam && getParticipantsCount() < getMessagesController().telegramAntispamGroupSizeMin) {
                        BulletinFactory.of(this).createSimpleBulletin(R.raw.msg_antispam, AndroidUtilities.replaceTags(LocaleController.formatPluralString("ChannelAntiSpamForbidden", getMessagesController().telegramAntispamGroupSizeMin, new Object[0]))).show();
                        return;
                    }
                    if (this.info == null || !ChatObject.canUserDoAdminAction(this.currentChat, 13) || this.antiSpamToggleLoading) {
                        return;
                    }
                    this.antiSpamToggleLoading = true;
                    final boolean z9 = this.info.antispam;
                    TLRPC.TL_channels_toggleAntiSpam tL_channels_toggleAntiSpam = new TLRPC.TL_channels_toggleAntiSpam();
                    tL_channels_toggleAntiSpam.channel = getMessagesController().getInputChannel(this.chatId);
                    TLRPC.ChatFull chatFull4 = this.info;
                    boolean z10 = true ^ chatFull4.antispam;
                    chatFull4.antispam = z10;
                    tL_channels_toggleAntiSpam.enabled = z10;
                    textCell.setChecked(z10);
                    Switch checkBox = textCell.getCheckBox();
                    if (!ChatObject.canUserDoAdminAction(this.currentChat, 13) || ((chatFull2 = this.info) != null && !chatFull2.antispam && getParticipantsCount() < getMessagesController().telegramAntispamGroupSizeMin)) {
                        i2 = R.drawable.permission_locked;
                    }
                    checkBox.setIcon(i2);
                    getConnectionsManager().sendRequest(tL_channels_toggleAntiSpam, new RequestDelegate() { // from class: org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda23
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                            ChatUsersActivity.this.lambda$createView$1(textCell, z9, tLObject2, tL_error);
                        }
                    });
                    return;
                }
                if (i == this.hideMembersRow) {
                    final TextCell textCell2 = (TextCell) view;
                    if (getParticipantsCount() < getMessagesController().hiddenMembersGroupSizeMin) {
                        BulletinFactory.of(this).createSimpleBulletin(R.raw.contacts_sync_off, AndroidUtilities.replaceTags(LocaleController.formatPluralString("ChannelHiddenMembersForbidden", getMessagesController().hiddenMembersGroupSizeMin, new Object[0]))).show();
                        return;
                    }
                    if (this.info == null || !ChatObject.canUserDoAdminAction(this.currentChat, 2) || this.hideMembersToggleLoading) {
                        return;
                    }
                    this.hideMembersToggleLoading = true;
                    final boolean z11 = this.info.participants_hidden;
                    TLRPC.TL_channels_toggleParticipantsHidden tL_channels_toggleParticipantsHidden = new TLRPC.TL_channels_toggleParticipantsHidden();
                    tL_channels_toggleParticipantsHidden.channel = getMessagesController().getInputChannel(this.chatId);
                    TLRPC.ChatFull chatFull5 = this.info;
                    boolean z12 = true ^ chatFull5.participants_hidden;
                    chatFull5.participants_hidden = z12;
                    tL_channels_toggleParticipantsHidden.enabled = z12;
                    textCell2.setChecked(z12);
                    Switch checkBox2 = textCell2.getCheckBox();
                    if (!ChatObject.canUserDoAdminAction(this.currentChat, 2) || ((chatFull = this.info) != null && !chatFull.participants_hidden && getParticipantsCount() < getMessagesController().hiddenMembersGroupSizeMin)) {
                        i2 = R.drawable.permission_locked;
                    }
                    checkBox2.setIcon(i2);
                    getConnectionsManager().sendRequest(tL_channels_toggleParticipantsHidden, new RequestDelegate() { // from class: org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda24
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                            ChatUsersActivity.this.lambda$createView$3(textCell2, z11, tLObject2, tL_error);
                        }
                    });
                    return;
                }
                if (i == this.tagsRow) {
                    if (this.currentChat == null) {
                        return;
                    }
                    final TextCell textCell3 = (TextCell) view;
                    final boolean isChecked = textCell3.isChecked();
                    textCell3.setChecked(!textCell3.isChecked());
                    TLRPC.TL_messages_editChatDefaultBannedRights tL_messages_editChatDefaultBannedRights = new TLRPC.TL_messages_editChatDefaultBannedRights();
                    tL_messages_editChatDefaultBannedRights.peer = MessagesController.getInputPeer(this.currentChat);
                    TLRPC.Chat chat = this.currentChat;
                    if (chat.default_banned_rights == null) {
                        chat.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    TLRPC.TL_chatBannedRights tL_chatBannedRights4 = this.currentChat.default_banned_rights;
                    tL_messages_editChatDefaultBannedRights.banned_rights = tL_chatBannedRights4;
                    tL_chatBannedRights4.edit_rank = !textCell3.isChecked();
                    getConnectionsManager().sendRequestTyped(tL_messages_editChatDefaultBannedRights, new BotForumHelper$$ExternalSyntheticLambda2(), new Utilities.Callback2() { // from class: org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda25
                        @Override // org.telegram.messenger.Utilities.Callback2
                        public final void run(Object obj, Object obj2) {
                            ChatUsersActivity.this.lambda$createView$4(textCell3, isChecked, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                        }
                    });
                } else {
                    if (i == this.removedUsersRow) {
                        Bundle bundle4 = new Bundle();
                        bundle4.putLong("chat_id", this.chatId);
                        bundle4.putInt("type", 0);
                        ChatUsersActivity chatUsersActivity3 = new ChatUsersActivity(bundle4);
                        chatUsersActivity3.setInfo(this.info);
                        presentFragment(chatUsersActivity3);
                        return;
                    }
                    if (i == this.gigaConvertRow) {
                        showDialog(new 10(getParentActivity(), this));
                    } else {
                        if (i == this.addNew2Row) {
                            if (this.info != null) {
                                ManageLinksActivity manageLinksActivity = new ManageLinksActivity(this.chatId, 0L, 0);
                                TLRPC.ChatFull chatFull6 = this.info;
                                manageLinksActivity.setInfo(chatFull6, chatFull6.exported_invite);
                                presentFragment(manageLinksActivity);
                                return;
                            }
                            return;
                        }
                        if (i > this.permissionsSectionRow && i <= Math.max(this.manageTopicsRow, this.changeInfoRow)) {
                            TextCheckCell2 textCheckCell22 = (TextCheckCell2) view;
                            if (textCheckCell22.isEnabled()) {
                                if (textCheckCell22.hasIcon()) {
                                    if (ChatObject.isPublic(this.currentChat) && (i == this.pinMessagesRow || i == this.changeInfoRow)) {
                                        BulletinFactory.of(this).createErrorBulletin(LocaleController.getString(R.string.EditCantEditPermissionsPublic)).show();
                                        return;
                                    } else if (ChatObject.isDiscussionGroup(this.currentAccount, this.chatId) && (i == this.pinMessagesRow || i == this.changeInfoRow)) {
                                        BulletinFactory.of(this).createErrorBulletin(LocaleController.getString(R.string.EditCantEditPermissionsDiscussion)).show();
                                        return;
                                    } else {
                                        BulletinFactory.of(this).createErrorBulletin(LocaleController.getString("EditCantEditPermissions", R.string.EditCantEditPermissions)).show();
                                        return;
                                    }
                                }
                                if (i == this.sendMediaRow) {
                                    DiffCallback saveState6 = saveState();
                                    this.sendMediaExpanded = !this.sendMediaExpanded;
                                    AndroidUtilities.updateVisibleRows(this.listView);
                                    updateListAnimated(saveState6);
                                    return;
                                }
                                textCheckCell22.setChecked(!textCheckCell22.isChecked());
                                if (i == this.changeInfoRow) {
                                    this.defaultBannedRights.change_info = !r0.change_info;
                                    return;
                                }
                                if (i == this.addUsersRow) {
                                    this.defaultBannedRights.invite_users = !r0.invite_users;
                                    return;
                                }
                                if (i == this.manageTopicsRow) {
                                    this.defaultBannedRights.manage_topics = !r0.manage_topics;
                                    return;
                                }
                                if (i == this.pinMessagesRow) {
                                    this.defaultBannedRights.pin_messages = !r0.pin_messages;
                                    return;
                                }
                                if (i == this.editTagRow) {
                                    this.defaultBannedRights.edit_rank = !r0.edit_rank;
                                    return;
                                }
                                if (i == this.sendMessagesRow) {
                                    this.defaultBannedRights.send_plain = !r0.send_plain;
                                    int i4 = this.sendMediaEmbededLinksRow;
                                    if (i4 >= 0) {
                                        this.listViewAdapter.notifyItemChanged(i4);
                                    }
                                    int i5 = this.sendMediaRow;
                                    if (i5 >= 0) {
                                        this.listViewAdapter.notifyItemChanged(i5);
                                    }
                                    DiffCallback saveState7 = saveState();
                                    updateRows();
                                    updateListAnimated(saveState7);
                                    return;
                                }
                                if (i == this.sendMediaRow) {
                                    DiffCallback saveState8 = saveState();
                                    this.sendMediaExpanded = !this.sendMediaExpanded;
                                    AndroidUtilities.updateVisibleRows(this.listView);
                                    updateListAnimated(saveState8);
                                    return;
                                }
                                if (i == this.sendStickersRow) {
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights5 = this.defaultBannedRights;
                                    boolean z13 = !tL_chatBannedRights5.send_stickers;
                                    tL_chatBannedRights5.send_inline = z13;
                                    tL_chatBannedRights5.send_gifs = z13;
                                    tL_chatBannedRights5.send_games = z13;
                                    tL_chatBannedRights5.send_stickers = z13;
                                    return;
                                }
                                if (i == this.embedLinksRow) {
                                    this.defaultBannedRights.embed_links = !r0.embed_links;
                                    return;
                                } else {
                                    if (i == this.sendPollsRow) {
                                        this.defaultBannedRights.send_polls = !r0.send_polls;
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        }
                    }
                }
            }
        }
        if (z3) {
            item = this.listViewAdapter.getItem(i);
            if (item instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) item;
                j = MessageObject.getPeerId(channelParticipant.peer);
                TLRPC.TL_chatBannedRights tL_chatBannedRights6 = channelParticipant.banned_rights;
                TLRPC.TL_chatAdminRights tL_chatAdminRights2 = channelParticipant.admin_rights;
                String str2 = channelParticipant.rank;
                boolean z14 = !((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) || (channelParticipant instanceof TLRPC.TL_channelParticipantCreator)) || channelParticipant.can_edit;
                if ((item instanceof TLRPC.TL_channelParticipantCreator) && (tL_chatAdminRights2 = ((TLRPC.TL_channelParticipantCreator) item).admin_rights) == null) {
                    tL_chatAdminRights2 = new TLRPC.TL_chatAdminRights();
                    tL_chatAdminRights2.manage_ranks = true;
                    tL_chatAdminRights2.add_admins = true;
                    tL_chatAdminRights2.pin_messages = true;
                    tL_chatAdminRights2.manage_topics = true;
                    tL_chatAdminRights2.invite_users = true;
                    tL_chatAdminRights2.ban_users = true;
                    tL_chatAdminRights2.delete_messages = true;
                    tL_chatAdminRights2.edit_messages = true;
                    tL_chatAdminRights2.post_messages = true;
                    tL_chatAdminRights2.change_info = true;
                    if (!this.isChannel) {
                        tL_chatAdminRights2.manage_call = true;
                    }
                }
                tLObject = item;
                tL_chatAdminRights = tL_chatAdminRights2;
                str = str2;
                z = z14;
                tL_chatBannedRights = tL_chatBannedRights6;
            } else if (!(item instanceof TLRPC.ChatParticipant)) {
                tLObject = item;
                str = "";
                j = 0;
                tL_chatBannedRights = null;
                tL_chatAdminRights = null;
                z = false;
            } else {
                j = ((TLRPC.ChatParticipant) item).user_id;
                z2 = this.currentChat.creator;
                if (item instanceof TLRPC.TL_chatParticipantCreator) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights3 = new TLRPC.TL_chatAdminRights();
                    tL_chatAdminRights3.manage_ranks = true;
                    tL_chatAdminRights3.add_admins = true;
                    tL_chatAdminRights3.pin_messages = true;
                    tL_chatAdminRights3.manage_topics = true;
                    tL_chatAdminRights3.invite_users = true;
                    tL_chatAdminRights3.ban_users = true;
                    tL_chatAdminRights3.delete_messages = true;
                    tL_chatAdminRights3.edit_messages = true;
                    tL_chatAdminRights3.post_messages = true;
                    tL_chatAdminRights3.change_info = true;
                    if (!this.isChannel) {
                        tL_chatAdminRights3.manage_call = true;
                    }
                    z = z2;
                    str = "";
                    tL_chatAdminRights = tL_chatAdminRights3;
                    tL_chatBannedRights = null;
                    tLObject = item;
                }
                tLObject = item;
                z = z2;
                str = "";
                tL_chatBannedRights = null;
                tL_chatAdminRights = null;
            }
        } else {
            item = this.searchListViewAdapter.getItem(i);
            if (item instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) item;
                getMessagesController().putUser(user, false);
                long j2 = user.id;
                j = j2;
                item = getAnyParticipant(j2);
            } else if ((item instanceof TLRPC.ChannelParticipant) || (item instanceof TLRPC.ChatParticipant)) {
                j = 0;
            } else {
                j = 0;
                item = null;
            }
            if (item instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) item;
                j = MessageObject.getPeerId(channelParticipant2.peer);
                boolean z15 = !((channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin) || (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator)) || channelParticipant2.can_edit;
                TLRPC.TL_chatBannedRights tL_chatBannedRights7 = channelParticipant2.banned_rights;
                TLRPC.TL_chatAdminRights tL_chatAdminRights4 = channelParticipant2.admin_rights;
                str = channelParticipant2.rank;
                z = z15;
                tL_chatAdminRights = tL_chatAdminRights4;
                tL_chatBannedRights = tL_chatBannedRights7;
                tLObject = item;
            } else if (!(item instanceof TLRPC.ChatParticipant)) {
                tLObject = item;
                str = "";
                tL_chatBannedRights = null;
                tL_chatAdminRights = null;
                if (item == null) {
                    z = true;
                }
                z = false;
            } else {
                j = ((TLRPC.ChatParticipant) item).user_id;
                z2 = this.currentChat.creator;
                tLObject = item;
                z = z2;
                str = "";
                tL_chatBannedRights = null;
                tL_chatAdminRights = null;
            }
        }
        if (j != 0) {
            int i6 = this.selectType;
            if (i6 != 0) {
                if (i6 == 3 || i6 == 1) {
                    if (i6 != 1 && z && ((tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin))) {
                        final TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(j));
                        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                        builder.setTitle(LocaleController.getString("AppName", R.string.AppName));
                        builder.setMessage(LocaleController.formatString("AdminWillBeRemoved", R.string.AdminWillBeRemoved, UserObject.getUserName(user2)));
                        final TLObject tLObject2 = tLObject;
                        final TLRPC.TL_chatAdminRights tL_chatAdminRights5 = tL_chatAdminRights;
                        final TLRPC.TL_chatBannedRights tL_chatBannedRights8 = tL_chatBannedRights;
                        final String str3 = str;
                        final boolean z16 = z;
                        builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda26
                            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                            public final void onClick(AlertDialog alertDialog, int i7) {
                                ChatUsersActivity.this.lambda$createView$5(user2, tLObject2, tL_chatAdminRights5, tL_chatBannedRights8, str3, z16, alertDialog, i7);
                            }
                        });
                        builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                        showDialog(builder.create());
                        return;
                    }
                    openRightsEdit(j, tLObject, tL_chatAdminRights, tL_chatBannedRights, str, z, i6 == 1 ? 0 : 1, i6 == 1 || i6 == 3);
                    return;
                }
                removeParticipant(j);
                return;
            }
            int i7 = this.type;
            if (i7 == 1) {
                if (j != getUserConfig().getClientUserId() && (this.currentChat.creator || z)) {
                    canBlockUsers = true;
                }
                canBlockUsers = false;
            } else {
                if (i7 == 0 || i7 == 3) {
                    canBlockUsers = ChatObject.canBlockUsers(this.currentChat);
                }
                canBlockUsers = false;
            }
            int i8 = this.type;
            if (i8 == 0 || ((i8 != 1 && this.isChannel) || (i8 == 2 && this.selectType == 0))) {
                if (j == getUserConfig().getClientUserId()) {
                    return;
                }
                Bundle bundle5 = new Bundle();
                if (j > 0) {
                    bundle5.putLong("user_id", j);
                } else {
                    bundle5.putLong("chat_id", -j);
                }
                presentFragment(new ProfileActivity(bundle5));
                return;
            }
            if (tL_chatBannedRights == null) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights9 = new TLRPC.TL_chatBannedRights();
                tL_chatBannedRights9.view_messages = true;
                tL_chatBannedRights9.send_stickers = true;
                tL_chatBannedRights9.send_media = true;
                tL_chatBannedRights9.send_photos = true;
                tL_chatBannedRights9.send_videos = true;
                tL_chatBannedRights9.send_roundvideos = true;
                tL_chatBannedRights9.send_audios = true;
                tL_chatBannedRights9.send_voices = true;
                tL_chatBannedRights9.send_docs = true;
                tL_chatBannedRights9.embed_links = true;
                tL_chatBannedRights9.send_plain = true;
                tL_chatBannedRights9.send_messages = true;
                tL_chatBannedRights9.send_games = true;
                tL_chatBannedRights9.send_inline = true;
                tL_chatBannedRights9.send_gifs = true;
                tL_chatBannedRights9.pin_messages = true;
                tL_chatBannedRights9.edit_rank = true;
                tL_chatBannedRights9.send_polls = true;
                tL_chatBannedRights9.invite_users = true;
                tL_chatBannedRights9.manage_topics = true;
                tL_chatBannedRights9.change_info = true;
                tL_chatBannedRights2 = tL_chatBannedRights9;
            } else {
                tL_chatBannedRights2 = tL_chatBannedRights;
            }
            ChatRightsEditActivity chatRightsEditActivity = new ChatRightsEditActivity(j, this.chatId, tL_chatAdminRights, this.defaultBannedRights, tL_chatBannedRights2, str, this.type == 1 ? 0 : 1, canBlockUsers, tLObject == null, null);
            chatRightsEditActivity.setDelegate(new ChatRightsEditActivity.ChatRightsEditActivityDelegate() { // from class: org.telegram.ui.ChatUsersActivity.11
                @Override // org.telegram.ui.ChatRightsEditActivity.ChatRightsEditActivityDelegate
                public void didSetRights(int i9, TLRPC.TL_chatAdminRights tL_chatAdminRights6, TLRPC.TL_chatBannedRights tL_chatBannedRights10, String str4) {
                    TLObject tLObject3 = tLObject;
                    if (tLObject3 instanceof TLRPC.ChannelParticipant) {
                        TLRPC.ChannelParticipant channelParticipant3 = (TLRPC.ChannelParticipant) tLObject3;
                        channelParticipant3.admin_rights = tL_chatAdminRights6;
                        channelParticipant3.banned_rights = tL_chatBannedRights10;
                        channelParticipant3.rank = str4;
                        ChatUsersActivity.this.updateParticipantWithRights(channelParticipant3, tL_chatAdminRights6, tL_chatBannedRights10, 0L, false);
                    }
                }

                @Override // org.telegram.ui.ChatRightsEditActivity.ChatRightsEditActivityDelegate
                public void didChangeOwner(TLRPC.User user3) {
                    ChatUsersActivity.this.onOwnerChaged(user3);
                }
            });
            presentFragment(chatRightsEditActivity);
        }
    }

    class 8 implements ChatUsersActivityDelegate {
        @Override // org.telegram.ui.ChatUsersActivity.ChatUsersActivityDelegate
        public /* synthetic */ void didKickParticipant(long j) {
            ChatUsersActivityDelegate.-CC.$default$didKickParticipant(this, j);
        }

        8() {
        }

        @Override // org.telegram.ui.ChatUsersActivity.ChatUsersActivityDelegate
        public void didAddParticipantToList(long j, TLObject tLObject) {
            if (tLObject == null || ChatUsersActivity.this.participantsMap.get(j) != null) {
                return;
            }
            DiffCallback saveState = ChatUsersActivity.this.saveState();
            ChatUsersActivity.this.participants.add(tLObject);
            ChatUsersActivity.this.participantsMap.put(j, tLObject);
            ChatUsersActivity.sortAdmins(ChatUsersActivity.this.participants);
            ChatUsersActivity.this.updateListAnimated(saveState);
        }

        @Override // org.telegram.ui.ChatUsersActivity.ChatUsersActivityDelegate
        public void didChangeOwner(TLRPC.User user) {
            ChatUsersActivity.this.onOwnerChaged(user);
        }

        @Override // org.telegram.ui.ChatUsersActivity.ChatUsersActivityDelegate
        public void didSelectUser(long j) {
            final TLRPC.User user = ChatUsersActivity.this.getMessagesController().getUser(Long.valueOf(j));
            if (user != null) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ChatUsersActivity$8$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ChatUsersActivity.8.this.lambda$didSelectUser$0(user);
                    }
                }, 200L);
            }
            if (ChatUsersActivity.this.participantsMap.get(j) == null) {
                DiffCallback saveState = ChatUsersActivity.this.saveState();
                TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_channelParticipantAdmin.peer = tL_peerUser;
                tL_peerUser.user_id = user.id;
                tL_channelParticipantAdmin.date = ChatUsersActivity.this.getConnectionsManager().getCurrentTime();
                tL_channelParticipantAdmin.promoted_by = ChatUsersActivity.this.getAccountInstance().getUserConfig().clientUserId;
                ChatUsersActivity.this.participants.add(tL_channelParticipantAdmin);
                ChatUsersActivity.this.participantsMap.put(user.id, tL_channelParticipantAdmin);
                ChatUsersActivity.sortAdmins(ChatUsersActivity.this.participants);
                ChatUsersActivity.this.updateListAnimated(saveState);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$didSelectUser$0(TLRPC.User user) {
            if (BulletinFactory.canShowBulletin(ChatUsersActivity.this)) {
                BulletinFactory.createPromoteToAdminBulletin(ChatUsersActivity.this, user.first_name).show();
            }
        }
    }

    class 9 implements GroupCreateActivity.ContactsAddActivityDelegate {
        final /* synthetic */ GroupCreateActivity val$fragment;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$didSelectUsers$1(TLRPC.User user) {
        }

        9(GroupCreateActivity groupCreateActivity) {
            this.val$fragment = groupCreateActivity;
        }

        @Override // org.telegram.ui.GroupCreateActivity.ContactsAddActivityDelegate
        public void didSelectUsers(ArrayList arrayList, int i) {
            if (this.val$fragment.getParentActivity() == null) {
                return;
            }
            ChatUsersActivity.this.getMessagesController().addUsersToChat(ChatUsersActivity.this.currentChat, ChatUsersActivity.this, arrayList, i, new Consumer() { // from class: org.telegram.ui.ChatUsersActivity$9$$ExternalSyntheticLambda0
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    ChatUsersActivity.9.this.lambda$didSelectUsers$0((TLRPC.User) obj);
                }
            }, new Consumer() { // from class: org.telegram.ui.ChatUsersActivity$9$$ExternalSyntheticLambda1
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    ChatUsersActivity.9.lambda$didSelectUsers$1((TLRPC.User) obj);
                }
            }, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$didSelectUsers$0(TLRPC.User user) {
            DiffCallback saveState = ChatUsersActivity.this.saveState();
            ArrayList arrayList = (ChatUsersActivity.this.contactsMap == null || ChatUsersActivity.this.contactsMap.size() == 0) ? ChatUsersActivity.this.participants : ChatUsersActivity.this.contacts;
            LongSparseArray longSparseArray = (ChatUsersActivity.this.contactsMap == null || ChatUsersActivity.this.contactsMap.size() == 0) ? ChatUsersActivity.this.participantsMap : ChatUsersActivity.this.contactsMap;
            if (longSparseArray.get(user.id) == null) {
                if (ChatObject.isChannel(ChatUsersActivity.this.currentChat)) {
                    TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                    tL_channelParticipant.inviter_id = ChatUsersActivity.this.getUserConfig().getClientUserId();
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_channelParticipant.peer = tL_peerUser;
                    tL_peerUser.user_id = user.id;
                    tL_channelParticipant.date = ChatUsersActivity.this.getConnectionsManager().getCurrentTime();
                    arrayList.add(0, tL_channelParticipant);
                    longSparseArray.put(user.id, tL_channelParticipant);
                } else {
                    TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                    tL_chatParticipant.user_id = user.id;
                    tL_chatParticipant.inviter_id = ChatUsersActivity.this.getUserConfig().getClientUserId();
                    arrayList.add(0, tL_chatParticipant);
                    longSparseArray.put(user.id, tL_chatParticipant);
                }
            }
            if (arrayList == ChatUsersActivity.this.participants) {
                ChatUsersActivity.sortAdmins(ChatUsersActivity.this.participants);
            }
            ChatUsersActivity.this.updateListAnimated(saveState);
        }

        @Override // org.telegram.ui.GroupCreateActivity.ContactsAddActivityDelegate
        public void needAddBot(TLRPC.User user) {
            ChatUsersActivity.this.openRightsEdit(user.id, null, null, null, "", true, 0, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$1(final TextCell textCell, final boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
            getMessagesController().putChatFull(this.info);
        }
        if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda27
                @Override // java.lang.Runnable
                public final void run() {
                    ChatUsersActivity.this.lambda$createView$0(textCell, z);
                }
            });
        }
        this.antiSpamToggleLoading = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$0(TextCell textCell, boolean z) {
        TLRPC.ChatFull chatFull;
        if (getParentActivity() == null) {
            return;
        }
        this.info.antispam = z;
        textCell.setChecked(z);
        textCell.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(this.currentChat, 13) || ((chatFull = this.info) != null && chatFull.antispam && getParticipantsCount() < getMessagesController().telegramAntispamGroupSizeMin)) ? R.drawable.permission_locked : 0);
        BulletinFactory.of(this).createSimpleBulletin(R.raw.error, LocaleController.getString("UnknownError", R.string.UnknownError)).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$3(final TextCell textCell, final boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
            getMessagesController().putChatFull(this.info);
        }
        if (tL_error != null && !"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda28
                @Override // java.lang.Runnable
                public final void run() {
                    ChatUsersActivity.this.lambda$createView$2(textCell, z);
                }
            });
        }
        this.hideMembersToggleLoading = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$2(TextCell textCell, boolean z) {
        TLRPC.ChatFull chatFull;
        if (getParentActivity() == null) {
            return;
        }
        this.info.participants_hidden = z;
        textCell.setChecked(z);
        textCell.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(this.currentChat, 2) || ((chatFull = this.info) != null && chatFull.participants_hidden && getParticipantsCount() < getMessagesController().hiddenMembersGroupSizeMin)) ? R.drawable.permission_locked : 0);
        BulletinFactory.of(this).createSimpleBulletin(R.raw.error, LocaleController.getString("UnknownError", R.string.UnknownError)).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$4(TextCell textCell, boolean z, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null) {
            getMessagesController().processUpdates(updates, false);
        } else if (tL_error != null) {
            textCell.setChecked(z);
            BulletinFactory.of(this).showForError(tL_error);
        }
    }

    class 10 extends GigagroupConvertAlert {
        @Override // org.telegram.ui.Components.GigagroupConvertAlert
        protected void onCancel() {
        }

        10(Context context, BaseFragment baseFragment) {
            super(context, baseFragment);
        }

        @Override // org.telegram.ui.Components.GigagroupConvertAlert
        protected void onCovert() {
            ChatUsersActivity.this.getMessagesController().convertToGigaGroup(ChatUsersActivity.this.getParentActivity(), ChatUsersActivity.this.currentChat, ChatUsersActivity.this, new MessagesStorage.BooleanCallback() { // from class: org.telegram.ui.ChatUsersActivity$10$$ExternalSyntheticLambda0
                @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
                public final void run(boolean z) {
                    ChatUsersActivity.10.this.lambda$onCovert$0(z);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCovert$0(boolean z) {
            if (!z || ((BaseFragment) ChatUsersActivity.this).parentLayout == null) {
                return;
            }
            BaseFragment baseFragment = (BaseFragment) ((BaseFragment) ChatUsersActivity.this).parentLayout.getFragmentStack().get(((BaseFragment) ChatUsersActivity.this).parentLayout.getFragmentStack().size() - 2);
            if (baseFragment instanceof ChatEditActivity) {
                baseFragment.removeSelfFromStack();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", ChatUsersActivity.this.chatId);
                ChatEditActivity chatEditActivity = new ChatEditActivity(bundle);
                chatEditActivity.setInfo(ChatUsersActivity.this.info);
                ((BaseFragment) ChatUsersActivity.this).parentLayout.addFragmentToStack(chatEditActivity, ((BaseFragment) ChatUsersActivity.this).parentLayout.getFragmentStack().size() - 1);
                ChatUsersActivity.this.finishFragment();
                chatEditActivity.showConvertTooltip();
                return;
            }
            ChatUsersActivity.this.finishFragment();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$5(TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z, AlertDialog alertDialog, int i) {
        openRightsEdit(user.id, tLObject, tL_chatAdminRights, tL_chatBannedRights, str, z, this.selectType == 1 ? 0 : 1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$createView$7(View view, int i) {
        if (getParentActivity() != null) {
            RecyclerView.Adapter adapter = this.listView.getAdapter();
            ListAdapter listAdapter = this.listViewAdapter;
            if (adapter == listAdapter) {
                return createMenuForParticipant(listAdapter.getItem(i), false, view);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParticipantsCount() {
        ArrayList<TLRPC.ChatParticipant> arrayList;
        TLRPC.ChatFull chatFull = this.info;
        if (chatFull == null) {
            return 0;
        }
        int i = chatFull.participants_count;
        TLRPC.ChatParticipants chatParticipants = chatFull.participants;
        return (chatParticipants == null || (arrayList = chatParticipants.participants) == null) ? i : Math.max(i, arrayList.size());
    }

    private void setBannedRights(TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        if (tL_chatBannedRights != null) {
            this.defaultBannedRights = tL_chatBannedRights;
        }
    }

    public static void sortAdmins(ArrayList arrayList) {
        Collections.sort(arrayList, new Comparator() { // from class: org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda20
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$sortAdmins$8;
                lambda$sortAdmins$8 = ChatUsersActivity.lambda$sortAdmins$8((TLObject) obj, (TLObject) obj2);
                return lambda$sortAdmins$8;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$sortAdmins$8(TLObject tLObject, TLObject tLObject2) {
        int channelAdminParticipantType = getChannelAdminParticipantType(tLObject);
        int channelAdminParticipantType2 = getChannelAdminParticipantType(tLObject2);
        if (channelAdminParticipantType > channelAdminParticipantType2) {
            return 1;
        }
        if (channelAdminParticipantType < channelAdminParticipantType2) {
            return -1;
        }
        if ((tLObject instanceof TLRPC.ChannelParticipant) && (tLObject2 instanceof TLRPC.ChannelParticipant)) {
            return (int) (MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer) - MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer));
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showItemsAnimated(final int i) {
        if (this.isPaused || !this.openTransitionStarted) {
            return;
        }
        if (this.listView.getAdapter() == this.listViewAdapter && this.firstLoaded) {
            return;
        }
        final View view = null;
        for (int i2 = 0; i2 < this.listView.getChildCount(); i2++) {
            View childAt = this.listView.getChildAt(i2);
            if (childAt instanceof FlickerLoadingView) {
                view = childAt;
            }
        }
        if (view != null) {
            this.listView.removeView(view);
            i--;
        }
        this.listView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: org.telegram.ui.ChatUsersActivity.13
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                ChatUsersActivity.this.listView.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = ChatUsersActivity.this.listView.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt2 = ChatUsersActivity.this.listView.getChildAt(i3);
                    if (childAt2 != view && ChatUsersActivity.this.listView.getChildAdapterPosition(childAt2) >= i) {
                        childAt2.setAlpha(0.0f);
                        int min = (int) ((Math.min(ChatUsersActivity.this.listView.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / ChatUsersActivity.this.listView.getMeasuredHeight()) * 100.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay(min);
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                View view2 = view;
                if (view2 != null && view2.getParent() == null) {
                    ChatUsersActivity.this.listView.addView(view);
                    final RecyclerView.LayoutManager layoutManager = ChatUsersActivity.this.listView.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.ignoreView(view);
                        View view3 = view;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.ALPHA, view3.getAlpha(), 0.0f);
                        ofFloat2.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.ChatUsersActivity.13.1
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animator) {
                                view.setAlpha(1.0f);
                                layoutManager.stopIgnoringView(view);
                                ChatUsersActivity.this.listView.removeView(view);
                            }
                        });
                        ofFloat2.start();
                    }
                }
                animatorSet.start();
                return true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onOwnerChaged(TLRPC.User user) {
        LongSparseArray longSparseArray;
        ArrayList arrayList;
        boolean z;
        this.undoView.showWithAction(-this.chatId, this.isChannel ? 9 : 10, user);
        this.currentChat.creator = false;
        boolean z2 = false;
        for (int i = 0; i < 3; i++) {
            boolean z3 = true;
            if (i == 0) {
                longSparseArray = this.contactsMap;
                arrayList = this.contacts;
            } else if (i == 1) {
                longSparseArray = this.botsMap;
                arrayList = this.bots;
            } else {
                longSparseArray = this.participantsMap;
                arrayList = this.participants;
            }
            TLObject tLObject = (TLObject) longSparseArray.get(user.id);
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator = new TLRPC.TL_channelParticipantCreator();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_channelParticipantCreator.peer = tL_peerUser;
                long j = user.id;
                tL_peerUser.user_id = j;
                longSparseArray.put(j, tL_channelParticipantCreator);
                int indexOf = arrayList.indexOf(tLObject);
                if (indexOf >= 0) {
                    arrayList.set(indexOf, tL_channelParticipantCreator);
                }
                z2 = true;
                z = true;
            } else {
                z = false;
            }
            long clientUserId = getUserConfig().getClientUserId();
            TLObject tLObject2 = (TLObject) longSparseArray.get(clientUserId);
            if (tLObject2 instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_channelParticipantAdmin.peer = tL_peerUser2;
                tL_peerUser2.user_id = clientUserId;
                tL_channelParticipantAdmin.self = true;
                tL_channelParticipantAdmin.inviter_id = clientUserId;
                tL_channelParticipantAdmin.promoted_by = clientUserId;
                tL_channelParticipantAdmin.date = (int) (System.currentTimeMillis() / 1000);
                TLRPC.TL_chatAdminRights tL_chatAdminRights = new TLRPC.TL_chatAdminRights();
                tL_channelParticipantAdmin.admin_rights = tL_chatAdminRights;
                tL_chatAdminRights.add_admins = true;
                tL_chatAdminRights.manage_ranks = true;
                tL_chatAdminRights.pin_messages = true;
                tL_chatAdminRights.manage_topics = true;
                tL_chatAdminRights.invite_users = true;
                tL_chatAdminRights.ban_users = true;
                tL_chatAdminRights.delete_messages = true;
                tL_chatAdminRights.edit_messages = true;
                tL_chatAdminRights.post_messages = true;
                tL_chatAdminRights.change_info = true;
                if (!this.isChannel) {
                    tL_chatAdminRights.manage_call = true;
                }
                longSparseArray.put(clientUserId, tL_channelParticipantAdmin);
                int indexOf2 = arrayList.indexOf(tLObject2);
                if (indexOf2 >= 0) {
                    arrayList.set(indexOf2, tL_channelParticipantAdmin);
                }
            } else {
                z3 = z;
            }
            if (z3) {
                Collections.sort(arrayList, new Comparator() { // from class: org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda33
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int lambda$onOwnerChaged$9;
                        lambda$onOwnerChaged$9 = ChatUsersActivity.lambda$onOwnerChaged$9((TLObject) obj, (TLObject) obj2);
                        return lambda$onOwnerChaged$9;
                    }
                });
            }
        }
        if (!z2) {
            TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator2 = new TLRPC.TL_channelParticipantCreator();
            TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
            tL_channelParticipantCreator2.peer = tL_peerUser3;
            long j2 = user.id;
            tL_peerUser3.user_id = j2;
            this.participantsMap.put(j2, tL_channelParticipantCreator2);
            this.participants.add(tL_channelParticipantCreator2);
            sortAdmins(this.participants);
            updateRows();
        }
        this.listViewAdapter.notifyDataSetChanged();
        ChatUsersActivityDelegate chatUsersActivityDelegate = this.delegate;
        if (chatUsersActivityDelegate != null) {
            chatUsersActivityDelegate.didChangeOwner(user);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$onOwnerChaged$9(TLObject tLObject, TLObject tLObject2) {
        int channelAdminParticipantType = getChannelAdminParticipantType(tLObject);
        int channelAdminParticipantType2 = getChannelAdminParticipantType(tLObject2);
        if (channelAdminParticipantType > channelAdminParticipantType2) {
            return 1;
        }
        return channelAdminParticipantType < channelAdminParticipantType2 ? -1 : 0;
    }

    private void openRightsEdit2(final long j, final int i, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z, final int i2, boolean z2) {
        final boolean[] zArr = new boolean[1];
        boolean z3 = (tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin);
        ChatRightsEditActivity chatRightsEditActivity = new ChatRightsEditActivity(j, this.chatId, tL_chatAdminRights, this.defaultBannedRights, tL_chatBannedRights, str, i2, true, false, null) { // from class: org.telegram.ui.ChatUsersActivity.14
            @Override // org.telegram.ui.ActionBar.BaseFragment
            public void onTransitionAnimationEnd(boolean z4, boolean z5) {
                if (!z4 && z5 && zArr[0] && BulletinFactory.canShowBulletin(ChatUsersActivity.this)) {
                    if (j > 0) {
                        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j));
                        if (user != null) {
                            BulletinFactory.createPromoteToAdminBulletin(ChatUsersActivity.this, user.first_name).show();
                            return;
                        }
                        return;
                    }
                    TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j));
                    if (chat != null) {
                        BulletinFactory.createPromoteToAdminBulletin(ChatUsersActivity.this, chat.title).show();
                    }
                }
            }
        };
        final boolean z4 = z3;
        chatRightsEditActivity.setDelegate(new ChatRightsEditActivity.ChatRightsEditActivityDelegate() { // from class: org.telegram.ui.ChatUsersActivity.15
            @Override // org.telegram.ui.ChatRightsEditActivity.ChatRightsEditActivityDelegate
            public void didSetRights(int i3, TLRPC.TL_chatAdminRights tL_chatAdminRights2, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str2) {
                TLRPC.ChatParticipant tL_chatParticipant;
                TLRPC.ChannelParticipant tL_channelParticipant;
                int i4 = i2;
                if (i4 != 0) {
                    if (i4 == 1 && i3 == 0) {
                        ChatUsersActivity.this.removeParticipants(j);
                        return;
                    }
                    return;
                }
                int i5 = 0;
                while (true) {
                    if (i5 >= ChatUsersActivity.this.participants.size()) {
                        break;
                    }
                    TLObject tLObject2 = (TLObject) ChatUsersActivity.this.participants.get(i5);
                    if (tLObject2 instanceof TLRPC.ChannelParticipant) {
                        if (MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer) == j) {
                            if (i3 == 1) {
                                tL_channelParticipant = new TLRPC.TL_channelParticipantAdmin();
                            } else {
                                tL_channelParticipant = new TLRPC.TL_channelParticipant();
                            }
                            tL_channelParticipant.admin_rights = tL_chatAdminRights2;
                            tL_channelParticipant.banned_rights = tL_chatBannedRights2;
                            tL_channelParticipant.inviter_id = ChatUsersActivity.this.getUserConfig().getClientUserId();
                            if (j > 0) {
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_channelParticipant.peer = tL_peerUser;
                                tL_peerUser.user_id = j;
                            } else {
                                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                tL_channelParticipant.peer = tL_peerChannel;
                                tL_peerChannel.channel_id = -j;
                            }
                            tL_channelParticipant.date = i;
                            tL_channelParticipant.flags |= 4;
                            tL_channelParticipant.rank = str2;
                            ChatUsersActivity.this.participants.set(i5, tL_channelParticipant);
                        }
                    } else if (tLObject2 instanceof TLRPC.ChatParticipant) {
                        TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) tLObject2;
                        if (i3 == 1) {
                            tL_chatParticipant = new TLRPC.TL_chatParticipantAdmin();
                        } else {
                            tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        }
                        tL_chatParticipant.user_id = chatParticipant.user_id;
                        tL_chatParticipant.date = chatParticipant.date;
                        tL_chatParticipant.inviter_id = chatParticipant.inviter_id;
                        int indexOf = ChatUsersActivity.this.info.participants.participants.indexOf(chatParticipant);
                        if (indexOf >= 0) {
                            ChatUsersActivity.this.info.participants.participants.set(indexOf, tL_chatParticipant);
                        }
                        ChatUsersActivity.this.loadChatParticipants(0, NotificationCenter.channelRecommendationsLoaded);
                    }
                    i5++;
                }
                if (i3 != 1 || z4) {
                    return;
                }
                zArr[0] = true;
            }

            @Override // org.telegram.ui.ChatRightsEditActivity.ChatRightsEditActivityDelegate
            public void didChangeOwner(TLRPC.User user) {
                ChatUsersActivity.this.onOwnerChaged(user);
            }
        });
        presentFragment(chatRightsEditActivity);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean canBeginSlide() {
        return checkDiscard(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openRightsEdit(final long j, final TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z, int i, final boolean z2) {
        ChatRightsEditActivity chatRightsEditActivity = new ChatRightsEditActivity(j, this.chatId, tL_chatAdminRights, this.defaultBannedRights, tL_chatBannedRights, str, i, z, tLObject == null, null);
        chatRightsEditActivity.setDelegate(new ChatRightsEditActivity.ChatRightsEditActivityDelegate() { // from class: org.telegram.ui.ChatUsersActivity.16
            @Override // org.telegram.ui.ChatRightsEditActivity.ChatRightsEditActivityDelegate
            public void didSetRights(int i2, TLRPC.TL_chatAdminRights tL_chatAdminRights2, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str2) {
                TLObject tLObject2 = tLObject;
                if (tLObject2 instanceof TLRPC.ChannelParticipant) {
                    TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject2;
                    channelParticipant.admin_rights = tL_chatAdminRights2;
                    channelParticipant.banned_rights = tL_chatBannedRights2;
                    channelParticipant.rank = str2;
                }
                if (ChatUsersActivity.this.delegate == null || i2 != 1) {
                    if (ChatUsersActivity.this.delegate != null) {
                        ChatUsersActivity.this.delegate.didAddParticipantToList(j, tLObject);
                    }
                } else {
                    ChatUsersActivity.this.delegate.didSelectUser(j);
                }
                if (z2) {
                    ChatUsersActivity.this.removeSelfFromStack();
                }
            }

            @Override // org.telegram.ui.ChatRightsEditActivity.ChatRightsEditActivityDelegate
            public void didChangeOwner(TLRPC.User user) {
                ChatUsersActivity.this.onOwnerChaged(user);
            }
        });
        presentFragment(chatRightsEditActivity, z2);
    }

    private void removeParticipant(long j) {
        if (ChatObject.isChannel(this.currentChat)) {
            getMessagesController().deleteParticipantFromChat(this.chatId, getMessagesController().getUser(Long.valueOf(j)));
            ChatUsersActivityDelegate chatUsersActivityDelegate = this.delegate;
            if (chatUsersActivityDelegate != null) {
                chatUsersActivityDelegate.didKickParticipant(j);
            }
            finishFragment();
        }
    }

    private TLObject getAnyParticipant(long j) {
        LongSparseArray longSparseArray;
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                longSparseArray = this.contactsMap;
            } else if (i == 1) {
                longSparseArray = this.botsMap;
            } else {
                longSparseArray = this.participantsMap;
            }
            TLObject tLObject = (TLObject) longSparseArray.get(j);
            if (tLObject != null) {
                return tLObject;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeParticipants(long j) {
        LongSparseArray longSparseArray;
        ArrayList arrayList;
        TLRPC.ChatFull chatFull;
        DiffCallback saveState = saveState();
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                longSparseArray = this.contactsMap;
                arrayList = this.contacts;
            } else if (i == 1) {
                longSparseArray = this.botsMap;
                arrayList = this.bots;
            } else {
                longSparseArray = this.participantsMap;
                arrayList = this.participants;
            }
            TLObject tLObject = (TLObject) longSparseArray.get(j);
            if (tLObject != null) {
                longSparseArray.remove(j);
                arrayList.remove(tLObject);
                if (this.type == 0 && (chatFull = this.info) != null) {
                    chatFull.kicked_count--;
                }
                z = true;
            }
        }
        if (z) {
            updateListAnimated(saveState);
        }
        RecyclerView.Adapter adapter = this.listView.getAdapter();
        SearchAdapter searchAdapter = this.searchListViewAdapter;
        if (adapter == searchAdapter) {
            searchAdapter.removeUserId(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateParticipantWithRights(TLRPC.ChannelParticipant channelParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, long j, boolean z) {
        LongSparseArray longSparseArray;
        ChatUsersActivityDelegate chatUsersActivityDelegate;
        boolean z2 = false;
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                longSparseArray = this.contactsMap;
            } else if (i == 1) {
                longSparseArray = this.botsMap;
            } else {
                longSparseArray = this.participantsMap;
            }
            TLObject tLObject = (TLObject) longSparseArray.get(MessageObject.getPeerId(channelParticipant.peer));
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                channelParticipant = (TLRPC.ChannelParticipant) tLObject;
                channelParticipant.admin_rights = tL_chatAdminRights;
                channelParticipant.banned_rights = tL_chatBannedRights;
                if (z) {
                    channelParticipant.promoted_by = getUserConfig().getClientUserId();
                }
            }
            if (z && tLObject != null && !z2 && (chatUsersActivityDelegate = this.delegate) != null) {
                chatUsersActivityDelegate.didAddParticipantToList(j, tLObject);
                z2 = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean createMenuForParticipant(final TLObject tLObject, boolean z, View view) {
        long j;
        final TLRPC.TL_chatAdminRights tL_chatAdminRights;
        final TLRPC.TL_chatBannedRights tL_chatBannedRights;
        final String str;
        final int i;
        boolean z2;
        boolean z3;
        int i2;
        String str2;
        int i3;
        String str3;
        if (tLObject == null || this.selectType != 0) {
            return false;
        }
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            long peerId = MessageObject.getPeerId(channelParticipant.peer);
            z2 = channelParticipant.can_edit;
            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = channelParticipant.banned_rights;
            TLRPC.TL_chatAdminRights tL_chatAdminRights2 = channelParticipant.admin_rights;
            j = peerId;
            i = channelParticipant.date;
            str = channelParticipant.rank;
            tL_chatBannedRights = tL_chatBannedRights2;
            tL_chatAdminRights = tL_chatAdminRights2;
        } else if (tLObject instanceof TLRPC.ChatParticipant) {
            TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) tLObject;
            long j2 = chatParticipant.user_id;
            int i4 = chatParticipant.date;
            j = j2;
            z2 = ChatObject.canAddAdmins(this.currentChat);
            str = "";
            i = i4;
            tL_chatAdminRights = null;
            tL_chatBannedRights = null;
        } else {
            j = 0;
            tL_chatAdminRights = null;
            tL_chatBannedRights = null;
            str = null;
            i = 0;
            z2 = false;
        }
        if (j == 0 || j == getUserConfig().getClientUserId()) {
            return false;
        }
        if (this.type == 2) {
            final TLRPC.User user = getMessagesController().getUser(Long.valueOf(j));
            boolean z4 = ChatObject.canAddAdmins(this.currentChat) && ((tLObject instanceof TLRPC.TL_channelParticipant) || (tLObject instanceof TLRPC.TL_channelParticipantBanned) || (tLObject instanceof TLRPC.TL_chatParticipant) || z2);
            boolean z5 = tLObject instanceof TLRPC.TL_channelParticipantAdmin;
            boolean z6 = !(z5 || (tLObject instanceof TLRPC.TL_channelParticipantCreator) || (tLObject instanceof TLRPC.TL_chatParticipantCreator) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin)) || z2;
            boolean z7 = z5 || (tLObject instanceof TLRPC.TL_chatParticipantAdmin);
            boolean z8 = ChatObject.canBlockUsers(this.currentChat) && z6 && !this.isChannel && ChatObject.isChannel(this.currentChat) && !this.currentChat.gigagroup;
            if (this.selectType == 0) {
                z4 &= !UserObject.isDeleted(user);
            }
            boolean z9 = z4;
            boolean z10 = z9 || (ChatObject.canBlockUsers(this.currentChat) && z6);
            if (z || !z10) {
                return z10;
            }
            final long j3 = j;
            final long j4 = j;
            boolean z11 = z8;
            final boolean z12 = z6;
            final Utilities.Callback callback = new Utilities.Callback() { // from class: org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda9
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    ChatUsersActivity.this.lambda$createMenuForParticipant$10(j3, i, tLObject, tL_chatAdminRights, tL_chatBannedRights, str, z12, (Integer) obj);
                }
            };
            ItemOptions addIf = ItemOptions.makeOptions(this, view).setScrimViewBackground(this.listView.getClipBackground(view)).addIf(z9, R.drawable.msg_admins, LocaleController.getString(z7 ? R.string.EditAdminRights : R.string.SetAsAdmin), new Runnable() { // from class: org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    ChatUsersActivity.lambda$createMenuForParticipant$11(Utilities.Callback.this);
                }
            }).addIf(z11, R.drawable.msg_permissions, LocaleController.getString("ChangePermissions", R.string.ChangePermissions), new Runnable() { // from class: org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda11
                @Override // java.lang.Runnable
                public final void run() {
                    ChatUsersActivity.this.lambda$createMenuForParticipant$13(tLObject, user, callback);
                }
            });
            boolean z13 = ChatObject.canBlockUsers(this.currentChat) && z6;
            int i5 = R.drawable.msg_remove;
            if (this.isChannel) {
                i3 = R.string.ChannelRemoveUser;
                str3 = "ChannelRemoveUser";
            } else {
                i3 = R.string.KickFromGroup;
                str3 = "KickFromGroup";
            }
            addIf.addIf(z13, i5, (CharSequence) LocaleController.getString(str3, i3), true, new Runnable() { // from class: org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda12
                @Override // java.lang.Runnable
                public final void run() {
                    ChatUsersActivity.this.lambda$createMenuForParticipant$14(user, j4);
                }
            }).setMinWidth(NotificationCenter.boostByChannelCreated).show();
            return true;
        }
        final long j5 = j;
        ItemOptions makeOptions = ItemOptions.makeOptions(this, view);
        if (this.type == 3 && ChatObject.canBlockUsers(this.currentChat)) {
            final TLRPC.TL_chatBannedRights tL_chatBannedRights3 = tL_chatBannedRights;
            final String str4 = str;
            makeOptions.add(R.drawable.msg_permissions, LocaleController.getString(R.string.ChannelEditPermissions), new Runnable() { // from class: org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    ChatUsersActivity.this.lambda$createMenuForParticipant$15(j5, tL_chatBannedRights3, str4, tLObject);
                }
            });
            z3 = true;
            makeOptions.add(R.drawable.msg_delete, (CharSequence) LocaleController.getString("ChannelDeleteFromList", R.string.ChannelDeleteFromList), true, new Runnable() { // from class: org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda14
                @Override // java.lang.Runnable
                public final void run() {
                    ChatUsersActivity.this.lambda$createMenuForParticipant$16(j5);
                }
            });
        } else {
            z3 = true;
            if (this.type == 0 && ChatObject.canBlockUsers(this.currentChat)) {
                if (ChatObject.canAddUsers(this.currentChat) && j > 0) {
                    int i6 = R.drawable.msg_contact_add;
                    if (this.isChannel) {
                        i2 = R.string.ChannelAddToChannel;
                        str2 = "ChannelAddToChannel";
                    } else {
                        i2 = R.string.ChannelAddToGroup;
                        str2 = "ChannelAddToGroup";
                    }
                    makeOptions.add(i6, LocaleController.getString(str2, i2), new Runnable() { // from class: org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda15
                        @Override // java.lang.Runnable
                        public final void run() {
                            ChatUsersActivity.this.lambda$createMenuForParticipant$17(j5);
                        }
                    });
                }
                makeOptions.add(R.drawable.msg_delete, (CharSequence) LocaleController.getString("ChannelDeleteFromList", R.string.ChannelDeleteFromList), true, new Runnable() { // from class: org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda16
                    @Override // java.lang.Runnable
                    public final void run() {
                        ChatUsersActivity.this.lambda$createMenuForParticipant$18(j5);
                    }
                });
            } else if (this.type == 1 && ChatObject.canAddAdmins(this.currentChat) && z2) {
                if (this.currentChat.creator || !(tLObject instanceof TLRPC.TL_channelParticipantCreator)) {
                    final TLRPC.TL_chatAdminRights tL_chatAdminRights3 = tL_chatAdminRights;
                    final String str5 = str;
                    makeOptions.add(R.drawable.msg_admins, LocaleController.getString("EditAdminRights", R.string.EditAdminRights), new Runnable() { // from class: org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda17
                        @Override // java.lang.Runnable
                        public final void run() {
                            ChatUsersActivity.this.lambda$createMenuForParticipant$19(j5, tL_chatAdminRights3, str5, tLObject);
                        }
                    });
                }
                makeOptions.add(R.drawable.msg_remove, (CharSequence) LocaleController.getString("ChannelRemoveUserAdmin", R.string.ChannelRemoveUserAdmin), true, new Runnable() { // from class: org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda18
                    @Override // java.lang.Runnable
                    public final void run() {
                        ChatUsersActivity.this.lambda$createMenuForParticipant$20(j5);
                    }
                });
            }
        }
        makeOptions.setScrimViewBackground(this.listView.getClipBackground(view));
        makeOptions.setMinWidth(NotificationCenter.boostByChannelCreated);
        boolean z14 = makeOptions.getItemsCount() > 0;
        if (z || !z14) {
            return z14;
        }
        makeOptions.show();
        return z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createMenuForParticipant$10(long j, int i, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z, Integer num) {
        openRightsEdit2(j, i, tLObject, tL_chatAdminRights, tL_chatBannedRights, str, z, num.intValue(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createMenuForParticipant$11(Utilities.Callback callback) {
        callback.run(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createMenuForParticipant$13(TLObject tLObject, TLRPC.User user, final Utilities.Callback callback) {
        if ((tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin)) {
            showDialog(new AlertDialog.Builder(getParentActivity()).setTitle(LocaleController.getString("AppName", R.string.AppName)).setMessage(LocaleController.formatString(R.string.AdminWillBeRemoved, UserObject.getUserName(user))).setPositiveButton(LocaleController.getString("OK", R.string.OK), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda30
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog, int i) {
                    ChatUsersActivity.lambda$createMenuForParticipant$12(Utilities.Callback.this, alertDialog, i);
                }
            }).setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null).create());
        } else {
            callback.run(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createMenuForParticipant$12(Utilities.Callback callback, AlertDialog alertDialog, int i) {
        callback.run(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createMenuForParticipant$14(TLRPC.User user, long j) {
        getMessagesController().deleteParticipantFromChat(this.chatId, user);
        removeParticipants(j);
        if (this.currentChat == null || user == null || !BulletinFactory.canShowBulletin(this)) {
            return;
        }
        BulletinFactory.createRemoveFromChatBulletin(this, user, this.currentChat.title).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createMenuForParticipant$15(long j, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, final TLObject tLObject) {
        ChatRightsEditActivity chatRightsEditActivity = new ChatRightsEditActivity(j, this.chatId, null, this.defaultBannedRights, tL_chatBannedRights, str, 1, true, false, null);
        chatRightsEditActivity.setDelegate(new ChatRightsEditActivity.ChatRightsEditActivityDelegate() { // from class: org.telegram.ui.ChatUsersActivity.17
            @Override // org.telegram.ui.ChatRightsEditActivity.ChatRightsEditActivityDelegate
            public void didSetRights(int i, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str2) {
                TLObject tLObject2 = tLObject;
                if (tLObject2 instanceof TLRPC.ChannelParticipant) {
                    TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject2;
                    channelParticipant.admin_rights = tL_chatAdminRights;
                    channelParticipant.banned_rights = tL_chatBannedRights2;
                    channelParticipant.rank = str2;
                    ChatUsersActivity.this.updateParticipantWithRights(channelParticipant, tL_chatAdminRights, tL_chatBannedRights2, 0L, false);
                }
            }

            @Override // org.telegram.ui.ChatRightsEditActivity.ChatRightsEditActivityDelegate
            public void didChangeOwner(TLRPC.User user) {
                ChatUsersActivity.this.onOwnerChaged(user);
            }
        });
        presentFragment(chatRightsEditActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createMenuForParticipant$17(long j) {
        lambda$createMenuForParticipant$18(j);
        getMessagesController().addUserToChat(this.chatId, getMessagesController().getUser(Long.valueOf(j)), 0, null, this, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createMenuForParticipant$19(long j, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, final TLObject tLObject) {
        ChatRightsEditActivity chatRightsEditActivity = new ChatRightsEditActivity(j, this.chatId, tL_chatAdminRights, null, null, str, 0, true, false, null);
        chatRightsEditActivity.setDelegate(new ChatRightsEditActivity.ChatRightsEditActivityDelegate() { // from class: org.telegram.ui.ChatUsersActivity.18
            @Override // org.telegram.ui.ChatRightsEditActivity.ChatRightsEditActivityDelegate
            public void didSetRights(int i, TLRPC.TL_chatAdminRights tL_chatAdminRights2, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str2) {
                TLObject tLObject2 = tLObject;
                if (tLObject2 instanceof TLRPC.ChannelParticipant) {
                    TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject2;
                    channelParticipant.admin_rights = tL_chatAdminRights2;
                    channelParticipant.banned_rights = tL_chatBannedRights;
                    channelParticipant.rank = str2;
                    ChatUsersActivity.this.updateParticipantWithRights(channelParticipant, tL_chatAdminRights2, tL_chatBannedRights, 0L, false);
                }
            }

            @Override // org.telegram.ui.ChatRightsEditActivity.ChatRightsEditActivityDelegate
            public void didChangeOwner(TLRPC.User user) {
                ChatUsersActivity.this.onOwnerChaged(user);
            }
        });
        presentFragment(chatRightsEditActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createMenuForParticipant$20(long j) {
        getMessagesController().setUserAdminRole(this.chatId, getMessagesController().getUser(Long.valueOf(j)), new TLRPC.TL_chatAdminRights(), "", !this.isChannel, this, false, false, null, null);
        removeParticipants(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: deletePeer, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$createMenuForParticipant$18(long j) {
        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
        tL_channels_editBanned.participant = getMessagesController().getInputPeer(j);
        tL_channels_editBanned.channel = getMessagesController().getInputChannel(this.chatId);
        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
        getConnectionsManager().sendRequest(tL_channels_editBanned, new RequestDelegate() { // from class: org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda31
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ChatUsersActivity.this.lambda$deletePeer$22(tLObject, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deletePeer$22(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            final TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            getMessagesController().processUpdates(updates, false);
            if (updates.chats.isEmpty()) {
                return;
            }
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda32
                @Override // java.lang.Runnable
                public final void run() {
                    ChatUsersActivity.this.lambda$deletePeer$21(updates);
                }
            }, 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deletePeer$21(TLRPC.Updates updates) {
        getMessagesController().loadFullChat(updates.chats.get(0).id, 0, true);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            if (chatFull.id == this.chatId) {
                if (booleanValue && ChatObject.isChannel(this.currentChat)) {
                    return;
                }
                boolean z = this.info != null;
                this.info = chatFull;
                if (!z) {
                    int currentSlowmode = getCurrentSlowmode();
                    this.initialSlowmode = currentSlowmode;
                    this.selectedSlowmode = currentSlowmode;
                    int i3 = this.info.boosts_unrestrict;
                    this.isEnabledNotRestrictBoosters = i3 > 0;
                    this.notRestrictBoosters = i3;
                    TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
                    long j = chat == null ? 0L : chat.send_paid_messages_stars;
                    boolean z2 = j > 0;
                    this.enablePrice = z2;
                    this.initialEnablePrice = z2;
                    if (j <= 0) {
                        j = 10;
                    }
                    long clamp = Utilities.clamp(j, getMessagesController().starsPaidMessageAmountMax, 1L);
                    this.starsPrice = clamp;
                    this.initialStarsPrice = clamp;
                }
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ChatUsersActivity.this.lambda$didReceivedNotification$23();
                    }
                });
                return;
            }
            return;
        }
        if (i == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.chatId)) {
            INavigationLayout iNavigationLayout = this.parentLayout;
            if (iNavigationLayout != null && iNavigationLayout.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$didReceivedNotification$23() {
        loadChatParticipants(0, NotificationCenter.channelRecommendationsLoaded);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean onBackPressed(boolean z) {
        return checkDiscard(z);
    }

    public void setDelegate(ChatUsersActivityDelegate chatUsersActivityDelegate) {
        this.delegate = chatUsersActivityDelegate;
    }

    private int getCurrentSlowmode() {
        TLRPC.ChatFull chatFull = this.info;
        if (chatFull == null) {
            return 0;
        }
        int i = chatFull.slowmode_seconds;
        if (i == 5) {
            return 1;
        }
        if (i == 10) {
            return 2;
        }
        if (i == 30) {
            return 3;
        }
        if (i == 60) {
            return 4;
        }
        if (i == 300) {
            return 5;
        }
        if (i == 900) {
            return 6;
        }
        return i == 3600 ? 7 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String formatSeconds(int i) {
        if (i < 60) {
            return LocaleController.formatPluralString("Seconds", i, new Object[0]);
        }
        if (i < 3600) {
            return LocaleController.formatPluralString("Minutes", i / 60, new Object[0]);
        }
        return LocaleController.formatPluralString("Hours", (i / 60) / 60, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkDiscard(boolean z) {
        boolean z2;
        if (this.transfer) {
            return true;
        }
        if (ChatObject.getBannedRightsString(this.defaultBannedRights).equals(this.initialBannedRights) && this.initialSlowmode == this.selectedSlowmode && !hasNotRestrictBoostersChanges() && (z2 = this.signatures) == this.initialSignatures) {
            if ((z2 && this.profiles) == this.initialProfiles) {
                return true;
            }
        }
        if (z) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
            builder.setTitle(LocaleController.getString("UserRestrictionsApplyChanges", R.string.UserRestrictionsApplyChanges));
            if (this.isChannel) {
                builder.setMessage(LocaleController.getString("ChannelSettingsChangedAlert", R.string.ChannelSettingsChangedAlert));
            } else {
                builder.setMessage(LocaleController.getString("GroupSettingsChangedAlert", R.string.GroupSettingsChangedAlert));
            }
            builder.setPositiveButton(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda4
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog, int i) {
                    ChatUsersActivity.this.lambda$checkDiscard$24(alertDialog, i);
                }
            });
            builder.setNegativeButton(LocaleController.getString("PassportDiscard", R.string.PassportDiscard), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda5
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog, int i) {
                    ChatUsersActivity.this.lambda$checkDiscard$25(alertDialog, i);
                }
            });
            showDialog(builder.create());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkDiscard$24(AlertDialog alertDialog, int i) {
        processDone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkDiscard$25(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    public boolean hasSelectType() {
        return this.selectType != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String formatUserPermissions(TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        if (tL_chatBannedRights == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean z = tL_chatBannedRights.view_messages;
        if (z && this.defaultBannedRights.view_messages != z) {
            sb.append(LocaleController.getString("UserRestrictionsNoRead", R.string.UserRestrictionsNoRead));
        }
        if (tL_chatBannedRights.send_messages && this.defaultBannedRights.send_plain != tL_chatBannedRights.send_plain) {
            if (sb.length() != 0) {
                sb.append(", ");
            }
            sb.append(LocaleController.getString("UserRestrictionsNoSendText", R.string.UserRestrictionsNoSendText));
        }
        boolean z2 = tL_chatBannedRights.send_media;
        if (z2 && this.defaultBannedRights.send_media != z2) {
            if (sb.length() != 0) {
                sb.append(", ");
            }
            sb.append(LocaleController.getString("UserRestrictionsNoSendMedia", R.string.UserRestrictionsNoSendMedia));
        } else {
            boolean z3 = tL_chatBannedRights.send_photos;
            if (z3 && this.defaultBannedRights.send_photos != z3) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(LocaleController.getString("UserRestrictionsNoSendPhotos", R.string.UserRestrictionsNoSendPhotos));
            }
            boolean z4 = tL_chatBannedRights.send_videos;
            if (z4 && this.defaultBannedRights.send_videos != z4) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(LocaleController.getString("UserRestrictionsNoSendVideos", R.string.UserRestrictionsNoSendVideos));
            }
            boolean z5 = tL_chatBannedRights.send_audios;
            if (z5 && this.defaultBannedRights.send_audios != z5) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(LocaleController.getString("UserRestrictionsNoSendMusic", R.string.UserRestrictionsNoSendMusic));
            }
            boolean z6 = tL_chatBannedRights.send_docs;
            if (z6 && this.defaultBannedRights.send_docs != z6) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(LocaleController.getString("UserRestrictionsNoSendDocs", R.string.UserRestrictionsNoSendDocs));
            }
            boolean z7 = tL_chatBannedRights.send_voices;
            if (z7 && this.defaultBannedRights.send_voices != z7) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(LocaleController.getString("UserRestrictionsNoSendVoice", R.string.UserRestrictionsNoSendVoice));
            }
            boolean z8 = tL_chatBannedRights.send_roundvideos;
            if (z8 && this.defaultBannedRights.send_roundvideos != z8) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(LocaleController.getString("UserRestrictionsNoSendRound", R.string.UserRestrictionsNoSendRound));
            }
        }
        boolean z9 = tL_chatBannedRights.send_stickers;
        if (z9 && this.defaultBannedRights.send_stickers != z9) {
            if (sb.length() != 0) {
                sb.append(", ");
            }
            sb.append(LocaleController.getString("UserRestrictionsNoSendStickers", R.string.UserRestrictionsNoSendStickers));
        }
        boolean z10 = tL_chatBannedRights.send_polls;
        if (z10 && this.defaultBannedRights.send_polls != z10) {
            if (sb.length() != 0) {
                sb.append(", ");
            }
            sb.append(LocaleController.getString("UserRestrictionsNoSendPolls", R.string.UserRestrictionsNoSendPolls));
        }
        boolean z11 = tL_chatBannedRights.embed_links;
        if (z11 && !tL_chatBannedRights.send_plain && this.defaultBannedRights.embed_links != z11) {
            if (sb.length() != 0) {
                sb.append(", ");
            }
            sb.append(LocaleController.getString("UserRestrictionsNoEmbedLinks", R.string.UserRestrictionsNoEmbedLinks));
        }
        boolean z12 = tL_chatBannedRights.invite_users;
        if (z12 && this.defaultBannedRights.invite_users != z12) {
            if (sb.length() != 0) {
                sb.append(", ");
            }
            sb.append(LocaleController.getString("UserRestrictionsNoInviteUsers", R.string.UserRestrictionsNoInviteUsers));
        }
        boolean z13 = tL_chatBannedRights.pin_messages;
        if (z13 && this.defaultBannedRights.pin_messages != z13) {
            if (sb.length() != 0) {
                sb.append(", ");
            }
            sb.append(LocaleController.getString(R.string.UserRestrictionsNoPinMessages));
        }
        boolean z14 = tL_chatBannedRights.edit_rank;
        if (z14 && this.defaultBannedRights.edit_rank != z14) {
            if (sb.length() != 0) {
                sb.append(", ");
            }
            sb.append(LocaleController.getString(R.string.UserRestrictionsEditTags));
        }
        boolean z15 = tL_chatBannedRights.change_info;
        if (z15 && this.defaultBannedRights.change_info != z15) {
            if (sb.length() != 0) {
                sb.append(", ");
            }
            sb.append(LocaleController.getString("UserRestrictionsNoChangeInfo", R.string.UserRestrictionsNoChangeInfo));
        }
        if (sb.length() != 0) {
            sb.replace(0, 1, sb.substring(0, 1).toUpperCase());
            sb.append('.');
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014a, code lost:
    
        if ((r0 && r10.profiles) != r10.initialProfiles) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void processDone() {
        TLRPC.ChatFull chatFull;
        int i = this.type;
        boolean z = false;
        if (i == 3) {
            TLRPC.Chat chat = this.currentChat;
            if (chat.creator && !ChatObject.isChannel(chat) && ((this.selectedSlowmode != this.initialSlowmode || this.enablePrice) && this.info != null)) {
                MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getParentActivity(), this.chatId, this, new MessagesStorage.LongCallback() { // from class: org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda21
                    @Override // org.telegram.messenger.MessagesStorage.LongCallback
                    public final void run(long j) {
                        ChatUsersActivity.this.lambda$processDone$26(j);
                    }
                });
                return;
            }
            if (!ChatObject.getBannedRightsString(this.defaultBannedRights).equals(this.initialBannedRights)) {
                getMessagesController().setDefaultBannedRole(this.chatId, this.defaultBannedRights, ChatObject.isChannel(this.currentChat), this);
                TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.chatId));
                if (chat2 != null) {
                    chat2.default_banned_rights = this.defaultBannedRights;
                }
            }
            int i2 = this.selectedSlowmode;
            if (i2 != this.initialSlowmode && (chatFull = this.info) != null) {
                chatFull.slowmode_seconds = getSecondsForIndex(i2);
                this.info.flags |= 131072;
                getMessagesController().setChannelSlowMode(this.chatId, this.info.slowmode_seconds);
            }
            boolean z2 = this.enablePrice;
            if (z2 != this.initialEnablePrice || (z2 && this.initialStarsPrice != this.starsPrice)) {
                TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
                updatepaidmessagesprice.channel = getMessagesController().getInputChannel(this.chatId);
                updatepaidmessagesprice.send_paid_messages_stars = this.enablePrice ? this.starsPrice : 0L;
                getConnectionsManager().sendRequest(updatepaidmessagesprice, new RequestDelegate() { // from class: org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda22
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        ChatUsersActivity.lambda$processDone$28(tLObject, tL_error);
                    }
                });
                TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(this.chatId));
                if (chat3 != null) {
                    if (this.enablePrice) {
                        chat3.flags2 |= 16384;
                        chat3.send_paid_messages_stars = this.starsPrice;
                    } else {
                        chat3.flags2 &= -16385;
                        chat3.send_paid_messages_stars = 0L;
                    }
                    getMessagesController().putChat(chat3, true);
                }
            }
            if (hasNotRestrictBoostersChanges()) {
                boolean z3 = this.isEnabledNotRestrictBoosters && isNotRestrictBoostersVisible();
                if (z3 && this.notRestrictBoosters == 0) {
                    getMessagesController().setBoostsToUnblockRestrictions(this.chatId, 1);
                } else if (!z3 && this.notRestrictBoosters != 0) {
                    getMessagesController().setBoostsToUnblockRestrictions(this.chatId, 0);
                } else {
                    getMessagesController().setBoostsToUnblockRestrictions(this.chatId, this.notRestrictBoosters);
                }
            }
        } else if (i == 1) {
            boolean z4 = this.signatures;
            if (z4 == this.initialSignatures) {
            }
            MessagesController messagesController = getMessagesController();
            long j = this.chatId;
            boolean z5 = this.signatures;
            if (z5 && this.profiles) {
                z = true;
            }
            messagesController.toggleChannelSignatures(j, z5, z);
        }
        finishFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processDone$26(long j) {
        if (j != 0) {
            this.chatId = j;
            this.currentChat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j));
            processDone();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processDone$28(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda29
            @Override // java.lang.Runnable
            public final void run() {
                ChatUsersActivity.lambda$processDone$27();
            }
        });
    }

    private boolean hasNotRestrictBoostersChanges() {
        boolean z = this.isEnabledNotRestrictBoosters && isNotRestrictBoostersVisible();
        TLRPC.ChatFull chatFull = this.info;
        if (chatFull == null) {
            return false;
        }
        int i = chatFull.boosts_unrestrict;
        int i2 = this.notRestrictBoosters;
        return i != i2 || (z && i2 == 0) || !(z || i2 == 0);
    }

    private boolean isNotRestrictBoostersVisible() {
        TLRPC.Chat chat = this.currentChat;
        if (chat.megagroup && !chat.gigagroup && ChatObject.canUserDoAdminAction(chat, 13)) {
            if (this.selectedSlowmode <= 0) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights = this.defaultBannedRights;
                if (tL_chatBannedRights.send_plain || tL_chatBannedRights.send_media || tL_chatBannedRights.send_photos || tL_chatBannedRights.send_videos || tL_chatBannedRights.send_stickers || tL_chatBannedRights.send_audios || tL_chatBannedRights.send_docs || tL_chatBannedRights.send_voices || tL_chatBannedRights.send_roundvideos || tL_chatBannedRights.embed_links || tL_chatBannedRights.send_polls) {
                }
            }
            return true;
        }
        return false;
    }

    public void setInfo(TLRPC.ChatFull chatFull) {
        this.info = chatFull;
        if (chatFull != null) {
            int currentSlowmode = getCurrentSlowmode();
            this.initialSlowmode = currentSlowmode;
            this.selectedSlowmode = currentSlowmode;
            int i = this.info.boosts_unrestrict;
            this.isEnabledNotRestrictBoosters = i > 0;
            this.notRestrictBoosters = i;
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
            long j = chat == null ? 0L : chat.send_paid_messages_stars;
            boolean z = j > 0;
            this.enablePrice = z;
            this.initialEnablePrice = z;
            if (j <= 0) {
                j = 10;
            }
            long clamp = Utilities.clamp(j, getMessagesController().starsPaidMessageAmountMax, 1L);
            this.starsPrice = clamp;
            this.initialStarsPrice = clamp;
        }
    }

    public static int getChannelAdminParticipantType(TLObject tLObject) {
        if ((tLObject instanceof TLRPC.TL_channelParticipantCreator) || (tLObject instanceof TLRPC.TL_channelParticipantSelf)) {
            return 0;
        }
        return ((tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_channelParticipant)) ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadChatParticipants(int i, int i2) {
        if (this.loadingUsers) {
            return;
        }
        this.contactsEndReached = false;
        this.botsEndReached = false;
        loadChatParticipants(i, i2, true);
    }

    private ArrayList loadChatParticipantsRequests(int i, int i2, boolean z) {
        TLRPC.Chat chat;
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_channels_getParticipants);
        tL_channels_getParticipants.channel = getMessagesController().getInputChannel(this.chatId);
        int i3 = this.type;
        if (i3 == 0) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsKicked();
        } else if (i3 == 1) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        } else if (i3 == 2) {
            TLRPC.ChatFull chatFull = this.info;
            if (chatFull != null && chatFull.participants_count <= 200 && (chat = this.currentChat) != null && chat.megagroup) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else if (this.selectType == 1) {
                if (!this.contactsEndReached) {
                    this.delayResults = 2;
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                    this.contactsEndReached = true;
                    arrayList.addAll(loadChatParticipantsRequests(0, NotificationCenter.channelRecommendationsLoaded, false));
                } else {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                }
            } else if (!this.contactsEndReached) {
                this.delayResults = 3;
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                this.contactsEndReached = true;
                arrayList.addAll(loadChatParticipantsRequests(0, NotificationCenter.channelRecommendationsLoaded, false));
            } else if (!this.botsEndReached) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBots();
                this.botsEndReached = true;
                arrayList.addAll(loadChatParticipantsRequests(0, NotificationCenter.channelRecommendationsLoaded, false));
            } else {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            }
        } else if (i3 == 3) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBanned();
        }
        tL_channels_getParticipants.filter.q = "";
        tL_channels_getParticipants.offset = i;
        tL_channels_getParticipants.limit = i2;
        return arrayList;
    }

    private void loadChatParticipants(int i, int i2, boolean z) {
        LongSparseArray longSparseArray;
        int i3 = 0;
        if (!ChatObject.isChannel(this.currentChat)) {
            this.loadingUsers = false;
            this.participants.clear();
            this.bots.clear();
            this.contacts.clear();
            this.participantsMap.clear();
            this.contactsMap.clear();
            this.botsMap.clear();
            int i4 = this.type;
            if (i4 == 1) {
                TLRPC.ChatFull chatFull = this.info;
                if (chatFull != null) {
                    int size = chatFull.participants.participants.size();
                    while (i3 < size) {
                        TLRPC.ChatParticipant chatParticipant = this.info.participants.participants.get(i3);
                        if ((chatParticipant instanceof TLRPC.TL_chatParticipantCreator) || (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                            this.participants.add(chatParticipant);
                        }
                        this.participantsMap.put(chatParticipant.user_id, chatParticipant);
                        i3++;
                    }
                }
            } else if (i4 == 2 && this.info != null) {
                long j = getUserConfig().clientUserId;
                int size2 = this.info.participants.participants.size();
                while (i3 < size2) {
                    TLRPC.ChatParticipant chatParticipant2 = this.info.participants.participants.get(i3);
                    if ((this.selectType == 0 || chatParticipant2.user_id != j) && ((longSparseArray = this.ignoredUsers) == null || longSparseArray.indexOfKey(chatParticipant2.user_id) < 0)) {
                        if (this.selectType == 1) {
                            if (getContactsController().isContact(chatParticipant2.user_id)) {
                                this.contacts.add(chatParticipant2);
                                this.contactsMap.put(chatParticipant2.user_id, chatParticipant2);
                            } else if (!UserObject.isDeleted(getMessagesController().getUser(Long.valueOf(chatParticipant2.user_id)))) {
                                this.participants.add(chatParticipant2);
                                this.participantsMap.put(chatParticipant2.user_id, chatParticipant2);
                            }
                        } else if (getContactsController().isContact(chatParticipant2.user_id)) {
                            this.contacts.add(chatParticipant2);
                            this.contactsMap.put(chatParticipant2.user_id, chatParticipant2);
                        } else {
                            TLRPC.User user = getMessagesController().getUser(Long.valueOf(chatParticipant2.user_id));
                            if (user != null && user.bot) {
                                this.bots.add(chatParticipant2);
                                this.botsMap.put(chatParticipant2.user_id, chatParticipant2);
                            } else {
                                this.participants.add(chatParticipant2);
                                this.participantsMap.put(chatParticipant2.user_id, chatParticipant2);
                            }
                        }
                    }
                    i3++;
                }
            }
            ListAdapter listAdapter = this.listViewAdapter;
            if (listAdapter != null) {
                listAdapter.notifyDataSetChanged();
            }
            updateRows();
            ListAdapter listAdapter2 = this.listViewAdapter;
            if (listAdapter2 != null) {
                listAdapter2.notifyDataSetChanged();
                return;
            }
            return;
        }
        this.loadingUsers = true;
        StickerEmptyView stickerEmptyView = this.emptyView;
        if (stickerEmptyView != null) {
            stickerEmptyView.showProgress(true, false);
        }
        ListAdapter listAdapter3 = this.listViewAdapter;
        if (listAdapter3 != null) {
            listAdapter3.notifyDataSetChanged();
        }
        final ArrayList loadChatParticipantsRequests = loadChatParticipantsRequests(i, i2, z);
        final ArrayList arrayList = new ArrayList();
        final Runnable runnable = new Runnable() { // from class: org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                ChatUsersActivity.this.lambda$loadChatParticipants$29(loadChatParticipantsRequests, arrayList);
            }
        };
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        while (i3 < loadChatParticipantsRequests.size()) {
            arrayList.add(null);
            final int i5 = i3;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest((TLObject) loadChatParticipantsRequests.get(i3), new RequestDelegate() { // from class: org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda3
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    ChatUsersActivity.lambda$loadChatParticipants$31(arrayList, i5, atomicInteger, loadChatParticipantsRequests, runnable, tLObject, tL_error);
                }
            }), this.classGuid);
            i3++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadChatParticipants$29(ArrayList arrayList, ArrayList arrayList2) {
        int i;
        ArrayList arrayList3;
        LongSparseArray longSparseArray;
        int i2;
        TLRPC.Chat chat;
        LongSparseArray longSparseArray2;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        while (i4 < arrayList.size()) {
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = (TLRPC.TL_channels_getParticipants) arrayList.get(i4);
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) arrayList2.get(i4);
            if (tL_channels_getParticipants == null || tL_channels_channelParticipants == null) {
                i = i4;
            } else {
                if (this.type == 1) {
                    getMessagesController().processLoadedAdminsResponse(this.chatId, tL_channels_channelParticipants);
                }
                getMessagesController().putUsers(tL_channels_channelParticipants.users, z);
                getMessagesController().putChats(tL_channels_channelParticipants.chats, z);
                long clientUserId = getUserConfig().getClientUserId();
                if (this.selectType != 0) {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= tL_channels_channelParticipants.participants.size()) {
                            break;
                        }
                        if (MessageObject.getPeerId(tL_channels_channelParticipants.participants.get(i5).peer) == clientUserId) {
                            tL_channels_channelParticipants.participants.remove(i5);
                            break;
                        }
                        i5++;
                    }
                }
                if (this.type == 2) {
                    this.delayResults--;
                    TLRPC.ChannelParticipantsFilter channelParticipantsFilter = tL_channels_getParticipants.filter;
                    if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsContacts) {
                        arrayList3 = this.contacts;
                        longSparseArray = this.contactsMap;
                    } else if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsBots) {
                        arrayList3 = this.bots;
                        longSparseArray = this.botsMap;
                    } else {
                        arrayList3 = this.participants;
                        longSparseArray = this.participantsMap;
                    }
                } else {
                    arrayList3 = this.participants;
                    longSparseArray = this.participantsMap;
                    longSparseArray.clear();
                }
                arrayList3.clear();
                arrayList3.addAll(tL_channels_channelParticipants.participants);
                int size = tL_channels_channelParticipants.participants.size();
                int i6 = 0;
                while (i6 < size) {
                    TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i6);
                    int i7 = i4;
                    if (channelParticipant.user_id == clientUserId) {
                        arrayList3.remove(channelParticipant);
                    } else {
                        longSparseArray.put(MessageObject.getPeerId(channelParticipant.peer), channelParticipant);
                    }
                    i6++;
                    i4 = i7;
                }
                i = i4;
                int size2 = arrayList3.size() + i3;
                if (this.type == 2) {
                    int size3 = this.participants.size();
                    int i8 = 0;
                    while (i8 < size3) {
                        TLObject tLObject = (TLObject) this.participants.get(i8);
                        if (!(tLObject instanceof TLRPC.ChannelParticipant)) {
                            this.participants.remove(i8);
                        } else {
                            long peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer);
                            if (this.contactsMap.get(peerId) != null || this.botsMap.get(peerId) != null || ((this.selectType == 1 && peerId > 0 && UserObject.isDeleted(getMessagesController().getUser(Long.valueOf(peerId)))) || ((longSparseArray2 = this.ignoredUsers) != null && longSparseArray2.indexOfKey(peerId) >= 0))) {
                                this.participants.remove(i8);
                                this.participantsMap.remove(peerId);
                            }
                            i8++;
                        }
                        i8--;
                        size3--;
                        i8++;
                    }
                }
                try {
                    i2 = this.type;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if ((i2 == 0 || i2 == 3 || i2 == 2) && (chat = this.currentChat) != null && chat.megagroup) {
                    TLRPC.ChatFull chatFull = this.info;
                    if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.participants_count <= 200) {
                        sortUsers(arrayList3);
                        i3 = size2;
                    }
                }
                if (i2 == 1) {
                    sortAdmins(this.participants);
                }
                i3 = size2;
            }
            i4 = i + 1;
            z = false;
        }
        if (this.type != 2 || this.delayResults <= 0) {
            ListAdapter listAdapter = this.listViewAdapter;
            showItemsAnimated(listAdapter != null ? listAdapter.getItemCount() : 0);
            this.loadingUsers = false;
            this.firstLoaded = true;
            ActionBarMenuItem actionBarMenuItem = this.searchItem;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setVisibility((this.type != 0 || i3 > 5) ? 0 : 8);
            }
        }
        updateRows();
        if (this.listViewAdapter != null) {
            this.listView.setAnimateEmptyView(this.openTransitionStarted, 0);
            this.listViewAdapter.notifyDataSetChanged();
            if (this.emptyView != null && this.listViewAdapter.getItemCount() == 0 && this.firstLoaded) {
                this.emptyView.showProgress(false, true);
            }
        }
        resumeDelayedFragmentAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadChatParticipants$31(final ArrayList arrayList, final int i, final AtomicInteger atomicInteger, final ArrayList arrayList2, final Runnable runnable, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda19
            @Override // java.lang.Runnable
            public final void run() {
                ChatUsersActivity.lambda$loadChatParticipants$30(TLRPC.TL_error.this, tLObject, arrayList, i, atomicInteger, arrayList2, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadChatParticipants$30(TLRPC.TL_error tL_error, TLObject tLObject, ArrayList arrayList, int i, AtomicInteger atomicInteger, ArrayList arrayList2, Runnable runnable) {
        if (tL_error == null && (tLObject instanceof TLRPC.TL_channels_channelParticipants)) {
            arrayList.set(i, (TLRPC.TL_channels_channelParticipants) tLObject);
        }
        atomicInteger.getAndIncrement();
        if (atomicInteger.get() == arrayList2.size()) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sortUsers(ArrayList arrayList) {
        final int currentTime = getConnectionsManager().getCurrentTime();
        Collections.sort(arrayList, new Comparator() { // from class: org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda8
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$sortUsers$32;
                lambda$sortUsers$32 = ChatUsersActivity.this.lambda$sortUsers$32(currentTime, (TLObject) obj, (TLObject) obj2);
                return lambda$sortUsers$32;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ int lambda$sortUsers$32(int i, TLObject tLObject, TLObject tLObject2) {
        int i2;
        TLRPC.UserStatus userStatus;
        TLRPC.UserStatus userStatus2;
        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
        TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) tLObject2;
        long peerId = MessageObject.getPeerId(channelParticipant.peer);
        long peerId2 = MessageObject.getPeerId(channelParticipant2.peer);
        int i3 = -100;
        if (peerId > 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(channelParticipant.peer)));
            if (user == null || (userStatus2 = user.status) == null) {
                i2 = 0;
            } else {
                i2 = user.self ? i + 50000 : userStatus2.expires;
            }
        } else {
            i2 = -100;
        }
        if (peerId2 > 0) {
            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(channelParticipant2.peer)));
            if (user2 == null || (userStatus = user2.status) == null) {
                i3 = 0;
            } else {
                i3 = user2.self ? i + 50000 : userStatus.expires;
            }
        }
        if (i2 > 0 && i3 > 0) {
            if (i2 > i3) {
                return 1;
            }
            return i2 < i3 ? -1 : 0;
        }
        if (i2 < 0 && i3 < 0) {
            if (i2 > i3) {
                return 1;
            }
            return i2 < i3 ? -1 : 0;
        }
        if ((i2 >= 0 || i3 <= 0) && (i2 != 0 || i3 == 0)) {
            return ((i3 >= 0 || i2 <= 0) && (i3 != 0 || i2 == 0)) ? 0 : 1;
        }
        return -1;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        ListAdapter listAdapter = this.listViewAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
        StickerEmptyView stickerEmptyView = this.emptyView;
        if (stickerEmptyView != null) {
            stickerEmptyView.requestLayout();
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onPause() {
        super.onPause();
        UndoView undoView = this.undoView;
        if (undoView != null) {
            undoView.hide(true, 0);
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onBecomeFullyHidden() {
        UndoView undoView = this.undoView;
        if (undoView != null) {
            undoView.hide(true, 0);
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            this.openTransitionStarted = true;
        }
        if (z && !z2 && this.needOpenSearch) {
            this.searchItem.getSearchField().requestFocus();
            AndroidUtilities.showKeyboard(this.searchItem.getSearchField());
            this.searchItem.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class SearchAdapter extends RecyclerListView.SelectionAdapter {
        private int contactsStartRow;
        private int globalStartRow;
        private int groupStartRow;
        private Context mContext;
        private SearchAdapterHelper searchAdapterHelper;
        private boolean searchInProgress;
        private Runnable searchRunnable;
        private ArrayList searchResult = new ArrayList();
        private LongSparseArray searchResultMap = new LongSparseArray();
        private ArrayList searchResultNames = new ArrayList();
        private int totalCount = 0;

        public SearchAdapter(Context context) {
            this.mContext = context;
            SearchAdapterHelper searchAdapterHelper = new SearchAdapterHelper(true);
            this.searchAdapterHelper = searchAdapterHelper;
            searchAdapterHelper.setDelegate(new SearchAdapterHelper.SearchAdapterHelperDelegate() { // from class: org.telegram.ui.ChatUsersActivity$SearchAdapter$$ExternalSyntheticLambda2
                @Override // org.telegram.ui.Adapters.SearchAdapterHelper.SearchAdapterHelperDelegate
                public /* synthetic */ boolean canApplySearchResults(int i) {
                    return SearchAdapterHelper.SearchAdapterHelperDelegate.-CC.$default$canApplySearchResults(this, i);
                }

                @Override // org.telegram.ui.Adapters.SearchAdapterHelper.SearchAdapterHelperDelegate
                public /* synthetic */ LongSparseArray getExcludeCallParticipants() {
                    return SearchAdapterHelper.SearchAdapterHelperDelegate.-CC.$default$getExcludeCallParticipants(this);
                }

                @Override // org.telegram.ui.Adapters.SearchAdapterHelper.SearchAdapterHelperDelegate
                public /* synthetic */ LongSparseArray getExcludeUsers() {
                    return SearchAdapterHelper.SearchAdapterHelperDelegate.-CC.$default$getExcludeUsers(this);
                }

                @Override // org.telegram.ui.Adapters.SearchAdapterHelper.SearchAdapterHelperDelegate
                public final void onDataSetChanged(int i) {
                    ChatUsersActivity.SearchAdapter.this.lambda$new$0(i);
                }

                @Override // org.telegram.ui.Adapters.SearchAdapterHelper.SearchAdapterHelperDelegate
                public /* synthetic */ void onSetHashtags(ArrayList arrayList, HashMap hashMap) {
                    SearchAdapterHelper.SearchAdapterHelperDelegate.-CC.$default$onSetHashtags(this, arrayList, hashMap);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0(int i) {
            if (this.searchAdapterHelper.isSearchInProgress()) {
                return;
            }
            int itemCount = getItemCount();
            notifyDataSetChanged();
            if (getItemCount() > itemCount) {
                ChatUsersActivity.this.showItemsAnimated(itemCount);
            }
            if (this.searchInProgress || getItemCount() != 0 || i == 0) {
                return;
            }
            ChatUsersActivity.this.emptyView.showProgress(false, true);
        }

        public void searchUsers(final String str) {
            if (this.searchRunnable != null) {
                Utilities.searchQueue.cancelRunnable(this.searchRunnable);
                this.searchRunnable = null;
            }
            this.searchResult.clear();
            this.searchResultMap.clear();
            this.searchResultNames.clear();
            this.searchAdapterHelper.mergeResults(null);
            this.searchAdapterHelper.queryServerSearch(null, ChatUsersActivity.this.type != 0, false, true, false, false, ChatObject.isChannel(ChatUsersActivity.this.currentChat) ? ChatUsersActivity.this.chatId : 0L, false, ChatUsersActivity.this.type, 0);
            notifyDataSetChanged();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.searchInProgress = true;
            ChatUsersActivity.this.emptyView.showProgress(true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            Runnable runnable = new Runnable() { // from class: org.telegram.ui.ChatUsersActivity$SearchAdapter$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ChatUsersActivity.SearchAdapter.this.lambda$searchUsers$1(str);
                }
            };
            this.searchRunnable = runnable;
            dispatchQueue.postRunnable(runnable, 300L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: processSearch, reason: merged with bridge method [inline-methods] */
        public void lambda$searchUsers$1(final String str) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ChatUsersActivity$SearchAdapter$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    ChatUsersActivity.SearchAdapter.this.lambda$processSearch$3(str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$processSearch$3(final String str) {
            Runnable runnable = null;
            this.searchRunnable = null;
            final ArrayList arrayList = (ChatObject.isChannel(ChatUsersActivity.this.currentChat) || ChatUsersActivity.this.info == null) ? null : new ArrayList(ChatUsersActivity.this.info.participants.participants);
            final ArrayList arrayList2 = ChatUsersActivity.this.selectType == 1 ? new ArrayList(ChatUsersActivity.this.getContactsController().contacts) : null;
            if (arrayList != null || arrayList2 != null) {
                runnable = new Runnable() { // from class: org.telegram.ui.ChatUsersActivity$SearchAdapter$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        ChatUsersActivity.SearchAdapter.this.lambda$processSearch$2(str, arrayList, arrayList2);
                    }
                };
            } else {
                this.searchInProgress = false;
            }
            this.searchAdapterHelper.queryServerSearch(str, ChatUsersActivity.this.selectType != 0, false, true, false, false, ChatObject.isChannel(ChatUsersActivity.this.currentChat) ? ChatUsersActivity.this.chatId : 0L, false, ChatUsersActivity.this.type, 1, 0L, runnable);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x014c, code lost:
        
            if (r15.contains(" " + r4) != false) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x024a, code lost:
        
            if (r5.contains(" " + r9) != false) goto L96;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:101:0x02a8 A[LOOP:3: B:85:0x0210->B:101:0x02a8, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:102:0x025e A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0196 A[LOOP:1: B:35:0x010e->B:51:0x0196, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0161 A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r9v15 */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v21 */
        /* JADX WARN: Type inference failed for: r9v23 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ void lambda$processSearch$2(String str, ArrayList arrayList, ArrayList arrayList2) {
            int i;
            LongSparseArray longSparseArray;
            ArrayList arrayList3;
            int i2;
            long peerId;
            String[] strArr;
            int i3;
            ArrayList arrayList4;
            LongSparseArray longSparseArray2;
            int i4;
            String publicUsername;
            String str2;
            String str3;
            String str4;
            ?? r9;
            ArrayList arrayList5 = arrayList;
            String lowerCase = str.trim().toLowerCase();
            if (lowerCase.length() == 0) {
                updateSearchResults(new ArrayList(), new LongSparseArray(), new ArrayList(), new ArrayList());
                return;
            }
            String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
            if (lowerCase.equals(translitString) || translitString.length() == 0) {
                translitString = null;
            }
            int i5 = 0;
            int i6 = (translitString != null ? 1 : 0) + 1;
            String[] strArr2 = new String[i6];
            strArr2[0] = lowerCase;
            if (translitString != null) {
                strArr2[1] = translitString;
            }
            ArrayList arrayList6 = new ArrayList();
            LongSparseArray longSparseArray3 = new LongSparseArray();
            ArrayList arrayList7 = new ArrayList();
            ArrayList arrayList8 = new ArrayList();
            if (arrayList5 != null) {
                int size = arrayList.size();
                while (i5 < size) {
                    TLObject tLObject = (TLObject) arrayList5.get(i5);
                    if (tLObject instanceof TLRPC.ChatParticipant) {
                        i2 = i6;
                        peerId = ((TLRPC.ChatParticipant) tLObject).user_id;
                    } else {
                        i2 = i6;
                        if (tLObject instanceof TLRPC.ChannelParticipant) {
                            peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer);
                        }
                        arrayList4 = arrayList6;
                        longSparseArray2 = longSparseArray3;
                        strArr = strArr2;
                        i4 = size;
                        i3 = i2;
                        i5++;
                        arrayList5 = arrayList;
                        size = i4;
                        longSparseArray3 = longSparseArray2;
                        arrayList6 = arrayList4;
                        i6 = i3;
                        strArr2 = strArr;
                    }
                    if (peerId > 0) {
                        TLRPC.User user = ChatUsersActivity.this.getMessagesController().getUser(Long.valueOf(peerId));
                        if (user.id != ChatUsersActivity.this.getUserConfig().getClientUserId()) {
                            str3 = UserObject.getUserName(user).toLowerCase();
                            publicUsername = UserObject.getPublicUsername(user);
                            str2 = user.first_name;
                            str4 = user.last_name;
                            i4 = size;
                        }
                        arrayList4 = arrayList6;
                        longSparseArray2 = longSparseArray3;
                        strArr = strArr2;
                        i4 = size;
                        i3 = i2;
                        i5++;
                        arrayList5 = arrayList;
                        size = i4;
                        longSparseArray3 = longSparseArray2;
                        arrayList6 = arrayList4;
                        i6 = i3;
                        strArr2 = strArr;
                    } else {
                        TLRPC.Chat chat = ChatUsersActivity.this.getMessagesController().getChat(Long.valueOf(-peerId));
                        String lowerCase2 = chat.title.toLowerCase();
                        publicUsername = ChatObject.getPublicUsername(chat);
                        str2 = chat.title;
                        str3 = lowerCase2;
                        i4 = size;
                        str4 = null;
                    }
                    String translitString2 = LocaleController.getInstance().getTranslitString(str3);
                    if (str3.equals(translitString2)) {
                        translitString2 = null;
                    }
                    arrayList4 = arrayList6;
                    longSparseArray2 = longSparseArray3;
                    int i7 = i2;
                    int i8 = 0;
                    boolean z = false;
                    while (true) {
                        i3 = i7;
                        if (i8 >= i7) {
                            strArr = strArr2;
                            break;
                        }
                        String str5 = strArr2[i8];
                        if (str3.startsWith(str5)) {
                            strArr = strArr2;
                        } else {
                            strArr = strArr2;
                            if (!str3.contains(" " + str5)) {
                                if (translitString2 != null) {
                                    if (!translitString2.startsWith(str5)) {
                                    }
                                }
                                r9 = (publicUsername == null || !publicUsername.startsWith(str5)) ? z : 2;
                                if (r9 == 0) {
                                    if (r9 == 1) {
                                        arrayList7.add(AndroidUtilities.generateSearchName(str2, str4, str5));
                                    } else {
                                        arrayList7.add(AndroidUtilities.generateSearchName("@" + publicUsername, null, "@" + str5));
                                    }
                                    arrayList8.add(tLObject);
                                } else {
                                    i8++;
                                    i7 = i3;
                                    z = r9;
                                    strArr2 = strArr;
                                }
                            }
                        }
                        r9 = 1;
                        if (r9 == 0) {
                        }
                    }
                    i5++;
                    arrayList5 = arrayList;
                    size = i4;
                    longSparseArray3 = longSparseArray2;
                    arrayList6 = arrayList4;
                    i6 = i3;
                    strArr2 = strArr;
                }
            }
            ArrayList arrayList9 = arrayList6;
            LongSparseArray longSparseArray4 = longSparseArray3;
            int i9 = i6;
            String[] strArr3 = strArr2;
            if (arrayList2 != null) {
                int i10 = 0;
                while (i10 < arrayList2.size()) {
                    TLRPC.User user2 = ChatUsersActivity.this.getMessagesController().getUser(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i10)).user_id));
                    if (user2.id == ChatUsersActivity.this.getUserConfig().getClientUserId()) {
                        longSparseArray = longSparseArray4;
                        arrayList3 = arrayList9;
                        i = i9;
                    } else {
                        String lowerCase3 = UserObject.getUserName(user2).toLowerCase();
                        String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase3);
                        if (lowerCase3.equals(translitString3)) {
                            translitString3 = null;
                        }
                        i = i9;
                        char c = 0;
                        for (int i11 = 0; i11 < i; i11++) {
                            String str6 = strArr3[i11];
                            if (!lowerCase3.startsWith(str6)) {
                                if (!lowerCase3.contains(" " + str6)) {
                                    if (translitString3 != null) {
                                        if (!translitString3.startsWith(str6)) {
                                        }
                                    }
                                    String publicUsername2 = UserObject.getPublicUsername(user2);
                                    if (publicUsername2 != null && publicUsername2.startsWith(str6)) {
                                        c = 2;
                                    }
                                    if (c == 0) {
                                        if (c == 1) {
                                            arrayList7.add(AndroidUtilities.generateSearchName(user2.first_name, user2.last_name, str6));
                                            arrayList3 = arrayList9;
                                        } else {
                                            arrayList7.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user2), null, "@" + str6));
                                            arrayList3 = arrayList9;
                                        }
                                        arrayList3.add(user2);
                                        LongSparseArray longSparseArray5 = longSparseArray4;
                                        longSparseArray5.put(user2.id, user2);
                                        longSparseArray = longSparseArray5;
                                        i10++;
                                        i9 = i;
                                        longSparseArray4 = longSparseArray;
                                        arrayList9 = arrayList3;
                                    }
                                }
                            }
                            c = 1;
                            if (c == 0) {
                            }
                        }
                        longSparseArray = longSparseArray4;
                        arrayList3 = arrayList9;
                    }
                    i10++;
                    i9 = i;
                    longSparseArray4 = longSparseArray;
                    arrayList9 = arrayList3;
                }
            }
            updateSearchResults(arrayList9, longSparseArray4, arrayList7, arrayList8);
        }

        private void updateSearchResults(final ArrayList arrayList, final LongSparseArray longSparseArray, final ArrayList arrayList2, final ArrayList arrayList3) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ChatUsersActivity$SearchAdapter$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    ChatUsersActivity.SearchAdapter.this.lambda$updateSearchResults$4(arrayList, longSparseArray, arrayList2, arrayList3);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$updateSearchResults$4(ArrayList arrayList, LongSparseArray longSparseArray, ArrayList arrayList2, ArrayList arrayList3) {
            if (ChatUsersActivity.this.searching) {
                this.searchInProgress = false;
                this.searchResult = arrayList;
                this.searchResultMap = longSparseArray;
                this.searchResultNames = arrayList2;
                this.searchAdapterHelper.mergeResults(arrayList);
                if (!ChatObject.isChannel(ChatUsersActivity.this.currentChat)) {
                    ArrayList groupSearch = this.searchAdapterHelper.getGroupSearch();
                    groupSearch.clear();
                    groupSearch.addAll(arrayList3);
                }
                int itemCount = getItemCount();
                notifyDataSetChanged();
                if (getItemCount() > itemCount) {
                    ChatUsersActivity.this.showItemsAnimated(itemCount);
                }
                if (this.searchAdapterHelper.isSearchInProgress() || getItemCount() != 0) {
                    return;
                }
                ChatUsersActivity.this.emptyView.showProgress(false, true);
            }
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() != 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.totalCount;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void notifyDataSetChanged() {
            this.totalCount = 0;
            int size = this.searchAdapterHelper.getGroupSearch().size();
            if (size != 0) {
                this.groupStartRow = 0;
                this.totalCount += size + 1;
            } else {
                this.groupStartRow = -1;
            }
            int size2 = this.searchResult.size();
            if (size2 != 0) {
                int i = this.totalCount;
                this.contactsStartRow = i;
                this.totalCount = i + size2 + 1;
            } else {
                this.contactsStartRow = -1;
            }
            int size3 = this.searchAdapterHelper.getGlobalSearch().size();
            if (size3 != 0) {
                int i2 = this.totalCount;
                this.globalStartRow = i2;
                this.totalCount = i2 + size3 + 1;
            } else {
                this.globalStartRow = -1;
            }
            if (ChatUsersActivity.this.searching && ChatUsersActivity.this.listView != null && ChatUsersActivity.this.listView.getAdapter() != ChatUsersActivity.this.searchListViewAdapter) {
                ChatUsersActivity.this.listView.setAnimateEmptyView(true, 0);
                ChatUsersActivity.this.listView.setAdapter(ChatUsersActivity.this.searchListViewAdapter);
                ChatUsersActivity.this.listView.setFastScrollVisible(false);
                ChatUsersActivity.this.listView.setVerticalScrollBarEnabled(true);
            }
            super.notifyDataSetChanged();
        }

        public void removeUserId(long j) {
            this.searchAdapterHelper.removeUserId(j);
            Object obj = this.searchResultMap.get(j);
            if (obj != null) {
                this.searchResult.remove(obj);
            }
            notifyDataSetChanged();
        }

        public TLObject getItem(int i) {
            int size = this.searchAdapterHelper.getGroupSearch().size();
            if (size != 0) {
                int i2 = size + 1;
                if (i2 > i) {
                    if (i == 0) {
                        return null;
                    }
                    return (TLObject) this.searchAdapterHelper.getGroupSearch().get(i - 1);
                }
                i -= i2;
            }
            int size2 = this.searchResult.size();
            if (size2 != 0) {
                int i3 = size2 + 1;
                if (i3 > i) {
                    if (i == 0) {
                        return null;
                    }
                    return (TLObject) this.searchResult.get(i - 1);
                }
                i -= i3;
            }
            int size3 = this.searchAdapterHelper.getGlobalSearch().size();
            if (size3 == 0 || size3 + 1 <= i || i == 0) {
                return null;
            }
            return (TLObject) this.searchAdapterHelper.getGlobalSearch().get(i - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean lambda$onCreateViewHolder$5(ManageChatUserCell manageChatUserCell, boolean z) {
            TLObject item = getItem(((Integer) manageChatUserCell.getTag()).intValue());
            if (!(item instanceof TLRPC.ChannelParticipant)) {
                return false;
            }
            return ChatUsersActivity.this.createMenuForParticipant((TLRPC.ChannelParticipant) item, !z, manageChatUserCell);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            FrameLayout frameLayout;
            if (i == 0) {
                ManageChatUserCell manageChatUserCell = new ManageChatUserCell(this.mContext, 2, 2, ChatUsersActivity.this.selectType == 0);
                manageChatUserCell.setDelegate(new ManageChatUserCell.ManageChatUserCellDelegate() { // from class: org.telegram.ui.ChatUsersActivity$SearchAdapter$$ExternalSyntheticLambda1
                    @Override // org.telegram.ui.Cells.ManageChatUserCell.ManageChatUserCellDelegate
                    public final boolean onOptionsButtonCheck(ManageChatUserCell manageChatUserCell2, boolean z) {
                        boolean lambda$onCreateViewHolder$5;
                        lambda$onCreateViewHolder$5 = ChatUsersActivity.SearchAdapter.this.lambda$onCreateViewHolder$5(manageChatUserCell2, z);
                        return lambda$onCreateViewHolder$5;
                    }
                });
                frameLayout = manageChatUserCell;
            } else {
                FrameLayout graySectionCell = new GraySectionCell(this.mContext, 26, ((BaseFragment) ChatUsersActivity.this).resourceProvider);
                graySectionCell.setBackground(null);
                frameLayout = graySectionCell;
            }
            return new RecyclerListView.Holder(frameLayout);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00e2  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00f4  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0139 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0156  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x016b A[Catch: Exception -> 0x0186, TryCatch #0 {Exception -> 0x0186, blocks: (B:63:0x015a, B:65:0x016b, B:67:0x0171, B:68:0x0176, B:70:0x0174), top: B:62:0x015a }] */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0190 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:78:0x019d  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0131  */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String publicUsername;
            TLObject tLObject;
            int size;
            String str;
            boolean z;
            boolean z2;
            SpannableStringBuilder spannableStringBuilder;
            int indexOfIgnoreCase;
            int size2;
            String lastFoundUsername;
            int indexOfIgnoreCase2;
            int size3;
            int i2;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    return;
                }
                GraySectionCell graySectionCell = (GraySectionCell) viewHolder.itemView;
                if (i == this.groupStartRow) {
                    if (ChatUsersActivity.this.type != 0) {
                        if (ChatUsersActivity.this.type != 3) {
                            if (ChatUsersActivity.this.isChannel) {
                                graySectionCell.setText(LocaleController.getString(R.string.ChannelSubscribers));
                                return;
                            } else {
                                graySectionCell.setText(LocaleController.getString(R.string.ChannelMembers));
                                return;
                            }
                        }
                        graySectionCell.setText(LocaleController.getString(R.string.ChannelRestrictedUsers));
                        return;
                    }
                    graySectionCell.setText(LocaleController.getString(R.string.ChannelBlockedUsers));
                    return;
                }
                if (i == this.globalStartRow) {
                    graySectionCell.setText(LocaleController.getString(R.string.GlobalSearch));
                    return;
                } else {
                    if (i == this.contactsStartRow) {
                        graySectionCell.setText(LocaleController.getString(R.string.Contacts));
                        return;
                    }
                    return;
                }
            }
            TLObject item = getItem(i);
            boolean z3 = item instanceof TLRPC.User;
            String str2 = null;
            TLObject tLObject2 = item;
            if (!z3) {
                if (item instanceof TLRPC.ChannelParticipant) {
                    long peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) item).peer);
                    if (peerId >= 0) {
                        TLRPC.User user = ChatUsersActivity.this.getMessagesController().getUser(Long.valueOf(peerId));
                        tLObject2 = user;
                        if (user != null) {
                            publicUsername = UserObject.getPublicUsername(user);
                            tLObject = user;
                            size = this.searchAdapterHelper.getGroupSearch().size();
                            if (size != 0) {
                                int i3 = size + 1;
                                if (i3 > i) {
                                    str = this.searchAdapterHelper.getLastFoundChannel();
                                    z = true;
                                    if (!z && (size3 = this.searchResult.size()) != 0) {
                                        i2 = size3 + 1;
                                        if (i2 <= i) {
                                            CharSequence charSequence = (CharSequence) this.searchResultNames.get(i - 1);
                                            if (charSequence != 0 && !TextUtils.isEmpty(publicUsername)) {
                                                if (charSequence.toString().startsWith("@" + publicUsername)) {
                                                    z2 = true;
                                                    spannableStringBuilder = null;
                                                    str2 = charSequence;
                                                    if (!z2 && publicUsername != null && (size2 = this.searchAdapterHelper.getGlobalSearch().size()) != 0 && size2 + 1 > i) {
                                                        lastFoundUsername = this.searchAdapterHelper.getLastFoundUsername();
                                                        if (lastFoundUsername.startsWith("@")) {
                                                            lastFoundUsername = lastFoundUsername.substring(1);
                                                        }
                                                        try {
                                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                                            spannableStringBuilder2.append((CharSequence) "@");
                                                            spannableStringBuilder2.append((CharSequence) publicUsername);
                                                            indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(publicUsername, lastFoundUsername);
                                                            if (indexOfIgnoreCase2 != -1) {
                                                                int length = lastFoundUsername.length();
                                                                if (indexOfIgnoreCase2 == 0) {
                                                                    length++;
                                                                } else {
                                                                    indexOfIgnoreCase2++;
                                                                }
                                                                spannableStringBuilder2.setSpan(new ForegroundColorSpan(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4)), indexOfIgnoreCase2, length + indexOfIgnoreCase2, 33);
                                                            }
                                                            str2 = spannableStringBuilder2;
                                                        } catch (Exception e) {
                                                            FileLog.e(e);
                                                            str2 = publicUsername;
                                                        }
                                                    }
                                                    if (str != null && publicUsername != null) {
                                                        spannableStringBuilder = new SpannableStringBuilder(publicUsername);
                                                        indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(publicUsername, str);
                                                        if (indexOfIgnoreCase != -1) {
                                                            spannableStringBuilder.setSpan(new ForegroundColorSpan(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4)), indexOfIgnoreCase, str.length() + indexOfIgnoreCase, 33);
                                                        }
                                                    }
                                                    ManageChatUserCell manageChatUserCell = (ManageChatUserCell) viewHolder.itemView;
                                                    manageChatUserCell.setTag(Integer.valueOf(i));
                                                    manageChatUserCell.setData(tLObject, spannableStringBuilder, str2, false);
                                                }
                                            }
                                            z2 = true;
                                            spannableStringBuilder = charSequence;
                                            if (!z2) {
                                                lastFoundUsername = this.searchAdapterHelper.getLastFoundUsername();
                                                if (lastFoundUsername.startsWith("@")) {
                                                }
                                                SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder();
                                                spannableStringBuilder22.append((CharSequence) "@");
                                                spannableStringBuilder22.append((CharSequence) publicUsername);
                                                indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(publicUsername, lastFoundUsername);
                                                if (indexOfIgnoreCase2 != -1) {
                                                }
                                                str2 = spannableStringBuilder22;
                                            }
                                            if (str != null) {
                                                spannableStringBuilder = new SpannableStringBuilder(publicUsername);
                                                indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(publicUsername, str);
                                                if (indexOfIgnoreCase != -1) {
                                                }
                                            }
                                            ManageChatUserCell manageChatUserCell2 = (ManageChatUserCell) viewHolder.itemView;
                                            manageChatUserCell2.setTag(Integer.valueOf(i));
                                            manageChatUserCell2.setData(tLObject, spannableStringBuilder, str2, false);
                                        }
                                        i -= i2;
                                    }
                                    z2 = z;
                                    spannableStringBuilder = null;
                                    if (!z2) {
                                    }
                                    if (str != null) {
                                    }
                                    ManageChatUserCell manageChatUserCell22 = (ManageChatUserCell) viewHolder.itemView;
                                    manageChatUserCell22.setTag(Integer.valueOf(i));
                                    manageChatUserCell22.setData(tLObject, spannableStringBuilder, str2, false);
                                }
                                i -= i3;
                            }
                            str = null;
                            z = false;
                            if (!z) {
                                i2 = size3 + 1;
                                if (i2 <= i) {
                                }
                            }
                            z2 = z;
                            spannableStringBuilder = null;
                            if (!z2) {
                            }
                            if (str != null) {
                            }
                            ManageChatUserCell manageChatUserCell222 = (ManageChatUserCell) viewHolder.itemView;
                            manageChatUserCell222.setTag(Integer.valueOf(i));
                            manageChatUserCell222.setData(tLObject, spannableStringBuilder, str2, false);
                        }
                    } else {
                        TLRPC.Chat chat = ChatUsersActivity.this.getMessagesController().getChat(Long.valueOf(-peerId));
                        tLObject2 = chat;
                        if (chat != null) {
                            publicUsername = ChatObject.getPublicUsername(chat);
                            tLObject = chat;
                            size = this.searchAdapterHelper.getGroupSearch().size();
                            if (size != 0) {
                            }
                            str = null;
                            z = false;
                            if (!z) {
                            }
                            z2 = z;
                            spannableStringBuilder = null;
                            if (!z2) {
                            }
                            if (str != null) {
                            }
                            ManageChatUserCell manageChatUserCell2222 = (ManageChatUserCell) viewHolder.itemView;
                            manageChatUserCell2222.setTag(Integer.valueOf(i));
                            manageChatUserCell2222.setData(tLObject, spannableStringBuilder, str2, false);
                        }
                    }
                } else if (!(item instanceof TLRPC.ChatParticipant)) {
                    return;
                } else {
                    tLObject2 = ChatUsersActivity.this.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) item).user_id));
                }
            }
            publicUsername = null;
            tLObject = tLObject2;
            size = this.searchAdapterHelper.getGroupSearch().size();
            if (size != 0) {
            }
            str = null;
            z = false;
            if (!z) {
            }
            z2 = z;
            spannableStringBuilder = null;
            if (!z2) {
            }
            if (str != null) {
            }
            ManageChatUserCell manageChatUserCell22222 = (ManageChatUserCell) viewHolder.itemView;
            manageChatUserCell22222.setTag(Integer.valueOf(i));
            manageChatUserCell22222.setData(tLObject, spannableStringBuilder, str2, false);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof ManageChatUserCell) {
                ((ManageChatUserCell) view).recycle();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return (i == this.globalStartRow || i == this.groupStartRow || i == this.contactsStartRow) ? 1 : 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 16) {
                return true;
            }
            if (itemViewType == 7 || itemViewType == 14) {
                return ChatObject.canBlockUsers(ChatUsersActivity.this.currentChat);
            }
            if (itemViewType == 0) {
                Object currentObject = ((ManageChatUserCell) viewHolder.itemView).getCurrentObject();
                return (ChatUsersActivity.this.type != 1 && (currentObject instanceof TLRPC.User) && ((TLRPC.User) currentObject).self) ? false : true;
            }
            int adapterPosition = viewHolder.getAdapterPosition();
            if (itemViewType == 0 || itemViewType == 2 || itemViewType == 6) {
                return true;
            }
            if (itemViewType == 12) {
                if (adapterPosition == ChatUsersActivity.this.antiSpamRow) {
                    return ChatObject.canUserDoAdminAction(ChatUsersActivity.this.currentChat, 13);
                }
                if (adapterPosition == ChatUsersActivity.this.hideMembersRow) {
                    return ChatObject.canUserDoAdminAction(ChatUsersActivity.this.currentChat, 2);
                }
                if (adapterPosition == ChatUsersActivity.this.tagsRow) {
                    return true;
                }
            }
            return itemViewType == 13;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return ChatUsersActivity.this.rowCount;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean lambda$onCreateViewHolder$0(ManageChatUserCell manageChatUserCell, boolean z) {
            return ChatUsersActivity.this.createMenuForParticipant(ChatUsersActivity.this.listViewAdapter.getItem(((Integer) manageChatUserCell.getTag()).intValue()), !z, manageChatUserCell);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            switch (i) {
                case 0:
                    ManageChatUserCell manageChatUserCell = new ManageChatUserCell(this.mContext, (ChatUsersActivity.this.type == 0 || ChatUsersActivity.this.type == 3) ? 7 : 6, (ChatUsersActivity.this.type == 0 || ChatUsersActivity.this.type == 3) ? 6 : 2, ChatUsersActivity.this.selectType == 0);
                    manageChatUserCell.setDelegate(new ManageChatUserCell.ManageChatUserCellDelegate() { // from class: org.telegram.ui.ChatUsersActivity$ListAdapter$$ExternalSyntheticLambda4
                        @Override // org.telegram.ui.Cells.ManageChatUserCell.ManageChatUserCellDelegate
                        public final boolean onOptionsButtonCheck(ManageChatUserCell manageChatUserCell2, boolean z) {
                            boolean lambda$onCreateViewHolder$0;
                            lambda$onCreateViewHolder$0 = ChatUsersActivity.ListAdapter.this.lambda$onCreateViewHolder$0(manageChatUserCell2, z);
                            return lambda$onCreateViewHolder$0;
                        }
                    });
                    view = manageChatUserCell;
                    break;
                case 1:
                    view = new TextInfoPrivacyCell(this.mContext);
                    break;
                case 2:
                    view = new ManageChatTextCell(this.mContext);
                    break;
                case 3:
                    view = new ShadowSectionCell(this.mContext);
                    break;
                case 4:
                    TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(this.mContext);
                    if (ChatUsersActivity.this.isChannel) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                        view = textInfoPrivacyCell;
                        break;
                    } else {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                        view = textInfoPrivacyCell;
                        break;
                    }
                case 5:
                    HeaderCell headerCell = new HeaderCell(this.mContext, Theme.key_windowBackgroundWhiteBlueHeader, 21, 11, false);
                    headerCell.setHeight(43);
                    view = headerCell;
                    break;
                case 6:
                    view = new TextSettingsCell(this.mContext);
                    break;
                case 7:
                case 14:
                    view = new TextCheckCell2(this.mContext);
                    break;
                case 8:
                    View graySectionCell = new GraySectionCell(this.mContext, 26, ((BaseFragment) ChatUsersActivity.this).resourceProvider);
                    graySectionCell.setBackground(null);
                    view = graySectionCell;
                    break;
                case 9:
                default:
                    SlideChooseView slideChooseView = new SlideChooseView(this.mContext);
                    int i2 = ChatUsersActivity.this.selectedSlowmode;
                    String string = LocaleController.getString("SlowmodeOff", R.string.SlowmodeOff);
                    int i3 = R.string.SlowmodeSeconds;
                    String formatString = LocaleController.formatString(i3, 5);
                    String formatString2 = LocaleController.formatString(i3, 10);
                    String formatString3 = LocaleController.formatString(i3, 30);
                    int i4 = R.string.SlowmodeMinutes;
                    slideChooseView.setOptions(i2, string, formatString, formatString2, formatString3, LocaleController.formatString(i4, 1), LocaleController.formatString(i4, 5), LocaleController.formatString(i4, 15), LocaleController.formatString(R.string.SlowmodeHours, 1));
                    slideChooseView.setCallback(new SlideChooseView.Callback() { // from class: org.telegram.ui.ChatUsersActivity$ListAdapter$$ExternalSyntheticLambda2
                        @Override // org.telegram.ui.Components.SlideChooseView.Callback
                        public final void onOptionSelected(int i5) {
                            ChatUsersActivity.ListAdapter.this.lambda$onCreateViewHolder$1(i5);
                        }

                        @Override // org.telegram.ui.Components.SlideChooseView.Callback
                        public /* synthetic */ void onTouchEnd() {
                            SlideChooseView.Callback.-CC.$default$onTouchEnd(this);
                        }
                    });
                    view = slideChooseView;
                    break;
                case 10:
                    view = new LoadingCell(this.mContext, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                    break;
                case 11:
                    FlickerLoadingView flickerLoadingView = new FlickerLoadingView(this.mContext);
                    flickerLoadingView.setIsSingleCell(true);
                    flickerLoadingView.setViewType(6);
                    flickerLoadingView.showDate(false);
                    flickerLoadingView.setPaddingLeft(AndroidUtilities.dp(5.0f));
                    flickerLoadingView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                    view = flickerLoadingView;
                    break;
                case 12:
                    TextCell textCell = new TextCell(this.mContext, 23, false, true, ChatUsersActivity.this.getResourceProvider());
                    textCell.heightDp = 50;
                    view = textCell;
                    break;
                case 13:
                    CheckBoxCell checkBoxCell = new CheckBoxCell(this.mContext, 4, 21, ChatUsersActivity.this.getResourceProvider());
                    checkBoxCell.getCheckBoxRound().setDrawBackgroundAsArc(14);
                    checkBoxCell.getCheckBoxRound().setColor(Theme.key_switch2TrackChecked, Theme.key_radioBackground, Theme.key_checkboxCheck);
                    checkBoxCell.setEnabled(true);
                    view = checkBoxCell;
                    break;
                case 15:
                    SlideChooseView slideChooseView2 = new SlideChooseView(this.mContext);
                    Drawable drawable = ContextCompat.getDrawable(ChatUsersActivity.this.getContext(), R.drawable.mini_boost_profile_badge);
                    Context context = ChatUsersActivity.this.getContext();
                    int i5 = R.drawable.mini_boost_profile_badge2;
                    slideChooseView2.setOptions(ChatUsersActivity.this.notRestrictBoosters > 0 ? ChatUsersActivity.this.notRestrictBoosters - 1 : 0, new Drawable[]{drawable, ContextCompat.getDrawable(context, i5), ContextCompat.getDrawable(ChatUsersActivity.this.getContext(), i5), ContextCompat.getDrawable(ChatUsersActivity.this.getContext(), i5), ContextCompat.getDrawable(ChatUsersActivity.this.getContext(), i5)}, "1", "2", "3", "4", "5");
                    slideChooseView2.setCallback(new SlideChooseView.Callback() { // from class: org.telegram.ui.ChatUsersActivity$ListAdapter$$ExternalSyntheticLambda3
                        @Override // org.telegram.ui.Components.SlideChooseView.Callback
                        public final void onOptionSelected(int i6) {
                            ChatUsersActivity.ListAdapter.this.lambda$onCreateViewHolder$2(i6);
                        }

                        @Override // org.telegram.ui.Components.SlideChooseView.Callback
                        public /* synthetic */ void onTouchEnd() {
                            SlideChooseView.Callback.-CC.$default$onTouchEnd(this);
                        }
                    });
                    view = slideChooseView2;
                    break;
                case 16:
                    view = new TextCheckCell(this.mContext, ChatUsersActivity.this.getResourceProvider());
                    break;
                case 17:
                    view = new SlideIntChooseView(this.mContext, ChatUsersActivity.this.getResourceProvider());
                    break;
            }
            return new RecyclerListView.Holder(view);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreateViewHolder$1(int i) {
            if (ChatUsersActivity.this.info == null) {
                return;
            }
            boolean z = (ChatUsersActivity.this.selectedSlowmode > 0 && i == 0) || (ChatUsersActivity.this.selectedSlowmode == 0 && i > 0);
            ChatUsersActivity.this.selectedSlowmode = i;
            if (z) {
                DiffCallback saveState = ChatUsersActivity.this.saveState();
                ChatUsersActivity.this.updateRows();
                ChatUsersActivity.this.updateListAnimated(saveState);
            }
            ChatUsersActivity.this.listViewAdapter.notifyItemChanged(ChatUsersActivity.this.slowmodeInfoRow);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreateViewHolder$2(int i) {
            ChatUsersActivity.this.notRestrictBoosters = i + 1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:467:0x0b66, code lost:
        
            if (r20.this$0.currentChat.megagroup == false) goto L416;
         */
        /* JADX WARN: Code restructure failed: missing block: B:468:0x0b95, code lost:
        
            r7 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:544:0x0b93, code lost:
        
            if (r20.this$0.currentChat.megagroup == false) goto L416;
         */
        /* JADX WARN: Removed duplicated region for block: B:504:0x0ca1  */
        /* JADX WARN: Removed duplicated region for block: B:507:0x0ca4  */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2;
            boolean z;
            long j;
            int i3;
            boolean z2;
            boolean z3;
            long j2;
            TLRPC.TL_chatBannedRights tL_chatBannedRights;
            boolean z4;
            long j3;
            long j4;
            int i4;
            boolean z5;
            Object chat;
            CharSequence charSequence;
            int i5;
            boolean z6;
            CharSequence charSequence2;
            TLRPC.User user;
            CharSequence charSequence3;
            int i6;
            CharSequence charSequence4;
            CharSequence charSequence5;
            boolean z7;
            TLRPC.User user2;
            CharSequence charSequence6;
            boolean z8;
            r10 = true;
            r10 = true;
            boolean z9 = true;
            switch (viewHolder.getItemViewType()) {
                case 0:
                    ManageChatUserCell manageChatUserCell = (ManageChatUserCell) viewHolder.itemView;
                    manageChatUserCell.setTag(Integer.valueOf(i));
                    TLObject item = getItem(i);
                    if (i < ChatUsersActivity.this.participantsStartRow || i >= ChatUsersActivity.this.participantsEndRow) {
                        if (i < ChatUsersActivity.this.contactsStartRow || i >= ChatUsersActivity.this.contactsEndRow) {
                            i2 = ChatUsersActivity.this.botEndRow;
                        } else {
                            i2 = ChatUsersActivity.this.contactsEndRow;
                            if (ChatObject.isChannel(ChatUsersActivity.this.currentChat)) {
                                break;
                            }
                        }
                        z = false;
                    } else {
                        i2 = ChatUsersActivity.this.participantsEndRow;
                        if (ChatObject.isChannel(ChatUsersActivity.this.currentChat)) {
                            break;
                        }
                        z = false;
                    }
                    if (item instanceof TLRPC.ChannelParticipant) {
                        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) item;
                        j = MessageObject.getPeerId(channelParticipant.peer);
                        j2 = channelParticipant.kicked_by;
                        long j5 = channelParticipant.promoted_by;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights2 = channelParticipant.banned_rights;
                        i3 = channelParticipant.date;
                        z4 = channelParticipant instanceof TLRPC.TL_channelParticipantBanned;
                        z2 = channelParticipant instanceof TLRPC.TL_channelParticipantCreator;
                        z3 = channelParticipant instanceof TLRPC.TL_channelParticipantAdmin;
                        j3 = j5;
                        j4 = 0;
                        tL_chatBannedRights = tL_chatBannedRights2;
                    } else if (item instanceof TLRPC.ChatParticipant) {
                        TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) item;
                        j = chatParticipant.user_id;
                        i3 = chatParticipant.date;
                        z2 = chatParticipant instanceof TLRPC.TL_chatParticipantCreator;
                        z3 = chatParticipant instanceof TLRPC.TL_chatParticipantAdmin;
                        j2 = 0;
                        tL_chatBannedRights = null;
                        z4 = false;
                        j3 = 0;
                        j4 = 0;
                    }
                    if (j > j4) {
                        chat = ChatUsersActivity.this.getMessagesController().getUser(Long.valueOf(j));
                        i4 = i3;
                        z5 = z;
                    } else {
                        i4 = i3;
                        z5 = z;
                        chat = ChatUsersActivity.this.getMessagesController().getChat(Long.valueOf(-j));
                    }
                    if (chat != null) {
                        if (ChatUsersActivity.this.type == 3) {
                            CharSequence formatUserPermissions = ChatUsersActivity.this.formatUserPermissions(tL_chatBannedRights);
                            if (i != i2 - 1) {
                                charSequence6 = null;
                                z8 = true;
                            } else {
                                charSequence6 = null;
                                z8 = false;
                            }
                            manageChatUserCell.setData(chat, charSequence6, formatUserPermissions, z8);
                            break;
                        } else if (ChatUsersActivity.this.type != 0) {
                            if (ChatUsersActivity.this.type != 1) {
                                boolean z10 = false;
                                if (ChatUsersActivity.this.type == 2) {
                                    CharSequence formatJoined = (!z5 || i4 == 0) ? null : LocaleController.formatJoined(i4);
                                    if (i != i2 - 1) {
                                        charSequence = null;
                                        z10 = true;
                                    } else {
                                        charSequence = null;
                                    }
                                    manageChatUserCell.setData(chat, charSequence, formatJoined, z10);
                                    break;
                                }
                            } else {
                                if (z2) {
                                    charSequence2 = LocaleController.getString(R.string.ChannelCreator);
                                } else {
                                    if (!z3 || (user = ChatUsersActivity.this.getMessagesController().getUser(Long.valueOf(j3))) == null) {
                                        i5 = 1;
                                        z6 = false;
                                        charSequence2 = null;
                                    } else if (user.id == j) {
                                        charSequence2 = LocaleController.getString(R.string.ChannelAdministrator);
                                    } else {
                                        i5 = 1;
                                        z6 = false;
                                        charSequence2 = LocaleController.formatString(R.string.EditAdminPromotedBy, UserObject.getUserName(user));
                                    }
                                    if (i == i2 - i5) {
                                        charSequence3 = null;
                                        z6 = true;
                                    } else {
                                        charSequence3 = null;
                                    }
                                    manageChatUserCell.setData(chat, charSequence3, charSequence2, z6);
                                    break;
                                }
                                i5 = 1;
                                z6 = false;
                                if (i == i2 - i5) {
                                }
                                manageChatUserCell.setData(chat, charSequence3, charSequence2, z6);
                            }
                        } else {
                            if (!z4 || (user2 = ChatUsersActivity.this.getMessagesController().getUser(Long.valueOf(j2))) == null) {
                                i6 = 1;
                                charSequence4 = null;
                            } else {
                                i6 = 1;
                                charSequence4 = LocaleController.formatString(R.string.UserRemovedBy, UserObject.getUserName(user2));
                            }
                            if (i != i2 - i6) {
                                charSequence5 = null;
                                z7 = true;
                            } else {
                                charSequence5 = null;
                                z7 = false;
                            }
                            manageChatUserCell.setData(chat, charSequence5, charSequence4, z7);
                            break;
                        }
                    }
                    break;
                case 1:
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                    if (i != ChatUsersActivity.this.antiSpamInfoRow) {
                        if (i == ChatUsersActivity.this.participantsInfoRow) {
                            if (ChatUsersActivity.this.type == 0 || ChatUsersActivity.this.type == 3) {
                                if (ChatUsersActivity.this.isChannel) {
                                    textInfoPrivacyCell.setText(LocaleController.getString("NoBlockedChannel2", R.string.NoBlockedChannel2));
                                } else {
                                    textInfoPrivacyCell.setText(LocaleController.getString("NoBlockedGroup2", R.string.NoBlockedGroup2));
                                }
                                textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                                break;
                            } else if (ChatUsersActivity.this.type == 1) {
                                if (ChatUsersActivity.this.addNewRow != -1) {
                                    if (ChatUsersActivity.this.isChannel) {
                                        textInfoPrivacyCell.setText(LocaleController.getString("ChannelAdminsInfo", R.string.ChannelAdminsInfo));
                                    } else {
                                        textInfoPrivacyCell.setText(LocaleController.getString("MegaAdminsInfo", R.string.MegaAdminsInfo));
                                    }
                                } else {
                                    textInfoPrivacyCell.setText("");
                                }
                                textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                                break;
                            } else if (ChatUsersActivity.this.type == 2) {
                                if (!ChatUsersActivity.this.isChannel || ChatUsersActivity.this.selectType != 0) {
                                    textInfoPrivacyCell.setText("");
                                } else {
                                    textInfoPrivacyCell.setText(LocaleController.getString("ChannelMembersInfo", R.string.ChannelMembersInfo));
                                }
                                textInfoPrivacyCell.setBackground(Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                                break;
                            }
                        } else if (i != ChatUsersActivity.this.slowmodeInfoRow) {
                            if (i != ChatUsersActivity.this.payInfoRow) {
                                if (i != ChatUsersActivity.this.priceInfoRow) {
                                    if (i != ChatUsersActivity.this.hideMembersInfoRow) {
                                        if (i != ChatUsersActivity.this.tagsInfoRow) {
                                            if (i != ChatUsersActivity.this.gigaInfoRow) {
                                                if (i != ChatUsersActivity.this.dontRestrictBoostersInfoRow) {
                                                    if (i == ChatUsersActivity.this.signMessagesInfoRow) {
                                                        textInfoPrivacyCell.setBackground(Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                                                        textInfoPrivacyCell.setText(LocaleController.getString(ChatUsersActivity.this.signatures ? R.string.ChannelSignProfilesInfo : R.string.ChannelSignInfo));
                                                        break;
                                                    }
                                                } else {
                                                    textInfoPrivacyCell.setBackground(Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                                                    if (ChatUsersActivity.this.isEnabledNotRestrictBoosters) {
                                                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.GroupNotRestrictBoostersInfo2));
                                                        break;
                                                    } else {
                                                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.GroupNotRestrictBoostersInfo));
                                                        break;
                                                    }
                                                }
                                            } else {
                                                textInfoPrivacyCell.setText(LocaleController.getString(R.string.BroadcastGroupConvertInfo));
                                                break;
                                            }
                                        } else {
                                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.ChannelMemberTagsInfo));
                                            break;
                                        }
                                    } else {
                                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.ChannelHideMembersInfo));
                                        break;
                                    }
                                } else {
                                    textInfoPrivacyCell.setBackground(Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                                    textInfoPrivacyCell.setText(LocaleController.formatString(R.string.GroupMessagesPriceInfo, AffiliateProgramFragment.percents(ChatUsersActivity.this.getMessagesController().starsPaidMessageCommissionPermille), String.valueOf(((int) (((ChatUsersActivity.this.starsPrice * (ChatUsersActivity.this.getMessagesController().starsPaidMessageCommissionPermille / 1000.0f)) / 1000.0d) * ChatUsersActivity.this.getMessagesController().starsUsdWithdrawRate1000)) / 100.0d)));
                                    break;
                                }
                            } else {
                                textInfoPrivacyCell.setBackground(Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                                textInfoPrivacyCell.setText(LocaleController.getString(R.string.GroupMessagesChargePriceInfo));
                                break;
                            }
                        } else {
                            textInfoPrivacyCell.setBackground(Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                            ChatUsersActivity chatUsersActivity = ChatUsersActivity.this;
                            int secondsForIndex = chatUsersActivity.getSecondsForIndex(chatUsersActivity.selectedSlowmode);
                            if (ChatUsersActivity.this.info != null && secondsForIndex != 0) {
                                textInfoPrivacyCell.setText(LocaleController.formatString(R.string.SlowmodeInfoSelected, ChatUsersActivity.this.formatSeconds(secondsForIndex)));
                                break;
                            } else {
                                textInfoPrivacyCell.setText(LocaleController.getString(R.string.SlowmodeInfoOff));
                                break;
                            }
                        }
                    } else {
                        textInfoPrivacyCell.setText(LocaleController.getString("ChannelAntiSpamInfo", R.string.ChannelAntiSpamInfo));
                        textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                        break;
                    }
                    break;
                case 2:
                    ManageChatTextCell manageChatTextCell = (ManageChatTextCell) viewHolder.itemView;
                    manageChatTextCell.setColors(Theme.key_windowBackgroundWhiteGrayIcon, Theme.key_windowBackgroundWhiteBlackText);
                    if (i == ChatUsersActivity.this.addNewRow) {
                        if (ChatUsersActivity.this.type != 3) {
                            if (ChatUsersActivity.this.type != 0) {
                                if (ChatUsersActivity.this.type != 1) {
                                    if (ChatUsersActivity.this.type == 2) {
                                        manageChatTextCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                                        if (ChatUsersActivity.this.addNew2Row != -1 || ((!ChatUsersActivity.this.loadingUsers || ChatUsersActivity.this.firstLoaded) && ChatUsersActivity.this.membersHeaderRow == -1 && !ChatUsersActivity.this.participants.isEmpty())) {
                                            r9 = true;
                                        }
                                        if (ChatUsersActivity.this.isChannel) {
                                            manageChatTextCell.setText(LocaleController.getString(R.string.AddSubscriber), null, R.drawable.msg_contact_add, r9);
                                            break;
                                        } else {
                                            manageChatTextCell.setText(LocaleController.getString(R.string.AddMember), null, R.drawable.msg_contact_add, r9);
                                            break;
                                        }
                                    }
                                } else {
                                    manageChatTextCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                                    manageChatTextCell.setText(LocaleController.getString("ChannelAddAdmin", R.string.ChannelAddAdmin), null, R.drawable.msg_admin_add, !ChatUsersActivity.this.loadingUsers || ChatUsersActivity.this.firstLoaded);
                                    break;
                                }
                            } else {
                                manageChatTextCell.setText(LocaleController.getString("ChannelBlockUser", R.string.ChannelBlockUser), null, R.drawable.msg_user_remove, false);
                                break;
                            }
                        } else {
                            manageChatTextCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                            manageChatTextCell.setText(LocaleController.getString("ChannelAddException", R.string.ChannelAddException), null, R.drawable.msg_contact_add, ChatUsersActivity.this.participantsStartRow != -1);
                            break;
                        }
                    } else if (i == ChatUsersActivity.this.recentActionsRow) {
                        manageChatTextCell.setText(LocaleController.getString(R.string.EventLog), null, R.drawable.msg_log, ChatUsersActivity.this.antiSpamRow > ChatUsersActivity.this.recentActionsRow);
                        break;
                    } else if (i != ChatUsersActivity.this.addNew2Row) {
                        if (i == ChatUsersActivity.this.gigaConvertRow) {
                            manageChatTextCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                            manageChatTextCell.setText(LocaleController.getString("BroadcastGroupConvert", R.string.BroadcastGroupConvert), null, R.drawable.msg_channel, false);
                            break;
                        }
                    } else {
                        manageChatTextCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                        if ((!ChatUsersActivity.this.loadingUsers || ChatUsersActivity.this.firstLoaded) && ChatUsersActivity.this.membersHeaderRow == -1 && !ChatUsersActivity.this.participants.isEmpty()) {
                            r9 = true;
                        }
                        manageChatTextCell.setText(LocaleController.getString("ChannelInviteViaLink", R.string.ChannelInviteViaLink), null, R.drawable.msg_link2, r9);
                        break;
                    }
                    break;
                case 3:
                    if (i == ChatUsersActivity.this.addNewSectionRow || (ChatUsersActivity.this.type == 3 && i == ChatUsersActivity.this.participantsDividerRow && ChatUsersActivity.this.addNewRow == -1 && ChatUsersActivity.this.participantsStartRow == -1)) {
                        viewHolder.itemView.setBackgroundDrawable(Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                        break;
                    } else {
                        viewHolder.itemView.setBackgroundDrawable(Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                        break;
                    }
                    break;
                case 5:
                    HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                    if (i == ChatUsersActivity.this.restricted1SectionRow) {
                        if (ChatUsersActivity.this.type == 0) {
                            int size = ChatUsersActivity.this.info != null ? ChatUsersActivity.this.info.kicked_count : ChatUsersActivity.this.participants.size();
                            if (size != 0) {
                                headerCell.setText(LocaleController.formatPluralString("RemovedUser", size, new Object[0]));
                                break;
                            } else {
                                headerCell.setText(LocaleController.getString(R.string.ChannelBlockedUsers));
                                break;
                            }
                        } else {
                            headerCell.setText(LocaleController.getString(R.string.ChannelRestrictedUsers));
                            break;
                        }
                    } else if (i != ChatUsersActivity.this.permissionsSectionRow) {
                        if (i != ChatUsersActivity.this.slowmodeRow) {
                            if (i != ChatUsersActivity.this.gigaHeaderRow) {
                                if (i == ChatUsersActivity.this.priceHeaderRow) {
                                    headerCell.setText(LocaleController.getString(R.string.GroupMessagesPriceHeader));
                                    break;
                                }
                            } else {
                                headerCell.setText(LocaleController.getString(R.string.BroadcastGroup));
                                break;
                            }
                        } else {
                            headerCell.setText(LocaleController.getString(R.string.Slowmode));
                            break;
                        }
                    } else {
                        headerCell.setText(LocaleController.getString(R.string.ChannelPermissionsHeader));
                        break;
                    }
                    break;
                case 6:
                    ((TextSettingsCell) viewHolder.itemView).setTextAndValue(LocaleController.getString("ChannelBlacklist", R.string.ChannelBlacklist), String.format("%d", Integer.valueOf(ChatUsersActivity.this.info != null ? ChatUsersActivity.this.info.kicked_count : 0)), false);
                    break;
                case 7:
                case 14:
                    final TextCheckCell2 textCheckCell2 = (TextCheckCell2) viewHolder.itemView;
                    textCheckCell2.getCheckBox().setDrawIconType(1);
                    Switch checkBox = textCheckCell2.getCheckBox();
                    int i7 = Theme.key_fill_RedNormal;
                    int i8 = Theme.key_switch2TrackChecked;
                    int i9 = Theme.key_windowBackgroundWhite;
                    checkBox.setColors(i7, i8, i9, i9);
                    boolean z11 = textCheckCell2.getTag() != null && ((Integer) textCheckCell2.getTag()).intValue() == i;
                    textCheckCell2.setTag(Integer.valueOf(i));
                    if (i == ChatUsersActivity.this.changeInfoRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString("UserRestrictionsChangeInfo", R.string.UserRestrictionsChangeInfo), (ChatUsersActivity.this.defaultBannedRights.change_info || ChatObject.isPublic(ChatUsersActivity.this.currentChat)) ? false : true, ChatUsersActivity.this.manageTopicsRow != -1, z11);
                    } else if (i == ChatUsersActivity.this.addUsersRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString("UserRestrictionsInviteUsers", R.string.UserRestrictionsInviteUsers), !ChatUsersActivity.this.defaultBannedRights.invite_users, true, z11);
                    } else if (i == ChatUsersActivity.this.pinMessagesRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.UserRestrictionsPinMessages), (ChatUsersActivity.this.defaultBannedRights.pin_messages || ChatObject.isPublic(ChatUsersActivity.this.currentChat)) ? false : true, true, z11);
                    } else if (i == ChatUsersActivity.this.editTagRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.UserRestrictionsEditTags), !ChatUsersActivity.this.defaultBannedRights.edit_rank, true, z11);
                    } else if (i == ChatUsersActivity.this.sendMessagesRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString("UserRestrictionsSendText", R.string.UserRestrictionsSendText), !ChatUsersActivity.this.defaultBannedRights.send_plain, true, z11);
                    } else if (i == ChatUsersActivity.this.dontRestrictBoostersRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.GroupNotRestrictBoosters), ChatUsersActivity.this.isEnabledNotRestrictBoosters, false, z11);
                        textCheckCell2.getCheckBox().setDrawIconType(0);
                        textCheckCell2.getCheckBox().setColors(Theme.key_switchTrack, Theme.key_switchTrackChecked, i9, i9);
                    } else if (i == ChatUsersActivity.this.sendMediaRow) {
                        int sendMediaSelectedCount = ChatUsersActivity.this.getSendMediaSelectedCount();
                        textCheckCell2.setTextAndCheck(LocaleController.getString("UserRestrictionsSendMedia", R.string.UserRestrictionsSendMedia), sendMediaSelectedCount > 0, true, z11);
                        textCheckCell2.setCollapseArrow(String.format(Locale.US, "%d/9", Integer.valueOf(sendMediaSelectedCount)), !ChatUsersActivity.this.sendMediaExpanded, new Runnable() { // from class: org.telegram.ui.ChatUsersActivity.ListAdapter.1
                            @Override // java.lang.Runnable
                            public void run() {
                                boolean z12 = !textCheckCell2.isChecked();
                                textCheckCell2.setChecked(z12);
                                ChatUsersActivity.this.setSendMediaEnabled(z12);
                            }
                        });
                    } else if (i == ChatUsersActivity.this.sendStickersRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString("UserRestrictionsSendStickers", R.string.UserRestrictionsSendStickers), !ChatUsersActivity.this.defaultBannedRights.send_stickers, true, z11);
                    } else if (i == ChatUsersActivity.this.embedLinksRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString("UserRestrictionsEmbedLinks", R.string.UserRestrictionsEmbedLinks), !ChatUsersActivity.this.defaultBannedRights.embed_links, true, z11);
                    } else if (i == ChatUsersActivity.this.sendPollsRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString("UserRestrictionsSendPollsShort", R.string.UserRestrictionsSendPollsShort), !ChatUsersActivity.this.defaultBannedRights.send_polls, true);
                    } else if (i == ChatUsersActivity.this.manageTopicsRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString("CreateTopicsPermission", R.string.CreateTopicsPermission), !ChatUsersActivity.this.defaultBannedRights.manage_topics, false, z11);
                    }
                    if ((i != ChatUsersActivity.this.pinMessagesRow && i != ChatUsersActivity.this.changeInfoRow) || !ChatObject.isDiscussionGroup(((BaseFragment) ChatUsersActivity.this).currentAccount, ChatUsersActivity.this.chatId)) {
                        if (ChatObject.canBlockUsers(ChatUsersActivity.this.currentChat)) {
                            if ((i == ChatUsersActivity.this.addUsersRow && !ChatObject.canUserDoAdminAction(ChatUsersActivity.this.currentChat, 3)) || ((i == ChatUsersActivity.this.pinMessagesRow && !ChatObject.canUserDoAdminAction(ChatUsersActivity.this.currentChat, 0)) || ((i == ChatUsersActivity.this.changeInfoRow && !ChatObject.canUserDoAdminAction(ChatUsersActivity.this.currentChat, 1)) || ((i == ChatUsersActivity.this.manageTopicsRow && !ChatObject.canManageTopics(ChatUsersActivity.this.currentChat)) || (ChatObject.isPublic(ChatUsersActivity.this.currentChat) && (i == ChatUsersActivity.this.pinMessagesRow || i == ChatUsersActivity.this.changeInfoRow)))))) {
                                textCheckCell2.setIcon(R.drawable.permission_locked);
                                break;
                            } else {
                                textCheckCell2.setIcon(0);
                                break;
                            }
                        } else {
                            textCheckCell2.setIcon(0);
                            break;
                        }
                    } else {
                        textCheckCell2.setIcon(R.drawable.permission_locked);
                        break;
                    }
                    break;
                case 8:
                    GraySectionCell graySectionCell = (GraySectionCell) viewHolder.itemView;
                    if (i == ChatUsersActivity.this.membersHeaderRow) {
                        if (ChatObject.isChannel(ChatUsersActivity.this.currentChat) && !ChatUsersActivity.this.currentChat.megagroup) {
                            graySectionCell.setText(LocaleController.getString("ChannelOtherSubscribers", R.string.ChannelOtherSubscribers));
                            break;
                        } else {
                            graySectionCell.setText(LocaleController.getString("ChannelOtherMembers", R.string.ChannelOtherMembers));
                            break;
                        }
                    } else if (i != ChatUsersActivity.this.botHeaderRow) {
                        if (i == ChatUsersActivity.this.contactsHeaderRow) {
                            if (ChatObject.isChannel(ChatUsersActivity.this.currentChat) && !ChatUsersActivity.this.currentChat.megagroup) {
                                graySectionCell.setText(LocaleController.getString("ChannelContacts", R.string.ChannelContacts));
                                break;
                            } else {
                                graySectionCell.setText(LocaleController.getString("GroupContacts", R.string.GroupContacts));
                                break;
                            }
                        } else if (i == ChatUsersActivity.this.loadingHeaderRow) {
                            graySectionCell.setText("");
                            break;
                        }
                    } else {
                        graySectionCell.setText(LocaleController.getString("ChannelBots", R.string.ChannelBots));
                        break;
                    }
                    break;
                case 11:
                    FlickerLoadingView flickerLoadingView = (FlickerLoadingView) viewHolder.itemView;
                    if (ChatUsersActivity.this.type == 0) {
                        flickerLoadingView.setItemsCount(ChatUsersActivity.this.info != null ? ChatUsersActivity.this.info.kicked_count : 1);
                        break;
                    } else {
                        flickerLoadingView.setItemsCount(1);
                        break;
                    }
                case 12:
                    TextCell textCell = (TextCell) viewHolder.itemView;
                    if (i == ChatUsersActivity.this.antiSpamRow) {
                        textCell.getCheckBox().setIcon((ChatObject.canUserDoAdminAction(ChatUsersActivity.this.currentChat, 13) && (ChatUsersActivity.this.info == null || ChatUsersActivity.this.info.antispam || ChatUsersActivity.this.getParticipantsCount() >= ChatUsersActivity.this.getMessagesController().telegramAntispamGroupSizeMin)) ? 0 : R.drawable.permission_locked);
                        textCell.setTextAndCheckAndIcon(LocaleController.getString("ChannelAntiSpam", R.string.ChannelAntiSpam), ChatUsersActivity.this.info != null && ChatUsersActivity.this.info.antispam, R.drawable.msg_policy, false);
                        break;
                    } else if (i == ChatUsersActivity.this.hideMembersRow) {
                        textCell.getCheckBox().setIcon((ChatObject.canUserDoAdminAction(ChatUsersActivity.this.currentChat, 2) && (ChatUsersActivity.this.info == null || ChatUsersActivity.this.info.participants_hidden || ChatUsersActivity.this.getParticipantsCount() >= ChatUsersActivity.this.getMessagesController().hiddenMembersGroupSizeMin)) ? 0 : R.drawable.permission_locked);
                        textCell.setTextAndCheck(LocaleController.getString(R.string.ChannelHideMembers), ChatUsersActivity.this.info != null && ChatUsersActivity.this.info.participants_hidden, false);
                        break;
                    } else if (i == ChatUsersActivity.this.tagsRow) {
                        textCell.getCheckBox().setIcon(0);
                        String string = LocaleController.getString(R.string.ChannelMemberTags);
                        if (ChatUsersActivity.this.currentChat != null && ChatUsersActivity.this.currentChat.default_banned_rights != null && ChatUsersActivity.this.currentChat.default_banned_rights.edit_rank) {
                            z9 = false;
                        }
                        textCell.setTextAndCheck(string, z9, false);
                        break;
                    }
                    break;
                case 13:
                    CheckBoxCell checkBoxCell = (CheckBoxCell) viewHolder.itemView;
                    boolean z12 = checkBoxCell.getTag() != null && ((Integer) checkBoxCell.getTag()).intValue() == i;
                    checkBoxCell.setTag(Integer.valueOf(i));
                    if (i == ChatUsersActivity.this.sendMediaPhotosRow) {
                        checkBoxCell.setText(LocaleController.getString("SendMediaPermissionPhotos", R.string.SendMediaPermissionPhotos), "", !ChatUsersActivity.this.defaultBannedRights.send_photos, true, z12);
                        break;
                    } else if (i == ChatUsersActivity.this.sendMediaVideosRow) {
                        checkBoxCell.setText(LocaleController.getString("SendMediaPermissionVideos", R.string.SendMediaPermissionVideos), "", !ChatUsersActivity.this.defaultBannedRights.send_videos, true, z12);
                        break;
                    } else if (i == ChatUsersActivity.this.sendMediaStickerGifsRow) {
                        checkBoxCell.setText(LocaleController.getString("SendMediaPermissionStickersGifs", R.string.SendMediaPermissionStickersGifs), "", !ChatUsersActivity.this.defaultBannedRights.send_stickers, true, z12);
                        break;
                    } else if (i == ChatUsersActivity.this.sendMediaMusicRow) {
                        checkBoxCell.setText(LocaleController.getString("SendMediaPermissionMusic", R.string.SendMediaPermissionMusic), "", !ChatUsersActivity.this.defaultBannedRights.send_audios, true, z12);
                        break;
                    } else if (i == ChatUsersActivity.this.sendMediaFilesRow) {
                        checkBoxCell.setText(LocaleController.getString("SendMediaPermissionFiles", R.string.SendMediaPermissionFiles), "", !ChatUsersActivity.this.defaultBannedRights.send_docs, true, z12);
                        break;
                    } else if (i == ChatUsersActivity.this.sendMediaVoiceMessagesRow) {
                        checkBoxCell.setText(LocaleController.getString("SendMediaPermissionVoice", R.string.SendMediaPermissionVoice), "", !ChatUsersActivity.this.defaultBannedRights.send_voices, true, z12);
                        break;
                    } else if (i == ChatUsersActivity.this.sendMediaVideoMessagesRow) {
                        checkBoxCell.setText(LocaleController.getString("SendMediaPermissionRound", R.string.SendMediaPermissionRound), "", !ChatUsersActivity.this.defaultBannedRights.send_roundvideos, true, z12);
                        break;
                    } else if (i == ChatUsersActivity.this.sendMediaEmbededLinksRow) {
                        checkBoxCell.setText(LocaleController.getString("SendMediaEmbededLinks", R.string.SendMediaEmbededLinks), "", (ChatUsersActivity.this.defaultBannedRights.embed_links || ChatUsersActivity.this.defaultBannedRights.send_plain) ? false : true, false, z12);
                        break;
                    } else if (i == ChatUsersActivity.this.sendPollsRow) {
                        checkBoxCell.setText(LocaleController.getString("SendMediaPolls", R.string.SendMediaPolls), "", !ChatUsersActivity.this.defaultBannedRights.send_polls, false, z12);
                        break;
                    } else {
                        checkBoxCell.setPad(1);
                        break;
                    }
                    break;
                case 16:
                    TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                    if (i == ChatUsersActivity.this.signMessagesRow) {
                        textCheckCell.setTextAndCheck(LocaleController.getString(R.string.ChannelSignMessages), ChatUsersActivity.this.signatures, ChatUsersActivity.this.signatures);
                        break;
                    } else if (i == ChatUsersActivity.this.signMessagesProfilesRow) {
                        textCheckCell.setTextAndCheck(LocaleController.getString(R.string.ChannelSignMessagesWithProfile), ChatUsersActivity.this.profiles, false);
                        break;
                    } else if (i == ChatUsersActivity.this.payRow) {
                        textCheckCell.setTextAndCheck(LocaleController.getString(R.string.GroupMessagesChargePrice), ChatUsersActivity.this.enablePrice, false);
                        break;
                    }
                    break;
                case 17:
                    SlideIntChooseView slideIntChooseView = (SlideIntChooseView) viewHolder.itemView;
                    if (i == ChatUsersActivity.this.priceRow) {
                        slideIntChooseView.set((int) Utilities.clamp(ChatUsersActivity.this.starsPrice, ChatUsersActivity.this.getMessagesController().starsPaidMessageAmountMax, 1L), SlideIntChooseView.Options.make(1, SlideIntChooseView.cut(new int[]{1, 10, 50, 100, NotificationCenter.channelRecommendationsLoaded, 250, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000}, (int) ChatUsersActivity.this.getMessagesController().starsPaidMessageAmountMax), 20, new Utilities.Callback2Return() { // from class: org.telegram.ui.ChatUsersActivity$ListAdapter$$ExternalSyntheticLambda0
                            @Override // org.telegram.messenger.Utilities.Callback2Return
                            public final Object run(Object obj, Object obj2) {
                                CharSequence lambda$onBindViewHolder$3;
                                lambda$onBindViewHolder$3 = ChatUsersActivity.ListAdapter.lambda$onBindViewHolder$3((Integer) obj, (Integer) obj2);
                                return lambda$onBindViewHolder$3;
                            }
                        }), new Utilities.Callback() { // from class: org.telegram.ui.ChatUsersActivity$ListAdapter$$ExternalSyntheticLambda1
                            @Override // org.telegram.messenger.Utilities.Callback
                            public final void run(Object obj) {
                                ChatUsersActivity.ListAdapter.this.lambda$onBindViewHolder$4((Integer) obj);
                            }
                        });
                        break;
                    }
                    break;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ CharSequence lambda$onBindViewHolder$3(Integer num, Integer num2) {
            if (num.intValue() == 0) {
                return LocaleController.formatPluralStringComma("Stars", num2.intValue());
            }
            return "" + num2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onBindViewHolder$4(Integer num) {
            ChatUsersActivity.this.starsPrice = num.intValue();
            AndroidUtilities.updateVisibleRow(ChatUsersActivity.this.listView, ChatUsersActivity.this.priceInfoRow);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof ManageChatUserCell) {
                ((ManageChatUserCell) view).recycle();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            if (i == ChatUsersActivity.this.addNewRow || i == ChatUsersActivity.this.addNew2Row || i == ChatUsersActivity.this.recentActionsRow || i == ChatUsersActivity.this.gigaConvertRow) {
                return 2;
            }
            if ((i >= ChatUsersActivity.this.participantsStartRow && i < ChatUsersActivity.this.participantsEndRow) || ((i >= ChatUsersActivity.this.botStartRow && i < ChatUsersActivity.this.botEndRow) || (i >= ChatUsersActivity.this.contactsStartRow && i < ChatUsersActivity.this.contactsEndRow))) {
                return 0;
            }
            if (i == ChatUsersActivity.this.addNewSectionRow || i == ChatUsersActivity.this.participantsDividerRow || i == ChatUsersActivity.this.participantsDivider2Row) {
                return 3;
            }
            if (i == ChatUsersActivity.this.restricted1SectionRow || i == ChatUsersActivity.this.permissionsSectionRow || i == ChatUsersActivity.this.slowmodeRow || i == ChatUsersActivity.this.gigaHeaderRow || i == ChatUsersActivity.this.priceHeaderRow) {
                return 5;
            }
            if (i == ChatUsersActivity.this.participantsInfoRow || i == ChatUsersActivity.this.slowmodeInfoRow || i == ChatUsersActivity.this.dontRestrictBoostersInfoRow || i == ChatUsersActivity.this.gigaInfoRow || i == ChatUsersActivity.this.antiSpamInfoRow || i == ChatUsersActivity.this.hideMembersInfoRow || i == ChatUsersActivity.this.tagsInfoRow || i == ChatUsersActivity.this.signMessagesInfoRow || i == ChatUsersActivity.this.payInfoRow || i == ChatUsersActivity.this.priceInfoRow) {
                return 1;
            }
            if (i == ChatUsersActivity.this.blockedEmptyRow) {
                return 4;
            }
            if (i == ChatUsersActivity.this.removedUsersRow) {
                return 6;
            }
            if (i == ChatUsersActivity.this.changeInfoRow || i == ChatUsersActivity.this.addUsersRow || i == ChatUsersActivity.this.pinMessagesRow || i == ChatUsersActivity.this.editTagRow || i == ChatUsersActivity.this.sendMessagesRow || i == ChatUsersActivity.this.sendStickersRow || i == ChatUsersActivity.this.embedLinksRow || i == ChatUsersActivity.this.manageTopicsRow || i == ChatUsersActivity.this.dontRestrictBoostersRow) {
                return 7;
            }
            if (i == ChatUsersActivity.this.membersHeaderRow || i == ChatUsersActivity.this.contactsHeaderRow || i == ChatUsersActivity.this.botHeaderRow || i == ChatUsersActivity.this.loadingHeaderRow) {
                return 8;
            }
            if (i == ChatUsersActivity.this.slowmodeSelectRow) {
                return 9;
            }
            if (i == ChatUsersActivity.this.loadingProgressRow) {
                return 10;
            }
            if (i == ChatUsersActivity.this.loadingUserCellRow) {
                return 11;
            }
            if (i == ChatUsersActivity.this.antiSpamRow || i == ChatUsersActivity.this.hideMembersRow || i == ChatUsersActivity.this.tagsRow) {
                return 12;
            }
            if (ChatUsersActivity.this.isExpandableSendMediaRow(i)) {
                return 13;
            }
            if (i == ChatUsersActivity.this.sendMediaRow) {
                return 14;
            }
            if (i == ChatUsersActivity.this.dontRestrictBoostersSliderRow) {
                return 15;
            }
            if (i == ChatUsersActivity.this.signMessagesRow || i == ChatUsersActivity.this.signMessagesProfilesRow || i == ChatUsersActivity.this.payRow) {
                return 16;
            }
            return i == ChatUsersActivity.this.priceRow ? 17 : 0;
        }

        public TLObject getItem(int i) {
            if (i < ChatUsersActivity.this.participantsStartRow || i >= ChatUsersActivity.this.participantsEndRow) {
                if (i < ChatUsersActivity.this.contactsStartRow || i >= ChatUsersActivity.this.contactsEndRow) {
                    if (i < ChatUsersActivity.this.botStartRow || i >= ChatUsersActivity.this.botEndRow) {
                        return null;
                    }
                    return (TLObject) ChatUsersActivity.this.bots.get(i - ChatUsersActivity.this.botStartRow);
                }
                return (TLObject) ChatUsersActivity.this.contacts.get(i - ChatUsersActivity.this.contactsStartRow);
            }
            return (TLObject) ChatUsersActivity.this.participants.get(i - ChatUsersActivity.this.participantsStartRow);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSendMediaEnabled(boolean z) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.defaultBannedRights;
        boolean z2 = !z;
        tL_chatBannedRights.send_media = z2;
        tL_chatBannedRights.send_gifs = z2;
        tL_chatBannedRights.send_inline = z2;
        tL_chatBannedRights.send_games = z2;
        tL_chatBannedRights.send_photos = z2;
        tL_chatBannedRights.send_videos = z2;
        tL_chatBannedRights.send_stickers = z2;
        tL_chatBannedRights.send_audios = z2;
        tL_chatBannedRights.send_docs = z2;
        tL_chatBannedRights.send_voices = z2;
        tL_chatBannedRights.send_roundvideos = z2;
        tL_chatBannedRights.embed_links = z2;
        tL_chatBannedRights.send_polls = z2;
        AndroidUtilities.updateVisibleRows(this.listView);
        DiffCallback saveState = saveState();
        updateRows();
        updateListAnimated(saveState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isExpandableSendMediaRow(int i) {
        return i == this.sendMediaPhotosRow || i == this.sendMediaVideosRow || i == this.sendMediaStickerGifsRow || i == this.sendMediaMusicRow || i == this.sendMediaFilesRow || i == this.sendMediaVoiceMessagesRow || i == this.sendMediaVideoMessagesRow || i == this.sendMediaEmbededLinksRow || i == this.sendPollsRow;
    }

    public DiffCallback saveState() {
        DiffCallback diffCallback = new DiffCallback();
        diffCallback.oldRowCount = this.rowCount;
        diffCallback.oldBotStartRow = this.botStartRow;
        diffCallback.oldBotEndRow = this.botEndRow;
        diffCallback.oldBots.clear();
        diffCallback.oldBots.addAll(this.bots);
        diffCallback.oldContactsEndRow = this.contactsEndRow;
        diffCallback.oldContactsStartRow = this.contactsStartRow;
        diffCallback.oldContacts.clear();
        diffCallback.oldContacts.addAll(this.contacts);
        diffCallback.oldParticipantsStartRow = this.participantsStartRow;
        diffCallback.oldParticipantsEndRow = this.participantsEndRow;
        diffCallback.oldParticipants.clear();
        diffCallback.oldParticipants.addAll(this.participants);
        diffCallback.fillPositions(diffCallback.oldPositionToItem);
        return diffCallback;
    }

    public void updateListAnimated(DiffCallback diffCallback) {
        View view;
        if (this.listViewAdapter == null) {
            updateRows();
            return;
        }
        updateRows();
        diffCallback.fillPositions(diffCallback.newPositionToItem);
        DiffUtil.calculateDiff(diffCallback).dispatchUpdatesTo(this.listViewAdapter);
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView == null || this.layoutManager == null || recyclerListView.getChildCount() <= 0) {
            return;
        }
        int i = 0;
        int i2 = -1;
        while (true) {
            if (i >= this.listView.getChildCount()) {
                view = null;
                break;
            }
            RecyclerListView recyclerListView2 = this.listView;
            i2 = recyclerListView2.getChildAdapterPosition(recyclerListView2.getChildAt(i));
            if (i2 != -1) {
                view = this.listView.getChildAt(i);
                break;
            }
            i++;
        }
        if (view != null) {
            this.layoutManager.scrollToPositionWithOffset(i2, view.getTop() - this.listView.getPaddingTop());
        }
    }

    private class DiffCallback extends DiffUtil.Callback {
        SparseIntArray newPositionToItem;
        int oldBotEndRow;
        int oldBotStartRow;
        private ArrayList oldBots;
        private ArrayList oldContacts;
        int oldContactsEndRow;
        int oldContactsStartRow;
        private ArrayList oldParticipants;
        int oldParticipantsEndRow;
        int oldParticipantsStartRow;
        SparseIntArray oldPositionToItem;
        int oldRowCount;

        private DiffCallback() {
            this.oldPositionToItem = new SparseIntArray();
            this.newPositionToItem = new SparseIntArray();
            this.oldParticipants = new ArrayList();
            this.oldBots = new ArrayList();
            this.oldContacts = new ArrayList();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public int getOldListSize() {
            return this.oldRowCount;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public int getNewListSize() {
            return ChatUsersActivity.this.rowCount;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areItemsTheSame(int i, int i2) {
            if (i >= this.oldBotStartRow && i < this.oldBotEndRow && i2 >= ChatUsersActivity.this.botStartRow && i2 < ChatUsersActivity.this.botEndRow) {
                return ((TLObject) this.oldBots.get(i - this.oldBotStartRow)).equals(ChatUsersActivity.this.bots.get(i2 - ChatUsersActivity.this.botStartRow));
            }
            if (i >= this.oldContactsStartRow && i < this.oldContactsEndRow && i2 >= ChatUsersActivity.this.contactsStartRow && i2 < ChatUsersActivity.this.contactsEndRow) {
                return ((TLObject) this.oldContacts.get(i - this.oldContactsStartRow)).equals(ChatUsersActivity.this.contacts.get(i2 - ChatUsersActivity.this.contactsStartRow));
            }
            if (i < this.oldParticipantsStartRow || i >= this.oldParticipantsEndRow || i2 < ChatUsersActivity.this.participantsStartRow || i2 >= ChatUsersActivity.this.participantsEndRow) {
                return this.oldPositionToItem.get(i) == this.newPositionToItem.get(i2);
            }
            return ((TLObject) this.oldParticipants.get(i - this.oldParticipantsStartRow)).equals(ChatUsersActivity.this.participants.get(i2 - ChatUsersActivity.this.participantsStartRow));
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areContentsTheSame(int i, int i2) {
            return areItemsTheSame(i, i2) && ChatUsersActivity.this.restricted1SectionRow != i2;
        }

        public void fillPositions(SparseIntArray sparseIntArray) {
            sparseIntArray.clear();
            put(1, ChatUsersActivity.this.recentActionsRow, sparseIntArray);
            put(2, ChatUsersActivity.this.addNewRow, sparseIntArray);
            put(3, ChatUsersActivity.this.addNew2Row, sparseIntArray);
            put(4, ChatUsersActivity.this.addNewSectionRow, sparseIntArray);
            put(5, ChatUsersActivity.this.restricted1SectionRow, sparseIntArray);
            put(6, ChatUsersActivity.this.participantsDividerRow, sparseIntArray);
            put(7, ChatUsersActivity.this.participantsDivider2Row, sparseIntArray);
            put(8, ChatUsersActivity.this.gigaHeaderRow, sparseIntArray);
            put(9, ChatUsersActivity.this.gigaConvertRow, sparseIntArray);
            put(10, ChatUsersActivity.this.gigaInfoRow, sparseIntArray);
            put(11, ChatUsersActivity.this.participantsInfoRow, sparseIntArray);
            put(12, ChatUsersActivity.this.blockedEmptyRow, sparseIntArray);
            put(13, ChatUsersActivity.this.permissionsSectionRow, sparseIntArray);
            put(14, ChatUsersActivity.this.sendMessagesRow, sparseIntArray);
            put(15, ChatUsersActivity.this.sendMediaRow, sparseIntArray);
            put(16, ChatUsersActivity.this.sendStickersRow, sparseIntArray);
            put(17, ChatUsersActivity.this.sendPollsRow, sparseIntArray);
            put(18, ChatUsersActivity.this.embedLinksRow, sparseIntArray);
            put(19, ChatUsersActivity.this.addUsersRow, sparseIntArray);
            put(20, ChatUsersActivity.this.pinMessagesRow, sparseIntArray);
            int i = 21;
            put(21, ChatUsersActivity.this.editTagRow, sparseIntArray);
            if (ChatUsersActivity.this.isForum) {
                put(22, ChatUsersActivity.this.manageTopicsRow, sparseIntArray);
                i = 22;
            }
            put(i + 1, ChatUsersActivity.this.changeInfoRow, sparseIntArray);
            put(i + 2, ChatUsersActivity.this.removedUsersRow, sparseIntArray);
            put(i + 3, ChatUsersActivity.this.contactsHeaderRow, sparseIntArray);
            put(i + 4, ChatUsersActivity.this.botHeaderRow, sparseIntArray);
            put(i + 5, ChatUsersActivity.this.membersHeaderRow, sparseIntArray);
            put(i + 6, ChatUsersActivity.this.slowmodeRow, sparseIntArray);
            put(i + 7, ChatUsersActivity.this.slowmodeSelectRow, sparseIntArray);
            put(i + 8, ChatUsersActivity.this.slowmodeInfoRow, sparseIntArray);
            put(i + 9, ChatUsersActivity.this.dontRestrictBoostersRow, sparseIntArray);
            put(i + 10, ChatUsersActivity.this.dontRestrictBoostersSliderRow, sparseIntArray);
            put(i + 11, ChatUsersActivity.this.dontRestrictBoostersInfoRow, sparseIntArray);
            put(i + 12, ChatUsersActivity.this.loadingProgressRow, sparseIntArray);
            put(i + 13, ChatUsersActivity.this.loadingUserCellRow, sparseIntArray);
            put(i + 14, ChatUsersActivity.this.loadingHeaderRow, sparseIntArray);
            put(i + 15, ChatUsersActivity.this.signMessagesRow, sparseIntArray);
            put(i + 16, ChatUsersActivity.this.signMessagesProfilesRow, sparseIntArray);
            put(i + 17, ChatUsersActivity.this.signMessagesInfoRow, sparseIntArray);
            put(i + 18, ChatUsersActivity.this.payRow, sparseIntArray);
            put(i + 19, ChatUsersActivity.this.payInfoRow, sparseIntArray);
            put(i + 20, ChatUsersActivity.this.priceHeaderRow, sparseIntArray);
            put(i + 21, ChatUsersActivity.this.priceRow, sparseIntArray);
            put(i + 22, ChatUsersActivity.this.priceInfoRow, sparseIntArray);
        }

        private void put(int i, int i2, SparseIntArray sparseIntArray) {
            if (i2 >= 0) {
                sparseIntArray.put(i2, i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getSendMediaSelectedCount() {
        return getSendMediaSelectedCount(this.defaultBannedRights);
    }

    public static int getSendMediaSelectedCount(TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        int i = !tL_chatBannedRights.send_photos ? 1 : 0;
        if (!tL_chatBannedRights.send_videos) {
            i++;
        }
        if (!tL_chatBannedRights.send_stickers) {
            i++;
        }
        if (!tL_chatBannedRights.send_audios) {
            i++;
        }
        if (!tL_chatBannedRights.send_docs) {
            i++;
        }
        if (!tL_chatBannedRights.send_voices) {
            i++;
        }
        if (!tL_chatBannedRights.send_roundvideos) {
            i++;
        }
        if (!tL_chatBannedRights.embed_links && !tL_chatBannedRights.send_plain) {
            i++;
        }
        return !tL_chatBannedRights.send_polls ? i + 1 : i;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() { // from class: org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda1
            @Override // org.telegram.ui.ActionBar.ThemeDescription.ThemeDescriptionDelegate
            public final void didSetColor() {
                ChatUsersActivity.this.lambda$getThemeDescriptions$33();
            }

            @Override // org.telegram.ui.ActionBar.ThemeDescription.ThemeDescriptionDelegate
            public /* synthetic */ void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.-CC.$default$onAnimationProgress(this, f);
            }
        };
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{HeaderCell.class, ManageChatUserCell.class, ManageChatTextCell.class, TextCheckCell2.class, TextSettingsCell.class, SlideChooseView.class}, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        int i = Theme.key_windowBackgroundGrayShadow;
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText4));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueHeader));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{GraySectionCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_graySectionText));
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteValueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell2.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell2.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell2.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_switch2Track));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell2.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_switch2TrackChecked));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i2));
        int i3 = Theme.key_windowBackgroundWhiteGrayText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"statusColor"}, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"statusOnlineColor"}, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, Theme.key_windowBackgroundWhiteBlueText));
        arrayList.add(new ThemeDescription(this.undoView, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, Theme.key_undo_background));
        int i4 = Theme.key_undo_cancelColor;
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        int i5 = Theme.key_undo_infoColor;
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i5));
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i5));
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i5));
        arrayList.add(new ThemeDescription(this.undoView, ThemeDescription.FLAG_IMAGECOLOR, new Class[]{UndoView.class}, new String[]{"leftImageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i5));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{ManageChatTextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i2));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{ManageChatTextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayIcon));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{ManageChatTextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueButton));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{ManageChatTextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueIcon));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{StickerEmptyView.class}, new String[]{"title"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{StickerEmptyView.class}, new String[]{"subtitle"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i2));
        arrayList.add(new ThemeDescription(this.emptyView.title, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.emptyView.subtitle, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, null, Theme.avatarDrawables, null, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundPink));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getThemeDescriptions$33() {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null) {
            int childCount = recyclerListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.listView.getChildAt(i);
                if (childAt instanceof ManageChatUserCell) {
                    ((ManageChatUserCell) childAt).update(0);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
        this.undoView.setTranslationY(-i4);
    }
}
