package bi;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.fg1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements oe.d, iw0, kw0, org.telegram.ui.ActionBar.b2, Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ y a;

    public /* synthetic */ e(y yVar) {
        this.a = yVar;
    }

    @Override // oe.d
    public void E(int i10, float f7, float f10, oe.e eVar) {
        this.a.t0();
    }

    @Override // org.telegram.ui.Components.kw0
    public /* synthetic */ float b(RecyclerView recyclerView) {
        return b10.c(recyclerView);
    }

    @Override // org.telegram.ui.Components.iw0
    public int c() {
        return this.a.n;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        y yVar = this.a;
        yVar.getClass();
        yVar.presentFragment(new fg1(6, null));
    }

    @Override // org.telegram.ui.Components.kw0
    public RecyclerView i(View view) {
        y yVar = this.a;
        if (yVar.a == 1) {
            return ((x) view).c;
        }
        yVar.K.getClass();
        return ((ad) view).a;
    }

    @Override // org.telegram.ui.Components.kw0
    public /* synthetic */ void n(RecyclerView recyclerView) {
        b10.b(recyclerView);
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.a.getClass();
        return Boolean.FALSE;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        y.W(this.a, (u61) obj);
    }

    @Override // oe.d
    public /* synthetic */ void z(float f7, int i10) {
    }
}
