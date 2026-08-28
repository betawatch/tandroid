package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hy implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hy(Object obj, int i9, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i9;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i9) {
        switch (this.a) {
            case 0:
                my myVar = ((iy) this.c).b;
                if (i9 == 0) {
                    myVar.e.remove(this.b - myVar.n);
                    myVar.Y();
                    ly lyVar = myVar.f;
                    if (lyVar != null) {
                        lyVar.a();
                        break;
                    }
                }
                break;
            case 1:
                NotificationsSettingsActivity.W((NotificationsSettingsActivity) this.c, this.b, i9);
                break;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i9);
                edit.commit();
                xa1 xa1Var = themeActivity.a;
                if (xa1Var != null) {
                    xa1Var.m(this.b);
                    break;
                }
                break;
        }
    }
}
