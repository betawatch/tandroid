package ac;

import a5.m;
import android.os.AsyncTask;
import bc.g;
import com.google.android.gms.internal.clearcut.e;
import f7.k7;
import java.util.Locale;
import k5.i;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.co0;
import org.telegram.ui.rn0;
import org.telegram.ui.zk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a extends AsyncTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ cc.a b;
    public final /* synthetic */ rn0 c;
    public final /* synthetic */ i d;

    public a(i iVar, String str, cc.a aVar, rn0 rn0Var) {
        this.d = iVar;
        this.a = str;
        this.b = aVar;
        this.c = rn0Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        i iVar = this.d;
        try {
            m c10 = dc.b.c(k7.a(this.b), new e(this.a));
            Object obj = iVar.b;
            return new b(c10, null);
        } catch (g e10) {
            Object obj2 = iVar.b;
            return new b(null, e10);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.b;
        m mVar = bVar.a;
        rn0 rn0Var = this.c;
        if (mVar != null) {
            co0 co0Var = rn0Var.a;
            if (co0Var.M0) {
                return;
            }
            co0Var.s0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) mVar.c, (String) mVar.b);
            AndroidUtilities.runOnUIThread(new zk0(rn0Var, 8));
            return;
        }
        Exception exc = bVar.b;
        if (exc != null) {
            rn0Var.a(exc);
        } else {
            rn0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
