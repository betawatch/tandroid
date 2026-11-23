package f6;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements com.google.android.gms.common.api.internal.q {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ e0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ f d;

    public /* synthetic */ a0(e0 e0Var, f fVar, String str) {
        this.b = e0Var;
        this.d = fVar;
        this.c = str;
    }

    @Override // com.google.android.gms.common.api.internal.q
    public final void accept(Object obj, Object obj2) {
        j6.x xVar = (j6.x) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (this.a) {
            case 0:
                q6.m.j("Not active connection", this.b.G != 1);
                if (this.d != null) {
                    j6.f fVar = (j6.f) xVar.n();
                    Parcel p12 = fVar.p1();
                    p12.writeString(this.c);
                    fVar.u1(p12, 12);
                }
                taskCompletionSource.setResult(null);
                break;
            default:
                q6.m.j("Not active connection", this.b.G != 1);
                j6.f fVar2 = (j6.f) xVar.n();
                Parcel p13 = fVar2.p1();
                String str = this.c;
                p13.writeString(str);
                fVar2.u1(p13, 12);
                if (this.d != null) {
                    j6.f fVar3 = (j6.f) xVar.n();
                    Parcel p14 = fVar3.p1();
                    p14.writeString(str);
                    fVar3.u1(p14, 11);
                }
                taskCompletionSource.setResult(null);
                break;
        }
    }

    public /* synthetic */ a0(e0 e0Var, String str, h6.h hVar) {
        this.b = e0Var;
        this.c = str;
        this.d = hVar;
    }
}
