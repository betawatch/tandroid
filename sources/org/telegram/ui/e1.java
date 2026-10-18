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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class e1 extends View implements org.telegram.ui.Cells.m9, g3 {
    public final d70 a;
    public final j4 b;
    public d3 c;
    public d3 d;
    public int e;
    public int f;
    public int h;
    public TL_iv.pageBlockBlockquote n;

    public e1(Context context, d70 d70Var, j4 j4Var) {
        super(context);
        this.a = d70Var;
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
        d70 d70Var = this.a;
        d70Var.getClass();
        float f7 = 18;
        int dp = AndroidUtilities.dp(f7);
        d3 d3Var = this.c;
        if (d3Var != null) {
            i10 = Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, (d3Var.a() + d3Var.s) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            i10 = Math.min(i10, (d3Var2.a() + d3Var2.s) - dp);
        }
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        d70Var.getClass();
        return i10 - AndroidUtilities.dp(f7);
    }

    @Override // org.telegram.ui.g3
    public int getBoundRight() {
        int i10;
        d70 d70Var = this.a;
        d70Var.getClass();
        float f7 = 18;
        int dp = AndroidUtilities.dp(f7);
        d3 d3Var = this.c;
        if (d3Var != null) {
            i10 = Math.max(TLObject.FLAG_31, d3Var.b() + d3Var.s + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            i10 = Math.max(i10, d3Var2.b() + d3Var2.s + dp);
        }
        if (i10 == Integer.MIN_VALUE) {
            return -1;
        }
        d70Var.getClass();
        return AndroidUtilities.dp(f7) + i10;
    }

    @Override // org.telegram.ui.g3
    public int getLastLineBoundRight() {
        int c10;
        int dp;
        d3 d3Var = this.d;
        d70 d70Var = this.a;
        if (d3Var != null) {
            c10 = d3Var.c() + d3Var.s;
            d70Var.getClass();
            dp = AndroidUtilities.dp(18);
        } else {
            d3 d3Var2 = this.c;
            if (d3Var2 == null) {
                return -1;
            }
            c10 = d3Var2.c() + d3Var2.s;
            d70Var.getClass();
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
        d70 d70Var = this.a;
        int i10 = 0;
        if (d3Var != null) {
            canvas.save();
            canvas.translate(this.f, this.h);
            l4.v(d70Var, canvas, this, 0);
            this.c.draw(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f, this.e);
            l4.v(d70Var, canvas, this, i10);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        j4 j4Var = this.b;
        if (j4Var == null || !j4Var.G) {
            d70Var.getClass();
            float dp = AndroidUtilities.dp((this.n.level * 14) + 18);
            float dp2 = AndroidUtilities.dp(6.0f);
            d70Var.getClass();
            canvas.drawRect(dp, dp2, AndroidUtilities.dp((this.n.level * 14) + 20), getMeasuredHeight() - AndroidUtilities.dp(6.0f), l4.q1);
        } else {
            canvas.drawRect(getMeasuredWidth() - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f) + r2, getMeasuredHeight() - AndroidUtilities.dp(6.0f), l4.q1);
        }
        l4.u(canvas, d70Var, this.n, getMeasuredHeight());
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
        d70 d70Var = this.a;
        if (d3Var != null && (j11 = l4.j(d70Var, j4Var, d3Var)) != null) {
            spannableStringBuilder.append(j11);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null && (j10 = l4.j(d70Var, j4Var, d3Var2)) != null) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append(j10);
        }
        if (spannableStringBuilder.length() == 0) {
            return;
        }
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) LocaleController.getString(R.string.AccDescrIVBlockquote));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        d70 d70Var = this.a;
        d70Var.getClass();
        float f7 = 8;
        this.h = AndroidUtilities.dp(f7);
        if (this.n != null) {
            d70Var.getClass();
            int dp = size - AndroidUtilities.dp(50);
            if (this.n.level > 0) {
                dp -= AndroidUtilities.dp(r2 * 14);
            }
            int i14 = dp;
            TL_iv.pageBlockBlockquote pageblockblockquote = this.n;
            d3 q6 = l4.q(this.a, this, null, pageblockblockquote.text, i14, this.h, pageblockblockquote, this.b);
            this.c = q6;
            if (q6 != null) {
                d70Var.getClass();
                i13 = this.c.d.getHeight() + AndroidUtilities.dp(f7);
            } else {
                i13 = 0;
            }
            i12 = i13;
            int i15 = this.n.level;
            j4 j4Var = this.b;
            if (i15 > 0) {
                if (j4Var == null || !j4Var.G) {
                    int dp2 = AndroidUtilities.dp(i15 * 14);
                    d70Var.getClass();
                    this.f = AndroidUtilities.dp(32) + dp2;
                } else {
                    this.f = AndroidUtilities.dp((i15 * 14) + 14);
                }
            } else if (j4Var == null || !j4Var.G) {
                d70Var.getClass();
                this.f = AndroidUtilities.dp(32);
            } else {
                this.f = AndroidUtilities.dp(14.0f);
            }
            d70Var.getClass();
            int dp3 = AndroidUtilities.dp(f7) + i12;
            this.e = dp3;
            TL_iv.pageBlockBlockquote pageblockblockquote2 = this.n;
            d3 q10 = l4.q(this.a, this, null, pageblockblockquote2.caption, i14, dp3, pageblockblockquote2, this.b);
            this.d = q10;
            if (q10 != null) {
                d70Var.getClass();
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(f7);
            }
            if (i12 != 0) {
                d70Var.getClass();
                i12 += AndroidUtilities.dp(f7);
            }
            d3 d3Var = this.c;
            if (d3Var != null) {
                d3Var.s = this.f;
                d3Var.v = this.h;
            }
            d3 d3Var2 = this.d;
            if (d3Var2 != null) {
                d3Var2.s = this.f;
                d3Var2.v = this.e;
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

    public void setBlock(TL_iv.pageBlockBlockquote pageblockblockquote) {
        this.n = pageblockblockquote;
        requestLayout();
    }
}
