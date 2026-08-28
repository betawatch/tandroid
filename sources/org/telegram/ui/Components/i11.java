package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i11 implements td.b, Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ b21 a;

    public /* synthetic */ i11(b21 b21Var) {
        this.a = b21Var;
    }

    @Override // td.b
    public void J0(int i9, float f10, float f11, td.c cVar) {
        this.a.g();
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(b21.c(this.a, (l41) obj, (View) obj2));
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        b21.a(this.a, (l41) obj);
    }

    @Override // td.b
    public /* synthetic */ void B(float f10, int i9) {
    }
}
