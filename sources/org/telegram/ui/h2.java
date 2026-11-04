package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h2 extends View implements org.telegram.ui.Cells.g9 {
    public final i50 a;
    public final g4 b;
    public a3 c;
    public a3 d;
    public boolean e;
    public boolean f;
    public final ImageReceiver h;
    public b4 n;
    public TLObject r;
    public final int s;
    public final int w;
    public int x;

    public h2(Context context, i50 i50Var, g4 g4Var) {
        super(context);
        this.s = org.telegram.messenger.g0.L(18.0f);
        this.w = org.telegram.messenger.g0.L(10.0f);
        this.a = i50Var;
        this.b = g4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.h = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
    }

    @Override // org.telegram.ui.Cells.g9
    public final void k(ArrayList arrayList) {
        a3 a3Var = this.c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            arrayList.add(a3Var2);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.c;
        if (a3Var != null) {
            a3Var.i(this);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            a3Var2.i(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.c;
        if (a3Var != null) {
            a3Var.f(this);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            a3Var2.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i3;
        if (this.n == null) {
            return;
        }
        if (this.f) {
            this.h.h(canvas, null);
        }
        canvas.save();
        canvas.translate(this.s, org.telegram.messenger.g0.L(10.0f));
        a3 a3Var = this.c;
        i50 i50Var = this.a;
        int i10 = 0;
        if (a3Var != null) {
            i4.t(i50Var, canvas, this, 0);
            this.c.d(canvas, this);
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (this.d != null) {
            canvas.translate(0.0f, this.x);
            i4.t(i50Var, canvas, this, i3);
            this.d.d(canvas, this);
        }
        canvas.restore();
        if (this.e) {
            g4 g4Var = this.b;
            float L = (g4Var == null || !g4Var.H) ? org.telegram.messenger.g0.L(17.0f) : 0.0f;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (g4Var != null && g4Var.H) {
                i10 = org.telegram.messenger.g0.L(17.0f);
            }
            canvas.drawLine(L, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, i4.t1);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence h;
        CharSequence h7;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        a3 a3Var = this.c;
        g4 g4Var = this.b;
        i50 i50Var = this.a;
        if (a3Var != null && (h7 = i4.h(i50Var, g4Var, a3Var)) != null) {
            spannableStringBuilder.append(h7);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null && (h = i4.h(i50Var, g4Var, a3Var2)) != null) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append(h);
        }
        if (spannableStringBuilder.length() == 0) {
            return;
        }
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) org.telegram.messenger.bd.M0(2131754858, null));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        ImageReceiver imageReceiver;
        int i11;
        int i12;
        int i13;
        float f10;
        int i14;
        int i15;
        String format;
        int size = View.MeasureSpec.getSize(i3);
        b4 b4Var = this.n;
        this.e = b4Var.b != b4Var.a.articles.size() - 1;
        b4 b4Var2 = this.n;
        TL_iv.pageRelatedArticle pagerelatedarticle = b4Var2.a.articles.get(b4Var2.b);
        int L = org.telegram.messenger.g0.L(org.telegram.messenger.az.Z0 - 16);
        long j10 = pagerelatedarticle.photo_id;
        g4 g4Var = this.b;
        TLRPC.Photo e10 = j10 != 0 ? g4Var != null ? e4.e(g4Var.F, j10) : e4.d(j10, this.r) : null;
        ImageReceiver imageReceiver2 = this.h;
        if (e10 != null) {
            this.f = true;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(e10.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(e10.sizes, 80, true, null, false);
            if (w10 == w11) {
                w11 = null;
            }
            imageReceiver2.r0(org.telegram.messenger.ac.i(w10, e10), "64_64", org.telegram.messenger.ac.i(w11, e10), "64_64_b", null, w10.size, null, this.r, 1);
            imageReceiver = imageReceiver2;
        } else {
            imageReceiver = imageReceiver2;
            this.f = false;
        }
        int L2 = org.telegram.messenger.g0.L(60.0f);
        int L3 = size - org.telegram.messenger.g0.L(36.0f);
        if (this.f) {
            float L4 = org.telegram.messenger.g0.L(44.0f);
            imageReceiver.y0((size - r5) - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), L4, L4);
            L3 = (int) (L3 - (imageReceiver.N0 + org.telegram.messenger.g0.L(6.0f)));
        }
        int L5 = org.telegram.messenger.g0.L(18.0f);
        String str = pagerelatedarticle.title;
        if (str != null) {
            i12 = L3;
            i13 = 1;
            i11 = L2;
            f10 = 6.0f;
            this.c = i4.n(this.a, this, str, null, i12, this.w, this.n, Layout.Alignment.ALIGN_NORMAL, 3, this.b);
        } else {
            i11 = L2;
            i12 = L3;
            i13 = 1;
            f10 = 6.0f;
        }
        a3 a3Var = this.c;
        int i16 = this.s;
        int i17 = this.w;
        if (a3Var != null) {
            int lineCount = a3Var.d.getLineCount();
            i14 = 4 - lineCount;
            this.x = org.telegram.messenger.k5.C(f10, this.c.d.getHeight(), L);
            L5 = this.c.d.getHeight() + L5;
            int i18 = 0;
            while (true) {
                if (i18 >= lineCount) {
                    i15 = 0;
                    break;
                } else {
                    if (this.c.d.getLineLeft(i18) != 0.0f) {
                        i15 = i13;
                        break;
                    }
                    i18++;
                }
            }
            a3 a3Var2 = this.c;
            a3Var2.s = i16;
            a3Var2.w = i17;
        } else {
            this.x = 0;
            i14 = 4;
            i15 = 0;
        }
        int i19 = i14;
        if (pagerelatedarticle.published_date != 0 && !TextUtils.isEmpty(pagerelatedarticle.author)) {
            String format2 = org.telegram.messenger.bd.E0().h0().format(pagerelatedarticle.published_date * 1000);
            String str2 = pagerelatedarticle.author;
            Object[] objArr = new Object[2];
            objArr[0] = format2;
            objArr[i13] = str2;
            format = org.telegram.messenger.bd.a0(null, null, 2131754040, objArr);
        } else if (TextUtils.isEmpty(pagerelatedarticle.author)) {
            format = pagerelatedarticle.published_date != 0 ? org.telegram.messenger.bd.E0().h0().format(pagerelatedarticle.published_date * 1000) : !TextUtils.isEmpty(pagerelatedarticle.description) ? pagerelatedarticle.description : pagerelatedarticle.url;
        } else {
            Object[] objArr2 = new Object[i13];
            objArr2[0] = pagerelatedarticle.author;
            format = org.telegram.messenger.bd.a0(null, null, 2131754056, objArr2);
        }
        a3 n4 = i4.n(this.a, this, format, null, i12, this.x + i17, this.n, ((g4Var == null || !g4Var.H) && i15 == 0) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.lu0.a(), i19, this.b);
        this.d = n4;
        if (n4 != null) {
            int height = n4.d.getHeight() + L5;
            if (this.c != null) {
                height = org.telegram.messenger.k5.C(f10, L, height);
            }
            L5 = height;
            a3 a3Var3 = this.d;
            a3Var3.s = i16;
            a3Var3.w = i17 + this.x;
        }
        setMeasuredDimension(size, Math.max(i11, L5) + (this.e ? 1 : 0));
    }
}
