package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class cf implements org.telegram.messenger.a20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cf(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.a20
    public final Object a(Object obj) {
        switch (this.a) {
            case 0:
                an anVar = (an) this.b;
                View view = (View) this.c;
                anVar.l8((URLSpan) obj, false, anVar.u5, view instanceof org.telegram.ui.Cells.q1 ? (org.telegram.ui.Cells.q1) view : null);
                return Boolean.TRUE;
            default:
                return th.c.d((View) obj, (String) this.b, (String) this.c, null, null);
        }
    }
}
