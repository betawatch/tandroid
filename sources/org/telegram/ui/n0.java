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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class n0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n0(Object obj, int i10) {
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
        au auVar;
        boolean z11;
        String str3;
        Object obj;
        String str4;
        boolean z12;
        String str5;
        au auVar2;
        switch (this.a) {
            case 0:
                k4 k4Var = (k4) this.b;
                if (k4Var.h0.W && (kVar = k4Var.i0) != null) {
                    kVar.setInput(editable == null ? null : editable.toString());
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                zo zoVar = (zo) this.b;
                zoVar.r.n(5L, zoVar.v.getText().toString(), null);
                bi.k5 k5Var = zoVar.e;
                if (k5Var != null) {
                    k5Var.invalidate();
                    break;
                }
                break;
            case 3:
                ((np) this.b).V();
                break;
            case 4:
                sq sqVar = (sq) this.b;
                tq tqVar = sqVar.e;
                if (!sqVar.d) {
                    tqVar.S = editable.toString();
                    s4.b1 K = tqVar.b.K(tqVar.u0);
                    if (K != null) {
                        tq.f0(tqVar, K.a);
                        break;
                    }
                }
                break;
            case 5:
                break;
            case 6:
                j70 j70Var = (j70) this.b;
                if (j70Var.f.r.length() == 0) {
                    j70Var.T = false;
                    j70Var.S = false;
                    h70 h70Var = j70Var.v;
                    if (h70Var.n) {
                        h70Var.n = false;
                        h70Var.l();
                    }
                    j70Var.v.L(null);
                    j70Var.n.setFastScrollVisible(true);
                    j70Var.n.setVerticalScrollBarEnabled(false);
                    j70Var.q0(0);
                    break;
                } else {
                    h70 h70Var2 = j70Var.v;
                    boolean z13 = h70Var2.n;
                    if (!z13) {
                        j70Var.T = true;
                        j70Var.S = true;
                        if (!z13) {
                            h70Var2.n = true;
                            h70Var2.l();
                        }
                        j70Var.n.setFastScrollVisible(false);
                        j70Var.n.setVerticalScrollBarEnabled(true);
                    }
                    j70Var.v.L(j70Var.f.r.getText().toString());
                    j70Var.s.e(true, false);
                    break;
                }
            case 7:
            case 8:
            case 9:
                break;
            case 10:
                zg0 zg0Var = (zg0) this.b;
                HashMap hashMap = zg0Var.F;
                ArrayList arrayList = zg0Var.E;
                fk0 fk0Var = zg0Var.a;
                wg0 wg0Var = zg0Var.b;
                if (!zg0Var.I) {
                    int i11 = 1;
                    zg0Var.I = true;
                    int i12 = 0;
                    String d = jf.b.d(fk0Var.getText().toString(), false);
                    fk0Var.setText(d);
                    String str6 = null;
                    if (d.length() == 0) {
                        zg0Var.setCountryButtonText(null);
                        wg0Var.setHintText((String) null);
                        zg0Var.x = 1;
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
                                        Object obj2 = (au) t8.b.g(i11, list);
                                        if (string != null) {
                                            int size = arrayList.size();
                                            int i14 = i12;
                                            while (true) {
                                                if (i14 < size) {
                                                    Object obj3 = arrayList.get(i14);
                                                    i14++;
                                                    au auVar3 = (au) obj3;
                                                    if (Objects.equals(auVar3.d, string)) {
                                                        obj2 = auVar3;
                                                    }
                                                }
                                            }
                                        }
                                        obj = obj2;
                                    } else {
                                        obj = (au) list.get(i12);
                                    }
                                    if (obj != null) {
                                        str = d.substring(i13) + wg0Var.getText().toString();
                                        fk0Var.setText(substring);
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
                                str = d.substring(1) + wg0Var.getText().toString();
                                d = d.substring(0, 1);
                                fk0Var.setText(d);
                            }
                        } else {
                            str = null;
                            z10 = false;
                        }
                        int size2 = arrayList.size();
                        au auVar4 = null;
                        int i15 = 0;
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj4 = arrayList.get(i16);
                            i16++;
                            au auVar5 = (au) obj4;
                            if (auVar5.c.startsWith(d)) {
                                int i17 = i15 + 1;
                                str3 = str;
                                if (auVar5.c.equals(d)) {
                                    if (auVar4 == null || !auVar4.c.equals(auVar5.c)) {
                                        i15 = i17;
                                    }
                                    auVar4 = auVar5;
                                } else {
                                    i15 = i17;
                                }
                            } else {
                                str3 = str;
                            }
                            str = str3;
                        }
                        String str7 = str;
                        if (i15 == 1 && auVar4 != null && str7 == null) {
                            str2 = d.substring(auVar4.c.length()) + wg0Var.getText().toString();
                            d = auVar4.c;
                            fk0Var.setText(d);
                        } else {
                            str2 = str7;
                        }
                        List list2 = (List) hashMap.get(d);
                        if (list2 == null) {
                            i10 = 0;
                            auVar = null;
                        } else if (list2.size() > 1) {
                            String string2 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + d, null);
                            au auVar6 = (au) t8.b.g(1, list2);
                            if (string2 != null) {
                                int size3 = arrayList.size();
                                int i18 = 0;
                                while (i18 < size3) {
                                    Object obj5 = arrayList.get(i18);
                                    i18++;
                                    auVar = (au) obj5;
                                    if (Objects.equals(auVar.d, string2)) {
                                        i10 = 0;
                                    }
                                }
                            }
                            auVar = auVar6;
                            i10 = 0;
                        } else {
                            i10 = 0;
                            auVar = (au) list2.get(0);
                        }
                        if (auVar != null) {
                            zg0Var.H = true;
                            zg0Var.y = auVar;
                            zg0Var.t(d, auVar);
                            zg0Var.x = i10;
                        } else {
                            zg0Var.setCountryButtonText(null);
                            wg0Var.setHintText((String) null);
                            zg0Var.x = 2;
                        }
                        if (!z10) {
                            fk0Var.setSelection(fk0Var.getText().length());
                        }
                        if (str2 != null) {
                            wg0Var.requestFocus();
                            wg0Var.setText(str2);
                            wg0Var.setSelection(wg0Var.length());
                        }
                        z11 = false;
                    }
                    zg0Var.I = z11;
                    break;
                }
                break;
            case 11:
                hk0 hk0Var = (hk0) this.b;
                HashMap hashMap2 = hk0Var.x;
                ArrayList arrayList2 = hk0Var.w;
                if (!hk0Var.E) {
                    hk0Var.E = true;
                    String d10 = jf.b.d(hk0Var.O.getText().toString(), false);
                    hk0Var.O.setText(d10);
                    String str8 = null;
                    if (d10.length() == 0) {
                        hk0Var.v(null);
                        hk0Var.Q.setHintText((String) null);
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
                                            Object obj7 = (au) t8.b.g(1, list3);
                                            if (string3 != null) {
                                                int size4 = arrayList2.size();
                                                int i20 = 0;
                                                while (true) {
                                                    if (i20 < size4) {
                                                        Object obj8 = arrayList2.get(i20);
                                                        i20++;
                                                        au auVar7 = (au) obj8;
                                                        if (Objects.equals(auVar7.d, string3)) {
                                                            obj7 = auVar7;
                                                        }
                                                    }
                                                }
                                            }
                                            obj6 = obj7;
                                        } else {
                                            obj6 = (au) list3.get(0);
                                        }
                                    }
                                    if (obj6 != null) {
                                        str5 = d10.substring(i19) + hk0Var.Q.getText().toString();
                                        hk0Var.O.setText(str4);
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
                                str5 = str4.substring(1) + hk0Var.Q.getText().toString();
                                fk0 fk0Var2 = hk0Var.O;
                                str4 = str4.substring(0, 1);
                                fk0Var2.setText(str4);
                            }
                        } else {
                            str4 = d10;
                            z12 = false;
                            str5 = null;
                        }
                        int size5 = arrayList2.size();
                        int i21 = 0;
                        int i22 = 0;
                        au auVar8 = null;
                        while (i22 < size5) {
                            Object obj9 = arrayList2.get(i22);
                            i22++;
                            au auVar9 = (au) obj9;
                            if (auVar9.c.startsWith(str4)) {
                                i21++;
                                if (auVar9.c.equals(str4)) {
                                    auVar8 = auVar9;
                                }
                            }
                        }
                        if (i21 == 1 && auVar8 != null && str5 == null) {
                            str5 = str4.substring(auVar8.c.length()) + hk0Var.Q.getText().toString();
                            fk0 fk0Var3 = hk0Var.O;
                            String str9 = auVar8.c;
                            fk0Var3.setText(str9);
                            str4 = str9;
                        }
                        List list4 = (List) hashMap2.get(str4);
                        if (list4 == null) {
                            auVar2 = null;
                        } else if (list4.size() > 1) {
                            String string4 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + str4, null);
                            au auVar10 = (au) t8.b.g(1, list4);
                            if (string4 != null) {
                                int size6 = arrayList2.size();
                                int i23 = 0;
                                while (i23 < size6) {
                                    Object obj10 = arrayList2.get(i23);
                                    i23++;
                                    au auVar11 = (au) obj10;
                                    if (Objects.equals(auVar11.d, string4)) {
                                        auVar2 = auVar11;
                                    }
                                }
                            }
                            auVar2 = auVar10;
                        } else {
                            auVar2 = (au) list4.get(0);
                        }
                        if (auVar2 != null) {
                            hk0Var.G = true;
                            hk0Var.w(str4, auVar2);
                        } else {
                            hk0Var.v(null);
                            hk0Var.Q.setHintText((String) null);
                        }
                        if (!z12) {
                            fk0 fk0Var4 = hk0Var.O;
                            fk0Var4.setSelection(fk0Var4.getText().length());
                        }
                        if (str5 != null && str5.length() != 0) {
                            hk0Var.Q.requestFocus();
                            hk0Var.Q.setText(str5);
                            fk0 fk0Var5 = hk0Var.Q;
                            fk0Var5.setSelection(fk0Var5.length());
                        }
                    }
                    hk0Var.E = false;
                    hk0.s(hk0Var);
                    break;
                }
                break;
            case 12:
                sn0 sn0Var = (sn0) this.b;
                if (!sn0Var.Z0 && sn0Var.T0 != 0 && sn0Var.Y[0].length() == sn0Var.T0) {
                    sn0Var.L.callOnClick();
                    break;
                }
                break;
            case 13:
                ap0 ap0Var = (ap0) this.b;
                if (ap0Var.c0 != 0 && editable.length() == ap0Var.c0) {
                    ap0Var.A0(false);
                    break;
                }
                break;
            case 14:
                er0 er0Var = ((fr0) this.b).s0;
                if (er0Var != null) {
                    er0Var.b(editable);
                    break;
                }
                break;
            case 15:
                i61 i61Var = (i61) this.b;
                org.telegram.ui.Cells.c6 c6Var = i61Var.h;
                String obj11 = (c6Var.getText() == null || AndroidUtilities.trim(c6Var.getText(), null).length() == 0) ? null : c6Var.getText().toString();
                i61Var.y.v(obj11, true, true);
                f71 f71Var = i61Var.n;
                if (f71Var != null) {
                    f71Var.G1(null);
                    i61Var.n.H1(TextUtils.isEmpty(obj11), true);
                }
                if (c6Var != null) {
                    c6Var.clearAnimation();
                    c6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.es.h).start();
                }
                i61Var.c(false);
                break;
            case 16:
                String trim = editable.toString().trim();
                gf1 gf1Var = (gf1) this.b;
                String str10 = gf1Var.n;
                if (trim.length() > 0) {
                    gf1Var.n = trim.substring(0, 1).toUpperCase();
                } else {
                    gf1Var.n = "";
                }
                if (!str10.equals(gf1Var.n)) {
                    org.telegram.ui.Components.m90 m90Var = new org.telegram.ui.Components.m90(1, null);
                    m90Var.a(gf1Var.n);
                    org.telegram.ui.Components.rm0 rm0Var = gf1Var.v;
                    if (rm0Var != null) {
                        rm0Var.b(m90Var, true);
                        break;
                    }
                }
                break;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                tg1 tg1Var = twoStepVerificationActivity.V;
                if (twoStepVerificationActivity.U) {
                    AndroidUtilities.cancelRunOnUIThread(tg1Var);
                    tg1Var.run();
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
                fs fsVar = (fs) obj;
                fsVar.x = charSequence.length() != 0;
                fsVar.v = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                fsVar.F = ofFloat;
                ofFloat.addUpdateListener(new e3(fsVar, 9));
                if (fsVar.x) {
                    fsVar.F.setDuration(220L);
                } else {
                    org.telegram.messenger.sk.l(1.5f, fsVar.F);
                    fsVar.F.setDuration(350L);
                }
                fsVar.F.start();
                fsVar.hideActionMode();
                break;
            case 7:
                je0 je0Var = (je0) obj;
                ce0 ce0Var = je0Var.S;
                if (je0Var.R) {
                    je0Var.removeCallbacks(ce0Var);
                    ce0Var.run();
                    break;
                }
                break;
            case 8:
                ef0 ef0Var = (ef0) obj;
                cf0 cf0Var = ef0Var.x;
                if (ef0Var.w) {
                    ef0Var.removeCallbacks(cf0Var);
                    cf0Var.run();
                    break;
                }
                break;
            case 9:
                dg0 dg0Var = (dg0) obj;
                qf0 qf0Var = dg0Var.r0;
                if (dg0Var.q0) {
                    dg0Var.removeCallbacks(qf0Var);
                    qf0Var.run();
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.a) {
            case 1:
                sd sdVar = (sd) this.b;
                sdVar.d0(sdVar.w.getText().toString());
                break;
            case 3:
                np npVar = (np) this.b;
                if (!npVar.m0) {
                    String obj = npVar.a.getText().toString();
                    sa saVar = npVar.O;
                    if (saVar != null) {
                        saVar.b(obj);
                    }
                    npVar.W(obj);
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
