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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class n10 extends FrameLayout {
    public final boolean a;
    public final CharSequence b;
    public final m10 c;
    public final a6 d;
    public final /* synthetic */ o10 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n10(o10 o10Var, Context context, boolean z10, CharSequence charSequence, ArrayList arrayList, boolean z11) {
        super(context);
        float f7;
        org.telegram.ui.ActionBar.c6 c6Var;
        this.e = o10Var;
        this.a = z10;
        String string = LocaleController.getString(R.string.FolderLinkPreviewLeft);
        String string2 = LocaleController.getString(R.string.FolderLinkPreviewRight);
        CharSequence spannableStringBuilder = charSequence == null ? "" : new SpannableStringBuilder(charSequence);
        m10 m10Var = new m10(context);
        TextPaint textPaint = new TextPaint(1);
        m10Var.a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        Paint paint = new Paint(1);
        m10Var.b = paint;
        m10Var.c = new Path();
        float[] fArr = new float[8];
        m10Var.d = fArr;
        Paint paint2 = new Paint(1);
        m10Var.s = paint2;
        Paint paint3 = new Paint(1);
        m10Var.v = paint3;
        m10Var.w = new Matrix();
        m10Var.x = new Matrix();
        int i10 = org.telegram.ui.ActionBar.g6.Eh;
        textPaint.setColor(org.telegram.ui.ActionBar.g6.m1(0.8f, org.telegram.ui.ActionBar.g6.x0(null, i10, false)));
        textPaint.setTextSize(AndroidUtilities.dp(15.33f));
        textPaint.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.g6.o6;
        textPaint2.setColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        textPaint2.setTextSize(AndroidUtilities.dp(17.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        paint.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Th, false));
        r6 r6Var = new r6(false, true, true);
        m10Var.y = r6Var;
        r6Var.n(0.3f, 250L, es.h);
        r6Var.setCallback(m10Var);
        r6Var.w(AndroidUtilities.dp(11.66f));
        r6Var.u(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
        r6Var.x(AndroidUtilities.bold());
        r6Var.b = 1;
        int m12 = org.telegram.ui.ActionBar.g6.m1(0.8f, org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, i11, false);
        if (string != null) {
            f7 = 15.33f;
            i11 i11Var = new i11(m10.a(string), 15.33f, AndroidUtilities.bold());
            i11Var.s(m10Var);
            i11Var.a.setColor(m12);
            m10Var.e = i11Var;
        } else {
            f7 = 15.33f;
        }
        CharSequence a2 = m10.a(spannableStringBuilder);
        i11 i11Var2 = new i11(a2, f7, AndroidUtilities.bold());
        i11Var2.s(m10Var);
        TextPaint textPaint3 = i11Var2.a;
        textPaint3.setColor(x02);
        m10Var.f = i11Var2;
        i11Var2.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(a2, textPaint3.getFontMetricsInt(), false), arrayList, textPaint3.getFontMetricsInt()));
        i11Var2.p(z11 ? 26 : 0);
        if (string2 != null) {
            i11 i11Var3 = new i11(m10.a(string2), 15.33f, AndroidUtilities.bold());
            i11Var3.s(m10Var);
            i11Var3.a.setColor(m12);
            m10Var.h = i11Var3;
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
        m10Var.n = linearGradient;
        paint2.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(80.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, tileMode);
        m10Var.r = linearGradient2;
        paint3.setShader(linearGradient2);
        paint3.setXfermode(new PorterDuffXfermode(mode));
        this.c = m10Var;
        addView(m10Var, w7.z5.a(44.0f, 0.0f, 17.33f, 0.0f, 0.0f, -1, 55));
        a6 a6Var = new a6(context);
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        a6Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
        a6Var.setTextSize(1, 20.0f);
        a6Var.setTypeface(AndroidUtilities.bold());
        a6Var.setGravity(17);
        a6Var.setLineSpacing(AndroidUtilities.dp(-1.0f), 1.0f);
        CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) new SpannableStringBuilder(charSequence), a6Var.getPaint().getFontMetricsInt(), false, 0.8f);
        this.b = replaceEmoji;
        this.b = MessageObject.replaceAnimatedEmoji(replaceEmoji, arrayList, a6Var.getPaint().getFontMetricsInt(), false, 0.8f, 0);
        a6Var.setText(o10Var.B());
        a6Var.setCacheType(z11 ? 26 : 0);
        int i13 = org.telegram.ui.ActionBar.g6.Oh;
        c6Var = ((org.telegram.ui.ActionBar.e3) o10Var).resourcesProvider;
        a6Var.setEmojiColor(org.telegram.ui.ActionBar.g6.w0(i13, c6Var));
        addView(a6Var, w7.z5.a(-2.0f, 32.0f, 78.3f, 32.0f, 0.0f, -1, 48));
        a6 a6Var2 = new a6(context);
        this.d = a6Var2;
        a6Var2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
        a6Var2.setTextSize(1, 14.0f);
        a6Var2.setLines(2);
        a6Var2.setGravity(17);
        a6Var2.setLineSpacing(0.0f, 1.15f);
        addView(a6Var2, w7.z5.a(-2.0f, 32.0f, 113.0f, 32.0f, 0.0f, -1, 48));
        a();
    }

    public final void a() {
        o10 o10Var = this.e;
        ArrayList arrayList = o10Var.g0;
        boolean z10 = o10Var.b0;
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
        m10 m10Var = this.c;
        m10Var.y.t(size > 0 ? i2.d.j(size, "+") : "", false, true);
        m10Var.invalidate();
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
