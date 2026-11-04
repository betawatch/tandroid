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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f2 extends FrameLayout implements org.telegram.ui.Cells.g9, d3 {
    public final i50 a;
    public final g4 b;
    public a3 c;
    public final d2 d;
    public final e2 e;
    public TL_iv.pageBlockPreformatted f;
    public CharSequence h;
    public boolean n;
    public int r;
    public final Paint s;

    public f2(Context context, final i50 i50Var, g4 g4Var) {
        super(context);
        this.s = new Paint();
        this.a = i50Var;
        this.b = g4Var;
        d2 d2Var = new d2(this, context, i50Var);
        this.d = d2Var;
        d2Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        addView(d2Var, b8.mf.c(-2.0f, -1));
        e2 e2Var = new e2(this, context, i50Var, g4Var);
        this.e = e2Var;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        int L = org.telegram.messenger.g0.L(16.0f);
        layoutParams.rightMargin = L;
        layoutParams.leftMargin = L;
        int L2 = org.telegram.messenger.g0.L(12.0f);
        layoutParams.bottomMargin = L2;
        layoutParams.topMargin = L2;
        org.telegram.messenger.hs.i(e2Var);
        d2Var.addView(e2Var, layoutParams);
        d2Var.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: org.telegram.ui.c2
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i3, int i10, int i11, int i12) {
                org.telegram.ui.Cells.h9 h9Var = ((i4) i50.this).Q0;
                if (h9Var == null || !h9Var.x()) {
                    return;
                }
                h9Var.w();
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
        Pattern pattern = org.telegram.ui.Components.k80.a;
        char[] cArr = new char[spannableString.length()];
        int i3 = 0;
        for (int i10 = 0; i10 <= spannableString.length(); i10++) {
            if (i10 >= spannableString.length() || spannableString.charAt(i10) == '\n') {
                int h = org.telegram.ui.Components.k80.h(i3, spannableString);
                int i11 = i3;
                while (i11 < i10) {
                    cArr[i11] = (h == 3 || i11 == i3) ? ' ' : spannableString.charAt(i11);
                    i11++;
                }
                if (i10 < spannableString.length()) {
                    cArr[i10] = '\n';
                }
                i3 = i10 + 1;
            }
        }
        String str2 = new String(cArr);
        org.telegram.messenger.voip.l0 l0Var = new org.telegram.messenger.voip.l0(13, f2Var, spannableString);
        oi.q qVar = oi.k.a;
        if (str2.length() == spannableString.length()) {
            String b10 = oi.q.b(str);
            if (!b10.isEmpty() && !str2.isEmpty()) {
                oi.k.a.d(str2, b10, new mi.d4(9, spannableString, l0Var));
            }
        }
        return spannableString;
    }

    private static void setDiffMarkerSpans(SpannableString spannableString) {
        int i3 = 0;
        while (i3 <= spannableString.length()) {
            int indexOf = TextUtils.indexOf((CharSequence) spannableString, '\n', i3);
            if (indexOf < 0) {
                indexOf = spannableString.length();
            }
            int h = org.telegram.ui.Components.k80.h(i3, spannableString);
            if (h == 1) {
                spannableString.setSpan(new oi.d(19), i3, i3 + 1, 33);
            } else if (h == 2) {
                spannableString.setSpan(new oi.d(20), i3, i3 + 1, 33);
            } else if (h == 3 && indexOf > i3) {
                spannableString.setSpan(new oi.d(6), i3, indexOf, 33);
            }
            i3 = indexOf + 1;
        }
    }

    @Override // org.telegram.ui.d3
    public int getBoundLeft() {
        if (this.c == null) {
            return -1;
        }
        int k10 = this.c.k() + org.telegram.messenger.g0.L(16.0f);
        this.a.getClass();
        return k10 - org.telegram.messenger.g0.L(18);
    }

    @Override // org.telegram.ui.d3
    public int getBoundRight() {
        if (this.c == null) {
            return -1;
        }
        int l10 = this.c.l() + org.telegram.messenger.g0.L(16.0f);
        this.a.getClass();
        return org.telegram.messenger.g0.L(18) + l10;
    }

    @Override // org.telegram.ui.d3
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

    @Override // android.view.View, org.telegram.ui.Cells.p9
    public final void invalidate() {
        this.e.invalidate();
        super.invalidate();
    }

    @Override // org.telegram.ui.Cells.g9
    public final void k(ArrayList arrayList) {
        a3 a3Var = this.c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.c;
        if (a3Var != null) {
            a3Var.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.c;
        if (a3Var != null) {
            a3Var.f(this);
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
            canvas.drawRect(0.0f, pageblockpreformatted.continuesPrev ? 0.0f : org.telegram.messenger.g0.L(8.0f), getMeasuredWidth(), getMeasuredHeight() - (this.f.continuesNext ? 0 : org.telegram.messenger.g0.L(8.0f)), i4.r1);
            return;
        }
        a3 a3Var = this.c;
        if (a3Var == null || (staticLayout = a3Var.d) == null) {
            return;
        }
        CharSequence text = staticLayout.getText();
        int top = this.e.getTop() + this.d.getTop();
        int lineCount = staticLayout.getLineCount();
        int i3 = 0;
        while (i3 < lineCount) {
            int h = org.telegram.ui.Components.k80.h(staticLayout.getLineStart(i3), text);
            Paint paint = this.s;
            if (h == 1) {
                paint.setColor(640993113);
            } else if (h == 2) {
                paint.setColor(654261040);
            } else {
                i3++;
            }
            canvas.drawRect(0.0f, staticLayout.getLineTop(i3) + top, getMeasuredWidth(), staticLayout.getLineBottom(i3) + top + (i3 == lineCount + (-1) ? this.r : 0), paint);
            i3++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        a3 a3Var = this.c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.g(2131754871, i4.h(this.a, this.b, a3Var)));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        d2 d2Var = this.d;
        d2Var.measure(makeMeasureSpec, makeMeasureSpec2);
        setMeasuredDimension(size, d2Var.getMeasuredHeight());
    }

    public void setBlock(TL_iv.pageBlockPreformatted pageblockpreformatted) {
        g4 g4Var;
        this.h = null;
        this.f = pageblockpreformatted;
        this.n = true;
        int i3 = (!pageblockpreformatted.diff || (g4Var = this.b) == null) ? 0 : g4Var.I;
        d2 d2Var = this.d;
        d2Var.setScrollX(i3);
        this.n = false;
        d2Var.setHorizontalScrollBarEnabled(true ^ pageblockpreformatted.diff);
        d2Var.setPadding(0, pageblockpreformatted.continuesPrev ? 0 : org.telegram.messenger.g0.L(8.0f), 0, pageblockpreformatted.continuesNext ? 0 : org.telegram.messenger.g0.L(8.0f));
        e2 e2Var = this.e;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) e2Var.getLayoutParams();
        marginLayoutParams.topMargin = pageblockpreformatted.continuesPrev ? 0 : org.telegram.messenger.g0.L(12.0f);
        marginLayoutParams.bottomMargin = pageblockpreformatted.continuesNext ? 0 : org.telegram.messenger.g0.L(12.0f);
        e2Var.requestLayout();
    }
}
