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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class l2 extends View implements org.telegram.ui.Cells.m9 {
    public final a70 a;
    public final j4 b;
    public e3 c;
    public e3 d;
    public boolean e;
    public boolean f;
    public final ImageReceiver h;
    public f4 n;
    public TLObject r;
    public final int s;
    public final int v;
    public int w;

    public l2(Context context, a70 a70Var, j4 j4Var) {
        super(context);
        this.s = AndroidUtilities.dp(18.0f);
        this.v = AndroidUtilities.dp(10.0f);
        this.a = a70Var;
        this.b = j4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.h = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
    }

    @Override // org.telegram.ui.Cells.m9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        e3 e3Var = this.c;
        if (e3Var != null) {
            arrayList.add(e3Var);
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null) {
            arrayList.add(e3Var2);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e3 e3Var = this.c;
        if (e3Var != null) {
            e3Var.attach(this);
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null) {
            e3Var2.attach(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e3 e3Var = this.c;
        if (e3Var != null) {
            e3Var.detach(this);
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null) {
            e3Var2.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i9;
        if (this.n == null) {
            return;
        }
        if (this.f) {
            this.h.draw(canvas);
        }
        canvas.save();
        canvas.translate(this.s, AndroidUtilities.dp(10.0f));
        e3 e3Var = this.c;
        a70 a70Var = this.a;
        int i10 = 0;
        if (e3Var != null) {
            l4.v(a70Var, canvas, this, 0);
            this.c.draw(canvas, this);
            i9 = 1;
        } else {
            i9 = 0;
        }
        if (this.d != null) {
            canvas.translate(0.0f, this.w);
            l4.v(a70Var, canvas, this, i9);
            this.d.draw(canvas, this);
        }
        canvas.restore();
        if (this.e) {
            j4 j4Var = this.b;
            float dp = (j4Var == null || !j4Var.C) ? AndroidUtilities.dp(17.0f) : 0.0f;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (j4Var != null && j4Var.C) {
                i10 = AndroidUtilities.dp(17.0f);
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, l4.n1);
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
        e3 e3Var = this.c;
        j4 j4Var = this.b;
        a70 a70Var = this.a;
        if (e3Var != null && (j11 = l4.j(a70Var, j4Var, e3Var)) != null) {
            spannableStringBuilder.append(j11);
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null && (j10 = l4.j(a70Var, j4Var, e3Var2)) != null) {
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
    public final void onMeasure(int i9, int i10) {
        ImageReceiver imageReceiver;
        int i11;
        char c10;
        float f10;
        boolean z10;
        int i12;
        String formatString;
        int size = View.MeasureSpec.getSize(i9);
        f4 f4Var = this.n;
        this.e = f4Var.b != f4Var.a.articles.size() - 1;
        f4 f4Var2 = this.n;
        TL_iv.pageRelatedArticle pagerelatedarticle = f4Var2.a.articles.get(f4Var2.b);
        int dp = AndroidUtilities.dp(SharedConfig.ivFontSize - 16);
        long j10 = pagerelatedarticle.photo_id;
        j4 j4Var = this.b;
        TLRPC.Photo e10 = j10 != 0 ? j4Var != null ? i4.e(j4Var.A, j10) : i4.d(j10, this.r) : null;
        ImageReceiver imageReceiver2 = this.h;
        if (e10 != null) {
            this.f = true;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(e10.sizes, AndroidUtilities.getPhotoSize());
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(e10.sizes, 80, true);
            imageReceiver2.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, e10), "64_64", ImageLocation.getForPhoto(closestPhotoSizeWithSize != closestPhotoSizeWithSize2 ? closestPhotoSizeWithSize2 : null, e10), "64_64_b", closestPhotoSizeWithSize.size, null, this.r, 1);
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
        int i13 = dp3;
        int dp5 = AndroidUtilities.dp(18.0f);
        String str = pagerelatedarticle.title;
        if (str != null) {
            i11 = dp2;
            c10 = 1;
            f10 = 6.0f;
            this.c = l4.p(this.a, this, str, null, i13, this.v, this.n, Layout.Alignment.ALIGN_NORMAL, 3, this.b);
        } else {
            i11 = dp2;
            c10 = 1;
            f10 = 6.0f;
        }
        e3 e3Var = this.c;
        int i14 = this.s;
        int i15 = this.v;
        if (e3Var != null) {
            int lineCount = e3Var.d.getLineCount();
            int i16 = 4 - lineCount;
            this.w = org.telegram.messenger.l0.C(f10, this.c.d.getHeight(), dp);
            dp5 = this.c.d.getHeight() + dp5;
            int i17 = 0;
            while (true) {
                if (i17 >= lineCount) {
                    z10 = false;
                    break;
                } else {
                    if (this.c.d.getLineLeft(i17) != 0.0f) {
                        z10 = true;
                        break;
                    }
                    i17++;
                }
            }
            e3 e3Var2 = this.c;
            e3Var2.s = i14;
            e3Var2.v = i15;
            i12 = i16;
        } else {
            this.w = 0;
            z10 = false;
            i12 = 4;
        }
        if (pagerelatedarticle.published_date == 0 || TextUtils.isEmpty(pagerelatedarticle.author)) {
            formatString = !TextUtils.isEmpty(pagerelatedarticle.author) ? LocaleController.formatString(R.string.ArticleByAuthor, pagerelatedarticle.author) : pagerelatedarticle.published_date != 0 ? LocaleController.getInstance().getChatFullDate().format(pagerelatedarticle.published_date * 1000) : !TextUtils.isEmpty(pagerelatedarticle.description) ? pagerelatedarticle.description : pagerelatedarticle.url;
        } else {
            int i18 = R.string.ArticleDateByAuthor;
            String format = LocaleController.getInstance().getChatFullDate().format(pagerelatedarticle.published_date * 1000);
            String str2 = pagerelatedarticle.author;
            Object[] objArr = new Object[2];
            objArr[0] = format;
            objArr[c10] = str2;
            formatString = LocaleController.formatString(i18, objArr);
        }
        e3 p6 = l4.p(this.a, this, formatString, null, i13, this.w + i15, this.n, ((j4Var == null || !j4Var.C) && !z10) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.rv0.a(), i12, this.b);
        this.d = p6;
        if (p6 != null) {
            int height = p6.d.getHeight() + dp5;
            if (this.c != null) {
                height = org.telegram.messenger.l0.C(f10, dp, height);
            }
            dp5 = height;
            e3 e3Var3 = this.d;
            e3Var3.s = i14;
            e3Var3.v = i15 + this.w;
        }
        setMeasuredDimension(size, Math.max(i11, dp5) + (this.e ? 1 : 0));
    }
}
