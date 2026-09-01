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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class nm0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ fn0 a;

    public nm0(fn0 fn0Var) {
        this.a = fn0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0226  */
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
        fn0 fn0Var = this.a;
        int i15 = fn0Var.b;
        if (i10 == -1) {
            if (fn0Var.X0(true)) {
                return;
            }
            if (i15 == 0 || i15 == 5) {
                fn0Var.W0(false);
            }
            fn0Var.finishFragment();
            return;
        }
        if (i10 == 1) {
            if (fn0Var.getParentActivity() == null) {
                return;
            }
            org.telegram.ui.Components.g90 g90Var = new org.telegram.ui.Components.g90(fn0Var.getParentActivity(), null);
            String string = LocaleController.getString(R.string.PassportInfo2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int indexOf = string.indexOf(42);
            int lastIndexOf = string.lastIndexOf(42);
            if (indexOf != -1 && lastIndexOf != -1) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.h4(LocaleController.getString(R.string.PassportInfoUrl), 4, this), indexOf, lastIndexOf - 1, 33);
            }
            g90Var.setText(spannableStringBuilder);
            g90Var.setTextSize(1, 16.0f);
            g90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.k5, false));
            g90Var.setHighlightColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.l5, false));
            g90Var.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
            g90Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            g90Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.j5, false));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fn0Var.getParentActivity());
            alertDialog$Builder.n(g90Var);
            alertDialog$Builder.a.O = LocaleController.getString(R.string.PassportInfoTitle);
            alertDialog$Builder.h(LocaleController.getString(R.string.Close), null);
            fn0Var.showDialog(alertDialog$Builder.a);
            return;
        }
        if (i10 == 2) {
            if (i15 == 5) {
                fn0Var.B1(false);
                return;
            }
            if (i15 == 7) {
                fn0Var.G1[fn0Var.F1].h(null);
                return;
            }
            gl0 gl0Var = new gl0(this, 3);
            n7.qa qaVar = new n7.qa(this, gl0Var, false, 17);
            if (i15 == 4) {
                if (fn0Var.f) {
                    obj = fn0Var.a1;
                } else if (fn0.D0(fn0Var)) {
                    return;
                } else {
                    obj = fn0Var.V[0].getText().toString();
                }
                ((im0) fn0Var.y1).c(fn0Var.B, obj, null, null, null, null, null, null, null, null, gl0Var, qaVar);
            } else if (i15 == 3) {
                if (fn0Var.f) {
                    i14 = ((org.telegram.ui.ActionBar.p2) fn0Var).currentAccount;
                    str = UserConfig.getInstance(i14).getCurrentUser().phone;
                } else {
                    if (fn0.D0(fn0Var)) {
                        return;
                    }
                    str = fn0Var.V[1].getText().toString() + fn0Var.V[2].getText().toString();
                }
                ((im0) fn0Var.y1).c(fn0Var.B, str, null, null, null, null, null, null, null, null, gl0Var, qaVar);
            } else if (i15 == 2) {
                if (!fn0Var.l1.isEmpty() || fn0.D0(fn0Var)) {
                    return;
                }
                if (fn0Var.u1()) {
                    fn0Var.finishFragment();
                    return;
                }
                if (!fn0Var.s0) {
                    jSONObject = new JSONObject();
                    try {
                        jSONObject.put("street_line1", fn0Var.V[0].getText().toString());
                        jSONObject.put("street_line2", fn0Var.V[1].getText().toString());
                        jSONObject.put("post_code", fn0Var.V[2].getText().toString());
                        jSONObject.put("city", fn0Var.V[3].getText().toString());
                        jSONObject.put("state", fn0Var.V[4].getText().toString());
                        jSONObject.put("country_code", fn0Var.s);
                    } catch (Exception unused) {
                    }
                    hashMap = fn0Var.t1;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    hashMap2 = fn0Var.u1;
                    if (hashMap2 != null) {
                        hashMap2.clear();
                    }
                    ((im0) fn0Var.y1).c(fn0Var.B, null, jSONObject != null ? jSONObject.toString() : null, fn0Var.C, null, fn0Var.f1, fn0Var.g1, fn0Var.h1, null, null, gl0Var, qaVar);
                }
                jSONObject = null;
                hashMap = fn0Var.t1;
                if (hashMap != null) {
                }
                hashMap2 = fn0Var.u1;
                if (hashMap2 != null) {
                }
                ((im0) fn0Var.y1).c(fn0Var.B, null, jSONObject != null ? jSONObject.toString() : null, fn0Var.C, null, fn0Var.f1, fn0Var.g1, fn0Var.h1, null, null, gl0Var, qaVar);
            } else if (i15 == 1) {
                if (!c(gl0Var, qaVar)) {
                    return;
                }
            } else if (i15 == 6) {
                TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposePassport();
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode.code = fn0Var.V[0].getText().toString();
                verifyemail.verification = tL_emailVerificationCode;
                i11 = ((org.telegram.ui.ActionBar.p2) fn0Var).currentAccount;
                int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(verifyemail, new lh.b1(this, gl0Var, qaVar, verifyemail, 13));
                i12 = ((org.telegram.ui.ActionBar.p2) fn0Var).currentAccount;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i12);
                i13 = ((org.telegram.ui.ActionBar.p2) fn0Var).classGuid;
                connectionsManager.bindRequestToGuid(sendRequest, i13);
            }
            fn0Var.N1(true, true);
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
    public final boolean c(gl0 gl0Var, n7.qa qaVar) {
        char c3;
        char c10;
        char c11;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        HashMap hashMap;
        HashMap hashMap2;
        LinearLayout linearLayout;
        fn0 fn0Var = this.a;
        int[] iArr = fn0Var.x;
        boolean[] zArr = fn0Var.q0;
        final int i10 = 0;
        if (fn0Var.l1.isEmpty() && !fn0.D0(fn0Var)) {
            int i11 = 3;
            char c12 = 2;
            ?? r14 = 1;
            if (fn0Var.r0) {
                fn0Var.r0 = false;
                boolean z4 = false;
                int i12 = 0;
                while (i12 < zArr.length) {
                    if (zArr[i12]) {
                        fn0Var.V[i12].setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
                        if (!z4) {
                            String translitString = zArr[0] ? LocaleController.getInstance().getTranslitString(fn0Var.X[0].getText().toString(), r14) : fn0Var.V[0].getText().toString();
                            String translitString2 = zArr[r14] ? LocaleController.getInstance().getTranslitString(fn0Var.X[r14].getText().toString(), r14) : fn0Var.V[r14].getText().toString();
                            String translitString3 = zArr[c12] ? LocaleController.getInstance().getTranslitString(fn0Var.X[c12].getText().toString(), r14) : fn0Var.V[c12].getText().toString();
                            if (TextUtils.isEmpty(translitString) || TextUtils.isEmpty(translitString2) || TextUtils.isEmpty(translitString3)) {
                                fn0Var.z1(fn0Var.V[i12]);
                            } else {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fn0Var.getParentActivity());
                                int i13 = R.string.PassportNameCheckAlert;
                                Object[] objArr = new Object[i11];
                                objArr[0] = translitString;
                                objArr[r14] = translitString2;
                                objArr[c12] = translitString3;
                                String formatString = LocaleController.formatString("PassportNameCheckAlert", i13, objArr);
                                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                                d2Var.Q = formatString;
                                d2Var.O = LocaleController.getString(R.string.AppName);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Done), new hg.d0(this, translitString, translitString2, translitString3, gl0Var, qaVar, 3));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Edit), new hg.m2(this, i12, 15));
                                fn0Var.showDialog(d2Var);
                            }
                            z4 = true;
                            i12++;
                            i11 = 3;
                            c12 = 2;
                            r14 = 1;
                        }
                    }
                    i12++;
                    i11 = 3;
                    c12 = 2;
                    r14 = 1;
                }
                c3 = 1;
                c10 = 2;
                c11 = 3;
            } else {
                c3 = 1;
                c10 = 2;
                c11 = 3;
            }
            if (fn0Var.u1()) {
                fn0Var.finishFragment();
                return false;
            }
            SecureDocument secureDocument = null;
            try {
                if (fn0Var.s0) {
                    jSONObject = null;
                } else {
                    HashMap hashMap3 = new HashMap(fn0Var.p1);
                    if (fn0Var.B.native_names) {
                        if (fn0Var.n0.getVisibility() == 0) {
                            hashMap3.put("first_name_native", fn0Var.X[0].getText().toString());
                            hashMap3.put("middle_name_native", fn0Var.X[c3].getText().toString());
                            hashMap3.put("last_name_native", fn0Var.X[c10].getText().toString());
                        } else {
                            hashMap3.put("first_name_native", fn0Var.V[0].getText().toString());
                            hashMap3.put("middle_name_native", fn0Var.V[c3].getText().toString());
                            hashMap3.put("last_name_native", fn0Var.V[c10].getText().toString());
                        }
                    }
                    hashMap3.put("first_name", fn0Var.V[0].getText().toString());
                    hashMap3.put("middle_name", fn0Var.V[c3].getText().toString());
                    hashMap3.put("last_name", fn0Var.V[c10].getText().toString());
                    hashMap3.put("birth_date", fn0Var.V[c11].getText().toString());
                    hashMap3.put("gender", fn0Var.w);
                    hashMap3.put("country_code", fn0Var.s);
                    hashMap3.put("residence_country_code", fn0Var.v);
                    jSONObject = new JSONObject();
                    try {
                        ArrayList arrayList = new ArrayList(hashMap3.keySet());
                        Collections.sort(arrayList, new Comparator(this) { // from class: org.telegram.ui.mm0
                            public final /* synthetic */ nm0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.util.Comparator
                            public final int compare(Object obj, Object obj2) {
                                String str = (String) obj;
                                String str2 = (String) obj2;
                                switch (i10) {
                                    case 0:
                                        fn0 fn0Var2 = this.b.a;
                                        int C0 = fn0.C0(fn0Var2, str);
                                        int C02 = fn0.C0(fn0Var2, str2);
                                        if (C0 >= C02) {
                                            if (C0 > C02) {
                                            }
                                        }
                                        break;
                                    default:
                                        fn0 fn0Var3 = this.b.a;
                                        int C03 = fn0.C0(fn0Var3, str);
                                        int C04 = fn0.C0(fn0Var3, str2);
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
            if (fn0Var.C != null) {
                HashMap hashMap4 = new HashMap(fn0Var.q1);
                hashMap4.put("document_no", fn0Var.V[7].getText().toString());
                if (iArr[0] != 0) {
                    Locale locale = Locale.US;
                    Integer valueOf = Integer.valueOf(iArr[c10]);
                    Integer valueOf2 = Integer.valueOf(iArr[c3]);
                    Integer valueOf3 = Integer.valueOf(iArr[0]);
                    Object[] objArr2 = new Object[3];
                    objArr2[0] = valueOf;
                    objArr2[c3] = valueOf2;
                    objArr2[c10] = valueOf3;
                    hashMap4.put("expiry_date", String.format(locale, "%02d.%02d.%d", objArr2));
                } else {
                    hashMap4.put("expiry_date", "");
                }
                jSONObject2 = new JSONObject();
                try {
                    ArrayList arrayList2 = new ArrayList(hashMap4.keySet());
                    final int i15 = 1;
                    Collections.sort(arrayList2, new Comparator(this) { // from class: org.telegram.ui.mm0
                        public final /* synthetic */ nm0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            String str2 = (String) obj;
                            String str22 = (String) obj2;
                            switch (i15) {
                                case 0:
                                    fn0 fn0Var2 = this.b.a;
                                    int C0 = fn0.C0(fn0Var2, str2);
                                    int C02 = fn0.C0(fn0Var2, str22);
                                    if (C0 >= C02) {
                                        if (C0 > C02) {
                                        }
                                    }
                                    break;
                                default:
                                    fn0 fn0Var3 = this.b.a;
                                    int C03 = fn0.C0(fn0Var3, str2);
                                    int C04 = fn0.C0(fn0Var3, str22);
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
                hashMap = fn0Var.t1;
                if (hashMap != null) {
                    hashMap.clear();
                }
                hashMap2 = fn0Var.u1;
                if (hashMap2 != null) {
                    hashMap2.clear();
                }
                vm0 vm0Var = fn0Var.y1;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = fn0Var.B;
                String jSONObject3 = jSONObject == null ? jSONObject.toString() : null;
                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = fn0Var.C;
                String jSONObject4 = jSONObject2 == null ? jSONObject2.toString() : null;
                SecureDocument secureDocument2 = fn0Var.g1;
                ArrayList arrayList3 = fn0Var.h1;
                SecureDocument secureDocument3 = fn0Var.i1;
                linearLayout = fn0Var.c0;
                if (linearLayout != null && linearLayout.getVisibility() == 0) {
                    secureDocument = fn0Var.j1;
                }
                ((im0) vm0Var).c(tL_secureRequiredType, null, jSONObject3, tL_secureRequiredType2, jSONObject4, null, secureDocument2, arrayList3, secureDocument3, secureDocument, gl0Var, qaVar);
                return true;
            }
            jSONObject2 = null;
            hashMap = fn0Var.t1;
            if (hashMap != null) {
            }
            hashMap2 = fn0Var.u1;
            if (hashMap2 != null) {
            }
            vm0 vm0Var2 = fn0Var.y1;
            TLRPC.TL_secureRequiredType tL_secureRequiredType3 = fn0Var.B;
            if (jSONObject == null) {
            }
            TLRPC.TL_secureRequiredType tL_secureRequiredType22 = fn0Var.C;
            if (jSONObject2 == null) {
            }
            SecureDocument secureDocument22 = fn0Var.g1;
            ArrayList arrayList32 = fn0Var.h1;
            SecureDocument secureDocument32 = fn0Var.i1;
            linearLayout = fn0Var.c0;
            if (linearLayout != null) {
                secureDocument = fn0Var.j1;
            }
            ((im0) vm0Var2).c(tL_secureRequiredType3, null, jSONObject3, tL_secureRequiredType22, jSONObject4, null, secureDocument22, arrayList32, secureDocument32, secureDocument, gl0Var, qaVar);
            return true;
        }
        return false;
    }
}
