package org.telegram.ui.Cells;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.util.Property;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.a90;
import org.telegram.ui.Components.d90;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public class e9 extends FrameLayout {
    public final x1 a;
    public final a90 b;
    public int c;
    public Integer d;
    public int e;
    public int f;
    public int h;
    public boolean n;
    public CharSequence r;
    public final org.telegram.ui.ActionBar.f6 s;

    public e9(Context context) {
        this(context, 24, null);
    }

    public final void c(ArrayList arrayList, boolean z10) {
        x1 x1Var = this.a;
        if (arrayList != null) {
            arrayList.add(ObjectAnimator.ofFloat(x1Var, (Property<x1, Float>) View.ALPHA, z10 ? 1.0f : 0.5f));
        } else {
            x1Var.setAlpha(z10 ? 1.0f : 0.5f);
        }
    }

    public int getFixedSize() {
        return this.h;
    }

    public CharSequence getText() {
        return this.a.getText();
    }

    public d90 getTextView() {
        return this.a;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        a90 a90Var = this.b;
        if (a90Var != null) {
            canvas.save();
            x1 x1Var = this.a;
            canvas.translate(x1Var.getLeft(), x1Var.getTop());
            if (a90Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(TextView.class.getName());
        accessibilityNodeInfo.setText(this.r);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = this.h;
        if (i12 == -1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, TLObject.FLAG_30));
        } else if (i12 != 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.h), TLObject.FLAG_30));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
    }

    public void setBottomPadding(int i10) {
        this.f = i10;
    }

    public void setFixedSize(int i10) {
        this.h = i10;
    }

    public void setLinkTextColorKey(int i10) {
        this.c = i10;
    }

    public void setLinkTextRippleColor(Integer num) {
        this.d = num;
    }

    public void setText(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.r)) {
            return;
        }
        this.r = charSequence;
        x1 x1Var = this.a;
        if (charSequence == null) {
            x1Var.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
        } else {
            x1Var.setPadding(0, AndroidUtilities.dp(this.e), 0, AndroidUtilities.dp(this.f));
        }
        SpannableString spannableString = null;
        if (charSequence != null) {
            int length = charSequence.length();
            for (int i10 = 0; i10 < length - 1; i10++) {
                if (charSequence.charAt(i10) == '\n') {
                    int i11 = i10 + 1;
                    if (charSequence.charAt(i11) == '\n') {
                        if (spannableString == null) {
                            spannableString = new SpannableString(charSequence);
                        }
                        spannableString.setSpan(new AbsoluteSizeSpan(10, true), i11, i10 + 2, 33);
                    }
                }
            }
        }
        if (spannableString != null) {
            charSequence = spannableString;
        }
        x1Var.setText(charSequence);
    }

    public void setTextColor(int i10) {
        this.a.setTextColor(i10);
    }

    public void setTextColorByKey(int i10) {
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, this.s);
        x1 x1Var = this.a;
        x1Var.setTextColor(v02);
        x1Var.setTag(Integer.valueOf(i10));
    }

    public void setTextGravity(int i10) {
        this.a.setGravity(i10);
    }

    public void setTopPadding(int i10) {
        this.e = i10;
    }

    public e9(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, 24, f6Var);
    }

    public e9(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.c = org.telegram.ui.ActionBar.j6.J6;
        this.e = 10;
        this.f = 17;
        this.s = f6Var;
        a90 a90Var = new a90(this);
        this.b = a90Var;
        x1 x1Var = new x1(this, context, a90Var, f6Var);
        this.a = x1Var;
        x1Var.setTextSize(1, 14.0f);
        x1Var.setGravity(LocaleController.isRTL ? 5 : 3);
        x1Var.setPadding(0, AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(17.0f));
        x1Var.setMovementMethod(LinkMovementMethod.getInstance());
        int i11 = org.telegram.ui.ActionBar.j6.B6;
        x1Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        x1Var.setEmojiColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        x1Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(this.c, f6Var));
        x1Var.setImportantForAccessibility(2);
        float f7 = i10;
        addView(x1Var, w7.x5.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, f7, 0.0f, f7, 0.0f));
        this.n = LocaleController.isRTL;
        setWillNotDraw(false);
    }

    public void a() {
    }

    public void b() {
    }
}
