package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pb;
import org.telegram.ui.Components.rc;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class h2 implements pb {
    public final /* synthetic */ n2 a;

    public h2(n2 n2Var) {
        this.a = n2Var;
    }

    @Override // org.telegram.ui.Components.pb
    public final /* synthetic */ boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.pb
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.pb
    public final int f(int i10) {
        if (this.a.isSupportEdgeToEdge()) {
            return AndroidUtilities.navigationBarHeight;
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.pb
    public final /* synthetic */ boolean g(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Components.pb
    public final /* synthetic */ int h(int i10) {
        return 0;
    }

    @Override // org.telegram.ui.Components.pb
    public final /* synthetic */ void b(rc rcVar) {
    }

    @Override // org.telegram.ui.Components.pb
    public final /* synthetic */ void c(float f7) {
    }

    @Override // org.telegram.ui.Components.pb
    public final /* synthetic */ void d(rc rcVar) {
    }
}
