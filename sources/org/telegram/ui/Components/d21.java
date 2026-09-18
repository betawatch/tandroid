package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d21 implements le.d, Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ y21 a;

    public /* synthetic */ d21(y21 y21Var) {
        this.a = y21Var;
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
        return Boolean.valueOf(y21.c(this.a, (j51) obj, (View) obj2));
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        y21.a(this.a, (j51) obj);
    }

    @Override // le.d
    public /* synthetic */ void C(float f7, int i10) {
    }
}
