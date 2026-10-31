package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f2 extends FrameLayout implements org.telegram.ui.Cells.j9, c3 {
    public final m60 a;
    public final f4 b;
    public z2 c;
    public final d2 d;
    public final e2 e;
    public TL_iv.pageBlockPreformatted f;
    public CharSequence h;
    public boolean n;
    public int r;
    public final Paint s;

    public f2(Context context, final m60 m60Var, f4 f4Var) {
        super(context);
        this.s = new Paint();
        this.a = m60Var;
        this.b = f4Var;
        d2 d2Var = new d2(this, context, m60Var);
        this.d = d2Var;
        d2Var.setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
        addView(d2Var, w7.b6.c(-2.0f, -1));
        e2 e2Var = new e2(this, context, m60Var, f4Var);
        this.e = e2Var;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        int L = org.telegram.messenger.i0.L(16.0f);
        layoutParams.rightMargin = L;
        layoutParams.leftMargin = L;
        int L2 = org.telegram.messenger.i0.L(12.0f);
        layoutParams.bottomMargin = L2;
        layoutParams.topMargin = L2;
        org.telegram.messenger.zs.i(e2Var);
        d2Var.addView(e2Var, layoutParams);
        d2Var.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: org.telegram.ui.c2
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i10, int i11, int i12, int i13) {
                org.telegram.ui.Cells.k9 k9Var = ((h4) m60.this).P0;
                if (k9Var == null || !k9Var.x()) {
                    return;
                }
                k9Var.w();
            }
        });
        setWillNotDraw(false);
    }

    public static /* synthetic */ void a(f2 f2Var, SpannableString spannableString) {
        setDiffMarkerSpans(spannableString);
        if (f2Var.h == spannableString) {
            f2Var.e.requestLayout();
            f2Var.invalidate();
        }
    }

    public static SpannableString b(f2 f2Var, CharSequence charSequence, String str) {
        SpannableString spannableString = new SpannableString(charSequence);
        setDiffMarkerSpans(spannableString);
        Pattern pattern = org.telegram.ui.Components.g90.a;
        char[] cArr = new char[spannableString.length()];
        int i10 = 0;
        for (int i11 = 0; i11 <= spannableString.length(); i11++) {
            if (i11 >= spannableString.length() || spannableString.charAt(i11) == '\n') {
                int h = org.telegram.ui.Components.g90.h(i10, spannableString);
                int i12 = i10;
                while (i12 < i11) {
                    cArr[i12] = (h == 3 || i12 == i10) ? ' ' : spannableString.charAt(i12);
                    i12++;
                }
                if (i11 < spannableString.length()) {
                    cArr[i11] = '\n';
                }
                i10 = i11 + 1;
            }
        }
        String str2 = new String(cArr);
        h0 h0Var = new h0(2, f2Var, spannableString);
        di.s sVar = di.l.a;
        if (str2.length() == spannableString.length()) {
            String b10 = di.s.b(str);
            if (!b10.isEmpty() && !str2.isEmpty()) {
                di.l.a.d(str2, b10, new ag.m(9, spannableString, h0Var));
            }
        }
        return spannableString;
    }

    private static void setDiffMarkerSpans(SpannableString spannableString) {
        int i10 = 0;
        while (i10 <= spannableString.length()) {
            int indexOf = TextUtils.indexOf((CharSequence) spannableString, '\n', i10);
            if (indexOf < 0) {
                indexOf = spannableString.length();
            }
            int h = org.telegram.ui.Components.g90.h(i10, spannableString);
            if (h == 1) {
                spannableString.setSpan(new di.e(19), i10, i10 + 1, 33);
            } else if (h == 2) {
                spannableString.setSpan(new di.e(20), i10, i10 + 1, 33);
            } else if (h == 3 && indexOf > i10) {
                spannableString.setSpan(new di.e(6), i10, indexOf, 33);
            }
            i10 = indexOf + 1;
        }
    }

    @Override // org.telegram.ui.c3
    public int getBoundLeft() {
        if (this.c == null) {
            return -1;
        }
        int k10 = this.c.k() + org.telegram.messenger.i0.L(16.0f);
        this.a.getClass();
        return k10 - org.telegram.messenger.i0.L(18);
    }

    @Override // org.telegram.ui.c3
    public int getBoundRight() {
        if (this.c == null) {
            return -1;
        }
        int l4 = this.c.l() + org.telegram.messenger.i0.L(16.0f);
        this.a.getClass();
        return org.telegram.messenger.i0.L(18) + l4;
    }

    @Override // org.telegram.ui.c3
    public int getLastLineBoundRight() {
        if (this.c == null) {
            return -1;
        }
        int m10 = this.c.m() + org.telegram.messenger.i0.L(16.0f);
        this.a.getClass();
        return org.telegram.messenger.i0.L(18) + m10;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return org.telegram.messenger.z20.a(this);
    }

    @Override // org.telegram.ui.Cells.j9
    public final void h(ArrayList arrayList) {
        z2 z2Var = this.c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override // android.view.View, org.telegram.ui.Cells.r9
    public final void invalidate() {
        this.e.invalidate();
        super.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        StaticLayout staticLayout;
        TL_iv.pageBlockPreformatted pageblockpreformatted = this.f;
        if (pageblockpreformatted == null) {
            return;
        }
        if (!pageblockpreformatted.diff) {
            canvas.drawRect(0.0f, pageblockpreformatted.continuesPrev ? 0.0f : org.telegram.messenger.i0.L(8.0f), getMeasuredWidth(), getMeasuredHeight() - (this.f.continuesNext ? 0 : org.telegram.messenger.i0.L(8.0f)), h4.q1);
            return;
        }
        z2 z2Var = this.c;
        if (z2Var == null || (staticLayout = z2Var.d) == null) {
            return;
        }
        CharSequence text = staticLayout.getText();
        int top = this.e.getTop() + this.d.getTop();
        int lineCount = staticLayout.getLineCount();
        int i10 = 0;
        while (i10 < lineCount) {
            int h = org.telegram.ui.Components.g90.h(staticLayout.getLineStart(i10), text);
            Paint paint = this.s;
            if (h == 1) {
                paint.setColor(640993113);
            } else if (h == 2) {
                paint.setColor(654261040);
            } else {
                i10++;
            }
            canvas.drawRect(0.0f, staticLayout.getLineTop(i10) + top, getMeasuredWidth(), staticLayout.getLineBottom(i10) + top + (i10 == lineCount + (-1) ? this.r : 0), paint);
            i10++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        z2 z2Var = this.c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.g(2131754871, h4.h(this.a, this.b, z2Var)));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        d2 d2Var = this.d;
        d2Var.measure(makeMeasureSpec, makeMeasureSpec2);
        setMeasuredDimension(size, d2Var.getMeasuredHeight());
    }

    public void setBlock(TL_iv.pageBlockPreformatted pageblockpreformatted) {
        f4 f4Var;
        this.h = null;
        this.f = pageblockpreformatted;
        this.n = true;
        int i10 = (!pageblockpreformatted.diff || (f4Var = this.b) == null) ? 0 : f4Var.H;
        d2 d2Var = this.d;
        d2Var.setScrollX(i10);
        this.n = false;
        d2Var.setHorizontalScrollBarEnabled(true ^ pageblockpreformatted.diff);
        d2Var.setPadding(0, pageblockpreformatted.continuesPrev ? 0 : org.telegram.messenger.i0.L(8.0f), 0, pageblockpreformatted.continuesNext ? 0 : org.telegram.messenger.i0.L(8.0f));
        e2 e2Var = this.e;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) e2Var.getLayoutParams();
        marginLayoutParams.topMargin = pageblockpreformatted.continuesPrev ? 0 : org.telegram.messenger.i0.L(12.0f);
        marginLayoutParams.bottomMargin = pageblockpreformatted.continuesNext ? 0 : org.telegram.messenger.i0.L(12.0f);
        e2Var.requestLayout();
    }
}
