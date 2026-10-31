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
import org.telegram.messenger.cd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.p80;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class b9 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final b2 a;
    public final ji.a b;
    public int c;
    public Integer d;
    public int e;
    public int f;
    public int h;
    public boolean n;
    public CharSequence r;
    public final org.telegram.ui.ActionBar.p6 s;
    public int w;

    public b9(Context context) {
        this(24, context, null);
    }

    public final void c(ArrayList arrayList, boolean z10) {
        b2 b2Var = this.a;
        if (arrayList != null) {
            arrayList.add(ObjectAnimator.ofFloat(b2Var, (Property<b2, Float>) View.ALPHA, z10 ? 1.0f : 0.5f));
        } else {
            b2Var.setAlpha(z10 ? 1.0f : 0.5f);
        }
    }

    public int getFixedSize() {
        return this.h;
    }

    public CharSequence getText() {
        return this.a.getText();
    }

    public p80 getTextView() {
        return this.a;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ji.a aVar = this.b;
        if (aVar != null) {
            canvas.save();
            b2 b2Var = this.a;
            canvas.translate(b2Var.getLeft(), b2Var.getTop());
            if (aVar.h(canvas)) {
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
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(this.h), TLObject.FLAG_30));
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
        b2 b2Var = this.a;
        if (charSequence == null) {
            b2Var.setPadding(0, org.telegram.messenger.i0.L(2.0f), 0, 0);
        } else {
            b2Var.setPadding(0, org.telegram.messenger.i0.L(this.e), 0, org.telegram.messenger.i0.L(this.f));
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
        b2Var.setText(charSequence);
    }

    public void setTextColor(int i10) {
        b2 b2Var = this.a;
        ColorStateList linkTextColors = b2Var.getLinkTextColors();
        org.telegram.ui.ActionBar.z6 z6Var = org.telegram.ui.ActionBar.a7.a;
        b2Var.setTag(R.id.theme_bind, null);
        org.telegram.ui.ActionBar.a7.H(b2Var, this.c, this.s);
        if (linkTextColors != null) {
            b2Var.setLinkTextColor(linkTextColors);
        }
        b2Var.setTextColor(i10);
    }

    public void setTextColorByKey(int i10) {
        org.telegram.ui.ActionBar.p6 p6Var = this.s;
        b2 b2Var = this.a;
        org.telegram.ui.ActionBar.a7.V(b2Var, i10, p6Var);
        b2Var.setTag(Integer.valueOf(i10));
    }

    public void setTextGravity(int i10) {
        this.a.setGravity(i10);
    }

    public void setTopPadding(int i10) {
        this.e = i10;
    }

    public void updateColors() {
        try {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.B6, this.s);
            b2 b2Var = this.a;
            if (b2Var == null || w02 == this.w) {
                return;
            }
            this.w = w02;
            b2Var.setEmojiColor(w02);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public b9(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        this(24, context, p6Var);
    }

    public b9(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.c = org.telegram.ui.ActionBar.t6.J6;
        this.e = 10;
        this.f = 17;
        this.s = p6Var;
        ji.a aVar = new ji.a(this);
        this.b = aVar;
        b2 b2Var = new b2(this, context, aVar, p6Var);
        this.a = b2Var;
        b2Var.setTextSize(1, 14.0f);
        b2Var.setGravity(cd.X ? 5 : 3);
        b2Var.setPadding(0, org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(17.0f));
        b2Var.setMovementMethod(LinkMovementMethod.getInstance());
        int i11 = org.telegram.ui.ActionBar.t6.B6;
        org.telegram.ui.ActionBar.a7.V(b2Var, i11, p6Var);
        int w02 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
        this.w = w02;
        b2Var.setEmojiColor(w02);
        org.telegram.ui.ActionBar.a7.H(b2Var, this.c, p6Var);
        b2Var.setImportantForAccessibility(2);
        float f7 = i10;
        addView(b2Var, w7.b6.d(-1, -2.0f, (cd.X ? 5 : 3) | 48, f7, 0.0f, f7, 0.0f));
        this.n = cd.X;
        setWillNotDraw(false);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void a() {
    }

    public void b() {
    }
}
