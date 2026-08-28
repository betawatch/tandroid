package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.widget.ImageView;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g81 extends ViewGroup implements h61, AudioManager.OnAudioFocusChangeListener {
    public static final Pattern h0 = Pattern.compile("(?:youtube(?:-nocookie)?\\.com/(?:[^/\\n\\s]+/\\S+/|(?:v|e(?:mbed)?)/|\\S*?[?&]v=)|youtu\\.be/)([a-zA-Z0-9_-]{11})");
    public static final Pattern i0 = Pattern.compile("https?://(?:(?:www|(player))\\.)?vimeo(pro)?\\.com/(?!(?:channels|album)/[^/?#]+/?(?:$|[?#])|[^/]+/review/|ondemand/)(?:.*?/)?(?:(?:play_redirect_hls|moogaloop\\.swf)\\?clip_id=)?(?:videos?/)?([0-9]+)(?:/[\\da-f]+)?/?(?:[?&].*)?(?:[#].*)?$");
    public static final Pattern j0 = Pattern.compile("(?:coub:|https?://(?:coub\\.com/(?:view|embed|coubs)/|c-cdn\\.coub\\.com/fb-player\\.swf\\?.*\\bcoub(?:ID|id)=))([\\da-z]+)");
    public static final Pattern k0 = Pattern.compile("^https?://(?:www\\.)?aparat\\.com/(?:v/|video/video/embed/videohash/)([a-zA-Z0-9]+)");
    public static final Pattern l0 = Pattern.compile("https?://clips\\.twitch\\.tv/(?:[^/]+/)*([^/?#&]+)");
    public static final Pattern m0 = Pattern.compile("https?://(?:(?:www\\.)?twitch\\.tv/|player\\.twitch\\.tv/\\?.*?\\bchannel=)([^/#?]+)");
    public static final Pattern n0 = Pattern.compile("fileList\\s*=\\s*JSON\\.parse\\('([^']+)'\\)");
    public static final Pattern o0 = Pattern.compile("clipInfo\\s*=\\s*(\\{[^']+\\});");
    public static final Pattern p0 = Pattern.compile("\"sts\"\\s*:\\s*(\\d+)");
    public static final Pattern q0 = Pattern.compile("\"assets\":.+?\"js\":\\s*(\"[^\"]+\")");
    public static final Pattern r0 = Pattern.compile("\\.sig\\|\\|([a-zA-Z0-9$]+)\\(");
    public static final Pattern s0 = Pattern.compile("[\"']signature[\"']\\s*,\\s*([a-zA-Z0-9$]+)\\(");
    public static final Pattern t0 = Pattern.compile("var\\s");
    public static final Pattern u0 = Pattern.compile("return(?:\\s+|$)");
    public static final Pattern v0 = Pattern.compile("[()]");
    public static final Pattern w0 = Pattern.compile(".*?-([a-zA-Z0-9_-]+)(?:/watch_as3|/html5player(?:-new)?|(?:/[a-z]{2}_[A-Z]{2})?/base)?\\.([a-z]+)$");
    public String A;
    public String B;
    public String C;
    public boolean D;
    public final boolean E;
    public boolean F;
    public boolean G;
    public long H;
    public boolean I;
    public float J;
    public int K;
    public boolean L;
    public final Paint M;
    public AsyncTask N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public final RadialProgressView T;
    public final ImageView U;
    public final ImageView V;
    public final ImageView W;
    public final k61 a;
    public AnimatorSet a0;
    public final z71 b;
    public final c81 b0;
    public final gf0 c;
    public int c0;
    public final TextureView d;
    public int d0;
    public final ImageView e;
    public final y71 e0;
    public final ViewGroup f;
    public final dh.i f0;
    public final y71 g0;
    public Bitmap h;
    public TextureView n;
    public int r;
    public boolean s;
    public final d81 v;
    public boolean w;
    public String x;
    public String y;

    public g81(Context context, boolean z10, d81 d81Var) {
        super(context);
        this.E = true;
        Paint paint = new Paint();
        this.M = paint;
        this.e0 = new y71(this, 0);
        this.f0 = new dh.i(this, 4);
        this.g0 = new y71(this, 1);
        setWillNotDraw(false);
        this.v = d81Var;
        paint.setColor(-16777216);
        gf0 gf0Var = new gf0(this, context, 1);
        this.c = gf0Var;
        addView(gf0Var, g7.e6.e(-1, -1, 17));
        z71 z71Var = new z71(context, context);
        this.b = z71Var;
        final w71 w71Var = new w71(this);
        z71Var.addJavascriptInterface(new Object(w71Var) { // from class: org.telegram.ui.Components.WebPlayerView$JavaScriptInterface
            public final w71 a;

            {
                this.a = w71Var;
            }

            @JavascriptInterface
            public void returnResultToJava(String str) {
                g81 g81Var = (g81) this.a.a;
                AsyncTask asyncTask = g81Var.N;
                if (asyncTask == null || asyncTask.isCancelled()) {
                    return;
                }
                AsyncTask asyncTask2 = g81Var.N;
                if (asyncTask2 instanceof f81) {
                    f81 f81Var = (f81) asyncTask2;
                    String[] strArr = f81Var.c;
                    strArr[0] = strArr[0].replace(f81Var.d, "/signature/" + str);
                    f81Var.b.countDown();
                }
            }
        }, "JavaScriptInterface");
        WebSettings settings = z71Var.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup g10 = d81Var.g();
        this.f = g10;
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        if (g10 != null) {
            g10.addView(textureView);
        } else {
            gf0Var.addView(textureView, g7.e6.e(-1, -1, 17));
        }
        if (g10 != null) {
            ImageView imageView = new ImageView(context);
            this.e = imageView;
            imageView.setBackgroundColor(-65536);
            imageView.setPivotX(0.0f);
            imageView.setPivotY(0.0f);
            imageView.setVisibility(4);
            g10.addView(imageView);
        }
        k61 k61Var = new k61();
        this.a = k61Var;
        k61Var.F = this;
        k61Var.W(textureView);
        c81 c81Var = new c81(this, context);
        this.b0 = c81Var;
        if (g10 != null) {
            g10.addView(c81Var);
        } else {
            addView(c81Var, g7.e6.c(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.T = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, g7.e6.e(48, 48, 17));
        ImageView imageView2 = new ImageView(context);
        this.U = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        c81Var.addView(imageView2, g7.e6.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        final int i9 = 0;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.x71
            public final /* synthetic */ g81 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i9) {
                    case 0:
                        g81 g81Var = this.b;
                        if (g81Var.w && !g81Var.O && !g81Var.S && g81Var.I) {
                            g81Var.P = !g81Var.P;
                            g81Var.l(true);
                            break;
                        }
                        break;
                    case 1:
                        g81 g81Var2 = this.b;
                        k61 k61Var2 = g81Var2.a;
                        if (g81Var2.w && g81Var2.x != null) {
                            if (k61Var2.d == null) {
                                g81Var2.i();
                            }
                            if (k61Var2.z()) {
                                k61Var2.C();
                            } else {
                                g81Var2.R = false;
                                k61Var2.D();
                            }
                            g81Var2.n();
                            break;
                        }
                        break;
                    default:
                        g81 g81Var3 = this.b;
                        ViewGroup viewGroup = g81Var3.f;
                        boolean z11 = g81Var3.E;
                        d81 d81Var2 = g81Var3.v;
                        c81 c81Var2 = g81Var3.b0;
                        gf0 gf0Var2 = g81Var3.c;
                        TextureView textureView2 = g81Var3.d;
                        if (textureView2 != null && d81Var2.h() && !g81Var3.O && !g81Var3.S && g81Var3.I) {
                            g81Var3.S = true;
                            if (!g81Var3.Q) {
                                g81Var3.P = false;
                                d81Var2.i(true, g81Var3.g0, gf0Var2.getAspectRatio(), z11);
                                break;
                            } else {
                                ViewGroup viewGroup2 = (ViewGroup) gf0Var2.getParent();
                                if (viewGroup2 != g81Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(gf0Var2);
                                    }
                                    g81Var3.addView(gf0Var2, 0, g7.e6.e(-1, -1, 17));
                                    gf0Var2.measure(View.MeasureSpec.makeMeasureSpec(g81Var3.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(g81Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), TLObject.FLAG_30));
                                }
                                Bitmap bitmap = g81Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    g81Var3.h = null;
                                }
                                g81Var3.O = true;
                                g81Var3.Q = false;
                                g81Var3.n();
                                g81Var3.o();
                                g81Var3.k();
                                g81Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    gf0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) c81Var2.getParent();
                                if (viewGroup3 != g81Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(c81Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(c81Var2);
                                    } else {
                                        g81Var3.addView(c81Var2, 1);
                                    }
                                }
                                c81Var2.d(false, false);
                                d81Var2.i(false, null, gf0Var2.getAspectRatio(), z11);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.V = imageView3;
        imageView3.setScaleType(scaleType);
        c81Var.addView(imageView3, g7.e6.e(48, 48, 17));
        final int i10 = 1;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.x71
            public final /* synthetic */ g81 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        g81 g81Var = this.b;
                        if (g81Var.w && !g81Var.O && !g81Var.S && g81Var.I) {
                            g81Var.P = !g81Var.P;
                            g81Var.l(true);
                            break;
                        }
                        break;
                    case 1:
                        g81 g81Var2 = this.b;
                        k61 k61Var2 = g81Var2.a;
                        if (g81Var2.w && g81Var2.x != null) {
                            if (k61Var2.d == null) {
                                g81Var2.i();
                            }
                            if (k61Var2.z()) {
                                k61Var2.C();
                            } else {
                                g81Var2.R = false;
                                k61Var2.D();
                            }
                            g81Var2.n();
                            break;
                        }
                        break;
                    default:
                        g81 g81Var3 = this.b;
                        ViewGroup viewGroup = g81Var3.f;
                        boolean z11 = g81Var3.E;
                        d81 d81Var2 = g81Var3.v;
                        c81 c81Var2 = g81Var3.b0;
                        gf0 gf0Var2 = g81Var3.c;
                        TextureView textureView2 = g81Var3.d;
                        if (textureView2 != null && d81Var2.h() && !g81Var3.O && !g81Var3.S && g81Var3.I) {
                            g81Var3.S = true;
                            if (!g81Var3.Q) {
                                g81Var3.P = false;
                                d81Var2.i(true, g81Var3.g0, gf0Var2.getAspectRatio(), z11);
                                break;
                            } else {
                                ViewGroup viewGroup2 = (ViewGroup) gf0Var2.getParent();
                                if (viewGroup2 != g81Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(gf0Var2);
                                    }
                                    g81Var3.addView(gf0Var2, 0, g7.e6.e(-1, -1, 17));
                                    gf0Var2.measure(View.MeasureSpec.makeMeasureSpec(g81Var3.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(g81Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), TLObject.FLAG_30));
                                }
                                Bitmap bitmap = g81Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    g81Var3.h = null;
                                }
                                g81Var3.O = true;
                                g81Var3.Q = false;
                                g81Var3.n();
                                g81Var3.o();
                                g81Var3.k();
                                g81Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    gf0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) c81Var2.getParent();
                                if (viewGroup3 != g81Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(c81Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(c81Var2);
                                    } else {
                                        g81Var3.addView(c81Var2, 1);
                                    }
                                }
                                c81Var2.d(false, false);
                                d81Var2.i(false, null, gf0Var2.getAspectRatio(), z11);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        if (z10) {
            ImageView imageView4 = new ImageView(context);
            this.W = imageView4;
            imageView4.setScaleType(scaleType);
            c81Var.addView(imageView4, g7.e6.e(56, 48, 53));
            final int i11 = 2;
            imageView4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.x71
                public final /* synthetic */ g81 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            g81 g81Var = this.b;
                            if (g81Var.w && !g81Var.O && !g81Var.S && g81Var.I) {
                                g81Var.P = !g81Var.P;
                                g81Var.l(true);
                                break;
                            }
                            break;
                        case 1:
                            g81 g81Var2 = this.b;
                            k61 k61Var2 = g81Var2.a;
                            if (g81Var2.w && g81Var2.x != null) {
                                if (k61Var2.d == null) {
                                    g81Var2.i();
                                }
                                if (k61Var2.z()) {
                                    k61Var2.C();
                                } else {
                                    g81Var2.R = false;
                                    k61Var2.D();
                                }
                                g81Var2.n();
                                break;
                            }
                            break;
                        default:
                            g81 g81Var3 = this.b;
                            ViewGroup viewGroup = g81Var3.f;
                            boolean z11 = g81Var3.E;
                            d81 d81Var2 = g81Var3.v;
                            c81 c81Var2 = g81Var3.b0;
                            gf0 gf0Var2 = g81Var3.c;
                            TextureView textureView2 = g81Var3.d;
                            if (textureView2 != null && d81Var2.h() && !g81Var3.O && !g81Var3.S && g81Var3.I) {
                                g81Var3.S = true;
                                if (!g81Var3.Q) {
                                    g81Var3.P = false;
                                    d81Var2.i(true, g81Var3.g0, gf0Var2.getAspectRatio(), z11);
                                    break;
                                } else {
                                    ViewGroup viewGroup2 = (ViewGroup) gf0Var2.getParent();
                                    if (viewGroup2 != g81Var3) {
                                        if (viewGroup2 != null) {
                                            viewGroup2.removeView(gf0Var2);
                                        }
                                        g81Var3.addView(gf0Var2, 0, g7.e6.e(-1, -1, 17));
                                        gf0Var2.measure(View.MeasureSpec.makeMeasureSpec(g81Var3.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(g81Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), TLObject.FLAG_30));
                                    }
                                    Bitmap bitmap = g81Var3.h;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        g81Var3.h = null;
                                    }
                                    g81Var3.O = true;
                                    g81Var3.Q = false;
                                    g81Var3.n();
                                    g81Var3.o();
                                    g81Var3.k();
                                    g81Var3.m();
                                    textureView2.setVisibility(4);
                                    if (viewGroup != null) {
                                        viewGroup.addView(textureView2);
                                    } else {
                                        gf0Var2.addView(textureView2);
                                    }
                                    ViewGroup viewGroup3 = (ViewGroup) c81Var2.getParent();
                                    if (viewGroup3 != g81Var3) {
                                        if (viewGroup3 != null) {
                                            viewGroup3.removeView(c81Var2);
                                        }
                                        if (viewGroup != null) {
                                            viewGroup.addView(c81Var2);
                                        } else {
                                            g81Var3.addView(c81Var2, 1);
                                        }
                                    }
                                    c81Var2.d(false, false);
                                    d81Var2.i(false, null, gf0Var2.getAspectRatio(), z11);
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
        }
        n();
        k();
        m();
        o();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if ((r2.find() ? r2.group(3) : null) != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if ((r2.find() ? r2.group(1) : null) != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        if ((r2.find() ? r2.group(1) : null) != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
    
        if ((r2.find() ? r2.group(1) : null) != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        if ((r2.find() ? r2.group(1) : null) != null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(String str) {
        if (str == null) {
            return false;
        }
        if (!str.endsWith(".mp4")) {
            try {
                Matcher matcher = h0.matcher(str);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        try {
            Matcher matcher2 = j0.matcher(str);
            return (matcher2.find() ? matcher2.group(1) : null) != null;
        } catch (Exception e11) {
            FileLog.e(e11);
            return false;
        }
        try {
            Matcher matcher3 = k0.matcher(str);
        } catch (Exception e12) {
            FileLog.e(e12);
        }
        try {
            Matcher matcher4 = m0.matcher(str);
        } catch (Exception e13) {
            FileLog.e(e13);
        }
        try {
            Matcher matcher5 = i0.matcher(str);
        } catch (Exception e14) {
            FileLog.e(e14);
        }
        try {
            Matcher matcher6 = l0.matcher(str);
        } catch (Exception e15) {
            FileLog.e(e15);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0170, code lost:
    
        if (r3 == (-1)) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0188 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String c(AsyncTask asyncTask, String str, HashMap hashMap, boolean z10) {
        URLConnection uRLConnection;
        boolean z11;
        InputStream inputStream;
        StringBuilder sb2;
        boolean z12;
        URL url;
        InputStream inputStream2;
        boolean z13 = true;
        try {
            url = new URL(str);
            uRLConnection = url.openConnection();
        } catch (Throwable th) {
            th = th;
            uRLConnection = null;
        }
        try {
            uRLConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
            if (z10) {
                uRLConnection.addRequestProperty("Accept-Encoding", "gzip, deflate");
            }
            uRLConnection.addRequestProperty("Accept-Language", "en-us,en;q=0.5");
            uRLConnection.addRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
            uRLConnection.addRequestProperty("Accept-Charset", "ISO-8859-1,utf-8;q=0.7,*;q=0.7");
            if (hashMap != null) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    uRLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            uRLConnection.setConnectTimeout(5000);
            uRLConnection.setReadTimeout(5000);
            if (uRLConnection instanceof HttpURLConnection) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
                httpURLConnection.setInstanceFollowRedirects(true);
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 302 || responseCode == 301 || responseCode == 303) {
                    String headerField = httpURLConnection.getHeaderField("Location");
                    String headerField2 = httpURLConnection.getHeaderField("Set-Cookie");
                    url = new URL(headerField);
                    uRLConnection = url.openConnection();
                    uRLConnection.setRequestProperty("Cookie", headerField2);
                    uRLConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
                    if (z10) {
                        uRLConnection.addRequestProperty("Accept-Encoding", "gzip, deflate");
                    }
                    uRLConnection.addRequestProperty("Accept-Language", "en-us,en;q=0.5");
                    uRLConnection.addRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
                    uRLConnection.addRequestProperty("Accept-Charset", "ISO-8859-1,utf-8;q=0.7,*;q=0.7");
                    if (hashMap != null) {
                        for (Map.Entry entry2 : hashMap.entrySet()) {
                            uRLConnection.addRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                        }
                    }
                }
            }
            uRLConnection.connect();
            if (z10) {
                try {
                    inputStream2 = new GZIPInputStream(uRLConnection.getInputStream());
                } catch (Exception unused) {
                    uRLConnection = url.openConnection();
                    uRLConnection.connect();
                    inputStream2 = uRLConnection.getInputStream();
                }
            } else {
                inputStream2 = uRLConnection.getInputStream();
            }
            inputStream = inputStream2;
            z11 = true;
        } catch (Throwable th2) {
            th = th2;
            boolean z14 = !(th instanceof SocketTimeoutException) ? !(!(th instanceof UnknownHostException) && (!(th instanceof SocketException) ? (th instanceof FileNotFoundException) : !(th.getMessage() == null || !th.getMessage().contains("ECONNRESET")))) : ApplicationLoader.isNetworkOnline();
            FileLog.e(th);
            z11 = z14;
            inputStream = null;
            if (z11) {
            }
            if (z12) {
            }
        }
        if (z11) {
            sb2 = null;
            z12 = false;
        } else {
            try {
                if (uRLConnection instanceof HttpURLConnection) {
                    ((HttpURLConnection) uRLConnection).getResponseCode();
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            if (inputStream != null) {
                try {
                    byte[] bArr = new byte[32768];
                    sb2 = null;
                    while (true) {
                        try {
                            if (asyncTask.isCancelled()) {
                                break;
                            }
                            try {
                                int read = inputStream.read(bArr);
                                if (read > 0) {
                                    if (sb2 == null) {
                                        sb2 = new StringBuilder();
                                    }
                                    try {
                                        try {
                                            sb2.append(new String(bArr, 0, read, "UTF-8"));
                                        } catch (Exception e11) {
                                            e = e11;
                                            FileLog.e(e);
                                            z13 = false;
                                            z12 = z13;
                                            if (inputStream != null) {
                                            }
                                            if (z12) {
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        FileLog.e(th);
                                        z12 = false;
                                        if (inputStream != null) {
                                        }
                                        if (z12) {
                                        }
                                    }
                                }
                            } catch (Exception e12) {
                                e = e12;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                    z12 = z13;
                } catch (Throwable th5) {
                    th = th5;
                    sb2 = null;
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th6) {
                        FileLog.e(th6);
                    }
                }
            } else {
                sb2 = null;
            }
            z12 = false;
            if (inputStream != null) {
            }
        }
        if (z12) {
            return null;
        }
        return sb2.toString();
    }

    public static String d(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                Matcher matcher = j0.matcher(str);
                String group = matcher.find() ? matcher.group(1) : null;
                if (group != null) {
                    return group;
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                return null;
            }
        }
        return null;
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = h0.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    private View getControlView() {
        return this.b0;
    }

    private View getProgressView() {
        return this.T;
    }

    public final void b() {
        this.a.I();
        AsyncTask asyncTask = this.N;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.N = null;
        }
        this.b.stopLoading();
    }

    public final boolean f() {
        return this.Q || this.S;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x024d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(String str, TLRPC.Photo photo, Object obj, String str2, boolean z10) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        AsyncTask asyncTask;
        c81 c81Var;
        AnimatorSet animatorSet;
        String group;
        String group2;
        String group3;
        String group4;
        String group5;
        String d = d(str);
        if (d == null) {
            d = d(str2);
        }
        this.K = -1;
        if (d != null || str == null) {
            str3 = null;
            str4 = null;
        } else {
            if (!str.endsWith(".mp4")) {
                try {
                    if (str2 != null) {
                        try {
                            Uri parse = Uri.parse(str2);
                            String queryParameter = parse.getQueryParameter("t");
                            if (queryParameter == null) {
                                queryParameter = parse.getQueryParameter("time_continue");
                            }
                            if (queryParameter != null) {
                                if (queryParameter.contains("m")) {
                                    String[] split = queryParameter.split("m");
                                    this.K = (Utilities.parseInt((CharSequence) split[0]).intValue() * 60) + Utilities.parseInt((CharSequence) split[1]).intValue();
                                } else {
                                    this.K = Utilities.parseInt((CharSequence) queryParameter).intValue();
                                }
                            }
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                    }
                    Matcher matcher = h0.matcher(str);
                    group5 = matcher.find() ? matcher.group(1) : null;
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                if (group5 != null) {
                    str4 = group5;
                    if (str4 == null) {
                        try {
                            Matcher matcher2 = i0.matcher(str);
                            group = matcher2.find() ? matcher2.group(3) : null;
                        } catch (Exception e12) {
                            FileLog.e(e12);
                        }
                        if (group != null) {
                            str8 = group;
                            if (str8 == null) {
                                try {
                                    Matcher matcher3 = k0.matcher(str);
                                    group2 = matcher3.find() ? matcher3.group(1) : null;
                                } catch (Exception e13) {
                                    FileLog.e(e13);
                                }
                                if (group2 != null) {
                                    str7 = group2;
                                    if (str7 == null) {
                                        try {
                                            Matcher matcher4 = l0.matcher(str);
                                            group3 = matcher4.find() ? matcher4.group(1) : null;
                                        } catch (Exception e14) {
                                            FileLog.e(e14);
                                        }
                                        if (group3 != null) {
                                            str6 = group3;
                                            if (str6 == null) {
                                                try {
                                                    Matcher matcher5 = m0.matcher(str);
                                                    group4 = matcher5.find() ? matcher5.group(1) : null;
                                                } catch (Exception e15) {
                                                    FileLog.e(e15);
                                                }
                                                if (group4 != null) {
                                                    str5 = group4;
                                                    if (str5 == null) {
                                                        try {
                                                            Matcher matcher6 = j0.matcher(str);
                                                            String group6 = matcher6.find() ? matcher6.group(1) : null;
                                                            if (group6 != null) {
                                                                d = group6;
                                                            }
                                                        } catch (Exception e16) {
                                                            FileLog.e(e16);
                                                        }
                                                    }
                                                    str3 = null;
                                                    this.w = false;
                                                    this.R = false;
                                                    this.s = z10;
                                                    this.x = null;
                                                    this.A = null;
                                                    b();
                                                    this.I = false;
                                                    this.J = 1.0f;
                                                    asyncTask = this.N;
                                                    if (asyncTask != null) {
                                                        asyncTask.cancel(true);
                                                        this.N = null;
                                                    }
                                                    k();
                                                    o();
                                                    m();
                                                    n();
                                                    c81Var = this.b0;
                                                    if (photo != null) {
                                                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 80, true);
                                                        if (closestPhotoSizeWithSize != null) {
                                                            c81Var.a.setImage(null, null, ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "80_80_b", 0L, null, obj, 1);
                                                            this.L = true;
                                                        }
                                                    } else {
                                                        this.L = false;
                                                    }
                                                    animatorSet = this.a0;
                                                    if (animatorSet != null) {
                                                        animatorSet.cancel();
                                                        this.a0 = null;
                                                    }
                                                    c81Var.c(0);
                                                    if (str4 != null) {
                                                        this.C = str4;
                                                        str4 = null;
                                                    }
                                                    if (str3 != null) {
                                                        this.w = true;
                                                        this.x = str3;
                                                        this.y = "other";
                                                        if (this.s) {
                                                            i();
                                                        }
                                                        j(false, false);
                                                        c81Var.d(true, true);
                                                    } else {
                                                        if (str4 != null) {
                                                            f81 f81Var = new f81(this, str4);
                                                            f81Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                            this.N = f81Var;
                                                        } else if (str8 != null) {
                                                            a81 a81Var = new a81(this, str8, 4);
                                                            a81Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                            this.N = a81Var;
                                                        } else if (d != null) {
                                                            a81 a81Var2 = new a81(this, d, 1);
                                                            a81Var2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                            this.N = a81Var2;
                                                            this.D = true;
                                                        } else if (str7 != null) {
                                                            a81 a81Var3 = new a81(this, str7, 0);
                                                            a81Var3.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                            this.N = a81Var3;
                                                        } else if (str6 != null) {
                                                            a81 a81Var4 = new a81(this, str, 2);
                                                            a81Var4.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                            this.N = a81Var4;
                                                        } else if (str5 != null) {
                                                            a81 a81Var5 = new a81(this, str5, 3);
                                                            a81Var5.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                            this.N = a81Var5;
                                                            this.D = true;
                                                        }
                                                        c81Var.d(false, false);
                                                        j(true, false);
                                                    }
                                                    if (str4 != null && str8 == null && d == null && str7 == null && str3 == null && str6 == null && str5 == null) {
                                                        c81Var.setVisibility(8);
                                                        return false;
                                                    }
                                                    c81Var.setVisibility(0);
                                                    return true;
                                                }
                                            }
                                            str5 = null;
                                            if (str5 == null) {
                                            }
                                            str3 = null;
                                            this.w = false;
                                            this.R = false;
                                            this.s = z10;
                                            this.x = null;
                                            this.A = null;
                                            b();
                                            this.I = false;
                                            this.J = 1.0f;
                                            asyncTask = this.N;
                                            if (asyncTask != null) {
                                            }
                                            k();
                                            o();
                                            m();
                                            n();
                                            c81Var = this.b0;
                                            if (photo != null) {
                                            }
                                            animatorSet = this.a0;
                                            if (animatorSet != null) {
                                            }
                                            c81Var.c(0);
                                            if (str4 != null) {
                                            }
                                            if (str3 != null) {
                                            }
                                            if (str4 != null) {
                                            }
                                            c81Var.setVisibility(0);
                                            return true;
                                        }
                                    }
                                    str6 = null;
                                    if (str6 == null) {
                                    }
                                    str5 = null;
                                    if (str5 == null) {
                                    }
                                    str3 = null;
                                    this.w = false;
                                    this.R = false;
                                    this.s = z10;
                                    this.x = null;
                                    this.A = null;
                                    b();
                                    this.I = false;
                                    this.J = 1.0f;
                                    asyncTask = this.N;
                                    if (asyncTask != null) {
                                    }
                                    k();
                                    o();
                                    m();
                                    n();
                                    c81Var = this.b0;
                                    if (photo != null) {
                                    }
                                    animatorSet = this.a0;
                                    if (animatorSet != null) {
                                    }
                                    c81Var.c(0);
                                    if (str4 != null) {
                                    }
                                    if (str3 != null) {
                                    }
                                    if (str4 != null) {
                                    }
                                    c81Var.setVisibility(0);
                                    return true;
                                }
                            }
                            str7 = null;
                            if (str7 == null) {
                            }
                            str6 = null;
                            if (str6 == null) {
                            }
                            str5 = null;
                            if (str5 == null) {
                            }
                            str3 = null;
                            this.w = false;
                            this.R = false;
                            this.s = z10;
                            this.x = null;
                            this.A = null;
                            b();
                            this.I = false;
                            this.J = 1.0f;
                            asyncTask = this.N;
                            if (asyncTask != null) {
                            }
                            k();
                            o();
                            m();
                            n();
                            c81Var = this.b0;
                            if (photo != null) {
                            }
                            animatorSet = this.a0;
                            if (animatorSet != null) {
                            }
                            c81Var.c(0);
                            if (str4 != null) {
                            }
                            if (str3 != null) {
                            }
                            if (str4 != null) {
                            }
                            c81Var.setVisibility(0);
                            return true;
                        }
                    }
                    str8 = null;
                    if (str8 == null) {
                    }
                    str7 = null;
                    if (str7 == null) {
                    }
                    str6 = null;
                    if (str6 == null) {
                    }
                    str5 = null;
                    if (str5 == null) {
                    }
                    str3 = null;
                    this.w = false;
                    this.R = false;
                    this.s = z10;
                    this.x = null;
                    this.A = null;
                    b();
                    this.I = false;
                    this.J = 1.0f;
                    asyncTask = this.N;
                    if (asyncTask != null) {
                    }
                    k();
                    o();
                    m();
                    n();
                    c81Var = this.b0;
                    if (photo != null) {
                    }
                    animatorSet = this.a0;
                    if (animatorSet != null) {
                    }
                    c81Var.c(0);
                    if (str4 != null) {
                    }
                    if (str3 != null) {
                    }
                    if (str4 != null) {
                    }
                    c81Var.setVisibility(0);
                    return true;
                }
                str4 = null;
                if (str4 == null) {
                }
                str8 = null;
                if (str8 == null) {
                }
                str7 = null;
                if (str7 == null) {
                }
                str6 = null;
                if (str6 == null) {
                }
                str5 = null;
                if (str5 == null) {
                }
                str3 = null;
                this.w = false;
                this.R = false;
                this.s = z10;
                this.x = null;
                this.A = null;
                b();
                this.I = false;
                this.J = 1.0f;
                asyncTask = this.N;
                if (asyncTask != null) {
                }
                k();
                o();
                m();
                n();
                c81Var = this.b0;
                if (photo != null) {
                }
                animatorSet = this.a0;
                if (animatorSet != null) {
                }
                c81Var.c(0);
                if (str4 != null) {
                }
                if (str3 != null) {
                }
                if (str4 != null) {
                }
                c81Var.setVisibility(0);
                return true;
            }
            str3 = str;
            str4 = null;
        }
        str8 = str4;
        str7 = str8;
        str6 = str7;
        str5 = str6;
        this.w = false;
        this.R = false;
        this.s = z10;
        this.x = null;
        this.A = null;
        b();
        this.I = false;
        this.J = 1.0f;
        asyncTask = this.N;
        if (asyncTask != null) {
        }
        k();
        o();
        m();
        n();
        c81Var = this.b0;
        if (photo != null) {
        }
        animatorSet = this.a0;
        if (animatorSet != null) {
        }
        c81Var.c(0);
        if (str4 != null) {
        }
        if (str3 != null) {
        }
        if (str4 != null) {
        }
        c81Var.setVisibility(0);
        return true;
    }

    public View getAspectRatioView() {
        return this.c;
    }

    public View getControlsView() {
        return this.b0;
    }

    public ImageView getTextureImageView() {
        return this.e;
    }

    public TextureView getTextureView() {
        return this.d;
    }

    public String getYoutubeId() {
        return this.C;
    }

    public final void h() {
        c81 c81Var = this.b0;
        if (c81Var.getParent() != this) {
            c81Var.setVisibility(8);
        }
        this.v.d();
    }

    public final void i() {
        String str = this.x;
        if (str == null) {
            return;
        }
        String str2 = this.A;
        k61 k61Var = this.a;
        if (str2 != null) {
            k61Var.H(Uri.parse(str), this.y, Uri.parse(this.A), this.B);
        } else {
            k61Var.E(Uri.parse(str), this.y);
        }
        k61Var.Q(this.s);
        long q10 = k61Var.q();
        c81 c81Var = this.b0;
        if (q10 != -9223372036854775807L) {
            c81Var.b((int) (k61Var.q() / 1000));
        } else {
            c81Var.b(0);
        }
        k();
        o();
        m();
        c81Var.invalidate();
        if (this.K != -1) {
            k61Var.M(r0 * MediaDataController.MAX_STYLE_RUNS_COUNT, false);
        }
    }

    public final void j(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.T;
        if (!z11) {
            radialProgressView.setAlpha(z10 ? 1.0f : 0.0f);
            return;
        }
        AnimatorSet animatorSet = this.a0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.a0 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, "alpha", z10 ? 1.0f : 0.0f));
        this.a0.setDuration(150L);
        this.a0.addListener(new y11(this, 6));
        this.a0.start();
    }

    public final void k() {
        h3.k0 k0Var = this.a.d;
        ImageView imageView = this.U;
        if (k0Var == null || this.Q) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        if (this.P) {
            imageView.setImageResource(R.drawable.ic_outfullscreen);
            imageView.setLayoutParams(g7.e6.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 1.0f));
        } else {
            imageView.setImageResource(R.drawable.ic_gofullscreen);
            imageView.setLayoutParams(g7.e6.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        }
    }

    public final void l(boolean z10) {
        ViewGroup viewGroup;
        TextureView textureView = this.d;
        if (textureView == null) {
            return;
        }
        k();
        ViewGroup viewGroup2 = this.f;
        gf0 gf0Var = this.c;
        if (viewGroup2 != null) {
            if (this.P) {
                ViewGroup viewGroup3 = (ViewGroup) gf0Var.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(gf0Var);
                }
            } else {
                ViewGroup viewGroup4 = (ViewGroup) gf0Var.getParent();
                if (viewGroup4 != this) {
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(gf0Var);
                    }
                    addView(gf0Var, 0);
                }
            }
            this.v.a(this.b0, this.P, gf0Var.getAspectRatio(), gf0Var.getVideoRotation(), z10);
            return;
        }
        this.O = true;
        if (!this.P) {
            if (viewGroup2 != null) {
                viewGroup2.addView(textureView);
            } else {
                gf0Var.addView(textureView);
            }
        }
        boolean z11 = this.P;
        c81 c81Var = this.b0;
        if (z11) {
            ViewGroup viewGroup5 = (ViewGroup) c81Var.getParent();
            if (viewGroup5 != null) {
                viewGroup5.removeView(c81Var);
            }
        } else {
            ViewGroup viewGroup6 = (ViewGroup) c81Var.getParent();
            if (viewGroup6 != this) {
                if (viewGroup6 != null) {
                    viewGroup6.removeView(c81Var);
                }
                if (viewGroup2 != null) {
                    viewGroup2.addView(c81Var);
                } else {
                    addView(c81Var, 1);
                }
            }
        }
        TextureView a2 = this.v.a(this.b0, this.P, gf0Var.getAspectRatio(), gf0Var.getVideoRotation(), z10);
        this.n = a2;
        a2.setVisibility(4);
        if (this.P && this.n != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
            viewGroup.removeView(textureView);
        }
        int i9 = c81.E;
        c81Var.a();
    }

    public final void m() {
        ImageView imageView = this.W;
        if (imageView == null) {
            return;
        }
        imageView.setImageResource(this.Q ? R.drawable.ic_goinline : R.drawable.ic_outinline);
        imageView.setVisibility(this.a.d != null ? 0 : 8);
        if (this.Q) {
            imageView.setLayoutParams(g7.e6.e(40, 40, 53));
        } else {
            imageView.setLayoutParams(g7.e6.e(56, 50, 53));
        }
    }

    public final void n() {
        c81 c81Var = this.b0;
        int i9 = c81.E;
        c81Var.a();
        AndroidUtilities.cancelRunOnUIThread(this.e0);
        if (!this.a.z()) {
            if (this.R) {
                this.V.setImageResource(this.Q ? R.drawable.ic_againinline : R.drawable.ic_again);
                return;
            } else {
                this.V.setImageResource(this.Q ? R.drawable.ic_playinline : R.drawable.ic_play);
                return;
            }
        }
        this.V.setImageResource(this.Q ? R.drawable.ic_pauseinline : R.drawable.ic_pause);
        AndroidUtilities.runOnUIThread(this.e0, 500L);
        if (this.F) {
            return;
        }
        AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        this.F = true;
        audioManager.requestAudioFocus(this, 3, 1);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i9) {
        AndroidUtilities.runOnUIThread(new qd(this, i9, 12));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f), this.M);
    }

    @Override // org.telegram.ui.Components.h61
    public final void onError(k61 k61Var, Exception exc) {
        FileLog.e(exc);
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13 = i11 - i9;
        gf0 gf0Var = this.c;
        int measuredWidth = (i13 - gf0Var.getMeasuredWidth()) / 2;
        int i14 = i12 - i10;
        int dp = ((i14 - AndroidUtilities.dp(10.0f)) - gf0Var.getMeasuredHeight()) / 2;
        gf0Var.layout(measuredWidth, dp, gf0Var.getMeasuredWidth() + measuredWidth, gf0Var.getMeasuredHeight() + dp);
        c81 c81Var = this.b0;
        if (c81Var.getParent() == this) {
            c81Var.layout(0, 0, c81Var.getMeasuredWidth(), c81Var.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.T;
        int measuredWidth2 = (i13 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i14 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        c81Var.a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f));
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        this.c.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2 - AndroidUtilities.dp(10.0f), TLObject.FLAG_30));
        c81 c81Var = this.b0;
        if (c81Var.getParent() == this) {
            c81Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        this.T.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), TLObject.FLAG_30));
        setMeasuredDimension(size, size2);
    }

    @Override // org.telegram.ui.Components.h61
    public final /* synthetic */ void onRenderedFirstFrame(i3.a aVar) {
    }

    @Override // org.telegram.ui.Components.h61
    public final void onStateChanged(boolean z10, int i9) {
        c81 c81Var = this.b0;
        k61 k61Var = this.a;
        if (i9 != 2) {
            if (k61Var.q() != -9223372036854775807L) {
                c81Var.b((int) (k61Var.q() / 1000));
            } else {
                c81Var.b(0);
            }
        }
        d81 d81Var = this.v;
        if (i9 == 4 || i9 == 1 || !k61Var.z()) {
            d81Var.e(this, false);
        } else {
            d81Var.e(this, true);
        }
        if (k61Var.z() && i9 != 4) {
            n();
            return;
        }
        if (i9 == 4) {
            this.R = true;
            k61Var.C();
            k61Var.M(0L, false);
            n();
            c81Var.d(true, true);
        }
    }

    @Override // org.telegram.ui.Components.h61
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        if (this.O) {
            this.O = false;
            if (this.P || this.Q) {
                if (this.Q) {
                    this.r = 1;
                }
                this.n.setSurfaceTexture(surfaceTexture);
                this.n.setSurfaceTextureListener(this.f0);
                this.n.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.h61
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.r == 2) {
            ImageView imageView = this.e;
            if (imageView != null) {
                imageView.setVisibility(4);
                imageView.setImageDrawable(null);
                Bitmap bitmap = this.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.h = null;
                }
            }
            this.S = false;
            int i9 = this.c0;
            int i10 = this.d0;
            this.c.getVideoRotation();
            this.v.f(this.b0, false, i9, i10, this.E);
            this.r = 0;
        }
    }

    @Override // org.telegram.ui.Components.h61
    public final void onVideoSizeChanged(int i9, int i10, int i11, float f10) {
        gf0 gf0Var = this.c;
        if (gf0Var != null) {
            if (i11 == 90 || i11 == 270) {
                i10 = i9;
                i9 = i10;
            }
            float f11 = i9 * f10;
            this.c0 = (int) f11;
            this.d0 = i10;
            float f12 = i10 == 0 ? 1.0f : f11 / i10;
            gf0Var.a(f12, i11);
            if (this.P) {
                this.v.c(f12, i11);
            }
        }
    }

    @Override // org.telegram.ui.Components.h61
    public final void onRenderedFirstFrame() {
        this.I = true;
        this.H = System.currentTimeMillis();
        this.b0.invalidate();
    }

    public final void o() {
    }

    @Override // org.telegram.ui.Components.h61
    public final /* synthetic */ void onSeekFinished(i3.a aVar) {
    }

    @Override // org.telegram.ui.Components.h61
    public final /* synthetic */ void onSeekStarted(i3.a aVar) {
    }
}
