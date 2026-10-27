package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n31 implements oe.d, Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ f41 a;

    @Override // oe.d
    public void E(int i10, float f7, float f10, oe.e eVar) {
        this.a.h();
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(f41.c(this.a, (u61) obj, (View) obj2));
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        f41.a(this.a, (u61) obj);
    }

    @Override // oe.d
    public /* synthetic */ void z(float f7, int i10) {
    }
}
