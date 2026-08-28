package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class px extends m2.a implements ic0 {
    public final /* synthetic */ wy c;

    public px(wy wyVar) {
        this.c = wyVar;
    }

    @Override // m2.a
    public final void a(m2.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override // m2.a
    public final int b() {
        return this.c.e.size();
    }

    @Override // m2.a
    public final CharSequence d(int i9) {
        if (i9 == 0) {
            return LocaleController.getString(R.string.Emoji);
        }
        if (i9 == 1) {
            return LocaleController.getString(R.string.AccDescrGIFs);
        }
        if (i9 != 2) {
            return null;
        }
        return LocaleController.getString(R.string.AccDescrStickers);
    }

    @Override // m2.a
    public final Object e(m2.g gVar, int i9) {
        FrameLayout frameLayout = ((sy) this.c.e.get(i9)).b;
        gVar.addView(frameLayout);
        return frameLayout;
    }

    @Override // m2.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
