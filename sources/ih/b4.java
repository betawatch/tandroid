package ih;

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
import org.telegram.ui.Components.fg0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.z21;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.kr;
import org.telegram.ui.pr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class b4 extends nr {
    public boolean c;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 d;
    public final /* synthetic */ m9 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Context i;
    public final /* synthetic */ f4 j;
    public final /* synthetic */ boolean[] k;
    public final /* synthetic */ i4 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(i4 i4Var, Context context, org.telegram.ui.ActionBar.b6 b6Var, org.telegram.ui.ActionBar.b6 b6Var2, m9 m9Var, boolean z10, boolean z11, boolean z12, Context context2, f4 f4Var, boolean[] zArr) {
        super(context, b6Var, true);
        this.l = i4Var;
        this.d = b6Var2;
        this.e = m9Var;
        this.f = z10;
        this.g = z11;
        this.h = z12;
        this.i = context2;
        this.j = f4Var;
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
    /* JADX WARN: Removed duplicated region for block: B:71:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03db  */
    /* JADX WARN: Type inference failed for: r4v92, types: [org.telegram.tgnet.TLRPC$User] */
    @Override // org.telegram.ui.Components.nr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        org.telegram.ui.ActionBar.b6 b6Var;
        final b4 b4Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        TL_stories.StoryItem storyItem;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3;
        m9 m9Var;
        m9 m9Var2;
        final m9 m9Var3;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout5;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout6;
        f1 f1Var;
        TLRPC.GroupCall groupCall;
        f1 f1Var2;
        Integer num;
        ArrayList arrayList;
        kh.a8 a8Var;
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
        org.telegram.ui.ActionBar.b6 b6Var2;
        m9 m9Var4;
        final m9 m9Var5;
        int i9;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout7;
        TL_stories.StoryItem storyItem3;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout8;
        TLRPC.User user2;
        TLRPC.Chat chat3;
        boolean z10;
        boolean z11;
        Integer num3 = 1;
        i4 i4Var = this.l;
        g4 g4Var = i4Var.K1;
        boolean z12 = this.g;
        Context context = this.i;
        m9 m9Var6 = this.e;
        org.telegram.ui.ActionBar.b6 b6Var3 = this.d;
        if (z12 || g4Var.b != null) {
            b6Var = b6Var3;
            b4Var = this;
            TL_stories.StoryItem storyItem4 = g4Var.a;
            if (g4Var.b != null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_cancel, LocaleController.getString(R.string.Cancel), false, b4Var.d).setOnClickListener(new q3(b4Var, 6));
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            }
            if (storyItem4 == null) {
                return;
            }
            if ((i4Var.y1 || i4Var.O1.h(i4Var.x1)) && !g4Var.f && (storyItem = g4Var.a) != null) {
                HashSet hashSet = storyItem.albums != null ? new HashSet(storyItem.albums) : new HashSet();
                x60 x60Var = new x60(actionBarPopupWindow$ActionBarPopupWindowLayout2, b6Var);
                x60Var.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new g(actionBarPopupWindow$ActionBarPopupWindowLayout2, 6), false);
                x60Var.k();
                j6 B = i4Var.getStoriesController().B(i4Var.x1, true);
                j6 B2 = i4Var.O1.B(i4Var.x1, false);
                x60.f(x60Var, B, hashSet, B2 != null && B2.a(), new h3(b4Var, b6Var, storyItem, 1), new bg.j1(b4Var, hashSet, storyItem, b6Var, 4));
                int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout2.b(x60Var.B);
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, i4Var.getContext(), b4Var.d, false, false);
                i4Var.A3 = g1Var;
                g1Var.g(LocaleController.getString(R.string.StoriesAlbumAddToAlbum), R.drawable.menu_album_add, null);
                org.telegram.ui.ActionBar.g1 g1Var2 = i4Var.A3;
                g1Var2.C = new w3(actionBarPopupWindow$ActionBarPopupWindowLayout2, b10, 1);
                g1Var2.setOnClickListener(new q3(b4Var, 12));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(i4Var.A3);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.c = true;
                org.telegram.ui.ActionBar.l1 l1Var = new org.telegram.ui.ActionBar.l1(i4Var.getContext(), org.telegram.ui.ActionBar.f6.H8, b6Var);
                l1Var.setTag(R.id.fit_width_tag, num3);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(l1Var, g7.e6.n(-1, 8));
            }
            if (i4Var.y1) {
                kh.r9 r9Var = storyItem4.privacy.isEmpty() ? new kh.r9(3, i4Var.y2, new ArrayList()) : new kh.r9(i4Var.y2, storyItem4.privacy);
                actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, R.drawable.msg_view_file, LocaleController.getString(R.string.WhoCanSee), false, b4Var.d);
                c10.setSubtext(r9Var.toString());
                c10.setOnClickListener(new fg.f(b4Var, r9Var, storyItem4, 10));
                c10.setItemHeight(56);
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            }
            b4Var.d(actionBarPopupWindow$ActionBarPopupWindowLayout3, false);
            if (i4Var.y1 || b4Var.f) {
                org.telegram.ui.ActionBar.l1 l1Var2 = new org.telegram.ui.ActionBar.l1(i4Var.getContext(), org.telegram.ui.ActionBar.f6.H8, b6Var);
                l1Var2.setTag(R.id.fit_width_tag, num3);
                actionBarPopupWindow$ActionBarPopupWindowLayout3.a(l1Var2, g7.e6.n(-1, 8));
            }
            if (i4Var.Y2 || g4Var.f || !((i4Var.I0() || MessagesController.getInstance(i4Var.y2).storiesEnabled()) && b4Var.h)) {
                m9Var = m9Var6;
            } else {
                org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, R.drawable.msg_edit, LocaleController.getString(i4Var.I0() ? R.string.EditBotPreview : R.string.EditStory), false, b4Var.d);
                i4Var.o1 = c11;
                m9Var = m9Var6;
                c11.setOnClickListener(new d0(b4Var, b4Var.d, b4Var.i, m9Var6, b4Var.j, 2));
                if (i4Var.O1.K(i4Var.x1) && g4Var.e && !SharedConfig.allowPreparingHevcPlayers()) {
                    i4Var.o1.setAlpha(0.5f);
                }
            }
            TL_stories.StoryItem storyItem5 = g4Var.a;
            if (storyItem5 == null || !g4Var.e || g4Var.f || !(storyItem5.pinned || i4Var.J0())) {
                m9Var2 = m9Var;
            } else {
                m9Var2 = m9Var;
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_cover_stories, LocaleController.getString(R.string.StoryEditCoverMenu), false, b4Var.d).setOnClickListener(new d0(b4Var, b4Var.i, storyItem4, m9Var2, b4Var.j, 3));
            }
            if ((i4Var.y1 || (i4Var.z1 && MessagesController.getInstance(i4Var.y2).getStoriesController().h(storyItem4.dialogId))) && !g4Var.f) {
                boolean z13 = storyItem4.pinned;
                boolean z14 = !z13;
                m9Var3 = m9Var2;
                actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, !z13 ? R.drawable.msg_save_story : R.drawable.menu_unsave_story, i4Var.y1 ? LocaleController.getString(!z13 ? R.string.SaveToProfile : R.string.ArchiveStory) : LocaleController.getString(!z13 ? R.string.SaveToPosts : R.string.RemoveFromPosts), false, b4Var.d).setOnClickListener(new t3(b4Var, storyItem4, z14, b6Var, 0));
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                m9Var3 = m9Var2;
            }
            b4Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout4, storyItem4);
            if (i4Var.Y2 || g4Var.f) {
                actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout5, R.drawable.msg_gallery, LocaleController.getString(g4Var.e ? R.string.SaveVideo : R.string.SaveImage), false, b4Var.d).setOnClickListener(new q3(b4Var, 7));
            }
            if (!MessagesController.getInstance(i4Var.y2).premiumFeaturesBlocked() && !g4Var.f && !i4Var.z1) {
                i4.b0(i4Var, actionBarPopupWindow$ActionBarPopupWindowLayout5);
            }
            if (i4Var.z1 && i4Var.Q2) {
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout5, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), false, b4Var.d).setOnClickListener(new q3(b4Var, 8));
            }
            if (i4Var.Q2) {
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_shareout, LocaleController.getString(R.string.BotShare), false, b4Var.d).setOnClickListener(new q3(b4Var, 9));
            }
            TL_stories.StoryItem storyItem6 = g4Var.a;
            if (storyItem6 != null) {
                TLRPC.MessageMedia messageMedia2 = storyItem6.media;
                if ((messageMedia2 instanceof TLRPC.TL_messageMediaVideoStream) && (f1Var2 = f1.S) != null && f1Var2.f(((TLRPC.TL_messageMediaVideoStream) messageMedia2).call)) {
                    f1 f1Var3 = f1.S;
                    boolean z15 = f1Var3 != null && f1Var3.o();
                    org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, z15 ? R.drawable.msg_voice_unmuted : R.drawable.msg_voice_muted, LocaleController.getString(z15 ? R.string.Unmute : R.string.Mute), false, b4Var.d).setOnClickListener(new b2(1, b4Var, z15));
                    org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_camera_retake, LocaleController.getString(R.string.AccDescrSwitchCamera), false, b4Var.d).setOnClickListener(new q3(b4Var, 10));
                }
            }
            if (g4Var.f) {
                final int i10 = 1;
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_video_pip, LocaleController.getString(R.string.PipMinimize), false, b4Var.d).setOnClickListener(new View.OnClickListener(b4Var) { // from class: ih.r3
                    public final /* synthetic */ b4 b;

                    {
                        this.b = b4Var;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                b4 b4Var2 = this.b.l.p1;
                                if (b4Var2 != null) {
                                    b4Var2.a();
                                }
                                m9Var3.N();
                                break;
                            default:
                                b4 b4Var3 = this.b.l.p1;
                                if (b4Var3 != null) {
                                    b4Var3.a();
                                }
                                m9Var3.N();
                                break;
                        }
                    }
                });
            }
            if (g4Var.f && (i4Var.x1 == UserConfig.getInstance(i4Var.y2).getClientUserId() || ChatObject.canManageCalls(MessagesController.getInstance(i4Var.y2).getChat(Long.valueOf(-i4Var.x1))) || ((f1Var = m9Var3.w0) != null && g4Var.k(f1Var.g()) && (groupCall = m9Var3.w0.v) != null && groupCall.creator))) {
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_settings_old, LocaleController.getString(R.string.LiveStorySettings), false, b4Var.d).setOnClickListener(new s3(b4Var, b6Var, m9Var3, 1));
            }
            if (g4Var.f) {
                org.telegram.ui.ActionBar.g1 c12 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_remove, LocaleController.getString(R.string.LiveStoryEnd), false, b4Var.d);
                int i11 = org.telegram.ui.ActionBar.f6.q7;
                c12.setSelectorColor(org.telegram.ui.ActionBar.f6.l1(0.12f, org.telegram.ui.ActionBar.f6.v0(i11, b6Var)));
                c12.c(b6Var.N0(i11), b6Var.N0(i11));
                c12.setOnClickListener(new s3(b4Var, b6Var, m9Var3, 2));
            }
            if (!g4Var.f) {
                if (!i4Var.y1) {
                    v6 storiesController = MessagesController.getInstance(i4Var.y2).getStoriesController();
                    TL_stories.StoryItem storyItem7 = g4Var.a;
                    int i12 = storiesController.a;
                    if (storyItem7 != null) {
                        if (storyItem7.dialogId != UserConfig.getInstance(i12).getClientUserId()) {
                            if (storyItem7.dialogId > 0) {
                                TLRPC.User user3 = MessagesController.getInstance(i12).getUser(Long.valueOf(storyItem7.dialogId));
                                if (user3 != null) {
                                    if (user3.bot) {
                                    }
                                }
                            }
                            if (storyItem7.dialogId < 0) {
                                TLRPC.Chat chat4 = MessagesController.getInstance(i12).getChat(Long.valueOf(-storyItem7.dialogId));
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
                org.telegram.ui.ActionBar.g1 c13 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout6, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), false, b4Var.d);
                int i13 = org.telegram.ui.ActionBar.f6.q7;
                c13.setSelectorColor(org.telegram.ui.ActionBar.f6.l1(0.12f, org.telegram.ui.ActionBar.f6.v0(i13, b6Var)));
                c13.c(b6Var.N0(i13), b6Var.N0(i13));
                c13.setOnClickListener(new q3(b4Var, 13));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        } else {
            d(actionBarPopupWindow$ActionBarPopupWindowLayout, true);
            final String sharedPrefKey = NotificationsController.getSharedPrefKey(i4Var.x1, 0L);
            boolean b02 = NotificationsCustomSettingsActivity.b0(i4Var.y2, i4Var.x1);
            if (i4Var.x1 > 0) {
                ?? user4 = MessagesController.getInstance(i4Var.y2).getUser(Long.valueOf(i4Var.x1));
                chat2 = user4;
                chat = null;
                user = user4;
            } else {
                chat = MessagesController.getInstance(i4Var.y2).getChat(Long.valueOf(-i4Var.x1));
                chat2 = chat;
                user = null;
            }
            String trim = user == null ? chat == null ? "" : chat.title : UserObject.getFirstName(user).trim();
            int indexOf = trim.indexOf(" ");
            if (indexOf > 0) {
                trim = trim.substring(0, indexOf);
            }
            final String str = trim;
            if (UserObject.isService(i4Var.x1) || i4Var.I0()) {
                b4Var = this;
                b6Var2 = b6Var3;
                m9Var4 = m9Var6;
            } else {
                if (b02) {
                    user2 = user;
                    m9Var4 = m9Var6;
                    chat3 = chat;
                    b6Var2 = b6Var3;
                    org.telegram.ui.ActionBar.g1 c14 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), false, this.d);
                    final int i14 = 0;
                    final org.telegram.ui.ActionBar.b6 b6Var4 = this.d;
                    final TLRPC.Chat chat5 = chat2;
                    b4Var = this;
                    c14.setOnClickListener(new View.OnClickListener(this) { // from class: ih.z3
                        public final /* synthetic */ b4 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i15 = i14;
                            String str2 = str;
                            TLObject tLObject = chat5;
                            org.telegram.ui.ActionBar.b6 b6Var5 = b6Var4;
                            String str3 = sharedPrefKey;
                            b4 b4Var2 = this.b;
                            switch (i15) {
                                case 0:
                                    i4 i4Var2 = b4Var2.l;
                                    MessagesController.getNotificationsSettings(i4Var2.y2).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str3, false).apply();
                                    NotificationsController.getInstance(i4Var2.y2).updateServerNotificationsSettings(i4Var2.x1, 0L);
                                    gc V = new oc(i4Var2.Y0, b6Var5).V(Arrays.asList(tLObject), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, str2)), null, null);
                                    V.a = 2;
                                    V.j();
                                    b4 b4Var3 = i4Var2.p1;
                                    if (b4Var3 != null) {
                                        b4Var3.a();
                                        break;
                                    }
                                    break;
                                default:
                                    i4 i4Var3 = b4Var2.l;
                                    MessagesController.getNotificationsSettings(i4Var3.y2).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str3, true).apply();
                                    NotificationsController.getInstance(i4Var3.y2).updateServerNotificationsSettings(i4Var3.x1, 0L);
                                    gc V2 = new oc(i4Var3.Y0, b6Var5).V(Arrays.asList(tLObject), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, str2)), null, null);
                                    V2.a = 2;
                                    V2.j();
                                    b4 b4Var4 = i4Var3.p1;
                                    if (b4Var4 != null) {
                                        b4Var4.a();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    c14.setMultiline(false);
                } else {
                    b4Var = this;
                    user2 = user;
                    chat3 = chat;
                    b6Var2 = b6Var3;
                    m9Var4 = m9Var6;
                    final TLRPC.Chat chat6 = chat2;
                    org.telegram.ui.ActionBar.g1 c15 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), false, b4Var.d);
                    final int i15 = 1;
                    final org.telegram.ui.ActionBar.b6 b6Var5 = b4Var.d;
                    c15.setOnClickListener(new View.OnClickListener(b4Var) { // from class: ih.z3
                        public final /* synthetic */ b4 b;

                        {
                            this.b = b4Var;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i152 = i15;
                            String str2 = str;
                            TLObject tLObject = chat6;
                            org.telegram.ui.ActionBar.b6 b6Var52 = b6Var5;
                            String str3 = sharedPrefKey;
                            b4 b4Var2 = this.b;
                            switch (i152) {
                                case 0:
                                    i4 i4Var2 = b4Var2.l;
                                    MessagesController.getNotificationsSettings(i4Var2.y2).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str3, false).apply();
                                    NotificationsController.getInstance(i4Var2.y2).updateServerNotificationsSettings(i4Var2.x1, 0L);
                                    gc V = new oc(i4Var2.Y0, b6Var52).V(Arrays.asList(tLObject), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, str2)), null, null);
                                    V.a = 2;
                                    V.j();
                                    b4 b4Var3 = i4Var2.p1;
                                    if (b4Var3 != null) {
                                        b4Var3.a();
                                        break;
                                    }
                                    break;
                                default:
                                    i4 i4Var3 = b4Var2.l;
                                    MessagesController.getNotificationsSettings(i4Var3.y2).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str3, true).apply();
                                    NotificationsController.getInstance(i4Var3.y2).updateServerNotificationsSettings(i4Var3.x1, 0L);
                                    gc V2 = new oc(i4Var3.Y0, b6Var52).V(Arrays.asList(tLObject), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, str2)), null, null);
                                    V2.a = 2;
                                    V2.j();
                                    b4 b4Var4 = i4Var3.p1;
                                    if (b4Var4 != null) {
                                        b4Var4.a();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    c15.setMultiline(false);
                }
                MediaDataController.getInstance(i4Var.y2).loadHints(true);
                boolean z17 = (user2 == null || user2.contact || !MediaDataController.getInstance(i4Var.y2).containsTopPeer(i4Var.x1)) ? false : true;
                if (i4Var.x1 > 0) {
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
                    org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), false, b4Var.d).setOnClickListener(new q3(b4Var, 14));
                } else if (z10) {
                    if (z11) {
                        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), false, b4Var.d).setOnClickListener(new q3(b4Var, 0));
                    } else {
                        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), false, b4Var.d).setOnClickListener(new q3(b4Var, 15));
                    }
                }
            }
            if (g4Var.f) {
                final int i16 = 0;
                m9Var5 = m9Var4;
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_video_pip, LocaleController.getString(R.string.PipMinimize), false, b4Var.d).setOnClickListener(new View.OnClickListener(b4Var) { // from class: ih.r3
                    public final /* synthetic */ b4 b;

                    {
                        this.b = b4Var;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i16) {
                            case 0:
                                b4 b4Var2 = this.b.l.p1;
                                if (b4Var2 != null) {
                                    b4Var2.a();
                                }
                                m9Var5.N();
                                break;
                            default:
                                b4 b4Var3 = this.b.l.p1;
                                if (b4Var3 != null) {
                                    b4Var3.a();
                                }
                                m9Var5.N();
                                break;
                        }
                    }
                });
            } else {
                m9Var5 = m9Var4;
            }
            if (!MessagesController.getInstance(i4Var.y2).premiumFeaturesBlocked() && g4Var.e) {
                boolean z18 = MessagesController.getInstance(i4Var.y2).storyQualityFull;
                if (UserConfig.getInstance(i4Var.y2).isPremium()) {
                    org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, z18 ? R.drawable.menu_quality_sd : R.drawable.menu_quality_hd, LocaleController.getString(z18 ? R.string.StoryQualityDecrease : R.string.StoryQualityIncrease), false, i4Var.x0).setOnClickListener(new b2(0, i4Var, z18));
                } else {
                    Drawable drawable = i4Var.getContext().getDrawable(R.drawable.msg_gallery_locked2);
                    i9 = -1;
                    drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                    j2 j2Var = new j2(i4Var.getContext().getDrawable(R.drawable.menu_quality_hd2), drawable, 1);
                    int dp = AndroidUtilities.dp(24.0f);
                    int dp2 = AndroidUtilities.dp(24.0f);
                    j2Var.e = dp;
                    j2Var.f = dp2;
                    int dp3 = AndroidUtilities.dp(1.0f);
                    int i17 = -AndroidUtilities.dp(2.0f);
                    j2Var.s = dp3;
                    j2Var.v = i17;
                    org.telegram.ui.ActionBar.g1 c16 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_quality_hd, LocaleController.getString(R.string.StoryQualityIncrease), false, i4Var.x0);
                    c16.setOnClickListener(new z1(i4Var, 7));
                    c16.setIcon(j2Var);
                    if (!i4Var.Y2 && i4Var.O2 && !g4Var.f) {
                        if (!UserConfig.getInstance(i4Var.y2).isPremium()) {
                            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_gallery, LocaleController.getString(R.string.SaveToGallery), false, b4Var.d).setOnClickListener(new q3(b4Var, 1));
                        } else if (!MessagesController.getInstance(i4Var.y2).premiumFeaturesBlocked()) {
                            Drawable drawable2 = context.getDrawable(R.drawable.msg_gallery_locked2);
                            drawable2.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, i9, -16777216), PorterDuff.Mode.MULTIPLY));
                            j2 j2Var2 = new j2(context.getDrawable(R.drawable.msg_gallery_locked1), drawable2, 2);
                            actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            org.telegram.ui.ActionBar.g1 c17 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_gallery, LocaleController.getString(R.string.SaveToGallery), false, b4Var.d);
                            c17.setIcon(j2Var2);
                            c17.setOnClickListener(new fg.f(b4Var, c17, m9Var5, 11));
                            if (!MessagesController.getInstance(i4Var.y2).premiumFeaturesBlocked() && !i4Var.z1) {
                                i4.b0(i4Var, actionBarPopupWindow$ActionBarPopupWindowLayout7);
                            }
                            if (i4Var.Q2) {
                                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), false, b4Var.d).setOnClickListener(new q3(b4Var, 2));
                            }
                            if (i4Var.Q2) {
                                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_shareout, LocaleController.getString(R.string.BotShare), false, b4Var.d).setOnClickListener(new q3(b4Var, 3));
                            }
                            storyItem3 = g4Var.a;
                            if (storyItem3 != null) {
                                if (storyItem3.translated && TextUtils.equals(storyItem3.translatedLng, z21.A())) {
                                    org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_translate, LocaleController.getString(R.string.HideTranslation), false, b4Var.d).setOnClickListener(new q3(b4Var, 4));
                                } else if (MessagesController.getInstance(i4Var.y2).getTranslateController().canTranslateStory(g4Var.a)) {
                                    actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                    org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout8, R.drawable.msg_translate, LocaleController.getString(R.string.TranslateMessage), false, b4Var.d).setOnClickListener(new q3(b4Var, 5));
                                    b4Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout8, g4Var.a);
                                    if (!i4Var.Y2 || UserObject.isService(i4Var.x1) || i4Var.I0()) {
                                        actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                        b6Var = b6Var2;
                                    } else {
                                        b6Var = b6Var2;
                                        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout8, R.drawable.msg_report, LocaleController.getString(R.string.ReportChat), false, b4Var.d).setOnClickListener(new s3(b4Var, m9Var5, b6Var));
                                        actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                    }
                                }
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            b4Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout8, g4Var.a);
                            if (i4Var.Y2) {
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            b6Var = b6Var2;
                        }
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    if (!MessagesController.getInstance(i4Var.y2).premiumFeaturesBlocked()) {
                        i4.b0(i4Var, actionBarPopupWindow$ActionBarPopupWindowLayout7);
                    }
                    if (i4Var.Q2) {
                    }
                    if (i4Var.Q2) {
                    }
                    storyItem3 = g4Var.a;
                    if (storyItem3 != null) {
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    b4Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout8, g4Var.a);
                    if (i4Var.Y2) {
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    b6Var = b6Var2;
                }
            }
            i9 = -1;
            if (!i4Var.Y2) {
                if (!UserConfig.getInstance(i4Var.y2).isPremium()) {
                }
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            if (!MessagesController.getInstance(i4Var.y2).premiumFeaturesBlocked()) {
            }
            if (i4Var.Q2) {
            }
            if (i4Var.Q2) {
            }
            storyItem3 = g4Var.a;
            if (storyItem3 != null) {
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            b4Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout8, g4Var.a);
            if (i4Var.Y2) {
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            b6Var = b6Var2;
        }
        boolean z19 = (g4Var == null || (storyItem2 = g4Var.a) == null || (messageMedia = storyItem2.media) == null || (!MessageObject.isDocumentHasAttachedStickers(messageMedia.document) && ((photo = g4Var.a.media.photo) == null || !photo.has_stickers))) ? false : true;
        if (g4Var != null) {
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList3 = new ArrayList();
            TL_stories.StoryItem storyItem8 = g4Var.a;
            if (storyItem8 != null && storyItem8.media_areas != null) {
                for (int i18 = 0; i18 < g4Var.a.media_areas.size(); i18++) {
                    TL_stories.MediaArea mediaArea2 = g4Var.a.media_areas.get(i18);
                    if (mediaArea2 instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                        TLRPC.Reaction reaction = mediaArea2.reaction;
                        if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                            TLRPC.Document f10 = org.telegram.ui.Components.k5.f(i4Var.y2, ((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
                            if (f10 != null && (inputStickerSet2 = MessageObject.getInputStickerSet(f10)) != null && !hashSet2.contains(Long.valueOf(inputStickerSet2.id))) {
                                hashSet2.add(Long.valueOf(inputStickerSet2.id));
                                arrayList3.add(inputStickerSet2);
                            }
                        }
                    }
                }
            }
            TL_stories.StoryItem storyItem9 = g4Var.a;
            if (storyItem9 == null || (arrayList2 = storyItem9.entities) == null || arrayList2.isEmpty()) {
                u6 u6Var = g4Var.b;
                if (u6Var != null && (a8Var = u6Var.c) != null) {
                    if (a8Var.T0 != null) {
                        for (int i19 = 0; i19 < g4Var.b.c.T0.size(); i19++) {
                            VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) g4Var.b.c.T0.get(i19);
                            if (mediaEntity.type == 4 && (mediaArea = mediaEntity.mediaArea) != null) {
                                TLRPC.Reaction reaction2 = mediaArea.reaction;
                                if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                    TLRPC.Document f11 = org.telegram.ui.Components.k5.f(i4Var.y2, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id);
                                    if (f11 != null && (inputStickerSet = MessageObject.getInputStickerSet(f11)) != null && !hashSet2.contains(Long.valueOf(inputStickerSet.id))) {
                                        hashSet2.add(Long.valueOf(inputStickerSet.id));
                                        arrayList3.add(inputStickerSet);
                                    }
                                }
                            }
                        }
                    }
                    CharSequence charSequence = g4Var.b.c.C0;
                    if ((charSequence instanceof Spanned) && (t5VarArr = (org.telegram.ui.Components.t5[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.t5.class)) != null) {
                        int i20 = 0;
                        while (i20 < t5VarArr.length) {
                            org.telegram.ui.Components.t5 t5Var = t5VarArr[i20];
                            TLRPC.Document document = t5Var.document;
                            if (document == null) {
                                num2 = num3;
                                document = org.telegram.ui.Components.k5.f(i4Var.y2, t5Var.documentId);
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
                            i20++;
                            num3 = num2;
                        }
                    }
                }
            } else {
                for (int i21 = 0; i21 < g4Var.a.entities.size(); i21++) {
                    TLRPC.MessageEntity messageEntity = g4Var.a.entities.get(i21);
                    if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                        TLRPC.Document document2 = tL_messageEntityCustomEmoji.document;
                        if (document2 == null) {
                            document2 = org.telegram.ui.Components.k5.f(i4Var.y2, tL_messageEntityCustomEmoji.document_id);
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
            org.telegram.ui.ActionBar.l1 l1Var3 = new org.telegram.ui.ActionBar.l1(context, org.telegram.ui.ActionBar.f6.H8, b6Var);
            l1Var3.setTag(R.id.fit_width_tag, num);
            actionBarPopupWindow$ActionBarPopupWindowLayout6.a(l1Var3, g7.e6.n(-1, 8));
            TLRPC.MessageMedia messageMedia3 = g4Var.a.media;
            TLObject tLObject = messageMedia3.document;
            if (tLObject == null) {
                tLObject = messageMedia3.photo;
            }
            h8 h8Var = new h8(b4Var.i, i4Var.y2, tLObject, g4Var.a, z19, arrayList, b4Var.d);
            h8Var.setOnClickListener(new bg.u1(24, b4Var, h8Var));
            h8Var.setTag(R.id.fit_width_tag, num);
            actionBarPopupWindow$ActionBarPopupWindowLayout6.a(h8Var, g7.e6.n(-1, -2));
        }
    }

    @Override // org.telegram.ui.Components.nr
    public final void c() {
        if (!this.c && !this.k[0]) {
            AndroidUtilities.runOnUIThread(new u3(this, 0));
        }
        i4 i4Var = this.l;
        i4Var.p1 = null;
        i4Var.o1 = null;
    }

    public final void d(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z10) {
        g4 g4Var;
        boolean z11 = this.f;
        i4 i4Var = this.l;
        if (!z11 || ((g4Var = i4Var.K1) != null && g4Var.b != null)) {
            i4Var.y3 = null;
            i4Var.z3 = null;
            return;
        }
        Context context = i4Var.getContext();
        fg0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
        final g5.b bVar = new g5.b(this, actionBarPopupWindow$ActionBarPopupWindowLayout, false, 10);
        pr prVar = new pr();
        org.telegram.ui.ActionBar.g1[] g1VarArr = new org.telegram.ui.ActionBar.g1[5];
        prVar.c = g1VarArr;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, context, null);
        prVar.a = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setFitItems(true);
        org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, null);
        c10.setOnClickListener(new kr(swipeBack, 1));
        c10.c(-328966, -328966);
        c10.setSelectorColor(268435455);
        View gVar = new dh.g(context, 11);
        gVar.setMinimumWidth(AndroidUtilities.dp(196.0f));
        gVar.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(gVar);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) gVar.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(8.0f);
        gVar.setLayoutParams(layoutParams);
        org.telegram.ui.ActionBar.c1 c1Var = new org.telegram.ui.ActionBar.c1(context, null);
        prVar.b = c1Var;
        c1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        c1Var.setDrawShadow(false);
        c1Var.setBackgroundColor(-14540254);
        c1Var.setTextColor(-1);
        c1Var.setOnValueChange(new org.telegram.ui.a5(bVar, 6));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(c1Var, g7.e6.n(-1, 44));
        View gVar2 = new dh.g(context, 12);
        gVar2.setMinimumWidth(AndroidUtilities.dp(196.0f));
        gVar2.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(gVar2);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) gVar2.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams2.gravity = 5;
        }
        layoutParams2.width = -1;
        layoutParams2.height = AndroidUtilities.dp(8.0f);
        gVar2.setLayoutParams(layoutParams2);
        org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_0_2, LocaleController.getString(R.string.SpeedVerySlow), false, null);
        c11.c(-328966, -328966);
        final int i9 = 0;
        c11.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.or
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i9) {
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
        g1VarArr[0] = c11;
        org.telegram.ui.ActionBar.g1 c12 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow), false, null);
        c12.c(-328966, -328966);
        final int i10 = 1;
        c12.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.or
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
        c12.setSelectorColor(268435455);
        g1VarArr[1] = c12;
        org.telegram.ui.ActionBar.g1 c13 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal), false, null);
        c13.c(-328966, -328966);
        final int i11 = 2;
        c13.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.or
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
        c13.setSelectorColor(268435455);
        g1VarArr[2] = c13;
        org.telegram.ui.ActionBar.g1 c14 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast), false, null);
        c14.c(-328966, -328966);
        final int i12 = 3;
        c14.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.or
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
        c14.setSelectorColor(268435455);
        g1VarArr[3] = c14;
        org.telegram.ui.ActionBar.g1 c15 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedVeryFast), false, null);
        c15.c(-328966, -328966);
        final int i13 = 4;
        c15.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.or
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
        c15.setSelectorColor(268435455);
        g1VarArr[4] = c15;
        i4Var.y3 = prVar;
        prVar.a(m9.x1, true);
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, i4Var.getContext(), this.d, false, false);
        i4Var.z3 = g1Var;
        g1Var.g(LocaleController.getString(R.string.Speed), R.drawable.msg_speed, null);
        i4.a0(i4Var, true);
        i4Var.z3.setMinimumWidth(AndroidUtilities.dp(196.0f));
        i4Var.z3.setRightIcon(R.drawable.msg_arrowright);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(i4Var.z3);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) i4Var.z3.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams3.gravity = 5;
        }
        layoutParams3.width = -1;
        layoutParams3.height = AndroidUtilities.dp(48.0f);
        i4Var.z3.setLayoutParams(layoutParams3);
        int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(i4Var.y3.a);
        org.telegram.ui.ActionBar.g1 g1Var2 = i4Var.z3;
        g1Var2.C = new w3(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 0);
        g1Var2.setOnClickListener(new q3(this, 11));
        actionBarPopupWindow$ActionBarPopupWindowLayout.c = true;
        if (z10) {
            org.telegram.ui.ActionBar.l1 l1Var = new org.telegram.ui.ActionBar.l1(i4Var.getContext(), org.telegram.ui.ActionBar.f6.H8, this.d);
            l1Var.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(l1Var, g7.e6.n(-1, 8));
        }
    }

    public final void e(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, TL_stories.StoryItem storyItem) {
        TLRPC.Chat chat;
        i4 i4Var = this.l;
        if (!i4Var.z1 || storyItem == null || (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) || (chat = MessagesController.getInstance(i4Var.y2).getChat(Long.valueOf(-i4Var.x1))) == null) {
            return;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i4Var.y2).getChatFull(chat.id);
        if (chatFull == null) {
            chatFull = MessagesStorage.getInstance(i4Var.y2).loadChatInfo(chat.id, true, new CountDownLatch(1), false, false);
        }
        if (chatFull == null || !chatFull.can_view_stats) {
            return;
        }
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stats, LocaleController.getString(R.string.ViewStatistics), false, this.d).setOnClickListener(new fh.g4(this, storyItem, this.e, chat, 1));
    }
}
