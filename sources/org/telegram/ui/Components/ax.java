package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class ax extends c5.a {
    public final /* synthetic */ hy c;

    public ax(hy hyVar) {
        this.c = hyVar;
    }

    @Override // c5.a
    public final void a(c5.k kVar, Object obj) {
        kVar.removeView((View) obj);
    }

    @Override // c5.a
    public final int b() {
        return this.c.e.size();
    }

    @Override // c5.a
    public final CharSequence d(int i7) {
        if (i7 == 0) {
            return org.telegram.messenger.id.M0(2131751197, null);
        }
        if (i7 == 1) {
            return org.telegram.messenger.id.M0(2131754879, null);
        }
        if (i7 != 2) {
            return null;
        }
        return org.telegram.messenger.id.M0(2131754756, null);
    }

    @Override // c5.a
    public final Object e(c5.k kVar, int i7) {
        FrameLayout frameLayout = ((dy) this.c.e.get(i7)).b;
        kVar.addView(frameLayout);
        return frameLayout;
    }

    @Override // c5.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
