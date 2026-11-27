package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class a extends FrameLayout {
    public final /* synthetic */ o a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(o oVar, Activity activity) {
        super(activity);
        this.a = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        int i2;
        o oVar = this.a;
        ArticleViewer$WindowView articleViewer$WindowView = oVar.g0;
        if (articleViewer$WindowView == null || !(articleViewer$WindowView.e || articleViewer$WindowView.f)) {
            return super.drawChild(canvas, view, j);
        }
        int measuredWidth = getMeasuredWidth();
        int translationX = (int) oVar.v0[0].getTranslationX();
        m[] mVarArr = oVar.v0;
        if (view == mVarArr[1]) {
            i = translationX;
        } else {
            i = measuredWidth;
            if (view == mVarArr[0]) {
                i2 = translationX;
                int save = canvas.save();
                canvas.clipRect(i2, 0, i, getHeight());
                boolean drawChild = super.drawChild(canvas, view, j);
                canvas.restoreToCount(save);
                if (translationX != 0) {
                    m[] mVarArr2 = oVar.v0;
                    if (view == mVarArr2[0]) {
                        float max = Math.max(0.0f, Math.min((measuredWidth - translationX) / hl.L(20.0f), 1.0f));
                        Drawable drawable = oVar.n0;
                        drawable.setBounds(translationX - drawable.getIntrinsicWidth(), view.getTop(), translationX, view.getBottom());
                        oVar.n0.setAlpha((int) (max * 255.0f));
                        oVar.n0.draw(canvas);
                        return drawChild;
                    }
                    if (view == mVarArr2[1]) {
                        float min = Math.min(0.8f, (measuredWidth - translationX) / measuredWidth);
                        oVar.o0.setColor(((int) ((min >= 0.0f ? min : 0.0f) * 153.0f)) << 24);
                        canvas.drawRect(i2, 0.0f, i, getHeight(), oVar.o0);
                    }
                }
                return drawChild;
            }
        }
        i2 = 0;
        int save2 = canvas.save();
        canvas.clipRect(i2, 0, i, getHeight());
        boolean drawChild2 = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save2);
        if (translationX != 0) {
        }
        return drawChild2;
    }
}
