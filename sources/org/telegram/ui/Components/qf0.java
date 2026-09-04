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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public abstract class qf0 extends FrameLayout {
    public float E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public float J;
    public boolean K;
    public cc0 L;
    public int a;
    public PhotoViewer b;
    public LinearLayout c;
    public TextView d;
    public TextView e;
    public nu f;
    public di.eb h;
    public RadialProgressView n;
    public View r;
    public String s;
    public ArrayList v;
    public String w;
    public boolean x;
    public TLRPC.WebPage y;

    public static void a(org.telegram.ui.hu0 hu0Var, String str) {
        int videoDuration = hu0Var.getVideoDuration() / MediaDataController.MAX_STYLE_RUNS_COUNT;
        ArrayList arrayList = hu0Var.v;
        arrayList.clear();
        if (videoDuration <= 15) {
            return;
        }
        String[] split = str.split("\\|");
        String s10 = a4.a.s(new StringBuilder(), split[0].split("\\$")[0], "2/");
        String str2 = split[0].split("\\$N")[1];
        String str3 = split.length == 3 ? split[2].split("M#")[1] : split.length == 2 ? split[1].split("t#")[1] : split[3].split("M#")[1];
        int ceil = (int) (videoDuration <= 100 ? Math.ceil(videoDuration / 25.0f) : videoDuration <= 250 ? Math.ceil((videoDuration / 2.0f) / 25.0f) : videoDuration <= 500 ? Math.ceil((videoDuration / 4.0f) / 25.0f) : videoDuration <= 1000 ? Math.ceil((videoDuration / 5.0f) / 25.0f) : Math.ceil((videoDuration / 10.0f) / 25.0f));
        for (int i10 = 0; i10 < ceil; i10++) {
            Locale locale = Locale.ROOT;
            arrayList.add(s10 + "M" + i10 + str2 + "&sigh=" + str3);
        }
    }

    public final void b(boolean z10) {
        cc0 cc0Var = this.L;
        if (!z10 && this.G) {
            AndroidUtilities.runOnUIThread(cc0Var, 500L);
        } else {
            if (!z10 || this.G) {
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(cc0Var);
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
        ArrayList arrayList = this.v;
        int videoDuration = getVideoDuration() / MediaDataController.MAX_STYLE_RUNS_COUNT;
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
        return this.x;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.K) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean e() {
        boolean z10 = this.x && "inapp".equals(MessagesController.getInstance(this.a).youtubePipType);
        if (!z10 && Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(getContext())) {
            e5.B((Activity) getContext(), null, false);
            return false;
        }
        if (this.n.getVisibility() == 0) {
            return false;
        }
        if (eg0.p0.P) {
            eg0.j(false);
            AndroidUtilities.runOnUIThread(new mf0(this, 0), 300L);
            return true;
        }
        this.h.setVisibility(0);
        Activity activity = (Activity) getContext();
        nu nuVar = this.f;
        TLRPC.WebPage webPage = this.y;
        if (eg0.x(z10, activity, this, nuVar, webPage.embed_width, webPage.embed_height, false)) {
            eg0.w(PhotoViewer.t1());
        }
        return true;
    }

    public final void f() {
        if (this.G && this.x) {
            h("pauseVideo();");
            this.G = false;
            b(true);
        }
    }

    public final void g() {
        if (this.G || !this.x) {
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

    public final void i(long j3) {
        boolean z10 = this.G;
        this.I = (int) j3;
        if (z10) {
            f();
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new bi.g(this, j3, 21), 100L);
            return;
        }
        h("seekTo(" + Math.round(j3 / 1000.0f) + ", true);");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        nu nuVar = this.f;
        if (nuVar.getParent() == this) {
            TLRPC.WebPage webPage = this.y;
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
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) nuVar.getLayoutParams();
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
        } else if (this.x) {
            h("setPlaybackSpeed(" + f7 + ");");
        }
    }

    public void setTouchDisabled(boolean z10) {
        this.K = z10;
    }
}
