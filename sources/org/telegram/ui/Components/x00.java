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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class x00 extends FrameLayout {
    public final boolean a;
    public final CharSequence b;
    public final w00 c;
    public final x5 d;
    public final /* synthetic */ y00 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x00(y00 y00Var, Context context, boolean z10, CharSequence charSequence, ArrayList arrayList, boolean z11) {
        super(context);
        float f9;
        org.telegram.ui.ActionBar.c6 c6Var;
        this.e = y00Var;
        this.a = z10;
        String string = LocaleController.getString(R.string.FolderLinkPreviewLeft);
        String string2 = LocaleController.getString(R.string.FolderLinkPreviewRight);
        CharSequence spannableStringBuilder = charSequence == null ? "" : new SpannableStringBuilder(charSequence);
        w00 w00Var = new w00(context);
        TextPaint textPaint = new TextPaint(1);
        w00Var.a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        Paint paint = new Paint(1);
        w00Var.b = paint;
        w00Var.c = new Path();
        float[] fArr = new float[8];
        w00Var.d = fArr;
        Paint paint2 = new Paint(1);
        w00Var.s = paint2;
        Paint paint3 = new Paint(1);
        w00Var.v = paint3;
        w00Var.w = new Matrix();
        w00Var.x = new Matrix();
        int i10 = org.telegram.ui.ActionBar.g6.Eh;
        textPaint.setColor(org.telegram.ui.ActionBar.g6.l1(0.8f, org.telegram.ui.ActionBar.g6.w0(null, i10, false)));
        textPaint.setTextSize(AndroidUtilities.dp(15.33f));
        textPaint.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.g6.o6;
        textPaint2.setColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        textPaint2.setTextSize(AndroidUtilities.dp(17.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Th, false));
        n6 n6Var = new n6(false, true, true, false);
        w00Var.y = n6Var;
        n6Var.k(0.3f, 250L, jr.h);
        n6Var.setCallback(w00Var);
        n6Var.t(AndroidUtilities.dp(11.66f));
        n6Var.r(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
        n6Var.u(AndroidUtilities.bold());
        n6Var.b = 1;
        int l1 = org.telegram.ui.ActionBar.g6.l1(0.8f, org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        if (string != null) {
            f9 = 15.33f;
            zz0 zz0Var = new zz0(w00.a(string), 15.33f, AndroidUtilities.bold());
            zz0Var.s(w00Var);
            zz0Var.a.setColor(l1);
            w00Var.e = zz0Var;
        } else {
            f9 = 15.33f;
        }
        CharSequence a2 = w00.a(spannableStringBuilder);
        zz0 zz0Var2 = new zz0(a2, f9, AndroidUtilities.bold());
        zz0Var2.s(w00Var);
        TextPaint textPaint3 = zz0Var2.a;
        textPaint3.setColor(w02);
        w00Var.f = zz0Var2;
        zz0Var2.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(a2, textPaint3.getFontMetricsInt(), false), arrayList, textPaint3.getFontMetricsInt()));
        zz0Var2.p(z11 ? 26 : 0);
        if (string2 != null) {
            zz0 zz0Var3 = new zz0(w00.a(string2), 15.33f, AndroidUtilities.bold());
            zz0Var3.s(w00Var);
            zz0Var3.a.setColor(l1);
            w00Var.h = zz0Var3;
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
        w00Var.n = linearGradient;
        paint2.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(80.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, tileMode);
        w00Var.r = linearGradient2;
        paint3.setShader(linearGradient2);
        paint3.setXfermode(new PorterDuffXfermode(mode));
        this.c = w00Var;
        addView(w00Var, i7.f6.d(-1, 44.0f, 55, 0.0f, 17.33f, 0.0f, 0.0f));
        x5 x5Var = new x5(context);
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        x5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        x5Var.setTextSize(1, 20.0f);
        x5Var.setTypeface(AndroidUtilities.bold());
        x5Var.setGravity(17);
        x5Var.setLineSpacing(AndroidUtilities.dp(-1.0f), 1.0f);
        CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) new SpannableStringBuilder(charSequence), x5Var.getPaint().getFontMetricsInt(), false, 0.8f);
        this.b = replaceEmoji;
        this.b = MessageObject.replaceAnimatedEmoji(replaceEmoji, arrayList, x5Var.getPaint().getFontMetricsInt(), false, 0.8f, 0);
        x5Var.setText(y00Var.y());
        x5Var.setCacheType(z11 ? 26 : 0);
        int i13 = org.telegram.ui.ActionBar.g6.Oh;
        c6Var = ((org.telegram.ui.ActionBar.f3) y00Var).resourcesProvider;
        x5Var.setEmojiColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
        addView(x5Var, i7.f6.d(-1, -2.0f, 48, 32.0f, 78.3f, 32.0f, 0.0f));
        x5 x5Var2 = new x5(context);
        this.d = x5Var2;
        x5Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        x5Var2.setTextSize(1, 14.0f);
        x5Var2.setLines(2);
        x5Var2.setGravity(17);
        x5Var2.setLineSpacing(0.0f, 1.15f);
        addView(x5Var2, i7.f6.d(-1, -2.0f, 48, 32.0f, 113.0f, 32.0f, 0.0f));
        a();
    }

    public final void a() {
        y00 y00Var = this.e;
        ArrayList arrayList = y00Var.c0;
        boolean z10 = y00Var.X;
        CharSequence charSequence = this.b;
        x5 x5Var = this.d;
        if (z10) {
            x5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleRemove, charSequence)));
            return;
        }
        if (!this.a) {
            if (arrayList == null || arrayList.isEmpty()) {
                x5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleAlready, charSequence)));
                return;
            } else {
                x5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitle, charSequence)));
                return;
            }
        }
        int size = arrayList != null ? arrayList.size() : 0;
        w00 w00Var = this.c;
        w00Var.y.q(size > 0 ? j7.l1.k(size, "+") : "", false, true);
        w00Var.invalidate();
        if (arrayList == null || arrayList.isEmpty()) {
            x5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleAlready, charSequence)));
        } else {
            x5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralSpannable("FolderLinkSubtitleChats", arrayList != null ? arrayList.size() : 0, charSequence)));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(172.0f), TLObject.FLAG_30));
    }
}
