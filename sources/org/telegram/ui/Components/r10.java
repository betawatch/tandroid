package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class r10 extends FrameLayout {
    public final boolean a;
    public final CharSequence b;
    public final q10 c;
    public final a6 d;
    public final /* synthetic */ s10 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r10(s10 s10Var, Context context, boolean z10, CharSequence charSequence, ArrayList arrayList, boolean z11) {
        super(context);
        float f7;
        org.telegram.ui.ActionBar.e6 e6Var;
        this.e = s10Var;
        this.a = z10;
        String string = LocaleController.getString(R.string.FolderLinkPreviewLeft);
        String string2 = LocaleController.getString(R.string.FolderLinkPreviewRight);
        CharSequence spannableStringBuilder = charSequence == null ? "" : new SpannableStringBuilder(charSequence);
        q10 q10Var = new q10(context);
        TextPaint textPaint = new TextPaint(1);
        q10Var.a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        Paint paint = new Paint(1);
        q10Var.b = paint;
        q10Var.c = new Path();
        float[] fArr = new float[8];
        q10Var.d = fArr;
        Paint paint2 = new Paint(1);
        q10Var.s = paint2;
        Paint paint3 = new Paint(1);
        q10Var.v = paint3;
        q10Var.w = new Matrix();
        q10Var.x = new Matrix();
        int i10 = org.telegram.ui.ActionBar.i6.Eh;
        textPaint.setColor(org.telegram.ui.ActionBar.i6.m1(0.8f, org.telegram.ui.ActionBar.i6.x0(null, i10, false)));
        textPaint.setTextSize(AndroidUtilities.dp(15.33f));
        textPaint.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.i6.o6;
        textPaint2.setColor(org.telegram.ui.ActionBar.i6.x0(null, i11, false));
        textPaint2.setTextSize(AndroidUtilities.dp(17.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        paint.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Th, false));
        q6 q6Var = new q6(false, true, true);
        q10Var.y = q6Var;
        q6Var.n(0.3f, 250L, hs.h);
        q6Var.setCallback(q10Var);
        q6Var.w(AndroidUtilities.dp(11.66f));
        q6Var.u(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.d6, false));
        q6Var.x(AndroidUtilities.bold());
        q6Var.b = 1;
        int m12 = org.telegram.ui.ActionBar.i6.m1(0.8f, org.telegram.ui.ActionBar.i6.x0(null, i10, false));
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, i11, false);
        if (string != null) {
            f7 = 15.33f;
            l11 l11Var = new l11(q10.a(string), 15.33f, AndroidUtilities.bold());
            l11Var.s(q10Var);
            l11Var.a.setColor(m12);
            q10Var.e = l11Var;
        } else {
            f7 = 15.33f;
        }
        CharSequence a2 = q10.a(spannableStringBuilder);
        l11 l11Var2 = new l11(a2, f7, AndroidUtilities.bold());
        l11Var2.s(q10Var);
        TextPaint textPaint3 = l11Var2.a;
        textPaint3.setColor(x02);
        q10Var.f = l11Var2;
        l11Var2.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(a2, textPaint3.getFontMetricsInt(), false), arrayList, textPaint3.getFontMetricsInt()));
        l11Var2.p(z11 ? 26 : 0);
        if (string2 != null) {
            l11 l11Var3 = new l11(q10.a(string2), 15.33f, AndroidUtilities.bold());
            l11Var3.s(q10Var);
            l11Var3.a.setColor(m12);
            q10Var.h = l11Var3;
        }
        float dp = AndroidUtilities.dp(3.0f);
        fArr[3] = dp;
        fArr[2] = dp;
        fArr[1] = dp;
        fArr[0] = dp;
        float dp2 = AndroidUtilities.dp(1.0f);
        fArr[7] = dp2;
        fArr[6] = dp2;
        fArr[5] = dp2;
        fArr[4] = dp2;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(80.0f), 0.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, tileMode);
        q10Var.n = linearGradient;
        paint2.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(80.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, tileMode);
        q10Var.r = linearGradient2;
        paint3.setShader(linearGradient2);
        paint3.setXfermode(new PorterDuffXfermode(mode));
        this.c = q10Var;
        addView(q10Var, w7.x5.a(44.0f, 0.0f, 17.33f, 0.0f, 0.0f, -1, 55));
        a6 a6Var = new a6(context);
        int i12 = org.telegram.ui.ActionBar.i6.G6;
        a6Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i12, false));
        a6Var.setTextSize(1, 20.0f);
        a6Var.setTypeface(AndroidUtilities.bold());
        a6Var.setGravity(17);
        a6Var.setLineSpacing(AndroidUtilities.dp(-1.0f), 1.0f);
        CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) new SpannableStringBuilder(charSequence), a6Var.getPaint().getFontMetricsInt(), false, 0.8f);
        this.b = replaceEmoji;
        this.b = MessageObject.replaceAnimatedEmoji(replaceEmoji, arrayList, a6Var.getPaint().getFontMetricsInt(), false, 0.8f, 0);
        a6Var.setText(s10Var.B());
        a6Var.setCacheType(z11 ? 26 : 0);
        int i13 = org.telegram.ui.ActionBar.i6.Oh;
        e6Var = ((org.telegram.ui.ActionBar.f3) s10Var).resourcesProvider;
        a6Var.setEmojiColor(org.telegram.ui.ActionBar.i6.w0(i13, e6Var));
        addView(a6Var, w7.x5.a(-2.0f, 32.0f, 78.3f, 32.0f, 0.0f, -1, 48));
        a6 a6Var2 = new a6(context);
        this.d = a6Var2;
        a6Var2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i12, false));
        a6Var2.setTextSize(1, 14.0f);
        a6Var2.setLines(2);
        a6Var2.setGravity(17);
        a6Var2.setLineSpacing(0.0f, 1.15f);
        addView(a6Var2, w7.x5.a(-2.0f, 32.0f, 113.0f, 32.0f, 0.0f, -1, 48));
        a();
    }

    public final void a() {
        s10 s10Var = this.e;
        ArrayList arrayList = s10Var.g0;
        boolean z10 = s10Var.b0;
        CharSequence charSequence = this.b;
        a6 a6Var = this.d;
        if (z10) {
            a6Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleRemove, charSequence)));
            return;
        }
        if (!this.a) {
            if (arrayList == null || arrayList.isEmpty()) {
                a6Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleAlready, charSequence)));
                return;
            } else {
                a6Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitle, charSequence)));
                return;
            }
        }
        int size = arrayList != null ? arrayList.size() : 0;
        q10 q10Var = this.c;
        q10Var.y.t(size > 0 ? hg.c.h(size, "+") : "", false, true);
        q10Var.invalidate();
        if (arrayList == null || arrayList.isEmpty()) {
            a6Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleAlready, charSequence)));
        } else {
            a6Var.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralSpannable("FolderLinkSubtitleChats", arrayList != null ? arrayList.size() : 0, charSequence)));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(172.0f), TLObject.FLAG_30));
    }
}
