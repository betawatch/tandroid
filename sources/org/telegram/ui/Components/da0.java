package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class da0 extends FrameLayout implements org.telegram.messenger.us, org.telegram.ui.ActionBar.k6 {
    public int D;
    public int E;
    public int F;
    public CharSequence G;
    public int H;
    public SpannableStringBuilder I;
    public int J;
    public boolean K;
    public ValueAnimator L;
    public float M;
    public Rect N;
    public Rect O;
    public final int a;
    public TLRPC.InputStickerSet b;
    public final Rect c;
    public f5 d;
    public boolean e;
    public final t80 f;
    public final TextPaint h;
    public final CharSequence n;
    public StaticLayout r;
    public final String s;
    public SpannableStringBuilder w;
    public StaticLayout x;
    public int y;

    public da0(int i10, int i11, Context context, ArrayList arrayList, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        String str;
        TLRPC.Document document;
        TLRPC.TL_messages_stickerSet m0;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList2;
        this.c = new Rect();
        this.e = false;
        this.J = -1;
        this.K = true;
        this.M = 0.0f;
        this.a = i10;
        int i12 = org.telegram.ui.ActionBar.t6.i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i12, p6Var), 0, 16);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
        setBackground(a02);
        org.telegram.ui.ActionBar.a7.k(this, a02, null, N, p6Var);
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        textPaint.setTextSize(org.telegram.messenger.i0.L(13.0f));
        textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.E8, p6Var));
        int i13 = 2;
        if (arrayList.size() > 1) {
            SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(i11 == 0 ? org.telegram.messenger.cd.G(arrayList.size(), "MessageContainsEmojiPacks", new Object[0]) : org.telegram.messenger.cd.G(arrayList.size(), "MessageContainsReactionsPacks", new Object[0]));
            this.n = W2;
            x41[] x41VarArr = (x41[]) W2.getSpans(0, W2.length(), x41.class);
            for (int i14 = 0; x41VarArr != null && i14 < x41VarArr.length; i14++) {
                int spanStart = W2.getSpanStart(x41VarArr[i14]);
                int spanEnd = W2.getSpanEnd(x41VarArr[i14]);
                W2.removeSpan(x41VarArr[i14]);
                W2.setSpan(new bi.m6(this, i13), spanStart, spanEnd, 33);
            }
            return;
        }
        if (arrayList.size() != 1) {
            if (i11 == 4) {
                this.n = org.telegram.messenger.i0.R2(org.telegram.messenger.cd.L0(2131744883, null), org.telegram.ui.ActionBar.t6.Uc, 2, null, p6Var);
                return;
            }
            return;
        }
        String L0 = i11 == 0 ? org.telegram.messenger.cd.L0(2131748612, null) : i11 == 3 ? org.telegram.messenger.cd.L0(2131748608, null) : org.telegram.messenger.cd.L0(2131748607, null);
        String[] split = L0.split("%s");
        if (split.length <= 1) {
            this.n = L0;
            return;
        }
        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) arrayList.get(0);
        this.b = inputStickerSet;
        if (inputStickerSet == null || (m0 = org.telegram.messenger.ui.b0(i10).m0(this.b, false)) == null || (stickerSet = m0.set) == null) {
            str = null;
            document = null;
        } else {
            str = stickerSet.title;
            int i15 = 0;
            while (true) {
                ArrayList<TLRPC.Document> arrayList3 = m0.documents;
                if (arrayList3 == null || i15 >= arrayList3.size()) {
                    break;
                }
                if (m0.documents.get(i15).id == m0.set.thumb_document_id) {
                    document = m0.documents.get(i15);
                    break;
                }
                i15++;
            }
            document = null;
            if (document == null && (arrayList2 = m0.documents) != null && arrayList2.size() > 0) {
                document = m0.documents.get(0);
            }
        }
        if (str == null || document == null) {
            this.n = split[0];
            this.s = split[1];
            t80 t80Var = new t80(p6Var);
            this.f = t80Var;
            t80Var.l = org.telegram.ui.ActionBar.t6.G8;
            t80Var.m = org.telegram.ui.ActionBar.t6.i6;
            t80Var.k(4.0f);
            return;
        }
        SpannableString spannableString = new SpannableString(org.telegram.messenger.jj.U(document));
        spannableString.setSpan(new ba0(this, document, this.h.getFontMetricsInt()), 0, spannableString.length(), 33);
        f5 l4 = f5.l(i10, 0, document);
        this.d = l4;
        org.telegram.ui.ActionBar.a7.y(this, l4, org.telegram.ui.ActionBar.t6.n6, p6Var, PorterDuff.Mode.SRC_IN);
        this.d.a(this);
        SpannableString spannableString2 = new SpannableString(str);
        spannableString2.setSpan(new bi.m6(this, i13), 0, spannableString2.length(), 33);
        this.n = new SpannableStringBuilder().append((CharSequence) split[0]).append((CharSequence) spannableString).append(' ').append((CharSequence) spannableString2).append((CharSequence) split[1]);
        this.M = 1.0f;
        this.b = null;
    }

    public final int a(int i10, boolean z10) {
        int i11;
        float f7;
        if (i10 <= 0) {
            return 0;
        }
        CharSequence charSequence = this.G;
        TextPaint textPaint = this.h;
        CharSequence charSequence2 = this.n;
        if (charSequence2 != charSequence || this.F != i10) {
            if (charSequence2 != null) {
                StaticLayout staticLayout = new StaticLayout(charSequence2, 0, charSequence2.length(), textPaint, Math.max(i10, 0), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.r = staticLayout;
                t80 t80Var = this.f;
                if (t80Var != null && this.O == null) {
                    int lineCount = staticLayout.getLineCount() - 1;
                    this.y = org.telegram.messenger.i0.L(2.0f) + ((int) this.r.getPrimaryHorizontal(charSequence2.length()));
                    this.D = this.r.getLineTop(lineCount);
                    this.E = r3 - this.D;
                    float min = Math.min(org.telegram.messenger.i0.L(100.0f), this.r.getWidth() - this.y);
                    if (this.N == null) {
                        this.N = new Rect();
                    }
                    Rect rect = this.N;
                    int i12 = this.y;
                    rect.set(i12, this.D, (int) (i12 + min), r3);
                    t80Var.setBounds(this.N);
                    this.e = true;
                }
            } else {
                this.r = null;
                this.e = false;
            }
            this.G = charSequence2;
            this.F = i10;
        }
        SpannableStringBuilder spannableStringBuilder = this.w;
        if (spannableStringBuilder != this.I || this.H != i10) {
            if (spannableStringBuilder != null) {
                SpannableStringBuilder spannableStringBuilder2 = this.w;
                i11 = i10;
                this.x = new StaticLayout(spannableStringBuilder2, 0, spannableStringBuilder2.length(), textPaint, i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                i11 = i10;
                this.x = null;
            }
            this.I = this.w;
            this.H = i11;
        }
        StaticLayout staticLayout2 = this.r;
        int height = staticLayout2 != null ? staticLayout2.getHeight() : 0;
        if (this.x != null) {
            f7 = (r14.getHeight() - this.E) * (z10 ? 1.0f : this.M);
        } else {
            f7 = 0.0f;
        }
        return height + ((int) f7);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.E8));
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0049, code lost:
    
        r2 = null;
     */
    @Override // org.telegram.messenger.us
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        TLRPC.Document document;
        ArrayList<TLRPC.Document> arrayList;
        if (i10 != org.telegram.messenger.zs.B0 || this.b == null) {
            return;
        }
        int i12 = this.a;
        TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.ui.b0(i12).m0(this.b, false);
        if (m0 == null) {
            return;
        }
        TLRPC.StickerSet stickerSet = m0.set;
        if (stickerSet != null) {
            str = stickerSet.title;
            int i13 = 0;
            while (true) {
                ArrayList<TLRPC.Document> arrayList2 = m0.documents;
                if (arrayList2 == null || i13 >= arrayList2.size()) {
                    break;
                }
                if (m0.documents.get(i13).id == m0.set.thumb_document_id) {
                    document = m0.documents.get(i13);
                    break;
                }
                i13++;
            }
            if (document == null && (arrayList = m0.documents) != null && arrayList.size() > 0) {
                document = m0.documents.get(0);
            }
        } else {
            str = null;
            document = null;
        }
        if (str == null || document == null) {
            return;
        }
        f5 l4 = f5.l(i12, 0, document);
        this.d = l4;
        l4.a(this);
        invalidate();
        SpannableString spannableString = new SpannableString(" ");
        spannableString.setSpan(new mg.d2(this, 2), 0, 1, 33);
        SpannableString spannableString2 = new SpannableString(org.telegram.messenger.jj.U(document));
        spannableString2.setSpan(new ca0(this, document, this.h.getFontMetricsInt()), 0, spannableString2.length(), 33);
        SpannableString spannableString3 = new SpannableString(str);
        spannableString3.setSpan(new bi.m6(this, 2), 0, spannableString3.length(), 33);
        this.w = new SpannableStringBuilder().append((CharSequence) spannableString).append((CharSequence) spannableString2).append(' ').append((CharSequence) spannableString3).append((CharSequence) this.s);
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int a2 = a((this.J - getPaddingLeft()) - getPaddingRight(), true);
        if (this.N != null && this.x != null) {
            if (this.O == null) {
                this.O = new Rect();
            }
            StaticLayout staticLayout = this.x;
            float primaryHorizontal = staticLayout.getPrimaryHorizontal(staticLayout.getLineEnd(0));
            Rect rect = this.O;
            Rect rect2 = this.N;
            rect.set(rect2.left, rect2.top, (int) primaryHorizontal, rect2.bottom);
        }
        this.b = null;
        ValueAnimator valueAnimator = this.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        boolean z10 = Math.abs(measuredHeight - a2) > org.telegram.messenger.i0.L(3.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M, 1.0f);
        this.L = ofFloat;
        ofFloat.addUpdateListener(new jg.o0(6, this, z10));
        this.L.setInterpolator(gr.h);
        this.L.setStartDelay(150L);
        this.L.setDuration(400L);
        this.L.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f5 f5Var = this.d;
        if (f5Var != null) {
            f5Var.a(this);
        }
        org.telegram.messenger.zs.f(this.a).c(this, org.telegram.messenger.zs.B0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f5 f5Var = this.d;
        if (f5Var != null) {
            f5Var.n(this);
        }
        org.telegram.messenger.zs.f(this.a).n(this, org.telegram.messenger.zs.B0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Rect rect;
        super.onDraw(canvas);
        if (this.r != null) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            TextPaint textPaint = this.h;
            textPaint.setAlpha(org.telegram.messenger.zs.e4);
            this.r.draw(canvas);
            t80 t80Var = this.f;
            if (t80Var != null && this.e) {
                t80Var.setAlpha((int) ((1.0f - this.M) * 255.0f));
                Rect rect2 = this.N;
                if (rect2 != null && (rect = this.O) != null) {
                    float f7 = this.M;
                    Rect rect3 = org.telegram.messenger.i0.Q;
                    org.telegram.messenger.i0.X1(rect2, rect, f7, rect3);
                    t80Var.setBounds(rect3);
                }
                t80Var.draw(canvas);
                invalidate();
            }
            if (this.x != null) {
                canvas.save();
                canvas.translate(0.0f, this.D);
                textPaint.setAlpha((int) (this.M * 255.0f));
                this.x.draw(canvas);
                canvas.restore();
            }
            f5 f5Var = this.d;
            if (f5Var != null) {
                f5Var.setAlpha((int) (this.M * 255.0f));
                this.d.setBounds(this.c);
                this.d.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        setPadding(org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(8.0f));
        int size = View.MeasureSpec.getSize(i10);
        if (this.K && (i12 = this.J) > 0) {
            size = Math.min(size, i12);
        }
        this.J = size;
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        if (paddingLeft < 0) {
            paddingLeft = 0;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + a(paddingLeft, false), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        TextPaint textPaint = this.h;
        if (textPaint != null) {
            try {
                int alpha = textPaint.getAlpha();
                textPaint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.E8, false));
                textPaint.setAlpha(alpha);
                invalidate();
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }
}
