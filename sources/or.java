// default package

import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class or extends o39 implements gk7 {
    public ArrayList f3;
    public t26 g3;
    public int h3;

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.j5) {
            z1();
        }
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.e().b(this, kk7.j5);
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.e().n(this, kk7.j5);
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), i2);
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        b0();
    }

    public final void z1() {
        ArrayList arrayList = this.f3;
        arrayList.clear();
        arrayList.addAll(Arrays.asList(c06.values()));
        if (na7.q1(this.h3).F3()) {
            int i = 0;
            while (i < arrayList.size()) {
                if (((c06) arrayList.get(i)).e) {
                    arrayList.remove(i);
                    i--;
                }
                i++;
            }
        }
        getAdapter().f();
        b0();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (jme.a((c06) arrayList.get(i2))) {
                this.g3.g1(i2, gl.L(16.0f));
                return;
            }
        }
    }
}
