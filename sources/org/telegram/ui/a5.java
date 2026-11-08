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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a5 implements org.telegram.messenger.v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a5(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    private final void b(Object obj, Object obj2) {
        int i7;
        boolean z9;
        boolean z10;
        a21 a21Var = (a21) this.b;
        ArrayList arrayList = (ArrayList) obj;
        z11 z11Var = a21Var.Y1;
        z11 z11Var2 = a21Var.X1;
        TLRPC.User user = a21Var.Q1;
        z11 z11Var3 = a21Var.W1;
        if (z11Var3 != null) {
            ArrayList arrayList2 = z11Var3.d;
            if (z11Var2 == null) {
                return;
            }
            ArrayList arrayList3 = z11Var2.d;
            HashSet hashSet = new HashSet();
            hashSet.add(Long.valueOf(org.telegram.messenger.p10.i(a21Var.a).e()));
            arrayList.add(org.telegram.ui.Components.x31.E(3, org.telegram.messenger.g0.L(64.0f)));
            if (z11Var != null && !TextUtils.isEmpty(z11Var.c.q)) {
                ArrayList arrayList4 = z11Var.d;
                int size = arrayList4.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj3 = arrayList4.get(i10);
                    i10++;
                    TLObject tLObject = (TLObject) obj3;
                    if (!hashSet.contains(Long.valueOf(org.telegram.messenger.m5.d(tLObject)))) {
                        hashSet.add(Long.valueOf(org.telegram.messenger.m5.d(tLObject)));
                        org.telegram.ui.Components.x31 w10 = org.telegram.ui.Components.x31.w(tLObject);
                        w10.L(org.telegram.messenger.m5.d(tLObject) == org.telegram.messenger.m5.d(a21Var.S1));
                        arrayList.add(w10);
                    }
                }
                if (z11Var.f) {
                    arrayList.add(org.telegram.ui.Components.x31.p(29));
                    arrayList.add(org.telegram.ui.Components.x31.p(29));
                    arrayList.add(org.telegram.ui.Components.x31.p(29));
                }
                if (arrayList.size() == 1) {
                    arrayList.add(org.telegram.ui.Components.x31.k(a21Var.V1));
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
                            arrayList.add(org.telegram.ui.Components.x31.r(org.telegram.messenger.id.M0(org.telegram.messenger.t3.V(a21Var.P1) ? 2131752516 : 2131749500, null)));
                            hashSet.add(Long.valueOf(org.telegram.messenger.m5.d(user)));
                            org.telegram.ui.Components.x31 w11 = org.telegram.ui.Components.x31.w(user);
                            i7 = 29;
                            w11.L(org.telegram.messenger.m5.d(user) == org.telegram.messenger.m5.d(a21Var.S1));
                            arrayList.add(w11);
                            z9 = false;
                        }
                    }
                }
            }
            i7 = 29;
            z9 = true;
            int size3 = arrayList2.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj5 = arrayList2.get(i12);
                i12++;
                TLObject tLObject2 = (TLObject) obj5;
                if (!hashSet.contains(Long.valueOf(org.telegram.messenger.m5.d(tLObject2)))) {
                    if (z9) {
                        arrayList.add(org.telegram.ui.Components.x31.r(org.telegram.messenger.id.M0(org.telegram.messenger.t3.V(a21Var.P1) ? 2131752516 : 2131749500, null)));
                        z9 = false;
                    }
                    hashSet.add(Long.valueOf(org.telegram.messenger.m5.d(tLObject2)));
                    org.telegram.ui.Components.x31 w12 = org.telegram.ui.Components.x31.w(tLObject2);
                    w12.L(org.telegram.messenger.m5.d(tLObject2) == org.telegram.messenger.m5.d(a21Var.S1));
                    arrayList.add(w12);
                }
            }
            if (z11Var3.f) {
                arrayList.add(org.telegram.ui.Components.x31.p(i7));
                arrayList.add(org.telegram.ui.Components.x31.p(i7));
                arrayList.add(org.telegram.ui.Components.x31.p(i7));
            }
            if (user == null || hashSet.contains(Long.valueOf(org.telegram.messenger.m5.d(user)))) {
                z10 = true;
            } else {
                arrayList.add(org.telegram.ui.Components.x31.r(org.telegram.messenger.id.M0(org.telegram.messenger.t3.V(a21Var.P1) ? 2131752288 : 2131749429, null)));
                hashSet.add(Long.valueOf(org.telegram.messenger.m5.d(user)));
                org.telegram.ui.Components.x31 w13 = org.telegram.ui.Components.x31.w(user);
                w13.L(org.telegram.messenger.m5.d(user) == org.telegram.messenger.m5.d(a21Var.S1));
                arrayList.add(w13);
                z10 = false;
            }
            int size4 = arrayList3.size();
            int i13 = 0;
            while (i13 < size4) {
                Object obj6 = arrayList3.get(i13);
                i13++;
                TLObject tLObject3 = (TLObject) obj6;
                if (!hashSet.contains(Long.valueOf(org.telegram.messenger.m5.d(tLObject3)))) {
                    if (z10) {
                        arrayList.add(org.telegram.ui.Components.x31.r(org.telegram.messenger.id.M0(org.telegram.messenger.t3.V(a21Var.P1) ? 2131752288 : 2131749429, null)));
                        z10 = false;
                    }
                    hashSet.add(Long.valueOf(org.telegram.messenger.m5.d(tLObject3)));
                    org.telegram.ui.Components.x31 w14 = org.telegram.ui.Components.x31.w(tLObject3);
                    w14.L(org.telegram.messenger.m5.d(tLObject3) == org.telegram.messenger.m5.d(a21Var.S1));
                    arrayList.add(w14);
                }
            }
            if (arrayList3.isEmpty() || !z11Var2.f) {
                return;
            }
            arrayList.add(org.telegram.ui.Components.x31.p(i7));
            arrayList.add(org.telegram.ui.Components.x31.p(i7));
            arrayList.add(org.telegram.ui.Components.x31.p(i7));
        }
    }

    private final void c(Object obj, Object obj2) {
        TL_stories.StoryItem storyItem;
        c21 c21Var = (c21) this.b;
        ArrayList arrayList = (ArrayList) obj;
        int i7 = c21Var.T1;
        di.q6 q6Var = c21Var.R1;
        if (q6Var == null) {
            return;
        }
        arrayList.add(org.telegram.ui.Components.x31.D(org.telegram.messenger.g0.L(16.0f)));
        ArrayList arrayList2 = q6Var.i;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = i7;
        int i12 = 0;
        while (i12 < size) {
            Object obj3 = arrayList2.get(i12);
            i12++;
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj3;
            int i13 = j51.c;
            org.telegram.ui.Components.x31 K = org.telegram.ui.Components.x31.K(j51.class);
            K.u = 1;
            K.z = 0;
            K.G = ijVar;
            K.B = (ijVar == null || (storyItem = ijVar.l) == null) ? -1L : storyItem.id;
            K.f = true;
            K.v = i7;
            K.L(c21Var.S1.containsKey(Integer.valueOf(ijVar.f1())));
            K.u = 1;
            arrayList.add(K);
            i11--;
            if (i11 == 0) {
                i11 = i7;
            }
        }
        if (q6Var.k() || !q6Var.r) {
            while (true) {
                if (i10 >= (i11 <= 0 ? i7 : i11)) {
                    break;
                }
                i10++;
                org.telegram.ui.Components.x31 q10 = org.telegram.ui.Components.x31.q(i10, 34);
                q10.u = 1;
                arrayList.add(q10);
            }
        }
        arrayList.add(org.telegram.ui.Components.x31.D(org.telegram.messenger.g0.L(68.0f)));
    }

    private final void d(Object obj, Object obj2) {
        t31 t31Var = (t31) this.b;
        ArrayList arrayList = (ArrayList) obj;
        LinearLayout linearLayout = t31Var.Q1;
        if (linearLayout != null) {
            arrayList.add(org.telegram.ui.Components.x31.k(linearLayout));
        }
        LinearLayout linearLayout2 = t31Var.R1;
        if (linearLayout2 != null) {
            arrayList.add(org.telegram.ui.Components.x31.k(linearLayout2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        TLRPC.Chat M0;
        o41 o41Var;
        TLRPC.UserProfilePhoto userProfilePhoto;
        int i7 = 6;
        int i10 = 1;
        int i11 = 0;
        switch (this.a) {
            case 0:
                b5 b5Var = (b5) this.b;
                b5Var.w.setBackground(new BitmapDrawable((Bitmap) obj));
                b5Var.x = false;
                ri.b bVar = b5Var.h;
                bVar.a((Bitmap) obj2);
                ih.d.c(bVar, b5Var);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = b5Var.d;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
                    break;
                }
                break;
            case 1:
                i9 i9Var = (i9) this.b;
                ArrayList arrayList = (ArrayList) obj;
                boolean isEmpty = i9Var.G.isEmpty();
                ArrayList arrayList2 = i9Var.y;
                boolean isEmpty2 = arrayList2.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.x31 c10 = org.telegram.ui.Components.x31.c(1, R.drawable.menu_call_create, org.telegram.messenger.id.M0(2131749491, null));
                    c10.q = true;
                    arrayList.add(c10);
                    if (!i9Var.getUserConfig().W) {
                        org.telegram.ui.Components.x31 c11 = org.telegram.ui.Components.x31.c(2, R.drawable.menu_add_tab_24, org.telegram.messenger.id.M0(2131749462, null));
                        c11.q = true;
                        arrayList.add(c11);
                    }
                    arrayList.add(org.telegram.ui.Components.x31.C(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList3 = i9Var.G;
                    int size = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj3 = arrayList3.get(i12);
                        i12++;
                        Long l10 = (Long) obj3;
                        if (l10 != null && (M0 = i9Var.getMessagesController().M0(l10)) != null) {
                            k8 k8Var = new k8(i9Var, 0);
                            int i13 = g9.b;
                            org.telegram.ui.Components.x31 K = org.telegram.ui.Components.x31.K(g9.class);
                            K.G = M0;
                            K.D = k8Var;
                            arrayList.add(K);
                        }
                    }
                    arrayList.add(org.telegram.ui.Components.x31.C(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        Object obj4 = arrayList2.get(i14);
                        i14++;
                        f9 f9Var = (f9) obj4;
                        org.telegram.ui.ActionBar.l1 l1Var = new org.telegram.ui.ActionBar.l1(i7, i9Var, f9Var);
                        int i15 = d9.b;
                        org.telegram.ui.Components.x31 K2 = org.telegram.ui.Components.x31.K(d9.class);
                        K2.G = f9Var;
                        K2.D = l1Var;
                        K2.L(i9Var.k0(f9Var.c));
                        arrayList.add(K2);
                    }
                    if (!i9Var.F) {
                        arrayList.add(org.telegram.ui.Components.x31.q(-1, 8));
                        arrayList.add(org.telegram.ui.Components.x31.q(-2, 8));
                        arrayList.add(org.telegram.ui.Components.x31.q(-3, 8));
                        break;
                    }
                }
                break;
            case 2:
                zd zdVar = (zd) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                zdVar.R0 = -1;
                TLRPC.Chat M02 = org.telegram.messenger.qp.s1(zdVar.o0).M0(Long.valueOf(-zdVar.p0));
                TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(zdVar.o0).N0(-zdVar.p0);
                int i16 = N0 != null ? N0.stats_dc : -1;
                if (zdVar.b1) {
                    arrayList4.add(org.telegram.ui.Components.x31.g(zdVar.s0));
                    o41 o41Var2 = zdVar.l1;
                    if (o41Var2 != null && !o41Var2.l) {
                        arrayList4.add(org.telegram.ui.Components.x31.h(5, i16, o41Var2));
                        arrayList4.add(org.telegram.ui.Components.x31.B(-1, null));
                    }
                    o41 o41Var3 = zdVar.m1;
                    if (o41Var3 != null && !o41Var3.l) {
                        arrayList4.add(org.telegram.ui.Components.x31.h(2, i16, o41Var3));
                        arrayList4.add(org.telegram.ui.Components.x31.B(-2, null));
                    }
                }
                if (zdVar.c1 && (o41Var = zdVar.n1) != null && !o41Var.l) {
                    arrayList4.add(org.telegram.ui.Components.x31.h(2, i16, o41Var));
                    arrayList4.add(org.telegram.ui.Components.x31.B(-3, null));
                }
                if (zdVar.o1) {
                    arrayList4.add(org.telegram.ui.Components.x31.b(org.telegram.messenger.id.M0(2131748386, null)));
                    arrayList4.add(org.telegram.ui.Components.x31.v(zdVar.p1));
                    arrayList4.add(org.telegram.ui.Components.x31.v(zdVar.q1));
                    arrayList4.add(org.telegram.ui.Components.x31.v(zdVar.r1));
                    arrayList4.add(org.telegram.ui.Components.x31.B(-4, zdVar.u0));
                }
                if (M02 != null && M02.creator) {
                    if (zdVar.b1) {
                        arrayList4.add(org.telegram.ui.Components.x31.b(org.telegram.messenger.id.M0(2131748407, null)));
                        arrayList4.add(org.telegram.ui.Components.x31.k(zdVar.w0));
                        arrayList4.add(org.telegram.ui.Components.x31.B(-5, zdVar.t0));
                        int i17 = org.telegram.messenger.qp.s1(zdVar.o0).z4;
                        String M03 = org.telegram.messenger.id.M0(2131748366, null);
                        int i18 = zdVar.r0 < i17 ? i17 : 0;
                        if (i18 > 0) {
                            Context context = org.telegram.messenger.t0.b;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M03);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(0, new org.telegram.ui.ActionBar.u2(i18, context, null, false));
                            wpVar.s = org.telegram.messenger.g0.L(1.0f);
                            spannableStringBuilder.setSpan(wpVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            M03 = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.x31 i19 = org.telegram.ui.Components.x31.i(1, M03);
                        i19.L(zdVar.r0 >= i17 && zdVar.j1);
                        arrayList4.add(i19);
                        arrayList4.add(org.telegram.ui.Components.x31.B(-8, org.telegram.messenger.id.M0(2131748365, null)));
                    }
                    if (zdVar.c1) {
                        arrayList4.add(org.telegram.ui.Components.x31.b(org.telegram.messenger.id.M0(2131748374, null)));
                        arrayList4.add(org.telegram.ui.Components.x31.j(3, zdVar.C0));
                        arrayList4.add(org.telegram.ui.Components.x31.B(-6, zdVar.v0));
                    }
                }
                if (org.telegram.messenger.t3.V(org.telegram.messenger.qp.s1(zdVar.o0).M0(Long.valueOf(-zdVar.p0))) && org.telegram.messenger.qp.s1(zdVar.o0).g6) {
                    arrayList4.add(hi.f.i(4, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ik, zdVar.n0), pn.i0(org.telegram.messenger.id.M0(2131752474, null)), org.telegram.messenger.id.M0(2131752475, null)));
                    arrayList4.add(org.telegram.ui.Components.x31.B(-7, null));
                }
                if (zdVar.a1.a()) {
                    zdVar.R0 = arrayList4.size();
                    arrayList4.add(org.telegram.ui.Components.x31.n(zdVar.T0, -2));
                    break;
                } else {
                    arrayList4.add(org.telegram.ui.Components.x31.B(-10, null));
                    break;
                }
                break;
            case 3:
                td tdVar = (td) this.b;
                ArrayList arrayList5 = (ArrayList) obj;
                vd vdVar = tdVar.f;
                int i20 = tdVar.d;
                int i21 = vd.y;
                ArrayList arrayList6 = i20 == 0 ? vdVar.r : vdVar.n;
                int size3 = arrayList6.size();
                while (i11 < size3) {
                    Object obj5 = arrayList6.get(i11);
                    i11++;
                    int i22 = bi.xc.b;
                    org.telegram.ui.Components.x31 K3 = org.telegram.ui.Components.x31.K(bi.xc.class);
                    K3.G = (TL_stars.StarsTransaction) obj5;
                    K3.q = true;
                    arrayList5.add(K3);
                }
                if (!TextUtils.isEmpty(i20 == 0 ? vdVar.s : vdVar.h)) {
                    arrayList5.add(org.telegram.ui.Components.x31.q(arrayList5.size(), 7));
                    arrayList5.add(org.telegram.ui.Components.x31.q(arrayList5.size(), 7));
                    arrayList5.add(org.telegram.ui.Components.x31.q(arrayList5.size(), 7));
                    break;
                }
                break;
            case 4:
                pn pnVar = (pn) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    pnVar.getClass();
                    org.telegram.ui.Components.hc.a0(pnVar).f0(tL_error, false);
                }
                org.telegram.messenger.g0.E2(pnVar.j0);
                org.telegram.messenger.g0.E2(pnVar.g0);
                org.telegram.messenger.g0.E2(pnVar.i0);
                break;
            case 5:
                org.telegram.messenger.g0.i3(new lp((oq) this.b, i10), 1000L);
                break;
            case 6:
                ((wf.b) this.b).e0(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                break;
            case 7:
                nr nrVar = (nr) this.b;
                ArrayList arrayList7 = (ArrayList) obj;
                TLRPC.User a22 = nrVar.getMessagesController().a2(Long.valueOf(nrVar.H));
                arrayList7.add(org.telegram.ui.Components.x31.k(nrVar.V));
                arrayList7.add(org.telegram.ui.Components.x31.k(nrVar.b));
                arrayList7.add(org.telegram.ui.Components.x31.k(nrVar.c));
                if (TextUtils.isEmpty(nrVar.g0())) {
                    arrayList7.add(org.telegram.ui.Components.x31.C(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131748410, null)), org.telegram.messenger.t10.j(a22, true), "%1$s")));
                } else if (nrVar.K) {
                    arrayList7.add(org.telegram.ui.Components.x31.C(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("MobileVisibleInfo", null, 2131748409, org.telegram.messenger.t10.j(a22, true)))));
                } else {
                    arrayList7.add(org.telegram.ui.Components.x31.C(null));
                }
                if (nrVar.I && nrVar.K) {
                    org.telegram.ui.Components.x31 i23 = org.telegram.ui.Components.x31.i(2, org.telegram.messenger.id.M0(2131754447, null));
                    i23.L(nrVar.X);
                    arrayList7.add(i23);
                    arrayList7.add(org.telegram.ui.Components.x31.C(org.telegram.messenger.id.a0(null, null, 2131754446, org.telegram.messenger.t10.j(a22, true))));
                }
                arrayList7.add(org.telegram.ui.Components.x31.k(nrVar.d));
                arrayList7.add(org.telegram.ui.Components.x31.C(org.telegram.messenger.id.M0(2131754394, null)));
                if (!nrVar.I) {
                    TLRPC.UserFull b22 = nrVar.getMessagesController().b2(nrVar.H);
                    if (b22 != null && b22.birthday == null) {
                        arrayList7.add(org.telegram.ui.Components.x31.k(nrVar.F));
                    }
                    arrayList7.add(org.telegram.ui.Components.x31.k(nrVar.y));
                    arrayList7.add(org.telegram.ui.Components.x31.k(nrVar.D));
                    if (a22 != null && (userProfilePhoto = a22.photo) != null && userProfilePhoto.personal) {
                        arrayList7.add(org.telegram.ui.Components.x31.k(nrVar.E));
                    }
                    arrayList7.add(org.telegram.ui.Components.x31.C(null));
                    org.telegram.ui.Components.x31 e10 = org.telegram.ui.Components.x31.e(1, org.telegram.messenger.id.M0(2131751553, null));
                    e10.r = true;
                    arrayList7.add(e10);
                }
                arrayList7.add(org.telegram.ui.Components.x31.C(null));
                if (nrVar.Y) {
                    org.telegram.messenger.g0.h3(new fr(nrVar, a22, i11));
                    nrVar.Y = false;
                    org.telegram.messenger.g0.i3(new dr(nrVar, i10), 200L);
                    break;
                }
                break;
            case 8:
                ks.a((ks) this.b, (Bitmap) obj, (Bitmap) obj2);
                break;
            case 9:
                gs gsVar = (gs) this.b;
                CharSequence charSequence = (CharSequence) obj;
                org.telegram.messenger.c20 c20Var = (org.telegram.messenger.c20) obj2;
                ks ksVar = gsVar.a;
                is isVar = ksVar.l;
                if (isVar != null) {
                    isVar.u(charSequence, TextUtils.join("", ksVar.o), c20Var != null ? new org.telegram.ui.Components.fx(9, gsVar, c20Var) : null);
                    if (c20Var == null) {
                        ksVar.o();
                        break;
                    }
                }
                break;
            case 10:
                ss ssVar = (ss) this.b;
                ArrayList arrayList8 = (ArrayList) obj;
                arrayList8.add(org.telegram.ui.Components.x31.k(ssVar.P1));
                arrayList8.add(org.telegram.ui.Components.x31.C(null));
                ArrayList arrayList9 = ssVar.S1;
                if (arrayList9 != null && !arrayList9.isEmpty()) {
                    arrayList8.add(org.telegram.ui.Components.x31.u(org.telegram.messenger.id.M0(2131749490, null)));
                    while (i11 < arrayList9.size()) {
                        Long l11 = (Long) arrayList9.get(i11);
                        l11.getClass();
                        TLRPC.User a23 = org.telegram.messenger.qp.s1(ssVar.a).a2(l11);
                        if (a23 == null) {
                            break;
                        } else {
                            int i24 = ah.q.b;
                            org.telegram.ui.Components.x31 K4 = org.telegram.ui.Components.x31.K(ah.q.class);
                            K4.G = a23;
                            K4.L(ssVar.T1.contains(l11));
                            arrayList8.add(K4);
                            i11++;
                        }
                    }
                    break;
                }
                break;
            case 11:
                ww wwVar = (ww) this.b;
                wwVar.P1 = (Long) obj;
                wwVar.g5();
                break;
            case 12:
                ((Runnable) this.b).run();
                break;
            case 13:
                nx nxVar = (nx) this.b;
                ArrayList arrayList10 = (ArrayList) obj;
                String M04 = org.telegram.messenger.id.M0(2131743992, null);
                org.telegram.ui.Components.x31 x31Var = new org.telegram.ui.Components.x31(2);
                x31Var.l = M04;
                x31Var.k = R.raw.topics_top;
                arrayList10.add(x31Var);
                org.telegram.ui.Components.x31 i25 = org.telegram.ui.Components.x31.i(1, org.telegram.messenger.id.M0(2131743993, null));
                i25.L(nxVar.c);
                arrayList10.add(i25);
                if (nxVar.c) {
                    arrayList10.add(org.telegram.ui.Components.x31.C(null));
                    arrayList10.add(org.telegram.ui.Components.x31.u(org.telegram.messenger.id.M0(2131743991, null)));
                    r3 r3Var = new r3(nxVar, i7);
                    int i26 = lx.b;
                    org.telegram.ui.Components.x31 K5 = org.telegram.ui.Components.x31.K(lx.class);
                    K5.d = 2;
                    K5.G = r3Var;
                    K5.z = nxVar.e ? 2 : nxVar.d ? 0 : 1;
                    arrayList10.add(K5);
                    arrayList10.add(org.telegram.ui.Components.x31.C(org.telegram.messenger.id.M0(2131743990, null)));
                    break;
                }
                break;
            case 14:
                p90 p90Var = (p90) this.b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                p90Var.c();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    org.telegram.messenger.qp.s1(p90Var.b).Y3(tL_tones.users, false);
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    if (T != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.s(T.getContext(), tL_tones.tones.get(0), T.getResourceProvider()).show();
                        break;
                    }
                } else if (tL_error2 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error2.text)) {
                        org.telegram.messenger.k5.o(null, 2131754974, p90.d(), R.raw.error, 36);
                        break;
                    } else {
                        p90.d().f0(tL_error2, false);
                        break;
                    }
                }
                break;
            case 15:
                pc0 pc0Var = (pc0) this.b;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                ce0 ce0Var = pc0Var.P;
                pc0Var.I = false;
                if (auth_authorization instanceof TLRPC.TL_auth_authorization) {
                    pc0Var.n();
                    ce0Var.N1(false, true);
                    pc0Var.postDelayed(new q10(27, pc0Var, auth_authorization), 150L);
                    break;
                } else {
                    ce0Var.C1(false, true);
                    if (tL_error3.text.contains("PHONE_NUMBER_INVALID")) {
                        ce0Var.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131749180, "InvalidPhoneNumber"));
                        break;
                    } else if (!tL_error3.text.contains("PHONE_CODE_EMPTY") && !tL_error3.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error3.text.contains("PHONE_CODE_EXPIRED")) {
                            pc0Var.c(true);
                            ce0Var.M1(0, true, null, true);
                            ce0Var.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131752021, "CodeExpired"));
                            break;
                        } else if (tL_error3.text.contains("FIRSTNAME_INVALID")) {
                            ce0Var.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131749183, "InvalidFirstName"));
                            break;
                        } else if (tL_error3.text.contains("LASTNAME_INVALID")) {
                            ce0Var.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131749181, "InvalidLastName"));
                            break;
                        } else {
                            ce0Var.D1(org.telegram.messenger.id.M0(2131746074, null), tL_error3.text);
                            break;
                        }
                    } else {
                        ce0Var.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131749184, "InvalidCode"));
                        break;
                    }
                }
                break;
            case 16:
                zr0 zr0Var = (zr0) this.b;
                ri.b bVar2 = zr0Var.F;
                Bitmap bitmap = (Bitmap) obj2;
                zr0Var.s = (Bitmap) obj;
                Paint paint = new Paint(1);
                zr0Var.x = paint;
                Bitmap bitmap2 = zr0Var.s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                zr0Var.w = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix, org.telegram.ui.ActionBar.k6.I.q() ? 0.05f : 0.25f);
                org.telegram.messenger.g0.h(colorMatrix, org.telegram.ui.ActionBar.k6.I.q() ? -0.02f : -0.04f);
                zr0Var.x.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                zr0Var.y = new Matrix();
                bVar2.a(bitmap);
                ih.d.c(bVar2, zr0Var.c);
                zr0Var.G.d();
                break;
            case 17:
                hs0 hs0Var = (hs0) this.b;
                ArrayList arrayList11 = (ArrayList) obj;
                String M05 = org.telegram.messenger.id.M0(2131754276, null);
                org.telegram.ui.Components.x31 x31Var2 = new org.telegram.ui.Components.x31(2);
                x31Var2.l = M05;
                x31Var2.k = R.raw.bubble;
                arrayList11.add(x31Var2);
                org.telegram.ui.Components.x31 i27 = org.telegram.ui.Components.x31.i(1, org.telegram.messenger.id.M0(2131754277, null));
                i27.L(hs0Var.n);
                arrayList11.add(i27);
                arrayList11.add(org.telegram.ui.Components.x31.B(2, null));
                if (hs0Var.n) {
                    arrayList11.add(org.telegram.ui.Components.x31.u(org.telegram.messenger.id.M0(2131746876, null)));
                    int[] a10 = org.telegram.ui.Cells.t7.a(new int[]{0, 10, 50, 100, org.telegram.messenger.qs.e3, org.telegram.messenger.qs.Z3, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, (int) hs0Var.getMessagesController().I6);
                    go0 go0Var = new go0(r7);
                    org.telegram.ui.Cells.s7 s7Var = new org.telegram.ui.Cells.s7();
                    s7Var.c = a10;
                    s7Var.d = 20;
                    s7Var.e = go0Var;
                    hs0Var.b.d((int) Utilities.k(hs0Var.r, 10000L, 0L), s7Var, new r3(hs0Var, 20));
                    arrayList11.add(org.telegram.ui.Components.x31.j(3, hs0Var.b));
                    arrayList11.add(org.telegram.ui.Components.x31.B(4, hs0Var.r > 0 ? hs0Var.b0() : null));
                    TLRPC.Chat M06 = hs0Var.getMessagesController().M0(Long.valueOf(hs0Var.a));
                    if (M06 != null && !TextUtils.isEmpty(org.telegram.messenger.t3.K(M06, false))) {
                        hs0Var.c.setLink(hs0Var.getMessagesController().U2 + "/" + org.telegram.messenger.t3.K(M06, false) + "?direct");
                        arrayList11.add(org.telegram.ui.Components.x31.u(org.telegram.messenger.id.M0(2131752387, null)));
                        arrayList11.add(org.telegram.ui.Components.x31.j(5, hs0Var.c));
                        break;
                    }
                }
                break;
            case 18:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                privacySettingsActivity.getClass();
                if (passkeys != null) {
                    privacySettingsActivity.e = passkeys.passkeys;
                    privacySettingsActivity.F0(true);
                    break;
                }
                break;
            case 19:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                ri.b bVar3 = profileActivity.J6;
                bVar3.a((Bitmap) obj2);
                ih.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.K6.d();
                break;
            case 20:
                ny0 ny0Var = (ny0) this.b;
                ArrayList arrayList12 = (ArrayList) obj;
                org.telegram.ui.Components.q41 q41Var = ny0Var.f;
                oy0 oy0Var = ny0Var.w;
                ArrayList arrayList13 = oy0Var.o1;
                bi.m5 m5Var = ny0Var.h;
                if (m5Var.getMeasuredHeight() <= 0) {
                    m5Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.q.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(120.0f), TLObject.FLAG_31));
                }
                org.telegram.ui.Components.x31 D = org.telegram.ui.Components.x31.D(m5Var.getMeasuredHeight());
                D.d = -1;
                D.s = true;
                arrayList12.add(D);
                int measuredHeight = (int) ((m5Var.getMeasuredHeight() / org.telegram.messenger.g0.p) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = ny0Var.b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || ny0Var.c != null || ny0Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || ny0Var.c != null) {
                        Context context2 = ny0Var.getContext();
                        int i28 = org.telegram.ui.ActionBar.k6.L6;
                        int i29 = oy0.s1;
                        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context2, i28, 21, 0, 0, false, false, oy0Var.I0);
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = ny0Var.b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            n4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = ny0Var.c;
                            if (tL_reportResultChooseOption != null) {
                                n4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, n4Var, oy0Var.I0);
                        org.telegram.ui.Components.x31 k10 = org.telegram.ui.Components.x31.k(n4Var);
                        k10.d = -2;
                        arrayList12.add(k10);
                        measuredHeight += 40;
                    }
                    if (ny0Var.b != null) {
                        for (int i30 = 0; i30 < ny0Var.b.options.size(); i30++) {
                            org.telegram.ui.Components.x31 x31Var3 = new org.telegram.ui.Components.x31(30);
                            x31Var3.l = ny0Var.b.options.get(i30).text;
                            x31Var3.k = R.drawable.msg_arrowright;
                            x31Var3.d = i30;
                            arrayList12.add(x31Var3);
                            measuredHeight += 50;
                        }
                    } else if (ny0Var.c != null) {
                        for (int i31 = 0; i31 < ny0Var.c.options.size(); i31++) {
                            org.telegram.ui.Components.x31 x31Var4 = new org.telegram.ui.Components.x31(30);
                            x31Var4.l = ny0Var.c.options.get(i31).text;
                            x31Var4.k = R.drawable.msg_arrowright;
                            x31Var4.d = i31;
                            arrayList12.add(x31Var4);
                            measuredHeight += 50;
                        }
                    } else if (ny0Var.d != null) {
                        if (ny0Var.n == null) {
                            Context context3 = ny0Var.getContext();
                            int i32 = oy0.s1;
                            ly0 ly0Var = new ly0(ny0Var, context3, oy0Var.I0);
                            ny0Var.n = ly0Var;
                            ly0Var.setShowLimitWhenNear(100);
                        }
                        ny0Var.n.d.setHint(org.telegram.messenger.id.M0(ny0Var.d.optional ? 2131746239 : 2131746245, null));
                        org.telegram.ui.Components.x31 k11 = org.telegram.ui.Components.x31.k(ny0Var.n);
                        k11.d = -3;
                        arrayList12.add(k11);
                        long j3 = oy0Var.q1;
                        if (arrayList13 != null && !arrayList13.isEmpty()) {
                            arrayList12.add(org.telegram.ui.Components.x31.C(org.telegram.messenger.id.M0(arrayList13.size() > 1 ? 2131746241 : 2131746244, null)));
                        } else if (org.telegram.messenger.m5.E(j3)) {
                            arrayList12.add(org.telegram.ui.Components.x31.C(org.telegram.messenger.id.M0(2131746240, null)));
                        } else if (org.telegram.messenger.t3.V(org.telegram.messenger.qp.s1(oy0Var.a).M0(Long.valueOf(-j3)))) {
                            arrayList12.add(org.telegram.ui.Components.x31.C(org.telegram.messenger.id.M0(2131746243, null)));
                        } else {
                            arrayList12.add(org.telegram.ui.Components.x31.C(org.telegram.messenger.id.M0(2131746242, null)));
                        }
                        if (ny0Var.r == null) {
                            fi.d dVar = new fi.d(ny0Var.getContext(), oy0Var.I0, true);
                            ny0Var.s = dVar;
                            dVar.i(org.telegram.messenger.id.M0(2131746238, null), false, true);
                            FrameLayout frameLayout = new FrameLayout(ny0Var.getContext());
                            ny0Var.r = frameLayout;
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, frameLayout, oy0Var.I0);
                            ny0Var.r.addView(ny0Var.s, c8.ha.d(-1, 48.0f, org.telegram.messenger.qs.E1, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(ny0Var.getContext());
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, view, oy0Var.I0);
                            ny0Var.r.addView(view, c8.ha.a(-1.0f, 1.0f / org.telegram.messenger.g0.p, 48));
                        }
                        ny0Var.s.setEnabled(ny0Var.d.optional || !TextUtils.isEmpty(ny0Var.n.getText()));
                        ny0Var.s.setOnClickListener(new g40(ny0Var, 29));
                        org.telegram.ui.Components.x31 k12 = org.telegram.ui.Components.x31.k(ny0Var.r);
                        k12.d = -4;
                        arrayList12.add(k12);
                        measuredHeight += org.telegram.messenger.qs.x1;
                    }
                    ((org.telegram.ui.Components.x31) jg.g.i(1, arrayList12)).j = true;
                    if (oy0Var.l1 && ny0Var.a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(ny0Var.getContext());
                        Drawable mutate = ny0Var.getContext().getResources().getDrawable(R.drawable.greydivider).mutate();
                        org.telegram.ui.ActionBar.r6.y(frameLayout2, mutate, org.telegram.ui.ActionBar.k6.b7, oy0Var.I0, PorterDuff.Mode.MULTIPLY);
                        ColorDrawable colorDrawable = new ColorDrawable(-1);
                        org.telegram.ui.ActionBar.r6.y(frameLayout2, colorDrawable, org.telegram.ui.ActionBar.k6.a7, oy0Var.I0, PorterDuff.Mode.SRC_IN);
                        org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(colorDrawable, mutate, 0, 0);
                        xpVar.x = true;
                        frameLayout2.setBackground(xpVar);
                        org.telegram.ui.Components.w70 w70Var = new org.telegram.ui.Components.w70(ny0Var.getContext(), null);
                        w70Var.setTextSize(1, 14.0f);
                        w70Var.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.id.M0(2131746236, null), oy0Var.I0, null));
                        org.telegram.ui.ActionBar.r6.V(w70Var, org.telegram.ui.ActionBar.k6.A6, oy0Var.I0);
                        w70Var.setGravity(17);
                        frameLayout2.addView(w70Var, c8.ha.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.x31 k13 = org.telegram.ui.Components.x31.k(frameLayout2);
                        k13.d = -3;
                        arrayList12.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (q41Var != null) {
                    int i33 = oy0.s1;
                    if (oy0Var.b.getMeasuredHeight() - org.telegram.messenger.g0.m < org.telegram.messenger.g0.L(measuredHeight)) {
                        q41Var.e3.k1(false);
                        break;
                    } else {
                        Collections.reverse(arrayList12);
                        q41Var.e3.k1(true);
                        break;
                    }
                }
                break;
            case 21:
                ((ArrayList) obj).add(org.telegram.ui.Components.x31.k(((sy0) this.b).P1));
                break;
            case 22:
                ((ArrayList) obj).add(org.telegram.ui.Components.x31.k(((org.telegram.ui.Components.m20) this.b).Q1));
                break;
            case 23:
                ((SecretMediaViewer) this.b).getClass();
                break;
            case 24:
                b(obj, obj2);
                break;
            case 25:
                z11 z11Var = (z11) this.b;
                ArrayList arrayList14 = z11Var.e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                int i34 = z11Var.a;
                ArrayList arrayList15 = z11Var.d;
                if (tL_error4 != null) {
                    if (z11Var.r) {
                        arrayList15.clear();
                        z11Var.r = false;
                    }
                    z11Var.h = true;
                    z11Var.f = false;
                    int size4 = arrayList14.size();
                    while (i11 < size4) {
                        Object obj6 = arrayList14.get(i11);
                        i11++;
                        ((Runnable) obj6).run();
                    }
                    break;
                } else {
                    org.telegram.messenger.qp.s1(i34).Y3(channels_channelparticipants.users, false);
                    org.telegram.messenger.qp.s1(i34).S3(channels_channelparticipants.chats, false);
                    if (z11Var.r) {
                        arrayList15.clear();
                        z11Var.r = false;
                    }
                    ArrayList<TLRPC.ChannelParticipant> arrayList16 = channels_channelparticipants.participants;
                    int size5 = arrayList16.size();
                    int i35 = 0;
                    while (i35 < size5) {
                        TLRPC.ChannelParticipant channelParticipant = arrayList16.get(i35);
                        i35++;
                        TLObject e22 = org.telegram.messenger.qp.s1(i34).e2(org.telegram.messenger.m5.o(channelParticipant.peer));
                        if (e22 != null) {
                            arrayList15.add(e22);
                        }
                    }
                    if (channels_channelparticipants.participants.size() < 30) {
                        z11Var.h = true;
                    }
                    z11Var.f = false;
                    int size6 = arrayList14.size();
                    while (i11 < size6) {
                        Object obj7 = arrayList14.get(i11);
                        i11++;
                        ((Runnable) obj7).run();
                    }
                    break;
                }
            case 26:
                c(obj, obj2);
                break;
            case 27:
                m31.f0((m31) this.b, (ArrayList) obj);
                break;
            case 28:
                d(obj, obj2);
                break;
            default:
                g81 g81Var = (g81) this.b;
                ri.b bVar4 = g81Var.E;
                Bitmap bitmap3 = (Bitmap) obj2;
                g81Var.r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                g81Var.w = paint2;
                Bitmap bitmap4 = g81Var.r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode2, tileMode2);
                g81Var.s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix2, org.telegram.ui.ActionBar.k6.I.q() ? 0.05f : 0.25f);
                org.telegram.messenger.g0.h(colorMatrix2, org.telegram.ui.ActionBar.k6.I.q() ? -0.02f : -0.04f);
                g81Var.w.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                g81Var.x = new Matrix();
                bVar4.a(bitmap3);
                ih.d.c(bVar4, g81Var.b);
                g81Var.F.d();
                break;
        }
    }
}
