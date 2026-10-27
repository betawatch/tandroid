package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class iy implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iy(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.a) {
            case 0:
                ny nyVar = ((jy) this.c).b;
                if (i10 == 0) {
                    nyVar.e.remove(this.b - nyVar.n);
                    nyVar.a0();
                    my myVar = nyVar.f;
                    if (myVar != null) {
                        myVar.a();
                        break;
                    }
                }
                break;
            case 1:
                NotificationsSettingsActivity.Y((NotificationsSettingsActivity) this.c, this.b, i10);
                break;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                db1 db1Var = themeActivity.a;
                if (db1Var != null) {
                    db1Var.m(this.b);
                    break;
                }
                break;
        }
    }
}
