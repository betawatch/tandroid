package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class k1 extends FrameLayout implements org.telegram.ui.Cells.p9 {
    public final bi.o0 a;
    public final h1 b;
    public b3 c;
    public b3 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public boolean r;
    public TL_iv.pageBlockCollage s;
    public final j1 v;
    public final g4 w;
    public final /* synthetic */ i4 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(i4 i4Var, Context context, g4 g4Var) {
        super(context);
        this.x = i4Var;
        this.v = new j1(this);
        this.w = g4Var;
        bi.o0 o0Var = new bi.o0(this, context, 4);
        this.a = o0Var;
        o0Var.i(new e1(this));
        f1 f1Var = new f1(this);
        f1Var.O = new g1(this);
        o0Var.setLayoutManager(f1Var);
        h1 h1Var = new h1(this);
        this.b = h1Var;
        o0Var.setAdapter(h1Var);
        addView(o0Var, w7.x5.c(-2.0f, -1));
        setWillNotDraw(false);
    }

    @Override // org.telegram.ui.Cells.p9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null) {
            arrayList.add(b3Var2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null) {
            b3Var2.attach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null) {
            b3Var2.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.s == null) {
            return;
        }
        b3 b3Var = this.c;
        i4 i4Var = this.x;
        int i10 = 0;
        if (b3Var != null) {
            canvas.save();
            canvas.translate(this.f, this.h);
            i4.v(i4Var, canvas, this, 0);
            this.c.draw(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f, this.h + this.n);
            i4.v(i4Var, canvas, this, i10);
            this.d.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.AccDescrCollage));
        if (this.c != null) {
            sb2.append(", ");
            sb2.append(this.c.d.getText());
        }
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = this.e;
        int dp = AndroidUtilities.dp(8.0f);
        int i15 = this.e;
        bi.o0 o0Var = this.a;
        o0Var.layout(i14, dp, o0Var.getMeasuredWidth() + i15, AndroidUtilities.dp(8.0f) + o0Var.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        k1 k1Var;
        int dp;
        int i12;
        int i13 = 1;
        this.r = true;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockCollage pageblockcollage = this.s;
        if (pageblockcollage != null) {
            if (pageblockcollage.level > 0) {
                int dp2 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(r15 * 14);
                this.e = dp2;
                this.f = dp2;
                i12 = org.telegram.messenger.wl.v(18.0f, dp2, size);
                dp = i12;
            } else {
                this.e = 0;
                this.f = AndroidUtilities.dp(18.0f);
                dp = size - AndroidUtilities.dp(36.0f);
                i12 = size;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            bi.o0 o0Var = this.a;
            o0Var.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredHeight = o0Var.getMeasuredHeight();
            int dp3 = AndroidUtilities.dp(8.0f) + measuredHeight;
            this.h = dp3;
            TL_iv.pageBlockCollage pageblockcollage2 = this.s;
            TL_iv.RichText richText = pageblockcollage2.caption.text;
            HashSet hashSet = i4.b1;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            i4 i4Var = this.x;
            k1Var = this;
            b3 p5 = i4.p(i4Var, k1Var, null, richText, dp, dp3, pageblockcollage2, alignment, 0, this.w);
            k1Var.c = p5;
            if (p5 != null) {
                int height = k1Var.c.d.getHeight() + AndroidUtilities.dp(4.0f);
                k1Var.n = height;
                measuredHeight = org.telegram.messenger.w1.C(4.0f, height, measuredHeight);
                b3 b3Var = k1Var.c;
                b3Var.s = k1Var.f;
                b3Var.v = k1Var.h;
            } else {
                k1Var.n = 0;
            }
            TL_iv.pageBlockCollage pageblockcollage3 = k1Var.s;
            TL_iv.RichText richText2 = pageblockcollage3.caption.credit;
            if (k1Var.w.G) {
                alignment = org.telegram.ui.Components.iw0.a();
            }
            b3 p10 = i4.p(i4Var, k1Var, null, richText2, dp, 0, pageblockcollage3, alignment, 0, k1Var.w);
            k1Var.d = p10;
            if (p10 != null) {
                measuredHeight += k1Var.d.d.getHeight() + AndroidUtilities.dp(4.0f);
                b3 b3Var2 = k1Var.d;
                b3Var2.s = k1Var.f;
                b3Var2.v = k1Var.h + k1Var.n;
            }
            int dp4 = AndroidUtilities.dp(16.0f) + measuredHeight;
            TL_iv.pageBlockCollage pageblockcollage4 = k1Var.s;
            i13 = (pageblockcollage4.level <= 0 || pageblockcollage4.bottom) ? dp4 : AndroidUtilities.dp(8.0f) + dp4;
        } else {
            k1Var = this;
        }
        setMeasuredDimension(size, i13);
        k1Var.r = false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b3 b3Var = this.c;
        int i10 = this.f;
        int i11 = this.h;
        i4 i4Var = this.x;
        if (i4.l(i4Var, this.w, motionEvent, this, b3Var, i10, i11)) {
            return true;
        }
        return i4.l(i4Var, this.w, motionEvent, this, this.d, this.f, this.h + this.n) || super.onTouchEvent(motionEvent);
    }
}
