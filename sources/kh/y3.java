package kh;

import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y3 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y3(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.a) {
            case 0:
                ((b4) this.b).d();
                break;
            default:
                sf.c cVar = (sf.c) this.b;
                cVar.c.setPivotX(r2.getMeasuredWidth() * 0.7f);
                cVar.b.setPivotX(r1.getMeasuredWidth() * 0.7f);
                break;
        }
    }
}
