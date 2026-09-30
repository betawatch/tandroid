package androidx.activity;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class r implements OnBackAnimationCallback {
    public final /* synthetic */ rd.l a;
    public final /* synthetic */ rd.l b;
    public final /* synthetic */ rd.a c;
    public final /* synthetic */ rd.a d;

    public r(rd.l lVar, rd.l lVar2, rd.a aVar, rd.a aVar2) {
        this.a = lVar;
        this.b = lVar2;
        this.c = aVar;
        this.d = aVar2;
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackCancelled() {
        this.d.invoke();
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        this.c.invoke();
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackProgressed(BackEvent backEvent) {
        kotlin.jvm.internal.i.e(backEvent, "backEvent");
        this.b.invoke(new b(backEvent));
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackStarted(BackEvent backEvent) {
        kotlin.jvm.internal.i.e(backEvent, "backEvent");
        this.a.invoke(new b(backEvent));
    }
}
