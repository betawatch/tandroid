package o4;

import ai.g3;
import ai.m3;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.be;
import b8.mf;
import b8.pf;
import ci.b8;
import ci.ec;
import ci.o2;
import ci.v3;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hc;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.m5;
import org.telegram.messenger.qq;
import org.telegram.messenger.qr;
import org.telegram.messenger.rp;
import org.telegram.messenger.t3;
import org.telegram.messenger.u10;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.w7;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.t2;
import org.telegram.ui.ActionBar.y5;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.bx;
import org.telegram.ui.Components.c2;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.cl;
import org.telegram.ui.Components.d20;
import org.telegram.ui.Components.dn0;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.ex;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.ht0;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.le;
import org.telegram.ui.Components.me;
import org.telegram.ui.Components.n3;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.pe;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.x3;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.xx;
import org.telegram.ui.Components.y3;
import org.telegram.ui.Components.yx;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.b3;
import org.telegram.ui.ez;
import org.telegram.ui.i8;
import org.telegram.ui.ip;
import org.telegram.ui.jo;
import org.telegram.ui.ka;
import org.telegram.ui.lq;
import org.telegram.ui.mq;
import org.telegram.ui.nq;
import org.telegram.ui.o6;
import org.telegram.ui.q6;
import org.telegram.ui.qo;
import org.telegram.ui.qp;
import org.telegram.ui.uw;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class b1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b1(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    private final void a() {
        FrameLayout frameLayout;
        an anVar = (an) this.b;
        Context context = (Context) this.c;
        View view = (View) this.d;
        e6 e6Var = (e6) this.e;
        long j10 = anVar.W;
        final jo joVar = new jo(20, anVar, view);
        hc hcVar = new hc(29);
        int i3 = k6.j5;
        int f10 = e6Var != null ? e6Var.f(i3) : k6.x0(null, i3, false);
        int i10 = k6.h5;
        int f11 = e6Var != null ? e6Var.f(i10) : k6.x0(null, i10, false);
        int i11 = k6.xj;
        if (e6Var != null) {
            e6Var.f(i11);
        } else {
            k6.x0(null, i11, false);
        }
        int i12 = k6.Bj;
        if (e6Var != null) {
            e6Var.f(i12);
        } else {
            k6.x0(null, i12, false);
        }
        int i13 = k6.E8;
        if (e6Var != null) {
            e6Var.f(i13);
        } else {
            k6.x0(null, i13, false);
        }
        int i14 = k6.G8;
        if (e6Var != null) {
            e6Var.f(i14);
        } else {
            k6.x0(null, i14, false);
        }
        int i15 = k6.i6;
        if (e6Var != null) {
            e6Var.f(i15);
        } else {
            k6.x0(null, i15, false);
        }
        int i16 = k6.Gi;
        int f12 = e6Var != null ? e6Var.f(i16) : k6.x0(null, i16, false);
        int i17 = k6.Ci;
        int f13 = e6Var != null ? e6Var.f(i17) : k6.x0(null, i17, false);
        int i18 = k6.Ei;
        if (e6Var != null) {
            e6Var.f(i18);
        } else {
            k6.x0(null, i18, false);
        }
        Pattern pattern = t4.a;
        if (context == null) {
            return;
        }
        final int g22 = (int) hp.s1(h10.t0).x7.E.g2(TimeUnit.SECONDS);
        final hi.d dVar = new hi.d(context, e6Var);
        ((t2) dVar.b).w0 = false;
        int i19 = f12;
        final cb0 cb0Var = new cb0(context, e6Var);
        cb0Var.setTextColor(f10);
        cb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        cb0Var.setItemCount(5);
        int i20 = f13;
        final x3 x3Var = new x3(context, e6Var);
        x3Var.setWrapSelectorWheel(true);
        x3Var.setAllItemsCount(24);
        x3Var.setItemCount(5);
        x3Var.setTextColor(f10);
        x3Var.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        final y3 y3Var = new y3(context, e6Var);
        y3Var.setWrapSelectorWheel(true);
        y3Var.setAllItemsCount(60);
        y3Var.setItemCount(5);
        y3Var.setTextColor(f10);
        y3Var.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        int i21 = f11;
        n3 n3Var = new n3(context, cb0Var, x3Var, y3Var, 3);
        n3Var.setOrientation(1);
        frameLayout2.addView(n3Var, mf.c(-1.0f, -1));
        frameLayout2.addView(new FrameLayout(context), mf.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        n3Var.addView(frameLayout3, mf.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(bd.M0(2131744837, null));
        textView.setTextColor(f10);
        k2.p1.t(textView, 1, 20.0f);
        frameLayout3.addView(textView, mf.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new fi.a(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        n3Var.addView(linearLayout, mf.q(-1, -2, 1.0f, 0, 0, 23, 0, 23));
        final TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 12.0f);
        r6.V(textView2, k6.q5, e6Var);
        textView2.setGravity(17);
        final Calendar calendar = Calendar.getInstance();
        ec ecVar = new ec(context, 16);
        ecVar.setText(bd.M0(2131744838, null));
        pf.b(ecVar, 0.02f, 1.2f);
        linearLayout.addView(cb0Var, mf.l(0.5f, 0, hs.t4));
        cb0Var.setMinValue(0);
        cb0Var.setMaxValue(365);
        cb0Var.setWrapSelectorWheel(false);
        cb0Var.setFormatter(new org.telegram.ui.Components.c(20));
        m3 m3Var = new m3(g22, cb0Var, x3Var, y3Var, textView2);
        cb0Var.setOnValueChangedListener(m3Var);
        x3Var.setMinValue(0);
        x3Var.setMaxValue(23);
        linearLayout.addView(x3Var, mf.l(0.2f, 0, hs.t4));
        x3Var.setFormatter(new org.telegram.ui.Components.c(21));
        x3Var.setOnValueChangedListener(m3Var);
        y3Var.setMinValue(0);
        y3Var.setMaxValue(59);
        y3Var.setValue(0);
        y3Var.setFormatter(new org.telegram.ui.Components.c(22));
        linearLayout.addView(y3Var, mf.l(0.3f, 0, hs.t4));
        y3Var.setOnValueChangedListener(m3Var);
        if (j10 <= 0 || j10 == 2147483646) {
            frameLayout = frameLayout2;
        } else {
            long j11 = 1000 * j10;
            frameLayout = frameLayout2;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j11 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j11);
            if (timeInMillis >= 0) {
                y3Var.setValue(calendar.get(12));
                x3Var.setValue(calendar.get(11));
                cb0Var.setValue(timeInMillis);
            }
        }
        final boolean[] zArr = {true};
        t4.g(null, null, 0L, g22, 3, cb0Var, x3Var, y3Var);
        t4.e(textView2, cb0Var, x3Var, y3Var);
        ecVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        ecVar.setGravity(17);
        ecVar.setTextColor(i19);
        ecVar.setTextSize(1, 14.0f);
        ecVar.setTypeface(org.telegram.messenger.g0.o());
        ecVar.setBackground(y5.e(i20, 24.0f));
        n3Var.addView(ecVar, mf.t(-1, 48, 83, 14, 15, 14, 16));
        ecVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.b2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                zArr[0] = false;
                long j12 = g22;
                cb0 cb0Var2 = cb0Var;
                x3 x3Var2 = x3Var;
                y3 y3Var2 = y3Var;
                boolean g7 = t4.g(null, null, 0L, j12, 3, cb0Var2, x3Var2, y3Var2);
                t4.e(textView2, cb0Var2, x3Var2, y3Var2);
                long currentTimeMillis = System.currentTimeMillis();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(currentTimeMillis);
                calendar2.add(6, cb0Var2.getValue());
                calendar2.set(11, x3Var2.getValue());
                calendar2.set(12, y3Var2.getValue());
                if (g7) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                joVar.L((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                ((org.telegram.ui.ActionBar.t2) dVar.b).y0.run();
            }
        });
        n3Var.addView(textView2, mf.t(-1, -2, 83, 14, 0, 14, 16));
        t2 t2Var = (t2) dVar.b;
        t2Var.O = frameLayout;
        t2Var.show();
        t2Var.setOnDismissListener(new c2(0, hcVar, zArr));
        t2Var.v0(i21);
        t2Var.O(i21);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0c92  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        boolean z11;
        boolean z12;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i3;
        TLRPC.User user;
        Throwable th2;
        TLRPC.TL_webPage tL_webPage;
        ArrayList arrayList;
        mq mqVar;
        long C1;
        int i10;
        nq nqVar;
        String[] strArr;
        String lowerCase;
        boolean z13;
        String str;
        String str2;
        String str3;
        q1.g gVar;
        final ht0 ht0Var;
        final float f10;
        q1.g gVar2;
        int b10;
        a0.h hVar;
        ArrayList arrayList2;
        a0.h hVar2;
        int i11 = 26;
        int i12 = 5;
        int i13 = -1;
        int i14 = 1;
        switch (this.a) {
            case 0:
                e0 e0Var = (e0) this.b;
                e1 e1Var = (e1) this.c;
                v vVar = (v) this.d;
                List list = (List) this.e;
                if (!e0Var.j()) {
                    e1Var.c(e0Var.t, vVar, list);
                    break;
                }
                break;
            case 1:
                CameraController.lambda$openRound$9((CameraSession) this.b, (Runnable) this.c, (SurfaceTexture) this.d, (Runnable) this.e);
                break;
            case 2:
                CameraController.lambda$close$5((Runnable) this.b, (CameraSession) this.c, (CountDownLatch) this.d, (Runnable) this.e);
                break;
            case 3:
                ((VideoAds) this.b).lambda$show$14((Context) this.c, (TLRPC.TL_sponsoredMessage) this.d, (f60) this.e);
                break;
            case 4:
                TLObject tLObject = (TLObject) this.b;
                g6 g6Var = (g6) this.c;
                j6 j6Var = (j6) this.d;
                TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) this.e;
                k6.A--;
                if (tLObject instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme2 = (TLRPC.TL_theme) tLObject;
                    TLRPC.ThemeSettings themeSettings = tL_theme2.settings.size() > 0 ? tL_theme2.settings.get(0) : null;
                    if (g6Var == null || themeSettings == null) {
                        TLRPC.Document document = tL_theme2.document;
                        if (document != null && document.id != tL_theme.document.id) {
                            if (g6Var != null) {
                                g6Var.r = tL_theme2;
                                z11 = true;
                            } else {
                                j6Var.G = tL_theme2;
                                j6Var.H = false;
                                j6Var.h0 = null;
                                j6Var.i0 = null;
                                hs.f(j6Var.F).b(j6Var, hs.Y1);
                                hs.f(j6Var.F).b(j6Var, hs.Z1);
                                w7 G = w7.G(j6Var.F);
                                TLRPC.TL_theme tL_theme3 = j6Var.G;
                                z11 = true;
                                G.X(tL_theme3.document, tL_theme3, 1, 1);
                            }
                            z10 = z11;
                        }
                    } else {
                        if (j6.a(g6Var, themeSettings)) {
                            z12 = false;
                        } else {
                            File e10 = g6Var.e();
                            if (e10 != null) {
                                e10.delete();
                            }
                            j6.i(g6Var, themeSettings);
                            j6 j6Var2 = k6.I;
                            if (j6Var2 == j6Var && j6Var2.Z == g6Var.a) {
                                k6.t1(false, false);
                                k6.K(org.telegram.messenger.t0.b, false);
                                j6 j6Var3 = k6.I;
                                k6.K1(j6Var3, k6.J == j6Var3, -1, null);
                            }
                            d6.a(true);
                            z12 = true;
                        }
                        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                        g6Var.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                        z10 = z12;
                    }
                    if (k6.A != 0) {
                        k6.B = (int) (System.currentTimeMillis() / 1000);
                        k6.y1(z10, false);
                        break;
                    }
                }
                z10 = false;
                if (k6.A != 0) {
                }
                break;
            case 5:
                ((g3) this.b).a(k6.T0((File) this.c, (String) this.d, (String[]) this.e));
                break;
            case 6:
                org.telegram.ui.r6 r6Var = (org.telegram.ui.r6) this.b;
                ai.c0 c0Var = (ai.c0) this.c;
                float[] fArr = (float[]) this.d;
                boolean[] zArr = (boolean[]) this.e;
                r6Var.getClass();
                c0Var.f(fArr[0]);
                if (zArr[0]) {
                    r6Var.d.A0(true);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.r6 r6Var2 = (org.telegram.ui.r6) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                long[] jArr = (long[]) this.d;
                q6 q6Var = (q6) this.e;
                if (!zArr2[0]) {
                    jArr[0] = System.currentTimeMillis();
                    r6Var2.d.showDialog(q6Var);
                    break;
                }
                break;
            case 8:
                i8.Z((i8) this.b, (TLRPC.TL_error) this.c, (TLObject) this.d, (Calendar) this.e);
                break;
            case 9:
                ka.Z((ka) this.b, (org.telegram.ui.ActionBar.s1) this.c, (TLRPC.TL_error) this.d, (TL_account.updateUsername) this.e);
                break;
            case 10:
                wm wmVar = (wm) this.b;
                d2 d2Var = (d2) this.c;
                zi ziVar = (zi) this.d;
                q4 q4Var = (q4) this.e;
                if (d2Var instanceof cs) {
                    i3 = 4;
                    wmVar.getNotificationCenter().n((cs) d2Var, 4);
                } else {
                    i3 = 4;
                }
                wmVar.getNotificationCenter().k(i3, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", ziVar.k.action.channel_id);
                ((ActionBarLayout) q4Var).c(q4Var.getFragmentStack().size() - 1, new wm(bundle));
                d2Var.finishFragment();
                break;
            case 11:
                wm wmVar2 = (wm) this.b;
                sf.b bVar = (sf.b) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                o2 o2Var = (o2) this.e;
                bVar.b();
                if (tLObject2 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                    wmVar2.getMessagesController().Y3(tL_contacts_resolvedPeer.users, false);
                    wmVar2.getMessagesController().S3(tL_contacts_resolvedPeer.chats, false);
                    long o10 = m5.o(tL_contacts_resolvedPeer.peer);
                    if (o10 >= 0) {
                        user = wmVar2.getMessagesController().a2(Long.valueOf(o10));
                        o2Var.a(user);
                        break;
                    }
                }
                user = null;
                o2Var.a(user);
            case 12:
                long[] jArr2 = (long[]) this.b;
                boolean[] zArr3 = (boolean[]) this.c;
                ImageView imageView = (ImageView) this.d;
                ImageView imageView2 = (ImageView) this.e;
                jArr2[0] = SystemClock.elapsedRealtime();
                if (!zArr3[0]) {
                    imageView = imageView2;
                }
                wq wqVar = (wq) imageView.getDrawable();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new b3(wqVar, 4));
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(xq.f);
                ofFloat.start();
                break;
            case 13:
                wm wmVar3 = (wm) this.b;
                zi ziVar2 = (zi) this.c;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) this.d;
                boolean[] zArr4 = (boolean[]) this.e;
                try {
                    tL_webPage = k80.g(ziVar2);
                    th2 = null;
                } catch (Throwable th3) {
                    a8.g(th3, true);
                    th2 = th3;
                    tL_webPage = null;
                }
                org.telegram.messenger.g0.h3(new v3(wmVar3, s1Var, zArr4, th2 == null && tL_webPage != null, ziVar2, tL_webPage));
                break;
            case 14:
                wm wmVar4 = (wm) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                qr qrVar = (qr) this.e;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                if (tL_error != null || messages_messages.messages.isEmpty()) {
                    if (messages_messages != null) {
                        wmVar4.C6 = messages_messages.count;
                    } else {
                        wmVar4.C6 = 0;
                    }
                    qrVar.a.c(new qq(qrVar, wmVar4.b(), wmVar4.k6, wmVar4.C6, 7));
                    int i15 = wmVar4.C6;
                    if (i15 == 0) {
                        wmVar4.D6 = true;
                        wmVar4.nc(false);
                        break;
                    } else {
                        wmVar4.y1.c(2, i15, true);
                        wmVar4.ha();
                        break;
                    }
                } else {
                    int i16 = messages_messages.messages.get(0).id;
                    zi ziVar3 = (zi) wmVar4.F6[0].get(i16);
                    qrVar.a.c(new rp(qrVar, i16, wmVar4.k6, 4));
                    if (ziVar3 != null) {
                        TLRPC.Message message = ziVar3.k;
                        message.media_unread = true;
                        message.mentioned = true;
                    }
                    wmVar4.l(i16, 0, false, 0, true, 0);
                    break;
                }
                break;
            case 15:
                wm.R0((wm) this.b, (TLRPC.TL_messageMediaWebPage) this.c, (TLRPC.TL_webPageAttributeStory) this.d, (o6) this.e);
                break;
            case 16:
                qo.b0((qo) this.b, (org.telegram.ui.ActionBar.s1[]) this.c, (TLRPC.Chat) this.d, (d2) this.e);
                break;
            case 17:
                ip ipVar = (ip) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.e;
                ipVar.getClass();
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject4;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.r0(password);
                    ipVar.u0(twoStepVerificationActivity.q0(), twoStepVerificationActivity);
                    break;
                }
                break;
            case 18:
                nq nqVar2 = (nq) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                TLRPC.User user2 = (TLRPC.User) this.d;
                org.telegram.ui.rp rpVar = (org.telegram.ui.rp) this.e;
                if (!(tLObject5 instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject5 instanceof TLRPC.TL_chatParticipantAdmin)) {
                    rpVar.a(1);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nqVar2.getParentActivity());
                    alertDialog$Builder.a.S = bd.M0(R.string.AppName, "AppName");
                    alertDialog$Builder.a.U = bd.a0(null, null, 2131754350, l10.p(user2));
                    alertDialog$Builder.k(bd.M0(2131747839, "OK"), new org.telegram.ui.x0(rpVar, i11));
                    alertDialog$Builder.h(bd.M0(2131752589, "Cancel"), null);
                    nqVar2.showDialog(alertDialog$Builder.a);
                    break;
                }
                break;
            case 19:
                mq mqVar2 = (mq) this.b;
                String str4 = (String) this.c;
                ArrayList arrayList3 = (ArrayList) this.d;
                ArrayList arrayList4 = (ArrayList) this.e;
                nq nqVar3 = mqVar2.E;
                String lowerCase2 = str4.trim().toLowerCase();
                if (lowerCase2.length() == 0) {
                    org.telegram.messenger.g0.h3(new lq(mqVar2, new ArrayList(), new a0.h(), new ArrayList(), new ArrayList()));
                    break;
                } else {
                    String S0 = bd.E0().S0(lowerCase2, true, false);
                    if (lowerCase2.equals(S0) || S0.length() == 0) {
                        S0 = null;
                    }
                    int i17 = (S0 != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i17];
                    strArr2[0] = lowerCase2;
                    if (S0 != null) {
                        strArr2[1] = S0;
                    }
                    ArrayList arrayList5 = new ArrayList();
                    a0.h hVar3 = new a0.h();
                    ArrayList arrayList6 = new ArrayList();
                    nq nqVar4 = nqVar3;
                    ArrayList arrayList7 = new ArrayList();
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i18 = 0;
                        while (i18 < size) {
                            TLObject tLObject6 = (TLObject) arrayList3.get(i18);
                            int i19 = i18;
                            if (tLObject6 instanceof TLRPC.ChatParticipant) {
                                arrayList = arrayList3;
                                mqVar = mqVar2;
                                C1 = ((TLRPC.ChatParticipant) tLObject6).user_id;
                            } else {
                                arrayList = arrayList3;
                                mqVar = mqVar2;
                                if (tLObject6 instanceof TLRPC.ChannelParticipant) {
                                    C1 = zi.C1(((TLRPC.ChannelParticipant) tLObject6).peer);
                                }
                                strArr = strArr2;
                                nqVar = nqVar4;
                                i10 = size;
                                i18 = i19 + 1;
                                arrayList3 = arrayList;
                                mqVar2 = mqVar;
                                strArr2 = strArr;
                                nqVar4 = nqVar;
                                size = i10;
                            }
                            if (C1 > 0) {
                                TLRPC.User a22 = nqVar4.getMessagesController().a2(Long.valueOf(C1));
                                if (a22.id != nqVar4.getUserConfig().e()) {
                                    String lowerCase3 = l10.p(a22).toLowerCase();
                                    String n4 = l10.n(a22);
                                    String str5 = a22.first_name;
                                    nqVar = nqVar4;
                                    str3 = a22.last_name;
                                    str = str5;
                                    lowerCase = lowerCase3;
                                    strArr = strArr2;
                                    str2 = n4;
                                    z13 = false;
                                }
                                strArr = strArr2;
                                nqVar = nqVar4;
                                i10 = size;
                                i18 = i19 + 1;
                                arrayList3 = arrayList;
                                mqVar2 = mqVar;
                                strArr2 = strArr;
                                nqVar4 = nqVar;
                                size = i10;
                            } else {
                                TLRPC.Chat M0 = nqVar4.getMessagesController().M0(Long.valueOf(-C1));
                                lowerCase = M0.title.toLowerCase();
                                z13 = false;
                                String K = t3.K(M0, false);
                                str = M0.title;
                                strArr = strArr2;
                                nqVar = nqVar4;
                                str2 = K;
                                str3 = null;
                            }
                            i10 = size;
                            String S02 = bd.E0().S0(lowerCase, true, z13);
                            if (lowerCase.equals(S02)) {
                                S02 = null;
                            }
                            int i20 = 0;
                            boolean z14 = false;
                            while (true) {
                                if (i20 < i17) {
                                    int i21 = i20;
                                    String str6 = strArr[i21];
                                    if (lowerCase.startsWith(str6) || k2.p1.z(" ", str6, lowerCase) || (S02 != null && (S02.startsWith(str6) || k2.p1.z(" ", str6, S02)))) {
                                        z14 = true;
                                    } else if (str2 != null && str2.startsWith(str6)) {
                                        z14 = 2;
                                    }
                                    if (z14) {
                                        if (z14) {
                                            arrayList6.add(org.telegram.messenger.g0.r0(str, str3, str6));
                                        } else {
                                            arrayList6.add(org.telegram.messenger.g0.r0(t4.c.f("@", str2), null, "@" + str6));
                                        }
                                        arrayList7.add(tLObject6);
                                    } else {
                                        i20 = i21 + 1;
                                    }
                                }
                            }
                            i18 = i19 + 1;
                            arrayList3 = arrayList;
                            mqVar2 = mqVar;
                            strArr2 = strArr;
                            nqVar4 = nqVar;
                            size = i10;
                        }
                    }
                    mq mqVar3 = mqVar2;
                    String[] strArr3 = strArr2;
                    nq nqVar5 = nqVar4;
                    if (arrayList4 != null) {
                        for (int i22 = 0; i22 < arrayList4.size(); i22++) {
                            TLRPC.User a23 = nqVar5.getMessagesController().a2(Long.valueOf(((TLRPC.TL_contact) arrayList4.get(i22)).user_id));
                            if (a23.id != nqVar5.getUserConfig().e()) {
                                String lowerCase4 = l10.p(a23).toLowerCase();
                                String S03 = bd.E0().S0(lowerCase4, true, false);
                                if (lowerCase4.equals(S03)) {
                                    S03 = null;
                                }
                                int i23 = 0;
                                boolean z15 = false;
                                while (true) {
                                    if (i23 < i17) {
                                        String str7 = strArr3[i23];
                                        if (lowerCase4.startsWith(str7) || k2.p1.z(" ", str7, lowerCase4) || (S03 != null && (S03.startsWith(str7) || k2.p1.z(" ", str7, S03)))) {
                                            z15 = true;
                                        } else {
                                            String n10 = l10.n(a23);
                                            if (n10 != null && n10.startsWith(str7)) {
                                                z15 = 2;
                                            }
                                        }
                                        if (z15) {
                                            if (z15) {
                                                arrayList6.add(org.telegram.messenger.g0.r0(a23.first_name, a23.last_name, str7));
                                            } else {
                                                arrayList6.add(org.telegram.messenger.g0.r0("@" + l10.n(a23), null, "@" + str7));
                                            }
                                            arrayList5.add(a23);
                                            hVar3.k(a23, a23.id);
                                        } else {
                                            i23++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    org.telegram.messenger.g0.h3(new lq(mqVar3, arrayList5, hVar3, arrayList6, arrayList7));
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Components.e0 e0Var2 = (org.telegram.ui.Components.e0) this.b;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.c;
                Context context = (Context) this.d;
                e6 e6Var = (e6) this.e;
                String str8 = "https://t.me/addstyle/" + tL_aiComposeTone.slug;
                new org.telegram.ui.Components.m(e0Var2, context, str8, str8, e6Var).show();
                break;
            case 21:
                s4 s4Var = (s4) this.b;
                b8 b8Var = (b8) this.c;
                org.telegram.ui.ActionBar.s1[] s1VarArr = (org.telegram.ui.ActionBar.s1[]) this.d;
                View view = (View) this.e;
                String trim = s4Var.getText().toString().trim();
                Uri parse = Uri.parse(trim);
                if (parse == null || parse.getHost() == null) {
                    parse = Uri.parse("https://" + trim);
                }
                if (parse != null && parse.getHost() != null) {
                    String lowerCase5 = parse.getHost().toLowerCase();
                    if (lowerCase5.startsWith("www.")) {
                        lowerCase5 = lowerCase5.substring(4);
                    }
                    b8Var.a(lowerCase5);
                    org.telegram.ui.ActionBar.s1 s1Var2 = s1VarArr[0];
                    if (s1Var2 != null) {
                        s1Var2.dismiss();
                    }
                    if (view != null) {
                        view.requestFocus();
                        break;
                    }
                } else {
                    org.telegram.messenger.g0.F3(s4Var);
                    break;
                }
                break;
            case 22:
                int[] iArr = (int[]) this.b;
                int[] iArr2 = (int[]) this.c;
                String[] strArr4 = (String[]) this.d;
                TextView textView = (TextView) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) bd.M0(2131748514, null));
                spannableStringBuilder.append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                int i24 = 0;
                while (true) {
                    if (i24 < iArr.length) {
                        if (iArr2[0] == iArr[i24]) {
                            spannableStringBuilder.append((CharSequence) strArr4[i24]);
                            spannableStringBuilder.setSpan(new o31(org.telegram.messenger.g0.o()), length, spannableStringBuilder.length(), 33);
                        } else {
                            i24++;
                        }
                    }
                }
                spannableStringBuilder.append((CharSequence) " v");
                if (h10.i(h10.t0).q()) {
                    wp wpVar = new wp(R.drawable.arrows_select, 0);
                    wpVar.H = 0.7f;
                    float L = org.telegram.messenger.g0.L(-1.33f);
                    float L2 = org.telegram.messenger.g0.L(0.0f);
                    wpVar.r = L;
                    wpVar.s = L2;
                    wpVar.x = 0.75f;
                    spannableStringBuilder.setSpan(wpVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                } else {
                    wp wpVar2 = new wp(R.drawable.mini_switch_lock, 0);
                    wpVar2.H = 0.7f;
                    float L3 = org.telegram.messenger.g0.L(-1.33f);
                    float L4 = org.telegram.messenger.g0.L(0.0f);
                    wpVar2.r = L3;
                    wpVar2.s = L4;
                    wpVar2.x = 0.75f;
                    spannableStringBuilder.setSpan(wpVar2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                }
                textView.setText(spannableStringBuilder);
                break;
            case 23:
                final ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                ht0 ht0Var2 = (ht0) this.c;
                int[] iArr3 = (int[]) this.d;
                dn0 dn0Var = (dn0) this.e;
                q1.b bVar2 = q1.g.r;
                q1.b bVar3 = q1.g.q;
                int[] iArr4 = chatActivityEnterView.O2;
                if (chatActivityEnterView.r0 != null) {
                    final Dialog dialog = new Dialog(chatActivityEnterView.getContext(), R.style.TransparentDialogNoAnimation);
                    FrameLayout frameLayout = new FrameLayout(chatActivityEnterView.getContext());
                    frameLayout.addView(ht0Var2, mf.e(40, 40, 3));
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
                    org.telegram.messenger.g0.q3(dialog, k6.x0(null, k6.s8, true) == -1);
                    if (Build.VERSION.SDK_INT >= 26) {
                        org.telegram.messenger.g0.n3(dialog, org.telegram.messenger.g0.B(k6.x0(null, k6.a7, true)) >= 0.721f);
                    }
                    chatActivityEnterView.t0 = chatActivityEnterView.getRootWindowInsets().getSystemWindowInsetLeft() + chatActivityEnterView.t0;
                    chatActivityEnterView.q0.getLocationInWindow(iArr4);
                    float f11 = iArr4[0];
                    final float f12 = iArr4[1];
                    float L5 = org.telegram.messenger.g0.L(5.0f);
                    float L6 = iArr3[0] + chatActivityEnterView.t0 + L5 + org.telegram.messenger.g0.L(4.0f) + 0.0f;
                    float f13 = iArr3[1] + chatActivityEnterView.u0 + L5 + 0.0f;
                    ht0Var2.setTranslationX(L6);
                    ht0Var2.setTranslationY(f13);
                    float scaleX = (chatActivityEnterView.q0.getLayoutParams().width * (chatActivityEnterView.q5 ? chatActivityEnterView.q0.getScaleX() : 1.0f)) / org.telegram.messenger.g0.L(40.0f);
                    ht0Var2.setPivotX(0.0f);
                    ht0Var2.setPivotY(0.0f);
                    ht0Var2.setScaleX(0.75f);
                    ht0Var2.setScaleY(0.75f);
                    ht0Var2.getViewTreeObserver().addOnDrawListener(new me(ht0Var2, dn0Var));
                    dialog.show();
                    if (!chatActivityEnterView.q5) {
                        chatActivityEnterView.q0.setScaleX(1.0f);
                        chatActivityEnterView.q0.setScaleY(1.0f);
                    }
                    chatActivityEnterView.q0.setAlpha(1.0f);
                    le leVar = chatActivityEnterView.r0;
                    if (chatActivityEnterView.q5) {
                        ht0Var = ht0Var2;
                        gVar = null;
                    } else {
                        ht0Var = ht0Var2;
                        gVar = new q1.g(chatActivityEnterView.q0, bVar3);
                        gVar.m = org.telegram.ui.Cells.f1.s(0.5f, 750.0f, 1.0f);
                    }
                    if (chatActivityEnterView.q5) {
                        f10 = f11;
                        gVar2 = null;
                    } else {
                        f10 = f11;
                        q1.g gVar3 = new q1.g(chatActivityEnterView.q0, bVar2);
                        gVar3.m = org.telegram.ui.Cells.f1.s(0.5f, 750.0f, 1.0f);
                        gVar2 = gVar3;
                    }
                    q1.g gVar4 = new q1.g(chatActivityEnterView.q0, q1.g.v);
                    gVar4.m = org.telegram.ui.Cells.f1.s(0.0f, 750.0f, 1.0f);
                    final int i25 = 0;
                    q1.c cVar = new q1.c() { // from class: org.telegram.ui.Components.dd
                        @Override // q1.c
                        public final void a(q1.g gVar5, boolean z16, float f14, float f15) {
                            int i26 = i25;
                            float f16 = f12;
                            float f17 = f10;
                            ht0 ht0Var3 = ht0Var;
                            Dialog dialog2 = dialog;
                            ChatActivityEnterView chatActivityEnterView2 = chatActivityEnterView;
                            switch (i26) {
                                case 0:
                                    int i27 = ChatActivityEnterView.t5;
                                    if (dialog2.isShowing()) {
                                        ht0Var3.setTranslationX(f17);
                                        ht0Var3.setTranslationY(f16);
                                        fn0 fn0Var = chatActivityEnterView2.q0;
                                        fn0Var.getClass();
                                        fn0Var.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.q5) {
                                            chatActivityEnterView2.q0.setScaleX(1.0f);
                                            chatActivityEnterView2.q0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.q0.setAlpha(1.0f);
                                        chatActivityEnterView2.q0.getViewTreeObserver().addOnPreDrawListener(new ne(chatActivityEnterView2, dialog2, 0));
                                        break;
                                    }
                                    break;
                                default:
                                    int i28 = ChatActivityEnterView.t5;
                                    if (dialog2.isShowing()) {
                                        ht0Var3.setTranslationX(f17);
                                        ht0Var3.setTranslationY(f16);
                                        fn0 fn0Var2 = chatActivityEnterView2.q0;
                                        fn0Var2.getClass();
                                        fn0Var2.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.q5) {
                                            chatActivityEnterView2.q0.setScaleX(1.0f);
                                            chatActivityEnterView2.q0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.q0.setAlpha(1.0f);
                                        chatActivityEnterView2.q0.getViewTreeObserver().addOnPreDrawListener(new ne(chatActivityEnterView2, dialog2, 1));
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    ht0 ht0Var3 = ht0Var;
                    float f14 = f10;
                    gVar4.a(cVar);
                    q1.g gVar5 = new q1.g(ht0Var3, q1.g.o);
                    gVar5.b = be.a(L6, f14 - org.telegram.messenger.g0.L(6.0f), L6);
                    gVar5.c = true;
                    gVar5.m = org.telegram.ui.Cells.f1.s(f14, 700.0f, 0.75f);
                    gVar5.h = f14 - org.telegram.messenger.g0.L(6.0f);
                    q1.g gVar6 = new q1.g(ht0Var3, q1.g.p);
                    gVar6.b = be.a(f13, f13, org.telegram.messenger.g0.L(6.0f) + f12);
                    gVar6.c = true;
                    gVar6.m = org.telegram.ui.Cells.f1.s(f12, 700.0f, 0.75f);
                    gVar6.g = org.telegram.messenger.g0.L(6.0f) + f12;
                    gVar6.b(new pe(f12, ht0Var3));
                    final int i26 = 1;
                    gVar6.a(new q1.c() { // from class: org.telegram.ui.Components.dd
                        @Override // q1.c
                        public final void a(q1.g gVar52, boolean z16, float f142, float f15) {
                            int i262 = i26;
                            float f16 = f12;
                            float f17 = f10;
                            ht0 ht0Var32 = ht0Var;
                            Dialog dialog2 = dialog;
                            ChatActivityEnterView chatActivityEnterView2 = chatActivityEnterView;
                            switch (i262) {
                                case 0:
                                    int i27 = ChatActivityEnterView.t5;
                                    if (dialog2.isShowing()) {
                                        ht0Var32.setTranslationX(f17);
                                        ht0Var32.setTranslationY(f16);
                                        fn0 fn0Var = chatActivityEnterView2.q0;
                                        fn0Var.getClass();
                                        fn0Var.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.q5) {
                                            chatActivityEnterView2.q0.setScaleX(1.0f);
                                            chatActivityEnterView2.q0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.q0.setAlpha(1.0f);
                                        chatActivityEnterView2.q0.getViewTreeObserver().addOnPreDrawListener(new ne(chatActivityEnterView2, dialog2, 0));
                                        break;
                                    }
                                    break;
                                default:
                                    int i28 = ChatActivityEnterView.t5;
                                    if (dialog2.isShowing()) {
                                        ht0Var32.setTranslationX(f17);
                                        ht0Var32.setTranslationY(f16);
                                        fn0 fn0Var2 = chatActivityEnterView2.q0;
                                        fn0Var2.getClass();
                                        fn0Var2.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.q5) {
                                            chatActivityEnterView2.q0.setScaleX(1.0f);
                                            chatActivityEnterView2.q0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.q0.setAlpha(1.0f);
                                        chatActivityEnterView2.q0.getViewTreeObserver().addOnPreDrawListener(new ne(chatActivityEnterView2, dialog2, 1));
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    q1.g gVar7 = new q1.g(ht0Var3, bVar3);
                    gVar7.m = org.telegram.ui.Cells.f1.s(scaleX, 1000.0f, 1.0f);
                    q1.g gVar8 = new q1.g(ht0Var3, bVar2);
                    gVar8.m = org.telegram.ui.Cells.f1.s(scaleX, 1000.0f, 1.0f);
                    leVar.l(gVar, gVar2, gVar4, gVar5, gVar6, gVar7, gVar8);
                    break;
                }
                break;
            case 24:
                a();
                break;
            case 25:
                bx bxVar = (bx) this.b;
                org.telegram.ui.ActionBar.s1[] s1VarArr2 = (org.telegram.ui.ActionBar.s1[]) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                hi.d dVar = (hi.d) this.e;
                try {
                    s1VarArr2[0].dismiss();
                } catch (Throwable unused) {
                }
                s1VarArr2[0] = null;
                if (tLObject7 instanceof TLRPC.TL_emojiURL) {
                    sf.c.t(((ex) bxVar.c.b).G.getContext(), ((TLRPC.TL_emojiURL) tLObject7).url);
                    ((t2) dVar.b).y0.run();
                    break;
                }
                break;
            case 26:
                xx xxVar = (xx) this.b;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) this.c;
                TLObject tLObject8 = (TLObject) this.d;
                Runnable runnable = (Runnable) this.e;
                ArrayList arrayList8 = xxVar.s;
                yx yxVar = xxVar.x;
                if (yxVar.N == xxVar.b) {
                    yxVar.M = 0;
                    if (tL_messages_getStickers.emoticon.equals(xxVar.a)) {
                        if (!(tLObject8 instanceof TLRPC.TL_messages_stickers)) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject8;
                            int size2 = arrayList8.size();
                            int size3 = tL_messages_stickers.stickers.size();
                            for (int i27 = 0; i27 < size3; i27++) {
                                TLRPC.Document document2 = tL_messages_stickers.stickers.get(i27);
                                if (xxVar.w.indexOfKey(document2.id) < 0) {
                                    arrayList8.add(document2);
                                }
                            }
                            if (size2 != arrayList8.size()) {
                                xxVar.f.put(arrayList8, yxVar.O);
                                if (size2 == 0) {
                                    xxVar.h.add(arrayList8);
                                }
                            }
                        }
                    }
                    runnable.run();
                    break;
                }
                break;
            case 27:
                rz rzVar = (rz) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject9 = (TLObject) this.d;
                u10 u10Var = (u10) this.e;
                rzVar.s2 = -1;
                d2 d2Var2 = rzVar.p1;
                ez.x0(tL_error3, d2Var2, fc.a0(d2Var2));
                if (tLObject9 != null) {
                    if (tLObject9 instanceof TLRPC.Updates) {
                        TLRPC.Updates updates = (TLRPC.Updates) tLObject9;
                        ArrayList<TLRPC.Update> arrayList9 = updates.updates;
                        if (arrayList9.isEmpty()) {
                            TLRPC.Update update = updates.update;
                            if (update instanceof TL_update.TL_updateDialogFilter) {
                                i13 = ((TL_update.TL_updateDialogFilter) update).id;
                            }
                        } else {
                            int i28 = 0;
                            while (true) {
                                if (i28 < arrayList9.size()) {
                                    if (arrayList9.get(i28) instanceof TL_update.TL_updateDialogFilter) {
                                        i13 = ((TL_update.TL_updateDialogFilter) arrayList9.get(i28)).id;
                                    } else {
                                        i28++;
                                    }
                                }
                            }
                        }
                    }
                    if (rzVar.S1 instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        d2Var2.getMessagesController().c3(true, new g3(rzVar, u10Var, i13, i12));
                        break;
                    } else {
                        if (rzVar.T1 != null) {
                            d2Var2.getMessagesController().H(rzVar.R1, true);
                        }
                        rzVar.t2 = true;
                        rzVar.dismiss();
                        u10Var.a(Integer.valueOf(i13));
                        break;
                    }
                } else {
                    rzVar.e2.a(false);
                    break;
                }
            case 28:
                uw uwVar = (uw) this.b;
                Integer num = (Integer) this.c;
                ei eiVar = (ei) this.d;
                d2 d2Var3 = (d2) this.e;
                uwVar.I4(num.intValue());
                org.telegram.messenger.g0.i3(new cl(24, eiVar, d2Var3), 200L);
                break;
            default:
                d20 d20Var = (d20) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                TLObject tLObject10 = (TLObject) this.d;
                TLRPC.TL_channels_getParticipants tL_channels_getParticipants = (TLRPC.TL_channels_getParticipants) this.e;
                zu0 zu0Var = d20Var.r1;
                a0.h hVar4 = d20Var.S1;
                a0.h hVar5 = d20Var.T1;
                ArrayList arrayList10 = d20Var.P1;
                if (tL_error4 == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject10;
                    hp.s1(d20Var.a).Y3(tL_channels_channelParticipants.users, false);
                    hp.s1(d20Var.a).S3(tL_channels_channelParticipants.chats, false);
                    long e11 = h10.i(d20Var.a).e();
                    int i29 = 0;
                    while (true) {
                        if (i29 < tL_channels_channelParticipants.participants.size()) {
                            if (zi.C1(tL_channels_channelParticipants.participants.get(i29).peer) == e11) {
                                tL_channels_channelParticipants.participants.remove(i29);
                            } else {
                                i29++;
                            }
                        }
                    }
                    d20Var.M1--;
                    if (tL_channels_getParticipants.filter instanceof TLRPC.TL_channelParticipantsContacts) {
                        arrayList2 = d20Var.Q1;
                        hVar = hVar5;
                    } else {
                        hVar = hVar4;
                        arrayList2 = arrayList10;
                    }
                    arrayList2.clear();
                    arrayList2.addAll(tL_channels_channelParticipants.participants);
                    int size4 = tL_channels_channelParticipants.participants.size();
                    for (int i30 = 0; i30 < size4; i30++) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i30);
                        hVar.k(channelParticipant, zi.C1(channelParticipant.peer));
                    }
                    int size5 = arrayList10.size();
                    int i31 = 0;
                    while (i31 < size5) {
                        long C12 = zi.C1(((TLRPC.ChannelParticipant) arrayList10.get(i31)).peer);
                        boolean z16 = hVar5.f(C12) != null || ((hVar2 = d20Var.W1) != null && hVar2.h(C12) >= 0);
                        TLRPC.User a24 = hp.s1(d20Var.a).a2(Long.valueOf(C12));
                        if ((a24 != null && a24.bot) || l10.x(a24)) {
                            z16 = true;
                        }
                        if (z16) {
                            arrayList10.remove(i31);
                            hVar4.l(C12);
                            i31--;
                            size5--;
                        }
                        i31++;
                    }
                    try {
                        if (d20Var.O1.participants_count <= 200) {
                            Collections.sort(arrayList2, new qp(d20Var, ConnectionsManager.getInstance(d20Var.a).getCurrentTime(), i14));
                        }
                    } catch (Exception e12) {
                        a8.g(e12, true);
                    }
                }
                if (d20Var.M1 <= 0) {
                    d20Var.U1 = false;
                    d20Var.V1 = true;
                    if (d20Var.i2 == 1) {
                        b10 = 1;
                    } else {
                        sj0 sj0Var = d20Var.n1;
                        b10 = sj0Var != null ? sj0Var.b() - 1 : 0;
                    }
                    d20Var.O0(b10);
                    if (arrayList10.isEmpty()) {
                        d20Var.Z1 = true;
                        d20Var.R0();
                    }
                }
                d20Var.T0();
                sj0 sj0Var2 = d20Var.n1;
                if (sj0Var2 != null) {
                    sj0Var2.f();
                    if (zu0Var != null && d20Var.n1.b() == 0 && d20Var.V1) {
                        zu0Var.e(false, true);
                        break;
                    }
                }
                break;
        }
    }
}
