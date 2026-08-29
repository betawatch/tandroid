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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class f1 extends View implements org.telegram.ui.Cells.j9, i3 {
    public final d70 a;
    public final k4 b;
    public f3 c;
    public f3 d;
    public int e;
    public int f;
    public int h;
    public TL_iv.pageBlockBlockquote n;

    public f1(Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.a = d70Var;
        this.b = k4Var;
    }

    @Override // org.telegram.ui.Cells.j9
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

    @Override // org.telegram.ui.i3
    public int getBoundLeft() {
        int i10;
        d70 d70Var = this.a;
        d70Var.getClass();
        float f9 = 18;
        int dp = AndroidUtilities.dp(f9);
        f3 f3Var = this.c;
        if (f3Var != null) {
            i10 = Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, (f3Var.a() + f3Var.s) - dp);
        } else {
            i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            i10 = Math.min(i10, (f3Var2.a() + f3Var2.s) - dp);
        }
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        d70Var.getClass();
        return i10 - AndroidUtilities.dp(f9);
    }

    @Override // org.telegram.ui.i3
    public int getBoundRight() {
        int i10;
        d70 d70Var = this.a;
        d70Var.getClass();
        float f9 = 18;
        int dp = AndroidUtilities.dp(f9);
        f3 f3Var = this.c;
        if (f3Var != null) {
            i10 = Math.max(TLObject.FLAG_31, f3Var.b() + f3Var.s + dp);
        } else {
            i10 = TLObject.FLAG_31;
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            i10 = Math.max(i10, f3Var2.b() + f3Var2.s + dp);
        }
        if (i10 == Integer.MIN_VALUE) {
            return -1;
        }
        d70Var.getClass();
        return AndroidUtilities.dp(f9) + i10;
    }

    @Override // org.telegram.ui.i3
    public int getLastLineBoundRight() {
        int c3;
        int dp;
        f3 f3Var = this.d;
        d70 d70Var = this.a;
        if (f3Var != null) {
            c3 = f3Var.c() + f3Var.s;
            d70Var.getClass();
            dp = AndroidUtilities.dp(18);
        } else {
            f3 f3Var2 = this.c;
            if (f3Var2 == null) {
                return -1;
            }
            c3 = f3Var2.c() + f3Var2.s;
            d70Var.getClass();
            dp = AndroidUtilities.dp(18);
        }
        return dp + c3;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return b.b(this);
    }

    @Override // android.view.View
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

    @Override // android.view.View
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
        if (this.n == null) {
            return;
        }
        f3 f3Var = this.c;
        d70 d70Var = this.a;
        int i10 = 0;
        if (f3Var != null) {
            canvas.save();
            canvas.translate(this.f, this.h);
            m4.v(d70Var, canvas, this, 0);
            this.c.draw(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f, this.e);
            m4.v(d70Var, canvas, this, i10);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        k4 k4Var = this.b;
        if (k4Var == null || !k4Var.C) {
            d70Var.getClass();
            float dp = AndroidUtilities.dp((this.n.level * 14) + 18);
            float dp2 = AndroidUtilities.dp(6.0f);
            d70Var.getClass();
            canvas.drawRect(dp, dp2, AndroidUtilities.dp((this.n.level * 14) + 20), getMeasuredHeight() - AndroidUtilities.dp(6.0f), m4.m1);
        } else {
            canvas.drawRect(getMeasuredWidth() - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f) + r2, getMeasuredHeight() - AndroidUtilities.dp(6.0f), m4.m1);
        }
        m4.u(canvas, d70Var, this.n, getMeasuredHeight());
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
        f3 f3Var = this.c;
        k4 k4Var = this.b;
        d70 d70Var = this.a;
        if (f3Var != null && (j11 = m4.j(d70Var, k4Var, f3Var)) != null) {
            spannableStringBuilder.append(j11);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null && (j10 = m4.j(d70Var, k4Var, f3Var2)) != null) {
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
        int size = View.MeasureSpec.getSize(i10);
        d70 d70Var = this.a;
        d70Var.getClass();
        float f9 = 8;
        this.h = AndroidUtilities.dp(f9);
        if (this.n != null) {
            d70Var.getClass();
            int dp = size - AndroidUtilities.dp(50);
            if (this.n.level > 0) {
                dp -= AndroidUtilities.dp(r2 * 14);
            }
            int i13 = dp;
            TL_iv.pageBlockBlockquote pageblockblockquote = this.n;
            f3 q6 = m4.q(this.a, this, null, pageblockblockquote.text, i13, this.h, pageblockblockquote, this.b);
            this.c = q6;
            if (q6 != null) {
                d70Var.getClass();
                i12 = this.c.d.getHeight() + AndroidUtilities.dp(f9);
            } else {
                i12 = 0;
            }
            int i14 = this.n.level;
            k4 k4Var = this.b;
            if (i14 > 0) {
                if (k4Var == null || !k4Var.C) {
                    int dp2 = AndroidUtilities.dp(i14 * 14);
                    d70Var.getClass();
                    this.f = AndroidUtilities.dp(32) + dp2;
                } else {
                    this.f = AndroidUtilities.dp((i14 * 14) + 14);
                }
            } else if (k4Var == null || !k4Var.C) {
                d70Var.getClass();
                this.f = AndroidUtilities.dp(32);
            } else {
                this.f = AndroidUtilities.dp(14.0f);
            }
            d70Var.getClass();
            int dp3 = AndroidUtilities.dp(f9) + i12;
            this.e = dp3;
            TL_iv.pageBlockBlockquote pageblockblockquote2 = this.n;
            f3 q9 = m4.q(this.a, this, null, pageblockblockquote2.caption, i13, dp3, pageblockblockquote2, this.b);
            this.d = q9;
            if (q9 != null) {
                d70Var.getClass();
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(f9);
            }
            if (i12 != 0) {
                d70Var.getClass();
                i12 += AndroidUtilities.dp(f9);
            }
            f3 f3Var = this.c;
            if (f3Var != null) {
                f3Var.s = this.f;
                f3Var.v = this.h;
            }
            f3 f3Var2 = this.d;
            if (f3Var2 != null) {
                f3Var2.s = this.f;
                f3Var2.v = this.e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (m4.l(this.a, this.b, motionEvent, this, this.c, this.f, this.h)) {
            return true;
        }
        return m4.l(this.a, this.b, motionEvent, this, this.d, this.f, this.e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockBlockquote pageblockblockquote) {
        this.n = pageblockblockquote;
        requestLayout();
    }
}
