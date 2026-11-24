// default package

import android.app.ApplicationExitInfo;
import android.content.pm.ShortcutManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class dq9 implements kq9, fu2, ee, xmb, ymb, gka, hka, Continuation, ku4, kac, dja {
    public final /* synthetic */ byte a;

    public /* synthetic */ dq9(byte b) {
        this.a = b;
    }

    public static /* bridge */ /* synthetic */ ApplicationExitInfo a(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    public static /* bridge */ /* synthetic */ ShortcutManager b(Object obj) {
        return (ShortcutManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class i() {
        return ShortcutManager.class;
    }

    public static /* synthetic */ void m(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void n(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void o(Throwable th) {
        throw new IllegalStateException(th);
    }

    @Override // fu2
    public final void accept(Object obj) {
        ((fr9) obj).b.release();
    }

    @Override // kq9
    public final Object apply(Object obj) {
        Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                mx6 a = rb0.a();
                a.m0(rawQuery.getString(1));
                a.d = gl8.b(rawQuery.getInt(2));
                String string = rawQuery.getString(3);
                a.c = string == null ? null : Base64.decode(string, 0);
                arrayList.add(a.u());
            }
            return arrayList;
        } finally {
            rawQuery.close();
        }
    }

    @Override // hka
    public final void d(Object obj, float f) {
        m6a m6aVar = (m6a) obj;
        m6aVar.n = f;
        m6aVar.invalidate();
    }

    @Override // ymb
    public final void e(int i, View view) {
        switch (this.a) {
            case 7:
                int i2 = sv9.x;
                ((sv9) view).setTextColor(i);
                break;
            default:
                ((iva) view).setColor(i);
                break;
        }
    }

    @Override // dja
    public final float f(RecyclerView recyclerView) {
        return fja.j(recyclerView);
    }

    @Override // xmb
    public final int g(View view) {
        switch (this.a) {
            case 6:
                return ((sv9) view).w;
            default:
                return ((iva) view).y;
        }
    }

    @Override // gka
    public final float get(Object obj) {
        return ((m6a) obj).n;
    }

    @Override // dja
    public final RecyclerView h(View view) {
        return ((kxa) view).a;
    }

    @Override // kac
    public final Object j(Integer num, Object obj) {
        Integer num2 = (Integer) obj;
        return num.intValue() == 0 ? jb6.G(num2.intValue(), "MaximumReactionsValue", new Object[0]) : String.valueOf(num2);
    }

    @Override // ku4
    public final Object l(Object obj) {
        int i = tca.T2;
        return 0;
    }

    @Override // dja
    public final /* synthetic */ void q(RecyclerView recyclerView) {
        hg9.d(recyclerView);
    }

    @Override // ee
    public final void r(he heVar, int i) {
        switch (this.a) {
            case 4:
                heVar.dismiss();
                break;
            case 5:
                heVar.dismiss();
                break;
            case 14:
                break;
            case 15:
                heVar.dismiss();
                break;
            case 16:
                heVar.dismiss();
                break;
            case 17:
                heVar.dismiss();
                break;
            default:
                wsa.g2(new p5c(6, null));
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        boolean z;
        if (task.isSuccessful()) {
            b90 b90Var = (b90) task.getResult();
            f8e f8eVar = f8e.b;
            f8eVar.f("Crashlytics report successfully enqueued to DataTransport: " + b90Var.b);
            File file = b90Var.c;
            if (file.delete()) {
                f8eVar.f("Deleted report file: " + file.getPath());
            } else {
                f8eVar.l("Crashlytics could not delete report file: " + file.getPath(), null);
            }
            z = true;
        } else {
            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
            z = false;
        }
        return Boolean.valueOf(z);
    }

    private final void s(he heVar, int i) {
    }
}
