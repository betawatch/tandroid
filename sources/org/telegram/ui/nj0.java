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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class nj0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ ek0 a;

    public nj0(ek0 ek0Var) {
        this.a = ek0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0217  */
    @Override // org.telegram.ui.ActionBar.k
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
        ek0 ek0Var = this.a;
        int i14 = ek0Var.b;
        if (i7 == -1) {
            if (ek0Var.b1(true)) {
                return;
            }
            if (i14 == 0 || i14 == 5) {
                ek0Var.a1(false);
            }
            ek0Var.finishFragment();
            return;
        }
        int i15 = 4;
        if (i7 == 1) {
            if (ek0Var.getParentActivity() == null) {
                return;
            }
            org.telegram.ui.Components.w70 w70Var = new org.telegram.ui.Components.w70(ek0Var.getParentActivity(), null);
            String M0 = org.telegram.messenger.id.M0(2131747559, null);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
            int indexOf = M0.indexOf(42);
            int lastIndexOf = M0.lastIndexOf(42);
            if (indexOf != -1 && lastIndexOf != -1) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.h4(org.telegram.messenger.id.M0(2131747557, null), i15, this), indexOf, lastIndexOf - 1, 33);
            }
            w70Var.setText(spannableStringBuilder);
            w70Var.setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.t6.G(w70Var, org.telegram.ui.ActionBar.m6.k5, null);
            org.telegram.ui.ActionBar.t6.C(w70Var, org.telegram.ui.ActionBar.m6.l5, null);
            w70Var.setPadding(org.telegram.messenger.g0.L(23.0f), 0, org.telegram.messenger.g0.L(23.0f), 0);
            w70Var.setMovementMethod(new org.telegram.messenger.c0(false));
            org.telegram.ui.ActionBar.t6.U(w70Var, org.telegram.ui.ActionBar.m6.j5, null);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ek0Var.getParentActivity());
            alertDialog$Builder.o(w70Var);
            String M02 = org.telegram.messenger.id.M0(2131747558, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M02;
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752041, null), null);
            ek0Var.showDialog(u1Var);
            return;
        }
        if (i7 == 2) {
            if (i14 == 5) {
                ek0Var.F1(false);
                return;
            }
            if (i14 == 7) {
                ek0Var.J1[ek0Var.I1].h(null);
                return;
            }
            hf0 hf0Var = new hf0(this, 6);
            m4.d0 d0Var = new m4.d0(this, hf0Var, false);
            if (i14 == 4) {
                if (ek0Var.f) {
                    obj = ek0Var.d1;
                } else if (ek0.H0(ek0Var)) {
                    return;
                } else {
                    obj = ek0Var.Y[0].getText().toString();
                }
                ((jj0) ek0Var.B1).c(ek0Var.E, obj, null, null, null, null, null, null, null, null, hf0Var, d0Var);
            } else if (i14 == 3) {
                if (ek0Var.f) {
                    i13 = ((org.telegram.ui.ActionBar.f2) ek0Var).currentAccount;
                    str = org.telegram.messenger.p10.i(i13).f().phone;
                } else {
                    if (ek0.H0(ek0Var)) {
                        return;
                    }
                    str = ek0Var.Y[1].getText().toString() + ek0Var.Y[2].getText().toString();
                }
                ((jj0) ek0Var.B1).c(ek0Var.E, str, null, null, null, null, null, null, null, null, hf0Var, d0Var);
            } else if (i14 == 2) {
                if (!ek0Var.o1.isEmpty() || ek0.H0(ek0Var)) {
                    return;
                }
                if (ek0Var.y1()) {
                    ek0Var.finishFragment();
                    return;
                }
                if (!ek0Var.v0) {
                    jSONObject = new JSONObject();
                    try {
                        jSONObject.put("street_line1", ek0Var.Y[0].getText().toString());
                        jSONObject.put("street_line2", ek0Var.Y[1].getText().toString());
                        jSONObject.put("post_code", ek0Var.Y[2].getText().toString());
                        jSONObject.put("city", ek0Var.Y[3].getText().toString());
                        jSONObject.put("state", ek0Var.Y[4].getText().toString());
                        jSONObject.put("country_code", ek0Var.s);
                    } catch (Exception unused) {
                    }
                    hashMap = ek0Var.w1;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    hashMap2 = ek0Var.x1;
                    if (hashMap2 != null) {
                        hashMap2.clear();
                    }
                    ((jj0) ek0Var.B1).c(ek0Var.E, null, jSONObject != null ? jSONObject.toString() : null, ek0Var.F, null, ek0Var.i1, ek0Var.j1, ek0Var.k1, null, null, hf0Var, d0Var);
                }
                jSONObject = null;
                hashMap = ek0Var.w1;
                if (hashMap != null) {
                }
                hashMap2 = ek0Var.x1;
                if (hashMap2 != null) {
                }
                ((jj0) ek0Var.B1).c(ek0Var.E, null, jSONObject != null ? jSONObject.toString() : null, ek0Var.F, null, ek0Var.i1, ek0Var.j1, ek0Var.k1, null, null, hf0Var, d0Var);
            } else if (i14 == 1) {
                if (!c(hf0Var, d0Var)) {
                    return;
                }
            } else if (i14 == 6) {
                TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposePassport();
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode.code = ek0Var.Y[0].getText().toString();
                verifyemail.verification = tL_emailVerificationCode;
                i10 = ((org.telegram.ui.ActionBar.f2) ek0Var).currentAccount;
                int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(verifyemail, new bi.g2(this, hf0Var, d0Var, verifyemail, 15));
                i11 = ((org.telegram.ui.ActionBar.f2) ek0Var).currentAccount;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                i12 = ((org.telegram.ui.ActionBar.f2) ek0Var).classGuid;
                connectionsManager.bindRequestToGuid(sendRequest, i12);
            }
            ek0Var.R1(true, true);
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
    public final boolean c(hf0 hf0Var, m4.d0 d0Var) {
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
        ek0 ek0Var = this.a;
        int[] iArr = ek0Var.y;
        boolean[] zArr = ek0Var.t0;
        char c13 = 0;
        if (!ek0Var.o1.isEmpty() || ek0.H0(ek0Var)) {
            return false;
        }
        int i13 = 3;
        char c14 = 2;
        org.telegram.messenger.ew ewVar = null;
        ?? r15 = 1;
        if (ek0Var.u0) {
            ek0Var.u0 = false;
            int i14 = 0;
            boolean z10 = false;
            while (i14 < zArr.length) {
                if (zArr[i14]) {
                    ek0Var.Y[i14].setErrorText(org.telegram.messenger.id.M0(2131747449, null));
                    if (!z10) {
                        String S0 = zArr[c13] ? org.telegram.messenger.id.E0().S0(ek0Var.a0[c13].getText().toString(), r15, r15) : ek0Var.Y[c13].getText().toString();
                        String S02 = zArr[r15] ? org.telegram.messenger.id.E0().S0(ek0Var.a0[r15].getText().toString(), r15, r15) : ek0Var.Y[r15].getText().toString();
                        String S03 = zArr[c14] ? org.telegram.messenger.id.E0().S0(ek0Var.a0[c14].getText().toString(), r15, r15) : ek0Var.Y[c14].getText().toString();
                        if (TextUtils.isEmpty(S0) || TextUtils.isEmpty(S02) || TextUtils.isEmpty(S03)) {
                            c11 = c13;
                            i11 = i13;
                            c12 = c14;
                            z9 = r15;
                            i12 = i14;
                            ek0Var.D1(ek0Var.Y[i12]);
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ek0Var.getParentActivity());
                            Object[] objArr = new Object[i13];
                            objArr[c13] = S0;
                            objArr[r15] = S02;
                            objArr[c14] = S03;
                            c12 = c14;
                            String a02 = org.telegram.messenger.id.a0("PassportNameCheckAlert", null, 2131747503, objArr);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                            u1Var.T = a02;
                            u1Var.R = org.telegram.messenger.id.M0(R.string.AppName, null);
                            c11 = c13;
                            z9 = r15;
                            i12 = i14;
                            i11 = i13;
                            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751354, null), new org.telegram.ui.Components.r0(this, S0, S02, S03, hf0Var, d0Var, 1));
                            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131751335, null), new l2.q(this, i12, 15));
                            ek0Var.showDialog(u1Var);
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
        if (ek0Var.y1()) {
            ek0Var.finishFragment();
            return r19;
        }
        try {
            if (ek0Var.v0) {
                jSONObject = null;
            } else {
                HashMap hashMap3 = new HashMap(ek0Var.s1);
                if (ek0Var.E.native_names) {
                    if (ek0Var.q0.getVisibility() == 0) {
                        hashMap3.put("first_name_native", ek0Var.a0[r19].getText().toString());
                        hashMap3.put("middle_name_native", ek0Var.a0[i10].getText().toString());
                        hashMap3.put("last_name_native", ek0Var.a0[c10].getText().toString());
                    } else {
                        hashMap3.put("first_name_native", ek0Var.Y[r19].getText().toString());
                        hashMap3.put("middle_name_native", ek0Var.Y[i10].getText().toString());
                        hashMap3.put("last_name_native", ek0Var.Y[c10].getText().toString());
                    }
                }
                hashMap3.put("first_name", ek0Var.Y[r19].getText().toString());
                hashMap3.put("middle_name", ek0Var.Y[i10].getText().toString());
                hashMap3.put("last_name", ek0Var.Y[c10].getText().toString());
                hashMap3.put("birth_date", ek0Var.Y[i7].getText().toString());
                hashMap3.put("gender", ek0Var.x);
                hashMap3.put("country_code", ek0Var.s);
                hashMap3.put("residence_country_code", ek0Var.w);
                jSONObject = new JSONObject();
                try {
                    ArrayList arrayList = new ArrayList(hashMap3.keySet());
                    final int i15 = r19;
                    Collections.sort(arrayList, new Comparator(this) { // from class: org.telegram.ui.mj0
                        public final /* synthetic */ nj0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            String str = (String) obj;
                            String str2 = (String) obj2;
                            switch (i15) {
                                case 0:
                                    ek0 ek0Var2 = this.b.a;
                                    int G0 = ek0.G0(ek0Var2, str);
                                    int G02 = ek0.G0(ek0Var2, str2);
                                    if (G0 >= G02) {
                                        if (G0 > G02) {
                                        }
                                    }
                                    break;
                                default:
                                    ek0 ek0Var3 = this.b.a;
                                    int G03 = ek0.G0(ek0Var3, str);
                                    int G04 = ek0.G0(ek0Var3, str2);
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
        if (ek0Var.F != null) {
            HashMap hashMap4 = new HashMap(ek0Var.t1);
            hashMap4.put("document_no", ek0Var.Y[7].getText().toString());
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
                Collections.sort(arrayList2, new Comparator(this) { // from class: org.telegram.ui.mj0
                    public final /* synthetic */ nj0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        String str2 = (String) obj;
                        String str22 = (String) obj2;
                        switch (i17) {
                            case 0:
                                ek0 ek0Var2 = this.b.a;
                                int G0 = ek0.G0(ek0Var2, str2);
                                int G02 = ek0.G0(ek0Var2, str22);
                                if (G0 >= G02) {
                                    if (G0 > G02) {
                                    }
                                }
                                break;
                            default:
                                ek0 ek0Var3 = this.b.a;
                                int G03 = ek0.G0(ek0Var3, str2);
                                int G04 = ek0.G0(ek0Var3, str22);
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
            hashMap = ek0Var.w1;
            if (hashMap != null) {
                hashMap.clear();
            }
            hashMap2 = ek0Var.x1;
            if (hashMap2 != null) {
                hashMap2.clear();
            }
            vj0 vj0Var = ek0Var.B1;
            TLRPC.TL_secureRequiredType tL_secureRequiredType = ek0Var.E;
            String jSONObject3 = jSONObject == null ? jSONObject.toString() : null;
            TLRPC.TL_secureRequiredType tL_secureRequiredType2 = ek0Var.F;
            String jSONObject4 = jSONObject2 == null ? jSONObject2.toString() : null;
            org.telegram.messenger.ew ewVar2 = ek0Var.j1;
            ArrayList arrayList3 = ek0Var.k1;
            org.telegram.messenger.ew ewVar3 = ek0Var.l1;
            linearLayout = ek0Var.f0;
            if (linearLayout != null && linearLayout.getVisibility() == 0) {
                ewVar = ek0Var.m1;
            }
            ((jj0) vj0Var).c(tL_secureRequiredType, null, jSONObject3, tL_secureRequiredType2, jSONObject4, null, ewVar2, arrayList3, ewVar3, ewVar, hf0Var, d0Var);
            return true;
        }
        jSONObject2 = null;
        hashMap = ek0Var.w1;
        if (hashMap != null) {
        }
        hashMap2 = ek0Var.x1;
        if (hashMap2 != null) {
        }
        vj0 vj0Var2 = ek0Var.B1;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3 = ek0Var.E;
        if (jSONObject == null) {
        }
        TLRPC.TL_secureRequiredType tL_secureRequiredType22 = ek0Var.F;
        if (jSONObject2 == null) {
        }
        org.telegram.messenger.ew ewVar22 = ek0Var.j1;
        ArrayList arrayList32 = ek0Var.k1;
        org.telegram.messenger.ew ewVar32 = ek0Var.l1;
        linearLayout = ek0Var.f0;
        if (linearLayout != null) {
            ewVar = ek0Var.m1;
        }
        ((jj0) vj0Var2).c(tL_secureRequiredType3, null, jSONObject3, tL_secureRequiredType22, jSONObject4, null, ewVar22, arrayList32, ewVar32, ewVar, hf0Var, d0Var);
        return true;
    }
}
