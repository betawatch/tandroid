package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fo implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ io b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ fo(io ioVar, TLRPC.Document document, int i10) {
        this.a = i10;
        this.b = ioVar;
        this.c = document;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ho hoVar = this.b.d;
                if (hoVar != null) {
                    hoVar.d(this.c);
                    break;
                }
                break;
            default:
                ho hoVar2 = this.b.d;
                if (hoVar2 != null) {
                    hoVar2.d(this.c);
                    break;
                }
                break;
        }
    }
}
