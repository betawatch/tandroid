package m5;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements com.google.android.gms.common.api.internal.s {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ f0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ f d;

    public /* synthetic */ a0(f0 f0Var, String str, o5.h hVar) {
        this.b = f0Var;
        this.c = str;
        this.d = hVar;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public final void accept(Object obj, Object obj2) {
        q5.x xVar = (q5.x) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (this.a) {
            case 0:
                x5.l.j("Not active connection", this.b.F != 1);
                if (this.d != null) {
                    q5.f fVar = (q5.f) xVar.u();
                    Parcel M0 = fVar.M0();
                    M0.writeString(this.c);
                    fVar.R0(M0, 12);
                }
                taskCompletionSource.setResult(null);
                break;
            default:
                x5.l.j("Not active connection", this.b.F != 1);
                q5.f fVar2 = (q5.f) xVar.u();
                Parcel M02 = fVar2.M0();
                String str = this.c;
                M02.writeString(str);
                fVar2.R0(M02, 12);
                if (this.d != null) {
                    q5.f fVar3 = (q5.f) xVar.u();
                    Parcel M03 = fVar3.M0();
                    M03.writeString(str);
                    fVar3.R0(M03, 11);
                }
                taskCompletionSource.setResult(null);
                break;
        }
    }

    public /* synthetic */ a0(f0 f0Var, f fVar, String str) {
        this.b = f0Var;
        this.d = fVar;
        this.c = str;
    }
}
