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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        nt ntVar;
        String str3;
        Object obj;
        String str4;
        String str5;
        boolean z11;
        nt ntVar2;
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
                jo joVar = (jo) this.b;
                joVar.r.n(5L, joVar.v.getText().toString(), null);
                jh.z3 z3Var = joVar.e;
                if (z3Var != null) {
                    z3Var.invalidate();
                    break;
                }
                break;
            case 3:
                ((xo) this.b).V();
                break;
            case 4:
                cq cqVar = (cq) this.b;
                dq dqVar = cqVar.e;
                if (!cqVar.d) {
                    dqVar.O = editable.toString();
                    f2.o1 K = dqVar.b.K(dqVar.q0);
                    if (K != null) {
                        dq.f0(dqVar, K.a);
                        break;
                    }
                }
                break;
            case 5:
                break;
            case 6:
                o60 o60Var = (o60) this.b;
                if (o60Var.f.r.length() == 0) {
                    o60Var.P = false;
                    o60Var.O = false;
                    m60 m60Var = o60Var.v;
                    if (m60Var.n) {
                        m60Var.n = false;
                        m60Var.l();
                    }
                    o60Var.v.L(null);
                    o60Var.n.setFastScrollVisible(true);
                    o60Var.n.setVerticalScrollBarEnabled(false);
                    o60Var.q0(0);
                    break;
                } else {
                    m60 m60Var2 = o60Var.v;
                    boolean z12 = m60Var2.n;
                    if (!z12) {
                        o60Var.P = true;
                        o60Var.O = true;
                        if (!z12) {
                            m60Var2.n = true;
                            m60Var2.l();
                        }
                        o60Var.n.setFastScrollVisible(false);
                        o60Var.n.setVerticalScrollBarEnabled(true);
                    }
                    o60Var.v.L(o60Var.f.r.getText().toString());
                    o60Var.s.e(true, false);
                    break;
                }
            case 7:
            case 8:
            case 9:
                break;
            case 10:
                hg0 hg0Var = (hg0) this.b;
                HashMap hashMap = hg0Var.B;
                ArrayList arrayList = hg0Var.A;
                mj0 mj0Var = hg0Var.a;
                eg0 eg0Var = hg0Var.b;
                if (!hg0Var.E) {
                    int i11 = 1;
                    hg0Var.E = true;
                    int i12 = 0;
                    String d = oe.b.d(mj0Var.getText().toString(), false);
                    mj0Var.setText(d);
                    String str6 = null;
                    if (d.length() == 0) {
                        hg0Var.setCountryButtonText(null);
                        eg0Var.setHintText((String) null);
                        hg0Var.x = 1;
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
                                        Object obj2 = (nt) i0.a.j(i11, list);
                                        if (string != null) {
                                            int size = arrayList.size();
                                            int i14 = 0;
                                            while (true) {
                                                if (i14 < size) {
                                                    Object obj3 = arrayList.get(i14);
                                                    i14++;
                                                    nt ntVar3 = (nt) obj3;
                                                    if (Objects.equals(ntVar3.d, string)) {
                                                        obj2 = ntVar3;
                                                    }
                                                }
                                            }
                                        }
                                        obj = obj2;
                                    } else {
                                        obj = (nt) list.get(0);
                                    }
                                    if (obj != null) {
                                        str = d.substring(i13) + eg0Var.getText().toString();
                                        mj0Var.setText(substring);
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
                                mj0Var.setText(d);
                            }
                        } else {
                            str = null;
                            z10 = false;
                        }
                        int size2 = arrayList.size();
                        nt ntVar4 = null;
                        int i15 = 0;
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj4 = arrayList.get(i16);
                            i16++;
                            nt ntVar5 = (nt) obj4;
                            if (ntVar5.c.startsWith(d)) {
                                int i17 = i15 + 1;
                                str3 = str;
                                if (ntVar5.c.equals(d)) {
                                    if (ntVar4 == null || !ntVar4.c.equals(ntVar5.c)) {
                                        i15 = i17;
                                    }
                                    ntVar4 = ntVar5;
                                } else {
                                    i15 = i17;
                                }
                            } else {
                                str3 = str;
                            }
                            str = str3;
                        }
                        String str7 = str;
                        if (i15 == 1 && ntVar4 != null && str7 == null) {
                            str2 = d.substring(ntVar4.c.length()) + eg0Var.getText().toString();
                            d = ntVar4.c;
                            mj0Var.setText(d);
                        } else {
                            str2 = str7;
                        }
                        List list2 = (List) hashMap.get(d);
                        if (list2 == null) {
                            i10 = 0;
                            ntVar = null;
                        } else if (list2.size() > 1) {
                            String string2 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + d, null);
                            nt ntVar6 = (nt) i0.a.j(1, list2);
                            if (string2 != null) {
                                int size3 = arrayList.size();
                                int i18 = 0;
                                while (i18 < size3) {
                                    Object obj5 = arrayList.get(i18);
                                    i18++;
                                    ntVar = (nt) obj5;
                                    if (Objects.equals(ntVar.d, string2)) {
                                        i10 = 0;
                                    }
                                }
                            }
                            ntVar = ntVar6;
                            i10 = 0;
                        } else {
                            i10 = 0;
                            ntVar = (nt) list2.get(0);
                        }
                        if (ntVar != null) {
                            hg0Var.D = true;
                            hg0Var.y = ntVar;
                            hg0Var.u(d, ntVar);
                            hg0Var.x = i10;
                        } else {
                            hg0Var.setCountryButtonText(null);
                            eg0Var.setHintText((String) null);
                            hg0Var.x = 2;
                        }
                        if (!z10) {
                            mj0Var.setSelection(mj0Var.getText().length());
                        }
                        if (str2 != null) {
                            eg0Var.requestFocus();
                            eg0Var.setText(str2);
                            eg0Var.setSelection(eg0Var.length());
                        }
                    }
                    hg0Var.E = false;
                    break;
                }
                break;
            case 11:
                oj0 oj0Var = (oj0) this.b;
                HashMap hashMap2 = oj0Var.x;
                ArrayList arrayList2 = oj0Var.w;
                if (!oj0Var.A) {
                    oj0Var.A = true;
                    String d10 = oe.b.d(oj0Var.K.getText().toString(), false);
                    oj0Var.K.setText(d10);
                    String str8 = null;
                    if (d10.length() == 0) {
                        oj0Var.u(null);
                        oj0Var.M.setHintText((String) null);
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
                                            Object obj7 = (nt) i0.a.j(1, list3);
                                            if (string3 != null) {
                                                int size4 = arrayList2.size();
                                                int i20 = 0;
                                                while (true) {
                                                    if (i20 < size4) {
                                                        Object obj8 = arrayList2.get(i20);
                                                        i20++;
                                                        nt ntVar7 = (nt) obj8;
                                                        if (Objects.equals(ntVar7.d, string3)) {
                                                            obj7 = ntVar7;
                                                        }
                                                    }
                                                }
                                            }
                                            obj6 = obj7;
                                        } else {
                                            obj6 = (nt) list3.get(0);
                                        }
                                    }
                                    if (obj6 != null) {
                                        str5 = d10.substring(i19) + oj0Var.M.getText().toString();
                                        oj0Var.K.setText(str4);
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
                                str5 = str4.substring(1) + oj0Var.M.getText().toString();
                                mj0 mj0Var2 = oj0Var.K;
                                str4 = str4.substring(0, 1);
                                mj0Var2.setText(str4);
                            }
                        } else {
                            str4 = d10;
                            str5 = null;
                            z11 = false;
                        }
                        int size5 = arrayList2.size();
                        nt ntVar8 = null;
                        int i21 = 0;
                        int i22 = 0;
                        while (i22 < size5) {
                            Object obj9 = arrayList2.get(i22);
                            i22++;
                            nt ntVar9 = (nt) obj9;
                            if (ntVar9.c.startsWith(str4)) {
                                i21++;
                                if (ntVar9.c.equals(str4)) {
                                    ntVar8 = ntVar9;
                                }
                            }
                        }
                        if (i21 == 1 && ntVar8 != null && str5 == null) {
                            str5 = str4.substring(ntVar8.c.length()) + oj0Var.M.getText().toString();
                            mj0 mj0Var3 = oj0Var.K;
                            String str9 = ntVar8.c;
                            mj0Var3.setText(str9);
                            str4 = str9;
                        }
                        List list4 = (List) hashMap2.get(str4);
                        if (list4 == null) {
                            ntVar2 = null;
                        } else if (list4.size() > 1) {
                            String string4 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + str4, null);
                            nt ntVar10 = (nt) i0.a.j(1, list4);
                            if (string4 != null) {
                                int size6 = arrayList2.size();
                                int i23 = 0;
                                while (i23 < size6) {
                                    Object obj10 = arrayList2.get(i23);
                                    i23++;
                                    nt ntVar11 = (nt) obj10;
                                    if (Objects.equals(ntVar11.d, string4)) {
                                        ntVar2 = ntVar11;
                                    }
                                }
                            }
                            ntVar2 = ntVar10;
                        } else {
                            ntVar2 = (nt) list4.get(0);
                        }
                        if (ntVar2 != null) {
                            oj0Var.C = true;
                            oj0Var.v(str4, ntVar2);
                        } else {
                            oj0Var.u(null);
                            oj0Var.M.setHintText((String) null);
                        }
                        if (!z11) {
                            mj0 mj0Var4 = oj0Var.K;
                            mj0Var4.setSelection(mj0Var4.getText().length());
                        }
                        if (str5 != null && str5.length() != 0) {
                            oj0Var.M.requestFocus();
                            oj0Var.M.setText(str5);
                            mj0 mj0Var5 = oj0Var.M;
                            mj0Var5.setSelection(mj0Var5.length());
                        }
                    }
                    oj0Var.A = false;
                    oj0.r(oj0Var);
                    break;
                }
                break;
            case 12:
                xm0 xm0Var = (xm0) this.b;
                if (!xm0Var.V0 && xm0Var.P0 != 0 && xm0Var.U[0].length() == xm0Var.P0) {
                    xm0Var.H.callOnClick();
                    break;
                }
                break;
            case 13:
                do0 do0Var = (do0) this.b;
                if (do0Var.Y != 0 && editable.length() == do0Var.Y) {
                    do0Var.A0(false);
                    break;
                }
                break;
            case 14:
                zp0 zp0Var = ((aq0) this.b).o0;
                if (zp0Var != null) {
                    zp0Var.b(editable);
                    break;
                }
                break;
            case 15:
                r41 r41Var = (r41) this.b;
                gh.r rVar = r41Var.h;
                String obj11 = (rVar.getText() == null || AndroidUtilities.trim(rVar.getText(), null).length() == 0) ? null : rVar.getText().toString();
                r41Var.y.v(obj11, true, true);
                o51 o51Var = r41Var.n;
                if (o51Var != null) {
                    o51Var.F1(null);
                    r41Var.n.G1(TextUtils.isEmpty(obj11), true);
                }
                if (rVar != null) {
                    rVar.clearAnimation();
                    rVar.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.er.h).start();
                }
                r41Var.c(false);
                break;
            case 16:
                String trim = editable.toString().trim();
                sd1 sd1Var = (sd1) this.b;
                String str10 = sd1Var.n;
                if (trim.length() > 0) {
                    sd1Var.n = trim.substring(0, 1).toUpperCase();
                } else {
                    sd1Var.n = "";
                }
                if (!str10.equals(sd1Var.n)) {
                    org.telegram.ui.Components.y70 y70Var = new org.telegram.ui.Components.y70(1, null);
                    y70Var.a(sd1Var.n);
                    org.telegram.ui.Components.el0 el0Var = sd1Var.v;
                    if (el0Var != null) {
                        el0Var.b(y70Var, true);
                        break;
                    }
                }
                break;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                ff1 ff1Var = twoStepVerificationActivity.R;
                if (twoStepVerificationActivity.Q) {
                    AndroidUtilities.cancelRunOnUIThread(ff1Var);
                    ff1Var.run();
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
                sr srVar = (sr) obj;
                srVar.x = charSequence.length() != 0;
                srVar.v = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                srVar.B = ofFloat;
                ofFloat.addUpdateListener(new g3(srVar, 9));
                if (srVar.x) {
                    srVar.B.setDuration(220L);
                } else {
                    srVar.B.setInterpolator(new OvershootInterpolator(1.5f));
                    srVar.B.setDuration(350L);
                }
                srVar.B.start();
                srVar.hideActionMode();
                break;
            case 7:
                sd0 sd0Var = (sd0) obj;
                kd0 kd0Var = sd0Var.O;
                if (sd0Var.N) {
                    sd0Var.removeCallbacks(kd0Var);
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
                ye0 ye0Var = mf0Var.n0;
                if (mf0Var.m0) {
                    mf0Var.removeCallbacks(ye0Var);
                    ye0Var.run();
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.a) {
            case 1:
                id idVar = (id) this.b;
                idVar.d0(idVar.w.getText().toString());
                break;
            case 3:
                xo xoVar = (xo) this.b;
                if (!xoVar.i0) {
                    String obj = xoVar.a.getText().toString();
                    ka kaVar = xoVar.K;
                    if (kaVar != null) {
                        kaVar.b(obj);
                    }
                    xoVar.W(obj);
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
