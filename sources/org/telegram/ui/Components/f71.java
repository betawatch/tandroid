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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class f71 extends ViewGroup implements l51, AudioManager.OnAudioFocusChangeListener {
    public String D;
    public String E;
    public String F;
    public String G;
    public boolean H;
    public final boolean I;
    public boolean J;
    public boolean K;
    public long L;
    public boolean M;
    public float N;
    public int O;
    public boolean P;
    public final Paint Q;
    public AsyncTask R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final n51 a;
    public final RadialProgressView a0;
    public final y61 b;
    public final ImageView b0;
    public final fe0 c;
    public final ImageView c0;
    public final TextureView d;
    public final ImageView d0;
    public final ImageView e;
    public AnimatorSet e0;
    public final ViewGroup f;
    public final b71 f0;
    public int g0;
    public Bitmap h;
    public int h0;
    public final x61 i0;
    public final w30 j0;
    public final x61 k0;
    public TextureView n;
    public int r;
    public boolean s;
    public final c71 w;
    public boolean x;
    public String y;
    public static final Pattern l0 = Pattern.compile("(?:youtube(?:-nocookie)?\\.com/(?:[^/\\n\\s]+/\\S+/|(?:v|e(?:mbed)?)/|\\S*?[?&]v=)|youtu\\.be/)([a-zA-Z0-9_-]{11})");
    public static final Pattern m0 = Pattern.compile("https?://(?:(?:www|(player))\\.)?vimeo(pro)?\\.com/(?!(?:channels|album)/[^/?#]+/?(?:$|[?#])|[^/]+/review/|ondemand/)(?:.*?/)?(?:(?:play_redirect_hls|moogaloop\\.swf)\\?clip_id=)?(?:videos?/)?([0-9]+)(?:/[\\da-f]+)?/?(?:[?&].*)?(?:[#].*)?$");
    public static final Pattern n0 = Pattern.compile("(?:coub:|https?://(?:coub\\.com/(?:view|embed|coubs)/|c-cdn\\.coub\\.com/fb-player\\.swf\\?.*\\bcoub(?:ID|id)=))([\\da-z]+)");
    public static final Pattern o0 = Pattern.compile("^https?://(?:www\\.)?aparat\\.com/(?:v/|video/video/embed/videohash/)([a-zA-Z0-9]+)");
    public static final Pattern p0 = Pattern.compile("https?://clips\\.twitch\\.tv/(?:[^/]+/)*([^/?#&]+)");
    public static final Pattern q0 = Pattern.compile("https?://(?:(?:www\\.)?twitch\\.tv/|player\\.twitch\\.tv/\\?.*?\\bchannel=)([^/#?]+)");
    public static final Pattern r0 = Pattern.compile("fileList\\s*=\\s*JSON\\.parse\\('([^']+)'\\)");
    public static final Pattern s0 = Pattern.compile("clipInfo\\s*=\\s*(\\{[^']+\\});");
    public static final Pattern t0 = Pattern.compile("\"sts\"\\s*:\\s*(\\d+)");
    public static final Pattern u0 = Pattern.compile("\"assets\":.+?\"js\":\\s*(\"[^\"]+\")");
    public static final Pattern v0 = Pattern.compile("\\.sig\\|\\|([a-zA-Z0-9$]+)\\(");
    public static final Pattern w0 = Pattern.compile("[\"']signature[\"']\\s*,\\s*([a-zA-Z0-9$]+)\\(");
    public static final Pattern x0 = Pattern.compile("var\\s");
    public static final Pattern y0 = Pattern.compile("return(?:\\s+|$)");
    public static final Pattern z0 = Pattern.compile("[()]");
    public static final Pattern A0 = Pattern.compile(".*?-([a-zA-Z0-9_-]+)(?:/watch_as3|/html5player(?:-new)?|(?:/[a-z]{2}_[A-Z]{2})?/base)?\\.([a-z]+)$");

    public f71(Context context, boolean z9, c71 c71Var) {
        super(context);
        this.I = true;
        Paint paint = new Paint();
        this.Q = paint;
        this.i0 = new x61(this, 0);
        this.j0 = new w30(this, 2);
        this.k0 = new x61(this, 1);
        setWillNotDraw(false);
        this.w = c71Var;
        paint.setColor(-16777216);
        fe0 fe0Var = new fe0(1, context, this);
        this.c = fe0Var;
        addView(fe0Var, c8.ha.e(-1, -1, 17));
        y61 y61Var = new y61(context, context);
        this.b = y61Var;
        final ax axVar = new ax(this, 28);
        y61Var.addJavascriptInterface(new Object(axVar) { // from class: org.telegram.ui.Components.WebPlayerView$JavaScriptInterface
            public final ax a;

            {
                this.a = axVar;
            }

            @JavascriptInterface
            public void returnResultToJava(String str) {
                f71 f71Var = (f71) this.a.b;
                AsyncTask asyncTask = f71Var.R;
                if (asyncTask == null || asyncTask.isCancelled()) {
                    return;
                }
                AsyncTask asyncTask2 = f71Var.R;
                if (asyncTask2 instanceof e71) {
                    e71 e71Var = (e71) asyncTask2;
                    String[] strArr = e71Var.c;
                    strArr[0] = strArr[0].replace(e71Var.d, "/signature/" + str);
                    e71Var.b.countDown();
                }
            }
        }, "JavaScriptInterface");
        WebSettings settings = y61Var.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup g10 = c71Var.g();
        this.f = g10;
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        if (g10 != null) {
            g10.addView(textureView);
        } else {
            fe0Var.addView(textureView, c8.ha.e(-1, -1, 17));
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
        n51 n51Var = new n51();
        this.a = n51Var;
        n51Var.J = this;
        n51Var.A0(textureView);
        b71 b71Var = new b71(this, context);
        this.f0 = b71Var;
        if (g10 != null) {
            g10.addView(b71Var);
        } else {
            addView(b71Var, c8.ha.c(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.a0 = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, c8.ha.e(48, 48, 17));
        ImageView imageView2 = new ImageView(context);
        this.b0 = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        b71Var.addView(imageView2, c8.ha.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        final int i7 = 0;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.w61
            public final /* synthetic */ f71 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        f71 f71Var = this.b;
                        if (f71Var.x && !f71Var.S && !f71Var.W && f71Var.M) {
                            f71Var.T = !f71Var.T;
                            f71Var.l(true);
                            break;
                        }
                        break;
                    case 1:
                        f71 f71Var2 = this.b;
                        n51 n51Var2 = f71Var2.a;
                        if (f71Var2.x && f71Var2.y != null) {
                            if (n51Var2.d == null) {
                                f71Var2.i();
                            }
                            if (n51Var2.d0()) {
                                n51Var2.g0();
                            } else {
                                f71Var2.V = false;
                                n51Var2.h0();
                            }
                            f71Var2.n();
                            break;
                        }
                        break;
                    default:
                        f71 f71Var3 = this.b;
                        ViewGroup viewGroup = f71Var3.f;
                        boolean z10 = f71Var3.I;
                        c71 c71Var2 = f71Var3.w;
                        b71 b71Var2 = f71Var3.f0;
                        fe0 fe0Var2 = f71Var3.c;
                        TextureView textureView2 = f71Var3.d;
                        if (textureView2 != null && c71Var2.h() && !f71Var3.S && !f71Var3.W && f71Var3.M) {
                            f71Var3.W = true;
                            if (!f71Var3.U) {
                                f71Var3.T = false;
                                c71Var2.i(true, f71Var3.k0, fe0Var2.getAspectRatio(), z10);
                                break;
                            } else {
                                ViewGroup viewGroup2 = (ViewGroup) fe0Var2.getParent();
                                if (viewGroup2 != f71Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(fe0Var2);
                                    }
                                    f71Var3.addView(fe0Var2, 0, c8.ha.e(-1, -1, 17));
                                    fe0Var2.measure(View.MeasureSpec.makeMeasureSpec(f71Var3.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(f71Var3.getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f), TLObject.FLAG_30));
                                }
                                Bitmap bitmap = f71Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    f71Var3.h = null;
                                }
                                f71Var3.S = true;
                                f71Var3.U = false;
                                f71Var3.n();
                                f71Var3.o();
                                f71Var3.k();
                                f71Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    fe0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) b71Var2.getParent();
                                if (viewGroup3 != f71Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(b71Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(b71Var2);
                                    } else {
                                        f71Var3.addView(b71Var2, 1);
                                    }
                                }
                                b71Var2.d(false, false);
                                c71Var2.i(false, null, fe0Var2.getAspectRatio(), z10);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.c0 = imageView3;
        imageView3.setScaleType(scaleType);
        b71Var.addView(imageView3, c8.ha.e(48, 48, 17));
        final int i10 = 1;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.w61
            public final /* synthetic */ f71 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        f71 f71Var = this.b;
                        if (f71Var.x && !f71Var.S && !f71Var.W && f71Var.M) {
                            f71Var.T = !f71Var.T;
                            f71Var.l(true);
                            break;
                        }
                        break;
                    case 1:
                        f71 f71Var2 = this.b;
                        n51 n51Var2 = f71Var2.a;
                        if (f71Var2.x && f71Var2.y != null) {
                            if (n51Var2.d == null) {
                                f71Var2.i();
                            }
                            if (n51Var2.d0()) {
                                n51Var2.g0();
                            } else {
                                f71Var2.V = false;
                                n51Var2.h0();
                            }
                            f71Var2.n();
                            break;
                        }
                        break;
                    default:
                        f71 f71Var3 = this.b;
                        ViewGroup viewGroup = f71Var3.f;
                        boolean z10 = f71Var3.I;
                        c71 c71Var2 = f71Var3.w;
                        b71 b71Var2 = f71Var3.f0;
                        fe0 fe0Var2 = f71Var3.c;
                        TextureView textureView2 = f71Var3.d;
                        if (textureView2 != null && c71Var2.h() && !f71Var3.S && !f71Var3.W && f71Var3.M) {
                            f71Var3.W = true;
                            if (!f71Var3.U) {
                                f71Var3.T = false;
                                c71Var2.i(true, f71Var3.k0, fe0Var2.getAspectRatio(), z10);
                                break;
                            } else {
                                ViewGroup viewGroup2 = (ViewGroup) fe0Var2.getParent();
                                if (viewGroup2 != f71Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(fe0Var2);
                                    }
                                    f71Var3.addView(fe0Var2, 0, c8.ha.e(-1, -1, 17));
                                    fe0Var2.measure(View.MeasureSpec.makeMeasureSpec(f71Var3.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(f71Var3.getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f), TLObject.FLAG_30));
                                }
                                Bitmap bitmap = f71Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    f71Var3.h = null;
                                }
                                f71Var3.S = true;
                                f71Var3.U = false;
                                f71Var3.n();
                                f71Var3.o();
                                f71Var3.k();
                                f71Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    fe0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) b71Var2.getParent();
                                if (viewGroup3 != f71Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(b71Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(b71Var2);
                                    } else {
                                        f71Var3.addView(b71Var2, 1);
                                    }
                                }
                                b71Var2.d(false, false);
                                c71Var2.i(false, null, fe0Var2.getAspectRatio(), z10);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        if (z9) {
            ImageView imageView4 = new ImageView(context);
            this.d0 = imageView4;
            imageView4.setScaleType(scaleType);
            b71Var.addView(imageView4, c8.ha.e(56, 48, 53));
            final int i11 = 2;
            imageView4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.w61
                public final /* synthetic */ f71 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            f71 f71Var = this.b;
                            if (f71Var.x && !f71Var.S && !f71Var.W && f71Var.M) {
                                f71Var.T = !f71Var.T;
                                f71Var.l(true);
                                break;
                            }
                            break;
                        case 1:
                            f71 f71Var2 = this.b;
                            n51 n51Var2 = f71Var2.a;
                            if (f71Var2.x && f71Var2.y != null) {
                                if (n51Var2.d == null) {
                                    f71Var2.i();
                                }
                                if (n51Var2.d0()) {
                                    n51Var2.g0();
                                } else {
                                    f71Var2.V = false;
                                    n51Var2.h0();
                                }
                                f71Var2.n();
                                break;
                            }
                            break;
                        default:
                            f71 f71Var3 = this.b;
                            ViewGroup viewGroup = f71Var3.f;
                            boolean z10 = f71Var3.I;
                            c71 c71Var2 = f71Var3.w;
                            b71 b71Var2 = f71Var3.f0;
                            fe0 fe0Var2 = f71Var3.c;
                            TextureView textureView2 = f71Var3.d;
                            if (textureView2 != null && c71Var2.h() && !f71Var3.S && !f71Var3.W && f71Var3.M) {
                                f71Var3.W = true;
                                if (!f71Var3.U) {
                                    f71Var3.T = false;
                                    c71Var2.i(true, f71Var3.k0, fe0Var2.getAspectRatio(), z10);
                                    break;
                                } else {
                                    ViewGroup viewGroup2 = (ViewGroup) fe0Var2.getParent();
                                    if (viewGroup2 != f71Var3) {
                                        if (viewGroup2 != null) {
                                            viewGroup2.removeView(fe0Var2);
                                        }
                                        f71Var3.addView(fe0Var2, 0, c8.ha.e(-1, -1, 17));
                                        fe0Var2.measure(View.MeasureSpec.makeMeasureSpec(f71Var3.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(f71Var3.getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f), TLObject.FLAG_30));
                                    }
                                    Bitmap bitmap = f71Var3.h;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        f71Var3.h = null;
                                    }
                                    f71Var3.S = true;
                                    f71Var3.U = false;
                                    f71Var3.n();
                                    f71Var3.o();
                                    f71Var3.k();
                                    f71Var3.m();
                                    textureView2.setVisibility(4);
                                    if (viewGroup != null) {
                                        viewGroup.addView(textureView2);
                                    } else {
                                        fe0Var2.addView(textureView2);
                                    }
                                    ViewGroup viewGroup3 = (ViewGroup) b71Var2.getParent();
                                    if (viewGroup3 != f71Var3) {
                                        if (viewGroup3 != null) {
                                            viewGroup3.removeView(b71Var2);
                                        }
                                        if (viewGroup != null) {
                                            viewGroup.addView(b71Var2);
                                        } else {
                                            f71Var3.addView(b71Var2, 1);
                                        }
                                    }
                                    b71Var2.d(false, false);
                                    c71Var2.i(false, null, fe0Var2.getAspectRatio(), z10);
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
                Matcher matcher = l0.matcher(str);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        try {
            Matcher matcher2 = n0.matcher(str);
            return (matcher2.find() ? matcher2.group(1) : null) != null;
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
            return false;
        }
        try {
            Matcher matcher3 = o0.matcher(str);
        } catch (Exception e12) {
            org.telegram.messenger.a8.g(e12, true);
        }
        try {
            Matcher matcher4 = q0.matcher(str);
        } catch (Exception e13) {
            org.telegram.messenger.a8.g(e13, true);
        }
        try {
            Matcher matcher5 = m0.matcher(str);
        } catch (Exception e14) {
            org.telegram.messenger.a8.g(e14, true);
        }
        try {
            Matcher matcher6 = p0.matcher(str);
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
    public static String c(AsyncTask asyncTask, String str, HashMap hashMap, boolean z9) {
        URLConnection uRLConnection;
        boolean z10;
        InputStream inputStream;
        boolean z11;
        StringBuilder sb2;
        boolean z12;
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
            if (z9) {
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
                    if (z9) {
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
            if (z9) {
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
            z10 = true;
        } catch (Throwable th3) {
            th = th3;
            boolean z13 = !(th instanceof SocketTimeoutException) ? !(!(th instanceof UnknownHostException) && (!(th instanceof SocketException) ? (th instanceof FileNotFoundException) : !(th.getMessage() == null || !th.getMessage().contains("ECONNRESET")))) : org.telegram.messenger.t0.s();
            org.telegram.messenger.a8.g(th, true);
            z10 = z13;
            inputStream = null;
            if (z10) {
            }
            if (z11) {
            }
        }
        if (z10) {
            z11 = false;
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
                                z12 = false;
                                break;
                            }
                            try {
                                int read = inputStream.read(bArr);
                                if (read > 0) {
                                    if (sb2 == null) {
                                        sb2 = new StringBuilder();
                                    }
                                    z12 = false;
                                    try {
                                        try {
                                            sb2.append(new String(bArr, 0, read, "UTF-8"));
                                        } catch (Exception e11) {
                                            e = e11;
                                            org.telegram.messenger.a8.g(e, true);
                                            z11 = z12;
                                            if (inputStream != null) {
                                            }
                                            if (z11) {
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        org.telegram.messenger.a8.g(th, true);
                                        z11 = z12;
                                        if (inputStream != null) {
                                        }
                                        if (z11) {
                                        }
                                    }
                                } else {
                                    z12 = false;
                                    if (read == -1) {
                                        z11 = true;
                                    }
                                }
                            } catch (Exception e12) {
                                e = e12;
                                z12 = false;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            z12 = false;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    z12 = false;
                    sb2 = null;
                }
            } else {
                z11 = false;
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
        if (z11) {
            return null;
        }
        return sb2.toString();
    }

    public static String d(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                Matcher matcher = n0.matcher(str);
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
        Matcher matcher = l0.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    private View getControlView() {
        return this.f0;
    }

    private View getProgressView() {
        return this.a0;
    }

    public final void b() {
        this.a.m0();
        AsyncTask asyncTask = this.R;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.R = null;
        }
        this.b.stopLoading();
    }

    public final boolean f() {
        return this.U || this.W;
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
    public final boolean g(String str, TLRPC.Photo photo, Object obj, String str2, boolean z9) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        AsyncTask asyncTask;
        b71 b71Var;
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
        this.O = -1;
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
                                    this.O = (Utilities.z(split[0]).intValue() * 60) + Utilities.z(split[1]).intValue();
                                } else {
                                    this.O = Utilities.z(queryParameter).intValue();
                                }
                            }
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                    }
                    Matcher matcher = l0.matcher(str);
                    group5 = matcher.find() ? matcher.group(1) : null;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
                if (group5 != null) {
                    str4 = group5;
                    if (str4 == null) {
                        try {
                            Matcher matcher2 = m0.matcher(str);
                            group = matcher2.find() ? matcher2.group(3) : null;
                        } catch (Exception e12) {
                            org.telegram.messenger.a8.g(e12, true);
                        }
                        if (group != null) {
                            str8 = group;
                            if (str8 == null) {
                                try {
                                    Matcher matcher3 = o0.matcher(str);
                                    group2 = matcher3.find() ? matcher3.group(1) : null;
                                } catch (Exception e13) {
                                    org.telegram.messenger.a8.g(e13, true);
                                }
                                if (group2 != null) {
                                    str7 = group2;
                                    if (str7 == null) {
                                        try {
                                            Matcher matcher4 = p0.matcher(str);
                                            group3 = matcher4.find() ? matcher4.group(1) : null;
                                        } catch (Exception e14) {
                                            org.telegram.messenger.a8.g(e14, true);
                                        }
                                        if (group3 != null) {
                                            str6 = group3;
                                            if (str6 == null) {
                                                try {
                                                    Matcher matcher5 = q0.matcher(str);
                                                    group4 = matcher5.find() ? matcher5.group(1) : null;
                                                } catch (Exception e15) {
                                                    org.telegram.messenger.a8.g(e15, true);
                                                }
                                                if (group4 != null) {
                                                    str5 = group4;
                                                    if (str5 == null) {
                                                        try {
                                                            Matcher matcher6 = n0.matcher(str);
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
                                                    this.V = false;
                                                    this.s = z9;
                                                    this.y = null;
                                                    this.E = null;
                                                    b();
                                                    this.M = false;
                                                    this.N = 1.0f;
                                                    asyncTask = this.R;
                                                    if (asyncTask != null) {
                                                        asyncTask.cancel(true);
                                                        this.R = null;
                                                    }
                                                    k();
                                                    o();
                                                    m();
                                                    n();
                                                    b71Var = this.f0;
                                                    if (photo != null) {
                                                        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, 80, true, null, false);
                                                        if (w10 != null) {
                                                            b71Var.a.r0(null, null, org.telegram.messenger.hc.i(w10, photo), "80_80_b", null, 0L, null, obj, 1);
                                                            this.P = true;
                                                        }
                                                    } else {
                                                        this.P = false;
                                                    }
                                                    animatorSet = this.e0;
                                                    if (animatorSet != null) {
                                                        animatorSet.cancel();
                                                        this.e0 = null;
                                                    }
                                                    b71Var.c(0);
                                                    if (str4 != null) {
                                                        this.G = str4;
                                                        str4 = null;
                                                    }
                                                    if (str3 != null) {
                                                        this.x = true;
                                                        this.y = str3;
                                                        this.D = "other";
                                                        if (this.s) {
                                                            i();
                                                        }
                                                        j(false, false);
                                                        b71Var.d(true, true);
                                                    } else {
                                                        if (str4 != null) {
                                                            e71 e71Var = new e71(this, str4);
                                                            e71Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                            this.R = e71Var;
                                                        } else if (str8 != null) {
                                                            z61 z61Var = new z61(this, str8, 4);
                                                            z61Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                            this.R = z61Var;
                                                        } else if (d != null) {
                                                            z61 z61Var2 = new z61(this, d, 1);
                                                            z61Var2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                            this.R = z61Var2;
                                                            this.H = true;
                                                        } else if (str7 != null) {
                                                            z61 z61Var3 = new z61(this, str7, 0);
                                                            z61Var3.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                            this.R = z61Var3;
                                                        } else if (str6 != null) {
                                                            z61 z61Var4 = new z61(this, str, 2);
                                                            z61Var4.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                            this.R = z61Var4;
                                                        } else if (str5 != null) {
                                                            z61 z61Var5 = new z61(this, str5, 3);
                                                            z61Var5.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                            this.R = z61Var5;
                                                            this.H = true;
                                                        }
                                                        b71Var.d(false, false);
                                                        j(true, false);
                                                    }
                                                    if (str4 != null && str8 == null && d == null && str7 == null && str3 == null && str6 == null && str5 == null) {
                                                        b71Var.setVisibility(8);
                                                        return false;
                                                    }
                                                    b71Var.setVisibility(0);
                                                    return true;
                                                }
                                            }
                                            str5 = null;
                                            if (str5 == null) {
                                            }
                                            str3 = null;
                                            this.x = false;
                                            this.V = false;
                                            this.s = z9;
                                            this.y = null;
                                            this.E = null;
                                            b();
                                            this.M = false;
                                            this.N = 1.0f;
                                            asyncTask = this.R;
                                            if (asyncTask != null) {
                                            }
                                            k();
                                            o();
                                            m();
                                            n();
                                            b71Var = this.f0;
                                            if (photo != null) {
                                            }
                                            animatorSet = this.e0;
                                            if (animatorSet != null) {
                                            }
                                            b71Var.c(0);
                                            if (str4 != null) {
                                            }
                                            if (str3 != null) {
                                            }
                                            if (str4 != null) {
                                            }
                                            b71Var.setVisibility(0);
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
                                    this.V = false;
                                    this.s = z9;
                                    this.y = null;
                                    this.E = null;
                                    b();
                                    this.M = false;
                                    this.N = 1.0f;
                                    asyncTask = this.R;
                                    if (asyncTask != null) {
                                    }
                                    k();
                                    o();
                                    m();
                                    n();
                                    b71Var = this.f0;
                                    if (photo != null) {
                                    }
                                    animatorSet = this.e0;
                                    if (animatorSet != null) {
                                    }
                                    b71Var.c(0);
                                    if (str4 != null) {
                                    }
                                    if (str3 != null) {
                                    }
                                    if (str4 != null) {
                                    }
                                    b71Var.setVisibility(0);
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
                            this.V = false;
                            this.s = z9;
                            this.y = null;
                            this.E = null;
                            b();
                            this.M = false;
                            this.N = 1.0f;
                            asyncTask = this.R;
                            if (asyncTask != null) {
                            }
                            k();
                            o();
                            m();
                            n();
                            b71Var = this.f0;
                            if (photo != null) {
                            }
                            animatorSet = this.e0;
                            if (animatorSet != null) {
                            }
                            b71Var.c(0);
                            if (str4 != null) {
                            }
                            if (str3 != null) {
                            }
                            if (str4 != null) {
                            }
                            b71Var.setVisibility(0);
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
                    this.V = false;
                    this.s = z9;
                    this.y = null;
                    this.E = null;
                    b();
                    this.M = false;
                    this.N = 1.0f;
                    asyncTask = this.R;
                    if (asyncTask != null) {
                    }
                    k();
                    o();
                    m();
                    n();
                    b71Var = this.f0;
                    if (photo != null) {
                    }
                    animatorSet = this.e0;
                    if (animatorSet != null) {
                    }
                    b71Var.c(0);
                    if (str4 != null) {
                    }
                    if (str3 != null) {
                    }
                    if (str4 != null) {
                    }
                    b71Var.setVisibility(0);
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
                this.V = false;
                this.s = z9;
                this.y = null;
                this.E = null;
                b();
                this.M = false;
                this.N = 1.0f;
                asyncTask = this.R;
                if (asyncTask != null) {
                }
                k();
                o();
                m();
                n();
                b71Var = this.f0;
                if (photo != null) {
                }
                animatorSet = this.e0;
                if (animatorSet != null) {
                }
                b71Var.c(0);
                if (str4 != null) {
                }
                if (str3 != null) {
                }
                if (str4 != null) {
                }
                b71Var.setVisibility(0);
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
        this.V = false;
        this.s = z9;
        this.y = null;
        this.E = null;
        b();
        this.M = false;
        this.N = 1.0f;
        asyncTask = this.R;
        if (asyncTask != null) {
        }
        k();
        o();
        m();
        n();
        b71Var = this.f0;
        if (photo != null) {
        }
        animatorSet = this.e0;
        if (animatorSet != null) {
        }
        b71Var.c(0);
        if (str4 != null) {
        }
        if (str3 != null) {
        }
        if (str4 != null) {
        }
        b71Var.setVisibility(0);
        return true;
    }

    public View getAspectRatioView() {
        return this.c;
    }

    public View getControlsView() {
        return this.f0;
    }

    public ImageView getTextureImageView() {
        return this.e;
    }

    public TextureView getTextureView() {
        return this.d;
    }

    public String getYoutubeId() {
        return this.G;
    }

    public final void h() {
        b71 b71Var = this.f0;
        if (b71Var.getParent() != this) {
            b71Var.setVisibility(8);
        }
        this.w.d();
    }

    public final void i() {
        String str = this.y;
        if (str == null) {
            return;
        }
        String str2 = this.E;
        n51 n51Var = this.a;
        if (str2 != null) {
            n51Var.l0(Uri.parse(str), this.D, Uri.parse(this.E), this.F);
        } else {
            n51Var.j0(Uri.parse(str), this.D);
        }
        n51Var.u0(this.s);
        long U = n51Var.U();
        b71 b71Var = this.f0;
        if (U != -9223372036854775807L) {
            b71Var.b((int) (n51Var.U() / 1000));
        } else {
            b71Var.b(0);
        }
        k();
        o();
        m();
        b71Var.invalidate();
        if (this.O != -1) {
            n51Var.q0(r0 * 1000, false);
        }
    }

    public final void j(boolean z9, boolean z10) {
        RadialProgressView radialProgressView = this.a0;
        if (!z10) {
            radialProgressView.setAlpha(z9 ? 1.0f : 0.0f);
            return;
        }
        AnimatorSet animatorSet = this.e0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.e0 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, "alpha", z9 ? 1.0f : 0.0f));
        this.e0.setDuration(150L);
        this.e0.addListener(new j01(this, 8));
        this.e0.start();
    }

    public final void k() {
        l2.i0 i0Var = this.a.d;
        ImageView imageView = this.b0;
        if (i0Var == null || this.U) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        if (this.T) {
            imageView.setImageResource(R.drawable.ic_outfullscreen);
            imageView.setLayoutParams(c8.ha.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 1.0f));
        } else {
            imageView.setImageResource(R.drawable.ic_gofullscreen);
            imageView.setLayoutParams(c8.ha.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        }
    }

    public final void l(boolean z9) {
        ViewGroup viewGroup;
        TextureView textureView = this.d;
        if (textureView == null) {
            return;
        }
        k();
        ViewGroup viewGroup2 = this.f;
        fe0 fe0Var = this.c;
        if (viewGroup2 != null) {
            if (this.T) {
                ViewGroup viewGroup3 = (ViewGroup) fe0Var.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(fe0Var);
                }
            } else {
                ViewGroup viewGroup4 = (ViewGroup) fe0Var.getParent();
                if (viewGroup4 != this) {
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(fe0Var);
                    }
                    addView(fe0Var, 0);
                }
            }
            this.w.a(this.f0, this.T, fe0Var.getAspectRatio(), fe0Var.getVideoRotation(), z9);
            return;
        }
        this.S = true;
        if (!this.T) {
            if (viewGroup2 != null) {
                viewGroup2.addView(textureView);
            } else {
                fe0Var.addView(textureView);
            }
        }
        boolean z10 = this.T;
        b71 b71Var = this.f0;
        if (z10) {
            ViewGroup viewGroup5 = (ViewGroup) b71Var.getParent();
            if (viewGroup5 != null) {
                viewGroup5.removeView(b71Var);
            }
        } else {
            ViewGroup viewGroup6 = (ViewGroup) b71Var.getParent();
            if (viewGroup6 != this) {
                if (viewGroup6 != null) {
                    viewGroup6.removeView(b71Var);
                }
                if (viewGroup2 != null) {
                    viewGroup2.addView(b71Var);
                } else {
                    addView(b71Var, 1);
                }
            }
        }
        TextureView a10 = this.w.a(this.f0, this.T, fe0Var.getAspectRatio(), fe0Var.getVideoRotation(), z9);
        this.n = a10;
        a10.setVisibility(4);
        if (this.T && this.n != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
            viewGroup.removeView(textureView);
        }
        int i7 = b71.I;
        b71Var.a();
    }

    public final void m() {
        ImageView imageView = this.d0;
        if (imageView == null) {
            return;
        }
        imageView.setImageResource(this.U ? R.drawable.ic_goinline : R.drawable.ic_outinline);
        imageView.setVisibility(this.a.d != null ? 0 : 8);
        if (this.U) {
            imageView.setLayoutParams(c8.ha.e(40, 40, 53));
        } else {
            imageView.setLayoutParams(c8.ha.e(56, 50, 53));
        }
    }

    public final void n() {
        b71 b71Var = this.f0;
        int i7 = b71.I;
        b71Var.a();
        org.telegram.messenger.g0.r(this.i0);
        if (!this.a.d0()) {
            if (this.V) {
                this.c0.setImageResource(this.U ? R.drawable.ic_againinline : R.drawable.ic_again);
                return;
            } else {
                this.c0.setImageResource(this.U ? R.drawable.ic_playinline : R.drawable.ic_play);
                return;
            }
        }
        this.c0.setImageResource(this.U ? R.drawable.ic_pauseinline : R.drawable.ic_pause);
        org.telegram.messenger.g0.i3(this.i0, 500L);
        if (this.J) {
            return;
        }
        AudioManager audioManager = (AudioManager) org.telegram.messenger.t0.b.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        this.J = true;
        audioManager.requestAudioFocus(this, 3, 1);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i7) {
        org.telegram.messenger.g0.h3(new r2(this, i7, 12));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f), this.Q);
    }

    @Override // org.telegram.ui.Components.l51
    public final void onError(n51 n51Var, Exception exc) {
        org.telegram.messenger.a8.g(exc, true);
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13 = i11 - i7;
        fe0 fe0Var = this.c;
        int measuredWidth = (i13 - fe0Var.getMeasuredWidth()) / 2;
        int i14 = i12 - i10;
        int L = ((i14 - org.telegram.messenger.g0.L(10.0f)) - fe0Var.getMeasuredHeight()) / 2;
        fe0Var.layout(measuredWidth, L, fe0Var.getMeasuredWidth() + measuredWidth, fe0Var.getMeasuredHeight() + L);
        b71 b71Var = this.f0;
        if (b71Var.getParent() == this) {
            b71Var.layout(0, 0, b71Var.getMeasuredWidth(), b71Var.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.a0;
        int measuredWidth2 = (i13 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i14 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        b71Var.a.y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f));
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        this.c.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2 - org.telegram.messenger.g0.L(10.0f), TLObject.FLAG_30));
        b71 b71Var = this.f0;
        if (b71Var.getParent() == this) {
            b71Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        this.a0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), TLObject.FLAG_30));
        setMeasuredDimension(size, size2);
    }

    @Override // org.telegram.ui.Components.l51
    public final /* synthetic */ void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.l51
    public final void onStateChanged(boolean z9, int i7) {
        b71 b71Var = this.f0;
        n51 n51Var = this.a;
        if (i7 != 2) {
            if (n51Var.U() != -9223372036854775807L) {
                b71Var.b((int) (n51Var.U() / 1000));
            } else {
                b71Var.b(0);
            }
        }
        c71 c71Var = this.w;
        if (i7 == 4 || i7 == 1 || !n51Var.d0()) {
            c71Var.e(this, false);
        } else {
            c71Var.e(this, true);
        }
        if (n51Var.d0() && i7 != 4) {
            n();
            return;
        }
        if (i7 == 4) {
            this.V = true;
            n51Var.g0();
            n51Var.q0(0L, false);
            n();
            b71Var.d(true, true);
        }
    }

    @Override // org.telegram.ui.Components.l51
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        if (this.S) {
            this.S = false;
            if (this.T || this.U) {
                if (this.U) {
                    this.r = 1;
                }
                this.n.setSurfaceTexture(surfaceTexture);
                this.n.setSurfaceTextureListener(this.j0);
                this.n.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.l51
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
            this.W = false;
            int i7 = this.g0;
            int i10 = this.h0;
            this.c.getVideoRotation();
            this.w.f(this.f0, false, i7, i10, this.I);
            this.r = 0;
        }
    }

    @Override // org.telegram.ui.Components.l51
    public final void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        fe0 fe0Var = this.c;
        if (fe0Var != null) {
            float f11 = i7 * f10;
            this.g0 = (int) f11;
            this.h0 = i10;
            float f12 = i10 == 0 ? 1.0f : f11 / i10;
            fe0Var.a(f12, 0);
            if (this.T) {
                this.w.c(f12);
            }
        }
    }

    @Override // org.telegram.ui.Components.l51
    public final void onRenderedFirstFrame() {
        this.M = true;
        this.L = System.currentTimeMillis();
        this.f0.invalidate();
    }

    @Override // org.telegram.ui.Components.l51
    public final /* synthetic */ void onSeekFinished(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.l51
    public final /* synthetic */ void onSeekStarted(m2.a aVar) {
    }

    public final void o() {
    }
}
