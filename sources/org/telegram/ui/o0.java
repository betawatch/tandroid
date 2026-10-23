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

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
        org.telegram.ui.web.k kVar;
        String str;
        boolean z10;
        String str2;
        int i10;
        ht htVar;
        boolean z11;
        String str3;
        Object obj;
        String str4;
        boolean z12;
        String str5;
        ht htVar2;
        switch (this.a) {
            case 0:
                l4 l4Var = (l4) this.b;
                if (l4Var.h0.W && (kVar = l4Var.i0) != null) {
                    kVar.setInput(editable == null ? null : editable.toString());
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                io ioVar = (io) this.b;
                ioVar.r.n(5L, ioVar.v.getText().toString(), null);
                ci.k4 k4Var = ioVar.e;
                if (k4Var != null) {
                    k4Var.invalidate();
                    break;
                }
                break;
            case 3:
                ((wo) this.b).V();
                break;
            case 4:
                aq aqVar = (aq) this.b;
                bq bqVar = aqVar.e;
                if (!aqVar.d) {
                    bqVar.S = editable.toString();
                    s4.b1 K = bqVar.b.K(bqVar.u0);
                    if (K != null) {
                        bq.f0(bqVar, K.a);
                        break;
                    }
                }
                break;
            case 5:
                break;
            case 6:
                l60 l60Var = (l60) this.b;
                if (l60Var.f.r.length() == 0) {
                    l60Var.T = false;
                    l60Var.S = false;
                    j60 j60Var = l60Var.v;
                    if (j60Var.n) {
                        j60Var.n = false;
                        j60Var.l();
                    }
                    l60Var.v.L(null);
                    l60Var.n.setFastScrollVisible(true);
                    l60Var.n.setVerticalScrollBarEnabled(false);
                    l60Var.q0(0);
                    break;
                } else {
                    j60 j60Var2 = l60Var.v;
                    boolean z13 = j60Var2.n;
                    if (!z13) {
                        l60Var.T = true;
                        l60Var.S = true;
                        if (!z13) {
                            j60Var2.n = true;
                            j60Var2.l();
                        }
                        l60Var.n.setFastScrollVisible(false);
                        l60Var.n.setVerticalScrollBarEnabled(true);
                    }
                    l60Var.v.L(l60Var.f.r.getText().toString());
                    l60Var.s.e(true, false);
                    break;
                }
            case 7:
            case 8:
            case 9:
                break;
            case 10:
                cg0 cg0Var = (cg0) this.b;
                HashMap hashMap = cg0Var.F;
                ArrayList arrayList = cg0Var.E;
                kj0 kj0Var = cg0Var.a;
                zf0 zf0Var = cg0Var.b;
                if (!cg0Var.I) {
                    int i11 = 1;
                    cg0Var.I = true;
                    int i12 = 0;
                    String d = jf.b.d(kj0Var.getText().toString(), false);
                    kj0Var.setText(d);
                    String str6 = null;
                    if (d.length() == 0) {
                        cg0Var.setCountryButtonText(null);
                        zf0Var.setHintText((String) null);
                        cg0Var.x = 1;
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
                                        Object obj2 = (ht) r4.c.f(i11, list);
                                        if (string != null) {
                                            int size = arrayList.size();
                                            int i14 = i12;
                                            while (true) {
                                                if (i14 < size) {
                                                    Object obj3 = arrayList.get(i14);
                                                    i14++;
                                                    ht htVar3 = (ht) obj3;
                                                    if (Objects.equals(htVar3.d, string)) {
                                                        obj2 = htVar3;
                                                    }
                                                }
                                            }
                                        }
                                        obj = obj2;
                                    } else {
                                        obj = (ht) list.get(i12);
                                    }
                                    if (obj != null) {
                                        str = d.substring(i13) + zf0Var.getText().toString();
                                        kj0Var.setText(substring);
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
                                str = d.substring(1) + zf0Var.getText().toString();
                                d = d.substring(0, 1);
                                kj0Var.setText(d);
                            }
                        } else {
                            str = null;
                            z10 = false;
                        }
                        int size2 = arrayList.size();
                        ht htVar4 = null;
                        int i15 = 0;
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj4 = arrayList.get(i16);
                            i16++;
                            ht htVar5 = (ht) obj4;
                            if (htVar5.c.startsWith(d)) {
                                int i17 = i15 + 1;
                                str3 = str;
                                if (htVar5.c.equals(d)) {
                                    if (htVar4 == null || !htVar4.c.equals(htVar5.c)) {
                                        i15 = i17;
                                    }
                                    htVar4 = htVar5;
                                } else {
                                    i15 = i17;
                                }
                            } else {
                                str3 = str;
                            }
                            str = str3;
                        }
                        String str7 = str;
                        if (i15 == 1 && htVar4 != null && str7 == null) {
                            str2 = d.substring(htVar4.c.length()) + zf0Var.getText().toString();
                            d = htVar4.c;
                            kj0Var.setText(d);
                        } else {
                            str2 = str7;
                        }
                        List list2 = (List) hashMap.get(d);
                        if (list2 == null) {
                            i10 = 0;
                            htVar = null;
                        } else if (list2.size() > 1) {
                            String string2 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + d, null);
                            ht htVar6 = (ht) r4.c.f(1, list2);
                            if (string2 != null) {
                                int size3 = arrayList.size();
                                int i18 = 0;
                                while (i18 < size3) {
                                    Object obj5 = arrayList.get(i18);
                                    i18++;
                                    htVar = (ht) obj5;
                                    if (Objects.equals(htVar.d, string2)) {
                                        i10 = 0;
                                    }
                                }
                            }
                            htVar = htVar6;
                            i10 = 0;
                        } else {
                            i10 = 0;
                            htVar = (ht) list2.get(0);
                        }
                        if (htVar != null) {
                            cg0Var.H = true;
                            cg0Var.y = htVar;
                            cg0Var.t(d, htVar);
                            cg0Var.x = i10;
                        } else {
                            cg0Var.setCountryButtonText(null);
                            zf0Var.setHintText((String) null);
                            cg0Var.x = 2;
                        }
                        if (!z10) {
                            kj0Var.setSelection(kj0Var.getText().length());
                        }
                        if (str2 != null) {
                            zf0Var.requestFocus();
                            zf0Var.setText(str2);
                            zf0Var.setSelection(zf0Var.length());
                        }
                        z11 = false;
                    }
                    cg0Var.I = z11;
                    break;
                }
                break;
            case 11:
                mj0 mj0Var = (mj0) this.b;
                HashMap hashMap2 = mj0Var.x;
                ArrayList arrayList2 = mj0Var.w;
                if (!mj0Var.E) {
                    mj0Var.E = true;
                    String d10 = jf.b.d(mj0Var.O.getText().toString(), false);
                    mj0Var.O.setText(d10);
                    String str8 = null;
                    if (d10.length() == 0) {
                        mj0Var.v(null);
                        mj0Var.Q.setHintText((String) null);
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
                                            Object obj7 = (ht) r4.c.f(1, list3);
                                            if (string3 != null) {
                                                int size4 = arrayList2.size();
                                                int i20 = 0;
                                                while (true) {
                                                    if (i20 < size4) {
                                                        Object obj8 = arrayList2.get(i20);
                                                        i20++;
                                                        ht htVar7 = (ht) obj8;
                                                        if (Objects.equals(htVar7.d, string3)) {
                                                            obj7 = htVar7;
                                                        }
                                                    }
                                                }
                                            }
                                            obj6 = obj7;
                                        } else {
                                            obj6 = (ht) list3.get(0);
                                        }
                                    }
                                    if (obj6 != null) {
                                        str5 = d10.substring(i19) + mj0Var.Q.getText().toString();
                                        mj0Var.O.setText(str4);
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
                                str5 = str4.substring(1) + mj0Var.Q.getText().toString();
                                kj0 kj0Var2 = mj0Var.O;
                                str4 = str4.substring(0, 1);
                                kj0Var2.setText(str4);
                            }
                        } else {
                            str4 = d10;
                            z12 = false;
                            str5 = null;
                        }
                        int size5 = arrayList2.size();
                        int i21 = 0;
                        int i22 = 0;
                        ht htVar8 = null;
                        while (i22 < size5) {
                            Object obj9 = arrayList2.get(i22);
                            i22++;
                            ht htVar9 = (ht) obj9;
                            if (htVar9.c.startsWith(str4)) {
                                i21++;
                                if (htVar9.c.equals(str4)) {
                                    htVar8 = htVar9;
                                }
                            }
                        }
                        if (i21 == 1 && htVar8 != null && str5 == null) {
                            str5 = str4.substring(htVar8.c.length()) + mj0Var.Q.getText().toString();
                            kj0 kj0Var3 = mj0Var.O;
                            String str9 = htVar8.c;
                            kj0Var3.setText(str9);
                            str4 = str9;
                        }
                        List list4 = (List) hashMap2.get(str4);
                        if (list4 == null) {
                            htVar2 = null;
                        } else if (list4.size() > 1) {
                            String string4 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + str4, null);
                            ht htVar10 = (ht) r4.c.f(1, list4);
                            if (string4 != null) {
                                int size6 = arrayList2.size();
                                int i23 = 0;
                                while (i23 < size6) {
                                    Object obj10 = arrayList2.get(i23);
                                    i23++;
                                    ht htVar11 = (ht) obj10;
                                    if (Objects.equals(htVar11.d, string4)) {
                                        htVar2 = htVar11;
                                    }
                                }
                            }
                            htVar2 = htVar10;
                        } else {
                            htVar2 = (ht) list4.get(0);
                        }
                        if (htVar2 != null) {
                            mj0Var.G = true;
                            mj0Var.w(str4, htVar2);
                        } else {
                            mj0Var.v(null);
                            mj0Var.Q.setHintText((String) null);
                        }
                        if (!z12) {
                            kj0 kj0Var4 = mj0Var.O;
                            kj0Var4.setSelection(kj0Var4.getText().length());
                        }
                        if (str5 != null && str5.length() != 0) {
                            mj0Var.Q.requestFocus();
                            mj0Var.Q.setText(str5);
                            kj0 kj0Var5 = mj0Var.Q;
                            kj0Var5.setSelection(kj0Var5.length());
                        }
                    }
                    mj0Var.E = false;
                    mj0.s(mj0Var);
                    break;
                }
                break;
            case 12:
                vm0 vm0Var = (vm0) this.b;
                if (!vm0Var.Z0 && vm0Var.T0 != 0 && vm0Var.Y[0].length() == vm0Var.T0) {
                    vm0Var.L.callOnClick();
                    break;
                }
                break;
            case 13:
                eo0 eo0Var = (eo0) this.b;
                if (eo0Var.c0 != 0 && editable.length() == eo0Var.c0) {
                    eo0Var.A0(false);
                    break;
                }
                break;
            case 14:
                iq0 iq0Var = ((jq0) this.b).s0;
                if (iq0Var != null) {
                    iq0Var.b(editable);
                    break;
                }
                break;
            case 15:
                o41 o41Var = (o41) this.b;
                org.telegram.ui.Cells.b6 b6Var = o41Var.h;
                String obj11 = (b6Var.getText() == null || AndroidUtilities.trim(b6Var.getText(), null).length() == 0) ? null : b6Var.getText().toString();
                o41Var.y.v(obj11, true, true);
                l51 l51Var = o41Var.n;
                if (l51Var != null) {
                    l51Var.G1(null);
                    o41Var.n.H1(TextUtils.isEmpty(obj11), true);
                }
                if (b6Var != null) {
                    b6Var.clearAnimation();
                    b6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.bs.h).start();
                }
                o41Var.c(false);
                break;
            case 16:
                String trim = editable.toString().trim();
                nd1 nd1Var = (nd1) this.b;
                String str10 = nd1Var.n;
                if (trim.length() > 0) {
                    nd1Var.n = trim.substring(0, 1).toUpperCase();
                } else {
                    nd1Var.n = "";
                }
                if (!str10.equals(nd1Var.n)) {
                    org.telegram.ui.Components.f90 f90Var = new org.telegram.ui.Components.f90(1, null);
                    f90Var.a(nd1Var.n);
                    org.telegram.ui.Components.om0 om0Var = nd1Var.v;
                    if (om0Var != null) {
                        om0Var.b(f90Var, true);
                        break;
                    }
                }
                break;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                af1 af1Var = twoStepVerificationActivity.V;
                if (twoStepVerificationActivity.U) {
                    AndroidUtilities.cancelRunOnUIThread(af1Var);
                    af1Var.run();
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
                or orVar = (or) obj;
                orVar.x = charSequence.length() != 0;
                orVar.v = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                orVar.F = ofFloat;
                ofFloat.addUpdateListener(new e3(orVar, 9));
                if (orVar.x) {
                    orVar.F.setDuration(220L);
                } else {
                    org.telegram.messenger.nk.l(1.5f, orVar.F);
                    orVar.F.setDuration(350L);
                }
                orVar.F.start();
                orVar.hideActionMode();
                break;
            case 7:
                md0 md0Var = (md0) obj;
                ed0 ed0Var = md0Var.S;
                if (md0Var.R) {
                    md0Var.removeCallbacks(ed0Var);
                    ed0Var.run();
                    break;
                }
                break;
            case 8:
                ge0 ge0Var = (ge0) obj;
                ee0 ee0Var = ge0Var.x;
                if (ge0Var.w) {
                    ge0Var.removeCallbacks(ee0Var);
                    ee0Var.run();
                    break;
                }
                break;
            case 9:
                hf0 hf0Var = (hf0) obj;
                se0 se0Var = hf0Var.r0;
                if (hf0Var.q0) {
                    hf0Var.removeCallbacks(se0Var);
                    se0Var.run();
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
                wo woVar = (wo) this.b;
                if (!woVar.m0) {
                    String obj = woVar.a.getText().toString();
                    pa paVar = woVar.O;
                    if (paVar != null) {
                        paVar.b(obj);
                    }
                    woVar.W(obj);
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
