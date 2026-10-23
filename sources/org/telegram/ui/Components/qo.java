package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qo implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ to b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ qo(to toVar, TLRPC.Document document, int i10) {
        this.a = i10;
        this.b = toVar;
        this.c = document;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                so soVar = this.b.d;
                if (soVar != null) {
                    soVar.c(this.c);
                    break;
                }
                break;
            default:
                so soVar2 = this.b.d;
                if (soVar2 != null) {
                    soVar2.c(this.c);
                    break;
                }
                break;
        }
    }
}
