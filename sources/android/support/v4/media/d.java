package android.support.v4.media;

import android.media.Rating;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class d {
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

    public static Rating h(float f10) {
        return Rating.newPercentageRating(f10);
    }

    public static Rating i(int i9, float f10) {
        return Rating.newStarRating(i9, f10);
    }

    public static Rating j(boolean z10) {
        return Rating.newThumbRating(z10);
    }

    public static Rating k(int i9) {
        return Rating.newUnratedRating(i9);
    }
}
