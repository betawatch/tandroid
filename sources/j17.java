// default package

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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class j17 extends FrameLayout implements gk7, tjb {
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
    public vl d;
    public boolean e;
    public final r86 f;
    public final TextPaint h;
    public final CharSequence n;
    public StaticLayout r;
    public final String s;
    public SpannableStringBuilder w;
    public StaticLayout x;
    public int y;

    public j17(int i, int i2, wjb wjbVar, Context context, ArrayList arrayList) {
        super(context);
        String str;
        TLRPC.Document document;
        TLRPC.TL_messages_stickerSet n0;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList2;
        this.c = new Rect();
        this.e = false;
        this.K = -1;
        this.L = true;
        this.N = 0.0f;
        this.a = i;
        int i3 = bkb.h6;
        ff0 Y = bkb.Y(bkb.v0(i3, wjbVar), 0, 16);
        vkb M = zkb.M(i3);
        setBackground(Y);
        zkb.j(this, Y, null, M, wjbVar);
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        textPaint.setTextSize(gl.L(13.0f));
        textPaint.setColor(bkb.v0(bkb.D8, wjbVar));
        if (arrayList.size() > 1) {
            SpannableStringBuilder T2 = gl.T2(i2 == 0 ? k96.G(arrayList.size(), "MessageContainsEmojiPacks", new Object[0]) : k96.G(arrayList.size(), "MessageContainsReactionsPacks", new Object[0]));
            this.n = T2;
            z3c[] z3cVarArr = (z3c[]) T2.getSpans(0, T2.length(), z3c.class);
            for (int i4 = 0; z3cVarArr != null && i4 < z3cVarArr.length; i4++) {
                int spanStart = T2.getSpanStart(z3cVarArr[i4]);
                int spanEnd = T2.getSpanEnd(z3cVarArr[i4]);
                T2.removeSpan(z3cVarArr[i4]);
                T2.setSpan(new i17(this), spanStart, spanEnd, 33);
            }
            return;
        }
        if (arrayList.size() != 1) {
            if (i2 == 4) {
                this.n = gl.O2(k96.M0(2131744628, null), bkb.Wc, 2, null, wjbVar);
                return;
            }
            return;
        }
        String M0 = i2 == 0 ? k96.M0(2131748405, null) : i2 == 3 ? k96.M0(2131748401, null) : k96.M0(2131748400, null);
        String[] split = M0.split("%s");
        if (split.length <= 1) {
            this.n = M0;
            return;
        }
        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) arrayList.get(0);
        this.b = inputStickerSet;
        if (inputStickerSet == null || (n0 = hq6.d0(i).n0(this.b, false)) == null || (stickerSet = n0.set) == null) {
            str = null;
            document = null;
        } else {
            str = stickerSet.title;
            int i5 = 0;
            while (true) {
                ArrayList<TLRPC.Document> arrayList3 = n0.documents;
                if (arrayList3 == null || i5 >= arrayList3.size()) {
                    break;
                }
                if (n0.documents.get(i5).id == n0.set.thumb_document_id) {
                    document = n0.documents.get(i5);
                    break;
                }
                i5++;
            }
            document = null;
            if (document == null && (arrayList2 = n0.documents) != null && arrayList2.size() > 0) {
                document = n0.documents.get(0);
            }
        }
        if (str == null || document == null) {
            this.n = split[0];
            this.s = split[1];
            r86 r86Var = new r86(wjbVar);
            this.f = r86Var;
            r86Var.l = bkb.F8;
            r86Var.m = bkb.h6;
            r86Var.j(4.0f);
            return;
        }
        SpannableString spannableString = new SpannableString(k27.U(document));
        spannableString.setSpan(new g17(this, document, this.h.getFontMetricsInt()), 0, spannableString.length(), 33);
        vl l = vl.l(i, 0, document);
        this.d = l;
        zkb.x(this, l, bkb.m6, wjbVar, PorterDuff.Mode.SRC_IN);
        this.d.b(this);
        SpannableString spannableString2 = new SpannableString(str);
        spannableString2.setSpan(new i17(this), 0, spannableString2.length(), 33);
        this.n = new SpannableStringBuilder().append((CharSequence) split[0]).append((CharSequence) spannableString).append(' ').append((CharSequence) spannableString2).append((CharSequence) split[1]);
        this.N = 1.0f;
        this.b = null;
    }

    public final int a(int i, boolean z) {
        int i2;
        float f;
        if (i <= 0) {
            return 0;
        }
        CharSequence charSequence = this.H;
        TextPaint textPaint = this.h;
        CharSequence charSequence2 = this.n;
        if (charSequence2 != charSequence || this.G != i) {
            if (charSequence2 != null) {
                StaticLayout staticLayout = new StaticLayout(charSequence2, 0, charSequence2.length(), textPaint, Math.max(i, 0), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.r = staticLayout;
                r86 r86Var = this.f;
                if (r86Var != null && this.P == null) {
                    int lineCount = staticLayout.getLineCount() - 1;
                    this.y = gl.L(2.0f) + ((int) this.r.getPrimaryHorizontal(charSequence2.length()));
                    this.E = this.r.getLineTop(lineCount);
                    this.F = r3 - this.E;
                    float min = Math.min(gl.L(100.0f), this.r.getWidth() - this.y);
                    Rect rect = this.O;
                    if (rect == null) {
                        rect = new Rect();
                        this.O = rect;
                    }
                    int i3 = this.y;
                    rect.set(i3, this.E, (int) (i3 + min), r3);
                    r86Var.setBounds(this.O);
                    this.e = true;
                }
            } else {
                this.r = null;
                this.e = false;
            }
            this.H = charSequence2;
            this.G = i;
        }
        SpannableStringBuilder spannableStringBuilder = this.w;
        if (spannableStringBuilder != this.J || this.I != i) {
            if (spannableStringBuilder != null) {
                SpannableStringBuilder spannableStringBuilder2 = this.w;
                i2 = i;
                this.x = new StaticLayout(spannableStringBuilder2, 0, spannableStringBuilder2.length(), textPaint, i2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                i2 = i;
                this.x = null;
            }
            this.J = this.w;
            this.I = i2;
        }
        StaticLayout staticLayout2 = this.r;
        int height = staticLayout2 != null ? staticLayout2.getHeight() : 0;
        if (this.x != null) {
            f = (r14.getHeight() - this.F) * (z ? 1.0f : this.N);
        } else {
            f = 0.0f;
        }
        return height + ((int) f);
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.D8));
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0047, code lost:
    
        r2 = null;
     */
    @Override // gk7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        String str;
        TLRPC.Document document;
        ArrayList<TLRPC.Document> arrayList;
        if (i != kk7.A0 || this.b == null) {
            return;
        }
        int i3 = this.a;
        TLRPC.TL_messages_stickerSet n0 = hq6.d0(i3).n0(this.b, false);
        if (n0 != null) {
            TLRPC.StickerSet stickerSet = n0.set;
            if (stickerSet != null) {
                str = stickerSet.title;
                int i4 = 0;
                while (true) {
                    ArrayList<TLRPC.Document> arrayList2 = n0.documents;
                    if (arrayList2 == null || i4 >= arrayList2.size()) {
                        break;
                    }
                    if (n0.documents.get(i4).id == n0.set.thumb_document_id) {
                        document = n0.documents.get(i4);
                        break;
                    }
                    i4++;
                }
                if (document == null && (arrayList = n0.documents) != null && arrayList.size() > 0) {
                    document = n0.documents.get(0);
                }
            } else {
                str = null;
                document = null;
            }
            if (str == null || document == null) {
                return;
            }
            vl l = vl.l(i3, 0, document);
            this.d = l;
            l.b(this);
            invalidate();
            SpannableString spannableString = new SpannableString(" ");
            spannableString.setSpan(new bg2(this, (byte) 1), 0, 1, 33);
            SpannableString spannableString2 = new SpannableString(k27.U(document));
            spannableString2.setSpan(new h17(this, document, this.h.getFontMetricsInt()), 0, spannableString2.length(), 33);
            SpannableString spannableString3 = new SpannableString(str);
            spannableString3.setSpan(new i17(this), 0, spannableString3.length(), 33);
            this.w = new SpannableStringBuilder().append((CharSequence) spannableString).append((CharSequence) spannableString2).append(' ').append((CharSequence) spannableString3).append((CharSequence) this.s);
            int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            int a = a((this.K - getPaddingLeft()) - getPaddingRight(), true);
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
            boolean z = Math.abs(measuredHeight - a) > gl.L(3.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.N, 1.0f);
            this.M = ofFloat;
            ofFloat.addUpdateListener(new d20((byte) 5, this, z));
            this.M.setInterpolator(s33.h);
            this.M.setStartDelay(150L);
            this.M.setDuration(400L);
            this.M.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        vl vlVar = this.d;
        if (vlVar != null) {
            vlVar.b(this);
        }
        kk7.f(this.a).b(this, kk7.A0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        vl vlVar = this.d;
        if (vlVar != null) {
            vlVar.o(this);
        }
        kk7.f(this.a).n(this, kk7.A0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Rect rect;
        super.onDraw(canvas);
        if (this.r != null) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            TextPaint textPaint = this.h;
            textPaint.setAlpha(kk7.d4);
            this.r.draw(canvas);
            r86 r86Var = this.f;
            if (r86Var != null && this.e) {
                r86Var.setAlpha((int) ((1.0f - this.N) * 255.0f));
                Rect rect2 = this.O;
                if (rect2 != null && (rect = this.P) != null) {
                    float f = this.N;
                    Rect rect3 = gl.Q;
                    gl.V1(rect2, rect, f, rect3);
                    r86Var.setBounds(rect3);
                }
                r86Var.draw(canvas);
                invalidate();
            }
            if (this.x != null) {
                canvas.save();
                canvas.translate(0.0f, this.E);
                textPaint.setAlpha((int) (this.N * 255.0f));
                this.x.draw(canvas);
                canvas.restore();
            }
            vl vlVar = this.d;
            if (vlVar != null) {
                vlVar.setAlpha((int) (this.N * 255.0f));
                this.d.setBounds(this.c);
                this.d.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        setPadding(gl.L(13.0f), gl.L(8.0f), gl.L(13.0f), gl.L(8.0f));
        int size = View.MeasureSpec.getSize(i);
        if (this.L && (i3 = this.K) > 0) {
            size = Math.min(size, i3);
        }
        this.K = size;
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        if (paddingLeft < 0) {
            paddingLeft = 0;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + a(paddingLeft, false), TLObject.FLAG_30));
    }

    @Override // tjb
    public final void updateColors() {
        TextPaint textPaint = this.h;
        if (textPaint != null) {
            try {
                int alpha = textPaint.getAlpha();
                textPaint.setColor(bkb.w0(null, bkb.D8, false));
                textPaint.setAlpha(alpha);
                invalidate();
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }
}
