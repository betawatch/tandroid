package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wo implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zo b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ wo(zo zoVar, TLRPC.Document document, int i10) {
        this.a = i10;
        this.b = zoVar;
        this.c = document;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                yo yoVar = this.b.d;
                if (yoVar != null) {
                    yoVar.c(this.c);
                    break;
                }
                break;
            default:
                yo yoVar2 = this.b.d;
                if (yoVar2 != null) {
                    yoVar2.c(this.c);
                    break;
                }
                break;
        }
    }
}
