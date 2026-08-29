package cc;

import android.os.AsyncTask;
import androidx.biometric.e;
import dc.g;
import fc.c;
import h7.y7;
import java.util.Locale;
import m5.i;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.bo0;
import org.telegram.ui.qn0;
import org.telegram.ui.vk0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a extends AsyncTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ ec.a b;
    public final /* synthetic */ qn0 c;
    public final /* synthetic */ i d;

    public a(i iVar, String str, ec.a aVar, qn0 qn0Var) {
        this.d = iVar;
        this.a = str;
        this.b = aVar;
        this.c = qn0Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        i iVar = this.d;
        try {
            e c3 = c.c(y7.a(this.b), new fc.a(this.a, 0));
            Object obj = iVar.b;
            return new b(c3, null);
        } catch (g e10) {
            Object obj2 = iVar.b;
            return new b(null, e10);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.b;
        e eVar = bVar.a;
        qn0 qn0Var = this.c;
        if (eVar != null) {
            bo0 bo0Var = qn0Var.a;
            if (bo0Var.M0) {
                return;
            }
            bo0Var.s0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) eVar.c, (String) eVar.b);
            AndroidUtilities.runOnUIThread(new vk0(qn0Var, 8));
            return;
        }
        Exception exc = bVar.b;
        if (exc != null) {
            qn0Var.a(exc);
        } else {
            qn0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
