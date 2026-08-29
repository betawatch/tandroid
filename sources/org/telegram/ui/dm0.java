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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class dm0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ vm0 a;

    public dm0(vm0 vm0Var) {
        this.a = vm0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0226  */
    @Override // org.telegram.ui.ActionBar.k
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
        vm0 vm0Var = this.a;
        int i15 = vm0Var.b;
        if (i10 == -1) {
            if (vm0Var.X0(true)) {
                return;
            }
            if (i15 == 0 || i15 == 5) {
                vm0Var.W0(false);
            }
            vm0Var.finishFragment();
            return;
        }
        if (i10 == 1) {
            if (vm0Var.getParentActivity() == null) {
                return;
            }
            org.telegram.ui.Components.y80 y80Var = new org.telegram.ui.Components.y80(vm0Var.getParentActivity(), null);
            String string = LocaleController.getString(R.string.PassportInfo2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int indexOf = string.indexOf(42);
            int lastIndexOf = string.lastIndexOf(42);
            if (indexOf != -1 && lastIndexOf != -1) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.k4(LocaleController.getString(R.string.PassportInfoUrl), 4, this), indexOf, lastIndexOf - 1, 33);
            }
            y80Var.setText(spannableStringBuilder);
            y80Var.setTextSize(1, 16.0f);
            y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.k5, false));
            y80Var.setHighlightColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.l5, false));
            y80Var.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
            y80Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            y80Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.j5, false));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vm0Var.getParentActivity());
            alertDialog$Builder.n(y80Var);
            alertDialog$Builder.a.N = LocaleController.getString(R.string.PassportInfoTitle);
            alertDialog$Builder.h(LocaleController.getString(R.string.Close), null);
            vm0Var.showDialog(alertDialog$Builder.a);
            return;
        }
        if (i10 == 2) {
            if (i15 == 5) {
                vm0Var.B1(false);
                return;
            }
            if (i15 == 7) {
                vm0Var.F1[vm0Var.E1].h(null);
                return;
            }
            vk0 vk0Var = new vk0(this, 3);
            oc.i iVar = new oc.i(this, vk0Var, false, 10);
            if (i15 == 4) {
                if (vm0Var.f) {
                    obj = vm0Var.Z0;
                } else if (vm0.D0(vm0Var)) {
                    return;
                } else {
                    obj = vm0Var.U[0].getText().toString();
                }
                ((yl0) vm0Var.x1).c(vm0Var.A, obj, null, null, null, null, null, null, null, null, vk0Var, iVar);
            } else if (i15 == 3) {
                if (vm0Var.f) {
                    i14 = ((org.telegram.ui.ActionBar.o2) vm0Var).currentAccount;
                    str = UserConfig.getInstance(i14).getCurrentUser().phone;
                } else {
                    if (vm0.D0(vm0Var)) {
                        return;
                    }
                    str = vm0Var.U[1].getText().toString() + vm0Var.U[2].getText().toString();
                }
                ((yl0) vm0Var.x1).c(vm0Var.A, str, null, null, null, null, null, null, null, null, vk0Var, iVar);
            } else if (i15 == 2) {
                if (!vm0Var.k1.isEmpty() || vm0.D0(vm0Var)) {
                    return;
                }
                if (vm0Var.u1()) {
                    vm0Var.finishFragment();
                    return;
                }
                if (!vm0Var.r0) {
                    jSONObject = new JSONObject();
                    try {
                        jSONObject.put("street_line1", vm0Var.U[0].getText().toString());
                        jSONObject.put("street_line2", vm0Var.U[1].getText().toString());
                        jSONObject.put("post_code", vm0Var.U[2].getText().toString());
                        jSONObject.put("city", vm0Var.U[3].getText().toString());
                        jSONObject.put("state", vm0Var.U[4].getText().toString());
                        jSONObject.put("country_code", vm0Var.s);
                    } catch (Exception unused) {
                    }
                    hashMap = vm0Var.s1;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    hashMap2 = vm0Var.t1;
                    if (hashMap2 != null) {
                        hashMap2.clear();
                    }
                    ((yl0) vm0Var.x1).c(vm0Var.A, null, jSONObject != null ? jSONObject.toString() : null, vm0Var.B, null, vm0Var.e1, vm0Var.f1, vm0Var.g1, null, null, vk0Var, iVar);
                }
                jSONObject = null;
                hashMap = vm0Var.s1;
                if (hashMap != null) {
                }
                hashMap2 = vm0Var.t1;
                if (hashMap2 != null) {
                }
                ((yl0) vm0Var.x1).c(vm0Var.A, null, jSONObject != null ? jSONObject.toString() : null, vm0Var.B, null, vm0Var.e1, vm0Var.f1, vm0Var.g1, null, null, vk0Var, iVar);
            } else if (i15 == 1) {
                if (!c(vk0Var, iVar)) {
                    return;
                }
            } else if (i15 == 6) {
                TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposePassport();
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode.code = vm0Var.U[0].getText().toString();
                verifyemail.verification = tL_emailVerificationCode;
                i11 = ((org.telegram.ui.ActionBar.o2) vm0Var).currentAccount;
                int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(verifyemail, new ih.c1(this, vk0Var, iVar, verifyemail, 14));
                i12 = ((org.telegram.ui.ActionBar.o2) vm0Var).currentAccount;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i12);
                i13 = ((org.telegram.ui.ActionBar.o2) vm0Var).classGuid;
                connectionsManager.bindRequestToGuid(sendRequest, i13);
            }
            vm0Var.N1(true, true);
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
    public final boolean c(vk0 vk0Var, oc.i iVar) {
        char c3;
        char c6;
        char c10;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        HashMap hashMap;
        HashMap hashMap2;
        LinearLayout linearLayout;
        vm0 vm0Var = this.a;
        int[] iArr = vm0Var.x;
        boolean[] zArr = vm0Var.p0;
        final int i10 = 0;
        if (vm0Var.k1.isEmpty() && !vm0.D0(vm0Var)) {
            int i11 = 3;
            char c11 = 2;
            ?? r14 = 1;
            if (vm0Var.q0) {
                vm0Var.q0 = false;
                boolean z10 = false;
                int i12 = 0;
                while (i12 < zArr.length) {
                    if (zArr[i12]) {
                        vm0Var.U[i12].setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
                        if (!z10) {
                            String translitString = zArr[0] ? LocaleController.getInstance().getTranslitString(vm0Var.W[0].getText().toString(), r14) : vm0Var.U[0].getText().toString();
                            String translitString2 = zArr[r14] ? LocaleController.getInstance().getTranslitString(vm0Var.W[r14].getText().toString(), r14) : vm0Var.U[r14].getText().toString();
                            String translitString3 = zArr[c11] ? LocaleController.getInstance().getTranslitString(vm0Var.W[c11].getText().toString(), r14) : vm0Var.U[c11].getText().toString();
                            if (TextUtils.isEmpty(translitString) || TextUtils.isEmpty(translitString2) || TextUtils.isEmpty(translitString3)) {
                                vm0Var.z1(vm0Var.U[i12]);
                            } else {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vm0Var.getParentActivity());
                                int i13 = R.string.PassportNameCheckAlert;
                                Object[] objArr = new Object[i11];
                                objArr[0] = translitString;
                                objArr[r14] = translitString2;
                                objArr[c11] = translitString3;
                                String formatString = LocaleController.formatString("PassportNameCheckAlert", i13, objArr);
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                c2Var.P = formatString;
                                c2Var.N = LocaleController.getString(R.string.AppName);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Done), new eg.e0(this, translitString, translitString2, translitString3, vk0Var, iVar, 3));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Edit), new eg.n2(this, i12, 14));
                                vm0Var.showDialog(c2Var);
                            }
                            z10 = true;
                            i12++;
                            i11 = 3;
                            c11 = 2;
                            r14 = 1;
                        }
                    }
                    i12++;
                    i11 = 3;
                    c11 = 2;
                    r14 = 1;
                }
                c3 = 1;
                c6 = 2;
                c10 = 3;
            } else {
                c3 = 1;
                c6 = 2;
                c10 = 3;
            }
            if (vm0Var.u1()) {
                vm0Var.finishFragment();
                return false;
            }
            SecureDocument secureDocument = null;
            try {
                if (vm0Var.r0) {
                    jSONObject = null;
                } else {
                    HashMap hashMap3 = new HashMap(vm0Var.o1);
                    if (vm0Var.A.native_names) {
                        if (vm0Var.m0.getVisibility() == 0) {
                            hashMap3.put("first_name_native", vm0Var.W[0].getText().toString());
                            hashMap3.put("middle_name_native", vm0Var.W[c3].getText().toString());
                            hashMap3.put("last_name_native", vm0Var.W[c6].getText().toString());
                        } else {
                            hashMap3.put("first_name_native", vm0Var.U[0].getText().toString());
                            hashMap3.put("middle_name_native", vm0Var.U[c3].getText().toString());
                            hashMap3.put("last_name_native", vm0Var.U[c6].getText().toString());
                        }
                    }
                    hashMap3.put("first_name", vm0Var.U[0].getText().toString());
                    hashMap3.put("middle_name", vm0Var.U[c3].getText().toString());
                    hashMap3.put("last_name", vm0Var.U[c6].getText().toString());
                    hashMap3.put("birth_date", vm0Var.U[c10].getText().toString());
                    hashMap3.put("gender", vm0Var.w);
                    hashMap3.put("country_code", vm0Var.s);
                    hashMap3.put("residence_country_code", vm0Var.v);
                    jSONObject = new JSONObject();
                    try {
                        ArrayList arrayList = new ArrayList(hashMap3.keySet());
                        Collections.sort(arrayList, new Comparator(this) { // from class: org.telegram.ui.cm0
                            public final /* synthetic */ dm0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.util.Comparator
                            public final int compare(Object obj, Object obj2) {
                                String str = (String) obj;
                                String str2 = (String) obj2;
                                switch (i10) {
                                    case 0:
                                        vm0 vm0Var2 = this.b.a;
                                        int C0 = vm0.C0(vm0Var2, str);
                                        int C02 = vm0.C0(vm0Var2, str2);
                                        if (C0 >= C02) {
                                            if (C0 > C02) {
                                            }
                                        }
                                        break;
                                    default:
                                        vm0 vm0Var3 = this.b.a;
                                        int C03 = vm0.C0(vm0Var3, str);
                                        int C04 = vm0.C0(vm0Var3, str2);
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
            if (vm0Var.B != null) {
                HashMap hashMap4 = new HashMap(vm0Var.p1);
                hashMap4.put("document_no", vm0Var.U[7].getText().toString());
                if (iArr[0] != 0) {
                    Locale locale = Locale.US;
                    Integer valueOf = Integer.valueOf(iArr[c6]);
                    Integer valueOf2 = Integer.valueOf(iArr[c3]);
                    Integer valueOf3 = Integer.valueOf(iArr[0]);
                    Object[] objArr2 = new Object[3];
                    objArr2[0] = valueOf;
                    objArr2[c3] = valueOf2;
                    objArr2[c6] = valueOf3;
                    hashMap4.put("expiry_date", String.format(locale, "%02d.%02d.%d", objArr2));
                } else {
                    hashMap4.put("expiry_date", "");
                }
                jSONObject2 = new JSONObject();
                try {
                    ArrayList arrayList2 = new ArrayList(hashMap4.keySet());
                    final int i15 = 1;
                    Collections.sort(arrayList2, new Comparator(this) { // from class: org.telegram.ui.cm0
                        public final /* synthetic */ dm0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            String str2 = (String) obj;
                            String str22 = (String) obj2;
                            switch (i15) {
                                case 0:
                                    vm0 vm0Var2 = this.b.a;
                                    int C0 = vm0.C0(vm0Var2, str2);
                                    int C02 = vm0.C0(vm0Var2, str22);
                                    if (C0 >= C02) {
                                        if (C0 > C02) {
                                        }
                                    }
                                    break;
                                default:
                                    vm0 vm0Var3 = this.b.a;
                                    int C03 = vm0.C0(vm0Var3, str2);
                                    int C04 = vm0.C0(vm0Var3, str22);
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
                hashMap = vm0Var.s1;
                if (hashMap != null) {
                    hashMap.clear();
                }
                hashMap2 = vm0Var.t1;
                if (hashMap2 != null) {
                    hashMap2.clear();
                }
                lm0 lm0Var = vm0Var.x1;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = vm0Var.A;
                String jSONObject3 = jSONObject == null ? jSONObject.toString() : null;
                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = vm0Var.B;
                String jSONObject4 = jSONObject2 == null ? jSONObject2.toString() : null;
                SecureDocument secureDocument2 = vm0Var.f1;
                ArrayList arrayList3 = vm0Var.g1;
                SecureDocument secureDocument3 = vm0Var.h1;
                linearLayout = vm0Var.b0;
                if (linearLayout != null && linearLayout.getVisibility() == 0) {
                    secureDocument = vm0Var.i1;
                }
                ((yl0) lm0Var).c(tL_secureRequiredType, null, jSONObject3, tL_secureRequiredType2, jSONObject4, null, secureDocument2, arrayList3, secureDocument3, secureDocument, vk0Var, iVar);
                return true;
            }
            jSONObject2 = null;
            hashMap = vm0Var.s1;
            if (hashMap != null) {
            }
            hashMap2 = vm0Var.t1;
            if (hashMap2 != null) {
            }
            lm0 lm0Var2 = vm0Var.x1;
            TLRPC.TL_secureRequiredType tL_secureRequiredType3 = vm0Var.A;
            if (jSONObject == null) {
            }
            TLRPC.TL_secureRequiredType tL_secureRequiredType22 = vm0Var.B;
            if (jSONObject2 == null) {
            }
            SecureDocument secureDocument22 = vm0Var.f1;
            ArrayList arrayList32 = vm0Var.g1;
            SecureDocument secureDocument32 = vm0Var.h1;
            linearLayout = vm0Var.b0;
            if (linearLayout != null) {
                secureDocument = vm0Var.i1;
            }
            ((yl0) lm0Var2).c(tL_secureRequiredType3, null, jSONObject3, tL_secureRequiredType22, jSONObject4, null, secureDocument22, arrayList32, secureDocument32, secureDocument, vk0Var, iVar);
            return true;
        }
        return false;
    }
}
