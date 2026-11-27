// default package

import android.text.Spanned;
import java.util.Comparator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class db2 implements Comparator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Spanned b;

    public /* synthetic */ db2(Spanned spanned, byte b) {
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
                spanStart = spanned.getSpanStart((jk2) obj2);
                spanStart2 = spanned.getSpanStart((jk2) obj);
                break;
            case 1:
                spanStart = spanned.getSpanStart((fmb) obj2);
                spanStart2 = spanned.getSpanStart((fmb) obj);
                break;
            default:
                spanStart = spanned.getSpanStart((gk9) obj2);
                spanStart2 = spanned.getSpanStart((gk9) obj);
                break;
        }
        return spanStart - spanStart2;
    }
}
