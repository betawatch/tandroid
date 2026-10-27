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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class h2 extends View implements org.telegram.ui.Cells.r9 {
    public final j70 a;
    public final h4 b;
    public a3 c;
    public a3 d;
    public boolean e;
    public boolean f;
    public final ImageReceiver h;
    public c4 n;
    public TLObject r;
    public final int s;
    public final int v;
    public int w;

    public h2(Context context, j70 j70Var, h4 h4Var) {
        super(context);
        this.s = AndroidUtilities.dp(18.0f);
        this.v = AndroidUtilities.dp(10.0f);
        this.a = j70Var;
        this.b = h4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.h = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
    }

    @Override // org.telegram.ui.Cells.r9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            arrayList.add(a3Var2);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            a3Var2.attach(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            a3Var2.detach(this);
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
        a3 a3Var = this.c;
        j70 j70Var = this.a;
        int i11 = 0;
        if (a3Var != null) {
            j4.v(j70Var, canvas, this, 0);
            this.c.draw(canvas, this);
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (this.d != null) {
            canvas.translate(0.0f, this.w);
            j4.v(j70Var, canvas, this, i10);
            this.d.draw(canvas, this);
        }
        canvas.restore();
        if (this.e) {
            h4 h4Var = this.b;
            float dp = (h4Var == null || !h4Var.G) ? AndroidUtilities.dp(17.0f) : 0.0f;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (h4Var != null && h4Var.G) {
                i11 = AndroidUtilities.dp(17.0f);
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i11, getMeasuredHeight() - 1, j4.s1);
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
        a3 a3Var = this.c;
        h4 h4Var = this.b;
        j70 j70Var = this.a;
        if (a3Var != null && (j11 = j4.j(j70Var, h4Var, a3Var)) != null) {
            spannableStringBuilder.append(j11);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null && (j10 = j4.j(j70Var, h4Var, a3Var2)) != null) {
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
        c4 c4Var = this.n;
        this.e = c4Var.b != c4Var.a.articles.size() - 1;
        c4 c4Var2 = this.n;
        TL_iv.pageRelatedArticle pagerelatedarticle = c4Var2.a.articles.get(c4Var2.b);
        int dp = AndroidUtilities.dp(SharedConfig.ivFontSize - 16);
        long j10 = pagerelatedarticle.photo_id;
        h4 h4Var = this.b;
        TLRPC.Photo e = j10 != 0 ? h4Var != null ? f4.e(h4Var.E, j10) : f4.d(j10, this.r) : null;
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
            this.c = j4.p(this.a, this, str, null, i16, this.v, this.n, Layout.Alignment.ALIGN_NORMAL, 3, this.b);
        } else {
            i12 = dp2;
            i13 = 1;
            f7 = 6.0f;
        }
        a3 a3Var = this.c;
        int i17 = this.s;
        int i18 = this.v;
        if (a3Var != null) {
            int lineCount = a3Var.d.getLineCount();
            i14 = 4 - lineCount;
            this.w = org.telegram.messenger.t.D(f7, this.c.d.getHeight(), dp);
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
            a3 a3Var2 = this.c;
            a3Var2.s = i17;
            a3Var2.v = i18;
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
        a3 p10 = j4.p(this.a, this, format, null, i16, this.w + i18, this.n, ((h4Var == null || !h4Var.G) && i15 == 0) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.qx0.a(), i20, this.b);
        this.d = p10;
        if (p10 != null) {
            int height = p10.d.getHeight() + dp5;
            if (this.c != null) {
                height = org.telegram.messenger.t.D(f7, dp, height);
            }
            dp5 = height;
            a3 a3Var3 = this.d;
            a3Var3.s = i17;
            a3Var3.v = i18 + this.w;
        }
        setMeasuredDimension(size, Math.max(i12, dp5) + (this.e ? 1 : 0));
    }
}
