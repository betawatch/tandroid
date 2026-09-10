package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class lo implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ oo b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ lo(oo ooVar, TLRPC.Document document, int i10) {
        this.a = i10;
        this.b = ooVar;
        this.c = document;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                no noVar = this.b.d;
                if (noVar != null) {
                    noVar.c(this.c);
                    break;
                }
                break;
            default:
                no noVar2 = this.b.d;
                if (noVar2 != null) {
                    noVar2.c(this.c);
                    break;
                }
                break;
        }
    }
}
