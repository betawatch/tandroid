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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class k2 extends View implements org.telegram.ui.Cells.m9, h3 {
    public final a70 a;
    public final j4 b;
    public e3 c;
    public e3 d;
    public int e;
    public int f;
    public int h;
    public TL_iv.pageBlockPullquote n;

    public k2(Context context, a70 a70Var, j4 j4Var) {
        super(context);
        this.a = a70Var;
        this.b = j4Var;
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

    @Override // org.telegram.ui.h3
    public int getBoundLeft() {
        int i9;
        e3 e3Var = this.c;
        if (e3Var != null) {
            i9 = Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, e3Var.a() + e3Var.s);
        } else {
            i9 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null) {
            i9 = Math.min(i9, e3Var2.a() + e3Var2.s);
        }
        if (i9 == Integer.MAX_VALUE) {
            return -1;
        }
        this.a.getClass();
        return i9 - AndroidUtilities.dp(18);
    }

    @Override // org.telegram.ui.h3
    public int getBoundRight() {
        int i9;
        e3 e3Var = this.c;
        if (e3Var != null) {
            i9 = Math.max(TLObject.FLAG_31, e3Var.b() + e3Var.s);
        } else {
            i9 = TLObject.FLAG_31;
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null) {
            i9 = Math.max(i9, e3Var2.b() + e3Var2.s);
        }
        if (i9 == Integer.MIN_VALUE) {
            return -1;
        }
        this.a.getClass();
        return AndroidUtilities.dp(18) + i9;
    }

    @Override // org.telegram.ui.h3
    public int getLastLineBoundRight() {
        int c10;
        int dp;
        e3 e3Var = this.d;
        a70 a70Var = this.a;
        if (e3Var != null) {
            c10 = e3Var.c() + e3Var.s;
            a70Var.getClass();
            dp = AndroidUtilities.dp(18);
        } else {
            e3 e3Var2 = this.c;
            if (e3Var2 == null) {
                return -1;
            }
            c10 = e3Var2.c() + e3Var2.s;
            a70Var.getClass();
            dp = AndroidUtilities.dp(18);
        }
        return dp + c10;
    }

    public /* bridge */ /* synthetic */ int getMinWidth() {
        return org.telegram.messenger.ll.b(this);
    }

    @Override // android.view.View
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

    @Override // android.view.View
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
        if (this.n == null) {
            return;
        }
        e3 e3Var = this.c;
        a70 a70Var = this.a;
        int i9 = 0;
        if (e3Var != null) {
            canvas.save();
            canvas.translate(this.f, this.h);
            l4.v(a70Var, canvas, this, 0);
            this.c.draw(canvas, this);
            canvas.restore();
            i9 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f, this.e);
            l4.v(a70Var, canvas, this, i9);
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
        e3 e3Var = this.c;
        j4 j4Var = this.b;
        a70 a70Var = this.a;
        if (e3Var != null && (j11 = l4.j(a70Var, j4Var, e3Var)) != null) {
            spannableStringBuilder.append(j11);
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null && (j10 = l4.j(a70Var, j4Var, e3Var2)) != null) {
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
    public final void onMeasure(int i9, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i9);
        a70 a70Var = this.a;
        a70Var.getClass();
        this.f = AndroidUtilities.dp(18);
        a70Var.getClass();
        float f10 = 8;
        this.h = AndroidUtilities.dp(f10);
        TL_iv.pageBlockPullquote pageblockpullquote = this.n;
        if (pageblockpullquote != null) {
            TL_iv.RichText richText = pageblockpullquote.text;
            a70 a70Var2 = this.a;
            a70Var2.getClass();
            float f11 = 36;
            e3 q10 = l4.q(a70Var2, this, null, richText, size - AndroidUtilities.dp(f11), this.h, this.n, this.b);
            this.c = q10;
            if (q10 != null) {
                a70Var.getClass();
                int height = this.c.d.getHeight() + AndroidUtilities.dp(f10);
                e3 e3Var = this.c;
                e3Var.s = this.f;
                e3Var.v = this.h;
                i11 = height;
            } else {
                i11 = 0;
            }
            this.e = AndroidUtilities.dp(2.0f) + i11;
            TL_iv.RichText richText2 = this.n.caption;
            a70 a70Var3 = this.a;
            a70Var3.getClass();
            e3 q11 = l4.q(a70Var3, this, null, richText2, size - AndroidUtilities.dp(f11), this.e, this.n, this.b);
            this.d = q11;
            if (q11 != null) {
                a70Var.getClass();
                i11 += this.d.d.getHeight() + AndroidUtilities.dp(f10);
                e3 e3Var2 = this.d;
                e3Var2.s = this.f;
                e3Var2.v = this.e;
            }
            if (i11 != 0) {
                a70Var.getClass();
                i11 += AndroidUtilities.dp(f10);
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
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
