package org.telegram.ui.Cells;

import android.view.View;
import c8.ya;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.gs;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.z80;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class t extends ek0 implements gs {
    public ArrayList f3;
    public v4.c0 g3;
    public int h3;

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.k5) {
            z1();
        }
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ls.e().c(this, ls.k5);
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ls.e().n(this, ls.k5);
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        a0();
    }

    public final void z1() {
        ArrayList arrayList = this.f3;
        arrayList.clear();
        arrayList.addAll(Arrays.asList(z80.values()));
        if (np.u1(this.h3).K3()) {
            int i7 = 0;
            while (i7 < arrayList.size()) {
                if (((z80) arrayList.get(i7)).e) {
                    arrayList.remove(i7);
                    i7--;
                }
                i7++;
            }
        }
        getAdapter().f();
        a0();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (ya.a((z80) arrayList.get(i10))) {
                this.g3.h1(i10, org.telegram.messenger.g0.L(16.0f));
                return;
            }
        }
    }
}
