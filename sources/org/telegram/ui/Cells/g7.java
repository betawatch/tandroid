package org.telegram.ui.Cells;

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
import b8.mf;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.ye;
import org.telegram.messenger.zb;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.d70;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.fs;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.wz;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g7 extends FrameLayout implements org.telegram.ui.ActionBar.z5, org.telegram.messenger.x5 {
    public final int E;
    public zi F;
    public boolean G;
    public boolean H;
    public final int I;
    public final SpannableStringBuilder J;
    public CharSequence K;
    public final ch0 L;
    public final org.telegram.ui.ActionBar.e6 M;
    public iz N;
    public long O;
    public boolean P;
    public float Q;
    public boolean R;
    public float S;
    public final ImageView a;
    public final ei.d4 b;
    public final TextView c;
    public final TextView d;
    public final org.telegram.ui.Components.o5 e;
    public final fh0 f;
    public final d70 h;
    public final wo n;
    public final TextView r;
    public final TextView s;
    public boolean w;
    public boolean x;
    public final int y;

    public g7(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        float f10;
        this.w = true;
        int i10 = h10.t0;
        this.y = i10;
        this.S = 1.0f;
        this.M = e6Var;
        this.I = i3;
        this.E = org.telegram.messenger.z5.q(i10).k();
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        if (i3 == 1) {
            boolean z10 = bd.a0;
            addView(imageView, mf.d(42, 42.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 15.0f, 12.0f, z10 ? 15.0f : 0.0f, 0.0f));
        } else {
            boolean z11 = bd.a0;
            addView(imageView, mf.d(40, 40.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 12.0f, 8.0f, z11 ? 12.0f : 0.0f, 0.0f));
        }
        TextView textView = new TextView(context);
        this.d = textView;
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.pj, e6Var, 1, 14.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        int i11 = 2;
        textView.setImportantForAccessibility(2);
        if (i3 == 1) {
            boolean z12 = bd.a0;
            addView(textView, mf.d(32, -2.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 20.0f, 28.0f, z12 ? 20.0f : 0.0f, 0.0f));
        } else {
            boolean z13 = bd.a0;
            addView(textView, mf.d(32, -2.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 22.0f, z13 ? 16.0f : 0.0f, 0.0f));
        }
        ei.d4 d4Var = new ei.d4(i11, context, this);
        this.b = d4Var;
        d4Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
        if (i3 == 1) {
            boolean z14 = bd.a0;
            addView(d4Var, mf.d(42, 42.0f, (z14 ? 5 : 3) | 48, z14 ? 0.0f : 16.0f, 12.0f, z14 ? 16.0f : 0.0f, 0.0f));
        } else {
            boolean z15 = bd.a0;
            addView(d4Var, mf.d(40, 40.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : 12.0f, 8.0f, z15 ? 12.0f : 0.0f, 0.0f));
        }
        TextView textView2 = new TextView(context);
        this.c = textView2;
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.messenger.k5.n(textView2, i12, e6Var, 1, 16.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setGravity((bd.a0 ? 5 : 3) | 16);
        if (i3 == 1) {
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            boolean z16 = bd.a0;
            addView(textView2, mf.d(-1, -2.0f, (z16 ? 5 : 3) | 48, z16 ? 8.0f : 72.0f, 9.0f, z16 ? 72.0f : 8.0f, 0.0f));
            f10 = 14.0f;
        } else if (i3 == 2) {
            LinearLayout f11 = org.telegram.messenger.k5.f(context, 0);
            boolean z17 = bd.a0;
            addView(f11, mf.d(-1, -2.0f, (z17 ? 5 : 3) | 48, z17 ? 16.0f : 72.0f, 5.0f, z17 ? 72.0f : 16.0f, 0.0f));
            TextView textView3 = new TextView(context);
            this.r = textView3;
            org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.A6, e6Var);
            textView3.setTextSize(1, 14.0f);
            f10 = 14.0f;
            if (bd.a0) {
                f11.addView(textView3, mf.l(0.0f, -2, -2));
                f11.addView(textView2, mf.m(1.0f, -2, -2, 0, 4, 0));
            } else {
                f11.addView(textView2, mf.l(1.0f, -2, -2));
                f11.addView(textView3, mf.m(0.0f, -2, -2, 4, 0, 0));
            }
            textView2.setMaxLines(2);
            TextView textView4 = new TextView(context);
            this.s = textView4;
            org.telegram.ui.ActionBar.r6.V(textView4, i12, e6Var);
            textView4.setLines(1);
            textView4.setMaxLines(1);
            textView4.setSingleLine(true);
            textView4.setEllipsize(truncateAt);
            textView4.setGravity((bd.a0 ? 5 : 3) | 16);
            textView4.setTextSize(1, 13.0f);
            boolean z18 = bd.a0;
            addView(textView4, mf.d(-1, -2.0f, (z18 ? 5 : 3) | 48, z18 ? 8.0f : 72.0f, 30.0f, z18 ? 72.0f : 8.0f, 0.0f));
            textView4.setVisibility(8);
        } else {
            f10 = 14.0f;
            textView2.setMaxLines(1);
            boolean z19 = bd.a0;
            addView(textView2, mf.d(-1, -2.0f, (z19 ? 5 : 3) | 48, z19 ? 8.0f : 72.0f, 5.0f, z19 ? 72.0f : 8.0f, 0.0f));
        }
        ch0 ch0Var = new ch0(R.raw.download_arrow, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), true, null);
        this.L = ch0Var;
        fh0 fh0Var = new fh0(context);
        this.f = fh0Var;
        fh0Var.setAnimation(ch0Var);
        fh0Var.setVisibility(4);
        int i13 = org.telegram.ui.ActionBar.k6.wi;
        org.telegram.ui.ActionBar.r6.t(fh0Var, i13, e6Var, PorterDuff.Mode.SRC_IN);
        if (i3 == 1) {
            boolean z20 = bd.a0;
            addView(fh0Var, mf.d(14, 14.0f, (z20 ? 5 : 3) | 48, z20 ? 8.0f : 70.0f, 37.0f, z20 ? 72.0f : 8.0f, 0.0f));
        } else {
            boolean z21 = bd.a0;
            addView(fh0Var, mf.d(14, 14.0f, (z21 ? 5 : 3) | 48, z21 ? 8.0f : 70.0f, 33.0f, z21 ? 72.0f : 8.0f, 0.0f));
        }
        org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(context);
        this.e = o5Var;
        org.telegram.ui.ActionBar.r6.V(o5Var, org.telegram.ui.ActionBar.k6.A6, e6Var);
        o5Var.setLines(1);
        o5Var.setMaxLines(1);
        o5Var.setSingleLine(true);
        o5Var.setEllipsize(truncateAt);
        o5Var.setGravity((bd.a0 ? 5 : 3) | 16);
        hs.i(o5Var);
        if (i3 == 1) {
            o5Var.setTextSize(1, 13.0f);
            boolean z22 = bd.a0;
            addView(o5Var, mf.d(-1, -2.0f, (z22 ? 5 : 3) | 48, z22 ? 8.0f : 72.0f, 34.0f, z22 ? 72.0f : 8.0f, 0.0f));
        } else {
            o5Var.setTextSize(1, 13.0f);
            boolean z23 = bd.a0;
            addView(o5Var, mf.d(-1, -2.0f, (z23 ? 5 : 3) | 48, z23 ? 8.0f : 72.0f, 30.0f, z23 ? 72.0f : 8.0f, 0.0f));
        }
        d70 d70Var = new d70(context);
        this.h = d70Var;
        d70Var.setProgressColor(org.telegram.ui.ActionBar.k6.w0(i13, e6Var));
        boolean z24 = bd.a0;
        addView(d70Var, mf.d(-1, 2.0f, (z24 ? 5 : 3) | 48, z24 ? 0.0f : 72.0f, 54.0f, z24 ? 72.0f : 0.0f, 0.0f));
        wo woVar = new wo(21, context, e6Var);
        this.n = woVar;
        woVar.setVisibility(4);
        woVar.b(-1, org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.k7);
        woVar.setDrawUnchecked(false);
        woVar.setDrawBackgroundAsArc(2);
        if (i3 == 1) {
            boolean z25 = bd.a0;
            addView(woVar, mf.d(24, 24.0f, (z25 ? 5 : 3) | 48, z25 ? 0.0f : 38.0f, 36.0f, z25 ? 38.0f : 0.0f, 0.0f));
        } else {
            boolean z26 = bd.a0;
            addView(woVar, mf.d(24, 24.0f, (z26 ? 5 : 3) | 48, z26 ? 0.0f : 33.0f, 28.0f, z26 ? 33.0f : 0.0f, 0.0f));
        }
        if (i3 == 2) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.J = spannableStringBuilder;
            spannableStringBuilder.setSpan(new fs(), 0, 1, 0);
        }
    }

    @Override // org.telegram.messenger.x5
    public final void C(boolean z10) {
        f(true);
        this.O = 0L;
        e();
    }

    @Override // org.telegram.messenger.x5
    public final void M(String str) {
        this.h.a(true, 1.0f);
        f(true);
        this.O = 0L;
        e();
    }

    public final void a(Canvas canvas) {
        if (this.x) {
            canvas.drawLine(org.telegram.messenger.g0.L(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.k6.W0("paintDivider", this.M));
        }
    }

    public final void b(boolean z10, boolean z11) {
        wo woVar = this.n;
        if (woVar.getVisibility() != 0) {
            woVar.setVisibility(0);
        }
        woVar.a(z10, z11);
    }

    public final void c(zi ziVar, boolean z10) {
        String str;
        String str2;
        String str3;
        String str4;
        zi ziVar2 = this.F;
        boolean z11 = (ziVar2 == null || ziVar == null || ziVar2.f1() == ziVar.f1()) ? false : true;
        this.x = z10;
        this.F = ziVar;
        this.H = false;
        this.G = false;
        if (!z11) {
            this.O = 0L;
        }
        TLRPC.Document F0 = ziVar.F0();
        TextView textView = this.s;
        TextView textView2 = this.c;
        ImageView imageView = this.a;
        TextView textView3 = this.d;
        ei.d4 d4Var = this.b;
        if (F0 != null) {
            if (ziVar.J3()) {
                str = null;
                for (int i3 = 0; i3 < F0.attributes.size(); i3++) {
                    TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i3);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && (((str3 = documentAttribute.performer) != null && str3.length() != 0) || ((str4 = documentAttribute.title) != null && str4.length() != 0))) {
                        str = ziVar.x1(true) + " - " + ziVar.z1(true);
                    }
                }
            } else {
                str = null;
            }
            String B = (zi.M4(ziVar.k) || (ziVar.k.media instanceof TLRPC.TL_messageMediaPhoto) || zi.t3(F0, false)) ? null : org.telegram.messenger.w7.B(F0);
            if (TextUtils.isEmpty(B) && (str2 = F0.mime_type) != null) {
                B = str2.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND) ? zi.t3(F0, false) ? bd.M0(2131753971, null) : bd.M0(2131753933, null) : F0.mime_type.startsWith("image") ? zi.t3(F0, false) ? bd.M0(2131753971, null) : bd.M0(2131753948, null) : F0.mime_type.startsWith(MediaStreamTrack.AUDIO_TRACK_KIND) ? bd.M0(2131753982, null) : bd.M0(2131753975, null);
            }
            String str5 = str == null ? B : str;
            ArrayList arrayList = ziVar.Y1;
            org.telegram.ui.ActionBar.e6 e6Var = this.M;
            CharSequence x12 = org.telegram.messenger.g0.x1(str5, arrayList, e6Var);
            if (x12 != null) {
                textView2.setText(x12);
            } else {
                textView2.setText(str5);
            }
            imageView.setVisibility(0);
            textView3.setVisibility(0);
            imageView.setImageResource(org.telegram.messenger.g0.m1(B, false));
            int lastIndexOf = B.lastIndexOf(46);
            textView3.setText(lastIndexOf != -1 ? B.substring(lastIndexOf + 1).toLowerCase() : "");
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(F0.thumbs, hs.r5, false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(F0.thumbs, 40, false, null, false);
            if (w11 == w10) {
                w10 = null;
            }
            if ((w11 instanceof TLRPC.TL_photoSizeEmpty) || w11 == null) {
                d4Var.setVisibility(4);
                d4Var.setImageBitmap(null);
                textView3.setAlpha(1.0f);
                imageView.setAlpha(1.0f);
            } else {
                d4Var.getImageReceiver().G0 = w10 == null;
                d4Var.getImageReceiver().H0 = w10 == null;
                d4Var.setVisibility(0);
                if (ziVar.G1 != null) {
                    d4Var.n(ac.c(w10, F0), "40_40", null, null, ziVar.G1, null, 1, ziVar);
                } else {
                    d4Var.g(1, 0L, ziVar, "40_40", "40_40_b", null, ac.c(w10, F0), ac.c(w11, F0));
                }
            }
            e();
            if (ziVar.s2() && !TextUtils.isEmpty(this.F.k.message)) {
                CharSequence x13 = org.telegram.messenger.g0.x1(this.F.k.message.replace("\n", " ").replaceAll(" +", " ").trim(), this.F.Y1, e6Var);
                this.K = x13;
                if (textView != null) {
                    textView.setVisibility(x13 == null ? 8 : 0);
                }
            } else if (textView != null) {
                textView.setVisibility(8);
            }
        } else {
            textView2.setText("");
            textView3.setText("");
            this.e.setText("");
            imageView.setVisibility(0);
            textView3.setVisibility(0);
            textView3.setAlpha(1.0f);
            imageView.setAlpha(1.0f);
            d4Var.setVisibility(4);
            d4Var.setImageBitmap(null);
            this.K = null;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
        setWillNotDraw(!this.x);
        this.h.a(false, 0.0f);
        f(z11);
    }

    public final void d(String str, String str2, String str3, String str4, int i3, boolean z10) {
        int i10;
        int i11;
        this.c.setText(str);
        this.e.setText(str2);
        TextView textView = this.d;
        if (str3 != null) {
            textView.setVisibility(0);
            textView.setText(str3.toLowerCase());
        } else {
            textView.setVisibility(4);
        }
        this.x = z10;
        ImageView imageView = this.a;
        if (i3 == 0) {
            imageView.setImageResource(org.telegram.messenger.g0.m1(str, false));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        int i12 = this.I;
        ei.d4 d4Var = this.b;
        if (str4 == null && i3 == 0) {
            textView.setAlpha(1.0f);
            imageView.setAlpha(1.0f);
            if (i12 != 3) {
                d4Var.setImageBitmap(null);
                d4Var.setVisibility(4);
            }
        } else {
            if (str4 == null) {
                xp N = org.telegram.ui.ActionBar.k6.N(org.telegram.messenger.g0.L(42.0f), i3);
                if (i3 == R.drawable.files_storage) {
                    i10 = org.telegram.ui.ActionBar.k6.na;
                    i11 = org.telegram.ui.ActionBar.k6.ia;
                } else if (i3 == R.drawable.files_gallery) {
                    i10 = org.telegram.ui.ActionBar.k6.la;
                    i11 = org.telegram.ui.ActionBar.k6.ia;
                } else if (i3 == R.drawable.files_music) {
                    i10 = org.telegram.ui.ActionBar.k6.ka;
                    i11 = org.telegram.ui.ActionBar.k6.ia;
                } else if (i3 == R.drawable.files_internal) {
                    i10 = org.telegram.ui.ActionBar.k6.ja;
                    i11 = org.telegram.ui.ActionBar.k6.ia;
                } else {
                    i10 = org.telegram.ui.ActionBar.k6.oj;
                    i11 = org.telegram.ui.ActionBar.k6.nj;
                }
                org.telegram.ui.ActionBar.e6 e6Var = this.M;
                org.telegram.ui.ActionBar.k6.B1(N, org.telegram.ui.ActionBar.k6.w0(i10, e6Var), false);
                org.telegram.ui.ActionBar.k6.B1(N, org.telegram.ui.ActionBar.k6.w0(i11, e6Var), true);
                d4Var.setImageDrawable(N);
            } else if (i12 != 3) {
                d4Var.h(str4, "42_42", null);
            }
            d4Var.setVisibility(0);
        }
        setWillNotDraw(true ^ this.x);
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
        boolean z10 = this.P;
        if (z10 || this.Q != 0.0f) {
            if (z10) {
                float f10 = this.Q;
                if (f10 != 1.0f) {
                    this.Q = f10 + 0.10666667f;
                    invalidate();
                    this.Q = Utilities.i(this.Q, 1.0f, 0.0f);
                    int measuredWidth = (getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f)) - org.telegram.ui.ActionBar.k6.Z0.getIntrinsicWidth();
                    int measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight()) >> 1;
                    canvas.save();
                    float f11 = this.Q;
                    canvas.scale(f11, f11, (org.telegram.ui.ActionBar.k6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth, (org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight);
                    Drawable drawable = org.telegram.ui.ActionBar.k6.Z0;
                    drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight() + measuredHeight);
                    org.telegram.ui.ActionBar.k6.Z0.draw(canvas);
                    canvas.restore();
                }
            }
            if (!z10) {
                float f12 = this.Q;
                if (f12 != 0.0f) {
                    this.Q = f12 - 0.10666667f;
                    invalidate();
                }
            }
            this.Q = Utilities.i(this.Q, 1.0f, 0.0f);
            int measuredWidth2 = (getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f)) - org.telegram.ui.ActionBar.k6.Z0.getIntrinsicWidth();
            int measuredHeight2 = (getMeasuredHeight() - org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight()) >> 1;
            canvas.save();
            float f112 = this.Q;
            canvas.scale(f112, f112, (org.telegram.ui.ActionBar.k6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth2, (org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight2);
            Drawable drawable2 = org.telegram.ui.ActionBar.k6.Z0;
            drawable2.setBounds(measuredWidth2, measuredHeight2, drawable2.getIntrinsicWidth() + measuredWidth2, org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight() + measuredHeight2);
            org.telegram.ui.ActionBar.k6.Z0.draw(canvas);
            canvas.restore();
        }
    }

    public final void e() {
        String C;
        zi ziVar = this.F;
        if (ziVar == null || ziVar.F0() == null) {
            return;
        }
        zi ziVar2 = this.F;
        long j10 = ziVar2.k.date * 1000;
        long j11 = this.O;
        if (j11 == 0) {
            C = org.telegram.messenger.g0.i0(ziVar2.F0().size, false, false);
        } else {
            Locale locale = Locale.ENGLISH;
            C = a1.g.C(org.telegram.messenger.g0.i0(j11, false, false), " / ", org.telegram.messenger.g0.i0(this.F.F0().size, false, false));
        }
        int i3 = this.I;
        org.telegram.ui.Components.o5 o5Var = this.e;
        if (i3 == 2) {
            o5Var.setText(new SpannableStringBuilder().append((CharSequence) C).append(' ').append((CharSequence) this.J).append(' ').append(wz.d(this.F, true, 2, o5Var.getPaint())));
            this.r.setText(bd.e1(this.F.k.date));
            return;
        }
        o5Var.setText(C + ", " + bd.a0("formatDateAtTime", null, 2131742793, bd.E0().C0().format(new Date(j10)), bd.E0().p0().format(new Date(j10))));
    }

    public final void f(boolean z10) {
        if (z10) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new Fade().setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) xq.f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        zi ziVar = this.F;
        int i3 = this.y;
        fh0 fh0Var = this.f;
        d70 d70Var = this.h;
        org.telegram.ui.Components.o5 o5Var = this.e;
        if (ziVar == null || ziVar.k.media == null) {
            this.G = false;
            this.H = true;
            d70Var.setVisibility(4);
            d70Var.a(false, 0.0f);
            fh0Var.setVisibility(4);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) o5Var.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.leftMargin = org.telegram.messenger.g0.L(bd.a0 ? 8.0f : 72.0f);
                layoutParams.rightMargin = org.telegram.messenger.g0.L(bd.a0 ? 72.0f : 8.0f);
                o5Var.requestLayout();
            }
            org.telegram.messenger.z5.q(i3).v(this);
            return;
        }
        this.H = false;
        if (ziVar.w0 || ziVar.x0 || !this.w) {
            fh0Var.setVisibility(4);
            d70Var.setVisibility(4);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) o5Var.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.leftMargin = org.telegram.messenger.g0.L(bd.a0 ? 8.0f : 72.0f);
                layoutParams2.rightMargin = org.telegram.messenger.g0.L(bd.a0 ? 72.0f : 8.0f);
                o5Var.requestLayout();
            }
            this.G = false;
            this.H = true;
            org.telegram.messenger.z5.q(i3).v(this);
            return;
        }
        String r5 = org.telegram.messenger.w7.r(null, ziVar.F0());
        org.telegram.messenger.z5.q(i3).a(r5, this.F, this);
        this.G = org.telegram.messenger.w7.G(i3).T(r5);
        fh0Var.setVisibility(0);
        int i10 = this.G ? 15 : 0;
        ch0 ch0Var = this.L;
        ch0Var.P(i10);
        ch0Var.h = true;
        if (z10) {
            fh0Var.d();
        } else {
            ch0Var.M(this.G ? 15 : 0);
            fh0Var.invalidate();
        }
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) o5Var.getLayoutParams();
        if (layoutParams3 != null) {
            layoutParams3.leftMargin = org.telegram.messenger.g0.L(bd.a0 ? 8.0f : 86.0f);
            layoutParams3.rightMargin = org.telegram.messenger.g0.L(bd.a0 ? 86.0f : 8.0f);
            o5Var.requestLayout();
        }
        if (!this.G) {
            d70Var.setVisibility(4);
            return;
        }
        d70Var.setVisibility(0);
        Float w10 = zb.D().w(r5);
        if (w10 == null) {
            w10 = Float.valueOf(0.0f);
        }
        d70Var.a(false, w10.floatValue());
    }

    public org.telegram.ui.Components.k9 getImageView() {
        return this.b;
    }

    public zi getMessage() {
        return this.F;
    }

    @Override // org.telegram.messenger.x5
    public int getObserverTag() {
        return this.E;
    }

    @Override // org.telegram.messenger.x5
    public final void i(long j10, long j11) {
        d70 d70Var = this.h;
        if (d70Var.getVisibility() != 0) {
            f(true);
        }
        this.O = j10;
        e();
        d70Var.a(true, Math.min(1.0f, j10 / j11));
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
        org.telegram.messenger.z5.q(this.y).v(this);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        wo woVar = this.n;
        if (woVar.a.q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(woVar.a.q);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        if (this.I != 1) {
            TextView textView = this.c;
            int lineCount = textView.getLineCount();
            TextView textView2 = this.s;
            if (lineCount > 1 || (textView2 != null && textView2.getVisibility() == 0)) {
                int measuredHeight = textView.getMeasuredHeight() - org.telegram.messenger.g0.L(22.0f);
                if (textView2 != null && textView2.getVisibility() == 0) {
                    textView2.layout(textView2.getLeft(), textView2.getTop() + measuredHeight, textView2.getRight(), textView2.getBottom() + measuredHeight);
                    measuredHeight = org.telegram.messenger.k5.C(3.0f, textView2.getMeasuredHeight(), measuredHeight);
                }
                org.telegram.ui.Components.o5 o5Var = this.e;
                o5Var.layout(o5Var.getLeft(), o5Var.getTop() + measuredHeight, o5Var.getRight(), o5Var.getBottom() + measuredHeight);
                fh0 fh0Var = this.f;
                fh0Var.layout(fh0Var.getLeft(), fh0Var.getTop() + measuredHeight, fh0Var.getRight(), fh0Var.getBottom() + measuredHeight);
                d70 d70Var = this.h;
                d70Var.layout(d70Var.getLeft(), (getMeasuredHeight() - d70Var.getMeasuredHeight()) - (this.x ? 1 : 0), d70Var.getRight(), getMeasuredHeight() - (this.x ? 1 : 0));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        TextView textView;
        int i11 = this.I;
        if (i11 == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.x ? 1 : 0), TLObject.FLAG_30));
            return;
        }
        if (i11 == 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), TLObject.FLAG_30));
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), TLObject.FLAG_30));
        int measuredHeight = this.c.getMeasuredHeight() + org.telegram.messenger.g0.L(34.0f) + (this.x ? 1 : 0);
        if (this.K != null && (textView = this.s) != null && this.F.s2()) {
            this.R = true;
            textView.setText(org.telegram.messenger.g0.Q(this.K, (String) this.F.Y1.get(0), textView.getMeasuredWidth(), textView.getPaint()));
            this.R = false;
            measuredHeight = org.telegram.messenger.k5.C(3.0f, textView.getMeasuredHeight(), measuredHeight);
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

    public void setDrawDownloadIcon(boolean z10) {
        this.w = z10;
    }

    public void setEnterAnimationAlpha(float f10) {
        if (this.S != f10) {
            this.S = f10;
            invalidate();
        }
    }

    public void setGlobalGradientView(iz izVar) {
        this.N = izVar;
    }

    public void setPhoto(String str) {
        boolean endsWith = str.endsWith("mp4");
        ei.d4 d4Var = this.b;
        if (endsWith) {
            d4Var.h("vthumb://0:".concat(str), null, null);
            d4Var.setVisibility(0);
        } else if (!str.endsWith(".jpg") && !str.endsWith(".jpeg") && !str.endsWith(".png") && !str.endsWith(".gif")) {
            d4Var.setVisibility(8);
        } else {
            d4Var.h("thumb://0:".concat(str), null, null);
            d4Var.setVisibility(0);
        }
    }

    public void setPhotoEntry(ye yeVar) {
        String str = yeVar.c;
        long j10 = yeVar.H;
        int i3 = yeVar.G;
        int i10 = yeVar.F;
        int i11 = yeVar.C;
        String str2 = yeVar.I;
        ei.d4 d4Var = this.b;
        if (str != null) {
            d4Var.h(str, null, org.telegram.ui.ActionBar.k6.R4);
            str2 = yeVar.c;
        } else if (str2 == null) {
            d4Var.setImageDrawable(org.telegram.ui.ActionBar.k6.R4);
            str2 = "";
        } else if (yeVar.b) {
            d4Var.r();
            d4Var.h("vthumb://" + i11 + ":" + str2, null, org.telegram.ui.ActionBar.k6.R4);
        } else {
            d4Var.s(yeVar.J, yeVar.K, true);
            d4Var.h("thumb://" + i11 + ":" + str2, null, org.telegram.ui.ActionBar.k6.R4);
        }
        File file = new File(str2);
        this.c.setText(file.getName());
        org.telegram.messenger.w7.D(file);
        this.d.setVisibility(8);
        StringBuilder sb2 = new StringBuilder();
        if (i10 != 0 && i3 != 0) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            Locale locale = Locale.US;
            sb2.append(i10 + "x" + i3);
        }
        if (yeVar.b) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(org.telegram.messenger.g0.g0(yeVar.E, false, false));
        }
        if (j10 != 0) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(org.telegram.messenger.g0.i0(j10, false, false));
        }
        if (sb2.length() > 0) {
            sb2.append(", ");
        }
        sb2.append(bd.E0().z0().format(yeVar.D));
        this.e.setText(sb2);
        this.a.setVisibility(8);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            this.h.setProgressColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.wi, this.M));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j10, long j11) {
    }
}
