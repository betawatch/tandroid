package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class kp extends View {
    public final CheckBoxBase a;
    public Drawable b;
    public int c;

    public kp(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = new CheckBoxBase(i10, this, f6Var);
    }

    public final void a(boolean z4, boolean z10) {
        this.a.f(-1, z4, z10);
    }

    public final void b(int i10, int i11, int i12) {
        this.a.h(i10, i11, i12);
    }

    public CheckBoxBase getCheckBoxBase() {
        return this.a;
    }

    public boolean getDrawUnchecked() {
        return this.a.z;
    }

    public float getProgress() {
        return this.a.getProgress();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.l = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.l = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.b == null) {
            this.a.a(canvas);
            return;
        }
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() >> 1;
        Drawable drawable = this.b;
        drawable.setBounds(org.telegram.ui.b.u(2, measuredWidth, drawable), org.telegram.ui.b.f(2, measuredHeight, this.b), org.telegram.ui.b.A(2, measuredWidth, this.b), org.telegram.ui.b.y(2, measuredHeight, this.b));
        this.b.draw(canvas);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.2f));
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.U6, false));
        canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth - AndroidUtilities.dp(1.5f), paint);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.a.q);
    }

    @Override // android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.a.e(0, 0, i12 - i10, i13 - i11);
    }

    public void setCirclePaintProvider(GenericProvider<Void, Paint> genericProvider) {
        CheckBoxBase checkBoxBase = this.a;
        if (checkBoxBase.G == genericProvider) {
            return;
        }
        checkBoxBase.G = genericProvider;
        checkBoxBase.b();
    }

    public void setDrawBackgroundAsArc(int i10) {
        this.a.d(i10);
    }

    public void setDrawUnchecked(boolean z4) {
        this.a.k(z4);
    }

    public void setDuration(long j10) {
        this.a.H = j10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        CheckBoxBase checkBoxBase = this.a;
        if (checkBoxBase.k != z4) {
            checkBoxBase.k = z4;
            checkBoxBase.b();
        }
        super.setEnabled(z4);
    }

    public void setForbidden(boolean z4) {
        CheckBoxBase checkBoxBase = this.a;
        if (checkBoxBase.n == z4) {
            return;
        }
        checkBoxBase.n = z4;
        checkBoxBase.b();
    }

    public void setIcon(int i10) {
        if (i10 != this.c) {
            this.c = i10;
            if (i10 == 0) {
                this.b = null;
                return;
            }
            Drawable mutate = getContext().getDrawable(i10).mutate();
            this.b = mutate;
            mutate.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.U6, false), PorterDuff.Mode.MULTIPLY);
        }
    }

    public void setNum(int i10) {
        String str;
        CheckBoxBase checkBoxBase = this.a;
        if (i10 >= 0) {
            checkBoxBase.getClass();
            str = "" + (i10 + 1);
        } else {
            str = checkBoxBase.p != null ? checkBoxBase.C : null;
        }
        String str2 = checkBoxBase.C;
        if (str2 == null) {
            if (str == null) {
                return;
            }
        } else if (str2.equals(str)) {
            return;
        }
        checkBoxBase.C = str;
        checkBoxBase.b();
    }

    public void setProgressDelegate(lp lpVar) {
        this.a.D = lpVar;
    }
}
