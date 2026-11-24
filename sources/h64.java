// default package

import android.util.Log;
import android.view.WindowManager;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.pnv.internal.FirebasePhoneNumberVerificationRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.io.IOException;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class h64 implements lr2, x76, y76, ee, Continuation, OnFailureListener, gka, hka {
    public final /* synthetic */ byte a;

    public /* synthetic */ h64(h74 h74Var) {
        this.a = (byte) 6;
    }

    public static /* synthetic */ void b(Object obj, String str) {
        throw new IOException(str + obj);
    }

    @Override // lr2
    public final Object X(sm2 sm2Var) {
        ti4 lambda$getComponents$0;
        aj4 components$lambda$0;
        hj4 components$lambda$02;
        kj4 components$lambda$1;
        switch (this.a) {
            case 0:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 1:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 2:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            case 3:
                e26 e26Var = ExecutorsRegistrar.a;
                return m6c.a;
            case 19:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(sm2Var);
                return lambda$getComponents$0;
            case 21:
                components$lambda$0 = FirebasePhoneNumberVerificationRegistrar.getComponents$lambda$0(sm2Var);
                return components$lambda$0;
            case 23:
                components$lambda$02 = FirebaseSessionsRegistrar.getComponents$lambda$0(sm2Var);
                return components$lambda$02;
            default:
                components$lambda$1 = FirebaseSessionsRegistrar.getComponents$lambda$1(sm2Var);
                return components$lambda$1;
        }
    }

    @Override // y76
    public final void c(Object obj, lk4 lk4Var) {
        ((pe8) obj).d(new oe8(lk4Var));
    }

    @Override // hka
    public final void d(Object obj, float f) {
        tl4 tl4Var = (tl4) obj;
        switch (this.a) {
            case 27:
                WindowManager.LayoutParams layoutParams = tl4Var.e;
                tl4Var.B = f;
                layoutParams.x = (int) f;
                tl4Var.r();
                break;
            default:
                WindowManager.LayoutParams layoutParams2 = tl4Var.e;
                tl4Var.C = f;
                layoutParams2.y = (int) f;
                tl4Var.r();
                break;
        }
    }

    @Override // gka
    public final float get(Object obj) {
        tl4 tl4Var = (tl4) obj;
        switch (this.a) {
            case 26:
                return tl4Var.B;
            default:
                return tl4Var.C;
        }
    }

    @Override // x76
    public final void invoke(Object obj) {
        pe8 pe8Var = (pe8) obj;
        switch (this.a) {
            case 5:
                pe8Var.F(new u64(2, new rq2("Player release timed out."), 1003));
                break;
            default:
                pe8Var.onRenderedFirstFrame();
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        Log.e("FirebaseCrashlytics", "Error fetching settings.", exc);
    }

    @Override // ee
    public final void r(he heVar, int i) {
        heVar.dismiss();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        int i;
        switch (this.a) {
            case 9:
                i = 403;
                break;
            default:
                i = -1;
                break;
        }
        return Integer.valueOf(i);
    }

    public /* synthetic */ h64(byte b) {
        this.a = b;
    }
}
