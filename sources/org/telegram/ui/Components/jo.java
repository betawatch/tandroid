package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class jo implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ mo b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ jo(mo moVar, TLRPC.Document document, int i10) {
        this.a = i10;
        this.b = moVar;
        this.c = document;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                lo loVar = this.b.d;
                if (loVar != null) {
                    loVar.b(this.c);
                    break;
                }
                break;
            default:
                lo loVar2 = this.b.d;
                if (loVar2 != null) {
                    loVar2.b(this.c);
                    break;
                }
                break;
        }
    }
}
