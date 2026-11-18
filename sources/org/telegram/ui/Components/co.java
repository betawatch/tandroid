package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
