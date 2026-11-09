package ji;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bg.o0;
import c8.ha;
import ii.k0;
import ii.l0;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.wp;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class h extends FrameLayout implements b6 {
    public static final /* synthetic */ int H = 0;
    public int D;
    public e E;
    public long F;
    public long G;
    public final g6 a;
    public final int b;
    public final l9 c;
    public final TextView d;
    public final l9 e;
    public final TextView f;
    public final TextView h;
    public final TextView n;
    public final fi.d r;
    public final wp s;
    public final ri.f w;
    public final fh.g x;
    public boolean y;

    public h(int i7, Context context, g6 g6Var) {
        super(context);
        dh.c cVar;
        this.D = s6.b;
        this.a = g6Var;
        this.b = i7;
        final int i10 = 1;
        if (Build.VERSION.SDK_INT >= 31) {
            ri.f fVar = new ri.f(null);
            this.w = fVar;
            fVar.m(g0.L(7.0f), o0.a());
            fVar.n = true;
            cVar = new dh.c(fVar, fVar, fVar);
        } else {
            this.w = null;
            ri.c cVar2 = new ri.c();
            cVar2.a(-16777216);
            cVar = new dh.c(cVar2, cVar2, cVar2);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        l9 l9Var = new l9(context);
        this.c = l9Var;
        final int i11 = 2;
        l9Var.setRoundRadius(g0.L(52.0f) / 2);
        addView(l9Var, ha.d(52, 52.0f, 51, 11.0f, 9.0f, 0.0f, 0.0f));
        final int i12 = 0;
        wp wpVar = new wp(R.drawable.mini_user_channels_10, 0);
        this.s = wpVar;
        wpVar.r = g0.L(2.0f);
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTypeface(g0.o());
        textView.setVisibility(8);
        textView.setTextSize(1, 9.33f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setPadding(g0.L(1.0f), 0, g0.L(5.0f), 0);
        frameLayout.addView(textView, ha.e(-2, -1, 81));
        addView(frameLayout, ha.n(14.33f, 52, 48, 11, 48, 0, 0));
        fh.g c10 = cVar.c(textView, null, false);
        gh.e eVar = new gh.e(g6Var);
        eVar.e = new g2.c(15);
        eVar.f(1627389951, 1358954495);
        eVar.e(603979776, 603979776);
        eVar.d(0, 0);
        eVar.n = 0.0f;
        eVar.r = 0.0f;
        float N = g0.N(0.43f);
        float N2 = g0.N(0.43f);
        eVar.f = N;
        eVar.h = N2;
        c10.p(eVar);
        c10.r(g0.L(7.0f));
        this.x = c10;
        textView.setBackground(c10);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setTypeface(g0.o());
        textView2.setTextSize(1, 16.0f);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, ha.k(0.0f, 10.0f, 0.0f, 1.33f, -1, -2));
        l9 l9Var2 = new l9(context);
        this.e = l9Var2;
        l9Var2.setRoundRadius(g0.L(8.0f));
        l9Var2.setOnClickListener(new View.OnClickListener(this) { // from class: ji.d
            public final /* synthetic */ h b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        h hVar = this.b;
                        e eVar2 = hVar.E;
                        if (eVar2 != null) {
                            long j3 = hVar.G;
                            k0 k0Var = ((l0) eVar2).h;
                            if (k0Var != null) {
                                k0Var.k(j3);
                                break;
                            }
                        }
                        break;
                    case 1:
                        h hVar2 = this.b;
                        e eVar3 = hVar2.E;
                        if (eVar3 != null) {
                            long j10 = hVar2.G;
                            k0 k0Var2 = ((l0) eVar3).h;
                            if (k0Var2 != null) {
                                k0Var2.k(j10);
                                break;
                            }
                        }
                        break;
                    case 2:
                        h hVar3 = this.b;
                        e eVar4 = hVar3.E;
                        if (eVar4 != null) {
                            ((l0) eVar4).g(hVar3.F, false);
                            break;
                        }
                        break;
                    default:
                        h hVar4 = this.b;
                        e eVar5 = hVar4.E;
                        if (eVar5 != null) {
                            ((l0) eVar5).g(hVar4.F, true);
                            break;
                        }
                        break;
                }
            }
        });
        addView(l9Var2, ha.d(16, 16.0f, 51, 75.0f, 35.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: ji.d
            public final /* synthetic */ h b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        h hVar = this.b;
                        e eVar2 = hVar.E;
                        if (eVar2 != null) {
                            long j3 = hVar.G;
                            k0 k0Var = ((l0) eVar2).h;
                            if (k0Var != null) {
                                k0Var.k(j3);
                                break;
                            }
                        }
                        break;
                    case 1:
                        h hVar2 = this.b;
                        e eVar3 = hVar2.E;
                        if (eVar3 != null) {
                            long j10 = hVar2.G;
                            k0 k0Var2 = ((l0) eVar3).h;
                            if (k0Var2 != null) {
                                k0Var2.k(j10);
                                break;
                            }
                        }
                        break;
                    case 2:
                        h hVar3 = this.b;
                        e eVar4 = hVar3.E;
                        if (eVar4 != null) {
                            ((l0) eVar4).g(hVar3.F, false);
                            break;
                        }
                        break;
                    default:
                        h hVar4 = this.b;
                        e eVar5 = hVar4.E;
                        if (eVar5 != null) {
                            ((l0) eVar5).g(hVar4.F, true);
                            break;
                        }
                        break;
                }
            }
        });
        TextView f10 = q.f(linearLayout, textView3, ha.k(20.0f, 0.0f, 0.0f, 1.33f, -1, -2), context);
        this.n = f10;
        f10.setTextSize(1, 13.0f);
        int L = g0.L(12.0f);
        int i13 = l6.D6;
        ShapeDrawable d02 = l6.d0(L, l6.r1(0.14f, l6.w0(i13, g6Var)));
        o6 K = s6.K(0.14f, i13);
        f10.setBackground(d02);
        s6.j(f10, d02, K, null, g6Var);
        f10.setPadding(g0.L(4.0f), g0.L(1.0f), g0.L(8.0f), g0.L(1.66f));
        f10.setSingleLine(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new wp(R.drawable.mini_ephemeral_hidden_14, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) id.M0(2131751899, null));
        f10.setText(spannableStringBuilder);
        f10.setVisibility(8);
        linearLayout.addView(f10, ha.k(0.0f, 7.0f, 0.0f, 1.33f, -2, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setClipChildren(false);
        fi.d dVar = new fi.d(context, g6Var, true);
        this.r = dVar;
        dVar.setUseWrapContent(true);
        dVar.setPadding(g0.L(15.0f), 0, g0.L(15.0f), 0);
        dVar.f();
        dVar.e();
        int i14 = l6.z6;
        dVar.setColor(l6.r1(0.14f, l6.w0(i14, g6Var)));
        dVar.setTextColor(l6.x0(null, l6.G6, false));
        if (dVar.getBackground() != null) {
            Drawable background = dVar.getBackground();
            o6 K2 = s6.K(0.14f, i14);
            dVar.setBackground(background);
            s6.j(dVar, background, K2, null, g6Var);
        }
        dVar.i(id.M0(2131751604, null), false, true);
        dVar.setOnClickListener(new View.OnClickListener(this) { // from class: ji.d
            public final /* synthetic */ h b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        h hVar = this.b;
                        e eVar2 = hVar.E;
                        if (eVar2 != null) {
                            long j3 = hVar.G;
                            k0 k0Var = ((l0) eVar2).h;
                            if (k0Var != null) {
                                k0Var.k(j3);
                                break;
                            }
                        }
                        break;
                    case 1:
                        h hVar2 = this.b;
                        e eVar3 = hVar2.E;
                        if (eVar3 != null) {
                            long j10 = hVar2.G;
                            k0 k0Var2 = ((l0) eVar3).h;
                            if (k0Var2 != null) {
                                k0Var2.k(j10);
                                break;
                            }
                        }
                        break;
                    case 2:
                        h hVar3 = this.b;
                        e eVar4 = hVar3.E;
                        if (eVar4 != null) {
                            ((l0) eVar4).g(hVar3.F, false);
                            break;
                        }
                        break;
                    default:
                        h hVar4 = this.b;
                        e eVar5 = hVar4.E;
                        if (eVar5 != null) {
                            ((l0) eVar5).g(hVar4.F, true);
                            break;
                        }
                        break;
                }
            }
        });
        linearLayout2.addView(dVar, ha.q(-2, 30, 0.0f, 16, 0, 0, 4, 0));
        fi.d dVar2 = new fi.d(context, g6Var, true);
        dVar2.setUseWrapContent(true);
        dVar2.setPadding(g0.L(15.0f), 0, g0.L(15.0f), 0);
        dVar2.f();
        dVar2.i(id.M0(2131754486, null), false, true);
        final int i15 = 3;
        dVar2.setOnClickListener(new View.OnClickListener(this) { // from class: ji.d
            public final /* synthetic */ h b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        h hVar = this.b;
                        e eVar2 = hVar.E;
                        if (eVar2 != null) {
                            long j3 = hVar.G;
                            k0 k0Var = ((l0) eVar2).h;
                            if (k0Var != null) {
                                k0Var.k(j3);
                                break;
                            }
                        }
                        break;
                    case 1:
                        h hVar2 = this.b;
                        e eVar3 = hVar2.E;
                        if (eVar3 != null) {
                            long j10 = hVar2.G;
                            k0 k0Var2 = ((l0) eVar3).h;
                            if (k0Var2 != null) {
                                k0Var2.k(j10);
                                break;
                            }
                        }
                        break;
                    case 2:
                        h hVar3 = this.b;
                        e eVar4 = hVar3.E;
                        if (eVar4 != null) {
                            ((l0) eVar4).g(hVar3.F, false);
                            break;
                        }
                        break;
                    default:
                        h hVar4 = this.b;
                        e eVar5 = hVar4.E;
                        if (eVar5 != null) {
                            ((l0) eVar5).g(hVar4.F, true);
                            break;
                        }
                        break;
                }
            }
        });
        linearLayout2.addView(dVar2, ha.q(-2, 30, 0.0f, 16, 4, 0, 0, 0));
        linearLayout.addView(linearLayout2, ha.t(-1, -2, 0, 0, 10, 0, 0));
        addView(linearLayout, ha.d(-1, -2.0f, 48, 75.0f, 0.0f, 0.0f, 13.0f));
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(l6.G6));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i7 = this.D;
        int i10 = s6.b;
        if (i7 != i10) {
            this.D = i10;
            try {
                fi.d dVar = this.r;
                if (dVar != null) {
                    dVar.setTextColor(l6.x0(null, l6.G6, false));
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        if (this.y) {
            canvas2 = canvas;
            canvas2.drawLine(g0.L(76.0f), getHeight() - 1, getMeasuredWidth(), getHeight() - 1, l6.k0);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ri.f fVar;
        l9 l9Var;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = this.w) != null && view == (l9Var = this.c)) {
            int L = g0.L(9.0f);
            int left = l9Var.getLeft() - L;
            int top = l9Var.getTop() - L;
            int L2 = (L * 2) + g0.L(52.0f);
            RecordingCanvas i7 = fVar.i(L2, L2);
            i7.translate(-left, -top);
            i7.drawColor(l6.w0(l6.d6, this.a));
            i7.save();
            float f10 = L2 / 2.0f;
            i7.scale(1.125f, 1.125f, f10, f10);
            super.drawChild(i7, view, j3);
            i7.restore();
            i7.drawColor(TLObject.FLAG_29);
            fVar.j();
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.x.i(g0.L(9.0f) + this.d.getLeft(), g0.L(48.0f));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        int i7 = l6.G6;
        g6 g6Var = this.a;
        this.f.setTextColor(l6.w0(i7, g6Var));
        int i10 = l6.z6;
        this.h.setTextColor(l6.w0(i10, g6Var));
        this.n.setTextColor(l6.w0(i10, g6Var));
    }
}
