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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class p0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p0(Object obj, int i10) {
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
        String str3;
        Object obj;
        String str4;
        String str5;
        boolean z11;
        lt ltVar2;
        switch (this.a) {
            case 0:
                m4 m4Var = (m4) this.b;
                if (m4Var.d0.S && (lVar = m4Var.e0) != null) {
                    lVar.setInput(editable == null ? null : editable.toString());
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                ko koVar = (ko) this.b;
                koVar.r.n(5L, koVar.v.getText().toString(), null);
                lh.y3 y3Var = koVar.e;
                if (y3Var != null) {
                    y3Var.invalidate();
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
                    dqVar.O = editable.toString();
                    f2.n1 K = dqVar.b.K(dqVar.q0);
                    if (K != null) {
                        dq.f0(dqVar, K.a);
                        break;
                    }
                }
                break;
            case 5:
                break;
            case 6:
                m60 m60Var = (m60) this.b;
                if (m60Var.f.r.length() == 0) {
                    m60Var.P = false;
                    m60Var.O = false;
                    k60 k60Var = m60Var.v;
                    if (k60Var.n) {
                        k60Var.n = false;
                        k60Var.l();
                    }
                    m60Var.v.L(null);
                    m60Var.n.setFastScrollVisible(true);
                    m60Var.n.setVerticalScrollBarEnabled(false);
                    m60Var.q0(0);
                    break;
                } else {
                    k60 k60Var2 = m60Var.v;
                    boolean z12 = k60Var2.n;
                    if (!z12) {
                        m60Var.P = true;
                        m60Var.O = true;
                        if (!z12) {
                            k60Var2.n = true;
                            k60Var2.l();
                        }
                        m60Var.n.setFastScrollVisible(false);
                        m60Var.n.setVerticalScrollBarEnabled(true);
                    }
                    m60Var.v.L(m60Var.f.r.getText().toString());
                    m60Var.s.e(true, false);
                    break;
                }
            case 7:
            case 8:
            case 9:
                break;
            case 10:
                eg0 eg0Var = (eg0) this.b;
                HashMap hashMap = eg0Var.B;
                ArrayList arrayList = eg0Var.A;
                ij0 ij0Var = eg0Var.a;
                bg0 bg0Var = eg0Var.b;
                if (!eg0Var.E) {
                    int i11 = 1;
                    eg0Var.E = true;
                    int i12 = 0;
                    String d = qe.b.d(ij0Var.getText().toString(), false);
                    ij0Var.setText(d);
                    String str6 = null;
                    if (d.length() == 0) {
                        eg0Var.setCountryButtonText(null);
                        bg0Var.setHintText((String) null);
                        eg0Var.x = 1;
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
                                        Object obj2 = (lt) j7.l1.j(i11, list);
                                        if (string != null) {
                                            int size = arrayList.size();
                                            int i14 = 0;
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
                                        obj = (lt) list.get(0);
                                    }
                                    if (obj != null) {
                                        str = d.substring(i13) + bg0Var.getText().toString();
                                        ij0Var.setText(substring);
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
                                str = d.substring(1) + bg0Var.getText().toString();
                                d = d.substring(0, 1);
                                ij0Var.setText(d);
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
                            str2 = d.substring(ltVar4.c.length()) + bg0Var.getText().toString();
                            d = ltVar4.c;
                            ij0Var.setText(d);
                        } else {
                            str2 = str7;
                        }
                        List list2 = (List) hashMap.get(d);
                        if (list2 == null) {
                            i10 = 0;
                            ltVar = null;
                        } else if (list2.size() > 1) {
                            String string2 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + d, null);
                            lt ltVar6 = (lt) j7.l1.j(1, list2);
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
                            eg0Var.D = true;
                            eg0Var.y = ltVar;
                            eg0Var.v(d, ltVar);
                            eg0Var.x = i10;
                        } else {
                            eg0Var.setCountryButtonText(null);
                            bg0Var.setHintText((String) null);
                            eg0Var.x = 2;
                        }
                        if (!z10) {
                            ij0Var.setSelection(ij0Var.getText().length());
                        }
                        if (str2 != null) {
                            bg0Var.requestFocus();
                            bg0Var.setText(str2);
                            bg0Var.setSelection(bg0Var.length());
                        }
                    }
                    eg0Var.E = false;
                    break;
                }
                break;
            case 11:
                kj0 kj0Var = (kj0) this.b;
                HashMap hashMap2 = kj0Var.x;
                ArrayList arrayList2 = kj0Var.w;
                if (!kj0Var.A) {
                    kj0Var.A = true;
                    String d10 = qe.b.d(kj0Var.K.getText().toString(), false);
                    kj0Var.K.setText(d10);
                    String str8 = null;
                    if (d10.length() == 0) {
                        kj0Var.t(null);
                        kj0Var.M.setHintText((String) null);
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
                                            Object obj7 = (lt) j7.l1.j(1, list3);
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
                                        str5 = d10.substring(i19) + kj0Var.M.getText().toString();
                                        kj0Var.K.setText(str4);
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
                                str5 = str4.substring(1) + kj0Var.M.getText().toString();
                                ij0 ij0Var2 = kj0Var.K;
                                str4 = str4.substring(0, 1);
                                ij0Var2.setText(str4);
                            }
                        } else {
                            str4 = d10;
                            str5 = null;
                            z11 = false;
                        }
                        int size5 = arrayList2.size();
                        lt ltVar8 = null;
                        int i21 = 0;
                        int i22 = 0;
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
                            str5 = str4.substring(ltVar8.c.length()) + kj0Var.M.getText().toString();
                            ij0 ij0Var3 = kj0Var.K;
                            String str9 = ltVar8.c;
                            ij0Var3.setText(str9);
                            str4 = str9;
                        }
                        List list4 = (List) hashMap2.get(str4);
                        if (list4 == null) {
                            ltVar2 = null;
                        } else if (list4.size() > 1) {
                            String string4 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + str4, null);
                            lt ltVar10 = (lt) j7.l1.j(1, list4);
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
                            kj0Var.C = true;
                            kj0Var.u(str4, ltVar2);
                        } else {
                            kj0Var.t(null);
                            kj0Var.M.setHintText((String) null);
                        }
                        if (!z11) {
                            ij0 ij0Var4 = kj0Var.K;
                            ij0Var4.setSelection(ij0Var4.getText().length());
                        }
                        if (str5 != null && str5.length() != 0) {
                            kj0Var.M.requestFocus();
                            kj0Var.M.setText(str5);
                            ij0 ij0Var5 = kj0Var.M;
                            ij0Var5.setSelection(ij0Var5.length());
                        }
                    }
                    kj0Var.A = false;
                    kj0.q(kj0Var);
                    break;
                }
                break;
            case 12:
                vm0 vm0Var = (vm0) this.b;
                if (!vm0Var.V0 && vm0Var.P0 != 0 && vm0Var.U[0].length() == vm0Var.P0) {
                    vm0Var.H.callOnClick();
                    break;
                }
                break;
            case 13:
                bo0 bo0Var = (bo0) this.b;
                if (bo0Var.Y != 0 && editable.length() == bo0Var.Y) {
                    bo0Var.A0(false);
                    break;
                }
                break;
            case 14:
                yp0 yp0Var = ((zp0) this.b).o0;
                if (yp0Var != null) {
                    yp0Var.b(editable);
                    break;
                }
                break;
            case 15:
                u41 u41Var = (u41) this.b;
                bh.b bVar = u41Var.h;
                String obj11 = (bVar.getText() == null || AndroidUtilities.trim(bVar.getText(), null).length() == 0) ? null : bVar.getText().toString();
                u41Var.y.v(obj11, true, true);
                r51 r51Var = u41Var.n;
                if (r51Var != null) {
                    r51Var.F1(null);
                    u41Var.n.G1(TextUtils.isEmpty(obj11), true);
                }
                if (bVar != null) {
                    bVar.clearAnimation();
                    bVar.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.jr.h).start();
                }
                u41Var.c(false);
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
                    org.telegram.ui.Components.h80 h80Var = new org.telegram.ui.Components.h80(1, null);
                    h80Var.a(td1Var.n);
                    org.telegram.ui.Components.ol0 ol0Var = td1Var.v;
                    if (ol0Var != null) {
                        ol0Var.b(h80Var, true);
                        break;
                    }
                }
                break;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                if1 if1Var = twoStepVerificationActivity.R;
                if (twoStepVerificationActivity.Q) {
                    AndroidUtilities.cancelRunOnUIThread(if1Var);
                    if1Var.run();
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
                qrVar.B = ofFloat;
                ofFloat.addUpdateListener(new g3(qrVar, 9));
                if (qrVar.x) {
                    qrVar.B.setDuration(220L);
                } else {
                    qrVar.B.setInterpolator(new OvershootInterpolator(1.5f));
                    qrVar.B.setDuration(350L);
                }
                qrVar.B.start();
                qrVar.hideActionMode();
                break;
            case 7:
                pd0 pd0Var = (pd0) obj;
                id0 id0Var = pd0Var.O;
                if (pd0Var.N) {
                    pd0Var.removeCallbacks(id0Var);
                    id0Var.run();
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
                ue0 ue0Var = if0Var.n0;
                if (if0Var.m0) {
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
                hd hdVar = (hd) this.b;
                hdVar.d0(hdVar.w.getText().toString());
                break;
            case 3:
                yo yoVar = (yo) this.b;
                if (!yoVar.i0) {
                    String obj = yoVar.a.getText().toString();
                    ia iaVar = yoVar.K;
                    if (iaVar != null) {
                        iaVar.b(obj);
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
