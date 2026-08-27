package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eu implements DialogInterface.OnClickListener {
    public final /* synthetic */ DataSettingsActivity a;
    public final /* synthetic */ SharedPreferences b;
    public final /* synthetic */ int c;

    public /* synthetic */ eu(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i10) {
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
            dataSettingsActivity.R = true;
        }
        fu fuVar = dataSettingsActivity.a;
        if (fuVar != null) {
            fuVar.m(this.c);
        }
    }
}
