package fi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import c8.ja;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.at;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c10;
import org.telegram.messenger.e20;
import org.telegram.messenger.gj;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.messenger.si;
import org.telegram.messenger.vr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.p21;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.ye0;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.tq;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class t3 extends k.a {
    public boolean c;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 d;
    public final /* synthetic */ i9 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ Context r;
    public final /* synthetic */ y3 s;
    public final /* synthetic */ boolean[] w;
    public final /* synthetic */ b4 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(b4 b4Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.e6 e6Var2, i9 i9Var, boolean z10, boolean z11, boolean z12, Context context2, y3 y3Var, boolean[] zArr) {
        super(context, e6Var, true);
        this.x = b4Var;
        this.d = e6Var2;
        this.e = i9Var;
        this.f = z10;
        this.h = z11;
        this.n = z12;
        this.r = context2;
        this.s = y3Var;
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
    /* JADX WARN: Code restructure failed: missing block: B:413:0x0984, code lost:
    
        if (r2.bot_can_edit == false) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x09b2, code lost:
    
        if (r2.delete_stories == false) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x09bd, code lost:
    
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
        int i7;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3;
        t3 t3Var;
        final t3 t3Var2;
        TL_stories.StoryItem storyItem3;
        String M0;
        final i9 i9Var;
        TL_stories.StoryItem storyItem4;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4;
        String str;
        int i10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout5;
        int i11;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout6;
        ArrayList arrayList;
        e1 e1Var;
        TLRPC.GroupCall groupCall;
        e1 e1Var2;
        String str2;
        int i12;
        String str3;
        int i13;
        ArrayList arrayList2;
        hi.d7 d7Var;
        org.telegram.ui.Components.p5[] p5VarArr;
        TL_stories.MediaArea mediaArea;
        TLRPC.InputStickerSet i14;
        ArrayList<TLRPC.MessageEntity> arrayList3;
        TLRPC.InputStickerSet i15;
        TL_stories.StoryItem storyItem5;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Photo photo;
        TLRPC.User user;
        TLRPC.Chat M02;
        TLObject tLObject;
        final t3 t3Var3;
        String str4;
        i9 i9Var2;
        org.telegram.ui.ActionBar.e6 e6Var2;
        final int i16;
        final i9 i9Var3;
        int i17;
        int i18;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout7;
        int i19;
        TL_stories.StoryItem storyItem6;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout8;
        String str5;
        int i20;
        int i21;
        b4 b4Var = this.x;
        z3 z3Var = b4Var.y1;
        boolean z10 = this.h;
        Context context = this.r;
        i9 i9Var4 = this.e;
        org.telegram.ui.ActionBar.e6 e6Var3 = this.d;
        if (z10 || z3Var.b != null) {
            t3 t3Var4 = this;
            TL_stories.StoryItem storyItem7 = z3Var.a;
            if (z3Var.b != null) {
                e6Var = e6Var3;
                storyItem = storyItem7;
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_cancel, hd.M0(2131752589, null), false, t3Var4.d).setOnClickListener(new j3(t3Var4, 6));
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                storyItem = storyItem7;
                e6Var = e6Var3;
            }
            if (storyItem == null) {
                return;
            }
            if (!(b4Var.m1 || b4Var.C1.h(b4Var.l1)) || z3Var.f || (storyItem2 = z3Var.a) == null) {
                i7 = R.id.fit_width_tag;
            } else {
                HashSet hashSet = storyItem2.albums != null ? new HashSet(storyItem2.albums) : new HashSet();
                m60 m60Var = new m60(actionBarPopupWindow$ActionBarPopupWindowLayout2, e6Var);
                m60Var.c(R.drawable.ic_ab_back, hd.M0(2131753756, null), new bi.u4(actionBarPopupWindow$ActionBarPopupWindowLayout2, 1), false);
                m60Var.k();
                g6 B = b4Var.getStoriesController().B(b4Var.l1, true);
                g6 B2 = b4Var.C1.B(b4Var.l1, false);
                t3Var4 = this;
                m60.f(m60Var, B, hashSet, B2 != null && B2.a(), new aa.r(t3Var4, e6Var, storyItem2, 28), new bi.o1(t3Var4, hashSet, storyItem2, e6Var, 3));
                int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout2.b(m60Var.B);
                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, b4Var.getContext(), t3Var4.d, false, false);
                b4Var.o3 = z0Var;
                z0Var.j(hd.M0(2131744805, null), R.drawable.menu_album_add, null);
                org.telegram.ui.ActionBar.z0 z0Var2 = b4Var.o3;
                z0Var2.Q = new o3(actionBarPopupWindow$ActionBarPopupWindowLayout2, b10, 1);
                z0Var2.setOnClickListener(new j3(t3Var4, 12));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(b4Var.o3);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.c = true;
                org.telegram.ui.ActionBar.d1 d1Var = new org.telegram.ui.ActionBar.d1(org.telegram.ui.ActionBar.j6.H8, b4Var.getContext(), e6Var);
                i7 = R.id.fit_width_tag;
                d1Var.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(d1Var, ja.o(-1, 8));
            }
            int i22 = 10;
            if (b4Var.m1) {
                hi.o8 o8Var = storyItem.privacy.isEmpty() ? new hi.o8(3, b4Var.m2, new ArrayList()) : new hi.o8(b4Var.m2, storyItem.privacy);
                actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, R.drawable.msg_view_file, hd.M0(2131742878, null), false, t3Var4.d);
                c10.setSubtext(o8Var.toString());
                c10.setOnClickListener(new ah.g(t3Var4, o8Var, storyItem, i22));
                c10.setItemHeight(56);
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            }
            t3Var4.t(actionBarPopupWindow$ActionBarPopupWindowLayout3, false);
            if (b4Var.m1 || t3Var4.f) {
                org.telegram.ui.ActionBar.d1 d1Var2 = new org.telegram.ui.ActionBar.d1(org.telegram.ui.ActionBar.j6.H8, b4Var.getContext(), e6Var);
                d1Var2.setTag(i7, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout3.a(d1Var2, ja.o(-1, 8));
            }
            if (b4Var.M2 || z3Var.f || !((b4Var.G0() || np.s1(b4Var.m2).X4()) && t3Var4.n)) {
                t3Var = t3Var4;
            } else {
                org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, R.drawable.msg_edit, hd.M0(b4Var.G0() ? 2131751288 : 2131751220, null), false, t3Var4.d);
                b4Var.c1 = c11;
                t3 t3Var5 = t3Var4;
                d0 d0Var = new d0(t3Var5, t3Var4.d, t3Var4.r, i9Var4, t3Var4.s, 2);
                t3Var = t3Var5;
                i9Var4 = i9Var4;
                c11.setOnClickListener(d0Var);
                if (b4Var.C1.M(b4Var.l1) && z3Var.e && !gz.b()) {
                    b4Var.c1.setAlpha(0.5f);
                }
            }
            TL_stories.StoryItem storyItem8 = z3Var.a;
            if (storyItem8 == null || !z3Var.e || z3Var.f || !(storyItem8.pinned || b4Var.H0())) {
                TL_stories.StoryItem storyItem9 = storyItem;
                t3Var2 = t3Var;
                storyItem3 = storyItem9;
            } else {
                t3 t3Var6 = t3Var;
                TL_stories.StoryItem storyItem10 = storyItem;
                t3Var2 = t3Var6;
                storyItem3 = storyItem10;
                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_cover_stories, hd.M0(2131744674, null), false, t3Var.d).setOnClickListener(new d0(t3Var6, t3Var6.r, storyItem10, i9Var4, t3Var6.s, 3));
            }
            if ((b4Var.m1 || (b4Var.n1 && np.s1(b4Var.m2).P1().h(storyItem3.dialogId))) && !z3Var.f) {
                boolean z11 = storyItem3.pinned;
                boolean z12 = !z11;
                if (b4Var.m1) {
                    if (z11) {
                        str = null;
                        i10 = 2131754137;
                    } else {
                        i10 = 2131745909;
                        str = null;
                    }
                    M0 = hd.M0(i10, str);
                } else {
                    M0 = hd.M0(!z11 ? 2131745910 : 2131746312, null);
                }
                String str6 = M0;
                i9Var = i9Var4;
                storyItem4 = storyItem3;
                actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, !z11 ? R.drawable.msg_save_story : R.drawable.menu_unsave_story, str6, false, t3Var2.d).setOnClickListener(new m3(t3Var2, storyItem4, z12, e6Var, 0));
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                storyItem4 = storyItem3;
                i9Var = i9Var4;
            }
            t3Var2.u(actionBarPopupWindow$ActionBarPopupWindowLayout4, storyItem4);
            if (b4Var.M2 || z3Var.f) {
                actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
            } else {
                if (z3Var.e) {
                    i13 = 2131745908;
                    str3 = null;
                } else {
                    str3 = null;
                    i13 = 2131745939;
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout5, R.drawable.msg_gallery, hd.M0(i13, str3), false, t3Var2.d).setOnClickListener(new j3(t3Var2, 7));
            }
            if (!np.s1(b4Var.m2).D3() && !z3Var.f && !b4Var.n1) {
                b4.Z(b4Var, actionBarPopupWindow$ActionBarPopupWindowLayout5);
            }
            if (b4Var.n1 && b4Var.E2) {
                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout5, R.drawable.msg_link, hd.M0(2131751762, null), false, t3Var2.d).setOnClickListener(new j3(t3Var2, 8));
            }
            if (b4Var.E2) {
                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_shareout, hd.M0(2131752982, null), false, t3Var2.d).setOnClickListener(new j3(t3Var2, 9));
            }
            TL_stories.StoryItem storyItem11 = z3Var.a;
            if (storyItem11 != null) {
                TLRPC.MessageMedia messageMedia2 = storyItem11.media;
                if ((messageMedia2 instanceof TLRPC.TL_messageMediaVideoStream) && (e1Var2 = e1.X) != null && e1Var2.f(((TLRPC.TL_messageMediaVideoStream) messageMedia2).call)) {
                    e1 e1Var3 = e1.X;
                    boolean z13 = e1Var3 != null && e1Var3.o();
                    int i23 = z13 ? R.drawable.msg_voice_unmuted : R.drawable.msg_voice_muted;
                    if (z13) {
                        i12 = 2131743849;
                        str2 = null;
                    } else {
                        str2 = null;
                        i12 = 2131748314;
                    }
                    org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i23, hd.M0(i12, str2), false, t3Var2.d).setOnClickListener(new x1(1, t3Var2, z13));
                    org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_camera_retake, hd.M0(2131754752, str2), false, t3Var2.d).setOnClickListener(new j3(t3Var2, 10));
                }
            }
            if (z3Var.f) {
                final int i24 = 1;
                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_video_pip, hd.M0(2131747222, null), false, t3Var2.d).setOnClickListener(new View.OnClickListener(t3Var2) { // from class: fi.k3
                    public final /* synthetic */ t3 b;

                    {
                        this.b = t3Var2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i24) {
                            case 0:
                                t3 t3Var7 = this.b.x.d1;
                                if (t3Var7 != null) {
                                    t3Var7.a();
                                }
                                i9Var.T();
                                break;
                            default:
                                t3 t3Var8 = this.b.x.d1;
                                if (t3Var8 != null) {
                                    t3Var8.a();
                                }
                                i9Var.T();
                                break;
                        }
                    }
                });
            }
            if (z3Var.f && (b4Var.l1 == m10.i(b4Var.m2).e() || org.telegram.messenger.t3.w(14, np.s1(b4Var.m2).M0(Long.valueOf(-b4Var.l1))) || ((e1Var = i9Var.B0) != null && z3Var.k(e1Var.g()) && (groupCall = i9Var.B0.w) != null && groupCall.creator))) {
                i11 = 1;
                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_settings_old, hd.M0(2131748790, null), false, t3Var2.d).setOnClickListener(new l3(t3Var2, e6Var, i9Var, i11));
            } else {
                i11 = 1;
            }
            if (z3Var.f) {
                org.telegram.ui.ActionBar.z0 c12 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_remove, hd.M0(2131748820, null), false, t3Var2.d);
                int i25 = org.telegram.ui.ActionBar.j6.q7;
                c12.h(0.12f, i25);
                c12.d(e6Var.h(i25), e6Var.h(i25));
                c12.setOnClickListener(new l3(t3Var2, e6Var, i9Var, 2));
            }
            if (!z3Var.f) {
                if (!b4Var.m1) {
                    s6 P1 = np.s1(b4Var.m2).P1();
                    TL_stories.StoryItem storyItem12 = z3Var.a;
                    int i26 = P1.a;
                    if (storyItem12 != null) {
                        if (storyItem12.dialogId != m10.i(i26).e()) {
                            if (storyItem12.dialogId > 0) {
                                TLRPC.User a22 = np.s1(i26).a2(Long.valueOf(storyItem12.dialogId));
                                if (a22 != null) {
                                    if (a22.bot) {
                                    }
                                }
                            }
                            if (storyItem12.dialogId < 0) {
                                TLRPC.Chat M03 = np.s1(i26).M0(Long.valueOf(-storyItem12.dialogId));
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
                org.telegram.ui.ActionBar.z0 c13 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout6, R.drawable.msg_delete, hd.M0(2131751598, null), false, t3Var2.d);
                int i27 = org.telegram.ui.ActionBar.j6.q7;
                c13.h(0.12f, i27);
                c13.d(e6Var.h(i27), e6Var.h(i27));
                c13.setOnClickListener(new j3(t3Var2, 13));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            arrayList = null;
        } else {
            t(actionBarPopupWindow$ActionBarPopupWindowLayout, true);
            final String v = at.v(b4Var.l1, 0L, false);
            boolean h02 = NotificationsCustomSettingsActivity.h0(b4Var.m2, b4Var.l1);
            if (b4Var.l1 > 0) {
                M02 = null;
                TLRPC.User a23 = np.s1(b4Var.m2).a2(Long.valueOf(b4Var.l1));
                tLObject = a23;
                user = a23;
            } else {
                user = null;
                M02 = np.s1(b4Var.m2).M0(Long.valueOf(-b4Var.l1));
                tLObject = M02;
            }
            String trim = user == null ? M02 == null ? "" : M02.title : q10.j(user, true).trim();
            int indexOf = trim.indexOf(" ");
            if (indexOf > 0) {
                trim = trim.substring(0, indexOf);
            }
            final String str7 = trim;
            if (q10.A(b4Var.l1) || b4Var.G0()) {
                t3Var3 = this;
                str4 = null;
                i9Var2 = i9Var4;
                e6Var2 = e6Var3;
                i16 = 0;
            } else {
                if (h02) {
                    i9Var2 = i9Var4;
                    e6Var2 = e6Var3;
                    i16 = 0;
                    org.telegram.ui.ActionBar.z0 c14 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute, hd.M0(2131747863, null), false, this.d);
                    final int i28 = 0;
                    final org.telegram.ui.ActionBar.e6 e6Var4 = this.d;
                    final TLObject tLObject2 = tLObject;
                    t3Var3 = this;
                    c14.setOnClickListener(new View.OnClickListener(this) { // from class: fi.r3
                        public final /* synthetic */ t3 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i29 = i28;
                            String str8 = str7;
                            TLObject tLObject3 = tLObject2;
                            org.telegram.ui.ActionBar.e6 e6Var5 = e6Var4;
                            String str9 = v;
                            t3 t3Var7 = this.b;
                            switch (i29) {
                                case 0:
                                    b4 b4Var2 = t3Var7.x;
                                    np.s1(b4Var2.m2).e7.edit().putBoolean("stories_" + str9, false).apply();
                                    at.t(b4Var2.m2).c0(b4Var2.l1, 0L, true);
                                    xb V = new cc(b4Var2.M0, e6Var5).V(Arrays.asList(tLObject3), org.telegram.messenger.g0.X2(hd.a0("NotificationsStoryMutedHint", null, 2131747862, str8)), null, null);
                                    V.a = 2;
                                    V.j();
                                    t3 t3Var8 = b4Var2.d1;
                                    if (t3Var8 != null) {
                                        t3Var8.a();
                                        break;
                                    }
                                    break;
                                default:
                                    b4 b4Var3 = t3Var7.x;
                                    np.s1(b4Var3.m2).e7.edit().putBoolean("stories_" + str9, true).apply();
                                    at.t(b4Var3.m2).c0(b4Var3.l1, 0L, true);
                                    xb V2 = new cc(b4Var3.M0, e6Var5).V(Arrays.asList(tLObject3), org.telegram.messenger.g0.X2(hd.a0("NotificationsStoryUnmutedHint", null, 2131747859, str8)), null, null);
                                    V2.a = 2;
                                    V2.j();
                                    t3 t3Var9 = b4Var3.d1;
                                    if (t3Var9 != null) {
                                        t3Var9.a();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    c14.setMultiline(false);
                } else {
                    t3Var3 = this;
                    i9Var2 = i9Var4;
                    e6Var2 = e6Var3;
                    final TLObject tLObject3 = tLObject;
                    i16 = 0;
                    org.telegram.ui.ActionBar.z0 c15 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_unmute, hd.M0(2131747860, null), false, t3Var3.d);
                    final int i29 = 1;
                    final org.telegram.ui.ActionBar.e6 e6Var5 = t3Var3.d;
                    c15.setOnClickListener(new View.OnClickListener(t3Var3) { // from class: fi.r3
                        public final /* synthetic */ t3 b;

                        {
                            this.b = t3Var3;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i292 = i29;
                            String str8 = str7;
                            TLObject tLObject32 = tLObject3;
                            org.telegram.ui.ActionBar.e6 e6Var52 = e6Var5;
                            String str9 = v;
                            t3 t3Var7 = this.b;
                            switch (i292) {
                                case 0:
                                    b4 b4Var2 = t3Var7.x;
                                    np.s1(b4Var2.m2).e7.edit().putBoolean("stories_" + str9, false).apply();
                                    at.t(b4Var2.m2).c0(b4Var2.l1, 0L, true);
                                    xb V = new cc(b4Var2.M0, e6Var52).V(Arrays.asList(tLObject32), org.telegram.messenger.g0.X2(hd.a0("NotificationsStoryMutedHint", null, 2131747862, str8)), null, null);
                                    V.a = 2;
                                    V.j();
                                    t3 t3Var8 = b4Var2.d1;
                                    if (t3Var8 != null) {
                                        t3Var8.a();
                                        break;
                                    }
                                    break;
                                default:
                                    b4 b4Var3 = t3Var7.x;
                                    np.s1(b4Var3.m2).e7.edit().putBoolean("stories_" + str9, true).apply();
                                    at.t(b4Var3.m2).c0(b4Var3.l1, 0L, true);
                                    xb V2 = new cc(b4Var3.M0, e6Var52).V(Arrays.asList(tLObject32), org.telegram.messenger.g0.X2(hd.a0("NotificationsStoryUnmutedHint", null, 2131747859, str8)), null, null);
                                    V2.a = 2;
                                    V2.j();
                                    t3 t3Var9 = b4Var3.d1;
                                    if (t3Var9 != null) {
                                        t3Var9.a();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    c15.setMultiline(false);
                }
                si.b0(b4Var.m2).M0(true);
                int i30 = (user == null || user.contact || !si.b0(b4Var.m2).G(b4Var.l1)) ? i16 : 1;
                if (b4Var.l1 > 0) {
                    i20 = (user == null || !user.contact) ? i16 : 1;
                    if (user != null) {
                    }
                    i21 = i16;
                } else {
                    i20 = (M02 == null || org.telegram.messenger.t3.r0(M02)) ? i16 : 1;
                    if (M02 != null) {
                    }
                    i21 = i16;
                }
                if (i30 != 0) {
                    str4 = null;
                    org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, hd.M0(2131744748, null), false, t3Var3.d).setOnClickListener(new j3(t3Var3, 14));
                } else {
                    str4 = null;
                    if (i20 != 0) {
                        if (i21 == 0) {
                            org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_archive, hd.M0(2131754153, null), false, t3Var3.d).setOnClickListener(new j3(t3Var3, 15));
                        } else {
                            org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_unarchive, hd.M0(2131743914, null), false, t3Var3.d).setOnClickListener(new j3(t3Var3, i16));
                        }
                    }
                }
            }
            if (z3Var.f) {
                i9Var3 = i9Var2;
                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_video_pip, hd.M0(2131747222, str4), false, t3Var3.d).setOnClickListener(new View.OnClickListener(t3Var3) { // from class: fi.k3
                    public final /* synthetic */ t3 b;

                    {
                        this.b = t3Var3;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i16) {
                            case 0:
                                t3 t3Var7 = this.b.x.d1;
                                if (t3Var7 != null) {
                                    t3Var7.a();
                                }
                                i9Var3.T();
                                break;
                            default:
                                t3 t3Var8 = this.b.x.d1;
                                if (t3Var8 != null) {
                                    t3Var8.a();
                                }
                                i9Var3.T();
                                break;
                        }
                    }
                });
            } else {
                i9Var3 = i9Var2;
            }
            if (np.s1(b4Var.m2).D3() || !z3Var.e) {
                i17 = R.drawable.msg_gallery_locked2;
            } else {
                boolean z15 = np.s1(b4Var.m2).q6;
                if (m10.i(b4Var.m2).q()) {
                    int i31 = z15 ? R.drawable.menu_quality_sd : R.drawable.menu_quality_hd;
                    String M04 = hd.M0(z15 ? 2131744512 : 2131744509, str4);
                    org.telegram.ui.ActionBar.e6 e6Var6 = b4Var.l0;
                    i17 = R.drawable.msg_gallery_locked2;
                    org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i31, M04, false, e6Var6).setOnClickListener(new x1(i16, b4Var, z15));
                } else {
                    i17 = R.drawable.msg_gallery_locked2;
                    Drawable drawable = b4Var.getContext().getDrawable(i17);
                    i18 = -1;
                    drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                    e2 e2Var = new e2(b4Var.getContext().getDrawable(R.drawable.menu_quality_hd2), drawable, 1);
                    int L = org.telegram.messenger.g0.L(24.0f);
                    int L2 = org.telegram.messenger.g0.L(24.0f);
                    e2Var.e = L;
                    e2Var.f = L2;
                    int L3 = org.telegram.messenger.g0.L(1.0f);
                    int i32 = -org.telegram.messenger.g0.L(2.0f);
                    e2Var.s = L3;
                    e2Var.w = i32;
                    org.telegram.ui.ActionBar.z0 c16 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_quality_hd, hd.M0(2131744509, null), false, b4Var.l0);
                    c16.setOnClickListener(new v1(b4Var, 7));
                    c16.setIcon(e2Var);
                    if (!b4Var.M2 && b4Var.C2 && !z3Var.f) {
                        if (!m10.i(b4Var.m2).q()) {
                            actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_gallery, hd.M0(2131745929, null), false, t3Var3.d).setOnClickListener(new j3(t3Var3, 1));
                            i19 = 2;
                            if (!np.s1(b4Var.m2).D3() && !b4Var.n1) {
                                b4.Z(b4Var, actionBarPopupWindow$ActionBarPopupWindowLayout7);
                            }
                            if (b4Var.E2) {
                                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_link2, hd.M0(2131751762, null), false, t3Var3.d).setOnClickListener(new j3(t3Var3, i19));
                            }
                            if (b4Var.E2) {
                                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_shareout, hd.M0(2131752982, null), false, t3Var3.d).setOnClickListener(new j3(t3Var3, 3));
                            }
                            storyItem6 = z3Var.a;
                            if (storyItem6 != null) {
                                if (storyItem6.translated && TextUtils.equals(storyItem6.translatedLng, p21.M0())) {
                                    org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_translate, hd.M0(2131749304, null), false, t3Var3.d).setOnClickListener(new j3(t3Var3, 4));
                                } else {
                                    c10 c10Var = np.s1(b4Var.m2).t7;
                                    TL_stories.StoryItem storyItem13 = z3Var.a;
                                    c10Var.getClass();
                                    if (storyItem13 != null && !TextUtils.isEmpty(storyItem13.caption) && !org.telegram.messenger.j6.d(storyItem13.caption) && ((storyItem13.detectedLng == null && storyItem13.translatedText != null && TextUtils.equals(storyItem13.translatedLng, p21.M0())) || ((str5 = storyItem13.detectedLng) != null && !c10Var.w(str5)))) {
                                        actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout8, R.drawable.msg_translate, hd.M0(2131743956, null), false, t3Var3.d).setOnClickListener(new j3(t3Var3, 5));
                                        t3Var3.u(actionBarPopupWindow$ActionBarPopupWindowLayout8, z3Var.a);
                                        if (!b4Var.M2 || q10.A(b4Var.l1) || b4Var.G0()) {
                                            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                            t3Var2 = t3Var3;
                                            e6Var = e6Var2;
                                            arrayList = null;
                                            i11 = 1;
                                        } else {
                                            org.telegram.ui.ActionBar.z0 c17 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout8, R.drawable.msg_report, hd.M0(2131746230, null), false, t3Var3.d);
                                            org.telegram.ui.ActionBar.e6 e6Var7 = e6Var2;
                                            c17.setOnClickListener(new l3(t3Var3, i9Var3, e6Var7));
                                            e6Var = e6Var7;
                                            t3Var2 = t3Var3;
                                            arrayList = null;
                                            i11 = 1;
                                            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                        }
                                    }
                                }
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            t3Var3.u(actionBarPopupWindow$ActionBarPopupWindowLayout8, z3Var.a);
                            if (b4Var.M2) {
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            t3Var2 = t3Var3;
                            e6Var = e6Var2;
                            arrayList = null;
                            i11 = 1;
                        } else if (!np.s1(b4Var.m2).D3()) {
                            Drawable drawable2 = context.getDrawable(i17);
                            drawable2.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, i18, -16777216), PorterDuff.Mode.MULTIPLY));
                            i19 = 2;
                            e2 e2Var2 = new e2(context.getDrawable(R.drawable.msg_gallery_locked1), drawable2, 2);
                            actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            org.telegram.ui.ActionBar.z0 c18 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_gallery, hd.M0(2131745929, null), false, t3Var3.d);
                            c18.setIcon(e2Var2);
                            c18.setOnClickListener(new ah.g(t3Var3, c18, i9Var3, 11));
                            if (!np.s1(b4Var.m2).D3()) {
                                b4.Z(b4Var, actionBarPopupWindow$ActionBarPopupWindowLayout7);
                            }
                            if (b4Var.E2) {
                            }
                            if (b4Var.E2) {
                            }
                            storyItem6 = z3Var.a;
                            if (storyItem6 != null) {
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            t3Var3.u(actionBarPopupWindow$ActionBarPopupWindowLayout8, z3Var.a);
                            if (b4Var.M2) {
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            t3Var2 = t3Var3;
                            e6Var = e6Var2;
                            arrayList = null;
                            i11 = 1;
                        }
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    i19 = 2;
                    if (!np.s1(b4Var.m2).D3()) {
                    }
                    if (b4Var.E2) {
                    }
                    if (b4Var.E2) {
                    }
                    storyItem6 = z3Var.a;
                    if (storyItem6 != null) {
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    t3Var3.u(actionBarPopupWindow$ActionBarPopupWindowLayout8, z3Var.a);
                    if (b4Var.M2) {
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    t3Var2 = t3Var3;
                    e6Var = e6Var2;
                    arrayList = null;
                    i11 = 1;
                }
            }
            i18 = -1;
            if (!b4Var.M2) {
                if (!m10.i(b4Var.m2).q()) {
                }
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            i19 = 2;
            if (!np.s1(b4Var.m2).D3()) {
            }
            if (b4Var.E2) {
            }
            if (b4Var.E2) {
            }
            storyItem6 = z3Var.a;
            if (storyItem6 != null) {
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            t3Var3.u(actionBarPopupWindow$ActionBarPopupWindowLayout8, z3Var.a);
            if (b4Var.M2) {
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            t3Var2 = t3Var3;
            e6Var = e6Var2;
            arrayList = null;
            i11 = 1;
        }
        boolean z16 = (z3Var == null || (storyItem5 = z3Var.a) == null || (messageMedia = storyItem5.media) == null || (!gj.V2(messageMedia.document) && ((photo = z3Var.a.media.photo) == null || !photo.has_stickers))) ? 0 : i11;
        if (z3Var != null) {
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList4 = new ArrayList();
            TL_stories.StoryItem storyItem14 = z3Var.a;
            if (storyItem14 != null && storyItem14.media_areas != null) {
                for (int i33 = 0; i33 < z3Var.a.media_areas.size(); i33++) {
                    TL_stories.MediaArea mediaArea2 = z3Var.a.media_areas.get(i33);
                    if (mediaArea2 instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                        TLRPC.Reaction reaction = mediaArea2.reaction;
                        if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                            TLRPC.Document e10 = org.telegram.ui.Components.g5.e(b4Var.m2, ((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
                            if (e10 != null && (i15 = gj.i1(e10)) != null && !hashSet2.contains(Long.valueOf(i15.id))) {
                                hashSet2.add(Long.valueOf(i15.id));
                                arrayList4.add(i15);
                            }
                        }
                    }
                }
            }
            TL_stories.StoryItem storyItem15 = z3Var.a;
            if (storyItem15 == null || (arrayList3 = storyItem15.entities) == null || arrayList3.isEmpty()) {
                r6 r6Var = z3Var.b;
                if (r6Var != null && (d7Var = r6Var.c) != null) {
                    if (d7Var.T0 != null) {
                        for (int i34 = 0; i34 < z3Var.b.c.T0.size(); i34++) {
                            e20 e20Var = (e20) z3Var.b.c.T0.get(i34);
                            if (e20Var.a == 4 && (mediaArea = e20Var.M) != null) {
                                TLRPC.Reaction reaction2 = mediaArea.reaction;
                                if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                    TLRPC.Document e11 = org.telegram.ui.Components.g5.e(b4Var.m2, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id);
                                    if (e11 != null && (i14 = gj.i1(e11)) != null && !hashSet2.contains(Long.valueOf(i14.id))) {
                                        hashSet2.add(Long.valueOf(i14.id));
                                        arrayList4.add(i14);
                                    }
                                }
                            }
                        }
                    }
                    CharSequence charSequence = z3Var.b.c.C0;
                    if ((charSequence instanceof Spanned) && (p5VarArr = (org.telegram.ui.Components.p5[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.p5.class)) != null) {
                        for (org.telegram.ui.Components.p5 p5Var : p5VarArr) {
                            TLRPC.Document document = p5Var.document;
                            if (document == null) {
                                document = org.telegram.ui.Components.g5.e(b4Var.m2, p5Var.documentId);
                            }
                            if (document != null) {
                                TLRPC.InputStickerSet i110 = gj.i1(document);
                                if (!hashSet2.contains(Long.valueOf(i110.id))) {
                                    hashSet2.add(Long.valueOf(i110.id));
                                    arrayList4.add(i110);
                                }
                            }
                        }
                    }
                }
            } else {
                for (int i35 = 0; i35 < z3Var.a.entities.size(); i35++) {
                    TLRPC.MessageEntity messageEntity = z3Var.a.entities.get(i35);
                    if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                        TLRPC.Document document2 = tL_messageEntityCustomEmoji.document;
                        if (document2 == null) {
                            document2 = org.telegram.ui.Components.g5.e(b4Var.m2, tL_messageEntityCustomEmoji.document_id);
                        }
                        if (document2 != null) {
                            TLRPC.InputStickerSet i111 = gj.i1(document2);
                            if (!hashSet2.contains(Long.valueOf(i111.id))) {
                                hashSet2.add(Long.valueOf(i111.id));
                                arrayList4.add(i111);
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
            org.telegram.ui.ActionBar.d1 d1Var3 = new org.telegram.ui.ActionBar.d1(org.telegram.ui.ActionBar.j6.H8, context, e6Var);
            d1Var3.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout6.a(d1Var3, ja.o(-1, 8));
            TLRPC.MessageMedia messageMedia3 = z3Var.a.media;
            TLObject tLObject4 = messageMedia3.document;
            if (tLObject4 == null) {
                tLObject4 = messageMedia3.photo;
            }
            d8 d8Var = new d8(t3Var2.r, b4Var.m2, tLObject4, z3Var.a, z16, arrayList2, t3Var2.d);
            d8Var.setOnClickListener(new ai.v2(19, t3Var2, d8Var));
            d8Var.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout6.a(d8Var, ja.o(-1, -2));
        }
    }

    @Override // k.a
    public final void l() {
        if (!this.c && !this.w[0]) {
            org.telegram.messenger.g0.h3(new n3(this, 0));
        }
        b4 b4Var = this.x;
        b4Var.d1 = null;
        b4Var.c1 = null;
    }

    public final void t(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z10) {
        z3 z3Var;
        boolean z11 = this.f;
        b4 b4Var = this.x;
        if (!z11 || ((z3Var = b4Var.y1) != null && z3Var.b != null)) {
            b4Var.m3 = null;
            b4Var.n3 = null;
            return;
        }
        Context context = b4Var.getContext();
        ye0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
        boolean z12 = false;
        final wf.b bVar = new wf.b(this, actionBarPopupWindow$ActionBarPopupWindowLayout, z12, 20);
        h6.m mVar = new h6.m(25, z12);
        org.telegram.ui.ActionBar.z0[] z0VarArr = new org.telegram.ui.ActionBar.z0[5];
        mVar.d = z0VarArr;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, context, null);
        mVar.b = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setFitItems(true);
        org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_arrow_back, hd.M0(2131753756, null), false, null);
        c10.setOnClickListener(new tq(swipeBack, 1));
        c10.d(-328966, -328966);
        c10.setSelectorColor(268435455);
        View v1Var = new bi.v1(context, 13);
        v1Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        v1Var.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(v1Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) v1Var.getLayoutParams();
        if (hd.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(8.0f);
        v1Var.setLayoutParams(layoutParams);
        org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, null);
        mVar.c = v0Var;
        v0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        v0Var.setDrawShadow(false);
        v0Var.setBackgroundColor(-14540254);
        v0Var.setTextColor(-1);
        v0Var.setOnValueChange(new org.telegram.ui.a5(bVar, 6));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(v0Var, ja.o(-1, 44));
        View v1Var2 = new bi.v1(context, 14);
        v1Var2.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        v1Var2.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(v1Var2);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) v1Var2.getLayoutParams();
        if (hd.a0) {
            layoutParams2.gravity = 5;
        }
        layoutParams2.width = -1;
        layoutParams2.height = org.telegram.messenger.g0.L(8.0f);
        v1Var2.setLayoutParams(layoutParams2);
        org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_0_2, hd.M0(2131745263, null), false, null);
        c11.d(-328966, -328966);
        final int i7 = 0;
        c11.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.xq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        bVar.M(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.M(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.M(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.M(true, true, 1.5f);
                        break;
                    default:
                        bVar.M(true, true, 2.0f);
                        break;
                }
            }
        });
        c11.setSelectorColor(268435455);
        z0VarArr[0] = c11;
        org.telegram.ui.ActionBar.z0 c12 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_slow, hd.M0(2131745266, null), false, null);
        c12.d(-328966, -328966);
        final int i10 = 1;
        c12.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.xq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        bVar.M(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.M(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.M(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.M(true, true, 1.5f);
                        break;
                    default:
                        bVar.M(true, true, 2.0f);
                        break;
                }
            }
        });
        c12.setSelectorColor(268435455);
        z0VarArr[1] = c12;
        org.telegram.ui.ActionBar.z0 c13 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_normal, hd.M0(2131745267, null), false, null);
        c13.d(-328966, -328966);
        final int i11 = 2;
        c13.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.xq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        bVar.M(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.M(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.M(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.M(true, true, 1.5f);
                        break;
                    default:
                        bVar.M(true, true, 2.0f);
                        break;
                }
            }
        });
        c13.setSelectorColor(268435455);
        z0VarArr[2] = c13;
        org.telegram.ui.ActionBar.z0 c14 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_fast, hd.M0(2131745270, null), false, null);
        c14.d(-328966, -328966);
        final int i12 = 3;
        c14.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.xq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        bVar.M(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.M(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.M(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.M(true, true, 1.5f);
                        break;
                    default:
                        bVar.M(true, true, 2.0f);
                        break;
                }
            }
        });
        c14.setSelectorColor(268435455);
        z0VarArr[3] = c14;
        org.telegram.ui.ActionBar.z0 c15 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_superfast, hd.M0(2131745264, null), false, null);
        c15.d(-328966, -328966);
        final int i13 = 4;
        c15.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.xq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        bVar.M(true, true, 0.2f);
                        break;
                    case 1:
                        bVar.M(true, true, 0.5f);
                        break;
                    case 2:
                        bVar.M(true, true, 1.0f);
                        break;
                    case 3:
                        bVar.M(true, true, 1.5f);
                        break;
                    default:
                        bVar.M(true, true, 2.0f);
                        break;
                }
            }
        });
        c15.setSelectorColor(268435455);
        z0VarArr[4] = c15;
        b4Var.m3 = mVar;
        mVar.H(true, i9.B1);
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, b4Var.getContext(), this.d, false, false);
        b4Var.n3 = z0Var;
        z0Var.j(hd.M0(2131745271, null), R.drawable.msg_speed, null);
        b4.Y(b4Var, true);
        b4Var.n3.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        b4Var.n3.setRightIcon(R.drawable.msg_arrowright);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b4Var.n3);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) b4Var.n3.getLayoutParams();
        if (hd.a0) {
            layoutParams3.gravity = 5;
        }
        layoutParams3.width = -1;
        layoutParams3.height = org.telegram.messenger.g0.L(48.0f);
        b4Var.n3.setLayoutParams(layoutParams3);
        int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b((ActionBarPopupWindow$ActionBarPopupWindowLayout) b4Var.m3.b);
        org.telegram.ui.ActionBar.z0 z0Var2 = b4Var.n3;
        z0Var2.Q = new o3(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 0);
        z0Var2.setOnClickListener(new j3(this, 11));
        actionBarPopupWindow$ActionBarPopupWindowLayout.c = true;
        if (z10) {
            org.telegram.ui.ActionBar.d1 d1Var = new org.telegram.ui.ActionBar.d1(org.telegram.ui.ActionBar.j6.H8, b4Var.getContext(), this.d);
            d1Var.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(d1Var, ja.o(-1, 8));
        }
    }

    public final void u(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, TL_stories.StoryItem storyItem) {
        TLRPC.Chat M0;
        b4 b4Var = this.x;
        if (!b4Var.n1 || storyItem == null || (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) || (M0 = np.s1(b4Var.m2).M0(Long.valueOf(-b4Var.l1))) == null) {
            return;
        }
        TLRPC.ChatFull N0 = np.s1(b4Var.m2).N0(M0.id);
        if (N0 == null) {
            N0 = vr.a0(b4Var.m2).F0(M0.id, true, new CountDownLatch(1), false, false, 0);
        }
        if (N0 == null || !N0.can_view_stats) {
            return;
        }
        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stats, hd.M0(2131743542, null), false, this.d).setOnClickListener(new bi.f4(this, storyItem, this.e, M0, 1));
    }
}
