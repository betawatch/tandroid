package org.telegram.ui;

import android.text.TextUtils;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class fm0 implements t9 {
    public final /* synthetic */ in0 a;

    public fm0(in0 in0Var) {
        this.a = in0Var;
    }

    @Override // org.telegram.ui.t9
    public final /* synthetic */ String J0() {
        return null;
    }

    @Override // org.telegram.ui.t9
    public final void T0(MrzRecognizer.Result result) {
        boolean isEmpty = TextUtils.isEmpty(result.firstName);
        in0 in0Var = this.a;
        if (!isEmpty) {
            in0Var.Y[0].setText(result.firstName);
        }
        if (!TextUtils.isEmpty(result.middleName)) {
            in0Var.Y[1].setText(result.middleName);
        }
        if (!TextUtils.isEmpty(result.lastName)) {
            in0Var.Y[2].setText(result.lastName);
        }
        int i10 = result.gender;
        if (i10 != 0) {
            if (i10 == 1) {
                in0Var.w = "male";
                in0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
            } else if (i10 == 2) {
                in0Var.w = "female";
                in0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
            }
        }
        if (!TextUtils.isEmpty(result.nationality)) {
            String str = result.nationality;
            in0Var.s = str;
            String str2 = (String) in0Var.Y0.get(str);
            if (str2 != null) {
                in0Var.Y[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(result.issuingCountry)) {
            String str3 = result.issuingCountry;
            in0Var.v = str3;
            String str4 = (String) in0Var.Y0.get(str3);
            if (str4 != null) {
                in0Var.Y[6].setText(str4);
            }
        }
        int i11 = result.birthDay;
        if (i11 <= 0 || result.birthMonth <= 0 || result.birthYear <= 0) {
            return;
        }
        in0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i11), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
    }

    @Override // org.telegram.ui.t9
    public final /* synthetic */ boolean e1(String str, l9 l9Var) {
        return false;
    }

    @Override // org.telegram.ui.t9
    public final /* synthetic */ void K(String str) {
    }

    @Override // org.telegram.ui.t9
    public final /* synthetic */ void onDismiss() {
    }
}
