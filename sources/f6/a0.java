package f6;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements com.google.android.gms.common.api.internal.p {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ e0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ f d;

    public /* synthetic */ a0(e0 e0Var, f fVar, String str) {
        this.b = e0Var;
        this.d = fVar;
        this.c = str;
    }

    @Override // com.google.android.gms.common.api.internal.p
    public final void accept(Object obj, Object obj2) {
        j6.w wVar = (j6.w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (this.a) {
            case 0:
                q6.m.i("Not active connection", this.b.G != 1);
                if (this.d != null) {
                    j6.f fVar = (j6.f) wVar.n();
                    Parcel p12 = fVar.p1();
                    p12.writeString(this.c);
                    fVar.u1(p12, 12);
                }
                taskCompletionSource.setResult(null);
                break;
            default:
                q6.m.i("Not active connection", this.b.G != 1);
                j6.f fVar2 = (j6.f) wVar.n();
                Parcel p13 = fVar2.p1();
                String str = this.c;
                p13.writeString(str);
                fVar2.u1(p13, 12);
                if (this.d != null) {
                    j6.f fVar3 = (j6.f) wVar.n();
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
