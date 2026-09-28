package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class io implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ lo b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ io(lo loVar, TLRPC.Document document, int i10) {
        this.a = i10;
        this.b = loVar;
        this.c = document;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ko koVar = this.b.d;
                if (koVar != null) {
                    koVar.c(this.c);
                    break;
                }
                break;
            default:
                ko koVar2 = this.b.d;
                if (koVar2 != null) {
                    koVar2.c(this.c);
                    break;
                }
                break;
        }
    }
}
