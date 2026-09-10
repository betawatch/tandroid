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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        wt wtVar;
        String str3;
        Object obj;
        String str4;
        String str5;
        boolean z11;
        wt wtVar2;
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
                yo yoVar = (yo) this.b;
                yoVar.r.n(5L, yoVar.v.getText().toString(), null);
                gg.i1 i1Var = yoVar.e;
                if (i1Var != null) {
                    i1Var.invalidate();
                    break;
                }
                break;
            case 3:
                ((mp) this.b).V();
                break;
            case 4:
                qq qqVar = (qq) this.b;
                rq rqVar = qqVar.e;
                if (!qqVar.d) {
                    rqVar.S = editable.toString();
                    s4.c1 K = rqVar.b.K(rqVar.u0);
                    if (K != null) {
                        rq.f0(rqVar, K.a);
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
                wg0 wg0Var = (wg0) this.b;
                HashMap hashMap = wg0Var.F;
                ArrayList arrayList = wg0Var.E;
                ck0 ck0Var = wg0Var.a;
                tg0 tg0Var = wg0Var.b;
                if (!wg0Var.I) {
                    int i11 = 1;
                    wg0Var.I = true;
                    int i12 = 0;
                    String d = gf.b.d(ck0Var.getText().toString(), false);
                    ck0Var.setText(d);
                    String str6 = null;
                    if (d.length() == 0) {
                        wg0Var.setCountryButtonText(null);
                        tg0Var.setHintText((String) null);
                        wg0Var.x = 1;
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
                                        Object obj2 = (wt) org.telegram.ui.Cells.r6.g(i11, list);
                                        if (string != null) {
                                            int size = arrayList.size();
                                            int i14 = 0;
                                            while (true) {
                                                if (i14 < size) {
                                                    Object obj3 = arrayList.get(i14);
                                                    i14++;
                                                    wt wtVar3 = (wt) obj3;
                                                    if (Objects.equals(wtVar3.d, string)) {
                                                        obj2 = wtVar3;
                                                    }
                                                }
                                            }
                                        }
                                        obj = obj2;
                                    } else {
                                        obj = (wt) list.get(0);
                                    }
                                    if (obj != null) {
                                        str = d.substring(i13) + tg0Var.getText().toString();
                                        ck0Var.setText(substring);
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
                                str = d.substring(1) + tg0Var.getText().toString();
                                d = d.substring(0, 1);
                                ck0Var.setText(d);
                            }
                        } else {
                            str = null;
                            z10 = false;
                        }
                        int size2 = arrayList.size();
                        wt wtVar4 = null;
                        int i15 = 0;
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj4 = arrayList.get(i16);
                            i16++;
                            wt wtVar5 = (wt) obj4;
                            if (wtVar5.c.startsWith(d)) {
                                int i17 = i15 + 1;
                                str3 = str;
                                if (wtVar5.c.equals(d)) {
                                    if (wtVar4 == null || !wtVar4.c.equals(wtVar5.c)) {
                                        i15 = i17;
                                    }
                                    wtVar4 = wtVar5;
                                } else {
                                    i15 = i17;
                                }
                            } else {
                                str3 = str;
                            }
                            str = str3;
                        }
                        String str7 = str;
                        if (i15 == 1 && wtVar4 != null && str7 == null) {
                            str2 = d.substring(wtVar4.c.length()) + tg0Var.getText().toString();
                            d = wtVar4.c;
                            ck0Var.setText(d);
                        } else {
                            str2 = str7;
                        }
                        List list2 = (List) hashMap.get(d);
                        if (list2 == null) {
                            i10 = 0;
                            wtVar = null;
                        } else if (list2.size() > 1) {
                            String string2 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + d, null);
                            wt wtVar6 = (wt) org.telegram.ui.Cells.r6.g(1, list2);
                            if (string2 != null) {
                                int size3 = arrayList.size();
                                int i18 = 0;
                                while (i18 < size3) {
                                    Object obj5 = arrayList.get(i18);
                                    i18++;
                                    wtVar = (wt) obj5;
                                    if (Objects.equals(wtVar.d, string2)) {
                                        i10 = 0;
                                    }
                                }
                            }
                            wtVar = wtVar6;
                            i10 = 0;
                        } else {
                            i10 = 0;
                            wtVar = (wt) list2.get(0);
                        }
                        if (wtVar != null) {
                            wg0Var.H = true;
                            wg0Var.y = wtVar;
                            wg0Var.v(d, wtVar);
                            wg0Var.x = i10;
                        } else {
                            wg0Var.setCountryButtonText(null);
                            tg0Var.setHintText((String) null);
                            wg0Var.x = 2;
                        }
                        if (!z10) {
                            ck0Var.setSelection(ck0Var.getText().length());
                        }
                        if (str2 != null) {
                            tg0Var.requestFocus();
                            tg0Var.setText(str2);
                            tg0Var.setSelection(tg0Var.length());
                        }
                    }
                    wg0Var.I = false;
                    break;
                }
                break;
            case 11:
                ek0 ek0Var = (ek0) this.b;
                HashMap hashMap2 = ek0Var.x;
                ArrayList arrayList2 = ek0Var.w;
                if (!ek0Var.E) {
                    ek0Var.E = true;
                    String d10 = gf.b.d(ek0Var.O.getText().toString(), false);
                    ek0Var.O.setText(d10);
                    String str8 = null;
                    if (d10.length() == 0) {
                        ek0Var.t(null);
                        ek0Var.Q.setHintText((String) null);
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
                                            Object obj7 = (wt) org.telegram.ui.Cells.r6.g(1, list3);
                                            if (string3 != null) {
                                                int size4 = arrayList2.size();
                                                int i20 = 0;
                                                while (true) {
                                                    if (i20 < size4) {
                                                        Object obj8 = arrayList2.get(i20);
                                                        i20++;
                                                        wt wtVar7 = (wt) obj8;
                                                        if (Objects.equals(wtVar7.d, string3)) {
                                                            obj7 = wtVar7;
                                                        }
                                                    }
                                                }
                                            }
                                            obj6 = obj7;
                                        } else {
                                            obj6 = (wt) list3.get(0);
                                        }
                                    }
                                    if (obj6 != null) {
                                        str5 = d10.substring(i19) + ek0Var.Q.getText().toString();
                                        ek0Var.O.setText(str4);
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
                                str5 = str4.substring(1) + ek0Var.Q.getText().toString();
                                ck0 ck0Var2 = ek0Var.O;
                                str4 = str4.substring(0, 1);
                                ck0Var2.setText(str4);
                            }
                        } else {
                            str4 = d10;
                            str5 = null;
                            z11 = false;
                        }
                        int size5 = arrayList2.size();
                        wt wtVar8 = null;
                        int i21 = 0;
                        int i22 = 0;
                        while (i22 < size5) {
                            Object obj9 = arrayList2.get(i22);
                            i22++;
                            wt wtVar9 = (wt) obj9;
                            if (wtVar9.c.startsWith(str4)) {
                                i21++;
                                if (wtVar9.c.equals(str4)) {
                                    wtVar8 = wtVar9;
                                }
                            }
                        }
                        if (i21 == 1 && wtVar8 != null && str5 == null) {
                            str5 = str4.substring(wtVar8.c.length()) + ek0Var.Q.getText().toString();
                            ck0 ck0Var3 = ek0Var.O;
                            String str9 = wtVar8.c;
                            ck0Var3.setText(str9);
                            str4 = str9;
                        }
                        List list4 = (List) hashMap2.get(str4);
                        if (list4 == null) {
                            wtVar2 = null;
                        } else if (list4.size() > 1) {
                            String string4 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + str4, null);
                            wt wtVar10 = (wt) org.telegram.ui.Cells.r6.g(1, list4);
                            if (string4 != null) {
                                int size6 = arrayList2.size();
                                int i23 = 0;
                                while (i23 < size6) {
                                    Object obj10 = arrayList2.get(i23);
                                    i23++;
                                    wt wtVar11 = (wt) obj10;
                                    if (Objects.equals(wtVar11.d, string4)) {
                                        wtVar2 = wtVar11;
                                    }
                                }
                            }
                            wtVar2 = wtVar10;
                        } else {
                            wtVar2 = (wt) list4.get(0);
                        }
                        if (wtVar2 != null) {
                            ek0Var.G = true;
                            ek0Var.u(str4, wtVar2);
                        } else {
                            ek0Var.t(null);
                            ek0Var.Q.setHintText((String) null);
                        }
                        if (!z11) {
                            ck0 ck0Var4 = ek0Var.O;
                            ck0Var4.setSelection(ck0Var4.getText().length());
                        }
                        if (str5 != null && str5.length() != 0) {
                            ek0Var.Q.requestFocus();
                            ek0Var.Q.setText(str5);
                            ck0 ck0Var5 = ek0Var.Q;
                            ck0Var5.setSelection(ck0Var5.length());
                        }
                    }
                    ek0Var.E = false;
                    ek0.q(ek0Var);
                    break;
                }
                break;
            case 12:
                on0 on0Var = (on0) this.b;
                if (!on0Var.Z0 && on0Var.T0 != 0 && on0Var.Y[0].length() == on0Var.T0) {
                    on0Var.L.callOnClick();
                    break;
                }
                break;
            case 13:
                wo0 wo0Var = (wo0) this.b;
                if (wo0Var.c0 != 0 && editable.length() == wo0Var.c0) {
                    wo0Var.A0(false);
                    break;
                }
                break;
            case 14:
                ar0 ar0Var = ((br0) this.b).s0;
                if (ar0Var != null) {
                    ar0Var.b(editable);
                    break;
                }
                break;
            case 15:
                c61 c61Var = (c61) this.b;
                org.telegram.ui.Cells.d6 d6Var = c61Var.h;
                String obj11 = (d6Var.getText() == null || AndroidUtilities.trim(d6Var.getText(), null).length() == 0) ? null : d6Var.getText().toString();
                c61Var.y.v(obj11, true, true);
                z61 z61Var = c61Var.n;
                if (z61Var != null) {
                    z61Var.E1(null);
                    c61Var.n.F1(TextUtils.isEmpty(obj11), true);
                }
                if (d6Var != null) {
                    d6Var.clearAnimation();
                    d6Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.wr.h).start();
                }
                c61Var.c(false);
                break;
            case 16:
                String trim = editable.toString().trim();
                ef1 ef1Var = (ef1) this.b;
                String str10 = ef1Var.n;
                if (trim.length() > 0) {
                    ef1Var.n = trim.substring(0, 1).toUpperCase();
                } else {
                    ef1Var.n = "";
                }
                if (!str10.equals(ef1Var.n)) {
                    org.telegram.ui.Components.v80 v80Var = new org.telegram.ui.Components.v80(1, null);
                    v80Var.a(ef1Var.n);
                    org.telegram.ui.Components.am0 am0Var = ef1Var.v;
                    if (am0Var != null) {
                        am0Var.b(v80Var, true);
                        break;
                    }
                }
                break;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                rg1 rg1Var = twoStepVerificationActivity.V;
                if (twoStepVerificationActivity.U) {
                    AndroidUtilities.cancelRunOnUIThread(rg1Var);
                    rg1Var.run();
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
                ds dsVar = (ds) obj;
                dsVar.x = charSequence.length() != 0;
                dsVar.v = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                dsVar.F = ofFloat;
                ofFloat.addUpdateListener(new d3(dsVar, 9));
                if (dsVar.x) {
                    dsVar.F.setDuration(220L);
                } else {
                    dsVar.F.setInterpolator(new OvershootInterpolator(1.5f));
                    dsVar.F.setDuration(350L);
                }
                dsVar.F.start();
                dsVar.hideActionMode();
                break;
            case 7:
                ge0 ge0Var = (ge0) obj;
                zd0 zd0Var = ge0Var.S;
                if (ge0Var.R) {
                    ge0Var.removeCallbacks(zd0Var);
                    zd0Var.run();
                    break;
                }
                break;
            case 8:
                af0 af0Var = (af0) obj;
                ye0 ye0Var = af0Var.x;
                if (af0Var.w) {
                    af0Var.removeCallbacks(ye0Var);
                    ye0Var.run();
                    break;
                }
                break;
            case 9:
                zf0 zf0Var = (zf0) obj;
                mf0 mf0Var = zf0Var.r0;
                if (zf0Var.q0) {
                    zf0Var.removeCallbacks(mf0Var);
                    mf0Var.run();
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
                mp mpVar = (mp) this.b;
                if (!mpVar.m0) {
                    String obj = mpVar.a.getText().toString();
                    oa oaVar = mpVar.O;
                    if (oaVar != null) {
                        oaVar.b(obj);
                    }
                    mpVar.W(obj);
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
