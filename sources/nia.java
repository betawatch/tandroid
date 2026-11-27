// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class nia extends c79 {
    public final Context c;
    public final int d;
    public final vnb e;
    public final lia f;
    public final ArrayList h = new ArrayList(10);
    public final ArrayList n = new ArrayList();
    public jga r;
    public final /* synthetic */ eja s;

    public nia(eja ejaVar, Context context, int i, vnb vnbVar) {
        this.s = ejaVar;
        this.c = context;
        this.d = i;
        this.e = vnbVar;
        this.f = new lia(this, i, vnbVar);
        E();
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.n;
        arrayList.clear();
        ArrayList c = this.s.w1[8].c();
        int i = 0;
        for (int i2 = 0; i2 < c.size(); i2++) {
            r47 r47Var = (r47) c.get(i2);
            if (r47Var.X != i) {
                int i3 = r47Var.k.date;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                long j = i3;
                tL_message.message = ob6.u(j, false);
                tL_message.id = 0;
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(j * 1000);
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                tL_message.date = (int) (calendar.getTimeInMillis() / 1000);
                r47 r47Var2 = new r47(this.d, tL_message, false, false);
                r47Var2.D = 10;
                r47Var2.U = 1;
                r47Var2.l0 = true;
                arrayList.add(r47Var2);
                i = r47Var.X;
            }
            arrayList.add(r47Var);
        }
    }

    @Override // j79
    public final int b() {
        return this.n.size();
    }

    @Override // j79
    public final int d(int i) {
        if (i < 0) {
            return 0;
        }
        ArrayList arrayList = this.n;
        if (i < arrayList.size()) {
            return ((r47) arrayList.get(i)).U;
        }
        return 0;
    }

    @Override // j79
    public final void f() {
        E();
        super.f();
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        if (i >= 0) {
            ArrayList arrayList = this.n;
            if (i < arrayList.size()) {
                r47 r47Var = (r47) arrayList.get(i);
                int i2 = f89Var.f;
                View view = f89Var.a;
                if (i2 == 0) {
                    ((wb2) view).z3(r47Var, null, false, false, false, false);
                } else {
                    ((dl1) view).setMessageObject(r47Var);
                }
            }
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        if (i != 0) {
            return new n69(new dl1(this.e, this.c, false));
        }
        vnb vnbVar = this.e;
        mia miaVar = new mia(this.c, this.d, false, null, vnbVar);
        miaVar.setDelegate(this.f);
        return new n69(miaVar);
    }
}
