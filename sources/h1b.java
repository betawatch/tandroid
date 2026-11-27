// default package

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public abstract class h1b extends g1b {
    public final int w;
    public final /* synthetic */ w1b x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1b(w1b w1bVar, Context context, int i, int i2, of0 of0Var) {
        super(context, i2, of0Var, null);
        this.x = w1bVar;
        this.w = i;
    }

    @Override // g1b
    public final void b(i1b i1bVar) {
        int i;
        w1b w1bVar = this.x;
        i = ((e) w1bVar).classGuid;
        i1bVar.a(this.w, i, w1bVar.a.stats_dc, new vo1(w1bVar, this.r, (byte) 1));
    }

    @Override // g1b
    public final void c() {
        int i;
        if (this.r.c <= 0) {
            performClick();
            pf0 pf0Var = this.b;
            if (pf0Var.u0.H) {
                long selectedDate = pf0Var.getSelectedDate();
                i1b i1bVar = this.r;
                if (this.s == 4) {
                    i1bVar.e = new iqa(i1bVar.d, selectedDate);
                    g(false);
                    return;
                }
                if (i1bVar.g == null) {
                    return;
                }
                w1b w1bVar = this.x;
                w1bVar.b0();
                String str = this.r.g + "_" + selectedDate;
                ok1 ok1Var = (ok1) w1bVar.V.f(str);
                if (ok1Var != null) {
                    this.r.e = ok1Var;
                    g(false);
                    return;
                }
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                tL_loadAsyncGraph.token = this.r.g;
                if (selectedDate != 0) {
                    tL_loadAsyncGraph.x = selectedDate;
                    tL_loadAsyncGraph.flags |= 1;
                }
                v1b v1bVar = new v1b();
                w1bVar.Z = v1bVar;
                w1bVar.T.getClass();
                v1bVar.a = RecyclerView.S(this);
                pf0Var.u0.d(true, false);
                int i2 = this.w;
                int sendRequest = ConnectionsManager.getInstance(i2).sendRequest(tL_loadAsyncGraph, new qn8((Object) this, (Object) str, (Object) v1bVar, (byte) 20), null, null, 0, w1bVar.a.stats_dc, 1, true);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i2);
                i = ((e) w1bVar).classGuid;
                connectionsManager.bindRequestToGuid(sendRequest, i);
            }
        }
    }

    @Override // g1b
    public final void f() {
        this.x.b0();
    }
}
