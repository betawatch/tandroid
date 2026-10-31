package org.telegram.ui.Cells;

import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.ba0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t extends tk0 implements us {
    public ArrayList e3;
    public s4.a0 f3;
    public int g3;

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.h5) {
            z1();
        }
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zs.e().c(this, zs.h5);
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zs.e().n(this, zs.h5);
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a0();
    }

    public final void z1() {
        ArrayList arrayList = this.e3;
        arrayList.clear();
        arrayList.addAll(Arrays.asList(ba0.values()));
        if (vp.r1(this.g3).A3()) {
            int i10 = 0;
            while (i10 < arrayList.size()) {
                if (((ba0) arrayList.get(i10)).e) {
                    arrayList.remove(i10);
                    i10--;
                }
                i10++;
            }
        }
        getAdapter().f();
        a0();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (w7.j6.a((ba0) arrayList.get(i11))) {
                this.f3.h1(i11, org.telegram.messenger.i0.L(16.0f));
                return;
            }
        }
    }
}
