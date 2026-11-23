package di;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.a31;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.s31;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.b00;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.cn;
import org.telegram.ui.dn;
import org.telegram.ui.dt;
import org.telegram.ui.gh0;
import org.telegram.ui.i40;
import org.telegram.ui.jw;
import org.telegram.ui.mb1;
import org.telegram.ui.nj;
import org.telegram.ui.ny0;
import org.telegram.ui.ob1;
import org.telegram.ui.om;
import org.telegram.ui.oy0;
import org.telegram.ui.p91;
import org.telegram.ui.py0;
import org.telegram.ui.r91;
import org.telegram.ui.s91;
import org.telegram.ui.w91;
import org.telegram.ui.wv;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class i4 extends c71 {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i4(int i7, Context context, Object obj) {
        this.a = i7;
        this.c = obj;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.c71
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
                    bi.b3 b3Var = f6Var.Y1;
                    if (b3Var != null) {
                        n4Var = b3Var.U1;
                    }
                } else if (i10 == 2) {
                    f6.j1(f6Var, true);
                    bi.b3 b3Var2 = f6Var.Z1;
                    if (b3Var2 != null) {
                        n4Var = b3Var2.U1;
                    }
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                org.telegram.messenger.g0.E2(n4Var);
                frameLayout.addView(n4Var);
                break;
            case 1:
                eq0 eq0Var = (eq0) obj;
                gi.m mVar = (gi.m) view;
                fi.a6 a6Var = i7 == 0 ? eq0Var.e : (fi.a6) eq0Var.f.get(i7 - 1);
                a6Var.H(null);
                mVar.setList(a6Var);
                mVar.setVisibleHeight(eq0Var.w);
                break;
            case 2:
                if (view instanceof dn) {
                    ((dn) view).a.rd(((bn) obj).J3);
                }
                WeakHashMap weakHashMap = r0.i0.a;
                r0.y.c(view);
                break;
            case 3:
                jw jwVar = (jw) obj;
                jwVar.N(view, i7, jwVar.N0, true);
                break;
            case 5:
                ((oy0) view).a(i10);
                break;
            case 7:
                s91 s91Var = (s91) obj;
                s91Var.K(view, i7, s91Var.e0, true);
                break;
            case 8:
                ob1 ob1Var = (ob1) obj;
                SparseArray sparseArray = ob1Var.a;
                mb1 mb1Var = (mb1) sparseArray.get(i7);
                if (mb1Var != null) {
                    g2Var = mb1Var.a;
                } else {
                    org.telegram.ui.ActionBar.g2 a02 = ob1Var.a0(i7);
                    mb1 mb1Var2 = new mb1(a02);
                    sparseArray.put(i7, mb1Var2);
                    g2Var = a02;
                    mb1Var = mb1Var2;
                }
                if (!mb1Var.b) {
                    g2Var.onFragmentCreate();
                    mb1Var.b = true;
                }
                g2Var.setParentLayout(ob1Var.getParentLayout());
                g2Var.setSimpleMenuOverlayHost(ob1Var);
                if (g2Var.getFragmentView() == null) {
                    g2Var.performCreateView((Context) this.b);
                    g2Var.setTitleOverlayText(ob1Var.n, ob1Var.r, ob1Var.s);
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                View fragmentView = g2Var.getFragmentView();
                org.telegram.messenger.g0.E2(fragmentView);
                if (!g2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, fragmentView, null);
                }
                frameLayout2.addView(fragmentView, c8.na.c(-1.0f, -1));
                if (g2Var.getActionBar() != null && g2Var.getActionBar().L) {
                    org.telegram.messenger.g0.E2(g2Var.getActionBar());
                    frameLayout2.addView(g2Var.getActionBar());
                }
                WeakHashMap weakHashMap2 = r0.i0.a;
                r0.y.c(frameLayout2);
                ob1Var.checkSystemBarColors();
                ob1Var.Z();
                break;
            case 9:
                org.telegram.ui.Wallet.o6.d1((g51) view, false);
                break;
        }
    }

    @Override // org.telegram.ui.Components.c71
    public final View d(int i7) {
        n4 n4Var;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.i6 i6Var;
        ri.q qVar;
        switch (this.a) {
            case 0:
                f6 f6Var = (f6) this.c;
                if (i7 == 0) {
                    f6.j1(f6Var, false);
                    bi.b3 b3Var = f6Var.Y1;
                    if (b3Var != null) {
                        n4Var = b3Var.U1;
                        org.telegram.messenger.g0.E2(n4Var);
                        FrameLayout frameLayout = new FrameLayout((Context) this.b);
                        frameLayout.addView(n4Var, c8.na.e(-1, -1, ks.E1));
                        return frameLayout;
                    }
                    return null;
                }
                if (i7 != 1) {
                    if (i7 == 2) {
                        f6.j1(f6Var, true);
                        bi.b3 b3Var2 = f6Var.Z1;
                        if (b3Var2 != null) {
                            n4Var = b3Var2.U1;
                        }
                    }
                    return null;
                }
                n4Var = f6Var.U1;
                org.telegram.messenger.g0.E2(n4Var);
                FrameLayout frameLayout2 = new FrameLayout((Context) this.b);
                frameLayout2.addView(n4Var, c8.na.e(-1, -1, ks.E1));
                return frameLayout2;
            case 1:
                return new gi.m((eq0) this.c, (Context) this.b);
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
                jw jwVar = (jw) this.c;
                bx bxVar = jwVar.M0;
                if (i7 == 1) {
                    return jwVar.a0;
                }
                if (i7 == 3) {
                    return jwVar.i0;
                }
                if (i7 == 4) {
                    return jwVar.n0;
                }
                if (i7 == 5) {
                    return jwVar.u0;
                }
                if (i7 == 2) {
                    sl0 sl0Var = new sl0(jwVar.K0, bxVar);
                    jwVar.J0 = sl0Var;
                    sl0Var.b(jwVar.X0, jwVar.Y0, false);
                    jwVar.J0.b.setClipToPadding(false);
                    jwVar.J0.b.j(new rm0(this, 0));
                    jwVar.J0.b.D0(new eb0(jwVar, 22));
                    jwVar.J0.setUiCallback(jwVar);
                    return jwVar.J0;
                }
                if (i7 == 6) {
                    return jwVar.s0;
                }
                b00 b00Var = new b00(bxVar);
                b00Var.setChatPreviewDelegate(jwVar.S0);
                b00Var.setUiCallback(jwVar);
                b00Var.j(jwVar.X0, jwVar.Y0, false);
                dh.c cVar = jwVar.a1;
                if (cVar != null) {
                    b00Var.setBlurredBackgroundDrawableFactory(cVar);
                }
                dt dtVar = b00Var.b;
                dtVar.setClipToPadding(false);
                dtVar.j(new rm0(this, 1));
                dtVar.D0(new eb0(jwVar, 22));
                return b00Var;
            case 4:
                FrameLayout frameLayout3 = new FrameLayout((Context) this.b);
                frameLayout3.setOnClickListener(new i40(this, 24));
                return frameLayout3;
            case 5:
                return new oy0((py0) this.c, (Context) this.b);
            case 6:
                FrameLayout frameLayout4 = new FrameLayout((Context) this.b);
                frameLayout4.setOnClickListener(new ny0(this, 9));
                return frameLayout4;
            case 7:
                s91 s91Var = (s91) this.c;
                w91 w91Var = s91Var.w0;
                if (i7 == 1) {
                    return s91Var.W;
                }
                if (i7 == 2) {
                    i10 = ((org.telegram.ui.ActionBar.g2) w91Var).currentAccount;
                    sl0 sl0Var2 = new sl0(i10, w91Var);
                    sl0Var2.b.j(new r91(0));
                    sl0Var2.setUiCallback(s91Var);
                    return sl0Var2;
                }
                b00 b00Var2 = new b00(w91Var);
                b00Var2.setChatPreviewDelegate(s91Var.u0);
                b00Var2.setUiCallback(s91Var);
                b00Var2.b.j(new r91(1));
                return b00Var2;
            case 8:
                return new gh0((Context) this.b, 15);
            case 9:
                org.telegram.ui.Wallet.o6 o6Var = (org.telegram.ui.Wallet.o6) this.c;
                g51[] g51VarArr = o6Var.u0;
                g51 g51Var = g51VarArr[i7];
                if (g51Var != null) {
                    return g51Var;
                }
                Context context2 = (Context) this.b;
                i11 = ((org.telegram.ui.ActionBar.g2) o6Var).currentAccount;
                i12 = ((org.telegram.ui.ActionBar.g2) o6Var).classGuid;
                org.telegram.ui.Components.t tVar = new org.telegram.ui.Components.t(this, i7, 1);
                org.telegram.ui.Wallet.p4 p4Var = new org.telegram.ui.Wallet.p4(o6Var);
                org.telegram.ui.Wallet.p4 p4Var2 = new org.telegram.ui.Wallet.p4(o6Var);
                i6Var = ((org.telegram.ui.ActionBar.g2) o6Var).resourceProvider;
                bi.l7 l7Var = new bi.l7(context2, i11, i12, false, tVar, p4Var, p4Var2, i6Var, i7 == 1 ? 3 : -1, 1);
                g51VarArr[i7] = l7Var;
                o6Var.e1(i7);
                qVar = ((org.telegram.ui.ActionBar.g2) o6Var).glassEngine;
                qVar.b(l7Var);
                l7Var.setFocusableInTouchMode(false);
                l7Var.setClipChildren(false);
                l7Var.setClipToPadding(false);
                if (i7 == 0) {
                    l7Var.r1();
                } else {
                    l7Var.setSelectorType(9);
                    l7Var.setSelectorDrawableColor(0);
                }
                l7Var.g3.r = false;
                l7Var.j(new s31(this, i7));
                g51VarArr[i7] = l7Var;
                return l7Var;
            default:
                return i7 == 0 ? ((wg.z) this.b).b : ((wg.v0) this.c).b;
        }
    }

    @Override // org.telegram.ui.Components.c71
    public final int e() {
        switch (this.a) {
            case 0:
                f6 f6Var = (f6) this.c;
                return (f6Var.N1(true) ? 1 : 0) + (f6Var.N1(false) ? 1 : 0) + 1;
            case 1:
                return ((eq0) this.c).f.size() + 1;
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
                ((ob1) this.c).getClass();
                return 4;
            case 9:
                return ((org.telegram.ui.Wallet.o6) this.c).g0 ? 2 : 1;
            default:
                return 2;
        }
    }

    @Override // org.telegram.ui.Components.c71
    public int f(int i7) {
        switch (this.a) {
            case 1:
                if (i7 == 0) {
                    return 0;
                }
                return ((fi.a6) ((eq0) this.c).f.get(i7 - 1)).E.hashCode();
            default:
                return i7;
        }
    }

    @Override // org.telegram.ui.Components.c71
    public CharSequence g(int i7) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 1:
                return i7 == 0 ? gd.N0(2131746514, null) : a31.Q0(((fi.a6) ((eq0) this.c).f.get(i7 - 1)).E);
            case 2:
                return i7 != 1 ? i7 != 2 ? gd.N0(2131745513, null) : gd.N0(2131745516, null) : gd.N0(2131745542, null);
            case 3:
                ArrayList arrayList = (ArrayList) obj;
                if (((sm0) arrayList.get(i7)).a == 0) {
                    return gd.N0(2131745627, null);
                }
                if (((sm0) arrayList.get(i7)).a == 1) {
                    return gd.N0(2131752246, null);
                }
                if (((sm0) arrayList.get(i7)).a == 4) {
                    return gd.N0(2131754175, null);
                }
                if (((sm0) arrayList.get(i7)).a == 6) {
                    return gd.N0(2131745537, null);
                }
                if (((sm0) arrayList.get(i7)).a == 2) {
                    return gd.N0(2131751331, null);
                }
                if (((sm0) arrayList.get(i7)).a == 5) {
                    return gd.N0(2131746388, null);
                }
                jg.o0 o0Var = jg.q0.k3[((sm0) arrayList.get(i7)).b];
                String str = o0Var.c;
                return str != null ? str : gd.N0(o0Var.b, null);
            case 4:
            case 5:
            case 6:
            case 8:
            default:
                return super.g(i7);
            case 7:
                ArrayList arrayList2 = (ArrayList) obj;
                if (((p91) arrayList2.get(i7)).a == 0) {
                    return gd.N0(2131745560, null);
                }
                if (((p91) arrayList2.get(i7)).a == 1) {
                    return gd.N0(2131751331, null);
                }
                jg.o0 o0Var2 = jg.q0.k3[((p91) arrayList2.get(i7)).b];
                String str2 = o0Var2.c;
                return str2 != null ? str2 : gd.N0(o0Var2.b, null);
            case 9:
                return gd.N0(i7 == 0 ? 2131742711 : 2131742919, null);
        }
    }

    @Override // org.telegram.ui.Components.c71
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
                if (((sm0) arrayList.get(i7)).a == 0) {
                    return 1;
                }
                if (((sm0) arrayList.get(i7)).a == 1) {
                    return 3;
                }
                if (((sm0) arrayList.get(i7)).a == 4) {
                    return 4;
                }
                if (((sm0) arrayList.get(i7)).a == 2) {
                    return 2;
                }
                if (((sm0) arrayList.get(i7)).a == 5) {
                    return 5;
                }
                if (((sm0) arrayList.get(i7)).a == 6) {
                    return 6;
                }
                return ((sm0) arrayList.get(i7)).a + i7;
            case 5:
                return i7 == 0 ? 0 : 1;
            case 7:
                ArrayList arrayList2 = (ArrayList) this.b;
                if (((p91) arrayList2.get(i7)).a == 0) {
                    return 1;
                }
                if (((p91) arrayList2.get(i7)).a == 1) {
                    return 2;
                }
                return ((p91) arrayList2.get(i7)).a + i7;
            case 9:
            case 10:
                return i7;
        }
    }

    public void l() {
        ArrayList arrayList = (ArrayList) this.b;
        arrayList.clear();
        arrayList.add(new sm0(0));
        jw jwVar = (jw) this.c;
        if (jwVar.W0 != 0) {
            return;
        }
        if (jwVar.t0) {
            arrayList.add(new sm0(5));
        }
        arrayList.add(new sm0(1));
        arrayList.add(new sm0(4));
        arrayList.add(new sm0(6));
        if (jwVar.R0) {
            return;
        }
        sm0 sm0Var = new sm0(3);
        sm0Var.b = 0;
        arrayList.add(sm0Var);
        wv wvVar = jwVar.e1.H3;
        if (wvVar == null || !wvVar.c()) {
            arrayList.add(new sm0(2));
        }
        sm0 sm0Var2 = new sm0(3);
        sm0Var2.b = 1;
        arrayList.add(sm0Var2);
        sm0 sm0Var3 = new sm0(3);
        sm0Var3.b = 2;
        arrayList.add(sm0Var3);
        sm0 sm0Var4 = new sm0(3);
        sm0Var4.b = 3;
        arrayList.add(sm0Var4);
        sm0 sm0Var5 = new sm0(3);
        sm0Var5.b = 4;
        arrayList.add(sm0Var5);
    }

    public i4(jw jwVar) {
        this.a = 3;
        this.c = jwVar;
        this.b = new ArrayList();
        l();
    }

    public i4(s91 s91Var) {
        this.a = 7;
        this.c = s91Var;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(new p91(0));
        p91 p91Var = new p91(2);
        p91Var.b = 0;
        arrayList.add(p91Var);
        p91 p91Var2 = new p91(2);
        p91Var2.b = 1;
        arrayList.add(p91Var2);
        p91 p91Var3 = new p91(2);
        p91Var3.b = 2;
        arrayList.add(p91Var3);
        p91 p91Var4 = new p91(2);
        p91Var4.b = 3;
        arrayList.add(p91Var4);
        p91 p91Var5 = new p91(2);
        p91Var5.b = 4;
        arrayList.add(p91Var5);
    }

    public i4(wg.z zVar, wg.v0 v0Var) {
        this.a = 10;
        this.b = zVar;
        this.c = v0Var;
    }

    private final void i(View view, int i7, int i10) {
    }

    private final void j(View view, int i7, int i10) {
    }

    private final void k(View view, int i7, int i10) {
    }
}
