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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class qz extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final boolean a;
    public final CharSequence b;
    public final pz c;
    public final o5 d;
    public final o5 e;
    public final /* synthetic */ rz f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz(rz rzVar, Context context, boolean z10, CharSequence charSequence, ArrayList arrayList, boolean z11) {
        super(context);
        float f10;
        this.f = rzVar;
        this.a = z10;
        String M0 = org.telegram.messenger.bd.M0(2131750652, null);
        String M02 = org.telegram.messenger.bd.M0(2131750651, null);
        CharSequence spannableStringBuilder = charSequence == null ? "" : new SpannableStringBuilder(charSequence);
        pz pzVar = new pz(context);
        TextPaint textPaint = new TextPaint(1);
        pzVar.a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        pzVar.b = textPaint2;
        Paint paint = new Paint(1);
        pzVar.c = paint;
        pzVar.d = new Path();
        float[] fArr = new float[8];
        pzVar.e = fArr;
        Paint paint2 = new Paint(1);
        pzVar.w = paint2;
        Paint paint3 = new Paint(1);
        pzVar.x = paint3;
        pzVar.y = new Matrix();
        pzVar.E = new Matrix();
        int i3 = org.telegram.ui.ActionBar.k6.si;
        textPaint.setColor(org.telegram.ui.ActionBar.k6.r1(0.8f, org.telegram.ui.ActionBar.k6.x0(null, i3, false)));
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.33f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.k6.o6;
        textPaint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(17.0f));
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Hi, false));
        g6 g6Var = new g6(false, true, true);
        pzVar.F = g6Var;
        g6Var.n(0.3f, 250L, xq.h);
        g6Var.setCallback(pzVar);
        g6Var.w(org.telegram.messenger.g0.L(11.66f));
        g6Var.u(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.b = 1;
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.8f, org.telegram.ui.ActionBar.k6.x0(null, i3, false));
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        if (M0 != null) {
            f10 = 15.33f;
            ly0 ly0Var = new ly0(pz.a(M0), 15.33f, org.telegram.messenger.g0.o());
            ly0Var.r(pzVar);
            ly0Var.a.setColor(r12);
            pzVar.f = ly0Var;
        } else {
            f10 = 15.33f;
        }
        CharSequence a10 = pz.a(spannableStringBuilder);
        ly0 ly0Var2 = new ly0(a10, f10, org.telegram.messenger.g0.o());
        ly0Var2.r(pzVar);
        TextPaint textPaint3 = ly0Var2.a;
        textPaint3.setColor(x02);
        pzVar.h = ly0Var2;
        ly0Var2.q(org.telegram.messenger.zi.C5(org.telegram.messenger.i6.m(a10, textPaint3.getFontMetricsInt(), false, null, 0), arrayList, textPaint3.getFontMetricsInt(), false));
        ly0Var2.o(z11 ? 26 : 0);
        if (M02 != null) {
            ly0 ly0Var3 = new ly0(pz.a(M02), 15.33f, org.telegram.messenger.g0.o());
            ly0Var3.r(pzVar);
            ly0Var3.a.setColor(r12);
            pzVar.n = ly0Var3;
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
        pzVar.r = linearGradient;
        paint2.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(80.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, tileMode);
        pzVar.s = linearGradient2;
        paint3.setShader(linearGradient2);
        paint3.setXfermode(new PorterDuffXfermode(mode));
        this.c = pzVar;
        addView(pzVar, b8.mf.d(-1, 44.0f, 55, 0.0f, 17.33f, 0.0f, 0.0f));
        o5 o5Var = new o5(context);
        this.d = o5Var;
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(o5Var, i11, null);
        o5Var.setTextSize(1, 20.0f);
        o5Var.setTypeface(org.telegram.messenger.g0.o());
        o5Var.setGravity(17);
        o5Var.setLineSpacing(org.telegram.messenger.g0.L(-1.0f), 1.0f);
        CharSequence n4 = org.telegram.messenger.i6.n(new SpannableStringBuilder(charSequence), o5Var.getPaint().getFontMetricsInt(), false, null, 0, 0.8f, 0);
        this.b = n4;
        this.b = org.telegram.messenger.zi.D5(n4, arrayList, o5Var.getPaint().getFontMetricsInt(), false, 0.8f, 0);
        o5Var.setText(rzVar.O0());
        o5Var.setCacheType(z11 ? 26 : 0);
        o5Var.setEmojiColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, rzVar.J0));
        addView(o5Var, b8.mf.d(-1, -2.0f, 48, 32.0f, 78.3f, 32.0f, 0.0f));
        o5 o5Var2 = new o5(context);
        this.e = o5Var2;
        org.telegram.ui.ActionBar.r6.V(o5Var2, i11, null);
        o5Var2.setTextSize(1, 14.0f);
        o5Var2.setLines(2);
        o5Var2.setGravity(17);
        o5Var2.setLineSpacing(0.0f, 1.15f);
        addView(o5Var2, b8.mf.d(-1, -2.0f, 48, 32.0f, 113.0f, 32.0f, 0.0f));
        a();
    }

    public final void a() {
        rz rzVar = this.f;
        ArrayList arrayList = rzVar.Z1;
        boolean z10 = rzVar.U1;
        CharSequence charSequence = this.b;
        o5 o5Var = this.e;
        if (z10) {
            o5Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.bd.V(null, null, 2131750638, charSequence)));
            return;
        }
        if (!this.a) {
            if (arrayList == null || arrayList.isEmpty()) {
                o5Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.bd.V(null, null, 2131750642, charSequence)));
                return;
            } else {
                o5Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.bd.V(null, null, 2131750643, charSequence)));
                return;
            }
        }
        int size = arrayList != null ? arrayList.size() : 0;
        pz pzVar = this.c;
        pzVar.F.t(size > 0 ? k2.p1.i(size, "+") : "", false, true);
        pzVar.invalidate();
        if (arrayList == null || arrayList.isEmpty()) {
            o5Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.bd.V(null, null, 2131750642, charSequence)));
        } else {
            o5Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.bd.F("FolderLinkSubtitleChats", arrayList != null ? arrayList.size() : 0, charSequence)));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(172.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            o5 o5Var = this.d;
            if (o5Var != null) {
                int i3 = org.telegram.ui.ActionBar.k6.Ci;
                rz rzVar = this.f;
                int i10 = rz.y2;
                o5Var.setEmojiColor(org.telegram.ui.ActionBar.k6.w0(i3, rzVar.J0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
