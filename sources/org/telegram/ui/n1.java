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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class n1 extends FrameLayout implements org.telegram.ui.Cells.i9 {
    public final hh.f1 a;
    public final k1 b;
    public f3 c;
    public f3 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public boolean r;
    public TL_iv.pageBlockCollage s;
    public final m1 v;
    public final k4 w;
    public final /* synthetic */ m4 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(m4 m4Var, Context context, k4 k4Var) {
        super(context);
        this.x = m4Var;
        this.v = new m1(this);
        this.w = k4Var;
        hh.f1 f1Var = new hh.f1(this, context, 4);
        this.a = f1Var;
        f1Var.i(new h1(this));
        i1 i1Var = new i1(this);
        i1Var.O = new j1(this);
        f1Var.setLayoutManager(i1Var);
        k1 k1Var = new k1(this);
        this.b = k1Var;
        f1Var.setAdapter(k1Var);
        addView(f1Var, h7.z5.c(-2.0f, -1));
        setWillNotDraw(false);
    }

    @Override // org.telegram.ui.Cells.i9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            arrayList.add(f3Var2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            f3Var2.attach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            f3Var2.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.s == null) {
            return;
        }
        f3 f3Var = this.c;
        m4 m4Var = this.x;
        int i10 = 0;
        if (f3Var != null) {
            canvas.save();
            canvas.translate(this.f, this.h);
            m4.v(m4Var, canvas, this, 0);
            this.c.draw(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f, this.h + this.n);
            m4.v(m4Var, canvas, this, i10);
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
        hh.f1 f1Var = this.a;
        f1Var.layout(i14, dp, f1Var.getMeasuredWidth() + i15, AndroidUtilities.dp(8.0f) + f1Var.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        n1 n1Var;
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
                i12 = org.telegram.messenger.rl.u(18.0f, dp2, size);
                dp = i12;
            } else {
                this.e = 0;
                this.f = AndroidUtilities.dp(18.0f);
                dp = size - AndroidUtilities.dp(36.0f);
                i12 = size;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            hh.f1 f1Var = this.a;
            f1Var.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredHeight = f1Var.getMeasuredHeight();
            int dp3 = AndroidUtilities.dp(8.0f) + measuredHeight;
            this.h = dp3;
            TL_iv.pageBlockCollage pageblockcollage2 = this.s;
            TL_iv.RichText richText = pageblockcollage2.caption.text;
            HashSet hashSet = m4.X0;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            m4 m4Var = this.x;
            n1Var = this;
            f3 p6 = m4.p(m4Var, n1Var, null, richText, dp, dp3, pageblockcollage2, alignment, 0, this.w);
            n1Var.c = p6;
            if (p6 != null) {
                int height = n1Var.c.d.getHeight() + AndroidUtilities.dp(4.0f);
                n1Var.n = height;
                measuredHeight = org.telegram.messenger.y1.C(4.0f, height, measuredHeight);
                f3 f3Var = n1Var.c;
                f3Var.s = n1Var.f;
                f3Var.v = n1Var.h;
            } else {
                n1Var.n = 0;
            }
            TL_iv.pageBlockCollage pageblockcollage3 = n1Var.s;
            TL_iv.RichText richText2 = pageblockcollage3.caption.credit;
            if (n1Var.w.C) {
                alignment = org.telegram.ui.Components.tv0.a();
            }
            f3 p9 = m4.p(m4Var, n1Var, null, richText2, dp, 0, pageblockcollage3, alignment, 0, n1Var.w);
            n1Var.d = p9;
            if (p9 != null) {
                measuredHeight += n1Var.d.d.getHeight() + AndroidUtilities.dp(4.0f);
                f3 f3Var2 = n1Var.d;
                f3Var2.s = n1Var.f;
                f3Var2.v = n1Var.h + n1Var.n;
            }
            int dp4 = AndroidUtilities.dp(16.0f) + measuredHeight;
            TL_iv.pageBlockCollage pageblockcollage4 = n1Var.s;
            i13 = (pageblockcollage4.level <= 0 || pageblockcollage4.bottom) ? dp4 : AndroidUtilities.dp(8.0f) + dp4;
        } else {
            n1Var = this;
        }
        setMeasuredDimension(size, i13);
        n1Var.r = false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f3 f3Var = this.c;
        int i10 = this.f;
        int i11 = this.h;
        m4 m4Var = this.x;
        if (m4.l(m4Var, this.w, motionEvent, this, f3Var, i10, i11)) {
            return true;
        }
        return m4.l(m4Var, this.w, motionEvent, this, this.d, this.f, this.h + this.n) || super.onTouchEvent(motionEvent);
    }
}
