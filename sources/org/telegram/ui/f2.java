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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class f2 extends FrameLayout implements org.telegram.ui.Cells.p9, d3 {
    public final u70 a;
    public final f4 b;
    public a3 c;
    public final ii.a4 d;
    public final e2 e;
    public TL_iv.pageBlockPreformatted f;
    public CharSequence h;

    public f2(Context context, final u70 u70Var, f4 f4Var) {
        super(context);
        this.a = u70Var;
        this.b = f4Var;
        ii.a4 a4Var = new ii.a4(context, u70Var);
        this.d = a4Var;
        a4Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(a4Var, w7.x5.c(-2.0f, -1));
        e2 e2Var = new e2(this, context, u70Var, f4Var);
        this.e = e2Var;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        int dp = AndroidUtilities.dp(16.0f);
        layoutParams.rightMargin = dp;
        layoutParams.leftMargin = dp;
        int dp2 = AndroidUtilities.dp(12.0f);
        layoutParams.bottomMargin = dp2;
        layoutParams.topMargin = dp2;
        NotificationCenter.listenEmojiLoading(e2Var);
        a4Var.addView(e2Var, layoutParams);
        if (Build.VERSION.SDK_INT >= 23) {
            a4Var.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: org.telegram.ui.d2
                @Override // android.view.View.OnScrollChangeListener
                public final void onScrollChange(View view, int i10, int i11, int i12, int i13) {
                    org.telegram.ui.Cells.q9 q9Var = ((h4) u70.this).O0;
                    if (q9Var == null || !q9Var.y()) {
                        return;
                    }
                    q9Var.x();
                }
            });
        }
        setWillNotDraw(false);
    }

    @Override // org.telegram.ui.Cells.p9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override // org.telegram.ui.d3
    public int getBoundLeft() {
        if (this.c == null) {
            return -1;
        }
        int a2 = this.c.a() + AndroidUtilities.dp(16.0f);
        this.a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override // org.telegram.ui.d3
    public int getBoundRight() {
        if (this.c == null) {
            return -1;
        }
        int b10 = this.c.b() + AndroidUtilities.dp(16.0f);
        this.a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override // org.telegram.ui.d3
    public int getLastLineBoundRight() {
        if (this.c == null) {
            return -1;
        }
        int c10 = this.c.c() + AndroidUtilities.dp(16.0f);
        this.a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return org.telegram.messenger.vl.b(this);
    }

    @Override // android.view.View, org.telegram.ui.Cells.y9
    public final void invalidate() {
        this.e.invalidate();
        super.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f == null) {
            return;
        }
        canvas.drawRect(0.0f, AndroidUtilities.dp(8.0f), getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(8.0f), h4.p1);
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
        accessibilityNodeInfo.setText(h4.i(R.string.AccDescrIVCode, h4.j(this.a, this.b, a3Var)));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        ii.a4 a4Var = this.d;
        a4Var.measure(makeMeasureSpec, makeMeasureSpec2);
        setMeasuredDimension(size, a4Var.getMeasuredHeight());
    }

    public void setBlock(TL_iv.pageBlockPreformatted pageblockpreformatted) {
        this.h = null;
        this.f = pageblockpreformatted;
        this.d.setScrollX(0);
        this.e.requestLayout();
    }
}
