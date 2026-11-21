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
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class h00 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final boolean a;
    public final CharSequence b;
    public final g00 c;
    public final x5 d;
    public final x5 e;
    public final /* synthetic */ i00 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h00(i00 i00Var, Context context, boolean z10, CharSequence charSequence, ArrayList arrayList, boolean z11) {
        super(context);
        float f10;
        this.f = i00Var;
        this.a = z10;
        String N0 = org.telegram.messenger.gd.N0(2131750634, null);
        String N02 = org.telegram.messenger.gd.N0(2131750633, null);
        CharSequence spannableStringBuilder = charSequence == null ? "" : new SpannableStringBuilder(charSequence);
        g00 g00Var = new g00(context);
        TextPaint textPaint = new TextPaint(1);
        g00Var.a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        g00Var.b = textPaint2;
        Paint paint = new Paint(1);
        g00Var.c = paint;
        g00Var.d = new Path();
        float[] fArr = new float[8];
        g00Var.e = fArr;
        Paint paint2 = new Paint(1);
        g00Var.w = paint2;
        Paint paint3 = new Paint(1);
        g00Var.x = paint3;
        g00Var.y = new Matrix();
        g00Var.E = new Matrix();
        int i7 = org.telegram.ui.ActionBar.m6.vi;
        textPaint.setColor(org.telegram.ui.ActionBar.m6.r1(0.8f, org.telegram.ui.ActionBar.m6.x0(null, i7, false)));
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.33f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.m6.o6;
        textPaint2.setColor(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(17.0f));
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ki, false));
        n6 n6Var = new n6(false, true, true);
        g00Var.F = n6Var;
        n6Var.n(0.3f, 250L, nr.h);
        n6Var.setCallback(g00Var);
        n6Var.w(org.telegram.messenger.g0.L(11.66f));
        n6Var.u(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.d6, false));
        n6Var.x(org.telegram.messenger.g0.o());
        n6Var.b = 1;
        int r12 = org.telegram.ui.ActionBar.m6.r1(0.8f, org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i10, false);
        if (N0 != null) {
            f10 = 15.33f;
            xy0 xy0Var = new xy0(g00.a(N0), 15.33f, org.telegram.messenger.g0.o());
            xy0Var.r(g00Var);
            xy0Var.a.setColor(r12);
            g00Var.f = xy0Var;
        } else {
            f10 = 15.33f;
        }
        CharSequence a10 = g00.a(spannableStringBuilder);
        xy0 xy0Var2 = new xy0(a10, f10, org.telegram.messenger.g0.o());
        xy0Var2.r(g00Var);
        TextPaint textPaint3 = xy0Var2.a;
        textPaint3.setColor(x02);
        g00Var.h = xy0Var2;
        xy0Var2.q(org.telegram.messenger.fj.B5(org.telegram.messenger.j6.m(a10, textPaint3.getFontMetricsInt(), false, null, 0), arrayList, textPaint3.getFontMetricsInt(), false));
        xy0Var2.o(z11 ? 26 : 0);
        if (N02 != null) {
            xy0 xy0Var3 = new xy0(g00.a(N02), 15.33f, org.telegram.messenger.g0.o());
            xy0Var3.r(g00Var);
            xy0Var3.a.setColor(r12);
            g00Var.n = xy0Var3;
        }
        float L = org.telegram.messenger.g0.L(3.0f);
        fArr[3] = L;
        fArr[2] = L;
        fArr[1] = L;
        fArr[0] = L;
        float L2 = org.telegram.messenger.g0.L(1.0f);
        fArr[7] = L2;
        fArr[6] = L2;
        fArr[5] = L2;
        fArr[4] = L2;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(80.0f), 0.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, tileMode);
        g00Var.r = linearGradient;
        paint2.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(80.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, tileMode);
        g00Var.s = linearGradient2;
        paint3.setShader(linearGradient2);
        paint3.setXfermode(new PorterDuffXfermode(mode));
        this.c = g00Var;
        addView(g00Var, c8.ma.d(-1, 44.0f, 55, 0.0f, 17.33f, 0.0f, 0.0f));
        x5 x5Var = new x5(context);
        this.d = x5Var;
        int i11 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(x5Var, i11, null);
        x5Var.setTextSize(1, 20.0f);
        x5Var.setTypeface(org.telegram.messenger.g0.o());
        x5Var.setGravity(17);
        x5Var.setLineSpacing(org.telegram.messenger.g0.L(-1.0f), 1.0f);
        CharSequence n10 = org.telegram.messenger.j6.n(new SpannableStringBuilder(charSequence), x5Var.getPaint().getFontMetricsInt(), false, null, 0, 0.8f, 0);
        this.b = n10;
        this.b = org.telegram.messenger.fj.C5(n10, arrayList, x5Var.getPaint().getFontMetricsInt(), false, 0.8f, 0);
        x5Var.setText(i00Var.P0());
        x5Var.setCacheType(z11 ? 26 : 0);
        x5Var.setEmojiColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, i00Var.J0));
        addView(x5Var, c8.ma.d(-1, -2.0f, 48, 32.0f, 78.3f, 32.0f, 0.0f));
        x5 x5Var2 = new x5(context);
        this.e = x5Var2;
        org.telegram.ui.ActionBar.t6.U(x5Var2, i11, null);
        x5Var2.setTextSize(1, 14.0f);
        x5Var2.setLines(2);
        x5Var2.setGravity(17);
        x5Var2.setLineSpacing(0.0f, 1.15f);
        addView(x5Var2, c8.ma.d(-1, -2.0f, 48, 32.0f, 113.0f, 32.0f, 0.0f));
        a();
    }

    public final void a() {
        i00 i00Var = this.f;
        ArrayList arrayList = i00Var.c2;
        boolean z10 = i00Var.X1;
        CharSequence charSequence = this.b;
        x5 x5Var = this.e;
        if (z10) {
            x5Var.setText(org.telegram.messenger.g0.V2(org.telegram.messenger.gd.V(null, null, 2131750620, charSequence)));
            return;
        }
        if (!this.a) {
            if (arrayList == null || arrayList.isEmpty()) {
                x5Var.setText(org.telegram.messenger.g0.V2(org.telegram.messenger.gd.V(null, null, 2131750624, charSequence)));
                return;
            } else {
                x5Var.setText(org.telegram.messenger.g0.V2(org.telegram.messenger.gd.V(null, null, 2131750625, charSequence)));
                return;
            }
        }
        int size = arrayList != null ? arrayList.size() : 0;
        g00 g00Var = this.c;
        g00Var.F.t(size > 0 ? i5.c.i(size, "+") : "", false, true);
        g00Var.invalidate();
        if (arrayList == null || arrayList.isEmpty()) {
            x5Var.setText(org.telegram.messenger.g0.V2(org.telegram.messenger.gd.V(null, null, 2131750624, charSequence)));
        } else {
            x5Var.setText(org.telegram.messenger.g0.V2(org.telegram.messenger.gd.F("FolderLinkSubtitleChats", arrayList != null ? arrayList.size() : 0, charSequence)));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(172.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            x5 x5Var = this.d;
            if (x5Var != null) {
                int i7 = org.telegram.ui.ActionBar.m6.Fi;
                i00 i00Var = this.f;
                int i10 = i00.B2;
                x5Var.setEmojiColor(org.telegram.ui.ActionBar.m6.w0(i7, i00Var.J0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
