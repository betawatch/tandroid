package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nf implements Utilities.CallbackReturn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nf(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.Utilities.CallbackReturn
    public final Object run(Object obj) {
        switch (this.a) {
            case 0:
                wn wnVar = (wn) this.b;
                View view = (View) this.c;
                wnVar.d8((URLSpan) obj, false, wnVar.t5, view instanceof org.telegram.ui.Cells.s1 ? (org.telegram.ui.Cells.s1) view : null);
                return Boolean.TRUE;
            default:
                return th.c.d((View) obj, (String) this.b, (String) this.c, null, null);
        }
    }
}
