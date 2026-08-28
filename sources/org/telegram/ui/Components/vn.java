package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vn implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yn b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ vn(yn ynVar, TLRPC.Document document, int i9) {
        this.a = i9;
        this.b = ynVar;
        this.c = document;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                xn xnVar = this.b.d;
                if (xnVar != null) {
                    xnVar.d(this.c);
                    break;
                }
                break;
            default:
                xn xnVar2 = this.b.d;
                if (xnVar2 != null) {
                    xnVar2.d(this.c);
                    break;
                }
                break;
        }
    }
}
