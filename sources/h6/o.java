package h6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import g6.d0;
import java.util.Iterator;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class o extends BasePendingResult {
    public d0 o;
    public final boolean p;
    public final /* synthetic */ h q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(h hVar, boolean z9) {
        super(null);
        this.q = hVar;
        this.p = z9;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.q d(Status status) {
        return new n(status, 1);
    }

    public abstract void n();

    public final j6.n o() {
        if (this.o == null) {
            this.o = new d0(this, 3);
        }
        return this.o;
    }

    public final void p() {
        if (!this.p) {
            Iterator it = this.q.h.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
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
        } catch (j6.k unused) {
            a(new n(new Status(2100, null, null, null), 1));
        }
    }
}
