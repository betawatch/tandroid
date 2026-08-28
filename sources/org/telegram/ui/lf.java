package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lf implements Utilities.CallbackReturn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lf(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.Utilities.CallbackReturn
    public final Object run(Object obj) {
        switch (this.a) {
            case 0:
                qn qnVar = (qn) this.b;
                View view = (View) this.c;
                qnVar.U7((URLSpan) obj, false, qnVar.Z4, view instanceof org.telegram.ui.Cells.t1 ? (org.telegram.ui.Cells.t1) view : null);
                return Boolean.TRUE;
            default:
                return zg.c.d((View) obj, (String) this.b, (String) this.c, null, null);
        }
    }
}
