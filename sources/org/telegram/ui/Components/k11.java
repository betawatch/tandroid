package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k11 implements ud.b, Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ d21 a;

    public /* synthetic */ k11(d21 d21Var) {
        this.a = d21Var;
    }

    @Override // ud.b
    public void o(int i10, float f10, float f11, ud.c cVar) {
        this.a.g();
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(d21.c(this.a, (n41) obj, (View) obj2));
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        d21.a(this.a, (n41) obj);
    }

    @Override // ud.b
    public /* synthetic */ void A(float f10, int i10) {
    }
}
