package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$InputCheckPasswordSRP;
import org.telegram.tgnet.TLRPC$TL_account_getPassword;
import org.telegram.tgnet.TLRPC$TL_account_password;
import org.telegram.tgnet.TLRPC$TL_channels_editCreator;
import org.telegram.tgnet.TLRPC$TL_chatAdminRights;
import org.telegram.tgnet.TLRPC$TL_chatBannedRights;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputChannel;
import org.telegram.tgnet.TLRPC$TL_inputChannelEmpty;
import org.telegram.tgnet.TLRPC$TL_inputCheckPasswordEmpty;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$UserFull;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.DialogRadioCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.PollEditTextCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCheckCell2;
import org.telegram.ui.Cells.TextDetailCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Cells.UserCell2;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.CrossfadeDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
/* loaded from: classes3.dex */
public class ChatRightsEditActivity extends BaseFragment {
    private int addAdminsRow;
    private FrameLayout addBotButton;
    private FrameLayout addBotButtonContainer;
    private int addBotButtonRow;
    private AnimatedTextView addBotButtonText;
    private int addUsersRow;
    private TLRPC$TL_chatAdminRights adminRights;
    private int anonymousRow;
    private boolean asAdmin;
    private ValueAnimator asAdminAnimator;
    private float asAdminT;
    private int banUsersRow;
    private TLRPC$TL_chatBannedRights bannedRights;
    private String botHash;
    private boolean canEdit;
    private int cantEditInfoRow;
    private int changeInfoRow;
    private long chatId;
    private String currentBannedRights;
    private TLRPC$Chat currentChat;
    private String currentRank;
    private int currentType;
    private TLRPC$User currentUser;
    private TLRPC$TL_chatBannedRights defaultBannedRights;
    private ChatRightsEditActivityDelegate delegate;
    private int deleteMessagesRow;
    private CrossfadeDrawable doneDrawable;
    private ValueAnimator doneDrawableAnimator;
    private int editMesagesRow;
    private int embedLinksRow;
    private boolean initialAsAdmin;
    private boolean initialIsSet;
    private String initialRank;
    private boolean isAddingNew;
    private boolean isChannel;
    private LinearLayoutManager linearLayoutManager;
    private RecyclerListView listView;
    private ListAdapter listViewAdapter;
    private boolean loading = false;
    private int manageRow;
    private TLRPC$TL_chatAdminRights myAdminRights;
    private int pinMessagesRow;
    private int postMessagesRow;
    private PollEditTextCell rankEditTextCell;
    private int rankHeaderRow;
    private int rankInfoRow;
    private int rankRow;
    private int removeAdminRow;
    private int removeAdminShadowRow;
    private int rightsShadowRow;
    private int rowCount;
    private int sendMediaRow;
    private int sendMessagesRow;
    private int sendPollsRow;
    private int sendStickersRow;
    private int startVoiceChatRow;
    private int transferOwnerRow;
    private int transferOwnerShadowRow;
    private int untilDateRow;
    private int untilSectionRow;

    /* loaded from: classes3.dex */
    public interface ChatRightsEditActivityDelegate {
        void didChangeOwner(TLRPC$User tLRPC$User);

        void didSetRights(int i, TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights, TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights, String str);
    }

    public static /* synthetic */ void lambda$createView$1(DialogInterface dialogInterface, int i) {
    }

    public static /* synthetic */ void lambda$createView$3(DialogInterface dialogInterface, int i) {
    }

