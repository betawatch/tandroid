package bb;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.Rating;
import android.os.Bundle;
import n4.i0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class a {
    public final Bundle a;

    public a(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.a = bundle == null ? Bundle.EMPTY : bundle;
    }

    public Boolean a() {
        Bundle bundle = this.a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    public void b(String str, Bitmap bitmap) {
        Integer num = (Integer) n4.m.c.get(str);
        if (num != null && num.intValue() != 2) {
            throw new IllegalArgumentException(a4.a.p("The ", str, " key cannot be used to put a Bitmap"));
        }
        this.a.putParcelable(str, bitmap);
    }

    public void c(long j3, String str) {
        Integer num = (Integer) n4.m.c.get(str);
        if (num != null && num.intValue() != 0) {
            throw new IllegalArgumentException(a4.a.p("The ", str, " key cannot be used to put a long"));
        }
        this.a.putLong(str, j3);
    }

    public void d(String str, i0 i0Var) {
        Rating rating;
        float f7 = i0Var.b;
        int i10 = i0Var.a;
        Integer num = (Integer) n4.m.c.get(str);
        if (num != null && num.intValue() != 3) {
            throw new IllegalArgumentException(a4.a.p("The ", str, " key cannot be used to put a Rating"));
        }
        if (i0Var.c == null) {
            if (i0Var.b()) {
                switch (i10) {
                    case 1:
                        i0Var.c = Rating.newHeartRating(i10 == 1 && f7 == 1.0f);
                        break;
                    case 2:
                        i0Var.c = Rating.newThumbRating(i10 == 2 && f7 == 1.0f);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        i0Var.c = Rating.newStarRating(i10, i0Var.a());
                        break;
                    case 6:
                        if (i10 != 6 || !i0Var.b()) {
                            f7 = -1.0f;
                        }
                        i0Var.c = Rating.newPercentageRating(f7);
                        break;
                    default:
                        rating = null;
                        break;
                }
                this.a.putParcelable(str, rating);
            }
            i0Var.c = Rating.newUnratedRating(i10);
        }
        rating = i0Var.c;
        this.a.putParcelable(str, rating);
    }

    public void e(String str, String str2) {
        Integer num = (Integer) n4.m.c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(a4.a.p("The ", str, " key cannot be used to put a String"));
        }
        this.a.putCharSequence(str, str2);
    }

    public void f(CharSequence charSequence, String str) {
        Integer num = (Integer) n4.m.c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(a4.a.p("The ", str, " key cannot be used to put a CharSequence"));
        }
        this.a.putCharSequence(str, charSequence);
    }

    public a() {
        this.a = new Bundle();
    }
}
