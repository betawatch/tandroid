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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i00 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final boolean a;
    public final CharSequence b;
    public final h00 c;
    public final n5 d;
    public final n5 e;
    public final /* synthetic */ j00 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i00(j00 j00Var, Context context, boolean z10, CharSequence charSequence, ArrayList arrayList, boolean z11) {
        super(context);
        float f7;
        this.f = j00Var;
        this.a = z10;
        String L0 = org.telegram.messenger.cd.L0(2131750652, null);
        String L02 = org.telegram.messenger.cd.L0(2131750651, null);
        CharSequence spannableStringBuilder = charSequence == null ? "" : new SpannableStringBuilder(charSequence);
        h00 h00Var = new h00(context);
        TextPaint textPaint = new TextPaint(1);
        h00Var.a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        h00Var.b = textPaint2;
        Paint paint = new Paint(1);
        h00Var.c = paint;
        h00Var.d = new Path();
        float[] fArr = new float[8];
        h00Var.e = fArr;
        Paint paint2 = new Paint(1);
        h00Var.w = paint2;
        Paint paint3 = new Paint(1);
        h00Var.x = paint3;
        h00Var.y = new Matrix();
        h00Var.D = new Matrix();
        int i10 = org.telegram.ui.ActionBar.t6.si;
        textPaint.setColor(org.telegram.ui.ActionBar.t6.r1(0.8f, org.telegram.ui.ActionBar.t6.x0(null, i10, false)));
        textPaint.setTextSize(org.telegram.messenger.i0.L(15.33f));
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        int i11 = org.telegram.ui.ActionBar.t6.o6;
        textPaint2.setColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        textPaint2.setTextSize(org.telegram.messenger.i0.L(17.0f));
        textPaint2.setTypeface(org.telegram.messenger.i0.o());
        paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Hi, false));
        e6 e6Var = new e6(false, true, true);
        h00Var.E = e6Var;
        e6Var.n(0.3f, 250L, gr.h);
        e6Var.setCallback(h00Var);
        e6Var.w(org.telegram.messenger.i0.L(11.66f));
        e6Var.u(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false));
        e6Var.x(org.telegram.messenger.i0.o());
        e6Var.b = 1;
        int r12 = org.telegram.ui.ActionBar.t6.r1(0.8f, org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
        if (L0 != null) {
            f7 = 15.33f;
            qz0 qz0Var = new qz0(h00.a(L0), 15.33f, org.telegram.messenger.i0.o());
            qz0Var.r(h00Var);
            qz0Var.a.setColor(r12);
            h00Var.f = qz0Var;
        } else {
            f7 = 15.33f;
        }
        CharSequence a2 = h00.a(spannableStringBuilder);
        qz0 qz0Var2 = new qz0(a2, f7, org.telegram.messenger.i0.o());
        qz0Var2.r(h00Var);
        TextPaint textPaint3 = qz0Var2.a;
        textPaint3.setColor(x02);
        h00Var.h = qz0Var2;
        qz0Var2.q(org.telegram.messenger.jj.A5(org.telegram.messenger.k6.m(a2, textPaint3.getFontMetricsInt(), false, null, 0), arrayList, textPaint3.getFontMetricsInt(), false));
        qz0Var2.o(z11 ? 26 : 0);
        if (L02 != null) {
            qz0 qz0Var3 = new qz0(h00.a(L02), 15.33f, org.telegram.messenger.i0.o());
            qz0Var3.r(h00Var);
            qz0Var3.a.setColor(r12);
            h00Var.n = qz0Var3;
        }
        float L = org.telegram.messenger.i0.L(3.0f);
        fArr[3] = L;
        fArr[2] = L;
        fArr[1] = L;
        fArr[0] = L;
        float L2 = org.telegram.messenger.i0.L(1.0f);
        fArr[7] = L2;
        fArr[6] = L2;
        fArr[5] = L2;
        fArr[4] = L2;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(80.0f), 0.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, tileMode);
        h00Var.r = linearGradient;
        paint2.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(80.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, tileMode);
        h00Var.s = linearGradient2;
        paint3.setShader(linearGradient2);
        paint3.setXfermode(new PorterDuffXfermode(mode));
        this.c = h00Var;
        addView(h00Var, w7.b6.d(-1, 44.0f, 55, 0.0f, 17.33f, 0.0f, 0.0f));
        n5 n5Var = new n5(context);
        this.d = n5Var;
        int i12 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(n5Var, i12, null);
        n5Var.setTextSize(1, 20.0f);
        n5Var.setTypeface(org.telegram.messenger.i0.o());
        n5Var.setGravity(17);
        n5Var.setLineSpacing(org.telegram.messenger.i0.L(-1.0f), 1.0f);
        CharSequence n10 = org.telegram.messenger.k6.n(new SpannableStringBuilder(charSequence), n5Var.getPaint().getFontMetricsInt(), false, null, 0, 0.8f, 0);
        this.b = n10;
        this.b = org.telegram.messenger.jj.B5(n10, arrayList, n5Var.getPaint().getFontMetricsInt(), false, 0.8f, 0);
        n5Var.setText(j00Var.O0());
        n5Var.setCacheType(z11 ? 26 : 0);
        n5Var.setEmojiColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, j00Var.I0));
        addView(n5Var, w7.b6.d(-1, -2.0f, 48, 32.0f, 78.3f, 32.0f, 0.0f));
        n5 n5Var2 = new n5(context);
        this.e = n5Var2;
        org.telegram.ui.ActionBar.a7.V(n5Var2, i12, null);
        n5Var2.setTextSize(1, 14.0f);
        n5Var2.setLines(2);
        n5Var2.setGravity(17);
        n5Var2.setLineSpacing(0.0f, 1.15f);
        addView(n5Var2, w7.b6.d(-1, -2.0f, 48, 32.0f, 113.0f, 32.0f, 0.0f));
        a();
    }

    public final void a() {
        j00 j00Var = this.f;
        ArrayList arrayList = j00Var.Y1;
        boolean z10 = j00Var.T1;
        CharSequence charSequence = this.b;
        n5 n5Var = this.e;
        if (z10) {
            n5Var.setText(org.telegram.messenger.i0.V2(org.telegram.messenger.cd.V(null, null, 2131750638, charSequence)));
            return;
        }
        if (!this.a) {
            if (arrayList == null || arrayList.isEmpty()) {
                n5Var.setText(org.telegram.messenger.i0.V2(org.telegram.messenger.cd.V(null, null, 2131750642, charSequence)));
                return;
            } else {
                n5Var.setText(org.telegram.messenger.i0.V2(org.telegram.messenger.cd.V(null, null, 2131750643, charSequence)));
                return;
            }
        }
        int size = arrayList != null ? arrayList.size() : 0;
        h00 h00Var = this.c;
        h00Var.E.t(size > 0 ? i0.a.i(size, "+") : "", false, true);
        h00Var.invalidate();
        if (arrayList == null || arrayList.isEmpty()) {
            n5Var.setText(org.telegram.messenger.i0.V2(org.telegram.messenger.cd.V(null, null, 2131750642, charSequence)));
        } else {
            n5Var.setText(org.telegram.messenger.i0.V2(org.telegram.messenger.cd.F("FolderLinkSubtitleChats", arrayList != null ? arrayList.size() : 0, charSequence)));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(172.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            n5 n5Var = this.d;
            if (n5Var != null) {
                int i10 = org.telegram.ui.ActionBar.t6.Ci;
                j00 j00Var = this.f;
                int i11 = j00.x2;
                n5Var.setEmojiColor(org.telegram.ui.ActionBar.t6.w0(i10, j00Var.I0));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
