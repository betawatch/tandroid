// default package

import java.util.Comparator;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
