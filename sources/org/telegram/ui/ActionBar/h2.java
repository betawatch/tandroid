package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mb;
import org.telegram.ui.Components.oc;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class h2 implements mb {
    public final /* synthetic */ n2 a;

    public h2(n2 n2Var) {
        this.a = n2Var;
    }

    @Override // org.telegram.ui.Components.mb
    public final /* synthetic */ boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.mb
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.mb
    public final int f(int i10) {
        if (this.a.isSupportEdgeToEdge()) {
            return AndroidUtilities.navigationBarHeight;
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.mb
    public final /* synthetic */ boolean g(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Components.mb
    public final /* synthetic */ int h(int i10) {
        return 0;
    }

    @Override // org.telegram.ui.Components.mb
    public final /* synthetic */ void b(oc ocVar) {
    }

    @Override // org.telegram.ui.Components.mb
    public final /* synthetic */ void c(float f7) {
    }

    @Override // org.telegram.ui.Components.mb
    public final /* synthetic */ void d(oc ocVar) {
    }
}
