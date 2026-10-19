package ci;

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
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.ph0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.s41;
import org.telegram.ui.Components.xc;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.ir;
import org.telegram.ui.nr;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class h4 extends hs {
    public boolean c;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 d;
    public final /* synthetic */ aa e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Context i;
    public final /* synthetic */ n4 j;
    public final /* synthetic */ boolean[] k;
    public final /* synthetic */ q4 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(q4 q4Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.ActionBar.d6 d6Var2, aa aaVar, boolean z10, boolean z11, boolean z12, Context context2, n4 n4Var, boolean[] zArr) {
        super(context, d6Var, true);
        this.l = q4Var;
        this.d = d6Var2;
        this.e = aaVar;
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
    /* JADX WARN: Removed duplicated region for block: B:71:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03da  */
    /* JADX WARN: Type inference failed for: r4v90, types: [org.telegram.tgnet.TLRPC$User] */
    @Override // org.telegram.ui.Components.hs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        org.telegram.ui.ActionBar.d6 d6Var;
        final h4 h4Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        TL_stories.StoryItem storyItem;
        boolean z10;
        boolean z11;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3;
        aa aaVar;
        aa aaVar2;
        final aa aaVar3;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout5;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout6;
        h1 h1Var;
        TLRPC.GroupCall groupCall;
        h1 h1Var2;
        Integer num;
        ArrayList arrayList;
        ei.a8 a8Var;
        org.telegram.ui.Components.a6[] a6VarArr;
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
        aa aaVar4;
        final aa aaVar5;
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
        o4 o4Var = q4Var.O1;
        boolean z14 = this.g;
        Context context = this.i;
        aa aaVar6 = this.e;
        org.telegram.ui.ActionBar.d6 d6Var3 = this.d;
        if (z14 || o4Var.b != null) {
            d6Var = d6Var3;
            h4Var = this;
            TL_stories.StoryItem storyItem4 = o4Var.a;
            if (o4Var.b != null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_cancel, LocaleController.getString(R.string.Cancel), false, h4Var.d).setOnClickListener(new w3(h4Var, 6));
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            }
            if (storyItem4 == null) {
                return;
            }
            if (!(q4Var.C1 || q4Var.S1.h(q4Var.B1)) || o4Var.f || (storyItem = o4Var.a) == null) {
                z10 = true;
            } else {
                HashSet hashSet = storyItem.albums != null ? new HashSet(storyItem.albums) : new HashSet();
                i80 i80Var = new i80(actionBarPopupWindow$ActionBarPopupWindowLayout2, d6Var);
                i80Var.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new androidx.fragment.app.d(actionBarPopupWindow$ActionBarPopupWindowLayout2, 12), false);
                i80Var.k();
                w6 B = q4Var.getStoriesController().B(q4Var.B1, true);
                w6 B2 = q4Var.S1.B(q4Var.B1, false);
                i80.f(i80Var, B, hashSet, B2 != null && B2.a(), new a3.l0(h4Var, d6Var, storyItem, 20), new z2(h4Var, hashSet, storyItem, d6Var, 2));
                int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout2.b(i80Var.B);
                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, q4Var.getContext(), h4Var.d, false, false);
                q4Var.E3 = e1Var;
                e1Var.g(LocaleController.getString(R.string.StoriesAlbumAddToAlbum), R.drawable.menu_album_add, null);
                org.telegram.ui.ActionBar.e1 e1Var2 = q4Var.E3;
                e1Var2.G = new b4(actionBarPopupWindow$ActionBarPopupWindowLayout2, b10, 1);
                e1Var2.setOnClickListener(new w3(h4Var, 12));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(q4Var.E3);
                z10 = true;
                actionBarPopupWindow$ActionBarPopupWindowLayout2.c = true;
                org.telegram.ui.ActionBar.j1 j1Var = new org.telegram.ui.ActionBar.j1(q4Var.getContext(), org.telegram.ui.ActionBar.h6.H8, d6Var);
                j1Var.setTag(R.id.fit_width_tag, num3);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(j1Var, w7.z5.n(-1, 8));
            }
            if (q4Var.C1) {
                z11 = z10;
                ei.p9 p9Var = storyItem4.privacy.isEmpty() ? new ei.p9(3, q4Var.C2, new ArrayList()) : new ei.p9(q4Var.C2, storyItem4.privacy);
                actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, R.drawable.msg_view_file, LocaleController.getString(R.string.WhoCanSee), false, h4Var.d);
                c10.setSubtext(p9Var.toString());
                c10.setOnClickListener(new ai.v0(h4Var, p9Var, storyItem4, 4));
                c10.setItemHeight(56);
            } else {
                z11 = z10;
                actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            }
            h4Var.d(actionBarPopupWindow$ActionBarPopupWindowLayout3, false);
            if (q4Var.C1 || h4Var.f) {
                org.telegram.ui.ActionBar.j1 j1Var2 = new org.telegram.ui.ActionBar.j1(q4Var.getContext(), org.telegram.ui.ActionBar.h6.H8, d6Var);
                j1Var2.setTag(R.id.fit_width_tag, num3);
                actionBarPopupWindow$ActionBarPopupWindowLayout3.a(j1Var2, w7.z5.n(-1, 8));
            }
            if (q4Var.c3 || o4Var.f || !((q4Var.I0() || MessagesController.getInstance(q4Var.C2).storiesEnabled()) && h4Var.h)) {
                aaVar = aaVar6;
            } else {
                org.telegram.ui.ActionBar.e1 c11 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, R.drawable.msg_edit, LocaleController.getString(q4Var.I0() ? R.string.EditBotPreview : R.string.EditStory), false, h4Var.d);
                q4Var.s1 = c11;
                aaVar = aaVar6;
                c11.setOnClickListener(new e0(h4Var, h4Var.d, h4Var.i, aaVar6, h4Var.j, 2));
                if (q4Var.S1.K(q4Var.B1) && o4Var.e && !SharedConfig.allowPreparingHevcPlayers()) {
                    q4Var.s1.setAlpha(0.5f);
                }
            }
            TL_stories.StoryItem storyItem5 = o4Var.a;
            if (storyItem5 == null || !o4Var.e || o4Var.f || !(storyItem5.pinned || q4Var.J0())) {
                aaVar2 = aaVar;
            } else {
                aaVar2 = aaVar;
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_cover_stories, LocaleController.getString(R.string.StoryEditCoverMenu), false, h4Var.d).setOnClickListener(new e0(h4Var, h4Var.i, storyItem4, aaVar2, h4Var.j, 3));
            }
            if ((q4Var.C1 || (q4Var.D1 && MessagesController.getInstance(q4Var.C2).getStoriesController().h(storyItem4.dialogId))) && !o4Var.f) {
                boolean z15 = storyItem4.pinned;
                boolean z16 = !z15;
                aaVar3 = aaVar2;
                actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, !z15 ? R.drawable.msg_save_story : R.drawable.menu_unsave_story, q4Var.C1 ? LocaleController.getString(!z15 ? R.string.SaveToProfile : R.string.ArchiveStory) : LocaleController.getString(!z15 ? R.string.SaveToPosts : R.string.RemoveFromPosts), false, h4Var.d).setOnClickListener(new z3(h4Var, storyItem4, z16, d6Var, 0));
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                aaVar3 = aaVar2;
            }
            h4Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout4, storyItem4);
            if (q4Var.c3 || o4Var.f) {
                actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout5, R.drawable.msg_gallery, LocaleController.getString(o4Var.e ? R.string.SaveVideo : R.string.SaveImage), false, h4Var.d).setOnClickListener(new w3(h4Var, 7));
            }
            if (!MessagesController.getInstance(q4Var.C2).premiumFeaturesBlocked() && !o4Var.f && !q4Var.D1) {
                q4.b0(q4Var, actionBarPopupWindow$ActionBarPopupWindowLayout5);
            }
            if (q4Var.D1 && q4Var.U2) {
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout5, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), false, h4Var.d).setOnClickListener(new w3(h4Var, 8));
            }
            if (q4Var.U2) {
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_shareout, LocaleController.getString(R.string.BotShare), false, h4Var.d).setOnClickListener(new w3(h4Var, 9));
            }
            TL_stories.StoryItem storyItem6 = o4Var.a;
            if (storyItem6 != null) {
                TLRPC.MessageMedia messageMedia2 = storyItem6.media;
                if ((messageMedia2 instanceof TLRPC.TL_messageMediaVideoStream) && (h1Var2 = h1.W) != null && h1Var2.f(((TLRPC.TL_messageMediaVideoStream) messageMedia2).call)) {
                    h1 h1Var3 = h1.W;
                    boolean z17 = (h1Var3 == null || !h1Var3.o()) ? false : z11;
                    org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, z17 ? R.drawable.msg_voice_unmuted : R.drawable.msg_voice_muted, LocaleController.getString(z17 ? R.string.Unmute : R.string.Mute), false, h4Var.d).setOnClickListener(new h2(1, h4Var, z17));
                    org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_camera_retake, LocaleController.getString(R.string.AccDescrSwitchCamera), false, h4Var.d).setOnClickListener(new w3(h4Var, 10));
                }
            }
            if (o4Var.f) {
                final int i11 = 1;
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_video_pip, LocaleController.getString(R.string.PipMinimize), false, h4Var.d).setOnClickListener(new View.OnClickListener(h4Var) { // from class: ci.x3
                    public final /* synthetic */ h4 b;

                    {
                        this.b = h4Var;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                h4 h4Var2 = this.b.l.t1;
                                if (h4Var2 != null) {
                                    h4Var2.a();
                                }
                                aaVar3.N();
                                break;
                            default:
                                h4 h4Var3 = this.b.l.t1;
                                if (h4Var3 != null) {
                                    h4Var3.a();
                                }
                                aaVar3.N();
                                break;
                        }
                    }
                });
            }
            if (o4Var.f && (q4Var.B1 == UserConfig.getInstance(q4Var.C2).getClientUserId() || ChatObject.canManageCalls(MessagesController.getInstance(q4Var.C2).getChat(Long.valueOf(-q4Var.B1))) || ((h1Var = aaVar3.A0) != null && o4Var.k(h1Var.g()) && (groupCall = aaVar3.A0.v) != null && groupCall.creator))) {
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_settings_old, LocaleController.getString(R.string.LiveStorySettings), false, h4Var.d).setOnClickListener(new y3(h4Var, d6Var, aaVar3, 1));
            }
            if (o4Var.f) {
                org.telegram.ui.ActionBar.e1 c12 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_remove, LocaleController.getString(R.string.LiveStoryEnd), false, h4Var.d);
                int i12 = org.telegram.ui.ActionBar.h6.q7;
                c12.setSelectorColor(org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.w0(i12, d6Var)));
                c12.c(d6Var.w(i12), d6Var.w(i12));
                c12.setOnClickListener(new y3(h4Var, d6Var, aaVar3, 2));
            }
            if (!o4Var.f) {
                if (!q4Var.C1) {
                    i7 storiesController = MessagesController.getInstance(q4Var.C2).getStoriesController();
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
                org.telegram.ui.ActionBar.e1 c13 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout6, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), false, h4Var.d);
                int i14 = org.telegram.ui.ActionBar.h6.q7;
                c13.setSelectorColor(org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.w0(i14, d6Var)));
                c13.c(d6Var.w(i14), d6Var.w(i14));
                c13.setOnClickListener(new w3(h4Var, 13));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        } else {
            d(actionBarPopupWindow$ActionBarPopupWindowLayout, true);
            final String sharedPrefKey = NotificationsController.getSharedPrefKey(q4Var.B1, 0L);
            boolean c02 = NotificationsCustomSettingsActivity.c0(q4Var.C2, q4Var.B1);
            if (q4Var.B1 > 0) {
                ?? user4 = MessagesController.getInstance(q4Var.C2).getUser(Long.valueOf(q4Var.B1));
                chat2 = user4;
                chat = null;
                user = user4;
            } else {
                chat = MessagesController.getInstance(q4Var.C2).getChat(Long.valueOf(-q4Var.B1));
                chat2 = chat;
                user = null;
            }
            String trim = user == null ? chat == null ? "" : chat.title : UserObject.getFirstName(user).trim();
            int indexOf = trim.indexOf(" ");
            if (indexOf > 0) {
                trim = trim.substring(0, indexOf);
            }
            final String str = trim;
            if (UserObject.isService(q4Var.B1) || q4Var.I0()) {
                h4Var = this;
                d6Var2 = d6Var3;
                aaVar4 = aaVar6;
            } else {
                if (c02) {
                    user2 = user;
                    aaVar4 = aaVar6;
                    chat3 = chat;
                    d6Var2 = d6Var3;
                    org.telegram.ui.ActionBar.e1 c14 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), false, this.d);
                    final int i15 = 0;
                    final org.telegram.ui.ActionBar.d6 d6Var4 = this.d;
                    final TLRPC.Chat chat5 = chat2;
                    h4Var = this;
                    c14.setOnClickListener(new View.OnClickListener(this) { // from class: ci.f4
                        public final /* synthetic */ h4 b;

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
                            h4 h4Var2 = this.b;
                            switch (i16) {
                                case 0:
                                    q4 q4Var2 = h4Var2.l;
                                    MessagesController.getNotificationsSettings(q4Var2.C2).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str3, false).apply();
                                    NotificationsController.getInstance(q4Var2.C2).updateServerNotificationsSettings(q4Var2.B1, 0L);
                                    qc V = new xc(q4Var2.c1, d6Var5).V(Arrays.asList(tLObject), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, str2)), null, null);
                                    V.a = 2;
                                    V.j();
                                    h4 h4Var3 = q4Var2.t1;
                                    if (h4Var3 != null) {
                                        h4Var3.a();
                                        break;
                                    }
                                    break;
                                default:
                                    q4 q4Var3 = h4Var2.l;
                                    MessagesController.getNotificationsSettings(q4Var3.C2).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str3, true).apply();
                                    NotificationsController.getInstance(q4Var3.C2).updateServerNotificationsSettings(q4Var3.B1, 0L);
                                    qc V2 = new xc(q4Var3.c1, d6Var5).V(Arrays.asList(tLObject), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, str2)), null, null);
                                    V2.a = 2;
                                    V2.j();
                                    h4 h4Var4 = q4Var3.t1;
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
                    d6Var2 = d6Var3;
                    aaVar4 = aaVar6;
                    final TLRPC.Chat chat6 = chat2;
                    org.telegram.ui.ActionBar.e1 c15 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), false, h4Var.d);
                    final int i16 = 1;
                    final org.telegram.ui.ActionBar.d6 d6Var5 = h4Var.d;
                    c15.setOnClickListener(new View.OnClickListener(h4Var) { // from class: ci.f4
                        public final /* synthetic */ h4 b;

                        {
                            this.b = h4Var;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i162 = i16;
                            String str2 = str;
                            TLObject tLObject = chat6;
                            org.telegram.ui.ActionBar.d6 d6Var52 = d6Var5;
                            String str3 = sharedPrefKey;
                            h4 h4Var2 = this.b;
                            switch (i162) {
                                case 0:
                                    q4 q4Var2 = h4Var2.l;
                                    MessagesController.getNotificationsSettings(q4Var2.C2).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str3, false).apply();
                                    NotificationsController.getInstance(q4Var2.C2).updateServerNotificationsSettings(q4Var2.B1, 0L);
                                    qc V = new xc(q4Var2.c1, d6Var52).V(Arrays.asList(tLObject), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, str2)), null, null);
                                    V.a = 2;
                                    V.j();
                                    h4 h4Var3 = q4Var2.t1;
                                    if (h4Var3 != null) {
                                        h4Var3.a();
                                        break;
                                    }
                                    break;
                                default:
                                    q4 q4Var3 = h4Var2.l;
                                    MessagesController.getNotificationsSettings(q4Var3.C2).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str3, true).apply();
                                    NotificationsController.getInstance(q4Var3.C2).updateServerNotificationsSettings(q4Var3.B1, 0L);
                                    qc V2 = new xc(q4Var3.c1, d6Var52).V(Arrays.asList(tLObject), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, str2)), null, null);
                                    V2.a = 2;
                                    V2.j();
                                    h4 h4Var4 = q4Var3.t1;
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
                MediaDataController.getInstance(q4Var.C2).loadHints(true);
                boolean z19 = (user2 == null || user2.contact || !MediaDataController.getInstance(q4Var.C2).containsTopPeer(q4Var.B1)) ? false : true;
                if (q4Var.B1 > 0) {
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
                    org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), false, h4Var.d).setOnClickListener(new w3(h4Var, 14));
                } else if (z12) {
                    if (z13) {
                        org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), false, h4Var.d).setOnClickListener(new w3(h4Var, 0));
                    } else {
                        org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), false, h4Var.d).setOnClickListener(new w3(h4Var, 15));
                    }
                }
            }
            if (o4Var.f) {
                final int i17 = 0;
                aaVar5 = aaVar4;
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_video_pip, LocaleController.getString(R.string.PipMinimize), false, h4Var.d).setOnClickListener(new View.OnClickListener(h4Var) { // from class: ci.x3
                    public final /* synthetic */ h4 b;

                    {
                        this.b = h4Var;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i17) {
                            case 0:
                                h4 h4Var2 = this.b.l.t1;
                                if (h4Var2 != null) {
                                    h4Var2.a();
                                }
                                aaVar5.N();
                                break;
                            default:
                                h4 h4Var3 = this.b.l.t1;
                                if (h4Var3 != null) {
                                    h4Var3.a();
                                }
                                aaVar5.N();
                                break;
                        }
                    }
                });
            } else {
                aaVar5 = aaVar4;
            }
            if (!MessagesController.getInstance(q4Var.C2).premiumFeaturesBlocked() && o4Var.e) {
                boolean z20 = MessagesController.getInstance(q4Var.C2).storyQualityFull;
                if (UserConfig.getInstance(q4Var.C2).isPremium()) {
                    org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, z20 ? R.drawable.menu_quality_sd : R.drawable.menu_quality_hd, LocaleController.getString(z20 ? R.string.StoryQualityDecrease : R.string.StoryQualityIncrease), false, q4Var.B0).setOnClickListener(new h2(0, q4Var, z20));
                } else {
                    Drawable drawable = q4Var.getContext().getDrawable(R.drawable.msg_gallery_locked2);
                    i10 = -1;
                    drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                    p2 p2Var = new p2(q4Var.getContext().getDrawable(R.drawable.menu_quality_hd2), drawable, 1);
                    int dp = AndroidUtilities.dp(24.0f);
                    int dp2 = AndroidUtilities.dp(24.0f);
                    p2Var.e = dp;
                    p2Var.f = dp2;
                    int dp3 = AndroidUtilities.dp(1.0f);
                    int i18 = -AndroidUtilities.dp(2.0f);
                    p2Var.s = dp3;
                    p2Var.v = i18;
                    org.telegram.ui.ActionBar.e1 c16 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_quality_hd, LocaleController.getString(R.string.StoryQualityIncrease), false, q4Var.B0);
                    c16.setOnClickListener(new f2(q4Var, 7));
                    c16.setIcon(p2Var);
                    if (!q4Var.c3 && q4Var.S2 && !o4Var.f) {
                        if (!UserConfig.getInstance(q4Var.C2).isPremium()) {
                            org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_gallery, LocaleController.getString(R.string.SaveToGallery), false, h4Var.d).setOnClickListener(new w3(h4Var, 1));
                        } else if (!MessagesController.getInstance(q4Var.C2).premiumFeaturesBlocked()) {
                            Drawable drawable2 = context.getDrawable(R.drawable.msg_gallery_locked2);
                            drawable2.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, i10, -16777216), PorterDuff.Mode.MULTIPLY));
                            p2 p2Var2 = new p2(context.getDrawable(R.drawable.msg_gallery_locked1), drawable2, 2);
                            actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            org.telegram.ui.ActionBar.e1 c17 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_gallery, LocaleController.getString(R.string.SaveToGallery), false, h4Var.d);
                            c17.setIcon(p2Var2);
                            c17.setOnClickListener(new ai.v0(h4Var, c17, aaVar5, 5));
                            if (!MessagesController.getInstance(q4Var.C2).premiumFeaturesBlocked() && !q4Var.D1) {
                                q4.b0(q4Var, actionBarPopupWindow$ActionBarPopupWindowLayout7);
                            }
                            if (q4Var.U2) {
                                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), false, h4Var.d).setOnClickListener(new w3(h4Var, 2));
                            }
                            if (q4Var.U2) {
                                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_shareout, LocaleController.getString(R.string.BotShare), false, h4Var.d).setOnClickListener(new w3(h4Var, 3));
                            }
                            storyItem3 = o4Var.a;
                            if (storyItem3 != null) {
                                if (storyItem3.translated && TextUtils.equals(storyItem3.translatedLng, s41.C())) {
                                    org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_translate, LocaleController.getString(R.string.HideTranslation), false, h4Var.d).setOnClickListener(new w3(h4Var, 4));
                                } else if (MessagesController.getInstance(q4Var.C2).getTranslateController().canTranslateStory(o4Var.a)) {
                                    actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                    org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout8, R.drawable.msg_translate, LocaleController.getString(R.string.TranslateMessage), false, h4Var.d).setOnClickListener(new w3(h4Var, 5));
                                    h4Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout8, o4Var.a);
                                    if (!q4Var.c3 || UserObject.isService(q4Var.B1) || q4Var.I0()) {
                                        actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                        d6Var = d6Var2;
                                    } else {
                                        d6Var = d6Var2;
                                        org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout8, R.drawable.msg_report, LocaleController.getString(R.string.ReportChat), false, h4Var.d).setOnClickListener(new y3(h4Var, aaVar5, d6Var));
                                        actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                    }
                                    z11 = true;
                                }
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            h4Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout8, o4Var.a);
                            if (q4Var.c3) {
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            d6Var = d6Var2;
                            z11 = true;
                        }
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    if (!MessagesController.getInstance(q4Var.C2).premiumFeaturesBlocked()) {
                        q4.b0(q4Var, actionBarPopupWindow$ActionBarPopupWindowLayout7);
                    }
                    if (q4Var.U2) {
                    }
                    if (q4Var.U2) {
                    }
                    storyItem3 = o4Var.a;
                    if (storyItem3 != null) {
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    h4Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout8, o4Var.a);
                    if (q4Var.c3) {
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    d6Var = d6Var2;
                    z11 = true;
                }
            }
            i10 = -1;
            if (!q4Var.c3) {
                if (!UserConfig.getInstance(q4Var.C2).isPremium()) {
                }
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            if (!MessagesController.getInstance(q4Var.C2).premiumFeaturesBlocked()) {
            }
            if (q4Var.U2) {
            }
            if (q4Var.U2) {
            }
            storyItem3 = o4Var.a;
            if (storyItem3 != null) {
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            h4Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout8, o4Var.a);
            if (q4Var.c3) {
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            d6Var = d6Var2;
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
                            TLRPC.Document f7 = org.telegram.ui.Components.r5.f(q4Var.C2, ((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
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
                h7 h7Var = o4Var.b;
                if (h7Var != null && (a8Var = h7Var.c) != null) {
                    if (a8Var.T0 != null) {
                        for (int i20 = 0; i20 < o4Var.b.c.T0.size(); i20++) {
                            VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) o4Var.b.c.T0.get(i20);
                            if (mediaEntity.type == 4 && (mediaArea = mediaEntity.mediaArea) != null) {
                                TLRPC.Reaction reaction2 = mediaArea.reaction;
                                if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                    TLRPC.Document f10 = org.telegram.ui.Components.r5.f(q4Var.C2, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id);
                                    if (f10 != null && (inputStickerSet = MessageObject.getInputStickerSet(f10)) != null && !hashSet2.contains(Long.valueOf(inputStickerSet.id))) {
                                        hashSet2.add(Long.valueOf(inputStickerSet.id));
                                        arrayList3.add(inputStickerSet);
                                    }
                                }
                            }
                        }
                    }
                    CharSequence charSequence = o4Var.b.c.C0;
                    if ((charSequence instanceof Spanned) && (a6VarArr = (org.telegram.ui.Components.a6[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.a6.class)) != null) {
                        int i21 = 0;
                        while (i21 < a6VarArr.length) {
                            org.telegram.ui.Components.a6 a6Var = a6VarArr[i21];
                            TLRPC.Document document = a6Var.document;
                            if (document == null) {
                                num2 = num3;
                                document = org.telegram.ui.Components.r5.f(q4Var.C2, a6Var.documentId);
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
                            document2 = org.telegram.ui.Components.r5.f(q4Var.C2, tL_messageEntityCustomEmoji.document_id);
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
            org.telegram.ui.ActionBar.j1 j1Var3 = new org.telegram.ui.ActionBar.j1(context, org.telegram.ui.ActionBar.h6.H8, d6Var);
            j1Var3.setTag(R.id.fit_width_tag, num);
            actionBarPopupWindow$ActionBarPopupWindowLayout6.a(j1Var3, w7.z5.n(-1, 8));
            TLRPC.MessageMedia messageMedia3 = o4Var.a.media;
            TLObject tLObject = messageMedia3.document;
            if (tLObject == null) {
                tLObject = messageMedia3.photo;
            }
            v8 v8Var = new v8(h4Var.i, q4Var.C2, tLObject, o4Var.a, z21, arrayList, h4Var.d);
            v8Var.setOnClickListener(new ai.p(13, h4Var, v8Var));
            v8Var.setTag(R.id.fit_width_tag, num);
            actionBarPopupWindow$ActionBarPopupWindowLayout6.a(v8Var, w7.z5.n(-1, -2));
        }
    }

    @Override // org.telegram.ui.Components.hs
    public final void c() {
        if (!this.c && !this.k[0]) {
            AndroidUtilities.runOnUIThread(new a4(this, 0));
        }
        q4 q4Var = this.l;
        q4Var.t1 = null;
        q4Var.s1 = null;
    }

    public final void d(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z10) {
        o4 o4Var;
        boolean z11 = this.f;
        q4 q4Var = this.l;
        if (!z11 || ((o4Var = q4Var.O1) != null && o4Var.b != null)) {
            q4Var.C3 = null;
            q4Var.D3 = null;
            return;
        }
        Context context = q4Var.getContext();
        ph0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
        final n4.s sVar = new n4.s(this, actionBarPopupWindow$ActionBarPopupWindowLayout, false, 12);
        nr nrVar = new nr();
        org.telegram.ui.ActionBar.e1[] e1VarArr = new org.telegram.ui.ActionBar.e1[5];
        nrVar.c = e1VarArr;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, context, null);
        nrVar.a = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setFitItems(true);
        org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, null);
        c10.setOnClickListener(new ir(swipeBack, 1));
        c10.c(-328966, -328966);
        c10.setSelectorColor(268435455);
        View i4Var = new i4(context, 12);
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
        org.telegram.ui.ActionBar.a1 a1Var = new org.telegram.ui.ActionBar.a1(context, null);
        nrVar.b = a1Var;
        a1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        a1Var.setDrawShadow(false);
        a1Var.setBackgroundColor(-14540254);
        a1Var.setTextColor(-1);
        a1Var.setOnValueChange(new org.telegram.ui.g5(sVar, 6));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(a1Var, w7.z5.n(-1, 44));
        View i4Var2 = new i4(context, 13);
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
        org.telegram.ui.ActionBar.e1 c11 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_0_2, LocaleController.getString(R.string.SpeedVerySlow), false, null);
        c11.c(-328966, -328966);
        final int i10 = 0;
        c11.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.mr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        sVar.B(true, true, 0.2f);
                        break;
                    case 1:
                        sVar.B(true, true, 0.5f);
                        break;
                    case 2:
                        sVar.B(true, true, 1.0f);
                        break;
                    case 3:
                        sVar.B(true, true, 1.5f);
                        break;
                    default:
                        sVar.B(true, true, 2.0f);
                        break;
                }
            }
        });
        c11.setSelectorColor(268435455);
        e1VarArr[0] = c11;
        org.telegram.ui.ActionBar.e1 c12 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow), false, null);
        c12.c(-328966, -328966);
        final int i11 = 1;
        c12.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.mr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        sVar.B(true, true, 0.2f);
                        break;
                    case 1:
                        sVar.B(true, true, 0.5f);
                        break;
                    case 2:
                        sVar.B(true, true, 1.0f);
                        break;
                    case 3:
                        sVar.B(true, true, 1.5f);
                        break;
                    default:
                        sVar.B(true, true, 2.0f);
                        break;
                }
            }
        });
        c12.setSelectorColor(268435455);
        e1VarArr[1] = c12;
        org.telegram.ui.ActionBar.e1 c13 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal), false, null);
        c13.c(-328966, -328966);
        final int i12 = 2;
        c13.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.mr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        sVar.B(true, true, 0.2f);
                        break;
                    case 1:
                        sVar.B(true, true, 0.5f);
                        break;
                    case 2:
                        sVar.B(true, true, 1.0f);
                        break;
                    case 3:
                        sVar.B(true, true, 1.5f);
                        break;
                    default:
                        sVar.B(true, true, 2.0f);
                        break;
                }
            }
        });
        c13.setSelectorColor(268435455);
        e1VarArr[2] = c13;
        org.telegram.ui.ActionBar.e1 c14 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast), false, null);
        c14.c(-328966, -328966);
        final int i13 = 3;
        c14.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.mr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        sVar.B(true, true, 0.2f);
                        break;
                    case 1:
                        sVar.B(true, true, 0.5f);
                        break;
                    case 2:
                        sVar.B(true, true, 1.0f);
                        break;
                    case 3:
                        sVar.B(true, true, 1.5f);
                        break;
                    default:
                        sVar.B(true, true, 2.0f);
                        break;
                }
            }
        });
        c14.setSelectorColor(268435455);
        e1VarArr[3] = c14;
        org.telegram.ui.ActionBar.e1 c15 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedVeryFast), false, null);
        c15.c(-328966, -328966);
        final int i14 = 4;
        c15.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.mr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        sVar.B(true, true, 0.2f);
                        break;
                    case 1:
                        sVar.B(true, true, 0.5f);
                        break;
                    case 2:
                        sVar.B(true, true, 1.0f);
                        break;
                    case 3:
                        sVar.B(true, true, 1.5f);
                        break;
                    default:
                        sVar.B(true, true, 2.0f);
                        break;
                }
            }
        });
        c15.setSelectorColor(268435455);
        e1VarArr[4] = c15;
        q4Var.C3 = nrVar;
        nrVar.a(aa.B1, true);
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, q4Var.getContext(), this.d, false, false);
        q4Var.D3 = e1Var;
        e1Var.g(LocaleController.getString(R.string.Speed), R.drawable.msg_speed, null);
        q4.a0(q4Var, true);
        q4Var.D3.setMinimumWidth(AndroidUtilities.dp(196.0f));
        q4Var.D3.setRightIcon(R.drawable.msg_arrowright);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(q4Var.D3);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) q4Var.D3.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams3.gravity = 5;
        }
        layoutParams3.width = -1;
        layoutParams3.height = AndroidUtilities.dp(48.0f);
        q4Var.D3.setLayoutParams(layoutParams3);
        int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(q4Var.C3.a);
        org.telegram.ui.ActionBar.e1 e1Var2 = q4Var.D3;
        e1Var2.G = new b4(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 0);
        e1Var2.setOnClickListener(new w3(this, 11));
        actionBarPopupWindow$ActionBarPopupWindowLayout.c = true;
        if (z10) {
            org.telegram.ui.ActionBar.j1 j1Var = new org.telegram.ui.ActionBar.j1(q4Var.getContext(), org.telegram.ui.ActionBar.h6.H8, this.d);
            j1Var.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(j1Var, w7.z5.n(-1, 8));
        }
    }

    public final void e(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, TL_stories.StoryItem storyItem) {
        TLRPC.Chat chat;
        q4 q4Var = this.l;
        if (!q4Var.D1 || storyItem == null || (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) || (chat = MessagesController.getInstance(q4Var.C2).getChat(Long.valueOf(-q4Var.B1))) == null) {
            return;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(q4Var.C2).getChatFull(chat.id);
        if (chatFull == null) {
            chatFull = MessagesStorage.getInstance(q4Var.C2).loadChatInfo(chat.id, true, new CountDownLatch(1), false, false);
        }
        if (chatFull == null || !chatFull.can_view_stats) {
            return;
        }
        org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stats, LocaleController.getString(R.string.ViewStatistics), false, this.d).setOnClickListener(new c4(this, storyItem, this.e, chat, 0));
    }
}
