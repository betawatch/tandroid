package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class s21 implements le.d, Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ n31 a;

    public /* synthetic */ s21(n31 n31Var) {
        this.a = n31Var;
    }

    @Override // le.d
    public void H(int i10, float f7, float f10, le.e eVar) {
        this.a.g();
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(n31.c(this.a, (y51) obj, (View) obj2));
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        n31.a(this.a, (y51) obj);
    }

    @Override // le.d
    public /* synthetic */ void C(float f7, int i10) {
    }
}
