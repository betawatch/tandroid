package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zn implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ co b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ zn(co coVar, TLRPC.Document document, int i10) {
        this.a = i10;
        this.b = coVar;
        this.c = document;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                bo boVar = this.b.d;
                if (boVar != null) {
                    boVar.d(this.c);
                    break;
                }
                break;
            default:
                bo boVar2 = this.b.d;
                if (boVar2 != null) {
                    boVar2.d(this.c);
                    break;
                }
                break;
        }
    }
}
