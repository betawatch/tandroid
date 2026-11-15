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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
        org.telegram.ui.web.k kVar;
        int i7;
        org.telegram.ui.ActionBar.w4 w4Var;
        org.telegram.ui.ActionBar.w4 w4Var2;
        org.telegram.ui.ActionBar.w4 w4Var3;
        String str;
        String str2;
        boolean z10;
        int i10;
        ps psVar;
        boolean z11;
        ps psVar2;
        boolean z12;
        String str3;
        ps psVar3;
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
                if (g4Var.i0.a0 && (kVar = g4Var.j0) != null) {
                    kVar.setInput(editable == null ? null : editable.toString());
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
                    i7 = ((org.telegram.ui.ActionBar.e2) laVar).currentAccount;
                    sb2.append(org.telegram.messenger.np.s1(i7).V2);
                    sb2.append("/");
                    sb2.append(laVar.r);
                    String sb3 = sb2.toString();
                    String a02 = org.telegram.messenger.hd.a0("UsernameHelpLink", null, 2131743659, sb3);
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
                qn qnVar = (qn) obj2;
                qnVar.r.k(5L, qnVar.w.getText().toString(), null, null);
                fi.v3 v3Var = qnVar.e;
                if (v3Var != null) {
                    v3Var.invalidate();
                    break;
                }
                break;
            case 4:
                ((ho) obj2).b0();
                break;
            case 5:
                lp lpVar = (lp) obj2;
                mp mpVar = lpVar.e;
                if (!lpVar.d) {
                    mpVar.T = editable.toString();
                    v4.e1 K = mpVar.b.K(mpVar.v0);
                    if (K != null) {
                        mp.k0(mpVar, K.a);
                        break;
                    }
                }
                break;
            case 6:
                break;
            case 7:
                hz hzVar = ((ez) obj2).e;
                if (!TextUtils.equals(editable, hzVar.x)) {
                    hzVar.n = !TextUtils.isEmpty(editable);
                    hzVar.x = org.telegram.ui.Components.p5.onlyEmojiSpans(editable);
                    xy xyVar = hzVar.J;
                    if (xyVar != null) {
                        xyVar.e(org.telegram.ui.Components.p5.cloneSpans(hzVar.x, -1, xyVar.s.getPaint().getFontMetricsInt(), 0.5f), true);
                    }
                    yy yyVar = hzVar.K;
                    if (yyVar != null) {
                        org.telegram.ui.Cells.w3 w3Var = yyVar.r;
                        if (hz.q0(hzVar.x)) {
                            str = org.telegram.messenger.hd.M0(hzVar.y ? 2131750735 : 2131750734, null);
                        } else {
                            str = null;
                        }
                        w3Var.setText(str);
                    }
                    if (hzVar.s && TextUtils.isEmpty(hzVar.x)) {
                        w4Var3 = ((org.telegram.ui.ActionBar.e2) hzVar).simpleActionBar;
                        w4Var3.setTitle(org.telegram.messenger.hd.M0(2131750728, null));
                    } else {
                        w4Var = ((org.telegram.ui.ActionBar.e2) hzVar).simpleActionBar;
                        CharSequence charSequence = hzVar.x;
                        w4Var2 = ((org.telegram.ui.ActionBar.e2) hzVar).simpleActionBar;
                        w4Var.setTitle(org.telegram.ui.Components.p5.cloneSpans(charSequence, -1, w4Var2.getTitleFontMetricsInt()));
                    }
                }
                hzVar.o0(true);
                break;
            case 8:
                w40 w40Var = (w40) obj2;
                if (w40Var.f.r.length() == 0) {
                    w40Var.U = false;
                    w40Var.T = false;
                    u40 u40Var = w40Var.w;
                    if (u40Var.n) {
                        u40Var.n = false;
                        u40Var.f();
                    }
                    w40Var.w.L(null);
                    w40Var.n.setFastScrollVisible(true);
                    w40Var.n.setVerticalScrollBarEnabled(false);
                    w40Var.v0(0);
                    break;
                } else {
                    u40 u40Var2 = w40Var.w;
                    boolean z13 = u40Var2.n;
                    if (!z13) {
                        w40Var.U = true;
                        w40Var.T = true;
                        if (!z13) {
                            u40Var2.n = true;
                            u40Var2.f();
                        }
                        w40Var.n.setFastScrollVisible(false);
                        w40Var.n.setVerticalScrollBarEnabled(true);
                    }
                    w40Var.w.L(w40Var.f.r.getText().toString());
                    w40Var.s.e(true, false);
                    break;
                }
            case 9:
            case 10:
            case 11:
                break;
            case 12:
                be0 be0Var = (be0) obj2;
                HashMap hashMap = be0Var.I;
                ArrayList arrayList = be0Var.H;
                zd0 zd0Var = be0Var.a;
                zd0 zd0Var2 = be0Var.b;
                if (!be0Var.L) {
                    be0Var.L = true;
                    String d = pf.b.d(zd0Var.getText().toString(), false);
                    zd0Var.setText(d);
                    if (d.length() == 0) {
                        be0Var.setCountryButtonText(null);
                        zd0Var2.setHintText((String) null);
                        be0Var.F = 1;
                        z11 = false;
                    } else {
                        if (d.length() > 4) {
                            while (true) {
                                if (i12 >= i15) {
                                    String substring = d.substring(i14, i12);
                                    List list = (List) hashMap.get(substring);
                                    if (list == null) {
                                        psVar2 = null;
                                    } else if (list.size() > i15) {
                                        String string = org.telegram.messenger.np.e1().getString("phone_code_last_matched_" + substring, null);
                                        psVar2 = (ps) r.b.h(i15, list);
                                        if (string != null) {
                                            int size = arrayList.size();
                                            int i16 = i14;
                                            while (true) {
                                                if (i16 < size) {
                                                    Object obj3 = arrayList.get(i16);
                                                    i16++;
                                                    ps psVar4 = (ps) obj3;
                                                    if (Objects.equals(psVar4.d, string)) {
                                                        psVar2 = psVar4;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        psVar2 = (ps) list.get(i14);
                                    }
                                    if (psVar2 != null) {
                                        str2 = d.substring(i12) + zd0Var2.getText().toString();
                                        zd0Var.setText(substring);
                                        d = substring;
                                        z10 = true;
                                    } else {
                                        i12--;
                                        i14 = 0;
                                        i15 = 1;
                                    }
                                } else {
                                    str2 = null;
                                    z10 = false;
                                }
                            }
                            if (!z10) {
                                str2 = d.substring(1) + zd0Var2.getText().toString();
                                d = d.substring(0, 1);
                                zd0Var.setText(d);
                            }
                        } else {
                            str2 = null;
                            z10 = false;
                        }
                        int size2 = arrayList.size();
                        ps psVar5 = null;
                        int i17 = 0;
                        int i18 = 0;
                        while (i18 < size2) {
                            Object obj4 = arrayList.get(i18);
                            i18++;
                            ps psVar6 = (ps) obj4;
                            if (psVar6.c.startsWith(d)) {
                                int i19 = i17 + 1;
                                if (psVar6.c.equals(d)) {
                                    if (psVar5 == null || !psVar5.c.equals(psVar6.c)) {
                                        i17 = i19;
                                    }
                                    psVar5 = psVar6;
                                } else {
                                    i17 = i19;
                                }
                            }
                        }
                        if (i17 == 1 && psVar5 != null && str2 == null) {
                            str2 = d.substring(psVar5.c.length()) + zd0Var2.getText().toString();
                            d = psVar5.c;
                            zd0Var.setText(d);
                        }
                        List list2 = (List) hashMap.get(d);
                        if (list2 == null) {
                            psVar = null;
                        } else if (list2.size() > 1) {
                            String string2 = org.telegram.messenger.np.e1().getString("phone_code_last_matched_" + d, null);
                            psVar = (ps) r.b.h(1, list2);
                            if (string2 != null) {
                                int size3 = arrayList.size();
                                int i20 = 0;
                                while (true) {
                                    if (i20 < size3) {
                                        Object obj5 = arrayList.get(i20);
                                        i20++;
                                        ps psVar7 = (ps) obj5;
                                        if (Objects.equals(psVar7.d, string2)) {
                                            psVar = psVar7;
                                        }
                                    }
                                }
                            }
                        } else {
                            i10 = 0;
                            psVar = (ps) list2.get(0);
                            if (psVar == null) {
                                be0Var.K = true;
                                be0Var.G = psVar;
                                be0Var.u(d, psVar);
                                be0Var.F = i10;
                            } else {
                                be0Var.setCountryButtonText(null);
                                zd0Var2.setHintText((String) null);
                                be0Var.F = 2;
                            }
                            if (!z10) {
                                zd0Var.setSelection(zd0Var.getText().length());
                            }
                            if (str2 != null) {
                                zd0Var2.requestFocus();
                                zd0Var2.setText(str2);
                                zd0Var2.setSelection(zd0Var2.length());
                            }
                            z11 = false;
                        }
                        i10 = 0;
                        if (psVar == null) {
                        }
                        if (!z10) {
                        }
                        if (str2 != null) {
                        }
                        z11 = false;
                    }
                    be0Var.L = z11;
                    break;
                }
                break;
            case 13:
                bh0 bh0Var = (bh0) obj2;
                HashMap hashMap2 = bh0Var.w1;
                ArrayList arrayList2 = bh0Var.v1;
                if (!bh0Var.y1) {
                    bh0Var.y1 = true;
                    String d2 = pf.b.d(bh0Var.I1.getText().toString(), false);
                    bh0Var.I1.setText(d2);
                    if (d2.length() == 0) {
                        bh0Var.L0(null);
                        bh0Var.K1.setHintText((String) null);
                    } else {
                        if (d2.length() > 4) {
                            while (true) {
                                if (i12 >= 1) {
                                    String substring2 = d2.substring(0, i12);
                                    List list3 = (List) hashMap2.get(substring2);
                                    if (list3 == null) {
                                        obj = str4;
                                    } else if (list3.size() > 1) {
                                        String string3 = org.telegram.messenger.np.e1().getString("phone_code_last_matched_" + substring2, str4);
                                        obj = (ps) r.b.h(1, list3);
                                        if (string3 != null) {
                                            int size4 = arrayList2.size();
                                            int i21 = 0;
                                            while (true) {
                                                if (i21 < size4) {
                                                    Object obj6 = arrayList2.get(i21);
                                                    i21++;
                                                    ps psVar8 = (ps) obj6;
                                                    if (Objects.equals(psVar8.d, string3)) {
                                                        obj = psVar8;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        obj = (ps) list3.get(0);
                                    }
                                    if (obj != null) {
                                        str3 = d2.substring(i12) + bh0Var.K1.getText().toString();
                                        bh0Var.I1.setText(substring2);
                                        d2 = substring2;
                                        z12 = true;
                                    } else {
                                        i12--;
                                        str4 = null;
                                    }
                                } else {
                                    z12 = false;
                                    str3 = null;
                                }
                            }
                            if (!z12) {
                                str3 = d2.substring(1) + bh0Var.K1.getText().toString();
                                zg0 zg0Var = bh0Var.I1;
                                d2 = d2.substring(0, 1);
                                zg0Var.setText(d2);
                            }
                        } else {
                            z12 = false;
                            str3 = null;
                        }
                        int size5 = arrayList2.size();
                        int i22 = 0;
                        int i23 = 0;
                        ps psVar9 = null;
                        while (i23 < size5) {
                            Object obj7 = arrayList2.get(i23);
                            i23++;
                            ps psVar10 = (ps) obj7;
                            if (psVar10.c.startsWith(d2)) {
                                i22++;
                                if (psVar10.c.equals(d2)) {
                                    psVar9 = psVar10;
                                }
                            }
                        }
                        if (i22 == 1 && psVar9 != null && str3 == null) {
                            str3 = d2.substring(psVar9.c.length()) + bh0Var.K1.getText().toString();
                            zg0 zg0Var2 = bh0Var.I1;
                            String str5 = psVar9.c;
                            zg0Var2.setText(str5);
                            d2 = str5;
                        }
                        List list4 = (List) hashMap2.get(d2);
                        if (list4 == null) {
                            psVar3 = null;
                        } else if (list4.size() > 1) {
                            String string4 = org.telegram.messenger.np.e1().getString("phone_code_last_matched_" + d2, null);
                            psVar3 = (ps) r.b.h(1, list4);
                            if (string4 != null) {
                                int size6 = arrayList2.size();
                                int i24 = 0;
                                while (true) {
                                    if (i24 < size6) {
                                        Object obj8 = arrayList2.get(i24);
                                        i24++;
                                        ps psVar11 = (ps) obj8;
                                        if (Objects.equals(psVar11.d, string4)) {
                                            psVar3 = psVar11;
                                        }
                                    }
                                }
                            }
                        } else {
                            psVar3 = (ps) list4.get(0);
                        }
                        if (psVar3 != null) {
                            bh0Var.A1 = true;
                            bh0Var.M0(d2, psVar3);
                        } else {
                            bh0Var.L0(null);
                            bh0Var.K1.setHintText((String) null);
                        }
                        if (!z12) {
                            zg0 zg0Var3 = bh0Var.I1;
                            zg0Var3.setSelection(zg0Var3.getText().length());
                        }
                        if (str3 != null && str3.length() != 0) {
                            bh0Var.K1.requestFocus();
                            bh0Var.K1.setText(str3);
                            zg0 zg0Var4 = bh0Var.K1;
                            zg0Var4.setSelection(zg0Var4.length());
                        }
                    }
                    bh0Var.y1 = false;
                    bh0.I0(bh0Var);
                    break;
                }
                break;
            case 14:
                xm0 xm0Var = ((ym0) obj2).t0;
                if (xm0Var != null) {
                    xm0Var.A(editable);
                    break;
                }
                break;
            case 15:
                f01 f01Var = (f01) obj2;
                bi.u uVar = f01Var.h;
                String obj9 = (uVar.getText() == null || org.telegram.messenger.g0.O3(uVar.getText(), null).length() == 0) ? null : uVar.getText().toString();
                f01Var.G.v(obj9, true, true);
                c11 c11Var = f01Var.n;
                if (c11Var != null) {
                    c11Var.I1(null);
                    f01Var.n.J1(TextUtils.isEmpty(obj9), true);
                }
                if (uVar != null) {
                    uVar.clearAnimation();
                    uVar.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.er.h).start();
                }
                f01Var.c(false);
                break;
            case 16:
                w71 w71Var = (w71) obj2;
                if (!w71Var.I) {
                    if (w71Var.a.length() <= 0) {
                        w71Var.d.setText(w71Var.H);
                        break;
                    } else {
                        String str6 = "https://" + w71Var.getMessagesController().V2 + "/addtheme/" + ((Object) w71Var.a.getText());
                        String a03 = org.telegram.messenger.hd.a0("ThemeHelpLink", null, 2131744181, str6);
                        int indexOf2 = a03.indexOf(str6);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(a03);
                        if (indexOf2 >= 0) {
                            spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.h(w71Var, str6, 10), indexOf2, str6.length() + indexOf2, 33);
                        }
                        w71Var.d.setText(TextUtils.concat(w71Var.H, "\n\n", spannableStringBuilder2));
                        break;
                    }
                }
                break;
            case 17:
                String trim = editable.toString().trim();
                s81 s81Var = (s81) obj2;
                String str7 = s81Var.n;
                if (trim.length() > 0) {
                    s81Var.n = trim.substring(0, 1).toUpperCase();
                } else {
                    s81Var.n = "";
                }
                if (!str7.equals(s81Var.n)) {
                    org.telegram.ui.Components.j70 j70Var = new org.telegram.ui.Components.j70(1, null);
                    j70Var.a(s81Var.n);
                    org.telegram.ui.Components.ck0 ck0Var = s81Var.w;
                    if (ck0Var != null) {
                        ck0Var.b(j70Var, true);
                        break;
                    }
                }
                break;
            case 18:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj2;
                da1 da1Var = twoStepVerificationActivity.W;
                if (twoStepVerificationActivity.V) {
                    org.telegram.messenger.g0.r(da1Var);
                    da1Var.run();
                    break;
                }
                break;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) obj2;
                if (usersSelectActivity.c.length() == 0) {
                    usersSelectActivity.O = false;
                    usersSelectActivity.N = false;
                    ib1 ib1Var = usersSelectActivity.h;
                    if (ib1Var.n) {
                        ib1Var.n = false;
                        ib1Var.f();
                    }
                    usersSelectActivity.h.L(null);
                    usersSelectActivity.d.setFastScrollVisible(true);
                    usersSelectActivity.d.setVerticalScrollBarEnabled(false);
                    usersSelectActivity.f.d.setText(org.telegram.messenger.hd.M0(2131748223, null));
                    break;
                } else {
                    ib1 ib1Var2 = usersSelectActivity.h;
                    boolean z14 = ib1Var2.n;
                    if (!z14) {
                        usersSelectActivity.O = true;
                        usersSelectActivity.N = true;
                        if (!z14) {
                            ib1Var2.n = true;
                            ib1Var2.f();
                        }
                        usersSelectActivity.d.setFastScrollVisible(false);
                        usersSelectActivity.d.setVerticalScrollBarEnabled(true);
                        usersSelectActivity.f.d.setText(org.telegram.messenger.hd.M0(2131748167, null));
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
                ia iaVar = laVar2.F;
                if (iaVar != null && str != null) {
                    iaVar.b(laVar2.r);
                    break;
                }
                break;
            case 6:
                yq yqVar = (yq) obj;
                yqVar.X1 = charSequence.length() != 0;
                yqVar.V1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                yqVar.a2 = ofFloat;
                ofFloat.addUpdateListener(new a3(yqVar, 8));
                if (yqVar.X1) {
                    yqVar.a2.setDuration(220L);
                } else {
                    org.telegram.messenger.i20.k(1.5f, yqVar.a2);
                    yqVar.a2.setDuration(350L);
                }
                yqVar.a2.start();
                yqVar.m();
                break;
            case 9:
                ob0 ob0Var = (ob0) obj;
                hb0 hb0Var = ob0Var.T;
                if (ob0Var.S) {
                    ob0Var.removeCallbacks(hb0Var);
                    hb0Var.run();
                    break;
                }
                break;
            case 10:
                gc0 gc0Var = (gc0) obj;
                ec0 ec0Var = gc0Var.y;
                if (gc0Var.x) {
                    gc0Var.removeCallbacks(ec0Var);
                    ec0Var.run();
                    break;
                }
                break;
            case 11:
                ed0 ed0Var = (ed0) obj;
                sc0 sc0Var = ed0Var.u0;
                if (ed0Var.t0) {
                    ed0Var.removeCallbacks(sc0Var);
                    sc0Var.run();
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
                ia iaVar = laVar2.F;
                if (iaVar != null && str != null) {
                    iaVar.b(laVar2.r);
                }
                if (!laVar.n) {
                    laVar.i0(laVar.r);
                    break;
                }
                break;
            case 2:
                ad adVar = (ad) this.b;
                adVar.j0(adVar.y.getText().toString());
                break;
            case 4:
                ho hoVar = (ho) this.b;
                if (!hoVar.n0) {
                    String obj = hoVar.b.getText().toString();
                    ia iaVar2 = hoVar.P;
                    if (iaVar2 != null) {
                        iaVar2.b(obj);
                    }
                    hoVar.c0(obj);
                    break;
                }
                break;
            case 16:
                w71 w71Var = (w71) this.b;
                if (!w71Var.G) {
                    w71Var.e0(w71Var.a.getText().toString(), false);
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
