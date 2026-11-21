package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class nx extends c5.a {
    public final /* synthetic */ ty c;

    public nx(ty tyVar) {
        this.c = tyVar;
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
            return org.telegram.messenger.gd.N0(2131751184, null);
        }
        if (i7 == 1) {
            return org.telegram.messenger.gd.N0(2131754879, null);
        }
        if (i7 != 2) {
            return null;
        }
        return org.telegram.messenger.gd.N0(2131754755, null);
    }

    @Override // c5.a
    public final Object e(c5.l lVar, int i7) {
        FrameLayout frameLayout = ((py) this.c.e.get(i7)).b;
        lVar.addView(frameLayout);
        return frameLayout;
    }

    @Override // c5.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
