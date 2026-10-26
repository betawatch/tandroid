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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
        org.telegram.ui.web.l lVar;
        String str;
        boolean z10;
        String str2;
        int i10;
        jt jtVar;
        boolean z11;
        String str3;
        Object obj;
        String str4;
        boolean z12;
        String str5;
        jt jtVar2;
        switch (this.a) {
            case 0:
                j4 j4Var = (j4) this.b;
                if (j4Var.h0.W && (lVar = j4Var.i0) != null) {
                    lVar.setInput(editable == null ? null : editable.toString());
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                mo moVar = (mo) this.b;
                moVar.r.n(5L, moVar.v.getText().toString(), null);
                di.k4 k4Var = moVar.e;
                if (k4Var != null) {
                    k4Var.invalidate();
                    break;
                }
                break;
            case 3:
                ((ap) this.b).X();
                break;
            case 4:
                fq fqVar = (fq) this.b;
                gq gqVar = fqVar.e;
                if (!fqVar.d) {
                    gqVar.S = editable.toString();
                    s4.e1 K = gqVar.b.K(gqVar.u0);
                    if (K != null) {
                        gq.g0(gqVar, K.a);
                        break;
                    }
                }
                break;
            case 5:
                break;
            case 6:
                r60 r60Var = (r60) this.b;
                if (r60Var.f.r.length() == 0) {
                    r60Var.T = false;
                    r60Var.S = false;
                    p60 p60Var = r60Var.v;
                    if (p60Var.n) {
                        p60Var.n = false;
                        p60Var.l();
                    }
                    r60Var.v.L(null);
                    r60Var.n.setFastScrollVisible(true);
                    r60Var.n.setVerticalScrollBarEnabled(false);
                    r60Var.r0(0);
                    break;
                } else {
                    p60 p60Var2 = r60Var.v;
                    boolean z13 = p60Var2.n;
                    if (!z13) {
                        r60Var.T = true;
                        r60Var.S = true;
                        if (!z13) {
                            p60Var2.n = true;
                            p60Var2.l();
                        }
                        r60Var.n.setFastScrollVisible(false);
                        r60Var.n.setVerticalScrollBarEnabled(true);
                    }
                    r60Var.v.L(r60Var.f.r.getText().toString());
                    r60Var.s.e(true, false);
                    break;
                }
            case 7:
            case 8:
            case 9:
                break;
            case 10:
                fg0 fg0Var = (fg0) this.b;
                HashMap hashMap = fg0Var.H;
                ArrayList arrayList = fg0Var.G;
                mj0 mj0Var = fg0Var.a;
                cg0 cg0Var = fg0Var.b;
                if (!fg0Var.K) {
                    int i11 = 1;
                    fg0Var.K = true;
                    int i12 = 0;
                    String d = kf.b.d(mj0Var.getText().toString(), false);
                    mj0Var.setText(d);
                    String str6 = null;
                    if (d.length() == 0) {
                        fg0Var.setCountryButtonText(null);
                        cg0Var.setHintText((String) null);
                        fg0Var.E = 1;
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
                                        Object obj2 = (jt) org.telegram.ui.Components.b10.h(i11, list);
                                        if (string != null) {
                                            int size = arrayList.size();
                                            int i14 = i12;
                                            while (true) {
                                                if (i14 < size) {
                                                    Object obj3 = arrayList.get(i14);
                                                    i14++;
                                                    jt jtVar3 = (jt) obj3;
                                                    if (Objects.equals(jtVar3.d, string)) {
                                                        obj2 = jtVar3;
                                                    }
                                                }
                                            }
                                        }
                                        obj = obj2;
                                    } else {
                                        obj = (jt) list.get(i12);
                                    }
                                    if (obj != null) {
                                        str = d.substring(i13) + cg0Var.getText().toString();
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
                                str = d.substring(1) + cg0Var.getText().toString();
                                d = d.substring(0, 1);
                                mj0Var.setText(d);
                            }
                        } else {
                            str = null;
                            z10 = false;
                        }
                        int size2 = arrayList.size();
                        jt jtVar4 = null;
                        int i15 = 0;
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj4 = arrayList.get(i16);
                            i16++;
                            jt jtVar5 = (jt) obj4;
                            if (jtVar5.c.startsWith(d)) {
                                int i17 = i15 + 1;
                                str3 = str;
                                if (jtVar5.c.equals(d)) {
                                    if (jtVar4 == null || !jtVar4.c.equals(jtVar5.c)) {
                                        i15 = i17;
                                    }
                                    jtVar4 = jtVar5;
                                } else {
                                    i15 = i17;
                                }
                            } else {
                                str3 = str;
                            }
                            str = str3;
                        }
                        String str7 = str;
                        if (i15 == 1 && jtVar4 != null && str7 == null) {
                            str2 = d.substring(jtVar4.c.length()) + cg0Var.getText().toString();
                            d = jtVar4.c;
                            mj0Var.setText(d);
                        } else {
                            str2 = str7;
                        }
                        List list2 = (List) hashMap.get(d);
                        if (list2 == null) {
                            i10 = 0;
                            jtVar = null;
                        } else if (list2.size() > 1) {
                            String string2 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + d, null);
                            jt jtVar6 = (jt) org.telegram.ui.Components.b10.h(1, list2);
                            if (string2 != null) {
                                int size3 = arrayList.size();
                                int i18 = 0;
                                while (i18 < size3) {
                                    Object obj5 = arrayList.get(i18);
                                    i18++;
                                    jtVar = (jt) obj5;
                                    if (Objects.equals(jtVar.d, string2)) {
                                        i10 = 0;
                                    }
                                }
                            }
                            jtVar = jtVar6;
                            i10 = 0;
                        } else {
                            i10 = 0;
                            jtVar = (jt) list2.get(0);
                        }
                        if (jtVar != null) {
                            fg0Var.J = true;
                            fg0Var.F = jtVar;
                            fg0Var.s(d, jtVar);
                            fg0Var.E = i10;
                        } else {
                            fg0Var.setCountryButtonText(null);
                            cg0Var.setHintText((String) null);
                            fg0Var.E = 2;
                        }
                        if (!z10) {
                            mj0Var.setSelection(mj0Var.getText().length());
                        }
                        if (str2 != null) {
                            cg0Var.requestFocus();
                            cg0Var.setText(str2);
                            cg0Var.setSelection(cg0Var.length());
                        }
                        z11 = false;
                    }
                    fg0Var.K = z11;
                    break;
                }
                break;
            case 11:
                oj0 oj0Var = (oj0) this.b;
                HashMap hashMap2 = oj0Var.w;
                ArrayList arrayList2 = oj0Var.v;
                if (!oj0Var.y) {
                    oj0Var.y = true;
                    String d10 = kf.b.d(oj0Var.N.getText().toString(), false);
                    oj0Var.N.setText(d10);
                    String str8 = null;
                    if (d10.length() == 0) {
                        oj0Var.u(null);
                        oj0Var.P.setHintText((String) null);
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
                                            Object obj7 = (jt) org.telegram.ui.Components.b10.h(1, list3);
                                            if (string3 != null) {
                                                int size4 = arrayList2.size();
                                                int i20 = 0;
                                                while (true) {
                                                    if (i20 < size4) {
                                                        Object obj8 = arrayList2.get(i20);
                                                        i20++;
                                                        jt jtVar7 = (jt) obj8;
                                                        if (Objects.equals(jtVar7.d, string3)) {
                                                            obj7 = jtVar7;
                                                        }
                                                    }
                                                }
                                            }
                                            obj6 = obj7;
                                        } else {
                                            obj6 = (jt) list3.get(0);
                                        }
                                    }
                                    if (obj6 != null) {
                                        str5 = d10.substring(i19) + oj0Var.P.getText().toString();
                                        oj0Var.N.setText(str4);
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
                                str5 = str4.substring(1) + oj0Var.P.getText().toString();
                                mj0 mj0Var2 = oj0Var.N;
                                str4 = str4.substring(0, 1);
                                mj0Var2.setText(str4);
                            }
                        } else {
                            str4 = d10;
                            z12 = false;
                            str5 = null;
                        }
                        int size5 = arrayList2.size();
                        int i21 = 0;
                        int i22 = 0;
                        jt jtVar8 = null;
                        while (i22 < size5) {
                            Object obj9 = arrayList2.get(i22);
                            i22++;
                            jt jtVar9 = (jt) obj9;
                            if (jtVar9.c.startsWith(str4)) {
                                i21++;
                                if (jtVar9.c.equals(str4)) {
                                    jtVar8 = jtVar9;
                                }
                            }
                        }
                        if (i21 == 1 && jtVar8 != null && str5 == null) {
                            str5 = str4.substring(jtVar8.c.length()) + oj0Var.P.getText().toString();
                            mj0 mj0Var3 = oj0Var.N;
                            String str9 = jtVar8.c;
                            mj0Var3.setText(str9);
                            str4 = str9;
                        }
                        List list4 = (List) hashMap2.get(str4);
                        if (list4 == null) {
                            jtVar2 = null;
                        } else if (list4.size() > 1) {
                            String string4 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + str4, null);
                            jt jtVar10 = (jt) org.telegram.ui.Components.b10.h(1, list4);
                            if (string4 != null) {
                                int size6 = arrayList2.size();
                                int i23 = 0;
                                while (i23 < size6) {
                                    Object obj10 = arrayList2.get(i23);
                                    i23++;
                                    jt jtVar11 = (jt) obj10;
                                    if (Objects.equals(jtVar11.d, string4)) {
                                        jtVar2 = jtVar11;
                                    }
                                }
                            }
                            jtVar2 = jtVar10;
                        } else {
                            jtVar2 = (jt) list4.get(0);
                        }
                        if (jtVar2 != null) {
                            oj0Var.F = true;
                            oj0Var.v(str4, jtVar2);
                        } else {
                            oj0Var.u(null);
                            oj0Var.P.setHintText((String) null);
                        }
                        if (!z12) {
                            mj0 mj0Var4 = oj0Var.N;
                            mj0Var4.setSelection(mj0Var4.getText().length());
                        }
                        if (str5 != null && str5.length() != 0) {
                            oj0Var.P.requestFocus();
                            oj0Var.P.setText(str5);
                            mj0 mj0Var5 = oj0Var.P;
                            mj0Var5.setSelection(mj0Var5.length());
                        }
                    }
                    oj0Var.y = false;
                    oj0.r(oj0Var);
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
                po0 po0Var = (po0) this.b;
                if (po0Var.c0 != 0 && editable.length() == po0Var.c0) {
                    po0Var.B0(false);
                    break;
                }
                break;
            case 14:
                qq0 qq0Var = ((rq0) this.b).s0;
                if (qq0Var != null) {
                    qq0Var.b(editable);
                    break;
                }
                break;
            case 15:
                t41 t41Var = (t41) this.b;
                org.telegram.ui.Cells.g6 g6Var = t41Var.h;
                String obj11 = (g6Var.getText() == null || AndroidUtilities.trim(g6Var.getText(), null).length() == 0) ? null : g6Var.getText().toString();
                t41Var.F.v(obj11, true, true);
                q51 q51Var = t41Var.n;
                if (q51Var != null) {
                    q51Var.L1(null);
                    t41Var.n.M1(TextUtils.isEmpty(obj11), true);
                }
                if (g6Var != null) {
                    g6Var.clearAnimation();
                    g6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.ds.h).start();
                }
                t41Var.c(false);
                break;
            case 16:
                String trim = editable.toString().trim();
                wd1 wd1Var = (wd1) this.b;
                String str10 = wd1Var.n;
                if (trim.length() > 0) {
                    wd1Var.n = trim.substring(0, 1).toUpperCase();
                } else {
                    wd1Var.n = "";
                }
                if (!str10.equals(wd1Var.n)) {
                    org.telegram.ui.Components.h90 h90Var = new org.telegram.ui.Components.h90(1, null);
                    h90Var.a(wd1Var.n);
                    org.telegram.ui.Components.um0 um0Var = wd1Var.v;
                    if (um0Var != null) {
                        um0Var.b(h90Var, true);
                        break;
                    }
                }
                break;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                jf1 jf1Var = twoStepVerificationActivity.V;
                if (twoStepVerificationActivity.U) {
                    AndroidUtilities.cancelRunOnUIThread(jf1Var);
                    jf1Var.run();
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
                tr trVar = (tr) obj;
                trVar.x = charSequence.length() != 0;
                trVar.v = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                trVar.F = ofFloat;
                ofFloat.addUpdateListener(new b3(trVar, 8));
                if (trVar.x) {
                    trVar.F.setDuration(220L);
                } else {
                    d3.m(1.5f, trVar.F);
                    trVar.F.setDuration(350L);
                }
                trVar.F.start();
                trVar.hideActionMode();
                break;
            case 7:
                od0 od0Var = (od0) obj;
                hd0 hd0Var = od0Var.S;
                if (od0Var.R) {
                    od0Var.removeCallbacks(hd0Var);
                    hd0Var.run();
                    break;
                }
                break;
            case 8:
                je0 je0Var = (je0) obj;
                he0 he0Var = je0Var.x;
                if (je0Var.w) {
                    je0Var.removeCallbacks(he0Var);
                    he0Var.run();
                    break;
                }
                break;
            case 9:
                jf0 jf0Var = (jf0) obj;
                we0 we0Var = jf0Var.t0;
                if (jf0Var.s0) {
                    jf0Var.removeCallbacks(we0Var);
                    we0Var.run();
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
                ndVar.f0(ndVar.x.getText().toString());
                break;
            case 3:
                ap apVar = (ap) this.b;
                if (!apVar.m0) {
                    String obj = apVar.b.getText().toString();
                    qa qaVar = apVar.O;
                    if (qaVar != null) {
                        qaVar.b(obj);
                    }
                    apVar.Y(obj);
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
