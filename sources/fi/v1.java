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
import org.telegram.ui.Components.hi;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.td;
import org.telegram.ui.bn;
import org.telegram.ui.cn0;
import org.telegram.ui.d61;
import org.telegram.ui.dn0;
import org.telegram.ui.eg0;
import org.telegram.ui.fn0;
import org.telegram.ui.j90;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                mp u12 = mp.u1(z3Var.m2);
                if (u12.s6 != z11) {
                    SharedPreferences.Editor edit = u12.h7.edit();
                    u12.s6 = z11;
                    edit.putBoolean("storyQualityFull", z11).apply();
                    u12.getNotificationCenter().k(ks.o3, new Object[0]);
                }
                new lc(z3Var.M0, z3Var.l0).I(R.raw.chats_infotip, gd.M0(!z10 ? 2131744272 : 2131744275, null), gd.M0(!z10 ? 2131744273 : 2131744276, null)).j();
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
                org.telegram.ui.ActionBar.r0 r0Var = (org.telegram.ui.ActionBar.r0) obj;
                if (r0Var.y() && z10) {
                    if (!r0Var.U) {
                        r0Var.U = true;
                        r0Var.r();
                    }
                }
                org.telegram.ui.ActionBar.z zVar = r0Var.c;
                if (zVar != null) {
                    zVar.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    org.telegram.ui.ActionBar.m0 m0Var = r0Var.Q;
                    if (m0Var != null) {
                        m0Var.g(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
            case 3:
                d61 d61Var = (d61) obj;
                for (int i12 = 0; i12 < 2; i12++) {
                    org.telegram.ui.Cells.w0 w0Var = ((org.telegram.ui.Cells.w0[]) d61Var.b)[i12];
                    ((org.telegram.ui.Cells.v0) w0Var.d).a(w0Var == view, true);
                }
                bz.p1 = z10;
                SharedPreferences.Editor edit2 = mp.g1().edit();
                edit2.putBoolean("useThreeLinesLayout", bz.p1);
                edit2.apply();
                ks.e().k(3, Boolean.TRUE);
                break;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                td tdVar = chatActivityEnterView.d6;
                chatActivityEnterView.N0 = System.currentTimeMillis();
                boolean r12 = chatActivityEnterView.r1();
                if (!z10 && (eg0Var = chatActivityEnterView.M0) != null) {
                    eg0Var.h(!r12);
                    chatActivityEnterView.M0 = null;
                    break;
                } else {
                    chatActivityEnterView.c6 = !r12;
                    org.telegram.messenger.g0.r(tdVar);
                    org.telegram.messenger.g0.h3(tdVar, 500L);
                    break;
                }
            case 5:
                si siVar = (si) obj;
                org.telegram.ui.ActionBar.h2 h2Var = siVar.a2;
                if (siVar.O2 != 0) {
                    siVar.X3.v0();
                    siVar.dismiss();
                    break;
                } else {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    fn0 fn0Var = new fn0(hashMap, arrayList, 0, true, (bn) h2Var);
                    hi hiVar = new hi(siVar, hashMap, arrayList);
                    cn0 cn0Var = fn0Var.a;
                    cn0Var.t0 = hiVar;
                    cn0 cn0Var2 = fn0Var.b;
                    cn0Var2.t0 = hiVar;
                    cn0Var.u0 = new dn0(fn0Var, i11);
                    cn0Var2.u0 = new dn0(fn0Var, i10);
                    int i13 = siVar.Q3;
                    boolean z13 = siVar.R3;
                    cn0Var.k0(i13, z13);
                    cn0Var2.k0(i13, z13);
                    if (z10) {
                        h2Var.showAsSheet(fn0Var);
                    } else {
                        h2Var.presentFragment(fn0Var);
                    }
                    siVar.dismiss();
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
