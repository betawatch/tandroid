package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jo implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ mo b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ jo(mo moVar, TLRPC.Document document, int i10) {
        this.a = i10;
        this.b = moVar;
        this.c = document;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                lo loVar = this.b.d;
                if (loVar != null) {
                    loVar.b(this.c);
                    break;
                }
                break;
            default:
                lo loVar2 = this.b.d;
                if (loVar2 != null) {
                    loVar2.b(this.c);
                    break;
                }
                break;
        }
    }
}
