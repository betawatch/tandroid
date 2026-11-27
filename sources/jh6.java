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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jh6 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ph6 b;

    public /* synthetic */ jh6(ph6 ph6Var, byte b) {
        this.a = b;
        this.b = ph6Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final ph6 ph6Var = this.b;
        switch (b) {
            case 0:
                final byte b2 = 0;
                hl.c3(new Runnable() { // from class: lh6
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i;
                        gy2 gy2Var;
                        byte b3 = b2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ph6 ph6Var2 = ph6Var;
                        switch (b3) {
                            case 0:
                                mh6 mh6Var = ph6Var2.a;
                                HashMap hashMap = ph6Var2.J;
                                ArrayList arrayList = ph6Var2.H;
                                HashMap hashMap2 = ph6Var2.I;
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
                                                gy2 gy2Var2 = new gy2();
                                                String str = tL_help_country.name;
                                                gy2Var2.a = str;
                                                String str2 = tL_help_country.default_name;
                                                gy2Var2.b = str2;
                                                if (str == null && str2 != null) {
                                                    gy2Var2.a = str2;
                                                }
                                                gy2Var2.c = tL_help_countryCode.country_code;
                                                gy2Var2.d = tL_help_country.iso2;
                                                arrayList.add(gy2Var2);
                                                List list = (List) hashMap2.get(tL_help_countryCode.country_code);
                                                if (list == null) {
                                                    String str3 = tL_help_countryCode.country_code;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    hashMap2.put(str3, arrayList2);
                                                    list = arrayList2;
                                                }
                                                list.add(gy2Var2);
                                                if (tL_help_countryCode.patterns.size() > 0) {
                                                    hashMap.put(tL_help_countryCode.country_code, tL_help_countryCode.patterns);
                                                }
                                            }
                                        }
                                    }
                                    qh6 qh6Var = ph6Var2.h0;
                                    if (qh6Var.G == 2) {
                                        i = ((e) qh6Var).currentAccount;
                                        String h = f78.h(yac.h(i).d(), false);
                                        if (!TextUtils.isEmpty(h)) {
                                            if (h.length() > 4) {
                                                for (int i4 = 4; i4 >= 1; i4--) {
                                                    String substring = h.substring(0, i4);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    if (list2 == null) {
                                                        gy2Var = null;
                                                    } else if (list2.size() > 1) {
                                                        String string = uc7.e1().getString("phone_code_last_matched_".concat(substring), null);
                                                        Object m = bp1.m(1, list2);
                                                        if (string != null) {
                                                            gy2Var = (gy2) m;
                                                            int size = arrayList.size();
                                                            int i5 = 0;
                                                            while (true) {
                                                                if (i5 < size) {
                                                                    Object obj = arrayList.get(i5);
                                                                    i5++;
                                                                    gy2 gy2Var3 = (gy2) obj;
                                                                    if (Objects.equals(gy2Var3.d, string)) {
                                                                        gy2Var = gy2Var3;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            gy2Var = (gy2) m;
                                                        }
                                                    } else {
                                                        gy2Var = (gy2) list2.get(0);
                                                    }
                                                    if (gy2Var != null) {
                                                        mh6Var.setText(substring);
                                                        break;
                                                    }
                                                }
                                                mh6Var.setText(h.substring(0, 1));
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                ph6Var2.N = false;
                                qh6 qh6Var2 = ph6Var2.h0;
                                qh6Var2.K1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (TwoStepVerificationActivity.a0(password, true)) {
                                        Bundle bundle = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle.putString("password", Utilities.f(serializedData.toByteArray()));
                                        qh6Var2.J1(6, true, bundle, false);
                                        break;
                                    } else {
                                        jj.u0(qh6Var2.getParentActivity(), ob6.M0(2131743475, "UpdateAppAlert"), true);
                                        break;
                                    }
                                } else {
                                    qh6Var2.z1(ob6.M0(2131745798, null), tL_error2.text);
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final byte b3 = 1;
                hl.c3(new Runnable() { // from class: lh6
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i;
                        gy2 gy2Var;
                        byte b32 = b3;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ph6 ph6Var2 = ph6Var;
                        switch (b32) {
                            case 0:
                                mh6 mh6Var = ph6Var2.a;
                                HashMap hashMap = ph6Var2.J;
                                ArrayList arrayList = ph6Var2.H;
                                HashMap hashMap2 = ph6Var2.I;
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
                                                gy2 gy2Var2 = new gy2();
                                                String str = tL_help_country.name;
                                                gy2Var2.a = str;
                                                String str2 = tL_help_country.default_name;
                                                gy2Var2.b = str2;
                                                if (str == null && str2 != null) {
                                                    gy2Var2.a = str2;
                                                }
                                                gy2Var2.c = tL_help_countryCode.country_code;
                                                gy2Var2.d = tL_help_country.iso2;
                                                arrayList.add(gy2Var2);
                                                List list = (List) hashMap2.get(tL_help_countryCode.country_code);
                                                if (list == null) {
                                                    String str3 = tL_help_countryCode.country_code;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    hashMap2.put(str3, arrayList2);
                                                    list = arrayList2;
                                                }
                                                list.add(gy2Var2);
                                                if (tL_help_countryCode.patterns.size() > 0) {
                                                    hashMap.put(tL_help_countryCode.country_code, tL_help_countryCode.patterns);
                                                }
                                            }
                                        }
                                    }
                                    qh6 qh6Var = ph6Var2.h0;
                                    if (qh6Var.G == 2) {
                                        i = ((e) qh6Var).currentAccount;
                                        String h = f78.h(yac.h(i).d(), false);
                                        if (!TextUtils.isEmpty(h)) {
                                            if (h.length() > 4) {
                                                for (int i4 = 4; i4 >= 1; i4--) {
                                                    String substring = h.substring(0, i4);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    if (list2 == null) {
                                                        gy2Var = null;
                                                    } else if (list2.size() > 1) {
                                                        String string = uc7.e1().getString("phone_code_last_matched_".concat(substring), null);
                                                        Object m = bp1.m(1, list2);
                                                        if (string != null) {
                                                            gy2Var = (gy2) m;
                                                            int size = arrayList.size();
                                                            int i5 = 0;
                                                            while (true) {
                                                                if (i5 < size) {
                                                                    Object obj = arrayList.get(i5);
                                                                    i5++;
                                                                    gy2 gy2Var3 = (gy2) obj;
                                                                    if (Objects.equals(gy2Var3.d, string)) {
                                                                        gy2Var = gy2Var3;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            gy2Var = (gy2) m;
                                                        }
                                                    } else {
                                                        gy2Var = (gy2) list2.get(0);
                                                    }
                                                    if (gy2Var != null) {
                                                        mh6Var.setText(substring);
                                                        break;
                                                    }
                                                }
                                                mh6Var.setText(h.substring(0, 1));
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                ph6Var2.N = false;
                                qh6 qh6Var2 = ph6Var2.h0;
                                qh6Var2.K1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (TwoStepVerificationActivity.a0(password, true)) {
                                        Bundle bundle = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle.putString("password", Utilities.f(serializedData.toByteArray()));
                                        qh6Var2.J1(6, true, bundle, false);
                                        break;
                                    } else {
                                        jj.u0(qh6Var2.getParentActivity(), ob6.M0(2131743475, "UpdateAppAlert"), true);
                                        break;
                                    }
                                } else {
                                    qh6Var2.z1(ob6.M0(2131745798, null), tL_error2.text);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
