package i7;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class l {
    public static com.google.android.gms.internal.clearcut.v0 a(Context context, GoogleSignInOptions googleSignInOptions) {
        z5.l.h(googleSignInOptions);
        return new com.google.android.gms.internal.clearcut.v0(context, i5.a.a, googleSignInOptions, new com.google.android.gms.common.api.i(new com.google.android.gms.common.api.internal.a(), Looper.getMainLooper()));
    }

    public static Task b(Intent intent) {
        l5.b bVar;
        GoogleSignInAccount googleSignInAccount;
        ag.j2 j2Var = m5.h.a;
        Status status = Status.h;
        if (intent == null) {
            bVar = new l5.b(null, status);
        } else {
            Status status2 = (Status) intent.getParcelableExtra("googleSignInStatus");
            GoogleSignInAccount googleSignInAccount2 = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
            if (googleSignInAccount2 == null) {
                if (status2 != null) {
                    status = status2;
                }
                bVar = new l5.b(null, status);
            } else {
                bVar = new l5.b(googleSignInAccount2, Status.e);
            }
        }
        Status status3 = bVar.a;
        return (!status3.b() || (googleSignInAccount = bVar.b) == null) ? Tasks.forException(z5.l.m(status3)) : Tasks.forResult(googleSignInAccount);
    }
}
