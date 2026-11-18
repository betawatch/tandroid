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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
        org.telegram.ui.ActionBar.a5 a5Var;
        org.telegram.ui.ActionBar.a5 a5Var2;
        org.telegram.ui.ActionBar.a5 a5Var3;
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
                    i7 = ((org.telegram.ui.ActionBar.h2) laVar).currentAccount;
                    sb2.append(org.telegram.messenger.mp.u1(i7).X2);
                    sb2.append("/");
                    sb2.append(laVar.r);
                    String sb3 = sb2.toString();
                    String a02 = org.telegram.messenger.gd.a0("UsernameHelpLink", null, 2131743422, sb3);
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
                fi.t3 t3Var = rnVar.e;
                if (t3Var != null) {
                    t3Var.invalidate();
                    break;
                }
                break;
            case 4:
                ((jo) obj2).b0();
                break;
            case 5:
                mp mpVar = (mp) obj2;
                np npVar = mpVar.e;
                if (!mpVar.d) {
                    npVar.T = editable.toString();
                    v4.f1 K = npVar.b.K(npVar.v0);
                    if (K != null) {
                        np.k0(npVar, K.a);
                        break;
                    }
                }
                break;
            case 6:
                break;
            case 7:
                kz kzVar = ((hz) obj2).e;
                if (!TextUtils.equals(editable, kzVar.x)) {
                    kzVar.n = !TextUtils.isEmpty(editable);
                    kzVar.x = org.telegram.ui.Components.x5.onlyEmojiSpans(editable);
                    az azVar = kzVar.J;
                    if (azVar != null) {
                        azVar.e(org.telegram.ui.Components.x5.cloneSpans(kzVar.x, -1, azVar.s.getPaint().getFontMetricsInt(), 0.5f), true);
                    }
                    bz bzVar = kzVar.K;
                    if (bzVar != null) {
                        org.telegram.ui.Cells.w3 w3Var = bzVar.r;
                        if (kz.q0(kzVar.x)) {
                            str = org.telegram.messenger.gd.M0(kzVar.y ? 2131750724 : 2131750723, null);
                        } else {
                            str = null;
                        }
                        w3Var.setText(str);
                    }
                    if (kzVar.s && TextUtils.isEmpty(kzVar.x)) {
                        a5Var3 = ((org.telegram.ui.ActionBar.h2) kzVar).simpleActionBar;
                        a5Var3.setTitle(org.telegram.messenger.gd.M0(2131750717, null));
                    } else {
                        a5Var = ((org.telegram.ui.ActionBar.h2) kzVar).simpleActionBar;
                        CharSequence charSequence = kzVar.x;
                        a5Var2 = ((org.telegram.ui.ActionBar.h2) kzVar).simpleActionBar;
                        a5Var.setTitle(org.telegram.ui.Components.x5.cloneSpans(charSequence, -1, a5Var2.getTitleFontMetricsInt()));
                    }
                }
                kzVar.o0(true);
                break;
            case 8:
                z40 z40Var = (z40) obj2;
                if (z40Var.f.r.length() == 0) {
                    z40Var.U = false;
                    z40Var.T = false;
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
                    boolean z13 = x40Var2.n;
                    if (!z13) {
                        z40Var.U = true;
                        z40Var.T = true;
                        if (!z13) {
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
                ce0 ce0Var = (ce0) obj2;
                HashMap hashMap = ce0Var.I;
                ArrayList arrayList = ce0Var.H;
                ae0 ae0Var = ce0Var.a;
                ae0 ae0Var2 = ce0Var.b;
                if (!ce0Var.L) {
                    ce0Var.L = true;
                    String d = pf.b.d(ae0Var.getText().toString(), false);
                    ae0Var.setText(d);
                    if (d.length() == 0) {
                        ce0Var.setCountryButtonText(null);
                        ae0Var2.setHintText((String) null);
                        ce0Var.F = 1;
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
                                        String string = org.telegram.messenger.mp.g1().getString("phone_code_last_matched_" + substring, null);
                                        psVar2 = (ps) p5.c.h(i15, list);
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
                                        str2 = d.substring(i12) + ae0Var2.getText().toString();
                                        ae0Var.setText(substring);
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
                                str2 = d.substring(1) + ae0Var2.getText().toString();
                                d = d.substring(0, 1);
                                ae0Var.setText(d);
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
                            str2 = d.substring(psVar5.c.length()) + ae0Var2.getText().toString();
                            d = psVar5.c;
                            ae0Var.setText(d);
                        }
                        List list2 = (List) hashMap.get(d);
                        if (list2 == null) {
                            psVar = null;
                        } else if (list2.size() > 1) {
                            String string2 = org.telegram.messenger.mp.g1().getString("phone_code_last_matched_" + d, null);
                            psVar = (ps) p5.c.h(1, list2);
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
                                ce0Var.K = true;
                                ce0Var.G = psVar;
                                ce0Var.u(d, psVar);
                                ce0Var.F = i10;
                            } else {
                                ce0Var.setCountryButtonText(null);
                                ae0Var2.setHintText((String) null);
                                ce0Var.F = 2;
                            }
                            if (!z10) {
                                ae0Var.setSelection(ae0Var.getText().length());
                            }
                            if (str2 != null) {
                                ae0Var2.requestFocus();
                                ae0Var2.setText(str2);
                                ae0Var2.setSelection(ae0Var2.length());
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
                    ce0Var.L = z11;
                    break;
                }
                break;
            case 13:
                eh0 eh0Var = (eh0) obj2;
                HashMap hashMap2 = eh0Var.w1;
                ArrayList arrayList2 = eh0Var.v1;
                if (!eh0Var.y1) {
                    eh0Var.y1 = true;
                    String d2 = pf.b.d(eh0Var.I1.getText().toString(), false);
                    eh0Var.I1.setText(d2);
                    if (d2.length() == 0) {
                        eh0Var.M0(null);
                        eh0Var.K1.setHintText((String) null);
                    } else {
                        if (d2.length() > 4) {
                            while (true) {
                                if (i12 >= 1) {
                                    String substring2 = d2.substring(0, i12);
                                    List list3 = (List) hashMap2.get(substring2);
                                    if (list3 == null) {
                                        obj = str4;
                                    } else if (list3.size() > 1) {
                                        String string3 = org.telegram.messenger.mp.g1().getString("phone_code_last_matched_" + substring2, str4);
                                        obj = (ps) p5.c.h(1, list3);
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
                                        str3 = d2.substring(i12) + eh0Var.K1.getText().toString();
                                        eh0Var.I1.setText(substring2);
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
                                str3 = d2.substring(1) + eh0Var.K1.getText().toString();
                                dh0 dh0Var = eh0Var.I1;
                                d2 = d2.substring(0, 1);
                                dh0Var.setText(d2);
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
                            str3 = d2.substring(psVar9.c.length()) + eh0Var.K1.getText().toString();
                            dh0 dh0Var2 = eh0Var.I1;
                            String str5 = psVar9.c;
                            dh0Var2.setText(str5);
                            d2 = str5;
                        }
                        List list4 = (List) hashMap2.get(d2);
                        if (list4 == null) {
                            psVar3 = null;
                        } else if (list4.size() > 1) {
                            String string4 = org.telegram.messenger.mp.g1().getString("phone_code_last_matched_" + d2, null);
                            psVar3 = (ps) p5.c.h(1, list4);
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
                            eh0Var.A1 = true;
                            eh0Var.N0(d2, psVar3);
                        } else {
                            eh0Var.M0(null);
                            eh0Var.K1.setHintText((String) null);
                        }
                        if (!z12) {
                            dh0 dh0Var3 = eh0Var.I1;
                            dh0Var3.setSelection(dh0Var3.getText().length());
                        }
                        if (str3 != null && str3.length() != 0) {
                            eh0Var.K1.requestFocus();
                            eh0Var.K1.setText(str3);
                            dh0 dh0Var4 = eh0Var.K1;
                            dh0Var4.setSelection(dh0Var4.length());
                        }
                    }
                    eh0Var.y1 = false;
                    eh0.J0(eh0Var);
                    break;
                }
                break;
            case 14:
                bn0 bn0Var = ((cn0) obj2).t0;
                if (bn0Var != null) {
                    bn0Var.A(editable);
                    break;
                }
                break;
            case 15:
                j01 j01Var = (j01) obj2;
                bi.u uVar = j01Var.h;
                String obj9 = (uVar.getText() == null || org.telegram.messenger.g0.N3(uVar.getText(), null).length() == 0) ? null : uVar.getText().toString();
                j01Var.G.v(obj9, true, true);
                g11 g11Var = j01Var.n;
                if (g11Var != null) {
                    g11Var.I1(null);
                    j01Var.n.J1(TextUtils.isEmpty(obj9), true);
                }
                if (uVar != null) {
                    uVar.clearAnimation();
                    uVar.animate().translationX(0.0f).setInterpolator(org.telegram.ui.Components.lr.h).start();
                }
                j01Var.c(false);
                break;
            case 16:
                a81 a81Var = (a81) obj2;
                if (!a81Var.I) {
                    if (a81Var.a.length() <= 0) {
                        a81Var.d.setText(a81Var.H);
                        break;
                    } else {
                        String str6 = "https://" + a81Var.getMessagesController().X2 + "/addtheme/" + ((Object) a81Var.a.getText());
                        String a03 = org.telegram.messenger.gd.a0("ThemeHelpLink", null, 2131743946, str6);
                        int indexOf2 = a03.indexOf(str6);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(a03);
                        if (indexOf2 >= 0) {
                            spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.h(a81Var, str6, 9), indexOf2, str6.length() + indexOf2, 33);
                        }
                        a81Var.d.setText(TextUtils.concat(a81Var.H, "\n\n", spannableStringBuilder2));
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
                    org.telegram.ui.Components.u70 u70Var = new org.telegram.ui.Components.u70(1, null);
                    u70Var.a(w81Var.n);
                    org.telegram.ui.Components.kk0 kk0Var = w81Var.w;
                    if (kk0Var != null) {
                        kk0Var.b(u70Var, true);
                        break;
                    }
                }
                break;
            case 18:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj2;
                ha1 ha1Var = twoStepVerificationActivity.W;
                if (twoStepVerificationActivity.V) {
                    org.telegram.messenger.g0.r(ha1Var);
                    ha1Var.run();
                    break;
                }
                break;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) obj2;
                if (usersSelectActivity.c.length() == 0) {
                    usersSelectActivity.O = false;
                    usersSelectActivity.N = false;
                    mb1 mb1Var = usersSelectActivity.h;
                    if (mb1Var.n) {
                        mb1Var.n = false;
                        mb1Var.f();
                    }
                    usersSelectActivity.h.L(null);
                    usersSelectActivity.d.setFastScrollVisible(true);
                    usersSelectActivity.d.setVerticalScrollBarEnabled(false);
                    usersSelectActivity.f.d.setText(org.telegram.messenger.gd.M0(2131748031, null));
                    break;
                } else {
                    mb1 mb1Var2 = usersSelectActivity.h;
                    boolean z14 = mb1Var2.n;
                    if (!z14) {
                        usersSelectActivity.O = true;
                        usersSelectActivity.N = true;
                        if (!z14) {
                            mb1Var2.n = true;
                            mb1Var2.f();
                        }
                        usersSelectActivity.d.setFastScrollVisible(false);
                        usersSelectActivity.d.setVerticalScrollBarEnabled(true);
                        usersSelectActivity.f.d.setText(org.telegram.messenger.gd.M0(2131747975, null));
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
                zq zqVar = (zq) obj;
                zqVar.X1 = charSequence.length() != 0;
                zqVar.V1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                zqVar.a2 = ofFloat;
                ofFloat.addUpdateListener(new a3(zqVar, 8));
                if (zqVar.X1) {
                    zqVar.a2.setDuration(220L);
                } else {
                    org.telegram.ui.Cells.c0.q(1.5f, zqVar.a2);
                    zqVar.a2.setDuration(350L);
                }
                zqVar.a2.start();
                zqVar.m();
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
                gd0 gd0Var = (gd0) obj;
                sc0 sc0Var = gd0Var.u0;
                if (gd0Var.t0) {
                    gd0Var.removeCallbacks(sc0Var);
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
                jo joVar = (jo) this.b;
                if (!joVar.n0) {
                    String obj = joVar.b.getText().toString();
                    ia iaVar2 = joVar.P;
                    if (iaVar2 != null) {
                        iaVar2.b(obj);
                    }
                    joVar.c0(obj);
                    break;
                }
                break;
            case 16:
                a81 a81Var = (a81) this.b;
                if (!a81Var.G) {
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
