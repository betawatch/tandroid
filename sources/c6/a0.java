package c6;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements com.google.android.gms.common.api.internal.s {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ e0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ f d;

    public /* synthetic */ a0(e0 e0Var, f fVar, String str) {
        this.b = e0Var;
        this.d = fVar;
        this.c = str;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public final void accept(Object obj, Object obj2) {
        g6.w wVar = (g6.w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (this.a) {
            case 0:
                n6.l.j("Not active connection", this.b.F != 1);
                if (this.d != null) {
                    g6.f fVar = (g6.f) wVar.u();
                    Parcel O0 = fVar.O0();
                    O0.writeString(this.c);
                    fVar.T0(O0, 12);
                }
                taskCompletionSource.setResult(null);
                break;
            default:
                n6.l.j("Not active connection", this.b.F != 1);
                g6.f fVar2 = (g6.f) wVar.u();
                Parcel O02 = fVar2.O0();
                String str = this.c;
                O02.writeString(str);
                fVar2.T0(O02, 12);
                if (this.d != null) {
                    g6.f fVar3 = (g6.f) wVar.u();
                    Parcel O03 = fVar3.O0();
                    O03.writeString(str);
                    fVar3.T0(O03, 11);
                }
                taskCompletionSource.setResult(null);
                break;
        }
    }

    public /* synthetic */ a0(e0 e0Var, String str, e6.h hVar) {
        this.b = e0Var;
        this.c = str;
        this.d = hVar;
    }
}
