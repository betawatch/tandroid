package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class u51 implements View.OnLayoutChangeListener {
    public Boolean a;
    public boolean b;
    public final /* synthetic */ h6.m c;

    public u51(h6.m mVar, View view) {
        this.c = mVar;
        r1.g gVar = new r1.g((Object) view, (r1.e) r1.g.p, 0.0f);
        mVar.c = gVar;
        gVar.m.a(1.0f);
        ((r1.g) mVar.c).m.b(350.0f);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        Point point = org.telegram.messenger.g0.q;
        boolean z10 = point.x > point.y;
        Boolean bool = this.a;
        if (bool == null || bool.booleanValue() != z10) {
            this.a = Boolean.valueOf(z10);
            this.b = true;
        }
        if (i14 == 0 || i14 == i10 || this.b) {
            this.b = false;
            return;
        }
        h6.m mVar = this.c;
        ((r1.g) mVar.c).d();
        if (view.getVisibility() != 0) {
            view.setTranslationY(0.0f);
            return;
        }
        ((r1.g) mVar.c).m.i = 0.0f;
        view.setTranslationY((i14 - i10) + 0.0f);
        ((r1.g) mVar.c).h();
    }
}
