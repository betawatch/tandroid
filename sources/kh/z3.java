package kh;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z3 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z3(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.a) {
            case 0:
                ((b4) this.b).d();
                break;
            default:
                xe.d dVar = (xe.d) this.b;
                View view = dVar.j;
                if (view != null) {
                    dVar.e(view);
                    break;
                }
                break;
        }
    }
}
