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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class wf0 extends FrameLayout {
    public float B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public float G;
    public boolean H;
    public dc0 I;
    public int a;
    public PhotoViewer b;
    public LinearLayout c;
    public TextView d;
    public TextView e;
    public iu f;
    public eg.h0 h;
    public RadialProgressView n;
    public View r;
    public String s;
    public ArrayList v;
    public String w;
    public boolean x;
    public TLRPC.WebPage y;

    public static void a(org.telegram.ui.ut0 ut0Var, String str) {
        int videoDuration = ut0Var.getVideoDuration() / MediaDataController.MAX_STYLE_RUNS_COUNT;
        ArrayList arrayList = ut0Var.v;
        arrayList.clear();
        if (videoDuration <= 15) {
            return;
        }
        String[] split = str.split("\\|");
        String r10 = android.support.v4.media.a.r(new StringBuilder(), split[0].split("\\$")[0], "2/");
        String str2 = split[0].split("\\$N")[1];
        String str3 = split.length == 3 ? split[2].split("M#")[1] : split.length == 2 ? split[1].split("t#")[1] : split[3].split("M#")[1];
        int ceil = (int) (videoDuration <= 100 ? Math.ceil(videoDuration / 25.0f) : videoDuration <= 250 ? Math.ceil((videoDuration / 2.0f) / 25.0f) : videoDuration <= 500 ? Math.ceil((videoDuration / 4.0f) / 25.0f) : videoDuration <= 1000 ? Math.ceil((videoDuration / 5.0f) / 25.0f) : Math.ceil((videoDuration / 10.0f) / 25.0f));
        for (int i10 = 0; i10 < ceil; i10++) {
            Locale locale = Locale.ROOT;
            arrayList.add(r10 + "M" + i10 + str2 + "&sigh=" + str3);
        }
    }

    public final void b(boolean z4) {
        dc0 dc0Var = this.I;
        if (!z4 && this.D) {
            AndroidUtilities.runOnUIThread(dc0Var, 500L);
        } else {
            if (!z4 || this.D) {
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(dc0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String c(int i10) {
        float f10;
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
                f10 = i10 / 10.0f;
            }
            if (i11 >= arrayList.size()) {
                return (String) arrayList.get(i11);
            }
            return null;
        }
        f10 = i10;
        i11 = (int) (f10 / 25.0f);
        if (i11 >= arrayList.size()) {
        }
    }

    public final boolean d() {
        return this.x;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.H) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean e() {
        boolean z4 = this.x && "inapp".equals(MessagesController.getInstance(this.a).youtubePipType);
        if (!z4 && Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(getContext())) {
            z4.B((Activity) getContext(), null, false);
            return false;
        }
        if (this.n.getVisibility() == 0) {
            return false;
        }
        if (mg0.m0.M) {
            mg0.j(false);
            AndroidUtilities.runOnUIThread(new rf0(this, 0), 300L);
            return true;
        }
        this.h.setVisibility(0);
        Activity activity = (Activity) getContext();
        iu iuVar = this.f;
        TLRPC.WebPage webPage = this.y;
        if (mg0.x(z4, activity, this, iuVar, webPage.embed_width, webPage.embed_height, false)) {
            mg0.w(PhotoViewer.t1());
        }
        return true;
    }

    public final void f() {
        if (this.D && this.x) {
            h("pauseVideo();");
            this.D = false;
            b(true);
        }
    }

    public final void g() {
        if (this.D || !this.x) {
            return;
        }
        h("playVideo();");
        this.D = true;
        b(false);
    }

    public float getBufferedPosition() {
        return this.G;
    }

    public int getCurrentPosition() {
        return this.F;
    }

    public int getVideoDuration() {
        return this.E;
    }

    public WebView getWebView() {
        return this.f;
    }

    public final void h(String str) {
        this.f.evaluateJavascript(str, null);
    }

    public final void i(long j10) {
        boolean z4 = this.D;
        this.F = (int) j10;
        if (z4) {
            f();
        }
        if (z4) {
            AndroidUtilities.runOnUIThread(new gg.y1(this, j10, 17), 100L);
            return;
        }
        h("seekTo(" + Math.round(j10 / 1000.0f) + ", true);");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        iu iuVar = this.f;
        if (iuVar.getParent() == this) {
            TLRPC.WebPage webPage = this.y;
            int i12 = webPage.embed_width;
            if (i12 == 0) {
                i12 = 100;
            }
            int i13 = webPage.embed_height;
            int i14 = i13 != 0 ? i13 : 100;
            int size = View.MeasureSpec.getSize(i10);
            int size2 = View.MeasureSpec.getSize(i11);
            float f10 = i12;
            float f11 = i14;
            float min = Math.min(size / f10, size2 / f11);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) iuVar.getLayoutParams();
            int i15 = (int) (f10 * min);
            layoutParams.width = i15;
            int i16 = (int) (f11 * min);
            layoutParams.height = i16;
            layoutParams.topMargin = (size2 - i16) / 2;
            layoutParams.leftMargin = (size - i15) / 2;
        }
        super.onMeasure(i10, i11);
    }

    public void setPlaybackSpeed(float f10) {
        this.B = f10;
        if (this.n.getVisibility() == 0) {
            this.C = true;
        } else if (this.x) {
            h("setPlaybackSpeed(" + f10 + ");");
        }
    }

    public void setTouchDisabled(boolean z4) {
        this.H = z4;
    }
}
