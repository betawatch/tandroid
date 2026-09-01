package k7;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class z {
    public static a8.e a(Context context, GoogleSignInOptions googleSignInOptions) {
        b6.m.h(googleSignInOptions);
        return new a8.e(context, k5.a.a, googleSignInOptions, new com.google.android.gms.common.api.i(new com.google.android.gms.common.api.internal.a(), Looper.getMainLooper()));
    }

    public static Task b(Intent intent) {
        n5.b bVar;
        GoogleSignInAccount googleSignInAccount;
        b4.e0 e0Var = o5.h.a;
        Status status = Status.h;
        if (intent == null) {
            bVar = new n5.b(null, status);
        } else {
            Status status2 = (Status) intent.getParcelableExtra("googleSignInStatus");
            GoogleSignInAccount googleSignInAccount2 = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
            if (googleSignInAccount2 == null) {
                if (status2 != null) {
                    status = status2;
                }
                bVar = new n5.b(null, status);
            } else {
                bVar = new n5.b(googleSignInAccount2, Status.e);
            }
        }
        Status status3 = bVar.a;
        return (!status3.e() || (googleSignInAccount = bVar.b) == null) ? Tasks.forException(b6.m.m(status3)) : Tasks.forResult(googleSignInAccount);
    }
}
