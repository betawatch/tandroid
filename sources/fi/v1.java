package fi;

import android.content.SharedPreferences;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cz;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.td;
import org.telegram.ui.Components.ui;
import org.telegram.ui.bn;
import org.telegram.ui.cn0;
import org.telegram.ui.d61;
import org.telegram.ui.dn0;
import org.telegram.ui.eg0;
import org.telegram.ui.fn0;
import org.telegram.ui.k90;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
        eg0 eg0Var;
        int i7 = this.a;
        int i10 = 2;
        boolean z10 = this.b;
        Object obj = this.c;
        int i11 = 1;
        switch (i7) {
            case 0:
                z3 z3Var = (z3) obj;
                boolean z11 = !z10;
                np u12 = np.u1(z3Var.m2);
                if (u12.s6 != z11) {
                    SharedPreferences.Editor edit = u12.h7.edit();
                    u12.s6 = z11;
                    edit.putBoolean("storyQualityFull", z11).apply();
                    u12.getNotificationCenter().k(ls.o3, new Object[0]);
                }
                new lc(z3Var.M0, z3Var.l0).I(R.raw.chats_infotip, hd.N0(!z10 ? 2131744264 : 2131744267, null), hd.N0(!z10 ? 2131744265 : 2131744268, null)).j();
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
                        l0Var.g(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
            case 3:
                d61 d61Var = (d61) obj;
                for (int i12 = 0; i12 < 2; i12++) {
                    org.telegram.ui.Cells.x0 x0Var = ((org.telegram.ui.Cells.x0[]) d61Var.b)[i12];
                    ((org.telegram.ui.Cells.w0) x0Var.d).a(x0Var == view, true);
                }
                cz.p1 = z10;
                SharedPreferences.Editor edit2 = np.g1().edit();
                edit2.putBoolean("useThreeLinesLayout", cz.p1);
                edit2.apply();
                ls.e().k(3, Boolean.TRUE);
                break;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                td tdVar = chatActivityEnterView.f6;
                chatActivityEnterView.N0 = System.currentTimeMillis();
                boolean v12 = chatActivityEnterView.v1();
                if (!z10 && (eg0Var = chatActivityEnterView.M0) != null) {
                    eg0Var.h(!v12);
                    chatActivityEnterView.M0 = null;
                    break;
                } else {
                    chatActivityEnterView.e6 = !v12;
                    org.telegram.messenger.g0.r(tdVar);
                    org.telegram.messenger.g0.h3(tdVar, 500L);
                    break;
                }
            case 5:
                ui uiVar = (ui) obj;
                org.telegram.ui.ActionBar.g2 g2Var = uiVar.a2;
                if (uiVar.O2 != 0) {
                    uiVar.X3.v0();
                    uiVar.dismiss();
                    break;
                } else {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    fn0 fn0Var = new fn0(hashMap, arrayList, 0, true, (bn) g2Var);
                    ji jiVar = new ji(uiVar, hashMap, arrayList);
                    cn0 cn0Var = fn0Var.a;
                    cn0Var.t0 = jiVar;
                    cn0 cn0Var2 = fn0Var.b;
                    cn0Var2.t0 = jiVar;
                    cn0Var.u0 = new dn0(fn0Var, i11);
                    cn0Var2.u0 = new dn0(fn0Var, i10);
                    int i13 = uiVar.Q3;
                    boolean z13 = uiVar.R3;
                    cn0Var.k0(i13, z13);
                    cn0Var2.k0(i13, z13);
                    if (z10) {
                        g2Var.showAsSheet(fn0Var);
                    } else {
                        g2Var.presentFragment(fn0Var);
                    }
                    uiVar.dismiss();
                    break;
                }
            default:
                k90 k90Var = (k90) obj;
                if (!z10) {
                    org.telegram.ui.Cells.s8 s8Var = k90Var.n;
                    if (s8Var == null || !s8Var.e.h) {
                        org.telegram.ui.Cells.s8 s8Var2 = (org.telegram.ui.Cells.s8) view;
                        boolean z14 = s8Var2.e.h;
                        s8Var2.setChecked(!z14);
                        k90Var.e0(z14);
                        org.telegram.ui.Cells.s8 s8Var3 = k90Var.n;
                        if (s8Var3 != null) {
                            if (s8Var2.e.h) {
                                s8Var3.setChecked(false);
                                k90Var.n.setCheckBoxIcon(R.drawable.permission_locked);
                                k90Var.r.setVisibility(8);
                                break;
                            } else if (k90Var.e == null) {
                                s8Var3.setCheckBoxIcon(0);
                                break;
                            }
                        }
                    } else {
                        int i14 = -k90Var.N;
                        k90Var.N = i14;
                        org.telegram.messenger.g0.E3(i14, s8Var, null);
                        break;
                    }
                }
                break;
        }
    }
}
