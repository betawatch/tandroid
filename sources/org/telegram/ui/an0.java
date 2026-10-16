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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class an0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ sn0 a;

    public an0(sn0 sn0Var) {
        this.a = sn0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0223  */
    @Override // org.telegram.ui.ActionBar.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i10) {
        int i11;
        int i12;
        int i13;
        JSONObject jSONObject;
        HashMap hashMap;
        HashMap hashMap2;
        String str;
        int i14;
        String obj;
        sn0 sn0Var = this.a;
        int i15 = sn0Var.b;
        if (i10 == -1) {
            if (sn0Var.W0(true)) {
                return;
            }
            if (i15 == 0 || i15 == 5) {
                sn0Var.V0(false);
            }
            sn0Var.finishFragment();
            return;
        }
        if (i10 == 1) {
            if (sn0Var.getParentActivity() == null) {
                return;
            }
            org.telegram.ui.Components.da0 da0Var = new org.telegram.ui.Components.da0(sn0Var.getParentActivity(), null);
            String string = LocaleController.getString(R.string.PassportInfo2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int indexOf = string.indexOf(42);
            int lastIndexOf = string.lastIndexOf(42);
            if (indexOf != -1 && lastIndexOf != -1) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.o4(LocaleController.getString(R.string.PassportInfoUrl), 4, this), indexOf, lastIndexOf - 1, 33);
            }
            da0Var.setText(spannableStringBuilder);
            da0Var.setTextSize(1, 16.0f);
            da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.k5, false));
            da0Var.setHighlightColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.l5, false));
            da0Var.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
            da0Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            da0Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.j5, false));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sn0Var.getParentActivity());
            alertDialog$Builder.n(da0Var);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.PassportInfoTitle);
            alertDialog$Builder.h(LocaleController.getString(R.string.Close), null);
            sn0Var.showDialog(alertDialog$Builder.a);
            return;
        }
        if (i10 == 2) {
            if (i15 == 5) {
                sn0Var.A1(false);
                return;
            }
            if (i15 == 7) {
                sn0Var.J1[sn0Var.I1].h(null);
                return;
            }
            xk0 xk0Var = new xk0(this, 4);
            m2.t tVar = new m2.t(this, xk0Var, false, 14);
            if (i15 == 4) {
                if (sn0Var.f) {
                    obj = sn0Var.d1;
                } else if (sn0.C0(sn0Var)) {
                    return;
                } else {
                    obj = sn0Var.Y[0].getText().toString();
                }
                ((vm0) sn0Var.B1).c(sn0Var.E, obj, null, null, null, null, null, null, null, null, xk0Var, tVar);
            } else if (i15 == 3) {
                if (sn0Var.f) {
                    i14 = ((org.telegram.ui.ActionBar.m2) sn0Var).currentAccount;
                    str = UserConfig.getInstance(i14).getCurrentUser().phone;
                } else {
                    if (sn0.C0(sn0Var)) {
                        return;
                    }
                    str = sn0Var.Y[1].getText().toString() + sn0Var.Y[2].getText().toString();
                }
                ((vm0) sn0Var.B1).c(sn0Var.E, str, null, null, null, null, null, null, null, null, xk0Var, tVar);
            } else if (i15 == 2) {
                if (!sn0Var.o1.isEmpty() || sn0.C0(sn0Var)) {
                    return;
                }
                if (sn0Var.t1()) {
                    sn0Var.finishFragment();
                    return;
                }
                if (!sn0Var.v0) {
                    jSONObject = new JSONObject();
                    try {
                        jSONObject.put("street_line1", sn0Var.Y[0].getText().toString());
                        jSONObject.put("street_line2", sn0Var.Y[1].getText().toString());
                        jSONObject.put("post_code", sn0Var.Y[2].getText().toString());
                        jSONObject.put("city", sn0Var.Y[3].getText().toString());
                        jSONObject.put("state", sn0Var.Y[4].getText().toString());
                        jSONObject.put("country_code", sn0Var.s);
                    } catch (Exception unused) {
                    }
                    hashMap = sn0Var.w1;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    hashMap2 = sn0Var.x1;
                    if (hashMap2 != null) {
                        hashMap2.clear();
                    }
                    ((vm0) sn0Var.B1).c(sn0Var.E, null, jSONObject != null ? jSONObject.toString() : null, sn0Var.F, null, sn0Var.i1, sn0Var.j1, sn0Var.k1, null, null, xk0Var, tVar);
                }
                jSONObject = null;
                hashMap = sn0Var.w1;
                if (hashMap != null) {
                }
                hashMap2 = sn0Var.x1;
                if (hashMap2 != null) {
                }
                ((vm0) sn0Var.B1).c(sn0Var.E, null, jSONObject != null ? jSONObject.toString() : null, sn0Var.F, null, sn0Var.i1, sn0Var.j1, sn0Var.k1, null, null, xk0Var, tVar);
            } else if (i15 == 1) {
                if (!c(xk0Var, tVar)) {
                    return;
                }
            } else if (i15 == 6) {
                TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposePassport();
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode.code = sn0Var.Y[0].getText().toString();
                verifyemail.verification = tL_emailVerificationCode;
                i11 = ((org.telegram.ui.ActionBar.m2) sn0Var).currentAccount;
                int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(verifyemail, new bi.f3(this, xk0Var, tVar, verifyemail, 10));
                i12 = ((org.telegram.ui.ActionBar.m2) sn0Var).currentAccount;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i12);
                i13 = ((org.telegram.ui.ActionBar.m2) sn0Var).classGuid;
                connectionsManager.bindRequestToGuid(sendRequest, i13);
            }
            sn0Var.M1(true, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0140, code lost:
    
        if (r0 != false) goto L100;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02fa  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(xk0 xk0Var, m2.t tVar) {
        int i10;
        char c10;
        int i11;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        HashMap hashMap;
        HashMap hashMap2;
        LinearLayout linearLayout;
        int i12;
        char c11;
        boolean z10;
        sn0 sn0Var = this.a;
        int[] iArr = sn0Var.x;
        boolean[] zArr = sn0Var.t0;
        final int i13 = 0;
        if (sn0Var.o1.isEmpty() && !sn0.C0(sn0Var)) {
            int i14 = 3;
            char c12 = 2;
            ?? r14 = 1;
            if (sn0Var.u0) {
                sn0Var.u0 = false;
                boolean z11 = false;
                int i15 = 0;
                while (i15 < zArr.length) {
                    if (zArr[i15]) {
                        sn0Var.Y[i15].setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
                        if (!z11) {
                            String translitString = zArr[0] ? LocaleController.getInstance().getTranslitString(sn0Var.a0[0].getText().toString(), r14) : sn0Var.Y[0].getText().toString();
                            String translitString2 = zArr[r14] ? LocaleController.getInstance().getTranslitString(sn0Var.a0[r14].getText().toString(), r14) : sn0Var.Y[r14].getText().toString();
                            String translitString3 = zArr[c12] ? LocaleController.getInstance().getTranslitString(sn0Var.a0[c12].getText().toString(), r14) : sn0Var.Y[c12].getText().toString();
                            if (TextUtils.isEmpty(translitString) || TextUtils.isEmpty(translitString2) || TextUtils.isEmpty(translitString3)) {
                                i12 = i14;
                                c11 = c12;
                                z10 = r14;
                                sn0Var.y1(sn0Var.Y[i15]);
                            } else {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sn0Var.getParentActivity());
                                int i16 = R.string.PassportNameCheckAlert;
                                Object[] objArr = new Object[i14];
                                objArr[0] = translitString;
                                objArr[r14] = translitString2;
                                objArr[c12] = translitString3;
                                String formatString = LocaleController.formatString("PassportNameCheckAlert", i16, objArr);
                                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                                a2Var.T = formatString;
                                a2Var.R = LocaleController.getString(R.string.AppName);
                                i12 = i14;
                                c11 = c12;
                                z10 = r14;
                                alertDialog$Builder.k(LocaleController.getString(R.string.Done), new org.telegram.ui.Components.d1(this, translitString, translitString2, translitString3, xk0Var, tVar, 1));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Edit), new i2.r(this, i15, 16));
                                sn0Var.showDialog(a2Var);
                            }
                            z11 = z10;
                            i15++;
                            r14 = z10;
                            c12 = c11;
                            i14 = i12;
                        }
                    }
                    i12 = i14;
                    c11 = c12;
                    z10 = r14;
                    i15++;
                    r14 = z10;
                    c12 = c11;
                    i14 = i12;
                }
                i10 = i14;
                c10 = c12;
                i11 = r14;
            } else {
                i10 = 3;
                c10 = 2;
                i11 = 1;
            }
            if (sn0Var.t1()) {
                sn0Var.finishFragment();
                return false;
            }
            SecureDocument secureDocument = null;
            try {
                if (sn0Var.v0) {
                    jSONObject = null;
                } else {
                    HashMap hashMap3 = new HashMap(sn0Var.s1);
                    if (sn0Var.E.native_names) {
                        if (sn0Var.q0.getVisibility() == 0) {
                            hashMap3.put("first_name_native", sn0Var.a0[0].getText().toString());
                            hashMap3.put("middle_name_native", sn0Var.a0[i11].getText().toString());
                            hashMap3.put("last_name_native", sn0Var.a0[c10].getText().toString());
                        } else {
                            hashMap3.put("first_name_native", sn0Var.Y[0].getText().toString());
                            hashMap3.put("middle_name_native", sn0Var.Y[i11].getText().toString());
                            hashMap3.put("last_name_native", sn0Var.Y[c10].getText().toString());
                        }
                    }
                    hashMap3.put("first_name", sn0Var.Y[0].getText().toString());
                    hashMap3.put("middle_name", sn0Var.Y[i11].getText().toString());
                    hashMap3.put("last_name", sn0Var.Y[c10].getText().toString());
                    hashMap3.put("birth_date", sn0Var.Y[i10].getText().toString());
                    hashMap3.put("gender", sn0Var.w);
                    hashMap3.put("country_code", sn0Var.s);
                    hashMap3.put("residence_country_code", sn0Var.v);
                    jSONObject = new JSONObject();
                    try {
                        ArrayList arrayList = new ArrayList(hashMap3.keySet());
                        Collections.sort(arrayList, new Comparator(this) { // from class: org.telegram.ui.zm0
                            public final /* synthetic */ an0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.util.Comparator
                            public final int compare(Object obj, Object obj2) {
                                String str = (String) obj;
                                String str2 = (String) obj2;
                                switch (i13) {
                                    case 0:
                                        sn0 sn0Var2 = this.b.a;
                                        int B0 = sn0.B0(sn0Var2, str);
                                        int B02 = sn0.B0(sn0Var2, str2);
                                        if (B0 >= B02) {
                                            if (B0 > B02) {
                                            }
                                        }
                                        break;
                                    default:
                                        sn0 sn0Var3 = this.b.a;
                                        int B03 = sn0.B0(sn0Var3, str);
                                        int B04 = sn0.B0(sn0Var3, str2);
                                        if (B03 >= B04) {
                                            if (B03 > B04) {
                                            }
                                        }
                                        break;
                                }
                                return 0;
                            }
                        });
                        int size = arrayList.size();
                        for (int i17 = 0; i17 < size; i17++) {
                            String str = (String) arrayList.get(i17);
                            jSONObject.put(str, hashMap3.get(str));
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception unused2) {
                jSONObject = null;
                jSONObject2 = null;
            }
            if (sn0Var.F != null) {
                HashMap hashMap4 = new HashMap(sn0Var.t1);
                hashMap4.put("document_no", sn0Var.Y[7].getText().toString());
                if (iArr[0] != 0) {
                    Locale locale = Locale.US;
                    Integer valueOf = Integer.valueOf(iArr[c10]);
                    Integer valueOf2 = Integer.valueOf(iArr[i11]);
                    Integer valueOf3 = Integer.valueOf(iArr[0]);
                    Object[] objArr2 = new Object[i10];
                    objArr2[0] = valueOf;
                    objArr2[i11] = valueOf2;
                    objArr2[c10] = valueOf3;
                    hashMap4.put("expiry_date", String.format(locale, "%02d.%02d.%d", objArr2));
                } else {
                    hashMap4.put("expiry_date", "");
                }
                jSONObject2 = new JSONObject();
                try {
                    ArrayList arrayList2 = new ArrayList(hashMap4.keySet());
                    final int i18 = i11;
                    Collections.sort(arrayList2, new Comparator(this) { // from class: org.telegram.ui.zm0
                        public final /* synthetic */ an0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            String str2 = (String) obj;
                            String str22 = (String) obj2;
                            switch (i18) {
                                case 0:
                                    sn0 sn0Var2 = this.b.a;
                                    int B0 = sn0.B0(sn0Var2, str2);
                                    int B02 = sn0.B0(sn0Var2, str22);
                                    if (B0 >= B02) {
                                        if (B0 > B02) {
                                        }
                                    }
                                    break;
                                default:
                                    sn0 sn0Var3 = this.b.a;
                                    int B03 = sn0.B0(sn0Var3, str2);
                                    int B04 = sn0.B0(sn0Var3, str22);
                                    if (B03 >= B04) {
                                        if (B03 > B04) {
                                        }
                                    }
                                    break;
                            }
                            return 0;
                        }
                    });
                    int size2 = arrayList2.size();
                    while (i13 < size2) {
                        String str2 = (String) arrayList2.get(i13);
                        jSONObject2.put(str2, hashMap4.get(str2));
                        i13++;
                    }
                } catch (Exception unused3) {
                }
                hashMap = sn0Var.w1;
                if (hashMap != null) {
                    hashMap.clear();
                }
                hashMap2 = sn0Var.x1;
                if (hashMap2 != null) {
                    hashMap2.clear();
                }
                in0 in0Var = sn0Var.B1;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = sn0Var.E;
                String jSONObject3 = jSONObject == null ? jSONObject.toString() : null;
                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = sn0Var.F;
                String jSONObject4 = jSONObject2 == null ? jSONObject2.toString() : null;
                SecureDocument secureDocument2 = sn0Var.j1;
                ArrayList arrayList3 = sn0Var.k1;
                SecureDocument secureDocument3 = sn0Var.l1;
                linearLayout = sn0Var.f0;
                if (linearLayout != null && linearLayout.getVisibility() == 0) {
                    secureDocument = sn0Var.m1;
                }
                ((vm0) in0Var).c(tL_secureRequiredType, null, jSONObject3, tL_secureRequiredType2, jSONObject4, null, secureDocument2, arrayList3, secureDocument3, secureDocument, xk0Var, tVar);
                return true;
            }
            jSONObject2 = null;
            hashMap = sn0Var.w1;
            if (hashMap != null) {
            }
            hashMap2 = sn0Var.x1;
            if (hashMap2 != null) {
            }
            in0 in0Var2 = sn0Var.B1;
            TLRPC.TL_secureRequiredType tL_secureRequiredType3 = sn0Var.E;
            if (jSONObject == null) {
            }
            TLRPC.TL_secureRequiredType tL_secureRequiredType22 = sn0Var.F;
            if (jSONObject2 == null) {
            }
            SecureDocument secureDocument22 = sn0Var.j1;
            ArrayList arrayList32 = sn0Var.k1;
            SecureDocument secureDocument32 = sn0Var.l1;
            linearLayout = sn0Var.f0;
            if (linearLayout != null) {
                secureDocument = sn0Var.m1;
            }
            ((vm0) in0Var2).c(tL_secureRequiredType3, null, jSONObject3, tL_secureRequiredType22, jSONObject4, null, secureDocument22, arrayList32, secureDocument32, secureDocument, xk0Var, tVar);
            return true;
        }
        return false;
    }
}
