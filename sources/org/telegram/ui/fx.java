package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                kx kxVar = (kx) ((ji.j) this.c).c;
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
