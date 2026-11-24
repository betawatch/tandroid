// default package

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.d0;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class fv3 implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fv3(Object obj, int i, byte b) {
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
                kv3 kv3Var = (kv3) ((hi2) obj).c;
                if (i == 0) {
                    kv3Var.e.remove(i2 - kv3Var.n);
                    kv3Var.e0();
                    jv3 jv3Var = kv3Var.f;
                    if (jv3Var != null) {
                        jv3Var.a();
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
                SharedPreferences.Editor edit = oc7.d1().edit();
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
