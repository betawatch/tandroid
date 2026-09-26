package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ho implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ko b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ ho(ko koVar, TLRPC.Document document, int i10) {
        this.a = i10;
        this.b = koVar;
        this.c = document;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                jo joVar = this.b.d;
                if (joVar != null) {
                    joVar.c(this.c);
                    break;
                }
                break;
            default:
                jo joVar2 = this.b.d;
                if (joVar2 != null) {
                    joVar2.c(this.c);
                    break;
                }
                break;
        }
    }
}
