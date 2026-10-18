package mi;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import java.util.HashMap;
import org.telegram.ui.ActionBar.h6;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class d extends CharacterStyle {
    public final int a;

    public d(int i10) {
        this.a = i10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i10;
        HashMap hashMap = s.b;
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
                i10 = h6.Ik;
                break;
            case 2:
                i10 = h6.Jk;
                break;
            case 3:
                i10 = h6.Kk;
                break;
            case 4:
                i10 = h6.Lk;
                break;
            case 5:
                i10 = h6.Mk;
                break;
            case 6:
                i10 = h6.Nk;
                break;
            case 7:
                i10 = h6.Ok;
                break;
            default:
                i10 = -1;
                break;
        }
        if (i10 >= 0) {
            textPaint.setColor(h6.x0(null, i10, false));
        }
    }
}
