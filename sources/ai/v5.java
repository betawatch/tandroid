package ai;

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
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.y70;
import org.telegram.ui.Components.yr;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.qr;
import org.telegram.ui.vr;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class v5 extends yr {
    public boolean c;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 d;
    public final /* synthetic */ jc e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Context i;
    public final /* synthetic */ b6 j;
    public final /* synthetic */ boolean[] k;
    public final /* synthetic */ e6 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(e6 e6Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.ActionBar.d6 d6Var2, jc jcVar, boolean z10, boolean z11, boolean z12, Context context2, b6 b6Var, boolean[] zArr) {
        super(context, d6Var, true);
        this.l = e6Var;
        this.d = d6Var2;
        this.e = jcVar;
        this.f = z10;
        this.g = z11;
        this.h = z12;
        this.i = context2;
        this.j = b6Var;
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
    @Override // org.telegram.ui.Components.yr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        org.telegram.ui.ActionBar.d6 d6Var;
        final v5 v5Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        TL_stories.StoryItem storyItem;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3;
        jc jcVar;
        jc jcVar2;
        final jc jcVar3;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout5;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout6;
        d2 d2Var;
        TLRPC.GroupCall groupCall;
        d2 d2Var2;
        Integer num;
        ArrayList arrayList;
        ci.l8 l8Var;
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
        org.telegram.ui.ActionBar.d6 d6Var2;
        jc jcVar4;
        final jc jcVar5;
        int i10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout7;
        TL_stories.StoryItem storyItem3;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout8;
        TLRPC.User user2;
        TLRPC.Chat chat3;
        boolean z10;
        boolean z11;
        Integer num3 = 1;
        e6 e6Var = this.l;
        c6 c6Var = e6Var.O1;
        boolean z12 = this.g;
        Context context = this.i;
        jc jcVar6 = this.e;
        org.telegram.ui.ActionBar.d6 d6Var3 = this.d;
        if (z12 || c6Var.b != null) {
            d6Var = d6Var3;
            v5Var = this;
            TL_stories.StoryItem storyItem4 = c6Var.a;
            if (c6Var.b != null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_cancel, LocaleController.getString(R.string.Cancel), false, v5Var.d).setOnClickListener(new i5(v5Var, 6));
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            }
            if (storyItem4 == null) {
                return;
            }
            if ((e6Var.C1 || e6Var.S1.h(e6Var.B1)) && !c6Var.f && (storyItem = c6Var.a) != null) {
                HashSet hashSet = storyItem.albums != null ? new HashSet(storyItem.albums) : new HashSet();
                y70 y70Var = new y70(actionBarPopupWindow$ActionBarPopupWindowLayout2, d6Var);
                y70Var.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new a3.d(actionBarPopupWindow$ActionBarPopupWindowLayout2, 8), false);
                y70Var.k();
                x8 B = e6Var.getStoriesController().B(e6Var.B1, true);
                x8 B2 = e6Var.S1.B(e6Var.B1, false);
                y70.f(y70Var, B, hashSet, B2 != null && B2.a(), new a3.k0(v5Var, d6Var, storyItem, 2), new e4(v5Var, hashSet, storyItem, d6Var, 2));
                int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout2.b(y70Var.B);
                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, e6Var.getContext(), v5Var.d, false, false);
                e6Var.E3 = e1Var;
                e1Var.g(LocaleController.getString(R.string.StoriesAlbumAddToAlbum), R.drawable.menu_album_add, null);
                org.telegram.ui.ActionBar.e1 e1Var2 = e6Var.E3;
                e1Var2.G = new n5(actionBarPopupWindow$ActionBarPopupWindowLayout2, b10, 1);
                e1Var2.setOnClickListener(new i5(v5Var, 12));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(e6Var.E3);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.c = true;
                org.telegram.ui.ActionBar.j1 j1Var = new org.telegram.ui.ActionBar.j1(e6Var.getContext(), org.telegram.ui.ActionBar.h6.H8, d6Var);
                j1Var.setTag(R.id.fit_width_tag, num3);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(j1Var, w7.y5.n(-1, 8));
            }
            if (e6Var.C1) {
                ci.da daVar = storyItem4.privacy.isEmpty() ? new ci.da(3, e6Var.C2, new ArrayList()) : new ci.da(e6Var.C2, storyItem4.privacy);
                actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, R.drawable.msg_view_file, LocaleController.getString(R.string.WhoCanSee), false, v5Var.d);
                c10.setSubtext(daVar.toString());
                c10.setOnClickListener(new d0(v5Var, daVar, storyItem4, 1));
                c10.setItemHeight(56);
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            }
            v5Var.d(actionBarPopupWindow$ActionBarPopupWindowLayout3, false);
            if (e6Var.C1 || v5Var.f) {
                org.telegram.ui.ActionBar.j1 j1Var2 = new org.telegram.ui.ActionBar.j1(e6Var.getContext(), org.telegram.ui.ActionBar.h6.H8, d6Var);
                j1Var2.setTag(R.id.fit_width_tag, num3);
                actionBarPopupWindow$ActionBarPopupWindowLayout3.a(j1Var2, w7.y5.n(-1, 8));
            }
            if (e6Var.c3 || c6Var.f || !((e6Var.I0() || MessagesController.getInstance(e6Var.C2).storiesEnabled()) && v5Var.h)) {
                jcVar = jcVar6;
            } else {
                org.telegram.ui.ActionBar.e1 c11 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, R.drawable.msg_edit, LocaleController.getString(e6Var.I0() ? R.string.EditBotPreview : R.string.EditStory), false, v5Var.d);
                e6Var.s1 = c11;
                jcVar = jcVar6;
                c11.setOnClickListener(new s0(v5Var, v5Var.d, v5Var.i, jcVar6, v5Var.j, 2));
                if (e6Var.S1.K(e6Var.B1) && c6Var.e && !SharedConfig.allowPreparingHevcPlayers()) {
                    e6Var.s1.setAlpha(0.5f);
                }
            }
            TL_stories.StoryItem storyItem5 = c6Var.a;
            if (storyItem5 == null || !c6Var.e || c6Var.f || !(storyItem5.pinned || e6Var.J0())) {
                jcVar2 = jcVar;
            } else {
                jcVar2 = jcVar;
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_cover_stories, LocaleController.getString(R.string.StoryEditCoverMenu), false, v5Var.d).setOnClickListener(new s0(v5Var, v5Var.i, storyItem4, jcVar2, v5Var.j, 3));
            }
            if ((e6Var.C1 || (e6Var.D1 && MessagesController.getInstance(e6Var.C2).getStoriesController().h(storyItem4.dialogId))) && !c6Var.f) {
                boolean z13 = storyItem4.pinned;
                boolean z14 = !z13;
                jcVar3 = jcVar2;
                actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, !z13 ? R.drawable.msg_save_story : R.drawable.menu_unsave_story, e6Var.C1 ? LocaleController.getString(!z13 ? R.string.SaveToProfile : R.string.ArchiveStory) : LocaleController.getString(!z13 ? R.string.SaveToPosts : R.string.RemoveFromPosts), false, v5Var.d).setOnClickListener(new l5(v5Var, storyItem4, z14, d6Var, 0));
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                jcVar3 = jcVar2;
            }
            v5Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout4, storyItem4);
            if (e6Var.c3 || c6Var.f) {
                actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout5, R.drawable.msg_gallery, LocaleController.getString(c6Var.e ? R.string.SaveVideo : R.string.SaveImage), false, v5Var.d).setOnClickListener(new i5(v5Var, 7));
            }
            if (!MessagesController.getInstance(e6Var.C2).premiumFeaturesBlocked() && !c6Var.f && !e6Var.D1) {
                e6.b0(e6Var, actionBarPopupWindow$ActionBarPopupWindowLayout5);
            }
            if (e6Var.D1 && e6Var.U2) {
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout5, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), false, v5Var.d).setOnClickListener(new i5(v5Var, 8));
            }
            if (e6Var.U2) {
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_shareout, LocaleController.getString(R.string.BotShare), false, v5Var.d).setOnClickListener(new i5(v5Var, 9));
            }
            TL_stories.StoryItem storyItem6 = c6Var.a;
            if (storyItem6 != null) {
                TLRPC.MessageMedia messageMedia2 = storyItem6.media;
                if ((messageMedia2 instanceof TLRPC.TL_messageMediaVideoStream) && (d2Var2 = d2.W) != null && d2Var2.f(((TLRPC.TL_messageMediaVideoStream) messageMedia2).call)) {
                    d2 d2Var3 = d2.W;
                    boolean z15 = d2Var3 != null && d2Var3.o();
                    org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, z15 ? R.drawable.msg_voice_unmuted : R.drawable.msg_voice_muted, LocaleController.getString(z15 ? R.string.Unmute : R.string.Mute), false, v5Var.d).setOnClickListener(new j3(1, v5Var, z15));
                    org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_camera_retake, LocaleController.getString(R.string.AccDescrSwitchCamera), false, v5Var.d).setOnClickListener(new i5(v5Var, 10));
                }
            }
            if (c6Var.f) {
                final int i11 = 1;
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_video_pip, LocaleController.getString(R.string.PipMinimize), false, v5Var.d).setOnClickListener(new View.OnClickListener(v5Var) { // from class: ai.j5
                    public final /* synthetic */ v5 b;

                    {
                        this.b = v5Var;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                v5 v5Var2 = this.b.l.t1;
                                if (v5Var2 != null) {
                                    v5Var2.a();
                                }
                                jcVar3.N();
                                break;
                            default:
                                v5 v5Var3 = this.b.l.t1;
                                if (v5Var3 != null) {
                                    v5Var3.a();
                                }
                                jcVar3.N();
                                break;
                        }
                    }
                });
            }
            if (c6Var.f && (e6Var.B1 == UserConfig.getInstance(e6Var.C2).getClientUserId() || ChatObject.canManageCalls(MessagesController.getInstance(e6Var.C2).getChat(Long.valueOf(-e6Var.B1))) || ((d2Var = jcVar3.A0) != null && c6Var.k(d2Var.g()) && (groupCall = jcVar3.A0.v) != null && groupCall.creator))) {
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_settings_old, LocaleController.getString(R.string.LiveStorySettings), false, v5Var.d).setOnClickListener(new k5(v5Var, d6Var, jcVar3, 1));
            }
            if (c6Var.f) {
                org.telegram.ui.ActionBar.e1 c12 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_remove, LocaleController.getString(R.string.LiveStoryEnd), false, v5Var.d);
                int i12 = org.telegram.ui.ActionBar.h6.q7;
                c12.setSelectorColor(org.telegram.ui.ActionBar.h6.l1(0.12f, org.telegram.ui.ActionBar.h6.v0(i12, d6Var)));
                c12.c(d6Var.G0(i12), d6Var.G0(i12));
                c12.setOnClickListener(new k5(v5Var, d6Var, jcVar3, 2));
            }
            if (!c6Var.f) {
                if (!e6Var.C1) {
                    l9 storiesController = MessagesController.getInstance(e6Var.C2).getStoriesController();
                    TL_stories.StoryItem storyItem7 = c6Var.a;
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
                org.telegram.ui.ActionBar.e1 c13 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout6, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), false, v5Var.d);
                int i14 = org.telegram.ui.ActionBar.h6.q7;
                c13.setSelectorColor(org.telegram.ui.ActionBar.h6.l1(0.12f, org.telegram.ui.ActionBar.h6.v0(i14, d6Var)));
                c13.c(d6Var.G0(i14), d6Var.G0(i14));
                c13.setOnClickListener(new i5(v5Var, 13));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        } else {
            d(actionBarPopupWindow$ActionBarPopupWindowLayout, true);
            final String sharedPrefKey = NotificationsController.getSharedPrefKey(e6Var.B1, 0L);
            boolean c02 = NotificationsCustomSettingsActivity.c0(e6Var.C2, e6Var.B1);
            if (e6Var.B1 > 0) {
                ?? user4 = MessagesController.getInstance(e6Var.C2).getUser(Long.valueOf(e6Var.B1));
                chat2 = user4;
                chat = null;
                user = user4;
            } else {
                chat = MessagesController.getInstance(e6Var.C2).getChat(Long.valueOf(-e6Var.B1));
                chat2 = chat;
                user = null;
            }
            String trim = user == null ? chat == null ? "" : chat.title : UserObject.getFirstName(user).trim();
            int indexOf = trim.indexOf(" ");
            if (indexOf > 0) {
                trim = trim.substring(0, indexOf);
            }
            final String str = trim;
            if (UserObject.isService(e6Var.B1) || e6Var.I0()) {
                v5Var = this;
                d6Var2 = d6Var3;
                jcVar4 = jcVar6;
            } else {
                if (c02) {
                    user2 = user;
                    jcVar4 = jcVar6;
                    chat3 = chat;
                    d6Var2 = d6Var3;
                    org.telegram.ui.ActionBar.e1 c14 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), false, this.d);
                    final int i15 = 0;
                    final org.telegram.ui.ActionBar.d6 d6Var4 = this.d;
                    final TLRPC.Chat chat5 = chat2;
                    v5Var = this;
                    c14.setOnClickListener(new View.OnClickListener(this) { // from class: ai.t5
                        public final /* synthetic */ v5 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i16 = i15;
                            String str2 = str;
                            TLObject tLObject = chat5;
                            org.telegram.ui.ActionBar.d6 d6Var5 = d6Var4;
                            String str3 = sharedPrefKey;
                            v5 v5Var2 = this.b;
                            switch (i16) {
                                case 0:
                                    e6 e6Var2 = v5Var2.l;
                                    MessagesController.getNotificationsSettings(e6Var2.C2).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str3, false).apply();
                                    NotificationsController.getInstance(e6Var2.C2).updateServerNotificationsSettings(e6Var2.B1, 0L);
                                    org.telegram.ui.Components.qc V = new xc(e6Var2.c1, d6Var5).V(Arrays.asList(tLObject), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, str2)), null, null);
                                    V.a = 2;
                                    V.j();
                                    v5 v5Var3 = e6Var2.t1;
                                    if (v5Var3 != null) {
                                        v5Var3.a();
                                        break;
                                    }
                                    break;
                                default:
                                    e6 e6Var3 = v5Var2.l;
                                    MessagesController.getNotificationsSettings(e6Var3.C2).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str3, true).apply();
                                    NotificationsController.getInstance(e6Var3.C2).updateServerNotificationsSettings(e6Var3.B1, 0L);
                                    org.telegram.ui.Components.qc V2 = new xc(e6Var3.c1, d6Var5).V(Arrays.asList(tLObject), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, str2)), null, null);
                                    V2.a = 2;
                                    V2.j();
                                    v5 v5Var4 = e6Var3.t1;
                                    if (v5Var4 != null) {
                                        v5Var4.a();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    c14.setMultiline(false);
                } else {
                    v5Var = this;
                    user2 = user;
                    chat3 = chat;
                    d6Var2 = d6Var3;
                    jcVar4 = jcVar6;
                    final TLRPC.Chat chat6 = chat2;
                    org.telegram.ui.ActionBar.e1 c15 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), false, v5Var.d);
                    final int i16 = 1;
                    final org.telegram.ui.ActionBar.d6 d6Var5 = v5Var.d;
                    c15.setOnClickListener(new View.OnClickListener(v5Var) { // from class: ai.t5
                        public final /* synthetic */ v5 b;

                        {
                            this.b = v5Var;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i162 = i16;
                            String str2 = str;
                            TLObject tLObject = chat6;
                            org.telegram.ui.ActionBar.d6 d6Var52 = d6Var5;
                            String str3 = sharedPrefKey;
                            v5 v5Var2 = this.b;
                            switch (i162) {
                                case 0:
                                    e6 e6Var2 = v5Var2.l;
                                    MessagesController.getNotificationsSettings(e6Var2.C2).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str3, false).apply();
                                    NotificationsController.getInstance(e6Var2.C2).updateServerNotificationsSettings(e6Var2.B1, 0L);
                                    org.telegram.ui.Components.qc V = new xc(e6Var2.c1, d6Var52).V(Arrays.asList(tLObject), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, str2)), null, null);
                                    V.a = 2;
                                    V.j();
                                    v5 v5Var3 = e6Var2.t1;
                                    if (v5Var3 != null) {
                                        v5Var3.a();
                                        break;
                                    }
                                    break;
                                default:
                                    e6 e6Var3 = v5Var2.l;
                                    MessagesController.getNotificationsSettings(e6Var3.C2).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str3, true).apply();
                                    NotificationsController.getInstance(e6Var3.C2).updateServerNotificationsSettings(e6Var3.B1, 0L);
                                    org.telegram.ui.Components.qc V2 = new xc(e6Var3.c1, d6Var52).V(Arrays.asList(tLObject), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, str2)), null, null);
                                    V2.a = 2;
                                    V2.j();
                                    v5 v5Var4 = e6Var3.t1;
                                    if (v5Var4 != null) {
                                        v5Var4.a();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    c15.setMultiline(false);
                }
                MediaDataController.getInstance(e6Var.C2).loadHints(true);
                boolean z17 = (user2 == null || user2.contact || !MediaDataController.getInstance(e6Var.C2).containsTopPeer(e6Var.B1)) ? false : true;
                if (e6Var.B1 > 0) {
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
                    org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), false, v5Var.d).setOnClickListener(new i5(v5Var, 14));
                } else if (z10) {
                    if (z11) {
                        org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), false, v5Var.d).setOnClickListener(new i5(v5Var, 0));
                    } else {
                        org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), false, v5Var.d).setOnClickListener(new i5(v5Var, 15));
                    }
                }
            }
            if (c6Var.f) {
                final int i17 = 0;
                jcVar5 = jcVar4;
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_video_pip, LocaleController.getString(R.string.PipMinimize), false, v5Var.d).setOnClickListener(new View.OnClickListener(v5Var) { // from class: ai.j5
                    public final /* synthetic */ v5 b;

                    {
                        this.b = v5Var;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i17) {
                            case 0:
                                v5 v5Var2 = this.b.l.t1;
                                if (v5Var2 != null) {
                                    v5Var2.a();
                                }
                                jcVar5.N();
                                break;
                            default:
                                v5 v5Var3 = this.b.l.t1;
                                if (v5Var3 != null) {
                                    v5Var3.a();
                                }
                                jcVar5.N();
                                break;
                        }
                    }
                });
            } else {
                jcVar5 = jcVar4;
            }
            if (!MessagesController.getInstance(e6Var.C2).premiumFeaturesBlocked() && c6Var.e) {
                boolean z18 = MessagesController.getInstance(e6Var.C2).storyQualityFull;
                if (UserConfig.getInstance(e6Var.C2).isPremium()) {
                    org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, z18 ? R.drawable.menu_quality_sd : R.drawable.menu_quality_hd, LocaleController.getString(z18 ? R.string.StoryQualityDecrease : R.string.StoryQualityIncrease), false, e6Var.B0).setOnClickListener(new j3(0, e6Var, z18));
                } else {
                    Drawable drawable = e6Var.getContext().getDrawable(R.drawable.msg_gallery_locked2);
                    i10 = -1;
                    drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                    t3 t3Var = new t3(e6Var.getContext().getDrawable(R.drawable.menu_quality_hd2), drawable, 1);
                    int dp = AndroidUtilities.dp(24.0f);
                    int dp2 = AndroidUtilities.dp(24.0f);
                    t3Var.e = dp;
                    t3Var.f = dp2;
                    int dp3 = AndroidUtilities.dp(1.0f);
                    int i18 = -AndroidUtilities.dp(2.0f);
                    t3Var.s = dp3;
                    t3Var.v = i18;
                    org.telegram.ui.ActionBar.e1 c16 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_quality_hd, LocaleController.getString(R.string.StoryQualityIncrease), false, e6Var.B0);
                    c16.setOnClickListener(new e3(e6Var, 7));
                    c16.setIcon(t3Var);
                    if (!e6Var.c3 && e6Var.S2 && !c6Var.f) {
                        if (!UserConfig.getInstance(e6Var.C2).isPremium()) {
                            org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_gallery, LocaleController.getString(R.string.SaveToGallery), false, v5Var.d).setOnClickListener(new i5(v5Var, 1));
                        } else if (!MessagesController.getInstance(e6Var.C2).premiumFeaturesBlocked()) {
                            Drawable drawable2 = context.getDrawable(R.drawable.msg_gallery_locked2);
                            drawable2.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, i10, -16777216), PorterDuff.Mode.MULTIPLY));
                            t3 t3Var2 = new t3(context.getDrawable(R.drawable.msg_gallery_locked1), drawable2, 2);
                            actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            org.telegram.ui.ActionBar.e1 c17 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_gallery, LocaleController.getString(R.string.SaveToGallery), false, v5Var.d);
                            c17.setIcon(t3Var2);
                            c17.setOnClickListener(new d0(v5Var, c17, jcVar5, 2));
                            if (!MessagesController.getInstance(e6Var.C2).premiumFeaturesBlocked() && !e6Var.D1) {
                                e6.b0(e6Var, actionBarPopupWindow$ActionBarPopupWindowLayout7);
                            }
                            if (e6Var.U2) {
                                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), false, v5Var.d).setOnClickListener(new i5(v5Var, 2));
                            }
                            if (e6Var.U2) {
                                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_shareout, LocaleController.getString(R.string.BotShare), false, v5Var.d).setOnClickListener(new i5(v5Var, 3));
                            }
                            storyItem3 = c6Var.a;
                            if (storyItem3 != null) {
                                if (storyItem3.translated && TextUtils.equals(storyItem3.translatedLng, i41.A())) {
                                    org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_translate, LocaleController.getString(R.string.HideTranslation), false, v5Var.d).setOnClickListener(new i5(v5Var, 4));
                                } else if (MessagesController.getInstance(e6Var.C2).getTranslateController().canTranslateStory(c6Var.a)) {
                                    actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                    org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout8, R.drawable.msg_translate, LocaleController.getString(R.string.TranslateMessage), false, v5Var.d).setOnClickListener(new i5(v5Var, 5));
                                    v5Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout8, c6Var.a);
                                    if (!e6Var.c3 || UserObject.isService(e6Var.B1) || e6Var.I0()) {
                                        actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                        d6Var = d6Var2;
                                    } else {
                                        d6Var = d6Var2;
                                        org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout8, R.drawable.msg_report, LocaleController.getString(R.string.ReportChat), false, v5Var.d).setOnClickListener(new k5(v5Var, jcVar5, d6Var));
                                        actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                    }
                                }
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            v5Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout8, c6Var.a);
                            if (e6Var.c3) {
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            d6Var = d6Var2;
                        }
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    if (!MessagesController.getInstance(e6Var.C2).premiumFeaturesBlocked()) {
                        e6.b0(e6Var, actionBarPopupWindow$ActionBarPopupWindowLayout7);
                    }
                    if (e6Var.U2) {
                    }
                    if (e6Var.U2) {
                    }
                    storyItem3 = c6Var.a;
                    if (storyItem3 != null) {
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    v5Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout8, c6Var.a);
                    if (e6Var.c3) {
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    d6Var = d6Var2;
                }
            }
            i10 = -1;
            if (!e6Var.c3) {
                if (!UserConfig.getInstance(e6Var.C2).isPremium()) {
                }
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            if (!MessagesController.getInstance(e6Var.C2).premiumFeaturesBlocked()) {
            }
            if (e6Var.U2) {
            }
            if (e6Var.U2) {
            }
            storyItem3 = c6Var.a;
            if (storyItem3 != null) {
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            v5Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout8, c6Var.a);
            if (e6Var.c3) {
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            d6Var = d6Var2;
        }
        boolean z19 = (c6Var == null || (storyItem2 = c6Var.a) == null || (messageMedia = storyItem2.media) == null || (!MessageObject.isDocumentHasAttachedStickers(messageMedia.document) && ((photo = c6Var.a.media.photo) == null || !photo.has_stickers))) ? false : true;
        if (c6Var != null) {
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList3 = new ArrayList();
            TL_stories.StoryItem storyItem8 = c6Var.a;
            if (storyItem8 != null && storyItem8.media_areas != null) {
                for (int i19 = 0; i19 < c6Var.a.media_areas.size(); i19++) {
                    TL_stories.MediaArea mediaArea2 = c6Var.a.media_areas.get(i19);
                    if (mediaArea2 instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                        TLRPC.Reaction reaction = mediaArea2.reaction;
                        if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                            TLRPC.Document f7 = org.telegram.ui.Components.q5.f(e6Var.C2, ((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
                            if (f7 != null && (inputStickerSet2 = MessageObject.getInputStickerSet(f7)) != null && !hashSet2.contains(Long.valueOf(inputStickerSet2.id))) {
                                hashSet2.add(Long.valueOf(inputStickerSet2.id));
                                arrayList3.add(inputStickerSet2);
                            }
                        }
                    }
                }
            }
            TL_stories.StoryItem storyItem9 = c6Var.a;
            if (storyItem9 == null || (arrayList2 = storyItem9.entities) == null || arrayList2.isEmpty()) {
                k9 k9Var = c6Var.b;
                if (k9Var != null && (l8Var = k9Var.c) != null) {
                    if (l8Var.T0 != null) {
                        for (int i20 = 0; i20 < c6Var.b.c.T0.size(); i20++) {
                            VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) c6Var.b.c.T0.get(i20);
                            if (mediaEntity.type == 4 && (mediaArea = mediaEntity.mediaArea) != null) {
                                TLRPC.Reaction reaction2 = mediaArea.reaction;
                                if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                    TLRPC.Document f10 = org.telegram.ui.Components.q5.f(e6Var.C2, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id);
                                    if (f10 != null && (inputStickerSet = MessageObject.getInputStickerSet(f10)) != null && !hashSet2.contains(Long.valueOf(inputStickerSet.id))) {
                                        hashSet2.add(Long.valueOf(inputStickerSet.id));
                                        arrayList3.add(inputStickerSet);
                                    }
                                }
                            }
                        }
                    }
                    CharSequence charSequence = c6Var.b.c.C0;
                    if ((charSequence instanceof Spanned) && (z5VarArr = (org.telegram.ui.Components.z5[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.z5.class)) != null) {
                        int i21 = 0;
                        while (i21 < z5VarArr.length) {
                            org.telegram.ui.Components.z5 z5Var = z5VarArr[i21];
                            TLRPC.Document document = z5Var.document;
                            if (document == null) {
                                num2 = num3;
                                document = org.telegram.ui.Components.q5.f(e6Var.C2, z5Var.documentId);
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
                for (int i22 = 0; i22 < c6Var.a.entities.size(); i22++) {
                    TLRPC.MessageEntity messageEntity = c6Var.a.entities.get(i22);
                    if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                        TLRPC.Document document2 = tL_messageEntityCustomEmoji.document;
                        if (document2 == null) {
                            document2 = org.telegram.ui.Components.q5.f(e6Var.C2, tL_messageEntityCustomEmoji.document_id);
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
            org.telegram.ui.ActionBar.j1 j1Var3 = new org.telegram.ui.ActionBar.j1(context, org.telegram.ui.ActionBar.h6.H8, d6Var);
            j1Var3.setTag(R.id.fit_width_tag, num);
            actionBarPopupWindow$ActionBarPopupWindowLayout6.a(j1Var3, w7.y5.n(-1, 8));
            TLRPC.MessageMedia messageMedia3 = c6Var.a.media;
            TLObject tLObject = messageMedia3.document;
            if (tLObject == null) {
                tLObject = messageMedia3.photo;
            }
            db dbVar = new db(v5Var.i, e6Var.C2, tLObject, c6Var.a, z19, arrayList, v5Var.d);
            dbVar.setOnClickListener(new f2(3, v5Var, dbVar));
            dbVar.setTag(R.id.fit_width_tag, num);
            actionBarPopupWindow$ActionBarPopupWindowLayout6.a(dbVar, w7.y5.n(-1, -2));
        }
    }

    @Override // org.telegram.ui.Components.yr
    public final void c() {
        if (!this.c && !this.k[0]) {
            AndroidUtilities.runOnUIThread(new m5(this, 0));
        }
        e6 e6Var = this.l;
        e6Var.t1 = null;
        e6Var.s1 = null;
    }

    public final void d(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z10) {
        c6 c6Var;
        boolean z11 = this.f;
        e6 e6Var = this.l;
        if (!z11 || ((c6Var = e6Var.O1) != null && c6Var.b != null)) {
            e6Var.C3 = null;
            e6Var.D3 = null;
            return;
        }
        Context context = e6Var.getContext();
        fh0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
        final of.b bVar = new of.b(2, this, actionBarPopupWindow$ActionBarPopupWindowLayout);
        vr vrVar = new vr();
        org.telegram.ui.ActionBar.e1[] e1VarArr = new org.telegram.ui.ActionBar.e1[5];
        vrVar.c = e1VarArr;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, context, null);
        vrVar.a = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setFitItems(true);
        org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, null);
        c10.setOnClickListener(new qr(swipeBack, 1));
        c10.c(-328966, -328966);
        c10.setSelectorColor(268435455);
        View w5Var = new w5(context, 12);
        w5Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        w5Var.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(w5Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) w5Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(8.0f);
        w5Var.setLayoutParams(layoutParams);
        org.telegram.ui.ActionBar.a1 a1Var = new org.telegram.ui.ActionBar.a1(context, null);
        vrVar.b = a1Var;
        a1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        a1Var.setDrawShadow(false);
        a1Var.setBackgroundColor(-14540254);
        a1Var.setTextColor(-1);
        a1Var.setOnValueChange(new org.telegram.ui.b5(bVar, 6));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(a1Var, w7.y5.n(-1, 44));
        View w5Var2 = new w5(context, 13);
        w5Var2.setMinimumWidth(AndroidUtilities.dp(196.0f));
        w5Var2.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(w5Var2);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) w5Var2.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams2.gravity = 5;
        }
        layoutParams2.width = -1;
        layoutParams2.height = AndroidUtilities.dp(8.0f);
        w5Var2.setLayoutParams(layoutParams2);
        org.telegram.ui.ActionBar.e1 c11 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_0_2, LocaleController.getString(R.string.SpeedVerySlow), false, null);
        c11.c(-328966, -328966);
        final int i10 = 0;
        c11.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ur
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        bVar.Q(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.Q(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.Q(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.Q(true, true, 1.5f);
                        break;
                    default:
                        bVar.Q(true, true, 2.0f);
                        break;
                }
            }
        });
        c11.setSelectorColor(268435455);
        e1VarArr[0] = c11;
        org.telegram.ui.ActionBar.e1 c12 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow), false, null);
        c12.c(-328966, -328966);
        final int i11 = 1;
        c12.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ur
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        bVar.Q(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.Q(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.Q(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.Q(true, true, 1.5f);
                        break;
                    default:
                        bVar.Q(true, true, 2.0f);
                        break;
                }
            }
        });
        c12.setSelectorColor(268435455);
        e1VarArr[1] = c12;
        org.telegram.ui.ActionBar.e1 c13 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal), false, null);
        c13.c(-328966, -328966);
        final int i12 = 2;
        c13.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ur
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        bVar.Q(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.Q(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.Q(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.Q(true, true, 1.5f);
                        break;
                    default:
                        bVar.Q(true, true, 2.0f);
                        break;
                }
            }
        });
        c13.setSelectorColor(268435455);
        e1VarArr[2] = c13;
        org.telegram.ui.ActionBar.e1 c14 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast), false, null);
        c14.c(-328966, -328966);
        final int i13 = 3;
        c14.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ur
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        bVar.Q(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.Q(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.Q(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.Q(true, true, 1.5f);
                        break;
                    default:
                        bVar.Q(true, true, 2.0f);
                        break;
                }
            }
        });
        c14.setSelectorColor(268435455);
        e1VarArr[3] = c14;
        org.telegram.ui.ActionBar.e1 c15 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedVeryFast), false, null);
        c15.c(-328966, -328966);
        final int i14 = 4;
        c15.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ur
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        bVar.Q(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.Q(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.Q(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.Q(true, true, 1.5f);
                        break;
                    default:
                        bVar.Q(true, true, 2.0f);
                        break;
                }
            }
        });
        c15.setSelectorColor(268435455);
        e1VarArr[4] = c15;
        e6Var.C3 = vrVar;
        vrVar.a(jc.B1, true);
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, e6Var.getContext(), this.d, false, false);
        e6Var.D3 = e1Var;
        e1Var.g(LocaleController.getString(R.string.Speed), R.drawable.msg_speed, null);
        e6.a0(e6Var, true);
        e6Var.D3.setMinimumWidth(AndroidUtilities.dp(196.0f));
        e6Var.D3.setRightIcon(R.drawable.msg_arrowright);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e6Var.D3);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) e6Var.D3.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams3.gravity = 5;
        }
        layoutParams3.width = -1;
        layoutParams3.height = AndroidUtilities.dp(48.0f);
        e6Var.D3.setLayoutParams(layoutParams3);
        int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(e6Var.C3.a);
        org.telegram.ui.ActionBar.e1 e1Var2 = e6Var.D3;
        e1Var2.G = new n5(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 0);
        e1Var2.setOnClickListener(new i5(this, 11));
        actionBarPopupWindow$ActionBarPopupWindowLayout.c = true;
        if (z10) {
            org.telegram.ui.ActionBar.j1 j1Var = new org.telegram.ui.ActionBar.j1(e6Var.getContext(), org.telegram.ui.ActionBar.h6.H8, this.d);
            j1Var.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(j1Var, w7.y5.n(-1, 8));
        }
    }

    public final void e(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, TL_stories.StoryItem storyItem) {
        TLRPC.Chat chat;
        e6 e6Var = this.l;
        if (!e6Var.D1 || storyItem == null || (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) || (chat = MessagesController.getInstance(e6Var.C2).getChat(Long.valueOf(-e6Var.B1))) == null) {
            return;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(e6Var.C2).getChatFull(chat.id);
        if (chatFull == null) {
            chatFull = MessagesStorage.getInstance(e6Var.C2).loadChatInfo(chat.id, true, new CountDownLatch(1), false, false);
        }
        if (chatFull == null || !chatFull.can_view_stats) {
            return;
        }
        org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stats, LocaleController.getString(R.string.ViewStatistics), false, this.d).setOnClickListener(new o5(this, storyItem, this.e, chat, 0));
    }
}
