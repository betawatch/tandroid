// default package

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.d0;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class mu3 implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mu3(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.a;
        int i2 = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ru3 ru3Var = (ru3) ((qx6) obj).c;
                if (i == 0) {
                    ru3Var.e.remove(i2 - ru3Var.n);
                    ru3Var.d0();
                    qu3 qu3Var = ru3Var.f;
                    if (qu3Var != null) {
                        qu3Var.a();
                        break;
                    }
                }
                break;
            case 1:
                ((NotificationsSettingsActivity) obj).C0(i2, i);
                break;
            default:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.getClass();
                SharedPreferences.Editor edit = uc7.e1().edit();
                edit.putInt("sortContactsBy", i);
                edit.commit();
                d0 d0Var = themeActivity.a;
                if (d0Var != null) {
                    d0Var.g(i2);
                    break;
                }
                break;
        }
    }
}
