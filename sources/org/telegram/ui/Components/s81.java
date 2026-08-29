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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class s81 extends ViewGroup implements u61, AudioManager.OnAudioFocusChangeListener {
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
    public final x61 a;
    public AnimatorSet a0;
    public final l81 b;
    public final o81 b0;
    public final tf0 c;
    public int c0;
    public final TextureView d;
    public int d0;
    public final ImageView e;
    public final k81 e0;
    public final ViewGroup f;
    public final gh.h f0;
    public final k81 g0;
    public Bitmap h;
    public TextureView n;
    public int r;
    public boolean s;
    public final p81 v;
    public boolean w;
    public String x;
    public String y;

    public s81(Context context, boolean z10, p81 p81Var) {
        super(context);
        this.E = true;
        Paint paint = new Paint();
        this.M = paint;
        this.e0 = new k81(this, 0);
        this.f0 = new gh.h(this, 4);
        this.g0 = new k81(this, 1);
        setWillNotDraw(false);
        this.v = p81Var;
        paint.setColor(-16777216);
        tf0 tf0Var = new tf0(this, context, 1);
        this.c = tf0Var;
        addView(tf0Var, i7.f6.e(-1, -1, 17));
        l81 l81Var = new l81(context, context);
        this.b = l81Var;
        final i81 i81Var = new i81(this);
        l81Var.addJavascriptInterface(new Object(i81Var) { // from class: org.telegram.ui.Components.WebPlayerView$JavaScriptInterface
            public final i81 a;

            {
                this.a = i81Var;
            }

            @JavascriptInterface
            public void returnResultToJava(String str) {
                s81 s81Var = (s81) this.a.a;
                AsyncTask asyncTask = s81Var.N;
                if (asyncTask == null || asyncTask.isCancelled()) {
                    return;
                }
                AsyncTask asyncTask2 = s81Var.N;
                if (asyncTask2 instanceof r81) {
                    r81 r81Var = (r81) asyncTask2;
                    String[] strArr = r81Var.c;
                    strArr[0] = strArr[0].replace(r81Var.d, "/signature/" + str);
                    r81Var.b.countDown();
                }
            }
        }, "JavaScriptInterface");
        WebSettings settings = l81Var.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup g10 = p81Var.g();
        this.f = g10;
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        if (g10 != null) {
            g10.addView(textureView);
        } else {
            tf0Var.addView(textureView, i7.f6.e(-1, -1, 17));
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
        x61 x61Var = new x61();
        this.a = x61Var;
        x61Var.F = this;
        x61Var.W(textureView);
        o81 o81Var = new o81(this, context);
        this.b0 = o81Var;
        if (g10 != null) {
            g10.addView(o81Var);
        } else {
            addView(o81Var, i7.f6.c(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.T = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, i7.f6.e(48, 48, 17));
        ImageView imageView2 = new ImageView(context);
        this.U = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        o81Var.addView(imageView2, i7.f6.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        final int i10 = 0;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.j81
            public final /* synthetic */ s81 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        s81 s81Var = this.b;
                        if (s81Var.w && !s81Var.O && !s81Var.S && s81Var.I) {
                            s81Var.P = !s81Var.P;
                            s81Var.l(true);
                            break;
                        }
                        break;
                    case 1:
                        s81 s81Var2 = this.b;
                        x61 x61Var2 = s81Var2.a;
                        if (s81Var2.w && s81Var2.x != null) {
                            if (x61Var2.d == null) {
                                s81Var2.i();
                            }
                            if (x61Var2.z()) {
                                x61Var2.C();
                            } else {
                                s81Var2.R = false;
                                x61Var2.D();
                            }
                            s81Var2.n();
                            break;
                        }
                        break;
                    default:
                        s81 s81Var3 = this.b;
                        ViewGroup viewGroup = s81Var3.f;
                        boolean z11 = s81Var3.E;
                        p81 p81Var2 = s81Var3.v;
                        o81 o81Var2 = s81Var3.b0;
                        tf0 tf0Var2 = s81Var3.c;
                        TextureView textureView2 = s81Var3.d;
                        if (textureView2 != null && p81Var2.h() && !s81Var3.O && !s81Var3.S && s81Var3.I) {
                            s81Var3.S = true;
                            if (!s81Var3.Q) {
                                s81Var3.P = false;
                                p81Var2.i(true, s81Var3.g0, tf0Var2.getAspectRatio(), z11);
                                break;
                            } else {
                                ViewGroup viewGroup2 = (ViewGroup) tf0Var2.getParent();
                                if (viewGroup2 != s81Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(tf0Var2);
                                    }
                                    s81Var3.addView(tf0Var2, 0, i7.f6.e(-1, -1, 17));
                                    tf0Var2.measure(View.MeasureSpec.makeMeasureSpec(s81Var3.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(s81Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), TLObject.FLAG_30));
                                }
                                Bitmap bitmap = s81Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    s81Var3.h = null;
                                }
                                s81Var3.O = true;
                                s81Var3.Q = false;
                                s81Var3.n();
                                s81Var3.o();
                                s81Var3.k();
                                s81Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    tf0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) o81Var2.getParent();
                                if (viewGroup3 != s81Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(o81Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(o81Var2);
                                    } else {
                                        s81Var3.addView(o81Var2, 1);
                                    }
                                }
                                o81Var2.d(false, false);
                                p81Var2.i(false, null, tf0Var2.getAspectRatio(), z11);
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
        o81Var.addView(imageView3, i7.f6.e(48, 48, 17));
        final int i11 = 1;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.j81
            public final /* synthetic */ s81 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        s81 s81Var = this.b;
                        if (s81Var.w && !s81Var.O && !s81Var.S && s81Var.I) {
                            s81Var.P = !s81Var.P;
                            s81Var.l(true);
                            break;
                        }
                        break;
                    case 1:
                        s81 s81Var2 = this.b;
                        x61 x61Var2 = s81Var2.a;
                        if (s81Var2.w && s81Var2.x != null) {
                            if (x61Var2.d == null) {
                                s81Var2.i();
                            }
                            if (x61Var2.z()) {
                                x61Var2.C();
                            } else {
                                s81Var2.R = false;
                                x61Var2.D();
                            }
                            s81Var2.n();
                            break;
                        }
                        break;
                    default:
                        s81 s81Var3 = this.b;
                        ViewGroup viewGroup = s81Var3.f;
                        boolean z11 = s81Var3.E;
                        p81 p81Var2 = s81Var3.v;
                        o81 o81Var2 = s81Var3.b0;
                        tf0 tf0Var2 = s81Var3.c;
                        TextureView textureView2 = s81Var3.d;
                        if (textureView2 != null && p81Var2.h() && !s81Var3.O && !s81Var3.S && s81Var3.I) {
                            s81Var3.S = true;
                            if (!s81Var3.Q) {
                                s81Var3.P = false;
                                p81Var2.i(true, s81Var3.g0, tf0Var2.getAspectRatio(), z11);
                                break;
                            } else {
                                ViewGroup viewGroup2 = (ViewGroup) tf0Var2.getParent();
                                if (viewGroup2 != s81Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(tf0Var2);
                                    }
                                    s81Var3.addView(tf0Var2, 0, i7.f6.e(-1, -1, 17));
                                    tf0Var2.measure(View.MeasureSpec.makeMeasureSpec(s81Var3.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(s81Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), TLObject.FLAG_30));
                                }
                                Bitmap bitmap = s81Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    s81Var3.h = null;
                                }
                                s81Var3.O = true;
                                s81Var3.Q = false;
                                s81Var3.n();
                                s81Var3.o();
                                s81Var3.k();
                                s81Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    tf0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) o81Var2.getParent();
                                if (viewGroup3 != s81Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(o81Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(o81Var2);
                                    } else {
                                        s81Var3.addView(o81Var2, 1);
                                    }
                                }
                                o81Var2.d(false, false);
                                p81Var2.i(false, null, tf0Var2.getAspectRatio(), z11);
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
            o81Var.addView(imageView4, i7.f6.e(56, 48, 53));
            final int i12 = 2;
            imageView4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.j81
                public final /* synthetic */ s81 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            s81 s81Var = this.b;
                            if (s81Var.w && !s81Var.O && !s81Var.S && s81Var.I) {
                                s81Var.P = !s81Var.P;
                                s81Var.l(true);
                                break;
                            }
                            break;
                        case 1:
                            s81 s81Var2 = this.b;
                            x61 x61Var2 = s81Var2.a;
                            if (s81Var2.w && s81Var2.x != null) {
                                if (x61Var2.d == null) {
                                    s81Var2.i();
                                }
                                if (x61Var2.z()) {
                                    x61Var2.C();
                                } else {
                                    s81Var2.R = false;
                                    x61Var2.D();
                                }
                                s81Var2.n();
                                break;
                            }
                            break;
                        default:
                            s81 s81Var3 = this.b;
                            ViewGroup viewGroup = s81Var3.f;
                            boolean z11 = s81Var3.E;
                            p81 p81Var2 = s81Var3.v;
                            o81 o81Var2 = s81Var3.b0;
                            tf0 tf0Var2 = s81Var3.c;
                            TextureView textureView2 = s81Var3.d;
                            if (textureView2 != null && p81Var2.h() && !s81Var3.O && !s81Var3.S && s81Var3.I) {
                                s81Var3.S = true;
                                if (!s81Var3.Q) {
                                    s81Var3.P = false;
                                    p81Var2.i(true, s81Var3.g0, tf0Var2.getAspectRatio(), z11);
                                    break;
                                } else {
                                    ViewGroup viewGroup2 = (ViewGroup) tf0Var2.getParent();
                                    if (viewGroup2 != s81Var3) {
                                        if (viewGroup2 != null) {
                                            viewGroup2.removeView(tf0Var2);
                                        }
                                        s81Var3.addView(tf0Var2, 0, i7.f6.e(-1, -1, 17));
                                        tf0Var2.measure(View.MeasureSpec.makeMeasureSpec(s81Var3.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(s81Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), TLObject.FLAG_30));
                                    }
                                    Bitmap bitmap = s81Var3.h;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        s81Var3.h = null;
                                    }
                                    s81Var3.O = true;
                                    s81Var3.Q = false;
                                    s81Var3.n();
                                    s81Var3.o();
                                    s81Var3.k();
                                    s81Var3.m();
                                    textureView2.setVisibility(4);
                                    if (viewGroup != null) {
                                        viewGroup.addView(textureView2);
                                    } else {
                                        tf0Var2.addView(textureView2);
                                    }
                                    ViewGroup viewGroup3 = (ViewGroup) o81Var2.getParent();
                                    if (viewGroup3 != s81Var3) {
                                        if (viewGroup3 != null) {
                                            viewGroup3.removeView(o81Var2);
                                        }
                                        if (viewGroup != null) {
                                            viewGroup.addView(o81Var2);
                                        } else {
                                            s81Var3.addView(o81Var2, 1);
                                        }
                                    }
                                    o81Var2.d(false, false);
                                    p81Var2.i(false, null, tf0Var2.getAspectRatio(), z11);
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
                                    } catch (Throwable th4) {
                                        th = th4;
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
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    }
                    z12 = z13;
                } catch (Throwable th6) {
                    th = th6;
                    sb2 = null;
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th7) {
                        FileLog.e(th7);
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
        o81 o81Var;
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
                                                    o81Var = this.b0;
                                                    if (photo != null) {
                                                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 80, true);
                                                        if (closestPhotoSizeWithSize != null) {
                                                            o81Var.a.setImage(null, null, ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "80_80_b", 0L, null, obj, 1);
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
                                                    o81Var.c(0);
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
                                                        o81Var.d(true, true);
                                                    } else {
                                                        if (str4 != null) {
                                                            r81 r81Var = new r81(this, str4);
                                                            r81Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                            this.N = r81Var;
                                                        } else if (str8 != null) {
                                                            m81 m81Var = new m81(this, str8, 4);
                                                            m81Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                            this.N = m81Var;
                                                        } else if (d != null) {
                                                            m81 m81Var2 = new m81(this, d, 1);
                                                            m81Var2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                            this.N = m81Var2;
                                                            this.D = true;
                                                        } else if (str7 != null) {
                                                            m81 m81Var3 = new m81(this, str7, 0);
                                                            m81Var3.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                            this.N = m81Var3;
                                                        } else if (str6 != null) {
                                                            m81 m81Var4 = new m81(this, str, 2);
                                                            m81Var4.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                            this.N = m81Var4;
                                                        } else if (str5 != null) {
                                                            m81 m81Var5 = new m81(this, str5, 3);
                                                            m81Var5.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                            this.N = m81Var5;
                                                            this.D = true;
                                                        }
                                                        o81Var.d(false, false);
                                                        j(true, false);
                                                    }
                                                    if (str4 != null && str8 == null && d == null && str7 == null && str3 == null && str6 == null && str5 == null) {
                                                        o81Var.setVisibility(8);
                                                        return false;
                                                    }
                                                    o81Var.setVisibility(0);
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
                                            o81Var = this.b0;
                                            if (photo != null) {
                                            }
                                            animatorSet = this.a0;
                                            if (animatorSet != null) {
                                            }
                                            o81Var.c(0);
                                            if (str4 != null) {
                                            }
                                            if (str3 != null) {
                                            }
                                            if (str4 != null) {
                                            }
                                            o81Var.setVisibility(0);
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
                                    o81Var = this.b0;
                                    if (photo != null) {
                                    }
                                    animatorSet = this.a0;
                                    if (animatorSet != null) {
                                    }
                                    o81Var.c(0);
                                    if (str4 != null) {
                                    }
                                    if (str3 != null) {
                                    }
                                    if (str4 != null) {
                                    }
                                    o81Var.setVisibility(0);
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
                            o81Var = this.b0;
                            if (photo != null) {
                            }
                            animatorSet = this.a0;
                            if (animatorSet != null) {
                            }
                            o81Var.c(0);
                            if (str4 != null) {
                            }
                            if (str3 != null) {
                            }
                            if (str4 != null) {
                            }
                            o81Var.setVisibility(0);
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
                    o81Var = this.b0;
                    if (photo != null) {
                    }
                    animatorSet = this.a0;
                    if (animatorSet != null) {
                    }
                    o81Var.c(0);
                    if (str4 != null) {
                    }
                    if (str3 != null) {
                    }
                    if (str4 != null) {
                    }
                    o81Var.setVisibility(0);
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
                o81Var = this.b0;
                if (photo != null) {
                }
                animatorSet = this.a0;
                if (animatorSet != null) {
                }
                o81Var.c(0);
                if (str4 != null) {
                }
                if (str3 != null) {
                }
                if (str4 != null) {
                }
                o81Var.setVisibility(0);
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
        o81Var = this.b0;
        if (photo != null) {
        }
        animatorSet = this.a0;
        if (animatorSet != null) {
        }
        o81Var.c(0);
        if (str4 != null) {
        }
        if (str3 != null) {
        }
        if (str4 != null) {
        }
        o81Var.setVisibility(0);
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
        o81 o81Var = this.b0;
        if (o81Var.getParent() != this) {
            o81Var.setVisibility(8);
        }
        this.v.d();
    }

    public final void i() {
        String str = this.x;
        if (str == null) {
            return;
        }
        String str2 = this.A;
        x61 x61Var = this.a;
        if (str2 != null) {
            x61Var.H(Uri.parse(str), this.y, Uri.parse(this.A), this.B);
        } else {
            x61Var.E(Uri.parse(str), this.y);
        }
        x61Var.Q(this.s);
        long q6 = x61Var.q();
        o81 o81Var = this.b0;
        if (q6 != -9223372036854775807L) {
            o81Var.b((int) (x61Var.q() / 1000));
        } else {
            o81Var.b(0);
        }
        k();
        o();
        m();
        o81Var.invalidate();
        if (this.K != -1) {
            x61Var.M(r0 * MediaDataController.MAX_STYLE_RUNS_COUNT, false);
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
        this.a0.addListener(new p11(this, 8));
        this.a0.start();
    }

    public final void k() {
        j3.k0 k0Var = this.a.d;
        ImageView imageView = this.U;
        if (k0Var == null || this.Q) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        if (this.P) {
            imageView.setImageResource(R.drawable.ic_outfullscreen);
            imageView.setLayoutParams(i7.f6.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 1.0f));
        } else {
            imageView.setImageResource(R.drawable.ic_gofullscreen);
            imageView.setLayoutParams(i7.f6.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
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
        tf0 tf0Var = this.c;
        if (viewGroup2 != null) {
            if (this.P) {
                ViewGroup viewGroup3 = (ViewGroup) tf0Var.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(tf0Var);
                }
            } else {
                ViewGroup viewGroup4 = (ViewGroup) tf0Var.getParent();
                if (viewGroup4 != this) {
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(tf0Var);
                    }
                    addView(tf0Var, 0);
                }
            }
            this.v.a(this.b0, this.P, tf0Var.getAspectRatio(), tf0Var.getVideoRotation(), z10);
            return;
        }
        this.O = true;
        if (!this.P) {
            if (viewGroup2 != null) {
                viewGroup2.addView(textureView);
            } else {
                tf0Var.addView(textureView);
            }
        }
        boolean z11 = this.P;
        o81 o81Var = this.b0;
        if (z11) {
            ViewGroup viewGroup5 = (ViewGroup) o81Var.getParent();
            if (viewGroup5 != null) {
                viewGroup5.removeView(o81Var);
            }
        } else {
            ViewGroup viewGroup6 = (ViewGroup) o81Var.getParent();
            if (viewGroup6 != this) {
                if (viewGroup6 != null) {
                    viewGroup6.removeView(o81Var);
                }
                if (viewGroup2 != null) {
                    viewGroup2.addView(o81Var);
                } else {
                    addView(o81Var, 1);
                }
            }
        }
        TextureView a2 = this.v.a(this.b0, this.P, tf0Var.getAspectRatio(), tf0Var.getVideoRotation(), z10);
        this.n = a2;
        a2.setVisibility(4);
        if (this.P && this.n != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
            viewGroup.removeView(textureView);
        }
        int i10 = o81.E;
        o81Var.a();
    }

    public final void m() {
        ImageView imageView = this.W;
        if (imageView == null) {
            return;
        }
        imageView.setImageResource(this.Q ? R.drawable.ic_goinline : R.drawable.ic_outinline);
        imageView.setVisibility(this.a.d != null ? 0 : 8);
        if (this.Q) {
            imageView.setLayoutParams(i7.f6.e(40, 40, 53));
        } else {
            imageView.setLayoutParams(i7.f6.e(56, 50, 53));
        }
    }

    public final void n() {
        o81 o81Var = this.b0;
        int i10 = o81.E;
        o81Var.a();
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
    public final void onAudioFocusChange(int i10) {
        AndroidUtilities.runOnUIThread(new i8(this, i10, 14));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f), this.M);
    }

    @Override // org.telegram.ui.Components.u61
    public final void onError(x61 x61Var, Exception exc) {
        FileLog.e(exc);
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        tf0 tf0Var = this.c;
        int measuredWidth = (i14 - tf0Var.getMeasuredWidth()) / 2;
        int i15 = i13 - i11;
        int dp = ((i15 - AndroidUtilities.dp(10.0f)) - tf0Var.getMeasuredHeight()) / 2;
        tf0Var.layout(measuredWidth, dp, tf0Var.getMeasuredWidth() + measuredWidth, tf0Var.getMeasuredHeight() + dp);
        o81 o81Var = this.b0;
        if (o81Var.getParent() == this) {
            o81Var.layout(0, 0, o81Var.getMeasuredWidth(), o81Var.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.T;
        int measuredWidth2 = (i14 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i15 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        o81Var.a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f));
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.c.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2 - AndroidUtilities.dp(10.0f), TLObject.FLAG_30));
        o81 o81Var = this.b0;
        if (o81Var.getParent() == this) {
            o81Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        this.T.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), TLObject.FLAG_30));
        setMeasuredDimension(size, size2);
    }

    @Override // org.telegram.ui.Components.u61
    public final /* synthetic */ void onRenderedFirstFrame(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.u61
    public final void onStateChanged(boolean z10, int i10) {
        o81 o81Var = this.b0;
        x61 x61Var = this.a;
        if (i10 != 2) {
            if (x61Var.q() != -9223372036854775807L) {
                o81Var.b((int) (x61Var.q() / 1000));
            } else {
                o81Var.b(0);
            }
        }
        p81 p81Var = this.v;
        if (i10 == 4 || i10 == 1 || !x61Var.z()) {
            p81Var.e(this, false);
        } else {
            p81Var.e(this, true);
        }
        if (x61Var.z() && i10 != 4) {
            n();
            return;
        }
        if (i10 == 4) {
            this.R = true;
            x61Var.C();
            x61Var.M(0L, false);
            n();
            o81Var.d(true, true);
        }
    }

    @Override // org.telegram.ui.Components.u61
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

    @Override // org.telegram.ui.Components.u61
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
            int i10 = this.c0;
            int i11 = this.d0;
            this.c.getVideoRotation();
            this.v.f(this.b0, false, i10, i11, this.E);
            this.r = 0;
        }
    }

    @Override // org.telegram.ui.Components.u61
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f9) {
        tf0 tf0Var = this.c;
        if (tf0Var != null) {
            if (i12 == 90 || i12 == 270) {
                i11 = i10;
                i10 = i11;
            }
            float f10 = i10 * f9;
            this.c0 = (int) f10;
            this.d0 = i11;
            float f11 = i11 == 0 ? 1.0f : f10 / i11;
            tf0Var.a(f11, i12);
            if (this.P) {
                this.v.c(f11, i12);
            }
        }
    }

    @Override // org.telegram.ui.Components.u61
    public final void onRenderedFirstFrame() {
        this.I = true;
        this.H = System.currentTimeMillis();
        this.b0.invalidate();
    }

    public final void o() {
    }

    @Override // org.telegram.ui.Components.u61
    public final /* synthetic */ void onSeekFinished(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.u61
    public final /* synthetic */ void onSeekStarted(k3.a aVar) {
    }
}
