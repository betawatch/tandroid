package bc;

import a5.n;
import android.os.AsyncTask;
import cc.g;
import ec.c;
import g7.l7;
import java.util.Locale;
import k5.i;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.do0;
import org.telegram.ui.sn0;
import org.telegram.ui.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a extends AsyncTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ dc.a b;
    public final /* synthetic */ sn0 c;
    public final /* synthetic */ i d;

    public a(i iVar, String str, dc.a aVar, sn0 sn0Var) {
        this.d = iVar;
        this.a = str;
        this.b = aVar;
        this.c = sn0Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        i iVar = this.d;
        try {
            n c10 = c.c(l7.a(this.b), new ec.a(this.a, 0));
            Object obj = iVar.b;
            return new b(c10, null);
        } catch (g e9) {
            Object obj2 = iVar.b;
            return new b(null, e9);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.b;
        n nVar = bVar.a;
        sn0 sn0Var = this.c;
        if (nVar != null) {
            do0 do0Var = sn0Var.a;
            if (do0Var.M0) {
                return;
            }
            do0Var.s0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) nVar.c, (String) nVar.b);
            AndroidUtilities.runOnUIThread(new zk0(sn0Var, 8));
            return;
        }
        Exception exc = bVar.b;
        if (exc != null) {
            sn0Var.a(exc);
        } else {
            sn0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
