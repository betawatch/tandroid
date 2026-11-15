package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class un implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ un(xn xnVar, TLRPC.Document document, int i7) {
        this.a = i7;
        this.b = xnVar;
        this.c = document;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                wn wnVar = this.b.d;
                if (wnVar != null) {
                    wnVar.c(this.c);
                    break;
                }
                break;
            default:
                wn wnVar2 = this.b.d;
                if (wnVar2 != null) {
                    wnVar2.c(this.c);
                    break;
                }
                break;
        }
    }
}
