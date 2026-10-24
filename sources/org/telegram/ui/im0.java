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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class im0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ an0 a;

    public im0(an0 an0Var) {
        this.a = an0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0217  */
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
        an0 an0Var = this.a;
        int i15 = an0Var.b;
        if (i10 == -1) {
            if (an0Var.W0(true)) {
                return;
            }
            if (i15 == 0 || i15 == 5) {
                an0Var.V0(false);
            }
            an0Var.finishFragment();
            return;
        }
        if (i10 == 1) {
            if (an0Var.getParentActivity() == null) {
                return;
            }
            org.telegram.ui.Components.y90 y90Var = new org.telegram.ui.Components.y90(an0Var.getParentActivity(), null);
            String string = LocaleController.getString(R.string.PassportInfo2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int indexOf = string.indexOf(42);
            int lastIndexOf = string.lastIndexOf(42);
            if (indexOf != -1 && lastIndexOf != -1) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.m4(LocaleController.getString(R.string.PassportInfoUrl), 4, this), indexOf, lastIndexOf - 1, 33);
            }
            y90Var.setText(spannableStringBuilder);
            y90Var.setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.r6.I(y90Var, org.telegram.ui.ActionBar.k6.k5, null);
            org.telegram.ui.ActionBar.r6.E(y90Var, org.telegram.ui.ActionBar.k6.l5, null);
            y90Var.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
            y90Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            org.telegram.ui.ActionBar.r6.W(y90Var, org.telegram.ui.ActionBar.k6.j5, null);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(an0Var.getParentActivity());
            alertDialog$Builder.o(y90Var);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.PassportInfoTitle);
            alertDialog$Builder.h(LocaleController.getString(R.string.Close), null);
            an0Var.showDialog(alertDialog$Builder.a);
            return;
        }
        if (i10 == 2) {
            if (i15 == 5) {
                an0Var.A1(false);
                return;
            }
            if (i15 == 7) {
                an0Var.J1[an0Var.I1].h(null);
                return;
            }
            oj0 oj0Var = new oj0(this, 5);
            n2.e eVar = new n2.e(this, oj0Var, false, 9);
            if (i15 == 4) {
                if (an0Var.f) {
                    obj = an0Var.d1;
                } else if (an0.C0(an0Var)) {
                    return;
                } else {
                    obj = an0Var.Y[0].getText().toString();
                }
                ((dm0) an0Var.B1).c(an0Var.E, obj, null, null, null, null, null, null, null, null, oj0Var, eVar);
            } else if (i15 == 3) {
                if (an0Var.f) {
                    i14 = ((org.telegram.ui.ActionBar.o2) an0Var).currentAccount;
                    str = UserConfig.getInstance(i14).getCurrentUser().phone;
                } else {
                    if (an0.C0(an0Var)) {
                        return;
                    }
                    str = an0Var.Y[1].getText().toString() + an0Var.Y[2].getText().toString();
                }
                ((dm0) an0Var.B1).c(an0Var.E, str, null, null, null, null, null, null, null, null, oj0Var, eVar);
            } else if (i15 == 2) {
                if (!an0Var.o1.isEmpty() || an0.C0(an0Var)) {
                    return;
                }
                if (an0Var.t1()) {
                    an0Var.finishFragment();
                    return;
                }
                if (!an0Var.v0) {
                    jSONObject = new JSONObject();
                    try {
                        jSONObject.put("street_line1", an0Var.Y[0].getText().toString());
                        jSONObject.put("street_line2", an0Var.Y[1].getText().toString());
                        jSONObject.put("post_code", an0Var.Y[2].getText().toString());
                        jSONObject.put("city", an0Var.Y[3].getText().toString());
                        jSONObject.put("state", an0Var.Y[4].getText().toString());
                        jSONObject.put("country_code", an0Var.s);
                    } catch (Exception unused) {
                    }
                    hashMap = an0Var.w1;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    hashMap2 = an0Var.x1;
                    if (hashMap2 != null) {
                        hashMap2.clear();
                    }
                    ((dm0) an0Var.B1).c(an0Var.E, null, jSONObject != null ? jSONObject.toString() : null, an0Var.F, null, an0Var.i1, an0Var.j1, an0Var.k1, null, null, oj0Var, eVar);
                }
                jSONObject = null;
                hashMap = an0Var.w1;
                if (hashMap != null) {
                }
                hashMap2 = an0Var.x1;
                if (hashMap2 != null) {
                }
                ((dm0) an0Var.B1).c(an0Var.E, null, jSONObject != null ? jSONObject.toString() : null, an0Var.F, null, an0Var.i1, an0Var.j1, an0Var.k1, null, null, oj0Var, eVar);
            } else if (i15 == 1) {
                if (!c(oj0Var, eVar)) {
                    return;
                }
            } else if (i15 == 6) {
                TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposePassport();
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode.code = an0Var.Y[0].getText().toString();
                verifyemail.verification = tL_emailVerificationCode;
                i11 = ((org.telegram.ui.ActionBar.o2) an0Var).currentAccount;
                int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(verifyemail, new ai.k2(this, oj0Var, eVar, verifyemail, 15));
                i12 = ((org.telegram.ui.ActionBar.o2) an0Var).currentAccount;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i12);
                i13 = ((org.telegram.ui.ActionBar.o2) an0Var).classGuid;
                connectionsManager.bindRequestToGuid(sendRequest, i13);
            }
            an0Var.M1(true, true);
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
    public final boolean c(oj0 oj0Var, n2.e eVar) {
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
        an0 an0Var = this.a;
        int[] iArr = an0Var.x;
        boolean[] zArr = an0Var.t0;
        final int i13 = 0;
        if (an0Var.o1.isEmpty() && !an0.C0(an0Var)) {
            int i14 = 3;
            char c12 = 2;
            ?? r14 = 1;
            if (an0Var.u0) {
                an0Var.u0 = false;
                boolean z11 = false;
                int i15 = 0;
                while (i15 < zArr.length) {
                    if (zArr[i15]) {
                        an0Var.Y[i15].setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
                        if (!z11) {
                            String translitString = zArr[0] ? LocaleController.getInstance().getTranslitString(an0Var.a0[0].getText().toString(), r14) : an0Var.Y[0].getText().toString();
                            String translitString2 = zArr[r14] ? LocaleController.getInstance().getTranslitString(an0Var.a0[r14].getText().toString(), r14) : an0Var.Y[r14].getText().toString();
                            String translitString3 = zArr[c12] ? LocaleController.getInstance().getTranslitString(an0Var.a0[c12].getText().toString(), r14) : an0Var.Y[c12].getText().toString();
                            if (TextUtils.isEmpty(translitString) || TextUtils.isEmpty(translitString2) || TextUtils.isEmpty(translitString3)) {
                                i12 = i14;
                                c11 = c12;
                                z10 = r14;
                                an0Var.y1(an0Var.Y[i15]);
                            } else {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(an0Var.getParentActivity());
                                int i16 = R.string.PassportNameCheckAlert;
                                Object[] objArr = new Object[i14];
                                objArr[0] = translitString;
                                objArr[r14] = translitString2;
                                objArr[c12] = translitString3;
                                String formatString = LocaleController.formatString("PassportNameCheckAlert", i16, objArr);
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                c2Var.T = formatString;
                                c2Var.R = LocaleController.getString(R.string.AppName);
                                i12 = i14;
                                c11 = c12;
                                z10 = r14;
                                alertDialog$Builder.k(LocaleController.getString(R.string.Done), new org.telegram.ui.Components.c1(this, translitString, translitString2, translitString3, oj0Var, eVar, 1));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Edit), new i2.r(this, i15, 16));
                                an0Var.showDialog(c2Var);
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
            if (an0Var.t1()) {
                an0Var.finishFragment();
                return false;
            }
            SecureDocument secureDocument = null;
            try {
                if (an0Var.v0) {
                    jSONObject = null;
                } else {
                    HashMap hashMap3 = new HashMap(an0Var.s1);
                    if (an0Var.E.native_names) {
                        if (an0Var.q0.getVisibility() == 0) {
                            hashMap3.put("first_name_native", an0Var.a0[0].getText().toString());
                            hashMap3.put("middle_name_native", an0Var.a0[i11].getText().toString());
                            hashMap3.put("last_name_native", an0Var.a0[c10].getText().toString());
                        } else {
                            hashMap3.put("first_name_native", an0Var.Y[0].getText().toString());
                            hashMap3.put("middle_name_native", an0Var.Y[i11].getText().toString());
                            hashMap3.put("last_name_native", an0Var.Y[c10].getText().toString());
                        }
                    }
                    hashMap3.put("first_name", an0Var.Y[0].getText().toString());
                    hashMap3.put("middle_name", an0Var.Y[i11].getText().toString());
                    hashMap3.put("last_name", an0Var.Y[c10].getText().toString());
                    hashMap3.put("birth_date", an0Var.Y[i10].getText().toString());
                    hashMap3.put("gender", an0Var.w);
                    hashMap3.put("country_code", an0Var.s);
                    hashMap3.put("residence_country_code", an0Var.v);
                    jSONObject = new JSONObject();
                    try {
                        ArrayList arrayList = new ArrayList(hashMap3.keySet());
                        Collections.sort(arrayList, new Comparator(this) { // from class: org.telegram.ui.hm0
                            public final /* synthetic */ im0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.util.Comparator
                            public final int compare(Object obj, Object obj2) {
                                String str = (String) obj;
                                String str2 = (String) obj2;
                                switch (i13) {
                                    case 0:
                                        an0 an0Var2 = this.b.a;
                                        int B0 = an0.B0(an0Var2, str);
                                        int B02 = an0.B0(an0Var2, str2);
                                        if (B0 >= B02) {
                                            if (B0 > B02) {
                                            }
                                        }
                                        break;
                                    default:
                                        an0 an0Var3 = this.b.a;
                                        int B03 = an0.B0(an0Var3, str);
                                        int B04 = an0.B0(an0Var3, str2);
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
            if (an0Var.F != null) {
                HashMap hashMap4 = new HashMap(an0Var.t1);
                hashMap4.put("document_no", an0Var.Y[7].getText().toString());
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
                    Collections.sort(arrayList2, new Comparator(this) { // from class: org.telegram.ui.hm0
                        public final /* synthetic */ im0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            String str2 = (String) obj;
                            String str22 = (String) obj2;
                            switch (i18) {
                                case 0:
                                    an0 an0Var2 = this.b.a;
                                    int B0 = an0.B0(an0Var2, str2);
                                    int B02 = an0.B0(an0Var2, str22);
                                    if (B0 >= B02) {
                                        if (B0 > B02) {
                                        }
                                    }
                                    break;
                                default:
                                    an0 an0Var3 = this.b.a;
                                    int B03 = an0.B0(an0Var3, str2);
                                    int B04 = an0.B0(an0Var3, str22);
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
                hashMap = an0Var.w1;
                if (hashMap != null) {
                    hashMap.clear();
                }
                hashMap2 = an0Var.x1;
                if (hashMap2 != null) {
                    hashMap2.clear();
                }
                qm0 qm0Var = an0Var.B1;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = an0Var.E;
                String jSONObject3 = jSONObject == null ? jSONObject.toString() : null;
                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = an0Var.F;
                String jSONObject4 = jSONObject2 == null ? jSONObject2.toString() : null;
                SecureDocument secureDocument2 = an0Var.j1;
                ArrayList arrayList3 = an0Var.k1;
                SecureDocument secureDocument3 = an0Var.l1;
                linearLayout = an0Var.f0;
                if (linearLayout != null && linearLayout.getVisibility() == 0) {
                    secureDocument = an0Var.m1;
                }
                ((dm0) qm0Var).c(tL_secureRequiredType, null, jSONObject3, tL_secureRequiredType2, jSONObject4, null, secureDocument2, arrayList3, secureDocument3, secureDocument, oj0Var, eVar);
                return true;
            }
            jSONObject2 = null;
            hashMap = an0Var.w1;
            if (hashMap != null) {
            }
            hashMap2 = an0Var.x1;
            if (hashMap2 != null) {
            }
            qm0 qm0Var2 = an0Var.B1;
            TLRPC.TL_secureRequiredType tL_secureRequiredType3 = an0Var.E;
            if (jSONObject == null) {
            }
            TLRPC.TL_secureRequiredType tL_secureRequiredType22 = an0Var.F;
            if (jSONObject2 == null) {
            }
            SecureDocument secureDocument22 = an0Var.j1;
            ArrayList arrayList32 = an0Var.k1;
            SecureDocument secureDocument32 = an0Var.l1;
            linearLayout = an0Var.f0;
            if (linearLayout != null) {
                secureDocument = an0Var.m1;
            }
            ((dm0) qm0Var2).c(tL_secureRequiredType3, null, jSONObject3, tL_secureRequiredType22, jSONObject4, null, secureDocument22, arrayList32, secureDocument32, secureDocument, oj0Var, eVar);
            return true;
        }
        return false;
    }
}
