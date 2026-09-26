package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p21 implements le.e, Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ k31 a;

    public /* synthetic */ p21(k31 k31Var) {
        this.a = k31Var;
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
        return Boolean.valueOf(k31.c(this.a, (v51) obj, (View) obj2));
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        k31.a(this.a, (v51) obj);
    }

    @Override // le.e
    public /* synthetic */ void C(float f7, int i10) {
    }
}
