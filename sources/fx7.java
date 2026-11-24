// default package

import android.graphics.drawable.Drawable;
import android.util.Pair;
import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.ProfileStoriesView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fx7 implements Comparator {
    public final /* synthetic */ byte a;

    public /* synthetic */ fx7(byte b) {
        this.a = b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int g1 = vx7.g1((String) obj);
                int g12 = vx7.g1((String) obj2);
                if (g1 >= g12) {
                    if (g1 > g12) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 1:
                int g13 = vx7.g1((String) obj);
                int g14 = vx7.g1((String) obj2);
                if (g13 >= g14) {
                    if (g13 > g14) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 2:
                Drawable[] drawableArr = PhotoViewer.f9;
                break;
            case 3:
                float f = ((df8) obj).a;
                float f2 = ((df8) obj2).a;
                if (f <= f2) {
                    if (f < f2) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 6:
                int i = obj instanceof so8 ? ((so8) obj).g : obj instanceof aa7 ? ((aa7) obj).d : 0;
                int i2 = obj2 instanceof so8 ? ((so8) obj2).g : obj2 instanceof aa7 ? ((aa7) obj2).d : 0;
                if (i >= i2) {
                    if (i > i2) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 7:
                int i3 = ProfileStoriesView.t0;
                break;
            case 16:
                int i4 = ((xr9) obj).b;
                int i5 = ((xr9) obj2).b;
                if (i4 >= i5) {
                    if (i4 > i5) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 17:
                int i6 = ((au9) obj).b.out_seq_no;
                int i7 = ((au9) obj2).b.out_seq_no;
                if (i6 <= i7) {
                    if (i6 < i7) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 19:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                if (((Float) pair.first).floatValue() <= ((Float) pair2.first).floatValue()) {
                    if (((Float) pair2.first).floatValue() > ((Float) pair.first).floatValue()) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 20:
                Pair pair3 = (Pair) obj;
                Pair pair4 = (Pair) obj2;
                if (((Float) pair3.first).floatValue() <= ((Float) pair4.first).floatValue()) {
                    if (((Float) pair4.first).floatValue() > ((Float) pair3.first).floatValue()) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 22:
                long j = y6c.h(((Integer) obj).intValue()).Z;
                long j2 = y6c.h(((Integer) obj2).intValue()).Z;
                if (j <= j2) {
                    if (j < j2) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 23:
                int i8 = ((iaa) obj).c;
                int i9 = ((iaa) obj2).c;
                if (i8 >= i9) {
                    if (i8 > i9) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 24:
                fba fbaVar = (fba) obj;
                fba fbaVar2 = (fba) obj2;
                fba fbaVar3 = gba.y1;
                long j3 = fbaVar3 == fbaVar ? -200000L : 0L;
                if (!fbaVar.d) {
                    j3 += 100000;
                }
                long j4 = fbaVar3 == fbaVar2 ? -200000L : 0L;
                if (!fbaVar2.d) {
                    j4 += 100000;
                }
                break;
        }
        return ((TL_stars.SavedStarGift) obj2).date - ((TL_stars.SavedStarGift) obj).date;
    }
}
