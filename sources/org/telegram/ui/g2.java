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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class g2 extends View implements org.telegram.ui.Cells.h9 {
    public final q50 a;
    public final e4 b;
    public z2 c;
    public z2 d;
    public boolean e;
    public boolean f;
    public final ImageReceiver h;
    public a4 n;
    public TLObject r;
    public final int s;
    public final int w;
    public int x;

    public g2(Context context, q50 q50Var, e4 e4Var) {
        super(context);
        this.s = org.telegram.messenger.g0.L(18.0f);
        this.w = org.telegram.messenger.g0.L(10.0f);
        this.a = q50Var;
        this.b = e4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.h = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
    }

    @Override // org.telegram.ui.Cells.h9
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            arrayList.add(z2Var2);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.c;
        if (z2Var != null) {
            z2Var.i(this);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            z2Var2.i(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.c;
        if (z2Var != null) {
            z2Var.f(this);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            z2Var2.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i7;
        if (this.n == null) {
            return;
        }
        if (this.f) {
            this.h.h(canvas, null);
        }
        canvas.save();
        canvas.translate(this.s, org.telegram.messenger.g0.L(10.0f));
        z2 z2Var = this.c;
        q50 q50Var = this.a;
        int i10 = 0;
        if (z2Var != null) {
            g4.t(q50Var, canvas, this, 0);
            this.c.d(canvas, this);
            i7 = 1;
        } else {
            i7 = 0;
        }
        if (this.d != null) {
            canvas.translate(0.0f, this.x);
            g4.t(q50Var, canvas, this, i7);
            this.d.d(canvas, this);
        }
        canvas.restore();
        if (this.e) {
            e4 e4Var = this.b;
            float L = (e4Var == null || !e4Var.G) ? org.telegram.messenger.g0.L(17.0f) : 0.0f;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (e4Var != null && e4Var.G) {
                i10 = org.telegram.messenger.g0.L(17.0f);
            }
            canvas.drawLine(L, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, g4.s1);
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
        z2 z2Var = this.c;
        e4 e4Var = this.b;
        q50 q50Var = this.a;
        if (z2Var != null && (h7 = g4.h(q50Var, e4Var, z2Var)) != null) {
            spannableStringBuilder.append(h7);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null && (h = g4.h(q50Var, e4Var, z2Var2)) != null) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append(h);
        }
        if (spannableStringBuilder.length() == 0) {
            return;
        }
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) org.telegram.messenger.id.M0(2131754858, null));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        ImageReceiver imageReceiver;
        int i11;
        int i12;
        int i13;
        float f10;
        int i14;
        int i15;
        String format;
        int size = View.MeasureSpec.getSize(i7);
        a4 a4Var = this.n;
        this.e = a4Var.b != a4Var.a.articles.size() - 1;
        a4 a4Var2 = this.n;
        TL_iv.pageRelatedArticle pagerelatedarticle = a4Var2.a.articles.get(a4Var2.b);
        int L = org.telegram.messenger.g0.L(org.telegram.messenger.iz.Z0 - 16);
        long j3 = pagerelatedarticle.photo_id;
        e4 e4Var = this.b;
        TLRPC.Photo e10 = j3 != 0 ? e4Var != null ? d4.e(e4Var.E, j3) : d4.d(j3, this.r) : null;
        ImageReceiver imageReceiver2 = this.h;
        if (e10 != null) {
            this.f = true;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(e10.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(e10.sizes, 80, true, null, false);
            if (w10 == w11) {
                w11 = null;
            }
            imageReceiver2.r0(org.telegram.messenger.hc.i(w10, e10), "64_64", org.telegram.messenger.hc.i(w11, e10), "64_64_b", null, w10.size, null, this.r, 1);
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
            L3 = (int) (L3 - (imageReceiver.M0 + org.telegram.messenger.g0.L(6.0f)));
        }
        int L5 = org.telegram.messenger.g0.L(18.0f);
        String str = pagerelatedarticle.title;
        if (str != null) {
            i12 = L3;
            i13 = 1;
            i11 = L2;
            f10 = 6.0f;
            this.c = g4.n(this.a, this, str, null, i12, this.w, this.n, Layout.Alignment.ALIGN_NORMAL, 3, this.b);
        } else {
            i11 = L2;
            i12 = L3;
            i13 = 1;
            f10 = 6.0f;
        }
        z2 z2Var = this.c;
        int i16 = this.s;
        int i17 = this.w;
        if (z2Var != null) {
            int lineCount = z2Var.d.getLineCount();
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
            z2 z2Var2 = this.c;
            z2Var2.s = i16;
            z2Var2.w = i17;
        } else {
            this.x = 0;
            i14 = 4;
            i15 = 0;
        }
        int i19 = i14;
        if (pagerelatedarticle.published_date != 0 && !TextUtils.isEmpty(pagerelatedarticle.author)) {
            String format2 = org.telegram.messenger.id.E0().h0().format(pagerelatedarticle.published_date * 1000);
            String str2 = pagerelatedarticle.author;
            Object[] objArr = new Object[2];
            objArr[0] = format2;
            objArr[i13] = str2;
            format = org.telegram.messenger.id.a0(null, null, 2131754040, objArr);
        } else if (TextUtils.isEmpty(pagerelatedarticle.author)) {
            format = pagerelatedarticle.published_date != 0 ? org.telegram.messenger.id.E0().h0().format(pagerelatedarticle.published_date * 1000) : !TextUtils.isEmpty(pagerelatedarticle.description) ? pagerelatedarticle.description : pagerelatedarticle.url;
        } else {
            Object[] objArr2 = new Object[i13];
            objArr2[0] = pagerelatedarticle.author;
            format = org.telegram.messenger.id.a0(null, null, 2131754056, objArr2);
        }
        z2 n10 = g4.n(this.a, this, format, null, i12, this.x + i17, this.n, ((e4Var == null || !e4Var.G) && i15 == 0) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.ou0.a(), i19, this.b);
        this.d = n10;
        if (n10 != null) {
            int height = n10.d.getHeight() + L5;
            if (this.c != null) {
                height = org.telegram.messenger.k5.C(f10, L, height);
            }
            L5 = height;
            z2 z2Var3 = this.d;
            z2Var3.s = i16;
            z2Var3.w = i17 + this.x;
        }
        setMeasuredDimension(size, Math.max(i11, L5) + (this.e ? 1 : 0));
    }
}
