package org.telegram.ui.Cells;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class h1 extends n1 {
    public final /* synthetic */ int e;
    public final /* synthetic */ t1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(int i9, t1 t1Var) {
        super(0);
        this.f = t1Var;
        this.e = i9;
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
        int[] iArr = t1Var.t3;
        int i9 = this.e;
        int i10 = iArr[i9];
        if (i10 == 3 || i10 == 4) {
            path.addCircle(rectF.centerX(), rectF.centerY(), AndroidUtilities.dp(iArr[i9] == 3 ? 16.0f : 20.0f), Path.Direction.CW);
            return;
        }
        if (i10 != 2) {
            float dp = i10 == 0 ? AndroidUtilities.dp(6.0f) : 0.0f;
            path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
            return;
        }
        MessageObject messageObject = t1Var.u7;
        boolean z10 = messageObject != null && messageObject.isOutOwner();
        for (int i11 = 0; i11 < 4; i11++) {
            if (!t1Var.m3) {
                if (i11 == (z10 ? 3 : 2)) {
                    float[] fArr = t1.Ae;
                    int i12 = i11 * 2;
                    float dp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius);
                    fArr[i12 + 1] = dp2;
                    fArr[i12] = dp2;
                } else if (((t1Var.g8 && t1Var.H == null) || t1Var.B) && (i11 == 2 || i11 == 3)) {
                    float[] fArr2 = t1.Ae;
                    int i13 = i11 * 2;
                    int i14 = i13 + 1;
                    float dp3 = AndroidUtilities.dp(t1Var.B ? Math.min(5, SharedConfig.bubbleRadius) : SharedConfig.bubbleRadius);
                    fArr2[i14] = dp3;
                    fArr2[i13] = dp3;
                }
            }
            float[] fArr3 = t1.Ae;
            int i15 = i11 * 2;
            fArr3[i15 + 1] = 0.0f;
            fArr3[i15] = 0.0f;
        }
        if (z10 || t1Var.F || (groupedMessagePosition = t1Var.H) != null || !(groupedMessagePosition == null || t1Var.W2)) {
            path.addRoundRect(rectF, t1.Ae, Path.Direction.CW);
        } else {
            path.moveTo(rectF.left + AndroidUtilities.dp(6.0f), rectF.top);
            path.lineTo(rectF.left + AndroidUtilities.dp(6.0f), (rectF.bottom - AndroidUtilities.dp(6.0f)) - AndroidUtilities.dp(5.0f));
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(rectF.left + AndroidUtilities.dp(-7.0f), rectF.bottom - AndroidUtilities.dp(23.0f), rectF.left + AndroidUtilities.dp(6.0f), rectF.bottom);
            path.arcTo(rectF2, 0.0f, 83.0f, false);
            float f10 = rectF.right;
            float[] fArr4 = t1.Ae;
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
