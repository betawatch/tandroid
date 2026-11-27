// default package

import java.util.Comparator;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gm3 implements Comparator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float[] b;

    public /* synthetic */ gm3(float[] fArr, byte b) {
        this.a = b;
        this.b = fArr;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        float[] fArr = this.b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        switch (b) {
            case 0:
                nm3[] nm3VarArr = DictationAsr.a;
                break;
            case 3:
                float f = fArr[num.intValue()];
                float log = f > 0.0f ? (float) Math.log(f) : 0.0f;
                float f2 = fArr[num2.intValue()];
                break;
        }
        return Float.compare(fArr[(num.intValue() * 3) + 2], fArr[(num2.intValue() * 3) + 2]);
    }
}
