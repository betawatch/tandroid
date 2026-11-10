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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        org.telegram.ui.ActionBar.z4 z4Var3;
        String str;
        String str2;
        boolean z9;
        int i10;
        ps psVar;
        boolean z10;
        ps psVar2;
        boolean z11;
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
                jz jzVar = ((gz) obj2).e;
                if (!TextUtils.equals(editable, jzVar.x)) {
                    jzVar.n = !TextUtils.isEmpty(editable);
                    jzVar.x = org.telegram.ui.Components.q5.onlyEmojiSpans(editable);
                    zy zyVar = jzVar.I;
                    if (zyVar != null) {
                        zyVar.e(org.telegram.ui.Components.q5.cloneSpans(jzVar.x, -1, zyVar.s.getPaint().getFontMetricsInt(), 0.5f), true);
                    }
                    az azVar = jzVar.J;
                    if (azVar != null) {
                        org.telegram.ui.Cells.w3 w3Var = azVar.r;
                        if (jz.q0(jzVar.x)) {
                            str = org.telegram.messenger.id.M0(jzVar.y ? 2131750735 : 2131750734, null);
                        } else {
                            str = null;
                        }
                        w3Var.setText(str);
                    }
                    if (jzVar.s && TextUtils.isEmpty(jzVar.x)) {
                        z4Var3 = ((org.telegram.ui.ActionBar.f2) jzVar).simpleActionBar;
                        z4Var3.setTitle(org.telegram.messenger.id.M0(2131750728, null));
                    } else {
                        z4Var = ((org.telegram.ui.ActionBar.f2) jzVar).simpleActionBar;
                        CharSequence charSequence = jzVar.x;
                        z4Var2 = ((org.telegram.ui.ActionBar.f2) jzVar).simpleActionBar;
                        z4Var.setTitle(org.telegram.ui.Components.q5.cloneSpans(charSequence, -1, z4Var2.getTitleFontMetricsInt()));
                    }
                }
                jzVar.o0(true);
                break;
            case 8:
                z40 z40Var = (z40) obj2;
                if (z40Var.f.r.length() == 0) {
                    z40Var.T = false;
                    z40Var.S = false;
                    x40 x40Var = z40Var.w;
                    if (x40Var.n) {
                        x40Var.n = false;
                        x40Var.f();
                    }
                    z40Var.w.L(null);
                    z40Var.n.setFastScrollVisible(true);
                    z40Var.n.setVerticalScrollBarEnabled(false);
                    z40Var.v0(0);
                    break;
                } else {
                    x40 x40Var2 = z40Var.w;
                    boolean z12 = x40Var2.n;
                    if (!z12) {
                        z40Var.T = true;
                        z40Var.S = true;
                        if (!z12) {
                            x40Var2.n = true;
                            x40Var2.f();
                        }
                        z40Var.n.setFastScrollVisible(false);
                        z40Var.n.setVerticalScrollBarEnabled(true);
                    }
                    z40Var.w.L(z40Var.f.r.getText().toString());
                    z40Var.s.e(true, false);
                    break;
                }
            case 9:
            case 10:
            case 11:
                break;
            case 12:
                ee0 ee0Var = (ee0) obj2;
                HashMap hashMap = ee0Var.H;
                ArrayList arrayList = ee0Var.G;
                ce0 ce0Var = ee0Var.a;
                ce0 ce0Var2 = ee0Var.b;
                if (!ee0Var.K) {
                    ee0Var.K = true;
                    String d = pf.b.d(ce0Var.getText().toString(), false);
                    ce0Var.setText(d);
                    if (d.length() == 0) {
                        ee0Var.setCountryButtonText(null);
                        ce0Var2.setHintText((String) null);
                        ee0Var.E = 1;
                        z10 = false;
                    } else {
                        if (d.length() > 4) {
                            while (true) {
                                if (i12 >= i15) {
                                    String substring = d.substring(i14, i12);
                                    List list = (List) hashMap.get(substring);
                                    if (list == null) {
                                        psVar2 = null;
                                    } else if (list.size() > i15) {
                                        String string = org.telegram.messenger.qp.e1().getString("phone_code_last_matched_" + substring, null);
                                        psVar2 = (ps) rf.b.g(i15, list);
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
                                        str2 = d.substring(i12) + ce0Var2.getText().toString();
                                        ce0Var.setText(substring);
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
                                str2 = d.substring(1) + ce0Var2.getText().toString();
                                d = d.substring(0, 1);
                                ce0Var.setText(d);
                            }
                        } else {
                            str2 = null;
                            z9 = false;
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
                            str2 = d.substring(psVar5.c.length()) + ce0Var2.getText().toString();
                            d = psVar5.c;
                            ce0Var.setText(d);
                        }
                        List list2 = (List) hashMap.get(d);
                        if (list2 == null) {
                            psVar = null;
                        } else if (list2.size() > 1) {
                            String string2 = org.telegram.messenger.qp.e1().getString("phone_code_last_matched_" + d, null);
                            psVar = (ps) rf.b.g(1, list2);
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
                                ee0Var.J = true;
                                ee0Var.F = psVar;
                                ee0Var.u(d, psVar);
                                ee0Var.E = i10;
                            } else {
                                ee0Var.setCountryButtonText(null);
                                ce0Var2.setHintText((String) null);
                                ee0Var.E = 2;
                            }
                            if (!z9) {
                                ce0Var.setSelection(ce0Var.getText().length());
                            }
                            if (str2 != null) {
                                ce0Var2.requestFocus();
                                ce0Var2.setText(str2);
                                ce0Var2.setSelection(ce0Var2.length());
                            }
                            z10 = false;
                        }
                        i10 = 0;
                        if (psVar == null) {
                        }
                        if (!z9) {
                        }
                        if (str2 != null) {
                        }
                        z10 = false;
                    }
                    ee0Var.K = z10;
                    break;
                }
                break;
            case 13:
                dh0 dh0Var = (dh0) obj2;
                HashMap hashMap2 = dh0Var.v1;
                ArrayList arrayList2 = dh0Var.u1;
                if (!dh0Var.x1) {
                    dh0Var.x1 = true;
                    String d2 = pf.b.d(dh0Var.H1.getText().toString(), false);
                    dh0Var.H1.setText(d2);
                    if (d2.length() == 0) {
                        dh0Var.L0(null);
                        dh0Var.J1.setHintText((String) null);
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
                                        obj = (ps) rf.b.g(1, list3);
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
                                        str3 = d2.substring(i12) + dh0Var.J1.getText().toString();
                                        dh0Var.H1.setText(substring2);
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
                                str3 = d2.substring(1) + dh0Var.J1.getText().toString();
                                ch0 ch0Var = dh0Var.H1;
                                d2 = d2.substring(0, 1);
                                ch0Var.setText(d2);
                            }
                        } else {
                            z11 = false;
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
                            str3 = d2.substring(psVar9.c.length()) + dh0Var.J1.getText().toString();
                            ch0 ch0Var2 = dh0Var.H1;
                            String str5 = psVar9.c;
                            ch0Var2.setText(str5);
                            d2 = str5;
                        }
                        List list4 = (List) hashMap2.get(d2);
                        if (list4 == null) {
                            psVar3 = null;
                        } else if (list4.size() > 1) {
                            String string4 = org.telegram.messenger.qp.e1().getString("phone_code_last_matched_" + d2, null);
                            psVar3 = (ps) rf.b.g(1, list4);
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
                            dh0Var.z1 = true;
                            dh0Var.M0(d2, psVar3);
                        } else {
                            dh0Var.L0(null);
                            dh0Var.J1.setHintText((String) null);
                        }
                        if (!z11) {
                            ch0 ch0Var3 = dh0Var.H1;
                            ch0Var3.setSelection(ch0Var3.getText().length());
                        }
                        if (str3 != null && str3.length() != 0) {
                            dh0Var.J1.requestFocus();
                            dh0Var.J1.setText(str3);
                            ch0 ch0Var4 = dh0Var.J1;
                            ch0Var4.setSelection(ch0Var4.length());
                        }
                    }
                    dh0Var.x1 = false;
                    dh0.I0(dh0Var);
                    break;
                }
                break;
            case 14:
                zm0 zm0Var = ((an0) obj2).s0;
                if (zm0Var != null) {
                    zm0Var.B(editable);
                    break;
                }
                break;
            case 15:
                l01 l01Var = (l01) obj2;
                org.telegram.ui.Cells.z5 z5Var = l01Var.h;
                String obj9 = (z5Var.getText() == null || org.telegram.messenger.g0.P3(z5Var.getText(), null).length() == 0) ? null : z5Var.getText().toString();
                l01Var.F.v(obj9, true, true);
                i11 i11Var = l01Var.n;
                if (i11Var != null) {
                    i11Var.I1(null);
                    l01Var.n.J1(TextUtils.isEmpty(obj9), true);
                }
                if (z5Var != null) {
                    z5Var.clearAnimation();
                    z5Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.wq.h).start();
                }
                l01Var.c(false);
                break;
            case 16:
                a81 a81Var = (a81) obj2;
                if (!a81Var.H) {
                    if (a81Var.a.length() <= 0) {
                        a81Var.d.setText(a81Var.G);
                        break;
                    } else {
                        String str6 = "https://" + a81Var.getMessagesController().U2 + "/addtheme/" + ((Object) a81Var.a.getText());
                        String a03 = org.telegram.messenger.id.a0("ThemeHelpLink", null, 2131744181, str6);
                        int indexOf2 = a03.indexOf(str6);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(a03);
                        if (indexOf2 >= 0) {
                            spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.h(a81Var, str6, 10), indexOf2, str6.length() + indexOf2, 33);
                        }
                        a81Var.d.setText(TextUtils.concat(a81Var.G, "\n\n", spannableStringBuilder2));
                        break;
                    }
                }
                break;
            case 17:
                String trim = editable.toString().trim();
                x81 x81Var = (x81) obj2;
                String str7 = x81Var.n;
                if (trim.length() > 0) {
                    x81Var.n = trim.substring(0, 1).toUpperCase();
                } else {
                    x81Var.n = "";
                }
                if (!str7.equals(x81Var.n)) {
                    org.telegram.ui.Components.g70 g70Var = new org.telegram.ui.Components.g70(1, null);
                    g70Var.a(x81Var.n);
                    org.telegram.ui.Components.xj0 xj0Var = x81Var.w;
                    if (xj0Var != null) {
                        xj0Var.b(g70Var, true);
                        break;
                    }
                }
                break;
            case 18:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj2;
                ia1 ia1Var = twoStepVerificationActivity.V;
                if (twoStepVerificationActivity.U) {
                    org.telegram.messenger.g0.r(ia1Var);
                    ia1Var.run();
                    break;
                }
                break;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) obj2;
                if (usersSelectActivity.c.length() == 0) {
                    usersSelectActivity.N = false;
                    usersSelectActivity.M = false;
                    nb1 nb1Var = usersSelectActivity.h;
                    if (nb1Var.n) {
                        nb1Var.n = false;
                        nb1Var.f();
                    }
                    usersSelectActivity.h.L(null);
                    usersSelectActivity.d.setFastScrollVisible(true);
                    usersSelectActivity.d.setVerticalScrollBarEnabled(false);
                    usersSelectActivity.f.d.setText(org.telegram.messenger.id.M0(2131748223, null));
                    break;
                } else {
                    nb1 nb1Var2 = usersSelectActivity.h;
                    boolean z13 = nb1Var2.n;
                    if (!z13) {
                        usersSelectActivity.N = true;
                        usersSelectActivity.M = true;
                        if (!z13) {
                            nb1Var2.n = true;
                            nb1Var2.f();
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
                zq zqVar = (zq) obj;
                zqVar.R1 = charSequence.length() != 0;
                zqVar.P1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                zqVar.U1 = ofFloat;
                ofFloat.addUpdateListener(new a3(zqVar, 8));
                if (zqVar.R1) {
                    zqVar.U1.setDuration(220L);
                } else {
                    org.telegram.messenger.camera.q.i(1.5f, zqVar.U1);
                    zqVar.U1.setDuration(350L);
                }
                zqVar.U1.start();
                zqVar.m();
                break;
            case 9:
                rb0 rb0Var = (rb0) obj;
                kb0 kb0Var = rb0Var.S;
                if (rb0Var.R) {
                    rb0Var.removeCallbacks(kb0Var);
                    kb0Var.run();
                    break;
                }
                break;
            case 10:
                kc0 kc0Var = (kc0) obj;
                ic0 ic0Var = kc0Var.y;
                if (kc0Var.x) {
                    kc0Var.removeCallbacks(ic0Var);
                    ic0Var.run();
                    break;
                }
                break;
            case 11:
                jd0 jd0Var = (jd0) obj;
                xc0 xc0Var = jd0Var.t0;
                if (jd0Var.s0) {
                    jd0Var.removeCallbacks(xc0Var);
                    xc0Var.run();
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
                a81 a81Var = (a81) this.b;
                if (!a81Var.F) {
                    a81Var.e0(a81Var.a.getText().toString(), false);
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
