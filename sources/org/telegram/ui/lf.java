package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lf implements Utilities.CallbackReturn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lf(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.Utilities.CallbackReturn
    public final Object run(Object obj) {
        switch (this.a) {
            case 0:
                rn rnVar = (rn) this.b;
                View view = (View) this.c;
                rnVar.U7((URLSpan) obj, false, rnVar.Z4, view instanceof org.telegram.ui.Cells.s1 ? (org.telegram.ui.Cells.s1) view : null);
                return Boolean.TRUE;
            default:
                return ah.c.d((View) obj, (String) this.b, (String) this.c, null, null);
        }
    }
}
