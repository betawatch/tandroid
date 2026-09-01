package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hm0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jm0 b;

    public /* synthetic */ hm0(jm0 jm0Var, int i10) {
        this.a = i10;
        this.b = jm0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jm0 jm0Var = this.b;
                jm0Var.getClass();
                AndroidUtilities.runOnUIThread(new hm0(jm0Var, 2));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new hm0(this.b, 3));
                break;
            case 2:
                super/*android.app.Dialog*/.dismiss();
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
