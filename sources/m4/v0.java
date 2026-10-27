package m4;

import a8.ee;
import a8.je;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.b3;
import bi.e6;
import bi.k4;
import bi.md;
import bi.t8;
import hi.p4;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.ActionBar.x6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.bq0;
import org.telegram.ui.Components.cs;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.ef;
import org.telegram.ui.Components.f2;
import org.telegram.ui.Components.f4;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.g4;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.j2;
import org.telegram.ui.Components.jf;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.my;
import org.telegram.ui.Components.n10;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.nw0;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.y3;
import org.telegram.ui.Components.zq;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.d3;
import org.telegram.ui.iq;
import org.telegram.ui.lr;
import org.telegram.ui.mr;
import org.telegram.ui.n8;
import org.telegram.ui.pp;
import org.telegram.ui.q00;
import org.telegram.ui.q6;
import org.telegram.ui.rq;
import org.telegram.ui.s6;
import org.telegram.ui.ta;
import org.telegram.ui.v6;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class v0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ v0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
        this.e = obj4;
    }

    private final void a() {
        go goVar = (go) this.c;
        Context context = (Context) this.d;
        View view = (View) this.b;
        u6 u6Var = (u6) this.e;
        long j10 = goVar.V;
        final org.telegram.ui.Components.p1 p1Var = new org.telegram.ui.Components.p1(16, goVar, view);
        k5 k5Var = new k5(8);
        int i10 = y6.j5;
        int e = u6Var != null ? u6Var.e(i10) : y6.x0(null, i10, false);
        int i11 = y6.h5;
        int e10 = u6Var != null ? u6Var.e(i11) : y6.x0(null, i11, false);
        int i12 = y6.Ji;
        if (u6Var != null) {
            u6Var.e(i12);
        } else {
            y6.x0(null, i12, false);
        }
        int i13 = y6.Ni;
        if (u6Var != null) {
            u6Var.e(i13);
        } else {
            y6.x0(null, i13, false);
        }
        int i14 = y6.E8;
        if (u6Var != null) {
            u6Var.e(i14);
        } else {
            y6.x0(null, i14, false);
        }
        int i15 = y6.G8;
        if (u6Var != null) {
            u6Var.e(i15);
        } else {
            y6.x0(null, i15, false);
        }
        int i16 = y6.i6;
        if (u6Var != null) {
            u6Var.e(i16);
        } else {
            y6.x0(null, i16, false);
        }
        int i17 = y6.Sh;
        int e11 = u6Var != null ? u6Var.e(i17) : y6.x0(null, i17, false);
        int i18 = y6.Oh;
        int e12 = u6Var != null ? u6Var.e(i18) : y6.x0(null, i18, false);
        if (u6Var != null) {
            u6Var.e(y6.Qh);
        } else {
            y6.x0(null, y6.Qh, false);
        }
        Pattern pattern = g5.a;
        if (context == null) {
            return;
        }
        final int i19 = (int) MessagesController.getInstance(UserConfig.selectedAccount).config.pollClosePeriodMax.get(TimeUnit.SECONDS);
        final e3 e3Var = new e3(context, u6Var);
        e3Var.a();
        int i20 = e11;
        final nd0 nd0Var = new nd0(context, u6Var);
        nd0Var.setTextColor(e);
        nd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        nd0Var.setItemCount(5);
        int i21 = e12;
        final f4 f4Var = new f4(context, u6Var);
        f4Var.setWrapSelectorWheel(true);
        f4Var.setAllItemsCount(24);
        f4Var.setItemCount(5);
        f4Var.setTextColor(e);
        f4Var.setTextOffset(-AndroidUtilities.dp(10.0f));
        final g4 g4Var = new g4(context, u6Var);
        g4Var.setWrapSelectorWheel(true);
        g4Var.setAllItemsCount(60);
        g4Var.setItemCount(5);
        g4Var.setTextColor(e);
        g4Var.setTextOffset(-AndroidUtilities.dp(34.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        y3 y3Var = new y3(context, nd0Var, f4Var, g4Var, 2);
        y3Var.setOrientation(1);
        frameLayout.addView(y3Var, kb1.g(-1.0f, -1));
        frameLayout.addView(new FrameLayout(context), kb1.h(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        y3Var.addView(frameLayout2, kb1.x(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.StopPollDeadlineHeader));
        textView.setTextColor(e);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView, kb1.h(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ei.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        y3Var.addView(linearLayout, kb1.t(-1, -2, 1.0f, 0, 0, 23, 0, 23));
        final TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 12.0f);
        f7.V(textView2, y6.q5, u6Var);
        textView2.setGravity(17);
        final Calendar calendar = Calendar.getInstance();
        md mdVar = new md(context, 16);
        mdVar.setText(LocaleController.getString(R.string.StopPollDeadlineButton));
        kb1.c(mdVar, 0.02f, 1.2f);
        linearLayout.addView(nd0Var, kb1.p(0.5f, 0, 270));
        nd0Var.setMinValue(0);
        nd0Var.setMaxValue(365);
        nd0Var.setWrapSelectorWheel(false);
        nd0Var.setFormatter(new f2(2));
        e6 e6Var = new e6(i19, nd0Var, f4Var, g4Var, textView2);
        nd0Var.setOnValueChangedListener(e6Var);
        f4Var.setMinValue(0);
        f4Var.setMaxValue(23);
        linearLayout.addView(f4Var, kb1.p(0.2f, 0, 270));
        f4Var.setFormatter(new f2(3));
        f4Var.setOnValueChangedListener(e6Var);
        g4Var.setMinValue(0);
        g4Var.setMaxValue(59);
        g4Var.setValue(0);
        g4Var.setFormatter(new f2(4));
        linearLayout.addView(g4Var, kb1.p(0.3f, 0, 270));
        g4Var.setOnValueChangedListener(e6Var);
        if (j10 > 0 && j10 != 2147483646) {
            long j11 = 1000 * j10;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j11 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j11);
            if (timeInMillis >= 0) {
                g4Var.setValue(calendar.get(12));
                f4Var.setValue(calendar.get(11));
                nd0Var.setValue(timeInMillis);
            }
        }
        final boolean[] zArr = {true};
        g5.g(null, null, 0L, i19, 3, nd0Var, f4Var, g4Var);
        g5.e(textView2, nd0Var, f4Var, g4Var);
        mdVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        mdVar.setGravity(17);
        mdVar.setTextColor(i20);
        mdVar.setTextSize(1, 14.0f);
        mdVar.setTypeface(AndroidUtilities.bold());
        mdVar.setBackground(o6.e(new float[]{24.0f}, i21));
        y3Var.addView(mdVar, kb1.x(-1, 48, 83, 14, 15, 14, 16));
        mdVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.i2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Runnable runnable;
                zArr[0] = false;
                long j12 = i19;
                nd0 nd0Var2 = nd0Var;
                f4 f4Var2 = f4Var;
                g4 g4Var2 = g4Var;
                boolean g7 = g5.g(null, null, 0L, j12, 3, nd0Var2, f4Var2, g4Var2);
                g5.e(textView2, nd0Var2, f4Var2, g4Var2);
                long currentTimeMillis = System.currentTimeMillis();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(currentTimeMillis);
                calendar2.add(6, nd0Var2.getValue());
                calendar2.set(11, f4Var2.getValue());
                calendar2.set(12, g4Var2.getValue());
                if (g7) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                p1Var.G((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                runnable = e3Var.a.dismissRunnable;
                runnable.run();
            }
        });
        y3Var.addView(textView2, kb1.x(-1, -2, 83, 14, 0, 14, 16));
        e3Var.b(frameLayout);
        k3 k3Var = e3Var.a;
        k3Var.show();
        k3Var.setOnDismissListener(new j2(0, k5Var, zArr));
        k3Var.setBackgroundColor(e10);
        k3Var.fixNavigationBar(e10);
    }

    private final void b() {
        lz lzVar = (lz) this.c;
        TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) this.d;
        TLObject tLObject = (TLObject) this.b;
        Runnable runnable = (Runnable) this.e;
        ArrayList arrayList = lzVar.s;
        nz nzVar = lzVar.w;
        if (nzVar.M != lzVar.b) {
            return;
        }
        nzVar.L = 0;
        if (tL_messages_getStickers.emoticon.equals(lzVar.a)) {
            if (!(tLObject instanceof TLRPC.TL_messages_stickers)) {
                runnable.run();
                return;
            }
            TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject;
            int size = arrayList.size();
            int size2 = tL_messages_stickers.stickers.size();
            for (int i10 = 0; i10 < size2; i10++) {
                TLRPC.Document document = tL_messages_stickers.stickers.get(i10);
                if (lzVar.v.indexOfKey(document.id) < 0) {
                    arrayList.add(document);
                }
            }
            if (size != arrayList.size()) {
                lzVar.f.put(arrayList, nzVar.N);
                if (size == 0) {
                    lzVar.h.add(arrayList);
                }
            }
        }
        runnable.run();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0a9a  */
    /* JADX WARN: Removed duplicated region for block: B:340:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        TLRPC.WallPaperSettings wallPaperSettings;
        TLRPC.User user;
        Throwable th2;
        TLRPC.TL_webPage tL_webPage;
        boolean z15;
        int i10;
        ArrayList arrayList;
        lr lrVar;
        long peerId;
        int i11;
        mr mrVar;
        String[] strArr;
        String lowerCase;
        String publicUsername;
        String str;
        String str2;
        String str3;
        boolean z16;
        o1.j jVar;
        nw0 nw0Var;
        o1.j jVar2;
        float f7;
        Runnable runnable;
        int i12 = -1;
        int i13 = 4;
        int i14 = 0;
        switch (this.a) {
            case 0:
                j1 j1Var = (j1) this.c;
                w wVar = (w) this.d;
                f0 f0Var = (f0) this.b;
                m mVar = (m) this.e;
                com.google.firebase.messaging.q qVar = j1Var.b;
                try {
                    j1Var.c.remove(wVar);
                    if (!f0Var.j()) {
                        e1 e1Var = (e1) wVar.d;
                        e1Var.getClass();
                        IBinder asBinder = e1Var.a.asBinder();
                        u m10 = f0Var.m(wVar);
                        if (qVar.u(wVar)) {
                            e2.a.l("MediaSessionStub", "Controller " + wVar + " has sent connection request multiple times");
                        }
                        qVar.b(asBinder, wVar, m10.a, m10.b);
                        com.google.android.gms.common.api.internal.u p10 = qVar.p(wVar);
                        if (p10 == null) {
                            e2.a.l("MediaSessionStub", "Ignoring connection request from unknown controller info");
                        } else {
                            n1 n1Var = f0Var.t;
                            l1 l1Var = f0Var.s;
                            b2.c1 c1Var = m10.b;
                            l1 Y0 = j1Var.Y0(l1Var);
                            MediaSession.Token token = ((n4.n) f0Var.h.m.b).c.b;
                            f9.i0 i0Var = m10.c;
                            if (i0Var == null) {
                                i0Var = f0Var.y;
                            }
                            f9.i0 i0Var2 = m10.d;
                            if (i0Var2 == null) {
                                i0Var2 = f0Var.z;
                            }
                            f9.i0 i0Var3 = f0Var.r;
                            q1 q1Var = m10.a;
                            b2.c1 s10 = n1Var.s();
                            v1 v1Var = f0Var.j.a;
                            v1Var.getClass();
                            k kVar = new k(j1Var, i0Var, i0Var2, i0Var3, q1Var, c1Var, s10, new Bundle(v1Var.g), f0Var.A, Y0, token);
                            if (!f0Var.j()) {
                                try {
                                    ((l) mVar).F0(p10.e(), kVar.a(wVar.c));
                                    z11 = true;
                                } catch (RemoteException unused) {
                                    z11 = false;
                                }
                                if (z11) {
                                    try {
                                        if (!f0Var.x || !f0.k(wVar)) {
                                            f0Var.e.getClass();
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        z10 = z11;
                                        if (!z10) {
                                            je.a(mVar);
                                        }
                                        throw th;
                                    }
                                }
                                if (z11) {
                                    return;
                                }
                            }
                        }
                    }
                    je.a(mVar);
                    return;
                } catch (Throwable th4) {
                    th = th4;
                    z10 = false;
                }
                break;
            case 1:
                f0 f0Var2 = (f0) this.b;
                k9.e0 e0Var = (k9.e0) this.c;
                e2.j jVar3 = (e2.j) this.d;
                k9.y yVar = (k9.y) this.e;
                if (f0Var2.j()) {
                    e0Var.m(null);
                    return;
                }
                try {
                    jVar3.accept(yVar);
                    e0Var.m(null);
                    return;
                } catch (Throwable th5) {
                    e0Var.n(th5);
                    return;
                }
            case 2:
                f0 f0Var3 = (f0) this.b;
                g1 g1Var = (g1) this.c;
                w wVar2 = (w) this.d;
                List list = (List) this.e;
                if (f0Var3.j()) {
                    return;
                }
                g1Var.b(f0Var3.t, wVar2, list);
                return;
            case 3:
                CameraController.lambda$openRound$9((CameraSession) this.c, (Runnable) this.d, (SurfaceTexture) this.b, (Runnable) this.e);
                return;
            case 4:
                CameraController.lambda$close$5((Runnable) this.c, (CameraSession) this.d, (CountDownLatch) this.b, (Runnable) this.e);
                return;
            case 5:
                ((VideoAds) this.c).lambda$show$14((Context) this.d, (TLRPC.TL_sponsoredMessage) this.b, (l80) this.e);
                return;
            case 6:
                ((p4) this.c).run(y6.S0((File) this.d, (String) this.b, (String[]) this.e));
                return;
            case 7:
                TLObject tLObject = (TLObject) this.c;
                w6 w6Var = (w6) this.d;
                x6 x6Var = (x6) this.b;
                TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) this.e;
                y6.A--;
                if (tLObject instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme2 = (TLRPC.TL_theme) tLObject;
                    TLRPC.ThemeSettings themeSettings = tL_theme2.settings.size() > 0 ? tL_theme2.settings.get(0) : null;
                    if (w6Var == null || themeSettings == null) {
                        TLRPC.Document document = tL_theme2.document;
                        if (document != null && document.id != tL_theme.document.id) {
                            if (w6Var != null) {
                                w6Var.r = tL_theme2;
                                z13 = true;
                            } else {
                                x6Var.F = tL_theme2;
                                x6Var.G = false;
                                x6Var.g0 = null;
                                x6Var.h0 = null;
                                NotificationCenter.getInstance(x6Var.E).addObserver(x6Var, NotificationCenter.fileLoaded);
                                NotificationCenter.getInstance(x6Var.E).addObserver(x6Var, NotificationCenter.fileLoadFailed);
                                FileLoader fileLoader = FileLoader.getInstance(x6Var.E);
                                TLRPC.TL_theme tL_theme3 = x6Var.F;
                                z13 = true;
                                fileLoader.loadFile(tL_theme3.document, tL_theme3, 1, 1);
                            }
                            z12 = z13;
                        }
                    } else {
                        if (x6.a(w6Var, themeSettings)) {
                            z14 = false;
                        } else {
                            File d = w6Var.d();
                            if (d != null) {
                                d.delete();
                            }
                            x6.i(w6Var, themeSettings);
                            x6 x6Var2 = y6.I;
                            if (x6Var2 == x6Var && x6Var2.Y == w6Var.a) {
                                y6.q1(false, false);
                                y6.J(ApplicationLoader.applicationContext, false);
                                x6 x6Var3 = y6.I;
                                y6.H1(x6Var3, y6.J == x6Var3, -1, null);
                            }
                            t6.a(true);
                            z14 = true;
                        }
                        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                        w6Var.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                        z12 = z14;
                    }
                    if (y6.A != 0) {
                        y6.B = (int) (System.currentTimeMillis() / 1000);
                        y6.v1(z12, false);
                        return;
                    }
                    return;
                }
                z12 = false;
                if (y6.A != 0) {
                }
                break;
            case 8:
                org.telegram.ui.t6 t6Var = (org.telegram.ui.t6) this.c;
                v6 v6Var = (v6) this.d;
                float[] fArr = (float[]) this.b;
                boolean[] zArr = (boolean[]) this.e;
                t6Var.getClass();
                v6Var.a(fArr[0]);
                if (zArr[0]) {
                    t6Var.d.w0(true);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.t6 t6Var2 = (org.telegram.ui.t6) this.c;
                boolean[] zArr2 = (boolean[]) this.d;
                long[] jArr = (long[]) this.b;
                s6 s6Var = (s6) this.e;
                if (zArr2[0]) {
                    return;
                }
                jArr[0] = System.currentTimeMillis();
                t6Var2.d.showDialog(s6Var);
                return;
            case 10:
                n8.V((n8) this.c, (TLRPC.TL_error) this.d, (TLObject) this.b, (Calendar) this.e);
                return;
            case 11:
                ta.V((ta) this.c, (e2) this.d, (TLRPC.TL_error) this.b, (TL_account.updateUsername) this.e);
                return;
            case 12:
                wn wnVar = (wn) this.c;
                r2 r2Var = (r2) this.d;
                MessageObject messageObject = (MessageObject) this.b;
                j5 j5Var = (j5) this.e;
                if (r2Var instanceof NotificationCenter.NotificationCenterDelegate) {
                    wnVar.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) r2Var, NotificationCenter.closeChats);
                }
                wnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", messageObject.messageOwner.action.channel_id);
                ((ActionBarLayout) j5Var).c(j5Var.getFragmentStack().size() - 1, new wn(bundle));
                r2Var.finishFragment();
                return;
            case 13:
                wn wnVar2 = (wn) this.c;
                qf.c cVar = (qf.c) this.d;
                TLObject tLObject2 = (TLObject) this.b;
                b3 b3Var = (b3) this.e;
                cVar.b();
                if (tLObject2 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                    wnVar2.getMessagesController().putUsers(tL_contacts_resolvedPeer.users, false);
                    wnVar2.getMessagesController().putChats(tL_contacts_resolvedPeer.chats, false);
                    long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
                    if (peerDialogId >= 0) {
                        user = wnVar2.getMessagesController().getUser(Long.valueOf(peerDialogId));
                        b3Var.run(user);
                        return;
                    }
                }
                user = null;
                b3Var.run(user);
                return;
            case 14:
                long[] jArr2 = (long[]) this.c;
                boolean[] zArr3 = (boolean[]) this.d;
                ImageView imageView = (ImageView) this.b;
                ImageView imageView2 = (ImageView) this.e;
                jArr2[0] = SystemClock.elapsedRealtime();
                if (!zArr3[0]) {
                    imageView = imageView2;
                }
                cs csVar = (cs) imageView.getDrawable();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new org.telegram.ui.b3(csVar, 4));
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(ds.f);
                ofFloat.start();
                return;
            case 15:
                wn wnVar3 = (wn) this.c;
                MessageObject messageObject2 = (MessageObject) this.d;
                e2 e2Var = (e2) this.b;
                boolean[] zArr4 = (boolean[]) this.e;
                try {
                    tL_webPage = oa0.f(messageObject2);
                    th2 = null;
                } catch (Throwable th6) {
                    FileLog.e(th6);
                    th2 = th6;
                    tL_webPage = null;
                }
                AndroidUtilities.runOnUIThread(new k4(wnVar3, e2Var, zArr4, th2 == null && tL_webPage != null, messageObject2, tL_webPage));
                return;
            case 16:
                wn wnVar4 = (wn) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                MessagesStorage messagesStorage = (MessagesStorage) this.e;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                if (tL_error == null && !messages_messages.messages.isEmpty()) {
                    int i15 = messages_messages.messages.get(0).id;
                    MessageObject messageObject3 = (MessageObject) wnVar4.E6[0].get(i15);
                    messagesStorage.markMessageAsMention(wnVar4.j6, i15);
                    if (messageObject3 != null) {
                        TLRPC.Message message = messageObject3.messageOwner;
                        message.media_unread = true;
                        message.mentioned = true;
                    }
                    wnVar4.j(i15, 0, false, 0, true, 0);
                    return;
                }
                if (messages_messages != null) {
                    wnVar4.B6 = messages_messages.count;
                    z15 = false;
                } else {
                    z15 = false;
                    wnVar4.B6 = 0;
                }
                messagesStorage.resetMentionsCount(wnVar4.j6, wnVar4.b(), wnVar4.B6);
                int i16 = wnVar4.B6;
                if (i16 == 0) {
                    wnVar4.C6 = true;
                    wnVar4.ac(z15);
                    return;
                } else {
                    wnVar4.v1.c(2, i16, true);
                    wnVar4.U9();
                    return;
                }
            case 17:
                wn.B0((wn) this.c, (TLRPC.TL_messageMediaWebPage) this.d, (TLRPC.TL_webPageAttributeStory) this.b, (q6) this.e);
                return;
            case 18:
                pp.X((pp) this.c, (e2[]) this.d, (TLRPC.Chat) this.b, (r2) this.e);
                return;
            case 19:
                iq iqVar = (iq) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject4 = (TLObject) this.b;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.e;
                iqVar.getClass();
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject4;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.n0(password);
                    iqVar.q0(twoStepVerificationActivity.m0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 20:
                mr mrVar2 = (mr) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                TLRPC.User user2 = (TLRPC.User) this.b;
                rq rqVar = (rq) this.e;
                if (!(tLObject5 instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject5 instanceof TLRPC.TL_chatParticipantAdmin)) {
                    rqVar.run(1);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mrVar2.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString("AppName", R.string.AppName);
                alertDialog$Builder.a.T = LocaleController.formatString(R.string.AdminWillBeRemoved, UserObject.getUserName(user2));
                alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new org.telegram.ui.y0(rqVar, 25));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                mrVar2.showDialog(alertDialog$Builder.a);
                return;
            case 21:
                lr lrVar2 = (lr) this.c;
                String str4 = (String) this.d;
                ArrayList arrayList2 = (ArrayList) this.b;
                ArrayList arrayList3 = (ArrayList) this.e;
                mr mrVar3 = lrVar2.y;
                String lowerCase2 = str4.trim().toLowerCase();
                if (lowerCase2.length() == 0) {
                    AndroidUtilities.runOnUIThread(new bi.u0(lrVar2, new ArrayList(), new a0.h(), new ArrayList(), new ArrayList(), 29));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase2);
                if (lowerCase2.equals(translitString) || translitString.length() == 0) {
                    translitString = null;
                }
                int i17 = (translitString != null ? 1 : 0) + 1;
                String[] strArr2 = new String[i17];
                strArr2[0] = lowerCase2;
                if (translitString != null) {
                    strArr2[1] = translitString;
                }
                ArrayList arrayList4 = new ArrayList();
                a0.h hVar = new a0.h();
                ArrayList arrayList5 = new ArrayList();
                mr mrVar4 = mrVar3;
                ArrayList arrayList6 = new ArrayList();
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    int i18 = 0;
                    while (i18 < size) {
                        TLObject tLObject6 = (TLObject) arrayList2.get(i18);
                        int i19 = i18;
                        if (tLObject6 instanceof TLRPC.ChatParticipant) {
                            arrayList = arrayList2;
                            lrVar = lrVar2;
                            peerId = ((TLRPC.ChatParticipant) tLObject6).user_id;
                        } else {
                            arrayList = arrayList2;
                            lrVar = lrVar2;
                            if (tLObject6 instanceof TLRPC.ChannelParticipant) {
                                peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject6).peer);
                            }
                            strArr = strArr2;
                            mrVar = mrVar4;
                            i11 = size;
                            i18 = i19 + 1;
                            arrayList2 = arrayList;
                            lrVar2 = lrVar;
                            strArr2 = strArr;
                            mrVar4 = mrVar;
                            size = i11;
                        }
                        if (peerId > 0) {
                            TLRPC.User user3 = mrVar4.getMessagesController().getUser(Long.valueOf(peerId));
                            if (user3.id != mrVar4.getUserConfig().getClientUserId()) {
                                String lowerCase3 = UserObject.getUserName(user3).toLowerCase();
                                publicUsername = UserObject.getPublicUsername(user3);
                                String str5 = user3.first_name;
                                String[] strArr3 = strArr2;
                                str2 = user3.last_name;
                                str = str5;
                                lowerCase = lowerCase3;
                                strArr = strArr3;
                            }
                            strArr = strArr2;
                            mrVar = mrVar4;
                            i11 = size;
                            i18 = i19 + 1;
                            arrayList2 = arrayList;
                            lrVar2 = lrVar;
                            strArr2 = strArr;
                            mrVar4 = mrVar;
                            size = i11;
                        } else {
                            TLRPC.Chat chat = mrVar4.getMessagesController().getChat(Long.valueOf(-peerId));
                            lowerCase = chat.title.toLowerCase();
                            publicUsername = ChatObject.getPublicUsername(chat);
                            str = chat.title;
                            strArr = strArr2;
                            str2 = null;
                        }
                        mrVar = mrVar4;
                        String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase);
                        if (lowerCase.equals(translitString2)) {
                            translitString2 = null;
                        }
                        i11 = size;
                        int i20 = 0;
                        boolean z17 = false;
                        while (true) {
                            if (i20 < i17) {
                                int i21 = i20;
                                String str6 = strArr[i21];
                                if (lowerCase.startsWith(str6) || wh.u(" ", str6, lowerCase) || (translitString2 != null && (translitString2.startsWith(str6) || wh.u(" ", str6, translitString2)))) {
                                    str3 = lowerCase;
                                    z16 = true;
                                } else if (publicUsername == null || !publicUsername.startsWith(str6)) {
                                    boolean z18 = z17;
                                    str3 = lowerCase;
                                    z16 = z18;
                                } else {
                                    str3 = lowerCase;
                                    z16 = 2;
                                }
                                if (z16) {
                                    if (z16) {
                                        arrayList5.add(AndroidUtilities.generateSearchName(str, str2, str6));
                                    } else {
                                        arrayList5.add(AndroidUtilities.generateSearchName(b10.j("@", publicUsername), null, "@" + str6));
                                    }
                                    arrayList6.add(tLObject6);
                                } else {
                                    String str7 = translitString2;
                                    i20 = i21 + 1;
                                    String str8 = str3;
                                    z17 = z16;
                                    lowerCase = str8;
                                    translitString2 = str7;
                                }
                            }
                        }
                        i18 = i19 + 1;
                        arrayList2 = arrayList;
                        lrVar2 = lrVar;
                        strArr2 = strArr;
                        mrVar4 = mrVar;
                        size = i11;
                    }
                }
                lr lrVar3 = lrVar2;
                String[] strArr4 = strArr2;
                mr mrVar5 = mrVar4;
                if (arrayList3 != null) {
                    int i22 = 0;
                    while (i22 < arrayList3.size()) {
                        TLRPC.User user4 = mrVar5.getMessagesController().getUser(Long.valueOf(((TLRPC.TL_contact) arrayList3.get(i22)).user_id));
                        if (user4.id != mrVar5.getUserConfig().getClientUserId()) {
                            String lowerCase4 = UserObject.getUserName(user4).toLowerCase();
                            String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase4);
                            if (lowerCase4.equals(translitString3)) {
                                translitString3 = null;
                            }
                            boolean z19 = false;
                            int i23 = 0;
                            while (i23 < i17) {
                                String str9 = strArr4[i23];
                                if (lowerCase4.startsWith(str9) || wh.u(" ", str9, lowerCase4) || (translitString3 != null && (translitString3.startsWith(str9) || wh.u(" ", str9, translitString3)))) {
                                    i10 = i22;
                                    z19 = true;
                                } else {
                                    i10 = i22;
                                    String publicUsername2 = UserObject.getPublicUsername(user4);
                                    if (publicUsername2 != null && publicUsername2.startsWith(str9)) {
                                        z19 = 2;
                                    }
                                }
                                if (z19) {
                                    if (z19) {
                                        arrayList5.add(AndroidUtilities.generateSearchName(user4.first_name, user4.last_name, str9));
                                    } else {
                                        arrayList5.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user4), null, "@" + str9));
                                    }
                                    arrayList4.add(user4);
                                    hVar.k(user4, user4.id);
                                    i22 = i10 + 1;
                                } else {
                                    i23++;
                                    i22 = i10;
                                }
                            }
                        }
                        i10 = i22;
                        i22 = i10 + 1;
                    }
                }
                AndroidUtilities.runOnUIThread(new bi.u0(lrVar3, arrayList4, hVar, arrayList5, arrayList6, 29));
                return;
            case 22:
                org.telegram.ui.Components.e0 e0Var2 = (org.telegram.ui.Components.e0) this.c;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.d;
                Context context = (Context) this.b;
                u6 u6Var = (u6) this.e;
                String str10 = "https://t.me/addstyle/" + tL_aiComposeTone.slug;
                new org.telegram.ui.Components.l(e0Var2, context, str10, str10, u6Var).show();
                return;
            case 23:
                f5 f5Var = (f5) this.c;
                t8 t8Var = (t8) this.d;
                e2[] e2VarArr = (e2[]) this.b;
                View view = (View) this.e;
                String trim = f5Var.getText().toString().trim();
                Uri parse = Uri.parse(trim);
                if (parse == null || parse.getHost() == null) {
                    parse = Uri.parse("https://" + trim);
                }
                if (parse == null || parse.getHost() == null) {
                    AndroidUtilities.shakeView(f5Var);
                    return;
                }
                String lowerCase5 = parse.getHost().toLowerCase();
                if (lowerCase5.startsWith("www.")) {
                    lowerCase5 = lowerCase5.substring(4);
                }
                t8Var.run(lowerCase5);
                e2 e2Var2 = e2VarArr[0];
                if (e2Var2 != null) {
                    e2Var2.dismiss();
                }
                if (view != null) {
                    view.requestFocus();
                    return;
                }
                return;
            case 24:
                int[] iArr = (int[]) this.c;
                int[] iArr2 = (int[]) this.d;
                String[] strArr5 = (String[]) this.b;
                TextView textView = (TextView) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.MessageScheduledRepeatOption));
                spannableStringBuilder.append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                int i24 = 0;
                while (true) {
                    if (i24 < iArr.length) {
                        if (iArr2[0] == iArr[i24]) {
                            spannableStringBuilder.append((CharSequence) strArr5[i24]);
                            spannableStringBuilder.setSpan(new r61(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
                        } else {
                            i24++;
                        }
                    }
                }
                spannableStringBuilder.append((CharSequence) " v");
                if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    zq zqVar = new zq(R.drawable.arrows_select, 0);
                    zqVar.spaceScaleX = 0.7f;
                    zqVar.translate(AndroidUtilities.dp(-1.33f), AndroidUtilities.dp(0.0f));
                    zqVar.setAlpha(0.75f);
                    spannableStringBuilder.setSpan(zqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                } else {
                    zq zqVar2 = new zq(R.drawable.mini_switch_lock, 0);
                    zqVar2.spaceScaleX = 0.7f;
                    zqVar2.translate(AndroidUtilities.dp(-1.33f), AndroidUtilities.dp(0.0f));
                    zqVar2.setAlpha(0.75f);
                    spannableStringBuilder.setSpan(zqVar2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                }
                textView.setText(spannableStringBuilder);
                return;
            case 25:
                final ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                nw0 nw0Var2 = (nw0) this.d;
                int[] iArr3 = (int[]) this.b;
                bq0 bq0Var = (bq0) this.e;
                o1.c cVar2 = o1.h.p;
                o1.c cVar3 = o1.h.o;
                int[] iArr4 = chatActivityEnterView.N2;
                if (chatActivityEnterView.q0 == null) {
                    return;
                }
                final Dialog dialog = new Dialog(chatActivityEnterView.getContext(), R.style.TransparentDialogNoAnimation);
                FrameLayout frameLayout = new FrameLayout(chatActivityEnterView.getContext());
                frameLayout.addView(nw0Var2, kb1.i(40, 40, 3));
                dialog.setContentView(frameLayout);
                dialog.getWindow().setLayout(-1, -1);
                dialog.getWindow().clearFlags(1024);
                dialog.getWindow().clearFlags(67108864);
                dialog.getWindow().clearFlags(TLObject.FLAG_27);
                dialog.getWindow().addFlags(TLObject.FLAG_31);
                dialog.getWindow().addFlags(512);
                dialog.getWindow().addFlags(131072);
                dialog.getWindow().getAttributes().windowAnimations = 0;
                dialog.getWindow().getDecorView().setSystemUiVisibility(1792);
                dialog.getWindow().setStatusBarColor(0);
                dialog.getWindow().setNavigationBarColor(0);
                AndroidUtilities.setLightStatusBar(dialog, y6.x0(null, y6.s8, true) == -1);
                if (Build.VERSION.SDK_INT >= 26) {
                    AndroidUtilities.setLightNavigationBar(dialog, AndroidUtilities.computePerceivedBrightness(y6.x0(null, y6.a7, true)) >= 0.721f);
                }
                chatActivityEnterView.s0 = chatActivityEnterView.getRootWindowInsets().getSystemWindowInsetLeft() + chatActivityEnterView.s0;
                chatActivityEnterView.p0.getLocationInWindow(iArr4);
                float f10 = iArr4[0];
                final float f11 = iArr4[1];
                float dp = AndroidUtilities.dp(5.0f);
                float dp2 = iArr3[0] + chatActivityEnterView.s0 + dp + AndroidUtilities.dp(4.0f) + 0.0f;
                float f12 = iArr3[1] + chatActivityEnterView.t0 + dp + 0.0f;
                nw0Var2.setTranslationX(dp2);
                nw0Var2.setTranslationY(f12);
                float scaleX = (chatActivityEnterView.p0.getLayoutParams().width * (chatActivityEnterView.p5 ? chatActivityEnterView.p0.getScaleX() : 1.0f)) / AndroidUtilities.dp(40.0f);
                nw0Var2.setPivotX(0.0f);
                nw0Var2.setPivotY(0.0f);
                nw0Var2.setScaleX(0.75f);
                nw0Var2.setScaleY(0.75f);
                nw0Var2.getViewTreeObserver().addOnDrawListener(new ff(nw0Var2, bq0Var));
                dialog.show();
                if (!chatActivityEnterView.p5) {
                    chatActivityEnterView.p0.setScaleX(1.0f);
                    chatActivityEnterView.p0.setScaleY(1.0f);
                }
                chatActivityEnterView.p0.setAlpha(1.0f);
                ef efVar = chatActivityEnterView.q0;
                if (chatActivityEnterView.p5) {
                    nw0Var = nw0Var2;
                    jVar = null;
                } else {
                    nw0Var = nw0Var2;
                    jVar = new o1.j(chatActivityEnterView.p0, cVar3);
                    jVar.u = d3.l(0.5f, 750.0f, 1.0f);
                }
                if (chatActivityEnterView.p5) {
                    f7 = f10;
                    jVar2 = null;
                } else {
                    f7 = f10;
                    jVar2 = new o1.j(chatActivityEnterView.p0, cVar2);
                    jVar2.u = d3.l(0.5f, 750.0f, 1.0f);
                }
                o1.j jVar4 = new o1.j(chatActivityEnterView.p0, o1.h.t);
                jVar4.u = d3.l(0.0f, 750.0f, 1.0f);
                final float f13 = f7;
                final int i25 = 0;
                final nw0 nw0Var3 = nw0Var;
                jVar4.a(new o1.f() { // from class: org.telegram.ui.Components.wd
                    @Override // o1.f
                    public final void a(o1.h hVar2, boolean z20, float f14, float f15) {
                        int i26 = i25;
                        float f16 = f11;
                        float f17 = f13;
                        nw0 nw0Var4 = nw0Var3;
                        Dialog dialog2 = dialog;
                        ChatActivityEnterView chatActivityEnterView2 = chatActivityEnterView;
                        switch (i26) {
                            case 0:
                                int i27 = ChatActivityEnterView.r5;
                                if (dialog2.isShowing()) {
                                    nw0Var4.setTranslationX(f17);
                                    nw0Var4.setTranslationY(f16);
                                    dq0 dq0Var = chatActivityEnterView2.p0;
                                    dq0Var.getClass();
                                    dq0Var.a(false, false, 0.0f);
                                    if (!chatActivityEnterView2.p5) {
                                        chatActivityEnterView2.p0.setScaleX(1.0f);
                                        chatActivityEnterView2.p0.setScaleY(1.0f);
                                    }
                                    chatActivityEnterView2.p0.setAlpha(1.0f);
                                    chatActivityEnterView2.p0.getViewTreeObserver().addOnPreDrawListener(new gf(chatActivityEnterView2, dialog2, 0));
                                    break;
                                }
                                break;
                            default:
                                int i28 = ChatActivityEnterView.r5;
                                if (dialog2.isShowing()) {
                                    nw0Var4.setTranslationX(f17);
                                    nw0Var4.setTranslationY(f16);
                                    dq0 dq0Var2 = chatActivityEnterView2.p0;
                                    dq0Var2.getClass();
                                    dq0Var2.a(false, false, 0.0f);
                                    if (!chatActivityEnterView2.p5) {
                                        chatActivityEnterView2.p0.setScaleX(1.0f);
                                        chatActivityEnterView2.p0.setScaleY(1.0f);
                                    }
                                    chatActivityEnterView2.p0.setAlpha(1.0f);
                                    chatActivityEnterView2.p0.getViewTreeObserver().addOnPreDrawListener(new gf(chatActivityEnterView2, dialog2, 1));
                                    break;
                                }
                                break;
                        }
                    }
                });
                o1.j jVar5 = new o1.j(nw0Var3, o1.h.m);
                jVar5.b = ee.a(dp2, f13 - AndroidUtilities.dp(6.0f), dp2);
                jVar5.c = true;
                jVar5.u = d3.l(f13, 700.0f, 0.75f);
                jVar5.h = f13 - AndroidUtilities.dp(6.0f);
                o1.j jVar6 = new o1.j(nw0Var3, o1.h.n);
                jVar6.b = ee.a(f12, f12, AndroidUtilities.dp(6.0f) + f11);
                jVar6.c = true;
                jVar6.u = d3.l(f11, 700.0f, 0.75f);
                jVar6.g = AndroidUtilities.dp(6.0f) + f11;
                jVar6.b(new jf(f11, nw0Var3));
                final int i26 = 1;
                jVar6.a(new o1.f() { // from class: org.telegram.ui.Components.wd
                    @Override // o1.f
                    public final void a(o1.h hVar2, boolean z20, float f14, float f15) {
                        int i262 = i26;
                        float f16 = f11;
                        float f17 = f13;
                        nw0 nw0Var4 = nw0Var3;
                        Dialog dialog2 = dialog;
                        ChatActivityEnterView chatActivityEnterView2 = chatActivityEnterView;
                        switch (i262) {
                            case 0:
                                int i27 = ChatActivityEnterView.r5;
                                if (dialog2.isShowing()) {
                                    nw0Var4.setTranslationX(f17);
                                    nw0Var4.setTranslationY(f16);
                                    dq0 dq0Var = chatActivityEnterView2.p0;
                                    dq0Var.getClass();
                                    dq0Var.a(false, false, 0.0f);
                                    if (!chatActivityEnterView2.p5) {
                                        chatActivityEnterView2.p0.setScaleX(1.0f);
                                        chatActivityEnterView2.p0.setScaleY(1.0f);
                                    }
                                    chatActivityEnterView2.p0.setAlpha(1.0f);
                                    chatActivityEnterView2.p0.getViewTreeObserver().addOnPreDrawListener(new gf(chatActivityEnterView2, dialog2, 0));
                                    break;
                                }
                                break;
                            default:
                                int i28 = ChatActivityEnterView.r5;
                                if (dialog2.isShowing()) {
                                    nw0Var4.setTranslationX(f17);
                                    nw0Var4.setTranslationY(f16);
                                    dq0 dq0Var2 = chatActivityEnterView2.p0;
                                    dq0Var2.getClass();
                                    dq0Var2.a(false, false, 0.0f);
                                    if (!chatActivityEnterView2.p5) {
                                        chatActivityEnterView2.p0.setScaleX(1.0f);
                                        chatActivityEnterView2.p0.setScaleY(1.0f);
                                    }
                                    chatActivityEnterView2.p0.setAlpha(1.0f);
                                    chatActivityEnterView2.p0.getViewTreeObserver().addOnPreDrawListener(new gf(chatActivityEnterView2, dialog2, 1));
                                    break;
                                }
                                break;
                        }
                    }
                });
                o1.j jVar7 = new o1.j(nw0Var3, cVar3);
                jVar7.u = d3.l(scaleX, 1000.0f, 1.0f);
                o1.j jVar8 = new o1.j(nw0Var3, cVar2);
                jVar8.u = d3.l(scaleX, 1000.0f, 1.0f);
                efVar.l(jVar, jVar2, jVar4, jVar5, jVar6, jVar7, jVar8);
                return;
            case 26:
                a();
                return;
            case 27:
                my myVar = (my) this.c;
                e2[] e2VarArr2 = (e2[]) this.d;
                TLObject tLObject7 = (TLObject) this.b;
                e3 e3Var = (e3) this.e;
                myVar.getClass();
                try {
                    e2VarArr2[0].dismiss();
                } catch (Throwable unused2) {
                }
                e2VarArr2[0] = null;
                if (tLObject7 instanceof TLRPC.TL_emojiURL) {
                    qf.d.r(myVar.c.a.F.getContext(), ((TLRPC.TL_emojiURL) tLObject7).url);
                    runnable = e3Var.a.dismissRunnable;
                    runnable.run();
                    return;
                }
                return;
            case 28:
                b();
                return;
            default:
                n10 n10Var = (n10) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject8 = (TLObject) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.e;
                n10Var.z0 = -1;
                r2 r2Var2 = n10Var.n;
                q00.t0(tL_error3, r2Var2, wc.b0(r2Var2));
                if (tLObject8 == null) {
                    n10Var.l0.a(false);
                    return;
                }
                if (tLObject8 instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject8;
                    ArrayList<TLRPC.Update> arrayList7 = updates.updates;
                    if (arrayList7.isEmpty()) {
                        TLRPC.Update update = updates.update;
                        if (update instanceof TL_update.TL_updateDialogFilter) {
                            i12 = ((TL_update.TL_updateDialogFilter) update).id;
                        }
                    } else {
                        while (true) {
                            if (i14 < arrayList7.size()) {
                                if (arrayList7.get(i14) instanceof TL_update.TL_updateDialogFilter) {
                                    i12 = ((TL_update.TL_updateDialogFilter) arrayList7.get(i14)).id;
                                } else {
                                    i14++;
                                }
                            }
                        }
                    }
                }
                if (n10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                    r2Var2.getMessagesController().loadRemoteFilters(true, new p4(n10Var, callback, i12, i13));
                    return;
                }
                if (n10Var.a0 != null) {
                    r2Var2.getMessagesController().checkChatlistFolderUpdate(n10Var.Y, true);
                }
                n10Var.A0 = true;
                n10Var.dismiss();
                callback.run(Integer.valueOf(i12));
                return;
        }
    }

    public /* synthetic */ v0(f0 f0Var, Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = f0Var;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
