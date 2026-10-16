package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bg implements Utilities.CallbackReturn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bg(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.Utilities.CallbackReturn
    public final Object run(Object obj) {
        switch (this.a) {
            case 0:
                fo foVar = (fo) this.b;
                View view = (View) this.c;
                foVar.X7((URLSpan) obj, false, foVar.d5, view instanceof org.telegram.ui.Cells.u1 ? (org.telegram.ui.Cells.u1) view : null);
                return Boolean.TRUE;
            default:
                return sh.c.d((View) obj, (String) this.b, (String) this.c, null, null);
        }
    }
}
