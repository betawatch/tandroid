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
import org.telegram.ui.an0;
import org.telegram.ui.cn;
import org.telegram.ui.cn0;
import org.telegram.ui.d61;
import org.telegram.ui.j90;
import org.telegram.ui.zm0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                j4 j4Var = (j4) obj;
                boolean z10 = !z9;
                qp s12 = qp.s1(j4Var.l2);
                if (s12.p6 != z10) {
                    SharedPreferences.Editor edit = s12.e7.edit();
                    s12.p6 = z10;
                    edit.putBoolean("storyQualityFull", z10).apply();
                    s12.getNotificationCenter().k(qs.m3, new Object[0]);
                }
                new hc(j4Var.L0, j4Var.k0).I(R.raw.chats_infotip, id.M0(!z9 ? 2131744507 : 2131744510, null), id.M0(!z9 ? 2131744508 : 2131744511, null)).j();
                a4 a4Var = j4Var.c1;
                if (a4Var != null) {
                    a4Var.a();
                    break;
                }
                break;
            case 1:
                a4 a4Var2 = (a4) obj;
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
                a4 a4Var3 = a4Var2.x.c1;
                if (a4Var3 != null) {
                    a4Var3.a();
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
                d61 d61Var = (d61) obj;
                for (int i12 = 0; i12 < 2; i12++) {
                    org.telegram.ui.Cells.v0 v0Var = ((org.telegram.ui.Cells.v0[]) d61Var.b)[i12];
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
                    cn0 cn0Var = new cn0(hashMap, arrayList, 0, true, (cn) f2Var);
                    sh shVar = new sh(diVar, hashMap, arrayList);
                    zm0 zm0Var = cn0Var.a;
                    zm0Var.s0 = shVar;
                    zm0 zm0Var2 = cn0Var.b;
                    zm0Var2.s0 = shVar;
                    zm0Var.t0 = new an0(cn0Var, i11);
                    zm0Var2.t0 = new an0(cn0Var, i10);
                    int i13 = diVar.M3;
                    boolean z12 = diVar.N3;
                    zm0Var.k0(i13, z12);
                    zm0Var2.k0(i13, z12);
                    if (z9) {
                        f2Var.showAsSheet(cn0Var);
                    } else {
                        f2Var.presentFragment(cn0Var);
                    }
                    diVar.dismiss();
                    break;
                }
            default:
                j90 j90Var = (j90) obj;
                if (!z9) {
                    org.telegram.ui.Cells.r8 r8Var = j90Var.n;
                    if (r8Var == null || !r8Var.e.h) {
                        org.telegram.ui.Cells.r8 r8Var2 = (org.telegram.ui.Cells.r8) view;
                        boolean z13 = r8Var2.e.h;
                        r8Var2.setChecked(!z13);
                        j90Var.e0(z13);
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
                        int i14 = -j90Var.M;
                        j90Var.M = i14;
                        org.telegram.messenger.g0.G3(i14, r8Var, null);
                        break;
                    }
                }
                break;
        }
    }
}
