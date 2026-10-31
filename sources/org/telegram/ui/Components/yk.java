package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class yk extends FrameLayout {
    public final HashMap a;
    public final /* synthetic */ bl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yk(bl blVar, Context context) {
        super(context);
        this.b = blVar;
        this.a = new HashMap();
    }

    public final void a() {
        org.telegram.messenger.ga gaVar = this.b.F;
        if (gaVar == null) {
            return;
        }
        n2.u g10 = gaVar.g();
        for (Map.Entry entry : this.a.entrySet()) {
            org.telegram.messenger.fa faVar = (org.telegram.messenger.fa) entry.getKey();
            View view = (View) entry.getValue();
            Point a02 = g10.a0(faVar.a());
            view.setTranslationX(a02.x - (view.getMeasuredWidth() / 2));
            view.setTranslationY(org.telegram.messenger.i0.L(22.0f) + (a02.y - view.getMeasuredHeight()));
        }
    }
}
