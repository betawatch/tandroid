package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r21 implements le.e, Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ m31 a;

    public /* synthetic */ r21(m31 m31Var) {
        this.a = m31Var;
    }

    @Override // le.e
    public void D(int i10, float f7, float f10, le.f fVar) {
        this.a.g();
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(m31.c(this.a, (x51) obj, (View) obj2));
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        m31.a(this.a, (x51) obj);
    }

    @Override // le.e
    public /* synthetic */ void C(float f7, int i10) {
    }
}
