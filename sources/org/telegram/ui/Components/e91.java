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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class e91 extends ViewGroup implements g71, AudioManager.OnAudioFocusChangeListener {
    public static final Pattern i0 = Pattern.compile("(?:youtube(?:-nocookie)?\\.com/(?:[^/\\n\\s]+/\\S+/|(?:v|e(?:mbed)?)/|\\S*?[?&]v=)|youtu\\.be/)([a-zA-Z0-9_-]{11})");
    public static final Pattern j0 = Pattern.compile("https?://(?:(?:www|(player))\\.)?vimeo(pro)?\\.com/(?!(?:channels|album)/[^/?#]+/?(?:$|[?#])|[^/]+/review/|ondemand/)(?:.*?/)?(?:(?:play_redirect_hls|moogaloop\\.swf)\\?clip_id=)?(?:videos?/)?([0-9]+)(?:/[\\da-f]+)?/?(?:[?&].*)?(?:[#].*)?$");
    public static final Pattern k0 = Pattern.compile("(?:coub:|https?://(?:coub\\.com/(?:view|embed|coubs)/|c-cdn\\.coub\\.com/fb-player\\.swf\\?.*\\bcoub(?:ID|id)=))([\\da-z]+)");
    public static final Pattern l0 = Pattern.compile("^https?://(?:www\\.)?aparat\\.com/(?:v/|video/video/embed/videohash/)([a-zA-Z0-9]+)");
    public static final Pattern m0 = Pattern.compile("https?://clips\\.twitch\\.tv/(?:[^/]+/)*([^/?#&]+)");
    public static final Pattern n0 = Pattern.compile("https?://(?:(?:www\\.)?twitch\\.tv/|player\\.twitch\\.tv/\\?.*?\\bchannel=)([^/#?]+)");
    public static final Pattern o0 = Pattern.compile("fileList\\s*=\\s*JSON\\.parse\\('([^']+)'\\)");
    public static final Pattern p0 = Pattern.compile("clipInfo\\s*=\\s*(\\{[^']+\\});");
    public static final Pattern q0 = Pattern.compile("\"sts\"\\s*:\\s*(\\d+)");
    public static final Pattern r0 = Pattern.compile("\"assets\":.+?\"js\":\\s*(\"[^\"]+\")");
    public static final Pattern s0 = Pattern.compile("\\.sig\\|\\|([a-zA-Z0-9$]+)\\(");
    public static final Pattern t0 = Pattern.compile("[\"']signature[\"']\\s*,\\s*([a-zA-Z0-9$]+)\\(");
    public static final Pattern u0 = Pattern.compile("var\\s");
    public static final Pattern v0 = Pattern.compile("return(?:\\s+|$)");
    public static final Pattern w0 = Pattern.compile("[()]");
    public static final Pattern x0 = Pattern.compile(".*?-([a-zA-Z0-9_-]+)(?:/watch_as3|/html5player(?:-new)?|(?:/[a-z]{2}_[A-Z]{2})?/base)?\\.([a-z]+)$");
    public String B;
    public String C;
    public String D;
    public boolean E;
    public final boolean F;
    public boolean G;
    public boolean H;
    public long I;
    public boolean J;
    public float K;
    public int L;
    public boolean M;
    public final Paint N;
    public AsyncTask O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public final RadialProgressView U;
    public final ImageView V;
    public final ImageView W;
    public final j71 a;
    public final ImageView a0;
    public final x81 b;
    public AnimatorSet b0;
    public final eg0 c;
    public final a91 c0;
    public final TextureView d;
    public int d0;
    public final ImageView e;
    public int e0;
    public final ViewGroup f;
    public final w81 f0;
    public final jh.h g0;
    public Bitmap h;
    public final w81 h0;
    public TextureView n;
    public int r;
    public boolean s;
    public final b91 v;
    public boolean w;
    public String x;
    public String y;

    public e91(Context context, boolean z4, b91 b91Var) {
        super(context);
        this.F = true;
        Paint paint = new Paint();
        this.N = paint;
        this.f0 = new w81(this, 0);
        this.g0 = new jh.h(this, 4);
        this.h0 = new w81(this, 1);
        setWillNotDraw(false);
        this.v = b91Var;
        paint.setColor(-16777216);
        eg0 eg0Var = new eg0(this, context, 1);
        this.c = eg0Var;
        addView(eg0Var, k7.c6.e(-1, -1, 17));
        x81 x81Var = new x81(context, context);
        this.b = x81Var;
        final u81 u81Var = new u81(this);
        x81Var.addJavascriptInterface(new Object(u81Var) { // from class: org.telegram.ui.Components.WebPlayerView$JavaScriptInterface
            public final u81 a;

            {
                this.a = u81Var;
            }

            @JavascriptInterface
            public void returnResultToJava(String str) {
                e91 e91Var = (e91) this.a.a;
                AsyncTask asyncTask = e91Var.O;
                if (asyncTask == null || asyncTask.isCancelled()) {
                    return;
                }
                AsyncTask asyncTask2 = e91Var.O;
                if (asyncTask2 instanceof d91) {
                    d91 d91Var = (d91) asyncTask2;
                    String[] strArr = d91Var.c;
                    strArr[0] = strArr[0].replace(d91Var.d, "/signature/" + str);
                    d91Var.b.countDown();
                }
            }
        }, "JavaScriptInterface");
        WebSettings settings = x81Var.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup g10 = b91Var.g();
        this.f = g10;
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        if (g10 != null) {
            g10.addView(textureView);
        } else {
            eg0Var.addView(textureView, k7.c6.e(-1, -1, 17));
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
        j71 j71Var = new j71();
        this.a = j71Var;
        j71Var.G = this;
        j71Var.V(textureView);
        a91 a91Var = new a91(this, context);
        this.c0 = a91Var;
        if (g10 != null) {
            g10.addView(a91Var);
        } else {
            addView(a91Var, k7.c6.c(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.U = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, k7.c6.e(48, 48, 17));
        ImageView imageView2 = new ImageView(context);
        this.V = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        a91Var.addView(imageView2, k7.c6.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        final int i10 = 0;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.v81
            public final /* synthetic */ e91 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        e91 e91Var = this.b;
                        if (e91Var.w && !e91Var.P && !e91Var.T && e91Var.J) {
                            e91Var.Q = !e91Var.Q;
                            e91Var.l(true);
                            break;
                        }
                        break;
                    case 1:
                        e91 e91Var2 = this.b;
                        j71 j71Var2 = e91Var2.a;
                        if (e91Var2.w && e91Var2.x != null) {
                            if (j71Var2.d == null) {
                                e91Var2.i();
                            }
                            if (j71Var2.y()) {
                                j71Var2.B();
                            } else {
                                e91Var2.S = false;
                                j71Var2.C();
                            }
                            e91Var2.n();
                            break;
                        }
                        break;
                    default:
                        e91 e91Var3 = this.b;
                        ViewGroup viewGroup = e91Var3.f;
                        boolean z10 = e91Var3.F;
                        b91 b91Var2 = e91Var3.v;
                        a91 a91Var2 = e91Var3.c0;
                        eg0 eg0Var2 = e91Var3.c;
                        TextureView textureView2 = e91Var3.d;
                        if (textureView2 != null && b91Var2.h() && !e91Var3.P && !e91Var3.T && e91Var3.J) {
                            e91Var3.T = true;
                            if (!e91Var3.R) {
                                e91Var3.Q = false;
                                b91Var2.i(true, e91Var3.h0, eg0Var2.getAspectRatio(), z10);
                                break;
                            } else {
                                ViewGroup viewGroup2 = (ViewGroup) eg0Var2.getParent();
                                if (viewGroup2 != e91Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(eg0Var2);
                                    }
                                    e91Var3.addView(eg0Var2, 0, k7.c6.e(-1, -1, 17));
                                    eg0Var2.measure(View.MeasureSpec.makeMeasureSpec(e91Var3.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(e91Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), TLObject.FLAG_30));
                                }
                                Bitmap bitmap = e91Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    e91Var3.h = null;
                                }
                                e91Var3.P = true;
                                e91Var3.R = false;
                                e91Var3.n();
                                e91Var3.o();
                                e91Var3.k();
                                e91Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    eg0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) a91Var2.getParent();
                                if (viewGroup3 != e91Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(a91Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(a91Var2);
                                    } else {
                                        e91Var3.addView(a91Var2, 1);
                                    }
                                }
                                a91Var2.d(false, false);
                                b91Var2.i(false, null, eg0Var2.getAspectRatio(), z10);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.W = imageView3;
        imageView3.setScaleType(scaleType);
        a91Var.addView(imageView3, k7.c6.e(48, 48, 17));
        final int i11 = 1;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.v81
            public final /* synthetic */ e91 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        e91 e91Var = this.b;
                        if (e91Var.w && !e91Var.P && !e91Var.T && e91Var.J) {
                            e91Var.Q = !e91Var.Q;
                            e91Var.l(true);
                            break;
                        }
                        break;
                    case 1:
                        e91 e91Var2 = this.b;
                        j71 j71Var2 = e91Var2.a;
                        if (e91Var2.w && e91Var2.x != null) {
                            if (j71Var2.d == null) {
                                e91Var2.i();
                            }
                            if (j71Var2.y()) {
                                j71Var2.B();
                            } else {
                                e91Var2.S = false;
                                j71Var2.C();
                            }
                            e91Var2.n();
                            break;
                        }
                        break;
                    default:
                        e91 e91Var3 = this.b;
                        ViewGroup viewGroup = e91Var3.f;
                        boolean z10 = e91Var3.F;
                        b91 b91Var2 = e91Var3.v;
                        a91 a91Var2 = e91Var3.c0;
                        eg0 eg0Var2 = e91Var3.c;
                        TextureView textureView2 = e91Var3.d;
                        if (textureView2 != null && b91Var2.h() && !e91Var3.P && !e91Var3.T && e91Var3.J) {
                            e91Var3.T = true;
                            if (!e91Var3.R) {
                                e91Var3.Q = false;
                                b91Var2.i(true, e91Var3.h0, eg0Var2.getAspectRatio(), z10);
                                break;
                            } else {
                                ViewGroup viewGroup2 = (ViewGroup) eg0Var2.getParent();
                                if (viewGroup2 != e91Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(eg0Var2);
                                    }
                                    e91Var3.addView(eg0Var2, 0, k7.c6.e(-1, -1, 17));
                                    eg0Var2.measure(View.MeasureSpec.makeMeasureSpec(e91Var3.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(e91Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), TLObject.FLAG_30));
                                }
                                Bitmap bitmap = e91Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    e91Var3.h = null;
                                }
                                e91Var3.P = true;
                                e91Var3.R = false;
                                e91Var3.n();
                                e91Var3.o();
                                e91Var3.k();
                                e91Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    eg0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) a91Var2.getParent();
                                if (viewGroup3 != e91Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(a91Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(a91Var2);
                                    } else {
                                        e91Var3.addView(a91Var2, 1);
                                    }
                                }
                                a91Var2.d(false, false);
                                b91Var2.i(false, null, eg0Var2.getAspectRatio(), z10);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        if (z4) {
            ImageView imageView4 = new ImageView(context);
            this.a0 = imageView4;
            imageView4.setScaleType(scaleType);
            a91Var.addView(imageView4, k7.c6.e(56, 48, 53));
            final int i12 = 2;
            imageView4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.v81
                public final /* synthetic */ e91 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            e91 e91Var = this.b;
                            if (e91Var.w && !e91Var.P && !e91Var.T && e91Var.J) {
                                e91Var.Q = !e91Var.Q;
                                e91Var.l(true);
                                break;
                            }
                            break;
                        case 1:
                            e91 e91Var2 = this.b;
                            j71 j71Var2 = e91Var2.a;
                            if (e91Var2.w && e91Var2.x != null) {
                                if (j71Var2.d == null) {
                                    e91Var2.i();
                                }
                                if (j71Var2.y()) {
                                    j71Var2.B();
                                } else {
                                    e91Var2.S = false;
                                    j71Var2.C();
                                }
                                e91Var2.n();
                                break;
                            }
                            break;
                        default:
                            e91 e91Var3 = this.b;
                            ViewGroup viewGroup = e91Var3.f;
                            boolean z10 = e91Var3.F;
                            b91 b91Var2 = e91Var3.v;
                            a91 a91Var2 = e91Var3.c0;
                            eg0 eg0Var2 = e91Var3.c;
                            TextureView textureView2 = e91Var3.d;
                            if (textureView2 != null && b91Var2.h() && !e91Var3.P && !e91Var3.T && e91Var3.J) {
                                e91Var3.T = true;
                                if (!e91Var3.R) {
                                    e91Var3.Q = false;
                                    b91Var2.i(true, e91Var3.h0, eg0Var2.getAspectRatio(), z10);
                                    break;
                                } else {
                                    ViewGroup viewGroup2 = (ViewGroup) eg0Var2.getParent();
                                    if (viewGroup2 != e91Var3) {
                                        if (viewGroup2 != null) {
                                            viewGroup2.removeView(eg0Var2);
                                        }
                                        e91Var3.addView(eg0Var2, 0, k7.c6.e(-1, -1, 17));
                                        eg0Var2.measure(View.MeasureSpec.makeMeasureSpec(e91Var3.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(e91Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), TLObject.FLAG_30));
                                    }
                                    Bitmap bitmap = e91Var3.h;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        e91Var3.h = null;
                                    }
                                    e91Var3.P = true;
                                    e91Var3.R = false;
                                    e91Var3.n();
                                    e91Var3.o();
                                    e91Var3.k();
                                    e91Var3.m();
                                    textureView2.setVisibility(4);
                                    if (viewGroup != null) {
                                        viewGroup.addView(textureView2);
                                    } else {
                                        eg0Var2.addView(textureView2);
                                    }
                                    ViewGroup viewGroup3 = (ViewGroup) a91Var2.getParent();
                                    if (viewGroup3 != e91Var3) {
                                        if (viewGroup3 != null) {
                                            viewGroup3.removeView(a91Var2);
                                        }
                                        if (viewGroup != null) {
                                            viewGroup.addView(a91Var2);
                                        } else {
                                            e91Var3.addView(a91Var2, 1);
                                        }
                                    }
                                    a91Var2.d(false, false);
                                    b91Var2.i(false, null, eg0Var2.getAspectRatio(), z10);
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
                Matcher matcher = i0.matcher(str);
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        try {
            Matcher matcher2 = k0.matcher(str);
            return (matcher2.find() ? matcher2.group(1) : null) != null;
        } catch (Exception e10) {
            FileLog.e(e10);
            return false;
        }
        try {
            Matcher matcher3 = l0.matcher(str);
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        try {
            Matcher matcher4 = n0.matcher(str);
        } catch (Exception e12) {
            FileLog.e(e12);
        }
        try {
            Matcher matcher5 = j0.matcher(str);
        } catch (Exception e13) {
            FileLog.e(e13);
        }
        try {
            Matcher matcher6 = m0.matcher(str);
        } catch (Exception e14) {
            FileLog.e(e14);
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
    public static String c(AsyncTask asyncTask, String str, HashMap hashMap, boolean z4) {
        URLConnection uRLConnection;
        boolean z10;
        InputStream inputStream;
        StringBuilder sb;
        boolean z11;
        URL url;
        InputStream inputStream2;
        boolean z12 = true;
        try {
            url = new URL(str);
            uRLConnection = url.openConnection();
        } catch (Throwable th2) {
            th = th2;
            uRLConnection = null;
        }
        try {
            uRLConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
            if (z4) {
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
                    if (z4) {
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
            if (z4) {
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
            boolean z13 = !(th instanceof SocketTimeoutException) ? !(!(th instanceof UnknownHostException) && (!(th instanceof SocketException) ? (th instanceof FileNotFoundException) : !(th.getMessage() == null || !th.getMessage().contains("ECONNRESET")))) : ApplicationLoader.isNetworkOnline();
            FileLog.e(th);
            z10 = z13;
            inputStream = null;
            if (z10) {
            }
            if (z11) {
            }
        }
        if (z10) {
            sb = null;
            z11 = false;
        } else {
            try {
                if (uRLConnection instanceof HttpURLConnection) {
                    ((HttpURLConnection) uRLConnection).getResponseCode();
                }
            } catch (Exception e6) {
                FileLog.e(e6);
            }
            if (inputStream != null) {
                try {
                    byte[] bArr = new byte[32768];
                    sb = null;
                    while (true) {
                        try {
                            if (asyncTask.isCancelled()) {
                                break;
                            }
                            try {
                                int read = inputStream.read(bArr);
                                if (read > 0) {
                                    if (sb == null) {
                                        sb = new StringBuilder();
                                    }
                                    try {
                                        try {
                                            sb.append(new String(bArr, 0, read, "UTF-8"));
                                        } catch (Exception e10) {
                                            e = e10;
                                            FileLog.e(e);
                                            z12 = false;
                                            z11 = z12;
                                            if (inputStream != null) {
                                            }
                                            if (z11) {
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        FileLog.e(th);
                                        z11 = false;
                                        if (inputStream != null) {
                                        }
                                        if (z11) {
                                        }
                                    }
                                }
                            } catch (Exception e11) {
                                e = e11;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    }
                    z11 = z12;
                } catch (Throwable th6) {
                    th = th6;
                    sb = null;
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th7) {
                        FileLog.e(th7);
                    }
                }
            } else {
                sb = null;
            }
            z11 = false;
            if (inputStream != null) {
            }
        }
        if (z11) {
            return null;
        }
        return sb.toString();
    }

    public static String d(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                Matcher matcher = k0.matcher(str);
                String group = matcher.find() ? matcher.group(1) : null;
                if (group != null) {
                    return group;
                }
            } catch (Exception e6) {
                FileLog.e(e6);
                return null;
            }
        }
        return null;
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = i0.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    private View getControlView() {
        return this.c0;
    }

    private View getProgressView() {
        return this.U;
    }

    public final void b() {
        this.a.H();
        AsyncTask asyncTask = this.O;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.O = null;
        }
        this.b.stopLoading();
    }

    public final boolean f() {
        return this.R || this.T;
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
    public final boolean g(String str, TLRPC.Photo photo, Object obj, String str2, boolean z4) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        AsyncTask asyncTask;
        a91 a91Var;
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
        this.L = -1;
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
                                    this.L = (Utilities.parseInt((CharSequence) split[0]).intValue() * 60) + Utilities.parseInt((CharSequence) split[1]).intValue();
                                } else {
                                    this.L = Utilities.parseInt((CharSequence) queryParameter).intValue();
                                }
                            }
                        } catch (Exception e6) {
                            FileLog.e(e6);
                        }
                    }
                    Matcher matcher = i0.matcher(str);
                    group5 = matcher.find() ? matcher.group(1) : null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (group5 != null) {
                    str4 = group5;
                    if (str4 == null) {
                        try {
                            Matcher matcher2 = j0.matcher(str);
                            group = matcher2.find() ? matcher2.group(3) : null;
                        } catch (Exception e11) {
                            FileLog.e(e11);
                        }
                        if (group != null) {
                            str8 = group;
                            if (str8 == null) {
                                try {
                                    Matcher matcher3 = l0.matcher(str);
                                    group2 = matcher3.find() ? matcher3.group(1) : null;
                                } catch (Exception e12) {
                                    FileLog.e(e12);
                                }
                                if (group2 != null) {
                                    str7 = group2;
                                    if (str7 == null) {
                                        try {
                                            Matcher matcher4 = m0.matcher(str);
                                            group3 = matcher4.find() ? matcher4.group(1) : null;
                                        } catch (Exception e13) {
                                            FileLog.e(e13);
                                        }
                                        if (group3 != null) {
                                            str6 = group3;
                                            if (str6 == null) {
                                                try {
                                                    Matcher matcher5 = n0.matcher(str);
                                                    group4 = matcher5.find() ? matcher5.group(1) : null;
                                                } catch (Exception e14) {
                                                    FileLog.e(e14);
                                                }
                                                if (group4 != null) {
                                                    str5 = group4;
                                                    if (str5 == null) {
                                                        try {
                                                            Matcher matcher6 = k0.matcher(str);
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
                                                    this.S = false;
                                                    this.s = z4;
                                                    this.x = null;
                                                    this.B = null;
                                                    b();
                                                    this.J = false;
                                                    this.K = 1.0f;
                                                    asyncTask = this.O;
                                                    if (asyncTask != null) {
                                                        asyncTask.cancel(true);
                                                        this.O = null;
                                                    }
                                                    k();
                                                    o();
                                                    m();
                                                    n();
                                                    a91Var = this.c0;
                                                    if (photo != null) {
                                                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 80, true);
                                                        if (closestPhotoSizeWithSize != null) {
                                                            a91Var.a.setImage(null, null, ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "80_80_b", 0L, null, obj, 1);
                                                            this.M = true;
                                                        }
                                                    } else {
                                                        this.M = false;
                                                    }
                                                    animatorSet = this.b0;
                                                    if (animatorSet != null) {
                                                        animatorSet.cancel();
                                                        this.b0 = null;
                                                    }
                                                    a91Var.c(0);
                                                    if (str4 != null) {
                                                        this.D = str4;
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
                                                        a91Var.d(true, true);
                                                    } else {
                                                        if (str4 != null) {
                                                            d91 d91Var = new d91(this, str4);
                                                            d91Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                            this.O = d91Var;
                                                        } else if (str8 != null) {
                                                            y81 y81Var = new y81(this, str8, 4);
                                                            y81Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                            this.O = y81Var;
                                                        } else if (d != null) {
                                                            y81 y81Var2 = new y81(this, d, 1);
                                                            y81Var2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                            this.O = y81Var2;
                                                            this.E = true;
                                                        } else if (str7 != null) {
                                                            y81 y81Var3 = new y81(this, str7, 0);
                                                            y81Var3.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                            this.O = y81Var3;
                                                        } else if (str6 != null) {
                                                            y81 y81Var4 = new y81(this, str, 2);
                                                            y81Var4.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                            this.O = y81Var4;
                                                        } else if (str5 != null) {
                                                            y81 y81Var5 = new y81(this, str5, 3);
                                                            y81Var5.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                            this.O = y81Var5;
                                                            this.E = true;
                                                        }
                                                        a91Var.d(false, false);
                                                        j(true, false);
                                                    }
                                                    if (str4 != null && str8 == null && d == null && str7 == null && str3 == null && str6 == null && str5 == null) {
                                                        a91Var.setVisibility(8);
                                                        return false;
                                                    }
                                                    a91Var.setVisibility(0);
                                                    return true;
                                                }
                                            }
                                            str5 = null;
                                            if (str5 == null) {
                                            }
                                            str3 = null;
                                            this.w = false;
                                            this.S = false;
                                            this.s = z4;
                                            this.x = null;
                                            this.B = null;
                                            b();
                                            this.J = false;
                                            this.K = 1.0f;
                                            asyncTask = this.O;
                                            if (asyncTask != null) {
                                            }
                                            k();
                                            o();
                                            m();
                                            n();
                                            a91Var = this.c0;
                                            if (photo != null) {
                                            }
                                            animatorSet = this.b0;
                                            if (animatorSet != null) {
                                            }
                                            a91Var.c(0);
                                            if (str4 != null) {
                                            }
                                            if (str3 != null) {
                                            }
                                            if (str4 != null) {
                                            }
                                            a91Var.setVisibility(0);
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
                                    this.S = false;
                                    this.s = z4;
                                    this.x = null;
                                    this.B = null;
                                    b();
                                    this.J = false;
                                    this.K = 1.0f;
                                    asyncTask = this.O;
                                    if (asyncTask != null) {
                                    }
                                    k();
                                    o();
                                    m();
                                    n();
                                    a91Var = this.c0;
                                    if (photo != null) {
                                    }
                                    animatorSet = this.b0;
                                    if (animatorSet != null) {
                                    }
                                    a91Var.c(0);
                                    if (str4 != null) {
                                    }
                                    if (str3 != null) {
                                    }
                                    if (str4 != null) {
                                    }
                                    a91Var.setVisibility(0);
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
                            this.S = false;
                            this.s = z4;
                            this.x = null;
                            this.B = null;
                            b();
                            this.J = false;
                            this.K = 1.0f;
                            asyncTask = this.O;
                            if (asyncTask != null) {
                            }
                            k();
                            o();
                            m();
                            n();
                            a91Var = this.c0;
                            if (photo != null) {
                            }
                            animatorSet = this.b0;
                            if (animatorSet != null) {
                            }
                            a91Var.c(0);
                            if (str4 != null) {
                            }
                            if (str3 != null) {
                            }
                            if (str4 != null) {
                            }
                            a91Var.setVisibility(0);
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
                    this.S = false;
                    this.s = z4;
                    this.x = null;
                    this.B = null;
                    b();
                    this.J = false;
                    this.K = 1.0f;
                    asyncTask = this.O;
                    if (asyncTask != null) {
                    }
                    k();
                    o();
                    m();
                    n();
                    a91Var = this.c0;
                    if (photo != null) {
                    }
                    animatorSet = this.b0;
                    if (animatorSet != null) {
                    }
                    a91Var.c(0);
                    if (str4 != null) {
                    }
                    if (str3 != null) {
                    }
                    if (str4 != null) {
                    }
                    a91Var.setVisibility(0);
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
                this.S = false;
                this.s = z4;
                this.x = null;
                this.B = null;
                b();
                this.J = false;
                this.K = 1.0f;
                asyncTask = this.O;
                if (asyncTask != null) {
                }
                k();
                o();
                m();
                n();
                a91Var = this.c0;
                if (photo != null) {
                }
                animatorSet = this.b0;
                if (animatorSet != null) {
                }
                a91Var.c(0);
                if (str4 != null) {
                }
                if (str3 != null) {
                }
                if (str4 != null) {
                }
                a91Var.setVisibility(0);
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
        this.S = false;
        this.s = z4;
        this.x = null;
        this.B = null;
        b();
        this.J = false;
        this.K = 1.0f;
        asyncTask = this.O;
        if (asyncTask != null) {
        }
        k();
        o();
        m();
        n();
        a91Var = this.c0;
        if (photo != null) {
        }
        animatorSet = this.b0;
        if (animatorSet != null) {
        }
        a91Var.c(0);
        if (str4 != null) {
        }
        if (str3 != null) {
        }
        if (str4 != null) {
        }
        a91Var.setVisibility(0);
        return true;
    }

    public View getAspectRatioView() {
        return this.c;
    }

    public View getControlsView() {
        return this.c0;
    }

    public ImageView getTextureImageView() {
        return this.e;
    }

    public TextureView getTextureView() {
        return this.d;
    }

    public String getYoutubeId() {
        return this.D;
    }

    public final void h() {
        a91 a91Var = this.c0;
        if (a91Var.getParent() != this) {
            a91Var.setVisibility(8);
        }
        this.v.d();
    }

    public final void i() {
        String str = this.x;
        if (str == null) {
            return;
        }
        String str2 = this.B;
        j71 j71Var = this.a;
        if (str2 != null) {
            j71Var.G(Uri.parse(str), this.y, Uri.parse(this.B), this.C);
        } else {
            j71Var.D(Uri.parse(str), this.y);
        }
        j71Var.P(this.s);
        long p10 = j71Var.p();
        a91 a91Var = this.c0;
        if (p10 != -9223372036854775807L) {
            a91Var.b((int) (j71Var.p() / 1000));
        } else {
            a91Var.b(0);
        }
        k();
        o();
        m();
        a91Var.invalidate();
        if (this.L != -1) {
            j71Var.L(r0 * MediaDataController.MAX_STYLE_RUNS_COUNT, false);
        }
    }

    public final void j(boolean z4, boolean z10) {
        RadialProgressView radialProgressView = this.U;
        if (!z10) {
            radialProgressView.setAlpha(z4 ? 1.0f : 0.0f);
            return;
        }
        AnimatorSet animatorSet = this.b0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.b0 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, "alpha", z4 ? 1.0f : 0.0f));
        this.b0.setDuration(150L);
        this.b0.addListener(new pd0(this, 29));
        this.b0.start();
    }

    public final void k() {
        j3.f0 f0Var = this.a.d;
        ImageView imageView = this.V;
        if (f0Var == null || this.R) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        if (this.Q) {
            imageView.setImageResource(R.drawable.ic_outfullscreen);
            imageView.setLayoutParams(k7.c6.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 1.0f));
        } else {
            imageView.setImageResource(R.drawable.ic_gofullscreen);
            imageView.setLayoutParams(k7.c6.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        }
    }

    public final void l(boolean z4) {
        ViewGroup viewGroup;
        TextureView textureView = this.d;
        if (textureView == null) {
            return;
        }
        k();
        ViewGroup viewGroup2 = this.f;
        eg0 eg0Var = this.c;
        if (viewGroup2 != null) {
            if (this.Q) {
                ViewGroup viewGroup3 = (ViewGroup) eg0Var.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(eg0Var);
                }
            } else {
                ViewGroup viewGroup4 = (ViewGroup) eg0Var.getParent();
                if (viewGroup4 != this) {
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(eg0Var);
                    }
                    addView(eg0Var, 0);
                }
            }
            this.v.a(this.c0, this.Q, eg0Var.getAspectRatio(), eg0Var.getVideoRotation(), z4);
            return;
        }
        this.P = true;
        if (!this.Q) {
            if (viewGroup2 != null) {
                viewGroup2.addView(textureView);
            } else {
                eg0Var.addView(textureView);
            }
        }
        boolean z10 = this.Q;
        a91 a91Var = this.c0;
        if (z10) {
            ViewGroup viewGroup5 = (ViewGroup) a91Var.getParent();
            if (viewGroup5 != null) {
                viewGroup5.removeView(a91Var);
            }
        } else {
            ViewGroup viewGroup6 = (ViewGroup) a91Var.getParent();
            if (viewGroup6 != this) {
                if (viewGroup6 != null) {
                    viewGroup6.removeView(a91Var);
                }
                if (viewGroup2 != null) {
                    viewGroup2.addView(a91Var);
                } else {
                    addView(a91Var, 1);
                }
            }
        }
        TextureView a2 = this.v.a(this.c0, this.Q, eg0Var.getAspectRatio(), eg0Var.getVideoRotation(), z4);
        this.n = a2;
        a2.setVisibility(4);
        if (this.Q && this.n != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
            viewGroup.removeView(textureView);
        }
        int i10 = a91.F;
        a91Var.a();
    }

    public final void m() {
        ImageView imageView = this.a0;
        if (imageView == null) {
            return;
        }
        imageView.setImageResource(this.R ? R.drawable.ic_goinline : R.drawable.ic_outinline);
        imageView.setVisibility(this.a.d != null ? 0 : 8);
        if (this.R) {
            imageView.setLayoutParams(k7.c6.e(40, 40, 53));
        } else {
            imageView.setLayoutParams(k7.c6.e(56, 50, 53));
        }
    }

    public final void n() {
        a91 a91Var = this.c0;
        int i10 = a91.F;
        a91Var.a();
        AndroidUtilities.cancelRunOnUIThread(this.f0);
        if (!this.a.y()) {
            if (this.S) {
                this.W.setImageResource(this.R ? R.drawable.ic_againinline : R.drawable.ic_again);
                return;
            } else {
                this.W.setImageResource(this.R ? R.drawable.ic_playinline : R.drawable.ic_play);
                return;
            }
        }
        this.W.setImageResource(this.R ? R.drawable.ic_pauseinline : R.drawable.ic_pause);
        AndroidUtilities.runOnUIThread(this.f0, 500L);
        if (this.G) {
            return;
        }
        AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        this.G = true;
        audioManager.requestAudioFocus(this, 3, 1);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        AndroidUtilities.runOnUIThread(new im(this, i10, 11));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f), this.N);
    }

    @Override // org.telegram.ui.Components.g71
    public final void onError(j71 j71Var, Exception exc) {
        FileLog.e(exc);
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        eg0 eg0Var = this.c;
        int measuredWidth = (i14 - eg0Var.getMeasuredWidth()) / 2;
        int i15 = i13 - i11;
        int dp = ((i15 - AndroidUtilities.dp(10.0f)) - eg0Var.getMeasuredHeight()) / 2;
        eg0Var.layout(measuredWidth, dp, eg0Var.getMeasuredWidth() + measuredWidth, eg0Var.getMeasuredHeight() + dp);
        a91 a91Var = this.c0;
        if (a91Var.getParent() == this) {
            a91Var.layout(0, 0, a91Var.getMeasuredWidth(), a91Var.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.U;
        int measuredWidth2 = (i14 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i15 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        a91Var.a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f));
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.c.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2 - AndroidUtilities.dp(10.0f), TLObject.FLAG_30));
        a91 a91Var = this.c0;
        if (a91Var.getParent() == this) {
            a91Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        this.U.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), TLObject.FLAG_30));
        setMeasuredDimension(size, size2);
    }

    @Override // org.telegram.ui.Components.g71
    public final /* synthetic */ void onRenderedFirstFrame(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.g71
    public final void onStateChanged(boolean z4, int i10) {
        a91 a91Var = this.c0;
        j71 j71Var = this.a;
        if (i10 != 2) {
            if (j71Var.p() != -9223372036854775807L) {
                a91Var.b((int) (j71Var.p() / 1000));
            } else {
                a91Var.b(0);
            }
        }
        b91 b91Var = this.v;
        if (i10 == 4 || i10 == 1 || !j71Var.y()) {
            b91Var.e(this, false);
        } else {
            b91Var.e(this, true);
        }
        if (j71Var.y() && i10 != 4) {
            n();
            return;
        }
        if (i10 == 4) {
            this.S = true;
            j71Var.B();
            j71Var.L(0L, false);
            n();
            a91Var.d(true, true);
        }
    }

    @Override // org.telegram.ui.Components.g71
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        if (this.P) {
            this.P = false;
            if (this.Q || this.R) {
                if (this.R) {
                    this.r = 1;
                }
                this.n.setSurfaceTexture(surfaceTexture);
                this.n.setSurfaceTextureListener(this.g0);
                this.n.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.g71
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
            this.T = false;
            int i10 = this.d0;
            int i11 = this.e0;
            this.c.getVideoRotation();
            this.v.f(this.c0, false, i10, i11, this.F);
            this.r = 0;
        }
    }

    @Override // org.telegram.ui.Components.g71
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        eg0 eg0Var = this.c;
        if (eg0Var != null) {
            if (i12 == 90 || i12 == 270) {
                i11 = i10;
                i10 = i11;
            }
            float f11 = i10 * f10;
            this.d0 = (int) f11;
            this.e0 = i11;
            float f12 = i11 == 0 ? 1.0f : f11 / i11;
            eg0Var.a(f12, i12);
            if (this.Q) {
                this.v.c(f12, i12);
            }
        }
    }

    @Override // org.telegram.ui.Components.g71
    public final void onRenderedFirstFrame() {
        this.J = true;
        this.I = System.currentTimeMillis();
        this.c0.invalidate();
    }

    public final void o() {
    }

    @Override // org.telegram.ui.Components.g71
    public final /* synthetic */ void onSeekFinished(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.g71
    public final /* synthetic */ void onSeekStarted(k3.a aVar) {
    }
}
