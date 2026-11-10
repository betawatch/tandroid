package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ff implements org.telegram.messenger.d20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ff(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.d20
    public final Object a(Object obj) {
        switch (this.a) {
            case 0:
                cn cnVar = (cn) this.b;
                View view = (View) this.c;
                cnVar.k8((URLSpan) obj, false, cnVar.t5, view instanceof org.telegram.ui.Cells.q1 ? (org.telegram.ui.Cells.q1) view : null);
                return Boolean.TRUE;
            default:
                return th.c.d((View) obj, (String) this.b, (String) this.c, null, null);
        }
    }
}
