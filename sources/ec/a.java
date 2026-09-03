package ec;

import af.d;
import android.os.AsyncTask;
import com.google.android.gms.internal.clearcut.e;
import fc.g;
import j7.p8;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ao0;
import org.telegram.ui.gl0;
import org.telegram.ui.lo0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class a extends AsyncTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ gc.a b;
    public final /* synthetic */ ao0 c;
    public final /* synthetic */ bb.b d;

    public a(bb.b bVar, String str, gc.a aVar, ao0 ao0Var) {
        this.d = bVar;
        this.a = str;
        this.b = aVar;
        this.c = ao0Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        bb.b bVar = this.d;
        try {
            d c3 = hc.b.c(p8.a(this.b), new e(this.a));
            Object obj = bVar.b;
            return new b(c3, null);
        } catch (g e) {
            Object obj2 = bVar.b;
            return new b(null, e);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.b;
        d dVar = bVar.a;
        ao0 ao0Var = this.c;
        if (dVar != null) {
            lo0 lo0Var = ao0Var.a;
            if (lo0Var.N0) {
                return;
            }
            lo0Var.t0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) dVar.c, (String) dVar.b);
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
