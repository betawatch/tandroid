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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class o0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o0(Object obj, int i10) {
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
        kt ktVar;
        boolean z11;
        String str3;
        Object obj;
        String str4;
        boolean z12;
        String str5;
        kt ktVar2;
        switch (this.a) {
            case 0:
                l4 l4Var = (l4) this.b;
                if (l4Var.h0.W && (lVar = l4Var.i0) != null) {
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
                ((yo) this.b).V();
                break;
            case 4:
                cq cqVar = (cq) this.b;
                dq dqVar = cqVar.e;
                if (!cqVar.d) {
                    dqVar.S = editable.toString();
                    s4.b1 K = dqVar.b.K(dqVar.u0);
                    if (K != null) {
                        dq.f0(dqVar, K.a);
                        break;
                    }
                }
                break;
            case 5:
                break;
            case 6:
                n60 n60Var = (n60) this.b;
                if (n60Var.f.r.length() == 0) {
                    n60Var.T = false;
                    n60Var.S = false;
                    l60 l60Var = n60Var.v;
                    if (l60Var.n) {
                        l60Var.n = false;
                        l60Var.l();
                    }
                    n60Var.v.L(null);
                    n60Var.n.setFastScrollVisible(true);
                    n60Var.n.setVerticalScrollBarEnabled(false);
                    n60Var.q0(0);
                    break;
                } else {
                    l60 l60Var2 = n60Var.v;
                    boolean z13 = l60Var2.n;
                    if (!z13) {
                        n60Var.T = true;
                        n60Var.S = true;
                        if (!z13) {
                            l60Var2.n = true;
                            l60Var2.l();
                        }
                        n60Var.n.setFastScrollVisible(false);
                        n60Var.n.setVerticalScrollBarEnabled(true);
                    }
                    n60Var.v.L(n60Var.f.r.getText().toString());
                    n60Var.s.e(true, false);
                    break;
                }
            case 7:
            case 8:
            case 9:
                break;
            case 10:
                dg0 dg0Var = (dg0) this.b;
                HashMap hashMap = dg0Var.F;
                ArrayList arrayList = dg0Var.E;
                lj0 lj0Var = dg0Var.a;
                ag0 ag0Var = dg0Var.b;
                if (!dg0Var.I) {
                    int i11 = 1;
                    dg0Var.I = true;
                    int i12 = 0;
                    String d = jf.b.d(lj0Var.getText().toString(), false);
                    lj0Var.setText(d);
                    String str6 = null;
                    if (d.length() == 0) {
                        dg0Var.setCountryButtonText(null);
                        ag0Var.setHintText((String) null);
                        dg0Var.x = 1;
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
                                        Object obj2 = (kt) r4.c.f(i11, list);
                                        if (string != null) {
                                            int size = arrayList.size();
                                            int i14 = i12;
                                            while (true) {
                                                if (i14 < size) {
                                                    Object obj3 = arrayList.get(i14);
                                                    i14++;
                                                    kt ktVar3 = (kt) obj3;
                                                    if (Objects.equals(ktVar3.d, string)) {
                                                        obj2 = ktVar3;
                                                    }
                                                }
                                            }
                                        }
                                        obj = obj2;
                                    } else {
                                        obj = (kt) list.get(i12);
                                    }
                                    if (obj != null) {
                                        str = d.substring(i13) + ag0Var.getText().toString();
                                        lj0Var.setText(substring);
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
                                str = d.substring(1) + ag0Var.getText().toString();
                                d = d.substring(0, 1);
                                lj0Var.setText(d);
                            }
                        } else {
                            str = null;
                            z10 = false;
                        }
                        int size2 = arrayList.size();
                        kt ktVar4 = null;
                        int i15 = 0;
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj4 = arrayList.get(i16);
                            i16++;
                            kt ktVar5 = (kt) obj4;
                            if (ktVar5.c.startsWith(d)) {
                                int i17 = i15 + 1;
                                str3 = str;
                                if (ktVar5.c.equals(d)) {
                                    if (ktVar4 == null || !ktVar4.c.equals(ktVar5.c)) {
                                        i15 = i17;
                                    }
                                    ktVar4 = ktVar5;
                                } else {
                                    i15 = i17;
                                }
                            } else {
                                str3 = str;
                            }
                            str = str3;
                        }
                        String str7 = str;
                        if (i15 == 1 && ktVar4 != null && str7 == null) {
                            str2 = d.substring(ktVar4.c.length()) + ag0Var.getText().toString();
                            d = ktVar4.c;
                            lj0Var.setText(d);
                        } else {
                            str2 = str7;
                        }
                        List list2 = (List) hashMap.get(d);
                        if (list2 == null) {
                            i10 = 0;
                            ktVar = null;
                        } else if (list2.size() > 1) {
                            String string2 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + d, null);
                            kt ktVar6 = (kt) r4.c.f(1, list2);
                            if (string2 != null) {
                                int size3 = arrayList.size();
                                int i18 = 0;
                                while (i18 < size3) {
                                    Object obj5 = arrayList.get(i18);
                                    i18++;
                                    ktVar = (kt) obj5;
                                    if (Objects.equals(ktVar.d, string2)) {
                                        i10 = 0;
                                    }
                                }
                            }
                            ktVar = ktVar6;
                            i10 = 0;
                        } else {
                            i10 = 0;
                            ktVar = (kt) list2.get(0);
                        }
                        if (ktVar != null) {
                            dg0Var.H = true;
                            dg0Var.y = ktVar;
                            dg0Var.t(d, ktVar);
                            dg0Var.x = i10;
                        } else {
                            dg0Var.setCountryButtonText(null);
                            ag0Var.setHintText((String) null);
                            dg0Var.x = 2;
                        }
                        if (!z10) {
                            lj0Var.setSelection(lj0Var.getText().length());
                        }
                        if (str2 != null) {
                            ag0Var.requestFocus();
                            ag0Var.setText(str2);
                            ag0Var.setSelection(ag0Var.length());
                        }
                        z11 = false;
                    }
                    dg0Var.I = z11;
                    break;
                }
                break;
            case 11:
                oj0 oj0Var = (oj0) this.b;
                HashMap hashMap2 = oj0Var.x;
                ArrayList arrayList2 = oj0Var.w;
                if (!oj0Var.E) {
                    oj0Var.E = true;
                    String d10 = jf.b.d(oj0Var.O.getText().toString(), false);
                    oj0Var.O.setText(d10);
                    String str8 = null;
                    if (d10.length() == 0) {
                        oj0Var.v(null);
                        oj0Var.Q.setHintText((String) null);
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
                                            Object obj7 = (kt) r4.c.f(1, list3);
                                            if (string3 != null) {
                                                int size4 = arrayList2.size();
                                                int i20 = 0;
                                                while (true) {
                                                    if (i20 < size4) {
                                                        Object obj8 = arrayList2.get(i20);
                                                        i20++;
                                                        kt ktVar7 = (kt) obj8;
                                                        if (Objects.equals(ktVar7.d, string3)) {
                                                            obj7 = ktVar7;
                                                        }
                                                    }
                                                }
                                            }
                                            obj6 = obj7;
                                        } else {
                                            obj6 = (kt) list3.get(0);
                                        }
                                    }
                                    if (obj6 != null) {
                                        str5 = d10.substring(i19) + oj0Var.Q.getText().toString();
                                        oj0Var.O.setText(str4);
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
                                str5 = str4.substring(1) + oj0Var.Q.getText().toString();
                                lj0 lj0Var2 = oj0Var.O;
                                str4 = str4.substring(0, 1);
                                lj0Var2.setText(str4);
                            }
                        } else {
                            str4 = d10;
                            z12 = false;
                            str5 = null;
                        }
                        int size5 = arrayList2.size();
                        int i21 = 0;
                        int i22 = 0;
                        kt ktVar8 = null;
                        while (i22 < size5) {
                            Object obj9 = arrayList2.get(i22);
                            i22++;
                            kt ktVar9 = (kt) obj9;
                            if (ktVar9.c.startsWith(str4)) {
                                i21++;
                                if (ktVar9.c.equals(str4)) {
                                    ktVar8 = ktVar9;
                                }
                            }
                        }
                        if (i21 == 1 && ktVar8 != null && str5 == null) {
                            str5 = str4.substring(ktVar8.c.length()) + oj0Var.Q.getText().toString();
                            lj0 lj0Var3 = oj0Var.O;
                            String str9 = ktVar8.c;
                            lj0Var3.setText(str9);
                            str4 = str9;
                        }
                        List list4 = (List) hashMap2.get(str4);
                        if (list4 == null) {
                            ktVar2 = null;
                        } else if (list4.size() > 1) {
                            String string4 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + str4, null);
                            kt ktVar10 = (kt) r4.c.f(1, list4);
                            if (string4 != null) {
                                int size6 = arrayList2.size();
                                int i23 = 0;
                                while (i23 < size6) {
                                    Object obj10 = arrayList2.get(i23);
                                    i23++;
                                    kt ktVar11 = (kt) obj10;
                                    if (Objects.equals(ktVar11.d, string4)) {
                                        ktVar2 = ktVar11;
                                    }
                                }
                            }
                            ktVar2 = ktVar10;
                        } else {
                            ktVar2 = (kt) list4.get(0);
                        }
                        if (ktVar2 != null) {
                            oj0Var.G = true;
                            oj0Var.w(str4, ktVar2);
                        } else {
                            oj0Var.v(null);
                            oj0Var.Q.setHintText((String) null);
                        }
                        if (!z12) {
                            lj0 lj0Var4 = oj0Var.O;
                            lj0Var4.setSelection(lj0Var4.getText().length());
                        }
                        if (str5 != null && str5.length() != 0) {
                            oj0Var.Q.requestFocus();
                            oj0Var.Q.setText(str5);
                            lj0 lj0Var5 = oj0Var.Q;
                            lj0Var5.setSelection(lj0Var5.length());
                        }
                    }
                    oj0Var.E = false;
                    oj0.r(oj0Var);
                    break;
                }
                break;
            case 12:
                xm0 xm0Var = (xm0) this.b;
                if (!xm0Var.Z0 && xm0Var.T0 != 0 && xm0Var.Y[0].length() == xm0Var.T0) {
                    xm0Var.L.callOnClick();
                    break;
                }
                break;
            case 13:
                go0 go0Var = (go0) this.b;
                if (go0Var.c0 != 0 && editable.length() == go0Var.c0) {
                    go0Var.A0(false);
                    break;
                }
                break;
            case 14:
                kq0 kq0Var = ((lq0) this.b).s0;
                if (kq0Var != null) {
                    kq0Var.b(editable);
                    break;
                }
                break;
            case 15:
                q41 q41Var = (q41) this.b;
                org.telegram.ui.Cells.b6 b6Var = q41Var.h;
                String obj11 = (b6Var.getText() == null || AndroidUtilities.trim(b6Var.getText(), null).length() == 0) ? null : b6Var.getText().toString();
                q41Var.y.v(obj11, true, true);
                n51 n51Var = q41Var.n;
                if (n51Var != null) {
                    n51Var.G1(null);
                    q41Var.n.H1(TextUtils.isEmpty(obj11), true);
                }
                if (b6Var != null) {
                    b6Var.clearAnimation();
                    b6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.bs.h).start();
                }
                q41Var.c(false);
                break;
            case 16:
                String trim = editable.toString().trim();
                pd1 pd1Var = (pd1) this.b;
                String str10 = pd1Var.n;
                if (trim.length() > 0) {
                    pd1Var.n = trim.substring(0, 1).toUpperCase();
                } else {
                    pd1Var.n = "";
                }
                if (!str10.equals(pd1Var.n)) {
                    org.telegram.ui.Components.f90 f90Var = new org.telegram.ui.Components.f90(1, null);
                    f90Var.a(pd1Var.n);
                    org.telegram.ui.Components.nm0 nm0Var = pd1Var.v;
                    if (nm0Var != null) {
                        nm0Var.b(f90Var, true);
                        break;
                    }
                }
                break;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                cf1 cf1Var = twoStepVerificationActivity.V;
                if (twoStepVerificationActivity.U) {
                    AndroidUtilities.cancelRunOnUIThread(cf1Var);
                    cf1Var.run();
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
                ofFloat.addUpdateListener(new e3(qrVar, 9));
                if (qrVar.x) {
                    qrVar.F.setDuration(220L);
                } else {
                    org.telegram.messenger.lk.l(1.5f, qrVar.F);
                    qrVar.F.setDuration(350L);
                }
                qrVar.F.start();
                qrVar.hideActionMode();
                break;
            case 7:
                od0 od0Var = (od0) obj;
                gd0 gd0Var = od0Var.S;
                if (od0Var.R) {
                    od0Var.removeCallbacks(gd0Var);
                    gd0Var.run();
                    break;
                }
                break;
            case 8:
                ie0 ie0Var = (ie0) obj;
                ge0 ge0Var = ie0Var.x;
                if (ie0Var.w) {
                    ie0Var.removeCallbacks(ge0Var);
                    ge0Var.run();
                    break;
                }
                break;
            case 9:
                if0 if0Var = (if0) obj;
                ue0 ue0Var = if0Var.r0;
                if (if0Var.q0) {
                    if0Var.removeCallbacks(ue0Var);
                    ue0Var.run();
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.a) {
            case 1:
                od odVar = (od) this.b;
                odVar.d0(odVar.w.getText().toString());
                break;
            case 3:
                yo yoVar = (yo) this.b;
                if (!yoVar.m0) {
                    String obj = yoVar.a.getText().toString();
                    ra raVar = yoVar.O;
                    if (raVar != null) {
                        raVar.b(obj);
                    }
                    yoVar.W(obj);
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
