package android.support.v4.media;

import android.media.Rating;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public abstract class c {
    public static float a(Rating rating) {
        return rating.getPercentRating();
    }

    public static int b(Rating rating) {
        return rating.getRatingStyle();
    }

    public static float c(Rating rating) {
        return rating.getStarRating();
    }

    public static boolean d(Rating rating) {
        return rating.hasHeart();
    }

    public static boolean e(Rating rating) {
        return rating.isRated();
    }

    public static boolean f(Rating rating) {
        return rating.isThumbUp();
    }

    public static Rating g(boolean z9) {
        return Rating.newHeartRating(z9);
    }

    public static Rating h(float f10) {
        return Rating.newPercentageRating(f10);
    }

    public static Rating i(int i7, float f10) {
        return Rating.newStarRating(i7, f10);
    }

    public static Rating j(boolean z9) {
        return Rating.newThumbRating(z9);
    }

    public static Rating k(int i7) {
        return Rating.newUnratedRating(i7);
    }
}
