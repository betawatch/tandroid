package androidx.fragment.app;

import android.animation.AnimatorSet;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class i {
    public static final i a = new i();

    public final void a(AnimatorSet animatorSet) {
        kotlin.jvm.internal.j.e(animatorSet, "animatorSet");
        animatorSet.reverse();
    }

    public final void b(AnimatorSet animatorSet, long j3) {
        kotlin.jvm.internal.j.e(animatorSet, "animatorSet");
        animatorSet.setCurrentPlayTime(j3);
    }
}
