package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class go implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ jo b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ go(jo joVar, TLRPC.Document document, int i10) {
        this.a = i10;
        this.b = joVar;
        this.c = document;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                io ioVar = this.b.d;
                if (ioVar != null) {
                    ioVar.c(this.c);
                    break;
                }
                break;
            default:
                io ioVar2 = this.b.d;
                if (ioVar2 != null) {
                    ioVar2.c(this.c);
                    break;
                }
                break;
        }
    }
}
