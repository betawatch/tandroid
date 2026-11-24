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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ff6 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lf6 b;

    public /* synthetic */ ff6(lf6 lf6Var, byte b) {
        this.a = b;
        this.b = lf6Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final lf6 lf6Var = this.b;
        switch (b) {
            case 0:
                final byte b2 = 0;
                gl.d3(new Runnable() { // from class: hf6
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i;
                        mx2 mx2Var;
                        byte b3 = b2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        lf6 lf6Var2 = lf6Var;
                        switch (b3) {
                            case 0:
                                if6 if6Var = lf6Var2.a;
                                HashMap hashMap = lf6Var2.J;
                                ArrayList arrayList = lf6Var2.H;
                                HashMap hashMap2 = lf6Var2.I;
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
                                                mx2 mx2Var2 = new mx2();
                                                String str = tL_help_country.name;
                                                mx2Var2.a = str;
                                                String str2 = tL_help_country.default_name;
                                                mx2Var2.b = str2;
                                                if (str == null && str2 != null) {
                                                    mx2Var2.a = str2;
                                                }
                                                mx2Var2.c = tL_help_countryCode.country_code;
                                                mx2Var2.d = tL_help_country.iso2;
                                                arrayList.add(mx2Var2);
                                                List list = (List) hashMap2.get(tL_help_countryCode.country_code);
                                                if (list == null) {
                                                    String str3 = tL_help_countryCode.country_code;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    hashMap2.put(str3, arrayList2);
                                                    list = arrayList2;
                                                }
                                                list.add(mx2Var2);
                                                if (tL_help_countryCode.patterns.size() > 0) {
                                                    hashMap.put(tL_help_countryCode.country_code, tL_help_countryCode.patterns);
                                                }
                                            }
                                        }
                                    }
                                    mf6 mf6Var = lf6Var2.h0;
                                    if (mf6Var.G == 2) {
                                        i = ((d) mf6Var).currentAccount;
                                        String h = p38.h(y6c.h(i).d(), false);
                                        if (!TextUtils.isEmpty(h)) {
                                            if (h.length() > 4) {
                                                for (int i4 = 4; i4 >= 1; i4--) {
                                                    String substring = h.substring(0, i4);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    if (list2 == null) {
                                                        mx2Var = null;
                                                    } else if (list2.size() > 1) {
                                                        String string = na7.c1().getString("phone_code_last_matched_".concat(substring), null);
                                                        Object m = oo1.m(1, list2);
                                                        if (string != null) {
                                                            mx2Var = (mx2) m;
                                                            int size = arrayList.size();
                                                            int i5 = 0;
                                                            while (true) {
                                                                if (i5 < size) {
                                                                    Object obj = arrayList.get(i5);
                                                                    i5++;
                                                                    mx2 mx2Var3 = (mx2) obj;
                                                                    if (Objects.equals(mx2Var3.d, string)) {
                                                                        mx2Var = mx2Var3;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            mx2Var = (mx2) m;
                                                        }
                                                    } else {
                                                        mx2Var = (mx2) list2.get(0);
                                                    }
                                                    if (mx2Var != null) {
                                                        if6Var.setText(substring);
                                                        break;
                                                    }
                                                }
                                                if6Var.setText(h.substring(0, 1));
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                lf6Var2.N = false;
                                mf6 mf6Var2 = lf6Var2.h0;
                                mf6Var2.J1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (TwoStepVerificationActivity.a0(password, true)) {
                                        Bundle bundle = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle.putString("password", Utilities.f(serializedData.toByteArray()));
                                        mf6Var2.I1(6, true, bundle, false);
                                        break;
                                    } else {
                                        ij.u0(mf6Var2.getParentActivity(), k96.M0(2131743581, "UpdateAppAlert"), true);
                                        break;
                                    }
                                } else {
                                    mf6Var2.y1(k96.M0(2131745878, null), tL_error2.text);
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final byte b3 = 1;
                gl.d3(new Runnable() { // from class: hf6
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i;
                        mx2 mx2Var;
                        byte b32 = b3;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        lf6 lf6Var2 = lf6Var;
                        switch (b32) {
                            case 0:
                                if6 if6Var = lf6Var2.a;
                                HashMap hashMap = lf6Var2.J;
                                ArrayList arrayList = lf6Var2.H;
                                HashMap hashMap2 = lf6Var2.I;
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
                                                mx2 mx2Var2 = new mx2();
                                                String str = tL_help_country.name;
                                                mx2Var2.a = str;
                                                String str2 = tL_help_country.default_name;
                                                mx2Var2.b = str2;
                                                if (str == null && str2 != null) {
                                                    mx2Var2.a = str2;
                                                }
                                                mx2Var2.c = tL_help_countryCode.country_code;
                                                mx2Var2.d = tL_help_country.iso2;
                                                arrayList.add(mx2Var2);
                                                List list = (List) hashMap2.get(tL_help_countryCode.country_code);
                                                if (list == null) {
                                                    String str3 = tL_help_countryCode.country_code;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    hashMap2.put(str3, arrayList2);
                                                    list = arrayList2;
                                                }
                                                list.add(mx2Var2);
                                                if (tL_help_countryCode.patterns.size() > 0) {
                                                    hashMap.put(tL_help_countryCode.country_code, tL_help_countryCode.patterns);
                                                }
                                            }
                                        }
                                    }
                                    mf6 mf6Var = lf6Var2.h0;
                                    if (mf6Var.G == 2) {
                                        i = ((d) mf6Var).currentAccount;
                                        String h = p38.h(y6c.h(i).d(), false);
                                        if (!TextUtils.isEmpty(h)) {
                                            if (h.length() > 4) {
                                                for (int i4 = 4; i4 >= 1; i4--) {
                                                    String substring = h.substring(0, i4);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    if (list2 == null) {
                                                        mx2Var = null;
                                                    } else if (list2.size() > 1) {
                                                        String string = na7.c1().getString("phone_code_last_matched_".concat(substring), null);
                                                        Object m = oo1.m(1, list2);
                                                        if (string != null) {
                                                            mx2Var = (mx2) m;
                                                            int size = arrayList.size();
                                                            int i5 = 0;
                                                            while (true) {
                                                                if (i5 < size) {
                                                                    Object obj = arrayList.get(i5);
                                                                    i5++;
                                                                    mx2 mx2Var3 = (mx2) obj;
                                                                    if (Objects.equals(mx2Var3.d, string)) {
                                                                        mx2Var = mx2Var3;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            mx2Var = (mx2) m;
                                                        }
                                                    } else {
                                                        mx2Var = (mx2) list2.get(0);
                                                    }
                                                    if (mx2Var != null) {
                                                        if6Var.setText(substring);
                                                        break;
                                                    }
                                                }
                                                if6Var.setText(h.substring(0, 1));
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                lf6Var2.N = false;
                                mf6 mf6Var2 = lf6Var2.h0;
                                mf6Var2.J1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (TwoStepVerificationActivity.a0(password, true)) {
                                        Bundle bundle = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle.putString("password", Utilities.f(serializedData.toByteArray()));
                                        mf6Var2.I1(6, true, bundle, false);
                                        break;
                                    } else {
                                        ij.u0(mf6Var2.getParentActivity(), k96.M0(2131743581, "UpdateAppAlert"), true);
                                        break;
                                    }
                                } else {
                                    mf6Var2.y1(k96.M0(2131745878, null), tL_error2.text);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
