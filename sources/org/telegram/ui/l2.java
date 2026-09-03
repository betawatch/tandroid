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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class l2 extends View implements org.telegram.ui.Cells.k9, i3 {
    public final p70 a;
    public final l4 b;
    public f3 c;
    public f3 d;
    public int e;
    public int f;
    public int h;
    public TL_iv.pageBlockPullquote n;

    public l2(Context context, p70 p70Var, l4 l4Var) {
        super(context);
        this.a = p70Var;
        this.b = l4Var;
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

    @Override // org.telegram.ui.i3
    public int getBoundLeft() {
        int i10;
        f3 f3Var = this.c;
        if (f3Var != null) {
            i10 = Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, f3Var.a() + f3Var.s);
        } else {
            i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            i10 = Math.min(i10, f3Var2.a() + f3Var2.s);
        }
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        this.a.getClass();
        return i10 - AndroidUtilities.dp(18);
    }

    @Override // org.telegram.ui.i3
    public int getBoundRight() {
        int i10;
        f3 f3Var = this.c;
        if (f3Var != null) {
            i10 = Math.max(TLObject.FLAG_31, f3Var.b() + f3Var.s);
        } else {
            i10 = TLObject.FLAG_31;
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            i10 = Math.max(i10, f3Var2.b() + f3Var2.s);
        }
        if (i10 == Integer.MIN_VALUE) {
            return -1;
        }
        this.a.getClass();
        return AndroidUtilities.dp(18) + i10;
    }

    @Override // org.telegram.ui.i3
    public int getLastLineBoundRight() {
        int c3;
        int dp;
        f3 f3Var = this.d;
        p70 p70Var = this.a;
        if (f3Var != null) {
            c3 = f3Var.c() + f3Var.s;
            p70Var.getClass();
            dp = AndroidUtilities.dp(18);
        } else {
            f3 f3Var2 = this.c;
            if (f3Var2 == null) {
                return -1;
            }
            c3 = f3Var2.c() + f3Var2.s;
            p70Var.getClass();
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
        p70 p70Var = this.a;
        int i10 = 0;
        if (f3Var != null) {
            canvas.save();
            canvas.translate(this.f, this.h);
            n4.v(p70Var, canvas, this, 0);
            this.c.draw(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f, this.e);
            n4.v(p70Var, canvas, this, i10);
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
        f3 f3Var = this.c;
        l4 l4Var = this.b;
        p70 p70Var = this.a;
        if (f3Var != null && (j11 = n4.j(p70Var, l4Var, f3Var)) != null) {
            spannableStringBuilder.append(j11);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null && (j10 = n4.j(p70Var, l4Var, f3Var2)) != null) {
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
        int size = View.MeasureSpec.getSize(i10);
        p70 p70Var = this.a;
        p70Var.getClass();
        this.f = AndroidUtilities.dp(18);
        p70Var.getClass();
        float f10 = 8;
        this.h = AndroidUtilities.dp(f10);
        TL_iv.pageBlockPullquote pageblockpullquote = this.n;
        if (pageblockpullquote != null) {
            TL_iv.RichText richText = pageblockpullquote.text;
            p70 p70Var2 = this.a;
            p70Var2.getClass();
            float f11 = 36;
            f3 q10 = n4.q(p70Var2, this, null, richText, size - AndroidUtilities.dp(f11), this.h, this.n, this.b);
            this.c = q10;
            if (q10 != null) {
                p70Var.getClass();
                int height = this.c.d.getHeight() + AndroidUtilities.dp(f10);
                f3 f3Var = this.c;
                f3Var.s = this.f;
                f3Var.v = this.h;
                i12 = height;
            } else {
                i12 = 0;
            }
            this.e = AndroidUtilities.dp(2.0f) + i12;
            TL_iv.RichText richText2 = this.n.caption;
            p70 p70Var3 = this.a;
            p70Var3.getClass();
            f3 q11 = n4.q(p70Var3, this, null, richText2, size - AndroidUtilities.dp(f11), this.e, this.n, this.b);
            this.d = q11;
            if (q11 != null) {
                p70Var.getClass();
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(f10);
                f3 f3Var2 = this.d;
                f3Var2.s = this.f;
                f3Var2.v = this.e;
            }
            if (i12 != 0) {
                p70Var.getClass();
                i12 += AndroidUtilities.dp(f10);
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (n4.l(this.a, this.b, motionEvent, this, this.c, this.f, this.h)) {
            return true;
        }
        return n4.l(this.a, this.b, motionEvent, this, this.d, this.f, this.e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockPullquote pageblockpullquote) {
        this.n = pageblockpullquote;
        requestLayout();
    }
}
