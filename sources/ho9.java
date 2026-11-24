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
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class ho9 implements jo9, us2, ed, wkb, xkb, eia, fia, Continuation, js4, j8c, bha, OnFailureListener {
    public final /* synthetic */ byte a;

    public /* synthetic */ ho9(byte b) {
        this.a = b;
    }

    public static /* bridge */ /* synthetic */ ApplicationExitInfo a(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    public static /* bridge */ /* synthetic */ ShortcutManager f(Object obj) {
        return (ShortcutManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class j() {
        return ShortcutManager.class;
    }

    public static /* synthetic */ void l(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void n(Throwable th) {
        throw new IllegalStateException(th);
    }

    @Override // us2
    public final void accept(Object obj) {
        ((ep9) obj).b.release();
    }

    @Override // jo9
    public final Object apply(Object obj) {
        Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                mv6 a = ra0.a();
                a.j0(rawQuery.getString(1));
                a.d = dj8.b(rawQuery.getInt(2));
                String string = rawQuery.getString(3);
                a.c = string == null ? null : Base64.decode(string, 0);
                arrayList.add(a.o());
            }
            return arrayList;
        } finally {
            rawQuery.close();
        }
    }

    @Override // fia
    public final void b(Object obj, float f) {
        k4a k4aVar = (k4a) obj;
        k4aVar.n = f;
        k4aVar.invalidate();
    }

    @Override // bha
    public final float c(RecyclerView recyclerView) {
        return dha.j(recyclerView);
    }

    @Override // xkb
    public final void d(int i, View view) {
        switch (this.a) {
            case 6:
                int i2 = qt9.x;
                ((qt9) view).setTextColor(i);
                break;
            default:
                ((fta) view).setColor(i);
                break;
        }
    }

    @Override // wkb
    public final int e(View view) {
        switch (this.a) {
            case 5:
                return ((qt9) view).w;
            default:
                return ((fta) view).y;
        }
    }

    @Override // j8c
    public final Object g(Integer num, Object obj) {
        Integer num2 = (Integer) obj;
        return num.intValue() == 0 ? k96.G(num2.intValue(), "MaximumReactionsValue", new Object[0]) : String.valueOf(num2);
    }

    @Override // eia
    public final float get(Object obj) {
        return ((k4a) obj).n;
    }

    @Override // bha
    public final RecyclerView h(View view) {
        return ((gva) view).a;
    }

    @Override // js4
    public final Object m(Object obj) {
        int i = taa.T2;
        return 0;
    }

    @Override // bha
    public final /* synthetic */ void t(RecyclerView recyclerView) {
        de9.d(recyclerView);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        boolean z;
        if (task.isSuccessful()) {
            b80 b80Var = (b80) task.getResult();
            c6e c6eVar = c6e.b;
            c6eVar.g("Crashlytics report successfully enqueued to DataTransport: " + b80Var.b);
            File file = b80Var.c;
            if (file.delete()) {
                c6eVar.g("Deleted report file: " + file.getPath());
            } else {
                c6eVar.l("Crashlytics could not delete report file: " + file.getPath(), null);
            }
            z = true;
        } else {
            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        switch (this.a) {
            case 3:
                hdVar.dismiss();
                break;
            case 4:
                hdVar.dismiss();
                break;
            case 13:
                break;
            case 14:
                hdVar.dismiss();
                break;
            case 15:
                hdVar.dismiss();
                break;
            case 16:
                hdVar.dismiss();
                break;
            default:
                vqa.g2(new p3c(6, null));
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
    }

    private final void p(hd hdVar, int i) {
    }
}
