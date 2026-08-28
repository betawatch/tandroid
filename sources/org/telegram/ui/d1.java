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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d1 extends View implements org.telegram.ui.Cells.m9, h3 {
    public final a70 a;
    public final j4 b;
    public e3 c;
    public int d;
    public final int e;
    public TL_iv.pageBlockAuthorDate f;

    public d1(Context context, a70 a70Var, j4 j4Var) {
        super(context);
        this.e = AndroidUtilities.dp(8.0f);
        this.a = a70Var;
        this.b = j4Var;
    }

    @Override // org.telegram.ui.Cells.m9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        e3 e3Var = this.c;
        if (e3Var != null) {
            arrayList.add(e3Var);
        }
    }

    @Override // org.telegram.ui.h3
    public int getBoundLeft() {
        e3 e3Var = this.c;
        if (e3Var == null) {
            return -1;
        }
        int a2 = e3Var.a() + e3Var.s;
        this.a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override // org.telegram.ui.h3
    public int getBoundRight() {
        e3 e3Var = this.c;
        if (e3Var == null) {
            return -1;
        }
        int b10 = e3Var.b() + e3Var.s;
        this.a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override // org.telegram.ui.h3
    public int getLastLineBoundRight() {
        e3 e3Var = this.c;
        if (e3Var == null) {
            return -1;
        }
        int c10 = e3Var.c() + e3Var.s;
        this.a.getClass();
        return AndroidUtilities.dp(18) + c10;
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
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e3 e3Var = this.c;
        if (e3Var != null) {
            e3Var.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f == null || this.c == null) {
            return;
        }
        canvas.save();
        canvas.translate(this.d, this.e);
        l4.v(this.a, canvas, this, 0);
        this.c.draw(canvas, this);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        e3 e3Var = this.c;
        if (e3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.j(this.a, this.b, e3Var));
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
    public final void onMeasure(int i9, int i10) {
        int i11;
        TLRPC.WebPage webPage;
        Spannable spannable;
        int indexOf;
        int size = View.MeasureSpec.getSize(i9);
        TL_iv.pageBlockAuthorDate pageblockauthordate = this.f;
        int i12 = 1;
        if (pageblockauthordate != null) {
            TL_iv.RichText richText = pageblockauthordate.author;
            j4 j4Var = this.b;
            MetricAffectingSpan[] metricAffectingSpanArr = null;
            if (j4Var != null) {
                HashSet hashSet = l4.X0;
                webPage = j4Var.A;
            } else {
                webPage = null;
            }
            CharSequence C = l4.C(this.a, webPage, this, richText, richText, pageblockauthordate, size);
            i11 = size;
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
                        for (int i13 = 0; i13 < metricAffectingSpanArr.length; i13++) {
                            MetricAffectingSpan metricAffectingSpan = metricAffectingSpanArr[i13];
                            formatString.setSpan(metricAffectingSpan, spannable.getSpanStart(metricAffectingSpan) + indexOf, spannable.getSpanEnd(metricAffectingSpanArr[i13]) + indexOf, 33);
                        }
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            e3 q10 = l4.q(this.a, this, formatString, null, i11 - AndroidUtilities.dp(36.0f), this.e, this.f, this.b);
            this.c = q10;
            if (q10 != null) {
                int height = this.c.d.getHeight() + AndroidUtilities.dp(16.0f);
                if (j4Var == null || !j4Var.C) {
                    this.d = AndroidUtilities.dp(18.0f);
                } else {
                    this.d = (int) Math.floor(((i11 - this.c.d.getLineLeft(0)) - this.c.d.getLineWidth(0)) - AndroidUtilities.dp(16.0f));
                }
                e3 e3Var = this.c;
                e3Var.s = this.d;
                e3Var.v = this.e;
                i12 = height;
            } else {
                i12 = 0;
            }
        } else {
            i11 = size;
        }
        setMeasuredDimension(i11, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return l4.l(this.a, this.b, motionEvent, this, this.c, this.d, this.e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockAuthorDate pageblockauthordate) {
        this.f = pageblockauthordate;
        requestLayout();
    }
}
