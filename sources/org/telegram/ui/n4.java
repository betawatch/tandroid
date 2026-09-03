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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class n4 extends p70 implements NotificationCenter.NotificationCenterDelegate {
    public static TextPaint d1;
    public static TextPaint e1;
    public static TextPaint f1;
    public static TextPaint g1;
    public static TextPaint h1;
    public static TextPaint i1;
    public static TextPaint j1;
    public static TextPaint k1;
    public static Paint l1;
    public static Paint m1;
    public static Paint n1;
    public static Paint o1;
    public static Paint p1;
    public static Paint q1;
    public static Paint r1;
    public static Paint s1;
    public static Paint t1;
    public static Paint u1;
    public static Paint v1;
    public static Paint w1;
    public static Paint y1;
    public org.telegram.ui.Components.e91 A0;
    public org.telegram.ui.Components.e91 B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public final boolean G;
    public boolean G0;
    public final a4 H;
    public e3 H0;
    public Activity I;
    public e3 I0;
    public org.telegram.ui.ActionBar.p2 J;
    public ze.c J0;
    public final ArrayList K;
    public int K0;
    public View L;
    public org.telegram.ui.Cells.l9 L0;
    public FrameLayout M;
    public org.telegram.ui.Cells.l9 M0;
    public TextureView N;
    public cv0 N0;
    public q4 O;
    public final AnimationNotificationsLocker O0;
    public WebChromeClient.CustomViewCallback P;
    public final n0[] P0;
    public WindowInsets Q;
    public boolean Q0;
    public boolean R;
    public kf.t0 R0;
    public boolean S;
    public ah.a S0;
    public boolean T;
    public int T0;
    public int U;
    public ValueAnimator U0;
    public int V;
    public float V0;
    public int W;
    public final org.telegram.ui.Components.c5 W0;
    public Runnable X;
    public final org.telegram.ui.Components.c5 X0;
    public long Y;
    public final DecelerateInterpolator Z;
    public final ArrayList a0;
    public WindowManager.LayoutParams b0;
    public ArticleViewer$WindowView c0;
    public n0 d0;
    public o0 e0;
    public org.telegram.ui.web.k f0;
    public d0 g0;
    public org.telegram.ui.ActionBar.g3 h0;
    public Paint i0;
    public Drawable j0;
    public Paint k0;
    public boolean l0;
    public float m0;
    public dh.d n0;
    public ImageView o0;
    public ImageView p0;
    public org.telegram.ui.Components.k6 q0;
    public r3[] r0;
    public AnimatorSet s0;
    public final Paint t0;
    public final Paint u0;
    public final Paint v0;
    public final Paint w0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout x0;
    public TextView y0;
    public Rect z0;
    public static final HashSet Y0 = new HashSet();
    public static volatile n4 Z0 = null;
    public static final w0 a1 = new w0("innerTranslationX", 0);
    public static final TextPaint b1 = new TextPaint(1);
    public static final v3 c1 = new v3();
    public static final WeakHashMap x1 = new WeakHashMap();

    public n4() {
        this.K = new ArrayList();
        this.V = 1;
        this.Z = new DecelerateInterpolator(1.5f);
        this.a0 = new ArrayList();
        this.t0 = new Paint();
        this.u0 = new Paint();
        this.v0 = new Paint();
        this.w0 = new Paint();
        this.G0 = false;
        this.H0 = null;
        this.I0 = null;
        this.O0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats});
        this.P0 = new n0[2];
        this.T0 = -1;
        d0 d0Var = new d0(this, 2);
        org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.h;
        this.W0 = new org.telegram.ui.Components.c5(d0Var, 320L, mrVar);
        this.X0 = new org.telegram.ui.Components.c5(new d0(this, 4), 320L, mrVar);
        this.G = false;
        this.H = null;
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
        StringBuilder sb = new StringBuilder();
        int size = richText.texts.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb.append(B(richText.texts.get(i10)));
        }
        return sb;
    }

    public static CharSequence C(p70 p70Var, TLRPC.WebPage webPage, View view, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock, int i10) {
        TextPaint E;
        if (richText2 == null) {
            return null;
        }
        if (richText2 instanceof TL_iv.textFixed) {
            return C(p70Var, webPage, view, richText, ((TL_iv.textFixed) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textItalic) {
            return C(p70Var, webPage, view, richText, ((TL_iv.textItalic) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textBold) {
            return C(p70Var, webPage, view, richText, ((TL_iv.textBold) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textUnderline) {
            return C(p70Var, webPage, view, richText, ((TL_iv.textUnderline) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textStrike) {
            return C(p70Var, webPage, view, richText, ((TL_iv.textStrike) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textEmail) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C(p70Var, webPage, view, richText, ((TL_iv.textEmail) richText2).text, pageBlock, i10));
            MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder.length() != 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.o01((metricAffectingSpanArr == null || metricAffectingSpanArr.length == 0) ? E(p70Var, richText, richText2, pageBlock) : null, "mailto:" + F(richText2)), 0, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        long j10 = 0;
        if (richText2 instanceof TL_iv.textUrl) {
            TL_iv.textUrl texturl = (TL_iv.textUrl) richText2;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(C(p70Var, webPage, view, richText, texturl.text, pageBlock, i10));
            MetricAffectingSpan[] metricAffectingSpanArr2 = (MetricAffectingSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), MetricAffectingSpan.class);
            E = (metricAffectingSpanArr2 == null || metricAffectingSpanArr2.length == 0) ? E(p70Var, richText, richText2, pageBlock) : null;
            Object p01Var = texturl.webpage_id != 0 ? new org.telegram.ui.Components.p01(E, F(richText2)) : new org.telegram.ui.Components.o01(E, F(richText2));
            if (spannableStringBuilder2.length() != 0) {
                spannableStringBuilder2.setSpan(p01Var, 0, spannableStringBuilder2.length(), 33);
            }
            return spannableStringBuilder2;
        }
        if (richText2 instanceof TL_iv.textPlain) {
            return ((TL_iv.textPlain) richText2).text;
        }
        if (richText2 instanceof TL_iv.textAnchor) {
            TL_iv.textAnchor textanchor = (TL_iv.textAnchor) richText2;
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(C(p70Var, webPage, view, richText, textanchor.text, pageBlock, i10));
            String str = textanchor.name;
            org.telegram.ui.Components.a5 a5Var = new org.telegram.ui.Components.a5();
            a5Var.a = str.toLowerCase();
            spannableStringBuilder3.setSpan(a5Var, 0, spannableStringBuilder3.length(), 17);
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
                boolean z4 = i10 >= 0 && (richText3 instanceof TL_iv.textUrl) && ((TL_iv.textUrl) richText3).webpage_id != j10;
                if (z4 && spannableStringBuilder4.length() != 0 && spannableStringBuilder4.charAt(spannableStringBuilder4.length() - 1) != '\n') {
                    spannableStringBuilder4.append((CharSequence) " ");
                    spannableStringBuilder4.setSpan(new org.telegram.ui.Cells.n9(), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                }
                CharSequence C = C(p70Var, webPage, view, richText, richText3, pageBlock, i10);
                int D = D(A);
                int length = spannableStringBuilder4.length();
                spannableStringBuilder4.append(C);
                if (D != 0 && !(C instanceof SpannableStringBuilder)) {
                    if ((D & 8) != 0 || (D & 512) != 0) {
                        String F = F(richText3);
                        if (F == null) {
                            F = F(richText);
                        }
                        Object p01Var2 = (D & 512) != 0 ? new org.telegram.ui.Components.p01(E(p70Var, richText, A, pageBlock), F) : new org.telegram.ui.Components.o01(E(p70Var, richText, A, pageBlock), F);
                        if (length != spannableStringBuilder4.length()) {
                            spannableStringBuilder4.setSpan(p01Var2, length, spannableStringBuilder4.length(), 33);
                        }
                    } else if (length != spannableStringBuilder4.length()) {
                        TextPaint E2 = E(p70Var, richText, A, pageBlock);
                        org.telegram.ui.Components.n01 n01Var = new org.telegram.ui.Components.n01();
                        n01Var.a = E2;
                        spannableStringBuilder4.setSpan(n01Var, length, spannableStringBuilder4.length(), 33);
                    }
                }
                if (z4 && i11 != size - 1) {
                    spannableStringBuilder4.append((CharSequence) " ");
                    spannableStringBuilder4.setSpan(new org.telegram.ui.Cells.n9(), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                }
                i11++;
                j10 = 0;
            }
            return spannableStringBuilder4;
        }
        if (richText2 instanceof TL_iv.textSubscript) {
            return C(p70Var, webPage, view, richText, ((TL_iv.textSubscript) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textSuperscript) {
            return C(p70Var, webPage, view, richText, ((TL_iv.textSuperscript) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textMarked) {
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(C(p70Var, webPage, view, richText, ((TL_iv.textMarked) richText2).text, pageBlock, i10));
            MetricAffectingSpan[] metricAffectingSpanArr3 = (MetricAffectingSpan[]) spannableStringBuilder5.getSpans(0, spannableStringBuilder5.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder5.length() != 0) {
                E = (metricAffectingSpanArr3 == null || metricAffectingSpanArr3.length == 0) ? E(p70Var, richText, richText2, pageBlock) : null;
                org.telegram.ui.Components.m01 m01Var = new org.telegram.ui.Components.m01();
                m01Var.a = E;
                spannableStringBuilder5.setSpan(m01Var, 0, spannableStringBuilder5.length(), 33);
            }
            return spannableStringBuilder5;
        }
        if (richText2 instanceof TL_iv.textSpoiler) {
            SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(C(p70Var, webPage, view, richText, ((TL_iv.textSpoiler) richText2).text, pageBlock, i10));
            if (spannableStringBuilder6.length() != 0) {
                org.telegram.ui.Components.s01 s01Var = new org.telegram.ui.Components.s01();
                s01Var.a |= 256;
                spannableStringBuilder6.setSpan(new org.telegram.ui.Components.t01(s01Var, 0), 0, spannableStringBuilder6.length(), 33);
            }
            return spannableStringBuilder6;
        }
        if (richText2 instanceof TL_iv.textPhone) {
            SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(C(p70Var, webPage, view, richText, ((TL_iv.textPhone) richText2).text, pageBlock, i10));
            MetricAffectingSpan[] metricAffectingSpanArr4 = (MetricAffectingSpan[]) spannableStringBuilder7.getSpans(0, spannableStringBuilder7.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder7.length() != 0) {
                spannableStringBuilder7.setSpan(new org.telegram.ui.Components.o01((metricAffectingSpanArr4 == null || metricAffectingSpanArr4.length == 0) ? E(p70Var, richText, richText2, pageBlock) : null, "tel:" + F(richText2)), 0, spannableStringBuilder7.length(), 33);
            }
            return spannableStringBuilder7;
        }
        if (richText2 instanceof TL_iv.textImage) {
            TL_iv.textImage textimage = (TL_iv.textImage) richText2;
            TLRPC.Document a2 = k4.a(webPage, textimage.document_id);
            TLRPC.Photo e = k4.e(webPage, textimage.photo_id);
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
                    ((n4) p70Var).getClass();
                    boolean z10 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, i12, false)) <= 0.705f;
                    org.telegram.ui.Components.l01 l01Var = new org.telegram.ui.Components.l01();
                    Locale locale = Locale.US;
                    String str2 = dp + "_" + dp2 + "_i";
                    l01Var.b = dp;
                    l01Var.c = dp2;
                    boolean z11 = z10;
                    ImageReceiver imageReceiver = new ImageReceiver(view);
                    l01Var.a = imageReceiver;
                    imageReceiver.setInvalidateAll(true);
                    if (z11) {
                        imageReceiver.setDelegate(new org.telegram.ui.Components.lh0(11));
                    }
                    imageReceiver.setImage(ImageLocation.getForDocument(a2), str2, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(a2.thumbs, 90), a2), str2, -1L, null, webPage, 1);
                    spannableStringBuilder8.setSpan(l01Var, 0, spannableStringBuilder8.length(), 33);
                }
                return spannableStringBuilder8;
            }
            if (e instanceof org.telegram.ui.web.g2) {
                org.telegram.ui.web.g2 g2Var = (org.telegram.ui.web.g2) e;
                SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder("*");
                int dp3 = AndroidUtilities.dp(textimage.w);
                int dp4 = AndroidUtilities.dp(textimage.h);
                int abs2 = Math.abs(i10);
                if (dp3 > abs2) {
                    dp4 = (int) (dp4 * (abs2 / dp3));
                    dp3 = abs2;
                }
                if (view != null) {
                    org.telegram.ui.Components.l01 l01Var2 = new org.telegram.ui.Components.l01();
                    l01Var2.b = dp3;
                    l01Var2.c = dp4;
                    ImageReceiver imageReceiver2 = new ImageReceiver(view);
                    l01Var2.a = imageReceiver2;
                    imageReceiver2.setInvalidateAll(true);
                    org.telegram.ui.web.h2.g(g2Var, imageReceiver2, new org.telegram.ui.Components.mc(11));
                    spannableStringBuilder9.setSpan(l01Var2, 0, spannableStringBuilder9.length(), 33);
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
                vh.r a10 = vh.r.a(textmath.source, AndroidUtilities.dp(20.0f), true);
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
                ((n4) p70Var).getClass();
                spannableStringBuilder10.setSpan(new org.telegram.ui.Components.l01(view, bitmap, i13, i14, org.telegram.ui.ActionBar.j6.w0(null, i15, false), textmath.depth), 0, spannableStringBuilder10.length(), 33);
                String str3 = textmath.source;
                if (str3 != null && !str3.isEmpty()) {
                    spannableStringBuilder10.setSpan(new org.telegram.ui.Cells.r9(textmath.source), 0, spannableStringBuilder10.length(), 33);
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

    public static TextPaint E(p70 p70Var, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock) {
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
        n4 n4Var = (n4) p70Var;
        n4Var.getClass();
        v3 v3Var = c1;
        v3Var.getClass();
        SparseArray sparseArray = v3Var.x;
        SparseArray sparseArray2 = v3Var.w;
        SparseArray sparseArray3 = v3Var.t;
        SparseArray sparseArray4 = v3Var.c;
        SparseArray sparseArray5 = v3Var.b;
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
            b10 = p70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockMap) {
            TL_iv.RichText richText4 = ((TL_iv.pageBlockMap) pageBlock).caption.text;
            if (richText4 == richText2 || richText4 == richText) {
                dp6 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            } else {
                dp6 = AndroidUtilities.dp(12.0f);
            }
            dp8 = dp6;
            b10 = p70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockTitle) {
            sparseArray4 = v3Var.d;
            dp8 = AndroidUtilities.dp(23.0f);
            b10 = p70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockKicker) {
            sparseArray4 = v3Var.e;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = p70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockAuthorDate) {
            sparseArray4 = v3Var.o;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = p70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockFooter) {
            sparseArray4 = v3Var.p;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = p70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockSubtitle) {
            sparseArray4 = v3Var.g;
            dp8 = AndroidUtilities.dp(20.0f);
            b10 = p70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
            sparseArray4 = v3Var.f;
            dp8 = AndroidUtilities.dp(20.0f);
            b10 = p70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
            sparseArray4 = v3Var.h;
            dp8 = AndroidUtilities.dp(17.0f);
            b10 = p70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            sparseArray4 = v3Var.i;
            dp8 = AndroidUtilities.dp(18.0f);
            b10 = p70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            sparseArray4 = v3Var.j;
            dp8 = AndroidUtilities.dp(16.0f);
            b10 = p70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            sparseArray4 = v3Var.k;
            dp8 = AndroidUtilities.dp(15.0f);
            b10 = p70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            sparseArray4 = v3Var.l;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = p70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            sparseArray4 = v3Var.m;
            dp8 = AndroidUtilities.dp(13.0f);
            b10 = p70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            sparseArray4 = v3Var.n;
            dp8 = AndroidUtilities.dp(12.0f);
            b10 = p70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
            if (pageblockblockquote.text == richText) {
                dp8 = AndroidUtilities.dp(15.0f);
                b10 = p70Var.b();
                sparseArray4 = sparseArray3;
            } else {
                if (pageblockblockquote.caption == richText) {
                    dp8 = AndroidUtilities.dp(14.0f);
                    b10 = p70Var.a();
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
                b10 = p70Var.b();
                sparseArray4 = sparseArray3;
            } else {
                if (pageblockpullquote.caption == richText) {
                    dp8 = AndroidUtilities.dp(14.0f);
                    b10 = p70Var.a();
                    sparseArray3 = sparseArray5;
                    sparseArray4 = sparseArray3;
                }
                b10 = -65536;
                sparseArray3 = null;
                sparseArray4 = sparseArray3;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            sparseArray4 = v3Var.s;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = p70Var.b();
            D |= 4;
        } else if (pageBlock instanceof TL_iv.pageBlockParagraph) {
            sparseArray4 = v3Var.q;
            dp8 = AndroidUtilities.dp(16.0f);
            b10 = p70Var.b();
        } else if (L(pageBlock)) {
            sparseArray4 = v3Var.r;
            dp8 = AndroidUtilities.dp(16.0f);
            b10 = p70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockEmbed) {
            TL_iv.RichText richText5 = ((TL_iv.pageBlockEmbed) pageBlock).caption.text;
            if (richText5 == richText2 || richText5 == richText) {
                dp5 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            } else {
                dp5 = AndroidUtilities.dp(12.0f);
            }
            dp8 = dp5;
            b10 = p70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.RichText richText6 = ((TL_iv.pageBlockSlideshow) pageBlock).caption.text;
            if (richText6 == richText2 || richText6 == richText) {
                dp4 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            } else {
                dp4 = AndroidUtilities.dp(12.0f);
            }
            dp8 = dp4;
            b10 = p70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
            TL_iv.RichText richText7 = ((TL_iv.pageBlockCollage) pageBlock).caption.text;
            if (richText7 == richText2 || richText7 == richText) {
                dp3 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            } else {
                dp3 = AndroidUtilities.dp(12.0f);
            }
            dp8 = dp3;
            b10 = p70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockEmbedPost) {
            TL_iv.PageCaption pageCaption = ((TL_iv.pageBlockEmbedPost) pageBlock).caption;
            if (richText2 == pageCaption.text) {
                dp8 = AndroidUtilities.dp(14.0f);
                b10 = p70Var.a();
                sparseArray4 = sparseArray5;
            } else if (richText2 == pageCaption.credit) {
                dp8 = AndroidUtilities.dp(12.0f);
                b10 = p70Var.a();
            } else {
                if (richText2 != null) {
                    sparseArray4 = v3Var.u;
                    dp8 = AndroidUtilities.dp(14.0f);
                    b10 = p70Var.b();
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
                b10 = p70Var.b();
            } else if (pageBlock instanceof TL_iv.pageBlockAudio) {
                if (richText2 == ((TL_iv.pageBlockAudio) pageBlock).caption.text) {
                    dp = AndroidUtilities.dp(14.0f);
                    sparseArray = sparseArray2;
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                }
                dp8 = dp;
                b10 = p70Var.b();
            } else if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                sparseArray4 = v3Var.y;
                dp8 = AndroidUtilities.dp(15.0f);
                b10 = p70Var.a();
            } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                sparseArray4 = v3Var.z;
                dp8 = AndroidUtilities.dp(15.0f);
                b10 = p70Var.b();
            } else {
                if (pageBlock instanceof TL_iv.pageBlockTable) {
                    sparseArray4 = v3Var.A;
                    dp8 = AndroidUtilities.dp(15.0f);
                    b10 = p70Var.b();
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
            if (v3Var.a == null) {
                TextPaint textPaint = new TextPaint(1);
                v3Var.a = textPaint;
                textPaint.setColor(-65536);
            }
            v3Var.a.setTextSize(AndroidUtilities.dp(14.0f));
            return v3Var.a;
        }
        TextPaint textPaint2 = (TextPaint) sparseArray4.get(D);
        if (textPaint2 == null) {
            textPaint2 = new TextPaint(1);
            if ((D & 4) != 0) {
                textPaint2.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
            } else if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                textPaint2.setTypeface(AndroidUtilities.bold());
            } else if (p70Var.a != 1 && !(pageBlock instanceof TL_iv.pageBlockTitle) && !(pageBlock instanceof TL_iv.pageBlockKicker) && !(pageBlock instanceof TL_iv.pageBlockHeader) && !(pageBlock instanceof TL_iv.pageBlockSubtitle) && !(pageBlock instanceof TL_iv.pageBlockSubheader) && !K(pageBlock)) {
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
                n4Var.getClass();
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
        return Z0 != null;
    }

    public static boolean K(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
    }

    public static boolean L(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof d4) || (pageBlock instanceof f4);
    }

    public static boolean O(b4 b4Var) {
        boolean z4;
        TL_iv.PageBlock z10 = z(b4Var.a);
        if (z10 instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) z10;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                return true;
            }
        } else if (z10 instanceof b4) {
            b4 b4Var2 = (b4) z10;
            TL_iv.PageBlock z11 = z(b4Var2.b);
            if (z11 instanceof TL_iv.pageBlockDetails) {
                TL_iv.pageBlockDetails pageblockdetails2 = (TL_iv.pageBlockDetails) z11;
                if (!pageblockdetails2.open) {
                    pageblockdetails2.open = true;
                    z4 = true;
                    if (!O(b4Var2) || z4) {
                        return true;
                    }
                }
            }
            z4 = false;
            if (!O(b4Var2)) {
            }
            return true;
        }
        return false;
    }

    public static void T(p70 p70Var) {
        if (p70Var.b == null && p70Var.f == null) {
            return;
        }
        View view = p70Var.f;
        p70Var.c.d(true);
        p70Var.b = null;
        p70Var.d = null;
        p70Var.f = null;
        if (view != null) {
            view.invalidate();
        }
    }

    public static /* synthetic */ WindowInsets e(WindowInsets windowInsets) {
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public static void f(String str, int i10, FrameLayout frameLayout, a4 a4Var, org.telegram.ui.ActionBar.f6 f6Var) {
        String v = org.telegram.ui.web.c1.v(str);
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
        new org.telegram.ui.Components.qc(frameLayout, f6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.WebBookmarkedToast), new gg.y1(a4Var, clientUserId, 14))).k(true);
    }

    public static void g0(n4 n4Var) {
        TextPaint textPaint = j1;
        if (textPaint != null) {
            textPaint.setColor(n4Var.b());
        }
        TextPaint textPaint2 = k1;
        if (textPaint2 != null) {
            textPaint2.setColor(n4Var.b());
        }
        TextPaint textPaint3 = d1;
        if (textPaint3 != null) {
            textPaint3.setColor(n4Var.b());
        }
        TextPaint textPaint4 = f1;
        if (textPaint4 != null) {
            textPaint4.setColor(n4Var.b());
        }
        TextPaint textPaint5 = g1;
        if (textPaint5 != null) {
            textPaint5.setColor(-1);
        }
        TextPaint textPaint6 = h1;
        if (textPaint6 != null) {
            textPaint6.setColor(n4Var.b());
        }
        TextPaint textPaint7 = i1;
        if (textPaint7 != null) {
            textPaint7.setColor(n4Var.a());
        }
        TextPaint textPaint8 = e1;
        if (textPaint8 != null) {
            textPaint8.setColor(n4Var.a());
        }
        r(n4Var, true);
        v3 v3Var = c1;
        v3.a(n4Var, v3Var.d);
        v3.a(n4Var, v3Var.e);
        v3.a(n4Var, v3Var.g);
        v3.a(n4Var, v3Var.f);
        v3.a(n4Var, v3Var.h);
        v3.a(n4Var, v3Var.i);
        v3.a(n4Var, v3Var.j);
        v3.a(n4Var, v3Var.k);
        v3.a(n4Var, v3Var.l);
        v3.a(n4Var, v3Var.m);
        v3.a(n4Var, v3Var.n);
        v3.a(n4Var, v3Var.t);
        v3.a(n4Var, v3Var.s);
        v3.a(n4Var, v3Var.q);
        v3.a(n4Var, v3Var.r);
        v3.a(n4Var, v3Var.u);
        v3.a(n4Var, v3Var.w);
        v3.a(n4Var, v3Var.x);
        v3.a(n4Var, v3Var.b);
        v3.a(n4Var, v3Var.c);
        v3.a(n4Var, v3Var.o);
        v3.a(n4Var, v3Var.p);
        v3.a(n4Var, v3Var.v);
        v3.a(n4Var, v3Var.y);
        v3.a(n4Var, v3Var.z);
        v3.a(n4Var, v3Var.A);
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

    public static CharSequence j(p70 p70Var, l4 l4Var, f3 f3Var) {
        StaticLayout staticLayout;
        if (f3Var == null || (staticLayout = f3Var.d) == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = f3Var.y;
        if (spannableStringBuilder != null) {
            return spannableStringBuilder;
        }
        CharSequence text = staticLayout.getText();
        if (!(text instanceof Spannable)) {
            return text;
        }
        Spannable spannable = (Spannable) text;
        org.telegram.ui.Components.o01[] o01VarArr = (org.telegram.ui.Components.o01[]) spannable.getSpans(0, spannable.length(), org.telegram.ui.Components.o01.class);
        CharSequence charSequence = text;
        if (o01VarArr != null) {
            charSequence = text;
            if (o01VarArr.length != 0) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannable);
                for (org.telegram.ui.Components.o01 o01Var : o01VarArr) {
                    int spanStart = spannableStringBuilder2.getSpanStart(o01Var);
                    int spanEnd = spannableStringBuilder2.getSpanEnd(o01Var);
                    if (spanStart >= 0 && spanEnd > spanStart) {
                        spannableStringBuilder2.setSpan(new r0(p70Var, l4Var, o01Var, 0), spanStart, spanEnd, 33);
                    }
                }
                f3Var.y = spannableStringBuilder2;
                charSequence = spannableStringBuilder2;
            }
        }
        return charSequence;
    }

    public static TL_iv.PageBlock j0(TL_iv.PageBlock pageBlock, b4 b4Var) {
        if (pageBlock instanceof d4) {
            d4 d4Var = (d4) pageBlock;
            d4 d4Var2 = new d4();
            d4Var2.a = d4Var.a;
            d4Var2.b = d4Var.b;
            d4Var2.c = d4Var.c;
            d4Var2.d = j0(d4Var.d, b4Var);
            return d4Var2;
        }
        if (!(pageBlock instanceof f4)) {
            return b4Var;
        }
        f4 f4Var = (f4) pageBlock;
        f4 f4Var2 = new f4();
        f4Var2.a = f4Var.a;
        f4Var2.b = f4Var.b;
        f4Var2.c = f4Var.c;
        f4Var2.d = j0(f4Var.d, b4Var);
        return f4Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x0252, code lost:
    
        if (r0.isShowing() == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x018b, code lost:
    
        r17 = new android.graphics.Path();
        r0 = r29.F;
        r5 = r0.size();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0197, code lost:
    
        if (r6 >= r5) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0199, code lost:
    
        r8 = r0.get(r6);
        r6 = r6 + 1;
        r8 = ((ih.k) r8).getBounds();
        r17.addRect(r8.left, r8.top, r8.right, r8.bottom, android.graphics.Path.Direction.CW);
        r17 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01c3, code lost:
    
        r17.computeBounds(new android.graphics.RectF(), false);
        r0 = (float) java.lang.Math.sqrt((r0.height() * r0.height()) + (r0.width() * r0.width()));
        ((ih.k) r29.F.get(0)).q = new org.telegram.ui.f0(r28, r29);
        r3 = r29.F;
        r5 = r3.size();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0200, code lost:
    
        if (r6 >= r5) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0202, code lost:
    
        r8 = r3.get(r6);
        r6 = r6 + 1;
        ((ih.k) r8).j(r7, r4, r0, false);
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
    public static boolean l(p70 p70Var, l4 l4Var, MotionEvent motionEvent, View view, f3 f3Var, int i10, int i11) {
        org.telegram.ui.Cells.l9 l9Var;
        n4 n4Var;
        Object obj;
        n4 n4Var2;
        org.telegram.ui.Cells.l9 l9Var2;
        org.telegram.ui.Components.t01[] t01VarArr;
        boolean z4 = ((n4) p70Var).s0 == null;
        org.telegram.ui.Components.c90 c90Var = p70Var.c;
        if (!z4 || view == null) {
            return false;
        }
        n4 n4Var3 = (n4) p70Var;
        if (view.getTag() == null || view.getTag() != "bottomSheet" || (l9Var = n4Var3.M0) == null) {
            l9Var = n4Var3.L0;
        }
        if (l9Var != null && !l9Var.g0(view)) {
            return false;
        }
        p70Var.f = view;
        if (f3Var != null) {
            StaticLayout staticLayout = f3Var.d;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                int lineCount = staticLayout.getLineCount();
                float f10 = 2.14748365E9f;
                float f11 = 0.0f;
                for (int i12 = 0; i12 < lineCount; i12++) {
                    f11 = Math.max(staticLayout.getLineWidth(i12), f11);
                    f10 = Math.min(staticLayout.getLineLeft(i12), f10);
                }
                float f12 = x10;
                float f13 = i10 + f10;
                if (f12 >= f13 && f12 <= f13 + f11 && y10 >= i11 && y10 <= staticLayout.getHeight() + i11) {
                    p70Var.d = f3Var;
                    p70Var.e = i11;
                    if (staticLayout.getText() instanceof Spannable) {
                        int i13 = x10 - i10;
                        int i14 = y10 - i11;
                        try {
                            int lineForVertical = staticLayout.getLineForVertical(i14);
                            float f14 = i13;
                            int offsetForHorizontal = staticLayout.getOffsetForHorizontal(lineForVertical, f14);
                            float lineLeft = staticLayout.getLineLeft(lineForVertical);
                            if (lineLeft <= f14 && lineLeft + staticLayout.getLineWidth(lineForVertical) >= f14) {
                                Spannable spannable = (Spannable) staticLayout.getText();
                                org.telegram.ui.Components.o01[] o01VarArr = (org.telegram.ui.Components.o01[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, org.telegram.ui.Components.o01.class);
                                if (o01VarArr == null || o01VarArr.length <= 0) {
                                    n4Var = n4Var3;
                                    obj = "bottomSheet";
                                } else {
                                    org.telegram.ui.Components.o01 o01Var = o01VarArr[0];
                                    int spanStart = spannable.getSpanStart(o01Var);
                                    n4Var = n4Var3;
                                    obj = "bottomSheet";
                                    int spanEnd = spannable.getSpanEnd(o01Var);
                                    int i15 = 1;
                                    while (i15 < o01VarArr.length) {
                                        try {
                                            org.telegram.ui.Components.o01 o01Var2 = o01VarArr[i15];
                                            org.telegram.ui.Components.o01[] o01VarArr2 = o01VarArr;
                                            int spanStart2 = spannable.getSpanStart(o01Var2);
                                            int i16 = i15;
                                            int spanEnd2 = spannable.getSpanEnd(o01Var2);
                                            if (spanStart > spanStart2 || spanEnd2 > spanEnd) {
                                                spanStart = spanStart2;
                                                o01Var = o01Var2;
                                                spanEnd = spanEnd2;
                                            }
                                            i15 = i16 + 1;
                                            o01VarArr = o01VarArr2;
                                        } catch (Exception e) {
                                            e = e;
                                            FileLog.e(e);
                                            if (motionEvent.getAction() == 0) {
                                            }
                                            if (motionEvent.getAction() != 0) {
                                            }
                                            if (!(view instanceof p1)) {
                                            }
                                        }
                                    }
                                    org.telegram.ui.Components.g90 g90Var = p70Var.b;
                                    if (g90Var == null || g90Var.i != o01Var) {
                                        if (g90Var != null) {
                                            c90Var.k(g90Var, true);
                                        }
                                        org.telegram.ui.Components.g90 g90Var2 = new org.telegram.ui.Components.g90(o01Var, null, f12, y10, 0);
                                        p70Var.b = g90Var2;
                                        g90Var2.d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.K6, false) & 872415231);
                                        c90Var.a(p70Var.b, p70Var.d);
                                        try {
                                            org.telegram.ui.Components.y80 b10 = p70Var.b.b();
                                            b10.d(staticLayout, spanStart, 0.0f);
                                            TextPaint textPaint = o01Var.a;
                                            int i17 = textPaint != null ? textPaint.baselineShift : 0;
                                            b10.o = i17 != 0 ? i17 + AndroidUtilities.dp(i17 > 0 ? 5.0f : -2.0f) : 0;
                                            staticLayout.getSelectionPath(spanStart, spanEnd, b10);
                                            view.invalidate();
                                        } catch (Exception e6) {
                                            FileLog.e(e6);
                                        }
                                    }
                                }
                                ArrayList arrayList = f3Var.F;
                                if (arrayList != null && !arrayList.isEmpty() && (t01VarArr = (org.telegram.ui.Components.t01[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, org.telegram.ui.Components.t01.class)) != null) {
                                    int i18 = 0;
                                    while (true) {
                                        if (i18 >= t01VarArr.length) {
                                            break;
                                        }
                                        if (t01VarArr[i18].c()) {
                                            break;
                                        }
                                        i18++;
                                    }
                                }
                            }
                        } catch (Exception e10) {
                            e = e10;
                            n4Var = n4Var3;
                            obj = "bottomSheet";
                        }
                    }
                }
            } else {
                n4Var = n4Var3;
                obj = "bottomSheet";
                if (motionEvent.getAction() == 1) {
                    org.telegram.ui.Components.g90 g90Var3 = p70Var.b;
                    if (g90Var3 != null) {
                        p70Var.c(l4Var, (org.telegram.ui.Components.o01) g90Var3.i);
                        T(p70Var);
                    }
                } else if (motionEvent.getAction() == 3) {
                    org.telegram.ui.ActionBar.p1 p1Var = p70Var.E;
                    if (p1Var != null) {
                    }
                    T(p70Var);
                }
            }
            if (motionEvent.getAction() == 0) {
                float x11 = motionEvent.getX();
                float y11 = motionEvent.getY();
                n4Var2 = n4Var;
                if (!n4Var2.G0) {
                    n4Var2.G0 = true;
                    if (n4Var2.I0 == null) {
                        n4Var2.I0 = new e3(n4Var2, 1);
                    }
                    if (view.getTag() == null || view.getTag() != obj || (l9Var2 = n4Var2.M0) == null) {
                        n4Var2.L0.l0(view, (int) x11, (int) y11);
                    } else {
                        l9Var2.l0(view, (int) x11, (int) y11);
                    }
                    n4Var2.c0.postDelayed(n4Var2.I0, ViewConfiguration.getTapTimeout());
                    if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                        n4Var2.k();
                    }
                    return !(view instanceof p1) ? p70Var.b != null : p70Var.d != null;
                }
            } else {
                n4Var2 = n4Var;
            }
            if (motionEvent.getAction() != 0) {
                n4Var2.k();
            }
            if (!(view instanceof p1)) {
            }
        }
        n4Var = n4Var3;
        obj = "bottomSheet";
        if (motionEvent.getAction() == 0) {
        }
        if (motionEvent.getAction() != 0) {
        }
        if (!(view instanceof p1)) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:52|53|54|(3:58|(3:(2:62|63)(2:65|66)|64|59)|67)|69|70|71|(11:75|76|77|(5:80|(1:82)(1:92)|(3:(1:85)(1:89)|86|87)(2:90|91)|88|78)|93|94|96|97|(7:101|102|103|(5:106|(1:108)(1:118)|(3:(1:111)(1:115)|112|113)(2:116|117)|114|104)|119|120|121)|154|121)|158|96|97|(8:99|101|102|103|(1:104)|119|120|121)|154|121) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x036a A[Catch: Exception -> 0x0382, TryCatch #3 {Exception -> 0x0382, blocks: (B:103:0x0364, B:104:0x0367, B:106:0x036a, B:108:0x037f, B:112:0x038e, B:114:0x0396, B:120:0x039f), top: B:102:0x0364 }] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v8, types: [android.graphics.Path, org.telegram.ui.Components.y80] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.text.Layout, android.text.StaticLayout] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r9v11, types: [android.graphics.Path, org.telegram.ui.Components.y80] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static f3 p(p70 p70Var, View view, CharSequence charSequence, TL_iv.RichText richText, int i10, int i11, TL_iv.PageBlock pageBlock, Layout.Alignment alignment, int i12, l4 l4Var) {
        p70 p70Var2;
        CharSequence C;
        TL_iv.RichText richText2;
        TL_iv.PageBlock pageBlock2;
        TextPaint E;
        ?? r42;
        CharSequence charSequence2;
        StaticLayout staticLayout;
        ?? r12;
        org.telegram.ui.Components.y80 y80Var;
        org.telegram.ui.Components.y80 y80Var2;
        View view2;
        TL_iv.RichText richText3;
        TL_iv.PageBlock pageBlock3;
        int i13;
        ?? r13;
        org.telegram.ui.Components.y80 y80Var3;
        org.telegram.ui.Components.m01[] m01VarArr;
        ?? y80Var4;
        int i14;
        org.telegram.ui.Components.p01[] p01VarArr;
        l4 l4Var2;
        if (charSequence == null && (richText == null || (richText instanceof TL_iv.textEmpty))) {
            return null;
        }
        int dp = i10 < 0 ? AndroidUtilities.dp(10.0f) : i10;
        if (charSequence != null) {
            p70Var2 = p70Var;
            richText2 = richText;
            C = charSequence;
            pageBlock2 = pageBlock;
        } else {
            p70Var2 = p70Var;
            C = C(p70Var2, l4Var != null ? l4Var.B : null, view, richText, richText, pageBlock, dp);
            richText2 = richText;
            pageBlock2 = pageBlock;
        }
        if (!TextUtils.isEmpty(C)) {
            int dp2 = AndroidUtilities.dp(SharedConfig.ivFontSize - 16);
            if ((pageBlock2 instanceof TL_iv.pageBlockEmbedPost) && richText2 == null) {
                if (((TL_iv.pageBlockEmbedPost) pageBlock2).author == charSequence) {
                    if (d1 == null) {
                        TextPaint textPaint = new TextPaint(1);
                        d1 = textPaint;
                        textPaint.setColor(p70Var2.b());
                    }
                    d1.setTextSize(AndroidUtilities.dp(15.0f) + dp2);
                    E = d1;
                } else {
                    if (e1 == null) {
                        TextPaint textPaint2 = new TextPaint(1);
                        e1 = textPaint2;
                        textPaint2.setColor(p70Var2.a());
                    }
                    e1.setTextSize(AndroidUtilities.dp(14.0f) + dp2);
                    E = e1;
                }
            } else if (pageBlock2 instanceof TL_iv.pageBlockChannel) {
                if (f1 == null) {
                    TextPaint textPaint3 = new TextPaint(1);
                    f1 = textPaint3;
                    textPaint3.setTypeface(AndroidUtilities.bold());
                    TextPaint textPaint4 = new TextPaint(1);
                    g1 = textPaint4;
                    textPaint4.setTypeface(AndroidUtilities.bold());
                }
                f1.setColor(p70Var2.b());
                f1.setTextSize(AndroidUtilities.dp(15.0f));
                g1.setColor(-1);
                g1.setTextSize(AndroidUtilities.dp(15.0f));
                E = (l4Var == null || l4Var.C == null) ? f1 : g1;
            } else if (pageBlock2 instanceof h4) {
                h4 h4Var = (h4) pageBlock2;
                if (charSequence == h4Var.a.articles.get(h4Var.b).title) {
                    if (h1 == null) {
                        TextPaint textPaint5 = new TextPaint(1);
                        h1 = textPaint5;
                        textPaint5.setTypeface(AndroidUtilities.bold());
                    }
                    h1.setColor(p70Var2.b());
                    h1.setTextSize(AndroidUtilities.dp(15.0f) + dp2);
                    E = h1;
                } else {
                    if (i1 == null) {
                        i1 = new TextPaint(1);
                    }
                    i1.setColor(p70Var2.a());
                    i1.setTextSize(AndroidUtilities.dp(14.0f) + dp2);
                    E = i1;
                }
            } else if (!L(pageBlock2) || charSequence == null) {
                E = E(p70Var2, richText2, richText2, pageBlock2);
            } else {
                if (j1 == null) {
                    TextPaint textPaint6 = new TextPaint(1);
                    j1 = textPaint6;
                    textPaint6.setColor(p70Var2.b());
                }
                if (k1 == null) {
                    TextPaint textPaint7 = new TextPaint(1);
                    k1 = textPaint7;
                    textPaint7.setColor(p70Var2.b());
                }
                j1.setTextSize(AndroidUtilities.dp(19.0f) + dp2);
                k1.setTextSize(AndroidUtilities.dp(16.0f) + dp2);
                E = (!(pageBlock2 instanceof d4) || ((d4) pageBlock2).c.a.ordered) ? k1 : j1;
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
                r12 = org.telegram.ui.Components.kw0.c(replaceEmoji, textPaint9, dp, Layout.Alignment.ALIGN_CENTER, 0.0f, false, TextUtils.TruncateAt.END, dp, i12, true);
            } else {
                TextPaint textPaint10 = E;
                r42 = 1;
                r12 = org.telegram.ui.Components.kw0.c(replaceEmoji, textPaint10, dp, alignment, AndroidUtilities.dp(4.0f), false, TextUtils.TruncateAt.END, dp, i12, true);
            }
            if (r12 != 0) {
                CharSequence text = r12.getText();
                if (i11 >= 0 && !p70Var2.B.isEmpty() && p70Var2.C != null && (l4Var2 = ((n4) p70Var2).r0[0].c) != null) {
                    String lowerCase = replaceEmoji.toString().toLowerCase();
                    int i15 = 0;
                    while (true) {
                        int indexOf = lowerCase.indexOf(p70Var2.C, i15);
                        if (indexOf < 0) {
                            break;
                        }
                        int length = p70Var2.C.length() + indexOf;
                        if (indexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(indexOf - 1))) {
                            l4Var2.y.put(p70Var2.C + pageBlock2 + richText2 + indexOf, Integer.valueOf(r12.getLineTop(r12.getLineForOffset(indexOf)) + i11));
                        }
                        i15 = length;
                    }
                }
                boolean z4 = text instanceof Spanned;
                if (z4) {
                    Spanned spanned = (Spanned) text;
                    try {
                        org.telegram.ui.Components.a5[] a5VarArr = (org.telegram.ui.Components.a5[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.a5.class);
                        int lineCount = r12.getLineCount();
                        if (a5VarArr != null && a5VarArr.length > 0) {
                            for (int i16 = 0; i16 < a5VarArr.length; i16++) {
                                if (lineCount <= r42) {
                                    l4Var.n.put(a5VarArr[i16].a, Integer.valueOf(i11));
                                } else {
                                    HashMap hashMap = l4Var.n;
                                    org.telegram.ui.Components.a5 a5Var = a5VarArr[i16];
                                    hashMap.put(a5Var.a, Integer.valueOf(i11 + r12.getLineTop(r12.getLineForOffset(spanned.getSpanStart(a5Var)))));
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                    try {
                        p01VarArr = (org.telegram.ui.Components.p01[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.p01.class);
                    } catch (Exception unused2) {
                    }
                    if (p01VarArr != null && p01VarArr.length > 0) {
                        r13 = new org.telegram.ui.Components.y80(0);
                        try {
                            r13.n = false;
                            for (int i17 = 0; i17 < p01VarArr.length; i17++) {
                                int spanStart = spanned.getSpanStart(p01VarArr[i17]);
                                int spanEnd = spanned.getSpanEnd(p01VarArr[i17]);
                                r13.d(r12, spanStart, 0.0f);
                                TextPaint textPaint11 = p01VarArr[i17].a;
                                int i18 = textPaint11 != null ? textPaint11.baselineShift : 0;
                                r13.o = i18 != 0 ? i18 + AndroidUtilities.dp(i18 > 0 ? 5.0f : -2.0f) : 0;
                                r12.getSelectionPath(spanStart, spanEnd, r13);
                            }
                            r13.n = r42;
                        } catch (Exception unused3) {
                        }
                        m01VarArr = (org.telegram.ui.Components.m01[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.m01.class);
                        if (m01VarArr != null && m01VarArr.length > 0) {
                            y80Var4 = new org.telegram.ui.Components.y80(0);
                            try {
                                y80Var4.n = false;
                                for (i14 = 0; i14 < m01VarArr.length; i14++) {
                                    int spanStart2 = spanned.getSpanStart(m01VarArr[i14]);
                                    int spanEnd2 = spanned.getSpanEnd(m01VarArr[i14]);
                                    y80Var4.d(r12, spanStart2, 0.0f);
                                    TextPaint textPaint12 = m01VarArr[i14].a;
                                    int i19 = textPaint12 != null ? textPaint12.baselineShift : 0;
                                    y80Var4.o = i19 != 0 ? i19 + AndroidUtilities.dp(i19 > 0 ? 5.0f : -2.0f) : 0;
                                    r12.getSelectionPath(spanStart2, spanEnd2, y80Var4);
                                }
                                y80Var4.n = r42;
                                y80Var3 = y80Var4;
                            } catch (Exception unused4) {
                                y80Var3 = y80Var4;
                            }
                            y80Var = y80Var3;
                            y80Var2 = r13;
                        }
                        y80Var3 = null;
                        y80Var = y80Var3;
                        y80Var2 = r13;
                    }
                    r13 = 0;
                    m01VarArr = (org.telegram.ui.Components.m01[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.m01.class);
                    if (m01VarArr != null) {
                        y80Var4 = new org.telegram.ui.Components.y80(0);
                        y80Var4.n = false;
                        while (i14 < m01VarArr.length) {
                        }
                        y80Var4.n = r42;
                        y80Var3 = y80Var4;
                        y80Var = y80Var3;
                        y80Var2 = r13;
                    }
                    y80Var3 = null;
                    y80Var = y80Var3;
                    y80Var2 = r13;
                } else {
                    y80Var = null;
                    y80Var2 = null;
                }
                f3 f3Var = new f3(p70Var2);
                f3Var.d = r12;
                f3Var.e = y80Var2;
                f3Var.f = y80Var;
                f3Var.n = pageBlock2;
                f3Var.r = richText2;
                f3Var.G = new Stack();
                f3Var.F = new ArrayList();
                f3Var.H = new AtomicReference();
                if (z4) {
                    view2 = view;
                    richText3 = richText;
                    pageBlock3 = pageBlock;
                    i13 = 1;
                    ih.k.a(view2, r12, -1, -1, (Spanned) text, f3Var.G, f3Var.F, null);
                } else {
                    view2 = view;
                    richText3 = richText2;
                    pageBlock3 = pageBlock2;
                    i13 = 1;
                }
                if (view2 != null) {
                    WeakHashMap weakHashMap = x1;
                    ArrayList arrayList = (ArrayList) weakHashMap.get(view2);
                    if (arrayList != null) {
                        int i20 = 0;
                        while (i20 < arrayList.size()) {
                            f3 f3Var2 = (f3) arrayList.get(i20);
                            if (f3Var2.n != pageBlock3 || (richText3 != null && f3Var2.r == richText3)) {
                                f3Var2.detach(view2);
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
                        arrayList.add(f3Var);
                    }
                    if (view2.isAttachedToWindow()) {
                        f3Var.attach(view2);
                    }
                }
                return f3Var;
            }
        }
        return null;
    }

    public static f3 q(p70 p70Var, View view, CharSequence charSequence, TL_iv.RichText richText, int i10, int i11, TL_iv.PageBlock pageBlock, l4 l4Var) {
        return p(p70Var, view, charSequence, richText, i10, i11, pageBlock, Layout.Alignment.ALIGN_NORMAL, 0, l4Var);
    }

    public static void r(n4 n4Var, boolean z4) {
        if (n1 == null) {
            n1 = new Paint();
            m1 = new Paint();
            Paint paint = new Paint(1);
            p1 = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            p1.setStrokeWidth(AndroidUtilities.dp(1.0f));
            Paint paint2 = new Paint();
            q1 = paint2;
            paint2.setStyle(style);
            q1.setStrokeWidth(AndroidUtilities.dp(1.0f) / 2.0f);
            r1 = new Paint();
            s1 = new Paint();
            t1 = new Paint();
            u1 = new Paint(1);
            v1 = new Paint(1);
            l1 = new Paint();
            o1 = new Paint();
            w1 = new Paint(1);
        } else if (!z4) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false);
        v1.setColor(e2.c.v((float) Color.blue(w02), 0.0722f, (((float) Color.green(w02)) * 0.7152f) + (((float) Color.red(w02)) * 0.2126f), 255.0f) <= 0.705f ? -3041234 : -6551);
        Paint paint3 = u1;
        int i10 = org.telegram.ui.ActionBar.j6.K6;
        paint3.setColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false) & 872415231);
        u1.setPathEffect(org.telegram.ui.Components.y80.c());
        t1.setColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false) & 872415231);
        t1.setPathEffect(org.telegram.ui.Components.y80.c());
        Paint paint4 = q1;
        int i11 = org.telegram.ui.ActionBar.j6.k6;
        paint4.setColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        p1.setColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        l1.setColor(251658240);
        o1.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d7, false));
        w1.setColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false) & 872415231);
        w1.setPathEffect(org.telegram.ui.Components.y80.c());
        int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.M6, false);
        int red = Color.red(w03);
        int green = Color.green(w03);
        int blue = Color.blue(w03);
        s1.setColor(Color.argb(20, red, green, blue));
        r1.setColor(Color.argb(34, red, green, blue));
        int w04 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        m1.setColor(Color.argb(20, Color.red(w04), Color.green(w04), Color.blue(w04)));
        n1.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Uc, false));
    }

    public static void u(Canvas canvas, p70 p70Var, TL_iv.PageBlock pageBlock, int i10) {
        if (pageBlock == null || p70Var == null || n1 == null) {
            return;
        }
        int i11 = 0;
        int dp = i10 - (pageBlock.bottom ? AndroidUtilities.dp(6.0f) : 0);
        int i12 = pageBlock.quoteLevels;
        if (i12 == 0) {
            if (pageBlock.level > 0) {
                canvas.drawRect(AndroidUtilities.dp(18), 0.0f, AndroidUtilities.dp(2.0f) + r0, dp, n1);
                return;
            }
            return;
        }
        while (i12 != 0) {
            if ((i12 & 1) != 0) {
                canvas.drawRect(AndroidUtilities.dp((i11 * 14) + 18), 0.0f, AndroidUtilities.dp(2.0f) + r0, dp, n1);
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
    public static void v(p70 p70Var, Canvas canvas, org.telegram.ui.Cells.k9 k9Var, int i10) {
        org.telegram.ui.Cells.l9 l9Var;
        View view = (View) k9Var;
        n4 n4Var = (n4) p70Var;
        if (view != null) {
            n4Var.getClass();
            if (view.getTag() != null) {
                if (view.getTag() == "bottomSheet") {
                    l9Var = n4Var.M0;
                }
            }
        }
        l9Var = n4Var.L0;
        if (l9Var != null) {
            l9Var.a0(canvas, k9Var, i10);
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

    public static n4 x() {
        n4 n4Var;
        n4 n4Var2 = Z0;
        if (n4Var2 != null) {
            return n4Var2;
        }
        synchronized (n4.class) {
            try {
                n4Var = Z0;
                if (n4Var == null) {
                    n4Var = new n4();
                    Z0 = n4Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return n4Var;
    }

    public static View y(View view) {
        org.telegram.ui.Components.dl0 dl0Var;
        if (!(view instanceof b2)) {
            return (!(view instanceof e2) || (dl0Var = ((e2) view).d) == null) ? view : y(dl0Var.a);
        }
        org.telegram.ui.Components.dl0 dl0Var2 = ((b2) view).d;
        return dl0Var2 != null ? y(dl0Var2.a) : view;
    }

    public static TL_iv.PageBlock z(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof d4) {
            TL_iv.PageBlock pageBlock2 = ((d4) pageBlock).d;
            return pageBlock2 != null ? z(pageBlock2) : pageBlock2;
        }
        if (!(pageBlock instanceof f4)) {
            return pageBlock;
        }
        TL_iv.PageBlock pageBlock3 = ((f4) pageBlock).d;
        return pageBlock3 != null ? z(pageBlock3) : pageBlock3;
    }

    public final void G() {
        ArrayList arrayList = this.a0;
        int size = arrayList.size();
        a4 a4Var = this.H;
        boolean z4 = false;
        if (size <= 1) {
            ArticleViewer$WindowView articleViewer$WindowView = this.c0;
            articleViewer$WindowView.e = false;
            articleViewer$WindowView.d = false;
            float width = a4Var != null ? a4Var.F * a4Var.c.getWidth() : this.d0.getX();
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = r0.getMeasuredWidth() - width;
            if (a4Var != null) {
                animatorSet.playTogether(a4Var.d(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.d0, (Property<n0, Float>) View.TRANSLATION_X, r0.getMeasuredWidth()), ObjectAnimator.ofFloat(this.c0, a1, r0.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / r0.getMeasuredWidth()) * measuredWidth), MediaDataController.MAX_LINKS_COUNT));
            animatorSet.setInterpolator(org.telegram.ui.Components.mr.h);
            animatorSet.addListener(new y0(this));
            animatorSet.start();
            this.Q0 = true;
            return;
        }
        ArticleViewer$WindowView articleViewer$WindowView2 = this.c0;
        articleViewer$WindowView2.f = true;
        articleViewer$WindowView2.e = true;
        articleViewer$WindowView2.h = this.F0;
        this.r0[1].setVisibility(0);
        this.r0[1].setAlpha(1.0f);
        this.r0[1].setTranslationX(0.0f);
        this.r0[0].setBackgroundColor(a4Var == null ? 0 : this.i0.getColor());
        e0(-1, arrayList.get(arrayList.size() - 2), true);
        r3 r3Var = this.r0[0];
        r3Var.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        r3Var.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.r0[0], (Property<r3, Float>) View.TRANSLATION_X, r3Var.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(org.telegram.ui.Components.mr.h);
        animatorSet2.addListener(new z0(this));
        animatorSet2.start();
        o0 o0Var = this.e0;
        r3 r3Var2 = this.r0[0];
        o0Var.setMenuColors((r3Var2 == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false) : r3Var2.getBackgroundColor());
        o0 o0Var2 = this.e0;
        r3 r3Var3 = this.r0[0];
        o0Var2.d((r3Var3 == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false) : r3Var3.getActionBarColor(), true);
        o0 o0Var3 = this.e0;
        r3 r3Var4 = this.r0[0];
        o0Var3.setIsTonsite(r3Var4 != null && r3Var4.e());
        o0 o0Var4 = this.e0;
        r3 r3Var5 = this.r0[0];
        if (r3Var5 != null && r3Var5.d()) {
            z4 = true;
        }
        o0Var4.setIsLocal(z4);
        this.Q0 = true;
    }

    public final void H(int i10) {
        ArrayList arrayList = this.a0;
        int size = arrayList.size();
        a4 a4Var = this.H;
        boolean z4 = false;
        if (size <= 1) {
            ArticleViewer$WindowView articleViewer$WindowView = this.c0;
            articleViewer$WindowView.e = false;
            articleViewer$WindowView.d = false;
            float width = a4Var != null ? a4Var.F * a4Var.c.getWidth() : this.d0.getX();
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = r9.getMeasuredWidth() - width;
            if (a4Var != null) {
                animatorSet.playTogether(a4Var.d(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.d0, (Property<n0, Float>) View.TRANSLATION_X, r9.getMeasuredWidth()), ObjectAnimator.ofFloat(this.c0, a1, r9.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / r9.getMeasuredWidth()) * measuredWidth), MediaDataController.MAX_LINKS_COUNT));
            animatorSet.setInterpolator(org.telegram.ui.Components.mr.h);
            animatorSet.addListener(new a1(this));
            animatorSet.start();
            this.Q0 = true;
            return;
        }
        this.c0.f = true;
        this.r0[1].setVisibility(0);
        this.r0[1].setAlpha(1.0f);
        this.r0[1].setTranslationX(0.0f);
        this.r0[0].setBackgroundColor(a4Var == null ? 0 : this.i0.getColor());
        e0(-1, arrayList.get(i10), true);
        r3 r3Var = this.r0[0];
        r3Var.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        r3Var.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.r0[0], (Property<r3, Float>) View.TRANSLATION_X, r3Var.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(org.telegram.ui.Components.mr.h);
        animatorSet2.addListener(new b1(this, i10));
        animatorSet2.start();
        o0 o0Var = this.e0;
        r3 r3Var2 = this.r0[0];
        o0Var.setMenuColors((r3Var2 == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false) : r3Var2.getBackgroundColor());
        o0 o0Var2 = this.e0;
        r3 r3Var3 = this.r0[0];
        o0Var2.d((r3Var3 == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false) : r3Var3.getActionBarColor(), true);
        o0 o0Var3 = this.e0;
        r3 r3Var4 = this.r0[0];
        o0Var3.setIsTonsite(r3Var4 != null && r3Var4.e());
        o0 o0Var4 = this.e0;
        r3 r3Var5 = this.r0[0];
        if (r3Var5 != null && r3Var5.d()) {
            z4 = true;
        }
        o0Var4.setIsLocal(z4);
        this.Q0 = true;
    }

    public final boolean J() {
        ArrayList arrayList = this.a0;
        return arrayList.size() > 0 && (arrayList.get(0) instanceof TLRPC.WebPage);
    }

    public final void M() {
        this.S = false;
        int i10 = 0;
        while (true) {
            r3[] r3VarArr = this.r0;
            if (i10 < r3VarArr.length) {
                r3VarArr[i10].b();
                i10++;
            } else {
                try {
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
        this.I.getWindow().clearFlags(128);
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.K;
            if (i11 >= arrayList.size()) {
                this.d0.post(new d0(this, 0));
                NotificationCenter.getInstance(this.U).lambda$postNotificationNameOnUIThread$1(NotificationCenter.articleClosed, new Object[0]);
                return;
            } else {
                ((w1) arrayList.get(i11)).a(false);
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
        boolean z4;
        int lastIndexOf;
        boolean z10;
        ?? r52;
        TL_iv.Page page;
        if (this.I == null) {
            return false;
        }
        a4 a4Var = this.H;
        if (a4Var == null && this.S) {
            return false;
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.J;
        if (p2Var != null && (p2Var.getParentLayout() instanceof ActionBarLayout)) {
            AndroidUtilities.hideKeyboard((ActionBarLayout) this.J.getParentLayout());
        }
        int i10 = 1;
        if (messageObject != null) {
            webPage2 = webPage == null ? messageObject.messageOwner.media.webpage : webPage;
            z4 = (webPage2 == null || (page = webPage2.cached_page) == null || page.local == null) ? false : true;
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
                    } catch (Exception e) {
                        FileLog.e(e);
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
            z4 = false;
        }
        ArrayList arrayList = this.a0;
        if (a4Var == null || arrayList.isEmpty()) {
            z10 = z4;
            r52 = 0;
        } else {
            z10 = z4;
            r52 = 1;
        }
        if (r52 == 0) {
            arrayList.clear();
            this.d0.setTranslationX(0.0f);
            if (a4Var != null) {
                a4Var.F = 0.0f;
                a4Var.c.invalidate();
                a4Var.i();
                a4Var.h();
            }
            this.d0.setTranslationY(0.0f);
            this.r0[0].setTranslationY(0.0f);
            this.r0[0].setTranslationX(0.0f);
            this.r0[1].setTranslationX(0.0f);
            this.r0[0].setAlpha(1.0f);
            this.c0.setInnerTranslationX(0.0f);
            this.r0[0].g();
            X(AndroidUtilities.dp(56.0f));
        }
        if (a4Var != null && org.telegram.ui.web.c1.M0) {
            a4Var.a.lock();
        }
        if (webPage2 != null) {
            boolean h = h(webPage2, str3, r52);
            if (!z10) {
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
                ConnectionsManager.getInstance(i13).sendRequest(tL_messages_getWebPage, new j0(this, i13, webPage2, messageObject, (boolean) r52, str5));
            }
        } else {
            g(r52, str2);
        }
        o0 o0Var = this.e0;
        if (o0Var != null && r52 == 0) {
            o0Var.setIsLocal(this.r0[0].d());
        }
        this.Q = null;
        if (a4Var != null) {
            if (r52 == 0) {
                AndroidUtilities.removeFromParent(this.c0);
                a4Var.d = this.c0;
                a4Var.n();
                a4Var.c.addView(this.c0, k7.b6.c(-1.0f, -1));
            }
        } else if (this.S) {
            this.b0.flags &= -17;
            ((WindowManager) this.I.getSystemService("window")).updateViewLayout(this.c0, this.b0);
        } else {
            WindowManager windowManager = (WindowManager) this.I.getSystemService("window");
            if (this.T) {
                try {
                    windowManager.removeView(this.c0);
                } catch (Exception unused) {
                }
            }
            try {
                WindowManager.LayoutParams layoutParams = this.b0;
                layoutParams.flags = -2013200384;
                if (Build.VERSION.SDK_INT >= 28) {
                    layoutParams.layoutInDisplayCutoutMode = 1;
                }
                this.c0.setFocusable(false);
                this.d0.setFocusable(false);
                windowManager.addView(this.c0, this.b0);
            } catch (Exception e6) {
                FileLog.e(e6);
                return false;
            }
        }
        this.S = true;
        this.W = 1;
        if (r52 == 0) {
            if (a4Var == null) {
                this.c0.setAlpha(0.0f);
                this.d0.setAlpha(0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                ArticleViewer$WindowView articleViewer$WindowView = this.c0;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, (Property<ArticleViewer$WindowView, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.d0, (Property<n0, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.c0, (Property<ArticleViewer$WindowView, Float>) View.TRANSLATION_X, AndroidUtilities.dp(56.0f), 0.0f));
                this.X = new d0(this, i10);
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(this.Z);
                animatorSet.addListener(new v0(this));
                this.Y = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.h(16, this, animatorSet));
            } else if (r52 != 0) {
                a4Var.a.unlock();
            } else if (!a4Var.h) {
                a4Var.g(a4Var.b);
                a4Var.f();
            }
        }
        this.d0.setLayerType(2, null);
        return true;
    }

    public final void P(long j10, TLRPC.User user) {
        if (user == null || !(this.I instanceof LaunchActivity)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        bundle.putString("botUser", "webpage" + j10);
        ((LaunchActivity) this.I).q0(new zn(bundle), false, true);
        o(false, true);
    }

    public final void Q(String str, String str2, m0 m0Var) {
        Activity activity = this.I;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        r3 r3Var = this.r0[0];
        if (r3Var == null || !r3Var.d()) {
            R(str, str2, m0Var);
            return;
        }
        String string = LocaleController.getString(R.string.OpenUrlAlert2);
        int indexOf = string.indexOf("%");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.format(string, str));
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new URLSpan(str), indexOf, str.length() + indexOf, 33);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.I, 0, null);
        String string2 = LocaleController.getString(R.string.OpenUrlTitle);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.O = string2;
        d2Var.Q = spannableStringBuilder;
        d2Var.c0 = false;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Open), new a1.d(this, str, str2, m0Var, 4));
        alertDialog$Builder.o();
    }

    public final void R(String str, String str2, ze.c cVar) {
        a4 a4Var;
        ze.c cVar2 = this.J0;
        if (cVar2 != null) {
            cVar2.a(false);
        }
        this.J0 = cVar;
        if (this.C0 != 0) {
            ConnectionsManager.getInstance(this.U).cancelRequest(this.C0, false);
            this.C0 = 0;
        }
        boolean[] zArr = new boolean[1];
        if (ze.d.l(this.I, str, false)) {
            if (!this.a0.isEmpty() || (a4Var = this.H) == null) {
                return;
            }
            a4Var.dismiss(false);
            return;
        }
        i0 i0Var = new i0(this, str, zArr, cVar);
        int i10 = this.E0 + 1;
        this.E0 = i10;
        b0(true);
        TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
        tL_messages_getWebPage.url = str;
        tL_messages_getWebPage.hash = 0;
        this.C0 = ConnectionsManager.getInstance(this.U).sendRequest(tL_messages_getWebPage, new org.telegram.messenger.li(this, i10, cVar, str2, i0Var, tL_messages_getWebPage));
        if (cVar != null) {
            cVar.b = new ah.a(this, i10, cVar, 21);
            cVar.d();
        }
    }

    public final void S() {
        TextView textView = this.y0;
        if (textView != null) {
            textView.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), 2, -1));
            this.y0.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.x0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G8, false));
        }
        ImageView imageView = this.o0;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), PorterDuff.Mode.MULTIPLY));
            this.o0.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.z8, false), 1, -1));
        }
        ImageView imageView2 = this.p0;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), PorterDuff.Mode.MULTIPLY));
            this.p0.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.z8, false), 1, -1));
        }
        org.telegram.ui.Components.k6 k6Var = this.q0;
        if (k6Var != null) {
            k6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        }
        o0 o0Var = this.e0;
        if (o0Var != null) {
            r3 r3Var = this.r0[0];
            o0Var.setMenuColors((r3Var == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false) : r3Var.getBackgroundColor());
            o0 o0Var2 = this.e0;
            r3 r3Var2 = this.r0[0];
            o0Var2.d((r3Var2 == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false) : r3Var2.getActionBarColor(), true);
        }
        this.i0.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false));
    }

    public final void U() {
        int L0;
        r3 r3Var = this.r0[0];
        if (r3Var.c.B == null || (L0 = r3Var.d.L0()) == -1) {
            return;
        }
        View m9 = this.r0[0].d.m(L0);
        int top = m9 != null ? m9.getTop() : 0;
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit();
        String str = "article" + this.r0[0].c.B.id;
        SharedPreferences.Editor putInt = edit.putInt(str, L0).putInt(str + "o", top);
        String k10 = vh.w2.k(str, "r");
        Point point = AndroidUtilities.displaySize;
        putInt.putBoolean(k10, point.x > point.y).commit();
    }

    public final boolean V(String str, boolean z4) {
        Integer num = 0;
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            Integer num2 = (Integer) this.r0[0].c.h.get(lowerCase);
            if (num2 != null) {
                TL_iv.textAnchor textanchor = (TL_iv.textAnchor) this.r0[0].c.r.get(lowerCase);
                if (textanchor != null) {
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    pageblockparagraph.text = org.telegram.ui.web.h2.d(textanchor.text, !TextUtils.isEmpty(this.r0[0].c.B.cached_page.url) ? this.r0[0].c.B.cached_page.url.toLowerCase() : this.r0[0].c.B.url.toLowerCase(), lowerCase);
                    this.r0[0].c.getClass();
                    int I = l4.I(pageblockparagraph);
                    f2.l1 x10 = this.r0[0].c.x(null, I);
                    View view = x10.a;
                    this.r0[0].c.H(I, x10, pageblockparagraph, 0, 0, false);
                    org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(this.I, null, false, false);
                    g3Var.fixNavigationBar();
                    g3Var.applyTopPadding = false;
                    g3Var.applyBottomPadding = false;
                    LinearLayout linearLayout = new LinearLayout(this.I);
                    linearLayout.setOrientation(1);
                    org.telegram.ui.Cells.l9 l9Var = new org.telegram.ui.Cells.l9();
                    this.M0 = l9Var;
                    l9Var.T(linearLayout);
                    this.M0.D = new nh.h2(this, 1);
                    gg.q qVar = new gg.q(this.I, 3);
                    qVar.setTextSize(1, 16.0f);
                    qVar.setTypeface(AndroidUtilities.bold());
                    qVar.setText(LocaleController.getString(R.string.InstantViewReference));
                    qVar.setGravity((this.r0[0].c.D ? 5 : 3) | 16);
                    qVar.setTextColor(b());
                    qVar.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                    linearLayout.addView(qVar, new LinearLayout.LayoutParams(-1, AndroidUtilities.dp(48.0f) + 1));
                    view.setTag("bottomSheet");
                    linearLayout.addView(view, k7.b6.k(0.0f, 7.0f, 0.0f, 0.0f, -1, -2));
                    org.telegram.ui.Cells.x9 o10 = this.M0.o(this.I);
                    ah.e eVar = new ah.e(this, this.I, linearLayout, 7);
                    g3Var.setDelegate(new k0(this, 0));
                    eVar.addView(linearLayout, -1, -2);
                    eVar.addView(o10, -1, -2);
                    g3Var.customView = eVar;
                    if (this.L0.y()) {
                        this.L0.f(false);
                    }
                    this.F = g3Var;
                    a0(g3Var);
                    return true;
                }
                if (num2.intValue() >= 0 && num2.intValue() < this.r0[0].c.e.size()) {
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) this.r0[0].c.e.get(num2.intValue());
                    TL_iv.PageBlock z10 = z(pageBlock);
                    if ((z10 instanceof b4) && O((b4) z10)) {
                        this.r0[0].c.M();
                        this.r0[0].c.l();
                    }
                    int indexOf = this.r0[0].c.d.indexOf(pageBlock);
                    if (indexOf != -1) {
                        num2 = Integer.valueOf(indexOf);
                    }
                    Integer num3 = (Integer) this.r0[0].c.n.get(lowerCase);
                    if (num3 != null) {
                        if (num3.intValue() == -1) {
                            this.r0[0].c.getClass();
                            int I2 = l4.I(pageBlock);
                            f2.l1 x11 = this.r0[0].c.x(null, I2);
                            this.r0[0].c.H(I2, x11, pageBlock, 0, 0, false);
                            x11.a.measure(View.MeasureSpec.makeMeasureSpec(this.r0[0].b.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                            Integer num4 = (Integer) this.r0[0].c.n.get(lowerCase);
                            if (num4.intValue() != -1) {
                                num = num4;
                            }
                        } else {
                            num = num3;
                        }
                    }
                    if (this.r0[0].c.E) {
                        num2 = Integer.valueOf(num2.intValue() + 1);
                    }
                    if (!z4) {
                        this.r0[0].d.h1(num2.intValue(), (-AndroidUtilities.dp(56.0f)) - num.intValue());
                        return true;
                    }
                    l0 l0Var = new l0(this.r0[0].getContext());
                    l0Var.a = num2.intValue();
                    l0Var.s = (-AndroidUtilities.dp(56.0f)) - num.intValue();
                    this.r0[0].d.w0(l0Var);
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
        b4 b4Var;
        TL_iv.PageBlock pageBlock2;
        if (i10 < 0 || i10 >= this.B.size()) {
            h0();
            return;
        }
        this.D = i10;
        h0();
        w3 w3Var = (w3) this.B.get(i10);
        TL_iv.PageBlock z4 = z(w3Var.c);
        int size2 = this.r0[0].c.e.size();
        for (int i12 = 0; i12 < size2; i12++) {
            TL_iv.PageBlock pageBlock3 = (TL_iv.PageBlock) this.r0[0].c.e.get(i12);
            if ((pageBlock3 instanceof b4) && ((pageBlock2 = (b4Var = (b4) pageBlock3).b) == w3Var.c || pageBlock2 == z4)) {
                if (O(b4Var)) {
                    this.r0[0].c.M();
                    this.r0[0].c.l();
                }
                size = this.r0[0].c.d.size();
                i11 = 0;
                while (true) {
                    if (i11 < size) {
                        i11 = -1;
                        break;
                    }
                    TL_iv.PageBlock pageBlock4 = (TL_iv.PageBlock) this.r0[0].c.d.get(i11);
                    TL_iv.PageBlock pageBlock5 = w3Var.c;
                    if (pageBlock4 == pageBlock5 || pageBlock4 == z4 || ((pageBlock4 instanceof b4) && ((pageBlock = ((b4) pageBlock4).b) == pageBlock5 || pageBlock == z4))) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 != -1) {
                    return;
                }
                if ((z4 instanceof b4) && O((b4) z4)) {
                    this.r0[0].c.M();
                    this.r0[0].c.l();
                }
                String str = this.C + w3Var.c + w3Var.b + w3Var.a;
                Integer num = (Integer) this.r0[0].c.y.get(str);
                if (num == null) {
                    l4 l4Var = this.r0[0].c;
                    TL_iv.PageBlock pageBlock6 = w3Var.c;
                    l4Var.getClass();
                    int I = l4.I(pageBlock6);
                    f2.l1 x10 = this.r0[0].c.x(null, I);
                    this.r0[0].c.H(I, x10, w3Var.c, 0, 0, false);
                    x10.a.measure(View.MeasureSpec.makeMeasureSpec(this.r0[0].b.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                    num = (Integer) this.r0[0].c.y.get(str);
                    if (num == null) {
                        num = 0;
                    }
                }
                t0 t0Var = new t0(this.r0[0].getContext());
                if (this.r0[0].c.E) {
                    i11++;
                }
                t0Var.a = i11;
                t0Var.s = -(AndroidUtilities.dp(100.0f) + ((this.F0 - AndroidUtilities.dp(56.0f)) - num.intValue()));
                t0Var.t = 1.2f;
                this.r0[0].d.w0(t0Var);
                this.r0[0].b.e1();
                return;
            }
        }
        size = this.r0[0].c.d.size();
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
        o0 o0Var = this.e0;
        if (o0Var == null || o0Var.Q || o0Var.T) {
            return;
        }
        int clamp = Utilities.clamp(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(24.0f));
        this.F0 = clamp;
        this.e0.setHeight(clamp);
        this.L0.x = this.F0;
        int i11 = 0;
        while (true) {
            r3[] r3VarArr = this.r0;
            if (i11 >= r3VarArr.length) {
                return;
            }
            r3VarArr[i11].b.setTopGlowOffset(this.F0);
            i11++;
        }
    }

    public final void Y(Activity activity, org.telegram.ui.ActionBar.p2 p2Var) {
        a4 a4Var;
        kf.t0 t0Var = this.R0;
        if (t0Var != null) {
            t0Var.destroy();
            this.R0 = null;
        }
        LaunchActivity launchActivity = LaunchActivity.D1;
        this.R0 = launchActivity != null ? new kf.t0(launchActivity, true) : null;
        this.J = p2Var;
        int currentAccount = !(p2Var instanceof ez) ? p2Var.getCurrentAccount() : UserConfig.selectedAccount;
        this.U = currentAccount;
        NotificationCenter.getInstance(currentAccount).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getInstance(this.U).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.U).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.U).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.U).addObserver(this, NotificationCenter.emojiLoaded);
        Activity activity2 = this.I;
        if (activity2 == activity || !(activity2 == null || !this.G || (a4Var = this.H) == null || a4Var.e == null)) {
            g0(this);
            S();
            return;
        }
        this.I = activity;
        this.a = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).getInt("font_type", 0);
        r(this, false);
        this.i0 = new Paint();
        this.j0 = activity.getResources().getDrawable(R.drawable.layer_shadow);
        this.k0 = new Paint();
        ArticleViewer$WindowView articleViewer$WindowView = new ArticleViewer$WindowView(this, activity);
        this.c0 = articleViewer$WindowView;
        articleViewer$WindowView.setWillNotDraw(false);
        this.c0.setClipChildren(true);
        this.c0.setFocusable(false);
        n0 n0Var = new n0(this, activity, 0);
        this.d0 = n0Var;
        this.c0.addView(n0Var, k7.b6.e(-1, -1, 51));
        if (this.H == null) {
            this.c0.setFitsSystemWindows(true);
            this.d0.setOnApplyWindowInsetsListener(new org.telegram.ui.ActionBar.h3(1));
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        this.M = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.M.setVisibility(4);
        this.c0.addView(this.M, k7.b6.c(-1.0f, -1));
        q4 q4Var = new q4(activity);
        this.O = q4Var;
        q4Var.setVisibility(0);
        this.O.setBackgroundColor(-16777216);
        this.M.addView(this.O, k7.b6.e(-1, -1, 17));
        this.N = new TextureView(activity);
        this.r0 = new r3[2];
        int i10 = 0;
        while (true) {
            r3[] r3VarArr = this.r0;
            if (i10 >= r3VarArr.length) {
                break;
            }
            r3 r3Var = new r3(this, activity);
            r3VarArr[i10] = r3Var;
            r3Var.setVisibility(i10 == 0 ? 0 : 8);
            this.d0.addView(r3Var, k7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
            r3Var.b.setOnItemLongClickListener(new v(this));
            r3Var.b.setOnItemClickListener(new mg.w(7, this, r3Var));
            i10++;
        }
        this.d0.addView(new FrameLayout(activity), k7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        this.t0.setColor(-16777216);
        this.u0.setColor(-16777216);
        this.w0.setColor(-14408666);
        this.v0.setColor(-16777216);
        o0 o0Var = new o0(this, activity);
        this.e0 = o0Var;
        o0Var.b0 = this.H != null;
        this.d0.addView(o0Var, k7.b6.e(-1, -2, 48));
        this.e0.setOnClickListener(new org.telegram.messenger.video.g(7, this, activity));
        this.e0.V.addTextChangedListener(new p0(this, 0));
        org.telegram.ui.web.k kVar = new org.telegram.ui.web.k(activity);
        this.f0 = kVar;
        kVar.setOpenProgress(0.0f);
        this.f0.w.j(new n3(this, 2));
        this.d0.addView(this.f0, k7.b6.c(-1.0f, -1));
        this.g0 = new d0(this, 3);
        this.e0.I.setOnClickListener(new u(this, 2));
        this.e0.I.setOnLongClickListener(new w(this, 0));
        this.e0.setMenuListener(new kh.a1(13, this, activity));
        this.e0.L.setOnClickListener(new u(this, 3));
        dh.d dVar = new dh.d(this.I, 6);
        this.n0 = dVar;
        dVar.setOnTouchListener(new oh.d(3));
        this.n0.setWillNotDraw(false);
        this.n0.setTranslationY(AndroidUtilities.dp(51.0f));
        this.n0.setVisibility(4);
        this.n0.setFocusable(true);
        this.n0.setFocusableInTouchMode(true);
        this.n0.setClickable(true);
        this.n0.setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
        this.d0.addView(this.n0, k7.b6.e(-1, 51, 80));
        new ph.i3(this.c0, false, new t(this, 0));
        ImageView imageView = new ImageView(this.I);
        this.o0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.o0.setImageResource(R.drawable.msg_go_up);
        ImageView imageView2 = this.o0;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(w02, mode));
        ImageView imageView3 = this.o0;
        int i12 = org.telegram.ui.ActionBar.j6.z8;
        imageView3.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i12, false), 1, -1));
        this.n0.addView(this.o0, k7.b6.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        this.o0.setOnClickListener(new u(this, 0));
        this.o0.setContentDescription(LocaleController.getString(R.string.AccDescrSearchNext));
        ImageView imageView4 = new ImageView(this.I);
        this.p0 = imageView4;
        imageView4.setScaleType(scaleType);
        this.p0.setImageResource(R.drawable.msg_go_down);
        this.p0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i11, false), mode));
        this.p0.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i12, false), 1, -1));
        this.n0.addView(this.p0, k7.b6.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        this.p0.setOnClickListener(new u(this, 1));
        this.p0.setContentDescription(LocaleController.getString(R.string.AccDescrSearchPrev));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(this.I, true, true, true);
        this.q0 = k6Var;
        k6Var.setScaleProperty(0.6f);
        this.q0.b(0.4f, 350L, org.telegram.ui.Components.mr.h);
        this.q0.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.q0.setTextSize(AndroidUtilities.dp(15.0f));
        this.q0.setTypeface(AndroidUtilities.bold());
        this.q0.setGravity(3);
        this.q0.getDrawable().G = AndroidUtilities.displaySize.x;
        this.n0.addView(this.q0, k7.b6.d(-2, -2.0f, 19, 18.0f, 0.0f, 108.0f, 0.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.b0 = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 98;
        layoutParams.softInputMode = 48;
        layoutParams.flags = 131072;
        int w03 = this.H == null ? org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, true) : org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false);
        int i13 = (AndroidUtilities.computePerceivedBrightness(w03) < 0.721f || Build.VERSION.SDK_INT < 26) ? 1792 : 1808;
        this.v0.setColor(w03);
        WindowManager.LayoutParams layoutParams2 = this.b0;
        layoutParams2.systemUiVisibility = i13;
        layoutParams2.flags |= -2147417856;
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams2.layoutInDisplayCutoutMode = 1;
        }
        org.telegram.ui.Cells.l9 l9Var = new org.telegram.ui.Cells.l9();
        this.L0 = l9Var;
        l9Var.T(this.r0[0].b);
        if (MessagesController.getInstance(this.U).getTranslateController().isContextTranslateEnabled()) {
            this.L0.l0 = new v(this);
        }
        org.telegram.ui.Cells.l9 l9Var2 = this.L0;
        l9Var2.E0 = this.r0[0].d;
        l9Var2.D = new s0(this);
        this.d0.addView(l9Var2.o(activity));
        n0 n0Var2 = this.d0;
        cv0 cv0Var = new cv0(n0Var2, n0Var2);
        this.N0 = cv0Var;
        cv0Var.F = new v(this);
        cv0Var.E = new h(this, 1);
        this.i0.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false));
        g0(this);
    }

    public final void Z(String str) {
        String str2;
        if (this.I == null) {
            return;
        }
        org.telegram.ui.ActionBar.g3 g3Var = this.F;
        if (g3Var != null) {
            g3Var.dismiss();
            this.F = null;
        }
        int i10 = 0;
        org.telegram.ui.ActionBar.g3 g3Var2 = new org.telegram.ui.ActionBar.g3(this.I, null, false, false);
        g3Var2.fixNavigationBar();
        try {
            str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e) {
            FileLog.e(e);
            str2 = str;
        }
        g3Var2.title = str2;
        g3Var2.bigTitle = false;
        g3Var2.multipleLinesTitle = true;
        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
        cg.u1 u1Var = new cg.u1(1, this, str);
        g3Var2.items = charSequenceArr;
        g3Var2.onClickListener = u1Var;
        g3Var2.setOnHideListener(new x(this, i10));
        a0(g3Var2);
    }

    @Override // org.telegram.ui.p70
    public final int a() {
        return org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.y6, false);
    }

    public final void a0(org.telegram.ui.ActionBar.g3 g3Var) {
        if (this.I == null) {
            return;
        }
        try {
            org.telegram.ui.ActionBar.g3 g3Var2 = this.h0;
            if (g3Var2 != null) {
                g3Var2.dismiss();
                this.h0 = null;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            this.h0 = g3Var;
            g3Var.setCanceledOnTouchOutside(true);
            this.h0.setOnDismissListener(new x(this, 1));
            g3Var.show();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override // org.telegram.ui.p70
    public final int b() {
        return org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false);
    }

    public final void b0(boolean z4) {
        AndroidUtilities.cancelRunOnUIThread(this.g0);
        if (!z4) {
            this.e0.a0.a(1.0f, true);
            return;
        }
        this.e0.a0.a(0.0f, false);
        this.e0.a0.a(0.3f, true);
        AndroidUtilities.runOnUIThread(this.g0, 100L);
    }

    @Override // org.telegram.ui.p70
    public final void c(l4 l4Var, org.telegram.ui.Components.o01 o01Var) {
        String str;
        String str2;
        org.telegram.ui.Components.g90 g90Var;
        if (o01Var == null || (str = o01Var.b) == null) {
            return;
        }
        org.telegram.ui.ActionBar.g3 g3Var = this.F;
        m0 m0Var = null;
        if (g3Var != null) {
            g3Var.dismiss();
            this.F = null;
        }
        int lastIndexOf = str.lastIndexOf(35);
        boolean z4 = false;
        if (lastIndexOf != -1) {
            String lowerCase = !TextUtils.isEmpty(l4Var.B.cached_page.url) ? l4Var.B.cached_page.url.toLowerCase() : l4Var.B.url.toLowerCase();
            try {
                str2 = URLDecoder.decode(str.substring(lastIndexOf + 1), "UTF-8");
            } catch (Exception unused) {
                str2 = "";
            }
            if (lastIndexOf == 0 || str.toLowerCase().contains(lowerCase)) {
                z4 = true;
                V(str2, true);
            }
        } else {
            str2 = null;
        }
        if (z4) {
            return;
        }
        f3 f3Var = this.d;
        if (f3Var != null && (g90Var = this.b) != null) {
            m0Var = new m0(this, f3Var, g90Var);
        }
        Q(str, str2, m0Var);
    }

    public final void c0() {
        LaunchActivity launchActivity;
        FrameLayout frameLayout;
        if (!this.T || (launchActivity = LaunchActivity.D1) == null || launchActivity.isFinishing()) {
            return;
        }
        if (!this.r0[0].f()) {
            r3 r3Var = this.r0[0];
            TLRPC.WebPage webPage = r3Var.c.B;
            frameLayout = r3Var;
            if (webPage == null) {
                return;
            }
        } else if (this.r0[0].getWebView() == null) {
            return;
        } else {
            frameLayout = this.r0[0].f;
        }
        new org.telegram.ui.Components.qc(frameLayout, null).G(R.raw.chats_infotip, 4, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BrowserExternalRestricted), new d0(this, 10))).k(true);
    }

    @Override // org.telegram.ui.p70
    public final boolean d(TL_iv.PageBlock pageBlock, l4 l4Var) {
        int indexOf;
        List list;
        org.telegram.ui.ActionBar.p2 p2Var = this.J;
        if (p2Var != null && p2Var.getParentActivity() != null) {
            if (!(pageBlock instanceof TL_iv.pageBlockVideo) || k4.g(l4Var.B, pageBlock)) {
                ArrayList arrayList = new ArrayList(l4Var.f);
                indexOf = l4Var.f.indexOf(pageBlock);
                list = arrayList;
            } else {
                list = Collections.singletonList(pageBlock);
                indexOf = 0;
            }
            PhotoViewer t12 = PhotoViewer.t1();
            t12.K2(null, this.J, null);
            if (t12.e2(null, null, null, null, null, null, null, indexOf, new j3(this, list), null, 0L, 0L, 0L, true, new t3(this, l4Var.B, list), null)) {
                n();
                return true;
            }
        }
        return false;
    }

    public final void d0(boolean z4) {
        this.n0.setVisibility(0);
        ValueAnimator valueAnimator = this.U0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V0, z4 ? 1.0f : 0.0f);
        this.U0 = ofFloat;
        ofFloat.addUpdateListener(new s(this, 1));
        this.U0.addListener(new dg.w2(11, this, z4));
        this.U0.setDuration(320L);
        this.U0.setInterpolator(org.telegram.ui.Components.mr.h);
        this.U0.start();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        d1 d1Var;
        MessageObject messageObject;
        if (i10 == NotificationCenter.messagePlayingDidStart) {
            if (this.r0 == null) {
                return;
            }
            int i12 = 0;
            while (true) {
                r3[] r3VarArr = this.r0;
                if (i12 >= r3VarArr.length) {
                    return;
                }
                int childCount = r3VarArr[i12].b.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = this.r0[i12].b.getChildAt(i13);
                    if (childAt instanceof d1) {
                        ((d1) childAt).a(true);
                    }
                }
                i12++;
            }
        } else if (i10 == NotificationCenter.messagePlayingDidReset || i10 == NotificationCenter.messagePlayingPlayStateChanged) {
            if (this.r0 == null) {
                return;
            }
            int i14 = 0;
            while (true) {
                r3[] r3VarArr2 = this.r0;
                if (i14 >= r3VarArr2.length) {
                    return;
                }
                int childCount2 = r3VarArr2[i14].b.getChildCount();
                for (int i15 = 0; i15 < childCount2; i15++) {
                    View childAt2 = this.r0[i14].b.getChildAt(i15);
                    if (childAt2 instanceof d1) {
                        d1 d1Var2 = (d1) childAt2;
                        if (d1Var2.getMessageObject() != null) {
                            d1Var2.a(true);
                        }
                    }
                }
                i14++;
            }
        } else if (i10 == NotificationCenter.messagePlayingProgressDidChanged) {
            Integer num = (Integer) objArr[0];
            if (this.r0 == null) {
                return;
            }
            int i16 = 0;
            while (true) {
                r3[] r3VarArr3 = this.r0;
                if (i16 >= r3VarArr3.length) {
                    return;
                }
                int childCount3 = r3VarArr3[i16].b.getChildCount();
                int i17 = 0;
                while (true) {
                    if (i17 < childCount3) {
                        View childAt3 = this.r0[i16].b.getChildAt(i17);
                        if ((childAt3 instanceof d1) && (messageObject = (d1Var = (d1) childAt3).getMessageObject()) != null && messageObject.getId() == num.intValue()) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (playingMessageObject != null) {
                                messageObject.audioProgress = playingMessageObject.audioProgress;
                                messageObject.audioProgressSec = playingMessageObject.audioProgressSec;
                                messageObject.audioPlayerDuration = playingMessageObject.audioPlayerDuration;
                                d1Var.b();
                            }
                        } else {
                            i17++;
                        }
                    }
                }
                i16++;
            }
        } else {
            if (i10 != NotificationCenter.emojiLoaded || this.r0 == null) {
                return;
            }
            int i18 = 0;
            while (true) {
                r3[] r3VarArr4 = this.r0;
                if (i18 >= r3VarArr4.length) {
                    return;
                }
                int childCount4 = r3VarArr4[i18].b.getChildCount();
                for (int i19 = 0; i19 < childCount4; i19++) {
                    View childAt4 = this.r0[i18].b.getChildAt(i19);
                    if (childAt4 instanceof y2) {
                        ((y2) childAt4).e.invalidate();
                    } else {
                        childAt4.invalidate();
                    }
                }
                i18++;
            }
        }
    }

    public final void e0(int i10, Object obj, boolean z4) {
        int i11;
        int dp;
        if (obj != null) {
            if ((!(obj instanceof TLRPC.WebPage) || ((TLRPC.WebPage) obj).cached_page == null) && !(obj instanceof d3)) {
                return;
            }
            int i12 = 0;
            if (!z4 && i10 != 0) {
                r3[] r3VarArr = this.r0;
                r3 r3Var = r3VarArr[1];
                r3VarArr[1] = r3VarArr[0];
                r3VarArr[0] = r3Var;
                this.e0.i();
                this.W0.a(this.r0[0].getBackgroundColor(), true);
                this.X0.a(this.r0[1].getBackgroundColor(), true);
                a4 a4Var = this.H;
                if (a4Var != null) {
                    a4Var.m();
                }
                int indexOfChild = this.d0.indexOfChild(this.r0[0]);
                int indexOfChild2 = this.d0.indexOfChild(this.r0[1]);
                if (i10 == 1) {
                    if (indexOfChild < indexOfChild2) {
                        this.d0.removeView(this.r0[0]);
                        this.d0.addView(this.r0[0], indexOfChild2);
                    }
                } else if (indexOfChild2 < indexOfChild) {
                    this.d0.removeView(this.r0[0]);
                    this.d0.addView(this.r0[0], indexOfChild);
                }
                this.s0 = new AnimatorSet();
                this.r0[0].setVisibility(0);
                int i13 = i10 == 1 ? 0 : 1;
                this.r0[i13].setBackgroundColor(this.H == null ? 0 : this.i0.getColor());
                this.r0[i13].setLayerType(2, null);
                if (i10 == 1) {
                    this.r0[0].setTranslationX(AndroidUtilities.displaySize.x);
                    this.s0.playTogether(ObjectAnimator.ofFloat(this.r0[0], (Property<r3, Float>) View.TRANSLATION_X, AndroidUtilities.displaySize.x, 0.0f));
                } else if (i10 == -1) {
                    this.r0[0].setTranslationX(0.0f);
                    this.s0.playTogether(ObjectAnimator.ofFloat(this.r0[1], (Property<r3, Float>) View.TRANSLATION_X, 0.0f, AndroidUtilities.displaySize.x));
                }
                this.s0.setDuration(320L);
                this.s0.setInterpolator(org.telegram.ui.Components.mr.h);
                this.s0.addListener(new x0(this, i13, i12));
                this.c0.f = true;
                o0 o0Var = this.e0;
                r3 r3Var2 = this.r0[0];
                o0Var.setMenuColors((r3Var2 == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false) : r3Var2.getBackgroundColor());
                o0 o0Var2 = this.e0;
                r3 r3Var3 = this.r0[0];
                o0Var2.d((r3Var3 == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false) : r3Var3.getActionBarColor(), true);
                o0 o0Var3 = this.e0;
                r3 r3Var4 = this.r0[0];
                o0Var3.setIsTonsite(r3Var4 != null && r3Var4.e());
                o0 o0Var4 = this.e0;
                r3 r3Var5 = this.r0[0];
                o0Var4.setIsLocal(r3Var5 != null && r3Var5.d());
                AnimatorSet animatorSet = this.s0;
                Objects.requireNonNull(animatorSet);
                AndroidUtilities.runOnUIThread(new yt0(animatorSet, 4));
            }
            if (!z4) {
                this.L0.f(true);
            }
            l4 l4Var = this.r0[z4 ? 1 : 0].c;
            if (z4) {
                obj = kf.k0.i(2, this.a0);
            }
            this.r0[z4 ? 1 : 0].b();
            if (obj instanceof TLRPC.WebPage) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj;
                this.r0[z4 ? 1 : 0].setWeb(null);
                this.r0[z4 ? 1 : 0].setType(0);
                TL_iv.Page page = webPage.cached_page;
                l4Var.D = page.rtl;
                l4Var.B = webPage;
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
                                    l4Var.C = (TL_iv.pageBlockChannel) pageBlock2;
                                }
                            }
                        }
                    } else {
                        i11 = (i11 == 1 && l4Var.C != null) ? i11 + 1 : 0;
                    }
                    l4Var.F(l4Var, pageBlock, 0, 0, i11 == size + (-1) ? i11 : 0);
                }
                l4Var.l();
                if (this.a0.size() == 1 || i10 == -1) {
                    SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0);
                    String str = "article" + webPage.id;
                    int i14 = sharedPreferences.getInt(str, -1);
                    boolean z10 = sharedPreferences.getBoolean(str + "r", true);
                    Point point = AndroidUtilities.displaySize;
                    if (z10 == (point.x <= point.y ? 0 : 1)) {
                        dp = sharedPreferences.getInt(str + "o", 0) - this.r0[z4 ? 1 : 0].b.getPaddingTop();
                    } else {
                        dp = AndroidUtilities.dp(10.0f);
                    }
                    if (i14 != -1) {
                        this.r0[z4 ? 1 : 0].d.h1(i14, dp);
                    }
                } else {
                    f2.i0 i0Var = this.r0[z4 ? 1 : 0].d;
                    a4 a4Var2 = this.H;
                    i0Var.h1(a4Var2 == null ? 0 : 1, a4Var2 != null ? AndroidUtilities.dp(32.0f) : 0);
                }
            } else if (obj instanceof d3) {
                this.r0[z4 ? 1 : 0].setType(1);
                this.r0[z4 ? 1 : 0].g();
                this.r0[z4 ? 1 : 0].setWeb((d3) obj);
            }
            if (!z4) {
                m(null);
            }
            i0(false);
            f0();
        }
    }

    public final void f0() {
        r3[] r3VarArr;
        r3 r3Var;
        if (this.e0 == null || (r3Var = (r3VarArr = this.r0)[0]) == null || r3VarArr[1] == null) {
            return;
        }
        float translationX = r3Var.getVisibility() != 0 ? 0.0f : 1.0f - (this.r0[0].getTranslationX() / this.r0[0].getWidth());
        float f10 = 1.0f - translationX;
        o0 o0Var = this.e0;
        o0Var.d[0] = this.r0[0].getProgress();
        o0Var.invalidate();
        o0 o0Var2 = this.e0;
        o0Var2.d[1] = this.r0[1].getProgress();
        o0Var2.invalidate();
        this.e0.setTransitionProgress(f10);
        o0 o0Var3 = this.e0;
        if (!o0Var3.T && !o0Var3.Q) {
            ArticleViewer$WindowView articleViewer$WindowView = this.c0;
            if (articleViewer$WindowView.e || articleViewer$WindowView.f) {
                boolean J = J();
                ArrayList arrayList = this.a0;
                if (J || arrayList.size() > 1) {
                    float lerp = AndroidUtilities.lerp((this.r0[0].s || arrayList.size() > 1) ? 1.0f : 0.0f, (this.r0[1].s || arrayList.size() > 2) ? 1.0f : 0.0f, f10);
                    this.e0.J.c(1.0f - lerp, false);
                    this.e0.M.f();
                    this.e0.setBackButtonCached(lerp > 0.5f);
                } else {
                    this.e0.M.f();
                    this.e0.setBackButtonCached(false);
                }
                this.e0.setHasForward(this.r0[0].v);
                this.e0.setIsLocal(this.r0[0].d());
                this.e0.setIsLoaded(this.r0[0].getWebView() != null && this.r0[0].getWebView().b);
            }
        }
        o0 o0Var4 = this.e0;
        int actionBarColor = this.r0[0].getActionBarColor();
        ArticleViewer$WindowView articleViewer$WindowView2 = this.c0;
        o0Var4.b(0, this.W0.a(actionBarColor, articleViewer$WindowView2.e || articleViewer$WindowView2.f));
        o0 o0Var5 = this.e0;
        int actionBarColor2 = this.r0[1].getActionBarColor();
        ArticleViewer$WindowView articleViewer$WindowView3 = this.c0;
        o0Var5.b(1, this.X0.a(actionBarColor2, articleViewer$WindowView3.e || articleViewer$WindowView3.f));
        this.e0.d(i0.a.d(f10, this.r0[0].getActionBarColor(), this.r0[1].getActionBarColor()), false);
        this.e0.setMenuType((translationX > 0.5f ? this.r0[0] : this.r0[1]).a);
        a4 a4Var = this.H;
        if (a4Var != null) {
            a4Var.c.invalidate();
            return;
        }
        ArticleViewer$WindowView articleViewer$WindowView4 = this.c0;
        if (articleViewer$WindowView4 != null) {
            articleViewer$WindowView4.invalidate();
        }
    }

    public final void g(int i10, String str) {
        U();
        d3 d3Var = new d3();
        d3Var.x = str;
        this.a0.add(d3Var);
        this.e0.h(false);
        e0(i10, d3Var, false);
    }

    public final boolean h(TLRPC.WebPage webPage, String str, int i10) {
        U();
        this.a0.add(webPage);
        this.e0.h(false);
        e0(i10, webPage, false);
        return V(str, false);
    }

    public final void h0() {
        int i10;
        int size;
        if (this.B != null || this.r0[0].f()) {
            if (this.r0[0].f()) {
                i10 = this.r0[0].getWebView() == null ? 0 : this.r0[0].getWebView().getSearchIndex();
                size = this.r0[0].getWebView() == null ? 0 : this.r0[0].getWebView().getSearchCount();
            } else {
                i10 = this.D;
                size = this.B.size();
            }
            this.o0.setEnabled(size > 0 && i10 != 0);
            this.p0.setEnabled(size > 0 && i10 != size + (-1));
            ImageView imageView = this.o0;
            imageView.setAlpha(imageView.isEnabled() ? 1.0f : 0.5f);
            ImageView imageView2 = this.p0;
            imageView2.setAlpha(imageView2.isEnabled() ? 1.0f : 0.5f);
            this.q0.a();
            if (size < 0) {
                this.q0.setText("");
                return;
            }
            if (size == 0) {
                this.q0.setText(LocaleController.getString(R.string.NoResult));
            } else if (size == 1) {
                this.q0.setText(LocaleController.getString(R.string.OneResult));
            } else {
                this.q0.setText(String.format(LocaleController.getPluralString("CountOfResults", size), Integer.valueOf(i10 + 1), Integer.valueOf(size)));
            }
        }
    }

    public final void i0(boolean z4) {
        boolean z10 = false;
        this.e0.g(0, this.r0[0].getTitle(), z4);
        this.e0.f(0, this.r0[0].getSubtitle());
        this.e0.e(0, this.r0[0].f() && this.r0[0].getWebView() != null && this.r0[0].getWebView().B);
        this.e0.g(1, this.r0[1].getTitle(), z4);
        this.e0.f(1, this.r0[1].getSubtitle());
        o0 o0Var = this.e0;
        if (this.r0[1].f() && this.r0[1].getWebView() != null && this.r0[1].getWebView().B) {
            z10 = true;
        }
        o0Var.e(1, z10);
    }

    public final void k() {
        this.G0 = false;
        e3 e3Var = this.H0;
        if (e3Var != null) {
            this.c0.removeCallbacks(e3Var);
            this.H0 = null;
        }
        e3 e3Var2 = this.I0;
        if (e3Var2 != null) {
            this.c0.removeCallbacks(e3Var2);
            this.I0 = null;
        }
    }

    public final void m(org.telegram.messenger.c6 c6Var) {
        if (this.F0 == AndroidUtilities.dp(56.0f)) {
            if (c6Var != null) {
                c6Var.run();
                return;
            }
            return;
        }
        int i10 = 0;
        ValueAnimator duration = ValueAnimator.ofObject(new IntEvaluator(), Integer.valueOf(this.F0), Integer.valueOf(AndroidUtilities.dp(56.0f))).setDuration(180L);
        duration.setInterpolator(new DecelerateInterpolator());
        duration.addUpdateListener(new s(this, i10));
        duration.addListener(new u0(i10, c6Var));
        if (c6Var != null) {
            duration.setDuration(duration.getDuration() / 2);
        }
        duration.start();
    }

    public final void n() {
        b3 b3Var;
        m3 m3Var = this.r0[0].b;
        if (m3Var == null || !this.T) {
            return;
        }
        float measuredHeight = m3Var.getMeasuredHeight() / 2.0f;
        float f10 = 0.0f;
        b3 b3Var2 = null;
        for (int i10 = 0; i10 < m3Var.getChildCount(); i10++) {
            View childAt = m3Var.getChildAt(i10);
            if (childAt instanceof b3) {
                float measuredHeight2 = (childAt.getMeasuredHeight() / 2.0f) + childAt.getTop();
                if (b3Var2 == null || Math.abs(measuredHeight - measuredHeight2) < Math.abs(measuredHeight - f10)) {
                    b3Var2 = (b3) childAt;
                    f10 = measuredHeight2;
                }
            }
        }
        boolean z4 = PhotoViewer.t1().f;
        if (z4 || ((b3Var = this.x) != null && b3Var != b3Var2 && this.w != null)) {
            VideoPlayerHolderBase videoPlayerHolderBase = this.w;
            if (videoPlayerHolderBase != null) {
                b3 b3Var3 = this.x;
                long j10 = b3Var3.I.video_id;
                c3 a2 = c3.a(videoPlayerHolderBase, b3Var3);
                b3Var3.c(a2);
                this.y.k(a2, j10);
                b3 b3Var4 = this.x;
                c3 c3Var = b3Var4.J;
                if (c3Var != null) {
                    Bitmap bitmap = c3Var.b;
                    if (bitmap != null) {
                        b3Var4.e.setImageBitmap(bitmap);
                    }
                    this.x.e(false);
                }
                this.w.release(null);
            }
            this.w = null;
            this.x = null;
        }
        if (z4 || b3Var2 == null) {
            return;
        }
        p70 p70Var = b3Var2.a;
        if (b3Var2.L != null && p70Var.w == null) {
            p70Var.w = new a3(b3Var2).with(b3Var2.n);
            TLRPC.Document document = b3Var2.L;
            for (int i11 = 0; i11 < document.attributes.size(); i11++) {
                if (document.attributes.get(i11) instanceof TLRPC.TL_documentAttributeVideo) {
                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i11);
                    b3Var2.h.a(tL_documentAttributeVideo.w / tL_documentAttributeVideo.h, 0);
                }
            }
            TLRPC.WebPage webPage = b3Var2.b.B;
            Uri prepareUri = webPage != null ? FileStreamLoadOperation.prepareUri(((n4) p70Var).U, document, webPage) : null;
            if (prepareUri != null) {
                VideoPlayerHolderBase videoPlayerHolderBase2 = p70Var.w;
                c3 c3Var2 = b3Var2.J;
                videoPlayerHolderBase2.seekTo(c3Var2 == null ? 0L : c3Var2.a);
                p70Var.w.preparePlayer(prepareUri, true, 1.0f);
                p70Var.w.play();
            }
        }
        this.x = b3Var2;
    }

    public final void o(boolean z4, boolean z10) {
        if (this.I == null || this.Q0 || !this.S) {
            return;
        }
        int i10 = 0;
        if (this.W != 0 && Math.abs(this.Y - System.currentTimeMillis()) >= 500) {
            Runnable runnable = this.X;
            if (runnable != null) {
                runnable.run();
                this.X = null;
            }
            this.W = 0;
        }
        if (this.W != 0) {
            return;
        }
        a4 a4Var = this.H;
        if (a4Var != null) {
            a4Var.dismiss(false);
            return;
        }
        if (this.M.getVisibility() == 0) {
            if (this.L != null) {
                this.M.setVisibility(4);
                this.P.onCustomViewHidden();
                this.M.removeView(this.L);
                this.L = null;
            } else {
                org.telegram.ui.Components.e91 e91Var = this.B0;
                if (e91Var != null && e91Var.Q) {
                    e91Var.Q = false;
                    e91Var.m();
                    e91Var.l(false);
                }
            }
            if (!z10) {
                return;
            }
        }
        if (this.L0.y()) {
            this.L0.f(false);
            return;
        }
        o0 o0Var = this.e0;
        if (o0Var.Q) {
            o0Var.h(false);
            return;
        }
        if (o0Var.T) {
            o0Var.k(false);
            return;
        }
        if (this.C0 != 0) {
            ConnectionsManager.getInstance(this.U).cancelRequest(this.C0, true);
            this.C0 = 0;
            b0(false);
        }
        if (this.D0 != 0) {
            ConnectionsManager.getInstance(this.U).cancelRequest(this.D0, true);
            this.D0 = 0;
            b0(false);
        }
        U();
        if (z4 && !z10) {
            ArrayList arrayList = this.a0;
            if (arrayList.size() >= 2) {
                Object g10 = e2.c.g(1, arrayList);
                if (g10 instanceof d3) {
                    ((d3) g10).a();
                }
                if (g10 instanceof TLRPC.WebPage) {
                    org.telegram.ui.web.h2.o((TLRPC.WebPage) g10);
                }
                e0(-1, arrayList.get(arrayList.size() - 1), false);
                return;
            }
        }
        NotificationCenter.getInstance(this.U).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getInstance(this.U).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.U).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.U).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.U).removeObserver(this, NotificationCenter.emojiLoaded);
        kf.t0 t0Var = this.R0;
        if (t0Var != null) {
            t0Var.destroy();
            this.R0 = null;
        }
        this.J = null;
        try {
            org.telegram.ui.ActionBar.g3 g3Var = this.h0;
            if (g3Var != null) {
                g3Var.dismiss();
                this.h0 = null;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArticleViewer$WindowView articleViewer$WindowView = this.c0;
        Property property = View.ALPHA;
        animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, (Property<ArticleViewer$WindowView, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.d0, (Property<n0, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.c0, (Property<ArticleViewer$WindowView, Float>) View.TRANSLATION_X, 0.0f, AndroidUtilities.dp(56.0f)));
        this.W = 2;
        this.X = new d0(this, 7);
        animatorSet.setDuration(150L);
        animatorSet.setInterpolator(this.Z);
        animatorSet.addListener(new cg.l0(this, 26));
        this.Y = System.currentTimeMillis();
        this.d0.setLayerType(2, null);
        animatorSet.start();
        while (true) {
            a0.h hVar = this.y;
            if (i10 >= hVar.m()) {
                hVar.b();
                return;
            }
            c3 c3Var = (c3) hVar.n(i10);
            Bitmap bitmap = c3Var.b;
            if (bitmap != null) {
                bitmap.recycle();
                c3Var.b = null;
            }
            i10++;
        }
    }

    public final void s() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.a0;
            if (i10 >= arrayList.size()) {
                arrayList.clear();
                t();
                return;
            }
            Object obj = arrayList.get(i10);
            if (obj instanceof d3) {
                r3 r3Var = this.r0[0];
                if (r3Var != null && r3Var.G == obj) {
                    ((d3) obj).c(r3Var);
                }
                r3 r3Var2 = this.r0[1];
                if (r3Var2 != null && r3Var2.G == obj) {
                    ((d3) obj).c(r3Var2);
                }
                ((d3) obj).a();
            } else if (obj instanceof TLRPC.WebPage) {
                org.telegram.ui.web.h2.o((TLRPC.WebPage) obj);
            }
            i10++;
        }
    }

    public final void t() {
        ArticleViewer$WindowView articleViewer$WindowView;
        if (this.I == null || (articleViewer$WindowView = this.c0) == null) {
            return;
        }
        if (this.H == null) {
            try {
                if (articleViewer$WindowView.getParent() != null) {
                    ((WindowManager) this.I.getSystemService("window")).removeViewImmediate(this.c0);
                }
                this.c0 = null;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        for (int i10 = 0; i10 < this.K.size(); i10++) {
            ((w1) this.K.get(i10)).a(true);
        }
        this.K.clear();
        try {
            this.I.getWindow().clearFlags(128);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        this.I = null;
        this.J = null;
        Z0 = null;
    }

    public n4(org.telegram.ui.ActionBar.p2 p2Var) {
        this.K = new ArrayList();
        this.V = 1;
        this.Z = new DecelerateInterpolator(1.5f);
        this.a0 = new ArrayList();
        this.t0 = new Paint();
        this.u0 = new Paint();
        this.v0 = new Paint();
        this.w0 = new Paint();
        this.G0 = false;
        this.H0 = null;
        this.I0 = null;
        this.O0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats});
        this.P0 = new n0[2];
        this.T0 = -1;
        d0 d0Var = new d0(this, 2);
        org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.h;
        this.W0 = new org.telegram.ui.Components.c5(d0Var, 320L, mrVar);
        this.X0 = new org.telegram.ui.Components.c5(new d0(this, 4), 320L, mrVar);
        this.G = true;
        this.H = new a4(this, p2Var);
        Y(p2Var.getParentActivity(), p2Var);
    }
}
