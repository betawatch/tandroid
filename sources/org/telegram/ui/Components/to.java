package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class to implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wo b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ to(wo woVar, TLRPC.Document document, int i10) {
        this.a = i10;
        this.b = woVar;
        this.c = document;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                vo voVar = this.b.d;
                if (voVar != null) {
                    voVar.d(this.c);
                    break;
                }
                break;
            default:
                vo voVar2 = this.b.d;
                if (voVar2 != null) {
                    voVar2.d(this.c);
                    break;
                }
                break;
        }
    }
}
