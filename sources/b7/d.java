package b7;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.clearcut.b2;
import i8.a1;
import m.t3;
import x6.l1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i9) {
        this.a = i9;
    }

    public com.google.android.gms.common.api.c a(Context context, Looper looper, t3 commonSettings, Object obj, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar) {
        switch (this.a) {
            case 2:
                f8.o oVar = (f8.o) obj;
                if (oVar == null) {
                    oVar = new f8.o(new com.google.android.gms.internal.cast.a());
                }
                return new o7.b(context, looper, commonSettings, kVar, lVar, oVar.a);
            case 3:
                return new s6.g(context, looper, commonSettings, (g5.c) obj, kVar, lVar);
            case 4:
                return new k5.e(context, looper, commonSettings, (GoogleSignInOptions) obj, kVar, lVar);
            case 5:
                return new a1(context, looper, kVar, lVar, commonSettings);
            case 6:
            case 7:
            case 11:
            case 13:
            default:
                switch (this.a) {
                    case 0:
                        return new m(context, looper, kVar, lVar, commonSettings);
                    case 1:
                        return new c6.h(context, looper, 308, commonSettings, kVar, lVar, 0);
                    case 6:
                        return new t6.e(context, looper, 126, commonSettings, kVar, lVar, 0);
                    case 7:
                        com.google.android.gms.common.api.a apiOptions = (com.google.android.gms.common.api.a) obj;
                        kotlin.jvm.internal.i.e(context, "context");
                        kotlin.jvm.internal.i.e(looper, "looper");
                        kotlin.jvm.internal.i.e(commonSettings, "commonSettings");
                        kotlin.jvm.internal.i.e(apiOptions, "apiOptions");
                        return new k7.f(context, looper, 380, commonSettings, kVar, lVar, 0);
                    case 11:
                        com.google.android.gms.common.api.a apiOptions2 = (com.google.android.gms.common.api.a) obj;
                        kotlin.jvm.internal.i.e(context, "context");
                        kotlin.jvm.internal.i.e(looper, "looper");
                        kotlin.jvm.internal.i.e(commonSettings, "commonSettings");
                        kotlin.jvm.internal.i.e(apiOptions2, "apiOptions");
                        return new r6.e(context, looper, 352, commonSettings, kVar, lVar, 0);
                    case 13:
                        return new s6.c(context, looper, kVar, lVar, commonSettings);
                    case 18:
                        return new z5.c(context, looper, commonSettings, (x5.p) obj, kVar, lVar);
                    case 19:
                        return new z6.b(context, looper, 19, commonSettings, kVar, lVar, 0);
                    default:
                        throw new UnsupportedOperationException("buildClient must be implemented");
                }
            case 8:
                m5.e eVar = (m5.e) obj;
                x5.l.i(eVar, "Setting the API options is required.");
                return new q5.x(context, looper, commonSettings, eVar.a, 0, eVar.c, eVar.d, kVar, lVar);
            case 9:
                m5.e eVar2 = (m5.e) obj;
                x5.l.i(eVar2, "Setting the API options is required.");
                return new q5.w(context, looper, commonSettings, eVar2.a, 0, eVar2.b, eVar2.c, kVar, lVar);
            case 10:
                return new q5.t(context, looper, 161, commonSettings, kVar, lVar, 0);
            case 12:
                return new b2(context, looper, 40, commonSettings, kVar, lVar, 0);
            case 14:
                return new l7.a(context, looper, kVar, lVar, commonSettings);
            case 15:
                return new l1(context, looper, 148, commonSettings, kVar, lVar, 0);
            case 16:
                commonSettings.getClass();
                Integer num = (Integer) commonSettings.h;
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
                return new y7.a(context, looper, commonSettings, bundle, kVar, lVar);
            case 17:
                throw aa.d.j(obj);
        }
    }
}
