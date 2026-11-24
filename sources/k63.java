// default package

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.ui.DataSettingsActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class k63 implements DialogInterface.OnClickListener {
    public final /* synthetic */ DataSettingsActivity a;
    public final /* synthetic */ SharedPreferences b;
    public final /* synthetic */ int c;

    public /* synthetic */ k63(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i) {
        this.a = dataSettingsActivity;
        this.b = sharedPreferences;
        this.c = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2;
        DataSettingsActivity dataSettingsActivity = this.a;
        dataSettingsActivity.getClass();
        if (i != 0) {
            i2 = 3;
            if (i != 1) {
                i2 = i != 2 ? i != 3 ? -1 : 2 : 1;
            }
        } else {
            i2 = 0;
        }
        if (i2 != -1) {
            this.b.edit().putInt("VoipDataSaving", i2).commit();
            dataSettingsActivity.V = true;
        }
        s20 s20Var = dataSettingsActivity.a;
        if (s20Var != null) {
            s20Var.g(this.c);
        }
    }
}
