// default package

import android.content.Context;
import android.os.Binder;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.json.JSONException;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class o3d extends dzc {
    public final /* synthetic */ byte b = 1;
    public final Object c;

    public o3d(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", (byte) 2);
        this.c = revocationBoundService;
    }

    public final void T() {
        if (!axe.a((RevocationBoundService) this.c, Binder.getCallingUid())) {
            throw new SecurityException(tb4.n(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
        }
    }

    @Override // dzc
    public final boolean c(int i, Parcel parcel, Parcel parcel2) {
        BasePendingResult basePendingResult;
        String e;
        byte b = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                if (i != 1) {
                    return false;
                }
                Status status = (Status) w3d.a(parcel, Status.CREATOR);
                ih0 ih0Var = (ih0) w3d.a(parcel, ih0.CREATOR);
                w3d.b(parcel);
                dve.a(status, ih0Var, (TaskCompletionSource) obj);
                return true;
            default:
                RevocationBoundService revocationBoundService = (RevocationBoundService) obj;
                if (i == 1) {
                    T();
                    d1b a = d1b.a(revocationBoundService);
                    GoogleSignInAccount b2 = a.b();
                    GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.w;
                    if (b2 != null) {
                        String e2 = a.e("defaultGoogleSignInAccount");
                        if (!TextUtils.isEmpty(e2) && (e = a.e(d1b.f("googleSignInOptions", e2))) != null) {
                            try {
                                googleSignInOptions = GoogleSignInOptions.b(e);
                            } catch (JSONException unused) {
                            }
                        }
                        googleSignInOptions = null;
                    }
                    u84 a2 = aje.a(revocationBoundService, googleSignInOptions);
                    if (b2 != null) {
                        x1d x1dVar = a2.i;
                        Context context = a2.a;
                        boolean z = a2.l() == 3;
                        h4d.a.a("Revoking access", new Object[0]);
                        String e3 = d1b.a(context).e("refreshToken");
                        h4d.b(context);
                        if (!z) {
                            f4d f4dVar = new f4d(x1dVar, (byte) 1);
                            x1dVar.b.d(1, f4dVar);
                            basePendingResult = f4dVar;
                        } else if (e3 == null) {
                            lh0 lh0Var = t3d.c;
                            Status status2 = new Status(4, null, null, null);
                            fre.a("Status code must not be SUCCESS", !status2.b());
                            basePendingResult = new m2d(status2);
                            basePendingResult.a(status2);
                        } else {
                            t3d t3dVar = new t3d(e3);
                            new Thread(t3dVar).start();
                            basePendingResult = t3dVar.b;
                        }
                        wbd.a(basePendingResult, new o5f((byte) 29));
                    } else {
                        a2.k();
                    }
                } else {
                    if (i != 2) {
                        return false;
                    }
                    T();
                    i4d.N2(revocationBoundService).O2();
                }
                return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3d(TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback", (byte) 2);
        this.c = taskCompletionSource;
    }
}
