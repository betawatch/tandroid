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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class a5 implements org.telegram.messenger.p10 {
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
        a21 a21Var = (a21) this.b;
        ArrayList arrayList = (ArrayList) obj;
        z11 z11Var = a21Var.c2;
        z11 z11Var2 = a21Var.b2;
        TLRPC.User user = a21Var.U1;
        z11 z11Var3 = a21Var.a2;
        if (z11Var3 != null) {
            ArrayList arrayList2 = z11Var3.d;
            if (z11Var2 == null) {
                return;
            }
            ArrayList arrayList3 = z11Var2.d;
            HashSet hashSet = new HashSet();
            hashSet.add(Long.valueOf(org.telegram.messenger.i10.i(a21Var.a).e()));
            arrayList.add(org.telegram.ui.Components.n41.E(3, org.telegram.messenger.g0.L(64.0f)));
            if (z11Var != null && !TextUtils.isEmpty(z11Var.c.q)) {
                ArrayList arrayList4 = z11Var.d;
                int size = arrayList4.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj3 = arrayList4.get(i10);
                    i10++;
                    TLObject tLObject = (TLObject) obj3;
                    if (!hashSet.contains(Long.valueOf(org.telegram.messenger.n5.d(tLObject)))) {
                        hashSet.add(Long.valueOf(org.telegram.messenger.n5.d(tLObject)));
                        org.telegram.ui.Components.n41 w10 = org.telegram.ui.Components.n41.w(tLObject);
                        w10.L(org.telegram.messenger.n5.d(tLObject) == org.telegram.messenger.n5.d(a21Var.W1));
                        arrayList.add(w10);
                    }
                }
                if (z11Var.f) {
                    arrayList.add(org.telegram.ui.Components.n41.p(29));
                    arrayList.add(org.telegram.ui.Components.n41.p(29));
                    arrayList.add(org.telegram.ui.Components.n41.p(29));
                }
                if (arrayList.size() == 1) {
                    arrayList.add(org.telegram.ui.Components.n41.k(a21Var.Z1));
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
                            arrayList.add(org.telegram.ui.Components.n41.r(org.telegram.messenger.gd.N0(org.telegram.messenger.v3.V(a21Var.T1) ? 2131752504 : 2131749306, null)));
                            hashSet.add(Long.valueOf(org.telegram.messenger.n5.d(user)));
                            org.telegram.ui.Components.n41 w11 = org.telegram.ui.Components.n41.w(user);
                            i7 = 29;
                            w11.L(org.telegram.messenger.n5.d(user) == org.telegram.messenger.n5.d(a21Var.W1));
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
                        arrayList.add(org.telegram.ui.Components.n41.r(org.telegram.messenger.gd.N0(org.telegram.messenger.v3.V(a21Var.T1) ? 2131752504 : 2131749306, null)));
                        z10 = false;
                    }
                    hashSet.add(Long.valueOf(org.telegram.messenger.n5.d(tLObject2)));
                    org.telegram.ui.Components.n41 w12 = org.telegram.ui.Components.n41.w(tLObject2);
                    w12.L(org.telegram.messenger.n5.d(tLObject2) == org.telegram.messenger.n5.d(a21Var.W1));
                    arrayList.add(w12);
                }
            }
            if (z11Var3.f) {
                arrayList.add(org.telegram.ui.Components.n41.p(i7));
                arrayList.add(org.telegram.ui.Components.n41.p(i7));
                arrayList.add(org.telegram.ui.Components.n41.p(i7));
            }
            if (user == null || hashSet.contains(Long.valueOf(org.telegram.messenger.n5.d(user)))) {
                z11 = true;
            } else {
                arrayList.add(org.telegram.ui.Components.n41.r(org.telegram.messenger.gd.N0(org.telegram.messenger.v3.V(a21Var.T1) ? 2131752276 : 2131749235, null)));
                hashSet.add(Long.valueOf(org.telegram.messenger.n5.d(user)));
                org.telegram.ui.Components.n41 w13 = org.telegram.ui.Components.n41.w(user);
                w13.L(org.telegram.messenger.n5.d(user) == org.telegram.messenger.n5.d(a21Var.W1));
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
                        arrayList.add(org.telegram.ui.Components.n41.r(org.telegram.messenger.gd.N0(org.telegram.messenger.v3.V(a21Var.T1) ? 2131752276 : 2131749235, null)));
                        z11 = false;
                    }
                    hashSet.add(Long.valueOf(org.telegram.messenger.n5.d(tLObject3)));
                    org.telegram.ui.Components.n41 w14 = org.telegram.ui.Components.n41.w(tLObject3);
                    w14.L(org.telegram.messenger.n5.d(tLObject3) == org.telegram.messenger.n5.d(a21Var.W1));
                    arrayList.add(w14);
                }
            }
            if (arrayList3.isEmpty() || !z11Var2.f) {
                return;
            }
            arrayList.add(org.telegram.ui.Components.n41.p(i7));
            arrayList.add(org.telegram.ui.Components.n41.p(i7));
            arrayList.add(org.telegram.ui.Components.n41.p(i7));
        }
    }

    private final void c(Object obj, Object obj2) {
        TL_stories.StoryItem storyItem;
        c21 c21Var = (c21) this.b;
        ArrayList arrayList = (ArrayList) obj;
        int i7 = c21Var.X1;
        fi.h6 h6Var = c21Var.V1;
        if (h6Var == null) {
            return;
        }
        arrayList.add(org.telegram.ui.Components.n41.D(org.telegram.messenger.g0.L(16.0f)));
        ArrayList arrayList2 = h6Var.i;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = i7;
        int i12 = 0;
        while (i12 < size) {
            Object obj3 = arrayList2.get(i12);
            i12++;
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj3;
            int i13 = i51.c;
            org.telegram.ui.Components.n41 K = org.telegram.ui.Components.n41.K(i51.class);
            K.v = 1;
            K.A = 0;
            K.H = fjVar;
            K.C = (fjVar == null || (storyItem = fjVar.l) == null) ? -1L : storyItem.id;
            K.f = true;
            K.w = i7;
            K.L(c21Var.W1.containsKey(Integer.valueOf(fjVar.e1())));
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
                org.telegram.ui.Components.n41 q10 = org.telegram.ui.Components.n41.q(i10, 34);
                q10.v = 1;
                arrayList.add(q10);
            }
        }
        arrayList.add(org.telegram.ui.Components.n41.D(org.telegram.messenger.g0.L(68.0f)));
    }

    private final void d(Object obj, Object obj2) {
        t31 t31Var = (t31) this.b;
        ArrayList arrayList = (ArrayList) obj;
        LinearLayout linearLayout = t31Var.U1;
        if (linearLayout != null) {
            arrayList.add(org.telegram.ui.Components.n41.k(linearLayout));
        }
        LinearLayout linearLayout2 = t31Var.V1;
        if (linearLayout2 != null) {
            arrayList.add(org.telegram.ui.Components.n41.k(linearLayout2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.p10
    public final void a(Object obj, Object obj2) {
        TLRPC.Chat O0;
        n41 n41Var;
        TLRPC.UserProfilePhoto userProfilePhoto;
        int i7 = 14;
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
                j9 j9Var = (j9) this.b;
                ArrayList arrayList = (ArrayList) obj;
                boolean isEmpty = j9Var.G.isEmpty();
                ArrayList arrayList2 = j9Var.x;
                boolean isEmpty2 = arrayList2.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.n41 c10 = org.telegram.ui.Components.n41.c(1, R.drawable.menu_call_create, org.telegram.messenger.gd.N0(2131749297, null));
                    c10.r = true;
                    arrayList.add(c10);
                    if (!j9Var.getUserConfig().X) {
                        org.telegram.ui.Components.n41 c11 = org.telegram.ui.Components.n41.c(2, R.drawable.menu_add_tab_24, org.telegram.messenger.gd.N0(2131749268, null));
                        c11.r = true;
                        arrayList.add(c11);
                    }
                    arrayList.add(org.telegram.ui.Components.n41.C(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList3 = j9Var.G;
                    int size = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj3 = arrayList3.get(i12);
                        i12++;
                        Long l10 = (Long) obj3;
                        if (l10 != null && (O0 = j9Var.getMessagesController().O0(l10)) != null) {
                            m8 m8Var = new m8(j9Var, 0);
                            int i13 = h9.b;
                            org.telegram.ui.Components.n41 K = org.telegram.ui.Components.n41.K(h9.class);
                            K.H = O0;
                            K.E = m8Var;
                            arrayList.add(K);
                        }
                    }
                    arrayList.add(org.telegram.ui.Components.n41.C(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList2.size();
                    int i14 = 0;
                    while (true) {
                        int i15 = 8;
                        if (i14 < size2) {
                            Object obj4 = arrayList2.get(i14);
                            i14++;
                            g9 g9Var = (g9) obj4;
                            oi.i1 i1Var = new oi.i1(i15, j9Var, g9Var);
                            int i16 = e9.b;
                            org.telegram.ui.Components.n41 K2 = org.telegram.ui.Components.n41.K(e9.class);
                            K2.H = g9Var;
                            K2.E = i1Var;
                            K2.L(j9Var.k0(g9Var.c));
                            arrayList.add(K2);
                        } else if (!j9Var.F) {
                            arrayList.add(org.telegram.ui.Components.n41.q(-1, 8));
                            arrayList.add(org.telegram.ui.Components.n41.q(-2, 8));
                            arrayList.add(org.telegram.ui.Components.n41.q(-3, 8));
                            break;
                        }
                    }
                }
                break;
            case 2:
                xd xdVar = (xd) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                xdVar.S0 = -1;
                TLRPC.Chat O02 = org.telegram.messenger.mp.u1(xdVar.p0).O0(Long.valueOf(-xdVar.q0));
                TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(xdVar.p0).P0(-xdVar.q0);
                int i17 = P0 != null ? P0.stats_dc : -1;
                if (xdVar.c1) {
                    arrayList4.add(org.telegram.ui.Components.n41.g(xdVar.t0));
                    n41 n41Var2 = xdVar.m1;
                    if (n41Var2 != null && !n41Var2.l) {
                        arrayList4.add(org.telegram.ui.Components.n41.h(5, i17, n41Var2));
                        arrayList4.add(org.telegram.ui.Components.n41.B(-1, null));
                    }
                    n41 n41Var3 = xdVar.n1;
                    if (n41Var3 != null && !n41Var3.l) {
                        arrayList4.add(org.telegram.ui.Components.n41.h(2, i17, n41Var3));
                        arrayList4.add(org.telegram.ui.Components.n41.B(-2, null));
                    }
                }
                if (xdVar.d1 && (n41Var = xdVar.o1) != null && !n41Var.l) {
                    arrayList4.add(org.telegram.ui.Components.n41.h(2, i17, n41Var));
                    arrayList4.add(org.telegram.ui.Components.n41.B(-3, null));
                }
                if (xdVar.p1) {
                    arrayList4.add(org.telegram.ui.Components.n41.b(org.telegram.messenger.gd.N0(2131748192, null)));
                    arrayList4.add(org.telegram.ui.Components.n41.v(xdVar.q1));
                    arrayList4.add(org.telegram.ui.Components.n41.v(xdVar.r1));
                    arrayList4.add(org.telegram.ui.Components.n41.v(xdVar.s1));
                    arrayList4.add(org.telegram.ui.Components.n41.B(-4, xdVar.v0));
                }
                if (O02 != null && O02.creator) {
                    if (xdVar.c1) {
                        arrayList4.add(org.telegram.ui.Components.n41.b(org.telegram.messenger.gd.N0(2131748213, null)));
                        arrayList4.add(org.telegram.ui.Components.n41.k(xdVar.x0));
                        arrayList4.add(org.telegram.ui.Components.n41.B(-5, xdVar.u0));
                        int i18 = org.telegram.messenger.mp.u1(xdVar.p0).C4;
                        String N0 = org.telegram.messenger.gd.N0(2131748172, null);
                        int i19 = xdVar.s0 < i18 ? i18 : 0;
                        if (i19 > 0) {
                            Context context = org.telegram.messenger.t0.b;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.kq kqVar = new org.telegram.ui.Components.kq(0, new org.telegram.ui.ActionBar.v2(i19, context, null, false));
                            kqVar.s = org.telegram.messenger.g0.L(1.0f);
                            spannableStringBuilder.setSpan(kqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            N0 = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.n41 i20 = org.telegram.ui.Components.n41.i(1, N0);
                        i20.L(xdVar.s0 >= i18 && xdVar.k1);
                        arrayList4.add(i20);
                        arrayList4.add(org.telegram.ui.Components.n41.B(-8, org.telegram.messenger.gd.N0(2131748171, null)));
                    }
                    if (xdVar.d1) {
                        arrayList4.add(org.telegram.ui.Components.n41.b(org.telegram.messenger.gd.N0(2131748180, null)));
                        arrayList4.add(org.telegram.ui.Components.n41.j(3, xdVar.D0));
                        arrayList4.add(org.telegram.ui.Components.n41.B(-6, xdVar.w0));
                    }
                }
                if (org.telegram.messenger.v3.V(org.telegram.messenger.mp.u1(xdVar.p0).O0(Long.valueOf(-xdVar.q0))) && org.telegram.messenger.mp.u1(xdVar.p0).j6) {
                    arrayList4.add(ki.f.i(4, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.lk, xdVar.o0), rn.i0(org.telegram.messenger.gd.N0(2131752462, null)), org.telegram.messenger.gd.N0(2131752463, null)));
                    arrayList4.add(org.telegram.ui.Components.n41.B(-7, null));
                }
                if (xdVar.b1.a()) {
                    xdVar.S0 = arrayList4.size();
                    arrayList4.add(org.telegram.ui.Components.n41.n(xdVar.U0, -2));
                    break;
                } else {
                    arrayList4.add(org.telegram.ui.Components.n41.B(-10, null));
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
                while (i11 < size3) {
                    Object obj5 = arrayList6.get(i11);
                    i11++;
                    int i23 = di.jb.b;
                    org.telegram.ui.Components.n41 K3 = org.telegram.ui.Components.n41.K(di.jb.class);
                    K3.H = (TL_stars.StarsTransaction) obj5;
                    K3.r = true;
                    arrayList5.add(K3);
                }
                if (!TextUtils.isEmpty(i21 == 0 ? tdVar.s : tdVar.h)) {
                    arrayList5.add(org.telegram.ui.Components.n41.q(arrayList5.size(), 7));
                    arrayList5.add(org.telegram.ui.Components.n41.q(arrayList5.size(), 7));
                    arrayList5.add(org.telegram.ui.Components.n41.q(arrayList5.size(), 7));
                    break;
                }
                break;
            case 4:
                rn rnVar = (rn) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    rnVar.getClass();
                    org.telegram.ui.Components.kc.b0(rnVar).g0(tL_error, false);
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
                arrayList7.add(org.telegram.ui.Components.n41.k(qrVar.W));
                arrayList7.add(org.telegram.ui.Components.n41.k(qrVar.b));
                arrayList7.add(org.telegram.ui.Components.n41.k(qrVar.c));
                if (TextUtils.isEmpty(qrVar.g0())) {
                    arrayList7.add(org.telegram.ui.Components.n41.C(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131748216, null)), org.telegram.messenger.n10.k(c22, true), "%1$s")));
                } else if (qrVar.L) {
                    arrayList7.add(org.telegram.ui.Components.n41.C(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("MobileVisibleInfo", null, 2131748215, org.telegram.messenger.n10.k(c22, true)))));
                } else {
                    arrayList7.add(org.telegram.ui.Components.n41.C(null));
                }
                if (qrVar.J && qrVar.L) {
                    org.telegram.ui.Components.n41 i24 = org.telegram.ui.Components.n41.i(2, org.telegram.messenger.gd.N0(2131754444, null));
                    i24.L(qrVar.Y);
                    arrayList7.add(i24);
                    arrayList7.add(org.telegram.ui.Components.n41.C(org.telegram.messenger.gd.a0(null, null, 2131754443, org.telegram.messenger.n10.k(c22, true))));
                }
                arrayList7.add(org.telegram.ui.Components.n41.k(qrVar.d));
                arrayList7.add(org.telegram.ui.Components.n41.C(org.telegram.messenger.gd.N0(2131754391, null)));
                if (!qrVar.J) {
                    TLRPC.UserFull d2 = qrVar.getMessagesController().d2(qrVar.I);
                    if (d2 != null && d2.birthday == null) {
                        arrayList7.add(org.telegram.ui.Components.n41.k(qrVar.G));
                    }
                    arrayList7.add(org.telegram.ui.Components.n41.k(qrVar.y));
                    arrayList7.add(org.telegram.ui.Components.n41.k(qrVar.E));
                    if (c22 != null && (userProfilePhoto = c22.photo) != null && userProfilePhoto.personal) {
                        arrayList7.add(org.telegram.ui.Components.n41.k(qrVar.F));
                    }
                    arrayList7.add(org.telegram.ui.Components.n41.C(null));
                    org.telegram.ui.Components.n41 e10 = org.telegram.ui.Components.n41.e(1, org.telegram.messenger.gd.N0(2131751540, null));
                    e10.s = true;
                    arrayList7.add(e10);
                }
                arrayList7.add(org.telegram.ui.Components.n41.C(null));
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
                org.telegram.messenger.w10 w10Var = (org.telegram.messenger.w10) obj2;
                ns nsVar = jsVar.a;
                ls lsVar = nsVar.l;
                if (lsVar != null) {
                    lsVar.K(charSequence, TextUtils.join("", nsVar.o), w10Var != null ? new org.telegram.ui.Components.ph(i7, jsVar, w10Var) : null);
                    if (w10Var == null) {
                        nsVar.o();
                        break;
                    }
                }
                break;
            case 10:
                vs vsVar = (vs) this.b;
                ArrayList arrayList8 = (ArrayList) obj;
                arrayList8.add(org.telegram.ui.Components.n41.k(vsVar.T1));
                arrayList8.add(org.telegram.ui.Components.n41.C(null));
                ArrayList arrayList9 = vsVar.W1;
                if (arrayList9 != null && !arrayList9.isEmpty()) {
                    i5.c.s(2131749296, null, arrayList8);
                    while (i11 < arrayList9.size()) {
                        Long l11 = (Long) arrayList9.get(i11);
                        l11.getClass();
                        TLRPC.User c23 = org.telegram.messenger.mp.u1(vsVar.a).c2(l11);
                        if (c23 == null) {
                            break;
                        } else {
                            int i25 = ah.q.b;
                            org.telegram.ui.Components.n41 K4 = org.telegram.ui.Components.n41.K(ah.q.class);
                            K4.H = c23;
                            K4.L(vsVar.X1.contains(l11));
                            arrayList8.add(K4);
                            i11++;
                        }
                    }
                    break;
                }
                break;
            case 11:
                bx bxVar = (bx) this.b;
                bxVar.R1 = (Long) obj;
                bxVar.o5();
                break;
            case 12:
                ((Runnable) this.b).run();
                break;
            case 13:
                qx qxVar = (qx) this.b;
                ArrayList arrayList10 = (ArrayList) obj;
                String N02 = org.telegram.messenger.gd.N0(2131743742, null);
                org.telegram.ui.Components.n41 n41Var4 = new org.telegram.ui.Components.n41(2);
                n41Var4.m = N02;
                n41Var4.k = R.raw.topics_top;
                arrayList10.add(n41Var4);
                org.telegram.ui.Components.n41 i26 = org.telegram.ui.Components.n41.i(1, org.telegram.messenger.gd.N0(2131743745, null));
                i26.L(qxVar.c);
                arrayList10.add(i26);
                if (qxVar.c) {
                    arrayList10.add(org.telegram.ui.Components.n41.C(null));
                    arrayList10.add(org.telegram.ui.Components.n41.u(org.telegram.messenger.gd.N0(2131743741, null)));
                    r3 r3Var = new r3(qxVar, 6);
                    int i27 = ox.b;
                    org.telegram.ui.Components.n41 K5 = org.telegram.ui.Components.n41.K(ox.class);
                    K5.d = 2;
                    K5.H = r3Var;
                    K5.A = qxVar.e ? 2 : qxVar.d ? 0 : 1;
                    arrayList10.add(K5);
                    arrayList10.add(org.telegram.ui.Components.n41.C(org.telegram.messenger.gd.N0(2131743740, null)));
                    break;
                }
                break;
            case 14:
                r90 r90Var = (r90) this.b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                r90Var.c();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    org.telegram.messenger.mp.u1(r90Var.b).f4(tL_tones.users, false);
                    org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                    if (T != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.v(T.getContext(), tL_tones.tones.get(0), T.getResourceProvider()).show();
                        break;
                    }
                } else if (tL_error2 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error2.text)) {
                        org.telegram.messenger.f3.n(null, 2131754974, r90.d(), R.raw.error, 36);
                        break;
                    } else {
                        r90.d().g0(tL_error2, false);
                        break;
                    }
                }
                break;
            case 15:
                oc0 oc0Var = (oc0) this.b;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                de0 de0Var = oc0Var.Q;
                oc0Var.J = false;
                if (auth_authorization instanceof TLRPC.TL_auth_authorization) {
                    oc0Var.n();
                    de0Var.N1(false, true);
                    oc0Var.postDelayed(new i50(24, oc0Var, auth_authorization), 150L);
                    break;
                } else {
                    de0Var.C1(false, true);
                    if (tL_error3.text.contains("PHONE_NUMBER_INVALID")) {
                        de0Var.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.N0(2131748986, "InvalidPhoneNumber"));
                        break;
                    } else if (!tL_error3.text.contains("PHONE_CODE_EMPTY") && !tL_error3.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error3.text.contains("PHONE_CODE_EXPIRED")) {
                            oc0Var.c(true);
                            de0Var.M1(0, true, null, true);
                            de0Var.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.N0(2131752009, "CodeExpired"));
                            break;
                        } else if (tL_error3.text.contains("FIRSTNAME_INVALID")) {
                            de0Var.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.N0(2131748989, "InvalidFirstName"));
                            break;
                        } else if (tL_error3.text.contains("LASTNAME_INVALID")) {
                            de0Var.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.N0(2131748987, "InvalidLastName"));
                            break;
                        } else {
                            de0Var.D1(org.telegram.messenger.gd.N0(2131745875, null), tL_error3.text);
                            break;
                        }
                    } else {
                        de0Var.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.N0(2131748990, "InvalidCode"));
                        break;
                    }
                }
                break;
            case 16:
                zr0 zr0Var = (zr0) this.b;
                ui.b bVar2 = zr0Var.G;
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
                org.telegram.messenger.g0.i(colorMatrix, org.telegram.ui.ActionBar.n6.I.q() ? 0.05f : 0.25f);
                org.telegram.messenger.g0.h(colorMatrix, org.telegram.ui.ActionBar.n6.I.q() ? -0.02f : -0.04f);
                zr0Var.x.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                zr0Var.y = new Matrix();
                bVar2.a(bitmap);
                ih.d.c(bVar2, zr0Var.c);
                zr0Var.H.d();
                break;
            case 17:
                hs0 hs0Var = (hs0) this.b;
                ArrayList arrayList11 = (ArrayList) obj;
                String N03 = org.telegram.messenger.gd.N0(2131754273, null);
                org.telegram.ui.Components.n41 n41Var5 = new org.telegram.ui.Components.n41(2);
                n41Var5.m = N03;
                n41Var5.k = R.raw.bubble;
                arrayList11.add(n41Var5);
                org.telegram.ui.Components.n41 i28 = org.telegram.ui.Components.n41.i(1, org.telegram.messenger.gd.N0(2131754274, null));
                i28.L(hs0Var.n);
                arrayList11.add(i28);
                arrayList11.add(org.telegram.ui.Components.n41.B(2, null));
                if (hs0Var.n) {
                    i5.c.s(2131746681, null, arrayList11);
                    int[] a10 = org.telegram.ui.Cells.t7.a(new int[]{0, 10, 50, 100, org.telegram.messenger.ks.e3, org.telegram.messenger.ks.Z3, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, (int) hs0Var.getMessagesController().L6);
                    l60 l60Var = new l60(9);
                    org.telegram.ui.Cells.s7 s7Var = new org.telegram.ui.Cells.s7();
                    s7Var.c = a10;
                    s7Var.d = 20;
                    s7Var.e = l60Var;
                    hs0Var.b.d((int) Utilities.k(hs0Var.r, 10000L, 0L), s7Var, new r3(hs0Var, 21));
                    arrayList11.add(org.telegram.ui.Components.n41.j(3, hs0Var.b));
                    arrayList11.add(org.telegram.ui.Components.n41.B(4, hs0Var.r > 0 ? hs0Var.b0() : null));
                    TLRPC.Chat O03 = hs0Var.getMessagesController().O0(Long.valueOf(hs0Var.a));
                    if (O03 != null && !TextUtils.isEmpty(org.telegram.messenger.v3.K(O03, false))) {
                        hs0Var.c.setLink(hs0Var.getMessagesController().X2 + "/" + org.telegram.messenger.v3.K(O03, false) + "?direct");
                        arrayList11.add(org.telegram.ui.Components.n41.u(org.telegram.messenger.gd.N0(2131752375, null)));
                        arrayList11.add(org.telegram.ui.Components.n41.j(5, hs0Var.c));
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
                ui.b bVar3 = profileActivity.Q6;
                bVar3.a((Bitmap) obj2);
                ih.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.R6.d();
                break;
            case 20:
                oy0 oy0Var = (oy0) this.b;
                ArrayList arrayList12 = (ArrayList) obj;
                org.telegram.ui.Components.g51 g51Var = oy0Var.f;
                py0 py0Var = oy0Var.w;
                ArrayList arrayList13 = py0Var.s1;
                di.n4 n4Var = oy0Var.h;
                if (n4Var.getMeasuredHeight() <= 0) {
                    n4Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.q.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(120.0f), TLObject.FLAG_31));
                }
                org.telegram.ui.Components.n41 D = org.telegram.ui.Components.n41.D(n4Var.getMeasuredHeight());
                D.d = -1;
                D.t = true;
                arrayList12.add(D);
                int measuredHeight = (int) ((n4Var.getMeasuredHeight() / org.telegram.messenger.g0.p) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = oy0Var.b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || oy0Var.c != null || oy0Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || oy0Var.c != null) {
                        Context context2 = oy0Var.getContext();
                        int i29 = org.telegram.ui.ActionBar.n6.L6;
                        int i30 = py0.w1;
                        org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context2, i29, 21, 0, 0, false, false, py0Var.J0);
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = oy0Var.b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            o4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = oy0Var.c;
                            if (tL_reportResultChooseOption != null) {
                                o4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.h5, o4Var, py0Var.J0);
                        org.telegram.ui.Components.n41 k10 = org.telegram.ui.Components.n41.k(o4Var);
                        k10.d = -2;
                        arrayList12.add(k10);
                        measuredHeight += 40;
                    }
                    if (oy0Var.b != null) {
                        for (int i31 = 0; i31 < oy0Var.b.options.size(); i31++) {
                            org.telegram.ui.Components.n41 n41Var6 = new org.telegram.ui.Components.n41(30);
                            n41Var6.m = oy0Var.b.options.get(i31).text;
                            n41Var6.k = R.drawable.msg_arrowright;
                            n41Var6.d = i31;
                            arrayList12.add(n41Var6);
                            measuredHeight += 50;
                        }
                    } else if (oy0Var.c != null) {
                        for (int i32 = 0; i32 < oy0Var.c.options.size(); i32++) {
                            org.telegram.ui.Components.n41 n41Var7 = new org.telegram.ui.Components.n41(30);
                            n41Var7.m = oy0Var.c.options.get(i32).text;
                            n41Var7.k = R.drawable.msg_arrowright;
                            n41Var7.d = i32;
                            arrayList12.add(n41Var7);
                            measuredHeight += 50;
                        }
                    } else if (oy0Var.d != null) {
                        if (oy0Var.n == null) {
                            Context context3 = oy0Var.getContext();
                            int i33 = py0.w1;
                            my0 my0Var = new my0(oy0Var, context3, py0Var.J0);
                            oy0Var.n = my0Var;
                            my0Var.setShowLimitWhenNear(100);
                        }
                        oy0Var.n.d.setHint(org.telegram.messenger.gd.N0(oy0Var.d.optional ? 2131746040 : 2131746046, null));
                        org.telegram.ui.Components.n41 k11 = org.telegram.ui.Components.n41.k(oy0Var.n);
                        k11.d = -3;
                        arrayList12.add(k11);
                        long j3 = py0Var.u1;
                        if (arrayList13 != null && !arrayList13.isEmpty()) {
                            arrayList12.add(org.telegram.ui.Components.n41.C(org.telegram.messenger.gd.N0(arrayList13.size() > 1 ? 2131746042 : 2131746045, null)));
                        } else if (org.telegram.messenger.n5.E(j3)) {
                            arrayList12.add(org.telegram.ui.Components.n41.C(org.telegram.messenger.gd.N0(2131746041, null)));
                        } else if (org.telegram.messenger.v3.V(org.telegram.messenger.mp.u1(py0Var.a).O0(Long.valueOf(-j3)))) {
                            arrayList12.add(org.telegram.ui.Components.n41.C(org.telegram.messenger.gd.N0(2131746044, null)));
                        } else {
                            arrayList12.add(org.telegram.ui.Components.n41.C(org.telegram.messenger.gd.N0(2131746043, null)));
                        }
                        if (oy0Var.r == null) {
                            hi.e eVar = new hi.e(oy0Var.getContext(), py0Var.J0, true);
                            oy0Var.s = eVar;
                            eVar.i(org.telegram.messenger.gd.N0(2131746039, null), false, true);
                            FrameLayout frameLayout = new FrameLayout(oy0Var.getContext());
                            oy0Var.r = frameLayout;
                            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.h5, frameLayout, py0Var.J0);
                            oy0Var.r.addView(oy0Var.s, c8.na.d(-1, 48.0f, org.telegram.messenger.ks.E1, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(oy0Var.getContext());
                            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d7, view, py0Var.J0);
                            oy0Var.r.addView(view, c8.na.a(-1.0f, 1.0f / org.telegram.messenger.g0.p, 48));
                        }
                        oy0Var.s.setEnabled(oy0Var.d.optional || !TextUtils.isEmpty(oy0Var.n.getText()));
                        oy0Var.s.setOnClickListener(new i40(oy0Var, 29));
                        org.telegram.ui.Components.n41 k12 = org.telegram.ui.Components.n41.k(oy0Var.r);
                        k12.d = -4;
                        arrayList12.add(k12);
                        measuredHeight += org.telegram.messenger.ks.x1;
                    }
                    ((org.telegram.ui.Components.n41) i5.c.h(1, arrayList12)).j = true;
                    if (py0Var.p1 && oy0Var.a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(oy0Var.getContext());
                        Drawable mutate = oy0Var.getContext().getResources().getDrawable(R.drawable.greydivider).mutate();
                        org.telegram.ui.ActionBar.u6.x(frameLayout2, mutate, org.telegram.ui.ActionBar.n6.b7, py0Var.J0, PorterDuff.Mode.MULTIPLY);
                        ColorDrawable colorDrawable = new ColorDrawable(-1);
                        org.telegram.ui.ActionBar.u6.x(frameLayout2, colorDrawable, org.telegram.ui.ActionBar.n6.a7, py0Var.J0, PorterDuff.Mode.SRC_IN);
                        org.telegram.ui.Components.lq lqVar = new org.telegram.ui.Components.lq(colorDrawable, mutate, 0, 0);
                        lqVar.x = true;
                        frameLayout2.setBackground(lqVar);
                        org.telegram.ui.Components.j80 j80Var = new org.telegram.ui.Components.j80(oy0Var.getContext(), null);
                        j80Var.setTextSize(1, 14.0f);
                        j80Var.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.gd.N0(2131746037, null), py0Var.J0, null));
                        org.telegram.ui.ActionBar.u6.U(j80Var, org.telegram.ui.ActionBar.n6.A6, py0Var.J0);
                        j80Var.setGravity(17);
                        frameLayout2.addView(j80Var, c8.na.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.n41 k13 = org.telegram.ui.Components.n41.k(frameLayout2);
                        k13.d = -3;
                        arrayList12.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (g51Var != null) {
                    int i34 = py0.w1;
                    if (py0Var.b.getMeasuredHeight() - org.telegram.messenger.g0.m < org.telegram.messenger.g0.L(measuredHeight)) {
                        g51Var.f3.k1(false);
                        break;
                    } else {
                        Collections.reverse(arrayList12);
                        g51Var.f3.k1(true);
                        break;
                    }
                }
                break;
            case 21:
                ((ArrayList) obj).add(org.telegram.ui.Components.n41.k(((ty0) this.b).T1));
                break;
            case 22:
                ((ArrayList) obj).add(org.telegram.ui.Components.n41.k(((org.telegram.ui.Components.x20) this.b).U1));
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
                int i35 = z11Var.a;
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
                    org.telegram.messenger.mp.u1(i35).f4(channels_channelparticipants.users, false);
                    org.telegram.messenger.mp.u1(i35).Z3(channels_channelparticipants.chats, false);
                    if (z11Var.r) {
                        arrayList15.clear();
                        z11Var.r = false;
                    }
                    ArrayList<TLRPC.ChannelParticipant> arrayList16 = channels_channelparticipants.participants;
                    int size5 = arrayList16.size();
                    int i36 = 0;
                    while (i36 < size5) {
                        TLRPC.ChannelParticipant channelParticipant = arrayList16.get(i36);
                        i36++;
                        TLObject g22 = org.telegram.messenger.mp.u1(i35).g2(org.telegram.messenger.n5.o(channelParticipant.peer));
                        if (g22 != null) {
                            arrayList15.add(g22);
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
                n31.f0((n31) this.b, (ArrayList) obj);
                break;
            case 28:
                d(obj, obj2);
                break;
            default:
                g81 g81Var = (g81) this.b;
                ui.b bVar4 = g81Var.F;
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
                org.telegram.messenger.g0.i(colorMatrix2, org.telegram.ui.ActionBar.n6.I.q() ? 0.05f : 0.25f);
                org.telegram.messenger.g0.h(colorMatrix2, org.telegram.ui.ActionBar.n6.I.q() ? -0.02f : -0.04f);
                g81Var.w.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                g81Var.x = new Matrix();
                bVar4.a(bitmap3);
                ih.d.c(bVar4, g81Var.b);
                g81Var.G.d();
                break;
        }
    }
}
