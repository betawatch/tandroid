package d6;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements com.google.android.gms.common.api.internal.r {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ e0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ f d;

    public /* synthetic */ a0(e0 e0Var, f fVar, String str) {
        this.b = e0Var;
        this.d = fVar;
        this.c = str;
    }

    @Override // com.google.android.gms.common.api.internal.r
    public final void accept(Object obj, Object obj2) {
        h6.w wVar = (h6.w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (this.a) {
            case 0:
                o6.l.j("Not active connection", this.b.F != 1);
                if (this.d != null) {
                    h6.f fVar = (h6.f) wVar.u();
                    Parcel N0 = fVar.N0();
                    N0.writeString(this.c);
                    fVar.S0(N0, 12);
                }
                taskCompletionSource.setResult(null);
                break;
            default:
                o6.l.j("Not active connection", this.b.F != 1);
                h6.f fVar2 = (h6.f) wVar.u();
                Parcel N02 = fVar2.N0();
                String str = this.c;
                N02.writeString(str);
                fVar2.S0(N02, 12);
                if (this.d != null) {
                    h6.f fVar3 = (h6.f) wVar.u();
                    Parcel N03 = fVar3.N0();
                    N03.writeString(str);
                    fVar3.S0(N03, 11);
                }
                taskCompletionSource.setResult(null);
                break;
        }
    }

    public /* synthetic */ a0(e0 e0Var, String str, f6.h hVar) {
        this.b = e0Var;
        this.c = str;
        this.d = hVar;
    }
}
