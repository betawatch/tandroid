package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dy implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dy(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.a) {
            case 0:
                hy hyVar = (hy) ((m5.e) this.c).c;
                if (i10 == 0) {
                    hyVar.e.remove(this.b - hyVar.n);
                    hyVar.e0();
                    gy gyVar = hyVar.f;
                    if (gyVar != null) {
                        gyVar.a();
                        break;
                    }
                }
                break;
            case 1:
                NotificationsSettingsActivity.c0((NotificationsSettingsActivity) this.c, this.b, i10);
                break;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = org.telegram.messenger.wp.d1().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                v71 v71Var = themeActivity.a;
                if (v71Var != null) {
                    v71Var.g(this.b);
                    break;
                }
                break;
        }
    }
}
