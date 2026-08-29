package b6;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.internal.clearcut.b2;
import e6.h;
import h8.o;
import k8.a1;
import kotlin.jvm.internal.j;
import m.s3;
import m5.e;
import m7.f;
import s5.t;
import s5.w;
import s5.x;
import u6.g;
import z5.p;
import z6.l1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    public com.google.android.gms.common.api.c a(Context context, Looper looper, s3 commonSettings, Object obj, k kVar, l lVar) {
        switch (this.a) {
            case 4:
                o oVar = (o) obj;
                if (oVar == null) {
                    oVar = new o(new a5.c());
                }
                return new q7.b(context, looper, commonSettings, kVar, lVar, oVar.a);
            case 5:
                return new g(context, looper, commonSettings, (i5.b) obj, kVar, lVar);
            case 6:
                return new e(context, looper, commonSettings, (GoogleSignInOptions) obj, kVar, lVar);
            case 7:
                return new a1(context, looper, kVar, lVar, commonSettings);
            case 8:
            case 9:
            case 13:
            case 15:
            default:
                switch (this.a) {
                    case 0:
                        return new d(context, looper, commonSettings, (p) obj, kVar, lVar);
                    case 1:
                        return new b7.b(context, looper, 19, commonSettings, kVar, lVar, 0);
                    case 2:
                        return new d7.k(context, looper, kVar, lVar, commonSettings);
                    case 3:
                        return new h(context, looper, 308, commonSettings, kVar, lVar, 0);
                    case 8:
                        return new v6.e(context, looper, 126, commonSettings, kVar, lVar, 0);
                    case 9:
                        com.google.android.gms.common.api.a apiOptions = (com.google.android.gms.common.api.a) obj;
                        j.e(context, "context");
                        j.e(looper, "looper");
                        j.e(commonSettings, "commonSettings");
                        j.e(apiOptions, "apiOptions");
                        return new f(context, looper, 380, commonSettings, kVar, lVar, 0);
                    case 13:
                        com.google.android.gms.common.api.a apiOptions2 = (com.google.android.gms.common.api.a) obj;
                        j.e(context, "context");
                        j.e(looper, "looper");
                        j.e(commonSettings, "commonSettings");
                        j.e(apiOptions2, "apiOptions");
                        return new t6.e(context, looper, 352, commonSettings, kVar, lVar, 0);
                    case 15:
                        return new u6.c(context, looper, kVar, lVar, commonSettings);
                    default:
                        throw new UnsupportedOperationException("buildClient must be implemented");
                }
            case 10:
                o5.e eVar = (o5.e) obj;
                z5.l.i(eVar, "Setting the API options is required.");
                return new x(context, looper, commonSettings, eVar.a, 0, eVar.c, eVar.d, kVar, lVar);
            case 11:
                o5.e eVar2 = (o5.e) obj;
                z5.l.i(eVar2, "Setting the API options is required.");
                return new w(context, looper, commonSettings, eVar2.a, 0, eVar2.b, eVar2.c, kVar, lVar);
            case 12:
                return new t(context, looper, 161, commonSettings, kVar, lVar, 0);
            case 14:
                return new b2(context, looper, 40, commonSettings, kVar, lVar, 0);
            case 16:
                return new n7.a(context, looper, kVar, lVar, commonSettings);
            case 17:
                return new l1(context, looper, 148, commonSettings, kVar, lVar, 0);
            case 18:
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
                return new a8.a(context, looper, commonSettings, bundle, kVar, lVar);
            case 19:
                throw a4.w.j(obj);
        }
    }
}
