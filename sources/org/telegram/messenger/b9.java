package org.telegram.messenger;

import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
