package ah;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.c20;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class k implements View.OnKeyListener {
    public boolean a;
    public final /* synthetic */ HashSet b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ o d;

    public k(o oVar, HashSet hashSet, Runnable runnable) {
        this.d = oVar;
        this.b = hashSet;
        this.c = runnable;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        o oVar = this.d;
        ArrayList arrayList = oVar.e;
        if (i7 == 67) {
            if (keyEvent.getAction() == 0) {
                this.a = oVar.b.length() == 0;
                return false;
            }
            if (keyEvent.getAction() == 1 && this.a && !arrayList.isEmpty()) {
                oVar.a((c20) jg.g.i(1, arrayList), this.b, this.c);
                return true;
            }
        }
        return false;
    }
}
