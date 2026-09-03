package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e21 implements xd.b, Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ w21 a;

    public /* synthetic */ e21(w21 w21Var) {
        this.a = w21Var;
    }

    @Override // xd.b
    public void L(int i10, float f10, float f11, xd.c cVar) {
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

    @Override // xd.b
    public /* synthetic */ void z(float f10, int i10) {
    }
}
