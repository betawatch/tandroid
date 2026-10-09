package org.telegram.ui;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pg0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ vg0 b;

    public /* synthetic */ pg0(vg0 vg0Var, int i10) {
        this.a = i10;
        this.b = vg0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final vg0 vg0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.qg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11;
                        ut utVar;
                        switch (i10) {
                            case 0:
                                vg0 vg0Var2 = vg0Var;
                                bk0 bk0Var = vg0Var2.a;
                                HashMap hashMap = vg0Var2.G;
                                ArrayList arrayList = vg0Var2.E;
                                HashMap hashMap2 = vg0Var2.F;
                                if (tL_error == null) {
                                    arrayList.clear();
                                    hashMap2.clear();
                                    hashMap.clear();
                                    TLRPC.TL_help_countriesList tL_help_countriesList = (TLRPC.TL_help_countriesList) tLObject;
                                    for (int i12 = 0; i12 < tL_help_countriesList.countries.size(); i12++) {
                                        TLRPC.TL_help_country tL_help_country = tL_help_countriesList.countries.get(i12);
                                        for (int i13 = 0; i13 < tL_help_country.country_codes.size(); i13++) {
                                            TLRPC.TL_help_countryCode tL_help_countryCode = tL_help_country.country_codes.get(i13);
                                            if (tL_help_countryCode != null) {
                                                ut utVar2 = new ut();
                                                String str = tL_help_country.name;
                                                utVar2.a = str;
                                                String str2 = tL_help_country.default_name;
                                                utVar2.b = str2;
                                                if (str == null && str2 != null) {
                                                    utVar2.a = str2;
                                                }
                                                utVar2.c = tL_help_countryCode.country_code;
                                                utVar2.d = tL_help_country.iso2;
                                                arrayList.add(utVar2);
                                                List list = (List) hashMap2.get(tL_help_countryCode.country_code);
                                                if (list == null) {
                                                    String str3 = tL_help_countryCode.country_code;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    hashMap2.put(str3, arrayList2);
                                                    list = arrayList2;
                                                }
                                                list.add(utVar2);
                                                if (tL_help_countryCode.patterns.size() > 0) {
                                                    hashMap.put(tL_help_countryCode.country_code, tL_help_countryCode.patterns);
                                                }
                                            }
                                        }
                                    }
                                    wg0 wg0Var = vg0Var2.V;
                                    if (wg0Var.F == 2) {
                                        i11 = ((org.telegram.ui.ActionBar.n2) wg0Var).currentAccount;
                                        String d = hf.b.d(UserConfig.getInstance(i11).getClientPhone(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i14 = 4; i14 >= 1; i14--) {
                                                    String substring = d.substring(0, i14);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    ut utVar3 = null;
                                                    if (list2 != null) {
                                                        if (list2.size() > 1) {
                                                            String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                                            if (string != null) {
                                                                utVar = (ut) sc.v.h(1, list2);
                                                                int size = arrayList.size();
                                                                int i15 = 0;
                                                                while (true) {
                                                                    if (i15 < size) {
                                                                        Object obj = arrayList.get(i15);
                                                                        i15++;
                                                                        ut utVar4 = (ut) obj;
                                                                        if (Objects.equals(utVar4.d, string)) {
                                                                            utVar = utVar4;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                utVar = (ut) sc.v.h(1, list2);
                                                            }
                                                            utVar3 = utVar;
                                                        } else {
                                                            utVar3 = (ut) list2.get(0);
                                                        }
                                                    }
                                                    if (utVar3 != null) {
                                                        bk0Var.setText(substring);
                                                        break;
                                                    }
                                                }
                                                bk0Var.setText(d.substring(0, 1));
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                vg0 vg0Var3 = vg0Var;
                                vg0Var3.K = false;
                                wg0 wg0Var2 = vg0Var3.V;
                                wg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (TwoStepVerificationActivity.i0(password, true)) {
                                        Bundle bundle = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                        wg0Var2.u1(6, true, bundle, false);
                                        break;
                                    } else {
                                        org.telegram.ui.Components.g5.w0(wg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        break;
                                    }
                                } else {
                                    wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final vg0 vg0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.qg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112;
                        ut utVar;
                        switch (i11) {
                            case 0:
                                vg0 vg0Var22 = vg0Var2;
                                bk0 bk0Var = vg0Var22.a;
                                HashMap hashMap = vg0Var22.G;
                                ArrayList arrayList = vg0Var22.E;
                                HashMap hashMap2 = vg0Var22.F;
                                if (tL_error == null) {
                                    arrayList.clear();
                                    hashMap2.clear();
                                    hashMap.clear();
                                    TLRPC.TL_help_countriesList tL_help_countriesList = (TLRPC.TL_help_countriesList) tLObject;
                                    for (int i12 = 0; i12 < tL_help_countriesList.countries.size(); i12++) {
                                        TLRPC.TL_help_country tL_help_country = tL_help_countriesList.countries.get(i12);
                                        for (int i13 = 0; i13 < tL_help_country.country_codes.size(); i13++) {
                                            TLRPC.TL_help_countryCode tL_help_countryCode = tL_help_country.country_codes.get(i13);
                                            if (tL_help_countryCode != null) {
                                                ut utVar2 = new ut();
                                                String str = tL_help_country.name;
                                                utVar2.a = str;
                                                String str2 = tL_help_country.default_name;
                                                utVar2.b = str2;
                                                if (str == null && str2 != null) {
                                                    utVar2.a = str2;
                                                }
                                                utVar2.c = tL_help_countryCode.country_code;
                                                utVar2.d = tL_help_country.iso2;
                                                arrayList.add(utVar2);
                                                List list = (List) hashMap2.get(tL_help_countryCode.country_code);
                                                if (list == null) {
                                                    String str3 = tL_help_countryCode.country_code;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    hashMap2.put(str3, arrayList2);
                                                    list = arrayList2;
                                                }
                                                list.add(utVar2);
                                                if (tL_help_countryCode.patterns.size() > 0) {
                                                    hashMap.put(tL_help_countryCode.country_code, tL_help_countryCode.patterns);
                                                }
                                            }
                                        }
                                    }
                                    wg0 wg0Var = vg0Var22.V;
                                    if (wg0Var.F == 2) {
                                        i112 = ((org.telegram.ui.ActionBar.n2) wg0Var).currentAccount;
                                        String d = hf.b.d(UserConfig.getInstance(i112).getClientPhone(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i14 = 4; i14 >= 1; i14--) {
                                                    String substring = d.substring(0, i14);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    ut utVar3 = null;
                                                    if (list2 != null) {
                                                        if (list2.size() > 1) {
                                                            String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                                            if (string != null) {
                                                                utVar = (ut) sc.v.h(1, list2);
                                                                int size = arrayList.size();
                                                                int i15 = 0;
                                                                while (true) {
                                                                    if (i15 < size) {
                                                                        Object obj = arrayList.get(i15);
                                                                        i15++;
                                                                        ut utVar4 = (ut) obj;
                                                                        if (Objects.equals(utVar4.d, string)) {
                                                                            utVar = utVar4;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                utVar = (ut) sc.v.h(1, list2);
                                                            }
                                                            utVar3 = utVar;
                                                        } else {
                                                            utVar3 = (ut) list2.get(0);
                                                        }
                                                    }
                                                    if (utVar3 != null) {
                                                        bk0Var.setText(substring);
                                                        break;
                                                    }
                                                }
                                                bk0Var.setText(d.substring(0, 1));
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                vg0 vg0Var3 = vg0Var2;
                                vg0Var3.K = false;
                                wg0 wg0Var2 = vg0Var3.V;
                                wg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (TwoStepVerificationActivity.i0(password, true)) {
                                        Bundle bundle = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                        wg0Var2.u1(6, true, bundle, false);
                                        break;
                                    } else {
                                        org.telegram.ui.Components.g5.w0(wg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        break;
                                    }
                                } else {
                                    wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
