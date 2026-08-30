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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class va0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public int B;
    public int C;
    public CharSequence D;
    public int E;
    public SpannableStringBuilder F;
    public int G;
    public boolean H;
    public ValueAnimator I;
    public float J;
    public Rect K;
    public Rect L;
    public final int a;
    public TLRPC.InputStickerSet b;
    public final Rect c;
    public l5 d;
    public boolean e;
    public final i90 f;
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
    public va0(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList, int i11) {
        super(context);
        String str;
        TLRPC.Document document;
        TLRPC.TL_messages_stickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        ArrayList<TLRPC.Document> arrayList2;
        this.c = new Rect();
        this.e = false;
        this.G = -1;
        this.H = true;
        this.J = 0.0f;
        this.a = i10;
        setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var), 0, 16));
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var));
        if (arrayList.size() > 1) {
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(i11 == 0 ? LocaleController.formatPluralString("MessageContainsEmojiPacks", arrayList.size(), new Object[0]) : LocaleController.formatPluralString("MessageContainsReactionsPacks", arrayList.size(), new Object[0]));
            this.n = replaceTags;
            f51[] f51VarArr = (f51[]) replaceTags.getSpans(0, replaceTags.length(), f51.class);
            for (int i12 = 0; f51VarArr != null && i12 < f51VarArr.length; i12++) {
                int spanStart = replaceTags.getSpanStart(f51VarArr[i12]);
                int spanEnd = replaceTags.getSpanEnd(f51VarArr[i12]);
                replaceTags.removeSpan(f51VarArr[i12]);
                replaceTags.setSpan(new ua0(0, this), spanStart, spanEnd, 33);
            }
            return;
        }
        if (arrayList.size() != 1) {
            if (i11 == 4) {
                this.n = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StickersCheckStickersBotForMoreOptions), org.telegram.ui.ActionBar.j6.gc, 2, null, f6Var);
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
            i90 i90Var = new i90(f6Var);
            this.f = i90Var;
            i90Var.l = org.telegram.ui.ActionBar.j6.G8;
            i90Var.m = org.telegram.ui.ActionBar.j6.i6;
            i90Var.j(4.0f);
            return;
        }
        SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(document));
        spannableString.setSpan(new sa0(this, document, this.h.getFontMetricsInt()), 0, spannableString.length(), 33);
        l5 m9 = l5.m(i10, 0, document);
        this.d = m9;
        m9.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.n6, f6Var), PorterDuff.Mode.SRC_IN));
        this.d.a(this);
        SpannableString spannableString2 = new SpannableString(str);
        spannableString2.setSpan(new ua0(0, this), 0, spannableString2.length(), 33);
        this.n = new SpannableStringBuilder().append((CharSequence) split[0]).append((CharSequence) spannableString).append(' ').append((CharSequence) spannableString2).append((CharSequence) split[1]);
        this.J = 1.0f;
        this.b = null;
    }

    public final int a(int i10, boolean z4) {
        int i11;
        float f10;
        if (i10 <= 0) {
            return 0;
        }
        CharSequence charSequence = this.D;
        TextPaint textPaint = this.h;
        CharSequence charSequence2 = this.n;
        if (charSequence2 != charSequence || this.C != i10) {
            if (charSequence2 != null) {
                StaticLayout staticLayout = new StaticLayout(charSequence2, 0, charSequence2.length(), textPaint, Math.max(i10, 0), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.r = staticLayout;
                i90 i90Var = this.f;
                if (i90Var != null && this.L == null) {
                    int lineCount = staticLayout.getLineCount() - 1;
                    this.x = AndroidUtilities.dp(2.0f) + ((int) this.r.getPrimaryHorizontal(charSequence2.length()));
                    this.y = this.r.getLineTop(lineCount);
                    this.B = r3 - this.y;
                    float min = Math.min(AndroidUtilities.dp(100.0f), this.r.getWidth() - this.x);
                    if (this.K == null) {
                        this.K = new Rect();
                    }
                    Rect rect = this.K;
                    int i12 = this.x;
                    rect.set(i12, this.y, (int) (i12 + min), r3);
                    i90Var.setBounds(this.K);
                    this.e = true;
                }
            } else {
                this.r = null;
                this.e = false;
            }
            this.D = charSequence2;
            this.C = i10;
        }
        SpannableStringBuilder spannableStringBuilder = this.v;
        if (spannableStringBuilder != this.F || this.E != i10) {
            if (spannableStringBuilder != null) {
                SpannableStringBuilder spannableStringBuilder2 = this.v;
                i11 = i10;
                this.w = new StaticLayout(spannableStringBuilder2, 0, spannableStringBuilder2.length(), textPaint, i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                i11 = i10;
                this.w = null;
            }
            this.F = this.v;
            this.E = i11;
        }
        StaticLayout staticLayout2 = this.r;
        int height = staticLayout2 != null ? staticLayout2.getHeight() : 0;
        if (this.w != null) {
            f10 = (r14.getHeight() - this.B) * (z4 ? 1.0f : this.J);
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
        l5 m9 = l5.m(i12, 0, document);
        this.d = m9;
        m9.a(this);
        invalidate();
        SpannableString spannableString = new SpannableString(" ");
        spannableString.setSpan(new gg.o2(this, 1), 0, 1, 33);
        SpannableString spannableString2 = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(document));
        spannableString2.setSpan(new ta0(this, document, this.h.getFontMetricsInt()), 0, spannableString2.length(), 33);
        SpannableString spannableString3 = new SpannableString(str);
        spannableString3.setSpan(new ua0(i13, this), 0, spannableString3.length(), 33);
        this.v = new SpannableStringBuilder().append((CharSequence) spannableString).append((CharSequence) spannableString2).append(' ').append((CharSequence) spannableString3).append((CharSequence) this.s);
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int a2 = a((this.G - getPaddingLeft()) - getPaddingRight(), true);
        if (this.K != null && this.w != null) {
            if (this.L == null) {
                this.L = new Rect();
            }
            StaticLayout staticLayout = this.w;
            float primaryHorizontal = staticLayout.getPrimaryHorizontal(staticLayout.getLineEnd(0));
            Rect rect = this.L;
            Rect rect2 = this.K;
            rect.set(rect2.left, rect2.top, (int) primaryHorizontal, rect2.bottom);
        }
        this.b = null;
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        boolean z4 = Math.abs(measuredHeight - a2) > AndroidUtilities.dp(3.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, 1.0f);
        this.I = ofFloat;
        ofFloat.addUpdateListener(new dg.b1(8, this, z4));
        this.I.setInterpolator(nr.h);
        this.I.setStartDelay(150L);
        this.I.setDuration(400L);
        this.I.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        l5 l5Var = this.d;
        if (l5Var != null) {
            l5Var.a(this);
        }
        NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l5 l5Var = this.d;
        if (l5Var != null) {
            l5Var.o(this);
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
            i90 i90Var = this.f;
            if (i90Var != null && this.e) {
                i90Var.setAlpha((int) ((1.0f - this.J) * 255.0f));
                Rect rect2 = this.K;
                if (rect2 != null && (rect = this.L) != null) {
                    float f10 = this.J;
                    Rect rect3 = AndroidUtilities.rectTmp2;
                    AndroidUtilities.lerp(rect2, rect, f10, rect3);
                    i90Var.setBounds(rect3);
                }
                i90Var.draw(canvas);
                invalidate();
            }
            if (this.w != null) {
                canvas.save();
                canvas.translate(0.0f, this.y);
                textPaint.setAlpha((int) (this.J * 255.0f));
                this.w.draw(canvas);
                canvas.restore();
            }
            l5 l5Var = this.d;
            if (l5Var != null) {
                l5Var.setAlpha((int) (this.J * 255.0f));
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
        if (this.H && (i12 = this.G) > 0) {
            size = Math.min(size, i12);
        }
        this.G = size;
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        if (paddingLeft < 0) {
            paddingLeft = 0;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + a(paddingLeft, false), TLObject.FLAG_30));
    }
}
