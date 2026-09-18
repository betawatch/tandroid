package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class go implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ jo b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ go(jo joVar, TLRPC.Document document, int i10) {
        this.a = i10;
        this.b = joVar;
        this.c = document;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                io ioVar = this.b.d;
                if (ioVar != null) {
                    ioVar.c(this.c);
                    break;
                }
                break;
            default:
                io ioVar2 = this.b.d;
                if (ioVar2 != null) {
                    ioVar2.c(this.c);
                    break;
                }
                break;
        }
    }
}
