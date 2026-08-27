package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tn implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ tn(wn wnVar, TLRPC.Document document, int i10) {
        this.a = i10;
        this.b = wnVar;
        this.c = document;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                vn vnVar = this.b.d;
                if (vnVar != null) {
                    vnVar.d(this.c);
                    break;
                }
                break;
            default:
                vn vnVar2 = this.b.d;
                if (vnVar2 != null) {
                    vnVar2.d(this.c);
                    break;
                }
                break;
        }
    }
}
