package di;

import android.content.SharedPreferences;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.iz;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.sh;
import org.telegram.ui.Components.ue;
import org.telegram.ui.an;
import org.telegram.ui.an0;
import org.telegram.ui.c61;
import org.telegram.ui.h90;
import org.telegram.ui.xm0;
import org.telegram.ui.ym0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a2(int i7, Object obj, boolean z9) {
        this.a = i7;
        this.c = obj;
        this.b = z9;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ue ueVar;
        int i7 = this.a;
        int i10 = 2;
        boolean z9 = this.b;
        Object obj = this.c;
        int i11 = 1;
        switch (i7) {
            case 0:
                i4 i4Var = (i4) obj;
                boolean z10 = !z9;
                qp s12 = qp.s1(i4Var.l2);
                if (s12.p6 != z10) {
                    SharedPreferences.Editor edit = s12.e7.edit();
                    s12.p6 = z10;
                    edit.putBoolean("storyQualityFull", z10).apply();
                    s12.getNotificationCenter().k(qs.m3, new Object[0]);
                }
                new hc(i4Var.L0, i4Var.k0).I(R.raw.chats_infotip, id.M0(!z9 ? 2131744510 : 2131744513, null), id.M0(!z9 ? 2131744511 : 2131744514, null)).j();
                z3 z3Var = i4Var.c1;
                if (z3Var != null) {
                    z3Var.a();
                    break;
                }
                break;
            case 1:
                z3 z3Var2 = (z3) obj;
                g1 g1Var = g1.W;
                if (g1Var != null) {
                    boolean z11 = !z9;
                    if (g1Var.n && g1Var.r != z11) {
                        g1Var.r = z11;
                        NativeInstance nativeInstance = g1Var.E;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z11);
                        }
                    }
                }
                z3 z3Var3 = z3Var2.x.c1;
                if (z3Var3 != null) {
                    z3Var3.a();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.ActionBar.r0 r0Var = (org.telegram.ui.ActionBar.r0) obj;
                if (r0Var.x() && z9) {
                    if (!r0Var.T) {
                        r0Var.T = true;
                        r0Var.q();
                    }
                }
                org.telegram.ui.ActionBar.y yVar = r0Var.c;
                if (yVar != null) {
                    yVar.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    org.telegram.ui.ActionBar.m0 m0Var = r0Var.P;
                    if (m0Var != null) {
                        m0Var.i(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
            case 3:
                c61 c61Var = (c61) obj;
                for (int i12 = 0; i12 < 2; i12++) {
                    org.telegram.ui.Cells.v0 v0Var = ((org.telegram.ui.Cells.v0[]) c61Var.b)[i12];
                    ((org.telegram.ui.Cells.u0) v0Var.d).a(v0Var == view, true);
                }
                iz.p1 = z9;
                SharedPreferences.Editor edit2 = qp.e1().edit();
                edit2.putBoolean("useThreeLinesLayout", iz.p1);
                edit2.apply();
                qs.e().k(3, Boolean.TRUE);
                break;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                ad adVar = chatActivityEnterView.F4;
                chatActivityEnterView.M0 = System.currentTimeMillis();
                boolean S0 = chatActivityEnterView.S0();
                if (!z9 && (ueVar = chatActivityEnterView.L0) != null) {
                    ueVar.g(!S0);
                    chatActivityEnterView.L0 = null;
                    break;
                } else {
                    chatActivityEnterView.E4 = !S0;
                    org.telegram.messenger.g0.r(adVar);
                    org.telegram.messenger.g0.i3(adVar, 500L);
                    break;
                }
            case 5:
                di diVar = (di) obj;
                org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
                if (diVar.K2 != 0) {
                    diVar.T3.t0();
                    diVar.dismiss();
                    break;
                } else {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    an0 an0Var = new an0(hashMap, arrayList, 0, true, (an) f2Var);
                    sh shVar = new sh(diVar, hashMap, arrayList);
                    xm0 xm0Var = an0Var.a;
                    xm0Var.s0 = shVar;
                    xm0 xm0Var2 = an0Var.b;
                    xm0Var2.s0 = shVar;
                    xm0Var.t0 = new ym0(an0Var, i11);
                    xm0Var2.t0 = new ym0(an0Var, i10);
                    int i13 = diVar.M3;
                    boolean z12 = diVar.N3;
                    xm0Var.k0(i13, z12);
                    xm0Var2.k0(i13, z12);
                    if (z9) {
                        f2Var.showAsSheet(an0Var);
                    } else {
                        f2Var.presentFragment(an0Var);
                    }
                    diVar.dismiss();
                    break;
                }
            default:
                h90 h90Var = (h90) obj;
                if (!z9) {
                    org.telegram.ui.Cells.r8 r8Var = h90Var.n;
                    if (r8Var == null || !r8Var.e.h) {
                        org.telegram.ui.Cells.r8 r8Var2 = (org.telegram.ui.Cells.r8) view;
                        boolean z13 = r8Var2.e.h;
                        r8Var2.setChecked(!z13);
                        h90Var.e0(z13);
                        org.telegram.ui.Cells.r8 r8Var3 = h90Var.n;
                        if (r8Var3 != null) {
                            if (r8Var2.e.h) {
                                r8Var3.setChecked(false);
                                h90Var.n.setCheckBoxIcon(R.drawable.permission_locked);
                                h90Var.r.setVisibility(8);
                                break;
                            } else if (h90Var.e == null) {
                                r8Var3.setCheckBoxIcon(0);
                                break;
                            }
                        }
                    } else {
                        int i14 = -h90Var.M;
                        h90Var.M = i14;
                        org.telegram.messenger.g0.G3(i14, r8Var, null);
                        break;
                    }
                }
                break;
        }
    }
}
