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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class uz extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final boolean a;
    public final CharSequence b;
    public final tz c;
    public final p5 d;
    public final p5 e;
    public final /* synthetic */ vz f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uz(vz vzVar, Context context, boolean z9, CharSequence charSequence, ArrayList arrayList, boolean z10) {
        super(context);
        float f10;
        this.f = vzVar;
        this.a = z9;
        String M0 = org.telegram.messenger.id.M0(2131750651, null);
        String M02 = org.telegram.messenger.id.M0(2131750650, null);
        CharSequence spannableStringBuilder = charSequence == null ? "" : new SpannableStringBuilder(charSequence);
        tz tzVar = new tz(context);
        TextPaint textPaint = new TextPaint(1);
        tzVar.a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        tzVar.b = textPaint2;
        Paint paint = new Paint(1);
        tzVar.c = paint;
        tzVar.d = new Path();
        float[] fArr = new float[8];
        tzVar.e = fArr;
        Paint paint2 = new Paint(1);
        tzVar.w = paint2;
        Paint paint3 = new Paint(1);
        tzVar.x = paint3;
        tzVar.y = new Matrix();
        tzVar.D = new Matrix();
        int i7 = org.telegram.ui.ActionBar.m6.si;
        textPaint.setColor(org.telegram.ui.ActionBar.m6.r1(0.8f, org.telegram.ui.ActionBar.m6.x0(null, i7, false)));
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.33f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.m6.o6;
        textPaint2.setColor(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(17.0f));
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Hi, false));
        h6 h6Var = new h6(false, true, true);
        tzVar.E = h6Var;
        h6Var.n(0.3f, 250L, wq.h);
        h6Var.setCallback(tzVar);
        h6Var.w(org.telegram.messenger.g0.L(11.66f));
        h6Var.u(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.d6, false));
        h6Var.x(org.telegram.messenger.g0.o());
        h6Var.b = 1;
        int r12 = org.telegram.ui.ActionBar.m6.r1(0.8f, org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i10, false);
        if (M0 != null) {
            f10 = 15.33f;
            my0 my0Var = new my0(tz.a(M0), 15.33f, org.telegram.messenger.g0.o());
            my0Var.r(tzVar);
            my0Var.a.setColor(r12);
            tzVar.f = my0Var;
        } else {
            f10 = 15.33f;
        }
        CharSequence a10 = tz.a(spannableStringBuilder);
        my0 my0Var2 = new my0(a10, f10, org.telegram.messenger.g0.o());
        my0Var2.r(tzVar);
        TextPaint textPaint3 = my0Var2.a;
        textPaint3.setColor(x02);
        tzVar.h = my0Var2;
        my0Var2.q(org.telegram.messenger.ij.B5(org.telegram.messenger.i6.m(a10, textPaint3.getFontMetricsInt(), false, null, 0), arrayList, textPaint3.getFontMetricsInt(), false));
        my0Var2.o(z10 ? 26 : 0);
        if (M02 != null) {
            my0 my0Var3 = new my0(tz.a(M02), 15.33f, org.telegram.messenger.g0.o());
            my0Var3.r(tzVar);
            my0Var3.a.setColor(r12);
            tzVar.n = my0Var3;
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
        tzVar.r = linearGradient;
        paint2.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(80.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, tileMode);
        tzVar.s = linearGradient2;
        paint3.setShader(linearGradient2);
        paint3.setXfermode(new PorterDuffXfermode(mode));
        this.c = tzVar;
        addView(tzVar, c8.ha.d(-1, 44.0f, 55, 0.0f, 17.33f, 0.0f, 0.0f));
        p5 p5Var = new p5(context);
        this.d = p5Var;
        int i11 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(p5Var, i11, null);
        p5Var.setTextSize(1, 20.0f);
        p5Var.setTypeface(org.telegram.messenger.g0.o());
        p5Var.setGravity(17);
        p5Var.setLineSpacing(org.telegram.messenger.g0.L(-1.0f), 1.0f);
        CharSequence n10 = org.telegram.messenger.i6.n(new SpannableStringBuilder(charSequence), p5Var.getPaint().getFontMetricsInt(), false, null, 0, 0.8f, 0);
        this.b = n10;
        this.b = org.telegram.messenger.ij.C5(n10, arrayList, p5Var.getPaint().getFontMetricsInt(), false, 0.8f, 0);
        p5Var.setText(vzVar.O0());
        p5Var.setCacheType(z10 ? 26 : 0);
        p5Var.setEmojiColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, vzVar.I0));
        addView(p5Var, c8.ha.d(-1, -2.0f, 48, 32.0f, 78.3f, 32.0f, 0.0f));
        p5 p5Var2 = new p5(context);
        this.e = p5Var2;
        org.telegram.ui.ActionBar.t6.U(p5Var2, i11, null);
        p5Var2.setTextSize(1, 14.0f);
        p5Var2.setLines(2);
        p5Var2.setGravity(17);
        p5Var2.setLineSpacing(0.0f, 1.15f);
        addView(p5Var2, c8.ha.d(-1, -2.0f, 48, 32.0f, 113.0f, 32.0f, 0.0f));
        a();
    }

    public final void a() {
        vz vzVar = this.f;
        ArrayList arrayList = vzVar.b2;
        boolean z9 = vzVar.W1;
        CharSequence charSequence = this.b;
        p5 p5Var = this.e;
        if (z9) {
            p5Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.id.V(null, null, 2131750637, charSequence)));
            return;
        }
        if (!this.a) {
            if (arrayList == null || arrayList.isEmpty()) {
                p5Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.id.V(null, null, 2131750641, charSequence)));
                return;
            } else {
                p5Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.id.V(null, null, 2131750642, charSequence)));
                return;
            }
        }
        int size = arrayList != null ? arrayList.size() : 0;
        tz tzVar = this.c;
        tzVar.E.t(size > 0 ? jg.g.j(size, "+") : "", false, true);
        tzVar.invalidate();
        if (arrayList == null || arrayList.isEmpty()) {
            p5Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.id.V(null, null, 2131750641, charSequence)));
        } else {
            p5Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.id.F("FolderLinkSubtitleChats", arrayList != null ? arrayList.size() : 0, charSequence)));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(172.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            p5 p5Var = this.d;
            if (p5Var != null) {
                int i7 = org.telegram.ui.ActionBar.m6.Ci;
                vz vzVar = this.f;
                int i10 = vz.A2;
                p5Var.setEmojiColor(org.telegram.ui.ActionBar.m6.w0(i7, vzVar.I0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
