package org.telegram.ui;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class kj0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ bk0 a;

    public kj0(bk0 bk0Var) {
        this.a = bk0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0217  */
    @Override // org.telegram.ui.ActionBar.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i7) {
        int i10;
        int i11;
        int i12;
        JSONObject jSONObject;
        HashMap hashMap;
        HashMap hashMap2;
        String str;
        int i13;
        String obj;
        bk0 bk0Var = this.a;
        int i14 = bk0Var.b;
        if (i7 == -1) {
            if (bk0Var.b1(true)) {
                return;
            }
            if (i14 == 0 || i14 == 5) {
                bk0Var.a1(false);
            }
            bk0Var.finishFragment();
            return;
        }
        if (i7 == 1) {
            if (bk0Var.getParentActivity() == null) {
                return;
            }
            org.telegram.ui.Components.w70 w70Var = new org.telegram.ui.Components.w70(bk0Var.getParentActivity(), null);
            String M0 = org.telegram.messenger.hd.M0(2131747558, null);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
            int indexOf = M0.indexOf(42);
            int lastIndexOf = M0.lastIndexOf(42);
            if (indexOf != -1 && lastIndexOf != -1) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.i4(org.telegram.messenger.hd.M0(2131747556, null), 4, this), indexOf, lastIndexOf - 1, 33);
            }
            w70Var.setText(spannableStringBuilder);
            w70Var.setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.k5, null);
            org.telegram.ui.ActionBar.r6.D(w70Var, org.telegram.ui.ActionBar.k6.l5, null);
            w70Var.setPadding(org.telegram.messenger.g0.L(23.0f), 0, org.telegram.messenger.g0.L(23.0f), 0);
            w70Var.setMovementMethod(new org.telegram.messenger.c0(false));
            org.telegram.ui.ActionBar.r6.V(w70Var, org.telegram.ui.ActionBar.k6.j5, null);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bk0Var.getParentActivity());
            alertDialog$Builder.o(w70Var);
            String M02 = org.telegram.messenger.hd.M0(2131747557, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M02;
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752041, null), null);
            bk0Var.showDialog(u1Var);
            return;
        }
        if (i7 == 2) {
            if (i14 == 5) {
                bk0Var.F1(false);
                return;
            }
            if (i14 == 7) {
                bk0Var.J1[bk0Var.I1].h(null);
                return;
            }
            ef0 ef0Var = new ef0(this, 6);
            m4.d0 d0Var = new m4.d0(this, ef0Var, false);
            if (i14 == 4) {
                if (bk0Var.f) {
                    obj = bk0Var.d1;
                } else if (bk0.H0(bk0Var)) {
                    return;
                } else {
                    obj = bk0Var.Y[0].getText().toString();
                }
                ((gj0) bk0Var.B1).c(bk0Var.E, obj, null, null, null, null, null, null, null, null, ef0Var, d0Var);
            } else if (i14 == 3) {
                if (bk0Var.f) {
                    i13 = ((org.telegram.ui.ActionBar.f2) bk0Var).currentAccount;
                    str = org.telegram.messenger.p10.i(i13).f().phone;
                } else {
                    if (bk0.H0(bk0Var)) {
                        return;
                    }
                    str = bk0Var.Y[1].getText().toString() + bk0Var.Y[2].getText().toString();
                }
                ((gj0) bk0Var.B1).c(bk0Var.E, str, null, null, null, null, null, null, null, null, ef0Var, d0Var);
            } else if (i14 == 2) {
                if (!bk0Var.o1.isEmpty() || bk0.H0(bk0Var)) {
                    return;
                }
                if (bk0Var.y1()) {
                    bk0Var.finishFragment();
                    return;
                }
                if (!bk0Var.v0) {
                    jSONObject = new JSONObject();
                    try {
                        jSONObject.put("street_line1", bk0Var.Y[0].getText().toString());
                        jSONObject.put("street_line2", bk0Var.Y[1].getText().toString());
                        jSONObject.put("post_code", bk0Var.Y[2].getText().toString());
                        jSONObject.put("city", bk0Var.Y[3].getText().toString());
                        jSONObject.put("state", bk0Var.Y[4].getText().toString());
                        jSONObject.put("country_code", bk0Var.s);
                    } catch (Exception unused) {
                    }
                    hashMap = bk0Var.w1;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    hashMap2 = bk0Var.x1;
                    if (hashMap2 != null) {
                        hashMap2.clear();
                    }
                    ((gj0) bk0Var.B1).c(bk0Var.E, null, jSONObject != null ? jSONObject.toString() : null, bk0Var.F, null, bk0Var.i1, bk0Var.j1, bk0Var.k1, null, null, ef0Var, d0Var);
                }
                jSONObject = null;
                hashMap = bk0Var.w1;
                if (hashMap != null) {
                }
                hashMap2 = bk0Var.x1;
                if (hashMap2 != null) {
                }
                ((gj0) bk0Var.B1).c(bk0Var.E, null, jSONObject != null ? jSONObject.toString() : null, bk0Var.F, null, bk0Var.i1, bk0Var.j1, bk0Var.k1, null, null, ef0Var, d0Var);
            } else if (i14 == 1) {
                if (!c(ef0Var, d0Var)) {
                    return;
                }
            } else if (i14 == 6) {
                TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposePassport();
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode.code = bk0Var.Y[0].getText().toString();
                verifyemail.verification = tL_emailVerificationCode;
                i10 = ((org.telegram.ui.ActionBar.f2) bk0Var).currentAccount;
                int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(verifyemail, new bi.g2(this, ef0Var, d0Var, verifyemail, 15));
                i11 = ((org.telegram.ui.ActionBar.f2) bk0Var).currentAccount;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                i12 = ((org.telegram.ui.ActionBar.f2) bk0Var).classGuid;
                connectionsManager.bindRequestToGuid(sendRequest, i12);
            }
            bk0Var.R1(true, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0309  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v2, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(ef0 ef0Var, m4.d0 d0Var) {
        ?? r19;
        int i7;
        char c10;
        int i10;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        HashMap hashMap;
        HashMap hashMap2;
        LinearLayout linearLayout;
        char c11;
        int i11;
        char c12;
        boolean z9;
        int i12;
        bk0 bk0Var = this.a;
        int[] iArr = bk0Var.y;
        boolean[] zArr = bk0Var.t0;
        char c13 = 0;
        if (!bk0Var.o1.isEmpty() || bk0.H0(bk0Var)) {
            return false;
        }
        int i13 = 3;
        char c14 = 2;
        org.telegram.messenger.ew ewVar = null;
        ?? r15 = 1;
        if (bk0Var.u0) {
            bk0Var.u0 = false;
            int i14 = 0;
            boolean z10 = false;
            while (i14 < zArr.length) {
                if (zArr[i14]) {
                    bk0Var.Y[i14].setErrorText(org.telegram.messenger.hd.M0(2131747448, null));
                    if (!z10) {
                        String S0 = zArr[c13] ? org.telegram.messenger.hd.E0().S0(bk0Var.a0[c13].getText().toString(), r15, r15) : bk0Var.Y[c13].getText().toString();
                        String S02 = zArr[r15] ? org.telegram.messenger.hd.E0().S0(bk0Var.a0[r15].getText().toString(), r15, r15) : bk0Var.Y[r15].getText().toString();
                        String S03 = zArr[c14] ? org.telegram.messenger.hd.E0().S0(bk0Var.a0[c14].getText().toString(), r15, r15) : bk0Var.Y[c14].getText().toString();
                        if (TextUtils.isEmpty(S0) || TextUtils.isEmpty(S02) || TextUtils.isEmpty(S03)) {
                            c11 = c13;
                            i11 = i13;
                            c12 = c14;
                            z9 = r15;
                            i12 = i14;
                            bk0Var.D1(bk0Var.Y[i12]);
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bk0Var.getParentActivity());
                            Object[] objArr = new Object[i13];
                            objArr[c13] = S0;
                            objArr[r15] = S02;
                            objArr[c14] = S03;
                            c12 = c14;
                            String a02 = org.telegram.messenger.hd.a0("PassportNameCheckAlert", null, 2131747502, objArr);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                            u1Var.T = a02;
                            u1Var.R = org.telegram.messenger.hd.M0(R.string.AppName, null);
                            c11 = c13;
                            z9 = r15;
                            i12 = i14;
                            i11 = i13;
                            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751355, null), new org.telegram.ui.Components.s0(this, S0, S02, S03, ef0Var, d0Var, 1));
                            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751336, null), new l2.q(this, i12, 15));
                            bk0Var.showDialog(u1Var);
                        }
                        z10 = z9;
                        i14 = i12 + 1;
                        c14 = c12;
                        i13 = i11;
                        r15 = z9;
                        c13 = c11;
                    }
                }
                c11 = c13;
                i11 = i13;
                c12 = c14;
                z9 = r15;
                i12 = i14;
                i14 = i12 + 1;
                c14 = c12;
                i13 = i11;
                r15 = z9;
                c13 = c11;
            }
            boolean z11 = c13;
            i7 = i13;
            c10 = c14;
            i10 = r15;
            r19 = z11;
            if (z10) {
                return z11;
            }
        } else {
            r19 = 0;
            i7 = 3;
            c10 = 2;
            i10 = 1;
        }
        if (bk0Var.y1()) {
            bk0Var.finishFragment();
            return r19;
        }
        try {
            if (bk0Var.v0) {
                jSONObject = null;
            } else {
                HashMap hashMap3 = new HashMap(bk0Var.s1);
                if (bk0Var.E.native_names) {
                    if (bk0Var.q0.getVisibility() == 0) {
                        hashMap3.put("first_name_native", bk0Var.a0[r19].getText().toString());
                        hashMap3.put("middle_name_native", bk0Var.a0[i10].getText().toString());
                        hashMap3.put("last_name_native", bk0Var.a0[c10].getText().toString());
                    } else {
                        hashMap3.put("first_name_native", bk0Var.Y[r19].getText().toString());
                        hashMap3.put("middle_name_native", bk0Var.Y[i10].getText().toString());
                        hashMap3.put("last_name_native", bk0Var.Y[c10].getText().toString());
                    }
                }
                hashMap3.put("first_name", bk0Var.Y[r19].getText().toString());
                hashMap3.put("middle_name", bk0Var.Y[i10].getText().toString());
                hashMap3.put("last_name", bk0Var.Y[c10].getText().toString());
                hashMap3.put("birth_date", bk0Var.Y[i7].getText().toString());
                hashMap3.put("gender", bk0Var.x);
                hashMap3.put("country_code", bk0Var.s);
                hashMap3.put("residence_country_code", bk0Var.w);
                jSONObject = new JSONObject();
                try {
                    ArrayList arrayList = new ArrayList(hashMap3.keySet());
                    final int i15 = r19;
                    Collections.sort(arrayList, new Comparator(this) { // from class: org.telegram.ui.jj0
                        public final /* synthetic */ kj0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            String str = (String) obj;
                            String str2 = (String) obj2;
                            switch (i15) {
                                case 0:
                                    bk0 bk0Var2 = this.b.a;
                                    int G0 = bk0.G0(bk0Var2, str);
                                    int G02 = bk0.G0(bk0Var2, str2);
                                    if (G0 >= G02) {
                                        if (G0 > G02) {
                                        }
                                    }
                                    break;
                                default:
                                    bk0 bk0Var3 = this.b.a;
                                    int G03 = bk0.G0(bk0Var3, str);
                                    int G04 = bk0.G0(bk0Var3, str2);
                                    if (G03 >= G04) {
                                        if (G03 > G04) {
                                        }
                                    }
                                    break;
                            }
                            return 0;
                        }
                    });
                    int size = arrayList.size();
                    for (int i16 = 0; i16 < size; i16++) {
                        String str = (String) arrayList.get(i16);
                        jSONObject.put(str, hashMap3.get(str));
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            jSONObject = null;
            jSONObject2 = null;
        }
        if (bk0Var.F != null) {
            HashMap hashMap4 = new HashMap(bk0Var.t1);
            hashMap4.put("document_no", bk0Var.Y[7].getText().toString());
            if (iArr[0] != 0) {
                Locale locale = Locale.US;
                Integer valueOf = Integer.valueOf(iArr[c10]);
                Integer valueOf2 = Integer.valueOf(iArr[i10]);
                Integer valueOf3 = Integer.valueOf(iArr[0]);
                Object[] objArr2 = new Object[i7];
                objArr2[0] = valueOf;
                objArr2[i10] = valueOf2;
                objArr2[c10] = valueOf3;
                hashMap4.put("expiry_date", String.format(locale, "%02d.%02d.%d", objArr2));
            } else {
                hashMap4.put("expiry_date", "");
            }
            jSONObject2 = new JSONObject();
            try {
                ArrayList arrayList2 = new ArrayList(hashMap4.keySet());
                final int i17 = i10;
                Collections.sort(arrayList2, new Comparator(this) { // from class: org.telegram.ui.jj0
                    public final /* synthetic */ kj0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        String str2 = (String) obj;
                        String str22 = (String) obj2;
                        switch (i17) {
                            case 0:
                                bk0 bk0Var2 = this.b.a;
                                int G0 = bk0.G0(bk0Var2, str2);
                                int G02 = bk0.G0(bk0Var2, str22);
                                if (G0 >= G02) {
                                    if (G0 > G02) {
                                    }
                                }
                                break;
                            default:
                                bk0 bk0Var3 = this.b.a;
                                int G03 = bk0.G0(bk0Var3, str2);
                                int G04 = bk0.G0(bk0Var3, str22);
                                if (G03 >= G04) {
                                    if (G03 > G04) {
                                    }
                                }
                                break;
                        }
                        return 0;
                    }
                });
                int size2 = arrayList2.size();
                for (int i18 = 0; i18 < size2; i18++) {
                    String str2 = (String) arrayList2.get(i18);
                    jSONObject2.put(str2, hashMap4.get(str2));
                }
            } catch (Exception unused3) {
            }
            hashMap = bk0Var.w1;
            if (hashMap != null) {
                hashMap.clear();
            }
            hashMap2 = bk0Var.x1;
            if (hashMap2 != null) {
                hashMap2.clear();
            }
            sj0 sj0Var = bk0Var.B1;
            TLRPC.TL_secureRequiredType tL_secureRequiredType = bk0Var.E;
            String jSONObject3 = jSONObject == null ? jSONObject.toString() : null;
            TLRPC.TL_secureRequiredType tL_secureRequiredType2 = bk0Var.F;
            String jSONObject4 = jSONObject2 == null ? jSONObject2.toString() : null;
            org.telegram.messenger.ew ewVar2 = bk0Var.j1;
            ArrayList arrayList3 = bk0Var.k1;
            org.telegram.messenger.ew ewVar3 = bk0Var.l1;
            linearLayout = bk0Var.f0;
            if (linearLayout != null && linearLayout.getVisibility() == 0) {
                ewVar = bk0Var.m1;
            }
            ((gj0) sj0Var).c(tL_secureRequiredType, null, jSONObject3, tL_secureRequiredType2, jSONObject4, null, ewVar2, arrayList3, ewVar3, ewVar, ef0Var, d0Var);
            return true;
        }
        jSONObject2 = null;
        hashMap = bk0Var.w1;
        if (hashMap != null) {
        }
        hashMap2 = bk0Var.x1;
        if (hashMap2 != null) {
        }
        sj0 sj0Var2 = bk0Var.B1;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3 = bk0Var.E;
        if (jSONObject == null) {
        }
        TLRPC.TL_secureRequiredType tL_secureRequiredType22 = bk0Var.F;
        if (jSONObject2 == null) {
        }
        org.telegram.messenger.ew ewVar22 = bk0Var.j1;
        ArrayList arrayList32 = bk0Var.k1;
        org.telegram.messenger.ew ewVar32 = bk0Var.l1;
        linearLayout = bk0Var.f0;
        if (linearLayout != null) {
            ewVar = bk0Var.m1;
        }
        ((gj0) sj0Var2).c(tL_secureRequiredType3, null, jSONObject3, tL_secureRequiredType22, jSONObject4, null, ewVar22, arrayList32, ewVar32, ewVar, ef0Var, d0Var);
        return true;
    }
}
