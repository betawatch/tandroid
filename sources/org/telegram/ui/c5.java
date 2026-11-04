package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c5 implements org.telegram.messenger.n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c5(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    private final void b(Object obj, Object obj2) {
        int i3;
        boolean z10;
        boolean z11;
        q11 q11Var = (q11) this.b;
        ArrayList arrayList = (ArrayList) obj;
        p11 p11Var = q11Var.Z1;
        p11 p11Var2 = q11Var.Y1;
        TLRPC.User user = q11Var.R1;
        p11 p11Var3 = q11Var.X1;
        if (p11Var3 != null) {
            ArrayList arrayList2 = p11Var3.d;
            if (p11Var2 == null) {
                return;
            }
            ArrayList arrayList3 = p11Var2.d;
            HashSet hashSet = new HashSet();
            hashSet.add(Long.valueOf(org.telegram.messenger.h10.i(q11Var.a).e()));
            arrayList.add(org.telegram.ui.Components.r31.E(3, org.telegram.messenger.g0.L(64.0f)));
            if (p11Var != null && !TextUtils.isEmpty(p11Var.c.q)) {
                ArrayList arrayList4 = p11Var.d;
                int size = arrayList4.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj3 = arrayList4.get(i10);
                    i10++;
                    TLObject tLObject = (TLObject) obj3;
                    if (!hashSet.contains(Long.valueOf(org.telegram.messenger.m5.d(tLObject)))) {
                        hashSet.add(Long.valueOf(org.telegram.messenger.m5.d(tLObject)));
                        org.telegram.ui.Components.r31 w10 = org.telegram.ui.Components.r31.w(tLObject);
                        w10.L(org.telegram.messenger.m5.d(tLObject) == org.telegram.messenger.m5.d(q11Var.T1));
                        arrayList.add(w10);
                    }
                }
                if (p11Var.f) {
                    arrayList.add(org.telegram.ui.Components.r31.p(29));
                    arrayList.add(org.telegram.ui.Components.r31.p(29));
                    arrayList.add(org.telegram.ui.Components.r31.p(29));
                }
                if (arrayList.size() == 1) {
                    arrayList.add(org.telegram.ui.Components.r31.k(q11Var.W1));
                    return;
                }
                return;
            }
            if (user != null) {
                int size2 = arrayList2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        break;
                    }
                    Object obj4 = arrayList2.get(i11);
                    i11++;
                    if (org.telegram.messenger.m5.d((TLObject) obj4) == org.telegram.messenger.m5.d(user)) {
                        if (!hashSet.contains(Long.valueOf(org.telegram.messenger.m5.d(user)))) {
                            arrayList.add(org.telegram.ui.Components.r31.r(org.telegram.messenger.bd.M0(org.telegram.messenger.t3.V(q11Var.Q1) ? 2131752516 : 2131749507, null)));
                            hashSet.add(Long.valueOf(org.telegram.messenger.m5.d(user)));
                            org.telegram.ui.Components.r31 w11 = org.telegram.ui.Components.r31.w(user);
                            i3 = 29;
                            w11.L(org.telegram.messenger.m5.d(user) == org.telegram.messenger.m5.d(q11Var.T1));
                            arrayList.add(w11);
                            z10 = false;
                        }
                    }
                }
            }
            i3 = 29;
            z10 = true;
            int size3 = arrayList2.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj5 = arrayList2.get(i12);
                i12++;
                TLObject tLObject2 = (TLObject) obj5;
                if (!hashSet.contains(Long.valueOf(org.telegram.messenger.m5.d(tLObject2)))) {
                    if (z10) {
                        arrayList.add(org.telegram.ui.Components.r31.r(org.telegram.messenger.bd.M0(org.telegram.messenger.t3.V(q11Var.Q1) ? 2131752516 : 2131749507, null)));
                        z10 = false;
                    }
                    hashSet.add(Long.valueOf(org.telegram.messenger.m5.d(tLObject2)));
                    org.telegram.ui.Components.r31 w12 = org.telegram.ui.Components.r31.w(tLObject2);
                    w12.L(org.telegram.messenger.m5.d(tLObject2) == org.telegram.messenger.m5.d(q11Var.T1));
                    arrayList.add(w12);
                }
            }
            if (p11Var3.f) {
                arrayList.add(org.telegram.ui.Components.r31.p(i3));
                arrayList.add(org.telegram.ui.Components.r31.p(i3));
                arrayList.add(org.telegram.ui.Components.r31.p(i3));
            }
            if (user == null || hashSet.contains(Long.valueOf(org.telegram.messenger.m5.d(user)))) {
                z11 = true;
            } else {
                arrayList.add(org.telegram.ui.Components.r31.r(org.telegram.messenger.bd.M0(org.telegram.messenger.t3.V(q11Var.Q1) ? 2131752288 : 2131749436, null)));
                hashSet.add(Long.valueOf(org.telegram.messenger.m5.d(user)));
                org.telegram.ui.Components.r31 w13 = org.telegram.ui.Components.r31.w(user);
                w13.L(org.telegram.messenger.m5.d(user) == org.telegram.messenger.m5.d(q11Var.T1));
                arrayList.add(w13);
                z11 = false;
            }
            int size4 = arrayList3.size();
            int i13 = 0;
            while (i13 < size4) {
                Object obj6 = arrayList3.get(i13);
                i13++;
                TLObject tLObject3 = (TLObject) obj6;
                if (!hashSet.contains(Long.valueOf(org.telegram.messenger.m5.d(tLObject3)))) {
                    if (z11) {
                        arrayList.add(org.telegram.ui.Components.r31.r(org.telegram.messenger.bd.M0(org.telegram.messenger.t3.V(q11Var.Q1) ? 2131752288 : 2131749436, null)));
                        z11 = false;
                    }
                    hashSet.add(Long.valueOf(org.telegram.messenger.m5.d(tLObject3)));
                    org.telegram.ui.Components.r31 w14 = org.telegram.ui.Components.r31.w(tLObject3);
                    w14.L(org.telegram.messenger.m5.d(tLObject3) == org.telegram.messenger.m5.d(q11Var.T1));
                    arrayList.add(w14);
                }
            }
            if (arrayList3.isEmpty() || !p11Var2.f) {
                return;
            }
            arrayList.add(org.telegram.ui.Components.r31.p(i3));
            arrayList.add(org.telegram.ui.Components.r31.p(i3));
            arrayList.add(org.telegram.ui.Components.r31.p(i3));
        }
    }

    private final void c(Object obj, Object obj2) {
        j31 j31Var = (j31) this.b;
        ArrayList arrayList = (ArrayList) obj;
        LinearLayout linearLayout = j31Var.R1;
        if (linearLayout != null) {
            arrayList.add(org.telegram.ui.Components.r31.k(linearLayout));
        }
        LinearLayout linearLayout2 = j31Var.S1;
        if (linearLayout2 != null) {
            arrayList.add(org.telegram.ui.Components.r31.k(linearLayout2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        TLRPC.Chat M0;
        d41 d41Var;
        TLRPC.UserProfilePhoto userProfilePhoto;
        TL_stories.StoryItem storyItem;
        int i3 = 12;
        int i10 = 7;
        int i11 = 1;
        int i12 = 0;
        switch (this.a) {
            case 0:
                d5 d5Var = (d5) this.b;
                d5Var.w.setBackground(new BitmapDrawable((Bitmap) obj));
                d5Var.x = false;
                si.b bVar = d5Var.h;
                bVar.a((Bitmap) obj2);
                jh.d.c(bVar, d5Var);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = d5Var.d;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
                    break;
                }
                break;
            case 1:
                h9 h9Var = (h9) this.b;
                ArrayList arrayList = (ArrayList) obj;
                boolean isEmpty = h9Var.H.isEmpty();
                ArrayList arrayList2 = h9Var.y;
                boolean isEmpty2 = arrayList2.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.r31 c2 = org.telegram.ui.Components.r31.c(1, R.drawable.menu_call_create, org.telegram.messenger.bd.M0(2131749498, null));
                    c2.q = true;
                    arrayList.add(c2);
                    if (!h9Var.getUserConfig().X) {
                        org.telegram.ui.Components.r31 c10 = org.telegram.ui.Components.r31.c(2, R.drawable.menu_add_tab_24, org.telegram.messenger.bd.M0(2131749469, null));
                        c10.q = true;
                        arrayList.add(c10);
                    }
                    arrayList.add(org.telegram.ui.Components.r31.C(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList3 = h9Var.H;
                    int size = arrayList3.size();
                    int i13 = 0;
                    while (i13 < size) {
                        Object obj3 = arrayList3.get(i13);
                        i13++;
                        Long l10 = (Long) obj3;
                        if (l10 != null && (M0 = h9Var.getMessagesController().M0(l10)) != null) {
                            l8 l8Var = new l8(h9Var, 0);
                            int i14 = f9.b;
                            org.telegram.ui.Components.r31 K = org.telegram.ui.Components.r31.K(f9.class);
                            K.G = M0;
                            K.D = l8Var;
                            arrayList.add(K);
                        }
                    }
                    arrayList.add(org.telegram.ui.Components.r31.C(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList2.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj4 = arrayList2.get(i15);
                        i15++;
                        e9 e9Var = (e9) obj4;
                        org.telegram.messenger.video.g gVar = new org.telegram.messenger.video.g(i3, h9Var, e9Var);
                        int i16 = c9.b;
                        org.telegram.ui.Components.r31 K2 = org.telegram.ui.Components.r31.K(c9.class);
                        K2.G = e9Var;
                        K2.D = gVar;
                        K2.L(h9Var.k0(e9Var.c));
                        arrayList.add(K2);
                    }
                    if (!h9Var.G) {
                        arrayList.add(org.telegram.ui.Components.r31.q(-1, 8));
                        arrayList.add(org.telegram.ui.Components.r31.q(-2, 8));
                        arrayList.add(org.telegram.ui.Components.r31.q(-3, 8));
                        break;
                    }
                }
                break;
            case 2:
                xd xdVar = (xd) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                xdVar.S0 = -1;
                TLRPC.Chat M02 = org.telegram.messenger.hp.s1(xdVar.p0).M0(Long.valueOf(-xdVar.q0));
                TLRPC.ChatFull N0 = org.telegram.messenger.hp.s1(xdVar.p0).N0(-xdVar.q0);
                int i17 = N0 != null ? N0.stats_dc : -1;
                if (xdVar.c1) {
                    arrayList4.add(org.telegram.ui.Components.r31.g(xdVar.t0));
                    d41 d41Var2 = xdVar.m1;
                    if (d41Var2 != null && !d41Var2.l) {
                        arrayList4.add(org.telegram.ui.Components.r31.h(5, i17, d41Var2));
                        arrayList4.add(org.telegram.ui.Components.r31.B(-1, null));
                    }
                    d41 d41Var3 = xdVar.n1;
                    if (d41Var3 != null && !d41Var3.l) {
                        arrayList4.add(org.telegram.ui.Components.r31.h(2, i17, d41Var3));
                        arrayList4.add(org.telegram.ui.Components.r31.B(-2, null));
                    }
                }
                if (xdVar.d1 && (d41Var = xdVar.o1) != null && !d41Var.l) {
                    arrayList4.add(org.telegram.ui.Components.r31.h(2, i17, d41Var));
                    arrayList4.add(org.telegram.ui.Components.r31.B(-3, null));
                }
                if (xdVar.p1) {
                    arrayList4.add(org.telegram.ui.Components.r31.b(org.telegram.messenger.bd.M0(2131748393, null)));
                    arrayList4.add(org.telegram.ui.Components.r31.v(xdVar.q1));
                    arrayList4.add(org.telegram.ui.Components.r31.v(xdVar.r1));
                    arrayList4.add(org.telegram.ui.Components.r31.v(xdVar.s1));
                    arrayList4.add(org.telegram.ui.Components.r31.B(-4, xdVar.v0));
                }
                if (M02 != null && M02.creator) {
                    if (xdVar.c1) {
                        arrayList4.add(org.telegram.ui.Components.r31.b(org.telegram.messenger.bd.M0(2131748414, null)));
                        arrayList4.add(org.telegram.ui.Components.r31.k(xdVar.x0));
                        arrayList4.add(org.telegram.ui.Components.r31.B(-5, xdVar.u0));
                        int i18 = org.telegram.messenger.hp.s1(xdVar.p0).z4;
                        String M03 = org.telegram.messenger.bd.M0(2131748373, null);
                        int i19 = xdVar.s0 < i18 ? i18 : 0;
                        if (i19 > 0) {
                            Context context = org.telegram.messenger.t0.b;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M03);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(0, new org.telegram.ui.ActionBar.s2(i19, context, null, false));
                            wpVar.s = org.telegram.messenger.g0.L(1.0f);
                            spannableStringBuilder.setSpan(wpVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            M03 = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.r31 i20 = org.telegram.ui.Components.r31.i(1, M03);
                        i20.L(xdVar.s0 >= i18 && xdVar.k1);
                        arrayList4.add(i20);
                        arrayList4.add(org.telegram.ui.Components.r31.B(-8, org.telegram.messenger.bd.M0(2131748372, null)));
                    }
                    if (xdVar.d1) {
                        arrayList4.add(org.telegram.ui.Components.r31.b(org.telegram.messenger.bd.M0(2131748381, null)));
                        arrayList4.add(org.telegram.ui.Components.r31.j(3, xdVar.D0));
                        arrayList4.add(org.telegram.ui.Components.r31.B(-6, xdVar.w0));
                    }
                }
                if (org.telegram.messenger.t3.V(org.telegram.messenger.hp.s1(xdVar.p0).M0(Long.valueOf(-xdVar.q0))) && org.telegram.messenger.hp.s1(xdVar.p0).g6) {
                    arrayList4.add(ii.g.i(4, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ik, xdVar.o0), ln.i0(org.telegram.messenger.bd.M0(2131752474, null)), org.telegram.messenger.bd.M0(2131752475, null)));
                    arrayList4.add(org.telegram.ui.Components.r31.B(-7, null));
                }
                if (xdVar.b1.a()) {
                    xdVar.S0 = arrayList4.size();
                    arrayList4.add(org.telegram.ui.Components.r31.n(xdVar.U0, -2));
                    break;
                } else {
                    arrayList4.add(org.telegram.ui.Components.r31.B(-10, null));
                    break;
                }
                break;
            case 3:
                rd rdVar = (rd) this.b;
                ArrayList arrayList5 = (ArrayList) obj;
                td tdVar = rdVar.f;
                int i21 = rdVar.d;
                int i22 = td.y;
                ArrayList arrayList6 = i21 == 0 ? tdVar.r : tdVar.n;
                int size3 = arrayList6.size();
                while (i12 < size3) {
                    Object obj5 = arrayList6.get(i12);
                    i12++;
                    int i23 = ci.qb.b;
                    org.telegram.ui.Components.r31 K3 = org.telegram.ui.Components.r31.K(ci.qb.class);
                    K3.G = (TL_stars.StarsTransaction) obj5;
                    K3.q = true;
                    arrayList5.add(K3);
                }
                if (!TextUtils.isEmpty(i21 == 0 ? tdVar.s : tdVar.h)) {
                    arrayList5.add(org.telegram.ui.Components.r31.q(arrayList5.size(), 7));
                    arrayList5.add(org.telegram.ui.Components.r31.q(arrayList5.size(), 7));
                    arrayList5.add(org.telegram.ui.Components.r31.q(arrayList5.size(), 7));
                    break;
                }
                break;
            case 4:
                ln lnVar = (ln) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    lnVar.getClass();
                    org.telegram.ui.Components.fc.a0(lnVar).f0(tL_error, false);
                }
                org.telegram.messenger.g0.E2(lnVar.k0);
                org.telegram.messenger.g0.E2(lnVar.h0);
                org.telegram.messenger.g0.E2(lnVar.j0);
                break;
            case 5:
                org.telegram.messenger.g0.i3(new jp((nq) this.b, i11), 1000L);
                break;
            case 6:
                ((tf.b) this.b).x(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                break;
            case 7:
                lr lrVar = (lr) this.b;
                ArrayList arrayList7 = (ArrayList) obj;
                TLRPC.User a22 = lrVar.getMessagesController().a2(Long.valueOf(lrVar.I));
                arrayList7.add(org.telegram.ui.Components.r31.k(lrVar.W));
                arrayList7.add(org.telegram.ui.Components.r31.k(lrVar.b));
                arrayList7.add(org.telegram.ui.Components.r31.k(lrVar.c));
                if (TextUtils.isEmpty(lrVar.g0())) {
                    arrayList7.add(org.telegram.ui.Components.r31.C(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131748417, null)), org.telegram.messenger.l10.j(a22, true), "%1$s")));
                } else if (lrVar.L) {
                    arrayList7.add(org.telegram.ui.Components.r31.C(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("MobileVisibleInfo", null, 2131748416, org.telegram.messenger.l10.j(a22, true)))));
                } else {
                    arrayList7.add(org.telegram.ui.Components.r31.C(null));
                }
                if (lrVar.J && lrVar.L) {
                    org.telegram.ui.Components.r31 i24 = org.telegram.ui.Components.r31.i(2, org.telegram.messenger.bd.M0(2131754447, null));
                    i24.L(lrVar.Y);
                    arrayList7.add(i24);
                    arrayList7.add(org.telegram.ui.Components.r31.C(org.telegram.messenger.bd.a0(null, null, 2131754446, org.telegram.messenger.l10.j(a22, true))));
                }
                arrayList7.add(org.telegram.ui.Components.r31.k(lrVar.d));
                arrayList7.add(org.telegram.ui.Components.r31.C(org.telegram.messenger.bd.M0(2131754394, null)));
                if (!lrVar.J) {
                    TLRPC.UserFull b22 = lrVar.getMessagesController().b2(lrVar.I);
                    if (b22 != null && b22.birthday == null) {
                        arrayList7.add(org.telegram.ui.Components.r31.k(lrVar.G));
                    }
                    arrayList7.add(org.telegram.ui.Components.r31.k(lrVar.y));
                    arrayList7.add(org.telegram.ui.Components.r31.k(lrVar.E));
                    if (a22 != null && (userProfilePhoto = a22.photo) != null && userProfilePhoto.personal) {
                        arrayList7.add(org.telegram.ui.Components.r31.k(lrVar.F));
                    }
                    arrayList7.add(org.telegram.ui.Components.r31.C(null));
                    org.telegram.ui.Components.r31 e10 = org.telegram.ui.Components.r31.e(1, org.telegram.messenger.bd.M0(2131751553, null));
                    e10.r = true;
                    arrayList7.add(e10);
                }
                arrayList7.add(org.telegram.ui.Components.r31.C(null));
                if (lrVar.Z) {
                    org.telegram.messenger.g0.h3(new dr(lrVar, a22, i12));
                    lrVar.Z = false;
                    org.telegram.messenger.g0.i3(new br(lrVar, i11), 200L);
                    break;
                }
                break;
            case 8:
                is.a((is) this.b, (Bitmap) obj, (Bitmap) obj2);
                break;
            case 9:
                es esVar = (es) this.b;
                CharSequence charSequence = (CharSequence) obj;
                org.telegram.messenger.u10 u10Var = (org.telegram.messenger.u10) obj2;
                is isVar = esVar.a;
                gs gsVar = isVar.l;
                if (gsVar != null) {
                    gsVar.K(charSequence, TextUtils.join("", isVar.o), u10Var != null ? new org.telegram.ui.Components.ei(i3, esVar, u10Var) : null);
                    if (u10Var == null) {
                        isVar.o();
                        break;
                    }
                }
                break;
            case 10:
                qs qsVar = (qs) this.b;
                ArrayList arrayList8 = (ArrayList) obj;
                arrayList8.add(org.telegram.ui.Components.r31.k(qsVar.Q1));
                arrayList8.add(org.telegram.ui.Components.r31.C(null));
                ArrayList arrayList9 = qsVar.T1;
                if (arrayList9 != null && !arrayList9.isEmpty()) {
                    arrayList8.add(org.telegram.ui.Components.r31.u(org.telegram.messenger.bd.M0(2131749497, null)));
                    while (i12 < arrayList9.size()) {
                        Long l11 = (Long) arrayList9.get(i12);
                        l11.getClass();
                        TLRPC.User a23 = org.telegram.messenger.hp.s1(qsVar.a).a2(l11);
                        if (a23 == null) {
                            break;
                        } else {
                            int i25 = bh.o.b;
                            org.telegram.ui.Components.r31 K4 = org.telegram.ui.Components.r31.K(bh.o.class);
                            K4.G = a23;
                            K4.L(qsVar.U1.contains(l11));
                            arrayList8.add(K4);
                            i12++;
                        }
                    }
                    break;
                }
                break;
            case 11:
                uw uwVar = (uw) this.b;
                uwVar.Q1 = (Long) obj;
                uwVar.g5();
                break;
            case 12:
                ((Runnable) this.b).run();
                break;
            case 13:
                kx kxVar = (kx) this.b;
                ArrayList arrayList10 = (ArrayList) obj;
                String M04 = org.telegram.messenger.bd.M0(2131743999, null);
                org.telegram.ui.Components.r31 r31Var = new org.telegram.ui.Components.r31(2);
                r31Var.l = M04;
                r31Var.k = R.raw.topics_top;
                arrayList10.add(r31Var);
                org.telegram.ui.Components.r31 i26 = org.telegram.ui.Components.r31.i(1, org.telegram.messenger.bd.M0(2131744000, null));
                i26.L(kxVar.c);
                arrayList10.add(i26);
                if (kxVar.c) {
                    arrayList10.add(org.telegram.ui.Components.r31.C(null));
                    arrayList10.add(org.telegram.ui.Components.r31.u(org.telegram.messenger.bd.M0(2131743998, null)));
                    s3 s3Var = new s3(kxVar, 6);
                    int i27 = ix.b;
                    org.telegram.ui.Components.r31 K5 = org.telegram.ui.Components.r31.K(ix.class);
                    K5.d = 2;
                    K5.G = s3Var;
                    K5.z = kxVar.e ? 2 : kxVar.d ? 0 : 1;
                    arrayList10.add(K5);
                    arrayList10.add(org.telegram.ui.Components.r31.C(org.telegram.messenger.bd.M0(2131743997, null)));
                    break;
                }
                break;
            case 14:
                m90 m90Var = (m90) this.b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                m90Var.c();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    org.telegram.messenger.hp.s1(m90Var.b).Y3(tL_tones.users, false);
                    org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                    if (T != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.r(T.getContext(), tL_tones.tones.get(0), T.getResourceProvider()).show();
                        break;
                    }
                } else if (tL_error2 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error2.text)) {
                        org.telegram.messenger.k5.o(null, 2131754974, m90.d(), R.raw.error, 36);
                        break;
                    } else {
                        m90.d().f0(tL_error2, false);
                        break;
                    }
                }
                break;
            case 15:
                pr0 pr0Var = (pr0) this.b;
                si.b bVar2 = pr0Var.G;
                Bitmap bitmap = (Bitmap) obj2;
                pr0Var.s = (Bitmap) obj;
                Paint paint = new Paint(1);
                pr0Var.x = paint;
                Bitmap bitmap2 = pr0Var.s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                pr0Var.w = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix, org.telegram.ui.ActionBar.k6.I.q() ? 0.05f : 0.25f);
                org.telegram.messenger.g0.h(colorMatrix, org.telegram.ui.ActionBar.k6.I.q() ? -0.02f : -0.04f);
                pr0Var.x.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                pr0Var.y = new Matrix();
                bVar2.a(bitmap);
                jh.d.c(bVar2, pr0Var.c);
                pr0Var.H.d();
                break;
            case 16:
                xr0 xr0Var = (xr0) this.b;
                ArrayList arrayList11 = (ArrayList) obj;
                String M05 = org.telegram.messenger.bd.M0(2131754276, null);
                org.telegram.ui.Components.r31 r31Var2 = new org.telegram.ui.Components.r31(2);
                r31Var2.l = M05;
                r31Var2.k = R.raw.bubble;
                arrayList11.add(r31Var2);
                org.telegram.ui.Components.r31 i28 = org.telegram.ui.Components.r31.i(1, org.telegram.messenger.bd.M0(2131754277, null));
                i28.L(xr0Var.n);
                arrayList11.add(i28);
                arrayList11.add(org.telegram.ui.Components.r31.B(2, null));
                if (xr0Var.n) {
                    arrayList11.add(org.telegram.ui.Components.r31.u(org.telegram.messenger.bd.M0(2131746883, null)));
                    int[] a10 = org.telegram.ui.Cells.s7.a(new int[]{0, 10, 50, 100, org.telegram.messenger.hs.e3, org.telegram.messenger.hs.Z3, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, (int) xr0Var.getMessagesController().I6);
                    u70 u70Var = new u70(i10);
                    org.telegram.ui.Cells.r7 r7Var = new org.telegram.ui.Cells.r7();
                    r7Var.c = a10;
                    r7Var.d = 20;
                    r7Var.e = u70Var;
                    xr0Var.b.d((int) Utilities.k(xr0Var.r, 10000L, 0L), r7Var, new s3(xr0Var, 19));
                    arrayList11.add(org.telegram.ui.Components.r31.j(3, xr0Var.b));
                    arrayList11.add(org.telegram.ui.Components.r31.B(4, xr0Var.r > 0 ? xr0Var.b0() : null));
                    TLRPC.Chat M06 = xr0Var.getMessagesController().M0(Long.valueOf(xr0Var.a));
                    if (M06 != null && !TextUtils.isEmpty(org.telegram.messenger.t3.K(M06, false))) {
                        xr0Var.c.setLink(xr0Var.getMessagesController().V2 + "/" + org.telegram.messenger.t3.K(M06, false) + "?direct");
                        arrayList11.add(org.telegram.ui.Components.r31.u(org.telegram.messenger.bd.M0(2131752387, null)));
                        arrayList11.add(org.telegram.ui.Components.r31.j(5, xr0Var.c));
                        break;
                    }
                }
                break;
            case 17:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                privacySettingsActivity.getClass();
                if (passkeys != null) {
                    privacySettingsActivity.e = passkeys.passkeys;
                    privacySettingsActivity.F0(true);
                    break;
                }
                break;
            case 18:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                si.b bVar3 = profileActivity.K6;
                bVar3.a((Bitmap) obj2);
                jh.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.L6.d();
                break;
            case 19:
                dy0 dy0Var = (dy0) this.b;
                ArrayList arrayList12 = (ArrayList) obj;
                org.telegram.ui.Components.l41 l41Var = dy0Var.f;
                ey0 ey0Var = dy0Var.w;
                ArrayList arrayList13 = ey0Var.p1;
                ci.t4 t4Var = dy0Var.h;
                if (t4Var.getMeasuredHeight() <= 0) {
                    t4Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.q.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(120.0f), TLObject.FLAG_31));
                }
                org.telegram.ui.Components.r31 D = org.telegram.ui.Components.r31.D(t4Var.getMeasuredHeight());
                D.d = -1;
                D.s = true;
                arrayList12.add(D);
                int measuredHeight = (int) ((t4Var.getMeasuredHeight() / org.telegram.messenger.g0.p) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = dy0Var.b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || dy0Var.c != null || dy0Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || dy0Var.c != null) {
                        Context context2 = dy0Var.getContext();
                        int i29 = org.telegram.ui.ActionBar.k6.L6;
                        int i30 = ey0.t1;
                        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context2, i29, 21, 0, 0, false, false, ey0Var.J0);
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = dy0Var.b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            n4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = dy0Var.c;
                            if (tL_reportResultChooseOption != null) {
                                n4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, n4Var, ey0Var.J0);
                        org.telegram.ui.Components.r31 k10 = org.telegram.ui.Components.r31.k(n4Var);
                        k10.d = -2;
                        arrayList12.add(k10);
                        measuredHeight += 40;
                    }
                    if (dy0Var.b != null) {
                        for (int i31 = 0; i31 < dy0Var.b.options.size(); i31++) {
                            org.telegram.ui.Components.r31 r31Var3 = new org.telegram.ui.Components.r31(30);
                            r31Var3.l = dy0Var.b.options.get(i31).text;
                            r31Var3.k = R.drawable.msg_arrowright;
                            r31Var3.d = i31;
                            arrayList12.add(r31Var3);
                            measuredHeight += 50;
                        }
                    } else if (dy0Var.c != null) {
                        for (int i32 = 0; i32 < dy0Var.c.options.size(); i32++) {
                            org.telegram.ui.Components.r31 r31Var4 = new org.telegram.ui.Components.r31(30);
                            r31Var4.l = dy0Var.c.options.get(i32).text;
                            r31Var4.k = R.drawable.msg_arrowright;
                            r31Var4.d = i32;
                            arrayList12.add(r31Var4);
                            measuredHeight += 50;
                        }
                    } else if (dy0Var.d != null) {
                        if (dy0Var.n == null) {
                            Context context3 = dy0Var.getContext();
                            int i33 = ey0.t1;
                            by0 by0Var = new by0(dy0Var, context3, ey0Var.J0);
                            dy0Var.n = by0Var;
                            by0Var.setShowLimitWhenNear(100);
                        }
                        dy0Var.n.d.setHint(org.telegram.messenger.bd.M0(dy0Var.d.optional ? 2131746246 : 2131746252, null));
                        org.telegram.ui.Components.r31 k11 = org.telegram.ui.Components.r31.k(dy0Var.n);
                        k11.d = -3;
                        arrayList12.add(k11);
                        long j10 = ey0Var.r1;
                        if (arrayList13 != null && !arrayList13.isEmpty()) {
                            arrayList12.add(org.telegram.ui.Components.r31.C(org.telegram.messenger.bd.M0(arrayList13.size() > 1 ? 2131746248 : 2131746251, null)));
                        } else if (org.telegram.messenger.m5.E(j10)) {
                            arrayList12.add(org.telegram.ui.Components.r31.C(org.telegram.messenger.bd.M0(2131746247, null)));
                        } else if (org.telegram.messenger.t3.V(org.telegram.messenger.hp.s1(ey0Var.a).M0(Long.valueOf(-j10)))) {
                            arrayList12.add(org.telegram.ui.Components.r31.C(org.telegram.messenger.bd.M0(2131746250, null)));
                        } else {
                            arrayList12.add(org.telegram.ui.Components.r31.C(org.telegram.messenger.bd.M0(2131746249, null)));
                        }
                        if (dy0Var.r == null) {
                            gi.d dVar = new gi.d(dy0Var.getContext(), ey0Var.J0, true);
                            dy0Var.s = dVar;
                            dVar.i(org.telegram.messenger.bd.M0(2131746245, null), false, true);
                            FrameLayout frameLayout = new FrameLayout(dy0Var.getContext());
                            dy0Var.r = frameLayout;
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, frameLayout, ey0Var.J0);
                            dy0Var.r.addView(dy0Var.s, b8.mf.d(-1, 48.0f, org.telegram.messenger.hs.E1, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(dy0Var.getContext());
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, view, ey0Var.J0);
                            dy0Var.r.addView(view, b8.mf.a(-1.0f, 1.0f / org.telegram.messenger.g0.p, 48));
                        }
                        dy0Var.s.setEnabled(dy0Var.d.optional || !TextUtils.isEmpty(dy0Var.n.getText()));
                        dy0Var.s.setOnClickListener(new b40(dy0Var, 29));
                        org.telegram.ui.Components.r31 k12 = org.telegram.ui.Components.r31.k(dy0Var.r);
                        k12.d = -4;
                        arrayList12.add(k12);
                        measuredHeight += org.telegram.messenger.hs.x1;
                    }
                    ((org.telegram.ui.Components.r31) k2.p1.h(1, arrayList12)).j = true;
                    if (ey0Var.m1 && dy0Var.a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(dy0Var.getContext());
                        Drawable mutate = dy0Var.getContext().getResources().getDrawable(R.drawable.greydivider).mutate();
                        org.telegram.ui.ActionBar.r6.y(frameLayout2, mutate, org.telegram.ui.ActionBar.k6.b7, ey0Var.J0, PorterDuff.Mode.MULTIPLY);
                        ColorDrawable colorDrawable = new ColorDrawable(-1);
                        org.telegram.ui.ActionBar.r6.y(frameLayout2, colorDrawable, org.telegram.ui.ActionBar.k6.a7, ey0Var.J0, PorterDuff.Mode.SRC_IN);
                        org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(colorDrawable, mutate, 0, 0);
                        xpVar.x = true;
                        frameLayout2.setBackground(xpVar);
                        org.telegram.ui.Components.s70 s70Var = new org.telegram.ui.Components.s70(dy0Var.getContext(), null);
                        s70Var.setTextSize(1, 14.0f);
                        s70Var.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.bd.M0(2131746243, null), ey0Var.J0, null));
                        org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.A6, ey0Var.J0);
                        s70Var.setGravity(17);
                        frameLayout2.addView(s70Var, b8.mf.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.r31 k13 = org.telegram.ui.Components.r31.k(frameLayout2);
                        k13.d = -3;
                        arrayList12.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (l41Var != null) {
                    int i34 = ey0.t1;
                    if (ey0Var.b.getMeasuredHeight() - org.telegram.messenger.g0.m < org.telegram.messenger.g0.L(measuredHeight)) {
                        l41Var.f3.k1(false);
                        break;
                    } else {
                        Collections.reverse(arrayList12);
                        l41Var.f3.k1(true);
                        break;
                    }
                }
                break;
            case 20:
                ((ArrayList) obj).add(org.telegram.ui.Components.r31.k(((iy0) this.b).Q1));
                break;
            case 21:
                ((ArrayList) obj).add(org.telegram.ui.Components.r31.k(((org.telegram.ui.Components.i20) this.b).R1));
                break;
            case 22:
                ((SecretMediaViewer) this.b).getClass();
                break;
            case 23:
                b(obj, obj2);
                break;
            case 24:
                p11 p11Var = (p11) this.b;
                ArrayList arrayList14 = p11Var.e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                int i35 = p11Var.a;
                ArrayList arrayList15 = p11Var.d;
                if (tL_error3 != null) {
                    if (p11Var.r) {
                        arrayList15.clear();
                        p11Var.r = false;
                    }
                    p11Var.h = true;
                    p11Var.f = false;
                    int size4 = arrayList14.size();
                    while (i12 < size4) {
                        Object obj6 = arrayList14.get(i12);
                        i12++;
                        ((Runnable) obj6).run();
                    }
                    break;
                } else {
                    org.telegram.messenger.hp.s1(i35).Y3(channels_channelparticipants.users, false);
                    org.telegram.messenger.hp.s1(i35).S3(channels_channelparticipants.chats, false);
                    if (p11Var.r) {
                        arrayList15.clear();
                        p11Var.r = false;
                    }
                    ArrayList<TLRPC.ChannelParticipant> arrayList16 = channels_channelparticipants.participants;
                    int size5 = arrayList16.size();
                    int i36 = 0;
                    while (i36 < size5) {
                        TLRPC.ChannelParticipant channelParticipant = arrayList16.get(i36);
                        i36++;
                        TLObject e22 = org.telegram.messenger.hp.s1(i35).e2(org.telegram.messenger.m5.o(channelParticipant.peer));
                        if (e22 != null) {
                            arrayList15.add(e22);
                        }
                    }
                    if (channels_channelparticipants.participants.size() < 30) {
                        p11Var.h = true;
                    }
                    p11Var.f = false;
                    int size6 = arrayList14.size();
                    while (i12 < size6) {
                        Object obj7 = arrayList14.get(i12);
                        i12++;
                        ((Runnable) obj7).run();
                    }
                    break;
                }
            case 25:
                s11 s11Var = (s11) this.b;
                ArrayList arrayList17 = (ArrayList) obj;
                int i37 = s11Var.U1;
                ei.r6 r6Var = s11Var.S1;
                if (r6Var != null) {
                    arrayList17.add(org.telegram.ui.Components.r31.D(org.telegram.messenger.g0.L(16.0f)));
                    ArrayList arrayList18 = r6Var.i;
                    int size7 = arrayList18.size();
                    int i38 = i37;
                    int i39 = 0;
                    while (i39 < size7) {
                        Object obj8 = arrayList18.get(i39);
                        i39++;
                        org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) obj8;
                        int i40 = y41.c;
                        org.telegram.ui.Components.r31 K6 = org.telegram.ui.Components.r31.K(y41.class);
                        K6.u = 1;
                        K6.z = 0;
                        K6.G = ziVar;
                        K6.B = (ziVar == null || (storyItem = ziVar.l) == null) ? -1L : storyItem.id;
                        K6.f = true;
                        K6.v = i37;
                        K6.L(s11Var.T1.containsKey(Integer.valueOf(ziVar.f1())));
                        K6.u = 1;
                        arrayList17.add(K6);
                        i38--;
                        if (i38 == 0) {
                            i38 = i37;
                        }
                    }
                    if (r6Var.k() || !r6Var.r) {
                        while (true) {
                            if (i12 < (i38 <= 0 ? i37 : i38)) {
                                i12++;
                                org.telegram.ui.Components.r31 q10 = org.telegram.ui.Components.r31.q(i12, 34);
                                q10.u = 1;
                                arrayList17.add(q10);
                            }
                        }
                    }
                    arrayList17.add(org.telegram.ui.Components.r31.D(org.telegram.messenger.g0.L(68.0f)));
                    break;
                }
                break;
            case 26:
                c31.f0((c31) this.b, (ArrayList) obj);
                break;
            case 27:
                c(obj, obj2);
                break;
            default:
                w71 w71Var = (w71) this.b;
                si.b bVar4 = w71Var.F;
                Bitmap bitmap3 = (Bitmap) obj2;
                w71Var.r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                w71Var.w = paint2;
                Bitmap bitmap4 = w71Var.r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode2, tileMode2);
                w71Var.s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix2, org.telegram.ui.ActionBar.k6.I.q() ? 0.05f : 0.25f);
                org.telegram.messenger.g0.h(colorMatrix2, org.telegram.ui.ActionBar.k6.I.q() ? -0.02f : -0.04f);
                w71Var.w.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                w71Var.x = new Matrix();
                bVar4.a(bitmap3);
                jh.d.c(bVar4, w71Var.b);
                w71Var.G.d();
                break;
        }
    }
}
