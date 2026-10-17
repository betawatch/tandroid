package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x21 implements ne.d, Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ q31 a;

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(q31.c(this.a, (f61) obj, (View) obj2));
    }

    @Override // ne.d
    public void u(int i10, float f7, float f10, ne.e eVar) {
        this.a.g();
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        q31.a(this.a, (f61) obj);
    }

    @Override // ne.d
    public /* synthetic */ void E(float f7, int i10) {
    }
}
