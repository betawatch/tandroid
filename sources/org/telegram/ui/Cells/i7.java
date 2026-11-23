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
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fc;
import org.telegram.messenger.ff;
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.rh0;
import org.telegram.ui.Components.us;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.yz;
import org.telegram.ui.c00;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class i7 extends FrameLayout implements org.telegram.ui.ActionBar.b6, org.telegram.messenger.y5 {
    public final int E;
    public gj F;
    public boolean G;
    public boolean H;
    public final int I;
    public final SpannableStringBuilder J;
    public CharSequence K;
    public final oh0 L;
    public final org.telegram.ui.ActionBar.h6 M;
    public yz N;
    public long O;
    public boolean P;
    public float Q;
    public boolean R;
    public float S;
    public final ImageView a;
    public final fi.t3 b;
    public final TextView c;
    public final TextView d;
    public final org.telegram.ui.Components.x5 e;
    public final rh0 f;
    public final x70 h;
    public final op n;
    public final TextView r;
    public final TextView s;
    public boolean w;
    public boolean x;
    public final int y;

    public i7(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        float f10;
        this.w = true;
        int i10 = k10.t0;
        this.y = i10;
        this.S = 1.0f;
        this.M = h6Var;
        this.I = i7;
        this.E = org.telegram.messenger.a6.q(i10).k();
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        if (i7 == 1) {
            boolean z10 = hd.a0;
            addView(imageView, c8.ma.d(42, 42.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 15.0f, 12.0f, z10 ? 15.0f : 0.0f, 0.0f));
        } else {
            boolean z11 = hd.a0;
            addView(imageView, c8.ma.d(40, 40.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 12.0f, 8.0f, z11 ? 12.0f : 0.0f, 0.0f));
        }
        TextView textView = new TextView(context);
        this.d = textView;
        org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.m6.sj, h6Var, 1, 14.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        int i11 = 2;
        textView.setImportantForAccessibility(2);
        if (i7 == 1) {
            boolean z12 = hd.a0;
            addView(textView, c8.ma.d(32, -2.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 20.0f, 28.0f, z12 ? 20.0f : 0.0f, 0.0f));
        } else {
            boolean z13 = hd.a0;
            addView(textView, c8.ma.d(32, -2.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 22.0f, z13 ? 16.0f : 0.0f, 0.0f));
        }
        fi.t3 t3Var = new fi.t3(i11, context, this);
        this.b = t3Var;
        t3Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
        if (i7 == 1) {
            boolean z14 = hd.a0;
            addView(t3Var, c8.ma.d(42, 42.0f, (z14 ? 5 : 3) | 48, z14 ? 0.0f : 16.0f, 12.0f, z14 ? 16.0f : 0.0f, 0.0f));
        } else {
            boolean z15 = hd.a0;
            addView(t3Var, c8.ma.d(40, 40.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : 12.0f, 8.0f, z15 ? 12.0f : 0.0f, 0.0f));
        }
        TextView textView2 = new TextView(context);
        this.c = textView2;
        int i12 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.messenger.f3.l(textView2, i12, h6Var, 1, 16.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setGravity((hd.a0 ? 5 : 3) | 16);
        if (i7 == 1) {
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            boolean z16 = hd.a0;
            addView(textView2, c8.ma.d(-1, -2.0f, (z16 ? 5 : 3) | 48, z16 ? 8.0f : 72.0f, 9.0f, z16 ? 72.0f : 8.0f, 0.0f));
            f10 = 14.0f;
        } else if (i7 == 2) {
            LinearLayout g10 = org.telegram.messenger.f3.g(context, 0);
            boolean z17 = hd.a0;
            addView(g10, c8.ma.d(-1, -2.0f, (z17 ? 5 : 3) | 48, z17 ? 16.0f : 72.0f, 5.0f, z17 ? 72.0f : 16.0f, 0.0f));
            TextView textView3 = new TextView(context);
            this.r = textView3;
            org.telegram.ui.ActionBar.t6.U(textView3, org.telegram.ui.ActionBar.m6.A6, h6Var);
            textView3.setTextSize(1, 14.0f);
            f10 = 14.0f;
            if (hd.a0) {
                g10.addView(textView3, c8.ma.l(0.0f, -2, -2));
                g10.addView(textView2, c8.ma.m(1.0f, -2, -2, 0, 4, 0));
            } else {
                g10.addView(textView2, c8.ma.l(1.0f, -2, -2));
                g10.addView(textView3, c8.ma.m(0.0f, -2, -2, 4, 0, 0));
            }
            textView2.setMaxLines(2);
            TextView textView4 = new TextView(context);
            this.s = textView4;
            org.telegram.ui.ActionBar.t6.U(textView4, i12, h6Var);
            textView4.setLines(1);
            textView4.setMaxLines(1);
            textView4.setSingleLine(true);
            textView4.setEllipsize(truncateAt);
            textView4.setGravity((hd.a0 ? 5 : 3) | 16);
            textView4.setTextSize(1, 13.0f);
            boolean z18 = hd.a0;
            addView(textView4, c8.ma.d(-1, -2.0f, (z18 ? 5 : 3) | 48, z18 ? 8.0f : 72.0f, 30.0f, z18 ? 72.0f : 8.0f, 0.0f));
            textView4.setVisibility(8);
        } else {
            f10 = 14.0f;
            textView2.setMaxLines(1);
            boolean z19 = hd.a0;
            addView(textView2, c8.ma.d(-1, -2.0f, (z19 ? 5 : 3) | 48, z19 ? 8.0f : 72.0f, 5.0f, z19 ? 72.0f : 8.0f, 0.0f));
        }
        oh0 oh0Var = new oh0(R.raw.download_arrow, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), true, null);
        this.L = oh0Var;
        rh0 rh0Var = new rh0(context);
        this.f = rh0Var;
        rh0Var.setAnimation(oh0Var);
        rh0Var.setVisibility(4);
        int i13 = org.telegram.ui.ActionBar.m6.zi;
        org.telegram.ui.ActionBar.t6.s(rh0Var, i13, h6Var, PorterDuff.Mode.SRC_IN);
        if (i7 == 1) {
            boolean z20 = hd.a0;
            addView(rh0Var, c8.ma.d(14, 14.0f, (z20 ? 5 : 3) | 48, z20 ? 8.0f : 70.0f, 37.0f, z20 ? 72.0f : 8.0f, 0.0f));
        } else {
            boolean z21 = hd.a0;
            addView(rh0Var, c8.ma.d(14, 14.0f, (z21 ? 5 : 3) | 48, z21 ? 8.0f : 70.0f, 33.0f, z21 ? 72.0f : 8.0f, 0.0f));
        }
        org.telegram.ui.Components.x5 x5Var = new org.telegram.ui.Components.x5(context);
        this.e = x5Var;
        org.telegram.ui.ActionBar.t6.U(x5Var, org.telegram.ui.ActionBar.m6.A6, h6Var);
        x5Var.setLines(1);
        x5Var.setMaxLines(1);
        x5Var.setSingleLine(true);
        x5Var.setEllipsize(truncateAt);
        x5Var.setGravity((hd.a0 ? 5 : 3) | 16);
        ls.i(x5Var);
        if (i7 == 1) {
            x5Var.setTextSize(1, 13.0f);
            boolean z22 = hd.a0;
            addView(x5Var, c8.ma.d(-1, -2.0f, (z22 ? 5 : 3) | 48, z22 ? 8.0f : 72.0f, 34.0f, z22 ? 72.0f : 8.0f, 0.0f));
        } else {
            x5Var.setTextSize(1, 13.0f);
            boolean z23 = hd.a0;
            addView(x5Var, c8.ma.d(-1, -2.0f, (z23 ? 5 : 3) | 48, z23 ? 8.0f : 72.0f, 30.0f, z23 ? 72.0f : 8.0f, 0.0f));
        }
        x70 x70Var = new x70(context);
        this.h = x70Var;
        x70Var.setProgressColor(org.telegram.ui.ActionBar.m6.w0(i13, h6Var));
        boolean z24 = hd.a0;
        addView(x70Var, c8.ma.d(-1, 2.0f, (z24 ? 5 : 3) | 48, z24 ? 0.0f : 72.0f, 54.0f, z24 ? 72.0f : 0.0f, 0.0f));
        op opVar = new op(21, context, h6Var);
        this.n = opVar;
        opVar.setVisibility(4);
        opVar.b(-1, org.telegram.ui.ActionBar.m6.d6, org.telegram.ui.ActionBar.m6.k7);
        opVar.setDrawUnchecked(false);
        opVar.setDrawBackgroundAsArc(2);
        if (i7 == 1) {
            boolean z25 = hd.a0;
            addView(opVar, c8.ma.d(24, 24.0f, (z25 ? 5 : 3) | 48, z25 ? 0.0f : 38.0f, 36.0f, z25 ? 38.0f : 0.0f, 0.0f));
        } else {
            boolean z26 = hd.a0;
            addView(opVar, c8.ma.d(24, 24.0f, (z26 ? 5 : 3) | 48, z26 ? 0.0f : 33.0f, 28.0f, z26 ? 33.0f : 0.0f, 0.0f));
        }
        if (i7 == 2) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.J = spannableStringBuilder;
            spannableStringBuilder.setSpan(new us(), 0, 1, 0);
        }
    }

    @Override // org.telegram.messenger.y5
    public final void C(boolean z10) {
        f(true);
        this.O = 0L;
        e();
    }

    @Override // org.telegram.messenger.y5
    public final void N(String str) {
        this.h.a(true, 1.0f);
        f(true);
        this.O = 0L;
        e();
    }

    public final void a(Canvas canvas) {
        if (this.x) {
            canvas.drawLine(org.telegram.messenger.g0.L(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.m6.W0("paintDivider", this.M));
        }
    }

    public final void b(boolean z10, boolean z11) {
        op opVar = this.n;
        if (opVar.getVisibility() != 0) {
            opVar.setVisibility(0);
        }
        opVar.a(z10, z11);
    }

    public final void c(gj gjVar, boolean z10) {
        String str;
        String str2;
        String str3;
        String str4;
        gj gjVar2 = this.F;
        boolean z11 = (gjVar2 == null || gjVar == null || gjVar2.e1() == gjVar.e1()) ? false : true;
        this.x = z10;
        this.F = gjVar;
        this.H = false;
        this.G = false;
        if (!z11) {
            this.O = 0L;
        }
        TLRPC.Document F0 = gjVar.F0();
        TextView textView = this.s;
        TextView textView2 = this.c;
        ImageView imageView = this.a;
        TextView textView3 = this.d;
        fi.t3 t3Var = this.b;
        if (F0 != null) {
            if (gjVar.I3()) {
                str = null;
                for (int i7 = 0; i7 < F0.attributes.size(); i7++) {
                    TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i7);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && (((str3 = documentAttribute.performer) != null && str3.length() != 0) || ((str4 = documentAttribute.title) != null && str4.length() != 0))) {
                        str = gjVar.w1(true) + " - " + gjVar.y1(true);
                    }
                }
            } else {
                str = null;
            }
            String B = (gj.L4(gjVar.k) || (gjVar.k.media instanceof TLRPC.TL_messageMediaPhoto) || gj.s3(F0, false)) ? null : org.telegram.messenger.w7.B(F0);
            if (TextUtils.isEmpty(B) && (str2 = F0.mime_type) != null) {
                B = str2.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND) ? gj.s3(F0, false) ? hd.N0(2131753968, null) : hd.N0(2131753930, null) : F0.mime_type.startsWith("image") ? gj.s3(F0, false) ? hd.N0(2131753968, null) : hd.N0(2131753945, null) : F0.mime_type.startsWith(MediaStreamTrack.AUDIO_TRACK_KIND) ? hd.N0(2131753979, null) : hd.N0(2131753972, null);
            }
            String str5 = str == null ? B : str;
            ArrayList arrayList = gjVar.a2;
            org.telegram.ui.ActionBar.h6 h6Var = this.M;
            CharSequence x12 = org.telegram.messenger.g0.x1(str5, arrayList, h6Var);
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
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(F0.thumbs, ls.r5, false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(F0.thumbs, 40, false, null, false);
            if (w11 == w10) {
                w10 = null;
            }
            if ((w11 instanceof TLRPC.TL_photoSizeEmpty) || w11 == null) {
                t3Var.setVisibility(4);
                t3Var.setImageBitmap(null);
                textView3.setAlpha(1.0f);
                imageView.setAlpha(1.0f);
            } else {
                t3Var.getImageReceiver().G0 = w10 == null;
                t3Var.getImageReceiver().H0 = w10 == null;
                t3Var.setVisibility(0);
                if (gjVar.I1 != null) {
                    t3Var.n(gc.c(w10, F0), "40_40", null, null, gjVar.I1, null, 1, gjVar);
                } else {
                    t3Var.g(1, 0L, gjVar, "40_40", "40_40_b", null, gc.c(w10, F0), gc.c(w11, F0));
                }
            }
            e();
            if (gjVar.r2() && !TextUtils.isEmpty(this.F.k.message)) {
                CharSequence x13 = org.telegram.messenger.g0.x1(this.F.k.message.replace("\n", " ").replaceAll(" +", " ").trim(), this.F.a2, h6Var);
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
            t3Var.setVisibility(4);
            t3Var.setImageBitmap(null);
            this.K = null;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
        setWillNotDraw(!this.x);
        this.h.a(false, 0.0f);
        f(z11);
    }

    public final void d(String str, String str2, String str3, String str4, int i7, boolean z10) {
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
        if (i7 == 0) {
            imageView.setImageResource(org.telegram.messenger.g0.m1(str, false));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        int i12 = this.I;
        fi.t3 t3Var = this.b;
        if (str4 == null && i7 == 0) {
            textView.setAlpha(1.0f);
            imageView.setAlpha(1.0f);
            if (i12 != 3) {
                t3Var.setImageBitmap(null);
                t3Var.setVisibility(4);
            }
        } else {
            if (str4 == null) {
                oq N = org.telegram.ui.ActionBar.m6.N(org.telegram.messenger.g0.L(42.0f), i7);
                if (i7 == R.drawable.files_storage) {
                    i10 = org.telegram.ui.ActionBar.m6.na;
                    i11 = org.telegram.ui.ActionBar.m6.ia;
                } else if (i7 == R.drawable.files_gallery) {
                    i10 = org.telegram.ui.ActionBar.m6.la;
                    i11 = org.telegram.ui.ActionBar.m6.ia;
                } else if (i7 == R.drawable.files_music) {
                    i10 = org.telegram.ui.ActionBar.m6.ka;
                    i11 = org.telegram.ui.ActionBar.m6.ia;
                } else if (i7 == R.drawable.files_internal) {
                    i10 = org.telegram.ui.ActionBar.m6.ja;
                    i11 = org.telegram.ui.ActionBar.m6.ia;
                } else {
                    i10 = org.telegram.ui.ActionBar.m6.rj;
                    i11 = org.telegram.ui.ActionBar.m6.qj;
                }
                org.telegram.ui.ActionBar.h6 h6Var = this.M;
                org.telegram.ui.ActionBar.m6.B1(N, org.telegram.ui.ActionBar.m6.w0(i10, h6Var), false);
                org.telegram.ui.ActionBar.m6.B1(N, org.telegram.ui.ActionBar.m6.w0(i11, h6Var), true);
                t3Var.setImageDrawable(N);
            } else if (i12 != 3) {
                t3Var.h(str4, "42_42", null);
            }
            t3Var.setVisibility(0);
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
            this.N.g();
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
                    int measuredWidth = (getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f)) - org.telegram.ui.ActionBar.m6.Z0.getIntrinsicWidth();
                    int measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.m6.Z0.getIntrinsicHeight()) >> 1;
                    canvas.save();
                    float f11 = this.Q;
                    canvas.scale(f11, f11, (org.telegram.ui.ActionBar.m6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth, (org.telegram.ui.ActionBar.m6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight);
                    Drawable drawable = org.telegram.ui.ActionBar.m6.Z0;
                    drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, org.telegram.ui.ActionBar.m6.Z0.getIntrinsicHeight() + measuredHeight);
                    org.telegram.ui.ActionBar.m6.Z0.draw(canvas);
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
            int measuredWidth2 = (getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f)) - org.telegram.ui.ActionBar.m6.Z0.getIntrinsicWidth();
            int measuredHeight2 = (getMeasuredHeight() - org.telegram.ui.ActionBar.m6.Z0.getIntrinsicHeight()) >> 1;
            canvas.save();
            float f112 = this.Q;
            canvas.scale(f112, f112, (org.telegram.ui.ActionBar.m6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth2, (org.telegram.ui.ActionBar.m6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight2);
            Drawable drawable2 = org.telegram.ui.ActionBar.m6.Z0;
            drawable2.setBounds(measuredWidth2, measuredHeight2, drawable2.getIntrinsicWidth() + measuredWidth2, org.telegram.ui.ActionBar.m6.Z0.getIntrinsicHeight() + measuredHeight2);
            org.telegram.ui.ActionBar.m6.Z0.draw(canvas);
            canvas.restore();
        }
    }

    public final void e() {
        String E;
        gj gjVar = this.F;
        if (gjVar == null || gjVar.F0() == null) {
            return;
        }
        gj gjVar2 = this.F;
        long j3 = gjVar2.k.date * 1000;
        long j10 = this.O;
        if (j10 == 0) {
            E = org.telegram.messenger.g0.i0(gjVar2.F0().size, false, false);
        } else {
            Locale locale = Locale.ENGLISH;
            E = a8.p0.E(org.telegram.messenger.g0.i0(j10, false, false), " / ", org.telegram.messenger.g0.i0(this.F.F0().size, false, false));
        }
        int i7 = this.I;
        org.telegram.ui.Components.x5 x5Var = this.e;
        if (i7 == 2) {
            x5Var.setText(new SpannableStringBuilder().append((CharSequence) E).append(' ').append((CharSequence) this.J).append(' ').append(c00.d(this.F, true, 2, x5Var.getPaint())));
            this.r.setText(hd.f1(this.F.k.date));
            return;
        }
        x5Var.setText(E + ", " + hd.a0("formatDateAtTime", null, 2131742517, hd.E0().C0().format(new Date(j3)), hd.E0().p0().format(new Date(j3))));
    }

    public final void f(boolean z10) {
        if (z10) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new Fade().setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) nr.f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        gj gjVar = this.F;
        int i7 = this.y;
        rh0 rh0Var = this.f;
        x70 x70Var = this.h;
        org.telegram.ui.Components.x5 x5Var = this.e;
        if (gjVar == null || gjVar.k.media == null) {
            this.G = false;
            this.H = true;
            x70Var.setVisibility(4);
            x70Var.a(false, 0.0f);
            rh0Var.setVisibility(4);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) x5Var.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.leftMargin = org.telegram.messenger.g0.L(hd.a0 ? 8.0f : 72.0f);
                layoutParams.rightMargin = org.telegram.messenger.g0.L(hd.a0 ? 72.0f : 8.0f);
                x5Var.requestLayout();
            }
            org.telegram.messenger.a6.q(i7).v(this);
            return;
        }
        this.H = false;
        if (gjVar.y0 || gjVar.z0 || !this.w) {
            rh0Var.setVisibility(4);
            x70Var.setVisibility(4);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) x5Var.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.leftMargin = org.telegram.messenger.g0.L(hd.a0 ? 8.0f : 72.0f);
                layoutParams2.rightMargin = org.telegram.messenger.g0.L(hd.a0 ? 72.0f : 8.0f);
                x5Var.requestLayout();
            }
            this.G = false;
            this.H = true;
            org.telegram.messenger.a6.q(i7).v(this);
            return;
        }
        String r10 = org.telegram.messenger.w7.r(null, gjVar.F0());
        org.telegram.messenger.a6.q(i7).a(r10, this.F, this);
        this.G = org.telegram.messenger.w7.G(i7).S(r10);
        rh0Var.setVisibility(0);
        int i10 = this.G ? 15 : 0;
        oh0 oh0Var = this.L;
        oh0Var.P(i10);
        oh0Var.h = true;
        if (z10) {
            rh0Var.d();
        } else {
            oh0Var.M(this.G ? 15 : 0);
            rh0Var.invalidate();
        }
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) x5Var.getLayoutParams();
        if (layoutParams3 != null) {
            layoutParams3.leftMargin = org.telegram.messenger.g0.L(hd.a0 ? 8.0f : 86.0f);
            layoutParams3.rightMargin = org.telegram.messenger.g0.L(hd.a0 ? 86.0f : 8.0f);
            x5Var.requestLayout();
        }
        if (!this.G) {
            x70Var.setVisibility(4);
            return;
        }
        x70Var.setVisibility(0);
        Float w10 = fc.D().w(r10);
        if (w10 == null) {
            w10 = Float.valueOf(0.0f);
        }
        x70Var.a(false, w10.floatValue());
    }

    public org.telegram.ui.Components.q9 getImageView() {
        return this.b;
    }

    public gj getMessage() {
        return this.F;
    }

    @Override // org.telegram.messenger.y5
    public int getObserverTag() {
        return this.E;
    }

    @Override // org.telegram.messenger.y5
    public final void i(long j3, long j10) {
        x70 x70Var = this.h;
        if (x70Var.getVisibility() != 0) {
            f(true);
        }
        this.O = j3;
        e();
        x70Var.a(true, Math.min(1.0f, j3 / j10));
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
        org.telegram.messenger.a6.q(this.y).v(this);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        op opVar = this.n;
        if (opVar.a.q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(opVar.a.q);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.I != 1) {
            TextView textView = this.c;
            int lineCount = textView.getLineCount();
            TextView textView2 = this.s;
            if (lineCount > 1 || (textView2 != null && textView2.getVisibility() == 0)) {
                int measuredHeight = textView.getMeasuredHeight() - org.telegram.messenger.g0.L(22.0f);
                if (textView2 != null && textView2.getVisibility() == 0) {
                    textView2.layout(textView2.getLeft(), textView2.getTop() + measuredHeight, textView2.getRight(), textView2.getBottom() + measuredHeight);
                    measuredHeight = org.telegram.messenger.f3.C(3.0f, textView2.getMeasuredHeight(), measuredHeight);
                }
                org.telegram.ui.Components.x5 x5Var = this.e;
                x5Var.layout(x5Var.getLeft(), x5Var.getTop() + measuredHeight, x5Var.getRight(), x5Var.getBottom() + measuredHeight);
                rh0 rh0Var = this.f;
                rh0Var.layout(rh0Var.getLeft(), rh0Var.getTop() + measuredHeight, rh0Var.getRight(), rh0Var.getBottom() + measuredHeight);
                x70 x70Var = this.h;
                x70Var.layout(x70Var.getLeft(), (getMeasuredHeight() - x70Var.getMeasuredHeight()) - (this.x ? 1 : 0), x70Var.getRight(), getMeasuredHeight() - (this.x ? 1 : 0));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        TextView textView;
        int i11 = this.I;
        if (i11 == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.x ? 1 : 0), TLObject.FLAG_30));
            return;
        }
        if (i11 == 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), TLObject.FLAG_30));
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), TLObject.FLAG_30));
        int measuredHeight = this.c.getMeasuredHeight() + org.telegram.messenger.g0.L(34.0f) + (this.x ? 1 : 0);
        if (this.K != null && (textView = this.s) != null && this.F.r2()) {
            this.R = true;
            textView.setText(org.telegram.messenger.g0.Q(this.K, (String) this.F.a2.get(0), textView.getMeasuredWidth(), textView.getPaint()));
            this.R = false;
            measuredHeight = org.telegram.messenger.f3.C(3.0f, textView.getMeasuredHeight(), measuredHeight);
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

    public void setGlobalGradientView(yz yzVar) {
        this.N = yzVar;
    }

    public void setPhoto(String str) {
        boolean endsWith = str.endsWith("mp4");
        fi.t3 t3Var = this.b;
        if (endsWith) {
            t3Var.h("vthumb://0:".concat(str), null, null);
            t3Var.setVisibility(0);
        } else if (!str.endsWith(".jpg") && !str.endsWith(".jpeg") && !str.endsWith(".png") && !str.endsWith(".gif")) {
            t3Var.setVisibility(8);
        } else {
            t3Var.h("thumb://0:".concat(str), null, null);
            t3Var.setVisibility(0);
        }
    }

    public void setPhotoEntry(ff ffVar) {
        String str = ffVar.c;
        long j3 = ffVar.H;
        int i7 = ffVar.G;
        int i10 = ffVar.F;
        int i11 = ffVar.C;
        String str2 = ffVar.I;
        fi.t3 t3Var = this.b;
        if (str != null) {
            t3Var.h(str, null, org.telegram.ui.ActionBar.m6.R4);
            str2 = ffVar.c;
        } else if (str2 == null) {
            t3Var.setImageDrawable(org.telegram.ui.ActionBar.m6.R4);
            str2 = "";
        } else if (ffVar.b) {
            t3Var.r();
            t3Var.h("vthumb://" + i11 + ":" + str2, null, org.telegram.ui.ActionBar.m6.R4);
        } else {
            t3Var.s(ffVar.J, ffVar.K, true);
            t3Var.h("thumb://" + i11 + ":" + str2, null, org.telegram.ui.ActionBar.m6.R4);
        }
        File file = new File(str2);
        this.c.setText(file.getName());
        org.telegram.messenger.w7.D(file);
        this.d.setVisibility(8);
        StringBuilder sb2 = new StringBuilder();
        if (i10 != 0 && i7 != 0) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            Locale locale = Locale.US;
            sb2.append(i10 + "x" + i7);
        }
        if (ffVar.b) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(org.telegram.messenger.g0.g0(ffVar.E, false, false));
        }
        if (j3 != 0) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(org.telegram.messenger.g0.i0(j3, false, false));
        }
        if (sb2.length() > 0) {
            sb2.append(", ");
        }
        sb2.append(hd.E0().z0().format(ffVar.D));
        this.e.setText(sb2);
        this.a.setVisibility(8);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            this.h.setProgressColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.zi, this.M));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // org.telegram.messenger.y5
    public final void o(long j3, long j10) {
    }
}
