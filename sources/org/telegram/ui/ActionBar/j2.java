package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.pc;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class j2 implements nb {
    public final /* synthetic */ p2 a;

    public j2(p2 p2Var) {
        this.a = p2Var;
    }

    @Override // org.telegram.ui.Components.nb
    public final /* synthetic */ boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.nb
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.nb
    public final int f(int i10) {
        if (this.a.isSupportEdgeToEdge()) {
            return AndroidUtilities.navigationBarHeight;
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.nb
    public final /* synthetic */ boolean g(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Components.nb
    public final /* synthetic */ int h(int i10) {
        return 0;
    }

    @Override // org.telegram.ui.Components.nb
    public final /* synthetic */ void b(pc pcVar) {
    }

    @Override // org.telegram.ui.Components.nb
    public final /* synthetic */ void c(float f7) {
    }

    @Override // org.telegram.ui.Components.nb
    public final /* synthetic */ void d(pc pcVar) {
    }
}
