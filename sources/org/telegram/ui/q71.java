package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q71 implements Utilities.Callback5, Utilities.Callback5Return, r0.o {
    public final /* synthetic */ z71 a;

    public /* synthetic */ q71(z71 z71Var) {
        this.a = z71Var;
    }

    @Override // r0.o
    public r0.m1 L0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        int i9 = defaultWindowInsets.d;
        z71 z71Var = this.a;
        z71Var.O = i9;
        z71Var.c.setPadding(0, AndroidUtilities.dp(12.0f) + defaultWindowInsets.b, 0, z71Var.O + z71Var.P);
        return r0.m1.b;
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(z71.T(this.a, (org.telegram.ui.Components.l41) obj, (View) obj2));
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        z71.d0(this.a, (org.telegram.ui.Components.l41) obj);
    }
}
