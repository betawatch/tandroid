package e6;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
        i6.w wVar = (i6.w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (this.a) {
            case 0:
                p6.m.i("Not active connection", this.b.G != 1);
                if (this.d != null) {
                    i6.f fVar = (i6.f) wVar.m();
                    Parcel P0 = fVar.P0();
                    P0.writeString(this.c);
                    fVar.U0(P0, 12);
                }
                taskCompletionSource.setResult(null);
                break;
            default:
                p6.m.i("Not active connection", this.b.G != 1);
                i6.f fVar2 = (i6.f) wVar.m();
                Parcel P02 = fVar2.P0();
                String str = this.c;
                P02.writeString(str);
                fVar2.U0(P02, 12);
                if (this.d != null) {
                    i6.f fVar3 = (i6.f) wVar.m();
                    Parcel P03 = fVar3.P0();
                    P03.writeString(str);
                    fVar3.U0(P03, 11);
                }
                taskCompletionSource.setResult(null);
                break;
        }
    }

    public /* synthetic */ a0(e0 e0Var, String str, g6.h hVar) {
        this.b = e0Var;
        this.c = str;
        this.d = hVar;
    }
}
