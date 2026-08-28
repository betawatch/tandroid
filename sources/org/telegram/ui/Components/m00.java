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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class m00 extends FrameLayout {
    public final boolean a;
    public final CharSequence b;
    public final l00 c;
    public final s5 d;
    public final /* synthetic */ n00 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m00(n00 n00Var, Context context, boolean z10, CharSequence charSequence, ArrayList arrayList, boolean z11) {
        super(context);
        float f10;
        org.telegram.ui.ActionBar.b6 b6Var;
        this.e = n00Var;
        this.a = z10;
        String string = LocaleController.getString(R.string.FolderLinkPreviewLeft);
        String string2 = LocaleController.getString(R.string.FolderLinkPreviewRight);
        CharSequence spannableStringBuilder = charSequence == null ? "" : new SpannableStringBuilder(charSequence);
        l00 l00Var = new l00(context);
        TextPaint textPaint = new TextPaint(1);
        l00Var.a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        Paint paint = new Paint(1);
        l00Var.b = paint;
        l00Var.c = new Path();
        float[] fArr = new float[8];
        l00Var.d = fArr;
        Paint paint2 = new Paint(1);
        l00Var.s = paint2;
        Paint paint3 = new Paint(1);
        l00Var.v = paint3;
        l00Var.w = new Matrix();
        l00Var.x = new Matrix();
        int i9 = org.telegram.ui.ActionBar.f6.Eh;
        textPaint.setColor(org.telegram.ui.ActionBar.f6.l1(0.8f, org.telegram.ui.ActionBar.f6.w0(null, i9, false)));
        textPaint.setTextSize(AndroidUtilities.dp(15.33f));
        textPaint.setTypeface(AndroidUtilities.bold());
        int i10 = org.telegram.ui.ActionBar.f6.o6;
        textPaint2.setColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        textPaint2.setTextSize(AndroidUtilities.dp(17.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Th, false));
        i6 i6Var = new i6(false, true, true, false);
        l00Var.y = i6Var;
        i6Var.k(0.3f, 250L, gr.h);
        i6Var.setCallback(l00Var);
        i6Var.t(AndroidUtilities.dp(11.66f));
        i6Var.r(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
        i6Var.u(AndroidUtilities.bold());
        i6Var.b = 1;
        int l1 = org.telegram.ui.ActionBar.f6.l1(0.8f, org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, i10, false);
        if (string != null) {
            f10 = 15.33f;
            nz0 nz0Var = new nz0(l00.a(string), 15.33f, AndroidUtilities.bold());
            nz0Var.s(l00Var);
            nz0Var.a.setColor(l1);
            l00Var.e = nz0Var;
        } else {
            f10 = 15.33f;
        }
        CharSequence a2 = l00.a(spannableStringBuilder);
        nz0 nz0Var2 = new nz0(a2, f10, AndroidUtilities.bold());
        nz0Var2.s(l00Var);
        TextPaint textPaint3 = nz0Var2.a;
        textPaint3.setColor(w02);
        l00Var.f = nz0Var2;
        nz0Var2.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(a2, textPaint3.getFontMetricsInt(), false), arrayList, textPaint3.getFontMetricsInt()));
        nz0Var2.p(z11 ? 26 : 0);
        if (string2 != null) {
            nz0 nz0Var3 = new nz0(l00.a(string2), 15.33f, AndroidUtilities.bold());
            nz0Var3.s(l00Var);
            nz0Var3.a.setColor(l1);
            l00Var.h = nz0Var3;
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
        l00Var.n = linearGradient;
        paint2.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(80.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, tileMode);
        l00Var.r = linearGradient2;
        paint3.setShader(linearGradient2);
        paint3.setXfermode(new PorterDuffXfermode(mode));
        this.c = l00Var;
        addView(l00Var, g7.e6.d(-1, 44.0f, 55, 0.0f, 17.33f, 0.0f, 0.0f));
        s5 s5Var = new s5(context);
        int i11 = org.telegram.ui.ActionBar.f6.G6;
        s5Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        s5Var.setTextSize(1, 20.0f);
        s5Var.setTypeface(AndroidUtilities.bold());
        s5Var.setGravity(17);
        s5Var.setLineSpacing(AndroidUtilities.dp(-1.0f), 1.0f);
        CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) new SpannableStringBuilder(charSequence), s5Var.getPaint().getFontMetricsInt(), false, 0.8f);
        this.b = replaceEmoji;
        this.b = MessageObject.replaceAnimatedEmoji(replaceEmoji, arrayList, s5Var.getPaint().getFontMetricsInt(), false, 0.8f, 0);
        s5Var.setText(n00Var.y());
        s5Var.setCacheType(z11 ? 26 : 0);
        int i12 = org.telegram.ui.ActionBar.f6.Oh;
        b6Var = ((org.telegram.ui.ActionBar.f3) n00Var).resourcesProvider;
        s5Var.setEmojiColor(org.telegram.ui.ActionBar.f6.v0(i12, b6Var));
        addView(s5Var, g7.e6.d(-1, -2.0f, 48, 32.0f, 78.3f, 32.0f, 0.0f));
        s5 s5Var2 = new s5(context);
        this.d = s5Var2;
        s5Var2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        s5Var2.setTextSize(1, 14.0f);
        s5Var2.setLines(2);
        s5Var2.setGravity(17);
        s5Var2.setLineSpacing(0.0f, 1.15f);
        addView(s5Var2, g7.e6.d(-1, -2.0f, 48, 32.0f, 113.0f, 32.0f, 0.0f));
        a();
    }

    public final void a() {
        n00 n00Var = this.e;
        ArrayList arrayList = n00Var.c0;
        boolean z10 = n00Var.X;
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
        l00 l00Var = this.c;
        l00Var.y.q(size > 0 ? j3.r0.l(size, "+") : "", false, true);
        l00Var.invalidate();
        if (arrayList == null || arrayList.isEmpty()) {
            s5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleAlready, charSequence)));
        } else {
            s5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralSpannable("FolderLinkSubtitleChats", arrayList != null ? arrayList.size() : 0, charSequence)));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(172.0f), TLObject.FLAG_30));
    }
}
