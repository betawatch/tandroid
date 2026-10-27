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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ag0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ hg0 b;

    public /* synthetic */ ag0(hg0 hg0Var, int i10) {
        this.a = i10;
        this.b = hg0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final hg0 hg0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.bg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11;
                        lt ltVar;
                        switch (i10) {
                            case 0:
                                hg0 hg0Var2 = hg0Var;
                                oj0 oj0Var = hg0Var2.a;
                                HashMap hashMap = hg0Var2.I;
                                ArrayList arrayList = hg0Var2.G;
                                HashMap hashMap2 = hg0Var2.H;
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
                                                lt ltVar2 = new lt();
                                                String str = tL_help_country.name;
                                                ltVar2.a = str;
                                                String str2 = tL_help_country.default_name;
                                                ltVar2.b = str2;
                                                if (str == null && str2 != null) {
                                                    ltVar2.a = str2;
                                                }
                                                ltVar2.c = tL_help_countryCode.country_code;
                                                ltVar2.d = tL_help_country.iso2;
                                                arrayList.add(ltVar2);
                                                List list = (List) hashMap2.get(tL_help_countryCode.country_code);
                                                if (list == null) {
                                                    String str3 = tL_help_countryCode.country_code;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    hashMap2.put(str3, arrayList2);
                                                    list = arrayList2;
                                                }
                                                list.add(ltVar2);
                                                if (tL_help_countryCode.patterns.size() > 0) {
                                                    hashMap.put(tL_help_countryCode.country_code, tL_help_countryCode.patterns);
                                                }
                                            }
                                        }
                                    }
                                    ig0 ig0Var = hg0Var2.a0;
                                    if (ig0Var.F == 2) {
                                        i11 = ((org.telegram.ui.ActionBar.r2) ig0Var).currentAccount;
                                        String d = kf.b.d(UserConfig.getInstance(i11).getClientPhone(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i14 = 4; i14 >= 1; i14--) {
                                                    String substring = d.substring(0, i14);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    lt ltVar3 = null;
                                                    if (list2 != null) {
                                                        if (list2.size() > 1) {
                                                            String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                                            if (string != null) {
                                                                ltVar = (lt) org.telegram.ui.Components.b10.h(1, list2);
                                                                int size = arrayList.size();
                                                                int i15 = 0;
                                                                while (true) {
                                                                    if (i15 < size) {
                                                                        Object obj = arrayList.get(i15);
                                                                        i15++;
                                                                        lt ltVar4 = (lt) obj;
                                                                        if (Objects.equals(ltVar4.d, string)) {
                                                                            ltVar = ltVar4;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                ltVar = (lt) org.telegram.ui.Components.b10.h(1, list2);
                                                            }
                                                            ltVar3 = ltVar;
                                                        } else {
                                                            ltVar3 = (lt) list2.get(0);
                                                        }
                                                    }
                                                    if (ltVar3 != null) {
                                                        oj0Var.setText(substring);
                                                        break;
                                                    }
                                                }
                                                oj0Var.setText(d.substring(0, 1));
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                hg0 hg0Var3 = hg0Var;
                                hg0Var3.M = false;
                                ig0 ig0Var2 = hg0Var3.a0;
                                ig0Var2.A1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (TwoStepVerificationActivity.j0(password, true)) {
                                        Bundle bundle = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                        ig0Var2.z1(6, true, bundle, false);
                                        break;
                                    } else {
                                        org.telegram.ui.Components.g5.w0(ig0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        break;
                                    }
                                } else {
                                    ig0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final hg0 hg0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.bg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112;
                        lt ltVar;
                        switch (i11) {
                            case 0:
                                hg0 hg0Var22 = hg0Var2;
                                oj0 oj0Var = hg0Var22.a;
                                HashMap hashMap = hg0Var22.I;
                                ArrayList arrayList = hg0Var22.G;
                                HashMap hashMap2 = hg0Var22.H;
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
                                                lt ltVar2 = new lt();
                                                String str = tL_help_country.name;
                                                ltVar2.a = str;
                                                String str2 = tL_help_country.default_name;
                                                ltVar2.b = str2;
                                                if (str == null && str2 != null) {
                                                    ltVar2.a = str2;
                                                }
                                                ltVar2.c = tL_help_countryCode.country_code;
                                                ltVar2.d = tL_help_country.iso2;
                                                arrayList.add(ltVar2);
                                                List list = (List) hashMap2.get(tL_help_countryCode.country_code);
                                                if (list == null) {
                                                    String str3 = tL_help_countryCode.country_code;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    hashMap2.put(str3, arrayList2);
                                                    list = arrayList2;
                                                }
                                                list.add(ltVar2);
                                                if (tL_help_countryCode.patterns.size() > 0) {
                                                    hashMap.put(tL_help_countryCode.country_code, tL_help_countryCode.patterns);
                                                }
                                            }
                                        }
                                    }
                                    ig0 ig0Var = hg0Var22.a0;
                                    if (ig0Var.F == 2) {
                                        i112 = ((org.telegram.ui.ActionBar.r2) ig0Var).currentAccount;
                                        String d = kf.b.d(UserConfig.getInstance(i112).getClientPhone(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i14 = 4; i14 >= 1; i14--) {
                                                    String substring = d.substring(0, i14);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    lt ltVar3 = null;
                                                    if (list2 != null) {
                                                        if (list2.size() > 1) {
                                                            String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                                            if (string != null) {
                                                                ltVar = (lt) org.telegram.ui.Components.b10.h(1, list2);
                                                                int size = arrayList.size();
                                                                int i15 = 0;
                                                                while (true) {
                                                                    if (i15 < size) {
                                                                        Object obj = arrayList.get(i15);
                                                                        i15++;
                                                                        lt ltVar4 = (lt) obj;
                                                                        if (Objects.equals(ltVar4.d, string)) {
                                                                            ltVar = ltVar4;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                ltVar = (lt) org.telegram.ui.Components.b10.h(1, list2);
                                                            }
                                                            ltVar3 = ltVar;
                                                        } else {
                                                            ltVar3 = (lt) list2.get(0);
                                                        }
                                                    }
                                                    if (ltVar3 != null) {
                                                        oj0Var.setText(substring);
                                                        break;
                                                    }
                                                }
                                                oj0Var.setText(d.substring(0, 1));
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                hg0 hg0Var3 = hg0Var2;
                                hg0Var3.M = false;
                                ig0 ig0Var2 = hg0Var3.a0;
                                ig0Var2.A1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (TwoStepVerificationActivity.j0(password, true)) {
                                        Bundle bundle = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                        ig0Var2.z1(6, true, bundle, false);
                                        break;
                                    } else {
                                        org.telegram.ui.Components.g5.w0(ig0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        break;
                                    }
                                } else {
                                    ig0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
