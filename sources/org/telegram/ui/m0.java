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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class m0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m0(Object obj, int i7) {
        this.a = i7;
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
        int i7;
        org.telegram.ui.ActionBar.y4 y4Var;
        org.telegram.ui.ActionBar.y4 y4Var2;
        org.telegram.ui.ActionBar.y4 y4Var3;
        String str;
        String str2;
        boolean z9;
        int i10;
        os osVar;
        boolean z10;
        os osVar2;
        boolean z11;
        String str3;
        os osVar3;
        Object obj;
        int i11 = this.a;
        int i12 = 4;
        int i13 = 3;
        int i14 = 0;
        String str4 = null;
        int i15 = 1;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                g4 g4Var = (g4) obj2;
                if (g4Var.h0.W && (jVar = g4Var.i0) != null) {
                    jVar.setInput(editable == null ? null : editable.toString());
                    break;
                }
                break;
            case 1:
                la laVar = ((ga) obj2).c;
                if (laVar.r.startsWith("@")) {
                    laVar.r = laVar.r.substring(1);
                }
                if (laVar.r.length() > 0) {
                    StringBuilder sb2 = new StringBuilder("https://");
                    i7 = ((org.telegram.ui.ActionBar.f2) laVar).currentAccount;
                    sb2.append(org.telegram.messenger.qp.s1(i7).U2);
                    sb2.append("/");
                    sb2.append(laVar.r);
                    String sb3 = sb2.toString();
                    String a02 = org.telegram.messenger.id.a0("UsernameHelpLink", null, 2131743659, sb3);
                    int indexOf = a02.indexOf(sb3);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a02);
                    if (indexOf >= 0) {
                        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.h(laVar, sb3, i13), indexOf, sb3.length() + indexOf, 33);
                        break;
                    }
                }
                break;
            case 2:
                break;
            case 3:
                rn rnVar = (rn) obj2;
                rnVar.r.k(5L, rnVar.w.getText().toString(), null, null);
                di.d4 d4Var = rnVar.e;
                if (d4Var != null) {
                    d4Var.invalidate();
                    break;
                }
                break;
            case 4:
                ((io) obj2).b0();
                break;
            case 5:
                lp lpVar = (lp) obj2;
                mp mpVar = lpVar.e;
                if (!lpVar.d) {
                    mpVar.S = editable.toString();
                    v4.d1 K = mpVar.b.K(mpVar.u0);
                    if (K != null) {
                        mp.k0(mpVar, K.a);
                        break;
                    }
                }
                break;
            case 6:
                break;
            case 7:
                iz izVar = ((fz) obj2).e;
                if (!TextUtils.equals(editable, izVar.x)) {
                    izVar.n = !TextUtils.isEmpty(editable);
                    izVar.x = org.telegram.ui.Components.r5.onlyEmojiSpans(editable);
                    yy yyVar = izVar.I;
                    if (yyVar != null) {
                        yyVar.e(org.telegram.ui.Components.r5.cloneSpans(izVar.x, -1, yyVar.s.getPaint().getFontMetricsInt(), 0.5f), true);
                    }
                    zy zyVar = izVar.J;
                    if (zyVar != null) {
                        org.telegram.ui.Cells.w3 w3Var = zyVar.r;
                        if (iz.q0(izVar.x)) {
                            str = org.telegram.messenger.id.M0(izVar.y ? 2131750735 : 2131750734, null);
                        } else {
                            str = null;
                        }
                        w3Var.setText(str);
                    }
                    if (izVar.s && TextUtils.isEmpty(izVar.x)) {
                        y4Var3 = ((org.telegram.ui.ActionBar.f2) izVar).simpleActionBar;
                        y4Var3.setTitle(org.telegram.messenger.id.M0(2131750728, null));
                    } else {
                        y4Var = ((org.telegram.ui.ActionBar.f2) izVar).simpleActionBar;
                        CharSequence charSequence = izVar.x;
                        y4Var2 = ((org.telegram.ui.ActionBar.f2) izVar).simpleActionBar;
                        y4Var.setTitle(org.telegram.ui.Components.r5.cloneSpans(charSequence, -1, y4Var2.getTitleFontMetricsInt()));
                    }
                }
                izVar.o0(true);
                break;
            case 8:
                y40 y40Var = (y40) obj2;
                if (y40Var.f.r.length() == 0) {
                    y40Var.T = false;
                    y40Var.S = false;
                    w40 w40Var = y40Var.w;
                    if (w40Var.n) {
                        w40Var.n = false;
                        w40Var.f();
                    }
                    y40Var.w.L(null);
                    y40Var.n.setFastScrollVisible(true);
                    y40Var.n.setVerticalScrollBarEnabled(false);
                    y40Var.v0(0);
                    break;
                } else {
                    w40 w40Var2 = y40Var.w;
                    boolean z12 = w40Var2.n;
                    if (!z12) {
                        y40Var.T = true;
                        y40Var.S = true;
                        if (!z12) {
                            w40Var2.n = true;
                            w40Var2.f();
                        }
                        y40Var.n.setFastScrollVisible(false);
                        y40Var.n.setVerticalScrollBarEnabled(true);
                    }
                    y40Var.w.L(y40Var.f.r.getText().toString());
                    y40Var.s.e(true, false);
                    break;
                }
            case 9:
            case 10:
            case 11:
                break;
            case 12:
                de0 de0Var = (de0) obj2;
                HashMap hashMap = de0Var.H;
                ArrayList arrayList = de0Var.G;
                be0 be0Var = de0Var.a;
                be0 be0Var2 = de0Var.b;
                if (!de0Var.K) {
                    de0Var.K = true;
                    String d = pf.b.d(be0Var.getText().toString(), false);
                    be0Var.setText(d);
                    if (d.length() == 0) {
                        de0Var.setCountryButtonText(null);
                        be0Var2.setHintText((String) null);
                        de0Var.E = 1;
                        z10 = false;
                    } else {
                        if (d.length() > 4) {
                            while (true) {
                                if (i12 >= i15) {
                                    String substring = d.substring(i14, i12);
                                    List list = (List) hashMap.get(substring);
                                    if (list == null) {
                                        osVar2 = null;
                                    } else if (list.size() > i15) {
                                        String string = org.telegram.messenger.qp.e1().getString("phone_code_last_matched_" + substring, null);
                                        osVar2 = (os) rf.b.g(i15, list);
                                        if (string != null) {
                                            int size = arrayList.size();
                                            int i16 = i14;
                                            while (true) {
                                                if (i16 < size) {
                                                    Object obj3 = arrayList.get(i16);
                                                    i16++;
                                                    os osVar4 = (os) obj3;
                                                    if (Objects.equals(osVar4.d, string)) {
                                                        osVar2 = osVar4;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        osVar2 = (os) list.get(i14);
                                    }
                                    if (osVar2 != null) {
                                        str2 = d.substring(i12) + be0Var2.getText().toString();
                                        be0Var.setText(substring);
                                        d = substring;
                                        z9 = true;
                                    } else {
                                        i12--;
                                        i14 = 0;
                                        i15 = 1;
                                    }
                                } else {
                                    str2 = null;
                                    z9 = false;
                                }
                            }
                            if (!z9) {
                                str2 = d.substring(1) + be0Var2.getText().toString();
                                d = d.substring(0, 1);
                                be0Var.setText(d);
                            }
                        } else {
                            str2 = null;
                            z9 = false;
                        }
                        int size2 = arrayList.size();
                        os osVar5 = null;
                        int i17 = 0;
                        int i18 = 0;
                        while (i18 < size2) {
                            Object obj4 = arrayList.get(i18);
                            i18++;
                            os osVar6 = (os) obj4;
                            if (osVar6.c.startsWith(d)) {
                                int i19 = i17 + 1;
                                if (osVar6.c.equals(d)) {
                                    if (osVar5 == null || !osVar5.c.equals(osVar6.c)) {
                                        i17 = i19;
                                    }
                                    osVar5 = osVar6;
                                } else {
                                    i17 = i19;
                                }
                            }
                        }
                        if (i17 == 1 && osVar5 != null && str2 == null) {
                            str2 = d.substring(osVar5.c.length()) + be0Var2.getText().toString();
                            d = osVar5.c;
                            be0Var.setText(d);
                        }
                        List list2 = (List) hashMap.get(d);
                        if (list2 == null) {
                            osVar = null;
                        } else if (list2.size() > 1) {
                            String string2 = org.telegram.messenger.qp.e1().getString("phone_code_last_matched_" + d, null);
                            osVar = (os) rf.b.g(1, list2);
                            if (string2 != null) {
                                int size3 = arrayList.size();
                                int i20 = 0;
                                while (true) {
                                    if (i20 < size3) {
                                        Object obj5 = arrayList.get(i20);
                                        i20++;
                                        os osVar7 = (os) obj5;
                                        if (Objects.equals(osVar7.d, string2)) {
                                            osVar = osVar7;
                                        }
                                    }
                                }
                            }
                        } else {
                            i10 = 0;
                            osVar = (os) list2.get(0);
                            if (osVar == null) {
                                de0Var.J = true;
                                de0Var.F = osVar;
                                de0Var.u(d, osVar);
                                de0Var.E = i10;
                            } else {
                                de0Var.setCountryButtonText(null);
                                be0Var2.setHintText((String) null);
                                de0Var.E = 2;
                            }
                            if (!z9) {
                                be0Var.setSelection(be0Var.getText().length());
                            }
                            if (str2 != null) {
                                be0Var2.requestFocus();
                                be0Var2.setText(str2);
                                be0Var2.setSelection(be0Var2.length());
                            }
                            z10 = false;
                        }
                        i10 = 0;
                        if (osVar == null) {
                        }
                        if (!z9) {
                        }
                        if (str2 != null) {
                        }
                        z10 = false;
                    }
                    de0Var.K = z10;
                    break;
                }
                break;
            case 13:
                ch0 ch0Var = (ch0) obj2;
                HashMap hashMap2 = ch0Var.s1;
                ArrayList arrayList2 = ch0Var.r1;
                if (!ch0Var.u1) {
                    ch0Var.u1 = true;
                    String d2 = pf.b.d(ch0Var.E1.getText().toString(), false);
                    ch0Var.E1.setText(d2);
                    if (d2.length() == 0) {
                        ch0Var.L0(null);
                        ch0Var.G1.setHintText((String) null);
                    } else {
                        if (d2.length() > 4) {
                            while (true) {
                                if (i12 >= 1) {
                                    String substring2 = d2.substring(0, i12);
                                    List list3 = (List) hashMap2.get(substring2);
                                    if (list3 == null) {
                                        obj = str4;
                                    } else if (list3.size() > 1) {
                                        String string3 = org.telegram.messenger.qp.e1().getString("phone_code_last_matched_" + substring2, str4);
                                        obj = (os) rf.b.g(1, list3);
                                        if (string3 != null) {
                                            int size4 = arrayList2.size();
                                            int i21 = 0;
                                            while (true) {
                                                if (i21 < size4) {
                                                    Object obj6 = arrayList2.get(i21);
                                                    i21++;
                                                    os osVar8 = (os) obj6;
                                                    if (Objects.equals(osVar8.d, string3)) {
                                                        obj = osVar8;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        obj = (os) list3.get(0);
                                    }
                                    if (obj != null) {
                                        str3 = d2.substring(i12) + ch0Var.G1.getText().toString();
                                        ch0Var.E1.setText(substring2);
                                        d2 = substring2;
                                        z11 = true;
                                    } else {
                                        i12--;
                                        str4 = null;
                                    }
                                } else {
                                    z11 = false;
                                    str3 = null;
                                }
                            }
                            if (!z11) {
                                str3 = d2.substring(1) + ch0Var.G1.getText().toString();
                                bh0 bh0Var = ch0Var.E1;
                                d2 = d2.substring(0, 1);
                                bh0Var.setText(d2);
                            }
                        } else {
                            z11 = false;
                            str3 = null;
                        }
                        int size5 = arrayList2.size();
                        int i22 = 0;
                        int i23 = 0;
                        os osVar9 = null;
                        while (i23 < size5) {
                            Object obj7 = arrayList2.get(i23);
                            i23++;
                            os osVar10 = (os) obj7;
                            if (osVar10.c.startsWith(d2)) {
                                i22++;
                                if (osVar10.c.equals(d2)) {
                                    osVar9 = osVar10;
                                }
                            }
                        }
                        if (i22 == 1 && osVar9 != null && str3 == null) {
                            str3 = d2.substring(osVar9.c.length()) + ch0Var.G1.getText().toString();
                            bh0 bh0Var2 = ch0Var.E1;
                            String str5 = osVar9.c;
                            bh0Var2.setText(str5);
                            d2 = str5;
                        }
                        List list4 = (List) hashMap2.get(d2);
                        if (list4 == null) {
                            osVar3 = null;
                        } else if (list4.size() > 1) {
                            String string4 = org.telegram.messenger.qp.e1().getString("phone_code_last_matched_" + d2, null);
                            osVar3 = (os) rf.b.g(1, list4);
                            if (string4 != null) {
                                int size6 = arrayList2.size();
                                int i24 = 0;
                                while (true) {
                                    if (i24 < size6) {
                                        Object obj8 = arrayList2.get(i24);
                                        i24++;
                                        os osVar11 = (os) obj8;
                                        if (Objects.equals(osVar11.d, string4)) {
                                            osVar3 = osVar11;
                                        }
                                    }
                                }
                            }
                        } else {
                            osVar3 = (os) list4.get(0);
                        }
                        if (osVar3 != null) {
                            ch0Var.w1 = true;
                            ch0Var.M0(d2, osVar3);
                        } else {
                            ch0Var.L0(null);
                            ch0Var.G1.setHintText((String) null);
                        }
                        if (!z11) {
                            bh0 bh0Var3 = ch0Var.E1;
                            bh0Var3.setSelection(bh0Var3.getText().length());
                        }
                        if (str3 != null && str3.length() != 0) {
                            ch0Var.G1.requestFocus();
                            ch0Var.G1.setText(str3);
                            bh0 bh0Var4 = ch0Var.G1;
                            bh0Var4.setSelection(bh0Var4.length());
                        }
                    }
                    ch0Var.u1 = false;
                    ch0.I0(ch0Var);
                    break;
                }
                break;
            case 14:
                ym0 ym0Var = ((zm0) obj2).s0;
                if (ym0Var != null) {
                    ym0Var.B(editable);
                    break;
                }
                break;
            case 15:
                k01 k01Var = (k01) obj2;
                org.telegram.ui.Cells.z5 z5Var = k01Var.h;
                String obj9 = (z5Var.getText() == null || org.telegram.messenger.g0.P3(z5Var.getText(), null).length() == 0) ? null : z5Var.getText().toString();
                k01Var.F.v(obj9, true, true);
                h11 h11Var = k01Var.n;
                if (h11Var != null) {
                    h11Var.I1(null);
                    k01Var.n.J1(TextUtils.isEmpty(obj9), true);
                }
                if (z5Var != null) {
                    z5Var.clearAnimation();
                    z5Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.xq.h).start();
                }
                k01Var.c(false);
                break;
            case 16:
                z71 z71Var = (z71) obj2;
                if (!z71Var.H) {
                    if (z71Var.a.length() <= 0) {
                        z71Var.d.setText(z71Var.G);
                        break;
                    } else {
                        String str6 = "https://" + z71Var.getMessagesController().U2 + "/addtheme/" + ((Object) z71Var.a.getText());
                        String a03 = org.telegram.messenger.id.a0("ThemeHelpLink", null, 2131744181, str6);
                        int indexOf2 = a03.indexOf(str6);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(a03);
                        if (indexOf2 >= 0) {
                            spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.h(z71Var, str6, 10), indexOf2, str6.length() + indexOf2, 33);
                        }
                        z71Var.d.setText(TextUtils.concat(z71Var.G, "\n\n", spannableStringBuilder2));
                        break;
                    }
                }
                break;
            case 17:
                String trim = editable.toString().trim();
                w81 w81Var = (w81) obj2;
                String str7 = w81Var.n;
                if (trim.length() > 0) {
                    w81Var.n = trim.substring(0, 1).toUpperCase();
                } else {
                    w81Var.n = "";
                }
                if (!str7.equals(w81Var.n)) {
                    org.telegram.ui.Components.h70 h70Var = new org.telegram.ui.Components.h70(1, null);
                    h70Var.a(w81Var.n);
                    org.telegram.ui.Components.yj0 yj0Var = w81Var.w;
                    if (yj0Var != null) {
                        yj0Var.b(h70Var, true);
                        break;
                    }
                }
                break;
            case 18:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj2;
                ha1 ha1Var = twoStepVerificationActivity.V;
                if (twoStepVerificationActivity.U) {
                    org.telegram.messenger.g0.r(ha1Var);
                    ha1Var.run();
                    break;
                }
                break;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) obj2;
                if (usersSelectActivity.c.length() == 0) {
                    usersSelectActivity.N = false;
                    usersSelectActivity.M = false;
                    mb1 mb1Var = usersSelectActivity.h;
                    if (mb1Var.n) {
                        mb1Var.n = false;
                        mb1Var.f();
                    }
                    usersSelectActivity.h.L(null);
                    usersSelectActivity.d.setFastScrollVisible(true);
                    usersSelectActivity.d.setVerticalScrollBarEnabled(false);
                    usersSelectActivity.f.d.setText(org.telegram.messenger.id.M0(2131748223, null));
                    break;
                } else {
                    mb1 mb1Var2 = usersSelectActivity.h;
                    boolean z13 = mb1Var2.n;
                    if (!z13) {
                        usersSelectActivity.N = true;
                        usersSelectActivity.M = true;
                        if (!z13) {
                            mb1Var2.n = true;
                            mb1Var2.f();
                        }
                        usersSelectActivity.d.setFastScrollVisible(false);
                        usersSelectActivity.d.setVerticalScrollBarEnabled(true);
                        usersSelectActivity.f.d.setText(org.telegram.messenger.id.M0(2131748167, null));
                    }
                    usersSelectActivity.f.e(true, true);
                    usersSelectActivity.h.L(usersSelectActivity.c.getText().toString());
                    break;
                }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.a;
        Object obj = this.b;
        switch (i12) {
            case 1:
                ga gaVar = (ga) obj;
                la laVar = gaVar.c;
                String str = laVar.r;
                laVar.r = charSequence == null ? "" : charSequence.toString();
                la laVar2 = gaVar.c;
                ia iaVar = laVar2.E;
                if (iaVar != null && str != null) {
                    iaVar.b(laVar2.r);
                    break;
                }
                break;
            case 6:
                yq yqVar = (yq) obj;
                yqVar.R1 = charSequence.length() != 0;
                yqVar.P1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                yqVar.U1 = ofFloat;
                ofFloat.addUpdateListener(new a3(yqVar, 8));
                if (yqVar.R1) {
                    yqVar.U1.setDuration(220L);
                } else {
                    org.telegram.messenger.camera.q.i(1.5f, yqVar.U1);
                    yqVar.U1.setDuration(350L);
                }
                yqVar.U1.start();
                yqVar.m();
                break;
            case 9:
                qb0 qb0Var = (qb0) obj;
                jb0 jb0Var = qb0Var.S;
                if (qb0Var.R) {
                    qb0Var.removeCallbacks(jb0Var);
                    jb0Var.run();
                    break;
                }
                break;
            case 10:
                jc0 jc0Var = (jc0) obj;
                hc0 hc0Var = jc0Var.y;
                if (jc0Var.x) {
                    jc0Var.removeCallbacks(hc0Var);
                    hc0Var.run();
                    break;
                }
                break;
            case 11:
                id0 id0Var = (id0) obj;
                vc0 vc0Var = id0Var.t0;
                if (id0Var.s0) {
                    id0Var.removeCallbacks(vc0Var);
                    vc0Var.run();
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.a) {
            case 1:
                ga gaVar = (ga) this.b;
                la laVar = gaVar.c;
                String str = laVar.r;
                laVar.r = charSequence == null ? "" : charSequence.toString();
                la laVar2 = gaVar.c;
                ia iaVar = laVar2.E;
                if (iaVar != null && str != null) {
                    iaVar.b(laVar2.r);
                }
                if (!laVar.n) {
                    laVar.i0(laVar.r);
                    break;
                }
                break;
            case 2:
                bd bdVar = (bd) this.b;
                bdVar.j0(bdVar.y.getText().toString());
                break;
            case 4:
                io ioVar = (io) this.b;
                if (!ioVar.m0) {
                    String obj = ioVar.b.getText().toString();
                    ia iaVar2 = ioVar.O;
                    if (iaVar2 != null) {
                        iaVar2.b(obj);
                    }
                    ioVar.c0(obj);
                    break;
                }
                break;
            case 16:
                z71 z71Var = (z71) this.b;
                if (!z71Var.F) {
                    z71Var.e0(z71Var.a.getText().toString(), false);
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

    private final void A(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void B(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void C(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void D(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void E(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void F(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void G(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void H(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void I(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void J(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void g(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void h(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void i(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void j(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void k(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void l(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void m(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void n(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void o(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void p(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void q(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void r(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void s(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void t(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void u(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void v(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void w(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void x(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void y(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void z(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
