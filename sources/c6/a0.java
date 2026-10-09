package c6;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                    Parcel N0 = fVar.N0();
                    N0.writeString(this.c);
                    fVar.S0(N0, 12);
                }
                taskCompletionSource.setResult(null);
                break;
            default:
                n6.l.j("Not active connection", this.b.F != 1);
                g6.f fVar2 = (g6.f) wVar.u();
                Parcel N02 = fVar2.N0();
                String str = this.c;
                N02.writeString(str);
                fVar2.S0(N02, 12);
                if (this.d != null) {
                    g6.f fVar3 = (g6.f) wVar.u();
                    Parcel N03 = fVar3.N0();
                    N03.writeString(str);
                    fVar3.S0(N03, 11);
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
