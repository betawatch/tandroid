// default package

import android.content.SharedPreferences;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class il1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean[] b;

    public /* synthetic */ il1(boolean[] zArr, byte b) {
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
                vl3[] vl3VarArr = DictationAsr.a;
                zArr[0] = true;
                break;
            case 2:
                vl3[] vl3VarArr2 = DictationAsr.a;
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
                    SharedPreferences c1 = na7.c1();
                    c1.edit().putInt("showchattagsinfo", c1.getInt("showchattagsinfo", 3) - 1).apply();
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
