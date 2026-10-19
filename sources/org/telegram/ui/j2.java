package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class j2 extends View implements org.telegram.ui.Cells.m9, g3 {
    public final b70 a;
    public final j4 b;
    public d3 c;
    public d3 d;
    public int e;
    public int f;
    public int h;
    public TL_iv.pageBlockPullquote n;

    public j2(Context context, b70 b70Var, j4 j4Var) {
        super(context);
        this.a = b70Var;
        this.b = j4Var;
    }

    @Override // org.telegram.ui.Cells.m9
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

    @Override // org.telegram.ui.g3
    public int getBoundLeft() {
        int i10;
        d3 d3Var = this.c;
        if (d3Var != null) {
            i10 = Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, d3Var.a() + d3Var.s);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            i10 = Math.min(i10, d3Var2.a() + d3Var2.s);
        }
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        this.a.getClass();
        return i10 - AndroidUtilities.dp(18);
    }

    @Override // org.telegram.ui.g3
    public int getBoundRight() {
        int i10;
        d3 d3Var = this.c;
        if (d3Var != null) {
            i10 = Math.max(TLObject.FLAG_31, d3Var.b() + d3Var.s);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            i10 = Math.max(i10, d3Var2.b() + d3Var2.s);
        }
        if (i10 == Integer.MIN_VALUE) {
            return -1;
        }
        this.a.getClass();
        return AndroidUtilities.dp(18) + i10;
    }

    @Override // org.telegram.ui.g3
    public int getLastLineBoundRight() {
        int c10;
        int dp;
        d3 d3Var = this.d;
        b70 b70Var = this.a;
        if (d3Var != null) {
            c10 = d3Var.c() + d3Var.s;
            b70Var.getClass();
            dp = AndroidUtilities.dp(18);
        } else {
            d3 d3Var2 = this.c;
            if (d3Var2 == null) {
                return -1;
            }
            c10 = d3Var2.c() + d3Var2.s;
            b70Var.getClass();
            dp = AndroidUtilities.dp(18);
        }
        return dp + c10;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return org.telegram.messenger.kk.a(this);
    }

    @Override // android.view.View
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

    @Override // android.view.View
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
        if (this.n == null) {
            return;
        }
        d3 d3Var = this.c;
        b70 b70Var = this.a;
        int i10 = 0;
        if (d3Var != null) {
            canvas.save();
            canvas.translate(this.f, this.h);
            l4.v(b70Var, canvas, this, 0);
            this.c.draw(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f, this.e);
            l4.v(b70Var, canvas, this, i10);
            this.d.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence j10;
        CharSequence j11;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        d3 d3Var = this.c;
        j4 j4Var = this.b;
        b70 b70Var = this.a;
        if (d3Var != null && (j11 = l4.j(b70Var, j4Var, d3Var)) != null) {
            spannableStringBuilder.append(j11);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null && (j10 = l4.j(b70Var, j4Var, d3Var2)) != null) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append(j10);
        }
        if (spannableStringBuilder.length() == 0) {
            return;
        }
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) LocaleController.getString(R.string.AccDescrIVPullquote));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        b70 b70Var = this.a;
        b70Var.getClass();
        this.f = AndroidUtilities.dp(18);
        b70Var.getClass();
        float f7 = 8;
        this.h = AndroidUtilities.dp(f7);
        TL_iv.pageBlockPullquote pageblockpullquote = this.n;
        if (pageblockpullquote != null) {
            TL_iv.RichText richText = pageblockpullquote.text;
            b70 b70Var2 = this.a;
            b70Var2.getClass();
            float f10 = 36;
            d3 q6 = l4.q(b70Var2, this, null, richText, size - AndroidUtilities.dp(f10), this.h, this.n, this.b);
            this.c = q6;
            if (q6 != null) {
                b70Var.getClass();
                i13 = this.c.d.getHeight() + AndroidUtilities.dp(f7);
                d3 d3Var = this.c;
                d3Var.s = this.f;
                d3Var.v = this.h;
            } else {
                i13 = 0;
            }
            i12 = i13;
            this.e = AndroidUtilities.dp(2.0f) + i12;
            TL_iv.RichText richText2 = this.n.caption;
            b70 b70Var3 = this.a;
            b70Var3.getClass();
            d3 q10 = l4.q(b70Var3, this, null, richText2, size - AndroidUtilities.dp(f10), this.e, this.n, this.b);
            this.d = q10;
            if (q10 != null) {
                b70Var.getClass();
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(f7);
                d3 d3Var2 = this.d;
                d3Var2.s = this.f;
                d3Var2.v = this.e;
            }
            if (i12 != 0) {
                b70Var.getClass();
                i12 += AndroidUtilities.dp(f7);
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (l4.l(this.a, this.b, motionEvent, this, this.c, this.f, this.h)) {
            return true;
        }
        return l4.l(this.a, this.b, motionEvent, this, this.d, this.f, this.e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockPullquote pageblockpullquote) {
        this.n = pageblockpullquote;
        requestLayout();
    }
}
