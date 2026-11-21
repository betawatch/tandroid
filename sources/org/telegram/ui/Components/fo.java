package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fo implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ io b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ fo(io ioVar, TLRPC.Document document, int i7) {
        this.a = i7;
        this.b = ioVar;
        this.c = document;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ho hoVar = this.b.d;
                if (hoVar != null) {
                    hoVar.b(this.c);
                    break;
                }
                break;
            default:
                ho hoVar2 = this.b.d;
                if (hoVar2 != null) {
                    hoVar2.b(this.c);
                    break;
                }
                break;
        }
    }
}
