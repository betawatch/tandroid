package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class zw extends c5.a {
    public final /* synthetic */ gy c;

    public zw(gy gyVar) {
        this.c = gyVar;
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
            return org.telegram.messenger.hd.M0(2131751197, null);
        }
        if (i7 == 1) {
            return org.telegram.messenger.hd.M0(2131754879, null);
        }
        if (i7 != 2) {
            return null;
        }
        return org.telegram.messenger.hd.M0(2131754756, null);
    }

    @Override // c5.a
    public final Object e(c5.k kVar, int i7) {
        FrameLayout frameLayout = ((cy) this.c.e.get(i7)).b;
        kVar.addView(frameLayout);
        return frameLayout;
    }

    @Override // c5.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
