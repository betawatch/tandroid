package org.telegram.ui.Components;

import android.app.Activity;
import android.provider.Settings;
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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class ve0 extends FrameLayout {
    public TLRPC.WebPage D;
    public float E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public float J;
    public boolean K;
    public eb0 L;
    public int a;
    public PhotoViewer b;
    public LinearLayout c;
    public TextView d;
    public TextView e;
    public cu f;
    public bi.t0 h;
    public RadialProgressView n;
    public View r;
    public String s;
    public ArrayList w;
    public String x;
    public boolean y;

    public static void a(org.telegram.ui.mr0 mr0Var, String str) {
        int videoDuration = mr0Var.getVideoDuration() / 1000;
        ArrayList arrayList = mr0Var.w;
        arrayList.clear();
        if (videoDuration <= 15) {
            return;
        }
        String[] split = str.split("\\|");
        String r10 = a1.g.r(new StringBuilder(), split[0].split("\\$")[0], "2/");
        String str2 = split[0].split("\\$N")[1];
        String str3 = split.length == 3 ? split[2].split("M#")[1] : split.length == 2 ? split[1].split("t#")[1] : split[3].split("M#")[1];
        int ceil = (int) (videoDuration <= 100 ? Math.ceil(videoDuration / 25.0f) : videoDuration <= 250 ? Math.ceil((videoDuration / 2.0f) / 25.0f) : videoDuration <= 500 ? Math.ceil((videoDuration / 4.0f) / 25.0f) : videoDuration <= 1000 ? Math.ceil((videoDuration / 5.0f) / 25.0f) : Math.ceil((videoDuration / 10.0f) / 25.0f));
        for (int i10 = 0; i10 < ceil; i10++) {
            Locale locale = Locale.ROOT;
            arrayList.add(r10 + "M" + i10 + str2 + "&sigh=" + str3);
        }
    }

    public final void b(boolean z10) {
        eb0 eb0Var = this.L;
        if (!z10 && this.G) {
            org.telegram.messenger.i0.h3(eb0Var, 500L);
        } else {
            if (!z10 || this.G) {
                return;
            }
            org.telegram.messenger.i0.r(eb0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String c(int i10) {
        float f7;
        int i11;
        ArrayList arrayList = this.w;
        int videoDuration = getVideoDuration() / 1000;
        if (videoDuration > 100) {
            if (videoDuration <= 250) {
                i11 = ((int) (i10 / 2.0f)) / 25;
            } else if (videoDuration <= 500) {
                i11 = ((int) (i10 / 4.0f)) / 25;
            } else if (videoDuration <= 1000) {
                i11 = ((int) (i10 / 5.0f)) / 25;
            } else {
                f7 = i10 / 10.0f;
            }
            if (i11 >= arrayList.size()) {
                return (String) arrayList.get(i11);
            }
            return null;
        }
        f7 = i10;
        i11 = (int) (f7 / 25.0f);
        if (i11 >= arrayList.size()) {
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
        boolean z10 = this.y && "inapp".equals(org.telegram.messenger.vp.r1(this.a).A3);
        if (!z10 && !Settings.canDrawOverlays(getContext())) {
            s4.A((Activity) getContext(), null, false);
            return false;
        }
        if (this.n.getVisibility() == 0) {
            return false;
        }
        if (jf0.p0.P) {
            jf0.b(false);
            org.telegram.messenger.i0.h3(new re0(this, 0), 300L);
            return true;
        }
        this.h.setVisibility(0);
        Activity activity = (Activity) getContext();
        cu cuVar = this.f;
        TLRPC.WebPage webPage = this.D;
        if (jf0.x(z10, activity, this, cuVar, webPage.embed_width, webPage.embed_height, false)) {
            jf0.w(PhotoViewer.v1());
        }
        return true;
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

    public int getVideoDuration() {
        return this.H;
    }

    public WebView getWebView() {
        return this.f;
    }

    public final void h(String str) {
        this.f.evaluateJavascript(str, null);
    }

    public final void i(long j10) {
        boolean z10 = this.G;
        this.I = (int) j10;
        if (z10) {
            f();
        }
        if (z10) {
            org.telegram.messenger.i0.h3(new bi.e(this, j10, 12), 100L);
            return;
        }
        h("seekTo(" + Math.round(j10 / 1000.0f) + ", true);");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        cu cuVar = this.f;
        if (cuVar.getParent() == this) {
            TLRPC.WebPage webPage = this.D;
            int i12 = webPage.embed_width;
            if (i12 == 0) {
                i12 = 100;
            }
            int i13 = webPage.embed_height;
            int i14 = i13 != 0 ? i13 : 100;
            int size = View.MeasureSpec.getSize(i10);
            int size2 = View.MeasureSpec.getSize(i11);
            float f7 = i12;
            float f10 = i14;
            float min = Math.min(size / f7, size2 / f10);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) cuVar.getLayoutParams();
            int i15 = (int) (f7 * min);
            layoutParams.width = i15;
            int i16 = (int) (f10 * min);
            layoutParams.height = i16;
            layoutParams.topMargin = (size2 - i16) / 2;
            layoutParams.leftMargin = (size - i15) / 2;
        }
        super.onMeasure(i10, i11);
    }

    public void setPlaybackSpeed(float f7) {
        this.E = f7;
        if (this.n.getVisibility() == 0) {
            this.F = true;
        } else if (this.y) {
            h("setPlaybackSpeed(" + f7 + ");");
        }
    }

    public void setTouchDisabled(boolean z10) {
        this.K = z10;
    }
}
