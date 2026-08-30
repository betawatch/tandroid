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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class b10 extends FrameLayout {
    public final boolean a;
    public final CharSequence b;
    public final a10 c;
    public final t5 d;
    public final /* synthetic */ c10 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b10(c10 c10Var, Context context, boolean z4, CharSequence charSequence, ArrayList arrayList, boolean z10) {
        super(context);
        float f10;
        org.telegram.ui.ActionBar.f6 f6Var;
        this.e = c10Var;
        this.a = z4;
        String string = LocaleController.getString(R.string.FolderLinkPreviewLeft);
        String string2 = LocaleController.getString(R.string.FolderLinkPreviewRight);
        CharSequence spannableStringBuilder = charSequence == null ? "" : new SpannableStringBuilder(charSequence);
        a10 a10Var = new a10(context);
        TextPaint textPaint = new TextPaint(1);
        a10Var.a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        Paint paint = new Paint(1);
        a10Var.b = paint;
        a10Var.c = new Path();
        float[] fArr = new float[8];
        a10Var.d = fArr;
        Paint paint2 = new Paint(1);
        a10Var.s = paint2;
        Paint paint3 = new Paint(1);
        a10Var.v = paint3;
        a10Var.w = new Matrix();
        a10Var.x = new Matrix();
        int i10 = org.telegram.ui.ActionBar.j6.Eh;
        textPaint.setColor(org.telegram.ui.ActionBar.j6.l1(0.8f, org.telegram.ui.ActionBar.j6.w0(null, i10, false)));
        textPaint.setTextSize(AndroidUtilities.dp(15.33f));
        textPaint.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.j6.o6;
        textPaint2.setColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        textPaint2.setTextSize(AndroidUtilities.dp(17.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Th, false));
        j6 j6Var = new j6(false, true, true, false);
        a10Var.y = j6Var;
        j6Var.k(0.3f, 250L, nr.h);
        j6Var.setCallback(a10Var);
        j6Var.t(AndroidUtilities.dp(11.66f));
        j6Var.r(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        j6Var.u(AndroidUtilities.bold());
        j6Var.b = 1;
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.8f, org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        if (string != null) {
            f10 = 15.33f;
            k01 k01Var = new k01(a10.a(string), 15.33f, AndroidUtilities.bold());
            k01Var.s(a10Var);
            k01Var.a.setColor(l1);
            a10Var.e = k01Var;
        } else {
            f10 = 15.33f;
        }
        CharSequence a2 = a10.a(spannableStringBuilder);
        k01 k01Var2 = new k01(a2, f10, AndroidUtilities.bold());
        k01Var2.s(a10Var);
        TextPaint textPaint3 = k01Var2.a;
        textPaint3.setColor(w02);
        a10Var.f = k01Var2;
        k01Var2.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(a2, textPaint3.getFontMetricsInt(), false), arrayList, textPaint3.getFontMetricsInt()));
        k01Var2.p(z10 ? 26 : 0);
        if (string2 != null) {
            k01 k01Var3 = new k01(a10.a(string2), 15.33f, AndroidUtilities.bold());
            k01Var3.s(a10Var);
            k01Var3.a.setColor(l1);
            a10Var.h = k01Var3;
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
        a10Var.n = linearGradient;
        paint2.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(80.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, tileMode);
        a10Var.r = linearGradient2;
        paint3.setShader(linearGradient2);
        paint3.setXfermode(new PorterDuffXfermode(mode));
        this.c = a10Var;
        addView(a10Var, k7.b6.d(-1, 44.0f, 55, 0.0f, 17.33f, 0.0f, 0.0f));
        t5 t5Var = new t5(context);
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        t5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        t5Var.setTextSize(1, 20.0f);
        t5Var.setTypeface(AndroidUtilities.bold());
        t5Var.setGravity(17);
        t5Var.setLineSpacing(AndroidUtilities.dp(-1.0f), 1.0f);
        CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) new SpannableStringBuilder(charSequence), t5Var.getPaint().getFontMetricsInt(), false, 0.8f);
        this.b = replaceEmoji;
        this.b = MessageObject.replaceAnimatedEmoji(replaceEmoji, arrayList, t5Var.getPaint().getFontMetricsInt(), false, 0.8f, 0);
        t5Var.setText(c10Var.y());
        t5Var.setCacheType(z10 ? 26 : 0);
        int i13 = org.telegram.ui.ActionBar.j6.Oh;
        f6Var = ((org.telegram.ui.ActionBar.g3) c10Var).resourcesProvider;
        t5Var.setEmojiColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        addView(t5Var, k7.b6.d(-1, -2.0f, 48, 32.0f, 78.3f, 32.0f, 0.0f));
        t5 t5Var2 = new t5(context);
        this.d = t5Var2;
        t5Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        t5Var2.setTextSize(1, 14.0f);
        t5Var2.setLines(2);
        t5Var2.setGravity(17);
        t5Var2.setLineSpacing(0.0f, 1.15f);
        addView(t5Var2, k7.b6.d(-1, -2.0f, 48, 32.0f, 113.0f, 32.0f, 0.0f));
        a();
    }

    public final void a() {
        c10 c10Var = this.e;
        ArrayList arrayList = c10Var.d0;
        boolean z4 = c10Var.Y;
        CharSequence charSequence = this.b;
        t5 t5Var = this.d;
        if (z4) {
            t5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleRemove, charSequence)));
            return;
        }
        if (!this.a) {
            if (arrayList == null || arrayList.isEmpty()) {
                t5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleAlready, charSequence)));
                return;
            } else {
                t5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitle, charSequence)));
                return;
            }
        }
        int size = arrayList != null ? arrayList.size() : 0;
        a10 a10Var = this.c;
        a10Var.y.q(size > 0 ? kh.a2.j(size, "+") : "", false, true);
        a10Var.invalidate();
        if (arrayList == null || arrayList.isEmpty()) {
            t5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleAlready, charSequence)));
        } else {
            t5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralSpannable("FolderLinkSubtitleChats", arrayList != null ? arrayList.size() : 0, charSequence)));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(172.0f), TLObject.FLAG_30));
    }
}
