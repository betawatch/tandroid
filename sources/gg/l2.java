package gg;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.tt;
import org.telegram.ui.Components.ut;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l2 implements il0, tt {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ KeyEvent.Callback c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l2(v2 v2Var, int i10, f6 f6Var, int i11) {
        this.c = v2Var;
        this.a = i10;
        this.d = f6Var;
        this.b = i11;
    }

    @Override // org.telegram.ui.Components.il0
    public /* synthetic */ boolean Z0(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.il0
    public void c(float f10, float f11, int i10, View view) {
        v2.Q((v2) this.c, this.a, (f6) this.d, this.b, view);
    }

    @Override // org.telegram.ui.Components.tt
    public void run(String str) {
        ut.k((ut) this.c, this.a, this.b, (Runnable) this.d, str);
    }

    public /* synthetic */ l2(ut utVar, int i10, int i11, Runnable runnable) {
        this.c = utVar;
        this.a = i10;
        this.b = i11;
        this.d = runnable;
    }

    @Override // org.telegram.ui.Components.il0
    public /* synthetic */ void n0(View view, float f10, float f11) {
    }
}
