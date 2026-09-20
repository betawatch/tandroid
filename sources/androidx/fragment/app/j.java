package androidx.fragment.app;

import android.animation.AnimatorSet;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
