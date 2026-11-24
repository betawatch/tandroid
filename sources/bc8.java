// default package

import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class bc8 extends FrameLayout {
    public TLRPC.WebPage E;
    public float F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public float K;
    public boolean L;
    public q78 M;
    public int a;
    public PhotoViewer b;
    public LinearLayout c;
    public TextView d;
    public TextView e;
    public vv3 f;
    public sb h;
    public RadialProgressView n;
    public a8 r;
    public String s;
    public ArrayList w;
    public String x;
    public boolean y;

    public final void a(boolean z) {
        q78 q78Var = this.M;
        boolean z2 = this.H;
        if (z) {
            if (z2) {
                return;
            }
            gm.r(q78Var);
        } else if (z2) {
            gm.d3(q78Var, 500L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String b(int i) {
        float f;
        int i2;
        ArrayList arrayList = this.w;
        int videoDuration = getVideoDuration() / 1000;
        if (videoDuration > 100) {
            if (videoDuration <= 250) {
                i2 = ((int) (i / 2.0f)) / 25;
            } else if (videoDuration <= 500) {
                i2 = ((int) (i / 4.0f)) / 25;
            } else if (videoDuration <= 1000) {
                i2 = ((int) (i / 5.0f)) / 25;
            } else {
                f = i / 10.0f;
            }
            if (i2 >= arrayList.size()) {
                return (String) arrayList.get(i2);
            }
            return null;
        }
        f = i;
        i2 = (int) (f / 25.0f);
        if (i2 >= arrayList.size()) {
        }
    }

    public final boolean c() {
        return this.y && "inapp".equals(oc7.r1(this.a).l4.I0.f);
    }

    public final boolean d() {
        if (this.n.getVisibility() != 0) {
            ad8 a = yc3.c().a();
            if (a != null) {
                a.b();
                gm.d3(new xb8(this, (byte) 0), 300L);
                return true;
            }
            this.h.setVisibility(0);
            PhotoViewer photoViewer = this.b;
            if (photoViewer.E != null && photoViewer.g0 != null) {
                photoViewer.W();
                photoViewer.U8.h(photoViewer.E, null, true);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.L) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        if (this.H && this.y) {
            h("pauseVideo();");
            this.H = false;
            a(true);
        }
    }

    public final void f() {
        if (this.H || !this.y) {
            return;
        }
        h("playVideo();");
        this.H = true;
        a(false);
    }

    public final void g(String str) {
        int videoDuration = getVideoDuration() / 1000;
        ArrayList arrayList = this.w;
        arrayList.clear();
        if (videoDuration > 15) {
            String[] split = str.split("\\|");
            String j = b10.j(new StringBuilder(), split[0].split("\\$")[0], "2/");
            String str2 = split[0].split("\\$N")[1];
            String str3 = split.length == 3 ? split[2].split("M#")[1] : split.length == 2 ? split[1].split("t#")[1] : split[3].split("M#")[1];
            int ceil = (int) (videoDuration <= 100 ? Math.ceil(videoDuration / 25.0f) : videoDuration <= 250 ? Math.ceil((videoDuration / 2.0f) / 25.0f) : videoDuration <= 500 ? Math.ceil((videoDuration / 4.0f) / 25.0f) : videoDuration <= 1000 ? Math.ceil((videoDuration / 5.0f) / 25.0f) : Math.ceil((videoDuration / 10.0f) / 25.0f));
            for (int i = 0; i < ceil; i++) {
                Locale locale = Locale.ROOT;
                arrayList.add(j + "M" + i + str2 + "&sigh=" + str3);
            }
        }
    }

    public float getBufferedPosition() {
        return this.K;
    }

    public int getCurrentPosition() {
        return this.J;
    }

    public int getEmbedHeight() {
        TLRPC.WebPage webPage = this.E;
        if (webPage != null) {
            return webPage.embed_height;
        }
        return 0;
    }

    public int getEmbedWidth() {
        TLRPC.WebPage webPage = this.E;
        if (webPage != null) {
            return webPage.embed_width;
        }
        return 0;
    }

    public int getVideoDuration() {
        return this.I;
    }

    public WebView getWebView() {
        return this.f;
    }

    public final void h(String str) {
        this.f.evaluateJavascript(str, null);
    }

    public final void i(long j) {
        boolean z = this.H;
        this.J = (int) j;
        if (z) {
            e();
            gm.d3(new fu((Object) this, j, (byte) 25), 100L);
        } else {
            h("seekTo(" + Math.round(j / 1000.0f) + ", true);");
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        vv3 vv3Var = this.f;
        if (vv3Var.getParent() == this) {
            TLRPC.WebPage webPage = this.E;
            int i3 = webPage.embed_width;
            if (i3 == 0) {
                i3 = 100;
            }
            int i4 = webPage.embed_height;
            int i5 = i4 != 0 ? i4 : 100;
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            float f = i3;
            float f2 = i5;
            float min = Math.min(size / f, size2 / f2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) vv3Var.getLayoutParams();
            int i6 = (int) (f * min);
            layoutParams.width = i6;
            int i7 = (int) (f2 * min);
            layoutParams.height = i7;
            layoutParams.topMargin = (size2 - i7) / 2;
            layoutParams.leftMargin = (size - i6) / 2;
        }
        super.onMeasure(i, i2);
    }

    public void setPlaybackSpeed(float f) {
        this.F = f;
        if (this.n.getVisibility() == 0) {
            this.G = true;
        } else if (this.y) {
            h("setPlaybackSpeed(" + f + ");");
        }
    }

    public void setTouchDisabled(boolean z) {
        this.L = z;
    }
}
