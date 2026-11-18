package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class co implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ go b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ co(go goVar, TLRPC.Document document, int i7) {
        this.a = i7;
        this.b = goVar;
        this.c = document;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                fo foVar = this.b.d;
                if (foVar != null) {
                    foVar.b(this.c);
                    break;
                }
                break;
            default:
                fo foVar2 = this.b.d;
                if (foVar2 != null) {
                    foVar2.b(this.c);
                    break;
                }
                break;
        }
    }
}
