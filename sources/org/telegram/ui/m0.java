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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
        ms msVar;
        boolean z10;
        ms msVar2;
        boolean z11;
        String str3;
        ms msVar3;
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
                    String a02 = org.telegram.messenger.id.a0("UsernameHelpLink", null, 2131743662, sb3);
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
                pn pnVar = (pn) obj2;
                pnVar.r.k(5L, pnVar.w.getText().toString(), null, null);
                di.c4 c4Var = pnVar.e;
                if (c4Var != null) {
                    c4Var.invalidate();
                    break;
                }
                break;
            case 4:
                ((go) obj2).b0();
                break;
            case 5:
                jp jpVar = (jp) obj2;
                kp kpVar = jpVar.e;
                if (!jpVar.d) {
                    kpVar.S = editable.toString();
                    v4.d1 K = kpVar.b.K(kpVar.u0);
                    if (K != null) {
                        kp.k0(kpVar, K.a);
                        break;
                    }
                }
                break;
            case 6:
                break;
            case 7:
                gz gzVar = ((dz) obj2).e;
                if (!TextUtils.equals(editable, gzVar.x)) {
                    gzVar.n = !TextUtils.isEmpty(editable);
                    gzVar.x = org.telegram.ui.Components.r5.onlyEmojiSpans(editable);
                    wy wyVar = gzVar.I;
                    if (wyVar != null) {
                        wyVar.e(org.telegram.ui.Components.r5.cloneSpans(gzVar.x, -1, wyVar.s.getPaint().getFontMetricsInt(), 0.5f), true);
                    }
                    xy xyVar = gzVar.J;
                    if (xyVar != null) {
                        org.telegram.ui.Cells.w3 w3Var = xyVar.r;
                        if (gz.q0(gzVar.x)) {
                            str = org.telegram.messenger.id.M0(gzVar.y ? 2131750736 : 2131750735, null);
                        } else {
                            str = null;
                        }
                        w3Var.setText(str);
                    }
                    if (gzVar.s && TextUtils.isEmpty(gzVar.x)) {
                        y4Var3 = ((org.telegram.ui.ActionBar.f2) gzVar).simpleActionBar;
                        y4Var3.setTitle(org.telegram.messenger.id.M0(2131750729, null));
                    } else {
                        y4Var = ((org.telegram.ui.ActionBar.f2) gzVar).simpleActionBar;
                        CharSequence charSequence = gzVar.x;
                        y4Var2 = ((org.telegram.ui.ActionBar.f2) gzVar).simpleActionBar;
                        y4Var.setTitle(org.telegram.ui.Components.r5.cloneSpans(charSequence, -1, y4Var2.getTitleFontMetricsInt()));
                    }
                }
                gzVar.o0(true);
                break;
            case 8:
                w40 w40Var = (w40) obj2;
                if (w40Var.f.r.length() == 0) {
                    w40Var.T = false;
                    w40Var.S = false;
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
                    boolean z12 = u40Var2.n;
                    if (!z12) {
                        w40Var.T = true;
                        w40Var.S = true;
                        if (!z12) {
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
                HashMap hashMap = be0Var.H;
                ArrayList arrayList = be0Var.G;
                zd0 zd0Var = be0Var.a;
                zd0 zd0Var2 = be0Var.b;
                if (!be0Var.K) {
                    be0Var.K = true;
                    String d = pf.b.d(zd0Var.getText().toString(), false);
                    zd0Var.setText(d);
                    if (d.length() == 0) {
                        be0Var.setCountryButtonText(null);
                        zd0Var2.setHintText((String) null);
                        be0Var.E = 1;
                        z10 = false;
                    } else {
                        if (d.length() > 4) {
                            while (true) {
                                if (i12 >= i15) {
                                    String substring = d.substring(i14, i12);
                                    List list = (List) hashMap.get(substring);
                                    if (list == null) {
                                        msVar2 = null;
                                    } else if (list.size() > i15) {
                                        String string = org.telegram.messenger.qp.e1().getString("phone_code_last_matched_" + substring, null);
                                        msVar2 = (ms) rf.b.g(i15, list);
                                        if (string != null) {
                                            int size = arrayList.size();
                                            int i16 = i14;
                                            while (true) {
                                                if (i16 < size) {
                                                    Object obj3 = arrayList.get(i16);
                                                    i16++;
                                                    ms msVar4 = (ms) obj3;
                                                    if (Objects.equals(msVar4.d, string)) {
                                                        msVar2 = msVar4;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        msVar2 = (ms) list.get(i14);
                                    }
                                    if (msVar2 != null) {
                                        str2 = d.substring(i12) + zd0Var2.getText().toString();
                                        zd0Var.setText(substring);
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
                                str2 = d.substring(1) + zd0Var2.getText().toString();
                                d = d.substring(0, 1);
                                zd0Var.setText(d);
                            }
                        } else {
                            str2 = null;
                            z9 = false;
                        }
                        int size2 = arrayList.size();
                        ms msVar5 = null;
                        int i17 = 0;
                        int i18 = 0;
                        while (i18 < size2) {
                            Object obj4 = arrayList.get(i18);
                            i18++;
                            ms msVar6 = (ms) obj4;
                            if (msVar6.c.startsWith(d)) {
                                int i19 = i17 + 1;
                                if (msVar6.c.equals(d)) {
                                    if (msVar5 == null || !msVar5.c.equals(msVar6.c)) {
                                        i17 = i19;
                                    }
                                    msVar5 = msVar6;
                                } else {
                                    i17 = i19;
                                }
                            }
                        }
                        if (i17 == 1 && msVar5 != null && str2 == null) {
                            str2 = d.substring(msVar5.c.length()) + zd0Var2.getText().toString();
                            d = msVar5.c;
                            zd0Var.setText(d);
                        }
                        List list2 = (List) hashMap.get(d);
                        if (list2 == null) {
                            msVar = null;
                        } else if (list2.size() > 1) {
                            String string2 = org.telegram.messenger.qp.e1().getString("phone_code_last_matched_" + d, null);
                            msVar = (ms) rf.b.g(1, list2);
                            if (string2 != null) {
                                int size3 = arrayList.size();
                                int i20 = 0;
                                while (true) {
                                    if (i20 < size3) {
                                        Object obj5 = arrayList.get(i20);
                                        i20++;
                                        ms msVar7 = (ms) obj5;
                                        if (Objects.equals(msVar7.d, string2)) {
                                            msVar = msVar7;
                                        }
                                    }
                                }
                            }
                        } else {
                            i10 = 0;
                            msVar = (ms) list2.get(0);
                            if (msVar == null) {
                                be0Var.J = true;
                                be0Var.F = msVar;
                                be0Var.u(d, msVar);
                                be0Var.E = i10;
                            } else {
                                be0Var.setCountryButtonText(null);
                                zd0Var2.setHintText((String) null);
                                be0Var.E = 2;
                            }
                            if (!z9) {
                                zd0Var.setSelection(zd0Var.getText().length());
                            }
                            if (str2 != null) {
                                zd0Var2.requestFocus();
                                zd0Var2.setText(str2);
                                zd0Var2.setSelection(zd0Var2.length());
                            }
                            z10 = false;
                        }
                        i10 = 0;
                        if (msVar == null) {
                        }
                        if (!z9) {
                        }
                        if (str2 != null) {
                        }
                        z10 = false;
                    }
                    be0Var.K = z10;
                    break;
                }
                break;
            case 13:
                ah0 ah0Var = (ah0) obj2;
                HashMap hashMap2 = ah0Var.s1;
                ArrayList arrayList2 = ah0Var.r1;
                if (!ah0Var.u1) {
                    ah0Var.u1 = true;
                    String d2 = pf.b.d(ah0Var.E1.getText().toString(), false);
                    ah0Var.E1.setText(d2);
                    if (d2.length() == 0) {
                        ah0Var.L0(null);
                        ah0Var.G1.setHintText((String) null);
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
                                        obj = (ms) rf.b.g(1, list3);
                                        if (string3 != null) {
                                            int size4 = arrayList2.size();
                                            int i21 = 0;
                                            while (true) {
                                                if (i21 < size4) {
                                                    Object obj6 = arrayList2.get(i21);
                                                    i21++;
                                                    ms msVar8 = (ms) obj6;
                                                    if (Objects.equals(msVar8.d, string3)) {
                                                        obj = msVar8;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        obj = (ms) list3.get(0);
                                    }
                                    if (obj != null) {
                                        str3 = d2.substring(i12) + ah0Var.G1.getText().toString();
                                        ah0Var.E1.setText(substring2);
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
                                str3 = d2.substring(1) + ah0Var.G1.getText().toString();
                                zg0 zg0Var = ah0Var.E1;
                                d2 = d2.substring(0, 1);
                                zg0Var.setText(d2);
                            }
                        } else {
                            z11 = false;
                            str3 = null;
                        }
                        int size5 = arrayList2.size();
                        int i22 = 0;
                        int i23 = 0;
                        ms msVar9 = null;
                        while (i23 < size5) {
                            Object obj7 = arrayList2.get(i23);
                            i23++;
                            ms msVar10 = (ms) obj7;
                            if (msVar10.c.startsWith(d2)) {
                                i22++;
                                if (msVar10.c.equals(d2)) {
                                    msVar9 = msVar10;
                                }
                            }
                        }
                        if (i22 == 1 && msVar9 != null && str3 == null) {
                            str3 = d2.substring(msVar9.c.length()) + ah0Var.G1.getText().toString();
                            zg0 zg0Var2 = ah0Var.E1;
                            String str5 = msVar9.c;
                            zg0Var2.setText(str5);
                            d2 = str5;
                        }
                        List list4 = (List) hashMap2.get(d2);
                        if (list4 == null) {
                            msVar3 = null;
                        } else if (list4.size() > 1) {
                            String string4 = org.telegram.messenger.qp.e1().getString("phone_code_last_matched_" + d2, null);
                            msVar3 = (ms) rf.b.g(1, list4);
                            if (string4 != null) {
                                int size6 = arrayList2.size();
                                int i24 = 0;
                                while (true) {
                                    if (i24 < size6) {
                                        Object obj8 = arrayList2.get(i24);
                                        i24++;
                                        ms msVar11 = (ms) obj8;
                                        if (Objects.equals(msVar11.d, string4)) {
                                            msVar3 = msVar11;
                                        }
                                    }
                                }
                            }
                        } else {
                            msVar3 = (ms) list4.get(0);
                        }
                        if (msVar3 != null) {
                            ah0Var.w1 = true;
                            ah0Var.M0(d2, msVar3);
                        } else {
                            ah0Var.L0(null);
                            ah0Var.G1.setHintText((String) null);
                        }
                        if (!z11) {
                            zg0 zg0Var3 = ah0Var.E1;
                            zg0Var3.setSelection(zg0Var3.getText().length());
                        }
                        if (str3 != null && str3.length() != 0) {
                            ah0Var.G1.requestFocus();
                            ah0Var.G1.setText(str3);
                            zg0 zg0Var4 = ah0Var.G1;
                            zg0Var4.setSelection(zg0Var4.length());
                        }
                    }
                    ah0Var.u1 = false;
                    ah0.I0(ah0Var);
                    break;
                }
                break;
            case 14:
                wm0 wm0Var = ((xm0) obj2).s0;
                if (wm0Var != null) {
                    wm0Var.B(editable);
                    break;
                }
                break;
            case 15:
                i01 i01Var = (i01) obj2;
                org.telegram.ui.Cells.z5 z5Var = i01Var.h;
                String obj9 = (z5Var.getText() == null || org.telegram.messenger.g0.P3(z5Var.getText(), null).length() == 0) ? null : z5Var.getText().toString();
                i01Var.F.v(obj9, true, true);
                f11 f11Var = i01Var.n;
                if (f11Var != null) {
                    f11Var.I1(null);
                    i01Var.n.J1(TextUtils.isEmpty(obj9), true);
                }
                if (z5Var != null) {
                    z5Var.clearAnimation();
                    z5Var.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.xq.h).start();
                }
                i01Var.c(false);
                break;
            case 16:
                y71 y71Var = (y71) obj2;
                if (!y71Var.H) {
                    if (y71Var.a.length() <= 0) {
                        y71Var.d.setText(y71Var.G);
                        break;
                    } else {
                        String str6 = "https://" + y71Var.getMessagesController().U2 + "/addtheme/" + ((Object) y71Var.a.getText());
                        String a03 = org.telegram.messenger.id.a0("ThemeHelpLink", null, 2131744184, str6);
                        int indexOf2 = a03.indexOf(str6);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(a03);
                        if (indexOf2 >= 0) {
                            spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.h(y71Var, str6, 10), indexOf2, str6.length() + indexOf2, 33);
                        }
                        y71Var.d.setText(TextUtils.concat(y71Var.G, "\n\n", spannableStringBuilder2));
                        break;
                    }
                }
                break;
            case 17:
                String trim = editable.toString().trim();
                v81 v81Var = (v81) obj2;
                String str7 = v81Var.n;
                if (trim.length() > 0) {
                    v81Var.n = trim.substring(0, 1).toUpperCase();
                } else {
                    v81Var.n = "";
                }
                if (!str7.equals(v81Var.n)) {
                    org.telegram.ui.Components.g70 g70Var = new org.telegram.ui.Components.g70(1, null);
                    g70Var.a(v81Var.n);
                    org.telegram.ui.Components.xj0 xj0Var = v81Var.w;
                    if (xj0Var != null) {
                        xj0Var.b(g70Var, true);
                        break;
                    }
                }
                break;
            case 18:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj2;
                fa1 fa1Var = twoStepVerificationActivity.V;
                if (twoStepVerificationActivity.U) {
                    org.telegram.messenger.g0.r(fa1Var);
                    fa1Var.run();
                    break;
                }
                break;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) obj2;
                if (usersSelectActivity.c.length() == 0) {
                    usersSelectActivity.N = false;
                    usersSelectActivity.M = false;
                    kb1 kb1Var = usersSelectActivity.h;
                    if (kb1Var.n) {
                        kb1Var.n = false;
                        kb1Var.f();
                    }
                    usersSelectActivity.h.L(null);
                    usersSelectActivity.d.setFastScrollVisible(true);
                    usersSelectActivity.d.setVerticalScrollBarEnabled(false);
                    usersSelectActivity.f.d.setText(org.telegram.messenger.id.M0(2131748224, null));
                    break;
                } else {
                    kb1 kb1Var2 = usersSelectActivity.h;
                    boolean z13 = kb1Var2.n;
                    if (!z13) {
                        usersSelectActivity.N = true;
                        usersSelectActivity.M = true;
                        if (!z13) {
                            kb1Var2.n = true;
                            kb1Var2.f();
                        }
                        usersSelectActivity.d.setFastScrollVisible(false);
                        usersSelectActivity.d.setVerticalScrollBarEnabled(true);
                        usersSelectActivity.f.d.setText(org.telegram.messenger.id.M0(2131748168, null));
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
                wq wqVar = (wq) obj;
                wqVar.R1 = charSequence.length() != 0;
                wqVar.P1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                wqVar.U1 = ofFloat;
                ofFloat.addUpdateListener(new a3(wqVar, 8));
                if (wqVar.R1) {
                    wqVar.U1.setDuration(220L);
                } else {
                    org.telegram.messenger.camera.q.i(1.5f, wqVar.U1);
                    wqVar.U1.setDuration(350L);
                }
                wqVar.U1.start();
                wqVar.m();
                break;
            case 9:
                ob0 ob0Var = (ob0) obj;
                hb0 hb0Var = ob0Var.S;
                if (ob0Var.R) {
                    ob0Var.removeCallbacks(hb0Var);
                    hb0Var.run();
                    break;
                }
                break;
            case 10:
                hc0 hc0Var = (hc0) obj;
                fc0 fc0Var = hc0Var.y;
                if (hc0Var.x) {
                    hc0Var.removeCallbacks(fc0Var);
                    fc0Var.run();
                    break;
                }
                break;
            case 11:
                gd0 gd0Var = (gd0) obj;
                tc0 tc0Var = gd0Var.t0;
                if (gd0Var.s0) {
                    gd0Var.removeCallbacks(tc0Var);
                    tc0Var.run();
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
                go goVar = (go) this.b;
                if (!goVar.m0) {
                    String obj = goVar.b.getText().toString();
                    ia iaVar2 = goVar.O;
                    if (iaVar2 != null) {
                        iaVar2.b(obj);
                    }
                    goVar.c0(obj);
                    break;
                }
                break;
            case 16:
                y71 y71Var = (y71) this.b;
                if (!y71Var.F) {
                    y71Var.e0(y71Var.a.getText().toString(), false);
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
