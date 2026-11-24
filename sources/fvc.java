// default package

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.internal.zzdm;
import com.google.android.recaptcha.internal.zzsx;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class fvc implements Continuation {
    public static /* synthetic */ void b() {
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ void c(int i, int i2, Throwable th) {
        throw new zzdm(i, i2, th);
    }

    public static /* synthetic */ void d(int i, String str) {
        throw new IllegalStateException(str + i);
    }

    public static /* synthetic */ void e(int i, StringBuilder sb) {
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void f(String str) {
        throw new NullPointerException(str);
    }

    public static /* synthetic */ void g(Throwable th) {
        throw new gp2(th);
    }

    public static /* synthetic */ void h(String str) {
        throw new t3e(str);
    }

    public static /* synthetic */ void i(String str) {
        throw new zzsx(str);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        Task forException;
        String message;
        task.getClass();
        cb4 cb4Var = cb4.e;
        boolean isSuccessful = task.isSuccessful();
        lh0 lh0Var = h0d.b;
        if (isSuccessful) {
            lh0Var.a("Successfully completed the operation", new Object[0]);
            Task forResult = Tasks.forResult(cb4Var.invoke(task.getResult()));
            forResult.getClass();
            return forResult;
        }
        Log.e(lh0Var.b, lh0Var.b("Failed to fetch the Verification Support Info: " + task.getException(), new Object[0]));
        Exception exception = task.getException();
        if (exception == null || (message = exception.getMessage()) == null || f9b.f(0, 2, message, "test_number_token is invalid") < 0) {
            forException = Tasks.forException(new fg4(exception instanceof zn ? ((zn) exception).getStatus().a : 55501, "Failed to fetch the Verification Support Info"));
        } else {
            lh0Var.a("Backend rejected the test number token.", new Object[0]);
            forException = Tasks.forException(new fg4(55507, "Invalid test number ID(s) - might be empty, expired or duplicated."));
        }
        forException.getClass();
        return forException;
    }
}
