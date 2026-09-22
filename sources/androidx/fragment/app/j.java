package androidx.fragment.app;

import android.animation.AnimatorSet;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class j {
    public static final j a = new j();

    public final void a(AnimatorSet animatorSet) {
        kotlin.jvm.internal.i.e(animatorSet, "animatorSet");
        animatorSet.reverse();
    }

    public final void b(AnimatorSet animatorSet, long j3) {
        kotlin.jvm.internal.i.e(animatorSet, "animatorSet");
        animatorSet.setCurrentPlayTime(j3);
    }
}
