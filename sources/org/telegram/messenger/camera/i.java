package org.telegram.messenger.camera;

import ai.f0;
import ai.l0;
import ai.o0;
import ai.p0;
import ai.x2;
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
import bi.b1;
import bi.g5;
import bi.l5;
import c8.l9;
import c8.ma;
import c8.ra;
import di.o3;
import di.xb;
import hi.s6;
import hi.w4;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.gj;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.n5;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.t0;
import org.telegram.messenger.ur;
import org.telegram.messenger.v3;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.vq;
import org.telegram.messenger.w7;
import org.telegram.messenger.wp;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Cells.c0;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.af;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.g4;
import org.telegram.ui.Components.h2;
import org.telegram.ui.Components.h4;
import org.telegram.ui.Components.i00;
import org.telegram.ui.Components.l2;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.me;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.n0;
import org.telegram.ui.Components.n2;
import org.telegram.ui.Components.nf;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.ny;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.ou;
import org.telegram.ui.Components.oy;
import org.telegram.ui.Components.pn0;
import org.telegram.ui.Components.px;
import org.telegram.ui.Components.rf;
import org.telegram.ui.Components.rh;
import org.telegram.ui.Components.sx;
import org.telegram.ui.Components.tb0;
import org.telegram.ui.Components.tn;
import org.telegram.ui.Components.ut0;
import org.telegram.ui.Components.w3;
import org.telegram.ui.Components.xe;
import org.telegram.ui.Components.ye;
import org.telegram.ui.Components.z2;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a3;
import org.telegram.ui.bn;
import org.telegram.ui.cr;
import org.telegram.ui.cx;
import org.telegram.ui.i8;
import org.telegram.ui.kz;
import org.telegram.ui.la;
import org.telegram.ui.o6;
import org.telegram.ui.p6;
import org.telegram.ui.qq;
import org.telegram.ui.rq;
import org.telegram.ui.vo;
import org.telegram.ui.w0;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    private final void a() {
        me meVar;
        FrameLayout frameLayout;
        w3 w3Var;
        tn tnVar = (tn) this.c;
        Context context = (Context) this.b;
        View view = (View) this.d;
        h6 h6Var = (h6) this.e;
        long j3 = tnVar.W;
        final h2 h2Var = new h2(13, tnVar, view);
        me meVar2 = new me(3);
        int i7 = m6.j5;
        int i10 = h6Var != null ? h6Var.i(i7) : m6.x0(null, i7, false);
        int i11 = m6.h5;
        int i12 = h6Var != null ? h6Var.i(i11) : m6.x0(null, i11, false);
        int i13 = m6.Aj;
        if (h6Var != null) {
            h6Var.i(i13);
        } else {
            m6.x0(null, i13, false);
        }
        int i14 = m6.Ej;
        if (h6Var != null) {
            h6Var.i(i14);
        } else {
            m6.x0(null, i14, false);
        }
        int i15 = m6.E8;
        if (h6Var != null) {
            h6Var.i(i15);
        } else {
            m6.x0(null, i15, false);
        }
        int i16 = m6.G8;
        if (h6Var != null) {
            h6Var.i(i16);
        } else {
            m6.x0(null, i16, false);
        }
        int i17 = m6.i6;
        if (h6Var != null) {
            h6Var.i(i17);
        } else {
            m6.x0(null, i17, false);
        }
        int i18 = m6.Ji;
        int i19 = h6Var != null ? h6Var.i(i18) : m6.x0(null, i18, false);
        int i20 = m6.Fi;
        int i21 = h6Var != null ? h6Var.i(i20) : m6.x0(null, i20, false);
        int i22 = m6.Hi;
        if (h6Var != null) {
            h6Var.i(i22);
        } else {
            m6.x0(null, i22, false);
        }
        Pattern pattern = c5.a;
        if (context == null) {
            return;
        }
        final int n22 = (int) np.u1(k10.t0).A7.J.n2(TimeUnit.SECONDS);
        final w4 w4Var = new w4(context, h6Var);
        ((w2) w4Var.b).w0 = false;
        int i23 = i19;
        final tb0 tb0Var = new tb0(context, h6Var);
        tb0Var.setTextColor(i10);
        tb0Var.setTextOffset(g0.L(10.0f));
        tb0Var.setItemCount(5);
        int i24 = i21;
        final g4 g4Var = new g4(context, h6Var);
        g4Var.setWrapSelectorWheel(true);
        g4Var.setAllItemsCount(24);
        g4Var.setItemCount(5);
        g4Var.setTextColor(i10);
        g4Var.setTextOffset(-g0.L(10.0f));
        final h4 h4Var = new h4(context, h6Var);
        h4Var.setWrapSelectorWheel(true);
        h4Var.setAllItemsCount(60);
        h4Var.setItemCount(5);
        h4Var.setTextColor(i10);
        h4Var.setTextOffset(-g0.L(34.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        int i25 = i12;
        w3 w3Var2 = new w3(context, tb0Var, g4Var, h4Var, 3);
        w3Var2.setOrientation(1);
        frameLayout2.addView(w3Var2, ma.c(-1.0f, -1));
        frameLayout2.addView(new FrameLayout(context), ma.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        w3Var2.addView(frameLayout3, ma.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(hd.N0(2131744584, null));
        textView.setTextColor(i10);
        i5.c.x(textView, 1, 20.0f);
        frameLayout3.addView(textView, ma.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new gi.a(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        w3Var2.addView(linearLayout, ma.q(-1, -2, 1.0f, 0, 0, 23, 0, 23));
        final TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 12.0f);
        t6.U(textView2, m6.q5, h6Var);
        textView2.setGravity(17);
        final Calendar calendar = Calendar.getInstance();
        xb xbVar = new xb(context, 16);
        xbVar.setText(hd.N0(2131744585, null));
        ra.b(xbVar, 0.02f, 1.2f);
        linearLayout.addView(tb0Var, ma.l(0.5f, 0, ls.t4));
        tb0Var.setMinValue(0);
        tb0Var.setMaxValue(365);
        tb0Var.setWrapSelectorWheel(false);
        tb0Var.setFormatter(new cr(28));
        l5 l5Var = new l5(n22, tb0Var, g4Var, h4Var, textView2);
        tb0Var.setOnValueChangedListener(l5Var);
        g4Var.setMinValue(0);
        g4Var.setMaxValue(23);
        linearLayout.addView(g4Var, ma.l(0.2f, 0, ls.t4));
        g4Var.setFormatter(new cr(29));
        g4Var.setOnValueChangedListener(l5Var);
        h4Var.setMinValue(0);
        h4Var.setMaxValue(59);
        h4Var.setValue(0);
        h4Var.setFormatter(new l2(0));
        linearLayout.addView(h4Var, ma.l(0.3f, 0, ls.t4));
        h4Var.setOnValueChangedListener(l5Var);
        if (j3 <= 0 || j3 == 2147483646) {
            meVar = meVar2;
            frameLayout = frameLayout2;
            w3Var = w3Var2;
        } else {
            long j10 = 1000 * j3;
            meVar = meVar2;
            frameLayout = frameLayout2;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            w3Var = w3Var2;
            int timeInMillis = (int) ((j10 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j10);
            if (timeInMillis >= 0) {
                h4Var.setValue(calendar.get(12));
                g4Var.setValue(calendar.get(11));
                tb0Var.setValue(timeInMillis);
            }
        }
        final boolean[] zArr = {true};
        c5.g(null, null, 0L, n22, 3, tb0Var, g4Var, h4Var);
        c5.e(textView2, tb0Var, g4Var, h4Var);
        xbVar.setPadding(g0.L(34.0f), 0, g0.L(34.0f), 0);
        xbVar.setGravity(17);
        xbVar.setTextColor(i23);
        xbVar.setTextSize(1, 14.0f);
        xbVar.setTypeface(g0.o());
        xbVar.setBackground(a6.e(i24, 24.0f));
        w3 w3Var3 = w3Var;
        w3Var3.addView(xbVar, ma.t(-1, 48, 83, 14, 15, 14, 16));
        xbVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.m2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                zArr[0] = false;
                long j11 = n22;
                tb0 tb0Var2 = tb0Var;
                g4 g4Var2 = g4Var;
                h4 h4Var2 = h4Var;
                boolean g10 = c5.g(null, null, 0L, j11, 3, tb0Var2, g4Var2, h4Var2);
                c5.e(textView2, tb0Var2, g4Var2, h4Var2);
                long currentTimeMillis = System.currentTimeMillis();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(currentTimeMillis);
                calendar2.add(6, tb0Var2.getValue());
                calendar2.set(11, g4Var2.getValue());
                calendar2.set(12, h4Var2.getValue());
                if (g10) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                h2Var.O((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                ((org.telegram.ui.ActionBar.w2) w4Var.b).y0.run();
            }
        });
        w3Var3.addView(textView2, ma.t(-1, -2, 83, 14, 0, 14, 16));
        w2 w2Var = (w2) w4Var.b;
        w2Var.O = frameLayout;
        w2Var.show();
        w2Var.setOnDismissListener(new n2(0, meVar, zArr));
        w2Var.v0(i25);
        w2Var.P(i25);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0c33  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        boolean z11;
        boolean z12;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i7;
        TLRPC.User user;
        Throwable th2;
        TLRPC.TL_webPage tL_webPage;
        ArrayList arrayList;
        qq qqVar;
        long B1;
        int i10;
        rq rqVar;
        String[] strArr;
        String lowerCase;
        boolean z13;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z14;
        r1.g gVar;
        final ut0 ut0Var;
        final float f10;
        r1.g gVar2;
        int i11 = 5;
        int i12 = 3;
        int i13 = -1;
        int i14 = 2;
        int i15 = 0;
        switch (this.a) {
            case 0:
                CameraController.lambda$openRound$9((CameraSession) this.c, (Runnable) this.b, (SurfaceTexture) this.e, (Runnable) this.d);
                break;
            case 1:
                CameraController.lambda$close$5((Runnable) this.b, (CameraSession) this.c, (CountDownLatch) this.e, (Runnable) this.d);
                break;
            case 2:
                ((VideoAds) this.c).lambda$show$14((Context) this.b, (TLRPC.TL_sponsoredMessage) this.d, (a70) this.e);
                break;
            case 3:
                TLObject tLObject = (TLObject) this.c;
                j6 j6Var = (j6) this.b;
                l6 l6Var = (l6) this.d;
                TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) this.e;
                m6.A--;
                if (tLObject instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme2 = (TLRPC.TL_theme) tLObject;
                    TLRPC.ThemeSettings themeSettings = tL_theme2.settings.size() > 0 ? tL_theme2.settings.get(0) : null;
                    if (j6Var == null || themeSettings == null) {
                        TLRPC.Document document = tL_theme2.document;
                        if (document != null && document.id != tL_theme.document.id) {
                            if (j6Var != null) {
                                j6Var.r = tL_theme2;
                                z11 = true;
                            } else {
                                l6Var.G = tL_theme2;
                                l6Var.H = false;
                                l6Var.h0 = null;
                                l6Var.i0 = null;
                                ls.f(l6Var.F).b(l6Var, ls.Y1);
                                ls.f(l6Var.F).b(l6Var, ls.Z1);
                                w7 G = w7.G(l6Var.F);
                                TLRPC.TL_theme tL_theme3 = l6Var.G;
                                z11 = true;
                                G.W(tL_theme3.document, tL_theme3, 1, 1);
                            }
                            z10 = z11;
                        }
                    } else {
                        if (l6.a(j6Var, themeSettings)) {
                            z12 = false;
                        } else {
                            File e10 = j6Var.e();
                            if (e10 != null) {
                                e10.delete();
                            }
                            l6.i(j6Var, themeSettings);
                            l6 l6Var2 = m6.I;
                            if (l6Var2 == l6Var && l6Var2.Z == j6Var.a) {
                                m6.t1(false, false);
                                m6.K(t0.b, false);
                                l6 l6Var3 = m6.I;
                                m6.K1(l6Var3, m6.J == l6Var3, -1, null);
                            }
                            g6.a(true);
                            z12 = true;
                        }
                        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                        j6Var.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                        z10 = z12;
                    }
                    if (m6.A != 0) {
                        m6.B = (int) (System.currentTimeMillis() / 1000);
                        m6.y1(z10, false);
                        break;
                    }
                }
                z10 = false;
                if (m6.A != 0) {
                }
                break;
            case 4:
                ((g5) this.c).a(m6.T0((File) this.b, (String) this.d, (String[]) this.e));
                break;
            case 5:
                p6 p6Var = (p6) this.c;
                l0 l0Var = (l0) this.b;
                float[] fArr = (float[]) this.d;
                boolean[] zArr = (boolean[]) this.e;
                p6Var.getClass();
                l0Var.f(fArr[0]);
                if (zArr[0]) {
                    p6Var.d.A0(true);
                    break;
                }
                break;
            case 6:
                p6 p6Var2 = (p6) this.c;
                boolean[] zArr2 = (boolean[]) this.b;
                long[] jArr = (long[]) this.d;
                o6 o6Var = (o6) this.e;
                if (!zArr2[0]) {
                    jArr[0] = System.currentTimeMillis();
                    p6Var2.d.showDialog(o6Var);
                    break;
                }
                break;
            case 7:
                i8.Z((i8) this.c, (TLRPC.TL_error) this.b, (TLObject) this.d, (Calendar) this.e);
                break;
            case 8:
                la.Z((la) this.c, (t1) this.b, (TLRPC.TL_error) this.d, (TL_account.updateUsername) this.e);
                break;
            case 9:
                bn bnVar = (bn) this.c;
                g2 g2Var = (g2) this.b;
                gj gjVar = (gj) this.d;
                r4 r4Var = (r4) this.e;
                if (g2Var instanceof gs) {
                    i7 = 4;
                    bnVar.getNotificationCenter().n((gs) g2Var, 4);
                } else {
                    i7 = 4;
                }
                bnVar.getNotificationCenter().k(i7, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", gjVar.k.action.channel_id);
                ((ActionBarLayout) r4Var).c(r4Var.getFragmentStack().size() - 1, new bn(bundle));
                g2Var.finishFragment();
                break;
            case 10:
                bn bnVar2 = (bn) this.c;
                vf.b bVar = (vf.b) this.b;
                TLObject tLObject2 = (TLObject) this.d;
                di.n2 n2Var = (di.n2) this.e;
                bVar.b();
                if (tLObject2 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                    bnVar2.getMessagesController().f4(tL_contacts_resolvedPeer.users, false);
                    bnVar2.getMessagesController().Z3(tL_contacts_resolvedPeer.chats, false);
                    long o4 = n5.o(tL_contacts_resolvedPeer.peer);
                    if (o4 >= 0) {
                        user = bnVar2.getMessagesController().c2(Long.valueOf(o4));
                        n2Var.a(user);
                        break;
                    }
                }
                user = null;
                n2Var.a(user);
            case 11:
                long[] jArr2 = (long[]) this.c;
                boolean[] zArr3 = (boolean[]) this.b;
                ImageView imageView = (ImageView) this.d;
                ImageView imageView2 = (ImageView) this.e;
                jArr2[0] = SystemClock.elapsedRealtime();
                if (!zArr3[0]) {
                    imageView = imageView2;
                }
                mr mrVar = (mr) imageView.getDrawable();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a3(mrVar, 4));
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(nr.f);
                ofFloat.start();
                break;
            case 12:
                bn bnVar3 = (bn) this.c;
                gj gjVar2 = (gj) this.b;
                t1 t1Var = (t1) this.d;
                boolean[] zArr4 = (boolean[]) this.e;
                try {
                    tL_webPage = d90.g(gjVar2);
                    th2 = null;
                } catch (Throwable th3) {
                    a8.g(th3, true);
                    th2 = th3;
                    tL_webPage = null;
                }
                g0.g3(new o3(bnVar3, t1Var, zArr4, th2 == null && tL_webPage != null, gjVar2, tL_webPage));
                break;
            case 13:
                bn bnVar4 = (bn) this.c;
                TLObject tLObject3 = (TLObject) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                ur urVar = (ur) this.e;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                if (tL_error != null || messages_messages.messages.isEmpty()) {
                    if (messages_messages != null) {
                        bnVar4.D6 = messages_messages.count;
                    } else {
                        bnVar4.D6 = 0;
                    }
                    urVar.a.c(new vq(urVar, bnVar4.d(), bnVar4.l6, bnVar4.D6, 7));
                    int i16 = bnVar4.D6;
                    if (i16 == 0) {
                        bnVar4.E6 = true;
                        bnVar4.rc(false);
                        break;
                    } else {
                        bnVar4.y1.c(2, i16, true);
                        bnVar4.ka();
                        break;
                    }
                } else {
                    int i17 = messages_messages.messages.get(0).id;
                    gj gjVar3 = (gj) bnVar4.G6[0].get(i17);
                    urVar.a.c(new wp(urVar, i17, bnVar4.l6, 4));
                    if (gjVar3 != null) {
                        TLRPC.Message message = gjVar3.k;
                        message.media_unread = true;
                        message.mentioned = true;
                    }
                    bnVar4.l(i17, 0, false, 0, true, 0);
                    break;
                }
                break;
            case 14:
                bn.T0((bn) this.c, (TLRPC.TL_messageMediaWebPage) this.b, (TLRPC.TL_webPageAttributeStory) this.d, (org.telegram.ui.m6) this.e);
                break;
            case 15:
                vo.b0((vo) this.c, (t1[]) this.b, (TLRPC.Chat) this.d, (g2) this.e);
                break;
            case 16:
                org.telegram.ui.np npVar = (org.telegram.ui.np) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                TLObject tLObject4 = (TLObject) this.d;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.e;
                npVar.getClass();
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject4;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.r0(password);
                    npVar.u0(twoStepVerificationActivity.q0(), twoStepVerificationActivity);
                    break;
                }
                break;
            case 17:
                rq rqVar2 = (rq) this.c;
                TLObject tLObject5 = (TLObject) this.b;
                TLRPC.User user2 = (TLRPC.User) this.d;
                org.telegram.ui.wp wpVar = (org.telegram.ui.wp) this.e;
                if (!(tLObject5 instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject5 instanceof TLRPC.TL_chatParticipantAdmin)) {
                    wpVar.a(1);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rqVar2.getParentActivity());
                    alertDialog$Builder.a.S = hd.N0(R.string.AppName, "AppName");
                    alertDialog$Builder.a.U = hd.a0(null, null, 2131754347, p10.q(user2));
                    alertDialog$Builder.k(hd.N0(2131747637, "OK"), new w0(wpVar, 26));
                    alertDialog$Builder.h(hd.N0(2131752577, "Cancel"), null);
                    rqVar2.showDialog(alertDialog$Builder.a);
                    break;
                }
                break;
            case 18:
                qq qqVar2 = (qq) this.c;
                String str5 = (String) this.b;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                rq rqVar3 = qqVar2.E;
                String lowerCase2 = str5.trim().toLowerCase();
                if (lowerCase2.length() == 0) {
                    g0.g3(new wn(qqVar2, new ArrayList(), new a0.h(), new ArrayList(), new ArrayList(), 2));
                    break;
                } else {
                    String T0 = hd.E0().T0(lowerCase2, true, false);
                    if (lowerCase2.equals(T0) || T0.length() == 0) {
                        T0 = null;
                    }
                    int i18 = (T0 != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i18];
                    strArr2[0] = lowerCase2;
                    if (T0 != null) {
                        strArr2[1] = T0;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    a0.h hVar = new a0.h();
                    ArrayList arrayList5 = new ArrayList();
                    rq rqVar4 = rqVar3;
                    ArrayList arrayList6 = new ArrayList();
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        int i19 = 0;
                        while (i19 < size) {
                            TLObject tLObject6 = (TLObject) arrayList2.get(i19);
                            int i20 = i19;
                            if (tLObject6 instanceof TLRPC.ChatParticipant) {
                                arrayList = arrayList2;
                                qqVar = qqVar2;
                                B1 = ((TLRPC.ChatParticipant) tLObject6).user_id;
                            } else {
                                arrayList = arrayList2;
                                qqVar = qqVar2;
                                if (tLObject6 instanceof TLRPC.ChannelParticipant) {
                                    B1 = gj.B1(((TLRPC.ChannelParticipant) tLObject6).peer);
                                }
                                strArr = strArr2;
                                rqVar = rqVar4;
                                i10 = size;
                                i19 = i20 + 1;
                                arrayList2 = arrayList;
                                qqVar2 = qqVar;
                                strArr2 = strArr;
                                rqVar4 = rqVar;
                                size = i10;
                            }
                            if (B1 > 0) {
                                TLRPC.User c22 = rqVar4.getMessagesController().c2(Long.valueOf(B1));
                                if (c22.id != rqVar4.getUserConfig().e()) {
                                    String lowerCase3 = p10.q(c22).toLowerCase();
                                    String o10 = p10.o(c22);
                                    String str6 = c22.first_name;
                                    rqVar = rqVar4;
                                    str3 = c22.last_name;
                                    str = str6;
                                    lowerCase = lowerCase3;
                                    strArr = strArr2;
                                    str2 = o10;
                                    z13 = false;
                                }
                                strArr = strArr2;
                                rqVar = rqVar4;
                                i10 = size;
                                i19 = i20 + 1;
                                arrayList2 = arrayList;
                                qqVar2 = qqVar;
                                strArr2 = strArr;
                                rqVar4 = rqVar;
                                size = i10;
                            } else {
                                TLRPC.Chat O0 = rqVar4.getMessagesController().O0(Long.valueOf(-B1));
                                lowerCase = O0.title.toLowerCase();
                                z13 = false;
                                String K = v3.K(O0, false);
                                str = O0.title;
                                strArr = strArr2;
                                str2 = K;
                                rqVar = rqVar4;
                                str3 = null;
                            }
                            i10 = size;
                            String T02 = hd.E0().T0(lowerCase, true, z13);
                            if (lowerCase.equals(T02)) {
                                T02 = null;
                            }
                            boolean z15 = false;
                            int i21 = 0;
                            while (true) {
                                if (i21 < i18) {
                                    boolean z16 = z15;
                                    String str7 = strArr[i21];
                                    if (lowerCase.startsWith(str7) || i5.c.B(" ", str7, lowerCase) || (T02 != null && (T02.startsWith(str7) || i5.c.B(" ", str7, T02)))) {
                                        str4 = lowerCase;
                                        z14 = true;
                                    } else if (str2 == null || !str2.startsWith(str7)) {
                                        str4 = lowerCase;
                                        z14 = z16;
                                    } else {
                                        str4 = lowerCase;
                                        z14 = 2;
                                    }
                                    if (z14) {
                                        if (z14) {
                                            arrayList5.add(g0.r0(str, str3, str7));
                                        } else {
                                            arrayList5.add(g0.r0(p5.c.k("@", str2), null, "@" + str7));
                                        }
                                        arrayList6.add(tLObject6);
                                    } else {
                                        i21++;
                                        z15 = z14;
                                        lowerCase = str4;
                                    }
                                }
                            }
                            i19 = i20 + 1;
                            arrayList2 = arrayList;
                            qqVar2 = qqVar;
                            strArr2 = strArr;
                            rqVar4 = rqVar;
                            size = i10;
                        }
                    }
                    qq qqVar3 = qqVar2;
                    String[] strArr3 = strArr2;
                    rq rqVar5 = rqVar4;
                    if (arrayList3 != null) {
                        for (int i22 = 0; i22 < arrayList3.size(); i22++) {
                            TLRPC.User c23 = rqVar5.getMessagesController().c2(Long.valueOf(((TLRPC.TL_contact) arrayList3.get(i22)).user_id));
                            if (c23.id != rqVar5.getUserConfig().e()) {
                                String lowerCase4 = p10.q(c23).toLowerCase();
                                String T03 = hd.E0().T0(lowerCase4, true, false);
                                if (lowerCase4.equals(T03)) {
                                    T03 = null;
                                }
                                boolean z17 = false;
                                int i23 = 0;
                                while (true) {
                                    if (i23 < i18) {
                                        String str8 = strArr3[i23];
                                        if (lowerCase4.startsWith(str8) || i5.c.B(" ", str8, lowerCase4) || (T03 != null && (T03.startsWith(str8) || i5.c.B(" ", str8, T03)))) {
                                            z17 = true;
                                        } else {
                                            String o11 = p10.o(c23);
                                            if (o11 != null && o11.startsWith(str8)) {
                                                z17 = 2;
                                            }
                                        }
                                        if (z17) {
                                            if (z17) {
                                                arrayList5.add(g0.r0(c23.first_name, c23.last_name, str8));
                                            } else {
                                                arrayList5.add(g0.r0("@" + p10.o(c23), null, "@" + str8));
                                            }
                                            arrayList4.add(c23);
                                            hVar.k(c23, c23.id);
                                        } else {
                                            i23++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    g0.g3(new wn(qqVar3, arrayList4, hVar, arrayList5, arrayList6, 2));
                    break;
                }
                break;
            case 19:
                n0 n0Var = (n0) this.c;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.b;
                Context context = (Context) this.d;
                h6 h6Var = (h6) this.e;
                String str9 = "https://t.me/addstyle/" + tL_aiComposeTone.slug;
                new org.telegram.ui.Components.q(n0Var, context, str9, str9, h6Var).show();
                break;
            case 20:
                b5 b5Var = (b5) this.c;
                x2 x2Var = (x2) this.b;
                t1[] t1VarArr = (t1[]) this.d;
                View view = (View) this.e;
                String trim = b5Var.getText().toString().trim();
                Uri parse = Uri.parse(trim);
                if (parse == null || parse.getHost() == null) {
                    parse = Uri.parse("https://" + trim);
                }
                if (parse != null && parse.getHost() != null) {
                    String lowerCase5 = parse.getHost().toLowerCase();
                    if (lowerCase5.startsWith("www.")) {
                        lowerCase5 = lowerCase5.substring(4);
                    }
                    x2Var.a(lowerCase5);
                    t1 t1Var2 = t1VarArr[0];
                    if (t1Var2 != null) {
                        t1Var2.dismiss();
                    }
                    if (view != null) {
                        view.requestFocus();
                        break;
                    }
                } else {
                    g0.D3(b5Var);
                    break;
                }
                break;
            case 21:
                int[] iArr = (int[]) this.c;
                int[] iArr2 = (int[]) this.b;
                String[] strArr4 = (String[]) this.d;
                TextView textView = (TextView) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) hd.N0(2131748313, null));
                spannableStringBuilder.append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                int i24 = 0;
                while (true) {
                    if (i24 < iArr.length) {
                        if (iArr2[0] == iArr[i24]) {
                            spannableStringBuilder.append((CharSequence) strArr4[i24]);
                            spannableStringBuilder.setSpan(new l41(g0.o()), length, spannableStringBuilder.length(), 33);
                        } else {
                            i24++;
                        }
                    }
                }
                spannableStringBuilder.append((CharSequence) " v");
                if (k10.i(k10.t0).q()) {
                    nq nqVar = new nq(R.drawable.arrows_select, 0);
                    nqVar.H = 0.7f;
                    float L = g0.L(-1.33f);
                    float L2 = g0.L(0.0f);
                    nqVar.r = L;
                    nqVar.s = L2;
                    nqVar.x = 0.75f;
                    spannableStringBuilder.setSpan(nqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                } else {
                    nq nqVar2 = new nq(R.drawable.mini_switch_lock, 0);
                    nqVar2.H = 0.7f;
                    float L3 = g0.L(-1.33f);
                    float L4 = g0.L(0.0f);
                    nqVar2.r = L3;
                    nqVar2.s = L4;
                    nqVar2.x = 0.75f;
                    spannableStringBuilder.setSpan(nqVar2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                }
                textView.setText(spannableStringBuilder);
                break;
            case 22:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                Boolean bool = (Boolean) this.b;
                Integer num = (Integer) this.d;
                Integer num2 = (Integer) this.e;
                int i25 = ChatActivityEnterView.s7;
                chatActivityEnterView.getClass();
                chatActivityEnterView.w1(bool.booleanValue(), num.intValue(), num2.intValue(), 0L, true);
                break;
            case 23:
                final ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.c;
                ut0 ut0Var2 = (ut0) this.b;
                int[] iArr3 = (int[]) this.d;
                pn0 pn0Var = (pn0) this.e;
                r1.b bVar2 = r1.g.r;
                r1.b bVar3 = r1.g.q;
                int[] iArr4 = chatActivityEnterView2.D3;
                if (chatActivityEnterView2.r0 != null) {
                    final Dialog dialog = new Dialog(chatActivityEnterView2.getContext(), R.style.TransparentDialogNoAnimation);
                    FrameLayout frameLayout = new FrameLayout(chatActivityEnterView2.getContext());
                    frameLayout.addView(ut0Var2, ma.e(40, 40, 3));
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
                    g0.p3(dialog, m6.x0(null, m6.s8, true) == -1);
                    if (Build.VERSION.SDK_INT >= 26) {
                        g0.m3(dialog, g0.B(m6.x0(null, m6.a7, true)) >= 0.721f);
                    }
                    chatActivityEnterView2.t0 = chatActivityEnterView2.getRootWindowInsets().getSystemWindowInsetLeft() + chatActivityEnterView2.t0;
                    chatActivityEnterView2.q0.getLocationInWindow(iArr4);
                    float f11 = iArr4[0];
                    final float f12 = iArr4[1];
                    float L5 = g0.L(5.0f);
                    float L6 = iArr3[0] + chatActivityEnterView2.t0 + L5 + g0.L(4.0f) + 0.0f;
                    float f13 = iArr3[1] + chatActivityEnterView2.u0 + L5 + 0.0f;
                    ut0Var2.setTranslationX(L6);
                    ut0Var2.setTranslationY(f13);
                    float scaleX = (chatActivityEnterView2.q0.getLayoutParams().width * (chatActivityEnterView2.p7 ? chatActivityEnterView2.q0.getScaleX() : 1.0f)) / g0.L(40.0f);
                    ut0Var2.setPivotX(0.0f);
                    ut0Var2.setPivotY(0.0f);
                    ut0Var2.setScaleX(0.75f);
                    ut0Var2.setScaleY(0.75f);
                    ut0Var2.getViewTreeObserver().addOnDrawListener(new ye(ut0Var2, pn0Var));
                    dialog.show();
                    if (!chatActivityEnterView2.p7) {
                        chatActivityEnterView2.q0.setScaleX(1.0f);
                        chatActivityEnterView2.q0.setScaleY(1.0f);
                    }
                    chatActivityEnterView2.q0.setAlpha(1.0f);
                    xe xeVar = chatActivityEnterView2.r0;
                    if (chatActivityEnterView2.p7) {
                        ut0Var = ut0Var2;
                        gVar = null;
                    } else {
                        ut0Var = ut0Var2;
                        gVar = new r1.g(chatActivityEnterView2.q0, bVar3);
                        gVar.m = c0.p(0.5f, 750.0f, 1.0f);
                    }
                    if (chatActivityEnterView2.p7) {
                        f10 = f11;
                        gVar2 = null;
                    } else {
                        f10 = f11;
                        r1.g gVar3 = new r1.g(chatActivityEnterView2.q0, bVar2);
                        gVar3.m = c0.p(0.5f, 750.0f, 1.0f);
                        gVar2 = gVar3;
                    }
                    r1.g gVar4 = new r1.g(chatActivityEnterView2.q0, r1.g.v);
                    gVar4.m = c0.p(0.0f, 750.0f, 1.0f);
                    final int i26 = 0;
                    r1.c cVar = new r1.c() { // from class: org.telegram.ui.Components.md
                        @Override // r1.c
                        public final void a(r1.g gVar5, boolean z18, float f14, float f15) {
                            int i27 = i26;
                            float f16 = f12;
                            float f17 = f10;
                            ut0 ut0Var3 = ut0Var;
                            Dialog dialog2 = dialog;
                            ChatActivityEnterView chatActivityEnterView3 = chatActivityEnterView2;
                            switch (i27) {
                                case 0:
                                    int i28 = ChatActivityEnterView.s7;
                                    if (dialog2.isShowing()) {
                                        ut0Var3.setTranslationX(f17);
                                        ut0Var3.setTranslationY(f16);
                                        rn0 rn0Var = chatActivityEnterView3.q0;
                                        rn0Var.getClass();
                                        rn0Var.a(false, false, 0.0f);
                                        if (!chatActivityEnterView3.p7) {
                                            chatActivityEnterView3.q0.setScaleX(1.0f);
                                            chatActivityEnterView3.q0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView3.q0.setAlpha(1.0f);
                                        chatActivityEnterView3.q0.getViewTreeObserver().addOnPreDrawListener(new ze(chatActivityEnterView3, dialog2, 0));
                                        break;
                                    }
                                    break;
                                default:
                                    int i29 = ChatActivityEnterView.s7;
                                    if (dialog2.isShowing()) {
                                        ut0Var3.setTranslationX(f17);
                                        ut0Var3.setTranslationY(f16);
                                        rn0 rn0Var2 = chatActivityEnterView3.q0;
                                        rn0Var2.getClass();
                                        rn0Var2.a(false, false, 0.0f);
                                        if (!chatActivityEnterView3.p7) {
                                            chatActivityEnterView3.q0.setScaleX(1.0f);
                                            chatActivityEnterView3.q0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView3.q0.setAlpha(1.0f);
                                        chatActivityEnterView3.q0.getViewTreeObserver().addOnPreDrawListener(new ze(chatActivityEnterView3, dialog2, 1));
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    ut0 ut0Var3 = ut0Var;
                    float f14 = f10;
                    gVar4.a(cVar);
                    r1.g gVar5 = new r1.g(ut0Var3, r1.g.o);
                    gVar5.b = l9.a(L6, f14 - g0.L(6.0f), L6);
                    gVar5.c = true;
                    gVar5.m = c0.p(f14, 700.0f, 0.75f);
                    gVar5.h = f14 - g0.L(6.0f);
                    r1.g gVar6 = new r1.g(ut0Var3, r1.g.p);
                    gVar6.b = l9.a(f13, f13, g0.L(6.0f) + f12);
                    gVar6.c = true;
                    gVar6.m = c0.p(f12, 700.0f, 0.75f);
                    gVar6.g = g0.L(6.0f) + f12;
                    gVar6.b(new af(f12, ut0Var3));
                    final int i27 = 1;
                    gVar6.a(new r1.c() { // from class: org.telegram.ui.Components.md
                        @Override // r1.c
                        public final void a(r1.g gVar52, boolean z18, float f142, float f15) {
                            int i272 = i27;
                            float f16 = f12;
                            float f17 = f10;
                            ut0 ut0Var32 = ut0Var;
                            Dialog dialog2 = dialog;
                            ChatActivityEnterView chatActivityEnterView3 = chatActivityEnterView2;
                            switch (i272) {
                                case 0:
                                    int i28 = ChatActivityEnterView.s7;
                                    if (dialog2.isShowing()) {
                                        ut0Var32.setTranslationX(f17);
                                        ut0Var32.setTranslationY(f16);
                                        rn0 rn0Var = chatActivityEnterView3.q0;
                                        rn0Var.getClass();
                                        rn0Var.a(false, false, 0.0f);
                                        if (!chatActivityEnterView3.p7) {
                                            chatActivityEnterView3.q0.setScaleX(1.0f);
                                            chatActivityEnterView3.q0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView3.q0.setAlpha(1.0f);
                                        chatActivityEnterView3.q0.getViewTreeObserver().addOnPreDrawListener(new ze(chatActivityEnterView3, dialog2, 0));
                                        break;
                                    }
                                    break;
                                default:
                                    int i29 = ChatActivityEnterView.s7;
                                    if (dialog2.isShowing()) {
                                        ut0Var32.setTranslationX(f17);
                                        ut0Var32.setTranslationY(f16);
                                        rn0 rn0Var2 = chatActivityEnterView3.q0;
                                        rn0Var2.getClass();
                                        rn0Var2.a(false, false, 0.0f);
                                        if (!chatActivityEnterView3.p7) {
                                            chatActivityEnterView3.q0.setScaleX(1.0f);
                                            chatActivityEnterView3.q0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView3.q0.setAlpha(1.0f);
                                        chatActivityEnterView3.q0.getViewTreeObserver().addOnPreDrawListener(new ze(chatActivityEnterView3, dialog2, 1));
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    r1.g gVar7 = new r1.g(ut0Var3, bVar3);
                    gVar7.m = c0.p(scaleX, 1000.0f, 1.0f);
                    r1.g gVar8 = new r1.g(ut0Var3, bVar2);
                    gVar8.m = c0.p(scaleX, 1000.0f, 1.0f);
                    xeVar.l(gVar, gVar2, gVar4, gVar5, gVar6, gVar7, gVar8);
                    break;
                }
                break;
            case 24:
                rf rfVar = (rf) this.c;
                FrameLayout frameLayout2 = (FrameLayout) this.b;
                View view2 = (View) this.d;
                s6 s6Var = (s6) this.e;
                ChatActivityEnterView chatActivityEnterView3 = rfVar.a;
                int i28 = ChatActivityEnterView.s7;
                p0 A0 = chatActivityEnterView3.A0();
                nf nfVar = new nf(rfVar, frameLayout2, i15);
                z2 z2Var = new z2(s6Var, i12);
                of ofVar = new of(i15, frameLayout2);
                A0.j();
                Context context2 = A0.h;
                h6 h6Var2 = A0.n;
                b1 b1Var = new b1(context2, view2, h6Var2, nfVar);
                int[] iArr5 = new int[2];
                view2.getLocationInWindow(iArr5);
                b1Var.T = iArr5[1] > g0.q.y / 2;
                b1Var.M = g0.L(ls.x3);
                b1Var.L = 0;
                b1Var.n = g0.L(ls.P4);
                int w02 = m6.w0(m6.G6, h6Var2);
                ArrayList J = A0.J();
                int size2 = J.size();
                while (i15 < size2) {
                    Object obj = J.get(i15);
                    i15++;
                    ai.g gVar9 = (ai.g) obj;
                    b1Var.a(new o0(A0.h, gVar9, w02, A0.f.a.R, false), 44, new a1.e(15, z2Var, gVar9));
                }
                b1Var.setFocusableInTouchMode(true);
                b1Var.setOnKeyListener(new f0(i14, b1Var));
                b1Var.R = ofVar;
                frameLayout2.addView(b1Var, new FrameLayout.LayoutParams(-1, -1));
                b1Var.requestFocus();
                b1Var.f();
                break;
            case 25:
                a();
                break;
            case 26:
                px pxVar = (px) this.c;
                t1[] t1VarArr2 = (t1[]) this.b;
                TLObject tLObject7 = (TLObject) this.d;
                w4 w4Var = (w4) this.e;
                try {
                    t1VarArr2[0].dismiss();
                } catch (Throwable unused) {
                }
                t1VarArr2[0] = null;
                if (tLObject7 instanceof TLRPC.TL_emojiURL) {
                    vf.c.t(((sx) pxVar.c.b).G.getContext(), ((TLRPC.TL_emojiURL) tLObject7).url);
                    ((w2) w4Var.b).y0.run();
                    break;
                }
                break;
            case 27:
                ny nyVar = (ny) this.c;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) this.d;
                TLObject tLObject8 = (TLObject) this.e;
                Runnable runnable = (Runnable) this.b;
                ArrayList arrayList7 = nyVar.s;
                oy oyVar = nyVar.x;
                if (oyVar.N == nyVar.b) {
                    oyVar.M = 0;
                    if (tL_messages_getStickers.emoticon.equals(nyVar.a)) {
                        if (!(tLObject8 instanceof TLRPC.TL_messages_stickers)) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject8;
                            int size3 = arrayList7.size();
                            int size4 = tL_messages_stickers.stickers.size();
                            while (i15 < size4) {
                                TLRPC.Document document2 = tL_messages_stickers.stickers.get(i15);
                                if (nyVar.w.indexOfKey(document2.id) < 0) {
                                    arrayList7.add(document2);
                                }
                                i15++;
                            }
                            if (size3 != arrayList7.size()) {
                                nyVar.f.put(arrayList7, oyVar.O);
                                if (size3 == 0) {
                                    nyVar.h.add(arrayList7);
                                }
                            }
                        }
                    }
                    runnable.run();
                    break;
                }
                break;
            case 28:
                i00 i00Var = (i00) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.b;
                TLObject tLObject9 = (TLObject) this.d;
                y10 y10Var = (y10) this.e;
                i00Var.v2 = -1;
                g2 g2Var2 = i00Var.s1;
                kz.x0(tL_error3, g2Var2, lc.b0(g2Var2));
                if (tLObject9 != null) {
                    if (tLObject9 instanceof TLRPC.Updates) {
                        TLRPC.Updates updates = (TLRPC.Updates) tLObject9;
                        ArrayList<TLRPC.Update> arrayList8 = updates.updates;
                        if (arrayList8.isEmpty()) {
                            TLRPC.Update update = updates.update;
                            if (update instanceof TL_update.TL_updateDialogFilter) {
                                i13 = ((TL_update.TL_updateDialogFilter) update).id;
                            }
                        } else {
                            while (true) {
                                if (i15 < arrayList8.size()) {
                                    if (arrayList8.get(i15) instanceof TL_update.TL_updateDialogFilter) {
                                        i13 = ((TL_update.TL_updateDialogFilter) arrayList8.get(i15)).id;
                                    } else {
                                        i15++;
                                    }
                                }
                            }
                        }
                    }
                    if (i00Var.V1 instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        g2Var2.getMessagesController().i3(true, new g5(i00Var, y10Var, i13, i11));
                        break;
                    } else {
                        if (i00Var.W1 != null) {
                            g2Var2.getMessagesController().H(i00Var.U1, true);
                        }
                        i00Var.w2 = true;
                        i00Var.dismiss();
                        y10Var.a(Integer.valueOf(i13));
                        break;
                    }
                } else {
                    i00Var.h2.a(false);
                    break;
                }
            default:
                cx cxVar = (cx) this.c;
                Integer num3 = (Integer) this.b;
                rh rhVar = (rh) this.d;
                g2 g2Var3 = (g2) this.e;
                cxVar.Q4(num3.intValue());
                g0.h3(new ou(11, rhVar, g2Var3), 200L);
                break;
        }
    }

    public /* synthetic */ i(Runnable runnable, CameraSession cameraSession, CountDownLatch countDownLatch, Runnable runnable2) {
        this.a = 1;
        this.b = runnable;
        this.c = cameraSession;
        this.e = countDownLatch;
        this.d = runnable2;
    }

    public /* synthetic */ i(CameraSession cameraSession, Runnable runnable, SurfaceTexture surfaceTexture, Runnable runnable2) {
        this.a = 0;
        this.c = cameraSession;
        this.b = runnable;
        this.e = surfaceTexture;
        this.d = runnable2;
    }

    public /* synthetic */ i(ny nyVar, TLRPC.TL_messages_getStickers tL_messages_getStickers, TLObject tLObject, Runnable runnable) {
        this.a = 27;
        this.c = nyVar;
        this.d = tL_messages_getStickers;
        this.e = tLObject;
        this.b = runnable;
    }
}
