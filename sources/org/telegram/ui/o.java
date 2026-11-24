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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class o extends ui5 implements jm7 {
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
    public tvc F0;
    public tvc G0;
    public int H0;
    public int I0;
    public int J0;
    public final boolean K;
    public int K0;
    public final sx L;
    public boolean L0;
    public Activity M;
    public ax M0;
    public org.telegram.ui.ActionBar.d N;
    public ax N0;
    public final ArrayList O;
    public vu O0;
    public View P;
    public int P0;
    public FrameLayout Q;
    public gkb Q0;
    public TextureView R;
    public gkb R0;
    public jy S;
    public pc8 S0;
    public WebChromeClient.CustomViewCallback T;
    public final po T0;
    public WindowInsets U;
    public final yd[] U0;
    public boolean V;
    public boolean V0;
    public boolean W;
    public a26 W0;
    public boolean X;
    public wc7 X0;
    public int Y;
    public int Y0;
    public int Z;
    public ValueAnimator Z0;
    public byte a0;
    public float a1;
    public Runnable b0;
    public final km b1;
    public long c0;
    public final km c1;
    public final DecelerateInterpolator d0;
    public final ArrayList e0;
    public WindowManager.LayoutParams f0;
    public ArticleViewer$WindowView g0;
    public a h0;
    public wu i0;
    public eb j0;
    public ut k0;
    public my0 l0;
    public Paint m0;
    public Drawable n0;
    public Paint o0;
    public boolean p0;
    public float q0;
    public a6 r0;
    public ImageView s0;
    public ImageView t0;
    public io u0;
    public m[] v0;
    public AnimatorSet w0;
    public final Paint x0;
    public final Paint y0;
    public final Paint z0;
    public static final HashSet d1 = new HashSet();
    public static volatile o e1 = null;
    public static final b f1 = new b("innerTranslationX", (byte) 0);
    public static final TextPaint g1 = new TextPaint(1);
    public static final nx h1 = new nx();
    public static final WeakHashMap C1 = new WeakHashMap();

    public o(org.telegram.ui.ActionBar.d dVar) {
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
        this.T0 = new po(new int[]{nm7.r, nm7.s});
        this.U0 = new yd[2];
        this.Y0 = -1;
        ut utVar = new ut(this, (byte) 2);
        d53 d53Var = d53.h;
        this.b1 = new km(utVar, 320L, d53Var);
        this.c1 = new km(new ut(this, (byte) 3), 320L, d53Var);
        this.K = true;
        this.L = new sx(this, dVar);
        W(dVar.getParentActivity(), dVar);
    }

    public static int A(TL_iv.RichText richText) {
        if (richText instanceof TL_iv.textFixed) {
            return A(richText.parentRichText) | 4;
        }
        if (richText instanceof TL_iv.textItalic) {
            return A(richText.parentRichText) | 2;
        }
        if (richText instanceof TL_iv.textBold) {
            return A(richText.parentRichText) | 1;
        }
        if (richText instanceof TL_iv.textUnderline) {
            return A(richText.parentRichText) | 16;
        }
        if (richText instanceof TL_iv.textStrike) {
            return A(richText.parentRichText) | 32;
        }
        if (richText instanceof TL_iv.textEmail) {
            return A(richText.parentRichText) | 8;
        }
        if (richText instanceof TL_iv.textPhone) {
            return A(richText.parentRichText) | 8;
        }
        if (richText instanceof TL_iv.textUrl) {
            long j = ((TL_iv.textUrl) richText).webpage_id;
            TL_iv.RichText richText2 = richText.parentRichText;
            return j != 0 ? A(richText2) | 512 : A(richText2) | 8;
        }
        if (richText instanceof TL_iv.textSubscript) {
            return A(richText.parentRichText) | 128;
        }
        if (richText instanceof TL_iv.textSuperscript) {
            return A(richText.parentRichText) | 256;
        }
        if (richText instanceof TL_iv.textMarked) {
            return A(richText.parentRichText) | 64;
        }
        if (richText != null) {
            return A(richText.parentRichText);
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x038a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TextPaint B(ui5 ui5Var, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock) {
        int i;
        int i2;
        int w0;
        SparseArray sparseArray;
        int L;
        int w02;
        int L2;
        int L3;
        int L4;
        int L5;
        int i3;
        int L6;
        int i4;
        int L7;
        int A = A(richText2);
        int L8 = gm.L(14.0f);
        ((o) ui5Var).getClass();
        nx nxVar = h1;
        nxVar.getClass();
        SparseArray sparseArray2 = nxVar.x;
        SparseArray sparseArray3 = nxVar.w;
        SparseArray sparseArray4 = nxVar.t;
        SparseArray sparseArray5 = nxVar.c;
        SparseArray sparseArray6 = nxVar.b;
        int L9 = gm.L(gda.V0 - 16);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            TL_iv.RichText richText3 = ((TL_iv.pageBlockPhoto) pageBlock).caption.text;
            if (richText3 == richText2 || richText3 == richText) {
                L7 = gm.L(14.0f);
                sparseArray5 = sparseArray6;
            } else {
                L7 = gm.L(12.0f);
            }
            L8 = L7;
            w0 = cmb.w0(null, cmb.x6, false);
        } else if (pageBlock instanceof TL_iv.pageBlockMap) {
            TL_iv.RichText richText4 = ((TL_iv.pageBlockMap) pageBlock).caption.text;
            if (richText4 == richText2 || richText4 == richText) {
                L6 = gm.L(14.0f);
                sparseArray5 = sparseArray6;
            } else {
                L6 = gm.L(12.0f);
            }
            L8 = L6;
            w0 = cmb.w0(null, cmb.x6, false);
        } else {
            if (pageBlock instanceof TL_iv.pageBlockTitle) {
                sparseArray = nxVar.d;
                L8 = gm.L(23.0f);
                i2 = cmb.w0(null, cmb.F6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockKicker) {
                sparseArray = nxVar.e;
                L8 = gm.L(14.0f);
                i2 = cmb.w0(null, cmb.F6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockAuthorDate) {
                sparseArray = nxVar.o;
                L8 = gm.L(14.0f);
                i2 = cmb.w0(null, cmb.x6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockFooter) {
                sparseArray = nxVar.p;
                L8 = gm.L(14.0f);
                i2 = cmb.w0(null, cmb.x6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockSubtitle) {
                sparseArray = nxVar.g;
                L8 = gm.L(20.0f);
                i2 = cmb.w0(null, cmb.F6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
                sparseArray = nxVar.f;
                L8 = gm.L(20.0f);
                i2 = cmb.w0(null, cmb.F6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
                sparseArray = nxVar.h;
                L8 = gm.L(17.0f);
                i2 = cmb.w0(null, cmb.F6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockHeading1) {
                sparseArray = nxVar.i;
                L8 = gm.L(18.0f);
                i2 = cmb.w0(null, cmb.F6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockHeading2) {
                sparseArray = nxVar.j;
                L8 = gm.L(16.0f);
                i2 = cmb.w0(null, cmb.F6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockHeading3) {
                sparseArray = nxVar.k;
                L8 = gm.L(15.0f);
                i2 = cmb.w0(null, cmb.F6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockHeading4) {
                sparseArray = nxVar.l;
                L8 = gm.L(14.0f);
                i2 = cmb.w0(null, cmb.F6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockHeading5) {
                sparseArray = nxVar.m;
                L8 = gm.L(13.0f);
                i2 = cmb.w0(null, cmb.F6, false);
            } else {
                if (!(pageBlock instanceof TL_iv.pageBlockHeading6)) {
                    if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
                        if (pageblockblockquote.text == richText) {
                            L8 = gm.L(15.0f);
                            i3 = cmb.w0(null, cmb.F6, false);
                        } else if (pageblockblockquote.caption == richText) {
                            L8 = gm.L(14.0f);
                            i3 = cmb.w0(null, cmb.x6, false);
                            sparseArray4 = sparseArray6;
                        } else {
                            sparseArray4 = null;
                            i3 = -65536;
                        }
                        i2 = i3;
                        sparseArray5 = sparseArray4;
                        i = 0;
                    } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                        TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
                        if (pageblockpullquote.text == richText) {
                            L8 = gm.L(15.0f);
                            i3 = cmb.w0(null, cmb.F6, false);
                        } else if (pageblockpullquote.caption == richText) {
                            L8 = gm.L(14.0f);
                            i3 = cmb.w0(null, cmb.x6, false);
                            sparseArray4 = sparseArray6;
                        } else {
                            i3 = -65536;
                            sparseArray4 = null;
                        }
                        i2 = i3;
                        sparseArray5 = sparseArray4;
                        i = 0;
                    } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
                        int i5 = pageblockpreformatted.codeLength;
                        if (i5 < 0) {
                            i5 = al6.o(pageblockpreformatted.text).length();
                            pageblockpreformatted.codeLength = i5;
                        }
                        int i6 = i5 > 500 ? 3 : i5 > 220 ? 2 : i5 > 80 ? 1 : 0;
                        SparseArray sparseArray7 = nxVar.s;
                        L8 = gm.L(14 - i6);
                        A |= 4;
                        i = i6 << 16;
                        sparseArray5 = sparseArray7;
                        i2 = cmb.w0(null, cmb.F6, false);
                    } else if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                        sparseArray = nxVar.q;
                        L8 = gm.L(16.0f);
                        i2 = cmb.w0(null, cmb.F6, false);
                    } else if (I(pageBlock)) {
                        sparseArray = nxVar.r;
                        L8 = gm.L(16.0f);
                        i2 = cmb.w0(null, cmb.F6, false);
                    } else if (pageBlock instanceof TL_iv.pageBlockEmbed) {
                        TL_iv.RichText richText5 = ((TL_iv.pageBlockEmbed) pageBlock).caption.text;
                        if (richText5 == richText2 || richText5 == richText) {
                            L5 = gm.L(14.0f);
                            sparseArray5 = sparseArray6;
                        } else {
                            L5 = gm.L(12.0f);
                        }
                        L8 = L5;
                        w0 = cmb.w0(null, cmb.x6, false);
                    } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                        TL_iv.RichText richText6 = ((TL_iv.pageBlockSlideshow) pageBlock).caption.text;
                        if (richText6 == richText2 || richText6 == richText) {
                            L4 = gm.L(14.0f);
                            sparseArray5 = sparseArray6;
                        } else {
                            L4 = gm.L(12.0f);
                        }
                        L8 = L4;
                        w0 = cmb.w0(null, cmb.x6, false);
                    } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
                        TL_iv.RichText richText7 = ((TL_iv.pageBlockCollage) pageBlock).caption.text;
                        if (richText7 == richText2 || richText7 == richText) {
                            L3 = gm.L(14.0f);
                            sparseArray5 = sparseArray6;
                        } else {
                            L3 = gm.L(12.0f);
                        }
                        L8 = L3;
                        w0 = cmb.w0(null, cmb.x6, false);
                    } else if (pageBlock instanceof TL_iv.pageBlockEmbedPost) {
                        TL_iv.PageCaption pageCaption = ((TL_iv.pageBlockEmbedPost) pageBlock).caption;
                        if (richText2 == pageCaption.text) {
                            L8 = gm.L(14.0f);
                            w0 = cmb.w0(null, cmb.x6, false);
                            sparseArray5 = sparseArray6;
                        } else if (richText2 == pageCaption.credit) {
                            L8 = gm.L(12.0f);
                            w0 = cmb.w0(null, cmb.x6, false);
                        } else if (richText2 != null) {
                            sparseArray5 = nxVar.u;
                            L8 = gm.L(14.0f);
                            w0 = cmb.w0(null, cmb.F6, false);
                        } else {
                            w0 = -65536;
                            sparseArray5 = null;
                        }
                    } else {
                        if (pageBlock instanceof TL_iv.pageBlockVideo) {
                            if (richText2 == ((TL_iv.pageBlockVideo) pageBlock).caption.text) {
                                L2 = gm.L(14.0f);
                                sparseArray2 = sparseArray3;
                            } else {
                                L2 = gm.L(12.0f);
                            }
                            L8 = L2;
                            w02 = cmb.w0(null, cmb.F6, false);
                        } else if (pageBlock instanceof TL_iv.pageBlockAudio) {
                            if (richText2 == ((TL_iv.pageBlockAudio) pageBlock).caption.text) {
                                L = gm.L(14.0f);
                                sparseArray2 = sparseArray3;
                            } else {
                                L = gm.L(12.0f);
                            }
                            L8 = L;
                            w02 = cmb.w0(null, cmb.F6, false);
                        } else if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                            sparseArray = nxVar.y;
                            L8 = gm.L(15.0f);
                            i2 = cmb.w0(null, cmb.x6, false);
                        } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                            sparseArray = nxVar.z;
                            L8 = gm.L(15.0f);
                            i2 = cmb.w0(null, cmb.F6, false);
                        } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                            sparseArray5 = nxVar.A;
                            L8 = gm.L(15.0f);
                            w0 = cmb.w0(null, cmb.F6, false);
                        } else {
                            i = 0;
                            i2 = -65536;
                            sparseArray5 = null;
                        }
                        i2 = w02;
                        sparseArray5 = sparseArray2;
                        i = 0;
                    }
                    i4 = A & 256;
                    if (i4 == 0 || (A & 128) != 0) {
                        L8 -= gm.L(4.0f);
                    }
                    if (sparseArray5 == null) {
                        if (nxVar.a == null) {
                            TextPaint textPaint = new TextPaint(1);
                            nxVar.a = textPaint;
                            textPaint.setColor(-65536);
                        }
                        nxVar.a.setTextSize(gm.L(14.0f));
                        return nxVar.a;
                    }
                    int i7 = i | A;
                    TextPaint textPaint2 = (TextPaint) sparseArray5.get(i7);
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint(1);
                        if ((A & 4) != 0) {
                            textPaint2.setTypeface(gm.n1("fonts/rmono.ttf"));
                        } else if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                            textPaint2.setTypeface(gm.o());
                        } else if (ui5Var.a == 1 || (pageBlock instanceof TL_iv.pageBlockTitle) || (pageBlock instanceof TL_iv.pageBlockKicker) || (pageBlock instanceof TL_iv.pageBlockHeader) || (pageBlock instanceof TL_iv.pageBlockSubtitle) || (pageBlock instanceof TL_iv.pageBlockSubheader) || H(pageBlock)) {
                            if ((pageBlock instanceof TL_iv.pageBlockTitle) || (pageBlock instanceof TL_iv.pageBlockHeader) || (pageBlock instanceof TL_iv.pageBlockSubtitle) || (pageBlock instanceof TL_iv.pageBlockSubheader) || H(pageBlock)) {
                                textPaint2.setTypeface(gm.n1("fonts/mw_bold.ttf"));
                            } else if ((A & 1) != 0) {
                                if ((A & 2) != 0) {
                                    textPaint2.setTypeface(Typeface.create("serif", 3));
                                } else {
                                    textPaint2.setTypeface(Typeface.create("serif", 1));
                                }
                            } else if ((A & 2) != 0) {
                                textPaint2.setTypeface(Typeface.create("serif", 2));
                            } else {
                                textPaint2.setTypeface(Typeface.create("serif", 0));
                            }
                        } else if ((A & 1) != 0) {
                            if ((A & 2) != 0) {
                                textPaint2.setTypeface(gm.n1("fonts/rmediumitalic.ttf"));
                            } else {
                                textPaint2.setTypeface(gm.n1("fonts/rmedium.ttf"));
                            }
                        } else if ((A & 2) != 0) {
                            textPaint2.setTypeface(gm.n1("fonts/ritalic.ttf"));
                        }
                        if ((A & 32) != 0) {
                            textPaint2.setFlags(textPaint2.getFlags() | 16);
                        }
                        if ((A & 16) != 0) {
                            textPaint2.setFlags(textPaint2.getFlags() | 8);
                        }
                        if ((A & 8) != 0 || (A & 512) != 0) {
                            textPaint2.setFlags(textPaint2.getFlags());
                            i2 = cmb.w0(null, cmb.I6, false);
                        }
                        if (i4 != 0) {
                            textPaint2.baselineShift -= gm.L(6.0f);
                        } else if ((A & 128) != 0) {
                            textPaint2.baselineShift = gm.L(2.0f) + textPaint2.baselineShift;
                        }
                        textPaint2.setColor(i2);
                        sparseArray5.put(i7, textPaint2);
                    }
                    textPaint2.setTextSize(L8 + L9);
                    return textPaint2;
                }
                sparseArray = nxVar.n;
                L8 = gm.L(12.0f);
                i2 = cmb.w0(null, cmb.F6, false);
            }
            sparseArray5 = sparseArray;
            i = 0;
            i4 = A & 256;
            if (i4 == 0) {
            }
            L8 -= gm.L(4.0f);
            if (sparseArray5 == null) {
            }
        }
        i2 = w0;
        i = 0;
        i4 = A & 256;
        if (i4 == 0) {
        }
        L8 -= gm.L(4.0f);
        if (sparseArray5 == null) {
        }
    }

    public static String C(TL_iv.RichText richText) {
        if (richText instanceof TL_iv.textFixed) {
            return C(((TL_iv.textFixed) richText).text);
        }
        if (richText instanceof TL_iv.textItalic) {
            return C(((TL_iv.textItalic) richText).text);
        }
        if (richText instanceof TL_iv.textBold) {
            return C(((TL_iv.textBold) richText).text);
        }
        if (richText instanceof TL_iv.textUnderline) {
            return C(((TL_iv.textUnderline) richText).text);
        }
        if (richText instanceof TL_iv.textStrike) {
            return C(((TL_iv.textStrike) richText).text);
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

    public static boolean F() {
        return e1 != null;
    }

    public static boolean H(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
    }

    public static boolean I(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof vx) || (pageBlock instanceof xx);
    }

    public static /* synthetic */ WindowInsets J(WindowInsets windowInsets) {
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public static boolean M(tx txVar) {
        boolean z;
        TL_iv.PageBlock w = w(txVar.a);
        if (w instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) w;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                return true;
            }
        } else if (w instanceof tx) {
            tx txVar2 = (tx) w;
            TL_iv.PageBlock w2 = w(txVar2.b);
            if (w2 instanceof TL_iv.pageBlockDetails) {
                TL_iv.pageBlockDetails pageblockdetails2 = (TL_iv.pageBlockDetails) w2;
                if (!pageblockdetails2.open) {
                    pageblockdetails2.open = true;
                    z = true;
                    if (!M(txVar2) || z) {
                        return true;
                    }
                }
            }
            z = false;
            if (!M(txVar2)) {
            }
            return true;
        }
        return false;
    }

    public static void R(ui5 ui5Var) {
        if (ui5Var.b == null && ui5Var.f == null) {
            return;
        }
        View view = ui5Var.f;
        ui5Var.c.e(true);
        ui5Var.b = null;
        ui5Var.d = null;
        ui5Var.f = null;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void c(String str, int i, FrameLayout frameLayout, sx sxVar, ylb ylbVar) {
        String r = qw0.r(str);
        long e = z8c.h(i).e();
        a6a.B(i).q0(y5a.a(e, r));
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_message.peer_id = tL_peerUser;
        tL_peerUser.user_id = e;
        TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
        tL_message.from_id = tL_peerUser2;
        tL_peerUser2.user_id = e;
        tL_message.message = r;
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
        tL_message.media = tL_messageMediaWebPage;
        tL_messageMediaWebPage.webpage = new TLRPC.TL_webPage();
        TLRPC.WebPage webPage = tL_message.media.webpage;
        webPage.url = r;
        webPage.display_url = r;
        nm7.f(i).k(nm7.H1, new k47(i, tL_message, false, false));
        new c41(frameLayout, ylbVar).Q(R.raw.saved_messages, 36, gm.N2(jb6.M0(2131742603, null), -1, 0, new fu((Object) sxVar, e, (byte) 0), null)).k(true);
    }

    public static void e0(ui5 ui5Var) {
        TextPaint textPaint = o1;
        if (textPaint != null) {
            textPaint.setColor(cmb.w0(null, cmb.F6, false));
        }
        TextPaint textPaint2 = p1;
        if (textPaint2 != null) {
            textPaint2.setColor(cmb.w0(null, cmb.F6, false));
        }
        TextPaint textPaint3 = i1;
        if (textPaint3 != null) {
            textPaint3.setColor(cmb.w0(null, cmb.F6, false));
        }
        TextPaint textPaint4 = k1;
        if (textPaint4 != null) {
            textPaint4.setColor(cmb.w0(null, cmb.F6, false));
        }
        TextPaint textPaint5 = l1;
        if (textPaint5 != null) {
            textPaint5.setColor(-1);
        }
        TextPaint textPaint6 = m1;
        if (textPaint6 != null) {
            textPaint6.setColor(cmb.w0(null, cmb.F6, false));
        }
        TextPaint textPaint7 = n1;
        if (textPaint7 != null) {
            textPaint7.setColor(cmb.w0(null, cmb.x6, false));
        }
        TextPaint textPaint8 = j1;
        if (textPaint8 != null) {
            textPaint8.setColor(cmb.w0(null, cmb.x6, false));
        }
        o(ui5Var, true);
        nx nxVar = h1;
        nx.a(ui5Var, nxVar.d);
        nx.a(ui5Var, nxVar.e);
        nx.a(ui5Var, nxVar.g);
        nx.a(ui5Var, nxVar.f);
        nx.a(ui5Var, nxVar.h);
        nx.a(ui5Var, nxVar.i);
        nx.a(ui5Var, nxVar.j);
        nx.a(ui5Var, nxVar.k);
        nx.a(ui5Var, nxVar.l);
        nx.a(ui5Var, nxVar.m);
        nx.a(ui5Var, nxVar.n);
        nx.a(ui5Var, nxVar.t);
        nx.a(ui5Var, nxVar.s);
        nx.a(ui5Var, nxVar.q);
        nx.a(ui5Var, nxVar.r);
        nx.a(ui5Var, nxVar.u);
        nx.a(ui5Var, nxVar.w);
        nx.a(ui5Var, nxVar.x);
        nx.a(ui5Var, nxVar.b);
        nx.a(ui5Var, nxVar.c);
        nx.a(ui5Var, nxVar.o);
        nx.a(ui5Var, nxVar.p);
        nx.a(ui5Var, nxVar.v);
        nx.a(ui5Var, nxVar.y);
        nx.a(ui5Var, nxVar.z);
        nx.a(ui5Var, nxVar.A);
    }

    public static SpannableStringBuilder f(int i, CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (charSequence != null) {
            spannableStringBuilder.append(charSequence);
        }
        if (spannableStringBuilder.length() > 0) {
            spannableStringBuilder.append((CharSequence) ", ");
        }
        spannableStringBuilder.append((CharSequence) jb6.M0(i, null));
        return spannableStringBuilder;
    }

    public static CharSequence g(ui5 ui5Var, ey eyVar, bx bxVar) {
        StaticLayout staticLayout;
        if (bxVar == null || (staticLayout = bxVar.d) == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = bxVar.E;
        if (spannableStringBuilder != null) {
            return spannableStringBuilder;
        }
        CharSequence text = staticLayout.getText();
        if (!(text instanceof Spannable)) {
            return text;
        }
        Spannable spannable = (Spannable) text;
        vjb[] vjbVarArr = (vjb[]) spannable.getSpans(0, spannable.length(), vjb.class);
        CharSequence charSequence = text;
        if (vjbVarArr != null) {
            charSequence = text;
            if (vjbVarArr.length != 0) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannable);
                for (vjb vjbVar : vjbVarArr) {
                    int spanStart = spannableStringBuilder2.getSpanStart(vjbVar);
                    int spanEnd = spannableStringBuilder2.getSpanEnd(vjbVar);
                    if (spanStart >= 0 && spanEnd > spanStart) {
                        spannableStringBuilder2.setSpan(new tl(ui5Var, eyVar, vjbVar, (byte) 1), spanStart, spanEnd, 33);
                    }
                }
                bxVar.E = spannableStringBuilder2;
                charSequence = spannableStringBuilder2;
            }
        }
        return charSequence;
    }

    public static TL_iv.PageBlock h0(TL_iv.PageBlock pageBlock, tx txVar) {
        if (pageBlock instanceof vx) {
            vx vxVar = (vx) pageBlock;
            vx vxVar2 = new vx();
            vxVar2.a = vxVar.a;
            vxVar2.b = vxVar.b;
            vxVar2.c = vxVar.c;
            vxVar2.d = h0(vxVar.d, txVar);
            return vxVar2;
        }
        if (!(pageBlock instanceof xx)) {
            return txVar;
        }
        xx xxVar = (xx) pageBlock;
        xx xxVar2 = new xx();
        xxVar2.a = xxVar.a;
        xxVar2.b = xxVar.b;
        xxVar2.c = xxVar.c;
        xxVar2.d = h0(xxVar.d, txVar);
        return xxVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x0248, code lost:
    
        if (r0.isShowing() == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x017a, code lost:
    
        r17 = new android.graphics.Path();
        r0 = r29.J;
        r5 = r0.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0186, code lost:
    
        if (r7 >= r5) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0188, code lost:
    
        r8 = r0.get(r7);
        r7 = r7 + 1;
        r8 = ((rna) r8).getBounds();
        r17.addRect(r8.left, r8.top, r8.right, r8.bottom, android.graphics.Path.Direction.CW);
        r17 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b2, code lost:
    
        r17.computeBounds(new android.graphics.RectF(), false);
        r0 = (float) java.lang.Math.sqrt((r0.height() * r0.height()) + (r0.width() * r0.width()));
        ((rna) r29.J.get(0)).q = new mu(r28, r29);
        r3 = r29.J;
        r5 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ed, code lost:
    
        if (r7 >= r5) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01ef, code lost:
    
        r8 = r3.get(r7);
        r7 = r7 + 1;
        ((rna) r8).j(r6, r4, r0, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01fd, code lost:
    
        r28.invalidate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0204, code lost:
    
        if (r28.getParent() == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0206, code lost:
    
        r28.getParent().requestDisallowInterceptTouchEvent(true);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0258  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean i(ui5 ui5Var, ey eyVar, MotionEvent motionEvent, View view, bx bxVar, int i, int i2) {
        gkb gkbVar;
        o oVar;
        Object obj;
        o oVar2;
        byte b;
        gkb gkbVar2;
        xkb[] xkbVarArr;
        boolean z = ((o) ui5Var).w0 == null;
        i66 i66Var = ui5Var.c;
        if (!z || view == null) {
            return false;
        }
        o oVar3 = (o) ui5Var;
        if (view.getTag() == null || view.getTag() != "bottomSheet" || (gkbVar = oVar3.R0) == null) {
            gkbVar = oVar3.Q0;
        }
        if (gkbVar != null && !gkbVar.e0(view)) {
            return false;
        }
        ui5Var.f = view;
        if (bxVar != null) {
            StaticLayout staticLayout = bxVar.d;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                int lineCount = staticLayout.getLineCount();
                float f = 2.1474836E9f;
                float f2 = 0.0f;
                for (int i3 = 0; i3 < lineCount; i3++) {
                    f2 = Math.max(staticLayout.getLineWidth(i3), f2);
                    f = Math.min(staticLayout.getLineLeft(i3), f);
                }
                float f3 = x;
                float f4 = i + f;
                if (f3 >= f4 && f3 <= f4 + f2 && y >= i2 && y <= staticLayout.getHeight() + i2) {
                    ui5Var.d = bxVar;
                    ui5Var.e = i2;
                    if (staticLayout.getText() instanceof Spannable) {
                        int i4 = x - i;
                        int i5 = y - i2;
                        try {
                            int lineForVertical = staticLayout.getLineForVertical(i5);
                            float f5 = i4;
                            int offsetForHorizontal = staticLayout.getOffsetForHorizontal(lineForVertical, f5);
                            float lineLeft = staticLayout.getLineLeft(lineForVertical);
                            if (lineLeft <= f5 && lineLeft + staticLayout.getLineWidth(lineForVertical) >= f5) {
                                Spannable spannable = (Spannable) staticLayout.getText();
                                vjb[] vjbVarArr = (vjb[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, vjb.class);
                                if (vjbVarArr == null || vjbVarArr.length <= 0) {
                                    oVar = oVar3;
                                    obj = "bottomSheet";
                                } else {
                                    vjb vjbVar = vjbVarArr[0];
                                    int spanStart = spannable.getSpanStart(vjbVar);
                                    oVar = oVar3;
                                    obj = "bottomSheet";
                                    int spanEnd = spannable.getSpanEnd(vjbVar);
                                    int i6 = 1;
                                    while (i6 < vjbVarArr.length) {
                                        try {
                                            vjb vjbVar2 = vjbVarArr[i6];
                                            vjb[] vjbVarArr2 = vjbVarArr;
                                            int spanStart2 = spannable.getSpanStart(vjbVar2);
                                            int i7 = i6;
                                            int spanEnd2 = spannable.getSpanEnd(vjbVar2);
                                            if (spanStart > spanStart2 || spanEnd2 > spanEnd) {
                                                spanStart = spanStart2;
                                                vjbVar = vjbVar2;
                                                spanEnd = spanEnd2;
                                            }
                                            i6 = i7 + 1;
                                            vjbVarArr = vjbVarArr2;
                                        } catch (Exception e) {
                                            e = e;
                                            fc4.g(e, true);
                                            if (motionEvent.getAction() == 0) {
                                            }
                                            b = 1;
                                            if (motionEvent.getAction() != 0) {
                                            }
                                            if (view instanceof ov) {
                                            }
                                        }
                                    }
                                    m66 m66Var = ui5Var.b;
                                    if (m66Var != null) {
                                        if (m66Var.i != vjbVar) {
                                            i66Var.l(m66Var, true);
                                        }
                                    }
                                    m66 m66Var2 = new m66(vjbVar, null, f3, y, 0);
                                    ui5Var.b = m66Var2;
                                    m66Var2.d(cmb.w0(null, cmb.J6, false) & 872415231);
                                    i66Var.a(ui5Var.b, ui5Var.d);
                                    try {
                                        b66 b2 = ui5Var.b.b();
                                        b2.d(staticLayout, spanStart, 0.0f);
                                        TextPaint textPaint = vjbVar.a;
                                        int i8 = textPaint != null ? textPaint.baselineShift : 0;
                                        b2.o = i8 != 0 ? i8 + gm.L(i8 > 0 ? 5.0f : -2.0f) : 0;
                                        staticLayout.getSelectionPath(spanStart, spanEnd, b2);
                                        view.invalidate();
                                    } catch (Exception e2) {
                                        fc4.g(e2, true);
                                    }
                                }
                                ArrayList arrayList = bxVar.J;
                                if (arrayList != null && !arrayList.isEmpty() && (xkbVarArr = (xkb[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, xkb.class)) != null) {
                                    int i9 = 0;
                                    while (true) {
                                        if (i9 >= xkbVarArr.length) {
                                            break;
                                        }
                                        if (xkbVarArr[i9].b()) {
                                            break;
                                        }
                                        i9++;
                                    }
                                }
                            }
                        } catch (Exception e3) {
                            e = e3;
                            oVar = oVar3;
                            obj = "bottomSheet";
                        }
                    }
                }
            } else {
                oVar = oVar3;
                obj = "bottomSheet";
                if (motionEvent.getAction() == 1) {
                    m66 m66Var3 = ui5Var.b;
                    if (m66Var3 != null) {
                        ui5Var.a(eyVar, (vjb) m66Var3.i);
                        R(ui5Var);
                    }
                } else if (motionEvent.getAction() == 3) {
                    m8 m8Var = ui5Var.I;
                    if (m8Var != null) {
                    }
                    R(ui5Var);
                }
            }
            if (motionEvent.getAction() == 0) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                oVar2 = oVar;
                if (!oVar2.L0) {
                    b = 1;
                    oVar2.L0 = true;
                    if (oVar2.N0 == null) {
                        oVar2.N0 = new ax(oVar2, b);
                    }
                    if (view.getTag() == null || view.getTag() != obj || (gkbVar2 = oVar2.R0) == null) {
                        oVar2.Q0.j0(view, (int) x2, (int) y2);
                    } else {
                        gkbVar2.j0(view, (int) x2, (int) y2);
                    }
                    oVar2.g0.postDelayed(oVar2.N0, ViewConfiguration.getTapTimeout());
                    if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                        oVar2.h();
                    }
                    if (view instanceof ov) {
                        if (ui5Var.d != null) {
                            return b;
                        }
                        return false;
                    }
                    if (ui5Var.b != null) {
                        return b;
                    }
                    return false;
                }
            } else {
                oVar2 = oVar;
            }
            b = 1;
            if (motionEvent.getAction() != 0) {
                oVar2.h();
            }
            if (view instanceof ov) {
            }
        }
        oVar = oVar3;
        obj = "bottomSheet";
        if (motionEvent.getAction() == 0) {
        }
        b = 1;
        if (motionEvent.getAction() != 0) {
        }
        if (view instanceof ov) {
        }
    }

    public static bx m(ui5 ui5Var, View view, CharSequence charSequence, TL_iv.RichText richText, int i, int i2, TL_iv.PageBlock pageBlock, ey eyVar) {
        return n(ui5Var, view, charSequence, richText, i, i2, pageBlock, Layout.Alignment.ALIGN_NORMAL, 0, eyVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:51|(3:52|53|(3:57|(3:(2:61|62)(2:64|65)|63|58)|66))|68|(2:69|70)|(11:74|75|76|(5:79|(1:81)(1:91)|(3:(1:84)(1:88)|85|86)(2:89|90)|87|77)|92|93|94|95|(7:99|100|101|(5:104|(1:106)(1:116)|(3:(1:109)(1:113)|110|111)(2:114|115)|112|102)|117|118|119)|152|119)|157|94|95|(8:97|99|100|101|(1:102)|117|118|119)|152|119) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x039a A[Catch: Exception -> 0x03d0, TryCatch #0 {Exception -> 0x03d0, blocks: (B:101:0x0394, B:102:0x0397, B:104:0x039a, B:106:0x03af, B:110:0x03bc, B:112:0x03c4, B:118:0x03cc), top: B:100:0x0394 }] */
    /* JADX WARN: Type inference failed for: r10v13, types: [android.text.Spanned, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v7, types: [android.graphics.Path, b66] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.text.Layout, android.text.StaticLayout] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r9v11, types: [android.graphics.Path, b66] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static bx n(ui5 ui5Var, View view, CharSequence charSequence, TL_iv.RichText richText, int i, int i2, TL_iv.PageBlock pageBlock, Layout.Alignment alignment, int i3, ey eyVar) {
        ui5 ui5Var2;
        CharSequence z;
        TL_iv.RichText richText2;
        TL_iv.PageBlock pageBlock2;
        TextPaint B;
        ?? r4;
        int i4;
        CharSequence charSequence2;
        StaticLayout staticLayout;
        ?? r12;
        b66 b66Var;
        b66 b66Var2;
        View view2;
        TL_iv.RichText richText3;
        TL_iv.PageBlock pageBlock3;
        int i5;
        int i6;
        ?? r13;
        ?? r9;
        tjb[] tjbVarArr;
        int i7;
        yjb[] yjbVarArr;
        ey eyVar2;
        if (charSequence != null || (richText != null && !(richText instanceof TL_iv.textEmpty))) {
            int L = i < 0 ? gm.L(10.0f) : i;
            if (charSequence != null) {
                ui5Var2 = ui5Var;
                richText2 = richText;
                z = charSequence;
                pageBlock2 = pageBlock;
            } else {
                ui5Var2 = ui5Var;
                z = z(ui5Var2, eyVar != null ? eyVar.F : null, view, richText, richText, pageBlock, L);
                richText2 = richText;
                pageBlock2 = pageBlock;
            }
            if (!TextUtils.isEmpty(z)) {
                int L2 = gm.L(gda.V0 - 16);
                if ((pageBlock2 instanceof TL_iv.pageBlockEmbedPost) && richText2 == null) {
                    if (((TL_iv.pageBlockEmbedPost) pageBlock2).author == charSequence) {
                        if (i1 == null) {
                            TextPaint textPaint = new TextPaint(1);
                            i1 = textPaint;
                            ((o) ui5Var2).getClass();
                            textPaint.setColor(cmb.w0(null, cmb.F6, false));
                        }
                        i1.setTextSize(gm.L(15.0f) + L2);
                        B = i1;
                    } else {
                        if (j1 == null) {
                            TextPaint textPaint2 = new TextPaint(1);
                            j1 = textPaint2;
                            ((o) ui5Var2).getClass();
                            textPaint2.setColor(cmb.w0(null, cmb.x6, false));
                        }
                        j1.setTextSize(gm.L(14.0f) + L2);
                        B = j1;
                    }
                } else if (pageBlock2 instanceof TL_iv.pageBlockChannel) {
                    if (k1 == null) {
                        TextPaint textPaint3 = new TextPaint(1);
                        k1 = textPaint3;
                        TextPaint k = mlb.k(textPaint3, 1);
                        l1 = k;
                        k.setTypeface(gm.o());
                    }
                    TextPaint textPaint4 = k1;
                    ((o) ui5Var2).getClass();
                    textPaint4.setColor(cmb.w0(null, cmb.F6, false));
                    k1.setTextSize(gm.L(15.0f));
                    l1.setColor(-1);
                    l1.setTextSize(gm.L(15.0f));
                    B = (eyVar == null || eyVar.G == null) ? k1 : l1;
                } else if (pageBlock2 instanceof zx) {
                    zx zxVar = (zx) pageBlock2;
                    if (charSequence == zxVar.a.articles.get(zxVar.b).title) {
                        if (m1 == null) {
                            TextPaint textPaint5 = new TextPaint(1);
                            m1 = textPaint5;
                            textPaint5.setTypeface(gm.o());
                        }
                        TextPaint textPaint6 = m1;
                        ((o) ui5Var2).getClass();
                        textPaint6.setColor(cmb.w0(null, cmb.F6, false));
                        m1.setTextSize(gm.L(15.0f) + L2);
                        B = m1;
                    } else {
                        TextPaint textPaint7 = n1;
                        if (textPaint7 == null) {
                            textPaint7 = new TextPaint(1);
                            n1 = textPaint7;
                        }
                        ((o) ui5Var2).getClass();
                        textPaint7.setColor(cmb.w0(null, cmb.x6, false));
                        n1.setTextSize(gm.L(14.0f) + L2);
                        B = n1;
                    }
                } else if (!I(pageBlock2) || charSequence == null) {
                    B = B(ui5Var2, richText2, richText2, pageBlock2);
                } else {
                    if (o1 == null) {
                        TextPaint textPaint8 = new TextPaint(1);
                        o1 = textPaint8;
                        ((o) ui5Var2).getClass();
                        textPaint8.setColor(cmb.w0(null, cmb.F6, false));
                    }
                    if (p1 == null) {
                        TextPaint textPaint9 = new TextPaint(1);
                        p1 = textPaint9;
                        ((o) ui5Var2).getClass();
                        textPaint9.setColor(cmb.w0(null, cmb.F6, false));
                    }
                    o1.setTextSize(gm.L(19.0f) + L2);
                    p1.setTextSize(gm.L(16.0f) + L2);
                    B = (!(pageBlock2 instanceof vx) || ((vx) pageBlock2).c.a.ordered) ? p1 : o1;
                }
                CharSequence m = gw3.m(z, B.getFontMetricsInt(), false, null, 2);
                if (i3 == 0) {
                    TextPaint textPaint10 = B;
                    r4 = 0;
                    i4 = 1;
                    if (m.charAt(m.length() - 1) == '\n') {
                        m = m.subSequence(0, m.length() - 1);
                    }
                    if (pageBlock2 instanceof TL_iv.pageBlockPullquote) {
                        charSequence2 = m;
                        staticLayout = new StaticLayout(charSequence2, textPaint10, L, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    } else {
                        charSequence2 = m;
                        staticLayout = new StaticLayout(charSequence2, textPaint10, L, alignment, 1.0f, gm.L(4.0f), false);
                    }
                    r12 = staticLayout;
                    m = charSequence2;
                } else if (pageBlock2 instanceof TL_iv.pageBlockPullquote) {
                    i4 = 1;
                    TextPaint textPaint11 = B;
                    r4 = 0;
                    r12 = oya.c(m, textPaint11, L, Layout.Alignment.ALIGN_CENTER, 0.0f, TextUtils.TruncateAt.END, L, i3, true);
                } else {
                    TextPaint textPaint12 = B;
                    r4 = 0;
                    i4 = 1;
                    r12 = oya.c(m, textPaint12, L, alignment, gm.L(4.0f), TextUtils.TruncateAt.END, L, i3, true);
                }
                if (r12 != 0) {
                    CharSequence text = r12.getText();
                    if (i2 >= 0 && !ui5Var2.F.isEmpty() && ui5Var2.G != null && (eyVar2 = ((o) ui5Var2).v0[r4].c) != null) {
                        String lowerCase = m.toString().toLowerCase();
                        int i8 = r4;
                        while (true) {
                            int indexOf = lowerCase.indexOf(ui5Var2.G, i8);
                            if (indexOf < 0) {
                                break;
                            }
                            int length = ui5Var2.G.length() + indexOf;
                            if (indexOf == 0 || gm.I1(lowerCase.charAt(indexOf - 1))) {
                                eyVar2.E.put(ui5Var2.G + pageBlock2 + richText2 + indexOf, Integer.valueOf(r12.getLineTop(r12.getLineForOffset(indexOf)) + i2));
                            }
                            i8 = length;
                        }
                    }
                    boolean z2 = text instanceof Spanned;
                    if (z2) {
                        ?? r10 = (Spanned) text;
                        try {
                            vk[] vkVarArr = (vk[]) r10.getSpans(r4, r10.length(), vk.class);
                            int lineCount = r12.getLineCount();
                            if (vkVarArr != null && vkVarArr.length > 0) {
                                for (int i9 = r4; i9 < vkVarArr.length; i9++) {
                                    if (lineCount <= i4) {
                                        eyVar.n.put(vkVarArr[i9].a, Integer.valueOf(i2));
                                    } else {
                                        HashMap hashMap = eyVar.n;
                                        vk vkVar = vkVarArr[i9];
                                        hashMap.put(vkVar.a, Integer.valueOf(i2 + r12.getLineTop(r12.getLineForOffset(r10.getSpanStart(vkVar)))));
                                    }
                                }
                            }
                        } catch (Exception unused) {
                        }
                        try {
                            yjbVarArr = (yjb[]) r10.getSpans(r4, r10.length(), yjb.class);
                        } catch (Exception unused2) {
                        }
                        if (yjbVarArr != null && yjbVarArr.length > 0) {
                            r13 = new b66(r4);
                            try {
                                r13.n = r4;
                                for (int i10 = r4; i10 < yjbVarArr.length; i10++) {
                                    int spanStart = r10.getSpanStart(yjbVarArr[i10]);
                                    int spanEnd = r10.getSpanEnd(yjbVarArr[i10]);
                                    r13.d(r12, spanStart, 0.0f);
                                    TextPaint textPaint13 = yjbVarArr[i10].a;
                                    int i11 = textPaint13 != null ? textPaint13.baselineShift : r4;
                                    r13.o = i11 != 0 ? i11 + gm.L(i11 > 0 ? 5.0f : -2.0f) : r4;
                                    r12.getSelectionPath(spanStart, spanEnd, r13);
                                }
                                r13.n = i4;
                            } catch (Exception unused3) {
                            }
                            tjbVarArr = (tjb[]) r10.getSpans(r4, r10.length(), tjb.class);
                            if (tjbVarArr != null && tjbVarArr.length > 0) {
                                r9 = new b66(r4);
                                try {
                                    r9.n = r4;
                                    for (i7 = r4; i7 < tjbVarArr.length; i7++) {
                                        int spanStart2 = r10.getSpanStart(tjbVarArr[i7]);
                                        int spanEnd2 = r10.getSpanEnd(tjbVarArr[i7]);
                                        r9.d(r12, spanStart2, 0.0f);
                                        TextPaint textPaint14 = tjbVarArr[i7].a;
                                        int i12 = textPaint14 != null ? textPaint14.baselineShift : 0;
                                        r9.o = i12 != 0 ? i12 + gm.L(i12 > 0 ? 5.0f : -2.0f) : 0;
                                        r12.getSelectionPath(spanStart2, spanEnd2, r9);
                                    }
                                    r9.n = i4;
                                } catch (Exception unused4) {
                                }
                                b66Var = r9;
                                b66Var2 = r13;
                            }
                            r9 = 0;
                            b66Var = r9;
                            b66Var2 = r13;
                        }
                        r13 = 0;
                        tjbVarArr = (tjb[]) r10.getSpans(r4, r10.length(), tjb.class);
                        if (tjbVarArr != null) {
                            r9 = new b66(r4);
                            r9.n = r4;
                            while (i7 < tjbVarArr.length) {
                            }
                            r9.n = i4;
                            b66Var = r9;
                            b66Var2 = r13;
                        }
                        r9 = 0;
                        b66Var = r9;
                        b66Var2 = r13;
                    } else {
                        b66Var = null;
                        b66Var2 = null;
                    }
                    bx bxVar = new bx(ui5Var2);
                    bxVar.d = r12;
                    bxVar.e = b66Var2;
                    bxVar.f = b66Var;
                    bxVar.n = pageBlock2;
                    bxVar.r = richText2;
                    bxVar.K = new Stack();
                    bxVar.J = new ArrayList();
                    bxVar.L = new AtomicReference();
                    if (z2) {
                        richText3 = richText;
                        pageBlock3 = pageBlock;
                        i5 = i4;
                        i6 = 0;
                        view2 = view;
                        rna.a(view2, r12, -1, -1, (Spanned) text, bxVar.K, bxVar.J, null);
                    } else {
                        view2 = view;
                        richText3 = richText2;
                        pageBlock3 = pageBlock2;
                        i5 = i4;
                        i6 = 0;
                    }
                    if (view2 != null) {
                        WeakHashMap weakHashMap = C1;
                        ArrayList arrayList = (ArrayList) weakHashMap.get(view2);
                        if (arrayList != null) {
                            int i13 = i6;
                            while (i13 < arrayList.size()) {
                                bx bxVar2 = (bx) arrayList.get(i13);
                                if (bxVar2.n != pageBlock3 || (richText3 != null && bxVar2.r == richText3)) {
                                    bxVar2.f(view2);
                                    arrayList.remove(i13);
                                    i13--;
                                }
                                i13 += i5;
                            }
                        }
                        if (richText3 != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                weakHashMap.put(view2, arrayList);
                            }
                            arrayList.add(bxVar);
                        }
                        if (view2.isAttachedToWindow()) {
                            bxVar.i(view2);
                        }
                    }
                    return bxVar;
                }
            }
        }
        return null;
    }

    public static void o(ui5 ui5Var, boolean z) {
        if (s1 == null) {
            s1 = new Paint();
            r1 = new Paint();
            Paint paint = new Paint(1);
            u1 = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            u1.setStrokeWidth(gm.L(1.0f));
            Paint paint2 = new Paint();
            v1 = paint2;
            paint2.setStyle(style);
            v1.setStrokeWidth(gm.L(1.0f) / 2.0f);
            w1 = new Paint();
            x1 = new Paint();
            y1 = new Paint();
            z1 = new Paint(1);
            A1 = new Paint(1);
            q1 = new Paint();
            t1 = new Paint();
            B1 = new Paint(1);
        } else if (!z) {
            return;
        }
        int w0 = cmb.w0(null, cmb.c6, false);
        A1.setColor(b10.y((float) Color.blue(w0), 0.0722f, (((float) Color.green(w0)) * 0.7152f) + (((float) Color.red(w0)) * 0.2126f), 255.0f) <= 0.705f ? -3041234 : -6551);
        Paint paint3 = z1;
        int i = cmb.J6;
        paint3.setColor(cmb.w0(null, i, false) & 872415231);
        z1.setPathEffect(b66.c());
        y1.setColor(cmb.w0(null, i, false) & 872415231);
        y1.setPathEffect(b66.c());
        Paint paint4 = v1;
        int i2 = cmb.j6;
        paint4.setColor(cmb.w0(null, i2, false));
        u1.setColor(cmb.w0(null, i2, false));
        q1.setColor(251658240);
        t1.setColor(cmb.w0(null, cmb.c7, false));
        B1.setColor(cmb.w0(null, i, false) & 872415231);
        B1.setPathEffect(b66.c());
        int w02 = cmb.w0(null, cmb.L6, false);
        int red = Color.red(w02);
        int green = Color.green(w02);
        int blue = Color.blue(w02);
        x1.setColor(Color.argb(20, red, green, blue));
        w1.setColor(Color.argb(34, red, green, blue));
        int w03 = cmb.w0(null, i, false);
        r1.setColor(Color.argb(20, Color.red(w03), Color.green(w03), Color.blue(w03)));
        s1.setColor(cmb.w0(null, cmb.Kd, false));
    }

    public static void r(Canvas canvas, ui5 ui5Var, TL_iv.PageBlock pageBlock, int i) {
        if (pageBlock == null || ui5Var == null || s1 == null) {
            return;
        }
        int i2 = 0;
        int L = i - (pageBlock.bottom ? gm.L(6.0f) : 0);
        int i3 = pageBlock.quoteLevels;
        if (i3 == 0) {
            if (pageBlock.level > 0) {
                canvas.drawRect(gm.L(18.0f), 0.0f, gm.L(2.0f) + r0, L, s1);
                return;
            }
            return;
        }
        while (i3 != 0) {
            if ((i3 & 1) != 0) {
                canvas.drawRect(gm.L((i2 * 14) + 18), 0.0f, gm.L(2.0f) + r0, L, s1);
            }
            i3 >>>= 1;
            i2++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r0 != null) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void s(ui5 ui5Var, Canvas canvas, fkb fkbVar, int i) {
        gkb gkbVar;
        View view = (View) fkbVar;
        o oVar = (o) ui5Var;
        if (view != null) {
            oVar.getClass();
            if (view.getTag() != null) {
                if (view.getTag() == "bottomSheet") {
                    gkbVar = oVar.R0;
                }
            }
        }
        gkbVar = oVar.Q0;
        if (gkbVar != null) {
            gkbVar.Y(canvas, fkbVar, i);
        }
    }

    public static TL_iv.RichText t(int i, TL_iv.PageBlock pageBlock) {
        if (i == 2) {
            TL_iv.RichText t = t(0, pageBlock);
            if (t instanceof TL_iv.textEmpty) {
                t = null;
            }
            TL_iv.RichText t2 = t(1, pageBlock);
            if (t2 instanceof TL_iv.textEmpty) {
                t2 = null;
            }
            if (t != null) {
                if (t2 == null) {
                    return t;
                }
                TL_iv.textPlain textplain = new TL_iv.textPlain();
                textplain.text = " ";
                TL_iv.textConcat textconcat = new TL_iv.textConcat();
                textconcat.texts.add(t);
                textconcat.texts.add(textplain);
                textconcat.texts.add(t2);
                return textconcat;
            }
            if (t2 != null) {
                return t2;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockEmbedPost) {
            TL_iv.pageBlockEmbedPost pageblockembedpost = (TL_iv.pageBlockEmbedPost) pageBlock;
            if (i == 0) {
                return pageblockembedpost.caption.text;
            }
            if (i == 1) {
                return pageblockembedpost.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
            if (i == 0) {
                return pageblockslideshow.caption.text;
            }
            if (i == 1) {
                return pageblockslideshow.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
            if (i == 0) {
                return pageblockphoto.caption.text;
            }
            if (i == 1) {
                return pageblockphoto.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
            TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
            if (i == 0) {
                return pageblockcollage.caption.text;
            }
            if (i == 1) {
                return pageblockcollage.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockEmbed) {
            TL_iv.pageBlockEmbed pageblockembed = (TL_iv.pageBlockEmbed) pageBlock;
            if (i == 0) {
                return pageblockembed.caption.text;
            }
            if (i == 1) {
                return pageblockembed.caption.credit;
            }
        } else {
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                return ((TL_iv.pageBlockBlockquote) pageBlock).caption;
            }
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
                if (i == 0) {
                    return pageblockvideo.caption.text;
                }
                if (i == 1) {
                    return pageblockvideo.caption.credit;
                }
            } else {
                if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                    return ((TL_iv.pageBlockPullquote) pageBlock).caption;
                }
                if (pageBlock instanceof TL_iv.pageBlockAudio) {
                    TL_iv.pageBlockAudio pageblockaudio = (TL_iv.pageBlockAudio) pageBlock;
                    if (i == 0) {
                        return pageblockaudio.caption.text;
                    }
                    if (i == 1) {
                        return pageblockaudio.caption.credit;
                    }
                } else {
                    if (pageBlock instanceof TL_iv.pageBlockCover) {
                        return t(i, ((TL_iv.pageBlockCover) pageBlock).cover);
                    }
                    if (pageBlock instanceof TL_iv.pageBlockMap) {
                        TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
                        if (i == 0) {
                            return pageblockmap.caption.text;
                        }
                        if (i == 1) {
                            return pageblockmap.caption.credit;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static o u() {
        o oVar;
        o oVar2 = e1;
        if (oVar2 != null) {
            return oVar2;
        }
        synchronized (o.class) {
            oVar = e1;
            if (oVar == null) {
                oVar = new o();
                e1 = oVar;
            }
        }
        return oVar;
    }

    public static View v(View view) {
        b59 b59Var;
        if (!(view instanceof xv)) {
            return (!(view instanceof aw) || (b59Var = ((aw) view).d) == null) ? view : v(b59Var.a);
        }
        b59 b59Var2 = ((xv) view).d;
        return b59Var2 != null ? v(b59Var2.a) : view;
    }

    public static TL_iv.PageBlock w(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof vx) {
            TL_iv.PageBlock pageBlock2 = ((vx) pageBlock).d;
            return pageBlock2 != null ? w(pageBlock2) : pageBlock2;
        }
        if (!(pageBlock instanceof xx)) {
            return pageBlock;
        }
        TL_iv.PageBlock pageBlock3 = ((xx) pageBlock).d;
        return pageBlock3 != null ? w(pageBlock3) : pageBlock3;
    }

    public static TL_iv.RichText x(TL_iv.RichText richText) {
        if (richText == null) {
            return null;
        }
        if (richText instanceof TL_iv.textFixed) {
            return x(((TL_iv.textFixed) richText).text);
        }
        if (richText instanceof TL_iv.textItalic) {
            return x(((TL_iv.textItalic) richText).text);
        }
        if (richText instanceof TL_iv.textBold) {
            return x(((TL_iv.textBold) richText).text);
        }
        if (richText instanceof TL_iv.textUnderline) {
            return x(((TL_iv.textUnderline) richText).text);
        }
        if (richText instanceof TL_iv.textStrike) {
            return x(((TL_iv.textStrike) richText).text);
        }
        if (richText instanceof TL_iv.textEmail) {
            return x(((TL_iv.textEmail) richText).text);
        }
        if (richText instanceof TL_iv.textUrl) {
            return x(((TL_iv.textUrl) richText).text);
        }
        if (!(richText instanceof TL_iv.textAnchor)) {
            return richText instanceof TL_iv.textSubscript ? x(((TL_iv.textSubscript) richText).text) : richText instanceof TL_iv.textSuperscript ? x(((TL_iv.textSuperscript) richText).text) : richText instanceof TL_iv.textMarked ? x(((TL_iv.textMarked) richText).text) : richText instanceof TL_iv.textPhone ? x(((TL_iv.textPhone) richText).text) : richText instanceof TL_iv.textSpoiler ? x(((TL_iv.textSpoiler) richText).text) : richText;
        }
        x(((TL_iv.textAnchor) richText).text);
        return richText;
    }

    public static CharSequence y(TL_iv.RichText richText) {
        if (richText == null) {
            return "";
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
        if (richText instanceof TL_iv.textPlain) {
            return ((TL_iv.textPlain) richText).text;
        }
        if (richText instanceof TL_iv.textAnchor) {
            return y(((TL_iv.textAnchor) richText).text);
        }
        if (richText instanceof TL_iv.textEmpty) {
            return "";
        }
        if (!(richText instanceof TL_iv.textConcat)) {
            return richText instanceof TL_iv.textSubscript ? y(((TL_iv.textSubscript) richText).text) : richText instanceof TL_iv.textSuperscript ? y(((TL_iv.textSuperscript) richText).text) : richText instanceof TL_iv.textMarked ? y(((TL_iv.textMarked) richText).text) : richText instanceof TL_iv.textPhone ? y(((TL_iv.textPhone) richText).text) : "";
        }
        StringBuilder sb = new StringBuilder();
        int size = richText.texts.size();
        for (int i = 0; i < size; i++) {
            sb.append(y(richText.texts.get(i)));
        }
        return sb;
    }

    public static CharSequence z(ui5 ui5Var, TLRPC.WebPage webPage, View view, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock, int i) {
        TextPaint B;
        if (richText2 == null) {
            return null;
        }
        if (richText2 instanceof TL_iv.textFixed) {
            return z(ui5Var, webPage, view, richText, ((TL_iv.textFixed) richText2).text, pageBlock, i);
        }
        if (richText2 instanceof TL_iv.textItalic) {
            return z(ui5Var, webPage, view, richText, ((TL_iv.textItalic) richText2).text, pageBlock, i);
        }
        if (richText2 instanceof TL_iv.textBold) {
            return z(ui5Var, webPage, view, richText, ((TL_iv.textBold) richText2).text, pageBlock, i);
        }
        if (richText2 instanceof TL_iv.textUnderline) {
            return z(ui5Var, webPage, view, richText, ((TL_iv.textUnderline) richText2).text, pageBlock, i);
        }
        if (richText2 instanceof TL_iv.textStrike) {
            return z(ui5Var, webPage, view, richText, ((TL_iv.textStrike) richText2).text, pageBlock, i);
        }
        byte b = 0;
        if (richText2 instanceof TL_iv.textEmail) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(z(ui5Var, webPage, view, richText, ((TL_iv.textEmail) richText2).text, pageBlock, i));
            MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder.length() != 0) {
                spannableStringBuilder.setSpan(new vjb((metricAffectingSpanArr == null || metricAffectingSpanArr.length == 0) ? B(ui5Var, richText, richText2, pageBlock) : null, "mailto:" + C(richText2)), 0, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        long j = 0;
        if (richText2 instanceof TL_iv.textUrl) {
            TL_iv.textUrl texturl = (TL_iv.textUrl) richText2;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(z(ui5Var, webPage, view, richText, texturl.text, pageBlock, i));
            MetricAffectingSpan[] metricAffectingSpanArr2 = (MetricAffectingSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), MetricAffectingSpan.class);
            B = (metricAffectingSpanArr2 == null || metricAffectingSpanArr2.length == 0) ? B(ui5Var, richText, richText2, pageBlock) : null;
            Object yjbVar = texturl.webpage_id != 0 ? new yjb(B, C(richText2)) : new vjb(B, C(richText2));
            if (spannableStringBuilder2.length() != 0) {
                spannableStringBuilder2.setSpan(yjbVar, 0, spannableStringBuilder2.length(), 33);
            }
            return spannableStringBuilder2;
        }
        if (richText2 instanceof TL_iv.textPlain) {
            return ((TL_iv.textPlain) richText2).text;
        }
        if (richText2 instanceof TL_iv.textAnchor) {
            TL_iv.textAnchor textanchor = (TL_iv.textAnchor) richText2;
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(z(ui5Var, webPage, view, richText, textanchor.text, pageBlock, i));
            String str = textanchor.name;
            vk vkVar = new vk();
            vkVar.a = str.toLowerCase();
            spannableStringBuilder3.setSpan(vkVar, 0, spannableStringBuilder3.length(), 17);
            return spannableStringBuilder3;
        }
        if (!(richText2 instanceof TL_iv.textEmpty)) {
            char c = '\n';
            int i2 = 1;
            if (richText2 instanceof TL_iv.textConcat) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                int size = richText2.texts.size();
                int i3 = 0;
                while (i3 < size) {
                    TL_iv.RichText richText3 = richText2.texts.get(i3);
                    TL_iv.RichText x = x(richText3);
                    int i4 = (i < 0 || !(richText3 instanceof TL_iv.textUrl) || ((TL_iv.textUrl) richText3).webpage_id == j) ? 0 : i2;
                    if (i4 != 0 && spannableStringBuilder4.length() != 0 && spannableStringBuilder4.charAt(spannableStringBuilder4.length() - i2) != c) {
                        spannableStringBuilder4.append((CharSequence) " ");
                        spannableStringBuilder4.setSpan(new ikb(), spannableStringBuilder4.length() - i2, spannableStringBuilder4.length(), 33);
                    }
                    int i5 = i3;
                    int i6 = i2;
                    CharSequence z = z(ui5Var, webPage, view, richText, richText3, pageBlock, i);
                    int A = A(x);
                    int length = spannableStringBuilder4.length();
                    spannableStringBuilder4.append(z);
                    if (A != 0 && !(z instanceof SpannableStringBuilder)) {
                        if ((A & 8) != 0 || (A & 512) != 0) {
                            String C = C(richText3);
                            if (C == null) {
                                C = C(richText);
                            }
                            Object yjbVar2 = (A & 512) != 0 ? new yjb(B(ui5Var, richText, x, pageBlock), C) : new vjb(B(ui5Var, richText, x, pageBlock), C);
                            if (length != spannableStringBuilder4.length()) {
                                spannableStringBuilder4.setSpan(yjbVar2, length, spannableStringBuilder4.length(), 33);
                            }
                        } else if (length != spannableStringBuilder4.length()) {
                            TextPaint B2 = B(ui5Var, richText, x, pageBlock);
                            ujb ujbVar = new ujb();
                            ujbVar.a = B2;
                            spannableStringBuilder4.setSpan(ujbVar, length, spannableStringBuilder4.length(), 33);
                        }
                    }
                    if (i4 != 0 && i5 != size - 1) {
                        spannableStringBuilder4.append((CharSequence) " ");
                        spannableStringBuilder4.setSpan(new ikb(), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                    }
                    i3 = i5 + 1;
                    i2 = i6;
                    c = '\n';
                    j = 0;
                }
                return spannableStringBuilder4;
            }
            if (richText2 instanceof TL_iv.textSubscript) {
                return z(ui5Var, webPage, view, richText, ((TL_iv.textSubscript) richText2).text, pageBlock, i);
            }
            if (richText2 instanceof TL_iv.textSuperscript) {
                return z(ui5Var, webPage, view, richText, ((TL_iv.textSuperscript) richText2).text, pageBlock, i);
            }
            if (richText2 instanceof TL_iv.textMarked) {
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(z(ui5Var, webPage, view, richText, ((TL_iv.textMarked) richText2).text, pageBlock, i));
                MetricAffectingSpan[] metricAffectingSpanArr3 = (MetricAffectingSpan[]) spannableStringBuilder5.getSpans(0, spannableStringBuilder5.length(), MetricAffectingSpan.class);
                if (spannableStringBuilder5.length() != 0) {
                    B = (metricAffectingSpanArr3 == null || metricAffectingSpanArr3.length == 0) ? B(ui5Var, richText, richText2, pageBlock) : null;
                    tjb tjbVar = new tjb();
                    tjbVar.a = B;
                    spannableStringBuilder5.setSpan(tjbVar, 0, spannableStringBuilder5.length(), 33);
                }
                return spannableStringBuilder5;
            }
            if (richText2 instanceof TL_iv.textSpoiler) {
                SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(z(ui5Var, webPage, view, richText, ((TL_iv.textSpoiler) richText2).text, pageBlock, i));
                if (spannableStringBuilder6.length() != 0) {
                    wkb wkbVar = new wkb();
                    wkbVar.a |= 256;
                    spannableStringBuilder6.setSpan(new xkb(wkbVar, 0), 0, spannableStringBuilder6.length(), 33);
                }
                return spannableStringBuilder6;
            }
            if (richText2 instanceof TL_iv.textPhone) {
                SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(z(ui5Var, webPage, view, richText, ((TL_iv.textPhone) richText2).text, pageBlock, i));
                MetricAffectingSpan[] metricAffectingSpanArr4 = (MetricAffectingSpan[]) spannableStringBuilder7.getSpans(0, spannableStringBuilder7.length(), MetricAffectingSpan.class);
                if (spannableStringBuilder7.length() != 0) {
                    spannableStringBuilder7.setSpan(new vjb((metricAffectingSpanArr4 == null || metricAffectingSpanArr4.length == 0) ? B(ui5Var, richText, richText2, pageBlock) : null, "tel:" + C(richText2)), 0, spannableStringBuilder7.length(), 33);
                }
                return spannableStringBuilder7;
            }
            if (richText2 instanceof TL_iv.textImage) {
                TL_iv.textImage textimage = (TL_iv.textImage) richText2;
                TLRPC.Document a = dy.a(webPage, textimage.document_id);
                TLRPC.Photo e = dy.e(webPage, textimage.photo_id);
                if (a != null) {
                    SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder("*");
                    int L = gm.L(textimage.w);
                    int L2 = gm.L(textimage.h);
                    int abs = Math.abs(i);
                    if (L > abs) {
                        L2 = (int) (L2 * (abs / L));
                        L = abs;
                    }
                    if (view != null) {
                        int i7 = cmb.c6;
                        ((o) ui5Var).getClass();
                        boolean z2 = gm.B(cmb.w0(null, i7, false)) <= 0.705f;
                        sjb sjbVar = new sjb();
                        Locale locale = Locale.US;
                        String str2 = L + "_" + L2 + "_i";
                        sjbVar.b = L;
                        sjbVar.c = L2;
                        boolean z3 = z2;
                        ImageReceiver imageReceiver = new ImageReceiver(view);
                        sjbVar.a = imageReceiver;
                        imageReceiver.K0 = true;
                        if (z3) {
                            imageReceiver.h1 = new rjb(b);
                        }
                        imageReceiver.Z(gn5.b(a), str2, gn5.c(bc4.w(a.thumbs, 90, false, null, false), a), str2, null, -1L, null, webPage, 1);
                        spannableStringBuilder8.setSpan(sjbVar, 0, spannableStringBuilder8.length(), 33);
                    }
                    return spannableStringBuilder8;
                }
                if (e instanceof cvc) {
                    cvc cvcVar = (cvc) e;
                    SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder("*");
                    int L3 = gm.L(textimage.w);
                    int L4 = gm.L(textimage.h);
                    int abs2 = Math.abs(i);
                    if (L3 > abs2) {
                        L4 = (int) (L4 * (abs2 / L3));
                        L3 = abs2;
                    }
                    if (view != null) {
                        sjb sjbVar2 = new sjb();
                        sjbVar2.b = L3;
                        sjbVar2.c = L4;
                        ImageReceiver imageReceiver2 = new ImageReceiver(view);
                        sjbVar2.a = imageReceiver2;
                        imageReceiver2.K0 = true;
                        dvc.g(cvcVar, imageReceiver2, new jd((byte) 10));
                        spannableStringBuilder9.setSpan(sjbVar2, 0, spannableStringBuilder9.length(), 33);
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
                    lz5 a2 = lz5.a(textmath.source, gm.L(20.0f), true);
                    if (a2 != null) {
                        textmath.w = a2.b;
                        textmath.h = a2.c;
                        textmath.depth = a2.d;
                        textmath.bitmap = a2.a;
                    }
                }
                if (textmath.bitmap != null) {
                    SpannableStringBuilder spannableStringBuilder10 = new SpannableStringBuilder("￼");
                    Bitmap bitmap = textmath.bitmap;
                    int i8 = textmath.w;
                    int i9 = textmath.h;
                    int i10 = cmb.F6;
                    ((o) ui5Var).getClass();
                    spannableStringBuilder10.setSpan(new sjb(view, bitmap, i8, i9, cmb.w0(null, i10, false), textmath.depth), 0, spannableStringBuilder10.length(), 33);
                    String str3 = textmath.source;
                    if (str3 != null && !str3.isEmpty()) {
                        spannableStringBuilder10.setSpan(new lkb(textmath.source), 0, spannableStringBuilder10.length(), 33);
                    }
                    return spannableStringBuilder10;
                }
                String str4 = textmath.source;
                if (str4 != null) {
                    return str4;
                }
            }
        }
        return "";
    }

    public final void D() {
        ArrayList arrayList = this.e0;
        int size = arrayList.size();
        ArticleViewer$WindowView articleViewer$WindowView = this.g0;
        sx sxVar = this.L;
        boolean z = false;
        if (size <= 1) {
            articleViewer$WindowView.e = false;
            articleViewer$WindowView.d = false;
            float width = sxVar != null ? sxVar.J * sxVar.c.getWidth() : this.h0.getX();
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = r0.getMeasuredWidth() - width;
            if (sxVar != null) {
                animatorSet.playTogether(sxVar.l(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.h0, (Property<a, Float>) View.TRANSLATION_X, r0.getMeasuredWidth()), ObjectAnimator.ofFloat(this.g0, f1, r0.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / r0.getMeasuredWidth()) * measuredWidth), nm7.Y3));
            animatorSet.setInterpolator(d53.h);
            animatorSet.addListener(new d(this));
            animatorSet.start();
            this.V0 = true;
            return;
        }
        articleViewer$WindowView.f = true;
        articleViewer$WindowView.e = true;
        articleViewer$WindowView.h = this.K0;
        this.v0[1].setVisibility(0);
        this.v0[1].setAlpha(1.0f);
        this.v0[1].setTranslationX(0.0f);
        this.v0[0].setBackgroundColor(sxVar == null ? 0 : this.m0.getColor());
        c0(-1, arrayList.get(arrayList.size() - 2), true);
        m mVar = this.v0[0];
        mVar.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        mVar.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.v0[0], (Property<m, Float>) View.TRANSLATION_X, mVar.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(d53.h);
        animatorSet2.addListener(new e(this));
        animatorSet2.start();
        wu wuVar = this.i0;
        m mVar2 = this.v0[0];
        wuVar.setMenuColors((mVar2 == null || !gda.s0) ? cmb.w0(null, cmb.Fl, false) : mVar2.getBackgroundColor());
        wu wuVar2 = this.i0;
        m mVar3 = this.v0[0];
        wuVar2.d((mVar3 == null || !gda.s0) ? cmb.w0(null, cmb.Fl, false) : mVar3.getActionBarColor(), true);
        wu wuVar3 = this.i0;
        m mVar4 = this.v0[0];
        wuVar3.setIsTonsite(mVar4 != null && mVar4.d());
        wu wuVar4 = this.i0;
        m mVar5 = this.v0[0];
        if (mVar5 != null && mVar5.c()) {
            z = true;
        }
        wuVar4.setIsLocal(z);
        this.V0 = true;
    }

    public final void E(int i) {
        ArrayList arrayList = this.e0;
        int size = arrayList.size();
        ArticleViewer$WindowView articleViewer$WindowView = this.g0;
        sx sxVar = this.L;
        boolean z = false;
        if (size <= 1) {
            articleViewer$WindowView.e = false;
            articleViewer$WindowView.d = false;
            float width = sxVar != null ? sxVar.J * sxVar.c.getWidth() : this.h0.getX();
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = r9.getMeasuredWidth() - width;
            if (sxVar != null) {
                animatorSet.playTogether(sxVar.l(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.h0, (Property<a, Float>) View.TRANSLATION_X, r9.getMeasuredWidth()), ObjectAnimator.ofFloat(this.g0, f1, r9.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / r9.getMeasuredWidth()) * measuredWidth), nm7.Y3));
            animatorSet.setInterpolator(d53.h);
            animatorSet.addListener(new f(this));
            animatorSet.start();
            this.V0 = true;
            return;
        }
        articleViewer$WindowView.f = true;
        this.v0[1].setVisibility(0);
        this.v0[1].setAlpha(1.0f);
        this.v0[1].setTranslationX(0.0f);
        this.v0[0].setBackgroundColor(sxVar == null ? 0 : this.m0.getColor());
        c0(-1, arrayList.get(i), true);
        m mVar = this.v0[0];
        mVar.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        mVar.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.v0[0], (Property<m, Float>) View.TRANSLATION_X, mVar.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(d53.h);
        animatorSet2.addListener(new g(this, i));
        animatorSet2.start();
        wu wuVar = this.i0;
        m mVar2 = this.v0[0];
        wuVar.setMenuColors((mVar2 == null || !gda.s0) ? cmb.w0(null, cmb.Fl, false) : mVar2.getBackgroundColor());
        wu wuVar2 = this.i0;
        m mVar3 = this.v0[0];
        wuVar2.d((mVar3 == null || !gda.s0) ? cmb.w0(null, cmb.Fl, false) : mVar3.getActionBarColor(), true);
        wu wuVar3 = this.i0;
        m mVar4 = this.v0[0];
        wuVar3.setIsTonsite(mVar4 != null && mVar4.d());
        wu wuVar4 = this.i0;
        m mVar5 = this.v0[0];
        if (mVar5 != null && mVar5.c()) {
            z = true;
        }
        wuVar4.setIsLocal(z);
        this.V0 = true;
    }

    public final boolean G() {
        ArrayList arrayList = this.e0;
        return arrayList.size() > 0 && (arrayList.get(0) instanceof TLRPC.WebPage);
    }

    public final void K() {
        this.W = false;
        int i = 0;
        while (true) {
            m[] mVarArr = this.v0;
            if (i < mVarArr.length) {
                mVarArr[i].a();
                i++;
            } else {
                try {
                    break;
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            }
        }
        this.M.getWindow().clearFlags(128);
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.O;
            if (i2 >= arrayList.size()) {
                this.h0.post(new ut(this, (byte) 6));
                nm7.f(this.Y).k(nm7.d1, new Object[0]);
                return;
            } else {
                ((j) arrayList.get(i2)).a(false);
                i2++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v43, types: [org.telegram.tgnet.TLRPC$WebPage] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.Object, org.telegram.ui.o] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean, int] */
    public final boolean L(k47 k47Var, TLRPC.TL_webPage tL_webPage, String str, String str2) {
        TLRPC.TL_webPage tL_webPage2;
        boolean z;
        int lastIndexOf;
        String substring;
        boolean z2;
        ?? r5;
        TL_iv.Page page;
        if (this.M == null) {
            return false;
        }
        sx sxVar = this.L;
        if (sxVar == null && this.W) {
            return false;
        }
        org.telegram.ui.ActionBar.d dVar = this.N;
        if (dVar != null && (dVar.getParentLayout() instanceof ActionBarLayout)) {
            gm.t1((ActionBarLayout) this.N.getParentLayout());
        }
        if (k47Var != null) {
            tL_webPage2 = tL_webPage == null ? k47Var.k.media.webpage : tL_webPage;
            z = (tL_webPage2 == null || (page = tL_webPage2.cached_page) == null || page.local == null) ? false : true;
            for (int i = 0; i < k47Var.k.entities.size(); i++) {
                TLRPC.MessageEntity messageEntity = k47Var.k.entities.get(i);
                if (messageEntity instanceof TLRPC.TL_messageEntityUrl) {
                    try {
                        String str3 = k47Var.k.message;
                        int i2 = messageEntity.offset;
                        ?? lowerCase = str3.substring(i2, messageEntity.length + i2).toLowerCase();
                        ?? lowerCase2 = !TextUtils.isEmpty(tL_webPage2.cached_page.url) ? tL_webPage2.cached_page.url.toLowerCase() : tL_webPage2.url.toLowerCase();
                        if (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase)) {
                            int lastIndexOf2 = lowerCase.lastIndexOf(35);
                            if (lastIndexOf2 == -1) {
                                break;
                            }
                            substring = lowerCase.substring(lastIndexOf2 + 1);
                            break;
                        }
                    } catch (Exception e) {
                        fc4.g(e, true);
                    }
                }
            }
            substring = null;
        } else if (str == null || (lastIndexOf = str.lastIndexOf(35)) == -1) {
            tL_webPage2 = tL_webPage;
            z = false;
            substring = null;
        } else {
            substring = str.substring(lastIndexOf + 1);
            tL_webPage2 = tL_webPage;
            z = false;
        }
        ArrayList arrayList = this.e0;
        if (sxVar == null || arrayList.isEmpty()) {
            z2 = z;
            r5 = 0;
        } else {
            z2 = z;
            r5 = 1;
        }
        if (r5 == 0) {
            arrayList.clear();
            this.h0.setTranslationX(0.0f);
            if (sxVar != null) {
                sxVar.J = 0.0f;
                sxVar.c.invalidate();
                sxVar.u();
                sxVar.r();
            }
            this.h0.setTranslationY(0.0f);
            this.v0[0].setTranslationY(0.0f);
            this.v0[0].setTranslationX(0.0f);
            this.v0[1].setTranslationX(0.0f);
            this.v0[0].setAlpha(1.0f);
            this.g0.setInnerTranslationX(0.0f);
            this.v0[0].f();
            V(gm.L(56.0f));
        }
        if (sxVar != null && qw0.R0) {
            sxVar.a.d();
        }
        if (tL_webPage2 != null) {
            boolean e2 = e(tL_webPage2, substring, r5);
            if (!z2) {
                String str4 = (e2 || substring == null) ? null : substring;
                TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                tL_messages_getWebPage.url = tL_webPage2.url;
                TL_iv.Page page2 = tL_webPage2.cached_page;
                if ((page2 instanceof TL_iv.TL_pagePart_layer82) || page2.part) {
                    tL_messages_getWebPage.hash = 0;
                } else {
                    tL_messages_getWebPage.hash = tL_webPage2.hash;
                }
                int i3 = k47Var != null ? k47Var.K1 : z8c.t0;
                ConnectionsManager.getInstance(i3).sendRequest(tL_messages_getWebPage, new ru((o) this, i3, tL_webPage2, k47Var, (boolean) r5, str4));
            }
        } else {
            d(r5, str2);
        }
        wu wuVar = this.i0;
        if (wuVar != null && r5 == 0) {
            wuVar.setIsLocal(this.v0[0].c());
        }
        this.U = null;
        if (sxVar != null) {
            if (r5 == 0) {
                gm.B2(this.g0);
                sxVar.d = this.g0;
                sxVar.A();
                sxVar.c.addView(this.g0, qoe.c(-1.0f, -1));
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
            } catch (Exception e3) {
                fc4.g(e3, true);
                return false;
            }
        }
        this.W = true;
        this.a0 = (byte) 1;
        if (r5 == 0) {
            if (sxVar == null) {
                this.g0.setAlpha(0.0f);
                this.h0.setAlpha(0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                ArticleViewer$WindowView articleViewer$WindowView = this.g0;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, (Property<ArticleViewer$WindowView, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.h0, (Property<a, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.g0, (Property<ArticleViewer$WindowView, Float>) View.TRANSLATION_X, gm.L(56.0f), 0.0f));
                this.b0 = new ut(this, (byte) 11);
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(this.d0);
                animatorSet.addListener(new av(this));
                this.c0 = System.currentTimeMillis();
                gm.c3(new pf2(this, animatorSet, (byte) 27));
            } else if (r5 != 0) {
                sxVar.a.e();
            } else if (!sxVar.h) {
                sxVar.q(sxVar.b);
                sxVar.o();
            }
        }
        this.h0.setLayerType(2, null);
        return true;
    }

    public final void N(long j, TLRPC.User user) {
        if (user == null || !(this.M instanceof LaunchActivity)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        bundle.putString("botUser", "webpage" + j);
        ((LaunchActivity) this.M).u0(new yv1(bundle), false, true);
        l(false, true);
    }

    public final void O(String str, String str2, vu vuVar) {
        Activity activity = this.M;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        m mVar = this.v0[0];
        if (mVar == null || !mVar.c()) {
            P(str, str2, vuVar);
            return;
        }
        String M0 = jb6.M0(2131747515, null);
        int indexOf = M0.indexOf("%");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.format(M0, str));
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new URLSpan(str), indexOf, str.length() + indexOf, 33);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, null, this.M);
        String M02 = jb6.M0(2131747512, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M02;
        heVar.U = spannableStringBuilder;
        heVar.i0 = false;
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        alertDialog$Builder.j(jb6.M0(2131747550, null), new lu((Object) this, (Object) str, (Object) str2, (Object) vuVar, (byte) 0));
        alertDialog$Builder.o();
    }

    public final void P(String str, String str2, vu vuVar) {
        sx sxVar;
        vu vuVar2 = this.O0;
        if (vuVar2 != null) {
            vuVar2.a(false);
        }
        this.O0 = vuVar;
        if (this.H0 != 0) {
            ConnectionsManager.getInstance(this.Y).cancelRequest(this.H0, false);
            this.H0 = 0;
        }
        boolean[] zArr = new boolean[1];
        if (l11.n(this.M, str, false)) {
            if (!this.e0.isEmpty() || (sxVar = this.L) == null) {
                return;
            }
            sxVar.a(false);
            return;
        }
        nu nuVar = new nu(this, str, zArr, vuVar);
        int i = this.J0 + 1;
        this.J0 = i;
        Z(true);
        TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
        tL_messages_getWebPage.url = str;
        tL_messages_getWebPage.hash = 0;
        this.H0 = ConnectionsManager.getInstance(this.Y).sendRequest(tL_messages_getWebPage, new ou(this, i, vuVar, str2, nuVar, tL_messages_getWebPage));
        if (vuVar != null) {
            vuVar.b = new wc7((Object) this, i, (Object) vuVar, (byte) 4);
            vuVar.d();
        }
    }

    public final void Q() {
        TextView textView = this.D0;
        if (textView != null) {
            int i = cmb.h6;
            fg0 f0 = cmb.f0(cmb.w0(null, i, false), 2, -1);
            wmb M = anb.M(i);
            textView.setBackground(f0);
            anb.j(textView, f0, null, M, null);
            anb.X(this.D0, cmb.D8, null);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.C0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            anb.h(cmb.F8, null, actionBarPopupWindow$ActionBarPopupWindowLayout);
        }
        ImageView imageView = this.s0;
        if (imageView != null) {
            anb.s(imageView, cmb.F6, null, PorterDuff.Mode.MULTIPLY);
            ImageView imageView2 = this.s0;
            int i2 = cmb.y8;
            anb.R(imageView2, cmb.f0(cmb.w0(null, i2, false), 1, -1), null, anb.M(i2), null);
        }
        ImageView imageView3 = this.t0;
        if (imageView3 != null) {
            anb.s(imageView3, cmb.F6, null, PorterDuff.Mode.MULTIPLY);
            ImageView imageView4 = this.t0;
            int i3 = cmb.y8;
            anb.R(imageView4, cmb.f0(cmb.w0(null, i3, false), 1, -1), null, anb.M(i3), null);
        }
        io ioVar = this.u0;
        if (ioVar != null) {
            anb.U(ioVar, cmb.F6, null);
        }
        wu wuVar = this.i0;
        if (wuVar != null) {
            m mVar = this.v0[0];
            wuVar.setMenuColors((mVar == null || !gda.s0) ? cmb.w0(null, cmb.Fl, false) : mVar.getBackgroundColor());
            wu wuVar2 = this.i0;
            m mVar2 = this.v0[0];
            wuVar2.d((mVar2 == null || !gda.s0) ? cmb.w0(null, cmb.Fl, false) : mVar2.getActionBarColor(), true);
        }
        this.m0.setColor(cmb.w0(null, cmb.Fl, false));
    }

    public final void S() {
        int K0;
        m mVar = this.v0[0];
        if (mVar.c.F == null || (K0 = mVar.d.K0()) == -1) {
            return;
        }
        View m = this.v0[0].d.m(K0);
        int top = m != null ? m.getTop() : 0;
        SharedPreferences.Editor edit = org.telegram.messenger.a.b.getSharedPreferences("articles", 0).edit();
        String str = "article" + this.v0[0].c.F.id;
        SharedPreferences.Editor putInt = edit.putInt(str, K0).putInt(str.concat("o"), top);
        String concat = str.concat("r");
        Point point = gm.q;
        putInt.putBoolean(concat, point.x > point.y).commit();
    }

    public final boolean T(String str, boolean z) {
        byte b = 0;
        Integer num = 0;
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            Integer num2 = (Integer) this.v0[0].c.h.get(lowerCase);
            if (num2 != null) {
                TL_iv.textAnchor textanchor = (TL_iv.textAnchor) this.v0[0].c.r.get(lowerCase);
                byte b2 = 1;
                if (textanchor != null) {
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    boolean isEmpty = TextUtils.isEmpty(this.v0[0].c.F.cached_page.url);
                    m[] mVarArr = this.v0;
                    pageblockparagraph.text = dvc.d(textanchor.text, !isEmpty ? mVarArr[0].c.F.cached_page.url.toLowerCase() : mVarArr[0].c.F.url.toLowerCase(), lowerCase);
                    this.v0[0].c.getClass();
                    int I = ey.I(pageblockparagraph);
                    u69 x = this.v0[0].c.x(null, I);
                    View view = x.a;
                    this.v0[0].c.H(I, x, pageblockparagraph, 0, 0, false);
                    my0 i = wi8.i(this.M, false, 1, null);
                    i.v0 = false;
                    i.w0 = false;
                    LinearLayout linearLayout = new LinearLayout(this.M);
                    linearLayout.setOrientation(1);
                    gkb gkbVar = new gkb();
                    this.R0 = gkbVar;
                    gkbVar.Q(linearLayout);
                    this.R0.D = new yu(this, b2);
                    wb wbVar = new wb(this.M, (byte) 11);
                    wbVar.setTextSize(1, 16.0f);
                    wbVar.setTypeface(gm.o());
                    wbVar.setText(jb6.M0(2131748949, null));
                    wbVar.setGravity((this.v0[0].c.H ? 5 : 3) | 16);
                    wbVar.setTextColor(cmb.w0(null, cmb.F6, false));
                    wbVar.setPadding(gm.L(18.0f), 0, gm.L(18.0f), 0);
                    linearLayout.addView(wbVar, new LinearLayout.LayoutParams(-1, gm.L(48.0f) + 1));
                    view.setTag("bottomSheet");
                    linearLayout.addView(view, qoe.k(0.0f, 7.0f, 0.0f, 0.0f, -1, -2));
                    rkb m = this.R0.m(this.M);
                    su suVar = new su(this, this.M, linearLayout, b);
                    i.z0 = new tu(this, b);
                    suVar.addView(linearLayout, -1, -2);
                    suVar.addView(m, -1, -2);
                    i.O = suVar;
                    if (this.Q0.w()) {
                        this.Q0.e(false);
                    }
                    this.J = i;
                    Y(i);
                    return true;
                }
                if (num2.intValue() >= 0 && num2.intValue() < this.v0[0].c.e.size()) {
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) this.v0[0].c.e.get(num2.intValue());
                    TL_iv.PageBlock w = w(pageBlock);
                    if ((w instanceof tx) && M((tx) w)) {
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
                            int I2 = ey.I(pageBlock);
                            u69 x2 = this.v0[0].c.x(null, I2);
                            this.v0[0].c.H(I2, x2, pageBlock, 0, 0, false);
                            x2.a.measure(View.MeasureSpec.makeMeasureSpec(this.v0[0].b.getMeasuredWidth(), TLObject.FLAG_30), 0);
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
                    if (!z) {
                        this.v0[0].d.g1(num2.intValue(), (-gm.L(56.0f)) - num.intValue());
                        return true;
                    }
                    uu uuVar = new uu(this.v0[0].getContext());
                    uuVar.a = num2.intValue();
                    uuVar.s = (-gm.L(56.0f)) - num.intValue();
                    this.v0[0].d.v0(uuVar);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0098 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U(int i) {
        int size;
        int i2;
        TL_iv.PageBlock pageBlock;
        tx txVar;
        TL_iv.PageBlock pageBlock2;
        if (i < 0 || i >= this.F.size()) {
            f0();
            return;
        }
        this.H = i;
        f0();
        ox oxVar = (ox) this.F.get(i);
        TL_iv.PageBlock w = w(oxVar.c);
        int size2 = this.v0[0].c.e.size();
        for (int i3 = 0; i3 < size2; i3++) {
            TL_iv.PageBlock pageBlock3 = (TL_iv.PageBlock) this.v0[0].c.e.get(i3);
            if ((pageBlock3 instanceof tx) && ((pageBlock2 = (txVar = (tx) pageBlock3).b) == oxVar.c || pageBlock2 == w)) {
                if (M(txVar)) {
                    this.v0[0].c.M();
                    this.v0[0].c.f();
                }
                size = this.v0[0].c.d.size();
                i2 = 0;
                while (true) {
                    if (i2 < size) {
                        i2 = -1;
                        break;
                    }
                    TL_iv.PageBlock pageBlock4 = (TL_iv.PageBlock) this.v0[0].c.d.get(i2);
                    TL_iv.PageBlock pageBlock5 = oxVar.c;
                    if (pageBlock4 == pageBlock5 || pageBlock4 == w || ((pageBlock4 instanceof tx) && ((pageBlock = ((tx) pageBlock4).b) == pageBlock5 || pageBlock == w))) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 != -1) {
                    return;
                }
                if ((w instanceof tx) && M((tx) w)) {
                    this.v0[0].c.M();
                    this.v0[0].c.f();
                }
                String str = this.G + oxVar.c + oxVar.b + oxVar.a;
                Integer num = (Integer) this.v0[0].c.E.get(str);
                if (num == null) {
                    ey eyVar = this.v0[0].c;
                    TL_iv.PageBlock pageBlock6 = oxVar.c;
                    eyVar.getClass();
                    int I = ey.I(pageBlock6);
                    u69 x = this.v0[0].c.x(null, I);
                    this.v0[0].c.H(I, x, oxVar.c, 0, 0, false);
                    x.a.measure(View.MeasureSpec.makeMeasureSpec(this.v0[0].b.getMeasuredWidth(), TLObject.FLAG_30), 0);
                    num = (Integer) this.v0[0].c.E.get(str);
                    if (num == null) {
                        num = 0;
                    }
                }
                zu zuVar = new zu(this.v0[0].getContext());
                if (this.v0[0].c.J) {
                    i2++;
                }
                zuVar.a = i2;
                zuVar.s = -(gm.L(100.0f) + ((this.K0 - gm.L(56.0f)) - num.intValue()));
                zuVar.t = 1.2f;
                this.v0[0].d.v0(zuVar);
                this.v0[0].b.h1();
                return;
            }
        }
        size = this.v0[0].c.d.size();
        i2 = 0;
        while (true) {
            if (i2 < size) {
            }
            i2++;
        }
        if (i2 != -1) {
        }
    }

    public final void V(int i) {
        wu wuVar = this.i0;
        if (wuVar == null || wuVar.U || wuVar.a0) {
            return;
        }
        int j = Utilities.j(i, gm.L(56.0f), gm.L(24.0f));
        this.K0 = j;
        this.i0.setHeight(j);
        this.Q0.x = this.K0;
        int i2 = 0;
        while (true) {
            m[] mVarArr = this.v0;
            if (i2 >= mVarArr.length) {
                return;
            }
            mVarArr[i2].b.setTopGlowOffset(this.K0);
            i2++;
        }
    }

    public final void W(Activity activity, org.telegram.ui.ActionBar.d dVar) {
        sx sxVar;
        a26 a26Var = this.W0;
        if (a26Var != null) {
            a26Var.a();
            this.W0 = null;
        }
        this.W0 = LaunchActivity.c0();
        this.N = dVar;
        int currentAccount = !(dVar instanceof i34) ? dVar.getCurrentAccount() : z8c.t0;
        this.Y = currentAccount;
        nm7.f(currentAccount).b(this, nm7.e2);
        nm7.f(this.Y).b(this, nm7.f2);
        nm7.f(this.Y).b(this, nm7.g2);
        nm7.f(this.Y).b(this, nm7.h2);
        nm7.f(this.Y).b(this, nm7.m4);
        Activity activity2 = this.M;
        if (activity2 == activity || !(activity2 == null || !this.K || (sxVar = this.L) == null || sxVar.e == null)) {
            e0(this);
            Q();
            return;
        }
        this.M = activity;
        byte b = 0;
        this.a = org.telegram.messenger.a.b.getSharedPreferences("articles", 0).getInt("font_type", 0);
        o(this, false);
        this.m0 = new Paint();
        this.n0 = activity.getResources().getDrawable(R.drawable.layer_shadow);
        this.o0 = new Paint();
        ArticleViewer$WindowView articleViewer$WindowView = new ArticleViewer$WindowView(this, activity);
        this.g0 = articleViewer$WindowView;
        articleViewer$WindowView.setWillNotDraw(false);
        byte b2 = 1;
        this.g0.setClipChildren(true);
        this.g0.setFocusable(false);
        a aVar = new a(this, activity);
        this.h0 = aVar;
        this.g0.addView(aVar, qoe.e(-1, -1, 51));
        if (this.L == null) {
            this.g0.setFitsSystemWindows(true);
            this.h0.setOnApplyWindowInsetsListener(new wt(b));
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        this.Q = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        byte b3 = 4;
        this.Q.setVisibility(4);
        this.g0.addView(this.Q, qoe.c(-1.0f, -1));
        jy jyVar = new jy(activity);
        this.S = jyVar;
        jyVar.setVisibility(0);
        this.S.setBackgroundColor(-16777216);
        byte b4 = 17;
        this.Q.addView(this.S, qoe.e(-1, -1, 17));
        this.R = new TextureView(activity);
        byte b5 = 2;
        this.v0 = new m[2];
        int i = 0;
        while (true) {
            m[] mVarArr = this.v0;
            byte b6 = 14;
            if (i >= mVarArr.length) {
                break;
            }
            m mVar = new m(this, activity);
            mVarArr[i] = mVar;
            mVar.setVisibility(i == 0 ? 0 : 8);
            this.h0.addView(mVar, qoe.d(-1, -1.0f, nm7.D1, 0.0f, 0.0f, 0.0f, 0.0f));
            mVar.b.setOnItemLongClickListener(new zt(this));
            mVar.b.setOnItemClickListener(new o(this, mVar, b6));
            i++;
        }
        this.h0.addView(new FrameLayout(activity), qoe.d(-1, -1.0f, nm7.D1, 0.0f, 0.0f, 0.0f, 0.0f));
        this.x0.setColor(-16777216);
        this.y0.setColor(-16777216);
        this.B0.setColor(-14408666);
        this.z0.setColor(-16777216);
        wu wuVar = new wu(this, activity);
        this.i0 = wuVar;
        wuVar.f0 = this.L != null;
        this.h0.addView(wuVar, qoe.e(-1, -2, 48));
        this.i0.setOnClickListener(new t(this, activity, b4));
        this.i0.c0.addTextChangedListener(new b7(this, b5));
        eb ebVar = new eb(activity);
        this.j0 = ebVar;
        ebVar.setOpenProgress(0.0f);
        this.j0.x.j(new y(this, b3));
        this.h0.addView(this.j0, qoe.c(-1.0f, -1));
        this.k0 = new ut(this, b2);
        this.i0.M.setOnClickListener(new yt(this, b5));
        this.i0.M.setOnLongClickListener(new au(this, b));
        this.i0.setMenuListener(new x0(this, activity, b5));
        this.i0.P.setOnClickListener(new yt(this, (byte) 3));
        a6 a6Var = new a6(this.M, b2);
        this.r0 = a6Var;
        a6Var.setOnTouchListener(new p8((byte) 14));
        this.r0.setWillNotDraw(false);
        this.r0.setTranslationY(gm.L(51.0f));
        this.r0.setVisibility(4);
        this.r0.setFocusable(true);
        this.r0.setFocusableInTouchMode(true);
        this.r0.setClickable(true);
        this.r0.setPadding(0, gm.L(3.0f), 0, 0);
        this.h0.addView(this.r0, qoe.e(-1, 51, 80));
        new mx5(this.g0, false, new xt(this, b));
        ImageView imageView = new ImageView(this.M);
        this.s0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.s0.setImageResource(R.drawable.msg_go_up);
        ImageView imageView2 = this.s0;
        int i2 = cmb.F6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        anb.s(imageView2, i2, null, mode);
        ImageView imageView3 = this.s0;
        int i3 = cmb.y8;
        anb.R(imageView3, cmb.f0(cmb.w0(null, i3, false), 1, -1), null, anb.M(i3), null);
        this.r0.addView(this.s0, qoe.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        this.s0.setOnClickListener(new yt(this, b));
        this.s0.setContentDescription(jb6.M0(2131754778, null));
        ImageView imageView4 = new ImageView(this.M);
        this.t0 = imageView4;
        imageView4.setScaleType(scaleType);
        this.t0.setImageResource(R.drawable.msg_go_down);
        anb.s(this.t0, i2, null, mode);
        anb.R(this.t0, cmb.f0(cmb.w0(null, i3, false), 1, -1), null, anb.M(i3), null);
        this.r0.addView(this.t0, qoe.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        this.t0.setOnClickListener(new yt(this, b2));
        this.t0.setContentDescription(jb6.M0(2131754777, null));
        io ioVar = new io(this.M, true, true, true);
        this.u0 = ioVar;
        ioVar.setScaleProperty(0.6f);
        this.u0.b(0.4f, 350L, d53.h);
        anb.U(this.u0, i2, null);
        this.u0.setTextSize(gm.L(15.0f));
        this.u0.setTypeface(gm.o());
        this.u0.setGravity(3);
        this.u0.getDrawable().N = gm.q.x;
        this.r0.addView(this.u0, qoe.d(-2, -2.0f, 19, 18.0f, 0.0f, 108.0f, 0.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f0 = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 98;
        layoutParams.softInputMode = 48;
        layoutParams.flags = 131072;
        int w0 = this.L == null ? cmb.w0(null, cmb.Z6, true) : cmb.w0(null, cmb.Z6, false);
        int i4 = (gm.B(w0) < 0.721f || Build.VERSION.SDK_INT < 26) ? 1792 : 1808;
        this.z0.setColor(w0);
        this.A0 = true;
        WindowManager.LayoutParams layoutParams2 = this.f0;
        layoutParams2.systemUiVisibility = i4;
        layoutParams2.flags |= -2147417856;
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams2.layoutInDisplayCutoutMode = 1;
        }
        gkb gkbVar = new gkb();
        this.Q0 = gkbVar;
        gkbVar.Q(this.v0[0].b);
        if (oc7.r1(this.Y).i4.r()) {
            this.Q0.k0 = new zt(this);
        }
        gkb gkbVar2 = this.Q0;
        gkbVar2.z0 = this.v0[0].d;
        gkbVar2.D = new yu(this, b);
        this.h0.addView(gkbVar2.m(activity));
        a aVar2 = this.h0;
        pc8 pc8Var = new pc8(aVar2, aVar2);
        this.S0 = pc8Var;
        pc8Var.F = new zt(this);
        pc8Var.E = new k6d((Object) this, (byte) 6);
        this.m0.setColor(cmb.w0(null, cmb.Fl, false));
        e0(this);
    }

    public final void X(String str) {
        String str2;
        if (this.M == null) {
            return;
        }
        my0 my0Var = this.J;
        if (my0Var != null) {
            my0Var.dismiss();
            this.J = null;
        }
        byte b = 0;
        byte b2 = 1;
        my0 i = wi8.i(this.M, false, 1, null);
        try {
            str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e) {
            fc4.g(e, true);
            str2 = str;
        }
        i.P = str2;
        i.Q = false;
        i.R = true;
        CharSequence[] charSequenceArr = {jb6.M0(2131747550, null), jb6.M0(2131751704, null)};
        ff ffVar = new ff(this, str, b2);
        i.M = charSequenceArr;
        i.L = ffVar;
        i.I0 = new bu(this, b);
        Y(i);
    }

    public final void Y(my0 my0Var) {
        if (this.M != null) {
            byte b = 1;
            try {
                my0 my0Var2 = this.l0;
                if (my0Var2 != null) {
                    my0Var2.dismiss();
                    this.l0 = null;
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
            try {
                this.l0 = my0Var;
                my0Var.setCanceledOnTouchOutside(true);
                this.l0.setOnDismissListener(new bu(this, b));
                my0Var.show();
            } catch (Exception e2) {
                fc4.g(e2, true);
            }
        }
    }

    public final void Z(boolean z) {
        gm.r(this.k0);
        wu wuVar = this.i0;
        if (!z) {
            wuVar.e0.a(true, 1.0f);
            return;
        }
        wuVar.e0.a(false, 0.0f);
        this.i0.e0.a(true, 0.3f);
        gm.d3(this.k0, 100L);
    }

    @Override // ui5
    public final void a(ey eyVar, vjb vjbVar) {
        String str;
        String str2;
        m66 m66Var;
        if (vjbVar == null || (str = vjbVar.b) == null) {
            return;
        }
        my0 my0Var = this.J;
        vu vuVar = null;
        if (my0Var != null) {
            my0Var.dismiss();
            this.J = null;
        }
        int lastIndexOf = str.lastIndexOf(35);
        boolean z = false;
        if (lastIndexOf != -1) {
            boolean isEmpty = TextUtils.isEmpty(eyVar.F.cached_page.url);
            TLRPC.WebPage webPage = eyVar.F;
            String lowerCase = !isEmpty ? webPage.cached_page.url.toLowerCase() : webPage.url.toLowerCase();
            try {
                str2 = URLDecoder.decode(str.substring(lastIndexOf + 1), "UTF-8");
            } catch (Exception unused) {
                str2 = "";
            }
            if (lastIndexOf == 0 || str.toLowerCase().contains(lowerCase)) {
                z = true;
                T(str2, true);
            }
        } else {
            str2 = null;
        }
        if (z) {
            return;
        }
        bx bxVar = this.d;
        if (bxVar != null && (m66Var = this.b) != null) {
            vuVar = new vu(this, bxVar, m66Var);
        }
        O(str, str2, vuVar);
    }

    public final void a0() {
        LaunchActivity launchActivity;
        FrameLayout frameLayout;
        if (!this.X || (launchActivity = LaunchActivity.H1) == null || launchActivity.isFinishing()) {
            return;
        }
        boolean e = this.v0[0].e();
        m[] mVarArr = this.v0;
        if (!e) {
            m mVar = mVarArr[0];
            TLRPC.WebPage webPage = mVar.c.F;
            frameLayout = mVar;
            if (webPage == null) {
                return;
            }
        } else if (mVarArr[0].getWebView() == null) {
            return;
        } else {
            frameLayout = this.v0[0].f;
        }
        new c41(frameLayout, null).G(R.raw.chats_infotip, 4, gm.N2(jb6.M0(2131752827, null), -1, 0, new ut(this, (byte) 10), null)).k(true);
    }

    @Override // ui5
    public final boolean b(ey eyVar, TL_iv.PageBlock pageBlock) {
        int indexOf;
        List list;
        org.telegram.ui.ActionBar.d dVar = this.N;
        if (dVar != null && dVar.getParentActivity() != null) {
            if (!(pageBlock instanceof TL_iv.pageBlockVideo) || dy.g(eyVar.F, pageBlock)) {
                ArrayList arrayList = new ArrayList(eyVar.f);
                indexOf = eyVar.f.indexOf(pageBlock);
                list = arrayList;
            } else {
                list = Collections.singletonList(pageBlock);
                indexOf = 0;
            }
            PhotoViewer r0 = PhotoViewer.r0();
            r0.T1(null, this.N, null);
            if (r0.m1(null, null, null, null, null, null, null, indexOf, new ex(this, list), null, 0L, 0L, 0L, true, new lx(this, eyVar.F, list), null)) {
                k();
                return true;
            }
        }
        return false;
    }

    public final void b0(boolean z) {
        this.r0.setVisibility(0);
        ValueAnimator valueAnimator = this.Z0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a1, z ? 1.0f : 0.0f);
        this.Z0 = ofFloat;
        ofFloat.addUpdateListener(new vt(this, (byte) 1));
        this.Z0.addListener(new y7((byte) 2, (Object) this, z));
        this.Z0.setDuration(320L);
        this.Z0.setInterpolator(d53.h);
        this.Z0.start();
    }

    public final void c0(int i, Object obj, boolean z) {
        if (obj != null) {
            if ((!(obj instanceof TLRPC.WebPage) || ((TLRPC.WebPage) obj).cached_page == null) && !(obj instanceof zw)) {
                return;
            }
            if (!z && i != 0) {
                m[] mVarArr = this.v0;
                m mVar = mVarArr[1];
                mVarArr[1] = mVarArr[0];
                mVarArr[0] = mVar;
                this.i0.i();
                this.b1.a(this.v0[0].getBackgroundColor(), true);
                this.c1.a(this.v0[1].getBackgroundColor(), true);
                sx sxVar = this.L;
                if (sxVar != null) {
                    sxVar.z();
                }
                int indexOfChild = this.h0.indexOfChild(this.v0[0]);
                int indexOfChild2 = this.h0.indexOfChild(this.v0[1]);
                if (i == 1) {
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
                int i2 = i == 1 ? 0 : 1;
                this.v0[i2].setBackgroundColor(this.L == null ? 0 : this.m0.getColor());
                this.v0[i2].setLayerType(2, null);
                if (i == 1) {
                    m mVar2 = this.v0[0];
                    Point point = gm.q;
                    mVar2.setTranslationX(point.x);
                    this.w0.playTogether(ObjectAnimator.ofFloat(this.v0[0], (Property<m, Float>) View.TRANSLATION_X, point.x, 0.0f));
                } else if (i == -1) {
                    this.v0[0].setTranslationX(0.0f);
                    this.w0.playTogether(ObjectAnimator.ofFloat(this.v0[1], (Property<m, Float>) View.TRANSLATION_X, 0.0f, gm.q.x));
                }
                this.w0.setDuration(320L);
                this.w0.setInterpolator(d53.h);
                this.w0.addListener(new c(this, i2));
                this.g0.f = true;
                wu wuVar = this.i0;
                m mVar3 = this.v0[0];
                wuVar.setMenuColors((mVar3 == null || !gda.s0) ? cmb.w0(null, cmb.Fl, false) : mVar3.getBackgroundColor());
                wu wuVar2 = this.i0;
                m mVar4 = this.v0[0];
                wuVar2.d((mVar4 == null || !gda.s0) ? cmb.w0(null, cmb.Fl, false) : mVar4.getActionBarColor(), true);
                wu wuVar3 = this.i0;
                m mVar5 = this.v0[0];
                wuVar3.setIsTonsite(mVar5 != null && mVar5.d());
                wu wuVar4 = this.i0;
                m mVar6 = this.v0[0];
                wuVar4.setIsLocal(mVar6 != null && mVar6.c());
                AnimatorSet animatorSet = this.w0;
                Objects.requireNonNull(animatorSet);
                gm.c3(new pu(animatorSet, (byte) 0));
            }
            if (!z) {
                this.Q0.e(true);
            }
            ey eyVar = this.v0[z ? 1 : 0].c;
            if (z) {
                obj = b10.f(2, this.e0);
            }
            this.v0[z ? 1 : 0].a();
            if (obj instanceof TLRPC.WebPage) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj;
                this.v0[z ? 1 : 0].setWeb(null);
                this.v0[z ? 1 : 0].setType(0);
                TL_iv.Page page = webPage.cached_page;
                eyVar.H = page.rtl;
                eyVar.F = webPage;
                int size = page.blocks.size();
                int i3 = 0;
                while (i3 < size) {
                    TL_iv.PageBlock pageBlock = webPage.cached_page.blocks.get(i3);
                    if (i3 == 0) {
                        pageBlock.first = true;
                        if (pageBlock instanceof TL_iv.pageBlockCover) {
                            TL_iv.pageBlockCover pageblockcover = (TL_iv.pageBlockCover) pageBlock;
                            TL_iv.RichText t = t(0, pageblockcover);
                            TL_iv.RichText t2 = t(1, pageblockcover);
                            if (((t != null && !(t instanceof TL_iv.textEmpty)) || (t2 != null && !(t2 instanceof TL_iv.textEmpty))) && size > 1) {
                                TL_iv.PageBlock pageBlock2 = webPage.cached_page.blocks.get(1);
                                if (pageBlock2 instanceof TL_iv.pageBlockChannel) {
                                    eyVar.G = (TL_iv.pageBlockChannel) pageBlock2;
                                }
                            }
                        }
                    } else if (i3 == 1 && eyVar.G != null) {
                        i3++;
                    }
                    eyVar.F(eyVar, pageBlock, 0, 0, i3 == size + (-1) ? i3 : 0);
                    i3++;
                }
                eyVar.f();
                if (this.e0.size() == 1 || i == -1) {
                    SharedPreferences sharedPreferences = org.telegram.messenger.a.b.getSharedPreferences("articles", 0);
                    String str = "article" + webPage.id;
                    int i4 = sharedPreferences.getInt(str, -1);
                    boolean z2 = sharedPreferences.getBoolean(str.concat("r"), true);
                    Point point2 = gm.q;
                    int i5 = z2 == (point2.x <= point2.y ? 0 : 1) ? sharedPreferences.getInt(str.concat("o"), 0) - this.v0[z ? 1 : 0].b.getPaddingTop() : gm.L(10.0f);
                    if (i4 != -1) {
                        this.v0[z ? 1 : 0].d.g1(i4, i5);
                    }
                } else {
                    u46 u46Var = this.v0[z ? 1 : 0].d;
                    sx sxVar2 = this.L;
                    u46Var.g1(sxVar2 == null ? 0 : 1, sxVar2 != null ? gm.L(32.0f) : 0);
                }
            } else if (obj instanceof zw) {
                this.v0[z ? 1 : 0].setType(1);
                this.v0[z ? 1 : 0].f();
                this.v0[z ? 1 : 0].setWeb((zw) obj);
            }
            if (!z) {
                j(null);
            }
            g0(false);
            d0();
        }
    }

    public final void d(int i, String str) {
        S();
        zw zwVar = new zw();
        zwVar.x = str;
        this.e0.add(zwVar);
        this.i0.h(false);
        c0(i, zwVar, false);
    }

    public final void d0() {
        m[] mVarArr;
        m mVar;
        if (this.i0 == null || (mVar = (mVarArr = this.v0)[0]) == null || mVarArr[1] == null) {
            return;
        }
        float translationX = mVar.getVisibility() != 0 ? 0.0f : 1.0f - (this.v0[0].getTranslationX() / this.v0[0].getWidth());
        float f = 1.0f - translationX;
        wu wuVar = this.i0;
        wuVar.d[0] = this.v0[0].getProgress();
        wuVar.invalidate();
        wu wuVar2 = this.i0;
        wuVar2.d[1] = this.v0[1].getProgress();
        wuVar2.invalidate();
        this.i0.setTransitionProgress(f);
        wu wuVar3 = this.i0;
        if (!wuVar3.a0 && !wuVar3.U) {
            ArticleViewer$WindowView articleViewer$WindowView = this.g0;
            if (articleViewer$WindowView.e || articleViewer$WindowView.f) {
                boolean G = G();
                ArrayList arrayList = this.e0;
                if (G || arrayList.size() > 1) {
                    float R1 = gm.R1((this.v0[0].s || arrayList.size() > 1) ? 1.0f : 0.0f, (this.v0[1].s || arrayList.size() > 2) ? 1.0f : 0.0f, f);
                    this.i0.N.c(false, 1.0f - R1);
                    this.i0.Q.c();
                    this.i0.setBackButtonCached(R1 > 0.5f);
                } else {
                    this.i0.Q.c();
                    this.i0.setBackButtonCached(false);
                }
                this.i0.setHasForward(this.v0[0].w);
                this.i0.setIsLocal(this.v0[0].c());
                this.i0.setIsLoaded(this.v0[0].getWebView() != null && this.v0[0].getWebView().b);
            }
        }
        wu wuVar4 = this.i0;
        int actionBarColor = this.v0[0].getActionBarColor();
        ArticleViewer$WindowView articleViewer$WindowView2 = this.g0;
        wuVar4.b(0, this.b1.a(actionBarColor, articleViewer$WindowView2.e || articleViewer$WindowView2.f));
        wu wuVar5 = this.i0;
        int actionBarColor2 = this.v0[1].getActionBarColor();
        ArticleViewer$WindowView articleViewer$WindowView3 = this.g0;
        wuVar5.b(1, this.c1.a(actionBarColor2, articleViewer$WindowView3.e || articleViewer$WindowView3.f));
        this.i0.d(on2.f(f, this.v0[0].getActionBarColor(), this.v0[1].getActionBarColor()), false);
        wu wuVar6 = this.i0;
        m[] mVarArr2 = this.v0;
        wuVar6.setMenuType((translationX > 0.5f ? mVarArr2[0] : mVarArr2[1]).a);
        sx sxVar = this.L;
        if (sxVar != null) {
            sxVar.c.invalidate();
            return;
        }
        ArticleViewer$WindowView articleViewer$WindowView4 = this.g0;
        if (articleViewer$WindowView4 != null) {
            articleViewer$WindowView4.invalidate();
        }
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        bv bvVar;
        k47 messageObject;
        if (i == nm7.h2) {
            if (this.v0 == null) {
                return;
            }
            int i3 = 0;
            while (true) {
                m[] mVarArr = this.v0;
                if (i3 >= mVarArr.length) {
                    return;
                }
                int childCount = mVarArr[i3].b.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = this.v0[i3].b.getChildAt(i4);
                    if (childAt instanceof bv) {
                        ((bv) childAt).a(true);
                    }
                }
                i3++;
            }
        } else if (i == nm7.f2 || i == nm7.g2) {
            if (this.v0 == null) {
                return;
            }
            int i5 = 0;
            while (true) {
                m[] mVarArr2 = this.v0;
                if (i5 >= mVarArr2.length) {
                    return;
                }
                int childCount2 = mVarArr2[i5].b.getChildCount();
                for (int i6 = 0; i6 < childCount2; i6++) {
                    View childAt2 = this.v0[i5].b.getChildAt(i6);
                    if (childAt2 instanceof bv) {
                        bv bvVar2 = (bv) childAt2;
                        if (bvVar2.getMessageObject() != null) {
                            bvVar2.a(true);
                        }
                    }
                }
                i5++;
            }
        } else if (i == nm7.e2) {
            Integer num = (Integer) objArr[0];
            if (this.v0 == null) {
                return;
            }
            int i7 = 0;
            while (true) {
                m[] mVarArr3 = this.v0;
                if (i7 >= mVarArr3.length) {
                    return;
                }
                int childCount3 = mVarArr3[i7].b.getChildCount();
                int i8 = 0;
                while (true) {
                    if (i8 < childCount3) {
                        View childAt3 = this.v0[i7].b.getChildAt(i8);
                        if ((childAt3 instanceof bv) && (messageObject = (bvVar = (bv) childAt3).getMessageObject()) != null && messageObject.e1() == num.intValue()) {
                            k47 k47Var = MediaController.w().v0;
                            if (k47Var != null) {
                                messageObject.b0 = k47Var.b0;
                                messageObject.i0 = k47Var.i0;
                                messageObject.j0 = k47Var.j0;
                                bvVar.b();
                            }
                        } else {
                            i8++;
                        }
                    }
                }
                i7++;
            }
        } else {
            if (i != nm7.m4 || this.v0 == null) {
                return;
            }
            int i9 = 0;
            while (true) {
                m[] mVarArr4 = this.v0;
                if (i9 >= mVarArr4.length) {
                    return;
                }
                int childCount4 = mVarArr4[i9].b.getChildCount();
                for (int i10 = 0; i10 < childCount4; i10++) {
                    View childAt4 = this.v0[i9].b.getChildAt(i10);
                    if (childAt4 instanceof uw) {
                        ((uw) childAt4).e.invalidate();
                    } else {
                        childAt4.invalidate();
                    }
                }
                i9++;
            }
        }
    }

    public final boolean e(TLRPC.WebPage webPage, String str, int i) {
        S();
        this.e0.add(webPage);
        this.i0.h(false);
        c0(i, webPage, false);
        return T(str, false);
    }

    public final void f0() {
        int i;
        int size;
        if (this.v0[0].e()) {
            i = this.v0[0].getWebView() == null ? 0 : this.v0[0].getWebView().getSearchIndex();
            size = this.v0[0].getWebView() == null ? 0 : this.v0[0].getWebView().getSearchCount();
        } else {
            i = this.H;
            size = this.F.size();
        }
        this.s0.setEnabled(size > 0 && i != 0);
        this.t0.setEnabled(size > 0 && i != size + (-1));
        ImageView imageView = this.s0;
        imageView.setAlpha(imageView.isEnabled() ? 1.0f : 0.5f);
        ImageView imageView2 = this.t0;
        imageView2.setAlpha(imageView2.isEnabled() ? 1.0f : 0.5f);
        this.u0.a();
        if (size < 0) {
            this.u0.setText("");
            return;
        }
        io ioVar = this.u0;
        if (size == 0) {
            ioVar.setText(jb6.M0(2131747901, null));
        } else if (size == 1) {
            ioVar.setText(jb6.M0(2131747560, null));
        } else {
            ioVar.setText(String.format(jb6.J0(size, "CountOfResults"), Integer.valueOf(i + 1), Integer.valueOf(size)));
        }
    }

    public final void g0(boolean z) {
        boolean z2 = false;
        this.i0.g(0, this.v0[0].getTitle(), z);
        this.i0.f(0, this.v0[0].getSubtitle());
        this.i0.e(0, this.v0[0].e() && this.v0[0].getWebView() != null && this.v0[0].getWebView().F);
        this.i0.g(1, this.v0[1].getTitle(), z);
        this.i0.f(1, this.v0[1].getSubtitle());
        wu wuVar = this.i0;
        if (this.v0[1].e() && this.v0[1].getWebView() != null && this.v0[1].getWebView().F) {
            z2 = true;
        }
        wuVar.e(1, z2);
    }

    public final void h() {
        this.L0 = false;
        ax axVar = this.M0;
        if (axVar != null) {
            this.g0.removeCallbacks(axVar);
            this.M0 = null;
        }
        ax axVar2 = this.N0;
        if (axVar2 != null) {
            this.g0.removeCallbacks(axVar2);
            this.N0 = null;
        }
    }

    public final void j(eu euVar) {
        if (this.K0 == gm.L(56.0f)) {
            if (euVar != null) {
                euVar.run();
                return;
            }
            return;
        }
        ValueAnimator duration = ValueAnimator.ofObject(new IntEvaluator(), Integer.valueOf(this.K0), Integer.valueOf(gm.L(56.0f))).setDuration(180L);
        duration.setInterpolator(new DecelerateInterpolator());
        duration.addUpdateListener(new vt(this, (byte) 0));
        duration.addListener(new g0(euVar, (byte) 13));
        if (euVar != null) {
            duration.setDuration(duration.getDuration() / 2);
        }
        duration.start();
    }

    public final void k() {
        xw xwVar;
        hx hxVar = this.v0[0].b;
        if (hxVar == null || !this.X) {
            return;
        }
        float measuredHeight = hxVar.getMeasuredHeight() / 2.0f;
        float f = 0.0f;
        xw xwVar2 = null;
        for (int i = 0; i < hxVar.getChildCount(); i++) {
            View childAt = hxVar.getChildAt(i);
            if (childAt instanceof xw) {
                float measuredHeight2 = (childAt.getMeasuredHeight() / 2.0f) + childAt.getTop();
                if (xwVar2 == null || Math.abs(measuredHeight - measuredHeight2) < Math.abs(measuredHeight - f)) {
                    xwVar2 = (xw) childAt;
                    f = measuredHeight2;
                }
            }
        }
        boolean z = PhotoViewer.r0().f;
        if (z || ((xwVar = this.y) != null && xwVar != xwVar2 && this.x != null)) {
            VideoPlayerHolderBase videoPlayerHolderBase = this.x;
            if (videoPlayerHolderBase != null) {
                xw xwVar3 = this.y;
                long j = xwVar3.M.video_id;
                yw a = yw.a(videoPlayerHolderBase, xwVar3);
                xwVar3.c(a);
                this.E.k(a, j);
                xw xwVar4 = this.y;
                yw ywVar = xwVar4.N;
                if (ywVar != null) {
                    Bitmap bitmap = ywVar.b;
                    if (bitmap != null) {
                        xwVar4.e.f0(bitmap);
                    }
                    this.y.e(false);
                }
                this.x.release(null);
            }
            this.x = null;
            this.y = null;
        }
        if (z || xwVar2 == null) {
            return;
        }
        int i2 = xw.W;
        ui5 ui5Var = xwVar2.a;
        if (xwVar2.P != null && ui5Var.x == null) {
            ui5Var.x = new ww(xwVar2).with(xwVar2.n);
            TLRPC.Document document = xwVar2.P;
            for (int i3 = 0; i3 < document.attributes.size(); i3++) {
                if (document.attributes.get(i3) instanceof TLRPC.TL_documentAttributeVideo) {
                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i3);
                    xwVar2.h.a(tL_documentAttributeVideo.w / tL_documentAttributeVideo.h, 0);
                }
            }
            TLRPC.WebPage webPage = xwVar2.b.F;
            Uri j2 = webPage != null ? kd4.j(((o) ui5Var).Y, webPage, document) : null;
            if (j2 != null) {
                VideoPlayerHolderBase videoPlayerHolderBase2 = ui5Var.x;
                yw ywVar2 = xwVar2.N;
                videoPlayerHolderBase2.seekTo(ywVar2 == null ? 0L : ywVar2.a);
                ui5Var.x.preparePlayer(j2, true, 1.0f);
                ui5Var.x.play();
            }
        }
        this.y = xwVar2;
    }

    public final void l(boolean z, boolean z2) {
        if (this.M == null || this.V0 || !this.W) {
            return;
        }
        int i = 0;
        if (this.a0 != 0 && Math.abs(this.c0 - System.currentTimeMillis()) >= 500) {
            Runnable runnable = this.b0;
            if (runnable != null) {
                runnable.run();
                this.b0 = null;
            }
            this.a0 = (byte) 0;
        }
        if (this.a0 != 0) {
            return;
        }
        sx sxVar = this.L;
        if (sxVar != null) {
            sxVar.a(false);
            return;
        }
        if (this.Q.getVisibility() == 0) {
            if (this.P != null) {
                this.Q.setVisibility(4);
                this.T.onCustomViewHidden();
                this.Q.removeView(this.P);
                this.P = null;
            } else {
                tvc tvcVar = this.G0;
                if (tvcVar != null && tvcVar.U) {
                    tvcVar.U = false;
                    tvcVar.m();
                    tvcVar.l(false);
                }
            }
            if (!z2) {
                return;
            }
        }
        if (this.Q0.w()) {
            this.Q0.e(false);
            return;
        }
        wu wuVar = this.i0;
        if (wuVar.U) {
            wuVar.h(false);
            return;
        }
        if (wuVar.a0) {
            wuVar.k(false);
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
        if (z && !z2) {
            ArrayList arrayList = this.e0;
            if (arrayList.size() >= 2) {
                Object m = td4.m(1, arrayList);
                if (m instanceof zw) {
                    ((zw) m).a();
                }
                if (m instanceof TLRPC.WebPage) {
                    dvc.o((TLRPC.WebPage) m);
                }
                c0(-1, arrayList.get(arrayList.size() - 1), false);
                return;
            }
        }
        nm7.f(this.Y).n(this, nm7.e2);
        nm7.f(this.Y).n(this, nm7.f2);
        nm7.f(this.Y).n(this, nm7.g2);
        nm7.f(this.Y).n(this, nm7.h2);
        nm7.f(this.Y).n(this, nm7.m4);
        a26 a26Var = this.W0;
        if (a26Var != null) {
            a26Var.a();
            this.W0 = null;
        }
        this.N = null;
        try {
            my0 my0Var = this.l0;
            if (my0Var != null) {
                my0Var.dismiss();
                this.l0 = null;
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArticleViewer$WindowView articleViewer$WindowView = this.g0;
        Property property = View.ALPHA;
        animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, (Property<ArticleViewer$WindowView, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.h0, (Property<a, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.g0, (Property<ArticleViewer$WindowView, Float>) View.TRANSLATION_X, 0.0f, gm.L(56.0f)));
        this.a0 = (byte) 2;
        this.b0 = new ut(this, (byte) 9);
        animatorSet.setDuration(150L);
        animatorSet.setInterpolator(this.d0);
        animatorSet.addListener(new g0(this, (byte) 14));
        this.c0 = System.currentTimeMillis();
        this.h0.setLayerType(2, null);
        animatorSet.start();
        while (true) {
            vh6 vh6Var = this.E;
            if (i >= vh6Var.m()) {
                vh6Var.b();
                return;
            }
            yw ywVar = (yw) vh6Var.n(i);
            Bitmap bitmap = ywVar.b;
            if (bitmap != null) {
                bitmap.recycle();
                ywVar.b = null;
            }
            i++;
        }
    }

    public final void p() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.e0;
            if (i >= arrayList.size()) {
                arrayList.clear();
                q();
                return;
            }
            Object obj = arrayList.get(i);
            if (obj instanceof zw) {
                m mVar = this.v0[0];
                if (mVar != null && mVar.L == obj) {
                    ((zw) obj).c(mVar);
                }
                m mVar2 = this.v0[1];
                if (mVar2 != null && mVar2.L == obj) {
                    ((zw) obj).c(mVar2);
                }
                ((zw) obj).a();
            } else if (obj instanceof TLRPC.WebPage) {
                dvc.o((TLRPC.WebPage) obj);
            }
            i++;
        }
    }

    public final void q() {
        ArticleViewer$WindowView articleViewer$WindowView;
        ArrayList arrayList;
        if (this.M == null || (articleViewer$WindowView = this.g0) == null) {
            return;
        }
        if (this.L == null) {
            try {
                if (articleViewer$WindowView.getParent() != null) {
                    ((WindowManager) this.M.getSystemService("window")).removeViewImmediate(this.g0);
                }
                this.g0 = null;
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        int i = 0;
        while (true) {
            int size = this.O.size();
            arrayList = this.O;
            if (i >= size) {
                break;
            }
            ((j) arrayList.get(i)).a(true);
            i++;
        }
        arrayList.clear();
        try {
            this.M.getWindow().clearFlags(128);
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
        this.M = null;
        this.N = null;
        e1 = null;
    }

    public o() {
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
        this.T0 = new po(new int[]{nm7.r, nm7.s});
        this.U0 = new yd[2];
        this.Y0 = -1;
        ut utVar = new ut(this, (byte) 2);
        d53 d53Var = d53.h;
        this.b1 = new km(utVar, 320L, d53Var);
        this.c1 = new km(new ut(this, (byte) 3), 320L, d53Var);
        this.K = false;
        this.L = null;
    }
}
