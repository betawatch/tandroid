package android.support.v4.media;

import a0.f;
import android.graphics.Bitmap;
import android.media.Rating;
import android.os.Bundle;
import android.support.v4.media.session.b0;
import n4.i0;
import n4.m;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final class c {
    public final /* synthetic */ int a;
    public final Bundle b;

    public c(int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = new Bundle();
                break;
            default:
                this.b = new Bundle();
                break;
        }
    }

    public final void a(String str, Bitmap bitmap) {
        switch (this.a) {
            case 0:
                f fVar = MediaMetadataCompat.d;
                if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 2) {
                    throw new IllegalArgumentException(a4.a.q("The ", str, " key cannot be used to put a Bitmap"));
                }
                this.b.putParcelable(str, bitmap);
                return;
            default:
                Integer num = (Integer) m.c.get(str);
                if (num != null && num.intValue() != 2) {
                    throw new IllegalArgumentException(a4.a.q("The ", str, " key cannot be used to put a Bitmap"));
                }
                this.b.putParcelable(str, bitmap);
                return;
        }
    }

    public void b(long j3) {
        f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey("android.media.metadata.DURATION") && ((Integer) fVar.get("android.media.metadata.DURATION")).intValue() != 0) {
            throw new IllegalArgumentException("The android.media.metadata.DURATION key cannot be used to put a long");
        }
        this.b.putLong("android.media.metadata.DURATION", j3);
    }

    public void c(long j3, String str) {
        Integer num = (Integer) m.c.get(str);
        if (num != null && num.intValue() != 0) {
            throw new IllegalArgumentException(a4.a.q("The ", str, " key cannot be used to put a long"));
        }
        this.b.putLong(str, j3);
    }

    public void d(String str, i0 i0Var) {
        Rating rating;
        float f7 = i0Var.b;
        int i10 = i0Var.a;
        Integer num = (Integer) m.c.get(str);
        if (num != null && num.intValue() != 3) {
            throw new IllegalArgumentException(a4.a.q("The ", str, " key cannot be used to put a Rating"));
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
                this.b.putParcelable(str, rating);
            }
            i0Var.c = Rating.newUnratedRating(i10);
        }
        rating = i0Var.c;
        this.b.putParcelable(str, rating);
    }

    public final void e(String str, String str2) {
        switch (this.a) {
            case 0:
                f fVar = MediaMetadataCompat.d;
                if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 1) {
                    throw new IllegalArgumentException(a4.a.q("The ", str, " key cannot be used to put a String"));
                }
                this.b.putCharSequence(str, str2);
                return;
            default:
                Integer num = (Integer) m.c.get(str);
                if (num != null && num.intValue() != 1) {
                    throw new IllegalArgumentException(a4.a.q("The ", str, " key cannot be used to put a String"));
                }
                this.b.putCharSequence(str, str2);
                return;
        }
    }

    public void f(CharSequence charSequence, String str) {
        Integer num = (Integer) m.c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(a4.a.q("The ", str, " key cannot be used to put a CharSequence"));
        }
        this.b.putCharSequence(str, charSequence);
    }

    public c(MediaMetadataCompat mediaMetadataCompat) {
        this.a = 0;
        Bundle bundle = new Bundle(mediaMetadataCompat.a);
        this.b = bundle;
        b0.a(bundle);
    }
}
