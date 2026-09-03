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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class n1 extends FrameLayout implements org.telegram.ui.Cells.k9 {
    public final lh.e1 a;
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
    public final l4 w;
    public final /* synthetic */ n4 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(n4 n4Var, Context context, l4 l4Var) {
        super(context);
        this.x = n4Var;
        this.v = new m1(this);
        this.w = l4Var;
        lh.e1 e1Var = new lh.e1(this, context, 2);
        this.a = e1Var;
        e1Var.i(new h1(this));
        i1 i1Var = new i1(this);
        i1Var.O = new j1(this);
        e1Var.setLayoutManager(i1Var);
        k1 k1Var = new k1(this);
        this.b = k1Var;
        e1Var.setAdapter(k1Var);
        addView(e1Var, k7.b6.c(-2.0f, -1));
        setWillNotDraw(false);
    }

    @Override // org.telegram.ui.Cells.k9
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
        n4 n4Var = this.x;
        int i10 = 0;
        if (f3Var != null) {
            canvas.save();
            canvas.translate(this.f, this.h);
            n4.v(n4Var, canvas, this, 0);
            this.c.draw(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f, this.h + this.n);
            n4.v(n4Var, canvas, this, i10);
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
        lh.e1 e1Var = this.a;
        e1Var.layout(i14, dp, e1Var.getMeasuredWidth() + i15, AndroidUtilities.dp(8.0f) + e1Var.getMeasuredHeight());
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
            lh.e1 e1Var = this.a;
            e1Var.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredHeight = e1Var.getMeasuredHeight();
            int dp3 = AndroidUtilities.dp(8.0f) + measuredHeight;
            this.h = dp3;
            TL_iv.pageBlockCollage pageblockcollage2 = this.s;
            TL_iv.RichText richText = pageblockcollage2.caption.text;
            HashSet hashSet = n4.Y0;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            n4 n4Var = this.x;
            n1Var = this;
            f3 p10 = n4.p(n4Var, n1Var, null, richText, dp, dp3, pageblockcollage2, alignment, 0, this.w);
            n1Var.c = p10;
            if (p10 != null) {
                int height = n1Var.c.d.getHeight() + AndroidUtilities.dp(4.0f);
                n1Var.n = height;
                measuredHeight = org.telegram.messenger.y3.C(4.0f, height, measuredHeight);
                f3 f3Var = n1Var.c;
                f3Var.s = n1Var.f;
                f3Var.v = n1Var.h;
            } else {
                n1Var.n = 0;
            }
            TL_iv.pageBlockCollage pageblockcollage3 = n1Var.s;
            TL_iv.RichText richText2 = pageblockcollage3.caption.credit;
            if (n1Var.w.D) {
                alignment = org.telegram.ui.Components.kw0.a();
            }
            f3 p11 = n4.p(n4Var, n1Var, null, richText2, dp, 0, pageblockcollage3, alignment, 0, n1Var.w);
            n1Var.d = p11;
            if (p11 != null) {
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
        n4 n4Var = this.x;
        if (n4.l(n4Var, this.w, motionEvent, this, f3Var, i10, i11)) {
            return true;
        }
        return n4.l(n4Var, this.w, motionEvent, this, this.d, this.f, this.h + this.n) || super.onTouchEvent(motionEvent);
    }
}
