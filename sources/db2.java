// default package

import android.text.Spanned;
import java.util.Comparator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
