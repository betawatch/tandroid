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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ca0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
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
    public k5 d;
    public boolean e;
    public final p80 f;
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
    public ca0(int i9, Context context, org.telegram.ui.ActionBar.b6 b6Var, ArrayList arrayList, int i10) {
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
        this.a = i9;
        setBackground(org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.i6, b6Var), 0, 16));
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, b6Var));
        if (arrayList.size() > 1) {
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(i10 == 0 ? LocaleController.formatPluralString("MessageContainsEmojiPacks", arrayList.size(), new Object[0]) : LocaleController.formatPluralString("MessageContainsReactionsPacks", arrayList.size(), new Object[0]));
            this.n = replaceTags;
            i41[] i41VarArr = (i41[]) replaceTags.getSpans(0, replaceTags.length(), i41.class);
            for (int i11 = 0; i41VarArr != null && i11 < i41VarArr.length; i11++) {
                int spanStart = replaceTags.getSpanStart(i41VarArr[i11]);
                int spanEnd = replaceTags.getSpanEnd(i41VarArr[i11]);
                replaceTags.removeSpan(i41VarArr[i11]);
                replaceTags.setSpan(new ba0(0, this), spanStart, spanEnd, 33);
            }
            return;
        }
        if (arrayList.size() != 1) {
            if (i10 == 4) {
                this.n = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StickersCheckStickersBotForMoreOptions), org.telegram.ui.ActionBar.f6.gc, 2, null, b6Var);
                return;
            }
            return;
        }
        String string = i10 == 0 ? LocaleController.getString(R.string.MessageContainsEmojiPack) : i10 == 3 ? LocaleController.getString(R.string.MessageContainsReactionPack) : LocaleController.getString(R.string.MessageContainsReactionsPack);
        String[] split = string.split("%s");
        if (split.length <= 1) {
            this.n = string;
            return;
        }
        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) arrayList.get(0);
        this.b = inputStickerSet;
        if (inputStickerSet == null || (stickerSet = MediaDataController.getInstance(i9).getStickerSet(this.b, false)) == null || (stickerSet2 = stickerSet.set) == null) {
            str = null;
            document = null;
        } else {
            str = stickerSet2.title;
            int i12 = 0;
            while (true) {
                ArrayList<TLRPC.Document> arrayList3 = stickerSet.documents;
                if (arrayList3 == null || i12 >= arrayList3.size()) {
                    break;
                }
                if (stickerSet.documents.get(i12).id == stickerSet.set.thumb_document_id) {
                    document = stickerSet.documents.get(i12);
                    break;
                }
                i12++;
            }
            if (document == null && (arrayList2 = stickerSet.documents) != null && arrayList2.size() > 0) {
                document = stickerSet.documents.get(0);
            }
        }
        if (str == null || document == null) {
            this.n = split[0];
            this.s = split[1];
            p80 p80Var = new p80(b6Var);
            this.f = p80Var;
            p80Var.l = org.telegram.ui.ActionBar.f6.G8;
            p80Var.m = org.telegram.ui.ActionBar.f6.i6;
            p80Var.j(4.0f);
            return;
        }
        SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(document));
        spannableString.setSpan(new z90(this, document, this.h.getFontMetricsInt()), 0, spannableString.length(), 33);
        k5 m10 = k5.m(i9, 0, document);
        this.d = m10;
        m10.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.n6, b6Var), PorterDuff.Mode.SRC_IN));
        this.d.a(this);
        SpannableString spannableString2 = new SpannableString(str);
        spannableString2.setSpan(new ba0(0, this), 0, spannableString2.length(), 33);
        this.n = new SpannableStringBuilder().append((CharSequence) split[0]).append((CharSequence) spannableString).append(' ').append((CharSequence) spannableString2).append((CharSequence) split[1]);
        this.I = 1.0f;
        this.b = null;
    }

    public final int a(int i9, boolean z10) {
        int i10;
        float f10;
        if (i9 <= 0) {
            return 0;
        }
        CharSequence charSequence = this.C;
        TextPaint textPaint = this.h;
        CharSequence charSequence2 = this.n;
        if (charSequence2 != charSequence || this.B != i9) {
            if (charSequence2 != null) {
                StaticLayout staticLayout = new StaticLayout(charSequence2, 0, charSequence2.length(), textPaint, Math.max(i9, 0), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.r = staticLayout;
                p80 p80Var = this.f;
                if (p80Var != null && this.K == null) {
                    int lineCount = staticLayout.getLineCount() - 1;
                    this.x = AndroidUtilities.dp(2.0f) + ((int) this.r.getPrimaryHorizontal(charSequence2.length()));
                    this.y = this.r.getLineTop(lineCount);
                    this.A = r3 - this.y;
                    float min = Math.min(AndroidUtilities.dp(100.0f), this.r.getWidth() - this.x);
                    if (this.J == null) {
                        this.J = new Rect();
                    }
                    Rect rect = this.J;
                    int i11 = this.x;
                    rect.set(i11, this.y, (int) (i11 + min), r3);
                    p80Var.setBounds(this.J);
                    this.e = true;
                }
            } else {
                this.r = null;
                this.e = false;
            }
            this.C = charSequence2;
            this.B = i9;
        }
        SpannableStringBuilder spannableStringBuilder = this.v;
        if (spannableStringBuilder != this.E || this.D != i9) {
            if (spannableStringBuilder != null) {
                SpannableStringBuilder spannableStringBuilder2 = this.v;
                i10 = i9;
                this.w = new StaticLayout(spannableStringBuilder2, 0, spannableStringBuilder2.length(), textPaint, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                i10 = i9;
                this.w = null;
            }
            this.E = this.v;
            this.D = i10;
        }
        StaticLayout staticLayout2 = this.r;
        int height = staticLayout2 != null ? staticLayout2.getHeight() : 0;
        if (this.w != null) {
            f10 = (r14.getHeight() - this.A) * (z10 ? 1.0f : this.I);
        } else {
            f10 = 0.0f;
        }
        return height + ((int) f10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0049, code lost:
    
        r2 = null;
     */
    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        String str;
        TLRPC.Document document;
        ArrayList<TLRPC.Document> arrayList;
        if (i9 != NotificationCenter.groupStickersDidLoad || this.b == null) {
            return;
        }
        int i11 = this.a;
        int i12 = 0;
        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i11).getStickerSet(this.b, false);
        if (stickerSet == null) {
            return;
        }
        TLRPC.StickerSet stickerSet2 = stickerSet.set;
        if (stickerSet2 != null) {
            str = stickerSet2.title;
            int i13 = 0;
            while (true) {
                ArrayList<TLRPC.Document> arrayList2 = stickerSet.documents;
                if (arrayList2 == null || i13 >= arrayList2.size()) {
                    break;
                }
                if (stickerSet.documents.get(i13).id == stickerSet.set.thumb_document_id) {
                    document = stickerSet.documents.get(i13);
                    break;
                }
                i13++;
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
        k5 m10 = k5.m(i11, 0, document);
        this.d = m10;
        m10.a(this);
        invalidate();
        SpannableString spannableString = new SpannableString(" ");
        spannableString.setSpan(new bg.z2(this, 1), 0, 1, 33);
        SpannableString spannableString2 = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(document));
        spannableString2.setSpan(new aa0(this, document, this.h.getFontMetricsInt()), 0, spannableString2.length(), 33);
        SpannableString spannableString3 = new SpannableString(str);
        spannableString3.setSpan(new ba0(i12, this), 0, spannableString3.length(), 33);
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
        ofFloat.addUpdateListener(new hg.y(8, this, z10));
        this.H.setInterpolator(gr.h);
        this.H.setStartDelay(150L);
        this.H.setDuration(400L);
        this.H.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        k5 k5Var = this.d;
        if (k5Var != null) {
            k5Var.a(this);
        }
        NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k5 k5Var = this.d;
        if (k5Var != null) {
            k5Var.o(this);
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
            p80 p80Var = this.f;
            if (p80Var != null && this.e) {
                p80Var.setAlpha((int) ((1.0f - this.I) * 255.0f));
                Rect rect2 = this.J;
                if (rect2 != null && (rect = this.K) != null) {
                    float f10 = this.I;
                    Rect rect3 = AndroidUtilities.rectTmp2;
                    AndroidUtilities.lerp(rect2, rect, f10, rect3);
                    p80Var.setBounds(rect3);
                }
                p80Var.draw(canvas);
                invalidate();
            }
            if (this.w != null) {
                canvas.save();
                canvas.translate(0.0f, this.y);
                textPaint.setAlpha((int) (this.I * 255.0f));
                this.w.draw(canvas);
                canvas.restore();
            }
            k5 k5Var = this.d;
            if (k5Var != null) {
                k5Var.setAlpha((int) (this.I * 255.0f));
                this.d.setBounds(this.c);
                this.d.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11;
        setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        int size = View.MeasureSpec.getSize(i9);
        if (this.G && (i11 = this.F) > 0) {
            size = Math.min(size, i11);
        }
        this.F = size;
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        if (paddingLeft < 0) {
            paddingLeft = 0;
        }
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + a(paddingLeft, false), TLObject.FLAG_30));
    }
}
