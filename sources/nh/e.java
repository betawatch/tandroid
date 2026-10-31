package nh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;

    public /* synthetic */ e(h hVar, int i10) {
        this.a = i10;
        this.b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h hVar = this.b;
                if (hVar.j.isEmpty()) {
                    hVar.i = true;
                    h.n = null;
                    g gVar = hVar.f;
                    if (gVar != null) {
                        gVar.a = false;
                        hVar.f = null;
                    }
                    hVar.d.removeView(hVar.e);
                    if (hVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) hVar.d.getParent()).removeView(hVar.d);
                        break;
                    }
                }
                break;
            default:
                ArrayList arrayList = this.b.j;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).invalidate();
                }
                break;
        }
    }
}
