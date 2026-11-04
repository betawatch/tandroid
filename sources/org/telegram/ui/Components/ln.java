package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ln implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ on b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ ln(on onVar, TLRPC.Document document, int i3) {
        this.a = i3;
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
