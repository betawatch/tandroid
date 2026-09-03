package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class e1 extends View implements org.telegram.ui.Cells.k9, i3 {
    public final p70 a;
    public final l4 b;
    public f3 c;
    public int d;
    public final int e;
    public TL_iv.pageBlockAuthorDate f;

    public e1(Context context, p70 p70Var, l4 l4Var) {
        super(context);
        this.e = AndroidUtilities.dp(8.0f);
        this.a = p70Var;
        this.b = l4Var;
    }

    @Override // org.telegram.ui.Cells.k9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
    }

    @Override // org.telegram.ui.i3
    public int getBoundLeft() {
        f3 f3Var = this.c;
        if (f3Var == null) {
            return -1;
        }
        int a2 = f3Var.a() + f3Var.s;
        this.a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override // org.telegram.ui.i3
    public int getBoundRight() {
        f3 f3Var = this.c;
        if (f3Var == null) {
            return -1;
        }
        int b10 = f3Var.b() + f3Var.s;
        this.a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override // org.telegram.ui.i3
    public int getLastLineBoundRight() {
        f3 f3Var = this.c;
        if (f3Var == null) {
            return -1;
        }
        int c3 = f3Var.c() + f3Var.s;
        this.a.getClass();
        return AndroidUtilities.dp(18) + c3;
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
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f == null || this.c == null) {
            return;
        }
        canvas.save();
        canvas.translate(this.d, this.e);
        n4.v(this.a, canvas, this, 0);
        this.c.draw(canvas, this);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        f3 f3Var = this.c;
        if (f3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(n4.j(this.a, this.b, f3Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.text.Spannable$Factory] */
    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        TLRPC.WebPage webPage;
        Spannable spannable;
        int indexOf;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockAuthorDate pageblockauthordate = this.f;
        int i13 = 1;
        if (pageblockauthordate != null) {
            TL_iv.RichText richText = pageblockauthordate.author;
            l4 l4Var = this.b;
            MetricAffectingSpan[] metricAffectingSpanArr = null;
            if (l4Var != null) {
                HashSet hashSet = n4.Y0;
                webPage = l4Var.B;
            } else {
                webPage = null;
            }
            CharSequence C = n4.C(this.a, webPage, this, richText, richText, pageblockauthordate, size);
            i12 = size;
            if (C instanceof Spannable) {
                Spannable spannable2 = (Spannable) C;
                metricAffectingSpanArr = (MetricAffectingSpan[]) spannable2.getSpans(0, C.length(), MetricAffectingSpan.class);
                spannable = spannable2;
            } else {
                spannable = null;
            }
            CharSequence formatString = (this.f.published_date == 0 || TextUtils.isEmpty(C)) ? !TextUtils.isEmpty(C) ? LocaleController.formatString(R.string.ArticleByAuthor, C) : LocaleController.getInstance().getChatFullDate().format(this.f.published_date * 1000) : LocaleController.formatString(R.string.ArticleDateByAuthor, LocaleController.getInstance().getChatFullDate().format(this.f.published_date * 1000), C);
            if (metricAffectingSpanArr != null) {
                try {
                    if (metricAffectingSpanArr.length > 0 && (indexOf = TextUtils.indexOf((CharSequence) formatString, C)) != -1) {
                        formatString = Spannable.Factory.getInstance().newSpannable(formatString);
                        for (int i14 = 0; i14 < metricAffectingSpanArr.length; i14++) {
                            MetricAffectingSpan metricAffectingSpan = metricAffectingSpanArr[i14];
                            formatString.setSpan(metricAffectingSpan, spannable.getSpanStart(metricAffectingSpan) + indexOf, spannable.getSpanEnd(metricAffectingSpanArr[i14]) + indexOf, 33);
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            f3 q10 = n4.q(this.a, this, formatString, null, i12 - AndroidUtilities.dp(36.0f), this.e, this.f, this.b);
            this.c = q10;
            if (q10 != null) {
                int height = this.c.d.getHeight() + AndroidUtilities.dp(16.0f);
                if (l4Var == null || !l4Var.D) {
                    this.d = AndroidUtilities.dp(18.0f);
                } else {
                    this.d = (int) Math.floor(((i12 - this.c.d.getLineLeft(0)) - this.c.d.getLineWidth(0)) - AndroidUtilities.dp(16.0f));
                }
                f3 f3Var = this.c;
                f3Var.s = this.d;
                f3Var.v = this.e;
                i13 = height;
            } else {
                i13 = 0;
            }
        } else {
            i12 = size;
        }
        setMeasuredDimension(i12, i13);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return n4.l(this.a, this.b, motionEvent, this, this.c, this.d, this.e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockAuthorDate pageblockauthordate) {
        this.f = pageblockauthordate;
        requestLayout();
    }
}
