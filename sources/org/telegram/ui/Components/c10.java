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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class c10 extends FrameLayout {
    public final boolean a;
    public final CharSequence b;
    public final b10 c;
    public final y5 d;
    public final /* synthetic */ d10 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c10(d10 d10Var, Context context, boolean z10, CharSequence charSequence, ArrayList arrayList, boolean z11) {
        super(context);
        float f7;
        org.telegram.ui.ActionBar.d6 d6Var;
        this.e = d10Var;
        this.a = z10;
        String string = LocaleController.getString(R.string.FolderLinkPreviewLeft);
        String string2 = LocaleController.getString(R.string.FolderLinkPreviewRight);
        CharSequence spannableStringBuilder = charSequence == null ? "" : new SpannableStringBuilder(charSequence);
        b10 b10Var = new b10(context);
        TextPaint textPaint = new TextPaint(1);
        b10Var.a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        Paint paint = new Paint(1);
        b10Var.b = paint;
        b10Var.c = new Path();
        float[] fArr = new float[8];
        b10Var.d = fArr;
        Paint paint2 = new Paint(1);
        b10Var.s = paint2;
        Paint paint3 = new Paint(1);
        b10Var.v = paint3;
        b10Var.w = new Matrix();
        b10Var.x = new Matrix();
        int i10 = org.telegram.ui.ActionBar.h6.Eh;
        textPaint.setColor(org.telegram.ui.ActionBar.h6.l1(0.8f, org.telegram.ui.ActionBar.h6.w0(null, i10, false)));
        textPaint.setTextSize(AndroidUtilities.dp(15.33f));
        textPaint.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.h6.o6;
        textPaint2.setColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
        textPaint2.setTextSize(AndroidUtilities.dp(17.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Th, false));
        o6 o6Var = new o6(false, true, true, false);
        b10Var.y = o6Var;
        o6Var.k(0.3f, 250L, rr.h);
        o6Var.setCallback(b10Var);
        o6Var.t(AndroidUtilities.dp(11.66f));
        o6Var.r(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
        o6Var.u(AndroidUtilities.bold());
        o6Var.b = 1;
        int l1 = org.telegram.ui.ActionBar.h6.l1(0.8f, org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, i11, false);
        if (string != null) {
            f7 = 15.33f;
            t01 t01Var = new t01(b10.a(string), 15.33f, AndroidUtilities.bold());
            t01Var.s(b10Var);
            t01Var.a.setColor(l1);
            b10Var.e = t01Var;
        } else {
            f7 = 15.33f;
        }
        CharSequence a2 = b10.a(spannableStringBuilder);
        t01 t01Var2 = new t01(a2, f7, AndroidUtilities.bold());
        t01Var2.s(b10Var);
        TextPaint textPaint3 = t01Var2.a;
        textPaint3.setColor(w02);
        b10Var.f = t01Var2;
        t01Var2.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(a2, textPaint3.getFontMetricsInt(), false), arrayList, textPaint3.getFontMetricsInt()));
        t01Var2.p(z11 ? 26 : 0);
        if (string2 != null) {
            t01 t01Var3 = new t01(b10.a(string2), 15.33f, AndroidUtilities.bold());
            t01Var3.s(b10Var);
            t01Var3.a.setColor(l1);
            b10Var.h = t01Var3;
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
        b10Var.n = linearGradient;
        paint2.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(80.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, tileMode);
        b10Var.r = linearGradient2;
        paint3.setShader(linearGradient2);
        paint3.setXfermode(new PorterDuffXfermode(mode));
        this.c = b10Var;
        addView(b10Var, w7.y5.d(-1, 44.0f, 55, 0.0f, 17.33f, 0.0f, 0.0f));
        y5 y5Var = new y5(context);
        int i12 = org.telegram.ui.ActionBar.h6.G6;
        y5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false));
        y5Var.setTextSize(1, 20.0f);
        y5Var.setTypeface(AndroidUtilities.bold());
        y5Var.setGravity(17);
        y5Var.setLineSpacing(AndroidUtilities.dp(-1.0f), 1.0f);
        CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) new SpannableStringBuilder(charSequence), y5Var.getPaint().getFontMetricsInt(), false, 0.8f);
        this.b = replaceEmoji;
        this.b = MessageObject.replaceAnimatedEmoji(replaceEmoji, arrayList, y5Var.getPaint().getFontMetricsInt(), false, 0.8f, 0);
        y5Var.setText(d10Var.y());
        y5Var.setCacheType(z11 ? 26 : 0);
        int i13 = org.telegram.ui.ActionBar.h6.Oh;
        d6Var = ((org.telegram.ui.ActionBar.e3) d10Var).resourcesProvider;
        y5Var.setEmojiColor(org.telegram.ui.ActionBar.h6.v0(i13, d6Var));
        addView(y5Var, w7.y5.d(-1, -2.0f, 48, 32.0f, 78.3f, 32.0f, 0.0f));
        y5 y5Var2 = new y5(context);
        this.d = y5Var2;
        y5Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false));
        y5Var2.setTextSize(1, 14.0f);
        y5Var2.setLines(2);
        y5Var2.setGravity(17);
        y5Var2.setLineSpacing(0.0f, 1.15f);
        addView(y5Var2, w7.y5.d(-1, -2.0f, 48, 32.0f, 113.0f, 32.0f, 0.0f));
        a();
    }

    public final void a() {
        d10 d10Var = this.e;
        ArrayList arrayList = d10Var.g0;
        boolean z10 = d10Var.b0;
        CharSequence charSequence = this.b;
        y5 y5Var = this.d;
        if (z10) {
            y5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleRemove, charSequence)));
            return;
        }
        if (!this.a) {
            if (arrayList == null || arrayList.isEmpty()) {
                y5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleAlready, charSequence)));
                return;
            } else {
                y5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitle, charSequence)));
                return;
            }
        }
        int size = arrayList != null ? arrayList.size() : 0;
        b10 b10Var = this.c;
        b10Var.y.q(size > 0 ? hg.c.h(size, "+") : "", false, true);
        b10Var.invalidate();
        if (arrayList == null || arrayList.isEmpty()) {
            y5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleAlready, charSequence)));
        } else {
            y5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralSpannable("FolderLinkSubtitleChats", arrayList != null ? arrayList.size() : 0, charSequence)));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(172.0f), TLObject.FLAG_30));
    }
}
