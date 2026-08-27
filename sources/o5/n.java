package o5;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class n extends BasePendingResult {
    public m5.o o;
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

    public final r5.o o() {
        if (this.o == null) {
            this.o = new m5.o(this, 4);
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
        } catch (r5.l unused) {
            a(new m(new Status(2100, null, null, null), 1));
        }
    }
}
