package org.telegram.ui;

import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:191:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0515  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.web.j jVar;
        int i10;
        org.telegram.ui.ActionBar.i5 i5Var;
        org.telegram.ui.ActionBar.i5 i5Var2;
        org.telegram.ui.ActionBar.i5 i5Var3;
        String str;
        String str2;
        boolean z10;
        int i11;
        nt ntVar;
        boolean z11;
        nt ntVar2;
        boolean z12;
        String str3;
        nt ntVar3;
        Object obj;
        int i12 = this.a;
        int i13 = 4;
        int i14 = 3;
        int i15 = 0;
        String str4 = null;
        int i16 = 1;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                h4 h4Var = (h4) obj2;
                if (h4Var.h0.W && (jVar = h4Var.i0) != null) {
                    jVar.setInput(editable == null ? null : editable.toString());
                    break;
                }
                break;
            case 1:
                oa oaVar = ((ia) obj2).c;
                if (oaVar.r.startsWith("@")) {
                    oaVar.r = oaVar.r.substring(1);
                }
                if (oaVar.r.length() > 0) {
                    StringBuilder sb2 = new StringBuilder("https://");
                    i10 = ((org.telegram.ui.ActionBar.k2) oaVar).currentAccount;
                    sb2.append(org.telegram.messenger.vp.r1(i10).U2);
                    sb2.append("/");
                    sb2.append(oaVar.r);
                    String sb3 = sb2.toString();
                    String a02 = org.telegram.messenger.cd.a0("UsernameHelpLink", null, 2131743685, sb3);
                    int indexOf = a02.indexOf(sb3);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a02);
                    if (indexOf >= 0) {
                        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.h(oaVar, sb3, i14), indexOf, sb3.length() + indexOf, 33);
                        break;
                    }
                }
                break;
            case 2:
                break;
            case 3:
                oo ooVar = (oo) obj2;
                ooVar.r.k(5L, ooVar.w.getText().toString(), null, null);
                ag.d2 d2Var = ooVar.e;
                if (d2Var != null) {
                    d2Var.invalidate();
                    break;
                }
                break;
            case 4:
                ((cp) obj2).a0();
                break;
            case 5:
                hq hqVar = (hq) obj2;
                iq iqVar = hqVar.e;
                if (!hqVar.d) {
                    iqVar.S = editable.toString();
                    s4.c1 K = iqVar.b.K(iqVar.u0);
                    if (K != null) {
                        iq.j0(iqVar, K.a);
                        break;
                    }
                }
                break;
            case 6:
                break;
            case 7:
                i00 i00Var = ((f00) obj2).e;
                if (!TextUtils.equals(editable, i00Var.x)) {
                    i00Var.n = !TextUtils.isEmpty(editable);
                    i00Var.x = org.telegram.ui.Components.o5.onlyEmojiSpans(editable);
                    yz yzVar = i00Var.I;
                    if (yzVar != null) {
                        yzVar.e(org.telegram.ui.Components.o5.cloneSpans(i00Var.x, -1, yzVar.s.getPaint().getFontMetricsInt(), 0.5f), true);
                    }
                    zz zzVar = i00Var.J;
                    if (zzVar != null) {
                        org.telegram.ui.Cells.y3 y3Var = zzVar.r;
                        if (i00.p0(i00Var.x)) {
                            str = org.telegram.messenger.cd.L0(i00Var.y ? 2131750736 : 2131750735, null);
                        } else {
                            str = null;
                        }
                        y3Var.setText(str);
                    }
                    if (i00Var.s && TextUtils.isEmpty(i00Var.x)) {
                        i5Var3 = ((org.telegram.ui.ActionBar.k2) i00Var).simpleActionBar;
                        i5Var3.setTitle(org.telegram.messenger.cd.L0(2131750729, null));
                    } else {
                        i5Var = ((org.telegram.ui.ActionBar.k2) i00Var).simpleActionBar;
                        CharSequence charSequence = i00Var.x;
                        i5Var2 = ((org.telegram.ui.ActionBar.k2) i00Var).simpleActionBar;
                        i5Var.setTitle(org.telegram.ui.Components.o5.cloneSpans(charSequence, -1, i5Var2.getTitleFontMetricsInt()));
                    }
                }
                i00Var.n0(true);
                break;
            case 8:
                v50 v50Var = (v50) obj2;
                if (v50Var.f.r.length() == 0) {
                    v50Var.T = false;
                    v50Var.S = false;
                    t50 t50Var = v50Var.w;
                    if (t50Var.n) {
                        t50Var.n = false;
                        t50Var.f();
                    }
                    v50Var.w.L(null);
                    v50Var.n.setFastScrollVisible(true);
                    v50Var.n.setVerticalScrollBarEnabled(false);
                    v50Var.u0(0);
                    break;
                } else {
                    t50 t50Var2 = v50Var.w;
                    boolean z13 = t50Var2.n;
                    if (!z13) {
                        v50Var.T = true;
                        v50Var.S = true;
                        if (!z13) {
                            t50Var2.n = true;
                            t50Var2.f();
                        }
                        v50Var.n.setFastScrollVisible(false);
                        v50Var.n.setVerticalScrollBarEnabled(true);
                    }
                    v50Var.w.L(v50Var.f.r.getText().toString());
                    v50Var.s.e(true, false);
                    break;
                }
            case 9:
            case 10:
            case 11:
                break;
            case 12:
                gf0 gf0Var = (gf0) obj2;
                HashMap hashMap = gf0Var.H;
                ArrayList arrayList = gf0Var.G;
                ef0 ef0Var = gf0Var.a;
                ef0 ef0Var2 = gf0Var.b;
                if (!gf0Var.K) {
                    gf0Var.K = true;
                    String d = af.b.d(ef0Var.getText().toString(), false);
                    ef0Var.setText(d);
                    if (d.length() == 0) {
                        gf0Var.setCountryButtonText(null);
                        ef0Var2.setHintText((String) null);
                        gf0Var.E = 1;
                        z11 = false;
                    } else {
                        if (d.length() > 4) {
                            while (true) {
                                if (i13 >= i16) {
                                    String substring = d.substring(i15, i13);
                                    List list = (List) hashMap.get(substring);
                                    if (list == null) {
                                        ntVar2 = null;
                                    } else if (list.size() > i16) {
                                        String string = org.telegram.messenger.vp.d1().getString("phone_code_last_matched_" + substring, null);
                                        ntVar2 = (nt) sc.e.g(i16, list);
                                        if (string != null) {
                                            int size = arrayList.size();
                                            int i17 = i15;
                                            while (true) {
                                                if (i17 < size) {
                                                    Object obj3 = arrayList.get(i17);
                                                    i17++;
                                                    nt ntVar4 = (nt) obj3;
                                                    if (Objects.equals(ntVar4.d, string)) {
                                                        ntVar2 = ntVar4;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        ntVar2 = (nt) list.get(i15);
                                    }
                                    if (ntVar2 != null) {
                                        str2 = d.substring(i13) + ef0Var2.getText().toString();
                                        ef0Var.setText(substring);
                                        d = substring;
                                        z10 = true;
                                    } else {
                                        i13--;
                                        i15 = 0;
                                        i16 = 1;
                                    }
                                } else {
                                    str2 = null;
                                    z10 = false;
                                }
                            }
                            if (!z10) {
                                str2 = d.substring(1) + ef0Var2.getText().toString();
                                d = d.substring(0, 1);
                                ef0Var.setText(d);
                            }
                        } else {
                            str2 = null;
                            z10 = false;
                        }
                        int size2 = arrayList.size();
                        nt ntVar5 = null;
                        int i18 = 0;
                        int i19 = 0;
                        while (i19 < size2) {
                            Object obj4 = arrayList.get(i19);
                            i19++;
                            nt ntVar6 = (nt) obj4;
                            if (ntVar6.c.startsWith(d)) {
                                int i20 = i18 + 1;
                                if (ntVar6.c.equals(d)) {
                                    if (ntVar5 == null || !ntVar5.c.equals(ntVar6.c)) {
                                        i18 = i20;
                                    }
                                    ntVar5 = ntVar6;
                                } else {
                                    i18 = i20;
                                }
                            }
                        }
                        if (i18 == 1 && ntVar5 != null && str2 == null) {
                            str2 = d.substring(ntVar5.c.length()) + ef0Var2.getText().toString();
                            d = ntVar5.c;
                            ef0Var.setText(d);
                        }
                        List list2 = (List) hashMap.get(d);
                        if (list2 == null) {
                            ntVar = null;
                        } else if (list2.size() > 1) {
                            String string2 = org.telegram.messenger.vp.d1().getString("phone_code_last_matched_" + d, null);
                            ntVar = (nt) sc.e.g(1, list2);
                            if (string2 != null) {
                                int size3 = arrayList.size();
                                int i21 = 0;
                                while (true) {
                                    if (i21 < size3) {
                                        Object obj5 = arrayList.get(i21);
                                        i21++;
                                        nt ntVar7 = (nt) obj5;
                                        if (Objects.equals(ntVar7.d, string2)) {
                                            ntVar = ntVar7;
                                        }
                                    }
                                }
                            }
                        } else {
                            i11 = 0;
                            ntVar = (nt) list2.get(0);
                            if (ntVar == null) {
                                gf0Var.J = true;
                                gf0Var.F = ntVar;
                                gf0Var.s(d, ntVar);
                                gf0Var.E = i11;
                            } else {
                                gf0Var.setCountryButtonText(null);
                                ef0Var2.setHintText((String) null);
                                gf0Var.E = 2;
                            }
                            if (!z10) {
                                ef0Var.setSelection(ef0Var.getText().length());
                            }
                            if (str2 != null) {
                                ef0Var2.requestFocus();
                                ef0Var2.setText(str2);
                                ef0Var2.setSelection(ef0Var2.length());
                            }
                            z11 = false;
                        }
                        i11 = 0;
                        if (ntVar == null) {
                        }
                        if (!z10) {
                        }
                        if (str2 != null) {
                        }
                        z11 = false;
                    }
                    gf0Var.K = z11;
                    break;
                }
                break;
            case 13:
                gi0 gi0Var = (gi0) obj2;
                HashMap hashMap2 = gi0Var.s1;
                ArrayList arrayList2 = gi0Var.r1;
                if (!gi0Var.u1) {
                    gi0Var.u1 = true;
                    String d10 = af.b.d(gi0Var.E1.getText().toString(), false);
                    gi0Var.E1.setText(d10);
                    if (d10.length() == 0) {
                        gi0Var.L0(null);
                        gi0Var.G1.setHintText((String) null);
                    } else {
                        if (d10.length() > 4) {
                            while (true) {
                                if (i13 >= 1) {
                                    String substring2 = d10.substring(0, i13);
                                    List list3 = (List) hashMap2.get(substring2);
                                    if (list3 == null) {
                                        obj = str4;
                                    } else if (list3.size() > 1) {
                                        String string3 = org.telegram.messenger.vp.d1().getString("phone_code_last_matched_" + substring2, str4);
                                        obj = (nt) sc.e.g(1, list3);
                                        if (string3 != null) {
                                            int size4 = arrayList2.size();
                                            int i22 = 0;
                                            while (true) {
                                                if (i22 < size4) {
                                                    Object obj6 = arrayList2.get(i22);
                                                    i22++;
                                                    nt ntVar8 = (nt) obj6;
                                                    if (Objects.equals(ntVar8.d, string3)) {
                                                        obj = ntVar8;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        obj = (nt) list3.get(0);
                                    }
                                    if (obj != null) {
                                        str3 = d10.substring(i13) + gi0Var.G1.getText().toString();
                                        gi0Var.E1.setText(substring2);
                                        d10 = substring2;
                                        z12 = true;
                                    } else {
                                        i13--;
                                        str4 = null;
                                    }
                                } else {
                                    z12 = false;
                                    str3 = null;
                                }
                            }
                            if (!z12) {
                                str3 = d10.substring(1) + gi0Var.G1.getText().toString();
                                fi0 fi0Var = gi0Var.E1;
                                d10 = d10.substring(0, 1);
                                fi0Var.setText(d10);
                            }
                        } else {
                            z12 = false;
                            str3 = null;
                        }
                        int size5 = arrayList2.size();
                        int i23 = 0;
                        int i24 = 0;
                        nt ntVar9 = null;
                        while (i24 < size5) {
                            Object obj7 = arrayList2.get(i24);
                            i24++;
                            nt ntVar10 = (nt) obj7;
                            if (ntVar10.c.startsWith(d10)) {
                                i23++;
                                if (ntVar10.c.equals(d10)) {
                                    ntVar9 = ntVar10;
                                }
                            }
                        }
                        if (i23 == 1 && ntVar9 != null && str3 == null) {
                            str3 = d10.substring(ntVar9.c.length()) + gi0Var.G1.getText().toString();
                            fi0 fi0Var2 = gi0Var.E1;
                            String str5 = ntVar9.c;
                            fi0Var2.setText(str5);
                            d10 = str5;
                        }
                        List list4 = (List) hashMap2.get(d10);
                        if (list4 == null) {
                            ntVar3 = null;
                        } else if (list4.size() > 1) {
                            String string4 = org.telegram.messenger.vp.d1().getString("phone_code_last_matched_" + d10, null);
                            ntVar3 = (nt) sc.e.g(1, list4);
                            if (string4 != null) {
                                int size6 = arrayList2.size();
                                int i25 = 0;
                                while (true) {
                                    if (i25 < size6) {
                                        Object obj8 = arrayList2.get(i25);
                                        i25++;
                                        nt ntVar11 = (nt) obj8;
                                        if (Objects.equals(ntVar11.d, string4)) {
                                            ntVar3 = ntVar11;
                                        }
                                    }
                                }
                            }
                        } else {
                            ntVar3 = (nt) list4.get(0);
                        }
                        if (ntVar3 != null) {
                            gi0Var.w1 = true;
                            gi0Var.M0(d10, ntVar3);
                        } else {
                            gi0Var.L0(null);
                            gi0Var.G1.setHintText((String) null);
                        }
                        if (!z12) {
                            fi0 fi0Var3 = gi0Var.E1;
                            fi0Var3.setSelection(fi0Var3.getText().length());
                        }
                        if (str3 != null && str3.length() != 0) {
                            gi0Var.G1.requestFocus();
                            gi0Var.G1.setText(str3);
                            fi0 fi0Var4 = gi0Var.G1;
                            fi0Var4.setSelection(fi0Var4.length());
                        }
                    }
                    gi0Var.u1 = false;
                    gi0.I0(gi0Var);
                    break;
                }
                break;
            case 14:
                ko0 ko0Var = ((lo0) obj2).s0;
                if (ko0Var != null) {
                    ko0Var.B(editable);
                    break;
                }
                break;
            case 15:
                a21 a21Var = (a21) obj2;
                ih.b bVar = a21Var.h;
                String obj9 = (bVar.getText() == null || org.telegram.messenger.i0.O3(bVar.getText(), null).length() == 0) ? null : bVar.getText().toString();
                a21Var.F.v(obj9, true, true);
                x21 x21Var = a21Var.n;
                if (x21Var != null) {
                    x21Var.I1(null);
                    a21Var.n.J1(TextUtils.isEmpty(obj9), true);
                }
                if (bVar != null) {
                    bVar.clearAnimation();
                    bVar.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.gr.h).start();
                }
                a21Var.c(false);
                break;
            case 16:
                p91 p91Var = (p91) obj2;
                if (!p91Var.H) {
                    if (p91Var.a.length() <= 0) {
                        p91Var.d.setText(p91Var.G);
                        break;
                    } else {
                        String str6 = "https://" + p91Var.getMessagesController().U2 + "/addtheme/" + ((Object) p91Var.a.getText());
                        String a03 = org.telegram.messenger.cd.a0("ThemeHelpLink", null, 2131744206, str6);
                        int indexOf2 = a03.indexOf(str6);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(a03);
                        if (indexOf2 >= 0) {
                            spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.h(p91Var, str6, 10), indexOf2, str6.length() + indexOf2, 33);
                        }
                        p91Var.d.setText(TextUtils.concat(p91Var.G, "\n\n", spannableStringBuilder2));
                        break;
                    }
                }
                break;
            case 17:
                String trim = editable.toString().trim();
                la1 la1Var = (la1) obj2;
                String str7 = la1Var.n;
                if (trim.length() > 0) {
                    la1Var.n = trim.substring(0, 1).toUpperCase();
                } else {
                    la1Var.n = "";
                }
                if (!str7.equals(la1Var.n)) {
                    org.telegram.ui.Components.z70 z70Var = new org.telegram.ui.Components.z70(1, null);
                    z70Var.a(la1Var.n);
                    org.telegram.ui.Components.bl0 bl0Var = la1Var.w;
                    if (bl0Var != null) {
                        bl0Var.b(z70Var, true);
                        break;
                    }
                }
                break;
            case 18:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj2;
                yb1 yb1Var = twoStepVerificationActivity.V;
                if (twoStepVerificationActivity.U) {
                    org.telegram.messenger.i0.r(yb1Var);
                    yb1Var.run();
                    break;
                }
                break;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) obj2;
                if (usersSelectActivity.c.length() == 0) {
                    usersSelectActivity.M = false;
                    usersSelectActivity.L = false;
                    fd1 fd1Var = usersSelectActivity.h;
                    if (fd1Var.n) {
                        fd1Var.n = false;
                        fd1Var.f();
                    }
                    usersSelectActivity.h.L(null);
                    usersSelectActivity.d.setFastScrollVisible(true);
                    usersSelectActivity.d.setVerticalScrollBarEnabled(false);
                    usersSelectActivity.f.d.setText(org.telegram.messenger.cd.L0(2131748240, null));
                    break;
                } else {
                    fd1 fd1Var2 = usersSelectActivity.h;
                    boolean z14 = fd1Var2.n;
                    if (!z14) {
                        usersSelectActivity.M = true;
                        usersSelectActivity.L = true;
                        if (!z14) {
                            fd1Var2.n = true;
                            fd1Var2.f();
                        }
                        usersSelectActivity.d.setFastScrollVisible(false);
                        usersSelectActivity.d.setVerticalScrollBarEnabled(true);
                        usersSelectActivity.f.d.setText(org.telegram.messenger.cd.L0(2131748183, null));
                    }
                    usersSelectActivity.f.e(true, true);
                    usersSelectActivity.h.L(usersSelectActivity.c.getText().toString());
                    break;
                }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.a;
        Object obj = this.b;
        switch (i13) {
            case 1:
                ia iaVar = (ia) obj;
                oa oaVar = iaVar.c;
                String str = oaVar.r;
                oaVar.r = charSequence == null ? "" : charSequence.toString();
                oa oaVar2 = iaVar.c;
                la laVar = oaVar2.E;
                if (laVar != null && str != null) {
                    laVar.b(oaVar2.r);
                    break;
                }
                break;
            case 6:
                xr xrVar = (xr) obj;
                xrVar.R1 = charSequence.length() != 0;
                xrVar.P1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                xrVar.U1 = ofFloat;
                ofFloat.addUpdateListener(new a3(xrVar, 8));
                if (xrVar.R1) {
                    xrVar.U1.setDuration(220L);
                } else {
                    org.telegram.messenger.z20.j(1.5f, xrVar.U1);
                    xrVar.U1.setDuration(350L);
                }
                xrVar.U1.start();
                xrVar.m();
                break;
            case 9:
                wc0 wc0Var = (wc0) obj;
                qc0 qc0Var = wc0Var.S;
                if (wc0Var.R) {
                    wc0Var.removeCallbacks(qc0Var);
                    qc0Var.run();
                    break;
                }
                break;
            case 10:
                od0 od0Var = (od0) obj;
                md0 md0Var = od0Var.y;
                if (od0Var.x) {
                    od0Var.removeCallbacks(md0Var);
                    md0Var.run();
                    break;
                }
                break;
            case 11:
                me0 me0Var = (me0) obj;
                ae0 ae0Var = me0Var.t0;
                if (me0Var.s0) {
                    me0Var.removeCallbacks(ae0Var);
                    ae0Var.run();
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.a) {
            case 1:
                ia iaVar = (ia) this.b;
                oa oaVar = iaVar.c;
                String str = oaVar.r;
                oaVar.r = charSequence == null ? "" : charSequence.toString();
                oa oaVar2 = iaVar.c;
                la laVar = oaVar2.E;
                if (laVar != null && str != null) {
                    laVar.b(oaVar2.r);
                }
                if (!oaVar.n) {
                    oaVar.h0(oaVar.r);
                    break;
                }
                break;
            case 2:
                kd kdVar = (kd) this.b;
                kdVar.i0(kdVar.y.getText().toString());
                break;
            case 4:
                cp cpVar = (cp) this.b;
                if (!cpVar.m0) {
                    String obj = cpVar.b.getText().toString();
                    la laVar2 = cpVar.O;
                    if (laVar2 != null) {
                        laVar2.b(obj);
                    }
                    cpVar.b0(obj);
                    break;
                }
                break;
            case 16:
                p91 p91Var = (p91) this.b;
                if (!p91Var.F) {
                    p91Var.d0(p91Var.a.getText().toString(), false);
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

    private final void J(int i10, int i11, int i12, CharSequence charSequence) {
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
