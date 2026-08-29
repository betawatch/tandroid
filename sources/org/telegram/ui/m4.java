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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class m4 extends d70 implements NotificationCenter.NotificationCenterDelegate {
    public static TextPaint c1;
    public static TextPaint d1;
    public static TextPaint e1;
    public static TextPaint f1;
    public static TextPaint g1;
    public static TextPaint h1;
    public static TextPaint i1;
    public static TextPaint j1;
    public static Paint k1;
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
    public static Paint x1;
    public org.telegram.ui.Components.s81 A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public final boolean F;
    public boolean F0;
    public final z3 G;
    public e3 G0;
    public Activity H;
    public e3 H0;
    public org.telegram.ui.ActionBar.o2 I;
    public ye.c I0;
    public final ArrayList J;
    public int J0;
    public View K;
    public org.telegram.ui.Cells.k9 K0;
    public FrameLayout L;
    public org.telegram.ui.Cells.k9 L0;
    public TextureView M;
    public lu0 M0;
    public e5.c N;
    public final AnimationNotificationsLocker N0;
    public WebChromeClient.CustomViewCallback O;
    public final n0[] O0;
    public WindowInsets P;
    public boolean P0;
    public boolean Q;
    public jf.s0 Q0;
    public boolean R;
    public ag.v0 R0;
    public boolean S;
    public int S0;
    public int T;
    public ValueAnimator T0;
    public int U;
    public float U0;
    public int V;
    public final org.telegram.ui.Components.f5 V0;
    public Runnable W;
    public final org.telegram.ui.Components.f5 W0;
    public long X;
    public final DecelerateInterpolator Y;
    public final ArrayList Z;
    public WindowManager.LayoutParams a0;
    public ArticleViewer$WindowView b0;
    public n0 c0;
    public o0 d0;
    public org.telegram.ui.web.l e0;
    public d0 f0;
    public org.telegram.ui.ActionBar.f3 g0;
    public Paint h0;
    public Drawable i0;
    public Paint j0;
    public boolean k0;
    public float l0;
    public bh.d m0;
    public ImageView n0;
    public ImageView o0;
    public org.telegram.ui.Components.o6 p0;
    public q3[] q0;
    public AnimatorSet r0;
    public final Paint s0;
    public final Paint t0;
    public final Paint u0;
    public final Paint v0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout w0;
    public TextView x0;
    public Rect y0;
    public org.telegram.ui.Components.s81 z0;
    public static final HashSet X0 = new HashSet();
    public static volatile m4 Y0 = null;
    public static final w0 Z0 = new w0("innerTranslationX", 0);
    public static final TextPaint a1 = new TextPaint(1);
    public static final u3 b1 = new u3();
    public static final WeakHashMap w1 = new WeakHashMap();

    public m4() {
        this.J = new ArrayList();
        this.U = 1;
        this.Y = new DecelerateInterpolator(1.5f);
        this.Z = new ArrayList();
        this.s0 = new Paint();
        this.t0 = new Paint();
        this.u0 = new Paint();
        this.v0 = new Paint();
        this.F0 = false;
        this.G0 = null;
        this.H0 = null;
        this.N0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats});
        this.O0 = new n0[2];
        this.S0 = -1;
        d0 d0Var = new d0(this, 2);
        org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.h;
        this.V0 = new org.telegram.ui.Components.f5(d0Var, 320L, jrVar);
        this.W0 = new org.telegram.ui.Components.f5(new d0(this, 4), 320L, jrVar);
        this.F = false;
        this.G = null;
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

    public static CharSequence C(d70 d70Var, TLRPC.WebPage webPage, View view, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock, int i10) {
        TextPaint E;
        if (richText2 == null) {
            return null;
        }
        if (richText2 instanceof TL_iv.textFixed) {
            return C(d70Var, webPage, view, richText, ((TL_iv.textFixed) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textItalic) {
            return C(d70Var, webPage, view, richText, ((TL_iv.textItalic) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textBold) {
            return C(d70Var, webPage, view, richText, ((TL_iv.textBold) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textUnderline) {
            return C(d70Var, webPage, view, richText, ((TL_iv.textUnderline) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textStrike) {
            return C(d70Var, webPage, view, richText, ((TL_iv.textStrike) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textEmail) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C(d70Var, webPage, view, richText, ((TL_iv.textEmail) richText2).text, pageBlock, i10));
            MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder.length() != 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.d01((metricAffectingSpanArr == null || metricAffectingSpanArr.length == 0) ? E(d70Var, richText, richText2, pageBlock) : null, "mailto:" + F(richText2)), 0, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        long j10 = 0;
        if (richText2 instanceof TL_iv.textUrl) {
            TL_iv.textUrl texturl = (TL_iv.textUrl) richText2;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(C(d70Var, webPage, view, richText, texturl.text, pageBlock, i10));
            MetricAffectingSpan[] metricAffectingSpanArr2 = (MetricAffectingSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), MetricAffectingSpan.class);
            E = (metricAffectingSpanArr2 == null || metricAffectingSpanArr2.length == 0) ? E(d70Var, richText, richText2, pageBlock) : null;
            Object e01Var = texturl.webpage_id != 0 ? new org.telegram.ui.Components.e01(E, F(richText2)) : new org.telegram.ui.Components.d01(E, F(richText2));
            if (spannableStringBuilder2.length() != 0) {
                spannableStringBuilder2.setSpan(e01Var, 0, spannableStringBuilder2.length(), 33);
            }
            return spannableStringBuilder2;
        }
        if (richText2 instanceof TL_iv.textPlain) {
            return ((TL_iv.textPlain) richText2).text;
        }
        if (richText2 instanceof TL_iv.textAnchor) {
            TL_iv.textAnchor textanchor = (TL_iv.textAnchor) richText2;
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(C(d70Var, webPage, view, richText, textanchor.text, pageBlock, i10));
            String str = textanchor.name;
            org.telegram.ui.Components.d5 d5Var = new org.telegram.ui.Components.d5();
            d5Var.a = str.toLowerCase();
            spannableStringBuilder3.setSpan(d5Var, 0, spannableStringBuilder3.length(), 17);
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
                boolean z10 = i10 >= 0 && (richText3 instanceof TL_iv.textUrl) && ((TL_iv.textUrl) richText3).webpage_id != j10;
                if (z10 && spannableStringBuilder4.length() != 0 && spannableStringBuilder4.charAt(spannableStringBuilder4.length() - 1) != '\n') {
                    spannableStringBuilder4.append((CharSequence) " ");
                    spannableStringBuilder4.setSpan(new org.telegram.ui.Cells.m9(), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                }
                CharSequence C = C(d70Var, webPage, view, richText, richText3, pageBlock, i10);
                int D = D(A);
                int length = spannableStringBuilder4.length();
                spannableStringBuilder4.append(C);
                if (D != 0 && !(C instanceof SpannableStringBuilder)) {
                    if ((D & 8) != 0 || (D & 512) != 0) {
                        String F = F(richText3);
                        if (F == null) {
                            F = F(richText);
                        }
                        Object e01Var2 = (D & 512) != 0 ? new org.telegram.ui.Components.e01(E(d70Var, richText, A, pageBlock), F) : new org.telegram.ui.Components.d01(E(d70Var, richText, A, pageBlock), F);
                        if (length != spannableStringBuilder4.length()) {
                            spannableStringBuilder4.setSpan(e01Var2, length, spannableStringBuilder4.length(), 33);
                        }
                    } else if (length != spannableStringBuilder4.length()) {
                        TextPaint E2 = E(d70Var, richText, A, pageBlock);
                        org.telegram.ui.Components.c01 c01Var = new org.telegram.ui.Components.c01();
                        c01Var.a = E2;
                        spannableStringBuilder4.setSpan(c01Var, length, spannableStringBuilder4.length(), 33);
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
            return C(d70Var, webPage, view, richText, ((TL_iv.textSubscript) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textSuperscript) {
            return C(d70Var, webPage, view, richText, ((TL_iv.textSuperscript) richText2).text, pageBlock, i10);
        }
        if (richText2 instanceof TL_iv.textMarked) {
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(C(d70Var, webPage, view, richText, ((TL_iv.textMarked) richText2).text, pageBlock, i10));
            MetricAffectingSpan[] metricAffectingSpanArr3 = (MetricAffectingSpan[]) spannableStringBuilder5.getSpans(0, spannableStringBuilder5.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder5.length() != 0) {
                E = (metricAffectingSpanArr3 == null || metricAffectingSpanArr3.length == 0) ? E(d70Var, richText, richText2, pageBlock) : null;
                org.telegram.ui.Components.b01 b01Var = new org.telegram.ui.Components.b01();
                b01Var.a = E;
                spannableStringBuilder5.setSpan(b01Var, 0, spannableStringBuilder5.length(), 33);
            }
            return spannableStringBuilder5;
        }
        if (richText2 instanceof TL_iv.textSpoiler) {
            SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(C(d70Var, webPage, view, richText, ((TL_iv.textSpoiler) richText2).text, pageBlock, i10));
            if (spannableStringBuilder6.length() != 0) {
                org.telegram.ui.Components.h01 h01Var = new org.telegram.ui.Components.h01();
                h01Var.a |= 256;
                spannableStringBuilder6.setSpan(new org.telegram.ui.Components.i01(h01Var, 0), 0, spannableStringBuilder6.length(), 33);
            }
            return spannableStringBuilder6;
        }
        if (richText2 instanceof TL_iv.textPhone) {
            SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(C(d70Var, webPage, view, richText, ((TL_iv.textPhone) richText2).text, pageBlock, i10));
            MetricAffectingSpan[] metricAffectingSpanArr4 = (MetricAffectingSpan[]) spannableStringBuilder7.getSpans(0, spannableStringBuilder7.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder7.length() != 0) {
                spannableStringBuilder7.setSpan(new org.telegram.ui.Components.d01((metricAffectingSpanArr4 == null || metricAffectingSpanArr4.length == 0) ? E(d70Var, richText, richText2, pageBlock) : null, "tel:" + F(richText2)), 0, spannableStringBuilder7.length(), 33);
            }
            return spannableStringBuilder7;
        }
        if (richText2 instanceof TL_iv.textImage) {
            TL_iv.textImage textimage = (TL_iv.textImage) richText2;
            TLRPC.Document a2 = j4.a(webPage, textimage.document_id);
            TLRPC.Photo e10 = j4.e(webPage, textimage.photo_id);
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
                    int i12 = org.telegram.ui.ActionBar.g6.d6;
                    ((m4) d70Var).getClass();
                    boolean z11 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.w0(null, i12, false)) <= 0.705f;
                    org.telegram.ui.Components.a01 a01Var = new org.telegram.ui.Components.a01();
                    Locale locale = Locale.US;
                    String str2 = dp + "_" + dp2 + "_i";
                    a01Var.b = dp;
                    a01Var.c = dp2;
                    boolean z12 = z11;
                    ImageReceiver imageReceiver = new ImageReceiver(view);
                    a01Var.a = imageReceiver;
                    imageReceiver.setInvalidateAll(true);
                    if (z12) {
                        imageReceiver.setDelegate(new org.telegram.ui.Components.xo0(6));
                    }
                    imageReceiver.setImage(ImageLocation.getForDocument(a2), str2, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(a2.thumbs, 90), a2), str2, -1L, null, webPage, 1);
                    spannableStringBuilder8.setSpan(a01Var, 0, spannableStringBuilder8.length(), 33);
                }
                return spannableStringBuilder8;
            }
            if (e10 instanceof org.telegram.ui.web.e2) {
                org.telegram.ui.web.e2 e2Var = (org.telegram.ui.web.e2) e10;
                SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder("*");
                int dp3 = AndroidUtilities.dp(textimage.w);
                int dp4 = AndroidUtilities.dp(textimage.h);
                int abs2 = Math.abs(i10);
                if (dp3 > abs2) {
                    dp4 = (int) (dp4 * (abs2 / dp3));
                    dp3 = abs2;
                }
                if (view != null) {
                    org.telegram.ui.Components.a01 a01Var2 = new org.telegram.ui.Components.a01();
                    a01Var2.b = dp3;
                    a01Var2.c = dp4;
                    ImageReceiver imageReceiver2 = new ImageReceiver(view);
                    a01Var2.a = imageReceiver2;
                    imageReceiver2.setInvalidateAll(true);
                    org.telegram.ui.web.f2.g(e2Var, imageReceiver2, new org.telegram.ui.Components.g5(15));
                    spannableStringBuilder9.setSpan(a01Var2, 0, spannableStringBuilder9.length(), 33);
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
                th.q a10 = th.q.a(textmath.source, AndroidUtilities.dp(20.0f), true);
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
                int i15 = org.telegram.ui.ActionBar.g6.G6;
                ((m4) d70Var).getClass();
                spannableStringBuilder10.setSpan(new org.telegram.ui.Components.a01(view, bitmap, i13, i14, org.telegram.ui.ActionBar.g6.w0(null, i15, false), textmath.depth), 0, spannableStringBuilder10.length(), 33);
                String str3 = textmath.source;
                if (str3 != null && !str3.isEmpty()) {
                    spannableStringBuilder10.setSpan(new org.telegram.ui.Cells.q9(textmath.source), 0, spannableStringBuilder10.length(), 33);
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

    public static TextPaint E(d70 d70Var, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock) {
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
        m4 m4Var = (m4) d70Var;
        m4Var.getClass();
        u3 u3Var = b1;
        u3Var.getClass();
        SparseArray sparseArray = u3Var.x;
        SparseArray sparseArray2 = u3Var.w;
        SparseArray sparseArray3 = u3Var.t;
        SparseArray sparseArray4 = u3Var.c;
        SparseArray sparseArray5 = u3Var.b;
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
            b10 = d70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockMap) {
            TL_iv.RichText richText4 = ((TL_iv.pageBlockMap) pageBlock).caption.text;
            if (richText4 == richText2 || richText4 == richText) {
                dp6 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            } else {
                dp6 = AndroidUtilities.dp(12.0f);
            }
            dp8 = dp6;
            b10 = d70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockTitle) {
            sparseArray4 = u3Var.d;
            dp8 = AndroidUtilities.dp(23.0f);
            b10 = d70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockKicker) {
            sparseArray4 = u3Var.e;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = d70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockAuthorDate) {
            sparseArray4 = u3Var.o;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = d70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockFooter) {
            sparseArray4 = u3Var.p;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = d70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockSubtitle) {
            sparseArray4 = u3Var.g;
            dp8 = AndroidUtilities.dp(20.0f);
            b10 = d70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
            sparseArray4 = u3Var.f;
            dp8 = AndroidUtilities.dp(20.0f);
            b10 = d70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
            sparseArray4 = u3Var.h;
            dp8 = AndroidUtilities.dp(17.0f);
            b10 = d70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            sparseArray4 = u3Var.i;
            dp8 = AndroidUtilities.dp(18.0f);
            b10 = d70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            sparseArray4 = u3Var.j;
            dp8 = AndroidUtilities.dp(16.0f);
            b10 = d70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            sparseArray4 = u3Var.k;
            dp8 = AndroidUtilities.dp(15.0f);
            b10 = d70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            sparseArray4 = u3Var.l;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = d70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            sparseArray4 = u3Var.m;
            dp8 = AndroidUtilities.dp(13.0f);
            b10 = d70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            sparseArray4 = u3Var.n;
            dp8 = AndroidUtilities.dp(12.0f);
            b10 = d70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
            if (pageblockblockquote.text == richText) {
                dp8 = AndroidUtilities.dp(15.0f);
                b10 = d70Var.b();
                sparseArray4 = sparseArray3;
            } else {
                if (pageblockblockquote.caption == richText) {
                    dp8 = AndroidUtilities.dp(14.0f);
                    b10 = d70Var.a();
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
                b10 = d70Var.b();
                sparseArray4 = sparseArray3;
            } else {
                if (pageblockpullquote.caption == richText) {
                    dp8 = AndroidUtilities.dp(14.0f);
                    b10 = d70Var.a();
                    sparseArray3 = sparseArray5;
                    sparseArray4 = sparseArray3;
                }
                b10 = -65536;
                sparseArray3 = null;
                sparseArray4 = sparseArray3;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            sparseArray4 = u3Var.s;
            dp8 = AndroidUtilities.dp(14.0f);
            b10 = d70Var.b();
            D |= 4;
        } else if (pageBlock instanceof TL_iv.pageBlockParagraph) {
            sparseArray4 = u3Var.q;
            dp8 = AndroidUtilities.dp(16.0f);
            b10 = d70Var.b();
        } else if (L(pageBlock)) {
            sparseArray4 = u3Var.r;
            dp8 = AndroidUtilities.dp(16.0f);
            b10 = d70Var.b();
        } else if (pageBlock instanceof TL_iv.pageBlockEmbed) {
            TL_iv.RichText richText5 = ((TL_iv.pageBlockEmbed) pageBlock).caption.text;
            if (richText5 == richText2 || richText5 == richText) {
                dp5 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            } else {
                dp5 = AndroidUtilities.dp(12.0f);
            }
            dp8 = dp5;
            b10 = d70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.RichText richText6 = ((TL_iv.pageBlockSlideshow) pageBlock).caption.text;
            if (richText6 == richText2 || richText6 == richText) {
                dp4 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            } else {
                dp4 = AndroidUtilities.dp(12.0f);
            }
            dp8 = dp4;
            b10 = d70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
            TL_iv.RichText richText7 = ((TL_iv.pageBlockCollage) pageBlock).caption.text;
            if (richText7 == richText2 || richText7 == richText) {
                dp3 = AndroidUtilities.dp(14.0f);
                sparseArray4 = sparseArray5;
            } else {
                dp3 = AndroidUtilities.dp(12.0f);
            }
            dp8 = dp3;
            b10 = d70Var.a();
        } else if (pageBlock instanceof TL_iv.pageBlockEmbedPost) {
            TL_iv.PageCaption pageCaption = ((TL_iv.pageBlockEmbedPost) pageBlock).caption;
            if (richText2 == pageCaption.text) {
                dp8 = AndroidUtilities.dp(14.0f);
                b10 = d70Var.a();
                sparseArray4 = sparseArray5;
            } else if (richText2 == pageCaption.credit) {
                dp8 = AndroidUtilities.dp(12.0f);
                b10 = d70Var.a();
            } else {
                if (richText2 != null) {
                    sparseArray4 = u3Var.u;
                    dp8 = AndroidUtilities.dp(14.0f);
                    b10 = d70Var.b();
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
                b10 = d70Var.b();
            } else if (pageBlock instanceof TL_iv.pageBlockAudio) {
                if (richText2 == ((TL_iv.pageBlockAudio) pageBlock).caption.text) {
                    dp = AndroidUtilities.dp(14.0f);
                    sparseArray = sparseArray2;
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                }
                dp8 = dp;
                b10 = d70Var.b();
            } else if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                sparseArray4 = u3Var.y;
                dp8 = AndroidUtilities.dp(15.0f);
                b10 = d70Var.a();
            } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                sparseArray4 = u3Var.z;
                dp8 = AndroidUtilities.dp(15.0f);
                b10 = d70Var.b();
            } else {
                if (pageBlock instanceof TL_iv.pageBlockTable) {
                    sparseArray4 = u3Var.A;
                    dp8 = AndroidUtilities.dp(15.0f);
                    b10 = d70Var.b();
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
            if (u3Var.a == null) {
                TextPaint textPaint = new TextPaint(1);
                u3Var.a = textPaint;
                textPaint.setColor(-65536);
            }
            u3Var.a.setTextSize(AndroidUtilities.dp(14.0f));
            return u3Var.a;
        }
        TextPaint textPaint2 = (TextPaint) sparseArray4.get(D);
        if (textPaint2 == null) {
            textPaint2 = new TextPaint(1);
            if ((D & 4) != 0) {
                textPaint2.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
            } else if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                textPaint2.setTypeface(AndroidUtilities.bold());
            } else if (d70Var.a != 1 && !(pageBlock instanceof TL_iv.pageBlockTitle) && !(pageBlock instanceof TL_iv.pageBlockKicker) && !(pageBlock instanceof TL_iv.pageBlockHeader) && !(pageBlock instanceof TL_iv.pageBlockSubtitle) && !(pageBlock instanceof TL_iv.pageBlockSubheader) && !K(pageBlock)) {
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
                m4Var.getClass();
                b10 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J6, false);
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
        return Y0 != null;
    }

    public static boolean K(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
    }

    public static boolean L(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof c4) || (pageBlock instanceof e4);
    }

    public static boolean O(a4 a4Var) {
        boolean z10;
        TL_iv.PageBlock z11 = z(a4Var.a);
        if (z11 instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) z11;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                return true;
            }
        } else if (z11 instanceof a4) {
            a4 a4Var2 = (a4) z11;
            TL_iv.PageBlock z12 = z(a4Var2.b);
            if (z12 instanceof TL_iv.pageBlockDetails) {
                TL_iv.pageBlockDetails pageblockdetails2 = (TL_iv.pageBlockDetails) z12;
                if (!pageblockdetails2.open) {
                    pageblockdetails2.open = true;
                    z10 = true;
                    if (!O(a4Var2) || z10) {
                        return true;
                    }
                }
            }
            z10 = false;
            if (!O(a4Var2)) {
            }
            return true;
        }
        return false;
    }

    public static void T(d70 d70Var) {
        if (d70Var.b == null && d70Var.f == null) {
            return;
        }
        View view = d70Var.f;
        d70Var.c.d(true);
        d70Var.b = null;
        d70Var.d = null;
        d70Var.f = null;
        if (view != null) {
            view.invalidate();
        }
    }

    public static /* synthetic */ WindowInsets e(WindowInsets windowInsets) {
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public static void f(String str, int i10, FrameLayout frameLayout, z3 z3Var, org.telegram.ui.ActionBar.c6 c6Var) {
        String s10 = org.telegram.ui.web.z0.s(str);
        long clientUserId = UserConfig.getInstance(i10).getClientUserId();
        SendMessagesHelper.getInstance(i10).sendMessage(SendMessagesHelper.SendMessageParams.of(s10, clientUserId));
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_message.peer_id = tL_peerUser;
        tL_peerUser.user_id = clientUserId;
        TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
        tL_message.from_id = tL_peerUser2;
        tL_peerUser2.user_id = clientUserId;
        tL_message.message = s10;
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
        tL_message.media = tL_messageMediaWebPage;
        tL_messageMediaWebPage.webpage = new TLRPC.TL_webPage();
        TLRPC.WebPage webPage = tL_message.media.webpage;
        webPage.url = s10;
        webPage.display_url = s10;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.bookmarkAdded, new MessageObject(i10, tL_message, false, false));
        new org.telegram.ui.Components.tc(frameLayout, c6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.WebBookmarkedToast), new eg.z1(z3Var, clientUserId, 18))).k(true);
    }

    public static void g0(m4 m4Var) {
        TextPaint textPaint = i1;
        if (textPaint != null) {
            textPaint.setColor(m4Var.b());
        }
        TextPaint textPaint2 = j1;
        if (textPaint2 != null) {
            textPaint2.setColor(m4Var.b());
        }
        TextPaint textPaint3 = c1;
        if (textPaint3 != null) {
            textPaint3.setColor(m4Var.b());
        }
        TextPaint textPaint4 = e1;
        if (textPaint4 != null) {
            textPaint4.setColor(m4Var.b());
        }
        TextPaint textPaint5 = f1;
        if (textPaint5 != null) {
            textPaint5.setColor(-1);
        }
        TextPaint textPaint6 = g1;
        if (textPaint6 != null) {
            textPaint6.setColor(m4Var.b());
        }
        TextPaint textPaint7 = h1;
        if (textPaint7 != null) {
            textPaint7.setColor(m4Var.a());
        }
        TextPaint textPaint8 = d1;
        if (textPaint8 != null) {
            textPaint8.setColor(m4Var.a());
        }
        r(m4Var, true);
        u3 u3Var = b1;
        u3.a(m4Var, u3Var.d);
        u3.a(m4Var, u3Var.e);
        u3.a(m4Var, u3Var.g);
        u3.a(m4Var, u3Var.f);
        u3.a(m4Var, u3Var.h);
        u3.a(m4Var, u3Var.i);
        u3.a(m4Var, u3Var.j);
        u3.a(m4Var, u3Var.k);
        u3.a(m4Var, u3Var.l);
        u3.a(m4Var, u3Var.m);
        u3.a(m4Var, u3Var.n);
        u3.a(m4Var, u3Var.t);
        u3.a(m4Var, u3Var.s);
        u3.a(m4Var, u3Var.q);
        u3.a(m4Var, u3Var.r);
        u3.a(m4Var, u3Var.u);
        u3.a(m4Var, u3Var.w);
        u3.a(m4Var, u3Var.x);
        u3.a(m4Var, u3Var.b);
        u3.a(m4Var, u3Var.c);
        u3.a(m4Var, u3Var.o);
        u3.a(m4Var, u3Var.p);
        u3.a(m4Var, u3Var.v);
        u3.a(m4Var, u3Var.y);
        u3.a(m4Var, u3Var.z);
        u3.a(m4Var, u3Var.A);
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

    public static CharSequence j(d70 d70Var, k4 k4Var, f3 f3Var) {
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
        org.telegram.ui.Components.d01[] d01VarArr = (org.telegram.ui.Components.d01[]) spannable.getSpans(0, spannable.length(), org.telegram.ui.Components.d01.class);
        CharSequence charSequence = text;
        if (d01VarArr != null) {
            charSequence = text;
            if (d01VarArr.length != 0) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannable);
                for (org.telegram.ui.Components.d01 d01Var : d01VarArr) {
                    int spanStart = spannableStringBuilder2.getSpanStart(d01Var);
                    int spanEnd = spannableStringBuilder2.getSpanEnd(d01Var);
                    if (spanStart >= 0 && spanEnd > spanStart) {
                        spannableStringBuilder2.setSpan(new r0(d70Var, k4Var, d01Var, 0), spanStart, spanEnd, 33);
                    }
                }
                f3Var.y = spannableStringBuilder2;
                charSequence = spannableStringBuilder2;
            }
        }
        return charSequence;
    }

    public static TL_iv.PageBlock j0(TL_iv.PageBlock pageBlock, a4 a4Var) {
        if (pageBlock instanceof c4) {
            c4 c4Var = (c4) pageBlock;
            c4 c4Var2 = new c4();
            c4Var2.a = c4Var.a;
            c4Var2.b = c4Var.b;
            c4Var2.c = c4Var.c;
            c4Var2.d = j0(c4Var.d, a4Var);
            return c4Var2;
        }
        if (!(pageBlock instanceof e4)) {
            return a4Var;
        }
        e4 e4Var = (e4) pageBlock;
        e4 e4Var2 = new e4();
        e4Var2.a = e4Var.a;
        e4Var2.b = e4Var.b;
        e4Var2.c = e4Var.c;
        e4Var2.d = j0(e4Var.d, a4Var);
        return e4Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x0252, code lost:
    
        if (r0.isShowing() == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x018b, code lost:
    
        r17 = new android.graphics.Path();
        r0 = r29.E;
        r5 = r0.size();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0197, code lost:
    
        if (r6 >= r5) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0199, code lost:
    
        r8 = r0.get(r6);
        r6 = r6 + 1;
        r8 = ((gh.k) r8).getBounds();
        r17.addRect(r8.left, r8.top, r8.right, r8.bottom, android.graphics.Path.Direction.CW);
        r17 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01c3, code lost:
    
        r17.computeBounds(new android.graphics.RectF(), false);
        r0 = (float) java.lang.Math.sqrt((r0.height() * r0.height()) + (r0.width() * r0.width()));
        ((gh.k) r29.E.get(0)).q = new org.telegram.ui.f0(r28, r29);
        r3 = r29.E;
        r5 = r3.size();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0200, code lost:
    
        if (r6 >= r5) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0202, code lost:
    
        r8 = r3.get(r6);
        r6 = r6 + 1;
        ((gh.k) r8).j(r7, r4, r0, false);
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
    public static boolean l(d70 d70Var, k4 k4Var, MotionEvent motionEvent, View view, f3 f3Var, int i10, int i11) {
        org.telegram.ui.Cells.k9 k9Var;
        m4 m4Var;
        Object obj;
        m4 m4Var2;
        org.telegram.ui.Cells.k9 k9Var2;
        org.telegram.ui.Components.i01[] i01VarArr;
        boolean z10 = ((m4) d70Var).r0 == null;
        org.telegram.ui.Components.v80 v80Var = d70Var.c;
        if (!z10 || view == null) {
            return false;
        }
        m4 m4Var3 = (m4) d70Var;
        if (view.getTag() == null || view.getTag() != "bottomSheet" || (k9Var = m4Var3.L0) == null) {
            k9Var = m4Var3.K0;
        }
        if (k9Var != null && !k9Var.g0(view)) {
            return false;
        }
        d70Var.f = view;
        if (f3Var != null) {
            StaticLayout staticLayout = f3Var.d;
            int x4 = (int) motionEvent.getX();
            int y8 = (int) motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                int lineCount = staticLayout.getLineCount();
                float f9 = 2.14748365E9f;
                float f10 = 0.0f;
                for (int i12 = 0; i12 < lineCount; i12++) {
                    f10 = Math.max(staticLayout.getLineWidth(i12), f10);
                    f9 = Math.min(staticLayout.getLineLeft(i12), f9);
                }
                float f11 = x4;
                float f12 = i10 + f9;
                if (f11 >= f12 && f11 <= f12 + f10 && y8 >= i11 && y8 <= staticLayout.getHeight() + i11) {
                    d70Var.d = f3Var;
                    d70Var.e = i11;
                    if (staticLayout.getText() instanceof Spannable) {
                        int i13 = x4 - i10;
                        int i14 = y8 - i11;
                        try {
                            int lineForVertical = staticLayout.getLineForVertical(i14);
                            float f13 = i13;
                            int offsetForHorizontal = staticLayout.getOffsetForHorizontal(lineForVertical, f13);
                            float lineLeft = staticLayout.getLineLeft(lineForVertical);
                            if (lineLeft <= f13 && lineLeft + staticLayout.getLineWidth(lineForVertical) >= f13) {
                                Spannable spannable = (Spannable) staticLayout.getText();
                                org.telegram.ui.Components.d01[] d01VarArr = (org.telegram.ui.Components.d01[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, org.telegram.ui.Components.d01.class);
                                if (d01VarArr == null || d01VarArr.length <= 0) {
                                    m4Var = m4Var3;
                                    obj = "bottomSheet";
                                } else {
                                    org.telegram.ui.Components.d01 d01Var = d01VarArr[0];
                                    int spanStart = spannable.getSpanStart(d01Var);
                                    m4Var = m4Var3;
                                    obj = "bottomSheet";
                                    int spanEnd = spannable.getSpanEnd(d01Var);
                                    int i15 = 1;
                                    while (i15 < d01VarArr.length) {
                                        try {
                                            org.telegram.ui.Components.d01 d01Var2 = d01VarArr[i15];
                                            org.telegram.ui.Components.d01[] d01VarArr2 = d01VarArr;
                                            int spanStart2 = spannable.getSpanStart(d01Var2);
                                            int i16 = i15;
                                            int spanEnd2 = spannable.getSpanEnd(d01Var2);
                                            if (spanStart > spanStart2 || spanEnd2 > spanEnd) {
                                                spanStart = spanStart2;
                                                d01Var = d01Var2;
                                                spanEnd = spanEnd2;
                                            }
                                            i15 = i16 + 1;
                                            d01VarArr = d01VarArr2;
                                        } catch (Exception e10) {
                                            e = e10;
                                            FileLog.e(e);
                                            if (motionEvent.getAction() == 0) {
                                            }
                                            if (motionEvent.getAction() != 0) {
                                            }
                                            if (!(view instanceof p1)) {
                                            }
                                        }
                                    }
                                    org.telegram.ui.Components.z80 z80Var = d70Var.b;
                                    if (z80Var == null || z80Var.i != d01Var) {
                                        if (z80Var != null) {
                                            v80Var.k(z80Var, true);
                                        }
                                        org.telegram.ui.Components.z80 z80Var2 = new org.telegram.ui.Components.z80(d01Var, null, f11, y8, 0);
                                        d70Var.b = z80Var2;
                                        z80Var2.d(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.K6, false) & 872415231);
                                        v80Var.a(d70Var.b, d70Var.d);
                                        try {
                                            org.telegram.ui.Components.s80 b10 = d70Var.b.b();
                                            b10.d(staticLayout, spanStart, 0.0f);
                                            TextPaint textPaint = d01Var.a;
                                            int i17 = textPaint != null ? textPaint.baselineShift : 0;
                                            b10.o = i17 != 0 ? i17 + AndroidUtilities.dp(i17 > 0 ? 5.0f : -2.0f) : 0;
                                            staticLayout.getSelectionPath(spanStart, spanEnd, b10);
                                            view.invalidate();
                                        } catch (Exception e11) {
                                            FileLog.e(e11);
                                        }
                                    }
                                }
                                ArrayList arrayList = f3Var.E;
                                if (arrayList != null && !arrayList.isEmpty() && (i01VarArr = (org.telegram.ui.Components.i01[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, org.telegram.ui.Components.i01.class)) != null) {
                                    int i18 = 0;
                                    while (true) {
                                        if (i18 >= i01VarArr.length) {
                                            break;
                                        }
                                        if (i01VarArr[i18].c()) {
                                            break;
                                        }
                                        i18++;
                                    }
                                }
                            }
                        } catch (Exception e12) {
                            e = e12;
                            m4Var = m4Var3;
                            obj = "bottomSheet";
                        }
                    }
                }
            } else {
                m4Var = m4Var3;
                obj = "bottomSheet";
                if (motionEvent.getAction() == 1) {
                    org.telegram.ui.Components.z80 z80Var3 = d70Var.b;
                    if (z80Var3 != null) {
                        d70Var.c(k4Var, (org.telegram.ui.Components.d01) z80Var3.i);
                        T(d70Var);
                    }
                } else if (motionEvent.getAction() == 3) {
                    org.telegram.ui.ActionBar.o1 o1Var = d70Var.D;
                    if (o1Var != null) {
                    }
                    T(d70Var);
                }
            }
            if (motionEvent.getAction() == 0) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                m4Var2 = m4Var;
                if (!m4Var2.F0) {
                    m4Var2.F0 = true;
                    if (m4Var2.H0 == null) {
                        m4Var2.H0 = new e3(m4Var2, 1);
                    }
                    if (view.getTag() == null || view.getTag() != obj || (k9Var2 = m4Var2.L0) == null) {
                        m4Var2.K0.l0(view, (int) x10, (int) y10);
                    } else {
                        k9Var2.l0(view, (int) x10, (int) y10);
                    }
                    m4Var2.b0.postDelayed(m4Var2.H0, ViewConfiguration.getTapTimeout());
                    if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                        m4Var2.k();
                    }
                    return !(view instanceof p1) ? d70Var.b != null : d70Var.d != null;
                }
            } else {
                m4Var2 = m4Var;
            }
            if (motionEvent.getAction() != 0) {
                m4Var2.k();
            }
            if (!(view instanceof p1)) {
            }
        }
        m4Var = m4Var3;
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
    /* JADX WARN: Type inference failed for: r13v8, types: [android.graphics.Path, org.telegram.ui.Components.s80] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.text.Layout, android.text.StaticLayout] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r9v11, types: [android.graphics.Path, org.telegram.ui.Components.s80] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static f3 p(d70 d70Var, View view, CharSequence charSequence, TL_iv.RichText richText, int i10, int i11, TL_iv.PageBlock pageBlock, Layout.Alignment alignment, int i12, k4 k4Var) {
        d70 d70Var2;
        CharSequence C;
        TL_iv.RichText richText2;
        TL_iv.PageBlock pageBlock2;
        TextPaint E;
        ?? r42;
        CharSequence charSequence2;
        StaticLayout staticLayout;
        ?? r12;
        org.telegram.ui.Components.s80 s80Var;
        org.telegram.ui.Components.s80 s80Var2;
        View view2;
        TL_iv.RichText richText3;
        TL_iv.PageBlock pageBlock3;
        int i13;
        ?? r13;
        org.telegram.ui.Components.s80 s80Var3;
        org.telegram.ui.Components.b01[] b01VarArr;
        ?? s80Var4;
        int i14;
        org.telegram.ui.Components.e01[] e01VarArr;
        k4 k4Var2;
        if (charSequence == null && (richText == null || (richText instanceof TL_iv.textEmpty))) {
            return null;
        }
        int dp = i10 < 0 ? AndroidUtilities.dp(10.0f) : i10;
        if (charSequence != null) {
            d70Var2 = d70Var;
            richText2 = richText;
            C = charSequence;
            pageBlock2 = pageBlock;
        } else {
            d70Var2 = d70Var;
            C = C(d70Var2, k4Var != null ? k4Var.A : null, view, richText, richText, pageBlock, dp);
            richText2 = richText;
            pageBlock2 = pageBlock;
        }
        if (!TextUtils.isEmpty(C)) {
            int dp2 = AndroidUtilities.dp(SharedConfig.ivFontSize - 16);
            if ((pageBlock2 instanceof TL_iv.pageBlockEmbedPost) && richText2 == null) {
                if (((TL_iv.pageBlockEmbedPost) pageBlock2).author == charSequence) {
                    if (c1 == null) {
                        TextPaint textPaint = new TextPaint(1);
                        c1 = textPaint;
                        textPaint.setColor(d70Var2.b());
                    }
                    c1.setTextSize(AndroidUtilities.dp(15.0f) + dp2);
                    E = c1;
                } else {
                    if (d1 == null) {
                        TextPaint textPaint2 = new TextPaint(1);
                        d1 = textPaint2;
                        textPaint2.setColor(d70Var2.a());
                    }
                    d1.setTextSize(AndroidUtilities.dp(14.0f) + dp2);
                    E = d1;
                }
            } else if (pageBlock2 instanceof TL_iv.pageBlockChannel) {
                if (e1 == null) {
                    TextPaint textPaint3 = new TextPaint(1);
                    e1 = textPaint3;
                    textPaint3.setTypeface(AndroidUtilities.bold());
                    TextPaint textPaint4 = new TextPaint(1);
                    f1 = textPaint4;
                    textPaint4.setTypeface(AndroidUtilities.bold());
                }
                e1.setColor(d70Var2.b());
                e1.setTextSize(AndroidUtilities.dp(15.0f));
                f1.setColor(-1);
                f1.setTextSize(AndroidUtilities.dp(15.0f));
                E = (k4Var == null || k4Var.B == null) ? e1 : f1;
            } else if (pageBlock2 instanceof g4) {
                g4 g4Var = (g4) pageBlock2;
                if (charSequence == g4Var.a.articles.get(g4Var.b).title) {
                    if (g1 == null) {
                        TextPaint textPaint5 = new TextPaint(1);
                        g1 = textPaint5;
                        textPaint5.setTypeface(AndroidUtilities.bold());
                    }
                    g1.setColor(d70Var2.b());
                    g1.setTextSize(AndroidUtilities.dp(15.0f) + dp2);
                    E = g1;
                } else {
                    if (h1 == null) {
                        h1 = new TextPaint(1);
                    }
                    h1.setColor(d70Var2.a());
                    h1.setTextSize(AndroidUtilities.dp(14.0f) + dp2);
                    E = h1;
                }
            } else if (!L(pageBlock2) || charSequence == null) {
                E = E(d70Var2, richText2, richText2, pageBlock2);
            } else {
                if (i1 == null) {
                    TextPaint textPaint6 = new TextPaint(1);
                    i1 = textPaint6;
                    textPaint6.setColor(d70Var2.b());
                }
                if (j1 == null) {
                    TextPaint textPaint7 = new TextPaint(1);
                    j1 = textPaint7;
                    textPaint7.setColor(d70Var2.b());
                }
                i1.setTextSize(AndroidUtilities.dp(19.0f) + dp2);
                j1.setTextSize(AndroidUtilities.dp(16.0f) + dp2);
                E = (!(pageBlock2 instanceof c4) || ((c4) pageBlock2).c.a.ordered) ? j1 : i1;
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
                r12 = org.telegram.ui.Components.bw0.c(replaceEmoji, textPaint9, dp, Layout.Alignment.ALIGN_CENTER, 0.0f, false, TextUtils.TruncateAt.END, dp, i12, true);
            } else {
                TextPaint textPaint10 = E;
                r42 = 1;
                r12 = org.telegram.ui.Components.bw0.c(replaceEmoji, textPaint10, dp, alignment, AndroidUtilities.dp(4.0f), false, TextUtils.TruncateAt.END, dp, i12, true);
            }
            if (r12 != 0) {
                CharSequence text = r12.getText();
                if (i11 >= 0 && !d70Var2.A.isEmpty() && d70Var2.B != null && (k4Var2 = ((m4) d70Var2).q0[0].c) != null) {
                    String lowerCase = replaceEmoji.toString().toLowerCase();
                    int i15 = 0;
                    while (true) {
                        int indexOf = lowerCase.indexOf(d70Var2.B, i15);
                        if (indexOf < 0) {
                            break;
                        }
                        int length = d70Var2.B.length() + indexOf;
                        if (indexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(indexOf - 1))) {
                            k4Var2.y.put(d70Var2.B + pageBlock2 + richText2 + indexOf, Integer.valueOf(r12.getLineTop(r12.getLineForOffset(indexOf)) + i11));
                        }
                        i15 = length;
                    }
                }
                boolean z10 = text instanceof Spanned;
                if (z10) {
                    Spanned spanned = (Spanned) text;
                    try {
                        org.telegram.ui.Components.d5[] d5VarArr = (org.telegram.ui.Components.d5[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.d5.class);
                        int lineCount = r12.getLineCount();
                        if (d5VarArr != null && d5VarArr.length > 0) {
                            for (int i16 = 0; i16 < d5VarArr.length; i16++) {
                                if (lineCount <= r42) {
                                    k4Var.n.put(d5VarArr[i16].a, Integer.valueOf(i11));
                                } else {
                                    HashMap hashMap = k4Var.n;
                                    org.telegram.ui.Components.d5 d5Var = d5VarArr[i16];
                                    hashMap.put(d5Var.a, Integer.valueOf(i11 + r12.getLineTop(r12.getLineForOffset(spanned.getSpanStart(d5Var)))));
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                    try {
                        e01VarArr = (org.telegram.ui.Components.e01[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.e01.class);
                    } catch (Exception unused2) {
                    }
                    if (e01VarArr != null && e01VarArr.length > 0) {
                        r13 = new org.telegram.ui.Components.s80(0);
                        try {
                            r13.n = false;
                            for (int i17 = 0; i17 < e01VarArr.length; i17++) {
                                int spanStart = spanned.getSpanStart(e01VarArr[i17]);
                                int spanEnd = spanned.getSpanEnd(e01VarArr[i17]);
                                r13.d(r12, spanStart, 0.0f);
                                TextPaint textPaint11 = e01VarArr[i17].a;
                                int i18 = textPaint11 != null ? textPaint11.baselineShift : 0;
                                r13.o = i18 != 0 ? i18 + AndroidUtilities.dp(i18 > 0 ? 5.0f : -2.0f) : 0;
                                r12.getSelectionPath(spanStart, spanEnd, r13);
                            }
                            r13.n = r42;
                        } catch (Exception unused3) {
                        }
                        b01VarArr = (org.telegram.ui.Components.b01[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.b01.class);
                        if (b01VarArr != null && b01VarArr.length > 0) {
                            s80Var4 = new org.telegram.ui.Components.s80(0);
                            try {
                                s80Var4.n = false;
                                for (i14 = 0; i14 < b01VarArr.length; i14++) {
                                    int spanStart2 = spanned.getSpanStart(b01VarArr[i14]);
                                    int spanEnd2 = spanned.getSpanEnd(b01VarArr[i14]);
                                    s80Var4.d(r12, spanStart2, 0.0f);
                                    TextPaint textPaint12 = b01VarArr[i14].a;
                                    int i19 = textPaint12 != null ? textPaint12.baselineShift : 0;
                                    s80Var4.o = i19 != 0 ? i19 + AndroidUtilities.dp(i19 > 0 ? 5.0f : -2.0f) : 0;
                                    r12.getSelectionPath(spanStart2, spanEnd2, s80Var4);
                                }
                                s80Var4.n = r42;
                                s80Var3 = s80Var4;
                            } catch (Exception unused4) {
                                s80Var3 = s80Var4;
                            }
                            s80Var = s80Var3;
                            s80Var2 = r13;
                        }
                        s80Var3 = null;
                        s80Var = s80Var3;
                        s80Var2 = r13;
                    }
                    r13 = 0;
                    b01VarArr = (org.telegram.ui.Components.b01[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.b01.class);
                    if (b01VarArr != null) {
                        s80Var4 = new org.telegram.ui.Components.s80(0);
                        s80Var4.n = false;
                        while (i14 < b01VarArr.length) {
                        }
                        s80Var4.n = r42;
                        s80Var3 = s80Var4;
                        s80Var = s80Var3;
                        s80Var2 = r13;
                    }
                    s80Var3 = null;
                    s80Var = s80Var3;
                    s80Var2 = r13;
                } else {
                    s80Var = null;
                    s80Var2 = null;
                }
                f3 f3Var = new f3(d70Var2);
                f3Var.d = r12;
                f3Var.e = s80Var2;
                f3Var.f = s80Var;
                f3Var.n = pageBlock2;
                f3Var.r = richText2;
                f3Var.F = new Stack();
                f3Var.E = new ArrayList();
                f3Var.G = new AtomicReference();
                if (z10) {
                    view2 = view;
                    richText3 = richText;
                    pageBlock3 = pageBlock;
                    i13 = 1;
                    gh.k.a(view2, r12, -1, -1, (Spanned) text, f3Var.F, f3Var.E, null);
                } else {
                    view2 = view;
                    richText3 = richText2;
                    pageBlock3 = pageBlock2;
                    i13 = 1;
                }
                if (view2 != null) {
                    WeakHashMap weakHashMap = w1;
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

    public static f3 q(d70 d70Var, View view, CharSequence charSequence, TL_iv.RichText richText, int i10, int i11, TL_iv.PageBlock pageBlock, k4 k4Var) {
        return p(d70Var, view, charSequence, richText, i10, i11, pageBlock, Layout.Alignment.ALIGN_NORMAL, 0, k4Var);
    }

    public static void r(m4 m4Var, boolean z10) {
        if (m1 == null) {
            m1 = new Paint();
            l1 = new Paint();
            Paint paint = new Paint(1);
            o1 = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            o1.setStrokeWidth(AndroidUtilities.dp(1.0f));
            Paint paint2 = new Paint();
            p1 = paint2;
            paint2.setStyle(style);
            p1.setStrokeWidth(AndroidUtilities.dp(1.0f) / 2.0f);
            q1 = new Paint();
            r1 = new Paint();
            s1 = new Paint();
            t1 = new Paint(1);
            u1 = new Paint(1);
            k1 = new Paint();
            n1 = new Paint();
            v1 = new Paint(1);
        } else if (!z10) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false);
        u1.setColor(com.google.android.recaptcha.internal.a.y((float) Color.blue(w02), 0.0722f, (((float) Color.green(w02)) * 0.7152f) + (((float) Color.red(w02)) * 0.2126f), 255.0f) <= 0.705f ? -3041234 : -6551);
        Paint paint3 = t1;
        int i10 = org.telegram.ui.ActionBar.g6.K6;
        paint3.setColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false) & 872415231);
        t1.setPathEffect(org.telegram.ui.Components.s80.c());
        s1.setColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false) & 872415231);
        s1.setPathEffect(org.telegram.ui.Components.s80.c());
        Paint paint4 = p1;
        int i11 = org.telegram.ui.ActionBar.g6.k6;
        paint4.setColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        o1.setColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        k1.setColor(251658240);
        n1.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d7, false));
        v1.setColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false) & 872415231);
        v1.setPathEffect(org.telegram.ui.Components.s80.c());
        int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.M6, false);
        int red = Color.red(w03);
        int green = Color.green(w03);
        int blue = Color.blue(w03);
        r1.setColor(Color.argb(20, red, green, blue));
        q1.setColor(Color.argb(34, red, green, blue));
        int w04 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        l1.setColor(Color.argb(20, Color.red(w04), Color.green(w04), Color.blue(w04)));
        m1.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Uc, false));
    }

    public static void u(Canvas canvas, d70 d70Var, TL_iv.PageBlock pageBlock, int i10) {
        if (pageBlock == null || d70Var == null || m1 == null) {
            return;
        }
        int i11 = 0;
        int dp = i10 - (pageBlock.bottom ? AndroidUtilities.dp(6.0f) : 0);
        int i12 = pageBlock.quoteLevels;
        if (i12 == 0) {
            if (pageBlock.level > 0) {
                canvas.drawRect(AndroidUtilities.dp(18), 0.0f, AndroidUtilities.dp(2.0f) + r0, dp, m1);
                return;
            }
            return;
        }
        while (i12 != 0) {
            if ((i12 & 1) != 0) {
                canvas.drawRect(AndroidUtilities.dp((i11 * 14) + 18), 0.0f, AndroidUtilities.dp(2.0f) + r0, dp, m1);
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
    public static void v(d70 d70Var, Canvas canvas, org.telegram.ui.Cells.j9 j9Var, int i10) {
        org.telegram.ui.Cells.k9 k9Var;
        View view = (View) j9Var;
        m4 m4Var = (m4) d70Var;
        if (view != null) {
            m4Var.getClass();
            if (view.getTag() != null) {
                if (view.getTag() == "bottomSheet") {
                    k9Var = m4Var.L0;
                }
            }
        }
        k9Var = m4Var.K0;
        if (k9Var != null) {
            k9Var.a0(canvas, j9Var, i10);
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

    public static m4 x() {
        m4 m4Var;
        m4 m4Var2 = Y0;
        if (m4Var2 != null) {
            return m4Var2;
        }
        synchronized (m4.class) {
            try {
                m4Var = Y0;
                if (m4Var == null) {
                    m4Var = new m4();
                    Y0 = m4Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return m4Var;
    }

    public static View y(View view) {
        org.telegram.ui.Components.vk0 vk0Var;
        if (!(view instanceof b2)) {
            return (!(view instanceof e2) || (vk0Var = ((e2) view).d) == null) ? view : y(vk0Var.a);
        }
        org.telegram.ui.Components.vk0 vk0Var2 = ((b2) view).d;
        return vk0Var2 != null ? y(vk0Var2.a) : view;
    }

    public static TL_iv.PageBlock z(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof c4) {
            TL_iv.PageBlock pageBlock2 = ((c4) pageBlock).d;
            return pageBlock2 != null ? z(pageBlock2) : pageBlock2;
        }
        if (!(pageBlock instanceof e4)) {
            return pageBlock;
        }
        TL_iv.PageBlock pageBlock3 = ((e4) pageBlock).d;
        return pageBlock3 != null ? z(pageBlock3) : pageBlock3;
    }

    public final void G() {
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        z3 z3Var = this.G;
        boolean z10 = false;
        if (size <= 1) {
            ArticleViewer$WindowView articleViewer$WindowView = this.b0;
            articleViewer$WindowView.e = false;
            articleViewer$WindowView.d = false;
            float width = z3Var != null ? z3Var.E * z3Var.c.getWidth() : this.c0.getX();
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = r0.getMeasuredWidth() - width;
            if (z3Var != null) {
                animatorSet.playTogether(z3Var.d(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.c0, (Property<n0, Float>) View.TRANSLATION_X, r0.getMeasuredWidth()), ObjectAnimator.ofFloat(this.b0, Z0, r0.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / r0.getMeasuredWidth()) * measuredWidth), MediaDataController.MAX_LINKS_COUNT));
            animatorSet.setInterpolator(org.telegram.ui.Components.jr.h);
            animatorSet.addListener(new y0(this));
            animatorSet.start();
            this.P0 = true;
            return;
        }
        ArticleViewer$WindowView articleViewer$WindowView2 = this.b0;
        articleViewer$WindowView2.f = true;
        articleViewer$WindowView2.e = true;
        articleViewer$WindowView2.h = this.E0;
        this.q0[1].setVisibility(0);
        this.q0[1].setAlpha(1.0f);
        this.q0[1].setTranslationX(0.0f);
        this.q0[0].setBackgroundColor(z3Var == null ? 0 : this.h0.getColor());
        e0(-1, arrayList.get(arrayList.size() - 2), true);
        q3 q3Var = this.q0[0];
        q3Var.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        q3Var.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.q0[0], (Property<q3, Float>) View.TRANSLATION_X, q3Var.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(org.telegram.ui.Components.jr.h);
        animatorSet2.addListener(new z0(this));
        animatorSet2.start();
        o0 o0Var = this.d0;
        q3 q3Var2 = this.q0[0];
        o0Var.setMenuColors((q3Var2 == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false) : q3Var2.getBackgroundColor());
        o0 o0Var2 = this.d0;
        q3 q3Var3 = this.q0[0];
        o0Var2.d((q3Var3 == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false) : q3Var3.getActionBarColor(), true);
        o0 o0Var3 = this.d0;
        q3 q3Var4 = this.q0[0];
        o0Var3.setIsTonsite(q3Var4 != null && q3Var4.e());
        o0 o0Var4 = this.d0;
        q3 q3Var5 = this.q0[0];
        if (q3Var5 != null && q3Var5.d()) {
            z10 = true;
        }
        o0Var4.setIsLocal(z10);
        this.P0 = true;
    }

    public final void H(int i10) {
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        z3 z3Var = this.G;
        boolean z10 = false;
        if (size <= 1) {
            ArticleViewer$WindowView articleViewer$WindowView = this.b0;
            articleViewer$WindowView.e = false;
            articleViewer$WindowView.d = false;
            float width = z3Var != null ? z3Var.E * z3Var.c.getWidth() : this.c0.getX();
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = r9.getMeasuredWidth() - width;
            if (z3Var != null) {
                animatorSet.playTogether(z3Var.d(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.c0, (Property<n0, Float>) View.TRANSLATION_X, r9.getMeasuredWidth()), ObjectAnimator.ofFloat(this.b0, Z0, r9.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / r9.getMeasuredWidth()) * measuredWidth), MediaDataController.MAX_LINKS_COUNT));
            animatorSet.setInterpolator(org.telegram.ui.Components.jr.h);
            animatorSet.addListener(new a1(this));
            animatorSet.start();
            this.P0 = true;
            return;
        }
        this.b0.f = true;
        this.q0[1].setVisibility(0);
        this.q0[1].setAlpha(1.0f);
        this.q0[1].setTranslationX(0.0f);
        this.q0[0].setBackgroundColor(z3Var == null ? 0 : this.h0.getColor());
        e0(-1, arrayList.get(i10), true);
        q3 q3Var = this.q0[0];
        q3Var.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        q3Var.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.q0[0], (Property<q3, Float>) View.TRANSLATION_X, q3Var.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(org.telegram.ui.Components.jr.h);
        animatorSet2.addListener(new b1(this, i10));
        animatorSet2.start();
        o0 o0Var = this.d0;
        q3 q3Var2 = this.q0[0];
        o0Var.setMenuColors((q3Var2 == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false) : q3Var2.getBackgroundColor());
        o0 o0Var2 = this.d0;
        q3 q3Var3 = this.q0[0];
        o0Var2.d((q3Var3 == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false) : q3Var3.getActionBarColor(), true);
        o0 o0Var3 = this.d0;
        q3 q3Var4 = this.q0[0];
        o0Var3.setIsTonsite(q3Var4 != null && q3Var4.e());
        o0 o0Var4 = this.d0;
        q3 q3Var5 = this.q0[0];
        if (q3Var5 != null && q3Var5.d()) {
            z10 = true;
        }
        o0Var4.setIsLocal(z10);
        this.P0 = true;
    }

    public final boolean J() {
        ArrayList arrayList = this.Z;
        return arrayList.size() > 0 && (arrayList.get(0) instanceof TLRPC.WebPage);
    }

    public final void M() {
        this.R = false;
        int i10 = 0;
        while (true) {
            q3[] q3VarArr = this.q0;
            if (i10 < q3VarArr.length) {
                q3VarArr[i10].b();
                i10++;
            } else {
                try {
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
        this.H.getWindow().clearFlags(128);
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.J;
            if (i11 >= arrayList.size()) {
                this.c0.post(new d0(this, 0));
                NotificationCenter.getInstance(this.T).lambda$postNotificationNameOnUIThread$1(NotificationCenter.articleClosed, new Object[0]);
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
        boolean z10;
        int lastIndexOf;
        boolean z11;
        ?? r52;
        TL_iv.Page page;
        if (this.H == null) {
            return false;
        }
        z3 z3Var = this.G;
        if (z3Var == null && this.R) {
            return false;
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.I;
        if (o2Var != null && (o2Var.getParentLayout() instanceof ActionBarLayout)) {
            AndroidUtilities.hideKeyboard((ActionBarLayout) this.I.getParentLayout());
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
                    } catch (Exception e10) {
                        FileLog.e(e10);
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
        ArrayList arrayList = this.Z;
        if (z3Var == null || arrayList.isEmpty()) {
            z11 = z10;
            r52 = 0;
        } else {
            z11 = z10;
            r52 = 1;
        }
        if (r52 == 0) {
            arrayList.clear();
            this.c0.setTranslationX(0.0f);
            if (z3Var != null) {
                z3Var.E = 0.0f;
                z3Var.c.invalidate();
                z3Var.i();
                z3Var.h();
            }
            this.c0.setTranslationY(0.0f);
            this.q0[0].setTranslationY(0.0f);
            this.q0[0].setTranslationX(0.0f);
            this.q0[1].setTranslationX(0.0f);
            this.q0[0].setAlpha(1.0f);
            this.b0.setInnerTranslationX(0.0f);
            this.q0[0].g();
            X(AndroidUtilities.dp(56.0f));
        }
        if (z3Var != null && org.telegram.ui.web.z0.I0) {
            z3Var.a.lock();
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
                ConnectionsManager.getInstance(i13).sendRequest(tL_messages_getWebPage, new j0(this, i13, webPage2, messageObject, (boolean) r52, str5));
            }
        } else {
            g(r52, str2);
        }
        o0 o0Var = this.d0;
        if (o0Var != null && r52 == 0) {
            o0Var.setIsLocal(this.q0[0].d());
        }
        this.P = null;
        if (z3Var != null) {
            if (r52 == 0) {
                AndroidUtilities.removeFromParent(this.b0);
                z3Var.d = this.b0;
                z3Var.n();
                z3Var.c.addView(this.b0, i7.f6.c(-1.0f, -1));
            }
        } else if (this.R) {
            this.a0.flags &= -17;
            ((WindowManager) this.H.getSystemService("window")).updateViewLayout(this.b0, this.a0);
        } else {
            WindowManager windowManager = (WindowManager) this.H.getSystemService("window");
            if (this.S) {
                try {
                    windowManager.removeView(this.b0);
                } catch (Exception unused) {
                }
            }
            try {
                WindowManager.LayoutParams layoutParams = this.a0;
                layoutParams.flags = -2013200384;
                if (Build.VERSION.SDK_INT >= 28) {
                    layoutParams.layoutInDisplayCutoutMode = 1;
                }
                this.b0.setFocusable(false);
                this.c0.setFocusable(false);
                windowManager.addView(this.b0, this.a0);
            } catch (Exception e11) {
                FileLog.e(e11);
                return false;
            }
        }
        this.R = true;
        this.V = 1;
        if (r52 == 0) {
            if (z3Var == null) {
                this.b0.setAlpha(0.0f);
                this.c0.setAlpha(0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                ArticleViewer$WindowView articleViewer$WindowView = this.b0;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, (Property<ArticleViewer$WindowView, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.c0, (Property<n0, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.b0, (Property<ArticleViewer$WindowView, Float>) View.TRANSLATION_X, AndroidUtilities.dp(56.0f), 0.0f));
                this.W = new d0(this, i10);
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(this.Y);
                animatorSet.addListener(new v0(this));
                this.X = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c(8, this, animatorSet));
            } else if (r52 != 0) {
                z3Var.a.unlock();
            } else if (!z3Var.h) {
                z3Var.g(z3Var.b);
                z3Var.f();
            }
        }
        this.c0.setLayerType(2, null);
        return true;
    }

    public final void P(long j10, TLRPC.User user) {
        if (user == null || !(this.H instanceof LaunchActivity)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        bundle.putString("botUser", "webpage" + j10);
        ((LaunchActivity) this.H).q0(new tn(bundle), false, true);
        o(false, true);
    }

    public final void Q(String str, String str2, m0 m0Var) {
        Activity activity = this.H;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        q3 q3Var = this.q0[0];
        if (q3Var == null || !q3Var.d()) {
            R(str, str2, m0Var);
            return;
        }
        String string = LocaleController.getString(R.string.OpenUrlAlert2);
        int indexOf = string.indexOf("%");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.format(string, str));
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new URLSpan(str), indexOf, str.length() + indexOf, 33);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.H, 0, null);
        String string2 = LocaleController.getString(R.string.OpenUrlTitle);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.N = string2;
        c2Var.P = spannableStringBuilder;
        c2Var.b0 = false;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Open), new a1.d(this, str, str2, m0Var, 4));
        alertDialog$Builder.o();
    }

    public final void R(String str, String str2, ye.c cVar) {
        z3 z3Var;
        ye.c cVar2 = this.I0;
        if (cVar2 != null) {
            cVar2.a(false);
        }
        this.I0 = cVar;
        if (this.B0 != 0) {
            ConnectionsManager.getInstance(this.T).cancelRequest(this.B0, false);
            this.B0 = 0;
        }
        boolean[] zArr = new boolean[1];
        if (ye.d.l(this.H, str, false)) {
            if (!this.Z.isEmpty() || (z3Var = this.G) == null) {
                return;
            }
            z3Var.dismiss(false);
            return;
        }
        i0 i0Var = new i0(this, str, zArr, cVar);
        int i10 = this.D0 + 1;
        this.D0 = i10;
        b0(true);
        TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
        tL_messages_getWebPage.url = str;
        tL_messages_getWebPage.hash = 0;
        this.B0 = ConnectionsManager.getInstance(this.T).sendRequest(tL_messages_getWebPage, new org.telegram.messenger.gi(this, i10, cVar, str2, i0Var, tL_messages_getWebPage));
        if (cVar != null) {
            cVar.b = new ag.v0(this, i10, cVar, 23);
            cVar.d();
        }
    }

    public final void S() {
        TextView textView = this.x0;
        if (textView != null) {
            textView.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.i6, false), 2, -1));
            this.x0.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false));
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.w0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G8, false));
        }
        ImageView imageView = this.n0;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false), PorterDuff.Mode.MULTIPLY));
            this.n0.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.z8, false), 1, -1));
        }
        ImageView imageView2 = this.o0;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false), PorterDuff.Mode.MULTIPLY));
            this.o0.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.z8, false), 1, -1));
        }
        org.telegram.ui.Components.o6 o6Var = this.p0;
        if (o6Var != null) {
            o6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        }
        o0 o0Var = this.d0;
        if (o0Var != null) {
            q3 q3Var = this.q0[0];
            o0Var.setMenuColors((q3Var == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false) : q3Var.getBackgroundColor());
            o0 o0Var2 = this.d0;
            q3 q3Var2 = this.q0[0];
            o0Var2.d((q3Var2 == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false) : q3Var2.getActionBarColor(), true);
        }
        this.h0.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false));
    }

    public final void U() {
        int L0;
        q3 q3Var = this.q0[0];
        if (q3Var.c.A == null || (L0 = q3Var.d.L0()) == -1) {
            return;
        }
        View m10 = this.q0[0].d.m(L0);
        int top = m10 != null ? m10.getTop() : 0;
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit();
        String str = "article" + this.q0[0].c.A.id;
        SharedPreferences.Editor putInt = edit.putInt(str, L0).putInt(str + "o", top);
        String k9 = u3.c.k(str, "r");
        Point point = AndroidUtilities.displaySize;
        putInt.putBoolean(k9, point.x > point.y).commit();
    }

    public final boolean V(String str, boolean z10) {
        Integer num = 0;
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            Integer num2 = (Integer) this.q0[0].c.h.get(lowerCase);
            if (num2 != null) {
                TL_iv.textAnchor textanchor = (TL_iv.textAnchor) this.q0[0].c.r.get(lowerCase);
                if (textanchor != null) {
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    pageblockparagraph.text = org.telegram.ui.web.f2.d(textanchor.text, !TextUtils.isEmpty(this.q0[0].c.A.cached_page.url) ? this.q0[0].c.A.cached_page.url.toLowerCase() : this.q0[0].c.A.url.toLowerCase(), lowerCase);
                    this.q0[0].c.getClass();
                    int I = k4.I(pageblockparagraph);
                    f2.n1 x4 = this.q0[0].c.x(null, I);
                    View view = x4.a;
                    this.q0[0].c.H(I, x4, pageblockparagraph, 0, 0, false);
                    org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(this.H, null, false, false);
                    f3Var.fixNavigationBar();
                    f3Var.applyTopPadding = false;
                    f3Var.applyBottomPadding = false;
                    LinearLayout linearLayout = new LinearLayout(this.H);
                    linearLayout.setOrientation(1);
                    org.telegram.ui.Cells.k9 k9Var = new org.telegram.ui.Cells.k9();
                    this.L0 = k9Var;
                    k9Var.T(linearLayout);
                    this.L0.D = new lh.g2(this, 1);
                    eg.r rVar = new eg.r(this.H, 3);
                    rVar.setTextSize(1, 16.0f);
                    rVar.setTypeface(AndroidUtilities.bold());
                    rVar.setText(LocaleController.getString(R.string.InstantViewReference));
                    rVar.setGravity((this.q0[0].c.C ? 5 : 3) | 16);
                    rVar.setTextColor(b());
                    rVar.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                    linearLayout.addView(rVar, new LinearLayout.LayoutParams(-1, AndroidUtilities.dp(48.0f) + 1));
                    view.setTag("bottomSheet");
                    linearLayout.addView(view, i7.f6.k(0.0f, 7.0f, 0.0f, 0.0f, -1, -2));
                    org.telegram.ui.Cells.w9 o10 = this.L0.o(this.H);
                    bg.d1 d1Var = new bg.d1(this, this.H, linearLayout, 7);
                    f3Var.setDelegate(new k0(this, 0));
                    d1Var.addView(linearLayout, -1, -2);
                    d1Var.addView(o10, -1, -2);
                    f3Var.customView = d1Var;
                    if (this.K0.y()) {
                        this.K0.f(false);
                    }
                    this.E = f3Var;
                    a0(f3Var);
                    return true;
                }
                if (num2.intValue() >= 0 && num2.intValue() < this.q0[0].c.e.size()) {
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) this.q0[0].c.e.get(num2.intValue());
                    TL_iv.PageBlock z11 = z(pageBlock);
                    if ((z11 instanceof a4) && O((a4) z11)) {
                        this.q0[0].c.M();
                        this.q0[0].c.l();
                    }
                    int indexOf = this.q0[0].c.d.indexOf(pageBlock);
                    if (indexOf != -1) {
                        num2 = Integer.valueOf(indexOf);
                    }
                    Integer num3 = (Integer) this.q0[0].c.n.get(lowerCase);
                    if (num3 != null) {
                        if (num3.intValue() == -1) {
                            this.q0[0].c.getClass();
                            int I2 = k4.I(pageBlock);
                            f2.n1 x10 = this.q0[0].c.x(null, I2);
                            this.q0[0].c.H(I2, x10, pageBlock, 0, 0, false);
                            x10.a.measure(View.MeasureSpec.makeMeasureSpec(this.q0[0].b.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                            Integer num4 = (Integer) this.q0[0].c.n.get(lowerCase);
                            if (num4.intValue() != -1) {
                                num = num4;
                            }
                        } else {
                            num = num3;
                        }
                    }
                    if (this.q0[0].c.D) {
                        num2 = Integer.valueOf(num2.intValue() + 1);
                    }
                    if (!z10) {
                        this.q0[0].d.h1(num2.intValue(), (-AndroidUtilities.dp(56.0f)) - num.intValue());
                        return true;
                    }
                    l0 l0Var = new l0(this.q0[0].getContext());
                    l0Var.a = num2.intValue();
                    l0Var.s = (-AndroidUtilities.dp(56.0f)) - num.intValue();
                    this.q0[0].d.w0(l0Var);
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
        a4 a4Var;
        TL_iv.PageBlock pageBlock2;
        if (i10 < 0 || i10 >= this.A.size()) {
            h0();
            return;
        }
        this.C = i10;
        h0();
        v3 v3Var = (v3) this.A.get(i10);
        TL_iv.PageBlock z10 = z(v3Var.c);
        int size2 = this.q0[0].c.e.size();
        for (int i12 = 0; i12 < size2; i12++) {
            TL_iv.PageBlock pageBlock3 = (TL_iv.PageBlock) this.q0[0].c.e.get(i12);
            if ((pageBlock3 instanceof a4) && ((pageBlock2 = (a4Var = (a4) pageBlock3).b) == v3Var.c || pageBlock2 == z10)) {
                if (O(a4Var)) {
                    this.q0[0].c.M();
                    this.q0[0].c.l();
                }
                size = this.q0[0].c.d.size();
                i11 = 0;
                while (true) {
                    if (i11 < size) {
                        i11 = -1;
                        break;
                    }
                    TL_iv.PageBlock pageBlock4 = (TL_iv.PageBlock) this.q0[0].c.d.get(i11);
                    TL_iv.PageBlock pageBlock5 = v3Var.c;
                    if (pageBlock4 == pageBlock5 || pageBlock4 == z10 || ((pageBlock4 instanceof a4) && ((pageBlock = ((a4) pageBlock4).b) == pageBlock5 || pageBlock == z10))) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 != -1) {
                    return;
                }
                if ((z10 instanceof a4) && O((a4) z10)) {
                    this.q0[0].c.M();
                    this.q0[0].c.l();
                }
                String str = this.B + v3Var.c + v3Var.b + v3Var.a;
                Integer num = (Integer) this.q0[0].c.y.get(str);
                if (num == null) {
                    k4 k4Var = this.q0[0].c;
                    TL_iv.PageBlock pageBlock6 = v3Var.c;
                    k4Var.getClass();
                    int I = k4.I(pageBlock6);
                    f2.n1 x4 = this.q0[0].c.x(null, I);
                    this.q0[0].c.H(I, x4, v3Var.c, 0, 0, false);
                    x4.a.measure(View.MeasureSpec.makeMeasureSpec(this.q0[0].b.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                    num = (Integer) this.q0[0].c.y.get(str);
                    if (num == null) {
                        num = 0;
                    }
                }
                t0 t0Var = new t0(this.q0[0].getContext());
                if (this.q0[0].c.D) {
                    i11++;
                }
                t0Var.a = i11;
                t0Var.s = -(AndroidUtilities.dp(100.0f) + ((this.E0 - AndroidUtilities.dp(56.0f)) - num.intValue()));
                t0Var.t = 1.2f;
                this.q0[0].d.w0(t0Var);
                this.q0[0].b.f1();
                return;
            }
        }
        size = this.q0[0].c.d.size();
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
        o0 o0Var = this.d0;
        if (o0Var == null || o0Var.P || o0Var.S) {
            return;
        }
        int clamp = Utilities.clamp(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(24.0f));
        this.E0 = clamp;
        this.d0.setHeight(clamp);
        this.K0.x = this.E0;
        int i11 = 0;
        while (true) {
            q3[] q3VarArr = this.q0;
            if (i11 >= q3VarArr.length) {
                return;
            }
            q3VarArr[i11].b.setTopGlowOffset(this.E0);
            i11++;
        }
    }

    public final void Y(Activity activity, org.telegram.ui.ActionBar.o2 o2Var) {
        z3 z3Var;
        jf.s0 s0Var = this.Q0;
        if (s0Var != null) {
            s0Var.destroy();
            this.Q0 = null;
        }
        LaunchActivity launchActivity = LaunchActivity.C1;
        this.Q0 = launchActivity != null ? new jf.s0(launchActivity, true) : null;
        this.I = o2Var;
        int currentAccount = !(o2Var instanceof sy) ? o2Var.getCurrentAccount() : UserConfig.selectedAccount;
        this.T = currentAccount;
        NotificationCenter.getInstance(currentAccount).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getInstance(this.T).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.T).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.T).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.T).addObserver(this, NotificationCenter.emojiLoaded);
        Activity activity2 = this.H;
        if (activity2 == activity || !(activity2 == null || !this.F || (z3Var = this.G) == null || z3Var.e == null)) {
            g0(this);
            S();
            return;
        }
        this.H = activity;
        this.a = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).getInt("font_type", 0);
        r(this, false);
        this.h0 = new Paint();
        this.i0 = activity.getResources().getDrawable(R.drawable.layer_shadow);
        this.j0 = new Paint();
        ArticleViewer$WindowView articleViewer$WindowView = new ArticleViewer$WindowView(this, activity);
        this.b0 = articleViewer$WindowView;
        articleViewer$WindowView.setWillNotDraw(false);
        this.b0.setClipChildren(true);
        this.b0.setFocusable(false);
        n0 n0Var = new n0(this, activity, 0);
        this.c0 = n0Var;
        this.b0.addView(n0Var, i7.f6.e(-1, -1, 51));
        if (this.G == null) {
            this.b0.setFitsSystemWindows(true);
            this.c0.setOnApplyWindowInsetsListener(new org.telegram.ui.ActionBar.g3(1));
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        this.L = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.L.setVisibility(4);
        this.b0.addView(this.L, i7.f6.c(-1.0f, -1));
        e5.c cVar = new e5.c(activity);
        this.N = cVar;
        cVar.setVisibility(0);
        this.N.setBackgroundColor(-16777216);
        this.L.addView(this.N, i7.f6.e(-1, -1, 17));
        this.M = new TextureView(activity);
        this.q0 = new q3[2];
        int i10 = 0;
        while (true) {
            q3[] q3VarArr = this.q0;
            if (i10 >= q3VarArr.length) {
                break;
            }
            q3 q3Var = new q3(this, activity);
            q3VarArr[i10] = q3Var;
            q3Var.setVisibility(i10 == 0 ? 0 : 8);
            this.c0.addView(q3Var, i7.f6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
            q3Var.b.setOnItemLongClickListener(new v(this));
            q3Var.b.setOnItemClickListener(new kg.w(8, this, q3Var));
            i10++;
        }
        this.c0.addView(new FrameLayout(activity), i7.f6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        this.s0.setColor(-16777216);
        this.t0.setColor(-16777216);
        this.v0.setColor(-14408666);
        this.u0.setColor(-16777216);
        o0 o0Var = new o0(this, activity);
        this.d0 = o0Var;
        o0Var.a0 = this.G != null;
        this.c0.addView(o0Var, i7.f6.e(-1, -2, 48));
        this.d0.setOnClickListener(new nh.r7(10, this, activity));
        this.d0.U.addTextChangedListener(new p0(this, 0));
        org.telegram.ui.web.l lVar = new org.telegram.ui.web.l(activity);
        this.e0 = lVar;
        lVar.setOpenProgress(0.0f);
        this.e0.w.j(new m3(this, 2));
        this.c0.addView(this.e0, i7.f6.c(-1.0f, -1));
        this.f0 = new d0(this, 3);
        this.d0.H.setOnClickListener(new u(this, 2));
        this.d0.H.setOnLongClickListener(new w(this, 0));
        this.d0.setMenuListener(new ih.b1(21, this, activity));
        this.d0.K.setOnClickListener(new u(this, 3));
        bh.d dVar = new bh.d(this.H, 7);
        this.m0 = dVar;
        dVar.setOnTouchListener(new mh.d(3));
        this.m0.setWillNotDraw(false);
        this.m0.setTranslationY(AndroidUtilities.dp(51.0f));
        this.m0.setVisibility(4);
        this.m0.setFocusable(true);
        this.m0.setFocusableInTouchMode(true);
        this.m0.setClickable(true);
        this.m0.setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
        this.c0.addView(this.m0, i7.f6.e(-1, 51, 80));
        new nh.w3(this.b0, false, new t(this, 0));
        ImageView imageView = new ImageView(this.H);
        this.n0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.n0.setImageResource(R.drawable.msg_go_up);
        ImageView imageView2 = this.n0;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(w02, mode));
        ImageView imageView3 = this.n0;
        int i12 = org.telegram.ui.ActionBar.g6.z8;
        imageView3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i12, false), 1, -1));
        this.m0.addView(this.n0, i7.f6.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        this.n0.setOnClickListener(new u(this, 0));
        this.n0.setContentDescription(LocaleController.getString(R.string.AccDescrSearchNext));
        ImageView imageView4 = new ImageView(this.H);
        this.o0 = imageView4;
        imageView4.setScaleType(scaleType);
        this.o0.setImageResource(R.drawable.msg_go_down);
        this.o0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i11, false), mode));
        this.o0.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i12, false), 1, -1));
        this.m0.addView(this.o0, i7.f6.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        this.o0.setOnClickListener(new u(this, 1));
        this.o0.setContentDescription(LocaleController.getString(R.string.AccDescrSearchPrev));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(this.H, true, true, true);
        this.p0 = o6Var;
        o6Var.setScaleProperty(0.6f);
        this.p0.b(0.4f, 350L, org.telegram.ui.Components.jr.h);
        this.p0.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        this.p0.setTextSize(AndroidUtilities.dp(15.0f));
        this.p0.setTypeface(AndroidUtilities.bold());
        this.p0.setGravity(3);
        this.p0.getDrawable().G = AndroidUtilities.displaySize.x;
        this.m0.addView(this.p0, i7.f6.d(-2, -2.0f, 19, 18.0f, 0.0f, 108.0f, 0.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.a0 = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 98;
        layoutParams.softInputMode = 48;
        layoutParams.flags = 131072;
        int w03 = this.G == null ? org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, true) : org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false);
        int i13 = (AndroidUtilities.computePerceivedBrightness(w03) < 0.721f || Build.VERSION.SDK_INT < 26) ? 1792 : 1808;
        this.u0.setColor(w03);
        WindowManager.LayoutParams layoutParams2 = this.a0;
        layoutParams2.systemUiVisibility = i13;
        layoutParams2.flags |= -2147417856;
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams2.layoutInDisplayCutoutMode = 1;
        }
        org.telegram.ui.Cells.k9 k9Var = new org.telegram.ui.Cells.k9();
        this.K0 = k9Var;
        k9Var.T(this.q0[0].b);
        if (MessagesController.getInstance(this.T).getTranslateController().isContextTranslateEnabled()) {
            this.K0.l0 = new v(this);
        }
        org.telegram.ui.Cells.k9 k9Var2 = this.K0;
        k9Var2.E0 = this.q0[0].d;
        k9Var2.D = new s0(this);
        this.c0.addView(k9Var2.o(activity));
        n0 n0Var2 = this.c0;
        lu0 lu0Var = new lu0(n0Var2, n0Var2);
        this.M0 = lu0Var;
        lu0Var.F = new v(this);
        lu0Var.E = new h(this, 1);
        this.h0.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false));
        g0(this);
    }

    public final void Z(String str) {
        String str2;
        if (this.H == null) {
            return;
        }
        org.telegram.ui.ActionBar.f3 f3Var = this.E;
        if (f3Var != null) {
            f3Var.dismiss();
            this.E = null;
        }
        int i10 = 0;
        org.telegram.ui.ActionBar.f3 f3Var2 = new org.telegram.ui.ActionBar.f3(this.H, null, false, false);
        f3Var2.fixNavigationBar();
        try {
            str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e10) {
            FileLog.e(e10);
            str2 = str;
        }
        f3Var2.title = str2;
        f3Var2.bigTitle = false;
        f3Var2.multipleLinesTitle = true;
        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
        ag.y1 y1Var = new ag.y1(1, this, str);
        f3Var2.items = charSequenceArr;
        f3Var2.onClickListener = y1Var;
        f3Var2.setOnHideListener(new x(this, i10));
        a0(f3Var2);
    }

    @Override // org.telegram.ui.d70
    public final int a() {
        return org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.y6, false);
    }

    public final void a0(org.telegram.ui.ActionBar.f3 f3Var) {
        if (this.H == null) {
            return;
        }
        try {
            org.telegram.ui.ActionBar.f3 f3Var2 = this.g0;
            if (f3Var2 != null) {
                f3Var2.dismiss();
                this.g0 = null;
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        try {
            this.g0 = f3Var;
            f3Var.setCanceledOnTouchOutside(true);
            this.g0.setOnDismissListener(new x(this, 1));
            f3Var.show();
        } catch (Exception e11) {
            FileLog.e(e11);
        }
    }

    @Override // org.telegram.ui.d70
    public final int b() {
        return org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false);
    }

    public final void b0(boolean z10) {
        AndroidUtilities.cancelRunOnUIThread(this.f0);
        if (!z10) {
            this.d0.W.a(1.0f, true);
            return;
        }
        this.d0.W.a(0.0f, false);
        this.d0.W.a(0.3f, true);
        AndroidUtilities.runOnUIThread(this.f0, 100L);
    }

    @Override // org.telegram.ui.d70
    public final void c(k4 k4Var, org.telegram.ui.Components.d01 d01Var) {
        String str;
        String str2;
        org.telegram.ui.Components.z80 z80Var;
        if (d01Var == null || (str = d01Var.b) == null) {
            return;
        }
        org.telegram.ui.ActionBar.f3 f3Var = this.E;
        m0 m0Var = null;
        if (f3Var != null) {
            f3Var.dismiss();
            this.E = null;
        }
        int lastIndexOf = str.lastIndexOf(35);
        boolean z10 = false;
        if (lastIndexOf != -1) {
            String lowerCase = !TextUtils.isEmpty(k4Var.A.cached_page.url) ? k4Var.A.cached_page.url.toLowerCase() : k4Var.A.url.toLowerCase();
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
        f3 f3Var2 = this.d;
        if (f3Var2 != null && (z80Var = this.b) != null) {
            m0Var = new m0(this, f3Var2, z80Var);
        }
        Q(str, str2, m0Var);
    }

    public final void c0() {
        LaunchActivity launchActivity;
        FrameLayout frameLayout;
        if (!this.S || (launchActivity = LaunchActivity.C1) == null || launchActivity.isFinishing()) {
            return;
        }
        if (!this.q0[0].f()) {
            q3 q3Var = this.q0[0];
            TLRPC.WebPage webPage = q3Var.c.A;
            frameLayout = q3Var;
            if (webPage == null) {
                return;
            }
        } else if (this.q0[0].getWebView() == null) {
            return;
        } else {
            frameLayout = this.q0[0].f;
        }
        new org.telegram.ui.Components.tc(frameLayout, null).G(R.raw.chats_infotip, 4, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BrowserExternalRestricted), new d0(this, 10))).k(true);
    }

    @Override // org.telegram.ui.d70
    public final boolean d(TL_iv.PageBlock pageBlock, k4 k4Var) {
        int indexOf;
        List list;
        org.telegram.ui.ActionBar.o2 o2Var = this.I;
        if (o2Var != null && o2Var.getParentActivity() != null) {
            if (!(pageBlock instanceof TL_iv.pageBlockVideo) || j4.g(k4Var.A, pageBlock)) {
                ArrayList arrayList = new ArrayList(k4Var.f);
                indexOf = k4Var.f.indexOf(pageBlock);
                list = arrayList;
            } else {
                list = Collections.singletonList(pageBlock);
                indexOf = 0;
            }
            PhotoViewer t12 = PhotoViewer.t1();
            t12.K2(null, this.I, null);
            if (t12.e2(null, null, null, null, null, null, null, indexOf, new j3(this, list), null, 0L, 0L, 0L, true, new s3(this, k4Var.A, list), null)) {
                n();
                return true;
            }
        }
        return false;
    }

    public final void d0(boolean z10) {
        this.m0.setVisibility(0);
        ValueAnimator valueAnimator = this.T0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U0, z10 ? 1.0f : 0.0f);
        this.T0 = ofFloat;
        ofFloat.addUpdateListener(new s(this, 1));
        this.T0.addListener(new bg.z2(19, this, z10));
        this.T0.setDuration(320L);
        this.T0.setInterpolator(org.telegram.ui.Components.jr.h);
        this.T0.start();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        d1 d1Var;
        MessageObject messageObject;
        if (i10 == NotificationCenter.messagePlayingDidStart) {
            if (this.q0 == null) {
                return;
            }
            int i12 = 0;
            while (true) {
                q3[] q3VarArr = this.q0;
                if (i12 >= q3VarArr.length) {
                    return;
                }
                int childCount = q3VarArr[i12].b.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = this.q0[i12].b.getChildAt(i13);
                    if (childAt instanceof d1) {
                        ((d1) childAt).a(true);
                    }
                }
                i12++;
            }
        } else if (i10 == NotificationCenter.messagePlayingDidReset || i10 == NotificationCenter.messagePlayingPlayStateChanged) {
            if (this.q0 == null) {
                return;
            }
            int i14 = 0;
            while (true) {
                q3[] q3VarArr2 = this.q0;
                if (i14 >= q3VarArr2.length) {
                    return;
                }
                int childCount2 = q3VarArr2[i14].b.getChildCount();
                for (int i15 = 0; i15 < childCount2; i15++) {
                    View childAt2 = this.q0[i14].b.getChildAt(i15);
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
            if (this.q0 == null) {
                return;
            }
            int i16 = 0;
            while (true) {
                q3[] q3VarArr3 = this.q0;
                if (i16 >= q3VarArr3.length) {
                    return;
                }
                int childCount3 = q3VarArr3[i16].b.getChildCount();
                int i17 = 0;
                while (true) {
                    if (i17 < childCount3) {
                        View childAt3 = this.q0[i16].b.getChildAt(i17);
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
            if (i10 != NotificationCenter.emojiLoaded || this.q0 == null) {
                return;
            }
            int i18 = 0;
            while (true) {
                q3[] q3VarArr4 = this.q0;
                if (i18 >= q3VarArr4.length) {
                    return;
                }
                int childCount4 = q3VarArr4[i18].b.getChildCount();
                for (int i19 = 0; i19 < childCount4; i19++) {
                    View childAt4 = this.q0[i18].b.getChildAt(i19);
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

    public final void e0(int i10, Object obj, boolean z10) {
        int i11;
        int dp;
        if (obj != null) {
            if ((!(obj instanceof TLRPC.WebPage) || ((TLRPC.WebPage) obj).cached_page == null) && !(obj instanceof d3)) {
                return;
            }
            int i12 = 0;
            if (!z10 && i10 != 0) {
                q3[] q3VarArr = this.q0;
                q3 q3Var = q3VarArr[1];
                q3VarArr[1] = q3VarArr[0];
                q3VarArr[0] = q3Var;
                this.d0.i();
                this.V0.a(this.q0[0].getBackgroundColor(), true);
                this.W0.a(this.q0[1].getBackgroundColor(), true);
                z3 z3Var = this.G;
                if (z3Var != null) {
                    z3Var.m();
                }
                int indexOfChild = this.c0.indexOfChild(this.q0[0]);
                int indexOfChild2 = this.c0.indexOfChild(this.q0[1]);
                if (i10 == 1) {
                    if (indexOfChild < indexOfChild2) {
                        this.c0.removeView(this.q0[0]);
                        this.c0.addView(this.q0[0], indexOfChild2);
                    }
                } else if (indexOfChild2 < indexOfChild) {
                    this.c0.removeView(this.q0[0]);
                    this.c0.addView(this.q0[0], indexOfChild);
                }
                this.r0 = new AnimatorSet();
                this.q0[0].setVisibility(0);
                int i13 = i10 == 1 ? 0 : 1;
                this.q0[i13].setBackgroundColor(this.G == null ? 0 : this.h0.getColor());
                this.q0[i13].setLayerType(2, null);
                if (i10 == 1) {
                    this.q0[0].setTranslationX(AndroidUtilities.displaySize.x);
                    this.r0.playTogether(ObjectAnimator.ofFloat(this.q0[0], (Property<q3, Float>) View.TRANSLATION_X, AndroidUtilities.displaySize.x, 0.0f));
                } else if (i10 == -1) {
                    this.q0[0].setTranslationX(0.0f);
                    this.r0.playTogether(ObjectAnimator.ofFloat(this.q0[1], (Property<q3, Float>) View.TRANSLATION_X, 0.0f, AndroidUtilities.displaySize.x));
                }
                this.r0.setDuration(320L);
                this.r0.setInterpolator(org.telegram.ui.Components.jr.h);
                this.r0.addListener(new x0(this, i13, i12));
                this.b0.f = true;
                o0 o0Var = this.d0;
                q3 q3Var2 = this.q0[0];
                o0Var.setMenuColors((q3Var2 == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false) : q3Var2.getBackgroundColor());
                o0 o0Var2 = this.d0;
                q3 q3Var3 = this.q0[0];
                o0Var2.d((q3Var3 == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false) : q3Var3.getActionBarColor(), true);
                o0 o0Var3 = this.d0;
                q3 q3Var4 = this.q0[0];
                o0Var3.setIsTonsite(q3Var4 != null && q3Var4.e());
                o0 o0Var4 = this.d0;
                q3 q3Var5 = this.q0[0];
                o0Var4.setIsLocal(q3Var5 != null && q3Var5.d());
                AnimatorSet animatorSet = this.r0;
                Objects.requireNonNull(animatorSet);
                AndroidUtilities.runOnUIThread(new it0(animatorSet, 4));
            }
            if (!z10) {
                this.K0.f(true);
            }
            k4 k4Var = this.q0[z10 ? 1 : 0].c;
            if (z10) {
                obj = j7.l1.i(2, this.Z);
            }
            this.q0[z10 ? 1 : 0].b();
            if (obj instanceof TLRPC.WebPage) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj;
                this.q0[z10 ? 1 : 0].setWeb(null);
                this.q0[z10 ? 1 : 0].setType(0);
                TL_iv.Page page = webPage.cached_page;
                k4Var.C = page.rtl;
                k4Var.A = webPage;
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
                                    k4Var.B = (TL_iv.pageBlockChannel) pageBlock2;
                                }
                            }
                        }
                    } else {
                        i11 = (i11 == 1 && k4Var.B != null) ? i11 + 1 : 0;
                    }
                    k4Var.F(k4Var, pageBlock, 0, 0, i11 == size + (-1) ? i11 : 0);
                }
                k4Var.l();
                if (this.Z.size() == 1 || i10 == -1) {
                    SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0);
                    String str = "article" + webPage.id;
                    int i14 = sharedPreferences.getInt(str, -1);
                    boolean z11 = sharedPreferences.getBoolean(str + "r", true);
                    Point point = AndroidUtilities.displaySize;
                    if (z11 == (point.x <= point.y ? 0 : 1)) {
                        dp = sharedPreferences.getInt(str + "o", 0) - this.q0[z10 ? 1 : 0].b.getPaddingTop();
                    } else {
                        dp = AndroidUtilities.dp(10.0f);
                    }
                    if (i14 != -1) {
                        this.q0[z10 ? 1 : 0].d.h1(i14, dp);
                    }
                } else {
                    f2.j0 j0Var = this.q0[z10 ? 1 : 0].d;
                    z3 z3Var2 = this.G;
                    j0Var.h1(z3Var2 == null ? 0 : 1, z3Var2 != null ? AndroidUtilities.dp(32.0f) : 0);
                }
            } else if (obj instanceof d3) {
                this.q0[z10 ? 1 : 0].setType(1);
                this.q0[z10 ? 1 : 0].g();
                this.q0[z10 ? 1 : 0].setWeb((d3) obj);
            }
            if (!z10) {
                m(null);
            }
            i0(false);
            f0();
        }
    }

    public final void f0() {
        q3[] q3VarArr;
        q3 q3Var;
        if (this.d0 == null || (q3Var = (q3VarArr = this.q0)[0]) == null || q3VarArr[1] == null) {
            return;
        }
        float translationX = q3Var.getVisibility() != 0 ? 0.0f : 1.0f - (this.q0[0].getTranslationX() / this.q0[0].getWidth());
        float f9 = 1.0f - translationX;
        o0 o0Var = this.d0;
        o0Var.d[0] = this.q0[0].getProgress();
        o0Var.invalidate();
        o0 o0Var2 = this.d0;
        o0Var2.d[1] = this.q0[1].getProgress();
        o0Var2.invalidate();
        this.d0.setTransitionProgress(f9);
        o0 o0Var3 = this.d0;
        if (!o0Var3.S && !o0Var3.P) {
            ArticleViewer$WindowView articleViewer$WindowView = this.b0;
            if (articleViewer$WindowView.e || articleViewer$WindowView.f) {
                boolean J = J();
                ArrayList arrayList = this.Z;
                if (J || arrayList.size() > 1) {
                    float lerp = AndroidUtilities.lerp((this.q0[0].s || arrayList.size() > 1) ? 1.0f : 0.0f, (this.q0[1].s || arrayList.size() > 2) ? 1.0f : 0.0f, f9);
                    this.d0.I.c(1.0f - lerp, false);
                    this.d0.L.f();
                    this.d0.setBackButtonCached(lerp > 0.5f);
                } else {
                    this.d0.L.f();
                    this.d0.setBackButtonCached(false);
                }
                this.d0.setHasForward(this.q0[0].v);
                this.d0.setIsLocal(this.q0[0].d());
                this.d0.setIsLoaded(this.q0[0].getWebView() != null && this.q0[0].getWebView().b);
            }
        }
        o0 o0Var4 = this.d0;
        int actionBarColor = this.q0[0].getActionBarColor();
        ArticleViewer$WindowView articleViewer$WindowView2 = this.b0;
        o0Var4.b(0, this.V0.a(actionBarColor, articleViewer$WindowView2.e || articleViewer$WindowView2.f));
        o0 o0Var5 = this.d0;
        int actionBarColor2 = this.q0[1].getActionBarColor();
        ArticleViewer$WindowView articleViewer$WindowView3 = this.b0;
        o0Var5.b(1, this.W0.a(actionBarColor2, articleViewer$WindowView3.e || articleViewer$WindowView3.f));
        this.d0.d(i0.a.d(f9, this.q0[0].getActionBarColor(), this.q0[1].getActionBarColor()), false);
        this.d0.setMenuType((translationX > 0.5f ? this.q0[0] : this.q0[1]).a);
        z3 z3Var = this.G;
        if (z3Var != null) {
            z3Var.c.invalidate();
            return;
        }
        ArticleViewer$WindowView articleViewer$WindowView4 = this.b0;
        if (articleViewer$WindowView4 != null) {
            articleViewer$WindowView4.invalidate();
        }
    }

    public final void g(int i10, String str) {
        U();
        d3 d3Var = new d3();
        d3Var.v = str;
        this.Z.add(d3Var);
        this.d0.h(false);
        e0(i10, d3Var, false);
    }

    public final boolean h(TLRPC.WebPage webPage, String str, int i10) {
        U();
        this.Z.add(webPage);
        this.d0.h(false);
        e0(i10, webPage, false);
        return V(str, false);
    }

    public final void h0() {
        int i10;
        int size;
        if (this.A != null || this.q0[0].f()) {
            if (this.q0[0].f()) {
                i10 = this.q0[0].getWebView() == null ? 0 : this.q0[0].getWebView().getSearchIndex();
                size = this.q0[0].getWebView() == null ? 0 : this.q0[0].getWebView().getSearchCount();
            } else {
                i10 = this.C;
                size = this.A.size();
            }
            this.n0.setEnabled(size > 0 && i10 != 0);
            this.o0.setEnabled(size > 0 && i10 != size + (-1));
            ImageView imageView = this.n0;
            imageView.setAlpha(imageView.isEnabled() ? 1.0f : 0.5f);
            ImageView imageView2 = this.o0;
            imageView2.setAlpha(imageView2.isEnabled() ? 1.0f : 0.5f);
            this.p0.a();
            if (size < 0) {
                this.p0.setText("");
                return;
            }
            if (size == 0) {
                this.p0.setText(LocaleController.getString(R.string.NoResult));
            } else if (size == 1) {
                this.p0.setText(LocaleController.getString(R.string.OneResult));
            } else {
                this.p0.setText(String.format(LocaleController.getPluralString("CountOfResults", size), Integer.valueOf(i10 + 1), Integer.valueOf(size)));
            }
        }
    }

    public final void i0(boolean z10) {
        boolean z11 = false;
        this.d0.g(0, this.q0[0].getTitle(), z10);
        this.d0.f(0, this.q0[0].getSubtitle());
        this.d0.e(0, this.q0[0].f() && this.q0[0].getWebView() != null && this.q0[0].getWebView().A);
        this.d0.g(1, this.q0[1].getTitle(), z10);
        this.d0.f(1, this.q0[1].getSubtitle());
        o0 o0Var = this.d0;
        if (this.q0[1].f() && this.q0[1].getWebView() != null && this.q0[1].getWebView().A) {
            z11 = true;
        }
        o0Var.e(1, z11);
    }

    public final void k() {
        this.F0 = false;
        e3 e3Var = this.G0;
        if (e3Var != null) {
            this.b0.removeCallbacks(e3Var);
            this.G0 = null;
        }
        e3 e3Var2 = this.H0;
        if (e3Var2 != null) {
            this.b0.removeCallbacks(e3Var2);
            this.H0 = null;
        }
    }

    public final void m(org.telegram.messenger.b6 b6Var) {
        if (this.E0 == AndroidUtilities.dp(56.0f)) {
            if (b6Var != null) {
                b6Var.run();
                return;
            }
            return;
        }
        int i10 = 0;
        ValueAnimator duration = ValueAnimator.ofObject(new IntEvaluator(), Integer.valueOf(this.E0), Integer.valueOf(AndroidUtilities.dp(56.0f))).setDuration(180L);
        duration.setInterpolator(new DecelerateInterpolator());
        duration.addUpdateListener(new s(this, i10));
        duration.addListener(new u0(i10, b6Var));
        if (b6Var != null) {
            duration.setDuration(duration.getDuration() / 2);
        }
        duration.start();
    }

    public final void n() {
        b3 b3Var;
        nh.v vVar = this.q0[0].b;
        if (vVar == null || !this.S) {
            return;
        }
        float measuredHeight = vVar.getMeasuredHeight() / 2.0f;
        float f9 = 0.0f;
        b3 b3Var2 = null;
        for (int i10 = 0; i10 < vVar.getChildCount(); i10++) {
            View childAt = vVar.getChildAt(i10);
            if (childAt instanceof b3) {
                float measuredHeight2 = (childAt.getMeasuredHeight() / 2.0f) + childAt.getTop();
                if (b3Var2 == null || Math.abs(measuredHeight - measuredHeight2) < Math.abs(measuredHeight - f9)) {
                    b3Var2 = (b3) childAt;
                    f9 = measuredHeight2;
                }
            }
        }
        boolean z10 = PhotoViewer.t1().f;
        if (z10 || ((b3Var = this.x) != null && b3Var != b3Var2 && this.w != null)) {
            VideoPlayerHolderBase videoPlayerHolderBase = this.w;
            if (videoPlayerHolderBase != null) {
                b3 b3Var3 = this.x;
                long j10 = b3Var3.H.video_id;
                c3 a2 = c3.a(videoPlayerHolderBase, b3Var3);
                b3Var3.c(a2);
                this.y.k(a2, j10);
                b3 b3Var4 = this.x;
                c3 c3Var = b3Var4.I;
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
        if (z10 || b3Var2 == null) {
            return;
        }
        d70 d70Var = b3Var2.a;
        if (b3Var2.K != null && d70Var.w == null) {
            d70Var.w = new a3(b3Var2).with(b3Var2.n);
            TLRPC.Document document = b3Var2.K;
            for (int i11 = 0; i11 < document.attributes.size(); i11++) {
                if (document.attributes.get(i11) instanceof TLRPC.TL_documentAttributeVideo) {
                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i11);
                    b3Var2.h.a(tL_documentAttributeVideo.w / tL_documentAttributeVideo.h, 0);
                }
            }
            TLRPC.WebPage webPage = b3Var2.b.A;
            Uri prepareUri = webPage != null ? FileStreamLoadOperation.prepareUri(((m4) d70Var).T, document, webPage) : null;
            if (prepareUri != null) {
                VideoPlayerHolderBase videoPlayerHolderBase2 = d70Var.w;
                c3 c3Var2 = b3Var2.I;
                videoPlayerHolderBase2.seekTo(c3Var2 == null ? 0L : c3Var2.a);
                d70Var.w.preparePlayer(prepareUri, true, 1.0f);
                d70Var.w.play();
            }
        }
        this.x = b3Var2;
    }

    public final void o(boolean z10, boolean z11) {
        if (this.H == null || this.P0 || !this.R) {
            return;
        }
        int i10 = 0;
        if (this.V != 0 && Math.abs(this.X - System.currentTimeMillis()) >= 500) {
            Runnable runnable = this.W;
            if (runnable != null) {
                runnable.run();
                this.W = null;
            }
            this.V = 0;
        }
        if (this.V != 0) {
            return;
        }
        z3 z3Var = this.G;
        if (z3Var != null) {
            z3Var.dismiss(false);
            return;
        }
        if (this.L.getVisibility() == 0) {
            if (this.K != null) {
                this.L.setVisibility(4);
                this.O.onCustomViewHidden();
                this.L.removeView(this.K);
                this.K = null;
            } else {
                org.telegram.ui.Components.s81 s81Var = this.A0;
                if (s81Var != null && s81Var.P) {
                    s81Var.P = false;
                    s81Var.m();
                    s81Var.l(false);
                }
            }
            if (!z11) {
                return;
            }
        }
        if (this.K0.y()) {
            this.K0.f(false);
            return;
        }
        o0 o0Var = this.d0;
        if (o0Var.P) {
            o0Var.h(false);
            return;
        }
        if (o0Var.S) {
            o0Var.k(false);
            return;
        }
        if (this.B0 != 0) {
            ConnectionsManager.getInstance(this.T).cancelRequest(this.B0, true);
            this.B0 = 0;
            b0(false);
        }
        if (this.C0 != 0) {
            ConnectionsManager.getInstance(this.T).cancelRequest(this.C0, true);
            this.C0 = 0;
            b0(false);
        }
        U();
        if (z10 && !z11) {
            ArrayList arrayList = this.Z;
            if (arrayList.size() >= 2) {
                Object j10 = com.google.android.recaptcha.internal.a.j(1, arrayList);
                if (j10 instanceof d3) {
                    ((d3) j10).a();
                }
                if (j10 instanceof TLRPC.WebPage) {
                    org.telegram.ui.web.f2.o((TLRPC.WebPage) j10);
                }
                e0(-1, arrayList.get(arrayList.size() - 1), false);
                return;
            }
        }
        NotificationCenter.getInstance(this.T).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getInstance(this.T).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.T).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.T).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.T).removeObserver(this, NotificationCenter.emojiLoaded);
        jf.s0 s0Var = this.Q0;
        if (s0Var != null) {
            s0Var.destroy();
            this.Q0 = null;
        }
        this.I = null;
        try {
            org.telegram.ui.ActionBar.f3 f3Var = this.g0;
            if (f3Var != null) {
                f3Var.dismiss();
                this.g0 = null;
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArticleViewer$WindowView articleViewer$WindowView = this.b0;
        Property property = View.ALPHA;
        animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, (Property<ArticleViewer$WindowView, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.c0, (Property<n0, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.b0, (Property<ArticleViewer$WindowView, Float>) View.TRANSLATION_X, 0.0f, AndroidUtilities.dp(56.0f)));
        this.V = 2;
        this.W = new d0(this, 7);
        animatorSet.setDuration(150L);
        animatorSet.setInterpolator(this.Y);
        animatorSet.addListener(new nh.q5(this, 5));
        this.X = System.currentTimeMillis();
        this.c0.setLayerType(2, null);
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
            ArrayList arrayList = this.Z;
            if (i10 >= arrayList.size()) {
                arrayList.clear();
                t();
                return;
            }
            Object obj = arrayList.get(i10);
            if (obj instanceof d3) {
                q3 q3Var = this.q0[0];
                if (q3Var != null && q3Var.F == obj) {
                    ((d3) obj).c(q3Var);
                }
                q3 q3Var2 = this.q0[1];
                if (q3Var2 != null && q3Var2.F == obj) {
                    ((d3) obj).c(q3Var2);
                }
                ((d3) obj).a();
            } else if (obj instanceof TLRPC.WebPage) {
                org.telegram.ui.web.f2.o((TLRPC.WebPage) obj);
            }
            i10++;
        }
    }

    public final void t() {
        ArticleViewer$WindowView articleViewer$WindowView;
        if (this.H == null || (articleViewer$WindowView = this.b0) == null) {
            return;
        }
        if (this.G == null) {
            try {
                if (articleViewer$WindowView.getParent() != null) {
                    ((WindowManager) this.H.getSystemService("window")).removeViewImmediate(this.b0);
                }
                this.b0 = null;
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        for (int i10 = 0; i10 < this.J.size(); i10++) {
            ((w1) this.J.get(i10)).a(true);
        }
        this.J.clear();
        try {
            this.H.getWindow().clearFlags(128);
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        this.H = null;
        this.I = null;
        Y0 = null;
    }

    public m4(org.telegram.ui.ActionBar.o2 o2Var) {
        this.J = new ArrayList();
        this.U = 1;
        this.Y = new DecelerateInterpolator(1.5f);
        this.Z = new ArrayList();
        this.s0 = new Paint();
        this.t0 = new Paint();
        this.u0 = new Paint();
        this.v0 = new Paint();
        this.F0 = false;
        this.G0 = null;
        this.H0 = null;
        this.N0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats});
        this.O0 = new n0[2];
        this.S0 = -1;
        d0 d0Var = new d0(this, 2);
        org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.h;
        this.V0 = new org.telegram.ui.Components.f5(d0Var, 320L, jrVar);
        this.W0 = new org.telegram.ui.Components.f5(new d0(this, 4), 320L, jrVar);
        this.F = true;
        this.G = new z3(this, o2Var);
        Y(o2Var.getParentActivity(), o2Var);
    }
}
