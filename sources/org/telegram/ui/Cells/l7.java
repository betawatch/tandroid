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
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.ef;
import org.telegram.messenger.hc;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qs;
import org.telegram.ui.Components.zz;
import org.telegram.ui.z00;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l7 extends FrameLayout implements org.telegram.ui.ActionBar.k6, org.telegram.messenger.z5 {
    public final int D;
    public jj E;
    public boolean F;
    public boolean G;
    public final int H;
    public final SpannableStringBuilder I;
    public CharSequence J;
    public final bi0 K;
    public final org.telegram.ui.ActionBar.p6 L;
    public zz M;
    public long N;
    public boolean O;
    public float P;
    public boolean Q;
    public float R;
    public final ImageView a;
    public final ag.d2 b;
    public final TextView c;
    public final TextView d;
    public final org.telegram.ui.Components.n5 e;
    public final ei0 f;
    public final a80 h;
    public final ep n;
    public final TextView r;
    public final TextView s;
    public boolean w;
    public boolean x;
    public final int y;

    public l7(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        float f7;
        int i11 = 1;
        this.w = true;
        int i12 = d20.s0;
        this.y = i12;
        this.R = 1.0f;
        this.L = p6Var;
        this.H = i10;
        this.D = org.telegram.messenger.b6.q(i12).k();
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        if (i10 == 1) {
            boolean z10 = cd.X;
            addView(imageView, w7.b6.d(42, 42.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 15.0f, 12.0f, z10 ? 15.0f : 0.0f, 0.0f));
        } else {
            boolean z11 = cd.X;
            addView(imageView, w7.b6.d(40, 40.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 12.0f, 8.0f, z11 ? 12.0f : 0.0f, 0.0f));
        }
        TextView textView = new TextView(context);
        this.d = textView;
        org.telegram.messenger.m5.m(textView, org.telegram.ui.ActionBar.t6.pj, p6Var, 1, 14.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setImportantForAccessibility(2);
        if (i10 == 1) {
            boolean z12 = cd.X;
            addView(textView, w7.b6.d(32, -2.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 20.0f, 28.0f, z12 ? 20.0f : 0.0f, 0.0f));
        } else {
            boolean z13 = cd.X;
            addView(textView, w7.b6.d(32, -2.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 22.0f, z13 ? 16.0f : 0.0f, 0.0f));
        }
        ag.d2 d2Var = new ag.d2(this, context, i11);
        this.b = d2Var;
        d2Var.setRoundRadius(org.telegram.messenger.i0.L(4.0f));
        if (i10 == 1) {
            boolean z14 = cd.X;
            addView(d2Var, w7.b6.d(42, 42.0f, (z14 ? 5 : 3) | 48, z14 ? 0.0f : 16.0f, 12.0f, z14 ? 16.0f : 0.0f, 0.0f));
        } else {
            boolean z15 = cd.X;
            addView(d2Var, w7.b6.d(40, 40.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : 12.0f, 8.0f, z15 ? 12.0f : 0.0f, 0.0f));
        }
        TextView textView2 = new TextView(context);
        this.c = textView2;
        int i13 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.messenger.m5.m(textView2, i13, p6Var, 1, 16.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setGravity((cd.X ? 5 : 3) | 16);
        if (i10 == 1) {
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            boolean z16 = cd.X;
            addView(textView2, w7.b6.d(-1, -2.0f, (z16 ? 5 : 3) | 48, z16 ? 8.0f : 72.0f, 9.0f, z16 ? 72.0f : 8.0f, 0.0f));
            f7 = 14.0f;
        } else if (i10 == 2) {
            LinearLayout f10 = org.telegram.messenger.m5.f(context, 0);
            boolean z17 = cd.X;
            addView(f10, w7.b6.d(-1, -2.0f, (z17 ? 5 : 3) | 48, z17 ? 16.0f : 72.0f, 5.0f, z17 ? 72.0f : 16.0f, 0.0f));
            TextView textView3 = new TextView(context);
            this.r = textView3;
            org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.A6, p6Var);
            textView3.setTextSize(1, 14.0f);
            f7 = 14.0f;
            if (cd.X) {
                f10.addView(textView3, w7.b6.l(0.0f, -2, -2));
                f10.addView(textView2, w7.b6.m(1.0f, -2, -2, 0, 4, 0));
            } else {
                f10.addView(textView2, w7.b6.l(1.0f, -2, -2));
                f10.addView(textView3, w7.b6.m(0.0f, -2, -2, 4, 0, 0));
            }
            textView2.setMaxLines(2);
            TextView textView4 = new TextView(context);
            this.s = textView4;
            org.telegram.ui.ActionBar.a7.V(textView4, i13, p6Var);
            textView4.setLines(1);
            textView4.setMaxLines(1);
            textView4.setSingleLine(true);
            textView4.setEllipsize(truncateAt);
            textView4.setGravity((cd.X ? 5 : 3) | 16);
            textView4.setTextSize(1, 13.0f);
            boolean z18 = cd.X;
            addView(textView4, w7.b6.d(-1, -2.0f, (z18 ? 5 : 3) | 48, z18 ? 8.0f : 72.0f, 30.0f, z18 ? 72.0f : 8.0f, 0.0f));
            textView4.setVisibility(8);
        } else {
            f7 = 14.0f;
            textView2.setMaxLines(1);
            boolean z19 = cd.X;
            addView(textView2, w7.b6.d(-1, -2.0f, (z19 ? 5 : 3) | 48, z19 ? 8.0f : 72.0f, 5.0f, z19 ? 72.0f : 8.0f, 0.0f));
        }
        bi0 bi0Var = new bi0(R.raw.download_arrow, org.telegram.messenger.i0.L(f7), org.telegram.messenger.i0.L(f7), true, null);
        this.K = bi0Var;
        ei0 ei0Var = new ei0(context);
        this.f = ei0Var;
        ei0Var.setAnimation(bi0Var);
        ei0Var.setVisibility(4);
        int i14 = org.telegram.ui.ActionBar.t6.wi;
        org.telegram.ui.ActionBar.a7.t(ei0Var, i14, p6Var, PorterDuff.Mode.SRC_IN);
        if (i10 == 1) {
            boolean z20 = cd.X;
            addView(ei0Var, w7.b6.d(14, 14.0f, (z20 ? 5 : 3) | 48, z20 ? 8.0f : 70.0f, 37.0f, z20 ? 72.0f : 8.0f, 0.0f));
        } else {
            boolean z21 = cd.X;
            addView(ei0Var, w7.b6.d(14, 14.0f, (z21 ? 5 : 3) | 48, z21 ? 8.0f : 70.0f, 33.0f, z21 ? 72.0f : 8.0f, 0.0f));
        }
        org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(context);
        this.e = n5Var;
        org.telegram.ui.ActionBar.a7.V(n5Var, org.telegram.ui.ActionBar.t6.A6, p6Var);
        n5Var.setLines(1);
        n5Var.setMaxLines(1);
        n5Var.setSingleLine(true);
        n5Var.setEllipsize(truncateAt);
        n5Var.setGravity((cd.X ? 5 : 3) | 16);
        zs.i(n5Var);
        if (i10 == 1) {
            n5Var.setTextSize(1, 13.0f);
            boolean z22 = cd.X;
            addView(n5Var, w7.b6.d(-1, -2.0f, (z22 ? 5 : 3) | 48, z22 ? 8.0f : 72.0f, 34.0f, z22 ? 72.0f : 8.0f, 0.0f));
        } else {
            n5Var.setTextSize(1, 13.0f);
            boolean z23 = cd.X;
            addView(n5Var, w7.b6.d(-1, -2.0f, (z23 ? 5 : 3) | 48, z23 ? 8.0f : 72.0f, 30.0f, z23 ? 72.0f : 8.0f, 0.0f));
        }
        a80 a80Var = new a80(context);
        this.h = a80Var;
        a80Var.setProgressColor(org.telegram.ui.ActionBar.t6.w0(i14, p6Var));
        boolean z24 = cd.X;
        addView(a80Var, w7.b6.d(-1, 2.0f, (z24 ? 5 : 3) | 48, z24 ? 0.0f : 72.0f, 54.0f, z24 ? 72.0f : 0.0f, 0.0f));
        ep epVar = new ep(21, context, p6Var);
        this.n = epVar;
        epVar.setVisibility(4);
        epVar.b(-1, org.telegram.ui.ActionBar.t6.d6, org.telegram.ui.ActionBar.t6.k7);
        epVar.setDrawUnchecked(false);
        epVar.setDrawBackgroundAsArc(2);
        if (i10 == 1) {
            boolean z25 = cd.X;
            addView(epVar, w7.b6.d(24, 24.0f, (z25 ? 5 : 3) | 48, z25 ? 0.0f : 38.0f, 36.0f, z25 ? 38.0f : 0.0f, 0.0f));
        } else {
            boolean z26 = cd.X;
            addView(epVar, w7.b6.d(24, 24.0f, (z26 ? 5 : 3) | 48, z26 ? 0.0f : 33.0f, 28.0f, z26 ? 33.0f : 0.0f, 0.0f));
        }
        if (i10 == 2) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.I = spannableStringBuilder;
            spannableStringBuilder.setSpan(new qs(), 0, 1, 0);
        }
    }

    @Override // org.telegram.messenger.z5
    public final void C(boolean z10) {
        f(true);
        this.N = 0L;
        e();
    }

    @Override // org.telegram.messenger.z5
    public final void M(String str) {
        this.h.a(true, 1.0f);
        f(true);
        this.N = 0L;
        e();
    }

    public final void a(Canvas canvas) {
        if (this.x) {
            canvas.drawLine(org.telegram.messenger.i0.L(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.t6.W0("paintDivider", this.L));
        }
    }

    public final void b(boolean z10, boolean z11) {
        ep epVar = this.n;
        if (epVar.getVisibility() != 0) {
            epVar.setVisibility(0);
        }
        epVar.a(z10, z11);
    }

    public final void c(jj jjVar, boolean z10) {
        String str;
        String str2;
        String str3;
        String str4;
        jj jjVar2 = this.E;
        boolean z11 = (jjVar2 == null || jjVar == null || jjVar2.f1() == jjVar.f1()) ? false : true;
        this.x = z10;
        this.E = jjVar;
        this.G = false;
        this.F = false;
        if (!z11) {
            this.N = 0L;
        }
        TLRPC.Document F0 = jjVar.F0();
        TextView textView = this.s;
        TextView textView2 = this.c;
        ImageView imageView = this.a;
        TextView textView3 = this.d;
        ag.d2 d2Var = this.b;
        if (F0 != null) {
            if (jjVar.I3()) {
                str = null;
                for (int i10 = 0; i10 < F0.attributes.size(); i10++) {
                    TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i10);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && (((str3 = documentAttribute.performer) != null && str3.length() != 0) || ((str4 = documentAttribute.title) != null && str4.length() != 0))) {
                        str = jjVar.x1(true) + " - " + jjVar.z1(true);
                    }
                }
            } else {
                str = null;
            }
            String B = (jj.L4(jjVar.k) || (jjVar.k.media instanceof TLRPC.TL_messageMediaPhoto) || jj.s3(F0, false)) ? null : org.telegram.messenger.b8.B(F0);
            if (TextUtils.isEmpty(B) && (str2 = F0.mime_type) != null) {
                B = str2.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND) ? jj.s3(F0, false) ? cd.L0(2131753971, null) : cd.L0(2131753933, null) : F0.mime_type.startsWith("image") ? jj.s3(F0, false) ? cd.L0(2131753971, null) : cd.L0(2131753948, null) : F0.mime_type.startsWith(MediaStreamTrack.AUDIO_TRACK_KIND) ? cd.L0(2131753982, null) : cd.L0(2131753975, null);
            }
            String str5 = str == null ? B : str;
            ArrayList arrayList = jjVar.Y1;
            org.telegram.ui.ActionBar.p6 p6Var = this.L;
            CharSequence x12 = org.telegram.messenger.i0.x1(str5, arrayList, p6Var);
            if (x12 != null) {
                textView2.setText(x12);
            } else {
                textView2.setText(str5);
            }
            imageView.setVisibility(0);
            textView3.setVisibility(0);
            imageView.setImageResource(org.telegram.messenger.i0.m1(B, false));
            int lastIndexOf = B.lastIndexOf(46);
            textView3.setText(lastIndexOf != -1 ? B.substring(lastIndexOf + 1).toLowerCase() : "");
            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(F0.thumbs, zs.r5, false, null, false);
            TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(F0.thumbs, 40, false, null, false);
            if (w10 == w9) {
                w9 = null;
            }
            if ((w10 instanceof TLRPC.TL_photoSizeEmpty) || w10 == null) {
                d2Var.setVisibility(4);
                d2Var.setImageBitmap(null);
                textView3.setAlpha(1.0f);
                imageView.setAlpha(1.0f);
            } else {
                d2Var.getImageReceiver().F0 = w9 == null;
                d2Var.getImageReceiver().G0 = w9 == null;
                d2Var.setVisibility(0);
                if (jjVar.G1 != null) {
                    d2Var.o(ic.c(w9, F0), "40_40", null, null, jjVar.G1, null, 1, jjVar);
                } else {
                    d2Var.g(1, 0L, jjVar, "40_40", "40_40_b", null, ic.c(w9, F0), ic.c(w10, F0));
                }
            }
            e();
            if (jjVar.s2() && !TextUtils.isEmpty(this.E.k.message)) {
                CharSequence x13 = org.telegram.messenger.i0.x1(this.E.k.message.replace("\n", " ").replaceAll(" +", " ").trim(), this.E.Y1, p6Var);
                this.J = x13;
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
            d2Var.setVisibility(4);
            d2Var.setImageBitmap(null);
            this.J = null;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
        setWillNotDraw(!this.x);
        this.h.a(false, 0.0f);
        f(z11);
    }

    public final void d(String str, String str2, String str3, String str4, int i10, boolean z10) {
        int i11;
        int i12;
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
        if (i10 == 0) {
            imageView.setImageResource(org.telegram.messenger.i0.m1(str, false));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        int i13 = this.H;
        ag.d2 d2Var = this.b;
        if (str4 == null && i10 == 0) {
            textView.setAlpha(1.0f);
            imageView.setAlpha(1.0f);
            if (i13 != 3) {
                d2Var.setImageBitmap(null);
                d2Var.setVisibility(4);
            }
        } else {
            if (str4 == null) {
                eq N = org.telegram.ui.ActionBar.t6.N(org.telegram.messenger.i0.L(42.0f), i10);
                if (i10 == R.drawable.files_storage) {
                    i11 = org.telegram.ui.ActionBar.t6.na;
                    i12 = org.telegram.ui.ActionBar.t6.ia;
                } else if (i10 == R.drawable.files_gallery) {
                    i11 = org.telegram.ui.ActionBar.t6.la;
                    i12 = org.telegram.ui.ActionBar.t6.ia;
                } else if (i10 == R.drawable.files_music) {
                    i11 = org.telegram.ui.ActionBar.t6.ka;
                    i12 = org.telegram.ui.ActionBar.t6.ia;
                } else if (i10 == R.drawable.files_internal) {
                    i11 = org.telegram.ui.ActionBar.t6.ja;
                    i12 = org.telegram.ui.ActionBar.t6.ia;
                } else {
                    i11 = org.telegram.ui.ActionBar.t6.oj;
                    i12 = org.telegram.ui.ActionBar.t6.nj;
                }
                org.telegram.ui.ActionBar.p6 p6Var = this.L;
                org.telegram.ui.ActionBar.t6.B1(N, org.telegram.ui.ActionBar.t6.w0(i11, p6Var), false);
                org.telegram.ui.ActionBar.t6.B1(N, org.telegram.ui.ActionBar.t6.w0(i12, p6Var), true);
                d2Var.setImageDrawable(N);
            } else if (i13 != 3) {
                d2Var.h(str4, "42_42", null);
            }
            d2Var.setVisibility(0);
        }
        setWillNotDraw(true ^ this.x);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.R == 1.0f || this.M == null) {
            super.dispatchDraw(canvas);
            a(canvas);
        } else {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.R) * 255.0f), 31);
            this.M.setViewType(3);
            this.M.updateColors();
            this.M.f();
            this.M.draw(canvas);
            canvas.restore();
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (this.R * 255.0f), 31);
            super.dispatchDraw(canvas);
            a(canvas);
            canvas.restore();
        }
        boolean z10 = this.O;
        if (z10 || this.P != 0.0f) {
            if (z10) {
                float f7 = this.P;
                if (f7 != 1.0f) {
                    this.P = f7 + 0.10666667f;
                    invalidate();
                    this.P = Utilities.i(this.P, 1.0f, 0.0f);
                    int measuredWidth = (getMeasuredWidth() - org.telegram.messenger.i0.L(12.0f)) - org.telegram.ui.ActionBar.t6.Z0.getIntrinsicWidth();
                    int measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.t6.Z0.getIntrinsicHeight()) >> 1;
                    canvas.save();
                    float f10 = this.P;
                    canvas.scale(f10, f10, (org.telegram.ui.ActionBar.t6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth, (org.telegram.ui.ActionBar.t6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight);
                    Drawable drawable = org.telegram.ui.ActionBar.t6.Z0;
                    drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, org.telegram.ui.ActionBar.t6.Z0.getIntrinsicHeight() + measuredHeight);
                    org.telegram.ui.ActionBar.t6.Z0.draw(canvas);
                    canvas.restore();
                }
            }
            if (!z10) {
                float f11 = this.P;
                if (f11 != 0.0f) {
                    this.P = f11 - 0.10666667f;
                    invalidate();
                }
            }
            this.P = Utilities.i(this.P, 1.0f, 0.0f);
            int measuredWidth2 = (getMeasuredWidth() - org.telegram.messenger.i0.L(12.0f)) - org.telegram.ui.ActionBar.t6.Z0.getIntrinsicWidth();
            int measuredHeight2 = (getMeasuredHeight() - org.telegram.ui.ActionBar.t6.Z0.getIntrinsicHeight()) >> 1;
            canvas.save();
            float f102 = this.P;
            canvas.scale(f102, f102, (org.telegram.ui.ActionBar.t6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth2, (org.telegram.ui.ActionBar.t6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight2);
            Drawable drawable2 = org.telegram.ui.ActionBar.t6.Z0;
            drawable2.setBounds(measuredWidth2, measuredHeight2, drawable2.getIntrinsicWidth() + measuredWidth2, org.telegram.ui.ActionBar.t6.Z0.getIntrinsicHeight() + measuredHeight2);
            org.telegram.ui.ActionBar.t6.Z0.draw(canvas);
            canvas.restore();
        }
    }

    public final void e() {
        String C;
        jj jjVar = this.E;
        if (jjVar == null || jjVar.F0() == null) {
            return;
        }
        jj jjVar2 = this.E;
        long j10 = jjVar2.k.date * 1000;
        long j11 = this.N;
        if (j11 == 0) {
            C = org.telegram.messenger.i0.i0(jjVar2.F0().size, false, false);
        } else {
            Locale locale = Locale.ENGLISH;
            C = a1.g.C(org.telegram.messenger.i0.i0(j11, false, false), " / ", org.telegram.messenger.i0.i0(this.E.F0().size, false, false));
        }
        int i10 = this.H;
        org.telegram.ui.Components.n5 n5Var = this.e;
        if (i10 == 2) {
            n5Var.setText(new SpannableStringBuilder().append((CharSequence) C).append(' ').append((CharSequence) this.I).append(' ').append(z00.d(this.E, true, 2, n5Var.getPaint())));
            this.r.setText(cd.a1(this.E.k.date));
            return;
        }
        n5Var.setText(C + ", " + cd.a0("formatDateAtTime", null, 2131742808, cd.D0().B0().format(new Date(j10)), cd.D0().o0().format(new Date(j10))));
    }

    public final void f(boolean z10) {
        if (z10) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new Fade().setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) gr.f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        jj jjVar = this.E;
        int i10 = this.y;
        ei0 ei0Var = this.f;
        a80 a80Var = this.h;
        org.telegram.ui.Components.n5 n5Var = this.e;
        if (jjVar == null || jjVar.k.media == null) {
            this.F = false;
            this.G = true;
            a80Var.setVisibility(4);
            a80Var.a(false, 0.0f);
            ei0Var.setVisibility(4);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) n5Var.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.leftMargin = org.telegram.messenger.i0.L(cd.X ? 8.0f : 72.0f);
                layoutParams.rightMargin = org.telegram.messenger.i0.L(cd.X ? 72.0f : 8.0f);
                n5Var.requestLayout();
            }
            org.telegram.messenger.b6.q(i10).v(this);
            return;
        }
        this.G = false;
        if (jjVar.w0 || jjVar.x0 || !this.w) {
            ei0Var.setVisibility(4);
            a80Var.setVisibility(4);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) n5Var.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.leftMargin = org.telegram.messenger.i0.L(cd.X ? 8.0f : 72.0f);
                layoutParams2.rightMargin = org.telegram.messenger.i0.L(cd.X ? 72.0f : 8.0f);
                n5Var.requestLayout();
            }
            this.F = false;
            this.G = true;
            org.telegram.messenger.b6.q(i10).v(this);
            return;
        }
        String r10 = org.telegram.messenger.b8.r(null, jjVar.F0());
        org.telegram.messenger.b6.q(i10).a(r10, this.E, this);
        this.F = org.telegram.messenger.b8.G(i10).T(r10);
        ei0Var.setVisibility(0);
        int i11 = this.F ? 15 : 0;
        bi0 bi0Var = this.K;
        bi0Var.P(i11);
        bi0Var.h = true;
        if (z10) {
            ei0Var.d();
        } else {
            bi0Var.M(this.F ? 15 : 0);
            ei0Var.invalidate();
        }
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) n5Var.getLayoutParams();
        if (layoutParams3 != null) {
            layoutParams3.leftMargin = org.telegram.messenger.i0.L(cd.X ? 8.0f : 86.0f);
            layoutParams3.rightMargin = org.telegram.messenger.i0.L(cd.X ? 86.0f : 8.0f);
            n5Var.requestLayout();
        }
        if (!this.F) {
            a80Var.setVisibility(4);
            return;
        }
        a80Var.setVisibility(0);
        Float w9 = hc.D().w(r10);
        if (w9 == null) {
            w9 = Float.valueOf(0.0f);
        }
        a80Var.a(false, w9.floatValue());
    }

    public org.telegram.ui.Components.g9 getImageView() {
        return this.b;
    }

    public jj getMessage() {
        return this.E;
    }

    @Override // org.telegram.messenger.z5
    public int getObserverTag() {
        return this.D;
    }

    @Override // org.telegram.messenger.z5
    public final void i(long j10, long j11) {
        a80 a80Var = this.h;
        if (a80Var.getVisibility() != 0) {
            f(true);
        }
        this.N = j10;
        e();
        a80Var.a(true, Math.min(1.0f, j10 / j11));
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
        org.telegram.messenger.b6.q(this.y).v(this);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ep epVar = this.n;
        if (epVar.a.q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(epVar.a.q);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.H != 1) {
            TextView textView = this.c;
            int lineCount = textView.getLineCount();
            TextView textView2 = this.s;
            if (lineCount > 1 || (textView2 != null && textView2.getVisibility() == 0)) {
                int measuredHeight = textView.getMeasuredHeight() - org.telegram.messenger.i0.L(22.0f);
                if (textView2 != null && textView2.getVisibility() == 0) {
                    textView2.layout(textView2.getLeft(), textView2.getTop() + measuredHeight, textView2.getRight(), textView2.getBottom() + measuredHeight);
                    measuredHeight = org.telegram.messenger.m5.C(3.0f, textView2.getMeasuredHeight(), measuredHeight);
                }
                org.telegram.ui.Components.n5 n5Var = this.e;
                n5Var.layout(n5Var.getLeft(), n5Var.getTop() + measuredHeight, n5Var.getRight(), n5Var.getBottom() + measuredHeight);
                ei0 ei0Var = this.f;
                ei0Var.layout(ei0Var.getLeft(), ei0Var.getTop() + measuredHeight, ei0Var.getRight(), ei0Var.getBottom() + measuredHeight);
                a80 a80Var = this.h;
                a80Var.layout(a80Var.getLeft(), (getMeasuredHeight() - a80Var.getMeasuredHeight()) - (this.x ? 1 : 0), a80Var.getRight(), getMeasuredHeight() - (this.x ? 1 : 0));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        TextView textView;
        int i12 = this.H;
        if (i12 == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(64.0f) + (this.x ? 1 : 0), TLObject.FLAG_30));
            return;
        }
        if (i12 == 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(56.0f), TLObject.FLAG_30));
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(56.0f), TLObject.FLAG_30));
        int measuredHeight = this.c.getMeasuredHeight() + org.telegram.messenger.i0.L(34.0f) + (this.x ? 1 : 0);
        if (this.J != null && (textView = this.s) != null && this.E.s2()) {
            this.Q = true;
            textView.setText(org.telegram.messenger.i0.Q(this.J, (String) this.E.Y1.get(0), textView.getMeasuredWidth(), textView.getPaint()));
            this.Q = false;
            measuredHeight = org.telegram.messenger.m5.C(3.0f, textView.getMeasuredHeight(), measuredHeight);
        }
        setMeasuredDimension(getMeasuredWidth(), measuredHeight);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.Q) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawDownloadIcon(boolean z10) {
        this.w = z10;
    }

    public void setEnterAnimationAlpha(float f7) {
        if (this.R != f7) {
            this.R = f7;
            invalidate();
        }
    }

    public void setGlobalGradientView(zz zzVar) {
        this.M = zzVar;
    }

    public void setPhoto(String str) {
        boolean endsWith = str.endsWith("mp4");
        ag.d2 d2Var = this.b;
        if (endsWith) {
            d2Var.h("vthumb://0:".concat(str), null, null);
            d2Var.setVisibility(0);
        } else if (!str.endsWith(".jpg") && !str.endsWith(".jpeg") && !str.endsWith(".png") && !str.endsWith(".gif")) {
            d2Var.setVisibility(8);
        } else {
            d2Var.h("thumb://0:".concat(str), null, null);
            d2Var.setVisibility(0);
        }
    }

    public void setPhotoEntry(ef efVar) {
        String str = efVar.c;
        long j10 = efVar.H;
        int i10 = efVar.G;
        int i11 = efVar.F;
        int i12 = efVar.C;
        String str2 = efVar.I;
        ag.d2 d2Var = this.b;
        if (str != null) {
            d2Var.h(str, null, org.telegram.ui.ActionBar.t6.R4);
            str2 = efVar.c;
        } else if (str2 == null) {
            d2Var.setImageDrawable(org.telegram.ui.ActionBar.t6.R4);
            str2 = "";
        } else if (efVar.b) {
            d2Var.r();
            d2Var.h("vthumb://" + i12 + ":" + str2, null, org.telegram.ui.ActionBar.t6.R4);
        } else {
            d2Var.s(efVar.J, efVar.K, true);
            d2Var.h("thumb://" + i12 + ":" + str2, null, org.telegram.ui.ActionBar.t6.R4);
        }
        File file = new File(str2);
        this.c.setText(file.getName());
        org.telegram.messenger.b8.D(file);
        this.d.setVisibility(8);
        StringBuilder sb2 = new StringBuilder();
        if (i11 != 0 && i10 != 0) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            Locale locale = Locale.US;
            sb2.append(i11 + "x" + i10);
        }
        if (efVar.b) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(org.telegram.messenger.i0.g0(efVar.E, false, false));
        }
        if (j10 != 0) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(org.telegram.messenger.i0.i0(j10, false, false));
        }
        if (sb2.length() > 0) {
            sb2.append(", ");
        }
        sb2.append(cd.D0().y0().format(efVar.D));
        this.e.setText(sb2);
        this.a.setVisibility(8);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            this.h.setProgressColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.wi, this.L));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // org.telegram.messenger.z5
    public final void n(long j10, long j11) {
    }
}
