package ec;

import android.os.AsyncTask;
import androidx.biometric.e;
import fc.g;
import hc.c;
import j7.p8;
import java.util.Locale;
import o5.i;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ao0;
import org.telegram.ui.gl0;
import org.telegram.ui.lo0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class a extends AsyncTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ gc.a b;
    public final /* synthetic */ ao0 c;
    public final /* synthetic */ i d;

    public a(i iVar, String str, gc.a aVar, ao0 ao0Var) {
        this.d = iVar;
        this.a = str;
        this.b = aVar;
        this.c = ao0Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        i iVar = this.d;
        try {
            e c3 = c.c(p8.a(this.b), new hc.a(this.a));
            Object obj = iVar.b;
            return new b(c3, null);
        } catch (g e6) {
            Object obj2 = iVar.b;
            return new b(null, e6);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.b;
        e eVar = bVar.a;
        ao0 ao0Var = this.c;
        if (eVar != null) {
            lo0 lo0Var = ao0Var.a;
            if (lo0Var.N0) {
                return;
            }
            lo0Var.t0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) eVar.c, (String) eVar.b);
            AndroidUtilities.runOnUIThread(new gl0(ao0Var, 8));
            return;
        }
        Exception exc = bVar.b;
        if (exc != null) {
            ao0Var.a(exc);
        } else {
            ao0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
