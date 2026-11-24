package androidx.credentials.playservices;

import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class CredentialProviderPlayServicesImpl implements s13 {
    public static final l23 Companion = new l23();
    public static final int MIN_GMS_APK_VERSION = 230815045;
    public static final int MIN_GMS_APK_VERSION_DIGITAL_CRED = 243100000;
    public static final int MIN_GMS_APK_VERSION_RESTORE_CRED = 242200000;
    public static final int PRE_U_MIN_GMS_APK_VERSION = 252400000;
    private static final String TAG = "PlayServicesImpl";
    private final Context context;
    private cy4 googleApiAvailability;

    public CredentialProviderPlayServicesImpl(Context context) {
        context.getClass();
        this.context = context;
        this.googleApiAvailability = cy4.e;
    }

    private final int isGooglePlayServicesAvailable(Context context, int i) {
        return this.googleApiAvailability.c(context, i);
    }

    private static final g5c onClearCredential$lambda$10(CancellationSignal cancellationSignal, Executor executor, o13 o13Var, Boolean bool) {
        Companion.getClass();
        if (!l23.a(cancellationSignal)) {
            onClearCredential$lambda$10$lambda$9(executor, o13Var);
        }
        return g5c.a;
    }

    private static final g5c onClearCredential$lambda$10$lambda$9(Executor executor, o13 o13Var) {
        Log.i(TAG, "Cleared restore credential successfully!");
        executor.execute(new r03(o13Var, (byte) 2));
        return g5c.a;
    }

    private static final void onClearCredential$lambda$14(CancellationSignal cancellationSignal, Executor executor, o13 o13Var, Exception exc) {
        exc.getClass();
        Log.w(TAG, "Clearing restore credential failed", exc);
        c59 c59Var = new c59();
        c59Var.a = new vh2("Clear restore credential failed for unknown reason.");
        if ((exc instanceof zn) && ((zn) exc).getStatusCode() == 40201) {
            c59Var.a = new vh2("The restore credential internal service had a failure.");
        }
        Companion.getClass();
        if (l23.a(cancellationSignal)) {
            return;
        }
        onClearCredential$lambda$14$lambda$13(executor, o13Var, c59Var);
    }

    private static final g5c onClearCredential$lambda$14$lambda$13(Executor executor, o13 o13Var, c59 c59Var) {
        executor.execute(new gu2((Object) o13Var, (Object) c59Var, (byte) 22));
        return g5c.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$14$lambda$13$lambda$12(o13 o13Var, c59 c59Var) {
        o13Var.L(c59Var.a);
    }

    private static final g5c onClearCredential$lambda$17(CancellationSignal cancellationSignal, Executor executor, o13 o13Var, xh2 xh2Var) {
        Companion.getClass();
        if (!l23.a(cancellationSignal)) {
            onClearCredential$lambda$17$lambda$16(executor, o13Var);
        }
        return g5c.a;
    }

    private static final g5c onClearCredential$lambda$17$lambda$16(Executor executor, o13 o13Var) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new r03(o13Var, (byte) 6));
        return g5c.a;
    }

    private static final void onClearCredential$lambda$19(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, wh2 wh2Var, CancellationSignal cancellationSignal, Executor executor, o13 o13Var, Exception exc) {
        exc.getClass();
        Log.e(TAG, "GMS Clear credential flow failed, calling fallback");
        credentialProviderPlayServicesImpl.runFallbackClearCredFlow(wh2Var, cancellationSignal, executor, o13Var);
    }

    private static final g5c onClearCredential$lambda$7(Executor executor, o13 o13Var) {
        executor.execute(new r03(o13Var, (byte) 7));
        return g5c.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$7$lambda$6(o13 o13Var) {
        o13Var.L(new vh2("androidx.credentials.TYPE_CLEAR_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION", "clearCredentialStateAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
    }

    private static final g5c onCreateCredential$lambda$5(Executor executor, o13 o13Var) {
        executor.execute(new r03(o13Var, (byte) 3));
        return g5c.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateCredential$lambda$5$lambda$4(o13 o13Var) {
        o13Var.L(new c03("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", (byte) 1));
    }

    private static final g5c onGetCredential$lambda$1(Executor executor, o13 o13Var) {
        executor.execute(new r03(o13Var, (byte) 5));
        return g5c.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$1$lambda$0(o13 o13Var) {
        o13Var.L(new ts4("this device requires a Google Play Services update for the given feature to be supported", (byte) 1));
    }

    private static final g5c onGetCredential$lambda$3(Executor executor, o13 o13Var) {
        executor.execute(new r03(o13Var, (byte) 4));
        return g5c.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$3$lambda$2(o13 o13Var) {
        o13Var.L(new ts4("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", (byte) 1));
    }

    private final void runFallbackClearCredFlow(wh2 wh2Var, final CancellationSignal cancellationSignal, final Executor executor, final o13 o13Var) {
        q3d a = ske.a(this.context);
        a.a.getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Set set = gy4.a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((gy4) it.next()).b();
        }
        hy4.a();
        agb b = bgb.b();
        b.c = new f84[]{aed.a};
        b.a = new u39(a, (byte) 26);
        b.b = false;
        b.d = (char) 1554;
        a.e(1, b.a()).addOnSuccessListener(new vu2(new qp4() { // from class: k23
            @Override // qp4
            public final Object invoke(Object obj) {
                g5c runFallbackClearCredFlow$lambda$22;
                runFallbackClearCredFlow$lambda$22 = CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$22(cancellationSignal, executor, o13Var, (Void) obj);
                return runFallbackClearCredFlow$lambda$22;
            }
        }, (byte) 9)).addOnFailureListener(new lt((Object) this, (Object) cancellationSignal, (Object) executor, (Object) o13Var, (byte) 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g5c runFallbackClearCredFlow$lambda$22(CancellationSignal cancellationSignal, Executor executor, o13 o13Var, Void r3) {
        Companion.getClass();
        if (!l23.a(cancellationSignal)) {
            runFallbackClearCredFlow$lambda$22$lambda$21(executor, o13Var);
        }
        return g5c.a;
    }

    private static final g5c runFallbackClearCredFlow$lambda$22$lambda$21(Executor executor, o13 o13Var) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new r03(o13Var, (byte) 8));
        return g5c.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$27(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, o13 o13Var, Exception exc) {
        exc.getClass();
        Companion.getClass();
        if (l23.a(cancellationSignal)) {
            return;
        }
        runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25(exc, executor, o13Var);
    }

    private static final g5c runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25(Exception exc, Executor executor, o13 o13Var) {
        Log.w(TAG, "During clear credential sign out failed with " + exc);
        executor.execute(new gu2((Object) o13Var, (Object) exc, (byte) 21));
        return g5c.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25$lambda$24(o13 o13Var, Exception exc) {
        o13Var.L(new vh2(exc.getMessage()));
    }

    public final cy4 getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    public final boolean isAvailableOnDevice(int i) {
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context, i);
        boolean z = isGooglePlayServicesAvailable == 0;
        if (!z) {
            Log.w(TAG, "Connection with Google Play Services was not successful. Connection result is: " + new ds2(isGooglePlayServicesAvailable, null, null));
        }
        return z;
    }

    public void onClearCredential(wh2 wh2Var, CancellationSignal cancellationSignal, Executor executor, o13 o13Var) {
        throw null;
    }

    @Override // s13
    public void onCreateCredential(Context context, i03 i03Var, CancellationSignal cancellationSignal, Executor executor, o13 o13Var) {
        context.getClass();
        i03Var.getClass();
        executor.getClass();
        o13Var.getClass();
        l23 l23Var = Companion;
        l23Var.getClass();
        if (l23.a(cancellationSignal)) {
            return;
        }
        if (!(i03Var instanceof a13)) {
            fyb.i("Create Credential request is unsupported, not password or publickeycredential");
            return;
        }
        boolean isAvailableOnDevice = isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION);
        byte b = 0;
        byte b2 = 1;
        un unVar = vn.g;
        if (isAvailableOnDevice) {
            y03 y03Var = new y03(context);
            a13 a13Var = (a13) i03Var;
            y03Var.h = cancellationSignal;
            y03Var.f = o13Var;
            y03Var.g = executor;
            l23Var.getClass();
            if (l23.a(cancellationSignal)) {
                return;
            }
            h03 h03Var = new h03("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", a13Var.a, a13Var.b, null, a13Var.d, null);
            u84 u84Var = new u84(context, u84.m, unVar, ay4.c);
            agb b3 = bgb.b();
            b3.c = new f84[]{led.b};
            b3.a = new g6e(h03Var, b);
            b3.d = (char) 32704;
            Task e = u84Var.e(1, b3.a());
            e.getClass();
            e.addOnSuccessListener(new vu2(new t03(cancellationSignal, y03Var, executor, o13Var, (byte) 0), (byte) 5)).addOnFailureListener(new lt((Object) cancellationSignal, (Object) y03Var, (Object) executor, (Object) o13Var, (byte) 9));
            return;
        }
        a13 a13Var2 = (a13) i03Var;
        d23 d23Var = new d23(context);
        d23Var.h = cancellationSignal;
        d23Var.f = o13Var;
        d23Var.g = executor;
        try {
            mu8 d = d23Var.d(a13Var2);
            l23Var.getClass();
            if (l23.a(cancellationSignal)) {
                return;
            }
            u84 u84Var2 = new u84(context, u84.l, unVar, new eef((byte) 13));
            agb b4 = bgb.b();
            b4.a = new g29(u84Var2, d);
            b4.d = (char) 5407;
            u84Var2.e(0, b4.a()).addOnSuccessListener(new vu2(new u13(cancellationSignal, d23Var, b2), (byte) 7)).addOnFailureListener(new v82((Object) d23Var, (Object) cancellationSignal, (byte) 12));
        } catch (JSONException e2) {
            Companion.getClass();
            if (l23.a(cancellationSignal)) {
                return;
            }
            Executor executor2 = d23Var.g;
            if (executor2 != null) {
                executor2.execute(new z13(d23Var, e2, b2));
            } else {
                rp5.e("executor");
                throw null;
            }
        } catch (Throwable th) {
            Companion.getClass();
            if (l23.a(cancellationSignal)) {
                return;
            }
            Executor executor3 = d23Var.g;
            if (executor3 != null) {
                executor3.execute(new a23(d23Var, th, b2));
            } else {
                rp5.e("executor");
                throw null;
            }
        }
    }

    @Override // s13
    public void onGetCredential(Context context, ws4 ws4Var, CancellationSignal cancellationSignal, Executor executor, o13 o13Var) {
        un unVar;
        yn ynVar = u84.m;
        context.getClass();
        ws4Var.getClass();
        boolean z = ws4Var.b;
        List<r13> list = ws4Var.a;
        executor.getClass();
        o13Var.getClass();
        Companion.getClass();
        if (l23.a(cancellationSignal)) {
            return;
        }
        Iterator it = list.iterator();
        do {
            boolean hasNext = it.hasNext();
            unVar = vn.g;
            if (!hasNext) {
                Companion.getClass();
                for (r13 r13Var : list) {
                }
                if (!isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
                    Companion.getClass();
                    for (r13 r13Var2 : list) {
                    }
                    new w13(context).g(ws4Var, cancellationSignal, executor, o13Var);
                    return;
                }
                ss4 ss4Var = new ss4(context);
                ss4Var.h = cancellationSignal;
                ss4Var.f = o13Var;
                ss4Var.g = executor;
                Companion.getClass();
                if (l23.a(cancellationSignal)) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
                bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", z);
                bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
                List<r13> list2 = list;
                ArrayList arrayList = new ArrayList(al2.c(list2, 10));
                for (r13 r13Var3 : list2) {
                    arrayList.add(new q13(r13Var3.a, r13Var3.b, r13Var3.c, "", "", ""));
                }
                GetCredentialRequest getCredentialRequest = new GetCredentialRequest(arrayList, bundle, null, new ResultReceiver(null));
                Context context2 = ss4Var.e;
                context2.getClass();
                new u84(context2, ynVar, unVar, ay4.c).g(getCredentialRequest).addOnSuccessListener(new kx3(new t03(cancellationSignal, ss4Var, executor, o13Var, (byte) 1), (byte) 23)).addOnFailureListener(new kh(ws4Var, ss4Var, o13Var, executor, cancellationSignal));
                return;
            }
        } while (!(((r13) it.next()) instanceof ys4));
        if (!isAvailableOnDevice(MIN_GMS_APK_VERSION_DIGITAL_CRED)) {
            Companion.getClass();
            if (l23.a(cancellationSignal)) {
                return;
            }
            onGetCredential$lambda$1(executor, o13Var);
            return;
        }
        i23 i23Var = new i23(context);
        i23Var.h = cancellationSignal;
        i23Var.f = o13Var;
        i23Var.g = executor;
        Companion.getClass();
        if (l23.a(cancellationSignal)) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (r13 r13Var4 : list) {
            if (r13Var4 instanceof ys4) {
                arrayList2.add(new q13(r13Var4.a, r13Var4.b, r13Var4.c, ((ys4) r13Var4).e, "", ""));
            }
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", z);
        bundle2.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        GetCredentialRequest getCredentialRequest2 = new GetCredentialRequest(arrayList2, bundle2, null, new ResultReceiver(null));
        Context context3 = i23Var.e;
        context3.getClass();
        new u84(context3, ynVar, unVar, ay4.c).g(getCredentialRequest2).addOnSuccessListener(new vu2(new u13(cancellationSignal, i23Var, (byte) 2), (byte) 8)).addOnFailureListener(new lt2(i23Var, cancellationSignal, executor, o13Var));
    }

    @Override // s13
    public /* bridge */ /* synthetic */ void onPrepareCredential(ws4 ws4Var, CancellationSignal cancellationSignal, Executor executor, o13 o13Var) {
        super.onPrepareCredential(ws4Var, cancellationSignal, executor, o13Var);
    }

    public void onSignalCredentialState(jha jhaVar, Executor executor, o13 o13Var) {
        throw null;
    }

    public final void setGoogleApiAvailability(cy4 cy4Var) {
        cy4Var.getClass();
        this.googleApiAvailability = cy4Var;
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    @Override // s13
    public boolean isAvailableOnDevice() {
        return isAvailableOnDevice(MIN_GMS_APK_VERSION);
    }

    @Override // s13
    public /* bridge */ /* synthetic */ void onGetCredential(Context context, si8 si8Var, CancellationSignal cancellationSignal, Executor executor, o13 o13Var) {
        super.onGetCredential(context, si8Var, cancellationSignal, executor, o13Var);
    }
}
