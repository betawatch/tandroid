package m5;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements com.google.android.gms.common.api.internal.s {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ f0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ f d;

    public /* synthetic */ b0(f0 f0Var, String str, o5.h hVar) {
        this.b = f0Var;
        this.c = str;
        this.d = hVar;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public final void accept(Object obj, Object obj2) {
        r5.x xVar = (r5.x) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (this.a) {
            case 0:
                y5.l.j("Not active connection", this.b.F != 1);
                if (this.d != null) {
                    r5.f fVar = (r5.f) xVar.u();
                    Parcel M0 = fVar.M0();
                    M0.writeString(this.c);
                    fVar.R0(M0, 12);
                }
                taskCompletionSource.setResult(null);
                break;
            default:
                y5.l.j("Not active connection", this.b.F != 1);
                r5.f fVar2 = (r5.f) xVar.u();
                Parcel M02 = fVar2.M0();
                String str = this.c;
                M02.writeString(str);
                fVar2.R0(M02, 12);
                if (this.d != null) {
                    r5.f fVar3 = (r5.f) xVar.u();
                    Parcel M03 = fVar3.M0();
                    M03.writeString(str);
                    fVar3.R0(M03, 11);
                }
                taskCompletionSource.setResult(null);
                break;
        }
    }

    public /* synthetic */ b0(f0 f0Var, f fVar, String str) {
        this.b = f0Var;
        this.d = fVar;
        this.c = str;
    }
}
