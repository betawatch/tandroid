package c6;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                n6.l.i("Not active connection", this.b.F != 1);
                if (this.d != null) {
                    g6.f fVar = (g6.f) wVar.v();
                    Parcel P0 = fVar.P0();
                    P0.writeString(this.c);
                    fVar.U0(P0, 12);
                }
                taskCompletionSource.setResult(null);
                break;
            default:
                n6.l.i("Not active connection", this.b.F != 1);
                g6.f fVar2 = (g6.f) wVar.v();
                Parcel P02 = fVar2.P0();
                String str = this.c;
                P02.writeString(str);
                fVar2.U0(P02, 12);
                if (this.d != null) {
                    g6.f fVar3 = (g6.f) wVar.v();
                    Parcel P03 = fVar3.P0();
                    P03.writeString(str);
                    fVar3.U0(P03, 11);
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
