package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hf implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ hf(bn bnVar, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = bnVar;
        this.c = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                bn bnVar = this.b;
                xh xhVar = new xh(bnVar, bnVar, bnVar.getParentActivity(), bnVar.Ba, this.c);
                boolean V9 = bnVar.V9();
                xhVar.i0 = V9;
                xhVar.n = V9;
                xhVar.p0 = false;
                bnVar.P7(false);
                bnVar.showDialog(xhVar);
                break;
            default:
                bn bnVar2 = this.b;
                if (bnVar2.getParentActivity() != null && bnVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.ev(bnVar2, bnVar2.getParentActivity(), bnVar2.Ba, this.c).show();
                    bnVar2.P7(true);
                    break;
                }
                break;
        }
    }
}
