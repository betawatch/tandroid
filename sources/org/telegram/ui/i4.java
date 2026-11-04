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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i4 extends i50 implements org.telegram.messenger.cs {
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
    public org.telegram.ui.Components.d71 F0;
    public org.telegram.ui.Components.d71 G0;
    public int H0;
    public int I0;
    public int J0;
    public final boolean K;
    public int K0;
    public final u3 L;
    public boolean L0;
    public Activity M;
    public z2 M0;
    public org.telegram.ui.ActionBar.d2 N;
    public z2 N0;
    public final ArrayList O;
    public sf.b O0;
    public View P;
    public int P0;
    public FrameLayout Q;
    public org.telegram.ui.Cells.h9 Q0;
    public TextureView R;
    public org.telegram.ui.Cells.h9 R0;
    public l4 S;
    public vq0 S0;
    public WebChromeClient.CustomViewCallback T;
    public final g2.g T0;
    public WindowInsets U;
    public final l0[] U0;
    public boolean V;
    public boolean V0;
    public boolean W;
    public cg.u0 W0;
    public boolean X;
    public ai.e3 X0;
    public int Y;
    public int Y0;
    public int Z;
    public ValueAnimator Z0;
    public int a0;
    public float a1;
    public Runnable b0;
    public final org.telegram.ui.Components.x4 b1;
    public long c0;
    public final org.telegram.ui.Components.x4 c1;
    public final DecelerateInterpolator d0;
    public final ArrayList e0;
    public WindowManager.LayoutParams f0;
    public ArticleViewer$WindowView g0;
    public l0 h0;
    public m0 i0;
    public org.telegram.ui.web.l j0;
    public b0 k0;
    public org.telegram.ui.ActionBar.t2 l0;
    public Paint m0;
    public Drawable n0;
    public Paint o0;
    public boolean p0;
    public float q0;
    public ai.d2 r0;
    public ImageView s0;
    public ImageView t0;
    public org.telegram.ui.Components.h6 u0;
    public l3[] v0;
    public AnimatorSet w0;
    public final Paint x0;
    public final Paint y0;
    public final Paint z0;
    public static final HashSet d1 = new HashSet();
    public static volatile i4 e1 = null;
    public static final r0 f1 = new r0("innerTranslationX", 0);
    public static final TextPaint g1 = new TextPaint(1);
    public static final p3 h1 = new p3();
    public static final WeakHashMap C1 = new WeakHashMap();

    public i4() {
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
        this.T0 = new g2.g(new int[]{org.telegram.messenger.hs.s, org.telegram.messenger.hs.t});
        this.U0 = new l0[2];
        this.Y0 = -1;
        b0 b0Var = new b0(this, 4);
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        this.b1 = new org.telegram.ui.Components.x4(b0Var, 320L, xqVar);
        this.c1 = new org.telegram.ui.Components.x4(new b0(this, 5), 320L, xqVar);
        this.K = false;
        this.L = null;
    }

    public static CharSequence A(i50 i50Var, TLRPC.WebPage webPage, View view, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock, int i3) {
        TextPaint C;
        if (richText2 == null) {
            return null;
        }
        if (richText2 instanceof TL_iv.textFixed) {
            return A(i50Var, webPage, view, richText, ((TL_iv.textFixed) richText2).text, pageBlock, i3);
        }
        if (richText2 instanceof TL_iv.textItalic) {
            return A(i50Var, webPage, view, richText, ((TL_iv.textItalic) richText2).text, pageBlock, i3);
        }
        if (richText2 instanceof TL_iv.textBold) {
            return A(i50Var, webPage, view, richText, ((TL_iv.textBold) richText2).text, pageBlock, i3);
        }
        if (richText2 instanceof TL_iv.textUnderline) {
            return A(i50Var, webPage, view, richText, ((TL_iv.textUnderline) richText2).text, pageBlock, i3);
        }
        if (richText2 instanceof TL_iv.textStrike) {
            return A(i50Var, webPage, view, richText, ((TL_iv.textStrike) richText2).text, pageBlock, i3);
        }
        if (richText2 instanceof TL_iv.textEmail) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A(i50Var, webPage, view, richText, ((TL_iv.textEmail) richText2).text, pageBlock, i3));
            MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder.length() != 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.py0((metricAffectingSpanArr == null || metricAffectingSpanArr.length == 0) ? C(i50Var, richText, richText2, pageBlock) : null, "mailto:" + D(richText2)), 0, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        long j10 = 0;
        if (richText2 instanceof TL_iv.textUrl) {
            TL_iv.textUrl texturl = (TL_iv.textUrl) richText2;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(A(i50Var, webPage, view, richText, texturl.text, pageBlock, i3));
            MetricAffectingSpan[] metricAffectingSpanArr2 = (MetricAffectingSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), MetricAffectingSpan.class);
            C = (metricAffectingSpanArr2 == null || metricAffectingSpanArr2.length == 0) ? C(i50Var, richText, richText2, pageBlock) : null;
            Object qy0Var = texturl.webpage_id != 0 ? new org.telegram.ui.Components.qy0(C, D(richText2)) : new org.telegram.ui.Components.py0(C, D(richText2));
            if (spannableStringBuilder2.length() != 0) {
                spannableStringBuilder2.setSpan(qy0Var, 0, spannableStringBuilder2.length(), 33);
            }
            return spannableStringBuilder2;
        }
        if (richText2 instanceof TL_iv.textPlain) {
            return ((TL_iv.textPlain) richText2).text;
        }
        if (richText2 instanceof TL_iv.textAnchor) {
            TL_iv.textAnchor textanchor = (TL_iv.textAnchor) richText2;
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(A(i50Var, webPage, view, richText, textanchor.text, pageBlock, i3));
            String str = textanchor.name;
            org.telegram.ui.Components.u4 u4Var = new org.telegram.ui.Components.u4();
            u4Var.a = str.toLowerCase();
            spannableStringBuilder3.setSpan(u4Var, 0, spannableStringBuilder3.length(), 17);
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
                TL_iv.RichText y9 = y(richText3);
                boolean z10 = i3 >= 0 && (richText3 instanceof TL_iv.textUrl) && ((TL_iv.textUrl) richText3).webpage_id != j10;
                if (z10 && spannableStringBuilder4.length() != 0 && spannableStringBuilder4.charAt(spannableStringBuilder4.length() - 1) != '\n') {
                    spannableStringBuilder4.append((CharSequence) " ");
                    spannableStringBuilder4.setSpan(new org.telegram.ui.Cells.j9(), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                }
                CharSequence A = A(i50Var, webPage, view, richText, richText3, pageBlock, i3);
                int B = B(y9);
                int length = spannableStringBuilder4.length();
                spannableStringBuilder4.append(A);
                if (B != 0 && !(A instanceof SpannableStringBuilder)) {
                    if ((B & 8) != 0 || (B & 512) != 0) {
                        String D = D(richText3);
                        if (D == null) {
                            D = D(richText);
                        }
                        Object qy0Var2 = (B & 512) != 0 ? new org.telegram.ui.Components.qy0(C(i50Var, richText, y9, pageBlock), D) : new org.telegram.ui.Components.py0(C(i50Var, richText, y9, pageBlock), D);
                        if (length != spannableStringBuilder4.length()) {
                            spannableStringBuilder4.setSpan(qy0Var2, length, spannableStringBuilder4.length(), 33);
                        }
                    } else if (length != spannableStringBuilder4.length()) {
                        TextPaint C2 = C(i50Var, richText, y9, pageBlock);
                        org.telegram.ui.Components.oy0 oy0Var = new org.telegram.ui.Components.oy0();
                        oy0Var.a = C2;
                        spannableStringBuilder4.setSpan(oy0Var, length, spannableStringBuilder4.length(), 33);
                    }
                }
                if (z10 && i10 != size - 1) {
                    spannableStringBuilder4.append((CharSequence) " ");
                    spannableStringBuilder4.setSpan(new org.telegram.ui.Cells.j9(), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                }
                i10++;
                j10 = 0;
            }
            return spannableStringBuilder4;
        }
        if (richText2 instanceof TL_iv.textSubscript) {
            return A(i50Var, webPage, view, richText, ((TL_iv.textSubscript) richText2).text, pageBlock, i3);
        }
        if (richText2 instanceof TL_iv.textSuperscript) {
            return A(i50Var, webPage, view, richText, ((TL_iv.textSuperscript) richText2).text, pageBlock, i3);
        }
        if (richText2 instanceof TL_iv.textMarked) {
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(A(i50Var, webPage, view, richText, ((TL_iv.textMarked) richText2).text, pageBlock, i3));
            MetricAffectingSpan[] metricAffectingSpanArr3 = (MetricAffectingSpan[]) spannableStringBuilder5.getSpans(0, spannableStringBuilder5.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder5.length() != 0) {
                C = (metricAffectingSpanArr3 == null || metricAffectingSpanArr3.length == 0) ? C(i50Var, richText, richText2, pageBlock) : null;
                org.telegram.ui.Components.ny0 ny0Var = new org.telegram.ui.Components.ny0();
                ny0Var.a = C;
                spannableStringBuilder5.setSpan(ny0Var, 0, spannableStringBuilder5.length(), 33);
            }
            return spannableStringBuilder5;
        }
        if (richText2 instanceof TL_iv.textSpoiler) {
            SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(A(i50Var, webPage, view, richText, ((TL_iv.textSpoiler) richText2).text, pageBlock, i3));
            if (spannableStringBuilder6.length() != 0) {
                org.telegram.ui.Components.ty0 ty0Var = new org.telegram.ui.Components.ty0();
                ty0Var.a |= 256;
                spannableStringBuilder6.setSpan(new org.telegram.ui.Components.uy0(ty0Var, 0), 0, spannableStringBuilder6.length(), 33);
            }
            return spannableStringBuilder6;
        }
        if (richText2 instanceof TL_iv.textPhone) {
            SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(A(i50Var, webPage, view, richText, ((TL_iv.textPhone) richText2).text, pageBlock, i3));
            MetricAffectingSpan[] metricAffectingSpanArr4 = (MetricAffectingSpan[]) spannableStringBuilder7.getSpans(0, spannableStringBuilder7.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder7.length() != 0) {
                spannableStringBuilder7.setSpan(new org.telegram.ui.Components.py0((metricAffectingSpanArr4 == null || metricAffectingSpanArr4.length == 0) ? C(i50Var, richText, richText2, pageBlock) : null, "tel:" + D(richText2)), 0, spannableStringBuilder7.length(), 33);
            }
            return spannableStringBuilder7;
        }
        if (richText2 instanceof TL_iv.textImage) {
            TL_iv.textImage textimage = (TL_iv.textImage) richText2;
            TLRPC.Document a10 = e4.a(webPage, textimage.document_id);
            TLRPC.Photo e10 = e4.e(webPage, textimage.photo_id);
            if (a10 != null) {
                SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder("*");
                int L = org.telegram.messenger.g0.L(textimage.w);
                int L2 = org.telegram.messenger.g0.L(textimage.h);
                int abs = Math.abs(i3);
                if (L > abs) {
                    L2 = (int) (L2 * (abs / L));
                    L = abs;
                }
                if (view != null) {
                    int i11 = org.telegram.ui.ActionBar.k6.d6;
                    ((i4) i50Var).getClass();
                    boolean z11 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.x0(null, i11, false)) <= 0.705f;
                    org.telegram.ui.Components.my0 my0Var = new org.telegram.ui.Components.my0();
                    Locale locale = Locale.US;
                    String str2 = L + "_" + L2 + "_i";
                    my0Var.b = L;
                    my0Var.c = L2;
                    boolean z12 = z11;
                    ImageReceiver imageReceiver = new ImageReceiver(view);
                    my0Var.a = imageReceiver;
                    imageReceiver.K0 = true;
                    if (z12) {
                        imageReceiver.h1 = new org.telegram.ui.Components.lf0(13);
                    }
                    imageReceiver.r0(org.telegram.messenger.ac.b(a10), str2, org.telegram.messenger.ac.c(org.telegram.messenger.w7.w(a10.thumbs, 90, false, null, false), a10), str2, null, -1L, null, webPage, 1);
                    spannableStringBuilder8.setSpan(my0Var, 0, spannableStringBuilder8.length(), 33);
                }
                return spannableStringBuilder8;
            }
            if (e10 instanceof org.telegram.ui.web.t1) {
                org.telegram.ui.web.t1 t1Var = (org.telegram.ui.web.t1) e10;
                SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder("*");
                int L3 = org.telegram.messenger.g0.L(textimage.w);
                int L4 = org.telegram.messenger.g0.L(textimage.h);
                int abs2 = Math.abs(i3);
                if (L3 > abs2) {
                    L4 = (int) (L4 * (abs2 / L3));
                    L3 = abs2;
                }
                if (view != null) {
                    org.telegram.ui.Components.my0 my0Var2 = new org.telegram.ui.Components.my0();
                    my0Var2.b = L3;
                    my0Var2.c = L4;
                    ImageReceiver imageReceiver2 = new ImageReceiver(view);
                    my0Var2.a = imageReceiver2;
                    imageReceiver2.K0 = true;
                    org.telegram.ui.web.u1.g(t1Var, imageReceiver2, new org.telegram.ui.Components.go(8));
                    spannableStringBuilder9.setSpan(my0Var2, 0, spannableStringBuilder9.length(), 33);
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
                mi.q a11 = mi.q.a(textmath.source, org.telegram.messenger.g0.L(20.0f), true);
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
                int i14 = org.telegram.ui.ActionBar.k6.G6;
                ((i4) i50Var).getClass();
                spannableStringBuilder10.setSpan(new org.telegram.ui.Components.my0(view, bitmap, i12, i13, org.telegram.ui.ActionBar.k6.x0(null, i14, false), textmath.depth), 0, spannableStringBuilder10.length(), 33);
                String str3 = textmath.source;
                if (str3 != null && !str3.isEmpty()) {
                    spannableStringBuilder10.setSpan(new org.telegram.ui.Cells.n9(textmath.source), 0, spannableStringBuilder10.length(), 33);
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
    public static TextPaint C(i50 i50Var, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock) {
        int i3;
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
        ((i4) i50Var).getClass();
        p3 p3Var = h1;
        p3Var.getClass();
        SparseArray sparseArray2 = p3Var.x;
        SparseArray sparseArray3 = p3Var.w;
        SparseArray sparseArray4 = p3Var.t;
        SparseArray sparseArray5 = p3Var.c;
        SparseArray sparseArray6 = p3Var.b;
        int L9 = org.telegram.messenger.g0.L(org.telegram.messenger.az.Z0 - 16);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            TL_iv.RichText richText3 = ((TL_iv.pageBlockPhoto) pageBlock).caption.text;
            if (richText3 == richText2 || richText3 == richText) {
                L7 = org.telegram.messenger.g0.L(14.0f);
                sparseArray5 = sparseArray6;
            } else {
                L7 = org.telegram.messenger.g0.L(12.0f);
            }
            L8 = L7;
            x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false);
        } else if (pageBlock instanceof TL_iv.pageBlockMap) {
            TL_iv.RichText richText4 = ((TL_iv.pageBlockMap) pageBlock).caption.text;
            if (richText4 == richText2 || richText4 == richText) {
                L6 = org.telegram.messenger.g0.L(14.0f);
                sparseArray5 = sparseArray6;
            } else {
                L6 = org.telegram.messenger.g0.L(12.0f);
            }
            L8 = L6;
            x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false);
        } else {
            if (pageBlock instanceof TL_iv.pageBlockTitle) {
                sparseArray = p3Var.d;
                L8 = org.telegram.messenger.g0.L(23.0f);
                i10 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockKicker) {
                sparseArray = p3Var.e;
                L8 = org.telegram.messenger.g0.L(14.0f);
                i10 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockAuthorDate) {
                sparseArray = p3Var.o;
                L8 = org.telegram.messenger.g0.L(14.0f);
                i10 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockFooter) {
                sparseArray = p3Var.p;
                L8 = org.telegram.messenger.g0.L(14.0f);
                i10 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockSubtitle) {
                sparseArray = p3Var.g;
                L8 = org.telegram.messenger.g0.L(20.0f);
                i10 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
                sparseArray = p3Var.f;
                L8 = org.telegram.messenger.g0.L(20.0f);
                i10 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
                sparseArray = p3Var.h;
                L8 = org.telegram.messenger.g0.L(17.0f);
                i10 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockHeading1) {
                sparseArray = p3Var.i;
                L8 = org.telegram.messenger.g0.L(18.0f);
                i10 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockHeading2) {
                sparseArray = p3Var.j;
                L8 = org.telegram.messenger.g0.L(16.0f);
                i10 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockHeading3) {
                sparseArray = p3Var.k;
                L8 = org.telegram.messenger.g0.L(15.0f);
                i10 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockHeading4) {
                sparseArray = p3Var.l;
                L8 = org.telegram.messenger.g0.L(14.0f);
                i10 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockHeading5) {
                sparseArray = p3Var.m;
                L8 = org.telegram.messenger.g0.L(13.0f);
                i10 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false);
            } else {
                if (!(pageBlock instanceof TL_iv.pageBlockHeading6)) {
                    if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
                        if (pageblockblockquote.text == richText) {
                            L8 = org.telegram.messenger.g0.L(15.0f);
                            i11 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false);
                        } else if (pageblockblockquote.caption == richText) {
                            L8 = org.telegram.messenger.g0.L(14.0f);
                            i11 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false);
                            sparseArray4 = sparseArray6;
                        } else {
                            sparseArray4 = null;
                            i11 = -65536;
                        }
                        i10 = i11;
                        sparseArray5 = sparseArray4;
                        i3 = 0;
                    } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                        TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
                        if (pageblockpullquote.text == richText) {
                            L8 = org.telegram.messenger.g0.L(15.0f);
                            i11 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false);
                        } else if (pageblockpullquote.caption == richText) {
                            L8 = org.telegram.messenger.g0.L(14.0f);
                            i11 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false);
                            sparseArray4 = sparseArray6;
                        } else {
                            i11 = -65536;
                            sparseArray4 = null;
                        }
                        i10 = i11;
                        sparseArray5 = sparseArray4;
                        i3 = 0;
                    } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
                        if (pageblockpreformatted.codeLength < 0) {
                            pageblockpreformatted.codeLength = org.telegram.ui.Components.k80.p(pageblockpreformatted.text).length();
                        }
                        int i13 = pageblockpreformatted.codeLength;
                        int i14 = i13 > 500 ? 3 : i13 > 220 ? 2 : i13 > 80 ? 1 : 0;
                        SparseArray sparseArray7 = p3Var.s;
                        L8 = org.telegram.messenger.g0.L(14 - i14);
                        B |= 4;
                        i3 = i14 << 16;
                        sparseArray5 = sparseArray7;
                        i10 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false);
                    } else if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                        sparseArray = p3Var.q;
                        L8 = org.telegram.messenger.g0.L(16.0f);
                        i10 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false);
                    } else if (J(pageBlock)) {
                        sparseArray = p3Var.r;
                        L8 = org.telegram.messenger.g0.L(16.0f);
                        i10 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false);
                    } else if (pageBlock instanceof TL_iv.pageBlockEmbed) {
                        TL_iv.RichText richText5 = ((TL_iv.pageBlockEmbed) pageBlock).caption.text;
                        if (richText5 == richText2 || richText5 == richText) {
                            L5 = org.telegram.messenger.g0.L(14.0f);
                            sparseArray5 = sparseArray6;
                        } else {
                            L5 = org.telegram.messenger.g0.L(12.0f);
                        }
                        L8 = L5;
                        x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false);
                    } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                        TL_iv.RichText richText6 = ((TL_iv.pageBlockSlideshow) pageBlock).caption.text;
                        if (richText6 == richText2 || richText6 == richText) {
                            L4 = org.telegram.messenger.g0.L(14.0f);
                            sparseArray5 = sparseArray6;
                        } else {
                            L4 = org.telegram.messenger.g0.L(12.0f);
                        }
                        L8 = L4;
                        x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false);
                    } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
                        TL_iv.RichText richText7 = ((TL_iv.pageBlockCollage) pageBlock).caption.text;
                        if (richText7 == richText2 || richText7 == richText) {
                            L3 = org.telegram.messenger.g0.L(14.0f);
                            sparseArray5 = sparseArray6;
                        } else {
                            L3 = org.telegram.messenger.g0.L(12.0f);
                        }
                        L8 = L3;
                        x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false);
                    } else if (pageBlock instanceof TL_iv.pageBlockEmbedPost) {
                        TL_iv.PageCaption pageCaption = ((TL_iv.pageBlockEmbedPost) pageBlock).caption;
                        if (richText2 == pageCaption.text) {
                            L8 = org.telegram.messenger.g0.L(14.0f);
                            x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false);
                            sparseArray5 = sparseArray6;
                        } else if (richText2 == pageCaption.credit) {
                            L8 = org.telegram.messenger.g0.L(12.0f);
                            x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false);
                        } else if (richText2 != null) {
                            sparseArray5 = p3Var.u;
                            L8 = org.telegram.messenger.g0.L(14.0f);
                            x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false);
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
                            x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false);
                        } else if (pageBlock instanceof TL_iv.pageBlockAudio) {
                            if (richText2 == ((TL_iv.pageBlockAudio) pageBlock).caption.text) {
                                L = org.telegram.messenger.g0.L(14.0f);
                                sparseArray2 = sparseArray3;
                            } else {
                                L = org.telegram.messenger.g0.L(12.0f);
                            }
                            L8 = L;
                            x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false);
                        } else if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                            sparseArray = p3Var.y;
                            L8 = org.telegram.messenger.g0.L(15.0f);
                            i10 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false);
                        } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                            sparseArray = p3Var.z;
                            L8 = org.telegram.messenger.g0.L(15.0f);
                            i10 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false);
                        } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                            sparseArray5 = p3Var.A;
                            L8 = org.telegram.messenger.g0.L(15.0f);
                            x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false);
                        } else {
                            i3 = 0;
                            i10 = -65536;
                            sparseArray5 = null;
                        }
                        i10 = x03;
                        sparseArray5 = sparseArray2;
                        i3 = 0;
                    }
                    i12 = B & 256;
                    if (i12 == 0 || (B & 128) != 0) {
                        L8 -= org.telegram.messenger.g0.L(4.0f);
                    }
                    if (sparseArray5 == null) {
                        if (p3Var.a == null) {
                            TextPaint textPaint = new TextPaint(1);
                            p3Var.a = textPaint;
                            textPaint.setColor(-65536);
                        }
                        p3Var.a.setTextSize(org.telegram.messenger.g0.L(14.0f));
                        return p3Var.a;
                    }
                    int i15 = i3 | B;
                    TextPaint textPaint2 = (TextPaint) sparseArray5.get(i15);
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint(1);
                        if ((B & 4) != 0) {
                            textPaint2.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
                        } else if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                            textPaint2.setTypeface(org.telegram.messenger.g0.o());
                        } else if (i50Var.a != 1 && !(pageBlock instanceof TL_iv.pageBlockTitle) && !(pageBlock instanceof TL_iv.pageBlockKicker) && !(pageBlock instanceof TL_iv.pageBlockHeader) && !(pageBlock instanceof TL_iv.pageBlockSubtitle) && !(pageBlock instanceof TL_iv.pageBlockSubheader) && !I(pageBlock)) {
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
                            i10 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.J6, false);
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
                sparseArray = p3Var.n;
                L8 = org.telegram.messenger.g0.L(12.0f);
                i10 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false);
            }
            sparseArray5 = sparseArray;
            i3 = 0;
            i12 = B & 256;
            if (i12 == 0) {
            }
            L8 -= org.telegram.messenger.g0.L(4.0f);
            if (sparseArray5 == null) {
            }
        }
        i10 = x02;
        i3 = 0;
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

    public static void R(i50 i50Var) {
        if (i50Var.b == null && i50Var.f == null) {
            return;
        }
        View view = i50Var.f;
        i50Var.c.f(true);
        i50Var.b = null;
        i50Var.d = null;
        i50Var.f = null;
        if (view != null) {
            view.invalidate();
        }
    }

    public static /* synthetic */ WindowInsets c(WindowInsets windowInsets) {
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public static void d(String str, int i3, FrameLayout frameLayout, u3 u3Var, org.telegram.ui.ActionBar.e6 e6Var) {
        String u10 = org.telegram.ui.web.w0.u(str);
        long e10 = org.telegram.messenger.h10.i(i3).e();
        org.telegram.messenger.yy.C(i3).r0(org.telegram.messenger.wy.a(e10, u10));
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
        org.telegram.messenger.hs.f(i3).k(org.telegram.messenger.hs.H1, new org.telegram.messenger.zi(i3, tL_message, false, false));
        new org.telegram.ui.Components.fc(frameLayout, e6Var).Q(R.raw.saved_messages, 36, org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131742950, null), new ci.e3(u3Var, e10, 19))).k(true);
    }

    public static void e0(i50 i50Var) {
        TextPaint textPaint = o1;
        if (textPaint != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
        }
        TextPaint textPaint2 = p1;
        if (textPaint2 != null) {
            textPaint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
        }
        TextPaint textPaint3 = i1;
        if (textPaint3 != null) {
            textPaint3.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
        }
        TextPaint textPaint4 = k1;
        if (textPaint4 != null) {
            textPaint4.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
        }
        TextPaint textPaint5 = l1;
        if (textPaint5 != null) {
            textPaint5.setColor(-1);
        }
        TextPaint textPaint6 = m1;
        if (textPaint6 != null) {
            textPaint6.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
        }
        TextPaint textPaint7 = n1;
        if (textPaint7 != null) {
            textPaint7.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false));
        }
        TextPaint textPaint8 = j1;
        if (textPaint8 != null) {
            textPaint8.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false));
        }
        p(i50Var, true);
        p3 p3Var = h1;
        p3.a(i50Var, p3Var.d);
        p3.a(i50Var, p3Var.e);
        p3.a(i50Var, p3Var.g);
        p3.a(i50Var, p3Var.f);
        p3.a(i50Var, p3Var.h);
        p3.a(i50Var, p3Var.i);
        p3.a(i50Var, p3Var.j);
        p3.a(i50Var, p3Var.k);
        p3.a(i50Var, p3Var.l);
        p3.a(i50Var, p3Var.m);
        p3.a(i50Var, p3Var.n);
        p3.a(i50Var, p3Var.t);
        p3.a(i50Var, p3Var.s);
        p3.a(i50Var, p3Var.q);
        p3.a(i50Var, p3Var.r);
        p3.a(i50Var, p3Var.u);
        p3.a(i50Var, p3Var.w);
        p3.a(i50Var, p3Var.x);
        p3.a(i50Var, p3Var.b);
        p3.a(i50Var, p3Var.c);
        p3.a(i50Var, p3Var.o);
        p3.a(i50Var, p3Var.p);
        p3.a(i50Var, p3Var.v);
        p3.a(i50Var, p3Var.y);
        p3.a(i50Var, p3Var.z);
        p3.a(i50Var, p3Var.A);
    }

    public static SpannableStringBuilder g(int i3, CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (charSequence != null) {
            spannableStringBuilder.append(charSequence);
        }
        if (spannableStringBuilder.length() > 0) {
            spannableStringBuilder.append((CharSequence) ", ");
        }
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(i3, null));
        return spannableStringBuilder;
    }

    public static CharSequence h(i50 i50Var, g4 g4Var, a3 a3Var) {
        StaticLayout staticLayout;
        if (a3Var == null || (staticLayout = a3Var.d) == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = a3Var.E;
        if (spannableStringBuilder != null) {
            return spannableStringBuilder;
        }
        CharSequence text = staticLayout.getText();
        if (!(text instanceof Spannable)) {
            return text;
        }
        Spannable spannable = (Spannable) text;
        org.telegram.ui.Components.py0[] py0VarArr = (org.telegram.ui.Components.py0[]) spannable.getSpans(0, spannable.length(), org.telegram.ui.Components.py0.class);
        CharSequence charSequence = text;
        if (py0VarArr != null) {
            charSequence = text;
            if (py0VarArr.length != 0) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannable);
                for (org.telegram.ui.Components.py0 py0Var : py0VarArr) {
                    int spanStart = spannableStringBuilder2.getSpanStart(py0Var);
                    int spanEnd = spannableStringBuilder2.getSpanEnd(py0Var);
                    if (spanStart >= 0 && spanEnd > spanStart) {
                        spannableStringBuilder2.setSpan(new org.telegram.messenger.v(i50Var, g4Var, py0Var, 1), spanStart, spanEnd, 33);
                    }
                }
                a3Var.E = spannableStringBuilder2;
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
        r8 = ((yh.f) r8).getBounds();
        r17.addRect(r8.left, r8.top, r8.right, r8.bottom, android.graphics.Path.Direction.CW);
        r17 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01c5, code lost:
    
        r17.computeBounds(new android.graphics.RectF(), false);
        r0 = (float) java.lang.Math.sqrt((r0.height() * r0.height()) + (r0.width() * r0.width()));
        ((yh.f) r29.J.get(0)).q = new org.telegram.ui.d0(r28, r29);
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
        ((yh.f) r8).j(r6, r4, r0, false);
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
    public static boolean j(i50 i50Var, g4 g4Var, MotionEvent motionEvent, View view, a3 a3Var, int i3, int i10) {
        org.telegram.ui.Cells.h9 h9Var;
        i4 i4Var;
        Object obj;
        i4 i4Var2;
        boolean z10;
        org.telegram.ui.Cells.h9 h9Var2;
        org.telegram.ui.Components.uy0[] uy0VarArr;
        boolean z11 = ((i4) i50Var).w0 == null;
        m2.p0 p0Var = i50Var.c;
        if (!z11 || view == null) {
            return false;
        }
        i4 i4Var3 = (i4) i50Var;
        if (view.getTag() == null || view.getTag() != "bottomSheet" || (h9Var = i4Var3.R0) == null) {
            h9Var = i4Var3.Q0;
        }
        if (h9Var != null && !h9Var.f0(view)) {
            return false;
        }
        i50Var.f = view;
        if (a3Var != null) {
            StaticLayout staticLayout = a3Var.d;
            int x10 = (int) motionEvent.getX();
            int y9 = (int) motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                int lineCount = staticLayout.getLineCount();
                float f10 = 2.14748365E9f;
                float f11 = 0.0f;
                for (int i11 = 0; i11 < lineCount; i11++) {
                    f11 = Math.max(staticLayout.getLineWidth(i11), f11);
                    f10 = Math.min(staticLayout.getLineLeft(i11), f10);
                }
                float f12 = x10;
                float f13 = i3 + f10;
                if (f12 >= f13 && f12 <= f13 + f11 && y9 >= i10 && y9 <= staticLayout.getHeight() + i10) {
                    i50Var.d = a3Var;
                    i50Var.e = i10;
                    if (staticLayout.getText() instanceof Spannable) {
                        int i12 = x10 - i3;
                        int i13 = y9 - i10;
                        try {
                            int lineForVertical = staticLayout.getLineForVertical(i13);
                            float f14 = i12;
                            int offsetForHorizontal = staticLayout.getOffsetForHorizontal(lineForVertical, f14);
                            float lineLeft = staticLayout.getLineLeft(lineForVertical);
                            if (lineLeft <= f14 && lineLeft + staticLayout.getLineWidth(lineForVertical) >= f14) {
                                Spannable spannable = (Spannable) staticLayout.getText();
                                org.telegram.ui.Components.py0[] py0VarArr = (org.telegram.ui.Components.py0[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, org.telegram.ui.Components.py0.class);
                                if (py0VarArr == null || py0VarArr.length <= 0) {
                                    i4Var = i4Var3;
                                    obj = "bottomSheet";
                                } else {
                                    org.telegram.ui.Components.py0 py0Var = py0VarArr[0];
                                    int spanStart = spannable.getSpanStart(py0Var);
                                    i4Var = i4Var3;
                                    obj = "bottomSheet";
                                    int spanEnd = spannable.getSpanEnd(py0Var);
                                    int i14 = 1;
                                    while (i14 < py0VarArr.length) {
                                        try {
                                            org.telegram.ui.Components.py0 py0Var2 = py0VarArr[i14];
                                            org.telegram.ui.Components.py0[] py0VarArr2 = py0VarArr;
                                            int spanStart2 = spannable.getSpanStart(py0Var2);
                                            int i15 = i14;
                                            int spanEnd2 = spannable.getSpanEnd(py0Var2);
                                            if (spanStart > spanStart2 || spanEnd2 > spanEnd) {
                                                spanStart = spanStart2;
                                                py0Var = py0Var2;
                                                spanEnd = spanEnd2;
                                            }
                                            i14 = i15 + 1;
                                            py0VarArr = py0VarArr2;
                                        } catch (Exception e10) {
                                            e = e10;
                                            org.telegram.messenger.a8.g(e, true);
                                            if (motionEvent.getAction() != 0) {
                                            }
                                            z10 = true;
                                            if (motionEvent.getAction() != 0) {
                                            }
                                            if (view instanceof k1) {
                                            }
                                        }
                                    }
                                    org.telegram.ui.Components.t70 t70Var = i50Var.b;
                                    if (t70Var == null || t70Var.i != py0Var) {
                                        if (t70Var != null) {
                                            p0Var.m(t70Var, true);
                                        }
                                        org.telegram.ui.Components.t70 t70Var2 = new org.telegram.ui.Components.t70(py0Var, null, f12, y9, 0);
                                        i50Var.b = t70Var2;
                                        t70Var2.d(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.K6, false) & 872415231);
                                        p0Var.b(i50Var.b, i50Var.d);
                                        try {
                                            org.telegram.ui.Components.n70 b10 = i50Var.b.b();
                                            b10.d(staticLayout, spanStart, 0.0f);
                                            TextPaint textPaint = py0Var.a;
                                            int i16 = textPaint != null ? textPaint.baselineShift : 0;
                                            b10.o = i16 != 0 ? i16 + org.telegram.messenger.g0.L(i16 > 0 ? 5.0f : -2.0f) : 0;
                                            staticLayout.getSelectionPath(spanStart, spanEnd, b10);
                                            view.invalidate();
                                        } catch (Exception e11) {
                                            org.telegram.messenger.a8.g(e11, true);
                                        }
                                    }
                                }
                                ArrayList arrayList = a3Var.J;
                                if (arrayList != null && !arrayList.isEmpty() && (uy0VarArr = (org.telegram.ui.Components.uy0[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, org.telegram.ui.Components.uy0.class)) != null) {
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 >= uy0VarArr.length) {
                                            break;
                                        }
                                        if (uy0VarArr[i17].c()) {
                                            break;
                                        }
                                        i17++;
                                    }
                                }
                            }
                        } catch (Exception e12) {
                            e = e12;
                            i4Var = i4Var3;
                            obj = "bottomSheet";
                        }
                    }
                }
                i4Var = i4Var3;
                obj = "bottomSheet";
            } else {
                i4Var = i4Var3;
                obj = "bottomSheet";
                if (motionEvent.getAction() == 1) {
                    org.telegram.ui.Components.t70 t70Var3 = i50Var.b;
                    if (t70Var3 != null) {
                        i50Var.a(g4Var, (org.telegram.ui.Components.py0) t70Var3.i);
                        R(i50Var);
                    }
                } else if (motionEvent.getAction() == 3) {
                    org.telegram.ui.ActionBar.f1 f1Var = i50Var.I;
                    if (f1Var != null) {
                    }
                    R(i50Var);
                }
            }
        } else {
            i4Var = i4Var3;
            obj = "bottomSheet";
        }
        if (motionEvent.getAction() != 0) {
            float x11 = motionEvent.getX();
            float y10 = motionEvent.getY();
            i4Var2 = i4Var;
            if (!i4Var2.L0) {
                z10 = true;
                i4Var2.L0 = true;
                if (i4Var2.N0 == null) {
                    i4Var2.N0 = new z2(i4Var2, 1);
                }
                if (view.getTag() == null || view.getTag() != obj || (h9Var2 = i4Var2.R0) == null) {
                    i4Var2.Q0.k0(view, (int) x11, (int) y10);
                } else {
                    h9Var2.k0(view, (int) x11, (int) y10);
                }
                i4Var2.g0.postDelayed(i4Var2.N0, ViewConfiguration.getTapTimeout());
                if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                    i4Var2.i();
                }
                if (view instanceof k1) {
                    if (i50Var.b != null) {
                        return z10;
                    }
                    return false;
                }
                if (i50Var.d != null) {
                    return z10;
                }
                return false;
            }
        } else {
            i4Var2 = i4Var;
        }
        z10 = true;
        if (motionEvent.getAction() != 0) {
            i4Var2.i();
        }
        if (view instanceof k1) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:52|(3:53|54|(3:58|(3:(2:62|63)(2:65|66)|64|59)|67))|69|(2:70|71)|(11:75|76|77|(5:80|(1:82)(1:92)|(3:(1:85)(1:89)|86|87)(2:90|91)|88|78)|93|94|95|96|(7:100|101|102|(5:105|(1:107)(1:117)|(3:(1:110)(1:114)|111|112)(2:115|116)|113|103)|118|119|120)|153|120)|158|95|96|(8:98|100|101|102|(1:103)|118|119|120)|153|120) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03a0 A[Catch: Exception -> 0x03d7, TryCatch #0 {Exception -> 0x03d7, blocks: (B:102:0x039a, B:103:0x039d, B:105:0x03a0, B:107:0x03b5, B:111:0x03c2, B:113:0x03ca, B:119:0x03d3), top: B:101:0x039a }] */
    /* JADX WARN: Type inference failed for: r10v13, types: [android.text.Spanned, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v7, types: [android.graphics.Path, org.telegram.ui.Components.n70] */
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
    /* JADX WARN: Type inference failed for: r9v11, types: [android.graphics.Path, org.telegram.ui.Components.n70] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a3 n(i50 i50Var, View view, CharSequence charSequence, TL_iv.RichText richText, int i3, int i10, TL_iv.PageBlock pageBlock, Layout.Alignment alignment, int i11, g4 g4Var) {
        i50 i50Var2;
        CharSequence A;
        TL_iv.RichText richText2;
        TL_iv.PageBlock pageBlock2;
        TextPaint C;
        ?? r42;
        int i12;
        CharSequence charSequence2;
        StaticLayout staticLayout;
        ?? r12;
        org.telegram.ui.Components.n70 n70Var;
        org.telegram.ui.Components.n70 n70Var2;
        View view2;
        TL_iv.RichText richText3;
        TL_iv.PageBlock pageBlock3;
        int i13;
        int i14;
        ?? r13;
        ?? r9;
        org.telegram.ui.Components.ny0[] ny0VarArr;
        int i15;
        org.telegram.ui.Components.qy0[] qy0VarArr;
        g4 g4Var2;
        if (charSequence == null && (richText == null || (richText instanceof TL_iv.textEmpty))) {
            return null;
        }
        int L = i3 < 0 ? org.telegram.messenger.g0.L(10.0f) : i3;
        if (charSequence != null) {
            i50Var2 = i50Var;
            richText2 = richText;
            A = charSequence;
            pageBlock2 = pageBlock;
        } else {
            i50Var2 = i50Var;
            A = A(i50Var2, g4Var != null ? g4Var.F : null, view, richText, richText, pageBlock, L);
            richText2 = richText;
            pageBlock2 = pageBlock;
        }
        if (!TextUtils.isEmpty(A)) {
            int L2 = org.telegram.messenger.g0.L(org.telegram.messenger.az.Z0 - 16);
            if ((pageBlock2 instanceof TL_iv.pageBlockEmbedPost) && richText2 == null) {
                if (((TL_iv.pageBlockEmbedPost) pageBlock2).author == charSequence) {
                    if (i1 == null) {
                        TextPaint textPaint = new TextPaint(1);
                        i1 = textPaint;
                        ((i4) i50Var2).getClass();
                        textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
                    }
                    i1.setTextSize(org.telegram.messenger.g0.L(15.0f) + L2);
                    C = i1;
                } else {
                    if (j1 == null) {
                        TextPaint textPaint2 = new TextPaint(1);
                        j1 = textPaint2;
                        ((i4) i50Var2).getClass();
                        textPaint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false));
                    }
                    j1.setTextSize(org.telegram.messenger.g0.L(14.0f) + L2);
                    C = j1;
                }
            } else if (pageBlock2 instanceof TL_iv.pageBlockChannel) {
                if (k1 == null) {
                    TextPaint textPaint3 = new TextPaint(1);
                    k1 = textPaint3;
                    TextPaint d = org.telegram.messenger.camera.q.d(textPaint3, 1);
                    l1 = d;
                    d.setTypeface(org.telegram.messenger.g0.o());
                }
                TextPaint textPaint4 = k1;
                ((i4) i50Var2).getClass();
                textPaint4.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
                k1.setTextSize(org.telegram.messenger.g0.L(15.0f));
                l1.setColor(-1);
                l1.setTextSize(org.telegram.messenger.g0.L(15.0f));
                C = (g4Var == null || g4Var.G == null) ? k1 : l1;
            } else if (pageBlock2 instanceof b4) {
                b4 b4Var = (b4) pageBlock2;
                if (charSequence == b4Var.a.articles.get(b4Var.b).title) {
                    if (m1 == null) {
                        TextPaint textPaint5 = new TextPaint(1);
                        m1 = textPaint5;
                        textPaint5.setTypeface(org.telegram.messenger.g0.o());
                    }
                    TextPaint textPaint6 = m1;
                    ((i4) i50Var2).getClass();
                    textPaint6.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
                    m1.setTextSize(org.telegram.messenger.g0.L(15.0f) + L2);
                    C = m1;
                } else {
                    if (n1 == null) {
                        n1 = new TextPaint(1);
                    }
                    TextPaint textPaint7 = n1;
                    ((i4) i50Var2).getClass();
                    textPaint7.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false));
                    n1.setTextSize(org.telegram.messenger.g0.L(14.0f) + L2);
                    C = n1;
                }
            } else if (!J(pageBlock2) || charSequence == null) {
                C = C(i50Var2, richText2, richText2, pageBlock2);
            } else {
                if (o1 == null) {
                    TextPaint textPaint8 = new TextPaint(1);
                    o1 = textPaint8;
                    ((i4) i50Var2).getClass();
                    textPaint8.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
                }
                if (p1 == null) {
                    TextPaint textPaint9 = new TextPaint(1);
                    p1 = textPaint9;
                    ((i4) i50Var2).getClass();
                    textPaint9.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
                }
                o1.setTextSize(org.telegram.messenger.g0.L(19.0f) + L2);
                p1.setTextSize(org.telegram.messenger.g0.L(16.0f) + L2);
                C = (!(pageBlock2 instanceof x3) || ((x3) pageBlock2).c.a.ordered) ? p1 : o1;
            }
            CharSequence m10 = org.telegram.messenger.i6.m(A, C.getFontMetricsInt(), false, null, 2);
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
                r12 = org.telegram.ui.Components.lu0.c(m10, textPaint11, L, Layout.Alignment.ALIGN_CENTER, 0.0f, TextUtils.TruncateAt.END, L, i11, true);
            } else {
                TextPaint textPaint12 = C;
                r42 = 0;
                i12 = 1;
                r12 = org.telegram.ui.Components.lu0.c(m10, textPaint12, L, alignment, org.telegram.messenger.g0.L(4.0f), TextUtils.TruncateAt.END, L, i11, true);
            }
            if (r12 != 0) {
                CharSequence text = r12.getText();
                if (i10 >= 0 && !i50Var2.F.isEmpty() && i50Var2.G != null && (g4Var2 = ((i4) i50Var2).v0[r42].c) != null) {
                    String lowerCase = m10.toString().toLowerCase();
                    int i16 = r42;
                    while (true) {
                        int indexOf = lowerCase.indexOf(i50Var2.G, i16);
                        if (indexOf < 0) {
                            break;
                        }
                        int length = i50Var2.G.length() + indexOf;
                        if (indexOf == 0 || org.telegram.messenger.g0.K1(lowerCase.charAt(indexOf - 1))) {
                            g4Var2.E.put(i50Var2.G + pageBlock2 + richText2 + indexOf, Integer.valueOf(r12.getLineTop(r12.getLineForOffset(indexOf)) + i10));
                        }
                        i16 = length;
                    }
                }
                boolean z10 = text instanceof Spanned;
                if (z10) {
                    ?? r10 = (Spanned) text;
                    try {
                        org.telegram.ui.Components.u4[] u4VarArr = (org.telegram.ui.Components.u4[]) r10.getSpans(r42, r10.length(), org.telegram.ui.Components.u4.class);
                        int lineCount = r12.getLineCount();
                        if (u4VarArr != null && u4VarArr.length > 0) {
                            for (int i17 = r42; i17 < u4VarArr.length; i17++) {
                                if (lineCount <= i12) {
                                    g4Var.n.put(u4VarArr[i17].a, Integer.valueOf(i10));
                                } else {
                                    HashMap hashMap = g4Var.n;
                                    org.telegram.ui.Components.u4 u4Var = u4VarArr[i17];
                                    hashMap.put(u4Var.a, Integer.valueOf(i10 + r12.getLineTop(r12.getLineForOffset(r10.getSpanStart(u4Var)))));
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                    try {
                        qy0VarArr = (org.telegram.ui.Components.qy0[]) r10.getSpans(r42, r10.length(), org.telegram.ui.Components.qy0.class);
                    } catch (Exception unused2) {
                    }
                    if (qy0VarArr != null && qy0VarArr.length > 0) {
                        r13 = new org.telegram.ui.Components.n70(r42);
                        try {
                            r13.n = r42;
                            for (int i18 = r42; i18 < qy0VarArr.length; i18++) {
                                int spanStart = r10.getSpanStart(qy0VarArr[i18]);
                                int spanEnd = r10.getSpanEnd(qy0VarArr[i18]);
                                r13.d(r12, spanStart, 0.0f);
                                TextPaint textPaint13 = qy0VarArr[i18].a;
                                int i19 = textPaint13 != null ? textPaint13.baselineShift : r42;
                                r13.o = i19 != 0 ? i19 + org.telegram.messenger.g0.L(i19 > 0 ? 5.0f : -2.0f) : r42;
                                r12.getSelectionPath(spanStart, spanEnd, r13);
                            }
                            r13.n = i12;
                        } catch (Exception unused3) {
                        }
                        ny0VarArr = (org.telegram.ui.Components.ny0[]) r10.getSpans(r42, r10.length(), org.telegram.ui.Components.ny0.class);
                        if (ny0VarArr != null && ny0VarArr.length > 0) {
                            r9 = new org.telegram.ui.Components.n70(r42);
                            try {
                                r9.n = r42;
                                for (i15 = r42; i15 < ny0VarArr.length; i15++) {
                                    int spanStart2 = r10.getSpanStart(ny0VarArr[i15]);
                                    int spanEnd2 = r10.getSpanEnd(ny0VarArr[i15]);
                                    r9.d(r12, spanStart2, 0.0f);
                                    TextPaint textPaint14 = ny0VarArr[i15].a;
                                    int i20 = textPaint14 != null ? textPaint14.baselineShift : 0;
                                    r9.o = i20 != 0 ? i20 + org.telegram.messenger.g0.L(i20 > 0 ? 5.0f : -2.0f) : 0;
                                    r12.getSelectionPath(spanStart2, spanEnd2, r9);
                                }
                                r9.n = i12;
                            } catch (Exception unused4) {
                            }
                            n70Var = r9;
                            n70Var2 = r13;
                        }
                        r9 = 0;
                        n70Var = r9;
                        n70Var2 = r13;
                    }
                    r13 = 0;
                    ny0VarArr = (org.telegram.ui.Components.ny0[]) r10.getSpans(r42, r10.length(), org.telegram.ui.Components.ny0.class);
                    if (ny0VarArr != null) {
                        r9 = new org.telegram.ui.Components.n70(r42);
                        r9.n = r42;
                        while (i15 < ny0VarArr.length) {
                        }
                        r9.n = i12;
                        n70Var = r9;
                        n70Var2 = r13;
                    }
                    r9 = 0;
                    n70Var = r9;
                    n70Var2 = r13;
                } else {
                    n70Var = null;
                    n70Var2 = null;
                }
                a3 a3Var = new a3(i50Var2);
                a3Var.d = r12;
                a3Var.e = n70Var2;
                a3Var.f = n70Var;
                a3Var.n = pageBlock2;
                a3Var.r = richText2;
                a3Var.K = new Stack();
                a3Var.J = new ArrayList();
                a3Var.L = new AtomicReference();
                if (z10) {
                    richText3 = richText;
                    pageBlock3 = pageBlock;
                    i13 = i12;
                    i14 = 0;
                    view2 = view;
                    yh.f.a(view2, r12, -1, -1, (Spanned) text, a3Var.K, a3Var.J, null);
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
                            a3 a3Var2 = (a3) arrayList.get(i21);
                            if (a3Var2.n != pageBlock3 || (richText3 != null && a3Var2.r == richText3)) {
                                a3Var2.f(view2);
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
                        arrayList.add(a3Var);
                    }
                    if (view2.isAttachedToWindow()) {
                        a3Var.i(view2);
                    }
                }
                return a3Var;
            }
        }
        return null;
    }

    public static a3 o(i50 i50Var, View view, CharSequence charSequence, TL_iv.RichText richText, int i3, int i10, TL_iv.PageBlock pageBlock, g4 g4Var) {
        return n(i50Var, view, charSequence, richText, i3, i10, pageBlock, Layout.Alignment.ALIGN_NORMAL, 0, g4Var);
    }

    public static void p(i50 i50Var, boolean z10) {
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
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false);
        A1.setColor(com.google.android.recaptcha.internal.a.x((float) Color.blue(x02), 0.0722f, (((float) Color.green(x02)) * 0.7152f) + (((float) Color.red(x02)) * 0.2126f), 255.0f) <= 0.705f ? -3041234 : -6551);
        Paint paint3 = z1;
        int i3 = org.telegram.ui.ActionBar.k6.K6;
        paint3.setColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false) & 872415231);
        z1.setPathEffect(org.telegram.ui.Components.n70.c());
        y1.setColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false) & 872415231);
        y1.setPathEffect(org.telegram.ui.Components.n70.c());
        Paint paint4 = v1;
        int i10 = org.telegram.ui.ActionBar.k6.k6;
        paint4.setColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        u1.setColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        q1.setColor(251658240);
        t1.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d7, false));
        B1.setColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false) & 872415231);
        B1.setPathEffect(org.telegram.ui.Components.n70.c());
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.M6, false);
        int red = Color.red(x03);
        int green = Color.green(x03);
        int blue = Color.blue(x03);
        x1.setColor(Color.argb(20, red, green, blue));
        w1.setColor(Color.argb(34, red, green, blue));
        int x04 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
        r1.setColor(Color.argb(20, Color.red(x04), Color.green(x04), Color.blue(x04)));
        s1.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Id, false));
    }

    public static void s(Canvas canvas, i50 i50Var, TL_iv.PageBlock pageBlock, int i3) {
        if (pageBlock == null || i50Var == null || s1 == null) {
            return;
        }
        int i10 = 0;
        int L = i3 - (pageBlock.bottom ? org.telegram.messenger.g0.L(6.0f) : 0);
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
    public static void t(i50 i50Var, Canvas canvas, org.telegram.ui.Cells.g9 g9Var, int i3) {
        org.telegram.ui.Cells.h9 h9Var;
        View view = (View) g9Var;
        i4 i4Var = (i4) i50Var;
        if (view != null) {
            i4Var.getClass();
            if (view.getTag() != null) {
                if (view.getTag() == "bottomSheet") {
                    h9Var = i4Var.R0;
                }
            }
        }
        h9Var = i4Var.Q0;
        if (h9Var != null) {
            h9Var.Z(canvas, g9Var, i3);
        }
    }

    public static TL_iv.RichText u(int i3, TL_iv.PageBlock pageBlock) {
        if (i3 == 2) {
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
            if (i3 == 0) {
                return pageblockembedpost.caption.text;
            }
            if (i3 == 1) {
                return pageblockembedpost.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
            if (i3 == 0) {
                return pageblockslideshow.caption.text;
            }
            if (i3 == 1) {
                return pageblockslideshow.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
            if (i3 == 0) {
                return pageblockphoto.caption.text;
            }
            if (i3 == 1) {
                return pageblockphoto.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
            TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
            if (i3 == 0) {
                return pageblockcollage.caption.text;
            }
            if (i3 == 1) {
                return pageblockcollage.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockEmbed) {
            TL_iv.pageBlockEmbed pageblockembed = (TL_iv.pageBlockEmbed) pageBlock;
            if (i3 == 0) {
                return pageblockembed.caption.text;
            }
            if (i3 == 1) {
                return pageblockembed.caption.credit;
            }
        } else {
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                return ((TL_iv.pageBlockBlockquote) pageBlock).caption;
            }
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
                if (i3 == 0) {
                    return pageblockvideo.caption.text;
                }
                if (i3 == 1) {
                    return pageblockvideo.caption.credit;
                }
            } else {
                if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                    return ((TL_iv.pageBlockPullquote) pageBlock).caption;
                }
                if (pageBlock instanceof TL_iv.pageBlockAudio) {
                    TL_iv.pageBlockAudio pageblockaudio = (TL_iv.pageBlockAudio) pageBlock;
                    if (i3 == 0) {
                        return pageblockaudio.caption.text;
                    }
                    if (i3 == 1) {
                        return pageblockaudio.caption.credit;
                    }
                } else {
                    if (pageBlock instanceof TL_iv.pageBlockCover) {
                        return u(i3, ((TL_iv.pageBlockCover) pageBlock).cover);
                    }
                    if (pageBlock instanceof TL_iv.pageBlockMap) {
                        TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
                        if (i3 == 0) {
                            return pageblockmap.caption.text;
                        }
                        if (i3 == 1) {
                            return pageblockmap.caption.credit;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static i4 v() {
        i4 i4Var;
        i4 i4Var2 = e1;
        if (i4Var2 != null) {
            return i4Var2;
        }
        synchronized (i4.class) {
            try {
                i4Var = e1;
                if (i4Var == null) {
                    i4Var = new i4();
                    e1 = i4Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i4Var;
    }

    public static View w(View view) {
        org.telegram.ui.Components.bj0 bj0Var;
        if (!(view instanceof w1)) {
            return (!(view instanceof z1) || (bj0Var = ((z1) view).d) == null) ? view : w(bj0Var.a);
        }
        org.telegram.ui.Components.bj0 bj0Var2 = ((w1) view).d;
        return bj0Var2 != null ? w(bj0Var2.a) : view;
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
        for (int i3 = 0; i3 < size; i3++) {
            sb2.append(z(richText.texts.get(i3)));
        }
        return sb2;
    }

    public final void E() {
        ArrayList arrayList = this.e0;
        int size = arrayList.size();
        u3 u3Var = this.L;
        boolean z10 = false;
        if (size <= 1) {
            ArticleViewer$WindowView articleViewer$WindowView = this.g0;
            articleViewer$WindowView.e = false;
            articleViewer$WindowView.d = false;
            float width = u3Var != null ? u3Var.J * u3Var.c.getWidth() : this.h0.getX();
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = r0.getMeasuredWidth() - width;
            if (u3Var != null) {
                animatorSet.playTogether(u3Var.l(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.h0, (Property<l0, Float>) View.TRANSLATION_X, r0.getMeasuredWidth()), ObjectAnimator.ofFloat(this.g0, f1, r0.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / r0.getMeasuredWidth()) * measuredWidth), org.telegram.messenger.hs.Z3));
            animatorSet.setInterpolator(org.telegram.ui.Components.xq.h);
            animatorSet.addListener(new t0(this));
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
        this.v0[0].setBackgroundColor(u3Var == null ? 0 : this.m0.getColor());
        c0(-1, arrayList.get(arrayList.size() - 2), true);
        l3 l3Var = this.v0[0];
        l3Var.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        l3Var.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.v0[0], (Property<l3, Float>) View.TRANSLATION_X, l3Var.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(org.telegram.ui.Components.xq.h);
        animatorSet2.addListener(new u0(this));
        animatorSet2.start();
        m0 m0Var = this.i0;
        l3 l3Var2 = this.v0[0];
        m0Var.setMenuColors((l3Var2 == null || !org.telegram.messenger.az.v0) ? org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false) : l3Var2.getBackgroundColor());
        m0 m0Var2 = this.i0;
        l3 l3Var3 = this.v0[0];
        m0Var2.d((l3Var3 == null || !org.telegram.messenger.az.v0) ? org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false) : l3Var3.getActionBarColor(), true);
        m0 m0Var3 = this.i0;
        l3 l3Var4 = this.v0[0];
        m0Var3.setIsTonsite(l3Var4 != null && l3Var4.e());
        m0 m0Var4 = this.i0;
        l3 l3Var5 = this.v0[0];
        if (l3Var5 != null && l3Var5.d()) {
            z10 = true;
        }
        m0Var4.setIsLocal(z10);
        this.V0 = true;
    }

    public final void F(int i3) {
        ArrayList arrayList = this.e0;
        int size = arrayList.size();
        u3 u3Var = this.L;
        boolean z10 = false;
        if (size <= 1) {
            ArticleViewer$WindowView articleViewer$WindowView = this.g0;
            articleViewer$WindowView.e = false;
            articleViewer$WindowView.d = false;
            float width = u3Var != null ? u3Var.J * u3Var.c.getWidth() : this.h0.getX();
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = r9.getMeasuredWidth() - width;
            if (u3Var != null) {
                animatorSet.playTogether(u3Var.l(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.h0, (Property<l0, Float>) View.TRANSLATION_X, r9.getMeasuredWidth()), ObjectAnimator.ofFloat(this.g0, f1, r9.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / r9.getMeasuredWidth()) * measuredWidth), org.telegram.messenger.hs.Z3));
            animatorSet.setInterpolator(org.telegram.ui.Components.xq.h);
            animatorSet.addListener(new v0(this));
            animatorSet.start();
            this.V0 = true;
            return;
        }
        this.g0.f = true;
        this.v0[1].setVisibility(0);
        this.v0[1].setAlpha(1.0f);
        this.v0[1].setTranslationX(0.0f);
        this.v0[0].setBackgroundColor(u3Var == null ? 0 : this.m0.getColor());
        c0(-1, arrayList.get(i3), true);
        l3 l3Var = this.v0[0];
        l3Var.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        l3Var.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.v0[0], (Property<l3, Float>) View.TRANSLATION_X, l3Var.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(org.telegram.ui.Components.xq.h);
        animatorSet2.addListener(new w0(this, i3));
        animatorSet2.start();
        m0 m0Var = this.i0;
        l3 l3Var2 = this.v0[0];
        m0Var.setMenuColors((l3Var2 == null || !org.telegram.messenger.az.v0) ? org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false) : l3Var2.getBackgroundColor());
        m0 m0Var2 = this.i0;
        l3 l3Var3 = this.v0[0];
        m0Var2.d((l3Var3 == null || !org.telegram.messenger.az.v0) ? org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false) : l3Var3.getActionBarColor(), true);
        m0 m0Var3 = this.i0;
        l3 l3Var4 = this.v0[0];
        m0Var3.setIsTonsite(l3Var4 != null && l3Var4.e());
        m0 m0Var4 = this.i0;
        l3 l3Var5 = this.v0[0];
        if (l3Var5 != null && l3Var5.d()) {
            z10 = true;
        }
        m0Var4.setIsLocal(z10);
        this.V0 = true;
    }

    public final boolean H() {
        ArrayList arrayList = this.e0;
        return arrayList.size() > 0 && (arrayList.get(0) instanceof TLRPC.WebPage);
    }

    public final void K() {
        this.W = false;
        int i3 = 0;
        while (true) {
            l3[] l3VarArr = this.v0;
            if (i3 < l3VarArr.length) {
                l3VarArr[i3].b();
                i3++;
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
                this.h0.post(new b0(this, 0));
                org.telegram.messenger.hs.f(this.Y).k(org.telegram.messenger.hs.d1, new Object[0]);
                return;
            } else {
                ((r1) arrayList.get(i10)).a(false);
                i10++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean, int] */
    public final boolean L(org.telegram.messenger.zi ziVar, TLRPC.WebPage webPage, String str, String str2) {
        TLRPC.WebPage webPage2;
        boolean z10;
        int lastIndexOf;
        String substring;
        boolean z11;
        ?? r5;
        TL_iv.Page page;
        if (this.M == null) {
            return false;
        }
        u3 u3Var = this.L;
        if (u3Var == null && this.W) {
            return false;
        }
        org.telegram.ui.ActionBar.d2 d2Var = this.N;
        if (d2Var != null && (d2Var.getParentLayout() instanceof ActionBarLayout)) {
            org.telegram.messenger.g0.v1((ActionBarLayout) this.N.getParentLayout());
        }
        int i3 = 1;
        if (ziVar != null) {
            webPage2 = webPage == null ? ziVar.k.media.webpage : webPage;
            z10 = (webPage2 == null || (page = webPage2.cached_page) == null || page.local == null) ? false : true;
            for (int i10 = 0; i10 < ziVar.k.entities.size(); i10++) {
                TLRPC.MessageEntity messageEntity = ziVar.k.entities.get(i10);
                if (messageEntity instanceof TLRPC.TL_messageEntityUrl) {
                    try {
                        String str3 = ziVar.k.message;
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
        if (u3Var == null || arrayList.isEmpty()) {
            z11 = z10;
            r5 = 0;
        } else {
            z11 = z10;
            r5 = 1;
        }
        if (r5 == 0) {
            arrayList.clear();
            this.h0.setTranslationX(0.0f);
            if (u3Var != null) {
                u3Var.J = 0.0f;
                u3Var.c.invalidate();
                u3Var.u();
                u3Var.r();
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
        if (u3Var != null && org.telegram.ui.web.w0.R0) {
            u3Var.a.d();
        }
        if (webPage2 != null) {
            boolean f10 = f(webPage2, substring, r5);
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
                int i12 = ziVar != null ? ziVar.I1 : org.telegram.messenger.h10.t0;
                ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getWebPage, new h0(this, i12, webPage2, ziVar, (boolean) r5, str4));
            }
        } else {
            e(r5, str2);
        }
        m0 m0Var = this.i0;
        if (m0Var != null && r5 == 0) {
            m0Var.setIsLocal(this.v0[0].d());
        }
        this.U = null;
        if (u3Var != null) {
            if (r5 == 0) {
                org.telegram.messenger.g0.E2(this.g0);
                u3Var.d = this.g0;
                u3Var.A();
                u3Var.c.addView(this.g0, b8.mf.c(-1.0f, -1));
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
        if (r5 == 0) {
            if (u3Var == null) {
                this.g0.setAlpha(0.0f);
                this.h0.setAlpha(0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                ArticleViewer$WindowView articleViewer$WindowView = this.g0;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, (Property<ArticleViewer$WindowView, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.h0, (Property<l0, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.g0, (Property<ArticleViewer$WindowView, Float>) View.TRANSLATION_X, org.telegram.messenger.g0.L(56.0f), 0.0f));
                this.b0 = new b0(this, i3);
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(this.d0);
                animatorSet.addListener(new q0(this));
                this.c0 = System.currentTimeMillis();
                org.telegram.messenger.g0.h3(new org.telegram.messenger.voip.l0(12, this, animatorSet));
            } else if (r5 != 0) {
                u3Var.a.e();
            } else if (!u3Var.h) {
                u3Var.q(u3Var.b);
                u3Var.o();
            }
        }
        this.h0.setLayerType(2, null);
        return true;
    }

    public final void N(long j10, TLRPC.User user) {
        if (user == null || !(this.M instanceof LaunchActivity)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        bundle.putString("botUser", "webpage" + j10);
        ((LaunchActivity) this.M).u0(new wm(bundle), false, true);
        m(false, true);
    }

    public final void O(String str, String str2, k0 k0Var) {
        Activity activity = this.M;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        l3 l3Var = this.v0[0];
        if (l3Var == null || !l3Var.d()) {
            P(str, str2, k0Var);
            return;
        }
        String M0 = org.telegram.messenger.bd.M0(2131747790, null);
        int indexOf = M0.indexOf("%");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.format(M0, str));
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new URLSpan(str), indexOf, str.length() + indexOf, 33);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.M, null);
        String M02 = org.telegram.messenger.bd.M0(2131747787, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M02;
        s1Var.U = spannableStringBuilder;
        s1Var.i0 = false;
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747825, null), new a1.d(this, str, str2, k0Var, 5));
        alertDialog$Builder.p();
    }

    public final void P(String str, String str2, sf.b bVar) {
        u3 u3Var;
        sf.b bVar2 = this.O0;
        if (bVar2 != null) {
            bVar2.a(false);
        }
        this.O0 = bVar;
        if (this.H0 != 0) {
            ConnectionsManager.getInstance(this.Y).cancelRequest(this.H0, false);
            this.H0 = 0;
        }
        boolean[] zArr = new boolean[1];
        if (sf.c.m(this.M, str, false)) {
            if (!this.e0.isEmpty() || (u3Var = this.L) == null) {
                return;
            }
            u3Var.a(false);
            return;
        }
        g0 g0Var = new g0(this, str, zArr, bVar);
        int i3 = this.J0 + 1;
        this.J0 = i3;
        Z(true);
        TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
        tL_messages_getWebPage.url = str;
        tL_messages_getWebPage.hash = 0;
        this.H0 = ConnectionsManager.getInstance(this.Y).sendRequest(tL_messages_getWebPage, new org.telegram.messenger.gx(this, i3, bVar, str2, g0Var, tL_messages_getWebPage));
        if (bVar != null) {
            bVar.b = new ai.e3(this, i3, bVar, 28);
            bVar.d();
        }
    }

    public final void Q() {
        TextView textView = this.D0;
        if (textView != null) {
            int i3 = org.telegram.ui.ActionBar.k6.i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i3, false), 2, -1);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
            textView.setBackground(h02);
            org.telegram.ui.ActionBar.r6.k(textView, h02, null, N, null);
            org.telegram.ui.ActionBar.r6.V(this.D0, org.telegram.ui.ActionBar.k6.E8, null);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.C0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, null);
        }
        ImageView imageView = this.s0;
        if (imageView != null) {
            org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.G6, null, PorterDuff.Mode.MULTIPLY);
            ImageView imageView2 = this.s0;
            int i10 = org.telegram.ui.ActionBar.k6.z8;
            org.telegram.ui.ActionBar.r6.R(imageView2, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i10, false), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i10), null);
        }
        ImageView imageView3 = this.t0;
        if (imageView3 != null) {
            org.telegram.ui.ActionBar.r6.t(imageView3, org.telegram.ui.ActionBar.k6.G6, null, PorterDuff.Mode.MULTIPLY);
            ImageView imageView4 = this.t0;
            int i11 = org.telegram.ui.ActionBar.k6.z8;
            org.telegram.ui.ActionBar.r6.R(imageView4, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i11, false), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i11), null);
        }
        org.telegram.ui.Components.h6 h6Var = this.u0;
        if (h6Var != null) {
            org.telegram.ui.ActionBar.r6.Z(h6Var, org.telegram.ui.ActionBar.k6.G6, null);
        }
        m0 m0Var = this.i0;
        if (m0Var != null) {
            l3 l3Var = this.v0[0];
            m0Var.setMenuColors((l3Var == null || !org.telegram.messenger.az.v0) ? org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false) : l3Var.getBackgroundColor());
            m0 m0Var2 = this.i0;
            l3 l3Var2 = this.v0[0];
            m0Var2.d((l3Var2 == null || !org.telegram.messenger.az.v0) ? org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false) : l3Var2.getActionBarColor(), true);
        }
        this.m0.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false));
    }

    public final void S() {
        int L0;
        l3 l3Var = this.v0[0];
        if (l3Var.c.F == null || (L0 = l3Var.d.L0()) == -1) {
            return;
        }
        View m10 = this.v0[0].d.m(L0);
        int top = m10 != null ? m10.getTop() : 0;
        SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("articles", 0).edit();
        String str = "article" + this.v0[0].c.F.id;
        SharedPreferences.Editor putInt = edit.putInt(str, L0).putInt(str + "o", top);
        String q10 = t4.c.q(str, "r");
        Point point = org.telegram.messenger.g0.q;
        putInt.putBoolean(q10, point.x > point.y).commit();
    }

    public final boolean T(String str, boolean z10) {
        int i3 = 0;
        Integer num = 0;
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            Integer num2 = (Integer) this.v0[0].c.h.get(lowerCase);
            if (num2 != null) {
                TL_iv.textAnchor textanchor = (TL_iv.textAnchor) this.v0[0].c.r.get(lowerCase);
                int i10 = 1;
                if (textanchor != null) {
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    pageblockparagraph.text = org.telegram.ui.web.u1.d(textanchor.text, !TextUtils.isEmpty(this.v0[0].c.F.cached_page.url) ? this.v0[0].c.F.cached_page.url.toLowerCase() : this.v0[0].c.F.url.toLowerCase(), lowerCase);
                    this.v0[0].c.getClass();
                    int I = g4.I(pageblockparagraph);
                    u4.d1 x10 = this.v0[0].c.x(null, I);
                    View view = x10.a;
                    this.v0[0].c.H(I, x10, pageblockparagraph, 0, 0, false);
                    org.telegram.ui.ActionBar.t2 h = org.telegram.messenger.camera.q.h(this.M, false, 1, null);
                    h.v0 = false;
                    h.w0 = false;
                    LinearLayout linearLayout = new LinearLayout(this.M);
                    linearLayout.setOrientation(1);
                    org.telegram.ui.Cells.h9 h9Var = new org.telegram.ui.Cells.h9();
                    this.R0 = h9Var;
                    h9Var.S(linearLayout);
                    this.R0.D = new o0(this, i10);
                    ci.ec ecVar = new ci.ec(this.M, 5);
                    ecVar.setTextSize(1, 16.0f);
                    ecVar.setTypeface(org.telegram.messenger.g0.o());
                    ecVar.setText(org.telegram.messenger.bd.M0(2131749200, null));
                    ecVar.setGravity((this.v0[0].c.H ? 5 : 3) | 16);
                    ecVar.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
                    ecVar.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                    linearLayout.addView(ecVar, new LinearLayout.LayoutParams(-1, org.telegram.messenger.g0.L(48.0f) + 1));
                    view.setTag("bottomSheet");
                    linearLayout.addView(view, b8.mf.k(0.0f, 7.0f, 0.0f, 0.0f, -1, -2));
                    org.telegram.ui.Cells.t9 n4 = this.R0.n(this.M);
                    ai.c0 c0Var = new ai.c0(this, this.M, linearLayout, 8);
                    h.z0 = new i0(this, i3);
                    c0Var.addView(linearLayout, -1, -2);
                    c0Var.addView(n4, -1, -2);
                    h.O = c0Var;
                    if (this.Q0.x()) {
                        this.Q0.f(false);
                    }
                    this.J = h;
                    Y(h);
                    return true;
                }
                if (num2.intValue() >= 0 && num2.intValue() < this.v0[0].c.e.size()) {
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) this.v0[0].c.e.get(num2.intValue());
                    TL_iv.PageBlock x11 = x(pageBlock);
                    if ((x11 instanceof v3) && M((v3) x11)) {
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
                            int I2 = g4.I(pageBlock);
                            u4.d1 x12 = this.v0[0].c.x(null, I2);
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
                    j0 j0Var = new j0(this.v0[0].getContext());
                    j0Var.a = num2.intValue();
                    j0Var.s = (-org.telegram.messenger.g0.L(56.0f)) - num.intValue();
                    this.v0[0].d.w0(j0Var);
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
    public final void U(int i3) {
        int size;
        int i10;
        TL_iv.PageBlock pageBlock;
        v3 v3Var;
        TL_iv.PageBlock pageBlock2;
        if (i3 < 0 || i3 >= this.F.size()) {
            f0();
            return;
        }
        this.H = i3;
        f0();
        q3 q3Var = (q3) this.F.get(i3);
        TL_iv.PageBlock x10 = x(q3Var.c);
        int size2 = this.v0[0].c.e.size();
        for (int i11 = 0; i11 < size2; i11++) {
            TL_iv.PageBlock pageBlock3 = (TL_iv.PageBlock) this.v0[0].c.e.get(i11);
            if ((pageBlock3 instanceof v3) && ((pageBlock2 = (v3Var = (v3) pageBlock3).b) == q3Var.c || pageBlock2 == x10)) {
                if (M(v3Var)) {
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
                    TL_iv.PageBlock pageBlock5 = q3Var.c;
                    if (pageBlock4 == pageBlock5 || pageBlock4 == x10 || ((pageBlock4 instanceof v3) && ((pageBlock = ((v3) pageBlock4).b) == pageBlock5 || pageBlock == x10))) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 != -1) {
                    return;
                }
                if ((x10 instanceof v3) && M((v3) x10)) {
                    this.v0[0].c.M();
                    this.v0[0].c.f();
                }
                String str = this.G + q3Var.c + q3Var.b + q3Var.a;
                Integer num = (Integer) this.v0[0].c.E.get(str);
                if (num == null) {
                    g4 g4Var = this.v0[0].c;
                    TL_iv.PageBlock pageBlock6 = q3Var.c;
                    g4Var.getClass();
                    int I = g4.I(pageBlock6);
                    u4.d1 x11 = this.v0[0].c.x(null, I);
                    this.v0[0].c.H(I, x11, q3Var.c, 0, 0, false);
                    x11.a.measure(View.MeasureSpec.makeMeasureSpec(this.v0[0].b.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                    num = (Integer) this.v0[0].c.E.get(str);
                    if (num == null) {
                        num = 0;
                    }
                }
                p0 p0Var = new p0(this.v0[0].getContext());
                if (this.v0[0].c.J) {
                    i10++;
                }
                p0Var.a = i10;
                p0Var.s = -(org.telegram.messenger.g0.L(100.0f) + ((this.K0 - org.telegram.messenger.g0.L(56.0f)) - num.intValue()));
                p0Var.t = 1.2f;
                this.v0[0].d.w0(p0Var);
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

    public final void V(int i3) {
        m0 m0Var = this.i0;
        if (m0Var == null || m0Var.U || m0Var.a0) {
            return;
        }
        int j10 = Utilities.j(i3, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(24.0f));
        this.K0 = j10;
        this.i0.setHeight(j10);
        this.Q0.x = this.K0;
        int i10 = 0;
        while (true) {
            l3[] l3VarArr = this.v0;
            if (i10 >= l3VarArr.length) {
                return;
            }
            l3VarArr[i10].b.setTopGlowOffset(this.K0);
            i10++;
        }
    }

    public final void W(Activity activity, org.telegram.ui.ActionBar.d2 d2Var) {
        int i3;
        u3 u3Var;
        cg.u0 u0Var = this.W0;
        if (u0Var != null) {
            u0Var.b();
            this.W0 = null;
        }
        LaunchActivity launchActivity = LaunchActivity.K1;
        int i10 = 1;
        this.W0 = launchActivity != null ? new cg.u0(launchActivity, true) : null;
        this.N = d2Var;
        int currentAccount = !(d2Var instanceof gx) ? d2Var.getCurrentAccount() : org.telegram.messenger.h10.t0;
        this.Y = currentAccount;
        org.telegram.messenger.hs.f(currentAccount).c(this, org.telegram.messenger.hs.e2);
        org.telegram.messenger.hs.f(this.Y).c(this, org.telegram.messenger.hs.f2);
        org.telegram.messenger.hs.f(this.Y).c(this, org.telegram.messenger.hs.g2);
        org.telegram.messenger.hs.f(this.Y).c(this, org.telegram.messenger.hs.h2);
        org.telegram.messenger.hs.f(this.Y).c(this, org.telegram.messenger.hs.i4);
        Activity activity2 = this.M;
        if (activity2 == activity || !(activity2 == null || !this.K || (u3Var = this.L) == null || u3Var.e == null)) {
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
        l0 l0Var = new l0(i11, activity, this);
        this.h0 = l0Var;
        this.g0.addView(l0Var, b8.mf.e(-1, -1, 51));
        if (this.L == null) {
            this.g0.setFitsSystemWindows(true);
            this.h0.setOnApplyWindowInsetsListener(new org.telegram.ui.ActionBar.u2(i10));
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        this.Q = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.Q.setVisibility(4);
        this.g0.addView(this.Q, b8.mf.c(-1.0f, -1));
        l4 l4Var = new l4(activity);
        this.S = l4Var;
        l4Var.setVisibility(0);
        this.S.setBackgroundColor(-16777216);
        this.Q.addView(this.S, b8.mf.e(-1, -1, 17));
        this.R = new TextureView(activity);
        int i12 = 2;
        this.v0 = new l3[2];
        int i13 = 0;
        while (true) {
            l3[] l3VarArr = this.v0;
            i3 = 8;
            if (i13 >= l3VarArr.length) {
                break;
            }
            l3 l3Var = new l3(this, activity);
            l3VarArr[i13] = l3Var;
            if (i13 == 0) {
                i3 = 0;
            }
            l3Var.setVisibility(i3);
            this.h0.addView(l3Var, b8.mf.d(-1, -1.0f, org.telegram.messenger.hs.E1, 0.0f, 0.0f, 0.0f, 0.0f));
            l3Var.b.setOnItemLongClickListener(new s(this));
            l3Var.b.setOnItemClickListener(new mi.d4(12, this, l3Var));
            i13++;
        }
        this.h0.addView(new FrameLayout(activity), b8.mf.d(-1, -1.0f, org.telegram.messenger.hs.E1, 0.0f, 0.0f, 0.0f, 0.0f));
        this.x0.setColor(-16777216);
        this.y0.setColor(-16777216);
        this.B0.setColor(-14408666);
        this.z0.setColor(-16777216);
        m0 m0Var = new m0(this, activity);
        this.i0 = m0Var;
        m0Var.f0 = this.L != null;
        this.h0.addView(m0Var, b8.mf.e(-1, -2, 48));
        this.i0.setOnClickListener(new org.telegram.messenger.video.g(7, this, activity));
        this.i0.c0.addTextChangedListener(new n0(this, i11));
        org.telegram.ui.web.l lVar = new org.telegram.ui.web.l(activity);
        this.j0 = lVar;
        lVar.setOpenProgress(0.0f);
        this.j0.x.j(new h3(this, i12));
        this.h0.addView(this.j0, b8.mf.c(-1.0f, -1));
        int i14 = 3;
        this.k0 = new b0(this, i14);
        this.i0.M.setOnClickListener(new r(this, i12));
        this.i0.M.setOnLongClickListener(new t(this, i11));
        this.i0.setMenuListener(new mi.f(i3, this, activity));
        this.i0.P.setOnClickListener(new r(this, i14));
        ai.d2 d2Var2 = new ai.d2(this.M, i3);
        this.r0 = d2Var2;
        d2Var2.setOnTouchListener(new fi.a(i14));
        this.r0.setWillNotDraw(false);
        this.r0.setTranslationY(org.telegram.messenger.g0.L(51.0f));
        this.r0.setVisibility(4);
        this.r0.setFocusable(true);
        this.r0.setFocusableInTouchMode(true);
        this.r0.setClickable(true);
        this.r0.setPadding(0, org.telegram.messenger.g0.L(3.0f), 0, 0);
        this.h0.addView(this.r0, b8.mf.e(-1, 51, 80));
        new gi.p3(this.g0, false, new q(this, i11));
        ImageView imageView = new ImageView(this.M);
        this.s0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.s0.setImageResource(R.drawable.msg_go_up);
        ImageView imageView2 = this.s0;
        int i15 = org.telegram.ui.ActionBar.k6.G6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView2, i15, null, mode);
        ImageView imageView3 = this.s0;
        int i16 = org.telegram.ui.ActionBar.k6.z8;
        org.telegram.ui.ActionBar.r6.R(imageView3, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i16, false), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i16), null);
        this.r0.addView(this.s0, b8.mf.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        this.s0.setOnClickListener(new r(this, i11));
        this.s0.setContentDescription(org.telegram.messenger.bd.M0(2131754779, null));
        ImageView imageView4 = new ImageView(this.M);
        this.t0 = imageView4;
        imageView4.setScaleType(scaleType);
        this.t0.setImageResource(R.drawable.msg_go_down);
        org.telegram.ui.ActionBar.r6.t(this.t0, i15, null, mode);
        org.telegram.ui.ActionBar.r6.R(this.t0, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i16, false), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i16), null);
        this.r0.addView(this.t0, b8.mf.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        this.t0.setOnClickListener(new r(this, i10));
        this.t0.setContentDescription(org.telegram.messenger.bd.M0(2131754778, null));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(this.M, true, true, true);
        this.u0 = h6Var;
        h6Var.setScaleProperty(0.6f);
        this.u0.b(0.4f, 350L, org.telegram.ui.Components.xq.h);
        org.telegram.ui.ActionBar.r6.Z(this.u0, i15, null);
        this.u0.setTextSize(org.telegram.messenger.g0.L(15.0f));
        this.u0.setTypeface(org.telegram.messenger.g0.o());
        this.u0.setGravity(3);
        this.u0.getDrawable().M = org.telegram.messenger.g0.q.x;
        this.r0.addView(this.u0, b8.mf.d(-2, -2.0f, 19, 18.0f, 0.0f, 108.0f, 0.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f0 = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 98;
        layoutParams.softInputMode = 48;
        layoutParams.flags = 131072;
        int x02 = this.L == null ? org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a7, true) : org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a7, false);
        int i17 = (org.telegram.messenger.g0.B(x02) < 0.721f || Build.VERSION.SDK_INT < 26) ? 1792 : 1808;
        this.z0.setColor(x02);
        this.A0 = true;
        WindowManager.LayoutParams layoutParams2 = this.f0;
        layoutParams2.systemUiVisibility = i17;
        layoutParams2.flags |= -2147417856;
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams2.layoutInDisplayCutoutMode = 1;
        }
        org.telegram.ui.Cells.h9 h9Var = new org.telegram.ui.Cells.h9();
        this.Q0 = h9Var;
        h9Var.S(this.v0[0].b);
        if (org.telegram.messenger.hp.s1(this.Y).s7.s()) {
            this.Q0.k0 = new s(this);
        }
        org.telegram.ui.Cells.h9 h9Var2 = this.Q0;
        h9Var2.z0 = this.v0[0].d;
        h9Var2.D = new o0(this, i11);
        this.h0.addView(h9Var2.n(activity));
        l0 l0Var2 = this.h0;
        vq0 vq0Var = new vq0(l0Var2, l0Var2);
        this.S0 = vq0Var;
        vq0Var.F = new s(this);
        vq0Var.E = new f(this, i10);
        this.m0.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false));
        e0(this);
    }

    public final void X(String str) {
        String str2;
        if (this.M == null) {
            return;
        }
        org.telegram.ui.ActionBar.t2 t2Var = this.J;
        if (t2Var != null) {
            t2Var.dismiss();
            this.J = null;
        }
        int i3 = 0;
        org.telegram.ui.ActionBar.t2 h = org.telegram.messenger.camera.q.h(this.M, false, 1, null);
        try {
            str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            str2 = str;
        }
        h.P = str2;
        h.Q = false;
        h.R = true;
        CharSequence[] charSequenceArr = {org.telegram.messenger.bd.M0(2131747825, null), org.telegram.messenger.bd.M0(2131751767, null)};
        u uVar = new u(i3, this, str);
        h.M = charSequenceArr;
        h.L = uVar;
        h.I0 = new v(this, i3);
        Y(h);
    }

    public final void Y(org.telegram.ui.ActionBar.t2 t2Var) {
        if (this.M == null) {
            return;
        }
        try {
            org.telegram.ui.ActionBar.t2 t2Var2 = this.l0;
            if (t2Var2 != null) {
                t2Var2.dismiss();
                this.l0 = null;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            this.l0 = t2Var;
            t2Var.setCanceledOnTouchOutside(true);
            this.l0.setOnDismissListener(new v(this, 1));
            t2Var.show();
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
        org.telegram.messenger.g0.i3(this.k0, 100L);
    }

    @Override // org.telegram.ui.i50
    public final void a(g4 g4Var, org.telegram.ui.Components.py0 py0Var) {
        String str;
        String str2;
        org.telegram.ui.Components.t70 t70Var;
        if (py0Var == null || (str = py0Var.b) == null) {
            return;
        }
        org.telegram.ui.ActionBar.t2 t2Var = this.J;
        k0 k0Var = null;
        if (t2Var != null) {
            t2Var.dismiss();
            this.J = null;
        }
        int lastIndexOf = str.lastIndexOf(35);
        boolean z10 = false;
        if (lastIndexOf != -1) {
            String lowerCase = !TextUtils.isEmpty(g4Var.F.cached_page.url) ? g4Var.F.cached_page.url.toLowerCase() : g4Var.F.url.toLowerCase();
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
        a3 a3Var = this.d;
        if (a3Var != null && (t70Var = this.b) != null) {
            k0Var = new k0(this, a3Var, t70Var);
        }
        O(str, str2, k0Var);
    }

    public final void a0() {
        LaunchActivity launchActivity;
        FrameLayout frameLayout;
        if (!this.X || (launchActivity = LaunchActivity.K1) == null || launchActivity.isFinishing()) {
            return;
        }
        if (!this.v0[0].f()) {
            l3 l3Var = this.v0[0];
            TLRPC.WebPage webPage = l3Var.c.F;
            frameLayout = l3Var;
            if (webPage == null) {
                return;
            }
        } else if (this.v0[0].getWebView() == null) {
            return;
        } else {
            frameLayout = this.v0[0].f;
        }
        new org.telegram.ui.Components.fc(frameLayout, null).G(R.raw.chats_infotip, 4, org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131752874, null), new b0(this, 11))).k(true);
    }

    @Override // org.telegram.ui.i50
    public final boolean b(TL_iv.PageBlock pageBlock, g4 g4Var) {
        int indexOf;
        List list;
        org.telegram.ui.ActionBar.d2 d2Var = this.N;
        if (d2Var != null && d2Var.getParentActivity() != null) {
            if (!(pageBlock instanceof TL_iv.pageBlockVideo) || e4.g(g4Var.F, pageBlock)) {
                ArrayList arrayList = new ArrayList(g4Var.f);
                indexOf = g4Var.f.indexOf(pageBlock);
                list = arrayList;
            } else {
                list = Collections.singletonList(pageBlock);
                indexOf = 0;
            }
            PhotoViewer v12 = PhotoViewer.v1();
            v12.N2(null, this.N, null);
            if (v12.h2(null, null, null, null, null, null, null, indexOf, new e3(this, list), null, 0L, 0L, 0L, true, new n3(this, g4Var.F, list), null)) {
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
        this.Z0.addListener(new dh.x(19, this, z10));
        this.Z0.setDuration(320L);
        this.Z0.setInterpolator(org.telegram.ui.Components.xq.h);
        this.Z0.start();
    }

    public final void c0(int i3, Object obj, boolean z10) {
        int L;
        if (obj != null) {
            if ((!(obj instanceof TLRPC.WebPage) || ((TLRPC.WebPage) obj).cached_page == null) && !(obj instanceof y2)) {
                return;
            }
            int i10 = 0;
            if (!z10 && i3 != 0) {
                l3[] l3VarArr = this.v0;
                l3 l3Var = l3VarArr[1];
                l3VarArr[1] = l3VarArr[0];
                l3VarArr[0] = l3Var;
                this.i0.i();
                this.b1.a(this.v0[0].getBackgroundColor(), true);
                this.c1.a(this.v0[1].getBackgroundColor(), true);
                u3 u3Var = this.L;
                if (u3Var != null) {
                    u3Var.z();
                }
                int indexOfChild = this.h0.indexOfChild(this.v0[0]);
                int indexOfChild2 = this.h0.indexOfChild(this.v0[1]);
                if (i3 == 1) {
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
                int i11 = i3 == 1 ? 0 : 1;
                this.v0[i11].setBackgroundColor(this.L == null ? 0 : this.m0.getColor());
                this.v0[i11].setLayerType(2, null);
                if (i3 == 1) {
                    l3 l3Var2 = this.v0[0];
                    Point point = org.telegram.messenger.g0.q;
                    l3Var2.setTranslationX(point.x);
                    this.w0.playTogether(ObjectAnimator.ofFloat(this.v0[0], (Property<l3, Float>) View.TRANSLATION_X, point.x, 0.0f));
                } else if (i3 == -1) {
                    this.v0[0].setTranslationX(0.0f);
                    this.w0.playTogether(ObjectAnimator.ofFloat(this.v0[1], (Property<l3, Float>) View.TRANSLATION_X, 0.0f, org.telegram.messenger.g0.q.x));
                }
                this.w0.setDuration(320L);
                this.w0.setInterpolator(org.telegram.ui.Components.xq.h);
                this.w0.addListener(new s0(this, i11, i10));
                this.g0.f = true;
                m0 m0Var = this.i0;
                l3 l3Var3 = this.v0[0];
                m0Var.setMenuColors((l3Var3 == null || !org.telegram.messenger.az.v0) ? org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false) : l3Var3.getBackgroundColor());
                m0 m0Var2 = this.i0;
                l3 l3Var4 = this.v0[0];
                m0Var2.d((l3Var4 == null || !org.telegram.messenger.az.v0) ? org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false) : l3Var4.getActionBarColor(), true);
                m0 m0Var3 = this.i0;
                l3 l3Var5 = this.v0[0];
                m0Var3.setIsTonsite(l3Var5 != null && l3Var5.e());
                m0 m0Var4 = this.i0;
                l3 l3Var6 = this.v0[0];
                m0Var4.setIsLocal(l3Var6 != null && l3Var6.d());
                AnimatorSet animatorSet = this.w0;
                Objects.requireNonNull(animatorSet);
                org.telegram.messenger.g0.h3(new xp0(animatorSet, 4));
            }
            if (!z10) {
                this.Q0.f(true);
            }
            g4 g4Var = this.v0[z10 ? 1 : 0].c;
            if (z10) {
                obj = k2.p1.h(2, this.e0);
            }
            this.v0[z10 ? 1 : 0].b();
            if (obj instanceof TLRPC.WebPage) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj;
                this.v0[z10 ? 1 : 0].setWeb(null);
                this.v0[z10 ? 1 : 0].setType(0);
                TL_iv.Page page = webPage.cached_page;
                g4Var.H = page.rtl;
                g4Var.F = webPage;
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
                                    g4Var.G = (TL_iv.pageBlockChannel) pageBlock2;
                                }
                            }
                        }
                    } else if (i12 == 1 && g4Var.G != null) {
                        i12++;
                    }
                    g4Var.F(g4Var, pageBlock, 0, 0, i12 == size + (-1) ? i12 : 0);
                    i12++;
                }
                g4Var.f();
                if (this.e0.size() == 1 || i3 == -1) {
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
                    u4.b0 b0Var = this.v0[z10 ? 1 : 0].d;
                    u3 u3Var2 = this.L;
                    b0Var.h1(u3Var2 == null ? 0 : 1, u3Var2 != null ? org.telegram.messenger.g0.L(32.0f) : 0);
                }
            } else if (obj instanceof y2) {
                this.v0[z10 ? 1 : 0].setType(1);
                this.v0[z10 ? 1 : 0].g();
                this.v0[z10 ? 1 : 0].setWeb((y2) obj);
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
        if (this.i0 == null || (l3Var = (l3VarArr = this.v0)[0]) == null || l3VarArr[1] == null) {
            return;
        }
        float translationX = l3Var.getVisibility() != 0 ? 0.0f : 1.0f - (this.v0[0].getTranslationX() / this.v0[0].getWidth());
        float f10 = 1.0f - translationX;
        m0 m0Var = this.i0;
        m0Var.d[0] = this.v0[0].getProgress();
        m0Var.invalidate();
        m0 m0Var2 = this.i0;
        m0Var2.d[1] = this.v0[1].getProgress();
        m0Var2.invalidate();
        this.i0.setTransitionProgress(f10);
        m0 m0Var3 = this.i0;
        if (!m0Var3.a0 && !m0Var3.U) {
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
        m0 m0Var4 = this.i0;
        int actionBarColor = this.v0[0].getActionBarColor();
        ArticleViewer$WindowView articleViewer$WindowView2 = this.g0;
        m0Var4.b(0, this.b1.a(actionBarColor, articleViewer$WindowView2.e || articleViewer$WindowView2.f));
        m0 m0Var5 = this.i0;
        int actionBarColor2 = this.v0[1].getActionBarColor();
        ArticleViewer$WindowView articleViewer$WindowView3 = this.g0;
        m0Var5.b(1, this.c1.a(actionBarColor2, articleViewer$WindowView3.e || articleViewer$WindowView3.f));
        this.i0.d(i0.a.f(f10, this.v0[0].getActionBarColor(), this.v0[1].getActionBarColor()), false);
        this.i0.setMenuType((translationX > 0.5f ? this.v0[0] : this.v0[1]).a);
        u3 u3Var = this.L;
        if (u3Var != null) {
            u3Var.c.invalidate();
            return;
        }
        ArticleViewer$WindowView articleViewer$WindowView4 = this.g0;
        if (articleViewer$WindowView4 != null) {
            articleViewer$WindowView4.invalidate();
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        y0 y0Var;
        org.telegram.messenger.zi messageObject;
        if (i3 == org.telegram.messenger.hs.h2) {
            if (this.v0 == null) {
                return;
            }
            int i11 = 0;
            while (true) {
                l3[] l3VarArr = this.v0;
                if (i11 >= l3VarArr.length) {
                    return;
                }
                int childCount = l3VarArr[i11].b.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.v0[i11].b.getChildAt(i12);
                    if (childAt instanceof y0) {
                        ((y0) childAt).a(true);
                    }
                }
                i11++;
            }
        } else if (i3 == org.telegram.messenger.hs.f2 || i3 == org.telegram.messenger.hs.g2) {
            if (this.v0 == null) {
                return;
            }
            int i13 = 0;
            while (true) {
                l3[] l3VarArr2 = this.v0;
                if (i13 >= l3VarArr2.length) {
                    return;
                }
                int childCount2 = l3VarArr2[i13].b.getChildCount();
                for (int i14 = 0; i14 < childCount2; i14++) {
                    View childAt2 = this.v0[i13].b.getChildAt(i14);
                    if (childAt2 instanceof y0) {
                        y0 y0Var2 = (y0) childAt2;
                        if (y0Var2.getMessageObject() != null) {
                            y0Var2.a(true);
                        }
                    }
                }
                i13++;
            }
        } else if (i3 == org.telegram.messenger.hs.e2) {
            Integer num = (Integer) objArr[0];
            if (this.v0 == null) {
                return;
            }
            int i15 = 0;
            while (true) {
                l3[] l3VarArr3 = this.v0;
                if (i15 >= l3VarArr3.length) {
                    return;
                }
                int childCount3 = l3VarArr3[i15].b.getChildCount();
                int i16 = 0;
                while (true) {
                    if (i16 < childCount3) {
                        View childAt3 = this.v0[i15].b.getChildAt(i16);
                        if ((childAt3 instanceof y0) && (messageObject = (y0Var = (y0) childAt3).getMessageObject()) != null && messageObject.f1() == num.intValue()) {
                            org.telegram.messenger.zi ziVar = MediaController.B().v0;
                            if (ziVar != null) {
                                messageObject.b0 = ziVar.b0;
                                messageObject.g0 = ziVar.g0;
                                messageObject.h0 = ziVar.h0;
                                y0Var.b();
                            }
                        } else {
                            i16++;
                        }
                    }
                }
                i15++;
            }
        } else {
            if (i3 != org.telegram.messenger.hs.i4 || this.v0 == null) {
                return;
            }
            int i17 = 0;
            while (true) {
                l3[] l3VarArr4 = this.v0;
                if (i17 >= l3VarArr4.length) {
                    return;
                }
                int childCount4 = l3VarArr4[i17].b.getChildCount();
                for (int i18 = 0; i18 < childCount4; i18++) {
                    View childAt4 = this.v0[i17].b.getChildAt(i18);
                    if (childAt4 instanceof t2) {
                        ((t2) childAt4).e.invalidate();
                    } else {
                        childAt4.invalidate();
                    }
                }
                i17++;
            }
        }
    }

    public final void e(int i3, String str) {
        S();
        y2 y2Var = new y2();
        y2Var.x = str;
        this.e0.add(y2Var);
        this.i0.h(false);
        c0(i3, y2Var, false);
    }

    public final boolean f(TLRPC.WebPage webPage, String str, int i3) {
        S();
        this.e0.add(webPage);
        this.i0.h(false);
        c0(i3, webPage, false);
        return T(str, false);
    }

    public final void f0() {
        int i3;
        int size;
        if (this.F != null || this.v0[0].f()) {
            if (this.v0[0].f()) {
                i3 = this.v0[0].getWebView() == null ? 0 : this.v0[0].getWebView().getSearchIndex();
                size = this.v0[0].getWebView() == null ? 0 : this.v0[0].getWebView().getSearchCount();
            } else {
                i3 = this.H;
                size = this.F.size();
            }
            this.s0.setEnabled(size > 0 && i3 != 0);
            this.t0.setEnabled(size > 0 && i3 != size + (-1));
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
                this.u0.setText(org.telegram.messenger.bd.M0(2131748175, null));
            } else if (size == 1) {
                this.u0.setText(org.telegram.messenger.bd.M0(2131747835, null));
            } else {
                this.u0.setText(String.format(org.telegram.messenger.bd.K0(size, "CountOfResults"), Integer.valueOf(i3 + 1), Integer.valueOf(size)));
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
        m0 m0Var = this.i0;
        if (this.v0[1].f() && this.v0[1].getWebView() != null && this.v0[1].getWebView().F) {
            z11 = true;
        }
        m0Var.e(1, z11);
    }

    public final void i() {
        this.L0 = false;
        z2 z2Var = this.M0;
        if (z2Var != null) {
            this.g0.removeCallbacks(z2Var);
            this.M0 = null;
        }
        z2 z2Var2 = this.N0;
        if (z2Var2 != null) {
            this.g0.removeCallbacks(z2Var2);
            this.N0 = null;
        }
    }

    public final void k(org.telegram.messenger.ce ceVar) {
        if (this.K0 == org.telegram.messenger.g0.L(56.0f)) {
            if (ceVar != null) {
                ceVar.run();
                return;
            }
            return;
        }
        ValueAnimator duration = ValueAnimator.ofObject(new IntEvaluator(), Integer.valueOf(this.K0), Integer.valueOf(org.telegram.messenger.g0.L(56.0f))).setDuration(180L);
        duration.setInterpolator(new DecelerateInterpolator());
        duration.addUpdateListener(new p(this, 0));
        duration.addListener(new ii.v3(ceVar, 13));
        if (ceVar != null) {
            duration.setDuration(duration.getDuration() / 2);
        }
        duration.start();
    }

    public final void l() {
        w2 w2Var;
        gi.v vVar = this.v0[0].b;
        if (vVar == null || !this.X) {
            return;
        }
        float measuredHeight = vVar.getMeasuredHeight() / 2.0f;
        float f10 = 0.0f;
        w2 w2Var2 = null;
        for (int i3 = 0; i3 < vVar.getChildCount(); i3++) {
            View childAt = vVar.getChildAt(i3);
            if (childAt instanceof w2) {
                float measuredHeight2 = (childAt.getMeasuredHeight() / 2.0f) + childAt.getTop();
                if (w2Var2 == null || Math.abs(measuredHeight - measuredHeight2) < Math.abs(measuredHeight - f10)) {
                    w2Var2 = (w2) childAt;
                    f10 = measuredHeight2;
                }
            }
        }
        boolean z10 = PhotoViewer.v1().f;
        if (z10 || ((w2Var = this.y) != null && w2Var != w2Var2 && this.x != null)) {
            VideoPlayerHolderBase videoPlayerHolderBase = this.x;
            if (videoPlayerHolderBase != null) {
                w2 w2Var3 = this.y;
                long j10 = w2Var3.M.video_id;
                x2 a10 = x2.a(videoPlayerHolderBase, w2Var3);
                w2Var3.c(a10);
                this.E.k(a10, j10);
                w2 w2Var4 = this.y;
                x2 x2Var = w2Var4.N;
                if (x2Var != null) {
                    Bitmap bitmap = x2Var.b;
                    if (bitmap != null) {
                        w2Var4.e.v0(bitmap);
                    }
                    this.y.e(false);
                }
                this.x.release(null);
            }
            this.x = null;
            this.y = null;
        }
        if (z10 || w2Var2 == null) {
            return;
        }
        i50 i50Var = w2Var2.a;
        if (w2Var2.P != null && i50Var.x == null) {
            i50Var.x = new v2(w2Var2).with(w2Var2.n);
            TLRPC.Document document = w2Var2.P;
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                if (document.attributes.get(i10) instanceof TLRPC.TL_documentAttributeVideo) {
                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i10);
                    w2Var2.h.a(tL_documentAttributeVideo.w / tL_documentAttributeVideo.h, 0);
                }
            }
            TLRPC.WebPage webPage = w2Var2.b.F;
            Uri i11 = webPage != null ? org.telegram.messenger.s8.i(((i4) i50Var).Y, webPage, document) : null;
            if (i11 != null) {
                VideoPlayerHolderBase videoPlayerHolderBase2 = i50Var.x;
                x2 x2Var2 = w2Var2.N;
                videoPlayerHolderBase2.seekTo(x2Var2 == null ? 0L : x2Var2.a);
                i50Var.x.preparePlayer(i11, true, 1.0f);
                i50Var.x.play();
            }
        }
        this.y = w2Var2;
    }

    public final void m(boolean z10, boolean z11) {
        if (this.M == null || this.V0 || !this.W) {
            return;
        }
        int i3 = 0;
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
        u3 u3Var = this.L;
        if (u3Var != null) {
            u3Var.a(false);
            return;
        }
        if (this.Q.getVisibility() == 0) {
            if (this.P != null) {
                this.Q.setVisibility(4);
                this.T.onCustomViewHidden();
                this.Q.removeView(this.P);
                this.P = null;
            } else {
                org.telegram.ui.Components.d71 d71Var = this.G0;
                if (d71Var != null && d71Var.U) {
                    d71Var.U = false;
                    d71Var.m();
                    d71Var.l(false);
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
        m0 m0Var = this.i0;
        if (m0Var.U) {
            m0Var.h(false);
            return;
        }
        if (m0Var.a0) {
            m0Var.k(false);
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
                Object o10 = org.telegram.ui.Cells.f1.o(1, arrayList);
                if (o10 instanceof y2) {
                    ((y2) o10).a();
                }
                if (o10 instanceof TLRPC.WebPage) {
                    org.telegram.ui.web.u1.o((TLRPC.WebPage) o10);
                }
                c0(-1, arrayList.get(arrayList.size() - 1), false);
                return;
            }
        }
        org.telegram.messenger.hs.f(this.Y).n(this, org.telegram.messenger.hs.e2);
        org.telegram.messenger.hs.f(this.Y).n(this, org.telegram.messenger.hs.f2);
        org.telegram.messenger.hs.f(this.Y).n(this, org.telegram.messenger.hs.g2);
        org.telegram.messenger.hs.f(this.Y).n(this, org.telegram.messenger.hs.h2);
        org.telegram.messenger.hs.f(this.Y).n(this, org.telegram.messenger.hs.i4);
        cg.u0 u0Var = this.W0;
        if (u0Var != null) {
            u0Var.b();
            this.W0 = null;
        }
        this.N = null;
        try {
            org.telegram.ui.ActionBar.t2 t2Var = this.l0;
            if (t2Var != null) {
                t2Var.dismiss();
                this.l0 = null;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArticleViewer$WindowView articleViewer$WindowView = this.g0;
        Property property = View.ALPHA;
        animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, (Property<ArticleViewer$WindowView, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.h0, (Property<l0, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.g0, (Property<ArticleViewer$WindowView, Float>) View.TRANSLATION_X, 0.0f, org.telegram.messenger.g0.L(56.0f)));
        this.a0 = 2;
        this.b0 = new b0(this, 10);
        animatorSet.setDuration(150L);
        animatorSet.setInterpolator(this.d0);
        animatorSet.addListener(new ii.v3(this, 14));
        this.c0 = System.currentTimeMillis();
        this.h0.setLayerType(2, null);
        animatorSet.start();
        while (true) {
            a0.h hVar = this.E;
            if (i3 >= hVar.m()) {
                hVar.b();
                return;
            }
            x2 x2Var = (x2) hVar.n(i3);
            Bitmap bitmap = x2Var.b;
            if (bitmap != null) {
                bitmap.recycle();
                x2Var.b = null;
            }
            i3++;
        }
    }

    public final void q() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.e0;
            if (i3 >= arrayList.size()) {
                arrayList.clear();
                r();
                return;
            }
            Object obj = arrayList.get(i3);
            if (obj instanceof y2) {
                l3 l3Var = this.v0[0];
                if (l3Var != null && l3Var.L == obj) {
                    ((y2) obj).c(l3Var);
                }
                l3 l3Var2 = this.v0[1];
                if (l3Var2 != null && l3Var2.L == obj) {
                    ((y2) obj).c(l3Var2);
                }
                ((y2) obj).a();
            } else if (obj instanceof TLRPC.WebPage) {
                org.telegram.ui.web.u1.o((TLRPC.WebPage) obj);
            }
            i3++;
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
        for (int i3 = 0; i3 < this.O.size(); i3++) {
            ((r1) this.O.get(i3)).a(true);
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

    public i4(org.telegram.ui.ActionBar.d2 d2Var) {
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
        this.T0 = new g2.g(new int[]{org.telegram.messenger.hs.s, org.telegram.messenger.hs.t});
        this.U0 = new l0[2];
        this.Y0 = -1;
        b0 b0Var = new b0(this, 4);
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        this.b1 = new org.telegram.ui.Components.x4(b0Var, 320L, xqVar);
        this.c1 = new org.telegram.ui.Components.x4(new b0(this, 5), 320L, xqVar);
        this.K = true;
        this.L = new u3(this, d2Var);
        W(d2Var.getParentActivity(), d2Var);
    }
}
