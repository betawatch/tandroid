package mc;

import a4.l;
import android.os.AsyncTask;
import java.util.Locale;
import li.k;
import nc.g;
import org.telegram.messenger.i0;
import org.telegram.ui.e;
import org.telegram.ui.mg0;
import org.telegram.ui.sm0;
import w7.l7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a extends AsyncTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ oc.a b;
    public final /* synthetic */ e c;
    public final /* synthetic */ l d;

    public a(l lVar, String str, oc.a aVar, e eVar) {
        this.d = lVar;
        this.a = str;
        this.b = aVar;
        this.c = eVar;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        l lVar = this.d;
        try {
            k c10 = pc.b.c(l7.a(this.b), new f2.a(this.a));
            Object obj = lVar.b;
            return new b(c10, null);
        } catch (g e) {
            Object obj2 = lVar.b;
            return new b(null, e);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.b;
        k kVar = bVar.a;
        e eVar = this.c;
        if (kVar != null) {
            sm0 sm0Var = (sm0) eVar.b;
            if (sm0Var.Q0) {
                return;
            }
            sm0Var.w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) kVar.c, (String) kVar.b);
            i0.g3(new mg0(eVar, 11));
            return;
        }
        Exception exc = bVar.b;
        if (exc != null) {
            eVar.d2(exc);
        } else {
            eVar.d2(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
