package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ro implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vo b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ ro(vo voVar, TLRPC.Document document, int i10) {
        this.a = i10;
        this.b = voVar;
        this.c = document;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                uo uoVar = this.b.d;
                if (uoVar != null) {
                    uoVar.b(this.c);
                    break;
                }
                break;
            default:
                uo uoVar2 = this.b.d;
                if (uoVar2 != null) {
                    uoVar2.b(this.c);
                    break;
                }
                break;
        }
    }
}
