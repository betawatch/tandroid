package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class j2 extends View implements org.telegram.ui.Cells.n9 {
    public final f70 a;
    public final i4 b;
    public c3 c;
    public c3 d;
    public boolean e;
    public boolean f;
    public final ImageReceiver h;
    public d4 n;
    public TLObject r;
    public final int s;
    public final int v;
    public int w;

    public j2(Context context, f70 f70Var, i4 i4Var) {
        super(context);
        this.s = AndroidUtilities.dp(18.0f);
        this.v = AndroidUtilities.dp(10.0f);
        this.a = f70Var;
        this.b = i4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.h = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
    }

    @Override // org.telegram.ui.Cells.n9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.c;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null) {
            arrayList.add(c3Var2);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.c;
        if (c3Var != null) {
            c3Var.attach(this);
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null) {
            c3Var2.attach(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.c;
        if (c3Var != null) {
            c3Var.detach(this);
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null) {
            c3Var2.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        if (this.n == null) {
            return;
        }
        if (this.f) {
            this.h.draw(canvas);
        }
        canvas.save();
        canvas.translate(this.s, AndroidUtilities.dp(10.0f));
        c3 c3Var = this.c;
        f70 f70Var = this.a;
        int i11 = 0;
        if (c3Var != null) {
            k4.v(f70Var, canvas, this, 0);
            this.c.draw(canvas, this);
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (this.d != null) {
            canvas.translate(0.0f, this.w);
            k4.v(f70Var, canvas, this, i10);
            this.d.draw(canvas, this);
        }
        canvas.restore();
        if (this.e) {
            i4 i4Var = this.b;
            float dp = (i4Var == null || !i4Var.G) ? AndroidUtilities.dp(17.0f) : 0.0f;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (i4Var != null && i4Var.G) {
                i11 = AndroidUtilities.dp(17.0f);
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i11, getMeasuredHeight() - 1, k4.s1);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence j10;
        CharSequence j11;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        c3 c3Var = this.c;
        i4 i4Var = this.b;
        f70 f70Var = this.a;
        if (c3Var != null && (j11 = k4.j(f70Var, i4Var, c3Var)) != null) {
            spannableStringBuilder.append(j11);
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null && (j10 = k4.j(f70Var, i4Var, c3Var2)) != null) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append(j10);
        }
        if (spannableStringBuilder.length() == 0) {
            return;
        }
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) LocaleController.getString(R.string.AccDescrIVRelatedArticle));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        ImageReceiver imageReceiver;
        int i12;
        int i13;
        float f7;
        int i14;
        int i15;
        String format;
        int size = View.MeasureSpec.getSize(i10);
        d4 d4Var = this.n;
        this.e = d4Var.b != d4Var.a.articles.size() - 1;
        d4 d4Var2 = this.n;
        TL_iv.pageRelatedArticle pagerelatedarticle = d4Var2.a.articles.get(d4Var2.b);
        int dp = AndroidUtilities.dp(SharedConfig.ivFontSize - 16);
        long j10 = pagerelatedarticle.photo_id;
        i4 i4Var = this.b;
        TLRPC.Photo e = j10 != 0 ? i4Var != null ? g4.e(i4Var.E, j10) : g4.d(j10, this.r) : null;
        ImageReceiver imageReceiver2 = this.h;
        if (e != null) {
            this.f = true;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(e.sizes, AndroidUtilities.getPhotoSize());
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(e.sizes, 80, true);
            imageReceiver2.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, e), "64_64", ImageLocation.getForPhoto(closestPhotoSizeWithSize != closestPhotoSizeWithSize2 ? closestPhotoSizeWithSize2 : null, e), "64_64_b", closestPhotoSizeWithSize.size, null, this.r, 1);
            imageReceiver = imageReceiver2;
        } else {
            imageReceiver = imageReceiver2;
            this.f = false;
        }
        int dp2 = AndroidUtilities.dp(60.0f);
        int dp3 = size - AndroidUtilities.dp(36.0f);
        if (this.f) {
            float dp4 = AndroidUtilities.dp(44.0f);
            imageReceiver.setImageCoords((size - r4) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), dp4, dp4);
            dp3 = (int) (dp3 - (imageReceiver.getImageWidth() + AndroidUtilities.dp(6.0f)));
        }
        int i16 = dp3;
        int dp5 = AndroidUtilities.dp(18.0f);
        String str = pagerelatedarticle.title;
        if (str != null) {
            i13 = 1;
            i12 = dp2;
            f7 = 6.0f;
            this.c = k4.p(this.a, this, str, null, i16, this.v, this.n, Layout.Alignment.ALIGN_NORMAL, 3, this.b);
        } else {
            i12 = dp2;
            i13 = 1;
            f7 = 6.0f;
        }
        c3 c3Var = this.c;
        int i17 = this.s;
        int i18 = this.v;
        if (c3Var != null) {
            int lineCount = c3Var.d.getLineCount();
            i14 = 4 - lineCount;
            this.w = org.telegram.messenger.v0.C(f7, this.c.d.getHeight(), dp);
            dp5 = this.c.d.getHeight() + dp5;
            int i19 = 0;
            while (true) {
                if (i19 >= lineCount) {
                    i15 = 0;
                    break;
                } else {
                    if (this.c.d.getLineLeft(i19) != 0.0f) {
                        i15 = i13;
                        break;
                    }
                    i19++;
                }
            }
            c3 c3Var2 = this.c;
            c3Var2.s = i17;
            c3Var2.v = i18;
        } else {
            this.w = 0;
            i14 = 4;
            i15 = 0;
        }
        int i20 = i14;
        if (pagerelatedarticle.published_date != 0 && !TextUtils.isEmpty(pagerelatedarticle.author)) {
            int i21 = R.string.ArticleDateByAuthor;
            String format2 = LocaleController.getInstance().getChatFullDate().format(pagerelatedarticle.published_date * 1000);
            String str2 = pagerelatedarticle.author;
            Object[] objArr = new Object[2];
            objArr[0] = format2;
            objArr[i13] = str2;
            format = LocaleController.formatString(i21, objArr);
        } else if (TextUtils.isEmpty(pagerelatedarticle.author)) {
            format = pagerelatedarticle.published_date != 0 ? LocaleController.getInstance().getChatFullDate().format(pagerelatedarticle.published_date * 1000) : !TextUtils.isEmpty(pagerelatedarticle.description) ? pagerelatedarticle.description : pagerelatedarticle.url;
        } else {
            int i22 = R.string.ArticleByAuthor;
            Object[] objArr2 = new Object[i13];
            objArr2[0] = pagerelatedarticle.author;
            format = LocaleController.formatString(i22, objArr2);
        }
        c3 p5 = k4.p(this.a, this, format, null, i16, this.w + i18, this.n, ((i4Var == null || !i4Var.G) && i15 == 0) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.ix0.a(), i20, this.b);
        this.d = p5;
        if (p5 != null) {
            int height = p5.d.getHeight() + dp5;
            if (this.c != null) {
                height = org.telegram.messenger.v0.C(f7, dp, height);
            }
            dp5 = height;
            c3 c3Var3 = this.d;
            c3Var3.s = i17;
            c3Var3.v = i18 + this.w;
        }
        setMeasuredDimension(size, Math.max(i12, dp5) + (this.e ? 1 : 0));
    }
}
