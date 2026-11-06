package androidx.activity;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class s implements OnBackAnimationCallback {
    public final /* synthetic */ rd.l a;
    public final /* synthetic */ rd.l b;
    public final /* synthetic */ rd.a c;
    public final /* synthetic */ rd.a d;

    public s(rd.l lVar, rd.l lVar2, rd.a aVar, rd.a aVar2) {
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
        kotlin.jvm.internal.j.e(backEvent, "backEvent");
        this.b.invoke(new b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        kotlin.jvm.internal.j.e(backEvent, "backEvent");
        this.a.invoke(new b(backEvent));
    }
}
