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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class y90 extends FrameLayout implements org.telegram.messenger.fs, org.telegram.ui.ActionBar.c6 {
    public int E;
    public int F;
    public int G;
    public CharSequence H;
    public int I;
    public SpannableStringBuilder J;
    public int K;
    public boolean L;
    public ValueAnimator M;
    public float N;
    public Rect O;
    public Rect P;
    public final int a;
    public TLRPC.InputStickerSet b;
    public final Rect c;
    public o5 d;
    public boolean e;
    public final o80 f;
    public final TextPaint h;
    public final CharSequence n;
    public StaticLayout r;
    public final String s;
    public SpannableStringBuilder w;
    public StaticLayout x;
    public int y;

    public y90(int i7, int i10, Context context, ArrayList arrayList, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        String str;
        TLRPC.Document document;
        TLRPC.TL_messages_stickerSet o02;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList2;
        this.c = new Rect();
        this.e = false;
        this.K = -1;
        this.L = true;
        this.N = 0.0f;
        this.a = i7;
        int i11 = org.telegram.ui.ActionBar.n6.i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.w0(i11, i6Var), 0, 16);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
        setBackground(a02);
        org.telegram.ui.ActionBar.u6.j(this, a02, null, M, i6Var);
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.E8, i6Var));
        int i12 = 2;
        if (arrayList.size() > 1) {
            SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(i10 == 0 ? org.telegram.messenger.gd.G(arrayList.size(), "MessageContainsEmojiPacks", new Object[0]) : org.telegram.messenger.gd.G(arrayList.size(), "MessageContainsReactionsPacks", new Object[0]));
            this.n = W2;
            i41[] i41VarArr = (i41[]) W2.getSpans(0, W2.length(), i41.class);
            for (int i13 = 0; i41VarArr != null && i13 < i41VarArr.length; i13++) {
                int spanStart = W2.getSpanStart(i41VarArr[i13]);
                int spanEnd = W2.getSpanEnd(i41VarArr[i13]);
                W2.removeSpan(i41VarArr[i13]);
                W2.setSpan(new oi.v5(this, i12), spanStart, spanEnd, 33);
            }
            return;
        }
        if (arrayList.size() != 1) {
            if (i10 == 4) {
                this.n = org.telegram.messenger.g0.R2(org.telegram.messenger.gd.M0(2131744630, null), org.telegram.ui.ActionBar.n6.Xc, 2, null, i6Var);
                return;
            }
            return;
        }
        String M0 = i10 == 0 ? org.telegram.messenger.gd.M0(2131748405, null) : i10 == 3 ? org.telegram.messenger.gd.M0(2131748401, null) : org.telegram.messenger.gd.M0(2131748400, null);
        String[] split = M0.split("%s");
        if (split.length <= 1) {
            this.n = M0;
            return;
        }
        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) arrayList.get(0);
        this.b = inputStickerSet;
        if (inputStickerSet == null || (o02 = org.telegram.messenger.ri.d0(i7).o0(this.b, false)) == null || (stickerSet = o02.set) == null) {
            str = null;
            document = null;
        } else {
            str = stickerSet.title;
            int i14 = 0;
            while (true) {
                ArrayList<TLRPC.Document> arrayList3 = o02.documents;
                if (arrayList3 == null || i14 >= arrayList3.size()) {
                    break;
                }
                if (o02.documents.get(i14).id == o02.set.thumb_document_id) {
                    document = o02.documents.get(i14);
                    break;
                }
                i14++;
            }
            document = null;
            if (document == null && (arrayList2 = o02.documents) != null && arrayList2.size() > 0) {
                document = o02.documents.get(0);
            }
        }
        if (str == null || document == null) {
            this.n = split[0];
            this.s = split[1];
            o80 o80Var = new o80(i6Var);
            this.f = o80Var;
            o80Var.l = org.telegram.ui.ActionBar.n6.G8;
            o80Var.m = org.telegram.ui.ActionBar.n6.i6;
            o80Var.k(4.0f);
            return;
        }
        SpannableString spannableString = new SpannableString(org.telegram.messenger.fj.U(document));
        spannableString.setSpan(new w90(this, document, this.h.getFontMetricsInt()), 0, spannableString.length(), 33);
        o5 l10 = o5.l(i7, 0, document);
        this.d = l10;
        org.telegram.ui.ActionBar.u6.x(this, l10, org.telegram.ui.ActionBar.n6.n6, i6Var, PorterDuff.Mode.SRC_IN);
        this.d.a(this);
        SpannableString spannableString2 = new SpannableString(str);
        spannableString2.setSpan(new oi.v5(this, i12), 0, spannableString2.length(), 33);
        this.n = new SpannableStringBuilder().append((CharSequence) split[0]).append((CharSequence) spannableString).append(' ').append((CharSequence) spannableString2).append((CharSequence) split[1]);
        this.N = 1.0f;
        this.b = null;
    }

    public final int a(int i7, boolean z10) {
        int i10;
        float f10;
        if (i7 <= 0) {
            return 0;
        }
        CharSequence charSequence = this.H;
        TextPaint textPaint = this.h;
        CharSequence charSequence2 = this.n;
        if (charSequence2 != charSequence || this.G != i7) {
            if (charSequence2 != null) {
                StaticLayout staticLayout = new StaticLayout(charSequence2, 0, charSequence2.length(), textPaint, Math.max(i7, 0), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.r = staticLayout;
                o80 o80Var = this.f;
                if (o80Var != null && this.P == null) {
                    int lineCount = staticLayout.getLineCount() - 1;
                    this.y = org.telegram.messenger.g0.L(2.0f) + ((int) this.r.getPrimaryHorizontal(charSequence2.length()));
                    this.E = this.r.getLineTop(lineCount);
                    this.F = r3 - this.E;
                    float min = Math.min(org.telegram.messenger.g0.L(100.0f), this.r.getWidth() - this.y);
                    if (this.O == null) {
                        this.O = new Rect();
                    }
                    Rect rect = this.O;
                    int i11 = this.y;
                    rect.set(i11, this.E, (int) (i11 + min), r3);
                    o80Var.setBounds(this.O);
                    this.e = true;
                }
            } else {
                this.r = null;
                this.e = false;
            }
            this.H = charSequence2;
            this.G = i7;
        }
        SpannableStringBuilder spannableStringBuilder = this.w;
        if (spannableStringBuilder != this.J || this.I != i7) {
            if (spannableStringBuilder != null) {
                SpannableStringBuilder spannableStringBuilder2 = this.w;
                i10 = i7;
                this.x = new StaticLayout(spannableStringBuilder2, 0, spannableStringBuilder2.length(), textPaint, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                i10 = i7;
                this.x = null;
            }
            this.J = this.w;
            this.I = i10;
        }
        StaticLayout staticLayout2 = this.r;
        int height = staticLayout2 != null ? staticLayout2.getHeight() : 0;
        if (this.x != null) {
            f10 = (r14.getHeight() - this.F) * (z10 ? 1.0f : this.N);
        } else {
            f10 = 0.0f;
        }
        return height + ((int) f10);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.E8));
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0049, code lost:
    
        r2 = null;
     */
    @Override // org.telegram.messenger.fs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        String str;
        TLRPC.Document document;
        ArrayList<TLRPC.Document> arrayList;
        if (i7 != org.telegram.messenger.ks.B0 || this.b == null) {
            return;
        }
        int i11 = this.a;
        TLRPC.TL_messages_stickerSet o02 = org.telegram.messenger.ri.d0(i11).o0(this.b, false);
        if (o02 == null) {
            return;
        }
        TLRPC.StickerSet stickerSet = o02.set;
        if (stickerSet != null) {
            str = stickerSet.title;
            int i12 = 0;
            while (true) {
                ArrayList<TLRPC.Document> arrayList2 = o02.documents;
                if (arrayList2 == null || i12 >= arrayList2.size()) {
                    break;
                }
                if (o02.documents.get(i12).id == o02.set.thumb_document_id) {
                    document = o02.documents.get(i12);
                    break;
                }
                i12++;
            }
            if (document == null && (arrayList = o02.documents) != null && arrayList.size() > 0) {
                document = o02.documents.get(0);
            }
        } else {
            str = null;
            document = null;
        }
        if (str == null || document == null) {
            return;
        }
        o5 l10 = o5.l(i11, 0, document);
        this.d = l10;
        l10.a(this);
        invalidate();
        SpannableString spannableString = new SpannableString(" ");
        spannableString.setSpan(new op(this, 1), 0, 1, 33);
        SpannableString spannableString2 = new SpannableString(org.telegram.messenger.fj.U(document));
        spannableString2.setSpan(new x90(this, document, this.h.getFontMetricsInt()), 0, spannableString2.length(), 33);
        SpannableString spannableString3 = new SpannableString(str);
        spannableString3.setSpan(new oi.v5(this, 2), 0, spannableString3.length(), 33);
        this.w = new SpannableStringBuilder().append((CharSequence) spannableString).append((CharSequence) spannableString2).append(' ').append((CharSequence) spannableString3).append((CharSequence) this.s);
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int a10 = a((this.K - getPaddingLeft()) - getPaddingRight(), true);
        if (this.O != null && this.x != null) {
            if (this.P == null) {
                this.P = new Rect();
            }
            StaticLayout staticLayout = this.x;
            float primaryHorizontal = staticLayout.getPrimaryHorizontal(staticLayout.getLineEnd(0));
            Rect rect = this.P;
            Rect rect2 = this.O;
            rect.set(rect2.left, rect2.top, (int) primaryHorizontal, rect2.bottom);
        }
        this.b = null;
        ValueAnimator valueAnimator = this.M;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        boolean z10 = Math.abs(measuredHeight - a10) > org.telegram.messenger.g0.L(3.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.N, 1.0f);
        this.M = ofFloat;
        ofFloat.addUpdateListener(new ch.v(8, this, z10));
        this.M.setInterpolator(lr.h);
        this.M.setStartDelay(150L);
        this.M.setDuration(400L);
        this.M.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o5 o5Var = this.d;
        if (o5Var != null) {
            o5Var.a(this);
        }
        org.telegram.messenger.ks.f(this.a).c(this, org.telegram.messenger.ks.B0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o5 o5Var = this.d;
        if (o5Var != null) {
            o5Var.n(this);
        }
        org.telegram.messenger.ks.f(this.a).n(this, org.telegram.messenger.ks.B0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Rect rect;
        super.onDraw(canvas);
        if (this.r != null) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            TextPaint textPaint = this.h;
            textPaint.setAlpha(org.telegram.messenger.ks.e4);
            this.r.draw(canvas);
            o80 o80Var = this.f;
            if (o80Var != null && this.e) {
                o80Var.setAlpha((int) ((1.0f - this.N) * 255.0f));
                Rect rect2 = this.O;
                if (rect2 != null && (rect = this.P) != null) {
                    float f10 = this.N;
                    Rect rect3 = org.telegram.messenger.g0.Q;
                    org.telegram.messenger.g0.X1(rect2, rect, f10, rect3);
                    o80Var.setBounds(rect3);
                }
                o80Var.draw(canvas);
                invalidate();
            }
            if (this.x != null) {
                canvas.save();
                canvas.translate(0.0f, this.E);
                textPaint.setAlpha((int) (this.N * 255.0f));
                this.x.draw(canvas);
                canvas.restore();
            }
            o5 o5Var = this.d;
            if (o5Var != null) {
                o5Var.setAlpha((int) (this.N * 255.0f));
                this.d.setBounds(this.c);
                this.d.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        int size = View.MeasureSpec.getSize(i7);
        if (this.L && (i11 = this.K) > 0) {
            size = Math.min(size, i11);
        }
        this.K = size;
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        if (paddingLeft < 0) {
            paddingLeft = 0;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + a(paddingLeft, false), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        TextPaint textPaint = this.h;
        if (textPaint != null) {
            try {
                int alpha = textPaint.getAlpha();
                textPaint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.E8, false));
                textPaint.setAlpha(alpha);
                invalidate();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}
