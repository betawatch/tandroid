package android.support.v4.media;

import android.media.Rating;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class e {
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

    public static Rating g(boolean z4) {
        return Rating.newHeartRating(z4);
    }

    public static Rating h(float f10) {
        return Rating.newPercentageRating(f10);
    }

    public static Rating i(int i10, float f10) {
        return Rating.newStarRating(i10, f10);
    }

    public static Rating j(boolean z4) {
        return Rating.newThumbRating(z4);
    }

    public static Rating k(int i10) {
        return Rating.newUnratedRating(i10);
    }
}
