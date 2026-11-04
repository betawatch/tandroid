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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class ud0 extends FrameLayout {
    public TLRPC.WebPage E;
    public float F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public float K;
    public boolean L;
    public jb0 M;
    public int a;
    public PhotoViewer b;
    public LinearLayout c;
    public TextView d;
    public TextView e;
    public pt f;
    public ai.x2 h;
    public RadialProgressView n;
    public View r;
    public String s;
    public ArrayList w;
    public String x;
    public boolean y;

    public static void a(org.telegram.ui.tp0 tp0Var, String str) {
        int videoDuration = tp0Var.getVideoDuration() / 1000;
        ArrayList arrayList = tp0Var.w;
        arrayList.clear();
        if (videoDuration <= 15) {
            return;
        }
        String[] split = str.split("\\|");
        String s6 = a1.g.s(new StringBuilder(), split[0].split("\\$")[0], "2/");
        String str2 = split[0].split("\\$N")[1];
        String str3 = split.length == 3 ? split[2].split("M#")[1] : split.length == 2 ? split[1].split("t#")[1] : split[3].split("M#")[1];
        int ceil = (int) (videoDuration <= 100 ? Math.ceil(videoDuration / 25.0f) : videoDuration <= 250 ? Math.ceil((videoDuration / 2.0f) / 25.0f) : videoDuration <= 500 ? Math.ceil((videoDuration / 4.0f) / 25.0f) : videoDuration <= 1000 ? Math.ceil((videoDuration / 5.0f) / 25.0f) : Math.ceil((videoDuration / 10.0f) / 25.0f));
        for (int i3 = 0; i3 < ceil; i3++) {
            Locale locale = Locale.ROOT;
            arrayList.add(s6 + "M" + i3 + str2 + "&sigh=" + str3);
        }
    }

    public final void b(boolean z10) {
        jb0 jb0Var = this.M;
        if (!z10 && this.H) {
            org.telegram.messenger.g0.i3(jb0Var, 500L);
        } else {
            if (!z10 || this.H) {
                return;
            }
            org.telegram.messenger.g0.r(jb0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String c(int i3) {
        float f10;
        int i10;
        ArrayList arrayList = this.w;
        int videoDuration = getVideoDuration() / 1000;
        if (videoDuration > 100) {
            if (videoDuration <= 250) {
                i10 = ((int) (i3 / 2.0f)) / 25;
            } else if (videoDuration <= 500) {
                i10 = ((int) (i3 / 4.0f)) / 25;
            } else if (videoDuration <= 1000) {
                i10 = ((int) (i3 / 5.0f)) / 25;
            } else {
                f10 = i3 / 10.0f;
            }
            if (i10 >= arrayList.size()) {
                return (String) arrayList.get(i10);
            }
            return null;
        }
        f10 = i3;
        i10 = (int) (f10 / 25.0f);
        if (i10 >= arrayList.size()) {
        }
    }

    public final boolean d() {
        return this.y;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.L) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean e() {
        boolean z10 = this.y && "inapp".equals(org.telegram.messenger.hp.s1(this.a).B3);
        if (!z10 && !Settings.canDrawOverlays(getContext())) {
            t4.A((Activity) getContext(), null, false);
            return false;
        }
        if (this.n.getVisibility() == 0) {
            return false;
        }
        if (ie0.q0.Q) {
            ie0.b(false);
            org.telegram.messenger.g0.i3(new qd0(this, 0), 300L);
            return true;
        }
        this.h.setVisibility(0);
        Activity activity = (Activity) getContext();
        pt ptVar = this.f;
        TLRPC.WebPage webPage = this.E;
        if (ie0.x(z10, activity, this, ptVar, webPage.embed_width, webPage.embed_height, false)) {
            ie0.w(PhotoViewer.v1());
        }
        return true;
    }

    public final void f() {
        if (this.H && this.y) {
            h("pauseVideo();");
            this.H = false;
            b(true);
        }
    }

    public final void g() {
        if (this.H || !this.y) {
            return;
        }
        h("playVideo();");
        this.H = true;
        b(false);
    }

    public float getBufferedPosition() {
        return this.K;
    }

    public int getCurrentPosition() {
        return this.J;
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

    public final void i(long j10) {
        boolean z10 = this.H;
        this.J = (int) j10;
        if (z10) {
            f();
        }
        if (z10) {
            org.telegram.messenger.g0.i3(new ci.e3(this, j10, 23), 100L);
            return;
        }
        h("seekTo(" + Math.round(j10 / 1000.0f) + ", true);");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        pt ptVar = this.f;
        if (ptVar.getParent() == this) {
            TLRPC.WebPage webPage = this.E;
            int i11 = webPage.embed_width;
            if (i11 == 0) {
                i11 = 100;
            }
            int i12 = webPage.embed_height;
            int i13 = i12 != 0 ? i12 : 100;
            int size = View.MeasureSpec.getSize(i3);
            int size2 = View.MeasureSpec.getSize(i10);
            float f10 = i11;
            float f11 = i13;
            float min = Math.min(size / f10, size2 / f11);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ptVar.getLayoutParams();
            int i14 = (int) (f10 * min);
            layoutParams.width = i14;
            int i15 = (int) (f11 * min);
            layoutParams.height = i15;
            layoutParams.topMargin = (size2 - i15) / 2;
            layoutParams.leftMargin = (size - i14) / 2;
        }
        super.onMeasure(i3, i10);
    }

    public void setPlaybackSpeed(float f10) {
        this.F = f10;
        if (this.n.getVisibility() == 0) {
            this.G = true;
        } else if (this.y) {
            h("setPlaybackSpeed(" + f10 + ");");
        }
    }

    public void setTouchDisabled(boolean z10) {
        this.L = z10;
    }
}
