package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
