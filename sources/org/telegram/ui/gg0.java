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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gg0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ mg0 b;

    public /* synthetic */ gg0(mg0 mg0Var, int i10) {
        this.a = i10;
        this.b = mg0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final mg0 mg0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.hg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11;
                        st stVar;
                        switch (i10) {
                            case 0:
                                mg0 mg0Var2 = mg0Var;
                                qj0 qj0Var = mg0Var2.a;
                                HashMap hashMap = mg0Var2.D;
                                ArrayList arrayList = mg0Var2.B;
                                HashMap hashMap2 = mg0Var2.C;
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
                                                st stVar2 = new st();
                                                String str = tL_help_country.name;
                                                stVar2.a = str;
                                                String str2 = tL_help_country.default_name;
                                                stVar2.b = str2;
                                                if (str == null && str2 != null) {
                                                    stVar2.a = str2;
                                                }
                                                stVar2.c = tL_help_countryCode.country_code;
                                                stVar2.d = tL_help_country.iso2;
                                                arrayList.add(stVar2);
                                                List list = (List) hashMap2.get(tL_help_countryCode.country_code);
                                                if (list == null) {
                                                    String str3 = tL_help_countryCode.country_code;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    hashMap2.put(str3, arrayList2);
                                                    list = arrayList2;
                                                }
                                                list.add(stVar2);
                                                if (tL_help_countryCode.patterns.size() > 0) {
                                                    hashMap.put(tL_help_countryCode.country_code, tL_help_countryCode.patterns);
                                                }
                                            }
                                        }
                                    }
                                    ng0 ng0Var = mg0Var2.S;
                                    if (ng0Var.C == 2) {
                                        i11 = ((org.telegram.ui.ActionBar.p2) ng0Var).currentAccount;
                                        String d = se.b.d(UserConfig.getInstance(i11).getClientPhone(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i14 = 4; i14 >= 1; i14--) {
                                                    String substring = d.substring(0, i14);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    st stVar3 = null;
                                                    if (list2 != null) {
                                                        if (list2.size() > 1) {
                                                            String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                                            if (string != null) {
                                                                stVar = (st) yh.k(1, list2);
                                                                int size = arrayList.size();
                                                                int i15 = 0;
                                                                while (true) {
                                                                    if (i15 < size) {
                                                                        Object obj = arrayList.get(i15);
                                                                        i15++;
                                                                        st stVar4 = (st) obj;
                                                                        if (Objects.equals(stVar4.d, string)) {
                                                                            stVar = stVar4;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                stVar = (st) yh.k(1, list2);
                                                            }
                                                            stVar3 = stVar;
                                                        } else {
                                                            stVar3 = (st) list2.get(0);
                                                        }
                                                    }
                                                    if (stVar3 != null) {
                                                        qj0Var.setText(substring);
                                                        break;
                                                    }
                                                }
                                                qj0Var.setText(d.substring(0, 1));
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                mg0 mg0Var3 = mg0Var;
                                mg0Var3.H = false;
                                ng0 ng0Var2 = mg0Var3.S;
                                ng0Var2.v1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (TwoStepVerificationActivity.i0(password, true)) {
                                        Bundle bundle = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                        ng0Var2.u1(6, true, bundle, false);
                                        break;
                                    } else {
                                        org.telegram.ui.Components.z4.x0(ng0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        break;
                                    }
                                } else {
                                    ng0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final mg0 mg0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.hg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112;
                        st stVar;
                        switch (i11) {
                            case 0:
                                mg0 mg0Var22 = mg0Var2;
                                qj0 qj0Var = mg0Var22.a;
                                HashMap hashMap = mg0Var22.D;
                                ArrayList arrayList = mg0Var22.B;
                                HashMap hashMap2 = mg0Var22.C;
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
                                                st stVar2 = new st();
                                                String str = tL_help_country.name;
                                                stVar2.a = str;
                                                String str2 = tL_help_country.default_name;
                                                stVar2.b = str2;
                                                if (str == null && str2 != null) {
                                                    stVar2.a = str2;
                                                }
                                                stVar2.c = tL_help_countryCode.country_code;
                                                stVar2.d = tL_help_country.iso2;
                                                arrayList.add(stVar2);
                                                List list = (List) hashMap2.get(tL_help_countryCode.country_code);
                                                if (list == null) {
                                                    String str3 = tL_help_countryCode.country_code;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    hashMap2.put(str3, arrayList2);
                                                    list = arrayList2;
                                                }
                                                list.add(stVar2);
                                                if (tL_help_countryCode.patterns.size() > 0) {
                                                    hashMap.put(tL_help_countryCode.country_code, tL_help_countryCode.patterns);
                                                }
                                            }
                                        }
                                    }
                                    ng0 ng0Var = mg0Var22.S;
                                    if (ng0Var.C == 2) {
                                        i112 = ((org.telegram.ui.ActionBar.p2) ng0Var).currentAccount;
                                        String d = se.b.d(UserConfig.getInstance(i112).getClientPhone(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i14 = 4; i14 >= 1; i14--) {
                                                    String substring = d.substring(0, i14);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    st stVar3 = null;
                                                    if (list2 != null) {
                                                        if (list2.size() > 1) {
                                                            String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                                            if (string != null) {
                                                                stVar = (st) yh.k(1, list2);
                                                                int size = arrayList.size();
                                                                int i15 = 0;
                                                                while (true) {
                                                                    if (i15 < size) {
                                                                        Object obj = arrayList.get(i15);
                                                                        i15++;
                                                                        st stVar4 = (st) obj;
                                                                        if (Objects.equals(stVar4.d, string)) {
                                                                            stVar = stVar4;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                stVar = (st) yh.k(1, list2);
                                                            }
                                                            stVar3 = stVar;
                                                        } else {
                                                            stVar3 = (st) list2.get(0);
                                                        }
                                                    }
                                                    if (stVar3 != null) {
                                                        qj0Var.setText(substring);
                                                        break;
                                                    }
                                                }
                                                qj0Var.setText(d.substring(0, 1));
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                mg0 mg0Var3 = mg0Var2;
                                mg0Var3.H = false;
                                ng0 ng0Var2 = mg0Var3.S;
                                ng0Var2.v1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (TwoStepVerificationActivity.i0(password, true)) {
                                        Bundle bundle = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                        ng0Var2.u1(6, true, bundle, false);
                                        break;
                                    } else {
                                        org.telegram.ui.Components.z4.x0(ng0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        break;
                                    }
                                } else {
                                    ng0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
