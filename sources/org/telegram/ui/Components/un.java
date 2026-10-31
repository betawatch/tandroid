package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class un implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ un(xn xnVar, TLRPC.Document document, int i10) {
        this.a = i10;
        this.b = xnVar;
        this.c = document;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                wn wnVar = this.b.d;
                if (wnVar != null) {
                    wnVar.b(this.c);
                    break;
                }
                break;
            default:
                wn wnVar2 = this.b.d;
                if (wnVar2 != null) {
                    wnVar2.b(this.c);
                    break;
                }
                break;
        }
    }
}
