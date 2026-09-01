package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eo implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ho b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ eo(ho hoVar, TLRPC.Document document, int i10) {
        this.a = i10;
        this.b = hoVar;
        this.c = document;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                go goVar = this.b.d;
                if (goVar != null) {
                    goVar.b(this.c);
                    break;
                }
                break;
            default:
                go goVar2 = this.b.d;
                if (goVar2 != null) {
                    goVar2.b(this.c);
                    break;
                }
                break;
        }
    }
}
