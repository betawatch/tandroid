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
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.l80;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class b9 extends FrameLayout {
    public final x1 a;
    public final i80 b;
    public int c;
    public Integer d;
    public int e;
    public int f;
    public int h;
    public boolean n;
    public CharSequence r;
    public final org.telegram.ui.ActionBar.b6 s;

    public b9(Context context) {
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

    public l80 getTextView() {
        return this.a;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        i80 i80Var = this.b;
        if (i80Var != null) {
            canvas.save();
            x1 x1Var = this.a;
            canvas.translate(x1Var.getLeft(), x1Var.getTop());
            if (i80Var.f(canvas)) {
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
    public final void onMeasure(int i9, int i10) {
        int i11 = this.h;
        if (i11 == -1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, TLObject.FLAG_30));
        } else if (i11 != 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.h), TLObject.FLAG_30));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
    }

    public void setBottomPadding(int i9) {
        this.f = i9;
    }

    public void setFixedSize(int i9) {
        this.h = i9;
    }

    public void setLinkTextColorKey(int i9) {
        this.c = i9;
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
            for (int i9 = 0; i9 < length - 1; i9++) {
                if (charSequence.charAt(i9) == '\n') {
                    int i10 = i9 + 1;
                    if (charSequence.charAt(i10) == '\n') {
                        if (spannableString == null) {
                            spannableString = new SpannableString(charSequence);
                        }
                        spannableString.setSpan(new AbsoluteSizeSpan(10, true), i10, i9 + 2, 33);
                    }
                }
            }
        }
        if (spannableString != null) {
            charSequence = spannableString;
        }
        x1Var.setText(charSequence);
    }

    public void setTextColor(int i9) {
        this.a.setTextColor(i9);
    }

    public void setTextColorByKey(int i9) {
        int v02 = org.telegram.ui.ActionBar.f6.v0(i9, this.s);
        x1 x1Var = this.a;
        x1Var.setTextColor(v02);
        x1Var.setTag(Integer.valueOf(i9));
    }

    public void setTextGravity(int i9) {
        this.a.setGravity(i9);
    }

    public void setTopPadding(int i9) {
        this.e = i9;
    }

    public b9(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        this(context, 24, b6Var);
    }

    public b9(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.c = org.telegram.ui.ActionBar.f6.J6;
        this.e = 10;
        this.f = 17;
        this.s = b6Var;
        i80 i80Var = new i80(this);
        this.b = i80Var;
        x1 x1Var = new x1(this, context, i80Var, b6Var);
        this.a = x1Var;
        x1Var.setTextSize(1, 14.0f);
        x1Var.setGravity(LocaleController.isRTL ? 5 : 3);
        x1Var.setPadding(0, AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(17.0f));
        x1Var.setMovementMethod(LinkMovementMethod.getInstance());
        int i10 = org.telegram.ui.ActionBar.f6.B6;
        x1Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        x1Var.setEmojiColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        x1Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(this.c, b6Var));
        x1Var.setImportantForAccessibility(2);
        float f10 = i9;
        addView(x1Var, g7.e6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        this.n = LocaleController.isRTL;
        setWillNotDraw(false);
    }

    public void a() {
    }

    public void b() {
    }
}
