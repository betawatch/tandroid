package hh;

import android.graphics.RectF;
import android.view.View;
import java.util.WeakHashMap;
import r0.a0;
import r0.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ h(i iVar, int i10) {
        this.a = i10;
        this.b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        i iVar = this.b;
        switch (i10) {
            case 0:
                if (iVar.w != 0) {
                    iVar.i(false);
                    break;
                }
                break;
            default:
                int i11 = iVar.G - 1;
                iVar.G = i11;
                if (i11 == 0) {
                    View view = iVar.E;
                    RectF rectF = e.e;
                    WeakHashMap weakHashMap = h0.a;
                    iVar.k(e.e1(a0.a(view), view, view.getRootView()), false);
                    break;
                }
                break;
        }
    }
}
