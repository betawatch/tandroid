package b1;

import ai.s;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import dd.k;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import od.l;
import v0.h;
import w0.i;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements l {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    @Override // od.l
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Executor executor = (Executor) this.b;
                h hVar = (h) this.c;
                i e10 = (i) obj;
                j.e(e10, "e");
                executor.execute(new g(hVar, e10, 1));
                break;
            case 1:
                CancellationSignal cancellationSignal = (CancellationSignal) this.b;
                c1.e eVar = (c1.e) this.c;
                Context context = eVar.e;
                z5.f fVar = (z5.f) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.h.a(cancellationSignal)) {
                    Intent intent = new Intent(context, (Class<?>) HiddenActivity.class);
                    d.a(eVar.i, intent, "BEGIN_SIGN_IN");
                    intent.putExtra("EXTRA_FLOW_PENDING_INTENT", fVar.a);
                    try {
                        context.startActivity(intent);
                    } catch (Exception unused) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.h.a(cancellationSignal)) {
                            eVar.f().execute(new s(eVar, 18));
                        }
                    }
                }
                return k.a;
            case 2:
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.b;
                d1.e eVar2 = (d1.e) this.c;
                Context context2 = eVar2.e;
                PendingIntent result = (PendingIntent) obj;
                j.e(result, "result");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.h.a(cancellationSignal2)) {
                    Intent intent2 = new Intent(context2, (Class<?>) HiddenActivity.class);
                    d.a(eVar2.i, intent2, "CREATE_PUBLIC_KEY_CREDENTIAL");
                    intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", result);
                    try {
                        context2.startActivity(intent2);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.h.a(cancellationSignal2)) {
                            Executor executor2 = eVar2.g;
                            if (executor2 == null) {
                                j.h("executor");
                                throw null;
                            }
                            executor2.execute(new d1.d(eVar2, 0));
                        }
                    }
                }
                return k.a;
            default:
                xd.c cVar = (xd.c) this.b;
                cVar.c.removeCallbacks((u9.k) this.c);
                break;
        }
        return k.a;
    }
}
