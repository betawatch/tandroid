package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class i2 extends FrameLayout implements org.telegram.ui.Cells.n9, g3 {
    public final z70 a;
    public final i4 b;
    public d3 c;
    public final ji.b4 d;
    public final h2 e;
    public TL_iv.pageBlockPreformatted f;
    public CharSequence h;

    public i2(Context context, final z70 z70Var, i4 i4Var) {
        super(context);
        this.a = z70Var;
        this.b = i4Var;
        ji.b4 b4Var = new ji.b4(context, z70Var);
        this.d = b4Var;
        b4Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(b4Var, w7.z5.d(-2.0f, -1));
        h2 h2Var = new h2(this, context, z70Var, i4Var);
        this.e = h2Var;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        int dp = AndroidUtilities.dp(16.0f);
        layoutParams.rightMargin = dp;
        layoutParams.leftMargin = dp;
        int dp2 = AndroidUtilities.dp(12.0f);
        layoutParams.bottomMargin = dp2;
        layoutParams.topMargin = dp2;
        NotificationCenter.listenEmojiLoading(h2Var);
        b4Var.addView(h2Var, layoutParams);
        b4Var.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: org.telegram.ui.g2
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i10, int i11, int i12, int i13) {
                org.telegram.ui.Cells.o9 o9Var = ((k4) z70.this).O0;
                if (o9Var == null || !o9Var.x()) {
                    return;
                }
                o9Var.w();
            }
        });
        setWillNotDraw(false);
    }

    @Override // org.telegram.ui.Cells.n9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override // org.telegram.ui.g3
    public int getBoundLeft() {
        if (this.c == null) {
            return -1;
        }
        int a2 = this.c.a() + AndroidUtilities.dp(16.0f);
        this.a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override // org.telegram.ui.g3
    public int getBoundRight() {
        if (this.c == null) {
            return -1;
        }
        int b10 = this.c.b() + AndroidUtilities.dp(16.0f);
        this.a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override // org.telegram.ui.g3
    public int getLastLineBoundRight() {
        if (this.c == null) {
            return -1;
        }
        int c10 = this.c.c() + AndroidUtilities.dp(16.0f);
        this.a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return org.telegram.messenger.sk.a(this);
    }

    @Override // android.view.View, org.telegram.ui.Cells.w9
    public final void invalidate() {
        this.e.invalidate();
        super.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f == null) {
            return;
        }
        canvas.drawRect(0.0f, AndroidUtilities.dp(8.0f), getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(8.0f), k4.p1);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        d3 d3Var = this.c;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(k4.i(R.string.AccDescrIVCode, k4.j(this.a, this.b, d3Var)));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        ji.b4 b4Var = this.d;
        b4Var.measure(makeMeasureSpec, makeMeasureSpec2);
        setMeasuredDimension(size, b4Var.getMeasuredHeight());
    }

    public void setBlock(TL_iv.pageBlockPreformatted pageblockpreformatted) {
        this.h = null;
        this.f = pageblockpreformatted;
        this.d.setScrollX(0);
        this.e.requestLayout();
    }
}
