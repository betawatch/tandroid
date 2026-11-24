// default package

import android.media.Rating;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class gz8 {
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

    public static Rating g(boolean z) {
        return Rating.newHeartRating(z);
    }

    public static Rating h(float f) {
        return Rating.newPercentageRating(f);
    }

    public static Rating i(int i, float f) {
        return Rating.newStarRating(i, f);
    }

    public static Rating j(boolean z) {
        return Rating.newThumbRating(z);
    }

    public static Rating k(int i) {
        return Rating.newUnratedRating(i);
    }
}
