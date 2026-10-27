package f6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class o extends BasePendingResult {
    public a4.l o;
    public final boolean p;
    public final /* synthetic */ h q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(h hVar, boolean z10) {
        super(null);
        this.q = hVar;
        this.p = z10;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.q d(Status status) {
        return new n(status, 1);
    }

    public abstract void n();

    public final h6.n o() {
        if (this.o == null) {
            this.o = new a4.l(this, 16);
        }
        return this.o;
    }

    public final void p() {
        if (!this.p) {
            Iterator it = this.q.h.iterator();
            if (it.hasNext()) {
                throw a1.g.j(it);
            }
            Iterator it2 = this.q.i.iterator();
            while (it2.hasNext()) {
                ((g) it2.next()).f();
            }
        }
        try {
            synchronized (this.q.a) {
                n();
            }
        } catch (h6.k unused) {
            a(new n(new Status(2100, null, null, null), 1));
        }
    }
}
