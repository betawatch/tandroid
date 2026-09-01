package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ov implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ py b;

    public /* synthetic */ ov(py pyVar, int i10) {
        this.a = i10;
        this.b = pyVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                py.i0(this.b);
                break;
            case 1:
                py pyVar = this.b;
                if (pyVar.P3 != null) {
                    pyVar.getMessagesController().removeSuggestion(0L, pyVar.P3);
                    pyVar.P3 = null;
                    pyVar.L4();
                    break;
                }
                break;
            case 2:
                this.b.b4(true);
                break;
            default:
                this.b.b4(true);
                break;
        }
    }
}
