package e6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class n extends BasePendingResult {
    public k6.h o;
    public final boolean p;
    public final /* synthetic */ h q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(h hVar, boolean z10) {
        super(null);
        this.q = hVar;
        this.p = z10;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.q d(Status status) {
        return new m(status, 1);
    }

    public abstract void n();

    public final g6.n o() {
        if (this.o == null) {
            this.o = new k6.h(this, 20);
        }
        return this.o;
    }

    public final void p() {
        if (!this.p) {
            Iterator it = this.q.h.iterator();
            if (it.hasNext()) {
                throw a1.g.h(it);
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
        } catch (g6.k unused) {
            a(new m(new Status(2100, null, null, null), 1));
        }
    }
}
