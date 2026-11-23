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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class a5 implements org.telegram.messenger.r10 {
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
        c21 c21Var = (c21) this.b;
        ArrayList arrayList = (ArrayList) obj;
        b21 b21Var = c21Var.c2;
        b21 b21Var2 = c21Var.b2;
        TLRPC.User user = c21Var.U1;
        b21 b21Var3 = c21Var.a2;
        if (b21Var3 != null) {
            ArrayList arrayList2 = b21Var3.d;
            if (b21Var2 == null) {
                return;
            }
            ArrayList arrayList3 = b21Var2.d;
            HashSet hashSet = new HashSet();
            hashSet.add(Long.valueOf(org.telegram.messenger.k10.i(c21Var.a).e()));
            arrayList.add(org.telegram.ui.Components.o41.E(3, org.telegram.messenger.g0.L(64.0f)));
            if (b21Var != null && !TextUtils.isEmpty(b21Var.c.q)) {
                ArrayList arrayList4 = b21Var.d;
                int size = arrayList4.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj3 = arrayList4.get(i10);
                    i10++;
                    TLObject tLObject = (TLObject) obj3;
                    if (!hashSet.contains(Long.valueOf(org.telegram.messenger.n5.d(tLObject)))) {
                        hashSet.add(Long.valueOf(org.telegram.messenger.n5.d(tLObject)));
                        org.telegram.ui.Components.o41 w10 = org.telegram.ui.Components.o41.w(tLObject);
                        w10.L(org.telegram.messenger.n5.d(tLObject) == org.telegram.messenger.n5.d(c21Var.W1));
                        arrayList.add(w10);
                    }
                }
                if (b21Var.f) {
                    arrayList.add(org.telegram.ui.Components.o41.p(29));
                    arrayList.add(org.telegram.ui.Components.o41.p(29));
                    arrayList.add(org.telegram.ui.Components.o41.p(29));
                }
                if (arrayList.size() == 1) {
                    arrayList.add(org.telegram.ui.Components.o41.k(c21Var.Z1));
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
                            arrayList.add(org.telegram.ui.Components.o41.r(org.telegram.messenger.hd.N0(org.telegram.messenger.v3.V(c21Var.T1) ? 2131752504 : 2131749306, null)));
                            hashSet.add(Long.valueOf(org.telegram.messenger.n5.d(user)));
                            org.telegram.ui.Components.o41 w11 = org.telegram.ui.Components.o41.w(user);
                            i7 = 29;
                            w11.L(org.telegram.messenger.n5.d(user) == org.telegram.messenger.n5.d(c21Var.W1));
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
                        arrayList.add(org.telegram.ui.Components.o41.r(org.telegram.messenger.hd.N0(org.telegram.messenger.v3.V(c21Var.T1) ? 2131752504 : 2131749306, null)));
                        z10 = false;
                    }
                    hashSet.add(Long.valueOf(org.telegram.messenger.n5.d(tLObject2)));
                    org.telegram.ui.Components.o41 w12 = org.telegram.ui.Components.o41.w(tLObject2);
                    w12.L(org.telegram.messenger.n5.d(tLObject2) == org.telegram.messenger.n5.d(c21Var.W1));
                    arrayList.add(w12);
                }
            }
            if (b21Var3.f) {
                arrayList.add(org.telegram.ui.Components.o41.p(i7));
                arrayList.add(org.telegram.ui.Components.o41.p(i7));
                arrayList.add(org.telegram.ui.Components.o41.p(i7));
            }
            if (user == null || hashSet.contains(Long.valueOf(org.telegram.messenger.n5.d(user)))) {
                z11 = true;
            } else {
                arrayList.add(org.telegram.ui.Components.o41.r(org.telegram.messenger.hd.N0(org.telegram.messenger.v3.V(c21Var.T1) ? 2131752276 : 2131749235, null)));
                hashSet.add(Long.valueOf(org.telegram.messenger.n5.d(user)));
                org.telegram.ui.Components.o41 w13 = org.telegram.ui.Components.o41.w(user);
                w13.L(org.telegram.messenger.n5.d(user) == org.telegram.messenger.n5.d(c21Var.W1));
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
                        arrayList.add(org.telegram.ui.Components.o41.r(org.telegram.messenger.hd.N0(org.telegram.messenger.v3.V(c21Var.T1) ? 2131752276 : 2131749235, null)));
                        z11 = false;
                    }
                    hashSet.add(Long.valueOf(org.telegram.messenger.n5.d(tLObject3)));
                    org.telegram.ui.Components.o41 w14 = org.telegram.ui.Components.o41.w(tLObject3);
                    w14.L(org.telegram.messenger.n5.d(tLObject3) == org.telegram.messenger.n5.d(c21Var.W1));
                    arrayList.add(w14);
                }
            }
            if (arrayList3.isEmpty() || !b21Var2.f) {
                return;
            }
            arrayList.add(org.telegram.ui.Components.o41.p(i7));
            arrayList.add(org.telegram.ui.Components.o41.p(i7));
            arrayList.add(org.telegram.ui.Components.o41.p(i7));
        }
    }

    private final void c(Object obj, Object obj2) {
        TL_stories.StoryItem storyItem;
        e21 e21Var = (e21) this.b;
        ArrayList arrayList = (ArrayList) obj;
        int i7 = e21Var.X1;
        fi.h6 h6Var = e21Var.V1;
        if (h6Var == null) {
            return;
        }
        arrayList.add(org.telegram.ui.Components.o41.D(org.telegram.messenger.g0.L(16.0f)));
        ArrayList arrayList2 = h6Var.i;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = i7;
        int i12 = 0;
        while (i12 < size) {
            Object obj3 = arrayList2.get(i12);
            i12++;
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj3;
            int i13 = j51.c;
            org.telegram.ui.Components.o41 K = org.telegram.ui.Components.o41.K(j51.class);
            K.v = 1;
            K.A = 0;
            K.H = gjVar;
            K.C = (gjVar == null || (storyItem = gjVar.l) == null) ? -1L : storyItem.id;
            K.f = true;
            K.w = i7;
            K.L(e21Var.W1.containsKey(Integer.valueOf(gjVar.e1())));
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
                org.telegram.ui.Components.o41 q10 = org.telegram.ui.Components.o41.q(i10, 34);
                q10.v = 1;
                arrayList.add(q10);
            }
        }
        arrayList.add(org.telegram.ui.Components.o41.D(org.telegram.messenger.g0.L(68.0f)));
    }

    private final void d(Object obj, Object obj2) {
        u31 u31Var = (u31) this.b;
        ArrayList arrayList = (ArrayList) obj;
        LinearLayout linearLayout = u31Var.U1;
        if (linearLayout != null) {
            arrayList.add(org.telegram.ui.Components.o41.k(linearLayout));
        }
        LinearLayout linearLayout2 = u31Var.V1;
        if (linearLayout2 != null) {
            arrayList.add(org.telegram.ui.Components.o41.k(linearLayout2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.r10
    public final void a(Object obj, Object obj2) {
        TLRPC.Chat O0;
        o41 o41Var;
        TLRPC.UserProfilePhoto userProfilePhoto;
        int i7 = 20;
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
                    org.telegram.ui.Components.o41 c10 = org.telegram.ui.Components.o41.c(1, R.drawable.menu_call_create, org.telegram.messenger.hd.N0(2131749297, null));
                    c10.r = true;
                    arrayList.add(c10);
                    if (!j9Var.getUserConfig().X) {
                        org.telegram.ui.Components.o41 c11 = org.telegram.ui.Components.o41.c(2, R.drawable.menu_add_tab_24, org.telegram.messenger.hd.N0(2131749268, null));
                        c11.r = true;
                        arrayList.add(c11);
                    }
                    arrayList.add(org.telegram.ui.Components.o41.C(null));
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
                            l8 l8Var = new l8(j9Var, 0);
                            int i13 = h9.b;
                            org.telegram.ui.Components.o41 K = org.telegram.ui.Components.o41.K(h9.class);
                            K.H = O0;
                            K.E = l8Var;
                            arrayList.add(K);
                        }
                    }
                    arrayList.add(org.telegram.ui.Components.o41.C(null));
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
                            org.telegram.ui.Components.o41 K2 = org.telegram.ui.Components.o41.K(e9.class);
                            K2.H = g9Var;
                            K2.E = i1Var;
                            K2.L(j9Var.k0(g9Var.c));
                            arrayList.add(K2);
                        } else if (!j9Var.F) {
                            arrayList.add(org.telegram.ui.Components.o41.q(-1, 8));
                            arrayList.add(org.telegram.ui.Components.o41.q(-2, 8));
                            arrayList.add(org.telegram.ui.Components.o41.q(-3, 8));
                            break;
                        }
                    }
                }
                break;
            case 2:
                xd xdVar = (xd) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                xdVar.S0 = -1;
                TLRPC.Chat O02 = org.telegram.messenger.np.u1(xdVar.p0).O0(Long.valueOf(-xdVar.q0));
                TLRPC.ChatFull P0 = org.telegram.messenger.np.u1(xdVar.p0).P0(-xdVar.q0);
                int i17 = P0 != null ? P0.stats_dc : -1;
                if (xdVar.c1) {
                    arrayList4.add(org.telegram.ui.Components.o41.g(xdVar.t0));
                    o41 o41Var2 = xdVar.m1;
                    if (o41Var2 != null && !o41Var2.l) {
                        arrayList4.add(org.telegram.ui.Components.o41.h(5, i17, o41Var2));
                        arrayList4.add(org.telegram.ui.Components.o41.B(-1, null));
                    }
                    o41 o41Var3 = xdVar.n1;
                    if (o41Var3 != null && !o41Var3.l) {
                        arrayList4.add(org.telegram.ui.Components.o41.h(2, i17, o41Var3));
                        arrayList4.add(org.telegram.ui.Components.o41.B(-2, null));
                    }
                }
                if (xdVar.d1 && (o41Var = xdVar.o1) != null && !o41Var.l) {
                    arrayList4.add(org.telegram.ui.Components.o41.h(2, i17, o41Var));
                    arrayList4.add(org.telegram.ui.Components.o41.B(-3, null));
                }
                if (xdVar.p1) {
                    arrayList4.add(org.telegram.ui.Components.o41.b(org.telegram.messenger.hd.N0(2131748192, null)));
                    arrayList4.add(org.telegram.ui.Components.o41.v(xdVar.q1));
                    arrayList4.add(org.telegram.ui.Components.o41.v(xdVar.r1));
                    arrayList4.add(org.telegram.ui.Components.o41.v(xdVar.s1));
                    arrayList4.add(org.telegram.ui.Components.o41.B(-4, xdVar.v0));
                }
                if (O02 != null && O02.creator) {
                    if (xdVar.c1) {
                        arrayList4.add(org.telegram.ui.Components.o41.b(org.telegram.messenger.hd.N0(2131748213, null)));
                        arrayList4.add(org.telegram.ui.Components.o41.k(xdVar.x0));
                        arrayList4.add(org.telegram.ui.Components.o41.B(-5, xdVar.u0));
                        int i18 = org.telegram.messenger.np.u1(xdVar.p0).C4;
                        String N0 = org.telegram.messenger.hd.N0(2131748172, null);
                        int i19 = xdVar.s0 < i18 ? i18 : 0;
                        if (i19 > 0) {
                            Context context = org.telegram.messenger.t0.b;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(0, new org.telegram.ui.ActionBar.v2(i19, context, null, false));
                            nqVar.s = org.telegram.messenger.g0.L(1.0f);
                            spannableStringBuilder.setSpan(nqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            N0 = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.o41 i20 = org.telegram.ui.Components.o41.i(1, N0);
                        i20.L(xdVar.s0 >= i18 && xdVar.k1);
                        arrayList4.add(i20);
                        arrayList4.add(org.telegram.ui.Components.o41.B(-8, org.telegram.messenger.hd.N0(2131748171, null)));
                    }
                    if (xdVar.d1) {
                        arrayList4.add(org.telegram.ui.Components.o41.b(org.telegram.messenger.hd.N0(2131748180, null)));
                        arrayList4.add(org.telegram.ui.Components.o41.j(3, xdVar.D0));
                        arrayList4.add(org.telegram.ui.Components.o41.B(-6, xdVar.w0));
                    }
                }
                if (org.telegram.messenger.v3.V(org.telegram.messenger.np.u1(xdVar.p0).O0(Long.valueOf(-xdVar.q0))) && org.telegram.messenger.np.u1(xdVar.p0).j6) {
                    arrayList4.add(ki.f.i(4, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.lk, xdVar.o0), rn.i0(org.telegram.messenger.hd.N0(2131752462, null)), org.telegram.messenger.hd.N0(2131752463, null)));
                    arrayList4.add(org.telegram.ui.Components.o41.B(-7, null));
                }
                if (xdVar.b1.a()) {
                    xdVar.S0 = arrayList4.size();
                    arrayList4.add(org.telegram.ui.Components.o41.n(xdVar.U0, -2));
                    break;
                } else {
                    arrayList4.add(org.telegram.ui.Components.o41.B(-10, null));
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
                    org.telegram.ui.Components.o41 K3 = org.telegram.ui.Components.o41.K(di.jb.class);
                    K3.H = (TL_stars.StarsTransaction) obj5;
                    K3.r = true;
                    arrayList5.add(K3);
                }
                if (!TextUtils.isEmpty(i21 == 0 ? tdVar.s : tdVar.h)) {
                    arrayList5.add(org.telegram.ui.Components.o41.q(arrayList5.size(), 7));
                    arrayList5.add(org.telegram.ui.Components.o41.q(arrayList5.size(), 7));
                    arrayList5.add(org.telegram.ui.Components.o41.q(arrayList5.size(), 7));
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
                arrayList7.add(org.telegram.ui.Components.o41.k(qrVar.W));
                arrayList7.add(org.telegram.ui.Components.o41.k(qrVar.b));
                arrayList7.add(org.telegram.ui.Components.o41.k(qrVar.c));
                if (TextUtils.isEmpty(qrVar.g0())) {
                    arrayList7.add(org.telegram.ui.Components.o41.C(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131748216, null)), org.telegram.messenger.p10.k(c22, true), "%1$s")));
                } else if (qrVar.L) {
                    arrayList7.add(org.telegram.ui.Components.o41.C(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("MobileVisibleInfo", null, 2131748215, org.telegram.messenger.p10.k(c22, true)))));
                } else {
                    arrayList7.add(org.telegram.ui.Components.o41.C(null));
                }
                if (qrVar.J && qrVar.L) {
                    org.telegram.ui.Components.o41 i24 = org.telegram.ui.Components.o41.i(2, org.telegram.messenger.hd.N0(2131754444, null));
                    i24.L(qrVar.Y);
                    arrayList7.add(i24);
                    arrayList7.add(org.telegram.ui.Components.o41.C(org.telegram.messenger.hd.a0(null, null, 2131754443, org.telegram.messenger.p10.k(c22, true))));
                }
                arrayList7.add(org.telegram.ui.Components.o41.k(qrVar.d));
                arrayList7.add(org.telegram.ui.Components.o41.C(org.telegram.messenger.hd.N0(2131754391, null)));
                if (!qrVar.J) {
                    TLRPC.UserFull d2 = qrVar.getMessagesController().d2(qrVar.I);
                    if (d2 != null && d2.birthday == null) {
                        arrayList7.add(org.telegram.ui.Components.o41.k(qrVar.G));
                    }
                    arrayList7.add(org.telegram.ui.Components.o41.k(qrVar.y));
                    arrayList7.add(org.telegram.ui.Components.o41.k(qrVar.E));
                    if (c22 != null && (userProfilePhoto = c22.photo) != null && userProfilePhoto.personal) {
                        arrayList7.add(org.telegram.ui.Components.o41.k(qrVar.F));
                    }
                    arrayList7.add(org.telegram.ui.Components.o41.C(null));
                    org.telegram.ui.Components.o41 e10 = org.telegram.ui.Components.o41.e(1, org.telegram.messenger.hd.N0(2131751540, null));
                    e10.s = true;
                    arrayList7.add(e10);
                }
                arrayList7.add(org.telegram.ui.Components.o41.C(null));
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
                org.telegram.messenger.y10 y10Var = (org.telegram.messenger.y10) obj2;
                ns nsVar = jsVar.a;
                ls lsVar = nsVar.l;
                if (lsVar != null) {
                    lsVar.y(charSequence, TextUtils.join("", nsVar.o), y10Var != null ? new org.telegram.ui.Components.rh(13, jsVar, y10Var) : null);
                    if (y10Var == null) {
                        nsVar.o();
                        break;
                    }
                }
                break;
            case 10:
                ws wsVar = (ws) this.b;
                ArrayList arrayList8 = (ArrayList) obj;
                arrayList8.add(org.telegram.ui.Components.o41.k(wsVar.T1));
                arrayList8.add(org.telegram.ui.Components.o41.C(null));
                ArrayList arrayList9 = wsVar.W1;
                if (arrayList9 != null && !arrayList9.isEmpty()) {
                    i5.c.s(2131749296, null, arrayList8);
                    while (i11 < arrayList9.size()) {
                        Long l11 = (Long) arrayList9.get(i11);
                        l11.getClass();
                        TLRPC.User c23 = org.telegram.messenger.np.u1(wsVar.a).c2(l11);
                        if (c23 == null) {
                            break;
                        } else {
                            int i25 = ah.q.b;
                            org.telegram.ui.Components.o41 K4 = org.telegram.ui.Components.o41.K(ah.q.class);
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
                String N02 = org.telegram.messenger.hd.N0(2131743744, null);
                org.telegram.ui.Components.o41 o41Var4 = new org.telegram.ui.Components.o41(2);
                o41Var4.m = N02;
                o41Var4.k = R.raw.topics_top;
                arrayList10.add(o41Var4);
                org.telegram.ui.Components.o41 i26 = org.telegram.ui.Components.o41.i(1, org.telegram.messenger.hd.N0(2131743747, null));
                i26.L(rxVar.c);
                arrayList10.add(i26);
                if (rxVar.c) {
                    arrayList10.add(org.telegram.ui.Components.o41.C(null));
                    arrayList10.add(org.telegram.ui.Components.o41.u(org.telegram.messenger.hd.N0(2131743743, null)));
                    r3 r3Var = new r3(rxVar, 6);
                    int i27 = px.b;
                    org.telegram.ui.Components.o41 K5 = org.telegram.ui.Components.o41.K(px.class);
                    K5.d = 2;
                    K5.H = r3Var;
                    K5.A = rxVar.e ? 2 : rxVar.d ? 0 : 1;
                    arrayList10.add(K5);
                    arrayList10.add(org.telegram.ui.Components.o41.C(org.telegram.messenger.hd.N0(2131743742, null)));
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
                    org.telegram.messenger.np.u1(s90Var.b).f4(tL_tones.users, false);
                    org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                    if (T != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.w(T.getContext(), tL_tones.tones.get(0), T.getResourceProvider()).show();
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
                de0 de0Var = pc0Var.Q;
                pc0Var.J = false;
                if (auth_authorization instanceof TLRPC.TL_auth_authorization) {
                    pc0Var.n();
                    de0Var.N1(false, true);
                    pc0Var.postDelayed(new h60(i7, pc0Var, auth_authorization), 150L);
                    break;
                } else {
                    de0Var.C1(false, true);
                    if (tL_error3.text.contains("PHONE_NUMBER_INVALID")) {
                        de0Var.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131748986, "InvalidPhoneNumber"));
                        break;
                    } else if (!tL_error3.text.contains("PHONE_CODE_EMPTY") && !tL_error3.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error3.text.contains("PHONE_CODE_EXPIRED")) {
                            pc0Var.c(true);
                            de0Var.M1(0, true, null, true);
                            de0Var.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131752009, "CodeExpired"));
                            break;
                        } else if (tL_error3.text.contains("FIRSTNAME_INVALID")) {
                            de0Var.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131748989, "InvalidFirstName"));
                            break;
                        } else if (tL_error3.text.contains("LASTNAME_INVALID")) {
                            de0Var.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131748987, "InvalidLastName"));
                            break;
                        } else {
                            de0Var.D1(org.telegram.messenger.hd.N0(2131745875, null), tL_error3.text);
                            break;
                        }
                    } else {
                        de0Var.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131748990, "InvalidCode"));
                        break;
                    }
                }
                break;
            case 16:
                as0 as0Var = (as0) this.b;
                ui.b bVar2 = as0Var.G;
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
                org.telegram.messenger.g0.i(colorMatrix, org.telegram.ui.ActionBar.m6.I.q() ? 0.05f : 0.25f);
                org.telegram.messenger.g0.h(colorMatrix, org.telegram.ui.ActionBar.m6.I.q() ? -0.02f : -0.04f);
                as0Var.x.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                as0Var.y = new Matrix();
                bVar2.a(bitmap);
                ih.d.c(bVar2, as0Var.c);
                as0Var.H.d();
                break;
            case 17:
                is0 is0Var = (is0) this.b;
                ArrayList arrayList11 = (ArrayList) obj;
                String N03 = org.telegram.messenger.hd.N0(2131754273, null);
                org.telegram.ui.Components.o41 o41Var5 = new org.telegram.ui.Components.o41(2);
                o41Var5.m = N03;
                o41Var5.k = R.raw.bubble;
                arrayList11.add(o41Var5);
                org.telegram.ui.Components.o41 i28 = org.telegram.ui.Components.o41.i(1, org.telegram.messenger.hd.N0(2131754274, null));
                i28.L(is0Var.n);
                arrayList11.add(i28);
                arrayList11.add(org.telegram.ui.Components.o41.B(2, null));
                if (is0Var.n) {
                    i5.c.s(2131746681, null, arrayList11);
                    int[] a10 = org.telegram.ui.Cells.u7.a(new int[]{0, 10, 50, 100, org.telegram.messenger.ls.e3, org.telegram.messenger.ls.Z3, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, (int) is0Var.getMessagesController().L6);
                    m60 m60Var = new m60(9);
                    org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7();
                    t7Var.c = a10;
                    t7Var.d = 20;
                    t7Var.e = m60Var;
                    is0Var.b.d((int) Utilities.k(is0Var.r, 10000L, 0L), t7Var, new r3(is0Var, 21));
                    arrayList11.add(org.telegram.ui.Components.o41.j(3, is0Var.b));
                    arrayList11.add(org.telegram.ui.Components.o41.B(4, is0Var.r > 0 ? is0Var.b0() : null));
                    TLRPC.Chat O03 = is0Var.getMessagesController().O0(Long.valueOf(is0Var.a));
                    if (O03 != null && !TextUtils.isEmpty(org.telegram.messenger.v3.K(O03, false))) {
                        is0Var.c.setLink(is0Var.getMessagesController().X2 + "/" + org.telegram.messenger.v3.K(O03, false) + "?direct");
                        arrayList11.add(org.telegram.ui.Components.o41.u(org.telegram.messenger.hd.N0(2131752375, null)));
                        arrayList11.add(org.telegram.ui.Components.o41.j(5, is0Var.c));
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
                py0 py0Var = (py0) this.b;
                ArrayList arrayList12 = (ArrayList) obj;
                org.telegram.ui.Components.h51 h51Var = py0Var.f;
                qy0 qy0Var = py0Var.w;
                ArrayList arrayList13 = qy0Var.s1;
                di.n4 n4Var = py0Var.h;
                if (n4Var.getMeasuredHeight() <= 0) {
                    n4Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.q.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(120.0f), TLObject.FLAG_31));
                }
                org.telegram.ui.Components.o41 D = org.telegram.ui.Components.o41.D(n4Var.getMeasuredHeight());
                D.d = -1;
                D.t = true;
                arrayList12.add(D);
                int measuredHeight = (int) ((n4Var.getMeasuredHeight() / org.telegram.messenger.g0.p) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = py0Var.b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || py0Var.c != null || py0Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || py0Var.c != null) {
                        Context context2 = py0Var.getContext();
                        int i29 = org.telegram.ui.ActionBar.m6.L6;
                        int i30 = qy0.w1;
                        org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context2, i29, 21, 0, 0, false, false, qy0Var.J0);
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = py0Var.b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            o4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = py0Var.c;
                            if (tL_reportResultChooseOption != null) {
                                o4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.h5, o4Var, qy0Var.J0);
                        org.telegram.ui.Components.o41 k10 = org.telegram.ui.Components.o41.k(o4Var);
                        k10.d = -2;
                        arrayList12.add(k10);
                        measuredHeight += 40;
                    }
                    if (py0Var.b != null) {
                        for (int i31 = 0; i31 < py0Var.b.options.size(); i31++) {
                            org.telegram.ui.Components.o41 o41Var6 = new org.telegram.ui.Components.o41(30);
                            o41Var6.m = py0Var.b.options.get(i31).text;
                            o41Var6.k = R.drawable.msg_arrowright;
                            o41Var6.d = i31;
                            arrayList12.add(o41Var6);
                            measuredHeight += 50;
                        }
                    } else if (py0Var.c != null) {
                        for (int i32 = 0; i32 < py0Var.c.options.size(); i32++) {
                            org.telegram.ui.Components.o41 o41Var7 = new org.telegram.ui.Components.o41(30);
                            o41Var7.m = py0Var.c.options.get(i32).text;
                            o41Var7.k = R.drawable.msg_arrowright;
                            o41Var7.d = i32;
                            arrayList12.add(o41Var7);
                            measuredHeight += 50;
                        }
                    } else if (py0Var.d != null) {
                        if (py0Var.n == null) {
                            Context context3 = py0Var.getContext();
                            int i33 = qy0.w1;
                            ny0 ny0Var = new ny0(py0Var, context3, qy0Var.J0);
                            py0Var.n = ny0Var;
                            ny0Var.setShowLimitWhenNear(100);
                        }
                        py0Var.n.d.setHint(org.telegram.messenger.hd.N0(py0Var.d.optional ? 2131746040 : 2131746046, null));
                        org.telegram.ui.Components.o41 k11 = org.telegram.ui.Components.o41.k(py0Var.n);
                        k11.d = -3;
                        arrayList12.add(k11);
                        long j3 = qy0Var.u1;
                        if (arrayList13 != null && !arrayList13.isEmpty()) {
                            arrayList12.add(org.telegram.ui.Components.o41.C(org.telegram.messenger.hd.N0(arrayList13.size() > 1 ? 2131746042 : 2131746045, null)));
                        } else if (org.telegram.messenger.n5.E(j3)) {
                            arrayList12.add(org.telegram.ui.Components.o41.C(org.telegram.messenger.hd.N0(2131746041, null)));
                        } else if (org.telegram.messenger.v3.V(org.telegram.messenger.np.u1(qy0Var.a).O0(Long.valueOf(-j3)))) {
                            arrayList12.add(org.telegram.ui.Components.o41.C(org.telegram.messenger.hd.N0(2131746044, null)));
                        } else {
                            arrayList12.add(org.telegram.ui.Components.o41.C(org.telegram.messenger.hd.N0(2131746043, null)));
                        }
                        if (py0Var.r == null) {
                            hi.e eVar = new hi.e(py0Var.getContext(), qy0Var.J0, true);
                            py0Var.s = eVar;
                            eVar.i(org.telegram.messenger.hd.N0(2131746039, null), false, true);
                            FrameLayout frameLayout = new FrameLayout(py0Var.getContext());
                            py0Var.r = frameLayout;
                            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.h5, frameLayout, qy0Var.J0);
                            py0Var.r.addView(py0Var.s, c8.ma.d(-1, 48.0f, org.telegram.messenger.ls.E1, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(py0Var.getContext());
                            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d7, view, qy0Var.J0);
                            py0Var.r.addView(view, c8.ma.a(-1.0f, 1.0f / org.telegram.messenger.g0.p, 48));
                        }
                        py0Var.s.setEnabled(py0Var.d.optional || !TextUtils.isEmpty(py0Var.n.getText()));
                        py0Var.s.setOnClickListener(new j40(py0Var, 29));
                        org.telegram.ui.Components.o41 k12 = org.telegram.ui.Components.o41.k(py0Var.r);
                        k12.d = -4;
                        arrayList12.add(k12);
                        measuredHeight += org.telegram.messenger.ls.x1;
                    }
                    ((org.telegram.ui.Components.o41) i5.c.h(1, arrayList12)).j = true;
                    if (qy0Var.p1 && py0Var.a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(py0Var.getContext());
                        Drawable mutate = py0Var.getContext().getResources().getDrawable(R.drawable.greydivider).mutate();
                        org.telegram.ui.ActionBar.t6.x(frameLayout2, mutate, org.telegram.ui.ActionBar.m6.b7, qy0Var.J0, PorterDuff.Mode.MULTIPLY);
                        ColorDrawable colorDrawable = new ColorDrawable(-1);
                        org.telegram.ui.ActionBar.t6.x(frameLayout2, colorDrawable, org.telegram.ui.ActionBar.m6.a7, qy0Var.J0, PorterDuff.Mode.SRC_IN);
                        org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(colorDrawable, mutate, 0, 0);
                        oqVar.x = true;
                        frameLayout2.setBackground(oqVar);
                        org.telegram.ui.Components.m80 m80Var = new org.telegram.ui.Components.m80(py0Var.getContext(), null);
                        m80Var.setTextSize(1, 14.0f);
                        m80Var.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.hd.N0(2131746037, null), qy0Var.J0, null));
                        org.telegram.ui.ActionBar.t6.U(m80Var, org.telegram.ui.ActionBar.m6.A6, qy0Var.J0);
                        m80Var.setGravity(17);
                        frameLayout2.addView(m80Var, c8.ma.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.o41 k13 = org.telegram.ui.Components.o41.k(frameLayout2);
                        k13.d = -3;
                        arrayList12.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (h51Var != null) {
                    int i34 = qy0.w1;
                    if (qy0Var.b.getMeasuredHeight() - org.telegram.messenger.g0.m < org.telegram.messenger.g0.L(measuredHeight)) {
                        h51Var.f3.k1(false);
                        break;
                    } else {
                        Collections.reverse(arrayList12);
                        h51Var.f3.k1(true);
                        break;
                    }
                }
                break;
            case 21:
                ((ArrayList) obj).add(org.telegram.ui.Components.o41.k(((uy0) this.b).T1));
                break;
            case 22:
                ((ArrayList) obj).add(org.telegram.ui.Components.o41.k(((org.telegram.ui.Components.a30) this.b).U1));
                break;
            case 23:
                ((SecretMediaViewer) this.b).getClass();
                break;
            case 24:
                b(obj, obj2);
                break;
            case 25:
                b21 b21Var = (b21) this.b;
                ArrayList arrayList14 = b21Var.e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                int i35 = b21Var.a;
                ArrayList arrayList15 = b21Var.d;
                if (tL_error4 != null) {
                    if (b21Var.r) {
                        arrayList15.clear();
                        b21Var.r = false;
                    }
                    b21Var.h = true;
                    b21Var.f = false;
                    int size4 = arrayList14.size();
                    while (i11 < size4) {
                        Object obj6 = arrayList14.get(i11);
                        i11++;
                        ((Runnable) obj6).run();
                    }
                    break;
                } else {
                    org.telegram.messenger.np.u1(i35).f4(channels_channelparticipants.users, false);
                    org.telegram.messenger.np.u1(i35).Z3(channels_channelparticipants.chats, false);
                    if (b21Var.r) {
                        arrayList15.clear();
                        b21Var.r = false;
                    }
                    ArrayList<TLRPC.ChannelParticipant> arrayList16 = channels_channelparticipants.participants;
                    int size5 = arrayList16.size();
                    int i36 = 0;
                    while (i36 < size5) {
                        TLRPC.ChannelParticipant channelParticipant = arrayList16.get(i36);
                        i36++;
                        TLObject g22 = org.telegram.messenger.np.u1(i35).g2(org.telegram.messenger.n5.o(channelParticipant.peer));
                        if (g22 != null) {
                            arrayList15.add(g22);
                        }
                    }
                    if (channels_channelparticipants.participants.size() < 30) {
                        b21Var.h = true;
                    }
                    b21Var.f = false;
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
                d(obj, obj2);
                break;
            default:
                i81 i81Var = (i81) this.b;
                ui.b bVar4 = i81Var.F;
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
                org.telegram.messenger.g0.i(colorMatrix2, org.telegram.ui.ActionBar.m6.I.q() ? 0.05f : 0.25f);
                org.telegram.messenger.g0.h(colorMatrix2, org.telegram.ui.ActionBar.m6.I.q() ? -0.02f : -0.04f);
                i81Var.w.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                i81Var.x = new Matrix();
                bVar4.a(bitmap3);
                ih.d.c(bVar4, i81Var.b);
                i81Var.G.d();
                break;
        }
    }
}
