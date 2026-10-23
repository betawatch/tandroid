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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class l1 extends FrameLayout implements org.telegram.ui.Cells.n9 {
    public final ai.u1 a;
    public final i1 b;
    public c3 c;
    public c3 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public boolean r;
    public TL_iv.pageBlockCollage s;
    public final k1 v;
    public final i4 w;
    public final /* synthetic */ k4 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(k4 k4Var, Context context, i4 i4Var) {
        super(context);
        this.x = k4Var;
        this.v = new k1(this);
        this.w = i4Var;
        ai.u1 u1Var = new ai.u1(this, context, 5);
        this.a = u1Var;
        u1Var.i(new f1(this));
        g1 g1Var = new g1(this);
        g1Var.O = new h1(this);
        u1Var.setLayoutManager(g1Var);
        i1 i1Var = new i1(this);
        this.b = i1Var;
        u1Var.setAdapter(i1Var);
        addView(u1Var, w7.z5.c(-2.0f, -1));
        setWillNotDraw(false);
    }

    @Override // org.telegram.ui.Cells.n9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.c;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null) {
            arrayList.add(c3Var2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.c;
        if (c3Var != null) {
            c3Var.attach(this);
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null) {
            c3Var2.attach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.c;
        if (c3Var != null) {
            c3Var.detach(this);
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null) {
            c3Var2.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.s == null) {
            return;
        }
        c3 c3Var = this.c;
        k4 k4Var = this.x;
        int i10 = 0;
        if (c3Var != null) {
            canvas.save();
            canvas.translate(this.f, this.h);
            k4.v(k4Var, canvas, this, 0);
            this.c.draw(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f, this.h + this.n);
            k4.v(k4Var, canvas, this, i10);
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
        ai.u1 u1Var = this.a;
        u1Var.layout(i14, dp, u1Var.getMeasuredWidth() + i15, AndroidUtilities.dp(8.0f) + u1Var.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        l1 l1Var;
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
                i12 = org.telegram.messenger.sl.y(18.0f, dp2, size);
                dp = i12;
            } else {
                this.e = 0;
                this.f = AndroidUtilities.dp(18.0f);
                dp = size - AndroidUtilities.dp(36.0f);
                i12 = size;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            ai.u1 u1Var = this.a;
            u1Var.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredHeight = u1Var.getMeasuredHeight();
            int dp3 = AndroidUtilities.dp(8.0f) + measuredHeight;
            this.h = dp3;
            TL_iv.pageBlockCollage pageblockcollage2 = this.s;
            TL_iv.RichText richText = pageblockcollage2.caption.text;
            HashSet hashSet = k4.c1;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            k4 k4Var = this.x;
            l1Var = this;
            c3 p5 = k4.p(k4Var, l1Var, null, richText, dp, dp3, pageblockcollage2, alignment, 0, this.w);
            l1Var.c = p5;
            if (p5 != null) {
                int height = l1Var.c.d.getHeight() + AndroidUtilities.dp(4.0f);
                l1Var.n = height;
                measuredHeight = org.telegram.messenger.v0.C(4.0f, height, measuredHeight);
                c3 c3Var = l1Var.c;
                c3Var.s = l1Var.f;
                c3Var.v = l1Var.h;
            } else {
                l1Var.n = 0;
            }
            TL_iv.pageBlockCollage pageblockcollage3 = l1Var.s;
            TL_iv.RichText richText2 = pageblockcollage3.caption.credit;
            if (l1Var.w.G) {
                alignment = org.telegram.ui.Components.ix0.a();
            }
            c3 p9 = k4.p(k4Var, l1Var, null, richText2, dp, 0, pageblockcollage3, alignment, 0, l1Var.w);
            l1Var.d = p9;
            if (p9 != null) {
                measuredHeight += l1Var.d.d.getHeight() + AndroidUtilities.dp(4.0f);
                c3 c3Var2 = l1Var.d;
                c3Var2.s = l1Var.f;
                c3Var2.v = l1Var.h + l1Var.n;
            }
            int dp4 = AndroidUtilities.dp(16.0f) + measuredHeight;
            TL_iv.pageBlockCollage pageblockcollage4 = l1Var.s;
            i13 = (pageblockcollage4.level <= 0 || pageblockcollage4.bottom) ? dp4 : AndroidUtilities.dp(8.0f) + dp4;
        } else {
            l1Var = this;
        }
        setMeasuredDimension(size, i13);
        l1Var.r = false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c3 c3Var = this.c;
        int i10 = this.f;
        int i11 = this.h;
        k4 k4Var = this.x;
        if (k4.l(k4Var, this.w, motionEvent, this, c3Var, i10, i11)) {
            return true;
        }
        return k4.l(k4Var, this.w, motionEvent, this, this.d, this.f, this.h + this.n) || super.onTouchEvent(motionEvent);
    }
}
