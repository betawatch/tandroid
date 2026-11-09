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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class vz extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final boolean a;
    public final CharSequence b;
    public final uz c;
    public final q5 d;
    public final q5 e;
    public final /* synthetic */ wz f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz(wz wzVar, Context context, boolean z9, CharSequence charSequence, ArrayList arrayList, boolean z10) {
        super(context);
        float f10;
        this.f = wzVar;
        this.a = z9;
        String M0 = org.telegram.messenger.id.M0(2131750651, null);
        String M02 = org.telegram.messenger.id.M0(2131750650, null);
        CharSequence spannableStringBuilder = charSequence == null ? "" : new SpannableStringBuilder(charSequence);
        uz uzVar = new uz(context);
        TextPaint textPaint = new TextPaint(1);
        uzVar.a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        uzVar.b = textPaint2;
        Paint paint = new Paint(1);
        uzVar.c = paint;
        uzVar.d = new Path();
        float[] fArr = new float[8];
        uzVar.e = fArr;
        Paint paint2 = new Paint(1);
        uzVar.w = paint2;
        Paint paint3 = new Paint(1);
        uzVar.x = paint3;
        uzVar.y = new Matrix();
        uzVar.D = new Matrix();
        int i7 = org.telegram.ui.ActionBar.l6.si;
        textPaint.setColor(org.telegram.ui.ActionBar.l6.r1(0.8f, org.telegram.ui.ActionBar.l6.x0(null, i7, false)));
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.33f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.l6.o6;
        textPaint2.setColor(org.telegram.ui.ActionBar.l6.x0(null, i10, false));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(17.0f));
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        paint.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Hi, false));
        i6 i6Var = new i6(false, true, true);
        uzVar.E = i6Var;
        i6Var.n(0.3f, 250L, xq.h);
        i6Var.setCallback(uzVar);
        i6Var.w(org.telegram.messenger.g0.L(11.66f));
        i6Var.u(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.d6, false));
        i6Var.x(org.telegram.messenger.g0.o());
        i6Var.b = 1;
        int r12 = org.telegram.ui.ActionBar.l6.r1(0.8f, org.telegram.ui.ActionBar.l6.x0(null, i7, false));
        int x02 = org.telegram.ui.ActionBar.l6.x0(null, i10, false);
        if (M0 != null) {
            f10 = 15.33f;
            ny0 ny0Var = new ny0(uz.a(M0), 15.33f, org.telegram.messenger.g0.o());
            ny0Var.r(uzVar);
            ny0Var.a.setColor(r12);
            uzVar.f = ny0Var;
        } else {
            f10 = 15.33f;
        }
        CharSequence a10 = uz.a(spannableStringBuilder);
        ny0 ny0Var2 = new ny0(a10, f10, org.telegram.messenger.g0.o());
        ny0Var2.r(uzVar);
        TextPaint textPaint3 = ny0Var2.a;
        textPaint3.setColor(x02);
        uzVar.h = ny0Var2;
        ny0Var2.q(org.telegram.messenger.ij.B5(org.telegram.messenger.i6.m(a10, textPaint3.getFontMetricsInt(), false, null, 0), arrayList, textPaint3.getFontMetricsInt(), false));
        ny0Var2.o(z10 ? 26 : 0);
        if (M02 != null) {
            ny0 ny0Var3 = new ny0(uz.a(M02), 15.33f, org.telegram.messenger.g0.o());
            ny0Var3.r(uzVar);
            ny0Var3.a.setColor(r12);
            uzVar.n = ny0Var3;
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
        uzVar.r = linearGradient;
        paint2.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(80.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, tileMode);
        uzVar.s = linearGradient2;
        paint3.setShader(linearGradient2);
        paint3.setXfermode(new PorterDuffXfermode(mode));
        this.c = uzVar;
        addView(uzVar, c8.ha.d(-1, 44.0f, 55, 0.0f, 17.33f, 0.0f, 0.0f));
        q5 q5Var = new q5(context);
        this.d = q5Var;
        int i11 = org.telegram.ui.ActionBar.l6.G6;
        org.telegram.ui.ActionBar.s6.U(q5Var, i11, null);
        q5Var.setTextSize(1, 20.0f);
        q5Var.setTypeface(org.telegram.messenger.g0.o());
        q5Var.setGravity(17);
        q5Var.setLineSpacing(org.telegram.messenger.g0.L(-1.0f), 1.0f);
        CharSequence n10 = org.telegram.messenger.i6.n(new SpannableStringBuilder(charSequence), q5Var.getPaint().getFontMetricsInt(), false, null, 0, 0.8f, 0);
        this.b = n10;
        this.b = org.telegram.messenger.ij.C5(n10, arrayList, q5Var.getPaint().getFontMetricsInt(), false, 0.8f, 0);
        q5Var.setText(wzVar.O0());
        q5Var.setCacheType(z10 ? 26 : 0);
        q5Var.setEmojiColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Ci, wzVar.I0));
        addView(q5Var, c8.ha.d(-1, -2.0f, 48, 32.0f, 78.3f, 32.0f, 0.0f));
        q5 q5Var2 = new q5(context);
        this.e = q5Var2;
        org.telegram.ui.ActionBar.s6.U(q5Var2, i11, null);
        q5Var2.setTextSize(1, 14.0f);
        q5Var2.setLines(2);
        q5Var2.setGravity(17);
        q5Var2.setLineSpacing(0.0f, 1.15f);
        addView(q5Var2, c8.ha.d(-1, -2.0f, 48, 32.0f, 113.0f, 32.0f, 0.0f));
        a();
    }

    public final void a() {
        wz wzVar = this.f;
        ArrayList arrayList = wzVar.Y1;
        boolean z9 = wzVar.T1;
        CharSequence charSequence = this.b;
        q5 q5Var = this.e;
        if (z9) {
            q5Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.id.V(null, null, 2131750637, charSequence)));
            return;
        }
        if (!this.a) {
            if (arrayList == null || arrayList.isEmpty()) {
                q5Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.id.V(null, null, 2131750641, charSequence)));
                return;
            } else {
                q5Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.id.V(null, null, 2131750642, charSequence)));
                return;
            }
        }
        int size = arrayList != null ? arrayList.size() : 0;
        uz uzVar = this.c;
        uzVar.E.t(size > 0 ? jg.g.j(size, "+") : "", false, true);
        uzVar.invalidate();
        if (arrayList == null || arrayList.isEmpty()) {
            q5Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.id.V(null, null, 2131750641, charSequence)));
        } else {
            q5Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.id.F("FolderLinkSubtitleChats", arrayList != null ? arrayList.size() : 0, charSequence)));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(172.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            q5 q5Var = this.d;
            if (q5Var != null) {
                int i7 = org.telegram.ui.ActionBar.l6.Ci;
                wz wzVar = this.f;
                int i10 = wz.x2;
                q5Var.setEmojiColor(org.telegram.ui.ActionBar.l6.w0(i7, wzVar.I0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
