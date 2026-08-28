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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class dp extends View {
    public final CheckBoxBase a;
    public Drawable b;
    public int c;

    public dp(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.a = new CheckBoxBase(i9, this, b6Var);
    }

    public final void a(boolean z10, boolean z11) {
        this.a.f(-1, z10, z11);
    }

    public final void b(int i9, int i10, int i11) {
        this.a.h(i9, i10, i11);
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
        drawable.setBounds(org.telegram.messenger.ll.x(2, measuredWidth, drawable), org.telegram.messenger.ll.e(2, measuredHeight, this.b), org.telegram.messenger.ll.B(2, measuredWidth, this.b), org.telegram.messenger.ll.z(2, measuredHeight, this.b));
        this.b.draw(canvas);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.2f));
        paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.U6, false));
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        this.a.e(0, 0, i11 - i9, i12 - i10);
    }

    public void setCirclePaintProvider(GenericProvider<Void, Paint> genericProvider) {
        CheckBoxBase checkBoxBase = this.a;
        if (checkBoxBase.G == genericProvider) {
            return;
        }
        checkBoxBase.G = genericProvider;
        checkBoxBase.b();
    }

    public void setDrawBackgroundAsArc(int i9) {
        this.a.d(i9);
    }

    public void setDrawUnchecked(boolean z10) {
        this.a.k(z10);
    }

    public void setDuration(long j10) {
        this.a.H = j10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        CheckBoxBase checkBoxBase = this.a;
        if (checkBoxBase.k != z10) {
            checkBoxBase.k = z10;
            checkBoxBase.b();
        }
        super.setEnabled(z10);
    }

    public void setForbidden(boolean z10) {
        CheckBoxBase checkBoxBase = this.a;
        if (checkBoxBase.n == z10) {
            return;
        }
        checkBoxBase.n = z10;
        checkBoxBase.b();
    }

    public void setIcon(int i9) {
        if (i9 != this.c) {
            this.c = i9;
            if (i9 == 0) {
                this.b = null;
                return;
            }
            Drawable mutate = getContext().getDrawable(i9).mutate();
            this.b = mutate;
            mutate.setColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.U6, false), PorterDuff.Mode.MULTIPLY);
        }
    }

    public void setNum(int i9) {
        String str;
        CheckBoxBase checkBoxBase = this.a;
        if (i9 >= 0) {
            checkBoxBase.getClass();
            str = "" + (i9 + 1);
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

    public void setProgressDelegate(ep epVar) {
        this.a.D = epVar;
    }
}
