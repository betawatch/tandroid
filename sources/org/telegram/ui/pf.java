package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pf implements Utilities.CallbackReturn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pf(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.Utilities.CallbackReturn
    public final Object run(Object obj) {
        switch (this.a) {
            case 0:
                xn xnVar = (xn) this.b;
                View view = (View) this.c;
                xnVar.U7((URLSpan) obj, false, xnVar.a5, view instanceof org.telegram.ui.Cells.t1 ? (org.telegram.ui.Cells.t1) view : null);
                return Boolean.TRUE;
            default:
                return eh.c.d((View) obj, (String) this.b, (String) this.c, null, null);
        }
    }
}
