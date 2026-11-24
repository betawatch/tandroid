// default package

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class g1a implements View.OnKeyListener {
    public boolean a;
    public final /* synthetic */ HashSet b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ j1a d;

    public g1a(j1a j1aVar, HashSet hashSet, Runnable runnable) {
        this.d = j1aVar;
        this.b = hashSet;
        this.c = runnable;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        j1a j1aVar = this.d;
        ArrayList arrayList = j1aVar.e;
        if (i == 67) {
            if (keyEvent.getAction() == 0) {
                this.a = j1aVar.b.length() == 0;
                return false;
            }
            if (keyEvent.getAction() == 1 && this.a && !arrayList.isEmpty()) {
                j1aVar.a((wc5) b10.f(1, arrayList), this.b, this.c);
                return true;
            }
        }
        return false;
    }
}
