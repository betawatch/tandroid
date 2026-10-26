package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gy implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gy(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.a) {
            case 0:
                ly lyVar = ((hy) this.c).b;
                if (i10 == 0) {
                    lyVar.e.remove(this.b - lyVar.n);
                    lyVar.a0();
                    ky kyVar = lyVar.f;
                    if (kyVar != null) {
                        kyVar.a();
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
                bb1 bb1Var = themeActivity.a;
                if (bb1Var != null) {
                    bb1Var.m(this.b);
                    break;
                }
                break;
        }
    }
}
