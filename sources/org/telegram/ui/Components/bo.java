package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class bo implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ bo(fo foVar, TLRPC.Document document, int i7) {
        this.a = i7;
        this.b = foVar;
        this.c = document;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                eo eoVar = this.b.d;
                if (eoVar != null) {
                    eoVar.c(this.c);
                    break;
                }
                break;
            default:
                eo eoVar2 = this.b.d;
                if (eoVar2 != null) {
                    eoVar2.c(this.c);
                    break;
                }
                break;
        }
    }
}
