package a8;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import b6.m;
import b6.q;
import b7.q1;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.internal.clearcut.a2;
import j8.o;
import m.s3;
import m8.z0;
import u5.t;
import u5.w;
import u5.x;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class j {
    public final /* synthetic */ int a;

    public /* synthetic */ j(int i10) {
        this.a = i10;
    }

    public com.google.android.gms.common.api.c a(Context context, Looper looper, s3 commonSettings, Object obj, k kVar, l lVar) {
        switch (this.a) {
            case 0:
                return new p7.a(context, looper, kVar, lVar, commonSettings);
            case 1:
                return new q1(context, looper, 148, commonSettings, kVar, lVar, 0);
            case 2:
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
                return new c8.a(context, looper, commonSettings, bundle, kVar, lVar);
            case 3:
                throw android.support.v4.media.a.j(obj);
            case 4:
            case 5:
            case 6:
            case 7:
            case 12:
            case 13:
            case 17:
            default:
                switch (this.a) {
                    case 4:
                        return new d6.c(context, looper, commonSettings, (q) obj, kVar, lVar);
                    case 5:
                        return new d7.b(context, looper, 19, commonSettings, kVar, lVar, 0);
                    case 6:
                        return new f7.l(context, looper, kVar, lVar, commonSettings);
                    case 7:
                        return new g6.h(context, looper, 308, commonSettings, kVar, lVar, 0);
                    case 12:
                        return new x6.e(context, looper, 126, commonSettings, kVar, lVar, 0);
                    case 13:
                        com.google.android.gms.common.api.a apiOptions = (com.google.android.gms.common.api.a) obj;
                        kotlin.jvm.internal.j.e(context, "context");
                        kotlin.jvm.internal.j.e(looper, "looper");
                        kotlin.jvm.internal.j.e(commonSettings, "commonSettings");
                        kotlin.jvm.internal.j.e(apiOptions, "apiOptions");
                        return new o7.f(context, looper, 380, commonSettings, kVar, lVar, 0);
                    case 17:
                        com.google.android.gms.common.api.a apiOptions2 = (com.google.android.gms.common.api.a) obj;
                        kotlin.jvm.internal.j.e(context, "context");
                        kotlin.jvm.internal.j.e(looper, "looper");
                        kotlin.jvm.internal.j.e(commonSettings, "commonSettings");
                        kotlin.jvm.internal.j.e(apiOptions2, "apiOptions");
                        return new v6.e(context, looper, 352, commonSettings, kVar, lVar, 0);
                    case 19:
                        return new w6.c(context, looper, kVar, lVar, commonSettings);
                    default:
                        throw new UnsupportedOperationException("buildClient must be implemented");
                }
            case 8:
                o oVar = (o) obj;
                if (oVar == null) {
                    oVar = new o(new c5.c());
                }
                return new s7.b(context, looper, commonSettings, kVar, lVar, oVar.a);
            case 9:
                return new w6.g(context, looper, commonSettings, (k5.b) obj, kVar, lVar);
            case 10:
                return new o5.e(context, looper, commonSettings, (GoogleSignInOptions) obj, kVar, lVar);
            case 11:
                return new z0(context, looper, kVar, lVar, commonSettings);
            case 14:
                q5.e eVar = (q5.e) obj;
                m.i(eVar, "Setting the API options is required.");
                return new x(context, looper, commonSettings, eVar.a, 0, eVar.c, eVar.d, kVar, lVar);
            case 15:
                q5.e eVar2 = (q5.e) obj;
                m.i(eVar2, "Setting the API options is required.");
                return new w(context, looper, commonSettings, eVar2.a, 0, eVar2.b, eVar2.c, kVar, lVar);
            case 16:
                return new t(context, looper, 161, commonSettings, kVar, lVar, 0);
            case 18:
                return new a2(context, looper, 40, commonSettings, kVar, lVar, 0);
        }
    }
}
