package f6;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
                    Parcel P0 = fVar.P0();
                    P0.writeString(this.c);
                    fVar.U0(P0, 12);
                }
                taskCompletionSource.setResult(null);
                break;
            default:
                q6.m.i("Not active connection", this.b.G != 1);
                j6.f fVar2 = (j6.f) wVar.n();
                Parcel P02 = fVar2.P0();
                String str = this.c;
                P02.writeString(str);
                fVar2.U0(P02, 12);
                if (this.d != null) {
                    j6.f fVar3 = (j6.f) wVar.n();
                    Parcel P03 = fVar3.P0();
                    P03.writeString(str);
                    fVar3.U0(P03, 11);
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
