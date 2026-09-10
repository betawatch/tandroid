package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ls implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ts b;

    public /* synthetic */ ls(ts tsVar, int i10) {
        this.a = i10;
        this.b = tsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ts tsVar = this.b;
                if (tsVar.J) {
                    tsVar.d.b.requestFocus();
                    AndroidUtilities.showKeyboard(tsVar.d.b);
                    break;
                }
                break;
            case 1:
                ts.Z(this.b);
                break;
            default:
                ts tsVar2 = this.b;
                tsVar2.presentFragment(eo.R9(tsVar2.H), true);
                break;
        }
    }
}
