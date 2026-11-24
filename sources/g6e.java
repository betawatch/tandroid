// default package

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class g6e implements f69, k6a {
    public final /* synthetic */ byte a;
    public Object b;

    public g6e(lje ljeVar) {
        this.a = (byte) 2;
        Charset charset = foe.a;
        this.b = ljeVar;
        ljeVar.a = this;
    }

    @Override // k6a
    public final /* bridge */ /* synthetic */ void E(d5a d5aVar, boolean z) {
        xhf xhfVar = new xhf(new ab8(4));
        gl2 gl2Var = (gl2) this.b;
        gl2.S(gl2Var, xhfVar);
        mhf mhfVar = (mhf) gl2Var.e;
        fre.h(mhfVar);
        mhfVar.a((ed1) d5aVar);
    }

    @Override // k6a
    public final void F(d5a d5aVar, int i) {
        ab8 ab8Var = new ab8(8);
        ab8Var.b = Integer.valueOf(i);
        xhf xhfVar = new xhf(ab8Var);
        gl2 gl2Var = (gl2) this.b;
        gl2.S(gl2Var, xhfVar);
        gl2Var.U();
    }

    @Override // k6a
    public final void K(d5a d5aVar, int i) {
        ab8 ab8Var = new ab8(5);
        ab8Var.b = Integer.valueOf(i);
        xhf xhfVar = new xhf(ab8Var);
        gl2 gl2Var = (gl2) this.b;
        gl2.S(gl2Var, xhfVar);
        gl2Var.U();
    }

    @Override // k6a
    public final void R(d5a d5aVar, String str) {
        xhf xhfVar = new xhf(new ab8(7));
        gl2 gl2Var = (gl2) this.b;
        gl2.S(gl2Var, xhfVar);
        mhf mhfVar = (mhf) gl2Var.e;
        fre.h(mhfVar);
        mhfVar.a((ed1) d5aVar);
        mhf mhfVar2 = (mhf) gl2Var.e;
        fre.h(mhfVar2);
        String str2 = mhfVar2.k;
        if (str2 == null) {
            mhfVar2.k = str;
        } else {
            if (TextUtils.equals(str, str2)) {
                return;
            }
            mhfVar2.b(4);
        }
    }

    @Override // k6a
    public final void T(d5a d5aVar, String str) {
        xhf xhfVar = new xhf(new ab8(4));
        gl2 gl2Var = (gl2) this.b;
        gl2.S(gl2Var, xhfVar);
        mhf mhfVar = (mhf) gl2Var.e;
        fre.h(mhfVar);
        mhfVar.a((ed1) d5aVar);
        mhf mhfVar2 = (mhf) gl2Var.e;
        fre.h(mhfVar2);
        String str2 = mhfVar2.k;
        if (str2 == null) {
            mhfVar2.k = str;
        } else {
            if (TextUtils.equals(str, str2)) {
                return;
            }
            mhfVar2.b(4);
        }
    }

    public final void a(int i, Object obj, xwe xweVar) {
        lje ljeVar = (lje) this.b;
        qde qdeVar = (qde) obj;
        ljeVar.c(i, 2);
        int c = qdeVar.c();
        if (c == -1) {
            c = xweVar.zzb(qdeVar);
            qdeVar.b(c);
        }
        ljeVar.g(c);
        xweVar.d(qdeVar, ljeVar.a);
    }

    @Override // f69
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                h03 h03Var = (h03) this.b;
                pp5 pp5Var = new pp5((TaskCompletionSource) obj2, (byte) 0);
                kh5 kh5Var = (kh5) ((zj5) obj).k();
                ho hoVar = new ho(new jp2(-1, -1, 0, true), false);
                hoVar.c = false;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i = qgd.a;
                obtain.writeStrongBinder(pp5Var);
                qgd.b(obtain, h03Var);
                qgd.b(obtain, hoVar);
                ((ih5) kh5Var).a(obtain, 6);
                break;
            default:
                cse cseVar = new cse((TaskCompletionSource) obj2, (byte) 2);
                n7d n7dVar = (n7d) ((e5f) obj).k();
                String[] strArr = (String[]) this.b;
                Parcel R = n7dVar.R();
                jgd.d(R, cseVar);
                R.writeStringArray(strArr);
                n7dVar.W(R, 7);
                break;
        }
    }

    public final void b(int i, sie sieVar) {
        lje ljeVar = (lje) this.b;
        ljeVar.c(i, 2);
        ljeVar.g(sieVar.i());
        ljeVar.k(sieVar.b, sieVar.m(), sieVar.i());
    }

    public final void c(int i, Object obj, xwe xweVar) {
        lje ljeVar = (lje) this.b;
        ljeVar.c(i, 3);
        xweVar.d((qde) obj, ljeVar.a);
        ljeVar.c(i, 4);
    }

    @Override // k6a
    public final void n(d5a d5aVar, int i) {
        ab8 ab8Var = new ab8(9);
        ab8Var.b = Integer.valueOf(i);
        gl2 gl2Var = (gl2) this.b;
        ab8Var.c = Boolean.valueOf(((p6d) gl2Var.c).c == 2);
        gl2.S(gl2Var, new xhf(ab8Var));
        gl2Var.U();
    }

    @Override // k6a
    public final void p(d5a d5aVar) {
        ed1 ed1Var = (ed1) d5aVar;
        ab8 ab8Var = new ab8(2);
        gl2 gl2Var = (gl2) this.b;
        ab8Var.c = Boolean.valueOf(((p6d) gl2Var.c).c == 2);
        gl2.S(gl2Var, new xhf(ab8Var));
        mhf mhfVar = (mhf) gl2Var.e;
        fre.h(mhfVar);
        mhfVar.a(ed1Var);
        ed1Var.l = (e6e) gl2Var.f;
    }

    @Override // k6a
    public final void q(d5a d5aVar, int i) {
        ab8 ab8Var = new ab8(6);
        ab8Var.b = Integer.valueOf(i);
        xhf xhfVar = new xhf(ab8Var);
        gl2 gl2Var = (gl2) this.b;
        gl2.S(gl2Var, xhfVar);
        mhf mhfVar = (mhf) gl2Var.e;
        fre.h(mhfVar);
        mhfVar.a((ed1) d5aVar);
    }

    @Override // k6a
    public final /* bridge */ /* synthetic */ void z(d5a d5aVar) {
    }

    public /* synthetic */ g6e(u84 u84Var, String[] strArr) {
        this.a = (byte) 1;
        this.b = strArr;
    }

    public /* synthetic */ g6e(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ g6e() {
        this.a = (byte) 3;
    }
}
