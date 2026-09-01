package b9;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.api.q;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class c extends w implements f {
    public TaskCompletionSource d;
    public final /* synthetic */ b[] e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b[] bVarArr) {
        super(null, false, 9004);
        this.e = bVarArr;
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void a(q qVar) {
        Exception aVar;
        Status status = (Status) qVar;
        if (status.e()) {
            this.d.setResult(null);
            return;
        }
        TaskCompletionSource taskCompletionSource = this.d;
        String str = status.b;
        if (str == null || str.isEmpty()) {
            str = "User Action indexing error, please try again.";
        }
        switch (status.a) {
            case 17510:
                aVar = new z8.a(str);
                break;
            case 17511:
                aVar = new z8.a(str);
                break;
            case 17512:
            default:
                aVar = new w8.c(str);
                break;
            case 17513:
                aVar = new z8.a(str);
                break;
            case 17514:
                aVar = new z8.b(str);
                break;
        }
        taskCompletionSource.setException(aVar);
    }

    @Override // com.google.android.gms.common.api.internal.w
    public final void f(com.google.android.gms.common.api.c cVar, TaskCompletionSource taskCompletionSource) {
        this.d = taskCompletionSource;
        d7.a aVar = (d7.a) ((d7.b) cVar).u();
        p6.b bVar = new p6.b(this);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        int i10 = d7.c.a;
        obtain.writeStrongBinder(bVar);
        obtain.writeTypedArray(this.e, 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            aVar.a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
