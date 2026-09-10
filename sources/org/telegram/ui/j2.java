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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class j2 extends View implements org.telegram.ui.Cells.r9 {
    public final t70 a;
    public final h4 b;
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

    public j2(Context context, t70 t70Var, h4 h4Var) {
        super(context);
        this.s = AndroidUtilities.dp(18.0f);
        this.v = AndroidUtilities.dp(10.0f);
        this.a = t70Var;
        this.b = h4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.h = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
    }

    @Override // org.telegram.ui.Cells.r9
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
        t70 t70Var = this.a;
        int i11 = 0;
        if (c3Var != null) {
            j4.v(t70Var, canvas, this, 0);
            this.c.draw(canvas, this);
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (this.d != null) {
            canvas.translate(0.0f, this.w);
            j4.v(t70Var, canvas, this, i10);
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
            canvas.drawLine(dp, measuredHeight, measuredWidth - i11, getMeasuredHeight() - 1, j4.r1);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence j3;
        CharSequence j10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        c3 c3Var = this.c;
        h4 h4Var = this.b;
        t70 t70Var = this.a;
        if (c3Var != null && (j10 = j4.j(t70Var, h4Var, c3Var)) != null) {
            spannableStringBuilder.append(j10);
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null && (j3 = j4.j(t70Var, h4Var, c3Var2)) != null) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append(j3);
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
        char c10;
        float f7;
        boolean z10;
        int i13;
        String formatString;
        int size = View.MeasureSpec.getSize(i10);
        d4 d4Var = this.n;
        this.e = d4Var.b != d4Var.a.articles.size() - 1;
        d4 d4Var2 = this.n;
        TL_iv.pageRelatedArticle pagerelatedarticle = d4Var2.a.articles.get(d4Var2.b);
        int dp = AndroidUtilities.dp(SharedConfig.ivFontSize - 16);
        long j3 = pagerelatedarticle.photo_id;
        h4 h4Var = this.b;
        TLRPC.Photo e = j3 != 0 ? h4Var != null ? g4.e(h4Var.E, j3) : g4.d(j3, this.r) : null;
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
            c10 = 1;
            f7 = 6.0f;
            this.c = j4.p(this.a, this, str, null, i14, this.v, this.n, Layout.Alignment.ALIGN_NORMAL, 3, this.b);
        } else {
            i12 = dp2;
            c10 = 1;
            f7 = 6.0f;
        }
        c3 c3Var = this.c;
        int i15 = this.s;
        int i16 = this.v;
        if (c3Var != null) {
            int lineCount = c3Var.d.getLineCount();
            int i17 = 4 - lineCount;
            this.w = org.telegram.messenger.a2.C(f7, this.c.d.getHeight(), dp);
            dp5 = this.c.d.getHeight() + dp5;
            int i18 = 0;
            while (true) {
                if (i18 >= lineCount) {
                    z10 = false;
                    break;
                } else {
                    if (this.c.d.getLineLeft(i18) != 0.0f) {
                        z10 = true;
                        break;
                    }
                    i18++;
                }
            }
            c3 c3Var2 = this.c;
            c3Var2.s = i15;
            c3Var2.v = i16;
            i13 = i17;
        } else {
            this.w = 0;
            z10 = false;
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
            objArr[c10] = str2;
            formatString = LocaleController.formatString(i19, objArr);
        }
        c3 p5 = j4.p(this.a, this, formatString, null, i14, this.w + i16, this.n, ((h4Var == null || !h4Var.G) && !z10) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.uw0.a(), i13, this.b);
        this.d = p5;
        if (p5 != null) {
            int height = p5.d.getHeight() + dp5;
            if (this.c != null) {
                height = org.telegram.messenger.a2.C(f7, dp, height);
            }
            dp5 = height;
            c3 c3Var3 = this.d;
            c3Var3.s = i15;
            c3Var3.v = i16 + this.w;
        }
        setMeasuredDimension(size, Math.max(i12, dp5) + (this.e ? 1 : 0));
    }
}
