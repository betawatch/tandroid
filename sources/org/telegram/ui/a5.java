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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class a5 implements org.telegram.messenger.s10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a5(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    private final void b(Object obj, Object obj2) {
        int i7;
        boolean z10;
        boolean z11;
        x11 x11Var = (x11) this.b;
        ArrayList arrayList = (ArrayList) obj;
        w11 w11Var = x11Var.c2;
        w11 w11Var2 = x11Var.b2;
        TLRPC.User user = x11Var.U1;
        w11 w11Var3 = x11Var.a2;
        if (w11Var3 != null) {
            ArrayList arrayList2 = w11Var3.d;
            if (w11Var2 == null) {
                return;
            }
            ArrayList arrayList3 = w11Var2.d;
            HashSet hashSet = new HashSet();
            hashSet.add(Long.valueOf(org.telegram.messenger.m10.i(x11Var.a).e()));
            arrayList.add(org.telegram.ui.Components.b41.E(3, org.telegram.messenger.g0.L(64.0f)));
            if (w11Var != null && !TextUtils.isEmpty(w11Var.c.q)) {
                ArrayList arrayList4 = w11Var.d;
                int size = arrayList4.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj3 = arrayList4.get(i10);
                    i10++;
                    TLObject tLObject = (TLObject) obj3;
                    if (!hashSet.contains(Long.valueOf(org.telegram.messenger.m5.d(tLObject)))) {
                        hashSet.add(Long.valueOf(org.telegram.messenger.m5.d(tLObject)));
                        org.telegram.ui.Components.b41 w10 = org.telegram.ui.Components.b41.w(tLObject);
                        w10.L(org.telegram.messenger.m5.d(tLObject) == org.telegram.messenger.m5.d(x11Var.W1));
                        arrayList.add(w10);
                    }
                }
                if (w11Var.f) {
                    arrayList.add(org.telegram.ui.Components.b41.p(29));
                    arrayList.add(org.telegram.ui.Components.b41.p(29));
                    arrayList.add(org.telegram.ui.Components.b41.p(29));
                }
                if (arrayList.size() == 1) {
                    arrayList.add(org.telegram.ui.Components.b41.k(x11Var.Z1));
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
                            arrayList.add(org.telegram.ui.Components.b41.r(org.telegram.messenger.hd.M0(org.telegram.messenger.t3.V(x11Var.T1) ? 2131752516 : 2131749499, null)));
                            hashSet.add(Long.valueOf(org.telegram.messenger.m5.d(user)));
                            org.telegram.ui.Components.b41 w11 = org.telegram.ui.Components.b41.w(user);
                            i7 = 29;
                            w11.L(org.telegram.messenger.m5.d(user) == org.telegram.messenger.m5.d(x11Var.W1));
                            arrayList.add(w11);
                            z10 = false;
                        }
                    }
                }
            }
            i7 = 29;
            z10 = true;
            int size3 = arrayList2.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj5 = arrayList2.get(i12);
                i12++;
                TLObject tLObject2 = (TLObject) obj5;
                if (!hashSet.contains(Long.valueOf(org.telegram.messenger.m5.d(tLObject2)))) {
                    if (z10) {
                        arrayList.add(org.telegram.ui.Components.b41.r(org.telegram.messenger.hd.M0(org.telegram.messenger.t3.V(x11Var.T1) ? 2131752516 : 2131749499, null)));
                        z10 = false;
                    }
                    hashSet.add(Long.valueOf(org.telegram.messenger.m5.d(tLObject2)));
                    org.telegram.ui.Components.b41 w12 = org.telegram.ui.Components.b41.w(tLObject2);
                    w12.L(org.telegram.messenger.m5.d(tLObject2) == org.telegram.messenger.m5.d(x11Var.W1));
                    arrayList.add(w12);
                }
            }
            if (w11Var3.f) {
                arrayList.add(org.telegram.ui.Components.b41.p(i7));
                arrayList.add(org.telegram.ui.Components.b41.p(i7));
                arrayList.add(org.telegram.ui.Components.b41.p(i7));
            }
            if (user == null || hashSet.contains(Long.valueOf(org.telegram.messenger.m5.d(user)))) {
                z11 = true;
            } else {
                arrayList.add(org.telegram.ui.Components.b41.r(org.telegram.messenger.hd.M0(org.telegram.messenger.t3.V(x11Var.T1) ? 2131752288 : 2131749428, null)));
                hashSet.add(Long.valueOf(org.telegram.messenger.m5.d(user)));
                org.telegram.ui.Components.b41 w13 = org.telegram.ui.Components.b41.w(user);
                w13.L(org.telegram.messenger.m5.d(user) == org.telegram.messenger.m5.d(x11Var.W1));
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
                        arrayList.add(org.telegram.ui.Components.b41.r(org.telegram.messenger.hd.M0(org.telegram.messenger.t3.V(x11Var.T1) ? 2131752288 : 2131749428, null)));
                        z11 = false;
                    }
                    hashSet.add(Long.valueOf(org.telegram.messenger.m5.d(tLObject3)));
                    org.telegram.ui.Components.b41 w14 = org.telegram.ui.Components.b41.w(tLObject3);
                    w14.L(org.telegram.messenger.m5.d(tLObject3) == org.telegram.messenger.m5.d(x11Var.W1));
                    arrayList.add(w14);
                }
            }
            if (arrayList3.isEmpty() || !w11Var2.f) {
                return;
            }
            arrayList.add(org.telegram.ui.Components.b41.p(i7));
            arrayList.add(org.telegram.ui.Components.b41.p(i7));
            arrayList.add(org.telegram.ui.Components.b41.p(i7));
        }
    }

    private final void c(Object obj, Object obj2) {
        TL_stories.StoryItem storyItem;
        z11 z11Var = (z11) this.b;
        ArrayList arrayList = (ArrayList) obj;
        int i7 = z11Var.X1;
        fi.k6 k6Var = z11Var.V1;
        if (k6Var == null) {
            return;
        }
        arrayList.add(org.telegram.ui.Components.b41.D(org.telegram.messenger.g0.L(16.0f)));
        ArrayList arrayList2 = k6Var.i;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = i7;
        int i12 = 0;
        while (i12 < size) {
            Object obj3 = arrayList2.get(i12);
            i12++;
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj3;
            int i13 = g51.c;
            org.telegram.ui.Components.b41 K = org.telegram.ui.Components.b41.K(g51.class);
            K.u = 1;
            K.z = 0;
            K.G = gjVar;
            K.B = (gjVar == null || (storyItem = gjVar.l) == null) ? -1L : storyItem.id;
            K.f = true;
            K.v = i7;
            K.L(z11Var.W1.containsKey(Integer.valueOf(gjVar.e1())));
            K.u = 1;
            arrayList.add(K);
            i11--;
            if (i11 == 0) {
                i11 = i7;
            }
        }
        if (k6Var.k() || !k6Var.r) {
            while (true) {
                if (i10 >= (i11 <= 0 ? i7 : i11)) {
                    break;
                }
                i10++;
                org.telegram.ui.Components.b41 q10 = org.telegram.ui.Components.b41.q(i10, 34);
                q10.u = 1;
                arrayList.add(q10);
            }
        }
        arrayList.add(org.telegram.ui.Components.b41.D(org.telegram.messenger.g0.L(68.0f)));
    }

    private final void d(Object obj, Object obj2) {
        r31 r31Var = (r31) this.b;
        ArrayList arrayList = (ArrayList) obj;
        LinearLayout linearLayout = r31Var.U1;
        if (linearLayout != null) {
            arrayList.add(org.telegram.ui.Components.b41.k(linearLayout));
        }
        LinearLayout linearLayout2 = r31Var.V1;
        if (linearLayout2 != null) {
            arrayList.add(org.telegram.ui.Components.b41.k(linearLayout2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.s10
    public final void a(Object obj, Object obj2) {
        TLRPC.Chat M0;
        l41 l41Var;
        TLRPC.UserProfilePhoto userProfilePhoto;
        int i7 = 8;
        int i10 = 14;
        char c10 = 1;
        char c11 = 1;
        int i11 = 0;
        switch (this.a) {
            case 0:
                b5 b5Var = (b5) this.b;
                b5Var.w.setBackground(new BitmapDrawable((Bitmap) obj));
                b5Var.x = false;
                ui.b bVar = b5Var.h;
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
                boolean isEmpty = i9Var.H.isEmpty();
                ArrayList arrayList2 = i9Var.y;
                boolean isEmpty2 = arrayList2.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.b41 c12 = org.telegram.ui.Components.b41.c(1, R.drawable.menu_call_create, org.telegram.messenger.hd.M0(2131749490, null));
                    c12.q = true;
                    arrayList.add(c12);
                    if (!i9Var.getUserConfig().X) {
                        org.telegram.ui.Components.b41 c13 = org.telegram.ui.Components.b41.c(2, R.drawable.menu_add_tab_24, org.telegram.messenger.hd.M0(2131749461, null));
                        c13.q = true;
                        arrayList.add(c13);
                    }
                    arrayList.add(org.telegram.ui.Components.b41.C(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList3 = i9Var.H;
                    int size = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj3 = arrayList3.get(i12);
                        i12++;
                        Long l10 = (Long) obj3;
                        if (l10 != null && (M0 = i9Var.getMessagesController().M0(l10)) != null) {
                            l8 l8Var = new l8(i9Var, i11);
                            int i13 = g9.b;
                            org.telegram.ui.Components.b41 K = org.telegram.ui.Components.b41.K(g9.class);
                            K.G = M0;
                            K.D = l8Var;
                            arrayList.add(K);
                        }
                    }
                    arrayList.add(org.telegram.ui.Components.b41.C(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList2.size();
                    while (i11 < size2) {
                        Object obj4 = arrayList2.get(i11);
                        i11++;
                        f9 f9Var = (f9) obj4;
                        org.telegram.messenger.video.e eVar = new org.telegram.messenger.video.e(13, i9Var, f9Var);
                        int i14 = d9.b;
                        org.telegram.ui.Components.b41 K2 = org.telegram.ui.Components.b41.K(d9.class);
                        K2.G = f9Var;
                        K2.D = eVar;
                        K2.L(i9Var.k0(f9Var.c));
                        arrayList.add(K2);
                    }
                    if (!i9Var.G) {
                        arrayList.add(org.telegram.ui.Components.b41.q(-1, 8));
                        arrayList.add(org.telegram.ui.Components.b41.q(-2, 8));
                        arrayList.add(org.telegram.ui.Components.b41.q(-3, 8));
                        break;
                    }
                }
                break;
            case 2:
                xd xdVar = (xd) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                xdVar.S0 = -1;
                TLRPC.Chat M02 = org.telegram.messenger.np.s1(xdVar.p0).M0(Long.valueOf(-xdVar.q0));
                TLRPC.ChatFull N0 = org.telegram.messenger.np.s1(xdVar.p0).N0(-xdVar.q0);
                int i15 = N0 != null ? N0.stats_dc : -1;
                if (xdVar.c1) {
                    arrayList4.add(org.telegram.ui.Components.b41.g(xdVar.t0));
                    l41 l41Var2 = xdVar.m1;
                    if (l41Var2 != null && !l41Var2.l) {
                        arrayList4.add(org.telegram.ui.Components.b41.h(5, i15, l41Var2));
                        arrayList4.add(org.telegram.ui.Components.b41.B(-1, null));
                    }
                    l41 l41Var3 = xdVar.n1;
                    if (l41Var3 != null && !l41Var3.l) {
                        arrayList4.add(org.telegram.ui.Components.b41.h(2, i15, l41Var3));
                        arrayList4.add(org.telegram.ui.Components.b41.B(-2, null));
                    }
                }
                if (xdVar.d1 && (l41Var = xdVar.o1) != null && !l41Var.l) {
                    arrayList4.add(org.telegram.ui.Components.b41.h(2, i15, l41Var));
                    arrayList4.add(org.telegram.ui.Components.b41.B(-3, null));
                }
                if (xdVar.p1) {
                    arrayList4.add(org.telegram.ui.Components.b41.b(org.telegram.messenger.hd.M0(2131748385, null)));
                    arrayList4.add(org.telegram.ui.Components.b41.v(xdVar.q1));
                    arrayList4.add(org.telegram.ui.Components.b41.v(xdVar.r1));
                    arrayList4.add(org.telegram.ui.Components.b41.v(xdVar.s1));
                    arrayList4.add(org.telegram.ui.Components.b41.B(-4, xdVar.v0));
                }
                if (M02 != null && M02.creator) {
                    if (xdVar.c1) {
                        arrayList4.add(org.telegram.ui.Components.b41.b(org.telegram.messenger.hd.M0(2131748406, null)));
                        arrayList4.add(org.telegram.ui.Components.b41.k(xdVar.x0));
                        arrayList4.add(org.telegram.ui.Components.b41.B(-5, xdVar.u0));
                        int i16 = org.telegram.messenger.np.s1(xdVar.p0).A4;
                        String M03 = org.telegram.messenger.hd.M0(2131748365, null);
                        int i17 = xdVar.s0 < i16 ? i16 : 0;
                        if (i17 > 0) {
                            Context context = org.telegram.messenger.t0.b;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M03);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(0, new org.telegram.ui.ActionBar.t2(i17, context, null, false));
                            eqVar.s = org.telegram.messenger.g0.L(1.0f);
                            spannableStringBuilder.setSpan(eqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            M03 = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.b41 i18 = org.telegram.ui.Components.b41.i(1, M03);
                        i18.L(xdVar.s0 >= i16 && xdVar.k1);
                        arrayList4.add(i18);
                        arrayList4.add(org.telegram.ui.Components.b41.B(-8, org.telegram.messenger.hd.M0(2131748364, null)));
                    }
                    if (xdVar.d1) {
                        arrayList4.add(org.telegram.ui.Components.b41.b(org.telegram.messenger.hd.M0(2131748373, null)));
                        arrayList4.add(org.telegram.ui.Components.b41.j(3, xdVar.D0));
                        arrayList4.add(org.telegram.ui.Components.b41.B(-6, xdVar.w0));
                    }
                }
                if (org.telegram.messenger.t3.V(org.telegram.messenger.np.s1(xdVar.p0).M0(Long.valueOf(-xdVar.q0))) && org.telegram.messenger.np.s1(xdVar.p0).h6) {
                    arrayList4.add(ki.g.i(4, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.lk, xdVar.o0), qn.i0(org.telegram.messenger.hd.M0(2131752474, null)), org.telegram.messenger.hd.M0(2131752475, null)));
                    arrayList4.add(org.telegram.ui.Components.b41.B(-7, null));
                }
                if (xdVar.b1.a()) {
                    xdVar.S0 = arrayList4.size();
                    arrayList4.add(org.telegram.ui.Components.b41.n(xdVar.U0, -2));
                    break;
                } else {
                    arrayList4.add(org.telegram.ui.Components.b41.B(-10, null));
                    break;
                }
                break;
            case 3:
                rd rdVar = (rd) this.b;
                ArrayList arrayList5 = (ArrayList) obj;
                td tdVar = rdVar.f;
                int i19 = rdVar.d;
                int i20 = td.y;
                ArrayList arrayList6 = i19 == 0 ? tdVar.r : tdVar.n;
                int size3 = arrayList6.size();
                while (i11 < size3) {
                    Object obj5 = arrayList6.get(i11);
                    i11++;
                    int i21 = di.fb.b;
                    org.telegram.ui.Components.b41 K3 = org.telegram.ui.Components.b41.K(di.fb.class);
                    K3.G = (TL_stars.StarsTransaction) obj5;
                    K3.q = true;
                    arrayList5.add(K3);
                }
                if (!TextUtils.isEmpty(i19 == 0 ? tdVar.s : tdVar.h)) {
                    arrayList5.add(org.telegram.ui.Components.b41.q(arrayList5.size(), 7));
                    arrayList5.add(org.telegram.ui.Components.b41.q(arrayList5.size(), 7));
                    arrayList5.add(org.telegram.ui.Components.b41.q(arrayList5.size(), 7));
                    break;
                }
                break;
            case 4:
                qn qnVar = (qn) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    qnVar.getClass();
                    org.telegram.ui.Components.cc.a0(qnVar).f0(tL_error, false);
                }
                org.telegram.messenger.g0.E2(qnVar.k0);
                org.telegram.messenger.g0.E2(qnVar.h0);
                org.telegram.messenger.g0.E2(qnVar.j0);
                break;
            case 5:
                org.telegram.messenger.g0.i3(new np((qq) this.b, c10 == true ? 1 : 0), 1000L);
                break;
            case 6:
                ((wf.b) this.b).M(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                break;
            case 7:
                pr prVar = (pr) this.b;
                ArrayList arrayList7 = (ArrayList) obj;
                TLRPC.User a22 = prVar.getMessagesController().a2(Long.valueOf(prVar.I));
                arrayList7.add(org.telegram.ui.Components.b41.k(prVar.W));
                arrayList7.add(org.telegram.ui.Components.b41.k(prVar.b));
                arrayList7.add(org.telegram.ui.Components.b41.k(prVar.c));
                if (TextUtils.isEmpty(prVar.g0())) {
                    arrayList7.add(org.telegram.ui.Components.b41.C(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131748409, null)), org.telegram.messenger.q10.j(a22, true), "%1$s")));
                } else if (prVar.L) {
                    arrayList7.add(org.telegram.ui.Components.b41.C(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("MobileVisibleInfo", null, 2131748408, org.telegram.messenger.q10.j(a22, true)))));
                } else {
                    arrayList7.add(org.telegram.ui.Components.b41.C(null));
                }
                if (prVar.J && prVar.L) {
                    org.telegram.ui.Components.b41 i22 = org.telegram.ui.Components.b41.i(2, org.telegram.messenger.hd.M0(2131754447, null));
                    i22.L(prVar.Y);
                    arrayList7.add(i22);
                    arrayList7.add(org.telegram.ui.Components.b41.C(org.telegram.messenger.hd.a0(null, null, 2131754446, org.telegram.messenger.q10.j(a22, true))));
                }
                arrayList7.add(org.telegram.ui.Components.b41.k(prVar.d));
                arrayList7.add(org.telegram.ui.Components.b41.C(org.telegram.messenger.hd.M0(2131754394, null)));
                if (!prVar.J) {
                    TLRPC.UserFull b22 = prVar.getMessagesController().b2(prVar.I);
                    if (b22 != null && b22.birthday == null) {
                        arrayList7.add(org.telegram.ui.Components.b41.k(prVar.G));
                    }
                    arrayList7.add(org.telegram.ui.Components.b41.k(prVar.y));
                    arrayList7.add(org.telegram.ui.Components.b41.k(prVar.E));
                    if (a22 != null && (userProfilePhoto = a22.photo) != null && userProfilePhoto.personal) {
                        arrayList7.add(org.telegram.ui.Components.b41.k(prVar.F));
                    }
                    arrayList7.add(org.telegram.ui.Components.b41.C(null));
                    org.telegram.ui.Components.b41 e10 = org.telegram.ui.Components.b41.e(1, org.telegram.messenger.hd.M0(2131751552, null));
                    e10.r = true;
                    arrayList7.add(e10);
                }
                arrayList7.add(org.telegram.ui.Components.b41.C(null));
                if (prVar.Z) {
                    org.telegram.messenger.g0.h3(new hr(prVar, a22, i11));
                    prVar.Z = false;
                    org.telegram.messenger.g0.i3(new fr(prVar, c11 == true ? 1 : 0), 200L);
                    break;
                }
                break;
            case 8:
                ns.a((ns) this.b, (Bitmap) obj, (Bitmap) obj2);
                break;
            case 9:
                js jsVar = (js) this.b;
                CharSequence charSequence = (CharSequence) obj;
                org.telegram.messenger.z10 z10Var = (org.telegram.messenger.z10) obj2;
                ns nsVar = jsVar.a;
                ls lsVar = nsVar.l;
                if (lsVar != null) {
                    lsVar.y(charSequence, TextUtils.join("", nsVar.o), z10Var != null ? new org.telegram.ui.Components.gh(i10, jsVar, z10Var) : null);
                    if (z10Var == null) {
                        nsVar.o();
                        break;
                    }
                }
                break;
            case 10:
                vs vsVar = (vs) this.b;
                ArrayList arrayList8 = (ArrayList) obj;
                arrayList8.add(org.telegram.ui.Components.b41.k(vsVar.T1));
                arrayList8.add(org.telegram.ui.Components.b41.C(null));
                ArrayList arrayList9 = vsVar.W1;
                if (arrayList9 != null && !arrayList9.isEmpty()) {
                    arrayList8.add(org.telegram.ui.Components.b41.u(org.telegram.messenger.hd.M0(2131749489, null)));
                    while (i11 < arrayList9.size()) {
                        Long l11 = (Long) arrayList9.get(i11);
                        l11.getClass();
                        TLRPC.User a23 = org.telegram.messenger.np.s1(vsVar.a).a2(l11);
                        if (a23 == null) {
                            break;
                        } else {
                            int i23 = ah.q.b;
                            org.telegram.ui.Components.b41 K4 = org.telegram.ui.Components.b41.K(ah.q.class);
                            K4.G = a23;
                            K4.L(vsVar.X1.contains(l11));
                            arrayList8.add(K4);
                            i11++;
                        }
                    }
                    break;
                }
                break;
            case 11:
                yw ywVar = (yw) this.b;
                ywVar.R1 = (Long) obj;
                ywVar.g5();
                break;
            case 12:
                ((Runnable) this.b).run();
                break;
            case 13:
                ox oxVar = (ox) this.b;
                ArrayList arrayList10 = (ArrayList) obj;
                String M04 = org.telegram.messenger.hd.M0(2131743989, null);
                org.telegram.ui.Components.b41 b41Var = new org.telegram.ui.Components.b41(2);
                b41Var.l = M04;
                b41Var.k = R.raw.topics_top;
                arrayList10.add(b41Var);
                org.telegram.ui.Components.b41 i24 = org.telegram.ui.Components.b41.i(1, org.telegram.messenger.hd.M0(2131743990, null));
                i24.L(oxVar.c);
                arrayList10.add(i24);
                if (oxVar.c) {
                    arrayList10.add(org.telegram.ui.Components.b41.C(null));
                    arrayList10.add(org.telegram.ui.Components.b41.u(org.telegram.messenger.hd.M0(2131743988, null)));
                    r3 r3Var = new r3(oxVar, 6);
                    int i25 = mx.b;
                    org.telegram.ui.Components.b41 K5 = org.telegram.ui.Components.b41.K(mx.class);
                    K5.d = 2;
                    K5.G = r3Var;
                    K5.z = oxVar.e ? 2 : oxVar.d ? 0 : 1;
                    arrayList10.add(K5);
                    arrayList10.add(org.telegram.ui.Components.b41.C(org.telegram.messenger.hd.M0(2131743987, null)));
                    break;
                }
                break;
            case 14:
                q90 q90Var = (q90) this.b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                q90Var.c();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    org.telegram.messenger.np.s1(q90Var.b).Y3(tL_tones.users, false);
                    org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                    if (T != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.q(T.getContext(), tL_tones.tones.get(0), T.getResourceProvider()).show();
                        break;
                    }
                } else if (tL_error2 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error2.text)) {
                        org.telegram.messenger.k5.n(null, 2131754974, q90.d(), R.raw.error, 36);
                        break;
                    } else {
                        q90.d().f0(tL_error2, false);
                        break;
                    }
                }
                break;
            case 15:
                oc0 oc0Var = (oc0) this.b;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                ce0 ce0Var = oc0Var.Q;
                oc0Var.J = false;
                if (auth_authorization instanceof TLRPC.TL_auth_authorization) {
                    oc0Var.n();
                    ce0Var.N1(false, true);
                    oc0Var.postDelayed(new g50(23, oc0Var, auth_authorization), 150L);
                    break;
                } else {
                    ce0Var.C1(false, true);
                    if (tL_error3.text.contains("PHONE_NUMBER_INVALID")) {
                        ce0Var.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131749179, "InvalidPhoneNumber"));
                        break;
                    } else if (!tL_error3.text.contains("PHONE_CODE_EMPTY") && !tL_error3.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error3.text.contains("PHONE_CODE_EXPIRED")) {
                            oc0Var.c(true);
                            ce0Var.M1(0, true, null, true);
                            ce0Var.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131752021, "CodeExpired"));
                            break;
                        } else if (tL_error3.text.contains("FIRSTNAME_INVALID")) {
                            ce0Var.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131749182, "InvalidFirstName"));
                            break;
                        } else if (tL_error3.text.contains("LASTNAME_INVALID")) {
                            ce0Var.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131749180, "InvalidLastName"));
                            break;
                        } else {
                            ce0Var.D1(org.telegram.messenger.hd.M0(2131746071, null), tL_error3.text);
                            break;
                        }
                    } else {
                        ce0Var.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131749183, "InvalidCode"));
                        break;
                    }
                }
            case 16:
                xr0 xr0Var = (xr0) this.b;
                ui.b bVar2 = xr0Var.G;
                Bitmap bitmap = (Bitmap) obj2;
                xr0Var.s = (Bitmap) obj;
                Paint paint = new Paint(1);
                xr0Var.x = paint;
                Bitmap bitmap2 = xr0Var.s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                xr0Var.w = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix, org.telegram.ui.ActionBar.j6.I.q() ? 0.05f : 0.25f);
                org.telegram.messenger.g0.h(colorMatrix, org.telegram.ui.ActionBar.j6.I.q() ? -0.02f : -0.04f);
                xr0Var.x.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                xr0Var.y = new Matrix();
                bVar2.a(bitmap);
                ih.d.c(bVar2, xr0Var.c);
                xr0Var.H.d();
                break;
            case 17:
                es0 es0Var = (es0) this.b;
                ArrayList arrayList11 = (ArrayList) obj;
                String M05 = org.telegram.messenger.hd.M0(2131754276, null);
                org.telegram.ui.Components.b41 b41Var2 = new org.telegram.ui.Components.b41(2);
                b41Var2.l = M05;
                b41Var2.k = R.raw.bubble;
                arrayList11.add(b41Var2);
                org.telegram.ui.Components.b41 i26 = org.telegram.ui.Components.b41.i(1, org.telegram.messenger.hd.M0(2131754277, null));
                i26.L(es0Var.n);
                arrayList11.add(i26);
                arrayList11.add(org.telegram.ui.Components.b41.B(2, null));
                if (es0Var.n) {
                    arrayList11.add(org.telegram.ui.Components.b41.u(org.telegram.messenger.hd.M0(2131746875, null)));
                    int[] a10 = org.telegram.ui.Cells.s7.a(new int[]{0, 10, 50, 100, org.telegram.messenger.ns.e3, org.telegram.messenger.ns.Z3, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, (int) es0Var.getMessagesController().J6);
                    t70 t70Var = new t70(i7);
                    org.telegram.ui.Cells.r7 r7Var = new org.telegram.ui.Cells.r7();
                    r7Var.c = a10;
                    r7Var.d = 20;
                    r7Var.e = t70Var;
                    es0Var.b.d((int) Utilities.k(es0Var.r, 10000L, 0L), r7Var, new r3(es0Var, 20));
                    arrayList11.add(org.telegram.ui.Components.b41.j(3, es0Var.b));
                    arrayList11.add(org.telegram.ui.Components.b41.B(4, es0Var.r > 0 ? es0Var.b0() : null));
                    TLRPC.Chat M06 = es0Var.getMessagesController().M0(Long.valueOf(es0Var.a));
                    if (M06 != null && !TextUtils.isEmpty(org.telegram.messenger.t3.K(M06, false))) {
                        es0Var.c.setLink(es0Var.getMessagesController().V2 + "/" + org.telegram.messenger.t3.K(M06, false) + "?direct");
                        arrayList11.add(org.telegram.ui.Components.b41.u(org.telegram.messenger.hd.M0(2131752387, null)));
                        arrayList11.add(org.telegram.ui.Components.b41.j(5, es0Var.c));
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
                ui.b bVar3 = profileActivity.O6;
                bVar3.a((Bitmap) obj2);
                ih.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.P6.d();
                break;
            case 20:
                ly0 ly0Var = (ly0) this.b;
                ArrayList arrayList12 = (ArrayList) obj;
                org.telegram.ui.Components.u41 u41Var = ly0Var.f;
                my0 my0Var = ly0Var.w;
                ArrayList arrayList13 = my0Var.s1;
                di.k4 k4Var = ly0Var.h;
                if (k4Var.getMeasuredHeight() <= 0) {
                    k4Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.q.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(120.0f), TLObject.FLAG_31));
                }
                org.telegram.ui.Components.b41 D = org.telegram.ui.Components.b41.D(k4Var.getMeasuredHeight());
                D.d = -1;
                D.s = true;
                arrayList12.add(D);
                int measuredHeight = (int) ((k4Var.getMeasuredHeight() / org.telegram.messenger.g0.p) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = ly0Var.b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || ly0Var.c != null || ly0Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || ly0Var.c != null) {
                        Context context2 = ly0Var.getContext();
                        int i27 = org.telegram.ui.ActionBar.j6.L6;
                        int i28 = my0.w1;
                        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context2, i27, 21, 0, 0, false, false, my0Var.J0);
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = ly0Var.b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            n4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = ly0Var.c;
                            if (tL_reportResultChooseOption != null) {
                                n4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.h5, n4Var, my0Var.J0);
                        org.telegram.ui.Components.b41 k10 = org.telegram.ui.Components.b41.k(n4Var);
                        k10.d = -2;
                        arrayList12.add(k10);
                        measuredHeight += 40;
                    }
                    if (ly0Var.b != null) {
                        for (int i29 = 0; i29 < ly0Var.b.options.size(); i29++) {
                            org.telegram.ui.Components.b41 b41Var3 = new org.telegram.ui.Components.b41(30);
                            b41Var3.l = ly0Var.b.options.get(i29).text;
                            b41Var3.k = R.drawable.msg_arrowright;
                            b41Var3.d = i29;
                            arrayList12.add(b41Var3);
                            measuredHeight += 50;
                        }
                    } else if (ly0Var.c != null) {
                        for (int i30 = 0; i30 < ly0Var.c.options.size(); i30++) {
                            org.telegram.ui.Components.b41 b41Var4 = new org.telegram.ui.Components.b41(30);
                            b41Var4.l = ly0Var.c.options.get(i30).text;
                            b41Var4.k = R.drawable.msg_arrowright;
                            b41Var4.d = i30;
                            arrayList12.add(b41Var4);
                            measuredHeight += 50;
                        }
                    } else if (ly0Var.d != null) {
                        if (ly0Var.n == null) {
                            Context context3 = ly0Var.getContext();
                            int i31 = my0.w1;
                            jy0 jy0Var = new jy0(ly0Var, context3, my0Var.J0);
                            ly0Var.n = jy0Var;
                            jy0Var.setShowLimitWhenNear(100);
                        }
                        ly0Var.n.d.setHint(org.telegram.messenger.hd.M0(ly0Var.d.optional ? 2131746236 : 2131746242, null));
                        org.telegram.ui.Components.b41 k11 = org.telegram.ui.Components.b41.k(ly0Var.n);
                        k11.d = -3;
                        arrayList12.add(k11);
                        long j3 = my0Var.u1;
                        if (arrayList13 != null && !arrayList13.isEmpty()) {
                            arrayList12.add(org.telegram.ui.Components.b41.C(org.telegram.messenger.hd.M0(arrayList13.size() > 1 ? 2131746238 : 2131746241, null)));
                        } else if (org.telegram.messenger.m5.E(j3)) {
                            arrayList12.add(org.telegram.ui.Components.b41.C(org.telegram.messenger.hd.M0(2131746237, null)));
                        } else if (org.telegram.messenger.t3.V(org.telegram.messenger.np.s1(my0Var.a).M0(Long.valueOf(-j3)))) {
                            arrayList12.add(org.telegram.ui.Components.b41.C(org.telegram.messenger.hd.M0(2131746240, null)));
                        } else {
                            arrayList12.add(org.telegram.ui.Components.b41.C(org.telegram.messenger.hd.M0(2131746239, null)));
                        }
                        if (ly0Var.r == null) {
                            hi.d dVar = new hi.d(ly0Var.getContext(), my0Var.J0, true);
                            ly0Var.s = dVar;
                            dVar.i(org.telegram.messenger.hd.M0(2131746235, null), false, true);
                            FrameLayout frameLayout = new FrameLayout(ly0Var.getContext());
                            ly0Var.r = frameLayout;
                            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.h5, frameLayout, my0Var.J0);
                            ly0Var.r.addView(ly0Var.s, c8.ja.d(-1, 48.0f, org.telegram.messenger.ns.E1, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(ly0Var.getContext());
                            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d7, view, my0Var.J0);
                            ly0Var.r.addView(view, c8.ja.a(-1.0f, 1.0f / org.telegram.messenger.g0.p, 48));
                        }
                        ly0Var.s.setEnabled(ly0Var.d.optional || !TextUtils.isEmpty(ly0Var.n.getText()));
                        ly0Var.s.setOnClickListener(new g40(ly0Var, 29));
                        org.telegram.ui.Components.b41 k12 = org.telegram.ui.Components.b41.k(ly0Var.r);
                        k12.d = -4;
                        arrayList12.add(k12);
                        measuredHeight += org.telegram.messenger.ns.x1;
                    }
                    ((org.telegram.ui.Components.b41) i5.c.h(1, arrayList12)).j = true;
                    if (my0Var.p1 && ly0Var.a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(ly0Var.getContext());
                        Drawable mutate = ly0Var.getContext().getResources().getDrawable(R.drawable.greydivider).mutate();
                        org.telegram.ui.ActionBar.q6.x(frameLayout2, mutate, org.telegram.ui.ActionBar.j6.b7, my0Var.J0, PorterDuff.Mode.MULTIPLY);
                        ColorDrawable colorDrawable = new ColorDrawable(-1);
                        org.telegram.ui.ActionBar.q6.x(frameLayout2, colorDrawable, org.telegram.ui.ActionBar.j6.a7, my0Var.J0, PorterDuff.Mode.SRC_IN);
                        org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(colorDrawable, mutate, 0, 0);
                        fqVar.x = true;
                        frameLayout2.setBackground(fqVar);
                        org.telegram.ui.Components.z70 z70Var = new org.telegram.ui.Components.z70(ly0Var.getContext(), null);
                        z70Var.setTextSize(1, 14.0f);
                        z70Var.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.hd.M0(2131746233, null), my0Var.J0, null));
                        org.telegram.ui.ActionBar.q6.U(z70Var, org.telegram.ui.ActionBar.j6.A6, my0Var.J0);
                        z70Var.setGravity(17);
                        frameLayout2.addView(z70Var, c8.ja.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.b41 k13 = org.telegram.ui.Components.b41.k(frameLayout2);
                        k13.d = -3;
                        arrayList12.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (u41Var != null) {
                    int i32 = my0.w1;
                    if (my0Var.b.getMeasuredHeight() - org.telegram.messenger.g0.m < org.telegram.messenger.g0.L(measuredHeight)) {
                        u41Var.f3.k1(false);
                        break;
                    } else {
                        Collections.reverse(arrayList12);
                        u41Var.f3.k1(true);
                        break;
                    }
                }
                break;
            case 21:
                ((ArrayList) obj).add(org.telegram.ui.Components.b41.k(((qy0) this.b).T1));
                break;
            case 22:
                ((ArrayList) obj).add(org.telegram.ui.Components.b41.k(((org.telegram.ui.Components.p20) this.b).U1));
                break;
            case 23:
                ((SecretMediaViewer) this.b).getClass();
                break;
            case 24:
                b(obj, obj2);
                break;
            case 25:
                w11 w11Var = (w11) this.b;
                ArrayList arrayList14 = w11Var.e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                int i33 = w11Var.a;
                ArrayList arrayList15 = w11Var.d;
                if (tL_error4 != null) {
                    if (w11Var.r) {
                        arrayList15.clear();
                        w11Var.r = false;
                    }
                    w11Var.h = true;
                    w11Var.f = false;
                    int size4 = arrayList14.size();
                    while (i11 < size4) {
                        Object obj6 = arrayList14.get(i11);
                        i11++;
                        ((Runnable) obj6).run();
                    }
                    break;
                } else {
                    org.telegram.messenger.np.s1(i33).Y3(channels_channelparticipants.users, false);
                    org.telegram.messenger.np.s1(i33).S3(channels_channelparticipants.chats, false);
                    if (w11Var.r) {
                        arrayList15.clear();
                        w11Var.r = false;
                    }
                    ArrayList<TLRPC.ChannelParticipant> arrayList16 = channels_channelparticipants.participants;
                    int size5 = arrayList16.size();
                    int i34 = 0;
                    while (i34 < size5) {
                        TLRPC.ChannelParticipant channelParticipant = arrayList16.get(i34);
                        i34++;
                        TLObject e22 = org.telegram.messenger.np.s1(i33).e2(org.telegram.messenger.m5.o(channelParticipant.peer));
                        if (e22 != null) {
                            arrayList15.add(e22);
                        }
                    }
                    if (channels_channelparticipants.participants.size() < 30) {
                        w11Var.h = true;
                    }
                    w11Var.f = false;
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
                k31.f0((k31) this.b, (ArrayList) obj);
                break;
            case 28:
                d(obj, obj2);
                break;
            default:
                e81 e81Var = (e81) this.b;
                ui.b bVar4 = e81Var.F;
                Bitmap bitmap3 = (Bitmap) obj2;
                e81Var.r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                e81Var.w = paint2;
                Bitmap bitmap4 = e81Var.r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode2, tileMode2);
                e81Var.s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix2, org.telegram.ui.ActionBar.j6.I.q() ? 0.05f : 0.25f);
                org.telegram.messenger.g0.h(colorMatrix2, org.telegram.ui.ActionBar.j6.I.q() ? -0.02f : -0.04f);
                e81Var.w.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                e81Var.x = new Matrix();
                bVar4.a(bitmap3);
                ih.d.c(bVar4, e81Var.b);
                e81Var.G.d();
                break;
        }
    }
}
