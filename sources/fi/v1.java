package fi;

import android.content.SharedPreferences;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bz;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.td;
import org.telegram.ui.Components.ti;
import org.telegram.ui.an0;
import org.telegram.ui.b61;
import org.telegram.ui.bn;
import org.telegram.ui.bn0;
import org.telegram.ui.dg0;
import org.telegram.ui.dn0;
import org.telegram.ui.j90;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class v1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v1(int i7, Object obj, boolean z10) {
        this.a = i7;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        dg0 dg0Var;
        int i7 = this.a;
        int i10 = 2;
        boolean z10 = this.b;
        Object obj = this.c;
        int i11 = 1;
        switch (i7) {
            case 0:
                z3 z3Var = (z3) obj;
                boolean z11 = !z10;
                mp u12 = mp.u1(z3Var.m2);
                if (u12.s6 != z11) {
                    SharedPreferences.Editor edit = u12.h7.edit();
                    u12.s6 = z11;
                    edit.putBoolean("storyQualityFull", z11).apply();
                    u12.getNotificationCenter().k(ks.o3, new Object[0]);
                }
                new kc(z3Var.M0, z3Var.l0).I(R.raw.chats_infotip, gd.N0(!z10 ? 2131744263 : 2131744266, null), gd.N0(!z10 ? 2131744264 : 2131744267, null)).j();
                r3 r3Var = z3Var.d1;
                if (r3Var != null) {
                    r3Var.a();
                    break;
                }
                break;
            case 1:
                r3 r3Var2 = (r3) obj;
                c1 c1Var = c1.X;
                if (c1Var != null) {
                    boolean z12 = !z10;
                    if (c1Var.n && c1Var.r != z12) {
                        c1Var.r = z12;
                        NativeInstance nativeInstance = c1Var.F;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z12);
                        }
                    }
                }
                r3 r3Var3 = r3Var2.x.d1;
                if (r3Var3 != null) {
                    r3Var3.a();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) obj;
                if (q0Var.y() && z10) {
                    if (!q0Var.U) {
                        q0Var.U = true;
                        q0Var.r();
                    }
                }
                org.telegram.ui.ActionBar.y yVar = q0Var.c;
                if (yVar != null) {
                    yVar.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    org.telegram.ui.ActionBar.l0 l0Var = q0Var.Q;
                    if (l0Var != null) {
                        l0Var.h(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
            case 3:
                b61 b61Var = (b61) obj;
                for (int i12 = 0; i12 < 2; i12++) {
                    org.telegram.ui.Cells.x0 x0Var = ((org.telegram.ui.Cells.x0[]) b61Var.b)[i12];
                    ((org.telegram.ui.Cells.w0) x0Var.d).a(x0Var == view, true);
                }
                bz.p1 = z10;
                SharedPreferences.Editor edit2 = mp.g1().edit();
                edit2.putBoolean("useThreeLinesLayout", bz.p1);
                edit2.apply();
                ks.e().k(3, Boolean.TRUE);
                break;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                td tdVar = chatActivityEnterView.f6;
                chatActivityEnterView.N0 = System.currentTimeMillis();
                boolean w12 = chatActivityEnterView.w1();
                if (!z10 && (dg0Var = chatActivityEnterView.M0) != null) {
                    dg0Var.h(!w12);
                    chatActivityEnterView.M0 = null;
                    break;
                } else {
                    chatActivityEnterView.e6 = !w12;
                    org.telegram.messenger.g0.r(tdVar);
                    org.telegram.messenger.g0.h3(tdVar, 500L);
                    break;
                }
            case 5:
                ti tiVar = (ti) obj;
                org.telegram.ui.ActionBar.g2 g2Var = tiVar.a2;
                if (tiVar.O2 != 0) {
                    tiVar.X3.l0();
                    tiVar.dismiss();
                    break;
                } else {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    dn0 dn0Var = new dn0(hashMap, arrayList, 0, true, (bn) g2Var);
                    ii iiVar = new ii(tiVar, hashMap, arrayList);
                    an0 an0Var = dn0Var.a;
                    an0Var.t0 = iiVar;
                    an0 an0Var2 = dn0Var.b;
                    an0Var2.t0 = iiVar;
                    an0Var.u0 = new bn0(dn0Var, i11);
                    an0Var2.u0 = new bn0(dn0Var, i10);
                    int i13 = tiVar.Q3;
                    boolean z13 = tiVar.R3;
                    an0Var.k0(i13, z13);
                    an0Var2.k0(i13, z13);
                    if (z10) {
                        g2Var.showAsSheet(dn0Var);
                    } else {
                        g2Var.presentFragment(dn0Var);
                    }
                    tiVar.dismiss();
                    break;
                }
            default:
                j90 j90Var = (j90) obj;
                if (!z10) {
                    org.telegram.ui.Cells.r8 r8Var = j90Var.n;
                    if (r8Var == null || !r8Var.e.h) {
                        org.telegram.ui.Cells.r8 r8Var2 = (org.telegram.ui.Cells.r8) view;
                        boolean z14 = r8Var2.e.h;
                        r8Var2.setChecked(!z14);
                        j90Var.e0(z14);
                        org.telegram.ui.Cells.r8 r8Var3 = j90Var.n;
                        if (r8Var3 != null) {
                            if (r8Var2.e.h) {
                                r8Var3.setChecked(false);
                                j90Var.n.setCheckBoxIcon(R.drawable.permission_locked);
                                j90Var.r.setVisibility(8);
                                break;
                            } else if (j90Var.e == null) {
                                r8Var3.setCheckBoxIcon(0);
                                break;
                            }
                        }
                    } else {
                        int i14 = -j90Var.N;
                        j90Var.N = i14;
                        org.telegram.messenger.g0.E3(i14, r8Var, null);
                        break;
                    }
                }
                break;
        }
    }
}
