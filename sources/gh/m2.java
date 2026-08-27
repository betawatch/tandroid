package gh;

import android.view.View;
import hh.m7;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Cells.wa;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class m2 implements View.OnLongClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m2(m7 m7Var, int i10, Runnable runnable) {
        this.c = m7Var;
        this.b = i10;
        this.d = runnable;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                m7 m7Var = (m7) this.c;
                Runnable runnable = (Runnable) this.d;
                m7Var.f(this.b, true);
                runnable.run();
                return true;
            default:
                wa waVar = (wa) this.c;
                va vaVar = (va) this.d;
                return waVar.b(vaVar.h, this.b);
        }
    }

    public /* synthetic */ m2(wa waVar, va vaVar, int i10) {
        this.c = waVar;
        this.d = vaVar;
        this.b = i10;
    }
}
