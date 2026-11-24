// default package

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class or5 {
    public final /* synthetic */ byte a;

    public /* synthetic */ or5(byte b) {
        this.a = b;
    }

    public final zz4 a(Context context, Looper looper, ovb ovbVar, Object obj, f05 f05Var, g05 g05Var) {
        byte b = this.a;
        switch (b) {
            case 2:
                Object obj2 = ovbVar.f;
                Integer num = (Integer) ovbVar.h;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new gja(context, looper, ovbVar, bundle, f05Var, g05Var);
            case 3:
                obj.getClass();
                throw new ClassCastException();
            case 4:
            case 5:
            case 6:
            case 8:
            case 11:
            case 14:
            case 15:
            case 17:
            case 19:
            default:
                switch (b) {
                    case 0:
                        context.getClass();
                        looper.getClass();
                        ovbVar.getClass();
                        ((vo) obj).getClass();
                        return new zl5(nm7.W5, f05Var, g05Var, ovbVar, context, looper);
                    case 1:
                        context.getClass();
                        looper.getClass();
                        ovbVar.getClass();
                        ((vo) obj).getClass();
                        return new m2d(429, f05Var, g05Var, ovbVar, context, looper);
                    case 2:
                    case 3:
                    case 7:
                    case 9:
                    case 10:
                    case 12:
                    case 13:
                    case 16:
                    case 18:
                    default:
                        throw new UnsupportedOperationException("buildClient must be implemented");
                    case 4:
                        return new p5d(nm7.e5, f05Var, g05Var, ovbVar, context, looper);
                    case 5:
                        return new q3d(449, f05Var, g05Var, ovbVar, context, looper);
                    case 6:
                        return new k5d(context, looper, ovbVar, (oib) obj, f05Var, g05Var);
                    case 8:
                        return new t5d(f05Var, g05Var, ovbVar, context, looper);
                    case 11:
                        return new bjf(nm7.J1, f05Var, g05Var, ovbVar, context, looper);
                    case 14:
                        return new tpd(f05Var, g05Var, ovbVar, context, looper);
                    case 15:
                        return new k8d(19, f05Var, g05Var, ovbVar, context, looper);
                    case 17:
                        return new dpd(457, f05Var, g05Var, ovbVar, context, looper);
                    case 19:
                        context.getClass();
                        looper.getClass();
                        ovbVar.getClass();
                        ((vo) obj).getClass();
                        return new b2f(380, f05Var, g05Var, ovbVar, context, looper);
                }
            case 7:
                return new a6d(context, looper, ovbVar, (z5d) obj, f05Var, g05Var);
            case 9:
                return new b6d(context, looper, ovbVar, (GoogleSignInOptions) obj, f05Var, g05Var);
            case 10:
                return new cpe(40, f05Var, g05Var, ovbVar, context, looper);
            case 12:
                emc emcVar = (emc) obj;
                if (emcVar == null) {
                    emcVar = new emc(new d10());
                }
                return new w7d(emcVar.a, f05Var, g05Var, ovbVar, context, looper);
            case 13:
                ge1 ge1Var = (ge1) obj;
                ite.i(ge1Var, "Setting the API options is required.");
                return new mjf(context, looper, ovbVar, ge1Var.a, ge1Var.c, ge1Var.d, f05Var, g05Var);
            case 16:
                ge1 ge1Var2 = (ge1) obj;
                ite.i(ge1Var2, "Setting the API options is required.");
                return new zif(context, looper, ovbVar, ge1Var2.a, ge1Var2.b, ge1Var2.c, f05Var, g05Var);
            case 18:
                return new lme(f05Var, g05Var, ovbVar, context, looper);
            case 20:
                return new g7f(nm7.q2, f05Var, g05Var, ovbVar, context, looper);
            case 21:
                return new p8d(f05Var, g05Var, ovbVar, context, looper);
            case 22:
                return new r9f(nm7.d2, f05Var, g05Var, ovbVar, context, looper);
        }
    }
}