    public ChatRightsEditActivity(long j, long j2, TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights, TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights, TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights2, String str, int i, boolean z, boolean z2, String str2) {
        boolean z3;
        TLRPC$UserFull userFull;
        TLRPC$Chat tLRPC$Chat;
        TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights2 = tLRPC$TL_chatAdminRights;
        float f = 0.0f;
        this.asAdminT = 0.0f;
        this.asAdmin = false;
        this.initialAsAdmin = false;
        String str3 = "";
        this.currentBannedRights = str3;
        this.isAddingNew = z2;
        this.chatId = j2;
        this.currentUser = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
        this.currentType = i;
        this.canEdit = z;
        this.botHash = str2;
        TLRPC$Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.chatId));
        this.currentChat = chat;
        str3 = str != null ? str : str3;
        this.currentRank = str3;
        this.initialRank = str3;
        boolean z4 = true;
        if (chat != null) {
            this.isChannel = ChatObject.isChannel(chat) && !this.currentChat.megagroup;
            this.myAdminRights = this.currentChat.admin_rights;
        }
        if (this.myAdminRights == null) {
            this.myAdminRights = emptyAdminRights(this.currentType != 2 || ((tLRPC$Chat = this.currentChat) != null && tLRPC$Chat.creator));
        }
        if (i == 0 || i == 2) {
            if (i == 2 && (userFull = getMessagesController().getUserFull(j)) != null) {
                TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights3 = this.isChannel ? userFull.bot_broadcast_admin_rights : userFull.bot_group_admin_rights;
                if (tLRPC$TL_chatAdminRights3 != null) {
                    if (tLRPC$TL_chatAdminRights2 == null) {
                        tLRPC$TL_chatAdminRights2 = tLRPC$TL_chatAdminRights3;
                    } else {
                        tLRPC$TL_chatAdminRights2.ban_users = tLRPC$TL_chatAdminRights2.ban_users || tLRPC$TL_chatAdminRights3.ban_users;
                        tLRPC$TL_chatAdminRights2.add_admins = tLRPC$TL_chatAdminRights2.add_admins || tLRPC$TL_chatAdminRights3.add_admins;
                        tLRPC$TL_chatAdminRights2.post_messages = tLRPC$TL_chatAdminRights2.post_messages || tLRPC$TL_chatAdminRights3.post_messages;
                        tLRPC$TL_chatAdminRights2.pin_messages = tLRPC$TL_chatAdminRights2.pin_messages || tLRPC$TL_chatAdminRights3.pin_messages;
                        tLRPC$TL_chatAdminRights2.delete_messages = tLRPC$TL_chatAdminRights2.delete_messages || tLRPC$TL_chatAdminRights3.delete_messages;
                        tLRPC$TL_chatAdminRights2.change_info = tLRPC$TL_chatAdminRights2.change_info || tLRPC$TL_chatAdminRights3.change_info;
                        tLRPC$TL_chatAdminRights2.anonymous = tLRPC$TL_chatAdminRights2.anonymous || tLRPC$TL_chatAdminRights3.anonymous;
                        tLRPC$TL_chatAdminRights2.edit_messages = tLRPC$TL_chatAdminRights2.edit_messages || tLRPC$TL_chatAdminRights3.edit_messages;
                        tLRPC$TL_chatAdminRights2.manage_call = tLRPC$TL_chatAdminRights2.manage_call || tLRPC$TL_chatAdminRights3.manage_call;
                        tLRPC$TL_chatAdminRights2.other = tLRPC$TL_chatAdminRights2.other || tLRPC$TL_chatAdminRights3.other;
                    }
                }
            }
            if (tLRPC$TL_chatAdminRights2 == null) {
                this.initialAsAdmin = false;
                if (i == 2) {
                    this.adminRights = emptyAdminRights(false);
                    boolean z5 = this.isChannel;
                    this.asAdmin = z5;
                    this.asAdminT = z5 ? 1.0f : f;
                    this.initialIsSet = false;
                } else {
                    TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights4 = new TLRPC$TL_chatAdminRights();
                    this.adminRights = tLRPC$TL_chatAdminRights4;
                    TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights5 = this.myAdminRights;
                    tLRPC$TL_chatAdminRights4.change_info = tLRPC$TL_chatAdminRights5.change_info;
                    tLRPC$TL_chatAdminRights4.post_messages = tLRPC$TL_chatAdminRights5.post_messages;
                    tLRPC$TL_chatAdminRights4.edit_messages = tLRPC$TL_chatAdminRights5.edit_messages;
                    tLRPC$TL_chatAdminRights4.delete_messages = tLRPC$TL_chatAdminRights5.delete_messages;
                    tLRPC$TL_chatAdminRights4.manage_call = tLRPC$TL_chatAdminRights5.manage_call;
                    tLRPC$TL_chatAdminRights4.ban_users = tLRPC$TL_chatAdminRights5.ban_users;
                    tLRPC$TL_chatAdminRights4.invite_users = tLRPC$TL_chatAdminRights5.invite_users;
                    tLRPC$TL_chatAdminRights4.pin_messages = tLRPC$TL_chatAdminRights5.pin_messages;
                    tLRPC$TL_chatAdminRights4.other = tLRPC$TL_chatAdminRights5.other;
                    this.initialIsSet = false;
                }
            } else {
                this.initialAsAdmin = true;
                TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights6 = new TLRPC$TL_chatAdminRights();
                this.adminRights = tLRPC$TL_chatAdminRights6;
                boolean z6 = tLRPC$TL_chatAdminRights2.change_info;
                tLRPC$TL_chatAdminRights6.change_info = z6;
                boolean z7 = tLRPC$TL_chatAdminRights2.post_messages;
                tLRPC$TL_chatAdminRights6.post_messages = z7;
                boolean z8 = tLRPC$TL_chatAdminRights2.edit_messages;
                tLRPC$TL_chatAdminRights6.edit_messages = z8;
                boolean z9 = tLRPC$TL_chatAdminRights2.delete_messages;
                tLRPC$TL_chatAdminRights6.delete_messages = z9;
                boolean z10 = tLRPC$TL_chatAdminRights2.manage_call;
                tLRPC$TL_chatAdminRights6.manage_call = z10;
                boolean z11 = tLRPC$TL_chatAdminRights2.ban_users;
                tLRPC$TL_chatAdminRights6.ban_users = z11;
                boolean z12 = tLRPC$TL_chatAdminRights2.invite_users;
                tLRPC$TL_chatAdminRights6.invite_users = z12;
                boolean z13 = tLRPC$TL_chatAdminRights2.pin_messages;
                tLRPC$TL_chatAdminRights6.pin_messages = z13;
                boolean z14 = tLRPC$TL_chatAdminRights2.add_admins;
                tLRPC$TL_chatAdminRights6.add_admins = z14;
                boolean z15 = tLRPC$TL_chatAdminRights2.anonymous;
                tLRPC$TL_chatAdminRights6.anonymous = z15;
                boolean z16 = tLRPC$TL_chatAdminRights2.other;
                tLRPC$TL_chatAdminRights6.other = z16;
                boolean z17 = z6 || z7 || z8 || z9 || z11 || z12 || z13 || z14 || z10 || z15 || z16;
                this.initialIsSet = z17;
                if (i == 2) {
                    boolean z18 = this.isChannel || z17;
                    this.asAdmin = z18;
                    this.asAdminT = z18 ? 1.0f : 0.0f;
                    this.initialIsSet = false;
                }
            }
            TLRPC$Chat tLRPC$Chat2 = this.currentChat;
            if (tLRPC$Chat2 != null) {
                this.defaultBannedRights = tLRPC$Chat2.default_banned_rights;
            }
            if (this.defaultBannedRights == null) {
                TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights3 = new TLRPC$TL_chatBannedRights();
                this.defaultBannedRights = tLRPC$TL_chatBannedRights3;
                z3 = true;
                tLRPC$TL_chatBannedRights3.pin_messages = true;
                tLRPC$TL_chatBannedRights3.change_info = true;
                tLRPC$TL_chatBannedRights3.invite_users = true;
                tLRPC$TL_chatBannedRights3.send_polls = true;
                tLRPC$TL_chatBannedRights3.send_inline = true;
                tLRPC$TL_chatBannedRights3.send_games = true;
                tLRPC$TL_chatBannedRights3.send_gifs = true;
                tLRPC$TL_chatBannedRights3.send_stickers = true;
                tLRPC$TL_chatBannedRights3.embed_links = true;
                tLRPC$TL_chatBannedRights3.send_messages = true;
                tLRPC$TL_chatBannedRights3.send_media = true;
                tLRPC$TL_chatBannedRights3.view_messages = true;
            } else {
                z3 = true;
            }
            TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights4 = this.defaultBannedRights;
            if (!tLRPC$TL_chatBannedRights4.change_info) {
                this.adminRights.change_info = z3;
            }
            if (!tLRPC$TL_chatBannedRights4.pin_messages) {
                this.adminRights.pin_messages = z3;
            }
        } else if (i == 1) {
            this.defaultBannedRights = tLRPC$TL_chatBannedRights;
            if (tLRPC$TL_chatBannedRights == null) {
                TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights5 = new TLRPC$TL_chatBannedRights();
                this.defaultBannedRights = tLRPC$TL_chatBannedRights5;
                tLRPC$TL_chatBannedRights5.pin_messages = false;
                tLRPC$TL_chatBannedRights5.change_info = false;
                tLRPC$TL_chatBannedRights5.invite_users = false;
                tLRPC$TL_chatBannedRights5.send_polls = false;
                tLRPC$TL_chatBannedRights5.send_inline = false;
                tLRPC$TL_chatBannedRights5.send_games = false;
                tLRPC$TL_chatBannedRights5.send_gifs = false;
                tLRPC$TL_chatBannedRights5.send_stickers = false;
                tLRPC$TL_chatBannedRights5.embed_links = false;
                tLRPC$TL_chatBannedRights5.send_messages = false;
                tLRPC$TL_chatBannedRights5.send_media = false;
                tLRPC$TL_chatBannedRights5.view_messages = false;
            }
            TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights6 = new TLRPC$TL_chatBannedRights();
            this.bannedRights = tLRPC$TL_chatBannedRights6;
            if (tLRPC$TL_chatBannedRights2 == null) {
                tLRPC$TL_chatBannedRights6.pin_messages = false;
                tLRPC$TL_chatBannedRights6.change_info = false;
                tLRPC$TL_chatBannedRights6.invite_users = false;
                tLRPC$TL_chatBannedRights6.send_polls = false;
                tLRPC$TL_chatBannedRights6.send_inline = false;
                tLRPC$TL_chatBannedRights6.send_games = false;
                tLRPC$TL_chatBannedRights6.send_gifs = false;
                tLRPC$TL_chatBannedRights6.send_stickers = false;
                tLRPC$TL_chatBannedRights6.embed_links = false;
                tLRPC$TL_chatBannedRights6.send_messages = false;
                tLRPC$TL_chatBannedRights6.send_media = false;
                tLRPC$TL_chatBannedRights6.view_messages = false;
            } else {
                tLRPC$TL_chatBannedRights6.view_messages = tLRPC$TL_chatBannedRights2.view_messages;
                tLRPC$TL_chatBannedRights6.send_messages = tLRPC$TL_chatBannedRights2.send_messages;
                tLRPC$TL_chatBannedRights6.send_media = tLRPC$TL_chatBannedRights2.send_media;
                tLRPC$TL_chatBannedRights6.send_stickers = tLRPC$TL_chatBannedRights2.send_stickers;
                tLRPC$TL_chatBannedRights6.send_gifs = tLRPC$TL_chatBannedRights2.send_gifs;
                tLRPC$TL_chatBannedRights6.send_games = tLRPC$TL_chatBannedRights2.send_games;
                tLRPC$TL_chatBannedRights6.send_inline = tLRPC$TL_chatBannedRights2.send_inline;
                tLRPC$TL_chatBannedRights6.embed_links = tLRPC$TL_chatBannedRights2.embed_links;
                tLRPC$TL_chatBannedRights6.send_polls = tLRPC$TL_chatBannedRights2.send_polls;
                tLRPC$TL_chatBannedRights6.invite_users = tLRPC$TL_chatBannedRights2.invite_users;
                tLRPC$TL_chatBannedRights6.change_info = tLRPC$TL_chatBannedRights2.change_info;
                tLRPC$TL_chatBannedRights6.pin_messages = tLRPC$TL_chatBannedRights2.pin_messages;
                tLRPC$TL_chatBannedRights6.until_date = tLRPC$TL_chatBannedRights2.until_date;
            }
            TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights7 = this.defaultBannedRights;
            if (tLRPC$TL_chatBannedRights7.view_messages) {
                tLRPC$TL_chatBannedRights6.view_messages = true;
            }
            if (tLRPC$TL_chatBannedRights7.send_messages) {
                tLRPC$TL_chatBannedRights6.send_messages = true;
            }
            if (tLRPC$TL_chatBannedRights7.send_media) {
                tLRPC$TL_chatBannedRights6.send_media = true;
            }
            if (tLRPC$TL_chatBannedRights7.send_stickers) {
                tLRPC$TL_chatBannedRights6.send_stickers = true;
            }
            if (tLRPC$TL_chatBannedRights7.send_gifs) {
                tLRPC$TL_chatBannedRights6.send_gifs = true;
            }
            if (tLRPC$TL_chatBannedRights7.send_games) {
                tLRPC$TL_chatBannedRights6.send_games = true;
            }
            if (tLRPC$TL_chatBannedRights7.send_inline) {
                tLRPC$TL_chatBannedRights6.send_inline = true;
            }
            if (tLRPC$TL_chatBannedRights7.embed_links) {
                tLRPC$TL_chatBannedRights6.embed_links = true;
            }
            if (tLRPC$TL_chatBannedRights7.send_polls) {
                tLRPC$TL_chatBannedRights6.send_polls = true;
            }
            if (tLRPC$TL_chatBannedRights7.invite_users) {
                tLRPC$TL_chatBannedRights6.invite_users = true;
            }
            if (tLRPC$TL_chatBannedRights7.change_info) {
                tLRPC$TL_chatBannedRights6.change_info = true;
            }
            if (tLRPC$TL_chatBannedRights7.pin_messages) {
                tLRPC$TL_chatBannedRights6.pin_messages = true;
            }
            this.currentBannedRights = ChatObject.getBannedRightsString(tLRPC$TL_chatBannedRights6);
            if (tLRPC$TL_chatBannedRights2 != null && tLRPC$TL_chatBannedRights2.view_messages) {
                z4 = false;
            }
            this.initialIsSet = z4;
        }
        updateRows(false);
    }

    public static TLRPC$TL_chatAdminRights emptyAdminRights(boolean z) {
        TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights = new TLRPC$TL_chatAdminRights();
        tLRPC$TL_chatAdminRights.manage_call = z;
        tLRPC$TL_chatAdminRights.add_admins = z;
        tLRPC$TL_chatAdminRights.pin_messages = z;
        tLRPC$TL_chatAdminRights.invite_users = z;
        tLRPC$TL_chatAdminRights.ban_users = z;
        tLRPC$TL_chatAdminRights.delete_messages = z;
        tLRPC$TL_chatAdminRights.edit_messages = z;
        tLRPC$TL_chatAdminRights.post_messages = z;
        tLRPC$TL_chatAdminRights.change_info = z;
        return tLRPC$TL_chatAdminRights;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public View createView(Context context) {
        this.actionBar.setBackButtonImage(2131165449);
        int i = 1;
        this.actionBar.setAllowOverlayTitle(true);
        int i2 = this.currentType;
        if (i2 == 0) {
            this.actionBar.setTitle(LocaleController.getString("EditAdmin", 2131625554));
        } else if (i2 == 2) {
            this.actionBar.setTitle(LocaleController.getString("AddBot", 2131624255));
        } else {
            this.actionBar.setTitle(LocaleController.getString("UserRestrictions", 2131628883));
        }
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass1());
        if (this.canEdit || (!this.isChannel && this.currentChat.creator && UserObject.isUserSelf(this.currentUser))) {
            ActionBarMenu createMenu = this.actionBar.createMenu();
            Drawable mutate = context.getResources().getDrawable(2131165450).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor("actionBarDefaultIcon"), PorterDuff.Mode.MULTIPLY));
            this.doneDrawable = new CrossfadeDrawable(mutate, new CircularProgressDrawable(Theme.getColor("actionBarDefaultIcon")));
            createMenu.addItemWithWidth(1, 0, AndroidUtilities.dp(56.0f), LocaleController.getString("Done", 2131625541));
            createMenu.getItem(1).setIcon(this.doneDrawable);
        }
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(context);
        this.fragmentView = anonymousClass2;
        anonymousClass2.setBackgroundColor(Theme.getColor("windowBackgroundGray"));
        View view = this.fragmentView;
        FrameLayout frameLayout = (FrameLayout) view;
        view.setFocusableInTouchMode(true);
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(context);
        this.listView = anonymousClass3;
        anonymousClass3.setClipChildren(this.currentType != 2);
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(this, context, 1, false);
        this.linearLayoutManager = anonymousClass4;
        anonymousClass4.setInitialPrefetchItemCount(100);
        this.listView.setLayoutManager(this.linearLayoutManager);
        RecyclerListView recyclerListView = this.listView;
        ListAdapter listAdapter = new ListAdapter(context);
        this.listViewAdapter = listAdapter;
        recyclerListView.setAdapter(listAdapter);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        if (this.currentType == 2) {
            this.listView.setResetSelectorOnChanged(false);
        }
        defaultItemAnimator.setDelayAnimations(false);
        this.listView.setItemAnimator(defaultItemAnimator);
        RecyclerListView recyclerListView2 = this.listView;
        if (!LocaleController.isRTL) {
            i = 2;
        }
        recyclerListView2.setVerticalScrollbarPosition(i);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setOnScrollListener(new AnonymousClass5());
        this.listView.setOnItemClickListener(new ChatRightsEditActivity$$ExternalSyntheticLambda25(this, context));
        return this.fragmentView;
    }

    /* renamed from: org.telegram.ui.ChatRightsEditActivity$1 */
    /* loaded from: classes3.dex */
    class AnonymousClass1 extends ActionBar.ActionBarMenuOnItemClick {
        AnonymousClass1() {
            ChatRightsEditActivity.this = r1;
        }

        @Override // org.telegram.ui.ActionBar.ActionBar.ActionBarMenuOnItemClick
        public void onItemClick(int i) {
            if (i == -1) {
                if (!ChatRightsEditActivity.this.checkDiscard()) {
                    return;
                }
                ChatRightsEditActivity.this.finishFragment();
            } else if (i != 1) {
            } else {
                ChatRightsEditActivity.this.onDonePressed();
            }
        }
    }

    /* renamed from: org.telegram.ui.ChatRightsEditActivity$2 */
    /* loaded from: classes3.dex */
    class AnonymousClass2 extends FrameLayout {
        private int previousHeight = -1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Context context) {
            super(context);
            ChatRightsEditActivity.this = r1;
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            int i5 = i4 - i2;
            int i6 = this.previousHeight;
            if (i6 != -1 && Math.abs(i6 - i5) > AndroidUtilities.dp(20.0f)) {
                ChatRightsEditActivity.this.listView.smoothScrollToPosition(ChatRightsEditActivity.this.rowCount - 1);
            }
            this.previousHeight = i5;
        }
    }

    /* renamed from: org.telegram.ui.ChatRightsEditActivity$3 */
    /* loaded from: classes3.dex */
    class AnonymousClass3 extends RecyclerListView {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(Context context) {
            super(context);
            ChatRightsEditActivity.this = r1;
        }

        @Override // org.telegram.ui.Components.RecyclerListView, androidx.recyclerview.widget.RecyclerView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (ChatRightsEditActivity.this.loading) {
                return false;
            }
            return super.onTouchEvent(motionEvent);
        }

        @Override // org.telegram.ui.Components.RecyclerListView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (ChatRightsEditActivity.this.loading) {
                return false;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    /* renamed from: org.telegram.ui.ChatRightsEditActivity$4 */
    /* loaded from: classes3.dex */
    class AnonymousClass4 extends LinearLayoutManager {
        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected int getExtraLayoutSpace(RecyclerView.State state) {
            return 5000;
        }

        AnonymousClass4(ChatRightsEditActivity chatRightsEditActivity, Context context, int i, boolean z) {
            super(context, i, z);
        }
    }

    /* renamed from: org.telegram.ui.ChatRightsEditActivity$5 */
    /* loaded from: classes3.dex */
    class AnonymousClass5 extends RecyclerView.OnScrollListener {
        AnonymousClass5() {
            ChatRightsEditActivity.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 1) {
                AndroidUtilities.hideKeyboard(ChatRightsEditActivity.this.getParentActivity().getCurrentFocus());
            }
        }
    }

    public /* synthetic */ void lambda$createView$6(Context context, View view, int i) {
        TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights;
        TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights2;
        String str;
        if (this.canEdit || (this.currentChat.creator && this.currentType == 0 && i == this.anonymousRow)) {
            if (i == 0) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", this.currentUser.id);
                presentFragment(new ProfileActivity(bundle));
                return;
            }
            boolean z = false;
            if (i == this.removeAdminRow) {
                int i2 = this.currentType;
                if (i2 == 0) {
                    MessagesController.getInstance(this.currentAccount).setUserAdminRole(this.chatId, this.currentUser, new TLRPC$TL_chatAdminRights(), this.currentRank, this.isChannel, getFragmentForAlert(0), this.isAddingNew, false, null, null);
                    ChatRightsEditActivityDelegate chatRightsEditActivityDelegate = this.delegate;
                    if (chatRightsEditActivityDelegate != null) {
                        chatRightsEditActivityDelegate.didSetRights(0, this.adminRights, this.bannedRights, this.currentRank);
                    }
                    finishFragment();
                } else if (i2 == 1) {
                    TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights3 = new TLRPC$TL_chatBannedRights();
                    this.bannedRights = tLRPC$TL_chatBannedRights3;
                    tLRPC$TL_chatBannedRights3.view_messages = true;
                    tLRPC$TL_chatBannedRights3.send_media = true;
                    tLRPC$TL_chatBannedRights3.send_messages = true;
                    tLRPC$TL_chatBannedRights3.send_stickers = true;
                    tLRPC$TL_chatBannedRights3.send_gifs = true;
                    tLRPC$TL_chatBannedRights3.send_games = true;
                    tLRPC$TL_chatBannedRights3.send_inline = true;
                    tLRPC$TL_chatBannedRights3.embed_links = true;
                    tLRPC$TL_chatBannedRights3.pin_messages = true;
                    tLRPC$TL_chatBannedRights3.send_polls = true;
                    tLRPC$TL_chatBannedRights3.invite_users = true;
                    tLRPC$TL_chatBannedRights3.change_info = true;
                    tLRPC$TL_chatBannedRights3.until_date = 0;
                    onDonePressed();
                }
            } else if (i == this.transferOwnerRow) {
                lambda$initTransfer$8(null, null);
            } else if (i == this.untilDateRow) {
                if (getParentActivity() == null) {
                    return;
                }
                BottomSheet.Builder builder = new BottomSheet.Builder(context);
                builder.setApplyTopPadding(false);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                HeaderCell headerCell = new HeaderCell(context, "dialogTextBlue2", 23, 15, false);
                headerCell.setHeight(47);
                headerCell.setText(LocaleController.getString("UserRestrictionsDuration", 2131628894));
                linearLayout.addView(headerCell);
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(1);
                linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2));
                BottomSheet.BottomSheetCell[] bottomSheetCellArr = new BottomSheet.BottomSheetCell[5];
                for (int i3 = 0; i3 < 5; i3++) {
                    bottomSheetCellArr[i3] = new BottomSheet.BottomSheetCell(context, 0);
                    bottomSheetCellArr[i3].setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
                    bottomSheetCellArr[i3].setTag(Integer.valueOf(i3));
                    bottomSheetCellArr[i3].setBackgroundDrawable(Theme.getSelectorDrawable(false));
                    if (i3 == 0) {
                        str = LocaleController.getString("UserRestrictionsUntilForever", 2131628912);
                    } else if (i3 == 1) {
                        str = LocaleController.formatPluralString("Days", 1, new Object[0]);
                    } else if (i3 == 2) {
                        str = LocaleController.formatPluralString("Weeks", 1, new Object[0]);
                    } else if (i3 == 3) {
                        str = LocaleController.formatPluralString("Months", 1, new Object[0]);
                    } else {
                        str = LocaleController.getString("UserRestrictionsCustom", 2131628892);
                    }
                    bottomSheetCellArr[i3].setTextAndIcon(str, 0);
                    linearLayout2.addView(bottomSheetCellArr[i3], LayoutHelper.createLinear(-1, -2));
                    bottomSheetCellArr[i3].setOnClickListener(new ChatRightsEditActivity$$ExternalSyntheticLambda12(this, builder));
                }
                builder.setCustomView(linearLayout);
                showDialog(builder.create());
            } else if (view instanceof TextCheckCell2) {
                TextCheckCell2 textCheckCell2 = (TextCheckCell2) view;
                if (textCheckCell2.hasIcon()) {
                    if (this.currentType == 2) {
                        return;
                    }
                    new AlertDialog.Builder(getParentActivity()).setTitle(LocaleController.getString("UserRestrictionsCantModify", 2131628888)).setMessage(LocaleController.getString("UserRestrictionsCantModifyDisabled", 2131628889)).setPositiveButton(LocaleController.getString("OK", 2131627127), null).create().show();
                } else if (!textCheckCell2.isEnabled()) {
                    int i4 = this.currentType;
                    if (i4 != 2 && i4 != 0) {
                        return;
                    }
                    if ((i != this.changeInfoRow || (tLRPC$TL_chatBannedRights2 = this.defaultBannedRights) == null || tLRPC$TL_chatBannedRights2.change_info) && (i != this.pinMessagesRow || (tLRPC$TL_chatBannedRights = this.defaultBannedRights) == null || tLRPC$TL_chatBannedRights.pin_messages)) {
                        return;
                    }
                    new AlertDialog.Builder(getParentActivity()).setTitle(LocaleController.getString("UserRestrictionsCantModify", 2131628888)).setMessage(LocaleController.getString("UserRestrictionsCantModifyEnabled", 2131628890)).setPositiveButton(LocaleController.getString("OK", 2131627127), null).create().show();
                } else {
                    if (this.currentType != 2) {
                        textCheckCell2.setChecked(!textCheckCell2.isChecked());
                    }
                    boolean isChecked = textCheckCell2.isChecked();
                    if (i == this.manageRow) {
                        isChecked = !this.asAdmin;
                        this.asAdmin = isChecked;
                        updateAsAdmin(true);
                    } else if (i == this.changeInfoRow) {
                        int i5 = this.currentType;
                        if (i5 == 0 || i5 == 2) {
                            TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights = this.adminRights;
                            isChecked = !tLRPC$TL_chatAdminRights.change_info;
                            tLRPC$TL_chatAdminRights.change_info = isChecked;
                        } else {
                            TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights4 = this.bannedRights;
                            isChecked = !tLRPC$TL_chatBannedRights4.change_info;
                            tLRPC$TL_chatBannedRights4.change_info = isChecked;
                        }
                    } else if (i == this.postMessagesRow) {
                        TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights2 = this.adminRights;
                        isChecked = !tLRPC$TL_chatAdminRights2.post_messages;
                        tLRPC$TL_chatAdminRights2.post_messages = isChecked;
                    } else if (i == this.editMesagesRow) {
                        TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights3 = this.adminRights;
                        isChecked = !tLRPC$TL_chatAdminRights3.edit_messages;
                        tLRPC$TL_chatAdminRights3.edit_messages = isChecked;
                    } else if (i == this.deleteMessagesRow) {
                        TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights4 = this.adminRights;
                        isChecked = !tLRPC$TL_chatAdminRights4.delete_messages;
                        tLRPC$TL_chatAdminRights4.delete_messages = isChecked;
                    } else if (i == this.addAdminsRow) {
                        TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights5 = this.adminRights;
                        isChecked = !tLRPC$TL_chatAdminRights5.add_admins;
                        tLRPC$TL_chatAdminRights5.add_admins = isChecked;
                    } else if (i == this.anonymousRow) {
                        TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights6 = this.adminRights;
                        isChecked = !tLRPC$TL_chatAdminRights6.anonymous;
                        tLRPC$TL_chatAdminRights6.anonymous = isChecked;
                    } else if (i == this.banUsersRow) {
                        TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights7 = this.adminRights;
                        isChecked = !tLRPC$TL_chatAdminRights7.ban_users;
                        tLRPC$TL_chatAdminRights7.ban_users = isChecked;
                    } else if (i == this.startVoiceChatRow) {
                        TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights8 = this.adminRights;
                        isChecked = !tLRPC$TL_chatAdminRights8.manage_call;
                        tLRPC$TL_chatAdminRights8.manage_call = isChecked;
                    } else if (i == this.addUsersRow) {
                        int i6 = this.currentType;
                        if (i6 == 0 || i6 == 2) {
                            TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights9 = this.adminRights;
                            isChecked = !tLRPC$TL_chatAdminRights9.invite_users;
                            tLRPC$TL_chatAdminRights9.invite_users = isChecked;
                        } else {
                            TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights5 = this.bannedRights;
                            isChecked = !tLRPC$TL_chatBannedRights5.invite_users;
                            tLRPC$TL_chatBannedRights5.invite_users = isChecked;
                        }
                    } else if (i == this.pinMessagesRow) {
                        int i7 = this.currentType;
                        if (i7 == 0 || i7 == 2) {
                            TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights10 = this.adminRights;
                            isChecked = !tLRPC$TL_chatAdminRights10.pin_messages;
                            tLRPC$TL_chatAdminRights10.pin_messages = isChecked;
                        } else {
                            TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights6 = this.bannedRights;
                            isChecked = !tLRPC$TL_chatBannedRights6.pin_messages;
                            tLRPC$TL_chatBannedRights6.pin_messages = isChecked;
                        }
                    } else if (this.currentType == 1 && this.bannedRights != null) {
                        boolean z2 = !textCheckCell2.isChecked();
                        int i8 = this.sendMessagesRow;
                        if (i == i8) {
                            TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights7 = this.bannedRights;
                            isChecked = !tLRPC$TL_chatBannedRights7.send_messages;
                            tLRPC$TL_chatBannedRights7.send_messages = isChecked;
                        } else if (i == this.sendMediaRow) {
                            TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights8 = this.bannedRights;
                            isChecked = !tLRPC$TL_chatBannedRights8.send_media;
                            tLRPC$TL_chatBannedRights8.send_media = isChecked;
                        } else if (i == this.sendStickersRow) {
                            TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights9 = this.bannedRights;
                            isChecked = !tLRPC$TL_chatBannedRights9.send_stickers;
                            tLRPC$TL_chatBannedRights9.send_inline = isChecked;
                            tLRPC$TL_chatBannedRights9.send_gifs = isChecked;
                            tLRPC$TL_chatBannedRights9.send_games = isChecked;
                            tLRPC$TL_chatBannedRights9.send_stickers = isChecked;
                        } else if (i == this.embedLinksRow) {
                            TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights10 = this.bannedRights;
                            isChecked = !tLRPC$TL_chatBannedRights10.embed_links;
                            tLRPC$TL_chatBannedRights10.embed_links = isChecked;
                        } else if (i == this.sendPollsRow) {
                            TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights11 = this.bannedRights;
                            isChecked = !tLRPC$TL_chatBannedRights11.send_polls;
                            tLRPC$TL_chatBannedRights11.send_polls = isChecked;
                        }
                        if (z2) {
                            TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights12 = this.bannedRights;
                            if (tLRPC$TL_chatBannedRights12.view_messages && !tLRPC$TL_chatBannedRights12.send_messages) {
                                tLRPC$TL_chatBannedRights12.send_messages = true;
                                RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.listView.findViewHolderForAdapterPosition(i8);
                                if (findViewHolderForAdapterPosition != null) {
                                    ((TextCheckCell2) findViewHolderForAdapterPosition.itemView).setChecked(false);
                                }
                            }
                            TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights13 = this.bannedRights;
                            if ((tLRPC$TL_chatBannedRights13.view_messages || tLRPC$TL_chatBannedRights13.send_messages) && !tLRPC$TL_chatBannedRights13.send_media) {
                                tLRPC$TL_chatBannedRights13.send_media = true;
                                RecyclerView.ViewHolder findViewHolderForAdapterPosition2 = this.listView.findViewHolderForAdapterPosition(this.sendMediaRow);
                                if (findViewHolderForAdapterPosition2 != null) {
                                    ((TextCheckCell2) findViewHolderForAdapterPosition2.itemView).setChecked(false);
                                }
                            }
                            TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights14 = this.bannedRights;
                            if ((tLRPC$TL_chatBannedRights14.view_messages || tLRPC$TL_chatBannedRights14.send_messages) && !tLRPC$TL_chatBannedRights14.send_polls) {
                                tLRPC$TL_chatBannedRights14.send_polls = true;
                                RecyclerView.ViewHolder findViewHolderForAdapterPosition3 = this.listView.findViewHolderForAdapterPosition(this.sendPollsRow);
                                if (findViewHolderForAdapterPosition3 != null) {
                                    ((TextCheckCell2) findViewHolderForAdapterPosition3.itemView).setChecked(false);
                                }
                            }
                            TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights15 = this.bannedRights;
                            if ((tLRPC$TL_chatBannedRights15.view_messages || tLRPC$TL_chatBannedRights15.send_messages) && !tLRPC$TL_chatBannedRights15.send_stickers) {
                                tLRPC$TL_chatBannedRights15.send_inline = true;
                                tLRPC$TL_chatBannedRights15.send_gifs = true;
                                tLRPC$TL_chatBannedRights15.send_games = true;
                                tLRPC$TL_chatBannedRights15.send_stickers = true;
                                RecyclerView.ViewHolder findViewHolderForAdapterPosition4 = this.listView.findViewHolderForAdapterPosition(this.sendStickersRow);
                                if (findViewHolderForAdapterPosition4 != null) {
                                    ((TextCheckCell2) findViewHolderForAdapterPosition4.itemView).setChecked(false);
                                }
                            }
                            TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights16 = this.bannedRights;
                            if ((tLRPC$TL_chatBannedRights16.view_messages || tLRPC$TL_chatBannedRights16.send_messages) && !tLRPC$TL_chatBannedRights16.embed_links) {
                                tLRPC$TL_chatBannedRights16.embed_links = true;
                                RecyclerView.ViewHolder findViewHolderForAdapterPosition5 = this.listView.findViewHolderForAdapterPosition(this.embedLinksRow);
                                if (findViewHolderForAdapterPosition5 != null) {
                                    ((TextCheckCell2) findViewHolderForAdapterPosition5.itemView).setChecked(false);
                                }
                            }
                        } else {
                            TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights17 = this.bannedRights;
                            boolean z3 = tLRPC$TL_chatBannedRights17.send_messages;
                            if ((!z3 || !tLRPC$TL_chatBannedRights17.embed_links || !tLRPC$TL_chatBannedRights17.send_inline || !tLRPC$TL_chatBannedRights17.send_media || !tLRPC$TL_chatBannedRights17.send_polls) && tLRPC$TL_chatBannedRights17.view_messages) {
                                tLRPC$TL_chatBannedRights17.view_messages = false;
                            }
                            if ((!tLRPC$TL_chatBannedRights17.embed_links || !tLRPC$TL_chatBannedRights17.send_inline || !tLRPC$TL_chatBannedRights17.send_media || !tLRPC$TL_chatBannedRights17.send_polls) && z3) {
                                tLRPC$TL_chatBannedRights17.send_messages = false;
                                RecyclerView.ViewHolder findViewHolderForAdapterPosition6 = this.listView.findViewHolderForAdapterPosition(i8);
                                if (findViewHolderForAdapterPosition6 != null) {
                                    ((TextCheckCell2) findViewHolderForAdapterPosition6.itemView).setChecked(true);
                                }
                            }
                        }
                    }
                    if (this.currentType == 2) {
                        if (this.asAdmin && isChecked) {
                            z = true;
                        }
                        textCheckCell2.setChecked(z);
                    }
                    updateRows(true);
                }
            }
        }
    }

    public /* synthetic */ void lambda$createView$5(BottomSheet.Builder builder, View view) {
        int intValue = ((Integer) view.getTag()).intValue();
        if (intValue == 0) {
            this.bannedRights.until_date = 0;
            this.listViewAdapter.notifyItemChanged(this.untilDateRow);
        } else if (intValue == 1) {
            this.bannedRights.until_date = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 86400;
            this.listViewAdapter.notifyItemChanged(this.untilDateRow);
        } else if (intValue == 2) {
            this.bannedRights.until_date = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 604800;
            this.listViewAdapter.notifyItemChanged(this.untilDateRow);
        } else if (intValue == 3) {
            this.bannedRights.until_date = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 2592000;
            this.listViewAdapter.notifyItemChanged(this.untilDateRow);
        } else if (intValue == 4) {
            Calendar calendar = Calendar.getInstance();
            try {
                DatePickerDialog datePickerDialog = new DatePickerDialog(getParentActivity(), new ChatRightsEditActivity$$ExternalSyntheticLambda2(this), calendar.get(1), calendar.get(2), calendar.get(5));
                DatePicker datePicker = datePickerDialog.getDatePicker();
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(System.currentTimeMillis());
                calendar2.set(11, calendar2.getMinimum(11));
                calendar2.set(12, calendar2.getMinimum(12));
                calendar2.set(13, calendar2.getMinimum(13));
                calendar2.set(14, calendar2.getMinimum(14));
                datePicker.setMinDate(calendar2.getTimeInMillis());
                calendar2.setTimeInMillis(System.currentTimeMillis() + 31536000000L);
                calendar2.set(11, calendar2.getMaximum(11));
                calendar2.set(12, calendar2.getMaximum(12));
                calendar2.set(13, calendar2.getMaximum(13));
                calendar2.set(14, calendar2.getMaximum(14));
                datePicker.setMaxDate(calendar2.getTimeInMillis());
                datePickerDialog.setButton(-1, LocaleController.getString("Set", 2131628296), datePickerDialog);
                datePickerDialog.setButton(-2, LocaleController.getString("Cancel", 2131624832), ChatRightsEditActivity$$ExternalSyntheticLambda10.INSTANCE);
                if (Build.VERSION.SDK_INT >= 21) {
                    datePickerDialog.setOnShowListener(new ChatRightsEditActivity$$ExternalSyntheticLambda11(datePicker));
                }
                showDialog(datePickerDialog);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        builder.getDismissRunnable().run();
    }

    public /* synthetic */ void lambda$createView$2(DatePicker datePicker, int i, int i2, int i3) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(i, i2, i3);
        try {
            TimePickerDialog timePickerDialog = new TimePickerDialog(getParentActivity(), new ChatRightsEditActivity$$ExternalSyntheticLambda3(this, (int) (calendar.getTime().getTime() / 1000)), 0, 0, true);
            timePickerDialog.setButton(-1, LocaleController.getString("Set", 2131628296), timePickerDialog);
            timePickerDialog.setButton(-2, LocaleController.getString("Cancel", 2131624832), ChatRightsEditActivity$$ExternalSyntheticLambda9.INSTANCE);
            showDialog(timePickerDialog);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public /* synthetic */ void lambda$createView$0(int i, TimePicker timePicker, int i2, int i3) {
        this.bannedRights.until_date = i + (i2 * 3600) + (i3 * 60);
        this.listViewAdapter.notifyItemChanged(this.untilDateRow);
    }

    public static /* synthetic */ void lambda$createView$4(DatePicker datePicker, DialogInterface dialogInterface) {
        int childCount = datePicker.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = datePicker.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            layoutParams.width = -1;
            childAt.setLayoutParams(layoutParams);
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.listViewAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    private boolean isDefaultAdminRights() {
        TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights = this.adminRights;
        boolean z = tLRPC$TL_chatAdminRights.change_info;
        return (z && tLRPC$TL_chatAdminRights.delete_messages && tLRPC$TL_chatAdminRights.ban_users && tLRPC$TL_chatAdminRights.invite_users && tLRPC$TL_chatAdminRights.pin_messages && tLRPC$TL_chatAdminRights.manage_call && !tLRPC$TL_chatAdminRights.add_admins && !tLRPC$TL_chatAdminRights.anonymous) || (!z && !tLRPC$TL_chatAdminRights.delete_messages && !tLRPC$TL_chatAdminRights.ban_users && !tLRPC$TL_chatAdminRights.invite_users && !tLRPC$TL_chatAdminRights.pin_messages && !tLRPC$TL_chatAdminRights.manage_call && !tLRPC$TL_chatAdminRights.add_admins && !tLRPC$TL_chatAdminRights.anonymous);
    }

    private boolean hasAllAdminRights() {
        if (this.isChannel) {
            TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights = this.adminRights;
            return tLRPC$TL_chatAdminRights.change_info && tLRPC$TL_chatAdminRights.post_messages && tLRPC$TL_chatAdminRights.edit_messages && tLRPC$TL_chatAdminRights.delete_messages && tLRPC$TL_chatAdminRights.invite_users && tLRPC$TL_chatAdminRights.add_admins && tLRPC$TL_chatAdminRights.manage_call;
        }
        TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights2 = this.adminRights;
        return tLRPC$TL_chatAdminRights2.change_info && tLRPC$TL_chatAdminRights2.delete_messages && tLRPC$TL_chatAdminRights2.ban_users && tLRPC$TL_chatAdminRights2.invite_users && tLRPC$TL_chatAdminRights2.pin_messages && tLRPC$TL_chatAdminRights2.add_admins && tLRPC$TL_chatAdminRights2.manage_call;
    }

    /* renamed from: initTransfer */
    public void lambda$initTransfer$8(TLRPC$InputCheckPasswordSRP tLRPC$InputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        if (getParentActivity() == null) {
            return;
        }
        if (tLRPC$InputCheckPasswordSRP != null && !ChatObject.isChannel(this.currentChat)) {
            MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getParentActivity(), this.chatId, this, new ChatRightsEditActivity$$ExternalSyntheticLambda21(this, tLRPC$InputCheckPasswordSRP, twoStepVerificationActivity));
            return;
        }
        TLRPC$TL_channels_editCreator tLRPC$TL_channels_editCreator = new TLRPC$TL_channels_editCreator();
        if (ChatObject.isChannel(this.currentChat)) {
            TLRPC$TL_inputChannel tLRPC$TL_inputChannel = new TLRPC$TL_inputChannel();
            tLRPC$TL_channels_editCreator.channel = tLRPC$TL_inputChannel;
            TLRPC$Chat tLRPC$Chat = this.currentChat;
            tLRPC$TL_inputChannel.channel_id = tLRPC$Chat.id;
            tLRPC$TL_inputChannel.access_hash = tLRPC$Chat.access_hash;
        } else {
            tLRPC$TL_channels_editCreator.channel = new TLRPC$TL_inputChannelEmpty();
        }
        tLRPC$TL_channels_editCreator.password = tLRPC$InputCheckPasswordSRP != null ? tLRPC$InputCheckPasswordSRP : new TLRPC$TL_inputCheckPasswordEmpty();
        tLRPC$TL_channels_editCreator.user_id = getMessagesController().getInputUser(this.currentUser);
        getConnectionsManager().sendRequest(tLRPC$TL_channels_editCreator, new ChatRightsEditActivity$$ExternalSyntheticLambda22(this, tLRPC$InputCheckPasswordSRP, twoStepVerificationActivity, tLRPC$TL_channels_editCreator));
    }

    public /* synthetic */ void lambda$initTransfer$7(TLRPC$InputCheckPasswordSRP tLRPC$InputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j) {
        if (j != 0) {
            this.chatId = j;
            this.currentChat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j));
            lambda$initTransfer$8(tLRPC$InputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    public /* synthetic */ void lambda$initTransfer$14(TLRPC$InputCheckPasswordSRP tLRPC$InputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC$TL_channels_editCreator tLRPC$TL_channels_editCreator, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new ChatRightsEditActivity$$ExternalSyntheticLambda16(this, tLRPC$TL_error, tLRPC$InputCheckPasswordSRP, twoStepVerificationActivity, tLRPC$TL_channels_editCreator));
    }

    public /* synthetic */ void lambda$initTransfer$13(TLRPC$TL_error tLRPC$TL_error, TLRPC$InputCheckPasswordSRP tLRPC$InputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC$TL_channels_editCreator tLRPC$TL_channels_editCreator) {
        if (tLRPC$TL_error == null) {
            if (tLRPC$InputCheckPasswordSRP == null) {
                return;
            }
            this.delegate.didChangeOwner(this.currentUser);
            removeSelfFromStack();
            twoStepVerificationActivity.needHideProgress();
            twoStepVerificationActivity.finishFragment();
        } else if (getParentActivity() == null) {
        } else {
            if ("PASSWORD_HASH_INVALID".equals(tLRPC$TL_error.text)) {
                if (tLRPC$InputCheckPasswordSRP != null) {
                    return;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                if (this.isChannel) {
                    builder.setTitle(LocaleController.getString("EditAdminChannelTransfer", 2131625562));
                } else {
                    builder.setTitle(LocaleController.getString("EditAdminGroupTransfer", 2131625566));
                }
                builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("EditAdminTransferReadyAlertText", 2131625583, this.currentChat.title, UserObject.getFirstName(this.currentUser))));
                builder.setPositiveButton(LocaleController.getString("EditAdminTransferChangeOwner", 2131625580), new ChatRightsEditActivity$$ExternalSyntheticLambda6(this));
                builder.setNegativeButton(LocaleController.getString("Cancel", 2131624832), null);
                showDialog(builder.create());
            } else if ("PASSWORD_MISSING".equals(tLRPC$TL_error.text) || tLRPC$TL_error.text.startsWith("PASSWORD_TOO_FRESH_") || tLRPC$TL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                if (twoStepVerificationActivity != null) {
                    twoStepVerificationActivity.needHideProgress();
                }
                AlertDialog.Builder builder2 = new AlertDialog.Builder(getParentActivity());
                builder2.setTitle(LocaleController.getString("EditAdminTransferAlertTitle", 2131625579));
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                linearLayout.setOrientation(1);
                builder2.setView(linearLayout);
                TextView textView = new TextView(getParentActivity());
                textView.setTextColor(Theme.getColor("dialogTextBlack"));
                textView.setTextSize(1, 16.0f);
                textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                if (this.isChannel) {
                    textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("EditChannelAdminTransferAlertText", 2131625589, UserObject.getFirstName(this.currentUser))));
                } else {
                    textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("EditAdminTransferAlertText", 2131625575, UserObject.getFirstName(this.currentUser))));
                }
                linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2));
                LinearLayout linearLayout2 = new LinearLayout(getParentActivity());
                linearLayout2.setOrientation(0);
                linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 0.0f, 11.0f, 0.0f, 0.0f));
                ImageView imageView = new ImageView(getParentActivity());
                imageView.setImageResource(2131165573);
                imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
                imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor("dialogTextBlack"), PorterDuff.Mode.MULTIPLY));
                TextView textView2 = new TextView(getParentActivity());
                textView2.setTextColor(Theme.getColor("dialogTextBlack"));
                textView2.setTextSize(1, 16.0f);
                textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString("EditAdminTransferAlertText1", 2131625576)));
                if (LocaleController.isRTL) {
                    linearLayout2.addView(textView2, LayoutHelper.createLinear(-1, -2));
                    linearLayout2.addView(imageView, LayoutHelper.createLinear(-2, -2, 5));
                } else {
                    linearLayout2.addView(imageView, LayoutHelper.createLinear(-2, -2));
                    linearLayout2.addView(textView2, LayoutHelper.createLinear(-1, -2));
                }
                LinearLayout linearLayout3 = new LinearLayout(getParentActivity());
                linearLayout3.setOrientation(0);
                linearLayout.addView(linearLayout3, LayoutHelper.createLinear(-1, -2, 0.0f, 11.0f, 0.0f, 0.0f));
                ImageView imageView2 = new ImageView(getParentActivity());
                imageView2.setImageResource(2131165573);
                imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
                imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor("dialogTextBlack"), PorterDuff.Mode.MULTIPLY));
                TextView textView3 = new TextView(getParentActivity());
                textView3.setTextColor(Theme.getColor("dialogTextBlack"));
                textView3.setTextSize(1, 16.0f);
                textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                textView3.setText(AndroidUtilities.replaceTags(LocaleController.getString("EditAdminTransferAlertText2", 2131625577)));
                if (LocaleController.isRTL) {
                    linearLayout3.addView(textView3, LayoutHelper.createLinear(-1, -2));
                    linearLayout3.addView(imageView2, LayoutHelper.createLinear(-2, -2, 5));
                } else {
                    linearLayout3.addView(imageView2, LayoutHelper.createLinear(-2, -2));
                    linearLayout3.addView(textView3, LayoutHelper.createLinear(-1, -2));
                }
                if ("PASSWORD_MISSING".equals(tLRPC$TL_error.text)) {
                    builder2.setPositiveButton(LocaleController.getString("EditAdminTransferSetPassword", 2131625584), new ChatRightsEditActivity$$ExternalSyntheticLambda7(this));
                    builder2.setNegativeButton(LocaleController.getString("Cancel", 2131624832), null);
                } else {
                    TextView textView4 = new TextView(getParentActivity());
                    textView4.setTextColor(Theme.getColor("dialogTextBlack"));
                    textView4.setTextSize(1, 16.0f);
                    textView4.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                    textView4.setText(LocaleController.getString("EditAdminTransferAlertText3", 2131625578));
                    linearLayout.addView(textView4, LayoutHelper.createLinear(-1, -2, 0.0f, 11.0f, 0.0f, 0.0f));
                    builder2.setNegativeButton(LocaleController.getString("OK", 2131627127), null);
                }
                showDialog(builder2.create());
            } else if ("SRP_ID_INVALID".equals(tLRPC$TL_error.text)) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC$TL_account_getPassword(), new ChatRightsEditActivity$$ExternalSyntheticLambda23(this, twoStepVerificationActivity), 8);
            } else if (tLRPC$TL_error.text.equals("CHANNELS_TOO_MUCH")) {
                if (getParentActivity() != null && !AccountInstance.getInstance(this.currentAccount).getUserConfig().isPremium()) {
                    showDialog(new LimitReachedBottomSheet(this, getParentActivity(), 5, this.currentAccount));
                } else {
                    presentFragment(new TooManyCommunitiesActivity(1));
                }
            } else {
                if (twoStepVerificationActivity != null) {
                    twoStepVerificationActivity.needHideProgress();
                    twoStepVerificationActivity.finishFragment();
                }
                AlertsCreator.showAddUserAlert(tLRPC$TL_error.text, this, this.isChannel, tLRPC$TL_channels_editCreator);
            }
        }
    }

    public /* synthetic */ void lambda$initTransfer$9(DialogInterface dialogInterface, int i) {
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        twoStepVerificationActivity.setDelegate(new ChatRightsEditActivity$$ExternalSyntheticLambda26(this, twoStepVerificationActivity));
        presentFragment(twoStepVerificationActivity);
    }

    public /* synthetic */ void lambda$initTransfer$10(DialogInterface dialogInterface, int i) {
        presentFragment(new TwoStepVerificationSetupActivity(6, null));
    }

    public /* synthetic */ void lambda$initTransfer$12(TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new ChatRightsEditActivity$$ExternalSyntheticLambda15(this, tLRPC$TL_error, tLObject, twoStepVerificationActivity));
    }

    public /* synthetic */ void lambda$initTransfer$11(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity) {
        if (tLRPC$TL_error == null) {
            TLRPC$TL_account_password tLRPC$TL_account_password = (TLRPC$TL_account_password) tLObject;
            twoStepVerificationActivity.setCurrentPasswordInfo(null, tLRPC$TL_account_password);
            TwoStepVerificationActivity.initPasswordNewAlgo(tLRPC$TL_account_password);
            lambda$initTransfer$8(twoStepVerificationActivity.getNewSrpPassword(), twoStepVerificationActivity);
        }
    }

    private void updateRows(boolean z) {
        int i;
        int min = Math.min(this.transferOwnerShadowRow, this.transferOwnerRow);
        this.manageRow = -1;
        this.changeInfoRow = -1;
        this.postMessagesRow = -1;
        this.editMesagesRow = -1;
        this.deleteMessagesRow = -1;
        this.addAdminsRow = -1;
        this.anonymousRow = -1;
        this.banUsersRow = -1;
        this.addUsersRow = -1;
        this.pinMessagesRow = -1;
        this.rightsShadowRow = -1;
        this.removeAdminRow = -1;
        this.removeAdminShadowRow = -1;
        this.cantEditInfoRow = -1;
        this.transferOwnerShadowRow = -1;
        this.transferOwnerRow = -1;
        this.rankHeaderRow = -1;
        this.rankRow = -1;
        this.rankInfoRow = -1;
        this.sendMessagesRow = -1;
        this.sendMediaRow = -1;
        this.sendStickersRow = -1;
        this.sendPollsRow = -1;
        this.embedLinksRow = -1;
        this.startVoiceChatRow = -1;
        this.untilSectionRow = -1;
        this.untilDateRow = -1;
        this.addBotButtonRow = -1;
        this.rowCount = 3;
        int i2 = this.currentType;
        if (i2 == 0 || i2 == 2) {
            if (this.isChannel) {
                int i3 = 3 + 1;
                this.rowCount = i3;
                this.changeInfoRow = 3;
                int i4 = i3 + 1;
                this.rowCount = i4;
                this.postMessagesRow = i3;
                int i5 = i4 + 1;
                this.rowCount = i5;
                this.editMesagesRow = i4;
                int i6 = i5 + 1;
                this.rowCount = i6;
                this.deleteMessagesRow = i5;
                int i7 = i6 + 1;
                this.rowCount = i7;
                this.addUsersRow = i6;
                int i8 = i7 + 1;
                this.rowCount = i8;
                this.startVoiceChatRow = i7;
                this.rowCount = i8 + 1;
                this.addAdminsRow = i8;
            } else {
                if (i2 == 2) {
                    this.rowCount = 3 + 1;
                    this.manageRow = 3;
                }
                int i9 = this.rowCount;
                int i10 = i9 + 1;
                this.rowCount = i10;
                this.changeInfoRow = i9;
                int i11 = i10 + 1;
                this.rowCount = i11;
                this.deleteMessagesRow = i10;
                int i12 = i11 + 1;
                this.rowCount = i12;
                this.banUsersRow = i11;
                int i13 = i12 + 1;
                this.rowCount = i13;
                this.addUsersRow = i12;
                int i14 = i13 + 1;
                this.rowCount = i14;
                this.pinMessagesRow = i13;
                int i15 = i14 + 1;
                this.rowCount = i15;
                this.startVoiceChatRow = i14;
                int i16 = i15 + 1;
                this.rowCount = i16;
                this.addAdminsRow = i15;
                this.rowCount = i16 + 1;
                this.anonymousRow = i16;
            }
        } else if (i2 == 1) {
            int i17 = 3 + 1;
            this.rowCount = i17;
            this.sendMessagesRow = 3;
            int i18 = i17 + 1;
            this.rowCount = i18;
            this.sendMediaRow = i17;
            int i19 = i18 + 1;
            this.rowCount = i19;
            this.sendStickersRow = i18;
            int i20 = i19 + 1;
            this.rowCount = i20;
            this.sendPollsRow = i19;
            int i21 = i20 + 1;
            this.rowCount = i21;
            this.embedLinksRow = i20;
            int i22 = i21 + 1;
            this.rowCount = i22;
            this.addUsersRow = i21;
            int i23 = i22 + 1;
            this.rowCount = i23;
            this.pinMessagesRow = i22;
            int i24 = i23 + 1;
            this.rowCount = i24;
            this.changeInfoRow = i23;
            int i25 = i24 + 1;
            this.rowCount = i25;
            this.untilSectionRow = i24;
            this.rowCount = i25 + 1;
            this.untilDateRow = i25;
        }
        int i26 = this.rowCount;
        if (this.canEdit) {
            if (!this.isChannel && (i2 == 0 || (i2 == 2 && this.asAdmin))) {
                int i27 = i26 + 1;
                this.rowCount = i27;
                this.rightsShadowRow = i26;
                int i28 = i27 + 1;
                this.rowCount = i28;
                this.rankHeaderRow = i27;
                int i29 = i28 + 1;
                this.rowCount = i29;
                this.rankRow = i28;
                this.rowCount = i29 + 1;
                this.rankInfoRow = i29;
            }
            TLRPC$Chat tLRPC$Chat = this.currentChat;
            if (tLRPC$Chat != null && tLRPC$Chat.creator && i2 == 0 && hasAllAdminRights() && !this.currentUser.bot) {
                int i30 = this.rightsShadowRow;
                if (i30 == -1) {
                    int i31 = this.rowCount;
                    this.rowCount = i31 + 1;
                    this.transferOwnerShadowRow = i31;
                }
                int i32 = this.rowCount;
                int i33 = i32 + 1;
                this.rowCount = i33;
                this.transferOwnerRow = i32;
                if (i30 != -1) {
                    this.rowCount = i33 + 1;
                    this.transferOwnerShadowRow = i33;
                }
            }
            if (this.initialIsSet) {
                if (this.rightsShadowRow == -1) {
                    int i34 = this.rowCount;
                    this.rowCount = i34 + 1;
                    this.rightsShadowRow = i34;
                }
                int i35 = this.rowCount;
                int i36 = i35 + 1;
                this.rowCount = i36;
                this.removeAdminRow = i35;
                this.rowCount = i36 + 1;
                this.removeAdminShadowRow = i36;
            }
        } else if (i2 == 0) {
            if (!this.isChannel && (!this.currentRank.isEmpty() || (this.currentChat.creator && UserObject.isUserSelf(this.currentUser)))) {
                int i37 = this.rowCount;
                int i38 = i37 + 1;
                this.rowCount = i38;
                this.rightsShadowRow = i37;
                int i39 = i38 + 1;
                this.rowCount = i39;
                this.rankHeaderRow = i38;
                this.rowCount = i39 + 1;
                this.rankRow = i39;
                if (this.currentChat.creator && UserObject.isUserSelf(this.currentUser)) {
                    int i40 = this.rowCount;
                    this.rowCount = i40 + 1;
                    this.rankInfoRow = i40;
                } else {
                    int i41 = this.rowCount;
                    this.rowCount = i41 + 1;
                    this.cantEditInfoRow = i41;
                }
            } else {
                int i42 = this.rowCount;
                this.rowCount = i42 + 1;
                this.cantEditInfoRow = i42;
            }
        } else {
            this.rowCount = i26 + 1;
            this.rightsShadowRow = i26;
        }
        if (this.currentType == 2) {
            int i43 = this.rowCount;
            this.rowCount = i43 + 1;
            this.addBotButtonRow = i43;
        }
        if (z) {
            if (min == -1 && (i = this.transferOwnerShadowRow) != -1) {
                this.listViewAdapter.notifyItemRangeInserted(Math.min(i, this.transferOwnerRow), 2);
            } else if (min == -1 || this.transferOwnerShadowRow != -1) {
            } else {
                this.listViewAdapter.notifyItemRangeRemoved(min, 2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
        if (r0.codePointCount(0, r0.length()) <= 16) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
        if (isDefaultAdminRights() == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDonePressed() {
        String str;
        String str2;
        if (this.loading) {
            return;
        }
        int i = 2;
        boolean z = true;
        if (!ChatObject.isChannel(this.currentChat)) {
            int i2 = this.currentType;
            if (i2 != 1) {
                if (i2 == 0) {
                    if (isDefaultAdminRights()) {
                        if (this.rankRow != -1) {
                            String str3 = this.currentRank;
                        }
                    }
                }
                if (this.currentType == 2) {
                    if (this.currentRank == null) {
                    }
                }
            }
            MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getParentActivity(), this.chatId, this, new ChatRightsEditActivity$$ExternalSyntheticLambda20(this));
            return;
        }
        int i3 = this.currentType;
        if (i3 == 0 || i3 == 2) {
            if (this.rankRow != -1) {
                String str4 = this.currentRank;
                if (str4.codePointCount(0, str4.length()) > 16) {
                    this.listView.smoothScrollToPosition(this.rankRow);
                    Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
                    if (vibrator != null) {
                        vibrator.vibrate(200L);
                    }
                    RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.listView.findViewHolderForAdapterPosition(this.rankHeaderRow);
                    if (findViewHolderForAdapterPosition == null) {
                        return;
                    }
                    AndroidUtilities.shakeView(findViewHolderForAdapterPosition.itemView, 2.0f, 0);
                    return;
                }
            }
            if (this.isChannel) {
                TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights = this.adminRights;
                tLRPC$TL_chatAdminRights.ban_users = false;
                tLRPC$TL_chatAdminRights.pin_messages = false;
            } else {
                TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights2 = this.adminRights;
                tLRPC$TL_chatAdminRights2.edit_messages = false;
                tLRPC$TL_chatAdminRights2.post_messages = false;
            }
            TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights3 = this.adminRights;
            if (!tLRPC$TL_chatAdminRights3.change_info && !tLRPC$TL_chatAdminRights3.post_messages && !tLRPC$TL_chatAdminRights3.edit_messages && !tLRPC$TL_chatAdminRights3.delete_messages && !tLRPC$TL_chatAdminRights3.ban_users && !tLRPC$TL_chatAdminRights3.invite_users && !tLRPC$TL_chatAdminRights3.pin_messages && !tLRPC$TL_chatAdminRights3.add_admins && !tLRPC$TL_chatAdminRights3.anonymous && !tLRPC$TL_chatAdminRights3.manage_call) {
                tLRPC$TL_chatAdminRights3.other = true;
            } else {
                tLRPC$TL_chatAdminRights3.other = false;
            }
        }
        int i4 = this.currentType;
        if (i4 == 0) {
            boolean z2 = this.delegate == null;
            setLoading(true);
            MessagesController.getInstance(this.currentAccount).setUserAdminRole(this.chatId, this.currentUser, this.adminRights, this.currentRank, this.isChannel, this, this.isAddingNew, false, null, new ChatRightsEditActivity$$ExternalSyntheticLambda13(this), new ChatRightsEditActivity$$ExternalSyntheticLambda17(this));
            z = z2;
        } else if (i4 == 1) {
            MessagesController.getInstance(this.currentAccount).setParticipantBannedRole(this.chatId, this.currentUser, null, this.bannedRights, this.isChannel, getFragmentForAlert(1));
            TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights = this.bannedRights;
            if (tLRPC$TL_chatBannedRights.send_messages || tLRPC$TL_chatBannedRights.send_stickers || tLRPC$TL_chatBannedRights.embed_links || tLRPC$TL_chatBannedRights.send_media || tLRPC$TL_chatBannedRights.send_gifs || tLRPC$TL_chatBannedRights.send_games || tLRPC$TL_chatBannedRights.send_inline) {
                i = 1;
            } else {
                tLRPC$TL_chatBannedRights.until_date = 0;
            }
            ChatRightsEditActivityDelegate chatRightsEditActivityDelegate = this.delegate;
            if (chatRightsEditActivityDelegate != null) {
                chatRightsEditActivityDelegate.didSetRights(i, this.adminRights, tLRPC$TL_chatBannedRights, this.currentRank);
            }
        } else if (i4 == 2) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
            if (this.asAdmin) {
                str = LocaleController.getString("AddBotAdmin", 2131624256);
            } else {
                str = LocaleController.getString("AddBot", 2131624255);
            }
            builder.setTitle(str);
            boolean z3 = ChatObject.isChannel(this.currentChat) && !this.currentChat.megagroup;
            TLRPC$Chat tLRPC$Chat = this.currentChat;
            String str5 = tLRPC$Chat == null ? "" : tLRPC$Chat.title;
            if (!this.asAdmin) {
                str2 = LocaleController.formatString("AddMembersAlertNamesText", 2131624279, UserObject.getUserName(this.currentUser), str5);
            } else if (z3) {
                str2 = LocaleController.formatString("AddBotMessageAdminChannel", 2131624261, str5);
            } else {
                str2 = LocaleController.formatString("AddBotMessageAdminGroup", 2131624262, str5);
            }
            builder.setMessage(AndroidUtilities.replaceTags(str2));
            builder.setNegativeButton(LocaleController.getString("Cancel", 2131624832), null);
            builder.setPositiveButton(this.asAdmin ? LocaleController.getString("AddAsAdmin", 2131624253) : LocaleController.getString("AddBot", 2131624255), new ChatRightsEditActivity$$ExternalSyntheticLambda8(this));
            showDialog(builder.create());
            z = false;
        }
        if (!z) {
            return;
        }
        finishFragment();
    }

    public /* synthetic */ void lambda$onDonePressed$15(long j) {
        if (j != 0) {
            this.chatId = j;
            this.currentChat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j));
            onDonePressed();
        }
    }

    public /* synthetic */ void lambda$onDonePressed$16() {
        ChatRightsEditActivityDelegate chatRightsEditActivityDelegate = this.delegate;
        if (chatRightsEditActivityDelegate != null) {
            TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights = this.adminRights;
            chatRightsEditActivityDelegate.didSetRights((tLRPC$TL_chatAdminRights.change_info || tLRPC$TL_chatAdminRights.post_messages || tLRPC$TL_chatAdminRights.edit_messages || tLRPC$TL_chatAdminRights.delete_messages || tLRPC$TL_chatAdminRights.ban_users || tLRPC$TL_chatAdminRights.invite_users || tLRPC$TL_chatAdminRights.pin_messages || tLRPC$TL_chatAdminRights.add_admins || tLRPC$TL_chatAdminRights.anonymous || tLRPC$TL_chatAdminRights.manage_call || tLRPC$TL_chatAdminRights.other) ? 1 : 0, tLRPC$TL_chatAdminRights, this.bannedRights, this.currentRank);
            finishFragment();
        }
    }

    public /* synthetic */ boolean lambda$onDonePressed$17(TLRPC$TL_error tLRPC$TL_error) {
        setLoading(false);
        return true;
    }

    public /* synthetic */ void lambda$onDonePressed$21(DialogInterface dialogInterface, int i) {
        setLoading(true);
        ChatRightsEditActivity$$ExternalSyntheticLambda14 chatRightsEditActivity$$ExternalSyntheticLambda14 = new ChatRightsEditActivity$$ExternalSyntheticLambda14(this);
        if (this.asAdmin || this.initialAsAdmin) {
            getMessagesController().setUserAdminRole(this.currentChat.id, this.currentUser, this.asAdmin ? this.adminRights : emptyAdminRights(false), this.currentRank, false, this, this.isAddingNew, this.asAdmin, this.botHash, chatRightsEditActivity$$ExternalSyntheticLambda14, new ChatRightsEditActivity$$ExternalSyntheticLambda19(this));
        } else {
            getMessagesController().addUserToChat(this.currentChat.id, this.currentUser, 0, this.botHash, this, true, chatRightsEditActivity$$ExternalSyntheticLambda14, new ChatRightsEditActivity$$ExternalSyntheticLambda18(this));
        }
    }

    public /* synthetic */ void lambda$onDonePressed$18() {
        ChatRightsEditActivityDelegate chatRightsEditActivityDelegate = this.delegate;
        if (chatRightsEditActivityDelegate != null) {
            chatRightsEditActivityDelegate.didSetRights(0, this.asAdmin ? this.adminRights : null, null, this.currentRank);
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("scrollToTopOnResume", true);
        bundle.putLong("chat_id", this.currentChat.id);
        if (!getMessagesController().checkCanOpenChat(bundle, this)) {
            setLoading(false);
            return;
        }
        ChatActivity chatActivity = new ChatActivity(bundle);
        presentFragment(chatActivity, true);
        if (!BulletinFactory.canShowBulletin(chatActivity)) {
            return;
        }
        boolean z = this.isAddingNew;
        if (z && this.asAdmin) {
            BulletinFactory.createAddedAsAdminBulletin(chatActivity, this.currentUser.first_name).show();
        } else if (z || this.initialAsAdmin || !this.asAdmin) {
        } else {
            BulletinFactory.createPromoteToAdminBulletin(chatActivity, this.currentUser.first_name).show();
        }
    }

    public /* synthetic */ boolean lambda$onDonePressed$19(TLRPC$TL_error tLRPC$TL_error) {
        setLoading(false);
        return true;
    }

    public /* synthetic */ boolean lambda$onDonePressed$20(TLRPC$TL_error tLRPC$TL_error) {
        setLoading(false);
        return true;
    }

    public void setLoading(boolean z) {
        ValueAnimator valueAnimator = this.doneDrawableAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.loading = !z ? 1 : 0;
        this.actionBar.getBackButton().setEnabled(!z);
        CrossfadeDrawable crossfadeDrawable = this.doneDrawable;
        if (crossfadeDrawable != null) {
            float[] fArr = new float[2];
            fArr[0] = crossfadeDrawable.getProgress();
            fArr[1] = z ? 1.0f : 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            this.doneDrawableAnimator = ofFloat;
            ofFloat.addUpdateListener(new ChatRightsEditActivity$$ExternalSyntheticLambda0(this));
            this.doneDrawableAnimator.setDuration(Math.abs(this.doneDrawable.getProgress() - (z ? 1.0f : 0.0f)) * 150.0f);
            this.doneDrawableAnimator.start();
        }
    }

    public /* synthetic */ void lambda$setLoading$22(ValueAnimator valueAnimator) {
        this.doneDrawable.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.doneDrawable.invalidateSelf();
    }

    public void setDelegate(ChatRightsEditActivityDelegate chatRightsEditActivityDelegate) {
        this.delegate = chatRightsEditActivityDelegate;
    }

    public boolean checkDiscard() {
        boolean z;
        int i = this.currentType;
        if (i == 2) {
            return true;
        }
        if (i == 1) {
            z = this.currentBannedRights.equals(ChatObject.getBannedRightsString(this.bannedRights));
        } else {
            z = this.initialRank.equals(this.currentRank);
        }
        if (!(!z)) {
            return true;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle(LocaleController.getString("UserRestrictionsApplyChanges", 2131628884));
        builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("UserRestrictionsApplyChangesText", 2131628885, MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.chatId)).title)));
        builder.setPositiveButton(LocaleController.getString("ApplyTheme", 2131624396), new ChatRightsEditActivity$$ExternalSyntheticLambda4(this));
        builder.setNegativeButton(LocaleController.getString("PassportDiscard", 2131627272), new ChatRightsEditActivity$$ExternalSyntheticLambda5(this));
        showDialog(builder.create());
        return false;
    }

    public /* synthetic */ void lambda$checkDiscard$23(DialogInterface dialogInterface, int i) {
        onDonePressed();
    }

    public /* synthetic */ void lambda$checkDiscard$24(DialogInterface dialogInterface, int i) {
        finishFragment();
    }

    public void setTextLeft(View view) {
        if (view instanceof HeaderCell) {
            HeaderCell headerCell = (HeaderCell) view;
            String str = this.currentRank;
            int codePointCount = 16 - (str != null ? str.codePointCount(0, str.length()) : 0);
            if (codePointCount <= 4.8f) {
                headerCell.setText2(String.format("%d", Integer.valueOf(codePointCount)));
                SimpleTextView textView2 = headerCell.getTextView2();
                String str2 = codePointCount < 0 ? "windowBackgroundWhiteRedText5" : "windowBackgroundWhiteGrayText3";
                textView2.setTextColor(Theme.getColor(str2));
                textView2.setTag(str2);
                return;
            }
            headerCell.setText2("");
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean onBackPressed() {
        return checkDiscard();
    }

    /* loaded from: classes3.dex */
    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private boolean ignoreTextChange;
        private Context mContext;

        public ListAdapter(Context context) {
            ChatRightsEditActivity.this = r2;
            if (r2.currentType == 2) {
                setHasStableIds(true);
            }
            this.mContext = context;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            if (ChatRightsEditActivity.this.currentType == 2) {
                if (i == ChatRightsEditActivity.this.manageRow) {
                    return 1L;
                }
                if (i == ChatRightsEditActivity.this.changeInfoRow) {
                    return 2L;
                }
                if (i == ChatRightsEditActivity.this.postMessagesRow) {
                    return 3L;
                }
                if (i == ChatRightsEditActivity.this.editMesagesRow) {
                    return 4L;
                }
                if (i == ChatRightsEditActivity.this.deleteMessagesRow) {
                    return 5L;
                }
                if (i == ChatRightsEditActivity.this.addAdminsRow) {
                    return 6L;
                }
                if (i == ChatRightsEditActivity.this.anonymousRow) {
                    return 7L;
                }
                if (i == ChatRightsEditActivity.this.banUsersRow) {
                    return 8L;
                }
                if (i == ChatRightsEditActivity.this.addUsersRow) {
                    return 9L;
                }
                if (i == ChatRightsEditActivity.this.pinMessagesRow) {
                    return 10L;
                }
                if (i == ChatRightsEditActivity.this.rightsShadowRow) {
                    return 11L;
                }
                if (i == ChatRightsEditActivity.this.removeAdminRow) {
                    return 12L;
                }
                if (i == ChatRightsEditActivity.this.removeAdminShadowRow) {
                    return 13L;
                }
                if (i == ChatRightsEditActivity.this.cantEditInfoRow) {
                    return 14L;
                }
                if (i == ChatRightsEditActivity.this.transferOwnerShadowRow) {
                    return 15L;
                }
                if (i == ChatRightsEditActivity.this.transferOwnerRow) {
                    return 16L;
                }
                if (i == ChatRightsEditActivity.this.rankHeaderRow) {
                    return 17L;
                }
                if (i == ChatRightsEditActivity.this.rankRow) {
                    return 18L;
                }
                if (i == ChatRightsEditActivity.this.rankInfoRow) {
                    return 19L;
                }
                if (i == ChatRightsEditActivity.this.sendMessagesRow) {
                    return 20L;
                }
                if (i == ChatRightsEditActivity.this.sendMediaRow) {
                    return 21L;
                }
                if (i == ChatRightsEditActivity.this.sendStickersRow) {
                    return 22L;
                }
                if (i == ChatRightsEditActivity.this.sendPollsRow) {
                    return 23L;
                }
                if (i == ChatRightsEditActivity.this.embedLinksRow) {
                    return 24L;
                }
                if (i == ChatRightsEditActivity.this.startVoiceChatRow) {
                    return 25L;
                }
                if (i == ChatRightsEditActivity.this.untilSectionRow) {
                    return 26L;
                }
                if (i == ChatRightsEditActivity.this.untilDateRow) {
                    return 27L;
                }
                return i == ChatRightsEditActivity.this.addBotButtonRow ? 28L : 0L;
            }
            return super.getItemId(i);
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            if (!ChatRightsEditActivity.this.currentChat.creator || !((ChatRightsEditActivity.this.currentType == 0 || (ChatRightsEditActivity.this.currentType == 2 && ChatRightsEditActivity.this.asAdmin)) && itemViewType == 4 && viewHolder.getAdapterPosition() == ChatRightsEditActivity.this.anonymousRow)) {
                if (!ChatRightsEditActivity.this.canEdit) {
                    return false;
                }
                if ((ChatRightsEditActivity.this.currentType == 0 || ChatRightsEditActivity.this.currentType == 2) && itemViewType == 4) {
                    int adapterPosition = viewHolder.getAdapterPosition();
                    if (adapterPosition == ChatRightsEditActivity.this.manageRow) {
                        if (ChatRightsEditActivity.this.myAdminRights.add_admins) {
                            return true;
                        }
                        return ChatRightsEditActivity.this.currentChat != null && ChatRightsEditActivity.this.currentChat.creator;
                    } else if (ChatRightsEditActivity.this.currentType == 2 && !ChatRightsEditActivity.this.asAdmin) {
                        return false;
                    } else {
                        if (adapterPosition == ChatRightsEditActivity.this.changeInfoRow) {
                            return ChatRightsEditActivity.this.myAdminRights.change_info && (ChatRightsEditActivity.this.defaultBannedRights == null || ChatRightsEditActivity.this.defaultBannedRights.change_info);
                        } else if (adapterPosition == ChatRightsEditActivity.this.postMessagesRow) {
                            return ChatRightsEditActivity.this.myAdminRights.post_messages;
                        } else {
                            if (adapterPosition == ChatRightsEditActivity.this.editMesagesRow) {
                                return ChatRightsEditActivity.this.myAdminRights.edit_messages;
                            }
                            if (adapterPosition == ChatRightsEditActivity.this.deleteMessagesRow) {
                                return ChatRightsEditActivity.this.myAdminRights.delete_messages;
                            }
                            if (adapterPosition == ChatRightsEditActivity.this.startVoiceChatRow) {
                                return ChatRightsEditActivity.this.myAdminRights.manage_call;
                            }
                            if (adapterPosition == ChatRightsEditActivity.this.addAdminsRow) {
                                return ChatRightsEditActivity.this.myAdminRights.add_admins;
                            }
                            if (adapterPosition == ChatRightsEditActivity.this.anonymousRow) {
                                return ChatRightsEditActivity.this.myAdminRights.anonymous;
                            }
                            if (adapterPosition == ChatRightsEditActivity.this.banUsersRow) {
                                return ChatRightsEditActivity.this.myAdminRights.ban_users;
                            }
                            if (adapterPosition == ChatRightsEditActivity.this.addUsersRow) {
                                return ChatRightsEditActivity.this.myAdminRights.invite_users;
                            }
                            if (adapterPosition == ChatRightsEditActivity.this.pinMessagesRow) {
                                return ChatRightsEditActivity.this.myAdminRights.pin_messages && (ChatRightsEditActivity.this.defaultBannedRights == null || ChatRightsEditActivity.this.defaultBannedRights.pin_messages);
                            }
                        }
                    }
                }
                return (itemViewType == 3 || itemViewType == 1 || itemViewType == 5 || itemViewType == 8) ? false : true;
            }
            return true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return ChatRightsEditActivity.this.rowCount;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            TextSettingsCell textSettingsCell;
            String str;
            int i2;
            switch (i) {
                case 0:
                    UserCell2 userCell2 = new UserCell2(this.mContext, 4, 0);
                    userCell2.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                    textSettingsCell = userCell2;
                    view = textSettingsCell;
                    break;
                case 1:
                    view = new TextInfoPrivacyCell(this.mContext);
                    view.setBackgroundDrawable(Theme.getThemedDrawable(this.mContext, 2131165436, "windowBackgroundGrayShadow"));
                    break;
                case 2:
                default:
                    TextSettingsCell textSettingsCell2 = new TextSettingsCell(this.mContext);
                    textSettingsCell2.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                    textSettingsCell = textSettingsCell2;
                    view = textSettingsCell;
                    break;
                case 3:
                    HeaderCell headerCell = new HeaderCell(this.mContext, "windowBackgroundWhiteBlueHeader", 21, 15, true);
                    headerCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                    textSettingsCell = headerCell;
                    view = textSettingsCell;
                    break;
                case 4:
                    TextCheckCell2 textCheckCell2 = new TextCheckCell2(this.mContext);
                    textCheckCell2.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                    textSettingsCell = textCheckCell2;
                    view = textSettingsCell;
                    break;
                case 5:
                    view = new ShadowSectionCell(this.mContext);
                    break;
                case 6:
                    TextDetailCell textDetailCell = new TextDetailCell(this.mContext);
                    textDetailCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                    textSettingsCell = textDetailCell;
                    view = textSettingsCell;
                    break;
                case 7:
                    PollEditTextCell pollEditTextCell = ChatRightsEditActivity.this.rankEditTextCell = new PollEditTextCell(this.mContext, null);
                    pollEditTextCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                    pollEditTextCell.addTextWatcher(new AnonymousClass1());
                    textSettingsCell = pollEditTextCell;
                    view = textSettingsCell;
                    break;
                case 8:
                    ChatRightsEditActivity.this.addBotButtonContainer = new FrameLayout(this.mContext);
                    ChatRightsEditActivity.this.addBotButtonContainer.setBackgroundColor(Theme.getColor("windowBackgroundGray"));
                    ChatRightsEditActivity.this.addBotButton = new FrameLayout(this.mContext);
                    ChatRightsEditActivity.this.addBotButtonText = new AnimatedTextView(this.mContext, true, false, false);
                    ChatRightsEditActivity.this.addBotButtonText.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
                    ChatRightsEditActivity.this.addBotButtonText.setTextColor(-1);
                    ChatRightsEditActivity.this.addBotButtonText.setTextSize(AndroidUtilities.dp(14.0f));
                    ChatRightsEditActivity.this.addBotButtonText.setGravity(17);
                    AnimatedTextView animatedTextView = ChatRightsEditActivity.this.addBotButtonText;
                    StringBuilder sb = new StringBuilder();
                    sb.append(LocaleController.getString("AddBotButton", 2131624258));
                    sb.append(" ");
                    if (ChatRightsEditActivity.this.asAdmin) {
                        i2 = 2131624259;
                        str = "AddBotButtonAsAdmin";
                    } else {
                        i2 = 2131624260;
                        str = "AddBotButtonAsMember";
                    }
                    sb.append(LocaleController.getString(str, i2));
                    animatedTextView.setText(sb.toString());
                    ChatRightsEditActivity.this.addBotButton.addView(ChatRightsEditActivity.this.addBotButtonText, LayoutHelper.createFrame(-2, -2, 17));
                    ChatRightsEditActivity.this.addBotButton.setBackground(Theme.AdaptiveRipple.filledRect("featuredStickers_addButton", 4.0f));
                    ChatRightsEditActivity.this.addBotButton.setOnClickListener(new ChatRightsEditActivity$ListAdapter$$ExternalSyntheticLambda0(this));
                    ChatRightsEditActivity.this.addBotButtonContainer.addView(ChatRightsEditActivity.this.addBotButton, LayoutHelper.createFrame(-1, 48.0f, 119, 14.0f, 28.0f, 14.0f, 14.0f));
                    ChatRightsEditActivity.this.addBotButtonContainer.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                    View view2 = new View(this.mContext);
                    view2.setBackgroundColor(Theme.getColor("windowBackgroundGray"));
                    ChatRightsEditActivity.this.addBotButtonContainer.setClipChildren(false);
                    ChatRightsEditActivity.this.addBotButtonContainer.setClipToPadding(false);
                    ChatRightsEditActivity.this.addBotButtonContainer.addView(view2, LayoutHelper.createFrame(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                    view = ChatRightsEditActivity.this.addBotButtonContainer;
                    break;
            }
            return new RecyclerListView.Holder(view);
        }

        public /* synthetic */ void lambda$onCreateViewHolder$0(View view) {
            ChatRightsEditActivity.this.onDonePressed();
        }

        /* renamed from: org.telegram.ui.ChatRightsEditActivity$ListAdapter$1 */
        /* loaded from: classes3.dex */
        class AnonymousClass1 implements TextWatcher {
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            AnonymousClass1() {
                ListAdapter.this = r1;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (ListAdapter.this.ignoreTextChange) {
                    return;
                }
                ChatRightsEditActivity.this.currentRank = editable.toString();
                RecyclerView.ViewHolder findViewHolderForAdapterPosition = ChatRightsEditActivity.this.listView.findViewHolderForAdapterPosition(ChatRightsEditActivity.this.rankHeaderRow);
                if (findViewHolderForAdapterPosition == null) {
                    return;
                }
                ChatRightsEditActivity.this.setTextLeft(findViewHolderForAdapterPosition.itemView);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String str;
            String str2;
            String str3;
            boolean z = true;
            switch (viewHolder.getItemViewType()) {
                case 0:
                    ((UserCell2) viewHolder.itemView).setData(ChatRightsEditActivity.this.currentUser, null, ChatRightsEditActivity.this.currentType == 2 ? LocaleController.getString("Bot", 2131624715) : null, 0);
                    return;
                case 1:
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                    if (i != ChatRightsEditActivity.this.cantEditInfoRow) {
                        if (i != ChatRightsEditActivity.this.rankInfoRow) {
                            return;
                        }
                        if (UserObject.isUserSelf(ChatRightsEditActivity.this.currentUser) && ChatRightsEditActivity.this.currentChat.creator) {
                            str = LocaleController.getString("ChannelCreator", 2131624907);
                        } else {
                            str = LocaleController.getString("ChannelAdmin", 2131624888);
                        }
                        textInfoPrivacyCell.setText(LocaleController.formatString("EditAdminRankInfo", 2131625571, str));
                        return;
                    }
                    textInfoPrivacyCell.setText(LocaleController.getString("EditAdminCantEdit", 2131625559));
                    return;
                case 2:
                    TextSettingsCell textSettingsCell = (TextSettingsCell) viewHolder.itemView;
                    if (i != ChatRightsEditActivity.this.removeAdminRow) {
                        if (i != ChatRightsEditActivity.this.transferOwnerRow) {
                            return;
                        }
                        textSettingsCell.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
                        textSettingsCell.setTag("windowBackgroundWhiteBlackText");
                        if (ChatRightsEditActivity.this.isChannel) {
                            textSettingsCell.setText(LocaleController.getString("EditAdminChannelTransfer", 2131625562), false);
                            return;
                        } else {
                            textSettingsCell.setText(LocaleController.getString("EditAdminGroupTransfer", 2131625566), false);
                            return;
                        }
                    }
                    textSettingsCell.setTextColor(Theme.getColor("windowBackgroundWhiteRedText5"));
                    textSettingsCell.setTag("windowBackgroundWhiteRedText5");
                    if (ChatRightsEditActivity.this.currentType != 0) {
                        if (ChatRightsEditActivity.this.currentType != 1) {
                            return;
                        }
                        textSettingsCell.setText(LocaleController.getString("UserRestrictionsBlock", 2131628886), false);
                        return;
                    }
                    textSettingsCell.setText(LocaleController.getString("EditAdminRemoveAdmin", 2131625572), false);
                    return;
                case 3:
                    HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                    if (i == 2) {
                        if (ChatRightsEditActivity.this.currentType != 2 && (ChatRightsEditActivity.this.currentUser == null || !ChatRightsEditActivity.this.currentUser.bot)) {
                            if (ChatRightsEditActivity.this.currentType != 0) {
                                if (ChatRightsEditActivity.this.currentType != 1) {
                                    return;
                                }
                                headerCell.setText(LocaleController.getString("UserRestrictionsCanDo", 2131628887));
                                return;
                            }
                            headerCell.setText(LocaleController.getString("EditAdminWhatCanDo", 2131625585));
                            return;
                        }
                        headerCell.setText(LocaleController.getString("BotRestrictionsCanDo", 2131624742));
                        return;
                    } else if (i != ChatRightsEditActivity.this.rankHeaderRow) {
                        return;
                    } else {
                        headerCell.setText(LocaleController.getString("EditAdminRank", 2131625570));
                        return;
                    }
                case 4:
                    TextCheckCell2 textCheckCell2 = (TextCheckCell2) viewHolder.itemView;
                    boolean z2 = ChatRightsEditActivity.this.currentType != 2 || ChatRightsEditActivity.this.asAdmin;
                    boolean z3 = ChatRightsEditActivity.this.currentChat != null && ChatRightsEditActivity.this.currentChat.creator;
                    int i2 = 2131166035;
                    if (i == ChatRightsEditActivity.this.manageRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString("ManageGroup", 2131626576), ChatRightsEditActivity.this.asAdmin, true);
                        if (ChatRightsEditActivity.this.myAdminRights.add_admins || z3) {
                            i2 = 0;
                        }
                        textCheckCell2.setIcon(i2);
                    } else if (i == ChatRightsEditActivity.this.changeInfoRow) {
                        if (ChatRightsEditActivity.this.currentType == 0 || ChatRightsEditActivity.this.currentType == 2) {
                            if (ChatRightsEditActivity.this.isChannel) {
                                textCheckCell2.setTextAndCheck(LocaleController.getString("EditAdminChangeChannelInfo", 2131625560), (z2 && ChatRightsEditActivity.this.adminRights.change_info) || !ChatRightsEditActivity.this.defaultBannedRights.change_info, true);
                            } else {
                                textCheckCell2.setTextAndCheck(LocaleController.getString("EditAdminChangeGroupInfo", 2131625561), (z2 && ChatRightsEditActivity.this.adminRights.change_info) || !ChatRightsEditActivity.this.defaultBannedRights.change_info, true);
                            }
                            if (ChatRightsEditActivity.this.currentType == 2) {
                                if (ChatRightsEditActivity.this.myAdminRights.change_info || z3) {
                                    i2 = 0;
                                }
                                textCheckCell2.setIcon(i2);
                            }
                        } else if (ChatRightsEditActivity.this.currentType == 1) {
                            textCheckCell2.setTextAndCheck(LocaleController.getString("UserRestrictionsChangeInfo", 2131628891), !ChatRightsEditActivity.this.bannedRights.change_info && !ChatRightsEditActivity.this.defaultBannedRights.change_info, false);
                            if (!ChatRightsEditActivity.this.defaultBannedRights.change_info) {
                                i2 = 0;
                            }
                            textCheckCell2.setIcon(i2);
                        }
                    } else if (i == ChatRightsEditActivity.this.postMessagesRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString("EditAdminPostMessages", 2131625568), z2 && ChatRightsEditActivity.this.adminRights.post_messages, true);
                        if (ChatRightsEditActivity.this.currentType == 2) {
                            if (ChatRightsEditActivity.this.myAdminRights.post_messages || z3) {
                                i2 = 0;
                            }
                            textCheckCell2.setIcon(i2);
                        }
                    } else if (i == ChatRightsEditActivity.this.editMesagesRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString("EditAdminEditMessages", 2131625564), z2 && ChatRightsEditActivity.this.adminRights.edit_messages, true);
                        if (ChatRightsEditActivity.this.currentType == 2) {
                            if (ChatRightsEditActivity.this.myAdminRights.edit_messages || z3) {
                                i2 = 0;
                            }
                            textCheckCell2.setIcon(i2);
                        }
                    } else if (i == ChatRightsEditActivity.this.deleteMessagesRow) {
                        if (ChatRightsEditActivity.this.isChannel) {
                            textCheckCell2.setTextAndCheck(LocaleController.getString("EditAdminDeleteMessages", 2131625563), z2 && ChatRightsEditActivity.this.adminRights.delete_messages, true);
                        } else {
                            textCheckCell2.setTextAndCheck(LocaleController.getString("EditAdminGroupDeleteMessages", 2131625565), z2 && ChatRightsEditActivity.this.adminRights.delete_messages, true);
                        }
                        if (ChatRightsEditActivity.this.currentType == 2) {
                            if (ChatRightsEditActivity.this.myAdminRights.delete_messages || z3) {
                                i2 = 0;
                            }
                            textCheckCell2.setIcon(i2);
                        }
                    } else if (i == ChatRightsEditActivity.this.addAdminsRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString("EditAdminAddAdmins", 2131625555), z2 && ChatRightsEditActivity.this.adminRights.add_admins, ChatRightsEditActivity.this.anonymousRow != -1);
                        if (ChatRightsEditActivity.this.currentType == 2) {
                            if (ChatRightsEditActivity.this.myAdminRights.add_admins || z3) {
                                i2 = 0;
                            }
                            textCheckCell2.setIcon(i2);
                        }
                    } else if (i == ChatRightsEditActivity.this.anonymousRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString("EditAdminSendAnonymously", 2131625574), z2 && ChatRightsEditActivity.this.adminRights.anonymous, false);
                        if (ChatRightsEditActivity.this.currentType == 2) {
                            if (ChatRightsEditActivity.this.myAdminRights.anonymous || z3) {
                                i2 = 0;
                            }
                            textCheckCell2.setIcon(i2);
                        }
                    } else if (i == ChatRightsEditActivity.this.banUsersRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString("EditAdminBanUsers", 2131625558), z2 && ChatRightsEditActivity.this.adminRights.ban_users, true);
                        if (ChatRightsEditActivity.this.currentType == 2) {
                            if (ChatRightsEditActivity.this.myAdminRights.ban_users || z3) {
                                i2 = 0;
                            }
                            textCheckCell2.setIcon(i2);
                        }
                    } else if (i == ChatRightsEditActivity.this.startVoiceChatRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString("StartVoipChatPermission", 2131628491), z2 && ChatRightsEditActivity.this.adminRights.manage_call, true);
                        if (ChatRightsEditActivity.this.currentType == 2) {
                            if (ChatRightsEditActivity.this.myAdminRights.manage_call || z3) {
                                i2 = 0;
                            }
                            textCheckCell2.setIcon(i2);
                        }
                    } else if (i == ChatRightsEditActivity.this.addUsersRow) {
                        if (ChatRightsEditActivity.this.currentType == 0) {
                            if (ChatObject.isActionBannedByDefault(ChatRightsEditActivity.this.currentChat, 3)) {
                                textCheckCell2.setTextAndCheck(LocaleController.getString("EditAdminAddUsers", 2131625556), ChatRightsEditActivity.this.adminRights.invite_users, true);
                            } else {
                                textCheckCell2.setTextAndCheck(LocaleController.getString("EditAdminAddUsersViaLink", 2131625557), ChatRightsEditActivity.this.adminRights.invite_users, true);
                            }
                        } else if (ChatRightsEditActivity.this.currentType == 1) {
                            textCheckCell2.setTextAndCheck(LocaleController.getString("UserRestrictionsInviteUsers", 2131628896), !ChatRightsEditActivity.this.bannedRights.invite_users && !ChatRightsEditActivity.this.defaultBannedRights.invite_users, true);
                            if (!ChatRightsEditActivity.this.defaultBannedRights.invite_users) {
                                i2 = 0;
                            }
                            textCheckCell2.setIcon(i2);
                        } else if (ChatRightsEditActivity.this.currentType == 2) {
                            textCheckCell2.setTextAndCheck(LocaleController.getString("EditAdminAddUsersViaLink", 2131625557), z2 && ChatRightsEditActivity.this.adminRights.invite_users, true);
                            if (ChatRightsEditActivity.this.myAdminRights.invite_users || z3) {
                                i2 = 0;
                            }
                            textCheckCell2.setIcon(i2);
                        }
                    } else if (i == ChatRightsEditActivity.this.pinMessagesRow) {
                        if (ChatRightsEditActivity.this.currentType == 0 || ChatRightsEditActivity.this.currentType == 2) {
                            textCheckCell2.setTextAndCheck(LocaleController.getString("EditAdminPinMessages", 2131625567), (z2 && ChatRightsEditActivity.this.adminRights.pin_messages) || !ChatRightsEditActivity.this.defaultBannedRights.pin_messages, true);
                            if (ChatRightsEditActivity.this.currentType == 2) {
                                if (ChatRightsEditActivity.this.myAdminRights.pin_messages || z3) {
                                    i2 = 0;
                                }
                                textCheckCell2.setIcon(i2);
                            }
                        } else if (ChatRightsEditActivity.this.currentType == 1) {
                            textCheckCell2.setTextAndCheck(LocaleController.getString("UserRestrictionsPinMessages", 2131628906), !ChatRightsEditActivity.this.bannedRights.pin_messages && !ChatRightsEditActivity.this.defaultBannedRights.pin_messages, true);
                            if (!ChatRightsEditActivity.this.defaultBannedRights.pin_messages) {
                                i2 = 0;
                            }
                            textCheckCell2.setIcon(i2);
                        }
                    } else if (i == ChatRightsEditActivity.this.sendMessagesRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString("UserRestrictionsSend", 2131628908), !ChatRightsEditActivity.this.bannedRights.send_messages && !ChatRightsEditActivity.this.defaultBannedRights.send_messages, true);
                        if (!ChatRightsEditActivity.this.defaultBannedRights.send_messages) {
                            i2 = 0;
                        }
                        textCheckCell2.setIcon(i2);
                    } else if (i == ChatRightsEditActivity.this.sendMediaRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString("UserRestrictionsSendMedia", 2131628909), !ChatRightsEditActivity.this.bannedRights.send_media && !ChatRightsEditActivity.this.defaultBannedRights.send_media, true);
                        if (!ChatRightsEditActivity.this.defaultBannedRights.send_media) {
                            i2 = 0;
                        }
                        textCheckCell2.setIcon(i2);
                    } else if (i == ChatRightsEditActivity.this.sendStickersRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString("UserRestrictionsSendStickers", 2131628911), !ChatRightsEditActivity.this.bannedRights.send_stickers && !ChatRightsEditActivity.this.defaultBannedRights.send_stickers, true);
                        if (!ChatRightsEditActivity.this.defaultBannedRights.send_stickers) {
                            i2 = 0;
                        }
                        textCheckCell2.setIcon(i2);
                    } else if (i == ChatRightsEditActivity.this.embedLinksRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString("UserRestrictionsEmbedLinks", 2131628895), !ChatRightsEditActivity.this.bannedRights.embed_links && !ChatRightsEditActivity.this.defaultBannedRights.embed_links, true);
                        if (!ChatRightsEditActivity.this.defaultBannedRights.embed_links) {
                            i2 = 0;
                        }
                        textCheckCell2.setIcon(i2);
                    } else if (i == ChatRightsEditActivity.this.sendPollsRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString("UserRestrictionsSendPolls", 2131628910), !ChatRightsEditActivity.this.bannedRights.send_polls && !ChatRightsEditActivity.this.defaultBannedRights.send_polls, true);
                        if (!ChatRightsEditActivity.this.defaultBannedRights.send_polls) {
                            i2 = 0;
                        }
                        textCheckCell2.setIcon(i2);
                    }
                    if (ChatRightsEditActivity.this.currentType == 2) {
                        return;
                    }
                    if (i == ChatRightsEditActivity.this.sendMediaRow || i == ChatRightsEditActivity.this.sendStickersRow || i == ChatRightsEditActivity.this.embedLinksRow || i == ChatRightsEditActivity.this.sendPollsRow) {
                        if (ChatRightsEditActivity.this.bannedRights.send_messages || ChatRightsEditActivity.this.bannedRights.view_messages || ChatRightsEditActivity.this.defaultBannedRights.send_messages || ChatRightsEditActivity.this.defaultBannedRights.view_messages) {
                            z = false;
                        }
                        textCheckCell2.setEnabled(z);
                        return;
                    } else if (i != ChatRightsEditActivity.this.sendMessagesRow) {
                        return;
                    } else {
                        if (ChatRightsEditActivity.this.bannedRights.view_messages || ChatRightsEditActivity.this.defaultBannedRights.view_messages) {
                            z = false;
                        }
                        textCheckCell2.setEnabled(z);
                        return;
                    }
                case 5:
                    ShadowSectionCell shadowSectionCell = (ShadowSectionCell) viewHolder.itemView;
                    if (ChatRightsEditActivity.this.currentType == 2 && (i == ChatRightsEditActivity.this.rightsShadowRow || i == ChatRightsEditActivity.this.rankInfoRow)) {
                        shadowSectionCell.setAlpha(ChatRightsEditActivity.this.asAdminT);
                    } else {
                        shadowSectionCell.setAlpha(1.0f);
                    }
                    int i3 = 2131165435;
                    if (i != ChatRightsEditActivity.this.rightsShadowRow) {
                        if (i != ChatRightsEditActivity.this.removeAdminShadowRow) {
                            if (i == ChatRightsEditActivity.this.rankInfoRow) {
                                Context context = this.mContext;
                                if (!ChatRightsEditActivity.this.canEdit) {
                                    i3 = 2131165436;
                                }
                                shadowSectionCell.setBackgroundDrawable(Theme.getThemedDrawable(context, i3, "windowBackgroundGrayShadow"));
                                return;
                            }
                            shadowSectionCell.setBackgroundDrawable(Theme.getThemedDrawable(this.mContext, 2131165435, "windowBackgroundGrayShadow"));
                            return;
                        }
                        shadowSectionCell.setBackgroundDrawable(Theme.getThemedDrawable(this.mContext, 2131165436, "windowBackgroundGrayShadow"));
                        return;
                    }
                    Context context2 = this.mContext;
                    if (ChatRightsEditActivity.this.removeAdminRow == -1 && ChatRightsEditActivity.this.rankRow == -1) {
                        i3 = 2131165436;
                    }
                    shadowSectionCell.setBackgroundDrawable(Theme.getThemedDrawable(context2, i3, "windowBackgroundGrayShadow"));
                    return;
                case 6:
                    TextDetailCell textDetailCell = (TextDetailCell) viewHolder.itemView;
                    if (i != ChatRightsEditActivity.this.untilDateRow) {
                        return;
                    }
                    if (ChatRightsEditActivity.this.bannedRights.until_date != 0 && Math.abs(ChatRightsEditActivity.this.bannedRights.until_date - (System.currentTimeMillis() / 1000)) <= 315360000) {
                        str2 = LocaleController.formatDateForBan(ChatRightsEditActivity.this.bannedRights.until_date);
                    } else {
                        str2 = LocaleController.getString("UserRestrictionsUntilForever", 2131628912);
                    }
                    textDetailCell.setTextAndValue(LocaleController.getString("UserRestrictionsDuration", 2131628894), str2, false);
                    return;
                case 7:
                    PollEditTextCell pollEditTextCell = (PollEditTextCell) viewHolder.itemView;
                    if (UserObject.isUserSelf(ChatRightsEditActivity.this.currentUser) && ChatRightsEditActivity.this.currentChat.creator) {
                        str3 = LocaleController.getString("ChannelCreator", 2131624907);
                    } else {
                        str3 = LocaleController.getString("ChannelAdmin", 2131624888);
                    }
                    this.ignoreTextChange = true;
                    pollEditTextCell.getTextView().setEnabled(ChatRightsEditActivity.this.canEdit || ChatRightsEditActivity.this.currentChat.creator);
                    pollEditTextCell.getTextView().setSingleLine(true);
                    pollEditTextCell.getTextView().setImeOptions(6);
                    pollEditTextCell.setTextAndHint(ChatRightsEditActivity.this.currentRank, str3, false);
                    this.ignoreTextChange = false;
                    return;
                default:
                    return;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getAdapterPosition() == ChatRightsEditActivity.this.rankHeaderRow) {
                ChatRightsEditActivity.this.setTextLeft(viewHolder.itemView);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getAdapterPosition() != ChatRightsEditActivity.this.rankRow || ChatRightsEditActivity.this.getParentActivity() == null) {
                return;
            }
            AndroidUtilities.hideKeyboard(ChatRightsEditActivity.this.getParentActivity().getCurrentFocus());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            if (i == 0) {
                return 0;
            }
            if (i == 1 || i == ChatRightsEditActivity.this.rightsShadowRow || i == ChatRightsEditActivity.this.removeAdminShadowRow || i == ChatRightsEditActivity.this.untilSectionRow || i == ChatRightsEditActivity.this.transferOwnerShadowRow) {
                return 5;
            }
            if (i == 2 || i == ChatRightsEditActivity.this.rankHeaderRow) {
                return 3;
            }
            if (i == ChatRightsEditActivity.this.changeInfoRow || i == ChatRightsEditActivity.this.postMessagesRow || i == ChatRightsEditActivity.this.editMesagesRow || i == ChatRightsEditActivity.this.deleteMessagesRow || i == ChatRightsEditActivity.this.addAdminsRow || i == ChatRightsEditActivity.this.banUsersRow || i == ChatRightsEditActivity.this.addUsersRow || i == ChatRightsEditActivity.this.pinMessagesRow || i == ChatRightsEditActivity.this.sendMessagesRow || i == ChatRightsEditActivity.this.sendMediaRow || i == ChatRightsEditActivity.this.sendStickersRow || i == ChatRightsEditActivity.this.embedLinksRow || i == ChatRightsEditActivity.this.sendPollsRow || i == ChatRightsEditActivity.this.anonymousRow || i == ChatRightsEditActivity.this.startVoiceChatRow || i == ChatRightsEditActivity.this.manageRow) {
                return 4;
            }
            if (i == ChatRightsEditActivity.this.cantEditInfoRow || i == ChatRightsEditActivity.this.rankInfoRow) {
                return 1;
            }
            if (i == ChatRightsEditActivity.this.untilDateRow) {
                return 6;
            }
            if (i == ChatRightsEditActivity.this.rankRow) {
                return 7;
            }
            return i == ChatRightsEditActivity.this.addBotButtonRow ? 8 : 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0064, code lost:
        if (r5.creator == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007d, code lost:
        if (r8.defaultBannedRights.change_info != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d6, code lost:
        if (r8.defaultBannedRights.pin_messages != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0107, code lost:
        if (r5.creator == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void updateAsAdmin(boolean z) {
        String str;
        int i;
        FrameLayout frameLayout = this.addBotButton;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
        int childCount = this.listView.getChildCount();
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= childCount) {
                break;
            }
            View childAt = this.listView.getChildAt(i2);
            int childAdapterPosition = this.listView.getChildAdapterPosition(childAt);
            if (childAt instanceof TextCheckCell2) {
                boolean z3 = this.asAdmin;
                if (!z3) {
                    if ((childAdapterPosition == this.changeInfoRow && !this.defaultBannedRights.change_info) || (childAdapterPosition == this.pinMessagesRow && !this.defaultBannedRights.pin_messages)) {
                        TextCheckCell2 textCheckCell2 = (TextCheckCell2) childAt;
                        textCheckCell2.setChecked(true);
                        textCheckCell2.setEnabled(false, false);
                    } else {
                        TextCheckCell2 textCheckCell22 = (TextCheckCell2) childAt;
                        textCheckCell22.setChecked(false);
                        if (childAdapterPosition != this.manageRow) {
                            z2 = false;
                        }
                        textCheckCell22.setEnabled(z2, z);
                    }
                } else if (childAdapterPosition == this.manageRow) {
                    if (!this.myAdminRights.add_admins) {
                        TLRPC$Chat tLRPC$Chat = this.currentChat;
                        if (tLRPC$Chat != null) {
                        }
                        z2 = false;
                    }
                    TextCheckCell2 textCheckCell23 = (TextCheckCell2) childAt;
                    textCheckCell23.setChecked(z3);
                    textCheckCell23.setEnabled(z2, z);
                } else if (childAdapterPosition == this.changeInfoRow) {
                    z3 = this.adminRights.change_info;
                    if (this.myAdminRights.change_info) {
                    }
                    z2 = false;
                    TextCheckCell2 textCheckCell232 = (TextCheckCell2) childAt;
                    textCheckCell232.setChecked(z3);
                    textCheckCell232.setEnabled(z2, z);
                } else {
                    if (childAdapterPosition == this.postMessagesRow) {
                        z3 = this.adminRights.post_messages;
                        z2 = this.myAdminRights.post_messages;
                    } else if (childAdapterPosition == this.editMesagesRow) {
                        z3 = this.adminRights.edit_messages;
                        z2 = this.myAdminRights.edit_messages;
                    } else if (childAdapterPosition == this.deleteMessagesRow) {
                        z3 = this.adminRights.delete_messages;
                        z2 = this.myAdminRights.delete_messages;
                    } else if (childAdapterPosition == this.banUsersRow) {
                        z3 = this.adminRights.ban_users;
                        z2 = this.myAdminRights.ban_users;
                    } else if (childAdapterPosition == this.addUsersRow) {
                        z3 = this.adminRights.invite_users;
                        z2 = this.myAdminRights.invite_users;
                    } else if (childAdapterPosition == this.pinMessagesRow) {
                        z3 = this.adminRights.pin_messages;
                        if (this.myAdminRights.pin_messages) {
                        }
                        z2 = false;
                    } else if (childAdapterPosition == this.startVoiceChatRow) {
                        z3 = this.adminRights.manage_call;
                        z2 = this.myAdminRights.manage_call;
                    } else if (childAdapterPosition == this.addAdminsRow) {
                        z3 = this.adminRights.add_admins;
                        z2 = this.myAdminRights.add_admins;
                    } else if (childAdapterPosition == this.anonymousRow) {
                        z3 = this.adminRights.anonymous;
                        if (!this.myAdminRights.anonymous) {
                            TLRPC$Chat tLRPC$Chat2 = this.currentChat;
                            if (tLRPC$Chat2 != null) {
                            }
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                        z3 = false;
                    }
                    TextCheckCell2 textCheckCell2322 = (TextCheckCell2) childAt;
                    textCheckCell2322.setChecked(z3);
                    textCheckCell2322.setEnabled(z2, z);
                }
            }
            i2++;
        }
        this.listViewAdapter.notifyDataSetChanged();
        AnimatedTextView animatedTextView = this.addBotButtonText;
        if (animatedTextView != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(LocaleController.getString("AddBotButton", 2131624258));
            sb.append(" ");
            if (this.asAdmin) {
                i = 2131624259;
                str = "AddBotButtonAsAdmin";
            } else {
                i = 2131624260;
                str = "AddBotButtonAsMember";
            }
            sb.append(LocaleController.getString(str, i));
            animatedTextView.setText(sb.toString(), z, this.asAdmin);
        }
        ValueAnimator valueAnimator = this.asAdminAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.asAdminAnimator = null;
        }
        float f = 1.0f;
        if (z) {
            float[] fArr = new float[2];
            fArr[0] = this.asAdminT;
            fArr[1] = this.asAdmin ? 1.0f : 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            this.asAdminAnimator = ofFloat;
            ofFloat.addUpdateListener(new ChatRightsEditActivity$$ExternalSyntheticLambda1(this));
            ValueAnimator valueAnimator2 = this.asAdminAnimator;
            float f2 = this.asAdminT;
            if (!this.asAdmin) {
                f = 0.0f;
            }
            valueAnimator2.setDuration(Math.abs(f2 - f) * 200.0f);
            this.asAdminAnimator.start();
            return;
        }
        if (!this.asAdmin) {
            f = 0.0f;
        }
        this.asAdminT = f;
        FrameLayout frameLayout2 = this.addBotButton;
        if (frameLayout2 == null) {
            return;
        }
        frameLayout2.invalidate();
    }

    public /* synthetic */ void lambda$updateAsAdmin$25(ValueAnimator valueAnimator) {
        this.asAdminT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        FrameLayout frameLayout = this.addBotButton;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        ChatRightsEditActivity$$ExternalSyntheticLambda24 chatRightsEditActivity$$ExternalSyntheticLambda24 = new ChatRightsEditActivity$$ExternalSyntheticLambda24(this);
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{UserCell2.class, TextSettingsCell.class, TextCheckCell2.class, HeaderCell.class, TextDetailCell.class, PollEditTextCell.class}, null, null, null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundGray"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "actionBarDefault"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, "actionBarDefault"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, "actionBarDefaultIcon"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, "actionBarDefaultTitle"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, "actionBarDefaultSelector"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, "listSelectorSDK21"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, "divider"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, "windowBackgroundGrayShadow"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText4"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteRedText5"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteValueText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueImageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayIcon"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextDetailCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextDetailCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText2"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell2.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell2.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText2"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell2.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "switch2Track"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell2.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "switch2TrackChecked"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, "windowBackgroundGrayShadow"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlueHeader"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{HeaderCell.class}, new String[]{"textView2"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteRedText5"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{HeaderCell.class}, new String[]{"textView2"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText3"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{PollEditTextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_HINTTEXTCOLOR, new Class[]{PollEditTextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteHintText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell2.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell2.class}, new String[]{"statusColor"}, (Paint[]) null, (Drawable[]) null, chatRightsEditActivity$$ExternalSyntheticLambda24, "windowBackgroundWhiteGrayText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell2.class}, new String[]{"statusOnlineColor"}, (Paint[]) null, (Drawable[]) null, chatRightsEditActivity$$ExternalSyntheticLambda24, "windowBackgroundWhiteBlueText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell2.class}, null, Theme.avatarDrawables, null, "avatar_text"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatRightsEditActivity$$ExternalSyntheticLambda24, "avatar_backgroundRed"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatRightsEditActivity$$ExternalSyntheticLambda24, "avatar_backgroundOrange"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatRightsEditActivity$$ExternalSyntheticLambda24, "avatar_backgroundViolet"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatRightsEditActivity$$ExternalSyntheticLambda24, "avatar_backgroundGreen"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatRightsEditActivity$$ExternalSyntheticLambda24, "avatar_backgroundCyan"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatRightsEditActivity$$ExternalSyntheticLambda24, "avatar_backgroundBlue"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatRightsEditActivity$$ExternalSyntheticLambda24, "avatar_backgroundPink"));
        arrayList.add(new ThemeDescription((View) null, 0, new Class[]{DialogRadioCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "dialogTextBlack"));
        arrayList.add(new ThemeDescription((View) null, 0, new Class[]{DialogRadioCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "dialogTextGray2"));
        arrayList.add(new ThemeDescription((View) null, ThemeDescription.FLAG_CHECKBOX, new Class[]{DialogRadioCell.class}, new String[]{"radioButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "dialogRadioBackground"));
        arrayList.add(new ThemeDescription((View) null, ThemeDescription.FLAG_CHECKBOXCHECK, new Class[]{DialogRadioCell.class}, new String[]{"radioButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "dialogRadioBackgroundChecked"));
        return arrayList;
    }

    public /* synthetic */ void lambda$getThemeDescriptions$26() {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null) {
            int childCount = recyclerListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.listView.getChildAt(i);
                if (childAt instanceof UserCell2) {
                    ((UserCell2) childAt).update(0);
                }
            }
        }
    }
}
