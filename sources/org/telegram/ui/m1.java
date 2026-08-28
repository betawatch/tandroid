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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class m1 extends FrameLayout implements org.telegram.ui.Cells.m9 {
    public final gh.f1 a;
    public final j1 b;
    public e3 c;
    public e3 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public boolean r;
    public TL_iv.pageBlockCollage s;
    public final l1 v;
    public final j4 w;
    public final /* synthetic */ l4 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(l4 l4Var, Context context, j4 j4Var) {
        super(context);
        this.x = l4Var;
        this.v = new l1(this);
        this.w = j4Var;
        gh.f1 f1Var = new gh.f1(this, context, 4);
        this.a = f1Var;
        f1Var.i(new g1(this));
        h1 h1Var = new h1(this);
        h1Var.O = new i1(this);
        f1Var.setLayoutManager(h1Var);
        j1 j1Var = new j1(this);
        this.b = j1Var;
        f1Var.setAdapter(j1Var);
        addView(f1Var, g7.e6.c(-2.0f, -1));
        setWillNotDraw(false);
    }

    @Override // org.telegram.ui.Cells.m9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        e3 e3Var = this.c;
        if (e3Var != null) {
            arrayList.add(e3Var);
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null) {
            arrayList.add(e3Var2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e3 e3Var = this.c;
        if (e3Var != null) {
            e3Var.attach(this);
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null) {
            e3Var2.attach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e3 e3Var = this.c;
        if (e3Var != null) {
            e3Var.detach(this);
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null) {
            e3Var2.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.s == null) {
            return;
        }
        e3 e3Var = this.c;
        l4 l4Var = this.x;
        int i9 = 0;
        if (e3Var != null) {
            canvas.save();
            canvas.translate(this.f, this.h);
            l4.v(l4Var, canvas, this, 0);
            this.c.draw(canvas, this);
            canvas.restore();
            i9 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f, this.h + this.n);
            l4.v(l4Var, canvas, this, i9);
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13 = this.e;
        int dp = AndroidUtilities.dp(8.0f);
        int i14 = this.e;
        gh.f1 f1Var = this.a;
        f1Var.layout(i13, dp, f1Var.getMeasuredWidth() + i14, AndroidUtilities.dp(8.0f) + f1Var.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        m1 m1Var;
        int dp;
        int i11;
        int i12 = 1;
        this.r = true;
        int size = View.MeasureSpec.getSize(i9);
        TL_iv.pageBlockCollage pageblockcollage = this.s;
        if (pageblockcollage != null) {
            if (pageblockcollage.level > 0) {
                int dp2 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(r15 * 14);
                this.e = dp2;
                this.f = dp2;
                i11 = org.telegram.messenger.ll.w(18.0f, dp2, size);
                dp = i11;
            } else {
                this.e = 0;
                this.f = AndroidUtilities.dp(18.0f);
                dp = size - AndroidUtilities.dp(36.0f);
                i11 = size;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            gh.f1 f1Var = this.a;
            f1Var.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredHeight = f1Var.getMeasuredHeight();
            int dp3 = AndroidUtilities.dp(8.0f) + measuredHeight;
            this.h = dp3;
            TL_iv.pageBlockCollage pageblockcollage2 = this.s;
            TL_iv.RichText richText = pageblockcollage2.caption.text;
            HashSet hashSet = l4.X0;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            l4 l4Var = this.x;
            m1Var = this;
            e3 p6 = l4.p(l4Var, m1Var, null, richText, dp, dp3, pageblockcollage2, alignment, 0, this.w);
            m1Var.c = p6;
            if (p6 != null) {
                int height = m1Var.c.d.getHeight() + AndroidUtilities.dp(4.0f);
                m1Var.n = height;
                measuredHeight = org.telegram.messenger.l0.C(4.0f, height, measuredHeight);
                e3 e3Var = m1Var.c;
                e3Var.s = m1Var.f;
                e3Var.v = m1Var.h;
            } else {
                m1Var.n = 0;
            }
            TL_iv.pageBlockCollage pageblockcollage3 = m1Var.s;
            TL_iv.RichText richText2 = pageblockcollage3.caption.credit;
            if (m1Var.w.C) {
                alignment = org.telegram.ui.Components.rv0.a();
            }
            e3 p9 = l4.p(l4Var, m1Var, null, richText2, dp, 0, pageblockcollage3, alignment, 0, m1Var.w);
            m1Var.d = p9;
            if (p9 != null) {
                measuredHeight += m1Var.d.d.getHeight() + AndroidUtilities.dp(4.0f);
                e3 e3Var2 = m1Var.d;
                e3Var2.s = m1Var.f;
                e3Var2.v = m1Var.h + m1Var.n;
            }
            int dp4 = AndroidUtilities.dp(16.0f) + measuredHeight;
            TL_iv.pageBlockCollage pageblockcollage4 = m1Var.s;
            i12 = (pageblockcollage4.level <= 0 || pageblockcollage4.bottom) ? dp4 : AndroidUtilities.dp(8.0f) + dp4;
        } else {
            m1Var = this;
        }
        setMeasuredDimension(size, i12);
        m1Var.r = false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        e3 e3Var = this.c;
        int i9 = this.f;
        int i10 = this.h;
        l4 l4Var = this.x;
        if (l4.l(l4Var, this.w, motionEvent, this, e3Var, i9, i10)) {
            return true;
        }
        return l4.l(l4Var, this.w, motionEvent, this, this.d, this.f, this.h + this.n) || super.onTouchEvent(motionEvent);
    }
}
