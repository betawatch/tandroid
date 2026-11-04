package bh;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import k2.p1;
import org.telegram.ui.Components.y10;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
    public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
        m mVar = this.d;
        ArrayList arrayList = mVar.e;
        if (i3 == 67) {
            if (keyEvent.getAction() == 0) {
                this.a = mVar.b.length() == 0;
                return false;
            }
            if (keyEvent.getAction() == 1 && this.a && !arrayList.isEmpty()) {
                mVar.a((y10) p1.h(1, arrayList), this.b, this.c);
                return true;
            }
        }
        return false;
    }
}
