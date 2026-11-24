// default package

import android.text.Spanned;
import java.util.Comparator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class na2 implements Comparator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Spanned b;

    public /* synthetic */ na2(Spanned spanned, byte b) {
        this.a = b;
        this.b = spanned;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int spanStart;
        int spanStart2;
        byte b = this.a;
        Spanned spanned = this.b;
        switch (b) {
            case 0:
                spanStart = spanned.getSpanStart((nj2) obj2);
                spanStart2 = spanned.getSpanStart((nj2) obj);
                break;
            case 1:
                spanStart = spanned.getSpanStart((kib) obj2);
                spanStart2 = spanned.getSpanStart((kib) obj);
                break;
            default:
                spanStart = spanned.getSpanStart((qg9) obj2);
                spanStart2 = spanned.getSpanStart((qg9) obj);
                break;
        }
        return spanStart - spanStart2;
    }
}
