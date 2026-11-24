// default package

import java.util.Comparator;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ml3 implements Comparator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float[] b;

    public /* synthetic */ ml3(float[] fArr, byte b) {
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
                vl3[] vl3VarArr = DictationAsr.a;
                break;
            case 2:
                float f = fArr[num.intValue()];
                float log = f > 0.0f ? (float) Math.log(f) : 0.0f;
                float f2 = fArr[num2.intValue()];
                break;
        }
        return Float.compare(fArr[(num.intValue() * 3) + 2], fArr[(num2.intValue() * 3) + 2]);
    }
}
