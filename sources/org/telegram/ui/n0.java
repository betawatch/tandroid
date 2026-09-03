package org.telegram.ui;

import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.animation.OvershootInterpolator;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        org.telegram.ui.web.k kVar;
        String str;
        boolean z4;
        String str2;
        int i10;
        tt ttVar;
        String str3;
        Object obj;
        String str4;
        String str5;
        boolean z10;
        tt ttVar2;
        switch (this.a) {
            case 0:
                l4 l4Var = (l4) this.b;
                if (l4Var.e0.T && (kVar = l4Var.f0) != null) {
                    kVar.setInput(editable == null ? null : editable.toString());
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                po poVar = (po) this.b;
                poVar.r.n(5L, poVar.v.getText().toString(), null);
                oh.a4 a4Var = poVar.e;
                if (a4Var != null) {
                    a4Var.invalidate();
                    break;
                }
                break;
            case 3:
                ((ep) this.b).V();
                break;
            case 4:
                jq jqVar = (jq) this.b;
                kq kqVar = jqVar.e;
                if (!jqVar.d) {
                    kqVar.P = editable.toString();
                    f2.m1 K = kqVar.b.K(kqVar.r0);
                    if (K != null) {
                        kq.f0(kqVar, K.a);
                        break;
                    }
                }
                break;
            case 5:
                break;
            case 6:
                z60 z60Var = (z60) this.b;
                if (z60Var.f.r.length() == 0) {
                    z60Var.Q = false;
                    z60Var.P = false;
                    x60 x60Var = z60Var.v;
                    if (x60Var.n) {
                        x60Var.n = false;
                        x60Var.l();
                    }
                    z60Var.v.L(null);
                    z60Var.n.setFastScrollVisible(true);
                    z60Var.n.setVerticalScrollBarEnabled(false);
                    z60Var.q0(0);
                    break;
                } else {
                    x60 x60Var2 = z60Var.v;
                    boolean z11 = x60Var2.n;
                    if (!z11) {
                        z60Var.Q = true;
                        z60Var.P = true;
                        if (!z11) {
                            x60Var2.n = true;
                            x60Var2.l();
                        }
                        z60Var.n.setFastScrollVisible(false);
                        z60Var.n.setVerticalScrollBarEnabled(true);
                    }
                    z60Var.v.L(z60Var.f.r.getText().toString());
                    z60Var.s.e(true, false);
                    break;
                }
            case 7:
            case 8:
            case 9:
                break;
            case 10:
                ng0 ng0Var = (ng0) this.b;
                HashMap hashMap = ng0Var.C;
                ArrayList arrayList = ng0Var.B;
                rj0 rj0Var = ng0Var.a;
                kg0 kg0Var = ng0Var.b;
                if (!ng0Var.F) {
                    int i11 = 1;
                    ng0Var.F = true;
                    int i12 = 0;
                    String d = se.b.d(rj0Var.getText().toString(), false);
                    rj0Var.setText(d);
                    String str6 = null;
                    if (d.length() == 0) {
                        ng0Var.setCountryButtonText(null);
                        kg0Var.setHintText((String) null);
                        ng0Var.x = 1;
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
                                        Object obj2 = (tt) yh.j(i11, list);
                                        if (string != null) {
                                            int size = arrayList.size();
                                            int i14 = 0;
                                            while (true) {
                                                if (i14 < size) {
                                                    Object obj3 = arrayList.get(i14);
                                                    i14++;
                                                    tt ttVar3 = (tt) obj3;
                                                    if (Objects.equals(ttVar3.d, string)) {
                                                        obj2 = ttVar3;
                                                    }
                                                }
                                            }
                                        }
                                        obj = obj2;
                                    } else {
                                        obj = (tt) list.get(0);
                                    }
                                    if (obj != null) {
                                        str = d.substring(i13) + kg0Var.getText().toString();
                                        rj0Var.setText(substring);
                                        d = substring;
                                        z4 = true;
                                    } else {
                                        i13--;
                                        i11 = 1;
                                        i12 = 0;
                                        str6 = null;
                                    }
                                } else {
                                    str = null;
                                    z4 = false;
                                }
                            }
                            if (!z4) {
                                str = d.substring(1) + kg0Var.getText().toString();
                                d = d.substring(0, 1);
                                rj0Var.setText(d);
                            }
                        } else {
                            str = null;
                            z4 = false;
                        }
                        int size2 = arrayList.size();
                        tt ttVar4 = null;
                        int i15 = 0;
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj4 = arrayList.get(i16);
                            i16++;
                            tt ttVar5 = (tt) obj4;
                            if (ttVar5.c.startsWith(d)) {
                                int i17 = i15 + 1;
                                str3 = str;
                                if (ttVar5.c.equals(d)) {
                                    if (ttVar4 == null || !ttVar4.c.equals(ttVar5.c)) {
                                        i15 = i17;
                                    }
                                    ttVar4 = ttVar5;
                                } else {
                                    i15 = i17;
                                }
                            } else {
                                str3 = str;
                            }
                            str = str3;
                        }
                        String str7 = str;
                        if (i15 == 1 && ttVar4 != null && str7 == null) {
                            str2 = d.substring(ttVar4.c.length()) + kg0Var.getText().toString();
                            d = ttVar4.c;
                            rj0Var.setText(d);
                        } else {
                            str2 = str7;
                        }
                        List list2 = (List) hashMap.get(d);
                        if (list2 == null) {
                            i10 = 0;
                            ttVar = null;
                        } else if (list2.size() > 1) {
                            String string2 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + d, null);
                            tt ttVar6 = (tt) yh.j(1, list2);
                            if (string2 != null) {
                                int size3 = arrayList.size();
                                int i18 = 0;
                                while (i18 < size3) {
                                    Object obj5 = arrayList.get(i18);
                                    i18++;
                                    ttVar = (tt) obj5;
                                    if (Objects.equals(ttVar.d, string2)) {
                                        i10 = 0;
                                    }
                                }
                            }
                            ttVar = ttVar6;
                            i10 = 0;
                        } else {
                            i10 = 0;
                            ttVar = (tt) list2.get(0);
                        }
                        if (ttVar != null) {
                            ng0Var.E = true;
                            ng0Var.y = ttVar;
                            ng0Var.v(d, ttVar);
                            ng0Var.x = i10;
                        } else {
                            ng0Var.setCountryButtonText(null);
                            kg0Var.setHintText((String) null);
                            ng0Var.x = 2;
                        }
                        if (!z4) {
                            rj0Var.setSelection(rj0Var.getText().length());
                        }
                        if (str2 != null) {
                            kg0Var.requestFocus();
                            kg0Var.setText(str2);
                            kg0Var.setSelection(kg0Var.length());
                        }
                    }
                    ng0Var.F = false;
                    break;
                }
                break;
            case 11:
                uj0 uj0Var = (uj0) this.b;
                HashMap hashMap2 = uj0Var.x;
                ArrayList arrayList2 = uj0Var.w;
                if (!uj0Var.B) {
                    uj0Var.B = true;
                    String d10 = se.b.d(uj0Var.L.getText().toString(), false);
                    uj0Var.L.setText(d10);
                    String str8 = null;
                    if (d10.length() == 0) {
                        uj0Var.t(null);
                        uj0Var.N.setHintText((String) null);
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
                                            Object obj7 = (tt) yh.j(1, list3);
                                            if (string3 != null) {
                                                int size4 = arrayList2.size();
                                                int i20 = 0;
                                                while (true) {
                                                    if (i20 < size4) {
                                                        Object obj8 = arrayList2.get(i20);
                                                        i20++;
                                                        tt ttVar7 = (tt) obj8;
                                                        if (Objects.equals(ttVar7.d, string3)) {
                                                            obj7 = ttVar7;
                                                        }
                                                    }
                                                }
                                            }
                                            obj6 = obj7;
                                        } else {
                                            obj6 = (tt) list3.get(0);
                                        }
                                    }
                                    if (obj6 != null) {
                                        str5 = d10.substring(i19) + uj0Var.N.getText().toString();
                                        uj0Var.L.setText(str4);
                                        z10 = true;
                                    } else {
                                        i19--;
                                        str8 = null;
                                    }
                                } else {
                                    str4 = d10;
                                    str5 = null;
                                    z10 = false;
                                }
                            }
                            if (!z10) {
                                str5 = str4.substring(1) + uj0Var.N.getText().toString();
                                rj0 rj0Var2 = uj0Var.L;
                                str4 = str4.substring(0, 1);
                                rj0Var2.setText(str4);
                            }
                        } else {
                            str4 = d10;
                            str5 = null;
                            z10 = false;
                        }
                        int size5 = arrayList2.size();
                        tt ttVar8 = null;
                        int i21 = 0;
                        int i22 = 0;
                        while (i22 < size5) {
                            Object obj9 = arrayList2.get(i22);
                            i22++;
                            tt ttVar9 = (tt) obj9;
                            if (ttVar9.c.startsWith(str4)) {
                                i21++;
                                if (ttVar9.c.equals(str4)) {
                                    ttVar8 = ttVar9;
                                }
                            }
                        }
                        if (i21 == 1 && ttVar8 != null && str5 == null) {
                            str5 = str4.substring(ttVar8.c.length()) + uj0Var.N.getText().toString();
                            rj0 rj0Var3 = uj0Var.L;
                            String str9 = ttVar8.c;
                            rj0Var3.setText(str9);
                            str4 = str9;
                        }
                        List list4 = (List) hashMap2.get(str4);
                        if (list4 == null) {
                            ttVar2 = null;
                        } else if (list4.size() > 1) {
                            String string4 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + str4, null);
                            tt ttVar10 = (tt) yh.j(1, list4);
                            if (string4 != null) {
                                int size6 = arrayList2.size();
                                int i23 = 0;
                                while (i23 < size6) {
                                    Object obj10 = arrayList2.get(i23);
                                    i23++;
                                    tt ttVar11 = (tt) obj10;
                                    if (Objects.equals(ttVar11.d, string4)) {
                                        ttVar2 = ttVar11;
                                    }
                                }
                            }
                            ttVar2 = ttVar10;
                        } else {
                            ttVar2 = (tt) list4.get(0);
                        }
                        if (ttVar2 != null) {
                            uj0Var.D = true;
                            uj0Var.u(str4, ttVar2);
                        } else {
                            uj0Var.t(null);
                            uj0Var.N.setHintText((String) null);
                        }
                        if (!z10) {
                            rj0 rj0Var4 = uj0Var.L;
                            rj0Var4.setSelection(rj0Var4.getText().length());
                        }
                        if (str5 != null && str5.length() != 0) {
                            uj0Var.N.requestFocus();
                            uj0Var.N.setText(str5);
                            rj0 rj0Var5 = uj0Var.N;
                            rj0Var5.setSelection(rj0Var5.length());
                        }
                    }
                    uj0Var.B = false;
                    uj0.q(uj0Var);
                    break;
                }
                break;
            case 12:
                fn0 fn0Var = (fn0) this.b;
                if (!fn0Var.W0 && fn0Var.Q0 != 0 && fn0Var.V[0].length() == fn0Var.Q0) {
                    fn0Var.I.callOnClick();
                    break;
                }
                break;
            case 13:
                lo0 lo0Var = (lo0) this.b;
                if (lo0Var.Z != 0 && editable.length() == lo0Var.Z) {
                    lo0Var.A0(false);
                    break;
                }
                break;
            case 14:
                lq0 lq0Var = ((mq0) this.b).p0;
                if (lq0Var != null) {
                    lq0Var.c(editable);
                    break;
                }
                break;
            case 15:
                n51 n51Var = (n51) this.b;
                eh.b bVar = n51Var.h;
                String obj11 = (bVar.getText() == null || AndroidUtilities.trim(bVar.getText(), null).length() == 0) ? null : bVar.getText().toString();
                n51Var.y.v(obj11, true, true);
                k61 k61Var = n51Var.n;
                if (k61Var != null) {
                    k61Var.E1(null);
                    n51Var.n.F1(TextUtils.isEmpty(obj11), true);
                }
                if (bVar != null) {
                    bVar.clearAnimation();
                    bVar.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.pr.h).start();
                }
                n51Var.c(false);
                break;
            case 16:
                String trim = editable.toString().trim();
                oe1 oe1Var = (oe1) this.b;
                String str10 = oe1Var.n;
                if (trim.length() > 0) {
                    oe1Var.n = trim.substring(0, 1).toUpperCase();
                } else {
                    oe1Var.n = "";
                }
                if (!str10.equals(oe1Var.n)) {
                    org.telegram.ui.Components.o80 o80Var = new org.telegram.ui.Components.o80(1, null);
                    o80Var.a(oe1Var.n);
                    org.telegram.ui.Components.yl0 yl0Var = oe1Var.v;
                    if (yl0Var != null) {
                        yl0Var.b(o80Var, true);
                        break;
                    }
                }
                break;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                bg1 bg1Var = twoStepVerificationActivity.S;
                if (twoStepVerificationActivity.R) {
                    AndroidUtilities.cancelRunOnUIThread(bg1Var);
                    bg1Var.run();
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
                xr xrVar = (xr) obj;
                xrVar.x = charSequence.length() != 0;
                xrVar.v = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                xrVar.C = ofFloat;
                ofFloat.addUpdateListener(new e3(xrVar, 9));
                if (xrVar.x) {
                    xrVar.C.setDuration(220L);
                } else {
                    xrVar.C.setInterpolator(new OvershootInterpolator(1.5f));
                    xrVar.C.setDuration(350L);
                }
                xrVar.C.start();
                xrVar.hideActionMode();
                break;
            case 7:
                zd0 zd0Var = (zd0) obj;
                sd0 sd0Var = zd0Var.P;
                if (zd0Var.O) {
                    zd0Var.removeCallbacks(sd0Var);
                    sd0Var.run();
                    break;
                }
                break;
            case 8:
                se0 se0Var = (se0) obj;
                qe0 qe0Var = se0Var.x;
                if (se0Var.w) {
                    se0Var.removeCallbacks(qe0Var);
                    qe0Var.run();
                    break;
                }
                break;
            case 9:
                sf0 sf0Var = (sf0) obj;
                ff0 ff0Var = sf0Var.o0;
                if (sf0Var.n0) {
                    sf0Var.removeCallbacks(ff0Var);
                    ff0Var.run();
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.a) {
            case 1:
                nd ndVar = (nd) this.b;
                ndVar.d0(ndVar.w.getText().toString());
                break;
            case 3:
                ep epVar = (ep) this.b;
                if (!epVar.j0) {
                    String obj = epVar.a.getText().toString();
                    ma maVar = epVar.L;
                    if (maVar != null) {
                        maVar.b(obj);
                    }
                    epVar.W(obj);
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
