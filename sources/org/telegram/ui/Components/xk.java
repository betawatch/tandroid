package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xk implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ gl b;

    public /* synthetic */ xk(gl glVar, int i10) {
        this.a = i10;
        this.b = glVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                gl.K(this.b, (IMapsProvider.IMap) obj);
                break;
            default:
                gl.R(this.b, (Location) obj);
                break;
        }
    }
}
