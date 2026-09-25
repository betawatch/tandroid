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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
        qt qtVar;
        String str3;
        Object obj;
        String str4;
        String str5;
        boolean z11;
        qt qtVar2;
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
                ro roVar = (ro) this.b;
                roVar.r.n(5L, roVar.v.getText().toString(), null);
                ai.y5 y5Var = roVar.e;
                if (y5Var != null) {
                    y5Var.invalidate();
                    break;
                }
                break;
            case 3:
                ((fp) this.b).V();
                break;
            case 4:
                jq jqVar = (jq) this.b;
                kq kqVar = jqVar.e;
                if (!jqVar.d) {
                    kqVar.S = editable.toString();
                    s4.c1 K = kqVar.b.K(kqVar.u0);
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
                    z60Var.T = false;
                    z60Var.S = false;
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
                    boolean z12 = x60Var2.n;
                    if (!z12) {
                        z60Var.T = true;
                        z60Var.S = true;
                        if (!z12) {
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
                pg0 pg0Var = (pg0) this.b;
                HashMap hashMap = pg0Var.F;
                ArrayList arrayList = pg0Var.E;
                uj0 uj0Var = pg0Var.a;
                mg0 mg0Var = pg0Var.b;
                if (!pg0Var.I) {
                    int i11 = 1;
                    pg0Var.I = true;
                    int i12 = 0;
                    String d = gf.b.d(uj0Var.getText().toString(), false);
                    uj0Var.setText(d);
                    String str6 = null;
                    if (d.length() == 0) {
                        pg0Var.setCountryButtonText(null);
                        mg0Var.setHintText((String) null);
                        pg0Var.x = 1;
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
                                        Object obj2 = (qt) org.telegram.ui.Cells.c1.i(i11, list);
                                        if (string != null) {
                                            int size = arrayList.size();
                                            int i14 = 0;
                                            while (true) {
                                                if (i14 < size) {
                                                    Object obj3 = arrayList.get(i14);
                                                    i14++;
                                                    qt qtVar3 = (qt) obj3;
                                                    if (Objects.equals(qtVar3.d, string)) {
                                                        obj2 = qtVar3;
                                                    }
                                                }
                                            }
                                        }
                                        obj = obj2;
                                    } else {
                                        obj = (qt) list.get(0);
                                    }
                                    if (obj != null) {
                                        str = d.substring(i13) + mg0Var.getText().toString();
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
                                str = d.substring(1) + mg0Var.getText().toString();
                                d = d.substring(0, 1);
                                uj0Var.setText(d);
                            }
                        } else {
                            str = null;
                            z10 = false;
                        }
                        int size2 = arrayList.size();
                        qt qtVar4 = null;
                        int i15 = 0;
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj4 = arrayList.get(i16);
                            i16++;
                            qt qtVar5 = (qt) obj4;
                            if (qtVar5.c.startsWith(d)) {
                                int i17 = i15 + 1;
                                str3 = str;
                                if (qtVar5.c.equals(d)) {
                                    if (qtVar4 == null || !qtVar4.c.equals(qtVar5.c)) {
                                        i15 = i17;
                                    }
                                    qtVar4 = qtVar5;
                                } else {
                                    i15 = i17;
                                }
                            } else {
                                str3 = str;
                            }
                            str = str3;
                        }
                        String str7 = str;
                        if (i15 == 1 && qtVar4 != null && str7 == null) {
                            str2 = d.substring(qtVar4.c.length()) + mg0Var.getText().toString();
                            d = qtVar4.c;
                            uj0Var.setText(d);
                        } else {
                            str2 = str7;
                        }
                        List list2 = (List) hashMap.get(d);
                        if (list2 == null) {
                            i10 = 0;
                            qtVar = null;
                        } else if (list2.size() > 1) {
                            String string2 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + d, null);
                            qt qtVar6 = (qt) org.telegram.ui.Cells.c1.i(1, list2);
                            if (string2 != null) {
                                int size3 = arrayList.size();
                                int i18 = 0;
                                while (i18 < size3) {
                                    Object obj5 = arrayList.get(i18);
                                    i18++;
                                    qtVar = (qt) obj5;
                                    if (Objects.equals(qtVar.d, string2)) {
                                        i10 = 0;
                                    }
                                }
                            }
                            qtVar = qtVar6;
                            i10 = 0;
                        } else {
                            i10 = 0;
                            qtVar = (qt) list2.get(0);
                        }
                        if (qtVar != null) {
                            pg0Var.H = true;
                            pg0Var.y = qtVar;
                            pg0Var.v(d, qtVar);
                            pg0Var.x = i10;
                        } else {
                            pg0Var.setCountryButtonText(null);
                            mg0Var.setHintText((String) null);
                            pg0Var.x = 2;
                        }
                        if (!z10) {
                            uj0Var.setSelection(uj0Var.getText().length());
                        }
                        if (str2 != null) {
                            mg0Var.requestFocus();
                            mg0Var.setText(str2);
                            mg0Var.setSelection(mg0Var.length());
                        }
                    }
                    pg0Var.I = false;
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
                                            Object obj7 = (qt) org.telegram.ui.Cells.c1.i(1, list3);
                                            if (string3 != null) {
                                                int size4 = arrayList2.size();
                                                int i20 = 0;
                                                while (true) {
                                                    if (i20 < size4) {
                                                        Object obj8 = arrayList2.get(i20);
                                                        i20++;
                                                        qt qtVar7 = (qt) obj8;
                                                        if (Objects.equals(qtVar7.d, string3)) {
                                                            obj7 = qtVar7;
                                                        }
                                                    }
                                                }
                                            }
                                            obj6 = obj7;
                                        } else {
                                            obj6 = (qt) list3.get(0);
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
                        qt qtVar8 = null;
                        int i21 = 0;
                        int i22 = 0;
                        while (i22 < size5) {
                            Object obj9 = arrayList2.get(i22);
                            i22++;
                            qt qtVar9 = (qt) obj9;
                            if (qtVar9.c.startsWith(str4)) {
                                i21++;
                                if (qtVar9.c.equals(str4)) {
                                    qtVar8 = qtVar9;
                                }
                            }
                        }
                        if (i21 == 1 && qtVar8 != null && str5 == null) {
                            str5 = str4.substring(qtVar8.c.length()) + wj0Var.Q.getText().toString();
                            uj0 uj0Var3 = wj0Var.O;
                            String str9 = qtVar8.c;
                            uj0Var3.setText(str9);
                            str4 = str9;
                        }
                        List list4 = (List) hashMap2.get(str4);
                        if (list4 == null) {
                            qtVar2 = null;
                        } else if (list4.size() > 1) {
                            String string4 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + str4, null);
                            qt qtVar10 = (qt) org.telegram.ui.Cells.c1.i(1, list4);
                            if (string4 != null) {
                                int size6 = arrayList2.size();
                                int i23 = 0;
                                while (i23 < size6) {
                                    Object obj10 = arrayList2.get(i23);
                                    i23++;
                                    qt qtVar11 = (qt) obj10;
                                    if (Objects.equals(qtVar11.d, string4)) {
                                        qtVar2 = qtVar11;
                                    }
                                }
                            }
                            qtVar2 = qtVar10;
                        } else {
                            qtVar2 = (qt) list4.get(0);
                        }
                        if (qtVar2 != null) {
                            wj0Var.G = true;
                            wj0Var.u(str4, qtVar2);
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
                gn0 gn0Var = (gn0) this.b;
                if (!gn0Var.Z0 && gn0Var.T0 != 0 && gn0Var.Y[0].length() == gn0Var.T0) {
                    gn0Var.L.callOnClick();
                    break;
                }
                break;
            case 13:
                oo0 oo0Var = (oo0) this.b;
                if (oo0Var.c0 != 0 && editable.length() == oo0Var.c0) {
                    oo0Var.A0(false);
                    break;
                }
                break;
            case 14:
                sq0 sq0Var = ((tq0) this.b).s0;
                if (sq0Var != null) {
                    sq0Var.b(editable);
                    break;
                }
                break;
            case 15:
                r51 r51Var = (r51) this.b;
                org.telegram.ui.Cells.c6 c6Var = r51Var.h;
                String obj11 = (c6Var.getText() == null || AndroidUtilities.trim(c6Var.getText(), null).length() == 0) ? null : c6Var.getText().toString();
                r51Var.y.v(obj11, true, true);
                o61 o61Var = r51Var.n;
                if (o61Var != null) {
                    o61Var.F1(null);
                    r51Var.n.G1(TextUtils.isEmpty(obj11), true);
                }
                if (c6Var != null) {
                    c6Var.clearAnimation();
                    c6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.rr.h).start();
                }
                r51Var.c(false);
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
                    org.telegram.ui.Components.w80 w80Var = new org.telegram.ui.Components.w80(1, null);
                    w80Var.a(se1Var.n);
                    org.telegram.ui.Components.bm0 bm0Var = se1Var.v;
                    if (bm0Var != null) {
                        bm0Var.b(w80Var, true);
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
                wr wrVar = (wr) obj;
                wrVar.x = charSequence.length() != 0;
                wrVar.v = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                wrVar.F = ofFloat;
                ofFloat.addUpdateListener(new c3(wrVar, 9));
                if (wrVar.x) {
                    wrVar.F.setDuration(220L);
                } else {
                    wrVar.F.setInterpolator(new OvershootInterpolator(1.5f));
                    wrVar.F.setDuration(350L);
                }
                wrVar.F.start();
                wrVar.hideActionMode();
                break;
            case 7:
                ae0 ae0Var = (ae0) obj;
                td0 td0Var = ae0Var.S;
                if (ae0Var.R) {
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
                gf0 gf0Var = tf0Var.r0;
                if (tf0Var.q0) {
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
                ld ldVar = (ld) this.b;
                ldVar.d0(ldVar.w.getText().toString());
                break;
            case 3:
                fp fpVar = (fp) this.b;
                if (!fpVar.m0) {
                    String obj = fpVar.a.getText().toString();
                    na naVar = fpVar.O;
                    if (naVar != null) {
                        naVar.b(obj);
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
