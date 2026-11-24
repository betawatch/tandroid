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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class o extends vg5 implements gk7 {
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
    public stc F0;
    public stc G0;
    public int H0;
    public int I0;
    public int J0;
    public final boolean K;
    public int K0;
    public final sw L;
    public boolean L0;
    public Activity M;
    public aw M0;
    public org.telegram.ui.ActionBar.d N;
    public aw N0;
    public final ArrayList O;
    public vt O0;
    public View P;
    public int P0;
    public FrameLayout Q;
    public fib Q0;
    public TextureView R;
    public fib R0;
    public ix S;
    public ma8 S0;
    public WebChromeClient.CustomViewCallback T;
    public final on T0;
    public WindowInsets U;
    public final yc[] U0;
    public boolean V;
    public boolean V0;
    public boolean W;
    public a06 W0;
    public boolean X;
    public va7 X0;
    public int Y;
    public int Y0;
    public int Z;
    public ValueAnimator Z0;
    public byte a0;
    public float a1;
    public Runnable b0;
    public final kl b1;
    public long c0;
    public final kl c1;
    public final DecelerateInterpolator d0;
    public final ArrayList e0;
    public WindowManager.LayoutParams f0;
    public ArticleViewer$WindowView g0;
    public a h0;
    public wt i0;
    public eb j0;
    public ts k0;
    public fx0 l0;
    public Paint m0;
    public Drawable n0;
    public Paint o0;
    public boolean p0;
    public float q0;
    public a6 r0;
    public ImageView s0;
    public ImageView t0;
    public hn u0;
    public m[] v0;
    public AnimatorSet w0;
    public final Paint x0;
    public final Paint y0;
    public final Paint z0;
    public static final HashSet d1 = new HashSet();
    public static volatile o e1 = null;
    public static final b f1 = new b("innerTranslationX", (byte) 0);
    public static final TextPaint g1 = new TextPaint(1);
    public static final nw h1 = new nw();
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
        this.T0 = new on(new int[]{kk7.r, kk7.s});
        this.U0 = new yc[2];
        this.Y0 = -1;
        ts tsVar = new ts(this, (byte) 2);
        s33 s33Var = s33.h;
        this.b1 = new kl(tsVar, 320L, s33Var);
        this.c1 = new kl(new ts(this, (byte) 3), 320L, s33Var);
        this.K = true;
        this.L = new sw(this, dVar);
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
    public static TextPaint B(vg5 vg5Var, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock) {
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
        int L8 = gl.L(14.0f);
        ((o) vg5Var).getClass();
        nw nwVar = h1;
        nwVar.getClass();
        SparseArray sparseArray2 = nwVar.x;
        SparseArray sparseArray3 = nwVar.w;
        SparseArray sparseArray4 = nwVar.t;
        SparseArray sparseArray5 = nwVar.c;
        SparseArray sparseArray6 = nwVar.b;
        int L9 = gl.L(gba.W0 - 16);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            TL_iv.RichText richText3 = ((TL_iv.pageBlockPhoto) pageBlock).caption.text;
            if (richText3 == richText2 || richText3 == richText) {
                L7 = gl.L(14.0f);
                sparseArray5 = sparseArray6;
            } else {
                L7 = gl.L(12.0f);
            }
            L8 = L7;
            w0 = bkb.w0(null, bkb.x6, false);
        } else if (pageBlock instanceof TL_iv.pageBlockMap) {
            TL_iv.RichText richText4 = ((TL_iv.pageBlockMap) pageBlock).caption.text;
            if (richText4 == richText2 || richText4 == richText) {
                L6 = gl.L(14.0f);
                sparseArray5 = sparseArray6;
            } else {
                L6 = gl.L(12.0f);
            }
            L8 = L6;
            w0 = bkb.w0(null, bkb.x6, false);
        } else {
            if (pageBlock instanceof TL_iv.pageBlockTitle) {
                sparseArray = nwVar.d;
                L8 = gl.L(23.0f);
                i2 = bkb.w0(null, bkb.F6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockKicker) {
                sparseArray = nwVar.e;
                L8 = gl.L(14.0f);
                i2 = bkb.w0(null, bkb.F6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockAuthorDate) {
                sparseArray = nwVar.o;
                L8 = gl.L(14.0f);
                i2 = bkb.w0(null, bkb.x6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockFooter) {
                sparseArray = nwVar.p;
                L8 = gl.L(14.0f);
                i2 = bkb.w0(null, bkb.x6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockSubtitle) {
                sparseArray = nwVar.g;
                L8 = gl.L(20.0f);
                i2 = bkb.w0(null, bkb.F6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
                sparseArray = nwVar.f;
                L8 = gl.L(20.0f);
                i2 = bkb.w0(null, bkb.F6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
                sparseArray = nwVar.h;
                L8 = gl.L(17.0f);
                i2 = bkb.w0(null, bkb.F6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockHeading1) {
                sparseArray = nwVar.i;
                L8 = gl.L(18.0f);
                i2 = bkb.w0(null, bkb.F6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockHeading2) {
                sparseArray = nwVar.j;
                L8 = gl.L(16.0f);
                i2 = bkb.w0(null, bkb.F6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockHeading3) {
                sparseArray = nwVar.k;
                L8 = gl.L(15.0f);
                i2 = bkb.w0(null, bkb.F6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockHeading4) {
                sparseArray = nwVar.l;
                L8 = gl.L(14.0f);
                i2 = bkb.w0(null, bkb.F6, false);
            } else if (pageBlock instanceof TL_iv.pageBlockHeading5) {
                sparseArray = nwVar.m;
                L8 = gl.L(13.0f);
                i2 = bkb.w0(null, bkb.F6, false);
            } else {
                if (!(pageBlock instanceof TL_iv.pageBlockHeading6)) {
                    if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
                        if (pageblockblockquote.text == richText) {
                            L8 = gl.L(15.0f);
                            i3 = bkb.w0(null, bkb.F6, false);
                        } else if (pageblockblockquote.caption == richText) {
                            L8 = gl.L(14.0f);
                            i3 = bkb.w0(null, bkb.x6, false);
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
                            L8 = gl.L(15.0f);
                            i3 = bkb.w0(null, bkb.F6, false);
                        } else if (pageblockpullquote.caption == richText) {
                            L8 = gl.L(14.0f);
                            i3 = bkb.w0(null, bkb.x6, false);
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
                            i5 = xi6.o(pageblockpreformatted.text).length();
                            pageblockpreformatted.codeLength = i5;
                        }
                        int i6 = i5 > 500 ? 3 : i5 > 220 ? 2 : i5 > 80 ? 1 : 0;
                        SparseArray sparseArray7 = nwVar.s;
                        L8 = gl.L(14 - i6);
                        A |= 4;
                        i = i6 << 16;
                        sparseArray5 = sparseArray7;
                        i2 = bkb.w0(null, bkb.F6, false);
                    } else if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                        sparseArray = nwVar.q;
                        L8 = gl.L(16.0f);
                        i2 = bkb.w0(null, bkb.F6, false);
                    } else if (I(pageBlock)) {
                        sparseArray = nwVar.r;
                        L8 = gl.L(16.0f);
                        i2 = bkb.w0(null, bkb.F6, false);
                    } else if (pageBlock instanceof TL_iv.pageBlockEmbed) {
                        TL_iv.RichText richText5 = ((TL_iv.pageBlockEmbed) pageBlock).caption.text;
                        if (richText5 == richText2 || richText5 == richText) {
                            L5 = gl.L(14.0f);
                            sparseArray5 = sparseArray6;
                        } else {
                            L5 = gl.L(12.0f);
                        }
                        L8 = L5;
                        w0 = bkb.w0(null, bkb.x6, false);
                    } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                        TL_iv.RichText richText6 = ((TL_iv.pageBlockSlideshow) pageBlock).caption.text;
                        if (richText6 == richText2 || richText6 == richText) {
                            L4 = gl.L(14.0f);
                            sparseArray5 = sparseArray6;
                        } else {
                            L4 = gl.L(12.0f);
                        }
                        L8 = L4;
                        w0 = bkb.w0(null, bkb.x6, false);
                    } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
                        TL_iv.RichText richText7 = ((TL_iv.pageBlockCollage) pageBlock).caption.text;
                        if (richText7 == richText2 || richText7 == richText) {
                            L3 = gl.L(14.0f);
                            sparseArray5 = sparseArray6;
                        } else {
                            L3 = gl.L(12.0f);
                        }
                        L8 = L3;
                        w0 = bkb.w0(null, bkb.x6, false);
                    } else if (pageBlock instanceof TL_iv.pageBlockEmbedPost) {
                        TL_iv.PageCaption pageCaption = ((TL_iv.pageBlockEmbedPost) pageBlock).caption;
                        if (richText2 == pageCaption.text) {
                            L8 = gl.L(14.0f);
                            w0 = bkb.w0(null, bkb.x6, false);
                            sparseArray5 = sparseArray6;
                        } else if (richText2 == pageCaption.credit) {
                            L8 = gl.L(12.0f);
                            w0 = bkb.w0(null, bkb.x6, false);
                        } else if (richText2 != null) {
                            sparseArray5 = nwVar.u;
                            L8 = gl.L(14.0f);
                            w0 = bkb.w0(null, bkb.F6, false);
                        } else {
                            w0 = -65536;
                            sparseArray5 = null;
                        }
                    } else {
                        if (pageBlock instanceof TL_iv.pageBlockVideo) {
                            if (richText2 == ((TL_iv.pageBlockVideo) pageBlock).caption.text) {
                                L2 = gl.L(14.0f);
                                sparseArray2 = sparseArray3;
                            } else {
                                L2 = gl.L(12.0f);
                            }
                            L8 = L2;
                            w02 = bkb.w0(null, bkb.F6, false);
                        } else if (pageBlock instanceof TL_iv.pageBlockAudio) {
                            if (richText2 == ((TL_iv.pageBlockAudio) pageBlock).caption.text) {
                                L = gl.L(14.0f);
                                sparseArray2 = sparseArray3;
                            } else {
                                L = gl.L(12.0f);
                            }
                            L8 = L;
                            w02 = bkb.w0(null, bkb.F6, false);
                        } else if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                            sparseArray = nwVar.y;
                            L8 = gl.L(15.0f);
                            i2 = bkb.w0(null, bkb.x6, false);
                        } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                            sparseArray = nwVar.z;
                            L8 = gl.L(15.0f);
                            i2 = bkb.w0(null, bkb.F6, false);
                        } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                            sparseArray5 = nwVar.A;
                            L8 = gl.L(15.0f);
                            w0 = bkb.w0(null, bkb.F6, false);
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
                        L8 -= gl.L(4.0f);
                    }
                    if (sparseArray5 == null) {
                        if (nwVar.a == null) {
                            TextPaint textPaint = new TextPaint(1);
                            nwVar.a = textPaint;
                            textPaint.setColor(-65536);
                        }
                        nwVar.a.setTextSize(gl.L(14.0f));
                        return nwVar.a;
                    }
                    int i7 = i | A;
                    TextPaint textPaint2 = (TextPaint) sparseArray5.get(i7);
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint(1);
                        if ((A & 4) != 0) {
                            textPaint2.setTypeface(gl.n1("fonts/rmono.ttf"));
                        } else if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                            textPaint2.setTypeface(gl.o());
                        } else if (vg5Var.a == 1 || (pageBlock instanceof TL_iv.pageBlockTitle) || (pageBlock instanceof TL_iv.pageBlockKicker) || (pageBlock instanceof TL_iv.pageBlockHeader) || (pageBlock instanceof TL_iv.pageBlockSubtitle) || (pageBlock instanceof TL_iv.pageBlockSubheader) || H(pageBlock)) {
                            if ((pageBlock instanceof TL_iv.pageBlockTitle) || (pageBlock instanceof TL_iv.pageBlockHeader) || (pageBlock instanceof TL_iv.pageBlockSubtitle) || (pageBlock instanceof TL_iv.pageBlockSubheader) || H(pageBlock)) {
                                textPaint2.setTypeface(gl.n1("fonts/mw_bold.ttf"));
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
                                textPaint2.setTypeface(gl.n1("fonts/rmediumitalic.ttf"));
                            } else {
                                textPaint2.setTypeface(gl.n1("fonts/rmedium.ttf"));
                            }
                        } else if ((A & 2) != 0) {
                            textPaint2.setTypeface(gl.n1("fonts/ritalic.ttf"));
                        }
                        if ((A & 32) != 0) {
                            textPaint2.setFlags(textPaint2.getFlags() | 16);
                        }
                        if ((A & 16) != 0) {
                            textPaint2.setFlags(textPaint2.getFlags() | 8);
                        }
                        if ((A & 8) != 0 || (A & 512) != 0) {
                            textPaint2.setFlags(textPaint2.getFlags());
                            i2 = bkb.w0(null, bkb.I6, false);
                        }
                        if (i4 != 0) {
                            textPaint2.baselineShift -= gl.L(6.0f);
                        } else if ((A & 128) != 0) {
                            textPaint2.baselineShift = gl.L(2.0f) + textPaint2.baselineShift;
                        }
                        textPaint2.setColor(i2);
                        sparseArray5.put(i7, textPaint2);
                    }
                    textPaint2.setTextSize(L8 + L9);
                    return textPaint2;
                }
                sparseArray = nwVar.n;
                L8 = gl.L(12.0f);
                i2 = bkb.w0(null, bkb.F6, false);
            }
            sparseArray5 = sparseArray;
            i = 0;
            i4 = A & 256;
            if (i4 == 0) {
            }
            L8 -= gl.L(4.0f);
            if (sparseArray5 == null) {
            }
        }
        i2 = w0;
        i = 0;
        i4 = A & 256;
        if (i4 == 0) {
        }
        L8 -= gl.L(4.0f);
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
        return (pageBlock instanceof vw) || (pageBlock instanceof xw);
    }

    public static /* synthetic */ WindowInsets J(WindowInsets windowInsets) {
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public static boolean M(tw twVar) {
        boolean z;
        TL_iv.PageBlock w = w(twVar.a);
        if (w instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) w;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                return true;
            }
        } else if (w instanceof tw) {
            tw twVar2 = (tw) w;
            TL_iv.PageBlock w2 = w(twVar2.b);
            if (w2 instanceof TL_iv.pageBlockDetails) {
                TL_iv.pageBlockDetails pageblockdetails2 = (TL_iv.pageBlockDetails) w2;
                if (!pageblockdetails2.open) {
                    pageblockdetails2.open = true;
                    z = true;
                    if (!M(twVar2) || z) {
                        return true;
                    }
                }
            }
            z = false;
            if (!M(twVar2)) {
            }
            return true;
        }
        return false;
    }

    public static void R(vg5 vg5Var) {
        if (vg5Var.b == null && vg5Var.f == null) {
            return;
        }
        View view = vg5Var.f;
        vg5Var.c.e(true);
        vg5Var.b = null;
        vg5Var.d = null;
        vg5Var.f = null;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void c(String str, int i, FrameLayout frameLayout, sw swVar, wjb wjbVar) {
        String r = hv0.r(str);
        long e = y6c.h(i).e();
        z3a.B(i).q0(x3a.a(e, r));
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
        kk7.f(i).k(kk7.G1, new k27(i, tL_message, false, false));
        new u21(frameLayout, wjbVar).Q(R.raw.saved_messages, 36, gl.O2(k96.M0(2131742677, null), -1, 0, new et((Object) swVar, e, (byte) 0), null)).k(true);
    }

    public static void e0(vg5 vg5Var) {
        TextPaint textPaint = o1;
        if (textPaint != null) {
            textPaint.setColor(bkb.w0(null, bkb.F6, false));
        }
        TextPaint textPaint2 = p1;
        if (textPaint2 != null) {
            textPaint2.setColor(bkb.w0(null, bkb.F6, false));
        }
        TextPaint textPaint3 = i1;
        if (textPaint3 != null) {
            textPaint3.setColor(bkb.w0(null, bkb.F6, false));
        }
        TextPaint textPaint4 = k1;
        if (textPaint4 != null) {
            textPaint4.setColor(bkb.w0(null, bkb.F6, false));
        }
        TextPaint textPaint5 = l1;
        if (textPaint5 != null) {
            textPaint5.setColor(-1);
        }
        TextPaint textPaint6 = m1;
        if (textPaint6 != null) {
            textPaint6.setColor(bkb.w0(null, bkb.F6, false));
        }
        TextPaint textPaint7 = n1;
        if (textPaint7 != null) {
            textPaint7.setColor(bkb.w0(null, bkb.x6, false));
        }
        TextPaint textPaint8 = j1;
        if (textPaint8 != null) {
            textPaint8.setColor(bkb.w0(null, bkb.x6, false));
        }
        o(vg5Var, true);
        nw nwVar = h1;
        nw.a(vg5Var, nwVar.d);
        nw.a(vg5Var, nwVar.e);
        nw.a(vg5Var, nwVar.g);
        nw.a(vg5Var, nwVar.f);
        nw.a(vg5Var, nwVar.h);
        nw.a(vg5Var, nwVar.i);
        nw.a(vg5Var, nwVar.j);
        nw.a(vg5Var, nwVar.k);
        nw.a(vg5Var, nwVar.l);
        nw.a(vg5Var, nwVar.m);
        nw.a(vg5Var, nwVar.n);
        nw.a(vg5Var, nwVar.t);
        nw.a(vg5Var, nwVar.s);
        nw.a(vg5Var, nwVar.q);
        nw.a(vg5Var, nwVar.r);
        nw.a(vg5Var, nwVar.u);
        nw.a(vg5Var, nwVar.w);
        nw.a(vg5Var, nwVar.x);
        nw.a(vg5Var, nwVar.b);
        nw.a(vg5Var, nwVar.c);
        nw.a(vg5Var, nwVar.o);
        nw.a(vg5Var, nwVar.p);
        nw.a(vg5Var, nwVar.v);
        nw.a(vg5Var, nwVar.y);
        nw.a(vg5Var, nwVar.z);
        nw.a(vg5Var, nwVar.A);
    }

    public static SpannableStringBuilder f(int i, CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (charSequence != null) {
            spannableStringBuilder.append(charSequence);
        }
        if (spannableStringBuilder.length() > 0) {
            spannableStringBuilder.append((CharSequence) ", ");
        }
        spannableStringBuilder.append((CharSequence) k96.M0(i, null));
        return spannableStringBuilder;
    }

    public static CharSequence g(vg5 vg5Var, dx dxVar, bw bwVar) {
        StaticLayout staticLayout;
        if (bwVar == null || (staticLayout = bwVar.d) == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = bwVar.E;
        if (spannableStringBuilder != null) {
            return spannableStringBuilder;
        }
        CharSequence text = staticLayout.getText();
        if (!(text instanceof Spannable)) {
            return text;
        }
        Spannable spannable = (Spannable) text;
        thb[] thbVarArr = (thb[]) spannable.getSpans(0, spannable.length(), thb.class);
        CharSequence charSequence = text;
        if (thbVarArr != null) {
            charSequence = text;
            if (thbVarArr.length != 0) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannable);
                for (thb thbVar : thbVarArr) {
                    int spanStart = spannableStringBuilder2.getSpanStart(thbVar);
                    int spanEnd = spannableStringBuilder2.getSpanEnd(thbVar);
                    if (spanStart >= 0 && spanEnd > spanStart) {
                        spannableStringBuilder2.setSpan(new tk(vg5Var, dxVar, thbVar, (byte) 1), spanStart, spanEnd, 33);
                    }
                }
                bwVar.E = spannableStringBuilder2;
                charSequence = spannableStringBuilder2;
            }
        }
        return charSequence;
    }

    public static TL_iv.PageBlock h0(TL_iv.PageBlock pageBlock, tw twVar) {
        if (pageBlock instanceof vw) {
            vw vwVar = (vw) pageBlock;
            vw vwVar2 = new vw();
            vwVar2.a = vwVar.a;
            vwVar2.b = vwVar.b;
            vwVar2.c = vwVar.c;
            vwVar2.d = h0(vwVar.d, twVar);
            return vwVar2;
        }
        if (!(pageBlock instanceof xw)) {
            return twVar;
        }
        xw xwVar = (xw) pageBlock;
        xw xwVar2 = new xw();
        xwVar2.a = xwVar.a;
        xwVar2.b = xwVar.b;
        xwVar2.c = xwVar.c;
        xwVar2.d = h0(xwVar.d, twVar);
        return xwVar2;
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
        r8 = ((qla) r8).getBounds();
        r17.addRect(r8.left, r8.top, r8.right, r8.bottom, android.graphics.Path.Direction.CW);
        r17 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b2, code lost:
    
        r17.computeBounds(new android.graphics.RectF(), false);
        r0 = (float) java.lang.Math.sqrt((r0.height() * r0.height()) + (r0.width() * r0.width()));
        ((qla) r29.J.get(0)).q = new mt(r28, r29);
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
        ((qla) r8).j(r6, r4, r0, false);
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
    public static boolean i(vg5 vg5Var, dx dxVar, MotionEvent motionEvent, View view, bw bwVar, int i, int i2) {
        fib fibVar;
        o oVar;
        Object obj;
        o oVar2;
        byte b;
        fib fibVar2;
        wib[] wibVarArr;
        boolean z = ((o) vg5Var).w0 == null;
        i46 i46Var = vg5Var.c;
        if (!z || view == null) {
            return false;
        }
        o oVar3 = (o) vg5Var;
        if (view.getTag() == null || view.getTag() != "bottomSheet" || (fibVar = oVar3.R0) == null) {
            fibVar = oVar3.Q0;
        }
        if (fibVar != null && !fibVar.e0(view)) {
            return false;
        }
        vg5Var.f = view;
        if (bwVar != null) {
            StaticLayout staticLayout = bwVar.d;
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
                    vg5Var.d = bwVar;
                    vg5Var.e = i2;
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
                                thb[] thbVarArr = (thb[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, thb.class);
                                if (thbVarArr == null || thbVarArr.length <= 0) {
                                    oVar = oVar3;
                                    obj = "bottomSheet";
                                } else {
                                    thb thbVar = thbVarArr[0];
                                    int spanStart = spannable.getSpanStart(thbVar);
                                    oVar = oVar3;
                                    obj = "bottomSheet";
                                    int spanEnd = spannable.getSpanEnd(thbVar);
                                    int i6 = 1;
                                    while (i6 < thbVarArr.length) {
                                        try {
                                            thb thbVar2 = thbVarArr[i6];
                                            thb[] thbVarArr2 = thbVarArr;
                                            int spanStart2 = spannable.getSpanStart(thbVar2);
                                            int i7 = i6;
                                            int spanEnd2 = spannable.getSpanEnd(thbVar2);
                                            if (spanStart > spanStart2 || spanEnd2 > spanEnd) {
                                                spanStart = spanStart2;
                                                thbVar = thbVar2;
                                                spanEnd = spanEnd2;
                                            }
                                            i6 = i7 + 1;
                                            thbVarArr = thbVarArr2;
                                        } catch (Exception e) {
                                            e = e;
                                            fa4.g(e, true);
                                            if (motionEvent.getAction() == 0) {
                                            }
                                            b = 1;
                                            if (motionEvent.getAction() != 0) {
                                            }
                                            if (view instanceof ou) {
                                            }
                                        }
                                    }
                                    m46 m46Var = vg5Var.b;
                                    if (m46Var != null) {
                                        if (m46Var.i != thbVar) {
                                            i46Var.l(m46Var, true);
                                        }
                                    }
                                    m46 m46Var2 = new m46(thbVar, null, f3, y, 0);
                                    vg5Var.b = m46Var2;
                                    m46Var2.d(bkb.w0(null, bkb.J6, false) & 872415231);
                                    i46Var.a(vg5Var.b, vg5Var.d);
                                    try {
                                        b46 b2 = vg5Var.b.b();
                                        b2.d(staticLayout, spanStart, 0.0f);
                                        TextPaint textPaint = thbVar.a;
                                        int i8 = textPaint != null ? textPaint.baselineShift : 0;
                                        b2.o = i8 != 0 ? i8 + gl.L(i8 > 0 ? 5.0f : -2.0f) : 0;
                                        staticLayout.getSelectionPath(spanStart, spanEnd, b2);
                                        view.invalidate();
                                    } catch (Exception e2) {
                                        fa4.g(e2, true);
                                    }
                                }
                                ArrayList arrayList = bwVar.J;
                                if (arrayList != null && !arrayList.isEmpty() && (wibVarArr = (wib[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, wib.class)) != null) {
                                    int i9 = 0;
                                    while (true) {
                                        if (i9 >= wibVarArr.length) {
                                            break;
                                        }
                                        if (wibVarArr[i9].b()) {
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
                    m46 m46Var3 = vg5Var.b;
                    if (m46Var3 != null) {
                        vg5Var.a(dxVar, (thb) m46Var3.i);
                        R(vg5Var);
                    }
                } else if (motionEvent.getAction() == 3) {
                    m8 m8Var = vg5Var.I;
                    if (m8Var != null) {
                    }
                    R(vg5Var);
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
                        oVar2.N0 = new aw(oVar2, b);
                    }
                    if (view.getTag() == null || view.getTag() != obj || (fibVar2 = oVar2.R0) == null) {
                        oVar2.Q0.j0(view, (int) x2, (int) y2);
                    } else {
                        fibVar2.j0(view, (int) x2, (int) y2);
                    }
                    oVar2.g0.postDelayed(oVar2.N0, ViewConfiguration.getTapTimeout());
                    if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                        oVar2.h();
                    }
                    if (view instanceof ou) {
                        if (vg5Var.d != null) {
                            return b;
                        }
                        return false;
                    }
                    if (vg5Var.b != null) {
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
            if (view instanceof ou) {
            }
        }
        oVar = oVar3;
        obj = "bottomSheet";
        if (motionEvent.getAction() == 0) {
        }
        b = 1;
        if (motionEvent.getAction() != 0) {
        }
        if (view instanceof ou) {
        }
    }

    public static bw m(vg5 vg5Var, View view, CharSequence charSequence, TL_iv.RichText richText, int i, int i2, TL_iv.PageBlock pageBlock, dx dxVar) {
        return n(vg5Var, view, charSequence, richText, i, i2, pageBlock, Layout.Alignment.ALIGN_NORMAL, 0, dxVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:51|(3:52|53|(3:57|(3:(2:61|62)(2:64|65)|63|58)|66))|68|(2:69|70)|(11:74|75|76|(5:79|(1:81)(1:91)|(3:(1:84)(1:88)|85|86)(2:89|90)|87|77)|92|93|94|95|(7:99|100|101|(5:104|(1:106)(1:116)|(3:(1:109)(1:113)|110|111)(2:114|115)|112|102)|117|118|119)|152|119)|157|94|95|(8:97|99|100|101|(1:102)|117|118|119)|152|119) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x039a A[Catch: Exception -> 0x03d0, TryCatch #0 {Exception -> 0x03d0, blocks: (B:101:0x0394, B:102:0x0397, B:104:0x039a, B:106:0x03af, B:110:0x03bc, B:112:0x03c4, B:118:0x03cc), top: B:100:0x0394 }] */
    /* JADX WARN: Type inference failed for: r10v13, types: [android.text.Spanned, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v7, types: [android.graphics.Path, b46] */
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
    /* JADX WARN: Type inference failed for: r9v11, types: [android.graphics.Path, b46] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static bw n(vg5 vg5Var, View view, CharSequence charSequence, TL_iv.RichText richText, int i, int i2, TL_iv.PageBlock pageBlock, Layout.Alignment alignment, int i3, dx dxVar) {
        vg5 vg5Var2;
        CharSequence z;
        TL_iv.RichText richText2;
        TL_iv.PageBlock pageBlock2;
        TextPaint B;
        ?? r4;
        int i4;
        CharSequence charSequence2;
        StaticLayout staticLayout;
        ?? r12;
        b46 b46Var;
        b46 b46Var2;
        View view2;
        TL_iv.RichText richText3;
        TL_iv.PageBlock pageBlock3;
        int i5;
        int i6;
        ?? r13;
        ?? r9;
        rhb[] rhbVarArr;
        int i7;
        whb[] whbVarArr;
        dx dxVar2;
        if (charSequence != null || (richText != null && !(richText instanceof TL_iv.textEmpty))) {
            int L = i < 0 ? gl.L(10.0f) : i;
            if (charSequence != null) {
                vg5Var2 = vg5Var;
                richText2 = richText;
                z = charSequence;
                pageBlock2 = pageBlock;
            } else {
                vg5Var2 = vg5Var;
                z = z(vg5Var2, dxVar != null ? dxVar.F : null, view, richText, richText, pageBlock, L);
                richText2 = richText;
                pageBlock2 = pageBlock;
            }
            if (!TextUtils.isEmpty(z)) {
                int L2 = gl.L(gba.W0 - 16);
                if ((pageBlock2 instanceof TL_iv.pageBlockEmbedPost) && richText2 == null) {
                    if (((TL_iv.pageBlockEmbedPost) pageBlock2).author == charSequence) {
                        if (i1 == null) {
                            TextPaint textPaint = new TextPaint(1);
                            i1 = textPaint;
                            ((o) vg5Var2).getClass();
                            textPaint.setColor(bkb.w0(null, bkb.F6, false));
                        }
                        i1.setTextSize(gl.L(15.0f) + L2);
                        B = i1;
                    } else {
                        if (j1 == null) {
                            TextPaint textPaint2 = new TextPaint(1);
                            j1 = textPaint2;
                            ((o) vg5Var2).getClass();
                            textPaint2.setColor(bkb.w0(null, bkb.x6, false));
                        }
                        j1.setTextSize(gl.L(14.0f) + L2);
                        B = j1;
                    }
                } else if (pageBlock2 instanceof TL_iv.pageBlockChannel) {
                    if (k1 == null) {
                        TextPaint textPaint3 = new TextPaint(1);
                        k1 = textPaint3;
                        TextPaint i8 = de9.i(textPaint3, 1);
                        l1 = i8;
                        i8.setTypeface(gl.o());
                    }
                    TextPaint textPaint4 = k1;
                    ((o) vg5Var2).getClass();
                    textPaint4.setColor(bkb.w0(null, bkb.F6, false));
                    k1.setTextSize(gl.L(15.0f));
                    l1.setColor(-1);
                    l1.setTextSize(gl.L(15.0f));
                    B = (dxVar == null || dxVar.G == null) ? k1 : l1;
                } else if (pageBlock2 instanceof zw) {
                    zw zwVar = (zw) pageBlock2;
                    if (charSequence == zwVar.a.articles.get(zwVar.b).title) {
                        if (m1 == null) {
                            TextPaint textPaint5 = new TextPaint(1);
                            m1 = textPaint5;
                            textPaint5.setTypeface(gl.o());
                        }
                        TextPaint textPaint6 = m1;
                        ((o) vg5Var2).getClass();
                        textPaint6.setColor(bkb.w0(null, bkb.F6, false));
                        m1.setTextSize(gl.L(15.0f) + L2);
                        B = m1;
                    } else {
                        TextPaint textPaint7 = n1;
                        if (textPaint7 == null) {
                            textPaint7 = new TextPaint(1);
                            n1 = textPaint7;
                        }
                        ((o) vg5Var2).getClass();
                        textPaint7.setColor(bkb.w0(null, bkb.x6, false));
                        n1.setTextSize(gl.L(14.0f) + L2);
                        B = n1;
                    }
                } else if (!I(pageBlock2) || charSequence == null) {
                    B = B(vg5Var2, richText2, richText2, pageBlock2);
                } else {
                    if (o1 == null) {
                        TextPaint textPaint8 = new TextPaint(1);
                        o1 = textPaint8;
                        ((o) vg5Var2).getClass();
                        textPaint8.setColor(bkb.w0(null, bkb.F6, false));
                    }
                    if (p1 == null) {
                        TextPaint textPaint9 = new TextPaint(1);
                        p1 = textPaint9;
                        ((o) vg5Var2).getClass();
                        textPaint9.setColor(bkb.w0(null, bkb.F6, false));
                    }
                    o1.setTextSize(gl.L(19.0f) + L2);
                    p1.setTextSize(gl.L(16.0f) + L2);
                    B = (!(pageBlock2 instanceof vw) || ((vw) pageBlock2).c.a.ordered) ? p1 : o1;
                }
                CharSequence m = vu3.m(z, B.getFontMetricsInt(), false, null, 2);
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
                        staticLayout = new StaticLayout(charSequence2, textPaint10, L, alignment, 1.0f, gl.L(4.0f), false);
                    }
                    r12 = staticLayout;
                    m = charSequence2;
                } else if (pageBlock2 instanceof TL_iv.pageBlockPullquote) {
                    i4 = 1;
                    TextPaint textPaint11 = B;
                    r4 = 0;
                    r12 = lwa.c(m, textPaint11, L, Layout.Alignment.ALIGN_CENTER, 0.0f, TextUtils.TruncateAt.END, L, i3, true);
                } else {
                    TextPaint textPaint12 = B;
                    r4 = 0;
                    i4 = 1;
                    r12 = lwa.c(m, textPaint12, L, alignment, gl.L(4.0f), TextUtils.TruncateAt.END, L, i3, true);
                }
                if (r12 != 0) {
                    CharSequence text = r12.getText();
                    if (i2 >= 0 && !vg5Var2.F.isEmpty() && vg5Var2.G != null && (dxVar2 = ((o) vg5Var2).v0[r4].c) != null) {
                        String lowerCase = m.toString().toLowerCase();
                        int i9 = r4;
                        while (true) {
                            int indexOf = lowerCase.indexOf(vg5Var2.G, i9);
                            if (indexOf < 0) {
                                break;
                            }
                            int length = vg5Var2.G.length() + indexOf;
                            if (indexOf == 0 || gl.I1(lowerCase.charAt(indexOf - 1))) {
                                dxVar2.E.put(vg5Var2.G + pageBlock2 + richText2 + indexOf, Integer.valueOf(r12.getLineTop(r12.getLineForOffset(indexOf)) + i2));
                            }
                            i9 = length;
                        }
                    }
                    boolean z2 = text instanceof Spanned;
                    if (z2) {
                        ?? r10 = (Spanned) text;
                        try {
                            vj[] vjVarArr = (vj[]) r10.getSpans(r4, r10.length(), vj.class);
                            int lineCount = r12.getLineCount();
                            if (vjVarArr != null && vjVarArr.length > 0) {
                                for (int i10 = r4; i10 < vjVarArr.length; i10++) {
                                    if (lineCount <= i4) {
                                        dxVar.n.put(vjVarArr[i10].a, Integer.valueOf(i2));
                                    } else {
                                        HashMap hashMap = dxVar.n;
                                        vj vjVar = vjVarArr[i10];
                                        hashMap.put(vjVar.a, Integer.valueOf(i2 + r12.getLineTop(r12.getLineForOffset(r10.getSpanStart(vjVar)))));
                                    }
                                }
                            }
                        } catch (Exception unused) {
                        }
                        try {
                            whbVarArr = (whb[]) r10.getSpans(r4, r10.length(), whb.class);
                        } catch (Exception unused2) {
                        }
                        if (whbVarArr != null && whbVarArr.length > 0) {
                            r13 = new b46(r4);
                            try {
                                r13.n = r4;
                                for (int i11 = r4; i11 < whbVarArr.length; i11++) {
                                    int spanStart = r10.getSpanStart(whbVarArr[i11]);
                                    int spanEnd = r10.getSpanEnd(whbVarArr[i11]);
                                    r13.d(r12, spanStart, 0.0f);
                                    TextPaint textPaint13 = whbVarArr[i11].a;
                                    int i12 = textPaint13 != null ? textPaint13.baselineShift : r4;
                                    r13.o = i12 != 0 ? i12 + gl.L(i12 > 0 ? 5.0f : -2.0f) : r4;
                                    r12.getSelectionPath(spanStart, spanEnd, r13);
                                }
                                r13.n = i4;
                            } catch (Exception unused3) {
                            }
                            rhbVarArr = (rhb[]) r10.getSpans(r4, r10.length(), rhb.class);
                            if (rhbVarArr != null && rhbVarArr.length > 0) {
                                r9 = new b46(r4);
                                try {
                                    r9.n = r4;
                                    for (i7 = r4; i7 < rhbVarArr.length; i7++) {
                                        int spanStart2 = r10.getSpanStart(rhbVarArr[i7]);
                                        int spanEnd2 = r10.getSpanEnd(rhbVarArr[i7]);
                                        r9.d(r12, spanStart2, 0.0f);
                                        TextPaint textPaint14 = rhbVarArr[i7].a;
                                        int i13 = textPaint14 != null ? textPaint14.baselineShift : 0;
                                        r9.o = i13 != 0 ? i13 + gl.L(i13 > 0 ? 5.0f : -2.0f) : 0;
                                        r12.getSelectionPath(spanStart2, spanEnd2, r9);
                                    }
                                    r9.n = i4;
                                } catch (Exception unused4) {
                                }
                                b46Var = r9;
                                b46Var2 = r13;
                            }
                            r9 = 0;
                            b46Var = r9;
                            b46Var2 = r13;
                        }
                        r13 = 0;
                        rhbVarArr = (rhb[]) r10.getSpans(r4, r10.length(), rhb.class);
                        if (rhbVarArr != null) {
                            r9 = new b46(r4);
                            r9.n = r4;
                            while (i7 < rhbVarArr.length) {
                            }
                            r9.n = i4;
                            b46Var = r9;
                            b46Var2 = r13;
                        }
                        r9 = 0;
                        b46Var = r9;
                        b46Var2 = r13;
                    } else {
                        b46Var = null;
                        b46Var2 = null;
                    }
                    bw bwVar = new bw(vg5Var2);
                    bwVar.d = r12;
                    bwVar.e = b46Var2;
                    bwVar.f = b46Var;
                    bwVar.n = pageBlock2;
                    bwVar.r = richText2;
                    bwVar.K = new Stack();
                    bwVar.J = new ArrayList();
                    bwVar.L = new AtomicReference();
                    if (z2) {
                        richText3 = richText;
                        pageBlock3 = pageBlock;
                        i5 = i4;
                        i6 = 0;
                        view2 = view;
                        qla.a(view2, r12, -1, -1, (Spanned) text, bwVar.K, bwVar.J, null);
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
                            int i14 = i6;
                            while (i14 < arrayList.size()) {
                                bw bwVar2 = (bw) arrayList.get(i14);
                                if (bwVar2.n != pageBlock3 || (richText3 != null && bwVar2.r == richText3)) {
                                    bwVar2.f(view2);
                                    arrayList.remove(i14);
                                    i14--;
                                }
                                i14 += i5;
                            }
                        }
                        if (richText3 != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                weakHashMap.put(view2, arrayList);
                            }
                            arrayList.add(bwVar);
                        }
                        if (view2.isAttachedToWindow()) {
                            bwVar.i(view2);
                        }
                    }
                    return bwVar;
                }
            }
        }
        return null;
    }

    public static void o(vg5 vg5Var, boolean z) {
        if (s1 == null) {
            s1 = new Paint();
            r1 = new Paint();
            Paint paint = new Paint(1);
            u1 = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            u1.setStrokeWidth(gl.L(1.0f));
            Paint paint2 = new Paint();
            v1 = paint2;
            paint2.setStyle(style);
            v1.setStrokeWidth(gl.L(1.0f) / 2.0f);
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
        int w0 = bkb.w0(null, bkb.c6, false);
        A1.setColor(b00.y((float) Color.blue(w0), 0.0722f, (((float) Color.green(w0)) * 0.7152f) + (((float) Color.red(w0)) * 0.2126f), 255.0f) <= 0.705f ? -3041234 : -6551);
        Paint paint3 = z1;
        int i = bkb.J6;
        paint3.setColor(bkb.w0(null, i, false) & 872415231);
        z1.setPathEffect(b46.c());
        y1.setColor(bkb.w0(null, i, false) & 872415231);
        y1.setPathEffect(b46.c());
        Paint paint4 = v1;
        int i2 = bkb.j6;
        paint4.setColor(bkb.w0(null, i2, false));
        u1.setColor(bkb.w0(null, i2, false));
        q1.setColor(251658240);
        t1.setColor(bkb.w0(null, bkb.c7, false));
        B1.setColor(bkb.w0(null, i, false) & 872415231);
        B1.setPathEffect(b46.c());
        int w02 = bkb.w0(null, bkb.L6, false);
        int red = Color.red(w02);
        int green = Color.green(w02);
        int blue = Color.blue(w02);
        x1.setColor(Color.argb(20, red, green, blue));
        w1.setColor(Color.argb(34, red, green, blue));
        int w03 = bkb.w0(null, i, false);
        r1.setColor(Color.argb(20, Color.red(w03), Color.green(w03), Color.blue(w03)));
        s1.setColor(bkb.w0(null, bkb.Kd, false));
    }

    public static void r(Canvas canvas, vg5 vg5Var, TL_iv.PageBlock pageBlock, int i) {
        if (pageBlock == null || vg5Var == null || s1 == null) {
            return;
        }
        int i2 = 0;
        int L = i - (pageBlock.bottom ? gl.L(6.0f) : 0);
        int i3 = pageBlock.quoteLevels;
        if (i3 == 0) {
            if (pageBlock.level > 0) {
                canvas.drawRect(gl.L(18.0f), 0.0f, gl.L(2.0f) + r0, L, s1);
                return;
            }
            return;
        }
        while (i3 != 0) {
            if ((i3 & 1) != 0) {
                canvas.drawRect(gl.L((i2 * 14) + 18), 0.0f, gl.L(2.0f) + r0, L, s1);
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
    public static void s(vg5 vg5Var, Canvas canvas, eib eibVar, int i) {
        fib fibVar;
        View view = (View) eibVar;
        o oVar = (o) vg5Var;
        if (view != null) {
            oVar.getClass();
            if (view.getTag() != null) {
                if (view.getTag() == "bottomSheet") {
                    fibVar = oVar.R0;
                }
            }
        }
        fibVar = oVar.Q0;
        if (fibVar != null) {
            fibVar.Y(canvas, eibVar, i);
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
        y29 y29Var;
        if (!(view instanceof xu)) {
            return (!(view instanceof av) || (y29Var = ((av) view).d) == null) ? view : v(y29Var.a);
        }
        y29 y29Var2 = ((xu) view).d;
        return y29Var2 != null ? v(y29Var2.a) : view;
    }

    public static TL_iv.PageBlock w(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof vw) {
            TL_iv.PageBlock pageBlock2 = ((vw) pageBlock).d;
            return pageBlock2 != null ? w(pageBlock2) : pageBlock2;
        }
        if (!(pageBlock instanceof xw)) {
            return pageBlock;
        }
        TL_iv.PageBlock pageBlock3 = ((xw) pageBlock).d;
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

    public static CharSequence z(vg5 vg5Var, TLRPC.WebPage webPage, View view, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock, int i) {
        TextPaint B;
        if (richText2 == null) {
            return null;
        }
        if (richText2 instanceof TL_iv.textFixed) {
            return z(vg5Var, webPage, view, richText, ((TL_iv.textFixed) richText2).text, pageBlock, i);
        }
        if (richText2 instanceof TL_iv.textItalic) {
            return z(vg5Var, webPage, view, richText, ((TL_iv.textItalic) richText2).text, pageBlock, i);
        }
        if (richText2 instanceof TL_iv.textBold) {
            return z(vg5Var, webPage, view, richText, ((TL_iv.textBold) richText2).text, pageBlock, i);
        }
        if (richText2 instanceof TL_iv.textUnderline) {
            return z(vg5Var, webPage, view, richText, ((TL_iv.textUnderline) richText2).text, pageBlock, i);
        }
        if (richText2 instanceof TL_iv.textStrike) {
            return z(vg5Var, webPage, view, richText, ((TL_iv.textStrike) richText2).text, pageBlock, i);
        }
        if (richText2 instanceof TL_iv.textEmail) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(z(vg5Var, webPage, view, richText, ((TL_iv.textEmail) richText2).text, pageBlock, i));
            MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder.length() != 0) {
                spannableStringBuilder.setSpan(new thb((metricAffectingSpanArr == null || metricAffectingSpanArr.length == 0) ? B(vg5Var, richText, richText2, pageBlock) : null, "mailto:" + C(richText2)), 0, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        long j = 0;
        if (richText2 instanceof TL_iv.textUrl) {
            TL_iv.textUrl texturl = (TL_iv.textUrl) richText2;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(z(vg5Var, webPage, view, richText, texturl.text, pageBlock, i));
            MetricAffectingSpan[] metricAffectingSpanArr2 = (MetricAffectingSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), MetricAffectingSpan.class);
            B = (metricAffectingSpanArr2 == null || metricAffectingSpanArr2.length == 0) ? B(vg5Var, richText, richText2, pageBlock) : null;
            Object whbVar = texturl.webpage_id != 0 ? new whb(B, C(richText2)) : new thb(B, C(richText2));
            if (spannableStringBuilder2.length() != 0) {
                spannableStringBuilder2.setSpan(whbVar, 0, spannableStringBuilder2.length(), 33);
            }
            return spannableStringBuilder2;
        }
        if (richText2 instanceof TL_iv.textPlain) {
            return ((TL_iv.textPlain) richText2).text;
        }
        if (richText2 instanceof TL_iv.textAnchor) {
            TL_iv.textAnchor textanchor = (TL_iv.textAnchor) richText2;
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(z(vg5Var, webPage, view, richText, textanchor.text, pageBlock, i));
            String str = textanchor.name;
            vj vjVar = new vj();
            vjVar.a = str.toLowerCase();
            spannableStringBuilder3.setSpan(vjVar, 0, spannableStringBuilder3.length(), 17);
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
                        spannableStringBuilder4.setSpan(new hib(), spannableStringBuilder4.length() - i2, spannableStringBuilder4.length(), 33);
                    }
                    int i5 = i3;
                    int i6 = i2;
                    CharSequence z = z(vg5Var, webPage, view, richText, richText3, pageBlock, i);
                    int A = A(x);
                    int length = spannableStringBuilder4.length();
                    spannableStringBuilder4.append(z);
                    if (A != 0 && !(z instanceof SpannableStringBuilder)) {
                        if ((A & 8) != 0 || (A & 512) != 0) {
                            String C = C(richText3);
                            if (C == null) {
                                C = C(richText);
                            }
                            Object whbVar2 = (A & 512) != 0 ? new whb(B(vg5Var, richText, x, pageBlock), C) : new thb(B(vg5Var, richText, x, pageBlock), C);
                            if (length != spannableStringBuilder4.length()) {
                                spannableStringBuilder4.setSpan(whbVar2, length, spannableStringBuilder4.length(), 33);
                            }
                        } else if (length != spannableStringBuilder4.length()) {
                            TextPaint B2 = B(vg5Var, richText, x, pageBlock);
                            shb shbVar = new shb();
                            shbVar.a = B2;
                            spannableStringBuilder4.setSpan(shbVar, length, spannableStringBuilder4.length(), 33);
                        }
                    }
                    if (i4 != 0 && i5 != size - 1) {
                        spannableStringBuilder4.append((CharSequence) " ");
                        spannableStringBuilder4.setSpan(new hib(), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                    }
                    i3 = i5 + 1;
                    i2 = i6;
                    c = '\n';
                    j = 0;
                }
                return spannableStringBuilder4;
            }
            if (richText2 instanceof TL_iv.textSubscript) {
                return z(vg5Var, webPage, view, richText, ((TL_iv.textSubscript) richText2).text, pageBlock, i);
            }
            if (richText2 instanceof TL_iv.textSuperscript) {
                return z(vg5Var, webPage, view, richText, ((TL_iv.textSuperscript) richText2).text, pageBlock, i);
            }
            if (richText2 instanceof TL_iv.textMarked) {
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(z(vg5Var, webPage, view, richText, ((TL_iv.textMarked) richText2).text, pageBlock, i));
                MetricAffectingSpan[] metricAffectingSpanArr3 = (MetricAffectingSpan[]) spannableStringBuilder5.getSpans(0, spannableStringBuilder5.length(), MetricAffectingSpan.class);
                if (spannableStringBuilder5.length() != 0) {
                    B = (metricAffectingSpanArr3 == null || metricAffectingSpanArr3.length == 0) ? B(vg5Var, richText, richText2, pageBlock) : null;
                    rhb rhbVar = new rhb();
                    rhbVar.a = B;
                    spannableStringBuilder5.setSpan(rhbVar, 0, spannableStringBuilder5.length(), 33);
                }
                return spannableStringBuilder5;
            }
            if (richText2 instanceof TL_iv.textSpoiler) {
                SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(z(vg5Var, webPage, view, richText, ((TL_iv.textSpoiler) richText2).text, pageBlock, i));
                if (spannableStringBuilder6.length() != 0) {
                    vib vibVar = new vib();
                    vibVar.a |= 256;
                    spannableStringBuilder6.setSpan(new wib(vibVar, 0), 0, spannableStringBuilder6.length(), 33);
                }
                return spannableStringBuilder6;
            }
            if (richText2 instanceof TL_iv.textPhone) {
                SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(z(vg5Var, webPage, view, richText, ((TL_iv.textPhone) richText2).text, pageBlock, i));
                MetricAffectingSpan[] metricAffectingSpanArr4 = (MetricAffectingSpan[]) spannableStringBuilder7.getSpans(0, spannableStringBuilder7.length(), MetricAffectingSpan.class);
                if (spannableStringBuilder7.length() != 0) {
                    spannableStringBuilder7.setSpan(new thb((metricAffectingSpanArr4 == null || metricAffectingSpanArr4.length == 0) ? B(vg5Var, richText, richText2, pageBlock) : null, "tel:" + C(richText2)), 0, spannableStringBuilder7.length(), 33);
                }
                return spannableStringBuilder7;
            }
            if (richText2 instanceof TL_iv.textImage) {
                TL_iv.textImage textimage = (TL_iv.textImage) richText2;
                TLRPC.Document a = cx.a(webPage, textimage.document_id);
                TLRPC.Photo e = cx.e(webPage, textimage.photo_id);
                if (a != null) {
                    SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder("*");
                    int L = gl.L(textimage.w);
                    int L2 = gl.L(textimage.h);
                    int abs = Math.abs(i);
                    if (L > abs) {
                        L2 = (int) (L2 * (abs / L));
                        L = abs;
                    }
                    if (view != null) {
                        int i7 = bkb.c6;
                        ((o) vg5Var).getClass();
                        boolean z2 = gl.B(bkb.w0(null, i7, false)) <= 0.705f;
                        qhb qhbVar = new qhb();
                        Locale locale = Locale.US;
                        String str2 = L + "_" + L2 + "_i";
                        qhbVar.b = L;
                        qhbVar.c = L2;
                        boolean z3 = z2;
                        ImageReceiver imageReceiver = new ImageReceiver(view);
                        qhbVar.a = imageReceiver;
                        imageReceiver.K0 = true;
                        if (z3) {
                            imageReceiver.h1 = new sdb((byte) 24);
                        }
                        imageReceiver.Z(gl5.b(a), str2, gl5.c(ba4.w(a.thumbs, 90, false, null, false), a), str2, null, -1L, null, webPage, 1);
                        spannableStringBuilder8.setSpan(qhbVar, 0, spannableStringBuilder8.length(), 33);
                    }
                    return spannableStringBuilder8;
                }
                if (e instanceof btc) {
                    btc btcVar = (btc) e;
                    SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder("*");
                    int L3 = gl.L(textimage.w);
                    int L4 = gl.L(textimage.h);
                    int abs2 = Math.abs(i);
                    if (L3 > abs2) {
                        L4 = (int) (L4 * (abs2 / L3));
                        L3 = abs2;
                    }
                    if (view != null) {
                        qhb qhbVar2 = new qhb();
                        qhbVar2.b = L3;
                        qhbVar2.c = L4;
                        ImageReceiver imageReceiver2 = new ImageReceiver(view);
                        qhbVar2.a = imageReceiver2;
                        imageReceiver2.K0 = true;
                        ctc.g(btcVar, imageReceiver2, new jc((byte) 10));
                        spannableStringBuilder9.setSpan(qhbVar2, 0, spannableStringBuilder9.length(), 33);
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
                    lx5 a2 = lx5.a(textmath.source, gl.L(20.0f), true);
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
                    int i10 = bkb.F6;
                    ((o) vg5Var).getClass();
                    spannableStringBuilder10.setSpan(new qhb(view, bitmap, i8, i9, bkb.w0(null, i10, false), textmath.depth), 0, spannableStringBuilder10.length(), 33);
                    String str3 = textmath.source;
                    if (str3 != null && !str3.isEmpty()) {
                        spannableStringBuilder10.setSpan(new kib(textmath.source), 0, spannableStringBuilder10.length(), 33);
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
        sw swVar = this.L;
        boolean z = false;
        if (size <= 1) {
            articleViewer$WindowView.e = false;
            articleViewer$WindowView.d = false;
            float width = swVar != null ? swVar.J * swVar.c.getWidth() : this.h0.getX();
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = r0.getMeasuredWidth() - width;
            if (swVar != null) {
                animatorSet.playTogether(swVar.l(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.h0, (Property<a, Float>) View.TRANSLATION_X, r0.getMeasuredWidth()), ObjectAnimator.ofFloat(this.g0, f1, r0.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / r0.getMeasuredWidth()) * measuredWidth), kk7.Y3));
            animatorSet.setInterpolator(s33.h);
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
        this.v0[0].setBackgroundColor(swVar == null ? 0 : this.m0.getColor());
        c0(-1, arrayList.get(arrayList.size() - 2), true);
        m mVar = this.v0[0];
        mVar.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        mVar.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.v0[0], (Property<m, Float>) View.TRANSLATION_X, mVar.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(s33.h);
        animatorSet2.addListener(new e(this));
        animatorSet2.start();
        wt wtVar = this.i0;
        m mVar2 = this.v0[0];
        wtVar.setMenuColors((mVar2 == null || !gba.s0) ? bkb.w0(null, bkb.Fl, false) : mVar2.getBackgroundColor());
        wt wtVar2 = this.i0;
        m mVar3 = this.v0[0];
        wtVar2.d((mVar3 == null || !gba.s0) ? bkb.w0(null, bkb.Fl, false) : mVar3.getActionBarColor(), true);
        wt wtVar3 = this.i0;
        m mVar4 = this.v0[0];
        wtVar3.setIsTonsite(mVar4 != null && mVar4.d());
        wt wtVar4 = this.i0;
        m mVar5 = this.v0[0];
        if (mVar5 != null && mVar5.c()) {
            z = true;
        }
        wtVar4.setIsLocal(z);
        this.V0 = true;
    }

    public final void E(int i) {
        ArrayList arrayList = this.e0;
        int size = arrayList.size();
        ArticleViewer$WindowView articleViewer$WindowView = this.g0;
        sw swVar = this.L;
        boolean z = false;
        if (size <= 1) {
            articleViewer$WindowView.e = false;
            articleViewer$WindowView.d = false;
            float width = swVar != null ? swVar.J * swVar.c.getWidth() : this.h0.getX();
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = r9.getMeasuredWidth() - width;
            if (swVar != null) {
                animatorSet.playTogether(swVar.l(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.h0, (Property<a, Float>) View.TRANSLATION_X, r9.getMeasuredWidth()), ObjectAnimator.ofFloat(this.g0, f1, r9.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / r9.getMeasuredWidth()) * measuredWidth), kk7.Y3));
            animatorSet.setInterpolator(s33.h);
            animatorSet.addListener(new f(this));
            animatorSet.start();
            this.V0 = true;
            return;
        }
        articleViewer$WindowView.f = true;
        this.v0[1].setVisibility(0);
        this.v0[1].setAlpha(1.0f);
        this.v0[1].setTranslationX(0.0f);
        this.v0[0].setBackgroundColor(swVar == null ? 0 : this.m0.getColor());
        c0(-1, arrayList.get(i), true);
        m mVar = this.v0[0];
        mVar.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        mVar.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.v0[0], (Property<m, Float>) View.TRANSLATION_X, mVar.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(s33.h);
        animatorSet2.addListener(new g(this, i));
        animatorSet2.start();
        wt wtVar = this.i0;
        m mVar2 = this.v0[0];
        wtVar.setMenuColors((mVar2 == null || !gba.s0) ? bkb.w0(null, bkb.Fl, false) : mVar2.getBackgroundColor());
        wt wtVar2 = this.i0;
        m mVar3 = this.v0[0];
        wtVar2.d((mVar3 == null || !gba.s0) ? bkb.w0(null, bkb.Fl, false) : mVar3.getActionBarColor(), true);
        wt wtVar3 = this.i0;
        m mVar4 = this.v0[0];
        wtVar3.setIsTonsite(mVar4 != null && mVar4.d());
        wt wtVar4 = this.i0;
        m mVar5 = this.v0[0];
        if (mVar5 != null && mVar5.c()) {
            z = true;
        }
        wtVar4.setIsLocal(z);
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
                    fa4.g(e, true);
                }
            }
        }
        this.M.getWindow().clearFlags(128);
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.O;
            if (i2 >= arrayList.size()) {
                this.h0.post(new ts(this, (byte) 6));
                kk7.f(this.Y).k(kk7.c1, new Object[0]);
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
    public final boolean L(k27 k27Var, TLRPC.TL_webPage tL_webPage, String str, String str2) {
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
        sw swVar = this.L;
        if (swVar == null && this.W) {
            return false;
        }
        org.telegram.ui.ActionBar.d dVar = this.N;
        if (dVar != null && (dVar.getParentLayout() instanceof ActionBarLayout)) {
            gl.t1((ActionBarLayout) this.N.getParentLayout());
        }
        if (k27Var != null) {
            tL_webPage2 = tL_webPage == null ? k27Var.k.media.webpage : tL_webPage;
            z = (tL_webPage2 == null || (page = tL_webPage2.cached_page) == null || page.local == null) ? false : true;
            for (int i = 0; i < k27Var.k.entities.size(); i++) {
                TLRPC.MessageEntity messageEntity = k27Var.k.entities.get(i);
                if (messageEntity instanceof TLRPC.TL_messageEntityUrl) {
                    try {
                        String str3 = k27Var.k.message;
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
                        fa4.g(e, true);
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
        if (swVar == null || arrayList.isEmpty()) {
            z2 = z;
            r5 = 0;
        } else {
            z2 = z;
            r5 = 1;
        }
        if (r5 == 0) {
            arrayList.clear();
            this.h0.setTranslationX(0.0f);
            if (swVar != null) {
                swVar.J = 0.0f;
                swVar.c.invalidate();
                swVar.s();
                swVar.r();
            }
            this.h0.setTranslationY(0.0f);
            this.v0[0].setTranslationY(0.0f);
            this.v0[0].setTranslationX(0.0f);
            this.v0[1].setTranslationX(0.0f);
            this.v0[0].setAlpha(1.0f);
            this.g0.setInnerTranslationX(0.0f);
            this.v0[0].f();
            V(gl.L(56.0f));
        }
        if (swVar != null && hv0.R0) {
            swVar.a.d();
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
                int i3 = k27Var != null ? k27Var.K1 : y6c.t0;
                ConnectionsManager.getInstance(i3).sendRequest(tL_messages_getWebPage, new rt((o) this, i3, tL_webPage2, k27Var, (boolean) r5, str4));
            }
        } else {
            d(r5, str2);
        }
        wt wtVar = this.i0;
        if (wtVar != null && r5 == 0) {
            wtVar.setIsLocal(this.v0[0].c());
        }
        this.U = null;
        if (swVar != null) {
            if (r5 == 0) {
                gl.B2(this.g0);
                swVar.d = this.g0;
                swVar.A();
                swVar.c.addView(this.g0, nme.c(-1.0f, -1));
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
                fa4.g(e3, true);
                return false;
            }
        }
        this.W = true;
        this.a0 = (byte) 1;
        if (r5 == 0) {
            if (swVar == null) {
                this.g0.setAlpha(0.0f);
                this.h0.setAlpha(0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                ArticleViewer$WindowView articleViewer$WindowView = this.g0;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, (Property<ArticleViewer$WindowView, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.h0, (Property<a, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.g0, (Property<ArticleViewer$WindowView, Float>) View.TRANSLATION_X, gl.L(56.0f), 0.0f));
                this.b0 = new ts(this, (byte) 11);
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(this.d0);
                animatorSet.addListener(new au(this));
                this.c0 = System.currentTimeMillis();
                gl.d3(new ee2(this, animatorSet, (byte) 26));
            } else if (r5 != 0) {
                swVar.a.e();
            } else if (!swVar.h) {
                swVar.p(swVar.b);
                swVar.o();
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
        ((LaunchActivity) this.M).u0(new mu1(bundle), false, true);
        l(false, true);
    }

    public final void O(String str, String str2, vt vtVar) {
        Activity activity = this.M;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        m mVar = this.v0[0];
        if (mVar == null || !mVar.c()) {
            P(str, str2, vtVar);
            return;
        }
        String M0 = k96.M0(2131747589, null);
        int indexOf = M0.indexOf("%");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.format(M0, str));
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new URLSpan(str), indexOf, str.length() + indexOf, 33);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, null, this.M);
        String M02 = k96.M0(2131747586, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M02;
        hdVar.U = spannableStringBuilder;
        hdVar.i0 = false;
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        alertDialog$Builder.j(k96.M0(2131747624, null), new lt((Object) this, (Object) str, (Object) str2, (Object) vtVar, (byte) 0));
        alertDialog$Builder.o();
    }

    public final void P(String str, String str2, vt vtVar) {
        sw swVar;
        vt vtVar2 = this.O0;
        if (vtVar2 != null) {
            vtVar2.a(false);
        }
        this.O0 = vtVar;
        if (this.H0 != 0) {
            ConnectionsManager.getInstance(this.Y).cancelRequest(this.H0, false);
            this.H0 = 0;
        }
        boolean[] zArr = new boolean[1];
        if (d01.m(this.M, str, false)) {
            if (!this.e0.isEmpty() || (swVar = this.L) == null) {
                return;
            }
            swVar.a(false);
            return;
        }
        nt ntVar = new nt(this, str, zArr, vtVar);
        int i = this.J0 + 1;
        this.J0 = i;
        Z(true);
        TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
        tL_messages_getWebPage.url = str;
        tL_messages_getWebPage.hash = 0;
        this.H0 = ConnectionsManager.getInstance(this.Y).sendRequest(tL_messages_getWebPage, new ot(this, i, vtVar, str2, ntVar, tL_messages_getWebPage));
        if (vtVar != null) {
            vtVar.b = new va7((Object) this, i, (Object) vtVar, (byte) 4);
            vtVar.d();
        }
    }

    public final void Q() {
        TextView textView = this.D0;
        if (textView != null) {
            int i = bkb.h6;
            ff0 f0 = bkb.f0(bkb.w0(null, i, false), 2, -1);
            vkb M = zkb.M(i);
            textView.setBackground(f0);
            zkb.j(textView, f0, null, M, null);
            zkb.X(this.D0, bkb.D8, null);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.C0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            zkb.h(bkb.F8, null, actionBarPopupWindow$ActionBarPopupWindowLayout);
        }
        ImageView imageView = this.s0;
        if (imageView != null) {
            zkb.s(imageView, bkb.F6, null, PorterDuff.Mode.MULTIPLY);
            ImageView imageView2 = this.s0;
            int i2 = bkb.y8;
            zkb.R(imageView2, bkb.f0(bkb.w0(null, i2, false), 1, -1), null, zkb.M(i2), null);
        }
        ImageView imageView3 = this.t0;
        if (imageView3 != null) {
            zkb.s(imageView3, bkb.F6, null, PorterDuff.Mode.MULTIPLY);
            ImageView imageView4 = this.t0;
            int i3 = bkb.y8;
            zkb.R(imageView4, bkb.f0(bkb.w0(null, i3, false), 1, -1), null, zkb.M(i3), null);
        }
        hn hnVar = this.u0;
        if (hnVar != null) {
            zkb.U(hnVar, bkb.F6, null);
        }
        wt wtVar = this.i0;
        if (wtVar != null) {
            m mVar = this.v0[0];
            wtVar.setMenuColors((mVar == null || !gba.s0) ? bkb.w0(null, bkb.Fl, false) : mVar.getBackgroundColor());
            wt wtVar2 = this.i0;
            m mVar2 = this.v0[0];
            wtVar2.d((mVar2 == null || !gba.s0) ? bkb.w0(null, bkb.Fl, false) : mVar2.getActionBarColor(), true);
        }
        this.m0.setColor(bkb.w0(null, bkb.Fl, false));
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
        Point point = gl.q;
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
                    pageblockparagraph.text = ctc.d(textanchor.text, !isEmpty ? mVarArr[0].c.F.cached_page.url.toLowerCase() : mVarArr[0].c.F.url.toLowerCase(), lowerCase);
                    this.v0[0].c.getClass();
                    int I = dx.I(pageblockparagraph);
                    s49 x = this.v0[0].c.x(null, I);
                    View view = x.a;
                    this.v0[0].c.H(I, x, pageblockparagraph, 0, 0, false);
                    fx0 i = ug8.i(this.M, false, 1, null);
                    i.v0 = false;
                    i.w0 = false;
                    LinearLayout linearLayout = new LinearLayout(this.M);
                    linearLayout.setOrientation(1);
                    fib fibVar = new fib();
                    this.R0 = fibVar;
                    fibVar.Q(linearLayout);
                    this.R0.D = new yt(this, b2);
                    wb wbVar = new wb(this.M, (byte) 11);
                    wbVar.setTextSize(1, 16.0f);
                    wbVar.setTypeface(gl.o());
                    wbVar.setText(k96.M0(2131749000, null));
                    wbVar.setGravity((this.v0[0].c.H ? 5 : 3) | 16);
                    wbVar.setTextColor(bkb.w0(null, bkb.F6, false));
                    wbVar.setPadding(gl.L(18.0f), 0, gl.L(18.0f), 0);
                    linearLayout.addView(wbVar, new LinearLayout.LayoutParams(-1, gl.L(48.0f) + 1));
                    view.setTag("bottomSheet");
                    linearLayout.addView(view, nme.k(0.0f, 7.0f, 0.0f, 0.0f, -1, -2));
                    qib m = this.R0.m(this.M);
                    st stVar = new st(this, this.M, linearLayout, b);
                    i.z0 = new tt(this, b);
                    stVar.addView(linearLayout, -1, -2);
                    stVar.addView(m, -1, -2);
                    i.O = stVar;
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
                    if ((w instanceof tw) && M((tw) w)) {
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
                            int I2 = dx.I(pageBlock);
                            s49 x2 = this.v0[0].c.x(null, I2);
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
                        this.v0[0].d.g1(num2.intValue(), (-gl.L(56.0f)) - num.intValue());
                        return true;
                    }
                    ut utVar = new ut(this.v0[0].getContext());
                    utVar.a = num2.intValue();
                    utVar.s = (-gl.L(56.0f)) - num.intValue();
                    this.v0[0].d.v0(utVar);
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
        tw twVar;
        TL_iv.PageBlock pageBlock2;
        if (i < 0 || i >= this.F.size()) {
            f0();
            return;
        }
        this.H = i;
        f0();
        ow owVar = (ow) this.F.get(i);
        TL_iv.PageBlock w = w(owVar.c);
        int size2 = this.v0[0].c.e.size();
        for (int i3 = 0; i3 < size2; i3++) {
            TL_iv.PageBlock pageBlock3 = (TL_iv.PageBlock) this.v0[0].c.e.get(i3);
            if ((pageBlock3 instanceof tw) && ((pageBlock2 = (twVar = (tw) pageBlock3).b) == owVar.c || pageBlock2 == w)) {
                if (M(twVar)) {
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
                    TL_iv.PageBlock pageBlock5 = owVar.c;
                    if (pageBlock4 == pageBlock5 || pageBlock4 == w || ((pageBlock4 instanceof tw) && ((pageBlock = ((tw) pageBlock4).b) == pageBlock5 || pageBlock == w))) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 != -1) {
                    return;
                }
                if ((w instanceof tw) && M((tw) w)) {
                    this.v0[0].c.M();
                    this.v0[0].c.f();
                }
                String str = this.G + owVar.c + owVar.b + owVar.a;
                Integer num = (Integer) this.v0[0].c.E.get(str);
                if (num == null) {
                    dx dxVar = this.v0[0].c;
                    TL_iv.PageBlock pageBlock6 = owVar.c;
                    dxVar.getClass();
                    int I = dx.I(pageBlock6);
                    s49 x = this.v0[0].c.x(null, I);
                    this.v0[0].c.H(I, x, owVar.c, 0, 0, false);
                    x.a.measure(View.MeasureSpec.makeMeasureSpec(this.v0[0].b.getMeasuredWidth(), TLObject.FLAG_30), 0);
                    num = (Integer) this.v0[0].c.E.get(str);
                    if (num == null) {
                        num = 0;
                    }
                }
                zt ztVar = new zt(this.v0[0].getContext());
                if (this.v0[0].c.J) {
                    i2++;
                }
                ztVar.a = i2;
                ztVar.s = -(gl.L(100.0f) + ((this.K0 - gl.L(56.0f)) - num.intValue()));
                ztVar.t = 1.2f;
                this.v0[0].d.v0(ztVar);
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
        wt wtVar = this.i0;
        if (wtVar == null || wtVar.U || wtVar.a0) {
            return;
        }
        int j = Utilities.j(i, gl.L(56.0f), gl.L(24.0f));
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
        sw swVar;
        a06 a06Var = this.W0;
        if (a06Var != null) {
            a06Var.a();
            this.W0 = null;
        }
        this.W0 = LaunchActivity.c0();
        this.N = dVar;
        int currentAccount = !(dVar instanceof x14) ? dVar.getCurrentAccount() : y6c.t0;
        this.Y = currentAccount;
        kk7.f(currentAccount).b(this, kk7.d2);
        kk7.f(this.Y).b(this, kk7.e2);
        kk7.f(this.Y).b(this, kk7.f2);
        kk7.f(this.Y).b(this, kk7.g2);
        kk7.f(this.Y).b(this, kk7.k4);
        Activity activity2 = this.M;
        if (activity2 == activity || !(activity2 == null || !this.K || (swVar = this.L) == null || swVar.e == null)) {
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
        this.g0.addView(aVar, nme.e(-1, -1, 51));
        if (this.L == null) {
            this.g0.setFitsSystemWindows(true);
            this.h0.setOnApplyWindowInsetsListener(new vs(b));
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        this.Q = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.Q.setVisibility(4);
        this.g0.addView(this.Q, nme.c(-1.0f, -1));
        ix ixVar = new ix(activity);
        this.S = ixVar;
        ixVar.setVisibility(0);
        this.S.setBackgroundColor(-16777216);
        byte b3 = 17;
        this.Q.addView(this.S, nme.e(-1, -1, 17));
        this.R = new TextureView(activity);
        byte b4 = 2;
        this.v0 = new m[2];
        int i = 0;
        while (true) {
            m[] mVarArr = this.v0;
            byte b5 = 14;
            if (i >= mVarArr.length) {
                break;
            }
            m mVar = new m(this, activity);
            mVarArr[i] = mVar;
            mVar.setVisibility(i == 0 ? 0 : 8);
            this.h0.addView(mVar, nme.d(-1, -1.0f, kk7.D1, 0.0f, 0.0f, 0.0f, 0.0f));
            mVar.b.setOnItemLongClickListener(new ys(this));
            mVar.b.setOnItemClickListener(new o(this, mVar, b5));
            i++;
        }
        this.h0.addView(new FrameLayout(activity), nme.d(-1, -1.0f, kk7.D1, 0.0f, 0.0f, 0.0f, 0.0f));
        this.x0.setColor(-16777216);
        this.y0.setColor(-16777216);
        this.B0.setColor(-14408666);
        this.z0.setColor(-16777216);
        wt wtVar = new wt(this, activity);
        this.i0 = wtVar;
        wtVar.f0 = this.L != null;
        this.h0.addView(wtVar, nme.e(-1, -2, 48));
        this.i0.setOnClickListener(new t(this, activity, b3));
        this.i0.c0.addTextChangedListener(new b7(this, b2));
        eb ebVar = new eb(activity);
        this.j0 = ebVar;
        ebVar.setOpenProgress(0.0f);
        byte b6 = 3;
        this.j0.x.j(new y(this, b6));
        this.h0.addView(this.j0, nme.c(-1.0f, -1));
        this.k0 = new ts(this, b2);
        this.i0.M.setOnClickListener(new xs(this, b4));
        this.i0.M.setOnLongClickListener(new zs(this, b));
        this.i0.setMenuListener(new x0(this, activity, b2));
        this.i0.P.setOnClickListener(new xs(this, b6));
        a6 a6Var = new a6(this.M, b2);
        this.r0 = a6Var;
        a6Var.setOnTouchListener(new p8((byte) 14));
        this.r0.setWillNotDraw(false);
        this.r0.setTranslationY(gl.L(51.0f));
        this.r0.setVisibility(4);
        this.r0.setFocusable(true);
        this.r0.setFocusableInTouchMode(true);
        this.r0.setClickable(true);
        this.r0.setPadding(0, gl.L(3.0f), 0, 0);
        this.h0.addView(this.r0, nme.e(-1, 51, 80));
        new mv5(this.g0, false, new ws(this, b));
        ImageView imageView = new ImageView(this.M);
        this.s0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.s0.setImageResource(R.drawable.msg_go_up);
        ImageView imageView2 = this.s0;
        int i2 = bkb.F6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        zkb.s(imageView2, i2, null, mode);
        ImageView imageView3 = this.s0;
        int i3 = bkb.y8;
        zkb.R(imageView3, bkb.f0(bkb.w0(null, i3, false), 1, -1), null, zkb.M(i3), null);
        this.r0.addView(this.s0, nme.d(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        this.s0.setOnClickListener(new xs(this, b));
        this.s0.setContentDescription(k96.M0(2131754778, null));
        ImageView imageView4 = new ImageView(this.M);
        this.t0 = imageView4;
        imageView4.setScaleType(scaleType);
        this.t0.setImageResource(R.drawable.msg_go_down);
        zkb.s(this.t0, i2, null, mode);
        zkb.R(this.t0, bkb.f0(bkb.w0(null, i3, false), 1, -1), null, zkb.M(i3), null);
        this.r0.addView(this.t0, nme.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        this.t0.setOnClickListener(new xs(this, b2));
        this.t0.setContentDescription(k96.M0(2131754777, null));
        hn hnVar = new hn(this.M, true, true, true);
        this.u0 = hnVar;
        hnVar.setScaleProperty(0.6f);
        this.u0.b(0.4f, 350L, s33.h);
        zkb.U(this.u0, i2, null);
        this.u0.setTextSize(gl.L(15.0f));
        this.u0.setTypeface(gl.o());
        this.u0.setGravity(3);
        this.u0.getDrawable().N = gl.q.x;
        this.r0.addView(this.u0, nme.d(-2, -2.0f, 19, 18.0f, 0.0f, 108.0f, 0.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f0 = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 98;
        layoutParams.softInputMode = 48;
        layoutParams.flags = 131072;
        int w0 = this.L == null ? bkb.w0(null, bkb.Z6, true) : bkb.w0(null, bkb.Z6, false);
        int i4 = (gl.B(w0) < 0.721f || Build.VERSION.SDK_INT < 26) ? 1792 : 1808;
        this.z0.setColor(w0);
        this.A0 = true;
        WindowManager.LayoutParams layoutParams2 = this.f0;
        layoutParams2.systemUiVisibility = i4;
        layoutParams2.flags |= -2147417856;
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams2.layoutInDisplayCutoutMode = 1;
        }
        fib fibVar = new fib();
        this.Q0 = fibVar;
        fibVar.Q(this.v0[0].b);
        if (na7.q1(this.Y).i4.r()) {
            this.Q0.k0 = new ys(this);
        }
        fib fibVar2 = this.Q0;
        fibVar2.z0 = this.v0[0].d;
        fibVar2.D = new yt(this, b);
        this.h0.addView(fibVar2.m(activity));
        a aVar2 = this.h0;
        ma8 ma8Var = new ma8(aVar2, aVar2);
        this.S0 = ma8Var;
        ma8Var.F = new ys(this);
        ma8Var.E = new i4d(this);
        this.m0.setColor(bkb.w0(null, bkb.Fl, false));
        e0(this);
    }

    public final void X(String str) {
        String str2;
        if (this.M == null) {
            return;
        }
        fx0 fx0Var = this.J;
        if (fx0Var != null) {
            fx0Var.dismiss();
            this.J = null;
        }
        byte b = 0;
        byte b2 = 1;
        fx0 i = ug8.i(this.M, false, 1, null);
        try {
            str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e) {
            fa4.g(e, true);
            str2 = str;
        }
        i.P = str2;
        i.Q = false;
        i.R = true;
        CharSequence[] charSequenceArr = {k96.M0(2131747624, null), k96.M0(2131751755, null)};
        fe feVar = new fe(this, str, b2);
        i.M = charSequenceArr;
        i.L = feVar;
        i.I0 = new at(this, b);
        Y(i);
    }

    public final void Y(fx0 fx0Var) {
        if (this.M != null) {
            byte b = 1;
            try {
                fx0 fx0Var2 = this.l0;
                if (fx0Var2 != null) {
                    fx0Var2.dismiss();
                    this.l0 = null;
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
            try {
                this.l0 = fx0Var;
                fx0Var.setCanceledOnTouchOutside(true);
                this.l0.setOnDismissListener(new at(this, b));
                fx0Var.show();
            } catch (Exception e2) {
                fa4.g(e2, true);
            }
        }
    }

    public final void Z(boolean z) {
        gl.r(this.k0);
        wt wtVar = this.i0;
        if (!z) {
            wtVar.e0.a(true, 1.0f);
            return;
        }
        wtVar.e0.a(false, 0.0f);
        this.i0.e0.a(true, 0.3f);
        gl.e3(this.k0, 100L);
    }

    @Override // vg5
    public final void a(dx dxVar, thb thbVar) {
        String str;
        String str2;
        m46 m46Var;
        if (thbVar == null || (str = thbVar.b) == null) {
            return;
        }
        fx0 fx0Var = this.J;
        vt vtVar = null;
        if (fx0Var != null) {
            fx0Var.dismiss();
            this.J = null;
        }
        int lastIndexOf = str.lastIndexOf(35);
        boolean z = false;
        if (lastIndexOf != -1) {
            boolean isEmpty = TextUtils.isEmpty(dxVar.F.cached_page.url);
            TLRPC.WebPage webPage = dxVar.F;
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
        bw bwVar = this.d;
        if (bwVar != null && (m46Var = this.b) != null) {
            vtVar = new vt(this, bwVar, m46Var);
        }
        O(str, str2, vtVar);
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
        new u21(frameLayout, null).G(R.raw.chats_infotip, 4, gl.O2(k96.M0(2131752862, null), -1, 0, new ts(this, (byte) 10), null)).k(true);
    }

    @Override // vg5
    public final boolean b(dx dxVar, TL_iv.PageBlock pageBlock) {
        int indexOf;
        List list;
        org.telegram.ui.ActionBar.d dVar = this.N;
        if (dVar != null && dVar.getParentActivity() != null) {
            if (!(pageBlock instanceof TL_iv.pageBlockVideo) || cx.g(dxVar.F, pageBlock)) {
                ArrayList arrayList = new ArrayList(dxVar.f);
                indexOf = dxVar.f.indexOf(pageBlock);
                list = arrayList;
            } else {
                list = Collections.singletonList(pageBlock);
                indexOf = 0;
            }
            PhotoViewer r0 = PhotoViewer.r0();
            r0.S1(null, this.N, null);
            if (r0.m1(null, null, null, null, null, null, null, indexOf, new ew(this, list), null, 0L, 0L, 0L, true, new lw(this, dxVar.F, list), null)) {
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
        ofFloat.addUpdateListener(new us(this, (byte) 1));
        this.Z0.addListener(new y7((byte) 2, (Object) this, z));
        this.Z0.setDuration(320L);
        this.Z0.setInterpolator(s33.h);
        this.Z0.start();
    }

    public final void c0(int i, Object obj, boolean z) {
        if (obj != null) {
            if ((!(obj instanceof TLRPC.WebPage) || ((TLRPC.WebPage) obj).cached_page == null) && !(obj instanceof zv)) {
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
                sw swVar = this.L;
                if (swVar != null) {
                    swVar.y();
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
                    Point point = gl.q;
                    mVar2.setTranslationX(point.x);
                    this.w0.playTogether(ObjectAnimator.ofFloat(this.v0[0], (Property<m, Float>) View.TRANSLATION_X, point.x, 0.0f));
                } else if (i == -1) {
                    this.v0[0].setTranslationX(0.0f);
                    this.w0.playTogether(ObjectAnimator.ofFloat(this.v0[1], (Property<m, Float>) View.TRANSLATION_X, 0.0f, gl.q.x));
                }
                this.w0.setDuration(320L);
                this.w0.setInterpolator(s33.h);
                this.w0.addListener(new c(this, i2));
                this.g0.f = true;
                wt wtVar = this.i0;
                m mVar3 = this.v0[0];
                wtVar.setMenuColors((mVar3 == null || !gba.s0) ? bkb.w0(null, bkb.Fl, false) : mVar3.getBackgroundColor());
                wt wtVar2 = this.i0;
                m mVar4 = this.v0[0];
                wtVar2.d((mVar4 == null || !gba.s0) ? bkb.w0(null, bkb.Fl, false) : mVar4.getActionBarColor(), true);
                wt wtVar3 = this.i0;
                m mVar5 = this.v0[0];
                wtVar3.setIsTonsite(mVar5 != null && mVar5.d());
                wt wtVar4 = this.i0;
                m mVar6 = this.v0[0];
                wtVar4.setIsLocal(mVar6 != null && mVar6.c());
                AnimatorSet animatorSet = this.w0;
                Objects.requireNonNull(animatorSet);
                gl.d3(new pt(animatorSet, (byte) 0));
            }
            if (!z) {
                this.Q0.e(true);
            }
            dx dxVar = this.v0[z ? 1 : 0].c;
            if (z) {
                obj = b00.f(2, this.e0);
            }
            this.v0[z ? 1 : 0].a();
            if (obj instanceof TLRPC.WebPage) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj;
                this.v0[z ? 1 : 0].setWeb(null);
                this.v0[z ? 1 : 0].setType(0);
                TL_iv.Page page = webPage.cached_page;
                dxVar.H = page.rtl;
                dxVar.F = webPage;
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
                                    dxVar.G = (TL_iv.pageBlockChannel) pageBlock2;
                                }
                            }
                        }
                    } else if (i3 == 1 && dxVar.G != null) {
                        i3++;
                    }
                    dxVar.F(dxVar, pageBlock, 0, 0, i3 == size + (-1) ? i3 : 0);
                    i3++;
                }
                dxVar.f();
                if (this.e0.size() == 1 || i == -1) {
                    SharedPreferences sharedPreferences = org.telegram.messenger.a.b.getSharedPreferences("articles", 0);
                    String str = "article" + webPage.id;
                    int i4 = sharedPreferences.getInt(str, -1);
                    boolean z2 = sharedPreferences.getBoolean(str.concat("r"), true);
                    Point point2 = gl.q;
                    int i5 = z2 == (point2.x <= point2.y ? 0 : 1) ? sharedPreferences.getInt(str.concat("o"), 0) - this.v0[z ? 1 : 0].b.getPaddingTop() : gl.L(10.0f);
                    if (i4 != -1) {
                        this.v0[z ? 1 : 0].d.g1(i4, i5);
                    }
                } else {
                    t26 t26Var = this.v0[z ? 1 : 0].d;
                    sw swVar2 = this.L;
                    t26Var.g1(swVar2 == null ? 0 : 1, swVar2 != null ? gl.L(32.0f) : 0);
                }
            } else if (obj instanceof zv) {
                this.v0[z ? 1 : 0].setType(1);
                this.v0[z ? 1 : 0].f();
                this.v0[z ? 1 : 0].setWeb((zv) obj);
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
        zv zvVar = new zv();
        zvVar.x = str;
        this.e0.add(zvVar);
        this.i0.h(false);
        c0(i, zvVar, false);
    }

    public final void d0() {
        m[] mVarArr;
        m mVar;
        if (this.i0 == null || (mVar = (mVarArr = this.v0)[0]) == null || mVarArr[1] == null) {
            return;
        }
        float translationX = mVar.getVisibility() != 0 ? 0.0f : 1.0f - (this.v0[0].getTranslationX() / this.v0[0].getWidth());
        float f = 1.0f - translationX;
        wt wtVar = this.i0;
        wtVar.d[0] = this.v0[0].getProgress();
        wtVar.invalidate();
        wt wtVar2 = this.i0;
        wtVar2.d[1] = this.v0[1].getProgress();
        wtVar2.invalidate();
        this.i0.setTransitionProgress(f);
        wt wtVar3 = this.i0;
        if (!wtVar3.a0 && !wtVar3.U) {
            ArticleViewer$WindowView articleViewer$WindowView = this.g0;
            if (articleViewer$WindowView.e || articleViewer$WindowView.f) {
                boolean G = G();
                ArrayList arrayList = this.e0;
                if (G || arrayList.size() > 1) {
                    float R1 = gl.R1((this.v0[0].s || arrayList.size() > 1) ? 1.0f : 0.0f, (this.v0[1].s || arrayList.size() > 2) ? 1.0f : 0.0f, f);
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
        wt wtVar4 = this.i0;
        int actionBarColor = this.v0[0].getActionBarColor();
        ArticleViewer$WindowView articleViewer$WindowView2 = this.g0;
        wtVar4.b(0, this.b1.a(actionBarColor, articleViewer$WindowView2.e || articleViewer$WindowView2.f));
        wt wtVar5 = this.i0;
        int actionBarColor2 = this.v0[1].getActionBarColor();
        ArticleViewer$WindowView articleViewer$WindowView3 = this.g0;
        wtVar5.b(1, this.c1.a(actionBarColor2, articleViewer$WindowView3.e || articleViewer$WindowView3.f));
        this.i0.d(bm2.f(f, this.v0[0].getActionBarColor(), this.v0[1].getActionBarColor()), false);
        wt wtVar6 = this.i0;
        m[] mVarArr2 = this.v0;
        wtVar6.setMenuType((translationX > 0.5f ? mVarArr2[0] : mVarArr2[1]).a);
        sw swVar = this.L;
        if (swVar != null) {
            swVar.c.invalidate();
            return;
        }
        ArticleViewer$WindowView articleViewer$WindowView4 = this.g0;
        if (articleViewer$WindowView4 != null) {
            articleViewer$WindowView4.invalidate();
        }
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        bu buVar;
        k27 messageObject;
        if (i == kk7.g2) {
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
                    if (childAt instanceof bu) {
                        ((bu) childAt).a(true);
                    }
                }
                i3++;
            }
        } else if (i == kk7.e2 || i == kk7.f2) {
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
                    if (childAt2 instanceof bu) {
                        bu buVar2 = (bu) childAt2;
                        if (buVar2.getMessageObject() != null) {
                            buVar2.a(true);
                        }
                    }
                }
                i5++;
            }
        } else if (i == kk7.d2) {
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
                        if ((childAt3 instanceof bu) && (messageObject = (buVar = (bu) childAt3).getMessageObject()) != null && messageObject.e1() == num.intValue()) {
                            k27 k27Var = MediaController.w().v0;
                            if (k27Var != null) {
                                messageObject.b0 = k27Var.b0;
                                messageObject.i0 = k27Var.i0;
                                messageObject.j0 = k27Var.j0;
                                buVar.b();
                            }
                        } else {
                            i8++;
                        }
                    }
                }
                i7++;
            }
        } else {
            if (i != kk7.k4 || this.v0 == null) {
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
                    if (childAt4 instanceof uv) {
                        ((uv) childAt4).e.invalidate();
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
        hn hnVar = this.u0;
        if (size == 0) {
            hnVar.setText(k96.M0(2131747975, null));
        } else if (size == 1) {
            hnVar.setText(k96.M0(2131747634, null));
        } else {
            hnVar.setText(String.format(k96.J0(size, "CountOfResults"), Integer.valueOf(i + 1), Integer.valueOf(size)));
        }
    }

    public final void g0(boolean z) {
        boolean z2 = false;
        this.i0.g(0, this.v0[0].getTitle(), z);
        this.i0.f(0, this.v0[0].getSubtitle());
        this.i0.e(0, this.v0[0].e() && this.v0[0].getWebView() != null && this.v0[0].getWebView().F);
        this.i0.g(1, this.v0[1].getTitle(), z);
        this.i0.f(1, this.v0[1].getSubtitle());
        wt wtVar = this.i0;
        if (this.v0[1].e() && this.v0[1].getWebView() != null && this.v0[1].getWebView().F) {
            z2 = true;
        }
        wtVar.e(1, z2);
    }

    public final void h() {
        this.L0 = false;
        aw awVar = this.M0;
        if (awVar != null) {
            this.g0.removeCallbacks(awVar);
            this.M0 = null;
        }
        aw awVar2 = this.N0;
        if (awVar2 != null) {
            this.g0.removeCallbacks(awVar2);
            this.N0 = null;
        }
    }

    public final void j(dt dtVar) {
        if (this.K0 == gl.L(56.0f)) {
            if (dtVar != null) {
                dtVar.run();
                return;
            }
            return;
        }
        ValueAnimator duration = ValueAnimator.ofObject(new IntEvaluator(), Integer.valueOf(this.K0), Integer.valueOf(gl.L(56.0f))).setDuration(180L);
        duration.setInterpolator(new DecelerateInterpolator());
        duration.addUpdateListener(new us(this, (byte) 0));
        duration.addListener(new g0(dtVar, (byte) 11));
        if (dtVar != null) {
            duration.setDuration(duration.getDuration() / 2);
        }
        duration.start();
    }

    public final void k() {
        xv xvVar;
        hw hwVar = this.v0[0].b;
        if (hwVar == null || !this.X) {
            return;
        }
        float measuredHeight = hwVar.getMeasuredHeight() / 2.0f;
        float f = 0.0f;
        xv xvVar2 = null;
        for (int i = 0; i < hwVar.getChildCount(); i++) {
            View childAt = hwVar.getChildAt(i);
            if (childAt instanceof xv) {
                float measuredHeight2 = (childAt.getMeasuredHeight() / 2.0f) + childAt.getTop();
                if (xvVar2 == null || Math.abs(measuredHeight - measuredHeight2) < Math.abs(measuredHeight - f)) {
                    xvVar2 = (xv) childAt;
                    f = measuredHeight2;
                }
            }
        }
        boolean z = PhotoViewer.r0().f;
        if (z || ((xvVar = this.y) != null && xvVar != xvVar2 && this.x != null)) {
            VideoPlayerHolderBase videoPlayerHolderBase = this.x;
            if (videoPlayerHolderBase != null) {
                xv xvVar3 = this.y;
                long j = xvVar3.M.video_id;
                yv a = yv.a(videoPlayerHolderBase, xvVar3);
                xvVar3.c(a);
                this.E.k(a, j);
                xv xvVar4 = this.y;
                yv yvVar = xvVar4.N;
                if (yvVar != null) {
                    Bitmap bitmap = yvVar.b;
                    if (bitmap != null) {
                        xvVar4.e.f0(bitmap);
                    }
                    this.y.e(false);
                }
                this.x.release(null);
            }
            this.x = null;
            this.y = null;
        }
        if (z || xvVar2 == null) {
            return;
        }
        int i2 = xv.W;
        vg5 vg5Var = xvVar2.a;
        if (xvVar2.P != null && vg5Var.x == null) {
            vg5Var.x = new wv(xvVar2).with(xvVar2.n);
            TLRPC.Document document = xvVar2.P;
            for (int i3 = 0; i3 < document.attributes.size(); i3++) {
                if (document.attributes.get(i3) instanceof TLRPC.TL_documentAttributeVideo) {
                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i3);
                    xvVar2.h.a(tL_documentAttributeVideo.w / tL_documentAttributeVideo.h, 0);
                }
            }
            TLRPC.WebPage webPage = xvVar2.b.F;
            Uri j2 = webPage != null ? kb4.j(((o) vg5Var).Y, webPage, document) : null;
            if (j2 != null) {
                VideoPlayerHolderBase videoPlayerHolderBase2 = vg5Var.x;
                yv yvVar2 = xvVar2.N;
                videoPlayerHolderBase2.seekTo(yvVar2 == null ? 0L : yvVar2.a);
                vg5Var.x.preparePlayer(j2, true, 1.0f);
                vg5Var.x.play();
            }
        }
        this.y = xvVar2;
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
        sw swVar = this.L;
        if (swVar != null) {
            swVar.a(false);
            return;
        }
        if (this.Q.getVisibility() == 0) {
            if (this.P != null) {
                this.Q.setVisibility(4);
                this.T.onCustomViewHidden();
                this.Q.removeView(this.P);
                this.P = null;
            } else {
                stc stcVar = this.G0;
                if (stcVar != null && stcVar.U) {
                    stcVar.U = false;
                    stcVar.m();
                    stcVar.l(false);
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
        wt wtVar = this.i0;
        if (wtVar.U) {
            wtVar.h(false);
            return;
        }
        if (wtVar.a0) {
            wtVar.k(false);
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
                Object l = tb4.l(1, arrayList);
                if (l instanceof zv) {
                    ((zv) l).a();
                }
                if (l instanceof TLRPC.WebPage) {
                    ctc.o((TLRPC.WebPage) l);
                }
                c0(-1, arrayList.get(arrayList.size() - 1), false);
                return;
            }
        }
        kk7.f(this.Y).n(this, kk7.d2);
        kk7.f(this.Y).n(this, kk7.e2);
        kk7.f(this.Y).n(this, kk7.f2);
        kk7.f(this.Y).n(this, kk7.g2);
        kk7.f(this.Y).n(this, kk7.k4);
        a06 a06Var = this.W0;
        if (a06Var != null) {
            a06Var.a();
            this.W0 = null;
        }
        this.N = null;
        try {
            fx0 fx0Var = this.l0;
            if (fx0Var != null) {
                fx0Var.dismiss();
                this.l0 = null;
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArticleViewer$WindowView articleViewer$WindowView = this.g0;
        Property property = View.ALPHA;
        animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer$WindowView, (Property<ArticleViewer$WindowView, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.h0, (Property<a, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.g0, (Property<ArticleViewer$WindowView, Float>) View.TRANSLATION_X, 0.0f, gl.L(56.0f)));
        this.a0 = (byte) 2;
        this.b0 = new ts(this, (byte) 9);
        animatorSet.setDuration(150L);
        animatorSet.setInterpolator(this.d0);
        animatorSet.addListener(new g0(this, (byte) 12));
        this.c0 = System.currentTimeMillis();
        this.h0.setLayerType(2, null);
        animatorSet.start();
        while (true) {
            vf6 vf6Var = this.E;
            if (i >= vf6Var.m()) {
                vf6Var.b();
                return;
            }
            yv yvVar = (yv) vf6Var.n(i);
            Bitmap bitmap = yvVar.b;
            if (bitmap != null) {
                bitmap.recycle();
                yvVar.b = null;
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
            if (obj instanceof zv) {
                m mVar = this.v0[0];
                if (mVar != null && mVar.L == obj) {
                    ((zv) obj).c(mVar);
                }
                m mVar2 = this.v0[1];
                if (mVar2 != null && mVar2.L == obj) {
                    ((zv) obj).c(mVar2);
                }
                ((zv) obj).a();
            } else if (obj instanceof TLRPC.WebPage) {
                ctc.o((TLRPC.WebPage) obj);
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
                fa4.g(e, true);
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
            fa4.g(e2, true);
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
        this.T0 = new on(new int[]{kk7.r, kk7.s});
        this.U0 = new yc[2];
        this.Y0 = -1;
        ts tsVar = new ts(this, (byte) 2);
        s33 s33Var = s33.h;
        this.b1 = new kl(tsVar, 320L, s33Var);
        this.c1 = new kl(new ts(this, (byte) 3), 320L, s33Var);
        this.K = false;
        this.L = null;
    }
}
