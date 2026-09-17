package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b21 implements le.d, Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ w21 a;

    public /* synthetic */ b21(w21 w21Var) {
        this.a = w21Var;
    }

    @Override // le.d
    public void E(int i10, float f7, float f10, le.e eVar) {
        this.a.g();
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(w21.c(this.a, (h51) obj, (View) obj2));
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        w21.a(this.a, (h51) obj);
    }

    @Override // le.d
    public /* synthetic */ void z(float f7, int i10) {
    }
}
