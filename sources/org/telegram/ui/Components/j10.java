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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class j10 extends FrameLayout {
    public final boolean a;
    public final CharSequence b;
    public final i10 c;
    public final z5 d;
    public final /* synthetic */ k10 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j10(k10 k10Var, Context context, boolean z10, CharSequence charSequence, ArrayList arrayList, boolean z11) {
        super(context);
        float f7;
        org.telegram.ui.ActionBar.d6 d6Var;
        this.e = k10Var;
        this.a = z10;
        String string = LocaleController.getString(R.string.FolderLinkPreviewLeft);
        String string2 = LocaleController.getString(R.string.FolderLinkPreviewRight);
        CharSequence spannableStringBuilder = charSequence == null ? "" : new SpannableStringBuilder(charSequence);
        i10 i10Var = new i10(context);
        TextPaint textPaint = new TextPaint(1);
        i10Var.a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        Paint paint = new Paint(1);
        i10Var.b = paint;
        i10Var.c = new Path();
        float[] fArr = new float[8];
        i10Var.d = fArr;
        Paint paint2 = new Paint(1);
        i10Var.s = paint2;
        Paint paint3 = new Paint(1);
        i10Var.v = paint3;
        i10Var.w = new Matrix();
        i10Var.x = new Matrix();
        int i10 = org.telegram.ui.ActionBar.h6.Eh;
        textPaint.setColor(org.telegram.ui.ActionBar.h6.m1(0.8f, org.telegram.ui.ActionBar.h6.x0(null, i10, false)));
        textPaint.setTextSize(AndroidUtilities.dp(15.33f));
        textPaint.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.h6.o6;
        textPaint2.setColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        textPaint2.setTextSize(AndroidUtilities.dp(17.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Th, false));
        p6 p6Var = new p6(false, true, true);
        i10Var.y = p6Var;
        p6Var.n(0.3f, 250L, bs.h);
        p6Var.setCallback(i10Var);
        p6Var.w(AndroidUtilities.dp(11.66f));
        p6Var.u(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
        p6Var.x(AndroidUtilities.bold());
        p6Var.b = 1;
        int m12 = org.telegram.ui.ActionBar.h6.m1(0.8f, org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, i11, false);
        if (string != null) {
            f7 = 15.33f;
            f11 f11Var = new f11(i10.a(string), 15.33f, AndroidUtilities.bold());
            f11Var.s(i10Var);
            f11Var.a.setColor(m12);
            i10Var.e = f11Var;
        } else {
            f7 = 15.33f;
        }
        CharSequence a2 = i10.a(spannableStringBuilder);
        f11 f11Var2 = new f11(a2, f7, AndroidUtilities.bold());
        f11Var2.s(i10Var);
        TextPaint textPaint3 = f11Var2.a;
        textPaint3.setColor(x02);
        i10Var.f = f11Var2;
        f11Var2.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(a2, textPaint3.getFontMetricsInt(), false), arrayList, textPaint3.getFontMetricsInt()));
        f11Var2.p(z11 ? 26 : 0);
        if (string2 != null) {
            f11 f11Var3 = new f11(i10.a(string2), 15.33f, AndroidUtilities.bold());
            f11Var3.s(i10Var);
            f11Var3.a.setColor(m12);
            i10Var.h = f11Var3;
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
        i10Var.n = linearGradient;
        paint2.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(80.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, tileMode);
        i10Var.r = linearGradient2;
        paint3.setShader(linearGradient2);
        paint3.setXfermode(new PorterDuffXfermode(mode));
        this.c = i10Var;
        addView(i10Var, w7.z5.d(-1, 44.0f, 55, 0.0f, 17.33f, 0.0f, 0.0f));
        z5 z5Var = new z5(context);
        int i12 = org.telegram.ui.ActionBar.h6.G6;
        z5Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        z5Var.setTextSize(1, 20.0f);
        z5Var.setTypeface(AndroidUtilities.bold());
        z5Var.setGravity(17);
        z5Var.setLineSpacing(AndroidUtilities.dp(-1.0f), 1.0f);
        CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) new SpannableStringBuilder(charSequence), z5Var.getPaint().getFontMetricsInt(), false, 0.8f);
        this.b = replaceEmoji;
        this.b = MessageObject.replaceAnimatedEmoji(replaceEmoji, arrayList, z5Var.getPaint().getFontMetricsInt(), false, 0.8f, 0);
        z5Var.setText(k10Var.A());
        z5Var.setCacheType(z11 ? 26 : 0);
        int i13 = org.telegram.ui.ActionBar.h6.Oh;
        d6Var = ((org.telegram.ui.ActionBar.f3) k10Var).resourcesProvider;
        z5Var.setEmojiColor(org.telegram.ui.ActionBar.h6.w0(i13, d6Var));
        addView(z5Var, w7.z5.d(-1, -2.0f, 48, 32.0f, 78.3f, 32.0f, 0.0f));
        z5 z5Var2 = new z5(context);
        this.d = z5Var2;
        z5Var2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        z5Var2.setTextSize(1, 14.0f);
        z5Var2.setLines(2);
        z5Var2.setGravity(17);
        z5Var2.setLineSpacing(0.0f, 1.15f);
        addView(z5Var2, w7.z5.d(-1, -2.0f, 48, 32.0f, 113.0f, 32.0f, 0.0f));
        a();
    }

    public final void a() {
        k10 k10Var = this.e;
        ArrayList arrayList = k10Var.g0;
        boolean z10 = k10Var.b0;
        CharSequence charSequence = this.b;
        z5 z5Var = this.d;
        if (z10) {
            z5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleRemove, charSequence)));
            return;
        }
        if (!this.a) {
            if (arrayList == null || arrayList.isEmpty()) {
                z5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleAlready, charSequence)));
                return;
            } else {
                z5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitle, charSequence)));
                return;
            }
        }
        int size = arrayList != null ? arrayList.size() : 0;
        i10 i10Var = this.c;
        i10Var.y.t(size > 0 ? i2.e.j(size, "+") : "", false, true);
        i10Var.invalidate();
        if (arrayList == null || arrayList.isEmpty()) {
            z5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleAlready, charSequence)));
        } else {
            z5Var.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralSpannable("FolderLinkSubtitleChats", arrayList != null ? arrayList.size() : 0, charSequence)));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(172.0f), TLObject.FLAG_30));
    }
}
