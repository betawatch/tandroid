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
import org.telegram.messenger.gc;
import org.telegram.messenger.gf;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.fs;
import org.telegram.ui.Components.h70;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.yz;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class h7 extends FrameLayout implements org.telegram.ui.ActionBar.a6, org.telegram.messenger.x5 {
    public final int D;
    public ij E;
    public boolean F;
    public boolean G;
    public final int H;
    public final SpannableStringBuilder I;
    public CharSequence J;
    public final zg0 K;
    public final org.telegram.ui.ActionBar.f6 L;
    public mz M;
    public long N;
    public boolean O;
    public float P;
    public boolean Q;
    public float R;
    public final ImageView a;
    public final di.c4 b;
    public final TextView c;
    public final TextView d;
    public final org.telegram.ui.Components.q5 e;
    public final ch0 f;
    public final h70 h;
    public final wo n;
    public final TextView r;
    public final TextView s;
    public boolean w;
    public boolean x;
    public final int y;

    public h7(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        float f10;
        this.w = true;
        int i10 = p10.s0;
        this.y = i10;
        this.R = 1.0f;
        this.L = f6Var;
        this.H = i7;
        this.D = org.telegram.messenger.z5.q(i10).k();
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        if (i7 == 1) {
            boolean z9 = id.a0;
            addView(imageView, c8.ha.d(42, 42.0f, (z9 ? 5 : 3) | 48, z9 ? 0.0f : 15.0f, 12.0f, z9 ? 15.0f : 0.0f, 0.0f));
        } else {
            boolean z10 = id.a0;
            addView(imageView, c8.ha.d(40, 40.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 12.0f, 8.0f, z10 ? 12.0f : 0.0f, 0.0f));
        }
        TextView textView = new TextView(context);
        this.d = textView;
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.pj, f6Var, 1, 14.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        int i11 = 2;
        textView.setImportantForAccessibility(2);
        if (i7 == 1) {
            boolean z11 = id.a0;
            addView(textView, c8.ha.d(32, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 20.0f, 28.0f, z11 ? 20.0f : 0.0f, 0.0f));
        } else {
            boolean z12 = id.a0;
            addView(textView, c8.ha.d(32, -2.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 16.0f, 22.0f, z12 ? 16.0f : 0.0f, 0.0f));
        }
        di.c4 c4Var = new di.c4(i11, context, this);
        this.b = c4Var;
        c4Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
        if (i7 == 1) {
            boolean z13 = id.a0;
            addView(c4Var, c8.ha.d(42, 42.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 12.0f, z13 ? 16.0f : 0.0f, 0.0f));
        } else {
            boolean z14 = id.a0;
            addView(c4Var, c8.ha.d(40, 40.0f, (z14 ? 5 : 3) | 48, z14 ? 0.0f : 12.0f, 8.0f, z14 ? 12.0f : 0.0f, 0.0f));
        }
        TextView textView2 = new TextView(context);
        this.c = textView2;
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.messenger.k5.n(textView2, i12, f6Var, 1, 16.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setGravity((id.a0 ? 5 : 3) | 16);
        if (i7 == 1) {
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            boolean z15 = id.a0;
            addView(textView2, c8.ha.d(-1, -2.0f, (z15 ? 5 : 3) | 48, z15 ? 8.0f : 72.0f, 9.0f, z15 ? 72.0f : 8.0f, 0.0f));
            f10 = 14.0f;
        } else if (i7 == 2) {
            LinearLayout f11 = org.telegram.messenger.k5.f(context, 0);
            boolean z16 = id.a0;
            addView(f11, c8.ha.d(-1, -2.0f, (z16 ? 5 : 3) | 48, z16 ? 16.0f : 72.0f, 5.0f, z16 ? 72.0f : 16.0f, 0.0f));
            TextView textView3 = new TextView(context);
            this.r = textView3;
            org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.A6, f6Var);
            textView3.setTextSize(1, 14.0f);
            f10 = 14.0f;
            if (id.a0) {
                f11.addView(textView3, c8.ha.l(0.0f, -2, -2));
                f11.addView(textView2, c8.ha.m(1.0f, -2, -2, 0, 4, 0));
            } else {
                f11.addView(textView2, c8.ha.l(1.0f, -2, -2));
                f11.addView(textView3, c8.ha.m(0.0f, -2, -2, 4, 0, 0));
            }
            textView2.setMaxLines(2);
            TextView textView4 = new TextView(context);
            this.s = textView4;
            org.telegram.ui.ActionBar.r6.V(textView4, i12, f6Var);
            textView4.setLines(1);
            textView4.setMaxLines(1);
            textView4.setSingleLine(true);
            textView4.setEllipsize(truncateAt);
            textView4.setGravity((id.a0 ? 5 : 3) | 16);
            textView4.setTextSize(1, 13.0f);
            boolean z17 = id.a0;
            addView(textView4, c8.ha.d(-1, -2.0f, (z17 ? 5 : 3) | 48, z17 ? 8.0f : 72.0f, 30.0f, z17 ? 72.0f : 8.0f, 0.0f));
            textView4.setVisibility(8);
        } else {
            f10 = 14.0f;
            textView2.setMaxLines(1);
            boolean z18 = id.a0;
            addView(textView2, c8.ha.d(-1, -2.0f, (z18 ? 5 : 3) | 48, z18 ? 8.0f : 72.0f, 5.0f, z18 ? 72.0f : 8.0f, 0.0f));
        }
        zg0 zg0Var = new zg0(R.raw.download_arrow, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), true, null);
        this.K = zg0Var;
        ch0 ch0Var = new ch0(context);
        this.f = ch0Var;
        ch0Var.setAnimation(zg0Var);
        ch0Var.setVisibility(4);
        int i13 = org.telegram.ui.ActionBar.k6.wi;
        org.telegram.ui.ActionBar.r6.t(ch0Var, i13, f6Var, PorterDuff.Mode.SRC_IN);
        if (i7 == 1) {
            boolean z19 = id.a0;
            addView(ch0Var, c8.ha.d(14, 14.0f, (z19 ? 5 : 3) | 48, z19 ? 8.0f : 70.0f, 37.0f, z19 ? 72.0f : 8.0f, 0.0f));
        } else {
            boolean z20 = id.a0;
            addView(ch0Var, c8.ha.d(14, 14.0f, (z20 ? 5 : 3) | 48, z20 ? 8.0f : 70.0f, 33.0f, z20 ? 72.0f : 8.0f, 0.0f));
        }
        org.telegram.ui.Components.q5 q5Var = new org.telegram.ui.Components.q5(context);
        this.e = q5Var;
        org.telegram.ui.ActionBar.r6.V(q5Var, org.telegram.ui.ActionBar.k6.A6, f6Var);
        q5Var.setLines(1);
        q5Var.setMaxLines(1);
        q5Var.setSingleLine(true);
        q5Var.setEllipsize(truncateAt);
        q5Var.setGravity((id.a0 ? 5 : 3) | 16);
        qs.i(q5Var);
        if (i7 == 1) {
            q5Var.setTextSize(1, 13.0f);
            boolean z21 = id.a0;
            addView(q5Var, c8.ha.d(-1, -2.0f, (z21 ? 5 : 3) | 48, z21 ? 8.0f : 72.0f, 34.0f, z21 ? 72.0f : 8.0f, 0.0f));
        } else {
            q5Var.setTextSize(1, 13.0f);
            boolean z22 = id.a0;
            addView(q5Var, c8.ha.d(-1, -2.0f, (z22 ? 5 : 3) | 48, z22 ? 8.0f : 72.0f, 30.0f, z22 ? 72.0f : 8.0f, 0.0f));
        }
        h70 h70Var = new h70(context);
        this.h = h70Var;
        h70Var.setProgressColor(org.telegram.ui.ActionBar.k6.w0(i13, f6Var));
        boolean z23 = id.a0;
        addView(h70Var, c8.ha.d(-1, 2.0f, (z23 ? 5 : 3) | 48, z23 ? 0.0f : 72.0f, 54.0f, z23 ? 72.0f : 0.0f, 0.0f));
        wo woVar = new wo(21, context, f6Var);
        this.n = woVar;
        woVar.setVisibility(4);
        woVar.b(-1, org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.k7);
        woVar.setDrawUnchecked(false);
        woVar.setDrawBackgroundAsArc(2);
        if (i7 == 1) {
            boolean z24 = id.a0;
            addView(woVar, c8.ha.d(24, 24.0f, (z24 ? 5 : 3) | 48, z24 ? 0.0f : 38.0f, 36.0f, z24 ? 38.0f : 0.0f, 0.0f));
        } else {
            boolean z25 = id.a0;
            addView(woVar, c8.ha.d(24, 24.0f, (z25 ? 5 : 3) | 48, z25 ? 0.0f : 33.0f, 28.0f, z25 ? 33.0f : 0.0f, 0.0f));
        }
        if (i7 == 2) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.I = spannableStringBuilder;
            spannableStringBuilder.setSpan(new fs(), 0, 1, 0);
        }
    }

    @Override // org.telegram.messenger.x5
    public final void C(boolean z9) {
        f(true);
        this.N = 0L;
        e();
    }

    @Override // org.telegram.messenger.x5
    public final void M(String str) {
        this.h.a(true, 1.0f);
        f(true);
        this.N = 0L;
        e();
    }

    public final void a(Canvas canvas) {
        if (this.x) {
            canvas.drawLine(org.telegram.messenger.g0.L(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.k6.W0("paintDivider", this.L));
        }
    }

    public final void b(boolean z9, boolean z10) {
        wo woVar = this.n;
        if (woVar.getVisibility() != 0) {
            woVar.setVisibility(0);
        }
        woVar.a(z9, z10);
    }

    public final void c(ij ijVar, boolean z9) {
        String str;
        String str2;
        String str3;
        String str4;
        ij ijVar2 = this.E;
        boolean z10 = (ijVar2 == null || ijVar == null || ijVar2.f1() == ijVar.f1()) ? false : true;
        this.x = z9;
        this.E = ijVar;
        this.G = false;
        this.F = false;
        if (!z10) {
            this.N = 0L;
        }
        TLRPC.Document F0 = ijVar.F0();
        TextView textView = this.s;
        TextView textView2 = this.c;
        ImageView imageView = this.a;
        TextView textView3 = this.d;
        di.c4 c4Var = this.b;
        if (F0 != null) {
            if (ijVar.J3()) {
                str = null;
                for (int i7 = 0; i7 < F0.attributes.size(); i7++) {
                    TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i7);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && (((str3 = documentAttribute.performer) != null && str3.length() != 0) || ((str4 = documentAttribute.title) != null && str4.length() != 0))) {
                        str = ijVar.x1(true) + " - " + ijVar.z1(true);
                    }
                }
            } else {
                str = null;
            }
            String B = (ij.M4(ijVar.k) || (ijVar.k.media instanceof TLRPC.TL_messageMediaPhoto) || ij.t3(F0, false)) ? null : org.telegram.messenger.w7.B(F0);
            if (TextUtils.isEmpty(B) && (str2 = F0.mime_type) != null) {
                B = str2.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND) ? ij.t3(F0, false) ? id.M0(2131753971, null) : id.M0(2131753933, null) : F0.mime_type.startsWith("image") ? ij.t3(F0, false) ? id.M0(2131753971, null) : id.M0(2131753948, null) : F0.mime_type.startsWith(MediaStreamTrack.AUDIO_TRACK_KIND) ? id.M0(2131753982, null) : id.M0(2131753975, null);
            }
            String str5 = str == null ? B : str;
            ArrayList arrayList = ijVar.Y1;
            org.telegram.ui.ActionBar.f6 f6Var = this.L;
            CharSequence x12 = org.telegram.messenger.g0.x1(str5, arrayList, f6Var);
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
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(F0.thumbs, qs.r5, false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(F0.thumbs, 40, false, null, false);
            if (w11 == w10) {
                w10 = null;
            }
            if ((w11 instanceof TLRPC.TL_photoSizeEmpty) || w11 == null) {
                c4Var.setVisibility(4);
                c4Var.setImageBitmap(null);
                textView3.setAlpha(1.0f);
                imageView.setAlpha(1.0f);
            } else {
                c4Var.getImageReceiver().F0 = w10 == null;
                c4Var.getImageReceiver().G0 = w10 == null;
                c4Var.setVisibility(0);
                if (ijVar.G1 != null) {
                    c4Var.n(hc.c(w10, F0), "40_40", null, null, ijVar.G1, null, 1, ijVar);
                } else {
                    c4Var.g(1, 0L, ijVar, "40_40", "40_40_b", null, hc.c(w10, F0), hc.c(w11, F0));
                }
            }
            e();
            if (ijVar.s2() && !TextUtils.isEmpty(this.E.k.message)) {
                CharSequence x13 = org.telegram.messenger.g0.x1(this.E.k.message.replace("\n", " ").replaceAll(" +", " ").trim(), this.E.Y1, f6Var);
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
            c4Var.setVisibility(4);
            c4Var.setImageBitmap(null);
            this.J = null;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
        setWillNotDraw(!this.x);
        this.h.a(false, 0.0f);
        f(z10);
    }

    public final void d(String str, String str2, String str3, String str4, int i7, boolean z9) {
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
        this.x = z9;
        ImageView imageView = this.a;
        if (i7 == 0) {
            imageView.setImageResource(org.telegram.messenger.g0.m1(str, false));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        int i12 = this.H;
        di.c4 c4Var = this.b;
        if (str4 == null && i7 == 0) {
            textView.setAlpha(1.0f);
            imageView.setAlpha(1.0f);
            if (i12 != 3) {
                c4Var.setImageBitmap(null);
                c4Var.setVisibility(4);
            }
        } else {
            if (str4 == null) {
                xp N = org.telegram.ui.ActionBar.k6.N(org.telegram.messenger.g0.L(42.0f), i7);
                if (i7 == R.drawable.files_storage) {
                    i10 = org.telegram.ui.ActionBar.k6.na;
                    i11 = org.telegram.ui.ActionBar.k6.ia;
                } else if (i7 == R.drawable.files_gallery) {
                    i10 = org.telegram.ui.ActionBar.k6.la;
                    i11 = org.telegram.ui.ActionBar.k6.ia;
                } else if (i7 == R.drawable.files_music) {
                    i10 = org.telegram.ui.ActionBar.k6.ka;
                    i11 = org.telegram.ui.ActionBar.k6.ia;
                } else if (i7 == R.drawable.files_internal) {
                    i10 = org.telegram.ui.ActionBar.k6.ja;
                    i11 = org.telegram.ui.ActionBar.k6.ia;
                } else {
                    i10 = org.telegram.ui.ActionBar.k6.oj;
                    i11 = org.telegram.ui.ActionBar.k6.nj;
                }
                org.telegram.ui.ActionBar.f6 f6Var = this.L;
                org.telegram.ui.ActionBar.k6.B1(N, org.telegram.ui.ActionBar.k6.w0(i10, f6Var), false);
                org.telegram.ui.ActionBar.k6.B1(N, org.telegram.ui.ActionBar.k6.w0(i11, f6Var), true);
                c4Var.setImageDrawable(N);
            } else if (i12 != 3) {
                c4Var.h(str4, "42_42", null);
            }
            c4Var.setVisibility(0);
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
        boolean z9 = this.O;
        if (z9 || this.P != 0.0f) {
            if (z9) {
                float f10 = this.P;
                if (f10 != 1.0f) {
                    this.P = f10 + 0.10666667f;
                    invalidate();
                    this.P = Utilities.i(this.P, 1.0f, 0.0f);
                    int measuredWidth = (getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f)) - org.telegram.ui.ActionBar.k6.Z0.getIntrinsicWidth();
                    int measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight()) >> 1;
                    canvas.save();
                    float f11 = this.P;
                    canvas.scale(f11, f11, (org.telegram.ui.ActionBar.k6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth, (org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight);
                    Drawable drawable = org.telegram.ui.ActionBar.k6.Z0;
                    drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight() + measuredHeight);
                    org.telegram.ui.ActionBar.k6.Z0.draw(canvas);
                    canvas.restore();
                }
            }
            if (!z9) {
                float f12 = this.P;
                if (f12 != 0.0f) {
                    this.P = f12 - 0.10666667f;
                    invalidate();
                }
            }
            this.P = Utilities.i(this.P, 1.0f, 0.0f);
            int measuredWidth2 = (getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f)) - org.telegram.ui.ActionBar.k6.Z0.getIntrinsicWidth();
            int measuredHeight2 = (getMeasuredHeight() - org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight()) >> 1;
            canvas.save();
            float f112 = this.P;
            canvas.scale(f112, f112, (org.telegram.ui.ActionBar.k6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth2, (org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight2);
            Drawable drawable2 = org.telegram.ui.ActionBar.k6.Z0;
            drawable2.setBounds(measuredWidth2, measuredHeight2, drawable2.getIntrinsicWidth() + measuredWidth2, org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight() + measuredHeight2);
            org.telegram.ui.ActionBar.k6.Z0.draw(canvas);
            canvas.restore();
        }
    }

    public final void e() {
        String D;
        ij ijVar = this.E;
        if (ijVar == null || ijVar.F0() == null) {
            return;
        }
        ij ijVar2 = this.E;
        long j3 = ijVar2.k.date * 1000;
        long j10 = this.N;
        if (j10 == 0) {
            D = org.telegram.messenger.g0.i0(ijVar2.F0().size, false, false);
        } else {
            Locale locale = Locale.ENGLISH;
            D = a8.p0.D(org.telegram.messenger.g0.i0(j10, false, false), " / ", org.telegram.messenger.g0.i0(this.E.F0().size, false, false));
        }
        int i7 = this.H;
        org.telegram.ui.Components.q5 q5Var = this.e;
        if (i7 == 2) {
            q5Var.setText(new SpannableStringBuilder().append((CharSequence) D).append(' ').append((CharSequence) this.I).append(' ').append(yz.d(this.E, true, 2, q5Var.getPaint())));
            this.r.setText(id.e1(this.E.k.date));
            return;
        }
        q5Var.setText(D + ", " + id.a0("formatDateAtTime", null, 2131742786, id.E0().C0().format(new Date(j3)), id.E0().p0().format(new Date(j3))));
    }

    public final void f(boolean z9) {
        if (z9) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new Fade().setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) xq.f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        ij ijVar = this.E;
        int i7 = this.y;
        ch0 ch0Var = this.f;
        h70 h70Var = this.h;
        org.telegram.ui.Components.q5 q5Var = this.e;
        if (ijVar == null || ijVar.k.media == null) {
            this.F = false;
            this.G = true;
            h70Var.setVisibility(4);
            h70Var.a(false, 0.0f);
            ch0Var.setVisibility(4);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) q5Var.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.leftMargin = org.telegram.messenger.g0.L(id.a0 ? 8.0f : 72.0f);
                layoutParams.rightMargin = org.telegram.messenger.g0.L(id.a0 ? 72.0f : 8.0f);
                q5Var.requestLayout();
            }
            org.telegram.messenger.z5.q(i7).v(this);
            return;
        }
        this.G = false;
        if (ijVar.w0 || ijVar.x0 || !this.w) {
            ch0Var.setVisibility(4);
            h70Var.setVisibility(4);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) q5Var.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.leftMargin = org.telegram.messenger.g0.L(id.a0 ? 8.0f : 72.0f);
                layoutParams2.rightMargin = org.telegram.messenger.g0.L(id.a0 ? 72.0f : 8.0f);
                q5Var.requestLayout();
            }
            this.F = false;
            this.G = true;
            org.telegram.messenger.z5.q(i7).v(this);
            return;
        }
        String r10 = org.telegram.messenger.w7.r(null, ijVar.F0());
        org.telegram.messenger.z5.q(i7).a(r10, this.E, this);
        this.F = org.telegram.messenger.w7.G(i7).S(r10);
        ch0Var.setVisibility(0);
        int i10 = this.F ? 15 : 0;
        zg0 zg0Var = this.K;
        zg0Var.P(i10);
        zg0Var.h = true;
        if (z9) {
            ch0Var.d();
        } else {
            zg0Var.M(this.F ? 15 : 0);
            ch0Var.invalidate();
        }
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) q5Var.getLayoutParams();
        if (layoutParams3 != null) {
            layoutParams3.leftMargin = org.telegram.messenger.g0.L(id.a0 ? 8.0f : 86.0f);
            layoutParams3.rightMargin = org.telegram.messenger.g0.L(id.a0 ? 86.0f : 8.0f);
            q5Var.requestLayout();
        }
        if (!this.F) {
            h70Var.setVisibility(4);
            return;
        }
        h70Var.setVisibility(0);
        Float w10 = gc.D().w(r10);
        if (w10 == null) {
            w10 = Float.valueOf(0.0f);
        }
        h70Var.a(false, w10.floatValue());
    }

    public org.telegram.ui.Components.l9 getImageView() {
        return this.b;
    }

    public ij getMessage() {
        return this.E;
    }

    @Override // org.telegram.messenger.x5
    public int getObserverTag() {
        return this.D;
    }

    @Override // org.telegram.messenger.x5
    public final void i(long j3, long j10) {
        h70 h70Var = this.h;
        if (h70Var.getVisibility() != 0) {
            f(true);
        }
        this.N = j3;
        e();
        h70Var.a(true, Math.min(1.0f, j3 / j10));
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
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        if (this.H != 1) {
            TextView textView = this.c;
            int lineCount = textView.getLineCount();
            TextView textView2 = this.s;
            if (lineCount > 1 || (textView2 != null && textView2.getVisibility() == 0)) {
                int measuredHeight = textView.getMeasuredHeight() - org.telegram.messenger.g0.L(22.0f);
                if (textView2 != null && textView2.getVisibility() == 0) {
                    textView2.layout(textView2.getLeft(), textView2.getTop() + measuredHeight, textView2.getRight(), textView2.getBottom() + measuredHeight);
                    measuredHeight = org.telegram.messenger.k5.C(3.0f, textView2.getMeasuredHeight(), measuredHeight);
                }
                org.telegram.ui.Components.q5 q5Var = this.e;
                q5Var.layout(q5Var.getLeft(), q5Var.getTop() + measuredHeight, q5Var.getRight(), q5Var.getBottom() + measuredHeight);
                ch0 ch0Var = this.f;
                ch0Var.layout(ch0Var.getLeft(), ch0Var.getTop() + measuredHeight, ch0Var.getRight(), ch0Var.getBottom() + measuredHeight);
                h70 h70Var = this.h;
                h70Var.layout(h70Var.getLeft(), (getMeasuredHeight() - h70Var.getMeasuredHeight()) - (this.x ? 1 : 0), h70Var.getRight(), getMeasuredHeight() - (this.x ? 1 : 0));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        TextView textView;
        int i11 = this.H;
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
        if (this.J != null && (textView = this.s) != null && this.E.s2()) {
            this.Q = true;
            textView.setText(org.telegram.messenger.g0.Q(this.J, (String) this.E.Y1.get(0), textView.getMeasuredWidth(), textView.getPaint()));
            this.Q = false;
            measuredHeight = org.telegram.messenger.k5.C(3.0f, textView.getMeasuredHeight(), measuredHeight);
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

    public void setDrawDownloadIcon(boolean z9) {
        this.w = z9;
    }

    public void setEnterAnimationAlpha(float f10) {
        if (this.R != f10) {
            this.R = f10;
            invalidate();
        }
    }

    public void setGlobalGradientView(mz mzVar) {
        this.M = mzVar;
    }

    public void setPhoto(String str) {
        boolean endsWith = str.endsWith("mp4");
        di.c4 c4Var = this.b;
        if (endsWith) {
            c4Var.h("vthumb://0:".concat(str), null, null);
            c4Var.setVisibility(0);
        } else if (!str.endsWith(".jpg") && !str.endsWith(".jpeg") && !str.endsWith(".png") && !str.endsWith(".gif")) {
            c4Var.setVisibility(8);
        } else {
            c4Var.h("thumb://0:".concat(str), null, null);
            c4Var.setVisibility(0);
        }
    }

    public void setPhotoEntry(gf gfVar) {
        String str = gfVar.c;
        long j3 = gfVar.H;
        int i7 = gfVar.G;
        int i10 = gfVar.F;
        int i11 = gfVar.C;
        String str2 = gfVar.I;
        di.c4 c4Var = this.b;
        if (str != null) {
            c4Var.h(str, null, org.telegram.ui.ActionBar.k6.R4);
            str2 = gfVar.c;
        } else if (str2 == null) {
            c4Var.setImageDrawable(org.telegram.ui.ActionBar.k6.R4);
            str2 = "";
        } else if (gfVar.b) {
            c4Var.r();
            c4Var.h("vthumb://" + i11 + ":" + str2, null, org.telegram.ui.ActionBar.k6.R4);
        } else {
            c4Var.s(gfVar.J, gfVar.K, true);
            c4Var.h("thumb://" + i11 + ":" + str2, null, org.telegram.ui.ActionBar.k6.R4);
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
        if (gfVar.b) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(org.telegram.messenger.g0.g0(gfVar.E, false, false));
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
        sb2.append(id.E0().z0().format(gfVar.D));
        this.e.setText(sb2);
        this.a.setVisibility(8);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        try {
            this.h.setProgressColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.wi, this.L));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j3, long j10) {
    }
}
