package org.telegram.ui;

import android.text.TextUtils;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class hm0 implements v9 {
    public final /* synthetic */ kn0 a;

    public hm0(kn0 kn0Var) {
        this.a = kn0Var;
    }

    @Override // org.telegram.ui.v9
    public final /* synthetic */ String J0() {
        return null;
    }

    @Override // org.telegram.ui.v9
    public final void T0(MrzRecognizer.Result result) {
        boolean isEmpty = TextUtils.isEmpty(result.firstName);
        kn0 kn0Var = this.a;
        if (!isEmpty) {
            kn0Var.Y[0].setText(result.firstName);
        }
        if (!TextUtils.isEmpty(result.middleName)) {
            kn0Var.Y[1].setText(result.middleName);
        }
        if (!TextUtils.isEmpty(result.lastName)) {
            kn0Var.Y[2].setText(result.lastName);
        }
        int i10 = result.gender;
        if (i10 != 0) {
            if (i10 == 1) {
                kn0Var.w = "male";
                kn0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
            } else if (i10 == 2) {
                kn0Var.w = "female";
                kn0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
            }
        }
        if (!TextUtils.isEmpty(result.nationality)) {
            String str = result.nationality;
            kn0Var.s = str;
            String str2 = (String) kn0Var.Y0.get(str);
            if (str2 != null) {
                kn0Var.Y[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(result.issuingCountry)) {
            String str3 = result.issuingCountry;
            kn0Var.v = str3;
            String str4 = (String) kn0Var.Y0.get(str3);
            if (str4 != null) {
                kn0Var.Y[6].setText(str4);
            }
        }
        int i11 = result.birthDay;
        if (i11 <= 0 || result.birthMonth <= 0 || result.birthYear <= 0) {
            return;
        }
        kn0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i11), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
    }

    @Override // org.telegram.ui.v9
    public final /* synthetic */ boolean g1(String str, n9 n9Var) {
        return false;
    }

    @Override // org.telegram.ui.v9
    public final /* synthetic */ void L(String str) {
    }

    @Override // org.telegram.ui.v9
    public final /* synthetic */ void onDismiss() {
    }
}
