package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class qa0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public int B;
    public CharSequence C;
    public int D;
    public SpannableStringBuilder E;
    public int F;
    public boolean G;
    public ValueAnimator H;
    public float I;
    public Rect J;
    public Rect K;
    public final int a;
    public TLRPC.InputStickerSet b;
    public final Rect c;
    public p5 d;
    public boolean e;
    public final c90 f;
    public final TextPaint h;
    public final CharSequence n;
    public StaticLayout r;
    public final String s;
    public SpannableStringBuilder v;
    public StaticLayout w;
    public int x;
    public int y;

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0109, code lost:
    
        r4 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qa0(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, ArrayList arrayList, int i11) {
        super(context);
        String str;
        TLRPC.Document document;
        TLRPC.TL_messages_stickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        ArrayList<TLRPC.Document> arrayList2;
        this.c = new Rect();
        this.e = false;
        this.F = -1;
        this.G = true;
        this.I = 0.0f;
        this.a = i10;
        setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, c6Var), 0, 16));
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var));
        if (arrayList.size() > 1) {
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(i11 == 0 ? LocaleController.formatPluralString("MessageContainsEmojiPacks", arrayList.size(), new Object[0]) : LocaleController.formatPluralString("MessageContainsReactionsPacks", arrayList.size(), new Object[0]));
            this.n = replaceTags;
            t41[] t41VarArr = (t41[]) replaceTags.getSpans(0, replaceTags.length(), t41.class);
            for (int i12 = 0; t41VarArr != null && i12 < t41VarArr.length; i12++) {
                int spanStart = replaceTags.getSpanStart(t41VarArr[i12]);
                int spanEnd = replaceTags.getSpanEnd(t41VarArr[i12]);
                replaceTags.removeSpan(t41VarArr[i12]);
                replaceTags.setSpan(new pa0(0, this), spanStart, spanEnd, 33);
            }
            return;
        }
        if (arrayList.size() != 1) {
            if (i11 == 4) {
                this.n = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StickersCheckStickersBotForMoreOptions), org.telegram.ui.ActionBar.g6.gc, 2, null, c6Var);
                return;
            }
            return;
        }
        String string = i11 == 0 ? LocaleController.getString(R.string.MessageContainsEmojiPack) : i11 == 3 ? LocaleController.getString(R.string.MessageContainsReactionPack) : LocaleController.getString(R.string.MessageContainsReactionsPack);
        String[] split = string.split("%s");
        if (split.length <= 1) {
            this.n = string;
            return;
        }
        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) arrayList.get(0);
        this.b = inputStickerSet;
        if (inputStickerSet == null || (stickerSet = MediaDataController.getInstance(i10).getStickerSet(this.b, false)) == null || (stickerSet2 = stickerSet.set) == null) {
            str = null;
            document = null;
        } else {
            str = stickerSet2.title;
            int i13 = 0;
            while (true) {
                ArrayList<TLRPC.Document> arrayList3 = stickerSet.documents;
                if (arrayList3 == null || i13 >= arrayList3.size()) {
                    break;
                }
                if (stickerSet.documents.get(i13).id == stickerSet.set.thumb_document_id) {
                    document = stickerSet.documents.get(i13);
                    break;
                }
                i13++;
            }
            if (document == null && (arrayList2 = stickerSet.documents) != null && arrayList2.size() > 0) {
                document = stickerSet.documents.get(0);
            }
        }
        if (str == null || document == null) {
            this.n = split[0];
            this.s = split[1];
            c90 c90Var = new c90(c6Var);
            this.f = c90Var;
            c90Var.l = org.telegram.ui.ActionBar.g6.G8;
            c90Var.m = org.telegram.ui.ActionBar.g6.i6;
            c90Var.j(4.0f);
            return;
        }
        SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(document));
        spannableString.setSpan(new na0(this, document, this.h.getFontMetricsInt()), 0, spannableString.length(), 33);
        p5 m10 = p5.m(i10, 0, document);
        this.d = m10;
        m10.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.n6, c6Var), PorterDuff.Mode.SRC_IN));
        this.d.a(this);
        SpannableString spannableString2 = new SpannableString(str);
        spannableString2.setSpan(new pa0(0, this), 0, spannableString2.length(), 33);
        this.n = new SpannableStringBuilder().append((CharSequence) split[0]).append((CharSequence) spannableString).append(' ').append((CharSequence) spannableString2).append((CharSequence) split[1]);
        this.I = 1.0f;
        this.b = null;
    }

    public final int a(int i10, boolean z10) {
        int i11;
        float f9;
        if (i10 <= 0) {
            return 0;
        }
        CharSequence charSequence = this.C;
        TextPaint textPaint = this.h;
        CharSequence charSequence2 = this.n;
        if (charSequence2 != charSequence || this.B != i10) {
            if (charSequence2 != null) {
                StaticLayout staticLayout = new StaticLayout(charSequence2, 0, charSequence2.length(), textPaint, Math.max(i10, 0), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.r = staticLayout;
                c90 c90Var = this.f;
                if (c90Var != null && this.K == null) {
                    int lineCount = staticLayout.getLineCount() - 1;
                    this.x = AndroidUtilities.dp(2.0f) + ((int) this.r.getPrimaryHorizontal(charSequence2.length()));
                    this.y = this.r.getLineTop(lineCount);
                    this.A = r3 - this.y;
                    float min = Math.min(AndroidUtilities.dp(100.0f), this.r.getWidth() - this.x);
                    if (this.J == null) {
                        this.J = new Rect();
                    }
                    Rect rect = this.J;
                    int i12 = this.x;
                    rect.set(i12, this.y, (int) (i12 + min), r3);
                    c90Var.setBounds(this.J);
                    this.e = true;
                }
            } else {
                this.r = null;
                this.e = false;
            }
            this.C = charSequence2;
            this.B = i10;
        }
        SpannableStringBuilder spannableStringBuilder = this.v;
        if (spannableStringBuilder != this.E || this.D != i10) {
            if (spannableStringBuilder != null) {
                SpannableStringBuilder spannableStringBuilder2 = this.v;
                i11 = i10;
                this.w = new StaticLayout(spannableStringBuilder2, 0, spannableStringBuilder2.length(), textPaint, i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                i11 = i10;
                this.w = null;
            }
            this.E = this.v;
            this.D = i11;
        }
        StaticLayout staticLayout2 = this.r;
        int height = staticLayout2 != null ? staticLayout2.getHeight() : 0;
        if (this.w != null) {
            f9 = (r14.getHeight() - this.A) * (z10 ? 1.0f : this.I);
        } else {
            f9 = 0.0f;
        }
        return height + ((int) f9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0049, code lost:
    
        r2 = null;
     */
    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        TLRPC.Document document;
        ArrayList<TLRPC.Document> arrayList;
        if (i10 != NotificationCenter.groupStickersDidLoad || this.b == null) {
            return;
        }
        int i12 = this.a;
        int i13 = 0;
        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i12).getStickerSet(this.b, false);
        if (stickerSet == null) {
            return;
        }
        TLRPC.StickerSet stickerSet2 = stickerSet.set;
        if (stickerSet2 != null) {
            str = stickerSet2.title;
            int i14 = 0;
            while (true) {
                ArrayList<TLRPC.Document> arrayList2 = stickerSet.documents;
                if (arrayList2 == null || i14 >= arrayList2.size()) {
                    break;
                }
                if (stickerSet.documents.get(i14).id == stickerSet.set.thumb_document_id) {
                    document = stickerSet.documents.get(i14);
                    break;
                }
                i14++;
            }
            if (document == null && (arrayList = stickerSet.documents) != null && arrayList.size() > 0) {
                document = stickerSet.documents.get(0);
            }
        } else {
            str = null;
            document = null;
        }
        if (str == null || document == null) {
            return;
        }
        p5 m10 = p5.m(i12, 0, document);
        this.d = m10;
        m10.a(this);
        invalidate();
        SpannableString spannableString = new SpannableString(" ");
        spannableString.setSpan(new eg.p2(this, 1), 0, 1, 33);
        SpannableString spannableString2 = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(document));
        spannableString2.setSpan(new oa0(this, document, this.h.getFontMetricsInt()), 0, spannableString2.length(), 33);
        SpannableString spannableString3 = new SpannableString(str);
        spannableString3.setSpan(new pa0(i13, this), 0, spannableString3.length(), 33);
        this.v = new SpannableStringBuilder().append((CharSequence) spannableString).append((CharSequence) spannableString2).append(' ').append((CharSequence) spannableString3).append((CharSequence) this.s);
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int a2 = a((this.F - getPaddingLeft()) - getPaddingRight(), true);
        if (this.J != null && this.w != null) {
            if (this.K == null) {
                this.K = new Rect();
            }
            StaticLayout staticLayout = this.w;
            float primaryHorizontal = staticLayout.getPrimaryHorizontal(staticLayout.getLineEnd(0));
            Rect rect = this.K;
            Rect rect2 = this.J;
            rect.set(rect2.left, rect2.top, (int) primaryHorizontal, rect2.bottom);
        }
        this.b = null;
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        boolean z10 = Math.abs(measuredHeight - a2) > AndroidUtilities.dp(3.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, 1.0f);
        this.H = ofFloat;
        ofFloat.addUpdateListener(new bg.c1(9, this, z10));
        this.H.setInterpolator(jr.h);
        this.H.setStartDelay(150L);
        this.H.setDuration(400L);
        this.H.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p5 p5Var = this.d;
        if (p5Var != null) {
            p5Var.a(this);
        }
        NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p5 p5Var = this.d;
        if (p5Var != null) {
            p5Var.o(this);
        }
        NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Rect rect;
        super.onDraw(canvas);
        if (this.r != null) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            TextPaint textPaint = this.h;
            textPaint.setAlpha(255);
            this.r.draw(canvas);
            c90 c90Var = this.f;
            if (c90Var != null && this.e) {
                c90Var.setAlpha((int) ((1.0f - this.I) * 255.0f));
                Rect rect2 = this.J;
                if (rect2 != null && (rect = this.K) != null) {
                    float f9 = this.I;
                    Rect rect3 = AndroidUtilities.rectTmp2;
                    AndroidUtilities.lerp(rect2, rect, f9, rect3);
                    c90Var.setBounds(rect3);
                }
                c90Var.draw(canvas);
                invalidate();
            }
            if (this.w != null) {
                canvas.save();
                canvas.translate(0.0f, this.y);
                textPaint.setAlpha((int) (this.I * 255.0f));
                this.w.draw(canvas);
                canvas.restore();
            }
            p5 p5Var = this.d;
            if (p5Var != null) {
                p5Var.setAlpha((int) (this.I * 255.0f));
                this.d.setBounds(this.c);
                this.d.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        int size = View.MeasureSpec.getSize(i10);
        if (this.G && (i12 = this.F) > 0) {
            size = Math.min(size, i12);
        }
        this.F = size;
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        if (paddingLeft < 0) {
            paddingLeft = 0;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + a(paddingLeft, false), TLObject.FLAG_30));
    }
}
