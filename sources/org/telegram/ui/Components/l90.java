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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class l90 extends FrameLayout implements org.telegram.messenger.ls, org.telegram.ui.ActionBar.a6 {
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
    public i5 d;
    public boolean e;
    public final a80 f;
    public final TextPaint h;
    public final CharSequence n;
    public StaticLayout r;
    public final String s;
    public SpannableStringBuilder w;
    public StaticLayout x;
    public int y;

    public l90(int i7, int i10, Context context, ArrayList arrayList, org.telegram.ui.ActionBar.f6 f6Var) {
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
        this.a = i7;
        int i11 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i11, f6Var), 0, 16);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        setBackground(a02);
        org.telegram.ui.ActionBar.r6.k(this, a02, null, N, f6Var);
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, f6Var));
        int i12 = 2;
        if (arrayList.size() > 1) {
            SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(i10 == 0 ? org.telegram.messenger.hd.G(arrayList.size(), "MessageContainsEmojiPacks", new Object[0]) : org.telegram.messenger.hd.G(arrayList.size(), "MessageContainsReactionsPacks", new Object[0]));
            this.n = X2;
            u31[] u31VarArr = (u31[]) X2.getSpans(0, X2.length(), u31.class);
            for (int i13 = 0; u31VarArr != null && i13 < u31VarArr.length; i13++) {
                int spanStart = X2.getSpanStart(u31VarArr[i13]);
                int spanEnd = X2.getSpanEnd(u31VarArr[i13]);
                X2.removeSpan(u31VarArr[i13]);
                X2.setSpan(new li.w5(this, i12), spanStart, spanEnd, 33);
            }
            return;
        }
        if (arrayList.size() != 1) {
            if (i10 == 4) {
                this.n = org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131744866, null), org.telegram.ui.ActionBar.k6.Uc, 2, null, f6Var);
                return;
            }
            return;
        }
        String M0 = i10 == 0 ? org.telegram.messenger.hd.M0(2131748596, null) : i10 == 3 ? org.telegram.messenger.hd.M0(2131748592, null) : org.telegram.messenger.hd.M0(2131748591, null);
        String[] split = M0.split("%s");
        if (split.length <= 1) {
            this.n = M0;
            return;
        }
        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) arrayList.get(0);
        this.b = inputStickerSet;
        if (inputStickerSet == null || (m0 = org.telegram.messenger.ui.b0(i7).m0(this.b, false)) == null || (stickerSet = m0.set) == null) {
            str = null;
            document = null;
        } else {
            str = stickerSet.title;
            int i14 = 0;
            while (true) {
                ArrayList<TLRPC.Document> arrayList3 = m0.documents;
                if (arrayList3 == null || i14 >= arrayList3.size()) {
                    break;
                }
                if (m0.documents.get(i14).id == m0.set.thumb_document_id) {
                    document = m0.documents.get(i14);
                    break;
                }
                i14++;
            }
            document = null;
            if (document == null && (arrayList2 = m0.documents) != null && arrayList2.size() > 0) {
                document = m0.documents.get(0);
            }
        }
        if (str == null || document == null) {
            this.n = split[0];
            this.s = split[1];
            a80 a80Var = new a80(f6Var);
            this.f = a80Var;
            a80Var.l = org.telegram.ui.ActionBar.k6.G8;
            a80Var.m = org.telegram.ui.ActionBar.k6.i6;
            a80Var.k(4.0f);
            return;
        }
        SpannableString spannableString = new SpannableString(org.telegram.messenger.ij.U(document));
        spannableString.setSpan(new j90(this, document, this.h.getFontMetricsInt()), 0, spannableString.length(), 33);
        i5 l10 = i5.l(i7, 0, document);
        this.d = l10;
        org.telegram.ui.ActionBar.r6.y(this, l10, org.telegram.ui.ActionBar.k6.n6, f6Var, PorterDuff.Mode.SRC_IN);
        this.d.a(this);
        SpannableString spannableString2 = new SpannableString(str);
        spannableString2.setSpan(new li.w5(this, i12), 0, spannableString2.length(), 33);
        this.n = new SpannableStringBuilder().append((CharSequence) split[0]).append((CharSequence) spannableString).append(' ').append((CharSequence) spannableString2).append((CharSequence) split[1]);
        this.M = 1.0f;
        this.b = null;
    }

    public final int a(int i7, boolean z9) {
        int i10;
        float f10;
        if (i7 <= 0) {
            return 0;
        }
        CharSequence charSequence = this.G;
        TextPaint textPaint = this.h;
        CharSequence charSequence2 = this.n;
        if (charSequence2 != charSequence || this.F != i7) {
            if (charSequence2 != null) {
                StaticLayout staticLayout = new StaticLayout(charSequence2, 0, charSequence2.length(), textPaint, Math.max(i7, 0), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.r = staticLayout;
                a80 a80Var = this.f;
                if (a80Var != null && this.O == null) {
                    int lineCount = staticLayout.getLineCount() - 1;
                    this.y = org.telegram.messenger.g0.L(2.0f) + ((int) this.r.getPrimaryHorizontal(charSequence2.length()));
                    this.D = this.r.getLineTop(lineCount);
                    this.E = r3 - this.D;
                    float min = Math.min(org.telegram.messenger.g0.L(100.0f), this.r.getWidth() - this.y);
                    if (this.N == null) {
                        this.N = new Rect();
                    }
                    Rect rect = this.N;
                    int i11 = this.y;
                    rect.set(i11, this.D, (int) (i11 + min), r3);
                    a80Var.setBounds(this.N);
                    this.e = true;
                }
            } else {
                this.r = null;
                this.e = false;
            }
            this.G = charSequence2;
            this.F = i7;
        }
        SpannableStringBuilder spannableStringBuilder = this.w;
        if (spannableStringBuilder != this.I || this.H != i7) {
            if (spannableStringBuilder != null) {
                SpannableStringBuilder spannableStringBuilder2 = this.w;
                i10 = i7;
                this.x = new StaticLayout(spannableStringBuilder2, 0, spannableStringBuilder2.length(), textPaint, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                i10 = i7;
                this.x = null;
            }
            this.I = this.w;
            this.H = i10;
        }
        StaticLayout staticLayout2 = this.r;
        int height = staticLayout2 != null ? staticLayout2.getHeight() : 0;
        if (this.x != null) {
            f10 = (r14.getHeight() - this.E) * (z9 ? 1.0f : this.M);
        } else {
            f10 = 0.0f;
        }
        return height + ((int) f10);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.E8));
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0049, code lost:
    
        r2 = null;
     */
    @Override // org.telegram.messenger.ls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        String str;
        TLRPC.Document document;
        ArrayList<TLRPC.Document> arrayList;
        if (i7 != org.telegram.messenger.qs.B0 || this.b == null) {
            return;
        }
        int i11 = this.a;
        TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.ui.b0(i11).m0(this.b, false);
        if (m0 == null) {
            return;
        }
        TLRPC.StickerSet stickerSet = m0.set;
        if (stickerSet != null) {
            str = stickerSet.title;
            int i12 = 0;
            while (true) {
                ArrayList<TLRPC.Document> arrayList2 = m0.documents;
                if (arrayList2 == null || i12 >= arrayList2.size()) {
                    break;
                }
                if (m0.documents.get(i12).id == m0.set.thumb_document_id) {
                    document = m0.documents.get(i12);
                    break;
                }
                i12++;
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
        i5 l10 = i5.l(i11, 0, document);
        this.d = l10;
        l10.a(this);
        invalidate();
        SpannableString spannableString = new SpannableString(" ");
        spannableString.setSpan(new yo(this, 1), 0, 1, 33);
        SpannableString spannableString2 = new SpannableString(org.telegram.messenger.ij.U(document));
        spannableString2.setSpan(new k90(this, document, this.h.getFontMetricsInt()), 0, spannableString2.length(), 33);
        SpannableString spannableString3 = new SpannableString(str);
        spannableString3.setSpan(new li.w5(this, 2), 0, spannableString3.length(), 33);
        this.w = new SpannableStringBuilder().append((CharSequence) spannableString).append((CharSequence) spannableString2).append(' ').append((CharSequence) spannableString3).append((CharSequence) this.s);
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int a10 = a((this.J - getPaddingLeft()) - getPaddingRight(), true);
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
        boolean z9 = Math.abs(measuredHeight - a10) > org.telegram.messenger.g0.L(3.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M, 1.0f);
        this.L = ofFloat;
        ofFloat.addUpdateListener(new ch.u(8, this, z9));
        this.L.setInterpolator(xq.h);
        this.L.setStartDelay(150L);
        this.L.setDuration(400L);
        this.L.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i5 i5Var = this.d;
        if (i5Var != null) {
            i5Var.a(this);
        }
        org.telegram.messenger.qs.f(this.a).c(this, org.telegram.messenger.qs.B0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i5 i5Var = this.d;
        if (i5Var != null) {
            i5Var.n(this);
        }
        org.telegram.messenger.qs.f(this.a).n(this, org.telegram.messenger.qs.B0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Rect rect;
        super.onDraw(canvas);
        if (this.r != null) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            TextPaint textPaint = this.h;
            textPaint.setAlpha(org.telegram.messenger.qs.e4);
            this.r.draw(canvas);
            a80 a80Var = this.f;
            if (a80Var != null && this.e) {
                a80Var.setAlpha((int) ((1.0f - this.M) * 255.0f));
                Rect rect2 = this.N;
                if (rect2 != null && (rect = this.O) != null) {
                    float f10 = this.M;
                    Rect rect3 = org.telegram.messenger.g0.Q;
                    org.telegram.messenger.g0.X1(rect2, rect, f10, rect3);
                    a80Var.setBounds(rect3);
                }
                a80Var.draw(canvas);
                invalidate();
            }
            if (this.x != null) {
                canvas.save();
                canvas.translate(0.0f, this.D);
                textPaint.setAlpha((int) (this.M * 255.0f));
                this.x.draw(canvas);
                canvas.restore();
            }
            i5 i5Var = this.d;
            if (i5Var != null) {
                i5Var.setAlpha((int) (this.M * 255.0f));
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
        if (this.K && (i11 = this.J) > 0) {
            size = Math.min(size, i11);
        }
        this.J = size;
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        if (paddingLeft < 0) {
            paddingLeft = 0;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + a(paddingLeft, false), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        TextPaint textPaint = this.h;
        if (textPaint != null) {
            try {
                int alpha = textPaint.getAlpha();
                textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E8, false));
                textPaint.setAlpha(alpha);
                invalidate();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}
