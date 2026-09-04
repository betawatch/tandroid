package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.IntEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileStreamLoadOperation;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class i4 extends v70 implements NotificationCenter.NotificationCenterDelegate {
    public static Paint B1;
    public static TextPaint g1;
    public static TextPaint h1;
    public static TextPaint i1;
    public static TextPaint j1;
    public static TextPaint k1;
    public static TextPaint l1;
    public static TextPaint m1;
    public static TextPaint n1;
    public static Paint o1;
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
    public ActionBarPopupWindow$ActionBarPopupWindowLayout A0;
    public TextView B0;
    public Rect C0;
    public org.telegram.ui.Components.b91 D0;
    public org.telegram.ui.Components.b91 E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public final boolean J;
    public boolean J0;
    public final v3 K;
    public a3 K0;
    public Activity L;
    public a3 L0;
    public org.telegram.ui.ActionBar.n2 M;
    public of.e M0;
    public final ArrayList N;
    public int N0;
    public View O;
    public org.telegram.ui.Cells.q9 O0;
    public FrameLayout P;
    public org.telegram.ui.Cells.q9 P0;
    public TextureView Q;
    public ov0 Q0;
    public l4 R;
    public final AnimationNotificationsLocker R0;
    public WebChromeClient.CustomViewCallback S;
    public final j0[] S0;
    public WindowInsets T;
    public boolean T0;
    public boolean U;
    public kb0 U0;
    public boolean V;
    public ah.p V0;
    public boolean W;
    public int W0;
    public int X;
    public ValueAnimator X0;
    public int Y;
    public float Y0;
    public int Z;
    public final org.telegram.ui.Components.h5 Z0;
    public Runnable a0;
    public final org.telegram.ui.Components.h5 a1;
    public long b0;
    public final DecelerateInterpolator c0;
    public final ArrayList d0;
    public WindowManager.LayoutParams e0;
    public ArticleViewer$WindowView f0;
    public j0 g0;
    public k0 h0;
    public org.telegram.ui.web.l i0;
    public a0 j0;
    public org.telegram.ui.ActionBar.f3 k0;
    public Paint l0;
    public Drawable m0;
    public Paint n0;
    public boolean o0;
    public float p0;
    public bi.g5 q0;
    public ImageView r0;
    public ImageView s0;
    public org.telegram.ui.Components.q6 t0;
    public m3[] u0;
    public AnimatorSet v0;
    public final Paint w0;
    public final Paint x0;
    public final Paint y0;
    public final Paint z0;
    public static final HashSet b1 = new HashSet();
    public static volatile i4 c1 = null;
    public static final t0 d1 = new t0("innerTranslationX", 0);
    public static final TextPaint e1 = new TextPaint(1);
    public static final q3 f1 = new q3();
    public static final WeakHashMap A1 = new WeakHashMap();

    public i4() {
        this.N = new ArrayList();
        this.Y = 1;
        this.c0 = new DecelerateInterpolator(1.5f);
        this.d0 = new ArrayList();
        this.w0 = new Paint();
        this.x0 = new Paint();
        this.y0 = new Paint();
        this.z0 = new Paint();
        this.J0 = false;
        this.K0 = null;
        this.L0 = null;
        this.R0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats});
        this.S0 = new j0[2];
        this.W0 = -1;
        a0 a0Var = new a0(this, 2);
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        this.Z0 = new org.telegram.ui.Components.h5(a0Var, 320L, prVar);
        this.a1 = new org.telegram.ui.Components.h5(new a0(this, 4), 320L, prVar);
        this.J = false;
        this.K = null;
    }

    public static TL_iv.RichText A(TL_iv.RichText richText) {
        if (richText == null) {
            return null;
        }
        if (richText instanceof TL_iv.textFixed) {
            return A(((TL_iv.textFixed) richText).text);
        }
        if (richText instanceof TL_iv.textItalic) {
            return A(((TL_iv.textItalic) richText).text);
        }
        if (richText instanceof TL_iv.textBold) {
            return A(((TL_iv.textBold) richText).text);
        }
        if (richText instanceof TL_iv.textUnderline) {
            return A(((TL_iv.textUnderline) richText).text);
        }
        if (richText instanceof TL_iv.textStrike) {
            return A(((TL_iv.textStrike) richText).text);
        }
        if (richText instanceof TL_iv.textEmail) {
            return A(((TL_iv.textEmail) richText).text);
        }
        if (richText instanceof TL_iv.textUrl) {
            return A(((TL_iv.textUrl) richText).text);
        }
        if (!(richText instanceof TL_iv.textAnchor)) {
            return richText instanceof TL_iv.textSubscript ? A(((TL_iv.textSubscript) richText).text) : richText instanceof TL_iv.textSuperscript ? A(((TL_iv.textSuperscript) richText).text) : richText instanceof TL_iv.textMarked ? A(((TL_iv.textMarked) richText).text) : richText instanceof TL_iv.textPhone ? A(((TL_iv.textPhone) richText).text) : richText instanceof TL_iv.textSpoiler ? A(((TL_iv.textSpoiler) richText).text) : richText;
        }
        A(((TL_iv.textAnchor) richText).text);
        return richText;
    }

    public static CharSequence B(TL_iv.RichText richText) {
        if (richText == null) {
            return "";
        }
        if (richText instanceof TL_iv.textFixed) {
            return B(((TL_iv.textFixed) richText).text);
        }
        if (richText instanceof TL_iv.textItalic) {
            return B(((TL_iv.textItalic) richText).text);
        }
        if (richText instanceof TL_iv.textBold) {
            return B(((TL_iv.textBold) richText).text);
        }
        if (richText instanceof TL_iv.textUnderline) {
            return B(((TL_iv.textUnderline) richText).text);
        }
        if (richText instanceof TL_iv.textStrike) {
            return B(((TL_iv.textStrike) richText).text);
        }
        if (richText instanceof TL_iv.textEmail) {
            return B(((TL_iv.textEmail) richText).text);
        }
        if (richText instanceof TL_iv.textUrl) {
            return B(((TL_iv.textUrl) richText).text);
        }
        if (richText instanceof TL_iv.textPlain) {
            return ((TL_iv.textPlain) richText).text;
        }
        if (richText instanceof TL_iv.textAnchor) {
            return B(((TL_iv.textAnchor) richText).text);
        }
        if (richText instanceof TL_iv.textEmpty) {
            return "";
        }
        if (!(richText instanceof TL_iv.textConcat)) {
            return richText instanceof TL_iv.textSubscript ? B(((TL_iv.textSubscript) richText).text) : richText instanceof TL_iv.textSuperscript ? B(((TL_iv.textSuperscript) richText).text) : richText instanceof TL_iv.textMarked ? B(((TL_iv.textMarked) richText).text) : richText instanceof TL_iv.textPhone ? B(((TL_iv.textPhone) richText).text) : "";
        }
        StringBuilder sb2 = new StringBuilder();
        int size = richText.texts.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append(B(richText.texts.get(i10)));
        }
        return sb2;
    }

    public static CharSequence C(v70 v70Var, TLRPC.WebPage webPage, View view, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock, int i10) {
        TextPaint E;
        if (richText2 == null) {
            return null;
        }
        if (richText2 instanceof TL_iv.textFixed) {
            return C(v70Var, webPage, view, richText, ((TL_iv.textFixed) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textItalic) {
            return C(v70Var, webPage, view, richText, ((TL_iv.textItalic) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textBold) {
            return C(v70Var, webPage, view, richText, ((TL_iv.textBold) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textUnderline) {
            return C(v70Var, webPage, view, richText, ((TL_iv.textUnderline) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textStrike) {
            return C(v70Var, webPage, view, richText, ((TL_iv.textStrike) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textEmail) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C(v70Var, webPage, view, richText, ((TL_iv.textEmail) richText2).text, pageBlock, i10));
            MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder.length() != 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.j01((metricAffectingSpanArr == null || metricAffectingSpanArr.length == 0) ? E(v70Var, richText, richText2, pageBlock) : null, "mailto:" + F(richText2)), 0, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        long j3 = 0;
        if (richText2 instanceof TL_iv.textUrl) {
            TL_iv.textUrl texturl = (TL_iv.textUrl) richText2;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(C(v70Var, webPage, view, richText, texturl.text, pageBlock, i10));
            MetricAffectingSpan[] metricAffectingSpanArr2 = (MetricAffectingSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), MetricAffectingSpan.class);
            E = (metricAffectingSpanArr2 == null || metricAffectingSpanArr2.length == 0) ? E(v70Var, richText, richText2, pageBlock) : null;
            Object k01Var = texturl.webpage_id != 0 ? new org.telegram.ui.Components.k01(E, F(richText2)) : new org.telegram.ui.Components.j01(E, F(richText2));
            if (spannableStringBuilder2.length() != 0) {
                spannableStringBuilder2.setSpan(k01Var, 0, spannableStringBuilder2.length(), 33);
            }
            return spannableStringBuilder2;
        }
        if (richText2 instanceof TL_iv.textPlain) {
            return ((TL_iv.textPlain) richText2).text;
        }
        if (richText2 instanceof TL_iv.textAnchor) {
            TL_iv.textAnchor textanchor = (TL_iv.textAnchor) richText2;
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(C(v70Var, webPage, view, richText, textanchor.text, pageBlock, i10));
            String str = textanchor.name;
            org.telegram.ui.Components.f5 f5Var = new org.telegram.ui.Components.f5();
            f5Var.a = str.toLowerCase();
            spannableStringBuilder3.setSpan(f5Var, 0, spannableStringBuilder3.length(), 17);
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
                TL_iv.RichText A = A(richText3);
                boolean z10 = i10 >= 0 && (richText3 instanceof TL_iv.textUrl) && ((TL_iv.textUrl) richText3).webpage_id != j3;
                if (z10 && spannableStringBuilder4.length() != 0 && spannableStringBuilder4.charAt(spannableStringBuilder4.length() - 1) != '\n') {
                    spannableStringBuilder4.append((CharSequence) " ");
                    spannableStringBuilder4.setSpan(new org.telegram.ui.Cells.s9(), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                }
                CharSequence C = C(v70Var, webPage, view, richText, richText3, pageBlock, i10);
                int D = D(A);
                int length = spannableStringBuilder4.length();
                spannableStringBuilder4.append(C);
                if (D != 0 && !(C instanceof SpannableStringBuilder)) {
                    if ((D & 8) != 0 || (D & 512) != 0) {
                        String F = F(richText3);
                        if (F == null) {
                            F = F(richText);
                        }
                        Object k01Var2 = (D & 512) != 0 ? new org.telegram.ui.Components.k01(E(v70Var, richText, A, pageBlock), F) : new org.telegram.ui.Components.j01(E(v70Var, richText, A, pageBlock), F);
                        if (length != spannableStringBuilder4.length()) {
                            spannableStringBuilder4.setSpan(k01Var2, length, spannableStringBuilder4.length(), 33);
                        }
                    } else if (length != spannableStringBuilder4.length()) {
                        TextPaint E2 = E(v70Var, richText, A, pageBlock);
                        org.telegram.ui.Components.i01 i01Var = new org.telegram.ui.Components.i01();
                        i01Var.a = E2;
                        spannableStringBuilder4.setSpan(i01Var, length, spannableStringBuilder4.length(), 33);
                    }
                }
                if (z10 && i11 != size - 1) {
                    spannableStringBuilder4.append((CharSequence) " ");
                    spannableStringBuilder4.setSpan(new org.telegram.ui.Cells.s9(), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                }
                i11++;
                j3 = 0;
            }
            return spannableStringBuilder4;
        }
        if (richText2 instanceof TL_iv.textSubscript) {
            return C(v70Var, webPage, view, richText, ((TL_iv.textSubscript) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textSuperscript) {
            return C(v70Var, webPage, view, richText, ((TL_iv.textSuperscript) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textMarked) {
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(C(v70Var, webPage, view, richText, ((TL_iv.textMarked) richText2).text, pageBlock, i10));
            MetricAffectingSpan[] metricAffectingSpanArr3 = (MetricAffectingSpan[]) spannableStringBuilder5.getSpans(0, spannableStringBuilder5.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder5.length() != 0) {
                E = (metricAffectingSpanArr3 == null || metricAffectingSpanArr3.length == 0) ? E(v70Var, richText, richText2, pageBlock) : null;
                org.telegram.ui.Components.h01 h01Var = new org.telegram.ui.Components.h01();
                h01Var.a = E;
                spannableStringBuilder5.setSpan(h01Var, 0, spannableStringBuilder5.length(), 33);
            }
            return spannableStringBuilder5;
        }
        if (richText2 instanceof TL_iv.textSpoiler) {
            SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(C(v70Var, webPage, view, richText, ((TL_iv.textSpoiler) richText2).text, pageBlock, i10));
            if (spannableStringBuilder6.length() != 0) {
                org.telegram.ui.Components.n01 n01Var = new org.telegram.ui.Components.n01();
                n01Var.a |= 256;
                spannableStringBuilder6.setSpan(new org.telegram.ui.Components.o01(n01Var, 0), 0, spannableStringBuilder6.length(), 33);
            }
            return spannableStringBuilder6;
        }
        if (richText2 instanceof TL_iv.textPhone) {
            SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(C(v70Var, webPage, view, richText, ((TL_iv.textPhone) richText2).text, pageBlock, i10));
            MetricAffectingSpan[] metricAffectingSpanArr4 = (MetricAffectingSpan[]) spannableStringBuilder7.getSpans(0, spannableStringBuilder7.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder7.length() != 0) {
                spannableStringBuilder7.setSpan(new org.telegram.ui.Components.j01((metricAffectingSpanArr4 == null || metricAffectingSpanArr4.length == 0) ? E(v70Var, richText, richText2, pageBlock) : null, "tel:" + F(richText2)), 0, spannableStringBuilder7.length(), 33);
            }
            return spannableStringBuilder7;
        }
        if (richText2 instanceof TL_iv.textImage) {
            TL_iv.textImage textimage = (TL_iv.textImage) richText2;
            TLRPC.Document a2 = f4.a(webPage, textimage.document_id);
            TLRPC.Photo e7 = f4.e(webPage, textimage.photo_id);
            if (a2 != null) {
                SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder("*");
                int dp = AndroidUtilities.dp(textimage.w);
                int dp2 = AndroidUtilities.dp(textimage.h);
                int abs = Math.abs(i10);
                if (dp > abs) {
                    dp2 = (int) (dp2 * (abs / dp));
                    dp = abs;
                }
                if (view != null) {
                    int i12 = org.telegram.ui.ActionBar.j6.d6;
                    ((i4) v70Var).getClass();
                    boolean z11 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, i12, false)) <= 0.705f;
                    org.telegram.ui.Components.g01 g01Var = new org.telegram.ui.Components.g01();
                    Locale locale = Locale.US;
                    String str2 = dp + "_" + dp2 + "_i";
                    g01Var.b = dp;
                    g01Var.c = dp2;
                    boolean z12 = z11;
                    ImageReceiver imageReceiver = new ImageReceiver(view);
                    g01Var.a = imageReceiver;
                    imageReceiver.setInvalidateAll(true);
                    if (z12) {
                        imageReceiver.setDelegate(new org.telegram.ui.Components.wo0(7));
                    }
                    imageReceiver.setImage(ImageLocation.getForDocument(a2), str2, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(a2.thumbs, 90), a2), str2, -1L, null, webPage, 1);
                    spannableStringBuilder8.setSpan(g01Var, 0, spannableStringBuilder8.length(), 33);
                }
                return spannableStringBuilder8;
            }
            if (e7 instanceof org.telegram.ui.web.i2) {
                org.telegram.ui.web.i2 i2Var = (org.telegram.ui.web.i2) e7;
                SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder("*");
                int dp3 = AndroidUtilities.dp(textimage.w);
                int dp4 = AndroidUtilities.dp(textimage.h);
                int abs2 = Math.abs(i10);
                if (dp3 > abs2) {
                    dp4 = (int) (dp4 * (abs2 / dp3));
                    dp3 = abs2;
                }
                if (view != null) {
                    org.telegram.ui.Components.g01 g01Var2 = new org.telegram.ui.Components.g01();
                    g01Var2.b = dp3;
                    g01Var2.c = dp4;
                    ImageReceiver imageReceiver2 = new ImageReceiver(view);
                    g01Var2.a = imageReceiver2;
                    imageReceiver2.setInvalidateAll(true);
                    org.telegram.ui.web.j2.g(i2Var, imageReceiver2, new org.telegram.ui.Components.ue(9));
                    spannableStringBuilder9.setSpan(g01Var2, 0, spannableStringBuilder9.length(), 33);
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
                ji.s a10 = ji.s.a(textmath.source, AndroidUtilities.dp(20.0f), true);
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
                int i15 = org.telegram.ui.ActionBar.j6.G6;
                ((i4) v70Var).getClass();
                spannableStringBuilder10.setSpan(new org.telegram.ui.Components.g01(view, bitmap, i13, i14, org.telegram.ui.ActionBar.j6.w0(null, i15, false), textmath.depth), 0, spannableStringBuilder10.length(), 33);
                String str3 = textmath.source;
                if (str3 != null && !str3.isEmpty()) {
                    spannableStringBuilder10.setSpan(new org.telegram.ui.Cells.w9(textmath.source), 0, spannableStringBuilder10.length(), 33);
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

    public static int D(TL_iv.RichText richText) {
        if (richText instanceof TL_iv.textFixed) {
            return D(richText.parentRichText) | 4;
        }
        if (richText instanceof TL_iv.textItalic) {
            return D(richText.parentRichText) | 2;
        }
        if (richText instanceof TL_iv.textBold) {
            return D(richText.parentRichText) | 1;
        }
        if (richText instanceof TL_iv.textUnderline) {
            return D(richText.parentRichText) | 16;
        }
        if (richText instanceof TL_iv.textStrike) {
            return D(richText.parentRichText) | 32;
        }
        if (richText instanceof TL_iv.textEmail) {
            return D(richText.parentRichText) | 8;
        }
        if (richText instanceof TL_iv.textPhone) {
            return D(richText.parentRichText) | 8;
        }
        if (richText instanceof TL_iv.textUrl) {
            return ((TL_iv.textUrl) richText).webpage_id != 0 ? D(richText.parentRichText) | 512 : D(richText.parentRichText) | 8;
        }
        if (richText instanceof TL_iv.textSubscript) {
            return D(richText.parentRichText) | 128;
        }
        if (richText instanceof TL_iv.textSuperscript) {
            return D(richText.parentRichText) | 256;
        }
        if (richText instanceof TL_iv.textMarked) {
            return D(richText.parentRichText) | 64;
        }
        if (richText != null) {
            return D(richText.parentRichText);
        }
        return 0;
    }

    public static TextPaint E(v70 v70Var, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock) {
        int b10;
        int dp;
        int dp2;
        int dp3;
        int dp4;
        int dp5;
        int dp6;
        int dp7;
        int D = D(richText2);
        int dp8 = AndroidUtilities.dp(14.0f);
        i4 i4Var = (i4) v70Var;
        i4Var.getClass();
        q3 q3Var = f1;
        q3Var.getClass();
        SparseArray sparseArray = q3Var.x;
        SparseArray sparseArray2 = q3Var.w;
        SparseArray sparseArray3 = q3Var.t;
        SparseArray sparseArray4 = q3Var.c;
        SparseArray sparseArray5 = q3Var.b;
        int dp9 = AndroidUtilities.dp(SharedConfig.ivFontSize - 16);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            TL_iv.RichText richText3 = ((TL_iv.pageBlockPhoto) pageBlock).caption.text;
            if (richText3 == richText2 || richText3 == richText) {
                dp7 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            } else {
                dp7 = AndroidUtilities.dp(12.0f);
            }
            dp8 = dp7;
            b10 = v70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockMap) {
            TL_iv.RichText richText4 = ((TL_iv.pageBlockMap) pageBlock).caption.text;
            if (richText4 == richText2 || richText4 == richText) {
                dp6 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            } else {
                dp6 = AndroidUtilities.dp(12.0f);
            }
            dp8 = dp6;
            b10 = v70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockTitle) {
            sparseArray4 = q3Var.d;
            dp8 = AndroidUtilities.dp(23.0f);
            b10 = v70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockKicker) {
            sparseArray4 = q3Var.e;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = v70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockAuthorDate) {
            sparseArray4 = q3Var.o;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = v70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockFooter) {
            sparseArray4 = q3Var.p;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = v70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockSubtitle) {
            sparseArray4 = q3Var.g;
            dp8 = AndroidUtilities.dp(20.0f);
            b10 = v70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
            sparseArray4 = q3Var.f;
            dp8 = AndroidUtilities.dp(20.0f);
            b10 = v70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
            sparseArray4 = q3Var.h;
            dp8 = AndroidUtilities.dp(17.0f);
            b10 = v70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            sparseArray4 = q3Var.i;
            dp8 = AndroidUtilities.dp(18.0f);
            b10 = v70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            sparseArray4 = q3Var.j;
            dp8 = AndroidUtilities.dp(16.0f);
            b10 = v70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            sparseArray4 = q3Var.k;
            dp8 = AndroidUtilities.dp(15.0f);
            b10 = v70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            sparseArray4 = q3Var.l;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = v70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            sparseArray4 = q3Var.m;
            dp8 = AndroidUtilities.dp(13.0f);
            b10 = v70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            sparseArray4 = q3Var.n;
            dp8 = AndroidUtilities.dp(12.0f);
            b10 = v70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
            if (pageblockblockquote.text == richText) {
                dp8 = AndroidUtilities.dp(15.0f);
                b10 = v70Var.b();
                sparseArray4 = sparseArray3;
            } else {
                if (pageblockblockquote.caption == richText) {
                    dp8 = AndroidUtilities.dp(14.0f);
                    b10 = v70Var.a();
                    sparseArray3 = sparseArray5;
                    sparseArray4 = sparseArray3;
                }
                b10 = -65536;
                sparseArray3 = null;
                sparseArray4 = sparseArray3;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
            if (pageblockpullquote.text == richText) {
                dp8 = AndroidUtilities.dp(15.0f);
                b10 = v70Var.b();
                sparseArray4 = sparseArray3;
            } else {
                if (pageblockpullquote.caption == richText) {
                    dp8 = AndroidUtilities.dp(14.0f);
                    b10 = v70Var.a();
                    sparseArray3 = sparseArray5;
                    sparseArray4 = sparseArray3;
                }
                b10 = -65536;
                sparseArray3 = null;
                sparseArray4 = sparseArray3;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            sparseArray4 = q3Var.s;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = v70Var.b();
            D |= 4;
        } else if (pageBlock instanceof TL_iv.pageBlockParagraph) {
            sparseArray4 = q3Var.q;
            dp8 = AndroidUtilities.dp(16.0f);
            b10 = v70Var.b();
        } else if (L(pageBlock)) {
            sparseArray4 = q3Var.r;
            dp8 = AndroidUtilities.dp(16.0f);
            b10 = v70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockEmbed) {
            TL_iv.RichText richText5 = ((TL_iv.pageBlockEmbed) pageBlock).caption.text;
            if (richText5 == richText2 || richText5 == richText) {
                dp5 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            } else {
                dp5 = AndroidUtilities.dp(12.0f);
            }
            dp8 = dp5;
            b10 = v70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.RichText richText6 = ((TL_iv.pageBlockSlideshow) pageBlock).caption.text;
            if (richText6 == richText2 || richText6 == richText) {
                dp4 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            } else {
                dp4 = AndroidUtilities.dp(12.0f);
            }
            dp8 = dp4;
            b10 = v70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
            TL_iv.RichText richText7 = ((TL_iv.pageBlockCollage) pageBlock).caption.text;
            if (richText7 == richText2 || richText7 == richText) {
                dp3 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            } else {
                dp3 = AndroidUtilities.dp(12.0f);
            }
            dp8 = dp3;
            b10 = v70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockEmbedPost) {
            TL_iv.PageCaption pageCaption = ((TL_iv.pageBlockEmbedPost) pageBlock).caption;
            if (richText2 == pageCaption.text) {
                dp8 = AndroidUtilities.dp(14.0f);
                b10 = v70Var.a();
                sparseArray4 = sparseArray5;
            } else if (richText2 == pageCaption.credit) {
                dp8 = AndroidUtilities.dp(12.0f);
                b10 = v70Var.a();
            } else {
                if (richText2 != null) {
                    sparseArray4 = q3Var.u;
                    dp8 = AndroidUtilities.dp(14.0f);
                    b10 = v70Var.b();
                }
                b10 = -65536;
                sparseArray4 = null;
            }
        } else {
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                if (richText2 == ((TL_iv.pageBlockVideo) pageBlock).caption.text) {
                    dp2 = AndroidUtilities.dp(14.0f);
                    sparseArray = sparseArray2;
                } else {
                    dp2 = AndroidUtilities.dp(12.0f);
                }
                dp8 = dp2;
                b10 = v70Var.b();
            } else if (pageBlock instanceof TL_iv.pageBlockAudio) {
                if (richText2 == ((TL_iv.pageBlockAudio) pageBlock).caption.text) {
                    dp = AndroidUtilities.dp(14.0f);
                    sparseArray = sparseArray2;
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                }
                dp8 = dp;
                b10 = v70Var.b();
            } else if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                sparseArray4 = q3Var.y;
                dp8 = AndroidUtilities.dp(15.0f);
                b10 = v70Var.a();
            } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                sparseArray4 = q3Var.z;
                dp8 = AndroidUtilities.dp(15.0f);
                b10 = v70Var.b();
            } else {
                if (pageBlock instanceof TL_iv.pageBlockTable) {
                    sparseArray4 = q3Var.A;
                    dp8 = AndroidUtilities.dp(15.0f);
                    b10 = v70Var.b();
                }
                b10 = -65536;
                sparseArray4 = null;
            }
            sparseArray4 = sparseArray;
        }
        int i10 = D & 256;
        if (i10 != 0 || (D & 128) != 0) {
            dp8 -= AndroidUtilities.dp(4.0f);
        }
        if (sparseArray4 == null) {
            if (q3Var.a == null) {
                TextPaint textPaint = new TextPaint(1);
                q3Var.a = textPaint;
                textPaint.setColor(-65536);
            }
            q3Var.a.setTextSize(AndroidUtilities.dp(14.0f));
            return q3Var.a;
        }
        TextPaint textPaint2 = (TextPaint) sparseArray4.get(D);
        if (textPaint2 == null) {
            textPaint2 = new TextPaint(1);
            if ((D & 4) != 0) {
                textPaint2.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
            } else if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                textPaint2.setTypeface(AndroidUtilities.bold());
            } else if (v70Var.a != 1 && !(pageBlock instanceof TL_iv.pageBlockTitle) && !(pageBlock instanceof TL_iv.pageBlockKicker) && !(pageBlock instanceof TL_iv.pageBlockHeader) && !(pageBlock instanceof TL_iv.pageBlockSubtitle) && !(pageBlock instanceof TL_iv.pageBlockSubheader) && !K(pageBlock)) {
                int i11 = D & 1;
                if (i11 != 0 && (D & 2) != 0) {
                    textPaint2.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM_ITALIC));
                } else if (i11 != 0) {
                    textPaint2.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                } else if ((D & 2) != 0) {
                    textPaint2.setTypeface(AndroidUtilities.getTypeface("fonts/ritalic.ttf"));
                }
            } else if ((pageBlock instanceof TL_iv.pageBlockTitle) || (pageBlock instanceof TL_iv.pageBlockHeader) || (pageBlock instanceof TL_iv.pageBlockSubtitle) || (pageBlock instanceof TL_iv.pageBlockSubheader) || K(pageBlock)) {
                textPaint2.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
            } else {
                int i12 = D & 1;
                if (i12 != 0 && (D & 2) != 0) {
                    textPaint2.setTypeface(Typeface.create("serif", 3));
                } else if (i12 != 0) {
                    textPaint2.setTypeface(Typeface.create("serif", 1));
                } else if ((D & 2) != 0) {
                    textPaint2.setTypeface(Typeface.create("serif", 2));
                } else {
                    textPaint2.setTypeface(Typeface.create("serif", 0));
                }
            }
            if ((D & 32) != 0) {
                textPaint2.setFlags(textPaint2.getFlags() | 16);
            }
            if ((D & 16) != 0) {
                textPaint2.setFlags(textPaint2.getFlags() | 8);
            }
            if ((D & 8) != 0 || (D & 512) != 0) {
                textPaint2.setFlags(textPaint2.getFlags());
                i4Var.getClass();
                b10 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false);
            }
            if (i10 != 0) {
                textPaint2.baselineShift -= AndroidUtilities.dp(6.0f);
            } else if ((D & 128) != 0) {
                textPaint2.baselineShift = AndroidUtilities.dp(2.0f) + textPaint2.baselineShift;
            }
            textPaint2.setColor(b10);
            sparseArray4.put(D, textPaint2);
        }
        textPaint2.setTextSize(dp8 + dp9);
        return textPaint2;
    }

    public static String F(TL_iv.RichText richText) {
        if (richText instanceof TL_iv.textFixed) {
            return F(((TL_iv.textFixed) richText).text);
        }
        if (richText instanceof TL_iv.textItalic) {
            return F(((TL_iv.textItalic) richText).text);
        }
        if (richText instanceof TL_iv.textBold) {
            return F(((TL_iv.textBold) richText).text);
        }
        if (richText instanceof TL_iv.textUnderline) {
            return F(((TL_iv.textUnderline) richText).text);
        }
        if (richText instanceof TL_iv.textStrike) {
            return F(((TL_iv.textStrike) richText).text);
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

    public static boolean I() {
        return c1 != null;
    }

    public static boolean K(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
    }

    public static boolean L(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof y3) || (pageBlock instanceof a4);
    }

    public static boolean O(w3 w3Var) {
        boolean z10;
        TL_iv.PageBlock z11 = z(w3Var.a);
        if (z11 instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) z11;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                return true;
            }
        } else if (z11 instanceof w3) {
            w3 w3Var2 = (w3) z11;
            TL_iv.PageBlock z12 = z(w3Var2.b);
            if (z12 instanceof TL_iv.pageBlockDetails) {
                TL_iv.pageBlockDetails pageblockdetails2 = (TL_iv.pageBlockDetails) z12;
                if (!pageblockdetails2.open) {
                    pageblockdetails2.open = true;
                    z10 = true;
                    if (!O(w3Var2) || z10) {
                        return true;
                    }
                }
            }
            z10 = false;
            if (!O(w3Var2)) {
            }
            return true;
        }
        return false;
    }

    public static void T(v70 v70Var) {
        if (v70Var.b == null && v70Var.f == null) {
            return;
        }
        View view = v70Var.f;
        v70Var.c.d(true);
        v70Var.b = null;
        v70Var.d = null;
        v70Var.f = null;
        if (view != null) {
            view.invalidate();
        }
    }

    public static /* synthetic */ WindowInsets e(WindowInsets windowInsets) {
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public static void f(String str, int i10, FrameLayout frameLayout, v3 v3Var, org.telegram.ui.ActionBar.f6 f6Var) {
        String v = org.telegram.ui.web.d1.v(str);
        long clientUserId = UserConfig.getInstance(i10).getClientUserId();
        SendMessagesHelper.getInstance(i10).sendMessage(SendMessagesHelper.SendMessageParams.of(v, clientUserId));
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_message.peer_id = tL_peerUser;
        tL_peerUser.user_id = clientUserId;
        TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
        tL_message.from_id = tL_peerUser2;
        tL_peerUser2.user_id = clientUserId;
        tL_message.message = v;
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
        tL_message.media = tL_messageMediaWebPage;
        tL_messageMediaWebPage.webpage = new TLRPC.TL_webPage();
        TLRPC.WebPage webPage = tL_message.media.webpage;
        webPage.url = v;
        webPage.display_url = v;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.bookmarkAdded, new MessageObject(i10, tL_message, false, false));
        new org.telegram.ui.Components.yc(frameLayout, f6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.WebBookmarkedToast), new bi.g(v3Var, clientUserId, 18))).k(true);
    }

    public static void g0(i4 i4Var) {
        TextPaint textPaint = m1;
        if (textPaint != null) {
            textPaint.setColor(i4Var.b());
        }
        TextPaint textPaint2 = n1;
        if (textPaint2 != null) {
            textPaint2.setColor(i4Var.b());
        }
        TextPaint textPaint3 = g1;
        if (textPaint3 != null) {
            textPaint3.setColor(i4Var.b());
        }
        TextPaint textPaint4 = i1;
        if (textPaint4 != null) {
            textPaint4.setColor(i4Var.b());
        }
        TextPaint textPaint5 = j1;
        if (textPaint5 != null) {
            textPaint5.setColor(-1);
        }
        TextPaint textPaint6 = k1;
        if (textPaint6 != null) {
            textPaint6.setColor(i4Var.b());
        }
        TextPaint textPaint7 = l1;
        if (textPaint7 != null) {
            textPaint7.setColor(i4Var.a());
        }
        TextPaint textPaint8 = h1;
        if (textPaint8 != null) {
            textPaint8.setColor(i4Var.a());
        }
        r(i4Var, true);
        q3 q3Var = f1;
        q3.a(i4Var, q3Var.d);
        q3.a(i4Var, q3Var.e);
        q3.a(i4Var, q3Var.g);
        q3.a(i4Var, q3Var.f);
        q3.a(i4Var, q3Var.h);
        q3.a(i4Var, q3Var.i);
        q3.a(i4Var, q3Var.j);
        q3.a(i4Var, q3Var.k);
        q3.a(i4Var, q3Var.l);
        q3.a(i4Var, q3Var.m);
        q3.a(i4Var, q3Var.n);
        q3.a(i4Var, q3Var.t);
        q3.a(i4Var, q3Var.s);
        q3.a(i4Var, q3Var.q);
        q3.a(i4Var, q3Var.r);
        q3.a(i4Var, q3Var.u);
        q3.a(i4Var, q3Var.w);
        q3.a(i4Var, q3Var.x);
        q3.a(i4Var, q3Var.b);
        q3.a(i4Var, q3Var.c);
        q3.a(i4Var, q3Var.o);
        q3.a(i4Var, q3Var.p);
        q3.a(i4Var, q3Var.v);
        q3.a(i4Var, q3Var.y);
        q3.a(i4Var, q3Var.z);
        q3.a(i4Var, q3Var.A);
    }

    public static SpannableStringBuilder i(int i10, CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (charSequence != null) {
            spannableStringBuilder.append(charSequence);
        }
        if (spannableStringBuilder.length() > 0) {
            spannableStringBuilder.append((CharSequence) ", ");
        }
        spannableStringBuilder.append((CharSequence) LocaleController.getString(i10));
        return spannableStringBuilder;
    }

    public static CharSequence j(v70 v70Var, g4 g4Var, b3 b3Var) {
        StaticLayout staticLayout;
        if (b3Var == null || (staticLayout = b3Var.d) == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = b3Var.y;
        if (spannableStringBuilder != null) {
            return spannableStringBuilder;
        }
        CharSequence text = staticLayout.getText();
        if (!(text instanceof Spannable)) {
            return text;
        }
        Spannable spannable = (Spannable) text;
        org.telegram.ui.Components.j01[] j01VarArr = (org.telegram.ui.Components.j01[]) spannable.getSpans(0, spannable.length(), org.telegram.ui.Components.j01.class);
        CharSequence charSequence = text;
        if (j01VarArr != null) {
            charSequence = text;
            if (j01VarArr.length != 0) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannable);
                for (org.telegram.ui.Components.j01 j01Var : j01VarArr) {
                    int spanStart = spannableStringBuilder2.getSpanStart(j01Var);
                    int spanEnd = spannableStringBuilder2.getSpanEnd(j01Var);
                    if (spanStart >= 0 && spanEnd > spanStart) {
                        spannableStringBuilder2.setSpan(new n0(v70Var, g4Var, j01Var, 0), spanStart, spanEnd, 33);
                    }
                }
                b3Var.y = spannableStringBuilder2;
                charSequence = spannableStringBuilder2;
            }
        }
        return charSequence;
    }

    public static TL_iv.PageBlock j0(TL_iv.PageBlock pageBlock, w3 w3Var) {
        if (pageBlock instanceof y3) {
            y3 y3Var = (y3) pageBlock;
            y3 y3Var2 = new y3();
            y3Var2.a = y3Var.a;
            y3Var2.b = y3Var.b;
            y3Var2.c = y3Var.c;
            y3Var2.d = j0(y3Var.d, w3Var);
            return y3Var2;
        }
        if (!(pageBlock instanceof a4)) {
            return w3Var;
        }
        a4 a4Var = (a4) pageBlock;
        a4 a4Var2 = new a4();
        a4Var2.a = a4Var.a;
        a4Var2.b = a4Var.b;
        a4Var2.c = a4Var.c;
        a4Var2.d = j0(a4Var.d, w3Var);
        return a4Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x0252, code lost:
    
        if (r0.isShowing() == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x018b, code lost:
    
        r17 = new android.graphics.Path();
        r0 = r29.I;
        r5 = r0.size();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0197, code lost:
    
        if (r6 >= r5) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0199, code lost:
    
        r8 = r0.get(r6);
        r6 = r6 + 1;
        r8 = ((wh.h) r8).getBounds();
        r17.addRect(r8.left, r8.top, r8.right, r8.bottom, android.graphics.Path.Direction.CW);
        r17 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01c3, code lost:
    
        r17.computeBounds(new android.graphics.RectF(), false);
        r0 = (float) java.lang.Math.sqrt((r0.height() * r0.height()) + (r0.width() * r0.width()));
        ((wh.h) r29.I.get(0)).q = new org.telegram.ui.c0(r28, r29);
        r3 = r29.I;
        r5 = r3.size();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0200, code lost:
    
        if (r6 >= r5) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0202, code lost:
    
        r8 = r3.get(r6);
        r6 = r6 + 1;
        ((wh.h) r8).j(r7, r4, r0, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0210, code lost:
    
        r28.invalidate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0217, code lost:
    
        if (r28.getParent() == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0219, code lost:
    
        r28.getParent().requestDisallowInterceptTouchEvent(true);
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0262  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean l(v70 v70Var, g4 g4Var, MotionEvent motionEvent, View view, b3 b3Var, int i10, int i11) {
        org.telegram.ui.Cells.q9 q9Var;
        i4 i4Var;
        Object obj;
        i4 i4Var2;
        org.telegram.ui.Cells.q9 q9Var2;
        org.telegram.ui.Components.o01[] o01VarArr;
        boolean z10 = ((i4) v70Var).v0 == null;
        org.telegram.ui.Components.a90 a90Var = v70Var.c;
        if (!z10 || view == null) {
            return false;
        }
        i4 i4Var3 = (i4) v70Var;
        if (view.getTag() == null || view.getTag() != "bottomSheet" || (q9Var = i4Var3.P0) == null) {
            q9Var = i4Var3.O0;
        }
        if (q9Var != null && !q9Var.g0(view)) {
            return false;
        }
        v70Var.f = view;
        if (b3Var != null) {
            StaticLayout staticLayout = b3Var.d;
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
                    v70Var.d = b3Var;
                    v70Var.e = i11;
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
                                org.telegram.ui.Components.j01[] j01VarArr = (org.telegram.ui.Components.j01[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, org.telegram.ui.Components.j01.class);
                                if (j01VarArr == null || j01VarArr.length <= 0) {
                                    i4Var = i4Var3;
                                    obj = "bottomSheet";
                                } else {
                                    org.telegram.ui.Components.j01 j01Var = j01VarArr[0];
                                    int spanStart = spannable.getSpanStart(j01Var);
                                    i4Var = i4Var3;
                                    obj = "bottomSheet";
                                    int spanEnd = spannable.getSpanEnd(j01Var);
                                    int i15 = 1;
                                    while (i15 < j01VarArr.length) {
                                        try {
                                            org.telegram.ui.Components.j01 j01Var2 = j01VarArr[i15];
                                            org.telegram.ui.Components.j01[] j01VarArr2 = j01VarArr;
                                            int spanStart2 = spannable.getSpanStart(j01Var2);
                                            int i16 = i15;
                                            int spanEnd2 = spannable.getSpanEnd(j01Var2);
                                            if (spanStart > spanStart2 || spanEnd2 > spanEnd) {
                                                spanStart = spanStart2;
                                                j01Var = j01Var2;
                                                spanEnd = spanEnd2;
                                            }
                                            i15 = i16 + 1;
                                            j01VarArr = j01VarArr2;
                                        } catch (Exception e7) {
                                            e = e7;
                                            FileLog.e(e);
                                            if (motionEvent.getAction() == 0) {
                                            }
                                            if (motionEvent.getAction() != 0) {
                                            }
                                            if (!(view instanceof m1)) {
                                            }
                                        }
                                    }
                                    org.telegram.ui.Components.e90 e90Var = v70Var.b;
                                    if (e90Var == null || e90Var.i != j01Var) {
                                        if (e90Var != null) {
                                            a90Var.k(e90Var, true);
                                        }
                                        org.telegram.ui.Components.e90 e90Var2 = new org.telegram.ui.Components.e90(j01Var, null, f11, y3, 0);
                                        v70Var.b = e90Var2;
                                        e90Var2.d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.K6, false) & 872415231);
                                        a90Var.a(v70Var.b, v70Var.d);
                                        try {
                                            org.telegram.ui.Components.x80 b10 = v70Var.b.b();
                                            b10.d(staticLayout, spanStart, 0.0f);
                                            TextPaint textPaint = j01Var.a;
                                            int i17 = textPaint != null ? textPaint.baselineShift : 0;
                                            b10.o = i17 != 0 ? i17 + AndroidUtilities.dp(i17 > 0 ? 5.0f : -2.0f) : 0;
                                            staticLayout.getSelectionPath(spanStart, spanEnd, b10);
                                            view.invalidate();
                                        } catch (Exception e10) {
                                            FileLog.e(e10);
                                        }
                                    }
                                }
                                ArrayList arrayList = b3Var.I;
                                if (arrayList != null && !arrayList.isEmpty() && (o01VarArr = (org.telegram.ui.Components.o01[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, org.telegram.ui.Components.o01.class)) != null) {
                                    int i18 = 0;
                                    while (true) {
                                        if (i18 >= o01VarArr.length) {
                                            break;
                                        }
                                        if (o01VarArr[i18].c()) {
                                            break;
                                        }
                                        i18++;
                                    }
                                }
                            }
                        } catch (Exception e11) {
                            e = e11;
                            i4Var = i4Var3;
                            obj = "bottomSheet";
                        }
                    }
                }
            } else {
                i4Var = i4Var3;
                obj = "bottomSheet";
                if (motionEvent.getAction() == 1) {
                    org.telegram.ui.Components.e90 e90Var3 = v70Var.b;
                    if (e90Var3 != null) {
                        v70Var.c(g4Var, (org.telegram.ui.Components.j01) e90Var3.i);
                        T(v70Var);
                    }
                } else if (motionEvent.getAction() == 3) {
                    org.telegram.ui.ActionBar.n1 n1Var = v70Var.H;
                    if (n1Var != null) {
                    }
                    T(v70Var);
                }
            }
            if (motionEvent.getAction() == 0) {
                float x11 = motionEvent.getX();
                float y10 = motionEvent.getY();
                i4Var2 = i4Var;
                if (!i4Var2.J0) {
                    i4Var2.J0 = true;
                    if (i4Var2.L0 == null) {
                        i4Var2.L0 = new a3(i4Var2, 1);
                    }
                    if (view.getTag() == null || view.getTag() != obj || (q9Var2 = i4Var2.P0) == null) {
                        i4Var2.O0.l0(view, (int) x11, (int) y10);
                    } else {
                        q9Var2.l0(view, (int) x11, (int) y10);
                    }
                    i4Var2.f0.postDelayed(i4Var2.L0, ViewConfiguration.getTapTimeout());
                    if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                        i4Var2.k();
                    }
                    return !(view instanceof m1) ? v70Var.b != null : v70Var.d != null;
                }
            } else {
                i4Var2 = i4Var;
            }
            if (motionEvent.getAction() != 0) {
                i4Var2.k();
            }
            if (!(view instanceof m1)) {
            }
        }
        i4Var = i4Var3;
        obj = "bottomSheet";
        if (motionEvent.getAction() == 0) {
        }
        if (motionEvent.getAction() != 0) {
        }
        if (!(view instanceof m1)) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:52|53|54|(3:58|(3:(2:62|63)(2:65|66)|64|59)|67)|69|70|71|(11:75|76|77|(5:80|(1:82)(1:92)|(3:(1:85)(1:89)|86|87)(2:90|91)|88|78)|93|94|96|97|(7:101|102|103|(5:106|(1:108)(1:118)|(3:(1:111)(1:115)|112|113)(2:116|117)|114|104)|119|120|121)|154|121)|158|96|97|(8:99|101|102|103|(1:104)|119|120|121)|154|121) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x036a A[Catch: Exception -> 0x0382, TryCatch #3 {Exception -> 0x0382, blocks: (B:103:0x0364, B:104:0x0367, B:106:0x036a, B:108:0x037f, B:112:0x038e, B:114:0x0396, B:120:0x039f), top: B:102:0x0364 }] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v8, types: [android.graphics.Path, org.telegram.ui.Components.x80] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.text.Layout, android.text.StaticLayout] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r9v11, types: [android.graphics.Path, org.telegram.ui.Components.x80] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b3 p(v70 v70Var, View view, CharSequence charSequence, TL_iv.RichText richText, int i10, int i11, TL_iv.PageBlock pageBlock, Layout.Alignment alignment, int i12, g4 g4Var) {
        v70 v70Var2;
        CharSequence C;
        TL_iv.RichText richText2;
        TL_iv.PageBlock pageBlock2;
        TextPaint E;
        ?? r42;
        CharSequence charSequence2;
        StaticLayout staticLayout;
        ?? r12;
        org.telegram.ui.Components.x80 x80Var;
        org.telegram.ui.Components.x80 x80Var2;
        View view2;
        TL_iv.RichText richText3;
        TL_iv.PageBlock pageBlock3;
        int i13;
        ?? r13;
        org.telegram.ui.Components.x80 x80Var3;
        org.telegram.ui.Components.h01[] h01VarArr;
        ?? x80Var4;
        int i14;
        org.telegram.ui.Components.k01[] k01VarArr;
        g4 g4Var2;
        if (charSequence == null && (richText == null || (richText instanceof TL_iv.textEmpty))) {
            return null;
        }
        int dp = i10 < 0 ? AndroidUtilities.dp(10.0f) : i10;
        if (charSequence != null) {
            v70Var2 = v70Var;
            richText2 = richText;
            C = charSequence;
            pageBlock2 = pageBlock;
        } else {
            v70Var2 = v70Var;
            C = C(v70Var2, g4Var != null ? g4Var.E : null, view, richText, richText, pageBlock, dp);
            richText2 = richText;
            pageBlock2 = pageBlock;
        }
        if (!TextUtils.isEmpty(C)) {
            int dp2 = AndroidUtilities.dp(SharedConfig.ivFontSize - 16);
            if ((pageBlock2 instanceof TL_iv.pageBlockEmbedPost) && richText2 == null) {
                if (((TL_iv.pageBlockEmbedPost) pageBlock2).author == charSequence) {
                    if (g1 == null) {
                        TextPaint textPaint = new TextPaint(1);
                        g1 = textPaint;
                        textPaint.setColor(v70Var2.b());
                    }
                    g1.setTextSize(AndroidUtilities.dp(15.0f) + dp2);
                    E = g1;
                } else {
                    if (h1 == null) {
                        TextPaint textPaint2 = new TextPaint(1);
                        h1 = textPaint2;
                        textPaint2.setColor(v70Var2.a());
                    }
                    h1.setTextSize(AndroidUtilities.dp(14.0f) + dp2);
                    E = h1;
                }
            } else if (pageBlock2 instanceof TL_iv.pageBlockChannel) {
                if (i1 == null) {
                    TextPaint textPaint3 = new TextPaint(1);
                    i1 = textPaint3;
                    textPaint3.setTypeface(AndroidUtilities.bold());
                    TextPaint textPaint4 = new TextPaint(1);
                    j1 = textPaint4;
                    textPaint4.setTypeface(AndroidUtilities.bold());
                }
                i1.setColor(v70Var2.b());
                i1.setTextSize(AndroidUtilities.dp(15.0f));
                j1.setColor(-1);
                j1.setTextSize(AndroidUtilities.dp(15.0f));
                E = (g4Var == null || g4Var.F == null) ? i1 : j1;
            } else if (pageBlock2 instanceof c4) {
                c4 c4Var = (c4) pageBlock2;
                if (charSequence == c4Var.a.articles.get(c4Var.b).title) {
                    if (k1 == null) {
                        TextPaint textPaint5 = new TextPaint(1);
                        k1 = textPaint5;
                        textPaint5.setTypeface(AndroidUtilities.bold());
                    }
                    k1.setColor(v70Var2.b());
                    k1.setTextSize(AndroidUtilities.dp(15.0f) + dp2);
                    E = k1;
                } else {
                    if (l1 == null) {
                        l1 = new TextPaint(1);
                    }
                    l1.setColor(v70Var2.a());
                    l1.setTextSize(AndroidUtilities.dp(14.0f) + dp2);
                    E = l1;
                }
            } else if (!L(pageBlock2) || charSequence == null) {
                E = E(v70Var2, richText2, richText2, pageBlock2);
            } else {
                if (m1 == null) {
                    TextPaint textPaint6 = new TextPaint(1);
                    m1 = textPaint6;
                    textPaint6.setColor(v70Var2.b());
                }
                if (n1 == null) {
                    TextPaint textPaint7 = new TextPaint(1);
                    n1 = textPaint7;
                    textPaint7.setColor(v70Var2.b());
                }
                m1.setTextSize(AndroidUtilities.dp(19.0f) + dp2);
                n1.setTextSize(AndroidUtilities.dp(16.0f) + dp2);
                E = (!(pageBlock2 instanceof y3) || ((y3) pageBlock2).c.a.ordered) ? n1 : m1;
            }
            CharSequence replaceEmoji = Emoji.replaceEmoji(C, E.getFontMetricsInt(), false, null, 2);
            if (i12 == 0) {
                TextPaint textPaint8 = E;
                r42 = 1;
                if (replaceEmoji.charAt(replaceEmoji.length() - 1) == '\n') {
                    replaceEmoji = replaceEmoji.subSequence(0, replaceEmoji.length() - 1);
                }
                if (pageBlock2 instanceof TL_iv.pageBlockPullquote) {
                    charSequence2 = replaceEmoji;
                    staticLayout = new StaticLayout(charSequence2, textPaint8, dp, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                } else {
                    charSequence2 = replaceEmoji;
                    staticLayout = new StaticLayout(charSequence2, textPaint8, dp, alignment, 1.0f, AndroidUtilities.dp(4.0f), false);
                }
                r12 = staticLayout;
                replaceEmoji = charSequence2;
            } else if (pageBlock2 instanceof TL_iv.pageBlockPullquote) {
                TextPaint textPaint9 = E;
                r42 = 1;
                r12 = org.telegram.ui.Components.iw0.c(replaceEmoji, textPaint9, dp, Layout.Alignment.ALIGN_CENTER, 0.0f, false, TextUtils.TruncateAt.END, dp, i12, true);
            } else {
                TextPaint textPaint10 = E;
                r42 = 1;
                r12 = org.telegram.ui.Components.iw0.c(replaceEmoji, textPaint10, dp, alignment, AndroidUtilities.dp(4.0f), false, TextUtils.TruncateAt.END, dp, i12, true);
            }
            if (r12 != 0) {
                CharSequence text = r12.getText();
                if (i11 >= 0 && !v70Var2.E.isEmpty() && v70Var2.F != null && (g4Var2 = ((i4) v70Var2).u0[0].c) != null) {
                    String lowerCase = replaceEmoji.toString().toLowerCase();
                    int i15 = 0;
                    while (true) {
                        int indexOf = lowerCase.indexOf(v70Var2.F, i15);
                        if (indexOf < 0) {
                            break;
                        }
                        int length = v70Var2.F.length() + indexOf;
                        if (indexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(indexOf - 1))) {
                            g4Var2.y.put(v70Var2.F + pageBlock2 + richText2 + indexOf, Integer.valueOf(r12.getLineTop(r12.getLineForOffset(indexOf)) + i11));
                        }
                        i15 = length;
                    }
                }
                boolean z10 = text instanceof Spanned;
                if (z10) {
                    Spanned spanned = (Spanned) text;
                    try {
                        org.telegram.ui.Components.f5[] f5VarArr = (org.telegram.ui.Components.f5[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.f5.class);
                        int lineCount = r12.getLineCount();
                        if (f5VarArr != null && f5VarArr.length > 0) {
                            for (int i16 = 0; i16 < f5VarArr.length; i16++) {
                                if (lineCount <= r42) {
                                    g4Var.n.put(f5VarArr[i16].a, Integer.valueOf(i11));
                                } else {
                                    HashMap hashMap = g4Var.n;
                                    org.telegram.ui.Components.f5 f5Var = f5VarArr[i16];
                                    hashMap.put(f5Var.a, Integer.valueOf(i11 + r12.getLineTop(r12.getLineForOffset(spanned.getSpanStart(f5Var)))));
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                    try {
                        k01VarArr = (org.telegram.ui.Components.k01[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.k01.class);
                    } catch (Exception unused2) {
                    }
                    if (k01VarArr != null && k01VarArr.length > 0) {
                        r13 = new org.telegram.ui.Components.x80(0);
                        try {
                            r13.n = false;
                            for (int i17 = 0; i17 < k01VarArr.length; i17++) {
                                int spanStart = spanned.getSpanStart(k01VarArr[i17]);
                                int spanEnd = spanned.getSpanEnd(k01VarArr[i17]);
                                r13.d(r12, spanStart, 0.0f);
                                TextPaint textPaint11 = k01VarArr[i17].a;
                                int i18 = textPaint11 != null ? textPaint11.baselineShift : 0;
                                r13.o = i18 != 0 ? i18 + AndroidUtilities.dp(i18 > 0 ? 5.0f : -2.0f) : 0;
                                r12.getSelectionPath(spanStart, spanEnd, r13);
                            }
                            r13.n = r42;
                        } catch (Exception unused3) {
                        }
                        h01VarArr = (org.telegram.ui.Components.h01[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.h01.class);
                        if (h01VarArr != null && h01VarArr.length > 0) {
                            x80Var4 = new org.telegram.ui.Components.x80(0);
                            try {
                                x80Var4.n = false;
                                for (i14 = 0; i14 < h01VarArr.length; i14++) {
                                    int spanStart2 = spanned.getSpanStart(h01VarArr[i14]);
                                    int spanEnd2 = spanned.getSpanEnd(h01VarArr[i14]);
                                    x80Var4.d(r12, spanStart2, 0.0f);
                                    TextPaint textPaint12 = h01VarArr[i14].a;
                                    int i19 = textPaint12 != null ? textPaint12.baselineShift : 0;
                                    x80Var4.o = i19 != 0 ? i19 + AndroidUtilities.dp(i19 > 0 ? 5.0f : -2.0f) : 0;
                                    r12.getSelectionPath(spanStart2, spanEnd2, x80Var4);
                                }
                                x80Var4.n = r42;
                                x80Var3 = x80Var4;
                            } catch (Exception unused4) {
                                x80Var3 = x80Var4;
                            }
                            x80Var = x80Var3;
                            x80Var2 = r13;
                        }
                        x80Var3 = null;
                        x80Var = x80Var3;
                        x80Var2 = r13;
                    }
                    r13 = 0;
                    h01VarArr = (org.telegram.ui.Components.h01[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.h01.class);
                    if (h01VarArr != null) {
                        x80Var4 = new org.telegram.ui.Components.x80(0);
                        x80Var4.n = false;
                        while (i14 < h01VarArr.length) {
                        }
                        x80Var4.n = r42;
                        x80Var3 = x80Var4;
                        x80Var = x80Var3;
                        x80Var2 = r13;
                    }
                    x80Var3 = null;
                    x80Var = x80Var3;
                    x80Var2 = r13;
                } else {
                    x80Var = null;
                    x80Var2 = null;
                }
                b3 b3Var = new b3(v70Var2);
                b3Var.d = r12;
                b3Var.e = x80Var2;
                b3Var.f = x80Var;
                b3Var.n = pageBlock2;
                b3Var.r = richText2;
                b3Var.J = new Stack();
                b3Var.I = new ArrayList();
                b3Var.K = new AtomicReference();
                if (z10) {
                    view2 = view;
                    richText3 = richText;
                    pageBlock3 = pageBlock;
                    i13 = 1;
                    wh.h.a(view2, r12, -1, -1, (Spanned) text, b3Var.J, b3Var.I, null);
                } else {
                    view2 = view;
                    richText3 = richText2;
                    pageBlock3 = pageBlock2;
                    i13 = 1;
                }
                if (view2 != null) {
                    WeakHashMap weakHashMap = A1;
                    ArrayList arrayList = (ArrayList) weakHashMap.get(view2);
                    if (arrayList != null) {
                        int i20 = 0;
                        while (i20 < arrayList.size()) {
                            b3 b3Var2 = (b3) arrayList.get(i20);
                            if (b3Var2.n != pageBlock3 || (richText3 != null && b3Var2.r == richText3)) {
                                b3Var2.detach(view2);
                                arrayList.remove(i20);
                                i20--;
                            }
                            i20 += i13;
                        }
                    }
                    if (richText3 != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            weakHashMap.put(view2, arrayList);
                        }
                        arrayList.add(b3Var);
                    }
                    if (view2.isAttachedToWindow()) {
                        b3Var.attach(view2);
                    }
                }
                return b3Var;
            }
        }
        return null;
    }

    public static b3 q(v70 v70Var, View view, CharSequence charSequence, TL_iv.RichText richText, int i10, int i11, TL_iv.PageBlock pageBlock, g4 g4Var) {
        return p(v70Var, view, charSequence, richText, i10, i11, pageBlock, Layout.Alignment.ALIGN_NORMAL, 0, g4Var);
    }

    public static void r(i4 i4Var, boolean z10) {
        if (q1 == null) {
            q1 = new Paint();
            p1 = new Paint();
            Paint paint = new Paint(1);
            s1 = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            s1.setStrokeWidth(AndroidUtilities.dp(1.0f));
            Paint paint2 = new Paint();
            t1 = paint2;
            paint2.setStyle(style);
            t1.setStrokeWidth(AndroidUtilities.dp(1.0f) / 2.0f);
            u1 = new Paint();
            v1 = new Paint();
            w1 = new Paint();
            x1 = new Paint(1);
            y1 = new Paint(1);
            o1 = new Paint();
            r1 = new Paint();
            z1 = new Paint(1);
        } else if (!z10) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false);
        y1.setColor(com.google.android.gms.internal.vision.e2.y((float) Color.blue(w02), 0.0722f, (((float) Color.green(w02)) * 0.7152f) + (((float) Color.red(w02)) * 0.2126f), 255.0f) <= 0.705f ? -3041234 : -6551);
        Paint paint3 = x1;
        int i10 = org.telegram.ui.ActionBar.j6.K6;
        paint3.setColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false) & 872415231);
        x1.setPathEffect(org.telegram.ui.Components.x80.c());
        w1.setColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false) & 872415231);
        w1.setPathEffect(org.telegram.ui.Components.x80.c());
        Paint paint4 = t1;
        int i11 = org.telegram.ui.ActionBar.j6.k6;
        paint4.setColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        s1.setColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        o1.setColor(251658240);
        r1.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d7, false));
        z1.setColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false) & 872415231);
        z1.setPathEffect(org.telegram.ui.Components.x80.c());
        int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.M6, false);
        int red = Color.red(w03);
        int green = Color.green(w03);
        int blue = Color.blue(w03);
        v1.setColor(Color.argb(20, red, green, blue));
        u1.setColor(Color.argb(34, red, green, blue));
        int w04 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        p1.setColor(Color.argb(20, Color.red(w04), Color.green(w04), Color.blue(w04)));
        q1.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Uc, false));
    }

    public static void u(Canvas canvas, v70 v70Var, TL_iv.PageBlock pageBlock, int i10) {
        if (pageBlock == null || v70Var == null || q1 == null) {
            return;
        }
        int i11 = 0;
        int dp = i10 - (pageBlock.bottom ? AndroidUtilities.dp(6.0f) : 0);
        int i12 = pageBlock.quoteLevels;
        if (i12 == 0) {
            if (pageBlock.level > 0) {
                canvas.drawRect(AndroidUtilities.dp(18), 0.0f, AndroidUtilities.dp(2.0f) + r0, dp, q1);
                return;
            }
            return;
        }
        while (i12 != 0) {
            if ((i12 & 1) != 0) {
                canvas.drawRect(AndroidUtilities.dp((i11 * 14) + 18), 0.0f, AndroidUtilities.dp(2.0f) + r0, dp, q1);
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
    public static void v(v70 v70Var, Canvas canvas, org.telegram.ui.Cells.p9 p9Var, int i10) {
        org.telegram.ui.Cells.q9 q9Var;
        View view = (View) p9Var;
        i4 i4Var = (i4) v70Var;
        if (view != null) {
            i4Var.getClass();
            if (view.getTag() != null) {
                if (view.getTag() == "bottomSheet") {
                    q9Var = i4Var.P0;
                }
            }
        }
        q9Var = i4Var.O0;
        if (q9Var != null) {
            q9Var.a0(canvas, p9Var, i10);
        }
    }

    public static TL_iv.RichText w(int i10, TL_iv.PageBlock pageBlock) {
        if (i10 == 2) {
            TL_iv.RichText w10 = w(0, pageBlock);
            if (w10 instanceof TL_iv.textEmpty) {
                w10 = null;
            }
            TL_iv.RichText w11 = w(1, pageBlock);
            if (w11 instanceof TL_iv.textEmpty) {
                w11 = null;
            }
            if (w10 != null && w11 == null) {
                return w10;
            }
            if (w10 == null && w11 != null) {
                return w11;
            }
            if (w10 != null && w11 != null) {
                TL_iv.textPlain textplain = new TL_iv.textPlain();
                textplain.text = " ";
                TL_iv.textConcat textconcat = new TL_iv.textConcat();
                textconcat.texts.add(w10);
                textconcat.texts.add(textplain);
                textconcat.texts.add(w11);
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
                        return w(i10, ((TL_iv.pageBlockCover) pageBlock).cover);
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

    public static i4 x() {
        i4 i4Var;
        i4 i4Var2 = c1;
        if (i4Var2 != null) {
            return i4Var2;
        }
        synchronized (i4.class) {
            try {
                i4Var = c1;
                if (i4Var == null) {
                    i4Var = new i4();
                    c1 = i4Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i4Var;
    }

    public static View y(View view) {
        org.telegram.ui.Components.vk0 vk0Var;
        if (!(view instanceof y1)) {
            return (!(view instanceof b2) || (vk0Var = ((b2) view).d) == null) ? view : y(vk0Var.a);
        }
        org.telegram.ui.Components.vk0 vk0Var2 = ((y1) view).d;
        return vk0Var2 != null ? y(vk0Var2.a) : view;
    }

    public static TL_iv.PageBlock z(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof y3) {
            TL_iv.PageBlock pageBlock2 = ((y3) pageBlock).d;
            return pageBlock2 != null ? z(pageBlock2) : pageBlock2;
        }
        if (!(pageBlock instanceof a4)) {
            return pageBlock;
        }
        TL_iv.PageBlock pageBlock3 = ((a4) pageBlock).d;
        return pageBlock3 != null ? z(pageBlock3) : pageBlock3;
    }

    public final void G() {
        ArrayList arrayList = this.d0;
        int size = arrayList.size();
        v3 v3Var = this.K;
        boolean z10 = false;
        if (size <= 1) {
            ArticleViewer$WindowView articleViewer$WindowView = this.f0;
            articleViewer$WindowView.e = false;
            articleViewer$WindowView.d = false;
            float width = v3Var != null ? v3Var.I * v3Var.c.getWidth() : this.g0.getX();
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = r0.getMeasuredWidth() - width;
            if (v3Var != null) {
                animatorSet.playTogether(v3Var.d(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.g0, (Property<j0, Float>) View.TRANSLATION_X, r0.getMeasuredWidth()), ObjectAnimator.ofFloat(this.f0, d1, r0.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / r0.getMeasuredWidth()) * measuredWidth), MediaDataController.MAX_LINKS_COUNT));
            animatorSet.setInterpolator(org.telegram.ui.Components.pr.h);
            animatorSet.addListener(new v0(this));
            animatorSet.start();
            this.T0 = true;
            return;
        }
        ArticleViewer$WindowView articleViewer$WindowView2 = this.f0;
        articleViewer$WindowView2.f = true;
        articleViewer$WindowView2.e = true;
        articleViewer$WindowView2.h = this.I0;
        this.u0[1].setVisibility(0);
        this.u0[1].setAlpha(1.0f);
        this.u0[1].setTranslationX(0.0f);
        this.u0[0].setBackgroundColor(v3Var == null ? 0 : this.l0.getColor());
        e0(-1, arrayList.get(arrayList.size() - 2), true);
        m3 m3Var = this.u0[0];
        m3Var.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        m3Var.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.u0[0], (Property<m3, Float>) View.TRANSLATION_X, m3Var.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(org.telegram.ui.Components.pr.h);
        animatorSet2.addListener(new w0(this));
        animatorSet2.start();
        k0 k0Var = this.h0;
        m3 m3Var2 = this.u0[0];
        k0Var.setMenuColors((m3Var2 == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false) : m3Var2.getBackgroundColor());
        k0 k0Var2 = this.h0;
        m3 m3Var3 = this.u0[0];
        k0Var2.d((m3Var3 == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false) : m3Var3.getActionBarColor(), true);
        k0 k0Var3 = this.h0;
        m3 m3Var4 = this.u0[0];
        k0Var3.setIsTonsite(m3Var4 != null && m3Var4.e());
        k0 k0Var4 = this.h0;
        m3 m3Var5 = this.u0[0];
        if (m3Var5 != null && m3Var5.d()) {
            z10 = true;
        }
        k0Var4.setIsLocal(z10);
        this.T0 = true;
    }

    public final void H(int i10) {
        ArrayList arrayList = this.d0;
        int size = arrayList.size();
        v3 v3Var = this.K;
        boolean z10 = false;
        if (size <= 1) {
            ArticleViewer$WindowView articleViewer$WindowView = this.f0;
            articleViewer$WindowView.e = false;
            articleViewer$WindowView.d = false;
            float width = v3Var != null ? v3Var.I * v3Var.c.getWidth() : this.g0.getX();
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = r9.getMeasuredWidth() - width;
            if (v3Var != null) {
                animatorSet.playTogether(v3Var.d(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.g0, (Property<j0, Float>) View.TRANSLATION_X, r9.getMeasuredWidth()), ObjectAnimator.ofFloat(this.f0, d1, r9.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / r9.getMeasuredWidth()) * measuredWidth), MediaDataController.MAX_LINKS_COUNT));
            animatorSet.setInterpolator(org.telegram.ui.Components.pr.h);
            animatorSet.addListener(new x0(this));
            animatorSet.start();
            this.T0 = true;
            return;
        }
        this.f0.f = true;
        this.u0[1].setVisibility(0);
        this.u0[1].setAlpha(1.0f);
        this.u0[1].setTranslationX(0.0f);
        this.u0[0].setBackgroundColor(v3Var == null ? 0 : this.l0.getColor());
        e0(-1, arrayList.get(i10), true);
        m3 m3Var = this.u0[0];
        m3Var.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        m3Var.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.u0[0], (Property<m3, Float>) View.TRANSLATION_X, m3Var.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(org.telegram.ui.Components.pr.h);
        animatorSet2.addListener(new y0(this, i10));
        animatorSet2.start();
        k0 k0Var = this.h0;
        m3 m3Var2 = this.u0[0];
        k0Var.setMenuColors((m3Var2 == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false) : m3Var2.getBackgroundColor());
        k0 k0Var2 = this.h0;
        m3 m3Var3 = this.u0[0];
        k0Var2.d((m3Var3 == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false) : m3Var3.getActionBarColor(), true);
        k0 k0Var3 = this.h0;
        m3 m3Var4 = this.u0[0];
        k0Var3.setIsTonsite(m3Var4 != null && m3Var4.e());
        k0 k0Var4 = this.h0;
        m3 m3Var5 = this.u0[0];
        if (m3Var5 != null && m3Var5.d()) {
            z10 = true;
        }
        k0Var4.setIsLocal(z10);
        this.T0 = true;
    }

    public final boolean J() {
        ArrayList arrayList = this.d0;
        return arrayList.size() > 0 && (arrayList.get(0) instanceof TLRPC.WebPage);
    }

    public final void M() {
        this.V = false;
        int i10 = 0;
        while (true) {
            m3[] m3VarArr = this.u0;
            if (i10 < m3VarArr.length) {
                m3VarArr[i10].b();
                i10++;
            } else {
                try {
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        }
        this.L.getWindow().clearFlags(128);
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.N;
            if (i11 >= arrayList.size()) {
                this.g0.post(new a0(this, 0));
                NotificationCenter.getInstance(this.X).lambda$postNotificationNameOnUIThread$1(NotificationCenter.articleClosed, new Object[0]);
                return;
            } else {
                ((t1) arrayList.get(i11)).a(false);
                i11++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final boolean N(MessageObject messageObject, TLRPC.WebPage webPage, String str, String str2) {
        TLRPC.WebPage webPage2;
        String str3;
        boolean z10;
        int lastIndexOf;
        boolean z11;
        ?? r52;
        TL_iv.Page page;
        if (this.L == null) {
            return false;
        }
        v3 v3Var = this.K;
        if (v3Var == null && this.V) {
            return false;
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.M;
        if (n2Var != null && (n2Var.getParentLayout() instanceof ActionBarLayout)) {
            AndroidUtilities.hideKeyboard((ActionBarLayout) this.M.getParentLayout());
        }
        int i10 = 1;
        if (messageObject != null) {
            webPage2 = webPage == null ? messageObject.messageOwner.media.webpage : webPage;
            z10 = (webPage2 == null || (page = webPage2.cached_page) == null || page.local == null) ? false : true;
            for (int i11 = 0; i11 < messageObject.messageOwner.entities.size(); i11++) {
                TLRPC.MessageEntity messageEntity = messageObject.messageOwner.entities.get(i11);
                if (messageEntity instanceof TLRPC.TL_messageEntityUrl) {
                    try {
                        String str4 = messageObject.messageOwner.message;
                        int i12 = messageEntity.offset;
                        String lowerCase = str4.substring(i12, messageEntity.length + i12).toLowerCase();
                        String lowerCase2 = !TextUtils.isEmpty(webPage2.cached_page.url) ? webPage2.cached_page.url.toLowerCase() : webPage2.url.toLowerCase();
                        if (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase)) {
                            int lastIndexOf2 = lowerCase.lastIndexOf(35);
                            if (lastIndexOf2 == -1) {
                                break;
                            }
                            str3 = lowerCase.substring(lastIndexOf2 + 1);
                            break;
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
            }
            str3 = null;
        } else {
            if (str == null || (lastIndexOf = str.lastIndexOf(35)) == -1) {
                webPage2 = webPage;
                str3 = null;
            } else {
                str3 = str.substring(lastIndexOf + 1);
                webPage2 = webPage;
            }
            z10 = false;
        }
        ArrayList arrayList = this.d0;
        if (v3Var == null || arrayList.isEmpty()) {
            z11 = z10;
            r52 = 0;
        } else {
            z11 = z10;
            r52 = 1;
        }
        if (r52 == 0) {
            arrayList.clear();
            this.g0.setTranslationX(0.0f);
            if (v3Var != null) {
                v3Var.I = 0.0f;
                v3Var.c.invalidate();
                v3Var.i();
                v3Var.h();
            }
            this.g0.setTranslationY(0.0f);
            this.u0[0].setTranslationY(0.0f);
            this.u0[0].setTranslationX(0.0f);
            this.u0[1].setTranslationX(0.0f);
            this.u0[0].setAlpha(1.0f);
            this.f0.setInnerTranslationX(0.0f);
            this.u0[0].g();
            X(AndroidUtilities.dp(56.0f));
        }
        if (v3Var != null && org.telegram.ui.web.d1.P0) {
            v3Var.a.lock();
        }
        if (webPage2 != null) {
            boolean h = h(webPage2, str3, r52);
            if (!z11) {
                String str5 = (h || str3 == null) ? null : str3;
                TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                tL_messages_getWebPage.url = webPage2.url;
                TL_iv.Page page2 = webPage2.cached_page;
                if ((page2 instanceof TL_iv.TL_pagePart_layer82) || page2.part) {
                    tL_messages_getWebPage.hash = 0;
                } else {
                    tL_messages_getWebPage.hash = webPage2.hash;
                }
                int i13 = messageObject != null ? messageObject.currentAccount : UserConfig.selectedAccount;
                ConnectionsManager.getInstance(i13).sendRequest(tL_messages_getWebPage, new of.a(this, i13, webPage2, messageObject, (boolean) r52, str5));
            }
        } else {
            g(r52, str2);
        }
        k0 k0Var = this.h0;
        if (k0Var != null && r52 == 0) {
            k0Var.setIsLocal(this.u0[0].d());
        }
        this.T = null;
        if (v3Var != null) {
            if (r52 == 0) {
                AndroidUtilities.removeFromParent(this.f0);
                v3Var.d = this.f0;
                v3Var.n();
                v3Var.c.addView(this.f0, w7.x5.c(-1.0f, -1));
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
            } catch (Exception e10) {
                FileLog.e(e10);
                return false;
            }
        }
        this.V = true;
        this.Z = 1;
        if (r52 == 0) {
            if (v3Var == null) {
                this.f0.setAlpha(0.0f);
                this.g0.setAlpha(0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                ArticleViewer$WindowView articleViewer$WindowView = this.f0;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, (Property<ArticleViewer$WindowView, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.g0, (Property<j0, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f0, (Property<ArticleViewer$WindowView, Float>) View.TRANSLATION_X, AndroidUtilities.dp(56.0f), 0.0f));
                this.a0 = new a0(this, i10);
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(this.c0);
                animatorSet.addListener(new r0(this));
                this.b0 = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c6(5, this, animatorSet));
            } else if (r52 != 0) {
                v3Var.a.unlock();
            } else if (!v3Var.h) {
                v3Var.g(v3Var.b);
                v3Var.f();
            }
        }
        this.g0.setLayerType(2, null);
        return true;
    }

    public final void P(long j3, TLRPC.User user) {
        if (user == null || !(this.L instanceof LaunchActivity)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        bundle.putString("botUser", "webpage" + j3);
        ((LaunchActivity) this.L).q0(new co(bundle), false, true);
        o(false, true);
    }

    public final void Q(String str, String str2, i0 i0Var) {
        Activity activity = this.L;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        m3 m3Var = this.u0[0];
        if (m3Var == null || !m3Var.d()) {
            R(str, str2, i0Var);
            return;
        }
        String string = LocaleController.getString(R.string.OpenUrlAlert2);
        int indexOf = string.indexOf("%");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.format(string, str));
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new URLSpan(str), indexOf, str.length() + indexOf, 33);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.L, 0, null);
        String string2 = LocaleController.getString(R.string.OpenUrlTitle);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.R = string2;
        b2Var.T = spannableStringBuilder;
        b2Var.f0 = false;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Open), new a1.d(this, str, str2, i0Var, 3));
        alertDialog$Builder.o();
    }

    public final void R(String str, String str2, of.e eVar) {
        v3 v3Var;
        of.e eVar2 = this.M0;
        if (eVar2 != null) {
            eVar2.a(false);
        }
        this.M0 = eVar;
        if (this.F0 != 0) {
            ConnectionsManager.getInstance(this.X).cancelRequest(this.F0, false);
            this.F0 = 0;
        }
        boolean[] zArr = new boolean[1];
        if (of.f.l(this.L, str, false)) {
            if (!this.d0.isEmpty() || (v3Var = this.K) == null) {
                return;
            }
            v3Var.dismiss(false);
            return;
        }
        f0 f0Var = new f0(this, str, zArr, eVar);
        int i10 = this.H0 + 1;
        this.H0 = i10;
        b0(true);
        TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
        tL_messages_getWebPage.url = str;
        tL_messages_getWebPage.hash = 0;
        this.F0 = ConnectionsManager.getInstance(this.X).sendRequest(tL_messages_getWebPage, new org.telegram.messenger.ii(this, i10, eVar, str2, f0Var, tL_messages_getWebPage));
        if (eVar != null) {
            eVar.b = new ah.p(this, i10, eVar, 24);
            eVar.d();
        }
    }

    public final void S() {
        TextView textView = this.B0;
        if (textView != null) {
            textView.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), 2, -1));
            this.B0.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.A0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G8, false));
        }
        ImageView imageView = this.r0;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), PorterDuff.Mode.MULTIPLY));
            this.r0.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.z8, false), 1, -1));
        }
        ImageView imageView2 = this.s0;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), PorterDuff.Mode.MULTIPLY));
            this.s0.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.z8, false), 1, -1));
        }
        org.telegram.ui.Components.q6 q6Var = this.t0;
        if (q6Var != null) {
            q6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        }
        k0 k0Var = this.h0;
        if (k0Var != null) {
            m3 m3Var = this.u0[0];
            k0Var.setMenuColors((m3Var == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false) : m3Var.getBackgroundColor());
            k0 k0Var2 = this.h0;
            m3 m3Var2 = this.u0[0];
            k0Var2.d((m3Var2 == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false) : m3Var2.getActionBarColor(), true);
        }
        this.l0.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false));
    }

    public final void U() {
        int L0;
        m3 m3Var = this.u0[0];
        if (m3Var.c.E == null || (L0 = m3Var.d.L0()) == -1) {
            return;
        }
        View m10 = this.u0[0].d.m(L0);
        int top = m10 != null ? m10.getTop() : 0;
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit();
        String str = "article" + this.u0[0].c.E.id;
        SharedPreferences.Editor putInt = edit.putInt(str, L0).putInt(str + "o", top);
        String t10 = org.telegram.ui.Cells.p6.t(str, "r");
        Point point = AndroidUtilities.displaySize;
        putInt.putBoolean(t10, point.x > point.y).commit();
    }

    public final boolean V(String str, boolean z10) {
        Integer num = 0;
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            Integer num2 = (Integer) this.u0[0].c.h.get(lowerCase);
            if (num2 != null) {
                TL_iv.textAnchor textanchor = (TL_iv.textAnchor) this.u0[0].c.r.get(lowerCase);
                if (textanchor != null) {
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    pageblockparagraph.text = org.telegram.ui.web.j2.d(textanchor.text, !TextUtils.isEmpty(this.u0[0].c.E.cached_page.url) ? this.u0[0].c.E.cached_page.url.toLowerCase() : this.u0[0].c.E.url.toLowerCase(), lowerCase);
                    this.u0[0].c.getClass();
                    int I = g4.I(pageblockparagraph);
                    s4.c1 x10 = this.u0[0].c.x(null, I);
                    View view = x10.a;
                    this.u0[0].c.H(I, x10, pageblockparagraph, 0, 0, false);
                    org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) this.L, (org.telegram.ui.ActionBar.f6) null, false);
                    f3Var.fixNavigationBar();
                    f3Var.applyTopPadding = false;
                    f3Var.applyBottomPadding = false;
                    LinearLayout linearLayout = new LinearLayout(this.L);
                    linearLayout.setOrientation(1);
                    org.telegram.ui.Cells.q9 q9Var = new org.telegram.ui.Cells.q9();
                    this.P0 = q9Var;
                    q9Var.T(linearLayout);
                    this.P0.D = new bi.f3(this, 1);
                    bi.c4 c4Var = new bi.c4(this.L, 4);
                    c4Var.setTextSize(1, 16.0f);
                    c4Var.setTypeface(AndroidUtilities.bold());
                    c4Var.setText(LocaleController.getString(R.string.InstantViewReference));
                    c4Var.setGravity((this.u0[0].c.G ? 5 : 3) | 16);
                    c4Var.setTextColor(b());
                    c4Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                    linearLayout.addView(c4Var, new LinearLayout.LayoutParams(-1, AndroidUtilities.dp(48.0f) + 1));
                    view.setTag("bottomSheet");
                    linearLayout.addView(view, w7.x5.k(0.0f, 7.0f, 0.0f, 0.0f, -1, -2));
                    org.telegram.ui.Cells.ca o9 = this.P0.o(this.L);
                    ah.w wVar = new ah.w(this, this.L, linearLayout, 6);
                    f3Var.setDelegate(new g0(this, 0));
                    wVar.addView(linearLayout, -1, -2);
                    wVar.addView(o9, -1, -2);
                    f3Var.customView = wVar;
                    if (this.O0.y()) {
                        this.O0.f(false);
                    }
                    this.I = f3Var;
                    a0(f3Var);
                    return true;
                }
                if (num2.intValue() >= 0 && num2.intValue() < this.u0[0].c.e.size()) {
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) this.u0[0].c.e.get(num2.intValue());
                    TL_iv.PageBlock z11 = z(pageBlock);
                    if ((z11 instanceof w3) && O((w3) z11)) {
                        this.u0[0].c.M();
                        this.u0[0].c.l();
                    }
                    int indexOf = this.u0[0].c.d.indexOf(pageBlock);
                    if (indexOf != -1) {
                        num2 = Integer.valueOf(indexOf);
                    }
                    Integer num3 = (Integer) this.u0[0].c.n.get(lowerCase);
                    if (num3 != null) {
                        if (num3.intValue() == -1) {
                            this.u0[0].c.getClass();
                            int I2 = g4.I(pageBlock);
                            s4.c1 x11 = this.u0[0].c.x(null, I2);
                            this.u0[0].c.H(I2, x11, pageBlock, 0, 0, false);
                            x11.a.measure(View.MeasureSpec.makeMeasureSpec(this.u0[0].b.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                            Integer num4 = (Integer) this.u0[0].c.n.get(lowerCase);
                            if (num4.intValue() != -1) {
                                num = num4;
                            }
                        } else {
                            num = num3;
                        }
                    }
                    if (this.u0[0].c.H) {
                        num2 = Integer.valueOf(num2.intValue() + 1);
                    }
                    if (!z10) {
                        this.u0[0].d.h1(num2.intValue(), (-AndroidUtilities.dp(56.0f)) - num.intValue());
                        return true;
                    }
                    h0 h0Var = new h0(this.u0[0].getContext());
                    h0Var.a = num2.intValue();
                    h0Var.s = (-AndroidUtilities.dp(56.0f)) - num.intValue();
                    this.u0[0].d.w0(h0Var);
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
    public final void W(int i10) {
        int size;
        int i11;
        TL_iv.PageBlock pageBlock;
        w3 w3Var;
        TL_iv.PageBlock pageBlock2;
        if (i10 < 0 || i10 >= this.E.size()) {
            h0();
            return;
        }
        this.G = i10;
        h0();
        r3 r3Var = (r3) this.E.get(i10);
        TL_iv.PageBlock z10 = z(r3Var.c);
        int size2 = this.u0[0].c.e.size();
        for (int i12 = 0; i12 < size2; i12++) {
            TL_iv.PageBlock pageBlock3 = (TL_iv.PageBlock) this.u0[0].c.e.get(i12);
            if ((pageBlock3 instanceof w3) && ((pageBlock2 = (w3Var = (w3) pageBlock3).b) == r3Var.c || pageBlock2 == z10)) {
                if (O(w3Var)) {
                    this.u0[0].c.M();
                    this.u0[0].c.l();
                }
                size = this.u0[0].c.d.size();
                i11 = 0;
                while (true) {
                    if (i11 < size) {
                        i11 = -1;
                        break;
                    }
                    TL_iv.PageBlock pageBlock4 = (TL_iv.PageBlock) this.u0[0].c.d.get(i11);
                    TL_iv.PageBlock pageBlock5 = r3Var.c;
                    if (pageBlock4 == pageBlock5 || pageBlock4 == z10 || ((pageBlock4 instanceof w3) && ((pageBlock = ((w3) pageBlock4).b) == pageBlock5 || pageBlock == z10))) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 != -1) {
                    return;
                }
                if ((z10 instanceof w3) && O((w3) z10)) {
                    this.u0[0].c.M();
                    this.u0[0].c.l();
                }
                String str = this.F + r3Var.c + r3Var.b + r3Var.a;
                Integer num = (Integer) this.u0[0].c.y.get(str);
                if (num == null) {
                    g4 g4Var = this.u0[0].c;
                    TL_iv.PageBlock pageBlock6 = r3Var.c;
                    g4Var.getClass();
                    int I = g4.I(pageBlock6);
                    s4.c1 x10 = this.u0[0].c.x(null, I);
                    this.u0[0].c.H(I, x10, r3Var.c, 0, 0, false);
                    x10.a.measure(View.MeasureSpec.makeMeasureSpec(this.u0[0].b.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                    num = (Integer) this.u0[0].c.y.get(str);
                    if (num == null) {
                        num = 0;
                    }
                }
                p0 p0Var = new p0(this.u0[0].getContext());
                if (this.u0[0].c.H) {
                    i11++;
                }
                p0Var.a = i11;
                p0Var.s = -(AndroidUtilities.dp(100.0f) + ((this.I0 - AndroidUtilities.dp(56.0f)) - num.intValue()));
                p0Var.t = 1.2f;
                this.u0[0].d.w0(p0Var);
                this.u0[0].b.e1();
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

    public final void X(int i10) {
        k0 k0Var = this.h0;
        if (k0Var == null || k0Var.T || k0Var.W) {
            return;
        }
        int clamp = Utilities.clamp(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(24.0f));
        this.I0 = clamp;
        this.h0.setHeight(clamp);
        this.O0.x = this.I0;
        int i11 = 0;
        while (true) {
            m3[] m3VarArr = this.u0;
            if (i11 >= m3VarArr.length) {
                return;
            }
            m3VarArr[i11].b.setTopGlowOffset(this.I0);
            i11++;
        }
    }

    public final void Y(Activity activity, org.telegram.ui.ActionBar.n2 n2Var) {
        v3 v3Var;
        kb0 kb0Var = this.U0;
        if (kb0Var != null) {
            kb0Var.destroy();
            this.U0 = null;
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        this.U0 = launchActivity != null ? new kb0(launchActivity, true) : null;
        this.M = n2Var;
        int currentAccount = !(n2Var instanceof hz) ? n2Var.getCurrentAccount() : UserConfig.selectedAccount;
        this.X = currentAccount;
        NotificationCenter.getInstance(currentAccount).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getInstance(this.X).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.X).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.X).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.X).addObserver(this, NotificationCenter.emojiLoaded);
        Activity activity2 = this.L;
        if (activity2 == activity || !(activity2 == null || !this.J || (v3Var = this.K) == null || v3Var.e == null)) {
            g0(this);
            S();
            return;
        }
        this.L = activity;
        this.a = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).getInt("font_type", 0);
        r(this, false);
        this.l0 = new Paint();
        this.m0 = activity.getResources().getDrawable(R.drawable.layer_shadow);
        this.n0 = new Paint();
        ArticleViewer$WindowView articleViewer$WindowView = new ArticleViewer$WindowView(this, activity);
        this.f0 = articleViewer$WindowView;
        articleViewer$WindowView.setWillNotDraw(false);
        this.f0.setClipChildren(true);
        this.f0.setFocusable(false);
        j0 j0Var = new j0(this, activity, 0);
        this.g0 = j0Var;
        this.f0.addView(j0Var, w7.x5.e(-1, -1, 51));
        if (this.K == null) {
            this.f0.setFitsSystemWindows(true);
            this.g0.setOnApplyWindowInsetsListener(new org.telegram.ui.ActionBar.g3(1));
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        this.P = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.P.setVisibility(4);
        this.f0.addView(this.P, w7.x5.c(-1.0f, -1));
        l4 l4Var = new l4(activity);
        this.R = l4Var;
        l4Var.setVisibility(0);
        this.R.setBackgroundColor(-16777216);
        this.P.addView(this.R, w7.x5.e(-1, -1, 17));
        this.Q = new TextureView(activity);
        this.u0 = new m3[2];
        int i10 = 0;
        while (true) {
            m3[] m3VarArr = this.u0;
            if (i10 >= m3VarArr.length) {
                break;
            }
            m3 m3Var = new m3(this, activity);
            m3VarArr[i10] = m3Var;
            m3Var.setVisibility(i10 == 0 ? 0 : 8);
            this.g0.addView(m3Var, w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
            m3Var.b.setOnItemLongClickListener(new t(this));
            m3Var.b.setOnItemClickListener(new ah.i0(29, this, m3Var));
            i10++;
        }
        this.g0.addView(new FrameLayout(activity), w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        this.w0.setColor(-16777216);
        this.x0.setColor(-16777216);
        this.z0.setColor(-14408666);
        this.y0.setColor(-16777216);
        k0 k0Var = new k0(this, activity);
        this.h0 = k0Var;
        k0Var.e0 = this.K != null;
        this.g0.addView(k0Var, w7.x5.e(-1, -2, 48));
        this.h0.setOnClickListener(new bi.u1(22, this, activity));
        this.h0.b0.addTextChangedListener(new l0(this, 0));
        org.telegram.ui.web.l lVar = new org.telegram.ui.web.l(activity);
        this.i0 = lVar;
        lVar.setOpenProgress(0.0f);
        this.i0.w.j(new i3(this, 2));
        this.g0.addView(this.i0, w7.x5.c(-1.0f, -1));
        this.j0 = new a0(this, 3);
        this.h0.L.setOnClickListener(new s(this, 2));
        this.h0.L.setOnLongClickListener(new u(this, 0));
        this.h0.setMenuListener(new di.m2(26, this, activity));
        this.h0.O.setOnClickListener(new s(this, 3));
        bi.g5 g5Var = new bi.g5(this.L, 6);
        this.q0 = g5Var;
        g5Var.setOnTouchListener(new ci.d(3));
        this.q0.setWillNotDraw(false);
        this.q0.setTranslationY(AndroidUtilities.dp(51.0f));
        this.q0.setVisibility(4);
        this.q0.setFocusable(true);
        this.q0.setFocusableInTouchMode(true);
        this.q0.setClickable(true);
        this.q0.setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
        this.g0.addView(this.q0, w7.x5.e(-1, 51, 80));
        new di.j4(this.f0, false, new r(this, 0));
        ImageView imageView = new ImageView(this.L);
        this.r0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.r0.setImageResource(R.drawable.msg_go_up);
        ImageView imageView2 = this.r0;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(w02, mode));
        ImageView imageView3 = this.r0;
        int i12 = org.telegram.ui.ActionBar.j6.z8;
        imageView3.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i12, false), 1, -1));
        this.q0.addView(this.r0, w7.x5.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        this.r0.setOnClickListener(new s(this, 0));
        this.r0.setContentDescription(LocaleController.getString(R.string.AccDescrSearchNext));
        ImageView imageView4 = new ImageView(this.L);
        this.s0 = imageView4;
        imageView4.setScaleType(scaleType);
        this.s0.setImageResource(R.drawable.msg_go_down);
        this.s0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i11, false), mode));
        this.s0.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i12, false), 1, -1));
        this.q0.addView(this.s0, w7.x5.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        this.s0.setOnClickListener(new s(this, 1));
        this.s0.setContentDescription(LocaleController.getString(R.string.AccDescrSearchPrev));
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(this.L, true, true, true);
        this.t0 = q6Var;
        q6Var.setScaleProperty(0.6f);
        this.t0.b(0.4f, 350L, org.telegram.ui.Components.pr.h);
        this.t0.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.t0.setTextSize(AndroidUtilities.dp(15.0f));
        this.t0.setTypeface(AndroidUtilities.bold());
        this.t0.setGravity(3);
        this.t0.getDrawable().G = AndroidUtilities.displaySize.x;
        this.q0.addView(this.t0, w7.x5.d(-2, -2.0f, 19, 18.0f, 0.0f, 108.0f, 0.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.e0 = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 98;
        layoutParams.softInputMode = 48;
        layoutParams.flags = 131072;
        int w03 = this.K == null ? org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, true) : org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false);
        int i13 = (AndroidUtilities.computePerceivedBrightness(w03) < 0.721f || Build.VERSION.SDK_INT < 26) ? 1792 : 1808;
        this.y0.setColor(w03);
        WindowManager.LayoutParams layoutParams2 = this.e0;
        layoutParams2.systemUiVisibility = i13;
        layoutParams2.flags |= -2147417856;
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams2.layoutInDisplayCutoutMode = 1;
        }
        org.telegram.ui.Cells.q9 q9Var = new org.telegram.ui.Cells.q9();
        this.O0 = q9Var;
        q9Var.T(this.u0[0].b);
        if (MessagesController.getInstance(this.X).getTranslateController().isContextTranslateEnabled()) {
            this.O0.l0 = new t(this);
        }
        org.telegram.ui.Cells.q9 q9Var2 = this.O0;
        q9Var2.E0 = this.u0[0].d;
        q9Var2.D = new o0(this);
        this.g0.addView(q9Var2.o(activity));
        j0 j0Var2 = this.g0;
        ov0 ov0Var = new ov0(j0Var2, j0Var2);
        this.Q0 = ov0Var;
        ov0Var.F = new t(this);
        ov0Var.E = new g(this, 1);
        this.l0.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false));
        g0(this);
    }

    public final void Z(String str) {
        String str2;
        if (this.L == null) {
            return;
        }
        org.telegram.ui.ActionBar.f3 f3Var = this.I;
        if (f3Var != null) {
            f3Var.dismiss();
            this.I = null;
        }
        int i10 = 1;
        int i11 = 0;
        org.telegram.ui.ActionBar.f3 f3Var2 = new org.telegram.ui.ActionBar.f3(1, (Context) this.L, (org.telegram.ui.ActionBar.f6) null, false);
        f3Var2.fixNavigationBar();
        try {
            str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e7) {
            FileLog.e(e7);
            str2 = str;
        }
        f3Var2.title = str2;
        f3Var2.bigTitle = false;
        f3Var2.multipleLinesTitle = true;
        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
        mg.j jVar = new mg.j(i10, this, str);
        f3Var2.items = charSequenceArr;
        f3Var2.onClickListener = jVar;
        f3Var2.setOnHideListener(new v(this, i11));
        a0(f3Var2);
    }

    @Override // org.telegram.ui.v70
    public final int a() {
        return org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.y6, false);
    }

    public final void a0(org.telegram.ui.ActionBar.f3 f3Var) {
        if (this.L == null) {
            return;
        }
        try {
            org.telegram.ui.ActionBar.f3 f3Var2 = this.k0;
            if (f3Var2 != null) {
                f3Var2.dismiss();
                this.k0 = null;
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        try {
            this.k0 = f3Var;
            f3Var.setCanceledOnTouchOutside(true);
            this.k0.setOnDismissListener(new v(this, 1));
            f3Var.show();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.ui.v70
    public final int b() {
        return org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false);
    }

    public final void b0(boolean z10) {
        AndroidUtilities.cancelRunOnUIThread(this.j0);
        if (!z10) {
            this.h0.d0.a(1.0f, true);
            return;
        }
        this.h0.d0.a(0.0f, false);
        this.h0.d0.a(0.3f, true);
        AndroidUtilities.runOnUIThread(this.j0, 100L);
    }

    @Override // org.telegram.ui.v70
    public final void c(g4 g4Var, org.telegram.ui.Components.j01 j01Var) {
        String str;
        String str2;
        org.telegram.ui.Components.e90 e90Var;
        if (j01Var == null || (str = j01Var.b) == null) {
            return;
        }
        org.telegram.ui.ActionBar.f3 f3Var = this.I;
        i0 i0Var = null;
        if (f3Var != null) {
            f3Var.dismiss();
            this.I = null;
        }
        int lastIndexOf = str.lastIndexOf(35);
        boolean z10 = false;
        if (lastIndexOf != -1) {
            String lowerCase = !TextUtils.isEmpty(g4Var.E.cached_page.url) ? g4Var.E.cached_page.url.toLowerCase() : g4Var.E.url.toLowerCase();
            try {
                str2 = URLDecoder.decode(str.substring(lastIndexOf + 1), "UTF-8");
            } catch (Exception unused) {
                str2 = "";
            }
            if (lastIndexOf == 0 || str.toLowerCase().contains(lowerCase)) {
                z10 = true;
                V(str2, true);
            }
        } else {
            str2 = null;
        }
        if (z10) {
            return;
        }
        b3 b3Var = this.d;
        if (b3Var != null && (e90Var = this.b) != null) {
            i0Var = new i0(this, b3Var, e90Var);
        }
        Q(str, str2, i0Var);
    }

    public final void c0() {
        LaunchActivity launchActivity;
        FrameLayout frameLayout;
        if (!this.W || (launchActivity = LaunchActivity.G1) == null || launchActivity.isFinishing()) {
            return;
        }
        if (!this.u0[0].f()) {
            m3 m3Var = this.u0[0];
            TLRPC.WebPage webPage = m3Var.c.E;
            frameLayout = m3Var;
            if (webPage == null) {
                return;
            }
        } else if (this.u0[0].getWebView() == null) {
            return;
        } else {
            frameLayout = this.u0[0].f;
        }
        new org.telegram.ui.Components.yc(frameLayout, null).G(R.raw.chats_infotip, 4, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BrowserExternalRestricted), new a0(this, 10))).k(true);
    }

    @Override // org.telegram.ui.v70
    public final boolean d(TL_iv.PageBlock pageBlock, g4 g4Var) {
        int indexOf;
        List list;
        org.telegram.ui.ActionBar.n2 n2Var = this.M;
        if (n2Var != null && n2Var.getParentActivity() != null) {
            if (!(pageBlock instanceof TL_iv.pageBlockVideo) || f4.g(g4Var.E, pageBlock)) {
                ArrayList arrayList = new ArrayList(g4Var.f);
                indexOf = g4Var.f.indexOf(pageBlock);
                list = arrayList;
            } else {
                list = Collections.singletonList(pageBlock);
                indexOf = 0;
            }
            PhotoViewer t12 = PhotoViewer.t1();
            t12.K2(null, this.M, null);
            if (t12.e2(null, null, null, null, null, null, null, indexOf, new f3(this, list), null, 0L, 0L, 0L, true, new o3(this, g4Var.E, list), null)) {
                n();
                return true;
            }
        }
        return false;
    }

    public final void d0(boolean z10) {
        this.q0.setVisibility(0);
        ValueAnimator valueAnimator = this.X0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Y0, z10 ? 1.0f : 0.0f);
        this.X0 = ofFloat;
        ofFloat.addUpdateListener(new q(this, 1));
        this.X0.addListener(new ah.q0(20, this, z10));
        this.X0.setDuration(320L);
        this.X0.setInterpolator(org.telegram.ui.Components.pr.h);
        this.X0.start();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        a1 a1Var;
        MessageObject messageObject;
        if (i10 == NotificationCenter.messagePlayingDidStart) {
            if (this.u0 == null) {
                return;
            }
            int i12 = 0;
            while (true) {
                m3[] m3VarArr = this.u0;
                if (i12 >= m3VarArr.length) {
                    return;
                }
                int childCount = m3VarArr[i12].b.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = this.u0[i12].b.getChildAt(i13);
                    if (childAt instanceof a1) {
                        ((a1) childAt).a(true);
                    }
                }
                i12++;
            }
        } else if (i10 == NotificationCenter.messagePlayingDidReset || i10 == NotificationCenter.messagePlayingPlayStateChanged) {
            if (this.u0 == null) {
                return;
            }
            int i14 = 0;
            while (true) {
                m3[] m3VarArr2 = this.u0;
                if (i14 >= m3VarArr2.length) {
                    return;
                }
                int childCount2 = m3VarArr2[i14].b.getChildCount();
                for (int i15 = 0; i15 < childCount2; i15++) {
                    View childAt2 = this.u0[i14].b.getChildAt(i15);
                    if (childAt2 instanceof a1) {
                        a1 a1Var2 = (a1) childAt2;
                        if (a1Var2.getMessageObject() != null) {
                            a1Var2.a(true);
                        }
                    }
                }
                i14++;
            }
        } else if (i10 == NotificationCenter.messagePlayingProgressDidChanged) {
            Integer num = (Integer) objArr[0];
            if (this.u0 == null) {
                return;
            }
            int i16 = 0;
            while (true) {
                m3[] m3VarArr3 = this.u0;
                if (i16 >= m3VarArr3.length) {
                    return;
                }
                int childCount3 = m3VarArr3[i16].b.getChildCount();
                int i17 = 0;
                while (true) {
                    if (i17 < childCount3) {
                        View childAt3 = this.u0[i16].b.getChildAt(i17);
                        if ((childAt3 instanceof a1) && (messageObject = (a1Var = (a1) childAt3).getMessageObject()) != null && messageObject.getId() == num.intValue()) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (playingMessageObject != null) {
                                messageObject.audioProgress = playingMessageObject.audioProgress;
                                messageObject.audioProgressSec = playingMessageObject.audioProgressSec;
                                messageObject.audioPlayerDuration = playingMessageObject.audioPlayerDuration;
                                a1Var.b();
                            }
                        } else {
                            i17++;
                        }
                    }
                }
                i16++;
            }
        } else {
            if (i10 != NotificationCenter.emojiLoaded || this.u0 == null) {
                return;
            }
            int i18 = 0;
            while (true) {
                m3[] m3VarArr4 = this.u0;
                if (i18 >= m3VarArr4.length) {
                    return;
                }
                int childCount4 = m3VarArr4[i18].b.getChildCount();
                for (int i19 = 0; i19 < childCount4; i19++) {
                    View childAt4 = this.u0[i18].b.getChildAt(i19);
                    if (childAt4 instanceof u2) {
                        ((u2) childAt4).e.invalidate();
                    } else {
                        childAt4.invalidate();
                    }
                }
                i18++;
            }
        }
    }

    public final void e0(int i10, Object obj, boolean z10) {
        int i11;
        int dp;
        if (obj != null) {
            if ((!(obj instanceof TLRPC.WebPage) || ((TLRPC.WebPage) obj).cached_page == null) && !(obj instanceof z2)) {
                return;
            }
            int i12 = 0;
            if (!z10 && i10 != 0) {
                m3[] m3VarArr = this.u0;
                m3 m3Var = m3VarArr[1];
                m3VarArr[1] = m3VarArr[0];
                m3VarArr[0] = m3Var;
                this.h0.i();
                this.Z0.a(this.u0[0].getBackgroundColor(), true);
                this.a1.a(this.u0[1].getBackgroundColor(), true);
                v3 v3Var = this.K;
                if (v3Var != null) {
                    v3Var.m();
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
                int i13 = i10 == 1 ? 0 : 1;
                this.u0[i13].setBackgroundColor(this.K == null ? 0 : this.l0.getColor());
                this.u0[i13].setLayerType(2, null);
                if (i10 == 1) {
                    this.u0[0].setTranslationX(AndroidUtilities.displaySize.x);
                    this.v0.playTogether(ObjectAnimator.ofFloat(this.u0[0], (Property<m3, Float>) View.TRANSLATION_X, AndroidUtilities.displaySize.x, 0.0f));
                } else if (i10 == -1) {
                    this.u0[0].setTranslationX(0.0f);
                    this.v0.playTogether(ObjectAnimator.ofFloat(this.u0[1], (Property<m3, Float>) View.TRANSLATION_X, 0.0f, AndroidUtilities.displaySize.x));
                }
                this.v0.setDuration(320L);
                this.v0.setInterpolator(org.telegram.ui.Components.pr.h);
                this.v0.addListener(new u0(this, i13, i12));
                this.f0.f = true;
                k0 k0Var = this.h0;
                m3 m3Var2 = this.u0[0];
                k0Var.setMenuColors((m3Var2 == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false) : m3Var2.getBackgroundColor());
                k0 k0Var2 = this.h0;
                m3 m3Var3 = this.u0[0];
                k0Var2.d((m3Var3 == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false) : m3Var3.getActionBarColor(), true);
                k0 k0Var3 = this.h0;
                m3 m3Var4 = this.u0[0];
                k0Var3.setIsTonsite(m3Var4 != null && m3Var4.e());
                k0 k0Var4 = this.h0;
                m3 m3Var5 = this.u0[0];
                k0Var4.setIsLocal(m3Var5 != null && m3Var5.d());
                AnimatorSet animatorSet = this.v0;
                Objects.requireNonNull(animatorSet);
                AndroidUtilities.runOnUIThread(new lu0(animatorSet, 4));
            }
            if (!z10) {
                this.O0.f(true);
            }
            g4 g4Var = this.u0[z10 ? 1 : 0].c;
            if (z10) {
                obj = i2.g.h(2, this.d0);
            }
            this.u0[z10 ? 1 : 0].b();
            if (obj instanceof TLRPC.WebPage) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj;
                this.u0[z10 ? 1 : 0].setWeb(null);
                this.u0[z10 ? 1 : 0].setType(0);
                TL_iv.Page page = webPage.cached_page;
                g4Var.G = page.rtl;
                g4Var.E = webPage;
                int size = page.blocks.size();
                while (i11 < size) {
                    TL_iv.PageBlock pageBlock = webPage.cached_page.blocks.get(i11);
                    if (i11 == 0) {
                        pageBlock.first = true;
                        if (pageBlock instanceof TL_iv.pageBlockCover) {
                            TL_iv.pageBlockCover pageblockcover = (TL_iv.pageBlockCover) pageBlock;
                            TL_iv.RichText w10 = w(0, pageblockcover);
                            TL_iv.RichText w11 = w(1, pageblockcover);
                            if (((w10 != null && !(w10 instanceof TL_iv.textEmpty)) || (w11 != null && !(w11 instanceof TL_iv.textEmpty))) && size > 1) {
                                TL_iv.PageBlock pageBlock2 = webPage.cached_page.blocks.get(1);
                                if (pageBlock2 instanceof TL_iv.pageBlockChannel) {
                                    g4Var.F = (TL_iv.pageBlockChannel) pageBlock2;
                                }
                            }
                        }
                    } else {
                        i11 = (i11 == 1 && g4Var.F != null) ? i11 + 1 : 0;
                    }
                    g4Var.F(g4Var, pageBlock, 0, 0, i11 == size + (-1) ? i11 : 0);
                }
                g4Var.l();
                if (this.d0.size() == 1 || i10 == -1) {
                    SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0);
                    String str = "article" + webPage.id;
                    int i14 = sharedPreferences.getInt(str, -1);
                    boolean z11 = sharedPreferences.getBoolean(str + "r", true);
                    Point point = AndroidUtilities.displaySize;
                    if (z11 == (point.x <= point.y ? 0 : 1)) {
                        dp = sharedPreferences.getInt(str + "o", 0) - this.u0[z10 ? 1 : 0].b.getPaddingTop();
                    } else {
                        dp = AndroidUtilities.dp(10.0f);
                    }
                    if (i14 != -1) {
                        this.u0[z10 ? 1 : 0].d.h1(i14, dp);
                    }
                } else {
                    s4.c0 c0Var = this.u0[z10 ? 1 : 0].d;
                    v3 v3Var2 = this.K;
                    c0Var.h1(v3Var2 == null ? 0 : 1, v3Var2 != null ? AndroidUtilities.dp(32.0f) : 0);
                }
            } else if (obj instanceof z2) {
                this.u0[z10 ? 1 : 0].setType(1);
                this.u0[z10 ? 1 : 0].g();
                this.u0[z10 ? 1 : 0].setWeb((z2) obj);
            }
            if (!z10) {
                m(null);
            }
            i0(false);
            f0();
        }
    }

    public final void f0() {
        m3[] m3VarArr;
        m3 m3Var;
        if (this.h0 == null || (m3Var = (m3VarArr = this.u0)[0]) == null || m3VarArr[1] == null) {
            return;
        }
        float translationX = m3Var.getVisibility() != 0 ? 0.0f : 1.0f - (this.u0[0].getTranslationX() / this.u0[0].getWidth());
        float f7 = 1.0f - translationX;
        k0 k0Var = this.h0;
        k0Var.d[0] = this.u0[0].getProgress();
        k0Var.invalidate();
        k0 k0Var2 = this.h0;
        k0Var2.d[1] = this.u0[1].getProgress();
        k0Var2.invalidate();
        this.h0.setTransitionProgress(f7);
        k0 k0Var3 = this.h0;
        if (!k0Var3.W && !k0Var3.T) {
            ArticleViewer$WindowView articleViewer$WindowView = this.f0;
            if (articleViewer$WindowView.e || articleViewer$WindowView.f) {
                boolean J = J();
                ArrayList arrayList = this.d0;
                if (J || arrayList.size() > 1) {
                    float lerp = AndroidUtilities.lerp((this.u0[0].s || arrayList.size() > 1) ? 1.0f : 0.0f, (this.u0[1].s || arrayList.size() > 2) ? 1.0f : 0.0f, f7);
                    this.h0.M.c(1.0f - lerp, false);
                    this.h0.P.f();
                    this.h0.setBackButtonCached(lerp > 0.5f);
                } else {
                    this.h0.P.f();
                    this.h0.setBackButtonCached(false);
                }
                this.h0.setHasForward(this.u0[0].v);
                this.h0.setIsLocal(this.u0[0].d());
                this.h0.setIsLoaded(this.u0[0].getWebView() != null && this.u0[0].getWebView().b);
            }
        }
        k0 k0Var4 = this.h0;
        int actionBarColor = this.u0[0].getActionBarColor();
        ArticleViewer$WindowView articleViewer$WindowView2 = this.f0;
        k0Var4.b(0, this.Z0.a(actionBarColor, articleViewer$WindowView2.e || articleViewer$WindowView2.f));
        k0 k0Var5 = this.h0;
        int actionBarColor2 = this.u0[1].getActionBarColor();
        ArticleViewer$WindowView articleViewer$WindowView3 = this.f0;
        k0Var5.b(1, this.a1.a(actionBarColor2, articleViewer$WindowView3.e || articleViewer$WindowView3.f));
        this.h0.d(i0.a.d(f7, this.u0[0].getActionBarColor(), this.u0[1].getActionBarColor()), false);
        this.h0.setMenuType((translationX > 0.5f ? this.u0[0] : this.u0[1]).a);
        v3 v3Var = this.K;
        if (v3Var != null) {
            v3Var.c.invalidate();
            return;
        }
        ArticleViewer$WindowView articleViewer$WindowView4 = this.f0;
        if (articleViewer$WindowView4 != null) {
            articleViewer$WindowView4.invalidate();
        }
    }

    public final void g(int i10, String str) {
        U();
        z2 z2Var = new z2();
        z2Var.x = str;
        this.d0.add(z2Var);
        this.h0.h(false);
        e0(i10, z2Var, false);
    }

    public final boolean h(TLRPC.WebPage webPage, String str, int i10) {
        U();
        this.d0.add(webPage);
        this.h0.h(false);
        e0(i10, webPage, false);
        return V(str, false);
    }

    public final void h0() {
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
                this.t0.setText(LocaleController.getString(R.string.NoResult));
            } else if (size == 1) {
                this.t0.setText(LocaleController.getString(R.string.OneResult));
            } else {
                this.t0.setText(String.format(LocaleController.getPluralString("CountOfResults", size), Integer.valueOf(i10 + 1), Integer.valueOf(size)));
            }
        }
    }

    public final void i0(boolean z10) {
        boolean z11 = false;
        this.h0.g(0, this.u0[0].getTitle(), z10);
        this.h0.f(0, this.u0[0].getSubtitle());
        this.h0.e(0, this.u0[0].f() && this.u0[0].getWebView() != null && this.u0[0].getWebView().E);
        this.h0.g(1, this.u0[1].getTitle(), z10);
        this.h0.f(1, this.u0[1].getSubtitle());
        k0 k0Var = this.h0;
        if (this.u0[1].f() && this.u0[1].getWebView() != null && this.u0[1].getWebView().E) {
            z11 = true;
        }
        k0Var.e(1, z11);
    }

    public final void k() {
        this.J0 = false;
        a3 a3Var = this.K0;
        if (a3Var != null) {
            this.f0.removeCallbacks(a3Var);
            this.K0 = null;
        }
        a3 a3Var2 = this.L0;
        if (a3Var2 != null) {
            this.f0.removeCallbacks(a3Var2);
            this.L0 = null;
        }
    }

    public final void m(org.telegram.messenger.a6 a6Var) {
        if (this.I0 == AndroidUtilities.dp(56.0f)) {
            if (a6Var != null) {
                a6Var.run();
                return;
            }
            return;
        }
        int i10 = 0;
        ValueAnimator duration = ValueAnimator.ofObject(new IntEvaluator(), Integer.valueOf(this.I0), Integer.valueOf(AndroidUtilities.dp(56.0f))).setDuration(180L);
        duration.setInterpolator(new DecelerateInterpolator());
        duration.addUpdateListener(new q(this, i10));
        duration.addListener(new q0(i10, a6Var));
        if (a6Var != null) {
            duration.setDuration(duration.getDuration() / 2);
        }
        duration.start();
    }

    public final void n() {
        x2 x2Var;
        di.v vVar = this.u0[0].b;
        if (vVar == null || !this.W) {
            return;
        }
        float measuredHeight = vVar.getMeasuredHeight() / 2.0f;
        float f7 = 0.0f;
        x2 x2Var2 = null;
        for (int i10 = 0; i10 < vVar.getChildCount(); i10++) {
            View childAt = vVar.getChildAt(i10);
            if (childAt instanceof x2) {
                float measuredHeight2 = (childAt.getMeasuredHeight() / 2.0f) + childAt.getTop();
                if (x2Var2 == null || Math.abs(measuredHeight - measuredHeight2) < Math.abs(measuredHeight - f7)) {
                    x2Var2 = (x2) childAt;
                    f7 = measuredHeight2;
                }
            }
        }
        boolean z10 = PhotoViewer.t1().f;
        if (z10 || ((x2Var = this.x) != null && x2Var != x2Var2 && this.w != null)) {
            VideoPlayerHolderBase videoPlayerHolderBase = this.w;
            if (videoPlayerHolderBase != null) {
                x2 x2Var3 = this.x;
                long j3 = x2Var3.L.video_id;
                y2 a2 = y2.a(videoPlayerHolderBase, x2Var3);
                x2Var3.c(a2);
                this.y.k(a2, j3);
                x2 x2Var4 = this.x;
                y2 y2Var = x2Var4.M;
                if (y2Var != null) {
                    Bitmap bitmap = y2Var.b;
                    if (bitmap != null) {
                        x2Var4.e.setImageBitmap(bitmap);
                    }
                    this.x.e(false);
                }
                this.w.release(null);
            }
            this.w = null;
            this.x = null;
        }
        if (z10 || x2Var2 == null) {
            return;
        }
        v70 v70Var = x2Var2.a;
        if (x2Var2.O != null && v70Var.w == null) {
            v70Var.w = new w2(x2Var2).with(x2Var2.n);
            TLRPC.Document document = x2Var2.O;
            for (int i11 = 0; i11 < document.attributes.size(); i11++) {
                if (document.attributes.get(i11) instanceof TLRPC.TL_documentAttributeVideo) {
                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i11);
                    x2Var2.h.a(tL_documentAttributeVideo.w / tL_documentAttributeVideo.h, 0);
                }
            }
            TLRPC.WebPage webPage = x2Var2.b.E;
            Uri prepareUri = webPage != null ? FileStreamLoadOperation.prepareUri(((i4) v70Var).X, document, webPage) : null;
            if (prepareUri != null) {
                VideoPlayerHolderBase videoPlayerHolderBase2 = v70Var.w;
                y2 y2Var2 = x2Var2.M;
                videoPlayerHolderBase2.seekTo(y2Var2 == null ? 0L : y2Var2.a);
                v70Var.w.preparePlayer(prepareUri, true, 1.0f);
                v70Var.w.play();
            }
        }
        this.x = x2Var2;
    }

    public final void o(boolean z10, boolean z11) {
        if (this.L == null || this.T0 || !this.V) {
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
        v3 v3Var = this.K;
        if (v3Var != null) {
            v3Var.dismiss(false);
            return;
        }
        if (this.P.getVisibility() == 0) {
            if (this.O != null) {
                this.P.setVisibility(4);
                this.S.onCustomViewHidden();
                this.P.removeView(this.O);
                this.O = null;
            } else {
                org.telegram.ui.Components.b91 b91Var = this.E0;
                if (b91Var != null && b91Var.T) {
                    b91Var.T = false;
                    b91Var.m();
                    b91Var.l(false);
                }
            }
            if (!z11) {
                return;
            }
        }
        if (this.O0.y()) {
            this.O0.f(false);
            return;
        }
        k0 k0Var = this.h0;
        if (k0Var.T) {
            k0Var.h(false);
            return;
        }
        if (k0Var.W) {
            k0Var.k(false);
            return;
        }
        if (this.F0 != 0) {
            ConnectionsManager.getInstance(this.X).cancelRequest(this.F0, true);
            this.F0 = 0;
            b0(false);
        }
        if (this.G0 != 0) {
            ConnectionsManager.getInstance(this.X).cancelRequest(this.G0, true);
            this.G0 = 0;
            b0(false);
        }
        U();
        if (z10 && !z11) {
            ArrayList arrayList = this.d0;
            if (arrayList.size() >= 2) {
                Object z12 = i2.g.z(1, arrayList);
                if (z12 instanceof z2) {
                    ((z2) z12).a();
                }
                if (z12 instanceof TLRPC.WebPage) {
                    org.telegram.ui.web.j2.o((TLRPC.WebPage) z12);
                }
                e0(-1, arrayList.get(arrayList.size() - 1), false);
                return;
            }
        }
        NotificationCenter.getInstance(this.X).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getInstance(this.X).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.X).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.X).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.X).removeObserver(this, NotificationCenter.emojiLoaded);
        kb0 kb0Var = this.U0;
        if (kb0Var != null) {
            kb0Var.destroy();
            this.U0 = null;
        }
        this.M = null;
        try {
            org.telegram.ui.ActionBar.f3 f3Var = this.k0;
            if (f3Var != null) {
                f3Var.dismiss();
                this.k0 = null;
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArticleViewer$WindowView articleViewer$WindowView = this.f0;
        Property property = View.ALPHA;
        animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, (Property<ArticleViewer$WindowView, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.g0, (Property<j0, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.f0, (Property<ArticleViewer$WindowView, Float>) View.TRANSLATION_X, 0.0f, AndroidUtilities.dp(56.0f)));
        this.Z = 2;
        this.a0 = new a0(this, 7);
        animatorSet.setDuration(150L);
        animatorSet.setInterpolator(this.c0);
        animatorSet.addListener(new s0(this, i10));
        this.b0 = System.currentTimeMillis();
        this.g0.setLayerType(2, null);
        animatorSet.start();
        while (true) {
            a0.i iVar = this.y;
            if (i10 >= iVar.m()) {
                iVar.b();
                return;
            }
            y2 y2Var = (y2) iVar.n(i10);
            Bitmap bitmap = y2Var.b;
            if (bitmap != null) {
                bitmap.recycle();
                y2Var.b = null;
            }
            i10++;
        }
    }

    public final void s() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d0;
            if (i10 >= arrayList.size()) {
                arrayList.clear();
                t();
                return;
            }
            Object obj = arrayList.get(i10);
            if (obj instanceof z2) {
                m3 m3Var = this.u0[0];
                if (m3Var != null && m3Var.J == obj) {
                    ((z2) obj).c(m3Var);
                }
                m3 m3Var2 = this.u0[1];
                if (m3Var2 != null && m3Var2.J == obj) {
                    ((z2) obj).c(m3Var2);
                }
                ((z2) obj).a();
            } else if (obj instanceof TLRPC.WebPage) {
                org.telegram.ui.web.j2.o((TLRPC.WebPage) obj);
            }
            i10++;
        }
    }

    public final void t() {
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
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        for (int i10 = 0; i10 < this.N.size(); i10++) {
            ((t1) this.N.get(i10)).a(true);
        }
        this.N.clear();
        try {
            this.L.getWindow().clearFlags(128);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        this.L = null;
        this.M = null;
        c1 = null;
    }

    public i4(org.telegram.ui.ActionBar.n2 n2Var) {
        this.N = new ArrayList();
        this.Y = 1;
        this.c0 = new DecelerateInterpolator(1.5f);
        this.d0 = new ArrayList();
        this.w0 = new Paint();
        this.x0 = new Paint();
        this.y0 = new Paint();
        this.z0 = new Paint();
        this.J0 = false;
        this.K0 = null;
        this.L0 = null;
        this.R0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats});
        this.S0 = new j0[2];
        this.W0 = -1;
        a0 a0Var = new a0(this, 2);
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        this.Z0 = new org.telegram.ui.Components.h5(a0Var, 320L, prVar);
        this.a1 = new org.telegram.ui.Components.h5(new a0(this, 4), 320L, prVar);
        this.J = true;
        this.K = new v3(this, n2Var);
        Y(n2Var.getParentActivity(), n2Var);
    }
}
