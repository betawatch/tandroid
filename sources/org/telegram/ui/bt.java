package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bt implements DialogInterface.OnClickListener {
    public final /* synthetic */ DataSettingsActivity a;
    public final /* synthetic */ SharedPreferences b;
    public final /* synthetic */ int c;

    public /* synthetic */ bt(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i7) {
        this.a = dataSettingsActivity;
        this.b = sharedPreferences;
        this.c = i7;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        int i10;
        DataSettingsActivity dataSettingsActivity = this.a;
        dataSettingsActivity.getClass();
        if (i7 != 0) {
            i10 = 3;
            if (i7 != 1) {
                i10 = i7 != 2 ? i7 != 3 ? -1 : 2 : 1;
            }
        } else {
            i10 = 0;
        }
        if (i10 != -1) {
            this.b.edit().putInt("VoipDataSaving", i10).commit();
            dataSettingsActivity.U = true;
        }
        l4 l4Var = dataSettingsActivity.a;
        if (l4Var != null) {
            l4Var.g(this.c);
        }
    }
}
