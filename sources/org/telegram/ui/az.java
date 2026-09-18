package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class az implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ az(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.a) {
            case 0:
                fz fzVar = ((bz) this.c).b;
                if (i10 == 0) {
                    fzVar.e.remove(this.b - fzVar.n);
                    fzVar.Z();
                    ez ezVar = fzVar.f;
                    if (ezVar != null) {
                        ezVar.a();
                        break;
                    }
                }
                break;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.c, this.b, i10);
                break;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                hc1 hc1Var = themeActivity.a;
                if (hc1Var != null) {
                    hc1Var.m(this.b);
                    break;
                }
                break;
        }
    }
}
