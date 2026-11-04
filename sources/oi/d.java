package oi;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import java.util.HashMap;
import org.telegram.messenger.hs;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class d extends CharacterStyle {
    public final int a;

    public d(int i3) {
        this.a = i3;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i3;
        HashMap hashMap = r.b;
        int i10 = this.a & hs.e4;
        switch (i10) {
            case 8:
            case 18:
                i10 = 1;
                break;
            case 9:
            case 10:
            case 14:
            case 15:
                i10 = 3;
                break;
            case 11:
            case 13:
                i10 = 7;
                break;
            case 12:
            case 16:
            case 17:
            case 19:
                i10 = 4;
                break;
            case 20:
                i10 = 6;
                break;
            case 21:
                i10 = 2;
                break;
        }
        switch (i10) {
            case 1:
                i3 = k6.wl;
                break;
            case 2:
                i3 = k6.xl;
                break;
            case 3:
                i3 = k6.yl;
                break;
            case 4:
                i3 = k6.zl;
                break;
            case 5:
                i3 = k6.Al;
                break;
            case 6:
                i3 = k6.Bl;
                break;
            case 7:
                i3 = k6.Cl;
                break;
            default:
                i3 = -1;
                break;
        }
        if (i3 >= 0) {
            textPaint.setColor(k6.x0(null, i3, false));
        }
    }
}
