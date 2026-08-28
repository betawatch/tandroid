package dh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ f(k kVar, int i9) {
        this.a = i9;
        this.b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k kVar = this.b;
                if (kVar.j.isEmpty()) {
                    kVar.i = true;
                    k.n = null;
                    j jVar = kVar.f;
                    if (jVar != null) {
                        jVar.a = false;
                        kVar.f = null;
                    }
                    kVar.d.removeView(kVar.e);
                    if (kVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) kVar.d.getParent()).removeView(kVar.d);
                        break;
                    }
                }
                break;
            default:
                ArrayList arrayList = this.b.j;
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    ((View) arrayList.get(i9)).invalidate();
                }
                break;
        }
    }
}
