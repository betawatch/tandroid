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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h2 extends View implements org.telegram.ui.Cells.j9 {
    public final m60 a;
    public final f4 b;
    public z2 c;
    public z2 d;
    public boolean e;
    public boolean f;
    public final ImageReceiver h;
    public b4 n;
    public TLObject r;
    public final int s;
    public final int w;
    public int x;

    public h2(Context context, m60 m60Var, f4 f4Var) {
        super(context);
        this.s = org.telegram.messenger.i0.L(18.0f);
        this.w = org.telegram.messenger.i0.L(10.0f);
        this.a = m60Var;
        this.b = f4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.h = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.i0.L(6.0f));
    }

    @Override // org.telegram.ui.Cells.j9
    public final void h(ArrayList arrayList) {
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
        int i10;
        if (this.n == null) {
            return;
        }
        if (this.f) {
            this.h.h(canvas, null);
        }
        canvas.save();
        canvas.translate(this.s, org.telegram.messenger.i0.L(10.0f));
        z2 z2Var = this.c;
        m60 m60Var = this.a;
        int i11 = 0;
        if (z2Var != null) {
            h4.t(m60Var, canvas, this, 0);
            this.c.d(canvas, this);
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (this.d != null) {
            canvas.translate(0.0f, this.x);
            h4.t(m60Var, canvas, this, i10);
            this.d.d(canvas, this);
        }
        canvas.restore();
        if (this.e) {
            f4 f4Var = this.b;
            float L = (f4Var == null || !f4Var.G) ? org.telegram.messenger.i0.L(17.0f) : 0.0f;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (f4Var != null && f4Var.G) {
                i11 = org.telegram.messenger.i0.L(17.0f);
            }
            canvas.drawLine(L, measuredHeight, measuredWidth - i11, getMeasuredHeight() - 1, h4.s1);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence h;
        CharSequence h10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        z2 z2Var = this.c;
        f4 f4Var = this.b;
        m60 m60Var = this.a;
        if (z2Var != null && (h10 = h4.h(m60Var, f4Var, z2Var)) != null) {
            spannableStringBuilder.append(h10);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null && (h = h4.h(m60Var, f4Var, z2Var2)) != null) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append(h);
        }
        if (spannableStringBuilder.length() == 0) {
            return;
        }
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) org.telegram.messenger.cd.L0(2131754858, null));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        ImageReceiver imageReceiver;
        int i12;
        int i13;
        int i14;
        float f7;
        int i15;
        int i16;
        String format;
        int size = View.MeasureSpec.getSize(i10);
        b4 b4Var = this.n;
        this.e = b4Var.b != b4Var.a.articles.size() - 1;
        b4 b4Var2 = this.n;
        TL_iv.pageRelatedArticle pagerelatedarticle = b4Var2.a.articles.get(b4Var2.b);
        int L = org.telegram.messenger.i0.L(org.telegram.messenger.tz.Z0 - 16);
        long j10 = pagerelatedarticle.photo_id;
        f4 f4Var = this.b;
        TLRPC.Photo e = j10 != 0 ? f4Var != null ? e4.e(f4Var.E, j10) : e4.d(j10, this.r) : null;
        ImageReceiver imageReceiver2 = this.h;
        if (e != null) {
            this.f = true;
            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(e.sizes, org.telegram.messenger.i0.Z0(false), false, null, false);
            TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(e.sizes, 80, true, null, false);
            if (w9 == w10) {
                w10 = null;
            }
            imageReceiver2.r0(org.telegram.messenger.ic.i(w9, e), "64_64", org.telegram.messenger.ic.i(w10, e), "64_64_b", null, w9.size, null, this.r, 1);
            imageReceiver = imageReceiver2;
        } else {
            imageReceiver = imageReceiver2;
            this.f = false;
        }
        int L2 = org.telegram.messenger.i0.L(60.0f);
        int L3 = size - org.telegram.messenger.i0.L(36.0f);
        if (this.f) {
            float L4 = org.telegram.messenger.i0.L(44.0f);
            imageReceiver.y0((size - r5) - org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), L4, L4);
            L3 = (int) (L3 - (imageReceiver.M0 + org.telegram.messenger.i0.L(6.0f)));
        }
        int L5 = org.telegram.messenger.i0.L(18.0f);
        String str = pagerelatedarticle.title;
        if (str != null) {
            i13 = L3;
            i14 = 1;
            i12 = L2;
            f7 = 6.0f;
            this.c = h4.n(this.a, this, str, null, i13, this.w, this.n, Layout.Alignment.ALIGN_NORMAL, 3, this.b);
        } else {
            i12 = L2;
            i13 = L3;
            i14 = 1;
            f7 = 6.0f;
        }
        z2 z2Var = this.c;
        int i17 = this.s;
        int i18 = this.w;
        if (z2Var != null) {
            int lineCount = z2Var.d.getLineCount();
            i15 = 4 - lineCount;
            this.x = org.telegram.messenger.m5.C(f7, this.c.d.getHeight(), L);
            L5 = this.c.d.getHeight() + L5;
            int i19 = 0;
            while (true) {
                if (i19 >= lineCount) {
                    i16 = 0;
                    break;
                } else {
                    if (this.c.d.getLineLeft(i19) != 0.0f) {
                        i16 = i14;
                        break;
                    }
                    i19++;
                }
            }
            z2 z2Var2 = this.c;
            z2Var2.s = i17;
            z2Var2.w = i18;
        } else {
            this.x = 0;
            i15 = 4;
            i16 = 0;
        }
        int i20 = i15;
        if (pagerelatedarticle.published_date != 0 && !TextUtils.isEmpty(pagerelatedarticle.author)) {
            String format2 = org.telegram.messenger.cd.D0().h0().format(pagerelatedarticle.published_date * 1000);
            String str2 = pagerelatedarticle.author;
            Object[] objArr = new Object[2];
            objArr[0] = format2;
            objArr[i14] = str2;
            format = org.telegram.messenger.cd.a0(null, null, 2131754040, objArr);
        } else if (TextUtils.isEmpty(pagerelatedarticle.author)) {
            format = pagerelatedarticle.published_date != 0 ? org.telegram.messenger.cd.D0().h0().format(pagerelatedarticle.published_date * 1000) : !TextUtils.isEmpty(pagerelatedarticle.description) ? pagerelatedarticle.description : pagerelatedarticle.url;
        } else {
            Object[] objArr2 = new Object[i14];
            objArr2[0] = pagerelatedarticle.author;
            format = org.telegram.messenger.cd.a0(null, null, 2131754056, objArr2);
        }
        z2 n10 = h4.n(this.a, this, format, null, i13, this.x + i18, this.n, ((f4Var == null || !f4Var.G) && i16 == 0) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.ov0.a(), i20, this.b);
        this.d = n10;
        if (n10 != null) {
            int height = n10.d.getHeight() + L5;
            if (this.c != null) {
                height = org.telegram.messenger.m5.C(f7, L, height);
            }
            L5 = height;
            z2 z2Var3 = this.d;
            z2Var3.s = i17;
            z2Var3.w = i18 + this.x;
        }
        setMeasuredDimension(size, Math.max(i12, L5) + (this.e ? 1 : 0));
    }
}
