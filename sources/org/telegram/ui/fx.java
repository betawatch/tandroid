package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fx implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fx(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        switch (this.a) {
            case 0:
                kx kxVar = (kx) ((ji.l) this.c).c;
                if (i7 == 0) {
                    kxVar.e.remove(this.b - kxVar.n);
                    kxVar.e0();
                    jx jxVar = kxVar.f;
                    if (jxVar != null) {
                        jxVar.a();
                        break;
                    }
                }
                break;
            case 1:
                NotificationsSettingsActivity.c0((NotificationsSettingsActivity) this.c, this.b, i7);
                break;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
                edit.putInt("sortContactsBy", i7);
                edit.commit();
                g61 g61Var = themeActivity.a;
                if (g61Var != null) {
                    g61Var.g(this.b);
                    break;
                }
                break;
        }
    }
}
