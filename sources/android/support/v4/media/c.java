package android.support.v4.media;

import android.media.Rating;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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

    public static Rating g(boolean z10) {
        return Rating.newHeartRating(z10);
    }

    public static Rating h(float f7) {
        return Rating.newPercentageRating(f7);
    }

    public static Rating i(int i10, float f7) {
        return Rating.newStarRating(i10, f7);
    }

    public static Rating j(boolean z10) {
        return Rating.newThumbRating(z10);
    }

    public static Rating k(int i10) {
        return Rating.newUnratedRating(i10);
    }
}
