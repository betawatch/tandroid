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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class l0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.web.k kVar;
        String str;
        boolean z10;
        String str2;
        int i10;
        xt xtVar;
        String str3;
        Object obj;
        String str4;
        String str5;
        boolean z11;
        xt xtVar2;
        switch (this.a) {
            case 0:
                h4 h4Var = (h4) this.b;
                if (h4Var.h0.W && (kVar = h4Var.i0) != null) {
                    kVar.setInput(editable == null ? null : editable.toString());
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                wo woVar = (wo) this.b;
                woVar.r.n(5L, woVar.v.getText().toString(), null);
                ai.z5 z5Var = woVar.e;
                if (z5Var != null) {
                    z5Var.invalidate();
                    break;
                }
                break;
            case 3:
                ((kp) this.b).V();
                break;
            case 4:
                oq oqVar = (oq) this.b;
                pq pqVar = oqVar.e;
                if (!oqVar.d) {
                    pqVar.S = editable.toString();
                    s4.c1 L = pqVar.b.L(pqVar.u0);
                    if (L != null) {
                        pq.f0(pqVar, L.a);
                        break;
                    }
                }
                break;
            case 5:
                break;
            case 6:
                g70 g70Var = (g70) this.b;
                if (g70Var.f.r.length() == 0) {
                    g70Var.T = false;
                    g70Var.S = false;
                    e70 e70Var = g70Var.v;
                    if (e70Var.n) {
                        e70Var.n = false;
                        e70Var.l();
                    }
                    g70Var.v.L(null);
                    g70Var.n.setFastScrollVisible(true);
                    g70Var.n.setVerticalScrollBarEnabled(false);
                    g70Var.q0(0);
                    break;
                } else {
                    e70 e70Var2 = g70Var.v;
                    boolean z12 = e70Var2.n;
                    if (!z12) {
                        g70Var.T = true;
                        g70Var.S = true;
                        if (!z12) {
                            e70Var2.n = true;
                            e70Var2.l();
                        }
                        g70Var.n.setFastScrollVisible(false);
                        g70Var.n.setVerticalScrollBarEnabled(true);
                    }
                    g70Var.v.L(g70Var.f.r.getText().toString());
                    g70Var.s.e(true, false);
                    break;
                }
            case 7:
            case 8:
            case 9:
                break;
            case 10:
                xg0 xg0Var = (xg0) this.b;
                HashMap hashMap = xg0Var.F;
                ArrayList arrayList = xg0Var.E;
                ck0 ck0Var = xg0Var.a;
                ug0 ug0Var = xg0Var.b;
                if (!xg0Var.I) {
                    int i11 = 1;
                    xg0Var.I = true;
                    int i12 = 0;
                    String d = gf.b.d(ck0Var.getText().toString(), false);
                    ck0Var.setText(d);
                    String str6 = null;
                    if (d.length() == 0) {
                        xg0Var.setCountryButtonText(null);
                        ug0Var.setHintText((String) null);
                        xg0Var.x = 1;
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
                                        Object obj2 = (xt) org.telegram.ui.Cells.p6.g(i11, list);
                                        if (string != null) {
                                            int size = arrayList.size();
                                            int i14 = 0;
                                            while (true) {
                                                if (i14 < size) {
                                                    Object obj3 = arrayList.get(i14);
                                                    i14++;
                                                    xt xtVar3 = (xt) obj3;
                                                    if (Objects.equals(xtVar3.d, string)) {
                                                        obj2 = xtVar3;
                                                    }
                                                }
                                            }
                                        }
                                        obj = obj2;
                                    } else {
                                        obj = (xt) list.get(0);
                                    }
                                    if (obj != null) {
                                        str = d.substring(i13) + ug0Var.getText().toString();
                                        ck0Var.setText(substring);
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
                                str = d.substring(1) + ug0Var.getText().toString();
                                d = d.substring(0, 1);
                                ck0Var.setText(d);
                            }
                        } else {
                            str = null;
                            z10 = false;
                        }
                        int size2 = arrayList.size();
                        xt xtVar4 = null;
                        int i15 = 0;
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj4 = arrayList.get(i16);
                            i16++;
                            xt xtVar5 = (xt) obj4;
                            if (xtVar5.c.startsWith(d)) {
                                int i17 = i15 + 1;
                                str3 = str;
                                if (xtVar5.c.equals(d)) {
                                    if (xtVar4 == null || !xtVar4.c.equals(xtVar5.c)) {
                                        i15 = i17;
                                    }
                                    xtVar4 = xtVar5;
                                } else {
                                    i15 = i17;
                                }
                            } else {
                                str3 = str;
                            }
                            str = str3;
                        }
                        String str7 = str;
                        if (i15 == 1 && xtVar4 != null && str7 == null) {
                            str2 = d.substring(xtVar4.c.length()) + ug0Var.getText().toString();
                            d = xtVar4.c;
                            ck0Var.setText(d);
                        } else {
                            str2 = str7;
                        }
                        List list2 = (List) hashMap.get(d);
                        if (list2 == null) {
                            i10 = 0;
                            xtVar = null;
                        } else if (list2.size() > 1) {
                            String string2 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + d, null);
                            xt xtVar6 = (xt) org.telegram.ui.Cells.p6.g(1, list2);
                            if (string2 != null) {
                                int size3 = arrayList.size();
                                int i18 = 0;
                                while (i18 < size3) {
                                    Object obj5 = arrayList.get(i18);
                                    i18++;
                                    xtVar = (xt) obj5;
                                    if (Objects.equals(xtVar.d, string2)) {
                                        i10 = 0;
                                    }
                                }
                            }
                            xtVar = xtVar6;
                            i10 = 0;
                        } else {
                            i10 = 0;
                            xtVar = (xt) list2.get(0);
                        }
                        if (xtVar != null) {
                            xg0Var.H = true;
                            xg0Var.y = xtVar;
                            xg0Var.v(d, xtVar);
                            xg0Var.x = i10;
                        } else {
                            xg0Var.setCountryButtonText(null);
                            ug0Var.setHintText((String) null);
                            xg0Var.x = 2;
                        }
                        if (!z10) {
                            ck0Var.setSelection(ck0Var.getText().length());
                        }
                        if (str2 != null) {
                            ug0Var.requestFocus();
                            ug0Var.setText(str2);
                            ug0Var.setSelection(ug0Var.length());
                        }
                    }
                    xg0Var.I = false;
                    break;
                }
                break;
            case 11:
                ek0 ek0Var = (ek0) this.b;
                HashMap hashMap2 = ek0Var.x;
                ArrayList arrayList2 = ek0Var.w;
                if (!ek0Var.E) {
                    ek0Var.E = true;
                    String d10 = gf.b.d(ek0Var.O.getText().toString(), false);
                    ek0Var.O.setText(d10);
                    String str8 = null;
                    if (d10.length() == 0) {
                        ek0Var.t(null);
                        ek0Var.Q.setHintText((String) null);
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
                                            Object obj7 = (xt) org.telegram.ui.Cells.p6.g(1, list3);
                                            if (string3 != null) {
                                                int size4 = arrayList2.size();
                                                int i20 = 0;
                                                while (true) {
                                                    if (i20 < size4) {
                                                        Object obj8 = arrayList2.get(i20);
                                                        i20++;
                                                        xt xtVar7 = (xt) obj8;
                                                        if (Objects.equals(xtVar7.d, string3)) {
                                                            obj7 = xtVar7;
                                                        }
                                                    }
                                                }
                                            }
                                            obj6 = obj7;
                                        } else {
                                            obj6 = (xt) list3.get(0);
                                        }
                                    }
                                    if (obj6 != null) {
                                        str5 = d10.substring(i19) + ek0Var.Q.getText().toString();
                                        ek0Var.O.setText(str4);
                                        z11 = true;
                                    } else {
                                        i19--;
                                        str8 = null;
                                    }
                                } else {
                                    str4 = d10;
                                    str5 = null;
                                    z11 = false;
                                }
                            }
                            if (!z11) {
                                str5 = str4.substring(1) + ek0Var.Q.getText().toString();
                                ck0 ck0Var2 = ek0Var.O;
                                str4 = str4.substring(0, 1);
                                ck0Var2.setText(str4);
                            }
                        } else {
                            str4 = d10;
                            str5 = null;
                            z11 = false;
                        }
                        int size5 = arrayList2.size();
                        xt xtVar8 = null;
                        int i21 = 0;
                        int i22 = 0;
                        while (i22 < size5) {
                            Object obj9 = arrayList2.get(i22);
                            i22++;
                            xt xtVar9 = (xt) obj9;
                            if (xtVar9.c.startsWith(str4)) {
                                i21++;
                                if (xtVar9.c.equals(str4)) {
                                    xtVar8 = xtVar9;
                                }
                            }
                        }
                        if (i21 == 1 && xtVar8 != null && str5 == null) {
                            str5 = str4.substring(xtVar8.c.length()) + ek0Var.Q.getText().toString();
                            ck0 ck0Var3 = ek0Var.O;
                            String str9 = xtVar8.c;
                            ck0Var3.setText(str9);
                            str4 = str9;
                        }
                        List list4 = (List) hashMap2.get(str4);
                        if (list4 == null) {
                            xtVar2 = null;
                        } else if (list4.size() > 1) {
                            String string4 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + str4, null);
                            xt xtVar10 = (xt) org.telegram.ui.Cells.p6.g(1, list4);
                            if (string4 != null) {
                                int size6 = arrayList2.size();
                                int i23 = 0;
                                while (i23 < size6) {
                                    Object obj10 = arrayList2.get(i23);
                                    i23++;
                                    xt xtVar11 = (xt) obj10;
                                    if (Objects.equals(xtVar11.d, string4)) {
                                        xtVar2 = xtVar11;
                                    }
                                }
                            }
                            xtVar2 = xtVar10;
                        } else {
                            xtVar2 = (xt) list4.get(0);
                        }
                        if (xtVar2 != null) {
                            ek0Var.G = true;
                            ek0Var.u(str4, xtVar2);
                        } else {
                            ek0Var.t(null);
                            ek0Var.Q.setHintText((String) null);
                        }
                        if (!z11) {
                            ck0 ck0Var4 = ek0Var.O;
                            ck0Var4.setSelection(ck0Var4.getText().length());
                        }
                        if (str5 != null && str5.length() != 0) {
                            ek0Var.Q.requestFocus();
                            ek0Var.Q.setText(str5);
                            ck0 ck0Var5 = ek0Var.Q;
                            ck0Var5.setSelection(ck0Var5.length());
                        }
                    }
                    ek0Var.E = false;
                    ek0.q(ek0Var);
                    break;
                }
                break;
            case 12:
                qn0 qn0Var = (qn0) this.b;
                if (!qn0Var.Z0 && qn0Var.T0 != 0 && qn0Var.Y[0].length() == qn0Var.T0) {
                    qn0Var.L.callOnClick();
                    break;
                }
                break;
            case 13:
                yo0 yo0Var = (yo0) this.b;
                if (yo0Var.c0 != 0 && editable.length() == yo0Var.c0) {
                    yo0Var.A0(false);
                    break;
                }
                break;
            case 14:
                br0 br0Var = ((cr0) this.b).s0;
                if (br0Var != null) {
                    br0Var.b(editable);
                    break;
                }
                break;
            case 15:
                z51 z51Var = (z51) this.b;
                org.telegram.ui.Cells.b6 b6Var = z51Var.h;
                String obj11 = (b6Var.getText() == null || AndroidUtilities.trim(b6Var.getText(), null).length() == 0) ? null : b6Var.getText().toString();
                z51Var.y.v(obj11, true, true);
                w61 w61Var = z51Var.n;
                if (w61Var != null) {
                    w61Var.G1(null);
                    z51Var.n.H1(TextUtils.isEmpty(obj11), true);
                }
                if (b6Var != null) {
                    b6Var.clearAnimation();
                    b6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                }
                z51Var.c(false);
                break;
            case 16:
                String trim = editable.toString().trim();
                bf1 bf1Var = (bf1) this.b;
                String str10 = bf1Var.n;
                if (trim.length() > 0) {
                    bf1Var.n = trim.substring(0, 1).toUpperCase();
                } else {
                    bf1Var.n = "";
                }
                if (!str10.equals(bf1Var.n)) {
                    org.telegram.ui.Components.l80 l80Var = new org.telegram.ui.Components.l80(1, null);
                    l80Var.a(bf1Var.n);
                    org.telegram.ui.Components.rl0 rl0Var = bf1Var.v;
                    if (rl0Var != null) {
                        rl0Var.b(l80Var, true);
                        break;
                    }
                }
                break;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                og1 og1Var = twoStepVerificationActivity.V;
                if (twoStepVerificationActivity.U) {
                    AndroidUtilities.cancelRunOnUIThread(og1Var);
                    og1Var.run();
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
                ds dsVar = (ds) obj;
                dsVar.x = charSequence.length() != 0;
                dsVar.v = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                dsVar.F = ofFloat;
                ofFloat.addUpdateListener(new b3(dsVar, 8));
                if (dsVar.x) {
                    dsVar.F.setDuration(220L);
                } else {
                    dsVar.F.setInterpolator(new OvershootInterpolator(1.5f));
                    dsVar.F.setDuration(350L);
                }
                dsVar.F.start();
                dsVar.hideActionMode();
                break;
            case 7:
                ie0 ie0Var = (ie0) obj;
                be0 be0Var = ie0Var.S;
                if (ie0Var.R) {
                    ie0Var.removeCallbacks(be0Var);
                    be0Var.run();
                    break;
                }
                break;
            case 8:
                cf0 cf0Var = (cf0) obj;
                af0 af0Var = cf0Var.x;
                if (cf0Var.w) {
                    cf0Var.removeCallbacks(af0Var);
                    af0Var.run();
                    break;
                }
                break;
            case 9:
                bg0 bg0Var = (bg0) obj;
                of0 of0Var = bg0Var.r0;
                if (bg0Var.q0) {
                    bg0Var.removeCallbacks(of0Var);
                    of0Var.run();
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
                kp kpVar = (kp) this.b;
                if (!kpVar.m0) {
                    String obj = kpVar.a.getText().toString();
                    pa paVar = kpVar.O;
                    if (paVar != null) {
                        paVar.b(obj);
                    }
                    kpVar.W(obj);
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
