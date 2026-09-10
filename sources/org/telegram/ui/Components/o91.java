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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class o91 extends ViewGroup implements q71, AudioManager.OnAudioFocusChangeListener {
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
    public final t71 a;
    public final RadialProgressView a0;
    public final h91 b;
    public final ImageView b0;
    public final gg0 c;
    public final ImageView c0;
    public final TextureView d;
    public final ImageView d0;
    public final ImageView e;
    public AnimatorSet e0;
    public final ViewGroup f;
    public final k91 f0;
    public int g0;
    public Bitmap h;
    public int h0;
    public final g91 i0;
    public final t50 j0;
    public final g91 k0;
    public TextureView n;
    public int r;
    public boolean s;
    public final l91 v;
    public boolean w;
    public String x;
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

    public o91(Context context, boolean z10, l91 l91Var) {
        super(context);
        this.I = true;
        Paint paint = new Paint();
        this.Q = paint;
        this.i0 = new g91(this, 0);
        this.j0 = new t50(this, 3);
        this.k0 = new g91(this, 1);
        setWillNotDraw(false);
        this.v = l91Var;
        paint.setColor(-16777216);
        gg0 gg0Var = new gg0(this, context, 1);
        this.c = gg0Var;
        addView(gg0Var, w7.a6.e(-1, -1, 17));
        h91 h91Var = new h91(context, context);
        this.b = h91Var;
        final e91 e91Var = new e91(this);
        h91Var.addJavascriptInterface(new Object(e91Var) { // from class: org.telegram.ui.Components.WebPlayerView$JavaScriptInterface
            public final e91 a;

            {
                this.a = e91Var;
            }

            @JavascriptInterface
            public void returnResultToJava(String str) {
                o91 o91Var = (o91) this.a.a;
                AsyncTask asyncTask = o91Var.R;
                if (asyncTask == null || asyncTask.isCancelled()) {
                    return;
                }
                AsyncTask asyncTask2 = o91Var.R;
                if (asyncTask2 instanceof n91) {
                    n91 n91Var = (n91) asyncTask2;
                    String[] strArr = n91Var.c;
                    strArr[0] = strArr[0].replace(n91Var.d, "/signature/" + str);
                    n91Var.b.countDown();
                }
            }
        }, "JavaScriptInterface");
        WebSettings settings = h91Var.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup g10 = l91Var.g();
        this.f = g10;
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        if (g10 != null) {
            g10.addView(textureView);
        } else {
            gg0Var.addView(textureView, w7.a6.e(-1, -1, 17));
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
        t71 t71Var = new t71();
        this.a = t71Var;
        t71Var.J = this;
        t71Var.V(textureView);
        k91 k91Var = new k91(this, context);
        this.f0 = k91Var;
        if (g10 != null) {
            g10.addView(k91Var);
        } else {
            addView(k91Var, w7.a6.c(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.a0 = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, w7.a6.e(48, 48, 17));
        ImageView imageView2 = new ImageView(context);
        this.b0 = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        k91Var.addView(imageView2, w7.a6.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        final int i10 = 0;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.f91
            public final /* synthetic */ o91 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        o91 o91Var = this.b;
                        if (o91Var.w && !o91Var.S && !o91Var.W && o91Var.M) {
                            o91Var.T = !o91Var.T;
                            o91Var.l(true);
                            break;
                        }
                        break;
                    case 1:
                        o91 o91Var2 = this.b;
                        t71 t71Var2 = o91Var2.a;
                        if (o91Var2.w && o91Var2.x != null) {
                            if (t71Var2.d == null) {
                                o91Var2.i();
                            }
                            if (t71Var2.y()) {
                                t71Var2.B();
                            } else {
                                o91Var2.V = false;
                                t71Var2.C();
                            }
                            o91Var2.n();
                            break;
                        }
                        break;
                    default:
                        o91 o91Var3 = this.b;
                        ViewGroup viewGroup = o91Var3.f;
                        boolean z11 = o91Var3.I;
                        l91 l91Var2 = o91Var3.v;
                        k91 k91Var2 = o91Var3.f0;
                        gg0 gg0Var2 = o91Var3.c;
                        TextureView textureView2 = o91Var3.d;
                        if (textureView2 != null && l91Var2.h() && !o91Var3.S && !o91Var3.W && o91Var3.M) {
                            o91Var3.W = true;
                            if (!o91Var3.U) {
                                o91Var3.T = false;
                                l91Var2.i(true, o91Var3.k0, gg0Var2.getAspectRatio(), z11);
                                break;
                            } else {
                                ViewGroup viewGroup2 = (ViewGroup) gg0Var2.getParent();
                                if (viewGroup2 != o91Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(gg0Var2);
                                    }
                                    o91Var3.addView(gg0Var2, 0, w7.a6.e(-1, -1, 17));
                                    gg0Var2.measure(View.MeasureSpec.makeMeasureSpec(o91Var3.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(o91Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), TLObject.FLAG_30));
                                }
                                Bitmap bitmap = o91Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    o91Var3.h = null;
                                }
                                o91Var3.S = true;
                                o91Var3.U = false;
                                o91Var3.n();
                                o91Var3.o();
                                o91Var3.k();
                                o91Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    gg0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) k91Var2.getParent();
                                if (viewGroup3 != o91Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(k91Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(k91Var2);
                                    } else {
                                        o91Var3.addView(k91Var2, 1);
                                    }
                                }
                                k91Var2.d(false, false);
                                l91Var2.i(false, null, gg0Var2.getAspectRatio(), z11);
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
        k91Var.addView(imageView3, w7.a6.e(48, 48, 17));
        final int i11 = 1;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.f91
            public final /* synthetic */ o91 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        o91 o91Var = this.b;
                        if (o91Var.w && !o91Var.S && !o91Var.W && o91Var.M) {
                            o91Var.T = !o91Var.T;
                            o91Var.l(true);
                            break;
                        }
                        break;
                    case 1:
                        o91 o91Var2 = this.b;
                        t71 t71Var2 = o91Var2.a;
                        if (o91Var2.w && o91Var2.x != null) {
                            if (t71Var2.d == null) {
                                o91Var2.i();
                            }
                            if (t71Var2.y()) {
                                t71Var2.B();
                            } else {
                                o91Var2.V = false;
                                t71Var2.C();
                            }
                            o91Var2.n();
                            break;
                        }
                        break;
                    default:
                        o91 o91Var3 = this.b;
                        ViewGroup viewGroup = o91Var3.f;
                        boolean z11 = o91Var3.I;
                        l91 l91Var2 = o91Var3.v;
                        k91 k91Var2 = o91Var3.f0;
                        gg0 gg0Var2 = o91Var3.c;
                        TextureView textureView2 = o91Var3.d;
                        if (textureView2 != null && l91Var2.h() && !o91Var3.S && !o91Var3.W && o91Var3.M) {
                            o91Var3.W = true;
                            if (!o91Var3.U) {
                                o91Var3.T = false;
                                l91Var2.i(true, o91Var3.k0, gg0Var2.getAspectRatio(), z11);
                                break;
                            } else {
                                ViewGroup viewGroup2 = (ViewGroup) gg0Var2.getParent();
                                if (viewGroup2 != o91Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(gg0Var2);
                                    }
                                    o91Var3.addView(gg0Var2, 0, w7.a6.e(-1, -1, 17));
                                    gg0Var2.measure(View.MeasureSpec.makeMeasureSpec(o91Var3.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(o91Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), TLObject.FLAG_30));
                                }
                                Bitmap bitmap = o91Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    o91Var3.h = null;
                                }
                                o91Var3.S = true;
                                o91Var3.U = false;
                                o91Var3.n();
                                o91Var3.o();
                                o91Var3.k();
                                o91Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    gg0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) k91Var2.getParent();
                                if (viewGroup3 != o91Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(k91Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(k91Var2);
                                    } else {
                                        o91Var3.addView(k91Var2, 1);
                                    }
                                }
                                k91Var2.d(false, false);
                                l91Var2.i(false, null, gg0Var2.getAspectRatio(), z11);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        if (z10) {
            ImageView imageView4 = new ImageView(context);
            this.d0 = imageView4;
            imageView4.setScaleType(scaleType);
            k91Var.addView(imageView4, w7.a6.e(56, 48, 53));
            final int i12 = 2;
            imageView4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.f91
                public final /* synthetic */ o91 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            o91 o91Var = this.b;
                            if (o91Var.w && !o91Var.S && !o91Var.W && o91Var.M) {
                                o91Var.T = !o91Var.T;
                                o91Var.l(true);
                                break;
                            }
                            break;
                        case 1:
                            o91 o91Var2 = this.b;
                            t71 t71Var2 = o91Var2.a;
                            if (o91Var2.w && o91Var2.x != null) {
                                if (t71Var2.d == null) {
                                    o91Var2.i();
                                }
                                if (t71Var2.y()) {
                                    t71Var2.B();
                                } else {
                                    o91Var2.V = false;
                                    t71Var2.C();
                                }
                                o91Var2.n();
                                break;
                            }
                            break;
                        default:
                            o91 o91Var3 = this.b;
                            ViewGroup viewGroup = o91Var3.f;
                            boolean z11 = o91Var3.I;
                            l91 l91Var2 = o91Var3.v;
                            k91 k91Var2 = o91Var3.f0;
                            gg0 gg0Var2 = o91Var3.c;
                            TextureView textureView2 = o91Var3.d;
                            if (textureView2 != null && l91Var2.h() && !o91Var3.S && !o91Var3.W && o91Var3.M) {
                                o91Var3.W = true;
                                if (!o91Var3.U) {
                                    o91Var3.T = false;
                                    l91Var2.i(true, o91Var3.k0, gg0Var2.getAspectRatio(), z11);
                                    break;
                                } else {
                                    ViewGroup viewGroup2 = (ViewGroup) gg0Var2.getParent();
                                    if (viewGroup2 != o91Var3) {
                                        if (viewGroup2 != null) {
                                            viewGroup2.removeView(gg0Var2);
                                        }
                                        o91Var3.addView(gg0Var2, 0, w7.a6.e(-1, -1, 17));
                                        gg0Var2.measure(View.MeasureSpec.makeMeasureSpec(o91Var3.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(o91Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), TLObject.FLAG_30));
                                    }
                                    Bitmap bitmap = o91Var3.h;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        o91Var3.h = null;
                                    }
                                    o91Var3.S = true;
                                    o91Var3.U = false;
                                    o91Var3.n();
                                    o91Var3.o();
                                    o91Var3.k();
                                    o91Var3.m();
                                    textureView2.setVisibility(4);
                                    if (viewGroup != null) {
                                        viewGroup.addView(textureView2);
                                    } else {
                                        gg0Var2.addView(textureView2);
                                    }
                                    ViewGroup viewGroup3 = (ViewGroup) k91Var2.getParent();
                                    if (viewGroup3 != o91Var3) {
                                        if (viewGroup3 != null) {
                                            viewGroup3.removeView(k91Var2);
                                        }
                                        if (viewGroup != null) {
                                            viewGroup.addView(k91Var2);
                                        } else {
                                            o91Var3.addView(k91Var2, 1);
                                        }
                                    }
                                    k91Var2.d(false, false);
                                    l91Var2.i(false, null, gg0Var2.getAspectRatio(), z11);
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
                Matcher matcher = l0.matcher(str);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        try {
            Matcher matcher2 = n0.matcher(str);
            return (matcher2.find() ? matcher2.group(1) : null) != null;
        } catch (Exception e7) {
            FileLog.e(e7);
            return false;
        }
        try {
            Matcher matcher3 = o0.matcher(str);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        try {
            Matcher matcher4 = q0.matcher(str);
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        try {
            Matcher matcher5 = m0.matcher(str);
        } catch (Exception e12) {
            FileLog.e(e12);
        }
        try {
            Matcher matcher6 = p0.matcher(str);
        } catch (Exception e13) {
            FileLog.e(e13);
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
            } catch (Exception e) {
                FileLog.e(e);
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
                                        } catch (Exception e7) {
                                            e = e7;
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
                            } catch (Exception e10) {
                                e = e10;
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
                Matcher matcher = n0.matcher(str);
                String group = matcher.find() ? matcher.group(1) : null;
                if (group != null) {
                    return group;
                }
            } catch (Exception e) {
                FileLog.e(e);
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
        this.a.H();
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
        k91 k91Var;
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
                                    this.O = (Utilities.parseInt((CharSequence) split[0]).intValue() * 60) + Utilities.parseInt((CharSequence) split[1]).intValue();
                                } else {
                                    this.O = Utilities.parseInt((CharSequence) queryParameter).intValue();
                                }
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    Matcher matcher = l0.matcher(str);
                    group5 = matcher.find() ? matcher.group(1) : null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                if (group5 != null) {
                    str4 = group5;
                    if (str4 == null) {
                        try {
                            Matcher matcher2 = m0.matcher(str);
                            group = matcher2.find() ? matcher2.group(3) : null;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        if (group != null) {
                            str8 = group;
                            if (str8 == null) {
                                try {
                                    Matcher matcher3 = o0.matcher(str);
                                    group2 = matcher3.find() ? matcher3.group(1) : null;
                                } catch (Exception e11) {
                                    FileLog.e(e11);
                                }
                                if (group2 != null) {
                                    str7 = group2;
                                    if (str7 == null) {
                                        try {
                                            Matcher matcher4 = p0.matcher(str);
                                            group3 = matcher4.find() ? matcher4.group(1) : null;
                                        } catch (Exception e12) {
                                            FileLog.e(e12);
                                        }
                                        if (group3 != null) {
                                            str6 = group3;
                                            if (str6 == null) {
                                                try {
                                                    Matcher matcher5 = q0.matcher(str);
                                                    group4 = matcher5.find() ? matcher5.group(1) : null;
                                                } catch (Exception e13) {
                                                    FileLog.e(e13);
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
                                                        } catch (Exception e14) {
                                                            FileLog.e(e14);
                                                        }
                                                    }
                                                    str3 = null;
                                                    this.w = false;
                                                    this.V = false;
                                                    this.s = z10;
                                                    this.x = null;
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
                                                    k91Var = this.f0;
                                                    if (photo != null) {
                                                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 80, true);
                                                        if (closestPhotoSizeWithSize != null) {
                                                            k91Var.a.setImage(null, null, ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "80_80_b", 0L, null, obj, 1);
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
                                                    k91Var.c(0);
                                                    if (str4 != null) {
                                                        this.G = str4;
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
                                                        k91Var.d(true, true);
                                                    } else {
                                                        if (str4 != null) {
                                                            n91 n91Var = new n91(this, str4);
                                                            n91Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                            this.R = n91Var;
                                                        } else if (str8 != null) {
                                                            i91 i91Var = new i91(this, str8, 4);
                                                            i91Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                            this.R = i91Var;
                                                        } else if (d != null) {
                                                            i91 i91Var2 = new i91(this, d, 1);
                                                            i91Var2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                            this.R = i91Var2;
                                                            this.H = true;
                                                        } else if (str7 != null) {
                                                            i91 i91Var3 = new i91(this, str7, 0);
                                                            i91Var3.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                            this.R = i91Var3;
                                                        } else if (str6 != null) {
                                                            i91 i91Var4 = new i91(this, str, 2);
                                                            i91Var4.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                            this.R = i91Var4;
                                                        } else if (str5 != null) {
                                                            i91 i91Var5 = new i91(this, str5, 3);
                                                            i91Var5.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                            this.R = i91Var5;
                                                            this.H = true;
                                                        }
                                                        k91Var.d(false, false);
                                                        j(true, false);
                                                    }
                                                    if (str4 != null && str8 == null && d == null && str7 == null && str3 == null && str6 == null && str5 == null) {
                                                        k91Var.setVisibility(8);
                                                        return false;
                                                    }
                                                    k91Var.setVisibility(0);
                                                    return true;
                                                }
                                            }
                                            str5 = null;
                                            if (str5 == null) {
                                            }
                                            str3 = null;
                                            this.w = false;
                                            this.V = false;
                                            this.s = z10;
                                            this.x = null;
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
                                            k91Var = this.f0;
                                            if (photo != null) {
                                            }
                                            animatorSet = this.e0;
                                            if (animatorSet != null) {
                                            }
                                            k91Var.c(0);
                                            if (str4 != null) {
                                            }
                                            if (str3 != null) {
                                            }
                                            if (str4 != null) {
                                            }
                                            k91Var.setVisibility(0);
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
                                    this.V = false;
                                    this.s = z10;
                                    this.x = null;
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
                                    k91Var = this.f0;
                                    if (photo != null) {
                                    }
                                    animatorSet = this.e0;
                                    if (animatorSet != null) {
                                    }
                                    k91Var.c(0);
                                    if (str4 != null) {
                                    }
                                    if (str3 != null) {
                                    }
                                    if (str4 != null) {
                                    }
                                    k91Var.setVisibility(0);
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
                            this.V = false;
                            this.s = z10;
                            this.x = null;
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
                            k91Var = this.f0;
                            if (photo != null) {
                            }
                            animatorSet = this.e0;
                            if (animatorSet != null) {
                            }
                            k91Var.c(0);
                            if (str4 != null) {
                            }
                            if (str3 != null) {
                            }
                            if (str4 != null) {
                            }
                            k91Var.setVisibility(0);
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
                    this.V = false;
                    this.s = z10;
                    this.x = null;
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
                    k91Var = this.f0;
                    if (photo != null) {
                    }
                    animatorSet = this.e0;
                    if (animatorSet != null) {
                    }
                    k91Var.c(0);
                    if (str4 != null) {
                    }
                    if (str3 != null) {
                    }
                    if (str4 != null) {
                    }
                    k91Var.setVisibility(0);
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
                this.V = false;
                this.s = z10;
                this.x = null;
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
                k91Var = this.f0;
                if (photo != null) {
                }
                animatorSet = this.e0;
                if (animatorSet != null) {
                }
                k91Var.c(0);
                if (str4 != null) {
                }
                if (str3 != null) {
                }
                if (str4 != null) {
                }
                k91Var.setVisibility(0);
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
        this.V = false;
        this.s = z10;
        this.x = null;
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
        k91Var = this.f0;
        if (photo != null) {
        }
        animatorSet = this.e0;
        if (animatorSet != null) {
        }
        k91Var.c(0);
        if (str4 != null) {
        }
        if (str3 != null) {
        }
        if (str4 != null) {
        }
        k91Var.setVisibility(0);
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
        k91 k91Var = this.f0;
        if (k91Var.getParent() != this) {
            k91Var.setVisibility(8);
        }
        this.v.d();
    }

    public final void i() {
        String str = this.x;
        if (str == null) {
            return;
        }
        String str2 = this.E;
        t71 t71Var = this.a;
        if (str2 != null) {
            t71Var.G(Uri.parse(str), this.y, Uri.parse(this.E), this.F);
        } else {
            t71Var.D(Uri.parse(str), this.y);
        }
        t71Var.P(this.s);
        long p5 = t71Var.p();
        k91 k91Var = this.f0;
        if (p5 != -9223372036854775807L) {
            k91Var.b((int) (t71Var.p() / 1000));
        } else {
            k91Var.b(0);
        }
        k();
        o();
        m();
        k91Var.invalidate();
        if (this.O != -1) {
            t71Var.L(r0 * MediaDataController.MAX_STYLE_RUNS_COUNT, false);
        }
    }

    public final void j(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.a0;
        if (!z11) {
            radialProgressView.setAlpha(z10 ? 1.0f : 0.0f);
            return;
        }
        AnimatorSet animatorSet = this.e0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.e0 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, "alpha", z10 ? 1.0f : 0.0f));
        this.e0.setDuration(150L);
        this.e0.addListener(new zn0(this, 20));
        this.e0.start();
    }

    public final void k() {
        i2.e0 e0Var = this.a.d;
        ImageView imageView = this.b0;
        if (e0Var == null || this.U) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        if (this.T) {
            imageView.setImageResource(R.drawable.ic_outfullscreen);
            imageView.setLayoutParams(w7.a6.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 1.0f));
        } else {
            imageView.setImageResource(R.drawable.ic_gofullscreen);
            imageView.setLayoutParams(w7.a6.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
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
        gg0 gg0Var = this.c;
        if (viewGroup2 != null) {
            if (this.T) {
                ViewGroup viewGroup3 = (ViewGroup) gg0Var.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(gg0Var);
                }
            } else {
                ViewGroup viewGroup4 = (ViewGroup) gg0Var.getParent();
                if (viewGroup4 != this) {
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(gg0Var);
                    }
                    addView(gg0Var, 0);
                }
            }
            this.v.a(this.f0, this.T, gg0Var.getAspectRatio(), gg0Var.getVideoRotation(), z10);
            return;
        }
        this.S = true;
        if (!this.T) {
            if (viewGroup2 != null) {
                viewGroup2.addView(textureView);
            } else {
                gg0Var.addView(textureView);
            }
        }
        boolean z11 = this.T;
        k91 k91Var = this.f0;
        if (z11) {
            ViewGroup viewGroup5 = (ViewGroup) k91Var.getParent();
            if (viewGroup5 != null) {
                viewGroup5.removeView(k91Var);
            }
        } else {
            ViewGroup viewGroup6 = (ViewGroup) k91Var.getParent();
            if (viewGroup6 != this) {
                if (viewGroup6 != null) {
                    viewGroup6.removeView(k91Var);
                }
                if (viewGroup2 != null) {
                    viewGroup2.addView(k91Var);
                } else {
                    addView(k91Var, 1);
                }
            }
        }
        TextureView a2 = this.v.a(this.f0, this.T, gg0Var.getAspectRatio(), gg0Var.getVideoRotation(), z10);
        this.n = a2;
        a2.setVisibility(4);
        if (this.T && this.n != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
            viewGroup.removeView(textureView);
        }
        int i10 = k91.I;
        k91Var.a();
    }

    public final void m() {
        ImageView imageView = this.d0;
        if (imageView == null) {
            return;
        }
        imageView.setImageResource(this.U ? R.drawable.ic_goinline : R.drawable.ic_outinline);
        imageView.setVisibility(this.a.d != null ? 0 : 8);
        if (this.U) {
            imageView.setLayoutParams(w7.a6.e(40, 40, 53));
        } else {
            imageView.setLayoutParams(w7.a6.e(56, 50, 53));
        }
    }

    public final void n() {
        k91 k91Var = this.f0;
        int i10 = k91.I;
        k91Var.a();
        AndroidUtilities.cancelRunOnUIThread(this.i0);
        if (!this.a.y()) {
            if (this.V) {
                this.c0.setImageResource(this.U ? R.drawable.ic_againinline : R.drawable.ic_again);
                return;
            } else {
                this.c0.setImageResource(this.U ? R.drawable.ic_playinline : R.drawable.ic_play);
                return;
            }
        }
        this.c0.setImageResource(this.U ? R.drawable.ic_pauseinline : R.drawable.ic_pause);
        AndroidUtilities.runOnUIThread(this.i0, 500L);
        if (this.J) {
            return;
        }
        AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        this.J = true;
        audioManager.requestAudioFocus(this, 3, 1);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        AndroidUtilities.runOnUIThread(new zd(this, i10, 12));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f), this.Q);
    }

    @Override // org.telegram.ui.Components.q71
    public final void onError(t71 t71Var, Exception exc) {
        FileLog.e(exc);
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        gg0 gg0Var = this.c;
        int measuredWidth = (i14 - gg0Var.getMeasuredWidth()) / 2;
        int i15 = i13 - i11;
        int dp = ((i15 - AndroidUtilities.dp(10.0f)) - gg0Var.getMeasuredHeight()) / 2;
        gg0Var.layout(measuredWidth, dp, gg0Var.getMeasuredWidth() + measuredWidth, gg0Var.getMeasuredHeight() + dp);
        k91 k91Var = this.f0;
        if (k91Var.getParent() == this) {
            k91Var.layout(0, 0, k91Var.getMeasuredWidth(), k91Var.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.a0;
        int measuredWidth2 = (i14 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i15 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        k91Var.a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f));
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.c.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2 - AndroidUtilities.dp(10.0f), TLObject.FLAG_30));
        k91 k91Var = this.f0;
        if (k91Var.getParent() == this) {
            k91Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        this.a0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), TLObject.FLAG_30));
        setMeasuredDimension(size, size2);
    }

    @Override // org.telegram.ui.Components.q71
    public final /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q71
    public final void onStateChanged(boolean z10, int i10) {
        k91 k91Var = this.f0;
        t71 t71Var = this.a;
        if (i10 != 2) {
            if (t71Var.p() != -9223372036854775807L) {
                k91Var.b((int) (t71Var.p() / 1000));
            } else {
                k91Var.b(0);
            }
        }
        l91 l91Var = this.v;
        if (i10 == 4 || i10 == 1 || !t71Var.y()) {
            l91Var.e(this, false);
        } else {
            l91Var.e(this, true);
        }
        if (t71Var.y() && i10 != 4) {
            n();
            return;
        }
        if (i10 == 4) {
            this.V = true;
            t71Var.B();
            t71Var.L(0L, false);
            n();
            k91Var.d(true, true);
        }
    }

    @Override // org.telegram.ui.Components.q71
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

    @Override // org.telegram.ui.Components.q71
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
            int i10 = this.g0;
            int i11 = this.h0;
            this.c.getVideoRotation();
            this.v.f(this.f0, false, i10, i11, this.I);
            this.r = 0;
        }
    }

    @Override // org.telegram.ui.Components.q71
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        gg0 gg0Var = this.c;
        if (gg0Var != null) {
            float f10 = i10 * f7;
            this.g0 = (int) f10;
            this.h0 = i11;
            float f11 = i11 == 0 ? 1.0f : f10 / i11;
            gg0Var.a(f11, 0);
            if (this.T) {
                this.v.c(f11);
            }
        }
    }

    @Override // org.telegram.ui.Components.q71
    public final void onRenderedFirstFrame() {
        this.M = true;
        this.L = System.currentTimeMillis();
        this.f0.invalidate();
    }

    public final void o() {
    }

    @Override // org.telegram.ui.Components.q71
    public final /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q71
    public final /* synthetic */ void onSeekStarted(j2.a aVar) {
    }
}
