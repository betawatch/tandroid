package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ly extends z4.a implements yd0 {
    public final /* synthetic */ tz c;

    public ly(tz tzVar) {
        this.c = tzVar;
    }

    @Override // z4.a
    public final void a(z4.h hVar, Object obj) {
        hVar.removeView((View) obj);
    }

    @Override // z4.a
    public final int b() {
        return this.c.e.size();
    }

    @Override // z4.a
    public final CharSequence d(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.Emoji);
        }
        if (i10 == 1) {
            return LocaleController.getString(R.string.AccDescrGIFs);
        }
        if (i10 != 2) {
            return null;
        }
        return LocaleController.getString(R.string.AccDescrStickers);
    }

    @Override // z4.a
    public final Object e(z4.h hVar, int i10) {
        FrameLayout frameLayout = ((pz) this.c.e.get(i10)).b;
        hVar.addView(frameLayout);
        return frameLayout;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
