package gh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import ea.f;
import fe.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.messenger.ic;
import org.telegram.messenger.ui;
import org.telegram.messenger.v5;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.r8;
import org.telegram.ui.qf0;
import w7.b6;
import w7.u;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b extends FrameLayout implements qf0, e, k6 {
    public static final RectF V = new RectF();
    public a D;
    public TLRPC.TL_attachMenuBot E;
    public final TextPaint F;
    public boolean G;
    public float H;
    public boolean I;
    public float J;
    public boolean K;
    public Drawable L;
    public boolean M;
    public boolean N;
    public int O;
    public long P;
    public boolean Q;
    public int R;
    public float S;
    public TextPaint T;
    public r8 U;
    public final TextView a;
    public final ei0 b;
    public g9 c;
    public p6 d;
    public final Paint e;
    public final e6 f;
    public final fe.b h;
    public final fe.b n;
    public final fe.b r;
    public int s;
    public int w;
    public int x;
    public boolean y;

    public b(Context context) {
        super(context);
        this.e = new Paint(1);
        this.h = new fe.b(0, this, ee.a.a, 320L, false);
        gr grVar = gr.h;
        this.n = new fe.b(1, this, grVar, 380L, false);
        this.r = new fe.b(2, this, grVar, 380L, false);
        this.S = 1.0f;
        ei0 ei0Var = new ei0(context);
        this.b = ei0Var;
        addView(ei0Var, b6.d(44, 44.0f, 49, 0.0f, -6.0f, 0.0f, 0.0f));
        ei0Var.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 12.0f);
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(i0.o());
        textView.setGravity(17);
        this.F = new TextPaint(textView.getPaint());
        addView(textView, b6.d(-1, -2.0f, 49, 0.0f, 28.33f, 0.0f, 0.0f));
        e6 e6Var = new e6(false, false, false);
        this.f = e6Var;
        e6Var.x(i0.o());
        e6Var.setCallback(this);
        e6Var.b = 17;
        e6Var.u(-1);
        e6Var.w(i0.L(10.0f));
    }

    public static b c(Context context, p6 p6Var, a aVar, int i10) {
        b bVar = new b(context);
        bVar.d = p6Var;
        bVar.D = aVar;
        bVar.a.setText(cd.L0(i10, null));
        bVar.b(false);
        bVar.b.setLayoutParams(b6.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.x = t6.w0(t6.Ql, p6Var);
        bVar.s = t6.w0(t6.Ol, p6Var);
        bVar.w = t6.w0(t6.Pl, p6Var);
        bVar.a();
        return bVar;
    }

    public final void a() {
        int i10 = this.x;
        int i11 = this.s;
        fe.b bVar = this.h;
        int f7 = i0.b.f(bVar.e, i10, i11);
        int f10 = i0.b.f(bVar.e, this.x, this.w);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(f7, PorterDuff.Mode.SRC_IN);
        g9 g9Var = this.c;
        if (g9Var != null && this.M) {
            g9Var.setColorFilter(porterDuffColorFilter);
            this.c.invalidate();
        }
        this.b.setColorFilter(porterDuffColorFilter);
        this.a.setTextColor(f10);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(t6.Ql));
        hashSet.add(Integer.valueOf(t6.Ol));
        hashSet.add(Integer.valueOf(t6.Pl));
    }

    public final void b(boolean z10) {
        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon;
        TLRPC.Document document;
        boolean z11 = this.h.f;
        TLRPC.TL_attachMenuBot tL_attachMenuBot = this.E;
        boolean z12 = true;
        if (tL_attachMenuBot != null) {
            Pattern pattern = ui.R1;
            ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList = tL_attachMenuBot.icons;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    tL_attachMenuBotIcon = null;
                    break;
                }
                TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = arrayList.get(i10);
                i10++;
                tL_attachMenuBotIcon = tL_attachMenuBotIcon2;
                if (tL_attachMenuBotIcon.name.equals(z11 ? "android_active_animated" : "android_animated")) {
                    break;
                }
            }
            if (tL_attachMenuBotIcon == null) {
                tL_attachMenuBotIcon = ui.k0(this.E);
                z12 = false;
            }
            if (tL_attachMenuBotIcon == null || (document = tL_attachMenuBotIcon.icon) == null) {
                this.c.b();
            } else if (this.P != document.id) {
                this.c.m(ic.b(document), "24_24_lastframe", ic.b(document), "24_24_lastframe", z12 ? null : v5.f(document, t6.a7, 1.0f, null), this.E);
                this.P = document.id;
            }
            a();
            return;
        }
        a aVar = this.D;
        if (aVar == null) {
            return;
        }
        int i11 = aVar.b;
        int i12 = aVar.a;
        int i13 = aVar.c;
        ei0 ei0Var = this.b;
        if (i13 != -1) {
            ei0Var.setImageResource(i13);
            a();
            return;
        }
        int i14 = z11 ? i12 : i11;
        if (aVar.d != -1) {
            boolean z13 = this.N != z11;
            if (this.O != i14) {
                this.O = i14;
                ei0Var.f(i14, 24, 24, null);
                z13 = true;
            }
            if (z13) {
                bi0 animatedDrawable = ei0Var.getAnimatedDrawable();
                if (animatedDrawable == null) {
                    return;
                }
                if (z11) {
                    animatedDrawable.P(this.D.d);
                    if (animatedDrawable.a0 >= this.D.e - 2) {
                        animatedDrawable.N(0, false, false);
                    }
                    int i15 = animatedDrawable.a0;
                    int i16 = this.D.d;
                    if (i15 <= i16) {
                        animatedDrawable.start();
                    } else {
                        animatedDrawable.M(i16);
                    }
                } else {
                    int i17 = animatedDrawable.a0;
                    a aVar2 = this.D;
                    if (i17 >= aVar2.d - 1) {
                        animatedDrawable.P(aVar2.e - 1);
                        animatedDrawable.start();
                    } else {
                        animatedDrawable.P(0);
                        animatedDrawable.M(0);
                    }
                }
            }
            this.N = z11;
            return;
        }
        if (i12 != i11) {
            if (this.O != i14) {
                this.O = i14;
                ei0Var.f(i14, 24, 24, null);
                ei0Var.getAnimatedDrawable().h = false;
                if (!z10) {
                    ei0Var.getAnimatedDrawable().T(true, 0.99f);
                    return;
                } else {
                    ei0Var.getAnimatedDrawable().M(0);
                    ei0Var.d();
                    return;
                }
            }
            return;
        }
        if (ei0Var.getAnimatedDrawable() == null) {
            ei0Var.f(this.D.a, 24, 24, null);
        }
        bi0 animatedDrawable2 = ei0Var.getAnimatedDrawable();
        if (animatedDrawable2 == null) {
            return;
        }
        int[] iArr = animatedDrawable2.e;
        if (this.N != z11) {
            this.N = z11;
            if (z11) {
                animatedDrawable2.h = false;
                animatedDrawable2.M(0);
                animatedDrawable2.P(iArr[0]);
            } else {
                animatedDrawable2.h = true;
                animatedDrawable2.M(iArr[0]);
                animatedDrawable2.P(0);
            }
            ei0Var.d();
        }
    }

    public final float d() {
        float measureText = this.F.measureText(this.a.getText().toString());
        return Math.min(i0.L(84.0f), (int) ((i0.T1(i0.N(16.0f), i0.L(8.0f), u.a((measureText - i0.L(40.0f)) / i0.L(16.0f), 0.0f, 1.0f)) * 2.0f) + measureText));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float width = this.G ? this.H : getWidth();
        float f7 = this.I ? this.J : this.h.e;
        RectF rectF = V;
        Paint paint = this.e;
        if (f7 > 0.0f && !this.K) {
            paint.setColor(t6.r1(ee.a.a.getInterpolation(f7) * 0.09f, this.s));
            rectF.set(0.0f, 0.0f, width, getHeight());
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float a2 = u.a(this.S, 0.0f, 1.0f) * i0.T1(0.6f, 1.0f, f7);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            canvas.drawRoundRect(rectF, min, min, paint);
            canvas.restore();
        }
        float f10 = (this.y ? 1.0f : this.n.e) * this.S;
        boolean z10 = f10 > 0.0f;
        if (z10) {
            canvas.saveLayer(0.0f, 0.0f, width, getHeight(), null);
        }
        super.dispatchDraw(canvas);
        if (f10 > 0.0f) {
            canvas.save();
            float N = i0.N(1.33f);
            float N2 = i0.N(11.0f) + (width / 2.0f);
            float N3 = i0.N(10.0f);
            float N4 = i0.N(16.0f);
            e6 e6Var = this.f;
            float max = Math.max(N4, e6Var.c() + i0.L(8.0f));
            float N5 = i0.N(9.333f);
            float N6 = i0.N(8.0f);
            float f11 = max / 2.0f;
            float f12 = N4 / 2.0f;
            rectF.set((N2 - f11) - N, (N3 - f12) - N, f11 + N2 + N, f12 + N3 + N);
            canvas.scale(f10, f10, N2, N3);
            canvas.drawRoundRect(rectF, N5, N5, t6.Cm);
            rectF.inset(N, N);
            if (this.y) {
                if (this.L == null) {
                    this.L = getContext().getResources().getDrawable(R.drawable.star).mutate();
                }
                f.d().f(0.0f, 0.0f, i0.L(96.0f), i0.L(16.0f));
                canvas.drawRoundRect(rectF, N6, N6, f.d().e());
                int N7 = (int) (N2 - i0.N(7.0f));
                int N8 = (int) (N3 - i0.N(7.0f));
                this.L.setBounds(N7, N8, i0.L(14.0f) + N7, i0.L(14.0f) + N8);
                this.L.draw(canvas);
            } else {
                paint.setColor(i0.b.f(this.r.e, t6.x0(null, t6.Vl, false), t6.x0(null, t6.r7, false)));
                canvas.drawRoundRect(rectF, N6, N6, paint);
                e6Var.p(rectF);
                e6Var.draw(canvas);
            }
            canvas.restore();
        }
        if (z10) {
            canvas.restore();
        }
    }

    public final void e(String str, boolean z10, boolean z11) {
        this.f.t(str, z11, true);
        this.n.a(!TextUtils.isEmpty(str), z11);
        this.r.a(z10, z11);
    }

    public final void f(boolean z10, boolean z11) {
        this.h.a(z10, z11);
        b(z11);
        this.a.setTypeface(z10 ? i0.o1("fonts/rextrabold.ttf") : i0.o());
    }

    public final void g() {
        this.x = t6.w0(t6.Ql, this.d);
        this.s = t6.w0(t6.Ol, this.d);
        this.w = t6.w0(t6.Pl, this.d);
        a();
        invalidate();
    }

    public g9 getBackupImageView() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.Q) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(((int) d()) + this.R, TLObject.FLAG_30), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.G) {
            float measuredWidth = (this.H - getMeasuredWidth()) / 2.0f;
            this.b.setTranslationX(measuredWidth);
            this.a.setTranslationX(measuredWidth);
        }
    }

    public void setAdditionalWidth(int i10) {
        this.R = i10;
        this.Q = true;
    }

    public void setAttachScale(float f7) {
        TextView textView = this.a;
        textView.setScaleX(f7);
        textView.setScaleY(f7);
        ei0 ei0Var = this.b;
        ei0Var.setScaleX(f7);
        ei0Var.setScaleY(f7);
        g9 g9Var = this.c;
        if (g9Var != null) {
            g9Var.setScaleX(f7);
            this.c.setScaleY(f7);
        }
        this.S = f7;
        invalidate();
    }

    public void setPremiumBadge(boolean z10) {
        this.y = z10;
    }

    public void setSkipDrawSelector(boolean z10) {
        if (this.K != z10) {
            this.K = z10;
            invalidate();
        }
    }

    public void setTabAnimation(a aVar) {
        this.D = aVar;
        this.E = null;
        this.O = 0;
        this.P = 0L;
        this.b.a();
        b(false);
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public void setTextSizeDp(float f7) {
        float L = i0.L(f7);
        TextView textView = this.a;
        if (textView.getTextSize() != L) {
            textView.setTextSize(1, f7);
            this.F.setTextSize(L);
        }
    }

    public void setVisualWidth(float f7) {
        this.G = true;
        if (this.H != f7) {
            this.H = f7;
            float measuredWidth = (f7 - getMeasuredWidth()) / 2.0f;
            this.b.setTranslationX(measuredWidth);
            this.a.setTranslationX(measuredWidth);
            invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        if (this.x == t6.w0(t6.Ql, this.d) && this.s == t6.w0(t6.Ol, this.d) && this.w == t6.w0(t6.Pl, this.d)) {
            return;
        }
        g();
    }

    @Override // fe.e
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        if (i10 == 0) {
            a();
        }
        invalidate();
    }

    @Override // fe.e
    public final /* synthetic */ void E(float f7, int i10) {
    }
}
