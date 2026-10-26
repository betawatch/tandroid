package di;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sh0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.nr;
import org.telegram.ui.sr;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class h4 extends js {
    public boolean c;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 d;
    public final /* synthetic */ y9 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Context i;
    public final /* synthetic */ n4 j;
    public final /* synthetic */ boolean[] k;
    public final /* synthetic */ q4 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(q4 q4Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, org.telegram.ui.ActionBar.u6 u6Var2, y9 y9Var, boolean z10, boolean z11, boolean z12, Context context2, n4 n4Var, boolean[] zArr) {
        super(context, u6Var, true);
        this.l = q4Var;
        this.d = u6Var2;
        this.e = y9Var;
        this.f = z10;
        this.g = z11;
        this.h = z12;
        this.i = context2;
        this.j = n4Var;
        this.k = zArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:249:0x0150, code lost:
    
        if (r7.stories_hidden != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0139, code lost:
    
        if (r15.stories_hidden != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x013b, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x08a0, code lost:
    
        if (r2.bot_can_edit == false) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x08ce, code lost:
    
        if (r2.delete_stories == false) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x08d9, code lost:
    
        if (r0.delete_stories == false) goto L343;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03da  */
    /* JADX WARN: Type inference failed for: r4v90, types: [org.telegram.tgnet.TLRPC$User] */
    @Override // org.telegram.ui.Components.js
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        org.telegram.ui.ActionBar.u6 u6Var;
        final h4 h4Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        TL_stories.StoryItem storyItem;
        boolean z10;
        boolean z11;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3;
        y9 y9Var;
        y9 y9Var2;
        final y9 y9Var3;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout5;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout6;
        h1 h1Var;
        TLRPC.GroupCall groupCall;
        h1 h1Var2;
        Integer num;
        ArrayList arrayList;
        fi.w7 w7Var;
        org.telegram.ui.Components.c6[] c6VarArr;
        Integer num2;
        TL_stories.MediaArea mediaArea;
        TLRPC.InputStickerSet inputStickerSet;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        TLRPC.InputStickerSet inputStickerSet2;
        TL_stories.StoryItem storyItem2;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Photo photo;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        TLRPC.User user;
        org.telegram.ui.ActionBar.u6 u6Var2;
        y9 y9Var4;
        final y9 y9Var5;
        int i10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout7;
        TL_stories.StoryItem storyItem3;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout8;
        TLRPC.User user2;
        TLRPC.Chat chat3;
        boolean z12;
        boolean z13;
        Integer num3 = 1;
        q4 q4Var = this.l;
        o4 o4Var = q4Var.D1;
        boolean z14 = this.g;
        Context context = this.i;
        y9 y9Var6 = this.e;
        org.telegram.ui.ActionBar.u6 u6Var3 = this.d;
        if (z14 || o4Var.b != null) {
            u6Var = u6Var3;
            h4Var = this;
            TL_stories.StoryItem storyItem4 = o4Var.a;
            if (o4Var.b != null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_cancel, LocaleController.getString(R.string.Cancel), false, h4Var.d).setOnClickListener(new v3(h4Var, 6));
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            }
            if (storyItem4 == null) {
                return;
            }
            if (!(q4Var.r1 || q4Var.H1.h(q4Var.q1)) || o4Var.f || (storyItem = o4Var.a) == null) {
                z10 = true;
            } else {
                HashSet hashSet = storyItem.albums != null ? new HashSet(storyItem.albums) : new HashSet();
                k80 k80Var = new k80(actionBarPopupWindow$ActionBarPopupWindowLayout2, u6Var);
                k80Var.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new bi.u6(actionBarPopupWindow$ActionBarPopupWindowLayout2, 19), false);
                k80Var.k();
                v6 B = q4Var.getStoriesController().B(q4Var.q1, true);
                v6 B2 = q4Var.H1.B(q4Var.q1, false);
                k80.f(k80Var, B, hashSet, B2 != null && B2.a(), new a3.l0(h4Var, u6Var, storyItem, 22), new y2(h4Var, hashSet, storyItem, u6Var, 2));
                int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout2.b(k80Var.B);
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, q4Var.getContext(), h4Var.d, false, false);
                q4Var.t3 = g1Var;
                g1Var.j(LocaleController.getString(R.string.StoriesAlbumAddToAlbum), R.drawable.menu_album_add, null);
                org.telegram.ui.ActionBar.g1 g1Var2 = q4Var.t3;
                g1Var2.P = new a4(actionBarPopupWindow$ActionBarPopupWindowLayout2, b10, 1);
                g1Var2.setOnClickListener(new v3(h4Var, 12));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(q4Var.t3);
                z10 = true;
                actionBarPopupWindow$ActionBarPopupWindowLayout2.c = true;
                org.telegram.ui.ActionBar.l1 l1Var = new org.telegram.ui.ActionBar.l1(q4Var.getContext(), org.telegram.ui.ActionBar.y6.H8, u6Var);
                l1Var.setTag(R.id.fit_width_tag, num3);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(l1Var, gb1.r(-1, 8));
            }
            if (q4Var.r1) {
                z11 = z10;
                fi.l9 l9Var = storyItem4.privacy.isEmpty() ? new fi.l9(3, q4Var.r2, new ArrayList()) : new fi.l9(q4Var.r2, storyItem4.privacy);
                actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, R.drawable.msg_view_file, LocaleController.getString(R.string.WhoCanSee), false, h4Var.d);
                c10.setSubtext(l9Var.toString());
                c10.setOnClickListener(new bi.w0(h4Var, l9Var, storyItem4, 4));
                c10.setItemHeight(56);
            } else {
                z11 = z10;
                actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            }
            h4Var.d(actionBarPopupWindow$ActionBarPopupWindowLayout3, false);
            if (q4Var.r1 || h4Var.f) {
                org.telegram.ui.ActionBar.l1 l1Var2 = new org.telegram.ui.ActionBar.l1(q4Var.getContext(), org.telegram.ui.ActionBar.y6.H8, u6Var);
                l1Var2.setTag(R.id.fit_width_tag, num3);
                actionBarPopupWindow$ActionBarPopupWindowLayout3.a(l1Var2, gb1.r(-1, 8));
            }
            if (q4Var.R2 || o4Var.f || !((q4Var.G0() || MessagesController.getInstance(q4Var.r2).storiesEnabled()) && h4Var.h)) {
                y9Var = y9Var6;
            } else {
                org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, R.drawable.msg_edit, LocaleController.getString(q4Var.G0() ? R.string.EditBotPreview : R.string.EditStory), false, h4Var.d);
                q4Var.h1 = c11;
                y9Var = y9Var6;
                c11.setOnClickListener(new e0(h4Var, h4Var.d, h4Var.i, y9Var6, h4Var.j, 2));
                if (q4Var.H1.K(q4Var.q1) && o4Var.e && !SharedConfig.allowPreparingHevcPlayers()) {
                    q4Var.h1.setAlpha(0.5f);
                }
            }
            TL_stories.StoryItem storyItem5 = o4Var.a;
            if (storyItem5 == null || !o4Var.e || o4Var.f || !(storyItem5.pinned || q4Var.H0())) {
                y9Var2 = y9Var;
            } else {
                y9Var2 = y9Var;
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_cover_stories, LocaleController.getString(R.string.StoryEditCoverMenu), false, h4Var.d).setOnClickListener(new e0(h4Var, h4Var.i, storyItem4, y9Var2, h4Var.j, 3));
            }
            if ((q4Var.r1 || (q4Var.s1 && MessagesController.getInstance(q4Var.r2).getStoriesController().h(storyItem4.dialogId))) && !o4Var.f) {
                boolean z15 = storyItem4.pinned;
                boolean z16 = !z15;
                y9Var3 = y9Var2;
                actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, !z15 ? R.drawable.msg_save_story : R.drawable.menu_unsave_story, q4Var.r1 ? LocaleController.getString(!z15 ? R.string.SaveToProfile : R.string.ArchiveStory) : LocaleController.getString(!z15 ? R.string.SaveToPosts : R.string.RemoveFromPosts), false, h4Var.d).setOnClickListener(new y3(h4Var, storyItem4, z16, u6Var, 0));
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                y9Var3 = y9Var2;
            }
            h4Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout4, storyItem4);
            if (q4Var.R2 || o4Var.f) {
                actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout5, R.drawable.msg_gallery, LocaleController.getString(o4Var.e ? R.string.SaveVideo : R.string.SaveImage), false, h4Var.d).setOnClickListener(new v3(h4Var, 7));
            }
            if (!MessagesController.getInstance(q4Var.r2).premiumFeaturesBlocked() && !o4Var.f && !q4Var.s1) {
                q4.Z(q4Var, actionBarPopupWindow$ActionBarPopupWindowLayout5);
            }
            if (q4Var.s1 && q4Var.J2) {
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout5, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), false, h4Var.d).setOnClickListener(new v3(h4Var, 8));
            }
            if (q4Var.J2) {
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_shareout, LocaleController.getString(R.string.BotShare), false, h4Var.d).setOnClickListener(new v3(h4Var, 9));
            }
            TL_stories.StoryItem storyItem6 = o4Var.a;
            if (storyItem6 != null) {
                TLRPC.MessageMedia messageMedia2 = storyItem6.media;
                if ((messageMedia2 instanceof TLRPC.TL_messageMediaVideoStream) && (h1Var2 = h1.W) != null && h1Var2.f(((TLRPC.TL_messageMediaVideoStream) messageMedia2).call)) {
                    h1 h1Var3 = h1.W;
                    boolean z17 = (h1Var3 == null || !h1Var3.o()) ? false : z11;
                    org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, z17 ? R.drawable.msg_voice_unmuted : R.drawable.msg_voice_muted, LocaleController.getString(z17 ? R.string.Unmute : R.string.Mute), false, h4Var.d).setOnClickListener(new g2(1, h4Var, z17));
                    org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_camera_retake, LocaleController.getString(R.string.AccDescrSwitchCamera), false, h4Var.d).setOnClickListener(new v3(h4Var, 10));
                }
            }
            if (o4Var.f) {
                final int i11 = 1;
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_video_pip, LocaleController.getString(R.string.PipMinimize), false, h4Var.d).setOnClickListener(new View.OnClickListener(h4Var) { // from class: di.w3
                    public final /* synthetic */ h4 b;

                    {
                        this.b = h4Var;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                h4 h4Var2 = this.b.l.i1;
                                if (h4Var2 != null) {
                                    h4Var2.a();
                                }
                                y9Var3.N();
                                break;
                            default:
                                h4 h4Var3 = this.b.l.i1;
                                if (h4Var3 != null) {
                                    h4Var3.a();
                                }
                                y9Var3.N();
                                break;
                        }
                    }
                });
            }
            if (o4Var.f && (q4Var.q1 == UserConfig.getInstance(q4Var.r2).getClientUserId() || ChatObject.canManageCalls(MessagesController.getInstance(q4Var.r2).getChat(Long.valueOf(-q4Var.q1))) || ((h1Var = y9Var3.A0) != null && o4Var.k(h1Var.g()) && (groupCall = y9Var3.A0.v) != null && groupCall.creator))) {
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_settings_old, LocaleController.getString(R.string.LiveStorySettings), false, h4Var.d).setOnClickListener(new x3(h4Var, u6Var, y9Var3, 1));
            }
            if (o4Var.f) {
                org.telegram.ui.ActionBar.g1 c12 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_remove, LocaleController.getString(R.string.LiveStoryEnd), false, h4Var.d);
                int i12 = org.telegram.ui.ActionBar.y6.q7;
                c12.h(0.12f, i12);
                c12.d(u6Var.g(i12), u6Var.g(i12));
                c12.setOnClickListener(new x3(h4Var, u6Var, y9Var3, 2));
            }
            if (!o4Var.f) {
                if (!q4Var.r1) {
                    h7 storiesController = MessagesController.getInstance(q4Var.r2).getStoriesController();
                    TL_stories.StoryItem storyItem7 = o4Var.a;
                    int i13 = storiesController.a;
                    if (storyItem7 != null) {
                        if (storyItem7.dialogId != UserConfig.getInstance(i13).getClientUserId()) {
                            if (storyItem7.dialogId > 0) {
                                TLRPC.User user3 = MessagesController.getInstance(i13).getUser(Long.valueOf(storyItem7.dialogId));
                                if (user3 != null) {
                                    if (user3.bot) {
                                    }
                                }
                            }
                            if (storyItem7.dialogId < 0) {
                                TLRPC.Chat chat4 = MessagesController.getInstance(i13).getChat(Long.valueOf(-storyItem7.dialogId));
                                if (chat4 != null) {
                                    if (!chat4.creator) {
                                        boolean z18 = storyItem7.out;
                                        if (z18) {
                                            TLRPC.TL_chatAdminRights tL_chatAdminRights = chat4.admin_rights;
                                            if (tL_chatAdminRights != null) {
                                                if (!tL_chatAdminRights.post_stories) {
                                                }
                                            }
                                        }
                                        if (!z18) {
                                            TLRPC.TL_chatAdminRights tL_chatAdminRights2 = chat4.admin_rights;
                                            if (tL_chatAdminRights2 != null) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.g1 c13 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout6, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), false, h4Var.d);
                int i14 = org.telegram.ui.ActionBar.y6.q7;
                c13.h(0.12f, i14);
                c13.d(u6Var.g(i14), u6Var.g(i14));
                c13.setOnClickListener(new v3(h4Var, 13));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        } else {
            d(actionBarPopupWindow$ActionBarPopupWindowLayout, true);
            final String sharedPrefKey = NotificationsController.getSharedPrefKey(q4Var.q1, 0L);
            boolean d02 = NotificationsCustomSettingsActivity.d0(q4Var.r2, q4Var.q1);
            if (q4Var.q1 > 0) {
                ?? user4 = MessagesController.getInstance(q4Var.r2).getUser(Long.valueOf(q4Var.q1));
                chat2 = user4;
                chat = null;
                user = user4;
            } else {
                chat = MessagesController.getInstance(q4Var.r2).getChat(Long.valueOf(-q4Var.q1));
                chat2 = chat;
                user = null;
            }
            String trim = user == null ? chat == null ? "" : chat.title : UserObject.getFirstName(user).trim();
            int indexOf = trim.indexOf(" ");
            if (indexOf > 0) {
                trim = trim.substring(0, indexOf);
            }
            final String str = trim;
            if (UserObject.isService(q4Var.q1) || q4Var.G0()) {
                h4Var = this;
                u6Var2 = u6Var3;
                y9Var4 = y9Var6;
            } else {
                if (d02) {
                    user2 = user;
                    y9Var4 = y9Var6;
                    chat3 = chat;
                    u6Var2 = u6Var3;
                    org.telegram.ui.ActionBar.g1 c14 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), false, this.d);
                    final int i15 = 0;
                    final org.telegram.ui.ActionBar.u6 u6Var4 = this.d;
                    final TLRPC.Chat chat5 = chat2;
                    h4Var = this;
                    c14.setOnClickListener(new View.OnClickListener(this) { // from class: di.f4
                        public final /* synthetic */ h4 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i16 = i15;
                            String str2 = str;
                            TLObject tLObject = chat5;
                            org.telegram.ui.ActionBar.u6 u6Var5 = u6Var4;
                            String str3 = sharedPrefKey;
                            h4 h4Var2 = this.b;
                            switch (i16) {
                                case 0:
                                    q4 q4Var2 = h4Var2.l;
                                    MessagesController.getNotificationsSettings(q4Var2.r2).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str3, false).apply();
                                    NotificationsController.getInstance(q4Var2.r2).updateServerNotificationsSettings(q4Var2.q1, 0L);
                                    qc W = new wc(q4Var2.R0, u6Var5).W(Arrays.asList(tLObject), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, str2)), null, null);
                                    W.a = 2;
                                    W.j();
                                    h4 h4Var3 = q4Var2.i1;
                                    if (h4Var3 != null) {
                                        h4Var3.a();
                                        break;
                                    }
                                    break;
                                default:
                                    q4 q4Var3 = h4Var2.l;
                                    MessagesController.getNotificationsSettings(q4Var3.r2).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str3, true).apply();
                                    NotificationsController.getInstance(q4Var3.r2).updateServerNotificationsSettings(q4Var3.q1, 0L);
                                    qc W2 = new wc(q4Var3.R0, u6Var5).W(Arrays.asList(tLObject), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, str2)), null, null);
                                    W2.a = 2;
                                    W2.j();
                                    h4 h4Var4 = q4Var3.i1;
                                    if (h4Var4 != null) {
                                        h4Var4.a();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    c14.setMultiline(false);
                } else {
                    h4Var = this;
                    user2 = user;
                    chat3 = chat;
                    u6Var2 = u6Var3;
                    y9Var4 = y9Var6;
                    final TLRPC.Chat chat6 = chat2;
                    org.telegram.ui.ActionBar.g1 c15 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), false, h4Var.d);
                    final int i16 = 1;
                    final org.telegram.ui.ActionBar.u6 u6Var5 = h4Var.d;
                    c15.setOnClickListener(new View.OnClickListener(h4Var) { // from class: di.f4
                        public final /* synthetic */ h4 b;

                        {
                            this.b = h4Var;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i162 = i16;
                            String str2 = str;
                            TLObject tLObject = chat6;
                            org.telegram.ui.ActionBar.u6 u6Var52 = u6Var5;
                            String str3 = sharedPrefKey;
                            h4 h4Var2 = this.b;
                            switch (i162) {
                                case 0:
                                    q4 q4Var2 = h4Var2.l;
                                    MessagesController.getNotificationsSettings(q4Var2.r2).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str3, false).apply();
                                    NotificationsController.getInstance(q4Var2.r2).updateServerNotificationsSettings(q4Var2.q1, 0L);
                                    qc W = new wc(q4Var2.R0, u6Var52).W(Arrays.asList(tLObject), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, str2)), null, null);
                                    W.a = 2;
                                    W.j();
                                    h4 h4Var3 = q4Var2.i1;
                                    if (h4Var3 != null) {
                                        h4Var3.a();
                                        break;
                                    }
                                    break;
                                default:
                                    q4 q4Var3 = h4Var2.l;
                                    MessagesController.getNotificationsSettings(q4Var3.r2).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str3, true).apply();
                                    NotificationsController.getInstance(q4Var3.r2).updateServerNotificationsSettings(q4Var3.q1, 0L);
                                    qc W2 = new wc(q4Var3.R0, u6Var52).W(Arrays.asList(tLObject), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, str2)), null, null);
                                    W2.a = 2;
                                    W2.j();
                                    h4 h4Var4 = q4Var3.i1;
                                    if (h4Var4 != null) {
                                        h4Var4.a();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    c15.setMultiline(false);
                }
                MediaDataController.getInstance(q4Var.r2).loadHints(true);
                boolean z19 = (user2 == null || user2.contact || !MediaDataController.getInstance(q4Var.r2).containsTopPeer(q4Var.q1)) ? false : true;
                if (q4Var.q1 > 0) {
                    z12 = user2 != null && user2.contact;
                    if (user2 != null) {
                    }
                    z13 = false;
                } else {
                    TLRPC.Chat chat7 = chat3;
                    z12 = (chat7 == null || ChatObject.isNotInChat(chat7)) ? false : true;
                    if (chat7 != null) {
                    }
                    z13 = false;
                }
                if (z19) {
                    org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), false, h4Var.d).setOnClickListener(new v3(h4Var, 14));
                } else if (z12) {
                    if (z13) {
                        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), false, h4Var.d).setOnClickListener(new v3(h4Var, 0));
                    } else {
                        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), false, h4Var.d).setOnClickListener(new v3(h4Var, 15));
                    }
                }
            }
            if (o4Var.f) {
                final int i17 = 0;
                y9Var5 = y9Var4;
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_video_pip, LocaleController.getString(R.string.PipMinimize), false, h4Var.d).setOnClickListener(new View.OnClickListener(h4Var) { // from class: di.w3
                    public final /* synthetic */ h4 b;

                    {
                        this.b = h4Var;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i17) {
                            case 0:
                                h4 h4Var2 = this.b.l.i1;
                                if (h4Var2 != null) {
                                    h4Var2.a();
                                }
                                y9Var5.N();
                                break;
                            default:
                                h4 h4Var3 = this.b.l.i1;
                                if (h4Var3 != null) {
                                    h4Var3.a();
                                }
                                y9Var5.N();
                                break;
                        }
                    }
                });
            } else {
                y9Var5 = y9Var4;
            }
            if (!MessagesController.getInstance(q4Var.r2).premiumFeaturesBlocked() && o4Var.e) {
                boolean z20 = MessagesController.getInstance(q4Var.r2).storyQualityFull;
                if (UserConfig.getInstance(q4Var.r2).isPremium()) {
                    org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, z20 ? R.drawable.menu_quality_sd : R.drawable.menu_quality_hd, LocaleController.getString(z20 ? R.string.StoryQualityDecrease : R.string.StoryQualityIncrease), false, q4Var.q0).setOnClickListener(new g2(0, q4Var, z20));
                } else {
                    Drawable drawable = q4Var.getContext().getDrawable(R.drawable.msg_gallery_locked2);
                    i10 = -1;
                    drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                    o2 o2Var = new o2(q4Var.getContext().getDrawable(R.drawable.menu_quality_hd2), drawable, 1);
                    int dp = AndroidUtilities.dp(24.0f);
                    int dp2 = AndroidUtilities.dp(24.0f);
                    o2Var.e = dp;
                    o2Var.f = dp2;
                    int dp3 = AndroidUtilities.dp(1.0f);
                    int i18 = -AndroidUtilities.dp(2.0f);
                    o2Var.s = dp3;
                    o2Var.v = i18;
                    org.telegram.ui.ActionBar.g1 c16 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_quality_hd, LocaleController.getString(R.string.StoryQualityIncrease), false, q4Var.q0);
                    c16.setOnClickListener(new e2(q4Var, 7));
                    c16.setIcon(o2Var);
                    if (!q4Var.R2 && q4Var.H2 && !o4Var.f) {
                        if (!UserConfig.getInstance(q4Var.r2).isPremium()) {
                            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_gallery, LocaleController.getString(R.string.SaveToGallery), false, h4Var.d).setOnClickListener(new v3(h4Var, 1));
                        } else if (!MessagesController.getInstance(q4Var.r2).premiumFeaturesBlocked()) {
                            Drawable drawable2 = context.getDrawable(R.drawable.msg_gallery_locked2);
                            drawable2.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, i10, -16777216), PorterDuff.Mode.MULTIPLY));
                            o2 o2Var2 = new o2(context.getDrawable(R.drawable.msg_gallery_locked1), drawable2, 2);
                            actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            org.telegram.ui.ActionBar.g1 c17 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_gallery, LocaleController.getString(R.string.SaveToGallery), false, h4Var.d);
                            c17.setIcon(o2Var2);
                            c17.setOnClickListener(new bi.w0(h4Var, c17, y9Var5, 5));
                            if (!MessagesController.getInstance(q4Var.r2).premiumFeaturesBlocked() && !q4Var.s1) {
                                q4.Z(q4Var, actionBarPopupWindow$ActionBarPopupWindowLayout7);
                            }
                            if (q4Var.J2) {
                                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), false, h4Var.d).setOnClickListener(new v3(h4Var, 2));
                            }
                            if (q4Var.J2) {
                                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_shareout, LocaleController.getString(R.string.BotShare), false, h4Var.d).setOnClickListener(new v3(h4Var, 3));
                            }
                            storyItem3 = o4Var.a;
                            if (storyItem3 != null) {
                                if (storyItem3.translated && TextUtils.equals(storyItem3.translatedLng, f51.L())) {
                                    org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_translate, LocaleController.getString(R.string.HideTranslation), false, h4Var.d).setOnClickListener(new v3(h4Var, 4));
                                } else if (MessagesController.getInstance(q4Var.r2).getTranslateController().canTranslateStory(o4Var.a)) {
                                    actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                    org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout8, R.drawable.msg_translate, LocaleController.getString(R.string.TranslateMessage), false, h4Var.d).setOnClickListener(new v3(h4Var, 5));
                                    h4Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout8, o4Var.a);
                                    if (!q4Var.R2 || UserObject.isService(q4Var.q1) || q4Var.G0()) {
                                        actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                        u6Var = u6Var2;
                                    } else {
                                        u6Var = u6Var2;
                                        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout8, R.drawable.msg_report, LocaleController.getString(R.string.ReportChat), false, h4Var.d).setOnClickListener(new x3(h4Var, y9Var5, u6Var));
                                        actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                    }
                                    z11 = true;
                                }
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            h4Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout8, o4Var.a);
                            if (q4Var.R2) {
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            u6Var = u6Var2;
                            z11 = true;
                        }
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    if (!MessagesController.getInstance(q4Var.r2).premiumFeaturesBlocked()) {
                        q4.Z(q4Var, actionBarPopupWindow$ActionBarPopupWindowLayout7);
                    }
                    if (q4Var.J2) {
                    }
                    if (q4Var.J2) {
                    }
                    storyItem3 = o4Var.a;
                    if (storyItem3 != null) {
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    h4Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout8, o4Var.a);
                    if (q4Var.R2) {
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    u6Var = u6Var2;
                    z11 = true;
                }
            }
            i10 = -1;
            if (!q4Var.R2) {
                if (!UserConfig.getInstance(q4Var.r2).isPremium()) {
                }
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            if (!MessagesController.getInstance(q4Var.r2).premiumFeaturesBlocked()) {
            }
            if (q4Var.J2) {
            }
            if (q4Var.J2) {
            }
            storyItem3 = o4Var.a;
            if (storyItem3 != null) {
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            h4Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout8, o4Var.a);
            if (q4Var.R2) {
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            u6Var = u6Var2;
            z11 = true;
        }
        boolean z21 = (o4Var == null || (storyItem2 = o4Var.a) == null || (messageMedia = storyItem2.media) == null || (!MessageObject.isDocumentHasAttachedStickers(messageMedia.document) && ((photo = o4Var.a.media.photo) == null || !photo.has_stickers))) ? false : z11;
        if (o4Var != null) {
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList3 = new ArrayList();
            TL_stories.StoryItem storyItem8 = o4Var.a;
            if (storyItem8 != null && storyItem8.media_areas != null) {
                for (int i19 = 0; i19 < o4Var.a.media_areas.size(); i19++) {
                    TL_stories.MediaArea mediaArea2 = o4Var.a.media_areas.get(i19);
                    if (mediaArea2 instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                        TLRPC.Reaction reaction = mediaArea2.reaction;
                        if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                            TLRPC.Document f7 = org.telegram.ui.Components.t5.f(q4Var.r2, ((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
                            if (f7 != null && (inputStickerSet2 = MessageObject.getInputStickerSet(f7)) != null && !hashSet2.contains(Long.valueOf(inputStickerSet2.id))) {
                                hashSet2.add(Long.valueOf(inputStickerSet2.id));
                                arrayList3.add(inputStickerSet2);
                            }
                        }
                    }
                }
            }
            TL_stories.StoryItem storyItem9 = o4Var.a;
            if (storyItem9 == null || (arrayList2 = storyItem9.entities) == null || arrayList2.isEmpty()) {
                g7 g7Var = o4Var.b;
                if (g7Var != null && (w7Var = g7Var.c) != null) {
                    if (w7Var.T0 != null) {
                        for (int i20 = 0; i20 < o4Var.b.c.T0.size(); i20++) {
                            VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) o4Var.b.c.T0.get(i20);
                            if (mediaEntity.type == 4 && (mediaArea = mediaEntity.mediaArea) != null) {
                                TLRPC.Reaction reaction2 = mediaArea.reaction;
                                if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                    TLRPC.Document f10 = org.telegram.ui.Components.t5.f(q4Var.r2, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id);
                                    if (f10 != null && (inputStickerSet = MessageObject.getInputStickerSet(f10)) != null && !hashSet2.contains(Long.valueOf(inputStickerSet.id))) {
                                        hashSet2.add(Long.valueOf(inputStickerSet.id));
                                        arrayList3.add(inputStickerSet);
                                    }
                                }
                            }
                        }
                    }
                    CharSequence charSequence = o4Var.b.c.C0;
                    if ((charSequence instanceof Spanned) && (c6VarArr = (org.telegram.ui.Components.c6[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.c6.class)) != null) {
                        int i21 = 0;
                        while (i21 < c6VarArr.length) {
                            org.telegram.ui.Components.c6 c6Var = c6VarArr[i21];
                            TLRPC.Document document = c6Var.document;
                            if (document == null) {
                                num2 = num3;
                                document = org.telegram.ui.Components.t5.f(q4Var.r2, c6Var.documentId);
                            } else {
                                num2 = num3;
                            }
                            if (document != null) {
                                TLRPC.InputStickerSet inputStickerSet3 = MessageObject.getInputStickerSet(document);
                                if (!hashSet2.contains(Long.valueOf(inputStickerSet3.id))) {
                                    hashSet2.add(Long.valueOf(inputStickerSet3.id));
                                    arrayList3.add(inputStickerSet3);
                                }
                            }
                            i21++;
                            num3 = num2;
                        }
                    }
                }
            } else {
                for (int i22 = 0; i22 < o4Var.a.entities.size(); i22++) {
                    TLRPC.MessageEntity messageEntity = o4Var.a.entities.get(i22);
                    if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                        TLRPC.Document document2 = tL_messageEntityCustomEmoji.document;
                        if (document2 == null) {
                            document2 = org.telegram.ui.Components.t5.f(q4Var.r2, tL_messageEntityCustomEmoji.document_id);
                        }
                        if (document2 != null) {
                            TLRPC.InputStickerSet inputStickerSet4 = MessageObject.getInputStickerSet(document2);
                            if (!hashSet2.contains(Long.valueOf(inputStickerSet4.id))) {
                                hashSet2.add(Long.valueOf(inputStickerSet4.id));
                                arrayList3.add(inputStickerSet4);
                            }
                        }
                    }
                }
            }
            num = num3;
            arrayList = arrayList3;
        } else {
            num = num3;
            arrayList = null;
        }
        boolean z22 = (arrayList == null || arrayList.isEmpty()) ? false : z11;
        if (z21 || z22) {
            org.telegram.ui.ActionBar.l1 l1Var3 = new org.telegram.ui.ActionBar.l1(context, org.telegram.ui.ActionBar.y6.H8, u6Var);
            l1Var3.setTag(R.id.fit_width_tag, num);
            actionBarPopupWindow$ActionBarPopupWindowLayout6.a(l1Var3, gb1.r(-1, 8));
            TLRPC.MessageMedia messageMedia3 = o4Var.a.media;
            TLObject tLObject = messageMedia3.document;
            if (tLObject == null) {
                tLObject = messageMedia3.photo;
            }
            t8 t8Var = new t8(h4Var.i, q4Var.r2, tLObject, o4Var.a, z21, arrayList, h4Var.d);
            t8Var.setOnClickListener(new bi.q(13, h4Var, t8Var));
            t8Var.setTag(R.id.fit_width_tag, num);
            actionBarPopupWindow$ActionBarPopupWindowLayout6.a(t8Var, gb1.r(-1, -2));
        }
    }

    @Override // org.telegram.ui.Components.js
    public final void c() {
        if (!this.c && !this.k[0]) {
            AndroidUtilities.runOnUIThread(new z3(this, 0));
        }
        q4 q4Var = this.l;
        q4Var.i1 = null;
        q4Var.h1 = null;
    }

    public final void d(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z10) {
        o4 o4Var;
        boolean z11 = this.f;
        q4 q4Var = this.l;
        if (!z11 || ((o4Var = q4Var.D1) != null && o4Var.b != null)) {
            q4Var.r3 = null;
            q4Var.s3 = null;
            return;
        }
        Context context = q4Var.getContext();
        sh0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
        final rf.b bVar = new rf.b(this, actionBarPopupWindow$ActionBarPopupWindowLayout, false, 16);
        sr srVar = new sr();
        org.telegram.ui.ActionBar.g1[] g1VarArr = new org.telegram.ui.ActionBar.g1[5];
        srVar.c = g1VarArr;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, context, null);
        srVar.a = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setFitItems(true);
        org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, null);
        c10.setOnClickListener(new nr(swipeBack, 1));
        c10.d(-328966, -328966);
        c10.setSelectorColor(268435455);
        View i4Var = new i4(context, 11);
        i4Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        i4Var.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(i4Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) i4Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(8.0f);
        i4Var.setLayoutParams(layoutParams);
        org.telegram.ui.ActionBar.c1 c1Var = new org.telegram.ui.ActionBar.c1(context, null);
        srVar.b = c1Var;
        c1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        c1Var.setDrawShadow(false);
        c1Var.setBackgroundColor(-14540254);
        c1Var.setTextColor(-1);
        c1Var.setOnValueChange(new org.telegram.ui.e5(bVar, 6));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(c1Var, gb1.r(-1, 44));
        View i4Var2 = new i4(context, 12);
        i4Var2.setMinimumWidth(AndroidUtilities.dp(196.0f));
        i4Var2.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(i4Var2);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) i4Var2.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams2.gravity = 5;
        }
        layoutParams2.width = -1;
        layoutParams2.height = AndroidUtilities.dp(8.0f);
        i4Var2.setLayoutParams(layoutParams2);
        org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_0_2, LocaleController.getString(R.string.SpeedVerySlow), false, null);
        c11.d(-328966, -328966);
        final int i10 = 0;
        c11.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.rr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        bVar.N(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.N(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.N(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.N(true, true, 1.5f);
                        break;
                    default:
                        bVar.N(true, true, 2.0f);
                        break;
                }
            }
        });
        c11.setSelectorColor(268435455);
        g1VarArr[0] = c11;
        org.telegram.ui.ActionBar.g1 c12 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow), false, null);
        c12.d(-328966, -328966);
        final int i11 = 1;
        c12.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.rr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        bVar.N(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.N(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.N(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.N(true, true, 1.5f);
                        break;
                    default:
                        bVar.N(true, true, 2.0f);
                        break;
                }
            }
        });
        c12.setSelectorColor(268435455);
        g1VarArr[1] = c12;
        org.telegram.ui.ActionBar.g1 c13 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal), false, null);
        c13.d(-328966, -328966);
        final int i12 = 2;
        c13.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.rr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        bVar.N(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.N(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.N(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.N(true, true, 1.5f);
                        break;
                    default:
                        bVar.N(true, true, 2.0f);
                        break;
                }
            }
        });
        c13.setSelectorColor(268435455);
        g1VarArr[2] = c13;
        org.telegram.ui.ActionBar.g1 c14 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast), false, null);
        c14.d(-328966, -328966);
        final int i13 = 3;
        c14.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.rr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        bVar.N(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.N(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.N(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.N(true, true, 1.5f);
                        break;
                    default:
                        bVar.N(true, true, 2.0f);
                        break;
                }
            }
        });
        c14.setSelectorColor(268435455);
        g1VarArr[3] = c14;
        org.telegram.ui.ActionBar.g1 c15 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedVeryFast), false, null);
        c15.d(-328966, -328966);
        final int i14 = 4;
        c15.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.rr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        bVar.N(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.N(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.N(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.N(true, true, 1.5f);
                        break;
                    default:
                        bVar.N(true, true, 2.0f);
                        break;
                }
            }
        });
        c15.setSelectorColor(268435455);
        g1VarArr[4] = c15;
        q4Var.r3 = srVar;
        srVar.a(y9.B1, true);
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, q4Var.getContext(), this.d, false, false);
        q4Var.s3 = g1Var;
        g1Var.j(LocaleController.getString(R.string.Speed), R.drawable.msg_speed, null);
        q4.Y(q4Var, true);
        q4Var.s3.setMinimumWidth(AndroidUtilities.dp(196.0f));
        q4Var.s3.setRightIcon(R.drawable.msg_arrowright);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(q4Var.s3);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) q4Var.s3.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams3.gravity = 5;
        }
        layoutParams3.width = -1;
        layoutParams3.height = AndroidUtilities.dp(48.0f);
        q4Var.s3.setLayoutParams(layoutParams3);
        int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(q4Var.r3.a);
        org.telegram.ui.ActionBar.g1 g1Var2 = q4Var.s3;
        g1Var2.P = new a4(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 0);
        g1Var2.setOnClickListener(new v3(this, 11));
        actionBarPopupWindow$ActionBarPopupWindowLayout.c = true;
        if (z10) {
            org.telegram.ui.ActionBar.l1 l1Var = new org.telegram.ui.ActionBar.l1(q4Var.getContext(), org.telegram.ui.ActionBar.y6.H8, this.d);
            l1Var.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(l1Var, gb1.r(-1, 8));
        }
    }

    public final void e(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, TL_stories.StoryItem storyItem) {
        TLRPC.Chat chat;
        q4 q4Var = this.l;
        if (!q4Var.s1 || storyItem == null || (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) || (chat = MessagesController.getInstance(q4Var.r2).getChat(Long.valueOf(-q4Var.q1))) == null) {
            return;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(q4Var.r2).getChatFull(chat.id);
        if (chatFull == null) {
            chatFull = MessagesStorage.getInstance(q4Var.r2).loadChatInfo(chat.id, true, new CountDownLatch(1), false, false);
        }
        if (chatFull == null || !chatFull.can_view_stats) {
            return;
        }
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stats, LocaleController.getString(R.string.ViewStatistics), false, this.d).setOnClickListener(new c4(this, storyItem, this.e, chat, 0));
    }
}
