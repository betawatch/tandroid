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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hg0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ng0 b;

    public /* synthetic */ hg0(ng0 ng0Var, int i10) {
        this.a = i10;
        this.b = ng0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final ng0 ng0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ig0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11;
                        tt ttVar;
                        switch (i10) {
                            case 0:
                                ng0 ng0Var2 = ng0Var;
                                rj0 rj0Var = ng0Var2.a;
                                HashMap hashMap = ng0Var2.D;
                                ArrayList arrayList = ng0Var2.B;
                                HashMap hashMap2 = ng0Var2.C;
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
                                                tt ttVar2 = new tt();
                                                String str = tL_help_country.name;
                                                ttVar2.a = str;
                                                String str2 = tL_help_country.default_name;
                                                ttVar2.b = str2;
                                                if (str == null && str2 != null) {
                                                    ttVar2.a = str2;
                                                }
                                                ttVar2.c = tL_help_countryCode.country_code;
                                                ttVar2.d = tL_help_country.iso2;
                                                arrayList.add(ttVar2);
                                                List list = (List) hashMap2.get(tL_help_countryCode.country_code);
                                                if (list == null) {
                                                    String str3 = tL_help_countryCode.country_code;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    hashMap2.put(str3, arrayList2);
                                                    list = arrayList2;
                                                }
                                                list.add(ttVar2);
                                                if (tL_help_countryCode.patterns.size() > 0) {
                                                    hashMap.put(tL_help_countryCode.country_code, tL_help_countryCode.patterns);
                                                }
                                            }
                                        }
                                    }
                                    og0 og0Var = ng0Var2.S;
                                    if (og0Var.C == 2) {
                                        i11 = ((org.telegram.ui.ActionBar.p2) og0Var).currentAccount;
                                        String d = se.b.d(UserConfig.getInstance(i11).getClientPhone(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i14 = 4; i14 >= 1; i14--) {
                                                    String substring = d.substring(0, i14);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    tt ttVar3 = null;
                                                    if (list2 != null) {
                                                        if (list2.size() > 1) {
                                                            String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                                            if (string != null) {
                                                                ttVar = (tt) yh.j(1, list2);
                                                                int size = arrayList.size();
                                                                int i15 = 0;
                                                                while (true) {
                                                                    if (i15 < size) {
                                                                        Object obj = arrayList.get(i15);
                                                                        i15++;
                                                                        tt ttVar4 = (tt) obj;
                                                                        if (Objects.equals(ttVar4.d, string)) {
                                                                            ttVar = ttVar4;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                ttVar = (tt) yh.j(1, list2);
                                                            }
                                                            ttVar3 = ttVar;
                                                        } else {
                                                            ttVar3 = (tt) list2.get(0);
                                                        }
                                                    }
                                                    if (ttVar3 != null) {
                                                        rj0Var.setText(substring);
                                                        break;
                                                    }
                                                }
                                                rj0Var.setText(d.substring(0, 1));
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                ng0 ng0Var3 = ng0Var;
                                ng0Var3.H = false;
                                og0 og0Var2 = ng0Var3.S;
                                og0Var2.v1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (TwoStepVerificationActivity.i0(password, true)) {
                                        Bundle bundle = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                        og0Var2.u1(6, true, bundle, false);
                                        break;
                                    } else {
                                        org.telegram.ui.Components.z4.x0(og0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        break;
                                    }
                                } else {
                                    og0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final ng0 ng0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ig0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112;
                        tt ttVar;
                        switch (i11) {
                            case 0:
                                ng0 ng0Var22 = ng0Var2;
                                rj0 rj0Var = ng0Var22.a;
                                HashMap hashMap = ng0Var22.D;
                                ArrayList arrayList = ng0Var22.B;
                                HashMap hashMap2 = ng0Var22.C;
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
                                                tt ttVar2 = new tt();
                                                String str = tL_help_country.name;
                                                ttVar2.a = str;
                                                String str2 = tL_help_country.default_name;
                                                ttVar2.b = str2;
                                                if (str == null && str2 != null) {
                                                    ttVar2.a = str2;
                                                }
                                                ttVar2.c = tL_help_countryCode.country_code;
                                                ttVar2.d = tL_help_country.iso2;
                                                arrayList.add(ttVar2);
                                                List list = (List) hashMap2.get(tL_help_countryCode.country_code);
                                                if (list == null) {
                                                    String str3 = tL_help_countryCode.country_code;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    hashMap2.put(str3, arrayList2);
                                                    list = arrayList2;
                                                }
                                                list.add(ttVar2);
                                                if (tL_help_countryCode.patterns.size() > 0) {
                                                    hashMap.put(tL_help_countryCode.country_code, tL_help_countryCode.patterns);
                                                }
                                            }
                                        }
                                    }
                                    og0 og0Var = ng0Var22.S;
                                    if (og0Var.C == 2) {
                                        i112 = ((org.telegram.ui.ActionBar.p2) og0Var).currentAccount;
                                        String d = se.b.d(UserConfig.getInstance(i112).getClientPhone(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i14 = 4; i14 >= 1; i14--) {
                                                    String substring = d.substring(0, i14);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    tt ttVar3 = null;
                                                    if (list2 != null) {
                                                        if (list2.size() > 1) {
                                                            String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                                            if (string != null) {
                                                                ttVar = (tt) yh.j(1, list2);
                                                                int size = arrayList.size();
                                                                int i15 = 0;
                                                                while (true) {
                                                                    if (i15 < size) {
                                                                        Object obj = arrayList.get(i15);
                                                                        i15++;
                                                                        tt ttVar4 = (tt) obj;
                                                                        if (Objects.equals(ttVar4.d, string)) {
                                                                            ttVar = ttVar4;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                ttVar = (tt) yh.j(1, list2);
                                                            }
                                                            ttVar3 = ttVar;
                                                        } else {
                                                            ttVar3 = (tt) list2.get(0);
                                                        }
                                                    }
                                                    if (ttVar3 != null) {
                                                        rj0Var.setText(substring);
                                                        break;
                                                    }
                                                }
                                                rj0Var.setText(d.substring(0, 1));
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                ng0 ng0Var3 = ng0Var2;
                                ng0Var3.H = false;
                                og0 og0Var2 = ng0Var3.S;
                                og0Var2.v1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (TwoStepVerificationActivity.i0(password, true)) {
                                        Bundle bundle = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                        og0Var2.u1(6, true, bundle, false);
                                        break;
                                    } else {
                                        org.telegram.ui.Components.z4.x0(og0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        break;
                                    }
                                } else {
                                    og0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
