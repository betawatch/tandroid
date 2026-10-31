package di;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import java.util.HashMap;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class e extends CharacterStyle {
    public final int a;

    public e(int i10) {
        this.a = i10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i10;
        HashMap hashMap = t.b;
        int i11 = this.a & zs.e4;
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
                i10 = t6.wl;
                break;
            case 2:
                i10 = t6.xl;
                break;
            case 3:
                i10 = t6.yl;
                break;
            case 4:
                i10 = t6.zl;
                break;
            case 5:
                i10 = t6.Al;
                break;
            case 6:
                i10 = t6.Bl;
                break;
            case 7:
                i10 = t6.Cl;
                break;
            default:
                i10 = -1;
                break;
        }
        if (i10 >= 0) {
            textPaint.setColor(t6.x0(null, i10, false));
        }
    }
}
