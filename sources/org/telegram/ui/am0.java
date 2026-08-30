package org.telegram.ui;

import android.text.TextUtils;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class am0 implements u9 {
    public final /* synthetic */ dn0 a;

    public am0(dn0 dn0Var) {
        this.a = dn0Var;
    }

    @Override // org.telegram.ui.u9
    public final /* synthetic */ String G0() {
        return null;
    }

    @Override // org.telegram.ui.u9
    public final void S0(MrzRecognizer.Result result) {
        boolean isEmpty = TextUtils.isEmpty(result.firstName);
        dn0 dn0Var = this.a;
        if (!isEmpty) {
            dn0Var.V[0].setText(result.firstName);
        }
        if (!TextUtils.isEmpty(result.middleName)) {
            dn0Var.V[1].setText(result.middleName);
        }
        if (!TextUtils.isEmpty(result.lastName)) {
            dn0Var.V[2].setText(result.lastName);
        }
        int i10 = result.gender;
        if (i10 != 0) {
            if (i10 == 1) {
                dn0Var.w = "male";
                dn0Var.V[4].setText(LocaleController.getString(R.string.PassportMale));
            } else if (i10 == 2) {
                dn0Var.w = "female";
                dn0Var.V[4].setText(LocaleController.getString(R.string.PassportFemale));
            }
        }
        if (!TextUtils.isEmpty(result.nationality)) {
            String str = result.nationality;
            dn0Var.s = str;
            String str2 = (String) dn0Var.V0.get(str);
            if (str2 != null) {
                dn0Var.V[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(result.issuingCountry)) {
            String str3 = result.issuingCountry;
            dn0Var.v = str3;
            String str4 = (String) dn0Var.V0.get(str3);
            if (str4 != null) {
                dn0Var.V[6].setText(str4);
            }
        }
        int i11 = result.birthDay;
        if (i11 <= 0 || result.birthMonth <= 0 || result.birthYear <= 0) {
            return;
        }
        dn0Var.V[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i11), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
    }

    @Override // org.telegram.ui.u9
    public final /* synthetic */ boolean f1(String str, m9 m9Var) {
        return false;
    }

    @Override // org.telegram.ui.u9
    public final /* synthetic */ void K(String str) {
    }

    @Override // org.telegram.ui.u9
    public final /* synthetic */ void onDismiss() {
    }
}
