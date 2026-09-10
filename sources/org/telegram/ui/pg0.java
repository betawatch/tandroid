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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class pg0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ wg0 b;

    public /* synthetic */ pg0(wg0 wg0Var, int i10) {
        this.a = i10;
        this.b = wg0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final wg0 wg0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.qg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11;
                        wt wtVar;
                        switch (i10) {
                            case 0:
                                wg0 wg0Var2 = wg0Var;
                                ck0 ck0Var = wg0Var2.a;
                                HashMap hashMap = wg0Var2.G;
                                ArrayList arrayList = wg0Var2.E;
                                HashMap hashMap2 = wg0Var2.F;
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
                                                wt wtVar2 = new wt();
                                                String str = tL_help_country.name;
                                                wtVar2.a = str;
                                                String str2 = tL_help_country.default_name;
                                                wtVar2.b = str2;
                                                if (str == null && str2 != null) {
                                                    wtVar2.a = str2;
                                                }
                                                wtVar2.c = tL_help_countryCode.country_code;
                                                wtVar2.d = tL_help_country.iso2;
                                                arrayList.add(wtVar2);
                                                List list = (List) hashMap2.get(tL_help_countryCode.country_code);
                                                if (list == null) {
                                                    String str3 = tL_help_countryCode.country_code;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    hashMap2.put(str3, arrayList2);
                                                    list = arrayList2;
                                                }
                                                list.add(wtVar2);
                                                if (tL_help_countryCode.patterns.size() > 0) {
                                                    hashMap.put(tL_help_countryCode.country_code, tL_help_countryCode.patterns);
                                                }
                                            }
                                        }
                                    }
                                    xg0 xg0Var = wg0Var2.V;
                                    if (xg0Var.F == 2) {
                                        i11 = ((org.telegram.ui.ActionBar.p2) xg0Var).currentAccount;
                                        String d = gf.b.d(UserConfig.getInstance(i11).getClientPhone(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i14 = 4; i14 >= 1; i14--) {
                                                    String substring = d.substring(0, i14);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    wt wtVar3 = null;
                                                    if (list2 != null) {
                                                        if (list2.size() > 1) {
                                                            String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                                            if (string != null) {
                                                                wtVar = (wt) org.telegram.ui.Cells.r6.g(1, list2);
                                                                int size = arrayList.size();
                                                                int i15 = 0;
                                                                while (true) {
                                                                    if (i15 < size) {
                                                                        Object obj = arrayList.get(i15);
                                                                        i15++;
                                                                        wt wtVar4 = (wt) obj;
                                                                        if (Objects.equals(wtVar4.d, string)) {
                                                                            wtVar = wtVar4;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                wtVar = (wt) org.telegram.ui.Cells.r6.g(1, list2);
                                                            }
                                                            wtVar3 = wtVar;
                                                        } else {
                                                            wtVar3 = (wt) list2.get(0);
                                                        }
                                                    }
                                                    if (wtVar3 != null) {
                                                        ck0Var.setText(substring);
                                                        break;
                                                    }
                                                }
                                                ck0Var.setText(d.substring(0, 1));
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                wg0 wg0Var3 = wg0Var;
                                wg0Var3.K = false;
                                xg0 xg0Var2 = wg0Var3.V;
                                xg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (TwoStepVerificationActivity.i0(password, true)) {
                                        Bundle bundle = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                        xg0Var2.u1(6, true, bundle, false);
                                        break;
                                    } else {
                                        org.telegram.ui.Components.d5.x0(xg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        break;
                                    }
                                } else {
                                    xg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final wg0 wg0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.qg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112;
                        wt wtVar;
                        switch (i11) {
                            case 0:
                                wg0 wg0Var22 = wg0Var2;
                                ck0 ck0Var = wg0Var22.a;
                                HashMap hashMap = wg0Var22.G;
                                ArrayList arrayList = wg0Var22.E;
                                HashMap hashMap2 = wg0Var22.F;
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
                                                wt wtVar2 = new wt();
                                                String str = tL_help_country.name;
                                                wtVar2.a = str;
                                                String str2 = tL_help_country.default_name;
                                                wtVar2.b = str2;
                                                if (str == null && str2 != null) {
                                                    wtVar2.a = str2;
                                                }
                                                wtVar2.c = tL_help_countryCode.country_code;
                                                wtVar2.d = tL_help_country.iso2;
                                                arrayList.add(wtVar2);
                                                List list = (List) hashMap2.get(tL_help_countryCode.country_code);
                                                if (list == null) {
                                                    String str3 = tL_help_countryCode.country_code;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    hashMap2.put(str3, arrayList2);
                                                    list = arrayList2;
                                                }
                                                list.add(wtVar2);
                                                if (tL_help_countryCode.patterns.size() > 0) {
                                                    hashMap.put(tL_help_countryCode.country_code, tL_help_countryCode.patterns);
                                                }
                                            }
                                        }
                                    }
                                    xg0 xg0Var = wg0Var22.V;
                                    if (xg0Var.F == 2) {
                                        i112 = ((org.telegram.ui.ActionBar.p2) xg0Var).currentAccount;
                                        String d = gf.b.d(UserConfig.getInstance(i112).getClientPhone(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i14 = 4; i14 >= 1; i14--) {
                                                    String substring = d.substring(0, i14);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    wt wtVar3 = null;
                                                    if (list2 != null) {
                                                        if (list2.size() > 1) {
                                                            String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                                            if (string != null) {
                                                                wtVar = (wt) org.telegram.ui.Cells.r6.g(1, list2);
                                                                int size = arrayList.size();
                                                                int i15 = 0;
                                                                while (true) {
                                                                    if (i15 < size) {
                                                                        Object obj = arrayList.get(i15);
                                                                        i15++;
                                                                        wt wtVar4 = (wt) obj;
                                                                        if (Objects.equals(wtVar4.d, string)) {
                                                                            wtVar = wtVar4;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                wtVar = (wt) org.telegram.ui.Cells.r6.g(1, list2);
                                                            }
                                                            wtVar3 = wtVar;
                                                        } else {
                                                            wtVar3 = (wt) list2.get(0);
                                                        }
                                                    }
                                                    if (wtVar3 != null) {
                                                        ck0Var.setText(substring);
                                                        break;
                                                    }
                                                }
                                                ck0Var.setText(d.substring(0, 1));
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                wg0 wg0Var3 = wg0Var2;
                                wg0Var3.K = false;
                                xg0 xg0Var2 = wg0Var3.V;
                                xg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (TwoStepVerificationActivity.i0(password, true)) {
                                        Bundle bundle = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                        xg0Var2.u1(6, true, bundle, false);
                                        break;
                                    } else {
                                        org.telegram.ui.Components.d5.x0(xg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        break;
                                    }
                                } else {
                                    xg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
