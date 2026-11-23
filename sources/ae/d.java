package ae;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import androidx.credentials.playservices.controllers.identitycredentials.IdentityCredentialApiHiddenActivity;
import gd.k;
import j7.m;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import m9.u;
import rd.l;
import v0.g;
import w0.i;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements l {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // rd.l
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                e eVar = (e) this.b;
                eVar.c.removeCallbacks((u) this.c);
                break;
            case 1:
                Executor executor = (Executor) this.b;
                g gVar = (g) this.c;
                i e10 = (i) obj;
                j.e(e10, "e");
                executor.execute(new b1.g(gVar, e10, 1));
                break;
            case 2:
                CancellationSignal cancellationSignal = (CancellationSignal) this.b;
                c1.f fVar = (c1.f) this.c;
                Context context = fVar.e;
                a6.f fVar2 = (a6.f) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a(cancellationSignal)) {
                    Intent intent = new Intent(context, (Class<?>) HiddenActivity.class);
                    b1.d.a(fVar.i, intent, "BEGIN_SIGN_IN");
                    intent.putExtra("EXTRA_FLOW_PENDING_INTENT", fVar2.a);
                    try {
                        context.startActivity(intent);
                    } catch (Exception unused) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.g.a(cancellationSignal)) {
                            fVar.g().execute(new a3.f(fVar, 28));
                        }
                    }
                }
                return k.a;
            case 3:
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.b;
                d1.e eVar2 = (d1.e) this.c;
                Context context2 = eVar2.e;
                PendingIntent result = (PendingIntent) obj;
                j.e(result, "result");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a(cancellationSignal2)) {
                    Intent intent2 = new Intent(context2, (Class<?>) HiddenActivity.class);
                    b1.d.a(eVar2.i, intent2, "CREATE_PUBLIC_KEY_CREDENTIAL");
                    intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", result);
                    try {
                        context2.startActivity(intent2);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.g.a(cancellationSignal2)) {
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
                CancellationSignal cancellationSignal3 = (CancellationSignal) this.b;
                g1.a aVar = (g1.a) this.c;
                Context context3 = aVar.e;
                m mVar = (m) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a(cancellationSignal3)) {
                    Intent intent3 = new Intent(context3, (Class<?>) IdentityCredentialApiHiddenActivity.class);
                    intent3.setFlags(65536);
                    intent3.putExtra("RESULT_RECEIVER", b1.d.d(aVar.i));
                    intent3.putExtra("EXTRA_FLOW_PENDING_INTENT", mVar.a);
                    intent3.putExtra("EXTRA_ERROR_NAME", "GET_UNKNOWN");
                    context3.startActivity(intent3);
                }
                return k.a;
        }
        return k.a;
    }
}
