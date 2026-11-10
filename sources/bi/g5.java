package bi;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.b31;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.dm0;
import org.telegram.ui.Components.em0;
import org.telegram.ui.Components.k21;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.b00;
import org.telegram.ui.cn;
import org.telegram.ui.ct;
import org.telegram.ui.dn;
import org.telegram.ui.en;
import org.telegram.ui.iw;
import org.telegram.ui.j40;
import org.telegram.ui.nx;
import org.telegram.ui.oj;
import org.telegram.ui.pb1;
import org.telegram.ui.pm;
import org.telegram.ui.qy0;
import org.telegram.ui.rb1;
import org.telegram.ui.ry0;
import org.telegram.ui.s91;
import org.telegram.ui.sy0;
import org.telegram.ui.u91;
import org.telegram.ui.v91;
import org.telegram.ui.vq0;
import org.telegram.ui.vv;
import org.telegram.ui.z91;
import org.telegram.ui.zw;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class g5 extends m61 {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g5(int i7, Context context, Object obj) {
        this.a = i7;
        this.c = obj;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.m61
    public final void b(View view, int i7, int i10) {
        m5 m5Var;
        org.telegram.ui.ActionBar.f2 f2Var;
        int i11 = this.a;
        Object obj = this.c;
        switch (i11) {
            case 0:
                k7 k7Var = (k7) obj;
                if (i10 == 0) {
                    k7Var.m2(false);
                    i5 i5Var = k7Var.X1;
                    if (i5Var != null) {
                        m5Var = i5Var.T1;
                    }
                } else if (i10 == 2) {
                    k7Var.m2(true);
                    i5 i5Var2 = k7Var.Y1;
                    if (i5Var2 != null) {
                        m5Var = i5Var2.T1;
                    }
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                org.telegram.messenger.g0.E2(m5Var);
                frameLayout.addView(m5Var);
                break;
            case 1:
                sp0 sp0Var = (sp0) obj;
                ei.n nVar = (ei.n) view;
                di.k6 k6Var = i7 == 0 ? sp0Var.e : (di.k6) sp0Var.f.get(i7 - 1);
                k6Var.H(null);
                nVar.setList(k6Var);
                nVar.setVisibleHeight(sp0Var.w);
                break;
            case 2:
                if (view instanceof en) {
                    ((en) view).a.qd(((cn) obj).I3);
                }
                WeakHashMap weakHashMap = r0.i0.a;
                r0.y.c(view);
                break;
            case 3:
                iw iwVar = (iw) obj;
                iwVar.P(view, i7, iwVar.M0, true);
                break;
            case 5:
                ((ry0) view).a(i10);
                break;
            case 7:
                v91 v91Var = (v91) obj;
                v91Var.M(view, i7, v91Var.d0, true);
                break;
            case 8:
                rb1 rb1Var = (rb1) obj;
                SparseArray sparseArray = rb1Var.a;
                pb1 pb1Var = (pb1) sparseArray.get(i7);
                if (pb1Var != null) {
                    f2Var = pb1Var.a;
                } else {
                    org.telegram.ui.ActionBar.f2 a02 = rb1Var.a0(i7);
                    pb1 pb1Var2 = new pb1(a02);
                    sparseArray.put(i7, pb1Var2);
                    f2Var = a02;
                    pb1Var = pb1Var2;
                }
                if (!pb1Var.b) {
                    f2Var.onFragmentCreate();
                    pb1Var.b = true;
                }
                f2Var.setParentLayout(rb1Var.getParentLayout());
                f2Var.setSimpleMenuOverlayHost(rb1Var);
                if (f2Var.getFragmentView() == null) {
                    f2Var.performCreateView((Context) this.b);
                    f2Var.setTitleOverlayText(rb1Var.n, rb1Var.r, rb1Var.s);
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                View fragmentView = f2Var.getFragmentView();
                org.telegram.messenger.g0.E2(fragmentView);
                if (!f2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, fragmentView, null);
                }
                frameLayout2.addView(fragmentView, c8.ha.c(-1.0f, -1));
                if (f2Var.getActionBar() != null && f2Var.getActionBar().K) {
                    org.telegram.messenger.g0.E2(f2Var.getActionBar());
                    frameLayout2.addView(f2Var.getActionBar());
                }
                WeakHashMap weakHashMap2 = r0.i0.a;
                r0.y.c(frameLayout2);
                rb1Var.checkSystemBarColors();
                rb1Var.Z();
                break;
            case 9:
                org.telegram.ui.Wallet.z5.Z0((r41) view, false);
                break;
        }
    }

    @Override // org.telegram.ui.Components.m61
    public final View d(int i7) {
        m5 m5Var;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.h6 h6Var;
        switch (this.a) {
            case 0:
                k7 k7Var = (k7) this.c;
                if (i7 == 0) {
                    k7Var.m2(false);
                    i5 i5Var = k7Var.X1;
                    if (i5Var != null) {
                        m5Var = i5Var.T1;
                        org.telegram.messenger.g0.E2(m5Var);
                        FrameLayout frameLayout = new FrameLayout((Context) this.b);
                        frameLayout.addView(m5Var, c8.ha.e(-1, -1, qs.E1));
                        return frameLayout;
                    }
                    return null;
                }
                if (i7 != 1) {
                    if (i7 == 2) {
                        k7Var.m2(true);
                        i5 i5Var2 = k7Var.Y1;
                        if (i5Var2 != null) {
                            m5Var = i5Var2.T1;
                        }
                    }
                    return null;
                }
                m5Var = k7Var.T1;
                org.telegram.messenger.g0.E2(m5Var);
                FrameLayout frameLayout2 = new FrameLayout((Context) this.b);
                frameLayout2.addView(m5Var, c8.ha.e(-1, -1, qs.E1));
                return frameLayout2;
            case 1:
                return new ei.n((sp0) this.c, (Context) this.b);
            case 2:
                Context context = (Context) this.b;
                cn cnVar = (cn) this.c;
                if (i7 == 0) {
                    return new pm(cnVar, context);
                }
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 7);
                bundle.putInt("searchType", i7);
                bundle.putString("searchHashtag", cnVar.I3);
                oj ojVar = new oj(context, cnVar.getParentLayout(), bundle, 0);
                ojVar.h = false;
                dn dnVar = ojVar.a;
                dnVar.M.a = cnVar.M;
                dnVar.xa = cnVar.za;
                dnVar.ya = cnVar;
                dnVar.l9 = new org.telegram.ui.f(this, 12);
                return ojVar;
            case 3:
                iw iwVar = (iw) this.c;
                zw zwVar = iwVar.L0;
                if (i7 == 1) {
                    return iwVar.W;
                }
                if (i7 == 3) {
                    return iwVar.h0;
                }
                if (i7 == 4) {
                    return iwVar.m0;
                }
                if (i7 == 5) {
                    return iwVar.t0;
                }
                if (i7 == 2) {
                    dl0 dl0Var = new dl0(iwVar.J0, zwVar);
                    iwVar.I0 = dl0Var;
                    dl0Var.b(iwVar.W0, iwVar.X0, false);
                    iwVar.I0.b.setClipToPadding(false);
                    iwVar.I0.b.j(new dm0(this, 0));
                    iwVar.I0.b.D0(new ob0(iwVar, 19));
                    iwVar.I0.setUiCallback(iwVar);
                    return iwVar.I0;
                }
                if (i7 == 6) {
                    return iwVar.r0;
                }
                b00 b00Var = new b00(zwVar);
                b00Var.setChatPreviewDelegate(iwVar.R0);
                b00Var.setUiCallback(iwVar);
                b00Var.j(iwVar.W0, iwVar.X0, false);
                dh.c cVar = iwVar.Z0;
                if (cVar != null) {
                    b00Var.setBlurredBackgroundDrawableFactory(cVar);
                }
                ct ctVar = b00Var.b;
                ctVar.setClipToPadding(false);
                ctVar.j(new dm0(this, 1));
                ctVar.D0(new ob0(iwVar, 19));
                return b00Var;
            case 4:
                FrameLayout frameLayout3 = new FrameLayout((Context) this.b);
                frameLayout3.setOnClickListener(new j40(this, 24));
                return frameLayout3;
            case 5:
                return new ry0((sy0) this.c, (Context) this.b);
            case 6:
                FrameLayout frameLayout4 = new FrameLayout((Context) this.b);
                frameLayout4.setOnClickListener(new qy0(this, 9));
                return frameLayout4;
            case 7:
                v91 v91Var = (v91) this.c;
                z91 z91Var = v91Var.v0;
                if (i7 == 1) {
                    return v91Var.V;
                }
                if (i7 == 2) {
                    i10 = ((org.telegram.ui.ActionBar.f2) z91Var).currentAccount;
                    dl0 dl0Var2 = new dl0(i10, z91Var);
                    dl0Var2.b.j(new u91(0));
                    dl0Var2.setUiCallback(v91Var);
                    return dl0Var2;
                }
                b00 b00Var2 = new b00(z91Var);
                b00Var2.setChatPreviewDelegate(v91Var.t0);
                b00Var2.setUiCallback(v91Var);
                b00Var2.b.j(new u91(1));
                return b00Var2;
            case 8:
                return new vq0((Context) this.b, 13);
            case 9:
                org.telegram.ui.Wallet.z5 z5Var = (org.telegram.ui.Wallet.z5) this.c;
                r41[] r41VarArr = z5Var.r0;
                r41 r41Var = r41VarArr[i7];
                if (r41Var != null) {
                    return r41Var;
                }
                Context context2 = (Context) this.b;
                i11 = ((org.telegram.ui.ActionBar.f2) z5Var).currentAccount;
                i12 = ((org.telegram.ui.ActionBar.f2) z5Var).classGuid;
                org.telegram.ui.Components.p pVar = new org.telegram.ui.Components.p(this, i7, 2);
                org.telegram.ui.Wallet.i4 i4Var = new org.telegram.ui.Wallet.i4(z5Var);
                org.telegram.ui.Wallet.i4 i4Var2 = new org.telegram.ui.Wallet.i4(z5Var);
                h6Var = ((org.telegram.ui.ActionBar.f2) z5Var).resourceProvider;
                nx nxVar = new nx(context2, i11, i12, false, pVar, i4Var, i4Var2, h6Var, i7 == 1 ? 3 : -1, 1);
                if (i7 == 1) {
                    nxVar.setPadding(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(12.0f));
                }
                nxVar.setFocusableInTouchMode(false);
                nxVar.setClipChildren(false);
                nxVar.setClipToPadding(false);
                if (i7 == 0) {
                    nxVar.r1();
                } else {
                    nxVar.setSelectorType(9);
                    nxVar.setSelectorDrawableColor(0);
                }
                nxVar.f3.r = false;
                nxVar.j(new b31(this, i7));
                r41VarArr[i7] = nxVar;
                return nxVar;
            default:
                return i7 == 0 ? ((wg.z) this.b).b : ((wg.w0) this.c).b;
        }
    }

    @Override // org.telegram.ui.Components.m61
    public final int e() {
        switch (this.a) {
            case 0:
                k7 k7Var = (k7) this.c;
                return (k7Var.H1(true) ? 1 : 0) + (k7Var.H1(false) ? 1 : 0) + 1;
            case 1:
                return ((sp0) this.c).f.size() + 1;
            case 2:
                return 3;
            case 3:
                return ((ArrayList) this.b).size();
            case 4:
                return 2;
            case 5:
                return 5;
            case 6:
                return 2;
            case 7:
                return ((ArrayList) this.b).size();
            case 8:
                ((rb1) this.c).getClass();
                return 4;
            case 9:
                return ((org.telegram.ui.Wallet.z5) this.c).f0 ? 2 : 1;
            default:
                return 2;
        }
    }

    @Override // org.telegram.ui.Components.m61
    public int f(int i7) {
        switch (this.a) {
            case 1:
                if (i7 == 0) {
                    return 0;
                }
                return ((di.k6) ((sp0) this.c).f.get(i7 - 1)).E.hashCode();
            default:
                return i7;
        }
    }

    @Override // org.telegram.ui.Components.m61
    public CharSequence g(int i7) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 1:
                if (i7 == 0) {
                    return org.telegram.messenger.id.M0(2131746710, null);
                }
                String O0 = k21.O0(((di.k6) ((sp0) this.c).f.get(i7 - 1)).E, null, null);
                if (O0 == null) {
                    return null;
                }
                return O0.substring(0, 1).toUpperCase() + O0.substring(1);
            case 2:
                return i7 != 1 ? i7 != 2 ? org.telegram.messenger.id.M0(2131745709, null) : org.telegram.messenger.id.M0(2131745712, null) : org.telegram.messenger.id.M0(2131745738, null);
            case 3:
                ArrayList arrayList = (ArrayList) obj;
                if (((em0) arrayList.get(i7)).a == 0) {
                    return org.telegram.messenger.id.M0(2131745823, null);
                }
                if (((em0) arrayList.get(i7)).a == 1) {
                    return org.telegram.messenger.id.M0(2131752258, null);
                }
                if (((em0) arrayList.get(i7)).a == 4) {
                    return org.telegram.messenger.id.M0(2131754178, null);
                }
                if (((em0) arrayList.get(i7)).a == 6) {
                    return org.telegram.messenger.id.M0(2131745733, null);
                }
                if (((em0) arrayList.get(i7)).a == 2) {
                    return org.telegram.messenger.id.M0(2131751343, null);
                }
                if (((em0) arrayList.get(i7)).a == 5) {
                    return org.telegram.messenger.id.M0(2131746584, null);
                }
                jg.o0 o0Var = jg.q0.j3[((em0) arrayList.get(i7)).b];
                String str = o0Var.c;
                return str != null ? str : org.telegram.messenger.id.M0(o0Var.b, null);
            case 4:
            case 5:
            case 6:
            case 8:
            default:
                return super.g(i7);
            case 7:
                ArrayList arrayList2 = (ArrayList) obj;
                if (((s91) arrayList2.get(i7)).a == 0) {
                    return org.telegram.messenger.id.M0(2131745756, null);
                }
                if (((s91) arrayList2.get(i7)).a == 1) {
                    return org.telegram.messenger.id.M0(2131751343, null);
                }
                jg.o0 o0Var2 = jg.q0.j3[((s91) arrayList2.get(i7)).b];
                String str2 = o0Var2.c;
                return str2 != null ? str2 : org.telegram.messenger.id.M0(o0Var2.b, null);
            case 9:
                return org.telegram.messenger.id.M0(i7 == 0 ? 2131742982 : 2131743170, null);
        }
    }

    @Override // org.telegram.ui.Components.m61
    public int h(int i7) {
        switch (this.a) {
            case 0:
                return (i7 - (((k7) this.c).H1(false) ? 1 : 0)) + 1;
            case 1:
            case 4:
            case 6:
            case 8:
            default:
                return super.h(i7);
            case 2:
                return i7;
            case 3:
                ArrayList arrayList = (ArrayList) this.b;
                if (((em0) arrayList.get(i7)).a == 0) {
                    return 1;
                }
                if (((em0) arrayList.get(i7)).a == 1) {
                    return 3;
                }
                if (((em0) arrayList.get(i7)).a == 4) {
                    return 4;
                }
                if (((em0) arrayList.get(i7)).a == 2) {
                    return 2;
                }
                if (((em0) arrayList.get(i7)).a == 5) {
                    return 5;
                }
                if (((em0) arrayList.get(i7)).a == 6) {
                    return 6;
                }
                return ((em0) arrayList.get(i7)).a + i7;
            case 5:
                return i7 == 0 ? 0 : 1;
            case 7:
                ArrayList arrayList2 = (ArrayList) this.b;
                if (((s91) arrayList2.get(i7)).a == 0) {
                    return 1;
                }
                if (((s91) arrayList2.get(i7)).a == 1) {
                    return 2;
                }
                return ((s91) arrayList2.get(i7)).a + i7;
            case 9:
            case 10:
                return i7;
        }
    }

    public void l() {
        ArrayList arrayList = (ArrayList) this.b;
        arrayList.clear();
        arrayList.add(new em0(0));
        iw iwVar = (iw) this.c;
        if (iwVar.V0 != 0) {
            return;
        }
        if (iwVar.s0) {
            arrayList.add(new em0(5));
        }
        arrayList.add(new em0(1));
        arrayList.add(new em0(4));
        arrayList.add(new em0(6));
        if (iwVar.Q0) {
            return;
        }
        em0 em0Var = new em0(3);
        em0Var.b = 0;
        arrayList.add(em0Var);
        vv vvVar = iwVar.d1.G3;
        if (vvVar == null || !vvVar.c()) {
            arrayList.add(new em0(2));
        }
        em0 em0Var2 = new em0(3);
        em0Var2.b = 1;
        arrayList.add(em0Var2);
        em0 em0Var3 = new em0(3);
        em0Var3.b = 2;
        arrayList.add(em0Var3);
        em0 em0Var4 = new em0(3);
        em0Var4.b = 3;
        arrayList.add(em0Var4);
        em0 em0Var5 = new em0(3);
        em0Var5.b = 4;
        arrayList.add(em0Var5);
    }

    public g5(iw iwVar) {
        this.a = 3;
        this.c = iwVar;
        this.b = new ArrayList();
        l();
    }

    public g5(v91 v91Var) {
        this.a = 7;
        this.c = v91Var;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(new s91(0));
        s91 s91Var = new s91(2);
        s91Var.b = 0;
        arrayList.add(s91Var);
        s91 s91Var2 = new s91(2);
        s91Var2.b = 1;
        arrayList.add(s91Var2);
        s91 s91Var3 = new s91(2);
        s91Var3.b = 2;
        arrayList.add(s91Var3);
        s91 s91Var4 = new s91(2);
        s91Var4.b = 3;
        arrayList.add(s91Var4);
        s91 s91Var5 = new s91(2);
        s91Var5.b = 4;
        arrayList.add(s91Var5);
    }

    public g5(wg.z zVar, wg.w0 w0Var) {
        this.a = 10;
        this.b = zVar;
        this.c = w0Var;
    }

    private final void i(View view, int i7, int i10) {
    }

    private final void j(View view, int i7, int i10) {
    }

    private final void k(View view, int i7, int i10) {
    }
}
