// default package

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ina extends FrameLayout implements x74, tjb {
    public final wjb a;
    public final FrameLayout b;
    public final kv4 c;
    public final be0 d;
    public final TextView e;
    public final TextView f;
    public Integer h;
    public TLRPC.Document n;
    public final fm0 r;
    public boolean s;
    public gna w;

    public ina(Context context, wjb wjbVar) {
        super(context);
        this.r = new fm0(0, this, s33.h, 320L, false);
        this.a = wjbVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        kv4 kv4Var = new kv4(frameLayout, wjbVar, true);
        this.c = kv4Var;
        frameLayout.setBackground(kv4Var);
        kv4Var.w = true;
        addView(frameLayout, nme.e(-1, -1, kk7.D1));
        be0 be0Var = new be0(context);
        this.d = be0Var;
        be0Var.getImageReceiver().M(0);
        addView(be0Var, nme.d(80, 80.0f, 49, 0.0f, 17.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTypeface(gl.o());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(-1);
        addView(textView, nme.d(-1, -2.0f, 0, 12.0f, 106.0f, 12.0f, 14.0f));
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setClickable(false);
        textView2.setTypeface(gl.o());
        textView2.setTextSize(1, 11.0f);
        textView2.setPadding(gl.L(5.0f), gl.L(1.0f), gl.L(5.0f), gl.L(1.0f));
        textView2.setBackground(bkb.b0(gl.L(10.0f), 285212671));
        addView(textView2, nme.d(-2, -2.0f, 53, 0.0f, 10.0f, 10.0f, 0.0f));
    }

    public final void a() {
        int f;
        kv4 kv4Var = this.c;
        kv4Var.z = null;
        Integer num = this.h;
        fm0 fm0Var = this.r;
        TextView textView = this.f;
        if (num != null) {
            f = bkb.v(bkb.w0(null, bkb.c6, false), bkb.p1(gl.R1(0.15f, 1.0f, fm0Var.e), this.h.intValue()));
            kv4Var.z = this.h;
            this.b.invalidate();
            textView.setTextColor(bm2.f(fm0Var.e, this.h.intValue(), -1));
        } else if (this.s) {
            int i = bkb.c6;
            int w0 = bkb.w0(null, i, false);
            int i2 = bkb.F6;
            int f2 = bm2.f(fm0Var.e, bm2.f(0.05f, w0, bkb.w0(null, i2, false)), bkb.w0(null, bkb.Ei, false));
            textView.setTextColor(bm2.f(fm0Var.e, bm2.f(0.5f, bkb.w0(null, i, false), bkb.w0(null, i2, false)), -1));
            f = f2;
        } else {
            f = bm2.f(0.5f, bm2.o(this.w.a.center_color, kk7.d4), bm2.o(this.w.a.pattern_color, kk7.d4));
            textView.setTextColor(-1);
        }
        if (textView.getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) textView.getBackground()).getPaint().setColor(f);
            textView.invalidate();
        } else if (bkb.F1(textView.getBackground(), f, false)) {
            textView.invalidate();
        }
    }

    public final void b(int i, Object obj, TLRPC.Document document, boolean z) {
        be0 be0Var = this.d;
        if (document == null) {
            be0Var.b();
            this.n = null;
            return;
        }
        if (this.n == document) {
            return;
        }
        this.n = document;
        TLRPC.PhotoSize w = ba4.w(document.thumbs, gl.L(100.0f), false, null, false);
        kcb f = uo3.f(document, bkb.Z6, 0.3f, null);
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append("_");
        sb.append(i);
        sb.append(z ? "_nolimit_pcache" : "");
        String sb2 = sb.toString();
        be0Var.setLayoutParams(nme.d(i, i, 49, 0.0f, r0 + 17, 0.0f, (80 - i) / 2));
        be0Var.j(gl5.b(document), sb2, gl5.c(w, document), sb2, f, obj);
    }

    @Override // x74
    public final void p(int i, float f, float f2, y74 y74Var) {
        a();
    }

    @Override // tjb
    public final void updateColors() {
        gna gnaVar;
        try {
            if (this.f == null || this.b == null || this.c == null) {
                return;
            }
            if (this.h == null && !this.s && ((gnaVar = this.w) == null || gnaVar.a == null)) {
                return;
            }
            a();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override // x74
    public final void D(float f, int i) {
    }
}
