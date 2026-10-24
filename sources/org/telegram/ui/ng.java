package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ng implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.c2[] b;

    public /* synthetic */ ng(org.telegram.ui.ActionBar.c2[] c2VarArr, int i10) {
        this.a = i10;
        this.b = c2VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.c2[] c2VarArr = this.b;
                try {
                    c2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                c2VarArr[0] = null;
                break;
            case 1:
                org.telegram.ui.ActionBar.c2[] c2VarArr2 = this.b;
                try {
                    c2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                c2VarArr2[0] = null;
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ng(this.b, 4));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new ng(this.b, 5));
                break;
            case 4:
                this.b[0].dismiss();
                break;
            default:
                this.b[0].dismiss();
                break;
        }
    }
}
