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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class d1 extends View implements org.telegram.ui.Cells.r9, f3 {
    public final t70 a;
    public final h4 b;
    public c3 c;
    public c3 d;
    public int e;
    public int f;
    public int h;
    public TL_iv.pageBlockBlockquote n;

    public d1(Context context, t70 t70Var, h4 h4Var) {
        super(context);
        this.a = t70Var;
        this.b = h4Var;
    }

    @Override // org.telegram.ui.Cells.r9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.c;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null) {
            arrayList.add(c3Var2);
        }
    }

    @Override // org.telegram.ui.f3
    public int getBoundLeft() {
        int i10;
        t70 t70Var = this.a;
        t70Var.getClass();
        float f7 = 18;
        int dp = AndroidUtilities.dp(f7);
        c3 c3Var = this.c;
        if (c3Var != null) {
            i10 = Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, (c3Var.a() + c3Var.s) - dp);
        } else {
            i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null) {
            i10 = Math.min(i10, (c3Var2.a() + c3Var2.s) - dp);
        }
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        t70Var.getClass();
        return i10 - AndroidUtilities.dp(f7);
    }

    @Override // org.telegram.ui.f3
    public int getBoundRight() {
        int i10;
        t70 t70Var = this.a;
        t70Var.getClass();
        float f7 = 18;
        int dp = AndroidUtilities.dp(f7);
        c3 c3Var = this.c;
        if (c3Var != null) {
            i10 = Math.max(TLObject.FLAG_31, c3Var.b() + c3Var.s + dp);
        } else {
            i10 = TLObject.FLAG_31;
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null) {
            i10 = Math.max(i10, c3Var2.b() + c3Var2.s + dp);
        }
        if (i10 == Integer.MIN_VALUE) {
            return -1;
        }
        t70Var.getClass();
        return AndroidUtilities.dp(f7) + i10;
    }

    @Override // org.telegram.ui.f3
    public int getLastLineBoundRight() {
        int c10;
        int dp;
        c3 c3Var = this.d;
        t70 t70Var = this.a;
        if (c3Var != null) {
            c10 = c3Var.c() + c3Var.s;
            t70Var.getClass();
            dp = AndroidUtilities.dp(18);
        } else {
            c3 c3Var2 = this.c;
            if (c3Var2 == null) {
                return -1;
            }
            c10 = c3Var2.c() + c3Var2.s;
            t70Var.getClass();
            dp = AndroidUtilities.dp(18);
        }
        return dp + c10;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return org.telegram.messenger.em.b(this);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.c;
        if (c3Var != null) {
            c3Var.attach(this);
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null) {
            c3Var2.attach(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.c;
        if (c3Var != null) {
            c3Var.detach(this);
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null) {
            c3Var2.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.n == null) {
            return;
        }
        c3 c3Var = this.c;
        t70 t70Var = this.a;
        int i10 = 0;
        if (c3Var != null) {
            canvas.save();
            canvas.translate(this.f, this.h);
            j4.v(t70Var, canvas, this, 0);
            this.c.draw(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f, this.e);
            j4.v(t70Var, canvas, this, i10);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        h4 h4Var = this.b;
        if (h4Var == null || !h4Var.G) {
            t70Var.getClass();
            float dp = AndroidUtilities.dp((this.n.level * 14) + 18);
            float dp2 = AndroidUtilities.dp(6.0f);
            t70Var.getClass();
            canvas.drawRect(dp, dp2, AndroidUtilities.dp((this.n.level * 14) + 20), getMeasuredHeight() - AndroidUtilities.dp(6.0f), j4.q1);
        } else {
            canvas.drawRect(getMeasuredWidth() - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f) + r2, getMeasuredHeight() - AndroidUtilities.dp(6.0f), j4.q1);
        }
        j4.u(canvas, t70Var, this.n, getMeasuredHeight());
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
        c3 c3Var = this.c;
        h4 h4Var = this.b;
        t70 t70Var = this.a;
        if (c3Var != null && (j10 = j4.j(t70Var, h4Var, c3Var)) != null) {
            spannableStringBuilder.append(j10);
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null && (j3 = j4.j(t70Var, h4Var, c3Var2)) != null) {
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
        t70 t70Var = this.a;
        t70Var.getClass();
        float f7 = 8;
        this.h = AndroidUtilities.dp(f7);
        if (this.n != null) {
            t70Var.getClass();
            int dp = size - AndroidUtilities.dp(50);
            if (this.n.level > 0) {
                dp -= AndroidUtilities.dp(r2 * 14);
            }
            int i13 = dp;
            TL_iv.pageBlockBlockquote pageblockblockquote = this.n;
            c3 q6 = j4.q(this.a, this, null, pageblockblockquote.text, i13, this.h, pageblockblockquote, this.b);
            this.c = q6;
            if (q6 != null) {
                t70Var.getClass();
                i12 = this.c.d.getHeight() + AndroidUtilities.dp(f7);
            } else {
                i12 = 0;
            }
            int i14 = this.n.level;
            h4 h4Var = this.b;
            if (i14 > 0) {
                if (h4Var == null || !h4Var.G) {
                    int dp2 = AndroidUtilities.dp(i14 * 14);
                    t70Var.getClass();
                    this.f = AndroidUtilities.dp(32) + dp2;
                } else {
                    this.f = AndroidUtilities.dp((i14 * 14) + 14);
                }
            } else if (h4Var == null || !h4Var.G) {
                t70Var.getClass();
                this.f = AndroidUtilities.dp(32);
            } else {
                this.f = AndroidUtilities.dp(14.0f);
            }
            t70Var.getClass();
            int dp3 = AndroidUtilities.dp(f7) + i12;
            this.e = dp3;
            TL_iv.pageBlockBlockquote pageblockblockquote2 = this.n;
            c3 q10 = j4.q(this.a, this, null, pageblockblockquote2.caption, i13, dp3, pageblockblockquote2, this.b);
            this.d = q10;
            if (q10 != null) {
                t70Var.getClass();
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(f7);
            }
            if (i12 != 0) {
                t70Var.getClass();
                i12 += AndroidUtilities.dp(f7);
            }
            c3 c3Var = this.c;
            if (c3Var != null) {
                c3Var.s = this.f;
                c3Var.v = this.h;
            }
            c3 c3Var2 = this.d;
            if (c3Var2 != null) {
                c3Var2.s = this.f;
                c3Var2.v = this.e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (j4.l(this.a, this.b, motionEvent, this, this.c, this.f, this.h)) {
            return true;
        }
        return j4.l(this.a, this.b, motionEvent, this, this.d, this.f, this.e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockBlockquote pageblockblockquote) {
        this.n = pageblockblockquote;
        requestLayout();
    }
}
