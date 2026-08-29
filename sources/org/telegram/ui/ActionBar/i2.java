package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.mc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class i2 implements kb {
    public final /* synthetic */ o2 a;

    public i2(o2 o2Var) {
        this.a = o2Var;
    }

    @Override // org.telegram.ui.Components.kb
    public final /* synthetic */ boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.kb
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.kb
    public final int f(int i10) {
        if (this.a.isSupportEdgeToEdge()) {
            return AndroidUtilities.navigationBarHeight;
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.kb
    public final /* synthetic */ boolean g(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Components.kb
    public final /* synthetic */ int h(int i10) {
        return 0;
    }

    @Override // org.telegram.ui.Components.kb
    public final /* synthetic */ void b(mc mcVar) {
    }

    @Override // org.telegram.ui.Components.kb
    public final /* synthetic */ void c(float f9) {
    }

    @Override // org.telegram.ui.Components.kb
    public final /* synthetic */ void d(mc mcVar) {
    }
}
