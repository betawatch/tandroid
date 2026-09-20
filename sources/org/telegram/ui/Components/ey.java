package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ey extends z4.a implements kd0 {
    public final /* synthetic */ kz c;

    public ey(kz kzVar) {
        this.c = kzVar;
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
        FrameLayout frameLayout = ((gz) this.c.e.get(i10)).b;
        gVar.addView(frameLayout);
        return frameLayout;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
