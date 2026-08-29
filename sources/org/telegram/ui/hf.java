package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hf implements Utilities.CallbackReturn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hf(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.Utilities.CallbackReturn
    public final Object run(Object obj) {
        switch (this.a) {
            case 0:
                tn tnVar = (tn) this.b;
                View view = (View) this.c;
                tnVar.U7((URLSpan) obj, false, tnVar.Z4, view instanceof org.telegram.ui.Cells.s1 ? (org.telegram.ui.Cells.s1) view : null);
                return Boolean.TRUE;
            default:
                return ch.c.d((View) obj, (String) this.b, (String) this.c, null, null);
        }
    }
}
