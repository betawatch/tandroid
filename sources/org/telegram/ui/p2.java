package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class p2 extends FrameLayout implements org.telegram.ui.Cells.p9 {
    public final k2 a;
    public final n2 b;
    public final o2 c;
    public TL_iv.pageBlockSlideshow d;
    public a3 e;
    public a3 f;
    public final int h;
    public int n;
    public int r;
    public float s;
    public int v;
    public final f4 w;
    public final /* synthetic */ h4 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(h4 h4Var, Context context, f4 f4Var) {
        super(context);
        this.x = h4Var;
        this.h = AndroidUtilities.dp(18.0f);
        this.w = f4Var;
        if (h4.B1 == null) {
            Paint paint = new Paint(1);
            h4.B1 = paint;
            paint.setColor(-1);
        }
        k2 k2Var = new k2(this, context);
        this.a = k2Var;
        k2Var.b(new l2(this, 0));
        n2 n2Var = new n2(this);
        this.b = n2Var;
        k2Var.setAdapter(n2Var);
        AndroidUtilities.setViewPagerEdgeEffectColor(k2Var, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        addView(k2Var);
        o2 o2Var = new o2(this, context);
        this.c = o2Var;
        addView(o2Var);
        setWillNotDraw(false);
    }

    @Override // org.telegram.ui.Cells.p9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.e;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
        a3 a3Var2 = this.f;
        if (a3Var2 != null) {
            arrayList.add(a3Var2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.e;
        if (a3Var != null) {
            a3Var.attach(this);
        }
        a3 a3Var2 = this.f;
        if (a3Var2 != null) {
            a3Var2.attach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.e;
        if (a3Var != null) {
            a3Var.detach(this);
        }
        a3 a3Var2 = this.f;
        if (a3Var2 != null) {
            a3Var2.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.d == null) {
            return;
        }
        a3 a3Var = this.e;
        h4 h4Var = this.x;
        int i10 = this.h;
        int i11 = 0;
        if (a3Var != null) {
            canvas.save();
            canvas.translate(i10, this.n);
            h4.v(h4Var, canvas, this, 0);
            this.e.draw(canvas, this);
            canvas.restore();
            i11 = 1;
        }
        if (this.f != null) {
            canvas.save();
            canvas.translate(i10, this.n + this.r);
            h4.v(h4Var, canvas, this, i11);
            this.f.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.AccDescrIVSlideshow));
        if (this.e != null) {
            sb2.append(", ");
            sb2.append(this.e.d.getText());
        }
        if (this.f != null) {
            sb2.append(", ");
            sb2.append(this.f.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int dp = AndroidUtilities.dp(8.0f);
        k2 k2Var = this.a;
        k2Var.layout(0, dp, k2Var.getMeasuredWidth(), k2Var.getMeasuredHeight() + AndroidUtilities.dp(8.0f));
        int bottom = k2Var.getBottom() - AndroidUtilities.dp(23.0f);
        o2 o2Var = this.c;
        o2Var.layout(0, bottom, o2Var.getMeasuredWidth(), o2Var.getMeasuredHeight() + bottom);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        if (this.d != null) {
            int dp = AndroidUtilities.dp(310.0f);
            this.a.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_30));
            this.d.items.size();
            this.c.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10.0f), TLObject.FLAG_30));
            int dp2 = size - AndroidUtilities.dp(36.0f);
            int dp3 = AndroidUtilities.dp(16.0f) + dp;
            this.n = dp3;
            TL_iv.pageBlockSlideshow pageblockslideshow = this.d;
            TL_iv.RichText richText = pageblockslideshow.caption.text;
            HashSet hashSet = h4.b1;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            h4 h4Var = this.x;
            a3 p5 = h4.p(h4Var, this, null, richText, dp2, dp3, pageblockslideshow, alignment, 0, this.w);
            this.e = p5;
            int i13 = this.h;
            if (p5 != null) {
                int height = this.e.d.getHeight() + AndroidUtilities.dp(4.0f);
                this.r = height;
                dp = org.telegram.messenger.w1.C(4.0f, height, dp);
                a3 a3Var = this.e;
                a3Var.s = i13;
                a3Var.v = this.n;
            } else {
                this.r = 0;
            }
            TL_iv.pageBlockSlideshow pageblockslideshow2 = this.d;
            TL_iv.RichText richText2 = pageblockslideshow2.caption.credit;
            if (this.w.G) {
                alignment = org.telegram.ui.Components.kw0.a();
            }
            a3 p10 = h4.p(h4Var, this, null, richText2, dp2, 0, pageblockslideshow2, alignment, 0, this.w);
            this.f = p10;
            if (p10 != null) {
                dp += this.f.d.getHeight() + AndroidUtilities.dp(4.0f);
                a3 a3Var2 = this.f;
                a3Var2.s = i13;
                a3Var2.v = this.n + this.r;
            }
            i12 = AndroidUtilities.dp(16.0f) + dp;
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a3 a3Var = this.e;
        int i10 = this.h;
        int i11 = this.n;
        h4 h4Var = this.x;
        if (h4.l(h4Var, this.w, motionEvent, this, a3Var, i10, i11)) {
            return true;
        }
        return h4.l(h4Var, this.w, motionEvent, this, this.f, this.h, this.n + this.r) || super.onTouchEvent(motionEvent);
    }
}
