package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ao implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ eo b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ ao(eo eoVar, TLRPC.Document document, int i10) {
        this.a = i10;
        this.b = eoVar;
        this.c = document;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                co coVar = this.b.d;
                if (coVar != null) {
                    coVar.b(this.c);
                    break;
                }
                break;
            default:
                co coVar2 = this.b.d;
                if (coVar2 != null) {
                    coVar2.b(this.c);
                    break;
                }
                break;
        }
    }
}
