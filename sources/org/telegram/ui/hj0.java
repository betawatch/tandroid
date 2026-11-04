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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class hj0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ yj0 a;

    public hj0(yj0 yj0Var) {
        this.a = yj0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0218  */
    @Override // org.telegram.ui.ActionBar.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i3) {
        int i10;
        int i11;
        int i12;
        JSONObject jSONObject;
        HashMap hashMap;
        HashMap hashMap2;
        String str;
        int i13;
        String obj;
        yj0 yj0Var = this.a;
        int i14 = yj0Var.b;
        if (i3 == -1) {
            if (yj0Var.b1(true)) {
                return;
            }
            if (i14 == 0 || i14 == 5) {
                yj0Var.a1(false);
            }
            yj0Var.finishFragment();
            return;
        }
        int i15 = 4;
        if (i3 == 1) {
            if (yj0Var.getParentActivity() == null) {
                return;
            }
            org.telegram.ui.Components.s70 s70Var = new org.telegram.ui.Components.s70(yj0Var.getParentActivity(), null);
            String M0 = org.telegram.messenger.bd.M0(2131747567, null);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
            int indexOf = M0.indexOf(42);
            int lastIndexOf = M0.lastIndexOf(42);
            if (indexOf != -1 && lastIndexOf != -1) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.g4(org.telegram.messenger.bd.M0(2131747565, null), i15, this), indexOf, lastIndexOf - 1, 33);
            }
            s70Var.setText(spannableStringBuilder);
            s70Var.setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.k5, null);
            org.telegram.ui.ActionBar.r6.D(s70Var, org.telegram.ui.ActionBar.k6.l5, null);
            s70Var.setPadding(org.telegram.messenger.g0.L(23.0f), 0, org.telegram.messenger.g0.L(23.0f), 0);
            s70Var.setMovementMethod(new org.telegram.messenger.c0(false));
            org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.j5, null);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yj0Var.getParentActivity());
            alertDialog$Builder.o(s70Var);
            String M02 = org.telegram.messenger.bd.M0(2131747566, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.S = M02;
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752041, null), null);
            yj0Var.showDialog(s1Var);
            return;
        }
        if (i3 == 2) {
            if (i14 == 5) {
                yj0Var.F1(false);
                return;
            }
            if (i14 == 7) {
                yj0Var.K1[yj0Var.J1].h(null);
                return;
            }
            sg0 sg0Var = new sg0(this, 5);
            m2.t tVar = new m2.t(15, this, sg0Var);
            if (i14 == 4) {
                if (yj0Var.f) {
                    obj = yj0Var.e1;
                } else if (yj0.H0(yj0Var)) {
                    return;
                } else {
                    obj = yj0Var.Z[0].getText().toString();
                }
                ((dj0) yj0Var.C1).c(yj0Var.F, obj, null, null, null, null, null, null, null, null, sg0Var, tVar);
            } else if (i14 == 3) {
                if (yj0Var.f) {
                    i13 = ((org.telegram.ui.ActionBar.d2) yj0Var).currentAccount;
                    str = org.telegram.messenger.h10.i(i13).f().phone;
                } else {
                    if (yj0.H0(yj0Var)) {
                        return;
                    }
                    str = yj0Var.Z[1].getText().toString() + yj0Var.Z[2].getText().toString();
                }
                ((dj0) yj0Var.C1).c(yj0Var.F, str, null, null, null, null, null, null, null, null, sg0Var, tVar);
            } else if (i14 == 2) {
                if (!yj0Var.p1.isEmpty() || yj0.H0(yj0Var)) {
                    return;
                }
                if (yj0Var.y1()) {
                    yj0Var.finishFragment();
                    return;
                }
                if (!yj0Var.w0) {
                    jSONObject = new JSONObject();
                    try {
                        jSONObject.put("street_line1", yj0Var.Z[0].getText().toString());
                        jSONObject.put("street_line2", yj0Var.Z[1].getText().toString());
                        jSONObject.put("post_code", yj0Var.Z[2].getText().toString());
                        jSONObject.put("city", yj0Var.Z[3].getText().toString());
                        jSONObject.put("state", yj0Var.Z[4].getText().toString());
                        jSONObject.put("country_code", yj0Var.s);
                    } catch (Exception unused) {
                    }
                    hashMap = yj0Var.x1;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    hashMap2 = yj0Var.y1;
                    if (hashMap2 != null) {
                        hashMap2.clear();
                    }
                    ((dj0) yj0Var.C1).c(yj0Var.F, null, jSONObject != null ? jSONObject.toString() : null, yj0Var.G, null, yj0Var.j1, yj0Var.k1, yj0Var.l1, null, null, sg0Var, tVar);
                }
                jSONObject = null;
                hashMap = yj0Var.x1;
                if (hashMap != null) {
                }
                hashMap2 = yj0Var.y1;
                if (hashMap2 != null) {
                }
                ((dj0) yj0Var.C1).c(yj0Var.F, null, jSONObject != null ? jSONObject.toString() : null, yj0Var.G, null, yj0Var.j1, yj0Var.k1, yj0Var.l1, null, null, sg0Var, tVar);
            } else if (i14 == 1) {
                if (!c(sg0Var, tVar)) {
                    return;
                }
            } else if (i14 == 6) {
                TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposePassport();
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode.code = yj0Var.Z[0].getText().toString();
                verifyemail.verification = tL_emailVerificationCode;
                i10 = ((org.telegram.ui.ActionBar.d2) yj0Var).currentAccount;
                int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(verifyemail, new ai.q1(this, sg0Var, tVar, verifyemail, 16));
                i11 = ((org.telegram.ui.ActionBar.d2) yj0Var).currentAccount;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                i12 = ((org.telegram.ui.ActionBar.d2) yj0Var).classGuid;
                connectionsManager.bindRequestToGuid(sendRequest, i12);
            }
            yj0Var.R1(true, true);
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
    public final boolean c(sg0 sg0Var, m2.t tVar) {
        ?? r19;
        int i3;
        char c2;
        int i10;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        HashMap hashMap;
        HashMap hashMap2;
        LinearLayout linearLayout;
        char c10;
        int i11;
        char c11;
        boolean z10;
        int i12;
        yj0 yj0Var = this.a;
        int[] iArr = yj0Var.y;
        boolean[] zArr = yj0Var.u0;
        char c12 = 0;
        if (!yj0Var.p1.isEmpty() || yj0.H0(yj0Var)) {
            return false;
        }
        int i13 = 3;
        char c13 = 2;
        org.telegram.messenger.wv wvVar = null;
        ?? r15 = 1;
        if (yj0Var.v0) {
            yj0Var.v0 = false;
            int i14 = 0;
            boolean z11 = false;
            while (i14 < zArr.length) {
                if (zArr[i14]) {
                    yj0Var.Z[i14].setErrorText(org.telegram.messenger.bd.M0(2131747457, null));
                    if (!z11) {
                        String S0 = zArr[c12] ? org.telegram.messenger.bd.E0().S0(yj0Var.b0[c12].getText().toString(), r15, r15) : yj0Var.Z[c12].getText().toString();
                        String S02 = zArr[r15] ? org.telegram.messenger.bd.E0().S0(yj0Var.b0[r15].getText().toString(), r15, r15) : yj0Var.Z[r15].getText().toString();
                        String S03 = zArr[c13] ? org.telegram.messenger.bd.E0().S0(yj0Var.b0[c13].getText().toString(), r15, r15) : yj0Var.Z[c13].getText().toString();
                        if (TextUtils.isEmpty(S0) || TextUtils.isEmpty(S02) || TextUtils.isEmpty(S03)) {
                            c10 = c12;
                            i11 = i13;
                            c11 = c13;
                            z10 = r15;
                            i12 = i14;
                            yj0Var.D1(yj0Var.Z[i12]);
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yj0Var.getParentActivity());
                            Object[] objArr = new Object[i13];
                            objArr[c12] = S0;
                            objArr[r15] = S02;
                            objArr[c13] = S03;
                            c11 = c13;
                            String a02 = org.telegram.messenger.bd.a0("PassportNameCheckAlert", null, 2131747511, objArr);
                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                            s1Var.U = a02;
                            s1Var.S = org.telegram.messenger.bd.M0(R.string.AppName, null);
                            c10 = c12;
                            z10 = r15;
                            i12 = i14;
                            i11 = i13;
                            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751355, null), new org.telegram.ui.Components.r0(this, S0, S02, S03, sg0Var, tVar, 1));
                            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131751336, null), new k2.q(this, i12, 16));
                            yj0Var.showDialog(s1Var);
                        }
                        z11 = z10;
                        i14 = i12 + 1;
                        c13 = c11;
                        i13 = i11;
                        r15 = z10;
                        c12 = c10;
                    }
                }
                c10 = c12;
                i11 = i13;
                c11 = c13;
                z10 = r15;
                i12 = i14;
                i14 = i12 + 1;
                c13 = c11;
                i13 = i11;
                r15 = z10;
                c12 = c10;
            }
            boolean z12 = c12;
            i3 = i13;
            c2 = c13;
            i10 = r15;
            r19 = z12;
            if (z11) {
                return z12;
            }
        } else {
            r19 = 0;
            i3 = 3;
            c2 = 2;
            i10 = 1;
        }
        if (yj0Var.y1()) {
            yj0Var.finishFragment();
            return r19;
        }
        try {
            if (yj0Var.w0) {
                jSONObject = null;
            } else {
                HashMap hashMap3 = new HashMap(yj0Var.t1);
                if (yj0Var.F.native_names) {
                    if (yj0Var.r0.getVisibility() == 0) {
                        hashMap3.put("first_name_native", yj0Var.b0[r19].getText().toString());
                        hashMap3.put("middle_name_native", yj0Var.b0[i10].getText().toString());
                        hashMap3.put("last_name_native", yj0Var.b0[c2].getText().toString());
                    } else {
                        hashMap3.put("first_name_native", yj0Var.Z[r19].getText().toString());
                        hashMap3.put("middle_name_native", yj0Var.Z[i10].getText().toString());
                        hashMap3.put("last_name_native", yj0Var.Z[c2].getText().toString());
                    }
                }
                hashMap3.put("first_name", yj0Var.Z[r19].getText().toString());
                hashMap3.put("middle_name", yj0Var.Z[i10].getText().toString());
                hashMap3.put("last_name", yj0Var.Z[c2].getText().toString());
                hashMap3.put("birth_date", yj0Var.Z[i3].getText().toString());
                hashMap3.put("gender", yj0Var.x);
                hashMap3.put("country_code", yj0Var.s);
                hashMap3.put("residence_country_code", yj0Var.w);
                jSONObject = new JSONObject();
                try {
                    ArrayList arrayList = new ArrayList(hashMap3.keySet());
                    final int i15 = r19;
                    Collections.sort(arrayList, new Comparator(this) { // from class: org.telegram.ui.gj0
                        public final /* synthetic */ hj0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            String str = (String) obj;
                            String str2 = (String) obj2;
                            switch (i15) {
                                case 0:
                                    yj0 yj0Var2 = this.b.a;
                                    int G0 = yj0.G0(yj0Var2, str);
                                    int G02 = yj0.G0(yj0Var2, str2);
                                    if (G0 >= G02) {
                                        if (G0 > G02) {
                                        }
                                    }
                                    break;
                                default:
                                    yj0 yj0Var3 = this.b.a;
                                    int G03 = yj0.G0(yj0Var3, str);
                                    int G04 = yj0.G0(yj0Var3, str2);
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
        if (yj0Var.G != null) {
            HashMap hashMap4 = new HashMap(yj0Var.u1);
            hashMap4.put("document_no", yj0Var.Z[7].getText().toString());
            if (iArr[0] != 0) {
                Locale locale = Locale.US;
                Integer valueOf = Integer.valueOf(iArr[c2]);
                Integer valueOf2 = Integer.valueOf(iArr[i10]);
                Integer valueOf3 = Integer.valueOf(iArr[0]);
                Object[] objArr2 = new Object[i3];
                objArr2[0] = valueOf;
                objArr2[i10] = valueOf2;
                objArr2[c2] = valueOf3;
                hashMap4.put("expiry_date", String.format(locale, "%02d.%02d.%d", objArr2));
            } else {
                hashMap4.put("expiry_date", "");
            }
            jSONObject2 = new JSONObject();
            try {
                ArrayList arrayList2 = new ArrayList(hashMap4.keySet());
                final int i17 = i10;
                Collections.sort(arrayList2, new Comparator(this) { // from class: org.telegram.ui.gj0
                    public final /* synthetic */ hj0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        String str2 = (String) obj;
                        String str22 = (String) obj2;
                        switch (i17) {
                            case 0:
                                yj0 yj0Var2 = this.b.a;
                                int G0 = yj0.G0(yj0Var2, str2);
                                int G02 = yj0.G0(yj0Var2, str22);
                                if (G0 >= G02) {
                                    if (G0 > G02) {
                                    }
                                }
                                break;
                            default:
                                yj0 yj0Var3 = this.b.a;
                                int G03 = yj0.G0(yj0Var3, str2);
                                int G04 = yj0.G0(yj0Var3, str22);
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
            hashMap = yj0Var.x1;
            if (hashMap != null) {
                hashMap.clear();
            }
            hashMap2 = yj0Var.y1;
            if (hashMap2 != null) {
                hashMap2.clear();
            }
            pj0 pj0Var = yj0Var.C1;
            TLRPC.TL_secureRequiredType tL_secureRequiredType = yj0Var.F;
            String jSONObject3 = jSONObject == null ? jSONObject.toString() : null;
            TLRPC.TL_secureRequiredType tL_secureRequiredType2 = yj0Var.G;
            String jSONObject4 = jSONObject2 == null ? jSONObject2.toString() : null;
            org.telegram.messenger.wv wvVar2 = yj0Var.k1;
            ArrayList arrayList3 = yj0Var.l1;
            org.telegram.messenger.wv wvVar3 = yj0Var.m1;
            linearLayout = yj0Var.g0;
            if (linearLayout != null && linearLayout.getVisibility() == 0) {
                wvVar = yj0Var.n1;
            }
            ((dj0) pj0Var).c(tL_secureRequiredType, null, jSONObject3, tL_secureRequiredType2, jSONObject4, null, wvVar2, arrayList3, wvVar3, wvVar, sg0Var, tVar);
            return true;
        }
        jSONObject2 = null;
        hashMap = yj0Var.x1;
        if (hashMap != null) {
        }
        hashMap2 = yj0Var.y1;
        if (hashMap2 != null) {
        }
        pj0 pj0Var2 = yj0Var.C1;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3 = yj0Var.F;
        if (jSONObject == null) {
        }
        TLRPC.TL_secureRequiredType tL_secureRequiredType22 = yj0Var.G;
        if (jSONObject2 == null) {
        }
        org.telegram.messenger.wv wvVar22 = yj0Var.k1;
        ArrayList arrayList32 = yj0Var.l1;
        org.telegram.messenger.wv wvVar32 = yj0Var.m1;
        linearLayout = yj0Var.g0;
        if (linearLayout != null) {
            wvVar = yj0Var.n1;
        }
        ((dj0) pj0Var2).c(tL_secureRequiredType3, null, jSONObject3, tL_secureRequiredType22, jSONObject4, null, wvVar22, arrayList32, wvVar32, wvVar, sg0Var, tVar);
        return true;
    }
}
