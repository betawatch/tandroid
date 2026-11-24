// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class m3c extends k69 {
    public final /* synthetic */ byte a = 1;
    public int b;
    public final /* synthetic */ Object c;

    public m3c(bo0 bo0Var, int i) {
        this.c = bo0Var;
        this.b = i;
    }

    @Override // k69
    public final void a(RecyclerView recyclerView, int i) {
        brc brcVar;
        switch (this.a) {
            case 0:
                if (i == 0) {
                    this.b = 0;
                    break;
                }
                break;
            default:
                if (i == 1 && (brcVar = ((goc) ((bo0) this.c).c).j0) != null) {
                    brcVar.a();
                    break;
                }
                break;
        }
    }

    @Override // k69
    public final void b(RecyclerView recyclerView, int i, int i2) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                p3c p3cVar = (p3c) obj;
                d4c d4cVar = p3cVar.n1;
                this.b += i2;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.b) > gm.L(96.0f)) {
                    View findFocus = d4cVar.findFocus();
                    if (findFocus == null) {
                        findFocus = d4cVar;
                    }
                    gm.t1(findFocus);
                }
                if (i2 != 0 && d4cVar.c()) {
                    p3cVar.o1 = d4cVar.getContentTopOffset();
                    p3cVar.b.invalidate();
                    break;
                }
                break;
            default:
                int i3 = this.b;
                goc gocVar = (goc) ((bo0) obj).c;
                if (i3 != 0) {
                    recyclerView.post(new pmc(gocVar, (byte) 14));
                    break;
                } else {
                    gocVar.H0();
                    break;
                }
        }
    }

    public m3c(p3c p3cVar) {
        this.c = p3cVar;
    }
}
