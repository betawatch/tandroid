package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class lx extends c5.a {
    public final /* synthetic */ ry c;

    public lx(ry ryVar) {
        this.c = ryVar;
    }

    @Override // c5.a
    public final void a(c5.l lVar, Object obj) {
        lVar.removeView((View) obj);
    }

    @Override // c5.a
    public final int b() {
        return this.c.e.size();
    }

    @Override // c5.a
    public final CharSequence d(int i7) {
        if (i7 == 0) {
            return org.telegram.messenger.gd.M0(2131751185, null);
        }
        if (i7 == 1) {
            return org.telegram.messenger.gd.M0(2131754879, null);
        }
        if (i7 != 2) {
            return null;
        }
        return org.telegram.messenger.gd.M0(2131754756, null);
    }

    @Override // c5.a
    public final Object e(c5.l lVar, int i7) {
        FrameLayout frameLayout = ((ny) this.c.e.get(i7)).b;
        lVar.addView(frameLayout);
        return frameLayout;
    }

    @Override // c5.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
