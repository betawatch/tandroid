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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class c1 extends View implements org.telegram.ui.Cells.p9, e3 {
    public final v70 a;
    public final g4 b;
    public b3 c;
    public b3 d;
    public int e;
    public int f;
    public int h;
    public TL_iv.pageBlockBlockquote n;

    public c1(Context context, v70 v70Var, g4 g4Var) {
        super(context);
        this.a = v70Var;
        this.b = g4Var;
    }

    @Override // org.telegram.ui.Cells.p9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null) {
            arrayList.add(b3Var2);
        }
    }

    @Override // org.telegram.ui.e3
    public int getBoundLeft() {
        int i10;
        v70 v70Var = this.a;
        v70Var.getClass();
        float f7 = 18;
        int dp = AndroidUtilities.dp(f7);
        b3 b3Var = this.c;
        if (b3Var != null) {
            i10 = Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, (b3Var.a() + b3Var.s) - dp);
        } else {
            i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null) {
            i10 = Math.min(i10, (b3Var2.a() + b3Var2.s) - dp);
        }
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        v70Var.getClass();
        return i10 - AndroidUtilities.dp(f7);
    }

    @Override // org.telegram.ui.e3
    public int getBoundRight() {
        int i10;
        v70 v70Var = this.a;
        v70Var.getClass();
        float f7 = 18;
        int dp = AndroidUtilities.dp(f7);
        b3 b3Var = this.c;
        if (b3Var != null) {
            i10 = Math.max(TLObject.FLAG_31, b3Var.b() + b3Var.s + dp);
        } else {
            i10 = TLObject.FLAG_31;
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null) {
            i10 = Math.max(i10, b3Var2.b() + b3Var2.s + dp);
        }
        if (i10 == Integer.MIN_VALUE) {
            return -1;
        }
        v70Var.getClass();
        return AndroidUtilities.dp(f7) + i10;
    }

    @Override // org.telegram.ui.e3
    public int getLastLineBoundRight() {
        int c10;
        int dp;
        b3 b3Var = this.d;
        v70 v70Var = this.a;
        if (b3Var != null) {
            c10 = b3Var.c() + b3Var.s;
            v70Var.getClass();
            dp = AndroidUtilities.dp(18);
        } else {
            b3 b3Var2 = this.c;
            if (b3Var2 == null) {
                return -1;
            }
            c10 = b3Var2.c() + b3Var2.s;
            v70Var.getClass();
            dp = AndroidUtilities.dp(18);
        }
        return dp + c10;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return org.telegram.messenger.wl.b(this);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null) {
            b3Var2.attach(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null) {
            b3Var2.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.n == null) {
            return;
        }
        b3 b3Var = this.c;
        v70 v70Var = this.a;
        int i10 = 0;
        if (b3Var != null) {
            canvas.save();
            canvas.translate(this.f, this.h);
            i4.v(v70Var, canvas, this, 0);
            this.c.draw(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f, this.e);
            i4.v(v70Var, canvas, this, i10);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        g4 g4Var = this.b;
        if (g4Var == null || !g4Var.G) {
            v70Var.getClass();
            float dp = AndroidUtilities.dp((this.n.level * 14) + 18);
            float dp2 = AndroidUtilities.dp(6.0f);
            v70Var.getClass();
            canvas.drawRect(dp, dp2, AndroidUtilities.dp((this.n.level * 14) + 20), getMeasuredHeight() - AndroidUtilities.dp(6.0f), i4.q1);
        } else {
            canvas.drawRect(getMeasuredWidth() - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f) + r2, getMeasuredHeight() - AndroidUtilities.dp(6.0f), i4.q1);
        }
        i4.u(canvas, v70Var, this.n, getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence j3;
        CharSequence j10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        b3 b3Var = this.c;
        g4 g4Var = this.b;
        v70 v70Var = this.a;
        if (b3Var != null && (j10 = i4.j(v70Var, g4Var, b3Var)) != null) {
            spannableStringBuilder.append(j10);
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null && (j3 = i4.j(v70Var, g4Var, b3Var2)) != null) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append(j3);
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
        v70 v70Var = this.a;
        v70Var.getClass();
        float f7 = 8;
        this.h = AndroidUtilities.dp(f7);
        if (this.n != null) {
            v70Var.getClass();
            int dp = size - AndroidUtilities.dp(50);
            if (this.n.level > 0) {
                dp -= AndroidUtilities.dp(r2 * 14);
            }
            int i13 = dp;
            TL_iv.pageBlockBlockquote pageblockblockquote = this.n;
            b3 q6 = i4.q(this.a, this, null, pageblockblockquote.text, i13, this.h, pageblockblockquote, this.b);
            this.c = q6;
            if (q6 != null) {
                v70Var.getClass();
                i12 = this.c.d.getHeight() + AndroidUtilities.dp(f7);
            } else {
                i12 = 0;
            }
            int i14 = this.n.level;
            g4 g4Var = this.b;
            if (i14 > 0) {
                if (g4Var == null || !g4Var.G) {
                    int dp2 = AndroidUtilities.dp(i14 * 14);
                    v70Var.getClass();
                    this.f = AndroidUtilities.dp(32) + dp2;
                } else {
                    this.f = AndroidUtilities.dp((i14 * 14) + 14);
                }
            } else if (g4Var == null || !g4Var.G) {
                v70Var.getClass();
                this.f = AndroidUtilities.dp(32);
            } else {
                this.f = AndroidUtilities.dp(14.0f);
            }
            v70Var.getClass();
            int dp3 = AndroidUtilities.dp(f7) + i12;
            this.e = dp3;
            TL_iv.pageBlockBlockquote pageblockblockquote2 = this.n;
            b3 q10 = i4.q(this.a, this, null, pageblockblockquote2.caption, i13, dp3, pageblockblockquote2, this.b);
            this.d = q10;
            if (q10 != null) {
                v70Var.getClass();
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(f7);
            }
            if (i12 != 0) {
                v70Var.getClass();
                i12 += AndroidUtilities.dp(f7);
            }
            b3 b3Var = this.c;
            if (b3Var != null) {
                b3Var.s = this.f;
                b3Var.v = this.h;
            }
            b3 b3Var2 = this.d;
            if (b3Var2 != null) {
                b3Var2.s = this.f;
                b3Var2.v = this.e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (i4.l(this.a, this.b, motionEvent, this, this.c, this.f, this.h)) {
            return true;
        }
        return i4.l(this.a, this.b, motionEvent, this, this.d, this.f, this.e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockBlockquote pageblockblockquote) {
        this.n = pageblockblockquote;
        requestLayout();
    }
}
