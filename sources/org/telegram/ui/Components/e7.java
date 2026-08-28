package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e7 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e7(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f10, float f11) {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                ((c8) this.b).P.setBufferedProgress(f10 / 1000.0f);
                break;
            case 1:
                gc gcVar = (gc) this.b;
                gcVar.o = (int) f10;
                gcVar.l();
                break;
            case 2:
                if (Math.abs(f10) > ((lb) this.b).getWidth()) {
                    hVar.c();
                    break;
                }
                break;
            case 3:
                ki kiVar = (ki) ((gh.m3) this.b).d;
                ci ciVar = kiVar.v0;
                if (ciVar == kiVar.i0 || ciVar == kiVar.j0 || (kiVar.B && kiVar.p1 != null)) {
                    kiVar.a2(1);
                }
                kiVar.v0.k(kiVar.h2);
                viewGroup = ((org.telegram.ui.ActionBar.f3) kiVar).containerView;
                viewGroup.invalidate();
                break;
            default:
                ((jb0) this.b).z();
                break;
        }
    }
}
