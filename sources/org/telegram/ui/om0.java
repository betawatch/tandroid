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

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class om0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ gn0 a;

    public om0(gn0 gn0Var) {
        this.a = gn0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0225  */
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
        gn0 gn0Var = this.a;
        int i15 = gn0Var.b;
        if (i10 == -1) {
            if (gn0Var.X0(true)) {
                return;
            }
            if (i15 == 0 || i15 == 5) {
                gn0Var.W0(false);
            }
            gn0Var.finishFragment();
            return;
        }
        if (i10 == 1) {
            if (gn0Var.getParentActivity() == null) {
                return;
            }
            org.telegram.ui.Components.n90 n90Var = new org.telegram.ui.Components.n90(gn0Var.getParentActivity(), null);
            String string = LocaleController.getString(R.string.PassportInfo2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int indexOf = string.indexOf(42);
            int lastIndexOf = string.lastIndexOf(42);
            if (indexOf != -1 && lastIndexOf != -1) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.m4(LocaleController.getString(R.string.PassportInfoUrl), 4, this), indexOf, lastIndexOf - 1, 33);
            }
            n90Var.setText(spannableStringBuilder);
            n90Var.setTextSize(1, 16.0f);
            n90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.k5, false));
            n90Var.setHighlightColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.l5, false));
            n90Var.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
            n90Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            n90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.j5, false));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gn0Var.getParentActivity());
            alertDialog$Builder.n(n90Var);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.PassportInfoTitle);
            alertDialog$Builder.h(LocaleController.getString(R.string.Close), null);
            gn0Var.showDialog(alertDialog$Builder.a);
            return;
        }
        if (i10 == 2) {
            if (i15 == 5) {
                gn0Var.B1(false);
                return;
            }
            if (i15 == 7) {
                gn0Var.J1[gn0Var.I1].h(null);
                return;
            }
            il0 il0Var = new il0(this, 3);
            o0.a aVar = new o0.a(this, il0Var, false, 6);
            if (i15 == 4) {
                if (gn0Var.f) {
                    obj = gn0Var.d1;
                } else if (gn0.D0(gn0Var)) {
                    return;
                } else {
                    obj = gn0Var.Y[0].getText().toString();
                }
                ((jm0) gn0Var.B1).c(gn0Var.E, obj, null, null, null, null, null, null, null, null, il0Var, aVar);
            } else if (i15 == 3) {
                if (gn0Var.f) {
                    i14 = ((org.telegram.ui.ActionBar.m2) gn0Var).currentAccount;
                    str = UserConfig.getInstance(i14).getCurrentUser().phone;
                } else {
                    if (gn0.D0(gn0Var)) {
                        return;
                    }
                    str = gn0Var.Y[1].getText().toString() + gn0Var.Y[2].getText().toString();
                }
                ((jm0) gn0Var.B1).c(gn0Var.E, str, null, null, null, null, null, null, null, null, il0Var, aVar);
            } else if (i15 == 2) {
                if (!gn0Var.o1.isEmpty() || gn0.D0(gn0Var)) {
                    return;
                }
                if (gn0Var.u1()) {
                    gn0Var.finishFragment();
                    return;
                }
                if (!gn0Var.v0) {
                    jSONObject = new JSONObject();
                    try {
                        jSONObject.put("street_line1", gn0Var.Y[0].getText().toString());
                        jSONObject.put("street_line2", gn0Var.Y[1].getText().toString());
                        jSONObject.put("post_code", gn0Var.Y[2].getText().toString());
                        jSONObject.put("city", gn0Var.Y[3].getText().toString());
                        jSONObject.put("state", gn0Var.Y[4].getText().toString());
                        jSONObject.put("country_code", gn0Var.s);
                    } catch (Exception unused) {
                    }
                    hashMap = gn0Var.w1;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    hashMap2 = gn0Var.x1;
                    if (hashMap2 != null) {
                        hashMap2.clear();
                    }
                    ((jm0) gn0Var.B1).c(gn0Var.E, null, jSONObject != null ? jSONObject.toString() : null, gn0Var.F, null, gn0Var.i1, gn0Var.j1, gn0Var.k1, null, null, il0Var, aVar);
                }
                jSONObject = null;
                hashMap = gn0Var.w1;
                if (hashMap != null) {
                }
                hashMap2 = gn0Var.x1;
                if (hashMap2 != null) {
                }
                ((jm0) gn0Var.B1).c(gn0Var.E, null, jSONObject != null ? jSONObject.toString() : null, gn0Var.F, null, gn0Var.i1, gn0Var.j1, gn0Var.k1, null, null, il0Var, aVar);
            } else if (i15 == 1) {
                if (!c(il0Var, aVar)) {
                    return;
                }
            } else if (i15 == 6) {
                TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposePassport();
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode.code = gn0Var.Y[0].getText().toString();
                verifyemail.verification = tL_emailVerificationCode;
                i11 = ((org.telegram.ui.ActionBar.m2) gn0Var).currentAccount;
                int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(verifyemail, new ai.p3(this, il0Var, aVar, verifyemail, 10));
                i12 = ((org.telegram.ui.ActionBar.m2) gn0Var).currentAccount;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i12);
                i13 = ((org.telegram.ui.ActionBar.m2) gn0Var).classGuid;
                connectionsManager.bindRequestToGuid(sendRequest, i13);
            }
            gn0Var.N1(true, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x013c, code lost:
    
        if (r0 != false) goto L102;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02fa  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(il0 il0Var, o0.a aVar) {
        char c10;
        char c11;
        char c12;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        HashMap hashMap;
        HashMap hashMap2;
        LinearLayout linearLayout;
        gn0 gn0Var = this.a;
        int[] iArr = gn0Var.x;
        boolean[] zArr = gn0Var.t0;
        final int i10 = 0;
        if (gn0Var.o1.isEmpty() && !gn0.D0(gn0Var)) {
            int i11 = 3;
            char c13 = 2;
            ?? r14 = 1;
            if (gn0Var.u0) {
                gn0Var.u0 = false;
                boolean z10 = false;
                int i12 = 0;
                while (i12 < zArr.length) {
                    if (zArr[i12]) {
                        gn0Var.Y[i12].setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
                        if (!z10) {
                            String translitString = zArr[0] ? LocaleController.getInstance().getTranslitString(gn0Var.a0[0].getText().toString(), r14) : gn0Var.Y[0].getText().toString();
                            String translitString2 = zArr[r14] ? LocaleController.getInstance().getTranslitString(gn0Var.a0[r14].getText().toString(), r14) : gn0Var.Y[r14].getText().toString();
                            String translitString3 = zArr[c13] ? LocaleController.getInstance().getTranslitString(gn0Var.a0[c13].getText().toString(), r14) : gn0Var.Y[c13].getText().toString();
                            if (TextUtils.isEmpty(translitString) || TextUtils.isEmpty(translitString2) || TextUtils.isEmpty(translitString3)) {
                                gn0Var.z1(gn0Var.Y[i12]);
                            } else {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gn0Var.getParentActivity());
                                int i13 = R.string.PassportNameCheckAlert;
                                Object[] objArr = new Object[i11];
                                objArr[0] = translitString;
                                objArr[r14] = translitString2;
                                objArr[c13] = translitString3;
                                String formatString = LocaleController.formatString("PassportNameCheckAlert", i13, objArr);
                                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                                a2Var.T = formatString;
                                a2Var.R = LocaleController.getString(R.string.AppName);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Done), new org.telegram.ui.Components.d1(this, translitString, translitString2, translitString3, il0Var, aVar, 1));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Edit), new i2.s(this, i12, 16));
                                gn0Var.showDialog(a2Var);
                            }
                            z10 = true;
                            i12++;
                            i11 = 3;
                            c13 = 2;
                            r14 = 1;
                        }
                    }
                    i12++;
                    i11 = 3;
                    c13 = 2;
                    r14 = 1;
                }
                c10 = 1;
                c11 = 2;
                c12 = 3;
            } else {
                c10 = 1;
                c11 = 2;
                c12 = 3;
            }
            if (gn0Var.u1()) {
                gn0Var.finishFragment();
                return false;
            }
            SecureDocument secureDocument = null;
            try {
                if (gn0Var.v0) {
                    jSONObject = null;
                } else {
                    HashMap hashMap3 = new HashMap(gn0Var.s1);
                    if (gn0Var.E.native_names) {
                        if (gn0Var.q0.getVisibility() == 0) {
                            hashMap3.put("first_name_native", gn0Var.a0[0].getText().toString());
                            hashMap3.put("middle_name_native", gn0Var.a0[c10].getText().toString());
                            hashMap3.put("last_name_native", gn0Var.a0[c11].getText().toString());
                        } else {
                            hashMap3.put("first_name_native", gn0Var.Y[0].getText().toString());
                            hashMap3.put("middle_name_native", gn0Var.Y[c10].getText().toString());
                            hashMap3.put("last_name_native", gn0Var.Y[c11].getText().toString());
                        }
                    }
                    hashMap3.put("first_name", gn0Var.Y[0].getText().toString());
                    hashMap3.put("middle_name", gn0Var.Y[c10].getText().toString());
                    hashMap3.put("last_name", gn0Var.Y[c11].getText().toString());
                    hashMap3.put("birth_date", gn0Var.Y[c12].getText().toString());
                    hashMap3.put("gender", gn0Var.w);
                    hashMap3.put("country_code", gn0Var.s);
                    hashMap3.put("residence_country_code", gn0Var.v);
                    jSONObject = new JSONObject();
                    try {
                        ArrayList arrayList = new ArrayList(hashMap3.keySet());
                        Collections.sort(arrayList, new Comparator(this) { // from class: org.telegram.ui.nm0
                            public final /* synthetic */ om0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.util.Comparator
                            public final int compare(Object obj, Object obj2) {
                                String str = (String) obj;
                                String str2 = (String) obj2;
                                switch (i10) {
                                    case 0:
                                        gn0 gn0Var2 = this.b.a;
                                        int C0 = gn0.C0(gn0Var2, str);
                                        int C02 = gn0.C0(gn0Var2, str2);
                                        if (C0 >= C02) {
                                            if (C0 > C02) {
                                            }
                                        }
                                        break;
                                    default:
                                        gn0 gn0Var3 = this.b.a;
                                        int C03 = gn0.C0(gn0Var3, str);
                                        int C04 = gn0.C0(gn0Var3, str2);
                                        if (C03 >= C04) {
                                            if (C03 > C04) {
                                            }
                                        }
                                        break;
                                }
                                return 0;
                            }
                        });
                        int size = arrayList.size();
                        for (int i14 = 0; i14 < size; i14++) {
                            String str = (String) arrayList.get(i14);
                            jSONObject.put(str, hashMap3.get(str));
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception unused2) {
                jSONObject = null;
                jSONObject2 = null;
            }
            if (gn0Var.F != null) {
                HashMap hashMap4 = new HashMap(gn0Var.t1);
                hashMap4.put("document_no", gn0Var.Y[7].getText().toString());
                if (iArr[0] != 0) {
                    Locale locale = Locale.US;
                    Integer valueOf = Integer.valueOf(iArr[c11]);
                    Integer valueOf2 = Integer.valueOf(iArr[c10]);
                    Integer valueOf3 = Integer.valueOf(iArr[0]);
                    Object[] objArr2 = new Object[3];
                    objArr2[0] = valueOf;
                    objArr2[c10] = valueOf2;
                    objArr2[c11] = valueOf3;
                    hashMap4.put("expiry_date", String.format(locale, "%02d.%02d.%d", objArr2));
                } else {
                    hashMap4.put("expiry_date", "");
                }
                jSONObject2 = new JSONObject();
                try {
                    ArrayList arrayList2 = new ArrayList(hashMap4.keySet());
                    final int i15 = 1;
                    Collections.sort(arrayList2, new Comparator(this) { // from class: org.telegram.ui.nm0
                        public final /* synthetic */ om0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            String str2 = (String) obj;
                            String str22 = (String) obj2;
                            switch (i15) {
                                case 0:
                                    gn0 gn0Var2 = this.b.a;
                                    int C0 = gn0.C0(gn0Var2, str2);
                                    int C02 = gn0.C0(gn0Var2, str22);
                                    if (C0 >= C02) {
                                        if (C0 > C02) {
                                        }
                                    }
                                    break;
                                default:
                                    gn0 gn0Var3 = this.b.a;
                                    int C03 = gn0.C0(gn0Var3, str2);
                                    int C04 = gn0.C0(gn0Var3, str22);
                                    if (C03 >= C04) {
                                        if (C03 > C04) {
                                        }
                                    }
                                    break;
                            }
                            return 0;
                        }
                    });
                    int size2 = arrayList2.size();
                    while (i10 < size2) {
                        String str2 = (String) arrayList2.get(i10);
                        jSONObject2.put(str2, hashMap4.get(str2));
                        i10++;
                    }
                } catch (Exception unused3) {
                }
                hashMap = gn0Var.w1;
                if (hashMap != null) {
                    hashMap.clear();
                }
                hashMap2 = gn0Var.x1;
                if (hashMap2 != null) {
                    hashMap2.clear();
                }
                wm0 wm0Var = gn0Var.B1;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = gn0Var.E;
                String jSONObject3 = jSONObject == null ? jSONObject.toString() : null;
                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = gn0Var.F;
                String jSONObject4 = jSONObject2 == null ? jSONObject2.toString() : null;
                SecureDocument secureDocument2 = gn0Var.j1;
                ArrayList arrayList3 = gn0Var.k1;
                SecureDocument secureDocument3 = gn0Var.l1;
                linearLayout = gn0Var.f0;
                if (linearLayout != null && linearLayout.getVisibility() == 0) {
                    secureDocument = gn0Var.m1;
                }
                ((jm0) wm0Var).c(tL_secureRequiredType, null, jSONObject3, tL_secureRequiredType2, jSONObject4, null, secureDocument2, arrayList3, secureDocument3, secureDocument, il0Var, aVar);
                return true;
            }
            jSONObject2 = null;
            hashMap = gn0Var.w1;
            if (hashMap != null) {
            }
            hashMap2 = gn0Var.x1;
            if (hashMap2 != null) {
            }
            wm0 wm0Var2 = gn0Var.B1;
            TLRPC.TL_secureRequiredType tL_secureRequiredType3 = gn0Var.E;
            if (jSONObject == null) {
            }
            TLRPC.TL_secureRequiredType tL_secureRequiredType22 = gn0Var.F;
            if (jSONObject2 == null) {
            }
            SecureDocument secureDocument22 = gn0Var.j1;
            ArrayList arrayList32 = gn0Var.k1;
            SecureDocument secureDocument32 = gn0Var.l1;
            linearLayout = gn0Var.f0;
            if (linearLayout != null) {
                secureDocument = gn0Var.m1;
            }
            ((jm0) wm0Var2).c(tL_secureRequiredType3, null, jSONObject3, tL_secureRequiredType22, jSONObject4, null, secureDocument22, arrayList32, secureDocument32, secureDocument, il0Var, aVar);
            return true;
        }
        return false;
    }
}
