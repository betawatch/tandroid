// default package

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class fid extends BasePendingResult {
    public l09 o;
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
        l09 l09Var = this.o;
        if (l09Var != null) {
            return l09Var;
        }
        l09 l09Var2 = new l09(this, (byte) 26);
        this.o = l09Var2;
        return l09Var2;
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
