// default package

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class iza extends gza {
    public final int w;
    public final /* synthetic */ xza x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iza(xza xzaVar, Context context, int i, int i2, mg0 mg0Var) {
        super(context, i2, mg0Var, null);
        this.x = xzaVar;
        this.w = i;
    }

    @Override // gza
    public final void b(jza jzaVar) {
        int i;
        xza xzaVar = this.x;
        i = ((d) xzaVar).classGuid;
        jzaVar.a(this.w, i, xzaVar.a.stats_dc, new sp1(xzaVar, this.r, (byte) 1));
    }

    @Override // gza
    public final void c() {
        int i;
        if (this.r.c <= 0) {
            performClick();
            ng0 ng0Var = this.b;
            if (ng0Var.u0.H) {
                long selectedDate = ng0Var.getSelectedDate();
                jza jzaVar = this.r;
                if (this.s == 4) {
                    jzaVar.e = new moa(jzaVar.d, selectedDate);
                    g(false);
                    return;
                }
                if (jzaVar.g == null) {
                    return;
                }
                xza xzaVar = this.x;
                xzaVar.c0();
                String str = this.r.g + "_" + selectedDate;
                nl1 nl1Var = (nl1) xzaVar.V.f(str);
                if (nl1Var != null) {
                    this.r.e = nl1Var;
                    g(false);
                    return;
                }
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                tL_loadAsyncGraph.token = this.r.g;
                if (selectedDate != 0) {
                    tL_loadAsyncGraph.x = selectedDate;
                    tL_loadAsyncGraph.flags |= 1;
                }
                wza wzaVar = new wza();
                xzaVar.Z = wzaVar;
                xzaVar.T.getClass();
                wzaVar.a = RecyclerView.R(this);
                ng0Var.u0.d(true, false);
                int i2 = this.w;
                int sendRequest = ConnectionsManager.getInstance(i2).sendRequest(tL_loadAsyncGraph, new fm8((Object) this, (Object) str, (Object) wzaVar, (byte) 20), null, null, 0, xzaVar.a.stats_dc, 1, true);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i2);
                i = ((d) xzaVar).classGuid;
                connectionsManager.bindRequestToGuid(sendRequest, i);
            }
        }
    }

    @Override // gza
    public final void f() {
        this.x.c0();
    }
}
