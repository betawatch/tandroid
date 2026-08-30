package ec;

import a3.c;
import android.os.AsyncTask;
import androidx.biometric.e;
import fc.g;
import j7.o8;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.el0;
import org.telegram.ui.jo0;
import org.telegram.ui.yn0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class a extends AsyncTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ gc.a b;
    public final /* synthetic */ yn0 c;
    public final /* synthetic */ c d;

    public a(c cVar, String str, gc.a aVar, yn0 yn0Var) {
        this.d = cVar;
        this.a = str;
        this.b = aVar;
        this.c = yn0Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        c cVar = this.d;
        try {
            e c3 = hc.b.c(o8.a(this.b), new com.google.android.gms.internal.clearcut.e(this.a));
            Object obj = cVar.b;
            return new b(c3, null);
        } catch (g e) {
            Object obj2 = cVar.b;
            return new b(null, e);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.b;
        e eVar = bVar.a;
        yn0 yn0Var = this.c;
        if (eVar != null) {
            jo0 jo0Var = yn0Var.a;
            if (jo0Var.N0) {
                return;
            }
            jo0Var.t0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) eVar.c, (String) eVar.b);
            AndroidUtilities.runOnUIThread(new el0(yn0Var, 8));
            return;
        }
        Exception exc = bVar.b;
        if (exc != null) {
            yn0Var.a(exc);
        } else {
            yn0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
