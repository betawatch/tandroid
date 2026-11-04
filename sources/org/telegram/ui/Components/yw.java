package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class yw extends b5.a {
    public final /* synthetic */ ey c;

    public yw(ey eyVar) {
        this.c = eyVar;
    }

    @Override // b5.a
    public final void a(b5.l lVar, Object obj) {
        lVar.removeView((View) obj);
    }

    @Override // b5.a
    public final int b() {
        return this.c.e.size();
    }

    @Override // b5.a
    public final CharSequence d(int i3) {
        if (i3 == 0) {
            return org.telegram.messenger.bd.M0(2131751197, null);
        }
        if (i3 == 1) {
            return org.telegram.messenger.bd.M0(2131754879, null);
        }
        if (i3 != 2) {
            return null;
        }
        return org.telegram.messenger.bd.M0(2131754756, null);
    }

    @Override // b5.a
    public final Object e(b5.l lVar, int i3) {
        FrameLayout frameLayout = ((zx) this.c.e.get(i3)).b;
        lVar.addView(frameLayout);
        return frameLayout;
    }

    @Override // b5.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
