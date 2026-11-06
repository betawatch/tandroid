package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mn implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ pn b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ mn(pn pnVar, TLRPC.Document document, int i7) {
        this.a = i7;
        this.b = pnVar;
        this.c = document;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                on onVar = this.b.d;
                if (onVar != null) {
                    onVar.b(this.c);
                    break;
                }
                break;
            default:
                on onVar2 = this.b.d;
                if (onVar2 != null) {
                    onVar2.b(this.c);
                    break;
                }
                break;
        }
    }
}
