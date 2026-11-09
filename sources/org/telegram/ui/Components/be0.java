package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public abstract class be0 extends FrameLayout {
    public TLRPC.WebPage D;
    public float E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public float J;
    public boolean K;
    public pb0 L;
    public int a;
    public PhotoViewer b;
    public LinearLayout c;
    public TextView d;
    public TextView e;
    public st f;
    public bi.ec h;
    public RadialProgressView n;
    public View r;
    public String s;
    public ArrayList w;
    public String x;
    public boolean y;

    public static void a(org.telegram.ui.eq0 eq0Var, String str) {
        int videoDuration = eq0Var.getVideoDuration() / 1000;
        ArrayList arrayList = eq0Var.w;
        arrayList.clear();
        if (videoDuration <= 15) {
            return;
        }
        String[] split = str.split("\\|");
        String s5 = a8.p0.s(new StringBuilder(), split[0].split("\\$")[0], "2/");
        String str2 = split[0].split("\\$N")[1];
        String str3 = split.length == 3 ? split[2].split("M#")[1] : split.length == 2 ? split[1].split("t#")[1] : split[3].split("M#")[1];
        int ceil = (int) (videoDuration <= 100 ? Math.ceil(videoDuration / 25.0f) : videoDuration <= 250 ? Math.ceil((videoDuration / 2.0f) / 25.0f) : videoDuration <= 500 ? Math.ceil((videoDuration / 4.0f) / 25.0f) : videoDuration <= 1000 ? Math.ceil((videoDuration / 5.0f) / 25.0f) : Math.ceil((videoDuration / 10.0f) / 25.0f));
        for (int i7 = 0; i7 < ceil; i7++) {
            Locale locale = Locale.ROOT;
            arrayList.add(s5 + "M" + i7 + str2 + "&sigh=" + str3);
        }
    }

    public final void b(boolean z9) {
        pb0 pb0Var = this.L;
        if (!z9 && this.G) {
            org.telegram.messenger.g0.i3(pb0Var, 500L);
        } else {
            if (!z9 || this.G) {
                return;
            }
            org.telegram.messenger.g0.r(pb0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String c(int i7) {
        float f10;
        int i10;
        ArrayList arrayList = this.w;
        int videoDuration = getVideoDuration() / 1000;
        if (videoDuration > 100) {
            if (videoDuration <= 250) {
                i10 = ((int) (i7 / 2.0f)) / 25;
            } else if (videoDuration <= 500) {
                i10 = ((int) (i7 / 4.0f)) / 25;
            } else if (videoDuration <= 1000) {
                i10 = ((int) (i7 / 5.0f)) / 25;
            } else {
                f10 = i7 / 10.0f;
            }
            if (i10 >= arrayList.size()) {
                return (String) arrayList.get(i10);
            }
            return null;
        }
        f10 = i7;
        i10 = (int) (f10 / 25.0f);
        if (i10 >= arrayList.size()) {
        }
    }

    public final boolean d() {
        return this.y;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.K) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean e() {
        if (this.n.getVisibility() != 0) {
            ti.o c10 = l2.i.d().c();
            if (c10 != null) {
                c10.b();
                org.telegram.messenger.g0.i3(new xd0(this, 0), 300L);
                return true;
            }
            this.h.setVisibility(0);
            PhotoViewer photoViewer = this.b;
            if (photoViewer.D != null && photoViewer.f0 != null) {
                photoViewer.T0();
                photoViewer.O8.g(photoViewer.D, null, true);
                return true;
            }
        }
        return false;
    }

    public final void f() {
        if (this.G && this.y) {
            h("pauseVideo();");
            this.G = false;
            b(true);
        }
    }

    public final void g() {
        if (this.G || !this.y) {
            return;
        }
        h("playVideo();");
        this.G = true;
        b(false);
    }

    public float getBufferedPosition() {
        return this.J;
    }

    public int getCurrentPosition() {
        return this.I;
    }

    public int getEmbedHeight() {
        TLRPC.WebPage webPage = this.D;
        if (webPage != null) {
            return webPage.embed_height;
        }
        return 0;
    }

    public int getEmbedWidth() {
        TLRPC.WebPage webPage = this.D;
        if (webPage != null) {
            return webPage.embed_width;
        }
        return 0;
    }

    public int getVideoDuration() {
        return this.H;
    }

    public WebView getWebView() {
        return this.f;
    }

    public final void h(String str) {
        this.f.evaluateJavascript(str, null);
    }

    public final void i(long j3) {
        boolean z9 = this.G;
        this.I = (int) j3;
        if (z9) {
            f();
        }
        if (z9) {
            org.telegram.messenger.g0.i3(new bi.r3(this, j3, 23), 100L);
            return;
        }
        h("seekTo(" + Math.round(j3 / 1000.0f) + ", true);");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        st stVar = this.f;
        if (stVar.getParent() == this) {
            TLRPC.WebPage webPage = this.D;
            int i11 = webPage.embed_width;
            if (i11 == 0) {
                i11 = 100;
            }
            int i12 = webPage.embed_height;
            int i13 = i12 != 0 ? i12 : 100;
            int size = View.MeasureSpec.getSize(i7);
            int size2 = View.MeasureSpec.getSize(i10);
            float f10 = i11;
            float f11 = i13;
            float min = Math.min(size / f10, size2 / f11);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) stVar.getLayoutParams();
            int i14 = (int) (f10 * min);
            layoutParams.width = i14;
            int i15 = (int) (f11 * min);
            layoutParams.height = i15;
            layoutParams.topMargin = (size2 - i15) / 2;
            layoutParams.leftMargin = (size - i14) / 2;
        }
        super.onMeasure(i7, i10);
    }

    public void setPlaybackSpeed(float f10) {
        this.E = f10;
        if (this.n.getVisibility() == 0) {
            this.F = true;
        } else if (this.y) {
            h("setPlaybackSpeed(" + f10 + ");");
        }
    }

    public void setTouchDisabled(boolean z9) {
        this.K = z9;
    }
}
