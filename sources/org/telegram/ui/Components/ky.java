package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ky extends a5.a implements vd0 {
    public final /* synthetic */ sz c;

    public ky(sz szVar) {
        this.c = szVar;
    }

    @Override // a5.a
    public final void a(a5.m mVar, Object obj) {
        mVar.removeView((View) obj);
    }

    @Override // a5.a
    public final int b() {
        return this.c.e.size();
    }

    @Override // a5.a
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

    @Override // a5.a
    public final Object e(a5.m mVar, int i10) {
        FrameLayout frameLayout = ((oz) this.c.e.get(i10)).b;
        mVar.addView(frameLayout);
        return frameLayout;
    }

    @Override // a5.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
