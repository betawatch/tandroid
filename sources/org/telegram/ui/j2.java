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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class j2 extends FrameLayout implements org.telegram.ui.Cells.m9, h3 {
    public final a70 a;
    public final j4 b;
    public e3 c;
    public final h2 d;
    public final i2 e;
    public TL_iv.pageBlockPreformatted f;
    public CharSequence h;

    public j2(Context context, final a70 a70Var, j4 j4Var) {
        super(context);
        this.a = a70Var;
        this.b = j4Var;
        h2 h2Var = new h2(context, a70Var);
        this.d = h2Var;
        h2Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(h2Var, g7.e6.c(-2.0f, -1));
        i2 i2Var = new i2(this, context, a70Var, j4Var);
        this.e = i2Var;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        int dp = AndroidUtilities.dp(16.0f);
        layoutParams.rightMargin = dp;
        layoutParams.leftMargin = dp;
        int dp2 = AndroidUtilities.dp(12.0f);
        layoutParams.bottomMargin = dp2;
        layoutParams.topMargin = dp2;
        NotificationCenter.listenEmojiLoading(i2Var);
        h2Var.addView(i2Var, layoutParams);
        if (Build.VERSION.SDK_INT >= 23) {
            h2Var.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: org.telegram.ui.g2
                @Override // android.view.View.OnScrollChangeListener
                public final void onScrollChange(View view, int i9, int i10, int i11, int i12) {
                    org.telegram.ui.Cells.n9 n9Var = ((l4) a70.this).K0;
                    if (n9Var == null || !n9Var.y()) {
                        return;
                    }
                    n9Var.x();
                }
            });
        }
        setWillNotDraw(false);
    }

    @Override // org.telegram.ui.Cells.m9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        e3 e3Var = this.c;
        if (e3Var != null) {
            arrayList.add(e3Var);
        }
    }

    @Override // org.telegram.ui.h3
    public int getBoundLeft() {
        if (this.c == null) {
            return -1;
        }
        int a2 = this.c.a() + AndroidUtilities.dp(16.0f);
        this.a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override // org.telegram.ui.h3
    public int getBoundRight() {
        if (this.c == null) {
            return -1;
        }
        int b10 = this.c.b() + AndroidUtilities.dp(16.0f);
        this.a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override // org.telegram.ui.h3
    public int getLastLineBoundRight() {
        if (this.c == null) {
            return -1;
        }
        int c10 = this.c.c() + AndroidUtilities.dp(16.0f);
        this.a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return org.telegram.messenger.ll.b(this);
    }

    @Override // android.view.View, org.telegram.ui.Cells.v9
    public final void invalidate() {
        this.e.invalidate();
        super.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e3 e3Var = this.c;
        if (e3Var != null) {
            e3Var.attach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e3 e3Var = this.c;
        if (e3Var != null) {
            e3Var.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f == null) {
            return;
        }
        canvas.drawRect(0.0f, AndroidUtilities.dp(8.0f), getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(8.0f), l4.l1);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        e3 e3Var = this.c;
        if (e3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.i(R.string.AccDescrIVCode, l4.j(this.a, this.b, e3Var)));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        h2 h2Var = this.d;
        h2Var.measure(makeMeasureSpec, makeMeasureSpec2);
        setMeasuredDimension(size, h2Var.getMeasuredHeight());
    }

    public void setBlock(TL_iv.pageBlockPreformatted pageblockpreformatted) {
        this.h = null;
        this.f = pageblockpreformatted;
        this.d.setScrollX(0);
        this.e.requestLayout();
    }
}
