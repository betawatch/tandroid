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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class bn0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ un0 a;

    public bn0(un0 un0Var) {
        this.a = un0Var;
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
        un0 un0Var = this.a;
        int i15 = un0Var.b;
        if (i10 == -1) {
            if (un0Var.W0(true)) {
                return;
            }
            if (i15 == 0 || i15 == 5) {
                un0Var.V0(false);
            }
            un0Var.finishFragment();
            return;
        }
        if (i10 == 1) {
            if (un0Var.getParentActivity() == null) {
                return;
            }
            org.telegram.ui.Components.da0 da0Var = new org.telegram.ui.Components.da0(un0Var.getParentActivity(), null);
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
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(un0Var.getParentActivity());
            alertDialog$Builder.n(da0Var);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.PassportInfoTitle);
            alertDialog$Builder.h(LocaleController.getString(R.string.Close), null);
            un0Var.showDialog(alertDialog$Builder.a);
            return;
        }
        if (i10 == 2) {
            if (i15 == 5) {
                un0Var.A1(false);
                return;
            }
            if (i15 == 7) {
                un0Var.J1[un0Var.I1].h(null);
                return;
            }
            yk0 yk0Var = new yk0(this, 4);
            m4.c cVar = new m4.c(this, yk0Var, false, 14);
            if (i15 == 4) {
                if (un0Var.f) {
                    obj = un0Var.d1;
                } else if (un0.C0(un0Var)) {
                    return;
                } else {
                    obj = un0Var.Y[0].getText().toString();
                }
                ((wm0) un0Var.B1).c(un0Var.E, obj, null, null, null, null, null, null, null, null, yk0Var, cVar);
            } else if (i15 == 3) {
                if (un0Var.f) {
                    i14 = ((org.telegram.ui.ActionBar.m2) un0Var).currentAccount;
                    str = UserConfig.getInstance(i14).getCurrentUser().phone;
                } else {
                    if (un0.C0(un0Var)) {
                        return;
                    }
                    str = un0Var.Y[1].getText().toString() + un0Var.Y[2].getText().toString();
                }
                ((wm0) un0Var.B1).c(un0Var.E, str, null, null, null, null, null, null, null, null, yk0Var, cVar);
            } else if (i15 == 2) {
                if (!un0Var.o1.isEmpty() || un0.C0(un0Var)) {
                    return;
                }
                if (un0Var.t1()) {
                    un0Var.finishFragment();
                    return;
                }
                if (!un0Var.v0) {
                    jSONObject = new JSONObject();
                    try {
                        jSONObject.put("street_line1", un0Var.Y[0].getText().toString());
                        jSONObject.put("street_line2", un0Var.Y[1].getText().toString());
                        jSONObject.put("post_code", un0Var.Y[2].getText().toString());
                        jSONObject.put("city", un0Var.Y[3].getText().toString());
                        jSONObject.put("state", un0Var.Y[4].getText().toString());
                        jSONObject.put("country_code", un0Var.s);
                    } catch (Exception unused) {
                    }
                    hashMap = un0Var.w1;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    hashMap2 = un0Var.x1;
                    if (hashMap2 != null) {
                        hashMap2.clear();
                    }
                    ((wm0) un0Var.B1).c(un0Var.E, null, jSONObject != null ? jSONObject.toString() : null, un0Var.F, null, un0Var.i1, un0Var.j1, un0Var.k1, null, null, yk0Var, cVar);
                }
                jSONObject = null;
                hashMap = un0Var.w1;
                if (hashMap != null) {
                }
                hashMap2 = un0Var.x1;
                if (hashMap2 != null) {
                }
                ((wm0) un0Var.B1).c(un0Var.E, null, jSONObject != null ? jSONObject.toString() : null, un0Var.F, null, un0Var.i1, un0Var.j1, un0Var.k1, null, null, yk0Var, cVar);
            } else if (i15 == 1) {
                if (!c(yk0Var, cVar)) {
                    return;
                }
            } else if (i15 == 6) {
                TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposePassport();
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode.code = un0Var.Y[0].getText().toString();
                verifyemail.verification = tL_emailVerificationCode;
                i11 = ((org.telegram.ui.ActionBar.m2) un0Var).currentAccount;
                int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(verifyemail, new bi.f3(this, yk0Var, cVar, verifyemail, 10));
                i12 = ((org.telegram.ui.ActionBar.m2) un0Var).currentAccount;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i12);
                i13 = ((org.telegram.ui.ActionBar.m2) un0Var).classGuid;
                connectionsManager.bindRequestToGuid(sendRequest, i13);
            }
            un0Var.M1(true, true);
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
    public final boolean c(yk0 yk0Var, m4.c cVar) {
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
        un0 un0Var = this.a;
        int[] iArr = un0Var.x;
        boolean[] zArr = un0Var.t0;
        final int i13 = 0;
        if (un0Var.o1.isEmpty() && !un0.C0(un0Var)) {
            int i14 = 3;
            char c12 = 2;
            ?? r14 = 1;
            if (un0Var.u0) {
                un0Var.u0 = false;
                boolean z11 = false;
                int i15 = 0;
                while (i15 < zArr.length) {
                    if (zArr[i15]) {
                        un0Var.Y[i15].setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
                        if (!z11) {
                            String translitString = zArr[0] ? LocaleController.getInstance().getTranslitString(un0Var.a0[0].getText().toString(), r14) : un0Var.Y[0].getText().toString();
                            String translitString2 = zArr[r14] ? LocaleController.getInstance().getTranslitString(un0Var.a0[r14].getText().toString(), r14) : un0Var.Y[r14].getText().toString();
                            String translitString3 = zArr[c12] ? LocaleController.getInstance().getTranslitString(un0Var.a0[c12].getText().toString(), r14) : un0Var.Y[c12].getText().toString();
                            if (TextUtils.isEmpty(translitString) || TextUtils.isEmpty(translitString2) || TextUtils.isEmpty(translitString3)) {
                                i12 = i14;
                                c11 = c12;
                                z10 = r14;
                                un0Var.y1(un0Var.Y[i15]);
                            } else {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(un0Var.getParentActivity());
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
                                alertDialog$Builder.k(LocaleController.getString(R.string.Done), new org.telegram.ui.Components.d1(this, translitString, translitString2, translitString3, yk0Var, cVar, 1));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Edit), new i2.r(this, i15, 16));
                                un0Var.showDialog(a2Var);
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
            if (un0Var.t1()) {
                un0Var.finishFragment();
                return false;
            }
            SecureDocument secureDocument = null;
            try {
                if (un0Var.v0) {
                    jSONObject = null;
                } else {
                    HashMap hashMap3 = new HashMap(un0Var.s1);
                    if (un0Var.E.native_names) {
                        if (un0Var.q0.getVisibility() == 0) {
                            hashMap3.put("first_name_native", un0Var.a0[0].getText().toString());
                            hashMap3.put("middle_name_native", un0Var.a0[i11].getText().toString());
                            hashMap3.put("last_name_native", un0Var.a0[c10].getText().toString());
                        } else {
                            hashMap3.put("first_name_native", un0Var.Y[0].getText().toString());
                            hashMap3.put("middle_name_native", un0Var.Y[i11].getText().toString());
                            hashMap3.put("last_name_native", un0Var.Y[c10].getText().toString());
                        }
                    }
                    hashMap3.put("first_name", un0Var.Y[0].getText().toString());
                    hashMap3.put("middle_name", un0Var.Y[i11].getText().toString());
                    hashMap3.put("last_name", un0Var.Y[c10].getText().toString());
                    hashMap3.put("birth_date", un0Var.Y[i10].getText().toString());
                    hashMap3.put("gender", un0Var.w);
                    hashMap3.put("country_code", un0Var.s);
                    hashMap3.put("residence_country_code", un0Var.v);
                    jSONObject = new JSONObject();
                    try {
                        ArrayList arrayList = new ArrayList(hashMap3.keySet());
                        Collections.sort(arrayList, new Comparator(this) { // from class: org.telegram.ui.an0
                            public final /* synthetic */ bn0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.util.Comparator
                            public final int compare(Object obj, Object obj2) {
                                String str = (String) obj;
                                String str2 = (String) obj2;
                                switch (i13) {
                                    case 0:
                                        un0 un0Var2 = this.b.a;
                                        int B0 = un0.B0(un0Var2, str);
                                        int B02 = un0.B0(un0Var2, str2);
                                        if (B0 >= B02) {
                                            if (B0 > B02) {
                                            }
                                        }
                                        break;
                                    default:
                                        un0 un0Var3 = this.b.a;
                                        int B03 = un0.B0(un0Var3, str);
                                        int B04 = un0.B0(un0Var3, str2);
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
            if (un0Var.F != null) {
                HashMap hashMap4 = new HashMap(un0Var.t1);
                hashMap4.put("document_no", un0Var.Y[7].getText().toString());
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
                    Collections.sort(arrayList2, new Comparator(this) { // from class: org.telegram.ui.an0
                        public final /* synthetic */ bn0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            String str2 = (String) obj;
                            String str22 = (String) obj2;
                            switch (i18) {
                                case 0:
                                    un0 un0Var2 = this.b.a;
                                    int B0 = un0.B0(un0Var2, str2);
                                    int B02 = un0.B0(un0Var2, str22);
                                    if (B0 >= B02) {
                                        if (B0 > B02) {
                                        }
                                    }
                                    break;
                                default:
                                    un0 un0Var3 = this.b.a;
                                    int B03 = un0.B0(un0Var3, str2);
                                    int B04 = un0.B0(un0Var3, str22);
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
                hashMap = un0Var.w1;
                if (hashMap != null) {
                    hashMap.clear();
                }
                hashMap2 = un0Var.x1;
                if (hashMap2 != null) {
                    hashMap2.clear();
                }
                jn0 jn0Var = un0Var.B1;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = un0Var.E;
                String jSONObject3 = jSONObject == null ? jSONObject.toString() : null;
                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = un0Var.F;
                String jSONObject4 = jSONObject2 == null ? jSONObject2.toString() : null;
                SecureDocument secureDocument2 = un0Var.j1;
                ArrayList arrayList3 = un0Var.k1;
                SecureDocument secureDocument3 = un0Var.l1;
                linearLayout = un0Var.f0;
                if (linearLayout != null && linearLayout.getVisibility() == 0) {
                    secureDocument = un0Var.m1;
                }
                ((wm0) jn0Var).c(tL_secureRequiredType, null, jSONObject3, tL_secureRequiredType2, jSONObject4, null, secureDocument2, arrayList3, secureDocument3, secureDocument, yk0Var, cVar);
                return true;
            }
            jSONObject2 = null;
            hashMap = un0Var.w1;
            if (hashMap != null) {
            }
            hashMap2 = un0Var.x1;
            if (hashMap2 != null) {
            }
            jn0 jn0Var2 = un0Var.B1;
            TLRPC.TL_secureRequiredType tL_secureRequiredType3 = un0Var.E;
            if (jSONObject == null) {
            }
            TLRPC.TL_secureRequiredType tL_secureRequiredType22 = un0Var.F;
            if (jSONObject2 == null) {
            }
            SecureDocument secureDocument22 = un0Var.j1;
            ArrayList arrayList32 = un0Var.k1;
            SecureDocument secureDocument32 = un0Var.l1;
            linearLayout = un0Var.f0;
            if (linearLayout != null) {
                secureDocument = un0Var.m1;
            }
            ((wm0) jn0Var2).c(tL_secureRequiredType3, null, jSONObject3, tL_secureRequiredType22, jSONObject4, null, secureDocument22, arrayList32, secureDocument32, secureDocument, yk0Var, cVar);
            return true;
        }
        return false;
    }
}
