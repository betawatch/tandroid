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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class o0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o0(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.web.k kVar;
        String str;
        boolean z10;
        String str2;
        int i9;
        lt ltVar;
        String str3;
        Object obj;
        String str4;
        String str5;
        boolean z11;
        lt ltVar2;
        switch (this.a) {
            case 0:
                l4 l4Var = (l4) this.b;
                if (l4Var.d0.S && (kVar = l4Var.e0) != null) {
                    kVar.setInput(editable == null ? null : editable.toString());
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                ho hoVar = (ho) this.b;
                hoVar.r.n(5L, hoVar.v.getText().toString(), null);
                ih.d4 d4Var = hoVar.e;
                if (d4Var != null) {
                    d4Var.invalidate();
                    break;
                }
                break;
            case 3:
                ((vo) this.b).U();
                break;
            case 4:
                aq aqVar = (aq) this.b;
                bq bqVar = aqVar.e;
                if (!aqVar.d) {
                    bqVar.O = editable.toString();
                    f2.q1 K = bqVar.b.K(bqVar.q0);
                    if (K != null) {
                        bq.e0(bqVar, K.a);
                        break;
                    }
                }
                break;
            case 5:
                break;
            case 6:
                k60 k60Var = (k60) this.b;
                if (k60Var.f.r.length() == 0) {
                    k60Var.P = false;
                    k60Var.O = false;
                    i60 i60Var = k60Var.v;
                    if (i60Var.n) {
                        i60Var.n = false;
                        i60Var.l();
                    }
                    k60Var.v.L(null);
                    k60Var.n.setFastScrollVisible(true);
                    k60Var.n.setVerticalScrollBarEnabled(false);
                    k60Var.p0(0);
                    break;
                } else {
                    i60 i60Var2 = k60Var.v;
                    boolean z12 = i60Var2.n;
                    if (!z12) {
                        k60Var.P = true;
                        k60Var.O = true;
                        if (!z12) {
                            i60Var2.n = true;
                            i60Var2.l();
                        }
                        k60Var.n.setFastScrollVisible(false);
                        k60Var.n.setVerticalScrollBarEnabled(true);
                    }
                    k60Var.v.L(k60Var.f.r.getText().toString());
                    k60Var.s.e(true, false);
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
                kj0 kj0Var = eg0Var.a;
                bg0 bg0Var = eg0Var.b;
                if (!eg0Var.E) {
                    int i10 = 1;
                    eg0Var.E = true;
                    int i11 = 0;
                    String d = ne.b.d(kj0Var.getText().toString(), false);
                    kj0Var.setText(d);
                    String str6 = null;
                    if (d.length() == 0) {
                        eg0Var.setCountryButtonText(null);
                        bg0Var.setHintText((String) null);
                        eg0Var.x = 1;
                    } else {
                        int i12 = 4;
                        if (d.length() > 4) {
                            while (true) {
                                if (i12 >= i10) {
                                    String substring = d.substring(i11, i12);
                                    List list = (List) hashMap.get(substring);
                                    if (list == null) {
                                        obj = str6;
                                    } else if (list.size() > i10) {
                                        String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, str6);
                                        Object obj2 = (lt) j3.r0.k(i10, list);
                                        if (string != null) {
                                            int size = arrayList.size();
                                            int i13 = 0;
                                            while (true) {
                                                if (i13 < size) {
                                                    Object obj3 = arrayList.get(i13);
                                                    i13++;
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
                                        str = d.substring(i12) + bg0Var.getText().toString();
                                        kj0Var.setText(substring);
                                        d = substring;
                                        z10 = true;
                                    } else {
                                        i12--;
                                        i10 = 1;
                                        i11 = 0;
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
                                kj0Var.setText(d);
                            }
                        } else {
                            str = null;
                            z10 = false;
                        }
                        int size2 = arrayList.size();
                        lt ltVar4 = null;
                        int i14 = 0;
                        int i15 = 0;
                        while (i15 < size2) {
                            Object obj4 = arrayList.get(i15);
                            i15++;
                            lt ltVar5 = (lt) obj4;
                            if (ltVar5.c.startsWith(d)) {
                                int i16 = i14 + 1;
                                str3 = str;
                                if (ltVar5.c.equals(d)) {
                                    if (ltVar4 == null || !ltVar4.c.equals(ltVar5.c)) {
                                        i14 = i16;
                                    }
                                    ltVar4 = ltVar5;
                                } else {
                                    i14 = i16;
                                }
                            } else {
                                str3 = str;
                            }
                            str = str3;
                        }
                        String str7 = str;
                        if (i14 == 1 && ltVar4 != null && str7 == null) {
                            str2 = d.substring(ltVar4.c.length()) + bg0Var.getText().toString();
                            d = ltVar4.c;
                            kj0Var.setText(d);
                        } else {
                            str2 = str7;
                        }
                        List list2 = (List) hashMap.get(d);
                        if (list2 == null) {
                            i9 = 0;
                            ltVar = null;
                        } else if (list2.size() > 1) {
                            String string2 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + d, null);
                            lt ltVar6 = (lt) j3.r0.k(1, list2);
                            if (string2 != null) {
                                int size3 = arrayList.size();
                                int i17 = 0;
                                while (i17 < size3) {
                                    Object obj5 = arrayList.get(i17);
                                    i17++;
                                    ltVar = (lt) obj5;
                                    if (Objects.equals(ltVar.d, string2)) {
                                        i9 = 0;
                                    }
                                }
                            }
                            ltVar = ltVar6;
                            i9 = 0;
                        } else {
                            i9 = 0;
                            ltVar = (lt) list2.get(0);
                        }
                        if (ltVar != null) {
                            eg0Var.D = true;
                            eg0Var.y = ltVar;
                            eg0Var.v(d, ltVar);
                            eg0Var.x = i9;
                        } else {
                            eg0Var.setCountryButtonText(null);
                            bg0Var.setHintText((String) null);
                            eg0Var.x = 2;
                        }
                        if (!z10) {
                            kj0Var.setSelection(kj0Var.getText().length());
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
                nj0 nj0Var = (nj0) this.b;
                HashMap hashMap2 = nj0Var.x;
                ArrayList arrayList2 = nj0Var.w;
                if (!nj0Var.A) {
                    nj0Var.A = true;
                    String d9 = ne.b.d(nj0Var.K.getText().toString(), false);
                    nj0Var.K.setText(d9);
                    String str8 = null;
                    if (d9.length() == 0) {
                        nj0Var.t(null);
                        nj0Var.M.setHintText((String) null);
                    } else {
                        int i18 = 4;
                        if (d9.length() > 4) {
                            while (true) {
                                if (i18 >= 1) {
                                    str4 = d9.substring(0, i18);
                                    List list3 = (List) hashMap2.get(str4);
                                    Object obj6 = str8;
                                    if (list3 != null) {
                                        if (list3.size() > 1) {
                                            String string3 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + str4, str8);
                                            Object obj7 = (lt) j3.r0.k(1, list3);
                                            if (string3 != null) {
                                                int size4 = arrayList2.size();
                                                int i19 = 0;
                                                while (true) {
                                                    if (i19 < size4) {
                                                        Object obj8 = arrayList2.get(i19);
                                                        i19++;
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
                                        str5 = d9.substring(i18) + nj0Var.M.getText().toString();
                                        nj0Var.K.setText(str4);
                                        z11 = true;
                                    } else {
                                        i18--;
                                        str8 = null;
                                    }
                                } else {
                                    str4 = d9;
                                    str5 = null;
                                    z11 = false;
                                }
                            }
                            if (!z11) {
                                str5 = str4.substring(1) + nj0Var.M.getText().toString();
                                kj0 kj0Var2 = nj0Var.K;
                                str4 = str4.substring(0, 1);
                                kj0Var2.setText(str4);
                            }
                        } else {
                            str4 = d9;
                            str5 = null;
                            z11 = false;
                        }
                        int size5 = arrayList2.size();
                        lt ltVar8 = null;
                        int i20 = 0;
                        int i21 = 0;
                        while (i21 < size5) {
                            Object obj9 = arrayList2.get(i21);
                            i21++;
                            lt ltVar9 = (lt) obj9;
                            if (ltVar9.c.startsWith(str4)) {
                                i20++;
                                if (ltVar9.c.equals(str4)) {
                                    ltVar8 = ltVar9;
                                }
                            }
                        }
                        if (i20 == 1 && ltVar8 != null && str5 == null) {
                            str5 = str4.substring(ltVar8.c.length()) + nj0Var.M.getText().toString();
                            kj0 kj0Var3 = nj0Var.K;
                            String str9 = ltVar8.c;
                            kj0Var3.setText(str9);
                            str4 = str9;
                        }
                        List list4 = (List) hashMap2.get(str4);
                        if (list4 == null) {
                            ltVar2 = null;
                        } else if (list4.size() > 1) {
                            String string4 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + str4, null);
                            lt ltVar10 = (lt) j3.r0.k(1, list4);
                            if (string4 != null) {
                                int size6 = arrayList2.size();
                                int i22 = 0;
                                while (i22 < size6) {
                                    Object obj10 = arrayList2.get(i22);
                                    i22++;
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
                            nj0Var.C = true;
                            nj0Var.u(str4, ltVar2);
                        } else {
                            nj0Var.t(null);
                            nj0Var.M.setHintText((String) null);
                        }
                        if (!z11) {
                            kj0 kj0Var4 = nj0Var.K;
                            kj0Var4.setSelection(kj0Var4.getText().length());
                        }
                        if (str5 != null && str5.length() != 0) {
                            nj0Var.M.requestFocus();
                            nj0Var.M.setText(str5);
                            kj0 kj0Var5 = nj0Var.M;
                            kj0Var5.setSelection(kj0Var5.length());
                        }
                    }
                    nj0Var.A = false;
                    nj0.q(nj0Var);
                    break;
                }
                break;
            case 12:
                wm0 wm0Var = (wm0) this.b;
                if (!wm0Var.V0 && wm0Var.P0 != 0 && wm0Var.U[0].length() == wm0Var.P0) {
                    wm0Var.H.callOnClick();
                    break;
                }
                break;
            case 13:
                co0 co0Var = (co0) this.b;
                if (co0Var.Y != 0 && editable.length() == co0Var.Y) {
                    co0Var.z0(false);
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
                s41 s41Var = (s41) this.b;
                fh.s sVar = s41Var.h;
                String obj11 = (sVar.getText() == null || AndroidUtilities.trim(sVar.getText(), null).length() == 0) ? null : sVar.getText().toString();
                s41Var.y.v(obj11, true, true);
                p51 p51Var = s41Var.n;
                if (p51Var != null) {
                    p51Var.F1(null);
                    s41Var.n.G1(TextUtils.isEmpty(obj11), true);
                }
                if (sVar != null) {
                    sVar.clearAnimation();
                    sVar.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.gr.h).start();
                }
                s41Var.c(false);
                break;
            case 16:
                String trim = editable.toString().trim();
                rd1 rd1Var = (rd1) this.b;
                String str10 = rd1Var.n;
                if (trim.length() > 0) {
                    rd1Var.n = trim.substring(0, 1).toUpperCase();
                } else {
                    rd1Var.n = "";
                }
                if (!str10.equals(rd1Var.n)) {
                    org.telegram.ui.Components.u70 u70Var = new org.telegram.ui.Components.u70(1, null);
                    u70Var.a(rd1Var.n);
                    org.telegram.ui.Components.bl0 bl0Var = rd1Var.v;
                    if (bl0Var != null) {
                        bl0Var.b(u70Var, true);
                        break;
                    }
                }
                break;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                gf1 gf1Var = twoStepVerificationActivity.R;
                if (twoStepVerificationActivity.Q) {
                    AndroidUtilities.cancelRunOnUIThread(gf1Var);
                    gf1Var.run();
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        int i12 = this.a;
        Object obj = this.b;
        switch (i12) {
            case 5:
                qr qrVar = (qr) obj;
                qrVar.x = charSequence.length() != 0;
                qrVar.v = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                qrVar.B = ofFloat;
                ofFloat.addUpdateListener(new f3(qrVar, 9));
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
                hd0 hd0Var = pd0Var.O;
                if (pd0Var.N) {
                    pd0Var.removeCallbacks(hd0Var);
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
                ve0 ve0Var = jf0Var.n0;
                if (jf0Var.m0) {
                    jf0Var.removeCallbacks(ve0Var);
                    ve0Var.run();
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        switch (this.a) {
            case 1:
                id idVar = (id) this.b;
                idVar.c0(idVar.w.getText().toString());
                break;
            case 3:
                vo voVar = (vo) this.b;
                if (!voVar.i0) {
                    String obj = voVar.a.getText().toString();
                    ja jaVar = voVar.K;
                    if (jaVar != null) {
                        jaVar.b(obj);
                    }
                    voVar.V(obj);
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

    private final void A(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void B(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void C(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void D(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void E(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void F(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void G(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void H(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void I(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void g(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void h(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void i(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void j(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void k(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void l(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void m(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void n(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void o(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void p(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void q(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void r(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void s(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void t(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void u(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void v(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void w(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void x(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void y(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void z(int i9, int i10, int i11, CharSequence charSequence) {
    }
}
