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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.x70;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public class z8 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final b2 a;
    public final n2.n0 b;
    public int c;
    public Integer d;
    public int e;
    public int f;
    public int h;
    public boolean n;
    public CharSequence r;
    public final org.telegram.ui.ActionBar.g6 s;
    public int w;

    public z8(Context context) {
        this(24, context, null);
    }

    public final void c(ArrayList arrayList, boolean z9) {
        b2 b2Var = this.a;
        if (arrayList != null) {
            arrayList.add(ObjectAnimator.ofFloat(b2Var, (Property<b2, Float>) View.ALPHA, z9 ? 1.0f : 0.5f));
        } else {
            b2Var.setAlpha(z9 ? 1.0f : 0.5f);
        }
    }

    public int getFixedSize() {
        return this.h;
    }

    public CharSequence getText() {
        return this.a.getText();
    }

    public x70 getTextView() {
        return this.a;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        n2.n0 n0Var = this.b;
        if (n0Var != null) {
            canvas.save();
            b2 b2Var = this.a;
            canvas.translate(b2Var.getLeft(), b2Var.getTop());
            if (n0Var.h(canvas)) {
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
    public final void onMeasure(int i7, int i10) {
        int i11 = this.h;
        if (i11 == -1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, TLObject.FLAG_30));
        } else if (i11 != 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.h), TLObject.FLAG_30));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
    }

    public void setBottomPadding(int i7) {
        this.f = i7;
    }

    public void setFixedSize(int i7) {
        this.h = i7;
    }

    public void setLinkTextColorKey(int i7) {
        this.c = i7;
    }

    public void setLinkTextRippleColor(Integer num) {
        this.d = num;
    }

    public void setText(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.r)) {
            return;
        }
        this.r = charSequence;
        b2 b2Var = this.a;
        if (charSequence == null) {
            b2Var.setPadding(0, org.telegram.messenger.g0.L(2.0f), 0, 0);
        } else {
            b2Var.setPadding(0, org.telegram.messenger.g0.L(this.e), 0, org.telegram.messenger.g0.L(this.f));
        }
        SpannableString spannableString = null;
        if (charSequence != null) {
            int length = charSequence.length();
            for (int i7 = 0; i7 < length - 1; i7++) {
                if (charSequence.charAt(i7) == '\n') {
                    int i10 = i7 + 1;
                    if (charSequence.charAt(i10) == '\n') {
                        if (spannableString == null) {
                            spannableString = new SpannableString(charSequence);
                        }
                        spannableString.setSpan(new AbsoluteSizeSpan(10, true), i10, i7 + 2, 33);
                    }
                }
            }
        }
        if (spannableString != null) {
            charSequence = spannableString;
        }
        b2Var.setText(charSequence);
    }

    public void setTextColor(int i7) {
        b2 b2Var = this.a;
        ColorStateList linkTextColors = b2Var.getLinkTextColors();
        org.telegram.ui.ActionBar.r6 r6Var = org.telegram.ui.ActionBar.s6.a;
        b2Var.setTag(R.id.theme_bind, null);
        org.telegram.ui.ActionBar.s6.G(b2Var, this.c, this.s);
        if (linkTextColors != null) {
            b2Var.setLinkTextColor(linkTextColors);
        }
        b2Var.setTextColor(i7);
    }

    public void setTextColorByKey(int i7) {
        org.telegram.ui.ActionBar.g6 g6Var = this.s;
        b2 b2Var = this.a;
        org.telegram.ui.ActionBar.s6.U(b2Var, i7, g6Var);
        b2Var.setTag(Integer.valueOf(i7));
    }

    public void setTextGravity(int i7) {
        this.a.setGravity(i7);
    }

    public void setTopPadding(int i7) {
        this.e = i7;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public void updateColors() {
        try {
            int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.B6, this.s);
            b2 b2Var = this.a;
            if (b2Var == null || w02 == this.w) {
                return;
            }
            this.w = w02;
            b2Var.setEmojiColor(w02);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public z8(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        this(24, context, g6Var);
    }

    public z8(int i7, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.c = org.telegram.ui.ActionBar.l6.J6;
        this.e = 10;
        this.f = 17;
        this.s = g6Var;
        n2.n0 n0Var = new n2.n0(this);
        this.b = n0Var;
        b2 b2Var = new b2(this, context, n0Var, g6Var);
        this.a = b2Var;
        b2Var.setTextSize(1, 14.0f);
        b2Var.setGravity(id.a0 ? 5 : 3);
        b2Var.setPadding(0, org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(17.0f));
        b2Var.setMovementMethod(LinkMovementMethod.getInstance());
        int i10 = org.telegram.ui.ActionBar.l6.B6;
        org.telegram.ui.ActionBar.s6.U(b2Var, i10, g6Var);
        int w02 = org.telegram.ui.ActionBar.l6.w0(i10, g6Var);
        this.w = w02;
        b2Var.setEmojiColor(w02);
        org.telegram.ui.ActionBar.s6.G(b2Var, this.c, g6Var);
        b2Var.setImportantForAccessibility(2);
        float f10 = i7;
        addView(b2Var, c8.ha.d(-1, -2.0f, (id.a0 ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        this.n = id.a0;
        setWillNotDraw(false);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void a() {
    }

    public void b() {
    }
}
