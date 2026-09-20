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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class b1 extends View implements org.telegram.ui.Cells.q9, d3 {
    public final u70 a;
    public final f4 b;
    public a3 c;
    public a3 d;
    public int e;
    public int f;
    public int h;
    public TL_iv.pageBlockBlockquote n;

    public b1(Context context, u70 u70Var, f4 f4Var) {
        super(context);
        this.a = u70Var;
        this.b = f4Var;
    }

    @Override // org.telegram.ui.Cells.q9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            arrayList.add(a3Var2);
        }
    }

    @Override // org.telegram.ui.d3
    public int getBoundLeft() {
        int i10;
        u70 u70Var = this.a;
        u70Var.getClass();
        float f7 = 18;
        int dp = AndroidUtilities.dp(f7);
        a3 a3Var = this.c;
        if (a3Var != null) {
            i10 = Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, (a3Var.a() + a3Var.s) - dp);
        } else {
            i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            i10 = Math.min(i10, (a3Var2.a() + a3Var2.s) - dp);
        }
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        u70Var.getClass();
        return i10 - AndroidUtilities.dp(f7);
    }

    @Override // org.telegram.ui.d3
    public int getBoundRight() {
        int i10;
        u70 u70Var = this.a;
        u70Var.getClass();
        float f7 = 18;
        int dp = AndroidUtilities.dp(f7);
        a3 a3Var = this.c;
        if (a3Var != null) {
            i10 = Math.max(TLObject.FLAG_31, a3Var.b() + a3Var.s + dp);
        } else {
            i10 = TLObject.FLAG_31;
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            i10 = Math.max(i10, a3Var2.b() + a3Var2.s + dp);
        }
        if (i10 == Integer.MIN_VALUE) {
            return -1;
        }
        u70Var.getClass();
        return AndroidUtilities.dp(f7) + i10;
    }

    @Override // org.telegram.ui.d3
    public int getLastLineBoundRight() {
        int c10;
        int dp;
        a3 a3Var = this.d;
        u70 u70Var = this.a;
        if (a3Var != null) {
            c10 = a3Var.c() + a3Var.s;
            u70Var.getClass();
            dp = AndroidUtilities.dp(18);
        } else {
            a3 a3Var2 = this.c;
            if (a3Var2 == null) {
                return -1;
            }
            c10 = a3Var2.c() + a3Var2.s;
            u70Var.getClass();
            dp = AndroidUtilities.dp(18);
        }
        return dp + c10;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return org.telegram.messenger.rk.a(this);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            a3Var2.attach(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            a3Var2.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.n == null) {
            return;
        }
        a3 a3Var = this.c;
        u70 u70Var = this.a;
        int i10 = 0;
        if (a3Var != null) {
            canvas.save();
            canvas.translate(this.f, this.h);
            h4.v(u70Var, canvas, this, 0);
            this.c.draw(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f, this.e);
            h4.v(u70Var, canvas, this, i10);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        f4 f4Var = this.b;
        if (f4Var == null || !f4Var.G) {
            u70Var.getClass();
            float dp = AndroidUtilities.dp((this.n.level * 14) + 18);
            float dp2 = AndroidUtilities.dp(6.0f);
            u70Var.getClass();
            canvas.drawRect(dp, dp2, AndroidUtilities.dp((this.n.level * 14) + 20), getMeasuredHeight() - AndroidUtilities.dp(6.0f), h4.q1);
        } else {
            canvas.drawRect(getMeasuredWidth() - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f) + r2, getMeasuredHeight() - AndroidUtilities.dp(6.0f), h4.q1);
        }
        h4.u(canvas, u70Var, this.n, getMeasuredHeight());
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
        a3 a3Var = this.c;
        f4 f4Var = this.b;
        u70 u70Var = this.a;
        if (a3Var != null && (j10 = h4.j(u70Var, f4Var, a3Var)) != null) {
            spannableStringBuilder.append(j10);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null && (j3 = h4.j(u70Var, f4Var, a3Var2)) != null) {
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
        u70 u70Var = this.a;
        u70Var.getClass();
        float f7 = 8;
        this.h = AndroidUtilities.dp(f7);
        if (this.n != null) {
            u70Var.getClass();
            int dp = size - AndroidUtilities.dp(50);
            if (this.n.level > 0) {
                dp -= AndroidUtilities.dp(r2 * 14);
            }
            int i13 = dp;
            TL_iv.pageBlockBlockquote pageblockblockquote = this.n;
            a3 q6 = h4.q(this.a, this, null, pageblockblockquote.text, i13, this.h, pageblockblockquote, this.b);
            this.c = q6;
            if (q6 != null) {
                u70Var.getClass();
                i12 = this.c.d.getHeight() + AndroidUtilities.dp(f7);
            } else {
                i12 = 0;
            }
            int i14 = this.n.level;
            f4 f4Var = this.b;
            if (i14 > 0) {
                if (f4Var == null || !f4Var.G) {
                    int dp2 = AndroidUtilities.dp(i14 * 14);
                    u70Var.getClass();
                    this.f = AndroidUtilities.dp(32) + dp2;
                } else {
                    this.f = AndroidUtilities.dp((i14 * 14) + 14);
                }
            } else if (f4Var == null || !f4Var.G) {
                u70Var.getClass();
                this.f = AndroidUtilities.dp(32);
            } else {
                this.f = AndroidUtilities.dp(14.0f);
            }
            u70Var.getClass();
            int dp3 = AndroidUtilities.dp(f7) + i12;
            this.e = dp3;
            TL_iv.pageBlockBlockquote pageblockblockquote2 = this.n;
            a3 q10 = h4.q(this.a, this, null, pageblockblockquote2.caption, i13, dp3, pageblockblockquote2, this.b);
            this.d = q10;
            if (q10 != null) {
                u70Var.getClass();
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(f7);
            }
            if (i12 != 0) {
                u70Var.getClass();
                i12 += AndroidUtilities.dp(f7);
            }
            a3 a3Var = this.c;
            if (a3Var != null) {
                a3Var.s = this.f;
                a3Var.v = this.h;
            }
            a3 a3Var2 = this.d;
            if (a3Var2 != null) {
                a3Var2.s = this.f;
                a3Var2.v = this.e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (h4.l(this.a, this.b, motionEvent, this, this.c, this.f, this.h)) {
            return true;
        }
        return h4.l(this.a, this.b, motionEvent, this, this.d, this.f, this.e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockBlockquote pageblockblockquote) {
        this.n = pageblockblockquote;
        requestLayout();
    }
}
