package oh;

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
import n7.qa;
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
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.xr;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.rr;
import org.telegram.ui.wr;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class y3 extends xr {
    public boolean c;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 d;
    public final /* synthetic */ i9 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Context i;
    public final /* synthetic */ c4 j;
    public final /* synthetic */ boolean[] k;
    public final /* synthetic */ f4 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(f4 f4Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.g6 g6Var2, i9 i9Var, boolean z4, boolean z10, boolean z11, Context context2, c4 c4Var, boolean[] zArr) {
        super(context, g6Var, true);
        this.l = f4Var;
        this.d = g6Var2;
        this.e = i9Var;
        this.f = z4;
        this.g = z10;
        this.h = z11;
        this.i = context2;
        this.j = c4Var;
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
    /* JADX WARN: Code restructure failed: missing block: B:399:0x08a8, code lost:
    
        if (r2.bot_can_edit == false) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x08d6, code lost:
    
        if (r2.delete_stories == false) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x08e1, code lost:
    
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
    @Override // org.telegram.ui.Components.xr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        org.telegram.ui.ActionBar.g6 g6Var;
        final y3 y3Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        TL_stories.StoryItem storyItem;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3;
        i9 i9Var;
        i9 i9Var2;
        final i9 i9Var3;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout5;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout6;
        e1 e1Var;
        TLRPC.GroupCall groupCall;
        e1 e1Var2;
        Integer num;
        ArrayList arrayList;
        qh.r6 r6Var;
        org.telegram.ui.Components.u5[] u5VarArr;
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
        org.telegram.ui.ActionBar.g6 g6Var2;
        i9 i9Var4;
        final i9 i9Var5;
        int i10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout7;
        TL_stories.StoryItem storyItem3;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout8;
        TLRPC.User user2;
        TLRPC.Chat chat3;
        boolean z4;
        boolean z10;
        Integer num3 = 1;
        f4 f4Var = this.l;
        d4 d4Var = f4Var.L1;
        boolean z11 = this.g;
        Context context = this.i;
        i9 i9Var6 = this.e;
        org.telegram.ui.ActionBar.g6 g6Var3 = this.d;
        if (z11 || d4Var.b != null) {
            g6Var = g6Var3;
            y3Var = this;
            TL_stories.StoryItem storyItem4 = d4Var.a;
            if (d4Var.b != null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_cancel, LocaleController.getString(R.string.Cancel), false, y3Var.d).setOnClickListener(new o3(y3Var, 6));
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            }
            if (storyItem4 == null) {
                return;
            }
            if ((f4Var.z1 || f4Var.P1.h(f4Var.y1)) && !d4Var.f && (storyItem = d4Var.a) != null) {
                HashSet hashSet = storyItem.albums != null ? new HashSet(storyItem.albums) : new HashSet();
                q70 q70Var = new q70(actionBarPopupWindow$ActionBarPopupWindowLayout2, g6Var);
                q70Var.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new t3(actionBarPopupWindow$ActionBarPopupWindowLayout2, 0), false);
                q70Var.k();
                h6 B = f4Var.getStoriesController().B(f4Var.y1, true);
                h6 B2 = f4Var.P1.B(f4Var.y1, false);
                q70.f(q70Var, B, hashSet, B2 != null && B2.a(), new mh.p6(y3Var, g6Var, storyItem, 5), new hg.c1(y3Var, hashSet, storyItem, g6Var, 4));
                int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout2.b(q70Var.B);
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, f4Var.getContext(), y3Var.d, false, false);
                f4Var.B3 = g1Var;
                g1Var.g(LocaleController.getString(R.string.StoriesAlbumAddToAlbum), R.drawable.menu_album_add, null);
                org.telegram.ui.ActionBar.g1 g1Var2 = f4Var.B3;
                g1Var2.D = new s3(actionBarPopupWindow$ActionBarPopupWindowLayout2, b10, 1);
                g1Var2.setOnClickListener(new o3(y3Var, 12));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(f4Var.B3);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.c = true;
                org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(f4Var.getContext(), org.telegram.ui.ActionBar.k6.H8, g6Var);
                m1Var.setTag(R.id.fit_width_tag, num3);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(m1Var, k7.c6.n(-1, 8));
            }
            if (f4Var.z1) {
                qh.a8 a8Var = storyItem4.privacy.isEmpty() ? new qh.a8(3, f4Var.z2, new ArrayList()) : new qh.a8(f4Var.z2, storyItem4.privacy);
                actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, R.drawable.msg_view_file, LocaleController.getString(R.string.WhoCanSee), false, y3Var.d);
                c3.setSubtext(a8Var.toString());
                c3.setOnClickListener(new eg.o(y3Var, a8Var, storyItem4, 11));
                c3.setItemHeight(56);
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            }
            y3Var.d(actionBarPopupWindow$ActionBarPopupWindowLayout3, false);
            if (f4Var.z1 || y3Var.f) {
                org.telegram.ui.ActionBar.m1 m1Var2 = new org.telegram.ui.ActionBar.m1(f4Var.getContext(), org.telegram.ui.ActionBar.k6.H8, g6Var);
                m1Var2.setTag(R.id.fit_width_tag, num3);
                actionBarPopupWindow$ActionBarPopupWindowLayout3.a(m1Var2, k7.c6.n(-1, 8));
            }
            if (f4Var.Z2 || d4Var.f || !((f4Var.I0() || MessagesController.getInstance(f4Var.z2).storiesEnabled()) && y3Var.h)) {
                i9Var = i9Var6;
            } else {
                org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, R.drawable.msg_edit, LocaleController.getString(f4Var.I0() ? R.string.EditBotPreview : R.string.EditStory), false, y3Var.d);
                f4Var.p1 = c10;
                i9Var = i9Var6;
                c10.setOnClickListener(new b0(y3Var, y3Var.d, y3Var.i, i9Var6, y3Var.j, 2));
                if (f4Var.P1.K(f4Var.y1) && d4Var.e && !SharedConfig.allowPreparingHevcPlayers()) {
                    f4Var.p1.setAlpha(0.5f);
                }
            }
            TL_stories.StoryItem storyItem5 = d4Var.a;
            if (storyItem5 == null || !d4Var.e || d4Var.f || !(storyItem5.pinned || f4Var.J0())) {
                i9Var2 = i9Var;
            } else {
                i9Var2 = i9Var;
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_cover_stories, LocaleController.getString(R.string.StoryEditCoverMenu), false, y3Var.d).setOnClickListener(new b0(y3Var, y3Var.i, storyItem4, i9Var2, y3Var.j, 3));
            }
            if ((f4Var.z1 || (f4Var.A1 && MessagesController.getInstance(f4Var.z2).getStoriesController().h(storyItem4.dialogId))) && !d4Var.f) {
                boolean z12 = storyItem4.pinned;
                boolean z13 = !z12;
                i9Var3 = i9Var2;
                actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, !z12 ? R.drawable.msg_save_story : R.drawable.menu_unsave_story, f4Var.z1 ? LocaleController.getString(!z12 ? R.string.SaveToProfile : R.string.ArchiveStory) : LocaleController.getString(!z12 ? R.string.SaveToPosts : R.string.RemoveFromPosts), false, y3Var.d).setOnClickListener(new fg.d1(y3Var, storyItem4, z13, g6Var, 1));
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                i9Var3 = i9Var2;
            }
            y3Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout4, storyItem4);
            if (f4Var.Z2 || d4Var.f) {
                actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout5, R.drawable.msg_gallery, LocaleController.getString(d4Var.e ? R.string.SaveVideo : R.string.SaveImage), false, y3Var.d).setOnClickListener(new o3(y3Var, 7));
            }
            if (!MessagesController.getInstance(f4Var.z2).premiumFeaturesBlocked() && !d4Var.f && !f4Var.A1) {
                f4.b0(f4Var, actionBarPopupWindow$ActionBarPopupWindowLayout5);
            }
            if (f4Var.A1 && f4Var.R2) {
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout5, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), false, y3Var.d).setOnClickListener(new o3(y3Var, 8));
            }
            if (f4Var.R2) {
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_shareout, LocaleController.getString(R.string.BotShare), false, y3Var.d).setOnClickListener(new o3(y3Var, 9));
            }
            TL_stories.StoryItem storyItem6 = d4Var.a;
            if (storyItem6 != null) {
                TLRPC.MessageMedia messageMedia2 = storyItem6.media;
                if ((messageMedia2 instanceof TLRPC.TL_messageMediaVideoStream) && (e1Var2 = e1.T) != null && e1Var2.f(((TLRPC.TL_messageMediaVideoStream) messageMedia2).call)) {
                    e1 e1Var3 = e1.T;
                    boolean z14 = e1Var3 != null && e1Var3.o();
                    org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, z14 ? R.drawable.msg_voice_unmuted : R.drawable.msg_voice_muted, LocaleController.getString(z14 ? R.string.Unmute : R.string.Mute), false, y3Var.d).setOnClickListener(new b2(1, y3Var, z14));
                    org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_camera_retake, LocaleController.getString(R.string.AccDescrSwitchCamera), false, y3Var.d).setOnClickListener(new o3(y3Var, 10));
                }
            }
            if (d4Var.f) {
                final int i11 = 1;
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_video_pip, LocaleController.getString(R.string.PipMinimize), false, y3Var.d).setOnClickListener(new View.OnClickListener(y3Var) { // from class: oh.p3
                    public final /* synthetic */ y3 b;

                    {
                        this.b = y3Var;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                y3 y3Var2 = this.b.l.q1;
                                if (y3Var2 != null) {
                                    y3Var2.a();
                                }
                                i9Var3.N();
                                break;
                            default:
                                y3 y3Var3 = this.b.l.q1;
                                if (y3Var3 != null) {
                                    y3Var3.a();
                                }
                                i9Var3.N();
                                break;
                        }
                    }
                });
            }
            if (d4Var.f && (f4Var.y1 == UserConfig.getInstance(f4Var.z2).getClientUserId() || ChatObject.canManageCalls(MessagesController.getInstance(f4Var.z2).getChat(Long.valueOf(-f4Var.y1))) || ((e1Var = i9Var3.x0) != null && d4Var.k(e1Var.g()) && (groupCall = i9Var3.x0.v) != null && groupCall.creator))) {
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_settings_old, LocaleController.getString(R.string.LiveStorySettings), false, y3Var.d).setOnClickListener(new q3(y3Var, g6Var, i9Var3, 1));
            }
            if (d4Var.f) {
                org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_remove, LocaleController.getString(R.string.LiveStoryEnd), false, y3Var.d);
                int i12 = org.telegram.ui.ActionBar.k6.q7;
                c11.setSelectorColor(org.telegram.ui.ActionBar.k6.l1(0.12f, org.telegram.ui.ActionBar.k6.v0(i12, g6Var)));
                c11.c(g6Var.B0(i12), g6Var.B0(i12));
                c11.setOnClickListener(new q3(y3Var, g6Var, i9Var3, 2));
            }
            if (!d4Var.f) {
                if (!f4Var.z1) {
                    t6 storiesController = MessagesController.getInstance(f4Var.z2).getStoriesController();
                    TL_stories.StoryItem storyItem7 = d4Var.a;
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
                                        boolean z15 = storyItem7.out;
                                        if (z15) {
                                            TLRPC.TL_chatAdminRights tL_chatAdminRights = chat4.admin_rights;
                                            if (tL_chatAdminRights != null) {
                                                if (!tL_chatAdminRights.post_stories) {
                                                }
                                            }
                                        }
                                        if (!z15) {
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
                org.telegram.ui.ActionBar.g1 c12 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout6, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), false, y3Var.d);
                int i14 = org.telegram.ui.ActionBar.k6.q7;
                c12.setSelectorColor(org.telegram.ui.ActionBar.k6.l1(0.12f, org.telegram.ui.ActionBar.k6.v0(i14, g6Var)));
                c12.c(g6Var.B0(i14), g6Var.B0(i14));
                c12.setOnClickListener(new o3(y3Var, 13));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        } else {
            d(actionBarPopupWindow$ActionBarPopupWindowLayout, true);
            final String sharedPrefKey = NotificationsController.getSharedPrefKey(f4Var.y1, 0L);
            boolean c02 = NotificationsCustomSettingsActivity.c0(f4Var.z2, f4Var.y1);
            if (f4Var.y1 > 0) {
                ?? user4 = MessagesController.getInstance(f4Var.z2).getUser(Long.valueOf(f4Var.y1));
                chat2 = user4;
                chat = null;
                user = user4;
            } else {
                chat = MessagesController.getInstance(f4Var.z2).getChat(Long.valueOf(-f4Var.y1));
                chat2 = chat;
                user = null;
            }
            String trim = user == null ? chat == null ? "" : chat.title : UserObject.getFirstName(user).trim();
            int indexOf = trim.indexOf(" ");
            if (indexOf > 0) {
                trim = trim.substring(0, indexOf);
            }
            final String str = trim;
            if (UserObject.isService(f4Var.y1) || f4Var.I0()) {
                y3Var = this;
                g6Var2 = g6Var3;
                i9Var4 = i9Var6;
            } else {
                if (c02) {
                    user2 = user;
                    i9Var4 = i9Var6;
                    chat3 = chat;
                    g6Var2 = g6Var3;
                    org.telegram.ui.ActionBar.g1 c13 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), false, this.d);
                    final int i15 = 0;
                    final org.telegram.ui.ActionBar.g6 g6Var4 = this.d;
                    final TLRPC.Chat chat5 = chat2;
                    y3Var = this;
                    c13.setOnClickListener(new View.OnClickListener(this) { // from class: oh.w3
                        public final /* synthetic */ y3 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i16 = i15;
                            String str2 = str;
                            TLObject tLObject = chat5;
                            org.telegram.ui.ActionBar.g6 g6Var5 = g6Var4;
                            String str3 = sharedPrefKey;
                            y3 y3Var2 = this.b;
                            switch (i16) {
                                case 0:
                                    f4 f4Var2 = y3Var2.l;
                                    MessagesController.getNotificationsSettings(f4Var2.z2).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str3, false).apply();
                                    NotificationsController.getInstance(f4Var2.z2).updateServerNotificationsSettings(f4Var2.y1, 0L);
                                    ic V = new qc(f4Var2.Z0, g6Var5).V(Arrays.asList(tLObject), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, str2)), null, null);
                                    V.a = 2;
                                    V.j();
                                    y3 y3Var3 = f4Var2.q1;
                                    if (y3Var3 != null) {
                                        y3Var3.a();
                                        break;
                                    }
                                    break;
                                default:
                                    f4 f4Var3 = y3Var2.l;
                                    MessagesController.getNotificationsSettings(f4Var3.z2).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str3, true).apply();
                                    NotificationsController.getInstance(f4Var3.z2).updateServerNotificationsSettings(f4Var3.y1, 0L);
                                    ic V2 = new qc(f4Var3.Z0, g6Var5).V(Arrays.asList(tLObject), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, str2)), null, null);
                                    V2.a = 2;
                                    V2.j();
                                    y3 y3Var4 = f4Var3.q1;
                                    if (y3Var4 != null) {
                                        y3Var4.a();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    c13.setMultiline(false);
                } else {
                    y3Var = this;
                    user2 = user;
                    chat3 = chat;
                    g6Var2 = g6Var3;
                    i9Var4 = i9Var6;
                    final TLRPC.Chat chat6 = chat2;
                    org.telegram.ui.ActionBar.g1 c14 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), false, y3Var.d);
                    final int i16 = 1;
                    final org.telegram.ui.ActionBar.g6 g6Var5 = y3Var.d;
                    c14.setOnClickListener(new View.OnClickListener(y3Var) { // from class: oh.w3
                        public final /* synthetic */ y3 b;

                        {
                            this.b = y3Var;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i162 = i16;
                            String str2 = str;
                            TLObject tLObject = chat6;
                            org.telegram.ui.ActionBar.g6 g6Var52 = g6Var5;
                            String str3 = sharedPrefKey;
                            y3 y3Var2 = this.b;
                            switch (i162) {
                                case 0:
                                    f4 f4Var2 = y3Var2.l;
                                    MessagesController.getNotificationsSettings(f4Var2.z2).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str3, false).apply();
                                    NotificationsController.getInstance(f4Var2.z2).updateServerNotificationsSettings(f4Var2.y1, 0L);
                                    ic V = new qc(f4Var2.Z0, g6Var52).V(Arrays.asList(tLObject), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, str2)), null, null);
                                    V.a = 2;
                                    V.j();
                                    y3 y3Var3 = f4Var2.q1;
                                    if (y3Var3 != null) {
                                        y3Var3.a();
                                        break;
                                    }
                                    break;
                                default:
                                    f4 f4Var3 = y3Var2.l;
                                    MessagesController.getNotificationsSettings(f4Var3.z2).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str3, true).apply();
                                    NotificationsController.getInstance(f4Var3.z2).updateServerNotificationsSettings(f4Var3.y1, 0L);
                                    ic V2 = new qc(f4Var3.Z0, g6Var52).V(Arrays.asList(tLObject), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, str2)), null, null);
                                    V2.a = 2;
                                    V2.j();
                                    y3 y3Var4 = f4Var3.q1;
                                    if (y3Var4 != null) {
                                        y3Var4.a();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    c14.setMultiline(false);
                }
                MediaDataController.getInstance(f4Var.z2).loadHints(true);
                boolean z16 = (user2 == null || user2.contact || !MediaDataController.getInstance(f4Var.z2).containsTopPeer(f4Var.y1)) ? false : true;
                if (f4Var.y1 > 0) {
                    z4 = user2 != null && user2.contact;
                    if (user2 != null) {
                    }
                    z10 = false;
                } else {
                    TLRPC.Chat chat7 = chat3;
                    z4 = (chat7 == null || ChatObject.isNotInChat(chat7)) ? false : true;
                    if (chat7 != null) {
                    }
                    z10 = false;
                }
                if (z16) {
                    org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), false, y3Var.d).setOnClickListener(new o3(y3Var, 14));
                } else if (z4) {
                    if (z10) {
                        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), false, y3Var.d).setOnClickListener(new o3(y3Var, 0));
                    } else {
                        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), false, y3Var.d).setOnClickListener(new o3(y3Var, 15));
                    }
                }
            }
            if (d4Var.f) {
                final int i17 = 0;
                i9Var5 = i9Var4;
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_video_pip, LocaleController.getString(R.string.PipMinimize), false, y3Var.d).setOnClickListener(new View.OnClickListener(y3Var) { // from class: oh.p3
                    public final /* synthetic */ y3 b;

                    {
                        this.b = y3Var;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i17) {
                            case 0:
                                y3 y3Var2 = this.b.l.q1;
                                if (y3Var2 != null) {
                                    y3Var2.a();
                                }
                                i9Var5.N();
                                break;
                            default:
                                y3 y3Var3 = this.b.l.q1;
                                if (y3Var3 != null) {
                                    y3Var3.a();
                                }
                                i9Var5.N();
                                break;
                        }
                    }
                });
            } else {
                i9Var5 = i9Var4;
            }
            if (!MessagesController.getInstance(f4Var.z2).premiumFeaturesBlocked() && d4Var.e) {
                boolean z17 = MessagesController.getInstance(f4Var.z2).storyQualityFull;
                if (UserConfig.getInstance(f4Var.z2).isPremium()) {
                    org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, z17 ? R.drawable.menu_quality_sd : R.drawable.menu_quality_hd, LocaleController.getString(z17 ? R.string.StoryQualityDecrease : R.string.StoryQualityIncrease), false, f4Var.y0).setOnClickListener(new b2(0, f4Var, z17));
                } else {
                    Drawable drawable = f4Var.getContext().getDrawable(R.drawable.msg_gallery_locked2);
                    i10 = -1;
                    drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                    j2 j2Var = new j2(f4Var.getContext().getDrawable(R.drawable.menu_quality_hd2), drawable, 1);
                    int dp = AndroidUtilities.dp(24.0f);
                    int dp2 = AndroidUtilities.dp(24.0f);
                    j2Var.e = dp;
                    j2Var.f = dp2;
                    int dp3 = AndroidUtilities.dp(1.0f);
                    int i18 = -AndroidUtilities.dp(2.0f);
                    j2Var.s = dp3;
                    j2Var.v = i18;
                    org.telegram.ui.ActionBar.g1 c15 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_quality_hd, LocaleController.getString(R.string.StoryQualityIncrease), false, f4Var.y0);
                    c15.setOnClickListener(new y1(f4Var, 7));
                    c15.setIcon(j2Var);
                    if (!f4Var.Z2 && f4Var.P2 && !d4Var.f) {
                        if (!UserConfig.getInstance(f4Var.z2).isPremium()) {
                            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_gallery, LocaleController.getString(R.string.SaveToGallery), false, y3Var.d).setOnClickListener(new o3(y3Var, 1));
                        } else if (!MessagesController.getInstance(f4Var.z2).premiumFeaturesBlocked()) {
                            Drawable drawable2 = context.getDrawable(R.drawable.msg_gallery_locked2);
                            drawable2.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, i10, -16777216), PorterDuff.Mode.MULTIPLY));
                            j2 j2Var2 = new j2(context.getDrawable(R.drawable.msg_gallery_locked1), drawable2, 2);
                            actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            org.telegram.ui.ActionBar.g1 c16 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_gallery, LocaleController.getString(R.string.SaveToGallery), false, y3Var.d);
                            c16.setIcon(j2Var2);
                            c16.setOnClickListener(new eg.o(y3Var, c16, i9Var5, 12));
                            if (!MessagesController.getInstance(f4Var.z2).premiumFeaturesBlocked() && !f4Var.A1) {
                                f4.b0(f4Var, actionBarPopupWindow$ActionBarPopupWindowLayout7);
                            }
                            if (f4Var.R2) {
                                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), false, y3Var.d).setOnClickListener(new o3(y3Var, 2));
                            }
                            if (f4Var.R2) {
                                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_shareout, LocaleController.getString(R.string.BotShare), false, y3Var.d).setOnClickListener(new o3(y3Var, 3));
                            }
                            storyItem3 = d4Var.a;
                            if (storyItem3 != null) {
                                if (storyItem3.translated && TextUtils.equals(storyItem3.translatedLng, v31.B())) {
                                    org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_translate, LocaleController.getString(R.string.HideTranslation), false, y3Var.d).setOnClickListener(new o3(y3Var, 4));
                                } else if (MessagesController.getInstance(f4Var.z2).getTranslateController().canTranslateStory(d4Var.a)) {
                                    actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                    org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout8, R.drawable.msg_translate, LocaleController.getString(R.string.TranslateMessage), false, y3Var.d).setOnClickListener(new o3(y3Var, 5));
                                    y3Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout8, d4Var.a);
                                    if (!f4Var.Z2 || UserObject.isService(f4Var.y1) || f4Var.I0()) {
                                        actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                        g6Var = g6Var2;
                                    } else {
                                        g6Var = g6Var2;
                                        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout8, R.drawable.msg_report, LocaleController.getString(R.string.ReportChat), false, y3Var.d).setOnClickListener(new q3(y3Var, i9Var5, g6Var));
                                        actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                    }
                                }
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            y3Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout8, d4Var.a);
                            if (f4Var.Z2) {
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            g6Var = g6Var2;
                        }
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    if (!MessagesController.getInstance(f4Var.z2).premiumFeaturesBlocked()) {
                        f4.b0(f4Var, actionBarPopupWindow$ActionBarPopupWindowLayout7);
                    }
                    if (f4Var.R2) {
                    }
                    if (f4Var.R2) {
                    }
                    storyItem3 = d4Var.a;
                    if (storyItem3 != null) {
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    y3Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout8, d4Var.a);
                    if (f4Var.Z2) {
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    g6Var = g6Var2;
                }
            }
            i10 = -1;
            if (!f4Var.Z2) {
                if (!UserConfig.getInstance(f4Var.z2).isPremium()) {
                }
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            if (!MessagesController.getInstance(f4Var.z2).premiumFeaturesBlocked()) {
            }
            if (f4Var.R2) {
            }
            if (f4Var.R2) {
            }
            storyItem3 = d4Var.a;
            if (storyItem3 != null) {
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            y3Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout8, d4Var.a);
            if (f4Var.Z2) {
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            g6Var = g6Var2;
        }
        boolean z18 = (d4Var == null || (storyItem2 = d4Var.a) == null || (messageMedia = storyItem2.media) == null || (!MessageObject.isDocumentHasAttachedStickers(messageMedia.document) && ((photo = d4Var.a.media.photo) == null || !photo.has_stickers))) ? false : true;
        if (d4Var != null) {
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList3 = new ArrayList();
            TL_stories.StoryItem storyItem8 = d4Var.a;
            if (storyItem8 != null && storyItem8.media_areas != null) {
                for (int i19 = 0; i19 < d4Var.a.media_areas.size(); i19++) {
                    TL_stories.MediaArea mediaArea2 = d4Var.a.media_areas.get(i19);
                    if (mediaArea2 instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                        TLRPC.Reaction reaction = mediaArea2.reaction;
                        if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                            TLRPC.Document f10 = org.telegram.ui.Components.l5.f(f4Var.z2, ((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
                            if (f10 != null && (inputStickerSet2 = MessageObject.getInputStickerSet(f10)) != null && !hashSet2.contains(Long.valueOf(inputStickerSet2.id))) {
                                hashSet2.add(Long.valueOf(inputStickerSet2.id));
                                arrayList3.add(inputStickerSet2);
                            }
                        }
                    }
                }
            }
            TL_stories.StoryItem storyItem9 = d4Var.a;
            if (storyItem9 == null || (arrayList2 = storyItem9.entities) == null || arrayList2.isEmpty()) {
                s6 s6Var = d4Var.b;
                if (s6Var != null && (r6Var = s6Var.c) != null) {
                    if (r6Var.T0 != null) {
                        for (int i20 = 0; i20 < d4Var.b.c.T0.size(); i20++) {
                            VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) d4Var.b.c.T0.get(i20);
                            if (mediaEntity.type == 4 && (mediaArea = mediaEntity.mediaArea) != null) {
                                TLRPC.Reaction reaction2 = mediaArea.reaction;
                                if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                    TLRPC.Document f11 = org.telegram.ui.Components.l5.f(f4Var.z2, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id);
                                    if (f11 != null && (inputStickerSet = MessageObject.getInputStickerSet(f11)) != null && !hashSet2.contains(Long.valueOf(inputStickerSet.id))) {
                                        hashSet2.add(Long.valueOf(inputStickerSet.id));
                                        arrayList3.add(inputStickerSet);
                                    }
                                }
                            }
                        }
                    }
                    CharSequence charSequence = d4Var.b.c.C0;
                    if ((charSequence instanceof Spanned) && (u5VarArr = (org.telegram.ui.Components.u5[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.u5.class)) != null) {
                        int i21 = 0;
                        while (i21 < u5VarArr.length) {
                            org.telegram.ui.Components.u5 u5Var = u5VarArr[i21];
                            TLRPC.Document document = u5Var.document;
                            if (document == null) {
                                num2 = num3;
                                document = org.telegram.ui.Components.l5.f(f4Var.z2, u5Var.documentId);
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
                for (int i22 = 0; i22 < d4Var.a.entities.size(); i22++) {
                    TLRPC.MessageEntity messageEntity = d4Var.a.entities.get(i22);
                    if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                        TLRPC.Document document2 = tL_messageEntityCustomEmoji.document;
                        if (document2 == null) {
                            document2 = org.telegram.ui.Components.l5.f(f4Var.z2, tL_messageEntityCustomEmoji.document_id);
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
        boolean z19 = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (z18 || z19) {
            org.telegram.ui.ActionBar.m1 m1Var3 = new org.telegram.ui.ActionBar.m1(context, org.telegram.ui.ActionBar.k6.H8, g6Var);
            m1Var3.setTag(R.id.fit_width_tag, num);
            actionBarPopupWindow$ActionBarPopupWindowLayout6.a(m1Var3, k7.c6.n(-1, 8));
            TLRPC.MessageMedia messageMedia3 = d4Var.a.media;
            TLObject tLObject = messageMedia3.document;
            if (tLObject == null) {
                tLObject = messageMedia3.photo;
            }
            d8 d8Var = new d8(y3Var.i, f4Var.z2, tLObject, d4Var.a, z18, arrayList, y3Var.d);
            d8Var.setOnClickListener(new dg.n(28, y3Var, d8Var));
            d8Var.setTag(R.id.fit_width_tag, num);
            actionBarPopupWindow$ActionBarPopupWindowLayout6.a(d8Var, k7.c6.n(-1, -2));
        }
    }

    @Override // org.telegram.ui.Components.xr
    public final void c() {
        if (!this.c && !this.k[0]) {
            AndroidUtilities.runOnUIThread(new r3(this, 0));
        }
        f4 f4Var = this.l;
        f4Var.q1 = null;
        f4Var.p1 = null;
    }

    public final void d(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z4) {
        d4 d4Var;
        boolean z10 = this.f;
        f4 f4Var = this.l;
        if (!z10 || ((d4Var = f4Var.L1) != null && d4Var.b != null)) {
            f4Var.z3 = null;
            f4Var.A3 = null;
            return;
        }
        Context context = f4Var.getContext();
        ch0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
        final qa qaVar = new qa(this, actionBarPopupWindow$ActionBarPopupWindowLayout, false, 7);
        wr wrVar = new wr();
        org.telegram.ui.ActionBar.g1[] g1VarArr = new org.telegram.ui.ActionBar.g1[5];
        wrVar.c = g1VarArr;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, context, null);
        wrVar.a = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setFitItems(true);
        org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, null);
        c3.setOnClickListener(new rr(swipeBack, 1));
        c3.c(-328966, -328966);
        c3.setSelectorColor(268435455);
        View dVar = new eh.d(context, 12);
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
        org.telegram.ui.ActionBar.c1 c1Var = new org.telegram.ui.ActionBar.c1(context, null);
        wrVar.b = c1Var;
        c1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        c1Var.setDrawShadow(false);
        c1Var.setBackgroundColor(-14540254);
        c1Var.setTextColor(-1);
        c1Var.setOnValueChange(new org.telegram.ui.d5(qaVar, 6));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(c1Var, k7.c6.n(-1, 44));
        View dVar2 = new eh.d(context, 13);
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
        org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_0_2, LocaleController.getString(R.string.SpeedVerySlow), false, null);
        c10.c(-328966, -328966);
        final int i10 = 0;
        c10.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.vr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        qaVar.X0(true, true, 0.2f);
                        break;
                    case 1:
                        qaVar.X0(true, true, 0.5f);
                        break;
                    case 2:
                        qaVar.X0(true, true, 1.0f);
                        break;
                    case 3:
                        qaVar.X0(true, true, 1.5f);
                        break;
                    default:
                        qaVar.X0(true, true, 2.0f);
                        break;
                }
            }
        });
        c10.setSelectorColor(268435455);
        g1VarArr[0] = c10;
        org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow), false, null);
        c11.c(-328966, -328966);
        final int i11 = 1;
        c11.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.vr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        qaVar.X0(true, true, 0.2f);
                        break;
                    case 1:
                        qaVar.X0(true, true, 0.5f);
                        break;
                    case 2:
                        qaVar.X0(true, true, 1.0f);
                        break;
                    case 3:
                        qaVar.X0(true, true, 1.5f);
                        break;
                    default:
                        qaVar.X0(true, true, 2.0f);
                        break;
                }
            }
        });
        c11.setSelectorColor(268435455);
        g1VarArr[1] = c11;
        org.telegram.ui.ActionBar.g1 c12 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal), false, null);
        c12.c(-328966, -328966);
        final int i12 = 2;
        c12.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.vr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        qaVar.X0(true, true, 0.2f);
                        break;
                    case 1:
                        qaVar.X0(true, true, 0.5f);
                        break;
                    case 2:
                        qaVar.X0(true, true, 1.0f);
                        break;
                    case 3:
                        qaVar.X0(true, true, 1.5f);
                        break;
                    default:
                        qaVar.X0(true, true, 2.0f);
                        break;
                }
            }
        });
        c12.setSelectorColor(268435455);
        g1VarArr[2] = c12;
        org.telegram.ui.ActionBar.g1 c13 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast), false, null);
        c13.c(-328966, -328966);
        final int i13 = 3;
        c13.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.vr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        qaVar.X0(true, true, 0.2f);
                        break;
                    case 1:
                        qaVar.X0(true, true, 0.5f);
                        break;
                    case 2:
                        qaVar.X0(true, true, 1.0f);
                        break;
                    case 3:
                        qaVar.X0(true, true, 1.5f);
                        break;
                    default:
                        qaVar.X0(true, true, 2.0f);
                        break;
                }
            }
        });
        c13.setSelectorColor(268435455);
        g1VarArr[3] = c13;
        org.telegram.ui.ActionBar.g1 c14 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedVeryFast), false, null);
        c14.c(-328966, -328966);
        final int i14 = 4;
        c14.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.vr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        qaVar.X0(true, true, 0.2f);
                        break;
                    case 1:
                        qaVar.X0(true, true, 0.5f);
                        break;
                    case 2:
                        qaVar.X0(true, true, 1.0f);
                        break;
                    case 3:
                        qaVar.X0(true, true, 1.5f);
                        break;
                    default:
                        qaVar.X0(true, true, 2.0f);
                        break;
                }
            }
        });
        c14.setSelectorColor(268435455);
        g1VarArr[4] = c14;
        f4Var.z3 = wrVar;
        wrVar.a(i9.y1, true);
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, f4Var.getContext(), this.d, false, false);
        f4Var.A3 = g1Var;
        g1Var.g(LocaleController.getString(R.string.Speed), R.drawable.msg_speed, null);
        f4.a0(f4Var, true);
        f4Var.A3.setMinimumWidth(AndroidUtilities.dp(196.0f));
        f4Var.A3.setRightIcon(R.drawable.msg_arrowright);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f4Var.A3);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) f4Var.A3.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams3.gravity = 5;
        }
        layoutParams3.width = -1;
        layoutParams3.height = AndroidUtilities.dp(48.0f);
        f4Var.A3.setLayoutParams(layoutParams3);
        int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(f4Var.z3.a);
        org.telegram.ui.ActionBar.g1 g1Var2 = f4Var.A3;
        g1Var2.D = new s3(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 0);
        g1Var2.setOnClickListener(new o3(this, 11));
        actionBarPopupWindow$ActionBarPopupWindowLayout.c = true;
        if (z4) {
            org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(f4Var.getContext(), org.telegram.ui.ActionBar.k6.H8, this.d);
            m1Var.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(m1Var, k7.c6.n(-1, 8));
        }
    }

    public final void e(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, TL_stories.StoryItem storyItem) {
        TLRPC.Chat chat;
        f4 f4Var = this.l;
        if (!f4Var.A1 || storyItem == null || (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) || (chat = MessagesController.getInstance(f4Var.z2).getChat(Long.valueOf(-f4Var.y1))) == null) {
            return;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(f4Var.z2).getChatFull(chat.id);
        if (chatFull == null) {
            chatFull = MessagesStorage.getInstance(f4Var.z2).loadChatInfo(chat.id, true, new CountDownLatch(1), false, false);
        }
        if (chatFull == null || !chatFull.can_view_stats) {
            return;
        }
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stats, LocaleController.getString(R.string.ViewStatistics), false, this.d).setOnClickListener(new lh.u3(this, storyItem, this.e, chat, 1));
    }
}
