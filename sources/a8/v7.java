package a8;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public abstract class v7 {
    public static b9.k0 a(Context context, GoogleSignInOptions googleSignInOptions) {
        q6.m.h(googleSignInOptions);
        return new b9.k0(context, z5.a.a, googleSignInOptions, new com.google.android.gms.common.api.i(new w7.s(6), Looper.getMainLooper()));
    }

    public static Task b(Intent intent) {
        c6.b bVar;
        GoogleSignInAccount googleSignInAccount;
        org.telegram.messenger.d1 d1Var = d6.h.a;
        Status status = Status.h;
        if (intent == null) {
            bVar = new c6.b(null, status);
        } else {
            Status status2 = (Status) intent.getParcelableExtra("googleSignInStatus");
            GoogleSignInAccount googleSignInAccount2 = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
            if (googleSignInAccount2 == null) {
                if (status2 != null) {
                    status = status2;
                }
                bVar = new c6.b(null, status);
            } else {
                bVar = new c6.b(googleSignInAccount2, Status.e);
            }
        }
        Status status3 = bVar.a;
        return (!status3.b() || (googleSignInAccount = bVar.b) == null) ? Tasks.forException(q6.m.m(status3)) : Tasks.forResult(googleSignInAccount);
    }
}
