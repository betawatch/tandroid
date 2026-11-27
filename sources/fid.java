// default package

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class fid extends BasePendingResult {
    public k09 o;
    public final boolean p;
    public final /* synthetic */ v99 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fid(v99 v99Var, boolean z) {
        super(null);
        this.q = v99Var;
        this.p = z;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ ie9 d(Status status) {
        return new ohd(status, (byte) 1);
    }

    public abstract void n();

    public final ydd o() {
        k09 k09Var = this.o;
        if (k09Var != null) {
            return k09Var;
        }
        k09 k09Var2 = new k09(this, (byte) 26);
        this.o = k09Var2;
        return k09Var2;
    }

    public final void p() {
        if (!this.p) {
            Iterator it = this.q.h.iterator();
            if (it.hasNext()) {
                throw qu6.l(it);
            }
            Iterator it2 = this.q.i.iterator();
            while (it2.hasNext()) {
                ((u99) it2.next()).f();
            }
        }
        try {
            synchronized (this.q.a) {
                n();
            }
        } catch (fdd unused) {
            a(new ohd(new Status(2100, null, null, null), (byte) 1));
        }
    }
}
