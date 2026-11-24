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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class iba extends FrameLayout implements tjb, sp3 {
    public final int E;
    public k27 F;
    public boolean G;
    public boolean H;
    public final byte I;
    public final SpannableStringBuilder J;
    public CharSequence K;
    public final oy8 L;
    public final wjb M;
    public pi4 N;
    public long O;
    public boolean P;
    public float Q;
    public boolean R;
    public float S;
    public final ImageView a;
    public final kb0 b;
    public final TextView c;
    public final TextView d;
    public final fm e;
    public final ry8 f;
    public final j26 h;
    public final wf2 n;
    public final TextView r;
    public final TextView s;
    public boolean w;
    public boolean x;
    public final int y;

    /* JADX WARN: Multi-variable type inference failed */
    public iba(int i, wjb wjbVar, Context context) {
        super(context);
        float f;
        this.w = true;
        int i2 = y6c.t0;
        this.y = i2;
        this.S = 1.0f;
        this.M = wjbVar;
        this.I = i;
        this.E = up3.q(i2).k();
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        boolean z = k96.a0;
        if (i == 1) {
            addView(imageView, nme.d(42, 42.0f, (z ? 5 : 3) | 48, z ? 0.0f : 15.0f, 12.0f, z ? 15.0f : 0.0f, 0.0f));
        } else {
            addView(imageView, nme.d(40, 40.0f, (z ? 5 : 3) | 48, z ? 0.0f : 12.0f, 8.0f, z ? 12.0f : 0.0f, 0.0f));
        }
        TextView textView = new TextView(context);
        this.d = textView;
        tb4.w(textView, bkb.rj, wjbVar, 1, 14.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setImportantForAccessibility(2);
        boolean z2 = k96.a0;
        if (i == 1) {
            addView(textView, nme.d(32, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 20.0f, 28.0f, z2 ? 20.0f : 0.0f, 0.0f));
        } else {
            addView(textView, nme.d(32, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 16.0f, 22.0f, z2 ? 16.0f : 0.0f, 0.0f));
        }
        kb0 kb0Var = new kb0((byte) 9, context, this);
        this.b = kb0Var;
        kb0Var.setRoundRadius(gl.L(4.0f));
        boolean z3 = k96.a0;
        if (i == 1) {
            addView(kb0Var, nme.d(42, 42.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : 16.0f, 12.0f, z3 ? 16.0f : 0.0f, 0.0f));
        } else {
            addView(kb0Var, nme.d(40, 40.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : 12.0f, 8.0f, z3 ? 12.0f : 0.0f, 0.0f));
        }
        TextView textView2 = new TextView(context);
        this.c = textView2;
        int i3 = bkb.F6;
        tb4.w(textView2, i3, wjbVar, 1, 16.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setGravity((k96.a0 ? 5 : 3) | 16);
        if (i == 1) {
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            boolean z4 = k96.a0;
            addView(textView2, nme.d(-1, -2.0f, (z4 ? 5 : 3) | 48, z4 ? 8.0f : 72.0f, 9.0f, z4 ? 72.0f : 8.0f, 0.0f));
            f = 14.0f;
        } else if (i == 2) {
            LinearLayout j = de9.j(context, 0);
            boolean z5 = k96.a0;
            addView(j, nme.d(-1, -2.0f, (z5 ? 5 : 3) | 48, z5 ? 16.0f : 72.0f, 5.0f, z5 ? 72.0f : 16.0f, 0.0f));
            TextView textView3 = new TextView(context);
            this.r = textView3;
            zkb.X(textView3, bkb.z6, wjbVar);
            textView3.setTextSize(1, 14.0f);
            f = 14.0f;
            if (k96.a0) {
                j.addView(textView3, nme.l(0.0f, -2, -2));
                j.addView(textView2, nme.m(1.0f, -2, -2, 0, 4, 0));
            } else {
                j.addView(textView2, nme.l(1.0f, -2, -2));
                j.addView(textView3, nme.m(0.0f, -2, -2, 4, 0, 0));
            }
            textView2.setMaxLines(2);
            TextView textView4 = new TextView(context);
            this.s = textView4;
            zkb.X(textView4, i3, wjbVar);
            textView4.setLines(1);
            textView4.setMaxLines(1);
            textView4.setSingleLine(true);
            textView4.setEllipsize(truncateAt);
            textView4.setGravity((k96.a0 ? 5 : 3) | 16);
            textView4.setTextSize(1, 13.0f);
            boolean z6 = k96.a0;
            addView(textView4, nme.d(-1, -2.0f, (z6 ? 5 : 3) | 48, z6 ? 8.0f : 72.0f, 30.0f, z6 ? 72.0f : 8.0f, 0.0f));
            textView4.setVisibility(8);
        } else {
            f = 14.0f;
            textView2.setMaxLines(1);
            boolean z7 = k96.a0;
            addView(textView2, nme.d(-1, -2.0f, (z7 ? 5 : 3) | 48, z7 ? 8.0f : 72.0f, 5.0f, z7 ? 72.0f : 8.0f, 0.0f));
        }
        oy8 oy8Var = new oy8(R.raw.download_arrow, gl.L(f), gl.L(f), true, null);
        this.L = oy8Var;
        ry8 ry8Var = new ry8(context);
        this.f = ry8Var;
        ry8Var.setAnimation(oy8Var);
        ry8Var.setVisibility(4);
        int i4 = bkb.yi;
        zkb.s(ry8Var, i4, wjbVar, PorterDuff.Mode.SRC_IN);
        boolean z8 = k96.a0;
        if (i == 1) {
            addView(ry8Var, nme.d(14, 14.0f, (z8 ? 5 : 3) | 48, z8 ? 8.0f : 70.0f, 37.0f, z8 ? 72.0f : 8.0f, 0.0f));
        } else {
            addView(ry8Var, nme.d(14, 14.0f, (z8 ? 5 : 3) | 48, z8 ? 8.0f : 70.0f, 33.0f, z8 ? 72.0f : 8.0f, 0.0f));
        }
        fm fmVar = new fm(context);
        this.e = fmVar;
        zkb.X(fmVar, bkb.z6, wjbVar);
        fmVar.setLines(1);
        fmVar.setMaxLines(1);
        fmVar.setSingleLine(true);
        fmVar.setEllipsize(truncateAt);
        fmVar.setGravity((k96.a0 ? 5 : 3) | 16);
        kk7.i(fmVar);
        if (i == 1) {
            fmVar.setTextSize(1, 13.0f);
            boolean z9 = k96.a0;
            addView(fmVar, nme.d(-1, -2.0f, (z9 ? 5 : 3) | 48, z9 ? 8.0f : 72.0f, 34.0f, z9 ? 72.0f : 8.0f, 0.0f));
        } else {
            fmVar.setTextSize(1, 13.0f);
            boolean z10 = k96.a0;
            addView(fmVar, nme.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 8.0f : 72.0f, 30.0f, z10 ? 72.0f : 8.0f, 0.0f));
        }
        j26 j26Var = new j26(context);
        this.h = j26Var;
        j26Var.setProgressColor(bkb.v0(i4, wjbVar));
        boolean z11 = k96.a0;
        addView(j26Var, nme.d(-1, 2.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 72.0f, 54.0f, z11 ? 72.0f : 0.0f, 0.0f));
        wf2 wf2Var = new wf2(21, wjbVar, context);
        this.n = wf2Var;
        wf2Var.setVisibility(4);
        wf2Var.b(-1, bkb.c6, bkb.j7);
        wf2Var.setDrawUnchecked(false);
        wf2Var.setDrawBackgroundAsArc(2);
        boolean z12 = k96.a0;
        if (i == 1) {
            addView(wf2Var, nme.d(24, 24.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 38.0f, 36.0f, z12 ? 38.0f : 0.0f, 0.0f));
        } else {
            addView(wf2Var, nme.d(24, 24.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 33.0f, 28.0f, z12 ? 33.0f : 0.0f, 0.0f));
        }
        if (i == 2) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.J = spannableStringBuilder;
            spannableStringBuilder.setSpan(new wo3(), 0, 1, 0);
        }
    }

    @Override // sp3
    public final void B(boolean z) {
        f(true);
        this.O = 0L;
        e();
    }

    @Override // sp3
    public final void N(String str) {
        this.h.a(true, 1.0f);
        f(true);
        this.O = 0L;
        e();
    }

    public final void a(Canvas canvas) {
        if (this.x) {
            canvas.drawLine(gl.L(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, bkb.U0("paintDivider", this.M));
        }
    }

    public final void b(boolean z, boolean z2) {
        wf2 wf2Var = this.n;
        if (wf2Var.getVisibility() != 0) {
            wf2Var.setVisibility(0);
        }
        wf2Var.a(z, z2);
    }

    public final void c(k27 k27Var, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        k27 k27Var2 = this.F;
        boolean z2 = (k27Var2 == null || k27Var == null || k27Var2.e1() == k27Var.e1()) ? false : true;
        this.x = z;
        this.F = k27Var;
        this.H = false;
        this.G = false;
        if (!z2) {
            this.O = 0L;
        }
        TLRPC.Document F0 = k27Var.F0();
        TextView textView = this.c;
        TextView textView2 = this.s;
        ImageView imageView = this.a;
        TextView textView3 = this.d;
        kb0 kb0Var = this.b;
        if (F0 != null) {
            if (k27Var.I3()) {
                str = null;
                for (int i = 0; i < F0.attributes.size(); i++) {
                    TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && (((str3 = documentAttribute.performer) != null && str3.length() != 0) || ((str4 = documentAttribute.title) != null && str4.length() != 0))) {
                        str = k27Var.w1(true) + " - " + k27Var.y1(true);
                    }
                }
            } else {
                str = null;
            }
            String B = (k27.K4(k27Var.k) || (k27Var.k.media instanceof TLRPC.TL_messageMediaPhoto) || k27.s3(F0, false)) ? null : ba4.B(F0);
            if (TextUtils.isEmpty(B) && (str2 = F0.mime_type) != null) {
                B = str2.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND) ? k27.s3(F0, false) ? k96.M0(2131753968, null) : k96.M0(2131753930, null) : F0.mime_type.startsWith("image") ? k27.s3(F0, false) ? k96.M0(2131753968, null) : k96.M0(2131753945, null) : F0.mime_type.startsWith(MediaStreamTrack.AUDIO_TRACK_KIND) ? k96.M0(2131753979, null) : k96.M0(2131753972, null);
            }
            String str5 = str == null ? B : str;
            ArrayList arrayList = k27Var.a2;
            wjb wjbVar = this.M;
            CharSequence v1 = gl.v1(str5, arrayList, wjbVar);
            if (v1 != null) {
                textView.setText(v1);
            } else {
                textView.setText(str5);
            }
            imageView.setVisibility(0);
            textView3.setVisibility(0);
            imageView.setImageResource(gl.l1(B, false));
            int lastIndexOf = B.lastIndexOf(46);
            textView3.setText(lastIndexOf != -1 ? B.substring(lastIndexOf + 1).toLowerCase() : "");
            TLRPC.PhotoSize w = ba4.w(F0.thumbs, kk7.q5, false, null, false);
            TLRPC.PhotoSize w2 = ba4.w(F0.thumbs, 40, false, null, false);
            if (w2 == w) {
                w = null;
            }
            if ((w2 instanceof TLRPC.TL_photoSizeEmpty) || w2 == null) {
                kb0Var.setVisibility(4);
                kb0Var.setImageBitmap(null);
                textView3.setAlpha(1.0f);
                imageView.setAlpha(1.0f);
            } else {
                kb0Var.getImageReceiver().G0 = w == null;
                kb0Var.getImageReceiver().H0 = w == null;
                kb0Var.setVisibility(0);
                if (k27Var.I1 != null) {
                    kb0Var.k(gl5.c(w, F0), "40_40", null, null, k27Var.I1, null, 1, k27Var);
                } else {
                    kb0Var.g(1, 0L, gl5.c(w, F0), gl5.c(w2, F0), k27Var, "40_40", "40_40_b", null);
                }
            }
            e();
            if (k27Var.r2() && !TextUtils.isEmpty(this.F.k.message)) {
                CharSequence v12 = gl.v1(this.F.k.message.replace("\n", " ").replaceAll(" +", " ").trim(), this.F.a2, wjbVar);
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
            kb0Var.setVisibility(4);
            kb0Var.setImageBitmap(null);
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
            imageView.setImageResource(gl.l1(str, false));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        byte b = this.I;
        kb0 kb0Var = this.b;
        if (str4 == null) {
            if (i == 0) {
                textView.setAlpha(1.0f);
                imageView.setAlpha(1.0f);
                if (b != 3) {
                    kb0Var.setImageBitmap(null);
                    kb0Var.setVisibility(4);
                }
                setWillNotDraw(!this.x);
            }
            fm2 M = bkb.M(gl.L(42.0f), i);
            if (i == R.drawable.files_storage) {
                i2 = bkb.ma;
                i3 = bkb.ha;
            } else if (i == R.drawable.files_gallery) {
                i2 = bkb.ka;
                i3 = bkb.ha;
            } else if (i == R.drawable.files_music) {
                i2 = bkb.ja;
                i3 = bkb.ha;
            } else if (i == R.drawable.files_internal) {
                i2 = bkb.ia;
                i3 = bkb.ha;
            } else {
                i2 = bkb.qj;
                i3 = bkb.pj;
            }
            wjb wjbVar = this.M;
            bkb.z1(M, bkb.v0(i2, wjbVar), false);
            bkb.z1(M, bkb.v0(i3, wjbVar), true);
            kb0Var.setImageDrawable(M);
        } else if (b != 3) {
            kb0Var.o(str4, "42_42", null);
        }
        kb0Var.setVisibility(0);
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
        int measuredWidth = (getMeasuredWidth() - gl.L(12.0f)) - bkb.Y0.getIntrinsicWidth();
        int measuredHeight = (getMeasuredHeight() - bkb.Y0.getIntrinsicHeight()) >> 1;
        canvas.save();
        float f2 = this.Q;
        canvas.scale(f2, f2, (bkb.Y0.getIntrinsicWidth() / 2.0f) + measuredWidth, (bkb.Y0.getIntrinsicHeight() / 2.0f) + measuredHeight);
        Drawable drawable = bkb.Y0;
        drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, bkb.Y0.getIntrinsicHeight() + measuredHeight);
        bkb.Y0.draw(canvas);
        canvas.restore();
    }

    public final void e() {
        String y;
        k27 k27Var = this.F;
        if (k27Var == null || k27Var.F0() == null) {
            return;
        }
        k27 k27Var2 = this.F;
        long j = k27Var2.k.date * 1000;
        long j2 = this.O;
        if (j2 == 0) {
            y = gl.i0(k27Var2.F0().size, false, false);
        } else {
            Locale locale = Locale.ENGLISH;
            y = tb4.y(gl.i0(j2, false, false), " / ", gl.i0(this.F.F0().size, false, false));
        }
        byte b = this.I;
        fm fmVar = this.e;
        if (b == 2) {
            fmVar.setText(new SpannableStringBuilder().append((CharSequence) y).append(' ').append((CharSequence) this.J).append(' ').append(af4.c(this.F, true, 2, fmVar.getPaint())));
            this.r.setText(k96.e1(this.F.k.date));
            return;
        }
        fmVar.setText(y + ", " + k96.a0("formatDateAtTime", null, 2131742520, k96.D0().B0().format(new Date(j)), k96.D0().o0().format(new Date(j))));
    }

    public final void f(boolean z) {
        if (z) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new Fade().setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) s33.f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        k27 k27Var = this.F;
        int i = this.y;
        j26 j26Var = this.h;
        ry8 ry8Var = this.f;
        fm fmVar = this.e;
        if (k27Var == null || k27Var.k.media == null) {
            this.G = false;
            this.H = true;
            j26Var.setVisibility(4);
            j26Var.a(false, 0.0f);
            ry8Var.setVisibility(4);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) fmVar.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.leftMargin = gl.L(k96.a0 ? 8.0f : 72.0f);
                layoutParams.rightMargin = gl.L(k96.a0 ? 72.0f : 8.0f);
                fmVar.requestLayout();
            }
            up3.q(i).v(this);
            return;
        }
        this.H = false;
        if (k27Var.y0 || k27Var.z0 || !this.w) {
            ry8Var.setVisibility(4);
            j26Var.setVisibility(4);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) fmVar.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.leftMargin = gl.L(k96.a0 ? 8.0f : 72.0f);
                layoutParams2.rightMargin = gl.L(k96.a0 ? 72.0f : 8.0f);
                fmVar.requestLayout();
            }
            this.G = false;
            this.H = true;
            up3.q(i).v(this);
            return;
        }
        String r = ba4.r(null, k27Var.F0());
        up3.q(i).a(r, this.F, this);
        this.G = ba4.G(i).S(r);
        ry8Var.setVisibility(0);
        int i2 = this.G ? 15 : 0;
        oy8 oy8Var = this.L;
        oy8Var.K(i2);
        oy8Var.h = true;
        if (z) {
            ry8Var.d();
        } else {
            oy8Var.H(this.G ? 15 : 0);
            ry8Var.invalidate();
        }
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) fmVar.getLayoutParams();
        if (layoutParams3 != null) {
            layoutParams3.leftMargin = gl.L(k96.a0 ? 8.0f : 86.0f);
            layoutParams3.rightMargin = gl.L(k96.a0 ? 86.0f : 8.0f);
            fmVar.requestLayout();
        }
        if (!this.G) {
            j26Var.setVisibility(4);
            return;
        }
        j26Var.setVisibility(0);
        Float s = fl5.z().s(r);
        if (s == null) {
            s = Float.valueOf(0.0f);
        }
        j26Var.a(false, s.floatValue());
    }

    public be0 getImageView() {
        return this.b;
    }

    public k27 getMessage() {
        return this.F;
    }

    @Override // sp3
    public int getObserverTag() {
        return this.E;
    }

    @Override // sp3
    public final void i(long j, long j2) {
        j26 j26Var = this.h;
        if (j26Var.getVisibility() != 0) {
            f(true);
        }
        this.O = j;
        e();
        j26Var.a(true, Math.min(1.0f, j / j2));
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
        up3.q(this.y).v(this);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        wf2 wf2Var = this.n;
        if (wf2Var.a.q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(wf2Var.a.q);
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
                int measuredHeight = textView.getMeasuredHeight() - gl.L(22.0f);
                if (textView2 != null && textView2.getVisibility() == 0) {
                    textView2.layout(textView2.getLeft(), textView2.getTop() + measuredHeight, textView2.getRight(), textView2.getBottom() + measuredHeight);
                    measuredHeight = de9.w(3.0f, textView2.getMeasuredHeight(), measuredHeight);
                }
                fm fmVar = this.e;
                fmVar.layout(fmVar.getLeft(), fmVar.getTop() + measuredHeight, fmVar.getRight(), fmVar.getBottom() + measuredHeight);
                ry8 ry8Var = this.f;
                ry8Var.layout(ry8Var.getLeft(), ry8Var.getTop() + measuredHeight, ry8Var.getRight(), ry8Var.getBottom() + measuredHeight);
                j26 j26Var = this.h;
                j26Var.layout(j26Var.getLeft(), (getMeasuredHeight() - j26Var.getMeasuredHeight()) - (this.x ? 1 : 0), j26Var.getRight(), getMeasuredHeight() - (this.x ? 1 : 0));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        TextView textView;
        byte b = this.I;
        if (b == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(64.0f) + (this.x ? 1 : 0), TLObject.FLAG_30));
            return;
        }
        if (b == 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(56.0f), TLObject.FLAG_30));
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(56.0f), TLObject.FLAG_30));
        int measuredHeight = this.c.getMeasuredHeight() + gl.L(34.0f) + (this.x ? 1 : 0);
        if (this.K != null && (textView = this.s) != null && this.F.r2()) {
            this.R = true;
            textView.setText(gl.Q(this.K, (String) this.F.a2.get(0), textView.getMeasuredWidth(), textView.getPaint()));
            this.R = false;
            measuredHeight = de9.w(3.0f, textView.getMeasuredHeight(), measuredHeight);
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

    public void setGlobalGradientView(pi4 pi4Var) {
        this.N = pi4Var;
    }

    public void setPhoto(String str) {
        boolean endsWith = str.endsWith("mp4");
        kb0 kb0Var = this.b;
        if (endsWith) {
            kb0Var.o("vthumb://0:".concat(str), null, null);
            kb0Var.setVisibility(0);
        } else if (!str.endsWith(".jpg") && !str.endsWith(".jpeg") && !str.endsWith(".png") && !str.endsWith(".gif")) {
            kb0Var.setVisibility(8);
        } else {
            kb0Var.o("thumb://0:".concat(str), null, null);
            kb0Var.setVisibility(0);
        }
    }

    public void setPhotoEntry(jm6 jm6Var) {
        String str = jm6Var.c;
        long j = jm6Var.H;
        int i = jm6Var.G;
        int i2 = jm6Var.F;
        int i3 = jm6Var.C;
        String str2 = jm6Var.I;
        kb0 kb0Var = this.b;
        if (str != null) {
            kb0Var.o(str, null, bkb.Q4);
            str2 = jm6Var.c;
        } else if (str2 == null) {
            kb0Var.setImageDrawable(bkb.Q4);
            str2 = "";
        } else if (jm6Var.b) {
            kb0Var.q();
            kb0Var.o("vthumb://" + i3 + ":" + str2, null, bkb.Q4);
        } else {
            kb0Var.r(jm6Var.J, jm6Var.K, true);
            kb0Var.o("thumb://" + i3 + ":" + str2, null, bkb.Q4);
        }
        File file = new File(str2);
        this.c.setText(file.getName());
        ba4.D(file);
        this.d.setVisibility(8);
        StringBuilder sb = new StringBuilder();
        if (i2 != 0 && i != 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            Locale locale = Locale.US;
            sb.append(i2 + "x" + i);
        }
        if (jm6Var.b) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(gl.g0(jm6Var.E, false, false));
        }
        if (j != 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(gl.i0(j, false, false));
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append(k96.D0().y0().format(jm6Var.D));
        this.e.setText(sb);
        this.a.setVisibility(8);
    }

    @Override // tjb
    public final void updateColors() {
        try {
            this.h.setProgressColor(bkb.v0(bkb.yi, this.M));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override // sp3
    public final void l(long j, long j2) {
    }
}
