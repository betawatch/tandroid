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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ua0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
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
    public q5 d;
    public boolean e;
    public final h90 f;
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
    public ua0(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList, int i11) {
        super(context);
        String str;
        TLRPC.Document document;
        TLRPC.TL_messages_stickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        ArrayList<TLRPC.Document> arrayList2;
        this.c = new Rect();
        this.e = false;
        this.J = -1;
        this.K = true;
        this.M = 0.0f;
        this.a = i10;
        setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var), 0, 16));
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var));
        if (arrayList.size() > 1) {
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(i11 == 0 ? LocaleController.formatPluralString("MessageContainsEmojiPacks", arrayList.size(), new Object[0]) : LocaleController.formatPluralString("MessageContainsReactionsPacks", arrayList.size(), new Object[0]));
            this.n = replaceTags;
            e51[] e51VarArr = (e51[]) replaceTags.getSpans(0, replaceTags.length(), e51.class);
            for (int i12 = 0; e51VarArr != null && i12 < e51VarArr.length; i12++) {
                int spanStart = replaceTags.getSpanStart(e51VarArr[i12]);
                int spanEnd = replaceTags.getSpanEnd(e51VarArr[i12]);
                replaceTags.removeSpan(e51VarArr[i12]);
                replaceTags.setSpan(new ji.c6(1, this), spanStart, spanEnd, 33);
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
            h90 h90Var = new h90(f6Var);
            this.f = h90Var;
            h90Var.l = org.telegram.ui.ActionBar.j6.G8;
            h90Var.m = org.telegram.ui.ActionBar.j6.i6;
            h90Var.j(4.0f);
            return;
        }
        SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(document));
        spannableString.setSpan(new ra0(this, document, this.h.getFontMetricsInt()), 0, spannableString.length(), 33);
        q5 m10 = q5.m(i10, 0, document);
        this.d = m10;
        m10.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.n6, f6Var), PorterDuff.Mode.SRC_IN));
        this.d.a(this);
        SpannableString spannableString2 = new SpannableString(str);
        spannableString2.setSpan(new ji.c6(1, this), 0, spannableString2.length(), 33);
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
                h90 h90Var = this.f;
                if (h90Var != null && this.O == null) {
                    int lineCount = staticLayout.getLineCount() - 1;
                    this.x = AndroidUtilities.dp(2.0f) + ((int) this.r.getPrimaryHorizontal(charSequence2.length()));
                    this.y = this.r.getLineTop(lineCount);
                    this.E = r3 - this.y;
                    float min = Math.min(AndroidUtilities.dp(100.0f), this.r.getWidth() - this.x);
                    if (this.N == null) {
                        this.N = new Rect();
                    }
                    Rect rect = this.N;
                    int i12 = this.x;
                    rect.set(i12, this.y, (int) (i12 + min), r3);
                    h90Var.setBounds(this.N);
                    this.e = true;
                }
            } else {
                this.r = null;
                this.e = false;
            }
            this.G = charSequence2;
            this.F = i10;
        }
        SpannableStringBuilder spannableStringBuilder = this.v;
        if (spannableStringBuilder != this.I || this.H != i10) {
            if (spannableStringBuilder != null) {
                SpannableStringBuilder spannableStringBuilder2 = this.v;
                i11 = i10;
                this.w = new StaticLayout(spannableStringBuilder2, 0, spannableStringBuilder2.length(), textPaint, i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                i11 = i10;
                this.w = null;
            }
            this.I = this.v;
            this.H = i11;
        }
        StaticLayout staticLayout2 = this.r;
        int height = staticLayout2 != null ? staticLayout2.getHeight() : 0;
        if (this.w != null) {
            f7 = (r14.getHeight() - this.E) * (z10 ? 1.0f : this.M);
        } else {
            f7 = 0.0f;
        }
        return height + ((int) f7);
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
        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i12).getStickerSet(this.b, false);
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
        q5 m10 = q5.m(i12, 0, document);
        this.d = m10;
        m10.a(this);
        invalidate();
        SpannableString spannableString = new SpannableString(" ");
        spannableString.setSpan(new sa0(this, 0), 0, 1, 33);
        SpannableString spannableString2 = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(document));
        spannableString2.setSpan(new ta0(this, document, this.h.getFontMetricsInt()), 0, spannableString2.length(), 33);
        SpannableString spannableString3 = new SpannableString(str);
        spannableString3.setSpan(new ji.c6(1, this), 0, spannableString3.length(), 33);
        this.v = new SpannableStringBuilder().append((CharSequence) spannableString).append((CharSequence) spannableString2).append(' ').append((CharSequence) spannableString3).append((CharSequence) this.s);
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int a2 = a((this.J - getPaddingLeft()) - getPaddingRight(), true);
        if (this.N != null && this.w != null) {
            if (this.O == null) {
                this.O = new Rect();
            }
            StaticLayout staticLayout = this.w;
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
        boolean z10 = Math.abs(measuredHeight - a2) > AndroidUtilities.dp(3.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M, 1.0f);
        this.L = ofFloat;
        ofFloat.addUpdateListener(new ah.l0(8, this, z10));
        this.L.setInterpolator(pr.h);
        this.L.setStartDelay(150L);
        this.L.setDuration(400L);
        this.L.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        q5 q5Var = this.d;
        if (q5Var != null) {
            q5Var.a(this);
        }
        NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q5 q5Var = this.d;
        if (q5Var != null) {
            q5Var.o(this);
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
            h90 h90Var = this.f;
            if (h90Var != null && this.e) {
                h90Var.setAlpha((int) ((1.0f - this.M) * 255.0f));
                Rect rect2 = this.N;
                if (rect2 != null && (rect = this.O) != null) {
                    float f7 = this.M;
                    Rect rect3 = AndroidUtilities.rectTmp2;
                    AndroidUtilities.lerp(rect2, rect, f7, rect3);
                    h90Var.setBounds(rect3);
                }
                h90Var.draw(canvas);
                invalidate();
            }
            if (this.w != null) {
                canvas.save();
                canvas.translate(0.0f, this.y);
                textPaint.setAlpha((int) (this.M * 255.0f));
                this.w.draw(canvas);
                canvas.restore();
            }
            q5 q5Var = this.d;
            if (q5Var != null) {
                q5Var.setAlpha((int) (this.M * 255.0f));
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
}
