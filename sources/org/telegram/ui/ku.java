package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class ku implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DataSettingsActivity b;

    public /* synthetic */ ku(DataSettingsActivity dataSettingsActivity, int i10) {
        this.a = i10;
        this.b = dataSettingsActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                this.b.getMediaDataController().clearAllDrafts(true);
                break;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.b;
                dataSettingsActivity.X = true;
                if (dataSettingsActivity.a != null && (i10 = dataSettingsActivity.s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    break;
                }
                break;
            default:
                z6.m0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.b;
                ku kuVar = new ku(dataSettingsActivity2, 1);
                AndroidUtilities.runOnUIThread(kuVar, 100L);
                z6.j0(new lu(dataSettingsActivity2, kuVar, System.currentTimeMillis(), 0));
                break;
        }
    }
}
