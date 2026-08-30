package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nv implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ oy b;

    public /* synthetic */ nv(oy oyVar, int i10) {
        this.a = i10;
        this.b = oyVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                oy.i0(this.b);
                break;
            case 1:
                oy oyVar = this.b;
                if (oyVar.P3 != null) {
                    oyVar.getMessagesController().removeSuggestion(0L, oyVar.P3);
                    oyVar.P3 = null;
                    oyVar.L4();
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
