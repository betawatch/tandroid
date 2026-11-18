package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.IntEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import android.text.style.URLSpan;
import android.util.Property;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class g4 extends p50 implements org.telegram.messenger.fs {
    public static Paint A1;
    public static Paint B1;
    public static Paint D1;
    public static TextPaint i1;
    public static TextPaint j1;
    public static TextPaint k1;
    public static TextPaint l1;
    public static TextPaint m1;
    public static TextPaint n1;
    public static TextPaint o1;
    public static TextPaint p1;
    public static Paint q1;
    public static Paint r1;
    public static Paint s1;
    public static Paint t1;
    public static Paint u1;
    public static Paint v1;
    public static Paint w1;
    public static Paint x1;
    public static Paint y1;
    public static Paint z1;
    public boolean A0;
    public final Paint B0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout C0;
    public TextView D0;
    public Rect E0;
    public org.telegram.ui.Components.w71 F0;
    public org.telegram.ui.Components.w71 G0;
    public int H0;
    public int I0;
    public int J0;
    public final boolean K;
    public int K0;
    public final t3 L;
    public boolean L0;
    public Activity M;
    public y2 M0;
    public org.telegram.ui.ActionBar.h2 N;
    public y2 N0;
    public final ArrayList O;
    public vf.b O0;
    public View P;
    public int P0;
    public FrameLayout Q;
    public org.telegram.ui.Cells.i9 Q0;
    public TextureView R;
    public org.telegram.ui.Cells.i9 R0;
    public j4 S;
    public fr0 S0;
    public WebChromeClient.CustomViewCallback T;
    public final h2.f T0;
    public WindowInsets U;
    public final k0[] U0;
    public boolean V;
    public boolean V0;
    public boolean W;
    public bg.v0 W0;
    public boolean X;
    public b0 X0;
    public int Y;
    public int Y0;
    public int Z;
    public ValueAnimator Z0;
    public int a0;
    public float a1;
    public Runnable b0;
    public final org.telegram.ui.Components.f5 b1;
    public long c0;
    public final org.telegram.ui.Components.f5 c1;
    public final DecelerateInterpolator d0;
    public final ArrayList e0;
    public WindowManager.LayoutParams f0;
    public ArticleViewer$WindowView g0;
    public k0 h0;
    public l0 i0;
    public org.telegram.ui.web.k j0;
    public z k0;
    public org.telegram.ui.ActionBar.x2 l0;
    public Paint m0;
    public Drawable n0;
    public Paint o0;
    public boolean p0;
    public float q0;
    public bi.p2 r0;
    public ImageView s0;
    public ImageView t0;
    public org.telegram.ui.Components.n6 u0;
    public k3[] v0;
    public AnimatorSet w0;
    public final Paint x0;
    public final Paint y0;
    public final Paint z0;
    public static final HashSet d1 = new HashSet();
    public static volatile g4 e1 = null;
    public static final q0 f1 = new q0("innerTranslationX", 0);
    public static final TextPaint g1 = new TextPaint(1);
    public static final o3 h1 = new o3();
    public static final WeakHashMap C1 = new WeakHashMap();

    public g4() {
        this.O = new ArrayList();
        this.Z = 1;
        this.d0 = new DecelerateInterpolator(1.5f);
        this.e0 = new ArrayList();
        this.x0 = new Paint();
        this.y0 = new Paint();
        this.z0 = new Paint();
        this.B0 = new Paint();
        this.L0 = false;
        this.M0 = null;
        this.N0 = null;
        this.T0 = new h2.f(new int[]{org.telegram.messenger.ks.s, org.telegram.messenger.ks.t});
        this.U0 = new k0[2];
        this.Y0 = -1;
        z zVar = new z(this, 4);
        org.telegram.ui.Components.lr lrVar = org.telegram.ui.Components.lr.h;
        this.b1 = new org.telegram.ui.Components.f5(zVar, 320L, lrVar);
        this.c1 = new org.telegram.ui.Components.f5(new z(this, 5), 320L, lrVar);
        this.K = false;
        this.L = null;
    }

    public static CharSequence A(p50 p50Var, TLRPC.WebPage webPage, View view, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock, int i7) {
        TextPaint C;
        if (richText2 == null) {
            return null;
        }
        if (richText2 instanceof TL_iv.textFixed) {
            return A(p50Var, webPage, view, richText, ((TL_iv.textFixed) richText2).text, pageBlock, i7);
        }
        if (richText2 instanceof TL_iv.textItalic) {
            return A(p50Var, webPage, view, richText, ((TL_iv.textItalic) richText2).text, pageBlock, i7);
        }
        if (richText2 instanceof TL_iv.textBold) {
            return A(p50Var, webPage, view, richText, ((TL_iv.textBold) richText2).text, pageBlock, i7);
        }
        if (richText2 instanceof TL_iv.textUnderline) {
            return A(p50Var, webPage, view, richText, ((TL_iv.textUnderline) richText2).text, pageBlock, i7);
        }
        if (richText2 instanceof TL_iv.textStrike) {
            return A(p50Var, webPage, view, richText, ((TL_iv.textStrike) richText2).text, pageBlock, i7);
        }
        if (richText2 instanceof TL_iv.textEmail) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A(p50Var, webPage, view, richText, ((TL_iv.textEmail) richText2).text, pageBlock, i7));
            MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder.length() != 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.zy0((metricAffectingSpanArr == null || metricAffectingSpanArr.length == 0) ? C(p50Var, richText, richText2, pageBlock) : null, "mailto:" + D(richText2)), 0, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        long j3 = 0;
        if (richText2 instanceof TL_iv.textUrl) {
            TL_iv.textUrl texturl = (TL_iv.textUrl) richText2;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(A(p50Var, webPage, view, richText, texturl.text, pageBlock, i7));
            MetricAffectingSpan[] metricAffectingSpanArr2 = (MetricAffectingSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), MetricAffectingSpan.class);
            C = (metricAffectingSpanArr2 == null || metricAffectingSpanArr2.length == 0) ? C(p50Var, richText, richText2, pageBlock) : null;
            Object az0Var = texturl.webpage_id != 0 ? new org.telegram.ui.Components.az0(C, D(richText2)) : new org.telegram.ui.Components.zy0(C, D(richText2));
            if (spannableStringBuilder2.length() != 0) {
                spannableStringBuilder2.setSpan(az0Var, 0, spannableStringBuilder2.length(), 33);
            }
            return spannableStringBuilder2;
        }
        if (richText2 instanceof TL_iv.textPlain) {
            return ((TL_iv.textPlain) richText2).text;
        }
        if (richText2 instanceof TL_iv.textAnchor) {
            TL_iv.textAnchor textanchor = (TL_iv.textAnchor) richText2;
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(A(p50Var, webPage, view, richText, textanchor.text, pageBlock, i7));
            String str = textanchor.name;
            org.telegram.ui.Components.c5 c5Var = new org.telegram.ui.Components.c5();
            c5Var.a = str.toLowerCase();
            spannableStringBuilder3.setSpan(c5Var, 0, spannableStringBuilder3.length(), 17);
            return spannableStringBuilder3;
        }
        if (richText2 instanceof TL_iv.textEmpty) {
            return "";
        }
        if (richText2 instanceof TL_iv.textConcat) {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
            int size = richText2.texts.size();
            int i10 = 0;
            while (i10 < size) {
                TL_iv.RichText richText3 = richText2.texts.get(i10);
                TL_iv.RichText y10 = y(richText3);
                boolean z10 = i7 >= 0 && (richText3 instanceof TL_iv.textUrl) && ((TL_iv.textUrl) richText3).webpage_id != j3;
                if (z10 && spannableStringBuilder4.length() != 0 && spannableStringBuilder4.charAt(spannableStringBuilder4.length() - 1) != '\n') {
                    spannableStringBuilder4.append((CharSequence) " ");
                    spannableStringBuilder4.setSpan(new org.telegram.ui.Cells.k9(), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                }
                CharSequence A = A(p50Var, webPage, view, richText, richText3, pageBlock, i7);
                int B = B(y10);
                int length = spannableStringBuilder4.length();
                spannableStringBuilder4.append(A);
                if (B != 0 && !(A instanceof SpannableStringBuilder)) {
                    if ((B & 8) != 0 || (B & 512) != 0) {
                        String D = D(richText3);
                        if (D == null) {
                            D = D(richText);
                        }
                        Object az0Var2 = (B & 512) != 0 ? new org.telegram.ui.Components.az0(C(p50Var, richText, y10, pageBlock), D) : new org.telegram.ui.Components.zy0(C(p50Var, richText, y10, pageBlock), D);
                        if (length != spannableStringBuilder4.length()) {
                            spannableStringBuilder4.setSpan(az0Var2, length, spannableStringBuilder4.length(), 33);
                        }
                    } else if (length != spannableStringBuilder4.length()) {
                        TextPaint C2 = C(p50Var, richText, y10, pageBlock);
                        org.telegram.ui.Components.yy0 yy0Var = new org.telegram.ui.Components.yy0();
                        yy0Var.a = C2;
                        spannableStringBuilder4.setSpan(yy0Var, length, spannableStringBuilder4.length(), 33);
                    }
                }
                if (z10 && i10 != size - 1) {
                    spannableStringBuilder4.append((CharSequence) " ");
                    spannableStringBuilder4.setSpan(new org.telegram.ui.Cells.k9(), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                }
                i10++;
                j3 = 0;
            }
            return spannableStringBuilder4;
        }
        if (richText2 instanceof TL_iv.textSubscript) {
            return A(p50Var, webPage, view, richText, ((TL_iv.textSubscript) richText2).text, pageBlock, i7);
        }
        if (richText2 instanceof TL_iv.textSuperscript) {
            return A(p50Var, webPage, view, richText, ((TL_iv.textSuperscript) richText2).text, pageBlock, i7);
        }
        if (richText2 instanceof TL_iv.textMarked) {
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(A(p50Var, webPage, view, richText, ((TL_iv.textMarked) richText2).text, pageBlock, i7));
            MetricAffectingSpan[] metricAffectingSpanArr3 = (MetricAffectingSpan[]) spannableStringBuilder5.getSpans(0, spannableStringBuilder5.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder5.length() != 0) {
                C = (metricAffectingSpanArr3 == null || metricAffectingSpanArr3.length == 0) ? C(p50Var, richText, richText2, pageBlock) : null;
                org.telegram.ui.Components.xy0 xy0Var = new org.telegram.ui.Components.xy0();
                xy0Var.a = C;
                spannableStringBuilder5.setSpan(xy0Var, 0, spannableStringBuilder5.length(), 33);
            }
            return spannableStringBuilder5;
        }
        if (richText2 instanceof TL_iv.textSpoiler) {
            SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(A(p50Var, webPage, view, richText, ((TL_iv.textSpoiler) richText2).text, pageBlock, i7));
            if (spannableStringBuilder6.length() != 0) {
                org.telegram.ui.Components.dz0 dz0Var = new org.telegram.ui.Components.dz0();
                dz0Var.a |= 256;
                spannableStringBuilder6.setSpan(new org.telegram.ui.Components.ez0(dz0Var, 0), 0, spannableStringBuilder6.length(), 33);
            }
            return spannableStringBuilder6;
        }
        if (richText2 instanceof TL_iv.textPhone) {
            SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(A(p50Var, webPage, view, richText, ((TL_iv.textPhone) richText2).text, pageBlock, i7));
            MetricAffectingSpan[] metricAffectingSpanArr4 = (MetricAffectingSpan[]) spannableStringBuilder7.getSpans(0, spannableStringBuilder7.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder7.length() != 0) {
                spannableStringBuilder7.setSpan(new org.telegram.ui.Components.zy0((metricAffectingSpanArr4 == null || metricAffectingSpanArr4.length == 0) ? C(p50Var, richText, richText2, pageBlock) : null, "tel:" + D(richText2)), 0, spannableStringBuilder7.length(), 33);
            }
            return spannableStringBuilder7;
        }
        if (richText2 instanceof TL_iv.textImage) {
            TL_iv.textImage textimage = (TL_iv.textImage) richText2;
            TLRPC.Document a10 = d4.a(webPage, textimage.document_id);
            TLRPC.Photo e10 = d4.e(webPage, textimage.photo_id);
            if (a10 != null) {
                SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder("*");
                int L = org.telegram.messenger.g0.L(textimage.w);
                int L2 = org.telegram.messenger.g0.L(textimage.h);
                int abs = Math.abs(i7);
                if (L > abs) {
                    L2 = (int) (L2 * (abs / L));
                    L = abs;
                }
                if (view != null) {
                    int i11 = org.telegram.ui.ActionBar.n6.d6;
                    ((g4) p50Var).getClass();
                    boolean z11 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.x0(null, i11, false)) <= 0.705f;
                    org.telegram.ui.Components.wy0 wy0Var = new org.telegram.ui.Components.wy0();
                    Locale locale = Locale.US;
                    String str2 = L + "_" + L2 + "_i";
                    wy0Var.b = L;
                    wy0Var.c = L2;
                    boolean z12 = z11;
                    ImageReceiver imageReceiver = new ImageReceiver(view);
                    wy0Var.a = imageReceiver;
                    imageReceiver.K0 = true;
                    if (z12) {
                        imageReceiver.h1 = new org.telegram.ui.Components.wb0(19);
                    }
                    imageReceiver.r0(org.telegram.messenger.fc.b(a10), str2, org.telegram.messenger.fc.c(org.telegram.messenger.w7.w(a10.thumbs, 90, false, null, false), a10), str2, null, -1L, null, webPage, 1);
                    spannableStringBuilder8.setSpan(wy0Var, 0, spannableStringBuilder8.length(), 33);
                }
                return spannableStringBuilder8;
            }
            if (e10 instanceof org.telegram.ui.web.u1) {
                org.telegram.ui.web.u1 u1Var = (org.telegram.ui.web.u1) e10;
                SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder("*");
                int L3 = org.telegram.messenger.g0.L(textimage.w);
                int L4 = org.telegram.messenger.g0.L(textimage.h);
                int abs2 = Math.abs(i7);
                if (L3 > abs2) {
                    L4 = (int) (L4 * (abs2 / L3));
                    L3 = abs2;
                }
                if (view != null) {
                    org.telegram.ui.Components.wy0 wy0Var2 = new org.telegram.ui.Components.wy0();
                    wy0Var2.b = L3;
                    wy0Var2.c = L4;
                    ImageReceiver imageReceiver2 = new ImageReceiver(view);
                    wy0Var2.a = imageReceiver2;
                    imageReceiver2.K0 = true;
                    org.telegram.ui.web.v1.g(u1Var, imageReceiver2, new org.telegram.ui.Components.me(12));
                    spannableStringBuilder9.setSpan(wy0Var2, 0, spannableStringBuilder9.length(), 33);
                }
                return spannableStringBuilder9;
            }
        } else {
            if (!(richText2 instanceof TL_iv.textMath)) {
                return "not supported " + richText2;
            }
            TL_iv.textMath textmath = (TL_iv.textMath) richText2;
            if (textmath.bitmap == null && !textmath.tried) {
                textmath.tried = true;
                oi.p a11 = oi.p.a(textmath.source, org.telegram.messenger.g0.L(20.0f), true);
                if (a11 != null) {
                    textmath.w = a11.b;
                    textmath.h = a11.c;
                    textmath.depth = a11.d;
                    textmath.bitmap = a11.a;
                }
            }
            if (textmath.bitmap != null) {
                SpannableStringBuilder spannableStringBuilder10 = new SpannableStringBuilder("￼");
                Bitmap bitmap = textmath.bitmap;
                int i12 = textmath.w;
                int i13 = textmath.h;
                int i14 = org.telegram.ui.ActionBar.n6.G6;
                ((g4) p50Var).getClass();
                spannableStringBuilder10.setSpan(new org.telegram.ui.Components.wy0(view, bitmap, i12, i13, org.telegram.ui.ActionBar.n6.x0(null, i14, false), textmath.depth), 0, spannableStringBuilder10.length(), 33);
                String str3 = textmath.source;
                if (str3 != null && !str3.isEmpty()) {
                    spannableStringBuilder10.setSpan(new org.telegram.ui.Cells.o9(textmath.source), 0, spannableStringBuilder10.length(), 33);
                }
                return spannableStringBuilder10;
            }
            String str4 = textmath.source;
            if (str4 != null) {
                return str4;
            }
        }
        return "";
    }

    public static int B(TL_iv.RichText richText) {
        if (richText instanceof TL_iv.textFixed) {
            return B(richText.parentRichText) | 4;
        }
        if (richText instanceof TL_iv.textItalic) {
            return B(richText.parentRichText) | 2;
        }
        if (richText instanceof TL_iv.textBold) {
            return B(richText.parentRichText) | 1;
        }
        if (richText instanceof TL_iv.textUnderline) {
            return B(richText.parentRichText) | 16;
        }
        if (richText instanceof TL_iv.textStrike) {
            return B(richText.parentRichText) | 32;
        }
        if (richText instanceof TL_iv.textEmail) {
            return B(richText.parentRichText) | 8;
        }
        if (richText instanceof TL_iv.textPhone) {
            return B(richText.parentRichText) | 8;
        }
        if (richText instanceof TL_iv.textUrl) {
            return ((TL_iv.textUrl) richText).webpage_id != 0 ? B(richText.parentRichText) | 512 : B(richText.parentRichText) | 8;
        }
        if (richText instanceof TL_iv.textSubscript) {
            return B(richText.parentRichText) | 128;
        }
        if (richText instanceof TL_iv.textSuperscript) {
            return B(richText.parentRichText) | 256;
        }
        if (richText instanceof TL_iv.textMarked) {
            return B(richText.parentRichText) | 64;
        }
        if (richText != null) {
            return B(richText.parentRichText);
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0391  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TextPaint C(p50 p50Var, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock) {
        int i7;
        int i10;
        int x02;
        SparseArray sparseArray;
        int L;
        int x03;
        int L2;
        int L3;
        int L4;
        int L5;
        int i11;
        int L6;
        int i12;
        int L7;
        int B = B(richText2);
        int L8 = org.telegram.messenger.g0.L(14.0f);
        ((g4) p50Var).getClass();
        o3 o3Var = h1;
        o3Var.getClass();
        SparseArray sparseArray2 = o3Var.x;
        SparseArray sparseArray3 = o3Var.w;
        SparseArray sparseArray4 = o3Var.t;
        SparseArray sparseArray5 = o3Var.c;
        SparseArray sparseArray6 = o3Var.b;
        int L9 = org.telegram.messenger.g0.L(org.telegram.messenger.bz.Z0 - 16);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            TL_iv.RichText richText3 = ((TL_iv.pageBlockPhoto) pageBlock).caption.text;
            if (richText3 == richText2 || richText3 == richText) {
                L7 = org.telegram.messenger.g0.L(14.0f);
                sparseArray5 = sparseArray6;
            } else {
                L7 = org.telegram.messenger.g0.L(12.0f);
            }
            L8 = L7;
            x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.y6, false);
        } else if (pageBlock instanceof TL_iv.pageBlockMap) {
            TL_iv.RichText richText4 = ((TL_iv.pageBlockMap) pageBlock).caption.text;
            if (richText4 == richText2 || richText4 == richText) {
                L6 = org.telegram.messenger.g0.L(14.0f);
                sparseArray5 = sparseArray6;
            } else {
                L6 = org.telegram.messenger.g0.L(12.0f);
            }
            L8 = L6;
            x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.y6, false);
        } else {
            if (pageBlock instanceof TL_iv.pageBlockTitle) {
                sparseArray = o3Var.d;
                L8 = org.telegram.messenger.g0.L(23.0f);
                i10 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockKicker) {
                sparseArray = o3Var.e;
                L8 = org.telegram.messenger.g0.L(14.0f);
                i10 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockAuthorDate) {
                sparseArray = o3Var.o;
                L8 = org.telegram.messenger.g0.L(14.0f);
                i10 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.y6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockFooter) {
                sparseArray = o3Var.p;
                L8 = org.telegram.messenger.g0.L(14.0f);
                i10 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.y6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockSubtitle) {
                sparseArray = o3Var.g;
                L8 = org.telegram.messenger.g0.L(20.0f);
                i10 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
                sparseArray = o3Var.f;
                L8 = org.telegram.messenger.g0.L(20.0f);
                i10 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
                sparseArray = o3Var.h;
                L8 = org.telegram.messenger.g0.L(17.0f);
                i10 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockHeading1) {
                sparseArray = o3Var.i;
                L8 = org.telegram.messenger.g0.L(18.0f);
                i10 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockHeading2) {
                sparseArray = o3Var.j;
                L8 = org.telegram.messenger.g0.L(16.0f);
                i10 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockHeading3) {
                sparseArray = o3Var.k;
                L8 = org.telegram.messenger.g0.L(15.0f);
                i10 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockHeading4) {
                sparseArray = o3Var.l;
                L8 = org.telegram.messenger.g0.L(14.0f);
                i10 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockHeading5) {
                sparseArray = o3Var.m;
                L8 = org.telegram.messenger.g0.L(13.0f);
                i10 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false);
            } else {
                if (!(pageBlock instanceof TL_iv.pageBlockHeading6)) {
                    if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
                        if (pageblockblockquote.text == richText) {
                            L8 = org.telegram.messenger.g0.L(15.0f);
                            i11 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false);
                        } else if (pageblockblockquote.caption == richText) {
                            L8 = org.telegram.messenger.g0.L(14.0f);
                            i11 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.y6, false);
                            sparseArray4 = sparseArray6;
                        } else {
                            sparseArray4 = null;
                            i11 = -65536;
                        }
                        i10 = i11;
                        sparseArray5 = sparseArray4;
                        i7 = 0;
                    } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                        TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
                        if (pageblockpullquote.text == richText) {
                            L8 = org.telegram.messenger.g0.L(15.0f);
                            i11 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false);
                        } else if (pageblockpullquote.caption == richText) {
                            L8 = org.telegram.messenger.g0.L(14.0f);
                            i11 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.y6, false);
                            sparseArray4 = sparseArray6;
                        } else {
                            i11 = -65536;
                            sparseArray4 = null;
                        }
                        i10 = i11;
                        sparseArray5 = sparseArray4;
                        i7 = 0;
                    } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
                        if (pageblockpreformatted.codeLength < 0) {
                            pageblockpreformatted.codeLength = org.telegram.ui.Components.b90.p(pageblockpreformatted.text).length();
                        }
                        int i13 = pageblockpreformatted.codeLength;
                        int i14 = i13 > 500 ? 3 : i13 > 220 ? 2 : i13 > 80 ? 1 : 0;
                        SparseArray sparseArray7 = o3Var.s;
                        L8 = org.telegram.messenger.g0.L(14 - i14);
                        B |= 4;
                        i7 = i14 << 16;
                        sparseArray5 = sparseArray7;
                        i10 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false);
                    } else if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                        sparseArray = o3Var.q;
                        L8 = org.telegram.messenger.g0.L(16.0f);
                        i10 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false);
                    } else if (J(pageBlock)) {
                        sparseArray = o3Var.r;
                        L8 = org.telegram.messenger.g0.L(16.0f);
                        i10 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false);
                    } else if (pageBlock instanceof TL_iv.pageBlockEmbed) {
                        TL_iv.RichText richText5 = ((TL_iv.pageBlockEmbed) pageBlock).caption.text;
                        if (richText5 == richText2 || richText5 == richText) {
                            L5 = org.telegram.messenger.g0.L(14.0f);
                            sparseArray5 = sparseArray6;
                        } else {
                            L5 = org.telegram.messenger.g0.L(12.0f);
                        }
                        L8 = L5;
                        x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.y6, false);
                    } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                        TL_iv.RichText richText6 = ((TL_iv.pageBlockSlideshow) pageBlock).caption.text;
                        if (richText6 == richText2 || richText6 == richText) {
                            L4 = org.telegram.messenger.g0.L(14.0f);
                            sparseArray5 = sparseArray6;
                        } else {
                            L4 = org.telegram.messenger.g0.L(12.0f);
                        }
                        L8 = L4;
                        x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.y6, false);
                    } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
                        TL_iv.RichText richText7 = ((TL_iv.pageBlockCollage) pageBlock).caption.text;
                        if (richText7 == richText2 || richText7 == richText) {
                            L3 = org.telegram.messenger.g0.L(14.0f);
                            sparseArray5 = sparseArray6;
                        } else {
                            L3 = org.telegram.messenger.g0.L(12.0f);
                        }
                        L8 = L3;
                        x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.y6, false);
                    } else if (pageBlock instanceof TL_iv.pageBlockEmbedPost) {
                        TL_iv.PageCaption pageCaption = ((TL_iv.pageBlockEmbedPost) pageBlock).caption;
                        if (richText2 == pageCaption.text) {
                            L8 = org.telegram.messenger.g0.L(14.0f);
                            x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.y6, false);
                            sparseArray5 = sparseArray6;
                        } else if (richText2 == pageCaption.credit) {
                            L8 = org.telegram.messenger.g0.L(12.0f);
                            x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.y6, false);
                        } else if (richText2 != null) {
                            sparseArray5 = o3Var.u;
                            L8 = org.telegram.messenger.g0.L(14.0f);
                            x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false);
                        } else {
                            x02 = -65536;
                            sparseArray5 = null;
                        }
                    } else {
                        if (pageBlock instanceof TL_iv.pageBlockVideo) {
                            if (richText2 == ((TL_iv.pageBlockVideo) pageBlock).caption.text) {
                                L2 = org.telegram.messenger.g0.L(14.0f);
                                sparseArray2 = sparseArray3;
                            } else {
                                L2 = org.telegram.messenger.g0.L(12.0f);
                            }
                            L8 = L2;
                            x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false);
                        } else if (pageBlock instanceof TL_iv.pageBlockAudio) {
                            if (richText2 == ((TL_iv.pageBlockAudio) pageBlock).caption.text) {
                                L = org.telegram.messenger.g0.L(14.0f);
                                sparseArray2 = sparseArray3;
                            } else {
                                L = org.telegram.messenger.g0.L(12.0f);
                            }
                            L8 = L;
                            x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false);
                        } else if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                            sparseArray = o3Var.y;
                            L8 = org.telegram.messenger.g0.L(15.0f);
                            i10 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.y6, false);
                        } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                            sparseArray = o3Var.z;
                            L8 = org.telegram.messenger.g0.L(15.0f);
                            i10 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false);
                        } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                            sparseArray5 = o3Var.A;
                            L8 = org.telegram.messenger.g0.L(15.0f);
                            x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false);
                        } else {
                            i7 = 0;
                            i10 = -65536;
                            sparseArray5 = null;
                        }
                        i10 = x03;
                        sparseArray5 = sparseArray2;
                        i7 = 0;
                    }
                    i12 = B & 256;
                    if (i12 == 0 || (B & 128) != 0) {
                        L8 -= org.telegram.messenger.g0.L(4.0f);
                    }
                    if (sparseArray5 == null) {
                        if (o3Var.a == null) {
                            TextPaint textPaint = new TextPaint(1);
                            o3Var.a = textPaint;
                            textPaint.setColor(-65536);
                        }
                        o3Var.a.setTextSize(org.telegram.messenger.g0.L(14.0f));
                        return o3Var.a;
                    }
                    int i15 = i7 | B;
                    TextPaint textPaint2 = (TextPaint) sparseArray5.get(i15);
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint(1);
                        if ((B & 4) != 0) {
                            textPaint2.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
                        } else if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                            textPaint2.setTypeface(org.telegram.messenger.g0.o());
                        } else if (p50Var.a != 1 && !(pageBlock instanceof TL_iv.pageBlockTitle) && !(pageBlock instanceof TL_iv.pageBlockKicker) && !(pageBlock instanceof TL_iv.pageBlockHeader) && !(pageBlock instanceof TL_iv.pageBlockSubtitle) && !(pageBlock instanceof TL_iv.pageBlockSubheader) && !I(pageBlock)) {
                            int i16 = B & 1;
                            if (i16 != 0 && (B & 2) != 0) {
                                textPaint2.setTypeface(org.telegram.messenger.g0.o1("fonts/rmediumitalic.ttf"));
                            } else if (i16 != 0) {
                                textPaint2.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
                            } else if ((B & 2) != 0) {
                                textPaint2.setTypeface(org.telegram.messenger.g0.o1("fonts/ritalic.ttf"));
                            }
                        } else if ((pageBlock instanceof TL_iv.pageBlockTitle) || (pageBlock instanceof TL_iv.pageBlockHeader) || (pageBlock instanceof TL_iv.pageBlockSubtitle) || (pageBlock instanceof TL_iv.pageBlockSubheader) || I(pageBlock)) {
                            textPaint2.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
                        } else {
                            int i17 = B & 1;
                            if (i17 != 0 && (B & 2) != 0) {
                                textPaint2.setTypeface(Typeface.create("serif", 3));
                            } else if (i17 != 0) {
                                textPaint2.setTypeface(Typeface.create("serif", 1));
                            } else if ((B & 2) != 0) {
                                textPaint2.setTypeface(Typeface.create("serif", 2));
                            } else {
                                textPaint2.setTypeface(Typeface.create("serif", 0));
                            }
                        }
                        if ((B & 32) != 0) {
                            textPaint2.setFlags(textPaint2.getFlags() | 16);
                        }
                        if ((B & 16) != 0) {
                            textPaint2.setFlags(textPaint2.getFlags() | 8);
                        }
                        if ((B & 8) != 0 || (B & 512) != 0) {
                            textPaint2.setFlags(textPaint2.getFlags());
                            i10 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.J6, false);
                        }
                        if (i12 != 0) {
                            textPaint2.baselineShift -= org.telegram.messenger.g0.L(6.0f);
                        } else if ((B & 128) != 0) {
                            textPaint2.baselineShift = org.telegram.messenger.g0.L(2.0f) + textPaint2.baselineShift;
                        }
                        textPaint2.setColor(i10);
                        sparseArray5.put(i15, textPaint2);
                    }
                    textPaint2.setTextSize(L8 + L9);
                    return textPaint2;
                }
                sparseArray = o3Var.n;
                L8 = org.telegram.messenger.g0.L(12.0f);
                i10 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false);
            }
            sparseArray5 = sparseArray;
            i7 = 0;
            i12 = B & 256;
            if (i12 == 0) {
            }
            L8 -= org.telegram.messenger.g0.L(4.0f);
            if (sparseArray5 == null) {
            }
        }
        i10 = x02;
        i7 = 0;
        i12 = B & 256;
        if (i12 == 0) {
        }
        L8 -= org.telegram.messenger.g0.L(4.0f);
        if (sparseArray5 == null) {
        }
    }

    public static String D(TL_iv.RichText richText) {
        if (richText instanceof TL_iv.textFixed) {
            return D(((TL_iv.textFixed) richText).text);
        }
        if (richText instanceof TL_iv.textItalic) {
            return D(((TL_iv.textItalic) richText).text);
        }
        if (richText instanceof TL_iv.textBold) {
            return D(((TL_iv.textBold) richText).text);
        }
        if (richText instanceof TL_iv.textUnderline) {
            return D(((TL_iv.textUnderline) richText).text);
        }
        if (richText instanceof TL_iv.textStrike) {
            return D(((TL_iv.textStrike) richText).text);
        }
        if (richText instanceof TL_iv.textEmail) {
            return ((TL_iv.textEmail) richText).email;
        }
        if (richText instanceof TL_iv.textUrl) {
            return ((TL_iv.textUrl) richText).url;
        }
        if (richText instanceof TL_iv.textPhone) {
            return ((TL_iv.textPhone) richText).phone;
        }
        return null;
    }

    public static boolean G() {
        return e1 != null;
    }

    public static boolean I(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
    }

    public static boolean J(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof w3) || (pageBlock instanceof y3);
    }

    public static boolean M(u3 u3Var) {
        boolean z10;
        TL_iv.PageBlock x10 = x(u3Var.a);
        if (x10 instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) x10;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                return true;
            }
        } else if (x10 instanceof u3) {
            u3 u3Var2 = (u3) x10;
            TL_iv.PageBlock x11 = x(u3Var2.b);
            if (x11 instanceof TL_iv.pageBlockDetails) {
                TL_iv.pageBlockDetails pageblockdetails2 = (TL_iv.pageBlockDetails) x11;
                if (!pageblockdetails2.open) {
                    pageblockdetails2.open = true;
                    z10 = true;
                    if (!M(u3Var2) || z10) {
                        return true;
                    }
                }
            }
            z10 = false;
            if (!M(u3Var2)) {
            }
            return true;
        }
        return false;
    }

    public static void R(p50 p50Var) {
        if (p50Var.b == null && p50Var.f == null) {
            return;
        }
        View view = p50Var.f;
        p50Var.c.f(true);
        p50Var.b = null;
        p50Var.d = null;
        p50Var.f = null;
        if (view != null) {
            view.invalidate();
        }
    }

    public static /* synthetic */ WindowInsets c(WindowInsets windowInsets) {
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public static void d(String str, int i7, FrameLayout frameLayout, t3 t3Var, org.telegram.ui.ActionBar.i6 i6Var) {
        String u10 = org.telegram.ui.web.v0.u(str);
        long e10 = org.telegram.messenger.j10.i(i7).e();
        org.telegram.messenger.zy.C(i7).r0(org.telegram.messenger.xy.a(e10, u10));
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_message.peer_id = tL_peerUser;
        tL_peerUser.user_id = e10;
        TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
        tL_message.from_id = tL_peerUser2;
        tL_peerUser2.user_id = e10;
        tL_message.message = u10;
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
        tL_message.media = tL_messageMediaWebPage;
        tL_messageMediaWebPage.webpage = new TLRPC.TL_webPage();
        TLRPC.WebPage webPage = tL_message.media.webpage;
        webPage.url = u10;
        webPage.display_url = u10;
        org.telegram.messenger.ks.f(i7).k(org.telegram.messenger.ks.H1, new org.telegram.messenger.fj(i7, tL_message, false, false));
        new org.telegram.ui.Components.lc(frameLayout, i6Var).Q(R.raw.saved_messages, 36, org.telegram.messenger.g0.T2(org.telegram.messenger.gd.M0(2131742682, null), new bi.y3(t3Var, e10, 20))).k(true);
    }

    public static void e0(p50 p50Var) {
        TextPaint textPaint = o1;
        if (textPaint != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
        }
        TextPaint textPaint2 = p1;
        if (textPaint2 != null) {
            textPaint2.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
        }
        TextPaint textPaint3 = i1;
        if (textPaint3 != null) {
            textPaint3.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
        }
        TextPaint textPaint4 = k1;
        if (textPaint4 != null) {
            textPaint4.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
        }
        TextPaint textPaint5 = l1;
        if (textPaint5 != null) {
            textPaint5.setColor(-1);
        }
        TextPaint textPaint6 = m1;
        if (textPaint6 != null) {
            textPaint6.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
        }
        TextPaint textPaint7 = n1;
        if (textPaint7 != null) {
            textPaint7.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.y6, false));
        }
        TextPaint textPaint8 = j1;
        if (textPaint8 != null) {
            textPaint8.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.y6, false));
        }
        p(p50Var, true);
        o3 o3Var = h1;
        o3.a(p50Var, o3Var.d);
        o3.a(p50Var, o3Var.e);
        o3.a(p50Var, o3Var.g);
        o3.a(p50Var, o3Var.f);
        o3.a(p50Var, o3Var.h);
        o3.a(p50Var, o3Var.i);
        o3.a(p50Var, o3Var.j);
        o3.a(p50Var, o3Var.k);
        o3.a(p50Var, o3Var.l);
        o3.a(p50Var, o3Var.m);
        o3.a(p50Var, o3Var.n);
        o3.a(p50Var, o3Var.t);
        o3.a(p50Var, o3Var.s);
        o3.a(p50Var, o3Var.q);
        o3.a(p50Var, o3Var.r);
        o3.a(p50Var, o3Var.u);
        o3.a(p50Var, o3Var.w);
        o3.a(p50Var, o3Var.x);
        o3.a(p50Var, o3Var.b);
        o3.a(p50Var, o3Var.c);
        o3.a(p50Var, o3Var.o);
        o3.a(p50Var, o3Var.p);
        o3.a(p50Var, o3Var.v);
        o3.a(p50Var, o3Var.y);
        o3.a(p50Var, o3Var.z);
        o3.a(p50Var, o3Var.A);
    }

    public static SpannableStringBuilder g(int i7, CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (charSequence != null) {
            spannableStringBuilder.append(charSequence);
        }
        if (spannableStringBuilder.length() > 0) {
            spannableStringBuilder.append((CharSequence) ", ");
        }
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.M0(i7, null));
        return spannableStringBuilder;
    }

    public static CharSequence h(p50 p50Var, e4 e4Var, z2 z2Var) {
        StaticLayout staticLayout;
        if (z2Var == null || (staticLayout = z2Var.d) == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = z2Var.E;
        if (spannableStringBuilder != null) {
            return spannableStringBuilder;
        }
        CharSequence text = staticLayout.getText();
        if (!(text instanceof Spannable)) {
            return text;
        }
        Spannable spannable = (Spannable) text;
        org.telegram.ui.Components.zy0[] zy0VarArr = (org.telegram.ui.Components.zy0[]) spannable.getSpans(0, spannable.length(), org.telegram.ui.Components.zy0.class);
        CharSequence charSequence = text;
        if (zy0VarArr != null) {
            charSequence = text;
            if (zy0VarArr.length != 0) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannable);
                for (org.telegram.ui.Components.zy0 zy0Var : zy0VarArr) {
                    int spanStart = spannableStringBuilder2.getSpanStart(zy0Var);
                    int spanEnd = spannableStringBuilder2.getSpanEnd(zy0Var);
                    if (spanStart >= 0 && spanEnd > spanStart) {
                        spannableStringBuilder2.setSpan(new org.telegram.messenger.v(p50Var, e4Var, zy0Var, 1), spanStart, spanEnd, 33);
                    }
                }
                z2Var.E = spannableStringBuilder2;
                charSequence = spannableStringBuilder2;
            }
        }
        return charSequence;
    }

    public static TL_iv.PageBlock h0(TL_iv.PageBlock pageBlock, u3 u3Var) {
        if (pageBlock instanceof w3) {
            w3 w3Var = (w3) pageBlock;
            w3 w3Var2 = new w3();
            w3Var2.a = w3Var.a;
            w3Var2.b = w3Var.b;
            w3Var2.c = w3Var.c;
            w3Var2.d = h0(w3Var.d, u3Var);
            return w3Var2;
        }
        if (!(pageBlock instanceof y3)) {
            return u3Var;
        }
        y3 y3Var = (y3) pageBlock;
        y3 y3Var2 = new y3();
        y3Var2.a = y3Var.a;
        y3Var2.b = y3Var.b;
        y3Var2.c = y3Var.c;
        y3Var2.d = h0(y3Var.d, u3Var);
        return y3Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x0259, code lost:
    
        if (r0.isShowing() == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x018d, code lost:
    
        r17 = new android.graphics.Path();
        r0 = r29.J;
        r5 = r0.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0199, code lost:
    
        if (r7 >= r5) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x019b, code lost:
    
        r8 = r0.get(r7);
        r7 = r7 + 1;
        r8 = ((xh.f) r8).getBounds();
        r17.addRect(r8.left, r8.top, r8.right, r8.bottom, android.graphics.Path.Direction.CW);
        r17 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01c5, code lost:
    
        r17.computeBounds(new android.graphics.RectF(), false);
        r0 = (float) java.lang.Math.sqrt((r0.height() * r0.height()) + (r0.width() * r0.width()));
        ((xh.f) r29.J.get(0)).q = new org.telegram.ui.c0(r28, r29);
        r3 = r29.J;
        r5 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0200, code lost:
    
        if (r7 >= r5) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0202, code lost:
    
        r8 = r3.get(r7);
        r7 = r7 + 1;
        ((xh.f) r8).j(r6, r4, r0, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0210, code lost:
    
        r28.invalidate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0217, code lost:
    
        if (r28.getParent() == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0219, code lost:
    
        r28.getParent().requestDisallowInterceptTouchEvent(true);
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0269  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean j(p50 p50Var, e4 e4Var, MotionEvent motionEvent, View view, z2 z2Var, int i7, int i10) {
        org.telegram.ui.Cells.i9 i9Var;
        g4 g4Var;
        Object obj;
        g4 g4Var2;
        boolean z10;
        org.telegram.ui.Cells.i9 i9Var2;
        org.telegram.ui.Components.ez0[] ez0VarArr;
        boolean z11 = ((g4) p50Var).w0 == null;
        n2.o0 o0Var = p50Var.c;
        if (!z11 || view == null) {
            return false;
        }
        g4 g4Var3 = (g4) p50Var;
        if (view.getTag() == null || view.getTag() != "bottomSheet" || (i9Var = g4Var3.R0) == null) {
            i9Var = g4Var3.Q0;
        }
        if (i9Var != null && !i9Var.f0(view)) {
            return false;
        }
        p50Var.f = view;
        if (z2Var != null) {
            StaticLayout staticLayout = z2Var.d;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                int lineCount = staticLayout.getLineCount();
                float f10 = 2.1474836E9f;
                float f11 = 0.0f;
                for (int i11 = 0; i11 < lineCount; i11++) {
                    f11 = Math.max(staticLayout.getLineWidth(i11), f11);
                    f10 = Math.min(staticLayout.getLineLeft(i11), f10);
                }
                float f12 = x10;
                float f13 = i7 + f10;
                if (f12 >= f13 && f12 <= f13 + f11 && y10 >= i10 && y10 <= staticLayout.getHeight() + i10) {
                    p50Var.d = z2Var;
                    p50Var.e = i10;
                    if (staticLayout.getText() instanceof Spannable) {
                        int i12 = x10 - i7;
                        int i13 = y10 - i10;
                        try {
                            int lineForVertical = staticLayout.getLineForVertical(i13);
                            float f14 = i12;
                            int offsetForHorizontal = staticLayout.getOffsetForHorizontal(lineForVertical, f14);
                            float lineLeft = staticLayout.getLineLeft(lineForVertical);
                            if (lineLeft <= f14 && lineLeft + staticLayout.getLineWidth(lineForVertical) >= f14) {
                                Spannable spannable = (Spannable) staticLayout.getText();
                                org.telegram.ui.Components.zy0[] zy0VarArr = (org.telegram.ui.Components.zy0[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, org.telegram.ui.Components.zy0.class);
                                if (zy0VarArr == null || zy0VarArr.length <= 0) {
                                    g4Var = g4Var3;
                                    obj = "bottomSheet";
                                } else {
                                    org.telegram.ui.Components.zy0 zy0Var = zy0VarArr[0];
                                    int spanStart = spannable.getSpanStart(zy0Var);
                                    g4Var = g4Var3;
                                    obj = "bottomSheet";
                                    int spanEnd = spannable.getSpanEnd(zy0Var);
                                    int i14 = 1;
                                    while (i14 < zy0VarArr.length) {
                                        try {
                                            org.telegram.ui.Components.zy0 zy0Var2 = zy0VarArr[i14];
                                            org.telegram.ui.Components.zy0[] zy0VarArr2 = zy0VarArr;
                                            int spanStart2 = spannable.getSpanStart(zy0Var2);
                                            int i15 = i14;
                                            int spanEnd2 = spannable.getSpanEnd(zy0Var2);
                                            if (spanStart > spanStart2 || spanEnd2 > spanEnd) {
                                                spanStart = spanStart2;
                                                zy0Var = zy0Var2;
                                                spanEnd = spanEnd2;
                                            }
                                            i14 = i15 + 1;
                                            zy0VarArr = zy0VarArr2;
                                        } catch (Exception e10) {
                                            e = e10;
                                            org.telegram.messenger.a8.g(e, true);
                                            if (motionEvent.getAction() != 0) {
                                            }
                                            z10 = true;
                                            if (motionEvent.getAction() != 0) {
                                            }
                                            if (view instanceof j1) {
                                            }
                                        }
                                    }
                                    org.telegram.ui.Components.l80 l80Var = p50Var.b;
                                    if (l80Var == null || l80Var.i != zy0Var) {
                                        if (l80Var != null) {
                                            o0Var.m(l80Var, true);
                                        }
                                        org.telegram.ui.Components.l80 l80Var2 = new org.telegram.ui.Components.l80(zy0Var, null, f12, y10, 0);
                                        p50Var.b = l80Var2;
                                        l80Var2.d(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.K6, false) & 872415231);
                                        o0Var.b(p50Var.b, p50Var.d);
                                        try {
                                            org.telegram.ui.Components.f80 b10 = p50Var.b.b();
                                            b10.d(staticLayout, spanStart, 0.0f);
                                            TextPaint textPaint = zy0Var.a;
                                            int i16 = textPaint != null ? textPaint.baselineShift : 0;
                                            b10.o = i16 != 0 ? i16 + org.telegram.messenger.g0.L(i16 > 0 ? 5.0f : -2.0f) : 0;
                                            staticLayout.getSelectionPath(spanStart, spanEnd, b10);
                                            view.invalidate();
                                        } catch (Exception e11) {
                                            org.telegram.messenger.a8.g(e11, true);
                                        }
                                    }
                                }
                                ArrayList arrayList = z2Var.J;
                                if (arrayList != null && !arrayList.isEmpty() && (ez0VarArr = (org.telegram.ui.Components.ez0[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, org.telegram.ui.Components.ez0.class)) != null) {
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 >= ez0VarArr.length) {
                                            break;
                                        }
                                        if (ez0VarArr[i17].c()) {
                                            break;
                                        }
                                        i17++;
                                    }
                                }
                            }
                        } catch (Exception e12) {
                            e = e12;
                            g4Var = g4Var3;
                            obj = "bottomSheet";
                        }
                    }
                }
                g4Var = g4Var3;
                obj = "bottomSheet";
            } else {
                g4Var = g4Var3;
                obj = "bottomSheet";
                if (motionEvent.getAction() == 1) {
                    org.telegram.ui.Components.l80 l80Var3 = p50Var.b;
                    if (l80Var3 != null) {
                        p50Var.a(e4Var, (org.telegram.ui.Components.zy0) l80Var3.i);
                        R(p50Var);
                    }
                } else if (motionEvent.getAction() == 3) {
                    org.telegram.ui.ActionBar.h1 h1Var = p50Var.I;
                    if (h1Var != null) {
                    }
                    R(p50Var);
                }
            }
        } else {
            g4Var = g4Var3;
            obj = "bottomSheet";
        }
        if (motionEvent.getAction() != 0) {
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            g4Var2 = g4Var;
            if (!g4Var2.L0) {
                z10 = true;
                g4Var2.L0 = true;
                if (g4Var2.N0 == null) {
                    g4Var2.N0 = new y2(g4Var2, 1);
                }
                if (view.getTag() == null || view.getTag() != obj || (i9Var2 = g4Var2.R0) == null) {
                    g4Var2.Q0.k0(view, (int) x11, (int) y11);
                } else {
                    i9Var2.k0(view, (int) x11, (int) y11);
                }
                g4Var2.g0.postDelayed(g4Var2.N0, ViewConfiguration.getTapTimeout());
                if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                    g4Var2.i();
                }
                if (view instanceof j1) {
                    if (p50Var.b != null) {
                        return z10;
                    }
                    return false;
                }
                if (p50Var.d != null) {
                    return z10;
                }
                return false;
            }
        } else {
            g4Var2 = g4Var;
        }
        z10 = true;
        if (motionEvent.getAction() != 0) {
            g4Var2.i();
        }
        if (view instanceof j1) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:52|(3:53|54|(3:58|(3:(2:62|63)(2:65|66)|64|59)|67))|69|(2:70|71)|(11:75|76|77|(5:80|(1:82)(1:92)|(3:(1:85)(1:89)|86|87)(2:90|91)|88|78)|93|94|95|96|(7:100|101|102|(5:105|(1:107)(1:117)|(3:(1:110)(1:114)|111|112)(2:115|116)|113|103)|118|119|120)|153|120)|158|95|96|(8:98|100|101|102|(1:103)|118|119|120)|153|120) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03a0 A[Catch: Exception -> 0x03d7, TryCatch #0 {Exception -> 0x03d7, blocks: (B:102:0x039a, B:103:0x039d, B:105:0x03a0, B:107:0x03b5, B:111:0x03c2, B:113:0x03ca, B:119:0x03d3), top: B:101:0x039a }] */
    /* JADX WARN: Type inference failed for: r10v13, types: [android.text.Spanned, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v7, types: [android.graphics.Path, org.telegram.ui.Components.f80] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.text.Layout, android.text.StaticLayout] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r9v11, types: [android.graphics.Path, org.telegram.ui.Components.f80] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static z2 n(p50 p50Var, View view, CharSequence charSequence, TL_iv.RichText richText, int i7, int i10, TL_iv.PageBlock pageBlock, Layout.Alignment alignment, int i11, e4 e4Var) {
        p50 p50Var2;
        CharSequence A;
        TL_iv.RichText richText2;
        TL_iv.PageBlock pageBlock2;
        TextPaint C;
        ?? r42;
        int i12;
        CharSequence charSequence2;
        StaticLayout staticLayout;
        ?? r12;
        org.telegram.ui.Components.f80 f80Var;
        org.telegram.ui.Components.f80 f80Var2;
        View view2;
        TL_iv.RichText richText3;
        TL_iv.PageBlock pageBlock3;
        int i13;
        int i14;
        ?? r13;
        ?? r92;
        org.telegram.ui.Components.xy0[] xy0VarArr;
        int i15;
        org.telegram.ui.Components.az0[] az0VarArr;
        e4 e4Var2;
        if (charSequence == null && (richText == null || (richText instanceof TL_iv.textEmpty))) {
            return null;
        }
        int L = i7 < 0 ? org.telegram.messenger.g0.L(10.0f) : i7;
        if (charSequence != null) {
            p50Var2 = p50Var;
            richText2 = richText;
            A = charSequence;
            pageBlock2 = pageBlock;
        } else {
            p50Var2 = p50Var;
            A = A(p50Var2, e4Var != null ? e4Var.F : null, view, richText, richText, pageBlock, L);
            richText2 = richText;
            pageBlock2 = pageBlock;
        }
        if (!TextUtils.isEmpty(A)) {
            int L2 = org.telegram.messenger.g0.L(org.telegram.messenger.bz.Z0 - 16);
            if ((pageBlock2 instanceof TL_iv.pageBlockEmbedPost) && richText2 == null) {
                if (((TL_iv.pageBlockEmbedPost) pageBlock2).author == charSequence) {
                    if (i1 == null) {
                        TextPaint textPaint = new TextPaint(1);
                        i1 = textPaint;
                        ((g4) p50Var2).getClass();
                        textPaint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
                    }
                    i1.setTextSize(org.telegram.messenger.g0.L(15.0f) + L2);
                    C = i1;
                } else {
                    if (j1 == null) {
                        TextPaint textPaint2 = new TextPaint(1);
                        j1 = textPaint2;
                        ((g4) p50Var2).getClass();
                        textPaint2.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.y6, false));
                    }
                    j1.setTextSize(org.telegram.messenger.g0.L(14.0f) + L2);
                    C = j1;
                }
            } else if (pageBlock2 instanceof TL_iv.pageBlockChannel) {
                if (k1 == null) {
                    TextPaint textPaint3 = new TextPaint(1);
                    k1 = textPaint3;
                    TextPaint d = org.telegram.messenger.n10.d(textPaint3, 1);
                    l1 = d;
                    d.setTypeface(org.telegram.messenger.g0.o());
                }
                TextPaint textPaint4 = k1;
                ((g4) p50Var2).getClass();
                textPaint4.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
                k1.setTextSize(org.telegram.messenger.g0.L(15.0f));
                l1.setColor(-1);
                l1.setTextSize(org.telegram.messenger.g0.L(15.0f));
                C = (e4Var == null || e4Var.G == null) ? k1 : l1;
            } else if (pageBlock2 instanceof a4) {
                a4 a4Var = (a4) pageBlock2;
                if (charSequence == a4Var.a.articles.get(a4Var.b).title) {
                    if (m1 == null) {
                        TextPaint textPaint5 = new TextPaint(1);
                        m1 = textPaint5;
                        textPaint5.setTypeface(org.telegram.messenger.g0.o());
                    }
                    TextPaint textPaint6 = m1;
                    ((g4) p50Var2).getClass();
                    textPaint6.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
                    m1.setTextSize(org.telegram.messenger.g0.L(15.0f) + L2);
                    C = m1;
                } else {
                    if (n1 == null) {
                        n1 = new TextPaint(1);
                    }
                    TextPaint textPaint7 = n1;
                    ((g4) p50Var2).getClass();
                    textPaint7.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.y6, false));
                    n1.setTextSize(org.telegram.messenger.g0.L(14.0f) + L2);
                    C = n1;
                }
            } else if (!J(pageBlock2) || charSequence == null) {
                C = C(p50Var2, richText2, richText2, pageBlock2);
            } else {
                if (o1 == null) {
                    TextPaint textPaint8 = new TextPaint(1);
                    o1 = textPaint8;
                    ((g4) p50Var2).getClass();
                    textPaint8.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
                }
                if (p1 == null) {
                    TextPaint textPaint9 = new TextPaint(1);
                    p1 = textPaint9;
                    ((g4) p50Var2).getClass();
                    textPaint9.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
                }
                o1.setTextSize(org.telegram.messenger.g0.L(19.0f) + L2);
                p1.setTextSize(org.telegram.messenger.g0.L(16.0f) + L2);
                C = (!(pageBlock2 instanceof w3) || ((w3) pageBlock2).c.a.ordered) ? p1 : o1;
            }
            CharSequence m10 = org.telegram.messenger.j6.m(A, C.getFontMetricsInt(), false, null, 2);
            if (i11 == 0) {
                TextPaint textPaint10 = C;
                r42 = 0;
                i12 = 1;
                if (m10.charAt(m10.length() - 1) == '\n') {
                    m10 = m10.subSequence(0, m10.length() - 1);
                }
                if (pageBlock2 instanceof TL_iv.pageBlockPullquote) {
                    charSequence2 = m10;
                    staticLayout = new StaticLayout(charSequence2, textPaint10, L, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                } else {
                    charSequence2 = m10;
                    staticLayout = new StaticLayout(charSequence2, textPaint10, L, alignment, 1.0f, org.telegram.messenger.g0.L(4.0f), false);
                }
                r12 = staticLayout;
                m10 = charSequence2;
            } else if (pageBlock2 instanceof TL_iv.pageBlockPullquote) {
                i12 = 1;
                TextPaint textPaint11 = C;
                r42 = 0;
                r12 = org.telegram.ui.Components.wu0.c(m10, textPaint11, L, Layout.Alignment.ALIGN_CENTER, 0.0f, TextUtils.TruncateAt.END, L, i11, true);
            } else {
                TextPaint textPaint12 = C;
                r42 = 0;
                i12 = 1;
                r12 = org.telegram.ui.Components.wu0.c(m10, textPaint12, L, alignment, org.telegram.messenger.g0.L(4.0f), TextUtils.TruncateAt.END, L, i11, true);
            }
            if (r12 != 0) {
                CharSequence text = r12.getText();
                if (i10 >= 0 && !p50Var2.F.isEmpty() && p50Var2.G != null && (e4Var2 = ((g4) p50Var2).v0[r42].c) != null) {
                    String lowerCase = m10.toString().toLowerCase();
                    int i16 = r42;
                    while (true) {
                        int indexOf = lowerCase.indexOf(p50Var2.G, i16);
                        if (indexOf < 0) {
                            break;
                        }
                        int length = p50Var2.G.length() + indexOf;
                        if (indexOf == 0 || org.telegram.messenger.g0.K1(lowerCase.charAt(indexOf - 1))) {
                            e4Var2.E.put(p50Var2.G + pageBlock2 + richText2 + indexOf, Integer.valueOf(r12.getLineTop(r12.getLineForOffset(indexOf)) + i10));
                        }
                        i16 = length;
                    }
                }
                boolean z10 = text instanceof Spanned;
                if (z10) {
                    ?? r10 = (Spanned) text;
                    try {
                        org.telegram.ui.Components.c5[] c5VarArr = (org.telegram.ui.Components.c5[]) r10.getSpans(r42, r10.length(), org.telegram.ui.Components.c5.class);
                        int lineCount = r12.getLineCount();
                        if (c5VarArr != null && c5VarArr.length > 0) {
                            for (int i17 = r42; i17 < c5VarArr.length; i17++) {
                                if (lineCount <= i12) {
                                    e4Var.n.put(c5VarArr[i17].a, Integer.valueOf(i10));
                                } else {
                                    HashMap hashMap = e4Var.n;
                                    org.telegram.ui.Components.c5 c5Var = c5VarArr[i17];
                                    hashMap.put(c5Var.a, Integer.valueOf(i10 + r12.getLineTop(r12.getLineForOffset(r10.getSpanStart(c5Var)))));
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                    try {
                        az0VarArr = (org.telegram.ui.Components.az0[]) r10.getSpans(r42, r10.length(), org.telegram.ui.Components.az0.class);
                    } catch (Exception unused2) {
                    }
                    if (az0VarArr != null && az0VarArr.length > 0) {
                        r13 = new org.telegram.ui.Components.f80(r42);
                        try {
                            r13.n = r42;
                            for (int i18 = r42; i18 < az0VarArr.length; i18++) {
                                int spanStart = r10.getSpanStart(az0VarArr[i18]);
                                int spanEnd = r10.getSpanEnd(az0VarArr[i18]);
                                r13.d(r12, spanStart, 0.0f);
                                TextPaint textPaint13 = az0VarArr[i18].a;
                                int i19 = textPaint13 != null ? textPaint13.baselineShift : r42;
                                r13.o = i19 != 0 ? i19 + org.telegram.messenger.g0.L(i19 > 0 ? 5.0f : -2.0f) : r42;
                                r12.getSelectionPath(spanStart, spanEnd, r13);
                            }
                            r13.n = i12;
                        } catch (Exception unused3) {
                        }
                        xy0VarArr = (org.telegram.ui.Components.xy0[]) r10.getSpans(r42, r10.length(), org.telegram.ui.Components.xy0.class);
                        if (xy0VarArr != null && xy0VarArr.length > 0) {
                            r92 = new org.telegram.ui.Components.f80(r42);
                            try {
                                r92.n = r42;
                                for (i15 = r42; i15 < xy0VarArr.length; i15++) {
                                    int spanStart2 = r10.getSpanStart(xy0VarArr[i15]);
                                    int spanEnd2 = r10.getSpanEnd(xy0VarArr[i15]);
                                    r92.d(r12, spanStart2, 0.0f);
                                    TextPaint textPaint14 = xy0VarArr[i15].a;
                                    int i20 = textPaint14 != null ? textPaint14.baselineShift : 0;
                                    r92.o = i20 != 0 ? i20 + org.telegram.messenger.g0.L(i20 > 0 ? 5.0f : -2.0f) : 0;
                                    r12.getSelectionPath(spanStart2, spanEnd2, r92);
                                }
                                r92.n = i12;
                            } catch (Exception unused4) {
                            }
                            f80Var = r92;
                            f80Var2 = r13;
                        }
                        r92 = 0;
                        f80Var = r92;
                        f80Var2 = r13;
                    }
                    r13 = 0;
                    xy0VarArr = (org.telegram.ui.Components.xy0[]) r10.getSpans(r42, r10.length(), org.telegram.ui.Components.xy0.class);
                    if (xy0VarArr != null) {
                        r92 = new org.telegram.ui.Components.f80(r42);
                        r92.n = r42;
                        while (i15 < xy0VarArr.length) {
                        }
                        r92.n = i12;
                        f80Var = r92;
                        f80Var2 = r13;
                    }
                    r92 = 0;
                    f80Var = r92;
                    f80Var2 = r13;
                } else {
                    f80Var = null;
                    f80Var2 = null;
                }
                z2 z2Var = new z2(p50Var2);
                z2Var.d = r12;
                z2Var.e = f80Var2;
                z2Var.f = f80Var;
                z2Var.n = pageBlock2;
                z2Var.r = richText2;
                z2Var.K = new Stack();
                z2Var.J = new ArrayList();
                z2Var.L = new AtomicReference();
                if (z10) {
                    richText3 = richText;
                    pageBlock3 = pageBlock;
                    i13 = i12;
                    i14 = 0;
                    view2 = view;
                    xh.f.a(view2, r12, -1, -1, (Spanned) text, z2Var.K, z2Var.J, null);
                } else {
                    view2 = view;
                    richText3 = richText2;
                    pageBlock3 = pageBlock2;
                    i13 = i12;
                    i14 = 0;
                }
                if (view2 != null) {
                    WeakHashMap weakHashMap = C1;
                    ArrayList arrayList = (ArrayList) weakHashMap.get(view2);
                    if (arrayList != null) {
                        int i21 = i14;
                        while (i21 < arrayList.size()) {
                            z2 z2Var2 = (z2) arrayList.get(i21);
                            if (z2Var2.n != pageBlock3 || (richText3 != null && z2Var2.r == richText3)) {
                                z2Var2.f(view2);
                                arrayList.remove(i21);
                                i21--;
                            }
                            i21 += i13;
                        }
                    }
                    if (richText3 != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            weakHashMap.put(view2, arrayList);
                        }
                        arrayList.add(z2Var);
                    }
                    if (view2.isAttachedToWindow()) {
                        z2Var.i(view2);
                    }
                }
                return z2Var;
            }
        }
        return null;
    }

    public static z2 o(p50 p50Var, View view, CharSequence charSequence, TL_iv.RichText richText, int i7, int i10, TL_iv.PageBlock pageBlock, e4 e4Var) {
        return n(p50Var, view, charSequence, richText, i7, i10, pageBlock, Layout.Alignment.ALIGN_NORMAL, 0, e4Var);
    }

    public static void p(p50 p50Var, boolean z10) {
        if (s1 == null) {
            s1 = new Paint();
            r1 = new Paint();
            Paint paint = new Paint(1);
            u1 = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            u1.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
            Paint paint2 = new Paint();
            v1 = paint2;
            paint2.setStyle(style);
            v1.setStrokeWidth(org.telegram.messenger.g0.L(1.0f) / 2.0f);
            w1 = new Paint();
            x1 = new Paint();
            y1 = new Paint();
            z1 = new Paint(1);
            A1 = new Paint(1);
            q1 = new Paint();
            t1 = new Paint();
            B1 = new Paint(1);
        } else if (!z10) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.d6, false);
        A1.setColor(com.google.android.gms.internal.vision.e2.y((float) Color.blue(x02), 0.0722f, (((float) Color.green(x02)) * 0.7152f) + (((float) Color.red(x02)) * 0.2126f), 255.0f) <= 0.705f ? -3041234 : -6551);
        Paint paint3 = z1;
        int i7 = org.telegram.ui.ActionBar.n6.K6;
        paint3.setColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false) & 872415231);
        z1.setPathEffect(org.telegram.ui.Components.f80.c());
        y1.setColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false) & 872415231);
        y1.setPathEffect(org.telegram.ui.Components.f80.c());
        Paint paint4 = v1;
        int i10 = org.telegram.ui.ActionBar.n6.k6;
        paint4.setColor(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
        u1.setColor(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
        q1.setColor(251658240);
        t1.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.d7, false));
        B1.setColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false) & 872415231);
        B1.setPathEffect(org.telegram.ui.Components.f80.c());
        int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.M6, false);
        int red = Color.red(x03);
        int green = Color.green(x03);
        int blue = Color.blue(x03);
        x1.setColor(Color.argb(20, red, green, blue));
        w1.setColor(Color.argb(34, red, green, blue));
        int x04 = org.telegram.ui.ActionBar.n6.x0(null, i7, false);
        r1.setColor(Color.argb(20, Color.red(x04), Color.green(x04), Color.blue(x04)));
        s1.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ld, false));
    }

    public static void s(Canvas canvas, p50 p50Var, TL_iv.PageBlock pageBlock, int i7) {
        if (pageBlock == null || p50Var == null || s1 == null) {
            return;
        }
        int i10 = 0;
        int L = i7 - (pageBlock.bottom ? org.telegram.messenger.g0.L(6.0f) : 0);
        int i11 = pageBlock.quoteLevels;
        if (i11 == 0) {
            if (pageBlock.level > 0) {
                canvas.drawRect(org.telegram.messenger.g0.L(18), 0.0f, org.telegram.messenger.g0.L(2.0f) + r0, L, s1);
                return;
            }
            return;
        }
        while (i11 != 0) {
            if ((i11 & 1) != 0) {
                canvas.drawRect(org.telegram.messenger.g0.L((i10 * 14) + 18), 0.0f, org.telegram.messenger.g0.L(2.0f) + r0, L, s1);
            }
            i11 >>>= 1;
            i10++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r0 != null) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void t(p50 p50Var, Canvas canvas, org.telegram.ui.Cells.h9 h9Var, int i7) {
        org.telegram.ui.Cells.i9 i9Var;
        View view = (View) h9Var;
        g4 g4Var = (g4) p50Var;
        if (view != null) {
            g4Var.getClass();
            if (view.getTag() != null) {
                if (view.getTag() == "bottomSheet") {
                    i9Var = g4Var.R0;
                }
            }
        }
        i9Var = g4Var.Q0;
        if (i9Var != null) {
            i9Var.Z(canvas, h9Var, i7);
        }
    }

    public static TL_iv.RichText u(int i7, TL_iv.PageBlock pageBlock) {
        if (i7 == 2) {
            TL_iv.RichText u10 = u(0, pageBlock);
            if (u10 instanceof TL_iv.textEmpty) {
                u10 = null;
            }
            TL_iv.RichText u11 = u(1, pageBlock);
            if (u11 instanceof TL_iv.textEmpty) {
                u11 = null;
            }
            if (u10 != null && u11 == null) {
                return u10;
            }
            if (u10 == null && u11 != null) {
                return u11;
            }
            if (u10 != null && u11 != null) {
                TL_iv.textPlain textplain = new TL_iv.textPlain();
                textplain.text = " ";
                TL_iv.textConcat textconcat = new TL_iv.textConcat();
                textconcat.texts.add(u10);
                textconcat.texts.add(textplain);
                textconcat.texts.add(u11);
                return textconcat;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockEmbedPost) {
            TL_iv.pageBlockEmbedPost pageblockembedpost = (TL_iv.pageBlockEmbedPost) pageBlock;
            if (i7 == 0) {
                return pageblockembedpost.caption.text;
            }
            if (i7 == 1) {
                return pageblockembedpost.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
            if (i7 == 0) {
                return pageblockslideshow.caption.text;
            }
            if (i7 == 1) {
                return pageblockslideshow.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
            if (i7 == 0) {
                return pageblockphoto.caption.text;
            }
            if (i7 == 1) {
                return pageblockphoto.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
            TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
            if (i7 == 0) {
                return pageblockcollage.caption.text;
            }
            if (i7 == 1) {
                return pageblockcollage.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockEmbed) {
            TL_iv.pageBlockEmbed pageblockembed = (TL_iv.pageBlockEmbed) pageBlock;
            if (i7 == 0) {
                return pageblockembed.caption.text;
            }
            if (i7 == 1) {
                return pageblockembed.caption.credit;
            }
        } else {
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                return ((TL_iv.pageBlockBlockquote) pageBlock).caption;
            }
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
                if (i7 == 0) {
                    return pageblockvideo.caption.text;
                }
                if (i7 == 1) {
                    return pageblockvideo.caption.credit;
                }
            } else {
                if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                    return ((TL_iv.pageBlockPullquote) pageBlock).caption;
                }
                if (pageBlock instanceof TL_iv.pageBlockAudio) {
                    TL_iv.pageBlockAudio pageblockaudio = (TL_iv.pageBlockAudio) pageBlock;
                    if (i7 == 0) {
                        return pageblockaudio.caption.text;
                    }
                    if (i7 == 1) {
                        return pageblockaudio.caption.credit;
                    }
                } else {
                    if (pageBlock instanceof TL_iv.pageBlockCover) {
                        return u(i7, ((TL_iv.pageBlockCover) pageBlock).cover);
                    }
                    if (pageBlock instanceof TL_iv.pageBlockMap) {
                        TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
                        if (i7 == 0) {
                            return pageblockmap.caption.text;
                        }
                        if (i7 == 1) {
                            return pageblockmap.caption.credit;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static g4 v() {
        g4 g4Var;
        g4 g4Var2 = e1;
        if (g4Var2 != null) {
            return g4Var2;
        }
        synchronized (g4.class) {
            try {
                g4Var = e1;
                if (g4Var == null) {
                    g4Var = new g4();
                    e1 = g4Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return g4Var;
    }

    public static View w(View view) {
        org.telegram.ui.Components.kj0 kj0Var;
        if (!(view instanceof v1)) {
            return (!(view instanceof y1) || (kj0Var = ((y1) view).d) == null) ? view : w(kj0Var.a);
        }
        org.telegram.ui.Components.kj0 kj0Var2 = ((v1) view).d;
        return kj0Var2 != null ? w(kj0Var2.a) : view;
    }

    public static TL_iv.PageBlock x(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof w3) {
            TL_iv.PageBlock pageBlock2 = ((w3) pageBlock).d;
            return pageBlock2 != null ? x(pageBlock2) : pageBlock2;
        }
        if (!(pageBlock instanceof y3)) {
            return pageBlock;
        }
        TL_iv.PageBlock pageBlock3 = ((y3) pageBlock).d;
        return pageBlock3 != null ? x(pageBlock3) : pageBlock3;
    }

    public static TL_iv.RichText y(TL_iv.RichText richText) {
        if (richText == null) {
            return null;
        }
        if (richText instanceof TL_iv.textFixed) {
            return y(((TL_iv.textFixed) richText).text);
        }
        if (richText instanceof TL_iv.textItalic) {
            return y(((TL_iv.textItalic) richText).text);
        }
        if (richText instanceof TL_iv.textBold) {
            return y(((TL_iv.textBold) richText).text);
        }
        if (richText instanceof TL_iv.textUnderline) {
            return y(((TL_iv.textUnderline) richText).text);
        }
        if (richText instanceof TL_iv.textStrike) {
            return y(((TL_iv.textStrike) richText).text);
        }
        if (richText instanceof TL_iv.textEmail) {
            return y(((TL_iv.textEmail) richText).text);
        }
        if (richText instanceof TL_iv.textUrl) {
            return y(((TL_iv.textUrl) richText).text);
        }
        if (!(richText instanceof TL_iv.textAnchor)) {
            return richText instanceof TL_iv.textSubscript ? y(((TL_iv.textSubscript) richText).text) : richText instanceof TL_iv.textSuperscript ? y(((TL_iv.textSuperscript) richText).text) : richText instanceof TL_iv.textMarked ? y(((TL_iv.textMarked) richText).text) : richText instanceof TL_iv.textPhone ? y(((TL_iv.textPhone) richText).text) : richText instanceof TL_iv.textSpoiler ? y(((TL_iv.textSpoiler) richText).text) : richText;
        }
        y(((TL_iv.textAnchor) richText).text);
        return richText;
    }

    public static CharSequence z(TL_iv.RichText richText) {
        if (richText == null) {
            return "";
        }
        if (richText instanceof TL_iv.textFixed) {
            return z(((TL_iv.textFixed) richText).text);
        }
        if (richText instanceof TL_iv.textItalic) {
            return z(((TL_iv.textItalic) richText).text);
        }
        if (richText instanceof TL_iv.textBold) {
            return z(((TL_iv.textBold) richText).text);
        }
        if (richText instanceof TL_iv.textUnderline) {
            return z(((TL_iv.textUnderline) richText).text);
        }
        if (richText instanceof TL_iv.textStrike) {
            return z(((TL_iv.textStrike) richText).text);
        }
        if (richText instanceof TL_iv.textEmail) {
            return z(((TL_iv.textEmail) richText).text);
        }
        if (richText instanceof TL_iv.textUrl) {
            return z(((TL_iv.textUrl) richText).text);
        }
        if (richText instanceof TL_iv.textPlain) {
            return ((TL_iv.textPlain) richText).text;
        }
        if (richText instanceof TL_iv.textAnchor) {
            return z(((TL_iv.textAnchor) richText).text);
        }
        if (richText instanceof TL_iv.textEmpty) {
            return "";
        }
        if (!(richText instanceof TL_iv.textConcat)) {
            return richText instanceof TL_iv.textSubscript ? z(((TL_iv.textSubscript) richText).text) : richText instanceof TL_iv.textSuperscript ? z(((TL_iv.textSuperscript) richText).text) : richText instanceof TL_iv.textMarked ? z(((TL_iv.textMarked) richText).text) : richText instanceof TL_iv.textPhone ? z(((TL_iv.textPhone) richText).text) : "";
        }
        StringBuilder sb2 = new StringBuilder();
        int size = richText.texts.size();
        for (int i7 = 0; i7 < size; i7++) {
            sb2.append(z(richText.texts.get(i7)));
        }
        return sb2;
    }

    public final void E() {
        ArrayList arrayList = this.e0;
        int size = arrayList.size();
        t3 t3Var = this.L;
        boolean z10 = false;
        if (size <= 1) {
            ArticleViewer$WindowView articleViewer$WindowView = this.g0;
            articleViewer$WindowView.e = false;
            articleViewer$WindowView.d = false;
            float width = t3Var != null ? t3Var.J * t3Var.c.getWidth() : this.h0.getX();
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = r0.getMeasuredWidth() - width;
            if (t3Var != null) {
                animatorSet.playTogether(t3Var.l(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.h0, (Property<k0, Float>) View.TRANSLATION_X, r0.getMeasuredWidth()), ObjectAnimator.ofFloat(this.g0, f1, r0.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / r0.getMeasuredWidth()) * measuredWidth), org.telegram.messenger.ks.Z3));
            animatorSet.setInterpolator(org.telegram.ui.Components.lr.h);
            animatorSet.addListener(new s0(this));
            animatorSet.start();
            this.V0 = true;
            return;
        }
        ArticleViewer$WindowView articleViewer$WindowView2 = this.g0;
        articleViewer$WindowView2.f = true;
        articleViewer$WindowView2.e = true;
        articleViewer$WindowView2.h = this.K0;
        this.v0[1].setVisibility(0);
        this.v0[1].setAlpha(1.0f);
        this.v0[1].setTranslationX(0.0f);
        this.v0[0].setBackgroundColor(t3Var == null ? 0 : this.m0.getColor());
        c0(-1, arrayList.get(arrayList.size() - 2), true);
        k3 k3Var = this.v0[0];
        k3Var.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        k3Var.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.v0[0], (Property<k3, Float>) View.TRANSLATION_X, k3Var.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(org.telegram.ui.Components.lr.h);
        animatorSet2.addListener(new t0(this));
        animatorSet2.start();
        l0 l0Var = this.i0;
        k3 k3Var2 = this.v0[0];
        l0Var.setMenuColors((k3Var2 == null || !org.telegram.messenger.bz.v0) ? org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Gl, false) : k3Var2.getBackgroundColor());
        l0 l0Var2 = this.i0;
        k3 k3Var3 = this.v0[0];
        l0Var2.d((k3Var3 == null || !org.telegram.messenger.bz.v0) ? org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Gl, false) : k3Var3.getActionBarColor(), true);
        l0 l0Var3 = this.i0;
        k3 k3Var4 = this.v0[0];
        l0Var3.setIsTonsite(k3Var4 != null && k3Var4.e());
        l0 l0Var4 = this.i0;
        k3 k3Var5 = this.v0[0];
        if (k3Var5 != null && k3Var5.d()) {
            z10 = true;
        }
        l0Var4.setIsLocal(z10);
        this.V0 = true;
    }

    public final void F(int i7) {
        ArrayList arrayList = this.e0;
        int size = arrayList.size();
        t3 t3Var = this.L;
        boolean z10 = false;
        if (size <= 1) {
            ArticleViewer$WindowView articleViewer$WindowView = this.g0;
            articleViewer$WindowView.e = false;
            articleViewer$WindowView.d = false;
            float width = t3Var != null ? t3Var.J * t3Var.c.getWidth() : this.h0.getX();
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = r9.getMeasuredWidth() - width;
            if (t3Var != null) {
                animatorSet.playTogether(t3Var.l(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.h0, (Property<k0, Float>) View.TRANSLATION_X, r9.getMeasuredWidth()), ObjectAnimator.ofFloat(this.g0, f1, r9.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / r9.getMeasuredWidth()) * measuredWidth), org.telegram.messenger.ks.Z3));
            animatorSet.setInterpolator(org.telegram.ui.Components.lr.h);
            animatorSet.addListener(new u0(this));
            animatorSet.start();
            this.V0 = true;
            return;
        }
        this.g0.f = true;
        this.v0[1].setVisibility(0);
        this.v0[1].setAlpha(1.0f);
        this.v0[1].setTranslationX(0.0f);
        this.v0[0].setBackgroundColor(t3Var == null ? 0 : this.m0.getColor());
        c0(-1, arrayList.get(i7), true);
        k3 k3Var = this.v0[0];
        k3Var.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        k3Var.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.v0[0], (Property<k3, Float>) View.TRANSLATION_X, k3Var.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(org.telegram.ui.Components.lr.h);
        animatorSet2.addListener(new v0(this, i7));
        animatorSet2.start();
        l0 l0Var = this.i0;
        k3 k3Var2 = this.v0[0];
        l0Var.setMenuColors((k3Var2 == null || !org.telegram.messenger.bz.v0) ? org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Gl, false) : k3Var2.getBackgroundColor());
        l0 l0Var2 = this.i0;
        k3 k3Var3 = this.v0[0];
        l0Var2.d((k3Var3 == null || !org.telegram.messenger.bz.v0) ? org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Gl, false) : k3Var3.getActionBarColor(), true);
        l0 l0Var3 = this.i0;
        k3 k3Var4 = this.v0[0];
        l0Var3.setIsTonsite(k3Var4 != null && k3Var4.e());
        l0 l0Var4 = this.i0;
        k3 k3Var5 = this.v0[0];
        if (k3Var5 != null && k3Var5.d()) {
            z10 = true;
        }
        l0Var4.setIsLocal(z10);
        this.V0 = true;
    }

    public final boolean H() {
        ArrayList arrayList = this.e0;
        return arrayList.size() > 0 && (arrayList.get(0) instanceof TLRPC.WebPage);
    }

    public final void K() {
        this.W = false;
        int i7 = 0;
        while (true) {
            k3[] k3VarArr = this.v0;
            if (i7 < k3VarArr.length) {
                k3VarArr[i7].b();
                i7++;
            } else {
                try {
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        }
        this.M.getWindow().clearFlags(128);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.O;
            if (i10 >= arrayList.size()) {
                this.h0.post(new z(this, 0));
                org.telegram.messenger.ks.f(this.Y).k(org.telegram.messenger.ks.d1, new Object[0]);
                return;
            } else {
                ((q1) arrayList.get(i10)).a(false);
                i10++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean, int] */
    public final boolean L(org.telegram.messenger.fj fjVar, TLRPC.WebPage webPage, String str, String str2) {
        TLRPC.WebPage webPage2;
        boolean z10;
        int lastIndexOf;
        String substring;
        boolean z11;
        ?? r52;
        TL_iv.Page page;
        if (this.M == null) {
            return false;
        }
        t3 t3Var = this.L;
        if (t3Var == null && this.W) {
            return false;
        }
        org.telegram.ui.ActionBar.h2 h2Var = this.N;
        if (h2Var != null && (h2Var.getParentLayout() instanceof ActionBarLayout)) {
            org.telegram.messenger.g0.v1((ActionBarLayout) this.N.getParentLayout());
        }
        int i7 = 1;
        if (fjVar != null) {
            webPage2 = webPage == null ? fjVar.k.media.webpage : webPage;
            z10 = (webPage2 == null || (page = webPage2.cached_page) == null || page.local == null) ? false : true;
            for (int i10 = 0; i10 < fjVar.k.entities.size(); i10++) {
                TLRPC.MessageEntity messageEntity = fjVar.k.entities.get(i10);
                if (messageEntity instanceof TLRPC.TL_messageEntityUrl) {
                    try {
                        String str3 = fjVar.k.message;
                        int i11 = messageEntity.offset;
                        String lowerCase = str3.substring(i11, messageEntity.length + i11).toLowerCase();
                        String lowerCase2 = !TextUtils.isEmpty(webPage2.cached_page.url) ? webPage2.cached_page.url.toLowerCase() : webPage2.url.toLowerCase();
                        if (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase)) {
                            int lastIndexOf2 = lowerCase.lastIndexOf(35);
                            if (lastIndexOf2 == -1) {
                                break;
                            }
                            substring = lowerCase.substring(lastIndexOf2 + 1);
                            break;
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
            }
            substring = null;
        } else if (str == null || (lastIndexOf = str.lastIndexOf(35)) == -1) {
            webPage2 = webPage;
            z10 = false;
            substring = null;
        } else {
            substring = str.substring(lastIndexOf + 1);
            webPage2 = webPage;
            z10 = false;
        }
        ArrayList arrayList = this.e0;
        if (t3Var == null || arrayList.isEmpty()) {
            z11 = z10;
            r52 = 0;
        } else {
            z11 = z10;
            r52 = 1;
        }
        if (r52 == 0) {
            arrayList.clear();
            this.h0.setTranslationX(0.0f);
            if (t3Var != null) {
                t3Var.J = 0.0f;
                t3Var.c.invalidate();
                t3Var.u();
                t3Var.r();
            }
            this.h0.setTranslationY(0.0f);
            this.v0[0].setTranslationY(0.0f);
            this.v0[0].setTranslationX(0.0f);
            this.v0[1].setTranslationX(0.0f);
            this.v0[0].setAlpha(1.0f);
            this.g0.setInnerTranslationX(0.0f);
            this.v0[0].g();
            V(org.telegram.messenger.g0.L(56.0f));
        }
        if (t3Var != null && org.telegram.ui.web.v0.R0) {
            t3Var.a.d();
        }
        if (webPage2 != null) {
            boolean f10 = f(webPage2, substring, r52);
            if (!z11) {
                String str4 = (f10 || substring == null) ? null : substring;
                TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                tL_messages_getWebPage.url = webPage2.url;
                TL_iv.Page page2 = webPage2.cached_page;
                if ((page2 instanceof TL_iv.TL_pagePart_layer82) || page2.part) {
                    tL_messages_getWebPage.hash = 0;
                } else {
                    tL_messages_getWebPage.hash = webPage2.hash;
                }
                int i12 = fjVar != null ? fjVar.K1 : org.telegram.messenger.j10.t0;
                ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getWebPage, new g0(this, i12, webPage2, fjVar, (boolean) r52, str4));
            }
        } else {
            e(r52, str2);
        }
        l0 l0Var = this.i0;
        if (l0Var != null && r52 == 0) {
            l0Var.setIsLocal(this.v0[0].d());
        }
        this.U = null;
        if (t3Var != null) {
            if (r52 == 0) {
                org.telegram.messenger.g0.E2(this.g0);
                t3Var.d = this.g0;
                t3Var.A();
                t3Var.c.addView(this.g0, c8.ma.c(-1.0f, -1));
            }
        } else if (this.W) {
            this.f0.flags &= -17;
            ((WindowManager) this.M.getSystemService("window")).updateViewLayout(this.g0, this.f0);
        } else {
            WindowManager windowManager = (WindowManager) this.M.getSystemService("window");
            if (this.X) {
                try {
                    windowManager.removeView(this.g0);
                } catch (Exception unused) {
                }
            }
            try {
                WindowManager.LayoutParams layoutParams = this.f0;
                layoutParams.flags = -2013200384;
                if (Build.VERSION.SDK_INT >= 28) {
                    layoutParams.layoutInDisplayCutoutMode = 1;
                }
                this.g0.setFocusable(false);
                this.h0.setFocusable(false);
                windowManager.addView(this.g0, this.f0);
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
                return false;
            }
        }
        this.W = true;
        this.a0 = 1;
        if (r52 == 0) {
            if (t3Var == null) {
                this.g0.setAlpha(0.0f);
                this.h0.setAlpha(0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                ArticleViewer$WindowView articleViewer$WindowView = this.g0;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, (Property<ArticleViewer$WindowView, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.h0, (Property<k0, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.g0, (Property<ArticleViewer$WindowView, Float>) View.TRANSLATION_X, org.telegram.messenger.g0.L(56.0f), 0.0f));
                this.b0 = new z(this, i7);
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(this.d0);
                animatorSet.addListener(new p0(this));
                this.c0 = System.currentTimeMillis();
                org.telegram.messenger.g0.g3(new oi.s2(22, this, animatorSet));
            } else if (r52 != 0) {
                t3Var.a.e();
            } else if (!t3Var.h) {
                t3Var.q(t3Var.b);
                t3Var.o();
            }
        }
        this.h0.setLayerType(2, null);
        return true;
    }

    public final void N(long j3, TLRPC.User user) {
        if (user == null || !(this.M instanceof LaunchActivity)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        bundle.putString("botUser", "webpage" + j3);
        ((LaunchActivity) this.M).u0(new bn(bundle), false, true);
        m(false, true);
    }

    public final void O(String str, String str2, j0 j0Var) {
        Activity activity = this.M;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        k3 k3Var = this.v0[0];
        if (k3Var == null || !k3Var.d()) {
            P(str, str2, j0Var);
            return;
        }
        String M0 = org.telegram.messenger.gd.M0(2131747589, null);
        int indexOf = M0.indexOf("%");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.format(M0, str));
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new URLSpan(str), indexOf, str.length() + indexOf, 33);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.M, null);
        String M02 = org.telegram.messenger.gd.M0(2131747586, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.S = M02;
        u1Var.U = spannableStringBuilder;
        u1Var.i0 = false;
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747624, null), new a1.d(this, str, str2, j0Var, 6));
        alertDialog$Builder.p();
    }

    public final void P(String str, String str2, vf.b bVar) {
        t3 t3Var;
        vf.b bVar2 = this.O0;
        if (bVar2 != null) {
            bVar2.a(false);
        }
        this.O0 = bVar;
        if (this.H0 != 0) {
            ConnectionsManager.getInstance(this.Y).cancelRequest(this.H0, false);
            this.H0 = 0;
        }
        boolean[] zArr = new boolean[1];
        if (vf.c.m(this.M, str, false)) {
            if (!this.e0.isEmpty() || (t3Var = this.L) == null) {
                return;
            }
            t3Var.a(false);
            return;
        }
        f0 f0Var = new f0(this, str, zArr, bVar);
        int i7 = this.J0 + 1;
        this.J0 = i7;
        Z(true);
        TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
        tL_messages_getWebPage.url = str;
        tL_messages_getWebPage.hash = 0;
        this.H0 = ConnectionsManager.getInstance(this.Y).sendRequest(tL_messages_getWebPage, new org.telegram.messenger.gx(this, i7, bVar, str2, f0Var, tL_messages_getWebPage));
        if (bVar != null) {
            bVar.b = new b0(this, i7, bVar, 1);
            bVar.d();
        }
    }

    public final void Q() {
        TextView textView = this.D0;
        if (textView != null) {
            int i7 = org.telegram.ui.ActionBar.n6.i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i7, false), 2, -1);
            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
            textView.setBackground(h02);
            org.telegram.ui.ActionBar.u6.j(textView, h02, null, M, null);
            org.telegram.ui.ActionBar.u6.U(this.D0, org.telegram.ui.ActionBar.n6.E8, null);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.C0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, null);
        }
        ImageView imageView = this.s0;
        if (imageView != null) {
            org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.G6, null, PorterDuff.Mode.MULTIPLY);
            ImageView imageView2 = this.s0;
            int i10 = org.telegram.ui.ActionBar.n6.z8;
            org.telegram.ui.ActionBar.u6.Q(imageView2, org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i10, false), 1, -1), null, org.telegram.ui.ActionBar.u6.M(i10), null);
        }
        ImageView imageView3 = this.t0;
        if (imageView3 != null) {
            org.telegram.ui.ActionBar.u6.s(imageView3, org.telegram.ui.ActionBar.n6.G6, null, PorterDuff.Mode.MULTIPLY);
            ImageView imageView4 = this.t0;
            int i11 = org.telegram.ui.ActionBar.n6.z8;
            org.telegram.ui.ActionBar.u6.Q(imageView4, org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i11, false), 1, -1), null, org.telegram.ui.ActionBar.u6.M(i11), null);
        }
        org.telegram.ui.Components.n6 n6Var = this.u0;
        if (n6Var != null) {
            org.telegram.ui.ActionBar.u6.Y(n6Var, org.telegram.ui.ActionBar.n6.G6, null);
        }
        l0 l0Var = this.i0;
        if (l0Var != null) {
            k3 k3Var = this.v0[0];
            l0Var.setMenuColors((k3Var == null || !org.telegram.messenger.bz.v0) ? org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Gl, false) : k3Var.getBackgroundColor());
            l0 l0Var2 = this.i0;
            k3 k3Var2 = this.v0[0];
            l0Var2.d((k3Var2 == null || !org.telegram.messenger.bz.v0) ? org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Gl, false) : k3Var2.getActionBarColor(), true);
        }
        this.m0.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Gl, false));
    }

    public final void S() {
        int L0;
        k3 k3Var = this.v0[0];
        if (k3Var.c.F == null || (L0 = k3Var.d.L0()) == -1) {
            return;
        }
        View m10 = this.v0[0].d.m(L0);
        int top = m10 != null ? m10.getTop() : 0;
        SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("articles", 0).edit();
        String str = "article" + this.v0[0].c.F.id;
        SharedPreferences.Editor putInt = edit.putInt(str, L0).putInt(str + "o", top);
        String v = p5.c.v(str, "r");
        Point point = org.telegram.messenger.g0.q;
        putInt.putBoolean(v, point.x > point.y).commit();
    }

    public final boolean T(String str, boolean z10) {
        int i7 = 0;
        Integer num = 0;
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            Integer num2 = (Integer) this.v0[0].c.h.get(lowerCase);
            if (num2 != null) {
                TL_iv.textAnchor textanchor = (TL_iv.textAnchor) this.v0[0].c.r.get(lowerCase);
                int i10 = 1;
                if (textanchor != null) {
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    pageblockparagraph.text = org.telegram.ui.web.v1.d(textanchor.text, !TextUtils.isEmpty(this.v0[0].c.F.cached_page.url) ? this.v0[0].c.F.cached_page.url.toLowerCase() : this.v0[0].c.F.url.toLowerCase(), lowerCase);
                    this.v0[0].c.getClass();
                    int I = e4.I(pageblockparagraph);
                    v4.f1 x10 = this.v0[0].c.x(null, I);
                    View view = x10.a;
                    this.v0[0].c.H(I, x10, pageblockparagraph, 0, 0, false);
                    org.telegram.ui.ActionBar.x2 j3 = org.telegram.messenger.n10.j(this.M, false, 1, null);
                    j3.v0 = false;
                    j3.w0 = false;
                    LinearLayout linearLayout = new LinearLayout(this.M);
                    linearLayout.setOrientation(1);
                    org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9();
                    this.R0 = i9Var;
                    i9Var.S(linearLayout);
                    this.R0.D = new n0(this, i10);
                    di.xb xbVar = new di.xb(this.M, 5);
                    xbVar.setTextSize(1, 16.0f);
                    xbVar.setTypeface(org.telegram.messenger.g0.o());
                    xbVar.setText(org.telegram.messenger.gd.M0(2131749000, null));
                    xbVar.setGravity((this.v0[0].c.H ? 5 : 3) | 16);
                    xbVar.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
                    xbVar.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                    linearLayout.addView(xbVar, new LinearLayout.LayoutParams(-1, org.telegram.messenger.g0.L(48.0f) + 1));
                    view.setTag("bottomSheet");
                    linearLayout.addView(view, c8.ma.k(0.0f, 7.0f, 0.0f, 0.0f, -1, -2));
                    org.telegram.ui.Cells.u9 n10 = this.R0.n(this.M);
                    ai.k0 k0Var = new ai.k0(this, this.M, linearLayout, 10);
                    j3.z0 = new h0(this, i7);
                    k0Var.addView(linearLayout, -1, -2);
                    k0Var.addView(n10, -1, -2);
                    j3.O = k0Var;
                    if (this.Q0.x()) {
                        this.Q0.f(false);
                    }
                    this.J = j3;
                    Y(j3);
                    return true;
                }
                if (num2.intValue() >= 0 && num2.intValue() < this.v0[0].c.e.size()) {
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) this.v0[0].c.e.get(num2.intValue());
                    TL_iv.PageBlock x11 = x(pageBlock);
                    if ((x11 instanceof u3) && M((u3) x11)) {
                        this.v0[0].c.M();
                        this.v0[0].c.f();
                    }
                    int indexOf = this.v0[0].c.d.indexOf(pageBlock);
                    if (indexOf != -1) {
                        num2 = Integer.valueOf(indexOf);
                    }
                    Integer num3 = (Integer) this.v0[0].c.n.get(lowerCase);
                    if (num3 != null) {
                        if (num3.intValue() == -1) {
                            this.v0[0].c.getClass();
                            int I2 = e4.I(pageBlock);
                            v4.f1 x12 = this.v0[0].c.x(null, I2);
                            this.v0[0].c.H(I2, x12, pageBlock, 0, 0, false);
                            x12.a.measure(View.MeasureSpec.makeMeasureSpec(this.v0[0].b.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                            Integer num4 = (Integer) this.v0[0].c.n.get(lowerCase);
                            if (num4.intValue() != -1) {
                                num = num4;
                            }
                        } else {
                            num = num3;
                        }
                    }
                    if (this.v0[0].c.J) {
                        num2 = Integer.valueOf(num2.intValue() + 1);
                    }
                    if (!z10) {
                        this.v0[0].d.h1(num2.intValue(), (-org.telegram.messenger.g0.L(56.0f)) - num.intValue());
                        return true;
                    }
                    i0 i0Var = new i0(this.v0[0].getContext());
                    i0Var.a = num2.intValue();
                    i0Var.s = (-org.telegram.messenger.g0.L(56.0f)) - num.intValue();
                    this.v0[0].d.w0(i0Var);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U(int i7) {
        int size;
        int i10;
        TL_iv.PageBlock pageBlock;
        u3 u3Var;
        TL_iv.PageBlock pageBlock2;
        if (i7 < 0 || i7 >= this.F.size()) {
            f0();
            return;
        }
        this.H = i7;
        f0();
        p3 p3Var = (p3) this.F.get(i7);
        TL_iv.PageBlock x10 = x(p3Var.c);
        int size2 = this.v0[0].c.e.size();
        for (int i11 = 0; i11 < size2; i11++) {
            TL_iv.PageBlock pageBlock3 = (TL_iv.PageBlock) this.v0[0].c.e.get(i11);
            if ((pageBlock3 instanceof u3) && ((pageBlock2 = (u3Var = (u3) pageBlock3).b) == p3Var.c || pageBlock2 == x10)) {
                if (M(u3Var)) {
                    this.v0[0].c.M();
                    this.v0[0].c.f();
                }
                size = this.v0[0].c.d.size();
                i10 = 0;
                while (true) {
                    if (i10 < size) {
                        i10 = -1;
                        break;
                    }
                    TL_iv.PageBlock pageBlock4 = (TL_iv.PageBlock) this.v0[0].c.d.get(i10);
                    TL_iv.PageBlock pageBlock5 = p3Var.c;
                    if (pageBlock4 == pageBlock5 || pageBlock4 == x10 || ((pageBlock4 instanceof u3) && ((pageBlock = ((u3) pageBlock4).b) == pageBlock5 || pageBlock == x10))) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 != -1) {
                    return;
                }
                if ((x10 instanceof u3) && M((u3) x10)) {
                    this.v0[0].c.M();
                    this.v0[0].c.f();
                }
                String str = this.G + p3Var.c + p3Var.b + p3Var.a;
                Integer num = (Integer) this.v0[0].c.E.get(str);
                if (num == null) {
                    e4 e4Var = this.v0[0].c;
                    TL_iv.PageBlock pageBlock6 = p3Var.c;
                    e4Var.getClass();
                    int I = e4.I(pageBlock6);
                    v4.f1 x11 = this.v0[0].c.x(null, I);
                    this.v0[0].c.H(I, x11, p3Var.c, 0, 0, false);
                    x11.a.measure(View.MeasureSpec.makeMeasureSpec(this.v0[0].b.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                    num = (Integer) this.v0[0].c.E.get(str);
                    if (num == null) {
                        num = 0;
                    }
                }
                o0 o0Var = new o0(this.v0[0].getContext());
                if (this.v0[0].c.J) {
                    i10++;
                }
                o0Var.a = i10;
                o0Var.s = -(org.telegram.messenger.g0.L(100.0f) + ((this.K0 - org.telegram.messenger.g0.L(56.0f)) - num.intValue()));
                o0Var.t = 1.2f;
                this.v0[0].d.w0(o0Var);
                this.v0[0].b.g1();
                return;
            }
        }
        size = this.v0[0].c.d.size();
        i10 = 0;
        while (true) {
            if (i10 < size) {
            }
            i10++;
        }
        if (i10 != -1) {
        }
    }

    public final void V(int i7) {
        l0 l0Var = this.i0;
        if (l0Var == null || l0Var.U || l0Var.a0) {
            return;
        }
        int j3 = Utilities.j(i7, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(24.0f));
        this.K0 = j3;
        this.i0.setHeight(j3);
        this.Q0.x = this.K0;
        int i10 = 0;
        while (true) {
            k3[] k3VarArr = this.v0;
            if (i10 >= k3VarArr.length) {
                return;
            }
            k3VarArr[i10].b.setTopGlowOffset(this.K0);
            i10++;
        }
    }

    public final void W(Activity activity, org.telegram.ui.ActionBar.h2 h2Var) {
        int i7;
        t3 t3Var;
        bg.v0 v0Var = this.W0;
        if (v0Var != null) {
            v0Var.a();
            this.W0 = null;
        }
        LaunchActivity launchActivity = LaunchActivity.H1;
        int i10 = 1;
        this.W0 = launchActivity != null ? new bg.v0(launchActivity, true) : null;
        this.N = h2Var;
        int currentAccount = !(h2Var instanceof ox) ? h2Var.getCurrentAccount() : org.telegram.messenger.j10.t0;
        this.Y = currentAccount;
        org.telegram.messenger.ks.f(currentAccount).c(this, org.telegram.messenger.ks.e2);
        org.telegram.messenger.ks.f(this.Y).c(this, org.telegram.messenger.ks.f2);
        org.telegram.messenger.ks.f(this.Y).c(this, org.telegram.messenger.ks.g2);
        org.telegram.messenger.ks.f(this.Y).c(this, org.telegram.messenger.ks.h2);
        org.telegram.messenger.ks.f(this.Y).c(this, org.telegram.messenger.ks.k4);
        Activity activity2 = this.M;
        if (activity2 == activity || !(activity2 == null || !this.K || (t3Var = this.L) == null || t3Var.e == null)) {
            e0(this);
            Q();
            return;
        }
        this.M = activity;
        int i11 = 0;
        this.a = org.telegram.messenger.t0.b.getSharedPreferences("articles", 0).getInt("font_type", 0);
        p(this, false);
        this.m0 = new Paint();
        this.n0 = activity.getResources().getDrawable(R.drawable.layer_shadow);
        this.o0 = new Paint();
        ArticleViewer$WindowView articleViewer$WindowView = new ArticleViewer$WindowView(this, activity);
        this.g0 = articleViewer$WindowView;
        articleViewer$WindowView.setWillNotDraw(false);
        this.g0.setClipChildren(true);
        this.g0.setFocusable(false);
        k0 k0Var = new k0(i11, activity, this);
        this.h0 = k0Var;
        this.g0.addView(k0Var, c8.ma.e(-1, -1, 51));
        if (this.L == null) {
            this.g0.setFitsSystemWindows(true);
            this.h0.setOnApplyWindowInsetsListener(new org.telegram.ui.ActionBar.y2(i10));
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        this.Q = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        int i12 = 4;
        this.Q.setVisibility(4);
        this.g0.addView(this.Q, c8.ma.c(-1.0f, -1));
        j4 j4Var = new j4(activity);
        this.S = j4Var;
        j4Var.setVisibility(0);
        this.S.setBackgroundColor(-16777216);
        this.Q.addView(this.S, c8.ma.e(-1, -1, 17));
        this.R = new TextureView(activity);
        int i13 = 2;
        this.v0 = new k3[2];
        int i14 = 0;
        while (true) {
            k3[] k3VarArr = this.v0;
            i7 = 8;
            if (i14 >= k3VarArr.length) {
                break;
            }
            k3 k3Var = new k3(this, activity);
            k3VarArr[i14] = k3Var;
            if (i14 == 0) {
                i7 = 0;
            }
            k3Var.setVisibility(i7);
            this.h0.addView(k3Var, c8.ma.d(-1, -1.0f, org.telegram.messenger.ks.E1, 0.0f, 0.0f, 0.0f, 0.0f));
            k3Var.b.setOnItemLongClickListener(new s(this));
            k3Var.b.setOnItemClickListener(new oi.e0(i12, this, k3Var));
            i14++;
        }
        this.h0.addView(new FrameLayout(activity), c8.ma.d(-1, -1.0f, org.telegram.messenger.ks.E1, 0.0f, 0.0f, 0.0f, 0.0f));
        this.x0.setColor(-16777216);
        this.y0.setColor(-16777216);
        this.B0.setColor(-14408666);
        this.z0.setColor(-16777216);
        l0 l0Var = new l0(this, activity);
        this.i0 = l0Var;
        l0Var.f0 = this.L != null;
        this.h0.addView(l0Var, c8.ma.e(-1, -2, 48));
        this.i0.setOnClickListener(new ni.b(i12, this, activity));
        this.i0.c0.addTextChangedListener(new m0(this, i11));
        org.telegram.ui.web.k kVar = new org.telegram.ui.web.k(activity);
        this.j0 = kVar;
        kVar.setOpenProgress(0.0f);
        this.j0.x.j(new g3(this, i13));
        this.h0.addView(this.j0, c8.ma.c(-1.0f, -1));
        int i15 = 3;
        this.k0 = new z(this, i15);
        this.i0.M.setOnClickListener(new r(this, i13));
        this.i0.M.setOnLongClickListener(new t(this, i11));
        this.i0.setMenuListener(new li.d(i7, this, activity));
        this.i0.P.setOnClickListener(new r(this, i15));
        bi.p2 p2Var = new bi.p2(this.M, i7);
        this.r0 = p2Var;
        p2Var.setOnTouchListener(new gi.a(i15));
        this.r0.setWillNotDraw(false);
        this.r0.setTranslationY(org.telegram.messenger.g0.L(51.0f));
        this.r0.setVisibility(4);
        this.r0.setFocusable(true);
        this.r0.setFocusableInTouchMode(true);
        this.r0.setClickable(true);
        this.r0.setPadding(0, org.telegram.messenger.g0.L(3.0f), 0, 0);
        this.h0.addView(this.r0, c8.ma.e(-1, 51, 80));
        new hi.p3(this.g0, false, new q(this, i11));
        ImageView imageView = new ImageView(this.M);
        this.s0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.s0.setImageResource(R.drawable.msg_go_up);
        ImageView imageView2 = this.s0;
        int i16 = org.telegram.ui.ActionBar.n6.G6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.u6.s(imageView2, i16, null, mode);
        ImageView imageView3 = this.s0;
        int i17 = org.telegram.ui.ActionBar.n6.z8;
        org.telegram.ui.ActionBar.u6.Q(imageView3, org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i17, false), 1, -1), null, org.telegram.ui.ActionBar.u6.M(i17), null);
        this.r0.addView(this.s0, c8.ma.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        this.s0.setOnClickListener(new r(this, i11));
        this.s0.setContentDescription(org.telegram.messenger.gd.M0(2131754779, null));
        ImageView imageView4 = new ImageView(this.M);
        this.t0 = imageView4;
        imageView4.setScaleType(scaleType);
        this.t0.setImageResource(R.drawable.msg_go_down);
        org.telegram.ui.ActionBar.u6.s(this.t0, i16, null, mode);
        org.telegram.ui.ActionBar.u6.Q(this.t0, org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i17, false), 1, -1), null, org.telegram.ui.ActionBar.u6.M(i17), null);
        this.r0.addView(this.t0, c8.ma.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        this.t0.setOnClickListener(new r(this, i10));
        this.t0.setContentDescription(org.telegram.messenger.gd.M0(2131754778, null));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(this.M, true, true, true);
        this.u0 = n6Var;
        n6Var.setScaleProperty(0.6f);
        this.u0.b(0.4f, 350L, org.telegram.ui.Components.lr.h);
        org.telegram.ui.ActionBar.u6.Y(this.u0, i16, null);
        this.u0.setTextSize(org.telegram.messenger.g0.L(15.0f));
        this.u0.setTypeface(org.telegram.messenger.g0.o());
        this.u0.setGravity(3);
        this.u0.getDrawable().N = org.telegram.messenger.g0.q.x;
        this.r0.addView(this.u0, c8.ma.d(-2, -2.0f, 19, 18.0f, 0.0f, 108.0f, 0.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f0 = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 98;
        layoutParams.softInputMode = 48;
        layoutParams.flags = 131072;
        int x02 = this.L == null ? org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.a7, true) : org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.a7, false);
        int i18 = (org.telegram.messenger.g0.B(x02) < 0.721f || Build.VERSION.SDK_INT < 26) ? 1792 : 1808;
        this.z0.setColor(x02);
        this.A0 = true;
        WindowManager.LayoutParams layoutParams2 = this.f0;
        layoutParams2.systemUiVisibility = i18;
        layoutParams2.flags |= -2147417856;
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams2.layoutInDisplayCutoutMode = 1;
        }
        org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9();
        this.Q0 = i9Var;
        i9Var.S(this.v0[0].b);
        if (org.telegram.messenger.mp.u1(this.Y).v7.s()) {
            this.Q0.k0 = new s(this);
        }
        org.telegram.ui.Cells.i9 i9Var2 = this.Q0;
        i9Var2.z0 = this.v0[0].d;
        i9Var2.D = new n0(this, i11);
        this.h0.addView(i9Var2.n(activity));
        k0 k0Var2 = this.h0;
        fr0 fr0Var = new fr0(k0Var2, k0Var2);
        this.S0 = fr0Var;
        fr0Var.F = new s(this);
        fr0Var.E = new f(this, i10);
        this.m0.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Gl, false));
        e0(this);
    }

    public final void X(String str) {
        String str2;
        if (this.M == null) {
            return;
        }
        org.telegram.ui.ActionBar.x2 x2Var = this.J;
        if (x2Var != null) {
            x2Var.dismiss();
            this.J = null;
        }
        int i7 = 0;
        int i10 = 1;
        org.telegram.ui.ActionBar.x2 j3 = org.telegram.messenger.n10.j(this.M, false, 1, null);
        try {
            str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            str2 = str;
        }
        j3.P = str2;
        j3.Q = false;
        j3.R = true;
        CharSequence[] charSequenceArr = {org.telegram.messenger.gd.M0(2131747624, null), org.telegram.messenger.gd.M0(2131751756, null)};
        og.j jVar = new og.j(i10, this, str);
        j3.M = charSequenceArr;
        j3.L = jVar;
        j3.I0 = new u(this, i7);
        Y(j3);
    }

    public final void Y(org.telegram.ui.ActionBar.x2 x2Var) {
        if (this.M == null) {
            return;
        }
        try {
            org.telegram.ui.ActionBar.x2 x2Var2 = this.l0;
            if (x2Var2 != null) {
                x2Var2.dismiss();
                this.l0 = null;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            this.l0 = x2Var;
            x2Var.setCanceledOnTouchOutside(true);
            this.l0.setOnDismissListener(new u(this, 1));
            x2Var.show();
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    public final void Z(boolean z10) {
        org.telegram.messenger.g0.r(this.k0);
        if (!z10) {
            this.i0.e0.a(true, 1.0f);
            return;
        }
        this.i0.e0.a(false, 0.0f);
        this.i0.e0.a(true, 0.3f);
        org.telegram.messenger.g0.h3(this.k0, 100L);
    }

    @Override // org.telegram.ui.p50
    public final void a(e4 e4Var, org.telegram.ui.Components.zy0 zy0Var) {
        String str;
        String str2;
        org.telegram.ui.Components.l80 l80Var;
        if (zy0Var == null || (str = zy0Var.b) == null) {
            return;
        }
        org.telegram.ui.ActionBar.x2 x2Var = this.J;
        j0 j0Var = null;
        if (x2Var != null) {
            x2Var.dismiss();
            this.J = null;
        }
        int lastIndexOf = str.lastIndexOf(35);
        boolean z10 = false;
        if (lastIndexOf != -1) {
            String lowerCase = !TextUtils.isEmpty(e4Var.F.cached_page.url) ? e4Var.F.cached_page.url.toLowerCase() : e4Var.F.url.toLowerCase();
            try {
                str2 = URLDecoder.decode(str.substring(lastIndexOf + 1), "UTF-8");
            } catch (Exception unused) {
                str2 = "";
            }
            if (lastIndexOf == 0 || str.toLowerCase().contains(lowerCase)) {
                z10 = true;
                T(str2, true);
            }
        } else {
            str2 = null;
        }
        if (z10) {
            return;
        }
        z2 z2Var = this.d;
        if (z2Var != null && (l80Var = this.b) != null) {
            j0Var = new j0(this, z2Var, l80Var);
        }
        O(str, str2, j0Var);
    }

    public final void a0() {
        LaunchActivity launchActivity;
        FrameLayout frameLayout;
        if (!this.X || (launchActivity = LaunchActivity.H1) == null || launchActivity.isFinishing()) {
            return;
        }
        if (!this.v0[0].f()) {
            k3 k3Var = this.v0[0];
            TLRPC.WebPage webPage = k3Var.c.F;
            frameLayout = k3Var;
            if (webPage == null) {
                return;
            }
        } else if (this.v0[0].getWebView() == null) {
            return;
        } else {
            frameLayout = this.v0[0].f;
        }
        new org.telegram.ui.Components.lc(frameLayout, null).G(R.raw.chats_infotip, 4, org.telegram.messenger.g0.T2(org.telegram.messenger.gd.M0(2131752863, null), new z(this, 11))).k(true);
    }

    @Override // org.telegram.ui.p50
    public final boolean b(TL_iv.PageBlock pageBlock, e4 e4Var) {
        int indexOf;
        List list;
        org.telegram.ui.ActionBar.h2 h2Var = this.N;
        if (h2Var != null && h2Var.getParentActivity() != null) {
            if (!(pageBlock instanceof TL_iv.pageBlockVideo) || d4.g(e4Var.F, pageBlock)) {
                ArrayList arrayList = new ArrayList(e4Var.f);
                indexOf = e4Var.f.indexOf(pageBlock);
                list = arrayList;
            } else {
                list = Collections.singletonList(pageBlock);
                indexOf = 0;
            }
            PhotoViewer p12 = PhotoViewer.p1();
            p12.I2(null, this.N, null);
            if (p12.d2(null, null, null, null, null, null, null, indexOf, new d3(this, list), null, 0L, 0L, 0L, true, new m3(this, e4Var.F, list), null)) {
                l();
                return true;
            }
        }
        return false;
    }

    public final void b0(boolean z10) {
        this.r0.setVisibility(0);
        ValueAnimator valueAnimator = this.Z0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a1, z10 ? 1.0f : 0.0f);
        this.Z0 = ofFloat;
        ofFloat.addUpdateListener(new p(this, 1));
        this.Z0.addListener(new bi.e7(20, this, z10));
        this.Z0.setDuration(320L);
        this.Z0.setInterpolator(org.telegram.ui.Components.lr.h);
        this.Z0.start();
    }

    public final void c0(int i7, Object obj, boolean z10) {
        int L;
        if (obj != null) {
            if ((!(obj instanceof TLRPC.WebPage) || ((TLRPC.WebPage) obj).cached_page == null) && !(obj instanceof x2)) {
                return;
            }
            int i10 = 0;
            if (!z10 && i7 != 0) {
                k3[] k3VarArr = this.v0;
                k3 k3Var = k3VarArr[1];
                k3VarArr[1] = k3VarArr[0];
                k3VarArr[0] = k3Var;
                this.i0.i();
                this.b1.a(this.v0[0].getBackgroundColor(), true);
                this.c1.a(this.v0[1].getBackgroundColor(), true);
                t3 t3Var = this.L;
                if (t3Var != null) {
                    t3Var.z();
                }
                int indexOfChild = this.h0.indexOfChild(this.v0[0]);
                int indexOfChild2 = this.h0.indexOfChild(this.v0[1]);
                if (i7 == 1) {
                    if (indexOfChild < indexOfChild2) {
                        this.h0.removeView(this.v0[0]);
                        this.h0.addView(this.v0[0], indexOfChild2);
                    }
                } else if (indexOfChild2 < indexOfChild) {
                    this.h0.removeView(this.v0[0]);
                    this.h0.addView(this.v0[0], indexOfChild);
                }
                this.w0 = new AnimatorSet();
                this.v0[0].setVisibility(0);
                int i11 = i7 == 1 ? 0 : 1;
                this.v0[i11].setBackgroundColor(this.L == null ? 0 : this.m0.getColor());
                this.v0[i11].setLayerType(2, null);
                if (i7 == 1) {
                    k3 k3Var2 = this.v0[0];
                    Point point = org.telegram.messenger.g0.q;
                    k3Var2.setTranslationX(point.x);
                    this.w0.playTogether(ObjectAnimator.ofFloat(this.v0[0], (Property<k3, Float>) View.TRANSLATION_X, point.x, 0.0f));
                } else if (i7 == -1) {
                    this.v0[0].setTranslationX(0.0f);
                    this.w0.playTogether(ObjectAnimator.ofFloat(this.v0[1], (Property<k3, Float>) View.TRANSLATION_X, 0.0f, org.telegram.messenger.g0.q.x));
                }
                this.w0.setDuration(320L);
                this.w0.setInterpolator(org.telegram.ui.Components.lr.h);
                this.w0.addListener(new r0(this, i11, i10));
                this.g0.f = true;
                l0 l0Var = this.i0;
                k3 k3Var3 = this.v0[0];
                l0Var.setMenuColors((k3Var3 == null || !org.telegram.messenger.bz.v0) ? org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Gl, false) : k3Var3.getBackgroundColor());
                l0 l0Var2 = this.i0;
                k3 k3Var4 = this.v0[0];
                l0Var2.d((k3Var4 == null || !org.telegram.messenger.bz.v0) ? org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Gl, false) : k3Var4.getActionBarColor(), true);
                l0 l0Var3 = this.i0;
                k3 k3Var5 = this.v0[0];
                l0Var3.setIsTonsite(k3Var5 != null && k3Var5.e());
                l0 l0Var4 = this.i0;
                k3 k3Var6 = this.v0[0];
                l0Var4.setIsLocal(k3Var6 != null && k3Var6.d());
                AnimatorSet animatorSet = this.w0;
                Objects.requireNonNull(animatorSet);
                org.telegram.messenger.g0.g3(new hq0(animatorSet, 4));
            }
            if (!z10) {
                this.Q0.f(true);
            }
            e4 e4Var = this.v0[z10 ? 1 : 0].c;
            if (z10) {
                obj = i5.c.h(2, this.e0);
            }
            this.v0[z10 ? 1 : 0].b();
            if (obj instanceof TLRPC.WebPage) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj;
                this.v0[z10 ? 1 : 0].setWeb(null);
                this.v0[z10 ? 1 : 0].setType(0);
                TL_iv.Page page = webPage.cached_page;
                e4Var.H = page.rtl;
                e4Var.F = webPage;
                int size = page.blocks.size();
                int i12 = 0;
                while (i12 < size) {
                    TL_iv.PageBlock pageBlock = webPage.cached_page.blocks.get(i12);
                    if (i12 == 0) {
                        pageBlock.first = true;
                        if (pageBlock instanceof TL_iv.pageBlockCover) {
                            TL_iv.pageBlockCover pageblockcover = (TL_iv.pageBlockCover) pageBlock;
                            TL_iv.RichText u10 = u(0, pageblockcover);
                            TL_iv.RichText u11 = u(1, pageblockcover);
                            if (((u10 != null && !(u10 instanceof TL_iv.textEmpty)) || (u11 != null && !(u11 instanceof TL_iv.textEmpty))) && size > 1) {
                                TL_iv.PageBlock pageBlock2 = webPage.cached_page.blocks.get(1);
                                if (pageBlock2 instanceof TL_iv.pageBlockChannel) {
                                    e4Var.G = (TL_iv.pageBlockChannel) pageBlock2;
                                }
                            }
                        }
                    } else if (i12 == 1 && e4Var.G != null) {
                        i12++;
                    }
                    e4Var.F(e4Var, pageBlock, 0, 0, i12 == size + (-1) ? i12 : 0);
                    i12++;
                }
                e4Var.f();
                if (this.e0.size() == 1 || i7 == -1) {
                    SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("articles", 0);
                    String str = "article" + webPage.id;
                    int i13 = sharedPreferences.getInt(str, -1);
                    boolean z11 = sharedPreferences.getBoolean(str + "r", true);
                    Point point2 = org.telegram.messenger.g0.q;
                    if (z11 == (point2.x <= point2.y ? 0 : 1)) {
                        L = sharedPreferences.getInt(str + "o", 0) - this.v0[z10 ? 1 : 0].b.getPaddingTop();
                    } else {
                        L = org.telegram.messenger.g0.L(10.0f);
                    }
                    if (i13 != -1) {
                        this.v0[z10 ? 1 : 0].d.h1(i13, L);
                    }
                } else {
                    v4.c0 c0Var = this.v0[z10 ? 1 : 0].d;
                    t3 t3Var2 = this.L;
                    c0Var.h1(t3Var2 == null ? 0 : 1, t3Var2 != null ? org.telegram.messenger.g0.L(32.0f) : 0);
                }
            } else if (obj instanceof x2) {
                this.v0[z10 ? 1 : 0].setType(1);
                this.v0[z10 ? 1 : 0].g();
                this.v0[z10 ? 1 : 0].setWeb((x2) obj);
            }
            if (!z10) {
                k(null);
            }
            g0(false);
            d0();
        }
    }

    public final void d0() {
        k3[] k3VarArr;
        k3 k3Var;
        if (this.i0 == null || (k3Var = (k3VarArr = this.v0)[0]) == null || k3VarArr[1] == null) {
            return;
        }
        float translationX = k3Var.getVisibility() != 0 ? 0.0f : 1.0f - (this.v0[0].getTranslationX() / this.v0[0].getWidth());
        float f10 = 1.0f - translationX;
        l0 l0Var = this.i0;
        l0Var.d[0] = this.v0[0].getProgress();
        l0Var.invalidate();
        l0 l0Var2 = this.i0;
        l0Var2.d[1] = this.v0[1].getProgress();
        l0Var2.invalidate();
        this.i0.setTransitionProgress(f10);
        l0 l0Var3 = this.i0;
        if (!l0Var3.a0 && !l0Var3.U) {
            ArticleViewer$WindowView articleViewer$WindowView = this.g0;
            if (articleViewer$WindowView.e || articleViewer$WindowView.f) {
                boolean H = H();
                ArrayList arrayList = this.e0;
                if (H || arrayList.size() > 1) {
                    float T1 = org.telegram.messenger.g0.T1((this.v0[0].s || arrayList.size() > 1) ? 1.0f : 0.0f, (this.v0[1].s || arrayList.size() > 2) ? 1.0f : 0.0f, f10);
                    this.i0.N.c(false, 1.0f - T1);
                    this.i0.Q.c();
                    this.i0.setBackButtonCached(T1 > 0.5f);
                } else {
                    this.i0.Q.c();
                    this.i0.setBackButtonCached(false);
                }
                this.i0.setHasForward(this.v0[0].w);
                this.i0.setIsLocal(this.v0[0].d());
                this.i0.setIsLoaded(this.v0[0].getWebView() != null && this.v0[0].getWebView().b);
            }
        }
        l0 l0Var4 = this.i0;
        int actionBarColor = this.v0[0].getActionBarColor();
        ArticleViewer$WindowView articleViewer$WindowView2 = this.g0;
        l0Var4.b(0, this.b1.a(actionBarColor, articleViewer$WindowView2.e || articleViewer$WindowView2.f));
        l0 l0Var5 = this.i0;
        int actionBarColor2 = this.v0[1].getActionBarColor();
        ArticleViewer$WindowView articleViewer$WindowView3 = this.g0;
        l0Var5.b(1, this.c1.a(actionBarColor2, articleViewer$WindowView3.e || articleViewer$WindowView3.f));
        this.i0.d(i0.a.f(f10, this.v0[0].getActionBarColor(), this.v0[1].getActionBarColor()), false);
        this.i0.setMenuType((translationX > 0.5f ? this.v0[0] : this.v0[1]).a);
        t3 t3Var = this.L;
        if (t3Var != null) {
            t3Var.c.invalidate();
            return;
        }
        ArticleViewer$WindowView articleViewer$WindowView4 = this.g0;
        if (articleViewer$WindowView4 != null) {
            articleViewer$WindowView4.invalidate();
        }
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        x0 x0Var;
        org.telegram.messenger.fj messageObject;
        if (i7 == org.telegram.messenger.ks.h2) {
            if (this.v0 == null) {
                return;
            }
            int i11 = 0;
            while (true) {
                k3[] k3VarArr = this.v0;
                if (i11 >= k3VarArr.length) {
                    return;
                }
                int childCount = k3VarArr[i11].b.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.v0[i11].b.getChildAt(i12);
                    if (childAt instanceof x0) {
                        ((x0) childAt).a(true);
                    }
                }
                i11++;
            }
        } else if (i7 == org.telegram.messenger.ks.f2 || i7 == org.telegram.messenger.ks.g2) {
            if (this.v0 == null) {
                return;
            }
            int i13 = 0;
            while (true) {
                k3[] k3VarArr2 = this.v0;
                if (i13 >= k3VarArr2.length) {
                    return;
                }
                int childCount2 = k3VarArr2[i13].b.getChildCount();
                for (int i14 = 0; i14 < childCount2; i14++) {
                    View childAt2 = this.v0[i13].b.getChildAt(i14);
                    if (childAt2 instanceof x0) {
                        x0 x0Var2 = (x0) childAt2;
                        if (x0Var2.getMessageObject() != null) {
                            x0Var2.a(true);
                        }
                    }
                }
                i13++;
            }
        } else if (i7 == org.telegram.messenger.ks.e2) {
            Integer num = (Integer) objArr[0];
            if (this.v0 == null) {
                return;
            }
            int i15 = 0;
            while (true) {
                k3[] k3VarArr3 = this.v0;
                if (i15 >= k3VarArr3.length) {
                    return;
                }
                int childCount3 = k3VarArr3[i15].b.getChildCount();
                int i16 = 0;
                while (true) {
                    if (i16 < childCount3) {
                        View childAt3 = this.v0[i15].b.getChildAt(i16);
                        if ((childAt3 instanceof x0) && (messageObject = (x0Var = (x0) childAt3).getMessageObject()) != null && messageObject.e1() == num.intValue()) {
                            org.telegram.messenger.fj fjVar = MediaController.B().v0;
                            if (fjVar != null) {
                                messageObject.b0 = fjVar.b0;
                                messageObject.i0 = fjVar.i0;
                                messageObject.j0 = fjVar.j0;
                                x0Var.b();
                            }
                        } else {
                            i16++;
                        }
                    }
                }
                i15++;
            }
        } else {
            if (i7 != org.telegram.messenger.ks.k4 || this.v0 == null) {
                return;
            }
            int i17 = 0;
            while (true) {
                k3[] k3VarArr4 = this.v0;
                if (i17 >= k3VarArr4.length) {
                    return;
                }
                int childCount4 = k3VarArr4[i17].b.getChildCount();
                for (int i18 = 0; i18 < childCount4; i18++) {
                    View childAt4 = this.v0[i17].b.getChildAt(i18);
                    if (childAt4 instanceof s2) {
                        ((s2) childAt4).e.invalidate();
                    } else {
                        childAt4.invalidate();
                    }
                }
                i17++;
            }
        }
    }

    public final void e(int i7, String str) {
        S();
        x2 x2Var = new x2();
        x2Var.x = str;
        this.e0.add(x2Var);
        this.i0.h(false);
        c0(i7, x2Var, false);
    }

    public final boolean f(TLRPC.WebPage webPage, String str, int i7) {
        S();
        this.e0.add(webPage);
        this.i0.h(false);
        c0(i7, webPage, false);
        return T(str, false);
    }

    public final void f0() {
        int i7;
        int size;
        if (this.F != null || this.v0[0].f()) {
            if (this.v0[0].f()) {
                i7 = this.v0[0].getWebView() == null ? 0 : this.v0[0].getWebView().getSearchIndex();
                size = this.v0[0].getWebView() == null ? 0 : this.v0[0].getWebView().getSearchCount();
            } else {
                i7 = this.H;
                size = this.F.size();
            }
            this.s0.setEnabled(size > 0 && i7 != 0);
            this.t0.setEnabled(size > 0 && i7 != size + (-1));
            ImageView imageView = this.s0;
            imageView.setAlpha(imageView.isEnabled() ? 1.0f : 0.5f);
            ImageView imageView2 = this.t0;
            imageView2.setAlpha(imageView2.isEnabled() ? 1.0f : 0.5f);
            this.u0.a();
            if (size < 0) {
                this.u0.setText("");
                return;
            }
            if (size == 0) {
                this.u0.setText(org.telegram.messenger.gd.M0(2131747975, null));
            } else if (size == 1) {
                this.u0.setText(org.telegram.messenger.gd.M0(2131747634, null));
            } else {
                this.u0.setText(String.format(org.telegram.messenger.gd.K0(size, "CountOfResults"), Integer.valueOf(i7 + 1), Integer.valueOf(size)));
            }
        }
    }

    public final void g0(boolean z10) {
        boolean z11 = false;
        this.i0.g(0, this.v0[0].getTitle(), z10);
        this.i0.f(0, this.v0[0].getSubtitle());
        this.i0.e(0, this.v0[0].f() && this.v0[0].getWebView() != null && this.v0[0].getWebView().F);
        this.i0.g(1, this.v0[1].getTitle(), z10);
        this.i0.f(1, this.v0[1].getSubtitle());
        l0 l0Var = this.i0;
        if (this.v0[1].f() && this.v0[1].getWebView() != null && this.v0[1].getWebView().F) {
            z11 = true;
        }
        l0Var.e(1, z11);
    }

    public final void i() {
        this.L0 = false;
        y2 y2Var = this.M0;
        if (y2Var != null) {
            this.g0.removeCallbacks(y2Var);
            this.M0 = null;
        }
        y2 y2Var2 = this.N0;
        if (y2Var2 != null) {
            this.g0.removeCallbacks(y2Var2);
            this.N0 = null;
        }
    }

    public final void k(org.telegram.messenger.ee eeVar) {
        if (this.K0 == org.telegram.messenger.g0.L(56.0f)) {
            if (eeVar != null) {
                eeVar.run();
                return;
            }
            return;
        }
        ValueAnimator duration = ValueAnimator.ofObject(new IntEvaluator(), Integer.valueOf(this.K0), Integer.valueOf(org.telegram.messenger.g0.L(56.0f))).setDuration(180L);
        duration.setInterpolator(new DecelerateInterpolator());
        duration.addUpdateListener(new p(this, 0));
        duration.addListener(new ki.n3(eeVar, 13));
        if (eeVar != null) {
            duration.setDuration(duration.getDuration() / 2);
        }
        duration.start();
    }

    public final void l() {
        v2 v2Var;
        hi.w wVar = this.v0[0].b;
        if (wVar == null || !this.X) {
            return;
        }
        float measuredHeight = wVar.getMeasuredHeight() / 2.0f;
        float f10 = 0.0f;
        v2 v2Var2 = null;
        for (int i7 = 0; i7 < wVar.getChildCount(); i7++) {
            View childAt = wVar.getChildAt(i7);
            if (childAt instanceof v2) {
                float measuredHeight2 = (childAt.getMeasuredHeight() / 2.0f) + childAt.getTop();
                if (v2Var2 == null || Math.abs(measuredHeight - measuredHeight2) < Math.abs(measuredHeight - f10)) {
                    v2Var2 = (v2) childAt;
                    f10 = measuredHeight2;
                }
            }
        }
        boolean z10 = PhotoViewer.p1().f;
        if (z10 || ((v2Var = this.y) != null && v2Var != v2Var2 && this.x != null)) {
            VideoPlayerHolderBase videoPlayerHolderBase = this.x;
            if (videoPlayerHolderBase != null) {
                v2 v2Var3 = this.y;
                long j3 = v2Var3.M.video_id;
                w2 a10 = w2.a(videoPlayerHolderBase, v2Var3);
                v2Var3.c(a10);
                this.E.k(a10, j3);
                v2 v2Var4 = this.y;
                w2 w2Var = v2Var4.N;
                if (w2Var != null) {
                    Bitmap bitmap = w2Var.b;
                    if (bitmap != null) {
                        v2Var4.e.v0(bitmap);
                    }
                    this.y.e(false);
                }
                this.x.release(null);
            }
            this.x = null;
            this.y = null;
        }
        if (z10 || v2Var2 == null) {
            return;
        }
        p50 p50Var = v2Var2.a;
        if (v2Var2.P != null && p50Var.x == null) {
            p50Var.x = new u2(v2Var2).with(v2Var2.n);
            TLRPC.Document document = v2Var2.P;
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                if (document.attributes.get(i10) instanceof TLRPC.TL_documentAttributeVideo) {
                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i10);
                    v2Var2.h.a(tL_documentAttributeVideo.w / tL_documentAttributeVideo.h, 0);
                }
            }
            TLRPC.WebPage webPage = v2Var2.b.F;
            Uri i11 = webPage != null ? org.telegram.messenger.s8.i(((g4) p50Var).Y, webPage, document) : null;
            if (i11 != null) {
                VideoPlayerHolderBase videoPlayerHolderBase2 = p50Var.x;
                w2 w2Var2 = v2Var2.N;
                videoPlayerHolderBase2.seekTo(w2Var2 == null ? 0L : w2Var2.a);
                p50Var.x.preparePlayer(i11, true, 1.0f);
                p50Var.x.play();
            }
        }
        this.y = v2Var2;
    }

    public final void m(boolean z10, boolean z11) {
        if (this.M == null || this.V0 || !this.W) {
            return;
        }
        int i7 = 0;
        if (this.a0 != 0 && Math.abs(this.c0 - System.currentTimeMillis()) >= 500) {
            Runnable runnable = this.b0;
            if (runnable != null) {
                runnable.run();
                this.b0 = null;
            }
            this.a0 = 0;
        }
        if (this.a0 != 0) {
            return;
        }
        t3 t3Var = this.L;
        if (t3Var != null) {
            t3Var.a(false);
            return;
        }
        if (this.Q.getVisibility() == 0) {
            if (this.P != null) {
                this.Q.setVisibility(4);
                this.T.onCustomViewHidden();
                this.Q.removeView(this.P);
                this.P = null;
            } else {
                org.telegram.ui.Components.w71 w71Var = this.G0;
                if (w71Var != null && w71Var.U) {
                    w71Var.U = false;
                    w71Var.m();
                    w71Var.l(false);
                }
            }
            if (!z11) {
                return;
            }
        }
        if (this.Q0.x()) {
            this.Q0.f(false);
            return;
        }
        l0 l0Var = this.i0;
        if (l0Var.U) {
            l0Var.h(false);
            return;
        }
        if (l0Var.a0) {
            l0Var.k(false);
            return;
        }
        if (this.H0 != 0) {
            ConnectionsManager.getInstance(this.Y).cancelRequest(this.H0, true);
            this.H0 = 0;
            Z(false);
        }
        if (this.I0 != 0) {
            ConnectionsManager.getInstance(this.Y).cancelRequest(this.I0, true);
            this.I0 = 0;
            Z(false);
        }
        S();
        if (z10 && !z11) {
            ArrayList arrayList = this.e0;
            if (arrayList.size() >= 2) {
                Object g10 = p5.c.g(1, arrayList);
                if (g10 instanceof x2) {
                    ((x2) g10).a();
                }
                if (g10 instanceof TLRPC.WebPage) {
                    org.telegram.ui.web.v1.o((TLRPC.WebPage) g10);
                }
                c0(-1, arrayList.get(arrayList.size() - 1), false);
                return;
            }
        }
        org.telegram.messenger.ks.f(this.Y).n(this, org.telegram.messenger.ks.e2);
        org.telegram.messenger.ks.f(this.Y).n(this, org.telegram.messenger.ks.f2);
        org.telegram.messenger.ks.f(this.Y).n(this, org.telegram.messenger.ks.g2);
        org.telegram.messenger.ks.f(this.Y).n(this, org.telegram.messenger.ks.h2);
        org.telegram.messenger.ks.f(this.Y).n(this, org.telegram.messenger.ks.k4);
        bg.v0 v0Var = this.W0;
        if (v0Var != null) {
            v0Var.a();
            this.W0 = null;
        }
        this.N = null;
        try {
            org.telegram.ui.ActionBar.x2 x2Var = this.l0;
            if (x2Var != null) {
                x2Var.dismiss();
                this.l0 = null;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArticleViewer$WindowView articleViewer$WindowView = this.g0;
        Property property = View.ALPHA;
        animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, (Property<ArticleViewer$WindowView, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.h0, (Property<k0, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.g0, (Property<ArticleViewer$WindowView, Float>) View.TRANSLATION_X, 0.0f, org.telegram.messenger.g0.L(56.0f)));
        this.a0 = 2;
        this.b0 = new z(this, 10);
        animatorSet.setDuration(150L);
        animatorSet.setInterpolator(this.d0);
        animatorSet.addListener(new ki.n3(this, 14));
        this.c0 = System.currentTimeMillis();
        this.h0.setLayerType(2, null);
        animatorSet.start();
        while (true) {
            a0.h hVar = this.E;
            if (i7 >= hVar.m()) {
                hVar.b();
                return;
            }
            w2 w2Var = (w2) hVar.n(i7);
            Bitmap bitmap = w2Var.b;
            if (bitmap != null) {
                bitmap.recycle();
                w2Var.b = null;
            }
            i7++;
        }
    }

    public final void q() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.e0;
            if (i7 >= arrayList.size()) {
                arrayList.clear();
                r();
                return;
            }
            Object obj = arrayList.get(i7);
            if (obj instanceof x2) {
                k3 k3Var = this.v0[0];
                if (k3Var != null && k3Var.L == obj) {
                    ((x2) obj).c(k3Var);
                }
                k3 k3Var2 = this.v0[1];
                if (k3Var2 != null && k3Var2.L == obj) {
                    ((x2) obj).c(k3Var2);
                }
                ((x2) obj).a();
            } else if (obj instanceof TLRPC.WebPage) {
                org.telegram.ui.web.v1.o((TLRPC.WebPage) obj);
            }
            i7++;
        }
    }

    public final void r() {
        ArticleViewer$WindowView articleViewer$WindowView;
        if (this.M == null || (articleViewer$WindowView = this.g0) == null) {
            return;
        }
        if (this.L == null) {
            try {
                if (articleViewer$WindowView.getParent() != null) {
                    ((WindowManager) this.M.getSystemService("window")).removeViewImmediate(this.g0);
                }
                this.g0 = null;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        for (int i7 = 0; i7 < this.O.size(); i7++) {
            ((q1) this.O.get(i7)).a(true);
        }
        this.O.clear();
        try {
            this.M.getWindow().clearFlags(128);
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        this.M = null;
        this.N = null;
        e1 = null;
    }

    public g4(org.telegram.ui.ActionBar.h2 h2Var) {
        this.O = new ArrayList();
        this.Z = 1;
        this.d0 = new DecelerateInterpolator(1.5f);
        this.e0 = new ArrayList();
        this.x0 = new Paint();
        this.y0 = new Paint();
        this.z0 = new Paint();
        this.B0 = new Paint();
        this.L0 = false;
        this.M0 = null;
        this.N0 = null;
        this.T0 = new h2.f(new int[]{org.telegram.messenger.ks.s, org.telegram.messenger.ks.t});
        this.U0 = new k0[2];
        this.Y0 = -1;
        z zVar = new z(this, 4);
        org.telegram.ui.Components.lr lrVar = org.telegram.ui.Components.lr.h;
        this.b1 = new org.telegram.ui.Components.f5(zVar, 320L, lrVar);
        this.c1 = new org.telegram.ui.Components.f5(new z(this, 5), 320L, lrVar);
        this.K = true;
        this.L = new t3(this, h2Var);
        W(h2Var.getParentActivity(), h2Var);
    }
}
