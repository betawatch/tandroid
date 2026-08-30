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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class k2 extends View implements org.telegram.ui.Cells.l9 {
    public final n70 a;
    public final j4 b;
    public d3 c;
    public d3 d;
    public boolean e;
    public boolean f;
    public final ImageReceiver h;
    public f4 n;
    public TLObject r;
    public final int s;
    public final int v;
    public int w;

    public k2(Context context, n70 n70Var, j4 j4Var) {
        super(context);
        this.s = AndroidUtilities.dp(18.0f);
        this.v = AndroidUtilities.dp(10.0f);
        this.a = n70Var;
        this.b = j4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.h = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
    }

    @Override // org.telegram.ui.Cells.l9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            arrayList.add(d3Var2);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            d3Var2.attach(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            d3Var2.detach(this);
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
        d3 d3Var = this.c;
        n70 n70Var = this.a;
        int i11 = 0;
        if (d3Var != null) {
            l4.v(n70Var, canvas, this, 0);
            this.c.draw(canvas, this);
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (this.d != null) {
            canvas.translate(0.0f, this.w);
            l4.v(n70Var, canvas, this, i10);
            this.d.draw(canvas, this);
        }
        canvas.restore();
        if (this.e) {
            j4 j4Var = this.b;
            float dp = (j4Var == null || !j4Var.D) ? AndroidUtilities.dp(17.0f) : 0.0f;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (j4Var != null && j4Var.D) {
                i11 = AndroidUtilities.dp(17.0f);
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i11, getMeasuredHeight() - 1, l4.o1);
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
        d3 d3Var = this.c;
        j4 j4Var = this.b;
        n70 n70Var = this.a;
        if (d3Var != null && (j11 = l4.j(n70Var, j4Var, d3Var)) != null) {
            spannableStringBuilder.append(j11);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null && (j10 = l4.j(n70Var, j4Var, d3Var2)) != null) {
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
        char c3;
        float f10;
        boolean z4;
        int i13;
        String formatString;
        int size = View.MeasureSpec.getSize(i10);
        f4 f4Var = this.n;
        this.e = f4Var.b != f4Var.a.articles.size() - 1;
        f4 f4Var2 = this.n;
        TL_iv.pageRelatedArticle pagerelatedarticle = f4Var2.a.articles.get(f4Var2.b);
        int dp = AndroidUtilities.dp(SharedConfig.ivFontSize - 16);
        long j10 = pagerelatedarticle.photo_id;
        j4 j4Var = this.b;
        TLRPC.Photo e = j10 != 0 ? j4Var != null ? i4.e(j4Var.B, j10) : i4.d(j10, this.r) : null;
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
        int i14 = dp3;
        int dp5 = AndroidUtilities.dp(18.0f);
        String str = pagerelatedarticle.title;
        if (str != null) {
            i12 = dp2;
            c3 = 1;
            f10 = 6.0f;
            this.c = l4.p(this.a, this, str, null, i14, this.v, this.n, Layout.Alignment.ALIGN_NORMAL, 3, this.b);
        } else {
            i12 = dp2;
            c3 = 1;
            f10 = 6.0f;
        }
        d3 d3Var = this.c;
        int i15 = this.s;
        int i16 = this.v;
        if (d3Var != null) {
            int lineCount = d3Var.d.getLineCount();
            int i17 = 4 - lineCount;
            this.w = org.telegram.messenger.y3.C(f10, this.c.d.getHeight(), dp);
            dp5 = this.c.d.getHeight() + dp5;
            int i18 = 0;
            while (true) {
                if (i18 >= lineCount) {
                    z4 = false;
                    break;
                } else {
                    if (this.c.d.getLineLeft(i18) != 0.0f) {
                        z4 = true;
                        break;
                    }
                    i18++;
                }
            }
            d3 d3Var2 = this.c;
            d3Var2.s = i15;
            d3Var2.v = i16;
            i13 = i17;
        } else {
            this.w = 0;
            z4 = false;
            i13 = 4;
        }
        if (pagerelatedarticle.published_date == 0 || TextUtils.isEmpty(pagerelatedarticle.author)) {
            formatString = !TextUtils.isEmpty(pagerelatedarticle.author) ? LocaleController.formatString(R.string.ArticleByAuthor, pagerelatedarticle.author) : pagerelatedarticle.published_date != 0 ? LocaleController.getInstance().getChatFullDate().format(pagerelatedarticle.published_date * 1000) : !TextUtils.isEmpty(pagerelatedarticle.description) ? pagerelatedarticle.description : pagerelatedarticle.url;
        } else {
            int i19 = R.string.ArticleDateByAuthor;
            String format = LocaleController.getInstance().getChatFullDate().format(pagerelatedarticle.published_date * 1000);
            String str2 = pagerelatedarticle.author;
            Object[] objArr = new Object[2];
            objArr[0] = format;
            objArr[c3] = str2;
            formatString = LocaleController.formatString(i19, objArr);
        }
        d3 p10 = l4.p(this.a, this, formatString, null, i14, this.w + i16, this.n, ((j4Var == null || !j4Var.D) && !z4) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.kw0.a(), i13, this.b);
        this.d = p10;
        if (p10 != null) {
            int height = p10.d.getHeight() + dp5;
            if (this.c != null) {
                height = org.telegram.messenger.y3.C(f10, dp, height);
            }
            dp5 = height;
            d3 d3Var3 = this.d;
            d3Var3.s = i15;
            d3Var3.v = i16 + this.w;
        }
        setMeasuredDimension(size, Math.max(i12, dp5) + (this.e ? 1 : 0));
    }
}
