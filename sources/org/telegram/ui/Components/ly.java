package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class ly extends z4.a implements vd0 {
    public final /* synthetic */ tz c;

    public ly(tz tzVar) {
        this.c = tzVar;
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
    public final Object e(z4.g gVar, int i10) {
        FrameLayout frameLayout = ((pz) this.c.e.get(i10)).b;
        gVar.addView(frameLayout);
        return frameLayout;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
