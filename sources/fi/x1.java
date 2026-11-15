package fi;

import android.content.SharedPreferences;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.uc;
import org.telegram.ui.Components.zh;
import org.telegram.ui.an;
import org.telegram.ui.bg0;
import org.telegram.ui.bn0;
import org.telegram.ui.i90;
import org.telegram.ui.ym0;
import org.telegram.ui.z51;
import org.telegram.ui.zm0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class x1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x1(int i7, Object obj, boolean z10) {
        this.a = i7;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        bg0 bg0Var;
        int i7 = this.a;
        int i10 = 2;
        boolean z10 = this.b;
        Object obj = this.c;
        int i11 = 1;
        switch (i7) {
            case 0:
                b4 b4Var = (b4) obj;
                boolean z11 = !z10;
                np s12 = np.s1(b4Var.m2);
                if (s12.q6 != z11) {
                    SharedPreferences.Editor edit = s12.f7.edit();
                    s12.q6 = z11;
                    edit.putBoolean("storyQualityFull", z11).apply();
                    s12.getNotificationCenter().k(ns.m3, new Object[0]);
                }
                new cc(b4Var.M0, b4Var.l0).I(R.raw.chats_infotip, hd.M0(!z10 ? 2131744507 : 2131744510, null), hd.M0(!z10 ? 2131744508 : 2131744511, null)).j();
                t3 t3Var = b4Var.d1;
                if (t3Var != null) {
                    t3Var.a();
                    break;
                }
                break;
            case 1:
                t3 t3Var2 = (t3) obj;
                e1 e1Var = e1.X;
                if (e1Var != null) {
                    boolean z12 = !z10;
                    if (e1Var.n && e1Var.r != z12) {
                        e1Var.r = z12;
                        NativeInstance nativeInstance = e1Var.F;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z12);
                        }
                    }
                }
                t3 t3Var3 = t3Var2.x.d1;
                if (t3Var3 != null) {
                    t3Var3.a();
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
                z51 z51Var = (z51) obj;
                for (int i12 = 0; i12 < 2; i12++) {
                    org.telegram.ui.Cells.v0 v0Var = ((org.telegram.ui.Cells.v0[]) z51Var.b)[i12];
                    ((org.telegram.ui.Cells.u0) v0Var.d).a(v0Var == view, true);
                }
                gz.p1 = z10;
                SharedPreferences.Editor edit2 = np.e1().edit();
                edit2.putBoolean("useThreeLinesLayout", gz.p1);
                edit2.apply();
                ns.e().k(3, Boolean.TRUE);
                break;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                uc ucVar = chatActivityEnterView.X5;
                chatActivityEnterView.N0 = System.currentTimeMillis();
                boolean j12 = chatActivityEnterView.j1();
                if (!z10 && (bg0Var = chatActivityEnterView.M0) != null) {
                    bg0Var.h(!j12);
                    chatActivityEnterView.M0 = null;
                    break;
                } else {
                    chatActivityEnterView.W5 = !j12;
                    org.telegram.messenger.g0.r(ucVar);
                    org.telegram.messenger.g0.i3(ucVar, 500L);
                    break;
                }
            case 5:
                ki kiVar = (ki) obj;
                org.telegram.ui.ActionBar.e2 e2Var = kiVar.a2;
                if (kiVar.O2 != 0) {
                    kiVar.X3.v0();
                    kiVar.dismiss();
                    break;
                } else {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    bn0 bn0Var = new bn0(hashMap, arrayList, 0, true, (an) e2Var);
                    zh zhVar = new zh(kiVar, hashMap, arrayList);
                    ym0 ym0Var = bn0Var.a;
                    ym0Var.t0 = zhVar;
                    ym0 ym0Var2 = bn0Var.b;
                    ym0Var2.t0 = zhVar;
                    ym0Var.u0 = new zm0(bn0Var, i11);
                    ym0Var2.u0 = new zm0(bn0Var, i10);
                    int i13 = kiVar.Q3;
                    boolean z13 = kiVar.R3;
                    ym0Var.k0(i13, z13);
                    ym0Var2.k0(i13, z13);
                    if (z10) {
                        e2Var.showAsSheet(bn0Var);
                    } else {
                        e2Var.presentFragment(bn0Var);
                    }
                    kiVar.dismiss();
                    break;
                }
            default:
                i90 i90Var = (i90) obj;
                if (!z10) {
                    org.telegram.ui.Cells.q8 q8Var = i90Var.n;
                    if (q8Var == null || !q8Var.e.h) {
                        org.telegram.ui.Cells.q8 q8Var2 = (org.telegram.ui.Cells.q8) view;
                        boolean z14 = q8Var2.e.h;
                        q8Var2.setChecked(!z14);
                        i90Var.e0(z14);
                        org.telegram.ui.Cells.q8 q8Var3 = i90Var.n;
                        if (q8Var3 != null) {
                            if (q8Var2.e.h) {
                                q8Var3.setChecked(false);
                                i90Var.n.setCheckBoxIcon(R.drawable.permission_locked);
                                i90Var.r.setVisibility(8);
                                break;
                            } else if (i90Var.e == null) {
                                q8Var3.setCheckBoxIcon(0);
                                break;
                            }
                        }
                    } else {
                        int i14 = -i90Var.N;
                        i90Var.N = i14;
                        org.telegram.messenger.g0.F3(i14, q8Var, null);
                        break;
                    }
                }
                break;
        }
    }
}
