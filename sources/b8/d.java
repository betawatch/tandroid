package b8;

import ag.j;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import c3.h0;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.internal.clearcut.y1;
import h6.s;
import h6.v;
import h6.w;
import kotlin.jvm.internal.i;
import m.r3;
import o6.p;
import o7.l1;
import w8.o;
import z8.z0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class d {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i10) {
        this.a = i10;
    }

    public com.google.android.gms.common.api.c a(Context context, Looper looper, r3 commonSettings, Object obj, k kVar, l lVar) {
        switch (this.a) {
            case 1:
                d6.e eVar = (d6.e) obj;
                o6.l.i(eVar, "Setting the API options is required.");
                return new w(context, looper, commonSettings, eVar.a, 0, eVar.c, eVar.d, kVar, lVar);
            case 2:
                d6.e eVar2 = (d6.e) obj;
                o6.l.i(eVar2, "Setting the API options is required.");
                return new v(context, looper, commonSettings, eVar2.a, 0, eVar2.b, eVar2.c, kVar, lVar);
            case 3:
                return new s(context, looper, 161, commonSettings, kVar, lVar, 0);
            case 4:
            case 6:
            case 11:
            case 12:
            case 13:
            case 14:
            default:
                switch (this.a) {
                    case 0:
                        com.google.android.gms.common.api.a apiOptions = (com.google.android.gms.common.api.a) obj;
                        i.e(context, "context");
                        i.e(looper, "looper");
                        i.e(commonSettings, "commonSettings");
                        i.e(apiOptions, "apiOptions");
                        return new g(context, looper, 380, commonSettings, kVar, lVar, 0);
                    case 4:
                        com.google.android.gms.common.api.a apiOptions2 = (com.google.android.gms.common.api.a) obj;
                        i.e(context, "context");
                        i.e(looper, "looper");
                        i.e(commonSettings, "commonSettings");
                        i.e(apiOptions2, "apiOptions");
                        return new i7.e(context, looper, 352, commonSettings, kVar, lVar, 0);
                    case 6:
                        return new j7.c(context, looper, kVar, lVar, commonSettings);
                    case 11:
                        return new q6.c(context, looper, commonSettings, (p) obj, kVar, lVar);
                    case 12:
                        return new q7.b(context, looper, 19, commonSettings, kVar, lVar, 0);
                    case 13:
                        return new s7.k(context, looper, kVar, lVar, commonSettings);
                    case 14:
                        return new t6.i(context, looper, 308, commonSettings, kVar, lVar, 0);
                    case 19:
                        return new k7.e(context, looper, 126, commonSettings, kVar, lVar, 0);
                    default:
                        throw new UnsupportedOperationException("buildClient must be implemented");
                }
            case 5:
                return new y1(context, looper, 40, commonSettings, kVar, lVar, 0);
            case 7:
                return new c8.a(context, looper, kVar, lVar, commonSettings);
            case 8:
                return new l1(context, looper, 148, commonSettings, kVar, lVar, 0);
            case 9:
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
                return new p8.a(context, looper, commonSettings, bundle, kVar, lVar);
            case 10:
                throw h0.k(obj);
            case 15:
                o oVar = (o) obj;
                if (oVar == null) {
                    oVar = new o(new j());
                }
                return new f8.b(context, looper, commonSettings, kVar, lVar, oVar.a);
            case 16:
                return new j7.g(context, looper, commonSettings, (x5.b) obj, kVar, lVar);
            case 17:
                return new b6.e(context, looper, commonSettings, (GoogleSignInOptions) obj, kVar, lVar);
            case 18:
                return new z0(context, looper, kVar, lVar, commonSettings);
        }
    }
}
