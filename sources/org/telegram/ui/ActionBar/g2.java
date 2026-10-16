package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qb;
import org.telegram.ui.Components.sc;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class g2 implements qb {
    public final /* synthetic */ m2 a;

    public g2(m2 m2Var) {
        this.a = m2Var;
    }

    @Override // org.telegram.ui.Components.qb
    public final /* synthetic */ boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.qb
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.qb
    public final int f(int i10) {
        if (this.a.isSupportEdgeToEdge()) {
            return AndroidUtilities.navigationBarHeight;
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.qb
    public final /* synthetic */ boolean g(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Components.qb
    public final /* synthetic */ int h(int i10) {
        return 0;
    }

    @Override // org.telegram.ui.Components.qb
    public final /* synthetic */ void b(sc scVar) {
    }

    @Override // org.telegram.ui.Components.qb
    public final /* synthetic */ void c(float f7) {
    }

    @Override // org.telegram.ui.Components.qb
    public final /* synthetic */ void d(sc scVar) {
    }
}
