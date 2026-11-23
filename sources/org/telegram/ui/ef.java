package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ef implements org.telegram.messenger.z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ef(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.z10
    public final Object a(Object obj) {
        switch (this.a) {
            case 0:
                bn bnVar = (bn) this.b;
                View view = (View) this.c;
                bnVar.l8((URLSpan) obj, false, bnVar.v5, view instanceof org.telegram.ui.Cells.r1 ? (org.telegram.ui.Cells.r1) view : null);
                return Boolean.TRUE;
            default:
                return th.c.d((View) obj, (String) this.b, (String) this.c, null, null);
        }
    }
}
