// default package

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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class gh6 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lh6 b;

    public /* synthetic */ gh6(lh6 lh6Var, byte b) {
        this.a = b;
        this.b = lh6Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final lh6 lh6Var = this.b;
        switch (b) {
            case 0:
                final byte b2 = 0;
                gm.c3(new Runnable() { // from class: ih6
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i;
                        wy2 wy2Var;
                        byte b3 = b2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        lh6 lh6Var2 = lh6Var;
                        switch (b3) {
                            case 0:
                                jh6 jh6Var = lh6Var2.a;
                                HashMap hashMap = lh6Var2.J;
                                ArrayList arrayList = lh6Var2.H;
                                HashMap hashMap2 = lh6Var2.I;
                                if (tL_error2 == null) {
                                    arrayList.clear();
                                    hashMap2.clear();
                                    hashMap.clear();
                                    TLRPC.TL_help_countriesList tL_help_countriesList = (TLRPC.TL_help_countriesList) tLObject2;
                                    for (int i2 = 0; i2 < tL_help_countriesList.countries.size(); i2++) {
                                        TLRPC.TL_help_country tL_help_country = tL_help_countriesList.countries.get(i2);
                                        for (int i3 = 0; i3 < tL_help_country.country_codes.size(); i3++) {
                                            TLRPC.TL_help_countryCode tL_help_countryCode = tL_help_country.country_codes.get(i3);
                                            if (tL_help_countryCode != null) {
                                                wy2 wy2Var2 = new wy2();
                                                String str = tL_help_country.name;
                                                wy2Var2.a = str;
                                                String str2 = tL_help_country.default_name;
                                                wy2Var2.b = str2;
                                                if (str == null && str2 != null) {
                                                    wy2Var2.a = str2;
                                                }
                                                wy2Var2.c = tL_help_countryCode.country_code;
                                                wy2Var2.d = tL_help_country.iso2;
                                                arrayList.add(wy2Var2);
                                                List list = (List) hashMap2.get(tL_help_countryCode.country_code);
                                                if (list == null) {
                                                    String str3 = tL_help_countryCode.country_code;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    hashMap2.put(str3, arrayList2);
                                                    list = arrayList2;
                                                }
                                                list.add(wy2Var2);
                                                if (tL_help_countryCode.patterns.size() > 0) {
                                                    hashMap.put(tL_help_countryCode.country_code, tL_help_countryCode.patterns);
                                                }
                                            }
                                        }
                                    }
                                    mh6 mh6Var = lh6Var2.h0;
                                    if (mh6Var.G == 2) {
                                        i = ((d) mh6Var).currentAccount;
                                        String h = r58.h(z8c.h(i).d(), false);
                                        if (!TextUtils.isEmpty(h)) {
                                            if (h.length() > 4) {
                                                for (int i4 = 4; i4 >= 1; i4--) {
                                                    String substring = h.substring(0, i4);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    if (list2 == null) {
                                                        wy2Var = null;
                                                    } else if (list2.size() > 1) {
                                                        String string = oc7.d1().getString("phone_code_last_matched_".concat(substring), null);
                                                        Object m = aq1.m(1, list2);
                                                        if (string != null) {
                                                            wy2Var = (wy2) m;
                                                            int size = arrayList.size();
                                                            int i5 = 0;
                                                            while (true) {
                                                                if (i5 < size) {
                                                                    Object obj = arrayList.get(i5);
                                                                    i5++;
                                                                    wy2 wy2Var3 = (wy2) obj;
                                                                    if (Objects.equals(wy2Var3.d, string)) {
                                                                        wy2Var = wy2Var3;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            wy2Var = (wy2) m;
                                                        }
                                                    } else {
                                                        wy2Var = (wy2) list2.get(0);
                                                    }
                                                    if (wy2Var != null) {
                                                        jh6Var.setText(substring);
                                                        break;
                                                    }
                                                }
                                                jh6Var.setText(h.substring(0, 1));
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                lh6Var2.N = false;
                                mh6 mh6Var2 = lh6Var2.h0;
                                mh6Var2.K1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (TwoStepVerificationActivity.b0(password, true)) {
                                        Bundle bundle = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle.putString("password", Utilities.f(serializedData.toByteArray()));
                                        mh6Var2.J1(6, true, bundle, false);
                                        break;
                                    } else {
                                        ik.u0(mh6Var2.getParentActivity(), jb6.M0(2131743507, "UpdateAppAlert"), true);
                                        break;
                                    }
                                } else {
                                    mh6Var2.z1(jb6.M0(2131745804, null), tL_error2.text);
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final byte b3 = 1;
                gm.c3(new Runnable() { // from class: ih6
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i;
                        wy2 wy2Var;
                        byte b32 = b3;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        lh6 lh6Var2 = lh6Var;
                        switch (b32) {
                            case 0:
                                jh6 jh6Var = lh6Var2.a;
                                HashMap hashMap = lh6Var2.J;
                                ArrayList arrayList = lh6Var2.H;
                                HashMap hashMap2 = lh6Var2.I;
                                if (tL_error2 == null) {
                                    arrayList.clear();
                                    hashMap2.clear();
                                    hashMap.clear();
                                    TLRPC.TL_help_countriesList tL_help_countriesList = (TLRPC.TL_help_countriesList) tLObject2;
                                    for (int i2 = 0; i2 < tL_help_countriesList.countries.size(); i2++) {
                                        TLRPC.TL_help_country tL_help_country = tL_help_countriesList.countries.get(i2);
                                        for (int i3 = 0; i3 < tL_help_country.country_codes.size(); i3++) {
                                            TLRPC.TL_help_countryCode tL_help_countryCode = tL_help_country.country_codes.get(i3);
                                            if (tL_help_countryCode != null) {
                                                wy2 wy2Var2 = new wy2();
                                                String str = tL_help_country.name;
                                                wy2Var2.a = str;
                                                String str2 = tL_help_country.default_name;
                                                wy2Var2.b = str2;
                                                if (str == null && str2 != null) {
                                                    wy2Var2.a = str2;
                                                }
                                                wy2Var2.c = tL_help_countryCode.country_code;
                                                wy2Var2.d = tL_help_country.iso2;
                                                arrayList.add(wy2Var2);
                                                List list = (List) hashMap2.get(tL_help_countryCode.country_code);
                                                if (list == null) {
                                                    String str3 = tL_help_countryCode.country_code;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    hashMap2.put(str3, arrayList2);
                                                    list = arrayList2;
                                                }
                                                list.add(wy2Var2);
                                                if (tL_help_countryCode.patterns.size() > 0) {
                                                    hashMap.put(tL_help_countryCode.country_code, tL_help_countryCode.patterns);
                                                }
                                            }
                                        }
                                    }
                                    mh6 mh6Var = lh6Var2.h0;
                                    if (mh6Var.G == 2) {
                                        i = ((d) mh6Var).currentAccount;
                                        String h = r58.h(z8c.h(i).d(), false);
                                        if (!TextUtils.isEmpty(h)) {
                                            if (h.length() > 4) {
                                                for (int i4 = 4; i4 >= 1; i4--) {
                                                    String substring = h.substring(0, i4);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    if (list2 == null) {
                                                        wy2Var = null;
                                                    } else if (list2.size() > 1) {
                                                        String string = oc7.d1().getString("phone_code_last_matched_".concat(substring), null);
                                                        Object m = aq1.m(1, list2);
                                                        if (string != null) {
                                                            wy2Var = (wy2) m;
                                                            int size = arrayList.size();
                                                            int i5 = 0;
                                                            while (true) {
                                                                if (i5 < size) {
                                                                    Object obj = arrayList.get(i5);
                                                                    i5++;
                                                                    wy2 wy2Var3 = (wy2) obj;
                                                                    if (Objects.equals(wy2Var3.d, string)) {
                                                                        wy2Var = wy2Var3;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            wy2Var = (wy2) m;
                                                        }
                                                    } else {
                                                        wy2Var = (wy2) list2.get(0);
                                                    }
                                                    if (wy2Var != null) {
                                                        jh6Var.setText(substring);
                                                        break;
                                                    }
                                                }
                                                jh6Var.setText(h.substring(0, 1));
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                lh6Var2.N = false;
                                mh6 mh6Var2 = lh6Var2.h0;
                                mh6Var2.K1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (TwoStepVerificationActivity.b0(password, true)) {
                                        Bundle bundle = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle.putString("password", Utilities.f(serializedData.toByteArray()));
                                        mh6Var2.J1(6, true, bundle, false);
                                        break;
                                    } else {
                                        ik.u0(mh6Var2.getParentActivity(), jb6.M0(2131743507, "UpdateAppAlert"), true);
                                        break;
                                    }
                                } else {
                                    mh6Var2.z1(jb6.M0(2131745804, null), tL_error2.text);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
