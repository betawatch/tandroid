package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ey implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ey(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.a) {
            case 0:
                iy iyVar = (iy) ((m5.e) this.c).c;
                if (i10 == 0) {
                    iyVar.e.remove(this.b - iyVar.n);
                    iyVar.d0();
                    hy hyVar = iyVar.f;
                    if (hyVar != null) {
                        hyVar.a();
                        break;
                    }
                }
                break;
            case 1:
                NotificationsSettingsActivity.b0((NotificationsSettingsActivity) this.c, this.b, i10);
                break;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = org.telegram.messenger.vp.d1().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                x71 x71Var = themeActivity.a;
                if (x71Var != null) {
                    x71Var.g(this.b);
                    break;
                }
                break;
        }
    }
}
