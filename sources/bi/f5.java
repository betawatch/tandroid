package bi;

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
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.ug0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.yc;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.bs;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class f5 extends wr {
    public boolean c;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 d;
    public final /* synthetic */ pb e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Context i;
    public final /* synthetic */ l5 j;
    public final /* synthetic */ boolean[] k;
    public final /* synthetic */ o5 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(o5 o5Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.f6 f6Var2, pb pbVar, boolean z10, boolean z11, boolean z12, Context context2, l5 l5Var, boolean[] zArr) {
        super(context, f6Var, true);
        this.l = o5Var;
        this.d = f6Var2;
        this.e = pbVar;
        this.f = z10;
        this.g = z11;
        this.h = z12;
        this.i = context2;
        this.j = l5Var;
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
    /* JADX WARN: Code restructure failed: missing block: B:399:0x08a6, code lost:
    
        if (r2.bot_can_edit == false) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x08d4, code lost:
    
        if (r2.delete_stories == false) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x08df, code lost:
    
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
    /* JADX WARN: Type inference failed for: r4v92, types: [org.telegram.tgnet.TLRPC$User] */
    @Override // org.telegram.ui.Components.wr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        org.telegram.ui.ActionBar.f6 f6Var;
        final f5 f5Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        TL_stories.StoryItem storyItem;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3;
        pb pbVar;
        pb pbVar2;
        final pb pbVar3;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout5;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout6;
        t1 t1Var;
        TLRPC.GroupCall groupCall;
        t1 t1Var2;
        Integer num;
        ArrayList arrayList;
        di.o8 o8Var;
        org.telegram.ui.Components.z5[] z5VarArr;
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
        org.telegram.ui.ActionBar.f6 f6Var2;
        pb pbVar4;
        final pb pbVar5;
        int i10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout7;
        TL_stories.StoryItem storyItem3;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout8;
        TLRPC.User user2;
        TLRPC.Chat chat3;
        boolean z10;
        boolean z11;
        Integer num3 = 1;
        o5 o5Var = this.l;
        m5 m5Var = o5Var.O1;
        boolean z12 = this.g;
        Context context = this.i;
        pb pbVar6 = this.e;
        org.telegram.ui.ActionBar.f6 f6Var3 = this.d;
        if (z12 || m5Var.b != null) {
            f6Var = f6Var3;
            f5Var = this;
            TL_stories.StoryItem storyItem4 = m5Var.a;
            if (m5Var.b != null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_cancel, LocaleController.getString(R.string.Cancel), false, f5Var.d).setOnClickListener(new t4(f5Var, 6));
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            }
            if (storyItem4 == null) {
                return;
            }
            if ((o5Var.C1 || o5Var.S1.h(o5Var.B1)) && !m5Var.f && (storyItem = m5Var.a) != null) {
                HashSet hashSet = storyItem.albums != null ? new HashSet(storyItem.albums) : new HashSet();
                n70 n70Var = new n70(actionBarPopupWindow$ActionBarPopupWindowLayout2, f6Var);
                n70Var.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new a3.c(actionBarPopupWindow$ActionBarPopupWindowLayout2, 18), false);
                n70Var.k();
                f8 B = o5Var.getStoriesController().B(o5Var.B1, true);
                f8 B2 = o5Var.S1.B(o5Var.B1, false);
                n70.f(n70Var, B, hashSet, B2 != null && B2.a(), new a3.j0(f5Var, f6Var, storyItem, 5), new r3(f5Var, hashSet, storyItem, f6Var, 1));
                int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout2.b(n70Var.B);
                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, o5Var.getContext(), f5Var.d, false, false);
                o5Var.E3 = f1Var;
                f1Var.g(LocaleController.getString(R.string.StoriesAlbumAddToAlbum), R.drawable.menu_album_add, null);
                org.telegram.ui.ActionBar.f1 f1Var2 = o5Var.E3;
                f1Var2.G = new y4(actionBarPopupWindow$ActionBarPopupWindowLayout2, b10, 1);
                f1Var2.setOnClickListener(new t4(f5Var, 12));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(o5Var.E3);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.c = true;
                org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(o5Var.getContext(), org.telegram.ui.ActionBar.j6.H8, f6Var);
                k1Var.setTag(R.id.fit_width_tag, num3);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(k1Var, w7.x5.n(-1, 8));
            }
            if (o5Var.C1) {
                di.ga gaVar = storyItem4.privacy.isEmpty() ? new di.ga(3, o5Var.C2, new ArrayList()) : new di.ga(o5Var.C2, storyItem4.privacy);
                actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, R.drawable.msg_view_file, LocaleController.getString(R.string.WhoCanSee), false, f5Var.d);
                c10.setSubtext(gaVar.toString());
                c10.setOnClickListener(new x(f5Var, gaVar, storyItem4, 1));
                c10.setItemHeight(56);
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            }
            f5Var.d(actionBarPopupWindow$ActionBarPopupWindowLayout3, false);
            if (o5Var.C1 || f5Var.f) {
                org.telegram.ui.ActionBar.k1 k1Var2 = new org.telegram.ui.ActionBar.k1(o5Var.getContext(), org.telegram.ui.ActionBar.j6.H8, f6Var);
                k1Var2.setTag(R.id.fit_width_tag, num3);
                actionBarPopupWindow$ActionBarPopupWindowLayout3.a(k1Var2, w7.x5.n(-1, 8));
            }
            if (o5Var.c3 || m5Var.f || !((o5Var.I0() || MessagesController.getInstance(o5Var.C2).storiesEnabled()) && f5Var.h)) {
                pbVar = pbVar6;
            } else {
                org.telegram.ui.ActionBar.f1 c11 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, R.drawable.msg_edit, LocaleController.getString(o5Var.I0() ? R.string.EditBotPreview : R.string.EditStory), false, f5Var.d);
                o5Var.s1 = c11;
                pbVar = pbVar6;
                c11.setOnClickListener(new l0(f5Var, f5Var.d, f5Var.i, pbVar6, f5Var.j, 2));
                if (o5Var.S1.K(o5Var.B1) && m5Var.e && !SharedConfig.allowPreparingHevcPlayers()) {
                    o5Var.s1.setAlpha(0.5f);
                }
            }
            TL_stories.StoryItem storyItem5 = m5Var.a;
            if (storyItem5 == null || !m5Var.e || m5Var.f || !(storyItem5.pinned || o5Var.J0())) {
                pbVar2 = pbVar;
            } else {
                pbVar2 = pbVar;
                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_cover_stories, LocaleController.getString(R.string.StoryEditCoverMenu), false, f5Var.d).setOnClickListener(new l0(f5Var, f5Var.i, storyItem4, pbVar2, f5Var.j, 3));
            }
            if ((o5Var.C1 || (o5Var.D1 && MessagesController.getInstance(o5Var.C2).getStoriesController().h(storyItem4.dialogId))) && !m5Var.f) {
                boolean z13 = storyItem4.pinned;
                boolean z14 = !z13;
                pbVar3 = pbVar2;
                actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, !z13 ? R.drawable.msg_save_story : R.drawable.menu_unsave_story, o5Var.C1 ? LocaleController.getString(!z13 ? R.string.SaveToProfile : R.string.ArchiveStory) : LocaleController.getString(!z13 ? R.string.SaveToPosts : R.string.RemoveFromPosts), false, f5Var.d).setOnClickListener(new w4(f5Var, storyItem4, z14, f6Var, 0));
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                pbVar3 = pbVar2;
            }
            f5Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout4, storyItem4);
            if (o5Var.c3 || m5Var.f) {
                actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout5, R.drawable.msg_gallery, LocaleController.getString(m5Var.e ? R.string.SaveVideo : R.string.SaveImage), false, f5Var.d).setOnClickListener(new t4(f5Var, 7));
            }
            if (!MessagesController.getInstance(o5Var.C2).premiumFeaturesBlocked() && !m5Var.f && !o5Var.D1) {
                o5.b0(o5Var, actionBarPopupWindow$ActionBarPopupWindowLayout5);
            }
            if (o5Var.D1 && o5Var.U2) {
                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout5, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), false, f5Var.d).setOnClickListener(new t4(f5Var, 8));
            }
            if (o5Var.U2) {
                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_shareout, LocaleController.getString(R.string.BotShare), false, f5Var.d).setOnClickListener(new t4(f5Var, 9));
            }
            TL_stories.StoryItem storyItem6 = m5Var.a;
            if (storyItem6 != null) {
                TLRPC.MessageMedia messageMedia2 = storyItem6.media;
                if ((messageMedia2 instanceof TLRPC.TL_messageMediaVideoStream) && (t1Var2 = t1.W) != null && t1Var2.f(((TLRPC.TL_messageMediaVideoStream) messageMedia2).call)) {
                    t1 t1Var3 = t1.W;
                    boolean z15 = t1Var3 != null && t1Var3.o();
                    org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, z15 ? R.drawable.msg_voice_unmuted : R.drawable.msg_voice_muted, LocaleController.getString(z15 ? R.string.Unmute : R.string.Mute), false, f5Var.d).setOnClickListener(new w2(1, f5Var, z15));
                    org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_camera_retake, LocaleController.getString(R.string.AccDescrSwitchCamera), false, f5Var.d).setOnClickListener(new t4(f5Var, 10));
                }
            }
            if (m5Var.f) {
                final int i11 = 1;
                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_video_pip, LocaleController.getString(R.string.PipMinimize), false, f5Var.d).setOnClickListener(new View.OnClickListener(f5Var) { // from class: bi.u4
                    public final /* synthetic */ f5 b;

                    {
                        this.b = f5Var;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                f5 f5Var2 = this.b.l.t1;
                                if (f5Var2 != null) {
                                    f5Var2.a();
                                }
                                pbVar3.N();
                                break;
                            default:
                                f5 f5Var3 = this.b.l.t1;
                                if (f5Var3 != null) {
                                    f5Var3.a();
                                }
                                pbVar3.N();
                                break;
                        }
                    }
                });
            }
            if (m5Var.f && (o5Var.B1 == UserConfig.getInstance(o5Var.C2).getClientUserId() || ChatObject.canManageCalls(MessagesController.getInstance(o5Var.C2).getChat(Long.valueOf(-o5Var.B1))) || ((t1Var = pbVar3.A0) != null && m5Var.k(t1Var.g()) && (groupCall = pbVar3.A0.v) != null && groupCall.creator))) {
                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_settings_old, LocaleController.getString(R.string.LiveStorySettings), false, f5Var.d).setOnClickListener(new v4(f5Var, f6Var, pbVar3, 1));
            }
            if (m5Var.f) {
                org.telegram.ui.ActionBar.f1 c12 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_remove, LocaleController.getString(R.string.LiveStoryEnd), false, f5Var.d);
                int i12 = org.telegram.ui.ActionBar.j6.q7;
                c12.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i12, f6Var)));
                c12.c(f6Var.G0(i12), f6Var.G0(i12));
                c12.setOnClickListener(new v4(f5Var, f6Var, pbVar3, 2));
            }
            if (!m5Var.f) {
                if (!o5Var.C1) {
                    u8 storiesController = MessagesController.getInstance(o5Var.C2).getStoriesController();
                    TL_stories.StoryItem storyItem7 = m5Var.a;
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
                                        boolean z16 = storyItem7.out;
                                        if (z16) {
                                            TLRPC.TL_chatAdminRights tL_chatAdminRights = chat4.admin_rights;
                                            if (tL_chatAdminRights != null) {
                                                if (!tL_chatAdminRights.post_stories) {
                                                }
                                            }
                                        }
                                        if (!z16) {
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
                org.telegram.ui.ActionBar.f1 c13 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout6, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), false, f5Var.d);
                int i14 = org.telegram.ui.ActionBar.j6.q7;
                c13.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i14, f6Var)));
                c13.c(f6Var.G0(i14), f6Var.G0(i14));
                c13.setOnClickListener(new t4(f5Var, 13));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        } else {
            d(actionBarPopupWindow$ActionBarPopupWindowLayout, true);
            final String sharedPrefKey = NotificationsController.getSharedPrefKey(o5Var.B1, 0L);
            boolean c02 = NotificationsCustomSettingsActivity.c0(o5Var.C2, o5Var.B1);
            if (o5Var.B1 > 0) {
                ?? user4 = MessagesController.getInstance(o5Var.C2).getUser(Long.valueOf(o5Var.B1));
                chat2 = user4;
                chat = null;
                user = user4;
            } else {
                chat = MessagesController.getInstance(o5Var.C2).getChat(Long.valueOf(-o5Var.B1));
                chat2 = chat;
                user = null;
            }
            String trim = user == null ? chat == null ? "" : chat.title : UserObject.getFirstName(user).trim();
            int indexOf = trim.indexOf(" ");
            if (indexOf > 0) {
                trim = trim.substring(0, indexOf);
            }
            final String str = trim;
            if (UserObject.isService(o5Var.B1) || o5Var.I0()) {
                f5Var = this;
                f6Var2 = f6Var3;
                pbVar4 = pbVar6;
            } else {
                if (c02) {
                    user2 = user;
                    pbVar4 = pbVar6;
                    chat3 = chat;
                    f6Var2 = f6Var3;
                    org.telegram.ui.ActionBar.f1 c14 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), false, this.d);
                    final int i15 = 0;
                    final org.telegram.ui.ActionBar.f6 f6Var4 = this.d;
                    final TLRPC.Chat chat5 = chat2;
                    f5Var = this;
                    c14.setOnClickListener(new View.OnClickListener(this) { // from class: bi.d5
                        public final /* synthetic */ f5 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i16 = i15;
                            String str2 = str;
                            TLObject tLObject = chat5;
                            org.telegram.ui.ActionBar.f6 f6Var5 = f6Var4;
                            String str3 = sharedPrefKey;
                            f5 f5Var2 = this.b;
                            switch (i16) {
                                case 0:
                                    o5 o5Var2 = f5Var2.l;
                                    MessagesController.getNotificationsSettings(o5Var2.C2).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str3, false).apply();
                                    NotificationsController.getInstance(o5Var2.C2).updateServerNotificationsSettings(o5Var2.B1, 0L);
                                    qc V = new yc(o5Var2.c1, f6Var5).V(Arrays.asList(tLObject), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, str2)), null, null);
                                    V.a = 2;
                                    V.j();
                                    f5 f5Var3 = o5Var2.t1;
                                    if (f5Var3 != null) {
                                        f5Var3.a();
                                        break;
                                    }
                                    break;
                                default:
                                    o5 o5Var3 = f5Var2.l;
                                    MessagesController.getNotificationsSettings(o5Var3.C2).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str3, true).apply();
                                    NotificationsController.getInstance(o5Var3.C2).updateServerNotificationsSettings(o5Var3.B1, 0L);
                                    qc V2 = new yc(o5Var3.c1, f6Var5).V(Arrays.asList(tLObject), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, str2)), null, null);
                                    V2.a = 2;
                                    V2.j();
                                    f5 f5Var4 = o5Var3.t1;
                                    if (f5Var4 != null) {
                                        f5Var4.a();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    c14.setMultiline(false);
                } else {
                    f5Var = this;
                    user2 = user;
                    chat3 = chat;
                    f6Var2 = f6Var3;
                    pbVar4 = pbVar6;
                    final TLRPC.Chat chat6 = chat2;
                    org.telegram.ui.ActionBar.f1 c15 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), false, f5Var.d);
                    final int i16 = 1;
                    final org.telegram.ui.ActionBar.f6 f6Var5 = f5Var.d;
                    c15.setOnClickListener(new View.OnClickListener(f5Var) { // from class: bi.d5
                        public final /* synthetic */ f5 b;

                        {
                            this.b = f5Var;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i162 = i16;
                            String str2 = str;
                            TLObject tLObject = chat6;
                            org.telegram.ui.ActionBar.f6 f6Var52 = f6Var5;
                            String str3 = sharedPrefKey;
                            f5 f5Var2 = this.b;
                            switch (i162) {
                                case 0:
                                    o5 o5Var2 = f5Var2.l;
                                    MessagesController.getNotificationsSettings(o5Var2.C2).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str3, false).apply();
                                    NotificationsController.getInstance(o5Var2.C2).updateServerNotificationsSettings(o5Var2.B1, 0L);
                                    qc V = new yc(o5Var2.c1, f6Var52).V(Arrays.asList(tLObject), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, str2)), null, null);
                                    V.a = 2;
                                    V.j();
                                    f5 f5Var3 = o5Var2.t1;
                                    if (f5Var3 != null) {
                                        f5Var3.a();
                                        break;
                                    }
                                    break;
                                default:
                                    o5 o5Var3 = f5Var2.l;
                                    MessagesController.getNotificationsSettings(o5Var3.C2).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str3, true).apply();
                                    NotificationsController.getInstance(o5Var3.C2).updateServerNotificationsSettings(o5Var3.B1, 0L);
                                    qc V2 = new yc(o5Var3.c1, f6Var52).V(Arrays.asList(tLObject), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, str2)), null, null);
                                    V2.a = 2;
                                    V2.j();
                                    f5 f5Var4 = o5Var3.t1;
                                    if (f5Var4 != null) {
                                        f5Var4.a();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    c15.setMultiline(false);
                }
                MediaDataController.getInstance(o5Var.C2).loadHints(true);
                boolean z17 = (user2 == null || user2.contact || !MediaDataController.getInstance(o5Var.C2).containsTopPeer(o5Var.B1)) ? false : true;
                if (o5Var.B1 > 0) {
                    z10 = user2 != null && user2.contact;
                    if (user2 != null) {
                    }
                    z11 = false;
                } else {
                    TLRPC.Chat chat7 = chat3;
                    z10 = (chat7 == null || ChatObject.isNotInChat(chat7)) ? false : true;
                    if (chat7 != null) {
                    }
                    z11 = false;
                }
                if (z17) {
                    org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), false, f5Var.d).setOnClickListener(new t4(f5Var, 14));
                } else if (z10) {
                    if (z11) {
                        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), false, f5Var.d).setOnClickListener(new t4(f5Var, 0));
                    } else {
                        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), false, f5Var.d).setOnClickListener(new t4(f5Var, 15));
                    }
                }
            }
            if (m5Var.f) {
                final int i17 = 0;
                pbVar5 = pbVar4;
                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_video_pip, LocaleController.getString(R.string.PipMinimize), false, f5Var.d).setOnClickListener(new View.OnClickListener(f5Var) { // from class: bi.u4
                    public final /* synthetic */ f5 b;

                    {
                        this.b = f5Var;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i17) {
                            case 0:
                                f5 f5Var2 = this.b.l.t1;
                                if (f5Var2 != null) {
                                    f5Var2.a();
                                }
                                pbVar5.N();
                                break;
                            default:
                                f5 f5Var3 = this.b.l.t1;
                                if (f5Var3 != null) {
                                    f5Var3.a();
                                }
                                pbVar5.N();
                                break;
                        }
                    }
                });
            } else {
                pbVar5 = pbVar4;
            }
            if (!MessagesController.getInstance(o5Var.C2).premiumFeaturesBlocked() && m5Var.e) {
                boolean z18 = MessagesController.getInstance(o5Var.C2).storyQualityFull;
                if (UserConfig.getInstance(o5Var.C2).isPremium()) {
                    org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, z18 ? R.drawable.menu_quality_sd : R.drawable.menu_quality_hd, LocaleController.getString(z18 ? R.string.StoryQualityDecrease : R.string.StoryQualityIncrease), false, o5Var.B0).setOnClickListener(new w2(0, o5Var, z18));
                } else {
                    Drawable drawable = o5Var.getContext().getDrawable(R.drawable.msg_gallery_locked2);
                    i10 = -1;
                    drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                    g3 g3Var = new g3(o5Var.getContext().getDrawable(R.drawable.menu_quality_hd2), drawable, 1);
                    int dp = AndroidUtilities.dp(24.0f);
                    int dp2 = AndroidUtilities.dp(24.0f);
                    g3Var.e = dp;
                    g3Var.f = dp2;
                    int dp3 = AndroidUtilities.dp(1.0f);
                    int i18 = -AndroidUtilities.dp(2.0f);
                    g3Var.s = dp3;
                    g3Var.v = i18;
                    org.telegram.ui.ActionBar.f1 c16 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_quality_hd, LocaleController.getString(R.string.StoryQualityIncrease), false, o5Var.B0);
                    c16.setOnClickListener(new s2(o5Var, 7));
                    c16.setIcon(g3Var);
                    if (!o5Var.c3 && o5Var.S2 && !m5Var.f) {
                        if (!UserConfig.getInstance(o5Var.C2).isPremium()) {
                            org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_gallery, LocaleController.getString(R.string.SaveToGallery), false, f5Var.d).setOnClickListener(new t4(f5Var, 1));
                        } else if (!MessagesController.getInstance(o5Var.C2).premiumFeaturesBlocked()) {
                            Drawable drawable2 = context.getDrawable(R.drawable.msg_gallery_locked2);
                            drawable2.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, i10, -16777216), PorterDuff.Mode.MULTIPLY));
                            g3 g3Var2 = new g3(context.getDrawable(R.drawable.msg_gallery_locked1), drawable2, 2);
                            actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            org.telegram.ui.ActionBar.f1 c17 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_gallery, LocaleController.getString(R.string.SaveToGallery), false, f5Var.d);
                            c17.setIcon(g3Var2);
                            c17.setOnClickListener(new x(f5Var, c17, pbVar5, 2));
                            if (!MessagesController.getInstance(o5Var.C2).premiumFeaturesBlocked() && !o5Var.D1) {
                                o5.b0(o5Var, actionBarPopupWindow$ActionBarPopupWindowLayout7);
                            }
                            if (o5Var.U2) {
                                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), false, f5Var.d).setOnClickListener(new t4(f5Var, 2));
                            }
                            if (o5Var.U2) {
                                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_shareout, LocaleController.getString(R.string.BotShare), false, f5Var.d).setOnClickListener(new t4(f5Var, 3));
                            }
                            storyItem3 = m5Var.a;
                            if (storyItem3 != null) {
                                if (storyItem3.translated && TextUtils.equals(storyItem3.translatedLng, u31.B())) {
                                    org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_translate, LocaleController.getString(R.string.HideTranslation), false, f5Var.d).setOnClickListener(new t4(f5Var, 4));
                                } else if (MessagesController.getInstance(o5Var.C2).getTranslateController().canTranslateStory(m5Var.a)) {
                                    actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                    org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout8, R.drawable.msg_translate, LocaleController.getString(R.string.TranslateMessage), false, f5Var.d).setOnClickListener(new t4(f5Var, 5));
                                    f5Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout8, m5Var.a);
                                    if (!o5Var.c3 || UserObject.isService(o5Var.B1) || o5Var.I0()) {
                                        actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                        f6Var = f6Var2;
                                    } else {
                                        f6Var = f6Var2;
                                        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout8, R.drawable.msg_report, LocaleController.getString(R.string.ReportChat), false, f5Var.d).setOnClickListener(new v4(f5Var, pbVar5, f6Var));
                                        actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                    }
                                }
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            f5Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout8, m5Var.a);
                            if (o5Var.c3) {
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            f6Var = f6Var2;
                        }
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    if (!MessagesController.getInstance(o5Var.C2).premiumFeaturesBlocked()) {
                        o5.b0(o5Var, actionBarPopupWindow$ActionBarPopupWindowLayout7);
                    }
                    if (o5Var.U2) {
                    }
                    if (o5Var.U2) {
                    }
                    storyItem3 = m5Var.a;
                    if (storyItem3 != null) {
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    f5Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout8, m5Var.a);
                    if (o5Var.c3) {
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    f6Var = f6Var2;
                }
            }
            i10 = -1;
            if (!o5Var.c3) {
                if (!UserConfig.getInstance(o5Var.C2).isPremium()) {
                }
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            if (!MessagesController.getInstance(o5Var.C2).premiumFeaturesBlocked()) {
            }
            if (o5Var.U2) {
            }
            if (o5Var.U2) {
            }
            storyItem3 = m5Var.a;
            if (storyItem3 != null) {
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            f5Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout8, m5Var.a);
            if (o5Var.c3) {
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            f6Var = f6Var2;
        }
        boolean z19 = (m5Var == null || (storyItem2 = m5Var.a) == null || (messageMedia = storyItem2.media) == null || (!MessageObject.isDocumentHasAttachedStickers(messageMedia.document) && ((photo = m5Var.a.media.photo) == null || !photo.has_stickers))) ? false : true;
        if (m5Var != null) {
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList3 = new ArrayList();
            TL_stories.StoryItem storyItem8 = m5Var.a;
            if (storyItem8 != null && storyItem8.media_areas != null) {
                for (int i19 = 0; i19 < m5Var.a.media_areas.size(); i19++) {
                    TL_stories.MediaArea mediaArea2 = m5Var.a.media_areas.get(i19);
                    if (mediaArea2 instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                        TLRPC.Reaction reaction = mediaArea2.reaction;
                        if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                            TLRPC.Document f7 = org.telegram.ui.Components.q5.f(o5Var.C2, ((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
                            if (f7 != null && (inputStickerSet2 = MessageObject.getInputStickerSet(f7)) != null && !hashSet2.contains(Long.valueOf(inputStickerSet2.id))) {
                                hashSet2.add(Long.valueOf(inputStickerSet2.id));
                                arrayList3.add(inputStickerSet2);
                            }
                        }
                    }
                }
            }
            TL_stories.StoryItem storyItem9 = m5Var.a;
            if (storyItem9 == null || (arrayList2 = storyItem9.entities) == null || arrayList2.isEmpty()) {
                t8 t8Var = m5Var.b;
                if (t8Var != null && (o8Var = t8Var.c) != null) {
                    if (o8Var.T0 != null) {
                        for (int i20 = 0; i20 < m5Var.b.c.T0.size(); i20++) {
                            VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) m5Var.b.c.T0.get(i20);
                            if (mediaEntity.type == 4 && (mediaArea = mediaEntity.mediaArea) != null) {
                                TLRPC.Reaction reaction2 = mediaArea.reaction;
                                if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                    TLRPC.Document f10 = org.telegram.ui.Components.q5.f(o5Var.C2, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id);
                                    if (f10 != null && (inputStickerSet = MessageObject.getInputStickerSet(f10)) != null && !hashSet2.contains(Long.valueOf(inputStickerSet.id))) {
                                        hashSet2.add(Long.valueOf(inputStickerSet.id));
                                        arrayList3.add(inputStickerSet);
                                    }
                                }
                            }
                        }
                    }
                    CharSequence charSequence = m5Var.b.c.C0;
                    if ((charSequence instanceof Spanned) && (z5VarArr = (org.telegram.ui.Components.z5[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.z5.class)) != null) {
                        int i21 = 0;
                        while (i21 < z5VarArr.length) {
                            org.telegram.ui.Components.z5 z5Var = z5VarArr[i21];
                            TLRPC.Document document = z5Var.document;
                            if (document == null) {
                                num2 = num3;
                                document = org.telegram.ui.Components.q5.f(o5Var.C2, z5Var.documentId);
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
                for (int i22 = 0; i22 < m5Var.a.entities.size(); i22++) {
                    TLRPC.MessageEntity messageEntity = m5Var.a.entities.get(i22);
                    if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                        TLRPC.Document document2 = tL_messageEntityCustomEmoji.document;
                        if (document2 == null) {
                            document2 = org.telegram.ui.Components.q5.f(o5Var.C2, tL_messageEntityCustomEmoji.document_id);
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
        boolean z20 = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (z19 || z20) {
            org.telegram.ui.ActionBar.k1 k1Var3 = new org.telegram.ui.ActionBar.k1(context, org.telegram.ui.ActionBar.j6.H8, f6Var);
            k1Var3.setTag(R.id.fit_width_tag, num);
            actionBarPopupWindow$ActionBarPopupWindowLayout6.a(k1Var3, w7.x5.n(-1, 8));
            TLRPC.MessageMedia messageMedia3 = m5Var.a.media;
            TLObject tLObject = messageMedia3.document;
            if (tLObject == null) {
                tLObject = messageMedia3.photo;
            }
            ja jaVar = new ja(f5Var.i, o5Var.C2, tLObject, m5Var.a, z19, arrayList, f5Var.d);
            jaVar.setOnClickListener(new u1(3, f5Var, jaVar));
            jaVar.setTag(R.id.fit_width_tag, num);
            actionBarPopupWindow$ActionBarPopupWindowLayout6.a(jaVar, w7.x5.n(-1, -2));
        }
    }

    @Override // org.telegram.ui.Components.wr
    public final void c() {
        if (!this.c && !this.k[0]) {
            AndroidUtilities.runOnUIThread(new x4(this, 0));
        }
        o5 o5Var = this.l;
        o5Var.t1 = null;
        o5Var.s1 = null;
    }

    public final void d(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z10) {
        m5 m5Var;
        boolean z11 = this.f;
        o5 o5Var = this.l;
        if (!z11 || ((m5Var = o5Var.O1) != null && m5Var.b != null)) {
            o5Var.C3 = null;
            o5Var.D3 = null;
            return;
        }
        Context context = o5Var.getContext();
        ug0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
        final pf.b bVar = new pf.b(5, this, actionBarPopupWindow$ActionBarPopupWindowLayout);
        bs bsVar = new bs();
        org.telegram.ui.ActionBar.f1[] f1VarArr = new org.telegram.ui.ActionBar.f1[5];
        bsVar.c = f1VarArr;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, context, null);
        bsVar.a = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setFitItems(true);
        org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, null);
        c10.setOnClickListener(new org.telegram.ui.wr(swipeBack, 1));
        c10.c(-328966, -328966);
        c10.setSelectorColor(268435455);
        View g5Var = new g5(context, 12);
        g5Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        g5Var.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(g5Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) g5Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(8.0f);
        g5Var.setLayoutParams(layoutParams);
        org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(context, null);
        bsVar.b = b1Var;
        b1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        b1Var.setDrawShadow(false);
        b1Var.setBackgroundColor(-14540254);
        b1Var.setTextColor(-1);
        b1Var.setOnValueChange(new org.telegram.ui.b5(bVar, 6));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(b1Var, w7.x5.n(-1, 44));
        View g5Var2 = new g5(context, 13);
        g5Var2.setMinimumWidth(AndroidUtilities.dp(196.0f));
        g5Var2.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(g5Var2);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) g5Var2.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams2.gravity = 5;
        }
        layoutParams2.width = -1;
        layoutParams2.height = AndroidUtilities.dp(8.0f);
        g5Var2.setLayoutParams(layoutParams2);
        org.telegram.ui.ActionBar.f1 c11 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_0_2, LocaleController.getString(R.string.SpeedVerySlow), false, null);
        c11.c(-328966, -328966);
        final int i10 = 0;
        c11.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.as
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        bVar.c0(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.c0(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.c0(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.c0(true, true, 1.5f);
                        break;
                    default:
                        bVar.c0(true, true, 2.0f);
                        break;
                }
            }
        });
        c11.setSelectorColor(268435455);
        f1VarArr[0] = c11;
        org.telegram.ui.ActionBar.f1 c12 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow), false, null);
        c12.c(-328966, -328966);
        final int i11 = 1;
        c12.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.as
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        bVar.c0(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.c0(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.c0(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.c0(true, true, 1.5f);
                        break;
                    default:
                        bVar.c0(true, true, 2.0f);
                        break;
                }
            }
        });
        c12.setSelectorColor(268435455);
        f1VarArr[1] = c12;
        org.telegram.ui.ActionBar.f1 c13 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal), false, null);
        c13.c(-328966, -328966);
        final int i12 = 2;
        c13.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.as
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        bVar.c0(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.c0(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.c0(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.c0(true, true, 1.5f);
                        break;
                    default:
                        bVar.c0(true, true, 2.0f);
                        break;
                }
            }
        });
        c13.setSelectorColor(268435455);
        f1VarArr[2] = c13;
        org.telegram.ui.ActionBar.f1 c14 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast), false, null);
        c14.c(-328966, -328966);
        final int i13 = 3;
        c14.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.as
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        bVar.c0(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.c0(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.c0(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.c0(true, true, 1.5f);
                        break;
                    default:
                        bVar.c0(true, true, 2.0f);
                        break;
                }
            }
        });
        c14.setSelectorColor(268435455);
        f1VarArr[3] = c14;
        org.telegram.ui.ActionBar.f1 c15 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedVeryFast), false, null);
        c15.c(-328966, -328966);
        final int i14 = 4;
        c15.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.as
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        bVar.c0(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.c0(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.c0(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.c0(true, true, 1.5f);
                        break;
                    default:
                        bVar.c0(true, true, 2.0f);
                        break;
                }
            }
        });
        c15.setSelectorColor(268435455);
        f1VarArr[4] = c15;
        o5Var.C3 = bsVar;
        bsVar.a(pb.B1, true);
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, o5Var.getContext(), this.d, false, false);
        o5Var.D3 = f1Var;
        f1Var.g(LocaleController.getString(R.string.Speed), R.drawable.msg_speed, null);
        o5.a0(o5Var, true);
        o5Var.D3.setMinimumWidth(AndroidUtilities.dp(196.0f));
        o5Var.D3.setRightIcon(R.drawable.msg_arrowright);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(o5Var.D3);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) o5Var.D3.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams3.gravity = 5;
        }
        layoutParams3.width = -1;
        layoutParams3.height = AndroidUtilities.dp(48.0f);
        o5Var.D3.setLayoutParams(layoutParams3);
        int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(o5Var.C3.a);
        org.telegram.ui.ActionBar.f1 f1Var2 = o5Var.D3;
        f1Var2.G = new y4(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 0);
        f1Var2.setOnClickListener(new t4(this, 11));
        actionBarPopupWindow$ActionBarPopupWindowLayout.c = true;
        if (z10) {
            org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(o5Var.getContext(), org.telegram.ui.ActionBar.j6.H8, this.d);
            k1Var.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(k1Var, w7.x5.n(-1, 8));
        }
    }

    public final void e(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, TL_stories.StoryItem storyItem) {
        TLRPC.Chat chat;
        o5 o5Var = this.l;
        if (!o5Var.D1 || storyItem == null || (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) || (chat = MessagesController.getInstance(o5Var.C2).getChat(Long.valueOf(-o5Var.B1))) == null) {
            return;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(o5Var.C2).getChatFull(chat.id);
        if (chatFull == null) {
            chatFull = MessagesStorage.getInstance(o5Var.C2).loadChatInfo(chat.id, true, new CountDownLatch(1), false, false);
        }
        if (chatFull == null || !chatFull.can_view_stats) {
            return;
        }
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stats, LocaleController.getString(R.string.ViewStatistics), false, this.d).setOnClickListener(new z4(this, storyItem, this.e, chat, 0));
    }
}
