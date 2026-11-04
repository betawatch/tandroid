package ei;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import b8.mf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.li;
import org.telegram.messenger.qr;
import org.telegram.messenger.us;
import org.telegram.messenger.x00;
import org.telegram.messenger.z10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.f21;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.xe0;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.qq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b4 extends k.a {
    public boolean c;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 d;
    public final /* synthetic */ r9 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ Context r;
    public final /* synthetic */ g4 s;
    public final /* synthetic */ boolean[] w;
    public final /* synthetic */ j4 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(j4 j4Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.e6 e6Var2, r9 r9Var, boolean z10, boolean z11, boolean z12, Context context2, g4 g4Var, boolean[] zArr) {
        super(context, e6Var, true);
        this.x = j4Var;
        this.d = e6Var2;
        this.e = r9Var;
        this.f = z10;
        this.h = z11;
        this.n = z12;
        this.r = context2;
        this.s = g4Var;
        this.w = zArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:260:0x0163, code lost:
    
        if (r15.stories_hidden != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x014e, code lost:
    
        if (r14.stories_hidden != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0150, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x0983, code lost:
    
        if (r2.bot_can_edit == false) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x09b1, code lost:
    
        if (r2.delete_stories == false) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x09bc, code lost:
    
        if (r0.delete_stories == false) goto L361;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0446  */
    @Override // k.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        TL_stories.StoryItem storyItem;
        org.telegram.ui.ActionBar.e6 e6Var;
        TL_stories.StoryItem storyItem2;
        int i3;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3;
        b4 b4Var;
        final b4 b4Var2;
        TL_stories.StoryItem storyItem3;
        String M0;
        final r9 r9Var;
        TL_stories.StoryItem storyItem4;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4;
        String str;
        int i10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout5;
        int i11;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout6;
        ArrayList arrayList;
        g1 g1Var;
        TLRPC.GroupCall groupCall;
        g1 g1Var2;
        String str2;
        int i12;
        String str3;
        int i13;
        ArrayList arrayList2;
        gi.f7 f7Var;
        org.telegram.ui.Components.p5[] p5VarArr;
        TL_stories.MediaArea mediaArea;
        TLRPC.InputStickerSet j12;
        ArrayList<TLRPC.MessageEntity> arrayList3;
        TLRPC.InputStickerSet j13;
        TL_stories.StoryItem storyItem5;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Photo photo;
        TLRPC.User user;
        TLRPC.Chat M02;
        TLObject tLObject;
        final b4 b4Var3;
        String str4;
        r9 r9Var2;
        org.telegram.ui.ActionBar.e6 e6Var2;
        final int i14;
        final r9 r9Var3;
        int i15;
        int i16;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout7;
        int i17;
        TL_stories.StoryItem storyItem6;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout8;
        String str5;
        int i18;
        int i19;
        j4 j4Var = this.x;
        h4 h4Var = j4Var.y1;
        boolean z10 = this.h;
        Context context = this.r;
        r9 r9Var4 = this.e;
        org.telegram.ui.ActionBar.e6 e6Var3 = this.d;
        if (z10 || h4Var.b != null) {
            TL_stories.StoryItem storyItem7 = h4Var.a;
            if (h4Var.b != null) {
                e6Var = e6Var3;
                storyItem = storyItem7;
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_cancel, bd.M0(2131752589, null), false, this.d).setOnClickListener(new r3(this, 6));
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                storyItem = storyItem7;
                e6Var = e6Var3;
            }
            if (storyItem == null) {
                return;
            }
            if (!(j4Var.m1 || j4Var.C1.h(j4Var.l1)) || h4Var.f || (storyItem2 = h4Var.a) == null) {
                i3 = R.id.fit_width_tag;
            } else {
                HashSet hashSet = storyItem2.albums != null ? new HashSet(storyItem2.albums) : new HashSet();
                f60 f60Var = new f60(actionBarPopupWindow$ActionBarPopupWindowLayout2, e6Var);
                f60Var.c(R.drawable.ic_ab_back, bd.M0(2131753756, null), new ci.d1(actionBarPopupWindow$ActionBarPopupWindowLayout2, 26), false);
                f60Var.k();
                n6 B = j4Var.getStoriesController().B(j4Var.l1, true);
                n6 B2 = j4Var.C1.B(j4Var.l1, false);
                f60.f(f60Var, B, hashSet, B2 != null && B2.a(), new ai.k3(this, e6Var, storyItem2, 25), new ai.v1(this, hashSet, storyItem2, e6Var, 3));
                int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout2.b(f60Var.B);
                org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, j4Var.getContext(), this.d, false, false);
                j4Var.o3 = y0Var;
                y0Var.j(bd.M0(2131744815, null), R.drawable.menu_album_add, null);
                org.telegram.ui.ActionBar.y0 y0Var2 = j4Var.o3;
                y0Var2.Q = new w3(actionBarPopupWindow$ActionBarPopupWindowLayout2, b10, 1);
                y0Var2.setOnClickListener(new r3(this, 12));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(j4Var.o3);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.c = true;
                org.telegram.ui.ActionBar.c1 c1Var = new org.telegram.ui.ActionBar.c1(org.telegram.ui.ActionBar.k6.H8, j4Var.getContext(), e6Var);
                i3 = R.id.fit_width_tag;
                c1Var.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(c1Var, mf.o(-1, 8));
            }
            int i20 = 10;
            if (j4Var.m1) {
                gi.r8 r8Var = storyItem.privacy.isEmpty() ? new gi.r8(3, j4Var.m2, new ArrayList()) : new gi.r8(j4Var.m2, storyItem.privacy);
                actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.y0 c2 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, R.drawable.msg_view_file, bd.M0(2131742888, null), false, this.d);
                c2.setSubtext(r8Var.toString());
                c2.setOnClickListener(new ai.h(this, r8Var, storyItem, i20));
                c2.setItemHeight(56);
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            }
            s(actionBarPopupWindow$ActionBarPopupWindowLayout3, false);
            if (j4Var.m1 || this.f) {
                org.telegram.ui.ActionBar.c1 c1Var2 = new org.telegram.ui.ActionBar.c1(org.telegram.ui.ActionBar.k6.H8, j4Var.getContext(), e6Var);
                c1Var2.setTag(i3, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout3.a(c1Var2, mf.o(-1, 8));
            }
            if (j4Var.M2 || h4Var.f || !((j4Var.G0() || hp.s1(j4Var.m2).W4()) && this.n)) {
                b4Var = this;
            } else {
                org.telegram.ui.ActionBar.y0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, R.drawable.msg_edit, bd.M0(j4Var.G0() ? 2131751289 : 2131751221, null), false, this.d);
                j4Var.c1 = c10;
                f0 f0Var = new f0(this, this.d, this.r, r9Var4, this.s, 2);
                b4Var = this;
                r9Var4 = r9Var4;
                c10.setOnClickListener(f0Var);
                if (j4Var.C1.M(j4Var.l1) && h4Var.e && !az.b()) {
                    j4Var.c1.setAlpha(0.5f);
                }
            }
            TL_stories.StoryItem storyItem8 = h4Var.a;
            if (storyItem8 == null || !h4Var.e || h4Var.f || !(storyItem8.pinned || j4Var.H0())) {
                TL_stories.StoryItem storyItem9 = storyItem;
                b4Var2 = b4Var;
                storyItem3 = storyItem9;
            } else {
                b4 b4Var4 = b4Var;
                TL_stories.StoryItem storyItem10 = storyItem;
                b4Var2 = b4Var4;
                storyItem3 = storyItem10;
                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_cover_stories, bd.M0(2131744684, null), false, b4Var.d).setOnClickListener(new f0(b4Var4, b4Var4.r, storyItem10, r9Var4, b4Var4.s, 3));
            }
            if ((j4Var.m1 || (j4Var.n1 && hp.s1(j4Var.m2).P1().h(storyItem3.dialogId))) && !h4Var.f) {
                boolean z11 = storyItem3.pinned;
                boolean z12 = !z11;
                if (j4Var.m1) {
                    if (z11) {
                        str = null;
                        i10 = 2131754137;
                    } else {
                        i10 = 2131745919;
                        str = null;
                    }
                    M0 = bd.M0(i10, str);
                } else {
                    M0 = bd.M0(!z11 ? 2131745920 : 2131746320, null);
                }
                String str6 = M0;
                r9Var = r9Var4;
                storyItem4 = storyItem3;
                actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, !z11 ? R.drawable.msg_save_story : R.drawable.menu_unsave_story, str6, false, b4Var2.d).setOnClickListener(new u3(b4Var2, storyItem4, z12, e6Var, 0));
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                storyItem4 = storyItem3;
                r9Var = r9Var4;
            }
            b4Var2.t(actionBarPopupWindow$ActionBarPopupWindowLayout4, storyItem4);
            if (j4Var.M2 || h4Var.f) {
                actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
            } else {
                if (h4Var.e) {
                    i13 = 2131745918;
                    str3 = null;
                } else {
                    str3 = null;
                    i13 = 2131745949;
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout5, R.drawable.msg_gallery, bd.M0(i13, str3), false, b4Var2.d).setOnClickListener(new r3(b4Var2, 7));
            }
            if (!hp.s1(j4Var.m2).D3() && !h4Var.f && !j4Var.n1) {
                j4.Z(j4Var, actionBarPopupWindow$ActionBarPopupWindowLayout5);
            }
            if (j4Var.n1 && j4Var.E2) {
                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout5, R.drawable.msg_link, bd.M0(2131751762, null), false, b4Var2.d).setOnClickListener(new r3(b4Var2, 8));
            }
            if (j4Var.E2) {
                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_shareout, bd.M0(2131752982, null), false, b4Var2.d).setOnClickListener(new r3(b4Var2, 9));
            }
            TL_stories.StoryItem storyItem11 = h4Var.a;
            if (storyItem11 != null) {
                TLRPC.MessageMedia messageMedia2 = storyItem11.media;
                if ((messageMedia2 instanceof TLRPC.TL_messageMediaVideoStream) && (g1Var2 = g1.X) != null && g1Var2.f(((TLRPC.TL_messageMediaVideoStream) messageMedia2).call)) {
                    g1 g1Var3 = g1.X;
                    boolean z13 = g1Var3 != null && g1Var3.o();
                    int i21 = z13 ? R.drawable.msg_voice_unmuted : R.drawable.msg_voice_muted;
                    if (z13) {
                        i12 = 2131743859;
                        str2 = null;
                    } else {
                        str2 = null;
                        i12 = 2131748322;
                    }
                    org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i21, bd.M0(i12, str2), false, b4Var2.d).setOnClickListener(new e2(1, b4Var2, z13));
                    org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_camera_retake, bd.M0(2131754752, str2), false, b4Var2.d).setOnClickListener(new r3(b4Var2, 10));
                }
            }
            if (h4Var.f) {
                final int i22 = 1;
                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_video_pip, bd.M0(2131747230, null), false, b4Var2.d).setOnClickListener(new View.OnClickListener(b4Var2) { // from class: ei.s3
                    public final /* synthetic */ b4 b;

                    {
                        this.b = b4Var2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i22) {
                            case 0:
                                b4 b4Var5 = this.b.x.d1;
                                if (b4Var5 != null) {
                                    b4Var5.a();
                                }
                                r9Var.b0();
                                break;
                            default:
                                b4 b4Var6 = this.b.x.d1;
                                if (b4Var6 != null) {
                                    b4Var6.a();
                                }
                                r9Var.b0();
                                break;
                        }
                    }
                });
            }
            if (h4Var.f && (j4Var.l1 == h10.i(j4Var.m2).e() || org.telegram.messenger.t3.w(14, hp.s1(j4Var.m2).M0(Long.valueOf(-j4Var.l1))) || ((g1Var = r9Var.B0) != null && h4Var.k(g1Var.g()) && (groupCall = r9Var.B0.w) != null && groupCall.creator))) {
                i11 = 1;
                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_settings_old, bd.M0(2131748798, null), false, b4Var2.d).setOnClickListener(new t3(b4Var2, e6Var, r9Var, i11));
            } else {
                i11 = 1;
            }
            if (h4Var.f) {
                org.telegram.ui.ActionBar.y0 c11 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_remove, bd.M0(2131748828, null), false, b4Var2.d);
                int i23 = org.telegram.ui.ActionBar.k6.q7;
                c11.h(0.12f, i23);
                c11.d(e6Var.h(i23), e6Var.h(i23));
                c11.setOnClickListener(new t3(b4Var2, e6Var, r9Var, 2));
            }
            if (!h4Var.f) {
                if (!j4Var.m1) {
                    z6 P1 = hp.s1(j4Var.m2).P1();
                    TL_stories.StoryItem storyItem12 = h4Var.a;
                    int i24 = P1.a;
                    if (storyItem12 != null) {
                        if (storyItem12.dialogId != h10.i(i24).e()) {
                            if (storyItem12.dialogId > 0) {
                                TLRPC.User a22 = hp.s1(i24).a2(Long.valueOf(storyItem12.dialogId));
                                if (a22 != null) {
                                    if (a22.bot) {
                                    }
                                }
                            }
                            if (storyItem12.dialogId < 0) {
                                TLRPC.Chat M03 = hp.s1(i24).M0(Long.valueOf(-storyItem12.dialogId));
                                if (M03 != null) {
                                    if (!M03.creator) {
                                        boolean z14 = storyItem12.out;
                                        if (z14) {
                                            TLRPC.TL_chatAdminRights tL_chatAdminRights = M03.admin_rights;
                                            if (tL_chatAdminRights != null) {
                                                if (!tL_chatAdminRights.post_stories) {
                                                }
                                            }
                                        }
                                        if (!z14) {
                                            TLRPC.TL_chatAdminRights tL_chatAdminRights2 = M03.admin_rights;
                                            if (tL_chatAdminRights2 != null) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                arrayList = null;
                actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.y0 c12 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout6, R.drawable.msg_delete, bd.M0(2131751599, null), false, b4Var2.d);
                int i25 = org.telegram.ui.ActionBar.k6.q7;
                c12.h(0.12f, i25);
                c12.d(e6Var.h(i25), e6Var.h(i25));
                c12.setOnClickListener(new r3(b4Var2, 13));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            arrayList = null;
        } else {
            s(actionBarPopupWindow$ActionBarPopupWindowLayout, true);
            final String v = us.v(j4Var.l1, 0L, false);
            boolean h02 = NotificationsCustomSettingsActivity.h0(j4Var.m2, j4Var.l1);
            if (j4Var.l1 > 0) {
                M02 = null;
                TLRPC.User a23 = hp.s1(j4Var.m2).a2(Long.valueOf(j4Var.l1));
                tLObject = a23;
                user = a23;
            } else {
                user = null;
                M02 = hp.s1(j4Var.m2).M0(Long.valueOf(-j4Var.l1));
                tLObject = M02;
            }
            String trim = user == null ? M02 == null ? "" : M02.title : l10.j(user, true).trim();
            int indexOf = trim.indexOf(" ");
            if (indexOf > 0) {
                trim = trim.substring(0, indexOf);
            }
            final String str7 = trim;
            if (l10.A(j4Var.l1) || j4Var.G0()) {
                b4Var3 = this;
                str4 = null;
                r9Var2 = r9Var4;
                e6Var2 = e6Var3;
                i14 = 0;
            } else {
                if (h02) {
                    r9Var2 = r9Var4;
                    e6Var2 = e6Var3;
                    i14 = 0;
                    org.telegram.ui.ActionBar.y0 c13 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute, bd.M0(2131747871, null), false, this.d);
                    final int i26 = 0;
                    final org.telegram.ui.ActionBar.e6 e6Var4 = this.d;
                    final TLObject tLObject2 = tLObject;
                    b4Var3 = this;
                    c13.setOnClickListener(new View.OnClickListener(this) { // from class: ei.z3
                        public final /* synthetic */ b4 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i27 = i26;
                            String str8 = str7;
                            TLObject tLObject3 = tLObject2;
                            org.telegram.ui.ActionBar.e6 e6Var5 = e6Var4;
                            String str9 = v;
                            b4 b4Var5 = this.b;
                            switch (i27) {
                                case 0:
                                    j4 j4Var2 = b4Var5.x;
                                    hp.s1(j4Var2.m2).d7.edit().putBoolean("stories_" + str9, false).apply();
                                    us.t(j4Var2.m2).c0(j4Var2.l1, 0L, true);
                                    ac V = new fc(j4Var2.M0, e6Var5).V(Arrays.asList(tLObject3), org.telegram.messenger.g0.X2(bd.a0("NotificationsStoryMutedHint", null, 2131747870, str8)), null, null);
                                    V.a = 2;
                                    V.j();
                                    b4 b4Var6 = j4Var2.d1;
                                    if (b4Var6 != null) {
                                        b4Var6.a();
                                        break;
                                    }
                                    break;
                                default:
                                    j4 j4Var3 = b4Var5.x;
                                    hp.s1(j4Var3.m2).d7.edit().putBoolean("stories_" + str9, true).apply();
                                    us.t(j4Var3.m2).c0(j4Var3.l1, 0L, true);
                                    ac V2 = new fc(j4Var3.M0, e6Var5).V(Arrays.asList(tLObject3), org.telegram.messenger.g0.X2(bd.a0("NotificationsStoryUnmutedHint", null, 2131747867, str8)), null, null);
                                    V2.a = 2;
                                    V2.j();
                                    b4 b4Var7 = j4Var3.d1;
                                    if (b4Var7 != null) {
                                        b4Var7.a();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    c13.setMultiline(false);
                } else {
                    b4Var3 = this;
                    r9Var2 = r9Var4;
                    e6Var2 = e6Var3;
                    final TLObject tLObject3 = tLObject;
                    i14 = 0;
                    org.telegram.ui.ActionBar.y0 c14 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_unmute, bd.M0(2131747868, null), false, b4Var3.d);
                    final int i27 = 1;
                    final org.telegram.ui.ActionBar.e6 e6Var5 = b4Var3.d;
                    c14.setOnClickListener(new View.OnClickListener(b4Var3) { // from class: ei.z3
                        public final /* synthetic */ b4 b;

                        {
                            this.b = b4Var3;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i272 = i27;
                            String str8 = str7;
                            TLObject tLObject32 = tLObject3;
                            org.telegram.ui.ActionBar.e6 e6Var52 = e6Var5;
                            String str9 = v;
                            b4 b4Var5 = this.b;
                            switch (i272) {
                                case 0:
                                    j4 j4Var2 = b4Var5.x;
                                    hp.s1(j4Var2.m2).d7.edit().putBoolean("stories_" + str9, false).apply();
                                    us.t(j4Var2.m2).c0(j4Var2.l1, 0L, true);
                                    ac V = new fc(j4Var2.M0, e6Var52).V(Arrays.asList(tLObject32), org.telegram.messenger.g0.X2(bd.a0("NotificationsStoryMutedHint", null, 2131747870, str8)), null, null);
                                    V.a = 2;
                                    V.j();
                                    b4 b4Var6 = j4Var2.d1;
                                    if (b4Var6 != null) {
                                        b4Var6.a();
                                        break;
                                    }
                                    break;
                                default:
                                    j4 j4Var3 = b4Var5.x;
                                    hp.s1(j4Var3.m2).d7.edit().putBoolean("stories_" + str9, true).apply();
                                    us.t(j4Var3.m2).c0(j4Var3.l1, 0L, true);
                                    ac V2 = new fc(j4Var3.M0, e6Var52).V(Arrays.asList(tLObject32), org.telegram.messenger.g0.X2(bd.a0("NotificationsStoryUnmutedHint", null, 2131747867, str8)), null, null);
                                    V2.a = 2;
                                    V2.j();
                                    b4 b4Var7 = j4Var3.d1;
                                    if (b4Var7 != null) {
                                        b4Var7.a();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    c14.setMultiline(false);
                }
                li.b0(j4Var.m2).M0(true);
                int i28 = (user == null || user.contact || !li.b0(j4Var.m2).G(j4Var.l1)) ? i14 : 1;
                if (j4Var.l1 > 0) {
                    i18 = (user == null || !user.contact) ? i14 : 1;
                    if (user != null) {
                    }
                    i19 = i14;
                } else {
                    i18 = (M02 == null || org.telegram.messenger.t3.r0(M02)) ? i14 : 1;
                    if (M02 != null) {
                    }
                    i19 = i14;
                }
                if (i28 != 0) {
                    str4 = null;
                    org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, bd.M0(2131744758, null), false, b4Var3.d).setOnClickListener(new r3(b4Var3, 14));
                } else {
                    str4 = null;
                    if (i18 != 0) {
                        if (i19 == 0) {
                            org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_archive, bd.M0(2131754153, null), false, b4Var3.d).setOnClickListener(new r3(b4Var3, 15));
                        } else {
                            org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_unarchive, bd.M0(2131743924, null), false, b4Var3.d).setOnClickListener(new r3(b4Var3, i14));
                        }
                    }
                }
            }
            if (h4Var.f) {
                r9Var3 = r9Var2;
                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_video_pip, bd.M0(2131747230, str4), false, b4Var3.d).setOnClickListener(new View.OnClickListener(b4Var3) { // from class: ei.s3
                    public final /* synthetic */ b4 b;

                    {
                        this.b = b4Var3;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i14) {
                            case 0:
                                b4 b4Var5 = this.b.x.d1;
                                if (b4Var5 != null) {
                                    b4Var5.a();
                                }
                                r9Var3.b0();
                                break;
                            default:
                                b4 b4Var6 = this.b.x.d1;
                                if (b4Var6 != null) {
                                    b4Var6.a();
                                }
                                r9Var3.b0();
                                break;
                        }
                    }
                });
            } else {
                r9Var3 = r9Var2;
            }
            if (hp.s1(j4Var.m2).D3() || !h4Var.e) {
                i15 = R.drawable.msg_gallery_locked2;
            } else {
                boolean z15 = hp.s1(j4Var.m2).p6;
                if (h10.i(j4Var.m2).q()) {
                    int i29 = z15 ? R.drawable.menu_quality_sd : R.drawable.menu_quality_hd;
                    String M04 = bd.M0(z15 ? 2131744522 : 2131744519, str4);
                    org.telegram.ui.ActionBar.e6 e6Var6 = j4Var.l0;
                    i15 = R.drawable.msg_gallery_locked2;
                    org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i29, M04, false, e6Var6).setOnClickListener(new e2(i14, j4Var, z15));
                } else {
                    i15 = R.drawable.msg_gallery_locked2;
                    Drawable drawable = j4Var.getContext().getDrawable(i15);
                    i16 = -1;
                    drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                    m2 m2Var = new m2(j4Var.getContext().getDrawable(R.drawable.menu_quality_hd2), drawable, 1);
                    int L = org.telegram.messenger.g0.L(24.0f);
                    int L2 = org.telegram.messenger.g0.L(24.0f);
                    m2Var.e = L;
                    m2Var.f = L2;
                    int L3 = org.telegram.messenger.g0.L(1.0f);
                    int i30 = -org.telegram.messenger.g0.L(2.0f);
                    m2Var.s = L3;
                    m2Var.w = i30;
                    org.telegram.ui.ActionBar.y0 c15 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_quality_hd, bd.M0(2131744519, null), false, j4Var.l0);
                    c15.setOnClickListener(new c2(j4Var, 7));
                    c15.setIcon(m2Var);
                    if (!j4Var.M2 && j4Var.C2 && !h4Var.f) {
                        if (!h10.i(j4Var.m2).q()) {
                            actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_gallery, bd.M0(2131745939, null), false, b4Var3.d).setOnClickListener(new r3(b4Var3, 1));
                            i17 = 2;
                            if (!hp.s1(j4Var.m2).D3() && !j4Var.n1) {
                                j4.Z(j4Var, actionBarPopupWindow$ActionBarPopupWindowLayout7);
                            }
                            if (j4Var.E2) {
                                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_link2, bd.M0(2131751762, null), false, b4Var3.d).setOnClickListener(new r3(b4Var3, i17));
                            }
                            if (j4Var.E2) {
                                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_shareout, bd.M0(2131752982, null), false, b4Var3.d).setOnClickListener(new r3(b4Var3, 3));
                            }
                            storyItem6 = h4Var.a;
                            if (storyItem6 != null) {
                                if (storyItem6.translated && TextUtils.equals(storyItem6.translatedLng, f21.M0())) {
                                    org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_translate, bd.M0(2131749312, null), false, b4Var3.d).setOnClickListener(new r3(b4Var3, 4));
                                } else {
                                    x00 x00Var = hp.s1(j4Var.m2).s7;
                                    TL_stories.StoryItem storyItem13 = h4Var.a;
                                    x00Var.getClass();
                                    if (storyItem13 != null && !TextUtils.isEmpty(storyItem13.caption) && !org.telegram.messenger.i6.d(storyItem13.caption) && ((storyItem13.detectedLng == null && storyItem13.translatedText != null && TextUtils.equals(storyItem13.translatedLng, f21.M0())) || ((str5 = storyItem13.detectedLng) != null && !x00Var.w(str5)))) {
                                        actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout8, R.drawable.msg_translate, bd.M0(2131743966, null), false, b4Var3.d).setOnClickListener(new r3(b4Var3, 5));
                                        b4Var3.t(actionBarPopupWindow$ActionBarPopupWindowLayout8, h4Var.a);
                                        if (!j4Var.M2 || l10.A(j4Var.l1) || j4Var.G0()) {
                                            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                            b4Var2 = b4Var3;
                                            e6Var = e6Var2;
                                            arrayList = null;
                                            i11 = 1;
                                        } else {
                                            org.telegram.ui.ActionBar.y0 c16 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout8, R.drawable.msg_report, bd.M0(2131746240, null), false, b4Var3.d);
                                            org.telegram.ui.ActionBar.e6 e6Var7 = e6Var2;
                                            c16.setOnClickListener(new t3(b4Var3, r9Var3, e6Var7));
                                            e6Var = e6Var7;
                                            b4Var2 = b4Var3;
                                            arrayList = null;
                                            i11 = 1;
                                            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                        }
                                    }
                                }
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            b4Var3.t(actionBarPopupWindow$ActionBarPopupWindowLayout8, h4Var.a);
                            if (j4Var.M2) {
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            b4Var2 = b4Var3;
                            e6Var = e6Var2;
                            arrayList = null;
                            i11 = 1;
                        } else if (!hp.s1(j4Var.m2).D3()) {
                            Drawable drawable2 = context.getDrawable(i15);
                            drawable2.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, i16, -16777216), PorterDuff.Mode.MULTIPLY));
                            i17 = 2;
                            m2 m2Var2 = new m2(context.getDrawable(R.drawable.msg_gallery_locked1), drawable2, 2);
                            actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            org.telegram.ui.ActionBar.y0 c17 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_gallery, bd.M0(2131745939, null), false, b4Var3.d);
                            c17.setIcon(m2Var2);
                            c17.setOnClickListener(new ai.h(b4Var3, c17, r9Var3, 11));
                            if (!hp.s1(j4Var.m2).D3()) {
                                j4.Z(j4Var, actionBarPopupWindow$ActionBarPopupWindowLayout7);
                            }
                            if (j4Var.E2) {
                            }
                            if (j4Var.E2) {
                            }
                            storyItem6 = h4Var.a;
                            if (storyItem6 != null) {
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            b4Var3.t(actionBarPopupWindow$ActionBarPopupWindowLayout8, h4Var.a);
                            if (j4Var.M2) {
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            b4Var2 = b4Var3;
                            e6Var = e6Var2;
                            arrayList = null;
                            i11 = 1;
                        }
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    i17 = 2;
                    if (!hp.s1(j4Var.m2).D3()) {
                    }
                    if (j4Var.E2) {
                    }
                    if (j4Var.E2) {
                    }
                    storyItem6 = h4Var.a;
                    if (storyItem6 != null) {
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    b4Var3.t(actionBarPopupWindow$ActionBarPopupWindowLayout8, h4Var.a);
                    if (j4Var.M2) {
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    b4Var2 = b4Var3;
                    e6Var = e6Var2;
                    arrayList = null;
                    i11 = 1;
                }
            }
            i16 = -1;
            if (!j4Var.M2) {
                if (!h10.i(j4Var.m2).q()) {
                }
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            i17 = 2;
            if (!hp.s1(j4Var.m2).D3()) {
            }
            if (j4Var.E2) {
            }
            if (j4Var.E2) {
            }
            storyItem6 = h4Var.a;
            if (storyItem6 != null) {
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            b4Var3.t(actionBarPopupWindow$ActionBarPopupWindowLayout8, h4Var.a);
            if (j4Var.M2) {
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            b4Var2 = b4Var3;
            e6Var = e6Var2;
            arrayList = null;
            i11 = 1;
        }
        boolean z16 = (h4Var == null || (storyItem5 = h4Var.a) == null || (messageMedia = storyItem5.media) == null || (!zi.W2(messageMedia.document) && ((photo = h4Var.a.media.photo) == null || !photo.has_stickers))) ? 0 : i11;
        if (h4Var != null) {
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList4 = new ArrayList();
            TL_stories.StoryItem storyItem14 = h4Var.a;
            if (storyItem14 != null && storyItem14.media_areas != null) {
                for (int i31 = 0; i31 < h4Var.a.media_areas.size(); i31++) {
                    TL_stories.MediaArea mediaArea2 = h4Var.a.media_areas.get(i31);
                    if (mediaArea2 instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                        TLRPC.Reaction reaction = mediaArea2.reaction;
                        if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                            TLRPC.Document e10 = org.telegram.ui.Components.g5.e(j4Var.m2, ((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
                            if (e10 != null && (j13 = zi.j1(e10)) != null && !hashSet2.contains(Long.valueOf(j13.id))) {
                                hashSet2.add(Long.valueOf(j13.id));
                                arrayList4.add(j13);
                            }
                        }
                    }
                }
            }
            TL_stories.StoryItem storyItem15 = h4Var.a;
            if (storyItem15 == null || (arrayList3 = storyItem15.entities) == null || arrayList3.isEmpty()) {
                y6 y6Var = h4Var.b;
                if (y6Var != null && (f7Var = y6Var.c) != null) {
                    if (f7Var.T0 != null) {
                        for (int i32 = 0; i32 < h4Var.b.c.T0.size(); i32++) {
                            z10 z10Var = (z10) h4Var.b.c.T0.get(i32);
                            if (z10Var.a == 4 && (mediaArea = z10Var.M) != null) {
                                TLRPC.Reaction reaction2 = mediaArea.reaction;
                                if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                    TLRPC.Document e11 = org.telegram.ui.Components.g5.e(j4Var.m2, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id);
                                    if (e11 != null && (j12 = zi.j1(e11)) != null && !hashSet2.contains(Long.valueOf(j12.id))) {
                                        hashSet2.add(Long.valueOf(j12.id));
                                        arrayList4.add(j12);
                                    }
                                }
                            }
                        }
                    }
                    CharSequence charSequence = h4Var.b.c.C0;
                    if ((charSequence instanceof Spanned) && (p5VarArr = (org.telegram.ui.Components.p5[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.p5.class)) != null) {
                        for (org.telegram.ui.Components.p5 p5Var : p5VarArr) {
                            TLRPC.Document document = p5Var.document;
                            if (document == null) {
                                document = org.telegram.ui.Components.g5.e(j4Var.m2, p5Var.documentId);
                            }
                            if (document != null) {
                                TLRPC.InputStickerSet j14 = zi.j1(document);
                                if (!hashSet2.contains(Long.valueOf(j14.id))) {
                                    hashSet2.add(Long.valueOf(j14.id));
                                    arrayList4.add(j14);
                                }
                            }
                        }
                    }
                }
            } else {
                for (int i33 = 0; i33 < h4Var.a.entities.size(); i33++) {
                    TLRPC.MessageEntity messageEntity = h4Var.a.entities.get(i33);
                    if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                        TLRPC.Document document2 = tL_messageEntityCustomEmoji.document;
                        if (document2 == null) {
                            document2 = org.telegram.ui.Components.g5.e(j4Var.m2, tL_messageEntityCustomEmoji.document_id);
                        }
                        if (document2 != null) {
                            TLRPC.InputStickerSet j15 = zi.j1(document2);
                            if (!hashSet2.contains(Long.valueOf(j15.id))) {
                                hashSet2.add(Long.valueOf(j15.id));
                                arrayList4.add(j15);
                            }
                        }
                    }
                }
            }
            arrayList2 = arrayList4;
        } else {
            arrayList2 = arrayList;
        }
        boolean z17 = (arrayList2 == null || arrayList2.isEmpty()) ? false : true;
        if (z16 != 0 || z17) {
            org.telegram.ui.ActionBar.c1 c1Var3 = new org.telegram.ui.ActionBar.c1(org.telegram.ui.ActionBar.k6.H8, context, e6Var);
            c1Var3.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout6.a(c1Var3, mf.o(-1, 8));
            TLRPC.MessageMedia messageMedia3 = h4Var.a.media;
            TLObject tLObject4 = messageMedia3.document;
            if (tLObject4 == null) {
                tLObject4 = messageMedia3.photo;
            }
            k8 k8Var = new k8(b4Var2.r, j4Var.m2, tLObject4, h4Var.a, z16, arrayList2, b4Var2.d);
            k8Var.setOnClickListener(new ai.d(18, b4Var2, k8Var));
            k8Var.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout6.a(k8Var, mf.o(-1, -2));
        }
    }

    @Override // k.a
    public final void l() {
        if (!this.c && !this.w[0]) {
            org.telegram.messenger.g0.h3(new v3(this, 0));
        }
        j4 j4Var = this.x;
        j4Var.d1 = null;
        j4Var.c1 = null;
    }

    public final void s(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z10) {
        h4 h4Var;
        boolean z11 = this.f;
        j4 j4Var = this.x;
        if (!z11 || ((h4Var = j4Var.y1) != null && h4Var.b != null)) {
            j4Var.m3 = null;
            j4Var.n3 = null;
            return;
        }
        Context context = j4Var.getContext();
        xe0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
        final tf.b bVar = new tf.b(this, actionBarPopupWindow$ActionBarPopupWindowLayout, false);
        k4.j jVar = new k4.j();
        org.telegram.ui.ActionBar.y0[] y0VarArr = new org.telegram.ui.ActionBar.y0[5];
        jVar.c = y0VarArr;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, context, null);
        jVar.a = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setFitItems(true);
        org.telegram.ui.ActionBar.y0 c2 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_arrow_back, bd.M0(2131753756, null), false, null);
        c2.setOnClickListener(new qq(swipeBack, 1));
        c2.d(-328966, -328966);
        c2.setSelectorColor(268435455);
        View d2Var = new ai.d2(context, 13);
        d2Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        d2Var.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(d2Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) d2Var.getLayoutParams();
        if (bd.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(8.0f);
        d2Var.setLayoutParams(layoutParams);
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context, null);
        jVar.b = u0Var;
        u0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        u0Var.setDrawShadow(false);
        u0Var.setBackgroundColor(-14540254);
        u0Var.setTextColor(-1);
        u0Var.setOnValueChange(new org.telegram.ui.c5(bVar, 6));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(u0Var, mf.o(-1, 44));
        View d2Var2 = new ai.d2(context, 14);
        d2Var2.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        d2Var2.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(d2Var2);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) d2Var2.getLayoutParams();
        if (bd.a0) {
            layoutParams2.gravity = 5;
        }
        layoutParams2.width = -1;
        layoutParams2.height = org.telegram.messenger.g0.L(8.0f);
        d2Var2.setLayoutParams(layoutParams2);
        org.telegram.ui.ActionBar.y0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_0_2, bd.M0(2131745273, null), false, null);
        c10.d(-328966, -328966);
        final int i3 = 0;
        c10.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.uq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        bVar.x(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.x(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.x(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.x(true, true, 1.5f);
                        break;
                    default:
                        bVar.x(true, true, 2.0f);
                        break;
                }
            }
        });
        c10.setSelectorColor(268435455);
        y0VarArr[0] = c10;
        org.telegram.ui.ActionBar.y0 c11 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_slow, bd.M0(2131745276, null), false, null);
        c11.d(-328966, -328966);
        final int i10 = 1;
        c11.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.uq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        bVar.x(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.x(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.x(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.x(true, true, 1.5f);
                        break;
                    default:
                        bVar.x(true, true, 2.0f);
                        break;
                }
            }
        });
        c11.setSelectorColor(268435455);
        y0VarArr[1] = c11;
        org.telegram.ui.ActionBar.y0 c12 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_normal, bd.M0(2131745277, null), false, null);
        c12.d(-328966, -328966);
        final int i11 = 2;
        c12.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.uq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        bVar.x(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.x(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.x(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.x(true, true, 1.5f);
                        break;
                    default:
                        bVar.x(true, true, 2.0f);
                        break;
                }
            }
        });
        c12.setSelectorColor(268435455);
        y0VarArr[2] = c12;
        org.telegram.ui.ActionBar.y0 c13 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_fast, bd.M0(2131745280, null), false, null);
        c13.d(-328966, -328966);
        final int i12 = 3;
        c13.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.uq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        bVar.x(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.x(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.x(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.x(true, true, 1.5f);
                        break;
                    default:
                        bVar.x(true, true, 2.0f);
                        break;
                }
            }
        });
        c13.setSelectorColor(268435455);
        y0VarArr[3] = c13;
        org.telegram.ui.ActionBar.y0 c14 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_superfast, bd.M0(2131745274, null), false, null);
        c14.d(-328966, -328966);
        final int i13 = 4;
        c14.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.uq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        bVar.x(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.x(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.x(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.x(true, true, 1.5f);
                        break;
                    default:
                        bVar.x(true, true, 2.0f);
                        break;
                }
            }
        });
        c14.setSelectorColor(268435455);
        y0VarArr[4] = c14;
        j4Var.m3 = jVar;
        jVar.K(true, r9.C1);
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, j4Var.getContext(), this.d, false, false);
        j4Var.n3 = y0Var;
        y0Var.j(bd.M0(2131745281, null), R.drawable.msg_speed, null);
        j4.Y(j4Var, true);
        j4Var.n3.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        j4Var.n3.setRightIcon(R.drawable.msg_arrowright);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(j4Var.n3);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) j4Var.n3.getLayoutParams();
        if (bd.a0) {
            layoutParams3.gravity = 5;
        }
        layoutParams3.width = -1;
        layoutParams3.height = org.telegram.messenger.g0.L(48.0f);
        j4Var.n3.setLayoutParams(layoutParams3);
        int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b((ActionBarPopupWindow$ActionBarPopupWindowLayout) j4Var.m3.a);
        org.telegram.ui.ActionBar.y0 y0Var2 = j4Var.n3;
        y0Var2.Q = new w3(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 0);
        y0Var2.setOnClickListener(new r3(this, 11));
        actionBarPopupWindow$ActionBarPopupWindowLayout.c = true;
        if (z10) {
            org.telegram.ui.ActionBar.c1 c1Var = new org.telegram.ui.ActionBar.c1(org.telegram.ui.ActionBar.k6.H8, j4Var.getContext(), this.d);
            c1Var.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(c1Var, mf.o(-1, 8));
        }
    }

    public final void t(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, TL_stories.StoryItem storyItem) {
        TLRPC.Chat M0;
        j4 j4Var = this.x;
        if (!j4Var.n1 || storyItem == null || (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) || (M0 = hp.s1(j4Var.m2).M0(Long.valueOf(-j4Var.l1))) == null) {
            return;
        }
        TLRPC.ChatFull N0 = hp.s1(j4Var.m2).N0(M0.id);
        if (N0 == null) {
            N0 = qr.a0(j4Var.m2).F0(M0.id, true, new CountDownLatch(1), false, false, 0);
        }
        if (N0 == null || !N0.can_view_stats) {
            return;
        }
        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stats, bd.M0(2131743552, null), false, this.d).setOnClickListener(new ai.r4(this, storyItem, this.e, M0, 1));
    }
}
