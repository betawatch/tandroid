package org.telegram.ui;

import android.text.TextUtils;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class pm0 implements y9 {
    public final /* synthetic */ sn0 a;

    public pm0(sn0 sn0Var) {
        this.a = sn0Var;
    }

    @Override // org.telegram.ui.y9
    public final /* synthetic */ String I0() {
        return null;
    }

    @Override // org.telegram.ui.y9
    public final void V0(MrzRecognizer.Result result) {
        boolean isEmpty = TextUtils.isEmpty(result.firstName);
        sn0 sn0Var = this.a;
        if (!isEmpty) {
            sn0Var.Y[0].setText(result.firstName);
        }
        if (!TextUtils.isEmpty(result.middleName)) {
            sn0Var.Y[1].setText(result.middleName);
        }
        if (!TextUtils.isEmpty(result.lastName)) {
            sn0Var.Y[2].setText(result.lastName);
        }
        int i10 = result.gender;
        if (i10 != 0) {
            if (i10 == 1) {
                sn0Var.w = "male";
                sn0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
            } else if (i10 == 2) {
                sn0Var.w = "female";
                sn0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
            }
        }
        if (!TextUtils.isEmpty(result.nationality)) {
            String str = result.nationality;
            sn0Var.s = str;
            String str2 = (String) sn0Var.Y0.get(str);
            if (str2 != null) {
                sn0Var.Y[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(result.issuingCountry)) {
            String str3 = result.issuingCountry;
            sn0Var.v = str3;
            String str4 = (String) sn0Var.Y0.get(str3);
            if (str4 != null) {
                sn0Var.Y[6].setText(str4);
            }
        }
        int i11 = result.birthDay;
        if (i11 <= 0 || result.birthMonth <= 0 || result.birthYear <= 0) {
            return;
        }
        sn0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i11), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
    }

    @Override // org.telegram.ui.y9
    public final /* synthetic */ boolean d1(String str, o9 o9Var) {
        return false;
    }

    @Override // org.telegram.ui.y9
    public final /* synthetic */ void K(String str) {
    }

    @Override // org.telegram.ui.y9
    public final /* synthetic */ void onDismiss() {
    }
}
