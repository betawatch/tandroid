package org.telegram.ui.Cells;

import android.view.View;
import c8.ya;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.y80;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class t extends ck0 implements fs {
    public ArrayList f3;
    public v4.c0 g3;
    public int h3;

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.j5) {
            z1();
        }
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.e().c(this, ks.j5);
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.e().n(this, ks.j5);
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        a0();
    }

    public final void z1() {
        ArrayList arrayList = this.f3;
        arrayList.clear();
        arrayList.addAll(Arrays.asList(y80.values()));
        if (mp.u1(this.h3).K3()) {
            int i7 = 0;
            while (i7 < arrayList.size()) {
                if (((y80) arrayList.get(i7)).e) {
                    arrayList.remove(i7);
                    i7--;
                }
                i7++;
            }
        }
        getAdapter().f();
        a0();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (ya.a((y80) arrayList.get(i10))) {
                this.g3.h1(i10, org.telegram.messenger.g0.L(16.0f));
                return;
            }
        }
    }
}
