package android.support.v4.media;

import android.media.Rating;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
