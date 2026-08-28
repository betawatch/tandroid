package fg;

import android.view.KeyEvent;
import android.view.View;
import j3.r0;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.w20;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i implements View.OnKeyListener {
    public boolean a;
    public final /* synthetic */ HashSet b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ m d;

    public i(m mVar, HashSet hashSet, Runnable runnable) {
        this.d = mVar;
        this.b = hashSet;
        this.c = runnable;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i9, KeyEvent keyEvent) {
        m mVar = this.d;
        ArrayList arrayList = mVar.e;
        if (i9 == 67) {
            if (keyEvent.getAction() == 0) {
                this.a = mVar.b.length() == 0;
                return false;
            }
            if (keyEvent.getAction() == 1 && this.a && !arrayList.isEmpty()) {
                mVar.a((w20) r0.j(1, arrayList), this.b, this.c);
                return true;
            }
        }
        return false;
    }
}
