package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u11 implements vd.b, Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ m21 a;

    public /* synthetic */ u11(m21 m21Var) {
        this.a = m21Var;
    }

    @Override // vd.b
    public void N(int i10, float f9, float f10, vd.c cVar) {
        this.a.g();
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(m21.c(this.a, (w41) obj, (View) obj2));
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        m21.a(this.a, (w41) obj);
    }

    @Override // vd.b
    public /* synthetic */ void z(float f9, int i10) {
    }
}
