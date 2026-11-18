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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a5 implements org.telegram.messenger.q10 {
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
        b21 b21Var = (b21) this.b;
        ArrayList arrayList = (ArrayList) obj;
        a21 a21Var = b21Var.c2;
        a21 a21Var2 = b21Var.b2;
        TLRPC.User user = b21Var.U1;
        a21 a21Var3 = b21Var.a2;
        if (a21Var3 != null) {
            ArrayList arrayList2 = a21Var3.d;
            if (a21Var2 == null) {
                return;
            }
            ArrayList arrayList3 = a21Var2.d;
            HashSet hashSet = new HashSet();
            hashSet.add(Long.valueOf(org.telegram.messenger.j10.i(b21Var.a).e()));
            arrayList.add(org.telegram.ui.Components.l41.E(3, org.telegram.messenger.g0.L(64.0f)));
            if (a21Var != null && !TextUtils.isEmpty(a21Var.c.q)) {
                ArrayList arrayList4 = a21Var.d;
                int size = arrayList4.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj3 = arrayList4.get(i10);
                    i10++;
                    TLObject tLObject = (TLObject) obj3;
                    if (!hashSet.contains(Long.valueOf(org.telegram.messenger.n5.d(tLObject)))) {
                        hashSet.add(Long.valueOf(org.telegram.messenger.n5.d(tLObject)));
                        org.telegram.ui.Components.l41 w10 = org.telegram.ui.Components.l41.w(tLObject);
                        w10.L(org.telegram.messenger.n5.d(tLObject) == org.telegram.messenger.n5.d(b21Var.W1));
                        arrayList.add(w10);
                    }
                }
                if (a21Var.f) {
                    arrayList.add(org.telegram.ui.Components.l41.p(29));
                    arrayList.add(org.telegram.ui.Components.l41.p(29));
                    arrayList.add(org.telegram.ui.Components.l41.p(29));
                }
                if (arrayList.size() == 1) {
                    arrayList.add(org.telegram.ui.Components.l41.k(b21Var.Z1));
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
                    if (org.telegram.messenger.n5.d((TLObject) obj4) == org.telegram.messenger.n5.d(user)) {
                        if (!hashSet.contains(Long.valueOf(org.telegram.messenger.n5.d(user)))) {
                            arrayList.add(org.telegram.ui.Components.l41.r(org.telegram.messenger.gd.M0(org.telegram.messenger.v3.V(b21Var.T1) ? 2131752505 : 2131749307, null)));
                            hashSet.add(Long.valueOf(org.telegram.messenger.n5.d(user)));
                            org.telegram.ui.Components.l41 w11 = org.telegram.ui.Components.l41.w(user);
                            i7 = 29;
                            w11.L(org.telegram.messenger.n5.d(user) == org.telegram.messenger.n5.d(b21Var.W1));
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
                if (!hashSet.contains(Long.valueOf(org.telegram.messenger.n5.d(tLObject2)))) {
                    if (z10) {
                        arrayList.add(org.telegram.ui.Components.l41.r(org.telegram.messenger.gd.M0(org.telegram.messenger.v3.V(b21Var.T1) ? 2131752505 : 2131749307, null)));
                        z10 = false;
                    }
                    hashSet.add(Long.valueOf(org.telegram.messenger.n5.d(tLObject2)));
                    org.telegram.ui.Components.l41 w12 = org.telegram.ui.Components.l41.w(tLObject2);
                    w12.L(org.telegram.messenger.n5.d(tLObject2) == org.telegram.messenger.n5.d(b21Var.W1));
                    arrayList.add(w12);
                }
            }
            if (a21Var3.f) {
                arrayList.add(org.telegram.ui.Components.l41.p(i7));
                arrayList.add(org.telegram.ui.Components.l41.p(i7));
                arrayList.add(org.telegram.ui.Components.l41.p(i7));
            }
            if (user == null || hashSet.contains(Long.valueOf(org.telegram.messenger.n5.d(user)))) {
                z11 = true;
            } else {
                arrayList.add(org.telegram.ui.Components.l41.r(org.telegram.messenger.gd.M0(org.telegram.messenger.v3.V(b21Var.T1) ? 2131752277 : 2131749236, null)));
                hashSet.add(Long.valueOf(org.telegram.messenger.n5.d(user)));
                org.telegram.ui.Components.l41 w13 = org.telegram.ui.Components.l41.w(user);
                w13.L(org.telegram.messenger.n5.d(user) == org.telegram.messenger.n5.d(b21Var.W1));
                arrayList.add(w13);
                z11 = false;
            }
            int size4 = arrayList3.size();
            int i13 = 0;
            while (i13 < size4) {
                Object obj6 = arrayList3.get(i13);
                i13++;
                TLObject tLObject3 = (TLObject) obj6;
                if (!hashSet.contains(Long.valueOf(org.telegram.messenger.n5.d(tLObject3)))) {
                    if (z11) {
                        arrayList.add(org.telegram.ui.Components.l41.r(org.telegram.messenger.gd.M0(org.telegram.messenger.v3.V(b21Var.T1) ? 2131752277 : 2131749236, null)));
                        z11 = false;
                    }
                    hashSet.add(Long.valueOf(org.telegram.messenger.n5.d(tLObject3)));
                    org.telegram.ui.Components.l41 w14 = org.telegram.ui.Components.l41.w(tLObject3);
                    w14.L(org.telegram.messenger.n5.d(tLObject3) == org.telegram.messenger.n5.d(b21Var.W1));
                    arrayList.add(w14);
                }
            }
            if (arrayList3.isEmpty() || !a21Var2.f) {
                return;
            }
            arrayList.add(org.telegram.ui.Components.l41.p(i7));
            arrayList.add(org.telegram.ui.Components.l41.p(i7));
            arrayList.add(org.telegram.ui.Components.l41.p(i7));
        }
    }

    private final void c(Object obj, Object obj2) {
        TL_stories.StoryItem storyItem;
        d21 d21Var = (d21) this.b;
        ArrayList arrayList = (ArrayList) obj;
        int i7 = d21Var.X1;
        fi.h6 h6Var = d21Var.V1;
        if (h6Var == null) {
            return;
        }
        arrayList.add(org.telegram.ui.Components.l41.D(org.telegram.messenger.g0.L(16.0f)));
        ArrayList arrayList2 = h6Var.i;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = i7;
        int i12 = 0;
        while (i12 < size) {
            Object obj3 = arrayList2.get(i12);
            i12++;
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj3;
            int i13 = j51.c;
            org.telegram.ui.Components.l41 K = org.telegram.ui.Components.l41.K(j51.class);
            K.v = 1;
            K.A = 0;
            K.H = fjVar;
            K.C = (fjVar == null || (storyItem = fjVar.l) == null) ? -1L : storyItem.id;
            K.f = true;
            K.w = i7;
            K.L(d21Var.W1.containsKey(Integer.valueOf(fjVar.e1())));
            K.v = 1;
            arrayList.add(K);
            i11--;
            if (i11 == 0) {
                i11 = i7;
            }
        }
        if (h6Var.k() || !h6Var.r) {
            while (true) {
                if (i10 >= (i11 <= 0 ? i7 : i11)) {
                    break;
                }
                i10++;
                org.telegram.ui.Components.l41 q10 = org.telegram.ui.Components.l41.q(i10, 34);
                q10.v = 1;
                arrayList.add(q10);
            }
        }
        arrayList.add(org.telegram.ui.Components.l41.D(org.telegram.messenger.g0.L(68.0f)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        TLRPC.Chat O0;
        o41 o41Var;
        TLRPC.UserProfilePhoto userProfilePhoto;
        int i7 = 9;
        int i10 = 1;
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
                boolean isEmpty = i9Var.G.isEmpty();
                ArrayList arrayList2 = i9Var.x;
                boolean isEmpty2 = arrayList2.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.l41 c10 = org.telegram.ui.Components.l41.c(1, R.drawable.menu_call_create, org.telegram.messenger.gd.M0(2131749298, null));
                    c10.r = true;
                    arrayList.add(c10);
                    arrayList.add(org.telegram.ui.Components.l41.C(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList3 = i9Var.G;
                    int size = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj3 = arrayList3.get(i12);
                        i12++;
                        Long l10 = (Long) obj3;
                        if (l10 != null && (O0 = i9Var.getMessagesController().O0(l10)) != null) {
                            l8 l8Var = new l8(i9Var, 0);
                            int i13 = g9.b;
                            org.telegram.ui.Components.l41 K = org.telegram.ui.Components.l41.K(g9.class);
                            K.H = O0;
                            K.E = l8Var;
                            arrayList.add(K);
                        }
                    }
                    arrayList.add(org.telegram.ui.Components.l41.C(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        Object obj4 = arrayList2.get(i14);
                        i14++;
                        f9 f9Var = (f9) obj4;
                        ni.b bVar2 = new ni.b(i7, i9Var, f9Var);
                        int i15 = d9.b;
                        org.telegram.ui.Components.l41 K2 = org.telegram.ui.Components.l41.K(d9.class);
                        K2.H = f9Var;
                        K2.E = bVar2;
                        K2.L(i9Var.k0(f9Var.c));
                        arrayList.add(K2);
                    }
                    if (!i9Var.F) {
                        arrayList.add(org.telegram.ui.Components.l41.q(-1, 8));
                        arrayList.add(org.telegram.ui.Components.l41.q(-2, 8));
                        arrayList.add(org.telegram.ui.Components.l41.q(-3, 8));
                        break;
                    }
                }
                break;
            case 2:
                xd xdVar = (xd) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                xdVar.S0 = -1;
                TLRPC.Chat O02 = org.telegram.messenger.mp.u1(xdVar.p0).O0(Long.valueOf(-xdVar.q0));
                TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(xdVar.p0).P0(-xdVar.q0);
                int i16 = P0 != null ? P0.stats_dc : -1;
                if (xdVar.c1) {
                    arrayList4.add(org.telegram.ui.Components.l41.g(xdVar.t0));
                    o41 o41Var2 = xdVar.m1;
                    if (o41Var2 != null && !o41Var2.l) {
                        arrayList4.add(org.telegram.ui.Components.l41.h(5, i16, o41Var2));
                        arrayList4.add(org.telegram.ui.Components.l41.B(-1, null));
                    }
                    o41 o41Var3 = xdVar.n1;
                    if (o41Var3 != null && !o41Var3.l) {
                        arrayList4.add(org.telegram.ui.Components.l41.h(2, i16, o41Var3));
                        arrayList4.add(org.telegram.ui.Components.l41.B(-2, null));
                    }
                }
                if (xdVar.d1 && (o41Var = xdVar.o1) != null && !o41Var.l) {
                    arrayList4.add(org.telegram.ui.Components.l41.h(2, i16, o41Var));
                    arrayList4.add(org.telegram.ui.Components.l41.B(-3, null));
                }
                if (xdVar.p1) {
                    arrayList4.add(org.telegram.ui.Components.l41.b(org.telegram.messenger.gd.M0(2131748193, null)));
                    arrayList4.add(org.telegram.ui.Components.l41.v(xdVar.q1));
                    arrayList4.add(org.telegram.ui.Components.l41.v(xdVar.r1));
                    arrayList4.add(org.telegram.ui.Components.l41.v(xdVar.s1));
                    arrayList4.add(org.telegram.ui.Components.l41.B(-4, xdVar.v0));
                }
                if (O02 != null && O02.creator) {
                    if (xdVar.c1) {
                        arrayList4.add(org.telegram.ui.Components.l41.b(org.telegram.messenger.gd.M0(2131748214, null)));
                        arrayList4.add(org.telegram.ui.Components.l41.k(xdVar.x0));
                        arrayList4.add(org.telegram.ui.Components.l41.B(-5, xdVar.u0));
                        int i17 = org.telegram.messenger.mp.u1(xdVar.p0).C4;
                        String M0 = org.telegram.messenger.gd.M0(2131748173, null);
                        int i18 = xdVar.s0 < i17 ? i17 : 0;
                        if (i18 > 0) {
                            Context context = org.telegram.messenger.t0.b;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.lq lqVar = new org.telegram.ui.Components.lq(0, new org.telegram.ui.ActionBar.w2(i18, context, null, false));
                            lqVar.s = org.telegram.messenger.g0.L(1.0f);
                            spannableStringBuilder.setSpan(lqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            M0 = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.l41 i19 = org.telegram.ui.Components.l41.i(1, M0);
                        i19.L(xdVar.s0 >= i17 && xdVar.k1);
                        arrayList4.add(i19);
                        arrayList4.add(org.telegram.ui.Components.l41.B(-8, org.telegram.messenger.gd.M0(2131748172, null)));
                    }
                    if (xdVar.d1) {
                        arrayList4.add(org.telegram.ui.Components.l41.b(org.telegram.messenger.gd.M0(2131748181, null)));
                        arrayList4.add(org.telegram.ui.Components.l41.j(3, xdVar.D0));
                        arrayList4.add(org.telegram.ui.Components.l41.B(-6, xdVar.w0));
                    }
                }
                if (org.telegram.messenger.v3.V(org.telegram.messenger.mp.u1(xdVar.p0).O0(Long.valueOf(-xdVar.q0))) && org.telegram.messenger.mp.u1(xdVar.p0).j6) {
                    arrayList4.add(ki.g.i(4, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.lk, xdVar.o0), rn.i0(org.telegram.messenger.gd.M0(2131752463, null)), org.telegram.messenger.gd.M0(2131752464, null)));
                    arrayList4.add(org.telegram.ui.Components.l41.B(-7, null));
                }
                if (xdVar.b1.a()) {
                    xdVar.S0 = arrayList4.size();
                    arrayList4.add(org.telegram.ui.Components.l41.n(xdVar.U0, -2));
                    break;
                } else {
                    arrayList4.add(org.telegram.ui.Components.l41.B(-10, null));
                    break;
                }
                break;
            case 3:
                rd rdVar = (rd) this.b;
                ArrayList arrayList5 = (ArrayList) obj;
                td tdVar = rdVar.f;
                int i20 = rdVar.d;
                int i21 = td.y;
                ArrayList arrayList6 = i20 == 0 ? tdVar.r : tdVar.n;
                int size3 = arrayList6.size();
                while (i11 < size3) {
                    Object obj5 = arrayList6.get(i11);
                    i11++;
                    int i22 = di.jb.b;
                    org.telegram.ui.Components.l41 K3 = org.telegram.ui.Components.l41.K(di.jb.class);
                    K3.H = (TL_stars.StarsTransaction) obj5;
                    K3.r = true;
                    arrayList5.add(K3);
                }
                if (!TextUtils.isEmpty(i20 == 0 ? tdVar.s : tdVar.h)) {
                    arrayList5.add(org.telegram.ui.Components.l41.q(arrayList5.size(), 7));
                    arrayList5.add(org.telegram.ui.Components.l41.q(arrayList5.size(), 7));
                    arrayList5.add(org.telegram.ui.Components.l41.q(arrayList5.size(), 7));
                    break;
                }
                break;
            case 4:
                rn rnVar = (rn) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    rnVar.getClass();
                    org.telegram.ui.Components.lc.b0(rnVar).g0(tL_error, false);
                }
                org.telegram.messenger.g0.E2(rnVar.k0);
                org.telegram.messenger.g0.E2(rnVar.h0);
                org.telegram.messenger.g0.E2(rnVar.j0);
                break;
            case 5:
                org.telegram.messenger.g0.h3(new op((rq) this.b, i10), 1000L);
                break;
            case 6:
                ((wf.b) this.b).N(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                break;
            case 7:
                qr qrVar = (qr) this.b;
                ArrayList arrayList7 = (ArrayList) obj;
                TLRPC.User c22 = qrVar.getMessagesController().c2(Long.valueOf(qrVar.I));
                arrayList7.add(org.telegram.ui.Components.l41.k(qrVar.W));
                arrayList7.add(org.telegram.ui.Components.l41.k(qrVar.b));
                arrayList7.add(org.telegram.ui.Components.l41.k(qrVar.c));
                if (TextUtils.isEmpty(qrVar.g0())) {
                    arrayList7.add(org.telegram.ui.Components.l41.C(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131748217, null)), org.telegram.messenger.o10.k(c22, true), "%1$s")));
                } else if (qrVar.L) {
                    arrayList7.add(org.telegram.ui.Components.l41.C(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("MobileVisibleInfo", null, 2131748216, org.telegram.messenger.o10.k(c22, true)))));
                } else {
                    arrayList7.add(org.telegram.ui.Components.l41.C(null));
                }
                if (qrVar.J && qrVar.L) {
                    org.telegram.ui.Components.l41 i23 = org.telegram.ui.Components.l41.i(2, org.telegram.messenger.gd.M0(2131754445, null));
                    i23.L(qrVar.Y);
                    arrayList7.add(i23);
                    arrayList7.add(org.telegram.ui.Components.l41.C(org.telegram.messenger.gd.a0(null, null, 2131754444, org.telegram.messenger.o10.k(c22, true))));
                }
                arrayList7.add(org.telegram.ui.Components.l41.k(qrVar.d));
                arrayList7.add(org.telegram.ui.Components.l41.C(org.telegram.messenger.gd.M0(2131754392, null)));
                if (!qrVar.J) {
                    TLRPC.UserFull d2 = qrVar.getMessagesController().d2(qrVar.I);
                    if (d2 != null && d2.birthday == null) {
                        arrayList7.add(org.telegram.ui.Components.l41.k(qrVar.G));
                    }
                    arrayList7.add(org.telegram.ui.Components.l41.k(qrVar.y));
                    arrayList7.add(org.telegram.ui.Components.l41.k(qrVar.E));
                    if (c22 != null && (userProfilePhoto = c22.photo) != null && userProfilePhoto.personal) {
                        arrayList7.add(org.telegram.ui.Components.l41.k(qrVar.F));
                    }
                    arrayList7.add(org.telegram.ui.Components.l41.C(null));
                    org.telegram.ui.Components.l41 e10 = org.telegram.ui.Components.l41.e(1, org.telegram.messenger.gd.M0(2131751541, null));
                    e10.s = true;
                    arrayList7.add(e10);
                }
                arrayList7.add(org.telegram.ui.Components.l41.C(null));
                if (qrVar.Z) {
                    org.telegram.messenger.g0.g3(new ir(qrVar, c22, i11));
                    qrVar.Z = false;
                    org.telegram.messenger.g0.h3(new gr(qrVar, i10), 200L);
                    break;
                }
                break;
            case 8:
                ns.a((ns) this.b, (Bitmap) obj, (Bitmap) obj2);
                break;
            case 9:
                js jsVar = (js) this.b;
                CharSequence charSequence = (CharSequence) obj;
                org.telegram.messenger.x10 x10Var = (org.telegram.messenger.x10) obj2;
                ns nsVar = jsVar.a;
                ls lsVar = nsVar.l;
                if (lsVar != null) {
                    lsVar.y(charSequence, TextUtils.join("", nsVar.o), x10Var != null ? new org.telegram.ui.Components.ph(13, jsVar, x10Var) : null);
                    if (x10Var == null) {
                        nsVar.o();
                        break;
                    }
                }
                break;
            case 10:
                ws wsVar = (ws) this.b;
                ArrayList arrayList8 = (ArrayList) obj;
                arrayList8.add(org.telegram.ui.Components.l41.k(wsVar.T1));
                arrayList8.add(org.telegram.ui.Components.l41.C(null));
                ArrayList arrayList9 = wsVar.W1;
                if (arrayList9 != null && !arrayList9.isEmpty()) {
                    i5.c.s(2131749297, null, arrayList8);
                    while (i11 < arrayList9.size()) {
                        Long l11 = (Long) arrayList9.get(i11);
                        l11.getClass();
                        TLRPC.User c23 = org.telegram.messenger.mp.u1(wsVar.a).c2(l11);
                        if (c23 == null) {
                            break;
                        } else {
                            int i24 = ah.q.b;
                            org.telegram.ui.Components.l41 K4 = org.telegram.ui.Components.l41.K(ah.q.class);
                            K4.H = c23;
                            K4.L(wsVar.X1.contains(l11));
                            arrayList8.add(K4);
                            i11++;
                        }
                    }
                    break;
                }
                break;
            case 11:
                cx cxVar = (cx) this.b;
                cxVar.R1 = (Long) obj;
                cxVar.o5();
                break;
            case 12:
                ((Runnable) this.b).run();
                break;
            case 13:
                rx rxVar = (rx) this.b;
                ArrayList arrayList10 = (ArrayList) obj;
                String M02 = org.telegram.messenger.gd.M0(2131743752, null);
                org.telegram.ui.Components.l41 l41Var = new org.telegram.ui.Components.l41(2);
                l41Var.m = M02;
                l41Var.k = R.raw.topics_top;
                arrayList10.add(l41Var);
                org.telegram.ui.Components.l41 i25 = org.telegram.ui.Components.l41.i(1, org.telegram.messenger.gd.M0(2131743755, null));
                i25.L(rxVar.c);
                arrayList10.add(i25);
                if (rxVar.c) {
                    arrayList10.add(org.telegram.ui.Components.l41.C(null));
                    arrayList10.add(org.telegram.ui.Components.l41.u(org.telegram.messenger.gd.M0(2131743751, null)));
                    r3 r3Var = new r3(rxVar, 6);
                    int i26 = px.b;
                    org.telegram.ui.Components.l41 K5 = org.telegram.ui.Components.l41.K(px.class);
                    K5.d = 2;
                    K5.H = r3Var;
                    K5.A = rxVar.e ? 2 : rxVar.d ? 0 : 1;
                    arrayList10.add(K5);
                    arrayList10.add(org.telegram.ui.Components.l41.C(org.telegram.messenger.gd.M0(2131743750, null)));
                    break;
                }
                break;
            case 14:
                s90 s90Var = (s90) this.b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                s90Var.c();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    org.telegram.messenger.mp.u1(s90Var.b).f4(tL_tones.users, false);
                    org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                    if (T != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.v(T.getContext(), tL_tones.tones.get(0), T.getResourceProvider()).show();
                        break;
                    }
                } else if (tL_error2 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error2.text)) {
                        org.telegram.messenger.f3.n(null, 2131754974, s90.d(), R.raw.error, 36);
                        break;
                    } else {
                        s90.d().g0(tL_error2, false);
                        break;
                    }
                }
                break;
            case 15:
                pc0 pc0Var = (pc0) this.b;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                ee0 ee0Var = pc0Var.Q;
                pc0Var.J = false;
                if (auth_authorization instanceof TLRPC.TL_auth_authorization) {
                    pc0Var.n();
                    ee0Var.N1(false, true);
                    pc0Var.postDelayed(new o60(18, pc0Var, auth_authorization), 150L);
                    break;
                } else {
                    ee0Var.C1(false, true);
                    if (tL_error3.text.contains("PHONE_NUMBER_INVALID")) {
                        ee0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131748987, "InvalidPhoneNumber"));
                        break;
                    } else if (!tL_error3.text.contains("PHONE_CODE_EMPTY") && !tL_error3.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error3.text.contains("PHONE_CODE_EXPIRED")) {
                            pc0Var.c(true);
                            ee0Var.M1(0, true, null, true);
                            ee0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131752010, "CodeExpired"));
                            break;
                        } else if (tL_error3.text.contains("FIRSTNAME_INVALID")) {
                            ee0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131748990, "InvalidFirstName"));
                            break;
                        } else if (tL_error3.text.contains("LASTNAME_INVALID")) {
                            ee0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131748988, "InvalidLastName"));
                            break;
                        } else {
                            ee0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), tL_error3.text);
                            break;
                        }
                    } else {
                        ee0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131748991, "InvalidCode"));
                        break;
                    }
                }
                break;
            case 16:
                as0 as0Var = (as0) this.b;
                ui.b bVar3 = as0Var.G;
                Bitmap bitmap = (Bitmap) obj2;
                as0Var.s = (Bitmap) obj;
                Paint paint = new Paint(1);
                as0Var.x = paint;
                Bitmap bitmap2 = as0Var.s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                as0Var.w = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix, org.telegram.ui.ActionBar.n6.I.q() ? 0.05f : 0.25f);
                org.telegram.messenger.g0.h(colorMatrix, org.telegram.ui.ActionBar.n6.I.q() ? -0.02f : -0.04f);
                as0Var.x.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                as0Var.y = new Matrix();
                bVar3.a(bitmap);
                ih.d.c(bVar3, as0Var.c);
                as0Var.H.d();
                break;
            case 17:
                is0 is0Var = (is0) this.b;
                ArrayList arrayList11 = (ArrayList) obj;
                String M03 = org.telegram.messenger.gd.M0(2131754274, null);
                org.telegram.ui.Components.l41 l41Var2 = new org.telegram.ui.Components.l41(2);
                l41Var2.m = M03;
                l41Var2.k = R.raw.bubble;
                arrayList11.add(l41Var2);
                org.telegram.ui.Components.l41 i27 = org.telegram.ui.Components.l41.i(1, org.telegram.messenger.gd.M0(2131754275, null));
                i27.L(is0Var.n);
                arrayList11.add(i27);
                arrayList11.add(org.telegram.ui.Components.l41.B(2, null));
                if (is0Var.n) {
                    i5.c.s(2131746682, null, arrayList11);
                    int[] a10 = org.telegram.ui.Cells.u7.a(new int[]{0, 10, 50, 100, org.telegram.messenger.ks.e3, org.telegram.messenger.ks.Z3, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, (int) is0Var.getMessagesController().L6);
                    l60 l60Var = new l60(i7);
                    org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7();
                    t7Var.c = a10;
                    t7Var.d = 20;
                    t7Var.e = l60Var;
                    is0Var.b.d((int) Utilities.k(is0Var.r, 10000L, 0L), t7Var, new r3(is0Var, 21));
                    arrayList11.add(org.telegram.ui.Components.l41.j(3, is0Var.b));
                    arrayList11.add(org.telegram.ui.Components.l41.B(4, is0Var.r > 0 ? is0Var.b0() : null));
                    TLRPC.Chat O03 = is0Var.getMessagesController().O0(Long.valueOf(is0Var.a));
                    if (O03 != null && !TextUtils.isEmpty(org.telegram.messenger.v3.K(O03, false))) {
                        is0Var.c.setLink(is0Var.getMessagesController().X2 + "/" + org.telegram.messenger.v3.K(O03, false) + "?direct");
                        arrayList11.add(org.telegram.ui.Components.l41.u(org.telegram.messenger.gd.M0(2131752376, null)));
                        arrayList11.add(org.telegram.ui.Components.l41.j(5, is0Var.c));
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
                ui.b bVar4 = profileActivity.Q6;
                bVar4.a((Bitmap) obj2);
                ih.d.c(bVar4, profileActivity.fragmentView);
                profileActivity.R6.d();
                break;
            case 20:
                py0 py0Var = (py0) this.b;
                ArrayList arrayList12 = (ArrayList) obj;
                org.telegram.ui.Components.e51 e51Var = py0Var.f;
                qy0 qy0Var = py0Var.w;
                ArrayList arrayList13 = qy0Var.s1;
                di.n4 n4Var = py0Var.h;
                if (n4Var.getMeasuredHeight() <= 0) {
                    n4Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.q.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(120.0f), TLObject.FLAG_31));
                }
                org.telegram.ui.Components.l41 D = org.telegram.ui.Components.l41.D(n4Var.getMeasuredHeight());
                D.d = -1;
                D.t = true;
                arrayList12.add(D);
                int measuredHeight = (int) ((n4Var.getMeasuredHeight() / org.telegram.messenger.g0.p) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = py0Var.b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || py0Var.c != null || py0Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || py0Var.c != null) {
                        Context context2 = py0Var.getContext();
                        int i28 = org.telegram.ui.ActionBar.n6.L6;
                        int i29 = qy0.w1;
                        org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context2, i28, 21, 0, 0, false, false, qy0Var.J0);
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = py0Var.b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            o4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = py0Var.c;
                            if (tL_reportResultChooseOption != null) {
                                o4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.h5, o4Var, qy0Var.J0);
                        org.telegram.ui.Components.l41 k10 = org.telegram.ui.Components.l41.k(o4Var);
                        k10.d = -2;
                        arrayList12.add(k10);
                        measuredHeight += 40;
                    }
                    if (py0Var.b != null) {
                        for (int i30 = 0; i30 < py0Var.b.options.size(); i30++) {
                            org.telegram.ui.Components.l41 l41Var3 = new org.telegram.ui.Components.l41(30);
                            l41Var3.m = py0Var.b.options.get(i30).text;
                            l41Var3.k = R.drawable.msg_arrowright;
                            l41Var3.d = i30;
                            arrayList12.add(l41Var3);
                            measuredHeight += 50;
                        }
                    } else if (py0Var.c != null) {
                        for (int i31 = 0; i31 < py0Var.c.options.size(); i31++) {
                            org.telegram.ui.Components.l41 l41Var4 = new org.telegram.ui.Components.l41(30);
                            l41Var4.m = py0Var.c.options.get(i31).text;
                            l41Var4.k = R.drawable.msg_arrowright;
                            l41Var4.d = i31;
                            arrayList12.add(l41Var4);
                            measuredHeight += 50;
                        }
                    } else if (py0Var.d != null) {
                        if (py0Var.n == null) {
                            Context context3 = py0Var.getContext();
                            int i32 = qy0.w1;
                            ny0 ny0Var = new ny0(py0Var, context3, qy0Var.J0);
                            py0Var.n = ny0Var;
                            ny0Var.setShowLimitWhenNear(100);
                        }
                        py0Var.n.d.setHint(org.telegram.messenger.gd.M0(py0Var.d.optional ? 2131746041 : 2131746047, null));
                        org.telegram.ui.Components.l41 k11 = org.telegram.ui.Components.l41.k(py0Var.n);
                        k11.d = -3;
                        arrayList12.add(k11);
                        long j3 = qy0Var.u1;
                        if (arrayList13 != null && !arrayList13.isEmpty()) {
                            arrayList12.add(org.telegram.ui.Components.l41.C(org.telegram.messenger.gd.M0(arrayList13.size() > 1 ? 2131746043 : 2131746046, null)));
                        } else if (org.telegram.messenger.n5.E(j3)) {
                            arrayList12.add(org.telegram.ui.Components.l41.C(org.telegram.messenger.gd.M0(2131746042, null)));
                        } else if (org.telegram.messenger.v3.V(org.telegram.messenger.mp.u1(qy0Var.a).O0(Long.valueOf(-j3)))) {
                            arrayList12.add(org.telegram.ui.Components.l41.C(org.telegram.messenger.gd.M0(2131746045, null)));
                        } else {
                            arrayList12.add(org.telegram.ui.Components.l41.C(org.telegram.messenger.gd.M0(2131746044, null)));
                        }
                        if (py0Var.r == null) {
                            hi.d dVar = new hi.d(py0Var.getContext(), qy0Var.J0, true);
                            py0Var.s = dVar;
                            dVar.i(org.telegram.messenger.gd.M0(2131746040, null), false, true);
                            FrameLayout frameLayout = new FrameLayout(py0Var.getContext());
                            py0Var.r = frameLayout;
                            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.h5, frameLayout, qy0Var.J0);
                            py0Var.r.addView(py0Var.s, c8.ma.d(-1, 48.0f, org.telegram.messenger.ks.E1, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(py0Var.getContext());
                            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d7, view, qy0Var.J0);
                            py0Var.r.addView(view, c8.ma.a(-1.0f, 1.0f / org.telegram.messenger.g0.p, 48));
                        }
                        py0Var.s.setEnabled(py0Var.d.optional || !TextUtils.isEmpty(py0Var.n.getText()));
                        py0Var.s.setOnClickListener(new j40(py0Var, 29));
                        org.telegram.ui.Components.l41 k12 = org.telegram.ui.Components.l41.k(py0Var.r);
                        k12.d = -4;
                        arrayList12.add(k12);
                        measuredHeight += org.telegram.messenger.ks.x1;
                    }
                    ((org.telegram.ui.Components.l41) i5.c.h(1, arrayList12)).j = true;
                    if (qy0Var.p1 && py0Var.a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(py0Var.getContext());
                        Drawable mutate = py0Var.getContext().getResources().getDrawable(R.drawable.greydivider).mutate();
                        org.telegram.ui.ActionBar.u6.x(frameLayout2, mutate, org.telegram.ui.ActionBar.n6.b7, qy0Var.J0, PorterDuff.Mode.MULTIPLY);
                        ColorDrawable colorDrawable = new ColorDrawable(-1);
                        org.telegram.ui.ActionBar.u6.x(frameLayout2, colorDrawable, org.telegram.ui.ActionBar.n6.a7, qy0Var.J0, PorterDuff.Mode.SRC_IN);
                        org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(colorDrawable, mutate, 0, 0);
                        mqVar.x = true;
                        frameLayout2.setBackground(mqVar);
                        org.telegram.ui.Components.k80 k80Var = new org.telegram.ui.Components.k80(py0Var.getContext(), null);
                        k80Var.setTextSize(1, 14.0f);
                        k80Var.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.gd.M0(2131746038, null), qy0Var.J0, null));
                        org.telegram.ui.ActionBar.u6.U(k80Var, org.telegram.ui.ActionBar.n6.A6, qy0Var.J0);
                        k80Var.setGravity(17);
                        frameLayout2.addView(k80Var, c8.ma.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.l41 k13 = org.telegram.ui.Components.l41.k(frameLayout2);
                        k13.d = -3;
                        arrayList12.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (e51Var != null) {
                    int i33 = qy0.w1;
                    if (qy0Var.b.getMeasuredHeight() - org.telegram.messenger.g0.m < org.telegram.messenger.g0.L(measuredHeight)) {
                        e51Var.f3.k1(false);
                        break;
                    } else {
                        Collections.reverse(arrayList12);
                        e51Var.f3.k1(true);
                        break;
                    }
                }
                break;
            case 21:
                ((ArrayList) obj).add(org.telegram.ui.Components.l41.k(((uy0) this.b).T1));
                break;
            case 22:
                ((ArrayList) obj).add(org.telegram.ui.Components.l41.k(((org.telegram.ui.Components.x20) this.b).U1));
                break;
            case 23:
                ((SecretMediaViewer) this.b).getClass();
                break;
            case 24:
                b(obj, obj2);
                break;
            case 25:
                a21 a21Var = (a21) this.b;
                ArrayList arrayList14 = a21Var.e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                int i34 = a21Var.a;
                ArrayList arrayList15 = a21Var.d;
                if (tL_error4 != null) {
                    if (a21Var.r) {
                        arrayList15.clear();
                        a21Var.r = false;
                    }
                    a21Var.h = true;
                    a21Var.f = false;
                    int size4 = arrayList14.size();
                    while (i11 < size4) {
                        Object obj6 = arrayList14.get(i11);
                        i11++;
                        ((Runnable) obj6).run();
                    }
                    break;
                } else {
                    org.telegram.messenger.mp.u1(i34).f4(channels_channelparticipants.users, false);
                    org.telegram.messenger.mp.u1(i34).Z3(channels_channelparticipants.chats, false);
                    if (a21Var.r) {
                        arrayList15.clear();
                        a21Var.r = false;
                    }
                    ArrayList<TLRPC.ChannelParticipant> arrayList16 = channels_channelparticipants.participants;
                    int size5 = arrayList16.size();
                    int i35 = 0;
                    while (i35 < size5) {
                        TLRPC.ChannelParticipant channelParticipant = arrayList16.get(i35);
                        i35++;
                        TLObject g22 = org.telegram.messenger.mp.u1(i34).g2(org.telegram.messenger.n5.o(channelParticipant.peer));
                        if (g22 != null) {
                            arrayList15.add(g22);
                        }
                    }
                    if (channels_channelparticipants.participants.size() < 30) {
                        a21Var.h = true;
                    }
                    a21Var.f = false;
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
                o31.f0((o31) this.b, (ArrayList) obj);
                break;
            case 28:
                u31 u31Var = (u31) this.b;
                ArrayList arrayList17 = (ArrayList) obj;
                LinearLayout linearLayout = u31Var.U1;
                if (linearLayout != null) {
                    arrayList17.add(org.telegram.ui.Components.l41.k(linearLayout));
                }
                LinearLayout linearLayout2 = u31Var.V1;
                if (linearLayout2 != null) {
                    arrayList17.add(org.telegram.ui.Components.l41.k(linearLayout2));
                    break;
                }
                break;
            default:
                i81 i81Var = (i81) this.b;
                ui.b bVar5 = i81Var.F;
                Bitmap bitmap3 = (Bitmap) obj2;
                i81Var.r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                i81Var.w = paint2;
                Bitmap bitmap4 = i81Var.r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode2, tileMode2);
                i81Var.s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix2, org.telegram.ui.ActionBar.n6.I.q() ? 0.05f : 0.25f);
                org.telegram.messenger.g0.h(colorMatrix2, org.telegram.ui.ActionBar.n6.I.q() ? -0.02f : -0.04f);
                i81Var.w.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                i81Var.x = new Matrix();
                bVar5.a(bitmap3);
                ih.d.c(bVar5, i81Var.b);
                i81Var.G.d();
                break;
        }
    }
}
