package ni;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import java.util.HashMap;
import org.telegram.ui.ActionBar.y6;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class d extends CharacterStyle {
    public final int a;

    public d(int i10) {
        this.a = i10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i10;
        HashMap hashMap = r.b;
        int i11 = this.a & 255;
        switch (i11) {
            case 8:
            case 18:
                i11 = 1;
                break;
            case 9:
            case 10:
            case 14:
            case 15:
                i11 = 3;
                break;
            case 11:
            case 13:
                i11 = 7;
                break;
            case 12:
            case 16:
            case 17:
            case 19:
                i11 = 4;
                break;
            case 20:
                i11 = 6;
                break;
            case 21:
                i11 = 2;
                break;
        }
        switch (i11) {
            case 1:
                i10 = y6.Ik;
                break;
            case 2:
                i10 = y6.Jk;
                break;
            case 3:
                i10 = y6.Kk;
                break;
            case 4:
                i10 = y6.Lk;
                break;
            case 5:
                i10 = y6.Mk;
                break;
            case 6:
                i10 = y6.Nk;
                break;
            case 7:
                i10 = y6.Ok;
                break;
            default:
                i10 = -1;
                break;
        }
        if (i10 >= 0) {
            textPaint.setColor(y6.x0(null, i10, false));
        }
    }
}
