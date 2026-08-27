package cg;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.qk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o2 implements qk0, kt {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ KeyEvent.Callback c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o2(y2 y2Var, int i10, c6 c6Var, int i11) {
        this.c = y2Var;
        this.a = i10;
        this.d = c6Var;
        this.b = i11;
    }

    @Override // org.telegram.ui.Components.qk0
    public void c(float f10, float f11, int i10, View view) {
        y2.Q((y2) this.c, this.a, (c6) this.d, this.b, view);
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.kt
    public void run(String str) {
        lt.k((lt) this.c, this.a, this.b, (Runnable) this.d, str);
    }

    public /* synthetic */ o2(lt ltVar, int i10, int i11, Runnable runnable) {
        this.c = ltVar;
        this.a = i10;
        this.b = i11;
        this.d = runnable;
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ void c0(View view, float f10, float f11) {
    }
}
