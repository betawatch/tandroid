package ig;

import android.view.KeyEvent;
import android.view.View;
import j7.l1;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.j30;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class h implements View.OnKeyListener {
    public boolean a;
    public final /* synthetic */ HashSet b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ k d;

    public h(k kVar, HashSet hashSet, Runnable runnable) {
        this.d = kVar;
        this.b = hashSet;
        this.c = runnable;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        k kVar = this.d;
        ArrayList arrayList = kVar.e;
        if (i10 == 67) {
            if (keyEvent.getAction() == 0) {
                this.a = kVar.b.length() == 0;
                return false;
            }
            if (keyEvent.getAction() == 1 && this.a && !arrayList.isEmpty()) {
                kVar.a((j30) l1.i(1, arrayList), this.b, this.c);
                return true;
            }
        }
        return false;
    }
}
