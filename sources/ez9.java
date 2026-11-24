// default package

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ez9 implements View.OnKeyListener {
    public boolean a;
    public final /* synthetic */ HashSet b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ hz9 d;

    public ez9(hz9 hz9Var, HashSet hashSet, Runnable runnable) {
        this.d = hz9Var;
        this.b = hashSet;
        this.c = runnable;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        hz9 hz9Var = this.d;
        ArrayList arrayList = hz9Var.e;
        if (i == 67) {
            if (keyEvent.getAction() == 0) {
                this.a = hz9Var.b.length() == 0;
                return false;
            }
            if (keyEvent.getAction() == 1 && this.a && !arrayList.isEmpty()) {
                hz9Var.a((ya5) b00.f(1, arrayList), this.b, this.c);
                return true;
            }
        }
        return false;
    }
}
