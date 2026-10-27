package org.telegram.ui.Cells;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class g1 extends m1 {
    public final /* synthetic */ int e;
    public final /* synthetic */ s1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(int i10, s1 s1Var) {
        super(0);
        this.f = s1Var;
        this.e = i10;
    }

    @Override // org.telegram.ui.Cells.m1
    public final void e() {
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        Rect bounds = getBounds();
        RectF rectF = (RectF) this.d;
        rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        Path path = this.b;
        path.rewind();
        s1 s1Var = this.f;
        int[] iArr = s1Var.x3;
        int i10 = this.e;
        int i11 = iArr[i10];
        if (i11 == 3 || i11 == 4) {
            path.addCircle(rectF.centerX(), rectF.centerY(), AndroidUtilities.dp(iArr[i10] == 3 ? 16.0f : 20.0f), Path.Direction.CW);
            return;
        }
        if (i11 != 2) {
            float dp = i11 == 0 ? AndroidUtilities.dp(6.0f) : 0.0f;
            path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
            return;
        }
        MessageObject messageObject = s1Var.y7;
        boolean z10 = messageObject != null && messageObject.isOutOwner();
        for (int i12 = 0; i12 < 4; i12++) {
            if (!s1Var.q3) {
                if (i12 == (z10 ? 3 : 2)) {
                    float[] fArr = s1.Ge;
                    int i13 = i12 * 2;
                    float dp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius);
                    fArr[i13 + 1] = dp2;
                    fArr[i13] = dp2;
                } else if (((s1Var.k8 && s1Var.L == null) || s1Var.F) && (i12 == 2 || i12 == 3)) {
                    float[] fArr2 = s1.Ge;
                    int i14 = i12 * 2;
                    int i15 = i14 + 1;
                    float dp3 = AndroidUtilities.dp(s1Var.F ? Math.min(5, SharedConfig.bubbleRadius) : SharedConfig.bubbleRadius);
                    fArr2[i15] = dp3;
                    fArr2[i14] = dp3;
                }
            }
            float[] fArr3 = s1.Ge;
            int i16 = i12 * 2;
            fArr3[i16 + 1] = 0.0f;
            fArr3[i16] = 0.0f;
        }
        if (z10 || s1Var.J || (groupedMessagePosition = s1Var.L) != null || !(groupedMessagePosition == null || s1Var.a3)) {
            path.addRoundRect(rectF, s1.Ge, Path.Direction.CW);
        } else {
            path.moveTo(rectF.left + AndroidUtilities.dp(6.0f), rectF.top);
            path.lineTo(rectF.left + AndroidUtilities.dp(6.0f), (rectF.bottom - AndroidUtilities.dp(6.0f)) - AndroidUtilities.dp(5.0f));
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(rectF.left + AndroidUtilities.dp(-7.0f), rectF.bottom - AndroidUtilities.dp(23.0f), rectF.left + AndroidUtilities.dp(6.0f), rectF.bottom);
            path.arcTo(rectF2, 0.0f, 83.0f, false);
            float f7 = rectF.right;
            float[] fArr4 = s1.Ge;
            float f10 = f7 - (fArr4[4] * 2.0f);
            float f11 = rectF.bottom;
            rectF2.set(f10, f11 - (fArr4[5] * 2.0f), f7, f11);
            path.arcTo(rectF2, 90.0f, -90.0f, false);
            path.lineTo(rectF.right, rectF.top);
            path.close();
        }
        path.close();
    }
}
