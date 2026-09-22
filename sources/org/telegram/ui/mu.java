package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mu implements DialogInterface.OnClickListener {
    public final /* synthetic */ DataSettingsActivity a;
    public final /* synthetic */ SharedPreferences b;
    public final /* synthetic */ int c;

    public /* synthetic */ mu(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i10) {
        this.a = dataSettingsActivity;
        this.b = sharedPreferences;
        this.c = i10;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11;
        DataSettingsActivity dataSettingsActivity = this.a;
        dataSettingsActivity.getClass();
        if (i10 != 0) {
            i11 = 3;
            if (i10 != 1) {
                i11 = i10 != 2 ? i10 != 3 ? -1 : 2 : 1;
            }
        } else {
            i11 = 0;
        }
        if (i11 != -1) {
            this.b.edit().putInt("VoipDataSaving", i11).commit();
            dataSettingsActivity.V = true;
        }
        nu nuVar = dataSettingsActivity.a;
        if (nuVar != null) {
            nuVar.m(this.c);
        }
    }
}
