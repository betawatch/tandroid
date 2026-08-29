package eg;

import android.content.pm.ShortcutManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.window.OnBackInvokedDispatcher;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import ih.q5;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.mc0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements org.telegram.ui.ActionBar.b2, mc0, f3.f, g4.g, j3.f, Continuation, a9.e, GenericProvider, p8.e, f5.j {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ ShortcutManager d(Object obj) {
        return (ShortcutManager) obj;
    }

    public static /* bridge */ /* synthetic */ FingerprintManager f(Object obj) {
        return (FingerprintManager) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher i(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static /* bridge */ /* synthetic */ Class k() {
        return ShortcutManager.class;
    }

    @Override // a9.e
    public Object I0(a5.j jVar) {
        Set r6 = jVar.r(ha.a.class);
        ha.c cVar = ha.c.c;
        if (cVar == null) {
            synchronized (ha.c.class) {
                try {
                    cVar = ha.c.c;
                    if (cVar == null) {
                        cVar = new ha.c(0);
                        ha.c.c = cVar;
                    }
                } finally {
                }
            }
        }
        return new ha.b(r6, cVar);
    }

    @Override // f3.f
    public Object apply(Object obj) {
        switch (this.a) {
            case 6:
                Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (rawQuery.moveToNext()) {
                        v5.c a2 = y2.i.a();
                        a2.h(rawQuery.getString(1));
                        a2.d = i3.a.b(rawQuery.getInt(2));
                        String string = rawQuery.getString(3);
                        a2.b = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(a2.d());
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
            default:
                return new k3.f((f5.y) obj);
        }
    }

    @Override // g4.g
    public boolean b(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    @Override // j3.f
    public j3.g c(Bundle bundle) {
        return new g5.b(bundle.getInt(g5.b.f, -1), bundle.getInt(g5.b.h, -1), bundle.getInt(g5.b.n, -1), bundle.getByteArray(g5.b.r));
    }

    @Override // org.telegram.ui.Components.mc0
    public String e(int i10) {
        switch (this.a) {
            case 1:
                return String.valueOf(i10);
            default:
                return String.format("%02d", Integer.valueOf(i10 * 5));
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                break;
            case 3:
                c2Var.dismiss();
                break;
            case 4:
                c2Var.dismiss();
                break;
            case 22:
                c2Var.dismiss();
                break;
            default:
                c2Var.dismiss();
                break;
        }
    }

    @Override // f5.j
    public void invoke(Object obj) {
        j3.a2 a2Var = (j3.a2) obj;
        switch (this.a) {
            case 26:
                a2Var.onPlayerError(new j3.n(2, new a6.b("Player release timed out."), 1003));
                break;
            default:
                a2Var.onSeekProcessed();
                break;
        }
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        int i10 = q5.g0;
        return 0;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z10;
        if (task.isSuccessful()) {
            g9.b bVar = (g9.b) task.getResult();
            String str = "Crashlytics report successfully enqueued to DataTransport: " + bVar.b;
            d9.d dVar = d9.d.a;
            dVar.b(str);
            File file = bVar.c;
            z10 = true;
            if (file.delete()) {
                dVar.b("Deleted report file: " + file.getPath());
            } else {
                dVar.d("Crashlytics could not delete report file: " + file.getPath(), null);
            }
        } else {
            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public /* synthetic */ c(bg.c2 c2Var) {
        this.a = 15;
    }

    private final void n(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
    }
}
