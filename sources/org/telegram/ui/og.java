package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class og implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2[] b;

    public /* synthetic */ og(org.telegram.ui.ActionBar.e2[] e2VarArr, int i10) {
        this.a = i10;
        this.b = e2VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.e2[] e2VarArr = this.b;
                try {
                    e2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                e2VarArr[0] = null;
                break;
            case 1:
                org.telegram.ui.ActionBar.e2[] e2VarArr2 = this.b;
                try {
                    e2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                e2VarArr2[0] = null;
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new og(this.b, 4));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new og(this.b, 5));
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
