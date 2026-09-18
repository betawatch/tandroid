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

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
        vt vtVar;
        String str3;
        Object obj;
        String str4;
        String str5;
        boolean z11;
        vt vtVar2;
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
                uo uoVar = (uo) this.b;
                uoVar.r.n(5L, uoVar.v.getText().toString(), null);
                ai.z5 z5Var = uoVar.e;
                if (z5Var != null) {
                    z5Var.invalidate();
                    break;
                }
                break;
            case 3:
                ((ip) this.b).V();
                break;
            case 4:
                mq mqVar = (mq) this.b;
                nq nqVar = mqVar.e;
                if (!mqVar.d) {
                    nqVar.S = editable.toString();
                    s4.c1 L = nqVar.b.L(nqVar.u0);
                    if (L != null) {
                        nq.f0(nqVar, L.a);
                        break;
                    }
                }
                break;
            case 5:
                break;
            case 6:
                e70 e70Var = (e70) this.b;
                if (e70Var.f.r.length() == 0) {
                    e70Var.T = false;
                    e70Var.S = false;
                    c70 c70Var = e70Var.v;
                    if (c70Var.n) {
                        c70Var.n = false;
                        c70Var.l();
                    }
                    e70Var.v.L(null);
                    e70Var.n.setFastScrollVisible(true);
                    e70Var.n.setVerticalScrollBarEnabled(false);
                    e70Var.q0(0);
                    break;
                } else {
                    c70 c70Var2 = e70Var.v;
                    boolean z12 = c70Var2.n;
                    if (!z12) {
                        e70Var.T = true;
                        e70Var.S = true;
                        if (!z12) {
                            c70Var2.n = true;
                            c70Var2.l();
                        }
                        e70Var.n.setFastScrollVisible(false);
                        e70Var.n.setVerticalScrollBarEnabled(true);
                    }
                    e70Var.v.L(e70Var.f.r.getText().toString());
                    e70Var.s.e(true, false);
                    break;
                }
            case 7:
            case 8:
            case 9:
                break;
            case 10:
                wg0 wg0Var = (wg0) this.b;
                HashMap hashMap = wg0Var.F;
                ArrayList arrayList = wg0Var.E;
                ck0 ck0Var = wg0Var.a;
                tg0 tg0Var = wg0Var.b;
                if (!wg0Var.I) {
                    int i11 = 1;
                    wg0Var.I = true;
                    int i12 = 0;
                    String d = gf.b.d(ck0Var.getText().toString(), false);
                    ck0Var.setText(d);
                    String str6 = null;
                    if (d.length() == 0) {
                        wg0Var.setCountryButtonText(null);
                        tg0Var.setHintText((String) null);
                        wg0Var.x = 1;
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
                                        Object obj2 = (vt) t8.b.h(i11, list);
                                        if (string != null) {
                                            int size = arrayList.size();
                                            int i14 = 0;
                                            while (true) {
                                                if (i14 < size) {
                                                    Object obj3 = arrayList.get(i14);
                                                    i14++;
                                                    vt vtVar3 = (vt) obj3;
                                                    if (Objects.equals(vtVar3.d, string)) {
                                                        obj2 = vtVar3;
                                                    }
                                                }
                                            }
                                        }
                                        obj = obj2;
                                    } else {
                                        obj = (vt) list.get(0);
                                    }
                                    if (obj != null) {
                                        str = d.substring(i13) + tg0Var.getText().toString();
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
                                str = d.substring(1) + tg0Var.getText().toString();
                                d = d.substring(0, 1);
                                ck0Var.setText(d);
                            }
                        } else {
                            str = null;
                            z10 = false;
                        }
                        int size2 = arrayList.size();
                        vt vtVar4 = null;
                        int i15 = 0;
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj4 = arrayList.get(i16);
                            i16++;
                            vt vtVar5 = (vt) obj4;
                            if (vtVar5.c.startsWith(d)) {
                                int i17 = i15 + 1;
                                str3 = str;
                                if (vtVar5.c.equals(d)) {
                                    if (vtVar4 == null || !vtVar4.c.equals(vtVar5.c)) {
                                        i15 = i17;
                                    }
                                    vtVar4 = vtVar5;
                                } else {
                                    i15 = i17;
                                }
                            } else {
                                str3 = str;
                            }
                            str = str3;
                        }
                        String str7 = str;
                        if (i15 == 1 && vtVar4 != null && str7 == null) {
                            str2 = d.substring(vtVar4.c.length()) + tg0Var.getText().toString();
                            d = vtVar4.c;
                            ck0Var.setText(d);
                        } else {
                            str2 = str7;
                        }
                        List list2 = (List) hashMap.get(d);
                        if (list2 == null) {
                            i10 = 0;
                            vtVar = null;
                        } else if (list2.size() > 1) {
                            String string2 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + d, null);
                            vt vtVar6 = (vt) t8.b.h(1, list2);
                            if (string2 != null) {
                                int size3 = arrayList.size();
                                int i18 = 0;
                                while (i18 < size3) {
                                    Object obj5 = arrayList.get(i18);
                                    i18++;
                                    vtVar = (vt) obj5;
                                    if (Objects.equals(vtVar.d, string2)) {
                                        i10 = 0;
                                    }
                                }
                            }
                            vtVar = vtVar6;
                            i10 = 0;
                        } else {
                            i10 = 0;
                            vtVar = (vt) list2.get(0);
                        }
                        if (vtVar != null) {
                            wg0Var.H = true;
                            wg0Var.y = vtVar;
                            wg0Var.v(d, vtVar);
                            wg0Var.x = i10;
                        } else {
                            wg0Var.setCountryButtonText(null);
                            tg0Var.setHintText((String) null);
                            wg0Var.x = 2;
                        }
                        if (!z10) {
                            ck0Var.setSelection(ck0Var.getText().length());
                        }
                        if (str2 != null) {
                            tg0Var.requestFocus();
                            tg0Var.setText(str2);
                            tg0Var.setSelection(tg0Var.length());
                        }
                    }
                    wg0Var.I = false;
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
                                            Object obj7 = (vt) t8.b.h(1, list3);
                                            if (string3 != null) {
                                                int size4 = arrayList2.size();
                                                int i20 = 0;
                                                while (true) {
                                                    if (i20 < size4) {
                                                        Object obj8 = arrayList2.get(i20);
                                                        i20++;
                                                        vt vtVar7 = (vt) obj8;
                                                        if (Objects.equals(vtVar7.d, string3)) {
                                                            obj7 = vtVar7;
                                                        }
                                                    }
                                                }
                                            }
                                            obj6 = obj7;
                                        } else {
                                            obj6 = (vt) list3.get(0);
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
                        vt vtVar8 = null;
                        int i21 = 0;
                        int i22 = 0;
                        while (i22 < size5) {
                            Object obj9 = arrayList2.get(i22);
                            i22++;
                            vt vtVar9 = (vt) obj9;
                            if (vtVar9.c.startsWith(str4)) {
                                i21++;
                                if (vtVar9.c.equals(str4)) {
                                    vtVar8 = vtVar9;
                                }
                            }
                        }
                        if (i21 == 1 && vtVar8 != null && str5 == null) {
                            str5 = str4.substring(vtVar8.c.length()) + ek0Var.Q.getText().toString();
                            ck0 ck0Var3 = ek0Var.O;
                            String str9 = vtVar8.c;
                            ck0Var3.setText(str9);
                            str4 = str9;
                        }
                        List list4 = (List) hashMap2.get(str4);
                        if (list4 == null) {
                            vtVar2 = null;
                        } else if (list4.size() > 1) {
                            String string4 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + str4, null);
                            vt vtVar10 = (vt) t8.b.h(1, list4);
                            if (string4 != null) {
                                int size6 = arrayList2.size();
                                int i23 = 0;
                                while (i23 < size6) {
                                    Object obj10 = arrayList2.get(i23);
                                    i23++;
                                    vt vtVar11 = (vt) obj10;
                                    if (Objects.equals(vtVar11.d, string4)) {
                                        vtVar2 = vtVar11;
                                    }
                                }
                            }
                            vtVar2 = vtVar10;
                        } else {
                            vtVar2 = (vt) list4.get(0);
                        }
                        if (vtVar2 != null) {
                            ek0Var.G = true;
                            ek0Var.u(str4, vtVar2);
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
                pn0 pn0Var = (pn0) this.b;
                if (!pn0Var.Z0 && pn0Var.T0 != 0 && pn0Var.Y[0].length() == pn0Var.T0) {
                    pn0Var.L.callOnClick();
                    break;
                }
                break;
            case 13:
                xo0 xo0Var = (xo0) this.b;
                if (xo0Var.c0 != 0 && editable.length() == xo0Var.c0) {
                    xo0Var.A0(false);
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
                x51 x51Var = (x51) this.b;
                org.telegram.ui.Cells.c6 c6Var = x51Var.h;
                String obj11 = (c6Var.getText() == null || AndroidUtilities.trim(c6Var.getText(), null).length() == 0) ? null : c6Var.getText().toString();
                x51Var.y.v(obj11, true, true);
                u61 u61Var = x51Var.n;
                if (u61Var != null) {
                    u61Var.G1(null);
                    x51Var.n.H1(TextUtils.isEmpty(obj11), true);
                }
                if (c6Var != null) {
                    c6Var.clearAnimation();
                    c6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                }
                x51Var.c(false);
                break;
            case 16:
                String trim = editable.toString().trim();
                ze1 ze1Var = (ze1) this.b;
                String str10 = ze1Var.n;
                if (trim.length() > 0) {
                    ze1Var.n = trim.substring(0, 1).toUpperCase();
                } else {
                    ze1Var.n = "";
                }
                if (!str10.equals(ze1Var.n)) {
                    org.telegram.ui.Components.u80 u80Var = new org.telegram.ui.Components.u80(1, null);
                    u80Var.a(ze1Var.n);
                    org.telegram.ui.Components.bm0 bm0Var = ze1Var.v;
                    if (bm0Var != null) {
                        bm0Var.b(u80Var, true);
                        break;
                    }
                }
                break;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                mg1 mg1Var = twoStepVerificationActivity.V;
                if (twoStepVerificationActivity.U) {
                    AndroidUtilities.cancelRunOnUIThread(mg1Var);
                    mg1Var.run();
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
                bs bsVar = (bs) obj;
                bsVar.x = charSequence.length() != 0;
                bsVar.v = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                bsVar.F = ofFloat;
                ofFloat.addUpdateListener(new b3(bsVar, 8));
                if (bsVar.x) {
                    bsVar.F.setDuration(220L);
                } else {
                    bsVar.F.setInterpolator(new OvershootInterpolator(1.5f));
                    bsVar.F.setDuration(350L);
                }
                bsVar.F.start();
                bsVar.hideActionMode();
                break;
            case 7:
                he0 he0Var = (he0) obj;
                ae0 ae0Var = he0Var.S;
                if (he0Var.R) {
                    he0Var.removeCallbacks(ae0Var);
                    ae0Var.run();
                    break;
                }
                break;
            case 8:
                bf0 bf0Var = (bf0) obj;
                ze0 ze0Var = bf0Var.x;
                if (bf0Var.w) {
                    bf0Var.removeCallbacks(ze0Var);
                    ze0Var.run();
                    break;
                }
                break;
            case 9:
                ag0 ag0Var = (ag0) obj;
                nf0 nf0Var = ag0Var.r0;
                if (ag0Var.q0) {
                    ag0Var.removeCallbacks(nf0Var);
                    nf0Var.run();
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
                mdVar.d0(mdVar.w.getText().toString());
                break;
            case 3:
                ip ipVar = (ip) this.b;
                if (!ipVar.m0) {
                    String obj = ipVar.a.getText().toString();
                    oa oaVar = ipVar.O;
                    if (oaVar != null) {
                        oaVar.b(obj);
                    }
                    ipVar.W(obj);
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
