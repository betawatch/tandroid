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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class m2 extends View implements org.telegram.ui.Cells.k9 {
    public final p70 a;
    public final l4 b;
    public f3 c;
    public f3 d;
    public boolean e;
    public boolean f;
    public final ImageReceiver h;
    public h4 n;
    public TLObject r;
    public final int s;
    public final int v;
    public int w;

    public m2(Context context, p70 p70Var, l4 l4Var) {
        super(context);
        this.s = AndroidUtilities.dp(18.0f);
        this.v = AndroidUtilities.dp(10.0f);
        this.a = p70Var;
        this.b = l4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.h = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
    }

    @Override // org.telegram.ui.Cells.k9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            arrayList.add(f3Var2);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            f3Var2.attach(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            f3Var2.detach(this);
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
        f3 f3Var = this.c;
        p70 p70Var = this.a;
        int i11 = 0;
        if (f3Var != null) {
            n4.v(p70Var, canvas, this, 0);
            this.c.draw(canvas, this);
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (this.d != null) {
            canvas.translate(0.0f, this.w);
            n4.v(p70Var, canvas, this, i10);
            this.d.draw(canvas, this);
        }
        canvas.restore();
        if (this.e) {
            l4 l4Var = this.b;
            float dp = (l4Var == null || !l4Var.D) ? AndroidUtilities.dp(17.0f) : 0.0f;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (l4Var != null && l4Var.D) {
                i11 = AndroidUtilities.dp(17.0f);
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i11, getMeasuredHeight() - 1, n4.o1);
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
        f3 f3Var = this.c;
        l4 l4Var = this.b;
        p70 p70Var = this.a;
        if (f3Var != null && (j11 = n4.j(p70Var, l4Var, f3Var)) != null) {
            spannableStringBuilder.append(j11);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null && (j10 = n4.j(p70Var, l4Var, f3Var2)) != null) {
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
        h4 h4Var = this.n;
        this.e = h4Var.b != h4Var.a.articles.size() - 1;
        h4 h4Var2 = this.n;
        TL_iv.pageRelatedArticle pagerelatedarticle = h4Var2.a.articles.get(h4Var2.b);
        int dp = AndroidUtilities.dp(SharedConfig.ivFontSize - 16);
        long j10 = pagerelatedarticle.photo_id;
        l4 l4Var = this.b;
        TLRPC.Photo e = j10 != 0 ? l4Var != null ? k4.e(l4Var.B, j10) : k4.d(j10, this.r) : null;
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
            this.c = n4.p(this.a, this, str, null, i14, this.v, this.n, Layout.Alignment.ALIGN_NORMAL, 3, this.b);
        } else {
            i12 = dp2;
            c3 = 1;
            f10 = 6.0f;
        }
        f3 f3Var = this.c;
        int i15 = this.s;
        int i16 = this.v;
        if (f3Var != null) {
            int lineCount = f3Var.d.getLineCount();
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
            f3 f3Var2 = this.c;
            f3Var2.s = i15;
            f3Var2.v = i16;
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
        f3 p10 = n4.p(this.a, this, formatString, null, i14, this.w + i16, this.n, ((l4Var == null || !l4Var.D) && !z4) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.kw0.a(), i13, this.b);
        this.d = p10;
        if (p10 != null) {
            int height = p10.d.getHeight() + dp5;
            if (this.c != null) {
                height = org.telegram.messenger.y3.C(f10, dp, height);
            }
            dp5 = height;
            f3 f3Var3 = this.d;
            f3Var3.s = i15;
            f3Var3.v = i16 + this.w;
        }
        setMeasuredDimension(size, Math.max(i12, dp5) + (this.e ? 1 : 0));
    }
}
