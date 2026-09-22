package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c21 implements le.d, Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ x21 a;

    public /* synthetic */ c21(x21 x21Var) {
        this.a = x21Var;
    }

    @Override // le.d
    public void D(int i10, float f7, float f10, le.e eVar) {
        this.a.g();
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(x21.c(this.a, (i51) obj, (View) obj2));
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        x21.a(this.a, (i51) obj);
    }

    @Override // le.d
    public /* synthetic */ void C(float f7, int i10) {
    }
}
