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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
        mt mtVar;
        boolean z11;
        mt mtVar2;
        boolean z12;
        String str3;
        mt mtVar3;
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
                    sb2.append(org.telegram.messenger.wp.r1(i10).U2);
                    sb2.append("/");
                    sb2.append(oaVar.r);
                    String sb3 = sb2.toString();
                    String a02 = org.telegram.messenger.dd.a0("UsernameHelpLink", null, 2131743685, sb3);
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
                ((cp) obj2).b0();
                break;
            case 5:
                hq hqVar = (hq) obj2;
                iq iqVar = hqVar.e;
                if (!hqVar.d) {
                    iqVar.S = editable.toString();
                    s4.c1 K = iqVar.b.K(iqVar.u0);
                    if (K != null) {
                        iq.k0(iqVar, K.a);
                        break;
                    }
                }
                break;
            case 6:
                break;
            case 7:
                h00 h00Var = ((e00) obj2).e;
                if (!TextUtils.equals(editable, h00Var.x)) {
                    h00Var.n = !TextUtils.isEmpty(editable);
                    h00Var.x = org.telegram.ui.Components.o5.onlyEmojiSpans(editable);
                    xz xzVar = h00Var.I;
                    if (xzVar != null) {
                        xzVar.e(org.telegram.ui.Components.o5.cloneSpans(h00Var.x, -1, xzVar.s.getPaint().getFontMetricsInt(), 0.5f), true);
                    }
                    yz yzVar = h00Var.J;
                    if (yzVar != null) {
                        org.telegram.ui.Cells.y3 y3Var = yzVar.r;
                        if (h00.q0(h00Var.x)) {
                            str = org.telegram.messenger.dd.L0(h00Var.y ? 2131750736 : 2131750735, null);
                        } else {
                            str = null;
                        }
                        y3Var.setText(str);
                    }
                    if (h00Var.s && TextUtils.isEmpty(h00Var.x)) {
                        i5Var3 = ((org.telegram.ui.ActionBar.k2) h00Var).simpleActionBar;
                        i5Var3.setTitle(org.telegram.messenger.dd.L0(2131750729, null));
                    } else {
                        i5Var = ((org.telegram.ui.ActionBar.k2) h00Var).simpleActionBar;
                        CharSequence charSequence = h00Var.x;
                        i5Var2 = ((org.telegram.ui.ActionBar.k2) h00Var).simpleActionBar;
                        i5Var.setTitle(org.telegram.ui.Components.o5.cloneSpans(charSequence, -1, i5Var2.getTitleFontMetricsInt()));
                    }
                }
                h00Var.o0(true);
                break;
            case 8:
                u50 u50Var = (u50) obj2;
                if (u50Var.f.r.length() == 0) {
                    u50Var.T = false;
                    u50Var.S = false;
                    s50 s50Var = u50Var.w;
                    if (s50Var.n) {
                        s50Var.n = false;
                        s50Var.f();
                    }
                    u50Var.w.L(null);
                    u50Var.n.setFastScrollVisible(true);
                    u50Var.n.setVerticalScrollBarEnabled(false);
                    u50Var.v0(0);
                    break;
                } else {
                    s50 s50Var2 = u50Var.w;
                    boolean z13 = s50Var2.n;
                    if (!z13) {
                        u50Var.T = true;
                        u50Var.S = true;
                        if (!z13) {
                            s50Var2.n = true;
                            s50Var2.f();
                        }
                        u50Var.n.setFastScrollVisible(false);
                        u50Var.n.setVerticalScrollBarEnabled(true);
                    }
                    u50Var.w.L(u50Var.f.r.getText().toString());
                    u50Var.s.e(true, false);
                    break;
                }
            case 9:
            case 10:
            case 11:
                break;
            case 12:
                ff0 ff0Var = (ff0) obj2;
                HashMap hashMap = ff0Var.H;
                ArrayList arrayList = ff0Var.G;
                df0 df0Var = ff0Var.a;
                df0 df0Var2 = ff0Var.b;
                if (!ff0Var.K) {
                    ff0Var.K = true;
                    String d = af.b.d(df0Var.getText().toString(), false);
                    df0Var.setText(d);
                    if (d.length() == 0) {
                        ff0Var.setCountryButtonText(null);
                        df0Var2.setHintText((String) null);
                        ff0Var.E = 1;
                        z11 = false;
                    } else {
                        if (d.length() > 4) {
                            while (true) {
                                if (i13 >= i16) {
                                    String substring = d.substring(i15, i13);
                                    List list = (List) hashMap.get(substring);
                                    if (list == null) {
                                        mtVar2 = null;
                                    } else if (list.size() > i16) {
                                        String string = org.telegram.messenger.wp.d1().getString("phone_code_last_matched_" + substring, null);
                                        mtVar2 = (mt) sc.e.g(i16, list);
                                        if (string != null) {
                                            int size = arrayList.size();
                                            int i17 = i15;
                                            while (true) {
                                                if (i17 < size) {
                                                    Object obj3 = arrayList.get(i17);
                                                    i17++;
                                                    mt mtVar4 = (mt) obj3;
                                                    if (Objects.equals(mtVar4.d, string)) {
                                                        mtVar2 = mtVar4;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        mtVar2 = (mt) list.get(i15);
                                    }
                                    if (mtVar2 != null) {
                                        str2 = d.substring(i13) + df0Var2.getText().toString();
                                        df0Var.setText(substring);
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
                                str2 = d.substring(1) + df0Var2.getText().toString();
                                d = d.substring(0, 1);
                                df0Var.setText(d);
                            }
                        } else {
                            str2 = null;
                            z10 = false;
                        }
                        int size2 = arrayList.size();
                        mt mtVar5 = null;
                        int i18 = 0;
                        int i19 = 0;
                        while (i19 < size2) {
                            Object obj4 = arrayList.get(i19);
                            i19++;
                            mt mtVar6 = (mt) obj4;
                            if (mtVar6.c.startsWith(d)) {
                                int i20 = i18 + 1;
                                if (mtVar6.c.equals(d)) {
                                    if (mtVar5 == null || !mtVar5.c.equals(mtVar6.c)) {
                                        i18 = i20;
                                    }
                                    mtVar5 = mtVar6;
                                } else {
                                    i18 = i20;
                                }
                            }
                        }
                        if (i18 == 1 && mtVar5 != null && str2 == null) {
                            str2 = d.substring(mtVar5.c.length()) + df0Var2.getText().toString();
                            d = mtVar5.c;
                            df0Var.setText(d);
                        }
                        List list2 = (List) hashMap.get(d);
                        if (list2 == null) {
                            mtVar = null;
                        } else if (list2.size() > 1) {
                            String string2 = org.telegram.messenger.wp.d1().getString("phone_code_last_matched_" + d, null);
                            mtVar = (mt) sc.e.g(1, list2);
                            if (string2 != null) {
                                int size3 = arrayList.size();
                                int i21 = 0;
                                while (true) {
                                    if (i21 < size3) {
                                        Object obj5 = arrayList.get(i21);
                                        i21++;
                                        mt mtVar7 = (mt) obj5;
                                        if (Objects.equals(mtVar7.d, string2)) {
                                            mtVar = mtVar7;
                                        }
                                    }
                                }
                            }
                        } else {
                            i11 = 0;
                            mtVar = (mt) list2.get(0);
                            if (mtVar == null) {
                                ff0Var.J = true;
                                ff0Var.F = mtVar;
                                ff0Var.s(d, mtVar);
                                ff0Var.E = i11;
                            } else {
                                ff0Var.setCountryButtonText(null);
                                df0Var2.setHintText((String) null);
                                ff0Var.E = 2;
                            }
                            if (!z10) {
                                df0Var.setSelection(df0Var.getText().length());
                            }
                            if (str2 != null) {
                                df0Var2.requestFocus();
                                df0Var2.setText(str2);
                                df0Var2.setSelection(df0Var2.length());
                            }
                            z11 = false;
                        }
                        i11 = 0;
                        if (mtVar == null) {
                        }
                        if (!z10) {
                        }
                        if (str2 != null) {
                        }
                        z11 = false;
                    }
                    ff0Var.K = z11;
                    break;
                }
                break;
            case 13:
                ei0 ei0Var = (ei0) obj2;
                HashMap hashMap2 = ei0Var.s1;
                ArrayList arrayList2 = ei0Var.r1;
                if (!ei0Var.u1) {
                    ei0Var.u1 = true;
                    String d10 = af.b.d(ei0Var.E1.getText().toString(), false);
                    ei0Var.E1.setText(d10);
                    if (d10.length() == 0) {
                        ei0Var.L0(null);
                        ei0Var.G1.setHintText((String) null);
                    } else {
                        if (d10.length() > 4) {
                            while (true) {
                                if (i13 >= 1) {
                                    String substring2 = d10.substring(0, i13);
                                    List list3 = (List) hashMap2.get(substring2);
                                    if (list3 == null) {
                                        obj = str4;
                                    } else if (list3.size() > 1) {
                                        String string3 = org.telegram.messenger.wp.d1().getString("phone_code_last_matched_" + substring2, str4);
                                        obj = (mt) sc.e.g(1, list3);
                                        if (string3 != null) {
                                            int size4 = arrayList2.size();
                                            int i22 = 0;
                                            while (true) {
                                                if (i22 < size4) {
                                                    Object obj6 = arrayList2.get(i22);
                                                    i22++;
                                                    mt mtVar8 = (mt) obj6;
                                                    if (Objects.equals(mtVar8.d, string3)) {
                                                        obj = mtVar8;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        obj = (mt) list3.get(0);
                                    }
                                    if (obj != null) {
                                        str3 = d10.substring(i13) + ei0Var.G1.getText().toString();
                                        ei0Var.E1.setText(substring2);
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
                                str3 = d10.substring(1) + ei0Var.G1.getText().toString();
                                di0 di0Var = ei0Var.E1;
                                d10 = d10.substring(0, 1);
                                di0Var.setText(d10);
                            }
                        } else {
                            z12 = false;
                            str3 = null;
                        }
                        int size5 = arrayList2.size();
                        int i23 = 0;
                        int i24 = 0;
                        mt mtVar9 = null;
                        while (i24 < size5) {
                            Object obj7 = arrayList2.get(i24);
                            i24++;
                            mt mtVar10 = (mt) obj7;
                            if (mtVar10.c.startsWith(d10)) {
                                i23++;
                                if (mtVar10.c.equals(d10)) {
                                    mtVar9 = mtVar10;
                                }
                            }
                        }
                        if (i23 == 1 && mtVar9 != null && str3 == null) {
                            str3 = d10.substring(mtVar9.c.length()) + ei0Var.G1.getText().toString();
                            di0 di0Var2 = ei0Var.E1;
                            String str5 = mtVar9.c;
                            di0Var2.setText(str5);
                            d10 = str5;
                        }
                        List list4 = (List) hashMap2.get(d10);
                        if (list4 == null) {
                            mtVar3 = null;
                        } else if (list4.size() > 1) {
                            String string4 = org.telegram.messenger.wp.d1().getString("phone_code_last_matched_" + d10, null);
                            mtVar3 = (mt) sc.e.g(1, list4);
                            if (string4 != null) {
                                int size6 = arrayList2.size();
                                int i25 = 0;
                                while (true) {
                                    if (i25 < size6) {
                                        Object obj8 = arrayList2.get(i25);
                                        i25++;
                                        mt mtVar11 = (mt) obj8;
                                        if (Objects.equals(mtVar11.d, string4)) {
                                            mtVar3 = mtVar11;
                                        }
                                    }
                                }
                            }
                        } else {
                            mtVar3 = (mt) list4.get(0);
                        }
                        if (mtVar3 != null) {
                            ei0Var.w1 = true;
                            ei0Var.M0(d10, mtVar3);
                        } else {
                            ei0Var.L0(null);
                            ei0Var.G1.setHintText((String) null);
                        }
                        if (!z12) {
                            di0 di0Var3 = ei0Var.E1;
                            di0Var3.setSelection(di0Var3.getText().length());
                        }
                        if (str3 != null && str3.length() != 0) {
                            ei0Var.G1.requestFocus();
                            ei0Var.G1.setText(str3);
                            di0 di0Var4 = ei0Var.G1;
                            di0Var4.setSelection(di0Var4.length());
                        }
                    }
                    ei0Var.u1 = false;
                    ei0.I0(ei0Var);
                    break;
                }
                break;
            case 14:
                io0 io0Var = ((jo0) obj2).s0;
                if (io0Var != null) {
                    io0Var.B(editable);
                    break;
                }
                break;
            case 15:
                y11 y11Var = (y11) obj2;
                ih.b bVar = y11Var.h;
                String obj9 = (bVar.getText() == null || org.telegram.messenger.i0.O3(bVar.getText(), null).length() == 0) ? null : bVar.getText().toString();
                y11Var.F.v(obj9, true, true);
                v21 v21Var = y11Var.n;
                if (v21Var != null) {
                    v21Var.I1(null);
                    y11Var.n.J1(TextUtils.isEmpty(obj9), true);
                }
                if (bVar != null) {
                    bVar.clearAnimation();
                    bVar.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.gr.h).start();
                }
                y11Var.c(false);
                break;
            case 16:
                n91 n91Var = (n91) obj2;
                if (!n91Var.H) {
                    if (n91Var.a.length() <= 0) {
                        n91Var.d.setText(n91Var.G);
                        break;
                    } else {
                        String str6 = "https://" + n91Var.getMessagesController().U2 + "/addtheme/" + ((Object) n91Var.a.getText());
                        String a03 = org.telegram.messenger.dd.a0("ThemeHelpLink", null, 2131744206, str6);
                        int indexOf2 = a03.indexOf(str6);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(a03);
                        if (indexOf2 >= 0) {
                            spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.h(n91Var, str6, 10), indexOf2, str6.length() + indexOf2, 33);
                        }
                        n91Var.d.setText(TextUtils.concat(n91Var.G, "\n\n", spannableStringBuilder2));
                        break;
                    }
                }
                break;
            case 17:
                String trim = editable.toString().trim();
                ja1 ja1Var = (ja1) obj2;
                String str7 = ja1Var.n;
                if (trim.length() > 0) {
                    ja1Var.n = trim.substring(0, 1).toUpperCase();
                } else {
                    ja1Var.n = "";
                }
                if (!str7.equals(ja1Var.n)) {
                    org.telegram.ui.Components.z70 z70Var = new org.telegram.ui.Components.z70(1, null);
                    z70Var.a(ja1Var.n);
                    org.telegram.ui.Components.cl0 cl0Var = ja1Var.w;
                    if (cl0Var != null) {
                        cl0Var.b(z70Var, true);
                        break;
                    }
                }
                break;
            case 18:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj2;
                wb1 wb1Var = twoStepVerificationActivity.V;
                if (twoStepVerificationActivity.U) {
                    org.telegram.messenger.i0.r(wb1Var);
                    wb1Var.run();
                    break;
                }
                break;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) obj2;
                if (usersSelectActivity.c.length() == 0) {
                    usersSelectActivity.M = false;
                    usersSelectActivity.L = false;
                    dd1 dd1Var = usersSelectActivity.h;
                    if (dd1Var.n) {
                        dd1Var.n = false;
                        dd1Var.f();
                    }
                    usersSelectActivity.h.L(null);
                    usersSelectActivity.d.setFastScrollVisible(true);
                    usersSelectActivity.d.setVerticalScrollBarEnabled(false);
                    usersSelectActivity.f.d.setText(org.telegram.messenger.dd.L0(2131748240, null));
                    break;
                } else {
                    dd1 dd1Var2 = usersSelectActivity.h;
                    boolean z14 = dd1Var2.n;
                    if (!z14) {
                        usersSelectActivity.M = true;
                        usersSelectActivity.L = true;
                        if (!z14) {
                            dd1Var2.n = true;
                            dd1Var2.f();
                        }
                        usersSelectActivity.d.setFastScrollVisible(false);
                        usersSelectActivity.d.setVerticalScrollBarEnabled(true);
                        usersSelectActivity.f.d.setText(org.telegram.messenger.dd.L0(2131748183, null));
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
                    org.telegram.messenger.a30.j(1.5f, xrVar.U1);
                    xrVar.U1.setDuration(350L);
                }
                xrVar.U1.start();
                xrVar.m();
                break;
            case 9:
                vc0 vc0Var = (vc0) obj;
                pc0 pc0Var = vc0Var.S;
                if (vc0Var.R) {
                    vc0Var.removeCallbacks(pc0Var);
                    pc0Var.run();
                    break;
                }
                break;
            case 10:
                nd0 nd0Var = (nd0) obj;
                ld0 ld0Var = nd0Var.y;
                if (nd0Var.x) {
                    nd0Var.removeCallbacks(ld0Var);
                    ld0Var.run();
                    break;
                }
                break;
            case 11:
                le0 le0Var = (le0) obj;
                zd0 zd0Var = le0Var.t0;
                if (le0Var.s0) {
                    le0Var.removeCallbacks(zd0Var);
                    zd0Var.run();
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
                    oaVar.i0(oaVar.r);
                    break;
                }
                break;
            case 2:
                kd kdVar = (kd) this.b;
                kdVar.j0(kdVar.y.getText().toString());
                break;
            case 4:
                cp cpVar = (cp) this.b;
                if (!cpVar.m0) {
                    String obj = cpVar.b.getText().toString();
                    la laVar2 = cpVar.O;
                    if (laVar2 != null) {
                        laVar2.b(obj);
                    }
                    cpVar.c0(obj);
                    break;
                }
                break;
            case 16:
                n91 n91Var = (n91) this.b;
                if (!n91Var.F) {
                    n91Var.e0(n91Var.a.getText().toString(), false);
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
