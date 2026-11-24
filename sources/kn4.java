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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kn4 extends FrameLayout implements vlb {
    public final boolean a;
    public final CharSequence b;
    public final jn4 c;
    public final fn d;
    public final fn e;
    public final /* synthetic */ ln4 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn4(ln4 ln4Var, Context context, boolean z, CharSequence charSequence, ArrayList arrayList, boolean z2) {
        super(context);
        this.f = ln4Var;
        this.a = z;
        String M0 = jb6.M0(2131750583, null);
        String M02 = jb6.M0(2131750582, null);
        CharSequence spannableStringBuilder = charSequence == null ? "" : new SpannableStringBuilder(charSequence);
        jn4 jn4Var = new jn4(context);
        TextPaint textPaint = new TextPaint(1);
        jn4Var.a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        jn4Var.b = textPaint2;
        Paint paint = new Paint(1);
        jn4Var.c = paint;
        jn4Var.d = new Path();
        float[] fArr = new float[8];
        jn4Var.e = fArr;
        Paint paint2 = new Paint(1);
        jn4Var.w = paint2;
        Paint paint3 = new Paint(1);
        jn4Var.x = paint3;
        jn4Var.y = new Matrix();
        jn4Var.E = new Matrix();
        int i = cmb.ui;
        textPaint.setColor(cmb.p1(0.8f, cmb.w0(null, i, false)));
        hg9.o(textPaint, gm.L(15.33f));
        int i2 = cmb.n6;
        textPaint2.setColor(cmb.w0(null, i2, false));
        hg9.o(textPaint2, gm.L(17.0f));
        paint.setColor(cmb.w0(null, cmb.Ji, false));
        ho hoVar = new ho(false, true, true);
        jn4Var.F = hoVar;
        hoVar.n(0.3f, 250L, d53.h);
        hoVar.setCallback(jn4Var);
        hoVar.w(gm.L(11.66f));
        hoVar.u(cmb.w0(null, cmb.c6, false));
        hoVar.x(gm.o());
        hoVar.b = 1;
        int p1 = cmb.p1(0.8f, cmb.w0(null, i, false));
        int w0 = cmb.w0(null, i2, false);
        uib uibVar = new uib(jn4.a(M0), 15.33f, gm.o());
        uibVar.q(jn4Var);
        uibVar.a.setColor(p1);
        jn4Var.f = uibVar;
        CharSequence a = jn4.a(spannableStringBuilder);
        uib uibVar2 = new uib(a, 15.33f, gm.o());
        uibVar2.q(jn4Var);
        TextPaint textPaint3 = uibVar2.a;
        textPaint3.setColor(w0);
        jn4Var.h = uibVar2;
        uibVar2.p(k47.A5(gw3.m(a, textPaint3.getFontMetricsInt(), false, null, 0), arrayList, textPaint3.getFontMetricsInt(), false));
        uibVar2.n(z2 ? 26 : 0);
        uib uibVar3 = new uib(jn4.a(M02), 15.33f, gm.o());
        uibVar3.q(jn4Var);
        uibVar3.a.setColor(p1);
        jn4Var.n = uibVar3;
        float L = gm.L(3.0f);
        fArr[3] = L;
        fArr[2] = L;
        fArr[1] = L;
        fArr[0] = L;
        float L2 = gm.L(1.0f);
        fArr[7] = L2;
        fArr[6] = L2;
        fArr[5] = L2;
        fArr[4] = L2;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, gm.L(80.0f), 0.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, tileMode);
        jn4Var.r = linearGradient;
        paint2.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, gm.L(80.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, tileMode);
        jn4Var.s = linearGradient2;
        paint3.setShader(linearGradient2);
        paint3.setXfermode(new PorterDuffXfermode(mode));
        this.c = jn4Var;
        addView(jn4Var, qoe.d(-1, 44.0f, 55, 0.0f, 17.33f, 0.0f, 0.0f));
        fn fnVar = new fn(context);
        this.d = fnVar;
        int i3 = cmb.F6;
        anb.X(fnVar, i3, null);
        fnVar.setTextSize(1, 20.0f);
        fnVar.setTypeface(gm.o());
        fnVar.setGravity(17);
        fnVar.setLineSpacing(gm.L(-1.0f), 1.0f);
        CharSequence n = gw3.n(new SpannableStringBuilder(charSequence), fnVar.getPaint().getFontMetricsInt(), false, null, 0, 0.8f, 0);
        this.b = n;
        this.b = k47.B5(n, arrayList, fnVar.getPaint().getFontMetricsInt(), false, 0.8f, 0);
        fnVar.setText(ln4Var.J0());
        fnVar.setCacheType(z2 ? 26 : 0);
        fnVar.setEmojiColor(cmb.v0(cmb.Ei, ln4Var.J0));
        addView(fnVar, qoe.d(-1, -2.0f, 48, 32.0f, 78.3f, 32.0f, 0.0f));
        fn fnVar2 = new fn(context);
        this.e = fnVar2;
        anb.X(fnVar2, i3, null);
        fnVar2.setTextSize(1, 14.0f);
        fnVar2.setLines(2);
        fnVar2.setGravity(17);
        fnVar2.setLineSpacing(0.0f, 1.15f);
        addView(fnVar2, qoe.d(-1, -2.0f, 48, 32.0f, 113.0f, 32.0f, 0.0f));
        a();
    }

    public final void a() {
        ln4 ln4Var = this.f;
        ArrayList arrayList = ln4Var.b2;
        boolean z = ln4Var.W1;
        CharSequence charSequence = this.b;
        fn fnVar = this.e;
        if (z) {
            fnVar.setText(gm.R2(jb6.V(null, null, 2131750569, charSequence)));
            return;
        }
        if (!this.a) {
            if (arrayList == null || arrayList.isEmpty()) {
                fnVar.setText(gm.R2(jb6.V(null, null, 2131750573, charSequence)));
                return;
            } else {
                fnVar.setText(gm.R2(jb6.V(null, null, 2131750574, charSequence)));
                return;
            }
        }
        int size = arrayList != null ? arrayList.size() : 0;
        jn4 jn4Var = this.c;
        jn4Var.F.t(size > 0 ? hg9.j(size, "+") : "", false, true);
        jn4Var.invalidate();
        if (arrayList == null || arrayList.isEmpty()) {
            fnVar.setText(gm.R2(jb6.V(null, null, 2131750573, charSequence)));
        } else {
            fnVar.setText(gm.R2(jb6.F("FolderLinkSubtitleChats", arrayList != null ? arrayList.size() : 0, charSequence)));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(172.0f), TLObject.FLAG_30));
    }

    @Override // vlb
    public final void updateColors() {
        try {
            fn fnVar = this.d;
            if (fnVar != null) {
                int i = cmb.Ei;
                ln4 ln4Var = this.f;
                int i2 = ln4.A2;
                fnVar.setEmojiColor(cmb.v0(i, ln4Var.J0));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
