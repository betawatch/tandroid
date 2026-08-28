package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.gc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i2 implements fb {
    public final /* synthetic */ o2 a;

    public i2(o2 o2Var) {
        this.a = o2Var;
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.fb
    public final int f(int i9) {
        if (this.a.isSupportEdgeToEdge()) {
            return AndroidUtilities.navigationBarHeight;
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ boolean g(int i9) {
        return false;
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ int h(int i9) {
        return 0;
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ void b(gc gcVar) {
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ void c(float f10) {
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ void d(gc gcVar) {
    }
}
