// default package

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class h02 implements t22 {
    public final /* synthetic */ x02 a;

    public h02(x02 x02Var) {
        this.a = x02Var;
    }

    @Override // t22
    public final void S() {
        this.a.k1(true);
    }

    @Override // t22
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z, int i, long j, boolean z2, long j2) {
        x02 x02Var = this.a;
        t22 t22Var = x02Var.R1;
        if (t22Var != null) {
            t22Var.k(arrayList, str, arrayList2, arrayList3, z, i, j, z2, j2);
            return;
        }
        Object obj = x02Var.Z1;
        if (obj instanceof t22) {
            ((t22) obj).k(arrayList, str, arrayList2, arrayList3, z, i, j, z2, j2);
            return;
        }
        if (obj instanceof vx7) {
            vx7 vx7Var = (vx7) obj;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                y3a y3aVar = new y3a();
                y3aVar.c = (String) arrayList.get(i2);
                arrayList4.add(y3aVar);
            }
            vx7Var.I1(arrayList4);
        }
    }

    @Override // t22
    public final void m(ArrayList arrayList, boolean z, int i, long j) {
        x02 x02Var = this.a;
        t22 t22Var = x02Var.R1;
        if (t22Var != null) {
            t22Var.m(arrayList, z, i, j);
            return;
        }
        d dVar = x02Var.Z1;
        if (dVar instanceof mu1) {
            ((mu1) dVar).m(arrayList, z, i, j);
        } else if (dVar instanceof vx7) {
            ((vx7) dVar).I1(arrayList);
        }
    }

    @Override // t22
    public final void z() {
        x02 x02Var = this.a;
        t22 t22Var = x02Var.R1;
        if (t22Var != null) {
            t22Var.z();
            return;
        }
        Object obj = x02Var.Z1;
        if (obj instanceof t22) {
            ((t22) obj).z();
            return;
        }
        if (obj instanceof vx7) {
            vx7 vx7Var = (vx7) obj;
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                vx7Var.startActivityForResult(intent, 21);
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }
}
