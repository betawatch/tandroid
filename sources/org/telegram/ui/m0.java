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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class m0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m0(Object obj, int i10) {
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
        st stVar;
        String str3;
        Object obj;
        String str4;
        String str5;
        boolean z11;
        st stVar2;
        switch (this.a) {
            case 0:
                i4 i4Var = (i4) this.b;
                if (i4Var.h0.W && (kVar = i4Var.i0) != null) {
                    kVar.setInput(editable == null ? null : editable.toString());
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                so soVar = (so) this.b;
                soVar.r.n(5L, soVar.v.getText().toString(), null);
                ai.y5 y5Var = soVar.e;
                if (y5Var != null) {
                    y5Var.invalidate();
                    break;
                }
                break;
            case 3:
                ((gp) this.b).V();
                break;
            case 4:
                kq kqVar = (kq) this.b;
                lq lqVar = kqVar.e;
                if (!kqVar.d) {
                    lqVar.S = editable.toString();
                    s4.c1 K = lqVar.b.K(lqVar.u0);
                    if (K != null) {
                        lq.f0(lqVar, K.a);
                        break;
                    }
                }
                break;
            case 5:
                break;
            case 6:
                b70 b70Var = (b70) this.b;
                if (b70Var.f.r.length() == 0) {
                    b70Var.T = false;
                    b70Var.S = false;
                    z60 z60Var = b70Var.v;
                    if (z60Var.n) {
                        z60Var.n = false;
                        z60Var.l();
                    }
                    b70Var.v.L(null);
                    b70Var.n.setFastScrollVisible(true);
                    b70Var.n.setVerticalScrollBarEnabled(false);
                    b70Var.q0(0);
                    break;
                } else {
                    z60 z60Var2 = b70Var.v;
                    boolean z12 = z60Var2.n;
                    if (!z12) {
                        b70Var.T = true;
                        b70Var.S = true;
                        if (!z12) {
                            z60Var2.n = true;
                            z60Var2.l();
                        }
                        b70Var.n.setFastScrollVisible(false);
                        b70Var.n.setVerticalScrollBarEnabled(true);
                    }
                    b70Var.v.L(b70Var.f.r.getText().toString());
                    b70Var.s.e(true, false);
                    break;
                }
            case 7:
            case 8:
            case 9:
                break;
            case 10:
                qg0 qg0Var = (qg0) this.b;
                HashMap hashMap = qg0Var.F;
                ArrayList arrayList = qg0Var.E;
                uj0 uj0Var = qg0Var.a;
                ng0 ng0Var = qg0Var.b;
                if (!qg0Var.I) {
                    int i11 = 1;
                    qg0Var.I = true;
                    int i12 = 0;
                    String d = gf.b.d(uj0Var.getText().toString(), false);
                    uj0Var.setText(d);
                    String str6 = null;
                    if (d.length() == 0) {
                        qg0Var.setCountryButtonText(null);
                        ng0Var.setHintText((String) null);
                        qg0Var.x = 1;
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
                                        Object obj2 = (st) org.telegram.ui.Cells.q3.g(i11, list);
                                        if (string != null) {
                                            int size = arrayList.size();
                                            int i14 = 0;
                                            while (true) {
                                                if (i14 < size) {
                                                    Object obj3 = arrayList.get(i14);
                                                    i14++;
                                                    st stVar3 = (st) obj3;
                                                    if (Objects.equals(stVar3.d, string)) {
                                                        obj2 = stVar3;
                                                    }
                                                }
                                            }
                                        }
                                        obj = obj2;
                                    } else {
                                        obj = (st) list.get(0);
                                    }
                                    if (obj != null) {
                                        str = d.substring(i13) + ng0Var.getText().toString();
                                        uj0Var.setText(substring);
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
                                str = d.substring(1) + ng0Var.getText().toString();
                                d = d.substring(0, 1);
                                uj0Var.setText(d);
                            }
                        } else {
                            str = null;
                            z10 = false;
                        }
                        int size2 = arrayList.size();
                        st stVar4 = null;
                        int i15 = 0;
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj4 = arrayList.get(i16);
                            i16++;
                            st stVar5 = (st) obj4;
                            if (stVar5.c.startsWith(d)) {
                                int i17 = i15 + 1;
                                str3 = str;
                                if (stVar5.c.equals(d)) {
                                    if (stVar4 == null || !stVar4.c.equals(stVar5.c)) {
                                        i15 = i17;
                                    }
                                    stVar4 = stVar5;
                                } else {
                                    i15 = i17;
                                }
                            } else {
                                str3 = str;
                            }
                            str = str3;
                        }
                        String str7 = str;
                        if (i15 == 1 && stVar4 != null && str7 == null) {
                            str2 = d.substring(stVar4.c.length()) + ng0Var.getText().toString();
                            d = stVar4.c;
                            uj0Var.setText(d);
                        } else {
                            str2 = str7;
                        }
                        List list2 = (List) hashMap.get(d);
                        if (list2 == null) {
                            i10 = 0;
                            stVar = null;
                        } else if (list2.size() > 1) {
                            String string2 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + d, null);
                            st stVar6 = (st) org.telegram.ui.Cells.q3.g(1, list2);
                            if (string2 != null) {
                                int size3 = arrayList.size();
                                int i18 = 0;
                                while (i18 < size3) {
                                    Object obj5 = arrayList.get(i18);
                                    i18++;
                                    stVar = (st) obj5;
                                    if (Objects.equals(stVar.d, string2)) {
                                        i10 = 0;
                                    }
                                }
                            }
                            stVar = stVar6;
                            i10 = 0;
                        } else {
                            i10 = 0;
                            stVar = (st) list2.get(0);
                        }
                        if (stVar != null) {
                            qg0Var.H = true;
                            qg0Var.y = stVar;
                            qg0Var.v(d, stVar);
                            qg0Var.x = i10;
                        } else {
                            qg0Var.setCountryButtonText(null);
                            ng0Var.setHintText((String) null);
                            qg0Var.x = 2;
                        }
                        if (!z10) {
                            uj0Var.setSelection(uj0Var.getText().length());
                        }
                        if (str2 != null) {
                            ng0Var.requestFocus();
                            ng0Var.setText(str2);
                            ng0Var.setSelection(ng0Var.length());
                        }
                    }
                    qg0Var.I = false;
                    break;
                }
                break;
            case 11:
                wj0 wj0Var = (wj0) this.b;
                HashMap hashMap2 = wj0Var.x;
                ArrayList arrayList2 = wj0Var.w;
                if (!wj0Var.E) {
                    wj0Var.E = true;
                    String d10 = gf.b.d(wj0Var.O.getText().toString(), false);
                    wj0Var.O.setText(d10);
                    String str8 = null;
                    if (d10.length() == 0) {
                        wj0Var.t(null);
                        wj0Var.Q.setHintText((String) null);
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
                                            Object obj7 = (st) org.telegram.ui.Cells.q3.g(1, list3);
                                            if (string3 != null) {
                                                int size4 = arrayList2.size();
                                                int i20 = 0;
                                                while (true) {
                                                    if (i20 < size4) {
                                                        Object obj8 = arrayList2.get(i20);
                                                        i20++;
                                                        st stVar7 = (st) obj8;
                                                        if (Objects.equals(stVar7.d, string3)) {
                                                            obj7 = stVar7;
                                                        }
                                                    }
                                                }
                                            }
                                            obj6 = obj7;
                                        } else {
                                            obj6 = (st) list3.get(0);
                                        }
                                    }
                                    if (obj6 != null) {
                                        str5 = d10.substring(i19) + wj0Var.Q.getText().toString();
                                        wj0Var.O.setText(str4);
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
                                str5 = str4.substring(1) + wj0Var.Q.getText().toString();
                                uj0 uj0Var2 = wj0Var.O;
                                str4 = str4.substring(0, 1);
                                uj0Var2.setText(str4);
                            }
                        } else {
                            str4 = d10;
                            str5 = null;
                            z11 = false;
                        }
                        int size5 = arrayList2.size();
                        st stVar8 = null;
                        int i21 = 0;
                        int i22 = 0;
                        while (i22 < size5) {
                            Object obj9 = arrayList2.get(i22);
                            i22++;
                            st stVar9 = (st) obj9;
                            if (stVar9.c.startsWith(str4)) {
                                i21++;
                                if (stVar9.c.equals(str4)) {
                                    stVar8 = stVar9;
                                }
                            }
                        }
                        if (i21 == 1 && stVar8 != null && str5 == null) {
                            str5 = str4.substring(stVar8.c.length()) + wj0Var.Q.getText().toString();
                            uj0 uj0Var3 = wj0Var.O;
                            String str9 = stVar8.c;
                            uj0Var3.setText(str9);
                            str4 = str9;
                        }
                        List list4 = (List) hashMap2.get(str4);
                        if (list4 == null) {
                            stVar2 = null;
                        } else if (list4.size() > 1) {
                            String string4 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + str4, null);
                            st stVar10 = (st) org.telegram.ui.Cells.q3.g(1, list4);
                            if (string4 != null) {
                                int size6 = arrayList2.size();
                                int i23 = 0;
                                while (i23 < size6) {
                                    Object obj10 = arrayList2.get(i23);
                                    i23++;
                                    st stVar11 = (st) obj10;
                                    if (Objects.equals(stVar11.d, string4)) {
                                        stVar2 = stVar11;
                                    }
                                }
                            }
                            stVar2 = stVar10;
                        } else {
                            stVar2 = (st) list4.get(0);
                        }
                        if (stVar2 != null) {
                            wj0Var.G = true;
                            wj0Var.u(str4, stVar2);
                        } else {
                            wj0Var.t(null);
                            wj0Var.Q.setHintText((String) null);
                        }
                        if (!z11) {
                            uj0 uj0Var4 = wj0Var.O;
                            uj0Var4.setSelection(uj0Var4.getText().length());
                        }
                        if (str5 != null && str5.length() != 0) {
                            wj0Var.Q.requestFocus();
                            wj0Var.Q.setText(str5);
                            uj0 uj0Var5 = wj0Var.Q;
                            uj0Var5.setSelection(uj0Var5.length());
                        }
                    }
                    wj0Var.E = false;
                    wj0.q(wj0Var);
                    break;
                }
                break;
            case 12:
                in0 in0Var = (in0) this.b;
                if (!in0Var.Z0 && in0Var.T0 != 0 && in0Var.Y[0].length() == in0Var.T0) {
                    in0Var.L.callOnClick();
                    break;
                }
                break;
            case 13:
                qo0 qo0Var = (qo0) this.b;
                if (qo0Var.c0 != 0 && editable.length() == qo0Var.c0) {
                    qo0Var.A0(false);
                    break;
                }
                break;
            case 14:
                tq0 tq0Var = ((uq0) this.b).s0;
                if (tq0Var != null) {
                    tq0Var.b(editable);
                    break;
                }
                break;
            case 15:
                q51 q51Var = (q51) this.b;
                org.telegram.ui.Cells.c6 c6Var = q51Var.h;
                String obj11 = (c6Var.getText() == null || AndroidUtilities.trim(c6Var.getText(), null).length() == 0) ? null : c6Var.getText().toString();
                q51Var.y.v(obj11, true, true);
                n61 n61Var = q51Var.n;
                if (n61Var != null) {
                    n61Var.F1(null);
                    q51Var.n.G1(TextUtils.isEmpty(obj11), true);
                }
                if (c6Var != null) {
                    c6Var.clearAnimation();
                    c6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.rr.h).start();
                }
                q51Var.c(false);
                break;
            case 16:
                String trim = editable.toString().trim();
                se1 se1Var = (se1) this.b;
                String str10 = se1Var.n;
                if (trim.length() > 0) {
                    se1Var.n = trim.substring(0, 1).toUpperCase();
                } else {
                    se1Var.n = "";
                }
                if (!str10.equals(se1Var.n)) {
                    org.telegram.ui.Components.m80 m80Var = new org.telegram.ui.Components.m80(1, null);
                    m80Var.a(se1Var.n);
                    org.telegram.ui.Components.rl0 rl0Var = se1Var.v;
                    if (rl0Var != null) {
                        rl0Var.b(m80Var, true);
                        break;
                    }
                }
                break;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                fg1 fg1Var = twoStepVerificationActivity.V;
                if (twoStepVerificationActivity.U) {
                    AndroidUtilities.cancelRunOnUIThread(fg1Var);
                    fg1Var.run();
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
                xrVar.F = ofFloat;
                ofFloat.addUpdateListener(new c3(xrVar, 9));
                if (xrVar.x) {
                    xrVar.F.setDuration(220L);
                } else {
                    xrVar.F.setInterpolator(new OvershootInterpolator(1.5f));
                    xrVar.F.setDuration(350L);
                }
                xrVar.F.start();
                xrVar.hideActionMode();
                break;
            case 7:
                be0 be0Var = (be0) obj;
                ud0 ud0Var = be0Var.S;
                if (be0Var.R) {
                    be0Var.removeCallbacks(ud0Var);
                    ud0Var.run();
                    break;
                }
                break;
            case 8:
                ve0 ve0Var = (ve0) obj;
                te0 te0Var = ve0Var.x;
                if (ve0Var.w) {
                    ve0Var.removeCallbacks(te0Var);
                    te0Var.run();
                    break;
                }
                break;
            case 9:
                uf0 uf0Var = (uf0) obj;
                hf0 hf0Var = uf0Var.r0;
                if (uf0Var.q0) {
                    uf0Var.removeCallbacks(hf0Var);
                    hf0Var.run();
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.a) {
            case 1:
                ld ldVar = (ld) this.b;
                ldVar.d0(ldVar.w.getText().toString());
                break;
            case 3:
                gp gpVar = (gp) this.b;
                if (!gpVar.m0) {
                    String obj = gpVar.a.getText().toString();
                    na naVar = gpVar.O;
                    if (naVar != null) {
                        naVar.b(obj);
                    }
                    gpVar.W(obj);
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
