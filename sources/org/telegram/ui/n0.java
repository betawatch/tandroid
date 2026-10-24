package org.telegram.ui;

import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class n0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.web.l lVar;
        String str;
        boolean z10;
        String str2;
        int i10;
        lt ltVar;
        boolean z11;
        String str3;
        Object obj;
        String str4;
        boolean z12;
        String str5;
        lt ltVar2;
        switch (this.a) {
            case 0:
                k4 k4Var = (k4) this.b;
                if (k4Var.h0.W && (lVar = k4Var.i0) != null) {
                    lVar.setInput(editable == null ? null : editable.toString());
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                ko koVar = (ko) this.b;
                koVar.r.n(5L, koVar.v.getText().toString(), null);
                ci.j4 j4Var = koVar.e;
                if (j4Var != null) {
                    j4Var.invalidate();
                    break;
                }
                break;
            case 3:
                ((yo) this.b).W();
                break;
            case 4:
                cq cqVar = (cq) this.b;
                dq dqVar = cqVar.e;
                if (!cqVar.d) {
                    dqVar.T = editable.toString();
                    s4.b1 K = dqVar.b.K(dqVar.v0);
                    if (K != null) {
                        dq.f0(dqVar, K.a);
                        break;
                    }
                }
                break;
            case 5:
                break;
            case 6:
                p60 p60Var = (p60) this.b;
                if (p60Var.f.r.length() == 0) {
                    p60Var.T = false;
                    p60Var.S = false;
                    n60 n60Var = p60Var.v;
                    if (n60Var.n) {
                        n60Var.n = false;
                        n60Var.l();
                    }
                    p60Var.v.L(null);
                    p60Var.n.setFastScrollVisible(true);
                    p60Var.n.setVerticalScrollBarEnabled(false);
                    p60Var.q0(0);
                    break;
                } else {
                    n60 n60Var2 = p60Var.v;
                    boolean z13 = n60Var2.n;
                    if (!z13) {
                        p60Var.T = true;
                        p60Var.S = true;
                        if (!z13) {
                            n60Var2.n = true;
                            n60Var2.l();
                        }
                        p60Var.n.setFastScrollVisible(false);
                        p60Var.n.setVerticalScrollBarEnabled(true);
                    }
                    p60Var.v.L(p60Var.f.r.getText().toString());
                    p60Var.s.e(true, false);
                    break;
                }
            case 7:
            case 8:
            case 9:
                break;
            case 10:
                hg0 hg0Var = (hg0) this.b;
                HashMap hashMap = hg0Var.H;
                ArrayList arrayList = hg0Var.G;
                pj0 pj0Var = hg0Var.a;
                eg0 eg0Var = hg0Var.b;
                if (!hg0Var.K) {
                    int i11 = 1;
                    hg0Var.K = true;
                    int i12 = 0;
                    String d = jf.b.d(pj0Var.getText().toString(), false);
                    pj0Var.setText(d);
                    String str6 = null;
                    if (d.length() == 0) {
                        hg0Var.setCountryButtonText(null);
                        eg0Var.setHintText((String) null);
                        hg0Var.E = 1;
                        z11 = false;
                    } else {
                        int i13 = 4;
                        if (d.length() > 4) {
                            while (true) {
                                if (i13 >= i11) {
                                    String substring = d.substring(i12, i13);
                                    List list = (List) hashMap.get(substring);
                                    if (list == null) {
                                        obj = str6;
                                    } else if (list.size() > i11) {
                                        String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, str6);
                                        Object obj2 = (lt) si.o0.g(i11, list);
                                        if (string != null) {
                                            int size = arrayList.size();
                                            int i14 = i12;
                                            while (true) {
                                                if (i14 < size) {
                                                    Object obj3 = arrayList.get(i14);
                                                    i14++;
                                                    lt ltVar3 = (lt) obj3;
                                                    if (Objects.equals(ltVar3.d, string)) {
                                                        obj2 = ltVar3;
                                                    }
                                                }
                                            }
                                        }
                                        obj = obj2;
                                    } else {
                                        obj = (lt) list.get(i12);
                                    }
                                    if (obj != null) {
                                        str = d.substring(i13) + eg0Var.getText().toString();
                                        pj0Var.setText(substring);
                                        d = substring;
                                        z10 = true;
                                    } else {
                                        i13--;
                                        i11 = 1;
                                        i12 = 0;
                                        str6 = null;
                                    }
                                } else {
                                    str = null;
                                    z10 = false;
                                }
                            }
                            if (!z10) {
                                str = d.substring(1) + eg0Var.getText().toString();
                                d = d.substring(0, 1);
                                pj0Var.setText(d);
                            }
                        } else {
                            str = null;
                            z10 = false;
                        }
                        int size2 = arrayList.size();
                        lt ltVar4 = null;
                        int i15 = 0;
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj4 = arrayList.get(i16);
                            i16++;
                            lt ltVar5 = (lt) obj4;
                            if (ltVar5.c.startsWith(d)) {
                                int i17 = i15 + 1;
                                str3 = str;
                                if (ltVar5.c.equals(d)) {
                                    if (ltVar4 == null || !ltVar4.c.equals(ltVar5.c)) {
                                        i15 = i17;
                                    }
                                    ltVar4 = ltVar5;
                                } else {
                                    i15 = i17;
                                }
                            } else {
                                str3 = str;
                            }
                            str = str3;
                        }
                        String str7 = str;
                        if (i15 == 1 && ltVar4 != null && str7 == null) {
                            str2 = d.substring(ltVar4.c.length()) + eg0Var.getText().toString();
                            d = ltVar4.c;
                            pj0Var.setText(d);
                        } else {
                            str2 = str7;
                        }
                        List list2 = (List) hashMap.get(d);
                        if (list2 == null) {
                            i10 = 0;
                            ltVar = null;
                        } else if (list2.size() > 1) {
                            String string2 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + d, null);
                            lt ltVar6 = (lt) si.o0.g(1, list2);
                            if (string2 != null) {
                                int size3 = arrayList.size();
                                int i18 = 0;
                                while (i18 < size3) {
                                    Object obj5 = arrayList.get(i18);
                                    i18++;
                                    ltVar = (lt) obj5;
                                    if (Objects.equals(ltVar.d, string2)) {
                                        i10 = 0;
                                    }
                                }
                            }
                            ltVar = ltVar6;
                            i10 = 0;
                        } else {
                            i10 = 0;
                            ltVar = (lt) list2.get(0);
                        }
                        if (ltVar != null) {
                            hg0Var.J = true;
                            hg0Var.F = ltVar;
                            hg0Var.s(d, ltVar);
                            hg0Var.E = i10;
                        } else {
                            hg0Var.setCountryButtonText(null);
                            eg0Var.setHintText((String) null);
                            hg0Var.E = 2;
                        }
                        if (!z10) {
                            pj0Var.setSelection(pj0Var.getText().length());
                        }
                        if (str2 != null) {
                            eg0Var.requestFocus();
                            eg0Var.setText(str2);
                            eg0Var.setSelection(eg0Var.length());
                        }
                        z11 = false;
                    }
                    hg0Var.K = z11;
                    break;
                }
                break;
            case 11:
                rj0 rj0Var = (rj0) this.b;
                HashMap hashMap2 = rj0Var.w;
                ArrayList arrayList2 = rj0Var.v;
                if (!rj0Var.y) {
                    rj0Var.y = true;
                    String d10 = jf.b.d(rj0Var.N.getText().toString(), false);
                    rj0Var.N.setText(d10);
                    String str8 = null;
                    if (d10.length() == 0) {
                        rj0Var.v(null);
                        rj0Var.P.setHintText((String) null);
                    } else {
                        int i19 = 4;
                        if (d10.length() > 4) {
                            while (true) {
                                if (i19 >= 1) {
                                    str4 = d10.substring(0, i19);
                                    List list3 = (List) hashMap2.get(str4);
                                    Object obj6 = str8;
                                    if (list3 != null) {
                                        if (list3.size() > 1) {
                                            String string3 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + str4, str8);
                                            Object obj7 = (lt) si.o0.g(1, list3);
                                            if (string3 != null) {
                                                int size4 = arrayList2.size();
                                                int i20 = 0;
                                                while (true) {
                                                    if (i20 < size4) {
                                                        Object obj8 = arrayList2.get(i20);
                                                        i20++;
                                                        lt ltVar7 = (lt) obj8;
                                                        if (Objects.equals(ltVar7.d, string3)) {
                                                            obj7 = ltVar7;
                                                        }
                                                    }
                                                }
                                            }
                                            obj6 = obj7;
                                        } else {
                                            obj6 = (lt) list3.get(0);
                                        }
                                    }
                                    if (obj6 != null) {
                                        str5 = d10.substring(i19) + rj0Var.P.getText().toString();
                                        rj0Var.N.setText(str4);
                                        z12 = true;
                                    } else {
                                        i19--;
                                        str8 = null;
                                    }
                                } else {
                                    str4 = d10;
                                    z12 = false;
                                    str5 = null;
                                }
                            }
                            if (!z12) {
                                str5 = str4.substring(1) + rj0Var.P.getText().toString();
                                pj0 pj0Var2 = rj0Var.N;
                                str4 = str4.substring(0, 1);
                                pj0Var2.setText(str4);
                            }
                        } else {
                            str4 = d10;
                            z12 = false;
                            str5 = null;
                        }
                        int size5 = arrayList2.size();
                        int i21 = 0;
                        int i22 = 0;
                        lt ltVar8 = null;
                        while (i22 < size5) {
                            Object obj9 = arrayList2.get(i22);
                            i22++;
                            lt ltVar9 = (lt) obj9;
                            if (ltVar9.c.startsWith(str4)) {
                                i21++;
                                if (ltVar9.c.equals(str4)) {
                                    ltVar8 = ltVar9;
                                }
                            }
                        }
                        if (i21 == 1 && ltVar8 != null && str5 == null) {
                            str5 = str4.substring(ltVar8.c.length()) + rj0Var.P.getText().toString();
                            pj0 pj0Var3 = rj0Var.N;
                            String str9 = ltVar8.c;
                            pj0Var3.setText(str9);
                            str4 = str9;
                        }
                        List list4 = (List) hashMap2.get(str4);
                        if (list4 == null) {
                            ltVar2 = null;
                        } else if (list4.size() > 1) {
                            String string4 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + str4, null);
                            lt ltVar10 = (lt) si.o0.g(1, list4);
                            if (string4 != null) {
                                int size6 = arrayList2.size();
                                int i23 = 0;
                                while (i23 < size6) {
                                    Object obj10 = arrayList2.get(i23);
                                    i23++;
                                    lt ltVar11 = (lt) obj10;
                                    if (Objects.equals(ltVar11.d, string4)) {
                                        ltVar2 = ltVar11;
                                    }
                                }
                            }
                            ltVar2 = ltVar10;
                        } else {
                            ltVar2 = (lt) list4.get(0);
                        }
                        if (ltVar2 != null) {
                            rj0Var.F = true;
                            rj0Var.w(str4, ltVar2);
                        } else {
                            rj0Var.v(null);
                            rj0Var.P.setHintText((String) null);
                        }
                        if (!z12) {
                            pj0 pj0Var4 = rj0Var.N;
                            pj0Var4.setSelection(pj0Var4.getText().length());
                        }
                        if (str5 != null && str5.length() != 0) {
                            rj0Var.P.requestFocus();
                            rj0Var.P.setText(str5);
                            pj0 pj0Var5 = rj0Var.P;
                            pj0Var5.setSelection(pj0Var5.length());
                        }
                    }
                    rj0Var.y = false;
                    rj0.s(rj0Var);
                    break;
                }
                break;
            case 12:
                an0 an0Var = (an0) this.b;
                if (!an0Var.Z0 && an0Var.T0 != 0 && an0Var.Y[0].length() == an0Var.T0) {
                    an0Var.L.callOnClick();
                    break;
                }
                break;
            case 13:
                io0 io0Var = (io0) this.b;
                if (io0Var.c0 != 0 && editable.length() == io0Var.c0) {
                    io0Var.A0(false);
                    break;
                }
                break;
            case 14:
                lq0 lq0Var = ((mq0) this.b).s0;
                if (lq0Var != null) {
                    lq0Var.b(editable);
                    break;
                }
                break;
            case 15:
                s41 s41Var = (s41) this.b;
                org.telegram.ui.Cells.c6 c6Var = s41Var.h;
                String obj11 = (c6Var.getText() == null || AndroidUtilities.trim(c6Var.getText(), null).length() == 0) ? null : c6Var.getText().toString();
                s41Var.F.v(obj11, true, true);
                p51 p51Var = s41Var.n;
                if (p51Var != null) {
                    p51Var.L1(null);
                    s41Var.n.M1(TextUtils.isEmpty(obj11), true);
                }
                if (c6Var != null) {
                    c6Var.clearAnimation();
                    c6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.bs.h).start();
                }
                s41Var.c(false);
                break;
            case 16:
                String trim = editable.toString().trim();
                td1 td1Var = (td1) this.b;
                String str10 = td1Var.n;
                if (trim.length() > 0) {
                    td1Var.n = trim.substring(0, 1).toUpperCase();
                } else {
                    td1Var.n = "";
                }
                if (!str10.equals(td1Var.n)) {
                    org.telegram.ui.Components.g90 g90Var = new org.telegram.ui.Components.g90(1, null);
                    g90Var.a(td1Var.n);
                    org.telegram.ui.Components.rm0 rm0Var = td1Var.v;
                    if (rm0Var != null) {
                        rm0Var.b(g90Var, true);
                        break;
                    }
                }
                break;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                hf1 hf1Var = twoStepVerificationActivity.V;
                if (twoStepVerificationActivity.U) {
                    AndroidUtilities.cancelRunOnUIThread(hf1Var);
                    hf1Var.run();
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.a;
        Object obj = this.b;
        switch (i13) {
            case 5:
                qr qrVar = (qr) obj;
                qrVar.x = charSequence.length() != 0;
                qrVar.v = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                qrVar.F = ofFloat;
                ofFloat.addUpdateListener(new d3(qrVar, 9));
                if (qrVar.x) {
                    qrVar.F.setDuration(220L);
                } else {
                    org.telegram.messenger.sl.l(1.5f, qrVar.F);
                    qrVar.F.setDuration(350L);
                }
                qrVar.F.start();
                qrVar.hideActionMode();
                break;
            case 7:
                rd0 rd0Var = (rd0) obj;
                kd0 kd0Var = rd0Var.S;
                if (rd0Var.R) {
                    rd0Var.removeCallbacks(kd0Var);
                    kd0Var.run();
                    break;
                }
                break;
            case 8:
                me0 me0Var = (me0) obj;
                ke0 ke0Var = me0Var.x;
                if (me0Var.w) {
                    me0Var.removeCallbacks(ke0Var);
                    ke0Var.run();
                    break;
                }
                break;
            case 9:
                mf0 mf0Var = (mf0) obj;
                ze0 ze0Var = mf0Var.t0;
                if (mf0Var.s0) {
                    mf0Var.removeCallbacks(ze0Var);
                    ze0Var.run();
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.a) {
            case 1:
                md mdVar = (md) this.b;
                mdVar.e0(mdVar.x.getText().toString());
                break;
            case 3:
                yo yoVar = (yo) this.b;
                if (!yoVar.n0) {
                    String obj = yoVar.a.getText().toString();
                    pa paVar = yoVar.P;
                    if (paVar != null) {
                        paVar.b(obj);
                    }
                    yoVar.X(obj);
                    break;
                }
                break;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(Editable editable) {
    }

    private final void d(Editable editable) {
    }

    private final void e(Editable editable) {
    }

    private final void A(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void B(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void C(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void D(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void E(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void F(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void G(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void H(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void I(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void f(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void g(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void h(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void i(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void j(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void k(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void l(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void m(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void n(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void o(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void p(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void q(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void r(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void s(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void t(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void u(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void v(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void w(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void x(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void y(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void z(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
