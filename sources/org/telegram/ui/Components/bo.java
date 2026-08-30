package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bo implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ bo(fo foVar, TLRPC.Document document, int i10) {
        this.a = i10;
        this.b = foVar;
        this.c = document;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                eo eoVar = this.b.d;
                if (eoVar != null) {
                    eoVar.b(this.c);
                    break;
                }
                break;
            default:
                eo eoVar2 = this.b.d;
                if (eoVar2 != null) {
                    eoVar2.b(this.c);
                    break;
                }
                break;
        }
    }
}
