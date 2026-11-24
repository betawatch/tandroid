// default package

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class ndd extends BasePendingResult {
    public v39 o;
    public final boolean p;
    public final /* synthetic */ i69 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndd(i69 i69Var, boolean z) {
        super(null);
        this.q = i69Var;
        this.p = z;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ ua9 d(Status status) {
        return new vcd(status, (byte) 1);
    }

    public abstract void n();

    public final f9d o() {
        v39 v39Var = this.o;
        if (v39Var != null) {
            return v39Var;
        }
        v39 v39Var2 = new v39(this, (byte) 26);
        this.o = v39Var2;
        return v39Var2;
    }

    public final void p() {
        if (!this.p) {
            Iterator it = this.q.h.iterator();
            if (it.hasNext()) {
                throw ls6.l(it);
            }
            Iterator it2 = this.q.i.iterator();
            while (it2.hasNext()) {
                ((h69) it2.next()).f();
            }
        }
        try {
            synchronized (this.q.a) {
                n();
            }
        } catch (m8d unused) {
            a(new vcd(new Status(2100, null, null, null), (byte) 1));
        }
    }
}
