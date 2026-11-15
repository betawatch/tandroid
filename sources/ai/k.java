package ai;

import java.util.Comparator;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ float[] b;

    public /* synthetic */ k(int i7, float[] fArr) {
        this.a = i7;
        this.b = fArr;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                float[] fArr = this.b;
                s[] sVarArr = DictationAsr.a;
                return Float.compare(fArr[((Integer) obj2).intValue()], fArr[((Integer) obj).intValue()]);
            case 1:
                float[] fArr2 = this.b;
                return Float.compare(fArr2[(((Integer) obj).intValue() * 3) + 2], fArr2[(((Integer) obj2).intValue() * 3) + 2]);
            case 2:
                float[] fArr3 = this.b;
                return Float.compare(fArr3[(((Integer) obj).intValue() * 3) + 2], fArr3[(((Integer) obj2).intValue() * 3) + 2]);
            case 3:
                float[] fArr4 = this.b;
                return Float.compare(fArr4[(((Integer) obj).intValue() * 3) + 2], fArr4[(((Integer) obj2).intValue() * 3) + 2]);
            default:
                float[] fArr5 = this.b;
                Integer num = (Integer) obj2;
                float f10 = fArr5[((Integer) obj).intValue()];
                float log = f10 > 0.0f ? (float) Math.log(f10) : 0.0f;
                float f11 = fArr5[num.intValue()];
                return Float.compare(log, f11 > 0.0f ? (float) Math.log(f11) : 0.0f);
        }
    }
}
