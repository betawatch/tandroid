// default package

import android.content.SharedPreferences;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class om1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean[] b;

    public /* synthetic */ om1(boolean[] zArr, byte b) {
        this.a = b;
        this.b = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean[] zArr = this.b;
        switch (b) {
            case 0:
                zArr[0] = true;
                break;
            case 1:
                nm3[] nm3VarArr = DictationAsr.a;
                zArr[0] = true;
                break;
            case 2:
                nm3[] nm3VarArr2 = DictationAsr.a;
                zArr[0] = true;
                break;
            case 3:
                zArr[0] = true;
                break;
            case 4:
                zArr[0] = true;
                break;
            case 5:
                zArr[0] = true;
                break;
            case 6:
                zArr[0] = true;
                break;
            case 7:
                if (!zArr[0]) {
                    SharedPreferences e1 = uc7.e1();
                    e1.edit().putInt("showchattagsinfo", e1.getInt("showchattagsinfo", 3) - 1).apply();
                    zArr[0] = true;
                    break;
                }
                break;
            default:
                zArr[0] = true;
                break;
        }
    }
}
