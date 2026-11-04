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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n0(Object obj, int i3) {
        this.a = i3;
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
        org.telegram.ui.web.l lVar;
        int i3;
        org.telegram.ui.ActionBar.y4 y4Var;
        org.telegram.ui.ActionBar.y4 y4Var2;
        org.telegram.ui.ActionBar.y4 y4Var3;
        String str;
        String str2;
        boolean z10;
        int i10;
        ks ksVar;
        boolean z11;
        ks ksVar2;
        boolean z12;
        String str3;
        ks ksVar3;
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
                i4 i4Var = (i4) obj2;
                if (i4Var.i0.a0 && (lVar = i4Var.j0) != null) {
                    lVar.setInput(editable == null ? null : editable.toString());
                    break;
                }
                break;
            case 1:
                ka kaVar = ((fa) obj2).c;
                if (kaVar.r.startsWith("@")) {
                    kaVar.r = kaVar.r.substring(1);
                }
                if (kaVar.r.length() > 0) {
                    StringBuilder sb2 = new StringBuilder("https://");
                    i3 = ((org.telegram.ui.ActionBar.d2) kaVar).currentAccount;
                    sb2.append(org.telegram.messenger.hp.s1(i3).V2);
                    sb2.append("/");
                    sb2.append(kaVar.r);
                    String sb3 = sb2.toString();
                    String a02 = org.telegram.messenger.bd.a0("UsernameHelpLink", null, 2131743669, sb3);
                    int indexOf = a02.indexOf(sb3);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a02);
                    if (indexOf >= 0) {
                        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.h(kaVar, sb3, i13), indexOf, sb3.length() + indexOf, 33);
                        break;
                    }
                }
                break;
            case 2:
                break;
            case 3:
                ln lnVar = (ln) obj2;
                lnVar.r.k(5L, lnVar.w.getText().toString(), null, null);
                ei.d4 d4Var = lnVar.e;
                if (d4Var != null) {
                    d4Var.invalidate();
                    break;
                }
                break;
            case 4:
                ((bo) obj2).b0();
                break;
            case 5:
                hp hpVar = (hp) obj2;
                ip ipVar = hpVar.e;
                if (!hpVar.d) {
                    ipVar.T = editable.toString();
                    u4.d1 K = ipVar.b.K(ipVar.v0);
                    if (K != null) {
                        ip.k0(ipVar, K.a);
                        break;
                    }
                }
                break;
            case 6:
                break;
            case 7:
                ez ezVar = ((bz) obj2).e;
                if (!TextUtils.equals(editable, ezVar.x)) {
                    ezVar.n = !TextUtils.isEmpty(editable);
                    ezVar.x = org.telegram.ui.Components.p5.onlyEmojiSpans(editable);
                    ty tyVar = ezVar.J;
                    if (tyVar != null) {
                        tyVar.e(org.telegram.ui.Components.p5.cloneSpans(ezVar.x, -1, tyVar.s.getPaint().getFontMetricsInt(), 0.5f), true);
                    }
                    uy uyVar = ezVar.K;
                    if (uyVar != null) {
                        org.telegram.ui.Cells.w3 w3Var = uyVar.r;
                        if (ez.q0(ezVar.x)) {
                            str = org.telegram.messenger.bd.M0(ezVar.y ? 2131750736 : 2131750735, null);
                        } else {
                            str = null;
                        }
                        w3Var.setText(str);
                    }
                    if (ezVar.s && TextUtils.isEmpty(ezVar.x)) {
                        y4Var3 = ((org.telegram.ui.ActionBar.d2) ezVar).simpleActionBar;
                        y4Var3.setTitle(org.telegram.messenger.bd.M0(2131750729, null));
                    } else {
                        y4Var = ((org.telegram.ui.ActionBar.d2) ezVar).simpleActionBar;
                        CharSequence charSequence = ezVar.x;
                        y4Var2 = ((org.telegram.ui.ActionBar.d2) ezVar).simpleActionBar;
                        y4Var.setTitle(org.telegram.ui.Components.p5.cloneSpans(charSequence, -1, y4Var2.getTitleFontMetricsInt()));
                    }
                }
                ezVar.o0(true);
                break;
            case 8:
                r40 r40Var = (r40) obj2;
                if (r40Var.f.r.length() == 0) {
                    r40Var.U = false;
                    r40Var.T = false;
                    p40 p40Var = r40Var.w;
                    if (p40Var.n) {
                        p40Var.n = false;
                        p40Var.f();
                    }
                    r40Var.w.L(null);
                    r40Var.n.setFastScrollVisible(true);
                    r40Var.n.setVerticalScrollBarEnabled(false);
                    r40Var.v0(0);
                    break;
                } else {
                    p40 p40Var2 = r40Var.w;
                    boolean z13 = p40Var2.n;
                    if (!z13) {
                        r40Var.U = true;
                        r40Var.T = true;
                        if (!z13) {
                            p40Var2.n = true;
                            p40Var2.f();
                        }
                        r40Var.n.setFastScrollVisible(false);
                        r40Var.n.setVerticalScrollBarEnabled(true);
                    }
                    r40Var.w.L(r40Var.f.r.getText().toString());
                    r40Var.s.e(true, false);
                    break;
                }
            case 9:
            case 10:
            case 11:
                break;
            case 12:
                wd0 wd0Var = (wd0) obj2;
                HashMap hashMap = wd0Var.I;
                ArrayList arrayList = wd0Var.H;
                ud0 ud0Var = wd0Var.a;
                ud0 ud0Var2 = wd0Var.b;
                if (!wd0Var.L) {
                    wd0Var.L = true;
                    String d = mf.b.d(ud0Var.getText().toString(), false);
                    ud0Var.setText(d);
                    if (d.length() == 0) {
                        wd0Var.setCountryButtonText(null);
                        ud0Var2.setHintText((String) null);
                        wd0Var.F = 1;
                        z11 = false;
                    } else {
                        if (d.length() > 4) {
                            while (true) {
                                if (i12 >= i15) {
                                    String substring = d.substring(i14, i12);
                                    List list = (List) hashMap.get(substring);
                                    if (list == null) {
                                        ksVar2 = null;
                                    } else if (list.size() > i15) {
                                        String string = org.telegram.messenger.hp.e1().getString("phone_code_last_matched_" + substring, null);
                                        ksVar2 = (ks) t4.c.d(i15, list);
                                        if (string != null) {
                                            int size = arrayList.size();
                                            int i16 = i14;
                                            while (true) {
                                                if (i16 < size) {
                                                    Object obj3 = arrayList.get(i16);
                                                    i16++;
                                                    ks ksVar4 = (ks) obj3;
                                                    if (Objects.equals(ksVar4.d, string)) {
                                                        ksVar2 = ksVar4;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        ksVar2 = (ks) list.get(i14);
                                    }
                                    if (ksVar2 != null) {
                                        str2 = d.substring(i12) + ud0Var2.getText().toString();
                                        ud0Var.setText(substring);
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
                                str2 = d.substring(1) + ud0Var2.getText().toString();
                                d = d.substring(0, 1);
                                ud0Var.setText(d);
                            }
                        } else {
                            str2 = null;
                            z10 = false;
                        }
                        int size2 = arrayList.size();
                        ks ksVar5 = null;
                        int i17 = 0;
                        int i18 = 0;
                        while (i18 < size2) {
                            Object obj4 = arrayList.get(i18);
                            i18++;
                            ks ksVar6 = (ks) obj4;
                            if (ksVar6.c.startsWith(d)) {
                                int i19 = i17 + 1;
                                if (ksVar6.c.equals(d)) {
                                    if (ksVar5 == null || !ksVar5.c.equals(ksVar6.c)) {
                                        i17 = i19;
                                    }
                                    ksVar5 = ksVar6;
                                } else {
                                    i17 = i19;
                                }
                            }
                        }
                        if (i17 == 1 && ksVar5 != null && str2 == null) {
                            str2 = d.substring(ksVar5.c.length()) + ud0Var2.getText().toString();
                            d = ksVar5.c;
                            ud0Var.setText(d);
                        }
                        List list2 = (List) hashMap.get(d);
                        if (list2 == null) {
                            ksVar = null;
                        } else if (list2.size() > 1) {
                            String string2 = org.telegram.messenger.hp.e1().getString("phone_code_last_matched_" + d, null);
                            ksVar = (ks) t4.c.d(1, list2);
                            if (string2 != null) {
                                int size3 = arrayList.size();
                                int i20 = 0;
                                while (true) {
                                    if (i20 < size3) {
                                        Object obj5 = arrayList.get(i20);
                                        i20++;
                                        ks ksVar7 = (ks) obj5;
                                        if (Objects.equals(ksVar7.d, string2)) {
                                            ksVar = ksVar7;
                                        }
                                    }
                                }
                            }
                        } else {
                            i10 = 0;
                            ksVar = (ks) list2.get(0);
                            if (ksVar == null) {
                                wd0Var.K = true;
                                wd0Var.G = ksVar;
                                wd0Var.s(d, ksVar);
                                wd0Var.F = i10;
                            } else {
                                wd0Var.setCountryButtonText(null);
                                ud0Var2.setHintText((String) null);
                                wd0Var.F = 2;
                            }
                            if (!z10) {
                                ud0Var.setSelection(ud0Var.getText().length());
                            }
                            if (str2 != null) {
                                ud0Var2.requestFocus();
                                ud0Var2.setText(str2);
                                ud0Var2.setSelection(ud0Var2.length());
                            }
                            z11 = false;
                        }
                        i10 = 0;
                        if (ksVar == null) {
                        }
                        if (!z10) {
                        }
                        if (str2 != null) {
                        }
                        z11 = false;
                    }
                    wd0Var.L = z11;
                    break;
                }
                break;
            case 13:
                vg0 vg0Var = (vg0) obj2;
                HashMap hashMap2 = vg0Var.t1;
                ArrayList arrayList2 = vg0Var.s1;
                if (!vg0Var.v1) {
                    vg0Var.v1 = true;
                    String d10 = mf.b.d(vg0Var.F1.getText().toString(), false);
                    vg0Var.F1.setText(d10);
                    if (d10.length() == 0) {
                        vg0Var.L0(null);
                        vg0Var.H1.setHintText((String) null);
                    } else {
                        if (d10.length() > 4) {
                            while (true) {
                                if (i12 >= 1) {
                                    String substring2 = d10.substring(0, i12);
                                    List list3 = (List) hashMap2.get(substring2);
                                    if (list3 == null) {
                                        obj = str4;
                                    } else if (list3.size() > 1) {
                                        String string3 = org.telegram.messenger.hp.e1().getString("phone_code_last_matched_" + substring2, str4);
                                        obj = (ks) t4.c.d(1, list3);
                                        if (string3 != null) {
                                            int size4 = arrayList2.size();
                                            int i21 = 0;
                                            while (true) {
                                                if (i21 < size4) {
                                                    Object obj6 = arrayList2.get(i21);
                                                    i21++;
                                                    ks ksVar8 = (ks) obj6;
                                                    if (Objects.equals(ksVar8.d, string3)) {
                                                        obj = ksVar8;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        obj = (ks) list3.get(0);
                                    }
                                    if (obj != null) {
                                        str3 = d10.substring(i12) + vg0Var.H1.getText().toString();
                                        vg0Var.F1.setText(substring2);
                                        d10 = substring2;
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
                                str3 = d10.substring(1) + vg0Var.H1.getText().toString();
                                ug0 ug0Var = vg0Var.F1;
                                d10 = d10.substring(0, 1);
                                ug0Var.setText(d10);
                            }
                        } else {
                            z12 = false;
                            str3 = null;
                        }
                        int size5 = arrayList2.size();
                        int i22 = 0;
                        int i23 = 0;
                        ks ksVar9 = null;
                        while (i23 < size5) {
                            Object obj7 = arrayList2.get(i23);
                            i23++;
                            ks ksVar10 = (ks) obj7;
                            if (ksVar10.c.startsWith(d10)) {
                                i22++;
                                if (ksVar10.c.equals(d10)) {
                                    ksVar9 = ksVar10;
                                }
                            }
                        }
                        if (i22 == 1 && ksVar9 != null && str3 == null) {
                            str3 = d10.substring(ksVar9.c.length()) + vg0Var.H1.getText().toString();
                            ug0 ug0Var2 = vg0Var.F1;
                            String str5 = ksVar9.c;
                            ug0Var2.setText(str5);
                            d10 = str5;
                        }
                        List list4 = (List) hashMap2.get(d10);
                        if (list4 == null) {
                            ksVar3 = null;
                        } else if (list4.size() > 1) {
                            String string4 = org.telegram.messenger.hp.e1().getString("phone_code_last_matched_" + d10, null);
                            ksVar3 = (ks) t4.c.d(1, list4);
                            if (string4 != null) {
                                int size6 = arrayList2.size();
                                int i24 = 0;
                                while (true) {
                                    if (i24 < size6) {
                                        Object obj8 = arrayList2.get(i24);
                                        i24++;
                                        ks ksVar11 = (ks) obj8;
                                        if (Objects.equals(ksVar11.d, string4)) {
                                            ksVar3 = ksVar11;
                                        }
                                    }
                                }
                            }
                        } else {
                            ksVar3 = (ks) list4.get(0);
                        }
                        if (ksVar3 != null) {
                            vg0Var.x1 = true;
                            vg0Var.M0(d10, ksVar3);
                        } else {
                            vg0Var.L0(null);
                            vg0Var.H1.setHintText((String) null);
                        }
                        if (!z12) {
                            ug0 ug0Var3 = vg0Var.F1;
                            ug0Var3.setSelection(ug0Var3.getText().length());
                        }
                        if (str3 != null && str3.length() != 0) {
                            vg0Var.H1.requestFocus();
                            vg0Var.H1.setText(str3);
                            ug0 ug0Var4 = vg0Var.H1;
                            ug0Var4.setSelection(ug0Var4.length());
                        }
                    }
                    vg0Var.v1 = false;
                    vg0.I0(vg0Var);
                    break;
                }
                break;
            case 14:
                rm0 rm0Var = ((sm0) obj2).t0;
                if (rm0Var != null) {
                    rm0Var.u(editable);
                    break;
                }
                break;
            case 15:
                yz0 yz0Var = (yz0) obj2;
                ai.z zVar = yz0Var.h;
                String obj9 = (zVar.getText() == null || org.telegram.messenger.g0.P3(zVar.getText(), null).length() == 0) ? null : zVar.getText().toString();
                yz0Var.G.v(obj9, true, true);
                v01 v01Var = yz0Var.n;
                if (v01Var != null) {
                    v01Var.I1(null);
                    yz0Var.n.J1(TextUtils.isEmpty(obj9), true);
                }
                if (zVar != null) {
                    zVar.clearAnimation();
                    zVar.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.xq.h).start();
                }
                yz0Var.c(false);
                break;
            case 16:
                o71 o71Var = (o71) obj2;
                if (!o71Var.I) {
                    if (o71Var.a.length() <= 0) {
                        o71Var.d.setText(o71Var.H);
                        break;
                    } else {
                        String str6 = "https://" + o71Var.getMessagesController().V2 + "/addtheme/" + ((Object) o71Var.a.getText());
                        String a03 = org.telegram.messenger.bd.a0("ThemeHelpLink", null, 2131744191, str6);
                        int indexOf2 = a03.indexOf(str6);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(a03);
                        if (indexOf2 >= 0) {
                            spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.h(o71Var, str6, 10), indexOf2, str6.length() + indexOf2, 33);
                        }
                        o71Var.d.setText(TextUtils.concat(o71Var.H, "\n\n", spannableStringBuilder2));
                        break;
                    }
                }
                break;
            case 17:
                String trim = editable.toString().trim();
                l81 l81Var = (l81) obj2;
                String str7 = l81Var.n;
                if (trim.length() > 0) {
                    l81Var.n = trim.substring(0, 1).toUpperCase();
                } else {
                    l81Var.n = "";
                }
                if (!str7.equals(l81Var.n)) {
                    org.telegram.ui.Components.c70 c70Var = new org.telegram.ui.Components.c70(1, null);
                    c70Var.a(l81Var.n);
                    org.telegram.ui.Components.bk0 bk0Var = l81Var.w;
                    if (bk0Var != null) {
                        bk0Var.b(c70Var, true);
                        break;
                    }
                }
                break;
            case 18:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj2;
                v91 v91Var = twoStepVerificationActivity.W;
                if (twoStepVerificationActivity.V) {
                    org.telegram.messenger.g0.r(v91Var);
                    v91Var.run();
                    break;
                }
                break;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) obj2;
                if (usersSelectActivity.c.length() == 0) {
                    usersSelectActivity.O = false;
                    usersSelectActivity.N = false;
                    cb1 cb1Var = usersSelectActivity.h;
                    if (cb1Var.n) {
                        cb1Var.n = false;
                        cb1Var.f();
                    }
                    usersSelectActivity.h.L(null);
                    usersSelectActivity.d.setFastScrollVisible(true);
                    usersSelectActivity.d.setVerticalScrollBarEnabled(false);
                    usersSelectActivity.f.d.setText(org.telegram.messenger.bd.M0(2131748231, null));
                    break;
                } else {
                    cb1 cb1Var2 = usersSelectActivity.h;
                    boolean z14 = cb1Var2.n;
                    if (!z14) {
                        usersSelectActivity.O = true;
                        usersSelectActivity.N = true;
                        if (!z14) {
                            cb1Var2.n = true;
                            cb1Var2.f();
                        }
                        usersSelectActivity.d.setFastScrollVisible(false);
                        usersSelectActivity.d.setVerticalScrollBarEnabled(true);
                        usersSelectActivity.f.d.setText(org.telegram.messenger.bd.M0(2131748175, null));
                    }
                    usersSelectActivity.f.e(true, true);
                    usersSelectActivity.h.L(usersSelectActivity.c.getText().toString());
                    break;
                }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.a;
        Object obj = this.b;
        switch (i12) {
            case 1:
                fa faVar = (fa) obj;
                ka kaVar = faVar.c;
                String str = kaVar.r;
                kaVar.r = charSequence == null ? "" : charSequence.toString();
                ka kaVar2 = faVar.c;
                ha haVar = kaVar2.F;
                if (haVar != null && str != null) {
                    haVar.b(kaVar2.r);
                    break;
                }
                break;
            case 6:
                vq vqVar = (vq) obj;
                vqVar.S1 = charSequence.length() != 0;
                vqVar.Q1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                vqVar.V1 = ofFloat;
                ofFloat.addUpdateListener(new b3(vqVar, 8));
                if (vqVar.S1) {
                    vqVar.V1.setDuration(220L);
                } else {
                    org.telegram.messenger.camera.q.i(1.5f, vqVar.V1);
                    vqVar.V1.setDuration(350L);
                }
                vqVar.V1.start();
                vqVar.m();
                break;
            case 9:
                lb0 lb0Var = (lb0) obj;
                db0 db0Var = lb0Var.T;
                if (lb0Var.S) {
                    lb0Var.removeCallbacks(db0Var);
                    db0Var.run();
                    break;
                }
                break;
            case 10:
                fc0 fc0Var = (fc0) obj;
                dc0 dc0Var = fc0Var.y;
                if (fc0Var.x) {
                    fc0Var.removeCallbacks(dc0Var);
                    dc0Var.run();
                    break;
                }
                break;
            case 11:
                dd0 dd0Var = (dd0) obj;
                rc0 rc0Var = dd0Var.u0;
                if (dd0Var.t0) {
                    dd0Var.removeCallbacks(rc0Var);
                    rc0Var.run();
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        switch (this.a) {
            case 1:
                fa faVar = (fa) this.b;
                ka kaVar = faVar.c;
                String str = kaVar.r;
                kaVar.r = charSequence == null ? "" : charSequence.toString();
                ka kaVar2 = faVar.c;
                ha haVar = kaVar2.F;
                if (haVar != null && str != null) {
                    haVar.b(kaVar2.r);
                }
                if (!kaVar.n) {
                    kaVar.i0(kaVar.r);
                    break;
                }
                break;
            case 2:
                ad adVar = (ad) this.b;
                adVar.j0(adVar.y.getText().toString());
                break;
            case 4:
                bo boVar = (bo) this.b;
                if (!boVar.n0) {
                    String obj = boVar.b.getText().toString();
                    ha haVar2 = boVar.P;
                    if (haVar2 != null) {
                        haVar2.b(obj);
                    }
                    boVar.c0(obj);
                    break;
                }
                break;
            case 16:
                o71 o71Var = (o71) this.b;
                if (!o71Var.G) {
                    o71Var.e0(o71Var.a.getText().toString(), false);
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

    private final void A(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void B(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void C(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void D(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void E(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void F(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void G(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void H(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void I(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void J(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void g(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void h(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void i(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void j(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void k(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void l(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void m(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void n(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void o(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void p(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void q(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void r(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void s(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void t(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void u(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void v(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void w(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void x(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void y(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void z(int i3, int i10, int i11, CharSequence charSequence) {
    }
}
