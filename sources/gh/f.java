package gh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ f(j jVar, int i10) {
        this.a = i10;
        this.b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j jVar = this.b;
                if (jVar.j.isEmpty()) {
                    jVar.i = true;
                    j.n = null;
                    i iVar = jVar.f;
                    if (iVar != null) {
                        iVar.a = false;
                        jVar.f = null;
                    }
                    jVar.d.removeView(jVar.e);
                    if (jVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) jVar.d.getParent()).removeView(jVar.d);
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
