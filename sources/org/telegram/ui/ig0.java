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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ig0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ og0 b;

    public /* synthetic */ ig0(og0 og0Var, int i10) {
        this.a = i10;
        this.b = og0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final og0 og0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.jg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11;
                        ut utVar;
                        switch (i10) {
                            case 0:
                                og0 og0Var2 = og0Var;
                                sj0 sj0Var = og0Var2.a;
                                HashMap hashMap = og0Var2.D;
                                ArrayList arrayList = og0Var2.B;
                                HashMap hashMap2 = og0Var2.C;
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
                                    pg0 pg0Var = og0Var2.S;
                                    if (pg0Var.C == 2) {
                                        i11 = ((org.telegram.ui.ActionBar.p2) pg0Var).currentAccount;
                                        String d = se.b.d(UserConfig.getInstance(i11).getClientPhone(), false);
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
                                                                utVar = (ut) ai.j(1, list2);
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
                                                                utVar = (ut) ai.j(1, list2);
                                                            }
                                                            utVar3 = utVar;
                                                        } else {
                                                            utVar3 = (ut) list2.get(0);
                                                        }
                                                    }
                                                    if (utVar3 != null) {
                                                        sj0Var.setText(substring);
                                                        break;
                                                    }
                                                }
                                                sj0Var.setText(d.substring(0, 1));
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                og0 og0Var3 = og0Var;
                                og0Var3.H = false;
                                pg0 pg0Var2 = og0Var3.S;
                                pg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (TwoStepVerificationActivity.i0(password, true)) {
                                        Bundle bundle = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                        pg0Var2.u1(6, true, bundle, false);
                                        break;
                                    } else {
                                        org.telegram.ui.Components.z4.x0(pg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        break;
                                    }
                                } else {
                                    pg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final og0 og0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.jg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112;
                        ut utVar;
                        switch (i11) {
                            case 0:
                                og0 og0Var22 = og0Var2;
                                sj0 sj0Var = og0Var22.a;
                                HashMap hashMap = og0Var22.D;
                                ArrayList arrayList = og0Var22.B;
                                HashMap hashMap2 = og0Var22.C;
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
                                    pg0 pg0Var = og0Var22.S;
                                    if (pg0Var.C == 2) {
                                        i112 = ((org.telegram.ui.ActionBar.p2) pg0Var).currentAccount;
                                        String d = se.b.d(UserConfig.getInstance(i112).getClientPhone(), false);
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
                                                                utVar = (ut) ai.j(1, list2);
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
                                                                utVar = (ut) ai.j(1, list2);
                                                            }
                                                            utVar3 = utVar;
                                                        } else {
                                                            utVar3 = (ut) list2.get(0);
                                                        }
                                                    }
                                                    if (utVar3 != null) {
                                                        sj0Var.setText(substring);
                                                        break;
                                                    }
                                                }
                                                sj0Var.setText(d.substring(0, 1));
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                og0 og0Var3 = og0Var2;
                                og0Var3.H = false;
                                pg0 pg0Var2 = og0Var3.S;
                                pg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (TwoStepVerificationActivity.i0(password, true)) {
                                        Bundle bundle = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                        pg0Var2.u1(6, true, bundle, false);
                                        break;
                                    } else {
                                        org.telegram.ui.Components.z4.x0(pg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        break;
                                    }
                                } else {
                                    pg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
