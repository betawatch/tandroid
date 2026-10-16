package li;

import android.content.Context;
import android.opengl.GLES20;
import java.util.Arrays;
import org.telegram.ui.Wallet.f5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class r {
    public int a;
    public int[] b;

    public r(Context context, String str) {
        int[] iArr = new int[2];
        this.b = iArr;
        j6.l lVar = new j6.l(context, str);
        this.a = lVar.a;
        GLES20.glGenBuffers(2, iArr, 0);
        f5.a((float[]) lVar.d, iArr[0]);
        f5.a((float[]) lVar.b, iArr[1]);
    }

    public void a(int i10, int i11, int i12) {
        if (i12 == 0 || i10 >= i11) {
            return;
        }
        int i13 = this.a;
        if (i13 >= 3) {
            int[] iArr = this.b;
            if (iArr[i13 - 1] == i12 && iArr[i13 - 2] == i10) {
                iArr[i13 - 2] = i11;
                return;
            }
        }
        int i14 = i13 + 3;
        int[] iArr2 = this.b;
        if (i14 > iArr2.length) {
            this.b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.b;
        int i15 = this.a;
        int i16 = i15 + 1;
        this.a = i16;
        iArr3[i15] = i10;
        int i17 = i15 + 2;
        this.a = i17;
        iArr3[i16] = i11;
        this.a = i15 + 3;
        iArr3[i17] = i12;
    }
}
