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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class p2 extends FrameLayout implements org.telegram.ui.Cells.r9, org.telegram.ui.ActionBar.p6 {
    public int a;
    public final k2 b;
    public final n2 c;
    public final o2 d;
    public TL_iv.pageBlockSlideshow e;
    public a3 f;
    public a3 h;
    public final int n;
    public int r;
    public int s;
    public float v;
    public int w;
    public final h4 x;
    public final /* synthetic */ j4 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(j4 j4Var, Context context, h4 h4Var) {
        super(context);
        this.y = j4Var;
        this.n = AndroidUtilities.dp(18.0f);
        this.x = h4Var;
        if (j4.C1 == null) {
            Paint paint = new Paint(1);
            j4.C1 = paint;
            paint.setColor(-1);
        }
        k2 k2Var = new k2(this, context);
        this.b = k2Var;
        k2Var.b(new l2(this, 0));
        n2 n2Var = new n2(this);
        this.c = n2Var;
        k2Var.setAdapter(n2Var);
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, false);
        this.a = x02;
        AndroidUtilities.setViewPagerEdgeEffectColor(k2Var, x02);
        addView(k2Var);
        o2 o2Var = new o2(this, context);
        this.d = o2Var;
        addView(o2Var);
        setWillNotDraw(false);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d6));
    }

    @Override // org.telegram.ui.Cells.r9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
        a3 a3Var2 = this.h;
        if (a3Var2 != null) {
            arrayList.add(a3Var2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f;
        if (a3Var != null) {
            a3Var.attach(this);
        }
        a3 a3Var2 = this.h;
        if (a3Var2 != null) {
            a3Var2.attach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f;
        if (a3Var != null) {
            a3Var.detach(this);
        }
        a3 a3Var2 = this.h;
        if (a3Var2 != null) {
            a3Var2.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.e == null) {
            return;
        }
        a3 a3Var = this.f;
        j4 j4Var = this.y;
        int i10 = this.n;
        int i11 = 0;
        if (a3Var != null) {
            canvas.save();
            canvas.translate(i10, this.r);
            j4.v(j4Var, canvas, this, 0);
            this.f.draw(canvas, this);
            canvas.restore();
            i11 = 1;
        }
        if (this.h != null) {
            canvas.save();
            canvas.translate(i10, this.r + this.s);
            j4.v(j4Var, canvas, this, i11);
            this.h.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.AccDescrIVSlideshow));
        if (this.f != null) {
            sb2.append(", ");
            sb2.append(this.f.d.getText());
        }
        if (this.h != null) {
            sb2.append(", ");
            sb2.append(this.h.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int dp = AndroidUtilities.dp(8.0f);
        k2 k2Var = this.b;
        k2Var.layout(0, dp, k2Var.getMeasuredWidth(), k2Var.getMeasuredHeight() + AndroidUtilities.dp(8.0f));
        int bottom = k2Var.getBottom() - AndroidUtilities.dp(23.0f);
        o2 o2Var = this.d;
        o2Var.layout(0, bottom, o2Var.getMeasuredWidth(), o2Var.getMeasuredHeight() + bottom);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        if (this.e != null) {
            int dp = AndroidUtilities.dp(310.0f);
            this.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_30));
            this.e.items.size();
            this.d.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10.0f), TLObject.FLAG_30));
            int dp2 = size - AndroidUtilities.dp(36.0f);
            int dp3 = AndroidUtilities.dp(16.0f) + dp;
            this.r = dp3;
            TL_iv.pageBlockSlideshow pageblockslideshow = this.e;
            TL_iv.RichText richText = pageblockslideshow.caption.text;
            HashSet hashSet = j4.c1;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            j4 j4Var = this.y;
            a3 p10 = j4.p(j4Var, this, null, richText, dp2, dp3, pageblockslideshow, alignment, 0, this.x);
            this.f = p10;
            int i13 = this.n;
            if (p10 != null) {
                int height = this.f.d.getHeight() + AndroidUtilities.dp(4.0f);
                this.s = height;
                dp = org.telegram.messenger.t.D(4.0f, height, dp);
                a3 a3Var = this.f;
                a3Var.s = i13;
                a3Var.v = this.r;
            } else {
                this.s = 0;
            }
            TL_iv.pageBlockSlideshow pageblockslideshow2 = this.e;
            TL_iv.RichText richText2 = pageblockslideshow2.caption.credit;
            if (this.x.G) {
                alignment = org.telegram.ui.Components.px0.a();
            }
            a3 p11 = j4.p(j4Var, this, null, richText2, dp2, 0, pageblockslideshow2, alignment, 0, this.x);
            this.h = p11;
            if (p11 != null) {
                dp += this.h.d.getHeight() + AndroidUtilities.dp(4.0f);
                a3 a3Var2 = this.h;
                a3Var2.s = i13;
                a3Var2.v = this.r + this.s;
            }
            i12 = AndroidUtilities.dp(16.0f) + dp;
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a3 a3Var = this.f;
        int i10 = this.n;
        int i11 = this.r;
        j4 j4Var = this.y;
        if (j4.l(j4Var, this.x, motionEvent, this, a3Var, i10, i11)) {
            return true;
        }
        return j4.l(j4Var, this.x, motionEvent, this, this.h, this.n, this.r + this.s) || super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        k2 k2Var = this.b;
        if (k2Var == null) {
            return;
        }
        try {
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, false);
            if (x02 != this.a) {
                this.a = x02;
                AndroidUtilities.setViewPagerEdgeEffectColor(k2Var, x02);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
