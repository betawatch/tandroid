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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h4 extends m60 implements org.telegram.messenger.us {
    public static Paint A1;
    public static Paint C1;
    public static TextPaint h1;
    public static TextPaint i1;
    public static TextPaint j1;
    public static TextPaint k1;
    public static TextPaint l1;
    public static TextPaint m1;
    public static TextPaint n1;
    public static TextPaint o1;
    public static Paint p1;
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
    public final Paint A0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout B0;
    public TextView C0;
    public Rect D0;
    public org.telegram.ui.Components.m81 E0;
    public org.telegram.ui.Components.m81 F0;
    public int G0;
    public int H0;
    public int I0;
    public final boolean J;
    public int J0;
    public final u3 K;
    public boolean K0;
    public Activity L;
    public y2 L0;
    public org.telegram.ui.ActionBar.k2 M;
    public y2 M0;
    public final ArrayList N;
    public gf.e N0;
    public View O;
    public int O0;
    public FrameLayout P;
    public org.telegram.ui.Cells.k9 P0;
    public TextureView Q;
    public org.telegram.ui.Cells.k9 Q0;
    public k4 R;
    public qs0 R0;
    public WebChromeClient.CustomViewCallback S;
    public final e2.f S0;
    public WindowInsets T;
    public final l0[] T0;
    public boolean U;
    public boolean U0;
    public boolean V;
    public aa0 V0;
    public boolean W;
    public ag.o0 W0;
    public int X;
    public int X0;
    public int Y;
    public ValueAnimator Y0;
    public int Z;
    public float Z0;
    public Runnable a0;
    public final org.telegram.ui.Components.w4 a1;
    public long b0;
    public final org.telegram.ui.Components.w4 b1;
    public final DecelerateInterpolator c0;
    public final ArrayList d0;
    public WindowManager.LayoutParams e0;
    public ArticleViewer$WindowView f0;
    public l0 g0;
    public m0 h0;
    public org.telegram.ui.web.j i0;
    public y j0;
    public org.telegram.ui.ActionBar.z2 k0;
    public Paint l0;
    public Drawable m0;
    public Paint n0;
    public boolean o0;
    public float p0;
    public org.telegram.ui.Cells.a5 q0;
    public ImageView r0;
    public ImageView s0;
    public org.telegram.ui.Components.f6 t0;
    public l3[] u0;
    public AnimatorSet v0;
    public final Paint w0;
    public final Paint x0;
    public final Paint y0;
    public boolean z0;
    public static final HashSet c1 = new HashSet();
    public static volatile h4 d1 = null;
    public static final s0 e1 = new s0("innerTranslationX", 0);
    public static final TextPaint f1 = new TextPaint(1);
    public static final p3 g1 = new p3();
    public static final WeakHashMap B1 = new WeakHashMap();

    public h4() {
        this.N = new ArrayList();
        this.Y = 1;
        this.c0 = new DecelerateInterpolator(1.5f);
        this.d0 = new ArrayList();
        this.w0 = new Paint();
        this.x0 = new Paint();
        this.y0 = new Paint();
        this.A0 = new Paint();
        this.K0 = false;
        this.L0 = null;
        this.M0 = null;
        this.S0 = new e2.f(new int[]{org.telegram.messenger.zs.s, org.telegram.messenger.zs.t});
        this.T0 = new l0[2];
        this.X0 = -1;
        y yVar = new y(this, 4);
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.a1 = new org.telegram.ui.Components.w4(yVar, 320L, grVar);
        this.b1 = new org.telegram.ui.Components.w4(new y(this, 5), 320L, grVar);
        this.J = false;
        this.K = null;
    }

    public static CharSequence A(m60 m60Var, TLRPC.WebPage webPage, View view, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock, int i10) {
        TextPaint C;
        if (richText2 == null) {
            return null;
        }
        if (richText2 instanceof TL_iv.textFixed) {
            return A(m60Var, webPage, view, richText, ((TL_iv.textFixed) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textItalic) {
            return A(m60Var, webPage, view, richText, ((TL_iv.textItalic) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textBold) {
            return A(m60Var, webPage, view, richText, ((TL_iv.textBold) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textUnderline) {
            return A(m60Var, webPage, view, richText, ((TL_iv.textUnderline) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textStrike) {
            return A(m60Var, webPage, view, richText, ((TL_iv.textStrike) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textEmail) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A(m60Var, webPage, view, richText, ((TL_iv.textEmail) richText2).text, pageBlock, i10));
            MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder.length() != 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.uz0((metricAffectingSpanArr == null || metricAffectingSpanArr.length == 0) ? C(m60Var, richText, richText2, pageBlock) : null, "mailto:" + D(richText2)), 0, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        long j10 = 0;
        if (richText2 instanceof TL_iv.textUrl) {
            TL_iv.textUrl texturl = (TL_iv.textUrl) richText2;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(A(m60Var, webPage, view, richText, texturl.text, pageBlock, i10));
            MetricAffectingSpan[] metricAffectingSpanArr2 = (MetricAffectingSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), MetricAffectingSpan.class);
            C = (metricAffectingSpanArr2 == null || metricAffectingSpanArr2.length == 0) ? C(m60Var, richText, richText2, pageBlock) : null;
            Object vz0Var = texturl.webpage_id != 0 ? new org.telegram.ui.Components.vz0(C, D(richText2)) : new org.telegram.ui.Components.uz0(C, D(richText2));
            if (spannableStringBuilder2.length() != 0) {
                spannableStringBuilder2.setSpan(vz0Var, 0, spannableStringBuilder2.length(), 33);
            }
            return spannableStringBuilder2;
        }
        if (richText2 instanceof TL_iv.textPlain) {
            return ((TL_iv.textPlain) richText2).text;
        }
        if (richText2 instanceof TL_iv.textAnchor) {
            TL_iv.textAnchor textanchor = (TL_iv.textAnchor) richText2;
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(A(m60Var, webPage, view, richText, textanchor.text, pageBlock, i10));
            String str = textanchor.name;
            org.telegram.ui.Components.t4 t4Var = new org.telegram.ui.Components.t4();
            t4Var.a = str.toLowerCase();
            spannableStringBuilder3.setSpan(t4Var, 0, spannableStringBuilder3.length(), 17);
            return spannableStringBuilder3;
        }
        if (richText2 instanceof TL_iv.textEmpty) {
            return "";
        }
        if (richText2 instanceof TL_iv.textConcat) {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
            int size = richText2.texts.size();
            int i11 = 0;
            while (i11 < size) {
                TL_iv.RichText richText3 = richText2.texts.get(i11);
                TL_iv.RichText y3 = y(richText3);
                boolean z10 = i10 >= 0 && (richText3 instanceof TL_iv.textUrl) && ((TL_iv.textUrl) richText3).webpage_id != j10;
                if (z10 && spannableStringBuilder4.length() != 0 && spannableStringBuilder4.charAt(spannableStringBuilder4.length() - 1) != '\n') {
                    spannableStringBuilder4.append((CharSequence) " ");
                    spannableStringBuilder4.setSpan(new org.telegram.ui.Cells.m9(), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                }
                CharSequence A = A(m60Var, webPage, view, richText, richText3, pageBlock, i10);
                int B = B(y3);
                int length = spannableStringBuilder4.length();
                spannableStringBuilder4.append(A);
                if (B != 0 && !(A instanceof SpannableStringBuilder)) {
                    if ((B & 8) != 0 || (B & 512) != 0) {
                        String D = D(richText3);
                        if (D == null) {
                            D = D(richText);
                        }
                        Object vz0Var2 = (B & 512) != 0 ? new org.telegram.ui.Components.vz0(C(m60Var, richText, y3, pageBlock), D) : new org.telegram.ui.Components.uz0(C(m60Var, richText, y3, pageBlock), D);
                        if (length != spannableStringBuilder4.length()) {
                            spannableStringBuilder4.setSpan(vz0Var2, length, spannableStringBuilder4.length(), 33);
                        }
                    } else if (length != spannableStringBuilder4.length()) {
                        TextPaint C2 = C(m60Var, richText, y3, pageBlock);
                        org.telegram.ui.Components.tz0 tz0Var = new org.telegram.ui.Components.tz0();
                        tz0Var.a = C2;
                        spannableStringBuilder4.setSpan(tz0Var, length, spannableStringBuilder4.length(), 33);
                    }
                }
                if (z10 && i11 != size - 1) {
                    spannableStringBuilder4.append((CharSequence) " ");
                    spannableStringBuilder4.setSpan(new org.telegram.ui.Cells.m9(), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                }
                i11++;
                j10 = 0;
            }
            return spannableStringBuilder4;
        }
        if (richText2 instanceof TL_iv.textSubscript) {
            return A(m60Var, webPage, view, richText, ((TL_iv.textSubscript) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textSuperscript) {
            return A(m60Var, webPage, view, richText, ((TL_iv.textSuperscript) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textMarked) {
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(A(m60Var, webPage, view, richText, ((TL_iv.textMarked) richText2).text, pageBlock, i10));
            MetricAffectingSpan[] metricAffectingSpanArr3 = (MetricAffectingSpan[]) spannableStringBuilder5.getSpans(0, spannableStringBuilder5.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder5.length() != 0) {
                C = (metricAffectingSpanArr3 == null || metricAffectingSpanArr3.length == 0) ? C(m60Var, richText, richText2, pageBlock) : null;
                org.telegram.ui.Components.sz0 sz0Var = new org.telegram.ui.Components.sz0();
                sz0Var.a = C;
                spannableStringBuilder5.setSpan(sz0Var, 0, spannableStringBuilder5.length(), 33);
            }
            return spannableStringBuilder5;
        }
        if (richText2 instanceof TL_iv.textSpoiler) {
            SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(A(m60Var, webPage, view, richText, ((TL_iv.textSpoiler) richText2).text, pageBlock, i10));
            if (spannableStringBuilder6.length() != 0) {
                org.telegram.ui.Components.yz0 yz0Var = new org.telegram.ui.Components.yz0();
                yz0Var.a |= 256;
                spannableStringBuilder6.setSpan(new org.telegram.ui.Components.zz0(yz0Var, 0), 0, spannableStringBuilder6.length(), 33);
            }
            return spannableStringBuilder6;
        }
        if (richText2 instanceof TL_iv.textPhone) {
            SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(A(m60Var, webPage, view, richText, ((TL_iv.textPhone) richText2).text, pageBlock, i10));
            MetricAffectingSpan[] metricAffectingSpanArr4 = (MetricAffectingSpan[]) spannableStringBuilder7.getSpans(0, spannableStringBuilder7.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder7.length() != 0) {
                spannableStringBuilder7.setSpan(new org.telegram.ui.Components.uz0((metricAffectingSpanArr4 == null || metricAffectingSpanArr4.length == 0) ? C(m60Var, richText, richText2, pageBlock) : null, "tel:" + D(richText2)), 0, spannableStringBuilder7.length(), 33);
            }
            return spannableStringBuilder7;
        }
        if (richText2 instanceof TL_iv.textImage) {
            TL_iv.textImage textimage = (TL_iv.textImage) richText2;
            TLRPC.Document a2 = e4.a(webPage, textimage.document_id);
            TLRPC.Photo e = e4.e(webPage, textimage.photo_id);
            if (a2 != null) {
                SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder("*");
                int L = org.telegram.messenger.i0.L(textimage.w);
                int L2 = org.telegram.messenger.i0.L(textimage.h);
                int abs = Math.abs(i10);
                if (L > abs) {
                    L2 = (int) (L2 * (abs / L));
                    L = abs;
                }
                if (view != null) {
                    int i12 = org.telegram.ui.ActionBar.t6.d6;
                    ((h4) m60Var).getClass();
                    boolean z11 = org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.x0(null, i12, false)) <= 0.705f;
                    org.telegram.ui.Components.rz0 rz0Var = new org.telegram.ui.Components.rz0();
                    Locale locale = Locale.US;
                    String str2 = L + "_" + L2 + "_i";
                    rz0Var.b = L;
                    rz0Var.c = L2;
                    boolean z12 = z11;
                    ImageReceiver imageReceiver = new ImageReceiver(view);
                    rz0Var.a = imageReceiver;
                    imageReceiver.J0 = true;
                    if (z12) {
                        imageReceiver.g1 = new org.telegram.ui.Components.au(29);
                    }
                    imageReceiver.r0(org.telegram.messenger.ic.b(a2), str2, org.telegram.messenger.ic.c(org.telegram.messenger.b8.w(a2.thumbs, 90, false, null, false), a2), str2, null, -1L, null, webPage, 1);
                    spannableStringBuilder8.setSpan(rz0Var, 0, spannableStringBuilder8.length(), 33);
                }
                return spannableStringBuilder8;
            }
            if (e instanceof org.telegram.ui.web.x1) {
                org.telegram.ui.web.x1 x1Var = (org.telegram.ui.web.x1) e;
                SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder("*");
                int L3 = org.telegram.messenger.i0.L(textimage.w);
                int L4 = org.telegram.messenger.i0.L(textimage.h);
                int abs2 = Math.abs(i10);
                if (L3 > abs2) {
                    L4 = (int) (L4 * (abs2 / L3));
                    L3 = abs2;
                }
                if (view != null) {
                    org.telegram.ui.Components.rz0 rz0Var2 = new org.telegram.ui.Components.rz0();
                    rz0Var2.b = L3;
                    rz0Var2.c = L4;
                    ImageReceiver imageReceiver2 = new ImageReceiver(view);
                    rz0Var2.a = imageReceiver2;
                    imageReceiver2.J0 = true;
                    org.telegram.ui.web.y1.g(x1Var, imageReceiver2, new org.telegram.messenger.rz(25));
                    spannableStringBuilder9.setSpan(rz0Var2, 0, spannableStringBuilder9.length(), 33);
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
                bi.u a10 = bi.u.a(textmath.source, org.telegram.messenger.i0.L(20.0f), true);
                if (a10 != null) {
                    textmath.w = a10.b;
                    textmath.h = a10.c;
                    textmath.depth = a10.d;
                    textmath.bitmap = a10.a;
                }
            }
            if (textmath.bitmap != null) {
                SpannableStringBuilder spannableStringBuilder10 = new SpannableStringBuilder("￼");
                Bitmap bitmap = textmath.bitmap;
                int i13 = textmath.w;
                int i14 = textmath.h;
                int i15 = org.telegram.ui.ActionBar.t6.G6;
                ((h4) m60Var).getClass();
                spannableStringBuilder10.setSpan(new org.telegram.ui.Components.rz0(view, bitmap, i13, i14, org.telegram.ui.ActionBar.t6.x0(null, i15, false), textmath.depth), 0, spannableStringBuilder10.length(), 33);
                String str3 = textmath.source;
                if (str3 != null && !str3.isEmpty()) {
                    spannableStringBuilder10.setSpan(new org.telegram.ui.Cells.p9(textmath.source), 0, spannableStringBuilder10.length(), 33);
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
    public static TextPaint C(m60 m60Var, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock) {
        int i10;
        int i11;
        int x02;
        SparseArray sparseArray;
        int L;
        int x03;
        int L2;
        int L3;
        int L4;
        int L5;
        int i12;
        int L6;
        int i13;
        int L7;
        int B = B(richText2);
        int L8 = org.telegram.messenger.i0.L(14.0f);
        ((h4) m60Var).getClass();
        p3 p3Var = g1;
        p3Var.getClass();
        SparseArray sparseArray2 = p3Var.x;
        SparseArray sparseArray3 = p3Var.w;
        SparseArray sparseArray4 = p3Var.t;
        SparseArray sparseArray5 = p3Var.c;
        SparseArray sparseArray6 = p3Var.b;
        int L9 = org.telegram.messenger.i0.L(org.telegram.messenger.tz.Z0 - 16);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            TL_iv.RichText richText3 = ((TL_iv.pageBlockPhoto) pageBlock).caption.text;
            if (richText3 == richText2 || richText3 == richText) {
                L7 = org.telegram.messenger.i0.L(14.0f);
                sparseArray5 = sparseArray6;
            } else {
                L7 = org.telegram.messenger.i0.L(12.0f);
            }
            L8 = L7;
            x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.y6, false);
        } else if (pageBlock instanceof TL_iv.pageBlockMap) {
            TL_iv.RichText richText4 = ((TL_iv.pageBlockMap) pageBlock).caption.text;
            if (richText4 == richText2 || richText4 == richText) {
                L6 = org.telegram.messenger.i0.L(14.0f);
                sparseArray5 = sparseArray6;
            } else {
                L6 = org.telegram.messenger.i0.L(12.0f);
            }
            L8 = L6;
            x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.y6, false);
        } else {
            if (pageBlock instanceof TL_iv.pageBlockTitle) {
                sparseArray = p3Var.d;
                L8 = org.telegram.messenger.i0.L(23.0f);
                i11 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockKicker) {
                sparseArray = p3Var.e;
                L8 = org.telegram.messenger.i0.L(14.0f);
                i11 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockAuthorDate) {
                sparseArray = p3Var.o;
                L8 = org.telegram.messenger.i0.L(14.0f);
                i11 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.y6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockFooter) {
                sparseArray = p3Var.p;
                L8 = org.telegram.messenger.i0.L(14.0f);
                i11 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.y6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockSubtitle) {
                sparseArray = p3Var.g;
                L8 = org.telegram.messenger.i0.L(20.0f);
                i11 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
                sparseArray = p3Var.f;
                L8 = org.telegram.messenger.i0.L(20.0f);
                i11 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
                sparseArray = p3Var.h;
                L8 = org.telegram.messenger.i0.L(17.0f);
                i11 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockHeading1) {
                sparseArray = p3Var.i;
                L8 = org.telegram.messenger.i0.L(18.0f);
                i11 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockHeading2) {
                sparseArray = p3Var.j;
                L8 = org.telegram.messenger.i0.L(16.0f);
                i11 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockHeading3) {
                sparseArray = p3Var.k;
                L8 = org.telegram.messenger.i0.L(15.0f);
                i11 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockHeading4) {
                sparseArray = p3Var.l;
                L8 = org.telegram.messenger.i0.L(14.0f);
                i11 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockHeading5) {
                sparseArray = p3Var.m;
                L8 = org.telegram.messenger.i0.L(13.0f);
                i11 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false);
            } else {
                if (!(pageBlock instanceof TL_iv.pageBlockHeading6)) {
                    if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
                        if (pageblockblockquote.text == richText) {
                            L8 = org.telegram.messenger.i0.L(15.0f);
                            i12 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false);
                        } else if (pageblockblockquote.caption == richText) {
                            L8 = org.telegram.messenger.i0.L(14.0f);
                            i12 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.y6, false);
                            sparseArray4 = sparseArray6;
                        } else {
                            sparseArray4 = null;
                            i12 = -65536;
                        }
                        i11 = i12;
                        sparseArray5 = sparseArray4;
                        i10 = 0;
                    } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                        TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
                        if (pageblockpullquote.text == richText) {
                            L8 = org.telegram.messenger.i0.L(15.0f);
                            i12 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false);
                        } else if (pageblockpullquote.caption == richText) {
                            L8 = org.telegram.messenger.i0.L(14.0f);
                            i12 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.y6, false);
                            sparseArray4 = sparseArray6;
                        } else {
                            i12 = -65536;
                            sparseArray4 = null;
                        }
                        i11 = i12;
                        sparseArray5 = sparseArray4;
                        i10 = 0;
                    } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
                        if (pageblockpreformatted.codeLength < 0) {
                            pageblockpreformatted.codeLength = org.telegram.ui.Components.g90.p(pageblockpreformatted.text).length();
                        }
                        int i14 = pageblockpreformatted.codeLength;
                        int i15 = i14 > 500 ? 3 : i14 > 220 ? 2 : i14 > 80 ? 1 : 0;
                        SparseArray sparseArray7 = p3Var.s;
                        L8 = org.telegram.messenger.i0.L(14 - i15);
                        B |= 4;
                        i10 = i15 << 16;
                        sparseArray5 = sparseArray7;
                        i11 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false);
                    } else if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                        sparseArray = p3Var.q;
                        L8 = org.telegram.messenger.i0.L(16.0f);
                        i11 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false);
                    } else if (J(pageBlock)) {
                        sparseArray = p3Var.r;
                        L8 = org.telegram.messenger.i0.L(16.0f);
                        i11 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false);
                    } else if (pageBlock instanceof TL_iv.pageBlockEmbed) {
                        TL_iv.RichText richText5 = ((TL_iv.pageBlockEmbed) pageBlock).caption.text;
                        if (richText5 == richText2 || richText5 == richText) {
                            L5 = org.telegram.messenger.i0.L(14.0f);
                            sparseArray5 = sparseArray6;
                        } else {
                            L5 = org.telegram.messenger.i0.L(12.0f);
                        }
                        L8 = L5;
                        x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.y6, false);
                    } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                        TL_iv.RichText richText6 = ((TL_iv.pageBlockSlideshow) pageBlock).caption.text;
                        if (richText6 == richText2 || richText6 == richText) {
                            L4 = org.telegram.messenger.i0.L(14.0f);
                            sparseArray5 = sparseArray6;
                        } else {
                            L4 = org.telegram.messenger.i0.L(12.0f);
                        }
                        L8 = L4;
                        x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.y6, false);
                    } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
                        TL_iv.RichText richText7 = ((TL_iv.pageBlockCollage) pageBlock).caption.text;
                        if (richText7 == richText2 || richText7 == richText) {
                            L3 = org.telegram.messenger.i0.L(14.0f);
                            sparseArray5 = sparseArray6;
                        } else {
                            L3 = org.telegram.messenger.i0.L(12.0f);
                        }
                        L8 = L3;
                        x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.y6, false);
                    } else if (pageBlock instanceof TL_iv.pageBlockEmbedPost) {
                        TL_iv.PageCaption pageCaption = ((TL_iv.pageBlockEmbedPost) pageBlock).caption;
                        if (richText2 == pageCaption.text) {
                            L8 = org.telegram.messenger.i0.L(14.0f);
                            x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.y6, false);
                            sparseArray5 = sparseArray6;
                        } else if (richText2 == pageCaption.credit) {
                            L8 = org.telegram.messenger.i0.L(12.0f);
                            x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.y6, false);
                        } else if (richText2 != null) {
                            sparseArray5 = p3Var.u;
                            L8 = org.telegram.messenger.i0.L(14.0f);
                            x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false);
                        } else {
                            x02 = -65536;
                            sparseArray5 = null;
                        }
                    } else {
                        if (pageBlock instanceof TL_iv.pageBlockVideo) {
                            if (richText2 == ((TL_iv.pageBlockVideo) pageBlock).caption.text) {
                                L2 = org.telegram.messenger.i0.L(14.0f);
                                sparseArray2 = sparseArray3;
                            } else {
                                L2 = org.telegram.messenger.i0.L(12.0f);
                            }
                            L8 = L2;
                            x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false);
                        } else if (pageBlock instanceof TL_iv.pageBlockAudio) {
                            if (richText2 == ((TL_iv.pageBlockAudio) pageBlock).caption.text) {
                                L = org.telegram.messenger.i0.L(14.0f);
                                sparseArray2 = sparseArray3;
                            } else {
                                L = org.telegram.messenger.i0.L(12.0f);
                            }
                            L8 = L;
                            x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false);
                        } else if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                            sparseArray = p3Var.y;
                            L8 = org.telegram.messenger.i0.L(15.0f);
                            i11 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.y6, false);
                        } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                            sparseArray = p3Var.z;
                            L8 = org.telegram.messenger.i0.L(15.0f);
                            i11 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false);
                        } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                            sparseArray5 = p3Var.A;
                            L8 = org.telegram.messenger.i0.L(15.0f);
                            x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false);
                        } else {
                            i10 = 0;
                            i11 = -65536;
                            sparseArray5 = null;
                        }
                        i11 = x03;
                        sparseArray5 = sparseArray2;
                        i10 = 0;
                    }
                    i13 = B & 256;
                    if (i13 == 0 || (B & 128) != 0) {
                        L8 -= org.telegram.messenger.i0.L(4.0f);
                    }
                    if (sparseArray5 == null) {
                        if (p3Var.a == null) {
                            TextPaint textPaint = new TextPaint(1);
                            p3Var.a = textPaint;
                            textPaint.setColor(-65536);
                        }
                        p3Var.a.setTextSize(org.telegram.messenger.i0.L(14.0f));
                        return p3Var.a;
                    }
                    int i16 = i10 | B;
                    TextPaint textPaint2 = (TextPaint) sparseArray5.get(i16);
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint(1);
                        if ((B & 4) != 0) {
                            textPaint2.setTypeface(org.telegram.messenger.i0.o1("fonts/rmono.ttf"));
                        } else if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                            textPaint2.setTypeface(org.telegram.messenger.i0.o());
                        } else if (m60Var.a != 1 && !(pageBlock instanceof TL_iv.pageBlockTitle) && !(pageBlock instanceof TL_iv.pageBlockKicker) && !(pageBlock instanceof TL_iv.pageBlockHeader) && !(pageBlock instanceof TL_iv.pageBlockSubtitle) && !(pageBlock instanceof TL_iv.pageBlockSubheader) && !I(pageBlock)) {
                            int i17 = B & 1;
                            if (i17 != 0 && (B & 2) != 0) {
                                textPaint2.setTypeface(org.telegram.messenger.i0.o1("fonts/rmediumitalic.ttf"));
                            } else if (i17 != 0) {
                                textPaint2.setTypeface(org.telegram.messenger.i0.o1("fonts/rmedium.ttf"));
                            } else if ((B & 2) != 0) {
                                textPaint2.setTypeface(org.telegram.messenger.i0.o1("fonts/ritalic.ttf"));
                            }
                        } else if ((pageBlock instanceof TL_iv.pageBlockTitle) || (pageBlock instanceof TL_iv.pageBlockHeader) || (pageBlock instanceof TL_iv.pageBlockSubtitle) || (pageBlock instanceof TL_iv.pageBlockSubheader) || I(pageBlock)) {
                            textPaint2.setTypeface(org.telegram.messenger.i0.o1("fonts/mw_bold.ttf"));
                        } else {
                            int i18 = B & 1;
                            if (i18 != 0 && (B & 2) != 0) {
                                textPaint2.setTypeface(Typeface.create("serif", 3));
                            } else if (i18 != 0) {
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
                            i11 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.J6, false);
                        }
                        if (i13 != 0) {
                            textPaint2.baselineShift -= org.telegram.messenger.i0.L(6.0f);
                        } else if ((B & 128) != 0) {
                            textPaint2.baselineShift = org.telegram.messenger.i0.L(2.0f) + textPaint2.baselineShift;
                        }
                        textPaint2.setColor(i11);
                        sparseArray5.put(i16, textPaint2);
                    }
                    textPaint2.setTextSize(L8 + L9);
                    return textPaint2;
                }
                sparseArray = p3Var.n;
                L8 = org.telegram.messenger.i0.L(12.0f);
                i11 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false);
            }
            sparseArray5 = sparseArray;
            i10 = 0;
            i13 = B & 256;
            if (i13 == 0) {
            }
            L8 -= org.telegram.messenger.i0.L(4.0f);
            if (sparseArray5 == null) {
            }
        }
        i11 = x02;
        i10 = 0;
        i13 = B & 256;
        if (i13 == 0) {
        }
        L8 -= org.telegram.messenger.i0.L(4.0f);
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
        return d1 != null;
    }

    public static boolean I(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
    }

    public static boolean J(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof x3) || (pageBlock instanceof z3);
    }

    public static boolean M(v3 v3Var) {
        boolean z10;
        TL_iv.PageBlock x10 = x(v3Var.a);
        if (x10 instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) x10;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                return true;
            }
        } else if (x10 instanceof v3) {
            v3 v3Var2 = (v3) x10;
            TL_iv.PageBlock x11 = x(v3Var2.b);
            if (x11 instanceof TL_iv.pageBlockDetails) {
                TL_iv.pageBlockDetails pageblockdetails2 = (TL_iv.pageBlockDetails) x11;
                if (!pageblockdetails2.open) {
                    pageblockdetails2.open = true;
                    z10 = true;
                    if (!M(v3Var2) || z10) {
                        return true;
                    }
                }
            }
            z10 = false;
            if (!M(v3Var2)) {
            }
            return true;
        }
        return false;
    }

    public static void R(m60 m60Var) {
        if (m60Var.b == null && m60Var.f == null) {
            return;
        }
        View view = m60Var.f;
        m60Var.c.f(true);
        m60Var.b = null;
        m60Var.d = null;
        m60Var.f = null;
        if (view != null) {
            view.invalidate();
        }
    }

    public static /* synthetic */ WindowInsets c(WindowInsets windowInsets) {
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public static void d(String str, int i10, FrameLayout frameLayout, u3 u3Var, org.telegram.ui.ActionBar.p6 p6Var) {
        String u10 = org.telegram.ui.web.z0.u(str);
        long e = org.telegram.messenger.d20.i(i10).e();
        org.telegram.messenger.qz.C(i10).r0(org.telegram.messenger.oz.a(e, u10));
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_message.peer_id = tL_peerUser;
        tL_peerUser.user_id = e;
        TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
        tL_message.from_id = tL_peerUser2;
        tL_peerUser2.user_id = e;
        tL_message.message = u10;
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
        tL_message.media = tL_messageMediaWebPage;
        tL_messageMediaWebPage.webpage = new TLRPC.TL_webPage();
        TLRPC.WebPage webPage = tL_message.media.webpage;
        webPage.url = u10;
        webPage.display_url = u10;
        org.telegram.messenger.zs.f(i10).k(org.telegram.messenger.zs.H1, new org.telegram.messenger.jj(i10, tL_message, false, false));
        new org.telegram.ui.Components.cc(frameLayout, p6Var).Q(R.raw.saved_messages, 36, org.telegram.messenger.i0.T2(org.telegram.messenger.cd.L0(2131742966, null), new bi.e(u3Var, e, 8))).k(true);
    }

    public static void e0(m60 m60Var) {
        TextPaint textPaint = n1;
        if (textPaint != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
        }
        TextPaint textPaint2 = o1;
        if (textPaint2 != null) {
            textPaint2.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
        }
        TextPaint textPaint3 = h1;
        if (textPaint3 != null) {
            textPaint3.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
        }
        TextPaint textPaint4 = j1;
        if (textPaint4 != null) {
            textPaint4.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
        }
        TextPaint textPaint5 = k1;
        if (textPaint5 != null) {
            textPaint5.setColor(-1);
        }
        TextPaint textPaint6 = l1;
        if (textPaint6 != null) {
            textPaint6.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
        }
        TextPaint textPaint7 = m1;
        if (textPaint7 != null) {
            textPaint7.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.y6, false));
        }
        TextPaint textPaint8 = i1;
        if (textPaint8 != null) {
            textPaint8.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.y6, false));
        }
        p(m60Var, true);
        p3 p3Var = g1;
        p3.a(m60Var, p3Var.d);
        p3.a(m60Var, p3Var.e);
        p3.a(m60Var, p3Var.g);
        p3.a(m60Var, p3Var.f);
        p3.a(m60Var, p3Var.h);
        p3.a(m60Var, p3Var.i);
        p3.a(m60Var, p3Var.j);
        p3.a(m60Var, p3Var.k);
        p3.a(m60Var, p3Var.l);
        p3.a(m60Var, p3Var.m);
        p3.a(m60Var, p3Var.n);
        p3.a(m60Var, p3Var.t);
        p3.a(m60Var, p3Var.s);
        p3.a(m60Var, p3Var.q);
        p3.a(m60Var, p3Var.r);
        p3.a(m60Var, p3Var.u);
        p3.a(m60Var, p3Var.w);
        p3.a(m60Var, p3Var.x);
        p3.a(m60Var, p3Var.b);
        p3.a(m60Var, p3Var.c);
        p3.a(m60Var, p3Var.o);
        p3.a(m60Var, p3Var.p);
        p3.a(m60Var, p3Var.v);
        p3.a(m60Var, p3Var.y);
        p3.a(m60Var, p3Var.z);
        p3.a(m60Var, p3Var.A);
    }

    public static SpannableStringBuilder g(int i10, CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (charSequence != null) {
            spannableStringBuilder.append(charSequence);
        }
        if (spannableStringBuilder.length() > 0) {
            spannableStringBuilder.append((CharSequence) ", ");
        }
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.L0(i10, null));
        return spannableStringBuilder;
    }

    public static CharSequence h(m60 m60Var, f4 f4Var, z2 z2Var) {
        StaticLayout staticLayout;
        if (z2Var == null || (staticLayout = z2Var.d) == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = z2Var.D;
        if (spannableStringBuilder != null) {
            return spannableStringBuilder;
        }
        CharSequence text = staticLayout.getText();
        if (!(text instanceof Spannable)) {
            return text;
        }
        Spannable spannable = (Spannable) text;
        org.telegram.ui.Components.uz0[] uz0VarArr = (org.telegram.ui.Components.uz0[]) spannable.getSpans(0, spannable.length(), org.telegram.ui.Components.uz0.class);
        CharSequence charSequence = text;
        if (uz0VarArr != null) {
            charSequence = text;
            if (uz0VarArr.length != 0) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannable);
                for (org.telegram.ui.Components.uz0 uz0Var : uz0VarArr) {
                    int spanStart = spannableStringBuilder2.getSpanStart(uz0Var);
                    int spanEnd = spannableStringBuilder2.getSpanEnd(uz0Var);
                    if (spanStart >= 0 && spanEnd > spanStart) {
                        spannableStringBuilder2.setSpan(new org.telegram.messenger.w(m60Var, f4Var, uz0Var, 1), spanStart, spanEnd, 33);
                    }
                }
                z2Var.D = spannableStringBuilder2;
                charSequence = spannableStringBuilder2;
            }
        }
        return charSequence;
    }

    public static TL_iv.PageBlock h0(TL_iv.PageBlock pageBlock, v3 v3Var) {
        if (pageBlock instanceof x3) {
            x3 x3Var = (x3) pageBlock;
            x3 x3Var2 = new x3();
            x3Var2.a = x3Var.a;
            x3Var2.b = x3Var.b;
            x3Var2.c = x3Var.c;
            x3Var2.d = h0(x3Var.d, v3Var);
            return x3Var2;
        }
        if (!(pageBlock instanceof z3)) {
            return v3Var;
        }
        z3 z3Var = (z3) pageBlock;
        z3 z3Var2 = new z3();
        z3Var2.a = z3Var.a;
        z3Var2.b = z3Var.b;
        z3Var2.c = z3Var.c;
        z3Var2.d = h0(z3Var.d, v3Var);
        return z3Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x0259, code lost:
    
        if (r0.isShowing() == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x018d, code lost:
    
        r17 = new android.graphics.Path();
        r0 = r29.I;
        r5 = r0.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0199, code lost:
    
        if (r7 >= r5) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x019b, code lost:
    
        r8 = r0.get(r7);
        r7 = r7 + 1;
        r8 = ((nh.i) r8).getBounds();
        r17.addRect(r8.left, r8.top, r8.right, r8.bottom, android.graphics.Path.Direction.CW);
        r17 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01c5, code lost:
    
        r17.computeBounds(new android.graphics.RectF(), false);
        r0 = (float) java.lang.Math.sqrt((r0.height() * r0.height()) + (r0.width() * r0.width()));
        ((nh.i) r29.I.get(0)).q = new org.telegram.ui.c0(r28, r29);
        r3 = r29.I;
        r5 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0200, code lost:
    
        if (r7 >= r5) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0202, code lost:
    
        r8 = r3.get(r7);
        r7 = r7 + 1;
        ((nh.i) r8).j(r6, r4, r0, false);
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
    public static boolean j(m60 m60Var, f4 f4Var, MotionEvent motionEvent, View view, z2 z2Var, int i10, int i11) {
        org.telegram.ui.Cells.k9 k9Var;
        h4 h4Var;
        Object obj;
        h4 h4Var2;
        boolean z10;
        org.telegram.ui.Cells.k9 k9Var2;
        org.telegram.ui.Components.zz0[] zz0VarArr;
        boolean z11 = ((h4) m60Var).v0 == null;
        ji.a aVar = m60Var.c;
        if (!z11 || view == null) {
            return false;
        }
        h4 h4Var3 = (h4) m60Var;
        if (view.getTag() == null || view.getTag() != "bottomSheet" || (k9Var = h4Var3.Q0) == null) {
            k9Var = h4Var3.P0;
        }
        if (k9Var != null && !k9Var.f0(view)) {
            return false;
        }
        m60Var.f = view;
        if (z2Var != null) {
            StaticLayout staticLayout = z2Var.d;
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                int lineCount = staticLayout.getLineCount();
                float f7 = 2.14748365E9f;
                float f10 = 0.0f;
                for (int i12 = 0; i12 < lineCount; i12++) {
                    f10 = Math.max(staticLayout.getLineWidth(i12), f10);
                    f7 = Math.min(staticLayout.getLineLeft(i12), f7);
                }
                float f11 = x10;
                float f12 = i10 + f7;
                if (f11 >= f12 && f11 <= f12 + f10 && y3 >= i11 && y3 <= staticLayout.getHeight() + i11) {
                    m60Var.d = z2Var;
                    m60Var.e = i11;
                    if (staticLayout.getText() instanceof Spannable) {
                        int i13 = x10 - i10;
                        int i14 = y3 - i11;
                        try {
                            int lineForVertical = staticLayout.getLineForVertical(i14);
                            float f13 = i13;
                            int offsetForHorizontal = staticLayout.getOffsetForHorizontal(lineForVertical, f13);
                            float lineLeft = staticLayout.getLineLeft(lineForVertical);
                            if (lineLeft <= f13 && lineLeft + staticLayout.getLineWidth(lineForVertical) >= f13) {
                                Spannable spannable = (Spannable) staticLayout.getText();
                                org.telegram.ui.Components.uz0[] uz0VarArr = (org.telegram.ui.Components.uz0[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, org.telegram.ui.Components.uz0.class);
                                if (uz0VarArr == null || uz0VarArr.length <= 0) {
                                    h4Var = h4Var3;
                                    obj = "bottomSheet";
                                } else {
                                    org.telegram.ui.Components.uz0 uz0Var = uz0VarArr[0];
                                    int spanStart = spannable.getSpanStart(uz0Var);
                                    h4Var = h4Var3;
                                    obj = "bottomSheet";
                                    int spanEnd = spannable.getSpanEnd(uz0Var);
                                    int i15 = 1;
                                    while (i15 < uz0VarArr.length) {
                                        try {
                                            org.telegram.ui.Components.uz0 uz0Var2 = uz0VarArr[i15];
                                            org.telegram.ui.Components.uz0[] uz0VarArr2 = uz0VarArr;
                                            int spanStart2 = spannable.getSpanStart(uz0Var2);
                                            int i16 = i15;
                                            int spanEnd2 = spannable.getSpanEnd(uz0Var2);
                                            if (spanStart > spanStart2 || spanEnd2 > spanEnd) {
                                                spanStart = spanStart2;
                                                uz0Var = uz0Var2;
                                                spanEnd = spanEnd2;
                                            }
                                            i15 = i16 + 1;
                                            uz0VarArr = uz0VarArr2;
                                        } catch (Exception e) {
                                            e = e;
                                            org.telegram.messenger.f8.g(e, true);
                                            if (motionEvent.getAction() != 0) {
                                            }
                                            z10 = true;
                                            if (motionEvent.getAction() != 0) {
                                            }
                                            if (view instanceof l1) {
                                            }
                                        }
                                    }
                                    org.telegram.ui.Components.q80 q80Var = m60Var.b;
                                    if (q80Var == null || q80Var.i != uz0Var) {
                                        if (q80Var != null) {
                                            aVar.m(q80Var, true);
                                        }
                                        org.telegram.ui.Components.q80 q80Var2 = new org.telegram.ui.Components.q80(uz0Var, null, f11, y3, 0);
                                        m60Var.b = q80Var2;
                                        q80Var2.d(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.K6, false) & 872415231);
                                        aVar.b(m60Var.b, m60Var.d);
                                        try {
                                            org.telegram.ui.Components.k80 b10 = m60Var.b.b();
                                            b10.d(staticLayout, spanStart, 0.0f);
                                            TextPaint textPaint = uz0Var.a;
                                            int i17 = textPaint != null ? textPaint.baselineShift : 0;
                                            b10.o = i17 != 0 ? i17 + org.telegram.messenger.i0.L(i17 > 0 ? 5.0f : -2.0f) : 0;
                                            staticLayout.getSelectionPath(spanStart, spanEnd, b10);
                                            view.invalidate();
                                        } catch (Exception e7) {
                                            org.telegram.messenger.f8.g(e7, true);
                                        }
                                    }
                                }
                                ArrayList arrayList = z2Var.I;
                                if (arrayList != null && !arrayList.isEmpty() && (zz0VarArr = (org.telegram.ui.Components.zz0[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, org.telegram.ui.Components.zz0.class)) != null) {
                                    int i18 = 0;
                                    while (true) {
                                        if (i18 >= zz0VarArr.length) {
                                            break;
                                        }
                                        if (zz0VarArr[i18].c()) {
                                            break;
                                        }
                                        i18++;
                                    }
                                }
                            }
                        } catch (Exception e10) {
                            e = e10;
                            h4Var = h4Var3;
                            obj = "bottomSheet";
                        }
                    }
                }
                h4Var = h4Var3;
                obj = "bottomSheet";
            } else {
                h4Var = h4Var3;
                obj = "bottomSheet";
                if (motionEvent.getAction() == 1) {
                    org.telegram.ui.Components.q80 q80Var3 = m60Var.b;
                    if (q80Var3 != null) {
                        m60Var.a(f4Var, (org.telegram.ui.Components.uz0) q80Var3.i);
                        R(m60Var);
                    }
                } else if (motionEvent.getAction() == 3) {
                    org.telegram.ui.ActionBar.k1 k1Var = m60Var.H;
                    if (k1Var != null) {
                    }
                    R(m60Var);
                }
            }
        } else {
            h4Var = h4Var3;
            obj = "bottomSheet";
        }
        if (motionEvent.getAction() != 0) {
            float x11 = motionEvent.getX();
            float y10 = motionEvent.getY();
            h4Var2 = h4Var;
            if (!h4Var2.K0) {
                z10 = true;
                h4Var2.K0 = true;
                if (h4Var2.M0 == null) {
                    h4Var2.M0 = new y2(h4Var2, 1);
                }
                if (view.getTag() == null || view.getTag() != obj || (k9Var2 = h4Var2.Q0) == null) {
                    h4Var2.P0.k0(view, (int) x11, (int) y10);
                } else {
                    k9Var2.k0(view, (int) x11, (int) y10);
                }
                h4Var2.f0.postDelayed(h4Var2.M0, ViewConfiguration.getTapTimeout());
                if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                    h4Var2.i();
                }
                if (view instanceof l1) {
                    if (m60Var.b != null) {
                        return z10;
                    }
                    return false;
                }
                if (m60Var.d != null) {
                    return z10;
                }
                return false;
            }
        } else {
            h4Var2 = h4Var;
        }
        z10 = true;
        if (motionEvent.getAction() != 0) {
            h4Var2.i();
        }
        if (view instanceof l1) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:52|(3:53|54|(3:58|(3:(2:62|63)(2:65|66)|64|59)|67))|69|(2:70|71)|(11:75|76|77|(5:80|(1:82)(1:92)|(3:(1:85)(1:89)|86|87)(2:90|91)|88|78)|93|94|95|96|(7:100|101|102|(5:105|(1:107)(1:117)|(3:(1:110)(1:114)|111|112)(2:115|116)|113|103)|118|119|120)|153|120)|158|95|96|(8:98|100|101|102|(1:103)|118|119|120)|153|120) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03a0 A[Catch: Exception -> 0x03d7, TryCatch #0 {Exception -> 0x03d7, blocks: (B:102:0x039a, B:103:0x039d, B:105:0x03a0, B:107:0x03b5, B:111:0x03c2, B:113:0x03ca, B:119:0x03d3), top: B:101:0x039a }] */
    /* JADX WARN: Type inference failed for: r10v13, types: [android.text.Spanned, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v7, types: [android.graphics.Path, org.telegram.ui.Components.k80] */
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
    /* JADX WARN: Type inference failed for: r9v11, types: [android.graphics.Path, org.telegram.ui.Components.k80] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static z2 n(m60 m60Var, View view, CharSequence charSequence, TL_iv.RichText richText, int i10, int i11, TL_iv.PageBlock pageBlock, Layout.Alignment alignment, int i12, f4 f4Var) {
        m60 m60Var2;
        CharSequence A;
        TL_iv.RichText richText2;
        TL_iv.PageBlock pageBlock2;
        TextPaint C;
        ?? r42;
        int i13;
        CharSequence charSequence2;
        StaticLayout staticLayout;
        ?? r12;
        org.telegram.ui.Components.k80 k80Var;
        org.telegram.ui.Components.k80 k80Var2;
        View view2;
        TL_iv.RichText richText3;
        TL_iv.PageBlock pageBlock3;
        int i14;
        int i15;
        ?? r13;
        ?? r92;
        org.telegram.ui.Components.sz0[] sz0VarArr;
        int i16;
        org.telegram.ui.Components.vz0[] vz0VarArr;
        f4 f4Var2;
        if (charSequence == null && (richText == null || (richText instanceof TL_iv.textEmpty))) {
            return null;
        }
        int L = i10 < 0 ? org.telegram.messenger.i0.L(10.0f) : i10;
        if (charSequence != null) {
            m60Var2 = m60Var;
            richText2 = richText;
            A = charSequence;
            pageBlock2 = pageBlock;
        } else {
            m60Var2 = m60Var;
            A = A(m60Var2, f4Var != null ? f4Var.E : null, view, richText, richText, pageBlock, L);
            richText2 = richText;
            pageBlock2 = pageBlock;
        }
        if (!TextUtils.isEmpty(A)) {
            int L2 = org.telegram.messenger.i0.L(org.telegram.messenger.tz.Z0 - 16);
            if ((pageBlock2 instanceof TL_iv.pageBlockEmbedPost) && richText2 == null) {
                if (((TL_iv.pageBlockEmbedPost) pageBlock2).author == charSequence) {
                    if (h1 == null) {
                        TextPaint textPaint = new TextPaint(1);
                        h1 = textPaint;
                        ((h4) m60Var2).getClass();
                        textPaint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
                    }
                    h1.setTextSize(org.telegram.messenger.i0.L(15.0f) + L2);
                    C = h1;
                } else {
                    if (i1 == null) {
                        TextPaint textPaint2 = new TextPaint(1);
                        i1 = textPaint2;
                        ((h4) m60Var2).getClass();
                        textPaint2.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.y6, false));
                    }
                    i1.setTextSize(org.telegram.messenger.i0.L(14.0f) + L2);
                    C = i1;
                }
            } else if (pageBlock2 instanceof TL_iv.pageBlockChannel) {
                if (j1 == null) {
                    TextPaint textPaint3 = new TextPaint(1);
                    j1 = textPaint3;
                    TextPaint d = org.telegram.messenger.z20.d(textPaint3, 1);
                    k1 = d;
                    d.setTypeface(org.telegram.messenger.i0.o());
                }
                TextPaint textPaint4 = j1;
                ((h4) m60Var2).getClass();
                textPaint4.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
                j1.setTextSize(org.telegram.messenger.i0.L(15.0f));
                k1.setColor(-1);
                k1.setTextSize(org.telegram.messenger.i0.L(15.0f));
                C = (f4Var == null || f4Var.F == null) ? j1 : k1;
            } else if (pageBlock2 instanceof b4) {
                b4 b4Var = (b4) pageBlock2;
                if (charSequence == b4Var.a.articles.get(b4Var.b).title) {
                    if (l1 == null) {
                        TextPaint textPaint5 = new TextPaint(1);
                        l1 = textPaint5;
                        textPaint5.setTypeface(org.telegram.messenger.i0.o());
                    }
                    TextPaint textPaint6 = l1;
                    ((h4) m60Var2).getClass();
                    textPaint6.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
                    l1.setTextSize(org.telegram.messenger.i0.L(15.0f) + L2);
                    C = l1;
                } else {
                    if (m1 == null) {
                        m1 = new TextPaint(1);
                    }
                    TextPaint textPaint7 = m1;
                    ((h4) m60Var2).getClass();
                    textPaint7.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.y6, false));
                    m1.setTextSize(org.telegram.messenger.i0.L(14.0f) + L2);
                    C = m1;
                }
            } else if (!J(pageBlock2) || charSequence == null) {
                C = C(m60Var2, richText2, richText2, pageBlock2);
            } else {
                if (n1 == null) {
                    TextPaint textPaint8 = new TextPaint(1);
                    n1 = textPaint8;
                    ((h4) m60Var2).getClass();
                    textPaint8.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
                }
                if (o1 == null) {
                    TextPaint textPaint9 = new TextPaint(1);
                    o1 = textPaint9;
                    ((h4) m60Var2).getClass();
                    textPaint9.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
                }
                n1.setTextSize(org.telegram.messenger.i0.L(19.0f) + L2);
                o1.setTextSize(org.telegram.messenger.i0.L(16.0f) + L2);
                C = (!(pageBlock2 instanceof x3) || ((x3) pageBlock2).c.a.ordered) ? o1 : n1;
            }
            CharSequence m10 = org.telegram.messenger.k6.m(A, C.getFontMetricsInt(), false, null, 2);
            if (i12 == 0) {
                TextPaint textPaint10 = C;
                r42 = 0;
                i13 = 1;
                if (m10.charAt(m10.length() - 1) == '\n') {
                    m10 = m10.subSequence(0, m10.length() - 1);
                }
                if (pageBlock2 instanceof TL_iv.pageBlockPullquote) {
                    charSequence2 = m10;
                    staticLayout = new StaticLayout(charSequence2, textPaint10, L, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                } else {
                    charSequence2 = m10;
                    staticLayout = new StaticLayout(charSequence2, textPaint10, L, alignment, 1.0f, org.telegram.messenger.i0.L(4.0f), false);
                }
                r12 = staticLayout;
                m10 = charSequence2;
            } else if (pageBlock2 instanceof TL_iv.pageBlockPullquote) {
                i13 = 1;
                TextPaint textPaint11 = C;
                r42 = 0;
                r12 = org.telegram.ui.Components.ov0.c(m10, textPaint11, L, Layout.Alignment.ALIGN_CENTER, 0.0f, TextUtils.TruncateAt.END, L, i12, true);
            } else {
                TextPaint textPaint12 = C;
                r42 = 0;
                i13 = 1;
                r12 = org.telegram.ui.Components.ov0.c(m10, textPaint12, L, alignment, org.telegram.messenger.i0.L(4.0f), TextUtils.TruncateAt.END, L, i12, true);
            }
            if (r12 != 0) {
                CharSequence text = r12.getText();
                if (i11 >= 0 && !m60Var2.E.isEmpty() && m60Var2.F != null && (f4Var2 = ((h4) m60Var2).u0[r42].c) != null) {
                    String lowerCase = m10.toString().toLowerCase();
                    int i17 = r42;
                    while (true) {
                        int indexOf = lowerCase.indexOf(m60Var2.F, i17);
                        if (indexOf < 0) {
                            break;
                        }
                        int length = m60Var2.F.length() + indexOf;
                        if (indexOf == 0 || org.telegram.messenger.i0.K1(lowerCase.charAt(indexOf - 1))) {
                            f4Var2.D.put(m60Var2.F + pageBlock2 + richText2 + indexOf, Integer.valueOf(r12.getLineTop(r12.getLineForOffset(indexOf)) + i11));
                        }
                        i17 = length;
                    }
                }
                boolean z10 = text instanceof Spanned;
                if (z10) {
                    ?? r10 = (Spanned) text;
                    try {
                        org.telegram.ui.Components.t4[] t4VarArr = (org.telegram.ui.Components.t4[]) r10.getSpans(r42, r10.length(), org.telegram.ui.Components.t4.class);
                        int lineCount = r12.getLineCount();
                        if (t4VarArr != null && t4VarArr.length > 0) {
                            for (int i18 = r42; i18 < t4VarArr.length; i18++) {
                                if (lineCount <= i13) {
                                    f4Var.n.put(t4VarArr[i18].a, Integer.valueOf(i11));
                                } else {
                                    HashMap hashMap = f4Var.n;
                                    org.telegram.ui.Components.t4 t4Var = t4VarArr[i18];
                                    hashMap.put(t4Var.a, Integer.valueOf(i11 + r12.getLineTop(r12.getLineForOffset(r10.getSpanStart(t4Var)))));
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                    try {
                        vz0VarArr = (org.telegram.ui.Components.vz0[]) r10.getSpans(r42, r10.length(), org.telegram.ui.Components.vz0.class);
                    } catch (Exception unused2) {
                    }
                    if (vz0VarArr != null && vz0VarArr.length > 0) {
                        r13 = new org.telegram.ui.Components.k80(r42);
                        try {
                            r13.n = r42;
                            for (int i19 = r42; i19 < vz0VarArr.length; i19++) {
                                int spanStart = r10.getSpanStart(vz0VarArr[i19]);
                                int spanEnd = r10.getSpanEnd(vz0VarArr[i19]);
                                r13.d(r12, spanStart, 0.0f);
                                TextPaint textPaint13 = vz0VarArr[i19].a;
                                int i20 = textPaint13 != null ? textPaint13.baselineShift : r42;
                                r13.o = i20 != 0 ? i20 + org.telegram.messenger.i0.L(i20 > 0 ? 5.0f : -2.0f) : r42;
                                r12.getSelectionPath(spanStart, spanEnd, r13);
                            }
                            r13.n = i13;
                        } catch (Exception unused3) {
                        }
                        sz0VarArr = (org.telegram.ui.Components.sz0[]) r10.getSpans(r42, r10.length(), org.telegram.ui.Components.sz0.class);
                        if (sz0VarArr != null && sz0VarArr.length > 0) {
                            r92 = new org.telegram.ui.Components.k80(r42);
                            try {
                                r92.n = r42;
                                for (i16 = r42; i16 < sz0VarArr.length; i16++) {
                                    int spanStart2 = r10.getSpanStart(sz0VarArr[i16]);
                                    int spanEnd2 = r10.getSpanEnd(sz0VarArr[i16]);
                                    r92.d(r12, spanStart2, 0.0f);
                                    TextPaint textPaint14 = sz0VarArr[i16].a;
                                    int i21 = textPaint14 != null ? textPaint14.baselineShift : 0;
                                    r92.o = i21 != 0 ? i21 + org.telegram.messenger.i0.L(i21 > 0 ? 5.0f : -2.0f) : 0;
                                    r12.getSelectionPath(spanStart2, spanEnd2, r92);
                                }
                                r92.n = i13;
                            } catch (Exception unused4) {
                            }
                            k80Var = r92;
                            k80Var2 = r13;
                        }
                        r92 = 0;
                        k80Var = r92;
                        k80Var2 = r13;
                    }
                    r13 = 0;
                    sz0VarArr = (org.telegram.ui.Components.sz0[]) r10.getSpans(r42, r10.length(), org.telegram.ui.Components.sz0.class);
                    if (sz0VarArr != null) {
                        r92 = new org.telegram.ui.Components.k80(r42);
                        r92.n = r42;
                        while (i16 < sz0VarArr.length) {
                        }
                        r92.n = i13;
                        k80Var = r92;
                        k80Var2 = r13;
                    }
                    r92 = 0;
                    k80Var = r92;
                    k80Var2 = r13;
                } else {
                    k80Var = null;
                    k80Var2 = null;
                }
                z2 z2Var = new z2(m60Var2);
                z2Var.d = r12;
                z2Var.e = k80Var2;
                z2Var.f = k80Var;
                z2Var.n = pageBlock2;
                z2Var.r = richText2;
                z2Var.J = new Stack();
                z2Var.I = new ArrayList();
                z2Var.K = new AtomicReference();
                if (z10) {
                    richText3 = richText;
                    pageBlock3 = pageBlock;
                    i14 = i13;
                    i15 = 0;
                    view2 = view;
                    nh.i.a(view2, r12, -1, -1, (Spanned) text, z2Var.J, z2Var.I, null);
                } else {
                    view2 = view;
                    richText3 = richText2;
                    pageBlock3 = pageBlock2;
                    i14 = i13;
                    i15 = 0;
                }
                if (view2 != null) {
                    WeakHashMap weakHashMap = B1;
                    ArrayList arrayList = (ArrayList) weakHashMap.get(view2);
                    if (arrayList != null) {
                        int i22 = i15;
                        while (i22 < arrayList.size()) {
                            z2 z2Var2 = (z2) arrayList.get(i22);
                            if (z2Var2.n != pageBlock3 || (richText3 != null && z2Var2.r == richText3)) {
                                z2Var2.f(view2);
                                arrayList.remove(i22);
                                i22--;
                            }
                            i22 += i14;
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

    public static z2 o(m60 m60Var, View view, CharSequence charSequence, TL_iv.RichText richText, int i10, int i11, TL_iv.PageBlock pageBlock, f4 f4Var) {
        return n(m60Var, view, charSequence, richText, i10, i11, pageBlock, Layout.Alignment.ALIGN_NORMAL, 0, f4Var);
    }

    public static void p(m60 m60Var, boolean z10) {
        if (r1 == null) {
            r1 = new Paint();
            q1 = new Paint();
            Paint paint = new Paint(1);
            t1 = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            t1.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
            Paint paint2 = new Paint();
            u1 = paint2;
            paint2.setStyle(style);
            u1.setStrokeWidth(org.telegram.messenger.i0.L(1.0f) / 2.0f);
            v1 = new Paint();
            w1 = new Paint();
            x1 = new Paint();
            y1 = new Paint(1);
            z1 = new Paint(1);
            p1 = new Paint();
            s1 = new Paint();
            A1 = new Paint(1);
        } else if (!z10) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false);
        z1.setColor(c3.i0.x((float) Color.blue(x02), 0.0722f, (((float) Color.green(x02)) * 0.7152f) + (((float) Color.red(x02)) * 0.2126f), 255.0f) <= 0.705f ? -3041234 : -6551);
        Paint paint3 = y1;
        int i10 = org.telegram.ui.ActionBar.t6.K6;
        paint3.setColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false) & 872415231);
        y1.setPathEffect(org.telegram.ui.Components.k80.c());
        x1.setColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false) & 872415231);
        x1.setPathEffect(org.telegram.ui.Components.k80.c());
        Paint paint4 = u1;
        int i11 = org.telegram.ui.ActionBar.t6.k6;
        paint4.setColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        t1.setColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        p1.setColor(251658240);
        s1.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d7, false));
        A1.setColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false) & 872415231);
        A1.setPathEffect(org.telegram.ui.Components.k80.c());
        int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.M6, false);
        int red = Color.red(x03);
        int green = Color.green(x03);
        int blue = Color.blue(x03);
        w1.setColor(Color.argb(20, red, green, blue));
        v1.setColor(Color.argb(34, red, green, blue));
        int x04 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        q1.setColor(Color.argb(20, Color.red(x04), Color.green(x04), Color.blue(x04)));
        r1.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Id, false));
    }

    public static void s(Canvas canvas, m60 m60Var, TL_iv.PageBlock pageBlock, int i10) {
        if (pageBlock == null || m60Var == null || r1 == null) {
            return;
        }
        int i11 = 0;
        int L = i10 - (pageBlock.bottom ? org.telegram.messenger.i0.L(6.0f) : 0);
        int i12 = pageBlock.quoteLevels;
        if (i12 == 0) {
            if (pageBlock.level > 0) {
                canvas.drawRect(org.telegram.messenger.i0.L(18), 0.0f, org.telegram.messenger.i0.L(2.0f) + r0, L, r1);
                return;
            }
            return;
        }
        while (i12 != 0) {
            if ((i12 & 1) != 0) {
                canvas.drawRect(org.telegram.messenger.i0.L((i11 * 14) + 18), 0.0f, org.telegram.messenger.i0.L(2.0f) + r0, L, r1);
            }
            i12 >>>= 1;
            i11++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r0 != null) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void t(m60 m60Var, Canvas canvas, org.telegram.ui.Cells.j9 j9Var, int i10) {
        org.telegram.ui.Cells.k9 k9Var;
        View view = (View) j9Var;
        h4 h4Var = (h4) m60Var;
        if (view != null) {
            h4Var.getClass();
            if (view.getTag() != null) {
                if (view.getTag() == "bottomSheet") {
                    k9Var = h4Var.Q0;
                }
            }
        }
        k9Var = h4Var.P0;
        if (k9Var != null) {
            k9Var.Z(canvas, j9Var, i10);
        }
    }

    public static TL_iv.RichText u(int i10, TL_iv.PageBlock pageBlock) {
        if (i10 == 2) {
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
            if (i10 == 0) {
                return pageblockembedpost.caption.text;
            }
            if (i10 == 1) {
                return pageblockembedpost.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
            if (i10 == 0) {
                return pageblockslideshow.caption.text;
            }
            if (i10 == 1) {
                return pageblockslideshow.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
            if (i10 == 0) {
                return pageblockphoto.caption.text;
            }
            if (i10 == 1) {
                return pageblockphoto.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
            TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
            if (i10 == 0) {
                return pageblockcollage.caption.text;
            }
            if (i10 == 1) {
                return pageblockcollage.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockEmbed) {
            TL_iv.pageBlockEmbed pageblockembed = (TL_iv.pageBlockEmbed) pageBlock;
            if (i10 == 0) {
                return pageblockembed.caption.text;
            }
            if (i10 == 1) {
                return pageblockembed.caption.credit;
            }
        } else {
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                return ((TL_iv.pageBlockBlockquote) pageBlock).caption;
            }
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
                if (i10 == 0) {
                    return pageblockvideo.caption.text;
                }
                if (i10 == 1) {
                    return pageblockvideo.caption.credit;
                }
            } else {
                if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                    return ((TL_iv.pageBlockPullquote) pageBlock).caption;
                }
                if (pageBlock instanceof TL_iv.pageBlockAudio) {
                    TL_iv.pageBlockAudio pageblockaudio = (TL_iv.pageBlockAudio) pageBlock;
                    if (i10 == 0) {
                        return pageblockaudio.caption.text;
                    }
                    if (i10 == 1) {
                        return pageblockaudio.caption.credit;
                    }
                } else {
                    if (pageBlock instanceof TL_iv.pageBlockCover) {
                        return u(i10, ((TL_iv.pageBlockCover) pageBlock).cover);
                    }
                    if (pageBlock instanceof TL_iv.pageBlockMap) {
                        TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
                        if (i10 == 0) {
                            return pageblockmap.caption.text;
                        }
                        if (i10 == 1) {
                            return pageblockmap.caption.credit;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static h4 v() {
        h4 h4Var;
        h4 h4Var2 = d1;
        if (h4Var2 != null) {
            return h4Var2;
        }
        synchronized (h4.class) {
            try {
                h4Var = d1;
                if (h4Var == null) {
                    h4Var = new h4();
                    d1 = h4Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return h4Var;
    }

    public static View w(View view) {
        org.telegram.ui.Components.ck0 ck0Var;
        if (!(view instanceof w1)) {
            return (!(view instanceof z1) || (ck0Var = ((z1) view).d) == null) ? view : w(ck0Var.a);
        }
        org.telegram.ui.Components.ck0 ck0Var2 = ((w1) view).d;
        return ck0Var2 != null ? w(ck0Var2.a) : view;
    }

    public static TL_iv.PageBlock x(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof x3) {
            TL_iv.PageBlock pageBlock2 = ((x3) pageBlock).d;
            return pageBlock2 != null ? x(pageBlock2) : pageBlock2;
        }
        if (!(pageBlock instanceof z3)) {
            return pageBlock;
        }
        TL_iv.PageBlock pageBlock3 = ((z3) pageBlock).d;
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
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append(z(richText.texts.get(i10)));
        }
        return sb2;
    }

    public final void E() {
        ArrayList arrayList = this.d0;
        int size = arrayList.size();
        u3 u3Var = this.K;
        boolean z10 = false;
        if (size <= 1) {
            ArticleViewer$WindowView articleViewer$WindowView = this.f0;
            articleViewer$WindowView.e = false;
            articleViewer$WindowView.d = false;
            float width = u3Var != null ? u3Var.I * u3Var.c.getWidth() : this.g0.getX();
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = r0.getMeasuredWidth() - width;
            if (u3Var != null) {
                animatorSet.playTogether(u3Var.l(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.g0, (Property<l0, Float>) View.TRANSLATION_X, r0.getMeasuredWidth()), ObjectAnimator.ofFloat(this.f0, e1, r0.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / r0.getMeasuredWidth()) * measuredWidth), org.telegram.messenger.zs.Z3));
            animatorSet.setInterpolator(org.telegram.ui.Components.gr.h);
            animatorSet.addListener(new u0(this));
            animatorSet.start();
            this.U0 = true;
            return;
        }
        ArticleViewer$WindowView articleViewer$WindowView2 = this.f0;
        articleViewer$WindowView2.f = true;
        articleViewer$WindowView2.e = true;
        articleViewer$WindowView2.h = this.J0;
        this.u0[1].setVisibility(0);
        this.u0[1].setAlpha(1.0f);
        this.u0[1].setTranslationX(0.0f);
        this.u0[0].setBackgroundColor(u3Var == null ? 0 : this.l0.getColor());
        c0(-1, arrayList.get(arrayList.size() - 2), true);
        l3 l3Var = this.u0[0];
        l3Var.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        l3Var.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.u0[0], (Property<l3, Float>) View.TRANSLATION_X, l3Var.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(org.telegram.ui.Components.gr.h);
        animatorSet2.addListener(new v0(this));
        animatorSet2.start();
        m0 m0Var = this.h0;
        l3 l3Var2 = this.u0[0];
        m0Var.setMenuColors((l3Var2 == null || !org.telegram.messenger.tz.v0) ? org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Dl, false) : l3Var2.getBackgroundColor());
        m0 m0Var2 = this.h0;
        l3 l3Var3 = this.u0[0];
        m0Var2.d((l3Var3 == null || !org.telegram.messenger.tz.v0) ? org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Dl, false) : l3Var3.getActionBarColor(), true);
        m0 m0Var3 = this.h0;
        l3 l3Var4 = this.u0[0];
        m0Var3.setIsTonsite(l3Var4 != null && l3Var4.e());
        m0 m0Var4 = this.h0;
        l3 l3Var5 = this.u0[0];
        if (l3Var5 != null && l3Var5.d()) {
            z10 = true;
        }
        m0Var4.setIsLocal(z10);
        this.U0 = true;
    }

    public final void F(int i10) {
        ArrayList arrayList = this.d0;
        int size = arrayList.size();
        u3 u3Var = this.K;
        boolean z10 = false;
        if (size <= 1) {
            ArticleViewer$WindowView articleViewer$WindowView = this.f0;
            articleViewer$WindowView.e = false;
            articleViewer$WindowView.d = false;
            float width = u3Var != null ? u3Var.I * u3Var.c.getWidth() : this.g0.getX();
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = r9.getMeasuredWidth() - width;
            if (u3Var != null) {
                animatorSet.playTogether(u3Var.l(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.g0, (Property<l0, Float>) View.TRANSLATION_X, r9.getMeasuredWidth()), ObjectAnimator.ofFloat(this.f0, e1, r9.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / r9.getMeasuredWidth()) * measuredWidth), org.telegram.messenger.zs.Z3));
            animatorSet.setInterpolator(org.telegram.ui.Components.gr.h);
            animatorSet.addListener(new w0(this));
            animatorSet.start();
            this.U0 = true;
            return;
        }
        this.f0.f = true;
        this.u0[1].setVisibility(0);
        this.u0[1].setAlpha(1.0f);
        this.u0[1].setTranslationX(0.0f);
        this.u0[0].setBackgroundColor(u3Var == null ? 0 : this.l0.getColor());
        c0(-1, arrayList.get(i10), true);
        l3 l3Var = this.u0[0];
        l3Var.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        l3Var.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.u0[0], (Property<l3, Float>) View.TRANSLATION_X, l3Var.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(org.telegram.ui.Components.gr.h);
        animatorSet2.addListener(new x0(this, i10));
        animatorSet2.start();
        m0 m0Var = this.h0;
        l3 l3Var2 = this.u0[0];
        m0Var.setMenuColors((l3Var2 == null || !org.telegram.messenger.tz.v0) ? org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Dl, false) : l3Var2.getBackgroundColor());
        m0 m0Var2 = this.h0;
        l3 l3Var3 = this.u0[0];
        m0Var2.d((l3Var3 == null || !org.telegram.messenger.tz.v0) ? org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Dl, false) : l3Var3.getActionBarColor(), true);
        m0 m0Var3 = this.h0;
        l3 l3Var4 = this.u0[0];
        m0Var3.setIsTonsite(l3Var4 != null && l3Var4.e());
        m0 m0Var4 = this.h0;
        l3 l3Var5 = this.u0[0];
        if (l3Var5 != null && l3Var5.d()) {
            z10 = true;
        }
        m0Var4.setIsLocal(z10);
        this.U0 = true;
    }

    public final boolean H() {
        ArrayList arrayList = this.d0;
        return arrayList.size() > 0 && (arrayList.get(0) instanceof TLRPC.WebPage);
    }

    public final void K() {
        this.V = false;
        int i10 = 0;
        while (true) {
            l3[] l3VarArr = this.u0;
            if (i10 < l3VarArr.length) {
                l3VarArr[i10].b();
                i10++;
            } else {
                try {
                    break;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
        }
        this.L.getWindow().clearFlags(128);
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.N;
            if (i11 >= arrayList.size()) {
                this.g0.post(new y(this, 0));
                org.telegram.messenger.zs.f(this.X).k(org.telegram.messenger.zs.d1, new Object[0]);
                return;
            } else {
                ((r1) arrayList.get(i11)).a(false);
                i11++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean, int] */
    public final boolean L(org.telegram.messenger.jj jjVar, TLRPC.WebPage webPage, String str, String str2) {
        TLRPC.WebPage webPage2;
        boolean z10;
        int lastIndexOf;
        String substring;
        boolean z11;
        ?? r52;
        TL_iv.Page page;
        if (this.L == null) {
            return false;
        }
        u3 u3Var = this.K;
        if (u3Var == null && this.V) {
            return false;
        }
        org.telegram.ui.ActionBar.k2 k2Var = this.M;
        if (k2Var != null && (k2Var.getParentLayout() instanceof ActionBarLayout)) {
            org.telegram.messenger.i0.v1((ActionBarLayout) this.M.getParentLayout());
        }
        int i10 = 1;
        if (jjVar != null) {
            webPage2 = webPage == null ? jjVar.k.media.webpage : webPage;
            z10 = (webPage2 == null || (page = webPage2.cached_page) == null || page.local == null) ? false : true;
            for (int i11 = 0; i11 < jjVar.k.entities.size(); i11++) {
                TLRPC.MessageEntity messageEntity = jjVar.k.entities.get(i11);
                if (messageEntity instanceof TLRPC.TL_messageEntityUrl) {
                    try {
                        String str3 = jjVar.k.message;
                        int i12 = messageEntity.offset;
                        String lowerCase = str3.substring(i12, messageEntity.length + i12).toLowerCase();
                        String lowerCase2 = !TextUtils.isEmpty(webPage2.cached_page.url) ? webPage2.cached_page.url.toLowerCase() : webPage2.url.toLowerCase();
                        if (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase)) {
                            int lastIndexOf2 = lowerCase.lastIndexOf(35);
                            if (lastIndexOf2 == -1) {
                                break;
                            }
                            substring = lowerCase.substring(lastIndexOf2 + 1);
                            break;
                        }
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
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
        ArrayList arrayList = this.d0;
        if (u3Var == null || arrayList.isEmpty()) {
            z11 = z10;
            r52 = 0;
        } else {
            z11 = z10;
            r52 = 1;
        }
        if (r52 == 0) {
            arrayList.clear();
            this.g0.setTranslationX(0.0f);
            if (u3Var != null) {
                u3Var.I = 0.0f;
                u3Var.c.invalidate();
                u3Var.u();
                u3Var.r();
            }
            this.g0.setTranslationY(0.0f);
            this.u0[0].setTranslationY(0.0f);
            this.u0[0].setTranslationX(0.0f);
            this.u0[1].setTranslationX(0.0f);
            this.u0[0].setAlpha(1.0f);
            this.f0.setInnerTranslationX(0.0f);
            this.u0[0].g();
            V(org.telegram.messenger.i0.L(56.0f));
        }
        if (u3Var != null && org.telegram.ui.web.z0.Q0) {
            u3Var.a.d();
        }
        if (webPage2 != null) {
            boolean f7 = f(webPage2, substring, r52);
            if (!z11) {
                String str4 = (f7 || substring == null) ? null : substring;
                TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                tL_messages_getWebPage.url = webPage2.url;
                TL_iv.Page page2 = webPage2.cached_page;
                if ((page2 instanceof TL_iv.TL_pagePart_layer82) || page2.part) {
                    tL_messages_getWebPage.hash = 0;
                } else {
                    tL_messages_getWebPage.hash = webPage2.hash;
                }
                int i13 = jjVar != null ? jjVar.I1 : org.telegram.messenger.d20.s0;
                ConnectionsManager.getInstance(i13).sendRequest(tL_messages_getWebPage, new gf.a(this, i13, webPage2, jjVar, (boolean) r52, str4));
            }
        } else {
            e(r52, str2);
        }
        m0 m0Var = this.h0;
        if (m0Var != null && r52 == 0) {
            m0Var.setIsLocal(this.u0[0].d());
        }
        this.T = null;
        if (u3Var != null) {
            if (r52 == 0) {
                org.telegram.messenger.i0.E2(this.f0);
                u3Var.d = this.f0;
                u3Var.A();
                u3Var.c.addView(this.f0, w7.b6.c(-1.0f, -1));
            }
        } else if (this.V) {
            this.e0.flags &= -17;
            ((WindowManager) this.L.getSystemService("window")).updateViewLayout(this.f0, this.e0);
        } else {
            WindowManager windowManager = (WindowManager) this.L.getSystemService("window");
            if (this.W) {
                try {
                    windowManager.removeView(this.f0);
                } catch (Exception unused) {
                }
            }
            try {
                WindowManager.LayoutParams layoutParams = this.e0;
                layoutParams.flags = -2013200384;
                if (Build.VERSION.SDK_INT >= 28) {
                    layoutParams.layoutInDisplayCutoutMode = 1;
                }
                this.f0.setFocusable(false);
                this.g0.setFocusable(false);
                windowManager.addView(this.f0, this.e0);
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, true);
                return false;
            }
        }
        this.V = true;
        this.Z = 1;
        if (r52 == 0) {
            if (u3Var == null) {
                this.f0.setAlpha(0.0f);
                this.g0.setAlpha(0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                ArticleViewer$WindowView articleViewer$WindowView = this.f0;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, (Property<ArticleViewer$WindowView, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.g0, (Property<l0, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f0, (Property<ArticleViewer$WindowView, Float>) View.TRANSLATION_X, org.telegram.messenger.i0.L(56.0f), 0.0f));
                this.a0 = new y(this, i10);
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(this.c0);
                animatorSet.addListener(new r0(this));
                this.b0 = System.currentTimeMillis();
                org.telegram.messenger.i0.g3(new h0(i10, this, animatorSet));
            } else if (r52 != 0) {
                u3Var.a.e();
            } else if (!u3Var.h) {
                u3Var.q(u3Var.b);
                u3Var.n();
            }
        }
        this.g0.setLayerType(2, null);
        return true;
    }

    public final void N(long j10, TLRPC.User user) {
        if (user == null || !(this.L instanceof LaunchActivity)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        bundle.putString("botUser", "webpage" + j10);
        ((LaunchActivity) this.L).u0(new un(bundle), false, true);
        m(false, true);
    }

    public final void O(String str, String str2, k0 k0Var) {
        Activity activity = this.L;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        l3 l3Var = this.u0[0];
        if (l3Var == null || !l3Var.d()) {
            P(str, str2, k0Var);
            return;
        }
        String L0 = org.telegram.messenger.cd.L0(2131747798, null);
        int indexOf = L0.indexOf("%");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.format(L0, str));
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new URLSpan(str), indexOf, str.length() + indexOf, 33);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.L, null);
        String L02 = org.telegram.messenger.cd.L0(2131747795, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L02;
        x1Var.T = spannableStringBuilder;
        x1Var.h0 = false;
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747833, null), new a1.d(this, str, str2, k0Var, 2));
        alertDialog$Builder.p();
    }

    public final void P(String str, String str2, gf.e eVar) {
        u3 u3Var;
        gf.e eVar2 = this.N0;
        if (eVar2 != null) {
            eVar2.a(false);
        }
        this.N0 = eVar;
        if (this.G0 != 0) {
            ConnectionsManager.getInstance(this.X).cancelRequest(this.G0, false);
            this.G0 = 0;
        }
        boolean[] zArr = new boolean[1];
        if (gf.f.k(this.L, str, false)) {
            if (!this.d0.isEmpty() || (u3Var = this.K) == null) {
                return;
            }
            u3Var.a(false);
            return;
        }
        g0 g0Var = new g0(this, str, zArr, eVar);
        int i10 = this.I0 + 1;
        this.I0 = i10;
        Z(true);
        TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
        tL_messages_getWebPage.url = str;
        tL_messages_getWebPage.hash = 0;
        this.G0 = ConnectionsManager.getInstance(this.X).sendRequest(tL_messages_getWebPage, new org.telegram.messenger.yx(this, i10, eVar, str2, g0Var, tL_messages_getWebPage));
        if (eVar != null) {
            eVar.b = new ag.o0(this, i10, eVar, 14);
            eVar.d();
        }
    }

    public final void Q() {
        TextView textView = this.C0;
        if (textView != null) {
            int i10 = org.telegram.ui.ActionBar.t6.i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i10, false), 2, -1);
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
            textView.setBackground(h02);
            org.telegram.ui.ActionBar.a7.k(textView, h02, null, N, null);
            org.telegram.ui.ActionBar.a7.V(this.C0, org.telegram.ui.ActionBar.t6.E8, null);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.B0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, null);
        }
        ImageView imageView = this.r0;
        if (imageView != null) {
            org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.G6, null, PorterDuff.Mode.MULTIPLY);
            ImageView imageView2 = this.r0;
            int i11 = org.telegram.ui.ActionBar.t6.z8;
            org.telegram.ui.ActionBar.a7.R(imageView2, org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i11, false), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i11), null);
        }
        ImageView imageView3 = this.s0;
        if (imageView3 != null) {
            org.telegram.ui.ActionBar.a7.t(imageView3, org.telegram.ui.ActionBar.t6.G6, null, PorterDuff.Mode.MULTIPLY);
            ImageView imageView4 = this.s0;
            int i12 = org.telegram.ui.ActionBar.t6.z8;
            org.telegram.ui.ActionBar.a7.R(imageView4, org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i12, false), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i12), null);
        }
        org.telegram.ui.Components.f6 f6Var = this.t0;
        if (f6Var != null) {
            org.telegram.ui.ActionBar.a7.Z(f6Var, org.telegram.ui.ActionBar.t6.G6, null);
        }
        m0 m0Var = this.h0;
        if (m0Var != null) {
            l3 l3Var = this.u0[0];
            m0Var.setMenuColors((l3Var == null || !org.telegram.messenger.tz.v0) ? org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Dl, false) : l3Var.getBackgroundColor());
            m0 m0Var2 = this.h0;
            l3 l3Var2 = this.u0[0];
            m0Var2.d((l3Var2 == null || !org.telegram.messenger.tz.v0) ? org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Dl, false) : l3Var2.getActionBarColor(), true);
        }
        this.l0.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Dl, false));
    }

    public final void S() {
        int L0;
        l3 l3Var = this.u0[0];
        if (l3Var.c.E == null || (L0 = l3Var.d.L0()) == -1) {
            return;
        }
        View m10 = this.u0[0].d.m(L0);
        int top = m10 != null ? m10.getTop() : 0;
        SharedPreferences.Editor edit = org.telegram.messenger.w0.b.getSharedPreferences("articles", 0).edit();
        String str = "article" + this.u0[0].c.E.id;
        SharedPreferences.Editor putInt = edit.putInt(str, L0).putInt(str + "o", top);
        String A = sc.e.A(str, "r");
        Point point = org.telegram.messenger.i0.q;
        putInt.putBoolean(A, point.x > point.y).commit();
    }

    public final boolean T(String str, boolean z10) {
        int i10 = 0;
        Integer num = 0;
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            Integer num2 = (Integer) this.u0[0].c.h.get(lowerCase);
            if (num2 != null) {
                TL_iv.textAnchor textanchor = (TL_iv.textAnchor) this.u0[0].c.r.get(lowerCase);
                int i11 = 1;
                if (textanchor != null) {
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    pageblockparagraph.text = org.telegram.ui.web.y1.d(textanchor.text, !TextUtils.isEmpty(this.u0[0].c.E.cached_page.url) ? this.u0[0].c.E.cached_page.url.toLowerCase() : this.u0[0].c.E.url.toLowerCase(), lowerCase);
                    this.u0[0].c.getClass();
                    int I = f4.I(pageblockparagraph);
                    s4.c1 w9 = this.u0[0].c.w(null, I);
                    View view = w9.a;
                    this.u0[0].c.H(I, w9, pageblockparagraph, 0, 0, false);
                    org.telegram.ui.ActionBar.z2 h = org.telegram.messenger.z20.h(this.L, false, 1, null);
                    h.u0 = false;
                    h.v0 = false;
                    LinearLayout linearLayout = new LinearLayout(this.L);
                    linearLayout.setOrientation(1);
                    org.telegram.ui.Cells.k9 k9Var = new org.telegram.ui.Cells.k9();
                    this.Q0 = k9Var;
                    k9Var.S(linearLayout);
                    this.Q0.D = new p0(this, i11);
                    ag.j3 j3Var = new ag.j3(this.L, 2);
                    j3Var.setTextSize(1, 16.0f);
                    j3Var.setTypeface(org.telegram.messenger.i0.o());
                    j3Var.setText(org.telegram.messenger.cd.L0(2131749201, null));
                    int i12 = 5;
                    j3Var.setGravity((this.u0[0].c.G ? 5 : 3) | 16);
                    j3Var.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
                    j3Var.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
                    linearLayout.addView(j3Var, new LinearLayout.LayoutParams(-1, org.telegram.messenger.i0.L(48.0f) + 1));
                    view.setTag("bottomSheet");
                    linearLayout.addView(view, w7.b6.k(0.0f, 7.0f, 0.0f, 0.0f, -1, -2));
                    org.telegram.ui.Cells.v9 n10 = this.Q0.n(this.L);
                    fg.i iVar = new fg.i(this, this.L, linearLayout, i12);
                    h.y0 = new i0(this, i10);
                    iVar.addView(linearLayout, -1, -2);
                    iVar.addView(n10, -1, -2);
                    h.N = iVar;
                    if (this.P0.x()) {
                        this.P0.f(false);
                    }
                    this.I = h;
                    Y(h);
                    return true;
                }
                if (num2.intValue() >= 0 && num2.intValue() < this.u0[0].c.e.size()) {
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) this.u0[0].c.e.get(num2.intValue());
                    TL_iv.PageBlock x10 = x(pageBlock);
                    if ((x10 instanceof v3) && M((v3) x10)) {
                        this.u0[0].c.M();
                        this.u0[0].c.f();
                    }
                    int indexOf = this.u0[0].c.d.indexOf(pageBlock);
                    if (indexOf != -1) {
                        num2 = Integer.valueOf(indexOf);
                    }
                    Integer num3 = (Integer) this.u0[0].c.n.get(lowerCase);
                    if (num3 != null) {
                        if (num3.intValue() == -1) {
                            this.u0[0].c.getClass();
                            int I2 = f4.I(pageBlock);
                            s4.c1 w10 = this.u0[0].c.w(null, I2);
                            this.u0[0].c.H(I2, w10, pageBlock, 0, 0, false);
                            w10.a.measure(View.MeasureSpec.makeMeasureSpec(this.u0[0].b.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                            Integer num4 = (Integer) this.u0[0].c.n.get(lowerCase);
                            if (num4.intValue() != -1) {
                                num = num4;
                            }
                        } else {
                            num = num3;
                        }
                    }
                    if (this.u0[0].c.I) {
                        num2 = Integer.valueOf(num2.intValue() + 1);
                    }
                    if (!z10) {
                        this.u0[0].d.h1(num2.intValue(), (-org.telegram.messenger.i0.L(56.0f)) - num.intValue());
                        return true;
                    }
                    j0 j0Var = new j0(this.u0[0].getContext());
                    j0Var.a = num2.intValue();
                    j0Var.s = (-org.telegram.messenger.i0.L(56.0f)) - num.intValue();
                    this.u0[0].d.w0(j0Var);
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
    public final void U(int i10) {
        int size;
        int i11;
        TL_iv.PageBlock pageBlock;
        v3 v3Var;
        TL_iv.PageBlock pageBlock2;
        if (i10 < 0 || i10 >= this.E.size()) {
            f0();
            return;
        }
        this.G = i10;
        f0();
        q3 q3Var = (q3) this.E.get(i10);
        TL_iv.PageBlock x10 = x(q3Var.c);
        int size2 = this.u0[0].c.e.size();
        for (int i12 = 0; i12 < size2; i12++) {
            TL_iv.PageBlock pageBlock3 = (TL_iv.PageBlock) this.u0[0].c.e.get(i12);
            if ((pageBlock3 instanceof v3) && ((pageBlock2 = (v3Var = (v3) pageBlock3).b) == q3Var.c || pageBlock2 == x10)) {
                if (M(v3Var)) {
                    this.u0[0].c.M();
                    this.u0[0].c.f();
                }
                size = this.u0[0].c.d.size();
                i11 = 0;
                while (true) {
                    if (i11 < size) {
                        i11 = -1;
                        break;
                    }
                    TL_iv.PageBlock pageBlock4 = (TL_iv.PageBlock) this.u0[0].c.d.get(i11);
                    TL_iv.PageBlock pageBlock5 = q3Var.c;
                    if (pageBlock4 == pageBlock5 || pageBlock4 == x10 || ((pageBlock4 instanceof v3) && ((pageBlock = ((v3) pageBlock4).b) == pageBlock5 || pageBlock == x10))) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 != -1) {
                    return;
                }
                if ((x10 instanceof v3) && M((v3) x10)) {
                    this.u0[0].c.M();
                    this.u0[0].c.f();
                }
                String str = this.F + q3Var.c + q3Var.b + q3Var.a;
                Integer num = (Integer) this.u0[0].c.D.get(str);
                if (num == null) {
                    f4 f4Var = this.u0[0].c;
                    TL_iv.PageBlock pageBlock6 = q3Var.c;
                    f4Var.getClass();
                    int I = f4.I(pageBlock6);
                    s4.c1 w9 = this.u0[0].c.w(null, I);
                    this.u0[0].c.H(I, w9, q3Var.c, 0, 0, false);
                    w9.a.measure(View.MeasureSpec.makeMeasureSpec(this.u0[0].b.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                    num = (Integer) this.u0[0].c.D.get(str);
                    if (num == null) {
                        num = 0;
                    }
                }
                q0 q0Var = new q0(this.u0[0].getContext());
                if (this.u0[0].c.I) {
                    i11++;
                }
                q0Var.a = i11;
                q0Var.s = -(org.telegram.messenger.i0.L(100.0f) + ((this.J0 - org.telegram.messenger.i0.L(56.0f)) - num.intValue()));
                q0Var.t = 1.2f;
                this.u0[0].d.w0(q0Var);
                this.u0[0].b.g1();
                return;
            }
        }
        size = this.u0[0].c.d.size();
        i11 = 0;
        while (true) {
            if (i11 < size) {
            }
            i11++;
        }
        if (i11 != -1) {
        }
    }

    public final void V(int i10) {
        m0 m0Var = this.h0;
        if (m0Var == null || m0Var.T || m0Var.W) {
            return;
        }
        int j10 = Utilities.j(i10, org.telegram.messenger.i0.L(56.0f), org.telegram.messenger.i0.L(24.0f));
        this.J0 = j10;
        this.h0.setHeight(j10);
        this.P0.x = this.J0;
        int i11 = 0;
        while (true) {
            l3[] l3VarArr = this.u0;
            if (i11 >= l3VarArr.length) {
                return;
            }
            l3VarArr[i11].b.setTopGlowOffset(this.J0);
            i11++;
        }
    }

    public final void W(Activity activity, org.telegram.ui.ActionBar.k2 k2Var) {
        u3 u3Var;
        aa0 aa0Var = this.V0;
        if (aa0Var != null) {
            aa0Var.b();
            this.V0 = null;
        }
        LaunchActivity launchActivity = LaunchActivity.I1;
        int i10 = 1;
        this.V0 = launchActivity != null ? new aa0(launchActivity, true) : null;
        this.M = k2Var;
        int currentAccount = !(k2Var instanceof my) ? k2Var.getCurrentAccount() : org.telegram.messenger.d20.s0;
        this.X = currentAccount;
        org.telegram.messenger.zs.f(currentAccount).c(this, org.telegram.messenger.zs.e2);
        org.telegram.messenger.zs.f(this.X).c(this, org.telegram.messenger.zs.f2);
        org.telegram.messenger.zs.f(this.X).c(this, org.telegram.messenger.zs.g2);
        org.telegram.messenger.zs.f(this.X).c(this, org.telegram.messenger.zs.h2);
        org.telegram.messenger.zs.f(this.X).c(this, org.telegram.messenger.zs.i4);
        Activity activity2 = this.L;
        if (activity2 == activity || !(activity2 == null || !this.J || (u3Var = this.K) == null || u3Var.e == null)) {
            e0(this);
            Q();
            return;
        }
        this.L = activity;
        int i11 = 0;
        this.a = org.telegram.messenger.w0.b.getSharedPreferences("articles", 0).getInt("font_type", 0);
        p(this, false);
        this.l0 = new Paint();
        this.m0 = activity.getResources().getDrawable(R.drawable.layer_shadow);
        this.n0 = new Paint();
        ArticleViewer$WindowView articleViewer$WindowView = new ArticleViewer$WindowView(this, activity);
        this.f0 = articleViewer$WindowView;
        articleViewer$WindowView.setWillNotDraw(false);
        this.f0.setClipChildren(true);
        this.f0.setFocusable(false);
        l0 l0Var = new l0(this, activity, i11);
        this.g0 = l0Var;
        this.f0.addView(l0Var, w7.b6.e(-1, -1, 51));
        if (this.K == null) {
            this.f0.setFitsSystemWindows(true);
            this.g0.setOnApplyWindowInsetsListener(new org.telegram.ui.ActionBar.a3(i10));
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        this.P = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.P.setVisibility(4);
        this.f0.addView(this.P, w7.b6.c(-1.0f, -1));
        k4 k4Var = new k4(activity);
        this.R = k4Var;
        k4Var.setVisibility(0);
        this.R.setBackgroundColor(-16777216);
        this.P.addView(this.R, w7.b6.e(-1, -1, 17));
        this.Q = new TextureView(activity);
        int i12 = 2;
        this.u0 = new l3[2];
        int i13 = 0;
        while (true) {
            l3[] l3VarArr = this.u0;
            if (i13 >= l3VarArr.length) {
                break;
            }
            l3 l3Var = new l3(this, activity);
            l3VarArr[i13] = l3Var;
            l3Var.setVisibility(i13 == 0 ? 0 : 8);
            this.g0.addView(l3Var, w7.b6.d(-1, -1.0f, org.telegram.messenger.zs.E1, 0.0f, 0.0f, 0.0f, 0.0f));
            l3Var.b.setOnItemLongClickListener(new r(this));
            l3Var.b.setOnItemClickListener(new ng.d(i12, this, l3Var));
            i13++;
        }
        this.g0.addView(new FrameLayout(activity), w7.b6.d(-1, -1.0f, org.telegram.messenger.zs.E1, 0.0f, 0.0f, 0.0f, 0.0f));
        this.w0.setColor(-16777216);
        this.x0.setColor(-16777216);
        this.A0.setColor(-14408666);
        this.y0.setColor(-16777216);
        m0 m0Var = new m0(this, activity);
        this.h0 = m0Var;
        m0Var.e0 = this.K != null;
        this.g0.addView(m0Var, w7.b6.e(-1, -2, 48));
        this.h0.setOnClickListener(new ag.t0(23, this, activity));
        this.h0.b0.addTextChangedListener(new n0(this, i11));
        org.telegram.ui.web.j jVar = new org.telegram.ui.web.j(activity);
        this.i0 = jVar;
        jVar.setOpenProgress(0.0f);
        this.i0.x.j(new h3(this, i12));
        this.g0.addView(this.i0, w7.b6.c(-1.0f, -1));
        int i14 = 3;
        this.j0 = new y(this, i14);
        this.h0.L.setOnClickListener(new q(this, i12));
        this.h0.L.setOnLongClickListener(new s(this, i11));
        this.h0.setMenuListener(new ag.e0(11, this, activity));
        this.h0.O.setOnClickListener(new q(this, i14));
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.L, 10);
        this.q0 = a5Var;
        a5Var.setOnTouchListener(new org.telegram.ui.ActionBar.n2(i12));
        this.q0.setWillNotDraw(false);
        this.q0.setTranslationY(org.telegram.messenger.i0.L(51.0f));
        this.q0.setVisibility(4);
        this.q0.setFocusable(true);
        this.q0.setFocusableInTouchMode(true);
        this.q0.setClickable(true);
        this.q0.setPadding(0, org.telegram.messenger.i0.L(3.0f), 0, 0);
        this.g0.addView(this.q0, w7.b6.e(-1, 51, 80));
        new vh.r2(this.f0, false, new p(this, i11));
        ImageView imageView = new ImageView(this.L);
        this.r0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.r0.setImageResource(R.drawable.msg_go_up);
        ImageView imageView2 = this.r0;
        int i15 = org.telegram.ui.ActionBar.t6.G6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.a7.t(imageView2, i15, null, mode);
        ImageView imageView3 = this.r0;
        int i16 = org.telegram.ui.ActionBar.t6.z8;
        org.telegram.ui.ActionBar.a7.R(imageView3, org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i16, false), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i16), null);
        this.q0.addView(this.r0, w7.b6.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        this.r0.setOnClickListener(new q(this, i11));
        this.r0.setContentDescription(org.telegram.messenger.cd.L0(2131754779, null));
        ImageView imageView4 = new ImageView(this.L);
        this.s0 = imageView4;
        imageView4.setScaleType(scaleType);
        this.s0.setImageResource(R.drawable.msg_go_down);
        org.telegram.ui.ActionBar.a7.t(this.s0, i15, null, mode);
        org.telegram.ui.ActionBar.a7.R(this.s0, org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i16, false), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i16), null);
        this.q0.addView(this.s0, w7.b6.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        this.s0.setOnClickListener(new q(this, i10));
        this.s0.setContentDescription(org.telegram.messenger.cd.L0(2131754778, null));
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(this.L, true, true, true);
        this.t0 = f6Var;
        f6Var.setScaleProperty(0.6f);
        this.t0.b(0.4f, 350L, org.telegram.ui.Components.gr.h);
        org.telegram.ui.ActionBar.a7.Z(this.t0, i15, null);
        this.t0.setTextSize(org.telegram.messenger.i0.L(15.0f));
        this.t0.setTypeface(org.telegram.messenger.i0.o());
        this.t0.setGravity(3);
        this.t0.getDrawable().M = org.telegram.messenger.i0.q.x;
        this.q0.addView(this.t0, w7.b6.d(-2, -2.0f, 19, 18.0f, 0.0f, 108.0f, 0.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.e0 = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 98;
        layoutParams.softInputMode = 48;
        layoutParams.flags = 131072;
        int x02 = this.K == null ? org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.a7, true) : org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.a7, false);
        int i17 = (org.telegram.messenger.i0.B(x02) < 0.721f || Build.VERSION.SDK_INT < 26) ? 1792 : 1808;
        this.y0.setColor(x02);
        this.z0 = true;
        WindowManager.LayoutParams layoutParams2 = this.e0;
        layoutParams2.systemUiVisibility = i17;
        layoutParams2.flags |= -2147417856;
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams2.layoutInDisplayCutoutMode = 1;
        }
        org.telegram.ui.Cells.k9 k9Var = new org.telegram.ui.Cells.k9();
        this.P0 = k9Var;
        k9Var.S(this.u0[0].b);
        if (org.telegram.messenger.vp.r1(this.X).t7.s()) {
            this.P0.k0 = new r(this);
        }
        org.telegram.ui.Cells.k9 k9Var2 = this.P0;
        k9Var2.z0 = this.u0[0].d;
        k9Var2.D = new p0(this, i11);
        this.g0.addView(k9Var2.n(activity));
        l0 l0Var2 = this.g0;
        qs0 qs0Var = new qs0(l0Var2, l0Var2);
        this.R0 = qs0Var;
        qs0Var.F = new r(this);
        qs0Var.E = new e(this, i10);
        this.l0.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Dl, false));
        e0(this);
    }

    public final void X(String str) {
        String str2;
        if (this.L == null) {
            return;
        }
        org.telegram.ui.ActionBar.z2 z2Var = this.I;
        if (z2Var != null) {
            z2Var.dismiss();
            this.I = null;
        }
        int i10 = 0;
        org.telegram.ui.ActionBar.z2 h = org.telegram.messenger.z20.h(this.L, false, 1, null);
        try {
            str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
            str2 = str;
        }
        h.O = str2;
        h.P = false;
        h.Q = true;
        CharSequence[] charSequenceArr = {org.telegram.messenger.cd.L0(2131747833, null), org.telegram.messenger.cd.L0(2131751767, null)};
        eg.j jVar = new eg.j(2, this, str);
        h.L = charSequenceArr;
        h.K = jVar;
        h.H0 = new t(this, i10);
        Y(h);
    }

    public final void Y(org.telegram.ui.ActionBar.z2 z2Var) {
        if (this.L == null) {
            return;
        }
        try {
            org.telegram.ui.ActionBar.z2 z2Var2 = this.k0;
            if (z2Var2 != null) {
                z2Var2.dismiss();
                this.k0 = null;
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        try {
            this.k0 = z2Var;
            z2Var.setCanceledOnTouchOutside(true);
            this.k0.setOnDismissListener(new t(this, 1));
            z2Var.show();
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
    }

    public final void Z(boolean z10) {
        org.telegram.messenger.i0.r(this.j0);
        if (!z10) {
            this.h0.d0.a(true, 1.0f);
            return;
        }
        this.h0.d0.a(false, 0.0f);
        this.h0.d0.a(true, 0.3f);
        org.telegram.messenger.i0.h3(this.j0, 100L);
    }

    @Override // org.telegram.ui.m60
    public final void a(f4 f4Var, org.telegram.ui.Components.uz0 uz0Var) {
        String str;
        String str2;
        org.telegram.ui.Components.q80 q80Var;
        if (uz0Var == null || (str = uz0Var.b) == null) {
            return;
        }
        org.telegram.ui.ActionBar.z2 z2Var = this.I;
        k0 k0Var = null;
        if (z2Var != null) {
            z2Var.dismiss();
            this.I = null;
        }
        int lastIndexOf = str.lastIndexOf(35);
        boolean z10 = false;
        if (lastIndexOf != -1) {
            String lowerCase = !TextUtils.isEmpty(f4Var.E.cached_page.url) ? f4Var.E.cached_page.url.toLowerCase() : f4Var.E.url.toLowerCase();
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
        z2 z2Var2 = this.d;
        if (z2Var2 != null && (q80Var = this.b) != null) {
            k0Var = new k0(this, z2Var2, q80Var);
        }
        O(str, str2, k0Var);
    }

    public final void a0() {
        LaunchActivity launchActivity;
        FrameLayout frameLayout;
        if (!this.W || (launchActivity = LaunchActivity.I1) == null || launchActivity.isFinishing()) {
            return;
        }
        if (!this.u0[0].f()) {
            l3 l3Var = this.u0[0];
            TLRPC.WebPage webPage = l3Var.c.E;
            frameLayout = l3Var;
            if (webPage == null) {
                return;
            }
        } else if (this.u0[0].getWebView() == null) {
            return;
        } else {
            frameLayout = this.u0[0].f;
        }
        new org.telegram.ui.Components.cc(frameLayout, null).G(R.raw.chats_infotip, 4, org.telegram.messenger.i0.T2(org.telegram.messenger.cd.L0(2131752874, null), new y(this, 11))).k(true);
    }

    @Override // org.telegram.ui.m60
    public final boolean b(TL_iv.PageBlock pageBlock, f4 f4Var) {
        int indexOf;
        List list;
        org.telegram.ui.ActionBar.k2 k2Var = this.M;
        if (k2Var != null && k2Var.getParentActivity() != null) {
            if (!(pageBlock instanceof TL_iv.pageBlockVideo) || e4.g(f4Var.E, pageBlock)) {
                ArrayList arrayList = new ArrayList(f4Var.f);
                indexOf = f4Var.f.indexOf(pageBlock);
                list = arrayList;
            } else {
                list = Collections.singletonList(pageBlock);
                indexOf = 0;
            }
            PhotoViewer v12 = PhotoViewer.v1();
            v12.N2(null, this.M, null);
            if (v12.h2(null, null, null, null, null, null, null, indexOf, new d3(this, list), null, 0L, 0L, 0L, true, new n3(this, f4Var.E, list), null)) {
                l();
                return true;
            }
        }
        return false;
    }

    public final void b0(boolean z10) {
        this.q0.setVisibility(0);
        ValueAnimator valueAnimator = this.Y0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Z0, z10 ? 1.0f : 0.0f);
        this.Y0 = ofFloat;
        ofFloat.addUpdateListener(new o(this, 1));
        this.Y0.addListener(new eg.m(5, this, z10));
        this.Y0.setDuration(320L);
        this.Y0.setInterpolator(org.telegram.ui.Components.gr.h);
        this.Y0.start();
    }

    public final void c0(int i10, Object obj, boolean z10) {
        int L;
        if (obj != null) {
            if ((!(obj instanceof TLRPC.WebPage) || ((TLRPC.WebPage) obj).cached_page == null) && !(obj instanceof x2)) {
                return;
            }
            int i11 = 0;
            if (!z10 && i10 != 0) {
                l3[] l3VarArr = this.u0;
                l3 l3Var = l3VarArr[1];
                l3VarArr[1] = l3VarArr[0];
                l3VarArr[0] = l3Var;
                this.h0.i();
                this.a1.a(this.u0[0].getBackgroundColor(), true);
                this.b1.a(this.u0[1].getBackgroundColor(), true);
                u3 u3Var = this.K;
                if (u3Var != null) {
                    u3Var.y();
                }
                int indexOfChild = this.g0.indexOfChild(this.u0[0]);
                int indexOfChild2 = this.g0.indexOfChild(this.u0[1]);
                if (i10 == 1) {
                    if (indexOfChild < indexOfChild2) {
                        this.g0.removeView(this.u0[0]);
                        this.g0.addView(this.u0[0], indexOfChild2);
                    }
                } else if (indexOfChild2 < indexOfChild) {
                    this.g0.removeView(this.u0[0]);
                    this.g0.addView(this.u0[0], indexOfChild);
                }
                this.v0 = new AnimatorSet();
                this.u0[0].setVisibility(0);
                int i12 = i10 == 1 ? 0 : 1;
                this.u0[i12].setBackgroundColor(this.K == null ? 0 : this.l0.getColor());
                this.u0[i12].setLayerType(2, null);
                if (i10 == 1) {
                    l3 l3Var2 = this.u0[0];
                    Point point = org.telegram.messenger.i0.q;
                    l3Var2.setTranslationX(point.x);
                    this.v0.playTogether(ObjectAnimator.ofFloat(this.u0[0], (Property<l3, Float>) View.TRANSLATION_X, point.x, 0.0f));
                } else if (i10 == -1) {
                    this.u0[0].setTranslationX(0.0f);
                    this.v0.playTogether(ObjectAnimator.ofFloat(this.u0[1], (Property<l3, Float>) View.TRANSLATION_X, 0.0f, org.telegram.messenger.i0.q.x));
                }
                this.v0.setDuration(320L);
                this.v0.setInterpolator(org.telegram.ui.Components.gr.h);
                this.v0.addListener(new t0(this, i12, i11));
                this.f0.f = true;
                m0 m0Var = this.h0;
                l3 l3Var3 = this.u0[0];
                m0Var.setMenuColors((l3Var3 == null || !org.telegram.messenger.tz.v0) ? org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Dl, false) : l3Var3.getBackgroundColor());
                m0 m0Var2 = this.h0;
                l3 l3Var4 = this.u0[0];
                m0Var2.d((l3Var4 == null || !org.telegram.messenger.tz.v0) ? org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Dl, false) : l3Var4.getActionBarColor(), true);
                m0 m0Var3 = this.h0;
                l3 l3Var5 = this.u0[0];
                m0Var3.setIsTonsite(l3Var5 != null && l3Var5.e());
                m0 m0Var4 = this.h0;
                l3 l3Var6 = this.u0[0];
                m0Var4.setIsLocal(l3Var6 != null && l3Var6.d());
                AnimatorSet animatorSet = this.v0;
                Objects.requireNonNull(animatorSet);
                org.telegram.messenger.i0.g3(new rr0(animatorSet, 4));
            }
            if (!z10) {
                this.P0.f(true);
            }
            f4 f4Var = this.u0[z10 ? 1 : 0].c;
            if (z10) {
                obj = i0.a.g(2, this.d0);
            }
            this.u0[z10 ? 1 : 0].b();
            if (obj instanceof TLRPC.WebPage) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj;
                this.u0[z10 ? 1 : 0].setWeb(null);
                this.u0[z10 ? 1 : 0].setType(0);
                TL_iv.Page page = webPage.cached_page;
                f4Var.G = page.rtl;
                f4Var.E = webPage;
                int size = page.blocks.size();
                int i13 = 0;
                while (i13 < size) {
                    TL_iv.PageBlock pageBlock = webPage.cached_page.blocks.get(i13);
                    if (i13 == 0) {
                        pageBlock.first = true;
                        if (pageBlock instanceof TL_iv.pageBlockCover) {
                            TL_iv.pageBlockCover pageblockcover = (TL_iv.pageBlockCover) pageBlock;
                            TL_iv.RichText u10 = u(0, pageblockcover);
                            TL_iv.RichText u11 = u(1, pageblockcover);
                            if (((u10 != null && !(u10 instanceof TL_iv.textEmpty)) || (u11 != null && !(u11 instanceof TL_iv.textEmpty))) && size > 1) {
                                TL_iv.PageBlock pageBlock2 = webPage.cached_page.blocks.get(1);
                                if (pageBlock2 instanceof TL_iv.pageBlockChannel) {
                                    f4Var.F = (TL_iv.pageBlockChannel) pageBlock2;
                                }
                            }
                        }
                    } else if (i13 == 1 && f4Var.F != null) {
                        i13++;
                    }
                    f4Var.F(f4Var, pageBlock, 0, 0, i13 == size + (-1) ? i13 : 0);
                    i13++;
                }
                f4Var.f();
                if (this.d0.size() == 1 || i10 == -1) {
                    SharedPreferences sharedPreferences = org.telegram.messenger.w0.b.getSharedPreferences("articles", 0);
                    String str = "article" + webPage.id;
                    int i14 = sharedPreferences.getInt(str, -1);
                    boolean z11 = sharedPreferences.getBoolean(str + "r", true);
                    Point point2 = org.telegram.messenger.i0.q;
                    if (z11 == (point2.x <= point2.y ? 0 : 1)) {
                        L = sharedPreferences.getInt(str + "o", 0) - this.u0[z10 ? 1 : 0].b.getPaddingTop();
                    } else {
                        L = org.telegram.messenger.i0.L(10.0f);
                    }
                    if (i14 != -1) {
                        this.u0[z10 ? 1 : 0].d.h1(i14, L);
                    }
                } else {
                    s4.a0 a0Var = this.u0[z10 ? 1 : 0].d;
                    u3 u3Var2 = this.K;
                    a0Var.h1(u3Var2 == null ? 0 : 1, u3Var2 != null ? org.telegram.messenger.i0.L(32.0f) : 0);
                }
            } else if (obj instanceof x2) {
                this.u0[z10 ? 1 : 0].setType(1);
                this.u0[z10 ? 1 : 0].g();
                this.u0[z10 ? 1 : 0].setWeb((x2) obj);
            }
            if (!z10) {
                k(null);
            }
            g0(false);
            d0();
        }
    }

    public final void d0() {
        l3[] l3VarArr;
        l3 l3Var;
        if (this.h0 == null || (l3Var = (l3VarArr = this.u0)[0]) == null || l3VarArr[1] == null) {
            return;
        }
        float translationX = l3Var.getVisibility() != 0 ? 0.0f : 1.0f - (this.u0[0].getTranslationX() / this.u0[0].getWidth());
        float f7 = 1.0f - translationX;
        m0 m0Var = this.h0;
        m0Var.d[0] = this.u0[0].getProgress();
        m0Var.invalidate();
        m0 m0Var2 = this.h0;
        m0Var2.d[1] = this.u0[1].getProgress();
        m0Var2.invalidate();
        this.h0.setTransitionProgress(f7);
        m0 m0Var3 = this.h0;
        if (!m0Var3.W && !m0Var3.T) {
            ArticleViewer$WindowView articleViewer$WindowView = this.f0;
            if (articleViewer$WindowView.e || articleViewer$WindowView.f) {
                boolean H = H();
                ArrayList arrayList = this.d0;
                if (H || arrayList.size() > 1) {
                    float T1 = org.telegram.messenger.i0.T1((this.u0[0].s || arrayList.size() > 1) ? 1.0f : 0.0f, (this.u0[1].s || arrayList.size() > 2) ? 1.0f : 0.0f, f7);
                    this.h0.M.c(false, 1.0f - T1);
                    this.h0.P.c();
                    this.h0.setBackButtonCached(T1 > 0.5f);
                } else {
                    this.h0.P.c();
                    this.h0.setBackButtonCached(false);
                }
                this.h0.setHasForward(this.u0[0].w);
                this.h0.setIsLocal(this.u0[0].d());
                this.h0.setIsLoaded(this.u0[0].getWebView() != null && this.u0[0].getWebView().b);
            }
        }
        m0 m0Var4 = this.h0;
        int actionBarColor = this.u0[0].getActionBarColor();
        ArticleViewer$WindowView articleViewer$WindowView2 = this.f0;
        m0Var4.b(0, this.a1.a(actionBarColor, articleViewer$WindowView2.e || articleViewer$WindowView2.f));
        m0 m0Var5 = this.h0;
        int actionBarColor2 = this.u0[1].getActionBarColor();
        ArticleViewer$WindowView articleViewer$WindowView3 = this.f0;
        m0Var5.b(1, this.b1.a(actionBarColor2, articleViewer$WindowView3.e || articleViewer$WindowView3.f));
        this.h0.d(i0.b.f(f7, this.u0[0].getActionBarColor(), this.u0[1].getActionBarColor()), false);
        this.h0.setMenuType((translationX > 0.5f ? this.u0[0] : this.u0[1]).a);
        u3 u3Var = this.K;
        if (u3Var != null) {
            u3Var.c.invalidate();
            return;
        }
        ArticleViewer$WindowView articleViewer$WindowView4 = this.f0;
        if (articleViewer$WindowView4 != null) {
            articleViewer$WindowView4.invalidate();
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        z0 z0Var;
        org.telegram.messenger.jj messageObject;
        if (i10 == org.telegram.messenger.zs.h2) {
            if (this.u0 == null) {
                return;
            }
            int i12 = 0;
            while (true) {
                l3[] l3VarArr = this.u0;
                if (i12 >= l3VarArr.length) {
                    return;
                }
                int childCount = l3VarArr[i12].b.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = this.u0[i12].b.getChildAt(i13);
                    if (childAt instanceof z0) {
                        ((z0) childAt).a(true);
                    }
                }
                i12++;
            }
        } else if (i10 == org.telegram.messenger.zs.f2 || i10 == org.telegram.messenger.zs.g2) {
            if (this.u0 == null) {
                return;
            }
            int i14 = 0;
            while (true) {
                l3[] l3VarArr2 = this.u0;
                if (i14 >= l3VarArr2.length) {
                    return;
                }
                int childCount2 = l3VarArr2[i14].b.getChildCount();
                for (int i15 = 0; i15 < childCount2; i15++) {
                    View childAt2 = this.u0[i14].b.getChildAt(i15);
                    if (childAt2 instanceof z0) {
                        z0 z0Var2 = (z0) childAt2;
                        if (z0Var2.getMessageObject() != null) {
                            z0Var2.a(true);
                        }
                    }
                }
                i14++;
            }
        } else if (i10 == org.telegram.messenger.zs.e2) {
            Integer num = (Integer) objArr[0];
            if (this.u0 == null) {
                return;
            }
            int i16 = 0;
            while (true) {
                l3[] l3VarArr3 = this.u0;
                if (i16 >= l3VarArr3.length) {
                    return;
                }
                int childCount3 = l3VarArr3[i16].b.getChildCount();
                int i17 = 0;
                while (true) {
                    if (i17 < childCount3) {
                        View childAt3 = this.u0[i16].b.getChildAt(i17);
                        if ((childAt3 instanceof z0) && (messageObject = (z0Var = (z0) childAt3).getMessageObject()) != null && messageObject.f1() == num.intValue()) {
                            org.telegram.messenger.jj jjVar = MediaController.B().u0;
                            if (jjVar != null) {
                                messageObject.b0 = jjVar.b0;
                                messageObject.g0 = jjVar.g0;
                                messageObject.h0 = jjVar.h0;
                                z0Var.b();
                            }
                        } else {
                            i17++;
                        }
                    }
                }
                i16++;
            }
        } else {
            if (i10 != org.telegram.messenger.zs.i4 || this.u0 == null) {
                return;
            }
            int i18 = 0;
            while (true) {
                l3[] l3VarArr4 = this.u0;
                if (i18 >= l3VarArr4.length) {
                    return;
                }
                int childCount4 = l3VarArr4[i18].b.getChildCount();
                for (int i19 = 0; i19 < childCount4; i19++) {
                    View childAt4 = this.u0[i18].b.getChildAt(i19);
                    if (childAt4 instanceof s2) {
                        ((s2) childAt4).e.invalidate();
                    } else {
                        childAt4.invalidate();
                    }
                }
                i18++;
            }
        }
    }

    public final void e(int i10, String str) {
        S();
        x2 x2Var = new x2();
        x2Var.x = str;
        this.d0.add(x2Var);
        this.h0.h(false);
        c0(i10, x2Var, false);
    }

    public final boolean f(TLRPC.WebPage webPage, String str, int i10) {
        S();
        this.d0.add(webPage);
        this.h0.h(false);
        c0(i10, webPage, false);
        return T(str, false);
    }

    public final void f0() {
        int i10;
        int size;
        if (this.E != null || this.u0[0].f()) {
            if (this.u0[0].f()) {
                i10 = this.u0[0].getWebView() == null ? 0 : this.u0[0].getWebView().getSearchIndex();
                size = this.u0[0].getWebView() == null ? 0 : this.u0[0].getWebView().getSearchCount();
            } else {
                i10 = this.G;
                size = this.E.size();
            }
            this.r0.setEnabled(size > 0 && i10 != 0);
            this.s0.setEnabled(size > 0 && i10 != size + (-1));
            ImageView imageView = this.r0;
            imageView.setAlpha(imageView.isEnabled() ? 1.0f : 0.5f);
            ImageView imageView2 = this.s0;
            imageView2.setAlpha(imageView2.isEnabled() ? 1.0f : 0.5f);
            this.t0.a();
            if (size < 0) {
                this.t0.setText("");
                return;
            }
            if (size == 0) {
                this.t0.setText(org.telegram.messenger.cd.L0(2131748183, null));
            } else if (size == 1) {
                this.t0.setText(org.telegram.messenger.cd.L0(2131747843, null));
            } else {
                this.t0.setText(String.format(org.telegram.messenger.cd.J0(size, "CountOfResults"), Integer.valueOf(i10 + 1), Integer.valueOf(size)));
            }
        }
    }

    public final void g0(boolean z10) {
        boolean z11 = false;
        this.h0.g(0, this.u0[0].getTitle(), z10);
        this.h0.f(0, this.u0[0].getSubtitle());
        this.h0.e(0, this.u0[0].f() && this.u0[0].getWebView() != null && this.u0[0].getWebView().E);
        this.h0.g(1, this.u0[1].getTitle(), z10);
        this.h0.f(1, this.u0[1].getSubtitle());
        m0 m0Var = this.h0;
        if (this.u0[1].f() && this.u0[1].getWebView() != null && this.u0[1].getWebView().E) {
            z11 = true;
        }
        m0Var.e(1, z11);
    }

    public final void i() {
        this.K0 = false;
        y2 y2Var = this.L0;
        if (y2Var != null) {
            this.f0.removeCallbacks(y2Var);
            this.L0 = null;
        }
        y2 y2Var2 = this.M0;
        if (y2Var2 != null) {
            this.f0.removeCallbacks(y2Var2);
            this.M0 = null;
        }
    }

    public final void k(org.telegram.messenger.ie ieVar) {
        if (this.J0 == org.telegram.messenger.i0.L(56.0f)) {
            if (ieVar != null) {
                ieVar.run();
                return;
            }
            return;
        }
        ValueAnimator duration = ValueAnimator.ofObject(new IntEvaluator(), Integer.valueOf(this.J0), Integer.valueOf(org.telegram.messenger.i0.L(56.0f))).setDuration(180L);
        duration.setInterpolator(new DecelerateInterpolator());
        duration.addUpdateListener(new o(this, 0));
        duration.addListener(new bg.e(ieVar, 23));
        if (ieVar != null) {
            duration.setDuration(duration.getDuration() / 2);
        }
        duration.start();
    }

    public final void l() {
        v2 v2Var;
        g3 g3Var = this.u0[0].b;
        if (g3Var == null || !this.W) {
            return;
        }
        float measuredHeight = g3Var.getMeasuredHeight() / 2.0f;
        float f7 = 0.0f;
        v2 v2Var2 = null;
        for (int i10 = 0; i10 < g3Var.getChildCount(); i10++) {
            View childAt = g3Var.getChildAt(i10);
            if (childAt instanceof v2) {
                float measuredHeight2 = (childAt.getMeasuredHeight() / 2.0f) + childAt.getTop();
                if (v2Var2 == null || Math.abs(measuredHeight - measuredHeight2) < Math.abs(measuredHeight - f7)) {
                    v2Var2 = (v2) childAt;
                    f7 = measuredHeight2;
                }
            }
        }
        boolean z10 = PhotoViewer.v1().f;
        if (z10 || ((v2Var = this.y) != null && v2Var != v2Var2 && this.x != null)) {
            VideoPlayerHolderBase videoPlayerHolderBase = this.x;
            if (videoPlayerHolderBase != null) {
                v2 v2Var3 = this.y;
                long j10 = v2Var3.L.video_id;
                w2 a2 = w2.a(videoPlayerHolderBase, v2Var3);
                v2Var3.c(a2);
                this.D.k(a2, j10);
                v2 v2Var4 = this.y;
                w2 w2Var = v2Var4.M;
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
        m60 m60Var = v2Var2.a;
        if (v2Var2.O != null && m60Var.x == null) {
            m60Var.x = new u2(v2Var2).with(v2Var2.n);
            TLRPC.Document document = v2Var2.O;
            for (int i11 = 0; i11 < document.attributes.size(); i11++) {
                if (document.attributes.get(i11) instanceof TLRPC.TL_documentAttributeVideo) {
                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i11);
                    v2Var2.h.a(tL_documentAttributeVideo.w / tL_documentAttributeVideo.h, 0);
                }
            }
            TLRPC.WebPage webPage = v2Var2.b.E;
            Uri f10 = webPage != null ? org.telegram.messenger.x8.f(((h4) m60Var).X, webPage, document) : null;
            if (f10 != null) {
                VideoPlayerHolderBase videoPlayerHolderBase2 = m60Var.x;
                w2 w2Var2 = v2Var2.M;
                videoPlayerHolderBase2.seekTo(w2Var2 == null ? 0L : w2Var2.a);
                m60Var.x.preparePlayer(f10, true, 1.0f);
                m60Var.x.play();
            }
        }
        this.y = v2Var2;
    }

    public final void m(boolean z10, boolean z11) {
        if (this.L == null || this.U0 || !this.V) {
            return;
        }
        int i10 = 0;
        if (this.Z != 0 && Math.abs(this.b0 - System.currentTimeMillis()) >= 500) {
            Runnable runnable = this.a0;
            if (runnable != null) {
                runnable.run();
                this.a0 = null;
            }
            this.Z = 0;
        }
        if (this.Z != 0) {
            return;
        }
        u3 u3Var = this.K;
        if (u3Var != null) {
            u3Var.a(false);
            return;
        }
        if (this.P.getVisibility() == 0) {
            if (this.O != null) {
                this.P.setVisibility(4);
                this.S.onCustomViewHidden();
                this.P.removeView(this.O);
                this.O = null;
            } else {
                org.telegram.ui.Components.m81 m81Var = this.F0;
                if (m81Var != null && m81Var.T) {
                    m81Var.T = false;
                    m81Var.m();
                    m81Var.l(false);
                }
            }
            if (!z11) {
                return;
            }
        }
        if (this.P0.x()) {
            this.P0.f(false);
            return;
        }
        m0 m0Var = this.h0;
        if (m0Var.T) {
            m0Var.h(false);
            return;
        }
        if (m0Var.W) {
            m0Var.k(false);
            return;
        }
        if (this.G0 != 0) {
            ConnectionsManager.getInstance(this.X).cancelRequest(this.G0, true);
            this.G0 = 0;
            Z(false);
        }
        if (this.H0 != 0) {
            ConnectionsManager.getInstance(this.X).cancelRequest(this.H0, true);
            this.H0 = 0;
            Z(false);
        }
        S();
        if (z10 && !z11) {
            ArrayList arrayList = this.d0;
            if (arrayList.size() >= 2) {
                Object v = i0.a.v(1, arrayList);
                if (v instanceof x2) {
                    ((x2) v).a();
                }
                if (v instanceof TLRPC.WebPage) {
                    org.telegram.ui.web.y1.o((TLRPC.WebPage) v);
                }
                c0(-1, arrayList.get(arrayList.size() - 1), false);
                return;
            }
        }
        org.telegram.messenger.zs.f(this.X).n(this, org.telegram.messenger.zs.e2);
        org.telegram.messenger.zs.f(this.X).n(this, org.telegram.messenger.zs.f2);
        org.telegram.messenger.zs.f(this.X).n(this, org.telegram.messenger.zs.g2);
        org.telegram.messenger.zs.f(this.X).n(this, org.telegram.messenger.zs.h2);
        org.telegram.messenger.zs.f(this.X).n(this, org.telegram.messenger.zs.i4);
        aa0 aa0Var = this.V0;
        if (aa0Var != null) {
            aa0Var.b();
            this.V0 = null;
        }
        this.M = null;
        try {
            org.telegram.ui.ActionBar.z2 z2Var = this.k0;
            if (z2Var != null) {
                z2Var.dismiss();
                this.k0 = null;
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArticleViewer$WindowView articleViewer$WindowView = this.f0;
        Property property = View.ALPHA;
        animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, (Property<ArticleViewer$WindowView, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.g0, (Property<l0, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.f0, (Property<ArticleViewer$WindowView, Float>) View.TRANSLATION_X, 0.0f, org.telegram.messenger.i0.L(56.0f)));
        this.Z = 2;
        this.a0 = new y(this, 10);
        animatorSet.setDuration(150L);
        animatorSet.setInterpolator(this.c0);
        animatorSet.addListener(new bg.e(this, 24));
        this.b0 = System.currentTimeMillis();
        this.g0.setLayerType(2, null);
        animatorSet.start();
        while (true) {
            a0.h hVar = this.D;
            if (i10 >= hVar.m()) {
                hVar.b();
                return;
            }
            w2 w2Var = (w2) hVar.n(i10);
            Bitmap bitmap = w2Var.b;
            if (bitmap != null) {
                bitmap.recycle();
                w2Var.b = null;
            }
            i10++;
        }
    }

    public final void q() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d0;
            if (i10 >= arrayList.size()) {
                arrayList.clear();
                r();
                return;
            }
            Object obj = arrayList.get(i10);
            if (obj instanceof x2) {
                l3 l3Var = this.u0[0];
                if (l3Var != null && l3Var.K == obj) {
                    ((x2) obj).c(l3Var);
                }
                l3 l3Var2 = this.u0[1];
                if (l3Var2 != null && l3Var2.K == obj) {
                    ((x2) obj).c(l3Var2);
                }
                ((x2) obj).a();
            } else if (obj instanceof TLRPC.WebPage) {
                org.telegram.ui.web.y1.o((TLRPC.WebPage) obj);
            }
            i10++;
        }
    }

    public final void r() {
        ArticleViewer$WindowView articleViewer$WindowView;
        if (this.L == null || (articleViewer$WindowView = this.f0) == null) {
            return;
        }
        if (this.K == null) {
            try {
                if (articleViewer$WindowView.getParent() != null) {
                    ((WindowManager) this.L.getSystemService("window")).removeViewImmediate(this.f0);
                }
                this.f0 = null;
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        for (int i10 = 0; i10 < this.N.size(); i10++) {
            ((r1) this.N.get(i10)).a(true);
        }
        this.N.clear();
        try {
            this.L.getWindow().clearFlags(128);
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
        this.L = null;
        this.M = null;
        d1 = null;
    }

    public h4(org.telegram.ui.ActionBar.k2 k2Var) {
        this.N = new ArrayList();
        this.Y = 1;
        this.c0 = new DecelerateInterpolator(1.5f);
        this.d0 = new ArrayList();
        this.w0 = new Paint();
        this.x0 = new Paint();
        this.y0 = new Paint();
        this.A0 = new Paint();
        this.K0 = false;
        this.L0 = null;
        this.M0 = null;
        this.S0 = new e2.f(new int[]{org.telegram.messenger.zs.s, org.telegram.messenger.zs.t});
        this.T0 = new l0[2];
        this.X0 = -1;
        y yVar = new y(this, 4);
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.a1 = new org.telegram.ui.Components.w4(yVar, 320L, grVar);
        this.b1 = new org.telegram.ui.Components.w4(new y(this, 5), 320L, grVar);
        this.J = true;
        this.K = new u3(this, k2Var);
        W(k2Var.getParentActivity(), k2Var);
    }
}
