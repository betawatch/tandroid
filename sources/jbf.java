// default package

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class jbf extends cib implements kh0 {
    public TaskCompletionSource d;
    public final /* synthetic */ gjd[] e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbf(gjd[] gjdVarArr) {
        super(null, false, 9004);
        this.e = gjdVarArr;
    }

    @Override // kh0
    public final void a(uc9 uc9Var) {
        Exception mi4Var;
        Status status = (Status) uc9Var;
        boolean b = status.b();
        TaskCompletionSource taskCompletionSource = this.d;
        if (b) {
            taskCompletionSource.setResult(null);
            return;
        }
        String str = status.b;
        if (str == null || str.isEmpty()) {
            str = "User Action indexing error, please try again.";
        }
        switch (status.a) {
            case 17510:
                mi4Var = new mi4(str);
                break;
            case 17511:
                mi4Var = new mi4(str);
                break;
            case 17512:
            default:
                mi4Var = new hi4(str);
                break;
            case 17513:
                mi4Var = new mi4(str);
                break;
            case 17514:
                mi4Var = new a7d(str);
                break;
        }
        taskCompletionSource.setException(mi4Var);
    }

    @Override // cib
    public final void c(zz4 zz4Var, TaskCompletionSource taskCompletionSource) {
        this.d = taskCompletionSource;
        j7d j7dVar = (j7d) ((k8d) zz4Var).k();
        i63 i63Var = new i63(this);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        int i = qid.a;
        obtain.writeStrongBinder(i63Var);
        obtain.writeTypedArray(this.e, 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            j7dVar.a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
