package kh;

import android.view.View;
import lh.l7;
import org.telegram.ui.Cells.xa;
import org.telegram.ui.Cells.ya;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class i2 implements View.OnLongClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i2(l7 l7Var, int i10, Runnable runnable) {
        this.c = l7Var;
        this.b = i10;
        this.d = runnable;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                l7 l7Var = (l7) this.c;
                Runnable runnable = (Runnable) this.d;
                l7Var.f(this.b, true);
                runnable.run();
                return true;
            default:
                ya yaVar = (ya) this.c;
                xa xaVar = (xa) this.d;
                return yaVar.b(xaVar.h, this.b);
        }
    }

    public /* synthetic */ i2(ya yaVar, xa xaVar, int i10) {
        this.c = yaVar;
        this.d = xaVar;
        this.b = i10;
    }
}
