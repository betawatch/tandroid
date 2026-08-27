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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class p00 extends FrameLayout {
    public final boolean a;
    public final CharSequence b;
    public final o00 c;
    public final s5 d;
    public final /* synthetic */ q00 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p00(q00 q00Var, Context context, boolean z10, CharSequence charSequence, ArrayList arrayList, boolean z11) {
        super(context);
        float f10;
        org.telegram.ui.ActionBar.c6 c6Var;
        this.e = q00Var;
        this.a = z10;
        String string = LocaleController.getString(R.string.FolderLinkPreviewLeft);
        String string2 = LocaleController.getString(R.string.FolderLinkPreviewRight);
        CharSequence spannableStringBuilder = charSequence == null ? "" : new SpannableStringBuilder(charSequence);
        o00 o00Var = new o00(context);
        TextPaint textPaint = new TextPaint(1);
        o00Var.a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        Paint paint = new Paint(1);
        o00Var.b = paint;
        o00Var.c = new Path();
        float[] fArr = new float[8];
        o00Var.d = fArr;
        Paint paint2 = new Paint(1);
        o00Var.s = paint2;
        Paint paint3 = new Paint(1);
        o00Var.v = paint3;
        o00Var.w = new Matrix();
        o00Var.x = new Matrix();
        int i10 = org.telegram.ui.ActionBar.g6.Eh;
        textPaint.setColor(org.telegram.ui.ActionBar.g6.l1(0.8f, org.telegram.ui.ActionBar.g6.w0(null, i10, false)));
        textPaint.setTextSize(AndroidUtilities.dp(15.33f));
        textPaint.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.g6.o6;
        textPaint2.setColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        textPaint2.setTextSize(AndroidUtilities.dp(17.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Th, false));
        i6 i6Var = new i6(false, true, true, false);
        o00Var.y = i6Var;
        i6Var.k(0.3f, 250L, er.h);
        i6Var.setCallback(o00Var);
        i6Var.t(AndroidUtilities.dp(11.66f));
        i6Var.r(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
        i6Var.u(AndroidUtilities.bold());
        i6Var.b = 1;
        int l1 = org.telegram.ui.ActionBar.g6.l1(0.8f, org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        if (string != null) {
            f10 = 15.33f;
            pz0 pz0Var = new pz0(o00.a(string), 15.33f, AndroidUtilities.bold());
            pz0Var.s(o00Var);
            pz0Var.a.setColor(l1);
            o00Var.e = pz0Var;
        } else {
            f10 = 15.33f;
        }
        CharSequence a2 = o00.a(spannableStringBuilder);
        pz0 pz0Var2 = new pz0(a2, f10, AndroidUtilities.bold());
        pz0Var2.s(o00Var);
        TextPaint textPaint3 = pz0Var2.a;
        textPaint3.setColor(w02);
        o00Var.f = pz0Var2;
        pz0Var2.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(a2, textPaint3.getFontMetricsInt(), false), arrayList, textPaint3.getFontMetricsInt()));
        pz0Var2.p(z11 ? 26 : 0);
        if (string2 != null) {
            pz0 pz0Var3 = new pz0(o00.a(string2), 15.33f, AndroidUtilities.bold());
            pz0Var3.s(o00Var);
            pz0Var3.a.setColor(l1);
            o00Var.h = pz0Var3;
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
        o00Var.n = linearGradient;
        paint2.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(80.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, tileMode);
        o00Var.r = linearGradient2;
        paint3.setShader(linearGradient2);
        paint3.setXfermode(new PorterDuffXfermode(mode));
        this.c = o00Var;
        addView(o00Var, h7.z5.d(-1, 44.0f, 55, 0.0f, 17.33f, 0.0f, 0.0f));
        s5 s5Var = new s5(context);
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        s5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        s5Var.setTextSize(1, 20.0f);
        s5Var.setTypeface(AndroidUtilities.bold());
        s5Var.setGravity(17);
        s5Var.setLineSpacing(AndroidUtilities.dp(-1.0f), 1.0f);
        CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) new SpannableStringBuilder(charSequence), s5Var.getPaint().getFontMetricsInt(), false, 0.8f);
        this.b = replaceEmoji;
        this.b = MessageObject.replaceAnimatedEmoji(replaceEmoji, arrayList, s5Var.getPaint().getFontMetricsInt(), false, 0.8f, 0);
        s5Var.setText(q00Var.z());
        s5Var.setCacheType(z11 ? 26 : 0);
        int i13 = org.telegram.ui.ActionBar.g6.Oh;
        c6Var = ((org.telegram.ui.ActionBar.e3) q00Var).resourcesProvider;
        s5Var.setEmojiColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
        addView(s5Var, h7.z5.d(-1, -2.0f, 48, 32.0f, 78.3f, 32.0f, 0.0f));
        s5 s5Var2 = new s5(context);
        this.d = s5Var2;
        s5Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        s5Var2.setTextSize(1, 14.0f);
        s5Var2.setLines(2);
        s5Var2.setGravity(17);
        s5Var2.setLineSpacing(0.0f, 1.15f);
        addView(s5Var2, h7.z5.d(-1, -2.0f, 48, 32.0f, 113.0f, 32.0f, 0.0f));
        a();
    }

    public final void a() {
        q00 q00Var = this.e;
        ArrayList arrayList = q00Var.c0;
        boolean z10 = q00Var.X;
        CharSequence charSequence = this.b;
        s5 s5Var = this.d;
        if (z10) {
            s5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleRemove, charSequence)));
            return;
        }
        if (!this.a) {
            if (arrayList == null || arrayList.isEmpty()) {
                s5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleAlready, charSequence)));
                return;
            } else {
                s5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitle, charSequence)));
                return;
            }
        }
        int size = arrayList != null ? arrayList.size() : 0;
        o00 o00Var = this.c;
        o00Var.y.q(size > 0 ? i0.a.k(size, "+") : "", false, true);
        o00Var.invalidate();
        if (arrayList == null || arrayList.isEmpty()) {
            s5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleAlready, charSequence)));
        } else {
            s5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralSpannable("FolderLinkSubtitleChats", arrayList != null ? arrayList.size() : 0, charSequence)));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(172.0f), TLObject.FLAG_30));
    }
}
