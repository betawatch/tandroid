package ah;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.p20;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
                oVar.a((p20) i5.c.h(1, arrayList), this.b, this.c);
                return true;
            }
        }
        return false;
    }
}
