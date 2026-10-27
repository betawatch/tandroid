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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class m10 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final boolean a;
    public final CharSequence b;
    public final l10 c;
    public final b6 d;
    public final b6 e;
    public final /* synthetic */ n10 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m10(n10 n10Var, Context context, boolean z10, CharSequence charSequence, ArrayList arrayList, boolean z11) {
        super(context);
        float f7;
        org.telegram.ui.ActionBar.u6 u6Var;
        this.f = n10Var;
        this.a = z10;
        String string = LocaleController.getString(R.string.FolderLinkPreviewLeft);
        String string2 = LocaleController.getString(R.string.FolderLinkPreviewRight);
        CharSequence spannableStringBuilder = charSequence == null ? "" : new SpannableStringBuilder(charSequence);
        l10 l10Var = new l10(context);
        TextPaint textPaint = new TextPaint(1);
        l10Var.a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        l10Var.b = textPaint2;
        Paint paint = new Paint(1);
        l10Var.c = paint;
        l10Var.d = new Path();
        float[] fArr = new float[8];
        l10Var.e = fArr;
        Paint paint2 = new Paint(1);
        l10Var.v = paint2;
        Paint paint3 = new Paint(1);
        l10Var.w = paint3;
        l10Var.x = new Matrix();
        l10Var.y = new Matrix();
        int i10 = org.telegram.ui.ActionBar.y6.Eh;
        textPaint.setColor(org.telegram.ui.ActionBar.y6.o1(0.8f, org.telegram.ui.ActionBar.y6.x0(null, i10, false)));
        textPaint.setTextSize(AndroidUtilities.dp(15.33f));
        textPaint.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.y6.o6;
        textPaint2.setColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
        textPaint2.setTextSize(AndroidUtilities.dp(17.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Th, false));
        r6 r6Var = new r6(false, true, true);
        l10Var.E = r6Var;
        r6Var.n(0.3f, 250L, ds.h);
        r6Var.setCallback(l10Var);
        r6Var.w(AndroidUtilities.dp(11.66f));
        r6Var.u(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, false));
        r6Var.x(AndroidUtilities.bold());
        r6Var.b = 1;
        int o12 = org.telegram.ui.ActionBar.y6.o1(0.8f, org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
        if (string != null) {
            f7 = 15.33f;
            r11 r11Var = new r11(l10.a(string), 15.33f, AndroidUtilities.bold());
            r11Var.s(l10Var);
            r11Var.a.setColor(o12);
            l10Var.f = r11Var;
        } else {
            f7 = 15.33f;
        }
        CharSequence a2 = l10.a(spannableStringBuilder);
        r11 r11Var2 = new r11(a2, f7, AndroidUtilities.bold());
        r11Var2.s(l10Var);
        TextPaint textPaint3 = r11Var2.a;
        textPaint3.setColor(x02);
        l10Var.h = r11Var2;
        r11Var2.r(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(a2, textPaint3.getFontMetricsInt(), false), arrayList, textPaint3.getFontMetricsInt()));
        r11Var2.p(z11 ? 26 : 0);
        if (string2 != null) {
            r11 r11Var3 = new r11(l10.a(string2), 15.33f, AndroidUtilities.bold());
            r11Var3.s(l10Var);
            r11Var3.a.setColor(o12);
            l10Var.n = r11Var3;
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
        l10Var.r = linearGradient;
        paint2.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(80.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, tileMode);
        l10Var.s = linearGradient2;
        paint3.setShader(linearGradient2);
        paint3.setXfermode(new PorterDuffXfermode(mode));
        this.c = l10Var;
        addView(l10Var, kb1.h(-1, 44.0f, 55, 0.0f, 17.33f, 0.0f, 0.0f));
        b6 b6Var = new b6(context);
        this.d = b6Var;
        int i12 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.V(b6Var, i12, null);
        b6Var.setTextSize(1, 20.0f);
        b6Var.setTypeface(AndroidUtilities.bold());
        b6Var.setGravity(17);
        b6Var.setLineSpacing(AndroidUtilities.dp(-1.0f), 1.0f);
        CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) new SpannableStringBuilder(charSequence), b6Var.getPaint().getFontMetricsInt(), false, 0.8f);
        this.b = replaceEmoji;
        this.b = MessageObject.replaceAnimatedEmoji(replaceEmoji, arrayList, b6Var.getPaint().getFontMetricsInt(), false, 0.8f, 0);
        b6Var.setText(n10Var.y());
        b6Var.setCacheType(z11 ? 26 : 0);
        int i13 = org.telegram.ui.ActionBar.y6.Oh;
        u6Var = ((org.telegram.ui.ActionBar.k3) n10Var).resourcesProvider;
        b6Var.setEmojiColor(org.telegram.ui.ActionBar.y6.w0(i13, u6Var));
        addView(b6Var, kb1.h(-1, -2.0f, 48, 32.0f, 78.3f, 32.0f, 0.0f));
        b6 b6Var2 = new b6(context);
        this.e = b6Var2;
        org.telegram.ui.ActionBar.f7.V(b6Var2, i12, null);
        b6Var2.setTextSize(1, 14.0f);
        b6Var2.setLines(2);
        b6Var2.setGravity(17);
        b6Var2.setLineSpacing(0.0f, 1.15f);
        addView(b6Var2, kb1.h(-1, -2.0f, 48, 32.0f, 113.0f, 32.0f, 0.0f));
        a();
    }

    public final void a() {
        n10 n10Var = this.f;
        ArrayList arrayList = n10Var.g0;
        boolean z10 = n10Var.b0;
        CharSequence charSequence = this.b;
        b6 b6Var = this.e;
        if (z10) {
            b6Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleRemove, charSequence)));
            return;
        }
        if (!this.a) {
            if (arrayList == null || arrayList.isEmpty()) {
                b6Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleAlready, charSequence)));
                return;
            } else {
                b6Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitle, charSequence)));
                return;
            }
        }
        int size = arrayList != null ? arrayList.size() : 0;
        l10 l10Var = this.c;
        l10Var.E.t(size > 0 ? ic.a.i(size, "+") : "", false, true);
        l10Var.invalidate();
        if (arrayList == null || arrayList.isEmpty()) {
            b6Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleAlready, charSequence)));
        } else {
            b6Var.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralSpannable("FolderLinkSubtitleChats", arrayList != null ? arrayList.size() : 0, charSequence)));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(172.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        org.telegram.ui.ActionBar.u6 u6Var;
        try {
            b6 b6Var = this.d;
            if (b6Var != null) {
                int i10 = org.telegram.ui.ActionBar.y6.Oh;
                u6Var = ((org.telegram.ui.ActionBar.k3) this.f).resourcesProvider;
                b6Var.setEmojiColor(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
