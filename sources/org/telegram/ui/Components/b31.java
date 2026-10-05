package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b31 implements le.d, Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ w31 a;

    public /* synthetic */ b31(w31 w31Var) {
        this.a = w31Var;
    }

    @Override // le.d
    public void a0(int i10, float f7, float f10, le.e eVar) {
        this.a.g();
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(w31.c(this.a, (h61) obj, (View) obj2));
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        w31.a(this.a, (h61) obj);
    }

    @Override // le.d
    public /* synthetic */ void V(float f7, int i10) {
    }
}
