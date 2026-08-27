package gg;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.a30;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class i implements View.OnKeyListener {
    public boolean a;
    public final /* synthetic */ HashSet b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ l d;

    public i(l lVar, HashSet hashSet, Runnable runnable) {
        this.d = lVar;
        this.b = hashSet;
        this.c = runnable;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        l lVar = this.d;
        ArrayList arrayList = lVar.e;
        if (i10 == 67) {
            if (keyEvent.getAction() == 0) {
                this.a = lVar.b.length() == 0;
                return false;
            }
            if (keyEvent.getAction() == 1 && this.a && !arrayList.isEmpty()) {
                lVar.a((a30) i0.a.i(1, arrayList), this.b, this.c);
                return true;
            }
        }
        return false;
    }
}
