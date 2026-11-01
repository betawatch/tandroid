package mg;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.fn0;
import org.telegram.ui.Components.gn0;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.n31;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Wallet.i4;
import org.telegram.ui.a01;
import org.telegram.ui.b01;
import org.telegram.ui.bg0;
import org.telegram.ui.e50;
import org.telegram.ui.fd1;
import org.telegram.ui.gb1;
import org.telegram.ui.hd1;
import org.telegram.ui.hn;
import org.telegram.ui.ib1;
import org.telegram.ui.ik;
import org.telegram.ui.jb1;
import org.telegram.ui.jx;
import org.telegram.ui.my;
import org.telegram.ui.nb1;
import org.telegram.ui.un;
import org.telegram.ui.vn;
import org.telegram.ui.wn;
import org.telegram.ui.ww;
import org.telegram.ui.y00;
import org.telegram.ui.zx;
import org.telegram.ui.zz0;
import rh.e4;
import th.q4;
import w7.b6;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class s extends p71 {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s(Object obj, Context context, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.p71
    public final void b(View view, int i10, int i11) {
        k2 k2Var;
        jg.b1 b1Var;
        int i12 = this.a;
        Object obj = this.c;
        switch (i12) {
            case 0:
                break;
            case 1:
                if (view instanceof wn) {
                    ((wn) view).a.id(((un) obj).I3);
                }
                WeakHashMap weakHashMap = r0.h0.a;
                r0.x.c(view);
                break;
            case 2:
                jx jxVar = (jx) obj;
                jxVar.P(view, i10, jxVar.M0, true);
                break;
            case 3:
                break;
            case 4:
                ((a01) view).a(i11);
                break;
            case 5:
                break;
            case 6:
                jb1 jb1Var = (jb1) obj;
                jb1Var.M(view, i10, jb1Var.d0, true);
                break;
            case 7:
                hd1 hd1Var = (hd1) obj;
                SparseArray sparseArray = hd1Var.a;
                fd1 fd1Var = (fd1) sparseArray.get(i10);
                if (fd1Var != null) {
                    k2Var = fd1Var.a;
                } else {
                    k2 a02 = hd1Var.a0(i10);
                    fd1 fd1Var2 = new fd1(a02);
                    sparseArray.put(i10, fd1Var2);
                    k2Var = a02;
                    fd1Var = fd1Var2;
                }
                if (!fd1Var.b) {
                    k2Var.onFragmentCreate();
                    fd1Var.b = true;
                }
                k2Var.setParentLayout(hd1Var.getParentLayout());
                k2Var.setSimpleMenuOverlayHost(hd1Var);
                if (k2Var.getFragmentView() == null) {
                    k2Var.performCreateView((Context) this.b);
                    k2Var.setTitleOverlayText(hd1Var.n, hd1Var.r, hd1Var.s);
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                View fragmentView = k2Var.getFragmentView();
                org.telegram.messenger.i0.E2(fragmentView);
                if (!k2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    a7.i(t6.d6, fragmentView, null);
                }
                frameLayout.addView(fragmentView, b6.c(-1.0f, -1));
                if (k2Var.getActionBar() != null && k2Var.getActionBar().K) {
                    org.telegram.messenger.i0.E2(k2Var.getActionBar());
                    frameLayout.addView(k2Var.getActionBar());
                }
                WeakHashMap weakHashMap2 = r0.h0.a;
                r0.x.c(frameLayout);
                hd1Var.checkSystemBarColors();
                hd1Var.Z();
                break;
            case 8:
                org.telegram.ui.Wallet.b6.Y0((v51) view, false);
                break;
            case 9:
                e4 e4Var = (e4) obj;
                if (i11 == 0) {
                    e4.i1(e4Var, false);
                    ph.w0 w0Var = e4Var.U1;
                    if (w0Var != null) {
                        b1Var = w0Var.Q1;
                    }
                } else if (i11 == 2) {
                    e4.i1(e4Var, true);
                    ph.w0 w0Var2 = e4Var.V1;
                    if (w0Var2 != null) {
                        b1Var = w0Var2.Q1;
                    }
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                org.telegram.messenger.i0.E2(b1Var);
                frameLayout2.addView(b1Var);
                break;
            default:
                vq0 vq0Var = (vq0) obj;
                uh.i iVar = (uh.i) view;
                q4 q4Var = i10 == 0 ? vq0Var.e : (q4) vq0Var.f.get(i10 - 1);
                q4Var.H(null);
                iVar.setList(q4Var);
                iVar.setVisibleHeight(vq0Var.w);
                break;
        }
    }

    @Override // org.telegram.ui.Components.p71
    public final View d(int i10) {
        int i11;
        int i12;
        int i13;
        p6 p6Var;
        jg.b1 b1Var;
        switch (this.a) {
            case 0:
                return i10 == 0 ? ((w0) this.b).b : ((v1) this.c).b;
            case 1:
                Context context = (Context) this.b;
                un unVar = (un) this.c;
                if (i10 == 0) {
                    return new hn(unVar, context);
                }
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 7);
                bundle.putInt("searchType", i10);
                bundle.putString("searchHashtag", unVar.I3);
                ik ikVar = new ik(context, unVar.getParentLayout(), bundle, 0);
                ikVar.h = false;
                vn vnVar = ikVar.a;
                vnVar.M.a = unVar.M;
                vnVar.va = unVar.xa;
                vnVar.wa = unVar;
                vnVar.j9 = new org.telegram.ui.e(this, 12);
                return ikVar;
            case 2:
                jx jxVar = (jx) this.c;
                zx zxVar = jxVar.L0;
                if (i10 == 1) {
                    return jxVar.W;
                }
                if (i10 == 3) {
                    return jxVar.h0;
                }
                if (i10 == 4) {
                    return jxVar.m0;
                }
                if (i10 == 5) {
                    return jxVar.t0;
                }
                if (i10 == 2) {
                    hm0 hm0Var = new hm0(jxVar.J0, zxVar);
                    jxVar.I0 = hm0Var;
                    hm0Var.b(jxVar.W0, jxVar.X0, false);
                    jxVar.I0.b.setClipToPadding(false);
                    jxVar.I0.b.j(new fn0(this, 0));
                    jxVar.I0.b.D0(new eb0(jxVar, 24));
                    jxVar.I0.setUiCallback(jxVar);
                    return jxVar.I0;
                }
                if (i10 == 6) {
                    return jxVar.r0;
                }
                y00 y00Var = new y00(zxVar);
                y00Var.setChatPreviewDelegate(jxVar.R0);
                y00Var.setUiCallback(jxVar);
                y00Var.j(jxVar.W0, jxVar.X0, false);
                tg.b bVar = jxVar.Z0;
                if (bVar != null) {
                    y00Var.setBlurredBackgroundDrawableFactory(bVar);
                }
                ag.b1 b1Var2 = y00Var.b;
                b1Var2.setClipToPadding(false);
                b1Var2.j(new fn0(this, 1));
                b1Var2.D0(new eb0(jxVar, 24));
                return y00Var;
            case 3:
                FrameLayout frameLayout = new FrameLayout((Context) this.b);
                frameLayout.setOnClickListener(new e50(this, 24));
                return frameLayout;
            case 4:
                return new a01((b01) this.c, (Context) this.b);
            case 5:
                FrameLayout frameLayout2 = new FrameLayout((Context) this.b);
                frameLayout2.setOnClickListener(new zz0(this, 9));
                return frameLayout2;
            case 6:
                jb1 jb1Var = (jb1) this.c;
                nb1 nb1Var = jb1Var.v0;
                if (i10 == 1) {
                    return jb1Var.V;
                }
                if (i10 == 2) {
                    i11 = ((k2) nb1Var).currentAccount;
                    hm0 hm0Var2 = new hm0(i11, nb1Var);
                    hm0Var2.b.j(new ib1(0));
                    hm0Var2.setUiCallback(jb1Var);
                    return hm0Var2;
                }
                y00 y00Var2 = new y00(nb1Var);
                y00Var2.setChatPreviewDelegate(jb1Var.t0);
                y00Var2.setUiCallback(jb1Var);
                y00Var2.b.j(new ib1(1));
                return y00Var2;
            case 7:
                return new bg0((Context) this.b, 16);
            case 8:
                org.telegram.ui.Wallet.b6 b6Var = (org.telegram.ui.Wallet.b6) this.c;
                v51[] v51VarArr = b6Var.r0;
                v51 v51Var = v51VarArr[i10];
                if (v51Var != null) {
                    return v51Var;
                }
                Context context2 = (Context) this.b;
                i12 = ((k2) b6Var).currentAccount;
                i13 = ((k2) b6Var).classGuid;
                org.telegram.ui.Components.p pVar = new org.telegram.ui.Components.p(this, i10, 2);
                i4 i4Var = new i4(b6Var);
                i4 i4Var2 = new i4(b6Var);
                p6Var = ((k2) b6Var).resourceProvider;
                my myVar = new my(context2, i12, i13, false, pVar, i4Var, i4Var2, p6Var, i10 == 1 ? 3 : -1, 1);
                if (i10 == 1) {
                    myVar.setPadding(org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(12.0f));
                }
                myVar.setFocusableInTouchMode(false);
                myVar.setClipChildren(false);
                myVar.setClipToPadding(false);
                if (i10 == 0) {
                    myVar.r1();
                } else {
                    myVar.setSelectorType(9);
                    myVar.setSelectorDrawableColor(0);
                }
                myVar.f3.r = false;
                myVar.j(new f41(this, i10));
                v51VarArr[i10] = myVar;
                return myVar;
            case 9:
                e4 e4Var = (e4) this.c;
                if (i10 == 0) {
                    e4.i1(e4Var, false);
                    ph.w0 w0Var = e4Var.U1;
                    if (w0Var != null) {
                        b1Var = w0Var.Q1;
                        org.telegram.messenger.i0.E2(b1Var);
                        FrameLayout frameLayout3 = new FrameLayout((Context) this.b);
                        frameLayout3.addView(b1Var, b6.e(-1, -1, at.E1));
                        return frameLayout3;
                    }
                    return null;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        e4.i1(e4Var, true);
                        ph.w0 w0Var2 = e4Var.V1;
                        if (w0Var2 != null) {
                            b1Var = w0Var2.Q1;
                        }
                    }
                    return null;
                }
                b1Var = e4Var.Q1;
                org.telegram.messenger.i0.E2(b1Var);
                FrameLayout frameLayout32 = new FrameLayout((Context) this.b);
                frameLayout32.addView(b1Var, b6.e(-1, -1, at.E1));
                return frameLayout32;
            default:
                return new uh.i((vq0) this.c, (Context) this.b);
        }
    }

    @Override // org.telegram.ui.Components.p71
    public final int e() {
        switch (this.a) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return ((ArrayList) this.b).size();
            case 3:
                return 2;
            case 4:
                return 5;
            case 5:
                return 2;
            case 6:
                return ((ArrayList) this.b).size();
            case 7:
                ((hd1) this.c).getClass();
                return 4;
            case 8:
                return ((org.telegram.ui.Wallet.b6) this.c).f0 ? 2 : 1;
            case 9:
                e4 e4Var = (e4) this.c;
                return (e4Var.I1(true) ? 1 : 0) + (e4Var.I1(false) ? 1 : 0) + 1;
            default:
                return ((vq0) this.c).f.size() + 1;
        }
    }

    @Override // org.telegram.ui.Components.p71
    public int f(int i10) {
        switch (this.a) {
            case 10:
                if (i10 == 0) {
                    return 0;
                }
                return ((q4) ((vq0) this.c).f.get(i10 - 1)).E.hashCode();
            default:
                return i10;
        }
    }

    @Override // org.telegram.ui.Components.p71
    public CharSequence g(int i10) {
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 1:
                return i10 != 1 ? i10 != 2 ? dd.L0(2131745726, null) : dd.L0(2131745729, null) : dd.L0(2131745755, null);
            case 2:
                ArrayList arrayList = (ArrayList) obj;
                if (((gn0) arrayList.get(i10)).a == 0) {
                    return dd.L0(2131745840, null);
                }
                if (((gn0) arrayList.get(i10)).a == 1) {
                    return dd.L0(2131752258, null);
                }
                if (((gn0) arrayList.get(i10)).a == 4) {
                    return dd.L0(2131754178, null);
                }
                if (((gn0) arrayList.get(i10)).a == 6) {
                    return dd.L0(2131745750, null);
                }
                if (((gn0) arrayList.get(i10)).a == 2) {
                    return dd.L0(2131751344, null);
                }
                if (((gn0) arrayList.get(i10)).a == 5) {
                    return dd.L0(2131746599, null);
                }
                zf.e0 e0Var = zf.g0.j3[((gn0) arrayList.get(i10)).b];
                String str = e0Var.c;
                return str != null ? str : dd.L0(e0Var.b, null);
            case 6:
                ArrayList arrayList2 = (ArrayList) obj;
                if (((gb1) arrayList2.get(i10)).a == 0) {
                    return dd.L0(2131745773, null);
                }
                if (((gb1) arrayList2.get(i10)).a == 1) {
                    return dd.L0(2131751344, null);
                }
                zf.e0 e0Var2 = zf.g0.j3[((gb1) arrayList2.get(i10)).b];
                String str2 = e0Var2.c;
                return str2 != null ? str2 : dd.L0(e0Var2.b, null);
            case 8:
                return dd.L0(i10 == 0 ? 2131743008 : 2131743196, null);
            case 10:
                if (i10 == 0) {
                    return dd.L0(2131746725, null);
                }
                String O0 = n31.O0(((q4) ((vq0) this.c).f.get(i10 - 1)).E, null, null);
                if (O0 == null) {
                    return null;
                }
                return O0.substring(0, 1).toUpperCase() + O0.substring(1);
            default:
                return super.g(i10);
        }
    }

    @Override // org.telegram.ui.Components.p71
    public int h(int i10) {
        switch (this.a) {
            case 0:
            case 1:
                return i10;
            case 2:
                ArrayList arrayList = (ArrayList) this.b;
                if (((gn0) arrayList.get(i10)).a == 0) {
                    return 1;
                }
                if (((gn0) arrayList.get(i10)).a == 1) {
                    return 3;
                }
                if (((gn0) arrayList.get(i10)).a == 4) {
                    return 4;
                }
                if (((gn0) arrayList.get(i10)).a == 2) {
                    return 2;
                }
                if (((gn0) arrayList.get(i10)).a == 5) {
                    return 5;
                }
                if (((gn0) arrayList.get(i10)).a == 6) {
                    return 6;
                }
                return ((gn0) arrayList.get(i10)).a + i10;
            case 3:
            case 5:
            case 7:
            default:
                return super.h(i10);
            case 4:
                return i10 == 0 ? 0 : 1;
            case 6:
                ArrayList arrayList2 = (ArrayList) this.b;
                if (((gb1) arrayList2.get(i10)).a == 0) {
                    return 1;
                }
                if (((gb1) arrayList2.get(i10)).a == 1) {
                    return 2;
                }
                return ((gb1) arrayList2.get(i10)).a + i10;
            case 8:
                return i10;
            case 9:
                return (i10 - (((e4) this.c).I1(false) ? 1 : 0)) + 1;
        }
    }

    public void l() {
        ArrayList arrayList = (ArrayList) this.b;
        arrayList.clear();
        arrayList.add(new gn0(0));
        jx jxVar = (jx) this.c;
        if (jxVar.V0 != 0) {
            return;
        }
        if (jxVar.s0) {
            arrayList.add(new gn0(5));
        }
        arrayList.add(new gn0(1));
        arrayList.add(new gn0(4));
        arrayList.add(new gn0(6));
        if (jxVar.Q0) {
            return;
        }
        gn0 gn0Var = new gn0(3);
        gn0Var.b = 0;
        arrayList.add(gn0Var);
        ww wwVar = jxVar.d1.F3;
        if (wwVar == null || !wwVar.c()) {
            arrayList.add(new gn0(2));
        }
        gn0 gn0Var2 = new gn0(3);
        gn0Var2.b = 1;
        arrayList.add(gn0Var2);
        gn0 gn0Var3 = new gn0(3);
        gn0Var3.b = 2;
        arrayList.add(gn0Var3);
        gn0 gn0Var4 = new gn0(3);
        gn0Var4.b = 3;
        arrayList.add(gn0Var4);
        gn0 gn0Var5 = new gn0(3);
        gn0Var5.b = 4;
        arrayList.add(gn0Var5);
    }

    public s(w0 w0Var, v1 v1Var) {
        this.a = 0;
        this.b = w0Var;
        this.c = v1Var;
    }

    public s(jx jxVar) {
        this.a = 2;
        this.c = jxVar;
        this.b = new ArrayList();
        l();
    }

    public s(jb1 jb1Var) {
        this.a = 6;
        this.c = jb1Var;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(new gb1(0));
        gb1 gb1Var = new gb1(2);
        gb1Var.b = 0;
        arrayList.add(gb1Var);
        gb1 gb1Var2 = new gb1(2);
        gb1Var2.b = 1;
        arrayList.add(gb1Var2);
        gb1 gb1Var3 = new gb1(2);
        gb1Var3.b = 2;
        arrayList.add(gb1Var3);
        gb1 gb1Var4 = new gb1(2);
        gb1Var4.b = 3;
        arrayList.add(gb1Var4);
        gb1 gb1Var5 = new gb1(2);
        gb1Var5.b = 4;
        arrayList.add(gb1Var5);
    }

    private final void i(View view, int i10, int i11) {
    }

    private final void j(View view, int i10, int i11) {
    }

    private final void k(View view, int i10, int i11) {
    }
}
