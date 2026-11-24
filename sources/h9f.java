// default package

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class h9f extends bgb implements jg0 {
    public TaskCompletionSource d;
    public final /* synthetic */ fhd[] e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9f(fhd[] fhdVarArr) {
        super(null, false, 9004);
        this.e = fhdVarArr;
    }

    @Override // jg0
    public final void a(ua9 ua9Var) {
        Exception kg4Var;
        Status status = (Status) ua9Var;
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
                kg4Var = new kg4(str);
                break;
            case 17511:
                kg4Var = new kg4(str);
                break;
            case 17512:
            default:
                kg4Var = new fg4(str);
                break;
            case 17513:
                kg4Var = new kg4(str);
                break;
            case 17514:
                kg4Var = new y4d(str);
                break;
        }
        taskCompletionSource.setException(kg4Var);
    }

    @Override // bgb
    public final void c(xx4 xx4Var, TaskCompletionSource taskCompletionSource) {
        this.d = taskCompletionSource;
        h5d h5dVar = (h5d) ((i6d) xx4Var).k();
        x43 x43Var = new x43(this);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        int i = pgd.a;
        obtain.writeStrongBinder(x43Var);
        obtain.writeTypedArray(this.e, 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            h5dVar.a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
