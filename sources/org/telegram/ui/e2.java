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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class e2 extends FrameLayout implements org.telegram.ui.Cells.h9, c3 {
    public final o50 a;
    public final e4 b;
    public z2 c;
    public final c2 d;
    public final d2 e;
    public TL_iv.pageBlockPreformatted f;
    public CharSequence h;
    public boolean n;
    public int r;
    public final Paint s;

    public e2(Context context, final o50 o50Var, e4 e4Var) {
        super(context);
        this.s = new Paint();
        this.a = o50Var;
        this.b = e4Var;
        c2 c2Var = new c2(this, context, o50Var);
        this.d = c2Var;
        c2Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        addView(c2Var, c8.ha.c(-2.0f, -1));
        d2 d2Var = new d2(this, context, o50Var, e4Var);
        this.e = d2Var;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        int L = org.telegram.messenger.g0.L(16.0f);
        layoutParams.rightMargin = L;
        layoutParams.leftMargin = L;
        int L2 = org.telegram.messenger.g0.L(12.0f);
        layoutParams.bottomMargin = L2;
        layoutParams.topMargin = L2;
        org.telegram.messenger.qs.i(d2Var);
        c2Var.addView(d2Var, layoutParams);
        c2Var.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: org.telegram.ui.b2
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i7, int i10, int i11, int i12) {
                org.telegram.ui.Cells.i9 i9Var = ((g4) o50.this).P0;
                if (i9Var == null || !i9Var.x()) {
                    return;
                }
                i9Var.w();
            }
        });
        setWillNotDraw(false);
    }

    public static /* synthetic */ void a(e2 e2Var, SpannableString spannableString) {
        setDiffMarkerSpans(spannableString);
        if (e2Var.h == spannableString) {
            e2Var.e.requestLayout();
            e2Var.invalidate();
        }
    }

    public static SpannableString b(e2 e2Var, CharSequence charSequence, String str) {
        SpannableString spannableString = new SpannableString(charSequence);
        setDiffMarkerSpans(spannableString);
        Pattern pattern = org.telegram.ui.Components.n80.a;
        char[] cArr = new char[spannableString.length()];
        int i7 = 0;
        for (int i10 = 0; i10 <= spannableString.length(); i10++) {
            if (i10 >= spannableString.length() || spannableString.charAt(i10) == '\n') {
                int h = org.telegram.ui.Components.n80.h(i7, spannableString);
                int i11 = i7;
                while (i11 < i10) {
                    cArr[i11] = (h == 3 || i11 == i7) ? ' ' : spannableString.charAt(i11);
                    i11++;
                }
                if (i10 < spannableString.length()) {
                    cArr[i10] = '\n';
                }
                i7 = i10 + 1;
            }
        }
        String str2 = new String(cArr);
        org.telegram.ui.ActionBar.p pVar = new org.telegram.ui.ActionBar.p(8, e2Var, spannableString);
        ni.s sVar = ni.m.a;
        if (str2.length() == spannableString.length()) {
            String b10 = ni.s.b(str);
            if (!b10.isEmpty() && !str2.isEmpty()) {
                ni.m.a.d(str2, b10, new zh.i3(spannableString, pVar));
            }
        }
        return spannableString;
    }

    private static void setDiffMarkerSpans(SpannableString spannableString) {
        int i7 = 0;
        while (i7 <= spannableString.length()) {
            int indexOf = TextUtils.indexOf((CharSequence) spannableString, '\n', i7);
            if (indexOf < 0) {
                indexOf = spannableString.length();
            }
            int h = org.telegram.ui.Components.n80.h(i7, spannableString);
            if (h == 1) {
                spannableString.setSpan(new ni.f(19), i7, i7 + 1, 33);
            } else if (h == 2) {
                spannableString.setSpan(new ni.f(20), i7, i7 + 1, 33);
            } else if (h == 3 && indexOf > i7) {
                spannableString.setSpan(new ni.f(6), i7, indexOf, 33);
            }
            i7 = indexOf + 1;
        }
    }

    @Override // org.telegram.ui.c3
    public int getBoundLeft() {
        if (this.c == null) {
            return -1;
        }
        int k10 = this.c.k() + org.telegram.messenger.g0.L(16.0f);
        this.a.getClass();
        return k10 - org.telegram.messenger.g0.L(18);
    }

    @Override // org.telegram.ui.c3
    public int getBoundRight() {
        if (this.c == null) {
            return -1;
        }
        int l10 = this.c.l() + org.telegram.messenger.g0.L(16.0f);
        this.a.getClass();
        return org.telegram.messenger.g0.L(18) + l10;
    }

    @Override // org.telegram.ui.c3
    public int getLastLineBoundRight() {
        if (this.c == null) {
            return -1;
        }
        int m10 = this.c.m() + org.telegram.messenger.g0.L(16.0f);
        this.a.getClass();
        return org.telegram.messenger.g0.L(18) + m10;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return org.telegram.messenger.camera.q.a(this);
    }

    @Override // android.view.View, org.telegram.ui.Cells.q9
    public final void invalidate() {
        this.e.invalidate();
        super.invalidate();
    }

    @Override // org.telegram.ui.Cells.h9
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
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
            canvas.drawRect(0.0f, pageblockpreformatted.continuesPrev ? 0.0f : org.telegram.messenger.g0.L(8.0f), getMeasuredWidth(), getMeasuredHeight() - (this.f.continuesNext ? 0 : org.telegram.messenger.g0.L(8.0f)), g4.q1);
            return;
        }
        z2 z2Var = this.c;
        if (z2Var == null || (staticLayout = z2Var.d) == null) {
            return;
        }
        CharSequence text = staticLayout.getText();
        int top = this.e.getTop() + this.d.getTop();
        int lineCount = staticLayout.getLineCount();
        int i7 = 0;
        while (i7 < lineCount) {
            int h = org.telegram.ui.Components.n80.h(staticLayout.getLineStart(i7), text);
            Paint paint = this.s;
            if (h == 1) {
                paint.setColor(640993113);
            } else if (h == 2) {
                paint.setColor(654261040);
            } else {
                i7++;
            }
            canvas.drawRect(0.0f, staticLayout.getLineTop(i7) + top, getMeasuredWidth(), staticLayout.getLineBottom(i7) + top + (i7 == lineCount + (-1) ? this.r : 0), paint);
            i7++;
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
        accessibilityNodeInfo.setText(g4.g(2131754871, g4.h(this.a, this.b, z2Var)));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        c2 c2Var = this.d;
        c2Var.measure(makeMeasureSpec, makeMeasureSpec2);
        setMeasuredDimension(size, c2Var.getMeasuredHeight());
    }

    public void setBlock(TL_iv.pageBlockPreformatted pageblockpreformatted) {
        e4 e4Var;
        this.h = null;
        this.f = pageblockpreformatted;
        this.n = true;
        int i7 = (!pageblockpreformatted.diff || (e4Var = this.b) == null) ? 0 : e4Var.H;
        c2 c2Var = this.d;
        c2Var.setScrollX(i7);
        this.n = false;
        c2Var.setHorizontalScrollBarEnabled(true ^ pageblockpreformatted.diff);
        c2Var.setPadding(0, pageblockpreformatted.continuesPrev ? 0 : org.telegram.messenger.g0.L(8.0f), 0, pageblockpreformatted.continuesNext ? 0 : org.telegram.messenger.g0.L(8.0f));
        d2 d2Var = this.e;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) d2Var.getLayoutParams();
        marginLayoutParams.topMargin = pageblockpreformatted.continuesPrev ? 0 : org.telegram.messenger.g0.L(12.0f);
        marginLayoutParams.bottomMargin = pageblockpreformatted.continuesNext ? 0 : org.telegram.messenger.g0.L(12.0f);
        d2Var.requestLayout();
    }
}
