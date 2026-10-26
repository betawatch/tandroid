package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m31 implements oe.d, Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ e41 a;

    @Override // oe.d
    public void E(int i10, float f7, float f10, oe.e eVar) {
        this.a.h();
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(e41.c(this.a, (t61) obj, (View) obj2));
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        e41.a(this.a, (t61) obj);
    }

    @Override // oe.d
    public /* synthetic */ void z(float f7, int i10) {
    }
}
