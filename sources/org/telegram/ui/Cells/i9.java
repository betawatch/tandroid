package org.telegram.ui.Cells;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.w90;
import org.telegram.ui.Components.z90;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class i9 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final w1 a;
    public final w90 b;
    public int c;
    public Integer d;
    public int e;
    public int f;
    public int h;
    public boolean n;
    public CharSequence r;
    public final org.telegram.ui.ActionBar.u6 s;
    public int v;

    public i9(Context context) {
        this(context, 24, null);
    }

    public final void c(ArrayList arrayList, boolean z10) {
        w1 w1Var = this.a;
        if (arrayList != null) {
            arrayList.add(ObjectAnimator.ofFloat(w1Var, (Property<w1, Float>) View.ALPHA, z10 ? 1.0f : 0.5f));
        } else {
            w1Var.setAlpha(z10 ? 1.0f : 0.5f);
        }
    }

    public int getFixedSize() {
        return this.h;
    }

    public CharSequence getText() {
        return this.a.getText();
    }

    public z90 getTextView() {
        return this.a;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        w90 w90Var = this.b;
        if (w90Var != null) {
            canvas.save();
            w1 w1Var = this.a;
            canvas.translate(w1Var.getLeft(), w1Var.getTop());
            if (w90Var.f(canvas)) {
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
        w1 w1Var = this.a;
        if (charSequence == null) {
            w1Var.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
        } else {
            w1Var.setPadding(0, AndroidUtilities.dp(this.e), 0, AndroidUtilities.dp(this.f));
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
        w1Var.setText(charSequence);
    }

    public void setTextColor(int i10) {
        w1 w1Var = this.a;
        ColorStateList linkTextColors = w1Var.getLinkTextColors();
        org.telegram.ui.ActionBar.f7.r(w1Var);
        org.telegram.ui.ActionBar.f7.H(w1Var, this.c, this.s);
        if (linkTextColors != null) {
            w1Var.setLinkTextColor(linkTextColors);
        }
        w1Var.setTextColor(i10);
    }

    public void setTextColorByKey(int i10) {
        org.telegram.ui.ActionBar.u6 u6Var = this.s;
        w1 w1Var = this.a;
        org.telegram.ui.ActionBar.f7.V(w1Var, i10, u6Var);
        w1Var.setTag(Integer.valueOf(i10));
    }

    public void setTextGravity(int i10) {
        this.a.setGravity(i10);
    }

    public void setTopPadding(int i10) {
        this.e = i10;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public void updateColors() {
        try {
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.B6, this.s);
            w1 w1Var = this.a;
            if (w1Var == null || w02 == this.v) {
                return;
            }
            this.v = w02;
            w1Var.setEmojiColor(w02);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public i9(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        this(context, 24, u6Var);
    }

    public i9(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.c = org.telegram.ui.ActionBar.y6.J6;
        this.e = 10;
        this.f = 17;
        this.s = u6Var;
        w90 w90Var = new w90(this);
        this.b = w90Var;
        w1 w1Var = new w1(this, context, w90Var, u6Var);
        this.a = w1Var;
        w1Var.setTextSize(1, 14.0f);
        w1Var.setGravity(LocaleController.isRTL ? 5 : 3);
        w1Var.setPadding(0, AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(17.0f));
        w1Var.setMovementMethod(LinkMovementMethod.getInstance());
        int i11 = org.telegram.ui.ActionBar.y6.B6;
        org.telegram.ui.ActionBar.f7.V(w1Var, i11, u6Var);
        int w02 = org.telegram.ui.ActionBar.y6.w0(i11, u6Var);
        this.v = w02;
        w1Var.setEmojiColor(w02);
        org.telegram.ui.ActionBar.f7.H(w1Var, this.c, u6Var);
        w1Var.setImportantForAccessibility(2);
        float f7 = i10;
        addView(w1Var, gb1.h(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, f7, 0.0f, f7, 0.0f));
        this.n = LocaleController.isRTL;
        setWillNotDraw(false);
    }

    public void a() {
    }

    public void b() {
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
