package org.telegram.ui;

import android.text.TextUtils;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class cm0 implements u9 {
    public final /* synthetic */ fn0 a;

    public cm0(fn0 fn0Var) {
        this.a = fn0Var;
    }

    @Override // org.telegram.ui.u9
    public final /* synthetic */ String E0() {
        return null;
    }

    @Override // org.telegram.ui.u9
    public final void P0(MrzRecognizer.Result result) {
        boolean isEmpty = TextUtils.isEmpty(result.firstName);
        fn0 fn0Var = this.a;
        if (!isEmpty) {
            fn0Var.V[0].setText(result.firstName);
        }
        if (!TextUtils.isEmpty(result.middleName)) {
            fn0Var.V[1].setText(result.middleName);
        }
        if (!TextUtils.isEmpty(result.lastName)) {
            fn0Var.V[2].setText(result.lastName);
        }
        int i10 = result.gender;
        if (i10 != 0) {
            if (i10 == 1) {
                fn0Var.w = "male";
                fn0Var.V[4].setText(LocaleController.getString(R.string.PassportMale));
            } else if (i10 == 2) {
                fn0Var.w = "female";
                fn0Var.V[4].setText(LocaleController.getString(R.string.PassportFemale));
            }
        }
        if (!TextUtils.isEmpty(result.nationality)) {
            String str = result.nationality;
            fn0Var.s = str;
            String str2 = (String) fn0Var.V0.get(str);
            if (str2 != null) {
                fn0Var.V[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(result.issuingCountry)) {
            String str3 = result.issuingCountry;
            fn0Var.v = str3;
            String str4 = (String) fn0Var.V0.get(str3);
            if (str4 != null) {
                fn0Var.V[6].setText(str4);
            }
        }
        int i11 = result.birthDay;
        if (i11 <= 0 || result.birthMonth <= 0 || result.birthYear <= 0) {
            return;
        }
        fn0Var.V[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i11), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
    }

    @Override // org.telegram.ui.u9
    public final /* synthetic */ boolean e1(String str, m9 m9Var) {
        return false;
    }

    @Override // org.telegram.ui.u9
    public final /* synthetic */ void J(String str) {
    }

    @Override // org.telegram.ui.u9
    public final /* synthetic */ void onDismiss() {
    }
}
