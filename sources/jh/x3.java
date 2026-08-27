package jh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import hh.y9;
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
import org.telegram.ui.Components.b31;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.hg0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mc;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.mr;
import org.telegram.ui.rr;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class x3 extends lr {
    public boolean c;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 d;
    public final /* synthetic */ i9 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Context i;
    public final /* synthetic */ b4 j;
    public final /* synthetic */ boolean[] k;
    public final /* synthetic */ e4 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(e4 e4Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.ActionBar.c6 c6Var2, i9 i9Var, boolean z10, boolean z11, boolean z12, Context context2, b4 b4Var, boolean[] zArr) {
        super(context, c6Var, true);
        this.l = e4Var;
        this.d = c6Var2;
        this.e = i9Var;
        this.f = z10;
        this.g = z11;
        this.h = z12;
        this.i = context2;
        this.j = b4Var;
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
    /* JADX WARN: Code restructure failed: missing block: B:399:0x08a9, code lost:
    
        if (r2.bot_can_edit == false) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x08d7, code lost:
    
        if (r2.delete_stories == false) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x08e2, code lost:
    
        if (r0.delete_stories == false) goto L343;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03db  */
    /* JADX WARN: Type inference failed for: r4v92, types: [org.telegram.tgnet.TLRPC$User] */
    @Override // org.telegram.ui.Components.lr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        org.telegram.ui.ActionBar.c6 c6Var;
        final x3 x3Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        TL_stories.StoryItem storyItem;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3;
        i9 i9Var;
        i9 i9Var2;
        final i9 i9Var3;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout5;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout6;
        d1 d1Var;
        TLRPC.GroupCall groupCall;
        d1 d1Var2;
        Integer num;
        ArrayList arrayList;
        lh.z7 z7Var;
        org.telegram.ui.Components.t5[] t5VarArr;
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
        org.telegram.ui.ActionBar.c6 c6Var2;
        i9 i9Var4;
        final i9 i9Var5;
        int i10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout7;
        TL_stories.StoryItem storyItem3;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout8;
        TLRPC.User user2;
        TLRPC.Chat chat3;
        boolean z10;
        boolean z11;
        Integer num3 = 1;
        e4 e4Var = this.l;
        c4 c4Var = e4Var.K1;
        boolean z12 = this.g;
        Context context = this.i;
        i9 i9Var6 = this.e;
        org.telegram.ui.ActionBar.c6 c6Var3 = this.d;
        if (z12 || c4Var.b != null) {
            c6Var = c6Var3;
            x3Var = this;
            TL_stories.StoryItem storyItem4 = c4Var.a;
            if (c4Var.b != null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_cancel, LocaleController.getString(R.string.Cancel), false, x3Var.d).setOnClickListener(new o3(x3Var, 6));
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            }
            if (storyItem4 == null) {
                return;
            }
            if ((e4Var.y1 || e4Var.O1.h(e4Var.x1)) && !c4Var.f && (storyItem = c4Var.a) != null) {
                HashSet hashSet = storyItem.albums != null ? new HashSet(storyItem.albums) : new HashSet();
                b70 b70Var = new b70(actionBarPopupWindow$ActionBarPopupWindowLayout2, c6Var);
                b70Var.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new y9(actionBarPopupWindow$ActionBarPopupWindowLayout2, 13), false);
                b70Var.k();
                f6 B = e4Var.getStoriesController().B(e4Var.x1, true);
                f6 B2 = e4Var.O1.B(e4Var.x1, false);
                b70.f(b70Var, B, hashSet, B2 != null && B2.a(), new j3.m(x3Var, c6Var, storyItem, 3), new cg.e1(x3Var, hashSet, storyItem, c6Var, 4));
                int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout2.b(b70Var.B);
                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, e4Var.getContext(), x3Var.d, false, false);
                e4Var.A3 = f1Var;
                f1Var.g(LocaleController.getString(R.string.StoriesAlbumAddToAlbum), R.drawable.menu_album_add, null);
                org.telegram.ui.ActionBar.f1 f1Var2 = e4Var.A3;
                f1Var2.C = new s3(actionBarPopupWindow$ActionBarPopupWindowLayout2, b10, 1);
                f1Var2.setOnClickListener(new o3(x3Var, 12));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(e4Var.A3);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.c = true;
                org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(e4Var.getContext(), org.telegram.ui.ActionBar.g6.H8, c6Var);
                k1Var.setTag(R.id.fit_width_tag, num3);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(k1Var, h7.z5.n(-1, 8));
            }
            if (e4Var.y1) {
                lh.o9 o9Var = storyItem4.privacy.isEmpty() ? new lh.o9(3, e4Var.y2, new ArrayList()) : new lh.o9(e4Var.y2, storyItem4.privacy);
                actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, R.drawable.msg_view_file, LocaleController.getString(R.string.WhoCanSee), false, x3Var.d);
                c10.setSubtext(o9Var.toString());
                c10.setOnClickListener(new gg.f(x3Var, o9Var, storyItem4, 10));
                c10.setItemHeight(56);
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            }
            x3Var.d(actionBarPopupWindow$ActionBarPopupWindowLayout3, false);
            if (e4Var.y1 || x3Var.f) {
                org.telegram.ui.ActionBar.k1 k1Var2 = new org.telegram.ui.ActionBar.k1(e4Var.getContext(), org.telegram.ui.ActionBar.g6.H8, c6Var);
                k1Var2.setTag(R.id.fit_width_tag, num3);
                actionBarPopupWindow$ActionBarPopupWindowLayout3.a(k1Var2, h7.z5.n(-1, 8));
            }
            if (e4Var.Y2 || c4Var.f || !((e4Var.I0() || MessagesController.getInstance(e4Var.y2).storiesEnabled()) && x3Var.h)) {
                i9Var = i9Var6;
            } else {
                org.telegram.ui.ActionBar.f1 c11 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, R.drawable.msg_edit, LocaleController.getString(e4Var.I0() ? R.string.EditBotPreview : R.string.EditStory), false, x3Var.d);
                e4Var.o1 = c11;
                i9Var = i9Var6;
                c11.setOnClickListener(new b0(x3Var, x3Var.d, x3Var.i, i9Var6, x3Var.j, 2));
                if (e4Var.O1.K(e4Var.x1) && c4Var.e && !SharedConfig.allowPreparingHevcPlayers()) {
                    e4Var.o1.setAlpha(0.5f);
                }
            }
            TL_stories.StoryItem storyItem5 = c4Var.a;
            if (storyItem5 == null || !c4Var.e || c4Var.f || !(storyItem5.pinned || e4Var.J0())) {
                i9Var2 = i9Var;
            } else {
                i9Var2 = i9Var;
                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_cover_stories, LocaleController.getString(R.string.StoryEditCoverMenu), false, x3Var.d).setOnClickListener(new b0(x3Var, x3Var.i, storyItem4, i9Var2, x3Var.j, 3));
            }
            if ((e4Var.y1 || (e4Var.z1 && MessagesController.getInstance(e4Var.y2).getStoriesController().h(storyItem4.dialogId))) && !c4Var.f) {
                boolean z13 = storyItem4.pinned;
                boolean z14 = !z13;
                i9Var3 = i9Var2;
                actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, !z13 ? R.drawable.msg_save_story : R.drawable.menu_unsave_story, e4Var.y1 ? LocaleController.getString(!z13 ? R.string.SaveToProfile : R.string.ArchiveStory) : LocaleController.getString(!z13 ? R.string.SaveToPosts : R.string.RemoveFromPosts), false, x3Var.d).setOnClickListener(new ag.u1(x3Var, storyItem4, z14, c6Var, 1));
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                i9Var3 = i9Var2;
            }
            x3Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout4, storyItem4);
            if (e4Var.Y2 || c4Var.f) {
                actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout5, R.drawable.msg_gallery, LocaleController.getString(c4Var.e ? R.string.SaveVideo : R.string.SaveImage), false, x3Var.d).setOnClickListener(new o3(x3Var, 7));
            }
            if (!MessagesController.getInstance(e4Var.y2).premiumFeaturesBlocked() && !c4Var.f && !e4Var.z1) {
                e4.b0(e4Var, actionBarPopupWindow$ActionBarPopupWindowLayout5);
            }
            if (e4Var.z1 && e4Var.Q2) {
                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout5, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), false, x3Var.d).setOnClickListener(new o3(x3Var, 8));
            }
            if (e4Var.Q2) {
                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_shareout, LocaleController.getString(R.string.BotShare), false, x3Var.d).setOnClickListener(new o3(x3Var, 9));
            }
            TL_stories.StoryItem storyItem6 = c4Var.a;
            if (storyItem6 != null) {
                TLRPC.MessageMedia messageMedia2 = storyItem6.media;
                if ((messageMedia2 instanceof TLRPC.TL_messageMediaVideoStream) && (d1Var2 = d1.S) != null && d1Var2.f(((TLRPC.TL_messageMediaVideoStream) messageMedia2).call)) {
                    d1 d1Var3 = d1.S;
                    boolean z15 = d1Var3 != null && d1Var3.o();
                    org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, z15 ? R.drawable.msg_voice_unmuted : R.drawable.msg_voice_muted, LocaleController.getString(z15 ? R.string.Unmute : R.string.Mute), false, x3Var.d).setOnClickListener(new a2(1, x3Var, z15));
                    org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_camera_retake, LocaleController.getString(R.string.AccDescrSwitchCamera), false, x3Var.d).setOnClickListener(new o3(x3Var, 10));
                }
            }
            if (c4Var.f) {
                final int i11 = 1;
                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_video_pip, LocaleController.getString(R.string.PipMinimize), false, x3Var.d).setOnClickListener(new View.OnClickListener(x3Var) { // from class: jh.p3
                    public final /* synthetic */ x3 b;

                    {
                        this.b = x3Var;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                x3 x3Var2 = this.b.l.p1;
                                if (x3Var2 != null) {
                                    x3Var2.a();
                                }
                                i9Var3.N();
                                break;
                            default:
                                x3 x3Var3 = this.b.l.p1;
                                if (x3Var3 != null) {
                                    x3Var3.a();
                                }
                                i9Var3.N();
                                break;
                        }
                    }
                });
            }
            if (c4Var.f && (e4Var.x1 == UserConfig.getInstance(e4Var.y2).getClientUserId() || ChatObject.canManageCalls(MessagesController.getInstance(e4Var.y2).getChat(Long.valueOf(-e4Var.x1))) || ((d1Var = i9Var3.w0) != null && c4Var.k(d1Var.g()) && (groupCall = i9Var3.w0.v) != null && groupCall.creator))) {
                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_settings_old, LocaleController.getString(R.string.LiveStorySettings), false, x3Var.d).setOnClickListener(new q3(x3Var, c6Var, i9Var3, 1));
            }
            if (c4Var.f) {
                org.telegram.ui.ActionBar.f1 c12 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_remove, LocaleController.getString(R.string.LiveStoryEnd), false, x3Var.d);
                int i12 = org.telegram.ui.ActionBar.g6.q7;
                c12.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.v0(i12, c6Var)));
                c12.c(c6Var.N0(i12), c6Var.N0(i12));
                c12.setOnClickListener(new q3(x3Var, c6Var, i9Var3, 2));
            }
            if (!c4Var.f) {
                if (!e4Var.y1) {
                    s6 storiesController = MessagesController.getInstance(e4Var.y2).getStoriesController();
                    TL_stories.StoryItem storyItem7 = c4Var.a;
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
                org.telegram.ui.ActionBar.f1 c13 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout6, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), false, x3Var.d);
                int i14 = org.telegram.ui.ActionBar.g6.q7;
                c13.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.v0(i14, c6Var)));
                c13.c(c6Var.N0(i14), c6Var.N0(i14));
                c13.setOnClickListener(new o3(x3Var, 13));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        } else {
            d(actionBarPopupWindow$ActionBarPopupWindowLayout, true);
            final String sharedPrefKey = NotificationsController.getSharedPrefKey(e4Var.x1, 0L);
            boolean c02 = NotificationsCustomSettingsActivity.c0(e4Var.y2, e4Var.x1);
            if (e4Var.x1 > 0) {
                ?? user4 = MessagesController.getInstance(e4Var.y2).getUser(Long.valueOf(e4Var.x1));
                chat2 = user4;
                chat = null;
                user = user4;
            } else {
                chat = MessagesController.getInstance(e4Var.y2).getChat(Long.valueOf(-e4Var.x1));
                chat2 = chat;
                user = null;
            }
            String trim = user == null ? chat == null ? "" : chat.title : UserObject.getFirstName(user).trim();
            int indexOf = trim.indexOf(" ");
            if (indexOf > 0) {
                trim = trim.substring(0, indexOf);
            }
            final String str = trim;
            if (UserObject.isService(e4Var.x1) || e4Var.I0()) {
                x3Var = this;
                c6Var2 = c6Var3;
                i9Var4 = i9Var6;
            } else {
                if (c02) {
                    user2 = user;
                    i9Var4 = i9Var6;
                    chat3 = chat;
                    c6Var2 = c6Var3;
                    org.telegram.ui.ActionBar.f1 c14 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), false, this.d);
                    final int i15 = 0;
                    final org.telegram.ui.ActionBar.c6 c6Var4 = this.d;
                    final TLRPC.Chat chat5 = chat2;
                    x3Var = this;
                    c14.setOnClickListener(new View.OnClickListener(this) { // from class: jh.v3
                        public final /* synthetic */ x3 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i16 = i15;
                            String str2 = str;
                            TLObject tLObject = chat5;
                            org.telegram.ui.ActionBar.c6 c6Var5 = c6Var4;
                            String str3 = sharedPrefKey;
                            x3 x3Var2 = this.b;
                            switch (i16) {
                                case 0:
                                    e4 e4Var2 = x3Var2.l;
                                    MessagesController.getNotificationsSettings(e4Var2.y2).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str3, false).apply();
                                    NotificationsController.getInstance(e4Var2.y2).updateServerNotificationsSettings(e4Var2.x1, 0L);
                                    ec V = new mc(e4Var2.Y0, c6Var5).V(Arrays.asList(tLObject), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, str2)), null, null);
                                    V.a = 2;
                                    V.j();
                                    x3 x3Var3 = e4Var2.p1;
                                    if (x3Var3 != null) {
                                        x3Var3.a();
                                        break;
                                    }
                                    break;
                                default:
                                    e4 e4Var3 = x3Var2.l;
                                    MessagesController.getNotificationsSettings(e4Var3.y2).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str3, true).apply();
                                    NotificationsController.getInstance(e4Var3.y2).updateServerNotificationsSettings(e4Var3.x1, 0L);
                                    ec V2 = new mc(e4Var3.Y0, c6Var5).V(Arrays.asList(tLObject), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, str2)), null, null);
                                    V2.a = 2;
                                    V2.j();
                                    x3 x3Var4 = e4Var3.p1;
                                    if (x3Var4 != null) {
                                        x3Var4.a();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    c14.setMultiline(false);
                } else {
                    x3Var = this;
                    user2 = user;
                    chat3 = chat;
                    c6Var2 = c6Var3;
                    i9Var4 = i9Var6;
                    final TLRPC.Chat chat6 = chat2;
                    org.telegram.ui.ActionBar.f1 c15 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), false, x3Var.d);
                    final int i16 = 1;
                    final org.telegram.ui.ActionBar.c6 c6Var5 = x3Var.d;
                    c15.setOnClickListener(new View.OnClickListener(x3Var) { // from class: jh.v3
                        public final /* synthetic */ x3 b;

                        {
                            this.b = x3Var;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i162 = i16;
                            String str2 = str;
                            TLObject tLObject = chat6;
                            org.telegram.ui.ActionBar.c6 c6Var52 = c6Var5;
                            String str3 = sharedPrefKey;
                            x3 x3Var2 = this.b;
                            switch (i162) {
                                case 0:
                                    e4 e4Var2 = x3Var2.l;
                                    MessagesController.getNotificationsSettings(e4Var2.y2).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str3, false).apply();
                                    NotificationsController.getInstance(e4Var2.y2).updateServerNotificationsSettings(e4Var2.x1, 0L);
                                    ec V = new mc(e4Var2.Y0, c6Var52).V(Arrays.asList(tLObject), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, str2)), null, null);
                                    V.a = 2;
                                    V.j();
                                    x3 x3Var3 = e4Var2.p1;
                                    if (x3Var3 != null) {
                                        x3Var3.a();
                                        break;
                                    }
                                    break;
                                default:
                                    e4 e4Var3 = x3Var2.l;
                                    MessagesController.getNotificationsSettings(e4Var3.y2).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str3, true).apply();
                                    NotificationsController.getInstance(e4Var3.y2).updateServerNotificationsSettings(e4Var3.x1, 0L);
                                    ec V2 = new mc(e4Var3.Y0, c6Var52).V(Arrays.asList(tLObject), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, str2)), null, null);
                                    V2.a = 2;
                                    V2.j();
                                    x3 x3Var4 = e4Var3.p1;
                                    if (x3Var4 != null) {
                                        x3Var4.a();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    c15.setMultiline(false);
                }
                MediaDataController.getInstance(e4Var.y2).loadHints(true);
                boolean z17 = (user2 == null || user2.contact || !MediaDataController.getInstance(e4Var.y2).containsTopPeer(e4Var.x1)) ? false : true;
                if (e4Var.x1 > 0) {
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
                    org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), false, x3Var.d).setOnClickListener(new o3(x3Var, 14));
                } else if (z10) {
                    if (z11) {
                        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), false, x3Var.d).setOnClickListener(new o3(x3Var, 0));
                    } else {
                        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), false, x3Var.d).setOnClickListener(new o3(x3Var, 15));
                    }
                }
            }
            if (c4Var.f) {
                final int i17 = 0;
                i9Var5 = i9Var4;
                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_video_pip, LocaleController.getString(R.string.PipMinimize), false, x3Var.d).setOnClickListener(new View.OnClickListener(x3Var) { // from class: jh.p3
                    public final /* synthetic */ x3 b;

                    {
                        this.b = x3Var;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i17) {
                            case 0:
                                x3 x3Var2 = this.b.l.p1;
                                if (x3Var2 != null) {
                                    x3Var2.a();
                                }
                                i9Var5.N();
                                break;
                            default:
                                x3 x3Var3 = this.b.l.p1;
                                if (x3Var3 != null) {
                                    x3Var3.a();
                                }
                                i9Var5.N();
                                break;
                        }
                    }
                });
            } else {
                i9Var5 = i9Var4;
            }
            if (!MessagesController.getInstance(e4Var.y2).premiumFeaturesBlocked() && c4Var.e) {
                boolean z18 = MessagesController.getInstance(e4Var.y2).storyQualityFull;
                if (UserConfig.getInstance(e4Var.y2).isPremium()) {
                    org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, z18 ? R.drawable.menu_quality_sd : R.drawable.menu_quality_hd, LocaleController.getString(z18 ? R.string.StoryQualityDecrease : R.string.StoryQualityIncrease), false, e4Var.x0).setOnClickListener(new a2(0, e4Var, z18));
                } else {
                    Drawable drawable = e4Var.getContext().getDrawable(R.drawable.msg_gallery_locked2);
                    i10 = -1;
                    drawable.setColorFilter(new PorterDuffColorFilter(i0.b.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                    i2 i2Var = new i2(e4Var.getContext().getDrawable(R.drawable.menu_quality_hd2), drawable, 1);
                    int dp = AndroidUtilities.dp(24.0f);
                    int dp2 = AndroidUtilities.dp(24.0f);
                    i2Var.e = dp;
                    i2Var.f = dp2;
                    int dp3 = AndroidUtilities.dp(1.0f);
                    int i18 = -AndroidUtilities.dp(2.0f);
                    i2Var.s = dp3;
                    i2Var.v = i18;
                    org.telegram.ui.ActionBar.f1 c16 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_quality_hd, LocaleController.getString(R.string.StoryQualityIncrease), false, e4Var.x0);
                    c16.setOnClickListener(new x1(e4Var, 7));
                    c16.setIcon(i2Var);
                    if (!e4Var.Y2 && e4Var.O2 && !c4Var.f) {
                        if (!UserConfig.getInstance(e4Var.y2).isPremium()) {
                            org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_gallery, LocaleController.getString(R.string.SaveToGallery), false, x3Var.d).setOnClickListener(new o3(x3Var, 1));
                        } else if (!MessagesController.getInstance(e4Var.y2).premiumFeaturesBlocked()) {
                            Drawable drawable2 = context.getDrawable(R.drawable.msg_gallery_locked2);
                            drawable2.setColorFilter(new PorterDuffColorFilter(i0.b.d(0.5f, i10, -16777216), PorterDuff.Mode.MULTIPLY));
                            i2 i2Var2 = new i2(context.getDrawable(R.drawable.msg_gallery_locked1), drawable2, 2);
                            actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            org.telegram.ui.ActionBar.f1 c17 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_gallery, LocaleController.getString(R.string.SaveToGallery), false, x3Var.d);
                            c17.setIcon(i2Var2);
                            c17.setOnClickListener(new gg.f(x3Var, c17, i9Var5, 11));
                            if (!MessagesController.getInstance(e4Var.y2).premiumFeaturesBlocked() && !e4Var.z1) {
                                e4.b0(e4Var, actionBarPopupWindow$ActionBarPopupWindowLayout7);
                            }
                            if (e4Var.Q2) {
                                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), false, x3Var.d).setOnClickListener(new o3(x3Var, 2));
                            }
                            if (e4Var.Q2) {
                                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_shareout, LocaleController.getString(R.string.BotShare), false, x3Var.d).setOnClickListener(new o3(x3Var, 3));
                            }
                            storyItem3 = c4Var.a;
                            if (storyItem3 != null) {
                                if (storyItem3.translated && TextUtils.equals(storyItem3.translatedLng, b31.C())) {
                                    org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_translate, LocaleController.getString(R.string.HideTranslation), false, x3Var.d).setOnClickListener(new o3(x3Var, 4));
                                } else if (MessagesController.getInstance(e4Var.y2).getTranslateController().canTranslateStory(c4Var.a)) {
                                    actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                    org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout8, R.drawable.msg_translate, LocaleController.getString(R.string.TranslateMessage), false, x3Var.d).setOnClickListener(new o3(x3Var, 5));
                                    x3Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout8, c4Var.a);
                                    if (!e4Var.Y2 || UserObject.isService(e4Var.x1) || e4Var.I0()) {
                                        actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                        c6Var = c6Var2;
                                    } else {
                                        c6Var = c6Var2;
                                        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout8, R.drawable.msg_report, LocaleController.getString(R.string.ReportChat), false, x3Var.d).setOnClickListener(new q3(x3Var, i9Var5, c6Var));
                                        actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                    }
                                }
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            x3Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout8, c4Var.a);
                            if (e4Var.Y2) {
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            c6Var = c6Var2;
                        }
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    if (!MessagesController.getInstance(e4Var.y2).premiumFeaturesBlocked()) {
                        e4.b0(e4Var, actionBarPopupWindow$ActionBarPopupWindowLayout7);
                    }
                    if (e4Var.Q2) {
                    }
                    if (e4Var.Q2) {
                    }
                    storyItem3 = c4Var.a;
                    if (storyItem3 != null) {
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    x3Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout8, c4Var.a);
                    if (e4Var.Y2) {
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    c6Var = c6Var2;
                }
            }
            i10 = -1;
            if (!e4Var.Y2) {
                if (!UserConfig.getInstance(e4Var.y2).isPremium()) {
                }
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            if (!MessagesController.getInstance(e4Var.y2).premiumFeaturesBlocked()) {
            }
            if (e4Var.Q2) {
            }
            if (e4Var.Q2) {
            }
            storyItem3 = c4Var.a;
            if (storyItem3 != null) {
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            x3Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout8, c4Var.a);
            if (e4Var.Y2) {
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            c6Var = c6Var2;
        }
        boolean z19 = (c4Var == null || (storyItem2 = c4Var.a) == null || (messageMedia = storyItem2.media) == null || (!MessageObject.isDocumentHasAttachedStickers(messageMedia.document) && ((photo = c4Var.a.media.photo) == null || !photo.has_stickers))) ? false : true;
        if (c4Var != null) {
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList3 = new ArrayList();
            TL_stories.StoryItem storyItem8 = c4Var.a;
            if (storyItem8 != null && storyItem8.media_areas != null) {
                for (int i19 = 0; i19 < c4Var.a.media_areas.size(); i19++) {
                    TL_stories.MediaArea mediaArea2 = c4Var.a.media_areas.get(i19);
                    if (mediaArea2 instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                        TLRPC.Reaction reaction = mediaArea2.reaction;
                        if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                            TLRPC.Document f10 = org.telegram.ui.Components.k5.f(e4Var.y2, ((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
                            if (f10 != null && (inputStickerSet2 = MessageObject.getInputStickerSet(f10)) != null && !hashSet2.contains(Long.valueOf(inputStickerSet2.id))) {
                                hashSet2.add(Long.valueOf(inputStickerSet2.id));
                                arrayList3.add(inputStickerSet2);
                            }
                        }
                    }
                }
            }
            TL_stories.StoryItem storyItem9 = c4Var.a;
            if (storyItem9 == null || (arrayList2 = storyItem9.entities) == null || arrayList2.isEmpty()) {
                r6 r6Var = c4Var.b;
                if (r6Var != null && (z7Var = r6Var.c) != null) {
                    if (z7Var.T0 != null) {
                        for (int i20 = 0; i20 < c4Var.b.c.T0.size(); i20++) {
                            VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) c4Var.b.c.T0.get(i20);
                            if (mediaEntity.type == 4 && (mediaArea = mediaEntity.mediaArea) != null) {
                                TLRPC.Reaction reaction2 = mediaArea.reaction;
                                if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                    TLRPC.Document f11 = org.telegram.ui.Components.k5.f(e4Var.y2, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id);
                                    if (f11 != null && (inputStickerSet = MessageObject.getInputStickerSet(f11)) != null && !hashSet2.contains(Long.valueOf(inputStickerSet.id))) {
                                        hashSet2.add(Long.valueOf(inputStickerSet.id));
                                        arrayList3.add(inputStickerSet);
                                    }
                                }
                            }
                        }
                    }
                    CharSequence charSequence = c4Var.b.c.C0;
                    if ((charSequence instanceof Spanned) && (t5VarArr = (org.telegram.ui.Components.t5[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.t5.class)) != null) {
                        int i21 = 0;
                        while (i21 < t5VarArr.length) {
                            org.telegram.ui.Components.t5 t5Var = t5VarArr[i21];
                            TLRPC.Document document = t5Var.document;
                            if (document == null) {
                                num2 = num3;
                                document = org.telegram.ui.Components.k5.f(e4Var.y2, t5Var.documentId);
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
                for (int i22 = 0; i22 < c4Var.a.entities.size(); i22++) {
                    TLRPC.MessageEntity messageEntity = c4Var.a.entities.get(i22);
                    if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                        TLRPC.Document document2 = tL_messageEntityCustomEmoji.document;
                        if (document2 == null) {
                            document2 = org.telegram.ui.Components.k5.f(e4Var.y2, tL_messageEntityCustomEmoji.document_id);
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
            org.telegram.ui.ActionBar.k1 k1Var3 = new org.telegram.ui.ActionBar.k1(context, org.telegram.ui.ActionBar.g6.H8, c6Var);
            k1Var3.setTag(R.id.fit_width_tag, num);
            actionBarPopupWindow$ActionBarPopupWindowLayout6.a(k1Var3, h7.z5.n(-1, 8));
            TLRPC.MessageMedia messageMedia3 = c4Var.a.media;
            TLObject tLObject = messageMedia3.document;
            if (tLObject == null) {
                tLObject = messageMedia3.photo;
            }
            d8 d8Var = new d8(x3Var.i, e4Var.y2, tLObject, c4Var.a, z19, arrayList, x3Var.d);
            d8Var.setOnClickListener(new ag.q0(25, x3Var, d8Var));
            d8Var.setTag(R.id.fit_width_tag, num);
            actionBarPopupWindow$ActionBarPopupWindowLayout6.a(d8Var, h7.z5.n(-1, -2));
        }
    }

    @Override // org.telegram.ui.Components.lr
    public final void c() {
        if (!this.c && !this.k[0]) {
            AndroidUtilities.runOnUIThread(new r3(this, 0));
        }
        e4 e4Var = this.l;
        e4Var.p1 = null;
        e4Var.o1 = null;
    }

    public final void d(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z10) {
        c4 c4Var;
        boolean z11 = this.f;
        e4 e4Var = this.l;
        if (!z11 || ((c4Var = e4Var.K1) != null && c4Var.b != null)) {
            e4Var.y3 = null;
            e4Var.z3 = null;
            return;
        }
        Context context = e4Var.getContext();
        hg0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
        final g5.b bVar = new g5.b(this, actionBarPopupWindow$ActionBarPopupWindowLayout, false, 11);
        rr rrVar = new rr();
        org.telegram.ui.ActionBar.f1[] f1VarArr = new org.telegram.ui.ActionBar.f1[5];
        rrVar.c = f1VarArr;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, context, null);
        rrVar.a = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setFitItems(true);
        org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, null);
        c10.setOnClickListener(new mr(swipeBack, 1));
        c10.c(-328966, -328966);
        c10.setSelectorColor(268435455);
        View dVar = new ag.d(context, 11);
        dVar.setMinimumWidth(AndroidUtilities.dp(196.0f));
        dVar.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(dVar);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) dVar.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(8.0f);
        dVar.setLayoutParams(layoutParams);
        org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(context, null);
        rrVar.b = b1Var;
        b1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        b1Var.setDrawShadow(false);
        b1Var.setBackgroundColor(-14540254);
        b1Var.setTextColor(-1);
        b1Var.setOnValueChange(new org.telegram.ui.b5(bVar, 6));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(b1Var, h7.z5.n(-1, 44));
        View dVar2 = new ag.d(context, 12);
        dVar2.setMinimumWidth(AndroidUtilities.dp(196.0f));
        dVar2.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(dVar2);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) dVar2.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams2.gravity = 5;
        }
        layoutParams2.width = -1;
        layoutParams2.height = AndroidUtilities.dp(8.0f);
        dVar2.setLayoutParams(layoutParams2);
        org.telegram.ui.ActionBar.f1 c11 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_0_2, LocaleController.getString(R.string.SpeedVerySlow), false, null);
        c11.c(-328966, -328966);
        final int i10 = 0;
        c11.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.qr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        bVar.r(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.r(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.r(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.r(true, true, 1.5f);
                        break;
                    default:
                        bVar.r(true, true, 2.0f);
                        break;
                }
            }
        });
        c11.setSelectorColor(268435455);
        f1VarArr[0] = c11;
        org.telegram.ui.ActionBar.f1 c12 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow), false, null);
        c12.c(-328966, -328966);
        final int i11 = 1;
        c12.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.qr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        bVar.r(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.r(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.r(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.r(true, true, 1.5f);
                        break;
                    default:
                        bVar.r(true, true, 2.0f);
                        break;
                }
            }
        });
        c12.setSelectorColor(268435455);
        f1VarArr[1] = c12;
        org.telegram.ui.ActionBar.f1 c13 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal), false, null);
        c13.c(-328966, -328966);
        final int i12 = 2;
        c13.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.qr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        bVar.r(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.r(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.r(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.r(true, true, 1.5f);
                        break;
                    default:
                        bVar.r(true, true, 2.0f);
                        break;
                }
            }
        });
        c13.setSelectorColor(268435455);
        f1VarArr[2] = c13;
        org.telegram.ui.ActionBar.f1 c14 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast), false, null);
        c14.c(-328966, -328966);
        final int i13 = 3;
        c14.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.qr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        bVar.r(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.r(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.r(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.r(true, true, 1.5f);
                        break;
                    default:
                        bVar.r(true, true, 2.0f);
                        break;
                }
            }
        });
        c14.setSelectorColor(268435455);
        f1VarArr[3] = c14;
        org.telegram.ui.ActionBar.f1 c15 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedVeryFast), false, null);
        c15.c(-328966, -328966);
        final int i14 = 4;
        c15.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.qr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        bVar.r(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.r(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.r(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.r(true, true, 1.5f);
                        break;
                    default:
                        bVar.r(true, true, 2.0f);
                        break;
                }
            }
        });
        c15.setSelectorColor(268435455);
        f1VarArr[4] = c15;
        e4Var.y3 = rrVar;
        rrVar.a(i9.x1, true);
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, e4Var.getContext(), this.d, false, false);
        e4Var.z3 = f1Var;
        f1Var.g(LocaleController.getString(R.string.Speed), R.drawable.msg_speed, null);
        e4.a0(e4Var, true);
        e4Var.z3.setMinimumWidth(AndroidUtilities.dp(196.0f));
        e4Var.z3.setRightIcon(R.drawable.msg_arrowright);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e4Var.z3);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) e4Var.z3.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams3.gravity = 5;
        }
        layoutParams3.width = -1;
        layoutParams3.height = AndroidUtilities.dp(48.0f);
        e4Var.z3.setLayoutParams(layoutParams3);
        int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(e4Var.y3.a);
        org.telegram.ui.ActionBar.f1 f1Var2 = e4Var.z3;
        f1Var2.C = new s3(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 0);
        f1Var2.setOnClickListener(new o3(this, 11));
        actionBarPopupWindow$ActionBarPopupWindowLayout.c = true;
        if (z10) {
            org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(e4Var.getContext(), org.telegram.ui.ActionBar.g6.H8, this.d);
            k1Var.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(k1Var, h7.z5.n(-1, 8));
        }
    }

    public final void e(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, TL_stories.StoryItem storyItem) {
        TLRPC.Chat chat;
        e4 e4Var = this.l;
        if (!e4Var.z1 || storyItem == null || (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) || (chat = MessagesController.getInstance(e4Var.y2).getChat(Long.valueOf(-e4Var.x1))) == null) {
            return;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(e4Var.y2).getChatFull(chat.id);
        if (chatFull == null) {
            chatFull = MessagesStorage.getInstance(e4Var.y2).loadChatInfo(chat.id, true, new CountDownLatch(1), false, false);
        }
        if (chatFull == null || !chatFull.can_view_stats) {
            return;
        }
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stats, LocaleController.getString(R.string.ViewStatistics), false, this.d).setOnClickListener(new gh.a4(this, storyItem, this.e, chat, 1));
    }
}
