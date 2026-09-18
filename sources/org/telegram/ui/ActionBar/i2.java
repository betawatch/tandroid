package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mb;
import org.telegram.ui.Components.oc;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class i2 implements mb {
    public final /* synthetic */ o2 a;

    public i2(o2 o2Var) {
        this.a = o2Var;
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
