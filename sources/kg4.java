// default package

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ProxyListActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class kg4 implements f59 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kg4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f59
    public final void g(int i, View view) {
        ub7 ub7Var;
        int i2;
        int i3;
        String str;
        int i4;
        byte b;
        int i5;
        boolean z;
        boolean z2;
        ik8 ik8Var;
        TLRPC.Document document;
        gy8 gy8Var;
        byte b2 = this.a;
        byte b3 = 10;
        boolean z3 = true;
        boolean z4 = false;
        boolean z5 = false;
        Object obj = this.b;
        switch (b2) {
            case 0:
                ch4 ch4Var = (ch4) obj;
                if (view instanceof ida) {
                    ch4Var.e(i, view, ((ida) view).getMessage(), 0);
                    return;
                }
                if (view instanceof lda) {
                    ch4Var.e(i, view, ((lda) view).getMessage(), 0);
                    return;
                }
                if (view instanceof eda) {
                    ch4Var.e(i, view, ((eda) view).getMessage(), 0);
                    return;
                } else if (view instanceof lx2) {
                    ch4Var.e(i, view, ((lx2) view).getMessageObject(), 0);
                    return;
                } else {
                    if (view instanceof hg3) {
                        ch4Var.e(i, view, ((hg3) view).getMessage(), 0);
                        return;
                    }
                    return;
                }
            case 1:
                dh4 dh4Var = (dh4) obj;
                wm2 wm2Var = dh4Var.t1;
                ArrayList arrayList = ((dh4) dh4Var.n1.e).u1;
                ub7 ub7Var2 = i < arrayList.size() ? (ub7) arrayList.get(i) : null;
                boolean z6 = view instanceof gy0 ? ((gy0) view).e : false;
                nk3 nk3Var = (nk3) ((fh2) wm2Var.b).b;
                ArrayList arrayList2 = nk3Var.K2;
                ArrayList D0 = dh4.D0(nk3Var, ub7Var2, arrayList2, true, false);
                if (!z6) {
                    int size = D0.size() + (ub7Var2 != null ? ub7Var2.h.size() : 0);
                    if ((size > nk3Var.getMessagesController().l4.b1.f() && !nk3Var.getUserConfig().p()) || size > nk3Var.getMessagesController().l4.c1.f()) {
                        Context context = nk3Var.fragmentView.getContext();
                        i2 = ((d) nk3Var).currentAccount;
                        nk3Var.showDialog(new i46(4, i2, null, context, nk3Var));
                        dh4Var.dismiss();
                        return;
                    }
                }
                if (ub7Var2 != null) {
                    LongSparseIntArray longSparseIntArray = ub7Var2.j;
                    if (z6) {
                        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                            ub7Var2.i.add((Long) arrayList2.get(i6));
                            ub7Var2.h.remove(arrayList2.get(i6));
                        }
                        ub7 ub7Var3 = ub7Var2;
                        qf4.z0(ub7Var3, ub7Var2.g, ub7Var2.b, ub7Var2.c, ub7Var2.n, ub7Var2.m, ub7Var2.h, ub7Var2.i, longSparseIntArray, false, false, true, true, false, nk3Var, null);
                        long longValue = arrayList2.size() == 1 ? ((Long) arrayList2.get(0)).longValue() : 0L;
                        UndoView w3 = nk3Var.w3();
                        if (w3 != null) {
                            w3.k(longValue, 21, Integer.valueOf(arrayList2.size()), ub7Var3, null, null);
                        }
                        nk3Var = nk3Var;
                    } else {
                        ub7 ub7Var4 = ub7Var2;
                        if (D0.isEmpty()) {
                            ub7Var = ub7Var4;
                        } else {
                            for (int i7 = 0; i7 < D0.size(); i7++) {
                                ub7Var4.i.remove(D0.get(i7));
                            }
                            ub7Var4.h.addAll(D0);
                            ub7Var = ub7Var4;
                            qf4.z0(ub7Var, ub7Var4.g, ub7Var4.b, ub7Var4.c, ub7Var4.n, ub7Var4.m, ub7Var4.h, ub7Var4.i, longSparseIntArray, false, false, true, true, false, nk3Var, null);
                        }
                        nk3Var = nk3Var;
                        long longValue2 = D0.size() == 1 ? ((Long) D0.get(0)).longValue() : 0L;
                        ub7 ub7Var5 = ub7Var;
                        UndoView w32 = nk3Var.w3();
                        if (w32 != null) {
                            w32.k(longValue2, 20, Integer.valueOf(D0.size()), ub7Var5, null, null);
                        }
                    }
                } else {
                    nk3Var.presentFragment(new qf4(null, D0));
                }
                nk3Var.A3(true);
                dh4Var.dismiss();
                return;
            case 2:
                ll4 ll4Var = (ll4) obj;
                Runnable runnable = ((dl4) ll4Var.F.get(i)).c;
                if (runnable != null) {
                    runnable.run();
                    ll4Var.c(false);
                    return;
                }
                return;
            case 3:
                ln4 ln4Var = (ln4) obj;
                ArrayList arrayList3 = ln4Var.b2;
                ArrayList arrayList4 = ln4Var.d2;
                if (!(view instanceof xc5) || (i3 = (i - 1) - ln4Var.m2) < 0 || i3 >= arrayList3.size()) {
                    return;
                }
                long n = pg3.n((TLRPC.Peer) arrayList3.get(i3));
                if (!arrayList4.contains(Long.valueOf(n))) {
                    arrayList4.add(Long.valueOf(n));
                    ((xc5) view).c(true, true);
                } else {
                    if (ln4Var.c2.contains(Long.valueOf(n))) {
                        int i8 = -ln4Var.x2;
                        ln4Var.x2 = i8;
                        gm.A3(i8, view, null);
                        xx0.E.a();
                        ArrayList arrayList5 = new ArrayList();
                        d dVar = ln4Var.r1;
                        if (n >= 0) {
                            arrayList5.add(dVar.getMessagesController().W1(Long.valueOf(n)));
                            str = "beep boop.";
                        } else {
                            TLRPC.Chat L0 = dVar.getMessagesController().L0(Long.valueOf(-n));
                            String M0 = sd2.V(L0) ? jb6.M0(2131750608, null) : jb6.M0(2131750609, null);
                            arrayList5.add(L0);
                            str = M0;
                        }
                        if (ln4Var.y2 != n || System.currentTimeMillis() - ln4Var.z2 > 1500) {
                            ln4Var.y2 = n;
                            ln4Var.z2 = System.currentTimeMillis();
                            u31 g = new c41(ln4Var.f2, null).g(str, arrayList5);
                            g.j = 1500;
                            g.j();
                            return;
                        }
                        return;
                    }
                    arrayList4.remove(Long.valueOf(n));
                    ((xc5) view).c(false, true);
                }
                ln4Var.c1(true);
                ln4Var.d1();
                ln4Var.Y0(false);
                return;
            case 4:
                zc5 zc5Var = (zc5) obj;
                if (zc5Var.getParentActivity() != null) {
                    if (i == zc5Var.n || i == 0) {
                        if (zc5Var.f != null) {
                            try {
                                ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", zc5Var.f.link));
                                c41.j(zc5Var).j();
                                return;
                            } catch (Exception e) {
                                fc4.g(e, true);
                                return;
                            }
                        }
                        return;
                    }
                    if (i != zc5Var.s) {
                        if (i == zc5Var.r) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zc5Var.getParentActivity());
                            alertDialog$Builder.a.U = jb6.M0(2131745759, null);
                            alertDialog$Builder.a.S = jb6.M0(2131745756, null);
                            alertDialog$Builder.j(jb6.M0(2131745757, null), new wx4(zc5Var, b3));
                            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                            zc5Var.showDialog(alertDialog$Builder.a);
                            return;
                        }
                        return;
                    }
                    if (zc5Var.f != null) {
                        try {
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType("text/plain");
                            intent.putExtra("android.intent.extra.TEXT", zc5Var.f.link);
                            zc5Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, jb6.M0(2131748867, null)), 500);
                            return;
                        } catch (Exception e2) {
                            fc4.g(e2, true);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                ((kd5) obj).f0(i, view);
                return;
            case 6:
                pd5 pd5Var = (pd5) obj;
                if (i == pd5Var.c2) {
                    pd5Var.a2.a.a1(true);
                    pd5Var.dismiss();
                    return;
                } else {
                    if (view instanceof ij6) {
                        ij6 ij6Var = (ij6) view;
                        if (pd5Var.Z1.contains(Long.valueOf(ij6Var.getUserId()))) {
                            return;
                        }
                        pd5Var.a2.a.e1(ij6Var.getUserId(), true);
                        return;
                    }
                    return;
                }
            case 7:
                ((es5) obj).e0(i, view);
                return;
            case 8:
                sa8 sa8Var = (sa8) obj;
                ru7 ru7Var = (ru7) ru7.a().get(i);
                sa8Var.k1.setTypeface(ru7Var.a);
                m58 e3 = m58.e(sa8Var.F1);
                String str2 = ru7Var.a;
                e3.j = str2;
                e3.a.edit().putString("typeface", str2).apply();
                w44 w44Var = sa8Var.I0;
                if (w44Var instanceof xjb) {
                    ((xjb) w44Var).setTypeface(ru7Var);
                }
                sa8Var.B0(false);
                return;
            case 9:
                ((LanguageSelectActivity) obj).i0(i, view);
                return;
            case 10:
                i46 i46Var = (i46) obj;
                HashSet hashSet = i46Var.t2;
                if (view instanceof jb) {
                    jb jbVar = (jb) view;
                    TLRPC.Chat currentChannel = jbVar.getCurrentChannel();
                    if (hashSet.contains(currentChannel)) {
                        hashSet.remove(currentChannel);
                    } else {
                        hashSet.add(currentChannel);
                    }
                    jbVar.r.a(hashSet.contains(currentChannel), true);
                    i46Var.v1();
                    return;
                }
                if (view instanceof xc5) {
                    if (i46Var.T1 || !((i4 = i46Var.c2) == 11 || i4 == 34)) {
                        xc5 xc5Var = (xc5) view;
                        Object object = xc5Var.getObject();
                        if (!xc5Var.P) {
                            if (hashSet.contains(object)) {
                                hashSet.remove(object);
                            } else {
                                hashSet.add(object);
                            }
                            xc5Var.c(hashSet.contains(object), true);
                            i46Var.v1();
                            return;
                        }
                        if (object instanceof TLRPC.User) {
                            long j = ((TLRPC.User) object).id;
                            int i9 = -i46Var.P2;
                            i46Var.P2 = i9;
                            gm.A3(i9, xc5Var, null);
                            xx0.E.a();
                            String l = j >= 0 ? m9c.l(oc7.r1(i46Var.a).W1(Long.valueOf(j))) : "";
                            boolean H3 = oc7.r1(i46Var.a).H3();
                            ViewGroup viewGroup = i46Var.b;
                            (H3 ? new c41((FrameLayout) viewGroup, i46Var.J0).Q(R.raw.star_premium_2, 36, gm.S2(jb6.a0(null, null, 2131743447, l))) : new c41((FrameLayout) viewGroup, i46Var.J0).K(R.raw.star_premium_2, gm.S2(jb6.a0(null, null, 2131743447, l)), jb6.M0(2131743446, null), new s36(i46Var, z4 ? 1 : 0))).j();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 11:
            case 12:
                ((m07) obj).h(view);
                return;
            case 13:
                ((j67) obj).onBackPressed();
                return;
            case 14:
                t67 t67Var = (t67) obj;
                int i10 = t67Var.J;
                if (i < i10 || i >= t67Var.K) {
                    return;
                }
                k47 k47Var = (k47) t67Var.y.get(i - i10);
                if (k47Var.w4()) {
                    if (t67Var.d0(k47Var)) {
                        return;
                    }
                    t67Var.getOrCreateStoryViewer().J(t67Var.getParentActivity(), k47Var.l, q4b.a(t67Var.f));
                    return;
                }
                long B0 = k47.B0(k47Var.k);
                Bundle bundle = new Bundle();
                if (pg3.D(B0)) {
                    bundle.putLong("user_id", B0);
                } else {
                    bundle.putLong("chat_id", -B0);
                }
                bundle.putInt("message_id", k47Var.e1());
                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                if (t67Var.getMessagesController().A(bundle, t67Var, null, null)) {
                    t67Var.presentFragment(new yv1(bundle));
                    return;
                }
                return;
            case 15:
                bu7 bu7Var = (bu7) obj;
                bu7Var.j3.accept(Integer.valueOf(bu7Var.i3.b(i)));
                m58 m58Var = bu7Var.i3;
                m58Var.c.put(Integer.valueOf(m58Var.f), Integer.valueOf(m58Var.b(i)));
                m58Var.e = true;
                return;
            case 16:
                z8b z8bVar = (z8b) obj;
                ru7 ru7Var2 = (ru7) ru7.a().get(i);
                z8bVar.b1.setTypeface(ru7Var2.a);
                m58 e4 = m58.e(z8bVar.v1);
                String str3 = ru7Var2.a;
                e4.j = str3;
                e4.a.edit().putString("typeface", str3).apply();
                w44 w44Var2 = z8bVar.z0;
                if (w44Var2 instanceof xjb) {
                    ((xjb) w44Var2).setTypeface(ru7Var2);
                }
                z8bVar.P0(false);
                return;
            case 17:
                ((PasscodeActivity) obj).s0(i, view);
                return;
            case 18:
                c38 c38Var = (c38) obj;
                c38Var.a(i, true);
                o28 o28Var = c38Var.h;
                if (o28Var != null) {
                    o28Var.a(Integer.valueOf(i));
                    return;
                }
                return;
            case 19:
                w78 w78Var = (w78) obj;
                ArrayList arrayList6 = w78Var.n;
                ArrayList arrayList7 = w78Var.f;
                yn6 yn6Var = w78Var.K;
                if (yn6Var != null) {
                    arrayList7 = yn6Var.e;
                } else if (arrayList7.isEmpty()) {
                    if (i < arrayList6.size()) {
                        String str4 = (String) arrayList6.get(i);
                        v78 v78Var = w78Var.u0;
                        if (v78Var != null) {
                            v78Var.H(str4);
                            return;
                        }
                        w78Var.Q.getSearchField().setText(str4);
                        w78Var.Q.getSearchField().setSelection(str4.length());
                        w78Var.g0(w78Var.Q.getSearchField());
                        return;
                    }
                    if (i == arrayList6.size() + 1) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(w78Var.getParentActivity());
                        alertDialog$Builder2.a.S = jb6.M0(2131751993, null);
                        alertDialog$Builder2.a.U = jb6.M0(2131751998, null);
                        alertDialog$Builder2.j(jb6.M0(2131752036, null), new o78(w78Var, z5 ? 1 : 0));
                        alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
                        he heVar = alertDialog$Builder2.a;
                        w78Var.showDialog(heVar);
                        TextView textView = (TextView) heVar.c(-1);
                        if (textView != null) {
                            anb.X(textView, cmb.p7, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i < 0 || i >= arrayList7.size()) {
                    return;
                }
                r7 r7Var = w78Var.Q;
                if (r7Var != null) {
                    gm.t1(r7Var.getSearchField());
                }
                if (w78Var.Z) {
                    w78Var.f0(view, arrayList7.get(i));
                    return;
                }
                byte b4 = w78Var.U;
                if (b4 != 1) {
                    b = 3;
                    if (b4 != 3) {
                        if (b4 != 2) {
                            if (b4 != 10) {
                                if (w78Var.V == null) {
                                    b3 = 4;
                                } else {
                                    b = 0;
                                }
                            }
                            b = b3;
                        }
                        PhotoViewer.r0().T1(null, w78Var, null);
                        PhotoViewer r0 = PhotoViewer.r0();
                        int i11 = w78Var.I;
                        boolean z7 = w78Var.J;
                        r0.h = i11;
                        r0.n = z7;
                        PhotoViewer.r0().o1(arrayList7, i, b, w78Var.m0, w78Var.y0, w78Var.V);
                        return;
                    }
                }
                b = 1;
                PhotoViewer.r0().T1(null, w78Var, null);
                PhotoViewer r02 = PhotoViewer.r0();
                int i112 = w78Var.I;
                boolean z72 = w78Var.J;
                r02.h = i112;
                r02.n = z72;
                PhotoViewer.r0().o1(arrayList7, i, b, w78Var.m0, w78Var.y0, w78Var.V);
                return;
            case 20:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.d9;
                ArrayList arrayList8 = photoViewer.f7;
                if (!arrayList8.isEmpty() && (i5 = photoViewer.O4) >= 0 && i5 < arrayList8.size()) {
                    Object obj2 = arrayList8.get(photoViewer.O4);
                    if (obj2 instanceof co6) {
                        ((co6) obj2).s = photoViewer.l0();
                    }
                }
                photoViewer.j5 = true;
                int indexOf = arrayList8.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.O4 = -1;
                    photoViewer.K1(indexOf);
                }
                photoViewer.j5 = false;
                return;
            case 21:
                kg8 kg8Var = (kg8) obj;
                boolean[] zArr = kg8Var.x;
                if (i == kg8Var.p0) {
                    kg8Var.h0();
                    return;
                }
                if (view instanceof bjb) {
                    bjb bjbVar = (bjb) view;
                    boolean z8 = kg8Var.M;
                    fdb fdbVar = kg8Var.R;
                    if (fdbVar != null) {
                        fdbVar.e();
                    }
                    if (kg8Var.J) {
                        int i12 = -kg8Var.P;
                        kg8Var.P = i12;
                        gm.A3(i12, bjbVar, null);
                        xx0.E.a();
                        return;
                    }
                    if (i == kg8Var.s0) {
                        z = !kg8Var.H;
                        kg8Var.H = z;
                    } else {
                        int i13 = kg8Var.v0;
                        if (i == i13) {
                            z = !kg8Var.I;
                            kg8Var.I = z;
                        } else {
                            if (i == kg8Var.w0) {
                                z2 = !kg8Var.K;
                                kg8Var.K = z2;
                                kg8Var.v0();
                                int i14 = kg8Var.v0;
                                if (i14 >= 0 && i13 < 0) {
                                    kg8Var.b.i(i14);
                                } else if (i13 >= 0 && i14 < 0) {
                                    kg8Var.b.s(i13);
                                }
                            } else if (i == kg8Var.t0) {
                                boolean z9 = kg8Var.L;
                                z2 = !z9;
                                kg8Var.L = z2;
                                if (!z9 && kg8Var.M) {
                                    int i15 = kg8Var.k0;
                                    kg8Var.M = false;
                                    kg8Var.v0();
                                    u69 K = kg8Var.c.K(kg8Var.u0);
                                    if (K != null) {
                                        ((bjb) K.a).setChecked(false);
                                    } else {
                                        kg8Var.b.g(kg8Var.u0);
                                    }
                                    kg8Var.b.q(i15, 2);
                                }
                            } else {
                                if (kg8Var.O != 0) {
                                    return;
                                }
                                z = !kg8Var.M;
                                kg8Var.M = z;
                                int i16 = kg8Var.k0;
                                kg8Var.v0();
                                boolean z10 = kg8Var.M;
                                ig8 ig8Var = kg8Var.b;
                                if (z10) {
                                    ig8Var.p(kg8Var.k0, 2);
                                } else {
                                    ig8Var.q(i16, 2);
                                }
                                if (kg8Var.M && kg8Var.L) {
                                    kg8Var.L = false;
                                    u69 K2 = kg8Var.c.K(kg8Var.t0);
                                    if (K2 != null) {
                                        ((bjb) K2.a).setChecked(false);
                                    } else {
                                        kg8Var.b.g(kg8Var.t0);
                                    }
                                }
                                if (kg8Var.M) {
                                    int i17 = 0;
                                    boolean z11 = false;
                                    while (i17 < zArr.length) {
                                        if (z11) {
                                            zArr[i17] = false;
                                        } else if (zArr[i17]) {
                                            z11 = true;
                                        }
                                        i17++;
                                        z11 = z11;
                                    }
                                }
                            }
                            z = z2;
                        }
                    }
                    if (kg8Var.N && !kg8Var.M) {
                        kg8Var.c.getChildCount();
                        kg8Var.h.a();
                    }
                    for (int i18 = kg8Var.o0; i18 < kg8Var.o0 + kg8Var.E; i18++) {
                        u69 K3 = kg8Var.c.K(i18);
                        if (K3 != null) {
                            View view2 = K3.a;
                            if (view2 instanceof ng8) {
                                ng8 ng8Var = (ng8) view2;
                                ng8Var.n(kg8Var.M, true);
                                ng8Var.r.a(zArr[i18 - kg8Var.o0], z8);
                                if (ng8Var.getTop() > gm.L(40.0f) && i == kg8Var.u0 && !kg8Var.N) {
                                    kg8Var.h.c(ng8Var.getCheckBox());
                                    kg8Var.N = true;
                                }
                            }
                        }
                    }
                    bjbVar.setChecked(z);
                    kg8Var.k0();
                    return;
                }
                return;
            case 22:
                ((PremiumPreviewFragment) obj).t0(i, view);
                return;
            case 23:
                gk8 gk8Var = (gk8) obj;
                PremiumPreviewFragment premiumPreviewFragment = gk8Var.n;
                ArrayList arrayList9 = premiumPreviewFragment.d;
                ub8 ub8Var = gk8Var.e;
                if (view.isEnabled() && (view instanceof tk8)) {
                    tk8 tk8Var = (tk8) view;
                    premiumPreviewFragment.e = arrayList9.indexOf(tk8Var.getTier());
                    premiumPreviewFragment.y0(true);
                    tk8Var.c(true, true);
                    for (int i19 = 0; i19 < ub8Var.getChildCount(); i19++) {
                        View childAt = ub8Var.getChildAt(i19);
                        if (childAt instanceof tk8) {
                            tk8 tk8Var2 = (tk8) childAt;
                            if (tk8Var2.getTier() != tk8Var.getTier()) {
                                tk8Var2.c(false, true);
                            }
                        }
                    }
                    for (int i20 = 0; i20 < ub8Var.getHiddenChildCount(); i20++) {
                        View W = ub8Var.W(i20);
                        if (W instanceof tk8) {
                            tk8 tk8Var3 = (tk8) W;
                            if (tk8Var3.getTier() != tk8Var.getTier()) {
                                tk8Var3.c(false, true);
                            }
                        }
                    }
                    for (int i21 = 0; i21 < ub8Var.getCachedChildCount(); i21++) {
                        View P = ub8Var.P(i21);
                        if (P instanceof tk8) {
                            tk8 tk8Var4 = (tk8) P;
                            if (tk8Var4.getTier() != tk8Var.getTier()) {
                                tk8Var4.c(false, true);
                            }
                        }
                    }
                    for (int i22 = 0; i22 < ub8Var.getAttachedScrapChildCount(); i22++) {
                        View O = ub8Var.O(i22);
                        if (O instanceof tk8) {
                            tk8 tk8Var5 = (tk8) O;
                            if (tk8Var5.getTier() != tk8Var.getTier()) {
                                tk8Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout = premiumPreviewFragment.K;
                    if (premiumPreviewFragment.getUserConfig().p() && ((ik8Var = premiumPreviewFragment.f) == null || ik8Var.a.months >= ((ik8) arrayList9.get(premiumPreviewFragment.e)).a.months || premiumPreviewFragment.q0)) {
                        z3 = false;
                    }
                    gm.R3(frameLayout, z3);
                    return;
                }
                return;
            case 24:
                fj8 fj8Var = (fj8) obj;
                if (view != null) {
                    fj8Var.z1(view, true);
                    fj8Var.l3 = false;
                    fj8Var.x0(0, view.getTop() - ((fj8Var.getMeasuredHeight() - view.getMeasuredHeight()) / 2), gm.H);
                    return;
                }
                return;
            case 25:
                ((PrivacyControlActivity) obj).H0(i, view);
                return;
            case 26:
                km8 km8Var = (km8) obj;
                boolean z12 = km8Var.E;
                if (i == km8Var.x) {
                    he heVar2 = ik.L(km8Var.getParentActivity(), jb6.M0(2131747646, null), jb6.M0(2131747647, null), jb6.M0(2131751535, null), new bo6((Object) km8Var, (byte) 13), null).a;
                    heVar2.show();
                    heVar2.h();
                    return;
                }
                if (i != km8Var.f) {
                    if (i < km8Var.r || i >= km8Var.s) {
                        return;
                    }
                    if (z12 != 1) {
                        throw null;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", km8Var.getMessagesController().x0.keyAt(i - km8Var.r));
                    km8Var.presentFragment(new ProfileActivity(bundle2, null));
                    return;
                }
                if (z12 != 1) {
                    Bundle l2 = ts2.l("isNeverShare", true);
                    if (z12 == 2) {
                        l2.putInt("chatAddType", 2);
                    }
                    oc5 oc5Var = new oc5(l2);
                    oc5Var.x = new hm8(km8Var);
                    km8Var.presentFragment(oc5Var);
                    return;
                }
                ug3 ug3Var = new ug3(null);
                ug3Var.d = new Paint();
                ug3Var.f = new tg3[2];
                ug3Var.x = true;
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("onlySelect", true);
                bundle3.putBoolean("checkCanWrite", false);
                bundle3.putBoolean("resetDelegate", false);
                bundle3.putInt("dialogsType", 9);
                nk3 nk3Var2 = new nk3(bundle3);
                ug3Var.a = nk3Var2;
                nk3Var2.E2 = new qg3(ug3Var);
                nk3Var2.onFragmentCreate();
                Bundle bundle4 = new Bundle();
                bundle4.putBoolean("onlyUsers", true);
                bundle4.putBoolean("destroyAfterSelect", true);
                bundle4.putBoolean("returnAsResult", true);
                bundle4.putBoolean("disableSections", true);
                bundle4.putBoolean("needFinishFragment", false);
                bundle4.putBoolean("resetDelegate", false);
                bundle4.putBoolean("allowSelf", false);
                ContactsActivity contactsActivity = new ContactsActivity(bundle4);
                ug3Var.b = contactsActivity;
                contactsActivity.V = new qg3(ug3Var);
                contactsActivity.onFragmentCreate();
                km8Var.presentFragment(ug3Var);
                return;
            case 27:
                RectF rectF = ProfileActivity.e7;
                ((ProfileActivity) obj).B2(i);
                return;
            case 28:
                ((ProxyListActivity) obj).g0(i, view);
                return;
            default:
                fy8 fy8Var = (fy8) obj;
                if (!(view instanceof nx8) || (document = ((nx8) view).e) == null) {
                    return;
                }
                long j2 = document.id;
                if (j2 != 0) {
                    iy8 iy8Var = fy8Var.a;
                    if (iy8Var.d != null) {
                        if (!iy8Var.getUserConfig().p() && ((gy8Var = iy8Var.h) == null || !gy8Var.I.contains(Long.valueOf(j2)))) {
                            wy8 wy8Var = iy8Var.d;
                            wy8Var.getClass();
                            wy8Var.d1(0, jb6.M0(2131746208, null), jb6.M0(2131746206, null));
                            wy8Var.i0();
                            return;
                        }
                        wy8 wy8Var2 = iy8Var.d;
                        wy8Var2.getClass();
                        String str5 = "c:" + j2;
                        HashMap hashMap = wy8Var2.K;
                        if (!hashMap.containsKey(str5)) {
                            vm l3 = vm.l(wy8Var2.b, 2, document);
                            l3.b(wy8Var2);
                            hashMap.put(str5, l3);
                        }
                        if (!str5.startsWith("c:")) {
                            str5 = str5.replace("️", "");
                        }
                        ArrayList arrayList10 = wy8Var2.J;
                        int indexOf2 = arrayList10.indexOf(str5);
                        if (indexOf2 >= 0) {
                            arrayList10.remove(indexOf2);
                        } else {
                            if (arrayList10.size() >= 6) {
                                arrayList10.remove(0);
                            }
                            arrayList10.add(str5);
                        }
                        wy8Var2.c();
                        wy8Var2.i0();
                        gy8 gy8Var2 = iy8Var.h;
                        if (gy8Var2 != null) {
                            ArrayList a = gy8Var2.a();
                            a.remove(Long.valueOf(j2));
                            a.add(0, Long.valueOf(j2));
                            while (a.size() > 21) {
                                td4.w(1, a);
                            }
                            StringBuilder sb = new StringBuilder();
                            for (int i23 = 0; i23 < a.size(); i23++) {
                                if (i23 > 0) {
                                    sb.append(',');
                                }
                                sb.append(a.get(i23));
                            }
                            oc7.r1(gy8Var2.a).X3.edit().putString("qrAppliedEmoji", sb.toString()).apply();
                            gy8Var2.K = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
