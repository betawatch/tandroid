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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class fm0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ wm0 a;

    public fm0(wm0 wm0Var) {
        this.a = wm0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0224  */
    @Override // org.telegram.ui.ActionBar.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i9) {
        int i10;
        int i11;
        int i12;
        JSONObject jSONObject;
        HashMap hashMap;
        HashMap hashMap2;
        String str;
        int i13;
        String obj;
        wm0 wm0Var = this.a;
        int i14 = wm0Var.b;
        if (i9 == -1) {
            if (wm0Var.X0(true)) {
                return;
            }
            if (i14 == 0 || i14 == 5) {
                wm0Var.W0(false);
            }
            wm0Var.finishFragment();
            return;
        }
        if (i9 == 1) {
            if (wm0Var.getParentActivity() == null) {
                return;
            }
            org.telegram.ui.Components.l80 l80Var = new org.telegram.ui.Components.l80(wm0Var.getParentActivity(), null);
            String string = LocaleController.getString(R.string.PassportInfo2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int indexOf = string.indexOf(42);
            int lastIndexOf = string.lastIndexOf(42);
            if (indexOf != -1 && lastIndexOf != -1) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.g4(LocaleController.getString(R.string.PassportInfoUrl), 4, this), indexOf, lastIndexOf - 1, 33);
            }
            l80Var.setText(spannableStringBuilder);
            l80Var.setTextSize(1, 16.0f);
            l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.k5, false));
            l80Var.setHighlightColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.l5, false));
            l80Var.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
            l80Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            l80Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.j5, false));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wm0Var.getParentActivity());
            alertDialog$Builder.n(l80Var);
            alertDialog$Builder.a.N = LocaleController.getString(R.string.PassportInfoTitle);
            alertDialog$Builder.h(LocaleController.getString(R.string.Close), null);
            wm0Var.showDialog(alertDialog$Builder.a);
            return;
        }
        if (i9 == 2) {
            if (i14 == 5) {
                wm0Var.B1(false);
                return;
            }
            if (i14 == 7) {
                wm0Var.F1[wm0Var.E1].h(null);
                return;
            }
            zk0 zk0Var = new zk0(this, 3);
            org.telegram.ui.Cells.e3 e3Var = new org.telegram.ui.Cells.e3(7, this, zk0Var);
            if (i14 == 4) {
                if (wm0Var.f) {
                    obj = wm0Var.Z0;
                } else if (wm0.C0(wm0Var)) {
                    return;
                } else {
                    obj = wm0Var.U[0].getText().toString();
                }
                ((am0) wm0Var.x1).c(wm0Var.A, obj, null, null, null, null, null, null, null, null, zk0Var, e3Var);
            } else if (i14 == 3) {
                if (wm0Var.f) {
                    i13 = ((org.telegram.ui.ActionBar.o2) wm0Var).currentAccount;
                    str = UserConfig.getInstance(i13).getCurrentUser().phone;
                } else {
                    if (wm0.C0(wm0Var)) {
                        return;
                    }
                    str = wm0Var.U[1].getText().toString() + wm0Var.U[2].getText().toString();
                }
                ((am0) wm0Var.x1).c(wm0Var.A, str, null, null, null, null, null, null, null, null, zk0Var, e3Var);
            } else if (i14 == 2) {
                if (!wm0Var.k1.isEmpty() || wm0.C0(wm0Var)) {
                    return;
                }
                if (wm0Var.u1()) {
                    wm0Var.finishFragment();
                    return;
                }
                if (!wm0Var.r0) {
                    jSONObject = new JSONObject();
                    try {
                        jSONObject.put("street_line1", wm0Var.U[0].getText().toString());
                        jSONObject.put("street_line2", wm0Var.U[1].getText().toString());
                        jSONObject.put("post_code", wm0Var.U[2].getText().toString());
                        jSONObject.put("city", wm0Var.U[3].getText().toString());
                        jSONObject.put("state", wm0Var.U[4].getText().toString());
                        jSONObject.put("country_code", wm0Var.s);
                    } catch (Exception unused) {
                    }
                    hashMap = wm0Var.s1;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    hashMap2 = wm0Var.t1;
                    if (hashMap2 != null) {
                        hashMap2.clear();
                    }
                    ((am0) wm0Var.x1).c(wm0Var.A, null, jSONObject != null ? jSONObject.toString() : null, wm0Var.B, null, wm0Var.e1, wm0Var.f1, wm0Var.g1, null, null, zk0Var, e3Var);
                }
                jSONObject = null;
                hashMap = wm0Var.s1;
                if (hashMap != null) {
                }
                hashMap2 = wm0Var.t1;
                if (hashMap2 != null) {
                }
                ((am0) wm0Var.x1).c(wm0Var.A, null, jSONObject != null ? jSONObject.toString() : null, wm0Var.B, null, wm0Var.e1, wm0Var.f1, wm0Var.g1, null, null, zk0Var, e3Var);
            } else if (i14 == 1) {
                if (!c(zk0Var, e3Var)) {
                    return;
                }
            } else if (i14 == 6) {
                TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposePassport();
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode.code = wm0Var.U[0].getText().toString();
                verifyemail.verification = tL_emailVerificationCode;
                i10 = ((org.telegram.ui.ActionBar.o2) wm0Var).currentAccount;
                int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(verifyemail, new fh.h1(this, zk0Var, e3Var, verifyemail, 16));
                i11 = ((org.telegram.ui.ActionBar.o2) wm0Var).currentAccount;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                i12 = ((org.telegram.ui.ActionBar.o2) wm0Var).classGuid;
                connectionsManager.bindRequestToGuid(sendRequest, i12);
            }
            wm0Var.N1(true, true);
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
    public final boolean c(zk0 zk0Var, org.telegram.ui.Cells.e3 e3Var) {
        char c10;
        char c11;
        char c12;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        HashMap hashMap;
        HashMap hashMap2;
        LinearLayout linearLayout;
        wm0 wm0Var = this.a;
        int[] iArr = wm0Var.x;
        boolean[] zArr = wm0Var.p0;
        final int i9 = 0;
        if (wm0Var.k1.isEmpty() && !wm0.C0(wm0Var)) {
            int i10 = 3;
            char c13 = 2;
            ?? r14 = 1;
            if (wm0Var.q0) {
                wm0Var.q0 = false;
                boolean z10 = false;
                int i11 = 0;
                while (i11 < zArr.length) {
                    if (zArr[i11]) {
                        wm0Var.U[i11].setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
                        if (!z10) {
                            String translitString = zArr[0] ? LocaleController.getInstance().getTranslitString(wm0Var.W[0].getText().toString(), r14) : wm0Var.U[0].getText().toString();
                            String translitString2 = zArr[r14] ? LocaleController.getInstance().getTranslitString(wm0Var.W[r14].getText().toString(), r14) : wm0Var.U[r14].getText().toString();
                            String translitString3 = zArr[c13] ? LocaleController.getInstance().getTranslitString(wm0Var.W[c13].getText().toString(), r14) : wm0Var.U[c13].getText().toString();
                            if (TextUtils.isEmpty(translitString) || TextUtils.isEmpty(translitString2) || TextUtils.isEmpty(translitString3)) {
                                wm0Var.z1(wm0Var.U[i11]);
                            } else {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wm0Var.getParentActivity());
                                int i12 = R.string.PassportNameCheckAlert;
                                Object[] objArr = new Object[i10];
                                objArr[0] = translitString;
                                objArr[r14] = translitString2;
                                objArr[c13] = translitString3;
                                String formatString = LocaleController.formatString("PassportNameCheckAlert", i12, objArr);
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                c2Var.P = formatString;
                                c2Var.N = LocaleController.getString(R.string.AppName);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Done), new bg.g0(this, translitString, translitString2, translitString3, zk0Var, e3Var, 3));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Edit), new bg.x2(this, i11, 14));
                                wm0Var.showDialog(c2Var);
                            }
                            z10 = true;
                            i11++;
                            i10 = 3;
                            c13 = 2;
                            r14 = 1;
                        }
                    }
                    i11++;
                    i10 = 3;
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
            if (wm0Var.u1()) {
                wm0Var.finishFragment();
                return false;
            }
            SecureDocument secureDocument = null;
            try {
                if (wm0Var.r0) {
                    jSONObject = null;
                } else {
                    HashMap hashMap3 = new HashMap(wm0Var.o1);
                    if (wm0Var.A.native_names) {
                        if (wm0Var.m0.getVisibility() == 0) {
                            hashMap3.put("first_name_native", wm0Var.W[0].getText().toString());
                            hashMap3.put("middle_name_native", wm0Var.W[c10].getText().toString());
                            hashMap3.put("last_name_native", wm0Var.W[c11].getText().toString());
                        } else {
                            hashMap3.put("first_name_native", wm0Var.U[0].getText().toString());
                            hashMap3.put("middle_name_native", wm0Var.U[c10].getText().toString());
                            hashMap3.put("last_name_native", wm0Var.U[c11].getText().toString());
                        }
                    }
                    hashMap3.put("first_name", wm0Var.U[0].getText().toString());
                    hashMap3.put("middle_name", wm0Var.U[c10].getText().toString());
                    hashMap3.put("last_name", wm0Var.U[c11].getText().toString());
                    hashMap3.put("birth_date", wm0Var.U[c12].getText().toString());
                    hashMap3.put("gender", wm0Var.w);
                    hashMap3.put("country_code", wm0Var.s);
                    hashMap3.put("residence_country_code", wm0Var.v);
                    jSONObject = new JSONObject();
                    try {
                        ArrayList arrayList = new ArrayList(hashMap3.keySet());
                        Collections.sort(arrayList, new Comparator(this) { // from class: org.telegram.ui.em0
                            public final /* synthetic */ fm0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.util.Comparator
                            public final int compare(Object obj, Object obj2) {
                                String str = (String) obj;
                                String str2 = (String) obj2;
                                switch (i9) {
                                    case 0:
                                        wm0 wm0Var2 = this.b.a;
                                        int B0 = wm0.B0(wm0Var2, str);
                                        int B02 = wm0.B0(wm0Var2, str2);
                                        if (B0 >= B02) {
                                            if (B0 > B02) {
                                            }
                                        }
                                        break;
                                    default:
                                        wm0 wm0Var3 = this.b.a;
                                        int B03 = wm0.B0(wm0Var3, str);
                                        int B04 = wm0.B0(wm0Var3, str2);
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
                        for (int i13 = 0; i13 < size; i13++) {
                            String str = (String) arrayList.get(i13);
                            jSONObject.put(str, hashMap3.get(str));
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception unused2) {
                jSONObject = null;
                jSONObject2 = null;
            }
            if (wm0Var.B != null) {
                HashMap hashMap4 = new HashMap(wm0Var.p1);
                hashMap4.put("document_no", wm0Var.U[7].getText().toString());
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
                    final int i14 = 1;
                    Collections.sort(arrayList2, new Comparator(this) { // from class: org.telegram.ui.em0
                        public final /* synthetic */ fm0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            String str2 = (String) obj;
                            String str22 = (String) obj2;
                            switch (i14) {
                                case 0:
                                    wm0 wm0Var2 = this.b.a;
                                    int B0 = wm0.B0(wm0Var2, str2);
                                    int B02 = wm0.B0(wm0Var2, str22);
                                    if (B0 >= B02) {
                                        if (B0 > B02) {
                                        }
                                    }
                                    break;
                                default:
                                    wm0 wm0Var3 = this.b.a;
                                    int B03 = wm0.B0(wm0Var3, str2);
                                    int B04 = wm0.B0(wm0Var3, str22);
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
                    while (i9 < size2) {
                        String str2 = (String) arrayList2.get(i9);
                        jSONObject2.put(str2, hashMap4.get(str2));
                        i9++;
                    }
                } catch (Exception unused3) {
                }
                hashMap = wm0Var.s1;
                if (hashMap != null) {
                    hashMap.clear();
                }
                hashMap2 = wm0Var.t1;
                if (hashMap2 != null) {
                    hashMap2.clear();
                }
                nm0 nm0Var = wm0Var.x1;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = wm0Var.A;
                String jSONObject3 = jSONObject == null ? jSONObject.toString() : null;
                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = wm0Var.B;
                String jSONObject4 = jSONObject2 == null ? jSONObject2.toString() : null;
                SecureDocument secureDocument2 = wm0Var.f1;
                ArrayList arrayList3 = wm0Var.g1;
                SecureDocument secureDocument3 = wm0Var.h1;
                linearLayout = wm0Var.b0;
                if (linearLayout != null && linearLayout.getVisibility() == 0) {
                    secureDocument = wm0Var.i1;
                }
                ((am0) nm0Var).c(tL_secureRequiredType, null, jSONObject3, tL_secureRequiredType2, jSONObject4, null, secureDocument2, arrayList3, secureDocument3, secureDocument, zk0Var, e3Var);
                return true;
            }
            jSONObject2 = null;
            hashMap = wm0Var.s1;
            if (hashMap != null) {
            }
            hashMap2 = wm0Var.t1;
            if (hashMap2 != null) {
            }
            nm0 nm0Var2 = wm0Var.x1;
            TLRPC.TL_secureRequiredType tL_secureRequiredType3 = wm0Var.A;
            if (jSONObject == null) {
            }
            TLRPC.TL_secureRequiredType tL_secureRequiredType22 = wm0Var.B;
            if (jSONObject2 == null) {
            }
            SecureDocument secureDocument22 = wm0Var.f1;
            ArrayList arrayList32 = wm0Var.g1;
            SecureDocument secureDocument32 = wm0Var.h1;
            linearLayout = wm0Var.b0;
            if (linearLayout != null) {
                secureDocument = wm0Var.i1;
            }
            ((am0) nm0Var2).c(tL_secureRequiredType3, null, jSONObject3, tL_secureRequiredType22, jSONObject4, null, secureDocument22, arrayList32, secureDocument32, secureDocument, zk0Var, e3Var);
            return true;
        }
        return false;
    }
}
