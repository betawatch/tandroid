package org.telegram.ui.Cells;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class h1 extends n1 {
    public final /* synthetic */ int e;
    public final /* synthetic */ t1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(int i10, t1 t1Var) {
        super(0);
        this.f = t1Var;
        this.e = i10;
    }

    @Override // org.telegram.ui.Cells.n1
    public final void e() {
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        Rect bounds = getBounds();
        RectF rectF = (RectF) this.d;
        rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        Path path = this.b;
        path.rewind();
        t1 t1Var = this.f;
        int[] iArr = t1Var.u3;
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
        MessageObject messageObject = t1Var.v7;
        boolean z4 = messageObject != null && messageObject.isOutOwner();
        for (int i12 = 0; i12 < 4; i12++) {
            if (!t1Var.n3) {
                if (i12 == (z4 ? 3 : 2)) {
                    float[] fArr = t1.Be;
                    int i13 = i12 * 2;
                    float dp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius);
                    fArr[i13 + 1] = dp2;
                    fArr[i13] = dp2;
                } else if (((t1Var.h8 && t1Var.I == null) || t1Var.C) && (i12 == 2 || i12 == 3)) {
                    float[] fArr2 = t1.Be;
                    int i14 = i12 * 2;
                    int i15 = i14 + 1;
                    float dp3 = AndroidUtilities.dp(t1Var.C ? Math.min(5, SharedConfig.bubbleRadius) : SharedConfig.bubbleRadius);
                    fArr2[i15] = dp3;
                    fArr2[i14] = dp3;
                }
            }
            float[] fArr3 = t1.Be;
            int i16 = i12 * 2;
            fArr3[i16 + 1] = 0.0f;
            fArr3[i16] = 0.0f;
        }
        if (z4 || t1Var.G || (groupedMessagePosition = t1Var.I) != null || !(groupedMessagePosition == null || t1Var.X2)) {
            path.addRoundRect(rectF, t1.Be, Path.Direction.CW);
        } else {
            path.moveTo(rectF.left + AndroidUtilities.dp(6.0f), rectF.top);
            path.lineTo(rectF.left + AndroidUtilities.dp(6.0f), (rectF.bottom - AndroidUtilities.dp(6.0f)) - AndroidUtilities.dp(5.0f));
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(rectF.left + AndroidUtilities.dp(-7.0f), rectF.bottom - AndroidUtilities.dp(23.0f), rectF.left + AndroidUtilities.dp(6.0f), rectF.bottom);
            path.arcTo(rectF2, 0.0f, 83.0f, false);
            float f10 = rectF.right;
            float[] fArr4 = t1.Be;
            float f11 = f10 - (fArr4[4] * 2.0f);
            float f12 = rectF.bottom;
            rectF2.set(f11, f12 - (fArr4[5] * 2.0f), f10, f12);
            path.arcTo(rectF2, 90.0f, -90.0f, false);
            path.lineTo(rectF.right, rectF.top);
            path.close();
        }
        path.close();
    }
}
