package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ro implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vo b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ ro(vo voVar, TLRPC.Document document, int i10) {
        this.a = i10;
        this.b = voVar;
        this.c = document;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                uo uoVar = this.b.d;
                if (uoVar != null) {
                    uoVar.b(this.c);
                    break;
                }
                break;
            default:
                uo uoVar2 = this.b.d;
                if (uoVar2 != null) {
                    uoVar2.b(this.c);
                    break;
                }
                break;
        }
    }
}
