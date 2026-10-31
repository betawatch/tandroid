package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ox extends z4.a {
    public final /* synthetic */ vy c;

    public ox(vy vyVar) {
        this.c = vyVar;
    }

    @Override // z4.a
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override // z4.a
    public final int b() {
        return this.c.e.size();
    }

    @Override // z4.a
    public final CharSequence d(int i10) {
        if (i10 == 0) {
            return org.telegram.messenger.cd.L0(2131751197, null);
        }
        if (i10 == 1) {
            return org.telegram.messenger.cd.L0(2131754879, null);
        }
        if (i10 != 2) {
            return null;
        }
        return org.telegram.messenger.cd.L0(2131754756, null);
    }

    @Override // z4.a
    public final Object e(z4.g gVar, int i10) {
        FrameLayout frameLayout = ((ry) this.c.e.get(i10)).b;
        gVar.addView(frameLayout);
        return frameLayout;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
