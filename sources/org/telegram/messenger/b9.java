package org.telegram.messenger;

import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class b9 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b9(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ((c9) this.b).I0();
                break;
            default:
                boolean[] zArr = (boolean[]) this.b;
                boolean z9 = !zArr[0];
                zArr[0] = z9;
                ((org.telegram.ui.Cells.c2) view).c(z9, true);
                break;
        }
    }
}
