package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class cy extends m2.a implements ed0 {
    public final /* synthetic */ kz c;

    public cy(kz kzVar) {
        this.c = kzVar;
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
        FrameLayout frameLayout = ((gz) this.c.e.get(i10)).b;
        hVar.addView(frameLayout);
        return frameLayout;
    }

    @Override // m2.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
