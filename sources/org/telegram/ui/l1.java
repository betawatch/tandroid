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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class l1 extends FrameLayout implements org.telegram.ui.Cells.l9 {
    public final mh.d1 a;
    public final i1 b;
    public d3 c;
    public d3 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public boolean r;
    public TL_iv.pageBlockCollage s;
    public final k1 v;
    public final j4 w;
    public final /* synthetic */ l4 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(l4 l4Var, Context context, j4 j4Var) {
        super(context);
        this.x = l4Var;
        this.v = new k1(this);
        this.w = j4Var;
        mh.d1 d1Var = new mh.d1(this, context, 2);
        this.a = d1Var;
        d1Var.i(new f1(this));
        g1 g1Var = new g1(this);
        g1Var.O = new h1(this);
        d1Var.setLayoutManager(g1Var);
        i1 i1Var = new i1(this);
        this.b = i1Var;
        d1Var.setAdapter(i1Var);
        addView(d1Var, k7.c6.c(-2.0f, -1));
        setWillNotDraw(false);
    }

    @Override // org.telegram.ui.Cells.l9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            arrayList.add(d3Var2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            d3Var2.attach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            d3Var2.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.s == null) {
            return;
        }
        d3 d3Var = this.c;
        l4 l4Var = this.x;
        int i10 = 0;
        if (d3Var != null) {
            canvas.save();
            canvas.translate(this.f, this.h);
            l4.v(l4Var, canvas, this, 0);
            this.c.draw(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f, this.h + this.n);
            l4.v(l4Var, canvas, this, i10);
            this.d.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder(LocaleController.getString(R.string.AccDescrCollage));
        if (this.c != null) {
            sb.append(", ");
            sb.append(this.c.d.getText());
        }
        if (this.d != null) {
            sb.append(", ");
            sb.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14 = this.e;
        int dp = AndroidUtilities.dp(8.0f);
        int i15 = this.e;
        mh.d1 d1Var = this.a;
        d1Var.layout(i14, dp, d1Var.getMeasuredWidth() + i15, AndroidUtilities.dp(8.0f) + d1Var.getMeasuredHeight());
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
                i12 = b.t(18.0f, dp2, size);
                dp = i12;
            } else {
                this.e = 0;
                this.f = AndroidUtilities.dp(18.0f);
                dp = size - AndroidUtilities.dp(36.0f);
                i12 = size;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            mh.d1 d1Var = this.a;
            d1Var.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredHeight = d1Var.getMeasuredHeight();
            int dp3 = AndroidUtilities.dp(8.0f) + measuredHeight;
            this.h = dp3;
            TL_iv.pageBlockCollage pageblockcollage2 = this.s;
            TL_iv.RichText richText = pageblockcollage2.caption.text;
            HashSet hashSet = l4.Y0;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            l4 l4Var = this.x;
            l1Var = this;
            d3 p10 = l4.p(l4Var, l1Var, null, richText, dp, dp3, pageblockcollage2, alignment, 0, this.w);
            l1Var.c = p10;
            if (p10 != null) {
                int height = l1Var.c.d.getHeight() + AndroidUtilities.dp(4.0f);
                l1Var.n = height;
                measuredHeight = org.telegram.messenger.y3.C(4.0f, height, measuredHeight);
                d3 d3Var = l1Var.c;
                d3Var.s = l1Var.f;
                d3Var.v = l1Var.h;
            } else {
                l1Var.n = 0;
            }
            TL_iv.pageBlockCollage pageblockcollage3 = l1Var.s;
            TL_iv.RichText richText2 = pageblockcollage3.caption.credit;
            if (l1Var.w.D) {
                alignment = org.telegram.ui.Components.lw0.a();
            }
            d3 p11 = l4.p(l4Var, l1Var, null, richText2, dp, 0, pageblockcollage3, alignment, 0, l1Var.w);
            l1Var.d = p11;
            if (p11 != null) {
                measuredHeight += l1Var.d.d.getHeight() + AndroidUtilities.dp(4.0f);
                d3 d3Var2 = l1Var.d;
                d3Var2.s = l1Var.f;
                d3Var2.v = l1Var.h + l1Var.n;
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
        d3 d3Var = this.c;
        int i10 = this.f;
        int i11 = this.h;
        l4 l4Var = this.x;
        if (l4.l(l4Var, this.w, motionEvent, this, d3Var, i10, i11)) {
            return true;
        }
        return l4.l(l4Var, this.w, motionEvent, this, this.d, this.f, this.h + this.n) || super.onTouchEvent(motionEvent);
    }
}
