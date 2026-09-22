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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                xg0 xg0Var = (xg0) this.b;
                HashMap hashMap = xg0Var.F;
                ArrayList arrayList = xg0Var.E;
                dk0 dk0Var = xg0Var.a;
                ug0 ug0Var = xg0Var.b;
                if (!xg0Var.I) {
                    int i11 = 1;
                    xg0Var.I = true;
                    int i12 = 0;
                    String d = gf.b.d(dk0Var.getText().toString(), false);
                    dk0Var.setText(d);
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
                                        Object obj2 = (vt) org.telegram.ui.Cells.c1.i(i11, list);
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
                                        str = d.substring(i13) + ug0Var.getText().toString();
                                        dk0Var.setText(substring);
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
                                dk0Var.setText(d);
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
                            str2 = d.substring(vtVar4.c.length()) + ug0Var.getText().toString();
                            d = vtVar4.c;
                            dk0Var.setText(d);
                        } else {
                            str2 = str7;
                        }
                        List list2 = (List) hashMap.get(d);
                        if (list2 == null) {
                            i10 = 0;
                            vtVar = null;
                        } else if (list2.size() > 1) {
                            String string2 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + d, null);
                            vt vtVar6 = (vt) org.telegram.ui.Cells.c1.i(1, list2);
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
                            xg0Var.H = true;
                            xg0Var.y = vtVar;
                            xg0Var.v(d, vtVar);
                            xg0Var.x = i10;
                        } else {
                            xg0Var.setCountryButtonText(null);
                            ug0Var.setHintText((String) null);
                            xg0Var.x = 2;
                        }
                        if (!z10) {
                            dk0Var.setSelection(dk0Var.getText().length());
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
                fk0 fk0Var = (fk0) this.b;
                HashMap hashMap2 = fk0Var.x;
                ArrayList arrayList2 = fk0Var.w;
                if (!fk0Var.E) {
                    fk0Var.E = true;
                    String d10 = gf.b.d(fk0Var.O.getText().toString(), false);
                    fk0Var.O.setText(d10);
                    String str8 = null;
                    if (d10.length() == 0) {
                        fk0Var.t(null);
                        fk0Var.Q.setHintText((String) null);
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
                                            Object obj7 = (vt) org.telegram.ui.Cells.c1.i(1, list3);
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
                                        str5 = d10.substring(i19) + fk0Var.Q.getText().toString();
                                        fk0Var.O.setText(str4);
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
                                str5 = str4.substring(1) + fk0Var.Q.getText().toString();
                                dk0 dk0Var2 = fk0Var.O;
                                str4 = str4.substring(0, 1);
                                dk0Var2.setText(str4);
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
                            str5 = str4.substring(vtVar8.c.length()) + fk0Var.Q.getText().toString();
                            dk0 dk0Var3 = fk0Var.O;
                            String str9 = vtVar8.c;
                            dk0Var3.setText(str9);
                            str4 = str9;
                        }
                        List list4 = (List) hashMap2.get(str4);
                        if (list4 == null) {
                            vtVar2 = null;
                        } else if (list4.size() > 1) {
                            String string4 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + str4, null);
                            vt vtVar10 = (vt) org.telegram.ui.Cells.c1.i(1, list4);
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
                            fk0Var.G = true;
                            fk0Var.u(str4, vtVar2);
                        } else {
                            fk0Var.t(null);
                            fk0Var.Q.setHintText((String) null);
                        }
                        if (!z11) {
                            dk0 dk0Var4 = fk0Var.O;
                            dk0Var4.setSelection(dk0Var4.getText().length());
                        }
                        if (str5 != null && str5.length() != 0) {
                            fk0Var.Q.requestFocus();
                            fk0Var.Q.setText(str5);
                            dk0 dk0Var5 = fk0Var.Q;
                            dk0Var5.setSelection(dk0Var5.length());
                        }
                    }
                    fk0Var.E = false;
                    fk0.q(fk0Var);
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
                a61 a61Var = (a61) this.b;
                org.telegram.ui.Cells.d6 d6Var = a61Var.h;
                String obj11 = (d6Var.getText() == null || AndroidUtilities.trim(d6Var.getText(), null).length() == 0) ? null : d6Var.getText().toString();
                a61Var.y.v(obj11, true, true);
                x61 x61Var = a61Var.n;
                if (x61Var != null) {
                    x61Var.G1(null);
                    a61Var.n.H1(TextUtils.isEmpty(obj11), true);
                }
                if (d6Var != null) {
                    d6Var.clearAnimation();
                    d6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.qr.h).start();
                }
                a61Var.c(false);
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
                    org.telegram.ui.Components.w80 w80Var = new org.telegram.ui.Components.w80(1, null);
                    w80Var.a(bf1Var.n);
                    org.telegram.ui.Components.dm0 dm0Var = bf1Var.v;
                    if (dm0Var != null) {
                        dm0Var.b(w80Var, true);
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
