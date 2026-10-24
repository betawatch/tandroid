package androidx.activity;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class t implements OnBackAnimationCallback {
    public final /* synthetic */ td.l a;
    public final /* synthetic */ td.l b;
    public final /* synthetic */ td.a c;
    public final /* synthetic */ td.a d;

    public t(td.l lVar, td.l lVar2, td.a aVar, td.a aVar2) {
        this.a = lVar;
        this.b = lVar2;
        this.c = aVar;
        this.d = aVar2;
    }

    public final void onBackCancelled() {
        this.d.invoke();
    }

    public final void onBackInvoked() {
        this.c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        kotlin.jvm.internal.i.e(backEvent, "backEvent");
        this.b.invoke(new b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        kotlin.jvm.internal.i.e(backEvent, "backEvent");
        this.a.invoke(new b(backEvent));
    }
}
