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
import org.telegram.ui.Components.ks;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.vh0;
import org.telegram.ui.Components.x41;
import org.telegram.ui.Components.zc;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.es;
import org.telegram.ui.zr;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class h5 extends ks {
    public boolean c;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 d;
    public final /* synthetic */ sb e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Context i;
    public final /* synthetic */ n5 j;
    public final /* synthetic */ boolean[] k;
    public final /* synthetic */ q5 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(q5 q5Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.ActionBar.c6 c6Var2, sb sbVar, boolean z10, boolean z11, boolean z12, Context context2, n5 n5Var, boolean[] zArr) {
        super(context, c6Var, true);
        this.l = q5Var;
        this.d = c6Var2;
        this.e = sbVar;
        this.f = z10;
        this.g = z11;
        this.h = z12;
        this.i = context2;
        this.j = n5Var;
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
    /* JADX WARN: Code restructure failed: missing block: B:399:0x08a7, code lost:
    
        if (r2.bot_can_edit == false) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x08d5, code lost:
    
        if (r2.delete_stories == false) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x08e0, code lost:
    
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
    @Override // org.telegram.ui.Components.ks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        org.telegram.ui.ActionBar.c6 c6Var;
        final h5 h5Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        TL_stories.StoryItem storyItem;
        boolean z10;
        boolean z11;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3;
        sb sbVar;
        sb sbVar2;
        final sb sbVar3;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout5;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout6;
        t1 t1Var;
        TLRPC.GroupCall groupCall;
        t1 t1Var2;
        Integer num;
        ArrayList arrayList;
        di.k8 k8Var;
        org.telegram.ui.Components.b6[] b6VarArr;
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
        sb sbVar4;
        final sb sbVar5;
        int i10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout7;
        TL_stories.StoryItem storyItem3;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout8;
        TLRPC.User user2;
        TLRPC.Chat chat3;
        boolean z12;
        boolean z13;
        Integer num3 = 1;
        q5 q5Var = this.l;
        o5 o5Var = q5Var.O1;
        boolean z14 = this.g;
        Context context = this.i;
        sb sbVar6 = this.e;
        org.telegram.ui.ActionBar.c6 c6Var3 = this.d;
        if (z14 || o5Var.b != null) {
            c6Var = c6Var3;
            h5Var = this;
            TL_stories.StoryItem storyItem4 = o5Var.a;
            if (o5Var.b != null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_cancel, LocaleController.getString(R.string.Cancel), false, h5Var.d).setOnClickListener(new v4(h5Var, 6));
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            }
            if (storyItem4 == null) {
                return;
            }
            if (!(q5Var.C1 || q5Var.S1.h(q5Var.B1)) || o5Var.f || (storyItem = o5Var.a) == null) {
                z10 = true;
            } else {
                HashSet hashSet = storyItem.albums != null ? new HashSet(storyItem.albums) : new HashSet();
                l80 l80Var = new l80(actionBarPopupWindow$ActionBarPopupWindowLayout2, c6Var);
                l80Var.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new a3.d(actionBarPopupWindow$ActionBarPopupWindowLayout2, 19), false);
                l80Var.k();
                i8 B = q5Var.getStoriesController().B(q5Var.B1, true);
                i8 B2 = q5Var.S1.B(q5Var.B1, false);
                l80.f(l80Var, B, hashSet, B2 != null && B2.a(), new a3.l0(h5Var, c6Var, storyItem, 5), new u3(h5Var, hashSet, storyItem, c6Var, 2));
                int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout2.b(l80Var.B);
                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, q5Var.getContext(), h5Var.d, false, false);
                q5Var.E3 = e1Var;
                e1Var.g(LocaleController.getString(R.string.StoriesAlbumAddToAlbum), R.drawable.menu_album_add, null);
                org.telegram.ui.ActionBar.e1 e1Var2 = q5Var.E3;
                e1Var2.G = new a5(actionBarPopupWindow$ActionBarPopupWindowLayout2, b10, 1);
                e1Var2.setOnClickListener(new v4(h5Var, 12));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(q5Var.E3);
                z10 = true;
                actionBarPopupWindow$ActionBarPopupWindowLayout2.c = true;
                org.telegram.ui.ActionBar.j1 j1Var = new org.telegram.ui.ActionBar.j1(q5Var.getContext(), org.telegram.ui.ActionBar.g6.H8, c6Var);
                j1Var.setTag(R.id.fit_width_tag, num3);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(j1Var, w7.z5.n(-1, 8));
            }
            if (q5Var.C1) {
                z11 = z10;
                di.ca caVar = storyItem4.privacy.isEmpty() ? new di.ca(3, q5Var.C2, new ArrayList()) : new di.ca(q5Var.C2, storyItem4.privacy);
                actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, R.drawable.msg_view_file, LocaleController.getString(R.string.WhoCanSee), false, h5Var.d);
                c10.setSubtext(caVar.toString());
                c10.setOnClickListener(new x(h5Var, caVar, storyItem4, 1));
                c10.setItemHeight(56);
            } else {
                z11 = z10;
                actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            }
            h5Var.d(actionBarPopupWindow$ActionBarPopupWindowLayout3, false);
            if (q5Var.C1 || h5Var.f) {
                org.telegram.ui.ActionBar.j1 j1Var2 = new org.telegram.ui.ActionBar.j1(q5Var.getContext(), org.telegram.ui.ActionBar.g6.H8, c6Var);
                j1Var2.setTag(R.id.fit_width_tag, num3);
                actionBarPopupWindow$ActionBarPopupWindowLayout3.a(j1Var2, w7.z5.n(-1, 8));
            }
            if (q5Var.c3 || o5Var.f || !((q5Var.I0() || MessagesController.getInstance(q5Var.C2).storiesEnabled()) && h5Var.h)) {
                sbVar = sbVar6;
            } else {
                org.telegram.ui.ActionBar.e1 c11 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, R.drawable.msg_edit, LocaleController.getString(q5Var.I0() ? R.string.EditBotPreview : R.string.EditStory), false, h5Var.d);
                q5Var.s1 = c11;
                sbVar = sbVar6;
                c11.setOnClickListener(new l0(h5Var, h5Var.d, h5Var.i, sbVar6, h5Var.j, 2));
                if (q5Var.S1.K(q5Var.B1) && o5Var.e && !SharedConfig.allowPreparingHevcPlayers()) {
                    q5Var.s1.setAlpha(0.5f);
                }
            }
            TL_stories.StoryItem storyItem5 = o5Var.a;
            if (storyItem5 == null || !o5Var.e || o5Var.f || !(storyItem5.pinned || q5Var.J0())) {
                sbVar2 = sbVar;
            } else {
                sbVar2 = sbVar;
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_cover_stories, LocaleController.getString(R.string.StoryEditCoverMenu), false, h5Var.d).setOnClickListener(new l0(h5Var, h5Var.i, storyItem4, sbVar2, h5Var.j, 3));
            }
            if ((q5Var.C1 || (q5Var.D1 && MessagesController.getInstance(q5Var.C2).getStoriesController().h(storyItem4.dialogId))) && !o5Var.f) {
                boolean z15 = storyItem4.pinned;
                boolean z16 = !z15;
                sbVar3 = sbVar2;
                actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, !z15 ? R.drawable.msg_save_story : R.drawable.menu_unsave_story, q5Var.C1 ? LocaleController.getString(!z15 ? R.string.SaveToProfile : R.string.ArchiveStory) : LocaleController.getString(!z15 ? R.string.SaveToPosts : R.string.RemoveFromPosts), false, h5Var.d).setOnClickListener(new y4(h5Var, storyItem4, z16, c6Var, 0));
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                sbVar3 = sbVar2;
            }
            h5Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout4, storyItem4);
            if (q5Var.c3 || o5Var.f) {
                actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout5, R.drawable.msg_gallery, LocaleController.getString(o5Var.e ? R.string.SaveVideo : R.string.SaveImage), false, h5Var.d).setOnClickListener(new v4(h5Var, 7));
            }
            if (!MessagesController.getInstance(q5Var.C2).premiumFeaturesBlocked() && !o5Var.f && !q5Var.D1) {
                q5.b0(q5Var, actionBarPopupWindow$ActionBarPopupWindowLayout5);
            }
            if (q5Var.D1 && q5Var.U2) {
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout5, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), false, h5Var.d).setOnClickListener(new v4(h5Var, 8));
            }
            if (q5Var.U2) {
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_shareout, LocaleController.getString(R.string.BotShare), false, h5Var.d).setOnClickListener(new v4(h5Var, 9));
            }
            TL_stories.StoryItem storyItem6 = o5Var.a;
            if (storyItem6 != null) {
                TLRPC.MessageMedia messageMedia2 = storyItem6.media;
                if ((messageMedia2 instanceof TLRPC.TL_messageMediaVideoStream) && (t1Var2 = t1.W) != null && t1Var2.f(((TLRPC.TL_messageMediaVideoStream) messageMedia2).call)) {
                    t1 t1Var3 = t1.W;
                    boolean z17 = (t1Var3 == null || !t1Var3.o()) ? false : z11;
                    org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, z17 ? R.drawable.msg_voice_unmuted : R.drawable.msg_voice_muted, LocaleController.getString(z17 ? R.string.Unmute : R.string.Mute), false, h5Var.d).setOnClickListener(new z2(1, h5Var, z17));
                    org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_camera_retake, LocaleController.getString(R.string.AccDescrSwitchCamera), false, h5Var.d).setOnClickListener(new v4(h5Var, 10));
                }
            }
            if (o5Var.f) {
                final int i11 = 1;
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_video_pip, LocaleController.getString(R.string.PipMinimize), false, h5Var.d).setOnClickListener(new View.OnClickListener(h5Var) { // from class: bi.w4
                    public final /* synthetic */ h5 b;

                    {
                        this.b = h5Var;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                h5 h5Var2 = this.b.l.t1;
                                if (h5Var2 != null) {
                                    h5Var2.a();
                                }
                                sbVar3.N();
                                break;
                            default:
                                h5 h5Var3 = this.b.l.t1;
                                if (h5Var3 != null) {
                                    h5Var3.a();
                                }
                                sbVar3.N();
                                break;
                        }
                    }
                });
            }
            if (o5Var.f && (q5Var.B1 == UserConfig.getInstance(q5Var.C2).getClientUserId() || ChatObject.canManageCalls(MessagesController.getInstance(q5Var.C2).getChat(Long.valueOf(-q5Var.B1))) || ((t1Var = sbVar3.A0) != null && o5Var.k(t1Var.g()) && (groupCall = sbVar3.A0.v) != null && groupCall.creator))) {
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_settings_old, LocaleController.getString(R.string.LiveStorySettings), false, h5Var.d).setOnClickListener(new x4(h5Var, c6Var, sbVar3, 1));
            }
            if (o5Var.f) {
                org.telegram.ui.ActionBar.e1 c12 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_remove, LocaleController.getString(R.string.LiveStoryEnd), false, h5Var.d);
                int i12 = org.telegram.ui.ActionBar.g6.q7;
                c12.setSelectorColor(org.telegram.ui.ActionBar.g6.m1(0.12f, org.telegram.ui.ActionBar.g6.w0(i12, c6Var)));
                c12.c(c6Var.E0(i12), c6Var.E0(i12));
                c12.setOnClickListener(new x4(h5Var, c6Var, sbVar3, 2));
            }
            if (!o5Var.f) {
                if (!q5Var.C1) {
                    x8 storiesController = MessagesController.getInstance(q5Var.C2).getStoriesController();
                    TL_stories.StoryItem storyItem7 = o5Var.a;
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
                org.telegram.ui.ActionBar.e1 c13 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout6, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), false, h5Var.d);
                int i14 = org.telegram.ui.ActionBar.g6.q7;
                c13.setSelectorColor(org.telegram.ui.ActionBar.g6.m1(0.12f, org.telegram.ui.ActionBar.g6.w0(i14, c6Var)));
                c13.c(c6Var.E0(i14), c6Var.E0(i14));
                c13.setOnClickListener(new v4(h5Var, 13));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        } else {
            d(actionBarPopupWindow$ActionBarPopupWindowLayout, true);
            final String sharedPrefKey = NotificationsController.getSharedPrefKey(q5Var.B1, 0L);
            boolean c02 = NotificationsCustomSettingsActivity.c0(q5Var.C2, q5Var.B1);
            if (q5Var.B1 > 0) {
                ?? user4 = MessagesController.getInstance(q5Var.C2).getUser(Long.valueOf(q5Var.B1));
                chat2 = user4;
                chat = null;
                user = user4;
            } else {
                chat = MessagesController.getInstance(q5Var.C2).getChat(Long.valueOf(-q5Var.B1));
                chat2 = chat;
                user = null;
            }
            String trim = user == null ? chat == null ? "" : chat.title : UserObject.getFirstName(user).trim();
            int indexOf = trim.indexOf(" ");
            if (indexOf > 0) {
                trim = trim.substring(0, indexOf);
            }
            final String str = trim;
            if (UserObject.isService(q5Var.B1) || q5Var.I0()) {
                h5Var = this;
                c6Var2 = c6Var3;
                sbVar4 = sbVar6;
            } else {
                if (c02) {
                    user2 = user;
                    sbVar4 = sbVar6;
                    chat3 = chat;
                    c6Var2 = c6Var3;
                    org.telegram.ui.ActionBar.e1 c14 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), false, this.d);
                    final int i15 = 0;
                    final org.telegram.ui.ActionBar.c6 c6Var4 = this.d;
                    final TLRPC.Chat chat5 = chat2;
                    h5Var = this;
                    c14.setOnClickListener(new View.OnClickListener(this) { // from class: bi.f5
                        public final /* synthetic */ h5 b;

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
                            h5 h5Var2 = this.b;
                            switch (i16) {
                                case 0:
                                    q5 q5Var2 = h5Var2.l;
                                    MessagesController.getNotificationsSettings(q5Var2.C2).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str3, false).apply();
                                    NotificationsController.getInstance(q5Var2.C2).updateServerNotificationsSettings(q5Var2.B1, 0L);
                                    sc V = new zc(q5Var2.c1, c6Var5).V(Arrays.asList(tLObject), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, str2)), null, null);
                                    V.a = 2;
                                    V.j();
                                    h5 h5Var3 = q5Var2.t1;
                                    if (h5Var3 != null) {
                                        h5Var3.a();
                                        break;
                                    }
                                    break;
                                default:
                                    q5 q5Var3 = h5Var2.l;
                                    MessagesController.getNotificationsSettings(q5Var3.C2).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str3, true).apply();
                                    NotificationsController.getInstance(q5Var3.C2).updateServerNotificationsSettings(q5Var3.B1, 0L);
                                    sc V2 = new zc(q5Var3.c1, c6Var5).V(Arrays.asList(tLObject), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, str2)), null, null);
                                    V2.a = 2;
                                    V2.j();
                                    h5 h5Var4 = q5Var3.t1;
                                    if (h5Var4 != null) {
                                        h5Var4.a();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    c14.setMultiline(false);
                } else {
                    h5Var = this;
                    user2 = user;
                    chat3 = chat;
                    c6Var2 = c6Var3;
                    sbVar4 = sbVar6;
                    final TLRPC.Chat chat6 = chat2;
                    org.telegram.ui.ActionBar.e1 c15 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), false, h5Var.d);
                    final int i16 = 1;
                    final org.telegram.ui.ActionBar.c6 c6Var5 = h5Var.d;
                    c15.setOnClickListener(new View.OnClickListener(h5Var) { // from class: bi.f5
                        public final /* synthetic */ h5 b;

                        {
                            this.b = h5Var;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i162 = i16;
                            String str2 = str;
                            TLObject tLObject = chat6;
                            org.telegram.ui.ActionBar.c6 c6Var52 = c6Var5;
                            String str3 = sharedPrefKey;
                            h5 h5Var2 = this.b;
                            switch (i162) {
                                case 0:
                                    q5 q5Var2 = h5Var2.l;
                                    MessagesController.getNotificationsSettings(q5Var2.C2).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str3, false).apply();
                                    NotificationsController.getInstance(q5Var2.C2).updateServerNotificationsSettings(q5Var2.B1, 0L);
                                    sc V = new zc(q5Var2.c1, c6Var52).V(Arrays.asList(tLObject), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, str2)), null, null);
                                    V.a = 2;
                                    V.j();
                                    h5 h5Var3 = q5Var2.t1;
                                    if (h5Var3 != null) {
                                        h5Var3.a();
                                        break;
                                    }
                                    break;
                                default:
                                    q5 q5Var3 = h5Var2.l;
                                    MessagesController.getNotificationsSettings(q5Var3.C2).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str3, true).apply();
                                    NotificationsController.getInstance(q5Var3.C2).updateServerNotificationsSettings(q5Var3.B1, 0L);
                                    sc V2 = new zc(q5Var3.c1, c6Var52).V(Arrays.asList(tLObject), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, str2)), null, null);
                                    V2.a = 2;
                                    V2.j();
                                    h5 h5Var4 = q5Var3.t1;
                                    if (h5Var4 != null) {
                                        h5Var4.a();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    c15.setMultiline(false);
                }
                MediaDataController.getInstance(q5Var.C2).loadHints(true);
                boolean z19 = (user2 == null || user2.contact || !MediaDataController.getInstance(q5Var.C2).containsTopPeer(q5Var.B1)) ? false : true;
                if (q5Var.B1 > 0) {
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
                    org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), false, h5Var.d).setOnClickListener(new v4(h5Var, 14));
                } else if (z12) {
                    if (z13) {
                        org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), false, h5Var.d).setOnClickListener(new v4(h5Var, 0));
                    } else {
                        org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), false, h5Var.d).setOnClickListener(new v4(h5Var, 15));
                    }
                }
            }
            if (o5Var.f) {
                final int i17 = 0;
                sbVar5 = sbVar4;
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_video_pip, LocaleController.getString(R.string.PipMinimize), false, h5Var.d).setOnClickListener(new View.OnClickListener(h5Var) { // from class: bi.w4
                    public final /* synthetic */ h5 b;

                    {
                        this.b = h5Var;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i17) {
                            case 0:
                                h5 h5Var2 = this.b.l.t1;
                                if (h5Var2 != null) {
                                    h5Var2.a();
                                }
                                sbVar5.N();
                                break;
                            default:
                                h5 h5Var3 = this.b.l.t1;
                                if (h5Var3 != null) {
                                    h5Var3.a();
                                }
                                sbVar5.N();
                                break;
                        }
                    }
                });
            } else {
                sbVar5 = sbVar4;
            }
            if (!MessagesController.getInstance(q5Var.C2).premiumFeaturesBlocked() && o5Var.e) {
                boolean z20 = MessagesController.getInstance(q5Var.C2).storyQualityFull;
                if (UserConfig.getInstance(q5Var.C2).isPremium()) {
                    org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, z20 ? R.drawable.menu_quality_sd : R.drawable.menu_quality_hd, LocaleController.getString(z20 ? R.string.StoryQualityDecrease : R.string.StoryQualityIncrease), false, q5Var.B0).setOnClickListener(new z2(0, q5Var, z20));
                } else {
                    Drawable drawable = q5Var.getContext().getDrawable(R.drawable.msg_gallery_locked2);
                    i10 = -1;
                    drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                    j3 j3Var = new j3(q5Var.getContext().getDrawable(R.drawable.menu_quality_hd2), drawable, 1);
                    int dp = AndroidUtilities.dp(24.0f);
                    int dp2 = AndroidUtilities.dp(24.0f);
                    j3Var.e = dp;
                    j3Var.f = dp2;
                    int dp3 = AndroidUtilities.dp(1.0f);
                    int i18 = -AndroidUtilities.dp(2.0f);
                    j3Var.s = dp3;
                    j3Var.v = i18;
                    org.telegram.ui.ActionBar.e1 c16 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_quality_hd, LocaleController.getString(R.string.StoryQualityIncrease), false, q5Var.B0);
                    c16.setOnClickListener(new t2(q5Var, 7));
                    c16.setIcon(j3Var);
                    if (!q5Var.c3 && q5Var.S2 && !o5Var.f) {
                        if (!UserConfig.getInstance(q5Var.C2).isPremium()) {
                            org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_gallery, LocaleController.getString(R.string.SaveToGallery), false, h5Var.d).setOnClickListener(new v4(h5Var, 1));
                        } else if (!MessagesController.getInstance(q5Var.C2).premiumFeaturesBlocked()) {
                            Drawable drawable2 = context.getDrawable(R.drawable.msg_gallery_locked2);
                            drawable2.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, i10, -16777216), PorterDuff.Mode.MULTIPLY));
                            j3 j3Var2 = new j3(context.getDrawable(R.drawable.msg_gallery_locked1), drawable2, 2);
                            actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            org.telegram.ui.ActionBar.e1 c17 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_gallery, LocaleController.getString(R.string.SaveToGallery), false, h5Var.d);
                            c17.setIcon(j3Var2);
                            c17.setOnClickListener(new x(h5Var, c17, sbVar5, 2));
                            if (!MessagesController.getInstance(q5Var.C2).premiumFeaturesBlocked() && !q5Var.D1) {
                                q5.b0(q5Var, actionBarPopupWindow$ActionBarPopupWindowLayout7);
                            }
                            if (q5Var.U2) {
                                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), false, h5Var.d).setOnClickListener(new v4(h5Var, 2));
                            }
                            if (q5Var.U2) {
                                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_shareout, LocaleController.getString(R.string.BotShare), false, h5Var.d).setOnClickListener(new v4(h5Var, 3));
                            }
                            storyItem3 = o5Var.a;
                            if (storyItem3 != null) {
                                if (storyItem3.translated && TextUtils.equals(storyItem3.translatedLng, x41.D())) {
                                    org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_translate, LocaleController.getString(R.string.HideTranslation), false, h5Var.d).setOnClickListener(new v4(h5Var, 4));
                                } else if (MessagesController.getInstance(q5Var.C2).getTranslateController().canTranslateStory(o5Var.a)) {
                                    actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                    org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout8, R.drawable.msg_translate, LocaleController.getString(R.string.TranslateMessage), false, h5Var.d).setOnClickListener(new v4(h5Var, 5));
                                    h5Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout8, o5Var.a);
                                    if (!q5Var.c3 || UserObject.isService(q5Var.B1) || q5Var.I0()) {
                                        actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                        c6Var = c6Var2;
                                    } else {
                                        c6Var = c6Var2;
                                        org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout8, R.drawable.msg_report, LocaleController.getString(R.string.ReportChat), false, h5Var.d).setOnClickListener(new x4(h5Var, sbVar5, c6Var));
                                        actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                    }
                                    z11 = true;
                                }
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            h5Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout8, o5Var.a);
                            if (q5Var.c3) {
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            c6Var = c6Var2;
                            z11 = true;
                        }
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    if (!MessagesController.getInstance(q5Var.C2).premiumFeaturesBlocked()) {
                        q5.b0(q5Var, actionBarPopupWindow$ActionBarPopupWindowLayout7);
                    }
                    if (q5Var.U2) {
                    }
                    if (q5Var.U2) {
                    }
                    storyItem3 = o5Var.a;
                    if (storyItem3 != null) {
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    h5Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout8, o5Var.a);
                    if (q5Var.c3) {
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    c6Var = c6Var2;
                    z11 = true;
                }
            }
            i10 = -1;
            if (!q5Var.c3) {
                if (!UserConfig.getInstance(q5Var.C2).isPremium()) {
                }
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            if (!MessagesController.getInstance(q5Var.C2).premiumFeaturesBlocked()) {
            }
            if (q5Var.U2) {
            }
            if (q5Var.U2) {
            }
            storyItem3 = o5Var.a;
            if (storyItem3 != null) {
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            h5Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout8, o5Var.a);
            if (q5Var.c3) {
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            c6Var = c6Var2;
            z11 = true;
        }
        boolean z21 = (o5Var == null || (storyItem2 = o5Var.a) == null || (messageMedia = storyItem2.media) == null || (!MessageObject.isDocumentHasAttachedStickers(messageMedia.document) && ((photo = o5Var.a.media.photo) == null || !photo.has_stickers))) ? false : z11;
        if (o5Var != null) {
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList3 = new ArrayList();
            TL_stories.StoryItem storyItem8 = o5Var.a;
            if (storyItem8 != null && storyItem8.media_areas != null) {
                for (int i19 = 0; i19 < o5Var.a.media_areas.size(); i19++) {
                    TL_stories.MediaArea mediaArea2 = o5Var.a.media_areas.get(i19);
                    if (mediaArea2 instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                        TLRPC.Reaction reaction = mediaArea2.reaction;
                        if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                            TLRPC.Document f7 = org.telegram.ui.Components.s5.f(q5Var.C2, ((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
                            if (f7 != null && (inputStickerSet2 = MessageObject.getInputStickerSet(f7)) != null && !hashSet2.contains(Long.valueOf(inputStickerSet2.id))) {
                                hashSet2.add(Long.valueOf(inputStickerSet2.id));
                                arrayList3.add(inputStickerSet2);
                            }
                        }
                    }
                }
            }
            TL_stories.StoryItem storyItem9 = o5Var.a;
            if (storyItem9 == null || (arrayList2 = storyItem9.entities) == null || arrayList2.isEmpty()) {
                w8 w8Var = o5Var.b;
                if (w8Var != null && (k8Var = w8Var.c) != null) {
                    if (k8Var.T0 != null) {
                        for (int i20 = 0; i20 < o5Var.b.c.T0.size(); i20++) {
                            VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) o5Var.b.c.T0.get(i20);
                            if (mediaEntity.type == 4 && (mediaArea = mediaEntity.mediaArea) != null) {
                                TLRPC.Reaction reaction2 = mediaArea.reaction;
                                if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                    TLRPC.Document f10 = org.telegram.ui.Components.s5.f(q5Var.C2, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id);
                                    if (f10 != null && (inputStickerSet = MessageObject.getInputStickerSet(f10)) != null && !hashSet2.contains(Long.valueOf(inputStickerSet.id))) {
                                        hashSet2.add(Long.valueOf(inputStickerSet.id));
                                        arrayList3.add(inputStickerSet);
                                    }
                                }
                            }
                        }
                    }
                    CharSequence charSequence = o5Var.b.c.C0;
                    if ((charSequence instanceof Spanned) && (b6VarArr = (org.telegram.ui.Components.b6[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.b6.class)) != null) {
                        int i21 = 0;
                        while (i21 < b6VarArr.length) {
                            org.telegram.ui.Components.b6 b6Var = b6VarArr[i21];
                            TLRPC.Document document = b6Var.document;
                            if (document == null) {
                                num2 = num3;
                                document = org.telegram.ui.Components.s5.f(q5Var.C2, b6Var.documentId);
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
                for (int i22 = 0; i22 < o5Var.a.entities.size(); i22++) {
                    TLRPC.MessageEntity messageEntity = o5Var.a.entities.get(i22);
                    if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                        TLRPC.Document document2 = tL_messageEntityCustomEmoji.document;
                        if (document2 == null) {
                            document2 = org.telegram.ui.Components.s5.f(q5Var.C2, tL_messageEntityCustomEmoji.document_id);
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
            org.telegram.ui.ActionBar.j1 j1Var3 = new org.telegram.ui.ActionBar.j1(context, org.telegram.ui.ActionBar.g6.H8, c6Var);
            j1Var3.setTag(R.id.fit_width_tag, num);
            actionBarPopupWindow$ActionBarPopupWindowLayout6.a(j1Var3, w7.z5.n(-1, 8));
            TLRPC.MessageMedia messageMedia3 = o5Var.a.media;
            TLObject tLObject = messageMedia3.document;
            if (tLObject == null) {
                tLObject = messageMedia3.photo;
            }
            na naVar = new na(h5Var.i, q5Var.C2, tLObject, o5Var.a, z21, arrayList, h5Var.d);
            naVar.setOnClickListener(new u1(3, h5Var, naVar));
            naVar.setTag(R.id.fit_width_tag, num);
            actionBarPopupWindow$ActionBarPopupWindowLayout6.a(naVar, w7.z5.n(-1, -2));
        }
    }

    @Override // org.telegram.ui.Components.ks
    public final void c() {
        if (!this.c && !this.k[0]) {
            AndroidUtilities.runOnUIThread(new z4(this, 0));
        }
        q5 q5Var = this.l;
        q5Var.t1 = null;
        q5Var.s1 = null;
    }

    public final void d(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z10) {
        o5 o5Var;
        boolean z11 = this.f;
        q5 q5Var = this.l;
        if (!z11 || ((o5Var = q5Var.O1) != null && o5Var.b != null)) {
            q5Var.C3 = null;
            q5Var.D3 = null;
            return;
        }
        Context context = q5Var.getContext();
        vh0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
        final qf.b bVar = new qf.b(this, actionBarPopupWindow$ActionBarPopupWindowLayout, false, 7);
        es esVar = new es();
        org.telegram.ui.ActionBar.e1[] e1VarArr = new org.telegram.ui.ActionBar.e1[5];
        esVar.c = e1VarArr;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, context, null);
        esVar.a = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setFitItems(true);
        org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, null);
        c10.setOnClickListener(new zr(swipeBack, 1));
        c10.c(-328966, -328966);
        c10.setSelectorColor(268435455);
        View i5Var = new i5(context, 12);
        i5Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        i5Var.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(i5Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) i5Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(8.0f);
        i5Var.setLayoutParams(layoutParams);
        org.telegram.ui.ActionBar.a1 a1Var = new org.telegram.ui.ActionBar.a1(context, null);
        esVar.b = a1Var;
        a1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        a1Var.setDrawShadow(false);
        a1Var.setBackgroundColor(-14540254);
        a1Var.setTextColor(-1);
        a1Var.setOnValueChange(new org.telegram.ui.f5(bVar, 6));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(a1Var, w7.z5.n(-1, 44));
        View i5Var2 = new i5(context, 13);
        i5Var2.setMinimumWidth(AndroidUtilities.dp(196.0f));
        i5Var2.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(i5Var2);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) i5Var2.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams2.gravity = 5;
        }
        layoutParams2.width = -1;
        layoutParams2.height = AndroidUtilities.dp(8.0f);
        i5Var2.setLayoutParams(layoutParams2);
        org.telegram.ui.ActionBar.e1 c11 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_0_2, LocaleController.getString(R.string.SpeedVerySlow), false, null);
        c11.c(-328966, -328966);
        final int i10 = 0;
        c11.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ds
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        bVar.b0(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.b0(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.b0(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.b0(true, true, 1.5f);
                        break;
                    default:
                        bVar.b0(true, true, 2.0f);
                        break;
                }
            }
        });
        c11.setSelectorColor(268435455);
        e1VarArr[0] = c11;
        org.telegram.ui.ActionBar.e1 c12 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow), false, null);
        c12.c(-328966, -328966);
        final int i11 = 1;
        c12.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ds
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        bVar.b0(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.b0(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.b0(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.b0(true, true, 1.5f);
                        break;
                    default:
                        bVar.b0(true, true, 2.0f);
                        break;
                }
            }
        });
        c12.setSelectorColor(268435455);
        e1VarArr[1] = c12;
        org.telegram.ui.ActionBar.e1 c13 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal), false, null);
        c13.c(-328966, -328966);
        final int i12 = 2;
        c13.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ds
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        bVar.b0(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.b0(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.b0(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.b0(true, true, 1.5f);
                        break;
                    default:
                        bVar.b0(true, true, 2.0f);
                        break;
                }
            }
        });
        c13.setSelectorColor(268435455);
        e1VarArr[2] = c13;
        org.telegram.ui.ActionBar.e1 c14 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast), false, null);
        c14.c(-328966, -328966);
        final int i13 = 3;
        c14.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ds
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        bVar.b0(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.b0(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.b0(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.b0(true, true, 1.5f);
                        break;
                    default:
                        bVar.b0(true, true, 2.0f);
                        break;
                }
            }
        });
        c14.setSelectorColor(268435455);
        e1VarArr[3] = c14;
        org.telegram.ui.ActionBar.e1 c15 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedVeryFast), false, null);
        c15.c(-328966, -328966);
        final int i14 = 4;
        c15.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ds
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        bVar.b0(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.b0(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.b0(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.b0(true, true, 1.5f);
                        break;
                    default:
                        bVar.b0(true, true, 2.0f);
                        break;
                }
            }
        });
        c15.setSelectorColor(268435455);
        e1VarArr[4] = c15;
        q5Var.C3 = esVar;
        esVar.a(sb.B1, true);
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, q5Var.getContext(), this.d, false, false);
        q5Var.D3 = e1Var;
        e1Var.g(LocaleController.getString(R.string.Speed), R.drawable.msg_speed, null);
        q5.a0(q5Var, true);
        q5Var.D3.setMinimumWidth(AndroidUtilities.dp(196.0f));
        q5Var.D3.setRightIcon(R.drawable.msg_arrowright);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(q5Var.D3);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) q5Var.D3.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams3.gravity = 5;
        }
        layoutParams3.width = -1;
        layoutParams3.height = AndroidUtilities.dp(48.0f);
        q5Var.D3.setLayoutParams(layoutParams3);
        int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(q5Var.C3.a);
        org.telegram.ui.ActionBar.e1 e1Var2 = q5Var.D3;
        e1Var2.G = new a5(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 0);
        e1Var2.setOnClickListener(new v4(this, 11));
        actionBarPopupWindow$ActionBarPopupWindowLayout.c = true;
        if (z10) {
            org.telegram.ui.ActionBar.j1 j1Var = new org.telegram.ui.ActionBar.j1(q5Var.getContext(), org.telegram.ui.ActionBar.g6.H8, this.d);
            j1Var.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(j1Var, w7.z5.n(-1, 8));
        }
    }

    public final void e(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, TL_stories.StoryItem storyItem) {
        TLRPC.Chat chat;
        q5 q5Var = this.l;
        if (!q5Var.D1 || storyItem == null || (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) || (chat = MessagesController.getInstance(q5Var.C2).getChat(Long.valueOf(-q5Var.B1))) == null) {
            return;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(q5Var.C2).getChatFull(chat.id);
        if (chatFull == null) {
            chatFull = MessagesStorage.getInstance(q5Var.C2).loadChatInfo(chat.id, true, new CountDownLatch(1), false, false);
        }
        if (chatFull == null || !chatFull.can_view_stats) {
            return;
        }
        org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stats, LocaleController.getString(R.string.ViewStatistics), false, this.d).setOnClickListener(new b5(this, storyItem, this.e, chat, 0));
    }
}
