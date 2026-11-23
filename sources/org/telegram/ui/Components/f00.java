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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class f00 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final boolean a;
    public final CharSequence b;
    public final e00 c;
    public final w5 d;
    public final w5 e;
    public final /* synthetic */ g00 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f00(g00 g00Var, Context context, boolean z10, CharSequence charSequence, ArrayList arrayList, boolean z11) {
        super(context);
        float f10;
        this.f = g00Var;
        this.a = z10;
        String N0 = org.telegram.messenger.gd.N0(2131750634, null);
        String N02 = org.telegram.messenger.gd.N0(2131750633, null);
        CharSequence spannableStringBuilder = charSequence == null ? "" : new SpannableStringBuilder(charSequence);
        e00 e00Var = new e00(context);
        TextPaint textPaint = new TextPaint(1);
        e00Var.a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        e00Var.b = textPaint2;
        Paint paint = new Paint(1);
        e00Var.c = paint;
        e00Var.d = new Path();
        float[] fArr = new float[8];
        e00Var.e = fArr;
        Paint paint2 = new Paint(1);
        e00Var.w = paint2;
        Paint paint3 = new Paint(1);
        e00Var.x = paint3;
        e00Var.y = new Matrix();
        e00Var.E = new Matrix();
        int i7 = org.telegram.ui.ActionBar.n6.vi;
        textPaint.setColor(org.telegram.ui.ActionBar.n6.r1(0.8f, org.telegram.ui.ActionBar.n6.x0(null, i7, false)));
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.33f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.n6.o6;
        textPaint2.setColor(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(17.0f));
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ki, false));
        m6 m6Var = new m6(false, true, true);
        e00Var.F = m6Var;
        m6Var.n(0.3f, 250L, kr.h);
        m6Var.setCallback(e00Var);
        m6Var.w(org.telegram.messenger.g0.L(11.66f));
        m6Var.u(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.d6, false));
        m6Var.x(org.telegram.messenger.g0.o());
        m6Var.b = 1;
        int r12 = org.telegram.ui.ActionBar.n6.r1(0.8f, org.telegram.ui.ActionBar.n6.x0(null, i7, false));
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, i10, false);
        if (N0 != null) {
            f10 = 15.33f;
            wy0 wy0Var = new wy0(e00.a(N0), 15.33f, org.telegram.messenger.g0.o());
            wy0Var.r(e00Var);
            wy0Var.a.setColor(r12);
            e00Var.f = wy0Var;
        } else {
            f10 = 15.33f;
        }
        CharSequence a10 = e00.a(spannableStringBuilder);
        wy0 wy0Var2 = new wy0(a10, f10, org.telegram.messenger.g0.o());
        wy0Var2.r(e00Var);
        TextPaint textPaint3 = wy0Var2.a;
        textPaint3.setColor(x02);
        e00Var.h = wy0Var2;
        wy0Var2.q(org.telegram.messenger.fj.B5(org.telegram.messenger.j6.m(a10, textPaint3.getFontMetricsInt(), false, null, 0), arrayList, textPaint3.getFontMetricsInt(), false));
        wy0Var2.o(z11 ? 26 : 0);
        if (N02 != null) {
            wy0 wy0Var3 = new wy0(e00.a(N02), 15.33f, org.telegram.messenger.g0.o());
            wy0Var3.r(e00Var);
            wy0Var3.a.setColor(r12);
            e00Var.n = wy0Var3;
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
        e00Var.r = linearGradient;
        paint2.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(80.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, tileMode);
        e00Var.s = linearGradient2;
        paint3.setShader(linearGradient2);
        paint3.setXfermode(new PorterDuffXfermode(mode));
        this.c = e00Var;
        addView(e00Var, c8.na.d(-1, 44.0f, 55, 0.0f, 17.33f, 0.0f, 0.0f));
        w5 w5Var = new w5(context);
        this.d = w5Var;
        int i11 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.U(w5Var, i11, null);
        w5Var.setTextSize(1, 20.0f);
        w5Var.setTypeface(org.telegram.messenger.g0.o());
        w5Var.setGravity(17);
        w5Var.setLineSpacing(org.telegram.messenger.g0.L(-1.0f), 1.0f);
        CharSequence n10 = org.telegram.messenger.j6.n(new SpannableStringBuilder(charSequence), w5Var.getPaint().getFontMetricsInt(), false, null, 0, 0.8f, 0);
        this.b = n10;
        this.b = org.telegram.messenger.fj.C5(n10, arrayList, w5Var.getPaint().getFontMetricsInt(), false, 0.8f, 0);
        w5Var.setText(g00Var.P0());
        w5Var.setCacheType(z11 ? 26 : 0);
        w5Var.setEmojiColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, g00Var.J0));
        addView(w5Var, c8.na.d(-1, -2.0f, 48, 32.0f, 78.3f, 32.0f, 0.0f));
        w5 w5Var2 = new w5(context);
        this.e = w5Var2;
        org.telegram.ui.ActionBar.u6.U(w5Var2, i11, null);
        w5Var2.setTextSize(1, 14.0f);
        w5Var2.setLines(2);
        w5Var2.setGravity(17);
        w5Var2.setLineSpacing(0.0f, 1.15f);
        addView(w5Var2, c8.na.d(-1, -2.0f, 48, 32.0f, 113.0f, 32.0f, 0.0f));
        a();
    }

    public final void a() {
        g00 g00Var = this.f;
        ArrayList arrayList = g00Var.c2;
        boolean z10 = g00Var.X1;
        CharSequence charSequence = this.b;
        w5 w5Var = this.e;
        if (z10) {
            w5Var.setText(org.telegram.messenger.g0.V2(org.telegram.messenger.gd.V(null, null, 2131750620, charSequence)));
            return;
        }
        if (!this.a) {
            if (arrayList == null || arrayList.isEmpty()) {
                w5Var.setText(org.telegram.messenger.g0.V2(org.telegram.messenger.gd.V(null, null, 2131750624, charSequence)));
                return;
            } else {
                w5Var.setText(org.telegram.messenger.g0.V2(org.telegram.messenger.gd.V(null, null, 2131750625, charSequence)));
                return;
            }
        }
        int size = arrayList != null ? arrayList.size() : 0;
        e00 e00Var = this.c;
        e00Var.F.t(size > 0 ? i5.c.i(size, "+") : "", false, true);
        e00Var.invalidate();
        if (arrayList == null || arrayList.isEmpty()) {
            w5Var.setText(org.telegram.messenger.g0.V2(org.telegram.messenger.gd.V(null, null, 2131750624, charSequence)));
        } else {
            w5Var.setText(org.telegram.messenger.g0.V2(org.telegram.messenger.gd.F("FolderLinkSubtitleChats", arrayList != null ? arrayList.size() : 0, charSequence)));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(172.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            w5 w5Var = this.d;
            if (w5Var != null) {
                int i7 = org.telegram.ui.ActionBar.n6.Fi;
                g00 g00Var = this.f;
                int i10 = g00.B2;
                w5Var.setEmojiColor(org.telegram.ui.ActionBar.n6.w0(i7, g00Var.J0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
