// default package

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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class kl4 extends FrameLayout implements tjb {
    public final boolean a;
    public final CharSequence b;
    public final jl4 c;
    public final fm d;
    public final fm e;
    public final /* synthetic */ ll4 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kl4(ll4 ll4Var, Context context, boolean z, CharSequence charSequence, ArrayList arrayList, boolean z2) {
        super(context);
        this.f = ll4Var;
        this.a = z;
        String M0 = k96.M0(2131750634, null);
        String M02 = k96.M0(2131750633, null);
        CharSequence spannableStringBuilder = charSequence == null ? "" : new SpannableStringBuilder(charSequence);
        jl4 jl4Var = new jl4(context);
        TextPaint textPaint = new TextPaint(1);
        jl4Var.a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        jl4Var.b = textPaint2;
        Paint paint = new Paint(1);
        jl4Var.c = paint;
        jl4Var.d = new Path();
        float[] fArr = new float[8];
        jl4Var.e = fArr;
        Paint paint2 = new Paint(1);
        jl4Var.w = paint2;
        Paint paint3 = new Paint(1);
        jl4Var.x = paint3;
        jl4Var.y = new Matrix();
        jl4Var.E = new Matrix();
        int i = bkb.ui;
        textPaint.setColor(bkb.p1(0.8f, bkb.w0(null, i, false)));
        de9.p(textPaint, gl.L(15.33f));
        int i2 = bkb.n6;
        textPaint2.setColor(bkb.w0(null, i2, false));
        de9.p(textPaint2, gl.L(17.0f));
        paint.setColor(bkb.w0(null, bkb.Ji, false));
        gn gnVar = new gn(false, true, true);
        jl4Var.F = gnVar;
        gnVar.n(0.3f, 250L, s33.h);
        gnVar.setCallback(jl4Var);
        gnVar.w(gl.L(11.66f));
        gnVar.u(bkb.w0(null, bkb.c6, false));
        gnVar.x(gl.o());
        gnVar.b = 1;
        int p1 = bkb.p1(0.8f, bkb.w0(null, i, false));
        int w0 = bkb.w0(null, i2, false);
        tgb tgbVar = new tgb(jl4.a(M0), 15.33f, gl.o());
        tgbVar.q(jl4Var);
        tgbVar.a.setColor(p1);
        jl4Var.f = tgbVar;
        CharSequence a = jl4.a(spannableStringBuilder);
        tgb tgbVar2 = new tgb(a, 15.33f, gl.o());
        tgbVar2.q(jl4Var);
        TextPaint textPaint3 = tgbVar2.a;
        textPaint3.setColor(w0);
        jl4Var.h = tgbVar2;
        tgbVar2.p(k27.A5(vu3.m(a, textPaint3.getFontMetricsInt(), false, null, 0), arrayList, textPaint3.getFontMetricsInt(), false));
        tgbVar2.n(z2 ? 26 : 0);
        tgb tgbVar3 = new tgb(jl4.a(M02), 15.33f, gl.o());
        tgbVar3.q(jl4Var);
        tgbVar3.a.setColor(p1);
        jl4Var.n = tgbVar3;
        float L = gl.L(3.0f);
        fArr[3] = L;
        fArr[2] = L;
        fArr[1] = L;
        fArr[0] = L;
        float L2 = gl.L(1.0f);
        fArr[7] = L2;
        fArr[6] = L2;
        fArr[5] = L2;
        fArr[4] = L2;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, gl.L(80.0f), 0.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, tileMode);
        jl4Var.r = linearGradient;
        paint2.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, gl.L(80.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, tileMode);
        jl4Var.s = linearGradient2;
        paint3.setShader(linearGradient2);
        paint3.setXfermode(new PorterDuffXfermode(mode));
        this.c = jl4Var;
        addView(jl4Var, nme.d(-1, 44.0f, 55, 0.0f, 17.33f, 0.0f, 0.0f));
        fm fmVar = new fm(context);
        this.d = fmVar;
        int i3 = bkb.F6;
        zkb.X(fmVar, i3, null);
        fmVar.setTextSize(1, 20.0f);
        fmVar.setTypeface(gl.o());
        fmVar.setGravity(17);
        fmVar.setLineSpacing(gl.L(-1.0f), 1.0f);
        CharSequence n = vu3.n(new SpannableStringBuilder(charSequence), fmVar.getPaint().getFontMetricsInt(), false, null, 0, 0.8f, 0);
        this.b = n;
        this.b = k27.B5(n, arrayList, fmVar.getPaint().getFontMetricsInt(), false, 0.8f, 0);
        fmVar.setText(ll4Var.J0());
        fmVar.setCacheType(z2 ? 26 : 0);
        fmVar.setEmojiColor(bkb.v0(bkb.Ei, ll4Var.J0));
        addView(fmVar, nme.d(-1, -2.0f, 48, 32.0f, 78.3f, 32.0f, 0.0f));
        fm fmVar2 = new fm(context);
        this.e = fmVar2;
        zkb.X(fmVar2, i3, null);
        fmVar2.setTextSize(1, 14.0f);
        fmVar2.setLines(2);
        fmVar2.setGravity(17);
        fmVar2.setLineSpacing(0.0f, 1.15f);
        addView(fmVar2, nme.d(-1, -2.0f, 48, 32.0f, 113.0f, 32.0f, 0.0f));
        a();
    }

    public final void a() {
        ll4 ll4Var = this.f;
        ArrayList arrayList = ll4Var.b2;
        boolean z = ll4Var.W1;
        CharSequence charSequence = this.b;
        fm fmVar = this.e;
        if (z) {
            fmVar.setText(gl.S2(k96.V(null, null, 2131750620, charSequence)));
            return;
        }
        if (!this.a) {
            if (arrayList == null || arrayList.isEmpty()) {
                fmVar.setText(gl.S2(k96.V(null, null, 2131750624, charSequence)));
                return;
            } else {
                fmVar.setText(gl.S2(k96.V(null, null, 2131750625, charSequence)));
                return;
            }
        }
        int size = arrayList != null ? arrayList.size() : 0;
        jl4 jl4Var = this.c;
        jl4Var.F.t(size > 0 ? de9.k(size, "+") : "", false, true);
        jl4Var.invalidate();
        if (arrayList == null || arrayList.isEmpty()) {
            fmVar.setText(gl.S2(k96.V(null, null, 2131750624, charSequence)));
        } else {
            fmVar.setText(gl.S2(k96.F("FolderLinkSubtitleChats", arrayList != null ? arrayList.size() : 0, charSequence)));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(172.0f), TLObject.FLAG_30));
    }

    @Override // tjb
    public final void updateColors() {
        try {
            fm fmVar = this.d;
            if (fmVar != null) {
                int i = bkb.Ei;
                ll4 ll4Var = this.f;
                int i2 = ll4.A2;
                fmVar.setEmojiColor(bkb.v0(i, ll4Var.J0));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
