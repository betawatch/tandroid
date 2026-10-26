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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ma1 extends ViewGroup implements p81, AudioManager.OnAudioFocusChangeListener {
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
    public final s81 a;
    public final RadialProgressView a0;
    public final fa1 b;
    public final ImageView b0;
    public final vg0 c;
    public final ImageView c0;
    public final TextureView d;
    public final ImageView d0;
    public final ImageView e;
    public AnimatorSet e0;
    public final ViewGroup f;
    public final ia1 f0;
    public int g0;
    public Bitmap h;
    public int h0;
    public final ea1 i0;
    public final v50 j0;
    public final ea1 k0;
    public TextureView n;
    public int r;
    public boolean s;
    public final ja1 v;
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

    public ma1(Context context, boolean z10, ja1 ja1Var) {
        super(context);
        this.I = true;
        Paint paint = new Paint();
        this.Q = paint;
        this.i0 = new ea1(this, 0);
        this.j0 = new v50(this, 3);
        this.k0 = new ea1(this, 1);
        setWillNotDraw(false);
        this.v = ja1Var;
        paint.setColor(-16777216);
        vg0 vg0Var = new vg0(this, context, 1);
        this.c = vg0Var;
        addView(vg0Var, gb1.i(-1, -1, 17));
        fa1 fa1Var = new fa1(context, context);
        this.b = fa1Var;
        final w81 w81Var = new w81(this);
        fa1Var.addJavascriptInterface(new Object(w81Var) { // from class: org.telegram.ui.Components.WebPlayerView$JavaScriptInterface
            public final w81 a;

            {
                this.a = w81Var;
            }

            @JavascriptInterface
            public void returnResultToJava(String str) {
                ma1 ma1Var = (ma1) this.a.a;
                AsyncTask asyncTask = ma1Var.R;
                if (asyncTask == null || asyncTask.isCancelled()) {
                    return;
                }
                AsyncTask asyncTask2 = ma1Var.R;
                if (asyncTask2 instanceof la1) {
                    la1 la1Var = (la1) asyncTask2;
                    String[] strArr = la1Var.c;
                    strArr[0] = strArr[0].replace(la1Var.d, "/signature/" + str);
                    la1Var.b.countDown();
                }
            }
        }, "JavaScriptInterface");
        WebSettings settings = fa1Var.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup g7 = ja1Var.g();
        this.f = g7;
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        if (g7 != null) {
            g7.addView(textureView);
        } else {
            vg0Var.addView(textureView, gb1.i(-1, -1, 17));
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
        s81 s81Var = new s81();
        this.a = s81Var;
        s81Var.J = this;
        s81Var.V(textureView);
        ia1 ia1Var = new ia1(this, context);
        this.f0 = ia1Var;
        if (g7 != null) {
            g7.addView(ia1Var);
        } else {
            addView(ia1Var, gb1.g(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.a0 = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, gb1.i(48, 48, 17));
        ImageView imageView2 = new ImageView(context);
        this.b0 = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ia1Var.addView(imageView2, gb1.h(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        final int i10 = 0;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.da1
            public final /* synthetic */ ma1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        ma1 ma1Var = this.b;
                        if (ma1Var.w && !ma1Var.S && !ma1Var.W && ma1Var.M) {
                            ma1Var.T = !ma1Var.T;
                            ma1Var.l(true);
                            break;
                        }
                        break;
                    case 1:
                        ma1 ma1Var2 = this.b;
                        s81 s81Var2 = ma1Var2.a;
                        if (ma1Var2.w && ma1Var2.x != null) {
                            if (s81Var2.d == null) {
                                ma1Var2.i();
                            }
                            if (s81Var2.y()) {
                                s81Var2.B();
                            } else {
                                ma1Var2.V = false;
                                s81Var2.C();
                            }
                            ma1Var2.n();
                            break;
                        }
                        break;
                    default:
                        ma1 ma1Var3 = this.b;
                        ViewGroup viewGroup = ma1Var3.f;
                        boolean z11 = ma1Var3.I;
                        ja1 ja1Var2 = ma1Var3.v;
                        ia1 ia1Var2 = ma1Var3.f0;
                        vg0 vg0Var2 = ma1Var3.c;
                        TextureView textureView2 = ma1Var3.d;
                        if (textureView2 != null && ja1Var2.h() && !ma1Var3.S && !ma1Var3.W && ma1Var3.M) {
                            ma1Var3.W = true;
                            if (!ma1Var3.U) {
                                ma1Var3.T = false;
                                ja1Var2.i(true, ma1Var3.k0, vg0Var2.getAspectRatio(), z11);
                                break;
                            } else {
                                ViewGroup viewGroup2 = (ViewGroup) vg0Var2.getParent();
                                if (viewGroup2 != ma1Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(vg0Var2);
                                    }
                                    ma1Var3.addView(vg0Var2, 0, gb1.i(-1, -1, 17));
                                    vg0Var2.measure(View.MeasureSpec.makeMeasureSpec(ma1Var3.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(ma1Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), TLObject.FLAG_30));
                                }
                                Bitmap bitmap = ma1Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    ma1Var3.h = null;
                                }
                                ma1Var3.S = true;
                                ma1Var3.U = false;
                                ma1Var3.n();
                                ma1Var3.o();
                                ma1Var3.k();
                                ma1Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    vg0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) ia1Var2.getParent();
                                if (viewGroup3 != ma1Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(ia1Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(ia1Var2);
                                    } else {
                                        ma1Var3.addView(ia1Var2, 1);
                                    }
                                }
                                ia1Var2.d(false, false);
                                ja1Var2.i(false, null, vg0Var2.getAspectRatio(), z11);
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
        ia1Var.addView(imageView3, gb1.i(48, 48, 17));
        final int i11 = 1;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.da1
            public final /* synthetic */ ma1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        ma1 ma1Var = this.b;
                        if (ma1Var.w && !ma1Var.S && !ma1Var.W && ma1Var.M) {
                            ma1Var.T = !ma1Var.T;
                            ma1Var.l(true);
                            break;
                        }
                        break;
                    case 1:
                        ma1 ma1Var2 = this.b;
                        s81 s81Var2 = ma1Var2.a;
                        if (ma1Var2.w && ma1Var2.x != null) {
                            if (s81Var2.d == null) {
                                ma1Var2.i();
                            }
                            if (s81Var2.y()) {
                                s81Var2.B();
                            } else {
                                ma1Var2.V = false;
                                s81Var2.C();
                            }
                            ma1Var2.n();
                            break;
                        }
                        break;
                    default:
                        ma1 ma1Var3 = this.b;
                        ViewGroup viewGroup = ma1Var3.f;
                        boolean z11 = ma1Var3.I;
                        ja1 ja1Var2 = ma1Var3.v;
                        ia1 ia1Var2 = ma1Var3.f0;
                        vg0 vg0Var2 = ma1Var3.c;
                        TextureView textureView2 = ma1Var3.d;
                        if (textureView2 != null && ja1Var2.h() && !ma1Var3.S && !ma1Var3.W && ma1Var3.M) {
                            ma1Var3.W = true;
                            if (!ma1Var3.U) {
                                ma1Var3.T = false;
                                ja1Var2.i(true, ma1Var3.k0, vg0Var2.getAspectRatio(), z11);
                                break;
                            } else {
                                ViewGroup viewGroup2 = (ViewGroup) vg0Var2.getParent();
                                if (viewGroup2 != ma1Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(vg0Var2);
                                    }
                                    ma1Var3.addView(vg0Var2, 0, gb1.i(-1, -1, 17));
                                    vg0Var2.measure(View.MeasureSpec.makeMeasureSpec(ma1Var3.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(ma1Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), TLObject.FLAG_30));
                                }
                                Bitmap bitmap = ma1Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    ma1Var3.h = null;
                                }
                                ma1Var3.S = true;
                                ma1Var3.U = false;
                                ma1Var3.n();
                                ma1Var3.o();
                                ma1Var3.k();
                                ma1Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    vg0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) ia1Var2.getParent();
                                if (viewGroup3 != ma1Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(ia1Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(ia1Var2);
                                    } else {
                                        ma1Var3.addView(ia1Var2, 1);
                                    }
                                }
                                ia1Var2.d(false, false);
                                ja1Var2.i(false, null, vg0Var2.getAspectRatio(), z11);
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
            ia1Var.addView(imageView4, gb1.i(56, 48, 53));
            final int i12 = 2;
            imageView4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.da1
                public final /* synthetic */ ma1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            ma1 ma1Var = this.b;
                            if (ma1Var.w && !ma1Var.S && !ma1Var.W && ma1Var.M) {
                                ma1Var.T = !ma1Var.T;
                                ma1Var.l(true);
                                break;
                            }
                            break;
                        case 1:
                            ma1 ma1Var2 = this.b;
                            s81 s81Var2 = ma1Var2.a;
                            if (ma1Var2.w && ma1Var2.x != null) {
                                if (s81Var2.d == null) {
                                    ma1Var2.i();
                                }
                                if (s81Var2.y()) {
                                    s81Var2.B();
                                } else {
                                    ma1Var2.V = false;
                                    s81Var2.C();
                                }
                                ma1Var2.n();
                                break;
                            }
                            break;
                        default:
                            ma1 ma1Var3 = this.b;
                            ViewGroup viewGroup = ma1Var3.f;
                            boolean z11 = ma1Var3.I;
                            ja1 ja1Var2 = ma1Var3.v;
                            ia1 ia1Var2 = ma1Var3.f0;
                            vg0 vg0Var2 = ma1Var3.c;
                            TextureView textureView2 = ma1Var3.d;
                            if (textureView2 != null && ja1Var2.h() && !ma1Var3.S && !ma1Var3.W && ma1Var3.M) {
                                ma1Var3.W = true;
                                if (!ma1Var3.U) {
                                    ma1Var3.T = false;
                                    ja1Var2.i(true, ma1Var3.k0, vg0Var2.getAspectRatio(), z11);
                                    break;
                                } else {
                                    ViewGroup viewGroup2 = (ViewGroup) vg0Var2.getParent();
                                    if (viewGroup2 != ma1Var3) {
                                        if (viewGroup2 != null) {
                                            viewGroup2.removeView(vg0Var2);
                                        }
                                        ma1Var3.addView(vg0Var2, 0, gb1.i(-1, -1, 17));
                                        vg0Var2.measure(View.MeasureSpec.makeMeasureSpec(ma1Var3.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(ma1Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), TLObject.FLAG_30));
                                    }
                                    Bitmap bitmap = ma1Var3.h;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        ma1Var3.h = null;
                                    }
                                    ma1Var3.S = true;
                                    ma1Var3.U = false;
                                    ma1Var3.n();
                                    ma1Var3.o();
                                    ma1Var3.k();
                                    ma1Var3.m();
                                    textureView2.setVisibility(4);
                                    if (viewGroup != null) {
                                        viewGroup.addView(textureView2);
                                    } else {
                                        vg0Var2.addView(textureView2);
                                    }
                                    ViewGroup viewGroup3 = (ViewGroup) ia1Var2.getParent();
                                    if (viewGroup3 != ma1Var3) {
                                        if (viewGroup3 != null) {
                                            viewGroup3.removeView(ia1Var2);
                                        }
                                        if (viewGroup != null) {
                                            viewGroup.addView(ia1Var2);
                                        } else {
                                            ma1Var3.addView(ia1Var2, 1);
                                        }
                                    }
                                    ia1Var2.d(false, false);
                                    ja1Var2.i(false, null, vg0Var2.getAspectRatio(), z11);
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
        } catch (Exception e10) {
            FileLog.e(e10);
            return false;
        }
        try {
            Matcher matcher3 = o0.matcher(str);
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        try {
            Matcher matcher4 = q0.matcher(str);
        } catch (Exception e12) {
            FileLog.e(e12);
        }
        try {
            Matcher matcher5 = m0.matcher(str);
        } catch (Exception e13) {
            FileLog.e(e13);
        }
        try {
            Matcher matcher6 = p0.matcher(str);
        } catch (Exception e14) {
            FileLog.e(e14);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0170, code lost:
    
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
        boolean z12;
        StringBuilder sb2;
        boolean z13;
        URL url;
        InputStream inputStream2;
        boolean z14 = true;
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
            boolean z15 = !(th instanceof SocketTimeoutException) ? !(!(th instanceof UnknownHostException) && (!(th instanceof SocketException) ? (th instanceof FileNotFoundException) : !(th.getMessage() == null || !th.getMessage().contains("ECONNRESET")))) : ApplicationLoader.isNetworkOnline();
            FileLog.e(th);
            z11 = z15;
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
                                        } catch (Exception e10) {
                                            e = e10;
                                            FileLog.e(e);
                                            z14 = z13;
                                            z12 = z14;
                                            if (inputStream != null) {
                                            }
                                            if (z12) {
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        FileLog.e(th);
                                        z12 = z13;
                                        if (inputStream != null) {
                                        }
                                        if (z12) {
                                        }
                                    }
                                } else {
                                    z13 = false;
                                }
                            } catch (Exception e11) {
                                e = e11;
                                z13 = false;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            z13 = false;
                        }
                    }
                    z12 = z14;
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
                    FileLog.e(th7);
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
        ia1 ia1Var;
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
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (group5 != null) {
                    str4 = group5;
                    if (str4 == null) {
                        try {
                            Matcher matcher2 = m0.matcher(str);
                            group = matcher2.find() ? matcher2.group(3) : null;
                        } catch (Exception e11) {
                            FileLog.e(e11);
                        }
                        if (group != null) {
                            str8 = group;
                            if (str8 == null) {
                                try {
                                    Matcher matcher3 = o0.matcher(str);
                                    group2 = matcher3.find() ? matcher3.group(1) : null;
                                } catch (Exception e12) {
                                    FileLog.e(e12);
                                }
                                if (group2 != null) {
                                    str7 = group2;
                                    if (str7 == null) {
                                        try {
                                            Matcher matcher4 = p0.matcher(str);
                                            group3 = matcher4.find() ? matcher4.group(1) : null;
                                        } catch (Exception e13) {
                                            FileLog.e(e13);
                                        }
                                        if (group3 != null) {
                                            str6 = group3;
                                            if (str6 == null) {
                                                try {
                                                    Matcher matcher5 = q0.matcher(str);
                                                    group4 = matcher5.find() ? matcher5.group(1) : null;
                                                } catch (Exception e14) {
                                                    FileLog.e(e14);
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
                                                        } catch (Exception e15) {
                                                            FileLog.e(e15);
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
                                                    ia1Var = this.f0;
                                                    if (photo != null) {
                                                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 80, true);
                                                        if (closestPhotoSizeWithSize != null) {
                                                            ia1Var.a.setImage(null, null, ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "80_80_b", 0L, null, obj, 1);
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
                                                    ia1Var.c(0);
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
                                                        ia1Var.d(true, true);
                                                    } else {
                                                        if (str4 != null) {
                                                            la1 la1Var = new la1(this, str4);
                                                            la1Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                            this.R = la1Var;
                                                        } else if (str8 != null) {
                                                            ga1 ga1Var = new ga1(this, str8, 4);
                                                            ga1Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                            this.R = ga1Var;
                                                        } else if (d != null) {
                                                            ga1 ga1Var2 = new ga1(this, d, 1);
                                                            ga1Var2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                            this.R = ga1Var2;
                                                            this.H = true;
                                                        } else if (str7 != null) {
                                                            ga1 ga1Var3 = new ga1(this, str7, 0);
                                                            ga1Var3.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                            this.R = ga1Var3;
                                                        } else if (str6 != null) {
                                                            ga1 ga1Var4 = new ga1(this, str, 2);
                                                            ga1Var4.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                            this.R = ga1Var4;
                                                        } else if (str5 != null) {
                                                            ga1 ga1Var5 = new ga1(this, str5, 3);
                                                            ga1Var5.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                            this.R = ga1Var5;
                                                            this.H = true;
                                                        }
                                                        ia1Var.d(false, false);
                                                        j(true, false);
                                                    }
                                                    if (str4 != null && str8 == null && d == null && str7 == null && str3 == null && str6 == null && str5 == null) {
                                                        ia1Var.setVisibility(8);
                                                        return false;
                                                    }
                                                    ia1Var.setVisibility(0);
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
                                            ia1Var = this.f0;
                                            if (photo != null) {
                                            }
                                            animatorSet = this.e0;
                                            if (animatorSet != null) {
                                            }
                                            ia1Var.c(0);
                                            if (str4 != null) {
                                            }
                                            if (str3 != null) {
                                            }
                                            if (str4 != null) {
                                            }
                                            ia1Var.setVisibility(0);
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
                                    ia1Var = this.f0;
                                    if (photo != null) {
                                    }
                                    animatorSet = this.e0;
                                    if (animatorSet != null) {
                                    }
                                    ia1Var.c(0);
                                    if (str4 != null) {
                                    }
                                    if (str3 != null) {
                                    }
                                    if (str4 != null) {
                                    }
                                    ia1Var.setVisibility(0);
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
                            ia1Var = this.f0;
                            if (photo != null) {
                            }
                            animatorSet = this.e0;
                            if (animatorSet != null) {
                            }
                            ia1Var.c(0);
                            if (str4 != null) {
                            }
                            if (str3 != null) {
                            }
                            if (str4 != null) {
                            }
                            ia1Var.setVisibility(0);
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
                    ia1Var = this.f0;
                    if (photo != null) {
                    }
                    animatorSet = this.e0;
                    if (animatorSet != null) {
                    }
                    ia1Var.c(0);
                    if (str4 != null) {
                    }
                    if (str3 != null) {
                    }
                    if (str4 != null) {
                    }
                    ia1Var.setVisibility(0);
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
                ia1Var = this.f0;
                if (photo != null) {
                }
                animatorSet = this.e0;
                if (animatorSet != null) {
                }
                ia1Var.c(0);
                if (str4 != null) {
                }
                if (str3 != null) {
                }
                if (str4 != null) {
                }
                ia1Var.setVisibility(0);
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
        ia1Var = this.f0;
        if (photo != null) {
        }
        animatorSet = this.e0;
        if (animatorSet != null) {
        }
        ia1Var.c(0);
        if (str4 != null) {
        }
        if (str3 != null) {
        }
        if (str4 != null) {
        }
        ia1Var.setVisibility(0);
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
        ia1 ia1Var = this.f0;
        if (ia1Var.getParent() != this) {
            ia1Var.setVisibility(8);
        }
        this.v.d();
    }

    public final void i() {
        String str = this.x;
        if (str == null) {
            return;
        }
        String str2 = this.E;
        s81 s81Var = this.a;
        if (str2 != null) {
            s81Var.G(Uri.parse(str), this.y, Uri.parse(this.E), this.F);
        } else {
            s81Var.D(Uri.parse(str), this.y);
        }
        s81Var.P(this.s);
        long p10 = s81Var.p();
        ia1 ia1Var = this.f0;
        if (p10 != -9223372036854775807L) {
            ia1Var.b((int) (s81Var.p() / 1000));
        } else {
            ia1Var.b(0);
        }
        k();
        o();
        m();
        ia1Var.invalidate();
        if (this.O != -1) {
            s81Var.L(r0 * MediaDataController.MAX_STYLE_RUNS_COUNT, false);
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
        this.e0.addListener(new h31(this, 8));
        this.e0.start();
    }

    public final void k() {
        i2.j0 j0Var = this.a.d;
        ImageView imageView = this.b0;
        if (j0Var == null || this.U) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        if (this.T) {
            imageView.setImageResource(R.drawable.ic_outfullscreen);
            imageView.setLayoutParams(gb1.h(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 1.0f));
        } else {
            imageView.setImageResource(R.drawable.ic_gofullscreen);
            imageView.setLayoutParams(gb1.h(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
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
        vg0 vg0Var = this.c;
        if (viewGroup2 != null) {
            if (this.T) {
                ViewGroup viewGroup3 = (ViewGroup) vg0Var.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(vg0Var);
                }
            } else {
                ViewGroup viewGroup4 = (ViewGroup) vg0Var.getParent();
                if (viewGroup4 != this) {
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(vg0Var);
                    }
                    addView(vg0Var, 0);
                }
            }
            this.v.a(this.f0, this.T, vg0Var.getAspectRatio(), vg0Var.getVideoRotation(), z10);
            return;
        }
        this.S = true;
        if (!this.T) {
            if (viewGroup2 != null) {
                viewGroup2.addView(textureView);
            } else {
                vg0Var.addView(textureView);
            }
        }
        boolean z11 = this.T;
        ia1 ia1Var = this.f0;
        if (z11) {
            ViewGroup viewGroup5 = (ViewGroup) ia1Var.getParent();
            if (viewGroup5 != null) {
                viewGroup5.removeView(ia1Var);
            }
        } else {
            ViewGroup viewGroup6 = (ViewGroup) ia1Var.getParent();
            if (viewGroup6 != this) {
                if (viewGroup6 != null) {
                    viewGroup6.removeView(ia1Var);
                }
                if (viewGroup2 != null) {
                    viewGroup2.addView(ia1Var);
                } else {
                    addView(ia1Var, 1);
                }
            }
        }
        TextureView a2 = this.v.a(this.f0, this.T, vg0Var.getAspectRatio(), vg0Var.getVideoRotation(), z10);
        this.n = a2;
        a2.setVisibility(4);
        if (this.T && this.n != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
            viewGroup.removeView(textureView);
        }
        int i10 = ia1.I;
        ia1Var.a();
    }

    public final void m() {
        ImageView imageView = this.d0;
        if (imageView == null) {
            return;
        }
        imageView.setImageResource(this.U ? R.drawable.ic_goinline : R.drawable.ic_outinline);
        imageView.setVisibility(this.a.d != null ? 0 : 8);
        if (this.U) {
            imageView.setLayoutParams(gb1.i(40, 40, 53));
        } else {
            imageView.setLayoutParams(gb1.i(56, 50, 53));
        }
    }

    public final void n() {
        ia1 ia1Var = this.f0;
        int i10 = ia1.I;
        ia1Var.a();
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
        AndroidUtilities.runOnUIThread(new h2(this, i10, 13));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f), this.Q);
    }

    @Override // org.telegram.ui.Components.p81
    public final void onError(s81 s81Var, Exception exc) {
        FileLog.e(exc);
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        vg0 vg0Var = this.c;
        int measuredWidth = (i14 - vg0Var.getMeasuredWidth()) / 2;
        int i15 = i13 - i11;
        int dp = ((i15 - AndroidUtilities.dp(10.0f)) - vg0Var.getMeasuredHeight()) / 2;
        vg0Var.layout(measuredWidth, dp, vg0Var.getMeasuredWidth() + measuredWidth, vg0Var.getMeasuredHeight() + dp);
        ia1 ia1Var = this.f0;
        if (ia1Var.getParent() == this) {
            ia1Var.layout(0, 0, ia1Var.getMeasuredWidth(), ia1Var.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.a0;
        int measuredWidth2 = (i14 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i15 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        ia1Var.a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f));
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.c.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2 - AndroidUtilities.dp(10.0f), TLObject.FLAG_30));
        ia1 ia1Var = this.f0;
        if (ia1Var.getParent() == this) {
            ia1Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        this.a0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), TLObject.FLAG_30));
        setMeasuredDimension(size, size2);
    }

    @Override // org.telegram.ui.Components.p81
    public final /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.p81
    public final void onStateChanged(boolean z10, int i10) {
        ia1 ia1Var = this.f0;
        s81 s81Var = this.a;
        if (i10 != 2) {
            if (s81Var.p() != -9223372036854775807L) {
                ia1Var.b((int) (s81Var.p() / 1000));
            } else {
                ia1Var.b(0);
            }
        }
        ja1 ja1Var = this.v;
        if (i10 == 4 || i10 == 1 || !s81Var.y()) {
            ja1Var.e(this, false);
        } else {
            ja1Var.e(this, true);
        }
        if (s81Var.y() && i10 != 4) {
            n();
            return;
        }
        if (i10 == 4) {
            this.V = true;
            s81Var.B();
            s81Var.L(0L, false);
            n();
            ia1Var.d(true, true);
        }
    }

    @Override // org.telegram.ui.Components.p81
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

    @Override // org.telegram.ui.Components.p81
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

    @Override // org.telegram.ui.Components.p81
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        vg0 vg0Var = this.c;
        if (vg0Var != null) {
            float f10 = i10 * f7;
            this.g0 = (int) f10;
            this.h0 = i11;
            float f11 = i11 == 0 ? 1.0f : f10 / i11;
            vg0Var.a(f11, 0);
            if (this.T) {
                this.v.c(f11);
            }
        }
    }

    @Override // org.telegram.ui.Components.p81
    public final void onRenderedFirstFrame() {
        this.M = true;
        this.L = System.currentTimeMillis();
        this.f0.invalidate();
    }

    public final void o() {
    }

    @Override // org.telegram.ui.Components.p81
    public final /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.p81
    public final /* synthetic */ void onSeekStarted(j2.a aVar) {
    }
}
