package org.telegram.ui.Cells;

import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.w80;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class t extends pj0 implements ls {
    public ArrayList e3;
    public v4.b0 f3;
    public int g3;

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.h5) {
            z1();
        }
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.e().c(this, qs.h5);
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.e().n(this, qs.h5);
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        a0();
    }

    public final void z1() {
        ArrayList arrayList = this.e3;
        arrayList.clear();
        arrayList.addAll(Arrays.asList(w80.values()));
        if (qp.s1(this.g3).D3()) {
            int i7 = 0;
            while (i7 < arrayList.size()) {
                if (((w80) arrayList.get(i7)).e) {
                    arrayList.remove(i7);
                    i7--;
                }
                i7++;
            }
        }
        getAdapter().f();
        a0();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (c8.ua.a((w80) arrayList.get(i10))) {
                this.f3.h1(i10, org.telegram.messenger.g0.L(16.0f));
                return;
            }
        }
    }
}
