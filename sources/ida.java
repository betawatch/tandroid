// default package

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ida extends FrameLayout implements vlb, cr3 {
    public final int E;
    public k47 F;
    public boolean G;
    public boolean H;
    public final byte I;
    public final SpannableStringBuilder J;
    public CharSequence K;
    public final p09 L;
    public final ylb M;
    public tk4 N;
    public long O;
    public boolean P;
    public float Q;
    public boolean R;
    public float S;
    public final ImageView a;
    public final kc0 b;
    public final TextView c;
    public final TextView d;
    public final fn e;
    public final s09 f;
    public final k46 h;
    public final jh2 n;
    public final TextView r;
    public final TextView s;
    public boolean w;
    public boolean x;
    public final int y;

    /* JADX WARN: Multi-variable type inference failed */
    public ida(int i, ylb ylbVar, Context context) {
        super(context);
        float f;
        this.w = true;
        int i2 = z8c.t0;
        this.y = i2;
        this.S = 1.0f;
        this.M = ylbVar;
        this.I = i;
        this.E = er3.q(i2).k();
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        boolean z = jb6.a0;
        if (i == 1) {
            addView(imageView, qoe.d(42, 42.0f, (z ? 5 : 3) | 48, z ? 0.0f : 15.0f, 12.0f, z ? 15.0f : 0.0f, 0.0f));
        } else {
            addView(imageView, qoe.d(40, 40.0f, (z ? 5 : 3) | 48, z ? 0.0f : 12.0f, 8.0f, z ? 12.0f : 0.0f, 0.0f));
        }
        TextView textView = new TextView(context);
        this.d = textView;
        td4.x(textView, cmb.rj, ylbVar, 1, 14.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setImportantForAccessibility(2);
        boolean z2 = jb6.a0;
        if (i == 1) {
            addView(textView, qoe.d(32, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 20.0f, 28.0f, z2 ? 20.0f : 0.0f, 0.0f));
        } else {
            addView(textView, qoe.d(32, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 16.0f, 22.0f, z2 ? 16.0f : 0.0f, 0.0f));
        }
        kc0 kc0Var = new kc0((byte) 9, context, this);
        this.b = kc0Var;
        kc0Var.setRoundRadius(gm.L(4.0f));
        boolean z3 = jb6.a0;
        if (i == 1) {
            addView(kc0Var, qoe.d(42, 42.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : 16.0f, 12.0f, z3 ? 16.0f : 0.0f, 0.0f));
        } else {
            addView(kc0Var, qoe.d(40, 40.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : 12.0f, 8.0f, z3 ? 12.0f : 0.0f, 0.0f));
        }
        TextView textView2 = new TextView(context);
        this.c = textView2;
        int i3 = cmb.F6;
        td4.x(textView2, i3, ylbVar, 1, 16.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setGravity((jb6.a0 ? 5 : 3) | 16);
        if (i == 1) {
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            boolean z4 = jb6.a0;
            addView(textView2, qoe.d(-1, -2.0f, (z4 ? 5 : 3) | 48, z4 ? 8.0f : 72.0f, 9.0f, z4 ? 72.0f : 8.0f, 0.0f));
            f = 14.0f;
        } else if (i == 2) {
            LinearLayout i4 = hg9.i(context, 0);
            boolean z5 = jb6.a0;
            addView(i4, qoe.d(-1, -2.0f, (z5 ? 5 : 3) | 48, z5 ? 16.0f : 72.0f, 5.0f, z5 ? 72.0f : 16.0f, 0.0f));
            TextView textView3 = new TextView(context);
            this.r = textView3;
            anb.X(textView3, cmb.z6, ylbVar);
            textView3.setTextSize(1, 14.0f);
            f = 14.0f;
            if (jb6.a0) {
                i4.addView(textView3, qoe.l(0.0f, -2, -2));
                i4.addView(textView2, qoe.m(1.0f, -2, -2, 0, 4, 0));
            } else {
                i4.addView(textView2, qoe.l(1.0f, -2, -2));
                i4.addView(textView3, qoe.m(0.0f, -2, -2, 4, 0, 0));
            }
            textView2.setMaxLines(2);
            TextView textView4 = new TextView(context);
            this.s = textView4;
            anb.X(textView4, i3, ylbVar);
            textView4.setLines(1);
            textView4.setMaxLines(1);
            textView4.setSingleLine(true);
            textView4.setEllipsize(truncateAt);
            textView4.setGravity((jb6.a0 ? 5 : 3) | 16);
            textView4.setTextSize(1, 13.0f);
            boolean z6 = jb6.a0;
            addView(textView4, qoe.d(-1, -2.0f, (z6 ? 5 : 3) | 48, z6 ? 8.0f : 72.0f, 30.0f, z6 ? 72.0f : 8.0f, 0.0f));
            textView4.setVisibility(8);
        } else {
            f = 14.0f;
            textView2.setMaxLines(1);
            boolean z7 = jb6.a0;
            addView(textView2, qoe.d(-1, -2.0f, (z7 ? 5 : 3) | 48, z7 ? 8.0f : 72.0f, 5.0f, z7 ? 72.0f : 8.0f, 0.0f));
        }
        p09 p09Var = new p09(R.raw.download_arrow, gm.L(f), gm.L(f), true, null);
        this.L = p09Var;
        s09 s09Var = new s09(context);
        this.f = s09Var;
        s09Var.setAnimation(p09Var);
        s09Var.setVisibility(4);
        int i5 = cmb.yi;
        anb.s(s09Var, i5, ylbVar, PorterDuff.Mode.SRC_IN);
        boolean z8 = jb6.a0;
        if (i == 1) {
            addView(s09Var, qoe.d(14, 14.0f, (z8 ? 5 : 3) | 48, z8 ? 8.0f : 70.0f, 37.0f, z8 ? 72.0f : 8.0f, 0.0f));
        } else {
            addView(s09Var, qoe.d(14, 14.0f, (z8 ? 5 : 3) | 48, z8 ? 8.0f : 70.0f, 33.0f, z8 ? 72.0f : 8.0f, 0.0f));
        }
        fn fnVar = new fn(context);
        this.e = fnVar;
        anb.X(fnVar, cmb.z6, ylbVar);
        fnVar.setLines(1);
        fnVar.setMaxLines(1);
        fnVar.setSingleLine(true);
        fnVar.setEllipsize(truncateAt);
        fnVar.setGravity((jb6.a0 ? 5 : 3) | 16);
        nm7.i(fnVar);
        if (i == 1) {
            fnVar.setTextSize(1, 13.0f);
            boolean z9 = jb6.a0;
            addView(fnVar, qoe.d(-1, -2.0f, (z9 ? 5 : 3) | 48, z9 ? 8.0f : 72.0f, 34.0f, z9 ? 72.0f : 8.0f, 0.0f));
        } else {
            fnVar.setTextSize(1, 13.0f);
            boolean z10 = jb6.a0;
            addView(fnVar, qoe.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 8.0f : 72.0f, 30.0f, z10 ? 72.0f : 8.0f, 0.0f));
        }
        k46 k46Var = new k46(context);
        this.h = k46Var;
        k46Var.setProgressColor(cmb.v0(i5, ylbVar));
        boolean z11 = jb6.a0;
        addView(k46Var, qoe.d(-1, 2.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 72.0f, 54.0f, z11 ? 72.0f : 0.0f, 0.0f));
        jh2 jh2Var = new jh2(21, ylbVar, context);
        this.n = jh2Var;
        jh2Var.setVisibility(4);
        jh2Var.b(-1, cmb.c6, cmb.j7);
        jh2Var.setDrawUnchecked(false);
        jh2Var.setDrawBackgroundAsArc(2);
        boolean z12 = jb6.a0;
        if (i == 1) {
            addView(jh2Var, qoe.d(24, 24.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 38.0f, 36.0f, z12 ? 38.0f : 0.0f, 0.0f));
        } else {
            addView(jh2Var, qoe.d(24, 24.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 33.0f, 28.0f, z12 ? 33.0f : 0.0f, 0.0f));
        }
        if (i == 2) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.J = spannableStringBuilder;
            spannableStringBuilder.setSpan(new gq3(), 0, 1, 0);
        }
    }

    @Override // cr3
    public final void A(boolean z) {
        f(true);
        this.O = 0L;
        e();
    }

    @Override // cr3
    public final void N(String str) {
        this.h.a(true, 1.0f);
        f(true);
        this.O = 0L;
        e();
    }

    public final void a(Canvas canvas) {
        if (this.x) {
            canvas.drawLine(gm.L(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, cmb.U0("paintDivider", this.M));
        }
    }

    public final void b(boolean z, boolean z2) {
        jh2 jh2Var = this.n;
        if (jh2Var.getVisibility() != 0) {
            jh2Var.setVisibility(0);
        }
        jh2Var.a(z, z2);
    }

    public final void c(k47 k47Var, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        k47 k47Var2 = this.F;
        boolean z2 = (k47Var2 == null || k47Var == null || k47Var2.e1() == k47Var.e1()) ? false : true;
        this.x = z;
        this.F = k47Var;
        this.H = false;
        this.G = false;
        if (!z2) {
            this.O = 0L;
        }
        TLRPC.Document F0 = k47Var.F0();
        TextView textView = this.c;
        TextView textView2 = this.s;
        ImageView imageView = this.a;
        TextView textView3 = this.d;
        kc0 kc0Var = this.b;
        if (F0 != null) {
            if (k47Var.I3()) {
                str = null;
                for (int i = 0; i < F0.attributes.size(); i++) {
                    TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && (((str3 = documentAttribute.performer) != null && str3.length() != 0) || ((str4 = documentAttribute.title) != null && str4.length() != 0))) {
                        str = k47Var.w1(true) + " - " + k47Var.y1(true);
                    }
                }
            } else {
                str = null;
            }
            String B = (k47.K4(k47Var.k) || (k47Var.k.media instanceof TLRPC.TL_messageMediaPhoto) || k47.s3(F0, false)) ? null : bc4.B(F0);
            if (TextUtils.isEmpty(B) && (str2 = F0.mime_type) != null) {
                B = str2.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND) ? k47.s3(F0, false) ? jb6.M0(2131753936, null) : jb6.M0(2131753898, null) : F0.mime_type.startsWith("image") ? k47.s3(F0, false) ? jb6.M0(2131753936, null) : jb6.M0(2131753913, null) : F0.mime_type.startsWith(MediaStreamTrack.AUDIO_TRACK_KIND) ? jb6.M0(2131753947, null) : jb6.M0(2131753940, null);
            }
            String str5 = str == null ? B : str;
            ArrayList arrayList = k47Var.a2;
            ylb ylbVar = this.M;
            CharSequence v1 = gm.v1(str5, arrayList, ylbVar);
            if (v1 != null) {
                textView.setText(v1);
            } else {
                textView.setText(str5);
            }
            imageView.setVisibility(0);
            textView3.setVisibility(0);
            imageView.setImageResource(gm.l1(B, false));
            int lastIndexOf = B.lastIndexOf(46);
            textView3.setText(lastIndexOf != -1 ? B.substring(lastIndexOf + 1).toLowerCase() : "");
            TLRPC.PhotoSize w = bc4.w(F0.thumbs, nm7.q5, false, null, false);
            TLRPC.PhotoSize w2 = bc4.w(F0.thumbs, 40, false, null, false);
            if (w2 == w) {
                w = null;
            }
            if ((w2 instanceof TLRPC.TL_photoSizeEmpty) || w2 == null) {
                kc0Var.setVisibility(4);
                kc0Var.setImageBitmap(null);
                textView3.setAlpha(1.0f);
                imageView.setAlpha(1.0f);
            } else {
                kc0Var.getImageReceiver().G0 = w == null;
                kc0Var.getImageReceiver().H0 = w == null;
                kc0Var.setVisibility(0);
                if (k47Var.I1 != null) {
                    kc0Var.k(gn5.c(w, F0), "40_40", null, null, k47Var.I1, null, 1, k47Var);
                } else {
                    kc0Var.g(1, 0L, gn5.c(w, F0), gn5.c(w2, F0), k47Var, "40_40", "40_40_b", null);
                }
            }
            e();
            if (k47Var.r2() && !TextUtils.isEmpty(this.F.k.message)) {
                CharSequence v12 = gm.v1(this.F.k.message.replace("\n", " ").replaceAll(" +", " ").trim(), this.F.a2, ylbVar);
                this.K = v12;
                if (textView2 != null) {
                    textView2.setVisibility(v12 == null ? 8 : 0);
                }
            } else if (textView2 != null) {
                textView2.setVisibility(8);
            }
        } else {
            textView.setText("");
            textView3.setText("");
            this.e.setText("");
            imageView.setVisibility(0);
            textView3.setVisibility(0);
            textView3.setAlpha(1.0f);
            imageView.setAlpha(1.0f);
            kc0Var.setVisibility(4);
            kc0Var.setImageBitmap(null);
            this.K = null;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
        setWillNotDraw(!this.x);
        this.h.a(false, 0.0f);
        f(z2);
    }

    public final void d(String str, String str2, String str3, String str4, int i, boolean z) {
        int i2;
        int i3;
        this.c.setText(str);
        this.e.setText(str2);
        TextView textView = this.d;
        if (str3 != null) {
            textView.setVisibility(0);
            textView.setText(str3.toLowerCase());
        } else {
            textView.setVisibility(4);
        }
        this.x = z;
        ImageView imageView = this.a;
        if (i == 0) {
            imageView.setImageResource(gm.l1(str, false));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        byte b = this.I;
        kc0 kc0Var = this.b;
        if (str4 == null) {
            if (i == 0) {
                textView.setAlpha(1.0f);
                imageView.setAlpha(1.0f);
                if (b != 3) {
                    kc0Var.setImageBitmap(null);
                    kc0Var.setVisibility(4);
                }
                setWillNotDraw(!this.x);
            }
            sn2 M = cmb.M(gm.L(42.0f), i);
            if (i == R.drawable.files_storage) {
                i2 = cmb.ma;
                i3 = cmb.ha;
            } else if (i == R.drawable.files_gallery) {
                i2 = cmb.ka;
                i3 = cmb.ha;
            } else if (i == R.drawable.files_music) {
                i2 = cmb.ja;
                i3 = cmb.ha;
            } else if (i == R.drawable.files_internal) {
                i2 = cmb.ia;
                i3 = cmb.ha;
            } else {
                i2 = cmb.qj;
                i3 = cmb.pj;
            }
            ylb ylbVar = this.M;
            cmb.z1(M, cmb.v0(i2, ylbVar), false);
            cmb.z1(M, cmb.v0(i3, ylbVar), true);
            kc0Var.setImageDrawable(M);
        } else if (b != 3) {
            kc0Var.o(str4, "42_42", null);
        }
        kc0Var.setVisibility(0);
        setWillNotDraw(!this.x);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.S == 1.0f || this.N == null) {
            super.dispatchDraw(canvas);
            a(canvas);
        } else {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.S) * 255.0f), 31);
            this.N.setViewType(3);
            this.N.updateColors();
            this.N.f();
            this.N.draw(canvas);
            canvas.restore();
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (this.S * 255.0f), 31);
            super.dispatchDraw(canvas);
            a(canvas);
            canvas.restore();
        }
        boolean z = this.P;
        float f = this.Q;
        if (z) {
            if (f != 1.0f) {
                this.Q = f + 0.10666667f;
                invalidate();
            }
        } else {
            if (f == 0.0f) {
                return;
            }
            if (f != 0.0f) {
                this.Q = f - 0.10666667f;
                invalidate();
            }
        }
        this.Q = Utilities.i(this.Q, 1.0f, 0.0f);
        int measuredWidth = (getMeasuredWidth() - gm.L(12.0f)) - cmb.Y0.getIntrinsicWidth();
        int measuredHeight = (getMeasuredHeight() - cmb.Y0.getIntrinsicHeight()) >> 1;
        canvas.save();
        float f2 = this.Q;
        canvas.scale(f2, f2, (cmb.Y0.getIntrinsicWidth() / 2.0f) + measuredWidth, (cmb.Y0.getIntrinsicHeight() / 2.0f) + measuredHeight);
        Drawable drawable = cmb.Y0;
        drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, cmb.Y0.getIntrinsicHeight() + measuredHeight);
        cmb.Y0.draw(canvas);
        canvas.restore();
    }

    public final void e() {
        String o;
        k47 k47Var = this.F;
        if (k47Var == null || k47Var.F0() == null) {
            return;
        }
        k47 k47Var2 = this.F;
        long j = k47Var2.k.date * 1000;
        long j2 = this.O;
        if (j2 == 0) {
            o = gm.i0(k47Var2.F0().size, false, false);
        } else {
            Locale locale = Locale.ENGLISH;
            o = kt6.o(gm.i0(j2, false, false), " / ", gm.i0(this.F.F0().size, false, false));
        }
        byte b = this.I;
        fn fnVar = this.e;
        if (b == 2) {
            fnVar.setText(new SpannableStringBuilder().append((CharSequence) o).append(' ').append((CharSequence) this.J).append(' ').append(ch4.c(this.F, true, 2, fnVar.getPaint())));
            this.r.setText(jb6.e1(this.F.k.date));
            return;
        }
        fnVar.setText(o + ", " + jb6.a0("formatDateAtTime", null, 2131742446, jb6.D0().B0().format(new Date(j)), jb6.D0().o0().format(new Date(j))));
    }

    public final void f(boolean z) {
        if (z) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new Fade().setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) d53.f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        k47 k47Var = this.F;
        int i = this.y;
        k46 k46Var = this.h;
        s09 s09Var = this.f;
        fn fnVar = this.e;
        if (k47Var == null || k47Var.k.media == null) {
            this.G = false;
            this.H = true;
            k46Var.setVisibility(4);
            k46Var.a(false, 0.0f);
            s09Var.setVisibility(4);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) fnVar.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.leftMargin = gm.L(jb6.a0 ? 8.0f : 72.0f);
                layoutParams.rightMargin = gm.L(jb6.a0 ? 72.0f : 8.0f);
                fnVar.requestLayout();
            }
            er3.q(i).v(this);
            return;
        }
        this.H = false;
        if (k47Var.y0 || k47Var.z0 || !this.w) {
            s09Var.setVisibility(4);
            k46Var.setVisibility(4);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) fnVar.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.leftMargin = gm.L(jb6.a0 ? 8.0f : 72.0f);
                layoutParams2.rightMargin = gm.L(jb6.a0 ? 72.0f : 8.0f);
                fnVar.requestLayout();
            }
            this.G = false;
            this.H = true;
            er3.q(i).v(this);
            return;
        }
        String r = bc4.r(null, k47Var.F0());
        er3.q(i).a(r, this.F, this);
        this.G = bc4.G(i).S(r);
        s09Var.setVisibility(0);
        int i2 = this.G ? 15 : 0;
        p09 p09Var = this.L;
        p09Var.K(i2);
        p09Var.h = true;
        if (z) {
            s09Var.d();
        } else {
            p09Var.H(this.G ? 15 : 0);
            s09Var.invalidate();
        }
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) fnVar.getLayoutParams();
        if (layoutParams3 != null) {
            layoutParams3.leftMargin = gm.L(jb6.a0 ? 8.0f : 86.0f);
            layoutParams3.rightMargin = gm.L(jb6.a0 ? 86.0f : 8.0f);
            fnVar.requestLayout();
        }
        if (!this.G) {
            k46Var.setVisibility(4);
            return;
        }
        k46Var.setVisibility(0);
        Float s = fn5.z().s(r);
        if (s == null) {
            s = Float.valueOf(0.0f);
        }
        k46Var.a(false, s.floatValue());
    }

    public bf0 getImageView() {
        return this.b;
    }

    public k47 getMessage() {
        return this.F;
    }

    @Override // cr3
    public int getObserverTag() {
        return this.E;
    }

    @Override // cr3
    public final void i(long j, long j2) {
        k46 k46Var = this.h;
        if (k46Var.getVisibility() != 0) {
            f(true);
        }
        this.O = j;
        e();
        k46Var.a(true, Math.min(1.0f, j / j2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h.getVisibility() == 0) {
            f(false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        er3.q(this.y).v(this);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        jh2 jh2Var = this.n;
        if (jh2Var.a.q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(jh2Var.a.q);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.I != 1) {
            TextView textView = this.c;
            int lineCount = textView.getLineCount();
            TextView textView2 = this.s;
            if (lineCount > 1 || (textView2 != null && textView2.getVisibility() == 0)) {
                int measuredHeight = textView.getMeasuredHeight() - gm.L(22.0f);
                if (textView2 != null && textView2.getVisibility() == 0) {
                    textView2.layout(textView2.getLeft(), textView2.getTop() + measuredHeight, textView2.getRight(), textView2.getBottom() + measuredHeight);
                    measuredHeight = hg9.v(3.0f, textView2.getMeasuredHeight(), measuredHeight);
                }
                fn fnVar = this.e;
                fnVar.layout(fnVar.getLeft(), fnVar.getTop() + measuredHeight, fnVar.getRight(), fnVar.getBottom() + measuredHeight);
                s09 s09Var = this.f;
                s09Var.layout(s09Var.getLeft(), s09Var.getTop() + measuredHeight, s09Var.getRight(), s09Var.getBottom() + measuredHeight);
                k46 k46Var = this.h;
                k46Var.layout(k46Var.getLeft(), (getMeasuredHeight() - k46Var.getMeasuredHeight()) - (this.x ? 1 : 0), k46Var.getRight(), getMeasuredHeight() - (this.x ? 1 : 0));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        TextView textView;
        byte b = this.I;
        if (b == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(64.0f) + (this.x ? 1 : 0), TLObject.FLAG_30));
            return;
        }
        if (b == 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(56.0f), TLObject.FLAG_30));
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(56.0f), TLObject.FLAG_30));
        int measuredHeight = this.c.getMeasuredHeight() + gm.L(34.0f) + (this.x ? 1 : 0);
        if (this.K != null && (textView = this.s) != null && this.F.r2()) {
            this.R = true;
            textView.setText(gm.Q(this.K, (String) this.F.a2.get(0), textView.getMeasuredWidth(), textView.getPaint()));
            this.R = false;
            measuredHeight = hg9.v(3.0f, textView.getMeasuredHeight(), measuredHeight);
        }
        setMeasuredDimension(getMeasuredWidth(), measuredHeight);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.R) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawDownloadIcon(boolean z) {
        this.w = z;
    }

    public void setEnterAnimationAlpha(float f) {
        if (this.S != f) {
            this.S = f;
            invalidate();
        }
    }

    public void setGlobalGradientView(tk4 tk4Var) {
        this.N = tk4Var;
    }

    public void setPhoto(String str) {
        boolean endsWith = str.endsWith("mp4");
        kc0 kc0Var = this.b;
        if (endsWith) {
            kc0Var.o("vthumb://0:".concat(str), null, null);
            kc0Var.setVisibility(0);
        } else if (!str.endsWith(".jpg") && !str.endsWith(".jpeg") && !str.endsWith(".png") && !str.endsWith(".gif")) {
            kc0Var.setVisibility(8);
        } else {
            kc0Var.o("thumb://0:".concat(str), null, null);
            kc0Var.setVisibility(0);
        }
    }

    public void setPhotoEntry(jo6 jo6Var) {
        String str = jo6Var.c;
        long j = jo6Var.H;
        int i = jo6Var.G;
        int i2 = jo6Var.F;
        int i3 = jo6Var.C;
        String str2 = jo6Var.I;
        kc0 kc0Var = this.b;
        if (str != null) {
            kc0Var.o(str, null, cmb.Q4);
            str2 = jo6Var.c;
        } else if (str2 == null) {
            kc0Var.setImageDrawable(cmb.Q4);
            str2 = "";
        } else if (jo6Var.b) {
            kc0Var.q();
            kc0Var.o("vthumb://" + i3 + ":" + str2, null, cmb.Q4);
        } else {
            kc0Var.r(jo6Var.J, jo6Var.K, true);
            kc0Var.o("thumb://" + i3 + ":" + str2, null, cmb.Q4);
        }
        File file = new File(str2);
        this.c.setText(file.getName());
        bc4.D(file);
        this.d.setVisibility(8);
        StringBuilder sb = new StringBuilder();
        if (i2 != 0 && i != 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            Locale locale = Locale.US;
            sb.append(i2 + "x" + i);
        }
        if (jo6Var.b) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(gm.g0(jo6Var.E, false, false));
        }
        if (j != 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(gm.i0(j, false, false));
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append(jb6.D0().y0().format(jo6Var.D));
        this.e.setText(sb);
        this.a.setVisibility(8);
    }

    @Override // vlb
    public final void updateColors() {
        try {
            this.h.setProgressColor(cmb.v0(cmb.yi, this.M));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override // cr3
    public final void l(long j, long j2) {
    }
}
