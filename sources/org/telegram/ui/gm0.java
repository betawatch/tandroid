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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class gm0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ xm0 a;

    public gm0(xm0 xm0Var) {
        this.a = xm0Var;
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
        xm0 xm0Var = this.a;
        int i15 = xm0Var.b;
        if (i10 == -1) {
            if (xm0Var.X0(true)) {
                return;
            }
            if (i15 == 0 || i15 == 5) {
                xm0Var.W0(false);
            }
            xm0Var.finishFragment();
            return;
        }
        if (i10 == 1) {
            if (xm0Var.getParentActivity() == null) {
                return;
            }
            org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(xm0Var.getParentActivity(), null);
            String string = LocaleController.getString(R.string.PassportInfo2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int indexOf = string.indexOf(42);
            int lastIndexOf = string.lastIndexOf(42);
            if (indexOf != -1 && lastIndexOf != -1) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.g4(LocaleController.getString(R.string.PassportInfoUrl), 4, this), indexOf, lastIndexOf - 1, 33);
            }
            p80Var.setText(spannableStringBuilder);
            p80Var.setTextSize(1, 16.0f);
            p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.k5, false));
            p80Var.setHighlightColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.l5, false));
            p80Var.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
            p80Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            p80Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.j5, false));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xm0Var.getParentActivity());
            alertDialog$Builder.n(p80Var);
            alertDialog$Builder.a.N = LocaleController.getString(R.string.PassportInfoTitle);
            alertDialog$Builder.h(LocaleController.getString(R.string.Close), null);
            xm0Var.showDialog(alertDialog$Builder.a);
            return;
        }
        if (i10 == 2) {
            if (i15 == 5) {
                xm0Var.B1(false);
                return;
            }
            if (i15 == 7) {
                xm0Var.F1[xm0Var.E1].h(null);
                return;
            }
            zk0 zk0Var = new zk0(this, 3);
            i6 i6Var = new i6(8, this, zk0Var);
            if (i15 == 4) {
                if (xm0Var.f) {
                    obj = xm0Var.Z0;
                } else if (xm0.D0(xm0Var)) {
                    return;
                } else {
                    obj = xm0Var.U[0].getText().toString();
                }
                ((bm0) xm0Var.x1).c(xm0Var.A, obj, null, null, null, null, null, null, null, null, zk0Var, i6Var);
            } else if (i15 == 3) {
                if (xm0Var.f) {
                    i14 = ((org.telegram.ui.ActionBar.n2) xm0Var).currentAccount;
                    str = UserConfig.getInstance(i14).getCurrentUser().phone;
                } else {
                    if (xm0.D0(xm0Var)) {
                        return;
                    }
                    str = xm0Var.U[1].getText().toString() + xm0Var.U[2].getText().toString();
                }
                ((bm0) xm0Var.x1).c(xm0Var.A, str, null, null, null, null, null, null, null, null, zk0Var, i6Var);
            } else if (i15 == 2) {
                if (!xm0Var.k1.isEmpty() || xm0.D0(xm0Var)) {
                    return;
                }
                if (xm0Var.u1()) {
                    xm0Var.finishFragment();
                    return;
                }
                if (!xm0Var.r0) {
                    jSONObject = new JSONObject();
                    try {
                        jSONObject.put("street_line1", xm0Var.U[0].getText().toString());
                        jSONObject.put("street_line2", xm0Var.U[1].getText().toString());
                        jSONObject.put("post_code", xm0Var.U[2].getText().toString());
                        jSONObject.put("city", xm0Var.U[3].getText().toString());
                        jSONObject.put("state", xm0Var.U[4].getText().toString());
                        jSONObject.put("country_code", xm0Var.s);
                    } catch (Exception unused) {
                    }
                    hashMap = xm0Var.s1;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    hashMap2 = xm0Var.t1;
                    if (hashMap2 != null) {
                        hashMap2.clear();
                    }
                    ((bm0) xm0Var.x1).c(xm0Var.A, null, jSONObject != null ? jSONObject.toString() : null, xm0Var.B, null, xm0Var.e1, xm0Var.f1, xm0Var.g1, null, null, zk0Var, i6Var);
                }
                jSONObject = null;
                hashMap = xm0Var.s1;
                if (hashMap != null) {
                }
                hashMap2 = xm0Var.t1;
                if (hashMap2 != null) {
                }
                ((bm0) xm0Var.x1).c(xm0Var.A, null, jSONObject != null ? jSONObject.toString() : null, xm0Var.B, null, xm0Var.e1, xm0Var.f1, xm0Var.g1, null, null, zk0Var, i6Var);
            } else if (i15 == 1) {
                if (!c(zk0Var, i6Var)) {
                    return;
                }
            } else if (i15 == 6) {
                TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposePassport();
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode.code = xm0Var.U[0].getText().toString();
                verifyemail.verification = tL_emailVerificationCode;
                i11 = ((org.telegram.ui.ActionBar.n2) xm0Var).currentAccount;
                int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(verifyemail, new gh.f1(this, zk0Var, i6Var, verifyemail, 14));
                i12 = ((org.telegram.ui.ActionBar.n2) xm0Var).currentAccount;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i12);
                i13 = ((org.telegram.ui.ActionBar.n2) xm0Var).classGuid;
                connectionsManager.bindRequestToGuid(sendRequest, i13);
            }
            xm0Var.N1(true, true);
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
    public final boolean c(zk0 zk0Var, i6 i6Var) {
        char c10;
        char c11;
        char c12;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        HashMap hashMap;
        HashMap hashMap2;
        LinearLayout linearLayout;
        xm0 xm0Var = this.a;
        int[] iArr = xm0Var.x;
        boolean[] zArr = xm0Var.p0;
        final int i10 = 0;
        if (xm0Var.k1.isEmpty() && !xm0.D0(xm0Var)) {
            int i11 = 3;
            char c13 = 2;
            ?? r14 = 1;
            if (xm0Var.q0) {
                xm0Var.q0 = false;
                boolean z10 = false;
                int i12 = 0;
                while (i12 < zArr.length) {
                    if (zArr[i12]) {
                        xm0Var.U[i12].setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
                        if (!z10) {
                            String translitString = zArr[0] ? LocaleController.getInstance().getTranslitString(xm0Var.W[0].getText().toString(), r14) : xm0Var.U[0].getText().toString();
                            String translitString2 = zArr[r14] ? LocaleController.getInstance().getTranslitString(xm0Var.W[r14].getText().toString(), r14) : xm0Var.U[r14].getText().toString();
                            String translitString3 = zArr[c13] ? LocaleController.getInstance().getTranslitString(xm0Var.W[c13].getText().toString(), r14) : xm0Var.U[c13].getText().toString();
                            if (TextUtils.isEmpty(translitString) || TextUtils.isEmpty(translitString2) || TextUtils.isEmpty(translitString3)) {
                                xm0Var.z1(xm0Var.U[i12]);
                            } else {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xm0Var.getParentActivity());
                                int i13 = R.string.PassportNameCheckAlert;
                                Object[] objArr = new Object[i11];
                                objArr[0] = translitString;
                                objArr[r14] = translitString2;
                                objArr[c13] = translitString3;
                                String formatString = LocaleController.formatString("PassportNameCheckAlert", i13, objArr);
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                b2Var.P = formatString;
                                b2Var.N = LocaleController.getString(R.string.AppName);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Done), new cg.d0(this, translitString, translitString2, translitString3, zk0Var, i6Var, 3));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Edit), new cg.p2(this, i12, 14));
                                xm0Var.showDialog(b2Var);
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
            if (xm0Var.u1()) {
                xm0Var.finishFragment();
                return false;
            }
            SecureDocument secureDocument = null;
            try {
                if (xm0Var.r0) {
                    jSONObject = null;
                } else {
                    HashMap hashMap3 = new HashMap(xm0Var.o1);
                    if (xm0Var.A.native_names) {
                        if (xm0Var.m0.getVisibility() == 0) {
                            hashMap3.put("first_name_native", xm0Var.W[0].getText().toString());
                            hashMap3.put("middle_name_native", xm0Var.W[c10].getText().toString());
                            hashMap3.put("last_name_native", xm0Var.W[c11].getText().toString());
                        } else {
                            hashMap3.put("first_name_native", xm0Var.U[0].getText().toString());
                            hashMap3.put("middle_name_native", xm0Var.U[c10].getText().toString());
                            hashMap3.put("last_name_native", xm0Var.U[c11].getText().toString());
                        }
                    }
                    hashMap3.put("first_name", xm0Var.U[0].getText().toString());
                    hashMap3.put("middle_name", xm0Var.U[c10].getText().toString());
                    hashMap3.put("last_name", xm0Var.U[c11].getText().toString());
                    hashMap3.put("birth_date", xm0Var.U[c12].getText().toString());
                    hashMap3.put("gender", xm0Var.w);
                    hashMap3.put("country_code", xm0Var.s);
                    hashMap3.put("residence_country_code", xm0Var.v);
                    jSONObject = new JSONObject();
                    try {
                        ArrayList arrayList = new ArrayList(hashMap3.keySet());
                        Collections.sort(arrayList, new Comparator(this) { // from class: org.telegram.ui.fm0
                            public final /* synthetic */ gm0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.util.Comparator
                            public final int compare(Object obj, Object obj2) {
                                String str = (String) obj;
                                String str2 = (String) obj2;
                                switch (i10) {
                                    case 0:
                                        xm0 xm0Var2 = this.b.a;
                                        int C0 = xm0.C0(xm0Var2, str);
                                        int C02 = xm0.C0(xm0Var2, str2);
                                        if (C0 >= C02) {
                                            if (C0 > C02) {
                                            }
                                        }
                                        break;
                                    default:
                                        xm0 xm0Var3 = this.b.a;
                                        int C03 = xm0.C0(xm0Var3, str);
                                        int C04 = xm0.C0(xm0Var3, str2);
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
            if (xm0Var.B != null) {
                HashMap hashMap4 = new HashMap(xm0Var.p1);
                hashMap4.put("document_no", xm0Var.U[7].getText().toString());
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
                    Collections.sort(arrayList2, new Comparator(this) { // from class: org.telegram.ui.fm0
                        public final /* synthetic */ gm0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            String str2 = (String) obj;
                            String str22 = (String) obj2;
                            switch (i15) {
                                case 0:
                                    xm0 xm0Var2 = this.b.a;
                                    int C0 = xm0.C0(xm0Var2, str2);
                                    int C02 = xm0.C0(xm0Var2, str22);
                                    if (C0 >= C02) {
                                        if (C0 > C02) {
                                        }
                                    }
                                    break;
                                default:
                                    xm0 xm0Var3 = this.b.a;
                                    int C03 = xm0.C0(xm0Var3, str2);
                                    int C04 = xm0.C0(xm0Var3, str22);
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
                hashMap = xm0Var.s1;
                if (hashMap != null) {
                    hashMap.clear();
                }
                hashMap2 = xm0Var.t1;
                if (hashMap2 != null) {
                    hashMap2.clear();
                }
                om0 om0Var = xm0Var.x1;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = xm0Var.A;
                String jSONObject3 = jSONObject == null ? jSONObject.toString() : null;
                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = xm0Var.B;
                String jSONObject4 = jSONObject2 == null ? jSONObject2.toString() : null;
                SecureDocument secureDocument2 = xm0Var.f1;
                ArrayList arrayList3 = xm0Var.g1;
                SecureDocument secureDocument3 = xm0Var.h1;
                linearLayout = xm0Var.b0;
                if (linearLayout != null && linearLayout.getVisibility() == 0) {
                    secureDocument = xm0Var.i1;
                }
                ((bm0) om0Var).c(tL_secureRequiredType, null, jSONObject3, tL_secureRequiredType2, jSONObject4, null, secureDocument2, arrayList3, secureDocument3, secureDocument, zk0Var, i6Var);
                return true;
            }
            jSONObject2 = null;
            hashMap = xm0Var.s1;
            if (hashMap != null) {
            }
            hashMap2 = xm0Var.t1;
            if (hashMap2 != null) {
            }
            om0 om0Var2 = xm0Var.x1;
            TLRPC.TL_secureRequiredType tL_secureRequiredType3 = xm0Var.A;
            if (jSONObject == null) {
            }
            TLRPC.TL_secureRequiredType tL_secureRequiredType22 = xm0Var.B;
            if (jSONObject2 == null) {
            }
            SecureDocument secureDocument22 = xm0Var.f1;
            ArrayList arrayList32 = xm0Var.g1;
            SecureDocument secureDocument32 = xm0Var.h1;
            linearLayout = xm0Var.b0;
            if (linearLayout != null) {
                secureDocument = xm0Var.i1;
            }
            ((bm0) om0Var2).c(tL_secureRequiredType3, null, jSONObject3, tL_secureRequiredType22, jSONObject4, null, secureDocument22, arrayList32, secureDocument32, secureDocument, zk0Var, i6Var);
            return true;
        }
        return false;
    }
}
