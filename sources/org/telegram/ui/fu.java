package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DataSettingsActivity b;

    public /* synthetic */ fu(DataSettingsActivity dataSettingsActivity, int i10) {
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
                fu fuVar = new fu(dataSettingsActivity2, 1);
                AndroidUtilities.runOnUIThread(fuVar, 100L);
                z6.j0(new gu(dataSettingsActivity2, fuVar, System.currentTimeMillis(), 0));
                break;
        }
    }
}
