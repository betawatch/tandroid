// default package

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class aed implements h89 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ bhd b;
    public final /* synthetic */ String c;
    public final /* synthetic */ k89 d;

    public /* synthetic */ aed(bhd bhdVar, k89 k89Var, String str) {
        this.b = bhdVar;
        this.d = k89Var;
        this.c = str;
    }

    @Override // h89
    public final void accept(Object obj, Object obj2) {
        byte b = this.a;
        k89 k89Var = this.d;
        String str = this.c;
        bhd bhdVar = this.b;
        mjf mjfVar = (mjf) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (b) {
            case 0:
                ite.j("Not active connection", bhdVar.G != 1);
                if (k89Var != null) {
                    z8d z8dVar = (z8d) mjfVar.k();
                    Parcel R = z8dVar.R();
                    R.writeString(str);
                    z8dVar.W(R, 12);
                }
                taskCompletionSource.setResult(null);
                break;
            default:
                ite.j("Not active connection", bhdVar.G != 1);
                z8d z8dVar2 = (z8d) mjfVar.k();
                Parcel R2 = z8dVar2.R();
                R2.writeString(str);
                z8dVar2.W(R2, 12);
                if (k89Var != null) {
                    z8d z8dVar3 = (z8d) mjfVar.k();
                    Parcel R3 = z8dVar3.R();
                    R3.writeString(str);
                    z8dVar3.W(R3, 11);
                }
                taskCompletionSource.setResult(null);
                break;
        }
    }

    public /* synthetic */ aed(bhd bhdVar, String str, k89 k89Var) {
        this.b = bhdVar;
        this.c = str;
        this.d = k89Var;
    }
}
