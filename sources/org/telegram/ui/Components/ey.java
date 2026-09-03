package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ey extends m2.a implements fd0 {
    public final /* synthetic */ mz c;

    public ey(mz mzVar) {
        this.c = mzVar;
    }

    @Override // m2.a
    public final void a(m2.h hVar, Object obj) {
        hVar.removeView((View) obj);
    }

    @Override // m2.a
    public final int b() {
        return this.c.e.size();
    }

    @Override // m2.a
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

    @Override // m2.a
    public final Object e(m2.h hVar, int i10) {
        FrameLayout frameLayout = ((iz) this.c.e.get(i10)).b;
        hVar.addView(frameLayout);
        return frameLayout;
    }

    @Override // m2.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
