package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bu implements DialogInterface.OnClickListener {
    public final /* synthetic */ DataSettingsActivity a;
    public final /* synthetic */ SharedPreferences b;
    public final /* synthetic */ int c;

    public /* synthetic */ bu(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i9) {
        this.a = dataSettingsActivity;
        this.b = sharedPreferences;
        this.c = i9;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i9) {
        int i10;
        DataSettingsActivity dataSettingsActivity = this.a;
        dataSettingsActivity.getClass();
        if (i9 != 0) {
            i10 = 3;
            if (i9 != 1) {
                i10 = i9 != 2 ? i9 != 3 ? -1 : 2 : 1;
            }
        } else {
            i10 = 0;
        }
        if (i10 != -1) {
            this.b.edit().putInt("VoipDataSaving", i10).commit();
            dataSettingsActivity.R = true;
        }
        cu cuVar = dataSettingsActivity.a;
        if (cuVar != null) {
            cuVar.m(this.c);
        }
    }
}
