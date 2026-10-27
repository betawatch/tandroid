package androidx.activity;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class s implements OnBackAnimationCallback {
    public final /* synthetic */ ud.l a;
    public final /* synthetic */ ud.l b;
    public final /* synthetic */ ud.a c;
    public final /* synthetic */ ud.a d;

    public s(ud.l lVar, ud.l lVar2, ud.a aVar, ud.a aVar2) {
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
