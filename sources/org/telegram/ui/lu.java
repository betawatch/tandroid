package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DataSettingsActivity b;

    public /* synthetic */ lu(DataSettingsActivity dataSettingsActivity, int i10) {
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
                a7.n0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.b;
                lu luVar = new lu(dataSettingsActivity2, 1);
                AndroidUtilities.runOnUIThread(luVar, 100L);
                a7.j0(new mu(dataSettingsActivity2, luVar, System.currentTimeMillis(), 0));
                break;
        }
    }
}
