package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class k2 extends FrameLayout implements org.telegram.ui.Cells.k9, i3 {
    public final p70 a;
    public final l4 b;
    public f3 c;
    public final i2 d;
    public final j2 e;
    public TL_iv.pageBlockPreformatted f;
    public CharSequence h;

    public k2(Context context, final p70 p70Var, l4 l4Var) {
        super(context);
        this.a = p70Var;
        this.b = l4Var;
        i2 i2Var = new i2(context, p70Var);
        this.d = i2Var;
        i2Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(i2Var, k7.b6.c(-2.0f, -1));
        j2 j2Var = new j2(this, context, p70Var, l4Var);
        this.e = j2Var;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        int dp = AndroidUtilities.dp(16.0f);
        layoutParams.rightMargin = dp;
        layoutParams.leftMargin = dp;
        int dp2 = AndroidUtilities.dp(12.0f);
        layoutParams.bottomMargin = dp2;
        layoutParams.topMargin = dp2;
        NotificationCenter.listenEmojiLoading(j2Var);
        i2Var.addView(j2Var, layoutParams);
        if (Build.VERSION.SDK_INT >= 23) {
            i2Var.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: org.telegram.ui.h2
                @Override // android.view.View.OnScrollChangeListener
                public final void onScrollChange(View view, int i10, int i11, int i12, int i13) {
                    org.telegram.ui.Cells.l9 l9Var = ((n4) p70.this).L0;
                    if (l9Var == null || !l9Var.y()) {
                        return;
                    }
                    l9Var.x();
                }
            });
        }
        setWillNotDraw(false);
    }

    @Override // org.telegram.ui.Cells.k9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
    }

    @Override // org.telegram.ui.i3
    public int getBoundLeft() {
        if (this.c == null) {
            return -1;
        }
        int a2 = this.c.a() + AndroidUtilities.dp(16.0f);
        this.a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override // org.telegram.ui.i3
    public int getBoundRight() {
        if (this.c == null) {
            return -1;
        }
        int b10 = this.c.b() + AndroidUtilities.dp(16.0f);
        this.a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override // org.telegram.ui.i3
    public int getLastLineBoundRight() {
        if (this.c == null) {
            return -1;
        }
        int c3 = this.c.c() + AndroidUtilities.dp(16.0f);
        this.a.getClass();
        return AndroidUtilities.dp(18) + c3;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return b.b(this);
    }

    @Override // android.view.View, org.telegram.ui.Cells.t9
    public final void invalidate() {
        this.e.invalidate();
        super.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f == null) {
            return;
        }
        canvas.drawRect(0.0f, AndroidUtilities.dp(8.0f), getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(8.0f), n4.m1);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        f3 f3Var = this.c;
        if (f3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(n4.i(R.string.AccDescrIVCode, n4.j(this.a, this.b, f3Var)));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        i2 i2Var = this.d;
        i2Var.measure(makeMeasureSpec, makeMeasureSpec2);
        setMeasuredDimension(size, i2Var.getMeasuredHeight());
    }

    public void setBlock(TL_iv.pageBlockPreformatted pageblockpreformatted) {
        this.h = null;
        this.f = pageblockpreformatted;
        this.d.setScrollX(0);
        this.e.requestLayout();
    }
}
