package org.telegram.ui;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class bf0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ gf0 b;

    public /* synthetic */ bf0(gf0 gf0Var, int i10) {
        this.a = i10;
        this.b = gf0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final gf0 gf0Var = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.cf0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11;
                        nt ntVar;
                        int i12 = i10;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        gf0 gf0Var2 = gf0Var;
                        switch (i12) {
                            case 0:
                                ef0 ef0Var = gf0Var2.a;
                                HashMap hashMap = gf0Var2.I;
                                ArrayList arrayList = gf0Var2.G;
                                HashMap hashMap2 = gf0Var2.H;
                                if (tL_error2 == null) {
                                    arrayList.clear();
                                    hashMap2.clear();
                                    hashMap.clear();
                                    TLRPC.TL_help_countriesList tL_help_countriesList = (TLRPC.TL_help_countriesList) tLObject2;
                                    for (int i13 = 0; i13 < tL_help_countriesList.countries.size(); i13++) {
                                        TLRPC.TL_help_country tL_help_country = tL_help_countriesList.countries.get(i13);
                                        for (int i14 = 0; i14 < tL_help_country.country_codes.size(); i14++) {
                                            TLRPC.TL_help_countryCode tL_help_countryCode = tL_help_country.country_codes.get(i14);
                                            if (tL_help_countryCode != null) {
                                                nt ntVar2 = new nt();
                                                String str = tL_help_country.name;
                                                ntVar2.a = str;
                                                String str2 = tL_help_country.default_name;
                                                ntVar2.b = str2;
                                                if (str == null && str2 != null) {
                                                    ntVar2.a = str2;
                                                }
                                                ntVar2.c = tL_help_countryCode.country_code;
                                                ntVar2.d = tL_help_country.iso2;
                                                arrayList.add(ntVar2);
                                                List list = (List) hashMap2.get(tL_help_countryCode.country_code);
                                                if (list == null) {
                                                    String str3 = tL_help_countryCode.country_code;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    hashMap2.put(str3, arrayList2);
                                                    list = arrayList2;
                                                }
                                                list.add(ntVar2);
                                                if (tL_help_countryCode.patterns.size() > 0) {
                                                    hashMap.put(tL_help_countryCode.country_code, tL_help_countryCode.patterns);
                                                }
                                            }
                                        }
                                    }
                                    hf0 hf0Var = gf0Var2.a0;
                                    if (hf0Var.F == 2) {
                                        i11 = ((org.telegram.ui.ActionBar.k2) hf0Var).currentAccount;
                                        String d = af.b.d(org.telegram.messenger.d20.i(i11).d(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i15 = 4; i15 >= 1; i15--) {
                                                    String substring = d.substring(0, i15);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    if (list2 == null) {
                                                        ntVar = null;
                                                    } else if (list2.size() > 1) {
                                                        String string = org.telegram.messenger.vp.d1().getString("phone_code_last_matched_" + substring, null);
                                                        if (string != null) {
                                                            ntVar = (nt) sc.e.g(1, list2);
                                                            int size = arrayList.size();
                                                            int i16 = 0;
                                                            while (true) {
                                                                if (i16 < size) {
                                                                    Object obj = arrayList.get(i16);
                                                                    i16++;
                                                                    nt ntVar3 = (nt) obj;
                                                                    if (Objects.equals(ntVar3.d, string)) {
                                                                        ntVar = ntVar3;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            ntVar = (nt) sc.e.g(1, list2);
                                                        }
                                                    } else {
                                                        ntVar = (nt) list2.get(0);
                                                    }
                                                    if (ntVar != null) {
                                                        ef0Var.setText(substring);
                                                        break;
                                                    }
                                                }
                                                ef0Var.setText(d.substring(0, 1));
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                gf0Var2.M = false;
                                hf0 hf0Var2 = gf0Var2.a0;
                                hf0Var2.D1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (TwoStepVerificationActivity.m0(password, true)) {
                                        Bundle bundle = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle.putString("password", Utilities.f(serializedData.toByteArray()));
                                        hf0Var2.C1(6, true, bundle, false);
                                        break;
                                    } else {
                                        org.telegram.ui.Components.s4.w0(hf0Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131743846, "UpdateAppAlert"), true);
                                        break;
                                    }
                                } else {
                                    hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), tL_error2.text);
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final gf0 gf0Var2 = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.cf0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112;
                        nt ntVar;
                        int i12 = i11;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        gf0 gf0Var22 = gf0Var2;
                        switch (i12) {
                            case 0:
                                ef0 ef0Var = gf0Var22.a;
                                HashMap hashMap = gf0Var22.I;
                                ArrayList arrayList = gf0Var22.G;
                                HashMap hashMap2 = gf0Var22.H;
                                if (tL_error2 == null) {
                                    arrayList.clear();
                                    hashMap2.clear();
                                    hashMap.clear();
                                    TLRPC.TL_help_countriesList tL_help_countriesList = (TLRPC.TL_help_countriesList) tLObject2;
                                    for (int i13 = 0; i13 < tL_help_countriesList.countries.size(); i13++) {
                                        TLRPC.TL_help_country tL_help_country = tL_help_countriesList.countries.get(i13);
                                        for (int i14 = 0; i14 < tL_help_country.country_codes.size(); i14++) {
                                            TLRPC.TL_help_countryCode tL_help_countryCode = tL_help_country.country_codes.get(i14);
                                            if (tL_help_countryCode != null) {
                                                nt ntVar2 = new nt();
                                                String str = tL_help_country.name;
                                                ntVar2.a = str;
                                                String str2 = tL_help_country.default_name;
                                                ntVar2.b = str2;
                                                if (str == null && str2 != null) {
                                                    ntVar2.a = str2;
                                                }
                                                ntVar2.c = tL_help_countryCode.country_code;
                                                ntVar2.d = tL_help_country.iso2;
                                                arrayList.add(ntVar2);
                                                List list = (List) hashMap2.get(tL_help_countryCode.country_code);
                                                if (list == null) {
                                                    String str3 = tL_help_countryCode.country_code;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    hashMap2.put(str3, arrayList2);
                                                    list = arrayList2;
                                                }
                                                list.add(ntVar2);
                                                if (tL_help_countryCode.patterns.size() > 0) {
                                                    hashMap.put(tL_help_countryCode.country_code, tL_help_countryCode.patterns);
                                                }
                                            }
                                        }
                                    }
                                    hf0 hf0Var = gf0Var22.a0;
                                    if (hf0Var.F == 2) {
                                        i112 = ((org.telegram.ui.ActionBar.k2) hf0Var).currentAccount;
                                        String d = af.b.d(org.telegram.messenger.d20.i(i112).d(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i15 = 4; i15 >= 1; i15--) {
                                                    String substring = d.substring(0, i15);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    if (list2 == null) {
                                                        ntVar = null;
                                                    } else if (list2.size() > 1) {
                                                        String string = org.telegram.messenger.vp.d1().getString("phone_code_last_matched_" + substring, null);
                                                        if (string != null) {
                                                            ntVar = (nt) sc.e.g(1, list2);
                                                            int size = arrayList.size();
                                                            int i16 = 0;
                                                            while (true) {
                                                                if (i16 < size) {
                                                                    Object obj = arrayList.get(i16);
                                                                    i16++;
                                                                    nt ntVar3 = (nt) obj;
                                                                    if (Objects.equals(ntVar3.d, string)) {
                                                                        ntVar = ntVar3;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            ntVar = (nt) sc.e.g(1, list2);
                                                        }
                                                    } else {
                                                        ntVar = (nt) list2.get(0);
                                                    }
                                                    if (ntVar != null) {
                                                        ef0Var.setText(substring);
                                                        break;
                                                    }
                                                }
                                                ef0Var.setText(d.substring(0, 1));
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                gf0Var22.M = false;
                                hf0 hf0Var2 = gf0Var22.a0;
                                hf0Var2.D1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (TwoStepVerificationActivity.m0(password, true)) {
                                        Bundle bundle = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle.putString("password", Utilities.f(serializedData.toByteArray()));
                                        hf0Var2.C1(6, true, bundle, false);
                                        break;
                                    } else {
                                        org.telegram.ui.Components.s4.w0(hf0Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131743846, "UpdateAppAlert"), true);
                                        break;
                                    }
                                } else {
                                    hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), tL_error2.text);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
