package di;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.ui.Components.b31;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.t31;
import org.telegram.ui.Components.tm0;
import org.telegram.ui.bn;
import org.telegram.ui.c00;
import org.telegram.ui.cn;
import org.telegram.ui.cx;
import org.telegram.ui.dn;
import org.telegram.ui.et;
import org.telegram.ui.ih0;
import org.telegram.ui.j40;
import org.telegram.ui.kw;
import org.telegram.ui.nj;
import org.telegram.ui.ob1;
import org.telegram.ui.om;
import org.telegram.ui.oy0;
import org.telegram.ui.py0;
import org.telegram.ui.qb1;
import org.telegram.ui.qy0;
import org.telegram.ui.r91;
import org.telegram.ui.t91;
import org.telegram.ui.u91;
import org.telegram.ui.xv;
import org.telegram.ui.y91;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class i4 extends b71 {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i4(int i7, Context context, Object obj) {
        this.a = i7;
        this.c = obj;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.b71
    public final void b(View view, int i7, int i10) {
        n4 n4Var;
        org.telegram.ui.ActionBar.g2 g2Var;
        int i11 = this.a;
        Object obj = this.c;
        switch (i11) {
            case 0:
                f6 f6Var = (f6) obj;
                if (i10 == 0) {
                    f6.j1(f6Var, false);
                    bi.z2 z2Var = f6Var.Y1;
                    if (z2Var != null) {
                        n4Var = z2Var.U1;
                    }
                } else if (i10 == 2) {
                    f6.j1(f6Var, true);
                    bi.z2 z2Var2 = f6Var.Z1;
                    if (z2Var2 != null) {
                        n4Var = z2Var2.U1;
                    }
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                org.telegram.messenger.g0.E2(n4Var);
                frameLayout.addView(n4Var);
                break;
            case 1:
                fq0 fq0Var = (fq0) obj;
                gi.m mVar = (gi.m) view;
                fi.a6 a6Var = i7 == 0 ? fq0Var.e : (fi.a6) fq0Var.f.get(i7 - 1);
                a6Var.H(null);
                mVar.setList(a6Var);
                mVar.setVisibleHeight(fq0Var.w);
                break;
            case 2:
                if (view instanceof dn) {
                    ((dn) view).a.rd(((bn) obj).J3);
                }
                WeakHashMap weakHashMap = r0.i0.a;
                r0.y.c(view);
                break;
            case 3:
                kw kwVar = (kw) obj;
                kwVar.L(view, i7, kwVar.N0, true);
                break;
            case 5:
                ((py0) view).a(i10);
                break;
            case 7:
                u91 u91Var = (u91) obj;
                u91Var.I(view, i7, u91Var.e0, true);
                break;
            case 8:
                qb1 qb1Var = (qb1) obj;
                SparseArray sparseArray = qb1Var.a;
                ob1 ob1Var = (ob1) sparseArray.get(i7);
                if (ob1Var != null) {
                    g2Var = ob1Var.a;
                } else {
                    org.telegram.ui.ActionBar.g2 a02 = qb1Var.a0(i7);
                    ob1 ob1Var2 = new ob1(a02);
                    sparseArray.put(i7, ob1Var2);
                    g2Var = a02;
                    ob1Var = ob1Var2;
                }
                if (!ob1Var.b) {
                    g2Var.onFragmentCreate();
                    ob1Var.b = true;
                }
                g2Var.setParentLayout(qb1Var.getParentLayout());
                g2Var.setSimpleMenuOverlayHost(qb1Var);
                if (g2Var.getFragmentView() == null) {
                    g2Var.performCreateView((Context) this.b);
                    g2Var.setTitleOverlayText(qb1Var.n, qb1Var.r, qb1Var.s);
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                View fragmentView = g2Var.getFragmentView();
                org.telegram.messenger.g0.E2(fragmentView);
                if (!g2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, fragmentView, null);
                }
                frameLayout2.addView(fragmentView, c8.ma.c(-1.0f, -1));
                if (g2Var.getActionBar() != null && g2Var.getActionBar().L) {
                    org.telegram.messenger.g0.E2(g2Var.getActionBar());
                    frameLayout2.addView(g2Var.getActionBar());
                }
                WeakHashMap weakHashMap2 = r0.i0.a;
                r0.y.c(frameLayout2);
                qb1Var.checkSystemBarColors();
                qb1Var.Z();
                break;
            case 9:
                org.telegram.ui.Wallet.n6.d1((h51) view, false);
                break;
        }
    }

    @Override // org.telegram.ui.Components.b71
    public final View d(int i7) {
        n4 n4Var;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.h6 h6Var;
        ri.q qVar;
        switch (this.a) {
            case 0:
                f6 f6Var = (f6) this.c;
                if (i7 == 0) {
                    f6.j1(f6Var, false);
                    bi.z2 z2Var = f6Var.Y1;
                    if (z2Var != null) {
                        n4Var = z2Var.U1;
                        org.telegram.messenger.g0.E2(n4Var);
                        FrameLayout frameLayout = new FrameLayout((Context) this.b);
                        frameLayout.addView(n4Var, c8.ma.e(-1, -1, ls.E1));
                        return frameLayout;
                    }
                    return null;
                }
                if (i7 != 1) {
                    if (i7 == 2) {
                        f6.j1(f6Var, true);
                        bi.z2 z2Var2 = f6Var.Z1;
                        if (z2Var2 != null) {
                            n4Var = z2Var2.U1;
                        }
                    }
                    return null;
                }
                n4Var = f6Var.U1;
                org.telegram.messenger.g0.E2(n4Var);
                FrameLayout frameLayout2 = new FrameLayout((Context) this.b);
                frameLayout2.addView(n4Var, c8.ma.e(-1, -1, ls.E1));
                return frameLayout2;
            case 1:
                return new gi.m((fq0) this.c, (Context) this.b);
            case 2:
                Context context = (Context) this.b;
                bn bnVar = (bn) this.c;
                if (i7 == 0) {
                    return new om(bnVar, context);
                }
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 7);
                bundle.putInt("searchType", i7);
                bundle.putString("searchHashtag", bnVar.J3);
                nj njVar = new nj(context, bnVar.getParentLayout(), bundle, 0);
                njVar.h = false;
                cn cnVar = njVar.a;
                cnVar.N.a = bnVar.N;
                cnVar.za = bnVar.Ba;
                cnVar.Aa = bnVar;
                cnVar.n9 = new org.telegram.ui.f(this, 12);
                return njVar;
            case 3:
                kw kwVar = (kw) this.c;
                cx cxVar = kwVar.M0;
                if (i7 == 1) {
                    return kwVar.a0;
                }
                if (i7 == 3) {
                    return kwVar.i0;
                }
                if (i7 == 4) {
                    return kwVar.n0;
                }
                if (i7 == 5) {
                    return kwVar.u0;
                }
                if (i7 == 2) {
                    sl0 sl0Var = new sl0(kwVar.K0, cxVar);
                    kwVar.J0 = sl0Var;
                    sl0Var.b(kwVar.X0, kwVar.Y0, false);
                    kwVar.J0.b.setClipToPadding(false);
                    kwVar.J0.b.j(new sm0(this, 0));
                    kwVar.J0.b.D0(new hb0(kwVar, 22));
                    kwVar.J0.setUiCallback(kwVar);
                    return kwVar.J0;
                }
                if (i7 == 6) {
                    return kwVar.s0;
                }
                c00 c00Var = new c00(cxVar);
                c00Var.setChatPreviewDelegate(kwVar.S0);
                c00Var.setUiCallback(kwVar);
                c00Var.j(kwVar.X0, kwVar.Y0, false);
                dh.c cVar = kwVar.a1;
                if (cVar != null) {
                    c00Var.setBlurredBackgroundDrawableFactory(cVar);
                }
                et etVar = c00Var.b;
                etVar.setClipToPadding(false);
                etVar.j(new sm0(this, 1));
                etVar.D0(new hb0(kwVar, 22));
                return c00Var;
            case 4:
                FrameLayout frameLayout3 = new FrameLayout((Context) this.b);
                frameLayout3.setOnClickListener(new j40(this, 24));
                return frameLayout3;
            case 5:
                return new py0((qy0) this.c, (Context) this.b);
            case 6:
                FrameLayout frameLayout4 = new FrameLayout((Context) this.b);
                frameLayout4.setOnClickListener(new oy0(this, 9));
                return frameLayout4;
            case 7:
                u91 u91Var = (u91) this.c;
                y91 y91Var = u91Var.w0;
                if (i7 == 1) {
                    return u91Var.W;
                }
                if (i7 == 2) {
                    i10 = ((org.telegram.ui.ActionBar.g2) y91Var).currentAccount;
                    sl0 sl0Var2 = new sl0(i10, y91Var);
                    sl0Var2.b.j(new t91(0));
                    sl0Var2.setUiCallback(u91Var);
                    return sl0Var2;
                }
                c00 c00Var2 = new c00(y91Var);
                c00Var2.setChatPreviewDelegate(u91Var.u0);
                c00Var2.setUiCallback(u91Var);
                c00Var2.b.j(new t91(1));
                return c00Var2;
            case 8:
                return new ih0((Context) this.b, 15);
            case 9:
                org.telegram.ui.Wallet.n6 n6Var = (org.telegram.ui.Wallet.n6) this.c;
                h51[] h51VarArr = n6Var.u0;
                h51 h51Var = h51VarArr[i7];
                if (h51Var != null) {
                    return h51Var;
                }
                Context context2 = (Context) this.b;
                i11 = ((org.telegram.ui.ActionBar.g2) n6Var).currentAccount;
                i12 = ((org.telegram.ui.ActionBar.g2) n6Var).classGuid;
                org.telegram.ui.Components.u uVar = new org.telegram.ui.Components.u(this, i7, 1);
                org.telegram.ui.Wallet.o4 o4Var = new org.telegram.ui.Wallet.o4(n6Var);
                org.telegram.ui.Wallet.o4 o4Var2 = new org.telegram.ui.Wallet.o4(n6Var);
                h6Var = ((org.telegram.ui.ActionBar.g2) n6Var).resourceProvider;
                bi.i7 i7Var = new bi.i7(context2, i11, i12, false, uVar, o4Var, o4Var2, h6Var, i7 == 1 ? 3 : -1, 1);
                h51VarArr[i7] = i7Var;
                n6Var.e1(i7);
                qVar = ((org.telegram.ui.ActionBar.g2) n6Var).glassEngine;
                qVar.b(i7Var);
                i7Var.setFocusableInTouchMode(false);
                i7Var.setClipChildren(false);
                i7Var.setClipToPadding(false);
                if (i7 == 0) {
                    i7Var.r1();
                } else {
                    i7Var.setSelectorType(9);
                    i7Var.setSelectorDrawableColor(0);
                }
                i7Var.g3.r = false;
                i7Var.j(new t31(this, i7));
                h51VarArr[i7] = i7Var;
                return i7Var;
            default:
                return i7 == 0 ? ((wg.a0) this.b).b : ((wg.w0) this.c).b;
        }
    }

    @Override // org.telegram.ui.Components.b71
    public final int e() {
        switch (this.a) {
            case 0:
                f6 f6Var = (f6) this.c;
                return (f6Var.N1(true) ? 1 : 0) + (f6Var.N1(false) ? 1 : 0) + 1;
            case 1:
                return ((fq0) this.c).f.size() + 1;
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
                ((qb1) this.c).getClass();
                return 4;
            case 9:
                return ((org.telegram.ui.Wallet.n6) this.c).g0 ? 2 : 1;
            default:
                return 2;
        }
    }

    @Override // org.telegram.ui.Components.b71
    public int f(int i7) {
        switch (this.a) {
            case 1:
                if (i7 == 0) {
                    return 0;
                }
                return ((fi.a6) ((fq0) this.c).f.get(i7 - 1)).E.hashCode();
            default:
                return i7;
        }
    }

    @Override // org.telegram.ui.Components.b71
    public CharSequence g(int i7) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 1:
                return i7 == 0 ? hd.N0(2131746514, null) : b31.Q0(((fi.a6) ((fq0) this.c).f.get(i7 - 1)).E);
            case 2:
                return i7 != 1 ? i7 != 2 ? hd.N0(2131745513, null) : hd.N0(2131745516, null) : hd.N0(2131745542, null);
            case 3:
                ArrayList arrayList = (ArrayList) obj;
                if (((tm0) arrayList.get(i7)).a == 0) {
                    return hd.N0(2131745627, null);
                }
                if (((tm0) arrayList.get(i7)).a == 1) {
                    return hd.N0(2131752246, null);
                }
                if (((tm0) arrayList.get(i7)).a == 4) {
                    return hd.N0(2131754175, null);
                }
                if (((tm0) arrayList.get(i7)).a == 6) {
                    return hd.N0(2131745537, null);
                }
                if (((tm0) arrayList.get(i7)).a == 2) {
                    return hd.N0(2131751331, null);
                }
                if (((tm0) arrayList.get(i7)).a == 5) {
                    return hd.N0(2131746388, null);
                }
                jg.o0 o0Var = jg.q0.k3[((tm0) arrayList.get(i7)).b];
                String str = o0Var.c;
                return str != null ? str : hd.N0(o0Var.b, null);
            case 4:
            case 5:
            case 6:
            case 8:
            default:
                return super.g(i7);
            case 7:
                ArrayList arrayList2 = (ArrayList) obj;
                if (((r91) arrayList2.get(i7)).a == 0) {
                    return hd.N0(2131745560, null);
                }
                if (((r91) arrayList2.get(i7)).a == 1) {
                    return hd.N0(2131751331, null);
                }
                jg.o0 o0Var2 = jg.q0.k3[((r91) arrayList2.get(i7)).b];
                String str2 = o0Var2.c;
                return str2 != null ? str2 : hd.N0(o0Var2.b, null);
            case 9:
                return hd.N0(i7 == 0 ? 2131742716 : 2131742924, null);
        }
    }

    @Override // org.telegram.ui.Components.b71
    public int h(int i7) {
        switch (this.a) {
            case 0:
                return (i7 - (((f6) this.c).N1(false) ? 1 : 0)) + 1;
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
                if (((tm0) arrayList.get(i7)).a == 0) {
                    return 1;
                }
                if (((tm0) arrayList.get(i7)).a == 1) {
                    return 3;
                }
                if (((tm0) arrayList.get(i7)).a == 4) {
                    return 4;
                }
                if (((tm0) arrayList.get(i7)).a == 2) {
                    return 2;
                }
                if (((tm0) arrayList.get(i7)).a == 5) {
                    return 5;
                }
                if (((tm0) arrayList.get(i7)).a == 6) {
                    return 6;
                }
                return ((tm0) arrayList.get(i7)).a + i7;
            case 5:
                return i7 == 0 ? 0 : 1;
            case 7:
                ArrayList arrayList2 = (ArrayList) this.b;
                if (((r91) arrayList2.get(i7)).a == 0) {
                    return 1;
                }
                if (((r91) arrayList2.get(i7)).a == 1) {
                    return 2;
                }
                return ((r91) arrayList2.get(i7)).a + i7;
            case 9:
            case 10:
                return i7;
        }
    }

    public void l() {
        ArrayList arrayList = (ArrayList) this.b;
        arrayList.clear();
        arrayList.add(new tm0(0));
        kw kwVar = (kw) this.c;
        if (kwVar.W0 != 0) {
            return;
        }
        if (kwVar.t0) {
            arrayList.add(new tm0(5));
        }
        arrayList.add(new tm0(1));
        arrayList.add(new tm0(4));
        arrayList.add(new tm0(6));
        if (kwVar.R0) {
            return;
        }
        tm0 tm0Var = new tm0(3);
        tm0Var.b = 0;
        arrayList.add(tm0Var);
        xv xvVar = kwVar.e1.H3;
        if (xvVar == null || !xvVar.c()) {
            arrayList.add(new tm0(2));
        }
        tm0 tm0Var2 = new tm0(3);
        tm0Var2.b = 1;
        arrayList.add(tm0Var2);
        tm0 tm0Var3 = new tm0(3);
        tm0Var3.b = 2;
        arrayList.add(tm0Var3);
        tm0 tm0Var4 = new tm0(3);
        tm0Var4.b = 3;
        arrayList.add(tm0Var4);
        tm0 tm0Var5 = new tm0(3);
        tm0Var5.b = 4;
        arrayList.add(tm0Var5);
    }

    public i4(kw kwVar) {
        this.a = 3;
        this.c = kwVar;
        this.b = new ArrayList();
        l();
    }

    public i4(u91 u91Var) {
        this.a = 7;
        this.c = u91Var;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(new r91(0));
        r91 r91Var = new r91(2);
        r91Var.b = 0;
        arrayList.add(r91Var);
        r91 r91Var2 = new r91(2);
        r91Var2.b = 1;
        arrayList.add(r91Var2);
        r91 r91Var3 = new r91(2);
        r91Var3.b = 2;
        arrayList.add(r91Var3);
        r91 r91Var4 = new r91(2);
        r91Var4.b = 3;
        arrayList.add(r91Var4);
        r91 r91Var5 = new r91(2);
        r91Var5.b = 4;
        arrayList.add(r91Var5);
    }

    public i4(wg.a0 a0Var, wg.w0 w0Var) {
        this.a = 10;
        this.b = a0Var;
        this.c = w0Var;
    }

    private final void i(View view, int i7, int i10) {
    }

    private final void j(View view, int i7, int i10) {
    }

    private final void k(View view, int i7, int i10) {
    }
}
