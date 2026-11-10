package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cx implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cx(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        switch (this.a) {
            case 0:
                hx hxVar = (hx) ((j2.n) this.c).c;
                if (i7 == 0) {
                    hxVar.e.remove(this.b - hxVar.n);
                    hxVar.e0();
                    gx gxVar = hxVar.f;
                    if (gxVar != null) {
                        gxVar.a();
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
                SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                edit.putInt("sortContactsBy", i7);
                edit.commit();
                h61 h61Var = themeActivity.a;
                if (h61Var != null) {
                    h61Var.g(this.b);
                    break;
                }
                break;
        }
    }
}
