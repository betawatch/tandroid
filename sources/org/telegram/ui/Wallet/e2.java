package org.telegram.ui.Wallet;

import ai.cc;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.hs;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class e2 extends FrameLayout {
    public final org.telegram.ui.Components.g6 a;
    public final Paint b;
    public final Path c;
    public float d;
    public final /* synthetic */ h2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(h2 h2Var, Context context) {
        super(context);
        this.e = h2Var;
        this.a = new org.telegram.ui.Components.g6(this, 250L, hs.h);
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Path();
        setWillNotDraw(false);
        paint.setColor(h2Var.getThemedColor(org.telegram.ui.ActionBar.i6.h5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        ViewGroup viewGroup;
        int i12;
        float f7;
        h2 h2Var = this.e;
        Integer num = h2Var.f;
        int intValue = num != null ? num.intValue() : h2Var.getThemedColor(org.telegram.ui.ActionBar.i6.h5);
        Paint paint = this.b;
        paint.setColor(intValue);
        View[] viewPages = h2Var.b.getViewPages();
        this.d = 0.0f;
        for (cc ccVar : viewPages) {
            if (ccVar != 0) {
                float clamp = Utilities.clamp(1.0f - Math.abs(ccVar.getTranslationX() / Math.max(1, ccVar.getMeasuredWidth())), 1.0f, 0.0f);
                float f10 = this.d;
                boolean z10 = ccVar instanceof f2;
                if (z10) {
                    g2 g2Var = (g2) ((f2) ccVar);
                    f7 = Math.max(0.0f, g2Var.getHeight() - g2Var.a.getMeasuredHeight());
                } else {
                    f7 = 0.0f;
                }
                this.d = (f7 * clamp) + f10;
                if (ccVar.getVisibility() == 0 && z10) {
                }
            }
        }
        float d = this.a.d(this.d <= ((float) AndroidUtilities.statusBarHeight) ? 1.0f : 0.0f, false);
        this.d = Math.max(AndroidUtilities.statusBarHeight, this.d) - (AndroidUtilities.statusBarHeight * d);
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.f3) h2Var).backgroundPaddingLeft;
        float f11 = this.d;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.f3) h2Var).backgroundPaddingLeft;
        rectF.set(i10, f11, width - i11, AndroidUtilities.dp(8.0f) + getHeight());
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, d);
        canvas.drawRoundRect(rectF, lerp, lerp, paint);
        if (h2Var.topBulletinContainer != null) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) h2Var).containerView;
            float y3 = viewGroup.getY() + this.d;
            i12 = ((org.telegram.ui.ActionBar.f3) h2Var).backgroundPaddingTop;
            h2Var.topBulletinContainer.setTranslationY(Math.max(y3 + i12, h2Var.topBulletinContainer.getHeight() + (AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight)) - h2Var.topBulletinContainer.getBottom());
        }
        canvas.save();
        Path path = this.c;
        path.rewind();
        path.addRoundRect(rectF, lerp, lerp, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.d) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.e.dismiss();
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        h2 h2Var = this.e;
        FrameLayout frameLayout = h2Var.e;
        if (frameLayout != null) {
            frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
            i12 = h2Var.e.getMeasuredHeight();
        } else {
            i12 = 0;
        }
        h2Var.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(0, size2 - i12), TLObject.FLAG_30));
        setMeasuredDimension(size, size2);
    }
}
