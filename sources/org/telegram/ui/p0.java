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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        org.telegram.ui.web.k kVar;
        String str;
        boolean z4;
        String str2;
        int i10;
        ut utVar;
        String str3;
        Object obj;
        String str4;
        String str5;
        boolean z10;
        ut utVar2;
        switch (this.a) {
            case 0:
                n4 n4Var = (n4) this.b;
                if (n4Var.e0.T && (kVar = n4Var.f0) != null) {
                    kVar.setInput(editable == null ? null : editable.toString());
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                ro roVar = (ro) this.b;
                roVar.r.n(5L, roVar.v.getText().toString(), null);
                nh.y3 y3Var = roVar.e;
                if (y3Var != null) {
                    y3Var.invalidate();
                    break;
                }
                break;
            case 3:
                ((fp) this.b).V();
                break;
            case 4:
                kq kqVar = (kq) this.b;
                lq lqVar = kqVar.e;
                if (!kqVar.d) {
                    lqVar.P = editable.toString();
                    f2.l1 K = lqVar.b.K(lqVar.r0);
                    if (K != null) {
                        lq.f0(lqVar, K.a);
                        break;
                    }
                }
                break;
            case 5:
                break;
            case 6:
                a70 a70Var = (a70) this.b;
                if (a70Var.f.r.length() == 0) {
                    a70Var.Q = false;
                    a70Var.P = false;
                    y60 y60Var = a70Var.v;
                    if (y60Var.n) {
                        y60Var.n = false;
                        y60Var.l();
                    }
                    a70Var.v.L(null);
                    a70Var.n.setFastScrollVisible(true);
                    a70Var.n.setVerticalScrollBarEnabled(false);
                    a70Var.q0(0);
                    break;
                } else {
                    y60 y60Var2 = a70Var.v;
                    boolean z11 = y60Var2.n;
                    if (!z11) {
                        a70Var.Q = true;
                        a70Var.P = true;
                        if (!z11) {
                            y60Var2.n = true;
                            y60Var2.l();
                        }
                        a70Var.n.setFastScrollVisible(false);
                        a70Var.n.setVerticalScrollBarEnabled(true);
                    }
                    a70Var.v.L(a70Var.f.r.getText().toString());
                    a70Var.s.e(true, false);
                    break;
                }
            case 7:
            case 8:
            case 9:
                break;
            case 10:
                og0 og0Var = (og0) this.b;
                HashMap hashMap = og0Var.C;
                ArrayList arrayList = og0Var.B;
                sj0 sj0Var = og0Var.a;
                lg0 lg0Var = og0Var.b;
                if (!og0Var.F) {
                    int i11 = 1;
                    og0Var.F = true;
                    int i12 = 0;
                    String d = se.b.d(sj0Var.getText().toString(), false);
                    sj0Var.setText(d);
                    String str6 = null;
                    if (d.length() == 0) {
                        og0Var.setCountryButtonText(null);
                        lg0Var.setHintText((String) null);
                        og0Var.x = 1;
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
                                        Object obj2 = (ut) ai.j(i11, list);
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
                                        str = d.substring(i13) + lg0Var.getText().toString();
                                        sj0Var.setText(substring);
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
                                str = d.substring(1) + lg0Var.getText().toString();
                                d = d.substring(0, 1);
                                sj0Var.setText(d);
                            }
                        } else {
                            str = null;
                            z4 = false;
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
                            str2 = d.substring(utVar4.c.length()) + lg0Var.getText().toString();
                            d = utVar4.c;
                            sj0Var.setText(d);
                        } else {
                            str2 = str7;
                        }
                        List list2 = (List) hashMap.get(d);
                        if (list2 == null) {
                            i10 = 0;
                            utVar = null;
                        } else if (list2.size() > 1) {
                            String string2 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + d, null);
                            ut utVar6 = (ut) ai.j(1, list2);
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
                            og0Var.E = true;
                            og0Var.y = utVar;
                            og0Var.v(d, utVar);
                            og0Var.x = i10;
                        } else {
                            og0Var.setCountryButtonText(null);
                            lg0Var.setHintText((String) null);
                            og0Var.x = 2;
                        }
                        if (!z4) {
                            sj0Var.setSelection(sj0Var.getText().length());
                        }
                        if (str2 != null) {
                            lg0Var.requestFocus();
                            lg0Var.setText(str2);
                            lg0Var.setSelection(lg0Var.length());
                        }
                    }
                    og0Var.F = false;
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
                                            Object obj7 = (ut) ai.j(1, list3);
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
                                sj0 sj0Var2 = uj0Var.L;
                                str4 = str4.substring(0, 1);
                                sj0Var2.setText(str4);
                            }
                        } else {
                            str4 = d10;
                            str5 = null;
                            z10 = false;
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
                            str5 = str4.substring(utVar8.c.length()) + uj0Var.N.getText().toString();
                            sj0 sj0Var3 = uj0Var.L;
                            String str9 = utVar8.c;
                            sj0Var3.setText(str9);
                            str4 = str9;
                        }
                        List list4 = (List) hashMap2.get(str4);
                        if (list4 == null) {
                            utVar2 = null;
                        } else if (list4.size() > 1) {
                            String string4 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + str4, null);
                            ut utVar10 = (ut) ai.j(1, list4);
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
                            uj0Var.D = true;
                            uj0Var.u(str4, utVar2);
                        } else {
                            uj0Var.t(null);
                            uj0Var.N.setHintText((String) null);
                        }
                        if (!z10) {
                            sj0 sj0Var4 = uj0Var.L;
                            sj0Var4.setSelection(sj0Var4.getText().length());
                        }
                        if (str5 != null && str5.length() != 0) {
                            uj0Var.N.requestFocus();
                            uj0Var.N.setText(str5);
                            sj0 sj0Var5 = uj0Var.N;
                            sj0Var5.setSelection(sj0Var5.length());
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
                dh.b bVar = n51Var.h;
                String obj11 = (bVar.getText() == null || AndroidUtilities.trim(bVar.getText(), null).length() == 0) ? null : bVar.getText().toString();
                n51Var.y.v(obj11, true, true);
                k61 k61Var = n51Var.n;
                if (k61Var != null) {
                    k61Var.E1(null);
                    n51Var.n.F1(TextUtils.isEmpty(obj11), true);
                }
                if (bVar != null) {
                    bVar.clearAnimation();
                    bVar.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.mr.h).start();
                }
                n51Var.c(false);
                break;
            case 16:
                String trim = editable.toString().trim();
                ne1 ne1Var = (ne1) this.b;
                String str10 = ne1Var.n;
                if (trim.length() > 0) {
                    ne1Var.n = trim.substring(0, 1).toUpperCase();
                } else {
                    ne1Var.n = "";
                }
                if (!str10.equals(ne1Var.n)) {
                    org.telegram.ui.Components.n80 n80Var = new org.telegram.ui.Components.n80(1, null);
                    n80Var.a(ne1Var.n);
                    org.telegram.ui.Components.xl0 xl0Var = ne1Var.v;
                    if (xl0Var != null) {
                        xl0Var.b(n80Var, true);
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
                yr yrVar = (yr) obj;
                yrVar.x = charSequence.length() != 0;
                yrVar.v = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                yrVar.C = ofFloat;
                ofFloat.addUpdateListener(new g3(yrVar, 9));
                if (yrVar.x) {
                    yrVar.C.setDuration(220L);
                } else {
                    yrVar.C.setInterpolator(new OvershootInterpolator(1.5f));
                    yrVar.C.setDuration(350L);
                }
                yrVar.C.start();
                yrVar.hideActionMode();
                break;
            case 7:
                ae0 ae0Var = (ae0) obj;
                td0 td0Var = ae0Var.P;
                if (ae0Var.O) {
                    ae0Var.removeCallbacks(td0Var);
                    td0Var.run();
                    break;
                }
                break;
            case 8:
                ue0 ue0Var = (ue0) obj;
                se0 se0Var = ue0Var.x;
                if (ue0Var.w) {
                    ue0Var.removeCallbacks(se0Var);
                    se0Var.run();
                    break;
                }
                break;
            case 9:
                tf0 tf0Var = (tf0) obj;
                gf0 gf0Var = tf0Var.o0;
                if (tf0Var.n0) {
                    tf0Var.removeCallbacks(gf0Var);
                    gf0Var.run();
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.a) {
            case 1:
                pd pdVar = (pd) this.b;
                pdVar.d0(pdVar.w.getText().toString());
                break;
            case 3:
                fp fpVar = (fp) this.b;
                if (!fpVar.j0) {
                    String obj = fpVar.a.getText().toString();
                    oa oaVar = fpVar.L;
                    if (oaVar != null) {
                        oaVar.b(obj);
                    }
                    fpVar.W(obj);
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
