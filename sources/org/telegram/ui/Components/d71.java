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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d71 extends ViewGroup implements k51, AudioManager.OnAudioFocusChangeListener {
    public String E;
    public String F;
    public String G;
    public String H;
    public boolean I;
    public final boolean J;
    public boolean K;
    public boolean L;
    public long M;
    public boolean N;
    public float O;
    public int P;
    public boolean Q;
    public final Paint R;
    public AsyncTask S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final m51 a;
    public boolean a0;
    public final w61 b;
    public final RadialProgressView b0;
    public final zd0 c;
    public final ImageView c0;
    public final TextureView d;
    public final ImageView d0;
    public final ImageView e;
    public final ImageView e0;
    public final ViewGroup f;
    public AnimatorSet f0;
    public final z61 g0;
    public Bitmap h;
    public int h0;
    public int i0;
    public final v61 j0;
    public final s30 k0;
    public final v61 l0;
    public TextureView n;
    public int r;
    public boolean s;
    public final a71 w;
    public boolean x;
    public String y;
    public static final Pattern m0 = Pattern.compile("(?:youtube(?:-nocookie)?\\.com/(?:[^/\\n\\s]+/\\S+/|(?:v|e(?:mbed)?)/|\\S*?[?&]v=)|youtu\\.be/)([a-zA-Z0-9_-]{11})");
    public static final Pattern n0 = Pattern.compile("https?://(?:(?:www|(player))\\.)?vimeo(pro)?\\.com/(?!(?:channels|album)/[^/?#]+/?(?:$|[?#])|[^/]+/review/|ondemand/)(?:.*?/)?(?:(?:play_redirect_hls|moogaloop\\.swf)\\?clip_id=)?(?:videos?/)?([0-9]+)(?:/[\\da-f]+)?/?(?:[?&].*)?(?:[#].*)?$");
    public static final Pattern o0 = Pattern.compile("(?:coub:|https?://(?:coub\\.com/(?:view|embed|coubs)/|c-cdn\\.coub\\.com/fb-player\\.swf\\?.*\\bcoub(?:ID|id)=))([\\da-z]+)");
    public static final Pattern p0 = Pattern.compile("^https?://(?:www\\.)?aparat\\.com/(?:v/|video/video/embed/videohash/)([a-zA-Z0-9]+)");
    public static final Pattern q0 = Pattern.compile("https?://clips\\.twitch\\.tv/(?:[^/]+/)*([^/?#&]+)");
    public static final Pattern r0 = Pattern.compile("https?://(?:(?:www\\.)?twitch\\.tv/|player\\.twitch\\.tv/\\?.*?\\bchannel=)([^/#?]+)");
    public static final Pattern s0 = Pattern.compile("fileList\\s*=\\s*JSON\\.parse\\('([^']+)'\\)");
    public static final Pattern t0 = Pattern.compile("clipInfo\\s*=\\s*(\\{[^']+\\});");
    public static final Pattern u0 = Pattern.compile("\"sts\"\\s*:\\s*(\\d+)");
    public static final Pattern v0 = Pattern.compile("\"assets\":.+?\"js\":\\s*(\"[^\"]+\")");
    public static final Pattern w0 = Pattern.compile("\\.sig\\|\\|([a-zA-Z0-9$]+)\\(");
    public static final Pattern x0 = Pattern.compile("[\"']signature[\"']\\s*,\\s*([a-zA-Z0-9$]+)\\(");
    public static final Pattern y0 = Pattern.compile("var\\s");
    public static final Pattern z0 = Pattern.compile("return(?:\\s+|$)");
    public static final Pattern A0 = Pattern.compile("[()]");
    public static final Pattern B0 = Pattern.compile(".*?-([a-zA-Z0-9_-]+)(?:/watch_as3|/html5player(?:-new)?|(?:/[a-z]{2}_[A-Z]{2})?/base)?\\.([a-z]+)$");

    public d71(Context context, boolean z10, a71 a71Var) {
        super(context);
        this.J = true;
        Paint paint = new Paint();
        this.R = paint;
        this.j0 = new v61(this, 0);
        this.k0 = new s30(this, 3);
        this.l0 = new v61(this, 1);
        setWillNotDraw(false);
        this.w = a71Var;
        paint.setColor(-16777216);
        zd0 zd0Var = new zd0(1, context, this);
        this.c = zd0Var;
        addView(zd0Var, b8.mf.e(-1, -1, 17));
        w61 w61Var = new w61(context, context);
        this.b = w61Var;
        final zw zwVar = new zw(this, 28);
        w61Var.addJavascriptInterface(new Object(zwVar) { // from class: org.telegram.ui.Components.WebPlayerView$JavaScriptInterface
            public final zw a;

            {
                this.a = zwVar;
            }

            @JavascriptInterface
            public void returnResultToJava(String str) {
                d71 d71Var = (d71) this.a.b;
                AsyncTask asyncTask = d71Var.S;
                if (asyncTask == null || asyncTask.isCancelled()) {
                    return;
                }
                AsyncTask asyncTask2 = d71Var.S;
                if (asyncTask2 instanceof c71) {
                    c71 c71Var = (c71) asyncTask2;
                    String[] strArr = c71Var.c;
                    strArr[0] = strArr[0].replace(c71Var.d, "/signature/" + str);
                    c71Var.b.countDown();
                }
            }
        }, "JavaScriptInterface");
        WebSettings settings = w61Var.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup g7 = a71Var.g();
        this.f = g7;
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        if (g7 != null) {
            g7.addView(textureView);
        } else {
            zd0Var.addView(textureView, b8.mf.e(-1, -1, 17));
        }
        if (g7 != null) {
            ImageView imageView = new ImageView(context);
            this.e = imageView;
            imageView.setBackgroundColor(-65536);
            imageView.setPivotX(0.0f);
            imageView.setPivotY(0.0f);
            imageView.setVisibility(4);
            g7.addView(imageView);
        }
        m51 m51Var = new m51();
        this.a = m51Var;
        m51Var.K = this;
        m51Var.A0(textureView);
        z61 z61Var = new z61(this, context);
        this.g0 = z61Var;
        if (g7 != null) {
            g7.addView(z61Var);
        } else {
            addView(z61Var, b8.mf.c(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.b0 = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, b8.mf.e(48, 48, 17));
        ImageView imageView2 = new ImageView(context);
        this.c0 = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        z61Var.addView(imageView2, b8.mf.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        final int i3 = 0;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.u61
            public final /* synthetic */ d71 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        d71 d71Var = this.b;
                        if (d71Var.x && !d71Var.T && !d71Var.a0 && d71Var.N) {
                            d71Var.U = !d71Var.U;
                            d71Var.l(true);
                            break;
                        }
                        break;
                    case 1:
                        d71 d71Var2 = this.b;
                        m51 m51Var2 = d71Var2.a;
                        if (d71Var2.x && d71Var2.y != null) {
                            if (m51Var2.d == null) {
                                d71Var2.i();
                            }
                            if (m51Var2.d0()) {
                                m51Var2.g0();
                            } else {
                                d71Var2.W = false;
                                m51Var2.h0();
                            }
                            d71Var2.n();
                            break;
                        }
                        break;
                    default:
                        d71 d71Var3 = this.b;
                        ViewGroup viewGroup = d71Var3.f;
                        boolean z11 = d71Var3.J;
                        a71 a71Var2 = d71Var3.w;
                        z61 z61Var2 = d71Var3.g0;
                        zd0 zd0Var2 = d71Var3.c;
                        TextureView textureView2 = d71Var3.d;
                        if (textureView2 != null && a71Var2.h() && !d71Var3.T && !d71Var3.a0 && d71Var3.N) {
                            d71Var3.a0 = true;
                            if (!d71Var3.V) {
                                d71Var3.U = false;
                                a71Var2.i(true, d71Var3.l0, zd0Var2.getAspectRatio(), z11);
                                break;
                            } else {
                                ViewGroup viewGroup2 = (ViewGroup) zd0Var2.getParent();
                                if (viewGroup2 != d71Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(zd0Var2);
                                    }
                                    d71Var3.addView(zd0Var2, 0, b8.mf.e(-1, -1, 17));
                                    zd0Var2.measure(View.MeasureSpec.makeMeasureSpec(d71Var3.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(d71Var3.getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f), TLObject.FLAG_30));
                                }
                                Bitmap bitmap = d71Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    d71Var3.h = null;
                                }
                                d71Var3.T = true;
                                d71Var3.V = false;
                                d71Var3.n();
                                d71Var3.o();
                                d71Var3.k();
                                d71Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    zd0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) z61Var2.getParent();
                                if (viewGroup3 != d71Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(z61Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(z61Var2);
                                    } else {
                                        d71Var3.addView(z61Var2, 1);
                                    }
                                }
                                z61Var2.d(false, false);
                                a71Var2.i(false, null, zd0Var2.getAspectRatio(), z11);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.d0 = imageView3;
        imageView3.setScaleType(scaleType);
        z61Var.addView(imageView3, b8.mf.e(48, 48, 17));
        final int i10 = 1;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.u61
            public final /* synthetic */ d71 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        d71 d71Var = this.b;
                        if (d71Var.x && !d71Var.T && !d71Var.a0 && d71Var.N) {
                            d71Var.U = !d71Var.U;
                            d71Var.l(true);
                            break;
                        }
                        break;
                    case 1:
                        d71 d71Var2 = this.b;
                        m51 m51Var2 = d71Var2.a;
                        if (d71Var2.x && d71Var2.y != null) {
                            if (m51Var2.d == null) {
                                d71Var2.i();
                            }
                            if (m51Var2.d0()) {
                                m51Var2.g0();
                            } else {
                                d71Var2.W = false;
                                m51Var2.h0();
                            }
                            d71Var2.n();
                            break;
                        }
                        break;
                    default:
                        d71 d71Var3 = this.b;
                        ViewGroup viewGroup = d71Var3.f;
                        boolean z11 = d71Var3.J;
                        a71 a71Var2 = d71Var3.w;
                        z61 z61Var2 = d71Var3.g0;
                        zd0 zd0Var2 = d71Var3.c;
                        TextureView textureView2 = d71Var3.d;
                        if (textureView2 != null && a71Var2.h() && !d71Var3.T && !d71Var3.a0 && d71Var3.N) {
                            d71Var3.a0 = true;
                            if (!d71Var3.V) {
                                d71Var3.U = false;
                                a71Var2.i(true, d71Var3.l0, zd0Var2.getAspectRatio(), z11);
                                break;
                            } else {
                                ViewGroup viewGroup2 = (ViewGroup) zd0Var2.getParent();
                                if (viewGroup2 != d71Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(zd0Var2);
                                    }
                                    d71Var3.addView(zd0Var2, 0, b8.mf.e(-1, -1, 17));
                                    zd0Var2.measure(View.MeasureSpec.makeMeasureSpec(d71Var3.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(d71Var3.getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f), TLObject.FLAG_30));
                                }
                                Bitmap bitmap = d71Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    d71Var3.h = null;
                                }
                                d71Var3.T = true;
                                d71Var3.V = false;
                                d71Var3.n();
                                d71Var3.o();
                                d71Var3.k();
                                d71Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    zd0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) z61Var2.getParent();
                                if (viewGroup3 != d71Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(z61Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(z61Var2);
                                    } else {
                                        d71Var3.addView(z61Var2, 1);
                                    }
                                }
                                z61Var2.d(false, false);
                                a71Var2.i(false, null, zd0Var2.getAspectRatio(), z11);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        if (z10) {
            ImageView imageView4 = new ImageView(context);
            this.e0 = imageView4;
            imageView4.setScaleType(scaleType);
            z61Var.addView(imageView4, b8.mf.e(56, 48, 53));
            final int i11 = 2;
            imageView4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.u61
                public final /* synthetic */ d71 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            d71 d71Var = this.b;
                            if (d71Var.x && !d71Var.T && !d71Var.a0 && d71Var.N) {
                                d71Var.U = !d71Var.U;
                                d71Var.l(true);
                                break;
                            }
                            break;
                        case 1:
                            d71 d71Var2 = this.b;
                            m51 m51Var2 = d71Var2.a;
                            if (d71Var2.x && d71Var2.y != null) {
                                if (m51Var2.d == null) {
                                    d71Var2.i();
                                }
                                if (m51Var2.d0()) {
                                    m51Var2.g0();
                                } else {
                                    d71Var2.W = false;
                                    m51Var2.h0();
                                }
                                d71Var2.n();
                                break;
                            }
                            break;
                        default:
                            d71 d71Var3 = this.b;
                            ViewGroup viewGroup = d71Var3.f;
                            boolean z11 = d71Var3.J;
                            a71 a71Var2 = d71Var3.w;
                            z61 z61Var2 = d71Var3.g0;
                            zd0 zd0Var2 = d71Var3.c;
                            TextureView textureView2 = d71Var3.d;
                            if (textureView2 != null && a71Var2.h() && !d71Var3.T && !d71Var3.a0 && d71Var3.N) {
                                d71Var3.a0 = true;
                                if (!d71Var3.V) {
                                    d71Var3.U = false;
                                    a71Var2.i(true, d71Var3.l0, zd0Var2.getAspectRatio(), z11);
                                    break;
                                } else {
                                    ViewGroup viewGroup2 = (ViewGroup) zd0Var2.getParent();
                                    if (viewGroup2 != d71Var3) {
                                        if (viewGroup2 != null) {
                                            viewGroup2.removeView(zd0Var2);
                                        }
                                        d71Var3.addView(zd0Var2, 0, b8.mf.e(-1, -1, 17));
                                        zd0Var2.measure(View.MeasureSpec.makeMeasureSpec(d71Var3.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(d71Var3.getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f), TLObject.FLAG_30));
                                    }
                                    Bitmap bitmap = d71Var3.h;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        d71Var3.h = null;
                                    }
                                    d71Var3.T = true;
                                    d71Var3.V = false;
                                    d71Var3.n();
                                    d71Var3.o();
                                    d71Var3.k();
                                    d71Var3.m();
                                    textureView2.setVisibility(4);
                                    if (viewGroup != null) {
                                        viewGroup.addView(textureView2);
                                    } else {
                                        zd0Var2.addView(textureView2);
                                    }
                                    ViewGroup viewGroup3 = (ViewGroup) z61Var2.getParent();
                                    if (viewGroup3 != d71Var3) {
                                        if (viewGroup3 != null) {
                                            viewGroup3.removeView(z61Var2);
                                        }
                                        if (viewGroup != null) {
                                            viewGroup.addView(z61Var2);
                                        } else {
                                            d71Var3.addView(z61Var2, 1);
                                        }
                                    }
                                    z61Var2.d(false, false);
                                    a71Var2.i(false, null, zd0Var2.getAspectRatio(), z11);
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
    
        if ((r2.find() ? r2.group(3) : null) != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if ((r2.find() ? r2.group(1) : null) != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        if ((r2.find() ? r2.group(1) : null) != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
    
        if ((r2.find() ? r2.group(1) : null) != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        if ((r2.find() ? r2.group(1) : null) != null) goto L64;
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
                Matcher matcher = m0.matcher(str);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        try {
            Matcher matcher2 = o0.matcher(str);
            return (matcher2.find() ? matcher2.group(1) : null) != null;
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
            return false;
        }
        try {
            Matcher matcher3 = p0.matcher(str);
        } catch (Exception e12) {
            org.telegram.messenger.a8.g(e12, true);
        }
        try {
            Matcher matcher4 = r0.matcher(str);
        } catch (Exception e13) {
            org.telegram.messenger.a8.g(e13, true);
        }
        try {
            Matcher matcher5 = n0.matcher(str);
        } catch (Exception e14) {
            org.telegram.messenger.a8.g(e14, true);
        }
        try {
            Matcher matcher6 = q0.matcher(str);
        } catch (Exception e15) {
            org.telegram.messenger.a8.g(e15, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0198 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0185 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String c(AsyncTask asyncTask, String str, HashMap hashMap, boolean z10) {
        URLConnection uRLConnection;
        boolean z11;
        InputStream inputStream;
        boolean z12;
        StringBuilder sb2;
        boolean z13;
        URL url;
        InputStream inputStream2;
        try {
            url = new URL(str);
            uRLConnection = url.openConnection();
        } catch (Throwable th2) {
            th = th2;
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
        } catch (Throwable th3) {
            th = th3;
            boolean z14 = !(th instanceof SocketTimeoutException) ? !(!(th instanceof UnknownHostException) && (!(th instanceof SocketException) ? (th instanceof FileNotFoundException) : !(th.getMessage() == null || !th.getMessage().contains("ECONNRESET")))) : org.telegram.messenger.t0.s();
            org.telegram.messenger.a8.g(th, true);
            z11 = z14;
            inputStream = null;
            if (z11) {
            }
            if (z12) {
            }
        }
        if (z11) {
            z12 = false;
            sb2 = null;
        } else {
            try {
                if (uRLConnection instanceof HttpURLConnection) {
                    ((HttpURLConnection) uRLConnection).getResponseCode();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            if (inputStream != null) {
                try {
                    byte[] bArr = new byte[32768];
                    sb2 = null;
                    while (true) {
                        try {
                            if (asyncTask.isCancelled()) {
                                z13 = false;
                                break;
                            }
                            try {
                                int read = inputStream.read(bArr);
                                if (read > 0) {
                                    if (sb2 == null) {
                                        sb2 = new StringBuilder();
                                    }
                                    z13 = false;
                                    try {
                                        try {
                                            sb2.append(new String(bArr, 0, read, "UTF-8"));
                                        } catch (Exception e11) {
                                            e = e11;
                                            org.telegram.messenger.a8.g(e, true);
                                            z12 = z13;
                                            if (inputStream != null) {
                                            }
                                            if (z12) {
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        org.telegram.messenger.a8.g(th, true);
                                        z12 = z13;
                                        if (inputStream != null) {
                                        }
                                        if (z12) {
                                        }
                                    }
                                } else {
                                    z13 = false;
                                    if (read == -1) {
                                        z12 = true;
                                    }
                                }
                            } catch (Exception e12) {
                                e = e12;
                                z13 = false;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            z13 = false;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    z13 = false;
                    sb2 = null;
                }
            } else {
                z12 = false;
                sb2 = null;
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th7) {
                    org.telegram.messenger.a8.g(th7, true);
                }
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
                Matcher matcher = o0.matcher(str);
                String group = matcher.find() ? matcher.group(1) : null;
                if (group != null) {
                    return group;
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return null;
            }
        }
        return null;
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = m0.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    private View getControlView() {
        return this.g0;
    }

    private View getProgressView() {
        return this.b0;
    }

    public final void b() {
        this.a.m0();
        AsyncTask asyncTask = this.S;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.S = null;
        }
        this.b.stopLoading();
    }

    public final boolean f() {
        return this.V || this.a0;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x024f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0186  */
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
        z61 z61Var;
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
        this.P = -1;
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
                                    this.P = (Utilities.z(split[0]).intValue() * 60) + Utilities.z(split[1]).intValue();
                                } else {
                                    this.P = Utilities.z(queryParameter).intValue();
                                }
                            }
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                    }
                    Matcher matcher = m0.matcher(str);
                    group5 = matcher.find() ? matcher.group(1) : null;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
                if (group5 != null) {
                    str4 = group5;
                    if (str4 == null) {
                        try {
                            Matcher matcher2 = n0.matcher(str);
                            group = matcher2.find() ? matcher2.group(3) : null;
                        } catch (Exception e12) {
                            org.telegram.messenger.a8.g(e12, true);
                        }
                        if (group != null) {
                            str8 = group;
                            if (str8 == null) {
                                try {
                                    Matcher matcher3 = p0.matcher(str);
                                    group2 = matcher3.find() ? matcher3.group(1) : null;
                                } catch (Exception e13) {
                                    org.telegram.messenger.a8.g(e13, true);
                                }
                                if (group2 != null) {
                                    str7 = group2;
                                    if (str7 == null) {
                                        try {
                                            Matcher matcher4 = q0.matcher(str);
                                            group3 = matcher4.find() ? matcher4.group(1) : null;
                                        } catch (Exception e14) {
                                            org.telegram.messenger.a8.g(e14, true);
                                        }
                                        if (group3 != null) {
                                            str6 = group3;
                                            if (str6 == null) {
                                                try {
                                                    Matcher matcher5 = r0.matcher(str);
                                                    group4 = matcher5.find() ? matcher5.group(1) : null;
                                                } catch (Exception e15) {
                                                    org.telegram.messenger.a8.g(e15, true);
                                                }
                                                if (group4 != null) {
                                                    str5 = group4;
                                                    if (str5 == null) {
                                                        try {
                                                            Matcher matcher6 = o0.matcher(str);
                                                            String group6 = matcher6.find() ? matcher6.group(1) : null;
                                                            if (group6 != null) {
                                                                d = group6;
                                                            }
                                                        } catch (Exception e16) {
                                                            org.telegram.messenger.a8.g(e16, true);
                                                        }
                                                    }
                                                    str3 = null;
                                                    this.x = false;
                                                    this.W = false;
                                                    this.s = z10;
                                                    this.y = null;
                                                    this.F = null;
                                                    b();
                                                    this.N = false;
                                                    this.O = 1.0f;
                                                    asyncTask = this.S;
                                                    if (asyncTask != null) {
                                                        asyncTask.cancel(true);
                                                        this.S = null;
                                                    }
                                                    k();
                                                    o();
                                                    m();
                                                    n();
                                                    z61Var = this.g0;
                                                    if (photo != null) {
                                                        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, 80, true, null, false);
                                                        if (w10 != null) {
                                                            z61Var.a.r0(null, null, org.telegram.messenger.ac.i(w10, photo), "80_80_b", null, 0L, null, obj, 1);
                                                            this.Q = true;
                                                        }
                                                    } else {
                                                        this.Q = false;
                                                    }
                                                    animatorSet = this.f0;
                                                    if (animatorSet != null) {
                                                        animatorSet.cancel();
                                                        this.f0 = null;
                                                    }
                                                    z61Var.c(0);
                                                    if (str4 != null) {
                                                        this.H = str4;
                                                        str4 = null;
                                                    }
                                                    if (str3 != null) {
                                                        this.x = true;
                                                        this.y = str3;
                                                        this.E = "other";
                                                        if (this.s) {
                                                            i();
                                                        }
                                                        j(false, false);
                                                        z61Var.d(true, true);
                                                    } else {
                                                        if (str4 != null) {
                                                            c71 c71Var = new c71(this, str4);
                                                            c71Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                            this.S = c71Var;
                                                        } else if (str8 != null) {
                                                            x61 x61Var = new x61(this, str8, 4);
                                                            x61Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                            this.S = x61Var;
                                                        } else if (d != null) {
                                                            x61 x61Var2 = new x61(this, d, 1);
                                                            x61Var2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                            this.S = x61Var2;
                                                            this.I = true;
                                                        } else if (str7 != null) {
                                                            x61 x61Var3 = new x61(this, str7, 0);
                                                            x61Var3.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                            this.S = x61Var3;
                                                        } else if (str6 != null) {
                                                            x61 x61Var4 = new x61(this, str, 2);
                                                            x61Var4.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                            this.S = x61Var4;
                                                        } else if (str5 != null) {
                                                            x61 x61Var5 = new x61(this, str5, 3);
                                                            x61Var5.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                            this.S = x61Var5;
                                                            this.I = true;
                                                        }
                                                        z61Var.d(false, false);
                                                        j(true, false);
                                                    }
                                                    if (str4 != null && str8 == null && d == null && str7 == null && str3 == null && str6 == null && str5 == null) {
                                                        z61Var.setVisibility(8);
                                                        return false;
                                                    }
                                                    z61Var.setVisibility(0);
                                                    return true;
                                                }
                                            }
                                            str5 = null;
                                            if (str5 == null) {
                                            }
                                            str3 = null;
                                            this.x = false;
                                            this.W = false;
                                            this.s = z10;
                                            this.y = null;
                                            this.F = null;
                                            b();
                                            this.N = false;
                                            this.O = 1.0f;
                                            asyncTask = this.S;
                                            if (asyncTask != null) {
                                            }
                                            k();
                                            o();
                                            m();
                                            n();
                                            z61Var = this.g0;
                                            if (photo != null) {
                                            }
                                            animatorSet = this.f0;
                                            if (animatorSet != null) {
                                            }
                                            z61Var.c(0);
                                            if (str4 != null) {
                                            }
                                            if (str3 != null) {
                                            }
                                            if (str4 != null) {
                                            }
                                            z61Var.setVisibility(0);
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
                                    this.x = false;
                                    this.W = false;
                                    this.s = z10;
                                    this.y = null;
                                    this.F = null;
                                    b();
                                    this.N = false;
                                    this.O = 1.0f;
                                    asyncTask = this.S;
                                    if (asyncTask != null) {
                                    }
                                    k();
                                    o();
                                    m();
                                    n();
                                    z61Var = this.g0;
                                    if (photo != null) {
                                    }
                                    animatorSet = this.f0;
                                    if (animatorSet != null) {
                                    }
                                    z61Var.c(0);
                                    if (str4 != null) {
                                    }
                                    if (str3 != null) {
                                    }
                                    if (str4 != null) {
                                    }
                                    z61Var.setVisibility(0);
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
                            this.x = false;
                            this.W = false;
                            this.s = z10;
                            this.y = null;
                            this.F = null;
                            b();
                            this.N = false;
                            this.O = 1.0f;
                            asyncTask = this.S;
                            if (asyncTask != null) {
                            }
                            k();
                            o();
                            m();
                            n();
                            z61Var = this.g0;
                            if (photo != null) {
                            }
                            animatorSet = this.f0;
                            if (animatorSet != null) {
                            }
                            z61Var.c(0);
                            if (str4 != null) {
                            }
                            if (str3 != null) {
                            }
                            if (str4 != null) {
                            }
                            z61Var.setVisibility(0);
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
                    this.x = false;
                    this.W = false;
                    this.s = z10;
                    this.y = null;
                    this.F = null;
                    b();
                    this.N = false;
                    this.O = 1.0f;
                    asyncTask = this.S;
                    if (asyncTask != null) {
                    }
                    k();
                    o();
                    m();
                    n();
                    z61Var = this.g0;
                    if (photo != null) {
                    }
                    animatorSet = this.f0;
                    if (animatorSet != null) {
                    }
                    z61Var.c(0);
                    if (str4 != null) {
                    }
                    if (str3 != null) {
                    }
                    if (str4 != null) {
                    }
                    z61Var.setVisibility(0);
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
                this.x = false;
                this.W = false;
                this.s = z10;
                this.y = null;
                this.F = null;
                b();
                this.N = false;
                this.O = 1.0f;
                asyncTask = this.S;
                if (asyncTask != null) {
                }
                k();
                o();
                m();
                n();
                z61Var = this.g0;
                if (photo != null) {
                }
                animatorSet = this.f0;
                if (animatorSet != null) {
                }
                z61Var.c(0);
                if (str4 != null) {
                }
                if (str3 != null) {
                }
                if (str4 != null) {
                }
                z61Var.setVisibility(0);
                return true;
            }
            str3 = str;
            str4 = null;
        }
        str8 = str4;
        str7 = str8;
        str6 = str7;
        str5 = str6;
        this.x = false;
        this.W = false;
        this.s = z10;
        this.y = null;
        this.F = null;
        b();
        this.N = false;
        this.O = 1.0f;
        asyncTask = this.S;
        if (asyncTask != null) {
        }
        k();
        o();
        m();
        n();
        z61Var = this.g0;
        if (photo != null) {
        }
        animatorSet = this.f0;
        if (animatorSet != null) {
        }
        z61Var.c(0);
        if (str4 != null) {
        }
        if (str3 != null) {
        }
        if (str4 != null) {
        }
        z61Var.setVisibility(0);
        return true;
    }

    public View getAspectRatioView() {
        return this.c;
    }

    public View getControlsView() {
        return this.g0;
    }

    public ImageView getTextureImageView() {
        return this.e;
    }

    public TextureView getTextureView() {
        return this.d;
    }

    public String getYoutubeId() {
        return this.H;
    }

    public final void h() {
        z61 z61Var = this.g0;
        if (z61Var.getParent() != this) {
            z61Var.setVisibility(8);
        }
        this.w.d();
    }

    public final void i() {
        String str = this.y;
        if (str == null) {
            return;
        }
        String str2 = this.F;
        m51 m51Var = this.a;
        if (str2 != null) {
            m51Var.l0(Uri.parse(str), this.E, Uri.parse(this.F), this.G);
        } else {
            m51Var.j0(Uri.parse(str), this.E);
        }
        m51Var.u0(this.s);
        long U = m51Var.U();
        z61 z61Var = this.g0;
        if (U != -9223372036854775807L) {
            z61Var.b((int) (m51Var.U() / 1000));
        } else {
            z61Var.b(0);
        }
        k();
        o();
        m();
        z61Var.invalidate();
        if (this.P != -1) {
            m51Var.q0(r0 * 1000, false);
        }
    }

    public final void j(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.b0;
        if (!z11) {
            radialProgressView.setAlpha(z10 ? 1.0f : 0.0f);
            return;
        }
        AnimatorSet animatorSet = this.f0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f0 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, "alpha", z10 ? 1.0f : 0.0f));
        this.f0.setDuration(150L);
        this.f0.addListener(new j01(this, 8));
        this.f0.start();
    }

    public final void k() {
        k2.i0 i0Var = this.a.d;
        ImageView imageView = this.c0;
        if (i0Var == null || this.V) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        if (this.U) {
            imageView.setImageResource(R.drawable.ic_outfullscreen);
            imageView.setLayoutParams(b8.mf.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 1.0f));
        } else {
            imageView.setImageResource(R.drawable.ic_gofullscreen);
            imageView.setLayoutParams(b8.mf.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
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
        zd0 zd0Var = this.c;
        if (viewGroup2 != null) {
            if (this.U) {
                ViewGroup viewGroup3 = (ViewGroup) zd0Var.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(zd0Var);
                }
            } else {
                ViewGroup viewGroup4 = (ViewGroup) zd0Var.getParent();
                if (viewGroup4 != this) {
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(zd0Var);
                    }
                    addView(zd0Var, 0);
                }
            }
            this.w.a(this.g0, this.U, zd0Var.getAspectRatio(), zd0Var.getVideoRotation(), z10);
            return;
        }
        this.T = true;
        if (!this.U) {
            if (viewGroup2 != null) {
                viewGroup2.addView(textureView);
            } else {
                zd0Var.addView(textureView);
            }
        }
        boolean z11 = this.U;
        z61 z61Var = this.g0;
        if (z11) {
            ViewGroup viewGroup5 = (ViewGroup) z61Var.getParent();
            if (viewGroup5 != null) {
                viewGroup5.removeView(z61Var);
            }
        } else {
            ViewGroup viewGroup6 = (ViewGroup) z61Var.getParent();
            if (viewGroup6 != this) {
                if (viewGroup6 != null) {
                    viewGroup6.removeView(z61Var);
                }
                if (viewGroup2 != null) {
                    viewGroup2.addView(z61Var);
                } else {
                    addView(z61Var, 1);
                }
            }
        }
        TextureView a10 = this.w.a(this.g0, this.U, zd0Var.getAspectRatio(), zd0Var.getVideoRotation(), z10);
        this.n = a10;
        a10.setVisibility(4);
        if (this.U && this.n != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
            viewGroup.removeView(textureView);
        }
        int i3 = z61.J;
        z61Var.a();
    }

    public final void m() {
        ImageView imageView = this.e0;
        if (imageView == null) {
            return;
        }
        imageView.setImageResource(this.V ? R.drawable.ic_goinline : R.drawable.ic_outinline);
        imageView.setVisibility(this.a.d != null ? 0 : 8);
        if (this.V) {
            imageView.setLayoutParams(b8.mf.e(40, 40, 53));
        } else {
            imageView.setLayoutParams(b8.mf.e(56, 50, 53));
        }
    }

    public final void n() {
        z61 z61Var = this.g0;
        int i3 = z61.J;
        z61Var.a();
        org.telegram.messenger.g0.r(this.j0);
        if (!this.a.d0()) {
            if (this.W) {
                this.d0.setImageResource(this.V ? R.drawable.ic_againinline : R.drawable.ic_again);
                return;
            } else {
                this.d0.setImageResource(this.V ? R.drawable.ic_playinline : R.drawable.ic_play);
                return;
            }
        }
        this.d0.setImageResource(this.V ? R.drawable.ic_pauseinline : R.drawable.ic_pause);
        org.telegram.messenger.g0.i3(this.j0, 500L);
        if (this.K) {
            return;
        }
        AudioManager audioManager = (AudioManager) org.telegram.messenger.t0.b.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        this.K = true;
        audioManager.requestAudioFocus(this, 3, 1);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i3) {
        org.telegram.messenger.g0.h3(new o2(this, i3, 12));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f), this.R);
    }

    @Override // org.telegram.ui.Components.k51
    public final void onError(m51 m51Var, Exception exc) {
        org.telegram.messenger.a8.g(exc, true);
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13 = i11 - i3;
        zd0 zd0Var = this.c;
        int measuredWidth = (i13 - zd0Var.getMeasuredWidth()) / 2;
        int i14 = i12 - i10;
        int L = ((i14 - org.telegram.messenger.g0.L(10.0f)) - zd0Var.getMeasuredHeight()) / 2;
        zd0Var.layout(measuredWidth, L, zd0Var.getMeasuredWidth() + measuredWidth, zd0Var.getMeasuredHeight() + L);
        z61 z61Var = this.g0;
        if (z61Var.getParent() == this) {
            z61Var.layout(0, 0, z61Var.getMeasuredWidth(), z61Var.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.b0;
        int measuredWidth2 = (i13 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i14 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        z61Var.a.y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f));
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        this.c.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2 - org.telegram.messenger.g0.L(10.0f), TLObject.FLAG_30));
        z61 z61Var = this.g0;
        if (z61Var.getParent() == this) {
            z61Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        this.b0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), TLObject.FLAG_30));
        setMeasuredDimension(size, size2);
    }

    @Override // org.telegram.ui.Components.k51
    public final /* synthetic */ void onRenderedFirstFrame(l2.a aVar) {
    }

    @Override // org.telegram.ui.Components.k51
    public final void onStateChanged(boolean z10, int i3) {
        z61 z61Var = this.g0;
        m51 m51Var = this.a;
        if (i3 != 2) {
            if (m51Var.U() != -9223372036854775807L) {
                z61Var.b((int) (m51Var.U() / 1000));
            } else {
                z61Var.b(0);
            }
        }
        a71 a71Var = this.w;
        if (i3 == 4 || i3 == 1 || !m51Var.d0()) {
            a71Var.e(this, false);
        } else {
            a71Var.e(this, true);
        }
        if (m51Var.d0() && i3 != 4) {
            n();
            return;
        }
        if (i3 == 4) {
            this.W = true;
            m51Var.g0();
            m51Var.q0(0L, false);
            n();
            z61Var.d(true, true);
        }
    }

    @Override // org.telegram.ui.Components.k51
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        if (this.T) {
            this.T = false;
            if (this.U || this.V) {
                if (this.V) {
                    this.r = 1;
                }
                this.n.setSurfaceTexture(surfaceTexture);
                this.n.setSurfaceTextureListener(this.k0);
                this.n.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.k51
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
            this.a0 = false;
            int i3 = this.h0;
            int i10 = this.i0;
            this.c.getVideoRotation();
            this.w.f(this.g0, false, i3, i10, this.J);
            this.r = 0;
        }
    }

    @Override // org.telegram.ui.Components.k51
    public final void onVideoSizeChanged(int i3, int i10, int i11, float f10) {
        zd0 zd0Var = this.c;
        if (zd0Var != null) {
            float f11 = i3 * f10;
            this.h0 = (int) f11;
            this.i0 = i10;
            float f12 = i10 == 0 ? 1.0f : f11 / i10;
            zd0Var.a(f12, 0);
            if (this.U) {
                this.w.c(f12);
            }
        }
    }

    @Override // org.telegram.ui.Components.k51
    public final void onRenderedFirstFrame() {
        this.N = true;
        this.M = System.currentTimeMillis();
        this.g0.invalidate();
    }

    @Override // org.telegram.ui.Components.k51
    public final /* synthetic */ void onSeekFinished(l2.a aVar) {
    }

    @Override // org.telegram.ui.Components.k51
    public final /* synthetic */ void onSeekStarted(l2.a aVar) {
    }

    public final void o() {
    }
}
