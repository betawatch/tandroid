package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Build;
import android.provider.Settings;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class ze0 extends FrameLayout {
    public float A;
    public boolean B;
    public boolean C;
    public int D;
    public int E;
    public float F;
    public boolean G;
    public ib0 H;
    public int a;
    public PhotoViewer b;
    public LinearLayout c;
    public TextView d;
    public TextView e;
    public au f;
    public fh.l2 h;
    public RadialProgressView n;
    public View r;
    public String s;
    public ArrayList v;
    public String w;
    public boolean x;
    public TLRPC.WebPage y;

    public static void a(org.telegram.ui.gt0 gt0Var, String str) {
        int videoDuration = gt0Var.getVideoDuration() / MediaDataController.MAX_STYLE_RUNS_COUNT;
        ArrayList arrayList = gt0Var.v;
        arrayList.clear();
        if (videoDuration <= 15) {
            return;
        }
        String[] split = str.split("\\|");
        String r10 = aa.d.r(new StringBuilder(), split[0].split("\\$")[0], "2/");
        String str2 = split[0].split("\\$N")[1];
        String str3 = split.length == 3 ? split[2].split("M#")[1] : split.length == 2 ? split[1].split("t#")[1] : split[3].split("M#")[1];
        int ceil = (int) (videoDuration <= 100 ? Math.ceil(videoDuration / 25.0f) : videoDuration <= 250 ? Math.ceil((videoDuration / 2.0f) / 25.0f) : videoDuration <= 500 ? Math.ceil((videoDuration / 4.0f) / 25.0f) : videoDuration <= 1000 ? Math.ceil((videoDuration / 5.0f) / 25.0f) : Math.ceil((videoDuration / 10.0f) / 25.0f));
        for (int i9 = 0; i9 < ceil; i9++) {
            Locale locale = Locale.ROOT;
            arrayList.add(r10 + "M" + i9 + str2 + "&sigh=" + str3);
        }
    }

    public final void b(boolean z10) {
        ib0 ib0Var = this.H;
        if (!z10 && this.C) {
            AndroidUtilities.runOnUIThread(ib0Var, 500L);
        } else {
            if (!z10 || this.C) {
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(ib0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String c(int i9) {
        float f10;
        int i10;
        ArrayList arrayList = this.v;
        int videoDuration = getVideoDuration() / MediaDataController.MAX_STYLE_RUNS_COUNT;
        if (videoDuration > 100) {
            if (videoDuration <= 250) {
                i10 = ((int) (i9 / 2.0f)) / 25;
            } else if (videoDuration <= 500) {
                i10 = ((int) (i9 / 4.0f)) / 25;
            } else if (videoDuration <= 1000) {
                i10 = ((int) (i9 / 5.0f)) / 25;
            } else {
                f10 = i9 / 10.0f;
            }
            if (i10 >= arrayList.size()) {
                return (String) arrayList.get(i10);
            }
            return null;
        }
        f10 = i9;
        i10 = (int) (f10 / 25.0f);
        if (i10 >= arrayList.size()) {
        }
    }

    public final boolean d() {
        return this.x;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.G) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean e() {
        boolean z10 = this.x && "inapp".equals(MessagesController.getInstance(this.a).youtubePipType);
        if (!z10 && Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(getContext())) {
            y4.B((Activity) getContext(), null, false);
            return false;
        }
        if (this.n.getVisibility() == 0) {
            return false;
        }
        if (pf0.l0.L) {
            pf0.j(false);
            AndroidUtilities.runOnUIThread(new te0(this, 0), 300L);
            return true;
        }
        this.h.setVisibility(0);
        Activity activity = (Activity) getContext();
        au auVar = this.f;
        TLRPC.WebPage webPage = this.y;
        if (pf0.x(z10, activity, this, auVar, webPage.embed_width, webPage.embed_height, false)) {
            pf0.w(PhotoViewer.t1());
        }
        return true;
    }

    public final void f() {
        if (this.C && this.x) {
            h("pauseVideo();");
            this.C = false;
            b(true);
        }
    }

    public final void g() {
        if (this.C || !this.x) {
            return;
        }
        h("playVideo();");
        this.C = true;
        b(false);
    }

    public float getBufferedPosition() {
        return this.F;
    }

    public int getCurrentPosition() {
        return this.E;
    }

    public int getVideoDuration() {
        return this.D;
    }

    public WebView getWebView() {
        return this.f;
    }

    public final void h(String str) {
        this.f.evaluateJavascript(str, null);
    }

    public final void i(long j10) {
        boolean z10 = this.C;
        this.E = (int) j10;
        if (z10) {
            f();
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new bg.i2(this, j10, 23), 100L);
            return;
        }
        h("seekTo(" + Math.round(j10 / 1000.0f) + ", true);");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        au auVar = this.f;
        if (auVar.getParent() == this) {
            TLRPC.WebPage webPage = this.y;
            int i11 = webPage.embed_width;
            if (i11 == 0) {
                i11 = 100;
            }
            int i12 = webPage.embed_height;
            int i13 = i12 != 0 ? i12 : 100;
            int size = View.MeasureSpec.getSize(i9);
            int size2 = View.MeasureSpec.getSize(i10);
            float f10 = i11;
            float f11 = i13;
            float min = Math.min(size / f10, size2 / f11);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) auVar.getLayoutParams();
            int i14 = (int) (f10 * min);
            layoutParams.width = i14;
            int i15 = (int) (f11 * min);
            layoutParams.height = i15;
            layoutParams.topMargin = (size2 - i15) / 2;
            layoutParams.leftMargin = (size - i14) / 2;
        }
        super.onMeasure(i9, i10);
    }

    public void setPlaybackSpeed(float f10) {
        this.A = f10;
        if (this.n.getVisibility() == 0) {
            this.B = true;
        } else if (this.x) {
            h("setPlaybackSpeed(" + f10 + ");");
        }
    }

    public void setTouchDisabled(boolean z10) {
        this.G = z10;
    }
}
