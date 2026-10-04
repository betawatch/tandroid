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

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
        ut utVar;
        String str3;
        Object obj;
        String str4;
        String str5;
        boolean z11;
        ut utVar2;
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
                to toVar = (to) this.b;
                toVar.r.n(5L, toVar.v.getText().toString(), null);
                ai.y5 y5Var = toVar.e;
                if (y5Var != null) {
                    y5Var.invalidate();
                    break;
                }
                break;
            case 3:
                ((hp) this.b).T();
                break;
            case 4:
                lq lqVar = (lq) this.b;
                mq mqVar = lqVar.e;
                if (!lqVar.d) {
                    mqVar.S = editable.toString();
                    s4.c1 K = mqVar.b.K(mqVar.u0);
                    if (K != null) {
                        mq.f0(mqVar, K.a);
                        break;
                    }
                }
                break;
            case 5:
                break;
            case 6:
                d70 d70Var = (d70) this.b;
                if (d70Var.f.r.length() == 0) {
                    d70Var.T = false;
                    d70Var.S = false;
                    b70 b70Var = d70Var.v;
                    if (b70Var.n) {
                        b70Var.n = false;
                        b70Var.l();
                    }
                    d70Var.v.L(null);
                    d70Var.n.setFastScrollVisible(true);
                    d70Var.n.setVerticalScrollBarEnabled(false);
                    d70Var.q0(0);
                    break;
                } else {
                    b70 b70Var2 = d70Var.v;
                    boolean z12 = b70Var2.n;
                    if (!z12) {
                        d70Var.T = true;
                        d70Var.S = true;
                        if (!z12) {
                            b70Var2.n = true;
                            b70Var2.l();
                        }
                        d70Var.n.setFastScrollVisible(false);
                        d70Var.n.setVerticalScrollBarEnabled(true);
                    }
                    d70Var.v.L(d70Var.f.r.getText().toString());
                    d70Var.s.e(true, false);
                    break;
                }
            case 7:
            case 8:
            case 9:
                break;
            case 10:
                tg0 tg0Var = (tg0) this.b;
                HashMap hashMap = tg0Var.F;
                ArrayList arrayList = tg0Var.E;
                yj0 yj0Var = tg0Var.a;
                qg0 qg0Var = tg0Var.b;
                if (!tg0Var.I) {
                    int i11 = 1;
                    tg0Var.I = true;
                    int i12 = 0;
                    String d = gf.b.d(yj0Var.getText().toString(), false);
                    yj0Var.setText(d);
                    String str6 = null;
                    if (d.length() == 0) {
                        tg0Var.setCountryButtonText(null);
                        qg0Var.setHintText((String) null);
                        tg0Var.x = 1;
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
                                        Object obj2 = (ut) t8.b.h(i11, list);
                                        if (string != null) {
                                            int size = arrayList.size();
                                            int i14 = 0;
                                            while (true) {
                                                if (i14 < size) {
                                                    Object obj3 = arrayList.get(i14);
                                                    i14++;
                                                    ut utVar3 = (ut) obj3;
                                                    if (Objects.equals(utVar3.d, string)) {
                                                        obj2 = utVar3;
                                                    }
                                                }
                                            }
                                        }
                                        obj = obj2;
                                    } else {
                                        obj = (ut) list.get(0);
                                    }
                                    if (obj != null) {
                                        str = d.substring(i13) + qg0Var.getText().toString();
                                        yj0Var.setText(substring);
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
                                str = d.substring(1) + qg0Var.getText().toString();
                                d = d.substring(0, 1);
                                yj0Var.setText(d);
                            }
                        } else {
                            str = null;
                            z10 = false;
                        }
                        int size2 = arrayList.size();
                        ut utVar4 = null;
                        int i15 = 0;
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj4 = arrayList.get(i16);
                            i16++;
                            ut utVar5 = (ut) obj4;
                            if (utVar5.c.startsWith(d)) {
                                int i17 = i15 + 1;
                                str3 = str;
                                if (utVar5.c.equals(d)) {
                                    if (utVar4 == null || !utVar4.c.equals(utVar5.c)) {
                                        i15 = i17;
                                    }
                                    utVar4 = utVar5;
                                } else {
                                    i15 = i17;
                                }
                            } else {
                                str3 = str;
                            }
                            str = str3;
                        }
                        String str7 = str;
                        if (i15 == 1 && utVar4 != null && str7 == null) {
                            str2 = d.substring(utVar4.c.length()) + qg0Var.getText().toString();
                            d = utVar4.c;
                            yj0Var.setText(d);
                        } else {
                            str2 = str7;
                        }
                        List list2 = (List) hashMap.get(d);
                        if (list2 == null) {
                            i10 = 0;
                            utVar = null;
                        } else if (list2.size() > 1) {
                            String string2 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + d, null);
                            ut utVar6 = (ut) t8.b.h(1, list2);
                            if (string2 != null) {
                                int size3 = arrayList.size();
                                int i18 = 0;
                                while (i18 < size3) {
                                    Object obj5 = arrayList.get(i18);
                                    i18++;
                                    utVar = (ut) obj5;
                                    if (Objects.equals(utVar.d, string2)) {
                                        i10 = 0;
                                    }
                                }
                            }
                            utVar = utVar6;
                            i10 = 0;
                        } else {
                            i10 = 0;
                            utVar = (ut) list2.get(0);
                        }
                        if (utVar != null) {
                            tg0Var.H = true;
                            tg0Var.y = utVar;
                            tg0Var.v(d, utVar);
                            tg0Var.x = i10;
                        } else {
                            tg0Var.setCountryButtonText(null);
                            qg0Var.setHintText((String) null);
                            tg0Var.x = 2;
                        }
                        if (!z10) {
                            yj0Var.setSelection(yj0Var.getText().length());
                        }
                        if (str2 != null) {
                            qg0Var.requestFocus();
                            qg0Var.setText(str2);
                            qg0Var.setSelection(qg0Var.length());
                        }
                    }
                    tg0Var.I = false;
                    break;
                }
                break;
            case 11:
                ak0 ak0Var = (ak0) this.b;
                HashMap hashMap2 = ak0Var.x;
                ArrayList arrayList2 = ak0Var.w;
                if (!ak0Var.E) {
                    ak0Var.E = true;
                    String d10 = gf.b.d(ak0Var.O.getText().toString(), false);
                    ak0Var.O.setText(d10);
                    String str8 = null;
                    if (d10.length() == 0) {
                        ak0Var.t(null);
                        ak0Var.Q.setHintText((String) null);
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
                                            Object obj7 = (ut) t8.b.h(1, list3);
                                            if (string3 != null) {
                                                int size4 = arrayList2.size();
                                                int i20 = 0;
                                                while (true) {
                                                    if (i20 < size4) {
                                                        Object obj8 = arrayList2.get(i20);
                                                        i20++;
                                                        ut utVar7 = (ut) obj8;
                                                        if (Objects.equals(utVar7.d, string3)) {
                                                            obj7 = utVar7;
                                                        }
                                                    }
                                                }
                                            }
                                            obj6 = obj7;
                                        } else {
                                            obj6 = (ut) list3.get(0);
                                        }
                                    }
                                    if (obj6 != null) {
                                        str5 = d10.substring(i19) + ak0Var.Q.getText().toString();
                                        ak0Var.O.setText(str4);
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
                                str5 = str4.substring(1) + ak0Var.Q.getText().toString();
                                yj0 yj0Var2 = ak0Var.O;
                                str4 = str4.substring(0, 1);
                                yj0Var2.setText(str4);
                            }
                        } else {
                            str4 = d10;
                            str5 = null;
                            z11 = false;
                        }
                        int size5 = arrayList2.size();
                        ut utVar8 = null;
                        int i21 = 0;
                        int i22 = 0;
                        while (i22 < size5) {
                            Object obj9 = arrayList2.get(i22);
                            i22++;
                            ut utVar9 = (ut) obj9;
                            if (utVar9.c.startsWith(str4)) {
                                i21++;
                                if (utVar9.c.equals(str4)) {
                                    utVar8 = utVar9;
                                }
                            }
                        }
                        if (i21 == 1 && utVar8 != null && str5 == null) {
                            str5 = str4.substring(utVar8.c.length()) + ak0Var.Q.getText().toString();
                            yj0 yj0Var3 = ak0Var.O;
                            String str9 = utVar8.c;
                            yj0Var3.setText(str9);
                            str4 = str9;
                        }
                        List list4 = (List) hashMap2.get(str4);
                        if (list4 == null) {
                            utVar2 = null;
                        } else if (list4.size() > 1) {
                            String string4 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + str4, null);
                            ut utVar10 = (ut) t8.b.h(1, list4);
                            if (string4 != null) {
                                int size6 = arrayList2.size();
                                int i23 = 0;
                                while (i23 < size6) {
                                    Object obj10 = arrayList2.get(i23);
                                    i23++;
                                    ut utVar11 = (ut) obj10;
                                    if (Objects.equals(utVar11.d, string4)) {
                                        utVar2 = utVar11;
                                    }
                                }
                            }
                            utVar2 = utVar10;
                        } else {
                            utVar2 = (ut) list4.get(0);
                        }
                        if (utVar2 != null) {
                            ak0Var.G = true;
                            ak0Var.u(str4, utVar2);
                        } else {
                            ak0Var.t(null);
                            ak0Var.Q.setHintText((String) null);
                        }
                        if (!z11) {
                            yj0 yj0Var4 = ak0Var.O;
                            yj0Var4.setSelection(yj0Var4.getText().length());
                        }
                        if (str5 != null && str5.length() != 0) {
                            ak0Var.Q.requestFocus();
                            ak0Var.Q.setText(str5);
                            yj0 yj0Var5 = ak0Var.Q;
                            yj0Var5.setSelection(yj0Var5.length());
                        }
                    }
                    ak0Var.E = false;
                    ak0.q(ak0Var);
                    break;
                }
                break;
            case 12:
                kn0 kn0Var = (kn0) this.b;
                if (!kn0Var.Z0 && kn0Var.T0 != 0 && kn0Var.Y[0].length() == kn0Var.T0) {
                    kn0Var.L.callOnClick();
                    break;
                }
                break;
            case 13:
                so0 so0Var = (so0) this.b;
                if (so0Var.c0 != 0 && editable.length() == so0Var.c0) {
                    so0Var.A0(false);
                    break;
                }
                break;
            case 14:
                vq0 vq0Var = ((wq0) this.b).s0;
                if (vq0Var != null) {
                    vq0Var.b(editable);
                    break;
                }
                break;
            case 15:
                t51 t51Var = (t51) this.b;
                org.telegram.ui.Cells.c6 c6Var = t51Var.h;
                String obj11 = (c6Var.getText() == null || AndroidUtilities.trim(c6Var.getText(), null).length() == 0) ? null : c6Var.getText().toString();
                t51Var.y.v(obj11, true, true);
                q61 q61Var = t51Var.n;
                if (q61Var != null) {
                    q61Var.H1(null);
                    t51Var.n.I1(TextUtils.isEmpty(obj11), true);
                }
                if (c6Var != null) {
                    c6Var.clearAnimation();
                    c6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.tr.h).start();
                }
                t51Var.c(false);
                break;
            case 16:
                String trim = editable.toString().trim();
                ue1 ue1Var = (ue1) this.b;
                String str10 = ue1Var.n;
                if (trim.length() > 0) {
                    ue1Var.n = trim.substring(0, 1).toUpperCase();
                } else {
                    ue1Var.n = "";
                }
                if (!str10.equals(ue1Var.n)) {
                    org.telegram.ui.Components.z80 z80Var = new org.telegram.ui.Components.z80(1, null);
                    z80Var.a(ue1Var.n);
                    org.telegram.ui.Components.hm0 hm0Var = ue1Var.v;
                    if (hm0Var != null) {
                        hm0Var.b(z80Var, true);
                        break;
                    }
                }
                break;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                hg1 hg1Var = twoStepVerificationActivity.V;
                if (twoStepVerificationActivity.U) {
                    AndroidUtilities.cancelRunOnUIThread(hg1Var);
                    hg1Var.run();
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
                as asVar = (as) obj;
                asVar.x = charSequence.length() != 0;
                asVar.v = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                asVar.F = ofFloat;
                ofFloat.addUpdateListener(new c3(asVar, 8));
                if (asVar.x) {
                    asVar.F.setDuration(220L);
                } else {
                    asVar.F.setInterpolator(new OvershootInterpolator(1.5f));
                    asVar.F.setDuration(350L);
                }
                asVar.F.start();
                asVar.hideActionMode();
                break;
            case 7:
                ee0 ee0Var = (ee0) obj;
                xd0 xd0Var = ee0Var.S;
                if (ee0Var.R) {
                    ee0Var.removeCallbacks(xd0Var);
                    xd0Var.run();
                    break;
                }
                break;
            case 8:
                ye0 ye0Var = (ye0) obj;
                we0 we0Var = ye0Var.x;
                if (ye0Var.w) {
                    ye0Var.removeCallbacks(we0Var);
                    we0Var.run();
                    break;
                }
                break;
            case 9:
                xf0 xf0Var = (xf0) obj;
                kf0 kf0Var = xf0Var.r0;
                if (xf0Var.q0) {
                    xf0Var.removeCallbacks(kf0Var);
                    kf0Var.run();
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
                hp hpVar = (hp) this.b;
                if (!hpVar.m0) {
                    String obj = hpVar.a.getText().toString();
                    pa paVar = hpVar.O;
                    if (paVar != null) {
                        paVar.b(obj);
                    }
                    hpVar.U(obj);
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
