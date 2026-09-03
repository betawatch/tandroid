package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class co implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ho b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ co(ho hoVar, TLRPC.Document document, int i10) {
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
