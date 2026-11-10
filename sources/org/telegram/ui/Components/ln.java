package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ln implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ on b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ ln(on onVar, TLRPC.Document document, int i7) {
        this.a = i7;
        this.b = onVar;
        this.c = document;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                nn nnVar = this.b.d;
                if (nnVar != null) {
                    nnVar.b(this.c);
                    break;
                }
                break;
            default:
                nn nnVar2 = this.b.d;
                if (nnVar2 != null) {
                    nnVar2.b(this.c);
                    break;
                }
                break;
        }
    }
}
