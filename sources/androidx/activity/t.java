package androidx.activity;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class t implements OnBackAnimationCallback {
    public final /* synthetic */ dd.l a;
    public final /* synthetic */ dd.l b;
    public final /* synthetic */ dd.a c;
    public final /* synthetic */ dd.a d;

    public t(dd.l lVar, dd.l lVar2, dd.a aVar, dd.a aVar2) {
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
        kotlin.jvm.internal.j.e(backEvent, "backEvent");
        this.b.invoke(new b(backEvent));
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackStarted(BackEvent backEvent) {
        kotlin.jvm.internal.j.e(backEvent, "backEvent");
        this.a.invoke(new b(backEvent));
    }
}
