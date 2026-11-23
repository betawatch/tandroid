package oi;

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
import c8.m9;
import c8.na;
import c8.sa;
import di.xb;
import hi.c7;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.tr;
import org.telegram.messenger.uq;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.vp;
import org.telegram.messenger.w10;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.a90;
import org.telegram.ui.Components.bf;
import org.telegram.ui.Components.g00;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.ky;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.mx;
import org.telegram.ui.Components.ne;
import org.telegram.ui.Components.nf;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.on0;
import org.telegram.ui.Components.px;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Components.qn;
import org.telegram.ui.Components.tt0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.ye;
import org.telegram.ui.Components.ze;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bn;
import org.telegram.ui.cr;
import org.telegram.ui.ip;
import org.telegram.ui.j8;
import org.telegram.ui.jz;
import org.telegram.ui.la;
import org.telegram.ui.np;
import org.telegram.ui.p6;
import org.telegram.ui.q6;
import org.telegram.ui.qq;
import org.telegram.ui.rq;
import org.telegram.ui.uo;
import org.telegram.ui.wp;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    private final void a() {
        ne neVar;
        FrameLayout frameLayout;
        org.telegram.ui.Components.v3 v3Var;
        qn qnVar = (qn) this.b;
        Context context = (Context) this.c;
        View view = (View) this.d;
        i6 i6Var = (i6) this.e;
        long j3 = qnVar.W;
        final org.telegram.ui.Components.g2 g2Var = new org.telegram.ui.Components.g2(13, qnVar, view);
        ne neVar2 = new ne(3);
        int i7 = n6.j5;
        int g10 = i6Var != null ? i6Var.g(i7) : n6.x0(null, i7, false);
        int i10 = n6.h5;
        int g11 = i6Var != null ? i6Var.g(i10) : n6.x0(null, i10, false);
        int i11 = n6.Aj;
        if (i6Var != null) {
            i6Var.g(i11);
        } else {
            n6.x0(null, i11, false);
        }
        int i12 = n6.Ej;
        if (i6Var != null) {
            i6Var.g(i12);
        } else {
            n6.x0(null, i12, false);
        }
        int i13 = n6.E8;
        if (i6Var != null) {
            i6Var.g(i13);
        } else {
            n6.x0(null, i13, false);
        }
        int i14 = n6.G8;
        if (i6Var != null) {
            i6Var.g(i14);
        } else {
            n6.x0(null, i14, false);
        }
        int i15 = n6.i6;
        if (i6Var != null) {
            i6Var.g(i15);
        } else {
            n6.x0(null, i15, false);
        }
        int i16 = n6.Ji;
        int g12 = i6Var != null ? i6Var.g(i16) : n6.x0(null, i16, false);
        int i17 = n6.Fi;
        int g13 = i6Var != null ? i6Var.g(i17) : n6.x0(null, i17, false);
        int i18 = n6.Hi;
        if (i6Var != null) {
            i6Var.g(i18);
        } else {
            n6.x0(null, i18, false);
        }
        Pattern pattern = org.telegram.ui.Components.b5.a;
        if (context == null) {
            return;
        }
        final int l02 = (int) mp.u1(i10.t0).A7.J.l0(TimeUnit.SECONDS);
        final h6.o oVar = new h6.o(context, i6Var);
        ((org.telegram.ui.ActionBar.w2) oVar.b).w0 = false;
        int i19 = g12;
        final qb0 qb0Var = new qb0(context, i6Var);
        qb0Var.setTextColor(g10);
        qb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        qb0Var.setItemCount(5);
        int i20 = g13;
        final org.telegram.ui.Components.f4 f4Var = new org.telegram.ui.Components.f4(context, i6Var);
        f4Var.setWrapSelectorWheel(true);
        f4Var.setAllItemsCount(24);
        f4Var.setItemCount(5);
        f4Var.setTextColor(g10);
        f4Var.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        final org.telegram.ui.Components.g4 g4Var = new org.telegram.ui.Components.g4(context, i6Var);
        g4Var.setWrapSelectorWheel(true);
        g4Var.setAllItemsCount(60);
        g4Var.setItemCount(5);
        g4Var.setTextColor(g10);
        g4Var.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        int i21 = g11;
        org.telegram.ui.Components.v3 v3Var2 = new org.telegram.ui.Components.v3(context, qb0Var, f4Var, g4Var, 3);
        v3Var2.setOrientation(1);
        frameLayout2.addView(v3Var2, na.c(-1.0f, -1));
        frameLayout2.addView(new FrameLayout(context), na.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        v3Var2.addView(frameLayout3, na.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(gd.N0(2131744586, null));
        textView.setTextColor(g10);
        i5.c.x(textView, 1, 20.0f);
        frameLayout3.addView(textView, na.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new gi.a(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        v3Var2.addView(linearLayout, na.q(-1, -2, 1.0f, 0, 0, 23, 0, 23));
        final TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 12.0f);
        u6.U(textView2, n6.q5, i6Var);
        textView2.setGravity(17);
        final Calendar calendar = Calendar.getInstance();
        xb xbVar = new xb(context, 16);
        xbVar.setText(gd.N0(2131744587, null));
        sa.b(xbVar, 0.02f, 1.2f);
        linearLayout.addView(qb0Var, na.l(0.5f, 0, ks.t4));
        qb0Var.setMinValue(0);
        qb0Var.setMaxValue(365);
        qb0Var.setWrapSelectorWheel(false);
        qb0Var.setFormatter(new cr(28));
        bi.o5 o5Var = new bi.o5(l02, qb0Var, f4Var, g4Var, textView2);
        qb0Var.setOnValueChangedListener(o5Var);
        f4Var.setMinValue(0);
        f4Var.setMaxValue(23);
        linearLayout.addView(f4Var, na.l(0.2f, 0, ks.t4));
        f4Var.setFormatter(new cr(29));
        f4Var.setOnValueChangedListener(o5Var);
        g4Var.setMinValue(0);
        g4Var.setMaxValue(59);
        g4Var.setValue(0);
        g4Var.setFormatter(new org.telegram.ui.Components.k2(0));
        linearLayout.addView(g4Var, na.l(0.3f, 0, ks.t4));
        g4Var.setOnValueChangedListener(o5Var);
        if (j3 <= 0 || j3 == 2147483646) {
            neVar = neVar2;
            frameLayout = frameLayout2;
            v3Var = v3Var2;
        } else {
            long j10 = 1000 * j3;
            neVar = neVar2;
            frameLayout = frameLayout2;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            v3Var = v3Var2;
            int timeInMillis = (int) ((j10 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j10);
            if (timeInMillis >= 0) {
                g4Var.setValue(calendar.get(12));
                f4Var.setValue(calendar.get(11));
                qb0Var.setValue(timeInMillis);
            }
        }
        final boolean[] zArr = {true};
        org.telegram.ui.Components.b5.g(null, null, 0L, l02, 3, qb0Var, f4Var, g4Var);
        org.telegram.ui.Components.b5.e(textView2, qb0Var, f4Var, g4Var);
        xbVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        xbVar.setGravity(17);
        xbVar.setTextColor(i19);
        xbVar.setTextSize(1, 14.0f);
        xbVar.setTypeface(org.telegram.messenger.g0.o());
        xbVar.setBackground(org.telegram.ui.ActionBar.b6.e(i20, 24.0f));
        org.telegram.ui.Components.v3 v3Var3 = v3Var;
        v3Var3.addView(xbVar, na.t(-1, 48, 83, 14, 15, 14, 16));
        xbVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.l2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                zArr[0] = false;
                long j11 = l02;
                qb0 qb0Var2 = qb0Var;
                f4 f4Var2 = f4Var;
                g4 g4Var2 = g4Var;
                boolean g14 = b5.g(null, null, 0L, j11, 3, qb0Var2, f4Var2, g4Var2);
                b5.e(textView2, qb0Var2, f4Var2, g4Var2);
                long currentTimeMillis = System.currentTimeMillis();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(currentTimeMillis);
                calendar2.add(6, qb0Var2.getValue());
                calendar2.set(11, f4Var2.getValue());
                calendar2.set(12, g4Var2.getValue());
                if (g14) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                g2Var.I((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                ((org.telegram.ui.ActionBar.w2) oVar.b).y0.run();
            }
        });
        v3Var3.addView(textView2, na.t(-1, -2, 83, 14, 0, 14, 16));
        org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) oVar.b;
        w2Var.O = frameLayout;
        w2Var.show();
        w2Var.setOnDismissListener(new org.telegram.ui.Components.m2(0, neVar, zArr));
        w2Var.v0(i21);
        w2Var.P(i21);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0c0f  */
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
        final tt0 tt0Var;
        final float f10;
        r1.g gVar2;
        int i11 = 5;
        int i12 = 3;
        int i13 = -1;
        int i14 = 2;
        int i15 = 0;
        switch (this.a) {
            case 0:
                p pVar = (p) this.b;
                a aVar = (a) this.c;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) this.d;
                x60 x60Var = (x60) this.e;
                pVar.r.Y4(aVar, pageBlock);
                x60Var.v();
                break;
            case 1:
                CameraController.lambda$openRound$9((CameraSession) this.b, (Runnable) this.c, (SurfaceTexture) this.d, (Runnable) this.e);
                break;
            case 2:
                CameraController.lambda$close$5((Runnable) this.b, (CameraSession) this.c, (CountDownLatch) this.d, (Runnable) this.e);
                break;
            case 3:
                ((VideoAds) this.b).lambda$show$14((Context) this.c, (TLRPC.TL_sponsoredMessage) this.d, (x60) this.e);
                break;
            case 4:
                TLObject tLObject = (TLObject) this.b;
                k6 k6Var = (k6) this.c;
                m6 m6Var = (m6) this.d;
                TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) this.e;
                n6.A--;
                if (tLObject instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme2 = (TLRPC.TL_theme) tLObject;
                    TLRPC.ThemeSettings themeSettings = tL_theme2.settings.size() > 0 ? tL_theme2.settings.get(0) : null;
                    if (k6Var == null || themeSettings == null) {
                        TLRPC.Document document = tL_theme2.document;
                        if (document != null && document.id != tL_theme.document.id) {
                            if (k6Var != null) {
                                k6Var.r = tL_theme2;
                                z11 = true;
                            } else {
                                m6Var.G = tL_theme2;
                                m6Var.H = false;
                                m6Var.h0 = null;
                                m6Var.i0 = null;
                                ks.f(m6Var.F).b(m6Var, ks.Y1);
                                ks.f(m6Var.F).b(m6Var, ks.Z1);
                                w7 G = w7.G(m6Var.F);
                                TLRPC.TL_theme tL_theme3 = m6Var.G;
                                z11 = true;
                                G.W(tL_theme3.document, tL_theme3, 1, 1);
                            }
                            z10 = z11;
                        }
                    } else {
                        if (m6.a(k6Var, themeSettings)) {
                            z12 = false;
                        } else {
                            File e10 = k6Var.e();
                            if (e10 != null) {
                                e10.delete();
                            }
                            m6.i(k6Var, themeSettings);
                            m6 m6Var2 = n6.I;
                            if (m6Var2 == m6Var && m6Var2.Z == k6Var.a) {
                                n6.t1(false, false);
                                n6.K(org.telegram.messenger.t0.b, false);
                                m6 m6Var3 = n6.I;
                                n6.K1(m6Var3, n6.J == m6Var3, -1, null);
                            }
                            h6.a(true);
                            z12 = true;
                        }
                        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                        k6Var.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                        z10 = z12;
                    }
                    if (n6.A != 0) {
                        n6.B = (int) (System.currentTimeMillis() / 1000);
                        n6.y1(z10, false);
                        break;
                    }
                }
                z10 = false;
                if (n6.A != 0) {
                }
                break;
            case 5:
                ((bi.j5) this.b).a(n6.T0((File) this.c, (String) this.d, (String[]) this.e));
                break;
            case 6:
                q6 q6Var = (q6) this.b;
                ai.h0 h0Var = (ai.h0) this.c;
                float[] fArr = (float[]) this.d;
                boolean[] zArr = (boolean[]) this.e;
                q6Var.getClass();
                h0Var.f(fArr[0]);
                if (zArr[0]) {
                    q6Var.d.A0(true);
                    break;
                }
                break;
            case 7:
                q6 q6Var2 = (q6) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                long[] jArr = (long[]) this.d;
                p6 p6Var = (p6) this.e;
                if (!zArr2[0]) {
                    jArr[0] = System.currentTimeMillis();
                    q6Var2.d.showDialog(p6Var);
                    break;
                }
                break;
            case 8:
                j8.Z((j8) this.b, (TLRPC.TL_error) this.c, (TLObject) this.d, (Calendar) this.e);
                break;
            case 9:
                la.Z((la) this.b, (org.telegram.ui.ActionBar.t1) this.c, (TLRPC.TL_error) this.d, (TL_account.updateUsername) this.e);
                break;
            case 10:
                bn bnVar = (bn) this.b;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.c;
                fj fjVar = (fj) this.d;
                org.telegram.ui.ActionBar.r4 r4Var = (org.telegram.ui.ActionBar.r4) this.e;
                if (g2Var instanceof fs) {
                    i7 = 4;
                    bnVar.getNotificationCenter().n((fs) g2Var, 4);
                } else {
                    i7 = 4;
                }
                bnVar.getNotificationCenter().k(i7, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", fjVar.k.action.channel_id);
                ((ActionBarLayout) r4Var).c(r4Var.getFragmentStack().size() - 1, new bn(bundle));
                g2Var.finishFragment();
                break;
            case 11:
                bn bnVar2 = (bn) this.b;
                vf.b bVar = (vf.b) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                di.n2 n2Var = (di.n2) this.e;
                bVar.b();
                if (tLObject2 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                    bnVar2.getMessagesController().f4(tL_contacts_resolvedPeer.users, false);
                    bnVar2.getMessagesController().Z3(tL_contacts_resolvedPeer.chats, false);
                    long o4 = org.telegram.messenger.n5.o(tL_contacts_resolvedPeer.peer);
                    if (o4 >= 0) {
                        user = bnVar2.getMessagesController().c2(Long.valueOf(o4));
                        n2Var.a(user);
                        break;
                    }
                }
                user = null;
                n2Var.a(user);
            case 12:
                long[] jArr2 = (long[]) this.b;
                boolean[] zArr3 = (boolean[]) this.c;
                ImageView imageView = (ImageView) this.d;
                ImageView imageView2 = (ImageView) this.e;
                jArr2[0] = SystemClock.elapsedRealtime();
                if (!zArr3[0]) {
                    imageView = imageView2;
                }
                jr jrVar = (jr) imageView.getDrawable();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new org.telegram.ui.a3(jrVar, 4));
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(kr.f);
                ofFloat.start();
                break;
            case 13:
                bn bnVar3 = (bn) this.b;
                fj fjVar2 = (fj) this.c;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.d;
                boolean[] zArr4 = (boolean[]) this.e;
                try {
                    tL_webPage = a90.g(fjVar2);
                    th2 = null;
                } catch (Throwable th3) {
                    a8.g(th3, true);
                    th2 = th3;
                    tL_webPage = null;
                }
                org.telegram.messenger.g0.g3(new di.o3(bnVar3, t1Var, zArr4, th2 == null && tL_webPage != null, fjVar2, tL_webPage));
                break;
            case 14:
                bn bnVar4 = (bn) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                tr trVar = (tr) this.e;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                if (tL_error != null || messages_messages.messages.isEmpty()) {
                    if (messages_messages != null) {
                        bnVar4.D6 = messages_messages.count;
                    } else {
                        bnVar4.D6 = 0;
                    }
                    trVar.a.c(new uq(trVar, bnVar4.b(), bnVar4.l6, bnVar4.D6, 7));
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
                    fj fjVar3 = (fj) bnVar4.G6[0].get(i17);
                    trVar.a.c(new vp(trVar, i17, bnVar4.l6, 4));
                    if (fjVar3 != null) {
                        TLRPC.Message message = fjVar3.k;
                        message.media_unread = true;
                        message.mentioned = true;
                    }
                    bnVar4.l(i17, 0, false, 0, true, 0);
                    break;
                }
                break;
            case 15:
                bn.T0((bn) this.b, (TLRPC.TL_messageMediaWebPage) this.c, (TLRPC.TL_webPageAttributeStory) this.d, (org.telegram.ui.n6) this.e);
                break;
            case 16:
                uo.b0((uo) this.b, (org.telegram.ui.ActionBar.t1[]) this.c, (TLRPC.Chat) this.d, (org.telegram.ui.ActionBar.g2) this.e);
                break;
            case 17:
                np npVar = (np) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
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
            case 18:
                rq rqVar2 = (rq) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                TLRPC.User user2 = (TLRPC.User) this.d;
                wp wpVar = (wp) this.e;
                if (!(tLObject5 instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject5 instanceof TLRPC.TL_chatParticipantAdmin)) {
                    wpVar.a(1);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rqVar2.getParentActivity());
                    alertDialog$Builder.a.S = gd.N0(R.string.AppName, "AppName");
                    alertDialog$Builder.a.U = gd.a0(null, null, 2131754347, n10.q(user2));
                    alertDialog$Builder.k(gd.N0(2131747637, "OK"), new org.telegram.ui.w0(wpVar, 26));
                    alertDialog$Builder.h(gd.N0(2131752577, "Cancel"), null);
                    rqVar2.showDialog(alertDialog$Builder.a);
                    break;
                }
                break;
            case 19:
                qq qqVar2 = (qq) this.b;
                String str5 = (String) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                rq rqVar3 = qqVar2.E;
                String lowerCase2 = str5.trim().toLowerCase();
                if (lowerCase2.length() == 0) {
                    org.telegram.messenger.g0.g3(new ip(qqVar2, new ArrayList(), new a0.h(), new ArrayList(), new ArrayList(), 1));
                    break;
                } else {
                    String T0 = gd.E0().T0(lowerCase2, true, false);
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
                                    B1 = fj.B1(((TLRPC.ChannelParticipant) tLObject6).peer);
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
                                    String lowerCase3 = n10.q(c22).toLowerCase();
                                    String o10 = n10.o(c22);
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
                                String K = org.telegram.messenger.v3.K(O0, false);
                                str = O0.title;
                                strArr = strArr2;
                                str2 = K;
                                rqVar = rqVar4;
                                str3 = null;
                            }
                            i10 = size;
                            String T02 = gd.E0().T0(lowerCase, true, z13);
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
                                            arrayList5.add(org.telegram.messenger.g0.r0(str, str3, str7));
                                        } else {
                                            arrayList5.add(org.telegram.messenger.g0.r0(p5.c.k("@", str2), null, "@" + str7));
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
                                String lowerCase4 = n10.q(c23).toLowerCase();
                                String T03 = gd.E0().T0(lowerCase4, true, false);
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
                                            String o11 = n10.o(c23);
                                            if (o11 != null && o11.startsWith(str8)) {
                                                z17 = 2;
                                            }
                                        }
                                        if (z17) {
                                            if (z17) {
                                                arrayList5.add(org.telegram.messenger.g0.r0(c23.first_name, c23.last_name, str8));
                                            } else {
                                                arrayList5.add(org.telegram.messenger.g0.r0("@" + n10.o(c23), null, "@" + str8));
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
                    org.telegram.messenger.g0.g3(new ip(qqVar3, arrayList4, hVar, arrayList5, arrayList6, 1));
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Components.m0 m0Var = (org.telegram.ui.Components.m0) this.b;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.c;
                Context context = (Context) this.d;
                i6 i6Var = (i6) this.e;
                String str9 = "https://t.me/addstyle/" + tL_aiComposeTone.slug;
                new org.telegram.ui.Components.p(m0Var, context, str9, str9, i6Var).show();
                break;
            case 21:
                org.telegram.ui.Components.a5 a5Var = (org.telegram.ui.Components.a5) this.b;
                ai.o2 o2Var = (ai.o2) this.c;
                org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) this.d;
                View view = (View) this.e;
                String trim = a5Var.getText().toString().trim();
                Uri parse = Uri.parse(trim);
                if (parse == null || parse.getHost() == null) {
                    parse = Uri.parse("https://" + trim);
                }
                if (parse != null && parse.getHost() != null) {
                    String lowerCase5 = parse.getHost().toLowerCase();
                    if (lowerCase5.startsWith("www.")) {
                        lowerCase5 = lowerCase5.substring(4);
                    }
                    o2Var.a(lowerCase5);
                    org.telegram.ui.ActionBar.t1 t1Var2 = t1VarArr[0];
                    if (t1Var2 != null) {
                        t1Var2.dismiss();
                    }
                    if (view != null) {
                        view.requestFocus();
                        break;
                    }
                } else {
                    org.telegram.messenger.g0.D3(a5Var);
                    break;
                }
                break;
            case 22:
                int[] iArr = (int[]) this.b;
                int[] iArr2 = (int[]) this.c;
                String[] strArr4 = (String[]) this.d;
                TextView textView = (TextView) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) gd.N0(2131748313, null));
                spannableStringBuilder.append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                int i24 = 0;
                while (true) {
                    if (i24 < iArr.length) {
                        if (iArr2[0] == iArr[i24]) {
                            spannableStringBuilder.append((CharSequence) strArr4[i24]);
                            spannableStringBuilder.setSpan(new k41(org.telegram.messenger.g0.o()), length, spannableStringBuilder.length(), 33);
                        } else {
                            i24++;
                        }
                    }
                }
                spannableStringBuilder.append((CharSequence) " v");
                if (i10.i(i10.t0).q()) {
                    kq kqVar = new kq(R.drawable.arrows_select, 0);
                    kqVar.H = 0.7f;
                    float L = org.telegram.messenger.g0.L(-1.33f);
                    float L2 = org.telegram.messenger.g0.L(0.0f);
                    kqVar.r = L;
                    kqVar.s = L2;
                    kqVar.x = 0.75f;
                    spannableStringBuilder.setSpan(kqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                } else {
                    kq kqVar2 = new kq(R.drawable.mini_switch_lock, 0);
                    kqVar2.H = 0.7f;
                    float L3 = org.telegram.messenger.g0.L(-1.33f);
                    float L4 = org.telegram.messenger.g0.L(0.0f);
                    kqVar2.r = L3;
                    kqVar2.s = L4;
                    kqVar2.x = 0.75f;
                    spannableStringBuilder.setSpan(kqVar2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                }
                textView.setText(spannableStringBuilder);
                break;
            case 23:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                Boolean bool = (Boolean) this.c;
                Integer num = (Integer) this.d;
                Integer num2 = (Integer) this.e;
                int i25 = ChatActivityEnterView.s7;
                chatActivityEnterView.getClass();
                chatActivityEnterView.x1(bool.booleanValue(), num.intValue(), num2.intValue(), 0L, true);
                break;
            case 24:
                final ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.b;
                tt0 tt0Var2 = (tt0) this.c;
                int[] iArr3 = (int[]) this.d;
                on0 on0Var = (on0) this.e;
                r1.b bVar2 = r1.g.r;
                r1.b bVar3 = r1.g.q;
                int[] iArr4 = chatActivityEnterView2.D3;
                if (chatActivityEnterView2.r0 != null) {
                    final Dialog dialog = new Dialog(chatActivityEnterView2.getContext(), R.style.TransparentDialogNoAnimation);
                    FrameLayout frameLayout = new FrameLayout(chatActivityEnterView2.getContext());
                    frameLayout.addView(tt0Var2, na.e(40, 40, 3));
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
                    org.telegram.messenger.g0.p3(dialog, n6.x0(null, n6.s8, true) == -1);
                    if (Build.VERSION.SDK_INT >= 26) {
                        org.telegram.messenger.g0.m3(dialog, org.telegram.messenger.g0.B(n6.x0(null, n6.a7, true)) >= 0.721f);
                    }
                    chatActivityEnterView2.t0 = chatActivityEnterView2.getRootWindowInsets().getSystemWindowInsetLeft() + chatActivityEnterView2.t0;
                    chatActivityEnterView2.q0.getLocationInWindow(iArr4);
                    float f11 = iArr4[0];
                    final float f12 = iArr4[1];
                    float L5 = org.telegram.messenger.g0.L(5.0f);
                    float L6 = iArr3[0] + chatActivityEnterView2.t0 + L5 + org.telegram.messenger.g0.L(4.0f) + 0.0f;
                    float f13 = iArr3[1] + chatActivityEnterView2.u0 + L5 + 0.0f;
                    tt0Var2.setTranslationX(L6);
                    tt0Var2.setTranslationY(f13);
                    float scaleX = (chatActivityEnterView2.q0.getLayoutParams().width * (chatActivityEnterView2.p7 ? chatActivityEnterView2.q0.getScaleX() : 1.0f)) / org.telegram.messenger.g0.L(40.0f);
                    tt0Var2.setPivotX(0.0f);
                    tt0Var2.setPivotY(0.0f);
                    tt0Var2.setScaleX(0.75f);
                    tt0Var2.setScaleY(0.75f);
                    tt0Var2.getViewTreeObserver().addOnDrawListener(new ze(tt0Var2, on0Var));
                    dialog.show();
                    if (!chatActivityEnterView2.p7) {
                        chatActivityEnterView2.q0.setScaleX(1.0f);
                        chatActivityEnterView2.q0.setScaleY(1.0f);
                    }
                    chatActivityEnterView2.q0.setAlpha(1.0f);
                    ye yeVar = chatActivityEnterView2.r0;
                    if (chatActivityEnterView2.p7) {
                        tt0Var = tt0Var2;
                        gVar = null;
                    } else {
                        tt0Var = tt0Var2;
                        gVar = new r1.g(chatActivityEnterView2.q0, bVar3);
                        gVar.m = org.telegram.ui.Cells.c0.p(0.5f, 750.0f, 1.0f);
                    }
                    if (chatActivityEnterView2.p7) {
                        f10 = f11;
                        gVar2 = null;
                    } else {
                        f10 = f11;
                        r1.g gVar3 = new r1.g(chatActivityEnterView2.q0, bVar2);
                        gVar3.m = org.telegram.ui.Cells.c0.p(0.5f, 750.0f, 1.0f);
                        gVar2 = gVar3;
                    }
                    r1.g gVar4 = new r1.g(chatActivityEnterView2.q0, r1.g.v);
                    gVar4.m = org.telegram.ui.Cells.c0.p(0.0f, 750.0f, 1.0f);
                    final int i26 = 0;
                    r1.c cVar = new r1.c() { // from class: org.telegram.ui.Components.md
                        @Override // r1.c
                        public final void a(r1.g gVar5, boolean z18, float f14, float f15) {
                            int i27 = i26;
                            float f16 = f12;
                            float f17 = f10;
                            tt0 tt0Var3 = tt0Var;
                            Dialog dialog2 = dialog;
                            ChatActivityEnterView chatActivityEnterView3 = chatActivityEnterView2;
                            switch (i27) {
                                case 0:
                                    int i28 = ChatActivityEnterView.s7;
                                    if (dialog2.isShowing()) {
                                        tt0Var3.setTranslationX(f17);
                                        tt0Var3.setTranslationY(f16);
                                        qn0 qn0Var = chatActivityEnterView3.q0;
                                        qn0Var.getClass();
                                        qn0Var.a(false, false, 0.0f);
                                        if (!chatActivityEnterView3.p7) {
                                            chatActivityEnterView3.q0.setScaleX(1.0f);
                                            chatActivityEnterView3.q0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView3.q0.setAlpha(1.0f);
                                        chatActivityEnterView3.q0.getViewTreeObserver().addOnPreDrawListener(new af(chatActivityEnterView3, dialog2, 0));
                                        break;
                                    }
                                    break;
                                default:
                                    int i29 = ChatActivityEnterView.s7;
                                    if (dialog2.isShowing()) {
                                        tt0Var3.setTranslationX(f17);
                                        tt0Var3.setTranslationY(f16);
                                        qn0 qn0Var2 = chatActivityEnterView3.q0;
                                        qn0Var2.getClass();
                                        qn0Var2.a(false, false, 0.0f);
                                        if (!chatActivityEnterView3.p7) {
                                            chatActivityEnterView3.q0.setScaleX(1.0f);
                                            chatActivityEnterView3.q0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView3.q0.setAlpha(1.0f);
                                        chatActivityEnterView3.q0.getViewTreeObserver().addOnPreDrawListener(new af(chatActivityEnterView3, dialog2, 1));
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    tt0 tt0Var3 = tt0Var;
                    float f14 = f10;
                    gVar4.a(cVar);
                    r1.g gVar5 = new r1.g(tt0Var3, r1.g.o);
                    gVar5.b = m9.a(L6, f14 - org.telegram.messenger.g0.L(6.0f), L6);
                    gVar5.c = true;
                    gVar5.m = org.telegram.ui.Cells.c0.p(f14, 700.0f, 0.75f);
                    gVar5.h = f14 - org.telegram.messenger.g0.L(6.0f);
                    r1.g gVar6 = new r1.g(tt0Var3, r1.g.p);
                    gVar6.b = m9.a(f13, f13, org.telegram.messenger.g0.L(6.0f) + f12);
                    gVar6.c = true;
                    gVar6.m = org.telegram.ui.Cells.c0.p(f12, 700.0f, 0.75f);
                    gVar6.g = org.telegram.messenger.g0.L(6.0f) + f12;
                    gVar6.b(new bf(f12, tt0Var3));
                    final int i27 = 1;
                    gVar6.a(new r1.c() { // from class: org.telegram.ui.Components.md
                        @Override // r1.c
                        public final void a(r1.g gVar52, boolean z18, float f142, float f15) {
                            int i272 = i27;
                            float f16 = f12;
                            float f17 = f10;
                            tt0 tt0Var32 = tt0Var;
                            Dialog dialog2 = dialog;
                            ChatActivityEnterView chatActivityEnterView3 = chatActivityEnterView2;
                            switch (i272) {
                                case 0:
                                    int i28 = ChatActivityEnterView.s7;
                                    if (dialog2.isShowing()) {
                                        tt0Var32.setTranslationX(f17);
                                        tt0Var32.setTranslationY(f16);
                                        qn0 qn0Var = chatActivityEnterView3.q0;
                                        qn0Var.getClass();
                                        qn0Var.a(false, false, 0.0f);
                                        if (!chatActivityEnterView3.p7) {
                                            chatActivityEnterView3.q0.setScaleX(1.0f);
                                            chatActivityEnterView3.q0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView3.q0.setAlpha(1.0f);
                                        chatActivityEnterView3.q0.getViewTreeObserver().addOnPreDrawListener(new af(chatActivityEnterView3, dialog2, 0));
                                        break;
                                    }
                                    break;
                                default:
                                    int i29 = ChatActivityEnterView.s7;
                                    if (dialog2.isShowing()) {
                                        tt0Var32.setTranslationX(f17);
                                        tt0Var32.setTranslationY(f16);
                                        qn0 qn0Var2 = chatActivityEnterView3.q0;
                                        qn0Var2.getClass();
                                        qn0Var2.a(false, false, 0.0f);
                                        if (!chatActivityEnterView3.p7) {
                                            chatActivityEnterView3.q0.setScaleX(1.0f);
                                            chatActivityEnterView3.q0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView3.q0.setAlpha(1.0f);
                                        chatActivityEnterView3.q0.getViewTreeObserver().addOnPreDrawListener(new af(chatActivityEnterView3, dialog2, 1));
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    r1.g gVar7 = new r1.g(tt0Var3, bVar3);
                    gVar7.m = org.telegram.ui.Cells.c0.p(scaleX, 1000.0f, 1.0f);
                    r1.g gVar8 = new r1.g(tt0Var3, bVar2);
                    gVar8.m = org.telegram.ui.Cells.c0.p(scaleX, 1000.0f, 1.0f);
                    yeVar.l(gVar, gVar2, gVar4, gVar5, gVar6, gVar7, gVar8);
                    break;
                }
                break;
            case 25:
                qf qfVar = (qf) this.b;
                FrameLayout frameLayout2 = (FrameLayout) this.c;
                View view2 = (View) this.d;
                c7 c7Var = (c7) this.e;
                ChatActivityEnterView chatActivityEnterView3 = qfVar.a;
                int i28 = ChatActivityEnterView.s7;
                ai.l0 A0 = chatActivityEnterView3.A0();
                nf nfVar = new nf(qfVar, frameLayout2, i15);
                org.telegram.ui.Components.y2 y2Var = new org.telegram.ui.Components.y2(c7Var, i12);
                of ofVar = new of(i15, frameLayout2);
                A0.i();
                Context context2 = A0.h;
                i6 i6Var2 = A0.n;
                bi.b1 b1Var = new bi.b1(context2, view2, i6Var2, nfVar);
                int[] iArr5 = new int[2];
                view2.getLocationInWindow(iArr5);
                b1Var.T = iArr5[1] > org.telegram.messenger.g0.q.y / 2;
                b1Var.M = org.telegram.messenger.g0.L(ks.x3);
                b1Var.L = 0;
                b1Var.n = org.telegram.messenger.g0.L(ks.P4);
                int w02 = n6.w0(n6.G6, i6Var2);
                ArrayList H = A0.H();
                int size2 = H.size();
                while (i15 < size2) {
                    Object obj = H.get(i15);
                    i15++;
                    ai.c cVar2 = (ai.c) obj;
                    b1Var.a(new ai.k0(A0.h, cVar2, w02, A0.f.a.R, false), 44, new a1.e(15, y2Var, cVar2));
                }
                b1Var.setFocusableInTouchMode(true);
                b1Var.setOnKeyListener(new ai.b0(i14, b1Var));
                b1Var.R = ofVar;
                frameLayout2.addView(b1Var, new FrameLayout.LayoutParams(-1, -1));
                b1Var.requestFocus();
                b1Var.f();
                break;
            case 26:
                a();
                break;
            case 27:
                mx mxVar = (mx) this.b;
                org.telegram.ui.ActionBar.t1[] t1VarArr2 = (org.telegram.ui.ActionBar.t1[]) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                h6.o oVar = (h6.o) this.e;
                try {
                    t1VarArr2[0].dismiss();
                } catch (Throwable unused) {
                }
                t1VarArr2[0] = null;
                if (tLObject7 instanceof TLRPC.TL_emojiURL) {
                    vf.c.t(((px) mxVar.c.b).G.getContext(), ((TLRPC.TL_emojiURL) tLObject7).url);
                    ((org.telegram.ui.ActionBar.w2) oVar.b).y0.run();
                    break;
                }
                break;
            case 28:
                ky kyVar = (ky) this.b;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) this.c;
                TLObject tLObject8 = (TLObject) this.d;
                Runnable runnable = (Runnable) this.e;
                ArrayList arrayList7 = kyVar.s;
                ly lyVar = kyVar.x;
                if (lyVar.N == kyVar.b) {
                    lyVar.M = 0;
                    if (tL_messages_getStickers.emoticon.equals(kyVar.a)) {
                        if (!(tLObject8 instanceof TLRPC.TL_messages_stickers)) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject8;
                            int size3 = arrayList7.size();
                            int size4 = tL_messages_stickers.stickers.size();
                            while (i15 < size4) {
                                TLRPC.Document document2 = tL_messages_stickers.stickers.get(i15);
                                if (kyVar.w.indexOfKey(document2.id) < 0) {
                                    arrayList7.add(document2);
                                }
                                i15++;
                            }
                            if (size3 != arrayList7.size()) {
                                kyVar.f.put(arrayList7, lyVar.O);
                                if (size3 == 0) {
                                    kyVar.h.add(arrayList7);
                                }
                            }
                        }
                    }
                    runnable.run();
                    break;
                }
                break;
            default:
                g00 g00Var = (g00) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject9 = (TLObject) this.d;
                w10 w10Var = (w10) this.e;
                g00Var.v2 = -1;
                org.telegram.ui.ActionBar.g2 g2Var2 = g00Var.s1;
                jz.x0(tL_error3, g2Var2, kc.b0(g2Var2));
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
                    if (g00Var.V1 instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        g2Var2.getMessagesController().i3(true, new bi.j5(g00Var, w10Var, i13, i11));
                        break;
                    } else {
                        if (g00Var.W1 != null) {
                            g2Var2.getMessagesController().H(g00Var.U1, true);
                        }
                        g00Var.w2 = true;
                        g00Var.dismiss();
                        w10Var.a(Integer.valueOf(i13));
                        break;
                    }
                } else {
                    g00Var.h2.a(false);
                    break;
                }
        }
    }
}
