package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
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
import c8.i9;
import c8.ja;
import c8.na;
import di.tb;
import hi.g7;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.ou;
import org.telegram.messenger.q10;
import org.telegram.messenger.uq;
import org.telegram.messenger.vr;
import org.telegram.messenger.w7;
import org.telegram.messenger.wp;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.d70;
import org.telegram.ui.Components.df;
import org.telegram.ui.Components.dr;
import org.telegram.ui.Components.e70;
import org.telegram.ui.Components.ef;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fy;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.ih;
import org.telegram.ui.Components.ix;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.k20;
import org.telegram.ui.Components.lx;
import org.telegram.ui.Components.oe;
import org.telegram.ui.Components.pe;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.re;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.vs;
import org.telegram.ui.Components.y31;
import org.telegram.ui.Components.zz;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.an;
import org.telegram.ui.br;
import org.telegram.ui.hp;
import org.telegram.ui.hz;
import org.telegram.ui.i8;
import org.telegram.ui.la;
import org.telegram.ui.mp;
import org.telegram.ui.pq;
import org.telegram.ui.qq;
import org.telegram.ui.to;
import org.telegram.ui.up;
import org.telegram.ui.vp;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class l5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l5(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    private final void a() {
        ih ihVar;
        int i7;
        jn jnVar = (jn) this.b;
        Context context = (Context) this.c;
        View view = (View) this.d;
        e6 e6Var = (e6) this.e;
        long j3 = jnVar.W;
        final org.telegram.ui.Components.f1 f1Var = new org.telegram.ui.Components.f1(14, jnVar, view);
        ih ihVar2 = new ih(1);
        int i10 = j6.j5;
        int f10 = e6Var != null ? e6Var.f(i10) : j6.x0(null, i10, false);
        int i11 = j6.h5;
        int f11 = e6Var != null ? e6Var.f(i11) : j6.x0(null, i11, false);
        int i12 = j6.Aj;
        if (e6Var != null) {
            e6Var.f(i12);
        } else {
            j6.x0(null, i12, false);
        }
        int i13 = j6.Ej;
        if (e6Var != null) {
            e6Var.f(i13);
        } else {
            j6.x0(null, i13, false);
        }
        int i14 = j6.E8;
        if (e6Var != null) {
            e6Var.f(i14);
        } else {
            j6.x0(null, i14, false);
        }
        int i15 = j6.G8;
        if (e6Var != null) {
            e6Var.f(i15);
        } else {
            j6.x0(null, i15, false);
        }
        int i16 = j6.i6;
        if (e6Var != null) {
            e6Var.f(i16);
        } else {
            j6.x0(null, i16, false);
        }
        int i17 = j6.Ji;
        int f12 = e6Var != null ? e6Var.f(i17) : j6.x0(null, i17, false);
        int i18 = j6.Fi;
        int f13 = e6Var != null ? e6Var.f(i18) : j6.x0(null, i18, false);
        int i19 = j6.Hi;
        if (e6Var != null) {
            e6Var.f(i19);
        } else {
            j6.x0(null, i19, false);
        }
        Pattern pattern = org.telegram.ui.Components.t4.a;
        if (context == null) {
            return;
        }
        int i20 = f10;
        final int z02 = (int) np.s1(m10.t0).y7.E.z0(TimeUnit.SECONDS);
        final ou ouVar = new ou(context, e6Var);
        ((u2) ouVar.b).w0 = false;
        int i21 = f11;
        final ib0 ib0Var = new ib0(context, e6Var);
        ib0Var.setTextColor(i20);
        ib0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        ib0Var.setItemCount(5);
        int i22 = f12;
        final org.telegram.ui.Components.x3 x3Var = new org.telegram.ui.Components.x3(context, e6Var);
        x3Var.setWrapSelectorWheel(true);
        x3Var.setAllItemsCount(24);
        x3Var.setItemCount(5);
        x3Var.setTextColor(i20);
        x3Var.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        int i23 = f13;
        final org.telegram.ui.Components.y3 y3Var = new org.telegram.ui.Components.y3(context, e6Var);
        y3Var.setWrapSelectorWheel(true);
        y3Var.setAllItemsCount(60);
        y3Var.setItemCount(5);
        y3Var.setTextColor(i20);
        y3Var.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.n3 n3Var = new org.telegram.ui.Components.n3(context, ib0Var, x3Var, y3Var, 3);
        n3Var.setOrientation(1);
        frameLayout.addView(n3Var, ja.c(-1.0f, -1));
        frameLayout.addView(new FrameLayout(context), ja.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        n3Var.addView(frameLayout2, ja.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(hd.M0(2131744827, null));
        textView.setTextColor(i20);
        i5.c.v(textView, 1, 20.0f);
        frameLayout2.addView(textView, ja.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new gi.a(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        n3Var.addView(linearLayout, ja.q(-1, -2, 1.0f, 0, 0, 23, 0, 23));
        final TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 12.0f);
        q6.U(textView2, j6.q5, e6Var);
        textView2.setGravity(17);
        final Calendar calendar = Calendar.getInstance();
        tb tbVar = new tb(context, 16);
        tbVar.setText(hd.M0(2131744828, null));
        na.b(tbVar, 0.02f, 1.2f);
        linearLayout.addView(ib0Var, ja.l(0.5f, 0, ns.t4));
        ib0Var.setMinValue(0);
        ib0Var.setMaxValue(365);
        ib0Var.setWrapSelectorWheel(false);
        ib0Var.setFormatter(new br(27));
        bi.b3 b3Var = new bi.b3(z02, ib0Var, x3Var, y3Var, textView2);
        ib0Var.setOnValueChangedListener(b3Var);
        x3Var.setMinValue(0);
        x3Var.setMaxValue(23);
        linearLayout.addView(x3Var, ja.l(0.2f, 0, ns.t4));
        x3Var.setFormatter(new br(28));
        x3Var.setOnValueChangedListener(b3Var);
        y3Var.setMinValue(0);
        y3Var.setMaxValue(59);
        y3Var.setValue(0);
        y3Var.setFormatter(new br(29));
        linearLayout.addView(y3Var, ja.l(0.3f, 0, ns.t4));
        y3Var.setOnValueChangedListener(b3Var);
        if (j3 <= 0 || j3 == 2147483646) {
            ihVar = ihVar2;
            i7 = i22;
        } else {
            long j10 = 1000 * j3;
            ihVar = ihVar2;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            i7 = i22;
            int timeInMillis = (int) ((j10 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j10);
            if (timeInMillis >= 0) {
                y3Var.setValue(calendar.get(12));
                x3Var.setValue(calendar.get(11));
                ib0Var.setValue(timeInMillis);
            }
        }
        final boolean[] zArr = {true};
        org.telegram.ui.Components.t4.g(null, null, 0L, z02, 3, ib0Var, x3Var, y3Var);
        org.telegram.ui.Components.t4.e(textView2, ib0Var, x3Var, y3Var);
        tbVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        tbVar.setGravity(17);
        tbVar.setTextColor(i7);
        tbVar.setTextSize(1, 14.0f);
        tbVar.setTypeface(org.telegram.messenger.g0.o());
        tbVar.setBackground(y5.e(i23, 24.0f));
        n3Var.addView(tbVar, ja.t(-1, 48, 83, 14, 15, 14, 16));
        tbVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.b2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                zArr[0] = false;
                long j11 = z02;
                ib0 ib0Var2 = ib0Var;
                x3 x3Var2 = x3Var;
                y3 y3Var2 = y3Var;
                boolean g10 = t4.g(null, null, 0L, j11, 3, ib0Var2, x3Var2, y3Var2);
                t4.e(textView2, ib0Var2, x3Var2, y3Var2);
                long currentTimeMillis = System.currentTimeMillis();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(currentTimeMillis);
                calendar2.add(6, ib0Var2.getValue());
                calendar2.set(11, x3Var2.getValue());
                calendar2.set(12, y3Var2.getValue());
                if (g10) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                f1Var.L((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                ((org.telegram.ui.ActionBar.u2) ouVar.b).y0.run();
            }
        });
        n3Var.addView(textView2, ja.t(-1, -2, 83, 14, 0, 14, 16));
        u2 u2Var = (u2) ouVar.b;
        u2Var.O = frameLayout;
        u2Var.show();
        u2Var.setOnDismissListener(new org.telegram.ui.Components.c2(0, ihVar, zArr));
        u2Var.v0(i21);
        u2Var.P(i21);
    }

    private final void b() {
        int b10;
        a0.h hVar;
        ArrayList arrayList;
        a0.h hVar2;
        k20 k20Var = (k20) this.c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        TLObject tLObject = (TLObject) this.b;
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = (TLRPC.TL_channels_getParticipants) this.e;
        cv0 cv0Var = k20Var.u1;
        a0.h hVar3 = k20Var.V1;
        a0.h hVar4 = k20Var.W1;
        ArrayList arrayList2 = k20Var.S1;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            np.s1(k20Var.a).Y3(tL_channels_channelParticipants.users, false);
            np.s1(k20Var.a).S3(tL_channels_channelParticipants.chats, false);
            long e10 = m10.i(k20Var.a).e();
            int i7 = 0;
            while (true) {
                if (i7 >= tL_channels_channelParticipants.participants.size()) {
                    break;
                }
                if (gj.B1(tL_channels_channelParticipants.participants.get(i7).peer) == e10) {
                    tL_channels_channelParticipants.participants.remove(i7);
                    break;
                }
                i7++;
            }
            k20Var.P1--;
            if (tL_channels_getParticipants.filter instanceof TLRPC.TL_channelParticipantsContacts) {
                arrayList = k20Var.T1;
                hVar = hVar4;
            } else {
                hVar = hVar3;
                arrayList = arrayList2;
            }
            arrayList.clear();
            arrayList.addAll(tL_channels_channelParticipants.participants);
            int size = tL_channels_channelParticipants.participants.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i10);
                hVar.k(channelParticipant, gj.B1(channelParticipant.peer));
            }
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                long B1 = gj.B1(((TLRPC.ChannelParticipant) arrayList2.get(i11)).peer);
                boolean z10 = hVar4.f(B1) != null || ((hVar2 = k20Var.Z1) != null && hVar2.h(B1) >= 0);
                TLRPC.User a22 = np.s1(k20Var.a).a2(Long.valueOf(B1));
                if ((a22 != null && a22.bot) || q10.x(a22)) {
                    z10 = true;
                }
                if (z10) {
                    arrayList2.remove(i11);
                    hVar3.l(B1);
                    i11--;
                    size2--;
                }
                i11++;
            }
            try {
                if (k20Var.R1.participants_count <= 200) {
                    Collections.sort(arrayList, new up(k20Var, ConnectionsManager.getInstance(k20Var.a).getCurrentTime(), 1));
                }
            } catch (Exception e11) {
                a8.g(e11, true);
            }
        }
        if (k20Var.P1 <= 0) {
            k20Var.X1 = false;
            k20Var.Y1 = true;
            if (k20Var.l2 == 1) {
                b10 = 1;
            } else {
                tj0 tj0Var = k20Var.q1;
                b10 = tj0Var != null ? tj0Var.b() - 1 : 0;
            }
            k20Var.O0(b10);
            if (arrayList2.isEmpty()) {
                k20Var.c2 = true;
                k20Var.R0();
            }
        }
        k20Var.T0();
        tj0 tj0Var2 = k20Var.q1;
        if (tj0Var2 != null) {
            tj0Var2.f();
            if (cv0Var != null && k20Var.q1.b() == 0 && k20Var.Y1) {
                cv0Var.e(false, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0d02  */
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
        qq qqVar;
        pq pqVar;
        long B1;
        int i10;
        int i11;
        String[] strArr;
        String lowerCase;
        boolean z13;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z14;
        r1.g gVar;
        final jt0 jt0Var;
        float f10;
        r1.g gVar2;
        int i12 = 5;
        int i13 = -1;
        int i14 = 2;
        int i15 = 1;
        int i16 = 0;
        switch (this.a) {
            case 0:
                TLObject tLObject = (TLObject) this.b;
                g6 g6Var = (g6) this.c;
                i6 i6Var = (i6) this.d;
                TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) this.e;
                j6.A--;
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
                                i6Var.G = tL_theme2;
                                i6Var.H = false;
                                i6Var.h0 = null;
                                i6Var.i0 = null;
                                ns.f(i6Var.F).b(i6Var, ns.Y1);
                                ns.f(i6Var.F).b(i6Var, ns.Z1);
                                w7 G = w7.G(i6Var.F);
                                TLRPC.TL_theme tL_theme3 = i6Var.G;
                                z11 = true;
                                G.W(tL_theme3.document, tL_theme3, 1, 1);
                            }
                            z10 = z11;
                        }
                    } else {
                        if (i6.a(g6Var, themeSettings)) {
                            z12 = false;
                        } else {
                            File e10 = g6Var.e();
                            if (e10 != null) {
                                e10.delete();
                            }
                            i6.i(g6Var, themeSettings);
                            i6 i6Var2 = j6.I;
                            if (i6Var2 == i6Var && i6Var2.Z == g6Var.a) {
                                j6.t1(false, false);
                                j6.K(org.telegram.messenger.t0.b, false);
                                i6 i6Var3 = j6.I;
                                j6.K1(i6Var3, j6.J == i6Var3, -1, null);
                            }
                            d6.a(true);
                            z12 = true;
                        }
                        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                        g6Var.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                        z10 = z12;
                    }
                    if (j6.A != 0) {
                        j6.B = (int) (System.currentTimeMillis() / 1000);
                        j6.y1(z10, false);
                        break;
                    }
                }
                z10 = false;
                if (j6.A != 0) {
                }
                break;
            case 1:
                ((bi.w2) this.b).a(j6.T0((File) this.c, (String) this.d, (String[]) this.e));
                break;
            case 2:
                org.telegram.ui.q6 q6Var = (org.telegram.ui.q6) this.b;
                ai.k0 k0Var = (ai.k0) this.c;
                float[] fArr = (float[]) this.d;
                boolean[] zArr = (boolean[]) this.e;
                q6Var.getClass();
                k0Var.f(fArr[0]);
                if (zArr[0]) {
                    q6Var.d.A0(true);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.q6 q6Var2 = (org.telegram.ui.q6) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                long[] jArr = (long[]) this.d;
                org.telegram.ui.p6 p6Var = (org.telegram.ui.p6) this.e;
                if (!zArr2[0]) {
                    jArr[0] = System.currentTimeMillis();
                    q6Var2.d.showDialog(p6Var);
                    break;
                }
                break;
            case 4:
                i8.Z((i8) this.c, (TLRPC.TL_error) this.d, (TLObject) this.b, (Calendar) this.e);
                break;
            case 5:
                la.Z((la) this.b, (t1) this.c, (TLRPC.TL_error) this.d, (TL_account.updateUsername) this.e);
                break;
            case 6:
                an anVar = (an) this.b;
                e2 e2Var = (e2) this.c;
                gj gjVar = (gj) this.d;
                o4 o4Var = (o4) this.e;
                if (e2Var instanceof is) {
                    i7 = 4;
                    anVar.getNotificationCenter().n((is) e2Var, 4);
                } else {
                    i7 = 4;
                }
                anVar.getNotificationCenter().k(i7, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", gjVar.k.action.channel_id);
                ((ActionBarLayout) o4Var).c(o4Var.getFragmentStack().size() - 1, new an(bundle));
                e2Var.finishFragment();
                break;
            case 7:
                an anVar2 = (an) this.c;
                vf.b bVar = (vf.b) this.d;
                TLObject tLObject2 = (TLObject) this.b;
                di.i2 i2Var = (di.i2) this.e;
                bVar.b();
                if (tLObject2 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                    anVar2.getMessagesController().Y3(tL_contacts_resolvedPeer.users, false);
                    anVar2.getMessagesController().S3(tL_contacts_resolvedPeer.chats, false);
                    long o4 = org.telegram.messenger.m5.o(tL_contacts_resolvedPeer.peer);
                    if (o4 >= 0) {
                        user = anVar2.getMessagesController().a2(Long.valueOf(o4));
                        i2Var.a(user);
                        break;
                    }
                }
                user = null;
                i2Var.a(user);
            case 8:
                long[] jArr2 = (long[]) this.b;
                boolean[] zArr3 = (boolean[]) this.c;
                ImageView imageView = (ImageView) this.d;
                ImageView imageView2 = (ImageView) this.e;
                jArr2[0] = SystemClock.elapsedRealtime();
                if (!zArr3[0]) {
                    imageView = imageView2;
                }
                dr drVar = (dr) imageView.getDrawable();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new org.telegram.ui.a3(drVar, 4));
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(er.f);
                ofFloat.start();
                break;
            case 9:
                an anVar3 = (an) this.b;
                gj gjVar2 = (gj) this.c;
                t1 t1Var = (t1) this.d;
                boolean[] zArr4 = (boolean[]) this.e;
                try {
                    tL_webPage = q80.g(gjVar2);
                    th2 = null;
                } catch (Throwable th3) {
                    a8.g(th3, true);
                    th2 = th3;
                    tL_webPage = null;
                }
                org.telegram.messenger.g0.h3(new di.m3(anVar3, t1Var, zArr4, th2 == null && tL_webPage != null, gjVar2, tL_webPage));
                break;
            case 10:
                an anVar4 = (an) this.c;
                TLObject tLObject3 = (TLObject) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                vr vrVar = (vr) this.e;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                if (tL_error != null || messages_messages.messages.isEmpty()) {
                    if (messages_messages != null) {
                        anVar4.C6 = messages_messages.count;
                    } else {
                        anVar4.C6 = 0;
                    }
                    vrVar.a.c(new uq(vrVar, anVar4.b(), anVar4.k6, anVar4.C6, 7));
                    int i17 = anVar4.C6;
                    if (i17 == 0) {
                        anVar4.D6 = true;
                        anVar4.rc(false);
                        break;
                    } else {
                        anVar4.y1.c(2, i17, true);
                        anVar4.ka();
                        break;
                    }
                } else {
                    int i18 = messages_messages.messages.get(0).id;
                    gj gjVar3 = (gj) anVar4.F6[0].get(i18);
                    vrVar.a.c(new wp(vrVar, i18, anVar4.k6, 4));
                    if (gjVar3 != null) {
                        TLRPC.Message message = gjVar3.k;
                        message.media_unread = true;
                        message.mentioned = true;
                    }
                    anVar4.l(i18, 0, false, 0, true, 0);
                    break;
                }
                break;
            case 11:
                an.T0((an) this.b, (TLRPC.TL_messageMediaWebPage) this.c, (TLRPC.TL_webPageAttributeStory) this.d, (org.telegram.ui.n6) this.e);
                break;
            case 12:
                to.b0((to) this.b, (t1[]) this.c, (TLRPC.Chat) this.d, (e2) this.e);
                break;
            case 13:
                mp mpVar = (mp) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject4 = (TLObject) this.b;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.e;
                mpVar.getClass();
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject4;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.r0(password);
                    mpVar.u0(twoStepVerificationActivity.q0(), twoStepVerificationActivity);
                    break;
                }
                break;
            case 14:
                qq qqVar2 = (qq) this.c;
                TLObject tLObject5 = (TLObject) this.b;
                TLRPC.User user2 = (TLRPC.User) this.d;
                vp vpVar = (vp) this.e;
                if (!(tLObject5 instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject5 instanceof TLRPC.TL_chatParticipantAdmin)) {
                    vpVar.a(1);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qqVar2.getParentActivity());
                    alertDialog$Builder.a.S = hd.M0(R.string.AppName, "AppName");
                    alertDialog$Builder.a.U = hd.a0(null, null, 2131754350, q10.p(user2));
                    alertDialog$Builder.k(hd.M0(2131747831, "OK"), new org.telegram.ui.w0(vpVar, 26));
                    alertDialog$Builder.h(hd.M0(2131752589, "Cancel"), null);
                    qqVar2.showDialog(alertDialog$Builder.a);
                    break;
                }
                break;
            case 15:
                pq pqVar2 = (pq) this.b;
                String str5 = (String) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                qq qqVar3 = pqVar2.E;
                String lowerCase2 = str5.trim().toLowerCase();
                if (lowerCase2.length() == 0) {
                    org.telegram.messenger.g0.h3(new hp(pqVar2, new ArrayList(), new a0.h(), new ArrayList(), new ArrayList(), 1));
                    break;
                } else {
                    String S0 = hd.E0().S0(lowerCase2, true, false);
                    if (lowerCase2.equals(S0) || S0.length() == 0) {
                        S0 = null;
                    }
                    int i19 = (S0 != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i19];
                    strArr2[0] = lowerCase2;
                    if (S0 != null) {
                        strArr2[1] = S0;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    a0.h hVar = new a0.h();
                    ArrayList arrayList4 = new ArrayList();
                    String[] strArr3 = strArr2;
                    ArrayList arrayList5 = new ArrayList();
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i20 = 0;
                        while (i20 < size) {
                            TLObject tLObject6 = (TLObject) arrayList.get(i20);
                            ArrayList arrayList6 = arrayList;
                            if (tLObject6 instanceof TLRPC.ChatParticipant) {
                                qqVar = qqVar3;
                                pqVar = pqVar2;
                                B1 = ((TLRPC.ChatParticipant) tLObject6).user_id;
                            } else {
                                qqVar = qqVar3;
                                pqVar = pqVar2;
                                if (tLObject6 instanceof TLRPC.ChannelParticipant) {
                                    B1 = gj.B1(((TLRPC.ChannelParticipant) tLObject6).peer);
                                }
                                strArr = strArr3;
                                i11 = size;
                                i10 = i20;
                                i20 = i10 + 1;
                                arrayList = arrayList6;
                                qqVar3 = qqVar;
                                pqVar2 = pqVar;
                                strArr3 = strArr;
                                size = i11;
                            }
                            if (B1 > 0) {
                                TLRPC.User a22 = qqVar.getMessagesController().a2(Long.valueOf(B1));
                                if (a22.id != qqVar.getUserConfig().e()) {
                                    String lowerCase3 = q10.p(a22).toLowerCase();
                                    String n10 = q10.n(a22);
                                    String str6 = a22.first_name;
                                    i11 = size;
                                    str3 = a22.last_name;
                                    str = str6;
                                    lowerCase = lowerCase3;
                                    strArr = strArr3;
                                    str2 = n10;
                                    z13 = false;
                                }
                                strArr = strArr3;
                                i11 = size;
                                i10 = i20;
                                i20 = i10 + 1;
                                arrayList = arrayList6;
                                qqVar3 = qqVar;
                                pqVar2 = pqVar;
                                strArr3 = strArr;
                                size = i11;
                            } else {
                                TLRPC.Chat M0 = qqVar.getMessagesController().M0(Long.valueOf(-B1));
                                lowerCase = M0.title.toLowerCase();
                                z13 = false;
                                String K = org.telegram.messenger.t3.K(M0, false);
                                str = M0.title;
                                strArr = strArr3;
                                str2 = K;
                                i11 = size;
                                str3 = null;
                            }
                            i10 = i20;
                            String S02 = hd.E0().S0(lowerCase, true, z13);
                            if (lowerCase.equals(S02)) {
                                S02 = null;
                            }
                            boolean z15 = false;
                            int i21 = 0;
                            while (true) {
                                if (i21 < i19) {
                                    boolean z16 = z15;
                                    String str7 = strArr[i21];
                                    if (lowerCase.startsWith(str7) || i5.c.A(" ", str7, lowerCase) || (S02 != null && (S02.startsWith(str7) || i5.c.A(" ", str7, S02)))) {
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
                                            arrayList4.add(org.telegram.messenger.g0.r0(str, str3, str7));
                                        } else {
                                            arrayList4.add(org.telegram.messenger.g0.r0(r.b.k("@", str2), null, "@" + str7));
                                        }
                                        arrayList5.add(tLObject6);
                                    } else {
                                        i21++;
                                        z15 = z14;
                                        lowerCase = str4;
                                    }
                                }
                            }
                            i20 = i10 + 1;
                            arrayList = arrayList6;
                            qqVar3 = qqVar;
                            pqVar2 = pqVar;
                            strArr3 = strArr;
                            size = i11;
                        }
                    }
                    qq qqVar4 = qqVar3;
                    pq pqVar3 = pqVar2;
                    String[] strArr4 = strArr3;
                    if (arrayList2 != null) {
                        for (int i22 = 0; i22 < arrayList2.size(); i22++) {
                            TLRPC.User a23 = qqVar4.getMessagesController().a2(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i22)).user_id));
                            if (a23.id != qqVar4.getUserConfig().e()) {
                                String lowerCase4 = q10.p(a23).toLowerCase();
                                String S03 = hd.E0().S0(lowerCase4, true, false);
                                if (lowerCase4.equals(S03)) {
                                    S03 = null;
                                }
                                boolean z17 = false;
                                int i23 = 0;
                                while (true) {
                                    if (i23 < i19) {
                                        String str8 = strArr4[i23];
                                        if (lowerCase4.startsWith(str8) || i5.c.A(" ", str8, lowerCase4) || (S03 != null && (S03.startsWith(str8) || i5.c.A(" ", str8, S03)))) {
                                            z17 = true;
                                        } else {
                                            String n11 = q10.n(a23);
                                            if (n11 != null && n11.startsWith(str8)) {
                                                z17 = 2;
                                            }
                                        }
                                        if (z17) {
                                            if (z17) {
                                                arrayList4.add(org.telegram.messenger.g0.r0(a23.first_name, a23.last_name, str8));
                                            } else {
                                                arrayList4.add(org.telegram.messenger.g0.r0("@" + q10.n(a23), null, "@" + str8));
                                            }
                                            arrayList3.add(a23);
                                            hVar.k(a23, a23.id);
                                        } else {
                                            i23++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    org.telegram.messenger.g0.h3(new hp(pqVar3, arrayList3, hVar, arrayList4, arrayList5, 1));
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Components.d0 d0Var = (org.telegram.ui.Components.d0) this.b;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.c;
                Context context = (Context) this.d;
                e6 e6Var = (e6) this.e;
                String str9 = "https://t.me/addstyle/" + tL_aiComposeTone.slug;
                new org.telegram.ui.Components.l(d0Var, context, str9, str9, e6Var).show();
                break;
            case 17:
                org.telegram.ui.Components.s4 s4Var = (org.telegram.ui.Components.s4) this.b;
                ai.u2 u2Var = (ai.u2) this.c;
                t1[] t1VarArr = (t1[]) this.d;
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
                    u2Var.a(lowerCase5);
                    t1 t1Var2 = t1VarArr[0];
                    if (t1Var2 != null) {
                        t1Var2.dismiss();
                    }
                    if (view != null) {
                        view.requestFocus();
                        break;
                    }
                } else {
                    org.telegram.messenger.g0.E3(s4Var);
                    break;
                }
                break;
            case 18:
                int[] iArr = (int[]) this.b;
                int[] iArr2 = (int[]) this.c;
                String[] strArr5 = (String[]) this.d;
                TextView textView = (TextView) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) hd.M0(2131748506, null));
                spannableStringBuilder.append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                int i24 = 0;
                while (true) {
                    if (i24 < iArr.length) {
                        if (iArr2[0] == iArr[i24]) {
                            spannableStringBuilder.append((CharSequence) strArr5[i24]);
                            spannableStringBuilder.setSpan(new y31(org.telegram.messenger.g0.o()), length, spannableStringBuilder.length(), 33);
                        } else {
                            i24++;
                        }
                    }
                }
                spannableStringBuilder.append((CharSequence) " v");
                if (m10.i(m10.t0).q()) {
                    eq eqVar = new eq(R.drawable.arrows_select, 0);
                    eqVar.H = 0.7f;
                    float L = org.telegram.messenger.g0.L(-1.33f);
                    float L2 = org.telegram.messenger.g0.L(0.0f);
                    eqVar.r = L;
                    eqVar.s = L2;
                    eqVar.x = 0.75f;
                    spannableStringBuilder.setSpan(eqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                } else {
                    eq eqVar2 = new eq(R.drawable.mini_switch_lock, 0);
                    eqVar2.H = 0.7f;
                    float L3 = org.telegram.messenger.g0.L(-1.33f);
                    float L4 = org.telegram.messenger.g0.L(0.0f);
                    eqVar2.r = L3;
                    eqVar2.s = L4;
                    eqVar2.x = 0.75f;
                    spannableStringBuilder.setSpan(eqVar2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                }
                textView.setText(spannableStringBuilder);
                break;
            case 19:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                Boolean bool = (Boolean) this.c;
                Integer num = (Integer) this.d;
                Integer num2 = (Integer) this.e;
                int i25 = ChatActivityEnterView.N6;
                chatActivityEnterView.getClass();
                chatActivityEnterView.k1(bool.booleanValue(), num.intValue(), num2.intValue(), 0L, true);
                break;
            case 20:
                final ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.b;
                jt0 jt0Var2 = (jt0) this.c;
                int[] iArr3 = (int[]) this.d;
                en0 en0Var = (en0) this.e;
                r1.b bVar2 = r1.g.r;
                r1.b bVar3 = r1.g.q;
                int[] iArr4 = chatActivityEnterView2.v3;
                if (chatActivityEnterView2.r0 != null) {
                    final Dialog dialog = new Dialog(chatActivityEnterView2.getContext(), R.style.TransparentDialogNoAnimation);
                    FrameLayout frameLayout = new FrameLayout(chatActivityEnterView2.getContext());
                    frameLayout.addView(jt0Var2, ja.e(40, 40, 3));
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
                    org.telegram.messenger.g0.q3(dialog, j6.x0(null, j6.s8, true) == -1);
                    if (Build.VERSION.SDK_INT >= 26) {
                        org.telegram.messenger.g0.n3(dialog, org.telegram.messenger.g0.B(j6.x0(null, j6.a7, true)) >= 0.721f);
                    }
                    chatActivityEnterView2.t0 = chatActivityEnterView2.getRootWindowInsets().getSystemWindowInsetLeft() + chatActivityEnterView2.t0;
                    chatActivityEnterView2.q0.getLocationInWindow(iArr4);
                    float f11 = iArr4[0];
                    final float f12 = iArr4[1];
                    float L5 = org.telegram.messenger.g0.L(5.0f);
                    float L6 = iArr3[0] + chatActivityEnterView2.t0 + L5 + org.telegram.messenger.g0.L(4.0f) + 0.0f;
                    float f13 = iArr3[1] + chatActivityEnterView2.u0 + L5 + 0.0f;
                    jt0Var2.setTranslationX(L6);
                    jt0Var2.setTranslationY(f13);
                    float scaleX = (chatActivityEnterView2.q0.getLayoutParams().width * (chatActivityEnterView2.K6 ? chatActivityEnterView2.q0.getScaleX() : 1.0f)) / org.telegram.messenger.g0.L(40.0f);
                    jt0Var2.setPivotX(0.0f);
                    jt0Var2.setPivotY(0.0f);
                    jt0Var2.setScaleX(0.75f);
                    jt0Var2.setScaleY(0.75f);
                    jt0Var2.getViewTreeObserver().addOnDrawListener(new pe(jt0Var2, en0Var));
                    dialog.show();
                    if (!chatActivityEnterView2.K6) {
                        chatActivityEnterView2.q0.setScaleX(1.0f);
                        chatActivityEnterView2.q0.setScaleY(1.0f);
                    }
                    chatActivityEnterView2.q0.setAlpha(1.0f);
                    oe oeVar = chatActivityEnterView2.r0;
                    if (chatActivityEnterView2.K6) {
                        jt0Var = jt0Var2;
                        gVar = null;
                    } else {
                        jt0Var = jt0Var2;
                        gVar = new r1.g(chatActivityEnterView2.q0, bVar3);
                        gVar.m = org.telegram.ui.Cells.y0.n(0.5f, 750.0f, 1.0f);
                    }
                    if (chatActivityEnterView2.K6) {
                        f10 = f11;
                        gVar2 = null;
                    } else {
                        f10 = f11;
                        r1.g gVar3 = new r1.g(chatActivityEnterView2.q0, bVar2);
                        gVar3.m = org.telegram.ui.Cells.y0.n(0.5f, 750.0f, 1.0f);
                        gVar2 = gVar3;
                    }
                    r1.g gVar4 = new r1.g(chatActivityEnterView2.q0, r1.g.v);
                    gVar4.m = org.telegram.ui.Cells.y0.n(0.0f, 750.0f, 1.0f);
                    final float f14 = f10;
                    final int i26 = 0;
                    r1.c cVar = new r1.c() { // from class: org.telegram.ui.Components.dd
                        @Override // r1.c
                        public final void a(r1.g gVar5, boolean z18, float f15, float f16) {
                            int i27 = i26;
                            float f17 = f12;
                            float f18 = f14;
                            jt0 jt0Var3 = jt0Var;
                            Dialog dialog2 = dialog;
                            ChatActivityEnterView chatActivityEnterView3 = chatActivityEnterView2;
                            switch (i27) {
                                case 0:
                                    int i28 = ChatActivityEnterView.N6;
                                    if (dialog2.isShowing()) {
                                        jt0Var3.setTranslationX(f18);
                                        jt0Var3.setTranslationY(f17);
                                        gn0 gn0Var = chatActivityEnterView3.q0;
                                        gn0Var.getClass();
                                        gn0Var.a(false, false, 0.0f);
                                        if (!chatActivityEnterView3.K6) {
                                            chatActivityEnterView3.q0.setScaleX(1.0f);
                                            chatActivityEnterView3.q0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView3.q0.setAlpha(1.0f);
                                        chatActivityEnterView3.q0.getViewTreeObserver().addOnPreDrawListener(new qe(chatActivityEnterView3, dialog2, 0));
                                        break;
                                    }
                                    break;
                                default:
                                    int i29 = ChatActivityEnterView.N6;
                                    if (dialog2.isShowing()) {
                                        jt0Var3.setTranslationX(f18);
                                        jt0Var3.setTranslationY(f17);
                                        gn0 gn0Var2 = chatActivityEnterView3.q0;
                                        gn0Var2.getClass();
                                        gn0Var2.a(false, false, 0.0f);
                                        if (!chatActivityEnterView3.K6) {
                                            chatActivityEnterView3.q0.setScaleX(1.0f);
                                            chatActivityEnterView3.q0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView3.q0.setAlpha(1.0f);
                                        chatActivityEnterView3.q0.getViewTreeObserver().addOnPreDrawListener(new qe(chatActivityEnterView3, dialog2, 1));
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    jt0 jt0Var3 = jt0Var;
                    gVar4.a(cVar);
                    r1.g gVar5 = new r1.g(jt0Var3, r1.g.o);
                    gVar5.b = i9.a(L6, f14 - org.telegram.messenger.g0.L(6.0f), L6);
                    gVar5.c = true;
                    gVar5.m = org.telegram.ui.Cells.y0.n(f14, 700.0f, 0.75f);
                    gVar5.h = f14 - org.telegram.messenger.g0.L(6.0f);
                    r1.g gVar6 = new r1.g(jt0Var3, r1.g.p);
                    gVar6.b = i9.a(f13, f13, org.telegram.messenger.g0.L(6.0f) + f12);
                    gVar6.c = true;
                    gVar6.m = org.telegram.ui.Cells.y0.n(f12, 700.0f, 0.75f);
                    gVar6.g = org.telegram.messenger.g0.L(6.0f) + f12;
                    gVar6.b(new re(f12, jt0Var3));
                    final int i27 = 1;
                    gVar6.a(new r1.c() { // from class: org.telegram.ui.Components.dd
                        @Override // r1.c
                        public final void a(r1.g gVar52, boolean z18, float f15, float f16) {
                            int i272 = i27;
                            float f17 = f12;
                            float f18 = f14;
                            jt0 jt0Var32 = jt0Var;
                            Dialog dialog2 = dialog;
                            ChatActivityEnterView chatActivityEnterView3 = chatActivityEnterView2;
                            switch (i272) {
                                case 0:
                                    int i28 = ChatActivityEnterView.N6;
                                    if (dialog2.isShowing()) {
                                        jt0Var32.setTranslationX(f18);
                                        jt0Var32.setTranslationY(f17);
                                        gn0 gn0Var = chatActivityEnterView3.q0;
                                        gn0Var.getClass();
                                        gn0Var.a(false, false, 0.0f);
                                        if (!chatActivityEnterView3.K6) {
                                            chatActivityEnterView3.q0.setScaleX(1.0f);
                                            chatActivityEnterView3.q0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView3.q0.setAlpha(1.0f);
                                        chatActivityEnterView3.q0.getViewTreeObserver().addOnPreDrawListener(new qe(chatActivityEnterView3, dialog2, 0));
                                        break;
                                    }
                                    break;
                                default:
                                    int i29 = ChatActivityEnterView.N6;
                                    if (dialog2.isShowing()) {
                                        jt0Var32.setTranslationX(f18);
                                        jt0Var32.setTranslationY(f17);
                                        gn0 gn0Var2 = chatActivityEnterView3.q0;
                                        gn0Var2.getClass();
                                        gn0Var2.a(false, false, 0.0f);
                                        if (!chatActivityEnterView3.K6) {
                                            chatActivityEnterView3.q0.setScaleX(1.0f);
                                            chatActivityEnterView3.q0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView3.q0.setAlpha(1.0f);
                                        chatActivityEnterView3.q0.getViewTreeObserver().addOnPreDrawListener(new qe(chatActivityEnterView3, dialog2, 1));
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    r1.g gVar7 = new r1.g(jt0Var3, bVar3);
                    gVar7.m = org.telegram.ui.Cells.y0.n(scaleX, 1000.0f, 1.0f);
                    r1.g gVar8 = new r1.g(jt0Var3, bVar2);
                    gVar8.m = org.telegram.ui.Cells.y0.n(scaleX, 1000.0f, 1.0f);
                    oeVar.l(gVar, gVar2, gVar4, gVar5, gVar6, gVar7, gVar8);
                    break;
                }
                break;
            case 21:
                gf gfVar = (gf) this.b;
                FrameLayout frameLayout2 = (FrameLayout) this.c;
                View view2 = (View) this.d;
                g7 g7Var = (g7) this.e;
                ChatActivityEnterView chatActivityEnterView3 = gfVar.a;
                int i28 = ChatActivityEnterView.N6;
                ai.n0 o02 = chatActivityEnterView3.o0();
                ef efVar = new ef(gfVar, frameLayout2, i15);
                org.telegram.ui.Components.q2 q2Var = new org.telegram.ui.Components.q2(g7Var, i14);
                df dfVar = new df(i16, frameLayout2);
                o02.g();
                Context context2 = o02.h;
                e6 e6Var2 = o02.n;
                bi.x0 x0Var = new bi.x0(context2, view2, e6Var2, efVar);
                int[] iArr5 = new int[2];
                view2.getLocationInWindow(iArr5);
                x0Var.R = iArr5[1] > org.telegram.messenger.g0.q.y / 2;
                x0Var.K = org.telegram.messenger.g0.L(ns.x3);
                x0Var.J = 0;
                x0Var.f = org.telegram.messenger.g0.L(ns.P4);
                int w02 = j6.w0(j6.G6, e6Var2);
                ArrayList y10 = o02.y();
                int size2 = y10.size();
                while (i16 < size2) {
                    Object obj = y10.get(i16);
                    i16++;
                    ai.h hVar2 = (ai.h) obj;
                    x0Var.a(new ai.m0(o02.h, hVar2, w02, o02.f.b.R, false), 44, new a1.e(16, q2Var, hVar2));
                }
                x0Var.setFocusableInTouchMode(true);
                x0Var.setOnKeyListener(new ai.e0(2, x0Var));
                x0Var.P = dfVar;
                frameLayout2.addView(x0Var, new FrameLayout.LayoutParams(-1, -1));
                x0Var.requestFocus();
                x0Var.f();
                break;
            case 22:
                a();
                break;
            case 23:
                ix ixVar = (ix) this.c;
                t1[] t1VarArr2 = (t1[]) this.d;
                TLObject tLObject7 = (TLObject) this.b;
                ou ouVar = (ou) this.e;
                try {
                    t1VarArr2[0].dismiss();
                } catch (Throwable unused) {
                }
                t1VarArr2[0] = null;
                if (tLObject7 instanceof TLRPC.TL_emojiURL) {
                    vf.c.t(((lx) ixVar.c.b).G.getContext(), ((TLRPC.TL_emojiURL) tLObject7).url);
                    ((u2) ouVar.b).y0.run();
                    break;
                }
                break;
            case 24:
                fy fyVar = (fy) this.c;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) this.d;
                TLObject tLObject8 = (TLObject) this.b;
                Runnable runnable = (Runnable) this.e;
                ArrayList arrayList7 = fyVar.s;
                gy gyVar = fyVar.x;
                if (gyVar.N == fyVar.b) {
                    gyVar.M = 0;
                    if (tL_messages_getStickers.emoticon.equals(fyVar.a)) {
                        if (!(tLObject8 instanceof TLRPC.TL_messages_stickers)) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject8;
                            int size3 = arrayList7.size();
                            int size4 = tL_messages_stickers.stickers.size();
                            while (i16 < size4) {
                                TLRPC.Document document2 = tL_messages_stickers.stickers.get(i16);
                                if (fyVar.w.indexOfKey(document2.id) < 0) {
                                    arrayList7.add(document2);
                                }
                                i16++;
                            }
                            if (size3 != arrayList7.size()) {
                                fyVar.f.put(arrayList7, gyVar.O);
                                if (size3 == 0) {
                                    fyVar.h.add(arrayList7);
                                }
                            }
                        }
                    }
                    runnable.run();
                    break;
                }
                break;
            case 25:
                zz zzVar = (zz) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject9 = (TLObject) this.b;
                z10 z10Var = (z10) this.e;
                zzVar.v2 = -1;
                e2 e2Var2 = zzVar.s1;
                hz.x0(tL_error3, e2Var2, cc.a0(e2Var2));
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
                                if (i16 < arrayList8.size()) {
                                    if (arrayList8.get(i16) instanceof TL_update.TL_updateDialogFilter) {
                                        i13 = ((TL_update.TL_updateDialogFilter) arrayList8.get(i16)).id;
                                    } else {
                                        i16++;
                                    }
                                }
                            }
                        }
                    }
                    if (zzVar.V1 instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        e2Var2.getMessagesController().c3(true, new bi.w2(zzVar, z10Var, i13, i12));
                        break;
                    } else {
                        if (zzVar.W1 != null) {
                            e2Var2.getMessagesController().H(zzVar.U1, true);
                        }
                        zzVar.w2 = true;
                        zzVar.dismiss();
                        z10Var.a(Integer.valueOf(i13));
                        break;
                    }
                } else {
                    zzVar.h2.a(false);
                    break;
                }
            case 26:
                yw ywVar = (yw) this.b;
                Integer num3 = (Integer) this.c;
                gh ghVar = (gh) this.d;
                e2 e2Var3 = (e2) this.e;
                ywVar.I4(num3.intValue());
                org.telegram.messenger.g0.i3(new vs(13, ghVar, e2Var3), 200L);
                break;
            case 27:
                b();
                break;
            case 28:
                e70 e70Var = (e70) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                TLRPC.Updates updates2 = (TLRPC.Updates) this.d;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.e;
                e2 e2Var4 = e70Var.o1;
                if (e2Var4 != null && e2Var4.getParentActivity() != null) {
                    if (tL_error4 != null) {
                        "USER_ALREADY_PARTICIPANT".equals(tL_error4.text);
                        org.telegram.ui.Components.t4.c0(e70Var.a, tL_error4, e2Var4, tL_messages_importChatInvite, new Object[0]);
                        break;
                    } else if (updates2 != null && !updates2.chats.isEmpty()) {
                        TLRPC.Chat chat = updates2.chats.get(0);
                        chat.left = false;
                        chat.kicked = false;
                        np.s1(e70Var.a).Y3(updates2.users, false);
                        np.s1(e70Var.a).S3(updates2.chats, false);
                        long j3 = chat.id;
                        boolean z18 = !org.telegram.messenger.t3.V(chat);
                        e70Var.getClass();
                        Bundle j10 = a8.p0.j(j3, "chat_id");
                        np s12 = np.s1(e70Var.a);
                        e2 e2Var5 = e70Var.o1;
                        if (s12.E(j10, e2Var5, null, null)) {
                            e2Var5.presentFragment(new d70(e70Var, j10, z18, j3), e2Var5 instanceof an);
                            break;
                        }
                    }
                }
                break;
            default:
                t70 t70Var = (t70) this.c;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.d;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.e;
                TLObject tLObject10 = (TLObject) this.b;
                t70Var.E = false;
                t70Var.M = tL_chatInviteExported.link;
                if (tL_error5 == null) {
                    TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject10;
                    if (tL_chatInviteExported.importers == null) {
                        tL_chatInviteExported.importers = new ArrayList<>(3);
                    }
                    tL_chatInviteExported.importers.clear();
                    while (i16 < tL_messages_chatInviteImporters.users.size()) {
                        tL_chatInviteExported.importers.addAll(tL_messages_chatInviteImporters.users);
                        i16++;
                    }
                    t70Var.d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, true);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ l5(Object obj, Object obj2, TLObject tLObject, Object obj3, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = tLObject;
        this.e = obj3;
    }

    public /* synthetic */ l5(e2 e2Var, TLObject tLObject, TLObject tLObject2, Object obj, int i7) {
        this.a = i7;
        this.c = e2Var;
        this.b = tLObject;
        this.d = tLObject2;
        this.e = obj;
    }

    public /* synthetic */ l5(t70 t70Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject) {
        this.a = 29;
        this.c = t70Var;
        this.d = tL_chatInviteExported;
        this.e = tL_error;
        this.b = tLObject;
    }
}
